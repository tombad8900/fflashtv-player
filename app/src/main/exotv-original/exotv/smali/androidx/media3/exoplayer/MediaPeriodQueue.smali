.class final Landroidx/media3/exoplayer/MediaPeriodQueue;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final INITIAL_RENDERER_POSITION_OFFSET_US:J = 0xe8d4a51000L

.field private static final MAXIMUM_BUFFER_AHEAD_PERIODS:I = 0x64


# instance fields
.field private final analyticsCollector:Landroidx/media3/exoplayer/analytics/AnalyticsCollector;

.field private final analyticsCollectorHandler:Lh1/k;

.field private length:I

.field private loading:Landroidx/media3/exoplayer/MediaPeriodHolder;

.field private final mediaPeriodHolderFactory:Landroidx/media3/exoplayer/MediaPeriodHolder$Factory;

.field private nextWindowSequenceNumber:J

.field private oldFrontPeriodUid:Ljava/lang/Object;

.field private oldFrontPeriodWindowSequenceNumber:J

.field private final period:Landroidx/media3/common/m1;

.field private playing:Landroidx/media3/exoplayer/MediaPeriodHolder;

.field private preloadConfiguration:Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;

.field private preloadPriorityList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/MediaPeriodHolder;",
            ">;"
        }
    .end annotation
.end field

.field private preloading:Landroidx/media3/exoplayer/MediaPeriodHolder;

.field private reading:Landroidx/media3/exoplayer/MediaPeriodHolder;

.field private repeatMode:I

.field private shuffleModeEnabled:Z

.field private final window:Landroidx/media3/common/o1;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/analytics/AnalyticsCollector;Lh1/k;Landroidx/media3/exoplayer/MediaPeriodHolder$Factory;Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->analyticsCollector:Landroidx/media3/exoplayer/analytics/AnalyticsCollector;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->analyticsCollectorHandler:Lh1/k;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->mediaPeriodHolderFactory:Landroidx/media3/exoplayer/MediaPeriodHolder$Factory;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->preloadConfiguration:Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;

    .line 11
    .line 12
    new-instance p1, Landroidx/media3/common/m1;

    .line 13
    .line 14
    invoke-direct {p1}, Landroidx/media3/common/m1;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 18
    .line 19
    new-instance p1, Landroidx/media3/common/o1;

    .line 20
    .line 21
    invoke-direct {p1}, Landroidx/media3/common/o1;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->window:Landroidx/media3/common/o1;

    .line 25
    .line 26
    new-instance p1, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->preloadPriorityList:Ljava/util/List;

    .line 32
    .line 33
    return-void
.end method

.method public static synthetic a(Landroidx/media3/exoplayer/MediaPeriodQueue;Lf6/j0;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->lambda$notifyQueueUpdate$0(Lf6/j0;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static areDurationsCompatible(JJ)Z
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v0, p0, v0

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    cmp-long p0, p0, p2

    .line 11
    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0

    .line 17
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 18
    return p0
.end method

.method private canKeepMediaPeriodHolder(Landroidx/media3/exoplayer/MediaPeriodInfo;Landroidx/media3/exoplayer/MediaPeriodInfo;)Z
    .locals 4

    .line 1
    iget-wide v0, p1, Landroidx/media3/exoplayer/MediaPeriodInfo;->startPositionUs:J

    .line 2
    .line 3
    iget-wide v2, p2, Landroidx/media3/exoplayer/MediaPeriodInfo;->startPositionUs:J

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p1, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 10
    .line 11
    iget-object p2, p2, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    return p1
.end method

.method private getDefaultPeriodPositionOfNextWindow(Landroidx/media3/common/p1;Ljava/lang/Object;J)Landroid/util/Pair;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/p1;",
            "Ljava/lang/Object;",
            "J)",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget p2, p2, Landroidx/media3/common/m1;->c:I

    .line 8
    .line 9
    iget v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->repeatMode:I

    .line 10
    .line 11
    iget-boolean v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->shuffleModeEnabled:Z

    .line 12
    .line 13
    invoke-virtual {p1, p2, v0, v1}, Landroidx/media3/common/p1;->getNextWindowIndex(IIZ)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    const/4 p2, -0x1

    .line 18
    if-eq v5, p2, :cond_0

    .line 19
    .line 20
    iget-object v3, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->window:Landroidx/media3/common/o1;

    .line 21
    .line 22
    iget-object v4, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 23
    .line 24
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    move-object v2, p1

    .line 30
    move-wide v8, p3

    .line 31
    invoke-virtual/range {v2 .. v9}, Landroidx/media3/common/p1;->getPeriodPositionUs(Landroidx/media3/common/o1;Landroidx/media3/common/m1;IJJ)Landroid/util/Pair;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_0
    const/4 p1, 0x0

    .line 37
    return-object p1
.end method

.method private getFirstMediaPeriodInfo(Landroidx/media3/exoplayer/PlaybackInfo;)Landroidx/media3/exoplayer/MediaPeriodInfo;
    .locals 7

    .line 1
    iget-object v1, p1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 2
    .line 3
    iget-object v2, p1, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 4
    .line 5
    iget-wide v3, p1, Landroidx/media3/exoplayer/PlaybackInfo;->requestedContentPositionUs:J

    .line 6
    .line 7
    iget-wide v5, p1, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    invoke-direct/range {v0 .. v6}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getMediaPeriodInfo(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJ)Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method private getFirstMediaPeriodInfoOfNextPeriod(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/MediaPeriodHolder;J)Landroidx/media3/exoplayer/MediaPeriodInfo;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    iget-object v10, v9, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 8
    .line 9
    iget-object v2, v10, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 10
    .line 11
    iget-object v2, v2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget-object v3, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 18
    .line 19
    iget-object v4, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->window:Landroidx/media3/common/o1;

    .line 20
    .line 21
    iget v5, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->repeatMode:I

    .line 22
    .line 23
    iget-boolean v6, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->shuffleModeEnabled:Z

    .line 24
    .line 25
    invoke-virtual/range {v1 .. v6}, Landroidx/media3/common/p1;->getNextPeriodIndex(ILandroidx/media3/common/m1;Landroidx/media3/common/o1;IZ)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, -0x1

    .line 30
    const/4 v11, 0x0

    .line 31
    if-ne v2, v3, :cond_0

    .line 32
    .line 33
    return-object v11

    .line 34
    :cond_0
    iget-object v3, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    invoke-virtual {v1, v2, v3, v4}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;Z)Landroidx/media3/common/m1;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    iget v4, v3, Landroidx/media3/common/m1;->c:I

    .line 42
    .line 43
    iget-object v3, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 44
    .line 45
    iget-object v3, v3, Landroidx/media3/common/m1;->b:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object v5, v10, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 51
    .line 52
    iget-wide v5, v5, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->windowSequenceNumber:J

    .line 53
    .line 54
    iget-object v7, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->window:Landroidx/media3/common/o1;

    .line 55
    .line 56
    invoke-virtual {v1, v4, v7}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    iget v7, v7, Landroidx/media3/common/o1;->n:I

    .line 61
    .line 62
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    const-wide/16 v14, 0x0

    .line 68
    .line 69
    if-ne v7, v2, :cond_4

    .line 70
    .line 71
    iget-object v2, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->window:Landroidx/media3/common/o1;

    .line 72
    .line 73
    iget-object v3, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 74
    .line 75
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    move-wide/from16 v7, p3

    .line 81
    .line 82
    invoke-static {v14, v15, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 83
    .line 84
    .line 85
    move-result-wide v7

    .line 86
    invoke-virtual/range {v1 .. v8}, Landroidx/media3/common/p1;->getPeriodPositionUs(Landroidx/media3/common/o1;Landroidx/media3/common/m1;IJJ)Landroid/util/Pair;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    if-nez v2, :cond_1

    .line 91
    .line 92
    return-object v11

    .line 93
    :cond_1
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 94
    .line 95
    iget-object v1, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v1, Ljava/lang/Long;

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 100
    .line 101
    .line 102
    move-result-wide v14

    .line 103
    invoke-virtual {v9}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    if-eqz v1, :cond_2

    .line 108
    .line 109
    iget-object v2, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->uid:Ljava/lang/Object;

    .line 110
    .line 111
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_2

    .line 116
    .line 117
    iget-object v1, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 118
    .line 119
    iget-object v1, v1, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 120
    .line 121
    iget-wide v5, v1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->windowSequenceNumber:J

    .line 122
    .line 123
    :goto_0
    move-object v2, v3

    .line 124
    move-wide v3, v14

    .line 125
    move-wide v14, v12

    .line 126
    goto :goto_1

    .line 127
    :cond_2
    invoke-direct {v0, v3}, Landroidx/media3/exoplayer/MediaPeriodQueue;->resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(Ljava/lang/Object;)J

    .line 128
    .line 129
    .line 130
    move-result-wide v1

    .line 131
    const-wide/16 v4, -0x1

    .line 132
    .line 133
    cmp-long v4, v1, v4

    .line 134
    .line 135
    if-nez v4, :cond_3

    .line 136
    .line 137
    iget-wide v1, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->nextWindowSequenceNumber:J

    .line 138
    .line 139
    const-wide/16 v4, 0x1

    .line 140
    .line 141
    add-long/2addr v4, v1

    .line 142
    iput-wide v4, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->nextWindowSequenceNumber:J

    .line 143
    .line 144
    :cond_3
    move-wide v5, v1

    .line 145
    goto :goto_0

    .line 146
    :cond_4
    move-object v2, v3

    .line 147
    move-wide v3, v14

    .line 148
    :goto_1
    iget-object v7, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->window:Landroidx/media3/common/o1;

    .line 149
    .line 150
    iget-object v8, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 151
    .line 152
    move-object/from16 v1, p1

    .line 153
    .line 154
    invoke-static/range {v1 .. v8}, Landroidx/media3/exoplayer/MediaPeriodQueue;->resolveMediaPeriodIdForAds(Landroidx/media3/common/p1;Ljava/lang/Object;JJLandroidx/media3/common/o1;Landroidx/media3/common/m1;)Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    cmp-long v5, v14, v12

    .line 159
    .line 160
    if-eqz v5, :cond_5

    .line 161
    .line 162
    iget-wide v5, v10, Landroidx/media3/exoplayer/MediaPeriodInfo;->requestedContentPositionUs:J

    .line 163
    .line 164
    cmp-long v5, v5, v12

    .line 165
    .line 166
    if-eqz v5, :cond_5

    .line 167
    .line 168
    iget-object v5, v10, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 169
    .line 170
    iget-object v5, v5, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 171
    .line 172
    invoke-direct {v0, v5, v1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->hasServerSideInsertedAds(Ljava/lang/Object;Landroidx/media3/common/p1;)Z

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    invoke-virtual {v2}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    if-eqz v6, :cond_6

    .line 181
    .line 182
    if-eqz v5, :cond_6

    .line 183
    .line 184
    iget-wide v14, v10, Landroidx/media3/exoplayer/MediaPeriodInfo;->requestedContentPositionUs:J

    .line 185
    .line 186
    :cond_5
    :goto_2
    move-wide v5, v3

    .line 187
    move-wide v3, v14

    .line 188
    goto :goto_3

    .line 189
    :cond_6
    if-eqz v5, :cond_5

    .line 190
    .line 191
    iget-wide v3, v10, Landroidx/media3/exoplayer/MediaPeriodInfo;->requestedContentPositionUs:J

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :goto_3
    invoke-direct/range {v0 .. v6}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getMediaPeriodInfo(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJ)Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    return-object v1
.end method

.method private getFollowingMediaPeriodInfo(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/MediaPeriodHolder;J)Landroidx/media3/exoplayer/MediaPeriodInfo;
    .locals 5

    .line 1
    iget-object v0, p2, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 2
    .line 3
    invoke-virtual {p2}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getRendererOffset()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    iget-wide v3, v0, Landroidx/media3/exoplayer/MediaPeriodInfo;->durationUs:J

    .line 8
    .line 9
    add-long/2addr v1, v3

    .line 10
    sub-long/2addr v1, p3

    .line 11
    iget-boolean p3, v0, Landroidx/media3/exoplayer/MediaPeriodInfo;->isLastInTimelinePeriod:Z

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    invoke-direct {p0, p1, p2, v1, v2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getFirstMediaPeriodInfoOfNextPeriod(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/MediaPeriodHolder;J)Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    invoke-direct {p0, p1, p2, v1, v2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getFollowingMediaPeriodInfoOfCurrentPeriod(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/MediaPeriodHolder;J)Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method

.method private getFollowingMediaPeriodInfoOfCurrentPeriod(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/MediaPeriodHolder;J)Landroidx/media3/exoplayer/MediaPeriodInfo;
    .locals 10

    .line 1
    iget-object v8, p2, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 2
    .line 3
    iget-object v9, v8, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 4
    .line 5
    iget-object v3, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v4, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 8
    .line 9
    invoke-virtual {p1, v3, v4}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v9}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, -0x1

    .line 17
    if-eqz v3, :cond_4

    .line 18
    .line 19
    iget v3, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 20
    .line 21
    iget-object v2, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 22
    .line 23
    iget-object v2, v2, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget v2, v2, Landroidx/media3/common/b;->b:I

    .line 30
    .line 31
    if-ne v2, v4, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v4, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 35
    .line 36
    iget v5, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adIndexInAdGroup:I

    .line 37
    .line 38
    iget-object v4, v4, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 39
    .line 40
    invoke-virtual {v4, v3}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v4, v5}, Landroidx/media3/common/b;->b(I)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-ge v4, v2, :cond_1

    .line 49
    .line 50
    iget-object v2, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 51
    .line 52
    iget-wide v5, v8, Landroidx/media3/exoplayer/MediaPeriodInfo;->requestedContentPositionUs:J

    .line 53
    .line 54
    iget-wide v7, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->windowSequenceNumber:J

    .line 55
    .line 56
    move-object v0, p0

    .line 57
    move-object v1, p1

    .line 58
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getMediaPeriodInfoForAd(Landroidx/media3/common/p1;Ljava/lang/Object;IIJJ)Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    return-object v1

    .line 63
    :cond_1
    iget-wide v0, v8, Landroidx/media3/exoplayer/MediaPeriodInfo;->requestedContentPositionUs:J

    .line 64
    .line 65
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    cmp-long v2, v0, v2

    .line 71
    .line 72
    if-nez v2, :cond_3

    .line 73
    .line 74
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->window:Landroidx/media3/common/o1;

    .line 75
    .line 76
    iget-object v2, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 77
    .line 78
    iget v3, v2, Landroidx/media3/common/m1;->c:I

    .line 79
    .line 80
    const-wide/16 v4, 0x0

    .line 81
    .line 82
    invoke-static {v4, v5, p3, p4}, Ljava/lang/Math;->max(JJ)J

    .line 83
    .line 84
    .line 85
    move-result-wide v6

    .line 86
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    move-object v0, p1

    .line 92
    invoke-virtual/range {v0 .. v7}, Landroidx/media3/common/p1;->getPeriodPositionUs(Landroidx/media3/common/o1;Landroidx/media3/common/m1;IJJ)Landroid/util/Pair;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    if-nez v1, :cond_2

    .line 97
    .line 98
    :goto_0
    const/4 v0, 0x0

    .line 99
    return-object v0

    .line 100
    :cond_2
    iget-object v0, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Ljava/lang/Long;

    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 105
    .line 106
    .line 107
    move-result-wide v0

    .line 108
    :cond_3
    iget-object v3, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 109
    .line 110
    iget v4, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 111
    .line 112
    invoke-direct {p0, p1, v3, v4}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getMinStartPositionAfterAdGroupUs(Landroidx/media3/common/p1;Ljava/lang/Object;I)J

    .line 113
    .line 114
    .line 115
    move-result-wide v3

    .line 116
    iget-object v2, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 117
    .line 118
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 119
    .line 120
    .line 121
    move-result-wide v3

    .line 122
    iget-wide v5, v8, Landroidx/media3/exoplayer/MediaPeriodInfo;->requestedContentPositionUs:J

    .line 123
    .line 124
    iget-wide v7, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->windowSequenceNumber:J

    .line 125
    .line 126
    move-object v0, p0

    .line 127
    move-object v1, p1

    .line 128
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getMediaPeriodInfoForContent(Landroidx/media3/common/p1;Ljava/lang/Object;JJJ)Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    return-object v1

    .line 133
    :cond_4
    iget v1, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->nextAdGroupIndex:I

    .line 134
    .line 135
    if-eq v1, v4, :cond_5

    .line 136
    .line 137
    iget-object v3, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 138
    .line 139
    invoke-virtual {v3, v1}, Landroidx/media3/common/m1;->g(I)Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_5

    .line 144
    .line 145
    invoke-direct/range {p0 .. p4}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getFirstMediaPeriodInfoOfNextPeriod(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/MediaPeriodHolder;J)Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    return-object v1

    .line 150
    :cond_5
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 151
    .line 152
    iget v2, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->nextAdGroupIndex:I

    .line 153
    .line 154
    invoke-virtual {v1, v2}, Landroidx/media3/common/m1;->f(I)I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 159
    .line 160
    iget v2, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->nextAdGroupIndex:I

    .line 161
    .line 162
    invoke-virtual {v1, v2}, Landroidx/media3/common/m1;->h(I)Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-eqz v1, :cond_6

    .line 167
    .line 168
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 169
    .line 170
    iget v2, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->nextAdGroupIndex:I

    .line 171
    .line 172
    invoke-virtual {v1, v2, v4}, Landroidx/media3/common/m1;->e(II)I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    const/4 v2, 0x3

    .line 177
    if-ne v1, v2, :cond_6

    .line 178
    .line 179
    const/4 v1, 0x1

    .line 180
    goto :goto_1

    .line 181
    :cond_6
    const/4 v1, 0x0

    .line 182
    :goto_1
    iget-object v2, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 183
    .line 184
    iget v3, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->nextAdGroupIndex:I

    .line 185
    .line 186
    iget-object v2, v2, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 187
    .line 188
    invoke-virtual {v2, v3}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    iget v2, v2, Landroidx/media3/common/b;->b:I

    .line 193
    .line 194
    if-eq v4, v2, :cond_8

    .line 195
    .line 196
    if-eqz v1, :cond_7

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_7
    iget-object v2, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 200
    .line 201
    iget v3, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->nextAdGroupIndex:I

    .line 202
    .line 203
    iget-wide v5, v8, Landroidx/media3/exoplayer/MediaPeriodInfo;->durationUs:J

    .line 204
    .line 205
    iget-wide v7, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->windowSequenceNumber:J

    .line 206
    .line 207
    move-object v0, p0

    .line 208
    move-object v1, p1

    .line 209
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getMediaPeriodInfoForAd(Landroidx/media3/common/p1;Ljava/lang/Object;IIJJ)Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    return-object v1

    .line 214
    :cond_8
    :goto_2
    iget-object v2, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 215
    .line 216
    iget v3, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->nextAdGroupIndex:I

    .line 217
    .line 218
    invoke-direct {p0, p1, v2, v3}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getMinStartPositionAfterAdGroupUs(Landroidx/media3/common/p1;Ljava/lang/Object;I)J

    .line 219
    .line 220
    .line 221
    move-result-wide v3

    .line 222
    iget-object v2, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 223
    .line 224
    iget-wide v5, v8, Landroidx/media3/exoplayer/MediaPeriodInfo;->durationUs:J

    .line 225
    .line 226
    iget-wide v7, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->windowSequenceNumber:J

    .line 227
    .line 228
    move-object v0, p0

    .line 229
    move-object v1, p1

    .line 230
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getMediaPeriodInfoForContent(Landroidx/media3/common/p1;Ljava/lang/Object;JJJ)Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    return-object v1
.end method

.method private getMediaPeriodInfo(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJ)Landroidx/media3/exoplayer/MediaPeriodInfo;
    .locals 10

    .line 1
    iget-object v0, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v3, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 15
    .line 16
    iget v4, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 17
    .line 18
    iget v5, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adIndexInAdGroup:I

    .line 19
    .line 20
    iget-wide v8, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->windowSequenceNumber:J

    .line 21
    .line 22
    move-object v1, p0

    .line 23
    move-object v2, p1

    .line 24
    move-wide v6, p3

    .line 25
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getMediaPeriodInfoForAd(Landroidx/media3/common/p1;Ljava/lang/Object;IIJJ)Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_0
    iget-object v2, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 31
    .line 32
    iget-wide v7, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->windowSequenceNumber:J

    .line 33
    .line 34
    move-object v0, p0

    .line 35
    move-object v1, p1

    .line 36
    move-wide v5, p3

    .line 37
    move-wide v3, p5

    .line 38
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getMediaPeriodInfoForContent(Landroidx/media3/common/p1;Ljava/lang/Object;JJJ)Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
.end method

.method private getMediaPeriodInfoForAd(Landroidx/media3/common/p1;Ljava/lang/Object;IIJJ)Landroidx/media3/exoplayer/MediaPeriodInfo;
    .locals 14

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    move-wide/from16 v4, p7

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;-><init>(Ljava/lang/Object;IIJ)V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v2, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 17
    .line 18
    invoke-virtual {p1, v1, v2}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget v1, v0, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 23
    .line 24
    iget v2, v0, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adIndexInAdGroup:I

    .line 25
    .line 26
    invoke-virtual {p1, v1, v2}, Landroidx/media3/common/m1;->a(II)J

    .line 27
    .line 28
    .line 29
    move-result-wide v8

    .line 30
    iget-object p1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 31
    .line 32
    move/from16 v2, p3

    .line 33
    .line 34
    invoke-virtual {p1, v2}, Landroidx/media3/common/m1;->f(I)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    const-wide/16 v1, 0x0

    .line 39
    .line 40
    if-ne v3, p1, :cond_0

    .line 41
    .line 42
    iget-object p1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 43
    .line 44
    iget-object p1, p1, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 45
    .line 46
    iget-wide v3, p1, Landroidx/media3/common/c;->c:J

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move-wide v3, v1

    .line 50
    :goto_0
    iget-object p1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 51
    .line 52
    iget v5, v0, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 53
    .line 54
    invoke-virtual {p1, v5}, Landroidx/media3/common/m1;->h(I)Z

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    cmp-long p1, v8, v5

    .line 64
    .line 65
    if-eqz p1, :cond_1

    .line 66
    .line 67
    cmp-long p1, v3, v8

    .line 68
    .line 69
    if-ltz p1, :cond_1

    .line 70
    .line 71
    const-wide/16 v3, 0x1

    .line 72
    .line 73
    sub-long v3, v8, v3

    .line 74
    .line 75
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 76
    .line 77
    .line 78
    move-result-wide v3

    .line 79
    :cond_1
    move-object v1, v0

    .line 80
    move-wide v2, v3

    .line 81
    new-instance v0, Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 82
    .line 83
    const/4 v12, 0x0

    .line 84
    const/4 v13, 0x0

    .line 85
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    const/4 v11, 0x0

    .line 91
    move-wide/from16 v4, p5

    .line 92
    .line 93
    invoke-direct/range {v0 .. v13}, Landroidx/media3/exoplayer/MediaPeriodInfo;-><init>(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJJJZZZZ)V

    .line 94
    .line 95
    .line 96
    return-object v0
.end method

.method private getMediaPeriodInfoForContent(Landroidx/media3/common/p1;Ljava/lang/Object;JJJ)Landroidx/media3/exoplayer/MediaPeriodInfo;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-wide/from16 v3, p3

    .line 8
    .line 9
    iget-object v5, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 10
    .line 11
    invoke-virtual {v1, v2, v5}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 12
    .line 13
    .line 14
    iget-object v5, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 15
    .line 16
    invoke-virtual {v5, v3, v4}, Landroidx/media3/common/m1;->b(J)I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x1

    .line 22
    const/4 v8, -0x1

    .line 23
    if-eq v5, v8, :cond_0

    .line 24
    .line 25
    iget-object v9, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 26
    .line 27
    invoke-virtual {v9, v5}, Landroidx/media3/common/m1;->g(I)Z

    .line 28
    .line 29
    .line 30
    move-result v9

    .line 31
    if-eqz v9, :cond_0

    .line 32
    .line 33
    move v9, v7

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v9, v6

    .line 36
    :goto_0
    if-ne v5, v8, :cond_1

    .line 37
    .line 38
    iget-object v10, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 39
    .line 40
    iget-object v11, v10, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 41
    .line 42
    iget v12, v11, Landroidx/media3/common/c;->b:I

    .line 43
    .line 44
    if-lez v12, :cond_6

    .line 45
    .line 46
    iget v11, v11, Landroidx/media3/common/c;->e:I

    .line 47
    .line 48
    invoke-virtual {v10, v11}, Landroidx/media3/common/m1;->h(I)Z

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    if-eqz v10, :cond_6

    .line 53
    .line 54
    move v10, v7

    .line 55
    goto :goto_4

    .line 56
    :cond_1
    iget-object v10, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 57
    .line 58
    invoke-virtual {v10, v5}, Landroidx/media3/common/m1;->h(I)Z

    .line 59
    .line 60
    .line 61
    move-result v10

    .line 62
    if-eqz v10, :cond_6

    .line 63
    .line 64
    iget-object v10, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 65
    .line 66
    invoke-virtual {v10, v5}, Landroidx/media3/common/m1;->d(I)J

    .line 67
    .line 68
    .line 69
    move-result-wide v10

    .line 70
    iget-object v12, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 71
    .line 72
    iget-wide v13, v12, Landroidx/media3/common/m1;->d:J

    .line 73
    .line 74
    cmp-long v10, v10, v13

    .line 75
    .line 76
    if-nez v10, :cond_6

    .line 77
    .line 78
    iget-object v10, v12, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 79
    .line 80
    invoke-virtual {v10, v5}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    iget v11, v10, Landroidx/media3/common/b;->b:I

    .line 85
    .line 86
    if-ne v11, v8, :cond_3

    .line 87
    .line 88
    :cond_2
    :goto_1
    move v10, v7

    .line 89
    goto :goto_3

    .line 90
    :cond_3
    move v12, v6

    .line 91
    :goto_2
    if-ge v12, v11, :cond_5

    .line 92
    .line 93
    iget-object v13, v10, Landroidx/media3/common/b;->f:[I

    .line 94
    .line 95
    aget v13, v13, v12

    .line 96
    .line 97
    if-eqz v13, :cond_2

    .line 98
    .line 99
    if-ne v13, v7, :cond_4

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    add-int/lit8 v12, v12, 0x1

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_5
    move v10, v6

    .line 106
    :goto_3
    if-nez v10, :cond_6

    .line 107
    .line 108
    move v10, v7

    .line 109
    move v5, v8

    .line 110
    goto :goto_4

    .line 111
    :cond_6
    move v10, v6

    .line 112
    :goto_4
    new-instance v12, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 113
    .line 114
    move-wide/from16 v13, p7

    .line 115
    .line 116
    invoke-direct {v12, v2, v13, v14, v5}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;-><init>(Ljava/lang/Object;JI)V

    .line 117
    .line 118
    .line 119
    invoke-direct {v0, v12}, Landroidx/media3/exoplayer/MediaPeriodQueue;->isLastInPeriod(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    invoke-direct {v0, v1, v12}, Landroidx/media3/exoplayer/MediaPeriodQueue;->isLastInWindow(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Z

    .line 124
    .line 125
    .line 126
    move-result v23

    .line 127
    invoke-direct {v0, v1, v12, v2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->isLastInTimeline(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;Z)Z

    .line 128
    .line 129
    .line 130
    move-result v24

    .line 131
    if-eq v5, v8, :cond_7

    .line 132
    .line 133
    iget-object v1, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 134
    .line 135
    invoke-virtual {v1, v5}, Landroidx/media3/common/m1;->h(I)Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-eqz v1, :cond_7

    .line 140
    .line 141
    if-nez v9, :cond_7

    .line 142
    .line 143
    move/from16 v21, v7

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_7
    move/from16 v21, v6

    .line 147
    .line 148
    :goto_5
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    if-eq v5, v8, :cond_8

    .line 154
    .line 155
    if-nez v9, :cond_8

    .line 156
    .line 157
    iget-object v1, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 158
    .line 159
    invoke-virtual {v1, v5}, Landroidx/media3/common/m1;->d(I)J

    .line 160
    .line 161
    .line 162
    move-result-wide v8

    .line 163
    :goto_6
    move-wide/from16 v17, v8

    .line 164
    .line 165
    goto :goto_7

    .line 166
    :cond_8
    if-eqz v10, :cond_9

    .line 167
    .line 168
    iget-object v1, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 169
    .line 170
    iget-wide v8, v1, Landroidx/media3/common/m1;->d:J

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_9
    move-wide/from16 v17, v13

    .line 174
    .line 175
    :goto_7
    cmp-long v1, v17, v13

    .line 176
    .line 177
    if-eqz v1, :cond_b

    .line 178
    .line 179
    const-wide/high16 v8, -0x8000000000000000L

    .line 180
    .line 181
    cmp-long v1, v17, v8

    .line 182
    .line 183
    if-nez v1, :cond_a

    .line 184
    .line 185
    goto :goto_8

    .line 186
    :cond_a
    move-wide/from16 v19, v17

    .line 187
    .line 188
    goto :goto_9

    .line 189
    :cond_b
    :goto_8
    iget-object v1, v0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 190
    .line 191
    iget-wide v8, v1, Landroidx/media3/common/m1;->d:J

    .line 192
    .line 193
    move-wide/from16 v19, v8

    .line 194
    .line 195
    :goto_9
    cmp-long v1, v19, v13

    .line 196
    .line 197
    if-eqz v1, :cond_e

    .line 198
    .line 199
    cmp-long v1, v3, v19

    .line 200
    .line 201
    if-ltz v1, :cond_e

    .line 202
    .line 203
    if-nez v24, :cond_c

    .line 204
    .line 205
    if-nez v10, :cond_d

    .line 206
    .line 207
    :cond_c
    move v6, v7

    .line 208
    :cond_d
    int-to-long v3, v6

    .line 209
    sub-long v3, v19, v3

    .line 210
    .line 211
    const-wide/16 v5, 0x0

    .line 212
    .line 213
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 214
    .line 215
    .line 216
    move-result-wide v3

    .line 217
    :cond_e
    move-wide v13, v3

    .line 218
    new-instance v11, Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 219
    .line 220
    move-wide/from16 v15, p5

    .line 221
    .line 222
    move/from16 v22, v2

    .line 223
    .line 224
    invoke-direct/range {v11 .. v24}, Landroidx/media3/exoplayer/MediaPeriodInfo;-><init>(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJJJZZZZ)V

    .line 225
    .line 226
    .line 227
    return-object v11
.end method

.method private getMediaPeriodInfoForPeriodPosition(Landroidx/media3/common/p1;Ljava/lang/Object;JJ)Landroidx/media3/exoplayer/MediaPeriodInfo;
    .locals 9

    .line 1
    iget-object v6, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->window:Landroidx/media3/common/o1;

    .line 2
    .line 3
    iget-object v7, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    move-object v1, p2

    .line 7
    move-wide v2, p3

    .line 8
    move-wide v4, p5

    .line 9
    invoke-static/range {v0 .. v7}, Landroidx/media3/exoplayer/MediaPeriodQueue;->resolveMediaPeriodIdForAds(Landroidx/media3/common/p1;Ljava/lang/Object;JJLandroidx/media3/common/o1;Landroidx/media3/common/m1;)Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    move-object v1, v0

    .line 14
    invoke-virtual {p1}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    move-wide v3, v2

    .line 21
    iget-object v2, p1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 22
    .line 23
    move-wide v5, v3

    .line 24
    iget v3, p1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 25
    .line 26
    iget v4, p1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adIndexInAdGroup:I

    .line 27
    .line 28
    iget-wide v7, p1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->windowSequenceNumber:J

    .line 29
    .line 30
    move-object v0, p0

    .line 31
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getMediaPeriodInfoForAd(Landroidx/media3/common/p1;Ljava/lang/Object;IIJJ)Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_0
    iget-object p2, p1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 37
    .line 38
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    iget-wide v7, p1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->windowSequenceNumber:J

    .line 44
    .line 45
    move-object v0, p0

    .line 46
    move-wide v3, v2

    .line 47
    move-object v2, p2

    .line 48
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getMediaPeriodInfoForContent(Landroidx/media3/common/p1;Ljava/lang/Object;JJJ)Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1
.end method

.method private getMinStartPositionAfterAdGroupUs(Landroidx/media3/common/p1;Ljava/lang/Object;I)J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 7
    .line 8
    invoke-virtual {p1, p3}, Landroidx/media3/common/m1;->d(I)J

    .line 9
    .line 10
    .line 11
    move-result-wide p1

    .line 12
    const-wide/high16 v0, -0x8000000000000000L

    .line 13
    .line 14
    cmp-long v0, p1, v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 19
    .line 20
    iget-wide p1, p1, Landroidx/media3/common/m1;->d:J

    .line 21
    .line 22
    return-wide p1

    .line 23
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 24
    .line 25
    iget-object v0, v0, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 26
    .line 27
    invoke-virtual {v0, p3}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    iget-wide v0, p3, Landroidx/media3/common/b;->h:J

    .line 32
    .line 33
    add-long/2addr v0, p1

    .line 34
    return-wide v0
.end method

.method private hasServerSideInsertedAds(Ljava/lang/Object;Landroidx/media3/common/p1;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 2
    .line 3
    invoke-virtual {p2, p1, v0}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p1, p1, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 8
    .line 9
    iget p1, p1, Landroidx/media3/common/c;->b:I

    .line 10
    .line 11
    iget-object p2, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 12
    .line 13
    iget-object v0, p2, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 14
    .line 15
    iget v0, v0, Landroidx/media3/common/c;->e:I

    .line 16
    .line 17
    if-lez p1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p2, v0}, Landroidx/media3/common/m1;->h(I)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    const/4 p2, 0x1

    .line 26
    if-gt p1, p2, :cond_0

    .line 27
    .line 28
    iget-object p1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroidx/media3/common/m1;->d(I)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    const-wide/high16 v2, -0x8000000000000000L

    .line 35
    .line 36
    cmp-long p1, v0, v2

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    :cond_0
    return p2

    .line 41
    :cond_1
    const/4 p1, 0x0

    .line 42
    return p1
.end method

.method private isLastInPeriod(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget p1, p1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->nextAdGroupIndex:I

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1
.end method

.method private isLastInTimeline(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;Z)Z
    .locals 6

    .line 1
    iget-object p2, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object p2, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 8
    .line 9
    invoke-virtual {p1, v1, p2}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget p2, p2, Landroidx/media3/common/m1;->c:I

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->window:Landroidx/media3/common/o1;

    .line 16
    .line 17
    invoke-virtual {p1, p2, v0}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iget-boolean p2, p2, Landroidx/media3/common/o1;->i:Z

    .line 22
    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    iget-object v2, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 26
    .line 27
    iget-object v3, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->window:Landroidx/media3/common/o1;

    .line 28
    .line 29
    iget v4, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->repeatMode:I

    .line 30
    .line 31
    iget-boolean v5, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->shuffleModeEnabled:Z

    .line 32
    .line 33
    move-object v0, p1

    .line 34
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/common/p1;->isLastPeriod(ILandroidx/media3/common/m1;Landroidx/media3/common/o1;IZ)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    if-eqz p3, :cond_0

    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    return p1

    .line 44
    :cond_0
    const/4 p1, 0x0

    .line 45
    return p1
.end method

.method private isLastInWindow(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Z
    .locals 3

    .line 1
    invoke-direct {p0, p2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->isLastInPeriod(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v0, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v2, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 12
    .line 13
    invoke-virtual {p1, v0, v2}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget v0, v0, Landroidx/media3/common/m1;->c:I

    .line 18
    .line 19
    iget-object p2, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    iget-object v2, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->window:Landroidx/media3/common/o1;

    .line 26
    .line 27
    invoke-virtual {p1, v0, v2}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget p1, p1, Landroidx/media3/common/o1;->o:I

    .line 32
    .line 33
    if-ne p1, p2, :cond_1

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    return p1

    .line 37
    :cond_1
    return v1
.end method

.method private static isSkippableAdPeriod(Landroidx/media3/common/m1;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 2
    .line 3
    iget v0, v0, Landroidx/media3/common/c;->b:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-ne v0, v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Landroidx/media3/common/m1;->g(I)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-nez v3, :cond_5

    .line 16
    .line 17
    :cond_0
    iget-object v3, p0, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 18
    .line 19
    iget v3, v3, Landroidx/media3/common/c;->e:I

    .line 20
    .line 21
    invoke-virtual {p0, v3}, Landroidx/media3/common/m1;->h(I)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_5

    .line 26
    .line 27
    const-wide/16 v3, 0x0

    .line 28
    .line 29
    invoke-virtual {p0, v3, v4}, Landroidx/media3/common/m1;->c(J)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const/4 v6, -0x1

    .line 34
    if-eq v5, v6, :cond_1

    .line 35
    .line 36
    goto :goto_3

    .line 37
    :cond_1
    iget-wide v5, p0, Landroidx/media3/common/m1;->d:J

    .line 38
    .line 39
    cmp-long v5, v5, v3

    .line 40
    .line 41
    if-nez v5, :cond_2

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    add-int/lit8 v5, v0, -0x1

    .line 45
    .line 46
    invoke-virtual {p0, v5}, Landroidx/media3/common/m1;->g(I)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_3

    .line 51
    .line 52
    const/4 v5, 0x2

    .line 53
    goto :goto_0

    .line 54
    :cond_3
    move v5, v2

    .line 55
    :goto_0
    sub-int/2addr v0, v5

    .line 56
    move v5, v1

    .line 57
    :goto_1
    if-gt v5, v0, :cond_4

    .line 58
    .line 59
    iget-object v6, p0, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 60
    .line 61
    invoke-virtual {v6, v5}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    iget-wide v6, v6, Landroidx/media3/common/b;->h:J

    .line 66
    .line 67
    add-long/2addr v3, v6

    .line 68
    add-int/lit8 v5, v5, 0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_4
    iget-wide v5, p0, Landroidx/media3/common/m1;->d:J

    .line 72
    .line 73
    cmp-long p0, v5, v3

    .line 74
    .line 75
    if-gtz p0, :cond_5

    .line 76
    .line 77
    :goto_2
    return v2

    .line 78
    :cond_5
    :goto_3
    return v1
.end method

.method private synthetic lambda$notifyQueueUpdate$0(Lf6/j0;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->analyticsCollector:Landroidx/media3/exoplayer/analytics/AnalyticsCollector;

    .line 2
    .line 3
    invoke-virtual {p1}, Lf6/j0;->f()Lf6/l1;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1, p2}, Landroidx/media3/exoplayer/analytics/AnalyticsCollector;->updateMediaPeriodQueueInfo(Ljava/util/List;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private notifyQueueUpdate()V
    .locals 5

    .line 1
    invoke-static {}, Lf6/m0;->i()Lf6/j0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->playing:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 6
    .line 7
    :goto_0
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v2, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 10
    .line 11
    iget-object v2, v2, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Lf6/g0;->a(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->reading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 22
    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    iget-object v1, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 28
    .line 29
    iget-object v1, v1, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 30
    .line 31
    :goto_1
    iget-object v2, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->analyticsCollectorHandler:Lh1/k;

    .line 32
    .line 33
    new-instance v3, Landroidx/media3/exoplayer/y;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-direct {v3, p0, v0, v1, v4}, Landroidx/media3/exoplayer/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    check-cast v2, Lh1/b0;

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Lh1/b0;->e(Ljava/lang/Runnable;)Z

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method private releaseAndResetPreloadPriorityList(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/MediaPeriodHolder;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->preloadPriorityList:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->preloadPriorityList:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->release()V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput-object p1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->preloadPriorityList:Ljava/util/List;

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    iput-object p1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->preloading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->maybeUpdatePreloadMediaPeriodHolder()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method private removePreloadedMediaPeriodHolder(Landroidx/media3/exoplayer/MediaPeriodInfo;)Landroidx/media3/exoplayer/MediaPeriodHolder;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->preloadPriorityList:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->preloadPriorityList:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->canBeUsedForMediaPeriodInfo(Landroidx/media3/exoplayer/MediaPeriodInfo;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    iget-object p1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->preloadPriorityList:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 p1, 0x0

    .line 37
    return-object p1
.end method

.method private static resolveMediaPeriodIdForAds(Landroidx/media3/common/p1;Ljava/lang/Object;JJLandroidx/media3/common/o1;Landroidx/media3/common/m1;)Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;
    .locals 2

    .line 3
    invoke-virtual {p0, p1, p7}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 4
    iget v0, p7, Landroidx/media3/common/m1;->c:I

    invoke-virtual {p0, v0, p6}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 5
    invoke-virtual {p0, p1}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    move-result v0

    .line 6
    :goto_0
    invoke-static {p7}, Landroidx/media3/exoplayer/MediaPeriodQueue;->isSkippableAdPeriod(Landroidx/media3/common/m1;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p6, Landroidx/media3/common/o1;->o:I

    if-gt v0, v1, :cond_0

    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0, v0, p7, p1}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;Z)Landroidx/media3/common/m1;

    .line 8
    iget-object p1, p7, Landroidx/media3/common/m1;->b:Ljava/lang/Object;

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0, p1, p7}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    move-wide v0, p2

    .line 11
    invoke-virtual {p7, v0, v1}, Landroidx/media3/common/m1;->c(J)I

    move-result p2

    const/4 p0, -0x1

    if-ne p2, p0, :cond_1

    .line 12
    invoke-virtual {p7, v0, v1}, Landroidx/media3/common/m1;->b(J)I

    move-result p0

    .line 13
    new-instance p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    invoke-direct {p2, p1, p4, p5, p0}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;-><init>(Ljava/lang/Object;JI)V

    return-object p2

    .line 14
    :cond_1
    invoke-virtual {p7, p2}, Landroidx/media3/common/m1;->f(I)I

    move-result p3

    .line 15
    new-instance p0, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    invoke-direct/range {p0 .. p5}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;-><init>(Ljava/lang/Object;IIJ)V

    return-object p0
.end method

.method private resolvePeriodUidToWindowSequenceNumber(Landroidx/media3/common/p1;Ljava/lang/Object;)J
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, Landroidx/media3/common/m1;->c:I

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->oldFrontPeriodUid:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eq v1, v2, :cond_0

    .line 19
    .line 20
    iget-object v3, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 21
    .line 22
    invoke-virtual {p1, v1, v3}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget v1, v1, Landroidx/media3/common/m1;->c:I

    .line 27
    .line 28
    if-ne v1, v0, :cond_0

    .line 29
    .line 30
    iget-wide p1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->oldFrontPeriodWindowSequenceNumber:J

    .line 31
    .line 32
    return-wide p1

    .line 33
    :cond_0
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->playing:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 34
    .line 35
    :goto_0
    if-eqz v1, :cond_2

    .line 36
    .line 37
    iget-object v3, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->uid:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-virtual {v3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    iget-object p1, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 46
    .line 47
    iget-object p1, p1, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 48
    .line 49
    iget-wide p1, p1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->windowSequenceNumber:J

    .line 50
    .line 51
    return-wide p1

    .line 52
    :cond_1
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->playing:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 58
    .line 59
    :goto_1
    if-eqz v1, :cond_4

    .line 60
    .line 61
    iget-object v3, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->uid:Ljava/lang/Object;

    .line 62
    .line 63
    invoke-virtual {p1, v3}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eq v3, v2, :cond_3

    .line 68
    .line 69
    iget-object v4, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 70
    .line 71
    invoke-virtual {p1, v3, v4}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    iget v3, v3, Landroidx/media3/common/m1;->c:I

    .line 76
    .line 77
    if-ne v3, v0, :cond_3

    .line 78
    .line 79
    iget-object p1, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 80
    .line 81
    iget-object p1, p1, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 82
    .line 83
    iget-wide p1, p1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->windowSequenceNumber:J

    .line 84
    .line 85
    return-wide p1

    .line 86
    :cond_3
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    goto :goto_1

    .line 91
    :cond_4
    invoke-direct {p0, p2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(Ljava/lang/Object;)J

    .line 92
    .line 93
    .line 94
    move-result-wide v0

    .line 95
    const-wide/16 v2, -0x1

    .line 96
    .line 97
    cmp-long p1, v0, v2

    .line 98
    .line 99
    if-eqz p1, :cond_5

    .line 100
    .line 101
    return-wide v0

    .line 102
    :cond_5
    iget-wide v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->nextWindowSequenceNumber:J

    .line 103
    .line 104
    const-wide/16 v2, 0x1

    .line 105
    .line 106
    add-long/2addr v2, v0

    .line 107
    iput-wide v2, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->nextWindowSequenceNumber:J

    .line 108
    .line 109
    iget-object p1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->playing:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 110
    .line 111
    if-nez p1, :cond_6

    .line 112
    .line 113
    iput-object p2, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->oldFrontPeriodUid:Ljava/lang/Object;

    .line 114
    .line 115
    iput-wide v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->oldFrontPeriodWindowSequenceNumber:J

    .line 116
    .line 117
    :cond_6
    return-wide v0
.end method

.method private resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(Ljava/lang/Object;)J
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->preloadPriorityList:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->preloadPriorityList:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 17
    .line 18
    iget-object v2, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->uid:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    iget-object p1, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 27
    .line 28
    iget-object p1, p1, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 29
    .line 30
    iget-wide v0, p1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->windowSequenceNumber:J

    .line 31
    .line 32
    return-wide v0

    .line 33
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const-wide/16 v0, -0x1

    .line 37
    .line 38
    return-wide v0
.end method

.method private updateForPlaybackModeChange(Landroidx/media3/common/p1;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->playing:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v2, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->uid:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p1, v2}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    move v3, v2

    .line 14
    :goto_0
    iget-object v4, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 15
    .line 16
    iget-object v5, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->window:Landroidx/media3/common/o1;

    .line 17
    .line 18
    iget v6, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->repeatMode:I

    .line 19
    .line 20
    iget-boolean v7, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->shuffleModeEnabled:Z

    .line 21
    .line 22
    move-object v2, p1

    .line 23
    invoke-virtual/range {v2 .. v7}, Landroidx/media3/common/p1;->getNextPeriodIndex(ILandroidx/media3/common/m1;Landroidx/media3/common/o1;IZ)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 37
    .line 38
    iget-boolean p1, p1, Landroidx/media3/exoplayer/MediaPeriodInfo;->isLastInTimelinePeriod:Z

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const/4 v4, -0x1

    .line 52
    if-eq v3, v4, :cond_4

    .line 53
    .line 54
    if-nez p1, :cond_2

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    iget-object v4, p1, Landroidx/media3/exoplayer/MediaPeriodHolder;->uid:Ljava/lang/Object;

    .line 58
    .line 59
    invoke-virtual {v2, v4}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eq v4, v3, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move-object v0, p1

    .line 67
    move-object p1, v2

    .line 68
    goto :goto_0

    .line 69
    :cond_4
    :goto_2
    invoke-virtual {p0, v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->removeAfter(Landroidx/media3/exoplayer/MediaPeriodHolder;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    iget-object v3, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 74
    .line 75
    invoke-virtual {p0, v2, v3}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getUpdatedMediaPeriodInfo(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/MediaPeriodInfo;)Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    iput-object v2, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 80
    .line 81
    xor-int/2addr p1, v1

    .line 82
    return p1
.end method


# virtual methods
.method public advancePlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->playing:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    iget-object v2, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->reading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 8
    .line 9
    if-ne v0, v2, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->reading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 16
    .line 17
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->playing:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->release()V

    .line 20
    .line 21
    .line 22
    iget v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->length:I

    .line 23
    .line 24
    add-int/lit8 v0, v0, -0x1

    .line 25
    .line 26
    iput v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->length:I

    .line 27
    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    iput-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->loading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 31
    .line 32
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->playing:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 33
    .line 34
    iget-object v1, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->uid:Ljava/lang/Object;

    .line 35
    .line 36
    iput-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->oldFrontPeriodUid:Ljava/lang/Object;

    .line 37
    .line 38
    iget-object v0, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 39
    .line 40
    iget-object v0, v0, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 41
    .line 42
    iget-wide v0, v0, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->windowSequenceNumber:J

    .line 43
    .line 44
    iput-wide v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->oldFrontPeriodWindowSequenceNumber:J

    .line 45
    .line 46
    :cond_2
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->playing:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->playing:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 53
    .line 54
    invoke-direct {p0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->notifyQueueUpdate()V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->playing:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 58
    .line 59
    return-object v0
.end method

.method public advanceReadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->reading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->reading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 11
    .line 12
    invoke-direct {p0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->notifyQueueUpdate()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->reading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 16
    .line 17
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public clear()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->length:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->playing:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 7
    .line 8
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->uid:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->oldFrontPeriodUid:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v1, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 16
    .line 17
    iget-object v1, v1, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 18
    .line 19
    iget-wide v1, v1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->windowSequenceNumber:J

    .line 20
    .line 21
    iput-wide v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->oldFrontPeriodWindowSequenceNumber:J

    .line 22
    .line 23
    :goto_0
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->release()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    iput-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->playing:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 35
    .line 36
    iput-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->loading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 37
    .line 38
    iput-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->reading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    iput v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->length:I

    .line 42
    .line 43
    invoke-direct {p0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->notifyQueueUpdate()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public enqueueNextMediaPeriodHolder(Landroidx/media3/exoplayer/MediaPeriodInfo;)Landroidx/media3/exoplayer/MediaPeriodHolder;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->loading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-wide v0, 0xe8d4a51000L

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getRendererOffset()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-object v2, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->loading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 16
    .line 17
    iget-object v2, v2, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 18
    .line 19
    iget-wide v2, v2, Landroidx/media3/exoplayer/MediaPeriodInfo;->durationUs:J

    .line 20
    .line 21
    add-long/2addr v0, v2

    .line 22
    iget-wide v2, p1, Landroidx/media3/exoplayer/MediaPeriodInfo;->startPositionUs:J

    .line 23
    .line 24
    sub-long/2addr v0, v2

    .line 25
    :goto_0
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->removePreloadedMediaPeriodHolder(Landroidx/media3/exoplayer/MediaPeriodInfo;)Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    iget-object v2, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->mediaPeriodHolderFactory:Landroidx/media3/exoplayer/MediaPeriodHolder$Factory;

    .line 32
    .line 33
    invoke-interface {v2, p1, v0, v1}, Landroidx/media3/exoplayer/MediaPeriodHolder$Factory;->create(Landroidx/media3/exoplayer/MediaPeriodInfo;J)Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    iput-object p1, v2, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 39
    .line 40
    invoke-virtual {v2, v0, v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->setRendererOffset(J)V

    .line 41
    .line 42
    .line 43
    :goto_1
    iget-object p1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->loading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 44
    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    invoke-virtual {p1, v2}, Landroidx/media3/exoplayer/MediaPeriodHolder;->setNext(Landroidx/media3/exoplayer/MediaPeriodHolder;)V

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    iput-object v2, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->playing:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 52
    .line 53
    iput-object v2, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->reading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 54
    .line 55
    :goto_2
    const/4 p1, 0x0

    .line 56
    iput-object p1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->oldFrontPeriodUid:Ljava/lang/Object;

    .line 57
    .line 58
    iput-object v2, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->loading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 59
    .line 60
    iget p1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->length:I

    .line 61
    .line 62
    add-int/lit8 p1, p1, 0x1

    .line 63
    .line 64
    iput p1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->length:I

    .line 65
    .line 66
    invoke-direct {p0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->notifyQueueUpdate()V

    .line 67
    .line 68
    .line 69
    return-object v2
.end method

.method public getLoadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->loading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 2
    .line 3
    return-object v0
.end method

.method public getNextMediaPeriodInfo(JLandroidx/media3/exoplayer/PlaybackInfo;)Landroidx/media3/exoplayer/MediaPeriodInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->loading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, p3}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getFirstMediaPeriodInfo(Landroidx/media3/exoplayer/PlaybackInfo;)Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-object p3, p3, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 11
    .line 12
    invoke-direct {p0, p3, v0, p1, p2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getFollowingMediaPeriodInfo(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/MediaPeriodHolder;J)Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->playing:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPreloadHolderByMediaPeriod(Landroidx/media3/exoplayer/source/MediaPeriod;)Landroidx/media3/exoplayer/MediaPeriodHolder;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->preloadPriorityList:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->preloadPriorityList:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 17
    .line 18
    iget-object v2, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->mediaPeriod:Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 19
    .line 20
    if-ne v2, p1, :cond_0

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    return-object p1
.end method

.method public getPreloadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->preloading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 2
    .line 3
    return-object v0
.end method

.method public getReadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->reading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 2
    .line 3
    return-object v0
.end method

.method public getUpdatedMediaPeriodInfo(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/MediaPeriodInfo;)Landroidx/media3/exoplayer/MediaPeriodInfo;
    .locals 15

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    iget-object v3, v2, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 6
    .line 7
    invoke-direct {p0, v3}, Landroidx/media3/exoplayer/MediaPeriodQueue;->isLastInPeriod(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Z

    .line 8
    .line 9
    .line 10
    move-result v12

    .line 11
    invoke-direct {p0, v1, v3}, Landroidx/media3/exoplayer/MediaPeriodQueue;->isLastInWindow(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Z

    .line 12
    .line 13
    .line 14
    move-result v13

    .line 15
    invoke-direct {p0, v1, v3, v12}, Landroidx/media3/exoplayer/MediaPeriodQueue;->isLastInTimeline(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v14

    .line 19
    iget-object v4, v2, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 20
    .line 21
    iget-object v4, v4, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v5, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 24
    .line 25
    invoke-virtual {v1, v4, v5}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    const/4 v6, -0x1

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    iget v1, v3, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->nextAdGroupIndex:I

    .line 41
    .line 42
    if-ne v1, v6, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iget-object v7, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 46
    .line 47
    invoke-virtual {v7, v1}, Landroidx/media3/common/m1;->d(I)J

    .line 48
    .line 49
    .line 50
    move-result-wide v7

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    :goto_0
    move-wide v7, v4

    .line 53
    :goto_1
    invoke-virtual {v3}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 60
    .line 61
    iget v4, v3, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 62
    .line 63
    iget v5, v3, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adIndexInAdGroup:I

    .line 64
    .line 65
    invoke-virtual {v1, v4, v5}, Landroidx/media3/common/m1;->a(II)J

    .line 66
    .line 67
    .line 68
    move-result-wide v4

    .line 69
    :goto_2
    move-wide v9, v4

    .line 70
    goto :goto_4

    .line 71
    :cond_2
    cmp-long v1, v7, v4

    .line 72
    .line 73
    if-eqz v1, :cond_4

    .line 74
    .line 75
    const-wide/high16 v4, -0x8000000000000000L

    .line 76
    .line 77
    cmp-long v1, v7, v4

    .line 78
    .line 79
    if-nez v1, :cond_3

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_3
    move-wide v9, v7

    .line 83
    goto :goto_4

    .line 84
    :cond_4
    :goto_3
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 85
    .line 86
    iget-wide v4, v1, Landroidx/media3/common/m1;->d:J

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :goto_4
    invoke-virtual {v3}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_5

    .line 94
    .line 95
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 96
    .line 97
    iget v4, v3, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 98
    .line 99
    invoke-virtual {v1, v4}, Landroidx/media3/common/m1;->h(I)Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    :goto_5
    move v11, v1

    .line 104
    goto :goto_6

    .line 105
    :cond_5
    iget v1, v3, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->nextAdGroupIndex:I

    .line 106
    .line 107
    if-eq v1, v6, :cond_6

    .line 108
    .line 109
    iget-object v4, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 110
    .line 111
    invoke-virtual {v4, v1}, Landroidx/media3/common/m1;->h(I)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_6

    .line 116
    .line 117
    const/4 v1, 0x1

    .line 118
    goto :goto_5

    .line 119
    :cond_6
    const/4 v1, 0x0

    .line 120
    goto :goto_5

    .line 121
    :goto_6
    new-instance v1, Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 122
    .line 123
    move-object v5, v3

    .line 124
    iget-wide v3, v2, Landroidx/media3/exoplayer/MediaPeriodInfo;->startPositionUs:J

    .line 125
    .line 126
    move-object/from16 p1, v1

    .line 127
    .line 128
    iget-wide v0, v2, Landroidx/media3/exoplayer/MediaPeriodInfo;->requestedContentPositionUs:J

    .line 129
    .line 130
    move-object v2, v5

    .line 131
    move-wide v5, v0

    .line 132
    move-object/from16 v1, p1

    .line 133
    .line 134
    invoke-direct/range {v1 .. v14}, Landroidx/media3/exoplayer/MediaPeriodInfo;-><init>(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJJJZZZZ)V

    .line 135
    .line 136
    .line 137
    return-object v1
.end method

.method public invalidatePreloadPool(Landroidx/media3/common/p1;)V
    .locals 14

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->preloadConfiguration:Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;

    .line 2
    .line 3
    iget-wide v0, v0, Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;->targetPreloadDurationUs:J

    .line 4
    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->loading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    :cond_0
    move-object v7, p0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-object v2, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 26
    .line 27
    iget-object v2, v2, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 28
    .line 29
    iget-object v2, v2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 30
    .line 31
    const-wide/16 v3, 0x0

    .line 32
    .line 33
    invoke-direct {p0, p1, v2, v3, v4}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getDefaultPeriodPositionOfNextWindow(Landroidx/media3/common/p1;Ljava/lang/Object;J)Landroid/util/Pair;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 40
    .line 41
    iget-object v4, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 42
    .line 43
    invoke-virtual {p1, v3, v4}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    iget v3, v3, Landroidx/media3/common/m1;->c:I

    .line 48
    .line 49
    iget-object v4, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->window:Landroidx/media3/common/o1;

    .line 50
    .line 51
    invoke-virtual {p1, v3, v4}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3}, Landroidx/media3/common/o1;->a()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-nez v3, :cond_4

    .line 60
    .line 61
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 62
    .line 63
    invoke-direct {p0, v3}, Landroidx/media3/exoplayer/MediaPeriodQueue;->resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(Ljava/lang/Object;)J

    .line 64
    .line 65
    .line 66
    move-result-wide v3

    .line 67
    const-wide/16 v5, -0x1

    .line 68
    .line 69
    cmp-long v5, v3, v5

    .line 70
    .line 71
    if-nez v5, :cond_2

    .line 72
    .line 73
    iget-wide v3, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->nextWindowSequenceNumber:J

    .line 74
    .line 75
    const-wide/16 v5, 0x1

    .line 76
    .line 77
    add-long/2addr v5, v3

    .line 78
    iput-wide v5, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->nextWindowSequenceNumber:J

    .line 79
    .line 80
    :cond_2
    move-wide v12, v3

    .line 81
    iget-object v9, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 82
    .line 83
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v2, Ljava/lang/Long;

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 88
    .line 89
    .line 90
    move-result-wide v10

    .line 91
    move-object v7, p0

    .line 92
    move-object v8, p1

    .line 93
    invoke-direct/range {v7 .. v13}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getMediaPeriodInfoForPeriodPosition(Landroidx/media3/common/p1;Ljava/lang/Object;JJ)Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->removePreloadedMediaPeriodHolder(Landroidx/media3/exoplayer/MediaPeriodInfo;)Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    if-nez v2, :cond_3

    .line 102
    .line 103
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getRendererOffset()J

    .line 104
    .line 105
    .line 106
    move-result-wide v2

    .line 107
    iget-object v0, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 108
    .line 109
    iget-wide v4, v0, Landroidx/media3/exoplayer/MediaPeriodInfo;->durationUs:J

    .line 110
    .line 111
    add-long/2addr v2, v4

    .line 112
    iget-wide v4, p1, Landroidx/media3/exoplayer/MediaPeriodInfo;->startPositionUs:J

    .line 113
    .line 114
    sub-long/2addr v2, v4

    .line 115
    iget-object v0, v7, Landroidx/media3/exoplayer/MediaPeriodQueue;->mediaPeriodHolderFactory:Landroidx/media3/exoplayer/MediaPeriodHolder$Factory;

    .line 116
    .line 117
    invoke-interface {v0, p1, v2, v3}, Landroidx/media3/exoplayer/MediaPeriodHolder$Factory;->create(Landroidx/media3/exoplayer/MediaPeriodInfo;J)Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    :cond_3
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_4
    move-object v7, p0

    .line 126
    :goto_0
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->releaseAndResetPreloadPriorityList(Ljava/util/List;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :goto_1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->releasePreloadPool()V

    .line 131
    .line 132
    .line 133
    return-void
.end method

.method public isLoading(Landroidx/media3/exoplayer/source/MediaPeriod;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->loading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->mediaPeriod:Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 6
    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method public isPreloading(Landroidx/media3/exoplayer/source/MediaPeriod;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->preloading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->mediaPeriod:Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 6
    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method public maybeUpdatePreloadMediaPeriodHolder()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->preloading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->isFullyPreloaded()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->preloading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->preloadPriorityList:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-ge v0, v1, :cond_2

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->preloadPriorityList:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 31
    .line 32
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->isFullyPreloaded()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    iput-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->preloading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    return-void
.end method

.method public reevaluateBuffer(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->loading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroidx/media3/exoplayer/MediaPeriodHolder;->reevaluateBuffer(J)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public releasePreloadPool()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->preloadPriorityList:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->releaseAndResetPreloadPriorityList(Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public removeAfter(Landroidx/media3/exoplayer/MediaPeriodHolder;)Z
    .locals 3

    .line 1
    invoke-static {p1}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->loading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    iput-object p1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->loading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 15
    .line 16
    :goto_0
    invoke-virtual {p1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->reading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-ne p1, v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->playing:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 35
    .line 36
    iput-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->reading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 37
    .line 38
    move v1, v2

    .line 39
    :cond_1
    invoke-virtual {p1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->release()V

    .line 40
    .line 41
    .line 42
    iget v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->length:I

    .line 43
    .line 44
    sub-int/2addr v0, v2

    .line 45
    iput v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->length:I

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    iget-object p1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->loading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->setNext(Landroidx/media3/exoplayer/MediaPeriodHolder;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->notifyQueueUpdate()V

    .line 58
    .line 59
    .line 60
    return v1
.end method

.method public resolveMediaPeriodIdForAds(Landroidx/media3/common/p1;Ljava/lang/Object;J)Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;
    .locals 8

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->resolvePeriodUidToWindowSequenceNumber(Landroidx/media3/common/p1;Ljava/lang/Object;)J

    move-result-wide v4

    .line 2
    iget-object v6, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->window:Landroidx/media3/common/o1;

    iget-object v7, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    move-object v0, p1

    move-object v1, p2

    move-wide v2, p3

    invoke-static/range {v0 .. v7}, Landroidx/media3/exoplayer/MediaPeriodQueue;->resolveMediaPeriodIdForAds(Landroidx/media3/common/p1;Ljava/lang/Object;JJLandroidx/media3/common/o1;Landroidx/media3/common/m1;)Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    move-result-object p1

    return-object p1
.end method

.method public resolveMediaPeriodIdForAdsAfterPeriodPositionChange(Landroidx/media3/common/p1;Ljava/lang/Object;J)Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;
    .locals 10

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->resolvePeriodUidToWindowSequenceNumber(Landroidx/media3/common/p1;Ljava/lang/Object;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v4

    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 6
    .line 7
    invoke-virtual {p1, p2, v0}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 11
    .line 12
    iget v0, v0, Landroidx/media3/common/m1;->c:I

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->window:Landroidx/media3/common/o1;

    .line 15
    .line 16
    invoke-virtual {p1, v0, v1}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x0

    .line 24
    move v2, v1

    .line 25
    :goto_0
    iget-object v3, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->window:Landroidx/media3/common/o1;

    .line 26
    .line 27
    iget v3, v3, Landroidx/media3/common/o1;->n:I

    .line 28
    .line 29
    if-lt v0, v3, :cond_2

    .line 30
    .line 31
    iget-object v3, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 32
    .line 33
    const/4 v6, 0x1

    .line 34
    invoke-virtual {p1, v0, v3, v6}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;Z)Landroidx/media3/common/m1;

    .line 35
    .line 36
    .line 37
    iget-object v3, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 38
    .line 39
    iget-object v7, v3, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 40
    .line 41
    iget v7, v7, Landroidx/media3/common/c;->b:I

    .line 42
    .line 43
    if-lez v7, :cond_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    move v6, v1

    .line 47
    :goto_1
    or-int/2addr v2, v6

    .line 48
    iget-wide v7, v3, Landroidx/media3/common/m1;->d:J

    .line 49
    .line 50
    invoke-virtual {v3, v7, v8}, Landroidx/media3/common/m1;->c(J)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    const/4 v7, -0x1

    .line 55
    if-eq v3, v7, :cond_1

    .line 56
    .line 57
    iget-object p2, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 58
    .line 59
    iget-object p2, p2, Landroidx/media3/common/m1;->b:Ljava/lang/Object;

    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    :cond_1
    if-eqz v2, :cond_3

    .line 65
    .line 66
    if-eqz v6, :cond_2

    .line 67
    .line 68
    iget-object v3, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 69
    .line 70
    iget-wide v6, v3, Landroidx/media3/common/m1;->d:J

    .line 71
    .line 72
    const-wide/16 v8, 0x0

    .line 73
    .line 74
    cmp-long v3, v6, v8

    .line 75
    .line 76
    if-eqz v3, :cond_3

    .line 77
    .line 78
    :cond_2
    move-object v1, p2

    .line 79
    goto :goto_2

    .line 80
    :cond_3
    add-int/lit8 v0, v0, -0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :goto_2
    iget-object v6, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->window:Landroidx/media3/common/o1;

    .line 84
    .line 85
    iget-object v7, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->period:Landroidx/media3/common/m1;

    .line 86
    .line 87
    move-object v0, p1

    .line 88
    move-wide v2, p3

    .line 89
    invoke-static/range {v0 .. v7}, Landroidx/media3/exoplayer/MediaPeriodQueue;->resolveMediaPeriodIdForAds(Landroidx/media3/common/p1;Ljava/lang/Object;JJLandroidx/media3/common/o1;Landroidx/media3/common/m1;)Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    return-object p1
.end method

.method public shouldLoadNextMediaPeriod()Z
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->loading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 6
    .line 7
    iget-boolean v1, v1, Landroidx/media3/exoplayer/MediaPeriodInfo;->isFinal:Z

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->isFullyBuffered()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->loading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 18
    .line 19
    iget-object v0, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 20
    .line 21
    iget-wide v0, v0, Landroidx/media3/exoplayer/MediaPeriodInfo;->durationUs:J

    .line 22
    .line 23
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    cmp-long v0, v0, v2

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    iget v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->length:I

    .line 33
    .line 34
    const/16 v1, 0x64

    .line 35
    .line 36
    if-ge v0, v1, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v0, 0x0

    .line 40
    return v0

    .line 41
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 42
    return v0
.end method

.method public updatePreloadConfiguration(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;)V
    .locals 0

    .line 1
    iput-object p2, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->preloadConfiguration:Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->invalidatePreloadPool(Landroidx/media3/common/p1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public updateQueuedPeriods(Landroidx/media3/common/p1;JJ)Z
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->playing:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_8

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1, v3}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getUpdatedMediaPeriodInfo(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/MediaPeriodInfo;)Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    goto :goto_2

    .line 16
    :cond_0
    invoke-direct {p0, p1, v1, p2, p3}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getFollowingMediaPeriodInfo(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/MediaPeriodHolder;J)Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->removeAfter(Landroidx/media3/exoplayer/MediaPeriodHolder;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    :goto_1
    xor-int/2addr p1, v2

    .line 27
    return p1

    .line 28
    :cond_1
    invoke-direct {p0, v3, v4}, Landroidx/media3/exoplayer/MediaPeriodQueue;->canKeepMediaPeriodHolder(Landroidx/media3/exoplayer/MediaPeriodInfo;Landroidx/media3/exoplayer/MediaPeriodInfo;)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-nez v5, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->removeAfter(Landroidx/media3/exoplayer/MediaPeriodHolder;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move-object v1, v4

    .line 40
    :goto_2
    iget-wide v4, v3, Landroidx/media3/exoplayer/MediaPeriodInfo;->requestedContentPositionUs:J

    .line 41
    .line 42
    invoke-virtual {v1, v4, v5}, Landroidx/media3/exoplayer/MediaPeriodInfo;->copyWithRequestedContentPositionUs(J)Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    iput-object v4, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 47
    .line 48
    iget-wide v3, v3, Landroidx/media3/exoplayer/MediaPeriodInfo;->durationUs:J

    .line 49
    .line 50
    iget-wide v5, v1, Landroidx/media3/exoplayer/MediaPeriodInfo;->durationUs:J

    .line 51
    .line 52
    invoke-static {v3, v4, v5, v6}, Landroidx/media3/exoplayer/MediaPeriodQueue;->areDurationsCompatible(JJ)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-nez v3, :cond_7

    .line 57
    .line 58
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->updateClipping()V

    .line 59
    .line 60
    .line 61
    iget-wide p1, v1, Landroidx/media3/exoplayer/MediaPeriodInfo;->durationUs:J

    .line 62
    .line 63
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    cmp-long p3, p1, v3

    .line 69
    .line 70
    if-nez p3, :cond_3

    .line 71
    .line 72
    const-wide p1, 0x7fffffffffffffffL

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    invoke-virtual {v0, p1, p2}, Landroidx/media3/exoplayer/MediaPeriodHolder;->toRendererTime(J)J

    .line 79
    .line 80
    .line 81
    move-result-wide p1

    .line 82
    :goto_3
    iget-object p3, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->reading:Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    if-ne v0, p3, :cond_5

    .line 86
    .line 87
    iget-object p3, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 88
    .line 89
    iget-boolean p3, p3, Landroidx/media3/exoplayer/MediaPeriodInfo;->isFollowedByTransitionToSameStream:Z

    .line 90
    .line 91
    if-nez p3, :cond_5

    .line 92
    .line 93
    const-wide/high16 v3, -0x8000000000000000L

    .line 94
    .line 95
    cmp-long p3, p4, v3

    .line 96
    .line 97
    if-eqz p3, :cond_4

    .line 98
    .line 99
    cmp-long p1, p4, p1

    .line 100
    .line 101
    if-ltz p1, :cond_5

    .line 102
    .line 103
    :cond_4
    move p1, v2

    .line 104
    goto :goto_4

    .line 105
    :cond_5
    move p1, v1

    .line 106
    :goto_4
    invoke-virtual {p0, v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->removeAfter(Landroidx/media3/exoplayer/MediaPeriodHolder;)Z

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    if-nez p2, :cond_6

    .line 111
    .line 112
    if-nez p1, :cond_6

    .line 113
    .line 114
    return v2

    .line 115
    :cond_6
    return v1

    .line 116
    :cond_7
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    move-object v7, v1

    .line 121
    move-object v1, v0

    .line 122
    move-object v0, v7

    .line 123
    goto :goto_0

    .line 124
    :cond_8
    return v2
.end method

.method public updateRepeatMode(Landroidx/media3/common/p1;I)Z
    .locals 0

    .line 1
    iput p2, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->repeatMode:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->updateForPlaybackModeChange(Landroidx/media3/common/p1;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public updateShuffleModeEnabled(Landroidx/media3/common/p1;Z)Z
    .locals 0

    .line 1
    iput-boolean p2, p0, Landroidx/media3/exoplayer/MediaPeriodQueue;->shuffleModeEnabled:Z

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->updateForPlaybackModeChange(Landroidx/media3/common/p1;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
