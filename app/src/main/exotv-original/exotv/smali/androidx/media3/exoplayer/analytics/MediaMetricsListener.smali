.class public final Landroidx/media3/exoplayer/analytics/MediaMetricsListener;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/analytics/AnalyticsListener;
.implements Landroidx/media3/exoplayer/analytics/PlaybackSessionManager$Listener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;,
        Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;
    }
.end annotation


# instance fields
.field private activeSessionId:Ljava/lang/String;

.field private audioUnderruns:I

.field private final bandwidthBytes:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final bandwidthTimeMs:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private currentAudioFormat:Landroidx/media3/common/w;

.field private currentNetworkType:I

.field private currentPlaybackState:I

.field private currentTextFormat:Landroidx/media3/common/w;

.field private currentVideoFormat:Landroidx/media3/common/w;

.field private discontinuityReason:I

.field private droppedFrames:I

.field private hasFatalError:Z

.field private ioErrorType:I

.field private isSeeking:Z

.field private metricsBuilder:Landroid/media/metrics/PlaybackMetrics$Builder;

.field private pendingAudioFormat:Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;

.field private pendingPlayerError:Landroidx/media3/common/x0;

.field private pendingTextFormat:Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;

.field private pendingVideoFormat:Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;

.field private final period:Landroidx/media3/common/m1;

.field private final playbackSession:Landroid/media/metrics/PlaybackSession;

.field private playedFrames:I

.field private reportedEventsForCurrentSession:Z

.field private final sessionManager:Landroidx/media3/exoplayer/analytics/PlaybackSessionManager;

.field private final startTimeMs:J

.field private final window:Landroidx/media3/common/o1;


# direct methods
.method private constructor <init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->context:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->playbackSession:Landroid/media/metrics/PlaybackSession;

    .line 11
    .line 12
    new-instance p1, Landroidx/media3/common/o1;

    .line 13
    .line 14
    invoke-direct {p1}, Landroidx/media3/common/o1;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->window:Landroidx/media3/common/o1;

    .line 18
    .line 19
    new-instance p1, Landroidx/media3/common/m1;

    .line 20
    .line 21
    invoke-direct {p1}, Landroidx/media3/common/m1;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->period:Landroidx/media3/common/m1;

    .line 25
    .line 26
    new-instance p1, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->bandwidthBytes:Ljava/util/HashMap;

    .line 32
    .line 33
    new-instance p1, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->bandwidthTimeMs:Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    iput-wide p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->startTimeMs:J

    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    iput p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->currentPlaybackState:I

    .line 48
    .line 49
    iput p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->currentNetworkType:I

    .line 50
    .line 51
    new-instance p1, Landroidx/media3/exoplayer/analytics/DefaultPlaybackSessionManager;

    .line 52
    .line 53
    invoke-direct {p1}, Landroidx/media3/exoplayer/analytics/DefaultPlaybackSessionManager;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->sessionManager:Landroidx/media3/exoplayer/analytics/PlaybackSessionManager;

    .line 57
    .line 58
    invoke-interface {p1, p0}, Landroidx/media3/exoplayer/analytics/PlaybackSessionManager;->setListener(Landroidx/media3/exoplayer/analytics/PlaybackSessionManager$Listener;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method private canReportPendingFormatUpdate(Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;)Z
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "#1"
        }
        result = true
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p1, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;->sessionId:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->sessionManager:Landroidx/media3/exoplayer/analytics/PlaybackSessionManager;

    .line 6
    .line 7
    invoke-interface {v0}, Landroidx/media3/exoplayer/analytics/PlaybackSessionManager;->getActiveSessionId()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public static create(Landroid/content/Context;)Landroidx/media3/exoplayer/analytics/MediaMetricsListener;
    .locals 2

    .line 1
    const-string v0, "media_metrics"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/media/metrics/MediaMetricsManager;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance v1, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/media/metrics/MediaMetricsManager;->createPlaybackSession()Landroid/media/metrics/PlaybackSession;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-direct {v1, p0, v0}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;-><init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V

    .line 20
    .line 21
    .line 22
    return-object v1
.end method

.method private finishCurrentSession()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->metricsBuilder:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    iget-boolean v2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->reportedEventsForCurrentSession:Z

    .line 7
    .line 8
    if-eqz v2, :cond_3

    .line 9
    .line 10
    iget v2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->audioUnderruns:I

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Landroid/media/metrics/PlaybackMetrics$Builder;->setAudioUnderrunCount(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->metricsBuilder:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 16
    .line 17
    iget v2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->droppedFrames:I

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Landroid/media/metrics/PlaybackMetrics$Builder;->setVideoFramesDropped(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->metricsBuilder:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 23
    .line 24
    iget v2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->playedFrames:I

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Landroid/media/metrics/PlaybackMetrics$Builder;->setVideoFramesPlayed(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->bandwidthTimeMs:Ljava/util/HashMap;

    .line 30
    .line 31
    iget-object v2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->activeSessionId:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/lang/Long;

    .line 38
    .line 39
    iget-object v2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->metricsBuilder:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 40
    .line 41
    const-wide/16 v3, 0x0

    .line 42
    .line 43
    if-nez v0, :cond_0

    .line 44
    .line 45
    move-wide v5, v3

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v5

    .line 51
    :goto_0
    invoke-virtual {v2, v5, v6}, Landroid/media/metrics/PlaybackMetrics$Builder;->setNetworkTransferDurationMillis(J)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->bandwidthBytes:Ljava/util/HashMap;

    .line 55
    .line 56
    iget-object v2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->activeSessionId:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ljava/lang/Long;

    .line 63
    .line 64
    iget-object v2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->metricsBuilder:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 65
    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    move-wide v5, v3

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 71
    .line 72
    .line 73
    move-result-wide v5

    .line 74
    :goto_1
    invoke-virtual {v2, v5, v6}, Landroid/media/metrics/PlaybackMetrics$Builder;->setNetworkBytesRead(J)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 75
    .line 76
    .line 77
    iget-object v2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->metricsBuilder:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 78
    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide v5

    .line 85
    cmp-long v0, v5, v3

    .line 86
    .line 87
    if-lez v0, :cond_2

    .line 88
    .line 89
    const/4 v0, 0x1

    .line 90
    goto :goto_2

    .line 91
    :cond_2
    move v0, v1

    .line 92
    :goto_2
    invoke-virtual {v2, v0}, Landroid/media/metrics/PlaybackMetrics$Builder;->setStreamSource(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->playbackSession:Landroid/media/metrics/PlaybackSession;

    .line 96
    .line 97
    iget-object v2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->metricsBuilder:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 98
    .line 99
    invoke-virtual {v2}, Landroid/media/metrics/PlaybackMetrics$Builder;->build()Landroid/media/metrics/PlaybackMetrics;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v0, v2}, Landroid/media/metrics/PlaybackSession;->reportPlaybackMetrics(Landroid/media/metrics/PlaybackMetrics;)V

    .line 104
    .line 105
    .line 106
    :cond_3
    const/4 v0, 0x0

    .line 107
    iput-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->metricsBuilder:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 108
    .line 109
    iput-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->activeSessionId:Ljava/lang/String;

    .line 110
    .line 111
    iput v1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->audioUnderruns:I

    .line 112
    .line 113
    iput v1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->droppedFrames:I

    .line 114
    .line 115
    iput v1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->playedFrames:I

    .line 116
    .line 117
    iput-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->currentVideoFormat:Landroidx/media3/common/w;

    .line 118
    .line 119
    iput-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->currentAudioFormat:Landroidx/media3/common/w;

    .line 120
    .line 121
    iput-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->currentTextFormat:Landroidx/media3/common/w;

    .line 122
    .line 123
    iput-boolean v1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->reportedEventsForCurrentSession:Z

    .line 124
    .line 125
    return-void
.end method

.method private static getDrmErrorCode(I)I
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SwitchIntDef"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lh1/i0;->y(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const/16 p0, 0x1b

    .line 9
    .line 10
    return p0

    .line 11
    :pswitch_0
    const/16 p0, 0x1a

    .line 12
    .line 13
    return p0

    .line 14
    :pswitch_1
    const/16 p0, 0x19

    .line 15
    .line 16
    return p0

    .line 17
    :pswitch_2
    const/16 p0, 0x1c

    .line 18
    .line 19
    return p0

    .line 20
    :pswitch_3
    const/16 p0, 0x18

    .line 21
    .line 22
    return p0

    .line 23
    :pswitch_data_0
    .packed-switch 0x1772
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static getDrmInitData(Lf6/m0;)Landroidx/media3/common/s;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/m0;",
            ")",
            "Landroidx/media3/common/s;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lf6/m0;->l(I)Lf6/k0;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lf6/a;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0}, Lf6/a;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Landroidx/media3/common/w1;

    .line 17
    .line 18
    move v2, v0

    .line 19
    :goto_0
    iget v3, v1, Landroidx/media3/common/w1;->a:I

    .line 20
    .line 21
    if-ge v2, v3, :cond_0

    .line 22
    .line 23
    iget-object v3, v1, Landroidx/media3/common/w1;->e:[Z

    .line 24
    .line 25
    aget-boolean v3, v3, v2

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Landroidx/media3/common/w1;->a(I)Landroidx/media3/common/w;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-object v3, v3, Landroidx/media3/common/w;->r:Landroidx/media3/common/s;

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    return-object v3

    .line 38
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const/4 p0, 0x0

    .line 42
    return-object p0
.end method

.method private static getDrmType(Landroidx/media3/common/s;)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, Landroidx/media3/common/s;->m:I

    .line 3
    .line 4
    if-ge v0, v1, :cond_3

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/common/s;->j:[Landroidx/media3/common/r;

    .line 7
    .line 8
    aget-object v1, v1, v0

    .line 9
    .line 10
    iget-object v1, v1, Landroidx/media3/common/r;->k:Ljava/util/UUID;

    .line 11
    .line 12
    sget-object v2, Landroidx/media3/common/k;->d:Ljava/util/UUID;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x3

    .line 21
    return p0

    .line 22
    :cond_0
    sget-object v2, Landroidx/media3/common/k;->e:Ljava/util/UUID;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    const/4 p0, 0x2

    .line 31
    return p0

    .line 32
    :cond_1
    sget-object v2, Landroidx/media3/common/k;->c:Ljava/util/UUID;

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    const/4 p0, 0x6

    .line 41
    return p0

    .line 42
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    const/4 p0, 0x1

    .line 46
    return p0
.end method

.method private static getErrorInfo(Landroidx/media3/common/x0;Landroid/content/Context;Z)Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;
    .locals 8

    .line 1
    iget v0, p0, Landroidx/media3/common/x0;->errorCode:I

    .line 2
    .line 3
    const/16 v1, 0x3e9

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    new-instance p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 9
    .line 10
    const/16 p1, 0x14

    .line 11
    .line 12
    invoke-direct {p0, p1, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p0, Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    move-object v0, p0

    .line 22
    check-cast v0, Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 23
    .line 24
    iget v3, v0, Landroidx/media3/exoplayer/ExoPlaybackException;->type:I

    .line 25
    .line 26
    if-ne v3, v1, :cond_1

    .line 27
    .line 28
    move v3, v1

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v3, v2

    .line 31
    :goto_0
    iget v0, v0, Landroidx/media3/exoplayer/ExoPlaybackException;->rendererFormatSupport:I

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move v0, v2

    .line 35
    move v3, v0

    .line 36
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    instance-of v5, v4, Ljava/io/IOException;

    .line 44
    .line 45
    const/4 v6, 0x3

    .line 46
    const/16 v7, 0x17

    .line 47
    .line 48
    if-eqz v5, :cond_17

    .line 49
    .line 50
    instance-of v0, v4, Lk1/w;

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    check-cast v4, Lk1/w;

    .line 55
    .line 56
    iget p0, v4, Lk1/w;->m:I

    .line 57
    .line 58
    new-instance p1, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 59
    .line 60
    const/4 p2, 0x5

    .line 61
    invoke-direct {p1, p2, p0}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 62
    .line 63
    .line 64
    return-object p1

    .line 65
    :cond_3
    instance-of v0, v4, Lk1/v;

    .line 66
    .line 67
    if-nez v0, :cond_15

    .line 68
    .line 69
    instance-of v0, v4, Landroidx/media3/common/v0;

    .line 70
    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :cond_4
    instance-of p2, v4, Lk1/u;

    .line 76
    .line 77
    if-nez p2, :cond_10

    .line 78
    .line 79
    instance-of v0, v4, Lk1/d0;

    .line 80
    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    goto/16 :goto_2

    .line 84
    .line 85
    :cond_5
    iget p0, p0, Landroidx/media3/common/x0;->errorCode:I

    .line 86
    .line 87
    const/16 p1, 0x3ea

    .line 88
    .line 89
    if-ne p0, p1, :cond_6

    .line 90
    .line 91
    new-instance p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 92
    .line 93
    const/16 p1, 0x15

    .line 94
    .line 95
    invoke-direct {p0, p1, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 96
    .line 97
    .line 98
    return-object p0

    .line 99
    :cond_6
    instance-of p0, v4, Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;

    .line 100
    .line 101
    if-eqz p0, :cond_d

    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    instance-of p1, p0, Landroid/media/MediaDrm$MediaDrmStateException;

    .line 111
    .line 112
    if-eqz p1, :cond_7

    .line 113
    .line 114
    check-cast p0, Landroid/media/MediaDrm$MediaDrmStateException;

    .line 115
    .line 116
    invoke-virtual {p0}, Landroid/media/MediaDrm$MediaDrmStateException;->getDiagnosticInfo()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0}, Lh1/i0;->z(Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    invoke-static {p0}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->getDrmErrorCode(I)I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    new-instance p2, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 129
    .line 130
    invoke-direct {p2, p1, p0}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 131
    .line 132
    .line 133
    return-object p2

    .line 134
    :cond_7
    sget p1, Lh1/i0;->a:I

    .line 135
    .line 136
    if-lt p1, v7, :cond_8

    .line 137
    .line 138
    instance-of p1, p0, Landroid/media/MediaDrmResetException;

    .line 139
    .line 140
    if-eqz p1, :cond_8

    .line 141
    .line 142
    new-instance p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 143
    .line 144
    const/16 p1, 0x1b

    .line 145
    .line 146
    invoke-direct {p0, p1, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 147
    .line 148
    .line 149
    return-object p0

    .line 150
    :cond_8
    instance-of p1, p0, Landroid/media/NotProvisionedException;

    .line 151
    .line 152
    if-eqz p1, :cond_9

    .line 153
    .line 154
    new-instance p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 155
    .line 156
    const/16 p1, 0x18

    .line 157
    .line 158
    invoke-direct {p0, p1, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 159
    .line 160
    .line 161
    return-object p0

    .line 162
    :cond_9
    instance-of p1, p0, Landroid/media/DeniedByServerException;

    .line 163
    .line 164
    if-eqz p1, :cond_a

    .line 165
    .line 166
    new-instance p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 167
    .line 168
    const/16 p1, 0x1d

    .line 169
    .line 170
    invoke-direct {p0, p1, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 171
    .line 172
    .line 173
    return-object p0

    .line 174
    :cond_a
    instance-of p1, p0, Landroidx/media3/exoplayer/drm/UnsupportedDrmException;

    .line 175
    .line 176
    if-eqz p1, :cond_b

    .line 177
    .line 178
    new-instance p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 179
    .line 180
    invoke-direct {p0, v7, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 181
    .line 182
    .line 183
    return-object p0

    .line 184
    :cond_b
    instance-of p0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManager$MissingSchemeDataException;

    .line 185
    .line 186
    if-eqz p0, :cond_c

    .line 187
    .line 188
    new-instance p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 189
    .line 190
    const/16 p1, 0x1c

    .line 191
    .line 192
    invoke-direct {p0, p1, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 193
    .line 194
    .line 195
    return-object p0

    .line 196
    :cond_c
    new-instance p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 197
    .line 198
    const/16 p1, 0x1e

    .line 199
    .line 200
    invoke-direct {p0, p1, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 201
    .line 202
    .line 203
    return-object p0

    .line 204
    :cond_d
    instance-of p0, v4, Lk1/q;

    .line 205
    .line 206
    if-eqz p0, :cond_f

    .line 207
    .line 208
    invoke-virtual {v4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    instance-of p0, p0, Ljava/io/FileNotFoundException;

    .line 213
    .line 214
    if-eqz p0, :cond_f

    .line 215
    .line 216
    invoke-virtual {v4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    instance-of p1, p0, Landroid/system/ErrnoException;

    .line 228
    .line 229
    if-eqz p1, :cond_e

    .line 230
    .line 231
    check-cast p0, Landroid/system/ErrnoException;

    .line 232
    .line 233
    iget p0, p0, Landroid/system/ErrnoException;->errno:I

    .line 234
    .line 235
    sget p1, Landroid/system/OsConstants;->EACCES:I

    .line 236
    .line 237
    if-ne p0, p1, :cond_e

    .line 238
    .line 239
    new-instance p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 240
    .line 241
    const/16 p1, 0x20

    .line 242
    .line 243
    invoke-direct {p0, p1, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 244
    .line 245
    .line 246
    return-object p0

    .line 247
    :cond_e
    new-instance p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 248
    .line 249
    const/16 p1, 0x1f

    .line 250
    .line 251
    invoke-direct {p0, p1, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 252
    .line 253
    .line 254
    return-object p0

    .line 255
    :cond_f
    new-instance p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 256
    .line 257
    const/16 p1, 0x9

    .line 258
    .line 259
    invoke-direct {p0, p1, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 260
    .line 261
    .line 262
    return-object p0

    .line 263
    :cond_10
    :goto_2
    invoke-static {p1}, Lh1/t;->b(Landroid/content/Context;)Lh1/t;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    invoke-virtual {p0}, Lh1/t;->c()I

    .line 268
    .line 269
    .line 270
    move-result p0

    .line 271
    if-ne p0, v1, :cond_11

    .line 272
    .line 273
    new-instance p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 274
    .line 275
    invoke-direct {p0, v6, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 276
    .line 277
    .line 278
    return-object p0

    .line 279
    :cond_11
    invoke-virtual {v4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    instance-of p1, p0, Ljava/net/UnknownHostException;

    .line 284
    .line 285
    if-eqz p1, :cond_12

    .line 286
    .line 287
    new-instance p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 288
    .line 289
    const/4 p1, 0x6

    .line 290
    invoke-direct {p0, p1, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 291
    .line 292
    .line 293
    return-object p0

    .line 294
    :cond_12
    instance-of p0, p0, Ljava/net/SocketTimeoutException;

    .line 295
    .line 296
    if-eqz p0, :cond_13

    .line 297
    .line 298
    new-instance p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 299
    .line 300
    const/4 p1, 0x7

    .line 301
    invoke-direct {p0, p1, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 302
    .line 303
    .line 304
    return-object p0

    .line 305
    :cond_13
    if-eqz p2, :cond_14

    .line 306
    .line 307
    check-cast v4, Lk1/u;

    .line 308
    .line 309
    iget p0, v4, Lk1/u;->l:I

    .line 310
    .line 311
    if-ne p0, v1, :cond_14

    .line 312
    .line 313
    new-instance p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 314
    .line 315
    const/4 p1, 0x4

    .line 316
    invoke-direct {p0, p1, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 317
    .line 318
    .line 319
    return-object p0

    .line 320
    :cond_14
    new-instance p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 321
    .line 322
    const/16 p1, 0x8

    .line 323
    .line 324
    invoke-direct {p0, p1, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 325
    .line 326
    .line 327
    return-object p0

    .line 328
    :cond_15
    :goto_3
    new-instance p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 329
    .line 330
    if-eqz p2, :cond_16

    .line 331
    .line 332
    const/16 p1, 0xa

    .line 333
    .line 334
    goto :goto_4

    .line 335
    :cond_16
    const/16 p1, 0xb

    .line 336
    .line 337
    :goto_4
    invoke-direct {p0, p1, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 338
    .line 339
    .line 340
    return-object p0

    .line 341
    :cond_17
    if-eqz v3, :cond_19

    .line 342
    .line 343
    if-eqz v0, :cond_18

    .line 344
    .line 345
    if-ne v0, v1, :cond_19

    .line 346
    .line 347
    :cond_18
    new-instance p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 348
    .line 349
    const/16 p1, 0x23

    .line 350
    .line 351
    invoke-direct {p0, p1, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 352
    .line 353
    .line 354
    return-object p0

    .line 355
    :cond_19
    if-eqz v3, :cond_1a

    .line 356
    .line 357
    if-ne v0, v6, :cond_1a

    .line 358
    .line 359
    new-instance p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 360
    .line 361
    const/16 p1, 0xf

    .line 362
    .line 363
    invoke-direct {p0, p1, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 364
    .line 365
    .line 366
    return-object p0

    .line 367
    :cond_1a
    if-eqz v3, :cond_1b

    .line 368
    .line 369
    const/4 p0, 0x2

    .line 370
    if-ne v0, p0, :cond_1b

    .line 371
    .line 372
    new-instance p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 373
    .line 374
    invoke-direct {p0, v7, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 375
    .line 376
    .line 377
    return-object p0

    .line 378
    :cond_1b
    instance-of p0, v4, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

    .line 379
    .line 380
    if-eqz p0, :cond_1c

    .line 381
    .line 382
    check-cast v4, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

    .line 383
    .line 384
    iget-object p0, v4, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;->diagnosticInfo:Ljava/lang/String;

    .line 385
    .line 386
    invoke-static {p0}, Lh1/i0;->z(Ljava/lang/String;)I

    .line 387
    .line 388
    .line 389
    move-result p0

    .line 390
    new-instance p1, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 391
    .line 392
    const/16 p2, 0xd

    .line 393
    .line 394
    invoke-direct {p1, p2, p0}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 395
    .line 396
    .line 397
    return-object p1

    .line 398
    :cond_1c
    instance-of p0, v4, Landroidx/media3/exoplayer/mediacodec/MediaCodecDecoderException;

    .line 399
    .line 400
    const/16 p1, 0xe

    .line 401
    .line 402
    if-eqz p0, :cond_1d

    .line 403
    .line 404
    check-cast v4, Landroidx/media3/exoplayer/mediacodec/MediaCodecDecoderException;

    .line 405
    .line 406
    iget p0, v4, Landroidx/media3/exoplayer/mediacodec/MediaCodecDecoderException;->errorCode:I

    .line 407
    .line 408
    new-instance p2, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 409
    .line 410
    invoke-direct {p2, p1, p0}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 411
    .line 412
    .line 413
    return-object p2

    .line 414
    :cond_1d
    instance-of p0, v4, Ljava/lang/OutOfMemoryError;

    .line 415
    .line 416
    if-eqz p0, :cond_1e

    .line 417
    .line 418
    new-instance p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 419
    .line 420
    invoke-direct {p0, p1, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 421
    .line 422
    .line 423
    return-object p0

    .line 424
    :cond_1e
    instance-of p0, v4, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;

    .line 425
    .line 426
    if-eqz p0, :cond_1f

    .line 427
    .line 428
    check-cast v4, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;

    .line 429
    .line 430
    iget p0, v4, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;->audioTrackState:I

    .line 431
    .line 432
    new-instance p1, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 433
    .line 434
    const/16 p2, 0x11

    .line 435
    .line 436
    invoke-direct {p1, p2, p0}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 437
    .line 438
    .line 439
    return-object p1

    .line 440
    :cond_1f
    instance-of p0, v4, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;

    .line 441
    .line 442
    if-eqz p0, :cond_20

    .line 443
    .line 444
    check-cast v4, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;

    .line 445
    .line 446
    iget p0, v4, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->errorCode:I

    .line 447
    .line 448
    new-instance p1, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 449
    .line 450
    const/16 p2, 0x12

    .line 451
    .line 452
    invoke-direct {p1, p2, p0}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 453
    .line 454
    .line 455
    return-object p1

    .line 456
    :cond_20
    instance-of p0, v4, Landroid/media/MediaCodec$CryptoException;

    .line 457
    .line 458
    if-eqz p0, :cond_21

    .line 459
    .line 460
    check-cast v4, Landroid/media/MediaCodec$CryptoException;

    .line 461
    .line 462
    invoke-virtual {v4}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    .line 463
    .line 464
    .line 465
    move-result p0

    .line 466
    invoke-static {p0}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->getDrmErrorCode(I)I

    .line 467
    .line 468
    .line 469
    move-result p1

    .line 470
    new-instance p2, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 471
    .line 472
    invoke-direct {p2, p1, p0}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 473
    .line 474
    .line 475
    return-object p2

    .line 476
    :cond_21
    new-instance p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 477
    .line 478
    const/16 p1, 0x16

    .line 479
    .line 480
    invoke-direct {p0, p1, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;-><init>(II)V

    .line 481
    .line 482
    .line 483
    return-object p0
.end method

.method private static getLanguageAndRegion(Ljava/lang/String;)Landroid/util/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    sget v0, Lh1/i0;->a:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    const-string v1, "-"

    .line 5
    .line 6
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x0

    .line 11
    aget-object v0, p0, v0

    .line 12
    .line 13
    array-length v1, p0

    .line 14
    const/4 v2, 0x2

    .line 15
    if-lt v1, v2, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    aget-object p0, p0, v1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    :goto_0
    invoke-static {v0, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method private static getNetworkType(Landroid/content/Context;)I
    .locals 0

    .line 1
    invoke-static {p0}, Lh1/t;->b(Landroid/content/Context;)Lh1/t;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lh1/t;->c()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    :pswitch_0
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :pswitch_1
    const/4 p0, 0x7

    .line 15
    return p0

    .line 16
    :pswitch_2
    const/16 p0, 0x8

    .line 17
    .line 18
    return p0

    .line 19
    :pswitch_3
    const/4 p0, 0x3

    .line 20
    return p0

    .line 21
    :pswitch_4
    const/4 p0, 0x6

    .line 22
    return p0

    .line 23
    :pswitch_5
    const/4 p0, 0x5

    .line 24
    return p0

    .line 25
    :pswitch_6
    const/4 p0, 0x4

    .line 26
    return p0

    .line 27
    :pswitch_7
    const/4 p0, 0x2

    .line 28
    return p0

    .line 29
    :pswitch_8
    const/16 p0, 0x9

    .line 30
    .line 31
    return p0

    .line 32
    :pswitch_9
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private static getStreamType(Landroidx/media3/common/o0;)I
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    iget-object v0, p0, Landroidx/media3/common/j0;->a:Landroid/net/Uri;

    .line 8
    .line 9
    iget-object p0, p0, Landroidx/media3/common/j0;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0, p0}, Lh1/i0;->K(Landroid/net/Uri;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_3

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    if-eq p0, v0, :cond_2

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    if-eq p0, v1, :cond_1

    .line 22
    .line 23
    return v0

    .line 24
    :cond_1
    const/4 p0, 0x4

    .line 25
    return p0

    .line 26
    :cond_2
    const/4 p0, 0x5

    .line 27
    return p0

    .line 28
    :cond_3
    const/4 p0, 0x3

    .line 29
    return p0
.end method

.method private static getTrackChangeReason(I)I
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eq p0, v1, :cond_2

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    if-eq p0, v0, :cond_1

    .line 7
    .line 8
    if-eq p0, v2, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/4 p0, 0x4

    .line 12
    return p0

    .line 13
    :cond_1
    return v2

    .line 14
    :cond_2
    return v0
.end method

.method private maybeAddSessions(Landroidx/media3/exoplayer/analytics/AnalyticsListener$Events;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p1}, Landroidx/media3/exoplayer/analytics/AnalyticsListener$Events;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/analytics/AnalyticsListener$Events;->get(I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p1, v1}, Landroidx/media3/exoplayer/analytics/AnalyticsListener$Events;->getEventTime(I)Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->sessionManager:Landroidx/media3/exoplayer/analytics/PlaybackSessionManager;

    .line 19
    .line 20
    invoke-interface {v1, v2}, Landroidx/media3/exoplayer/analytics/PlaybackSessionManager;->updateSessionsWithTimelineChange(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;)V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const/16 v3, 0xb

    .line 25
    .line 26
    if-ne v1, v3, :cond_1

    .line 27
    .line 28
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->sessionManager:Landroidx/media3/exoplayer/analytics/PlaybackSessionManager;

    .line 29
    .line 30
    iget v3, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->discontinuityReason:I

    .line 31
    .line 32
    invoke-interface {v1, v2, v3}, Landroidx/media3/exoplayer/analytics/PlaybackSessionManager;->updateSessionsWithDiscontinuity(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;I)V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->sessionManager:Landroidx/media3/exoplayer/analytics/PlaybackSessionManager;

    .line 37
    .line 38
    invoke-interface {v1, v2}, Landroidx/media3/exoplayer/analytics/PlaybackSessionManager;->updateSessions(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;)V

    .line 39
    .line 40
    .line 41
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-void
.end method

.method private maybeReportNetworkChange(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->context:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->getNetworkType(Landroid/content/Context;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->currentNetworkType:I

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    iput v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->currentNetworkType:I

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->playbackSession:Landroid/media/metrics/PlaybackSession;

    .line 14
    .line 15
    new-instance v2, Landroid/media/metrics/NetworkEvent$Builder;

    .line 16
    .line 17
    invoke-direct {v2}, Landroid/media/metrics/NetworkEvent$Builder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v0}, Landroid/media/metrics/NetworkEvent$Builder;->setNetworkType(I)Landroid/media/metrics/NetworkEvent$Builder;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-wide v2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->startTimeMs:J

    .line 25
    .line 26
    sub-long/2addr p1, v2

    .line 27
    invoke-virtual {v0, p1, p2}, Landroid/media/metrics/NetworkEvent$Builder;->setTimeSinceCreatedMillis(J)Landroid/media/metrics/NetworkEvent$Builder;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Landroid/media/metrics/NetworkEvent$Builder;->build()Landroid/media/metrics/NetworkEvent;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v1, p1}, Landroid/media/metrics/PlaybackSession;->reportNetworkEvent(Landroid/media/metrics/NetworkEvent;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
.end method

.method private maybeReportPlaybackError(J)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->pendingPlayerError:Landroidx/media3/common/x0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->context:Landroid/content/Context;

    .line 7
    .line 8
    iget v2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->ioErrorType:I

    .line 9
    .line 10
    const/4 v3, 0x4

    .line 11
    const/4 v4, 0x1

    .line 12
    if-ne v2, v3, :cond_1

    .line 13
    .line 14
    move v2, v4

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 v2, 0x0

    .line 17
    :goto_0
    invoke-static {v0, v1, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->getErrorInfo(Landroidx/media3/common/x0;Landroid/content/Context;Z)Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->playbackSession:Landroid/media/metrics/PlaybackSession;

    .line 22
    .line 23
    new-instance v3, Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 24
    .line 25
    invoke-direct {v3}, Landroid/media/metrics/PlaybackErrorEvent$Builder;-><init>()V

    .line 26
    .line 27
    .line 28
    iget-wide v5, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->startTimeMs:J

    .line 29
    .line 30
    sub-long/2addr p1, v5

    .line 31
    invoke-virtual {v3, p1, p2}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->setTimeSinceCreatedMillis(J)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget p2, v1, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;->errorCode:I

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->setErrorCode(I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget p2, v1, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$ErrorInfo;->subErrorCode:I

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->setSubErrorCode(I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1, v0}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->setException(Ljava/lang/Exception;)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->build()Landroid/media/metrics/PlaybackErrorEvent;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {v2, p1}, Landroid/media/metrics/PlaybackSession;->reportPlaybackErrorEvent(Landroid/media/metrics/PlaybackErrorEvent;)V

    .line 56
    .line 57
    .line 58
    iput-boolean v4, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->reportedEventsForCurrentSession:Z

    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    iput-object p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->pendingPlayerError:Landroidx/media3/common/x0;

    .line 62
    .line 63
    return-void
.end method

.method private maybeReportPlaybackStateChange(Landroidx/media3/common/d1;Landroidx/media3/exoplayer/analytics/AnalyticsListener$Events;J)V
    .locals 3

    .line 1
    invoke-interface {p1}, Landroidx/media3/common/d1;->getPlaybackState()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    iput-boolean v2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->isSeeking:Z

    .line 10
    .line 11
    :cond_0
    invoke-interface {p1}, Landroidx/media3/common/d1;->getPlayerError()Landroidx/media3/common/x0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iput-boolean v2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->hasFatalError:Z

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/16 v0, 0xa

    .line 22
    .line 23
    invoke-virtual {p2, v0}, Landroidx/media3/exoplayer/analytics/AnalyticsListener$Events;->contains(I)Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_2

    .line 28
    .line 29
    iput-boolean v1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->hasFatalError:Z

    .line 30
    .line 31
    :cond_2
    :goto_0
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->resolveNewPlaybackState(Landroidx/media3/common/d1;)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    iget p2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->currentPlaybackState:I

    .line 36
    .line 37
    if-eq p2, p1, :cond_3

    .line 38
    .line 39
    iput p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->currentPlaybackState:I

    .line 40
    .line 41
    iput-boolean v1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->reportedEventsForCurrentSession:Z

    .line 42
    .line 43
    iget-object p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->playbackSession:Landroid/media/metrics/PlaybackSession;

    .line 44
    .line 45
    new-instance p2, Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 46
    .line 47
    invoke-direct {p2}, Landroid/media/metrics/PlaybackStateEvent$Builder;-><init>()V

    .line 48
    .line 49
    .line 50
    iget v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->currentPlaybackState:I

    .line 51
    .line 52
    invoke-virtual {p2, v0}, Landroid/media/metrics/PlaybackStateEvent$Builder;->setState(I)Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    iget-wide v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->startTimeMs:J

    .line 57
    .line 58
    sub-long/2addr p3, v0

    .line 59
    invoke-virtual {p2, p3, p4}, Landroid/media/metrics/PlaybackStateEvent$Builder;->setTimeSinceCreatedMillis(J)Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-virtual {p2}, Landroid/media/metrics/PlaybackStateEvent$Builder;->build()Landroid/media/metrics/PlaybackStateEvent;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p1, p2}, Landroid/media/metrics/PlaybackSession;->reportPlaybackStateEvent(Landroid/media/metrics/PlaybackStateEvent;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    return-void
.end method

.method private maybeReportTrackChanges(Landroidx/media3/common/d1;Landroidx/media3/exoplayer/analytics/AnalyticsListener$Events;J)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p2, v0}, Landroidx/media3/exoplayer/analytics/AnalyticsListener$Events;->contains(I)Z

    .line 3
    .line 4
    .line 5
    move-result p2

    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz p2, :cond_3

    .line 8
    .line 9
    invoke-interface {p1}, Landroidx/media3/common/d1;->getCurrentTracks()Landroidx/media3/common/x1;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1, v0}, Landroidx/media3/common/x1;->a(I)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-virtual {p1, v0}, Landroidx/media3/common/x1;->a(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v2, 0x3

    .line 23
    invoke-virtual {p1, v2}, Landroidx/media3/common/x1;->a(I)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p2, :cond_0

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    if-eqz p1, :cond_3

    .line 32
    .line 33
    :cond_0
    const/4 v2, 0x0

    .line 34
    if-nez p2, :cond_1

    .line 35
    .line 36
    invoke-direct {p0, p3, p4, v1, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->maybeUpdateVideoFormat(JLandroidx/media3/common/w;I)V

    .line 37
    .line 38
    .line 39
    :cond_1
    if-nez v0, :cond_2

    .line 40
    .line 41
    invoke-direct {p0, p3, p4, v1, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->maybeUpdateAudioFormat(JLandroidx/media3/common/w;I)V

    .line 42
    .line 43
    .line 44
    :cond_2
    if-nez p1, :cond_3

    .line 45
    .line 46
    invoke-direct {p0, p3, p4, v1, v2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->maybeUpdateTextFormat(JLandroidx/media3/common/w;I)V

    .line 47
    .line 48
    .line 49
    :cond_3
    iget-object p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->pendingVideoFormat:Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;

    .line 50
    .line 51
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->canReportPendingFormatUpdate(Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_4

    .line 56
    .line 57
    iget-object p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->pendingVideoFormat:Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;

    .line 58
    .line 59
    iget-object p2, p1, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;->format:Landroidx/media3/common/w;

    .line 60
    .line 61
    iget v0, p2, Landroidx/media3/common/w;->v:I

    .line 62
    .line 63
    const/4 v2, -0x1

    .line 64
    if-eq v0, v2, :cond_4

    .line 65
    .line 66
    iget p1, p1, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;->selectionReason:I

    .line 67
    .line 68
    invoke-direct {p0, p3, p4, p2, p1}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->maybeUpdateVideoFormat(JLandroidx/media3/common/w;I)V

    .line 69
    .line 70
    .line 71
    iput-object v1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->pendingVideoFormat:Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;

    .line 72
    .line 73
    :cond_4
    iget-object p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->pendingAudioFormat:Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;

    .line 74
    .line 75
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->canReportPendingFormatUpdate(Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_5

    .line 80
    .line 81
    iget-object p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->pendingAudioFormat:Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;

    .line 82
    .line 83
    iget-object p2, p1, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;->format:Landroidx/media3/common/w;

    .line 84
    .line 85
    iget p1, p1, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;->selectionReason:I

    .line 86
    .line 87
    invoke-direct {p0, p3, p4, p2, p1}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->maybeUpdateAudioFormat(JLandroidx/media3/common/w;I)V

    .line 88
    .line 89
    .line 90
    iput-object v1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->pendingAudioFormat:Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;

    .line 91
    .line 92
    :cond_5
    iget-object p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->pendingTextFormat:Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;

    .line 93
    .line 94
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->canReportPendingFormatUpdate(Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_6

    .line 99
    .line 100
    iget-object p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->pendingTextFormat:Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;

    .line 101
    .line 102
    iget-object p2, p1, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;->format:Landroidx/media3/common/w;

    .line 103
    .line 104
    iget p1, p1, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;->selectionReason:I

    .line 105
    .line 106
    invoke-direct {p0, p3, p4, p2, p1}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->maybeUpdateTextFormat(JLandroidx/media3/common/w;I)V

    .line 107
    .line 108
    .line 109
    iput-object v1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->pendingTextFormat:Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;

    .line 110
    .line 111
    :cond_6
    return-void
.end method

.method private maybeUpdateAudioFormat(JLandroidx/media3/common/w;I)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->currentAudioFormat:Landroidx/media3/common/w;

    .line 2
    .line 3
    sget v1, Lh1/i0;->a:I

    .line 4
    .line 5
    invoke-static {v0, p3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->currentAudioFormat:Landroidx/media3/common/w;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    if-nez p4, :cond_1

    .line 17
    .line 18
    const/4 p4, 0x1

    .line 19
    :cond_1
    move v5, p4

    .line 20
    iput-object p3, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->currentAudioFormat:Landroidx/media3/common/w;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    move-object v0, p0

    .line 24
    move-wide v2, p1

    .line 25
    move-object v4, p3

    .line 26
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->reportTrackChangeEvent(IJLandroidx/media3/common/w;I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private maybeUpdateMetricsBuilderValues(Landroidx/media3/common/d1;Landroidx/media3/exoplayer/analytics/AnalyticsListener$Events;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p2, v0}, Landroidx/media3/exoplayer/analytics/AnalyticsListener$Events;->contains(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p2, v0}, Landroidx/media3/exoplayer/analytics/AnalyticsListener$Events;->getEventTime(I)Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->metricsBuilder:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v1, v0, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;->timeline:Landroidx/media3/common/p1;

    .line 17
    .line 18
    iget-object v0, v0, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;->mediaPeriodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 19
    .line 20
    invoke-direct {p0, v1, v0}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->maybeUpdateTimelineMetadata(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    const/4 v0, 0x2

    .line 24
    invoke-virtual {p2, v0}, Landroidx/media3/exoplayer/analytics/AnalyticsListener$Events;->contains(I)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->metricsBuilder:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-interface {p1}, Landroidx/media3/common/d1;->getCurrentTracks()Landroidx/media3/common/x1;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object p1, p1, Landroidx/media3/common/x1;->a:Lf6/m0;

    .line 39
    .line 40
    invoke-static {p1}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->getDrmInitData(Lf6/m0;)Landroidx/media3/common/s;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->metricsBuilder:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 47
    .line 48
    invoke-static {p1}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->getDrmType(Landroidx/media3/common/s;)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-virtual {v0, p1}, Landroid/media/metrics/PlaybackMetrics$Builder;->setDrmType(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 53
    .line 54
    .line 55
    :cond_1
    const/16 p1, 0x3f3

    .line 56
    .line 57
    invoke-virtual {p2, p1}, Landroidx/media3/exoplayer/analytics/AnalyticsListener$Events;->contains(I)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    iget p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->audioUnderruns:I

    .line 64
    .line 65
    add-int/lit8 p1, p1, 0x1

    .line 66
    .line 67
    iput p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->audioUnderruns:I

    .line 68
    .line 69
    :cond_2
    return-void
.end method

.method private maybeUpdateTextFormat(JLandroidx/media3/common/w;I)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->currentTextFormat:Landroidx/media3/common/w;

    .line 2
    .line 3
    sget v1, Lh1/i0;->a:I

    .line 4
    .line 5
    invoke-static {v0, p3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->currentTextFormat:Landroidx/media3/common/w;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    if-nez p4, :cond_1

    .line 17
    .line 18
    const/4 p4, 0x1

    .line 19
    :cond_1
    move v5, p4

    .line 20
    iput-object p3, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->currentTextFormat:Landroidx/media3/common/w;

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    move-object v0, p0

    .line 24
    move-wide v2, p1

    .line 25
    move-object v4, p3

    .line 26
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->reportTrackChangeEvent(IJLandroidx/media3/common/w;I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private maybeUpdateTimelineMetadata(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)V
    .locals 5
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "metricsBuilder"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->metricsBuilder:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object p2, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    const/4 v1, -0x1

    .line 13
    if-ne p2, v1, :cond_1

    .line 14
    .line 15
    :goto_0
    return-void

    .line 16
    :cond_1
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->period:Landroidx/media3/common/m1;

    .line 17
    .line 18
    invoke-virtual {p1, p2, v1}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 19
    .line 20
    .line 21
    iget-object p2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->period:Landroidx/media3/common/m1;

    .line 22
    .line 23
    iget p2, p2, Landroidx/media3/common/m1;->c:I

    .line 24
    .line 25
    iget-object v1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->window:Landroidx/media3/common/o1;

    .line 26
    .line 27
    invoke-virtual {p1, p2, v1}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->window:Landroidx/media3/common/o1;

    .line 31
    .line 32
    iget-object p1, p1, Landroidx/media3/common/o1;->c:Landroidx/media3/common/o0;

    .line 33
    .line 34
    invoke-static {p1}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->getStreamType(Landroidx/media3/common/o0;)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {v0, p1}, Landroid/media/metrics/PlaybackMetrics$Builder;->setStreamType(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->window:Landroidx/media3/common/o1;

    .line 42
    .line 43
    iget-wide v1, p1, Landroidx/media3/common/o1;->m:J

    .line 44
    .line 45
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    cmp-long p2, v1, v3

    .line 51
    .line 52
    if-eqz p2, :cond_2

    .line 53
    .line 54
    iget-boolean p2, p1, Landroidx/media3/common/o1;->k:Z

    .line 55
    .line 56
    if-nez p2, :cond_2

    .line 57
    .line 58
    iget-boolean p2, p1, Landroidx/media3/common/o1;->i:Z

    .line 59
    .line 60
    if-nez p2, :cond_2

    .line 61
    .line 62
    invoke-virtual {p1}, Landroidx/media3/common/o1;->a()Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_2

    .line 67
    .line 68
    iget-object p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->window:Landroidx/media3/common/o1;

    .line 69
    .line 70
    iget-wide p1, p1, Landroidx/media3/common/o1;->m:J

    .line 71
    .line 72
    invoke-static {p1, p2}, Lh1/i0;->f0(J)J

    .line 73
    .line 74
    .line 75
    move-result-wide p1

    .line 76
    invoke-virtual {v0, p1, p2}, Landroid/media/metrics/PlaybackMetrics$Builder;->setMediaDurationMillis(J)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 77
    .line 78
    .line 79
    :cond_2
    iget-object p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->window:Landroidx/media3/common/o1;

    .line 80
    .line 81
    invoke-virtual {p1}, Landroidx/media3/common/o1;->a()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    const/4 p2, 0x1

    .line 86
    if-eqz p1, :cond_3

    .line 87
    .line 88
    const/4 p1, 0x2

    .line 89
    goto :goto_1

    .line 90
    :cond_3
    move p1, p2

    .line 91
    :goto_1
    invoke-virtual {v0, p1}, Landroid/media/metrics/PlaybackMetrics$Builder;->setPlaybackType(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 92
    .line 93
    .line 94
    iput-boolean p2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->reportedEventsForCurrentSession:Z

    .line 95
    .line 96
    return-void
.end method

.method private maybeUpdateVideoFormat(JLandroidx/media3/common/w;I)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->currentVideoFormat:Landroidx/media3/common/w;

    .line 2
    .line 3
    sget v1, Lh1/i0;->a:I

    .line 4
    .line 5
    invoke-static {v0, p3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->currentVideoFormat:Landroidx/media3/common/w;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    if-nez p4, :cond_1

    .line 17
    .line 18
    const/4 p4, 0x1

    .line 19
    :cond_1
    move v5, p4

    .line 20
    iput-object p3, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->currentVideoFormat:Landroidx/media3/common/w;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    move-object v0, p0

    .line 24
    move-wide v2, p1

    .line 25
    move-object v4, p3

    .line 26
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->reportTrackChangeEvent(IJLandroidx/media3/common/w;I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private reportTrackChangeEvent(IJLandroidx/media3/common/w;I)V
    .locals 3

    .line 1
    new-instance v0, Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/media/metrics/TrackChangeEvent$Builder;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->startTimeMs:J

    .line 7
    .line 8
    sub-long/2addr p2, v1

    .line 9
    invoke-virtual {v0, p2, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setTimeSinceCreatedMillis(J)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 p2, 0x1

    .line 14
    if-eqz p4, :cond_9

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Landroid/media/metrics/TrackChangeEvent$Builder;->setTrackState(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 17
    .line 18
    .line 19
    invoke-static {p5}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->getTrackChangeReason(I)I

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setTrackChangeReason(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 24
    .line 25
    .line 26
    iget-object p3, p4, Landroidx/media3/common/w;->m:Ljava/lang/String;

    .line 27
    .line 28
    if-eqz p3, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setContainerMimeType(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object p3, p4, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 34
    .line 35
    if-eqz p3, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setSampleMimeType(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object p3, p4, Landroidx/media3/common/w;->k:Ljava/lang/String;

    .line 41
    .line 42
    if-eqz p3, :cond_2

    .line 43
    .line 44
    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setCodecName(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 45
    .line 46
    .line 47
    :cond_2
    iget p3, p4, Landroidx/media3/common/w;->j:I

    .line 48
    .line 49
    const/4 p5, -0x1

    .line 50
    if-eq p3, p5, :cond_3

    .line 51
    .line 52
    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setBitrate(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 53
    .line 54
    .line 55
    :cond_3
    iget p3, p4, Landroidx/media3/common/w;->u:I

    .line 56
    .line 57
    if-eq p3, p5, :cond_4

    .line 58
    .line 59
    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setWidth(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 60
    .line 61
    .line 62
    :cond_4
    iget p3, p4, Landroidx/media3/common/w;->v:I

    .line 63
    .line 64
    if-eq p3, p5, :cond_5

    .line 65
    .line 66
    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setHeight(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 67
    .line 68
    .line 69
    :cond_5
    iget p3, p4, Landroidx/media3/common/w;->C:I

    .line 70
    .line 71
    if-eq p3, p5, :cond_6

    .line 72
    .line 73
    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setChannelCount(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 74
    .line 75
    .line 76
    :cond_6
    iget p3, p4, Landroidx/media3/common/w;->D:I

    .line 77
    .line 78
    if-eq p3, p5, :cond_7

    .line 79
    .line 80
    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setAudioSampleRate(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 81
    .line 82
    .line 83
    :cond_7
    iget-object p3, p4, Landroidx/media3/common/w;->d:Ljava/lang/String;

    .line 84
    .line 85
    if-eqz p3, :cond_8

    .line 86
    .line 87
    invoke-static {p3}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->getLanguageAndRegion(Ljava/lang/String;)Landroid/util/Pair;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    iget-object p5, p3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p5, Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setLanguage(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 96
    .line 97
    .line 98
    iget-object p3, p3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 99
    .line 100
    if-eqz p3, :cond_8

    .line 101
    .line 102
    check-cast p3, Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setLanguageRegion(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 105
    .line 106
    .line 107
    :cond_8
    iget p3, p4, Landroidx/media3/common/w;->w:F

    .line 108
    .line 109
    const/high16 p4, -0x40800000    # -1.0f

    .line 110
    .line 111
    cmpl-float p4, p3, p4

    .line 112
    .line 113
    if-eqz p4, :cond_a

    .line 114
    .line 115
    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setVideoFrameRate(F)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_9
    const/4 p3, 0x0

    .line 120
    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setTrackState(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 121
    .line 122
    .line 123
    :cond_a
    :goto_0
    iput-boolean p2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->reportedEventsForCurrentSession:Z

    .line 124
    .line 125
    iget-object p2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->playbackSession:Landroid/media/metrics/PlaybackSession;

    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/media/metrics/TrackChangeEvent$Builder;->build()Landroid/media/metrics/TrackChangeEvent;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p2, p1}, Landroid/media/metrics/PlaybackSession;->reportTrackChangeEvent(Landroid/media/metrics/TrackChangeEvent;)V

    .line 132
    .line 133
    .line 134
    return-void
.end method

.method private resolveNewPlaybackState(Landroidx/media3/common/d1;)I
    .locals 4

    .line 1
    invoke-interface {p1}, Landroidx/media3/common/d1;->getPlaybackState()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-boolean v1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->isSeeking:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x5

    .line 10
    return p1

    .line 11
    :cond_0
    iget-boolean v1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->hasFatalError:Z

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    const/16 p1, 0xd

    .line 16
    .line 17
    return p1

    .line 18
    :cond_1
    const/4 v1, 0x4

    .line 19
    if-ne v0, v1, :cond_2

    .line 20
    .line 21
    const/16 p1, 0xb

    .line 22
    .line 23
    return p1

    .line 24
    :cond_2
    const/16 v2, 0xc

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    if-ne v0, v3, :cond_7

    .line 28
    .line 29
    iget v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->currentPlaybackState:I

    .line 30
    .line 31
    if-eqz v0, :cond_6

    .line 32
    .line 33
    if-eq v0, v3, :cond_6

    .line 34
    .line 35
    if-ne v0, v2, :cond_3

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    invoke-interface {p1}, Landroidx/media3/common/d1;->getPlayWhenReady()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_4

    .line 43
    .line 44
    const/4 p1, 0x7

    .line 45
    return p1

    .line 46
    :cond_4
    invoke-interface {p1}, Landroidx/media3/common/d1;->getPlaybackSuppressionReason()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_5

    .line 51
    .line 52
    const/16 p1, 0xa

    .line 53
    .line 54
    return p1

    .line 55
    :cond_5
    const/4 p1, 0x6

    .line 56
    return p1

    .line 57
    :cond_6
    :goto_0
    return v3

    .line 58
    :cond_7
    const/4 v3, 0x3

    .line 59
    if-ne v0, v3, :cond_a

    .line 60
    .line 61
    invoke-interface {p1}, Landroidx/media3/common/d1;->getPlayWhenReady()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_8

    .line 66
    .line 67
    return v1

    .line 68
    :cond_8
    invoke-interface {p1}, Landroidx/media3/common/d1;->getPlaybackSuppressionReason()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_9

    .line 73
    .line 74
    const/16 p1, 0x9

    .line 75
    .line 76
    return p1

    .line 77
    :cond_9
    return v3

    .line 78
    :cond_a
    const/4 p1, 0x1

    .line 79
    if-ne v0, p1, :cond_b

    .line 80
    .line 81
    iget p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->currentPlaybackState:I

    .line 82
    .line 83
    if-eqz p1, :cond_b

    .line 84
    .line 85
    return v2

    .line 86
    :cond_b
    iget p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->currentPlaybackState:I

    .line 87
    .line 88
    return p1
.end method


# virtual methods
.method public getLogSessionId()Landroid/media/metrics/LogSessionId;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->playbackSession:Landroid/media/metrics/PlaybackSession;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/metrics/PlaybackSession;->getSessionId()Landroid/media/metrics/LogSessionId;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public onAdPlaybackStarted(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onBandwidthEstimate(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;IJJ)V
    .locals 5

    .line 1
    iget-object p5, p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;->mediaPeriodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 2
    .line 3
    if-eqz p5, :cond_2

    .line 4
    .line 5
    iget-object p6, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->sessionManager:Landroidx/media3/exoplayer/analytics/PlaybackSessionManager;

    .line 6
    .line 7
    iget-object p1, p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;->timeline:Landroidx/media3/common/p1;

    .line 8
    .line 9
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-interface {p6, p1, p5}, Landroidx/media3/exoplayer/analytics/PlaybackSessionManager;->getSessionForMediaPeriodId(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object p5, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->bandwidthBytes:Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-virtual {p5, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p5

    .line 22
    check-cast p5, Ljava/lang/Long;

    .line 23
    .line 24
    iget-object p6, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->bandwidthTimeMs:Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {p6, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p6

    .line 30
    check-cast p6, Ljava/lang/Long;

    .line 31
    .line 32
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->bandwidthBytes:Ljava/util/HashMap;

    .line 33
    .line 34
    const-wide/16 v1, 0x0

    .line 35
    .line 36
    if-nez p5, :cond_0

    .line 37
    .line 38
    move-wide v3, v1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p5}, Ljava/lang/Long;->longValue()J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    :goto_0
    add-long/2addr v3, p3

    .line 45
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    invoke-virtual {v0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    iget-object p3, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->bandwidthTimeMs:Ljava/util/HashMap;

    .line 53
    .line 54
    if-nez p6, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {p6}, Ljava/lang/Long;->longValue()J

    .line 58
    .line 59
    .line 60
    move-result-wide v1

    .line 61
    :goto_1
    int-to-long p4, p2

    .line 62
    add-long/2addr v1, p4

    .line 63
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p3, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    :cond_2
    return-void
.end method

.method public onDownstreamFormatChanged(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/exoplayer/source/MediaLoadData;)V
    .locals 5

    .line 1
    iget-object v0, p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;->mediaPeriodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;

    .line 7
    .line 8
    iget-object v1, p2, Landroidx/media3/exoplayer/source/MediaLoadData;->trackFormat:Landroidx/media3/common/w;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget v2, p2, Landroidx/media3/exoplayer/source/MediaLoadData;->trackSelectionReason:I

    .line 14
    .line 15
    iget-object v3, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->sessionManager:Landroidx/media3/exoplayer/analytics/PlaybackSessionManager;

    .line 16
    .line 17
    iget-object v4, p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;->timeline:Landroidx/media3/common/p1;

    .line 18
    .line 19
    iget-object p1, p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;->mediaPeriodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-interface {v3, v4, p1}, Landroidx/media3/exoplayer/analytics/PlaybackSessionManager;->getSessionForMediaPeriodId(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {v0, v1, v2, p1}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;-><init>(Landroidx/media3/common/w;ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget p1, p2, Landroidx/media3/exoplayer/source/MediaLoadData;->trackType:I

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    const/4 p2, 0x1

    .line 36
    if-eq p1, p2, :cond_2

    .line 37
    .line 38
    const/4 p2, 0x2

    .line 39
    if-eq p1, p2, :cond_3

    .line 40
    .line 41
    const/4 p2, 0x3

    .line 42
    if-eq p1, p2, :cond_1

    .line 43
    .line 44
    :goto_0
    return-void

    .line 45
    :cond_1
    iput-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->pendingTextFormat:Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;

    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    iput-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->pendingAudioFormat:Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;

    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    iput-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->pendingVideoFormat:Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;

    .line 52
    .line 53
    return-void
.end method

.method public onEvents(Landroidx/media3/common/d1;Landroidx/media3/exoplayer/analytics/AnalyticsListener$Events;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroidx/media3/exoplayer/analytics/AnalyticsListener$Events;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-direct {p0, p2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->maybeAddSessions(Landroidx/media3/exoplayer/analytics/AnalyticsListener$Events;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->maybeUpdateMetricsBuilderValues(Landroidx/media3/common/d1;Landroidx/media3/exoplayer/analytics/AnalyticsListener$Events;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->maybeReportPlaybackError(J)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p1, p2, v0, v1}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->maybeReportTrackChanges(Landroidx/media3/common/d1;Landroidx/media3/exoplayer/analytics/AnalyticsListener$Events;J)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->maybeReportNetworkChange(J)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, p1, p2, v0, v1}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->maybeReportPlaybackStateChange(Landroidx/media3/common/d1;Landroidx/media3/exoplayer/analytics/AnalyticsListener$Events;J)V

    .line 28
    .line 29
    .line 30
    const/16 p1, 0x404

    .line 31
    .line 32
    invoke-virtual {p2, p1}, Landroidx/media3/exoplayer/analytics/AnalyticsListener$Events;->contains(I)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->sessionManager:Landroidx/media3/exoplayer/analytics/PlaybackSessionManager;

    .line 39
    .line 40
    invoke-virtual {p2, p1}, Landroidx/media3/exoplayer/analytics/AnalyticsListener$Events;->getEventTime(I)Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/analytics/PlaybackSessionManager;->finishAllSessions(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_0
    return-void
.end method

.method public onLoadError(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/exoplayer/source/LoadEventInfo;Landroidx/media3/exoplayer/source/MediaLoadData;Ljava/io/IOException;Z)V
    .locals 0

    .line 1
    iget p1, p3, Landroidx/media3/exoplayer/source/MediaLoadData;->dataType:I

    .line 2
    .line 3
    iput p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->ioErrorType:I

    .line 4
    .line 5
    return-void
.end method

.method public onPlayerError(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/common/x0;)V
    .locals 0

    .line 1
    iput-object p2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->pendingPlayerError:Landroidx/media3/common/x0;

    .line 2
    .line 3
    return-void
.end method

.method public onPositionDiscontinuity(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/common/c1;Landroidx/media3/common/c1;I)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    if-ne p4, p1, :cond_0

    .line 3
    .line 4
    iput-boolean p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->isSeeking:Z

    .line 5
    .line 6
    :cond_0
    iput p4, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->discontinuityReason:I

    .line 7
    .line 8
    return-void
.end method

.method public onSessionActive(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;->mediaPeriodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->finishCurrentSession()V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->activeSessionId:Ljava/lang/String;

    .line 16
    .line 17
    new-instance p2, Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 18
    .line 19
    invoke-direct {p2}, Landroid/media/metrics/PlaybackMetrics$Builder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v0, "AndroidXMedia3"

    .line 23
    .line 24
    invoke-virtual {p2, v0}, Landroid/media/metrics/PlaybackMetrics$Builder;->setPlayerName(Ljava/lang/String;)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    const-string v0, "1.5.1"

    .line 29
    .line 30
    invoke-virtual {p2, v0}, Landroid/media/metrics/PlaybackMetrics$Builder;->setPlayerVersion(Ljava/lang/String;)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    iput-object p2, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->metricsBuilder:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 35
    .line 36
    iget-object p2, p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;->timeline:Landroidx/media3/common/p1;

    .line 37
    .line 38
    iget-object p1, p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;->mediaPeriodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 39
    .line 40
    invoke-direct {p0, p2, p1}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->maybeUpdateTimelineMetadata(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public onSessionCreated(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onSessionFinished(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iget-object p1, p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;->mediaPeriodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_2

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->activeSessionId:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-direct {p0}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->finishCurrentSession()V

    .line 21
    .line 22
    .line 23
    :cond_2
    :goto_0
    iget-object p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->bandwidthTimeMs:Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->bandwidthBytes:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public onVideoDisabled(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/exoplayer/DecoderCounters;)V
    .locals 1

    .line 1
    iget p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->droppedFrames:I

    .line 2
    .line 3
    iget v0, p2, Landroidx/media3/exoplayer/DecoderCounters;->droppedBufferCount:I

    .line 4
    .line 5
    add-int/2addr p1, v0

    .line 6
    iput p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->droppedFrames:I

    .line 7
    .line 8
    iget p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->playedFrames:I

    .line 9
    .line 10
    iget p2, p2, Landroidx/media3/exoplayer/DecoderCounters;->renderedOutputBufferCount:I

    .line 11
    .line 12
    add-int/2addr p1, p2

    .line 13
    iput p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->playedFrames:I

    .line 14
    .line 15
    return-void
.end method

.method public onVideoSizeChanged(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/common/d2;)V
    .locals 3

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->pendingVideoFormat:Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;->format:Landroidx/media3/common/w;

    .line 6
    .line 7
    iget v1, v0, Landroidx/media3/common/w;->v:I

    .line 8
    .line 9
    const/4 v2, -0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/media3/common/w;->a()Landroidx/media3/common/v;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget v1, p2, Landroidx/media3/common/d2;->a:I

    .line 17
    .line 18
    iput v1, v0, Landroidx/media3/common/v;->t:I

    .line 19
    .line 20
    iget p2, p2, Landroidx/media3/common/d2;->b:I

    .line 21
    .line 22
    iput p2, v0, Landroidx/media3/common/v;->u:I

    .line 23
    .line 24
    new-instance p2, Landroidx/media3/common/w;

    .line 25
    .line 26
    invoke-direct {p2, v0}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;

    .line 30
    .line 31
    iget v1, p1, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;->selectionReason:I

    .line 32
    .line 33
    iget-object p1, p1, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;->sessionId:Ljava/lang/String;

    .line 34
    .line 35
    invoke-direct {v0, p2, v1, p1}, Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;-><init>(Landroidx/media3/common/w;ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Landroidx/media3/exoplayer/analytics/MediaMetricsListener;->pendingVideoFormat:Landroidx/media3/exoplayer/analytics/MediaMetricsListener$PendingFormatUpdate;

    .line 39
    .line 40
    :cond_0
    return-void
.end method
