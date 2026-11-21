package com.fflashtv.player.adblock

import android.content.Context
import android.net.Uri
import org.mlm.adblock.AdblockEngine
import org.mlm.adblock.RequestTypeMapper
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.locks.ReentrantReadWriteLock
import kotlin.concurrent.read
import kotlin.concurrent.write

object BraveAdBlockEngine {
    private const val PREFS = "fflashtv_brave_adblock"
    private const val KEY_ENABLED = "enabled"

    private val executor = Executors.newSingleThreadExecutor()
    private val lock = ReentrantReadWriteLock()
    private val initStarted = AtomicBoolean(false)

    @Volatile private var engine: AdblockEngine? = null
    @Volatile private var ready = false
    @Volatile private var enabled = true
    @Volatile private var lastError: String? = null

    fun isReady(): Boolean = ready
    fun lastError(): String? = lastError

    fun isEnabled(context: Context): Boolean {
        enabled = context.applicationContext
            .getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .getBoolean(KEY_ENABLED, true)
        return enabled
    }

    fun setEnabled(context: Context, value: Boolean) {
        context.applicationContext.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .edit().putBoolean(KEY_ENABLED, value).apply()
        enabled = value
        if (value) initializeAsync(context)
    }

    fun initializeAsync(context: Context) {
        val app = context.applicationContext
        if (!isEnabled(app) || ready) return
        if (!initStarted.compareAndSet(false, true)) return

        executor.execute {
            try {
                install(app, BraveFilterListManager.buildCombinedRules(app))
                lastError = null
            } catch (error: Throwable) {
                ready = false
                lastError = error.message ?: error.javaClass.simpleName
            } finally {
                initStarted.set(false)
            }
        }
    }

    private fun install(context: Context, rules: String) {
        val resources = context.assets.open("adblock/resources.json").bufferedReader(Charsets.UTF_8).use { it.readText() }
        val next = AdblockEngine.create()
        try {
            check(next.loadResources(resources)) { "Brave resources could not be loaded" }
            check(next.loadFilterList(rules)) { "Brave filter lists could not be loaded" }

            var previous: AdblockEngine? = null
            lock.write {
                previous = engine
                engine = next
                ready = true
            }
            previous?.close()
        } catch (error: Throwable) {
            next.close()
            throw error
        }
    }

    fun reload(context: Context) {
        val app = context.applicationContext
        install(app, BraveFilterListManager.buildCombinedRules(app))
    }

    fun shouldBlock(url: String, pageUrl: String, accept: String?, isMainFrame: Boolean): Boolean {
        if (!enabled || !ready || url.isBlank()) return false
        return lock.read {
            val current = engine ?: return@read false
            val type = RequestTypeMapper.from(Uri.parse(url), accept, isMainFrame)
            val result = current.checkNetworkRequest(url, pageUrl, type)
            result.getMatched() && !result.getException()
        }
    }

    fun ruleCount(context: Context): Int =
        BraveFilterListManager.buildCombinedRules(context).lineSequence()
            .count { it.isNotBlank() && !it.startsWith("!") && !it.startsWith("#") && !it.startsWith("[") }

    fun refreshAsync(context: Context, onResult: (String) -> Unit) {
        val app = context.applicationContext
        executor.execute {
            val message = try {
                val result = BraveFilterListManager.refresh(app)
                reload(app)
                lastError = null
                result
            } catch (error: Throwable) {
                lastError = error.message ?: error.javaClass.simpleName
                "تعذر تحديث القوائم: ${lastError}"
            }
            onResult(message)
        }
    }

    fun rebuildAsync(context: Context, onResult: (String) -> Unit = {}) {
        val app = context.applicationContext
        executor.execute {
            val message = try {
                reload(app)
                lastError = null
                "تم تطبيق القوائم المحددة"
            } catch (error: Throwable) {
                lastError = error.message ?: error.javaClass.simpleName
                "تعذر تطبيق القوائم: ${lastError}"
            }
            onResult(message)
        }
    }
}
