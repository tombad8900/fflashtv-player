.class interface abstract Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$MediaCodecListCompat;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "MediaCodecListCompat"
.end annotation


# virtual methods
.method public abstract getCodecCount()I
.end method

.method public abstract getCodecInfoAt(I)Landroid/media/MediaCodecInfo;
.end method

.method public abstract isFeatureRequired(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z
.end method

.method public abstract isFeatureSupported(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z
.end method

.method public abstract secureDecodersExplicit()Z
.end method
