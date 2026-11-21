.class public final Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Variant"
.end annotation


# instance fields
.field public final audioGroupId:Ljava/lang/String;

.field public final captionGroupId:Ljava/lang/String;

.field public final format:Landroidx/media3/common/w;

.field public final subtitleGroupId:Ljava/lang/String;

.field public final url:Landroid/net/Uri;

.field public final videoGroupId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Landroidx/media3/common/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->url:Landroid/net/Uri;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->format:Landroidx/media3/common/w;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->videoGroupId:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->audioGroupId:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->subtitleGroupId:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->captionGroupId:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method

.method public static createMediaPlaylistVariantUrl(Landroid/net/Uri;)Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;
    .locals 9

    .line 1
    new-instance v0, Landroidx/media3/common/v;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media3/common/v;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "0"

    .line 7
    .line 8
    iput-object v1, v0, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 9
    .line 10
    const-string v1, "application/x-mpegURL"

    .line 11
    .line 12
    invoke-static {v1}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, v0, Landroidx/media3/common/v;->l:Ljava/lang/String;

    .line 17
    .line 18
    new-instance v4, Landroidx/media3/common/w;

    .line 19
    .line 20
    invoke-direct {v4, v0}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 21
    .line 22
    .line 23
    new-instance v2, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;

    .line 24
    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v8, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    move-object v3, p0

    .line 30
    invoke-direct/range {v2 .. v8}, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;-><init>(Landroid/net/Uri;Landroidx/media3/common/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v2
.end method


# virtual methods
.method public copyWithFormat(Landroidx/media3/common/w;)Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;
    .locals 7

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->url:Landroid/net/Uri;

    .line 4
    .line 5
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->videoGroupId:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->audioGroupId:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v5, p0, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->subtitleGroupId:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v6, p0, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->captionGroupId:Ljava/lang/String;

    .line 12
    .line 13
    move-object v2, p1

    .line 14
    invoke-direct/range {v0 .. v6}, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;-><init>(Landroid/net/Uri;Landroidx/media3/common/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method
