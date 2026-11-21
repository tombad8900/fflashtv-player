.class public final synthetic Landroidx/media3/exoplayer/upstream/experimental/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/upstream/experimental/SlidingWeightedAverageBandwidthStatistic$SampleEvictionFunction;


# instance fields
.field public final synthetic j:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Landroidx/media3/exoplayer/upstream/experimental/a;->j:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final shouldEvictSample(Ljava/util/Deque;)Z
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/upstream/experimental/a;->j:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1}, Landroidx/media3/exoplayer/upstream/experimental/SlidingWeightedAverageBandwidthStatistic;->b(JLjava/util/Deque;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
