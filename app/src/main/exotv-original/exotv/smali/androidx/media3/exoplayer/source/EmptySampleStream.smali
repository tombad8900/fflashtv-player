.class public final Landroidx/media3/exoplayer/source/EmptySampleStream;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/source/SampleStream;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public isReady()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public maybeThrowError()V
    .locals 0

    .line 1
    return-void
.end method

.method public readData(Landroidx/media3/exoplayer/FormatHolder;Lm1/g;I)I
    .locals 0

    .line 1
    const/4 p1, 0x4

    .line 2
    invoke-virtual {p2, p1}, Lm1/a;->setFlags(I)V

    .line 3
    .line 4
    .line 5
    const/4 p1, -0x4

    .line 6
    return p1
.end method

.method public skipData(J)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method
