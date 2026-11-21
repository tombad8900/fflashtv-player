# EXO TV Player

Android IPTV and VOD application integrating the EXO TV playback workflow into a single Media3-based player.

## Current implementation

- One playback entry point: `ExoTvPlayerActivity`, shared by IPTV playlists and captured VOD sources.
- Media3 ExoPlayer is the only active playback engine.
- EXO catalog and stream resolution: default, YTV, O, GEN and backup-source resolution.
- Per-stream request headers, including User-Agent, Referer and cookies.
- M3U and Xtream source ingestion with provider category ordering.
- Playback session, track selection, history, DRM and recovery components.
- TMDB embed capture through the same player entry point.

## EXO TV original reference

The original EXO TV APK extraction is retained under `app/src/main/exotv-original/` as a reference archive. It contains the original PlayerActivity, models, resources and Media3 implementation. This archive is reference material; it is not compiled as Android source. Runtime behavior must be ported into the app's Kotlin/Compose implementation and verified against the original before claiming a complete transfer.

## Main source tree

`app/src/main/java/com/fflashtv/player`

- `exotv/` — EXO catalog and stream resolvers.
- `core/` — Media3 player engine and media item construction.
- `session/` — playback session lifecycle and state.
- `sources/` — M3U, Xtream and source models.
- `tmdb/` — TMDB catalog and external source capture.
- `ui/` — library, sources and the single EXO player UI.

## Build

Run the repository's Gradle Android debug build workflow. A successful compile is necessary but does not by itself prove playback parity with the original EXO TV app.
