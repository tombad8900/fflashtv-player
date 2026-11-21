.class public final Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameTimingEvaluator;,
        Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;,
        Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseAction;
    }
.end annotation


# static fields
.field public static final FRAME_RELEASE_DROP:I = 0x2

.field public static final FRAME_RELEASE_IGNORE:I = 0x4

.field public static final FRAME_RELEASE_IMMEDIATELY:I = 0x0

.field public static final FRAME_RELEASE_SCHEDULED:I = 0x1

.field public static final FRAME_RELEASE_SKIP:I = 0x3

.field public static final FRAME_RELEASE_TRY_AGAIN_LATER:I = 0x5

.field private static final MAX_EARLY_US_THRESHOLD:J = 0xc350L


# instance fields
.field private final allowedJoiningTimeMs:J

.field private clock:Lh1/b;

.field private firstFrameState:I

.field private final frameReleaseHelper:Landroidx/media3/exoplayer/video/VideoFrameReleaseHelper;

.field private final frameTimingEvaluator:Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameTimingEvaluator;

.field private initialPositionUs:J

.field private joiningDeadlineMs:J

.field private joiningRenderNextFrameImmediately:Z

.field private lastPresentationTimeUs:J

.field private lastReleaseRealtimeUs:J

.field private playbackSpeed:F

.field private started:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameTimingEvaluator;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->frameTimingEvaluator:Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameTimingEvaluator;

    .line 5
    .line 6
    iput-wide p3, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->allowedJoiningTimeMs:J

    .line 7
    .line 8
    new-instance p2, Landroidx/media3/exoplayer/video/VideoFrameReleaseHelper;

    .line 9
    .line 10
    invoke-direct {p2, p1}, Landroidx/media3/exoplayer/video/VideoFrameReleaseHelper;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->frameReleaseHelper:Landroidx/media3/exoplayer/video/VideoFrameReleaseHelper;

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput p1, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->firstFrameState:I

    .line 17
    .line 18
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    iput-wide p1, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->initialPositionUs:J

    .line 24
    .line 25
    iput-wide p1, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->lastPresentationTimeUs:J

    .line 26
    .line 27
    iput-wide p1, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->joiningDeadlineMs:J

    .line 28
    .line 29
    const/high16 p1, 0x3f800000    # 1.0f

    .line 30
    .line 31
    iput p1, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->playbackSpeed:F

    .line 32
    .line 33
    sget-object p1, Lh1/b;->a:Lh1/z;

    .line 34
    .line 35
    iput-object p1, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->clock:Lh1/b;

    .line 36
    .line 37
    return-void
.end method

.method private calculateEarlyTimeUs(JJJ)J
    .locals 0

    .line 1
    sub-long/2addr p5, p1

    .line 2
    long-to-double p1, p5

    .line 3
    iget p5, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->playbackSpeed:F

    .line 4
    .line 5
    float-to-double p5, p5

    .line 6
    div-double/2addr p1, p5

    .line 7
    double-to-long p1, p1

    .line 8
    iget-boolean p5, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->started:Z

    .line 9
    .line 10
    if-eqz p5, :cond_0

    .line 11
    .line 12
    iget-object p5, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->clock:Lh1/b;

    .line 13
    .line 14
    check-cast p5, Lh1/z;

    .line 15
    .line 16
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 20
    .line 21
    .line 22
    move-result-wide p5

    .line 23
    invoke-static {p5, p6}, Lh1/i0;->S(J)J

    .line 24
    .line 25
    .line 26
    move-result-wide p5

    .line 27
    sub-long/2addr p5, p3

    .line 28
    sub-long/2addr p1, p5

    .line 29
    :cond_0
    return-wide p1
.end method

.method private lowerFirstFrameState(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->firstFrameState:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->firstFrameState:I

    .line 8
    .line 9
    return-void
.end method

.method private shouldForceRelease(JJJ)Z
    .locals 4

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->joiningDeadlineMs:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->joiningRenderNextFrameImmediately:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return v1

    .line 18
    :cond_0
    iget v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->firstFrameState:I

    .line 19
    .line 20
    if-eqz v0, :cond_6

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    if-eq v0, v2, :cond_5

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    if-eq v0, v3, :cond_3

    .line 27
    .line 28
    const/4 p1, 0x3

    .line 29
    if-ne v0, p1, :cond_2

    .line 30
    .line 31
    iget-object p1, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->clock:Lh1/b;

    .line 32
    .line 33
    check-cast p1, Lh1/z;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 39
    .line 40
    .line 41
    move-result-wide p1

    .line 42
    invoke-static {p1, p2}, Lh1/i0;->S(J)J

    .line 43
    .line 44
    .line 45
    move-result-wide p1

    .line 46
    iget-wide p5, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->lastReleaseRealtimeUs:J

    .line 47
    .line 48
    sub-long/2addr p1, p5

    .line 49
    iget-boolean p5, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->started:Z

    .line 50
    .line 51
    if-eqz p5, :cond_1

    .line 52
    .line 53
    iget-object p5, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->frameTimingEvaluator:Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameTimingEvaluator;

    .line 54
    .line 55
    invoke-interface {p5, p3, p4, p1, p2}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameTimingEvaluator;->shouldForceReleaseFrame(JJ)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    return v2

    .line 62
    :cond_1
    return v1

    .line 63
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 64
    .line 65
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_3
    cmp-long p1, p1, p5

    .line 70
    .line 71
    if-ltz p1, :cond_4

    .line 72
    .line 73
    return v2

    .line 74
    :cond_4
    return v1

    .line 75
    :cond_5
    return v2

    .line 76
    :cond_6
    iget-boolean p1, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->started:Z

    .line 77
    .line 78
    return p1
.end method


# virtual methods
.method public allowReleaseFirstFrameBeforeStarted()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->firstFrameState:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->firstFrameState:I

    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public getFrameReleaseAction(JJJJZLandroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;)I
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v5, p1

    .line 4
    .line 5
    move-wide/from16 v1, p3

    .line 6
    .line 7
    move-object/from16 v9, p10

    .line 8
    .line 9
    invoke-static {v9}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;->access$000(Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;)V

    .line 10
    .line 11
    .line 12
    iget-wide v3, v0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->initialPositionUs:J

    .line 13
    .line 14
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v3, v3, v7

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    iput-wide v1, v0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->initialPositionUs:J

    .line 24
    .line 25
    :cond_0
    iget-wide v3, v0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->lastPresentationTimeUs:J

    .line 26
    .line 27
    cmp-long v3, v3, v5

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    iget-object v3, v0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->frameReleaseHelper:Landroidx/media3/exoplayer/video/VideoFrameReleaseHelper;

    .line 32
    .line 33
    invoke-virtual {v3, v5, v6}, Landroidx/media3/exoplayer/video/VideoFrameReleaseHelper;->onNextFrame(J)V

    .line 34
    .line 35
    .line 36
    iput-wide v5, v0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->lastPresentationTimeUs:J

    .line 37
    .line 38
    :cond_1
    move-wide/from16 v3, p5

    .line 39
    .line 40
    invoke-direct/range {v0 .. v6}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->calculateEarlyTimeUs(JJJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide v5

    .line 44
    invoke-static {v9, v5, v6}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;->access$102(Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;J)J

    .line 45
    .line 46
    .line 47
    invoke-static {v9}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;->access$100(Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;)J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    move-object/from16 v0, p0

    .line 52
    .line 53
    move-wide/from16 v1, p3

    .line 54
    .line 55
    move-wide/from16 v5, p7

    .line 56
    .line 57
    invoke-direct/range {v0 .. v6}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->shouldForceRelease(JJJ)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    move-object v10, v0

    .line 62
    const/4 v0, 0x0

    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    return v0

    .line 66
    :cond_2
    iget-boolean v1, v10, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->started:Z

    .line 67
    .line 68
    const/16 v16, 0x5

    .line 69
    .line 70
    if-eqz v1, :cond_9

    .line 71
    .line 72
    iget-wide v1, v10, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->initialPositionUs:J

    .line 73
    .line 74
    cmp-long v1, p3, v1

    .line 75
    .line 76
    if-nez v1, :cond_3

    .line 77
    .line 78
    goto/16 :goto_1

    .line 79
    .line 80
    :cond_3
    iget-object v1, v10, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->clock:Lh1/b;

    .line 81
    .line 82
    check-cast v1, Lh1/z;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 88
    .line 89
    .line 90
    move-result-wide v1

    .line 91
    iget-object v3, v10, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->frameReleaseHelper:Landroidx/media3/exoplayer/video/VideoFrameReleaseHelper;

    .line 92
    .line 93
    invoke-static {v9}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;->access$100(Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;)J

    .line 94
    .line 95
    .line 96
    move-result-wide v4

    .line 97
    const-wide/16 v11, 0x3e8

    .line 98
    .line 99
    mul-long/2addr v4, v11

    .line 100
    add-long/2addr v4, v1

    .line 101
    invoke-virtual {v3, v4, v5}, Landroidx/media3/exoplayer/video/VideoFrameReleaseHelper;->adjustReleaseTime(J)J

    .line 102
    .line 103
    .line 104
    move-result-wide v3

    .line 105
    invoke-static {v9, v3, v4}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;->access$202(Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;J)J

    .line 106
    .line 107
    .line 108
    invoke-static {v9}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;->access$200(Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;)J

    .line 109
    .line 110
    .line 111
    move-result-wide v3

    .line 112
    sub-long/2addr v3, v1

    .line 113
    div-long/2addr v3, v11

    .line 114
    invoke-static {v9, v3, v4}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;->access$102(Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;J)J

    .line 115
    .line 116
    .line 117
    iget-wide v1, v10, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->joiningDeadlineMs:J

    .line 118
    .line 119
    cmp-long v1, v1, v7

    .line 120
    .line 121
    const/16 v17, 0x1

    .line 122
    .line 123
    if-eqz v1, :cond_4

    .line 124
    .line 125
    iget-boolean v1, v10, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->joiningRenderNextFrameImmediately:Z

    .line 126
    .line 127
    if-nez v1, :cond_4

    .line 128
    .line 129
    move/from16 v8, v17

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_4
    move v8, v0

    .line 133
    :goto_0
    iget-object v0, v10, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->frameTimingEvaluator:Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameTimingEvaluator;

    .line 134
    .line 135
    invoke-static {v9}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;->access$100(Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;)J

    .line 136
    .line 137
    .line 138
    move-result-wide v1

    .line 139
    move-wide/from16 v3, p3

    .line 140
    .line 141
    move-wide/from16 v5, p5

    .line 142
    .line 143
    move/from16 v7, p9

    .line 144
    .line 145
    invoke-interface/range {v0 .. v8}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameTimingEvaluator;->shouldIgnoreFrame(JJJZZ)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_5

    .line 150
    .line 151
    const/4 v0, 0x4

    .line 152
    return v0

    .line 153
    :cond_5
    move-object v0, v10

    .line 154
    iget-object v10, v0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->frameTimingEvaluator:Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameTimingEvaluator;

    .line 155
    .line 156
    invoke-static {v9}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;->access$100(Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;)J

    .line 157
    .line 158
    .line 159
    move-result-wide v11

    .line 160
    move-wide/from16 v13, p5

    .line 161
    .line 162
    move/from16 v15, p9

    .line 163
    .line 164
    invoke-interface/range {v10 .. v15}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameTimingEvaluator;->shouldDropFrame(JJZ)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_7

    .line 169
    .line 170
    if-eqz v8, :cond_6

    .line 171
    .line 172
    const/4 v0, 0x3

    .line 173
    return v0

    .line 174
    :cond_6
    const/4 v0, 0x2

    .line 175
    return v0

    .line 176
    :cond_7
    invoke-static {v9}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;->access$100(Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;)J

    .line 177
    .line 178
    .line 179
    move-result-wide v0

    .line 180
    const-wide/32 v2, 0xc350

    .line 181
    .line 182
    .line 183
    cmp-long v0, v0, v2

    .line 184
    .line 185
    if-lez v0, :cond_8

    .line 186
    .line 187
    return v16

    .line 188
    :cond_8
    return v17

    .line 189
    :cond_9
    :goto_1
    return v16
.end method

.method public isReady(Z)Z
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget p1, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->firstFrameState:I

    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    if-ne p1, v3, :cond_0

    .line 13
    .line 14
    iput-wide v1, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->joiningDeadlineMs:J

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    iget-wide v3, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->joiningDeadlineMs:J

    .line 18
    .line 19
    cmp-long p1, v3, v1

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    return v3

    .line 25
    :cond_1
    iget-object p1, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->clock:Lh1/b;

    .line 26
    .line 27
    check-cast p1, Lh1/z;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 33
    .line 34
    .line 35
    move-result-wide v4

    .line 36
    iget-wide v6, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->joiningDeadlineMs:J

    .line 37
    .line 38
    cmp-long p1, v4, v6

    .line 39
    .line 40
    if-gez p1, :cond_2

    .line 41
    .line 42
    return v0

    .line 43
    :cond_2
    iput-wide v1, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->joiningDeadlineMs:J

    .line 44
    .line 45
    return v3
.end method

.method public join(Z)V
    .locals 4

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->joiningRenderNextFrameImmediately:Z

    .line 2
    .line 3
    iget-wide v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->allowedJoiningTimeMs:J

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long p1, v0, v2

    .line 8
    .line 9
    if-lez p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->clock:Lh1/b;

    .line 12
    .line 13
    check-cast p1, Lh1/z;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    iget-wide v2, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->allowedJoiningTimeMs:J

    .line 23
    .line 24
    add-long/2addr v0, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    :goto_0
    iput-wide v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->joiningDeadlineMs:J

    .line 32
    .line 33
    return-void
.end method

.method public onDisabled()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->lowerFirstFrameState(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public onEnabled(Z)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->firstFrameState:I

    .line 2
    .line 3
    return-void
.end method

.method public onFrameReleasedIsFirstFrame()Z
    .locals 3

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->firstFrameState:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iput v1, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->firstFrameState:I

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->clock:Lh1/b;

    .line 12
    .line 13
    check-cast v1, Lh1/z;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    invoke-static {v1, v2}, Lh1/i0;->S(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    iput-wide v1, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->lastReleaseRealtimeUs:J

    .line 27
    .line 28
    return v0
.end method

.method public onProcessedStreamChange()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->lowerFirstFrameState(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public onStarted()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->started:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->clock:Lh1/b;

    .line 5
    .line 6
    check-cast v0, Lh1/z;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-static {v0, v1}, Lh1/i0;->S(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iput-wide v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->lastReleaseRealtimeUs:J

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->frameReleaseHelper:Landroidx/media3/exoplayer/video/VideoFrameReleaseHelper;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/media3/exoplayer/video/VideoFrameReleaseHelper;->onStarted()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public onStopped()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->started:Z

    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->joiningDeadlineMs:J

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->frameReleaseHelper:Landroidx/media3/exoplayer/video/VideoFrameReleaseHelper;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/media3/exoplayer/video/VideoFrameReleaseHelper;->onStopped()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public reset()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->frameReleaseHelper:Landroidx/media3/exoplayer/video/VideoFrameReleaseHelper;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/video/VideoFrameReleaseHelper;->onPositionReset()V

    .line 4
    .line 5
    .line 6
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    iput-wide v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->lastPresentationTimeUs:J

    .line 12
    .line 13
    iput-wide v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->initialPositionUs:J

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {p0, v2}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->lowerFirstFrameState(I)V

    .line 17
    .line 18
    .line 19
    iput-wide v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->joiningDeadlineMs:J

    .line 20
    .line 21
    return-void
.end method

.method public setChangeFrameRateStrategy(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->frameReleaseHelper:Landroidx/media3/exoplayer/video/VideoFrameReleaseHelper;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/video/VideoFrameReleaseHelper;->setChangeFrameRateStrategy(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setClock(Lh1/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->clock:Lh1/b;

    .line 2
    .line 3
    return-void
.end method

.method public setFrameRate(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->frameReleaseHelper:Landroidx/media3/exoplayer/video/VideoFrameReleaseHelper;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/video/VideoFrameReleaseHelper;->onFormatChanged(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setOutputSurface(Landroid/view/Surface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->frameReleaseHelper:Landroidx/media3/exoplayer/video/VideoFrameReleaseHelper;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/video/VideoFrameReleaseHelper;->onSurfaceChanged(Landroid/view/Surface;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->lowerFirstFrameState(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setPlaybackSpeed(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-static {v0}, Lh1/a;->d(Z)V

    .line 10
    .line 11
    .line 12
    iget v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->playbackSpeed:F

    .line 13
    .line 14
    cmpl-float v0, p1, v0

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    iput p1, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->playbackSpeed:F

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->frameReleaseHelper:Landroidx/media3/exoplayer/video/VideoFrameReleaseHelper;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/video/VideoFrameReleaseHelper;->onPlaybackSpeed(F)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
