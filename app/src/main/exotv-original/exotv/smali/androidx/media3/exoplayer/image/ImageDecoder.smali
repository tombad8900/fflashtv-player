.class public interface abstract Landroidx/media3/exoplayer/image/ImageDecoder;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lm1/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/image/ImageDecoder$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm1/d;"
    }
.end annotation


# virtual methods
.method public abstract synthetic dequeueInputBuffer()Ljava/lang/Object;
.end method

.method public abstract dequeueOutputBuffer()Landroidx/media3/exoplayer/image/ImageOutputBuffer;
.end method

.method public bridge synthetic dequeueOutputBuffer()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-interface {p0}, Landroidx/media3/exoplayer/image/ImageDecoder;->dequeueOutputBuffer()Landroidx/media3/exoplayer/image/ImageOutputBuffer;

    move-result-object v0

    return-object v0
.end method

.method public abstract synthetic flush()V
.end method

.method public abstract synthetic getName()Ljava/lang/String;
.end method

.method public bridge synthetic queueInputBuffer(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lm1/g;

    invoke-interface {p0, p1}, Landroidx/media3/exoplayer/image/ImageDecoder;->queueInputBuffer(Lm1/g;)V

    return-void
.end method

.method public abstract queueInputBuffer(Lm1/g;)V
.end method

.method public abstract synthetic release()V
.end method

.method public abstract synthetic setOutputStartTimeUs(J)V
.end method
