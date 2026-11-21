package com.fflashtv.player.ui

import android.app.Application
import android.content.Context
import android.content.Intent
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.fflashtv.player.model.PlaybackInput
import com.fflashtv.player.mpv.MpvPlayerActivity
import com.fflashtv.player.sources.ChannelItem
import com.fflashtv.player.sources.GroupItem
import com.fflashtv.player.sources.SourceConfig
import com.fflashtv.player.sources.SourcePayload
import com.fflashtv.player.sources.SourceRepository
import com.fflashtv.player.sources.SourceStatus
import com.fflashtv.player.sources.SourceType
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

object PlayerLaunchBridge {
    @Volatile
    var pendingPlaylist: List<PlaybackInput> = emptyList()

    @Volatile
    var pendingStartIndex: Int = 0

    enum class EngineType { MEDIA3, LIBMPV }

    fun launch(context: Context, channels: List<ChannelItem>, startIndex: Int, engine: EngineType = EngineType.MEDIA3) {
        pendingPlaylist = channels.map { it.toPlaybackInput() }
        pendingStartIndex = startIndex.coerceIn(0, (channels.size - 1).coerceAtLeast(0))
        val target = if (engine == EngineType.LIBMPV) MpvPlayerActivity::class.java else PlayerActivity::class.java
        val intent = Intent(context, target).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        context.startActivity(intent)
    }
}

enum class LibraryFilterMode {
    GROUPS, FAVORITES
}

data class LibraryUiState(
    val sources: List<SourceConfig> = emptyList(),
    val activeSource: SourceConfig? = null,
    val groups: List<GroupItem> = emptyList(),
    val channels: List<ChannelItem> = emptyList(),
    val favoriteIds: Set<String> = emptySet(),
    val selectedGroupName: String? = null,
    val searchQuery: String = "",
    val filterMode: LibraryFilterMode = LibraryFilterMode.GROUPS,
    val showHiddenGroups: Boolean = false,
    val isLoading: Boolean = false,
    val bannerMessage: String? = null
)

class LibraryViewModel(application: Application) : AndroidViewModel(application) {
    private val repo = SourceRepository(application)

    private val _ui = MutableStateFlow(LibraryUiState())
    val ui: StateFlow<LibraryUiState> = _ui.asStateFlow()

    init {
        loadFromDisk()
    }

    private fun loadFromDisk() {
        val sources = repo.loadAllSources()
        val active = sources.firstOrNull { it.isActive } ?: sources.firstOrNull()
        if (active != null) {
            val payload = repo.loadPayload(active.id)
            _ui.update {
                it.copy(
                    sources = sources,
                    activeSource = active,
                    groups = payload.groups,
                    channels = payload.channels,
                    favoriteIds = payload.favoriteIds,
                    selectedGroupName = payload.groups.firstOrNull { g -> !g.isHidden }?.name
                )
            }
            if (active.autoUpdate) {
                refreshSource(active.id, silent = true)
            }
        } else {
            _ui.update {
                it.copy(sources = emptyList(), activeSource = null, groups = emptyList(), channels = emptyList())
            }
        }
    }

    fun clearBanner() {
        _ui.update { it.copy(bannerMessage = null) }
    }

    fun selectGroup(groupName: String?) {
        _ui.update { it.copy(selectedGroupName = groupName, filterMode = LibraryFilterMode.GROUPS) }
    }

    fun setFilterMode(mode: LibraryFilterMode) {
        _ui.update { it.copy(filterMode = mode) }
    }

    fun setSearchQuery(q: String) {
        _ui.update { it.copy(searchQuery = q) }
    }

    fun toggleShowHiddenGroups() {
        _ui.update { it.copy(showHiddenGroups = !it.showHiddenGroups) }
    }

    fun toggleFavorite(channelId: String) {
        val active = _ui.value.activeSource ?: return
        val currentFavs = _ui.value.favoriteIds.toMutableSet()
        if (!currentFavs.add(channelId)) {
            currentFavs.remove(channelId)
        }
        val payload = repo.loadPayload(active.id).copy(favoriteIds = currentFavs)
        repo.savePayload(active.id, payload)
        _ui.update { it.copy(favoriteIds = currentFavs) }
    }

    fun toggleGroupHidden(groupName: String) {
        val active = _ui.value.activeSource ?: return
        val updatedGroups = _ui.value.groups.map {
            if (it.name == groupName) it.copy(isHidden = !it.isHidden) else it
        }
        val payload = repo.loadPayload(active.id).copy(groups = updatedGroups)
        repo.savePayload(active.id, payload)
        _ui.update { it.copy(groups = updatedGroups) }
    }

    fun moveGroup(groupName: String, up: Boolean) {
        val active = _ui.value.activeSource ?: return
        val sorted = _ui.value.groups.sortedBy { it.customOrder }.toMutableList()
        val idx = sorted.indexOfFirst { it.name == groupName }
        if (idx < 0) return
        val swapIdx = if (up) idx - 1 else idx + 1
        if (swapIdx !in sorted.indices) return
        val tmp = sorted[idx]
        sorted[idx] = sorted[swapIdx]
        sorted[swapIdx] = tmp
        val reindexed = sorted.mapIndexed { i, g -> g.copy(customOrder = i) }

        val updatedSources = _ui.value.sources.map {
            if (it.id == active.id) it.copy(useCustomGroupOrder = true) else it
        }
        repo.saveAllSources(updatedSources)
        val payload = repo.loadPayload(active.id).copy(groups = reindexed)
        repo.savePayload(active.id, payload)
        _ui.update {
            it.copy(
                sources = updatedSources,
                activeSource = updatedSources.firstOrNull { s -> s.id == active.id },
                groups = reindexed
            )
        }
    }

    fun resetGroupOrder() {
        val active = _ui.value.activeSource ?: return
        val reset = _ui.value.groups.map { it.copy(customOrder = it.originalOrder) }
            .sortedBy { it.originalOrder }
        val updatedSources = _ui.value.sources.map {
            if (it.id == active.id) it.copy(useCustomGroupOrder = false) else it
        }
        repo.saveAllSources(updatedSources)
        val payload = repo.loadPayload(active.id).copy(groups = reset)
        repo.savePayload(active.id, payload)
        _ui.update {
            it.copy(
                sources = updatedSources,
                activeSource = updatedSources.firstOrNull { s -> s.id == active.id },
                groups = reset
            )
        }
    }

    fun toggleShowEmptyGroups(sourceId: String) {
        val updated = _ui.value.sources.map {
            if (it.id == sourceId) it.copy(showEmptyGroups = !it.showEmptyGroups) else it
        }
        repo.saveAllSources(updated)
        _ui.update {
            it.copy(
                sources = updated,
                activeSource = updated.firstOrNull { s -> s.isActive }
            )
        }
    }

    fun toggleAutoUpdate(sourceId: String) {
        val updated = _ui.value.sources.map {
            if (it.id == sourceId) it.copy(autoUpdate = !it.autoUpdate) else it
        }
        repo.saveAllSources(updated)
        _ui.update {
            it.copy(
                sources = updated,
                activeSource = updated.firstOrNull { s -> s.isActive }
            )
        }
    }

    fun activateSource(sourceId: String) {
        val updated = _ui.value.sources.map { it.copy(isActive = it.id == sourceId) }
        repo.saveAllSources(updated)
        val active = updated.firstOrNull { it.id == sourceId } ?: return
        val payload = repo.loadPayload(active.id)
        _ui.update {
            it.copy(
                sources = updated,
                activeSource = active,
                groups = payload.groups,
                channels = payload.channels,
                favoriteIds = payload.favoriteIds,
                selectedGroupName = payload.groups.firstOrNull { g -> !g.isHidden }?.name,
                searchQuery = "",
                filterMode = LibraryFilterMode.GROUPS
            )
        }
    }

    fun renameSource(sourceId: String, newName: String) {
        if (newName.isBlank()) return
        val updated = _ui.value.sources.map {
            if (it.id == sourceId) it.copy(name = newName.trim()) else it
        }
        repo.saveAllSources(updated)
        _ui.update {
            it.copy(
                sources = updated,
                activeSource = updated.firstOrNull { s -> s.isActive }
            )
        }
    }

    fun deleteSource(sourceId: String) {
        val remaining = _ui.value.sources.filterNot { it.id == sourceId }
        repo.deletePayload(sourceId)
        val hadActive = _ui.value.activeSource?.id == sourceId
        val normalized = if (hadActive && remaining.isNotEmpty()) {
            remaining.mapIndexed { idx, s -> s.copy(isActive = idx == 0) }
        } else {
            remaining
        }
        repo.saveAllSources(normalized)
        loadFromDisk()
    }

    fun addOrUpdateSource(
        existingId: String? = null,
        name: String,
        type: SourceType,
        url: String = "",
        rawText: String = "",
        host: String = "",
        username: String = "",
        password: String = "",
        headers: Map<String, String> = emptyMap(),
        activateImmediately: Boolean = true
    ) {
        val id = existingId ?: repo.newId()
        val displayName = name.ifBlank {
            when (type) {
                SourceType.M3U_URL -> "قائمة M3U"
                SourceType.M3U_FILE -> "ملف محلي"
                SourceType.M3U_TEXT -> "قائمة نصية"
                SourceType.XTREAM -> "Xtream (${username.ifBlank { host }})"
                SourceType.SINGLE_CHANNEL -> "قناة منفردة"
            }
        }

        val draftConfig = SourceConfig(
            id = id,
            name = displayName,
            type = type,
            url = url.trim(),
            rawText = rawText,
            host = host.trim(),
            username = username.trim(),
            password = password.trim(),
            headers = headers,
            status = SourceStatus.UPDATING,
            isActive = activateImmediately || _ui.value.sources.isEmpty()
        )

        viewModelScope.launch {
            _ui.update { it.copy(isLoading = true, bannerMessage = null) }
            val result = repo.fetchSourcePayload(draftConfig)
            result.onSuccess { freshPayload ->
                val oldPayload = if (existingId != null) repo.loadPayload(id) else SourcePayload(emptyList(), emptyList())
                val merged = if (existingId != null) repo.mergePreservingSettings(oldPayload, freshPayload) else freshPayload
                repo.savePayload(id, merged)

                val savedConfig = draftConfig.copy(
                    status = SourceStatus.OK,
                    statusMessage = "تم التحديث بنجاح",
                    lastUpdatedMs = System.currentTimeMillis(),
                    groupCount = merged.groups.size,
                    channelCount = merged.channels.size,
                    accountInfo = merged.accountInfo
                )

                val currentList = _ui.value.sources.filterNot { it.id == id }.map {
                    if (savedConfig.isActive) it.copy(isActive = false) else it
                } + savedConfig
                repo.saveAllSources(currentList)
                loadFromDisk()
                _ui.update {
                    it.copy(
                        isLoading = false,
                        bannerMessage = "تم حفظ المصدر (${merged.channels.size} قناة، ${merged.groups.size} مجموعة)"
                    )
                }
            }.onFailure { err ->
                _ui.update {
                    it.copy(
                        isLoading = false,
                        bannerMessage = err.message ?: "فشل إضافة أو تحديث المصدر"
                    )
                }
            }
        }
    }

    fun testSource(sourceId: String) {
        val target = _ui.value.sources.firstOrNull { it.id == sourceId } ?: return
        viewModelScope.launch {
            _ui.update { it.copy(isLoading = true, bannerMessage = null) }
            val res = repo.fetchSourcePayload(target)
            val msg = res.fold(
                onSuccess = { "اختبار ناجح: ${it.channels.size} قناة و ${it.groups.size} مجموعة" },
                onFailure = { "فشل الاختبار: ${it.message}" }
            )
            _ui.update { it.copy(isLoading = false, bannerMessage = msg) }
        }
    }

    fun refreshSource(sourceId: String, silent: Boolean = false) {
        val target = _ui.value.sources.firstOrNull { it.id == sourceId } ?: return
        viewModelScope.launch {
            if (!silent) _ui.update { it.copy(isLoading = true, bannerMessage = null) }
            val res = repo.fetchSourcePayload(target)
            res.onSuccess { fresh ->
                val old = repo.loadPayload(sourceId)
                val merged = repo.mergePreservingSettings(old, fresh)
                repo.savePayload(sourceId, merged)

                val updatedSources = _ui.value.sources.map {
                    if (it.id == sourceId) {
                        it.copy(
                            status = SourceStatus.OK,
                            statusMessage = "تم التحديث بنجاح",
                            lastUpdatedMs = System.currentTimeMillis(),
                            groupCount = merged.groups.size,
                            channelCount = merged.channels.size,
                            accountInfo = merged.accountInfo
                        )
                    } else it
                }
                repo.saveAllSources(updatedSources)
                if (_ui.value.activeSource?.id == sourceId) {
                    _ui.update {
                        it.copy(
                            sources = updatedSources,
                            activeSource = updatedSources.firstOrNull { s -> s.id == sourceId },
                            groups = merged.groups,
                            channels = merged.channels,
                            favoriteIds = merged.favoriteIds,
                            isLoading = false,
                            bannerMessage = if (silent) null else "تم تحديث المصدر (${merged.channels.size} قناة)"
                        )
                    }
                } else {
                    _ui.update {
                        it.copy(
                            sources = updatedSources,
                            isLoading = false,
                            bannerMessage = if (silent) null else "تم تحديث المصدر (${merged.channels.size} قناة)"
                        )
                    }
                }
            }.onFailure { err ->
                // Preserve existing data on failure! Never overwrite with empty/failed result
                val updatedSources = _ui.value.sources.map {
                    if (it.id == sourceId) {
                        it.copy(
                            status = SourceStatus.ERROR,
                            statusMessage = err.message ?: "فشل التحديث"
                        )
                    } else it
                }
                repo.saveAllSources(updatedSources)
                _ui.update {
                    it.copy(
                        sources = updatedSources,
                        activeSource = updatedSources.firstOrNull { s -> s.isActive },
                        isLoading = false,
                        bannerMessage = if (silent) null else "فشل التحديث (تم الاحتفاظ بالبيانات الحالية): ${err.message}"
                    )
                }
            }
        }
    }
}
