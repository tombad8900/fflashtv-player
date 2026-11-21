.class public final Landroidx/media3/exoplayer/source/SingleSampleMediaSource;
.super Landroidx/media3/exoplayer/source/BaseMediaSource;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/source/SingleSampleMediaSource$Factory;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private final dataSourceFactory:Lk1/g;

.field private final dataSpec:Lk1/l;

.field private final durationUs:J

.field private final format:Landroidx/media3/common/w;

.field private final loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

.field private final mediaItem:Landroidx/media3/common/o0;

.field private final timeline:Landroidx/media3/common/p1;

.field private transferListener:Lk1/c0;

.field private final treatLoadErrorsAsEndOfStream:Z


# direct methods
.method private constructor <init>(Ljava/lang/String;Landroidx/media3/common/n0;Lk1/g;JLandroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;ZLjava/lang/Object;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 2
    invoke-direct {v0}, Landroidx/media3/exoplayer/source/BaseMediaSource;-><init>()V

    move-object/from16 v2, p3

    .line 3
    iput-object v2, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource;->dataSourceFactory:Lk1/g;

    move-wide/from16 v2, p4

    .line 4
    iput-wide v2, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource;->durationUs:J

    move-object/from16 v4, p6

    .line 5
    iput-object v4, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource;->loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    move/from16 v4, p7

    .line 6
    iput-boolean v4, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource;->treatLoadErrorsAsEndOfStream:Z

    .line 7
    new-instance v4, Landroidx/media3/common/c0;

    invoke-direct {v4}, Landroidx/media3/common/c0;-><init>()V

    .line 8
    new-instance v5, Landroidx/media3/common/f0;

    .line 9
    invoke-direct {v5}, Landroidx/media3/common/f0;-><init>()V

    .line 10
    sget-object v11, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 11
    sget-object v6, Lf6/l1;->n:Lf6/l1;

    .line 12
    new-instance v6, Landroidx/media3/common/h0;

    invoke-direct {v6}, Landroidx/media3/common/h0;-><init>()V

    .line 13
    sget-object v18, Landroidx/media3/common/k0;->d:Landroidx/media3/common/k0;

    .line 14
    sget-object v7, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 15
    iget-object v8, v1, Landroidx/media3/common/n0;->a:Landroid/net/Uri;

    .line 16
    invoke-virtual {v8}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v17

    .line 17
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    invoke-static {v1}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    move-result-object v8

    .line 19
    invoke-static {v8}, Lf6/m0;->j(Ljava/util/Collection;)Lf6/m0;

    move-result-object v13

    .line 20
    iget-object v8, v5, Landroidx/media3/common/f0;->b:Landroid/net/Uri;

    if-eqz v8, :cond_1

    .line 21
    iget-object v8, v5, Landroidx/media3/common/f0;->a:Ljava/util/UUID;

    if-eqz v8, :cond_0

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v8, 0x1

    .line 22
    :goto_1
    invoke-static {v8}, Lh1/a;->j(Z)V

    const/4 v8, 0x0

    if-eqz v7, :cond_3

    move-object v9, v6

    .line 23
    new-instance v6, Landroidx/media3/common/j0;

    .line 24
    iget-object v10, v5, Landroidx/media3/common/f0;->a:Ljava/util/UUID;

    if-eqz v10, :cond_2

    .line 25
    new-instance v8, Landroidx/media3/common/g0;

    invoke-direct {v8, v5}, Landroidx/media3/common/g0;-><init>(Landroidx/media3/common/f0;)V

    :cond_2
    const/4 v5, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    move-object v14, v8

    move-object v8, v5

    move-object v5, v9

    move-object v9, v14

    move-object/from16 v14, p8

    .line 26
    invoke-direct/range {v6 .. v16}, Landroidx/media3/common/j0;-><init>(Landroid/net/Uri;Ljava/lang/String;Landroidx/media3/common/g0;Landroidx/media3/common/a0;Ljava/util/List;Ljava/lang/String;Lf6/m0;Ljava/lang/Object;J)V

    move-object v15, v6

    goto :goto_2

    :cond_3
    move-object v5, v6

    move-object v15, v8

    .line 27
    :goto_2
    new-instance v8, Landroidx/media3/common/o0;

    .line 28
    new-instance v14, Landroidx/media3/common/e0;

    .line 29
    invoke-direct {v14, v4}, Landroidx/media3/common/d0;-><init>(Landroidx/media3/common/c0;)V

    .line 30
    new-instance v4, Landroidx/media3/common/i0;

    invoke-direct {v4, v5}, Landroidx/media3/common/i0;-><init>(Landroidx/media3/common/h0;)V

    move-object/from16 v13, v17

    .line 31
    sget-object v17, Landroidx/media3/common/r0;->K:Landroidx/media3/common/r0;

    move-object/from16 v16, v4

    move-object v12, v8

    .line 32
    invoke-direct/range {v12 .. v18}, Landroidx/media3/common/o0;-><init>(Ljava/lang/String;Landroidx/media3/common/e0;Landroidx/media3/common/j0;Landroidx/media3/common/i0;Landroidx/media3/common/r0;Landroidx/media3/common/k0;)V

    .line 33
    iput-object v8, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource;->mediaItem:Landroidx/media3/common/o0;

    .line 34
    new-instance v4, Landroidx/media3/common/v;

    invoke-direct {v4}, Landroidx/media3/common/v;-><init>()V

    iget-object v5, v1, Landroidx/media3/common/n0;->b:Ljava/lang/String;

    const-string v6, "text/x-unknown"

    .line 35
    invoke-static {v5, v6}, Lcom/bumptech/glide/d;->y(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 36
    invoke-static {v5}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 37
    iget-object v5, v1, Landroidx/media3/common/n0;->c:Ljava/lang/String;

    .line 38
    iput-object v5, v4, Landroidx/media3/common/v;->d:Ljava/lang/String;

    .line 39
    iget v5, v1, Landroidx/media3/common/n0;->d:I

    .line 40
    iput v5, v4, Landroidx/media3/common/v;->e:I

    .line 41
    iget v5, v1, Landroidx/media3/common/n0;->e:I

    .line 42
    iput v5, v4, Landroidx/media3/common/v;->f:I

    .line 43
    iget-object v5, v1, Landroidx/media3/common/n0;->f:Ljava/lang/String;

    .line 44
    iput-object v5, v4, Landroidx/media3/common/v;->b:Ljava/lang/String;

    .line 45
    iget-object v5, v1, Landroidx/media3/common/n0;->g:Ljava/lang/String;

    if-eqz v5, :cond_4

    goto :goto_3

    :cond_4
    move-object/from16 v5, p1

    .line 46
    :goto_3
    iput-object v5, v4, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 47
    new-instance v5, Landroidx/media3/common/w;

    invoke-direct {v5, v4}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 48
    iput-object v5, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource;->format:Landroidx/media3/common/w;

    .line 49
    sget-object v13, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 50
    iget-object v10, v1, Landroidx/media3/common/n0;->a:Landroid/net/Uri;

    .line 51
    const-string v1, "The uri must be set."

    invoke-static {v1, v10}, Lh1/a;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 52
    new-instance v9, Lk1/l;

    const/4 v11, 0x1

    const/4 v12, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v16, -0x1

    const/16 v18, 0x0

    const/16 v19, 0x1

    .line 53
    invoke-direct/range {v9 .. v19}, Lk1/l;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 54
    iput-object v9, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource;->dataSpec:Lk1/l;

    .line 55
    new-instance v1, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v8}, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;-><init>(JZZZLjava/lang/Object;Landroidx/media3/common/o0;)V

    iput-object v1, v0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource;->timeline:Landroidx/media3/common/p1;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/media3/common/n0;Lk1/g;JLandroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;ZLjava/lang/Object;Landroidx/media3/exoplayer/source/SingleSampleMediaSource$1;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, Landroidx/media3/exoplayer/source/SingleSampleMediaSource;-><init>(Ljava/lang/String;Landroidx/media3/common/n0;Lk1/g;JLandroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;ZLjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public createPeriod(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;Landroidx/media3/exoplayer/upstream/Allocator;J)Landroidx/media3/exoplayer/source/MediaPeriod;
    .locals 10

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource;->dataSpec:Lk1/l;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource;->dataSourceFactory:Lk1/g;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource;->transferListener:Lk1/c0;

    .line 8
    .line 9
    iget-object v4, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource;->format:Landroidx/media3/common/w;

    .line 10
    .line 11
    iget-wide v5, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource;->durationUs:J

    .line 12
    .line 13
    iget-object v7, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource;->loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/source/BaseMediaSource;->createEventDispatcher(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;

    .line 16
    .line 17
    .line 18
    move-result-object v8

    .line 19
    iget-boolean v9, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource;->treatLoadErrorsAsEndOfStream:Z

    .line 20
    .line 21
    invoke-direct/range {v0 .. v9}, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;-><init>(Lk1/l;Lk1/g;Lk1/c0;Landroidx/media3/common/w;JLandroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;Z)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public getMediaItem()Landroidx/media3/common/o0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource;->mediaItem:Landroidx/media3/common/o0;

    .line 2
    .line 3
    return-object v0
.end method

.method public maybeThrowSourceInfoRefreshError()V
    .locals 0

    .line 1
    return-void
.end method

.method public prepareSourceInternal(Lk1/c0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource;->transferListener:Lk1/c0;

    .line 2
    .line 3
    iget-object p1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaSource;->timeline:Landroidx/media3/common/p1;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/source/BaseMediaSource;->refreshSourceInfo(Landroidx/media3/common/p1;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public releasePeriod(Landroidx/media3/exoplayer/source/MediaPeriod;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;->release()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public releaseSourceInternal()V
    .locals 0

    .line 1
    return-void
.end method
