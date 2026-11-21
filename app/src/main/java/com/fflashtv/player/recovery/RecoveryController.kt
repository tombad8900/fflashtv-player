package com.fflashtv.player.recovery

import androidx.annotation.OptIn
import androidx.media3.common.ParserException
import androidx.media3.common.PlaybackException
import androidx.media3.common.util.UnstableApi
import androidx.media3.datasource.HttpDataSource
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy
import com.fflashtv.player.resolver.MimeTypes
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.io.IOException
import kotlin.math.min

enum class ErrorCategory {
    PARSING_ERROR,
    IO_ERROR,
    OTHER_RETRYABLE,
    FATAL
}

object ErrorClassifier {
    fun classify(error: PlaybackException): ErrorCategory {
        val cause = error.cause
        return when {
            cause is ParserException ||
                error.errorCode == PlaybackException.ERROR_CODE_PARSING_CONTAINER_MALFORMED ||
                error.errorCode == PlaybackException.ERROR_CODE_PARSING_MANIFEST_MALFORMED ||
                error.errorCode == PlaybackException.ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED ||
                error.errorCode == PlaybackException.ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED ->
                ErrorCategory.PARSING_ERROR

            cause is HttpDataSource.HttpDataSourceException ||
                cause is IOException ||
                error.errorCode == PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED ||
                error.errorCode == PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT ||
                error.errorCode == PlaybackException.ERROR_CODE_IO_BAD_HTTP_STATUS ||
                error.errorCode == PlaybackException.ERROR_CODE_IO_UNSPECIFIED ->
                ErrorCategory.IO_ERROR

            error.errorCode == PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED ||
                error.errorCode == PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED ->
                ErrorCategory.FATAL

            else -> ErrorCategory.OTHER_RETRYABLE
        }
    }
}

object RetryPolicy {
    const val MAX_RETRY_DELAY_MS = 10_000L

    fun nextDelayMs(errorCount: Int): Long {
        return min((errorCount + 1) * 1_000L, MAX_RETRY_DELAY_MS)
    }

    @OptIn(UnstableApi::class)
    fun createLoadErrorHandlingPolicy(): DefaultLoadErrorHandlingPolicy {
        return DefaultLoadErrorHandlingPolicy(Int.MAX_VALUE)
    }
}

class FormatFallback {
    private val triedMimes = mutableSetOf<String>()

    fun reset() {
        triedMimes.clear()
    }

    fun recordTried(mime: String?) {
        if (!mime.isNullOrBlank()) triedMimes.add(mime)
    }

    fun nextFallbackMime(currentMime: String?, category: ErrorCategory): String? {
        if (category != ErrorCategory.PARSING_ERROR && category != ErrorCategory.IO_ERROR) {
            return null
        }
        if (!currentMime.isNullOrBlank()) triedMimes.add(currentMime)

        return when {
            MimeTypes.MPEG_TS !in triedMimes -> {
                triedMimes.add(MimeTypes.MPEG_TS)
                MimeTypes.MPEG_TS
            }
            MimeTypes.HLS !in triedMimes -> {
                triedMimes.add(MimeTypes.HLS)
                MimeTypes.HLS
            }
            else -> null
        }
    }
}

class RecoveryController(
    private val scope: CoroutineScope
) {
    private var recoveryJob: Job? = null
    private var activeSessionId: String? = null
    private var errorCount: Int = 0
    private var isRecovering: Boolean = false
    private val formatFallback = FormatFallback()

    fun attachSession(sessionId: String, initialMime: String?) {
        cancel()
        activeSessionId = sessionId
        errorCount = 0
        isRecovering = false
        formatFallback.reset()
        formatFallback.recordTried(initialMime)
    }

    fun onFirstFrameRendered(sessionId: String) {
        if (activeSessionId != sessionId) return
        errorCount = 0
        isRecovering = false
    }

    fun scheduleRecovery(
        sessionId: String,
        currentMime: String?,
        error: PlaybackException,
        onRetryWithMime: (newMime: String?, attempt: Int, delayMs: Long) -> Unit,
        onFatalError: (String) -> Unit
    ) {
        if (activeSessionId != sessionId) return
        if (isRecovering) return

        val category = ErrorClassifier.classify(error)
        if (category == ErrorCategory.FATAL) {
            onFatalError("DRM or fatal error: ${error.errorCodeName}")
            return
        }

        isRecovering = true
        val fallbackMime = formatFallback.nextFallbackMime(currentMime, category)
        val delayMs = RetryPolicy.nextDelayMs(errorCount)
        val attempt = errorCount + 1
        errorCount = attempt

        recoveryJob = scope.launch {
            delay(delayMs)
            if (activeSessionId != sessionId) return@launch
            isRecovering = false
            onRetryWithMime(fallbackMime ?: currentMime, attempt, delayMs)
        }
    }

    fun cancel() {
        recoveryJob?.cancel()
        recoveryJob = null
        isRecovering = false
    }

    fun currentErrorCount(): Int = errorCount
}
