.class public final Landroidx/media3/exoplayer/source/SinglePeriodTimeline;
.super Landroidx/media3/common/p1;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field private static final MEDIA_ITEM:Landroidx/media3/common/o0;

.field private static final UID:Ljava/lang/Object;


# instance fields
.field private final elapsedRealtimeEpochOffsetMs:J

.field private final isDynamic:Z

.field private final isSeekable:Z

.field private final liveConfiguration:Landroidx/media3/common/i0;

.field private final manifest:Ljava/lang/Object;

.field private final mediaItem:Landroidx/media3/common/o0;

.field private final periodDurationUs:J

.field private final presentationStartTimeMs:J

.field private final suppressPositionProjection:Z

.field private final windowDefaultStartPositionUs:J

.field private final windowDurationUs:J

.field private final windowPositionInPeriodUs:J

.field private final windowStartTimeMs:J


# direct methods
.method static constructor <clinit>()V
    .locals 21

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->UID:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Landroidx/media3/common/c0;

    .line 9
    .line 10
    invoke-direct {v0}, Landroidx/media3/common/c0;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, Landroidx/media3/common/f0;

    .line 14
    .line 15
    invoke-direct {v1}, Landroidx/media3/common/f0;-><init>()V

    .line 16
    .line 17
    .line 18
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 19
    .line 20
    sget-object v9, Lf6/l1;->n:Lf6/l1;

    .line 21
    .line 22
    new-instance v13, Landroidx/media3/common/h0;

    .line 23
    .line 24
    invoke-direct {v13}, Landroidx/media3/common/h0;-><init>()V

    .line 25
    .line 26
    .line 27
    sget-object v20, Landroidx/media3/common/k0;->d:Landroidx/media3/common/k0;

    .line 28
    .line 29
    sget-object v3, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 30
    .line 31
    iget-object v2, v1, Landroidx/media3/common/f0;->b:Landroid/net/Uri;

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    iget-object v2, v1, Landroidx/media3/common/f0;->a:Ljava/util/UUID;

    .line 36
    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v2, 0x0

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    :goto_0
    const/4 v2, 0x1

    .line 43
    :goto_1
    invoke-static {v2}, Lh1/a;->j(Z)V

    .line 44
    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    move-object v4, v2

    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    new-instance v2, Landroidx/media3/common/j0;

    .line 51
    .line 52
    iget-object v5, v1, Landroidx/media3/common/f0;->a:Ljava/util/UUID;

    .line 53
    .line 54
    if-eqz v5, :cond_2

    .line 55
    .line 56
    new-instance v4, Landroidx/media3/common/g0;

    .line 57
    .line 58
    invoke-direct {v4, v1}, Landroidx/media3/common/g0;-><init>(Landroidx/media3/common/f0;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    move-object v5, v4

    .line 62
    const/4 v4, 0x0

    .line 63
    const/4 v6, 0x0

    .line 64
    const/4 v8, 0x0

    .line 65
    const/4 v10, 0x0

    .line 66
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    invoke-direct/range {v2 .. v12}, Landroidx/media3/common/j0;-><init>(Landroid/net/Uri;Ljava/lang/String;Landroidx/media3/common/g0;Landroidx/media3/common/a0;Ljava/util/List;Ljava/lang/String;Lf6/m0;Ljava/lang/Object;J)V

    .line 72
    .line 73
    .line 74
    move-object/from16 v17, v2

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_3
    move-object/from16 v17, v4

    .line 78
    .line 79
    :goto_2
    new-instance v14, Landroidx/media3/common/o0;

    .line 80
    .line 81
    new-instance v1, Landroidx/media3/common/e0;

    .line 82
    .line 83
    invoke-direct {v1, v0}, Landroidx/media3/common/d0;-><init>(Landroidx/media3/common/c0;)V

    .line 84
    .line 85
    .line 86
    new-instance v0, Landroidx/media3/common/i0;

    .line 87
    .line 88
    invoke-direct {v0, v13}, Landroidx/media3/common/i0;-><init>(Landroidx/media3/common/h0;)V

    .line 89
    .line 90
    .line 91
    sget-object v19, Landroidx/media3/common/r0;->K:Landroidx/media3/common/r0;

    .line 92
    .line 93
    const-string v15, "SinglePeriodTimeline"

    .line 94
    .line 95
    move-object/from16 v18, v0

    .line 96
    .line 97
    move-object/from16 v16, v1

    .line 98
    .line 99
    invoke-direct/range {v14 .. v20}, Landroidx/media3/common/o0;-><init>(Ljava/lang/String;Landroidx/media3/common/e0;Landroidx/media3/common/j0;Landroidx/media3/common/i0;Landroidx/media3/common/r0;Landroidx/media3/common/k0;)V

    .line 100
    .line 101
    .line 102
    sput-object v14, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->MEDIA_ITEM:Landroidx/media3/common/o0;

    .line 103
    .line 104
    return-void
.end method

.method public constructor <init>(JJJJJJJZZLjava/lang/Object;Landroidx/media3/common/o0;Landroidx/media3/common/i0;)V
    .locals 21
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/16 v17, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move-wide/from16 v9, p9

    move-wide/from16 v11, p11

    move-wide/from16 v13, p13

    move/from16 v15, p15

    move/from16 v16, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    .line 12
    invoke-direct/range {v0 .. v20}, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;-><init>(JJJJJJJZZZLjava/lang/Object;Landroidx/media3/common/o0;Landroidx/media3/common/i0;)V

    return-void
.end method

.method public constructor <init>(JJJJJJJZZZLjava/lang/Object;Landroidx/media3/common/o0;Landroidx/media3/common/i0;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-wide p1, p0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->presentationStartTimeMs:J

    .line 15
    iput-wide p3, p0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->windowStartTimeMs:J

    .line 16
    iput-wide p5, p0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->elapsedRealtimeEpochOffsetMs:J

    .line 17
    iput-wide p7, p0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->periodDurationUs:J

    .line 18
    iput-wide p9, p0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->windowDurationUs:J

    .line 19
    iput-wide p11, p0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->windowPositionInPeriodUs:J

    .line 20
    iput-wide p13, p0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->windowDefaultStartPositionUs:J

    .line 21
    iput-boolean p15, p0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->isSeekable:Z

    move/from16 p1, p16

    .line 22
    iput-boolean p1, p0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->isDynamic:Z

    move/from16 p1, p17

    .line 23
    iput-boolean p1, p0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->suppressPositionProjection:Z

    move-object/from16 p1, p18

    .line 24
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->manifest:Ljava/lang/Object;

    .line 25
    invoke-virtual/range {p19 .. p19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 p1, p19

    .line 26
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->mediaItem:Landroidx/media3/common/o0;

    move-object/from16 p1, p20

    .line 27
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->liveConfiguration:Landroidx/media3/common/i0;

    return-void
.end method

.method public constructor <init>(JJJJJJJZZZLjava/lang/Object;Ljava/lang/Object;)V
    .locals 23
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 6
    sget-object v0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->MEDIA_ITEM:Landroidx/media3/common/o0;

    .line 7
    invoke-virtual {v0}, Landroidx/media3/common/o0;->a()Landroidx/media3/common/b0;

    move-result-object v1

    move-object/from16 v2, p19

    .line 8
    iput-object v2, v1, Landroidx/media3/common/b0;->j:Ljava/lang/Object;

    .line 9
    invoke-virtual {v1}, Landroidx/media3/common/b0;->a()Landroidx/media3/common/o0;

    move-result-object v21

    if-eqz p17, :cond_0

    .line 10
    iget-object v0, v0, Landroidx/media3/common/o0;->c:Landroidx/media3/common/i0;

    :goto_0
    move-object/from16 v22, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const/16 v19, 0x0

    move-object/from16 v2, p0

    move-wide/from16 v3, p1

    move-wide/from16 v5, p3

    move-wide/from16 v7, p5

    move-wide/from16 v9, p7

    move-wide/from16 v11, p9

    move-wide/from16 v13, p11

    move-wide/from16 v15, p13

    move/from16 v17, p15

    move/from16 v18, p16

    move-object/from16 v20, p18

    .line 11
    invoke-direct/range {v2 .. v22}, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;-><init>(JJJJJJJZZZLjava/lang/Object;Landroidx/media3/common/o0;Landroidx/media3/common/i0;)V

    return-void
.end method

.method public constructor <init>(JJJJZZZLjava/lang/Object;Landroidx/media3/common/o0;)V
    .locals 21

    move-object/from16 v0, p13

    if-eqz p11, :cond_0

    .line 4
    iget-object v1, v0, Landroidx/media3/common/o0;->c:Landroidx/media3/common/i0;

    :goto_0
    move-object/from16 v20, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v17, 0x0

    move-wide/from16 v7, p1

    move-wide/from16 v9, p3

    move-wide/from16 v11, p5

    move-wide/from16 v13, p7

    move/from16 v15, p9

    move/from16 v16, p10

    move-object/from16 v18, p12

    move-object/from16 v19, v0

    move-object/from16 v0, p0

    .line 5
    invoke-direct/range {v0 .. v20}, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;-><init>(JJJJJJJZZZLjava/lang/Object;Landroidx/media3/common/o0;Landroidx/media3/common/i0;)V

    return-void
.end method

.method public constructor <init>(JJJJZZZLjava/lang/Object;Ljava/lang/Object;)V
    .locals 20
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    move-object/from16 v0, p0

    move-wide/from16 v7, p1

    move-wide/from16 v9, p3

    move-wide/from16 v11, p5

    move-wide/from16 v13, p7

    move/from16 v15, p9

    move/from16 v16, p10

    move/from16 v17, p11

    move-object/from16 v18, p12

    move-object/from16 v19, p13

    .line 3
    invoke-direct/range {v0 .. v19}, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;-><init>(JJJJJJJZZZLjava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(JZZZLjava/lang/Object;Landroidx/media3/common/o0;)V
    .locals 14

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    move-wide v3, p1

    move-object v0, p0

    move-wide v1, p1

    move/from16 v9, p3

    move/from16 v10, p4

    move/from16 v11, p5

    move-object/from16 v12, p6

    move-object/from16 v13, p7

    .line 2
    invoke-direct/range {v0 .. v13}, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;-><init>(JJJJZZZLjava/lang/Object;Landroidx/media3/common/o0;)V

    return-void
.end method

.method public constructor <init>(JZZZLjava/lang/Object;Ljava/lang/Object;)V
    .locals 14
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    move-wide v3, p1

    move-object v0, p0

    move-wide v1, p1

    move/from16 v9, p3

    move/from16 v10, p4

    move/from16 v11, p5

    move-object/from16 v12, p6

    move-object/from16 v13, p7

    .line 1
    invoke-direct/range {v0 .. v13}, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;-><init>(JJJJZZZLjava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getIndexOfPeriod(Ljava/lang/Object;)I
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->UID:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, -0x1

    .line 12
    return p1
.end method

.method public getPeriod(ILandroidx/media3/common/m1;Z)Landroidx/media3/common/m1;
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p1, v0}, Lh1/a;->g(II)V

    .line 3
    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    sget-object p1, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->UID:Ljava/lang/Object;

    .line 8
    .line 9
    :goto_0
    move-object v2, p1

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :goto_1
    iget-wide v4, p0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->periodDurationUs:J

    .line 14
    .line 15
    iget-wide v0, p0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->windowPositionInPeriodUs:J

    .line 16
    .line 17
    neg-long v6, v0

    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v8, Landroidx/media3/common/c;->g:Landroidx/media3/common/c;

    .line 22
    .line 23
    const/4 v9, 0x0

    .line 24
    const/4 v1, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    move-object v0, p2

    .line 27
    invoke-virtual/range {v0 .. v9}, Landroidx/media3/common/m1;->i(Ljava/lang/Object;Ljava/lang/Object;IJJLandroidx/media3/common/c;Z)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public getPeriodCount()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public getUidOfPeriod(I)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p1, v0}, Lh1/a;->g(II)V

    .line 3
    .line 4
    .line 5
    sget-object p1, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->UID:Ljava/lang/Object;

    .line 6
    .line 7
    return-object p1
.end method

.method public getWindow(ILandroidx/media3/common/o1;J)Landroidx/media3/common/o1;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    move/from16 v2, p1

    .line 5
    .line 6
    invoke-static {v2, v1}, Lh1/a;->g(II)V

    .line 7
    .line 8
    .line 9
    iget-wide v1, v0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->windowDefaultStartPositionUs:J

    .line 10
    .line 11
    iget-boolean v14, v0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->isDynamic:Z

    .line 12
    .line 13
    if-eqz v14, :cond_1

    .line 14
    .line 15
    iget-boolean v3, v0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->suppressPositionProjection:Z

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    const-wide/16 v3, 0x0

    .line 20
    .line 21
    cmp-long v3, p3, v3

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    iget-wide v3, v0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->windowDurationUs:J

    .line 26
    .line 27
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    cmp-long v7, v3, v5

    .line 33
    .line 34
    if-nez v7, :cond_0

    .line 35
    .line 36
    :goto_0
    move-wide/from16 v16, v5

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    add-long v1, v1, p3

    .line 40
    .line 41
    cmp-long v3, v1, v3

    .line 42
    .line 43
    if-lez v3, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move-wide/from16 v16, v1

    .line 47
    .line 48
    :goto_1
    sget-object v4, Landroidx/media3/common/o1;->q:Ljava/lang/Object;

    .line 49
    .line 50
    iget-object v5, v0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->mediaItem:Landroidx/media3/common/o0;

    .line 51
    .line 52
    iget-object v6, v0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->manifest:Ljava/lang/Object;

    .line 53
    .line 54
    iget-wide v7, v0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->presentationStartTimeMs:J

    .line 55
    .line 56
    iget-wide v9, v0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->windowStartTimeMs:J

    .line 57
    .line 58
    iget-wide v11, v0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->elapsedRealtimeEpochOffsetMs:J

    .line 59
    .line 60
    iget-boolean v13, v0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->isSeekable:Z

    .line 61
    .line 62
    iget-object v15, v0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->liveConfiguration:Landroidx/media3/common/i0;

    .line 63
    .line 64
    iget-wide v1, v0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->windowDurationUs:J

    .line 65
    .line 66
    const/16 v21, 0x0

    .line 67
    .line 68
    move-wide/from16 v18, v1

    .line 69
    .line 70
    iget-wide v1, v0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;->windowPositionInPeriodUs:J

    .line 71
    .line 72
    const/16 v20, 0x0

    .line 73
    .line 74
    move-object/from16 v3, p2

    .line 75
    .line 76
    move-wide/from16 v22, v1

    .line 77
    .line 78
    invoke-virtual/range {v3 .. v23}, Landroidx/media3/common/o1;->b(Ljava/lang/Object;Landroidx/media3/common/o0;Ljava/lang/Object;JJJZZLandroidx/media3/common/i0;JJIIJ)V

    .line 79
    .line 80
    .line 81
    return-object p2
.end method

.method public getWindowCount()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method
