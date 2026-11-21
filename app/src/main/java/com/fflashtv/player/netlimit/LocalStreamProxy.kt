package com.fflashtv.player.netlimit

import okhttp3.Call
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.InetAddress
import java.net.ServerSocket
import java.net.Socket
import java.net.URI
import java.net.URLDecoder
import java.net.URLEncoder
import java.util.concurrent.ConcurrentHashMap
import kotlin.concurrent.thread

class LocalStreamProxy(
    private val client: OkHttpClient
) {
    private var serverSocket: ServerSocket? = null
    @Volatile private var running = false
    private val activeCalls = ConcurrentHashMap.newKeySet<Call>()
    @Volatile private var rootUrl: String = ""
    @Volatile private var headers: Map<String, String> = emptyMap()

    @Synchronized
    fun startFor(url: String, headers: Map<String, String>): String {
        stopCurrentUpstream()
        this.rootUrl = url
        this.headers = headers.toMap()

        if (serverSocket == null || serverSocket?.isClosed == true) {
            serverSocket = ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"))
            running = true
            val srv = serverSocket!!
            thread(isDaemon = true, name = "SmartProxy-Local") {
                while (running && !srv.isClosed) {
                    val clientSock = runCatching { srv.accept() }.getOrNull() ?: break
                    thread(isDaemon = true) { handleClient(clientSock, srv.localPort) }
                }
            }
        }
        val port = serverSocket!!.localPort
        val isHls = url.substringBefore('?').endsWith(".m3u8", ignoreCase = true)
        val entry = if (isHls) "http://127.0.0.1:$port/stream.m3u8" else "http://127.0.0.1:$port/stream"
        ConnectionAuditLog.log("Proxy", "Listening on 127.0.0.1:$port -> ${url.take(60)}")
        return entry
    }

    private fun handleClient(sock: Socket, port: Int) {
        try {
            sock.use { s ->
                val reader = BufferedReader(InputStreamReader(s.getInputStream()))
                val reqLine = reader.readLine() ?: return
                while (true) {
                    val h = reader.readLine() ?: break
                    if (h.isEmpty()) break
                }

                val pathAndQuery = reqLine.split(" ").getOrNull(1) ?: "/stream"
                val upstreamUrl = resolveUpstreamUrl(pathAndQuery) ?: return

                val reqBuilder = Request.Builder().url(upstreamUrl).get()
                for ((k, v) in headers) {
                    val lower = k.trim().lowercase()
                    if (lower !in setOf("host", "connection", "content-length", "accept-encoding")) {
                        reqBuilder.header(k.trim(), v)
                    }
                }

                val call = client.newCall(reqBuilder.build())
                activeCalls.add(call)
                try {
                    call.execute().use { resp ->
                        val out = s.getOutputStream()
                        val ct = resp.header("Content-Type") ?: "application/octet-stream"
                        val finalUrl = resp.request.url.toString()
                        val isPlaylist = ct.contains("mpegurl", ignoreCase = true) ||
                            finalUrl.substringBefore('?').endsWith(".m3u8", ignoreCase = true)

                        if (isPlaylist) {
                            val rawText = resp.body?.string() ?: ""
                            val rewritten = rewriteHlsPlaylist(rawText, finalUrl, port)
                            val bytes = rewritten.toByteArray(Charsets.UTF_8)
                            val headerStr = "HTTP/1.1 ${resp.code} OK\r\nContent-Type: application/vnd.apple.mpegurl\r\nContent-Length: ${bytes.size}\r\nConnection: close\r\n\r\n"
                            out.write(headerStr.toByteArray(Charsets.US_ASCII))
                            out.write(bytes)
                            out.flush()
                        } else {
                            val headerStr = "HTTP/1.1 ${resp.code} OK\r\nContent-Type: $ct\r\nConnection: close\r\n\r\n"
                            out.write(headerStr.toByteArray(Charsets.US_ASCII))
                            val bodyStream = resp.body?.byteStream() ?: return
                            val buf = ByteArray(16 * 1024)
                            while (running) {
                                val n = bodyStream.read(buf)
                                if (n <= 0) break
                                out.write(buf, 0, n)
                            }
                            out.flush()
                        }
                    }
                } finally {
                    activeCalls.remove(call)
                }
            }
        } catch (_: Throwable) {
        }
    }

    private fun resolveUpstreamUrl(pathAndQuery: String): String? {
        if (pathAndQuery.startsWith("/proxy?u=")) {
            val encoded = pathAndQuery.substringAfter("/proxy?u=")
            return runCatching { URLDecoder.decode(encoded, "UTF-8") }.getOrNull()
        }
        val base = rootUrl
        if (base.isBlank()) return null
        if (pathAndQuery == "/stream" || pathAndQuery == "/stream.m3u8") return base
        return runCatching { URI(base).resolve(pathAndQuery.removePrefix("/")).toString() }.getOrDefault(base)
    }

    private fun rewriteHlsPlaylist(content: String, baseUrl: String, port: Int): String {
        val baseUri = runCatching { URI(baseUrl) }.getOrNull() ?: return content
        val uriAttrRegex = Regex("""URI="([^"]+)"""")
        return content.lineSequence().joinToString("\n") { line ->
            val trimmed = line.trim()
            when {
                trimmed.isEmpty() -> line
                trimmed.startsWith("#") -> {
                    uriAttrRegex.replace(line) { m ->
                        val resolved = runCatching { baseUri.resolve(m.groupValues[1]).toString() }.getOrDefault(m.groupValues[1])
                        val enc = URLEncoder.encode(resolved, "UTF-8")
                        """URI="http://127.0.0.1:$port/proxy?u=$enc""""
                    }
                }
                else -> {
                    val resolved = runCatching { baseUri.resolve(trimmed).toString() }.getOrDefault(trimmed)
                    val enc = URLEncoder.encode(resolved, "UTF-8")
                    "http://127.0.0.1:$port/proxy?u=$enc"
                }
            }
        }
    }

    fun stopCurrentUpstream() {
        for (c in activeCalls) {
            c.cancel()
        }
        activeCalls.clear()
    }

    @Synchronized
    fun shutdown() {
        running = false
        stopCurrentUpstream()
        runCatching { serverSocket?.close() }
        serverSocket = null
    }
}
