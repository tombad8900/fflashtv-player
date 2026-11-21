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
- The STAR native binaries and required assets have been copied into FFlashTV at `app/src/main/jniLibs/{arm64-v8a,armeabi-v7a}/libadblock_ffi.so` and `app/src/main/assets/adblock/{resources.json,initial_filters.txt,lists/ublock-filters.txt}` and pushed to `main` in commit `e106856`. The app ABI filters are arm64-v8a and armeabi-v7a.
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

## WebView threading fix (2026-11-21)
- `shouldInterceptRequest` may execute on a WebView background thread. Never call WebView instance methods such as `getUrl()` from that callback.
- `HiddenStreamSniffer` keeps the current top-level page URL in an `AtomicReference`, updated from UI-thread `onPageStarted`/`onPageFinished`, and reads only that snapshot during request interception.
- After changing WebView callbacks, verify that no WebView instance method is accessed from `shouldInterceptRequest`; a successful build is still required before device validation.

## Latest capture refinement (2026-11-21)
- A generic touch anywhere on the source WebView must not count as playback intent.
- Manual touch intent is accepted only when the touch lands inside a recognized media/player region (video, JW Player, Video.js, Plyr, DPlayer, Artplayer, Flowplayer, or an explicitly marked player container).
- Subtitle discoveries reset the candidate quiet-period timer so late subtitle requests are less likely to be missed before handoff.
- The app-owned Play overlay still targets recognized player controls; it must not click arbitrary page elements.
- Brave engine integration is now present in FFlashTV; see the status section below. Keep the native STAR wrapper, ARM ABI libraries, and bundled assets aligned with their original versions.


## Brave integration status (2026-11-21)
- Source-code port, WebView request interception, both ARM native libraries, and the required Brave assets are committed to `main`; native/assets commit: `e106856`.
- GitHub confirms all five native/asset paths exist. The large `initial_filters.txt` and `.so` blobs may not be returned inline by the GitHub file-content API, so presence is established by their repository paths/blob metadata rather than a text-content read.
- No Android build or device test has been run for this integration yet. Do not report Brave as operational until the app builds and a device test confirms native initialization, filter loading, and request decisions.

## Playback pipeline audit and strict-header fix (2026-11-21)
- Audited the current HiddenStreamSniffer, resolver, session, Media3, MPV, track, and local-proxy paths against the stream-handoff design.
- Existing capture behavior is interactive: it waits for a recognized player-region touch or the app-owned Play action, observes WebView requests plus fetch/XHR/video elements, waits for an 8-second candidate quiet period, and ranks HLS/DASH above MP4. Do not replace this with generic autoplay or arbitrary DOM clicks.
- SniffedStream currently carries one stream URL, one shared request-header map, and subtitle URL strings only. Subtitle-specific headers, MIME/language metadata, and per-origin session-header scoping are not modeled yet.
- Resource classification currently recognizes HLS, DASH, MP4, MKV, and WebM as playable candidates; .ts/.m4s are treated as segments and excluded as root candidates. Do not claim all direct TS sources are captured.
- StreamProbe checks HTTP Content-Type and a short body prefix, but it is bypassed while connection-limit mode is enabled. Unknown extensionless sources then fall back to HLS; this is a known detection limitation.
- MediaItemFactory attaches subtitle URLs but infers subtitle MIME mainly from URL text and marks every external subtitle configuration as default. Subtitle language/format metadata and subtitle-specific request headers need a richer model before being claimed complete.
- StreamDataSourceFactory previously passed the strict connection-limit OkHttp client directly to Media3. That client did not include SessionHeaderStore's HeaderInterceptor, so session Referer/Cookie/Authorization headers could be omitted in strict mode. Fixed in commit b6f538e by adding the same session header interceptor to the strict client clone. The updated file was re-fetched and verified; Android build/device validation remains pending.
- MPV strict mode routes playback through LocalStreamProxy. The proxy rewrites HLS playlists and child URI references, but it does not rewrite DASH MPD manifests, does not forward client Range headers, and does not preserve all upstream response headers/status metadata. Do not claim strict-proxy DASH or byte-range seeking is complete.
- Recovery classifies broad parsing/IO/DRM categories and uses a bounded linear delay, but does not parse HTTP status codes or Retry-After into a provider-aware policy. Do not claim Retry-After support.
- Current source inspection is static. A successful Termux build and device playback test are still required; the user has not yet tested the latest APK.


## Source WebView exit and capture UI fix (2026-11-21)
- The full-screen source WebView is hosted in an app-owned container with a compact top bar and close control; the oversized gold "تشغيل المصدر" overlay has been removed. Capture begins observing immediately, while the source's own player controls remain interactive.
- Register an Activity OnBackPressedCallback while capture is active. Back/close removes the WebView container, stops and destroys the WebView, cancels the capture polling job, and resumes the suspended capture with a cancellation result instead of allowing the MainActivity to finish.
- TmdbLibraryView restores the selected movie/server picker after capture cancellation and does not show a failure banner for an intentional exit.
- Device validation is still required. Verify Back and the close control return to the movie/server picker, that no activity is finished, that capture still detects a user-started stream, and that success handoff removes the WebView cleanly.
