.class public final Landroidx/media3/exoplayer/hls/HlsManifest;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final mediaPlaylist:Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;

.field public final multivariantPlaylist:Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsManifest;->multivariantPlaylist:Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/HlsManifest;->mediaPlaylist:Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;

    .line 7
    .line 8
    return-void
.end method
