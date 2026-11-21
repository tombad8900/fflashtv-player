.class public interface abstract Landroidx/media3/exoplayer/source/preload/PreloadMediaSource$PreloadControl;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/source/preload/PreloadMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "PreloadControl"
.end annotation


# virtual methods
.method public abstract onContinueLoadingRequested(Landroidx/media3/exoplayer/source/preload/PreloadMediaSource;J)Z
.end method

.method public onLoadedToTheEndOfSource(Landroidx/media3/exoplayer/source/preload/PreloadMediaSource;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract onPreloadError(Landroidx/media3/exoplayer/source/preload/PreloadException;Landroidx/media3/exoplayer/source/preload/PreloadMediaSource;)V
.end method

.method public abstract onSourcePrepared(Landroidx/media3/exoplayer/source/preload/PreloadMediaSource;)Z
.end method

.method public abstract onTracksSelected(Landroidx/media3/exoplayer/source/preload/PreloadMediaSource;)Z
.end method

.method public abstract onUsedByPlayer(Landroidx/media3/exoplayer/source/preload/PreloadMediaSource;)V
.end method
