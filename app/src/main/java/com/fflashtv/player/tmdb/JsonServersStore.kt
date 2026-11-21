package com.fflashtv.player.tmdb

import android.content.Context
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import org.json.JSONArray
import org.json.JSONObject
import java.io.File

class JsonServersStore(context: Context) {

    private val dir = File(context.applicationContext.filesDir, "fflashtv_tmdb").apply { mkdirs() }
    private val file = File(dir, "servers.json")

    private val _servers = MutableStateFlow<List<JsonServer>>(load())
    val servers: StateFlow<List<JsonServer>> = _servers.asStateFlow()

    @Synchronized
    private fun load(): List<JsonServer> {
        if (!file.exists()) return emptyList()
        return try {
            val arr = JSONArray(file.readText())
            (0 until arr.length()).map { i -> parseServer(arr.getJSONObject(i), i + 1) }
        } catch (_: Throwable) {
            emptyList()
        }
    }

    @Synchronized
    private fun save(list: List<JsonServer>) {
        val arr = JSONArray()
        for (s in list) {
            arr.put(JSONObject().apply {
                put("id", s.id)
                put("name", s.name)
                put("priority", s.priority)
                put("description", s.description)
                put("movieUrl", s.movieUrl)
                put("tvUrl", s.tvUrl)
                put("baseUrl", s.baseUrl)
                put("headers", JSONObject(s.headers))
                put("enabled", s.enabled)
                put("hiddenFromPicker", s.hiddenFromPicker)
            })
        }
        file.writeText(arr.toString())
        _servers.value = list
    }

    fun importFromJson(rawJson: String): Result<Int> {
        return try {
            val trimmed = rawJson.trim()
            val arr = when {
                trimmed.startsWith("[") -> JSONArray(trimmed)
                else -> {
                    val root = JSONObject(trimmed)
                    root.optJSONObject("data")?.optJSONArray("servers")
                        ?: root.optJSONArray("servers")
                        ?: if (root.has("id") || root.has("movie") || root.has("movieUrl") || root.has("tv")) {
                            JSONArray().put(root)
                        } else {
                            throw IllegalStateException("لم يتم العثور على data.servers أو بيانات خادم صالحة في الملف")
                        }
                }
            }
            val parsed = (0 until arr.length()).map { i -> parseServer(arr.getJSONObject(i), i + 1) }
            if (parsed.isEmpty()) return Result.failure(IllegalStateException("ملف المصادر فارغ"))
            save(parsed)
            Result.success(parsed.size)
        } catch (t: Throwable) {
            Result.failure(IllegalStateException("تعذر تحليل ملف JSON: ${t.message}"))
        }
    }

    fun toggleEnabled(id: String) {
        save(_servers.value.map { if (it.id == id) it.copy(enabled = !it.enabled) else it })
    }

    fun toggleHidden(id: String) {
        save(_servers.value.map { if (it.id == id) it.copy(hiddenFromPicker = !it.hiddenFromPicker) else it })
    }

    fun deleteServer(id: String) {
        save(_servers.value.filterNot { it.id == id })
    }

    fun visibleEnabledServers(): List<JsonServer> {
        return _servers.value
            .filter { it.enabled && !it.hiddenFromPicker }
            .sortedBy { it.priority }
    }

    fun buildEmbedUrl(server: JsonServer, tmdbId: Int, imdbId: String, isTv: Boolean, season: Int = 1, episode: Int = 1): String {
        val rawTemplate = if (isTv) {
            server.tvUrl.ifBlank { server.movieUrl }
        } else {
            server.movieUrl.ifBlank { server.tvUrl }
        }

        if (rawTemplate.isNotBlank()) {
            return rawTemplate
                .replace("{tmdb_id}", tmdbId.toString())
                .replace("{tmdbId}", tmdbId.toString())
                .replace("{id}", tmdbId.toString())
                .replace("{imdb_id}", imdbId.ifBlank { tmdbId.toString() })
                .replace("{imdbId}", imdbId.ifBlank { tmdbId.toString() })
                .replace("{season}", season.toString())
                .replace("{s}", season.toString())
                .replace("{episode}", episode.toString())
                .replace("{e}", episode.toString())
        }

        val base = server.baseUrl.trimEnd('/')
        return if (isTv) "$base/embed/tv/$tmdbId/$season/$episode" else "$base/embed/movie/$tmdbId"
    }

    private fun parseServer(o: JSONObject, defaultPriority: Int): JsonServer {
        val id = o.optString("id", o.optString("server_id", "srv_$defaultPriority"))
        val name = o.optString("name", o.optString("title", id))
        val priority = o.optInt("priority", o.optInt("order", defaultPriority))
        val desc = o.optString("description", o.optString("notes", o.optString("note", "")))
        val movieUrl = o.optString("movieUrl", o.optString("movie", o.optString("movie_url", o.optString("embedUrl", o.optString("url", "")))))
        val tvUrl = o.optString("tvUrl", o.optString("tv", o.optString("tv_url", "")))
        val baseUrl = o.optString("baseUrl", o.optString("base_url", o.optString("domain", "")))
        val hObj = o.optJSONObject("headers")
        val headers = mutableMapOf<String, String>()
        if (hObj != null) {
            val keys = hObj.keys()
            while (keys.hasNext()) {
                val k = keys.next()
                headers[k] = hObj.optString(k)
            }
        }
        return JsonServer(
            id = id,
            name = name,
            priority = priority,
            description = desc,
            movieUrl = movieUrl,
            tvUrl = tvUrl,
            baseUrl = baseUrl,
            headers = headers,
            enabled = o.optBoolean("enabled", true),
            hiddenFromPicker = o.optBoolean("hiddenFromPicker", o.optBoolean("hidden", false))
        )
    }
}
