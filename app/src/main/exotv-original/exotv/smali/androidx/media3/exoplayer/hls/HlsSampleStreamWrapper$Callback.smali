.class public interface abstract Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper$Callback;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/source/SequenceableLoader$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Callback"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/media3/exoplayer/source/SequenceableLoader$Callback<",
        "Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onPlaylistRefreshRequired(Landroid/net/Uri;)V
.end method

.method public abstract onPrepared()V
.end method
