package com.fflashtv.player.adblock

import android.content.Context
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream
import java.net.HttpURLConnection
import java.net.URL
import java.nio.file.AtomicMoveNotSupportedException
import java.nio.file.Files
import java.nio.file.StandardCopyOption
import java.util.UUID

data class BraveFilterList(
    val id: String,
    val title: String,
    val asset: String,
    val url: String
)

object BraveFilterListManager {
    private const val PREFS = "fflashtv_brave_filter_lists"
    private const val KEY_SELECTED = "selected"
    private const val MAX_LIST_BYTES = 8 * 1024 * 1024

    val lists = listOf(
        BraveFilterList("easylist", "EasyList", "easylist.txt", "https://easylist.to/easylist/easylist.txt"),
        BraveFilterList("easyprivacy", "EasyPrivacy", "easyprivacy.txt", "https://easylist.to/easylist/easyprivacy.txt"),
        BraveFilterList("ublock-filters", "uBlock Filters", "ublock-filters.txt", "https://raw.githubusercontent.com/uBlockOrigin/uAssets/master/filters/filters.txt"),
        BraveFilterList("brave-unbreak", "Brave Unbreak", "brave-unbreak.txt", "https://raw.githubusercontent.com/brave/adblock-lists/master/brave-unbreak.txt"),
        BraveFilterList("brave-specific", "Brave Specific", "brave-specific.txt", "https://raw.githubusercontent.com/brave/adblock-lists/master/brave-lists/brave-specific.txt"),
        BraveFilterList("brave-android", "Brave Android", "brave-android-specific.txt", "https://raw.githubusercontent.com/brave/adblock-lists/master/brave-lists/brave-android-specific.txt"),
        BraveFilterList("arabic", "Arabic List", "liste-ar.txt", "https://easylist-downloads.adblockplus.org/Liste_AR.txt"),
        BraveFilterList("peter-lowe", "Peter Lowe", "peter-lowe.txt", "https://pgl.yoyo.org/adservers/serverlist.php?hostformat=adblockplus&showintro=0&mimetype=plaintext")
    )

    fun getEnabledIds(context: Context): Set<String> {
        val prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        return prefs.getStringSet(KEY_SELECTED, null)?.toSet() ?: lists.map { it.id }.toSet()
    }

    fun setEnabledIds(context: Context, ids: Set<String>) {
        val valid = ids.intersect(lists.map { it.id }.toSet())
        require(valid.isNotEmpty()) { "يجب تفعيل قائمة واحدة على الأقل" }
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .edit().putStringSet(KEY_SELECTED, valid).apply()
    }

    private fun hasRules(content: String): Boolean =
        content.lineSequence().any { line ->
            val value = line.trim()
            value.isNotEmpty() && !value.startsWith("!") && !value.startsWith("#") && !value.startsWith("[")
        }

    private fun readAsset(context: Context, path: String): String =
        runCatching { context.assets.open(path).bufferedReader(Charsets.UTF_8).use { it.readText() } }
            .getOrDefault("")

    private fun readBundledSection(context: Context, item: BraveFilterList): String {
        val bundle = readAsset(context, "adblock/initial_filters.txt")
        if (bundle.isBlank()) return ""
        val marker = "! ===== \${item.asset} ====="
        val markerStart = bundle.indexOf(marker)
        if (markerStart < 0) return ""
        val contentStart = bundle.indexOf('\n', markerStart).let { if (it < 0) bundle.length else it + 1 }
        val nextSection = bundle.indexOf("\n! ===== ", contentStart)
        return bundle.substring(contentStart, if (nextSection < 0) bundle.length else nextSection).trim()
    }

    private fun readValidFile(file: File): String? {
        if (!file.isFile || file.length() <= 0L) return null
        return runCatching { file.readText(Charsets.UTF_8) }
            .getOrNull()
            ?.takeIf { hasRules(it) }
    }

    private fun listContent(context: Context, item: BraveFilterList, directory: File): String {
        val cached = File(directory, "\${item.id}.txt")
        val backup = File(directory, "\${item.id}.txt.bak")
        return readValidFile(cached)
            ?: readValidFile(backup)
            ?: readAsset(context, "adblock/lists/\${item.asset}").takeIf { hasRules(it) }
            ?: readBundledSection(context, item).takeIf { hasRules(it) }
            ?: ""
    }

    fun buildCombinedRules(context: Context): String {
        val selected = getEnabledIds(context)
        require(selected.isNotEmpty()) { "يجب تفعيل قائمة واحدة على الأقل" }
        val directory = File(context.filesDir, "brave_filters/lists")
        val output = StringBuilder()

        lists.filter { it.id in selected }.forEach { item ->
            val content = listContent(context, item, directory)
            if (content.isNotBlank()) {
                output.append("\n! ===== ").append(item.title).append(" =====\n")
                    .append(content).append('\n')
            }
        }

        val combined = output.toString()
        require(hasRules(combined)) { "لا توجد قوائم حجب صالحة" }
        return combined
    }

    private fun writeAtomically(target: File, bytes: ByteArray) {
        val directory = target.parentFile ?: throw IllegalStateException("Invalid list directory")
        if (!directory.exists() && !directory.mkdirs()) throw IllegalStateException("Cannot create list directory")
        val temp = File(directory, ".\${target.name}.\${UUID.randomUUID()}.tmp")
        val backup = File(directory, "\${target.name}.bak")
        try {
            FileOutputStream(temp).use { stream ->
                stream.write(bytes)
                stream.fd.sync()
            }
            if (target.isFile && target.length() > 0L) {
                Files.copy(target.toPath(), backup.toPath(), StandardCopyOption.REPLACE_EXISTING)
            }
            try {
                Files.move(temp.toPath(), target.toPath(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING)
            } catch (_: AtomicMoveNotSupportedException) {
                Files.move(temp.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING)
            }
        } finally {
            if (temp.exists()) temp.delete()
        }
    }

    fun refresh(context: Context): String {
        val selected = getEnabledIds(context)
        require(selected.isNotEmpty()) { "يجب تفعيل قائمة واحدة على الأقل" }
        val directory = File(context.filesDir, "brave_filters/lists")
        if (!directory.exists() && !directory.mkdirs()) throw IllegalStateException("تعذر إنشاء مجلد القوائم")

        var updated = 0
        var failed = 0
        lists.filter { it.id in selected }.forEach { item ->
            var connection: HttpURLConnection? = null
            try {
                connection = URL(item.url).openConnection() as HttpURLConnection
                connection.connectTimeout = 12000
                connection.readTimeout = 20000
                connection.instanceFollowRedirects = true
                connection.setRequestProperty("User-Agent", "FFlashTV/1.0")
                connection.setRequestProperty("Accept", "text/plain,*/*")
                connection.connect()
                if (connection.responseCode !in 200..299) {
                    throw IllegalStateException("HTTP \${connection.responseCode}")
                }

                val bytes = connection.inputStream.use { input ->
                    val output = ByteArrayOutputStream()
                    val buffer = ByteArray(16 * 1024)
                    var total = 0
                    while (true) {
                        val count = input.read(buffer)
                        if (count < 0) break
                        total += count
                        if (total > MAX_LIST_BYTES) throw IllegalStateException("القائمة أكبر من 8MB")
                        output.write(buffer, 0, count)
                    }
                    output.toByteArray()
                }
                val content = bytes.toString(Charsets.UTF_8)
                if (!hasRules(content)) throw IllegalStateException("القائمة فارغة أو غير صالحة")
                writeAtomically(File(directory, "\${item.id}.txt"), bytes)
                updated++
            } catch (_: Throwable) {
                failed++
            } finally {
                connection?.disconnect()
            }
        }

        val combined = buildCombinedRules(context)
        if (!hasRules(combined)) throw IllegalStateException("لا توجد قواعد صالحة بعد التحديث")
        return "تم تحديث $updated قائمة، وتعذر تحديث $failed"
    }
}
