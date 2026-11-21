package com.fflashtv.player.netlimit

import android.content.Context
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import okhttp3.Call
import okhttp3.Connection
import okhttp3.ConnectionPool
import okhttp3.Dispatcher
import okhttp3.EventListener
import okhttp3.OkHttpClient
import java.io.IOException
import java.net.InetAddress
import java.net.Socket
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.TimeUnit
import javax.net.SocketFactory

object ConnectionAuditLog {
    private val timeFmt = SimpleDateFormat("HH:mm:ss.SSS", Locale.US)
    private val _entries = MutableStateFlow<List<String>>(emptyList())
    val entries: StateFlow<List<String>> = _entries.asStateFlow()

    @Synchronized
    fun log(tag: String, message: String) {
        val ts = timeFmt.format(Date())
        val line = "[$ts] [$tag] $message"
        _entries.value = (_entries.value + line).takeLast(120)
    }

    @Synchronized
    fun clear() {
        _entries.value = emptyList()
    }
}

object ActiveSocketRegistry {
    private val sockets = ConcurrentHashMap.newKeySet<Socket>()
    private val _activeCount = MutableStateFlow(0)
    val activeCount: StateFlow<Int> = _activeCount.asStateFlow()

    fun register(socket: Socket) {
        pruneClosed()
        sockets.add(socket)
        _activeCount.value = sockets.size
        ConnectionAuditLog.log("Socket", "Opened socket (active=${sockets.size})")
    }

    fun pruneClosed() {
        val removed = sockets.removeIf { it.isClosed }
        if (removed) {
            _activeCount.value = sockets.size
        }
    }

    fun killAll(reason: String) {
        var closed = 0
        val snapshot = sockets.toList()
        for (s in snapshot) {
            runCatching {
                if (!s.isClosed) {
                    s.close()
                    closed++
                }
            }
            sockets.remove(s)
        }
        _activeCount.value = sockets.size
        if (closed > 0 || snapshot.isNotEmpty()) {
            ConnectionAuditLog.log("SocketKill", "Killed $closed/${snapshot.size} sockets ($reason)")
        }
    }
}

class InstantKillSocketFactory : SocketFactory() {
    private val delegate = getDefault()

    private fun track(socket: Socket): Socket {
        ActiveSocketRegistry.register(socket)
        return socket
    }

    override fun createSocket(): Socket = track(delegate.createSocket())
    override fun createSocket(host: String?, port: Int): Socket = track(delegate.createSocket(host, port))
    override fun createSocket(host: String?, port: Int, localHost: InetAddress?, localPort: Int): Socket =
        track(delegate.createSocket(host, port, localHost, localPort))
    override fun createSocket(host: InetAddress?, port: Int): Socket = track(delegate.createSocket(host, port))
    override fun createSocket(address: InetAddress?, port: Int, localAddress: InetAddress?, localPort: Int): Socket =
        track(delegate.createSocket(address, port, localAddress, localPort))
}

class ConnectionLimitManager private constructor(context: Context) {

    private val prefs = context.applicationContext.getSharedPreferences("fflashtv_netlimit", Context.MODE_PRIVATE)
    private val _enabled = MutableStateFlow(prefs.getBoolean("limit_enabled", false))
    val isEnabledFlow: StateFlow<Boolean> = _enabled.asStateFlow()

    val isEnabled: Boolean
        get() = _enabled.value

    private val streamDispatcher = Dispatcher().apply {
        maxRequests = 4
        maxRequestsPerHost = 1
    }

    val strictStreamClient: OkHttpClient by lazy {
        OkHttpClient.Builder()
            .connectTimeout(5, TimeUnit.SECONDS)
            .readTimeout(8, TimeUnit.SECONDS)
            .retryOnConnectionFailure(false)
            .followRedirects(true)
            .followSslRedirects(true)
            .connectionPool(ConnectionPool(0, 1, TimeUnit.MILLISECONDS))
            .dispatcher(streamDispatcher)
            .socketFactory(InstantKillSocketFactory())
            .eventListener(object : EventListener() {
                override fun connectionReleased(call: Call, connection: Connection) {
                    ActiveSocketRegistry.pruneClosed()
                }
                override fun callEnd(call: Call) {
                    ActiveSocketRegistry.pruneClosed()
                }
                override fun callFailed(call: Call, ioe: IOException) {
                    ActiveSocketRegistry.pruneClosed()
                }
            })
            .addInterceptor { chain ->
                val req = chain.request().newBuilder()
                    .header("Connection", "close")
                    .build()
                ConnectionAuditLog.log("HTTP", "-> ${req.method} ${req.url.host}${req.url.encodedPath}")
                val resp = chain.proceed(req)
                val retryAfter = resp.header("Retry-After")
                if (retryAfter != null) {
                    ConnectionAuditLog.log("HTTP", "<- ${resp.code} (Retry-After: $retryAfter)")
                } else {
                    ConnectionAuditLog.log("HTTP", "<- ${resp.code} (${resp.header("Content-Type") ?: "stream"})")
                }
                resp
            }
            .build()
    }

    fun setEnabled(enabled: Boolean) {
        prefs.edit().putBoolean("limit_enabled", enabled).apply()
        _enabled.value = enabled
        ConnectionAuditLog.log("Mode", if (enabled) "تم تفعيل وضع حد الاتصالات" else "تم تعطيل وضع حد الاتصالات")
    }

    fun terminateActiveConnections(reason: String) {
        streamDispatcher.cancelAll()
        strictStreamClient.connectionPool.evictAll()
        ActiveSocketRegistry.killAll(reason)
    }

    companion object {
        @Volatile
        private var instance: ConnectionLimitManager? = null

        fun get(context: Context): ConnectionLimitManager {
            return instance ?: synchronized(this) {
                instance ?: ConnectionLimitManager(context).also { instance = it }
            }
        }
    }
}
