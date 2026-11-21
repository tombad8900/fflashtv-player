package com.fflashtv.player.network

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import java.security.SecureRandom
import java.security.cert.X509Certificate
import java.util.concurrent.TimeUnit
import javax.net.ssl.HostnameVerifier
import javax.net.ssl.SSLContext
import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager

object NetworkDefaults {
    const val DEFAULT_USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/151.0.0.0 Safari/537.36"
    const val CONNECT_TIMEOUT_SEC = 5L
    const val READ_TIMEOUT_SEC = 12L
}

class SessionHeaderStore {
    @Volatile
    private var headers: Map<String, String> = emptyMap()

    @Volatile
    private var userAgent: String = NetworkDefaults.DEFAULT_USER_AGENT

    fun update(headers: Map<String, String>, userAgent: String?) {
        this.headers = headers.toMap()
        this.userAgent = userAgent?.takeIf { it.isNotBlank() } ?: NetworkDefaults.DEFAULT_USER_AGENT
    }

    fun clear() {
        this.headers = emptyMap()
        this.userAgent = NetworkDefaults.DEFAULT_USER_AGENT
    }

    fun currentHeaders(): Map<String, String> = headers
    fun currentUserAgent(): String = userAgent
}

class HeaderInterceptor(
    private val headerStore: SessionHeaderStore
) : Interceptor {

    private val excludedHeaders = setOf(
        "host",
        "connection",
        "content-length",
        "range",
        "accept-encoding"
    )

    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val builder = original.newBuilder()

        val sessionHeaders = headerStore.currentHeaders()
        var hasUserAgent = false

        for ((rawKey, value) in sessionHeaders) {
            val lower = rawKey.trim().lowercase()
            if (lower.isEmpty() || lower in excludedHeaders) continue
            if (lower == "user-agent") hasUserAgent = true
            builder.header(rawKey.trim(), value)
        }

        if (!hasUserAgent && original.header("User-Agent") == null) {
            builder.header("User-Agent", headerStore.currentUserAgent())
        }

        return chain.proceed(builder.build())
    }
}

object TlsConfig {
    fun buildPermissiveClient(base: OkHttpClient): OkHttpClient {
        return try {
            val trustAll = object : X509TrustManager {
                override fun checkClientTrusted(chain: Array<out X509Certificate>?, authType: String?) {}
                override fun checkServerTrusted(chain: Array<out X509Certificate>?, authType: String?) {}
                override fun getAcceptedIssuers(): Array<X509Certificate> = emptyArray()
            }
            val sslContext = SSLContext.getInstance("TLS")
            sslContext.init(null, arrayOf<TrustManager>(trustAll), SecureRandom())
            base.newBuilder()
                .sslSocketFactory(sslContext.socketFactory, trustAll)
                .hostnameVerifier(HostnameVerifier { _, _ -> true })
                .build()
        } catch (_: Throwable) {
            base
        }
    }
}

class NetworkClient(
    val headerStore: SessionHeaderStore = SessionHeaderStore()
) {
    private val headerInterceptor = HeaderInterceptor(headerStore)

    val baseClient: OkHttpClient = OkHttpClient.Builder()
        .connectTimeout(NetworkDefaults.CONNECT_TIMEOUT_SEC, TimeUnit.SECONDS)
        .readTimeout(NetworkDefaults.READ_TIMEOUT_SEC, TimeUnit.SECONDS)
        .followRedirects(true)
        .followSslRedirects(true)
        .addInterceptor(headerInterceptor)
        .build()

    private val permissiveClient: OkHttpClient by lazy {
        TlsConfig.buildPermissiveClient(baseClient)
    }

    fun clientFor(allowInsecureTls: Boolean): OkHttpClient {
        return if (allowInsecureTls) permissiveClient else baseClient
    }
}
