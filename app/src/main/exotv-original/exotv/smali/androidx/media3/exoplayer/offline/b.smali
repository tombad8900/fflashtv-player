.class public final synthetic Landroidx/media3/exoplayer/offline/b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/text/TextOutput;
.implements Landroidx/media3/exoplayer/metadata/MetadataOutput;
.implements Landroidx/media3/exoplayer/trackselection/TrackSelector$InvalidationListener;


# virtual methods
.method public onCues(Lg1/c;)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/media3/exoplayer/offline/DownloadHelper;->a(Lg1/c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onMetadata(Landroidx/media3/common/t0;)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/media3/exoplayer/offline/DownloadHelper;->f(Landroidx/media3/common/t0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onTrackSelectionsInvalidated()V
    .locals 0

    .line 1
    invoke-static {}, Landroidx/media3/exoplayer/offline/DownloadHelper;->b()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
