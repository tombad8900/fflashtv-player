.class public interface abstract Landroidx/media3/exoplayer/upstream/experimental/BandwidthEstimator;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final ESTIMATE_NOT_AVAILABLE:J = -0x8000000000000000L


# virtual methods
.method public abstract addEventListener(Landroid/os/Handler;Landroidx/media3/exoplayer/upstream/BandwidthMeter$EventListener;)V
.end method

.method public abstract getBandwidthEstimate()J
.end method

.method public abstract onBytesTransferred(Lk1/h;I)V
.end method

.method public abstract onNetworkTypeChange(J)V
.end method

.method public abstract onTransferEnd(Lk1/h;)V
.end method

.method public abstract onTransferInitializing(Lk1/h;)V
.end method

.method public abstract onTransferStart(Lk1/h;)V
.end method

.method public abstract removeEventListener(Landroidx/media3/exoplayer/upstream/BandwidthMeter$EventListener;)V
.end method
