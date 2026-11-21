.class public interface abstract Landroidx/media3/exoplayer/source/SampleStream;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/source/SampleStream$ReadDataResult;,
        Landroidx/media3/exoplayer/source/SampleStream$ReadFlags;
    }
.end annotation


# static fields
.field public static final FLAG_OMIT_SAMPLE_DATA:I = 0x4

.field public static final FLAG_PEEK:I = 0x1

.field public static final FLAG_REQUIRE_FORMAT:I = 0x2


# virtual methods
.method public abstract isReady()Z
.end method

.method public abstract maybeThrowError()V
.end method

.method public abstract readData(Landroidx/media3/exoplayer/FormatHolder;Lm1/g;I)I
.end method

.method public abstract skipData(J)I
.end method
