package com.fflashtv.player.tmdb

import android.content.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONObject
import java.net.URLEncoder
import java.util.concurrent.TimeUnit

enum class TmdbCategory(val label: String, val path: String, val isTv: Boolean) {
    POPULAR_MOVIES("أفلام شائعة", "movie/popular", false),
    TOP_MOVIES("الأعلى تقييماً", "movie/top_rated", false),
    POPULAR_TV("مسلسلات شائعة", "tv/popular", true),
    TOP_TV("مسلسلات مميزة", "tv/top_rated", true)
}

class TmdbClient(context: Context) {

    private val prefs = context.applicationContext.getSharedPreferences("fflashtv_tmdb_prefs", Context.MODE_PRIVATE)
    private val _apiKey = MutableStateFlow(prefs.getString("api_key", "") ?: "")
    val apiKeyFlow: StateFlow<String> = _apiKey.asStateFlow()

    private val http = OkHttpClient.Builder()
        .connectTimeout(12, TimeUnit.SECONDS)
        .readTimeout(15, TimeUnit.SECONDS)
        .build()

    fun currentKey(): String = _apiKey.value

    suspend fun testAndSave(rawKey: String): Result<String> = withContext(Dispatchers.IO) {
        val key = rawKey.trim()
        if (key.isBlank()) return@withContext Result.failure(IllegalArgumentException("أدخل مفتاح TMDB أولاً"))
        try {
            val req = Request.Builder()
                .url("https://api.themoviedb.org/3/configuration?api_key=${URLEncoder.encode(key, "UTF-8")}")
                .get()
                .build()
            http.newCall(req).execute().use { resp ->
                if (!resp.isSuccessful) {
                    return@withContext Result.failure(IllegalStateException("مفتاح غير صالح (HTTP ${resp.code})"))
                }
                prefs.edit().putString("api_key", key).apply()
                _apiKey.value = key
                Result.success("تم التحقق من المفتاح وحفظه بنجاح")
            }
        } catch (t: Throwable) {
            Result.failure(IllegalStateException("تعذر الاتصال بـ TMDB: ${t.message ?: "خطأ شبكة"}"))
        }
    }

    fun deleteKey() {
        prefs.edit().remove("api_key").apply()
        _apiKey.value = ""
    }

    suspend fun fetchCategory(category: TmdbCategory, page: Int = 1): Result<List<TmdbItem>> = withContext(Dispatchers.IO) {
        val key = currentKey()
        if (key.isBlank()) return@withContext Result.failure(IllegalStateException("مفتاح TMDB غير مضاف"))
        val url = "https://api.themoviedb.org/3/${category.path}?api_key=$key&language=ar-SA&page=$page"
        fetchList(url, forceTv = category.isTv)
    }

    suspend fun search(query: String): Result<List<TmdbItem>> = withContext(Dispatchers.IO) {
        val key = currentKey()
        if (key.isBlank()) return@withContext Result.failure(IllegalStateException("مفتاح TMDB غير مضاف"))
        val q = URLEncoder.encode(query.trim(), "UTF-8")
        val url = "https://api.themoviedb.org/3/search/multi?api_key=$key&language=ar-SA&query=$q"
        fetchList(url, forceTv = null)
    }

    suspend fun fetchExternalImdbId(tmdbId: Int, isTv: Boolean): String = withContext(Dispatchers.IO) {
        val key = currentKey()
        if (key.isBlank()) return@withContext ""
        val type = if (isTv) "tv" else "movie"
        return@withContext try {
            val req = Request.Builder().url("https://api.themoviedb.org/3/$type/$tmdbId/external_ids?api_key=$key").get().build()
            http.newCall(req).execute().use { resp ->
                if (!resp.isSuccessful) return@use ""
                JSONObject(resp.body?.string() ?: "{}").optString("imdb_id", "")
            }
        } catch (_: Throwable) {
            ""
        }
    }

    suspend fun fetchSeasonCount(tvId: Int): Int = withContext(Dispatchers.IO) {
        val key = currentKey()
        if (key.isBlank()) return@withContext 1
        return@withContext try {
            val req = Request.Builder().url("https://api.themoviedb.org/3/tv/$tvId?api_key=$key&language=ar-SA").get().build()
            http.newCall(req).execute().use { resp ->
                if (!resp.isSuccessful) return@use 1
                JSONObject(resp.body?.string() ?: "{}").optInt("number_of_seasons", 1).coerceAtLeast(1)
            }
        } catch (_: Throwable) {
            1
        }
    }

    suspend fun fetchEpisodes(tvId: Int, season: Int): List<TmdbEpisode> = withContext(Dispatchers.IO) {
        val key = currentKey()
        if (key.isBlank()) return@withContext emptyList()
        return@withContext try {
            val req = Request.Builder().url("https://api.themoviedb.org/3/tv/$tvId/season/$season?api_key=$key&language=ar-SA").get().build()
            http.newCall(req).execute().use { resp ->
                if (!resp.isSuccessful) return@use emptyList()
                val arr = JSONObject(resp.body?.string() ?: "{}").optJSONArray("episodes") ?: return@use emptyList()
                (0 until arr.length()).map { i ->
                    val o = arr.getJSONObject(i)
                    TmdbEpisode(
                        episodeNumber = o.optInt("episode_number", i + 1),
                        name = o.optString("name", "الحلقة ${i + 1}"),
                        overview = o.optString("overview", "")
                    )
                }
            }
        } catch (_: Throwable) {
            emptyList()
        }
    }

    private fun fetchList(url: String, forceTv: Boolean?): Result<List<TmdbItem>> {
        return try {
            val req = Request.Builder().url(url).get().build()
            http.newCall(req).execute().use { resp ->
                if (!resp.isSuccessful) return Result.failure(IllegalStateException("خطأ TMDB: HTTP ${resp.code}"))
                val arr = JSONObject(resp.body?.string() ?: "{}").optJSONArray("results")
                    ?: return Result.success(emptyList())
                val items = mutableListOf<TmdbItem>()
                for (i in 0 until arr.length()) {
                    val o = arr.getJSONObject(i)
                    val mediaType = o.optString("media_type", "")
                    if (forceTv == null && mediaType != "movie" && mediaType != "tv") continue
                    val isTv = forceTv ?: (mediaType == "tv")
                    val title = if (isTv) o.optString("name", o.optString("original_name"))
                    else o.optString("title", o.optString("original_title"))
                    items.add(
                        TmdbItem(
                            id = o.optInt("id"),
                            title = title,
                            overview = o.optString("overview", ""),
                            posterPath = o.optString("poster_path", ""),
                            backdropPath = o.optString("backdrop_path", ""),
                            voteAverage = o.optDouble("vote_average", 0.0),
                            releaseDate = if (isTv) o.optString("first_air_date", "") else o.optString("release_date", ""),
                            isTv = isTv
                        )
                    )
                }
                Result.success(items)
            }
        } catch (t: Throwable) {
            Result.failure(IllegalStateException("فشل جلب TMDB: ${t.message}"))
        }
    }
}
