.class public final Landroidx/media3/exoplayer/source/SilenceMediaSource;
.super Landroidx/media3/exoplayer/source/BaseMediaSource;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/source/SilenceMediaSource$SilenceMediaPeriod;,
        Landroidx/media3/exoplayer/source/SilenceMediaSource$SilenceSampleStream;,
        Landroidx/media3/exoplayer/source/SilenceMediaSource$Factory;
    }
.end annotation


# static fields
.field private static final CHANNEL_COUNT:I = 0x2

.field private static final FORMAT:Landroidx/media3/common/w;

.field public static final MEDIA_ID:Ljava/lang/String; = "SilenceMediaSource"

.field private static final MEDIA_ITEM:Landroidx/media3/common/o0;

.field private static final PCM_ENCODING:I = 0x2

.field private static final SAMPLE_RATE_HZ:I = 0xac44

.field private static final SILENCE_SAMPLE:[B


# instance fields
.field private final durationUs:J

.field private mediaItem:Landroidx/media3/common/o0;


# direct methods
.method static constructor <clinit>()V
    .locals 22

    .line 1
    new-instance v0, Landroidx/media3/common/v;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media3/common/v;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "audio/raw"

    .line 7
    .line 8
    invoke-static {v1}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iput-object v1, v0, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    iput v1, v0, Landroidx/media3/common/v;->B:I

    .line 16
    .line 17
    const v2, 0xac44

    .line 18
    .line 19
    .line 20
    iput v2, v0, Landroidx/media3/common/v;->C:I

    .line 21
    .line 22
    iput v1, v0, Landroidx/media3/common/v;->D:I

    .line 23
    .line 24
    new-instance v1, Landroidx/media3/common/w;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 27
    .line 28
    .line 29
    sput-object v1, Landroidx/media3/exoplayer/source/SilenceMediaSource;->FORMAT:Landroidx/media3/common/w;

    .line 30
    .line 31
    new-instance v0, Landroidx/media3/common/c0;

    .line 32
    .line 33
    invoke-direct {v0}, Landroidx/media3/common/c0;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance v2, Landroidx/media3/common/f0;

    .line 37
    .line 38
    invoke-direct {v2}, Landroidx/media3/common/f0;-><init>()V

    .line 39
    .line 40
    .line 41
    sget-object v8, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 42
    .line 43
    sget-object v10, Lf6/l1;->n:Lf6/l1;

    .line 44
    .line 45
    new-instance v14, Landroidx/media3/common/h0;

    .line 46
    .line 47
    invoke-direct {v14}, Landroidx/media3/common/h0;-><init>()V

    .line 48
    .line 49
    .line 50
    sget-object v21, Landroidx/media3/common/k0;->d:Landroidx/media3/common/k0;

    .line 51
    .line 52
    sget-object v4, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 53
    .line 54
    iget-object v3, v2, Landroidx/media3/common/f0;->b:Landroid/net/Uri;

    .line 55
    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    iget-object v3, v2, Landroidx/media3/common/f0;->a:Ljava/util/UUID;

    .line 59
    .line 60
    if-eqz v3, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    const/4 v3, 0x0

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    :goto_0
    const/4 v3, 0x1

    .line 66
    :goto_1
    invoke-static {v3}, Lh1/a;->j(Z)V

    .line 67
    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    move-object v5, v3

    .line 71
    if-eqz v4, :cond_3

    .line 72
    .line 73
    new-instance v3, Landroidx/media3/common/j0;

    .line 74
    .line 75
    iget-object v6, v2, Landroidx/media3/common/f0;->a:Ljava/util/UUID;

    .line 76
    .line 77
    if-eqz v6, :cond_2

    .line 78
    .line 79
    new-instance v5, Landroidx/media3/common/g0;

    .line 80
    .line 81
    invoke-direct {v5, v2}, Landroidx/media3/common/g0;-><init>(Landroidx/media3/common/f0;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    move-object v6, v5

    .line 85
    iget-object v5, v1, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 86
    .line 87
    const/4 v7, 0x0

    .line 88
    const/4 v9, 0x0

    .line 89
    const/4 v11, 0x0

    .line 90
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    invoke-direct/range {v3 .. v13}, Landroidx/media3/common/j0;-><init>(Landroid/net/Uri;Ljava/lang/String;Landroidx/media3/common/g0;Landroidx/media3/common/a0;Ljava/util/List;Ljava/lang/String;Lf6/m0;Ljava/lang/Object;J)V

    .line 96
    .line 97
    .line 98
    move-object/from16 v18, v3

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_3
    move-object/from16 v18, v5

    .line 102
    .line 103
    :goto_2
    new-instance v15, Landroidx/media3/common/o0;

    .line 104
    .line 105
    new-instance v1, Landroidx/media3/common/e0;

    .line 106
    .line 107
    invoke-direct {v1, v0}, Landroidx/media3/common/d0;-><init>(Landroidx/media3/common/c0;)V

    .line 108
    .line 109
    .line 110
    new-instance v0, Landroidx/media3/common/i0;

    .line 111
    .line 112
    invoke-direct {v0, v14}, Landroidx/media3/common/i0;-><init>(Landroidx/media3/common/h0;)V

    .line 113
    .line 114
    .line 115
    sget-object v20, Landroidx/media3/common/r0;->K:Landroidx/media3/common/r0;

    .line 116
    .line 117
    const-string v16, "SilenceMediaSource"

    .line 118
    .line 119
    move-object/from16 v19, v0

    .line 120
    .line 121
    move-object/from16 v17, v1

    .line 122
    .line 123
    invoke-direct/range {v15 .. v21}, Landroidx/media3/common/o0;-><init>(Ljava/lang/String;Landroidx/media3/common/e0;Landroidx/media3/common/j0;Landroidx/media3/common/i0;Landroidx/media3/common/r0;Landroidx/media3/common/k0;)V

    .line 124
    .line 125
    .line 126
    sput-object v15, Landroidx/media3/exoplayer/source/SilenceMediaSource;->MEDIA_ITEM:Landroidx/media3/common/o0;

    .line 127
    .line 128
    const/16 v0, 0x1000

    .line 129
    .line 130
    new-array v0, v0, [B

    .line 131
    .line 132
    sput-object v0, Landroidx/media3/exoplayer/source/SilenceMediaSource;->SILENCE_SAMPLE:[B

    .line 133
    .line 134
    return-void
.end method

.method public constructor <init>(J)V
    .locals 1

    .line 2
    sget-object v0, Landroidx/media3/exoplayer/source/SilenceMediaSource;->MEDIA_ITEM:Landroidx/media3/common/o0;

    invoke-direct {p0, p1, p2, v0}, Landroidx/media3/exoplayer/source/SilenceMediaSource;-><init>(JLandroidx/media3/common/o0;)V

    return-void
.end method

.method private constructor <init>(JLandroidx/media3/common/o0;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Landroidx/media3/exoplayer/source/BaseMediaSource;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    :goto_0
    invoke-static {v0}, Lh1/a;->d(Z)V

    .line 5
    iput-wide p1, p0, Landroidx/media3/exoplayer/source/SilenceMediaSource;->durationUs:J

    .line 6
    iput-object p3, p0, Landroidx/media3/exoplayer/source/SilenceMediaSource;->mediaItem:Landroidx/media3/common/o0;

    return-void
.end method

.method public synthetic constructor <init>(JLandroidx/media3/common/o0;Landroidx/media3/exoplayer/source/SilenceMediaSource$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/exoplayer/source/SilenceMediaSource;-><init>(JLandroidx/media3/common/o0;)V

    return-void
.end method

.method public static synthetic access$000()Landroidx/media3/common/o0;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/exoplayer/source/SilenceMediaSource;->MEDIA_ITEM:Landroidx/media3/common/o0;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$200()Landroidx/media3/common/w;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/exoplayer/source/SilenceMediaSource;->FORMAT:Landroidx/media3/common/w;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$300(J)J
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/source/SilenceMediaSource;->getAudioByteCount(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static synthetic access$400(J)J
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/source/SilenceMediaSource;->getAudioPositionUs(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static synthetic access$500()[B
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/exoplayer/source/SilenceMediaSource;->SILENCE_SAMPLE:[B

    .line 2
    .line 3
    return-object v0
.end method

.method private static getAudioByteCount(J)J
    .locals 2

    .line 1
    const-wide/32 v0, 0xac44

    .line 2
    .line 3
    .line 4
    mul-long/2addr p0, v0

    .line 5
    const-wide/32 v0, 0xf4240

    .line 6
    .line 7
    .line 8
    div-long/2addr p0, v0

    .line 9
    sget v0, Lh1/i0;->a:I

    .line 10
    .line 11
    const/4 v0, 0x4

    .line 12
    int-to-long v0, v0

    .line 13
    mul-long/2addr v0, p0

    .line 14
    return-wide v0
.end method

.method private static getAudioPositionUs(J)J
    .locals 2

    .line 1
    sget v0, Lh1/i0;->a:I

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    int-to-long v0, v0

    .line 5
    div-long/2addr p0, v0

    .line 6
    const-wide/32 v0, 0xf4240

    .line 7
    .line 8
    .line 9
    mul-long/2addr p0, v0

    .line 10
    const-wide/32 v0, 0xac44

    .line 11
    .line 12
    .line 13
    div-long/2addr p0, v0

    .line 14
    return-wide p0
.end method


# virtual methods
.method public canUpdateMediaItem(Landroidx/media3/common/o0;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public createPeriod(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;Landroidx/media3/exoplayer/upstream/Allocator;J)Landroidx/media3/exoplayer/source/MediaPeriod;
    .locals 0

    .line 1
    new-instance p1, Landroidx/media3/exoplayer/source/SilenceMediaSource$SilenceMediaPeriod;

    .line 2
    .line 3
    iget-wide p2, p0, Landroidx/media3/exoplayer/source/SilenceMediaSource;->durationUs:J

    .line 4
    .line 5
    invoke-direct {p1, p2, p3}, Landroidx/media3/exoplayer/source/SilenceMediaSource$SilenceMediaPeriod;-><init>(J)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public declared-synchronized getMediaItem()Landroidx/media3/common/o0;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SilenceMediaSource;->mediaItem:Landroidx/media3/common/o0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public maybeThrowSourceInfoRefreshError()V
    .locals 0

    .line 1
    return-void
.end method

.method public prepareSourceInternal(Lk1/c0;)V
    .locals 8

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;

    .line 2
    .line 3
    iget-wide v1, p0, Landroidx/media3/exoplayer/source/SilenceMediaSource;->durationUs:J

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    invoke-virtual {p0}, Landroidx/media3/exoplayer/source/SilenceMediaSource;->getMediaItem()Landroidx/media3/common/o0;

    .line 7
    .line 8
    .line 9
    move-result-object v7

    .line 10
    const/4 v3, 0x1

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    invoke-direct/range {v0 .. v7}, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;-><init>(JZZZLjava/lang/Object;Landroidx/media3/common/o0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroidx/media3/exoplayer/source/BaseMediaSource;->refreshSourceInfo(Landroidx/media3/common/p1;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public releasePeriod(Landroidx/media3/exoplayer/source/MediaPeriod;)V
    .locals 0

    .line 1
    return-void
.end method

.method public releaseSourceInternal()V
    .locals 0

    .line 1
    return-void
.end method

.method public declared-synchronized updateMediaItem(Landroidx/media3/common/o0;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SilenceMediaSource;->mediaItem:Landroidx/media3/common/o0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method
