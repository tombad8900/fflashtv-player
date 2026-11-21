.class public interface abstract Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioProcessorChain;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/common/audio/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/audio/DefaultAudioSink;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AudioProcessorChain"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# virtual methods
.method public abstract synthetic applyPlaybackParameters(Landroidx/media3/common/y0;)Landroidx/media3/common/y0;
.end method

.method public abstract synthetic applySkipSilenceEnabled(Z)Z
.end method

.method public abstract synthetic getAudioProcessors()[Landroidx/media3/common/audio/d;
.end method

.method public abstract synthetic getMediaDuration(J)J
.end method

.method public abstract synthetic getSkippedOutputFrameCount()J
.end method
