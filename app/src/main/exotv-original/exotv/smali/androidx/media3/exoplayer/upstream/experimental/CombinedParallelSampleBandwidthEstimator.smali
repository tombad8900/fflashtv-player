.class public Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/upstream/experimental/BandwidthEstimator;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator$Builder;
    }
.end annotation


# instance fields
.field private bandwidthEstimate:J

.field private final bandwidthStatistic:Landroidx/media3/exoplayer/upstream/experimental/BandwidthStatistic;

.field private final clock:Lh1/b;

.field private final eventDispatcher:Landroidx/media3/exoplayer/upstream/BandwidthMeter$EventListener$EventDispatcher;

.field private lastReportedBandwidthEstimate:J

.field private final minBytesTransferred:J

.field private final minSamples:I

.field private sampleBytesTransferred:J

.field private sampleStartTimeMs:J

.field private streamCount:I

.field private totalBytesTransferred:J

.field private totalSamplesAdded:I


# direct methods
.method private constructor <init>(Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator$Builder;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator$Builder;->access$100(Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator$Builder;)Landroidx/media3/exoplayer/upstream/experimental/BandwidthStatistic;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->bandwidthStatistic:Landroidx/media3/exoplayer/upstream/experimental/BandwidthStatistic;

    .line 4
    invoke-static {p1}, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator$Builder;->access$200(Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator$Builder;)I

    move-result v0

    iput v0, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->minSamples:I

    .line 5
    invoke-static {p1}, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator$Builder;->access$300(Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator$Builder;)J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->minBytesTransferred:J

    .line 6
    invoke-static {p1}, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator$Builder;->access$400(Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator$Builder;)Lh1/b;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->clock:Lh1/b;

    .line 7
    new-instance p1, Landroidx/media3/exoplayer/upstream/BandwidthMeter$EventListener$EventDispatcher;

    invoke-direct {p1}, Landroidx/media3/exoplayer/upstream/BandwidthMeter$EventListener$EventDispatcher;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->eventDispatcher:Landroidx/media3/exoplayer/upstream/BandwidthMeter$EventListener$EventDispatcher;

    const-wide/high16 v0, -0x8000000000000000L

    .line 8
    iput-wide v0, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->bandwidthEstimate:J

    .line 9
    iput-wide v0, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->lastReportedBandwidthEstimate:J

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator$Builder;Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;-><init>(Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator$Builder;)V

    return-void
.end method

.method private maybeNotifyBandwidthSample(IJJ)V
    .locals 7

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    cmp-long v0, p4, v0

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    cmp-long v0, p2, v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-wide v0, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->lastReportedBandwidthEstimate:J

    .line 16
    .line 17
    cmp-long v0, p4, v0

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iput-wide p4, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->lastReportedBandwidthEstimate:J

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->eventDispatcher:Landroidx/media3/exoplayer/upstream/BandwidthMeter$EventListener$EventDispatcher;

    .line 25
    .line 26
    move v2, p1

    .line 27
    move-wide v3, p2

    .line 28
    move-wide v5, p4

    .line 29
    invoke-virtual/range {v1 .. v6}, Landroidx/media3/exoplayer/upstream/BandwidthMeter$EventListener$EventDispatcher;->bandwidthSample(IJJ)V

    .line 30
    .line 31
    .line 32
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public addEventListener(Landroid/os/Handler;Landroidx/media3/exoplayer/upstream/BandwidthMeter$EventListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->eventDispatcher:Landroidx/media3/exoplayer/upstream/BandwidthMeter$EventListener$EventDispatcher;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroidx/media3/exoplayer/upstream/BandwidthMeter$EventListener$EventDispatcher;->addListener(Landroid/os/Handler;Landroidx/media3/exoplayer/upstream/BandwidthMeter$EventListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getBandwidthEstimate()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->bandwidthEstimate:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public onBytesTransferred(Lk1/h;I)V
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->sampleBytesTransferred:J

    .line 2
    .line 3
    int-to-long p1, p2

    .line 4
    add-long/2addr v0, p1

    .line 5
    iput-wide v0, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->sampleBytesTransferred:J

    .line 6
    .line 7
    iget-wide v0, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->totalBytesTransferred:J

    .line 8
    .line 9
    add-long/2addr v0, p1

    .line 10
    iput-wide v0, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->totalBytesTransferred:J

    .line 11
    .line 12
    return-void
.end method

.method public onNetworkTypeChange(J)V
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->clock:Lh1/b;

    .line 2
    .line 3
    check-cast v0, Lh1/z;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget v2, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->streamCount:I

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-lez v2, :cond_0

    .line 16
    .line 17
    iget-wide v4, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->sampleStartTimeMs:J

    .line 18
    .line 19
    sub-long v4, v0, v4

    .line 20
    .line 21
    long-to-int v2, v4

    .line 22
    move v5, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v5, v3

    .line 25
    :goto_0
    iget-wide v6, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->sampleBytesTransferred:J

    .line 26
    .line 27
    move-object v4, p0

    .line 28
    move-wide v8, p1

    .line 29
    invoke-direct/range {v4 .. v9}, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->maybeNotifyBandwidthSample(IJJ)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v4, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->bandwidthStatistic:Landroidx/media3/exoplayer/upstream/experimental/BandwidthStatistic;

    .line 33
    .line 34
    invoke-interface {p1}, Landroidx/media3/exoplayer/upstream/experimental/BandwidthStatistic;->reset()V

    .line 35
    .line 36
    .line 37
    const-wide/high16 p1, -0x8000000000000000L

    .line 38
    .line 39
    iput-wide p1, v4, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->bandwidthEstimate:J

    .line 40
    .line 41
    iput-wide v0, v4, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->sampleStartTimeMs:J

    .line 42
    .line 43
    const-wide/16 p1, 0x0

    .line 44
    .line 45
    iput-wide p1, v4, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->sampleBytesTransferred:J

    .line 46
    .line 47
    iput v3, v4, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->totalSamplesAdded:I

    .line 48
    .line 49
    iput-wide p1, v4, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->totalBytesTransferred:J

    .line 50
    .line 51
    return-void
.end method

.method public onTransferEnd(Lk1/h;)V
    .locals 13

    .line 1
    iget p1, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->streamCount:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-lez p1, :cond_0

    .line 5
    .line 6
    move p1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    invoke-static {p1}, Lh1/a;->j(Z)V

    .line 10
    .line 11
    .line 12
    iget p1, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->streamCount:I

    .line 13
    .line 14
    sub-int/2addr p1, v0

    .line 15
    iput p1, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->streamCount:I

    .line 16
    .line 17
    if-lez p1, :cond_2

    .line 18
    .line 19
    :cond_1
    move-object v7, p0

    .line 20
    goto :goto_1

    .line 21
    :cond_2
    iget-object p1, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->clock:Lh1/b;

    .line 22
    .line 23
    check-cast p1, Lh1/z;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    iget-wide v3, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->sampleStartTimeMs:J

    .line 33
    .line 34
    sub-long/2addr v1, v3

    .line 35
    long-to-int p1, v1

    .line 36
    int-to-long v1, p1

    .line 37
    const-wide/16 v3, 0x0

    .line 38
    .line 39
    cmp-long p1, v1, v3

    .line 40
    .line 41
    if-lez p1, :cond_1

    .line 42
    .line 43
    iget-object p1, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->bandwidthStatistic:Landroidx/media3/exoplayer/upstream/experimental/BandwidthStatistic;

    .line 44
    .line 45
    iget-wide v5, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->sampleBytesTransferred:J

    .line 46
    .line 47
    const-wide/16 v7, 0x3e8

    .line 48
    .line 49
    mul-long/2addr v7, v1

    .line 50
    invoke-interface {p1, v5, v6, v7, v8}, Landroidx/media3/exoplayer/upstream/experimental/BandwidthStatistic;->addSample(JJ)V

    .line 51
    .line 52
    .line 53
    iget p1, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->totalSamplesAdded:I

    .line 54
    .line 55
    add-int/2addr p1, v0

    .line 56
    iput p1, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->totalSamplesAdded:I

    .line 57
    .line 58
    iget v0, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->minSamples:I

    .line 59
    .line 60
    if-le p1, v0, :cond_3

    .line 61
    .line 62
    iget-wide v5, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->totalBytesTransferred:J

    .line 63
    .line 64
    iget-wide v7, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->minBytesTransferred:J

    .line 65
    .line 66
    cmp-long p1, v5, v7

    .line 67
    .line 68
    if-lez p1, :cond_3

    .line 69
    .line 70
    iget-object p1, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->bandwidthStatistic:Landroidx/media3/exoplayer/upstream/experimental/BandwidthStatistic;

    .line 71
    .line 72
    invoke-interface {p1}, Landroidx/media3/exoplayer/upstream/experimental/BandwidthStatistic;->getBandwidthEstimate()J

    .line 73
    .line 74
    .line 75
    move-result-wide v5

    .line 76
    iput-wide v5, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->bandwidthEstimate:J

    .line 77
    .line 78
    :cond_3
    long-to-int v8, v1

    .line 79
    iget-wide v9, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->sampleBytesTransferred:J

    .line 80
    .line 81
    iget-wide v11, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->bandwidthEstimate:J

    .line 82
    .line 83
    move-object v7, p0

    .line 84
    invoke-direct/range {v7 .. v12}, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->maybeNotifyBandwidthSample(IJJ)V

    .line 85
    .line 86
    .line 87
    iput-wide v3, v7, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->sampleBytesTransferred:J

    .line 88
    .line 89
    :goto_1
    return-void
.end method

.method public onTransferInitializing(Lk1/h;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onTransferStart(Lk1/h;)V
    .locals 2

    .line 1
    iget p1, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->streamCount:I

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->clock:Lh1/b;

    .line 6
    .line 7
    check-cast p1, Lh1/z;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    iput-wide v0, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->sampleStartTimeMs:J

    .line 17
    .line 18
    :cond_0
    iget p1, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->streamCount:I

    .line 19
    .line 20
    add-int/lit8 p1, p1, 0x1

    .line 21
    .line 22
    iput p1, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->streamCount:I

    .line 23
    .line 24
    return-void
.end method

.method public removeEventListener(Landroidx/media3/exoplayer/upstream/BandwidthMeter$EventListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/upstream/experimental/CombinedParallelSampleBandwidthEstimator;->eventDispatcher:Landroidx/media3/exoplayer/upstream/BandwidthMeter$EventListener$EventDispatcher;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/upstream/BandwidthMeter$EventListener$EventDispatcher;->removeListener(Landroidx/media3/exoplayer/upstream/BandwidthMeter$EventListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
