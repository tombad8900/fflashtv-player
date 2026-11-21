.class public final Landroidx/media3/exoplayer/audio/DefaultAudioSink;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/audio/AudioSink;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;,
        Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioTrackBufferSizeProvider;,
        Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioOffloadSupportProvider;,
        Landroidx/media3/exoplayer/audio/DefaultAudioSink$PositionTrackerListener;,
        Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;,
        Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;,
        Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioTrackProvider;,
        Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;,
        Landroidx/media3/exoplayer/audio/DefaultAudioSink$Api31;,
        Landroidx/media3/exoplayer/audio/DefaultAudioSink$Api23;,
        Landroidx/media3/exoplayer/audio/DefaultAudioSink$OnRoutingChangedListenerApi24;,
        Landroidx/media3/exoplayer/audio/DefaultAudioSink$StreamEventCallbackV29;,
        Landroidx/media3/exoplayer/audio/DefaultAudioSink$OutputMode;,
        Landroidx/media3/exoplayer/audio/DefaultAudioSink$DefaultAudioProcessorChain;,
        Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioProcessorChain;,
        Landroidx/media3/exoplayer/audio/DefaultAudioSink$InvalidAudioTrackTimestampException;
    }
.end annotation


# static fields
.field private static final AUDIO_TRACK_SMALLER_BUFFER_RETRY_SIZE:I = 0xf4240

.field private static final AUDIO_TRACK_VOLUME_RAMP_TIME_MS:I = 0x14

.field public static final DEFAULT_PLAYBACK_SPEED:F = 1.0f

.field private static final DEFAULT_SKIP_SILENCE:Z = false

.field private static final ERROR_NATIVE_DEAD_OBJECT:I = -0x20

.field public static final MAX_PITCH:F = 8.0f

.field public static final MAX_PLAYBACK_SPEED:F = 8.0f

.field private static final MINIMUM_REPORT_SKIPPED_SILENCE_DURATION_US:I = 0x493e0

.field public static final MIN_PITCH:F = 0.1f

.field public static final MIN_PLAYBACK_SPEED:F = 0.1f

.field public static final OUTPUT_MODE_OFFLOAD:I = 0x1

.field public static final OUTPUT_MODE_PASSTHROUGH:I = 0x2

.field public static final OUTPUT_MODE_PCM:I = 0x0

.field private static final REPORT_SKIPPED_SILENCE_DELAY_MS:I = 0x64

.field private static final TAG:Ljava/lang/String; = "DefaultAudioSink"

.field public static failOnSpuriousAudioTimestamp:Z

.field private static pendingReleaseCount:I

.field private static releaseExecutor:Ljava/util/concurrent/ScheduledExecutorService;

.field private static final releaseExecutorLock:Ljava/lang/Object;


# instance fields
.field private accumulatedSkippedSilenceDurationUs:J

.field private afterDrainParameters:Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;

.field private audioAttributes:Landroidx/media3/common/g;

.field private audioCapabilities:Landroidx/media3/exoplayer/audio/AudioCapabilities;

.field private audioCapabilitiesReceiver:Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;

.field private final audioOffloadListener:Landroidx/media3/exoplayer/ExoPlayer$AudioOffloadListener;

.field private final audioOffloadSupportProvider:Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioOffloadSupportProvider;

.field private audioProcessingPipeline:Landroidx/media3/common/audio/a;

.field private final audioProcessorChain:Landroidx/media3/common/audio/e;

.field private audioSessionId:I

.field private audioTrack:Landroid/media/AudioTrack;

.field private final audioTrackBufferSizeProvider:Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioTrackBufferSizeProvider;

.field private final audioTrackPositionTracker:Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;

.field private final audioTrackProvider:Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioTrackProvider;

.field private auxEffectInfo:Landroidx/media3/common/h;

.field private avSyncHeader:Ljava/nio/ByteBuffer;

.field private bytesUntilNextAvSync:I

.field private final channelMappingAudioProcessor:Landroidx/media3/exoplayer/audio/ChannelMappingAudioProcessor;

.field private configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

.field private final context:Landroid/content/Context;

.field private final enableFloatOutput:Z

.field private externalAudioSessionIdProvided:Z

.field private framesPerEncodedSample:I

.field private handledEndOfStream:Z

.field private handledOffloadOnPresentationEnded:Z

.field private final initializationExceptionPendingExceptionHolder:Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder<",
            "Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;",
            ">;"
        }
    .end annotation
.end field

.field private inputBuffer:Ljava/nio/ByteBuffer;

.field private inputBufferAccessUnitCount:I

.field private isWaitingForOffloadEndOfStreamHandled:Z

.field private lastFeedElapsedRealtimeMs:J

.field private lastTunnelingAvSyncPresentationTimeUs:J

.field private listener:Landroidx/media3/exoplayer/audio/AudioSink$Listener;

.field private mediaPositionParameters:Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;

.field private final mediaPositionParametersCheckpoints:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;",
            ">;"
        }
    .end annotation
.end field

.field private offloadDisabledUntilNextConfiguration:Z

.field private offloadMode:I

.field private offloadStreamEventCallbackV29:Landroidx/media3/exoplayer/audio/DefaultAudioSink$StreamEventCallbackV29;

.field private onRoutingChangedListener:Landroidx/media3/exoplayer/audio/DefaultAudioSink$OnRoutingChangedListenerApi24;

.field private outputBuffer:Ljava/nio/ByteBuffer;

.field private pendingConfiguration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

.field private playbackLooper:Landroid/os/Looper;

.field private playbackParameters:Landroidx/media3/common/y0;

.field private playerId:Landroidx/media3/exoplayer/analytics/PlayerId;

.field private playing:Z

.field private final preferAudioTrackPlaybackParams:Z

.field private preferredDevice:Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;

.field private reportSkippedSilenceHandler:Landroid/os/Handler;

.field private skipSilenceEnabled:Z

.field private skippedOutputFrameCountAtLastPosition:J

.field private startMediaTimeUs:J

.field private startMediaTimeUsNeedsInit:Z

.field private startMediaTimeUsNeedsSync:Z

.field private stoppedAudioTrack:Z

.field private submittedEncodedFrames:J

.field private submittedPcmBytes:J

.field private final toFloatPcmAvailableAudioProcessors:Lf6/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/m0;"
        }
    .end annotation
.end field

.field private final toIntPcmAvailableAudioProcessors:Lf6/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/m0;"
        }
    .end annotation
.end field

.field private final trimmingAudioProcessor:Landroidx/media3/exoplayer/audio/TrimmingAudioProcessor;

.field private tunneling:Z

.field private volume:F

.field private final writeExceptionPendingExceptionHolder:Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder<",
            "Landroidx/media3/exoplayer/audio/AudioSink$WriteException;",
            ">;"
        }
    .end annotation
.end field

.field private writtenEncodedFrames:J

.field private writtenPcmBytes:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->releaseExecutorLock:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>(Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;)V
    .locals 11
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "#1.audioProcessorChain"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;->access$100(Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;)Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->context:Landroid/content/Context;

    .line 4
    sget-object v1, Landroidx/media3/common/g;->b:Landroidx/media3/common/g;

    iput-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioAttributes:Landroidx/media3/common/g;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 5
    invoke-static {v0, v1, v2}, Landroidx/media3/exoplayer/audio/AudioCapabilities;->getCapabilities(Landroid/content/Context;Landroidx/media3/common/g;Landroid/media/AudioDeviceInfo;)Landroidx/media3/exoplayer/audio/AudioCapabilities;

    move-result-object v0

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;->access$200(Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;)Landroidx/media3/exoplayer/audio/AudioCapabilities;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioCapabilities:Landroidx/media3/exoplayer/audio/AudioCapabilities;

    .line 7
    invoke-static {p1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;->access$300(Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;)Landroidx/media3/common/audio/e;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioProcessorChain:Landroidx/media3/common/audio/e;

    .line 8
    invoke-static {p1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;->access$400(Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->enableFloatOutput:Z

    .line 9
    sget v0, Lh1/i0;->a:I

    const/16 v1, 0x17

    const/4 v3, 0x0

    if-lt v0, v1, :cond_1

    invoke-static {p1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;->access$500(Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    move v0, v3

    :goto_1
    iput-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->preferAudioTrackPlaybackParams:Z

    .line 10
    iput v3, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->offloadMode:I

    .line 11
    invoke-static {p1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;->access$600(Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;)Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioTrackBufferSizeProvider;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrackBufferSizeProvider:Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioTrackBufferSizeProvider;

    .line 12
    invoke-static {p1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;->access$700(Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;)Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioOffloadSupportProvider;

    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioOffloadSupportProvider:Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioOffloadSupportProvider;

    .line 15
    new-instance v0, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;

    new-instance v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink$PositionTrackerListener;

    invoke-direct {v1, p0, v2}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$PositionTrackerListener;-><init>(Landroidx/media3/exoplayer/audio/DefaultAudioSink;Landroidx/media3/exoplayer/audio/DefaultAudioSink$1;)V

    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;-><init>(Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker$Listener;)V

    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrackPositionTracker:Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;

    .line 16
    new-instance v0, Landroidx/media3/exoplayer/audio/ChannelMappingAudioProcessor;

    invoke-direct {v0}, Landroidx/media3/exoplayer/audio/ChannelMappingAudioProcessor;-><init>()V

    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->channelMappingAudioProcessor:Landroidx/media3/exoplayer/audio/ChannelMappingAudioProcessor;

    .line 17
    new-instance v1, Landroidx/media3/exoplayer/audio/TrimmingAudioProcessor;

    invoke-direct {v1}, Landroidx/media3/exoplayer/audio/TrimmingAudioProcessor;-><init>()V

    iput-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->trimmingAudioProcessor:Landroidx/media3/exoplayer/audio/TrimmingAudioProcessor;

    .line 18
    new-instance v2, Landroidx/media3/common/audio/j;

    .line 19
    invoke-direct {v2}, Landroidx/media3/common/audio/f;-><init>()V

    .line 20
    sget-object v4, Lf6/m0;->k:Lf6/k0;

    .line 21
    filled-new-array {v2, v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x3

    .line 22
    invoke-static {v1, v0}, Lf6/u;->b(I[Ljava/lang/Object;)V

    .line 23
    invoke-static {v1, v0}, Lf6/m0;->h(I[Ljava/lang/Object;)Lf6/l1;

    move-result-object v0

    .line 24
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->toIntPcmAvailableAudioProcessors:Lf6/m0;

    .line 25
    new-instance v0, Landroidx/media3/exoplayer/audio/ToFloatPcmAudioProcessor;

    invoke-direct {v0}, Landroidx/media3/exoplayer/audio/ToFloatPcmAudioProcessor;-><init>()V

    invoke-static {v0}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->toFloatPcmAvailableAudioProcessors:Lf6/m0;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 26
    iput v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->volume:F

    .line 27
    iput v3, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioSessionId:I

    .line 28
    new-instance v0, Landroidx/media3/common/h;

    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->auxEffectInfo:Landroidx/media3/common/h;

    .line 31
    new-instance v4, Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;

    sget-object v5, Landroidx/media3/common/y0;->d:Landroidx/media3/common/y0;

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v6, 0x0

    invoke-direct/range {v4 .. v10}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;-><init>(Landroidx/media3/common/y0;JJLandroidx/media3/exoplayer/audio/DefaultAudioSink$1;)V

    iput-object v4, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->mediaPositionParameters:Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;

    .line 32
    iput-object v5, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->playbackParameters:Landroidx/media3/common/y0;

    .line 33
    iput-boolean v3, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->skipSilenceEnabled:Z

    .line 34
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->mediaPositionParametersCheckpoints:Ljava/util/ArrayDeque;

    .line 35
    new-instance v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;

    invoke-direct {v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;-><init>()V

    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->initializationExceptionPendingExceptionHolder:Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;

    .line 36
    new-instance v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;

    invoke-direct {v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;-><init>()V

    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->writeExceptionPendingExceptionHolder:Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;

    .line 37
    invoke-static {p1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;->access$1000(Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;)Landroidx/media3/exoplayer/ExoPlayer$AudioOffloadListener;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioOffloadListener:Landroidx/media3/exoplayer/ExoPlayer$AudioOffloadListener;

    .line 38
    invoke-static {p1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;->access$1100(Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;)Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioTrackProvider;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrackProvider:Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioTrackProvider;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;Landroidx/media3/exoplayer/audio/DefaultAudioSink$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;-><init>(Landroidx/media3/exoplayer/audio/DefaultAudioSink$Builder;)V

    return-void
.end method

.method public static synthetic a(Landroidx/media3/exoplayer/audio/AudioSink$Listener;Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->lambda$releaseAudioTrackAsync$0(Landroidx/media3/exoplayer/audio/AudioSink$Listener;Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$1200(Landroidx/media3/exoplayer/audio/DefaultAudioSink;)Landroid/media/AudioTrack;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1300(Landroidx/media3/exoplayer/audio/DefaultAudioSink;)Landroidx/media3/exoplayer/audio/AudioSink$Listener;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->listener:Landroidx/media3/exoplayer/audio/AudioSink$Listener;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1400(Landroidx/media3/exoplayer/audio/DefaultAudioSink;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->playing:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$1502(Landroidx/media3/exoplayer/audio/DefaultAudioSink;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->handledOffloadOnPresentationEnded:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1600(Landroidx/media3/exoplayer/audio/DefaultAudioSink;)J
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->getSubmittedFrames()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static synthetic access$1700(Landroidx/media3/exoplayer/audio/DefaultAudioSink;)J
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->getWrittenFrames()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static synthetic access$1900(Landroidx/media3/exoplayer/audio/DefaultAudioSink;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->lastFeedElapsedRealtimeMs:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic access$2000()Z
    .locals 1

    .line 1
    invoke-static {}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->hasPendingAudioTrackReleases()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method private applyAudioProcessorPlaybackParametersAndSkipSilence(J)V
    .locals 8

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->useAudioTrackPlaybackParams()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->shouldApplyAudioProcessorPlaybackParameters()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioProcessorChain:Landroidx/media3/common/audio/e;

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->playbackParameters:Landroidx/media3/common/y0;

    .line 16
    .line 17
    invoke-interface {v0, v1}, Landroidx/media3/common/audio/e;->applyPlaybackParameters(Landroidx/media3/common/y0;)Landroidx/media3/common/y0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    sget-object v0, Landroidx/media3/common/y0;->d:Landroidx/media3/common/y0;

    .line 23
    .line 24
    :goto_0
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->playbackParameters:Landroidx/media3/common/y0;

    .line 25
    .line 26
    :goto_1
    move-object v2, v0

    .line 27
    goto :goto_2

    .line 28
    :cond_1
    sget-object v0, Landroidx/media3/common/y0;->d:Landroidx/media3/common/y0;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :goto_2
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->shouldApplyAudioProcessorPlaybackParameters()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioProcessorChain:Landroidx/media3/common/audio/e;

    .line 38
    .line 39
    iget-boolean v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->skipSilenceEnabled:Z

    .line 40
    .line 41
    invoke-interface {v0, v1}, Landroidx/media3/common/audio/e;->applySkipSilenceEnabled(Z)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    goto :goto_3

    .line 46
    :cond_2
    const/4 v0, 0x0

    .line 47
    :goto_3
    iput-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->skipSilenceEnabled:Z

    .line 48
    .line 49
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->mediaPositionParametersCheckpoints:Ljava/util/ArrayDeque;

    .line 50
    .line 51
    new-instance v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;

    .line 52
    .line 53
    const-wide/16 v3, 0x0

    .line 54
    .line 55
    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 60
    .line 61
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->getWrittenFrames()J

    .line 62
    .line 63
    .line 64
    move-result-wide v5

    .line 65
    invoke-virtual {p1, v5, v6}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->framesToDurationUs(J)J

    .line 66
    .line 67
    .line 68
    move-result-wide v5

    .line 69
    const/4 v7, 0x0

    .line 70
    invoke-direct/range {v1 .. v7}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;-><init>(Landroidx/media3/common/y0;JJLandroidx/media3/exoplayer/audio/DefaultAudioSink$1;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->setupAudioProcessors()V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->listener:Landroidx/media3/exoplayer/audio/AudioSink$Listener;

    .line 80
    .line 81
    if-eqz p1, :cond_3

    .line 82
    .line 83
    iget-boolean p2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->skipSilenceEnabled:Z

    .line 84
    .line 85
    invoke-interface {p1, p2}, Landroidx/media3/exoplayer/audio/AudioSink$Listener;->onSkipSilenceEnabledChanged(Z)V

    .line 86
    .line 87
    .line 88
    :cond_3
    return-void
.end method

.method private applyMediaPositionParameters(J)J
    .locals 5

    .line 1
    :goto_0
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->mediaPositionParametersCheckpoints:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->mediaPositionParametersCheckpoints:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;

    .line 16
    .line 17
    iget-wide v0, v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;->audioTrackPositionUs:J

    .line 18
    .line 19
    cmp-long v0, p1, v0

    .line 20
    .line 21
    if-ltz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->mediaPositionParametersCheckpoints:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;

    .line 30
    .line 31
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->mediaPositionParameters:Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->mediaPositionParameters:Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;

    .line 35
    .line 36
    iget-wide v1, v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;->audioTrackPositionUs:J

    .line 37
    .line 38
    sub-long/2addr p1, v1

    .line 39
    iget-object v0, v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;->playbackParameters:Landroidx/media3/common/y0;

    .line 40
    .line 41
    iget v0, v0, Landroidx/media3/common/y0;->a:F

    .line 42
    .line 43
    invoke-static {p1, p2, v0}, Lh1/i0;->B(JF)J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->mediaPositionParametersCheckpoints:Ljava/util/ArrayDeque;

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioProcessorChain:Landroidx/media3/common/audio/e;

    .line 56
    .line 57
    invoke-interface {v2, p1, p2}, Landroidx/media3/common/audio/e;->getMediaDuration(J)J

    .line 58
    .line 59
    .line 60
    move-result-wide p1

    .line 61
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->mediaPositionParameters:Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;

    .line 62
    .line 63
    iget-wide v3, v2, Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;->mediaTimeUs:J

    .line 64
    .line 65
    add-long/2addr v3, p1

    .line 66
    sub-long/2addr p1, v0

    .line 67
    iput-wide p1, v2, Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;->mediaPositionDriftUs:J

    .line 68
    .line 69
    return-wide v3

    .line 70
    :cond_1
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->mediaPositionParameters:Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;

    .line 71
    .line 72
    iget-wide v2, p1, Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;->mediaTimeUs:J

    .line 73
    .line 74
    add-long/2addr v2, v0

    .line 75
    iget-wide p1, p1, Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;->mediaPositionDriftUs:J

    .line 76
    .line 77
    add-long/2addr v2, p1

    .line 78
    return-wide v2
.end method

.method private applySkipping(J)J
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioProcessorChain:Landroidx/media3/common/audio/e;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/media3/common/audio/e;->getSkippedOutputFrameCount()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 8
    .line 9
    invoke-virtual {v2, v0, v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->framesToDurationUs(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    add-long/2addr p1, v2

    .line 14
    iget-wide v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->skippedOutputFrameCountAtLastPosition:J

    .line 15
    .line 16
    cmp-long v4, v0, v2

    .line 17
    .line 18
    if-lez v4, :cond_0

    .line 19
    .line 20
    iget-object v4, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 21
    .line 22
    sub-long v2, v0, v2

    .line 23
    .line 24
    invoke-virtual {v4, v2, v3}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->framesToDurationUs(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    iput-wide v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->skippedOutputFrameCountAtLastPosition:J

    .line 29
    .line 30
    invoke-direct {p0, v2, v3}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->handleSkippedSilence(J)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-wide p1
.end method

.method public static synthetic b(Landroidx/media3/exoplayer/audio/DefaultAudioSink;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->maybeReportSkippedSilence()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private buildAudioTrack(Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;Landroidx/media3/common/g;ILandroidx/media3/common/w;)Landroid/media/AudioTrack;
    .locals 9

    .line 8
    :try_start_0
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrackProvider:Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioTrackProvider;

    .line 9
    invoke-interface {v0, p1, p2, p3}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioTrackProvider;->getAudioTrack(Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;Landroidx/media3/common/g;I)Landroid/media/AudioTrack;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 10
    invoke-virtual {p2}, Landroid/media/AudioTrack;->getState()I

    move-result v1

    const/4 p3, 0x1

    if-ne v1, p3, :cond_0

    return-object p2

    .line 11
    :cond_0
    :try_start_1
    invoke-virtual {p2}, Landroid/media/AudioTrack;->release()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 12
    :catch_0
    new-instance v0, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;

    iget v2, p1, Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;->sampleRate:I

    iget v3, p1, Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;->channelConfig:I

    iget v4, p1, Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;->encoding:I

    iget-boolean v6, p1, Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;->offload:Z

    const/4 v7, 0x0

    move-object v5, p4

    invoke-direct/range {v0 .. v7}, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;-><init>(IIIILandroidx/media3/common/w;ZLjava/lang/Exception;)V

    throw v0

    :catch_1
    move-exception v0

    :goto_0
    move-object v5, p4

    move-object p2, v0

    move-object v8, p2

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_0

    .line 13
    :goto_1
    new-instance v1, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;

    iget v3, p1, Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;->sampleRate:I

    iget v4, p1, Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;->channelConfig:I

    move-object v6, v5

    iget v5, p1, Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;->encoding:I

    iget-boolean v7, p1, Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;->offload:Z

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v8}, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;-><init>(IIIILandroidx/media3/common/w;ZLjava/lang/Exception;)V

    throw v1
.end method

.method private buildAudioTrack(Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;)Landroid/media/AudioTrack;
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->buildAudioTrackConfig()Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;

    move-result-object v0

    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioAttributes:Landroidx/media3/common/g;

    iget v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioSessionId:I

    iget-object p1, p1, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->inputFormat:Landroidx/media3/common/w;

    .line 2
    invoke-direct {p0, v0, v1, v2, p1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->buildAudioTrack(Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;Landroidx/media3/common/g;ILandroidx/media3/common/w;)Landroid/media/AudioTrack;

    move-result-object p1

    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioOffloadListener:Landroidx/media3/exoplayer/ExoPlayer$AudioOffloadListener;

    if-eqz v0, :cond_0

    .line 4
    invoke-static {p1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isOffloadedPlayback(Landroid/media/AudioTrack;)Z

    move-result v1

    invoke-interface {v0, v1}, Landroidx/media3/exoplayer/ExoPlayer$AudioOffloadListener;->onOffloadedPlayback(Z)V
    :try_end_0
    .catch Landroidx/media3/exoplayer/audio/AudioSink$InitializationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-object p1

    .line 5
    :goto_0
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->listener:Landroidx/media3/exoplayer/audio/AudioSink$Listener;

    if-eqz v0, :cond_1

    .line 6
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/audio/AudioSink$Listener;->onAudioSinkError(Ljava/lang/Exception;)V

    .line 7
    :cond_1
    throw p1
.end method

.method private buildAudioTrackWithRetry()Landroid/media/AudioTrack;
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->buildAudioTrack(Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;)Landroid/media/AudioTrack;

    .line 7
    .line 8
    .line 9
    move-result-object v0
    :try_end_0
    .catch Landroidx/media3/exoplayer/audio/AudioSink$InitializationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    return-object v0

    .line 11
    :catch_0
    move-exception v0

    .line 12
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 13
    .line 14
    iget v2, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->bufferSize:I

    .line 15
    .line 16
    const v3, 0xf4240

    .line 17
    .line 18
    .line 19
    if-le v2, v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1, v3}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->copyWithBufferSize(I)Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :try_start_1
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->buildAudioTrack(Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;)Landroid/media/AudioTrack;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iput-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;
    :try_end_1
    .catch Landroidx/media3/exoplayer/audio/AudioSink$InitializationException; {:try_start_1 .. :try_end_1} :catch_1

    .line 30
    .line 31
    return-object v2

    .line 32
    :catch_1
    move-exception v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->maybeDisableOffload()V

    .line 37
    .line 38
    .line 39
    throw v0
.end method

.method public static synthetic c(Landroid/media/AudioTrack;Landroidx/media3/exoplayer/audio/AudioSink$Listener;Landroid/os/Handler;Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->lambda$releaseAudioTrackAsync$1(Landroid/media/AudioTrack;Landroidx/media3/exoplayer/audio/AudioSink$Listener;Landroid/os/Handler;Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private drainOutputBuffer(J)V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->outputBuffer:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    :goto_0
    move-object v1, p0

    .line 6
    goto/16 :goto_7

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->writeExceptionPendingExceptionHolder:Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;->shouldWaitBeforeRetry()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->outputBuffer:Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->tunneling:Z

    .line 24
    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v8, 0x1

    .line 27
    if-eqz v0, :cond_4

    .line 28
    .line 29
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    cmp-long v0, p1, v0

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    move v0, v8

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v0, v7

    .line 41
    :goto_1
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 42
    .line 43
    .line 44
    const-wide/high16 v0, -0x8000000000000000L

    .line 45
    .line 46
    cmp-long v0, p1, v0

    .line 47
    .line 48
    if-nez v0, :cond_3

    .line 49
    .line 50
    iget-wide p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->lastTunnelingAvSyncPresentationTimeUs:J

    .line 51
    .line 52
    :goto_2
    move-wide v5, p1

    .line 53
    goto :goto_3

    .line 54
    :cond_3
    iput-wide p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->lastTunnelingAvSyncPresentationTimeUs:J

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :goto_3
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 58
    .line 59
    iget-object v3, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->outputBuffer:Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    move-object v1, p0

    .line 62
    invoke-direct/range {v1 .. v6}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->writeNonBlockingWithAvSync(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;IJ)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    goto :goto_4

    .line 67
    :cond_4
    move-object v1, p0

    .line 68
    iget-object p1, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 69
    .line 70
    iget-object p2, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->outputBuffer:Ljava/nio/ByteBuffer;

    .line 71
    .line 72
    invoke-static {p1, p2, v4}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->writeNonBlocking(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    :goto_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 77
    .line 78
    .line 79
    move-result-wide v2

    .line 80
    iput-wide v2, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->lastFeedElapsedRealtimeMs:J

    .line 81
    .line 82
    const-wide/16 v2, 0x0

    .line 83
    .line 84
    if-gez p1, :cond_9

    .line 85
    .line 86
    invoke-static {p1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isAudioTrackDeadObject(I)Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    if-eqz p2, :cond_6

    .line 91
    .line 92
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->getWrittenFrames()J

    .line 93
    .line 94
    .line 95
    move-result-wide v4

    .line 96
    cmp-long p2, v4, v2

    .line 97
    .line 98
    if-lez p2, :cond_5

    .line 99
    .line 100
    :goto_5
    move v7, v8

    .line 101
    goto :goto_6

    .line 102
    :cond_5
    iget-object p2, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 103
    .line 104
    invoke-static {p2}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isOffloadedPlayback(Landroid/media/AudioTrack;)Z

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-eqz p2, :cond_6

    .line 109
    .line 110
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->maybeDisableOffload()V

    .line 111
    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_6
    :goto_6
    new-instance p2, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;

    .line 115
    .line 116
    iget-object v0, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 117
    .line 118
    iget-object v0, v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->inputFormat:Landroidx/media3/common/w;

    .line 119
    .line 120
    invoke-direct {p2, p1, v0, v7}, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;-><init>(ILandroidx/media3/common/w;Z)V

    .line 121
    .line 122
    .line 123
    iget-object p1, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->listener:Landroidx/media3/exoplayer/audio/AudioSink$Listener;

    .line 124
    .line 125
    if-eqz p1, :cond_7

    .line 126
    .line 127
    invoke-interface {p1, p2}, Landroidx/media3/exoplayer/audio/AudioSink$Listener;->onAudioSinkError(Ljava/lang/Exception;)V

    .line 128
    .line 129
    .line 130
    :cond_7
    iget-boolean p1, p2, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->isRecoverable:Z

    .line 131
    .line 132
    if-nez p1, :cond_8

    .line 133
    .line 134
    iget-object p1, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->writeExceptionPendingExceptionHolder:Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;

    .line 135
    .line 136
    invoke-virtual {p1, p2}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;->throwExceptionIfDeadlineIsReached(Ljava/lang/Exception;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_8
    sget-object p1, Landroidx/media3/exoplayer/audio/AudioCapabilities;->DEFAULT_AUDIO_CAPABILITIES:Landroidx/media3/exoplayer/audio/AudioCapabilities;

    .line 141
    .line 142
    iput-object p1, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioCapabilities:Landroidx/media3/exoplayer/audio/AudioCapabilities;

    .line 143
    .line 144
    throw p2

    .line 145
    :cond_9
    iget-object p2, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->writeExceptionPendingExceptionHolder:Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;

    .line 146
    .line 147
    invoke-virtual {p2}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;->clear()V

    .line 148
    .line 149
    .line 150
    iget-object p2, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 151
    .line 152
    invoke-static {p2}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isOffloadedPlayback(Landroid/media/AudioTrack;)Z

    .line 153
    .line 154
    .line 155
    move-result p2

    .line 156
    if-eqz p2, :cond_b

    .line 157
    .line 158
    iget-wide v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->writtenEncodedFrames:J

    .line 159
    .line 160
    cmp-long p2, v5, v2

    .line 161
    .line 162
    if-lez p2, :cond_a

    .line 163
    .line 164
    iput-boolean v7, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isWaitingForOffloadEndOfStreamHandled:Z

    .line 165
    .line 166
    :cond_a
    iget-boolean p2, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->playing:Z

    .line 167
    .line 168
    if-eqz p2, :cond_b

    .line 169
    .line 170
    iget-object p2, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->listener:Landroidx/media3/exoplayer/audio/AudioSink$Listener;

    .line 171
    .line 172
    if-eqz p2, :cond_b

    .line 173
    .line 174
    if-ge p1, v4, :cond_b

    .line 175
    .line 176
    iget-boolean v0, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isWaitingForOffloadEndOfStreamHandled:Z

    .line 177
    .line 178
    if-nez v0, :cond_b

    .line 179
    .line 180
    invoke-interface {p2}, Landroidx/media3/exoplayer/audio/AudioSink$Listener;->onOffloadBufferFull()V

    .line 181
    .line 182
    .line 183
    :cond_b
    iget-object p2, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 184
    .line 185
    iget p2, p2, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->outputMode:I

    .line 186
    .line 187
    if-nez p2, :cond_c

    .line 188
    .line 189
    iget-wide v2, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->writtenPcmBytes:J

    .line 190
    .line 191
    int-to-long v5, p1

    .line 192
    add-long/2addr v2, v5

    .line 193
    iput-wide v2, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->writtenPcmBytes:J

    .line 194
    .line 195
    :cond_c
    if-ne p1, v4, :cond_f

    .line 196
    .line 197
    if-eqz p2, :cond_e

    .line 198
    .line 199
    iget-object p1, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->outputBuffer:Ljava/nio/ByteBuffer;

    .line 200
    .line 201
    iget-object p2, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->inputBuffer:Ljava/nio/ByteBuffer;

    .line 202
    .line 203
    if-ne p1, p2, :cond_d

    .line 204
    .line 205
    move v7, v8

    .line 206
    :cond_d
    invoke-static {v7}, Lh1/a;->j(Z)V

    .line 207
    .line 208
    .line 209
    iget-wide p1, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->writtenEncodedFrames:J

    .line 210
    .line 211
    iget v0, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->framesPerEncodedSample:I

    .line 212
    .line 213
    int-to-long v2, v0

    .line 214
    iget v0, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->inputBufferAccessUnitCount:I

    .line 215
    .line 216
    int-to-long v4, v0

    .line 217
    mul-long/2addr v2, v4

    .line 218
    add-long/2addr v2, p1

    .line 219
    iput-wide v2, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->writtenEncodedFrames:J

    .line 220
    .line 221
    :cond_e
    const/4 p1, 0x0

    .line 222
    iput-object p1, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->outputBuffer:Ljava/nio/ByteBuffer;

    .line 223
    .line 224
    :cond_f
    :goto_7
    return-void
.end method

.method private drainToEndOfStream()Z
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioProcessingPipeline:Landroidx/media3/common/audio/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/common/audio/a;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-wide/high16 v1, -0x8000000000000000L

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-direct {p0, v1, v2}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->drainOutputBuffer(J)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->outputBuffer:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    if-nez v0, :cond_4

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioProcessingPipeline:Landroidx/media3/common/audio/a;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/media3/common/audio/a;->c()Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_2

    .line 28
    .line 29
    iget-boolean v5, v0, Landroidx/media3/common/audio/a;->d:Z

    .line 30
    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iput-boolean v4, v0, Landroidx/media3/common/audio/a;->d:Z

    .line 35
    .line 36
    iget-object v0, v0, Landroidx/media3/common/audio/a;->b:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Landroidx/media3/common/audio/d;

    .line 43
    .line 44
    invoke-interface {v0}, Landroidx/media3/common/audio/d;->queueEndOfStream()V

    .line 45
    .line 46
    .line 47
    :cond_2
    :goto_0
    invoke-direct {p0, v1, v2}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->processBuffers(J)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioProcessingPipeline:Landroidx/media3/common/audio/a;

    .line 51
    .line 52
    invoke-virtual {v0}, Landroidx/media3/common/audio/a;->b()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->outputBuffer:Ljava/nio/ByteBuffer;

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_4

    .line 67
    .line 68
    :cond_3
    :goto_1
    return v4

    .line 69
    :cond_4
    return v3
.end method

.method private static getAudioTrackMinBufferSize(III)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 p1, -0x2

    .line 6
    if-eq p0, p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    invoke-static {p1}, Lh1/a;->j(Z)V

    .line 12
    .line 13
    .line 14
    return p0
.end method

.method private static getFramesPerEncodedSample(ILjava/nio/ByteBuffer;)I
    .locals 10

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x5

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    if-eq p0, v0, :cond_19

    .line 8
    .line 9
    const/16 v0, 0x1e

    .line 10
    .line 11
    const/4 v5, -0x2

    .line 12
    const/4 v6, -0x1

    .line 13
    if-eq p0, v0, :cond_12

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    const/16 v7, 0xa

    .line 17
    .line 18
    packed-switch p0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    const/16 v1, 0x10

    .line 22
    .line 23
    packed-switch p0, :pswitch_data_1

    .line 24
    .line 25
    .line 26
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v0, "Unexpected audio encoding: "

    .line 29
    .line 30
    invoke-static {p0, v0}, La1/a1;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :pswitch_0
    new-array p0, v1, [B

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 48
    .line 49
    .line 50
    new-instance p1, Lh1/v;

    .line 51
    .line 52
    invoke-direct {p1, p0, v1}, Lh1/v;-><init>([BI)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, Ln1/b;->m(Lh1/v;)Lc4/h;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    iget p0, p0, Lc4/h;->c:I

    .line 60
    .line 61
    return p0

    .line 62
    :pswitch_1
    const/16 p0, 0x200

    .line 63
    .line 64
    return p0

    .line 65
    :pswitch_2
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    sub-int/2addr v0, v7

    .line 74
    move v2, p0

    .line 75
    :goto_0
    if-gt v2, v0, :cond_2

    .line 76
    .line 77
    add-int/lit8 v7, v2, 0x4

    .line 78
    .line 79
    sget v8, Lh1/i0;->a:I

    .line 80
    .line 81
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    sget-object v9, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 90
    .line 91
    if-ne v8, v9, :cond_0

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_0
    invoke-static {v7}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    :goto_1
    and-int/2addr v7, v5

    .line 99
    const v8, -0x78d9046

    .line 100
    .line 101
    .line 102
    if-ne v7, v8, :cond_1

    .line 103
    .line 104
    sub-int/2addr v2, p0

    .line 105
    goto :goto_2

    .line 106
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_2
    move v2, v6

    .line 110
    :goto_2
    if-ne v2, v6, :cond_3

    .line 111
    .line 112
    return v3

    .line 113
    :cond_3
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    add-int/2addr p0, v2

    .line 118
    add-int/lit8 p0, p0, 0x7

    .line 119
    .line 120
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    and-int/lit16 p0, p0, 0xff

    .line 125
    .line 126
    const/16 v0, 0xbb

    .line 127
    .line 128
    if-ne p0, v0, :cond_4

    .line 129
    .line 130
    move v3, v4

    .line 131
    :cond_4
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    add-int/2addr p0, v2

    .line 136
    if-eqz v3, :cond_5

    .line 137
    .line 138
    const/16 v0, 0x9

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_5
    const/16 v0, 0x8

    .line 142
    .line 143
    :goto_3
    add-int/2addr p0, v0

    .line 144
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    shr-int/lit8 p0, p0, 0x4

    .line 149
    .line 150
    and-int/lit8 p0, p0, 0x7

    .line 151
    .line 152
    const/16 p1, 0x28

    .line 153
    .line 154
    shl-int p0, p1, p0

    .line 155
    .line 156
    mul-int/2addr p0, v1

    .line 157
    return p0

    .line 158
    :pswitch_3
    const/16 p0, 0x800

    .line 159
    .line 160
    return p0

    .line 161
    :pswitch_4
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    sget v2, Lh1/i0;->a:I

    .line 166
    .line 167
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 176
    .line 177
    if-ne p1, v2, :cond_6

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_6
    invoke-static {p0}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 181
    .line 182
    .line 183
    move-result p0

    .line 184
    :goto_4
    const/high16 p1, -0x200000

    .line 185
    .line 186
    and-int v2, p0, p1

    .line 187
    .line 188
    if-ne v2, p1, :cond_7

    .line 189
    .line 190
    ushr-int/lit8 p1, p0, 0x13

    .line 191
    .line 192
    and-int/2addr p1, v0

    .line 193
    if-ne p1, v4, :cond_8

    .line 194
    .line 195
    :cond_7
    :goto_5
    move p0, v6

    .line 196
    goto :goto_6

    .line 197
    :cond_8
    ushr-int/lit8 v2, p0, 0x11

    .line 198
    .line 199
    and-int/2addr v2, v0

    .line 200
    if-nez v2, :cond_9

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_9
    ushr-int/lit8 v3, p0, 0xc

    .line 204
    .line 205
    const/16 v5, 0xf

    .line 206
    .line 207
    and-int/2addr v3, v5

    .line 208
    ushr-int/2addr p0, v7

    .line 209
    and-int/2addr p0, v0

    .line 210
    if-eqz v3, :cond_7

    .line 211
    .line 212
    if-eq v3, v5, :cond_7

    .line 213
    .line 214
    if-ne p0, v0, :cond_a

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_a
    const/16 p0, 0x480

    .line 218
    .line 219
    if-eq v2, v4, :cond_c

    .line 220
    .line 221
    if-eq v2, v1, :cond_e

    .line 222
    .line 223
    if-ne v2, v0, :cond_b

    .line 224
    .line 225
    const/16 p0, 0x180

    .line 226
    .line 227
    goto :goto_6

    .line 228
    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 229
    .line 230
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 231
    .line 232
    .line 233
    throw p0

    .line 234
    :cond_c
    if-ne p1, v0, :cond_d

    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_d
    const/16 p0, 0x240

    .line 238
    .line 239
    :cond_e
    :goto_6
    if-eq p0, v6, :cond_f

    .line 240
    .line 241
    return p0

    .line 242
    :cond_f
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 243
    .line 244
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 245
    .line 246
    .line 247
    throw p0

    .line 248
    :pswitch_5
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 249
    .line 250
    .line 251
    move-result p0

    .line 252
    add-int/2addr p0, v2

    .line 253
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 254
    .line 255
    .line 256
    move-result p0

    .line 257
    and-int/lit16 p0, p0, 0xf8

    .line 258
    .line 259
    shr-int/2addr p0, v0

    .line 260
    if-le p0, v7, :cond_11

    .line 261
    .line 262
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 263
    .line 264
    .line 265
    move-result p0

    .line 266
    add-int/lit8 p0, p0, 0x4

    .line 267
    .line 268
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 269
    .line 270
    .line 271
    move-result p0

    .line 272
    and-int/lit16 p0, p0, 0xc0

    .line 273
    .line 274
    shr-int/lit8 p0, p0, 0x6

    .line 275
    .line 276
    if-ne p0, v0, :cond_10

    .line 277
    .line 278
    goto :goto_7

    .line 279
    :cond_10
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 280
    .line 281
    .line 282
    move-result p0

    .line 283
    add-int/lit8 p0, p0, 0x4

    .line 284
    .line 285
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 286
    .line 287
    .line 288
    move-result p0

    .line 289
    and-int/lit8 p0, p0, 0x30

    .line 290
    .line 291
    shr-int/lit8 v0, p0, 0x4

    .line 292
    .line 293
    :goto_7
    sget-object p0, Ln1/b;->c:[I

    .line 294
    .line 295
    aget p0, p0, v0

    .line 296
    .line 297
    mul-int/lit16 p0, p0, 0x100

    .line 298
    .line 299
    return p0

    .line 300
    :cond_11
    const/16 p0, 0x600

    .line 301
    .line 302
    return p0

    .line 303
    :cond_12
    :pswitch_6
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 304
    .line 305
    .line 306
    move-result p0

    .line 307
    const v0, -0xde4bec0

    .line 308
    .line 309
    .line 310
    if-eq p0, v0, :cond_18

    .line 311
    .line 312
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 313
    .line 314
    .line 315
    move-result p0

    .line 316
    const v0, -0x17bd3b8f

    .line 317
    .line 318
    .line 319
    if-ne p0, v0, :cond_13

    .line 320
    .line 321
    goto :goto_c

    .line 322
    :cond_13
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 323
    .line 324
    .line 325
    move-result p0

    .line 326
    const v0, 0x25205864

    .line 327
    .line 328
    .line 329
    if-ne p0, v0, :cond_14

    .line 330
    .line 331
    const/16 p0, 0x1000

    .line 332
    .line 333
    return p0

    .line 334
    :cond_14
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 335
    .line 336
    .line 337
    move-result p0

    .line 338
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    if-eq v0, v5, :cond_17

    .line 343
    .line 344
    if-eq v0, v6, :cond_16

    .line 345
    .line 346
    const/16 v3, 0x1f

    .line 347
    .line 348
    if-eq v0, v3, :cond_15

    .line 349
    .line 350
    add-int/lit8 v0, p0, 0x4

    .line 351
    .line 352
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    and-int/2addr v0, v4

    .line 357
    shl-int/lit8 v0, v0, 0x6

    .line 358
    .line 359
    add-int/2addr p0, v2

    .line 360
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 361
    .line 362
    .line 363
    move-result p0

    .line 364
    :goto_8
    and-int/lit16 p0, p0, 0xfc

    .line 365
    .line 366
    :goto_9
    shr-int/2addr p0, v1

    .line 367
    or-int/2addr p0, v0

    .line 368
    goto :goto_b

    .line 369
    :cond_15
    add-int/lit8 v0, p0, 0x5

    .line 370
    .line 371
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 372
    .line 373
    .line 374
    move-result v0

    .line 375
    and-int/lit8 v0, v0, 0x7

    .line 376
    .line 377
    shl-int/lit8 v0, v0, 0x4

    .line 378
    .line 379
    add-int/lit8 p0, p0, 0x6

    .line 380
    .line 381
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 382
    .line 383
    .line 384
    move-result p0

    .line 385
    :goto_a
    and-int/lit8 p0, p0, 0x3c

    .line 386
    .line 387
    goto :goto_9

    .line 388
    :cond_16
    add-int/lit8 v0, p0, 0x4

    .line 389
    .line 390
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    and-int/lit8 v0, v0, 0x7

    .line 395
    .line 396
    shl-int/lit8 v0, v0, 0x4

    .line 397
    .line 398
    add-int/lit8 p0, p0, 0x7

    .line 399
    .line 400
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 401
    .line 402
    .line 403
    move-result p0

    .line 404
    goto :goto_a

    .line 405
    :cond_17
    add-int/lit8 v0, p0, 0x5

    .line 406
    .line 407
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    and-int/2addr v0, v4

    .line 412
    shl-int/lit8 v0, v0, 0x6

    .line 413
    .line 414
    add-int/lit8 p0, p0, 0x4

    .line 415
    .line 416
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 417
    .line 418
    .line 419
    move-result p0

    .line 420
    goto :goto_8

    .line 421
    :goto_b
    add-int/2addr p0, v4

    .line 422
    mul-int/lit8 p0, p0, 0x20

    .line 423
    .line 424
    return p0

    .line 425
    :cond_18
    :goto_c
    :pswitch_7
    const/16 p0, 0x400

    .line 426
    .line 427
    return p0

    .line 428
    :cond_19
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 429
    .line 430
    .line 431
    move-result p0

    .line 432
    and-int/2addr p0, v1

    .line 433
    if-nez p0, :cond_1a

    .line 434
    .line 435
    move v2, v3

    .line 436
    goto :goto_f

    .line 437
    :cond_1a
    const/16 p0, 0x1a

    .line 438
    .line 439
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 440
    .line 441
    .line 442
    move-result p0

    .line 443
    const/16 v0, 0x1c

    .line 444
    .line 445
    move v2, v0

    .line 446
    move v1, v3

    .line 447
    :goto_d
    if-ge v1, p0, :cond_1b

    .line 448
    .line 449
    add-int/lit8 v5, v1, 0x1b

    .line 450
    .line 451
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 452
    .line 453
    .line 454
    move-result v5

    .line 455
    add-int/2addr v2, v5

    .line 456
    add-int/lit8 v1, v1, 0x1

    .line 457
    .line 458
    goto :goto_d

    .line 459
    :cond_1b
    add-int/lit8 p0, v2, 0x1a

    .line 460
    .line 461
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 462
    .line 463
    .line 464
    move-result p0

    .line 465
    move v1, v3

    .line 466
    :goto_e
    if-ge v1, p0, :cond_1c

    .line 467
    .line 468
    add-int/lit8 v5, v2, 0x1b

    .line 469
    .line 470
    add-int/2addr v5, v1

    .line 471
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 472
    .line 473
    .line 474
    move-result v5

    .line 475
    add-int/2addr v0, v5

    .line 476
    add-int/lit8 v1, v1, 0x1

    .line 477
    .line 478
    goto :goto_e

    .line 479
    :cond_1c
    add-int/2addr v2, v0

    .line 480
    :goto_f
    add-int/lit8 p0, v2, 0x1a

    .line 481
    .line 482
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 483
    .line 484
    .line 485
    move-result p0

    .line 486
    add-int/lit8 p0, p0, 0x1b

    .line 487
    .line 488
    add-int/2addr p0, v2

    .line 489
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 490
    .line 491
    .line 492
    move-result v0

    .line 493
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 494
    .line 495
    .line 496
    move-result v1

    .line 497
    sub-int/2addr v1, p0

    .line 498
    if-le v1, v4, :cond_1d

    .line 499
    .line 500
    add-int/2addr p0, v4

    .line 501
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 502
    .line 503
    .line 504
    move-result v3

    .line 505
    :cond_1d
    invoke-static {v0, v3}, Ln1/b;->k(BB)J

    .line 506
    .line 507
    .line 508
    move-result-wide p0

    .line 509
    const-wide/32 v0, 0xbb80

    .line 510
    .line 511
    .line 512
    mul-long/2addr p0, v0

    .line 513
    const-wide/32 v0, 0xf4240

    .line 514
    .line 515
    .line 516
    div-long/2addr p0, v0

    .line 517
    long-to-int p0, p0

    .line 518
    return p0

    .line 519
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_5
        :pswitch_5
        :pswitch_6
        :pswitch_6
        :pswitch_4
        :pswitch_7
        :pswitch_3
        :pswitch_3
    .end packed-switch

    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    :pswitch_data_1
    .packed-switch 0xe
        :pswitch_2
        :pswitch_1
        :pswitch_7
        :pswitch_0
        :pswitch_5
    .end packed-switch
.end method

.method private getSubmittedFrames()J
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 2
    .line 3
    iget v1, v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->outputMode:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-wide v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->submittedPcmBytes:J

    .line 8
    .line 9
    iget v0, v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->inputPcmFrameSize:I

    .line 10
    .line 11
    int-to-long v3, v0

    .line 12
    div-long/2addr v1, v3

    .line 13
    return-wide v1

    .line 14
    :cond_0
    iget-wide v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->submittedEncodedFrames:J

    .line 15
    .line 16
    return-wide v0
.end method

.method private getWrittenFrames()J
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 2
    .line 3
    iget v1, v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->outputMode:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-wide v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->writtenPcmBytes:J

    .line 8
    .line 9
    iget v0, v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->outputPcmFrameSize:I

    .line 10
    .line 11
    int-to-long v3, v0

    .line 12
    sget v0, Lh1/i0;->a:I

    .line 13
    .line 14
    add-long/2addr v1, v3

    .line 15
    const-wide/16 v5, 0x1

    .line 16
    .line 17
    sub-long/2addr v1, v5

    .line 18
    div-long/2addr v1, v3

    .line 19
    return-wide v1

    .line 20
    :cond_0
    iget-wide v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->writtenEncodedFrames:J

    .line 21
    .line 22
    return-wide v0
.end method

.method private handleSkippedSilence(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->accumulatedSkippedSilenceDurationUs:J

    .line 2
    .line 3
    add-long/2addr v0, p1

    .line 4
    iput-wide v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->accumulatedSkippedSilenceDurationUs:J

    .line 5
    .line 6
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->reportSkippedSilenceHandler:Landroid/os/Handler;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    new-instance p1, Landroid/os/Handler;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->reportSkippedSilenceHandler:Landroid/os/Handler;

    .line 20
    .line 21
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->reportSkippedSilenceHandler:Landroid/os/Handler;

    .line 22
    .line 23
    const/4 p2, 0x0

    .line 24
    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->reportSkippedSilenceHandler:Landroid/os/Handler;

    .line 28
    .line 29
    new-instance p2, Landroidx/media3/exoplayer/audio/k;

    .line 30
    .line 31
    invoke-direct {p2, p0}, Landroidx/media3/exoplayer/audio/k;-><init>(Landroidx/media3/exoplayer/audio/DefaultAudioSink;)V

    .line 32
    .line 33
    .line 34
    const-wide/16 v0, 0x64

    .line 35
    .line 36
    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method private static hasPendingAudioTrackReleases()Z
    .locals 2

    .line 1
    sget-object v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->releaseExecutorLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->pendingReleaseCount:I

    .line 5
    .line 6
    if-lez v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    monitor-exit v0

    .line 12
    return v1

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw v1
.end method

.method private initializeAudioTrack()Z
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->initializationExceptionPendingExceptionHolder:Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;->shouldWaitBeforeRetry()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->buildAudioTrackWithRetry()Landroid/media/AudioTrack;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 16
    .line 17
    invoke-static {v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isOffloadedPlayback(Landroid/media/AudioTrack;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 24
    .line 25
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->registerStreamEventCallbackV29(Landroid/media/AudioTrack;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 29
    .line 30
    iget-boolean v2, v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->enableOffloadGapless:Z

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 35
    .line 36
    iget-object v0, v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->inputFormat:Landroidx/media3/common/w;

    .line 37
    .line 38
    iget v3, v0, Landroidx/media3/common/w;->F:I

    .line 39
    .line 40
    iget v0, v0, Landroidx/media3/common/w;->G:I

    .line 41
    .line 42
    invoke-virtual {v2, v3, v0}, Landroid/media/AudioTrack;->setOffloadDelayPadding(II)V

    .line 43
    .line 44
    .line 45
    :cond_1
    sget v0, Lh1/i0;->a:I

    .line 46
    .line 47
    const/16 v2, 0x1f

    .line 48
    .line 49
    if-lt v0, v2, :cond_2

    .line 50
    .line 51
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->playerId:Landroidx/media3/exoplayer/analytics/PlayerId;

    .line 52
    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    iget-object v3, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 56
    .line 57
    invoke-static {v3, v2}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Api31;->setLogSessionIdOnAudioTrack(Landroid/media/AudioTrack;Landroidx/media3/exoplayer/analytics/PlayerId;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 61
    .line 62
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    iput v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioSessionId:I

    .line 67
    .line 68
    iget-object v3, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrackPositionTracker:Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;

    .line 69
    .line 70
    iget-object v4, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 71
    .line 72
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 73
    .line 74
    iget v5, v2, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->outputMode:I

    .line 75
    .line 76
    const/4 v6, 0x2

    .line 77
    const/4 v9, 0x1

    .line 78
    if-ne v5, v6, :cond_3

    .line 79
    .line 80
    move v5, v9

    .line 81
    goto :goto_0

    .line 82
    :cond_3
    move v5, v1

    .line 83
    :goto_0
    iget v6, v2, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->outputEncoding:I

    .line 84
    .line 85
    iget v7, v2, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->outputPcmFrameSize:I

    .line 86
    .line 87
    iget v8, v2, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->bufferSize:I

    .line 88
    .line 89
    invoke-virtual/range {v3 .. v8}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->setAudioTrack(Landroid/media/AudioTrack;ZIII)V

    .line 90
    .line 91
    .line 92
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->setVolumeInternal()V

    .line 93
    .line 94
    .line 95
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->auxEffectInfo:Landroidx/media3/common/h;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->preferredDevice:Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;

    .line 101
    .line 102
    if-eqz v1, :cond_4

    .line 103
    .line 104
    const/16 v2, 0x17

    .line 105
    .line 106
    if-lt v0, v2, :cond_4

    .line 107
    .line 108
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 109
    .line 110
    invoke-static {v2, v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Api23;->setPreferredDeviceOnAudioTrack(Landroid/media/AudioTrack;Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;)V

    .line 111
    .line 112
    .line 113
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioCapabilitiesReceiver:Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;

    .line 114
    .line 115
    if-eqz v1, :cond_4

    .line 116
    .line 117
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->preferredDevice:Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;

    .line 118
    .line 119
    iget-object v2, v2, Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;->audioDeviceInfo:Landroid/media/AudioDeviceInfo;

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->setRoutedDevice(Landroid/media/AudioDeviceInfo;)V

    .line 122
    .line 123
    .line 124
    :cond_4
    const/16 v1, 0x18

    .line 125
    .line 126
    if-lt v0, v1, :cond_5

    .line 127
    .line 128
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioCapabilitiesReceiver:Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;

    .line 129
    .line 130
    if-eqz v0, :cond_5

    .line 131
    .line 132
    new-instance v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink$OnRoutingChangedListenerApi24;

    .line 133
    .line 134
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 135
    .line 136
    invoke-direct {v1, v2, v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$OnRoutingChangedListenerApi24;-><init>(Landroid/media/AudioTrack;Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;)V

    .line 137
    .line 138
    .line 139
    iput-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->onRoutingChangedListener:Landroidx/media3/exoplayer/audio/DefaultAudioSink$OnRoutingChangedListenerApi24;

    .line 140
    .line 141
    :cond_5
    iput-boolean v9, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->startMediaTimeUsNeedsInit:Z

    .line 142
    .line 143
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->listener:Landroidx/media3/exoplayer/audio/AudioSink$Listener;

    .line 144
    .line 145
    if-eqz v0, :cond_6

    .line 146
    .line 147
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 148
    .line 149
    invoke-virtual {v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->buildAudioTrackConfig()Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-interface {v0, v1}, Landroidx/media3/exoplayer/audio/AudioSink$Listener;->onAudioTrackInitialized(Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;)V

    .line 154
    .line 155
    .line 156
    :cond_6
    return v9
.end method

.method private static isAudioTrackDeadObject(I)Z
    .locals 2

    .line 1
    sget v0, Lh1/i0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x6

    .line 8
    if-eq p0, v0, :cond_1

    .line 9
    .line 10
    :cond_0
    const/16 v0, -0x20

    .line 11
    .line 12
    if-ne p0, v0, :cond_2

    .line 13
    .line 14
    :cond_1
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_2
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method private isAudioTrackInitialized()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method private static isOffloadedPlayback(Landroid/media/AudioTrack;)Z
    .locals 2

    .line 1
    sget v0, Lh1/i0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/media/AudioTrack;->isOffloadedPlayback()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method private static synthetic lambda$releaseAudioTrackAsync$0(Landroidx/media3/exoplayer/audio/AudioSink$Listener;Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Landroidx/media3/exoplayer/audio/AudioSink$Listener;->onAudioTrackReleased(Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$releaseAudioTrackAsync$1(Landroid/media/AudioTrack;Landroidx/media3/exoplayer/audio/AudioSink$Listener;Landroid/os/Handler;Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/media/AudioTrack;->flush()V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/media/AudioTrack;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Thread;->isAlive()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    new-instance p0, Landroidx/media3/exoplayer/audio/i;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {p0, p1, v1, p3}, Landroidx/media3/exoplayer/audio/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 31
    .line 32
    .line 33
    :cond_0
    sget-object p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->releaseExecutorLock:Ljava/lang/Object;

    .line 34
    .line 35
    monitor-enter p0

    .line 36
    :try_start_1
    sget p1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->pendingReleaseCount:I

    .line 37
    .line 38
    add-int/lit8 p1, p1, -0x1

    .line 39
    .line 40
    sput p1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->pendingReleaseCount:I

    .line 41
    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    sget-object p1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->releaseExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 47
    .line 48
    .line 49
    sput-object v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->releaseExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    :goto_0
    monitor-exit p0

    .line 55
    return-void

    .line 56
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    throw p1

    .line 58
    :catchall_1
    move-exception p0

    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    new-instance v1, Landroidx/media3/exoplayer/audio/i;

    .line 76
    .line 77
    const/4 v2, 0x1

    .line 78
    invoke-direct {v1, p1, v2, p3}, Landroidx/media3/exoplayer/audio/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 82
    .line 83
    .line 84
    :cond_2
    sget-object p1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->releaseExecutorLock:Ljava/lang/Object;

    .line 85
    .line 86
    monitor-enter p1

    .line 87
    :try_start_2
    sget p2, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->pendingReleaseCount:I

    .line 88
    .line 89
    add-int/lit8 p2, p2, -0x1

    .line 90
    .line 91
    sput p2, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->pendingReleaseCount:I

    .line 92
    .line 93
    if-nez p2, :cond_3

    .line 94
    .line 95
    sget-object p2, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->releaseExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 96
    .line 97
    invoke-interface {p2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 98
    .line 99
    .line 100
    sput-object v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->releaseExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :catchall_2
    move-exception p0

    .line 104
    goto :goto_3

    .line 105
    :cond_3
    :goto_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 106
    throw p0

    .line 107
    :goto_3
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 108
    throw p0
.end method

.method private maybeDisableOffload()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->outputModeIsOffload()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->offloadDisabledUntilNextConfiguration:Z

    .line 12
    .line 13
    return-void
.end method

.method private maybeRampUpVolume(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 2
    .line 3
    iget v0, v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->outputMode:I

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-wide/16 v0, 0x14

    .line 9
    .line 10
    invoke-static {v0, v1}, Lh1/i0;->S(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 15
    .line 16
    iget v0, v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->outputSampleRate:I

    .line 17
    .line 18
    int-to-long v4, v0

    .line 19
    const-wide/32 v6, 0xf4240

    .line 20
    .line 21
    .line 22
    sget-object v8, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 23
    .line 24
    invoke-static/range {v2 .. v8}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    long-to-int v0, v0

    .line 29
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->getWrittenFrames()J

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    int-to-long v3, v0

    .line 34
    cmp-long v3, v1, v3

    .line 35
    .line 36
    if-ltz v3, :cond_1

    .line 37
    .line 38
    :goto_0
    return-object p1

    .line 39
    :cond_1
    iget-object v3, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 40
    .line 41
    iget v4, v3, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->outputEncoding:I

    .line 42
    .line 43
    iget v3, v3, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->outputPcmFrameSize:I

    .line 44
    .line 45
    long-to-int v1, v1

    .line 46
    invoke-static {p1, v4, v3, v1, v0}, Landroidx/media3/exoplayer/audio/PcmAudioUtil;->rampUpVolume(Ljava/nio/ByteBuffer;IIII)Ljava/nio/ByteBuffer;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1
.end method

.method private maybeReportSkippedSilence()V
    .locals 4

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->accumulatedSkippedSilenceDurationUs:J

    .line 2
    .line 3
    const-wide/32 v2, 0x493e0

    .line 4
    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-ltz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->listener:Landroidx/media3/exoplayer/audio/AudioSink$Listener;

    .line 11
    .line 12
    invoke-interface {v0}, Landroidx/media3/exoplayer/audio/AudioSink$Listener;->onSilenceSkipped()V

    .line 13
    .line 14
    .line 15
    const-wide/16 v0, 0x0

    .line 16
    .line 17
    iput-wide v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->accumulatedSkippedSilenceDurationUs:J

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method private maybeStartAudioCapabilitiesReceiver()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioCapabilitiesReceiver:Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->context:Landroid/content/Context;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->playbackLooper:Landroid/os/Looper;

    .line 14
    .line 15
    new-instance v0, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;

    .line 16
    .line 17
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->context:Landroid/content/Context;

    .line 18
    .line 19
    new-instance v2, Landroidx/media3/exoplayer/audio/l;

    .line 20
    .line 21
    invoke-direct {v2, p0}, Landroidx/media3/exoplayer/audio/l;-><init>(Landroidx/media3/exoplayer/audio/DefaultAudioSink;)V

    .line 22
    .line 23
    .line 24
    iget-object v3, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioAttributes:Landroidx/media3/common/g;

    .line 25
    .line 26
    iget-object v4, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->preferredDevice:Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;

    .line 27
    .line 28
    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;-><init>(Landroid/content/Context;Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver$Listener;Landroidx/media3/common/g;Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioCapabilitiesReceiver:Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->register()Landroidx/media3/exoplayer/audio/AudioCapabilities;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioCapabilities:Landroidx/media3/exoplayer/audio/AudioCapabilities;

    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method private playPendingData()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->stoppedAudioTrack:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->stoppedAudioTrack:Z

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrackPositionTracker:Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;

    .line 9
    .line 10
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->getWrittenFrames()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    invoke-virtual {v0, v1, v2}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->handleEndOfStream(J)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 18
    .line 19
    invoke-static {v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isOffloadedPlayback(Landroid/media/AudioTrack;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iput-boolean v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->handledOffloadOnPresentationEnded:Z

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    .line 31
    .line 32
    .line 33
    iput v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->bytesUntilNextAvSync:I

    .line 34
    .line 35
    :cond_1
    return-void
.end method

.method private processBuffers(J)V
    .locals 3

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->drainOutputBuffer(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->outputBuffer:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_2

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioProcessingPipeline:Landroidx/media3/common/audio/a;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/media3/common/audio/a;->c()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->inputBuffer:Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    if-eqz v0, :cond_8

    .line 21
    .line 22
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->setOutputBuffer(Ljava/nio/ByteBuffer;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->drainOutputBuffer(J)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioProcessingPipeline:Landroidx/media3/common/audio/a;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/media3/common/audio/a;->b()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_8

    .line 36
    .line 37
    :cond_2
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioProcessingPipeline:Landroidx/media3/common/audio/a;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/media3/common/audio/a;->c()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_3

    .line 44
    .line 45
    sget-object v0, Landroidx/media3/common/audio/d;->a:Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    iget-object v1, v0, Landroidx/media3/common/audio/a;->c:[Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroidx/media3/common/audio/a;->a()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    aget-object v1, v1, v2

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    move-object v0, v1

    .line 63
    goto :goto_1

    .line 64
    :cond_4
    sget-object v1, Landroidx/media3/common/audio/d;->a:Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Landroidx/media3/common/audio/a;->d(Ljava/nio/ByteBuffer;)V

    .line 67
    .line 68
    .line 69
    iget-object v1, v0, Landroidx/media3/common/audio/a;->c:[Ljava/nio/ByteBuffer;

    .line 70
    .line 71
    invoke-virtual {v0}, Landroidx/media3/common/audio/a;->a()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    aget-object v0, v1, v0

    .line 76
    .line 77
    :goto_1
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_5

    .line 82
    .line 83
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->setOutputBuffer(Ljava/nio/ByteBuffer;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->drainOutputBuffer(J)V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->outputBuffer:Ljava/nio/ByteBuffer;

    .line 90
    .line 91
    if-eqz v0, :cond_2

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_5
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->inputBuffer:Ljava/nio/ByteBuffer;

    .line 95
    .line 96
    if-eqz v0, :cond_8

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_6

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_6
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioProcessingPipeline:Landroidx/media3/common/audio/a;

    .line 106
    .line 107
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->inputBuffer:Ljava/nio/ByteBuffer;

    .line 108
    .line 109
    invoke-virtual {v0}, Landroidx/media3/common/audio/a;->c()Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_1

    .line 114
    .line 115
    iget-boolean v2, v0, Landroidx/media3/common/audio/a;->d:Z

    .line 116
    .line 117
    if-eqz v2, :cond_7

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_7
    invoke-virtual {v0, v1}, Landroidx/media3/common/audio/a;->d(Ljava/nio/ByteBuffer;)V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_8
    :goto_2
    return-void
.end method

.method private registerStreamEventCallbackV29(Landroid/media/AudioTrack;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->offloadStreamEventCallbackV29:Landroidx/media3/exoplayer/audio/DefaultAudioSink$StreamEventCallbackV29;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$StreamEventCallbackV29;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$StreamEventCallbackV29;-><init>(Landroidx/media3/exoplayer/audio/DefaultAudioSink;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->offloadStreamEventCallbackV29:Landroidx/media3/exoplayer/audio/DefaultAudioSink$StreamEventCallbackV29;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->offloadStreamEventCallbackV29:Landroidx/media3/exoplayer/audio/DefaultAudioSink$StreamEventCallbackV29;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$StreamEventCallbackV29;->register(Landroid/media/AudioTrack;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private static releaseAudioTrackAsync(Landroid/media/AudioTrack;Landroidx/media3/exoplayer/audio/AudioSink$Listener;Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;)V
    .locals 8

    .line 1
    new-instance v3, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {v3, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sget-object v6, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->releaseExecutorLock:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v6

    .line 13
    :try_start_0
    sget-object v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->releaseExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    sget v0, Lh1/i0;->a:I

    .line 18
    .line 19
    new-instance v0, Lh1/g0;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->releaseExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    move-object p0, v0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    sget v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->pendingReleaseCount:I

    .line 35
    .line 36
    add-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    sput v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->pendingReleaseCount:I

    .line 39
    .line 40
    sget-object v7, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->releaseExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 41
    .line 42
    new-instance v0, Landroidx/media3/exoplayer/audio/j;

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    move-object v1, p0

    .line 46
    move-object v2, p1

    .line 47
    move-object v4, p2

    .line 48
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/audio/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    sget-object p0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 52
    .line 53
    const-wide/16 p1, 0x14

    .line 54
    .line 55
    invoke-interface {v7, v0, p1, p2, p0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 56
    .line 57
    .line 58
    monitor-exit v6

    .line 59
    return-void

    .line 60
    :goto_1
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    throw p0
.end method

.method private resetSinkStateForFlush()V
    .locals 10

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->submittedPcmBytes:J

    .line 4
    .line 5
    iput-wide v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->submittedEncodedFrames:J

    .line 6
    .line 7
    iput-wide v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->writtenPcmBytes:J

    .line 8
    .line 9
    iput-wide v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->writtenEncodedFrames:J

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iput-boolean v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isWaitingForOffloadEndOfStreamHandled:Z

    .line 13
    .line 14
    iput v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->framesPerEncodedSample:I

    .line 15
    .line 16
    new-instance v3, Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;

    .line 17
    .line 18
    iget-object v4, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->playbackParameters:Landroidx/media3/common/y0;

    .line 19
    .line 20
    const-wide/16 v7, 0x0

    .line 21
    .line 22
    const/4 v9, 0x0

    .line 23
    const-wide/16 v5, 0x0

    .line 24
    .line 25
    invoke-direct/range {v3 .. v9}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;-><init>(Landroidx/media3/common/y0;JJLandroidx/media3/exoplayer/audio/DefaultAudioSink$1;)V

    .line 26
    .line 27
    .line 28
    iput-object v3, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->mediaPositionParameters:Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;

    .line 29
    .line 30
    iput-wide v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->startMediaTimeUs:J

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->afterDrainParameters:Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;

    .line 34
    .line 35
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->mediaPositionParametersCheckpoints:Ljava/util/ArrayDeque;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->inputBuffer:Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    iput v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->inputBufferAccessUnitCount:I

    .line 43
    .line 44
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->outputBuffer:Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    iput-boolean v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->stoppedAudioTrack:Z

    .line 47
    .line 48
    iput-boolean v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->handledEndOfStream:Z

    .line 49
    .line 50
    iput-boolean v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->handledOffloadOnPresentationEnded:Z

    .line 51
    .line 52
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->avSyncHeader:Ljava/nio/ByteBuffer;

    .line 53
    .line 54
    iput v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->bytesUntilNextAvSync:I

    .line 55
    .line 56
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->trimmingAudioProcessor:Landroidx/media3/exoplayer/audio/TrimmingAudioProcessor;

    .line 57
    .line 58
    invoke-virtual {v0}, Landroidx/media3/exoplayer/audio/TrimmingAudioProcessor;->resetTrimmedFrameCount()V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->setupAudioProcessors()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method private setAudioProcessorPlaybackParameters(Landroidx/media3/common/y0;)V
    .locals 7

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;

    .line 2
    .line 3
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/4 v6, 0x0

    .line 9
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    move-object v1, p1

    .line 15
    invoke-direct/range {v0 .. v6}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;-><init>(Landroidx/media3/common/y0;JJLandroidx/media3/exoplayer/audio/DefaultAudioSink$1;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isAudioTrackInitialized()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->afterDrainParameters:Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->mediaPositionParameters:Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;

    .line 28
    .line 29
    return-void
.end method

.method private setAudioTrackPlaybackParametersV23()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isAudioTrackInitialized()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/media/PlaybackParams;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/media/PlaybackParams;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/media/PlaybackParams;->allowDefaults()Landroid/media/PlaybackParams;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->playbackParameters:Landroidx/media3/common/y0;

    .line 17
    .line 18
    iget v1, v1, Landroidx/media3/common/y0;->a:F

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setSpeed(F)Landroid/media/PlaybackParams;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->playbackParameters:Landroidx/media3/common/y0;

    .line 25
    .line 26
    iget v1, v1, Landroidx/media3/common/y0;->b:F

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setPitch(F)Landroid/media/PlaybackParams;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v1, 0x2

    .line 33
    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setAudioFallbackMode(I)Landroid/media/PlaybackParams;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :try_start_0
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Landroid/media/AudioTrack;->setPlaybackParams(Landroid/media/PlaybackParams;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception v0

    .line 44
    const-string v1, "DefaultAudioSink"

    .line 45
    .line 46
    const-string v2, "Failed to set playback params"

    .line 47
    .line 48
    invoke-static {v1, v2, v0}, Lh1/a;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    new-instance v0, Landroidx/media3/common/y0;

    .line 52
    .line 53
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Landroid/media/PlaybackParams;->getSpeed()F

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 64
    .line 65
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2}, Landroid/media/PlaybackParams;->getPitch()F

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    invoke-direct {v0, v1, v2}, Landroidx/media3/common/y0;-><init>(FF)V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->playbackParameters:Landroidx/media3/common/y0;

    .line 77
    .line 78
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrackPositionTracker:Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;

    .line 79
    .line 80
    iget v0, v0, Landroidx/media3/common/y0;->a:F

    .line 81
    .line 82
    invoke-virtual {v1, v0}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->setAudioTrackPlaybackSpeed(F)V

    .line 83
    .line 84
    .line 85
    :cond_0
    return-void
.end method

.method private setOutputBuffer(Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->outputBuffer:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->maybeRampUpVolume(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->outputBuffer:Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    return-void
.end method

.method private setVolumeInternal()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isAudioTrackInitialized()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 8
    .line 9
    iget v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->volume:F

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/media/AudioTrack;->setVolume(F)I

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method private setupAudioProcessors()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->audioProcessingPipeline:Landroidx/media3/common/audio/a;

    .line 4
    .line 5
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioProcessingPipeline:Landroidx/media3/common/audio/a;

    .line 6
    .line 7
    iget-object v1, v0, Landroidx/media3/common/audio/a;->a:Lf6/m0;

    .line 8
    .line 9
    iget-object v2, v0, Landroidx/media3/common/audio/a;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    iput-boolean v3, v0, Landroidx/media3/common/audio/a;->d:Z

    .line 16
    .line 17
    move v4, v3

    .line 18
    :goto_0
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-ge v4, v5, :cond_1

    .line 23
    .line 24
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    check-cast v5, Landroidx/media3/common/audio/d;

    .line 29
    .line 30
    invoke-interface {v5}, Landroidx/media3/common/audio/d;->flush()V

    .line 31
    .line 32
    .line 33
    invoke-interface {v5}, Landroidx/media3/common/audio/d;->isActive()Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_0

    .line 38
    .line 39
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    new-array v1, v1, [Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    iput-object v1, v0, Landroidx/media3/common/audio/a;->c:[Ljava/nio/ByteBuffer;

    .line 52
    .line 53
    :goto_1
    invoke-virtual {v0}, Landroidx/media3/common/audio/a;->a()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-gt v3, v1, :cond_2

    .line 58
    .line 59
    iget-object v1, v0, Landroidx/media3/common/audio/a;->c:[Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Landroidx/media3/common/audio/d;

    .line 66
    .line 67
    invoke-interface {v4}, Landroidx/media3/common/audio/d;->getOutput()Ljava/nio/ByteBuffer;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    aput-object v4, v1, v3

    .line 72
    .line 73
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    return-void
.end method

.method private shouldApplyAudioProcessorPlaybackParameters()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->tunneling:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 6
    .line 7
    iget v1, v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->outputMode:I

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->inputFormat:Landroidx/media3/common/w;

    .line 12
    .line 13
    iget v0, v0, Landroidx/media3/common/w;->E:I

    .line 14
    .line 15
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->shouldUseFloatOutput(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method private shouldUseFloatOutput(I)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->enableFloatOutput:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget v0, Lh1/i0;->a:I

    .line 6
    .line 7
    const/16 v0, 0x15

    .line 8
    .line 9
    if-eq p1, v0, :cond_0

    .line 10
    .line 11
    const/high16 v0, 0x50000000

    .line 12
    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    const/16 v0, 0x16

    .line 16
    .line 17
    if-eq p1, v0, :cond_0

    .line 18
    .line 19
    const/high16 v0, 0x60000000

    .line 20
    .line 21
    if-eq p1, v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x4

    .line 24
    if-ne p1, v0, :cond_1

    .line 25
    .line 26
    :cond_0
    const/4 p1, 0x1

    .line 27
    return p1

    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    return p1
.end method

.method private useAudioTrackPlaybackParams()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->enableAudioTrackPlaybackParams:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget v0, Lh1/i0;->a:I

    .line 10
    .line 11
    const/16 v1, 0x17

    .line 12
    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method private static writeNonBlocking(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
.end method

.method private writeNonBlockingWithAvSync(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;IJ)I
    .locals 10

    .line 1
    sget v0, Lh1/i0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const-wide/16 v2, 0x3e8

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v7, 0x1

    .line 10
    mul-long v8, p4, v2

    .line 11
    .line 12
    move-object v4, p1

    .line 13
    move-object v5, p2

    .line 14
    move v6, p3

    .line 15
    invoke-virtual/range {v4 .. v9}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;IIJ)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_0
    move-object v4, p1

    .line 21
    move-object v5, p2

    .line 22
    move v6, p3

    .line 23
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->avSyncHeader:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    const/16 p1, 0x10

    .line 28
    .line 29
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->avSyncHeader:Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    sget-object p2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->avSyncHeader:Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    const p2, 0x55550001

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    .line 48
    :cond_1
    iget p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->bytesUntilNextAvSync:I

    .line 49
    .line 50
    const/4 p2, 0x0

    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->avSyncHeader:Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    const/4 p3, 0x4

    .line 56
    invoke-virtual {p1, p3, v6}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->avSyncHeader:Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    const/16 p3, 0x8

    .line 62
    .line 63
    mul-long/2addr p4, v2

    .line 64
    invoke-virtual {p1, p3, p4, p5}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->avSyncHeader:Ljava/nio/ByteBuffer;

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 70
    .line 71
    .line 72
    iput v6, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->bytesUntilNextAvSync:I

    .line 73
    .line 74
    :cond_2
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->avSyncHeader:Ljava/nio/ByteBuffer;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-lez p1, :cond_4

    .line 81
    .line 82
    iget-object p3, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->avSyncHeader:Ljava/nio/ByteBuffer;

    .line 83
    .line 84
    const/4 p4, 0x1

    .line 85
    invoke-virtual {v4, p3, p1, p4}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 86
    .line 87
    .line 88
    move-result p3

    .line 89
    if-gez p3, :cond_3

    .line 90
    .line 91
    iput p2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->bytesUntilNextAvSync:I

    .line 92
    .line 93
    return p3

    .line 94
    :cond_3
    if-ge p3, p1, :cond_4

    .line 95
    .line 96
    return p2

    .line 97
    :cond_4
    invoke-static {v4, v5, v6}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->writeNonBlocking(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-gez p1, :cond_5

    .line 102
    .line 103
    iput p2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->bytesUntilNextAvSync:I

    .line 104
    .line 105
    return p1

    .line 106
    :cond_5
    iget p2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->bytesUntilNextAvSync:I

    .line 107
    .line 108
    sub-int/2addr p2, p1

    .line 109
    iput p2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->bytesUntilNextAvSync:I

    .line 110
    .line 111
    return p1
.end method


# virtual methods
.method public configure(Landroidx/media3/common/w;I[I)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    invoke-direct {v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->maybeStartAudioCapabilitiesReceiver()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v3, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 9
    .line 10
    iget v2, v3, Landroidx/media3/common/w;->D:I

    .line 11
    .line 12
    iget v4, v3, Landroidx/media3/common/w;->C:I

    .line 13
    .line 14
    iget v5, v3, Landroidx/media3/common/w;->E:I

    .line 15
    .line 16
    const-string v6, "audio/raw"

    .line 17
    .line 18
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    const/4 v7, 0x1

    .line 23
    const/4 v8, -0x1

    .line 24
    const/4 v9, 0x0

    .line 25
    if-eqz v6, :cond_5

    .line 26
    .line 27
    invoke-static {v5}, Lh1/i0;->N(I)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    invoke-static {v6}, Lh1/a;->d(Z)V

    .line 32
    .line 33
    .line 34
    invoke-static {v5, v4}, Lh1/i0;->E(II)I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    new-instance v10, Lf6/j0;

    .line 39
    .line 40
    const/4 v11, 0x4

    .line 41
    invoke-direct {v10, v11}, Lf6/g0;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v1, v5}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->shouldUseFloatOutput(I)Z

    .line 45
    .line 46
    .line 47
    move-result v11

    .line 48
    if-eqz v11, :cond_0

    .line 49
    .line 50
    iget-object v11, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->toFloatPcmAvailableAudioProcessors:Lf6/m0;

    .line 51
    .line 52
    invoke-virtual {v10, v11}, Lf6/g0;->c(Ljava/lang/Iterable;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    iget-object v11, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->toIntPcmAvailableAudioProcessors:Lf6/m0;

    .line 57
    .line 58
    invoke-virtual {v10, v11}, Lf6/g0;->c(Ljava/lang/Iterable;)V

    .line 59
    .line 60
    .line 61
    iget-object v11, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioProcessorChain:Landroidx/media3/common/audio/e;

    .line 62
    .line 63
    invoke-interface {v11}, Landroidx/media3/common/audio/e;->getAudioProcessors()[Landroidx/media3/common/audio/d;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    array-length v12, v11

    .line 68
    invoke-static {v12, v11}, Lf6/u;->b(I[Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v10, v12}, Lf6/g0;->d(I)V

    .line 72
    .line 73
    .line 74
    iget-object v13, v10, Lf6/g0;->a:[Ljava/lang/Object;

    .line 75
    .line 76
    iget v14, v10, Lf6/g0;->b:I

    .line 77
    .line 78
    invoke-static {v11, v9, v13, v14, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 79
    .line 80
    .line 81
    iget v11, v10, Lf6/g0;->b:I

    .line 82
    .line 83
    add-int/2addr v11, v12

    .line 84
    iput v11, v10, Lf6/g0;->b:I

    .line 85
    .line 86
    :goto_0
    new-instance v11, Landroidx/media3/common/audio/a;

    .line 87
    .line 88
    invoke-virtual {v10}, Lf6/j0;->f()Lf6/l1;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    invoke-direct {v11, v10}, Landroidx/media3/common/audio/a;-><init>(Lf6/m0;)V

    .line 93
    .line 94
    .line 95
    iget-object v10, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioProcessingPipeline:Landroidx/media3/common/audio/a;

    .line 96
    .line 97
    invoke-virtual {v11, v10}, Landroidx/media3/common/audio/a;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    if-eqz v10, :cond_1

    .line 102
    .line 103
    iget-object v11, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioProcessingPipeline:Landroidx/media3/common/audio/a;

    .line 104
    .line 105
    :cond_1
    iget-object v10, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->trimmingAudioProcessor:Landroidx/media3/exoplayer/audio/TrimmingAudioProcessor;

    .line 106
    .line 107
    iget v12, v3, Landroidx/media3/common/w;->F:I

    .line 108
    .line 109
    iget v13, v3, Landroidx/media3/common/w;->G:I

    .line 110
    .line 111
    invoke-virtual {v10, v12, v13}, Landroidx/media3/exoplayer/audio/TrimmingAudioProcessor;->setTrimFrameCount(II)V

    .line 112
    .line 113
    .line 114
    iget-object v10, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->channelMappingAudioProcessor:Landroidx/media3/exoplayer/audio/ChannelMappingAudioProcessor;

    .line 115
    .line 116
    move-object/from16 v12, p3

    .line 117
    .line 118
    invoke-virtual {v10, v12}, Landroidx/media3/exoplayer/audio/ChannelMappingAudioProcessor;->setChannelMap([I)V

    .line 119
    .line 120
    .line 121
    new-instance v10, Landroidx/media3/common/audio/b;

    .line 122
    .line 123
    invoke-direct {v10, v2, v4, v5}, Landroidx/media3/common/audio/b;-><init>(III)V

    .line 124
    .line 125
    .line 126
    :try_start_0
    iget-object v2, v11, Landroidx/media3/common/audio/a;->a:Lf6/m0;

    .line 127
    .line 128
    sget-object v4, Landroidx/media3/common/audio/b;->e:Landroidx/media3/common/audio/b;

    .line 129
    .line 130
    invoke-virtual {v10, v4}, Landroidx/media3/common/audio/b;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-nez v4, :cond_4

    .line 135
    .line 136
    const/4 v4, 0x0

    .line 137
    :goto_1
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-ge v4, v5, :cond_3

    .line 142
    .line 143
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    check-cast v5, Landroidx/media3/common/audio/d;

    .line 148
    .line 149
    invoke-interface {v5, v10}, Landroidx/media3/common/audio/d;->configure(Landroidx/media3/common/audio/b;)Landroidx/media3/common/audio/b;

    .line 150
    .line 151
    .line 152
    move-result-object v12

    .line 153
    invoke-interface {v5}, Landroidx/media3/common/audio/d;->isActive()Z

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    if-eqz v5, :cond_2

    .line 158
    .line 159
    sget-object v5, Landroidx/media3/common/audio/b;->e:Landroidx/media3/common/audio/b;

    .line 160
    .line 161
    invoke-virtual {v12, v5}, Landroidx/media3/common/audio/b;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    xor-int/lit8 v5, v5, 0x1

    .line 166
    .line 167
    invoke-static {v5}, Lh1/a;->j(Z)V
    :try_end_0
    .catch Landroidx/media3/common/audio/c; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    .line 169
    .line 170
    move-object v10, v12

    .line 171
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_3
    iget v2, v10, Landroidx/media3/common/audio/b;->b:I

    .line 175
    .line 176
    iget v4, v10, Landroidx/media3/common/audio/b;->c:I

    .line 177
    .line 178
    iget v5, v10, Landroidx/media3/common/audio/b;->a:I

    .line 179
    .line 180
    invoke-static {v2}, Lh1/i0;->u(I)I

    .line 181
    .line 182
    .line 183
    move-result v10

    .line 184
    invoke-static {v4, v2}, Lh1/i0;->E(II)I

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    iget-boolean v12, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->preferAudioTrackPlaybackParams:Z

    .line 189
    .line 190
    move v15, v6

    .line 191
    move v6, v2

    .line 192
    move v2, v5

    .line 193
    move v5, v15

    .line 194
    move v15, v4

    .line 195
    move v4, v9

    .line 196
    move/from16 v16, v4

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_4
    :try_start_1
    new-instance v0, Landroidx/media3/common/audio/c;

    .line 200
    .line 201
    invoke-direct {v0, v10}, Landroidx/media3/common/audio/c;-><init>(Landroidx/media3/common/audio/b;)V

    .line 202
    .line 203
    .line 204
    throw v0
    :try_end_1
    .catch Landroidx/media3/common/audio/c; {:try_start_1 .. :try_end_1} :catch_0

    .line 205
    :catch_0
    move-exception v0

    .line 206
    new-instance v2, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;

    .line 207
    .line 208
    invoke-direct {v2, v0, v3}, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;-><init>(Ljava/lang/Throwable;Landroidx/media3/common/w;)V

    .line 209
    .line 210
    .line 211
    throw v2

    .line 212
    :cond_5
    new-instance v11, Landroidx/media3/common/audio/a;

    .line 213
    .line 214
    sget-object v5, Lf6/l1;->n:Lf6/l1;

    .line 215
    .line 216
    invoke-direct {v11, v5}, Landroidx/media3/common/audio/a;-><init>(Lf6/m0;)V

    .line 217
    .line 218
    .line 219
    iget v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->offloadMode:I

    .line 220
    .line 221
    if-eqz v5, :cond_6

    .line 222
    .line 223
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->getFormatOffloadSupport(Landroidx/media3/common/w;)Landroidx/media3/exoplayer/audio/AudioOffloadSupport;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    goto :goto_2

    .line 228
    :cond_6
    sget-object v5, Landroidx/media3/exoplayer/audio/AudioOffloadSupport;->DEFAULT_UNSUPPORTED:Landroidx/media3/exoplayer/audio/AudioOffloadSupport;

    .line 229
    .line 230
    :goto_2
    iget v6, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->offloadMode:I

    .line 231
    .line 232
    if-eqz v6, :cond_7

    .line 233
    .line 234
    iget-boolean v6, v5, Landroidx/media3/exoplayer/audio/AudioOffloadSupport;->isFormatSupported:Z

    .line 235
    .line 236
    if-eqz v6, :cond_7

    .line 237
    .line 238
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    iget-object v6, v3, Landroidx/media3/common/w;->k:Ljava/lang/String;

    .line 242
    .line 243
    invoke-static {v0, v6}, Landroidx/media3/common/u0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 244
    .line 245
    .line 246
    move-result v6

    .line 247
    invoke-static {v4}, Lh1/i0;->u(I)I

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    iget-boolean v4, v5, Landroidx/media3/exoplayer/audio/AudioOffloadSupport;->isGaplessSupported:Z

    .line 252
    .line 253
    move v15, v6

    .line 254
    move v12, v7

    .line 255
    move/from16 v16, v12

    .line 256
    .line 257
    move v5, v8

    .line 258
    move v6, v5

    .line 259
    goto :goto_3

    .line 260
    :cond_7
    iget-object v4, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioCapabilities:Landroidx/media3/exoplayer/audio/AudioCapabilities;

    .line 261
    .line 262
    iget-object v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioAttributes:Landroidx/media3/common/g;

    .line 263
    .line 264
    invoke-virtual {v4, v3, v5}, Landroidx/media3/exoplayer/audio/AudioCapabilities;->getEncodingAndChannelConfigForPassthrough(Landroidx/media3/common/w;Landroidx/media3/common/g;)Landroid/util/Pair;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    if-eqz v4, :cond_f

    .line 269
    .line 270
    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v5, Ljava/lang/Integer;

    .line 273
    .line 274
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v4, Ljava/lang/Integer;

    .line 281
    .line 282
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 283
    .line 284
    .line 285
    move-result v10

    .line 286
    iget-boolean v12, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->preferAudioTrackPlaybackParams:Z

    .line 287
    .line 288
    const/4 v4, 0x2

    .line 289
    move/from16 v16, v4

    .line 290
    .line 291
    move v15, v5

    .line 292
    move v5, v8

    .line 293
    move v6, v5

    .line 294
    move v4, v9

    .line 295
    :goto_3
    const-string v13, ") for: "

    .line 296
    .line 297
    if-eqz v15, :cond_e

    .line 298
    .line 299
    if-eqz v10, :cond_d

    .line 300
    .line 301
    iget v13, v3, Landroidx/media3/common/w;->j:I

    .line 302
    .line 303
    const-string v14, "audio/vnd.dts.hd;profile=lbr"

    .line 304
    .line 305
    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    if-eqz v0, :cond_8

    .line 310
    .line 311
    if-ne v13, v8, :cond_8

    .line 312
    .line 313
    const v13, 0xbb800

    .line 314
    .line 315
    .line 316
    :cond_8
    move/from16 v19, v13

    .line 317
    .line 318
    if-eqz p2, :cond_9

    .line 319
    .line 320
    move/from16 v0, p2

    .line 321
    .line 322
    move/from16 v18, v2

    .line 323
    .line 324
    goto :goto_7

    .line 325
    :cond_9
    iget-object v13, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrackBufferSizeProvider:Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioTrackBufferSizeProvider;

    .line 326
    .line 327
    invoke-static {v2, v10, v15}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->getAudioTrackMinBufferSize(III)I

    .line 328
    .line 329
    .line 330
    move-result v14

    .line 331
    if-eq v6, v8, :cond_a

    .line 332
    .line 333
    move/from16 v17, v6

    .line 334
    .line 335
    goto :goto_4

    .line 336
    :cond_a
    move/from16 v17, v7

    .line 337
    .line 338
    :goto_4
    if-eqz v12, :cond_b

    .line 339
    .line 340
    const-wide/high16 v7, 0x4020000000000000L    # 8.0

    .line 341
    .line 342
    :goto_5
    move/from16 v18, v2

    .line 343
    .line 344
    move-wide/from16 v20, v7

    .line 345
    .line 346
    goto :goto_6

    .line 347
    :cond_b
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 348
    .line 349
    goto :goto_5

    .line 350
    :goto_6
    invoke-interface/range {v13 .. v21}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioTrackBufferSizeProvider;->getBufferSizeInBytes(IIIIIID)I

    .line 351
    .line 352
    .line 353
    move-result v0

    .line 354
    :goto_7
    iput-boolean v9, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->offloadDisabledUntilNextConfiguration:Z

    .line 355
    .line 356
    new-instance v2, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 357
    .line 358
    iget-boolean v14, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->tunneling:Z

    .line 359
    .line 360
    move v13, v4

    .line 361
    move v4, v5

    .line 362
    move v8, v10

    .line 363
    move v9, v15

    .line 364
    move/from16 v5, v16

    .line 365
    .line 366
    move/from16 v7, v18

    .line 367
    .line 368
    move v10, v0

    .line 369
    invoke-direct/range {v2 .. v14}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;-><init>(Landroidx/media3/common/w;IIIIIIILandroidx/media3/common/audio/a;ZZZ)V

    .line 370
    .line 371
    .line 372
    invoke-direct {v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isAudioTrackInitialized()Z

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    if-eqz v0, :cond_c

    .line 377
    .line 378
    iput-object v2, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->pendingConfiguration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 379
    .line 380
    return-void

    .line 381
    :cond_c
    iput-object v2, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 382
    .line 383
    return-void

    .line 384
    :cond_d
    move/from16 v5, v16

    .line 385
    .line 386
    new-instance v0, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;

    .line 387
    .line 388
    new-instance v2, Ljava/lang/StringBuilder;

    .line 389
    .line 390
    const-string v4, "Invalid output channel config (mode="

    .line 391
    .line 392
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    invoke-direct {v0, v2, v3}, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;-><init>(Ljava/lang/String;Landroidx/media3/common/w;)V

    .line 409
    .line 410
    .line 411
    throw v0

    .line 412
    :cond_e
    move/from16 v5, v16

    .line 413
    .line 414
    new-instance v0, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;

    .line 415
    .line 416
    new-instance v2, Ljava/lang/StringBuilder;

    .line 417
    .line 418
    const-string v4, "Invalid output encoding (mode="

    .line 419
    .line 420
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    invoke-direct {v0, v2, v3}, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;-><init>(Ljava/lang/String;Landroidx/media3/common/w;)V

    .line 437
    .line 438
    .line 439
    throw v0

    .line 440
    :cond_f
    new-instance v0, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;

    .line 441
    .line 442
    new-instance v2, Ljava/lang/StringBuilder;

    .line 443
    .line 444
    const-string v4, "Unable to configure passthrough for: "

    .line 445
    .line 446
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    invoke-direct {v0, v2, v3}, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;-><init>(Ljava/lang/String;Landroidx/media3/common/w;)V

    .line 457
    .line 458
    .line 459
    throw v0
.end method

.method public disableTunneling()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->tunneling:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->tunneling:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->flush()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public enableTunnelingV21()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->externalAudioSessionIdProvided:Z

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->tunneling:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->tunneling:Z

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->flush()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public flush()V
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isAudioTrackInitialized()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->resetSinkStateForFlush()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrackPositionTracker:Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->isPlaying()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 25
    .line 26
    invoke-static {v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isOffloadedPlayback(Landroid/media/AudioTrack;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->offloadStreamEventCallbackV29:Landroidx/media3/exoplayer/audio/DefaultAudioSink$StreamEventCallbackV29;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$StreamEventCallbackV29;->unregister(Landroid/media/AudioTrack;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->buildAudioTrackConfig()Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->pendingConfiguration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 49
    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    iput-object v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 53
    .line 54
    iput-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->pendingConfiguration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 55
    .line 56
    :cond_2
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrackPositionTracker:Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;

    .line 57
    .line 58
    invoke-virtual {v2}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->reset()V

    .line 59
    .line 60
    .line 61
    sget v2, Lh1/i0;->a:I

    .line 62
    .line 63
    const/16 v3, 0x18

    .line 64
    .line 65
    if-lt v2, v3, :cond_3

    .line 66
    .line 67
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->onRoutingChangedListener:Landroidx/media3/exoplayer/audio/DefaultAudioSink$OnRoutingChangedListenerApi24;

    .line 68
    .line 69
    if-eqz v2, :cond_3

    .line 70
    .line 71
    invoke-virtual {v2}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$OnRoutingChangedListenerApi24;->release()V

    .line 72
    .line 73
    .line 74
    iput-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->onRoutingChangedListener:Landroidx/media3/exoplayer/audio/DefaultAudioSink$OnRoutingChangedListenerApi24;

    .line 75
    .line 76
    :cond_3
    iget-object v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 77
    .line 78
    iget-object v3, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->listener:Landroidx/media3/exoplayer/audio/AudioSink$Listener;

    .line 79
    .line 80
    invoke-static {v2, v3, v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->releaseAudioTrackAsync(Landroid/media/AudioTrack;Landroidx/media3/exoplayer/audio/AudioSink$Listener;Landroidx/media3/exoplayer/audio/AudioSink$AudioTrackConfig;)V

    .line 81
    .line 82
    .line 83
    iput-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 84
    .line 85
    :cond_4
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->writeExceptionPendingExceptionHolder:Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;

    .line 86
    .line 87
    invoke-virtual {v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;->clear()V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->initializationExceptionPendingExceptionHolder:Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;

    .line 91
    .line 92
    invoke-virtual {v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;->clear()V

    .line 93
    .line 94
    .line 95
    const-wide/16 v2, 0x0

    .line 96
    .line 97
    iput-wide v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->skippedOutputFrameCountAtLastPosition:J

    .line 98
    .line 99
    iput-wide v2, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->accumulatedSkippedSilenceDurationUs:J

    .line 100
    .line 101
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->reportSkippedSilenceHandler:Landroid/os/Handler;

    .line 102
    .line 103
    if-eqz v0, :cond_5

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_5
    return-void
.end method

.method public getAudioAttributes()Landroidx/media3/common/g;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioAttributes:Landroidx/media3/common/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCurrentPositionUs(Z)J
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isAudioTrackInitialized()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->startMediaTimeUsNeedsInit:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrackPositionTracker:Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->getCurrentPositionUs(Z)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 19
    .line 20
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->getWrittenFrames()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    invoke-virtual {p1, v2, v3}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->framesToDurationUs(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->applyMediaPositionParameters(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->applySkipping(J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    return-wide v0

    .line 41
    :cond_1
    :goto_0
    const-wide/high16 v0, -0x8000000000000000L

    .line 42
    .line 43
    return-wide v0
.end method

.method public getFormatOffloadSupport(Landroidx/media3/common/w;)Landroidx/media3/exoplayer/audio/AudioOffloadSupport;
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->offloadDisabledUntilNextConfiguration:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Landroidx/media3/exoplayer/audio/AudioOffloadSupport;->DEFAULT_UNSUPPORTED:Landroidx/media3/exoplayer/audio/AudioOffloadSupport;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioOffloadSupportProvider:Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioOffloadSupportProvider;

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioAttributes:Landroidx/media3/common/g;

    .line 11
    .line 12
    invoke-interface {v0, p1, v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$AudioOffloadSupportProvider;->getAudioOffloadSupport(Landroidx/media3/common/w;Landroidx/media3/common/g;)Landroidx/media3/exoplayer/audio/AudioOffloadSupport;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public getFormatSupport(Landroidx/media3/common/w;)I
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->maybeStartAudioCapabilitiesReceiver()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 5
    .line 6
    iget v1, p1, Landroidx/media3/common/w;->E:I

    .line 7
    .line 8
    const-string v2, "audio/raw"

    .line 9
    .line 10
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x2

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    invoke-static {v1}, Lh1/i0;->N(I)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    new-instance p1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v0, "Invalid PCM encoding: "

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const-string v0, "DefaultAudioSink"

    .line 39
    .line 40
    invoke-static {v0, p1}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return v2

    .line 44
    :cond_0
    if-eq v1, v3, :cond_2

    .line 45
    .line 46
    iget-boolean p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->enableFloatOutput:Z

    .line 47
    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    const/4 p1, 0x4

    .line 51
    if-ne v1, p1, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const/4 p1, 0x1

    .line 55
    return p1

    .line 56
    :cond_2
    :goto_0
    return v3

    .line 57
    :cond_3
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioCapabilities:Landroidx/media3/exoplayer/audio/AudioCapabilities;

    .line 58
    .line 59
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioAttributes:Landroidx/media3/common/g;

    .line 60
    .line 61
    invoke-virtual {v0, p1, v1}, Landroidx/media3/exoplayer/audio/AudioCapabilities;->isPassthroughPlaybackSupported(Landroidx/media3/common/w;Landroidx/media3/common/g;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    return v3

    .line 68
    :cond_4
    return v2
.end method

.method public getPlaybackParameters()Landroidx/media3/common/y0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->playbackParameters:Landroidx/media3/common/y0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSkipSilenceEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->skipSilenceEnabled:Z

    .line 2
    .line 3
    return v0
.end method

.method public handleBuffer(Ljava/nio/ByteBuffer;JI)Z
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    move/from16 v4, p4

    .line 8
    .line 9
    iget-object v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->inputBuffer:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    if-eqz v5, :cond_1

    .line 14
    .line 15
    if-ne v0, v5, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v5, v7

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    move v5, v6

    .line 21
    :goto_1
    invoke-static {v5}, Lh1/a;->d(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->pendingConfiguration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    if-eqz v5, :cond_7

    .line 28
    .line 29
    invoke-direct {v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->drainToEndOfStream()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-nez v5, :cond_2

    .line 34
    .line 35
    return v7

    .line 36
    :cond_2
    iget-object v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->pendingConfiguration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 37
    .line 38
    iget-object v9, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 39
    .line 40
    invoke-virtual {v5, v9}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->canReuseAudioTrack(Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-nez v5, :cond_4

    .line 45
    .line 46
    invoke-direct {v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->playPendingData()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->hasPendingData()Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_3

    .line 54
    .line 55
    return v7

    .line 56
    :cond_3
    invoke-virtual {v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->flush()V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    iget-object v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->pendingConfiguration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 61
    .line 62
    iput-object v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 63
    .line 64
    iput-object v8, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->pendingConfiguration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 65
    .line 66
    iget-object v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 67
    .line 68
    if-eqz v5, :cond_6

    .line 69
    .line 70
    invoke-static {v5}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isOffloadedPlayback(Landroid/media/AudioTrack;)Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-eqz v5, :cond_6

    .line 75
    .line 76
    iget-object v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 77
    .line 78
    iget-boolean v5, v5, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->enableOffloadGapless:Z

    .line 79
    .line 80
    if-eqz v5, :cond_6

    .line 81
    .line 82
    iget-object v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 83
    .line 84
    invoke-virtual {v5}, Landroid/media/AudioTrack;->getPlayState()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    const/4 v9, 0x3

    .line 89
    if-ne v5, v9, :cond_5

    .line 90
    .line 91
    iget-object v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 92
    .line 93
    invoke-virtual {v5}, Landroid/media/AudioTrack;->setOffloadEndOfStream()V

    .line 94
    .line 95
    .line 96
    iget-object v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrackPositionTracker:Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;

    .line 97
    .line 98
    invoke-virtual {v5}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->expectRawPlaybackHeadReset()V

    .line 99
    .line 100
    .line 101
    :cond_5
    iget-object v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 102
    .line 103
    iget-object v9, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 104
    .line 105
    iget-object v9, v9, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->inputFormat:Landroidx/media3/common/w;

    .line 106
    .line 107
    iget v10, v9, Landroidx/media3/common/w;->F:I

    .line 108
    .line 109
    iget v9, v9, Landroidx/media3/common/w;->G:I

    .line 110
    .line 111
    invoke-virtual {v5, v10, v9}, Landroid/media/AudioTrack;->setOffloadDelayPadding(II)V

    .line 112
    .line 113
    .line 114
    iput-boolean v6, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isWaitingForOffloadEndOfStreamHandled:Z

    .line 115
    .line 116
    :cond_6
    :goto_2
    invoke-direct {v1, v2, v3}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->applyAudioProcessorPlaybackParametersAndSkipSilence(J)V

    .line 117
    .line 118
    .line 119
    :cond_7
    invoke-direct {v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isAudioTrackInitialized()Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-nez v5, :cond_9

    .line 124
    .line 125
    :try_start_0
    invoke-direct {v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->initializeAudioTrack()Z

    .line 126
    .line 127
    .line 128
    move-result v5
    :try_end_0
    .catch Landroidx/media3/exoplayer/audio/AudioSink$InitializationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 129
    if-nez v5, :cond_9

    .line 130
    .line 131
    return v7

    .line 132
    :catch_0
    move-exception v0

    .line 133
    iget-boolean v2, v0, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;->isRecoverable:Z

    .line 134
    .line 135
    if-nez v2, :cond_8

    .line 136
    .line 137
    iget-object v2, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->initializationExceptionPendingExceptionHolder:Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;

    .line 138
    .line 139
    invoke-virtual {v2, v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;->throwExceptionIfDeadlineIsReached(Ljava/lang/Exception;)V

    .line 140
    .line 141
    .line 142
    return v7

    .line 143
    :cond_8
    throw v0

    .line 144
    :cond_9
    iget-object v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->initializationExceptionPendingExceptionHolder:Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;

    .line 145
    .line 146
    invoke-virtual {v5}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$PendingExceptionHolder;->clear()V

    .line 147
    .line 148
    .line 149
    iget-boolean v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->startMediaTimeUsNeedsInit:Z

    .line 150
    .line 151
    const-wide/16 v9, 0x0

    .line 152
    .line 153
    if-eqz v5, :cond_b

    .line 154
    .line 155
    invoke-static {v9, v10, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 156
    .line 157
    .line 158
    move-result-wide v11

    .line 159
    iput-wide v11, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->startMediaTimeUs:J

    .line 160
    .line 161
    iput-boolean v7, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->startMediaTimeUsNeedsSync:Z

    .line 162
    .line 163
    iput-boolean v7, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->startMediaTimeUsNeedsInit:Z

    .line 164
    .line 165
    invoke-direct {v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->useAudioTrackPlaybackParams()Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    if-eqz v5, :cond_a

    .line 170
    .line 171
    invoke-direct {v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->setAudioTrackPlaybackParametersV23()V

    .line 172
    .line 173
    .line 174
    :cond_a
    invoke-direct {v1, v2, v3}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->applyAudioProcessorPlaybackParametersAndSkipSilence(J)V

    .line 175
    .line 176
    .line 177
    iget-boolean v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->playing:Z

    .line 178
    .line 179
    if-eqz v5, :cond_b

    .line 180
    .line 181
    invoke-virtual {v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->play()V

    .line 182
    .line 183
    .line 184
    :cond_b
    iget-object v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrackPositionTracker:Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;

    .line 185
    .line 186
    invoke-direct {v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->getWrittenFrames()J

    .line 187
    .line 188
    .line 189
    move-result-wide v11

    .line 190
    invoke-virtual {v5, v11, v12}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->mayHandleBuffer(J)Z

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    if-nez v5, :cond_c

    .line 195
    .line 196
    return v7

    .line 197
    :cond_c
    iget-object v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->inputBuffer:Ljava/nio/ByteBuffer;

    .line 198
    .line 199
    if-nez v5, :cond_17

    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    sget-object v11, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 206
    .line 207
    if-ne v5, v11, :cond_d

    .line 208
    .line 209
    move v5, v6

    .line 210
    goto :goto_3

    .line 211
    :cond_d
    move v5, v7

    .line 212
    :goto_3
    invoke-static {v5}, Lh1/a;->d(Z)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    if-nez v5, :cond_e

    .line 220
    .line 221
    return v6

    .line 222
    :cond_e
    iget-object v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 223
    .line 224
    iget v11, v5, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->outputMode:I

    .line 225
    .line 226
    if-eqz v11, :cond_f

    .line 227
    .line 228
    iget v11, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->framesPerEncodedSample:I

    .line 229
    .line 230
    if-nez v11, :cond_f

    .line 231
    .line 232
    iget v5, v5, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->outputEncoding:I

    .line 233
    .line 234
    invoke-static {v5, v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->getFramesPerEncodedSample(ILjava/nio/ByteBuffer;)I

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    iput v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->framesPerEncodedSample:I

    .line 239
    .line 240
    if-nez v5, :cond_f

    .line 241
    .line 242
    return v6

    .line 243
    :cond_f
    iget-object v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->afterDrainParameters:Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;

    .line 244
    .line 245
    if-eqz v5, :cond_11

    .line 246
    .line 247
    invoke-direct {v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->drainToEndOfStream()Z

    .line 248
    .line 249
    .line 250
    move-result v5

    .line 251
    if-nez v5, :cond_10

    .line 252
    .line 253
    return v7

    .line 254
    :cond_10
    invoke-direct {v1, v2, v3}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->applyAudioProcessorPlaybackParametersAndSkipSilence(J)V

    .line 255
    .line 256
    .line 257
    iput-object v8, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->afterDrainParameters:Landroidx/media3/exoplayer/audio/DefaultAudioSink$MediaPositionParameters;

    .line 258
    .line 259
    :cond_11
    iget-wide v11, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->startMediaTimeUs:J

    .line 260
    .line 261
    iget-object v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 262
    .line 263
    invoke-direct {v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->getSubmittedFrames()J

    .line 264
    .line 265
    .line 266
    move-result-wide v13

    .line 267
    iget-object v15, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->trimmingAudioProcessor:Landroidx/media3/exoplayer/audio/TrimmingAudioProcessor;

    .line 268
    .line 269
    invoke-virtual {v15}, Landroidx/media3/exoplayer/audio/TrimmingAudioProcessor;->getTrimmedFrameCount()J

    .line 270
    .line 271
    .line 272
    move-result-wide v15

    .line 273
    sub-long/2addr v13, v15

    .line 274
    invoke-virtual {v5, v13, v14}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->inputFramesToDurationUs(J)J

    .line 275
    .line 276
    .line 277
    move-result-wide v13

    .line 278
    add-long/2addr v11, v13

    .line 279
    iget-boolean v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->startMediaTimeUsNeedsSync:Z

    .line 280
    .line 281
    if-nez v5, :cond_13

    .line 282
    .line 283
    sub-long v13, v11, v2

    .line 284
    .line 285
    invoke-static {v13, v14}, Ljava/lang/Math;->abs(J)J

    .line 286
    .line 287
    .line 288
    move-result-wide v13

    .line 289
    const-wide/32 v15, 0x30d40

    .line 290
    .line 291
    .line 292
    cmp-long v5, v13, v15

    .line 293
    .line 294
    if-lez v5, :cond_13

    .line 295
    .line 296
    iget-object v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->listener:Landroidx/media3/exoplayer/audio/AudioSink$Listener;

    .line 297
    .line 298
    if-eqz v5, :cond_12

    .line 299
    .line 300
    new-instance v13, Landroidx/media3/exoplayer/audio/AudioSink$UnexpectedDiscontinuityException;

    .line 301
    .line 302
    invoke-direct {v13, v2, v3, v11, v12}, Landroidx/media3/exoplayer/audio/AudioSink$UnexpectedDiscontinuityException;-><init>(JJ)V

    .line 303
    .line 304
    .line 305
    invoke-interface {v5, v13}, Landroidx/media3/exoplayer/audio/AudioSink$Listener;->onAudioSinkError(Ljava/lang/Exception;)V

    .line 306
    .line 307
    .line 308
    :cond_12
    iput-boolean v6, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->startMediaTimeUsNeedsSync:Z

    .line 309
    .line 310
    :cond_13
    iget-boolean v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->startMediaTimeUsNeedsSync:Z

    .line 311
    .line 312
    if-eqz v5, :cond_15

    .line 313
    .line 314
    invoke-direct {v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->drainToEndOfStream()Z

    .line 315
    .line 316
    .line 317
    move-result v5

    .line 318
    if-nez v5, :cond_14

    .line 319
    .line 320
    return v7

    .line 321
    :cond_14
    sub-long v11, v2, v11

    .line 322
    .line 323
    iget-wide v13, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->startMediaTimeUs:J

    .line 324
    .line 325
    add-long/2addr v13, v11

    .line 326
    iput-wide v13, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->startMediaTimeUs:J

    .line 327
    .line 328
    iput-boolean v7, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->startMediaTimeUsNeedsSync:Z

    .line 329
    .line 330
    invoke-direct {v1, v2, v3}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->applyAudioProcessorPlaybackParametersAndSkipSilence(J)V

    .line 331
    .line 332
    .line 333
    iget-object v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->listener:Landroidx/media3/exoplayer/audio/AudioSink$Listener;

    .line 334
    .line 335
    if-eqz v5, :cond_15

    .line 336
    .line 337
    cmp-long v9, v11, v9

    .line 338
    .line 339
    if-eqz v9, :cond_15

    .line 340
    .line 341
    invoke-interface {v5}, Landroidx/media3/exoplayer/audio/AudioSink$Listener;->onPositionDiscontinuity()V

    .line 342
    .line 343
    .line 344
    :cond_15
    iget-object v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 345
    .line 346
    iget v5, v5, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->outputMode:I

    .line 347
    .line 348
    if-nez v5, :cond_16

    .line 349
    .line 350
    iget-wide v9, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->submittedPcmBytes:J

    .line 351
    .line 352
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 353
    .line 354
    .line 355
    move-result v5

    .line 356
    int-to-long v11, v5

    .line 357
    add-long/2addr v9, v11

    .line 358
    iput-wide v9, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->submittedPcmBytes:J

    .line 359
    .line 360
    goto :goto_4

    .line 361
    :cond_16
    iget-wide v9, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->submittedEncodedFrames:J

    .line 362
    .line 363
    iget v5, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->framesPerEncodedSample:I

    .line 364
    .line 365
    int-to-long v11, v5

    .line 366
    int-to-long v13, v4

    .line 367
    mul-long/2addr v11, v13

    .line 368
    add-long/2addr v11, v9

    .line 369
    iput-wide v11, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->submittedEncodedFrames:J

    .line 370
    .line 371
    :goto_4
    iput-object v0, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->inputBuffer:Ljava/nio/ByteBuffer;

    .line 372
    .line 373
    iput v4, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->inputBufferAccessUnitCount:I

    .line 374
    .line 375
    :cond_17
    invoke-direct {v1, v2, v3}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->processBuffers(J)V

    .line 376
    .line 377
    .line 378
    iget-object v0, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->inputBuffer:Ljava/nio/ByteBuffer;

    .line 379
    .line 380
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    if-nez v0, :cond_18

    .line 385
    .line 386
    iput-object v8, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->inputBuffer:Ljava/nio/ByteBuffer;

    .line 387
    .line 388
    iput v7, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->inputBufferAccessUnitCount:I

    .line 389
    .line 390
    return v6

    .line 391
    :cond_18
    iget-object v0, v1, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrackPositionTracker:Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;

    .line 392
    .line 393
    invoke-direct {v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->getWrittenFrames()J

    .line 394
    .line 395
    .line 396
    move-result-wide v2

    .line 397
    invoke-virtual {v0, v2, v3}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->isStalled(J)Z

    .line 398
    .line 399
    .line 400
    move-result v0

    .line 401
    if-eqz v0, :cond_19

    .line 402
    .line 403
    const-string v0, "DefaultAudioSink"

    .line 404
    .line 405
    const-string v2, "Resetting stalled audio track"

    .line 406
    .line 407
    invoke-static {v0, v2}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->flush()V

    .line 411
    .line 412
    .line 413
    return v6

    .line 414
    :cond_19
    return v7
.end method

.method public handleDiscontinuity()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->startMediaTimeUsNeedsSync:Z

    .line 3
    .line 4
    return-void
.end method

.method public hasPendingData()Z
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isAudioTrackInitialized()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget v0, Lh1/i0;->a:I

    .line 8
    .line 9
    const/16 v1, 0x1d

    .line 10
    .line 11
    if-lt v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/media/AudioTrack;->isOffloadedPlayback()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->handledOffloadOnPresentationEnded:Z

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrackPositionTracker:Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;

    .line 26
    .line 27
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->getWrittenFrames()J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    invoke-virtual {v0, v1, v2}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->hasPendingData(J)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    return v0

    .line 39
    :cond_1
    const/4 v0, 0x0

    .line 40
    return v0
.end method

.method public isEnded()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isAudioTrackInitialized()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->handledEndOfStream:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->hasPendingData()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    return v0
.end method

.method public onAudioCapabilitiesChanged(Landroidx/media3/exoplayer/audio/AudioCapabilities;)V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->playbackLooper:Landroid/os/Looper;

    .line 6
    .line 7
    if-eq v1, v0, :cond_2

    .line 8
    .line 9
    const-string p1, "null"

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    move-object v1, p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    if-nez v0, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v3, "Current looper ("

    .line 39
    .line 40
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p1, ") is not the playback looper ("

    .line 47
    .line 48
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p1, ")"

    .line 55
    .line 56
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v0

    .line 67
    :cond_2
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioCapabilities:Landroidx/media3/exoplayer/audio/AudioCapabilities;

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/audio/AudioCapabilities;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_3

    .line 74
    .line 75
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioCapabilities:Landroidx/media3/exoplayer/audio/AudioCapabilities;

    .line 76
    .line 77
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->listener:Landroidx/media3/exoplayer/audio/AudioSink$Listener;

    .line 78
    .line 79
    if-eqz p1, :cond_3

    .line 80
    .line 81
    invoke-interface {p1}, Landroidx/media3/exoplayer/audio/AudioSink$Listener;->onAudioCapabilitiesChanged()V

    .line 82
    .line 83
    .line 84
    :cond_3
    return-void
.end method

.method public pause()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->playing:Z

    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isAudioTrackInitialized()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrackPositionTracker:Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->pause()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 19
    .line 20
    invoke-static {v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isOffloadedPlayback(Landroid/media/AudioTrack;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public play()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->playing:Z

    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isAudioTrackInitialized()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrackPositionTracker:Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->start()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public playToEndOfStream()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->handledEndOfStream:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isAudioTrackInitialized()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->drainToEndOfStream()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->playPendingData()V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->handledEndOfStream:Z

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public release()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioCapabilitiesReceiver:Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->unregister()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public reset()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->flush()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->toIntPcmAvailableAudioProcessors:Lf6/m0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Lf6/m0;->l(I)Lf6/k0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-virtual {v0}, Lf6/a;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lf6/a;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Landroidx/media3/common/audio/d;

    .line 22
    .line 23
    invoke-interface {v2}, Landroidx/media3/common/audio/d;->reset()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->toFloatPcmAvailableAudioProcessors:Lf6/m0;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lf6/m0;->l(I)Lf6/k0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_1
    invoke-virtual {v0}, Lf6/a;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0}, Lf6/a;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Landroidx/media3/common/audio/d;

    .line 44
    .line 45
    invoke-interface {v2}, Landroidx/media3/common/audio/d;->reset()V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioProcessingPipeline:Landroidx/media3/common/audio/a;

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    iget-object v2, v0, Landroidx/media3/common/audio/a;->a:Lf6/m0;

    .line 54
    .line 55
    move v3, v1

    .line 56
    :goto_2
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-ge v3, v4, :cond_2

    .line 61
    .line 62
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, Landroidx/media3/common/audio/d;

    .line 67
    .line 68
    invoke-interface {v4}, Landroidx/media3/common/audio/d;->flush()V

    .line 69
    .line 70
    .line 71
    invoke-interface {v4}, Landroidx/media3/common/audio/d;->reset()V

    .line 72
    .line 73
    .line 74
    add-int/lit8 v3, v3, 0x1

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    new-array v2, v1, [Ljava/nio/ByteBuffer;

    .line 78
    .line 79
    iput-object v2, v0, Landroidx/media3/common/audio/a;->c:[Ljava/nio/ByteBuffer;

    .line 80
    .line 81
    sget-object v2, Landroidx/media3/common/audio/b;->e:Landroidx/media3/common/audio/b;

    .line 82
    .line 83
    iput-boolean v1, v0, Landroidx/media3/common/audio/a;->d:Z

    .line 84
    .line 85
    :cond_3
    iput-boolean v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->playing:Z

    .line 86
    .line 87
    iput-boolean v1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->offloadDisabledUntilNextConfiguration:Z

    .line 88
    .line 89
    return-void
.end method

.method public setAudioAttributes(Landroidx/media3/common/g;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioAttributes:Landroidx/media3/common/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/common/g;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioAttributes:Landroidx/media3/common/g;

    .line 11
    .line 12
    iget-boolean v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->tunneling:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    :goto_0
    return-void

    .line 17
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioCapabilitiesReceiver:Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->setAudioAttributes(Landroidx/media3/common/g;)V

    .line 22
    .line 23
    .line 24
    :cond_2
    invoke-virtual {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->flush()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public setAudioSessionId(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioSessionId:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioSessionId:I

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    iput-boolean p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->externalAudioSessionIdProvided:Z

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->flush()V

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
.end method

.method public setAuxEffectInfo(Landroidx/media3/common/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->auxEffectInfo:Landroidx/media3/common/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/common/h;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->auxEffectInfo:Landroidx/media3/common/h;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    :cond_1
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->auxEffectInfo:Landroidx/media3/common/h;

    .line 23
    .line 24
    return-void
.end method

.method public setClock(Lh1/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrackPositionTracker:Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/audio/AudioTrackPositionTracker;->setClock(Lh1/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setListener(Landroidx/media3/exoplayer/audio/AudioSink$Listener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->listener:Landroidx/media3/exoplayer/audio/AudioSink$Listener;

    .line 2
    .line 3
    return-void
.end method

.method public setOffloadDelayPadding(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->isOffloadedPlayback(Landroid/media/AudioTrack;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->configuration:Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-boolean v0, v0, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Configuration;->enableOffloadGapless:Z

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2}, Landroid/media/AudioTrack;->setOffloadDelayPadding(II)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public setOffloadMode(I)V
    .locals 2

    .line 1
    sget v0, Lh1/i0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 11
    .line 12
    .line 13
    iput p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->offloadMode:I

    .line 14
    .line 15
    return-void
.end method

.method public setPlaybackParameters(Landroidx/media3/common/y0;)V
    .locals 5

    .line 1
    new-instance v0, Landroidx/media3/common/y0;

    .line 2
    .line 3
    iget v1, p1, Landroidx/media3/common/y0;->a:F

    .line 4
    .line 5
    const v2, 0x3dcccccd    # 0.1f

    .line 6
    .line 7
    .line 8
    const/high16 v3, 0x41000000    # 8.0f

    .line 9
    .line 10
    invoke-static {v1, v2, v3}, Lh1/i0;->i(FFF)F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget v4, p1, Landroidx/media3/common/y0;->b:F

    .line 15
    .line 16
    invoke-static {v4, v2, v3}, Lh1/i0;->i(FFF)F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-direct {v0, v1, v2}, Landroidx/media3/common/y0;-><init>(FF)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->playbackParameters:Landroidx/media3/common/y0;

    .line 24
    .line 25
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->useAudioTrackPlaybackParams()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->setAudioTrackPlaybackParametersV23()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->setAudioProcessorPlaybackParameters(Landroidx/media3/common/y0;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public setPlayerId(Landroidx/media3/exoplayer/analytics/PlayerId;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->playerId:Landroidx/media3/exoplayer/analytics/PlayerId;

    .line 2
    .line 3
    return-void
.end method

.method public setPreferredDevice(Landroid/media/AudioDeviceInfo;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    new-instance v0, Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;-><init>(Landroid/media/AudioDeviceInfo;)V

    .line 8
    .line 9
    .line 10
    :goto_0
    iput-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->preferredDevice:Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioCapabilitiesReceiver:Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/audio/AudioCapabilitiesReceiver;->setRoutedDevice(Landroid/media/AudioDeviceInfo;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->audioTrack:Landroid/media/AudioTrack;

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->preferredDevice:Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;

    .line 24
    .line 25
    invoke-static {p1, v0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink$Api23;->setPreferredDeviceOnAudioTrack(Landroid/media/AudioTrack;Landroidx/media3/exoplayer/audio/AudioDeviceInfoApi23;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    return-void
.end method

.method public setSkipSilenceEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->skipSilenceEnabled:Z

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->useAudioTrackPlaybackParams()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget-object p1, Landroidx/media3/common/y0;->d:Landroidx/media3/common/y0;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->playbackParameters:Landroidx/media3/common/y0;

    .line 13
    .line 14
    :goto_0
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->setAudioProcessorPlaybackParameters(Landroidx/media3/common/y0;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public setVolume(F)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->volume:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->volume:F

    .line 8
    .line 9
    invoke-direct {p0}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->setVolumeInternal()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public supportsFormat(Landroidx/media3/common/w;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/audio/DefaultAudioSink;->getFormatSupport(Landroidx/media3/common/w;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    return p1
.end method
