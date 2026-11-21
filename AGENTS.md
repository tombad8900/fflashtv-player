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
- The user's existing STAR project is at `~/STAR`; its browser integration is `app/src/main/java/com/lagradost/cloudstream3/features/browser/BrowserScreen.kt`.
- STAR uses the native `org.mlm.adblock.AdblockEngine` wrapper with `libadblock_ffi.so`; this is bundled from the APK/source, not fetched as a Maven dependency.
- STAR assets include `app/src/main/assets/adblock/initial_filters.txt`, `resources.json`, and eight lists under `assets/adblock/lists/`:
  `brave-android-specific.txt`, `brave-specific.txt`, `brave-unbreak.txt`, `easylist.txt`, `easyprivacy.txt`, `liste-ar.txt`, `peter-lowe.txt`, `ublock-filters.txt`.
- Native library ABI folders in STAR: `app/src/main/jniLibs/{arm64-v8a,armeabi-v7a,x86,x86_64}/libadblock_ffi.so`.
- Do not replace that engine with a domain-only parser or claim full ABP compatibility from a host list.
- The STAR working tree is on the user's Termux device and is not directly readable through this repository connection. Obtain the exact files/binaries before porting; do not substitute unrelated implementations.
- Filter updates should be versioned, cached locally, and applied atomically; retain the last known-good lists when an update fails.
- Never block media or subtitle requests solely because they are cross-origin.

## Validation expectations
- Review every changed file after editing.
- Build the debug variant and report the actual result; do not equate a successful compile with successful stream extraction.
- Test at least: page-load capture, user-triggered playback, delayed HLS/DASH requests, subtitle capture, popup/ad blocking, and no-candidate timeout.
- Treat DRM and MSE/Blob playback as fallback cases; do not claim their media URLs can always be extracted.
