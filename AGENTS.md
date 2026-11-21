# AGENTS.md

## Project
- App: FFlashTV Player
- Repository: tombad8900/fflashtv-player
- Package / namespace: com.fflashtv.player
- Main stack: Kotlin, Jetpack Compose, AndroidX Media3 ExoPlayer, OkHttp.

## Build
- The repository uses a system Gradle installation; there is no Gradle wrapper.
- Android debug build command in the project environment: `gradle :app:assembleDebug`.
- Debug APK output: `app/build/outputs/apk/debug/`.

## Existing architecture
- `tmdb/ExoWebViewResolver.kt`: EXO TV-derived hidden WebView resolver, event bridge, player-page hops, stream/subtitle discovery, cookie/header export, and bounded cleanup.
- `tmdb/TmdbLibraryView.kt`: builds the existing source embed URL, calls ExoWebViewResolver, and offers the three player presentations.
- `ui/PlayerLaunchBridge.kt`: normalizes ChannelItem playlists into PlaybackInput and dispatches to Media3, libmpv, or EXO-style player Activity.
- `ui/ExoTvPlayerActivity.kt` and `ui/ExoTvPlayerScreen.kt`: EXO-style Media3 player presentation.
- `resolver/`: MIME probing and playback input parsing.
- `network/`, `session/`, `recovery/`, `buffer/`, `netlimit/`: existing playback/network/session controls.
- `ui/ExoTvPlayerActivity.kt` and `ui/ExoTvPlayerScreen.kt`: the sole playback presentation; `core/ExoPlayerEngine` owns the Media3 ExoPlayer instance.

## EXO TV source resolver port
- The old visible WebView sniffer has been removed. The only TMDB source-capture implementation is the Kotlin adaptation of EXO TV's `z4/e0`, `z4/b0`, `z4/d0`, `z4/c0`, and `z4/g0` flow.
- The source page is hosted in an attached 1x1 WebView. The document viewport is spoofed to 1280x720 and document visibility is kept visible, matching the EXO approach.
- Use the EXO desktop Chrome User-Agent, JavaScript, DOM storage, file access, mixed content, first-party cookies, and third-party cookies.
- The JS chain polls every 250ms; it detects the player's own source from video/source elements and Performance Resource Timing, watches fetch/XHR responses and dynamically assigned media URLs, and extracts stream URLs from response text.
- The JS chain performs one real player-control click attempt and one `video.play()` attempt after the initial wait. Do not add repeated clicking or arbitrary link activation.
- Follow the EXO hop chain using `window.CFG.playerUrl`, `player_frame`, `player_iframe`, and iframe fallback candidates. Keep hop count bounded and reject known ad hosts.
- Preserve EXO event semantics: `stream`, `hop`, `stall`, `expired`, `limited`, `exhausted`, and `err`. The resolver has a bounded overall timeout and must remove callbacks, detach, stop, and destroy the WebView on success, failure, cancellation, and timeout.
- WebView callbacks may arrive on background threads. Never call WebView instance methods from `shouldInterceptRequest`; post candidate updates to the main handler. Keep the top-level page URL in an atomic snapshot.
- Export actual cookies for each captured candidate using CookieManager and carry each candidate's own headers. Do not merge one candidate's Cookie/Authorization/Referer into another candidate.
- The primary candidate and backups are represented as `SniffedCandidate` and `QualityOption`; alternatives are not playlist entries and must never advance to another movie/episode.
- The original EXO metadata/TMDB resolver is not ported: FFlashTV's existing `JsonServersStore.buildEmbedUrl` remains authoritative.
- DRM-protected MSE/Blob streams are not guaranteed to expose a reusable URL. Do not claim universal extraction.

## Player architecture and EXO player port
- The standard Media3 and libmpv player Activities and the libmpv dependency have been removed; only the EXO TV presentation remains.
- EXO TV's inspected PlayerActivity also uses AndroidX Media3 ExoPlayer and PlayerView; it is not a third independent decoding engine. The EXO option is a distinct player presentation/session experience built over the existing Media3 session architecture.
- There is one player presentation: EXO TV. Its decoder is AndroidX Media3 ExoPlayer.
- The EXO presentation should preserve the reference's black full-screen video surface, title overlay, buffered/error states, bottom seek row, play/pause, mute, server/quality/subtitle/resize/close controls, and PiP/lifecycle behavior.
- Keep playback headers and backup candidate headers scoped per URL. The session manager's quality selection path is the current handoff for alternatives; do not turn backups into playlist items.
- The current EXO-style screen is a first implementation of the reference control layout, not yet a claim of complete feature parity with the original proprietary app. Continue porting only after inspecting the exact corresponding EXO methods and controls.

## Brave ad-block integration
- The original STAR implementation was supplied in `STAR-Brave-Integration.zip` and reviewed. Its native engine is `org.mlm.adblock.AdblockEngine`, backed by `libadblock_ffi.so`; it is not a Maven dependency.
- Source wrappers now live in FFlashTV under `app/src/main/java/org/mlm/adblock/`: `AdblockEngine.java`, `BlockDecision.java`, and `RequestTypeMapper.kt`. The app-facing manager/engine/settings are under `com/fflashtv/player/adblock/`.
- The original filter manager defines eight source URLs and a manual refresh action. The bundled `initial_filters.txt` contains all eight named sections; the ZIP also contains a standalone `ublock-filters.txt` asset. Do not treat the absence of seven separate text files as missing list definitions.
- FFlashTV's manager uses cached lists, then the standalone asset, then the matching section in `initial_filters.txt`; it validates downloaded content, writes through a temporary file, keeps a `.bak` copy of the previous cache, and rebuilds the native engine after manual refresh.
- The STAR native binaries and required assets have been copied into FFlashTV at `app/src/main/jniLibs/{arm64-v8a,armeabi-v7a}/libadblock_ffi.so` and `app/src/main/assets/adblock/{resources.json,initial_filters.txt,lists/ublock-filters.txt}`; ABI filters are arm64-v8a and armeabi-v7a.
- The engine is initialized asynchronously when MainActivity opens. The settings card is in SourcesScreen and retains manual list selection/refresh; no automatic network refresh is claimed.
- Brave filtering is connected to ExoWebViewResolver's request-interception path. Known media and subtitle requests must bypass ad filtering.
- This is network-request filtering only at present. The wrapper exposes redirect/rewrite fields but the app currently applies matched/exception decisions only; cosmetic filtering and scriptlet injection are not implemented.
- Do not replace the native engine with a domain-only parser or claim full ABP/cosmetic compatibility.
- Never block media or subtitle requests solely because they are cross-origin.

## Validation expectations
- Review every changed file after editing.
- Build the debug variant and report the actual result; do not equate a successful compile with successful stream extraction.
- Resolver tests must cover initial page load, 250ms poll/event chain, one-shot play attempt, primary and iframe hops, delayed stream requests, candidate header/cookie export, subtitle capture, ad filtering exemptions, 403/410 expiry, rate limiting, exhausted source, stall, cancellation, timeout, and WebView cleanup.
- Player tests must cover EXO TV Activity launch; candidate selection must retain its own headers and must not alter playlist navigation.
- Treat DRM and MSE/Blob playback as fallback cases; do not claim their media URLs can always be extracted.
- A successful build does not establish runtime correctness. Device testing is still required for stream capture, playback, PiP, rotation, and Back behavior.


## Build validation fixes
- `PlayerLaunchBridge` has one canonical definition in `ui/PlayerLaunchBridge.kt`; do not redeclare it in `LibraryViewModel.kt`.
- The shared player bridge owns the `MEDIA3`, `LIBMPV`, and `EXOTV` presentation selection.
- Hidden WebView resolver code using visibility/layer constants must import `android.view.View`.
- Always run `:app:assembleDebug` after Kotlin integration changes; Termux builds may emit non-fatal NDK `llvm-strip` host-binary warnings while packaging unstripped native libraries.


## Official EXO TV-only launch migration
- All app playback entry points must call `PlayerLaunchBridge.launch`; the bridge always opens `ExoTvPlayerActivity`. The launch bridge exposes no engine selector or engine parameter.
- IPTV channel taps launch the EXO TV Activity directly without an engine chooser.
- TMDB movie/episode playback automatically tries enabled JSON servers in configured priority order, captures the first usable stream with `ExoWebViewResolver`, and launches EXO TV directly. Do not add manual server or engine selection to the viewing flow.
- Legacy Media3 and libmpv Activities, screens, engine sources, and the libmpv Gradle dependency have been removed. Keep EXO TV as the only playback presentation.
- EXO TV here is the EXO-derived player presentation on AndroidX Media3; do not claim that the proprietary APK's complete binary/classes were transplanted from Smali.
