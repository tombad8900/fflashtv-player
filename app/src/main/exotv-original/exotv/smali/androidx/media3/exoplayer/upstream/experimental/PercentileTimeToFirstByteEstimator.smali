.class public final Landroidx/media3/exoplayer/upstream/experimental/PercentileTimeToFirstByteEstimator;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/upstream/TimeToFirstByteEstimator;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/upstream/experimental/PercentileTimeToFirstByteEstimator$FixedSizeLinkedHashMap;
    }
.end annotation


# static fields
.field public static final DEFAULT_MAX_SAMPLES_COUNT:I = 0xa

.field public static final DEFAULT_PERCENTILE:F = 0.5f

.field private static final MAX_DATA_SPECS:I = 0xa


# instance fields
.field private final clock:Lh1/b;

.field private final initializedDataSpecs:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Lk1/l;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private isEmpty:Z

.field private final percentile:F

.field private final slidingPercentile:Landroidx/media3/exoplayer/upstream/SlidingPercentile;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0xa

    const/high16 v1, 0x3f000000    # 0.5f

    .line 1
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/upstream/experimental/PercentileTimeToFirstByteEstimator;-><init>(IF)V

    return-void
.end method

.method public constructor <init>(IF)V
    .locals 1

    .line 2
    sget-object v0, Lh1/b;->a:Lh1/z;

    invoke-direct {p0, p1, p2, v0}, Landroidx/media3/exoplayer/upstream/experimental/PercentileTimeToFirstByteEstimator;-><init>(IFLh1/b;)V

    return-void
.end method

.method public constructor <init>(IFLh1/b;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    if-lez p1, :cond_0

    const/4 v1, 0x0

    cmpl-float v1, p2, v1

    if-lez v1, :cond_0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v1, p2, v1

    if-gtz v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 4
    :goto_0
    invoke-static {v1}, Lh1/a;->d(Z)V

    .line 5
    iput p2, p0, Landroidx/media3/exoplayer/upstream/experimental/PercentileTimeToFirstByteEstimator;->percentile:F

    .line 6
    iput-object p3, p0, Landroidx/media3/exoplayer/upstream/experimental/PercentileTimeToFirstByteEstimator;->clock:Lh1/b;

    .line 7
    new-instance p2, Landroidx/media3/exoplayer/upstream/experimental/PercentileTimeToFirstByteEstimator$FixedSizeLinkedHashMap;

    const/16 p3, 0xa

    invoke-direct {p2, p3}, Landroidx/media3/exoplayer/upstream/experimental/PercentileTimeToFirstByteEstimator$FixedSizeLinkedHashMap;-><init>(I)V

    iput-object p2, p0, Landroidx/media3/exoplayer/upstream/experimental/PercentileTimeToFirstByteEstimator;->initializedDataSpecs:Ljava/util/LinkedHashMap;

    .line 8
    new-instance p2, Landroidx/media3/exoplayer/upstream/SlidingPercentile;

    invoke-direct {p2, p1}, Landroidx/media3/exoplayer/upstream/SlidingPercentile;-><init>(I)V

    iput-object p2, p0, Landroidx/media3/exoplayer/upstream/experimental/PercentileTimeToFirstByteEstimator;->slidingPercentile:Landroidx/media3/exoplayer/upstream/SlidingPercentile;

    .line 9
    iput-boolean v0, p0, Landroidx/media3/exoplayer/upstream/experimental/PercentileTimeToFirstByteEstimator;->isEmpty:Z

    return-void
.end method


# virtual methods
.method public getTimeToFirstByteEstimateUs()J
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/upstream/experimental/PercentileTimeToFirstByteEstimator;->isEmpty:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/upstream/experimental/PercentileTimeToFirstByteEstimator;->slidingPercentile:Landroidx/media3/exoplayer/upstream/SlidingPercentile;

    .line 6
    .line 7
    iget v1, p0, Landroidx/media3/exoplayer/upstream/experimental/PercentileTimeToFirstByteEstimator;->percentile:F

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/upstream/SlidingPercentile;->getPercentile(F)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    float-to-long v0, v0

    .line 14
    return-wide v0

    .line 15
    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    return-wide v0
.end method

.method public onTransferInitializing(Lk1/l;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/upstream/experimental/PercentileTimeToFirstByteEstimator;->initializedDataSpecs:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/upstream/experimental/PercentileTimeToFirstByteEstimator;->initializedDataSpecs:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/media3/exoplayer/upstream/experimental/PercentileTimeToFirstByteEstimator;->clock:Lh1/b;

    .line 9
    .line 10
    check-cast v1, Lh1/z;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    invoke-static {v1, v2}, Lh1/i0;->S(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v1

    .line 23
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, p1, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public onTransferStart(Lk1/l;)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/upstream/experimental/PercentileTimeToFirstByteEstimator;->initializedDataSpecs:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Long;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/upstream/experimental/PercentileTimeToFirstByteEstimator;->slidingPercentile:Landroidx/media3/exoplayer/upstream/SlidingPercentile;

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/media3/exoplayer/upstream/experimental/PercentileTimeToFirstByteEstimator;->clock:Lh1/b;

    .line 15
    .line 16
    check-cast v1, Lh1/z;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    invoke-static {v1, v2}, Lh1/i0;->S(J)J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    sub-long/2addr v1, v3

    .line 34
    long-to-float p1, v1

    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-virtual {v0, v1, p1}, Landroidx/media3/exoplayer/upstream/SlidingPercentile;->addSample(IF)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    iput-boolean p1, p0, Landroidx/media3/exoplayer/upstream/experimental/PercentileTimeToFirstByteEstimator;->isEmpty:Z

    .line 41
    .line 42
    return-void
.end method

.method public reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/upstream/experimental/PercentileTimeToFirstByteEstimator;->slidingPercentile:Landroidx/media3/exoplayer/upstream/SlidingPercentile;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/upstream/SlidingPercentile;->reset()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Landroidx/media3/exoplayer/upstream/experimental/PercentileTimeToFirstByteEstimator;->isEmpty:Z

    .line 8
    .line 9
    return-void
.end method
