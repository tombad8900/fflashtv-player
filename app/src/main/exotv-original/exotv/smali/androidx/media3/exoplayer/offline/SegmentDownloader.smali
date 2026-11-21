.class public abstract Landroidx/media3/exoplayer/offline/SegmentDownloader;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/offline/Downloader;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;,
        Landroidx/media3/exoplayer/offline/SegmentDownloader$ProgressNotifier;,
        Landroidx/media3/exoplayer/offline/SegmentDownloader$SegmentDownloadRunnable;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<M::",
        "Landroidx/media3/exoplayer/offline/FilterableManifest<",
        "TM;>;>",
        "Ljava/lang/Object;",
        "Landroidx/media3/exoplayer/offline/Downloader;"
    }
.end annotation


# static fields
.field private static final BUFFER_SIZE_BYTES:I = 0x20000

.field public static final DEFAULT_MAX_MERGED_SEGMENT_START_TIME_DIFF_MS:J = 0x4e20L


# instance fields
.field private final activeRunnables:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lh1/x;",
            ">;"
        }
    .end annotation
.end field

.field private final cache:Ll1/a;

.field private final cacheDataSourceFactory:Ll1/b;

.field private final cacheKeyFactory:Ll1/d;

.field private final executor:Ljava/util/concurrent/Executor;

.field private volatile isCanceled:Z

.field private final manifestDataSpec:Lk1/l;

.field private final manifestParser:Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser<",
            "TM;>;"
        }
    .end annotation
.end field

.field private final maxMergedSegmentStartTimeDiffUs:J

.field private final priorityTaskManager:Landroidx/media3/common/g1;

.field private final streamKeys:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/media3/common/j1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/media3/common/o0;Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;Ll1/b;Ljava/util/concurrent/Executor;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/o0;",
            "Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser<",
            "TM;>;",
            "Ll1/b;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-wide/16 v5, 0x4e20

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 1
    invoke-direct/range {v0 .. v6}, Landroidx/media3/exoplayer/offline/SegmentDownloader;-><init>(Landroidx/media3/common/o0;Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;Ll1/b;Ljava/util/concurrent/Executor;J)V

    return-void
.end method

.method public constructor <init>(Landroidx/media3/common/o0;Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;Ll1/b;Ljava/util/concurrent/Executor;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/o0;",
            "Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser<",
            "TM;>;",
            "Ll1/b;",
            "Ljava/util/concurrent/Executor;",
            "J)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iget-object p5, p1, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    iget-object p1, p1, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    iget-object p5, p1, Landroidx/media3/common/j0;->a:Landroid/net/Uri;

    invoke-static {p5}, Landroidx/media3/exoplayer/offline/SegmentDownloader;->getCompressibleDataSpec(Landroid/net/Uri;)Lk1/l;

    move-result-object p5

    iput-object p5, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->manifestDataSpec:Lk1/l;

    .line 6
    iput-object p2, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->manifestParser:Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;

    .line 7
    new-instance p2, Ljava/util/ArrayList;

    iget-object p1, p1, Landroidx/media3/common/j0;->e:Ljava/util/List;

    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p2, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->streamKeys:Ljava/util/ArrayList;

    .line 8
    iput-object p3, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->cacheDataSourceFactory:Ll1/b;

    .line 9
    iput-object p4, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->executor:Ljava/util/concurrent/Executor;

    .line 10
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    .line 11
    throw p1
.end method

.method public static synthetic access$000(Landroidx/media3/exoplayer/offline/SegmentDownloader;)Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->manifestParser:Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;

    .line 2
    .line 3
    return-object p0
.end method

.method private addActiveRunnable(Lh1/x;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lh1/x;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->activeRunnables:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->isCanceled:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->activeRunnables:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/InterruptedException;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    .line 20
    .line 21
    .line 22
    throw p1

    .line 23
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p1
.end method

.method private static canMergeSegments(Lk1/l;Lk1/l;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lk1/l;->a:Landroid/net/Uri;

    .line 2
    .line 3
    iget-object v1, p1, Lk1/l;->a:Landroid/net/Uri;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-wide v0, p0, Lk1/l;->f:J

    .line 12
    .line 13
    const-wide/16 v2, -0x1

    .line 14
    .line 15
    cmp-long v2, v0, v2

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    iget-wide v2, p0, Lk1/l;->e:J

    .line 20
    .line 21
    add-long/2addr v2, v0

    .line 22
    iget-wide v0, p1, Lk1/l;->e:J

    .line 23
    .line 24
    cmp-long v0, v2, v0

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    iget-object v0, p0, Lk1/l;->g:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v1, p1, Lk1/l;->g:Ljava/lang/String;

    .line 31
    .line 32
    sget v2, Lh1/i0;->a:I

    .line 33
    .line 34
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    iget v0, p0, Lk1/l;->h:I

    .line 41
    .line 42
    iget v1, p1, Lk1/l;->h:I

    .line 43
    .line 44
    if-ne v0, v1, :cond_0

    .line 45
    .line 46
    iget v0, p0, Lk1/l;->b:I

    .line 47
    .line 48
    iget v1, p1, Lk1/l;->b:I

    .line 49
    .line 50
    if-ne v0, v1, :cond_0

    .line 51
    .line 52
    iget-object p0, p0, Lk1/l;->d:Ljava/util/Map;

    .line 53
    .line 54
    iget-object p1, p1, Lk1/l;->d:Ljava/util/Map;

    .line 55
    .line 56
    invoke-interface {p0, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-eqz p0, :cond_0

    .line 61
    .line 62
    const/4 p0, 0x1

    .line 63
    return p0

    .line 64
    :cond_0
    const/4 p0, 0x0

    .line 65
    return p0
.end method

.method public static getCompressibleDataSpec(Landroid/net/Uri;)Lk1/l;
    .locals 11

    .line 1
    sget-object v4, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    const-string v0, "The uri must be set."

    .line 4
    .line 5
    invoke-static {v0, p0}, Lh1/a;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lk1/l;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    const-wide/16 v5, 0x0

    .line 13
    .line 14
    const-wide/16 v7, -0x1

    .line 15
    .line 16
    const/4 v9, 0x0

    .line 17
    const/4 v10, 0x1

    .line 18
    move-object v1, p0

    .line 19
    invoke-direct/range {v0 .. v10}, Lk1/l;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method private static mergeSegments(Ljava/util/List;Ll1/d;J)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;",
            ">;",
            "Ll1/d;",
            "J)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-ge v1, v3, :cond_5

    .line 13
    .line 14
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;

    .line 19
    .line 20
    iget-object v4, v3, Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;->dataSpec:Lk1/l;

    .line 21
    .line 22
    move-object v5, p1

    .line 23
    check-cast v5, Lg2/d;

    .line 24
    .line 25
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v5, v4, Lk1/l;->g:Ljava/lang/String;

    .line 29
    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    iget-object v4, v4, Lk1/l;->a:Landroid/net/Uri;

    .line 34
    .line 35
    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    :goto_1
    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, Ljava/lang/Integer;

    .line 44
    .line 45
    if-nez v4, :cond_1

    .line 46
    .line 47
    const/4 v6, 0x0

    .line 48
    goto :goto_2

    .line 49
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    check-cast v6, Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;

    .line 58
    .line 59
    :goto_2
    if-eqz v6, :cond_4

    .line 60
    .line 61
    iget-wide v7, v3, Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;->startTimeUs:J

    .line 62
    .line 63
    iget-wide v9, v6, Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;->startTimeUs:J

    .line 64
    .line 65
    add-long/2addr v9, p2

    .line 66
    cmp-long v7, v7, v9

    .line 67
    .line 68
    if-gtz v7, :cond_4

    .line 69
    .line 70
    iget-object v7, v6, Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;->dataSpec:Lk1/l;

    .line 71
    .line 72
    iget-object v8, v3, Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;->dataSpec:Lk1/l;

    .line 73
    .line 74
    invoke-static {v7, v8}, Landroidx/media3/exoplayer/offline/SegmentDownloader;->canMergeSegments(Lk1/l;Lk1/l;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-nez v7, :cond_2

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_2
    iget-object v3, v3, Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;->dataSpec:Lk1/l;

    .line 82
    .line 83
    iget-wide v7, v3, Lk1/l;->f:J

    .line 84
    .line 85
    const-wide/16 v9, -0x1

    .line 86
    .line 87
    cmp-long v3, v7, v9

    .line 88
    .line 89
    if-nez v3, :cond_3

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_3
    iget-object v3, v6, Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;->dataSpec:Lk1/l;

    .line 93
    .line 94
    iget-wide v9, v3, Lk1/l;->f:J

    .line 95
    .line 96
    add-long/2addr v9, v7

    .line 97
    :goto_3
    iget-object v3, v6, Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;->dataSpec:Lk1/l;

    .line 98
    .line 99
    const-wide/16 v7, 0x0

    .line 100
    .line 101
    invoke-virtual {v3, v7, v8, v9, v10}, Lk1/l;->c(JJ)Lk1/l;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    new-instance v5, Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;

    .line 113
    .line 114
    iget-wide v6, v6, Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;->startTimeUs:J

    .line 115
    .line 116
    invoke-direct {v5, v6, v7, v3}, Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;-><init>(JLk1/l;)V

    .line 117
    .line 118
    .line 119
    invoke-interface {p0, v4, v5}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_4
    :goto_4
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    invoke-interface {p0, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    add-int/lit8 v2, v2, 0x1

    .line 134
    .line 135
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 136
    .line 137
    goto/16 :goto_0

    .line 138
    .line 139
    :cond_5
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    invoke-static {v2, p1, p0}, Lh1/i0;->X(IILjava/util/List;)V

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method private removeActiveRunnable(I)V
    .locals 2

    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->activeRunnables:Ljava/util/ArrayList;

    monitor-enter v0

    .line 5
    :try_start_0
    iget-object v1, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->activeRunnables:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 6
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private removeActiveRunnable(Lh1/x;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh1/x;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->activeRunnables:Ljava/util/ArrayList;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->activeRunnables:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method public cancel()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->activeRunnables:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->isCanceled:Z

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    iget-object v3, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->activeRunnables:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-ge v2, v3, :cond_0

    .line 15
    .line 16
    iget-object v3, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->activeRunnables:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Lh1/x;

    .line 23
    .line 24
    invoke-virtual {v3, v1}, Lh1/x;->cancel(Z)Z

    .line 25
    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    monitor-exit v0

    .line 33
    return-void

    .line 34
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    throw v1
.end method

.method public final download(Landroidx/media3/exoplayer/offline/Downloader$ProgressListener;)V
    .locals 3

    .line 1
    new-instance p1, Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayDeque;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object p1, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->cacheDataSourceFactory:Ll1/b;

    .line 12
    .line 13
    iget-object p1, p1, Ll1/b;->j:Lk1/g;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-interface {p1}, Lk1/g;->l()Lk1/h;

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    const/4 v0, 0x0

    .line 24
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->activeRunnables:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/4 v2, 0x1

    .line 31
    if-ge v0, v1, :cond_1

    .line 32
    .line 33
    iget-object v1, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->activeRunnables:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Lh1/x;

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Lh1/x;->cancel(Z)Z

    .line 42
    .line 43
    .line 44
    add-int/lit8 v0, v0, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->activeRunnables:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    sub-int/2addr v0, v2

    .line 54
    :goto_1
    if-ltz v0, :cond_2

    .line 55
    .line 56
    iget-object v1, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->activeRunnables:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Lh1/x;

    .line 63
    .line 64
    invoke-virtual {v1}, Lh1/x;->blockUntilFinished()V

    .line 65
    .line 66
    .line 67
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/offline/SegmentDownloader;->removeActiveRunnable(I)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v0, v0, -0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    throw p1
.end method

.method public final execute(Lh1/x;Z)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lh1/x;",
            "Z)TT;"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Lh1/x;->run()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p1}, Lh1/x;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    return-object p1

    .line 11
    :catch_0
    move-exception p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    instance-of v0, p2, Ljava/io/IOException;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    check-cast p2, Ljava/io/IOException;

    .line 24
    .line 25
    throw p2

    .line 26
    :cond_0
    sget p2, Lh1/i0;->a:I

    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    iget-boolean p2, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->isCanceled:Z

    .line 30
    .line 31
    if-nez p2, :cond_3

    .line 32
    .line 33
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/offline/SegmentDownloader;->addActiveRunnable(Lh1/x;)V

    .line 34
    .line 35
    .line 36
    iget-object p2, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->executor:Ljava/util/concurrent/Executor;

    .line 37
    .line 38
    invoke-interface {p2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    :try_start_1
    invoke-virtual {p1}, Lh1/x;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    invoke-virtual {p1}, Lh1/x;->blockUntilFinished()V

    .line 46
    .line 47
    .line 48
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/offline/SegmentDownloader;->removeActiveRunnable(Lh1/x;)V

    .line 49
    .line 50
    .line 51
    return-object p2

    .line 52
    :catchall_0
    move-exception p2

    .line 53
    goto :goto_0

    .line 54
    :catch_1
    move-exception p2

    .line 55
    :try_start_2
    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    instance-of v1, v0, Ljava/io/IOException;

    .line 63
    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    check-cast v0, Ljava/io/IOException;

    .line 67
    .line 68
    throw v0

    .line 69
    :cond_2
    sget v0, Lh1/i0;->a:I

    .line 70
    .line 71
    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 72
    :goto_0
    invoke-virtual {p1}, Lh1/x;->blockUntilFinished()V

    .line 73
    .line 74
    .line 75
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/offline/SegmentDownloader;->removeActiveRunnable(Lh1/x;)V

    .line 76
    .line 77
    .line 78
    throw p2

    .line 79
    :cond_3
    new-instance p1, Ljava/lang/InterruptedException;

    .line 80
    .line 81
    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    .line 82
    .line 83
    .line 84
    throw p1
.end method

.method public final getManifest(Lk1/h;Lk1/l;Z)Landroidx/media3/exoplayer/offline/FilterableManifest;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk1/h;",
            "Lk1/l;",
            "Z)TM;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/offline/SegmentDownloader$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Landroidx/media3/exoplayer/offline/SegmentDownloader$1;-><init>(Landroidx/media3/exoplayer/offline/SegmentDownloader;Lk1/h;Lk1/l;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, p3}, Landroidx/media3/exoplayer/offline/SegmentDownloader;->execute(Lh1/x;Z)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Landroidx/media3/exoplayer/offline/FilterableManifest;

    .line 11
    .line 12
    return-object p1
.end method

.method public abstract getSegments(Lk1/h;Landroidx/media3/exoplayer/offline/FilterableManifest;Z)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk1/h;",
            "TM;Z)",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;",
            ">;"
        }
    .end annotation
.end method

.method public final remove()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader;->cacheDataSourceFactory:Ll1/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    throw v0
.end method
