package com.fflashtv.player.mpv

enum class MpvDecoderMode(val label: String, val hwdecValue: String) {
    HW_PLUS("HW+", "mediacodec-copy"),
    HW("HW", "mediacodec"),
    SW("SW", "no")
}

enum class MpvAspectMode(val label: String) {
    FIT("ملاءمة"),
    FILL("ملء الشاشة"),
    ZOOM("تكبير"),
    RATIO_16_9("16:9"),
    RATIO_4_3("4:3")
}

data class MpvTrack(
    val id: Int,
    val type: String, // "video", "audio", "sub"
    val title: String,
    val lang: String,
    val codec: String,
    val isSelected: Boolean
)

data class MpvPlayerState(
    val title: String = "libmpv Player",
    val url: String = "",
    val isLive: Boolean = false,
    val isPlaying: Boolean = false,
    val isBuffering: Boolean = true,
    val showBackdrop: Boolean = true,
    val positionSec: Double = 0.0,
    val durationSec: Double = 0.0,
    val cacheDurationSec: Double = 0.0,
    val speed: Double = 1.0,
    val volume: Int = 100,
    val isMuted: Boolean = false,
    val decoderMode: MpvDecoderMode = MpvDecoderMode.HW_PLUS,
    val activeHwdec: String = "",
    val videoCodec: String = "",
    val videoWidth: Int = 0,
    val videoHeight: Int = 0,
    val aspectMode: MpvAspectMode = MpvAspectMode.FIT,
    val tracks: List<MpvTrack> = emptyList(),
    val errorMessage: String? = null,
    val retryAttempt: Int = 0,
    val isFullscreen: Boolean = true,
    val isInPip: Boolean = false,
    val previousAvailable: Boolean = false,
    val nextAvailable: Boolean = false
)
