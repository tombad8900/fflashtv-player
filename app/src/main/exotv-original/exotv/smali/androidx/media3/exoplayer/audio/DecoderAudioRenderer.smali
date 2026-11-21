.class public abstract Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;
.super Landroidx/media3/exoplayer/BaseRenderer;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/MediaClock;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/audio/DecoderAudioRenderer$AudioSinkListener;,
        Landroidx/media3/exoplayer/audio/DecoderAudioRenderer$Api23;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lm1/d;",
        ">",
        "Landroidx/media3/exoplayer/BaseRenderer;",
        "Landroidx/media3/exoplayer/MediaClock;"
    }
.end annotation


# static fields
.field private static final MAX_PENDING_OUTPUT_STREAM_OFFSET_COUNT:I = 0xa

.field private static final REINITIALIZATION_STATE_NONE:I = 0x0

.field private static final REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM:I = 0x1

.field private static final REINITIALIZATION_STATE_WAIT_END_OF_STREAM:I = 0x2

.field private static final TAG:Ljava/lang/String; = "DecoderAudioRenderer"


# instance fields
.field private allowPositionDiscontinuity:Z

.field private final audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

.field private audioTrackNeedsConfigure:Z

.field private currentPositionUs:J

.field private decoder:Lm1/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private decoderCounters:Landroidx/media3/exoplayer/DecoderCounters;

.field private decoderDrmSession:Landroidx/media3/exoplayer/drm/DrmSession;

.field private decoderReceivedBuffers:Z

.field private decoderReinitializationState:I

.field private encoderDelay:I

.field private encoderPadding:I

.field private final eventDispatcher:Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;

.field private firstStreamSampleRead:Z

.field private final flagsOnlyBuffer:Lm1/g;

.field private hasPendingReportedSkippedSilence:Z

.field private inputBuffer:Lm1/g;

.field private inputFormat:Landroidx/media3/common/w;

.field private inputStreamEnded:Z

.field private outputBuffer:Lm1/k;

.field private outputStreamEnded:Z

.field private outputStreamOffsetUs:J

.field private pendingOutputStreamOffsetCount:I

.field private final pendingOutputStreamOffsetsUs:[J

.field private sourceDrmSession:Landroidx/media3/exoplayer/drm/DrmSession;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    new-array v0, v0, [Landroidx/media3/common/audio/d;

    const/4 v1, 0x0

    invoke-direct {p0, v1, v1, v0}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;-><init>(Landroid/os/Handler;Landroidx/media3/exoplayer/audio/AudioRendererEventListener;[Landroidx/media3/common/audio/d;)V

    return-void
.end method

.method public varargs constructor <init>(Landroid/os/Handler;Landroidx/media3/exoplayer/audio/AudioRendererEventListener;Landroidx/media3/exoplayer/audio/AudioCapabilities;[Landroidx/media3/common/audio/d;)V
    .locals 2

    .line 3
    new-instance v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;

    invoke-direct {v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;-><init>()V

    sget-object v1, Landroidx/media3/exoplayer/audio/AudioCapabilities;->DEFAULT_AUDIO_CAPABILITIES:Landroidx/media3/exoplayer/audio/AudioCapabilities;

    .line 4
    invoke-static {p3, v1}, Lcom/bumptech/glide/d;->y(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroidx/media3/exoplayer/audio/AudioCapabilities;

    .line 5
    invoke-virtual {v0, p3}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;->setAudioCapabilities(Landroidx/media3/exoplayer/audio/AudioCapabilities;)Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;

    move-result-object p3

    .line 6
    invoke-virtual {p3, p4}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;->setAudioProcessors([Landroidx/media3/common/audio/d;)Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;

    move-result-object p3

    .line 7
    invoke-virtual {p3}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;->build()Landroidx/media3/exoplayer/audio/DefaultAudioSink;

    move-result-object p3

    .line 8
    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;-><init>(Landroid/os/Handler;Landroidx/media3/exoplayer/audio/AudioRendererEventListener;Landroidx/media3/exoplayer/audio/AudioSink;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Landroidx/media3/exoplayer/audio/AudioRendererEventListener;Landroidx/media3/exoplayer/audio/AudioSink;)V
    .locals 2

    const/4 v0, 0x1

    .line 9
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/BaseRenderer;-><init>(I)V

    .line 10
    new-instance v1, Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;

    invoke-direct {v1, p1, p2}, Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;-><init>(Landroid/os/Handler;Landroidx/media3/exoplayer/audio/AudioRendererEventListener;)V

    iput-object v1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->eventDispatcher:Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;

    .line 11
    iput-object p3, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 12
    new-instance p1, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer$AudioSinkListener;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer$AudioSinkListener;-><init>(Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;Landroidx/media3/exoplayer/audio/DecoderAudioRenderer$1;)V

    invoke-interface {p3, p1}, Landroidx/media3/exoplayer/audio/AudioSink;->setListener(Landroidx/media3/exoplayer/audio/AudioSink$Listener;)V

    .line 13
    invoke-static {}, Lm1/g;->newNoDataInstance()Lm1/g;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->flagsOnlyBuffer:Lm1/g;

    const/4 p1, 0x0

    .line 14
    iput p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoderReinitializationState:I

    .line 15
    iput-boolean v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioTrackNeedsConfigure:Z

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->setOutputStreamOffsetUs(J)V

    const/16 p1, 0xa

    .line 17
    new-array p1, p1, [J

    iput-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->pendingOutputStreamOffsetsUs:[J

    return-void
.end method

.method public varargs constructor <init>(Landroid/os/Handler;Landroidx/media3/exoplayer/audio/AudioRendererEventListener;[Landroidx/media3/common/audio/d;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0, p3}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;-><init>(Landroid/os/Handler;Landroidx/media3/exoplayer/audio/AudioRendererEventListener;Landroidx/media3/exoplayer/audio/AudioCapabilities;[Landroidx/media3/common/audio/d;)V

    return-void
.end method

.method public static synthetic access$102(Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->hasPendingReportedSkippedSilence:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$200(Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;)Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->eventDispatcher:Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;

    .line 2
    .line 3
    return-object p0
.end method

.method private drainOutputBuffer()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoder:Lm1/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lm1/d;->dequeueOutputBuffer()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 14
    .line 15
    .line 16
    throw v0
.end method

.method private feedInputBuffer()Z
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoder:Lm1/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_8

    .line 5
    .line 6
    iget v2, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoderReinitializationState:I

    .line 7
    .line 8
    const/4 v3, 0x2

    .line 9
    if-eq v2, v3, :cond_8

    .line 10
    .line 11
    iget-boolean v2, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputStreamEnded:Z

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :cond_0
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputBuffer:Lm1/g;

    .line 18
    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Lm1/d;->dequeueInputBuffer()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lm1/g;

    .line 26
    .line 27
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputBuffer:Lm1/g;

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    return v1

    .line 32
    :cond_1
    iget v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoderReinitializationState:I

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    const/4 v4, 0x1

    .line 36
    if-ne v0, v4, :cond_2

    .line 37
    .line 38
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputBuffer:Lm1/g;

    .line 39
    .line 40
    const/4 v4, 0x4

    .line 41
    invoke-virtual {v0, v4}, Lm1/a;->setFlags(I)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoder:Lm1/d;

    .line 45
    .line 46
    iget-object v4, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputBuffer:Lm1/g;

    .line 47
    .line 48
    invoke-interface {v0, v4}, Lm1/d;->queueInputBuffer(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iput-object v2, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputBuffer:Lm1/g;

    .line 52
    .line 53
    iput v3, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoderReinitializationState:I

    .line 54
    .line 55
    return v1

    .line 56
    :cond_2
    invoke-virtual {p0}, Landroidx/media3/exoplayer/BaseRenderer;->getFormatHolder()Landroidx/media3/exoplayer/FormatHolder;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object v3, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputBuffer:Lm1/g;

    .line 61
    .line 62
    invoke-virtual {p0, v0, v3, v1}, Landroidx/media3/exoplayer/BaseRenderer;->readSource(Landroidx/media3/exoplayer/FormatHolder;Lm1/g;I)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    const/4 v5, -0x5

    .line 67
    if-eq v3, v5, :cond_7

    .line 68
    .line 69
    const/4 v0, -0x4

    .line 70
    if-eq v3, v0, :cond_4

    .line 71
    .line 72
    const/4 v0, -0x3

    .line 73
    if-ne v3, v0, :cond_3

    .line 74
    .line 75
    return v1

    .line 76
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 79
    .line 80
    .line 81
    throw v0

    .line 82
    :cond_4
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputBuffer:Lm1/g;

    .line 83
    .line 84
    invoke-virtual {v0}, Lm1/a;->isEndOfStream()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    iput-boolean v4, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputStreamEnded:Z

    .line 91
    .line 92
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoder:Lm1/d;

    .line 93
    .line 94
    iget-object v3, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputBuffer:Lm1/g;

    .line 95
    .line 96
    invoke-interface {v0, v3}, Lm1/d;->queueInputBuffer(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iput-object v2, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputBuffer:Lm1/g;

    .line 100
    .line 101
    return v1

    .line 102
    :cond_5
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->firstStreamSampleRead:Z

    .line 103
    .line 104
    if-nez v0, :cond_6

    .line 105
    .line 106
    iput-boolean v4, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->firstStreamSampleRead:Z

    .line 107
    .line 108
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputBuffer:Lm1/g;

    .line 109
    .line 110
    const/high16 v1, 0x8000000

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Lm1/a;->addFlag(I)V

    .line 113
    .line 114
    .line 115
    :cond_6
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputBuffer:Lm1/g;

    .line 116
    .line 117
    invoke-virtual {v0}, Lm1/g;->flip()V

    .line 118
    .line 119
    .line 120
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputBuffer:Lm1/g;

    .line 121
    .line 122
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 123
    .line 124
    iput-object v1, v0, Lm1/g;->format:Landroidx/media3/common/w;

    .line 125
    .line 126
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoder:Lm1/d;

    .line 127
    .line 128
    invoke-interface {v1, v0}, Lm1/d;->queueInputBuffer(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    iput-boolean v4, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoderReceivedBuffers:Z

    .line 132
    .line 133
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoderCounters:Landroidx/media3/exoplayer/DecoderCounters;

    .line 134
    .line 135
    iget v1, v0, Landroidx/media3/exoplayer/DecoderCounters;->queuedInputBufferCount:I

    .line 136
    .line 137
    add-int/2addr v1, v4

    .line 138
    iput v1, v0, Landroidx/media3/exoplayer/DecoderCounters;->queuedInputBufferCount:I

    .line 139
    .line 140
    iput-object v2, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputBuffer:Lm1/g;

    .line 141
    .line 142
    return v4

    .line 143
    :cond_7
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->onInputFormatChanged(Landroidx/media3/exoplayer/FormatHolder;)V

    .line 144
    .line 145
    .line 146
    return v4

    .line 147
    :cond_8
    :goto_0
    return v1
.end method

.method private flushDecoder()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoderReinitializationState:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->releaseDecoder()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->maybeInitDecoder()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputBuffer:Lm1/g;

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoder:Lm1/d;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Lm1/d;->flush()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/media3/exoplayer/BaseRenderer;->getLastResetPositionUs()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    invoke-interface {v0, v1, v2}, Lm1/d;->setOutputStartTimeUs(J)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput-boolean v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoderReceivedBuffers:Z

    .line 32
    .line 33
    return-void
.end method

.method private maybeInitDecoder()V
    .locals 12

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoder:Lm1/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->sourceDrmSession:Landroidx/media3/exoplayer/drm/DrmSession;

    .line 7
    .line 8
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->setDecoderDrmSession(Landroidx/media3/exoplayer/drm/DrmSession;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoderDrmSession:Landroidx/media3/exoplayer/drm/DrmSession;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-interface {v0}, Landroidx/media3/exoplayer/drm/DrmSession;->getCryptoConfig()Lm1/b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_3

    .line 20
    .line 21
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoderDrmSession:Landroidx/media3/exoplayer/drm/DrmSession;

    .line 22
    .line 23
    invoke-interface {v1}, Landroidx/media3/exoplayer/drm/DrmSession;->getError()Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    return-void

    .line 31
    :cond_2
    const/4 v0, 0x0

    .line 32
    :cond_3
    :goto_1
    const/16 v1, 0xfa1

    .line 33
    .line 34
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    const-string v4, "createAudioDecoder"

    .line 39
    .line 40
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v4, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 44
    .line 45
    invoke-virtual {p0, v4, v0}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->createDecoder(Landroidx/media3/common/w;Lm1/b;)Lm1/d;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoder:Lm1/d;

    .line 50
    .line 51
    invoke-virtual {p0}, Landroidx/media3/exoplayer/BaseRenderer;->getLastResetPositionUs()J

    .line 52
    .line 53
    .line 54
    move-result-wide v4

    .line 55
    invoke-interface {v0, v4, v5}, Lm1/d;->setOutputStartTimeUs(J)V

    .line 56
    .line 57
    .line 58
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 59
    .line 60
    .line 61
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 62
    .line 63
    .line 64
    move-result-wide v8

    .line 65
    iget-object v6, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->eventDispatcher:Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;

    .line 66
    .line 67
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoder:Lm1/d;

    .line 68
    .line 69
    invoke-interface {v0}, Lm1/d;->getName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    sub-long v10, v8, v2

    .line 74
    .line 75
    invoke-virtual/range {v6 .. v11}, Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;->decoderInitialized(Ljava/lang/String;JJ)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoderCounters:Landroidx/media3/exoplayer/DecoderCounters;

    .line 79
    .line 80
    iget v2, v0, Landroidx/media3/exoplayer/DecoderCounters;->decoderInitCount:I

    .line 81
    .line 82
    add-int/lit8 v2, v2, 0x1

    .line 83
    .line 84
    iput v2, v0, Landroidx/media3/exoplayer/DecoderCounters;->decoderInitCount:I
    :try_end_0
    .catch Lm1/e; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    .line 86
    return-void

    .line 87
    :catch_0
    move-exception v0

    .line 88
    goto :goto_2

    .line 89
    :catch_1
    move-exception v0

    .line 90
    goto :goto_3

    .line 91
    :goto_2
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 92
    .line 93
    invoke-virtual {p0, v0, v2, v1}, Landroidx/media3/exoplayer/BaseRenderer;->createRendererException(Ljava/lang/Throwable;Landroidx/media3/common/w;I)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    throw v0

    .line 98
    :goto_3
    const-string v2, "DecoderAudioRenderer"

    .line 99
    .line 100
    const-string v3, "Audio codec error"

    .line 101
    .line 102
    invoke-static {v2, v3, v0}, Lh1/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->eventDispatcher:Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;

    .line 106
    .line 107
    invoke-virtual {v2, v0}, Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;->audioCodecError(Ljava/lang/Exception;)V

    .line 108
    .line 109
    .line 110
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 111
    .line 112
    invoke-virtual {p0, v0, v2, v1}, Landroidx/media3/exoplayer/BaseRenderer;->createRendererException(Ljava/lang/Throwable;Landroidx/media3/common/w;I)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    throw v0
.end method

.method private onInputFormatChanged(Landroidx/media3/exoplayer/FormatHolder;)V
    .locals 6

    .line 1
    iget-object v3, p1, Landroidx/media3/exoplayer/FormatHolder;->format:Landroidx/media3/common/w;

    .line 2
    .line 3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Landroidx/media3/exoplayer/FormatHolder;->drmSession:Landroidx/media3/exoplayer/drm/DrmSession;

    .line 7
    .line 8
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->setSourceDrmSession(Landroidx/media3/exoplayer/drm/DrmSession;)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 12
    .line 13
    iput-object v3, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 14
    .line 15
    iget p1, v3, Landroidx/media3/common/w;->F:I

    .line 16
    .line 17
    iput p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->encoderDelay:I

    .line 18
    .line 19
    iget p1, v3, Landroidx/media3/common/w;->G:I

    .line 20
    .line 21
    iput p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->encoderPadding:I

    .line 22
    .line 23
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoder:Lm1/d;

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->maybeInitDecoder()V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->eventDispatcher:Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;

    .line 31
    .line 32
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-virtual {p1, v0, v1}, Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;->inputFormatChanged(Landroidx/media3/common/w;Landroidx/media3/exoplayer/DecoderReuseEvaluation;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->sourceDrmSession:Landroidx/media3/exoplayer/drm/DrmSession;

    .line 40
    .line 41
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoderDrmSession:Landroidx/media3/exoplayer/drm/DrmSession;

    .line 42
    .line 43
    if-eq v0, v1, :cond_1

    .line 44
    .line 45
    new-instance v0, Landroidx/media3/exoplayer/DecoderReuseEvaluation;

    .line 46
    .line 47
    invoke-interface {p1}, Lm1/d;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const/4 v4, 0x0

    .line 52
    const/16 v5, 0x80

    .line 53
    .line 54
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/DecoderReuseEvaluation;-><init>(Ljava/lang/String;Landroidx/media3/common/w;Landroidx/media3/common/w;II)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-interface {p1}, Lm1/d;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p0, p1, v2, v3}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->canReuseDecoder(Ljava/lang/String;Landroidx/media3/common/w;Landroidx/media3/common/w;)Landroidx/media3/exoplayer/DecoderReuseEvaluation;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :goto_0
    iget p1, v0, Landroidx/media3/exoplayer/DecoderReuseEvaluation;->result:I

    .line 67
    .line 68
    if-nez p1, :cond_3

    .line 69
    .line 70
    iget-boolean p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoderReceivedBuffers:Z

    .line 71
    .line 72
    const/4 v1, 0x1

    .line 73
    if-eqz p1, :cond_2

    .line 74
    .line 75
    iput v1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoderReinitializationState:I

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->releaseDecoder()V

    .line 79
    .line 80
    .line 81
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->maybeInitDecoder()V

    .line 82
    .line 83
    .line 84
    iput-boolean v1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioTrackNeedsConfigure:Z

    .line 85
    .line 86
    :cond_3
    :goto_1
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->eventDispatcher:Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;

    .line 87
    .line 88
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 89
    .line 90
    invoke-virtual {p1, v1, v0}, Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;->inputFormatChanged(Landroidx/media3/common/w;Landroidx/media3/exoplayer/DecoderReuseEvaluation;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method private processEndOfStream()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->outputStreamEnded:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 5
    .line 6
    invoke-interface {v0}, Landroidx/media3/exoplayer/audio/AudioSink;->playToEndOfStream()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private processFirstSampleOfStream()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/media3/exoplayer/audio/AudioSink;->handleDiscontinuity()V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->pendingOutputStreamOffsetCount:I

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->pendingOutputStreamOffsetsUs:[J

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    aget-wide v2, v0, v1

    .line 14
    .line 15
    invoke-direct {p0, v2, v3}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->setOutputStreamOffsetUs(J)V

    .line 16
    .line 17
    .line 18
    iget v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->pendingOutputStreamOffsetCount:I

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    sub-int/2addr v0, v2

    .line 22
    iput v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->pendingOutputStreamOffsetCount:I

    .line 23
    .line 24
    iget-object v3, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->pendingOutputStreamOffsetsUs:[J

    .line 25
    .line 26
    invoke-static {v3, v2, v3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method private releaseDecoder()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputBuffer:Lm1/g;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput v1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoderReinitializationState:I

    .line 6
    .line 7
    iput-boolean v1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoderReceivedBuffers:Z

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoder:Lm1/d;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoderCounters:Landroidx/media3/exoplayer/DecoderCounters;

    .line 14
    .line 15
    iget v3, v2, Landroidx/media3/exoplayer/DecoderCounters;->decoderReleaseCount:I

    .line 16
    .line 17
    add-int/lit8 v3, v3, 0x1

    .line 18
    .line 19
    iput v3, v2, Landroidx/media3/exoplayer/DecoderCounters;->decoderReleaseCount:I

    .line 20
    .line 21
    invoke-interface {v1}, Lm1/d;->release()V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->eventDispatcher:Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;

    .line 25
    .line 26
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoder:Lm1/d;

    .line 27
    .line 28
    invoke-interface {v2}, Lm1/d;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;->decoderReleased(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoder:Lm1/d;

    .line 36
    .line 37
    :cond_0
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->setDecoderDrmSession(Landroidx/media3/exoplayer/drm/DrmSession;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method private setDecoderDrmSession(Landroidx/media3/exoplayer/drm/DrmSession;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoderDrmSession:Landroidx/media3/exoplayer/drm/DrmSession;

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/drm/DrmSession;->replaceSession(Landroidx/media3/exoplayer/drm/DrmSession;Landroidx/media3/exoplayer/drm/DrmSession;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoderDrmSession:Landroidx/media3/exoplayer/drm/DrmSession;

    .line 7
    .line 8
    return-void
.end method

.method private setOutputStreamOffsetUs(J)V
    .locals 2

    .line 1
    iput-wide p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->outputStreamOffsetUs:J

    .line 2
    .line 3
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, p1, v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 13
    .line 14
    invoke-interface {v0, p1, p2}, Landroidx/media3/exoplayer/audio/AudioSink;->setOutputStreamOffsetUs(J)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method private setSourceDrmSession(Landroidx/media3/exoplayer/drm/DrmSession;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->sourceDrmSession:Landroidx/media3/exoplayer/drm/DrmSession;

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/drm/DrmSession;->replaceSession(Landroidx/media3/exoplayer/drm/DrmSession;Landroidx/media3/exoplayer/drm/DrmSession;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->sourceDrmSession:Landroidx/media3/exoplayer/drm/DrmSession;

    .line 7
    .line 8
    return-void
.end method

.method private updateCurrentPosition()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->isEnded()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-interface {v0, v1}, Landroidx/media3/exoplayer/audio/AudioSink;->getCurrentPositionUs(Z)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/high16 v2, -0x8000000000000000L

    .line 12
    .line 13
    cmp-long v2, v0, v2

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iget-boolean v2, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->allowPositionDiscontinuity:Z

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-wide v2, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->currentPositionUs:J

    .line 23
    .line 24
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    :goto_0
    iput-wide v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->currentPositionUs:J

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput-boolean v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->allowPositionDiscontinuity:Z

    .line 32
    .line 33
    :cond_1
    return-void
.end method


# virtual methods
.method public canReuseDecoder(Ljava/lang/String;Landroidx/media3/common/w;Landroidx/media3/common/w;)Landroidx/media3/exoplayer/DecoderReuseEvaluation;
    .locals 6

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/DecoderReuseEvaluation;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/4 v5, 0x1

    .line 5
    move-object v1, p1

    .line 6
    move-object v2, p2

    .line 7
    move-object v3, p3

    .line 8
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/DecoderReuseEvaluation;-><init>(Ljava/lang/String;Landroidx/media3/common/w;Landroidx/media3/common/w;II)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public abstract createDecoder(Landroidx/media3/common/w;Lm1/b;)Lm1/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/w;",
            "Lm1/b;",
            ")TT;"
        }
    .end annotation
.end method

.method public getChannelMapping(Lm1/d;)[I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)[I"
        }
    .end annotation

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public getMediaClock()Landroidx/media3/exoplayer/MediaClock;
    .locals 0

    .line 1
    return-object p0
.end method

.method public abstract getOutputFormat(Lm1/d;)Landroidx/media3/common/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Landroidx/media3/common/w;"
        }
    .end annotation
.end method

.method public getPlaybackParameters()Landroidx/media3/common/y0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/media3/exoplayer/audio/AudioSink;->getPlaybackParameters()Landroidx/media3/common/y0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getPositionUs()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/BaseRenderer;->getState()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->updateCurrentPosition()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-wide v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->currentPositionUs:J

    .line 12
    .line 13
    return-wide v0
.end method

.method public final getSinkFormatSupport(Landroidx/media3/common/w;)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/audio/AudioSink;->getFormatSupport(Landroidx/media3/common/w;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public handleMessage(ILjava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    if-eq p1, v0, :cond_6

    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    if-eq p1, v0, :cond_5

    .line 6
    .line 7
    const/4 v0, 0x6

    .line 8
    if-eq p1, v0, :cond_4

    .line 9
    .line 10
    const/16 v0, 0xc

    .line 11
    .line 12
    if-eq p1, v0, :cond_2

    .line 13
    .line 14
    const/16 v0, 0x9

    .line 15
    .line 16
    if-eq p1, v0, :cond_1

    .line 17
    .line 18
    const/16 v0, 0xa

    .line 19
    .line 20
    if-eq p1, v0, :cond_0

    .line 21
    .line 22
    invoke-super {p0, p1, p2}, Landroidx/media3/exoplayer/BaseRenderer;->handleMessage(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 27
    .line 28
    check-cast p2, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-interface {p1, p2}, Landroidx/media3/exoplayer/audio/AudioSink;->setAudioSessionId(I)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 39
    .line 40
    check-cast p2, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    invoke-interface {p1, p2}, Landroidx/media3/exoplayer/audio/AudioSink;->setSkipSilenceEnabled(Z)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    sget p1, Lh1/i0;->a:I

    .line 51
    .line 52
    const/16 v0, 0x17

    .line 53
    .line 54
    if-lt p1, v0, :cond_3

    .line 55
    .line 56
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 57
    .line 58
    invoke-static {p1, p2}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer$Api23;->setAudioSinkPreferredDevice(Landroidx/media3/exoplayer/audio/AudioSink;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    return-void

    .line 62
    :cond_4
    check-cast p2, Landroidx/media3/common/h;

    .line 63
    .line 64
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 65
    .line 66
    invoke-interface {p1, p2}, Landroidx/media3/exoplayer/audio/AudioSink;->setAuxEffectInfo(Landroidx/media3/common/h;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_5
    check-cast p2, Landroidx/media3/common/g;

    .line 71
    .line 72
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 73
    .line 74
    invoke-interface {p1, p2}, Landroidx/media3/exoplayer/audio/AudioSink;->setAudioAttributes(Landroidx/media3/common/g;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_6
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 79
    .line 80
    check-cast p2, Ljava/lang/Float;

    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    invoke-interface {p1, p2}, Landroidx/media3/exoplayer/audio/AudioSink;->setVolume(F)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public hasSkippedSilenceSinceLastCall()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->hasPendingReportedSkippedSilence:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->hasPendingReportedSkippedSilence:Z

    .line 5
    .line 6
    return v0
.end method

.method public isEnded()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->outputStreamEnded:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 6
    .line 7
    invoke-interface {v0}, Landroidx/media3/exoplayer/audio/AudioSink;->isEnded()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

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

.method public isReady()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/media3/exoplayer/audio/AudioSink;->hasPendingData()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/media3/exoplayer/BaseRenderer;->isSourceReady()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0

    .line 21
    :cond_1
    const/4 v0, 0x1

    .line 22
    return v0
.end method

.method public onDisabled()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    iput-boolean v1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioTrackNeedsConfigure:Z

    .line 6
    .line 7
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v1, v2}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->setOutputStreamOffsetUs(J)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    iput-boolean v1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->hasPendingReportedSkippedSilence:Z

    .line 17
    .line 18
    :try_start_0
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->setSourceDrmSession(Landroidx/media3/exoplayer/drm/DrmSession;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->releaseDecoder()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 25
    .line 26
    invoke-interface {v0}, Landroidx/media3/exoplayer/audio/AudioSink;->reset()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->eventDispatcher:Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;

    .line 30
    .line 31
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoderCounters:Landroidx/media3/exoplayer/DecoderCounters;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;->disabled(Landroidx/media3/exoplayer/DecoderCounters;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->eventDispatcher:Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;

    .line 39
    .line 40
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoderCounters:Landroidx/media3/exoplayer/DecoderCounters;

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;->disabled(Landroidx/media3/exoplayer/DecoderCounters;)V

    .line 43
    .line 44
    .line 45
    throw v0
.end method

.method public onEnabled(ZZ)V
    .locals 0

    .line 1
    new-instance p1, Landroidx/media3/exoplayer/DecoderCounters;

    .line 2
    .line 3
    invoke-direct {p1}, Landroidx/media3/exoplayer/DecoderCounters;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoderCounters:Landroidx/media3/exoplayer/DecoderCounters;

    .line 7
    .line 8
    iget-object p2, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->eventDispatcher:Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;

    .line 9
    .line 10
    invoke-virtual {p2, p1}, Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;->enabled(Landroidx/media3/exoplayer/DecoderCounters;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/media3/exoplayer/BaseRenderer;->getConfiguration()Landroidx/media3/exoplayer/RendererConfiguration;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-boolean p1, p1, Landroidx/media3/exoplayer/RendererConfiguration;->tunneling:Z

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 22
    .line 23
    invoke-interface {p1}, Landroidx/media3/exoplayer/audio/AudioSink;->enableTunnelingV21()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 28
    .line 29
    invoke-interface {p1}, Landroidx/media3/exoplayer/audio/AudioSink;->disableTunneling()V

    .line 30
    .line 31
    .line 32
    :goto_0
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/media3/exoplayer/BaseRenderer;->getPlayerId()Landroidx/media3/exoplayer/analytics/PlayerId;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-interface {p1, p2}, Landroidx/media3/exoplayer/audio/AudioSink;->setPlayerId(Landroidx/media3/exoplayer/analytics/PlayerId;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/media3/exoplayer/BaseRenderer;->getClock()Lh1/b;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-interface {p1, p2}, Landroidx/media3/exoplayer/audio/AudioSink;->setClock(Lh1/b;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public onPositionDiscontinuity()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->allowPositionDiscontinuity:Z

    .line 3
    .line 4
    return-void
.end method

.method public onPositionReset(JZ)V
    .locals 0

    .line 1
    iget-object p3, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 2
    .line 3
    invoke-interface {p3}, Landroidx/media3/exoplayer/audio/AudioSink;->flush()V

    .line 4
    .line 5
    .line 6
    iput-wide p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->currentPositionUs:J

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->hasPendingReportedSkippedSilence:Z

    .line 10
    .line 11
    const/4 p2, 0x1

    .line 12
    iput-boolean p2, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->allowPositionDiscontinuity:Z

    .line 13
    .line 14
    iput-boolean p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputStreamEnded:Z

    .line 15
    .line 16
    iput-boolean p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->outputStreamEnded:Z

    .line 17
    .line 18
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoder:Lm1/d;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->flushDecoder()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public onStarted()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/media3/exoplayer/audio/AudioSink;->play()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onStopped()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->updateCurrentPosition()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 5
    .line 6
    invoke-interface {v0}, Landroidx/media3/exoplayer/audio/AudioSink;->pause()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onStreamChanged([Landroidx/media3/common/w;JJLandroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)V
    .locals 2

    .line 1
    invoke-super/range {p0 .. p6}, Landroidx/media3/exoplayer/BaseRenderer;->onStreamChanged([Landroidx/media3/common/w;JJLandroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    const/4 p2, 0x0

    .line 6
    iput-boolean p2, p1, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->firstStreamSampleRead:Z

    .line 7
    .line 8
    iget-wide p2, p1, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->outputStreamOffsetUs:J

    .line 9
    .line 10
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    cmp-long p2, p2, v0

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    invoke-direct {p0, p4, p5}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->setOutputStreamOffsetUs(J)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget p2, p1, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->pendingOutputStreamOffsetCount:I

    .line 24
    .line 25
    iget-object p3, p1, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->pendingOutputStreamOffsetsUs:[J

    .line 26
    .line 27
    array-length p3, p3

    .line 28
    if-ne p2, p3, :cond_1

    .line 29
    .line 30
    new-instance p2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string p3, "Too many stream changes, so dropping offset: "

    .line 33
    .line 34
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object p3, p1, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->pendingOutputStreamOffsetsUs:[J

    .line 38
    .line 39
    iget p6, p1, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->pendingOutputStreamOffsetCount:I

    .line 40
    .line 41
    add-int/lit8 p6, p6, -0x1

    .line 42
    .line 43
    aget-wide v0, p3, p6

    .line 44
    .line 45
    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    const-string p3, "DecoderAudioRenderer"

    .line 53
    .line 54
    invoke-static {p3, p2}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    add-int/lit8 p2, p2, 0x1

    .line 59
    .line 60
    iput p2, p1, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->pendingOutputStreamOffsetCount:I

    .line 61
    .line 62
    :goto_0
    iget-object p2, p1, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->pendingOutputStreamOffsetsUs:[J

    .line 63
    .line 64
    iget p3, p1, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->pendingOutputStreamOffsetCount:I

    .line 65
    .line 66
    add-int/lit8 p3, p3, -0x1

    .line 67
    .line 68
    aput-wide p4, p2, p3

    .line 69
    .line 70
    return-void
.end method

.method public render(JJ)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->outputStreamEnded:Z

    .line 2
    .line 3
    const/16 p2, 0x138a

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    :try_start_0
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 8
    .line 9
    invoke-interface {p1}, Landroidx/media3/exoplayer/audio/AudioSink;->playToEndOfStream()V
    :try_end_0
    .catch Landroidx/media3/exoplayer/audio/AudioSink$WriteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catch_0
    move-exception p1

    .line 14
    iget-object p3, p1, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->format:Landroidx/media3/common/w;

    .line 15
    .line 16
    iget-boolean p4, p1, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->isRecoverable:Z

    .line 17
    .line 18
    invoke-virtual {p0, p1, p3, p4, p2}, Landroidx/media3/exoplayer/BaseRenderer;->createRendererException(Ljava/lang/Throwable;Landroidx/media3/common/w;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    throw p1

    .line 23
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 24
    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/media3/exoplayer/BaseRenderer;->getFormatHolder()Landroidx/media3/exoplayer/FormatHolder;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p3, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->flagsOnlyBuffer:Lm1/g;

    .line 32
    .line 33
    invoke-virtual {p3}, Lm1/g;->clear()V

    .line 34
    .line 35
    .line 36
    iget-object p3, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->flagsOnlyBuffer:Lm1/g;

    .line 37
    .line 38
    const/4 p4, 0x2

    .line 39
    invoke-virtual {p0, p1, p3, p4}, Landroidx/media3/exoplayer/BaseRenderer;->readSource(Landroidx/media3/exoplayer/FormatHolder;Lm1/g;I)I

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    const/4 p4, -0x5

    .line 44
    if-ne p3, p4, :cond_1

    .line 45
    .line 46
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->onInputFormatChanged(Landroidx/media3/exoplayer/FormatHolder;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const/4 p1, -0x4

    .line 51
    if-ne p3, p1, :cond_5

    .line 52
    .line 53
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->flagsOnlyBuffer:Lm1/g;

    .line 54
    .line 55
    invoke-virtual {p1}, Lm1/a;->isEndOfStream()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-static {p1}, Lh1/a;->j(Z)V

    .line 60
    .line 61
    .line 62
    const/4 p1, 0x1

    .line 63
    iput-boolean p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputStreamEnded:Z

    .line 64
    .line 65
    :try_start_1
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->processEndOfStream()V
    :try_end_1
    .catch Landroidx/media3/exoplayer/audio/AudioSink$WriteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :catch_1
    move-exception p1

    .line 70
    const/4 p3, 0x0

    .line 71
    invoke-virtual {p0, p1, p3, p2}, Landroidx/media3/exoplayer/BaseRenderer;->createRendererException(Ljava/lang/Throwable;Landroidx/media3/common/w;I)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    throw p1

    .line 76
    :cond_2
    :goto_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->maybeInitDecoder()V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoder:Lm1/d;

    .line 80
    .line 81
    if-eqz p1, :cond_5

    .line 82
    .line 83
    const/16 p1, 0x1389

    .line 84
    .line 85
    :try_start_2
    const-string p3, "drainAndFeed"

    .line 86
    .line 87
    invoke-static {p3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :goto_1
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->drainOutputBuffer()Z

    .line 91
    .line 92
    .line 93
    move-result p3

    .line 94
    if-eqz p3, :cond_3

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    :goto_2
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->feedInputBuffer()Z

    .line 98
    .line 99
    .line 100
    move-result p3

    .line 101
    if-eqz p3, :cond_4

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_4
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_2
    .catch Lm1/e; {:try_start_2 .. :try_end_2} :catch_5
    .catch Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Landroidx/media3/exoplayer/audio/AudioSink$InitializationException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Landroidx/media3/exoplayer/audio/AudioSink$WriteException; {:try_start_2 .. :try_end_2} :catch_2

    .line 105
    .line 106
    .line 107
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->decoderCounters:Landroidx/media3/exoplayer/DecoderCounters;

    .line 108
    .line 109
    invoke-virtual {p1}, Landroidx/media3/exoplayer/DecoderCounters;->ensureUpdated()V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :catch_2
    move-exception p1

    .line 114
    goto :goto_3

    .line 115
    :catch_3
    move-exception p2

    .line 116
    goto :goto_4

    .line 117
    :catch_4
    move-exception p2

    .line 118
    goto :goto_5

    .line 119
    :catch_5
    move-exception p1

    .line 120
    goto :goto_6

    .line 121
    :goto_3
    iget-object p3, p1, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->format:Landroidx/media3/common/w;

    .line 122
    .line 123
    iget-boolean p4, p1, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->isRecoverable:Z

    .line 124
    .line 125
    invoke-virtual {p0, p1, p3, p4, p2}, Landroidx/media3/exoplayer/BaseRenderer;->createRendererException(Ljava/lang/Throwable;Landroidx/media3/common/w;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    throw p1

    .line 130
    :goto_4
    iget-object p3, p2, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;->format:Landroidx/media3/common/w;

    .line 131
    .line 132
    iget-boolean p4, p2, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;->isRecoverable:Z

    .line 133
    .line 134
    invoke-virtual {p0, p2, p3, p4, p1}, Landroidx/media3/exoplayer/BaseRenderer;->createRendererException(Ljava/lang/Throwable;Landroidx/media3/common/w;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    throw p1

    .line 139
    :goto_5
    iget-object p3, p2, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;->format:Landroidx/media3/common/w;

    .line 140
    .line 141
    invoke-virtual {p0, p2, p3, p1}, Landroidx/media3/exoplayer/BaseRenderer;->createRendererException(Ljava/lang/Throwable;Landroidx/media3/common/w;I)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    throw p1

    .line 146
    :goto_6
    const-string p2, "DecoderAudioRenderer"

    .line 147
    .line 148
    const-string p3, "Audio codec error"

    .line 149
    .line 150
    invoke-static {p2, p3, p1}, Lh1/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    iget-object p2, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->eventDispatcher:Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;

    .line 154
    .line 155
    invoke-virtual {p2, p1}, Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;->audioCodecError(Ljava/lang/Exception;)V

    .line 156
    .line 157
    .line 158
    iget-object p2, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->inputFormat:Landroidx/media3/common/w;

    .line 159
    .line 160
    const/16 p3, 0xfa3

    .line 161
    .line 162
    invoke-virtual {p0, p1, p2, p3}, Landroidx/media3/exoplayer/BaseRenderer;->createRendererException(Ljava/lang/Throwable;Landroidx/media3/common/w;I)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    throw p1

    .line 167
    :cond_5
    return-void
.end method

.method public setPlaybackParameters(Landroidx/media3/common/y0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/audio/AudioSink;->setPlaybackParameters(Landroidx/media3/common/y0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final sinkSupportsFormat(Landroidx/media3/common/w;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->audioSink:Landroidx/media3/exoplayer/audio/AudioSink;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/audio/AudioSink;->supportsFormat(Landroidx/media3/common/w;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final supportsFormat(Landroidx/media3/common/w;)I
    .locals 2

    .line 1
    iget-object v0, p1, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/common/u0;->k(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-static {p1}, Landroidx/media3/exoplayer/RendererCapabilities;->create(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/audio/DecoderAudioRenderer;->supportsFormatInternal(Landroidx/media3/common/w;)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/4 v0, 0x2

    .line 20
    if-gt p1, v0, :cond_1

    .line 21
    .line 22
    invoke-static {p1}, Landroidx/media3/exoplayer/RendererCapabilities;->create(I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_1
    const/16 v0, 0x8

    .line 28
    .line 29
    const/16 v1, 0x20

    .line 30
    .line 31
    invoke-static {p1, v0, v1}, Landroidx/media3/exoplayer/RendererCapabilities;->create(III)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    return p1
.end method

.method public abstract supportsFormatInternal(Landroidx/media3/common/w;)I
.end method
