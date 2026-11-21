# AGENTS.md

## Project
- App: FFlashTV Player
- Repository: tombad8900/fflashtv-player
- Package / namespace: com.fflashtv.player
- Main stack: Kotlin, Jetpack Compose, Media3, libmpv, OkHttp.

## Build
- The repository uses a system Gradle installation; there is no Gradle wrapper.
- Android debug build command in the project environment: `gradle :app:assembleDebug`.
- Debug APK output: `app/build/outputs/apk/debug/`.

## Existing architecture
- `tmdb/HiddenStreamSniffer.kt`: WebView source-page inspection, stream/subtitle candidate capture, request headers, and handoff data.
- `resolver/`: MIME probing and playback input parsing.
- `network/`, `session/`, `recovery/`, `buffer/`, `netlimit/`: existing playback/network/session controls.
- `mpv/` and `ui/Player*`: libmpv and Media3 playback paths.

## Source capture decisions
- Keep the source page visible and interactive while capture is running.
- Start network and media observation before the user starts playback; continue observing after the user gesture.
- Do not autoplay media, synthesize generic DOM clicks, or click arbitrary page buttons/links.
- The app-owned Play overlay may forward a trusted Android touch only to a recognized player-specific control. If no known control is found, leave the page available for a deliberate user tap.
- Do not select a candidate until the user has initiated playback and the candidate set has had a short quiet period to stabilize.
- Preserve relevant request headers, cookies, referer, user-agent, and subtitle candidates.
- Prefer HLS/DASH manifests over standalone MP4 candidates when ranking captured resources.
- Known ad hosts/paths must be filtered without blocking stream manifests, segments, or subtitles.

## Brave ad-block integration
- The original STAR implementation was supplied in `STAR-Brave-Integration.zip` and reviewed. Its native engine is `org.mlm.adblock.AdblockEngine`, backed by `libadblock_ffi.so`; it is not a Maven dependency.
- Source wrappers now live in FFlashTV under `app/src/main/java/org/mlm/adblock/`: `AdblockEngine.java`, `BlockDecision.java`, and `RequestTypeMapper.kt`. The app-facing manager/engine/settings are under `com/fflashtv/player/adblock/`.
- The original filter manager defines eight source URLs and a manual refresh action. The bundled `initial_filters.txt` contains all eight named sections; the ZIP also contains a standalone `ublock-filters.txt` asset. Do not treat the absence of seven separate text files as missing list definitions.
- FFlashTV's manager uses cached lists, then the standalone asset, then the matching section in `initial_filters.txt`; it validates downloaded content, writes through a temporary file, keeps a `.bak` copy of the previous cache, and rebuilds the native engine after manual refresh.
- The native binaries and assets still must be copied from STAR into FFlashTV at `app/src/main/jniLibs/{arm64-v8a,armeabi-v7a}/libadblock_ffi.so` and `app/src/main/assets/adblock/{resources.json,initial_filters.txt,lists/ublock-filters.txt}`. The app ABI filters are arm64-v8a and armeabi-v7a.
- The engine is initialized asynchronously when MainActivity opens. The settings card is in SourcesScreen and retains manual list selection/refresh; no automatic network refresh is claimed.
- Brave filtering is connected to HiddenStreamSniffer's existing shouldInterceptRequest path. Known media/subtitle extensions and hosts discovered from captured playable resources bypass Brave filtering; the existing ad-host check remains for other requests.
- This is network-request filtering only at present. The wrapper exposes redirect/rewrite fields but the app currently applies matched/exception decisions only; cosmetic filtering and scriptlet injection are not implemented.
- Do not replace the native engine with a domain-only parser or claim full ABP/cosmetic compatibility.
- Never block media or subtitle requests solely because they are cross-origin.

## Validation expectations
- Review every changed file after editing.
- Build the debug variant and report the actual result; do not equate a successful compile with successful stream extraction.
- Test at least: page-load capture, user-triggered playback, delayed HLS/DASH requests, subtitle capture, popup/ad blocking, and no-candidate timeout.
- Treat DRM and MSE/Blob playback as fallback cases; do not claim their media URLs can always be extracted.

## Latest capture refinement (2026-11-21)
- A generic touch anywhere on the source WebView must not count as playback intent.
- Manual touch intent is accepted only when the touch lands inside a recognized media/player region (video, JW Player, Video.js, Plyr, DPlayer, Artplayer, Flowplayer, or an explicitly marked player container).
- Subtitle discoveries reset the candidate quiet-period timer so late subtitle requests are less likely to be missed before handoff.
- The app-owned Play overlay still targets recognized player controls; it must not click arbitrary page elements.
- Brave engine port is not yet implemented in FFlashTV. The exact STAR native wrapper, ABI libraries, and asset files must be obtained from the STAR working tree before integration; do not fabricate or substitute them.


## Brave integration status (2026-11-21)
- Source-code port and WebView request interception have been committed, but native binaries/assets have not yet been copied into this repository and no Android build has been run for this integration.
- Do not report Brave as operational until the two ARM native libraries and required assets are present, the app builds, and a device test confirms native initialization and request decisions.
