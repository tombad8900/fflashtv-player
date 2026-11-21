.class final Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker$Listener;
    }
.end annotation


# static fields
.field private static final FORCE_RESET_WORKAROUND_TIMEOUT_MS:J = 0xc8L

.field private static final MAX_AUDIO_TIMESTAMP_OFFSET_US:J = 0x4c4b40L

.field private static final MAX_LATENCY_US:J = 0x4c4b40L

.field private static final MAX_PLAYHEAD_OFFSET_COUNT:I = 0xa

.field private static final MIN_LATENCY_SAMPLE_INTERVAL_US:I = 0x7a120

.field private static final MIN_PLAYHEAD_OFFSET_SAMPLE_INTERVAL_US:I = 0x7530

.field private static final MODE_SWITCH_SMOOTHING_DURATION_US:J = 0xf4240L

.field private static final PLAYSTATE_PAUSED:I = 0x2

.field private static final PLAYSTATE_PLAYING:I = 0x3

.field private static final PLAYSTATE_STOPPED:I = 0x1

.field private static final RAW_PLAYBACK_HEAD_POSITION_UPDATE_INTERVAL_MS:J = 0x5L


# instance fields
.field private audioTimestampPoller:Landroidx/media3/exoplayer/audio/AudioTimestampPoller;

.field private audioTrack:Landroid/media/AudioTrack;

.field private audioTrackPlaybackSpeed:F

.field private bufferSize:I

.field private bufferSizeUs:J

.field private clock:Lh1/b;

.field private endPlaybackHeadPosition:J

.field private expectRawPlaybackHeadReset:Z

.field private forceResetWorkaroundTimeMs:J

.field private getLatencyMethod:Ljava/lang/reflect/Method;

.field private hasData:Z

.field private isOutputPcm:Z

.field private lastLatencySampleTimeUs:J

.field private lastPlayheadSampleTimeUs:J

.field private lastPositionUs:J

.field private lastRawPlaybackHeadPositionSampleTimeMs:J

.field private lastSampleUsedGetTimestampMode:Z

.field private lastSystemTimeUs:J

.field private latencyUs:J

.field private final listener:Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker$Listener;

.field private needsPassthroughWorkarounds:Z

.field private nextPlayheadOffsetIndex:I

.field private notifiedPositionIncreasing:Z

.field private outputPcmFrameSize:I

.field private outputSampleRate:I

.field private passthroughWorkaroundPauseOffset:J

.field private playheadOffsetCount:I

.field private final playheadOffsets:[J

.field private previousModePositionUs:J

.field private previousModeSystemTimeUs:J

.field private rawPlaybackHeadPosition:J

.field private rawPlaybackHeadWrapCount:J

.field private smoothedPlayheadOffsetUs:J

.field private stopPlaybackHeadPosition:J

.field private stopTimestampUs:J

.field private sumRawPlaybackHeadPosition:J


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker$Listener;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->listener:Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker$Listener;

    .line 8
    .line 9
    :try_start_0
    const-class p1, Landroid/media/AudioTrack;

    .line 10
    .line 11
    const-string v0, "getLatency"

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->getLatencyMethod:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    :catch_0
    const/16 p1, 0xa

    .line 21
    .line 22
    new-array p1, p1, [J

    .line 23
    .line 24
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->playheadOffsets:[J

    .line 25
    .line 26
    sget-object p1, Lh1/b;->a:Lh1/z;

    .line 27
    .line 28
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->clock:Lh1/b;

    .line 29
    .line 30
    return-void
.end method

.method private forceHasPendingData()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->needsPassthroughWorkarounds:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTrack:Landroid/media/AudioTrack;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x2

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->getPlaybackHeadPosition()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    const-wide/16 v2, 0x0

    .line 22
    .line 23
    cmp-long v0, v0, v2

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    return v0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    return v0
.end method

.method private getPlaybackHeadPosition()J
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->clock:Lh1/b;

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
    iget-wide v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->stopTimestampUs:J

    .line 13
    .line 14
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v2, v2, v4

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTrack:Landroid/media/AudioTrack;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getPlayState()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/4 v3, 0x2

    .line 33
    if-ne v2, v3, :cond_0

    .line 34
    .line 35
    iget-wide v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->stopPlaybackHeadPosition:J

    .line 36
    .line 37
    return-wide v0

    .line 38
    :cond_0
    invoke-static {v0, v1}, Lh1/i0;->S(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    iget-wide v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->stopTimestampUs:J

    .line 43
    .line 44
    sub-long/2addr v0, v2

    .line 45
    iget v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTrackPlaybackSpeed:F

    .line 46
    .line 47
    invoke-static {v0, v1, v2}, Lh1/i0;->B(JF)J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    iget v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->outputSampleRate:I

    .line 52
    .line 53
    int-to-long v5, v0

    .line 54
    const-wide/32 v7, 0xf4240

    .line 55
    .line 56
    .line 57
    sget-object v9, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 58
    .line 59
    invoke-static/range {v3 .. v9}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    iget-wide v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->endPlaybackHeadPosition:J

    .line 64
    .line 65
    iget-wide v4, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->stopPlaybackHeadPosition:J

    .line 66
    .line 67
    add-long/2addr v4, v0

    .line 68
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    return-wide v0

    .line 73
    :cond_1
    iget-wide v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->lastRawPlaybackHeadPositionSampleTimeMs:J

    .line 74
    .line 75
    sub-long v2, v0, v2

    .line 76
    .line 77
    const-wide/16 v4, 0x5

    .line 78
    .line 79
    cmp-long v2, v2, v4

    .line 80
    .line 81
    if-ltz v2, :cond_2

    .line 82
    .line 83
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->updateRawPlaybackHeadPosition(J)V

    .line 84
    .line 85
    .line 86
    iput-wide v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->lastRawPlaybackHeadPositionSampleTimeMs:J

    .line 87
    .line 88
    :cond_2
    iget-wide v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->rawPlaybackHeadPosition:J

    .line 89
    .line 90
    iget-wide v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->sumRawPlaybackHeadPosition:J

    .line 91
    .line 92
    add-long/2addr v0, v2

    .line 93
    iget-wide v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->rawPlaybackHeadWrapCount:J

    .line 94
    .line 95
    const/16 v4, 0x20

    .line 96
    .line 97
    shl-long/2addr v2, v4

    .line 98
    add-long/2addr v0, v2

    .line 99
    return-wide v0
.end method

.method private getPlaybackHeadPositionUs()J
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->getPlaybackHeadPosition()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->outputSampleRate:I

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Lh1/i0;->Y(IJ)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method

.method private maybePollAndCheckTimestamp(J)V
    .locals 13

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTimestampPoller:Landroidx/media3/exoplayer/audio/AudioTimestampPoller;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Landroidx/media3/exoplayer/audio/AudioTimestampPoller;->maybePollTimestamp(J)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {v0}, Landroidx/media3/exoplayer/audio/AudioTimestampPoller;->getTimestampSystemTimeUs()J

    .line 14
    .line 15
    .line 16
    move-result-wide v5

    .line 17
    invoke-virtual {v0}, Landroidx/media3/exoplayer/audio/AudioTimestampPoller;->getTimestampPositionFrames()J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->getPlaybackHeadPositionUs()J

    .line 22
    .line 23
    .line 24
    move-result-wide v9

    .line 25
    sub-long v1, v5, p1

    .line 26
    .line 27
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    const-wide/32 v7, 0x4c4b40

    .line 32
    .line 33
    .line 34
    cmp-long v1, v1, v7

    .line 35
    .line 36
    if-lez v1, :cond_1

    .line 37
    .line 38
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->listener:Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker$Listener;

    .line 39
    .line 40
    move-wide v7, p1

    .line 41
    invoke-interface/range {v2 .. v10}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker$Listener;->onSystemTimeUsMismatch(JJJJ)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Landroidx/media3/exoplayer/audio/AudioTimestampPoller;->rejectTimestamp()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    move-wide v11, v7

    .line 49
    move-wide v7, p1

    .line 50
    move-wide p1, v11

    .line 51
    iget v1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->outputSampleRate:I

    .line 52
    .line 53
    invoke-static {v1, v3, v4}, Lh1/i0;->Y(IJ)J

    .line 54
    .line 55
    .line 56
    move-result-wide v1

    .line 57
    sub-long/2addr v1, v9

    .line 58
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    .line 59
    .line 60
    .line 61
    move-result-wide v1

    .line 62
    cmp-long p1, v1, p1

    .line 63
    .line 64
    if-lez p1, :cond_2

    .line 65
    .line 66
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->listener:Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker$Listener;

    .line 67
    .line 68
    invoke-interface/range {v2 .. v10}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker$Listener;->onPositionFramesMismatch(JJJJ)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Landroidx/media3/exoplayer/audio/AudioTimestampPoller;->rejectTimestamp()V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_2
    invoke-virtual {v0}, Landroidx/media3/exoplayer/audio/AudioTimestampPoller;->acceptTimestamp()V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method private maybeSampleSyncParams()V
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->clock:Lh1/b;

    .line 2
    .line 3
    check-cast v0, Lh1/z;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    const-wide/16 v2, 0x3e8

    .line 13
    .line 14
    div-long/2addr v0, v2

    .line 15
    iget-wide v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->lastPlayheadSampleTimeUs:J

    .line 16
    .line 17
    sub-long v2, v0, v2

    .line 18
    .line 19
    const-wide/16 v4, 0x7530

    .line 20
    .line 21
    cmp-long v2, v2, v4

    .line 22
    .line 23
    if-ltz v2, :cond_2

    .line 24
    .line 25
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->getPlaybackHeadPositionUs()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    const-wide/16 v4, 0x0

    .line 30
    .line 31
    cmp-long v6, v2, v4

    .line 32
    .line 33
    if-nez v6, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    iget-object v6, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->playheadOffsets:[J

    .line 37
    .line 38
    iget v7, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->nextPlayheadOffsetIndex:I

    .line 39
    .line 40
    iget v8, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTrackPlaybackSpeed:F

    .line 41
    .line 42
    invoke-static {v2, v3, v8}, Lh1/i0;->F(JF)J

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    sub-long/2addr v2, v0

    .line 47
    aput-wide v2, v6, v7

    .line 48
    .line 49
    iget v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->nextPlayheadOffsetIndex:I

    .line 50
    .line 51
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    const/16 v3, 0xa

    .line 54
    .line 55
    rem-int/2addr v2, v3

    .line 56
    iput v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->nextPlayheadOffsetIndex:I

    .line 57
    .line 58
    iget v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->playheadOffsetCount:I

    .line 59
    .line 60
    if-ge v2, v3, :cond_1

    .line 61
    .line 62
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    iput v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->playheadOffsetCount:I

    .line 65
    .line 66
    :cond_1
    iput-wide v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->lastPlayheadSampleTimeUs:J

    .line 67
    .line 68
    iput-wide v4, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->smoothedPlayheadOffsetUs:J

    .line 69
    .line 70
    const/4 v2, 0x0

    .line 71
    :goto_0
    iget v3, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->playheadOffsetCount:I

    .line 72
    .line 73
    if-ge v2, v3, :cond_2

    .line 74
    .line 75
    iget-wide v4, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->smoothedPlayheadOffsetUs:J

    .line 76
    .line 77
    iget-object v6, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->playheadOffsets:[J

    .line 78
    .line 79
    aget-wide v7, v6, v2

    .line 80
    .line 81
    int-to-long v9, v3

    .line 82
    div-long/2addr v7, v9

    .line 83
    add-long/2addr v7, v4

    .line 84
    iput-wide v7, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->smoothedPlayheadOffsetUs:J

    .line 85
    .line 86
    add-int/lit8 v2, v2, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    iget-boolean v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->needsPassthroughWorkarounds:Z

    .line 90
    .line 91
    if-eqz v2, :cond_3

    .line 92
    .line 93
    :goto_1
    return-void

    .line 94
    :cond_3
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->maybePollAndCheckTimestamp(J)V

    .line 95
    .line 96
    .line 97
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->maybeUpdateLatency(J)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method private maybeUpdateLatency(J)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->isOutputPcm:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->getLatencyMethod:Ljava/lang/reflect/Method;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-wide v1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->lastLatencySampleTimeUs:J

    .line 10
    .line 11
    sub-long v1, p1, v1

    .line 12
    .line 13
    const-wide/32 v3, 0x7a120

    .line 14
    .line 15
    .line 16
    cmp-long v1, v1, v3

    .line 17
    .line 18
    if-ltz v1, :cond_1

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    :try_start_0
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTrack:Landroid/media/AudioTrack;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/lang/Integer;

    .line 31
    .line 32
    sget v2, Lh1/i0;->a:I

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    int-to-long v2, v0

    .line 39
    const-wide/16 v4, 0x3e8

    .line 40
    .line 41
    mul-long/2addr v2, v4

    .line 42
    iget-wide v4, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->bufferSizeUs:J

    .line 43
    .line 44
    sub-long/2addr v2, v4

    .line 45
    iput-wide v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->latencyUs:J

    .line 46
    .line 47
    const-wide/16 v4, 0x0

    .line 48
    .line 49
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 50
    .line 51
    .line 52
    move-result-wide v2

    .line 53
    iput-wide v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->latencyUs:J

    .line 54
    .line 55
    const-wide/32 v6, 0x4c4b40

    .line 56
    .line 57
    .line 58
    cmp-long v0, v2, v6

    .line 59
    .line 60
    if-lez v0, :cond_0

    .line 61
    .line 62
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->listener:Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker$Listener;

    .line 63
    .line 64
    invoke-interface {v0, v2, v3}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker$Listener;->onInvalidLatency(J)V

    .line 65
    .line 66
    .line 67
    iput-wide v4, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->latencyUs:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catch_0
    iput-object v1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->getLatencyMethod:Ljava/lang/reflect/Method;

    .line 71
    .line 72
    :cond_0
    :goto_0
    iput-wide p1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->lastLatencySampleTimeUs:J

    .line 73
    .line 74
    :cond_1
    return-void
.end method

.method private static needsPassthroughWorkarounds(I)Z
    .locals 2

    .line 1
    sget v0, Lh1/i0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    if-ge v0, v1, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x5

    .line 8
    if-eq p0, v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x6

    .line 11
    if-ne p0, v0, :cond_1

    .line 12
    .line 13
    :cond_0
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_1
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method private resetSyncParams()V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->smoothedPlayheadOffsetUs:J

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iput v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->playheadOffsetCount:I

    .line 7
    .line 8
    iput v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->nextPlayheadOffsetIndex:I

    .line 9
    .line 10
    iput-wide v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->lastPlayheadSampleTimeUs:J

    .line 11
    .line 12
    iput-wide v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->lastSystemTimeUs:J

    .line 13
    .line 14
    iput-wide v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->previousModeSystemTimeUs:J

    .line 15
    .line 16
    iput-boolean v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->notifiedPositionIncreasing:Z

    .line 17
    .line 18
    return-void
.end method

.method private updateRawPlaybackHeadPosition(J)V
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTrack:Landroid/media/AudioTrack;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlaybackHeadPosition()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    int-to-long v2, v0

    .line 19
    const-wide v4, 0xffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    and-long/2addr v2, v4

    .line 25
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->needsPassthroughWorkarounds:Z

    .line 26
    .line 27
    const-wide/16 v4, 0x0

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    if-ne v1, v0, :cond_1

    .line 33
    .line 34
    cmp-long v0, v2, v4

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    iget-wide v6, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->rawPlaybackHeadPosition:J

    .line 39
    .line 40
    iput-wide v6, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->passthroughWorkaroundPauseOffset:J

    .line 41
    .line 42
    :cond_1
    iget-wide v6, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->passthroughWorkaroundPauseOffset:J

    .line 43
    .line 44
    add-long/2addr v2, v6

    .line 45
    :cond_2
    sget v0, Lh1/i0;->a:I

    .line 46
    .line 47
    const/16 v6, 0x1d

    .line 48
    .line 49
    if-gt v0, v6, :cond_5

    .line 50
    .line 51
    cmp-long v0, v2, v4

    .line 52
    .line 53
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    if-nez v0, :cond_4

    .line 59
    .line 60
    iget-wide v8, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->rawPlaybackHeadPosition:J

    .line 61
    .line 62
    cmp-long v0, v8, v4

    .line 63
    .line 64
    if-lez v0, :cond_4

    .line 65
    .line 66
    const/4 v0, 0x3

    .line 67
    if-ne v1, v0, :cond_4

    .line 68
    .line 69
    iget-wide v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->forceResetWorkaroundTimeMs:J

    .line 70
    .line 71
    cmp-long v0, v0, v6

    .line 72
    .line 73
    if-nez v0, :cond_3

    .line 74
    .line 75
    iput-wide p1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->forceResetWorkaroundTimeMs:J

    .line 76
    .line 77
    :cond_3
    :goto_0
    return-void

    .line 78
    :cond_4
    iput-wide v6, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->forceResetWorkaroundTimeMs:J

    .line 79
    .line 80
    :cond_5
    iget-wide p1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->rawPlaybackHeadPosition:J

    .line 81
    .line 82
    cmp-long v0, p1, v2

    .line 83
    .line 84
    if-lez v0, :cond_7

    .line 85
    .line 86
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->expectRawPlaybackHeadReset:Z

    .line 87
    .line 88
    if-eqz v0, :cond_6

    .line 89
    .line 90
    iget-wide v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->sumRawPlaybackHeadPosition:J

    .line 91
    .line 92
    add-long/2addr v0, p1

    .line 93
    iput-wide v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->sumRawPlaybackHeadPosition:J

    .line 94
    .line 95
    const/4 p1, 0x0

    .line 96
    iput-boolean p1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->expectRawPlaybackHeadReset:Z

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_6
    iget-wide p1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->rawPlaybackHeadWrapCount:J

    .line 100
    .line 101
    const-wide/16 v0, 0x1

    .line 102
    .line 103
    add-long/2addr p1, v0

    .line 104
    iput-wide p1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->rawPlaybackHeadWrapCount:J

    .line 105
    .line 106
    :cond_7
    :goto_1
    iput-wide v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->rawPlaybackHeadPosition:J

    .line 107
    .line 108
    return-void
.end method


# virtual methods
.method public expectRawPlaybackHeadReset()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->expectRawPlaybackHeadReset:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTimestampPoller:Landroidx/media3/exoplayer/audio/AudioTimestampPoller;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/media3/exoplayer/audio/AudioTimestampPoller;->expectTimestampFramePositionReset()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public getAvailableBufferSize(J)I
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->getPlaybackHeadPosition()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget v2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->outputPcmFrameSize:I

    .line 6
    .line 7
    int-to-long v2, v2

    .line 8
    mul-long/2addr v0, v2

    .line 9
    sub-long/2addr p1, v0

    .line 10
    long-to-int p1, p1

    .line 11
    iget p2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->bufferSize:I

    .line 12
    .line 13
    sub-int/2addr p2, p1

    .line 14
    return p2
.end method

.method public getCurrentPositionUs(Z)J
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTrack:Landroid/media/AudioTrack;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlayState()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x3

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-direct {v0}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->maybeSampleSyncParams()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v1, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->clock:Lh1/b;

    .line 19
    .line 20
    check-cast v1, Lh1/z;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    const-wide/16 v3, 0x3e8

    .line 30
    .line 31
    div-long/2addr v1, v3

    .line 32
    iget-object v5, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTimestampPoller:Landroidx/media3/exoplayer/audio/AudioTimestampPoller;

    .line 33
    .line 34
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5}, Landroidx/media3/exoplayer/audio/AudioTimestampPoller;->hasAdvancingTimestamp()Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-eqz v6, :cond_1

    .line 42
    .line 43
    invoke-virtual {v5}, Landroidx/media3/exoplayer/audio/AudioTimestampPoller;->getTimestampPositionFrames()J

    .line 44
    .line 45
    .line 46
    move-result-wide v7

    .line 47
    iget v9, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->outputSampleRate:I

    .line 48
    .line 49
    invoke-static {v9, v7, v8}, Lh1/i0;->Y(IJ)J

    .line 50
    .line 51
    .line 52
    move-result-wide v7

    .line 53
    invoke-virtual {v5}, Landroidx/media3/exoplayer/audio/AudioTimestampPoller;->getTimestampSystemTimeUs()J

    .line 54
    .line 55
    .line 56
    move-result-wide v9

    .line 57
    sub-long v9, v1, v9

    .line 58
    .line 59
    iget v5, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTrackPlaybackSpeed:F

    .line 60
    .line 61
    invoke-static {v9, v10, v5}, Lh1/i0;->B(JF)J

    .line 62
    .line 63
    .line 64
    move-result-wide v9

    .line 65
    add-long/2addr v9, v7

    .line 66
    goto :goto_2

    .line 67
    :cond_1
    iget v5, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->playheadOffsetCount:I

    .line 68
    .line 69
    if-nez v5, :cond_2

    .line 70
    .line 71
    invoke-direct {v0}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->getPlaybackHeadPositionUs()J

    .line 72
    .line 73
    .line 74
    move-result-wide v7

    .line 75
    :goto_0
    move-wide v9, v7

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    iget-wide v7, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->smoothedPlayheadOffsetUs:J

    .line 78
    .line 79
    add-long/2addr v7, v1

    .line 80
    iget v5, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTrackPlaybackSpeed:F

    .line 81
    .line 82
    invoke-static {v7, v8, v5}, Lh1/i0;->B(JF)J

    .line 83
    .line 84
    .line 85
    move-result-wide v7

    .line 86
    goto :goto_0

    .line 87
    :goto_1
    if-nez p1, :cond_3

    .line 88
    .line 89
    iget-wide v7, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->latencyUs:J

    .line 90
    .line 91
    sub-long/2addr v9, v7

    .line 92
    const-wide/16 v7, 0x0

    .line 93
    .line 94
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 95
    .line 96
    .line 97
    move-result-wide v9

    .line 98
    :cond_3
    :goto_2
    iget-boolean v5, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->lastSampleUsedGetTimestampMode:Z

    .line 99
    .line 100
    if-eq v5, v6, :cond_4

    .line 101
    .line 102
    iget-wide v7, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->lastSystemTimeUs:J

    .line 103
    .line 104
    iput-wide v7, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->previousModeSystemTimeUs:J

    .line 105
    .line 106
    iget-wide v7, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->lastPositionUs:J

    .line 107
    .line 108
    iput-wide v7, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->previousModePositionUs:J

    .line 109
    .line 110
    :cond_4
    iget-wide v7, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->previousModeSystemTimeUs:J

    .line 111
    .line 112
    sub-long v7, v1, v7

    .line 113
    .line 114
    const-wide/32 v11, 0xf4240

    .line 115
    .line 116
    .line 117
    cmp-long v5, v7, v11

    .line 118
    .line 119
    if-gez v5, :cond_5

    .line 120
    .line 121
    iget-wide v13, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->previousModePositionUs:J

    .line 122
    .line 123
    iget v5, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTrackPlaybackSpeed:F

    .line 124
    .line 125
    invoke-static {v7, v8, v5}, Lh1/i0;->B(JF)J

    .line 126
    .line 127
    .line 128
    move-result-wide v15

    .line 129
    add-long/2addr v15, v13

    .line 130
    mul-long/2addr v7, v3

    .line 131
    div-long/2addr v7, v11

    .line 132
    mul-long/2addr v9, v7

    .line 133
    sub-long v7, v3, v7

    .line 134
    .line 135
    mul-long/2addr v7, v15

    .line 136
    add-long/2addr v7, v9

    .line 137
    div-long v9, v7, v3

    .line 138
    .line 139
    :cond_5
    iget-boolean v3, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->notifiedPositionIncreasing:Z

    .line 140
    .line 141
    if-nez v3, :cond_6

    .line 142
    .line 143
    iget-wide v3, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->lastPositionUs:J

    .line 144
    .line 145
    cmp-long v5, v9, v3

    .line 146
    .line 147
    if-lez v5, :cond_6

    .line 148
    .line 149
    const/4 v5, 0x1

    .line 150
    iput-boolean v5, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->notifiedPositionIncreasing:Z

    .line 151
    .line 152
    sub-long v3, v9, v3

    .line 153
    .line 154
    invoke-static {v3, v4}, Lh1/i0;->f0(J)J

    .line 155
    .line 156
    .line 157
    move-result-wide v3

    .line 158
    iget v5, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTrackPlaybackSpeed:F

    .line 159
    .line 160
    invoke-static {v3, v4, v5}, Lh1/i0;->F(JF)J

    .line 161
    .line 162
    .line 163
    move-result-wide v3

    .line 164
    iget-object v5, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->clock:Lh1/b;

    .line 165
    .line 166
    check-cast v5, Lh1/z;

    .line 167
    .line 168
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 172
    .line 173
    .line 174
    move-result-wide v7

    .line 175
    invoke-static {v3, v4}, Lh1/i0;->f0(J)J

    .line 176
    .line 177
    .line 178
    move-result-wide v3

    .line 179
    sub-long/2addr v7, v3

    .line 180
    iget-object v3, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->listener:Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker$Listener;

    .line 181
    .line 182
    invoke-interface {v3, v7, v8}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker$Listener;->onPositionAdvancing(J)V

    .line 183
    .line 184
    .line 185
    :cond_6
    iput-wide v1, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->lastSystemTimeUs:J

    .line 186
    .line 187
    iput-wide v9, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->lastPositionUs:J

    .line 188
    .line 189
    iput-boolean v6, v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->lastSampleUsedGetTimestampMode:Z

    .line 190
    .line 191
    return-wide v9
.end method

.method public handleEndOfStream(J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->getPlaybackHeadPosition()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->stopPlaybackHeadPosition:J

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->clock:Lh1/b;

    .line 8
    .line 9
    check-cast v0, Lh1/z;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    invoke-static {v0, v1}, Lh1/i0;->S(J)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    iput-wide v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->stopTimestampUs:J

    .line 23
    .line 24
    iput-wide p1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->endPlaybackHeadPosition:J

    .line 25
    .line 26
    return-void
.end method

.method public hasPendingData(J)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->getCurrentPositionUs(Z)J

    .line 3
    .line 4
    .line 5
    move-result-wide v1

    .line 6
    iget v3, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->outputSampleRate:I

    .line 7
    .line 8
    sget v4, Lh1/i0;->a:I

    .line 9
    .line 10
    int-to-long v3, v3

    .line 11
    const-wide/32 v5, 0xf4240

    .line 12
    .line 13
    .line 14
    sget-object v7, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 15
    .line 16
    invoke-static/range {v1 .. v7}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    cmp-long p1, p1, v1

    .line 21
    .line 22
    if-gtz p1, :cond_1

    .line 23
    .line 24
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->forceHasPendingData()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return v0

    .line 32
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 33
    return p1
.end method

.method public isPlaying()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTrack:Landroid/media/AudioTrack;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x3

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public isStalled(J)Z
    .locals 4

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->forceResetWorkaroundTimeMs:J

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
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    cmp-long p1, p1, v0

    .line 15
    .line 16
    if-lez p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->clock:Lh1/b;

    .line 19
    .line 20
    check-cast p1, Lh1/z;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    iget-wide v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->forceResetWorkaroundTimeMs:J

    .line 30
    .line 31
    sub-long/2addr p1, v0

    .line 32
    const-wide/16 v0, 0xc8

    .line 33
    .line 34
    cmp-long p1, p1, v0

    .line 35
    .line 36
    if-ltz p1, :cond_0

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    return p1

    .line 40
    :cond_0
    const/4 p1, 0x0

    .line 41
    return p1
.end method

.method public mayHandleBuffer(J)Z
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTrack:Landroid/media/AudioTrack;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-boolean v1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->needsPassthroughWorkarounds:Z

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    const/4 v3, 0x0

    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    iput-boolean v3, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->hasData:Z

    .line 20
    .line 21
    return v3

    .line 22
    :cond_0
    if-ne v0, v2, :cond_1

    .line 23
    .line 24
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->getPlaybackHeadPosition()J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    const-wide/16 v6, 0x0

    .line 29
    .line 30
    cmp-long v1, v4, v6

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    return v3

    .line 35
    :cond_1
    iget-boolean v1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->hasData:Z

    .line 36
    .line 37
    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->hasPendingData(J)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iput-boolean p1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->hasData:Z

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    if-nez p1, :cond_2

    .line 46
    .line 47
    if-eq v0, v2, :cond_2

    .line 48
    .line 49
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->listener:Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker$Listener;

    .line 50
    .line 51
    iget p2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->bufferSize:I

    .line 52
    .line 53
    iget-wide v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->bufferSizeUs:J

    .line 54
    .line 55
    invoke-static {v0, v1}, Lh1/i0;->f0(J)J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    invoke-interface {p1, p2, v0, v1}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker$Listener;->onUnderrun(IJ)V

    .line 60
    .line 61
    .line 62
    :cond_2
    return v2
.end method

.method public pause()Z
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->resetSyncParams()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->stopTimestampUs:J

    .line 5
    .line 6
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    cmp-long v0, v0, v2

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTimestampPoller:Landroidx/media3/exoplayer/audio/AudioTimestampPoller;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/media3/exoplayer/audio/AudioTimestampPoller;->reset()V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->getPlaybackHeadPosition()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    iput-wide v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->stopPlaybackHeadPosition:J

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    return v0
.end method

.method public reset()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->resetSyncParams()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTrack:Landroid/media/AudioTrack;

    .line 6
    .line 7
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTimestampPoller:Landroidx/media3/exoplayer/audio/AudioTimestampPoller;

    .line 8
    .line 9
    return-void
.end method

.method public setAudioTrack(Landroid/media/AudioTrack;ZIII)V
    .locals 2

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTrack:Landroid/media/AudioTrack;

    .line 2
    .line 3
    iput p4, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->outputPcmFrameSize:I

    .line 4
    .line 5
    iput p5, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->bufferSize:I

    .line 6
    .line 7
    new-instance v0, Landroidx/media3/exoplayer/audio/AudioTimestampPoller;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Landroidx/media3/exoplayer/audio/AudioTimestampPoller;-><init>(Landroid/media/AudioTrack;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTimestampPoller:Landroidx/media3/exoplayer/audio/AudioTimestampPoller;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getSampleRate()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iput p1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->outputSampleRate:I

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    invoke-static {p3}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->needsPassthroughWorkarounds(I)Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    const/4 p2, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move p2, p1

    .line 32
    :goto_0
    iput-boolean p2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->needsPassthroughWorkarounds:Z

    .line 33
    .line 34
    invoke-static {p3}, Lh1/i0;->N(I)Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    iput-boolean p2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->isOutputPcm:Z

    .line 39
    .line 40
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    div-int/2addr p5, p4

    .line 48
    int-to-long p2, p5

    .line 49
    iget p4, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->outputSampleRate:I

    .line 50
    .line 51
    invoke-static {p4, p2, p3}, Lh1/i0;->Y(IJ)J

    .line 52
    .line 53
    .line 54
    move-result-wide p2

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move-wide p2, v0

    .line 57
    :goto_1
    iput-wide p2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->bufferSizeUs:J

    .line 58
    .line 59
    const-wide/16 p2, 0x0

    .line 60
    .line 61
    iput-wide p2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->rawPlaybackHeadPosition:J

    .line 62
    .line 63
    iput-wide p2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->rawPlaybackHeadWrapCount:J

    .line 64
    .line 65
    iput-boolean p1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->expectRawPlaybackHeadReset:Z

    .line 66
    .line 67
    iput-wide p2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->sumRawPlaybackHeadPosition:J

    .line 68
    .line 69
    iput-wide p2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->passthroughWorkaroundPauseOffset:J

    .line 70
    .line 71
    iput-boolean p1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->hasData:Z

    .line 72
    .line 73
    iput-wide v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->stopTimestampUs:J

    .line 74
    .line 75
    iput-wide v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->forceResetWorkaroundTimeMs:J

    .line 76
    .line 77
    iput-wide p2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->lastLatencySampleTimeUs:J

    .line 78
    .line 79
    iput-wide p2, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->latencyUs:J

    .line 80
    .line 81
    const/high16 p1, 0x3f800000    # 1.0f

    .line 82
    .line 83
    iput p1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTrackPlaybackSpeed:F

    .line 84
    .line 85
    return-void
.end method

.method public setAudioTrackPlaybackSpeed(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTrackPlaybackSpeed:F

    .line 2
    .line 3
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTimestampPoller:Landroidx/media3/exoplayer/audio/AudioTimestampPoller;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/media3/exoplayer/audio/AudioTimestampPoller;->reset()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->resetSyncParams()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setClock(Lh1/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->clock:Lh1/b;

    .line 2
    .line 3
    return-void
.end method

.method public start()V
    .locals 4

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->stopTimestampUs:J

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
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->clock:Lh1/b;

    .line 13
    .line 14
    check-cast v0, Lh1/z;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-static {v0, v1}, Lh1/i0;->S(J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    iput-wide v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->stopTimestampUs:J

    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->audioTimestampPoller:Landroidx/media3/exoplayer/audio/AudioTimestampPoller;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Landroidx/media3/exoplayer/audio/AudioTimestampPoller;->reset()V

    .line 35
    .line 36
    .line 37
    return-void
.end method
