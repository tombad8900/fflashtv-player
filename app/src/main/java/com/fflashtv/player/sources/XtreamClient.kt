package com.fflashtv.player.sources

import com.fflashtv.player.model.ContentType
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONArray
import org.json.JSONObject
import java.net.URLEncoder
import java.util.concurrent.TimeUnit

object XtreamClient {

    private val client = OkHttpClient.Builder()
        .connectTimeout(15, TimeUnit.SECONDS)
        .readTimeout(20, TimeUnit.SECONDS)
        .followRedirects(true)
        .followSslRedirects(true)
        .build()

    suspend fun fetchLive(
        rawHost: String,
        username: String,
        password: String,
        headers: Map<String, String> = emptyMap()
    ): Result<SourcePayload> = withContext(Dispatchers.IO) {
        try {
            val baseHost = normalizeHost(rawHost)
            val user = URLEncoder.encode(username.trim(), "UTF-8")
            val pass = URLEncoder.encode(password.trim(), "UTF-8")

            // 1. Verify account & user_info
            val authJsonStr = getString("$baseHost/player_api.php?username=$user&password=$pass", headers)
            val authObj = JSONObject(authJsonStr)
            val userInfo = authObj.optJSONObject("user_info")
                ?: return@withContext Result.failure(IllegalStateException("بيانات حساب Xtream غير صحيحة"))

            val authStatus = userInfo.optInt("auth", 0)
            if (authStatus != 1) {
                return@withContext Result.failure(IllegalStateException("فشل تسجيل الدخول: اسم المستخدم أو كلمة المرور غير صحيحة"))
            }

            val statusText = userInfo.optString("status", "Active")
            val activeCons = userInfo.optString("active_cons", "0")
            val maxCons = userInfo.optString("max_connections", "1")
            val accountSummary = "الحالة: $statusText | الاتصالات: $activeCons/$maxCons"

            // 2. Fetch categories preserving exact server order
            val catStr = getString("$baseHost/player_api.php?username=$user&password=$pass&action=get_live_categories", headers)
            val catArr = JSONArray(catStr)
            val categoryNames = LinkedHashMap<String, String>()
            for (i in 0 until catArr.length()) {
                val o = catArr.getJSONObject(i)
                val cid = o.optString("category_id")
                val cname = o.optString("category_name", "عام").ifBlank { "عام" }
                if (cid.isNotBlank()) {
                    categoryNames[cid] = cname
                }
            }

            // 3. Fetch live streams preserving exact server order
            val streamsStr = getString("$baseHost/player_api.php?username=$user&password=$pass&action=get_live_streams", headers)
            val streamsArr = JSONArray(streamsStr)
            if (streamsArr.length() == 0) {
                return@withContext Result.failure(IllegalStateException("قائمة القنوات فارغة من الخادم"))
            }

            val channels = ArrayList<ChannelItem>(streamsArr.length())
            val countsByCategory = LinkedHashMap<String, Int>()
            // Initialize counts in exact category order (supports empty groups!)
            for (cname in categoryNames.values) {
                countsByCategory[cname] = 0
            }

            for (i in 0 until streamsArr.length()) {
                val o = streamsArr.getJSONObject(i)
                val streamId = o.optString("stream_id")
                if (streamId.isBlank()) continue
                val name = o.optString("name", "Channel $streamId")
                val num = o.optString("num", "")
                val logo = o.optString("stream_icon", "")
                val cid = o.optString("category_id")
                val groupName = categoryNames[cid] ?: "عام"
                val streamUrl = "$baseHost/live/${username.trim()}/${password.trim()}/$streamId.ts"

                channels.add(
                    ChannelItem(
                        id = "xtream_${streamId}_$i",
                        name = name,
                        url = streamUrl,
                        groupName = groupName,
                        logoUrl = logo,
                        channelNumber = num,
                        headers = headers,
                        contentType = ContentType.LIVE
                    )
                )
                countsByCategory[groupName] = (countsByCategory[groupName] ?: 0) + 1
            }

            val groups = countsByCategory.entries.mapIndexed { idx, entry ->
                GroupItem(
                    name = entry.key,
                    channelCount = entry.value,
                    originalOrder = idx
                )
            }

            Result.success(
                SourcePayload(
                    groups = groups,
                    channels = channels,
                    accountInfo = accountSummary
                )
            )
        } catch (t: Throwable) {
            Result.failure(IllegalStateException("تعذر الاتصال بخادم Xtream: ${t.message ?: "خطأ شبكة"}"))
        }
    }

    private fun normalizeHost(raw: String): String {
        var h = raw.trim().trimEnd('/')
        if (!h.startsWith("http://", true) && !h.startsWith("https://", true)) {
            h = "http://$h"
        }
        return h
    }

    private fun getString(url: String, headers: Map<String, String>): String {
        val req = Request.Builder().url(url).get()
        for ((k, v) in headers) {
            if (k.isNotBlank()) req.header(k.trim(), v)
        }
        client.newCall(req.build()).execute().use { resp ->
            if (!resp.isSuccessful) {
                throw IllegalStateException("HTTP ${resp.code}")
            }
            return resp.body?.string() ?: throw IllegalStateException("استجابة فارغة")
        }
    }
}
