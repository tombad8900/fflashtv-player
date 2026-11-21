package com.fflashtv.player.tmdb

data class TmdbItem(
    val id: Int,
    val title: String,
    val overview: String,
    val posterPath: String,
    val backdropPath: String,
    val voteAverage: Double,
    val releaseDate: String,
    val isTv: Boolean
) {
    val posterUrl: String
        get() = if (posterPath.isNotBlank()) "https://image.tmdb.org/t/p/w500$posterPath" else ""
}

data class TmdbEpisode(
    val episodeNumber: Int,
    val name: String,
    val overview: String
)

data class JsonServer(
    val id: String,
    val name: String,
    val priority: Int = 1,
    val description: String = "",
    val movieUrl: String = "",
    val tvUrl: String = "",
    val baseUrl: String = "",
    val headers: Map<String, String> = emptyMap(),
    val enabled: Boolean = true,
    val hiddenFromPicker: Boolean = false
)

data class SniffedStream(
    val streamUrl: String,
    val streamType: String = "AUTO",
    val referer: String,
    val userAgent: String,
    val cookies: String = "",
    val subtitles: List<String> = emptyList(),
    val diagnostics: String = "",
    val requestHeaders: Map<String, String> = emptyMap()
)
