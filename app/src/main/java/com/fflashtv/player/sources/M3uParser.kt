package com.fflashtv.player.sources

import com.fflashtv.player.model.ContentType
import com.fflashtv.player.model.DrmConfig
import com.fflashtv.player.model.DrmType

object M3uParser {

    private val attrRegex = Regex("""([a-zA-Z0-9_-]+)="([^"]*)"""")

    fun parse(
        rawContent: String,
        defaultHeaders: Map<String, String> = emptyMap()
    ): SourcePayload {
        val lines = rawContent.lineSequence()
        val channels = ArrayList<ChannelItem>()
        val groupCounts = LinkedHashMap<String, Int>()

        var pendingName = ""
        var pendingGroup = "عام"
        var pendingLogo = ""
        var pendingNumber = ""
        var pendingMeta = mutableMapOf<String, String>()
        var pendingHeaders = defaultHeaders.toMutableMap()
        var pendingDrm = DrmConfig()
        var hasExtInf = false

        var index = 0
        for (rawLine in lines) {
            val line = rawLine.trim()
            if (line.isEmpty()) continue

            when {
                line.startsWith("#EXTM3U", ignoreCase = true) -> continue

                line.startsWith("#EXTINF:", ignoreCase = true) -> {
                    hasExtInf = true
                    pendingName = ""
                    pendingGroup = "عام"
                    pendingLogo = ""
                    pendingNumber = ""
                    pendingMeta = mutableMapOf()
                    pendingHeaders = defaultHeaders.toMutableMap()
                    pendingDrm = DrmConfig()

                    val commaIdx = findTitleComma(line)
                    val headerPart = if (commaIdx >= 0) line.substring(0, commaIdx) else line
                    val titlePart = if (commaIdx >= 0) line.substring(commaIdx + 1).trim() else ""

                    for (match in attrRegex.findAll(headerPart)) {
                        val key = match.groupValues[1].lowercase()
                        val value = match.groupValues[2].trim()
                        if (value.isEmpty()) continue
                        when (key) {
                            "group-title" -> pendingGroup = value
                            "tvg-logo" -> pendingLogo = value
                            "tvg-chno" -> pendingNumber = value
                            "tvg-name" -> if (pendingName.isEmpty()) pendingName = value
                            else -> pendingMeta[key] = value
                        }
                    }
                    if (titlePart.isNotEmpty()) {
                        pendingName = titlePart
                    }
                }

                line.startsWith("#EXTGRP:", ignoreCase = true) -> {
                    val grp = line.substringAfter(":").trim()
                    if (grp.isNotEmpty()) pendingGroup = grp
                }

                line.startsWith("#EXTVLCOPT:", ignoreCase = true) -> {
                    val opt = line.substringAfter(":").trim()
                    when {
                        opt.startsWith("http-user-agent=", ignoreCase = true) -> {
                            pendingHeaders["User-Agent"] = opt.substringAfter("=")
                        }
                        opt.startsWith("http-referrer=", ignoreCase = true) ||
                        opt.startsWith("http-referer=", ignoreCase = true) -> {
                            pendingHeaders["Referer"] = opt.substringAfter("=")
                        }
                    }
                }

                line.startsWith("#KODIPROP:", ignoreCase = true) -> {
                    val prop = line.substringAfter(":").trim()
                    if (prop.startsWith("inputstream.adaptive.license_type=", ignoreCase = true)) {
                        val t = prop.substringAfter("=").lowercase()
                        pendingDrm = when {
                            t.contains("clearkey") -> pendingDrm.copy(type = DrmType.CLEARKEY)
                            t.contains("widevine") -> pendingDrm.copy(type = DrmType.WIDEVINE)
                            else -> pendingDrm
                        }
                    } else if (prop.startsWith("inputstream.adaptive.license_key=", ignoreCase = true)) {
                        val v = prop.substringAfter("=").trim()
                        if (v.startsWith("http", ignoreCase = true)) {
                            pendingDrm = pendingDrm.copy(type = DrmType.WIDEVINE, licenseUrl = v)
                        } else if (v.contains(":")) {
                            val parts = v.split(":", limit = 2)
                            pendingDrm = pendingDrm.copy(
                                type = DrmType.CLEARKEY,
                                kid = parts[0].trim(),
                                key = parts[1].trim()
                            )
                        }
                    }
                }

                line.startsWith("#") -> continue

                else -> {
                    val url = line
                    val name = pendingName.ifBlank {
                        url.substringAfterLast('/').substringBefore('?').ifBlank { "Channel ${index + 1}" }
                    }
                    val group = pendingGroup.ifBlank { "عام" }
                    val id = "${url.hashCode()}_$index"

                    channels.add(
                        ChannelItem(
                            id = id,
                            name = name,
                            url = url,
                            groupName = group,
                            logoUrl = pendingLogo,
                            channelNumber = pendingNumber,
                            headers = pendingHeaders.toMap(),
                            drmConfig = pendingDrm,
                            contentType = ContentType.LIVE,
                            metadata = pendingMeta.toMap()
                        )
                    )
                    groupCounts[group] = (groupCounts[group] ?: 0) + 1
                    index++

                    if (hasExtInf) {
                        hasExtInf = false
                        pendingName = ""
                        pendingGroup = "عام"
                        pendingLogo = ""
                        pendingNumber = ""
                        pendingMeta = mutableMapOf()
                        pendingHeaders = defaultHeaders.toMutableMap()
                        pendingDrm = DrmConfig()
                    }
                }
            }
        }

        val groups = groupCounts.entries.mapIndexed { idx, entry ->
            GroupItem(
                name = entry.key,
                channelCount = entry.value,
                originalOrder = idx
            )
        }

        return SourcePayload(groups = groups, channels = channels)
    }

    private fun findTitleComma(line: String): Int {
        var inQuotes = false
        for (i in line.indices) {
            val c = line[i]
            if (c == '"') inQuotes = !inQuotes
            else if (c == ',' && !inQuotes) return i
        }
        return -1
    }
}
