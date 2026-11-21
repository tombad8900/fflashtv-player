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
- `tmdb/TmdbLibraryView.kt`: builds ordered embed requests from enabled source servers and launches EXO TV before any stream capture; resolution runs inside the player Activity.
- `ui/PlayerLaunchBridge.kt`: normalizes ChannelItem playlists into PlaybackInput and dispatches only to ExoTvPlayerActivity.
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
- The shared player bridge has a single launch API and no engine-selection enum or parameter.
- Hidden WebView resolver code using visibility/layer constants must import `android.view.View`.
- Always run `:app:assembleDebug` after Kotlin integration changes; Termux builds may emit non-fatal NDK `llvm-strip` host-binary warnings while packaging unstripped native libraries.
- The Android Actions workflow must upload `app/build/outputs/apk/debug/*.apk` as the `FFlashTV-debug-apk` artifact after a successful build so the user can install the exact tested commit.


## Official EXO TV-only launch migration
- All app playback entry points must call `PlayerLaunchBridge.launch`; the bridge always opens `ExoTvPlayerActivity`. The launch bridge exposes no engine selector or engine parameter.
- IPTV channel taps launch the EXO TV Activity directly without an engine chooser.
- TMDB movie/episode playback automatically tries enabled JSON servers in configured priority order, captures the first usable stream with `ExoWebViewResolver`, and launches EXO TV directly. Do not add manual server or engine selection to the viewing flow.
- Legacy Media3 and libmpv Activities, screens, engine sources, and the libmpv Gradle dependency have been removed. Keep EXO TV as the only playback presentation.
- EXO TV here is the EXO-derived player presentation on AndroidX Media3; do not claim that the proprietary APK's complete binary/classes were transplanted from Smali.

## EXO player feature port
- Player controls separate alternate server/source selection from in-stream video-track quality selection.
- Controls include previous/next playlist navigation when available, 10-second seek, mute and volume dialog, playback-speed presets, aspect-ratio cycling, fullscreen, PiP, and playback diagnostics.
- Android TV/remote input is handled through D-pad, center/enter, media play/pause/next/previous, and volume keys; touch double-tap seeking remains available.
- External subtitle URLs are added to the active media item after HTTP/HTTPS validation; Media3 handles supported SRT/VTT/ASS subtitle tracks.
- Server switching preserves VOD position and uses the selected candidate's own headers; it must not advance playlist navigation.
- On retryable network/parsing failures, try each untried backup candidate sequentially with that candidate's headers/DRM before MIME fallback; never launch concurrent retries for one session. Reset the attempted-server set after the first frame of a stable candidate.
- Match reference behavior from the inspected layout: distinct server, quality, subtitle, error, seek, and bottom-control panels. Do not claim full parity until each behavior is verified.

## Private EXO reference APK decompilation
- The source repository `tombad8900/exotv-analysis-reference` is private; the connected GitHub account can read its contents directly. The earlier Actions checkout failure was a workflow-token limitation, not a lack of repository access.
- The workflow `.github/workflows/decompile-exotv-reference.yml` is manual (`workflow_dispatch`) and uses the repository secret `REFERENCE_REPO_TOKEN` for the source checkout.
- Do not make the reference repository public merely to inspect it. If an Actions checkout is needed, use an appropriately scoped secret; never commit tokens or APK credentials.
- The workflow uploads `exotv-original-apk-decompiled` containing Apktool resources/manifest and JADX Java output plus the original APK. Download and inspect the artifact before claiming a complete source port.


## EXO reference import and UI parity follow-up
- The decompiled reference snapshot is preserved under `app/src/main/exotv-original/` for analysis only. It is intentionally outside the Android source/resource source sets: JADX output contains decompiler artifacts, obfuscated app dependencies, framework/library classes, and generated resource IDs that cannot be compiled as a drop-in module.
- The reference `activity_player.xml` is the layout baseline: black full-screen PlayerView, a compact title overlay, centered buffering/error overlays, bottom scrim with VOD seek row, and seven evenly distributed controls (play/pause, mute, servers, resize, subtitles when available, quality, close).
- `ExoTvPlayerScreen.kt` now follows that reference control hierarchy rather than the previous oversized horizontally scrolling toolbar. Keep additional capabilities in contextual dialogs or secondary interactions; do not crowd the primary control row.
- The imported JADX `PlayerActivity.java` is evidence for behavior and feature mapping, not a compilable Activity replacement. Continue implementing behavior against FFlashTV's existing Media3 session manager and its single registered player Activity; never add the reference app's duplicate AndroidX/Media3 source classes or package-level `R.java` to the build.


## TMDB launch/session handoff
- Selecting a TMDB movie or episode must open `ExoTvPlayerActivity` immediately. Do not call `ExoWebViewResolver.capture` from `TmdbLibraryView` or show a pre-player source-scanning dialog.
- `PlayerLaunchBridge.launchEmbed` passes an ordered list of embed URLs and each server's own headers to the player. `ExoTvPlayerActivity` attaches the player UI first, then resolves candidates sequentially with the existing resolver.
- The Activity shows the player's buffering overlay while resolution is running. The first successful capture becomes one VOD `PlaybackInput`; remaining captured URLs become server alternatives with their own request headers. They must not become playlist items or trigger automatic episode navigation.
- Keep IPTV playlist launch unchanged through `PlayerLaunchBridge.launch`. Both launch paths must converge on the same EXO TV Activity and Media3 session manager.
- If all embed sources fail, show the final resolver error and close the player; never silently leave a blank player or start resolution in the library screen.


## Current EXO APK audit (2026-11-21)
- The currently uploaded installed APK is the 4.5 MiB asset from release tag `exotv-original-apk-20261121-115123`, SHA-256 `3483238f924aa0637116770138e96bbcfef8a50b2d4d4e6df652b824aefa4c28`.
- Full decompilation workflow run `44886920755` completed successfully; artifact `14700526027` (`exotv-original-apk-and-full-decode`) contains the current Apktool and JADX output.
- Current decoded inventory: 5,416 Apktool files, including 4,277 Smali files and 1,118 resource files; JADX output contains 4,523 files including 3,372 Java files. The decoded APK has 2 assets and no `.so` native libraries. The player layout is `res/layout/activity_player.xml`.
- `com.exotv.net.PlayerActivity` is the original player Activity and directly uses AndroidX Media3 ExoPlayer and PlayerView. Its decompiled source references 224 distinct class descriptors, including obfuscated helper packages and EXO model classes; it is not a standalone Activity that can be copied into the Kotlin app without its exact dependencies, resource mapping, and manifest integration.
- Existing `app/src/main/exotv-original/` is an analysis snapshot, not a build source set. The prior snapshot contains 4,491 files and does not include the current complete Apktool Smali tree. Do not claim that the full original player payload has already been integrated.
- A full-snapshot import workflow was added at `.github/workflows/import-exotv-full-source.yml`. Its first run `44887224588` failed at checkout of the private reference repository because `secrets.REFERENCE_REPO_TOKEN` is not configured in this target repository. Do not claim import completion or rerun unchanged. The GitHub connector can read the reference repo, but Actions cannot access it without a repository-scoped credential.
- The current source artifact is available for analysis. Continue mapping the original PlayerActivity's behavior and dependencies against FFlashTV's single Media3 session/player implementation. Never copy decompiled JADX output or the original package's duplicate AndroidX classes into the Gradle source set, and never report a full binary transplant unless the classes, resources, and runtime launch path are actually integrated and validated.


## Original EXO server-list and failover behavior port (2026-11-21)
- The original EXO PlayerActivity receives a primary stream plus an ordered exo_backups list. Each backup is a distinct URL with its own request headers and optional display name; this is not a video quality track or a playlist item.
- PlaybackInput now carries backupSources separately from qualities. The EXO resolver's secondary stream candidates are mapped to backup servers, while Media3 track/quality selection remains separate.
- The player server dialog displays the active source and ordered backup servers. Selecting a server switches the same media item, preserves VOD position, and keeps that server's own headers.
- Retryable I/O/parsing failures try unattempted EXO backup servers sequentially before the legacy quality fallback. The attempted-server set prevents repeated requests to the same URL during one recovery chain.
- This is a focused port of EXO's per-server UI/header/failover contract. It does not mean the original EXO channel catalog, remote config service, all resolver families, or proprietary app shell have been transplanted yet.


## EXO remote catalog and simple resolver port (2026-11-21)
- Added the EXO appConfig.php loader and channelsURL payload decoder. The decoder matches the original Base64 URL-safe normalization followed by XOR with the EXO payload key; decoded configuration is kept in memory.
- Added the original channel/category field contract, including backupURLs objects with per-server headers and the exact resolver-kind precedence/null checks from Channel.getResolverKind().
- Added an EXO TV catalog tab in the existing library. It fetches the remote catalog, groups channels by EXO categories, and sends resolved sources through the shared FFlash player entry point.
- Ported BACKUP, YTV, O, and DEFAULT channel resolution flows, including the original response token/XOR handling for YTV/DEFAULT and AES-CBC decoding for O.
- Added the GEN resolver path: app_tv_box settings decryption, x-v3 HMAC authentication, recursive /get/ lookup, server-number selection, remote IP lookup, stream/id/direct URL signing, and per-server headers. Runtime verification against live EXO servers is still required.


## Original EXO player data-source migration (2026-11-21)
- Replaced the FFlash-specific ExoPlayerEngine with ExoTvOriginalPlayerEngine. It builds Media3 through DefaultMediaSourceFactory + DefaultHttpDataSource.Factory, enables cross-protocol redirects, uses 5s connect / 12s read timeouts, passes original request headers, and applies the original Chrome 151 fallback User-Agent only when no User-Agent header is supplied.
- The engine uses Media3's default LoadControl and renderer stack, matching the original EXO PlayerActivity construction path. Session playback continues to own media-item creation, subtitles, resume position, and watch tracking.
- Removed the FFlash BufferManager, StreamDataSourceFactory, Media3 OkHttp data-source dependency, and the custom Media3 load-error policy factory. OkHttp remains for EXO server/config resolvers, probes, and network services.
- Build verification for the latest engine migration is pending; do not claim it is complete until the GitHub Actions APK build succeeds.
