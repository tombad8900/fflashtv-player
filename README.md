# FFlashTV Player

Standalone Android media & IPTV player with dual independent playback engines (**AndroidX Media3 ExoPlayer** and **libmpv**), IPTV library & multi-source management, Connection Limit Mode, and TMDB integration.

## Project Structure (`app/src/main/java/com/fflashtv/player`)
- `model/` — `PlaybackInput`, `ParsedPlayback`, `DrmConfig`, `WatchSnapshot`, `HistoryEntry`
- `network/` — `NetworkClient`, `HeaderInterceptor`, `StreamDataSourceFactory`, `TlsConfig`
- `resolver/` — `StreamProbe`, `MimeResolver`, `PlaybackInputParser`
- `buffer/` — `BufferManager`, `BufferProfile`
- `drm/` — `DrmManager`, `ClearKeyProvider`, `WidevineProvider`
- `recovery/` — `RecoveryController`, `ErrorClassifier`, `RetryPolicy`, `FormatFallback`
- `tracks/` — `TrackManager`, `TrackInfo`
- `history/` — `WatchTracker`, `WatchProgressStore`, `WatchHistoryRepository`
- `core/` — `MpvOrMedia3Engine`, `MediaItemFactory`, `FormatSwitcher`, `LiveStreamManager`
- `session/` — `PlaybackSessionManager`, `PlaybackSession`, `PlaybackState`
- `mpv/` — `MpvEngine`, `MpvModels`, `MpvPlayerScreen`, `MpvPlayerActivity`
- `netlimit/` — `ConnectionLimitManager`, `InstantKillSocketFactory`, `ActiveSocketRegistry`, `LocalStreamProxy`, `ConnectionAuditLog`
- `sources/` — `SourceModels`, `M3uParser`, `XtreamClient`, `SourceRepository`
- `tmdb/` — `TmdbClient`, `JsonServersStore`, `HiddenStreamSniffer`, `TmdbLibraryView`, `TmdbModels`
- `ui/` — `MainActivity`, `LibraryScreen`, `LibraryViewModel`, `SourcesScreen`, `PlayerActivity`, `PlayerScreen`, `PlayerControls`, `PlayerDialogs`, `PlayerViewModel`
