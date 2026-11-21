.class final Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30$SeekMapAdapter;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/c0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SeekMapAdapter"
.end annotation


# instance fields
.field private final adaptedSeekMap:Landroid/media/MediaParser$SeekMap;


# direct methods
.method public constructor <init>(Landroid/media/MediaParser$SeekMap;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30$SeekMapAdapter;->adaptedSeekMap:Landroid/media/MediaParser$SeekMap;

    .line 5
    .line 6
    return-void
.end method

.method private static asExoPlayerSeekPoint(Landroid/media/MediaParser$SeekPoint;)Ln1/d0;
    .locals 5

    .line 1
    new-instance v0, Ln1/d0;

    .line 2
    .line 3
    iget-wide v1, p0, Landroid/media/MediaParser$SeekPoint;->timeMicros:J

    .line 4
    .line 5
    invoke-static {p0}, Landroidx/media3/exoplayer/source/j;->a(Landroid/media/MediaParser$SeekPoint;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v3

    .line 9
    invoke-direct {v0, v1, v2, v3, v4}, Ln1/d0;-><init>(JJ)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method


# virtual methods
.method public getDurationUs()J
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30$SeekMapAdapter;->adaptedSeekMap:Landroid/media/MediaParser$SeekMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/MediaParser$SeekMap;->getDurationMicros()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/32 v2, -0x80000000

    .line 8
    .line 9
    .line 10
    cmp-long v2, v0, v2

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
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

.method public getSeekPoints(J)Ln1/b0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30$SeekMapAdapter;->adaptedSeekMap:Landroid/media/MediaParser$SeekMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/media/MediaParser$SeekMap;->getSeekPoints(J)Landroid/util/Pair;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v0, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 10
    .line 11
    if-ne p2, v0, :cond_0

    .line 12
    .line 13
    new-instance p1, Ln1/b0;

    .line 14
    .line 15
    invoke-static {p2}, Landroidx/media3/exoplayer/source/j;->b(Ljava/lang/Object;)Landroid/media/MediaParser$SeekPoint;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-static {p2}, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30$SeekMapAdapter;->asExoPlayerSeekPoint(Landroid/media/MediaParser$SeekPoint;)Ln1/d0;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-direct {p1, p2, p2}, Ln1/b0;-><init>(Ln1/d0;Ln1/d0;)V

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_0
    new-instance v0, Ln1/b0;

    .line 28
    .line 29
    invoke-static {p2}, Landroidx/media3/exoplayer/source/j;->b(Ljava/lang/Object;)Landroid/media/MediaParser$SeekPoint;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-static {p2}, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30$SeekMapAdapter;->asExoPlayerSeekPoint(Landroid/media/MediaParser$SeekPoint;)Ln1/d0;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {p1}, Landroidx/media3/exoplayer/source/j;->b(Ljava/lang/Object;)Landroid/media/MediaParser$SeekPoint;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1}, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30$SeekMapAdapter;->asExoPlayerSeekPoint(Landroid/media/MediaParser$SeekPoint;)Ln1/d0;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {v0, p2, p1}, Ln1/b0;-><init>(Ln1/d0;Ln1/d0;)V

    .line 48
    .line 49
    .line 50
    return-object v0
.end method

.method public isSeekable()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/mediaparser/OutputConsumerAdapterV30$SeekMapAdapter;->adaptedSeekMap:Landroid/media/MediaParser$SeekMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/MediaParser$SeekMap;->isSeekable()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
