.class public interface abstract Landroidx/media3/exoplayer/source/ads/AdsLoader;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/source/ads/AdsLoader$EventListener;,
        Landroidx/media3/exoplayer/source/ads/AdsLoader$Provider;
    }
.end annotation


# virtual methods
.method public abstract handlePrepareComplete(Landroidx/media3/exoplayer/source/ads/AdsMediaSource;II)V
.end method

.method public abstract handlePrepareError(Landroidx/media3/exoplayer/source/ads/AdsMediaSource;IILjava/io/IOException;)V
.end method

.method public abstract release()V
.end method

.method public abstract setPlayer(Landroidx/media3/common/d1;)V
.end method

.method public varargs abstract setSupportedContentTypes([I)V
.end method

.method public abstract start(Landroidx/media3/exoplayer/source/ads/AdsMediaSource;Lk1/l;Ljava/lang/Object;Landroidx/media3/common/d;Landroidx/media3/exoplayer/source/ads/AdsLoader$EventListener;)V
.end method

.method public abstract stop(Landroidx/media3/exoplayer/source/ads/AdsMediaSource;Landroidx/media3/exoplayer/source/ads/AdsLoader$EventListener;)V
.end method
