.class public final Landroidx/media3/exoplayer/upstream/CachedRegionTracker;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/upstream/CachedRegionTracker$Region;
    }
.end annotation


# static fields
.field public static final CACHED_TO_END:I = -0x2

.field public static final NOT_CACHED:I = -0x1

.field private static final TAG:Ljava/lang/String; = "CachedRegionTracker"


# instance fields
.field private final cache:Ll1/a;

.field private final cacheKey:Ljava/lang/String;

.field private final chunkIndex:Ln1/j;

.field private final lookupRegion:Landroidx/media3/exoplayer/upstream/CachedRegionTracker$Region;

.field private final regions:Ljava/util/TreeSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeSet<",
            "Landroidx/media3/exoplayer/upstream/CachedRegionTracker$Region;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ll1/a;Ljava/lang/String;Ln1/j;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Landroidx/media3/exoplayer/upstream/CachedRegionTracker;->cacheKey:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, Landroidx/media3/exoplayer/upstream/CachedRegionTracker;->chunkIndex:Ln1/j;

    .line 7
    .line 8
    new-instance p2, Ljava/util/TreeSet;

    .line 9
    .line 10
    invoke-direct {p2}, Ljava/util/TreeSet;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Landroidx/media3/exoplayer/upstream/CachedRegionTracker;->regions:Ljava/util/TreeSet;

    .line 14
    .line 15
    new-instance p2, Landroidx/media3/exoplayer/upstream/CachedRegionTracker$Region;

    .line 16
    .line 17
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    invoke-direct {p2, v0, v1, v0, v1}, Landroidx/media3/exoplayer/upstream/CachedRegionTracker$Region;-><init>(JJ)V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, Landroidx/media3/exoplayer/upstream/CachedRegionTracker;->lookupRegion:Landroidx/media3/exoplayer/upstream/CachedRegionTracker$Region;

    .line 23
    .line 24
    monitor-enter p0

    .line 25
    :try_start_0
    invoke-interface {p1}, Ll1/a;->a()Ljava/util/NavigableSet;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p1}, Ljava/util/NavigableSet;->descendingIterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_1

    .line 38
    .line 39
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    if-nez p2, :cond_0

    .line 44
    .line 45
    const/4 p2, 0x0

    .line 46
    invoke-direct {p0, p2}, Landroidx/media3/exoplayer/upstream/CachedRegionTracker;->mergeSpan(Ll1/e;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    new-instance p1, Ljava/lang/ClassCastException;

    .line 53
    .line 54
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_1
    monitor-exit p0

    .line 59
    return-void

    .line 60
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    throw p1
.end method

.method private mergeSpan(Ll1/e;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    throw p1
.end method

.method private regionsConnect(Landroidx/media3/exoplayer/upstream/CachedRegionTracker$Region;Landroidx/media3/exoplayer/upstream/CachedRegionTracker$Region;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-wide v0, p1, Landroidx/media3/exoplayer/upstream/CachedRegionTracker$Region;->endOffset:J

    .line 6
    .line 7
    iget-wide p1, p2, Landroidx/media3/exoplayer/upstream/CachedRegionTracker$Region;->startOffset:J

    .line 8
    .line 9
    cmp-long p1, v0, p1

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return p1
.end method


# virtual methods
.method public declared-synchronized getRegionEndTimeMs(J)I
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Landroidx/media3/exoplayer/upstream/CachedRegionTracker;->lookupRegion:Landroidx/media3/exoplayer/upstream/CachedRegionTracker$Region;

    .line 3
    .line 4
    iput-wide p1, v0, Landroidx/media3/exoplayer/upstream/CachedRegionTracker$Region;->startOffset:J

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/exoplayer/upstream/CachedRegionTracker;->regions:Ljava/util/TreeSet;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Ljava/util/TreeSet;->floor(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroidx/media3/exoplayer/upstream/CachedRegionTracker$Region;

    .line 13
    .line 14
    const/4 v1, -0x1

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-wide v2, v0, Landroidx/media3/exoplayer/upstream/CachedRegionTracker$Region;->endOffset:J

    .line 18
    .line 19
    cmp-long p1, p1, v2

    .line 20
    .line 21
    if-gtz p1, :cond_2

    .line 22
    .line 23
    iget p1, v0, Landroidx/media3/exoplayer/upstream/CachedRegionTracker$Region;->endOffsetIndex:I

    .line 24
    .line 25
    if-ne p1, v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object p2, p0, Landroidx/media3/exoplayer/upstream/CachedRegionTracker;->chunkIndex:Ln1/j;

    .line 29
    .line 30
    iget v0, p2, Ln1/j;->a:I

    .line 31
    .line 32
    add-int/lit8 v0, v0, -0x1

    .line 33
    .line 34
    if-ne p1, v0, :cond_1

    .line 35
    .line 36
    iget-object v0, p2, Ln1/j;->c:[J

    .line 37
    .line 38
    aget-wide v4, v0, p1

    .line 39
    .line 40
    iget-object v0, p2, Ln1/j;->b:[I

    .line 41
    .line 42
    aget v0, v0, p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    int-to-long v0, v0

    .line 45
    add-long/2addr v4, v0

    .line 46
    cmp-long v0, v2, v4

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    monitor-exit p0

    .line 51
    const/4 p1, -0x2

    .line 52
    return p1

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    :try_start_1
    iget-object v0, p2, Ln1/j;->d:[J

    .line 56
    .line 57
    aget-wide v4, v0, p1

    .line 58
    .line 59
    iget-object v0, p2, Ln1/j;->c:[J

    .line 60
    .line 61
    aget-wide v6, v0, p1

    .line 62
    .line 63
    sub-long/2addr v2, v6

    .line 64
    mul-long/2addr v2, v4

    .line 65
    iget-object v0, p2, Ln1/j;->b:[I

    .line 66
    .line 67
    aget v0, v0, p1

    .line 68
    .line 69
    int-to-long v0, v0

    .line 70
    div-long/2addr v2, v0

    .line 71
    iget-object p2, p2, Ln1/j;->e:[J

    .line 72
    .line 73
    aget-wide p1, p2, p1

    .line 74
    .line 75
    add-long/2addr p1, v2

    .line 76
    const-wide/16 v0, 0x3e8

    .line 77
    .line 78
    div-long/2addr p1, v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    long-to-int p1, p1

    .line 80
    monitor-exit p0

    .line 81
    return p1

    .line 82
    :cond_2
    :goto_0
    monitor-exit p0

    .line 83
    return v1

    .line 84
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 85
    throw p1
.end method

.method public declared-synchronized onSpanAdded(Ll1/a;Ll1/e;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-direct {p0, p2}, Landroidx/media3/exoplayer/upstream/CachedRegionTracker;->mergeSpan(Ll1/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    .line 5
    monitor-exit p0

    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    throw p1
.end method

.method public declared-synchronized onSpanRemoved(Ll1/a;Ll1/e;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    const/4 p1, 0x0

    .line 3
    :try_start_0
    throw p1

    .line 4
    :catchall_0
    move-exception p1

    .line 5
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    throw p1
.end method

.method public onSpanTouched(Ll1/a;Ll1/e;Ll1/e;)V
    .locals 0

    .line 1
    return-void
.end method

.method public release()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    throw v0
.end method
