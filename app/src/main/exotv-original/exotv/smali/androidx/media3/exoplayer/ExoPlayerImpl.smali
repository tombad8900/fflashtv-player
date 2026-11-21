.class final Landroidx/media3/exoplayer/ExoPlayerImpl;
.super Landroidx/media3/common/i;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/ExoPlayer;
.implements Landroidx/media3/exoplayer/ExoPlayer$AudioComponent;
.implements Landroidx/media3/exoplayer/ExoPlayer$VideoComponent;
.implements Landroidx/media3/exoplayer/ExoPlayer$TextComponent;
.implements Landroidx/media3/exoplayer/ExoPlayer$DeviceComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;,
        Landroidx/media3/exoplayer/ExoPlayerImpl$FrameMetadataListener;,
        Landroidx/media3/exoplayer/ExoPlayerImpl$Api31;,
        Landroidx/media3/exoplayer/ExoPlayerImpl$NoSuitableOutputPlaybackSuppressionAudioDeviceCallback;,
        Landroidx/media3/exoplayer/ExoPlayerImpl$Api23;,
        Landroidx/media3/exoplayer/ExoPlayerImpl$MediaSourceHolderSnapshot;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "ExoPlayerImpl"


# instance fields
.field private final analyticsCollector:Landroidx/media3/exoplayer/analytics/AnalyticsCollector;

.field private final applicationContext:Landroid/content/Context;

.field private final applicationLooper:Landroid/os/Looper;

.field private audioAttributes:Landroidx/media3/common/g;

.field private final audioBecomingNoisyManager:Landroidx/media3/exoplayer/AudioBecomingNoisyManager;

.field private audioDecoderCounters:Landroidx/media3/exoplayer/DecoderCounters;

.field private final audioFocusManager:Landroidx/media3/exoplayer/AudioFocusManager;

.field private audioFormat:Landroidx/media3/common/w;

.field private audioManager:Landroid/media/AudioManager;

.field private final audioOffloadListeners:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Landroidx/media3/exoplayer/ExoPlayer$AudioOffloadListener;",
            ">;"
        }
    .end annotation
.end field

.field private audioSessionId:I

.field private availableCommands:Landroidx/media3/common/z0;

.field private final bandwidthMeter:Landroidx/media3/exoplayer/upstream/BandwidthMeter;

.field private cameraMotionListener:Landroidx/media3/exoplayer/video/spherical/CameraMotionListener;

.field private final clock:Lh1/b;

.field private final componentListener:Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;

.field private final constructorFinished:Lh1/e;

.field private currentCueGroup:Lg1/c;

.field private final detachSurfaceTimeoutMs:J

.field private deviceInfo:Landroidx/media3/common/q;

.field final emptyTrackSelectorResult:Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

.field private foregroundMode:Z

.field private final frameMetadataListener:Landroidx/media3/exoplayer/ExoPlayerImpl$FrameMetadataListener;

.field private hasNotifiedFullWrongThreadWarning:Z

.field private final internalPlayer:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

.field private isPriorityTaskManagerRegistered:Z

.field private final listeners:Lh1/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh1/p;"
        }
    .end annotation
.end field

.field private maskingPeriodIndex:I

.field private maskingWindowIndex:I

.field private maskingWindowPositionMs:J

.field private final maxSeekToPreviousPositionMs:J

.field private mediaMetadata:Landroidx/media3/common/r0;

.field private final mediaSourceFactory:Landroidx/media3/exoplayer/source/MediaSource$Factory;

.field private final mediaSourceHolderSnapshots:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/ExoPlayerImpl$MediaSourceHolderSnapshot;",
            ">;"
        }
    .end annotation
.end field

.field private ownedSurface:Landroid/view/Surface;

.field private pauseAtEndOfMediaItems:Z

.field private pendingDiscontinuity:Z

.field private pendingDiscontinuityReason:I

.field private pendingOperationAcks:I

.field private final period:Landroidx/media3/common/m1;

.field final permanentAvailableCommands:Landroidx/media3/common/z0;

.field private playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

.field private final playbackInfoUpdateHandler:Lh1/k;

.field private final playbackInfoUpdateListener:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdateListener;

.field private playerReleased:Z

.field private playlistMetadata:Landroidx/media3/common/r0;

.field private preloadConfiguration:Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;

.field private priority:I

.field private priorityTaskManager:Landroidx/media3/common/g1;

.field private final renderers:[Landroidx/media3/exoplayer/Renderer;

.field private repeatMode:I

.field private final seekBackIncrementMs:J

.field private final seekForwardIncrementMs:J

.field private seekParameters:Landroidx/media3/exoplayer/SeekParameters;

.field private shuffleModeEnabled:Z

.field private shuffleOrder:Landroidx/media3/exoplayer/source/ShuffleOrder;

.field private skipSilenceEnabled:Z

.field private sphericalGLSurfaceView:Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;

.field private staticAndDynamicMediaMetadata:Landroidx/media3/common/r0;

.field private final streamVolumeManager:Landroidx/media3/exoplayer/StreamVolumeManager;

.field private final suitableOutputChecker:Landroidx/media3/exoplayer/SuitableOutputChecker;

.field private final suppressPlaybackOnUnsuitableOutput:Z

.field private surfaceHolder:Landroid/view/SurfaceHolder;

.field private surfaceHolderSurfaceIsVideoOutput:Z

.field private surfaceSize:Lh1/y;

.field private textureView:Landroid/view/TextureView;

.field private throwsWhenUsingWrongThread:Z

.field private final trackSelector:Landroidx/media3/exoplayer/trackselection/TrackSelector;

.field private final useLazyPreparation:Z

.field private videoChangeFrameRateStrategy:I

.field private videoDecoderCounters:Landroidx/media3/exoplayer/DecoderCounters;

.field private videoFormat:Landroidx/media3/common/w;

.field private videoFrameMetadataListener:Landroidx/media3/exoplayer/video/VideoFrameMetadataListener;

.field private videoOutput:Ljava/lang/Object;

.field private videoScalingMode:I

.field private videoSize:Landroidx/media3/common/d2;

.field private volume:F

.field private final wakeLockManager:Landroidx/media3/exoplayer/WakeLockManager;

.field private final wifiLockManager:Landroidx/media3/exoplayer/WifiLockManager;

.field private final wrappingPlayer:Landroidx/media3/common/d1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "media3.exoplayer"

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/common/p0;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Landroidx/media3/exoplayer/ExoPlayer$Builder;Landroidx/media3/common/d1;)V
    .locals 32
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "audio"

    .line 6
    .line 7
    const-string v3, " [AndroidXMedia3/1.5.1] ["

    .line 8
    .line 9
    const-string v4, "Init "

    .line 10
    .line 11
    invoke-direct {v1}, Landroidx/media3/common/i;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v5, Lh1/e;

    .line 15
    .line 16
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v5, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->constructorFinished:Lh1/e;

    .line 20
    .line 21
    :try_start_0
    const-string v5, "ExoPlayerImpl"

    .line 22
    .line 23
    new-instance v6, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    sget-object v3, Lh1/i0;->e:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v3, "]"

    .line 48
    .line 49
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-static {v5, v3}, Lh1/a;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->context:Landroid/content/Context;

    .line 60
    .line 61
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    iput-object v3, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->applicationContext:Landroid/content/Context;

    .line 66
    .line 67
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->analyticsCollectorFunction:Le6/d;

    .line 68
    .line 69
    iget-object v4, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->clock:Lh1/b;

    .line 70
    .line 71
    invoke-interface {v3, v4}, Le6/d;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Landroidx/media3/exoplayer/analytics/AnalyticsCollector;

    .line 76
    .line 77
    iput-object v3, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->analyticsCollector:Landroidx/media3/exoplayer/analytics/AnalyticsCollector;

    .line 78
    .line 79
    iget v3, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->priority:I

    .line 80
    .line 81
    iput v3, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->priority:I

    .line 82
    .line 83
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->audioAttributes:Landroidx/media3/common/g;

    .line 84
    .line 85
    iput-object v3, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioAttributes:Landroidx/media3/common/g;

    .line 86
    .line 87
    iget v3, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->videoScalingMode:I

    .line 88
    .line 89
    iput v3, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->videoScalingMode:I

    .line 90
    .line 91
    iget v3, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->videoChangeFrameRateStrategy:I

    .line 92
    .line 93
    iput v3, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->videoChangeFrameRateStrategy:I

    .line 94
    .line 95
    iget-boolean v3, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->skipSilenceEnabled:Z

    .line 96
    .line 97
    iput-boolean v3, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->skipSilenceEnabled:Z

    .line 98
    .line 99
    iget-wide v3, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->detachSurfaceTimeoutMs:J

    .line 100
    .line 101
    iput-wide v3, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->detachSurfaceTimeoutMs:J

    .line 102
    .line 103
    new-instance v7, Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;

    .line 104
    .line 105
    const/4 v3, 0x0

    .line 106
    invoke-direct {v7, v1, v3}, Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;-><init>(Landroidx/media3/exoplayer/ExoPlayerImpl;Landroidx/media3/exoplayer/ExoPlayerImpl$1;)V

    .line 107
    .line 108
    .line 109
    iput-object v7, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->componentListener:Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;

    .line 110
    .line 111
    new-instance v4, Landroidx/media3/exoplayer/ExoPlayerImpl$FrameMetadataListener;

    .line 112
    .line 113
    invoke-direct {v4, v3}, Landroidx/media3/exoplayer/ExoPlayerImpl$FrameMetadataListener;-><init>(Landroidx/media3/exoplayer/ExoPlayerImpl$1;)V

    .line 114
    .line 115
    .line 116
    iput-object v4, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->frameMetadataListener:Landroidx/media3/exoplayer/ExoPlayerImpl$FrameMetadataListener;

    .line 117
    .line 118
    new-instance v6, Landroid/os/Handler;

    .line 119
    .line 120
    iget-object v4, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->looper:Landroid/os/Looper;

    .line 121
    .line 122
    invoke-direct {v6, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 123
    .line 124
    .line 125
    iget-object v4, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->renderersFactorySupplier:Le6/i;

    .line 126
    .line 127
    invoke-interface {v4}, Le6/i;->get()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    move-object v5, v4

    .line 132
    check-cast v5, Landroidx/media3/exoplayer/RenderersFactory;

    .line 133
    .line 134
    move-object v8, v7

    .line 135
    move-object v9, v7

    .line 136
    move-object v10, v7

    .line 137
    invoke-interface/range {v5 .. v10}, Landroidx/media3/exoplayer/RenderersFactory;->createRenderers(Landroid/os/Handler;Landroidx/media3/exoplayer/video/VideoRendererEventListener;Landroidx/media3/exoplayer/audio/AudioRendererEventListener;Landroidx/media3/exoplayer/text/TextOutput;Landroidx/media3/exoplayer/metadata/MetadataOutput;)[Landroidx/media3/exoplayer/Renderer;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    iput-object v4, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 142
    .line 143
    array-length v5, v4

    .line 144
    const/4 v7, 0x0

    .line 145
    const/4 v8, 0x1

    .line 146
    if-lez v5, :cond_0

    .line 147
    .line 148
    move v5, v8

    .line 149
    goto :goto_0

    .line 150
    :cond_0
    move v5, v7

    .line 151
    :goto_0
    invoke-static {v5}, Lh1/a;->j(Z)V

    .line 152
    .line 153
    .line 154
    iget-object v5, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->trackSelectorSupplier:Le6/i;

    .line 155
    .line 156
    invoke-interface {v5}, Le6/i;->get()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    check-cast v5, Landroidx/media3/exoplayer/trackselection/TrackSelector;

    .line 161
    .line 162
    iput-object v5, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->trackSelector:Landroidx/media3/exoplayer/trackselection/TrackSelector;

    .line 163
    .line 164
    iget-object v5, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->mediaSourceFactorySupplier:Le6/i;

    .line 165
    .line 166
    invoke-interface {v5}, Le6/i;->get()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    check-cast v5, Landroidx/media3/exoplayer/source/MediaSource$Factory;

    .line 171
    .line 172
    iput-object v5, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaSourceFactory:Landroidx/media3/exoplayer/source/MediaSource$Factory;

    .line 173
    .line 174
    iget-object v5, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->bandwidthMeterSupplier:Le6/i;

    .line 175
    .line 176
    invoke-interface {v5}, Le6/i;->get()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    check-cast v5, Landroidx/media3/exoplayer/upstream/BandwidthMeter;

    .line 181
    .line 182
    iput-object v5, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->bandwidthMeter:Landroidx/media3/exoplayer/upstream/BandwidthMeter;

    .line 183
    .line 184
    iget-boolean v5, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->useLazyPreparation:Z

    .line 185
    .line 186
    iput-boolean v5, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->useLazyPreparation:Z

    .line 187
    .line 188
    iget-object v5, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->seekParameters:Landroidx/media3/exoplayer/SeekParameters;

    .line 189
    .line 190
    iput-object v5, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->seekParameters:Landroidx/media3/exoplayer/SeekParameters;

    .line 191
    .line 192
    iget-wide v9, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->seekBackIncrementMs:J

    .line 193
    .line 194
    iput-wide v9, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->seekBackIncrementMs:J

    .line 195
    .line 196
    iget-wide v9, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->seekForwardIncrementMs:J

    .line 197
    .line 198
    iput-wide v9, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->seekForwardIncrementMs:J

    .line 199
    .line 200
    iget-wide v9, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->maxSeekToPreviousPositionMs:J

    .line 201
    .line 202
    iput-wide v9, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->maxSeekToPreviousPositionMs:J

    .line 203
    .line 204
    iget-boolean v5, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->pauseAtEndOfMediaItems:Z

    .line 205
    .line 206
    iput-boolean v5, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->pauseAtEndOfMediaItems:Z

    .line 207
    .line 208
    iget-object v5, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->looper:Landroid/os/Looper;

    .line 209
    .line 210
    iput-object v5, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->applicationLooper:Landroid/os/Looper;

    .line 211
    .line 212
    iget-object v9, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->clock:Lh1/b;

    .line 213
    .line 214
    iput-object v9, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->clock:Lh1/b;

    .line 215
    .line 216
    if-nez p2, :cond_1

    .line 217
    .line 218
    move-object v10, v1

    .line 219
    goto :goto_1

    .line 220
    :cond_1
    move-object/from16 v10, p2

    .line 221
    .line 222
    :goto_1
    iput-object v10, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->wrappingPlayer:Landroidx/media3/common/d1;

    .line 223
    .line 224
    iget-boolean v10, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->suppressPlaybackOnUnsuitableOutput:Z

    .line 225
    .line 226
    iput-boolean v10, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->suppressPlaybackOnUnsuitableOutput:Z

    .line 227
    .line 228
    new-instance v10, Lh1/p;

    .line 229
    .line 230
    new-instance v11, Landroidx/media3/exoplayer/t;

    .line 231
    .line 232
    invoke-direct {v11, v1, v8}, Landroidx/media3/exoplayer/t;-><init>(Landroidx/media3/exoplayer/ExoPlayerImpl;I)V

    .line 233
    .line 234
    .line 235
    invoke-direct {v10, v5, v9, v11}, Lh1/p;-><init>(Landroid/os/Looper;Lh1/b;Lh1/n;)V

    .line 236
    .line 237
    .line 238
    iput-object v10, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 239
    .line 240
    new-instance v5, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 241
    .line 242
    invoke-direct {v5}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 243
    .line 244
    .line 245
    iput-object v5, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioOffloadListeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 246
    .line 247
    new-instance v5, Ljava/util/ArrayList;

    .line 248
    .line 249
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 250
    .line 251
    .line 252
    iput-object v5, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaSourceHolderSnapshots:Ljava/util/List;

    .line 253
    .line 254
    new-instance v5, Landroidx/media3/exoplayer/source/ShuffleOrder$DefaultShuffleOrder;

    .line 255
    .line 256
    invoke-direct {v5, v7}, Landroidx/media3/exoplayer/source/ShuffleOrder$DefaultShuffleOrder;-><init>(I)V

    .line 257
    .line 258
    .line 259
    iput-object v5, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->shuffleOrder:Landroidx/media3/exoplayer/source/ShuffleOrder;

    .line 260
    .line 261
    sget-object v5, Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;->DEFAULT:Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;

    .line 262
    .line 263
    iput-object v5, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->preloadConfiguration:Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;

    .line 264
    .line 265
    new-instance v5, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 266
    .line 267
    array-length v9, v4

    .line 268
    new-array v9, v9, [Landroidx/media3/exoplayer/RendererConfiguration;

    .line 269
    .line 270
    array-length v4, v4

    .line 271
    new-array v4, v4, [Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;

    .line 272
    .line 273
    sget-object v10, Landroidx/media3/common/x1;->b:Landroidx/media3/common/x1;

    .line 274
    .line 275
    invoke-direct {v5, v9, v4, v10, v3}, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;-><init>([Landroidx/media3/exoplayer/RendererConfiguration;[Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;Landroidx/media3/common/x1;Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    iput-object v5, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->emptyTrackSelectorResult:Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 279
    .line 280
    new-instance v4, Landroidx/media3/common/m1;

    .line 281
    .line 282
    invoke-direct {v4}, Landroidx/media3/common/m1;-><init>()V

    .line 283
    .line 284
    .line 285
    iput-object v4, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->period:Landroidx/media3/common/m1;

    .line 286
    .line 287
    new-instance v4, La4/j0;

    .line 288
    .line 289
    invoke-direct {v4, v8}, La4/j0;-><init>(I)V

    .line 290
    .line 291
    .line 292
    const/16 v5, 0x14

    .line 293
    .line 294
    new-array v9, v5, [I

    .line 295
    .line 296
    fill-array-data v9, :array_0

    .line 297
    .line 298
    .line 299
    move v10, v7

    .line 300
    :goto_2
    if-ge v10, v5, :cond_2

    .line 301
    .line 302
    aget v11, v9, v10

    .line 303
    .line 304
    invoke-virtual {v4, v11}, La4/j0;->a(I)V

    .line 305
    .line 306
    .line 307
    add-int/lit8 v10, v10, 0x1

    .line 308
    .line 309
    goto :goto_2

    .line 310
    :cond_2
    iget-object v5, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->trackSelector:Landroidx/media3/exoplayer/trackselection/TrackSelector;

    .line 311
    .line 312
    invoke-virtual {v5}, Landroidx/media3/exoplayer/trackselection/TrackSelector;->isSetParametersSupported()Z

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    if-eqz v5, :cond_3

    .line 317
    .line 318
    const/16 v5, 0x1d

    .line 319
    .line 320
    invoke-virtual {v4, v5}, La4/j0;->a(I)V

    .line 321
    .line 322
    .line 323
    goto :goto_3

    .line 324
    :catchall_0
    move-exception v0

    .line 325
    goto/16 :goto_d

    .line 326
    .line 327
    :cond_3
    :goto_3
    iget-boolean v5, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->deviceVolumeControlEnabled:Z

    .line 328
    .line 329
    const/16 v9, 0x17

    .line 330
    .line 331
    if-eqz v5, :cond_4

    .line 332
    .line 333
    invoke-virtual {v4, v9}, La4/j0;->a(I)V

    .line 334
    .line 335
    .line 336
    :cond_4
    iget-boolean v5, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->deviceVolumeControlEnabled:Z

    .line 337
    .line 338
    if-eqz v5, :cond_5

    .line 339
    .line 340
    const/16 v5, 0x19

    .line 341
    .line 342
    invoke-virtual {v4, v5}, La4/j0;->a(I)V

    .line 343
    .line 344
    .line 345
    :cond_5
    iget-boolean v5, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->deviceVolumeControlEnabled:Z

    .line 346
    .line 347
    if-eqz v5, :cond_6

    .line 348
    .line 349
    const/16 v5, 0x21

    .line 350
    .line 351
    invoke-virtual {v4, v5}, La4/j0;->a(I)V

    .line 352
    .line 353
    .line 354
    :cond_6
    iget-boolean v5, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->deviceVolumeControlEnabled:Z

    .line 355
    .line 356
    if-eqz v5, :cond_7

    .line 357
    .line 358
    const/16 v5, 0x1a

    .line 359
    .line 360
    invoke-virtual {v4, v5}, La4/j0;->a(I)V

    .line 361
    .line 362
    .line 363
    :cond_7
    iget-boolean v5, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->deviceVolumeControlEnabled:Z

    .line 364
    .line 365
    if-eqz v5, :cond_8

    .line 366
    .line 367
    const/16 v5, 0x22

    .line 368
    .line 369
    invoke-virtual {v4, v5}, La4/j0;->a(I)V

    .line 370
    .line 371
    .line 372
    :cond_8
    new-instance v5, Landroidx/media3/common/z0;

    .line 373
    .line 374
    invoke-virtual {v4}, La4/j0;->b()Landroidx/media3/common/u;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    invoke-direct {v5, v4}, Landroidx/media3/common/z0;-><init>(Landroidx/media3/common/u;)V

    .line 379
    .line 380
    .line 381
    iput-object v5, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->permanentAvailableCommands:Landroidx/media3/common/z0;

    .line 382
    .line 383
    new-instance v5, Landroid/util/SparseBooleanArray;

    .line 384
    .line 385
    invoke-direct {v5}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 386
    .line 387
    .line 388
    move v10, v7

    .line 389
    :goto_4
    iget-object v11, v4, Landroidx/media3/common/u;->a:Landroid/util/SparseBooleanArray;

    .line 390
    .line 391
    invoke-virtual {v11}, Landroid/util/SparseBooleanArray;->size()I

    .line 392
    .line 393
    .line 394
    move-result v11

    .line 395
    if-ge v10, v11, :cond_9

    .line 396
    .line 397
    invoke-virtual {v4, v10}, Landroidx/media3/common/u;->b(I)I

    .line 398
    .line 399
    .line 400
    move-result v11

    .line 401
    const/4 v12, 0x0

    .line 402
    xor-int/2addr v12, v8

    .line 403
    invoke-static {v12}, Lh1/a;->j(Z)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v5, v11, v8}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 407
    .line 408
    .line 409
    add-int/lit8 v10, v10, 0x1

    .line 410
    .line 411
    goto :goto_4

    .line 412
    :cond_9
    const/4 v4, 0x0

    .line 413
    xor-int/2addr v4, v8

    .line 414
    invoke-static {v4}, Lh1/a;->j(Z)V

    .line 415
    .line 416
    .line 417
    const/4 v4, 0x4

    .line 418
    invoke-virtual {v5, v4, v8}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 419
    .line 420
    .line 421
    const/4 v10, 0x0

    .line 422
    xor-int/2addr v10, v8

    .line 423
    invoke-static {v10}, Lh1/a;->j(Z)V

    .line 424
    .line 425
    .line 426
    const/16 v10, 0xa

    .line 427
    .line 428
    invoke-virtual {v5, v10, v8}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 429
    .line 430
    .line 431
    new-instance v11, Landroidx/media3/common/z0;

    .line 432
    .line 433
    const/4 v12, 0x0

    .line 434
    xor-int/2addr v12, v8

    .line 435
    invoke-static {v12}, Lh1/a;->j(Z)V

    .line 436
    .line 437
    .line 438
    new-instance v12, Landroidx/media3/common/u;

    .line 439
    .line 440
    invoke-direct {v12, v5}, Landroidx/media3/common/u;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 441
    .line 442
    .line 443
    invoke-direct {v11, v12}, Landroidx/media3/common/z0;-><init>(Landroidx/media3/common/u;)V

    .line 444
    .line 445
    .line 446
    iput-object v11, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->availableCommands:Landroidx/media3/common/z0;

    .line 447
    .line 448
    iget-object v5, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->clock:Lh1/b;

    .line 449
    .line 450
    iget-object v11, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->applicationLooper:Landroid/os/Looper;

    .line 451
    .line 452
    check-cast v5, Lh1/z;

    .line 453
    .line 454
    invoke-virtual {v5, v11, v3}, Lh1/z;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lh1/b0;

    .line 455
    .line 456
    .line 457
    move-result-object v5

    .line 458
    iput-object v5, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfoUpdateHandler:Lh1/k;

    .line 459
    .line 460
    new-instance v5, Landroidx/media3/exoplayer/t;

    .line 461
    .line 462
    const/4 v11, 0x2

    .line 463
    invoke-direct {v5, v1, v11}, Landroidx/media3/exoplayer/t;-><init>(Landroidx/media3/exoplayer/ExoPlayerImpl;I)V

    .line 464
    .line 465
    .line 466
    iput-object v5, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfoUpdateListener:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdateListener;

    .line 467
    .line 468
    iget-object v12, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->emptyTrackSelectorResult:Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 469
    .line 470
    invoke-static {v12}, Landroidx/media3/exoplayer/PlaybackInfo;->createDummy(Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 471
    .line 472
    .line 473
    move-result-object v12

    .line 474
    iput-object v12, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 475
    .line 476
    iget-object v12, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->analyticsCollector:Landroidx/media3/exoplayer/analytics/AnalyticsCollector;

    .line 477
    .line 478
    iget-object v13, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->wrappingPlayer:Landroidx/media3/common/d1;

    .line 479
    .line 480
    iget-object v14, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->applicationLooper:Landroid/os/Looper;

    .line 481
    .line 482
    invoke-interface {v12, v13, v14}, Landroidx/media3/exoplayer/analytics/AnalyticsCollector;->setPlayer(Landroidx/media3/common/d1;Landroid/os/Looper;)V

    .line 483
    .line 484
    .line 485
    sget v12, Lh1/i0;->a:I

    .line 486
    .line 487
    const/16 v13, 0x1f

    .line 488
    .line 489
    if-ge v12, v13, :cond_a

    .line 490
    .line 491
    new-instance v13, Landroidx/media3/exoplayer/analytics/PlayerId;

    .line 492
    .line 493
    iget-object v14, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->playerName:Ljava/lang/String;

    .line 494
    .line 495
    invoke-direct {v13, v14}, Landroidx/media3/exoplayer/analytics/PlayerId;-><init>(Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    :goto_5
    move-object/from16 v29, v13

    .line 499
    .line 500
    move v13, v11

    .line 501
    goto :goto_6

    .line 502
    :cond_a
    iget-object v13, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->applicationContext:Landroid/content/Context;

    .line 503
    .line 504
    iget-boolean v14, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->usePlatformDiagnostics:Z

    .line 505
    .line 506
    iget-object v15, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->playerName:Ljava/lang/String;

    .line 507
    .line 508
    invoke-static {v13, v1, v14, v15}, Landroidx/media3/exoplayer/ExoPlayerImpl$Api31;->registerMediaMetricsListener(Landroid/content/Context;Landroidx/media3/exoplayer/ExoPlayerImpl;ZLjava/lang/String;)Landroidx/media3/exoplayer/analytics/PlayerId;

    .line 509
    .line 510
    .line 511
    move-result-object v13

    .line 512
    goto :goto_5

    .line 513
    :goto_6
    new-instance v11, Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 514
    .line 515
    move v14, v12

    .line 516
    iget-object v12, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 517
    .line 518
    move v15, v13

    .line 519
    iget-object v13, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->trackSelector:Landroidx/media3/exoplayer/trackselection/TrackSelector;

    .line 520
    .line 521
    move/from16 v16, v14

    .line 522
    .line 523
    iget-object v14, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->emptyTrackSelectorResult:Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 524
    .line 525
    iget-object v15, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->loadControlSupplier:Le6/i;

    .line 526
    .line 527
    invoke-interface {v15}, Le6/i;->get()Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v15

    .line 531
    check-cast v15, Landroidx/media3/exoplayer/LoadControl;

    .line 532
    .line 533
    iget-object v4, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->bandwidthMeter:Landroidx/media3/exoplayer/upstream/BandwidthMeter;

    .line 534
    .line 535
    iget v10, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->repeatMode:I

    .line 536
    .line 537
    iget-boolean v3, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->shuffleModeEnabled:Z

    .line 538
    .line 539
    iget-object v9, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->analyticsCollector:Landroidx/media3/exoplayer/analytics/AnalyticsCollector;

    .line 540
    .line 541
    iget-object v8, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->seekParameters:Landroidx/media3/exoplayer/SeekParameters;

    .line 542
    .line 543
    iget-object v7, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->livePlaybackSpeedControl:Landroidx/media3/exoplayer/LivePlaybackSpeedControl;

    .line 544
    .line 545
    move/from16 v18, v3

    .line 546
    .line 547
    move-object/from16 v17, v4

    .line 548
    .line 549
    iget-wide v3, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->releaseTimeoutMs:J

    .line 550
    .line 551
    move-wide/from16 v22, v3

    .line 552
    .line 553
    iget-boolean v3, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->pauseAtEndOfMediaItems:Z

    .line 554
    .line 555
    iget-boolean v4, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->dynamicSchedulingEnabled:Z

    .line 556
    .line 557
    move/from16 v24, v3

    .line 558
    .line 559
    iget-object v3, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->applicationLooper:Landroid/os/Looper;

    .line 560
    .line 561
    move-object/from16 v26, v3

    .line 562
    .line 563
    iget-object v3, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->clock:Lh1/b;

    .line 564
    .line 565
    move-object/from16 v27, v3

    .line 566
    .line 567
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->playbackLooperProvider:Landroidx/media3/exoplayer/PlaybackLooperProvider;

    .line 568
    .line 569
    move-object/from16 v30, v3

    .line 570
    .line 571
    iget-object v3, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->preloadConfiguration:Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;

    .line 572
    .line 573
    move-object/from16 v31, v3

    .line 574
    .line 575
    move/from16 v25, v4

    .line 576
    .line 577
    move-object/from16 v28, v5

    .line 578
    .line 579
    move-object/from16 v21, v7

    .line 580
    .line 581
    move-object/from16 v20, v8

    .line 582
    .line 583
    move-object/from16 v19, v9

    .line 584
    .line 585
    move/from16 v3, v16

    .line 586
    .line 587
    move-object/from16 v16, v17

    .line 588
    .line 589
    const/4 v4, 0x2

    .line 590
    move/from16 v17, v10

    .line 591
    .line 592
    invoke-direct/range {v11 .. v31}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;-><init>([Landroidx/media3/exoplayer/Renderer;Landroidx/media3/exoplayer/trackselection/TrackSelector;Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;Landroidx/media3/exoplayer/LoadControl;Landroidx/media3/exoplayer/upstream/BandwidthMeter;IZLandroidx/media3/exoplayer/analytics/AnalyticsCollector;Landroidx/media3/exoplayer/SeekParameters;Landroidx/media3/exoplayer/LivePlaybackSpeedControl;JZZLandroid/os/Looper;Lh1/b;Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdateListener;Landroidx/media3/exoplayer/analytics/PlayerId;Landroidx/media3/exoplayer/PlaybackLooperProvider;Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;)V

    .line 593
    .line 594
    .line 595
    iput-object v11, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->internalPlayer:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 596
    .line 597
    const/high16 v5, 0x3f800000    # 1.0f

    .line 598
    .line 599
    iput v5, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->volume:F

    .line 600
    .line 601
    const/4 v5, 0x0

    .line 602
    iput v5, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->repeatMode:I

    .line 603
    .line 604
    sget-object v7, Landroidx/media3/common/r0;->K:Landroidx/media3/common/r0;

    .line 605
    .line 606
    iput-object v7, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaMetadata:Landroidx/media3/common/r0;

    .line 607
    .line 608
    iput-object v7, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->playlistMetadata:Landroidx/media3/common/r0;

    .line 609
    .line 610
    iput-object v7, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->staticAndDynamicMediaMetadata:Landroidx/media3/common/r0;

    .line 611
    .line 612
    const/4 v7, -0x1

    .line 613
    iput v7, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskingWindowIndex:I

    .line 614
    .line 615
    iget-object v8, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->applicationContext:Landroid/content/Context;

    .line 616
    .line 617
    invoke-virtual {v8, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v8

    .line 621
    check-cast v8, Landroid/media/AudioManager;

    .line 622
    .line 623
    if-nez v8, :cond_b

    .line 624
    .line 625
    goto :goto_7

    .line 626
    :cond_b
    invoke-virtual {v8}, Landroid/media/AudioManager;->generateAudioSessionId()I

    .line 627
    .line 628
    .line 629
    move-result v7

    .line 630
    :goto_7
    iput v7, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioSessionId:I

    .line 631
    .line 632
    sget-object v7, Lg1/c;->b:Lg1/c;

    .line 633
    .line 634
    iput-object v7, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->currentCueGroup:Lg1/c;

    .line 635
    .line 636
    const/4 v7, 0x1

    .line 637
    iput-boolean v7, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->throwsWhenUsingWrongThread:Z

    .line 638
    .line 639
    iget-object v7, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->analyticsCollector:Landroidx/media3/exoplayer/analytics/AnalyticsCollector;

    .line 640
    .line 641
    invoke-virtual {v1, v7}, Landroidx/media3/exoplayer/ExoPlayerImpl;->addListener(Landroidx/media3/common/b1;)V

    .line 642
    .line 643
    .line 644
    iget-object v7, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->bandwidthMeter:Landroidx/media3/exoplayer/upstream/BandwidthMeter;

    .line 645
    .line 646
    new-instance v8, Landroid/os/Handler;

    .line 647
    .line 648
    iget-object v9, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->applicationLooper:Landroid/os/Looper;

    .line 649
    .line 650
    invoke-direct {v8, v9}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 651
    .line 652
    .line 653
    iget-object v9, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->analyticsCollector:Landroidx/media3/exoplayer/analytics/AnalyticsCollector;

    .line 654
    .line 655
    invoke-interface {v7, v8, v9}, Landroidx/media3/exoplayer/upstream/BandwidthMeter;->addEventListener(Landroid/os/Handler;Landroidx/media3/exoplayer/upstream/BandwidthMeter$EventListener;)V

    .line 656
    .line 657
    .line 658
    iget-object v7, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->componentListener:Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;

    .line 659
    .line 660
    invoke-virtual {v1, v7}, Landroidx/media3/exoplayer/ExoPlayerImpl;->addAudioOffloadListener(Landroidx/media3/exoplayer/ExoPlayer$AudioOffloadListener;)V

    .line 661
    .line 662
    .line 663
    iget-wide v7, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->foregroundModeTimeoutMs:J

    .line 664
    .line 665
    const-wide/16 v9, 0x0

    .line 666
    .line 667
    cmp-long v9, v7, v9

    .line 668
    .line 669
    if-lez v9, :cond_c

    .line 670
    .line 671
    invoke-virtual {v11, v7, v8}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->experimentalSetForegroundModeTimeoutMs(J)V

    .line 672
    .line 673
    .line 674
    :cond_c
    new-instance v7, Landroidx/media3/exoplayer/AudioBecomingNoisyManager;

    .line 675
    .line 676
    iget-object v8, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->context:Landroid/content/Context;

    .line 677
    .line 678
    iget-object v9, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->componentListener:Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;

    .line 679
    .line 680
    invoke-direct {v7, v8, v6, v9}, Landroidx/media3/exoplayer/AudioBecomingNoisyManager;-><init>(Landroid/content/Context;Landroid/os/Handler;Landroidx/media3/exoplayer/AudioBecomingNoisyManager$EventListener;)V

    .line 681
    .line 682
    .line 683
    iput-object v7, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioBecomingNoisyManager:Landroidx/media3/exoplayer/AudioBecomingNoisyManager;

    .line 684
    .line 685
    iget-boolean v8, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->handleAudioBecomingNoisy:Z

    .line 686
    .line 687
    invoke-virtual {v7, v8}, Landroidx/media3/exoplayer/AudioBecomingNoisyManager;->setEnabled(Z)V

    .line 688
    .line 689
    .line 690
    new-instance v7, Landroidx/media3/exoplayer/AudioFocusManager;

    .line 691
    .line 692
    iget-object v8, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->context:Landroid/content/Context;

    .line 693
    .line 694
    iget-object v9, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->componentListener:Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;

    .line 695
    .line 696
    invoke-direct {v7, v8, v6, v9}, Landroidx/media3/exoplayer/AudioFocusManager;-><init>(Landroid/content/Context;Landroid/os/Handler;Landroidx/media3/exoplayer/AudioFocusManager$PlayerControl;)V

    .line 697
    .line 698
    .line 699
    iput-object v7, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioFocusManager:Landroidx/media3/exoplayer/AudioFocusManager;

    .line 700
    .line 701
    iget-boolean v8, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->handleAudioFocus:Z

    .line 702
    .line 703
    if-eqz v8, :cond_d

    .line 704
    .line 705
    iget-object v8, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioAttributes:Landroidx/media3/common/g;

    .line 706
    .line 707
    goto :goto_8

    .line 708
    :cond_d
    const/4 v8, 0x0

    .line 709
    :goto_8
    invoke-virtual {v7, v8}, Landroidx/media3/exoplayer/AudioFocusManager;->setAudioAttributes(Landroidx/media3/common/g;)V

    .line 710
    .line 711
    .line 712
    iget-object v7, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->suitableOutputChecker:Landroidx/media3/exoplayer/SuitableOutputChecker;

    .line 713
    .line 714
    iput-object v7, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->suitableOutputChecker:Landroidx/media3/exoplayer/SuitableOutputChecker;

    .line 715
    .line 716
    const/4 v8, 0x3

    .line 717
    if-eqz v7, :cond_e

    .line 718
    .line 719
    const/16 v9, 0x23

    .line 720
    .line 721
    if-lt v3, v9, :cond_e

    .line 722
    .line 723
    new-instance v2, Landroidx/media3/exoplayer/t;

    .line 724
    .line 725
    invoke-direct {v2, v1, v8}, Landroidx/media3/exoplayer/t;-><init>(Landroidx/media3/exoplayer/ExoPlayerImpl;I)V

    .line 726
    .line 727
    .line 728
    invoke-interface {v7, v2}, Landroidx/media3/exoplayer/SuitableOutputChecker;->enable(Landroidx/media3/exoplayer/SuitableOutputChecker$Callback;)V

    .line 729
    .line 730
    .line 731
    goto :goto_9

    .line 732
    :cond_e
    iget-boolean v7, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->suppressPlaybackOnUnsuitableOutput:Z

    .line 733
    .line 734
    if-eqz v7, :cond_f

    .line 735
    .line 736
    const/16 v7, 0x17

    .line 737
    .line 738
    if-lt v3, v7, :cond_f

    .line 739
    .line 740
    iget-object v3, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->applicationContext:Landroid/content/Context;

    .line 741
    .line 742
    invoke-virtual {v3, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v2

    .line 746
    check-cast v2, Landroid/media/AudioManager;

    .line 747
    .line 748
    iput-object v2, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioManager:Landroid/media/AudioManager;

    .line 749
    .line 750
    new-instance v3, Landroidx/media3/exoplayer/ExoPlayerImpl$NoSuitableOutputPlaybackSuppressionAudioDeviceCallback;

    .line 751
    .line 752
    const/4 v7, 0x0

    .line 753
    invoke-direct {v3, v1, v7}, Landroidx/media3/exoplayer/ExoPlayerImpl$NoSuitableOutputPlaybackSuppressionAudioDeviceCallback;-><init>(Landroidx/media3/exoplayer/ExoPlayerImpl;Landroidx/media3/exoplayer/ExoPlayerImpl$1;)V

    .line 754
    .line 755
    .line 756
    new-instance v7, Landroid/os/Handler;

    .line 757
    .line 758
    iget-object v9, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->applicationLooper:Landroid/os/Looper;

    .line 759
    .line 760
    invoke-direct {v7, v9}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 761
    .line 762
    .line 763
    invoke-static {v2, v3, v7}, Landroidx/media3/exoplayer/ExoPlayerImpl$Api23;->registerAudioDeviceCallback(Landroid/media/AudioManager;Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V

    .line 764
    .line 765
    .line 766
    :cond_f
    :goto_9
    iget-boolean v2, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->deviceVolumeControlEnabled:Z

    .line 767
    .line 768
    if-eqz v2, :cond_10

    .line 769
    .line 770
    new-instance v2, Landroidx/media3/exoplayer/StreamVolumeManager;

    .line 771
    .line 772
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->context:Landroid/content/Context;

    .line 773
    .line 774
    iget-object v7, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->componentListener:Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;

    .line 775
    .line 776
    iget-object v9, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioAttributes:Landroidx/media3/common/g;

    .line 777
    .line 778
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 779
    .line 780
    .line 781
    invoke-direct {v2, v3, v6, v7, v8}, Landroidx/media3/exoplayer/StreamVolumeManager;-><init>(Landroid/content/Context;Landroid/os/Handler;Landroidx/media3/exoplayer/StreamVolumeManager$Listener;I)V

    .line 782
    .line 783
    .line 784
    iput-object v2, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->streamVolumeManager:Landroidx/media3/exoplayer/StreamVolumeManager;

    .line 785
    .line 786
    goto :goto_a

    .line 787
    :cond_10
    const/4 v7, 0x0

    .line 788
    iput-object v7, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->streamVolumeManager:Landroidx/media3/exoplayer/StreamVolumeManager;

    .line 789
    .line 790
    :goto_a
    new-instance v2, Landroidx/media3/exoplayer/WakeLockManager;

    .line 791
    .line 792
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->context:Landroid/content/Context;

    .line 793
    .line 794
    invoke-direct {v2, v3}, Landroidx/media3/exoplayer/WakeLockManager;-><init>(Landroid/content/Context;)V

    .line 795
    .line 796
    .line 797
    iput-object v2, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->wakeLockManager:Landroidx/media3/exoplayer/WakeLockManager;

    .line 798
    .line 799
    iget v3, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->wakeMode:I

    .line 800
    .line 801
    if-eqz v3, :cond_11

    .line 802
    .line 803
    const/4 v3, 0x1

    .line 804
    goto :goto_b

    .line 805
    :cond_11
    move v3, v5

    .line 806
    :goto_b
    invoke-virtual {v2, v3}, Landroidx/media3/exoplayer/WakeLockManager;->setEnabled(Z)V

    .line 807
    .line 808
    .line 809
    new-instance v2, Landroidx/media3/exoplayer/WifiLockManager;

    .line 810
    .line 811
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->context:Landroid/content/Context;

    .line 812
    .line 813
    invoke-direct {v2, v3}, Landroidx/media3/exoplayer/WifiLockManager;-><init>(Landroid/content/Context;)V

    .line 814
    .line 815
    .line 816
    iput-object v2, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->wifiLockManager:Landroidx/media3/exoplayer/WifiLockManager;

    .line 817
    .line 818
    iget v0, v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->wakeMode:I

    .line 819
    .line 820
    if-ne v0, v4, :cond_12

    .line 821
    .line 822
    const/4 v7, 0x1

    .line 823
    goto :goto_c

    .line 824
    :cond_12
    move v7, v5

    .line 825
    :goto_c
    invoke-virtual {v2, v7}, Landroidx/media3/exoplayer/WifiLockManager;->setEnabled(Z)V

    .line 826
    .line 827
    .line 828
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->streamVolumeManager:Landroidx/media3/exoplayer/StreamVolumeManager;

    .line 829
    .line 830
    invoke-static {v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->createDeviceInfo(Landroidx/media3/exoplayer/StreamVolumeManager;)Landroidx/media3/common/q;

    .line 831
    .line 832
    .line 833
    move-result-object v0

    .line 834
    iput-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->deviceInfo:Landroidx/media3/common/q;

    .line 835
    .line 836
    sget-object v0, Landroidx/media3/common/d2;->d:Landroidx/media3/common/d2;

    .line 837
    .line 838
    iput-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->videoSize:Landroidx/media3/common/d2;

    .line 839
    .line 840
    sget-object v0, Lh1/y;->c:Lh1/y;

    .line 841
    .line 842
    iput-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->surfaceSize:Lh1/y;

    .line 843
    .line 844
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->trackSelector:Landroidx/media3/exoplayer/trackselection/TrackSelector;

    .line 845
    .line 846
    iget-object v2, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioAttributes:Landroidx/media3/common/g;

    .line 847
    .line 848
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/trackselection/TrackSelector;->setAudioAttributes(Landroidx/media3/common/g;)V

    .line 849
    .line 850
    .line 851
    iget v0, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioSessionId:I

    .line 852
    .line 853
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 854
    .line 855
    .line 856
    move-result-object v0

    .line 857
    const/16 v2, 0xa

    .line 858
    .line 859
    const/4 v7, 0x1

    .line 860
    invoke-direct {v1, v7, v2, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendRendererMessage(IILjava/lang/Object;)V

    .line 861
    .line 862
    .line 863
    iget v0, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioSessionId:I

    .line 864
    .line 865
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 866
    .line 867
    .line 868
    move-result-object v0

    .line 869
    invoke-direct {v1, v4, v2, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendRendererMessage(IILjava/lang/Object;)V

    .line 870
    .line 871
    .line 872
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioAttributes:Landroidx/media3/common/g;

    .line 873
    .line 874
    invoke-direct {v1, v7, v8, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendRendererMessage(IILjava/lang/Object;)V

    .line 875
    .line 876
    .line 877
    iget v0, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->videoScalingMode:I

    .line 878
    .line 879
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    const/4 v2, 0x4

    .line 884
    invoke-direct {v1, v4, v2, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendRendererMessage(IILjava/lang/Object;)V

    .line 885
    .line 886
    .line 887
    iget v0, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->videoChangeFrameRateStrategy:I

    .line 888
    .line 889
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    const/4 v2, 0x5

    .line 894
    invoke-direct {v1, v4, v2, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendRendererMessage(IILjava/lang/Object;)V

    .line 895
    .line 896
    .line 897
    iget-boolean v0, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->skipSilenceEnabled:Z

    .line 898
    .line 899
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    const/16 v2, 0x9

    .line 904
    .line 905
    const/4 v7, 0x1

    .line 906
    invoke-direct {v1, v7, v2, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendRendererMessage(IILjava/lang/Object;)V

    .line 907
    .line 908
    .line 909
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->frameMetadataListener:Landroidx/media3/exoplayer/ExoPlayerImpl$FrameMetadataListener;

    .line 910
    .line 911
    const/4 v2, 0x7

    .line 912
    invoke-direct {v1, v4, v2, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendRendererMessage(IILjava/lang/Object;)V

    .line 913
    .line 914
    .line 915
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->frameMetadataListener:Landroidx/media3/exoplayer/ExoPlayerImpl$FrameMetadataListener;

    .line 916
    .line 917
    const/4 v2, 0x6

    .line 918
    const/16 v3, 0x8

    .line 919
    .line 920
    invoke-direct {v1, v2, v3, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendRendererMessage(IILjava/lang/Object;)V

    .line 921
    .line 922
    .line 923
    iget v0, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->priority:I

    .line 924
    .line 925
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    const/16 v2, 0x10

    .line 930
    .line 931
    invoke-direct {v1, v2, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendRendererMessage(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 932
    .line 933
    .line 934
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->constructorFinished:Lh1/e;

    .line 935
    .line 936
    invoke-virtual {v0}, Lh1/e;->c()Z

    .line 937
    .line 938
    .line 939
    return-void

    .line 940
    :goto_d
    iget-object v2, v1, Landroidx/media3/exoplayer/ExoPlayerImpl;->constructorFinished:Lh1/e;

    .line 941
    .line 942
    invoke-virtual {v2}, Lh1/e;->c()Z

    .line 943
    .line 944
    .line 945
    throw v0

    .line 946
    nop

    .line 947
    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x1f
        0x14
        0x1e
        0x15
        0x23
        0x16
        0x18
        0x1b
        0x1c
        0x20
    .end array-data
.end method

.method public static synthetic A(Landroidx/media3/exoplayer/PlaybackInfo;ILandroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$updatePlaybackInfo$12(Landroidx/media3/exoplayer/PlaybackInfo;ILandroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic B(Landroidx/media3/exoplayer/ExoPlayerImpl;Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$new$2(Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic C(Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$release$5(Landroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic D(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$updatePlaybackInfo$20(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic E(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$updatePlaybackInfo$17(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$1002(Landroidx/media3/exoplayer/ExoPlayerImpl;Landroidx/media3/exoplayer/DecoderCounters;)Landroidx/media3/exoplayer/DecoderCounters;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioDecoderCounters:Landroidx/media3/exoplayer/DecoderCounters;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1102(Landroidx/media3/exoplayer/ExoPlayerImpl;Landroidx/media3/common/w;)Landroidx/media3/common/w;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioFormat:Landroidx/media3/common/w;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1200(Landroidx/media3/exoplayer/ExoPlayerImpl;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->skipSilenceEnabled:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$1202(Landroidx/media3/exoplayer/ExoPlayerImpl;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->skipSilenceEnabled:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1302(Landroidx/media3/exoplayer/ExoPlayerImpl;Lg1/c;)Lg1/c;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->currentCueGroup:Lg1/c;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1400(Landroidx/media3/exoplayer/ExoPlayerImpl;)Landroidx/media3/common/r0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->staticAndDynamicMediaMetadata:Landroidx/media3/common/r0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1402(Landroidx/media3/exoplayer/ExoPlayerImpl;Landroidx/media3/common/r0;)Landroidx/media3/common/r0;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->staticAndDynamicMediaMetadata:Landroidx/media3/common/r0;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1500(Landroidx/media3/exoplayer/ExoPlayerImpl;)Landroidx/media3/common/r0;
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->buildUpdatedMediaMetadata()Landroidx/media3/common/r0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$1600(Landroidx/media3/exoplayer/ExoPlayerImpl;)Landroidx/media3/common/r0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaMetadata:Landroidx/media3/common/r0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1602(Landroidx/media3/exoplayer/ExoPlayerImpl;Landroidx/media3/common/r0;)Landroidx/media3/common/r0;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaMetadata:Landroidx/media3/common/r0;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1700(Landroidx/media3/exoplayer/ExoPlayerImpl;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->surfaceHolderSurfaceIsVideoOutput:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$1800(Landroidx/media3/exoplayer/ExoPlayerImpl;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setVideoOutputInternal(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$1900(Landroidx/media3/exoplayer/ExoPlayerImpl;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImpl;->maybeNotifySurfaceSizeChanged(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$2000(Landroidx/media3/exoplayer/ExoPlayerImpl;Landroid/graphics/SurfaceTexture;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setSurfaceTextureInternal(Landroid/graphics/SurfaceTexture;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$2100(Landroidx/media3/exoplayer/ExoPlayerImpl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendVolumeToRenderers()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$2200(I)I
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getPlayWhenReadyChangeReason(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic access$2300(Landroidx/media3/exoplayer/ExoPlayerImpl;ZII)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updatePlayWhenReady(ZII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$2400(Landroidx/media3/exoplayer/ExoPlayerImpl;)Landroidx/media3/exoplayer/StreamVolumeManager;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->streamVolumeManager:Landroidx/media3/exoplayer/StreamVolumeManager;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2500(Landroidx/media3/exoplayer/StreamVolumeManager;)Landroidx/media3/common/q;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->createDeviceInfo(Landroidx/media3/exoplayer/StreamVolumeManager;)Landroidx/media3/common/q;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$2600(Landroidx/media3/exoplayer/ExoPlayerImpl;)Landroidx/media3/common/q;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->deviceInfo:Landroidx/media3/common/q;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2602(Landroidx/media3/exoplayer/ExoPlayerImpl;Landroidx/media3/common/q;)Landroidx/media3/common/q;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->deviceInfo:Landroidx/media3/common/q;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$2700(Landroidx/media3/exoplayer/ExoPlayerImpl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updateWakeAndWifiLock()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$2800(Landroidx/media3/exoplayer/ExoPlayerImpl;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->hasSupportedAudioOutput()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic access$2900(Landroidx/media3/exoplayer/ExoPlayerImpl;)Landroidx/media3/exoplayer/PlaybackInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$3000(Landroidx/media3/exoplayer/ExoPlayerImpl;ZII)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(ZII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$402(Landroidx/media3/exoplayer/ExoPlayerImpl;Landroidx/media3/exoplayer/DecoderCounters;)Landroidx/media3/exoplayer/DecoderCounters;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->videoDecoderCounters:Landroidx/media3/exoplayer/DecoderCounters;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$500(Landroidx/media3/exoplayer/ExoPlayerImpl;)Landroidx/media3/exoplayer/analytics/AnalyticsCollector;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->analyticsCollector:Landroidx/media3/exoplayer/analytics/AnalyticsCollector;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$602(Landroidx/media3/exoplayer/ExoPlayerImpl;Landroidx/media3/common/w;)Landroidx/media3/common/w;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->videoFormat:Landroidx/media3/common/w;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$702(Landroidx/media3/exoplayer/ExoPlayerImpl;Landroidx/media3/common/d2;)Landroidx/media3/common/d2;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->videoSize:Landroidx/media3/common/d2;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$800(Landroidx/media3/exoplayer/ExoPlayerImpl;)Lh1/p;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$900(Landroidx/media3/exoplayer/ExoPlayerImpl;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->videoOutput:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method private addMediaSourceHolders(ILjava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/source/MediaSource;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/MediaSourceList$MediaSourceHolder;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    new-instance v2, Landroidx/media3/exoplayer/MediaSourceList$MediaSourceHolder;

    .line 14
    .line 15
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Landroidx/media3/exoplayer/source/MediaSource;

    .line 20
    .line 21
    iget-boolean v4, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->useLazyPreparation:Z

    .line 22
    .line 23
    invoke-direct {v2, v3, v4}, Landroidx/media3/exoplayer/MediaSourceList$MediaSourceHolder;-><init>(Landroidx/media3/exoplayer/source/MediaSource;Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaSourceHolderSnapshots:Ljava/util/List;

    .line 30
    .line 31
    add-int v4, v1, p1

    .line 32
    .line 33
    new-instance v5, Landroidx/media3/exoplayer/ExoPlayerImpl$MediaSourceHolderSnapshot;

    .line 34
    .line 35
    iget-object v6, v2, Landroidx/media3/exoplayer/MediaSourceList$MediaSourceHolder;->uid:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v2, v2, Landroidx/media3/exoplayer/MediaSourceList$MediaSourceHolder;->mediaSource:Landroidx/media3/exoplayer/source/MaskingMediaSource;

    .line 38
    .line 39
    invoke-direct {v5, v6, v2}, Landroidx/media3/exoplayer/ExoPlayerImpl$MediaSourceHolderSnapshot;-><init>(Ljava/lang/Object;Landroidx/media3/exoplayer/source/MaskingMediaSource;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v3, v4, v5}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->shuffleOrder:Landroidx/media3/exoplayer/source/ShuffleOrder;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-interface {p2, p1, v1}, Landroidx/media3/exoplayer/source/ShuffleOrder;->cloneAndInsert(II)Landroidx/media3/exoplayer/source/ShuffleOrder;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->shuffleOrder:Landroidx/media3/exoplayer/source/ShuffleOrder;

    .line 59
    .line 60
    return-object v0
.end method

.method private addMediaSourcesInternal(Landroidx/media3/exoplayer/PlaybackInfo;ILjava/util/List;)Landroidx/media3/exoplayer/PlaybackInfo;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/PlaybackInfo;",
            "I",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/source/MediaSource;",
            ">;)",
            "Landroidx/media3/exoplayer/PlaybackInfo;"
        }
    .end annotation

    .line 1
    iget-object v1, p1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 2
    .line 3
    iget v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    iput v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    .line 8
    .line 9
    invoke-direct {p0, p2, p3}, Landroidx/media3/exoplayer/ExoPlayerImpl;->addMediaSourceHolders(ILjava/util/List;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->createMaskingTimeline()Landroidx/media3/common/p1;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getCurrentWindowIndexInternal(Landroidx/media3/exoplayer/PlaybackInfo;)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getContentPositionInternal(Landroidx/media3/exoplayer/PlaybackInfo;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    move-object v0, p0

    .line 26
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getPeriodPositionUsAfterTimelineChanged(Landroidx/media3/common/p1;Landroidx/media3/common/p1;IJ)Landroid/util/Pair;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-direct {p0, p1, v2, v1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskTimelineAndPosition(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/p1;Landroid/util/Pair;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->internalPlayer:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 35
    .line 36
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->shuffleOrder:Landroidx/media3/exoplayer/source/ShuffleOrder;

    .line 37
    .line 38
    invoke-virtual {v1, p2, p3, v2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->addMediaSources(ILjava/util/List;Landroidx/media3/exoplayer/source/ShuffleOrder;)V

    .line 39
    .line 40
    .line 41
    return-object p1
.end method

.method private buildUpdatedMediaMetadata()Landroidx/media3/common/r0;
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getCurrentTimeline()Landroidx/media3/common/p1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->staticAndDynamicMediaMetadata:Landroidx/media3/common/r0;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getCurrentMediaItemIndex()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v2, p0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v0, v0, Landroidx/media3/common/o1;->c:Landroidx/media3/common/o0;

    .line 25
    .line 26
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->staticAndDynamicMediaMetadata:Landroidx/media3/common/r0;

    .line 27
    .line 28
    invoke-virtual {v1}, Landroidx/media3/common/r0;->a()Landroidx/media3/common/q0;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v0, v0, Landroidx/media3/common/o0;->d:Landroidx/media3/common/r0;

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    goto/16 :goto_2

    .line 37
    .line 38
    :cond_1
    iget-object v2, v0, Landroidx/media3/common/r0;->J:Lf6/m0;

    .line 39
    .line 40
    iget-object v3, v0, Landroidx/media3/common/r0;->k:[B

    .line 41
    .line 42
    iget-object v4, v0, Landroidx/media3/common/r0;->a:Ljava/lang/CharSequence;

    .line 43
    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    iput-object v4, v1, Landroidx/media3/common/q0;->a:Ljava/lang/CharSequence;

    .line 47
    .line 48
    :cond_2
    iget-object v4, v0, Landroidx/media3/common/r0;->b:Ljava/lang/CharSequence;

    .line 49
    .line 50
    if-eqz v4, :cond_3

    .line 51
    .line 52
    iput-object v4, v1, Landroidx/media3/common/q0;->b:Ljava/lang/CharSequence;

    .line 53
    .line 54
    :cond_3
    iget-object v4, v0, Landroidx/media3/common/r0;->c:Ljava/lang/CharSequence;

    .line 55
    .line 56
    if-eqz v4, :cond_4

    .line 57
    .line 58
    iput-object v4, v1, Landroidx/media3/common/q0;->c:Ljava/lang/CharSequence;

    .line 59
    .line 60
    :cond_4
    iget-object v4, v0, Landroidx/media3/common/r0;->d:Ljava/lang/CharSequence;

    .line 61
    .line 62
    if-eqz v4, :cond_5

    .line 63
    .line 64
    iput-object v4, v1, Landroidx/media3/common/q0;->d:Ljava/lang/CharSequence;

    .line 65
    .line 66
    :cond_5
    iget-object v4, v0, Landroidx/media3/common/r0;->e:Ljava/lang/CharSequence;

    .line 67
    .line 68
    if-eqz v4, :cond_6

    .line 69
    .line 70
    iput-object v4, v1, Landroidx/media3/common/q0;->e:Ljava/lang/CharSequence;

    .line 71
    .line 72
    :cond_6
    iget-object v4, v0, Landroidx/media3/common/r0;->f:Ljava/lang/CharSequence;

    .line 73
    .line 74
    if-eqz v4, :cond_7

    .line 75
    .line 76
    iput-object v4, v1, Landroidx/media3/common/q0;->f:Ljava/lang/CharSequence;

    .line 77
    .line 78
    :cond_7
    iget-object v4, v0, Landroidx/media3/common/r0;->g:Ljava/lang/CharSequence;

    .line 79
    .line 80
    if-eqz v4, :cond_8

    .line 81
    .line 82
    iput-object v4, v1, Landroidx/media3/common/q0;->g:Ljava/lang/CharSequence;

    .line 83
    .line 84
    :cond_8
    iget-object v4, v0, Landroidx/media3/common/r0;->h:Ljava/lang/Long;

    .line 85
    .line 86
    if-eqz v4, :cond_a

    .line 87
    .line 88
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 89
    .line 90
    .line 91
    move-result-wide v5

    .line 92
    const-wide/16 v7, 0x0

    .line 93
    .line 94
    cmp-long v5, v5, v7

    .line 95
    .line 96
    if-ltz v5, :cond_9

    .line 97
    .line 98
    const/4 v5, 0x1

    .line 99
    goto :goto_0

    .line 100
    :cond_9
    const/4 v5, 0x0

    .line 101
    :goto_0
    invoke-static {v5}, Lh1/a;->d(Z)V

    .line 102
    .line 103
    .line 104
    iput-object v4, v1, Landroidx/media3/common/q0;->h:Ljava/lang/Long;

    .line 105
    .line 106
    :cond_a
    iget-object v4, v0, Landroidx/media3/common/r0;->i:Landroidx/media3/common/h1;

    .line 107
    .line 108
    if-eqz v4, :cond_b

    .line 109
    .line 110
    iput-object v4, v1, Landroidx/media3/common/q0;->i:Landroidx/media3/common/h1;

    .line 111
    .line 112
    :cond_b
    iget-object v4, v0, Landroidx/media3/common/r0;->j:Landroidx/media3/common/h1;

    .line 113
    .line 114
    if-eqz v4, :cond_c

    .line 115
    .line 116
    iput-object v4, v1, Landroidx/media3/common/q0;->j:Landroidx/media3/common/h1;

    .line 117
    .line 118
    :cond_c
    iget-object v4, v0, Landroidx/media3/common/r0;->m:Landroid/net/Uri;

    .line 119
    .line 120
    if-nez v4, :cond_d

    .line 121
    .line 122
    if-eqz v3, :cond_f

    .line 123
    .line 124
    :cond_d
    iput-object v4, v1, Landroidx/media3/common/q0;->m:Landroid/net/Uri;

    .line 125
    .line 126
    iget-object v4, v0, Landroidx/media3/common/r0;->l:Ljava/lang/Integer;

    .line 127
    .line 128
    if-nez v3, :cond_e

    .line 129
    .line 130
    const/4 v3, 0x0

    .line 131
    goto :goto_1

    .line 132
    :cond_e
    invoke-virtual {v3}, [B->clone()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    check-cast v3, [B

    .line 137
    .line 138
    :goto_1
    iput-object v3, v1, Landroidx/media3/common/q0;->k:[B

    .line 139
    .line 140
    iput-object v4, v1, Landroidx/media3/common/q0;->l:Ljava/lang/Integer;

    .line 141
    .line 142
    :cond_f
    iget-object v3, v0, Landroidx/media3/common/r0;->n:Ljava/lang/Integer;

    .line 143
    .line 144
    if-eqz v3, :cond_10

    .line 145
    .line 146
    iput-object v3, v1, Landroidx/media3/common/q0;->n:Ljava/lang/Integer;

    .line 147
    .line 148
    :cond_10
    iget-object v3, v0, Landroidx/media3/common/r0;->o:Ljava/lang/Integer;

    .line 149
    .line 150
    if-eqz v3, :cond_11

    .line 151
    .line 152
    iput-object v3, v1, Landroidx/media3/common/q0;->o:Ljava/lang/Integer;

    .line 153
    .line 154
    :cond_11
    iget-object v3, v0, Landroidx/media3/common/r0;->p:Ljava/lang/Integer;

    .line 155
    .line 156
    if-eqz v3, :cond_12

    .line 157
    .line 158
    iput-object v3, v1, Landroidx/media3/common/q0;->p:Ljava/lang/Integer;

    .line 159
    .line 160
    :cond_12
    iget-object v3, v0, Landroidx/media3/common/r0;->q:Ljava/lang/Boolean;

    .line 161
    .line 162
    if-eqz v3, :cond_13

    .line 163
    .line 164
    iput-object v3, v1, Landroidx/media3/common/q0;->q:Ljava/lang/Boolean;

    .line 165
    .line 166
    :cond_13
    iget-object v3, v0, Landroidx/media3/common/r0;->r:Ljava/lang/Boolean;

    .line 167
    .line 168
    if-eqz v3, :cond_14

    .line 169
    .line 170
    iput-object v3, v1, Landroidx/media3/common/q0;->r:Ljava/lang/Boolean;

    .line 171
    .line 172
    :cond_14
    iget-object v3, v0, Landroidx/media3/common/r0;->s:Ljava/lang/Integer;

    .line 173
    .line 174
    if-eqz v3, :cond_15

    .line 175
    .line 176
    iput-object v3, v1, Landroidx/media3/common/q0;->s:Ljava/lang/Integer;

    .line 177
    .line 178
    :cond_15
    iget-object v3, v0, Landroidx/media3/common/r0;->t:Ljava/lang/Integer;

    .line 179
    .line 180
    if-eqz v3, :cond_16

    .line 181
    .line 182
    iput-object v3, v1, Landroidx/media3/common/q0;->s:Ljava/lang/Integer;

    .line 183
    .line 184
    :cond_16
    iget-object v3, v0, Landroidx/media3/common/r0;->u:Ljava/lang/Integer;

    .line 185
    .line 186
    if-eqz v3, :cond_17

    .line 187
    .line 188
    iput-object v3, v1, Landroidx/media3/common/q0;->t:Ljava/lang/Integer;

    .line 189
    .line 190
    :cond_17
    iget-object v3, v0, Landroidx/media3/common/r0;->v:Ljava/lang/Integer;

    .line 191
    .line 192
    if-eqz v3, :cond_18

    .line 193
    .line 194
    iput-object v3, v1, Landroidx/media3/common/q0;->u:Ljava/lang/Integer;

    .line 195
    .line 196
    :cond_18
    iget-object v3, v0, Landroidx/media3/common/r0;->w:Ljava/lang/Integer;

    .line 197
    .line 198
    if-eqz v3, :cond_19

    .line 199
    .line 200
    iput-object v3, v1, Landroidx/media3/common/q0;->v:Ljava/lang/Integer;

    .line 201
    .line 202
    :cond_19
    iget-object v3, v0, Landroidx/media3/common/r0;->x:Ljava/lang/Integer;

    .line 203
    .line 204
    if-eqz v3, :cond_1a

    .line 205
    .line 206
    iput-object v3, v1, Landroidx/media3/common/q0;->w:Ljava/lang/Integer;

    .line 207
    .line 208
    :cond_1a
    iget-object v3, v0, Landroidx/media3/common/r0;->y:Ljava/lang/Integer;

    .line 209
    .line 210
    if-eqz v3, :cond_1b

    .line 211
    .line 212
    iput-object v3, v1, Landroidx/media3/common/q0;->x:Ljava/lang/Integer;

    .line 213
    .line 214
    :cond_1b
    iget-object v3, v0, Landroidx/media3/common/r0;->z:Ljava/lang/CharSequence;

    .line 215
    .line 216
    if-eqz v3, :cond_1c

    .line 217
    .line 218
    iput-object v3, v1, Landroidx/media3/common/q0;->y:Ljava/lang/CharSequence;

    .line 219
    .line 220
    :cond_1c
    iget-object v3, v0, Landroidx/media3/common/r0;->A:Ljava/lang/CharSequence;

    .line 221
    .line 222
    if-eqz v3, :cond_1d

    .line 223
    .line 224
    iput-object v3, v1, Landroidx/media3/common/q0;->z:Ljava/lang/CharSequence;

    .line 225
    .line 226
    :cond_1d
    iget-object v3, v0, Landroidx/media3/common/r0;->B:Ljava/lang/CharSequence;

    .line 227
    .line 228
    if-eqz v3, :cond_1e

    .line 229
    .line 230
    iput-object v3, v1, Landroidx/media3/common/q0;->A:Ljava/lang/CharSequence;

    .line 231
    .line 232
    :cond_1e
    iget-object v3, v0, Landroidx/media3/common/r0;->C:Ljava/lang/Integer;

    .line 233
    .line 234
    if-eqz v3, :cond_1f

    .line 235
    .line 236
    iput-object v3, v1, Landroidx/media3/common/q0;->B:Ljava/lang/Integer;

    .line 237
    .line 238
    :cond_1f
    iget-object v3, v0, Landroidx/media3/common/r0;->D:Ljava/lang/Integer;

    .line 239
    .line 240
    if-eqz v3, :cond_20

    .line 241
    .line 242
    iput-object v3, v1, Landroidx/media3/common/q0;->C:Ljava/lang/Integer;

    .line 243
    .line 244
    :cond_20
    iget-object v3, v0, Landroidx/media3/common/r0;->E:Ljava/lang/CharSequence;

    .line 245
    .line 246
    if-eqz v3, :cond_21

    .line 247
    .line 248
    iput-object v3, v1, Landroidx/media3/common/q0;->D:Ljava/lang/CharSequence;

    .line 249
    .line 250
    :cond_21
    iget-object v3, v0, Landroidx/media3/common/r0;->F:Ljava/lang/CharSequence;

    .line 251
    .line 252
    if-eqz v3, :cond_22

    .line 253
    .line 254
    iput-object v3, v1, Landroidx/media3/common/q0;->E:Ljava/lang/CharSequence;

    .line 255
    .line 256
    :cond_22
    iget-object v3, v0, Landroidx/media3/common/r0;->G:Ljava/lang/CharSequence;

    .line 257
    .line 258
    if-eqz v3, :cond_23

    .line 259
    .line 260
    iput-object v3, v1, Landroidx/media3/common/q0;->F:Ljava/lang/CharSequence;

    .line 261
    .line 262
    :cond_23
    iget-object v3, v0, Landroidx/media3/common/r0;->H:Ljava/lang/Integer;

    .line 263
    .line 264
    if-eqz v3, :cond_24

    .line 265
    .line 266
    iput-object v3, v1, Landroidx/media3/common/q0;->G:Ljava/lang/Integer;

    .line 267
    .line 268
    :cond_24
    iget-object v0, v0, Landroidx/media3/common/r0;->I:Landroid/os/Bundle;

    .line 269
    .line 270
    if-eqz v0, :cond_25

    .line 271
    .line 272
    iput-object v0, v1, Landroidx/media3/common/q0;->H:Landroid/os/Bundle;

    .line 273
    .line 274
    :cond_25
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    if-nez v0, :cond_26

    .line 279
    .line 280
    invoke-static {v2}, Lf6/m0;->j(Ljava/util/Collection;)Lf6/m0;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    iput-object v0, v1, Landroidx/media3/common/q0;->I:Lf6/m0;

    .line 285
    .line 286
    :cond_26
    :goto_2
    new-instance v0, Landroidx/media3/common/r0;

    .line 287
    .line 288
    invoke-direct {v0, v1}, Landroidx/media3/common/r0;-><init>(Landroidx/media3/common/q0;)V

    .line 289
    .line 290
    .line 291
    return-object v0
.end method

.method public static synthetic c(ILandroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$setAudioSessionId$9(ILandroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private canUpdateMediaSourcesWithMediaItems(IILjava/util/List;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Landroidx/media3/common/o0;",
            ">;)Z"
        }
    .end annotation

    .line 1
    sub-int v0, p2, p1

    .line 2
    .line 3
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    move v0, p1

    .line 12
    :goto_0
    if-ge v0, p2, :cond_2

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaSourceHolderSnapshots:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroidx/media3/exoplayer/ExoPlayerImpl$MediaSourceHolderSnapshot;

    .line 21
    .line 22
    invoke-static {v1}, Landroidx/media3/exoplayer/ExoPlayerImpl$MediaSourceHolderSnapshot;->access$300(Landroidx/media3/exoplayer/ExoPlayerImpl$MediaSourceHolderSnapshot;)Landroidx/media3/exoplayer/source/MediaSource;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sub-int v3, v0, p1

    .line 27
    .line 28
    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Landroidx/media3/common/o0;

    .line 33
    .line 34
    invoke-interface {v1, v3}, Landroidx/media3/exoplayer/source/MediaSource;->canUpdateMediaItem(Landroidx/media3/common/o0;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    return v2

    .line 41
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 p1, 0x1

    .line 45
    return p1
.end method

.method private computePlaybackSuppressionReason(ZI)I
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    iget-boolean p2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->suppressPlaybackOnUnsuitableOutput:Z

    .line 6
    .line 7
    if-eqz p2, :cond_2

    .line 8
    .line 9
    const/4 p2, 0x3

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->hasSupportedAudioOutput()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    return p2

    .line 19
    :cond_1
    if-nez p1, :cond_2

    .line 20
    .line 21
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 22
    .line 23
    iget p1, p1, Landroidx/media3/exoplayer/PlaybackInfo;->playbackSuppressionReason:I

    .line 24
    .line 25
    if-ne p1, p2, :cond_2

    .line 26
    .line 27
    return p2

    .line 28
    :cond_2
    const/4 p1, 0x0

    .line 29
    return p1
.end method

.method private static createDeviceInfo(Landroidx/media3/exoplayer/StreamVolumeManager;)Landroidx/media3/common/q;
    .locals 3

    .line 1
    new-instance v0, Landroidx/media3/common/p;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/media3/exoplayer/StreamVolumeManager;->getMinVolume()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v1

    .line 15
    :goto_0
    iput v2, v0, Landroidx/media3/common/p;->a:I

    .line 16
    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/media3/exoplayer/StreamVolumeManager;->getMaxVolume()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move p0, v1

    .line 25
    :goto_1
    iput p0, v0, Landroidx/media3/common/p;->b:I

    .line 26
    .line 27
    iget v2, v0, Landroidx/media3/common/p;->a:I

    .line 28
    .line 29
    if-gt v2, p0, :cond_2

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    :cond_2
    invoke-static {v1}, Lh1/a;->d(Z)V

    .line 33
    .line 34
    .line 35
    new-instance p0, Landroidx/media3/common/q;

    .line 36
    .line 37
    invoke-direct {p0, v0}, Landroidx/media3/common/q;-><init>(Landroidx/media3/common/p;)V

    .line 38
    .line 39
    .line 40
    return-object p0
.end method

.method private createMaskingTimeline()Landroidx/media3/common/p1;
    .locals 3

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/PlaylistTimeline;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaSourceHolderSnapshots:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->shuffleOrder:Landroidx/media3/exoplayer/source/ShuffleOrder;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Landroidx/media3/exoplayer/PlaylistTimeline;-><init>(Ljava/util/Collection;Landroidx/media3/exoplayer/source/ShuffleOrder;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method private createMediaSources(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/common/o0;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/source/MediaSource;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaSourceFactory:Landroidx/media3/exoplayer/source/MediaSource$Factory;

    .line 14
    .line 15
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Landroidx/media3/common/o0;

    .line 20
    .line 21
    invoke-interface {v2, v3}, Landroidx/media3/exoplayer/source/MediaSource$Factory;->createMediaSource(Landroidx/media3/common/o0;)Landroidx/media3/exoplayer/source/MediaSource;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-object v0
.end method

.method private createMessageInternal(Landroidx/media3/exoplayer/PlayerMessage$Target;)Landroidx/media3/exoplayer/PlayerMessage;
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getCurrentWindowIndexInternal(Landroidx/media3/exoplayer/PlaybackInfo;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Landroidx/media3/exoplayer/PlayerMessage;

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->internalPlayer:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 10
    .line 11
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 12
    .line 13
    iget-object v4, v3, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 14
    .line 15
    const/4 v3, -0x1

    .line 16
    if-ne v0, v3, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    :cond_0
    move v5, v0

    .line 20
    iget-object v6, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->clock:Lh1/b;

    .line 21
    .line 22
    invoke-virtual {v2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->getPlaybackLooper()Landroid/os/Looper;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    move-object v3, p1

    .line 27
    invoke-direct/range {v1 .. v7}, Landroidx/media3/exoplayer/PlayerMessage;-><init>(Landroidx/media3/exoplayer/PlayerMessage$Sender;Landroidx/media3/exoplayer/PlayerMessage$Target;Landroidx/media3/common/p1;ILh1/b;Landroid/os/Looper;)V

    .line 28
    .line 29
    .line 30
    return-object v1
.end method

.method public static synthetic d(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$updatePlaybackInfo$21(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Landroidx/media3/exoplayer/ExoPlayerImpl;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$updateAvailableCommands$26(Landroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private evaluateMediaItemTransitionReason(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/exoplayer/PlaybackInfo;ZIZZ)Landroid/util/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/PlaybackInfo;",
            "Landroidx/media3/exoplayer/PlaybackInfo;",
            "ZIZZ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-object v1, p2, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 7
    .line 8
    iget-object v2, p1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 9
    .line 10
    invoke-virtual {v2}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    new-instance p1, Landroid/util/Pair;

    .line 23
    .line 24
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-direct {p1, p2, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_0
    invoke-virtual {v2}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-virtual {v1}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const/4 v5, 0x3

    .line 39
    if-eq v3, v4, :cond_1

    .line 40
    .line 41
    new-instance p1, Landroid/util/Pair;

    .line 42
    .line 43
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_1
    iget-object v3, p2, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 54
    .line 55
    iget-object v3, v3, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 56
    .line 57
    iget-object v4, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->period:Landroidx/media3/common/m1;

    .line 58
    .line 59
    invoke-virtual {v1, v3, v4}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    iget v3, v3, Landroidx/media3/common/m1;->c:I

    .line 64
    .line 65
    iget-object v4, p0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 66
    .line 67
    invoke-virtual {v1, v3, v4}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iget-object v1, v1, Landroidx/media3/common/o1;->a:Ljava/lang/Object;

    .line 72
    .line 73
    iget-object v3, p1, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 74
    .line 75
    iget-object v3, v3, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 76
    .line 77
    iget-object v4, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->period:Landroidx/media3/common/m1;

    .line 78
    .line 79
    invoke-virtual {v2, v3, v4}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    iget v3, v3, Landroidx/media3/common/m1;->c:I

    .line 84
    .line 85
    iget-object v4, p0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 86
    .line 87
    invoke-virtual {v2, v3, v4}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    iget-object v2, v2, Landroidx/media3/common/o1;->a:Ljava/lang/Object;

    .line 92
    .line 93
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    const/4 v2, 0x2

    .line 98
    const/4 v3, 0x1

    .line 99
    if-nez v1, :cond_5

    .line 100
    .line 101
    if-eqz p3, :cond_2

    .line 102
    .line 103
    if-nez p4, :cond_2

    .line 104
    .line 105
    move v5, v3

    .line 106
    goto :goto_0

    .line 107
    :cond_2
    if-eqz p3, :cond_3

    .line 108
    .line 109
    if-ne p4, v3, :cond_3

    .line 110
    .line 111
    move v5, v2

    .line 112
    goto :goto_0

    .line 113
    :cond_3
    if-eqz p5, :cond_4

    .line 114
    .line 115
    :goto_0
    new-instance p1, Landroid/util/Pair;

    .line 116
    .line 117
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object p3

    .line 123
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    return-object p1

    .line 127
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 128
    .line 129
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 130
    .line 131
    .line 132
    throw p1

    .line 133
    :cond_5
    if-eqz p3, :cond_6

    .line 134
    .line 135
    if-nez p4, :cond_6

    .line 136
    .line 137
    iget-object p2, p2, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 138
    .line 139
    iget-wide v4, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->windowSequenceNumber:J

    .line 140
    .line 141
    iget-object p1, p1, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 142
    .line 143
    iget-wide p1, p1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->windowSequenceNumber:J

    .line 144
    .line 145
    cmp-long p1, v4, p1

    .line 146
    .line 147
    if-gez p1, :cond_6

    .line 148
    .line 149
    new-instance p1, Landroid/util/Pair;

    .line 150
    .line 151
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 152
    .line 153
    const/4 p3, 0x0

    .line 154
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object p3

    .line 158
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    return-object p1

    .line 162
    :cond_6
    if-eqz p3, :cond_7

    .line 163
    .line 164
    if-ne p4, v3, :cond_7

    .line 165
    .line 166
    if-eqz p6, :cond_7

    .line 167
    .line 168
    new-instance p1, Landroid/util/Pair;

    .line 169
    .line 170
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 171
    .line 172
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object p3

    .line 176
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    return-object p1

    .line 180
    :cond_7
    new-instance p1, Landroid/util/Pair;

    .line 181
    .line 182
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 183
    .line 184
    invoke-direct {p1, p2, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    return-object p1
.end method

.method public static synthetic f(ILandroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$setRepeatMode$3(ILandroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$updatePlaybackInfo$25(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private getContentPositionInternal(Landroidx/media3/exoplayer/PlaybackInfo;)J
    .locals 4

    .line 1
    iget-object v0, p1, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 10
    .line 11
    iget-object v1, p1, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 12
    .line 13
    iget-object v1, v1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->period:Landroidx/media3/common/m1;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 18
    .line 19
    .line 20
    iget-wide v0, p1, Landroidx/media3/exoplayer/PlaybackInfo;->requestedContentPositionUs:J

    .line 21
    .line 22
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v0, v0, v2

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    iget-object v0, p1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 32
    .line 33
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getCurrentWindowIndexInternal(Landroidx/media3/exoplayer/PlaybackInfo;)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iget-object v1, p0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 38
    .line 39
    invoke-virtual {v0, p1, v1}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-wide v0, p1, Landroidx/media3/common/o1;->l:J

    .line 44
    .line 45
    invoke-static {v0, v1}, Lh1/i0;->f0(J)J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    return-wide v0

    .line 50
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->period:Landroidx/media3/common/m1;

    .line 51
    .line 52
    iget-wide v0, v0, Landroidx/media3/common/m1;->e:J

    .line 53
    .line 54
    invoke-static {v0, v1}, Lh1/i0;->f0(J)J

    .line 55
    .line 56
    .line 57
    move-result-wide v0

    .line 58
    iget-wide v2, p1, Landroidx/media3/exoplayer/PlaybackInfo;->requestedContentPositionUs:J

    .line 59
    .line 60
    invoke-static {v2, v3}, Lh1/i0;->f0(J)J

    .line 61
    .line 62
    .line 63
    move-result-wide v2

    .line 64
    add-long/2addr v2, v0

    .line 65
    return-wide v2

    .line 66
    :cond_1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getCurrentPositionUsInternal(Landroidx/media3/exoplayer/PlaybackInfo;)J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    invoke-static {v0, v1}, Lh1/i0;->f0(J)J

    .line 71
    .line 72
    .line 73
    move-result-wide v0

    .line 74
    return-wide v0
.end method

.method private getCurrentPositionUsInternal(Landroidx/media3/exoplayer/PlaybackInfo;)J
    .locals 3

    .line 1
    iget-object v0, p1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskingWindowPositionMs:J

    .line 10
    .line 11
    invoke-static {v0, v1}, Lh1/i0;->S(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    :cond_0
    iget-boolean v0, p1, Landroidx/media3/exoplayer/PlaybackInfo;->sleepingForOffload:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Landroidx/media3/exoplayer/PlaybackInfo;->getEstimatedPositionUs()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-wide v0, p1, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 26
    .line 27
    :goto_0
    iget-object v2, p1, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 28
    .line 29
    invoke-virtual {v2}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    return-wide v0

    .line 36
    :cond_2
    iget-object v2, p1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 37
    .line 38
    iget-object p1, p1, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 39
    .line 40
    invoke-direct {p0, v2, p1, v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->periodPositionUsToWindowPositionUs(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    return-wide v0
.end method

.method private getCurrentWindowIndexInternal(Landroidx/media3/exoplayer/PlaybackInfo;)I
    .locals 2

    .line 1
    iget-object v0, p1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskingWindowIndex:I

    .line 10
    .line 11
    return p1

    .line 12
    :cond_0
    iget-object v0, p1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 13
    .line 14
    iget-object p1, p1, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 15
    .line 16
    iget-object p1, p1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->period:Landroidx/media3/common/m1;

    .line 19
    .line 20
    invoke-virtual {v0, p1, v1}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget p1, p1, Landroidx/media3/common/m1;->c:I

    .line 25
    .line 26
    return p1
.end method

.method private getPeriodPositionUsAfterTimelineChanged(Landroidx/media3/common/p1;Landroidx/media3/common/p1;IJ)Landroid/util/Pair;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/p1;",
            "Landroidx/media3/common/p1;",
            "IJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p2

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const/4 v10, -0x1

    .line 15
    if-nez v1, :cond_3

    .line 16
    .line 17
    invoke-virtual {v7}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v12, v0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 25
    .line 26
    iget-object v13, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->period:Landroidx/media3/common/m1;

    .line 27
    .line 28
    invoke-static/range {p4 .. p5}, Lh1/i0;->S(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v15

    .line 32
    move-object/from16 v11, p1

    .line 33
    .line 34
    move/from16 v14, p3

    .line 35
    .line 36
    invoke-virtual/range {v11 .. v16}, Landroidx/media3/common/p1;->getPeriodPositionUs(Landroidx/media3/common/o1;Landroidx/media3/common/m1;IJ)Landroid/util/Pair;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v5, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 41
    .line 42
    invoke-virtual {v7, v5}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eq v2, v10, :cond_1

    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_1
    iget-object v1, v0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 50
    .line 51
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->period:Landroidx/media3/common/m1;

    .line 52
    .line 53
    iget v3, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->repeatMode:I

    .line 54
    .line 55
    iget-boolean v4, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->shuffleModeEnabled:Z

    .line 56
    .line 57
    move-object/from16 v6, p1

    .line 58
    .line 59
    invoke-static/range {v1 .. v7}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resolveSubsequentPeriod(Landroidx/media3/common/o1;Landroidx/media3/common/m1;IZLjava/lang/Object;Landroidx/media3/common/p1;Landroidx/media3/common/p1;)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eq v1, v10, :cond_2

    .line 64
    .line 65
    iget-object v2, v0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 66
    .line 67
    invoke-virtual {v7, v1, v2}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    iget-wide v2, v2, Landroidx/media3/common/o1;->l:J

    .line 72
    .line 73
    invoke-static {v2, v3}, Lh1/i0;->f0(J)J

    .line 74
    .line 75
    .line 76
    move-result-wide v2

    .line 77
    invoke-direct {v0, v7, v1, v2, v3}, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskWindowPositionMsOrGetPeriodPositionUs(Landroidx/media3/common/p1;IJ)Landroid/util/Pair;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    return-object v1

    .line 82
    :cond_2
    invoke-direct {v0, v7, v10, v8, v9}, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskWindowPositionMsOrGetPeriodPositionUs(Landroidx/media3/common/p1;IJ)Landroid/util/Pair;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    return-object v1

    .line 87
    :cond_3
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_4

    .line 92
    .line 93
    invoke-virtual {v7}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_4

    .line 98
    .line 99
    const/4 v1, 0x1

    .line 100
    goto :goto_1

    .line 101
    :cond_4
    const/4 v1, 0x0

    .line 102
    :goto_1
    if-eqz v1, :cond_5

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_5
    move/from16 v10, p3

    .line 106
    .line 107
    :goto_2
    if-eqz v1, :cond_6

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_6
    move-wide/from16 v8, p4

    .line 111
    .line 112
    :goto_3
    invoke-direct {v0, v7, v10, v8, v9}, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskWindowPositionMsOrGetPeriodPositionUs(Landroidx/media3/common/p1;IJ)Landroid/util/Pair;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    return-object v1
.end method

.method private static getPlayWhenReadyChangeReason(I)I
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p0, v0, :cond_0

    .line 3
    .line 4
    const/4 p0, 0x2

    .line 5
    return p0

    .line 6
    :cond_0
    const/4 p0, 0x1

    .line 7
    return p0
.end method

.method private getPositionInfo(J)Landroidx/media3/common/c1;
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getCurrentMediaItemIndex()I

    .line 2
    .line 3
    .line 4
    move-result v2

    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 16
    .line 17
    iget-object v1, v0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 18
    .line 19
    iget-object v1, v1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 22
    .line 23
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->period:Landroidx/media3/common/m1;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v3}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 29
    .line 30
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 37
    .line 38
    iget-object v3, v3, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 39
    .line 40
    iget-object v4, p0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 41
    .line 42
    invoke-virtual {v3, v2, v4}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    iget-object v3, v3, Landroidx/media3/common/o1;->a:Ljava/lang/Object;

    .line 47
    .line 48
    iget-object v4, p0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 49
    .line 50
    iget-object v4, v4, Landroidx/media3/common/o1;->c:Landroidx/media3/common/o0;

    .line 51
    .line 52
    move-object v5, v4

    .line 53
    move-object v4, v1

    .line 54
    move-object v1, v3

    .line 55
    move-object v3, v5

    .line 56
    :goto_0
    move v5, v0

    .line 57
    goto :goto_1

    .line 58
    :cond_0
    const/4 v1, 0x0

    .line 59
    const/4 v0, -0x1

    .line 60
    move-object v3, v1

    .line 61
    move-object v4, v3

    .line 62
    goto :goto_0

    .line 63
    :goto_1
    invoke-static {p1, p2}, Lh1/i0;->f0(J)J

    .line 64
    .line 65
    .line 66
    move-result-wide v6

    .line 67
    new-instance v0, Landroidx/media3/common/c1;

    .line 68
    .line 69
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 70
    .line 71
    iget-object p1, p1, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 72
    .line 73
    invoke-virtual {p1}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_1

    .line 78
    .line 79
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 80
    .line 81
    invoke-static {p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getRequestedContentPositionUs(Landroidx/media3/exoplayer/PlaybackInfo;)J

    .line 82
    .line 83
    .line 84
    move-result-wide p1

    .line 85
    invoke-static {p1, p2}, Lh1/i0;->f0(J)J

    .line 86
    .line 87
    .line 88
    move-result-wide p1

    .line 89
    move-wide v8, p1

    .line 90
    goto :goto_2

    .line 91
    :cond_1
    move-wide v8, v6

    .line 92
    :goto_2
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 93
    .line 94
    iget-object p1, p1, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 95
    .line 96
    iget v10, p1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 97
    .line 98
    iget v11, p1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adIndexInAdGroup:I

    .line 99
    .line 100
    invoke-direct/range {v0 .. v11}, Landroidx/media3/common/c1;-><init>(Ljava/lang/Object;ILandroidx/media3/common/o0;Ljava/lang/Object;IJJII)V

    .line 101
    .line 102
    .line 103
    return-object v0
.end method

.method private getPreviousPositionInfo(ILandroidx/media3/exoplayer/PlaybackInfo;I)Landroidx/media3/common/c1;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Landroidx/media3/common/m1;

    .line 6
    .line 7
    invoke-direct {v2}, Landroidx/media3/common/m1;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v3, v1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 11
    .line 12
    invoke-virtual {v3}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, -0x1

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    iget-object v3, v1, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 20
    .line 21
    iget-object v3, v3, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v5, v1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 24
    .line 25
    invoke-virtual {v5, v3, v2}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 26
    .line 27
    .line 28
    iget v5, v2, Landroidx/media3/common/m1;->c:I

    .line 29
    .line 30
    iget-object v6, v1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 31
    .line 32
    invoke-virtual {v6, v3}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    iget-object v7, v1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 37
    .line 38
    iget-object v8, v0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 39
    .line 40
    invoke-virtual {v7, v5, v8}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    iget-object v7, v7, Landroidx/media3/common/o1;->a:Ljava/lang/Object;

    .line 45
    .line 46
    iget-object v8, v0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 47
    .line 48
    iget-object v8, v8, Landroidx/media3/common/o1;->c:Landroidx/media3/common/o0;

    .line 49
    .line 50
    move-object v9, v3

    .line 51
    move v10, v6

    .line 52
    move-object v6, v7

    .line 53
    move v7, v5

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 v3, 0x0

    .line 56
    move/from16 v7, p3

    .line 57
    .line 58
    move-object v6, v3

    .line 59
    move-object v8, v6

    .line 60
    move-object v9, v8

    .line 61
    move v10, v4

    .line 62
    :goto_0
    if-nez p1, :cond_3

    .line 63
    .line 64
    iget-object v3, v1, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 65
    .line 66
    invoke-virtual {v3}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_1

    .line 71
    .line 72
    iget-object v3, v1, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 73
    .line 74
    iget v4, v3, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 75
    .line 76
    iget v3, v3, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adIndexInAdGroup:I

    .line 77
    .line 78
    invoke-virtual {v2, v4, v3}, Landroidx/media3/common/m1;->a(II)J

    .line 79
    .line 80
    .line 81
    move-result-wide v2

    .line 82
    invoke-static {v1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getRequestedContentPositionUs(Landroidx/media3/exoplayer/PlaybackInfo;)J

    .line 83
    .line 84
    .line 85
    move-result-wide v4

    .line 86
    goto :goto_2

    .line 87
    :cond_1
    iget-object v3, v1, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 88
    .line 89
    iget v3, v3, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->nextAdGroupIndex:I

    .line 90
    .line 91
    if-eq v3, v4, :cond_2

    .line 92
    .line 93
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 94
    .line 95
    invoke-static {v2}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getRequestedContentPositionUs(Landroidx/media3/exoplayer/PlaybackInfo;)J

    .line 96
    .line 97
    .line 98
    move-result-wide v2

    .line 99
    :goto_1
    move-wide v4, v2

    .line 100
    goto :goto_2

    .line 101
    :cond_2
    iget-wide v3, v2, Landroidx/media3/common/m1;->e:J

    .line 102
    .line 103
    iget-wide v11, v2, Landroidx/media3/common/m1;->d:J

    .line 104
    .line 105
    add-long v2, v3, v11

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    iget-object v3, v1, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 109
    .line 110
    invoke-virtual {v3}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_4

    .line 115
    .line 116
    iget-wide v2, v1, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 117
    .line 118
    invoke-static {v1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getRequestedContentPositionUs(Landroidx/media3/exoplayer/PlaybackInfo;)J

    .line 119
    .line 120
    .line 121
    move-result-wide v4

    .line 122
    goto :goto_2

    .line 123
    :cond_4
    iget-wide v2, v2, Landroidx/media3/common/m1;->e:J

    .line 124
    .line 125
    iget-wide v4, v1, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 126
    .line 127
    add-long/2addr v2, v4

    .line 128
    goto :goto_1

    .line 129
    :goto_2
    new-instance v11, Landroidx/media3/common/c1;

    .line 130
    .line 131
    invoke-static {v2, v3}, Lh1/i0;->f0(J)J

    .line 132
    .line 133
    .line 134
    move-result-wide v2

    .line 135
    invoke-static {v4, v5}, Lh1/i0;->f0(J)J

    .line 136
    .line 137
    .line 138
    move-result-wide v13

    .line 139
    iget-object v1, v1, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 140
    .line 141
    iget v15, v1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 142
    .line 143
    iget v1, v1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adIndexInAdGroup:I

    .line 144
    .line 145
    move/from16 v16, v1

    .line 146
    .line 147
    move-object v5, v11

    .line 148
    move-wide v11, v2

    .line 149
    invoke-direct/range {v5 .. v16}, Landroidx/media3/common/c1;-><init>(Ljava/lang/Object;ILandroidx/media3/common/o0;Ljava/lang/Object;IJJII)V

    .line 150
    .line 151
    .line 152
    return-object v5
.end method

.method private static getRequestedContentPositionUs(Landroidx/media3/exoplayer/PlaybackInfo;)J
    .locals 6

    .line 1
    new-instance v0, Landroidx/media3/common/o1;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media3/common/o1;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroidx/media3/common/m1;

    .line 7
    .line 8
    invoke-direct {v1}, Landroidx/media3/common/m1;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 12
    .line 13
    iget-object v3, p0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 14
    .line 15
    iget-object v3, v3, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v2, v3, v1}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 18
    .line 19
    .line 20
    iget-wide v2, p0, Landroidx/media3/exoplayer/PlaybackInfo;->requestedContentPositionUs:J

    .line 21
    .line 22
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v4, v2, v4

    .line 28
    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    iget-object p0, p0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 32
    .line 33
    iget v1, v1, Landroidx/media3/common/m1;->c:I

    .line 34
    .line 35
    invoke-virtual {p0, v1, v0}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-wide v0, p0, Landroidx/media3/common/o1;->l:J

    .line 40
    .line 41
    return-wide v0

    .line 42
    :cond_0
    iget-wide v0, v1, Landroidx/media3/common/m1;->e:J

    .line 43
    .line 44
    add-long/2addr v0, v2

    .line 45
    return-wide v0
.end method

.method public static synthetic h(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$updatePlaybackInfo$23(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private handlePlaybackInfo(Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;)V
    .locals 12

    .line 1
    iget v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    .line 2
    .line 3
    iget v3, p1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->operationAcks:I

    .line 4
    .line 5
    sub-int/2addr v2, v3

    .line 6
    iput v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    .line 7
    .line 8
    iget-boolean v3, p1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->positionDiscontinuity:Z

    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    iget v3, p1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->discontinuityReason:I

    .line 14
    .line 15
    iput v3, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingDiscontinuityReason:I

    .line 16
    .line 17
    iput-boolean v4, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingDiscontinuity:Z

    .line 18
    .line 19
    :cond_0
    if-nez v2, :cond_a

    .line 20
    .line 21
    iget-object v2, p1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 22
    .line 23
    iget-object v2, v2, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 24
    .line 25
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 26
    .line 27
    iget-object v3, v3, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 28
    .line 29
    invoke-virtual {v3}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v5, 0x0

    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    invoke-virtual {v2}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    const/4 v3, -0x1

    .line 43
    iput v3, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskingWindowIndex:I

    .line 44
    .line 45
    const-wide/16 v6, 0x0

    .line 46
    .line 47
    iput-wide v6, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskingWindowPositionMs:J

    .line 48
    .line 49
    iput v5, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskingPeriodIndex:I

    .line 50
    .line 51
    :cond_1
    invoke-virtual {v2}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-nez v3, :cond_3

    .line 56
    .line 57
    move-object v3, v2

    .line 58
    check-cast v3, Landroidx/media3/exoplayer/PlaylistTimeline;

    .line 59
    .line 60
    invoke-virtual {v3}, Landroidx/media3/exoplayer/PlaylistTimeline;->getChildTimelines()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    iget-object v7, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaSourceHolderSnapshots:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-ne v6, v7, :cond_2

    .line 75
    .line 76
    move v6, v4

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    move v6, v5

    .line 79
    :goto_0
    invoke-static {v6}, Lh1/a;->j(Z)V

    .line 80
    .line 81
    .line 82
    move v6, v5

    .line 83
    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-ge v6, v7, :cond_3

    .line 88
    .line 89
    iget-object v7, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaSourceHolderSnapshots:Ljava/util/List;

    .line 90
    .line 91
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    check-cast v7, Landroidx/media3/exoplayer/ExoPlayerImpl$MediaSourceHolderSnapshot;

    .line 96
    .line 97
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    check-cast v8, Landroidx/media3/common/p1;

    .line 102
    .line 103
    invoke-virtual {v7, v8}, Landroidx/media3/exoplayer/ExoPlayerImpl$MediaSourceHolderSnapshot;->updateTimeline(Landroidx/media3/common/p1;)V

    .line 104
    .line 105
    .line 106
    add-int/lit8 v6, v6, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    iget-boolean v3, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingDiscontinuity:Z

    .line 110
    .line 111
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    if-eqz v3, :cond_9

    .line 117
    .line 118
    iget-object v3, p1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 119
    .line 120
    iget-object v3, v3, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 121
    .line 122
    iget-object v8, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 123
    .line 124
    iget-object v8, v8, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 125
    .line 126
    invoke-virtual {v3, v8}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_5

    .line 131
    .line 132
    iget-object v3, p1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 133
    .line 134
    iget-wide v8, v3, Landroidx/media3/exoplayer/PlaybackInfo;->discontinuityStartPositionUs:J

    .line 135
    .line 136
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 137
    .line 138
    iget-wide v10, v3, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 139
    .line 140
    cmp-long v3, v8, v10

    .line 141
    .line 142
    if-eqz v3, :cond_4

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_4
    move v4, v5

    .line 146
    :cond_5
    :goto_2
    if-eqz v4, :cond_8

    .line 147
    .line 148
    invoke-virtual {v2}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-nez v3, :cond_7

    .line 153
    .line 154
    iget-object v3, p1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 155
    .line 156
    iget-object v3, v3, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 157
    .line 158
    invoke-virtual {v3}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    if-eqz v3, :cond_6

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_6
    iget-object v3, p1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 166
    .line 167
    iget-object v6, v3, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 168
    .line 169
    iget-wide v7, v3, Landroidx/media3/exoplayer/PlaybackInfo;->discontinuityStartPositionUs:J

    .line 170
    .line 171
    invoke-direct {p0, v2, v6, v7, v8}, Landroidx/media3/exoplayer/ExoPlayerImpl;->periodPositionUsToWindowPositionUs(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;J)J

    .line 172
    .line 173
    .line 174
    move-result-wide v2

    .line 175
    :goto_3
    move-wide v6, v2

    .line 176
    goto :goto_5

    .line 177
    :cond_7
    :goto_4
    iget-object v2, p1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 178
    .line 179
    iget-wide v2, v2, Landroidx/media3/exoplayer/PlaybackInfo;->discontinuityStartPositionUs:J

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_8
    :goto_5
    move v3, v4

    .line 183
    goto :goto_6

    .line 184
    :cond_9
    move v3, v5

    .line 185
    :goto_6
    iput-boolean v5, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingDiscontinuity:Z

    .line 186
    .line 187
    iget-object v1, p1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 188
    .line 189
    iget v4, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingDiscontinuityReason:I

    .line 190
    .line 191
    move-wide v5, v6

    .line 192
    const/4 v7, -0x1

    .line 193
    const/4 v8, 0x0

    .line 194
    const/4 v2, 0x1

    .line 195
    move-object v0, p0

    .line 196
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updatePlaybackInfo(Landroidx/media3/exoplayer/PlaybackInfo;IZIJIZ)V

    .line 197
    .line 198
    .line 199
    :cond_a
    return-void
.end method

.method private hasSupportedAudioOutput()Z
    .locals 3

    .line 1
    sget v0, Lh1/i0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x23

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->suitableOutputChecker:Landroidx/media3/exoplayer/SuitableOutputChecker;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-interface {v1}, Landroidx/media3/exoplayer/SuitableOutputChecker;->isSelectedOutputSuitableForPlayback()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0

    .line 16
    :cond_0
    const/16 v1, 0x17

    .line 17
    .line 18
    if-lt v0, v1, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioManager:Landroid/media/AudioManager;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->applicationContext:Landroid/content/Context;

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->getDevices(I)[Landroid/media/AudioDeviceInfo;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v1, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl$Api23;->isSuitableExternalAudioOutputPresentInAudioDeviceInfoList(Landroid/content/Context;[Landroid/media/AudioDeviceInfo;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    return v0

    .line 36
    :cond_1
    const/4 v0, 0x1

    .line 37
    return v0
.end method

.method public static synthetic i(ILandroidx/media3/common/c1;Landroidx/media3/common/c1;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$updatePlaybackInfo$13(ILandroidx/media3/common/c1;Landroidx/media3/common/c1;Landroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic j(ZLandroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$setSkipSilenceEnabled$11(ZLandroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic k(ZLandroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$setShuffleModeEnabled$4(ZLandroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic l(Landroidx/media3/exoplayer/ExoPlayerImpl;Landroidx/media3/common/b1;Landroidx/media3/common/u;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$new$0(Landroidx/media3/common/b1;Landroidx/media3/common/u;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$maybeNotifySurfaceSizeChanged$27(IILandroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Landroidx/media3/common/b1;->onSurfaceSizeChanged(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic lambda$new$0(Landroidx/media3/common/b1;Landroidx/media3/common/u;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->wrappingPlayer:Landroidx/media3/common/d1;

    .line 2
    .line 3
    new-instance v1, Landroidx/media3/common/a1;

    .line 4
    .line 5
    invoke-direct {v1, p2}, Landroidx/media3/common/a1;-><init>(Landroidx/media3/common/u;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, v0, v1}, Landroidx/media3/common/b1;->onEvents(Landroidx/media3/common/d1;Landroidx/media3/common/a1;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private synthetic lambda$new$1(Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->handlePlaybackInfo(Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic lambda$new$2(Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfoUpdateHandler:Lh1/k;

    .line 2
    .line 3
    new-instance v1, Landroidx/media3/exoplayer/s;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, v2, p1}, Landroidx/media3/exoplayer/s;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    check-cast v0, Lh1/b0;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lh1/b0;->e(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private static synthetic lambda$release$5(Landroidx/media3/common/b1;)V
    .locals 2

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/ExoTimeoutException;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/ExoTimeoutException;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/16 v1, 0x3eb

    .line 8
    .line 9
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/ExoPlaybackException;->createForUnexpected(Ljava/lang/RuntimeException;I)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {p0, v0}, Landroidx/media3/common/b1;->onPlayerError(Landroidx/media3/common/x0;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private static synthetic lambda$setAudioAttributes$8(Landroidx/media3/common/g;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Landroidx/media3/common/b1;->onAudioAttributesChanged(Landroidx/media3/common/g;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$setAudioSessionId$9(ILandroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Landroidx/media3/common/b1;->onAudioSessionIdChanged(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic lambda$setPlaylistMetadata$7(Landroidx/media3/common/b1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playlistMetadata:Landroidx/media3/common/r0;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Landroidx/media3/common/b1;->onPlaylistMetadataChanged(Landroidx/media3/common/r0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static synthetic lambda$setRepeatMode$3(ILandroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Landroidx/media3/common/b1;->onRepeatModeChanged(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$setShuffleModeEnabled$4(ZLandroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Landroidx/media3/common/b1;->onShuffleModeEnabledChanged(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$setSkipSilenceEnabled$11(ZLandroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Landroidx/media3/common/b1;->onSkipSilenceEnabledChanged(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$setTrackSelectionParameters$6(Landroidx/media3/common/v1;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Landroidx/media3/common/b1;->onTrackSelectionParametersChanged(Landroidx/media3/common/v1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$setVolume$10(FLandroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Landroidx/media3/common/b1;->onVolumeChanged(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic lambda$updateAvailableCommands$26(Landroidx/media3/common/b1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->availableCommands:Landroidx/media3/common/z0;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Landroidx/media3/common/b1;->onAvailableCommandsChanged(Landroidx/media3/common/z0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static synthetic lambda$updatePlaybackInfo$12(Landroidx/media3/exoplayer/PlaybackInfo;ILandroidx/media3/common/b1;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 2
    .line 3
    invoke-interface {p2, p0, p1}, Landroidx/media3/common/b1;->onTimelineChanged(Landroidx/media3/common/p1;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static synthetic lambda$updatePlaybackInfo$13(ILandroidx/media3/common/c1;Landroidx/media3/common/c1;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-interface {p3, p0}, Landroidx/media3/common/b1;->onPositionDiscontinuity(I)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, p1, p2, p0}, Landroidx/media3/common/b1;->onPositionDiscontinuity(Landroidx/media3/common/c1;Landroidx/media3/common/c1;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private static synthetic lambda$updatePlaybackInfo$14(Landroidx/media3/common/o0;ILandroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Landroidx/media3/common/b1;->onMediaItemTransition(Landroidx/media3/common/o0;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$updatePlaybackInfo$15(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/PlaybackInfo;->playbackError:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Landroidx/media3/common/b1;->onPlayerErrorChanged(Landroidx/media3/common/x0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static synthetic lambda$updatePlaybackInfo$16(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/PlaybackInfo;->playbackError:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Landroidx/media3/common/b1;->onPlayerError(Landroidx/media3/common/x0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static synthetic lambda$updatePlaybackInfo$17(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/PlaybackInfo;->trackSelectorResult:Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->tracks:Landroidx/media3/common/x1;

    .line 4
    .line 5
    invoke-interface {p1, p0}, Landroidx/media3/common/b1;->onTracksChanged(Landroidx/media3/common/x1;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static synthetic lambda$updatePlaybackInfo$18(Landroidx/media3/common/r0;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Landroidx/media3/common/b1;->onMediaMetadataChanged(Landroidx/media3/common/r0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$updatePlaybackInfo$19(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/PlaybackInfo;->isLoading:Z

    .line 2
    .line 3
    invoke-interface {p1, v0}, Landroidx/media3/common/b1;->onLoadingChanged(Z)V

    .line 4
    .line 5
    .line 6
    iget-boolean p0, p0, Landroidx/media3/exoplayer/PlaybackInfo;->isLoading:Z

    .line 7
    .line 8
    invoke-interface {p1, p0}, Landroidx/media3/common/b1;->onIsLoadingChanged(Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static synthetic lambda$updatePlaybackInfo$20(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/PlaybackInfo;->playWhenReady:Z

    .line 2
    .line 3
    iget p0, p0, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 4
    .line 5
    invoke-interface {p1, v0, p0}, Landroidx/media3/common/b1;->onPlayerStateChanged(ZI)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static synthetic lambda$updatePlaybackInfo$21(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 2
    .line 3
    invoke-interface {p1, p0}, Landroidx/media3/common/b1;->onPlaybackStateChanged(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static synthetic lambda$updatePlaybackInfo$22(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/PlaybackInfo;->playWhenReady:Z

    .line 2
    .line 3
    iget p0, p0, Landroidx/media3/exoplayer/PlaybackInfo;->playWhenReadyChangeReason:I

    .line 4
    .line 5
    invoke-interface {p1, v0, p0}, Landroidx/media3/common/b1;->onPlayWhenReadyChanged(ZI)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static synthetic lambda$updatePlaybackInfo$23(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/exoplayer/PlaybackInfo;->playbackSuppressionReason:I

    .line 2
    .line 3
    invoke-interface {p1, p0}, Landroidx/media3/common/b1;->onPlaybackSuppressionReasonChanged(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static synthetic lambda$updatePlaybackInfo$24(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/PlaybackInfo;->isPlaying()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-interface {p1, p0}, Landroidx/media3/common/b1;->onIsPlayingChanged(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static synthetic lambda$updatePlaybackInfo$25(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/PlaybackInfo;->playbackParameters:Landroidx/media3/common/y0;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Landroidx/media3/common/b1;->onPlaybackParametersChanged(Landroidx/media3/common/y0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic m(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$updatePlaybackInfo$16(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private maskTimelineAndPosition(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/p1;Landroid/util/Pair;)Landroidx/media3/exoplayer/PlaybackInfo;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/PlaybackInfo;",
            "Landroidx/media3/common/p1;",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;)",
            "Landroidx/media3/exoplayer/PlaybackInfo;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x1

    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v3, 0x0

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    :goto_0
    move v3, v4

    .line 20
    :goto_1
    invoke-static {v3}, Lh1/a;->d(Z)V

    .line 21
    .line 22
    .line 23
    move-object/from16 v3, p1

    .line 24
    .line 25
    iget-object v5, v3, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 26
    .line 27
    invoke-direct/range {p0 .. p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getContentPositionInternal(Landroidx/media3/exoplayer/PlaybackInfo;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v6

    .line 31
    invoke-virtual/range {p1 .. p2}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithTimeline(Landroidx/media3/common/p1;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    invoke-virtual {v1}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    invoke-static {}, Landroidx/media3/exoplayer/PlaybackInfo;->getDummyPeriodForEmptyTimeline()Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    iget-wide v1, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskingWindowPositionMs:J

    .line 46
    .line 47
    invoke-static {v1, v2}, Lh1/i0;->S(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v10

    .line 51
    sget-object v18, Landroidx/media3/exoplayer/source/TrackGroupArray;->EMPTY:Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 52
    .line 53
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->emptyTrackSelectorResult:Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 54
    .line 55
    sget-object v2, Lf6/m0;->k:Lf6/k0;

    .line 56
    .line 57
    sget-object v20, Lf6/l1;->n:Lf6/l1;

    .line 58
    .line 59
    const-wide/16 v16, 0x0

    .line 60
    .line 61
    move-wide v12, v10

    .line 62
    move-wide v14, v10

    .line 63
    move-object/from16 v19, v1

    .line 64
    .line 65
    invoke-virtual/range {v8 .. v20}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithNewPosition(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJJJLandroidx/media3/exoplayer/source/TrackGroupArray;Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;Ljava/util/List;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1, v9}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithLoadingMediaPeriodId(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget-wide v2, v1, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 74
    .line 75
    iput-wide v2, v1, Landroidx/media3/exoplayer/PlaybackInfo;->bufferedPositionUs:J

    .line 76
    .line 77
    return-object v1

    .line 78
    :cond_2
    iget-object v3, v8, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 79
    .line 80
    iget-object v3, v3, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 81
    .line 82
    sget v9, Lh1/i0;->a:I

    .line 83
    .line 84
    iget-object v9, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 85
    .line 86
    invoke-virtual {v3, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    if-nez v9, :cond_3

    .line 91
    .line 92
    new-instance v10, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 93
    .line 94
    iget-object v11, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 95
    .line 96
    invoke-direct {v10, v11}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;-><init>(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_3
    iget-object v10, v8, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 101
    .line 102
    :goto_2
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v2, Ljava/lang/Long;

    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 107
    .line 108
    .line 109
    move-result-wide v11

    .line 110
    invoke-static {v6, v7}, Lh1/i0;->S(J)J

    .line 111
    .line 112
    .line 113
    move-result-wide v6

    .line 114
    invoke-virtual {v5}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-nez v2, :cond_4

    .line 119
    .line 120
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->period:Landroidx/media3/common/m1;

    .line 121
    .line 122
    invoke-virtual {v5, v3, v2}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    iget-wide v2, v2, Landroidx/media3/common/m1;->e:J

    .line 127
    .line 128
    sub-long/2addr v6, v2

    .line 129
    :cond_4
    if-eqz v9, :cond_5

    .line 130
    .line 131
    cmp-long v2, v11, v6

    .line 132
    .line 133
    if-gez v2, :cond_6

    .line 134
    .line 135
    :cond_5
    move v1, v9

    .line 136
    move-object v9, v10

    .line 137
    move-wide v10, v11

    .line 138
    goto/16 :goto_6

    .line 139
    .line 140
    :cond_6
    if-nez v2, :cond_a

    .line 141
    .line 142
    iget-object v2, v8, Landroidx/media3/exoplayer/PlaybackInfo;->loadingMediaPeriodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 143
    .line 144
    iget-object v2, v2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 145
    .line 146
    invoke-virtual {v1, v2}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    const/4 v3, -0x1

    .line 151
    if-eq v2, v3, :cond_8

    .line 152
    .line 153
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->period:Landroidx/media3/common/m1;

    .line 154
    .line 155
    invoke-virtual {v1, v2, v3}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    iget v2, v2, Landroidx/media3/common/m1;->c:I

    .line 160
    .line 161
    iget-object v3, v10, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 162
    .line 163
    iget-object v4, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->period:Landroidx/media3/common/m1;

    .line 164
    .line 165
    invoke-virtual {v1, v3, v4}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    iget v3, v3, Landroidx/media3/common/m1;->c:I

    .line 170
    .line 171
    if-eq v2, v3, :cond_7

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_7
    return-object v8

    .line 175
    :cond_8
    :goto_3
    iget-object v2, v10, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 176
    .line 177
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->period:Landroidx/media3/common/m1;

    .line 178
    .line 179
    invoke-virtual {v1, v2, v3}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v10}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-eqz v1, :cond_9

    .line 187
    .line 188
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->period:Landroidx/media3/common/m1;

    .line 189
    .line 190
    iget v2, v10, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 191
    .line 192
    iget v3, v10, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adIndexInAdGroup:I

    .line 193
    .line 194
    invoke-virtual {v1, v2, v3}, Landroidx/media3/common/m1;->a(II)J

    .line 195
    .line 196
    .line 197
    move-result-wide v1

    .line 198
    :goto_4
    move-object v9, v10

    .line 199
    goto :goto_5

    .line 200
    :cond_9
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->period:Landroidx/media3/common/m1;

    .line 201
    .line 202
    iget-wide v1, v1, Landroidx/media3/common/m1;->d:J

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :goto_5
    iget-wide v10, v8, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 206
    .line 207
    iget-wide v12, v8, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 208
    .line 209
    iget-wide v14, v8, Landroidx/media3/exoplayer/PlaybackInfo;->discontinuityStartPositionUs:J

    .line 210
    .line 211
    iget-wide v3, v8, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 212
    .line 213
    sub-long v16, v1, v3

    .line 214
    .line 215
    iget-object v3, v8, Landroidx/media3/exoplayer/PlaybackInfo;->trackGroups:Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 216
    .line 217
    iget-object v4, v8, Landroidx/media3/exoplayer/PlaybackInfo;->trackSelectorResult:Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 218
    .line 219
    iget-object v5, v8, Landroidx/media3/exoplayer/PlaybackInfo;->staticMetadata:Ljava/util/List;

    .line 220
    .line 221
    move-object/from16 v18, v3

    .line 222
    .line 223
    move-object/from16 v19, v4

    .line 224
    .line 225
    move-object/from16 v20, v5

    .line 226
    .line 227
    invoke-virtual/range {v8 .. v20}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithNewPosition(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJJJLandroidx/media3/exoplayer/source/TrackGroupArray;Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;Ljava/util/List;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    invoke-virtual {v3, v9}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithLoadingMediaPeriodId(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    iput-wide v1, v3, Landroidx/media3/exoplayer/PlaybackInfo;->bufferedPositionUs:J

    .line 236
    .line 237
    return-object v3

    .line 238
    :cond_a
    move-object v9, v10

    .line 239
    invoke-virtual {v9}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    xor-int/2addr v1, v4

    .line 244
    invoke-static {v1}, Lh1/a;->j(Z)V

    .line 245
    .line 246
    .line 247
    iget-wide v1, v8, Landroidx/media3/exoplayer/PlaybackInfo;->totalBufferedDurationUs:J

    .line 248
    .line 249
    sub-long v3, v11, v6

    .line 250
    .line 251
    sub-long/2addr v1, v3

    .line 252
    const-wide/16 v3, 0x0

    .line 253
    .line 254
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 255
    .line 256
    .line 257
    move-result-wide v16

    .line 258
    iget-wide v1, v8, Landroidx/media3/exoplayer/PlaybackInfo;->bufferedPositionUs:J

    .line 259
    .line 260
    iget-object v3, v8, Landroidx/media3/exoplayer/PlaybackInfo;->loadingMediaPeriodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 261
    .line 262
    iget-object v4, v8, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 263
    .line 264
    invoke-virtual {v3, v4}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->equals(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    if-eqz v3, :cond_b

    .line 269
    .line 270
    add-long v1, v11, v16

    .line 271
    .line 272
    :cond_b
    iget-object v3, v8, Landroidx/media3/exoplayer/PlaybackInfo;->trackGroups:Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 273
    .line 274
    iget-object v4, v8, Landroidx/media3/exoplayer/PlaybackInfo;->trackSelectorResult:Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 275
    .line 276
    iget-object v5, v8, Landroidx/media3/exoplayer/PlaybackInfo;->staticMetadata:Ljava/util/List;

    .line 277
    .line 278
    move-wide v10, v11

    .line 279
    move-wide v12, v10

    .line 280
    move-wide v14, v10

    .line 281
    move-object/from16 v18, v3

    .line 282
    .line 283
    move-object/from16 v19, v4

    .line 284
    .line 285
    move-object/from16 v20, v5

    .line 286
    .line 287
    invoke-virtual/range {v8 .. v20}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithNewPosition(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJJJLandroidx/media3/exoplayer/source/TrackGroupArray;Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;Ljava/util/List;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    iput-wide v1, v3, Landroidx/media3/exoplayer/PlaybackInfo;->bufferedPositionUs:J

    .line 292
    .line 293
    return-object v3

    .line 294
    :goto_6
    invoke-virtual {v9}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    xor-int/2addr v2, v4

    .line 299
    invoke-static {v2}, Lh1/a;->j(Z)V

    .line 300
    .line 301
    .line 302
    if-nez v1, :cond_c

    .line 303
    .line 304
    sget-object v2, Landroidx/media3/exoplayer/source/TrackGroupArray;->EMPTY:Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 305
    .line 306
    :goto_7
    move-object/from16 v18, v2

    .line 307
    .line 308
    goto :goto_8

    .line 309
    :cond_c
    iget-object v2, v8, Landroidx/media3/exoplayer/PlaybackInfo;->trackGroups:Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 310
    .line 311
    goto :goto_7

    .line 312
    :goto_8
    if-nez v1, :cond_d

    .line 313
    .line 314
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->emptyTrackSelectorResult:Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 315
    .line 316
    :goto_9
    move-object/from16 v19, v2

    .line 317
    .line 318
    goto :goto_a

    .line 319
    :cond_d
    iget-object v2, v8, Landroidx/media3/exoplayer/PlaybackInfo;->trackSelectorResult:Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 320
    .line 321
    goto :goto_9

    .line 322
    :goto_a
    if-nez v1, :cond_e

    .line 323
    .line 324
    sget-object v1, Lf6/m0;->k:Lf6/k0;

    .line 325
    .line 326
    sget-object v1, Lf6/l1;->n:Lf6/l1;

    .line 327
    .line 328
    :goto_b
    move-object/from16 v20, v1

    .line 329
    .line 330
    goto :goto_c

    .line 331
    :cond_e
    iget-object v1, v8, Landroidx/media3/exoplayer/PlaybackInfo;->staticMetadata:Ljava/util/List;

    .line 332
    .line 333
    goto :goto_b

    .line 334
    :goto_c
    const-wide/16 v16, 0x0

    .line 335
    .line 336
    move-wide v12, v10

    .line 337
    move-wide v14, v10

    .line 338
    invoke-virtual/range {v8 .. v20}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithNewPosition(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJJJLandroidx/media3/exoplayer/source/TrackGroupArray;Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;Ljava/util/List;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    invoke-virtual {v1, v9}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithLoadingMediaPeriodId(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    iput-wide v10, v1, Landroidx/media3/exoplayer/PlaybackInfo;->bufferedPositionUs:J

    .line 347
    .line 348
    return-object v1
.end method

.method private maskWindowPositionMsOrGetPeriodPositionUs(Landroidx/media3/common/p1;IJ)Landroid/util/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/p1;",
            "IJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iput p2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskingWindowIndex:I

    .line 8
    .line 9
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long p1, p3, p1

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const-wide/16 p3, 0x0

    .line 19
    .line 20
    :cond_0
    iput-wide p3, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskingWindowPositionMs:J

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskingPeriodIndex:I

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    return-object p1

    .line 27
    :cond_1
    const/4 v0, -0x1

    .line 28
    if-eq p2, v0, :cond_3

    .line 29
    .line 30
    invoke-virtual {p1}, Landroidx/media3/common/p1;->getWindowCount()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-lt p2, v0, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    :goto_0
    move v3, p2

    .line 38
    goto :goto_2

    .line 39
    :cond_3
    :goto_1
    iget-boolean p2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->shuffleModeEnabled:Z

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Landroidx/media3/common/p1;->getFirstWindowIndex(Z)I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    iget-object p3, p0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 46
    .line 47
    invoke-virtual {p1, p2, p3}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    iget-wide p3, p3, Landroidx/media3/common/o1;->l:J

    .line 52
    .line 53
    invoke-static {p3, p4}, Lh1/i0;->f0(J)J

    .line 54
    .line 55
    .line 56
    move-result-wide p3

    .line 57
    goto :goto_0

    .line 58
    :goto_2
    iget-object v1, p0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 59
    .line 60
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->period:Landroidx/media3/common/m1;

    .line 61
    .line 62
    invoke-static {p3, p4}, Lh1/i0;->S(J)J

    .line 63
    .line 64
    .line 65
    move-result-wide v4

    .line 66
    move-object v0, p1

    .line 67
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/common/p1;->getPeriodPositionUs(Landroidx/media3/common/o1;Landroidx/media3/common/m1;IJ)Landroid/util/Pair;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1
.end method

.method private maybeNotifySurfaceSizeChanged(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->surfaceSize:Lh1/y;

    .line 2
    .line 3
    iget v1, v0, Lh1/y;->a:I

    .line 4
    .line 5
    if-ne p1, v1, :cond_1

    .line 6
    .line 7
    iget v0, v0, Lh1/y;->b:I

    .line 8
    .line 9
    if-eq p2, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    :goto_0
    new-instance v0, Lh1/y;

    .line 14
    .line 15
    invoke-direct {v0, p1, p2}, Lh1/y;-><init>(II)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->surfaceSize:Lh1/y;

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 21
    .line 22
    new-instance v1, Landroidx/media3/exoplayer/o;

    .line 23
    .line 24
    invoke-direct {v1, p1, p2}, Landroidx/media3/exoplayer/o;-><init>(II)V

    .line 25
    .line 26
    .line 27
    const/16 v2, 0x18

    .line 28
    .line 29
    invoke-virtual {v0, v2, v1}, Lh1/p;->f(ILh1/m;)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Lh1/y;

    .line 33
    .line 34
    invoke-direct {v0, p1, p2}, Lh1/y;-><init>(II)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x2

    .line 38
    const/16 p2, 0xe

    .line 39
    .line 40
    invoke-direct {p0, p1, p2, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendRendererMessage(IILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public static synthetic n(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$updatePlaybackInfo$15(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic o(Landroidx/media3/exoplayer/ExoPlayerImpl;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$setPlaylistMetadata$7(Landroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private onSelectedOutputSuitabilityChanged(Z)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x3

    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 6
    .line 7
    iget v2, p1, Landroidx/media3/exoplayer/PlaybackInfo;->playbackSuppressionReason:I

    .line 8
    .line 9
    if-ne v2, v1, :cond_0

    .line 10
    .line 11
    iget-boolean p1, p1, Landroidx/media3/exoplayer/PlaybackInfo;->playWhenReady:Z

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {p0, p1, v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(ZII)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :cond_1
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 19
    .line 20
    iget-boolean p1, p1, Landroidx/media3/exoplayer/PlaybackInfo;->playWhenReady:Z

    .line 21
    .line 22
    invoke-direct {p0, p1, v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(ZII)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static synthetic p(FLandroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$setVolume$10(FLandroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private periodPositionUsToWindowPositionUs(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;J)J
    .locals 1

    .line 1
    iget-object p2, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->period:Landroidx/media3/common/m1;

    .line 4
    .line 5
    invoke-virtual {p1, p2, v0}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->period:Landroidx/media3/common/m1;

    .line 9
    .line 10
    iget-wide p1, p1, Landroidx/media3/common/m1;->e:J

    .line 11
    .line 12
    add-long/2addr p3, p1

    .line 13
    return-wide p3
.end method

.method public static synthetic q(IILandroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$maybeNotifySurfaceSizeChanged$27(IILandroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic r(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$updatePlaybackInfo$22(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private removeMediaItemsInternal(Landroidx/media3/exoplayer/PlaybackInfo;II)Landroidx/media3/exoplayer/PlaybackInfo;
    .locals 8

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getCurrentWindowIndexInternal(Landroidx/media3/exoplayer/PlaybackInfo;)I

    .line 2
    .line 3
    .line 4
    move-result v3

    .line 5
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getContentPositionInternal(Landroidx/media3/exoplayer/PlaybackInfo;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v4

    .line 9
    iget-object v1, p1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaSourceHolderSnapshots:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    iget v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    .line 18
    .line 19
    const/4 v7, 0x1

    .line 20
    add-int/2addr v0, v7

    .line 21
    iput v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    .line 22
    .line 23
    invoke-direct {p0, p2, p3}, Landroidx/media3/exoplayer/ExoPlayerImpl;->removeMediaSourceHolders(II)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->createMaskingTimeline()Landroidx/media3/common/p1;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    move-object v0, p0

    .line 31
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getPeriodPositionUsAfterTimelineChanged(Landroidx/media3/common/p1;Landroidx/media3/common/p1;IJ)Landroid/util/Pair;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {p0, p1, v2, v1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskTimelineAndPosition(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/p1;Landroid/util/Pair;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget v1, p1, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 40
    .line 41
    if-eq v1, v7, :cond_0

    .line 42
    .line 43
    const/4 v2, 0x4

    .line 44
    if-eq v1, v2, :cond_0

    .line 45
    .line 46
    if-ge p2, p3, :cond_0

    .line 47
    .line 48
    if-ne p3, v6, :cond_0

    .line 49
    .line 50
    iget-object v1, p1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 51
    .line 52
    invoke-virtual {v1}, Landroidx/media3/common/p1;->getWindowCount()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-lt v3, v1, :cond_0

    .line 57
    .line 58
    invoke-virtual {p1, v2}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithPlaybackState(I)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    :cond_0
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->internalPlayer:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 63
    .line 64
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->shuffleOrder:Landroidx/media3/exoplayer/source/ShuffleOrder;

    .line 65
    .line 66
    invoke-virtual {v1, p2, p3, v2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->removeMediaSources(IILandroidx/media3/exoplayer/source/ShuffleOrder;)V

    .line 67
    .line 68
    .line 69
    return-object p1
.end method

.method private removeMediaSourceHolders(II)V
    .locals 2

    .line 1
    add-int/lit8 v0, p2, -0x1

    .line 2
    .line 3
    :goto_0
    if-lt v0, p1, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaSourceHolderSnapshots:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    add-int/lit8 v0, v0, -0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->shuffleOrder:Landroidx/media3/exoplayer/source/ShuffleOrder;

    .line 14
    .line 15
    invoke-interface {v0, p1, p2}, Landroidx/media3/exoplayer/source/ShuffleOrder;->cloneAndRemove(II)Landroidx/media3/exoplayer/source/ShuffleOrder;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->shuffleOrder:Landroidx/media3/exoplayer/source/ShuffleOrder;

    .line 20
    .line 21
    return-void
.end method

.method private removeSurfaceCallbacks()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->sphericalGLSurfaceView:Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->frameMetadataListener:Landroidx/media3/exoplayer/ExoPlayerImpl$FrameMetadataListener;

    .line 7
    .line 8
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->createMessageInternal(Landroidx/media3/exoplayer/PlayerMessage$Target;)Landroidx/media3/exoplayer/PlayerMessage;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/16 v2, 0x2710

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/PlayerMessage;->setType(I)Landroidx/media3/exoplayer/PlayerMessage;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/PlayerMessage;->setPayload(Ljava/lang/Object;)Landroidx/media3/exoplayer/PlayerMessage;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Landroidx/media3/exoplayer/PlayerMessage;->send()Landroidx/media3/exoplayer/PlayerMessage;

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->sphericalGLSurfaceView:Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;

    .line 26
    .line 27
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->componentListener:Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->removeVideoSurfaceListener(Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$VideoSurfaceListener;)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->sphericalGLSurfaceView:Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;

    .line 33
    .line 34
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->textureView:Landroid/view/TextureView;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->componentListener:Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;

    .line 43
    .line 44
    if-eq v0, v2, :cond_1

    .line 45
    .line 46
    const-string v0, "ExoPlayerImpl"

    .line 47
    .line 48
    const-string v2, "SurfaceTextureListener already unset or replaced."

    .line 49
    .line 50
    invoke-static {v0, v2}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->textureView:Landroid/view/TextureView;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    iput-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->textureView:Landroid/view/TextureView;

    .line 60
    .line 61
    :cond_2
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->surfaceHolder:Landroid/view/SurfaceHolder;

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->componentListener:Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;

    .line 66
    .line 67
    invoke-interface {v0, v2}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 68
    .line 69
    .line 70
    iput-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->surfaceHolder:Landroid/view/SurfaceHolder;

    .line 71
    .line 72
    :cond_3
    return-void
.end method

.method public static synthetic s(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$updatePlaybackInfo$19(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private sendRendererMessage(IILjava/lang/Object;)V
    .locals 5

    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->renderers:[Landroidx/media3/exoplayer/Renderer;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    const/4 v4, -0x1

    if-eq p1, v4, :cond_0

    .line 3
    invoke-interface {v3}, Landroidx/media3/exoplayer/Renderer;->getTrackType()I

    move-result v4

    if-ne v4, p1, :cond_1

    .line 4
    :cond_0
    invoke-direct {p0, v3}, Landroidx/media3/exoplayer/ExoPlayerImpl;->createMessageInternal(Landroidx/media3/exoplayer/PlayerMessage$Target;)Landroidx/media3/exoplayer/PlayerMessage;

    move-result-object v3

    invoke-virtual {v3, p2}, Landroidx/media3/exoplayer/PlayerMessage;->setType(I)Landroidx/media3/exoplayer/PlayerMessage;

    move-result-object v3

    invoke-virtual {v3, p3}, Landroidx/media3/exoplayer/PlayerMessage;->setPayload(Ljava/lang/Object;)Landroidx/media3/exoplayer/PlayerMessage;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/media3/exoplayer/PlayerMessage;->send()Landroidx/media3/exoplayer/PlayerMessage;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private sendRendererMessage(ILjava/lang/Object;)V
    .locals 1

    const/4 v0, -0x1

    .line 1
    invoke-direct {p0, v0, p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendRendererMessage(IILjava/lang/Object;)V

    return-void
.end method

.method private sendVolumeToRenderers()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->volume:F

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioFocusManager:Landroidx/media3/exoplayer/AudioFocusManager;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/media3/exoplayer/AudioFocusManager;->getVolumeMultiplier()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    mul-float/2addr v0, v1

    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {p0, v2, v1, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendRendererMessage(IILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private setMediaSourcesInternal(Ljava/util/List;IJZ)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/source/MediaSource;",
            ">;IJZ)V"
        }
    .end annotation

    .line 1
    move/from16 v1, p2

    .line 2
    .line 3
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 4
    .line 5
    invoke-direct {p0, v2}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getCurrentWindowIndexInternal(Landroidx/media3/exoplayer/PlaybackInfo;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getCurrentPosition()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    iget v5, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    add-int/2addr v5, v6

    .line 17
    iput v5, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    .line 18
    .line 19
    iget-object v5, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaSourceHolderSnapshots:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    const/4 v7, 0x0

    .line 26
    if-nez v5, :cond_0

    .line 27
    .line 28
    iget-object v5, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaSourceHolderSnapshots:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    invoke-direct {p0, v7, v5}, Landroidx/media3/exoplayer/ExoPlayerImpl;->removeMediaSourceHolders(II)V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-direct {p0, v7, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->addMediaSourceHolders(ILjava/util/List;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->createMaskingTimeline()Landroidx/media3/common/p1;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {v5}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    if-nez v8, :cond_2

    .line 50
    .line 51
    invoke-virtual {v5}, Landroidx/media3/common/p1;->getWindowCount()I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    if-ge v1, v8, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    new-instance v1, Landroidx/media3/common/y;

    .line 59
    .line 60
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 61
    .line 62
    .line 63
    throw v1

    .line 64
    :cond_2
    :goto_0
    const/4 v8, -0x1

    .line 65
    if-eqz p5, :cond_3

    .line 66
    .line 67
    iget-boolean v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->shuffleModeEnabled:Z

    .line 68
    .line 69
    invoke-virtual {v5, v1}, Landroidx/media3/common/p1;->getFirstWindowIndex(Z)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    :goto_1
    move v10, v1

    .line 79
    goto :goto_2

    .line 80
    :cond_3
    if-ne v1, v8, :cond_4

    .line 81
    .line 82
    move v10, v2

    .line 83
    move-wide v2, v3

    .line 84
    goto :goto_2

    .line 85
    :cond_4
    move-wide/from16 v2, p3

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :goto_2
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 89
    .line 90
    invoke-direct {p0, v5, v10, v2, v3}, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskWindowPositionMsOrGetPeriodPositionUs(Landroidx/media3/common/p1;IJ)Landroid/util/Pair;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-direct {p0, v1, v5, v4}, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskTimelineAndPosition(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/p1;Landroid/util/Pair;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    iget v4, v1, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 99
    .line 100
    if-eq v10, v8, :cond_7

    .line 101
    .line 102
    if-eq v4, v6, :cond_7

    .line 103
    .line 104
    invoke-virtual {v5}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-nez v4, :cond_6

    .line 109
    .line 110
    invoke-virtual {v5}, Landroidx/media3/common/p1;->getWindowCount()I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-lt v10, v4, :cond_5

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_5
    const/4 v4, 0x2

    .line 118
    goto :goto_4

    .line 119
    :cond_6
    :goto_3
    const/4 v4, 0x4

    .line 120
    :cond_7
    :goto_4
    invoke-virtual {v1, v4}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithPlaybackState(I)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    iget-object v8, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->internalPlayer:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 125
    .line 126
    invoke-static {v2, v3}, Lh1/i0;->S(J)J

    .line 127
    .line 128
    .line 129
    move-result-wide v11

    .line 130
    iget-object v13, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->shuffleOrder:Landroidx/media3/exoplayer/source/ShuffleOrder;

    .line 131
    .line 132
    invoke-virtual/range {v8 .. v13}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setMediaSources(Ljava/util/List;IJLandroidx/media3/exoplayer/source/ShuffleOrder;)V

    .line 133
    .line 134
    .line 135
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 136
    .line 137
    iget-object v2, v2, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 138
    .line 139
    iget-object v2, v2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 140
    .line 141
    iget-object v3, v1, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 142
    .line 143
    iget-object v3, v3, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 144
    .line 145
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-nez v2, :cond_8

    .line 150
    .line 151
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 152
    .line 153
    iget-object v2, v2, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 154
    .line 155
    invoke-virtual {v2}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-nez v2, :cond_8

    .line 160
    .line 161
    move v3, v6

    .line 162
    goto :goto_5

    .line 163
    :cond_8
    move v3, v7

    .line 164
    :goto_5
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getCurrentPositionUsInternal(Landroidx/media3/exoplayer/PlaybackInfo;)J

    .line 165
    .line 166
    .line 167
    move-result-wide v5

    .line 168
    const/4 v7, -0x1

    .line 169
    const/4 v8, 0x0

    .line 170
    const/4 v2, 0x0

    .line 171
    const/4 v4, 0x4

    .line 172
    move-object v0, p0

    .line 173
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updatePlaybackInfo(Landroidx/media3/exoplayer/PlaybackInfo;IZIJIZ)V

    .line 174
    .line 175
    .line 176
    return-void
.end method

.method private setNonVideoOutputSurfaceHolderInternal(Landroid/view/SurfaceHolder;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->surfaceHolderSurfaceIsVideoOutput:Z

    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->surfaceHolder:Landroid/view/SurfaceHolder;

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->componentListener:Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;

    .line 7
    .line 8
    invoke-interface {p1, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->surfaceHolder:Landroid/view/SurfaceHolder;

    .line 12
    .line 13
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/Surface;->isValid()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->surfaceHolder:Landroid/view/SurfaceHolder;

    .line 26
    .line 27
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-direct {p0, v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->maybeNotifySurfaceSizeChanged(II)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    invoke-direct {p0, v0, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->maybeNotifySurfaceSizeChanged(II)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method private setSurfaceTextureInternal(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    .line 1
    new-instance v0, Landroid/view/Surface;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setVideoOutputInternal(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->ownedSurface:Landroid/view/Surface;

    .line 10
    .line 11
    return-void
.end method

.method private setVideoOutputInternal(Ljava/lang/Object;)V
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 7
    .line 8
    array-length v2, v1

    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    :goto_0
    const/4 v5, 0x1

    .line 12
    if-ge v4, v2, :cond_1

    .line 13
    .line 14
    aget-object v6, v1, v4

    .line 15
    .line 16
    invoke-interface {v6}, Landroidx/media3/exoplayer/Renderer;->getTrackType()I

    .line 17
    .line 18
    .line 19
    move-result v7

    .line 20
    const/4 v8, 0x2

    .line 21
    if-ne v7, v8, :cond_0

    .line 22
    .line 23
    invoke-direct {p0, v6}, Landroidx/media3/exoplayer/ExoPlayerImpl;->createMessageInternal(Landroidx/media3/exoplayer/PlayerMessage$Target;)Landroidx/media3/exoplayer/PlayerMessage;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    invoke-virtual {v6, v5}, Landroidx/media3/exoplayer/PlayerMessage;->setType(I)Landroidx/media3/exoplayer/PlayerMessage;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v5, p1}, Landroidx/media3/exoplayer/PlayerMessage;->setPayload(Ljava/lang/Object;)Landroidx/media3/exoplayer/PlayerMessage;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v5}, Landroidx/media3/exoplayer/PlayerMessage;->send()Landroidx/media3/exoplayer/PlayerMessage;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

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
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->videoOutput:Ljava/lang/Object;

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    if-eq v1, p1, :cond_3

    .line 50
    .line 51
    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    move v2, v3

    .line 56
    :goto_1
    if-ge v2, v1, :cond_2

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    check-cast v4, Landroidx/media3/exoplayer/PlayerMessage;

    .line 65
    .line 66
    iget-wide v6, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->detachSurfaceTimeoutMs:J

    .line 67
    .line 68
    invoke-virtual {v4, v6, v7}, Landroidx/media3/exoplayer/PlayerMessage;->blockUntilDelivered(J)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :catch_0
    move v3, v5

    .line 73
    goto :goto_2

    .line 74
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 79
    .line 80
    .line 81
    :cond_2
    :goto_2
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->videoOutput:Ljava/lang/Object;

    .line 82
    .line 83
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->ownedSurface:Landroid/view/Surface;

    .line 84
    .line 85
    if-ne v0, v1, :cond_3

    .line 86
    .line 87
    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    .line 88
    .line 89
    .line 90
    const/4 v0, 0x0

    .line 91
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->ownedSurface:Landroid/view/Surface;

    .line 92
    .line 93
    :cond_3
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->videoOutput:Ljava/lang/Object;

    .line 94
    .line 95
    if-eqz v3, :cond_4

    .line 96
    .line 97
    new-instance p1, Landroidx/media3/exoplayer/ExoTimeoutException;

    .line 98
    .line 99
    const/4 v0, 0x3

    .line 100
    invoke-direct {p1, v0}, Landroidx/media3/exoplayer/ExoTimeoutException;-><init>(I)V

    .line 101
    .line 102
    .line 103
    const/16 v0, 0x3eb

    .line 104
    .line 105
    invoke-static {p1, v0}, Landroidx/media3/exoplayer/ExoPlaybackException;->createForUnexpected(Ljava/lang/RuntimeException;I)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->stopInternal(Landroidx/media3/exoplayer/ExoPlaybackException;)V

    .line 110
    .line 111
    .line 112
    :cond_4
    return-void
.end method

.method private stopInternal(Landroidx/media3/exoplayer/ExoPlaybackException;)V
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithLoadingMediaPeriodId(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-wide v1, v0, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 10
    .line 11
    iput-wide v1, v0, Landroidx/media3/exoplayer/PlaybackInfo;->bufferedPositionUs:J

    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    iput-wide v1, v0, Landroidx/media3/exoplayer/PlaybackInfo;->totalBufferedDurationUs:J

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithPlaybackState(I)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithPlaybackError(Landroidx/media3/exoplayer/ExoPlaybackException;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_0
    move-object v3, v0

    .line 29
    iget p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    .line 30
    .line 31
    add-int/2addr p1, v1

    .line 32
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    .line 33
    .line 34
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->internalPlayer:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->stop()V

    .line 37
    .line 38
    .line 39
    const/4 v9, -0x1

    .line 40
    const/4 v10, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    const/4 v6, 0x5

    .line 44
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    move-object v2, p0

    .line 50
    invoke-direct/range {v2 .. v10}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updatePlaybackInfo(Landroidx/media3/exoplayer/PlaybackInfo;IZIJIZ)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public static synthetic t(Landroidx/media3/common/o0;ILandroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$updatePlaybackInfo$14(Landroidx/media3/common/o0;ILandroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic u(Landroidx/media3/common/g;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$setAudioAttributes$8(Landroidx/media3/common/g;Landroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private updateAvailableCommands()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->availableCommands:Landroidx/media3/common/z0;

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->wrappingPlayer:Landroidx/media3/common/d1;

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->permanentAvailableCommands:Landroidx/media3/common/z0;

    .line 8
    .line 9
    sget v4, Lh1/i0;->a:I

    .line 10
    .line 11
    invoke-interface {v2}, Landroidx/media3/common/d1;->isPlayingAd()Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    invoke-interface {v2}, Landroidx/media3/common/d1;->isCurrentMediaItemSeekable()Z

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    invoke-interface {v2}, Landroidx/media3/common/d1;->hasPreviousMediaItem()Z

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    invoke-interface {v2}, Landroidx/media3/common/d1;->hasNextMediaItem()Z

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    invoke-interface {v2}, Landroidx/media3/common/d1;->isCurrentMediaItemLive()Z

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    invoke-interface {v2}, Landroidx/media3/common/d1;->isCurrentMediaItemDynamic()Z

    .line 32
    .line 33
    .line 34
    move-result v9

    .line 35
    invoke-interface {v2}, Landroidx/media3/common/d1;->getCurrentTimeline()Landroidx/media3/common/p1;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    new-instance v10, La1/o;

    .line 44
    .line 45
    const/16 v11, 0xa

    .line 46
    .line 47
    invoke-direct {v10, v11}, La1/o;-><init>(I)V

    .line 48
    .line 49
    .line 50
    iget-object v12, v10, La1/o;->k:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v12, La4/j0;

    .line 53
    .line 54
    iget-object v3, v3, Landroidx/media3/common/z0;->a:Landroidx/media3/common/u;

    .line 55
    .line 56
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    const/4 v14, 0x0

    .line 60
    :goto_0
    iget-object v15, v3, Landroidx/media3/common/u;->a:Landroid/util/SparseBooleanArray;

    .line 61
    .line 62
    invoke-virtual {v15}, Landroid/util/SparseBooleanArray;->size()I

    .line 63
    .line 64
    .line 65
    move-result v15

    .line 66
    if-ge v14, v15, :cond_0

    .line 67
    .line 68
    invoke-virtual {v3, v14}, Landroidx/media3/common/u;->b(I)I

    .line 69
    .line 70
    .line 71
    move-result v15

    .line 72
    invoke-virtual {v12, v15}, La4/j0;->a(I)V

    .line 73
    .line 74
    .line 75
    add-int/lit8 v14, v14, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    xor-int/lit8 v3, v4, 0x1

    .line 79
    .line 80
    const/4 v14, 0x4

    .line 81
    invoke-virtual {v10, v14, v3}, La1/o;->b(IZ)V

    .line 82
    .line 83
    .line 84
    if-eqz v5, :cond_1

    .line 85
    .line 86
    if-nez v4, :cond_1

    .line 87
    .line 88
    const/4 v13, 0x1

    .line 89
    goto :goto_1

    .line 90
    :cond_1
    const/4 v13, 0x0

    .line 91
    :goto_1
    const/4 v15, 0x5

    .line 92
    invoke-virtual {v10, v15, v13}, La1/o;->b(IZ)V

    .line 93
    .line 94
    .line 95
    if-eqz v6, :cond_2

    .line 96
    .line 97
    if-nez v4, :cond_2

    .line 98
    .line 99
    const/4 v13, 0x1

    .line 100
    goto :goto_2

    .line 101
    :cond_2
    const/4 v13, 0x0

    .line 102
    :goto_2
    const/4 v15, 0x6

    .line 103
    invoke-virtual {v10, v15, v13}, La1/o;->b(IZ)V

    .line 104
    .line 105
    .line 106
    if-nez v2, :cond_4

    .line 107
    .line 108
    if-nez v6, :cond_3

    .line 109
    .line 110
    if-eqz v8, :cond_3

    .line 111
    .line 112
    if-eqz v5, :cond_4

    .line 113
    .line 114
    :cond_3
    if-nez v4, :cond_4

    .line 115
    .line 116
    const/4 v6, 0x1

    .line 117
    goto :goto_3

    .line 118
    :cond_4
    const/4 v6, 0x0

    .line 119
    :goto_3
    const/4 v13, 0x7

    .line 120
    invoke-virtual {v10, v13, v6}, La1/o;->b(IZ)V

    .line 121
    .line 122
    .line 123
    if-eqz v7, :cond_5

    .line 124
    .line 125
    if-nez v4, :cond_5

    .line 126
    .line 127
    const/4 v6, 0x1

    .line 128
    goto :goto_4

    .line 129
    :cond_5
    const/4 v6, 0x0

    .line 130
    :goto_4
    const/16 v13, 0x8

    .line 131
    .line 132
    invoke-virtual {v10, v13, v6}, La1/o;->b(IZ)V

    .line 133
    .line 134
    .line 135
    if-nez v2, :cond_7

    .line 136
    .line 137
    if-nez v7, :cond_6

    .line 138
    .line 139
    if-eqz v8, :cond_7

    .line 140
    .line 141
    if-eqz v9, :cond_7

    .line 142
    .line 143
    :cond_6
    if-nez v4, :cond_7

    .line 144
    .line 145
    const/4 v2, 0x1

    .line 146
    goto :goto_5

    .line 147
    :cond_7
    const/4 v2, 0x0

    .line 148
    :goto_5
    const/16 v6, 0x9

    .line 149
    .line 150
    invoke-virtual {v10, v6, v2}, La1/o;->b(IZ)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v10, v11, v3}, La1/o;->b(IZ)V

    .line 154
    .line 155
    .line 156
    if-eqz v5, :cond_8

    .line 157
    .line 158
    if-nez v4, :cond_8

    .line 159
    .line 160
    const/4 v2, 0x1

    .line 161
    goto :goto_6

    .line 162
    :cond_8
    const/4 v2, 0x0

    .line 163
    :goto_6
    const/16 v3, 0xb

    .line 164
    .line 165
    invoke-virtual {v10, v3, v2}, La1/o;->b(IZ)V

    .line 166
    .line 167
    .line 168
    if-eqz v5, :cond_9

    .line 169
    .line 170
    if-nez v4, :cond_9

    .line 171
    .line 172
    const/4 v13, 0x1

    .line 173
    goto :goto_7

    .line 174
    :cond_9
    const/4 v13, 0x0

    .line 175
    :goto_7
    const/16 v2, 0xc

    .line 176
    .line 177
    invoke-virtual {v10, v2, v13}, La1/o;->b(IZ)V

    .line 178
    .line 179
    .line 180
    new-instance v2, Landroidx/media3/common/z0;

    .line 181
    .line 182
    invoke-virtual {v12}, La4/j0;->b()Landroidx/media3/common/u;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-direct {v2, v3}, Landroidx/media3/common/z0;-><init>(Landroidx/media3/common/u;)V

    .line 187
    .line 188
    .line 189
    iput-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->availableCommands:Landroidx/media3/common/z0;

    .line 190
    .line 191
    invoke-virtual {v2, v1}, Landroidx/media3/common/z0;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-nez v1, :cond_a

    .line 196
    .line 197
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 198
    .line 199
    new-instance v2, Landroidx/media3/exoplayer/t;

    .line 200
    .line 201
    invoke-direct {v2, v0, v14}, Landroidx/media3/exoplayer/t;-><init>(Landroidx/media3/exoplayer/ExoPlayerImpl;I)V

    .line 202
    .line 203
    .line 204
    const/16 v3, 0xd

    .line 205
    .line 206
    invoke-virtual {v1, v3, v2}, Lh1/p;->c(ILh1/m;)V

    .line 207
    .line 208
    .line 209
    :cond_a
    return-void
.end method

.method private updateMediaSourcesWithMediaItems(IILjava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Landroidx/media3/common/o0;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->internalPlayer:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->updateMediaSourcesWithMediaItems(IILjava/util/List;)V

    .line 10
    .line 11
    .line 12
    move v0, p1

    .line 13
    :goto_0
    if-ge v0, p2, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaSourceHolderSnapshots:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroidx/media3/exoplayer/ExoPlayerImpl$MediaSourceHolderSnapshot;

    .line 22
    .line 23
    new-instance v2, Landroidx/media3/exoplayer/source/TimelineWithUpdatedMediaItem;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroidx/media3/exoplayer/ExoPlayerImpl$MediaSourceHolderSnapshot;->getTimeline()Landroidx/media3/common/p1;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    sub-int v4, v0, p1

    .line 30
    .line 31
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Landroidx/media3/common/o0;

    .line 36
    .line 37
    invoke-direct {v2, v3, v4}, Landroidx/media3/exoplayer/source/TimelineWithUpdatedMediaItem;-><init>(Landroidx/media3/common/p1;Landroidx/media3/common/o0;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/ExoPlayerImpl$MediaSourceHolderSnapshot;->updateTimeline(Landroidx/media3/common/p1;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->createMaskingTimeline()Landroidx/media3/common/p1;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 51
    .line 52
    invoke-virtual {p2, p1}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithTimeline(Landroidx/media3/common/p1;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const/4 v7, -0x1

    .line 57
    const/4 v8, 0x0

    .line 58
    const/4 v2, 0x0

    .line 59
    const/4 v3, 0x0

    .line 60
    const/4 v4, 0x4

    .line 61
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    move-object v0, p0

    .line 67
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updatePlaybackInfo(Landroidx/media3/exoplayer/PlaybackInfo;IZIJIZ)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method private updatePlayWhenReady(ZII)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 p1, -0x1

    .line 4
    if-eq p2, p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImpl;->computePlaybackSuppressionReason(ZI)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 14
    .line 15
    iget-boolean v1, v0, Landroidx/media3/exoplayer/PlaybackInfo;->playWhenReady:Z

    .line 16
    .line 17
    if-ne v1, p1, :cond_1

    .line 18
    .line 19
    iget v1, v0, Landroidx/media3/exoplayer/PlaybackInfo;->playbackSuppressionReason:I

    .line 20
    .line 21
    if-ne v1, p2, :cond_1

    .line 22
    .line 23
    iget v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->playWhenReadyChangeReason:I

    .line 24
    .line 25
    if-ne v0, p3, :cond_1

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-direct {p0, p1, p3, p2}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(ZII)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private updatePlaybackInfo(Landroidx/media3/exoplayer/PlaybackInfo;IZIJIZ)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 6
    .line 7
    iput-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 8
    .line 9
    iget-object v3, v2, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 10
    .line 11
    iget-object v4, v1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 12
    .line 13
    invoke-virtual {v3, v4}, Landroidx/media3/common/p1;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    xor-int/lit8 v5, v7, 0x1

    .line 18
    .line 19
    move/from16 v3, p3

    .line 20
    .line 21
    move/from16 v4, p4

    .line 22
    .line 23
    move/from16 v6, p8

    .line 24
    .line 25
    invoke-direct/range {v0 .. v6}, Landroidx/media3/exoplayer/ExoPlayerImpl;->evaluateMediaItemTransitionReason(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/exoplayer/PlaybackInfo;ZIZZ)Landroid/util/Pair;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    iget-object v3, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v5, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    const/4 v6, 0x0

    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    iget-object v8, v1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 49
    .line 50
    invoke-virtual {v8}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    if-nez v8, :cond_0

    .line 55
    .line 56
    iget-object v6, v1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 57
    .line 58
    iget-object v8, v1, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 59
    .line 60
    iget-object v8, v8, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object v9, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->period:Landroidx/media3/common/m1;

    .line 63
    .line 64
    invoke-virtual {v6, v8, v9}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    iget v6, v6, Landroidx/media3/common/m1;->c:I

    .line 69
    .line 70
    iget-object v8, v1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 71
    .line 72
    iget-object v9, v0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 73
    .line 74
    invoke-virtual {v8, v6, v9}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    iget-object v6, v6, Landroidx/media3/common/o1;->c:Landroidx/media3/common/o0;

    .line 79
    .line 80
    :cond_0
    sget-object v8, Landroidx/media3/common/r0;->K:Landroidx/media3/common/r0;

    .line 81
    .line 82
    iput-object v8, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->staticAndDynamicMediaMetadata:Landroidx/media3/common/r0;

    .line 83
    .line 84
    :cond_1
    const/4 v8, 0x0

    .line 85
    if-nez v3, :cond_2

    .line 86
    .line 87
    iget-object v9, v2, Landroidx/media3/exoplayer/PlaybackInfo;->staticMetadata:Ljava/util/List;

    .line 88
    .line 89
    iget-object v10, v1, Landroidx/media3/exoplayer/PlaybackInfo;->staticMetadata:Ljava/util/List;

    .line 90
    .line 91
    invoke-interface {v9, v10}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    if-nez v9, :cond_5

    .line 96
    .line 97
    :cond_2
    iget-object v9, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->staticAndDynamicMediaMetadata:Landroidx/media3/common/r0;

    .line 98
    .line 99
    invoke-virtual {v9}, Landroidx/media3/common/r0;->a()Landroidx/media3/common/q0;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    iget-object v10, v1, Landroidx/media3/exoplayer/PlaybackInfo;->staticMetadata:Ljava/util/List;

    .line 104
    .line 105
    move v11, v8

    .line 106
    :goto_0
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 107
    .line 108
    .line 109
    move-result v12

    .line 110
    if-ge v11, v12, :cond_4

    .line 111
    .line 112
    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v12

    .line 116
    check-cast v12, Landroidx/media3/common/t0;

    .line 117
    .line 118
    move v13, v8

    .line 119
    :goto_1
    iget-object v14, v12, Landroidx/media3/common/t0;->j:[Landroidx/media3/common/s0;

    .line 120
    .line 121
    array-length v15, v14

    .line 122
    if-ge v13, v15, :cond_3

    .line 123
    .line 124
    aget-object v14, v14, v13

    .line 125
    .line 126
    invoke-interface {v14, v9}, Landroidx/media3/common/s0;->populateMediaMetadata(Landroidx/media3/common/q0;)V

    .line 127
    .line 128
    .line 129
    add-int/lit8 v13, v13, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    add-int/lit8 v11, v11, 0x1

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_4
    new-instance v10, Landroidx/media3/common/r0;

    .line 136
    .line 137
    invoke-direct {v10, v9}, Landroidx/media3/common/r0;-><init>(Landroidx/media3/common/q0;)V

    .line 138
    .line 139
    .line 140
    iput-object v10, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->staticAndDynamicMediaMetadata:Landroidx/media3/common/r0;

    .line 141
    .line 142
    :cond_5
    invoke-direct {v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->buildUpdatedMediaMetadata()Landroidx/media3/common/r0;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    iget-object v10, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaMetadata:Landroidx/media3/common/r0;

    .line 147
    .line 148
    invoke-virtual {v9, v10}, Landroidx/media3/common/r0;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    iput-object v9, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaMetadata:Landroidx/media3/common/r0;

    .line 153
    .line 154
    iget-boolean v9, v2, Landroidx/media3/exoplayer/PlaybackInfo;->playWhenReady:Z

    .line 155
    .line 156
    iget-boolean v11, v1, Landroidx/media3/exoplayer/PlaybackInfo;->playWhenReady:Z

    .line 157
    .line 158
    if-eq v9, v11, :cond_6

    .line 159
    .line 160
    const/4 v9, 0x1

    .line 161
    goto :goto_2

    .line 162
    :cond_6
    move v9, v8

    .line 163
    :goto_2
    iget v11, v2, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 164
    .line 165
    iget v13, v1, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 166
    .line 167
    if-eq v11, v13, :cond_7

    .line 168
    .line 169
    const/4 v11, 0x1

    .line 170
    goto :goto_3

    .line 171
    :cond_7
    move v11, v8

    .line 172
    :goto_3
    if-nez v11, :cond_8

    .line 173
    .line 174
    if-eqz v9, :cond_9

    .line 175
    .line 176
    :cond_8
    invoke-direct {v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updateWakeAndWifiLock()V

    .line 177
    .line 178
    .line 179
    :cond_9
    iget-boolean v13, v2, Landroidx/media3/exoplayer/PlaybackInfo;->isLoading:Z

    .line 180
    .line 181
    iget-boolean v14, v1, Landroidx/media3/exoplayer/PlaybackInfo;->isLoading:Z

    .line 182
    .line 183
    if-eq v13, v14, :cond_a

    .line 184
    .line 185
    const/4 v13, 0x1

    .line 186
    goto :goto_4

    .line 187
    :cond_a
    move v13, v8

    .line 188
    :goto_4
    if-eqz v13, :cond_b

    .line 189
    .line 190
    invoke-direct {v0, v14}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updatePriorityTaskManagerForIsLoadingChange(Z)V

    .line 191
    .line 192
    .line 193
    :cond_b
    if-nez v7, :cond_c

    .line 194
    .line 195
    iget-object v7, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 196
    .line 197
    new-instance v14, Landroidx/media3/exoplayer/j;

    .line 198
    .line 199
    const/4 v15, 0x0

    .line 200
    move/from16 v12, p2

    .line 201
    .line 202
    invoke-direct {v14, v12, v15, v1}, Landroidx/media3/exoplayer/j;-><init>(IILjava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v7, v8, v14}, Lh1/p;->c(ILh1/m;)V

    .line 206
    .line 207
    .line 208
    :cond_c
    if-eqz p3, :cond_d

    .line 209
    .line 210
    move/from16 v7, p7

    .line 211
    .line 212
    invoke-direct {v0, v4, v2, v7}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getPreviousPositionInfo(ILandroidx/media3/exoplayer/PlaybackInfo;I)Landroidx/media3/common/c1;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    move-wide/from16 v14, p5

    .line 217
    .line 218
    invoke-direct {v0, v14, v15}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getPositionInfo(J)Landroidx/media3/common/c1;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    iget-object v12, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 223
    .line 224
    new-instance v14, Landroidx/media3/exoplayer/u;

    .line 225
    .line 226
    invoke-direct {v14, v7, v8, v4}, Landroidx/media3/exoplayer/u;-><init>(Landroidx/media3/common/c1;Landroidx/media3/common/c1;I)V

    .line 227
    .line 228
    .line 229
    const/16 v4, 0xb

    .line 230
    .line 231
    invoke-virtual {v12, v4, v14}, Lh1/p;->c(ILh1/m;)V

    .line 232
    .line 233
    .line 234
    :cond_d
    if-eqz v3, :cond_e

    .line 235
    .line 236
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 237
    .line 238
    new-instance v4, Landroidx/media3/exoplayer/j;

    .line 239
    .line 240
    const/4 v7, 0x1

    .line 241
    invoke-direct {v4, v5, v7, v6}, Landroidx/media3/exoplayer/j;-><init>(IILjava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    const/4 v5, 0x1

    .line 245
    invoke-virtual {v3, v5, v4}, Lh1/p;->c(ILh1/m;)V

    .line 246
    .line 247
    .line 248
    :cond_e
    iget-object v3, v2, Landroidx/media3/exoplayer/PlaybackInfo;->playbackError:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 249
    .line 250
    iget-object v4, v1, Landroidx/media3/exoplayer/PlaybackInfo;->playbackError:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 251
    .line 252
    if-eq v3, v4, :cond_f

    .line 253
    .line 254
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 255
    .line 256
    new-instance v4, Landroidx/media3/exoplayer/l;

    .line 257
    .line 258
    const/4 v5, 0x7

    .line 259
    invoke-direct {v4, v1, v5}, Landroidx/media3/exoplayer/l;-><init>(Landroidx/media3/exoplayer/PlaybackInfo;I)V

    .line 260
    .line 261
    .line 262
    const/16 v5, 0xa

    .line 263
    .line 264
    invoke-virtual {v3, v5, v4}, Lh1/p;->c(ILh1/m;)V

    .line 265
    .line 266
    .line 267
    iget-object v3, v1, Landroidx/media3/exoplayer/PlaybackInfo;->playbackError:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 268
    .line 269
    if-eqz v3, :cond_f

    .line 270
    .line 271
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 272
    .line 273
    new-instance v4, Landroidx/media3/exoplayer/l;

    .line 274
    .line 275
    const/16 v6, 0x8

    .line 276
    .line 277
    invoke-direct {v4, v1, v6}, Landroidx/media3/exoplayer/l;-><init>(Landroidx/media3/exoplayer/PlaybackInfo;I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v3, v5, v4}, Lh1/p;->c(ILh1/m;)V

    .line 281
    .line 282
    .line 283
    :cond_f
    iget-object v3, v2, Landroidx/media3/exoplayer/PlaybackInfo;->trackSelectorResult:Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 284
    .line 285
    iget-object v4, v1, Landroidx/media3/exoplayer/PlaybackInfo;->trackSelectorResult:Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 286
    .line 287
    if-eq v3, v4, :cond_10

    .line 288
    .line 289
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->trackSelector:Landroidx/media3/exoplayer/trackselection/TrackSelector;

    .line 290
    .line 291
    iget-object v4, v4, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->info:Ljava/lang/Object;

    .line 292
    .line 293
    invoke-virtual {v3, v4}, Landroidx/media3/exoplayer/trackselection/TrackSelector;->onSelectionActivated(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 297
    .line 298
    new-instance v4, Landroidx/media3/exoplayer/l;

    .line 299
    .line 300
    const/16 v5, 0x9

    .line 301
    .line 302
    invoke-direct {v4, v1, v5}, Landroidx/media3/exoplayer/l;-><init>(Landroidx/media3/exoplayer/PlaybackInfo;I)V

    .line 303
    .line 304
    .line 305
    const/4 v5, 0x2

    .line 306
    invoke-virtual {v3, v5, v4}, Lh1/p;->c(ILh1/m;)V

    .line 307
    .line 308
    .line 309
    :cond_10
    if-nez v10, :cond_11

    .line 310
    .line 311
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaMetadata:Landroidx/media3/common/r0;

    .line 312
    .line 313
    iget-object v4, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 314
    .line 315
    new-instance v5, Landroidx/media3/exoplayer/k;

    .line 316
    .line 317
    const/4 v6, 0x0

    .line 318
    invoke-direct {v5, v6, v3}, Landroidx/media3/exoplayer/k;-><init>(ILjava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    const/16 v3, 0xe

    .line 322
    .line 323
    invoke-virtual {v4, v3, v5}, Lh1/p;->c(ILh1/m;)V

    .line 324
    .line 325
    .line 326
    :cond_11
    if-eqz v13, :cond_12

    .line 327
    .line 328
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 329
    .line 330
    new-instance v4, Landroidx/media3/exoplayer/l;

    .line 331
    .line 332
    const/4 v5, 0x0

    .line 333
    invoke-direct {v4, v1, v5}, Landroidx/media3/exoplayer/l;-><init>(Landroidx/media3/exoplayer/PlaybackInfo;I)V

    .line 334
    .line 335
    .line 336
    const/4 v5, 0x3

    .line 337
    invoke-virtual {v3, v5, v4}, Lh1/p;->c(ILh1/m;)V

    .line 338
    .line 339
    .line 340
    :cond_12
    if-nez v11, :cond_13

    .line 341
    .line 342
    if-eqz v9, :cond_14

    .line 343
    .line 344
    :cond_13
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 345
    .line 346
    new-instance v4, Landroidx/media3/exoplayer/l;

    .line 347
    .line 348
    const/4 v5, 0x1

    .line 349
    invoke-direct {v4, v1, v5}, Landroidx/media3/exoplayer/l;-><init>(Landroidx/media3/exoplayer/PlaybackInfo;I)V

    .line 350
    .line 351
    .line 352
    const/4 v5, -0x1

    .line 353
    invoke-virtual {v3, v5, v4}, Lh1/p;->c(ILh1/m;)V

    .line 354
    .line 355
    .line 356
    :cond_14
    if-eqz v11, :cond_15

    .line 357
    .line 358
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 359
    .line 360
    new-instance v4, Landroidx/media3/exoplayer/l;

    .line 361
    .line 362
    const/4 v5, 0x2

    .line 363
    invoke-direct {v4, v1, v5}, Landroidx/media3/exoplayer/l;-><init>(Landroidx/media3/exoplayer/PlaybackInfo;I)V

    .line 364
    .line 365
    .line 366
    const/4 v5, 0x4

    .line 367
    invoke-virtual {v3, v5, v4}, Lh1/p;->c(ILh1/m;)V

    .line 368
    .line 369
    .line 370
    :cond_15
    if-nez v9, :cond_16

    .line 371
    .line 372
    iget v3, v2, Landroidx/media3/exoplayer/PlaybackInfo;->playWhenReadyChangeReason:I

    .line 373
    .line 374
    iget v4, v1, Landroidx/media3/exoplayer/PlaybackInfo;->playWhenReadyChangeReason:I

    .line 375
    .line 376
    if-eq v3, v4, :cond_17

    .line 377
    .line 378
    :cond_16
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 379
    .line 380
    new-instance v4, Landroidx/media3/exoplayer/l;

    .line 381
    .line 382
    const/4 v5, 0x3

    .line 383
    invoke-direct {v4, v1, v5}, Landroidx/media3/exoplayer/l;-><init>(Landroidx/media3/exoplayer/PlaybackInfo;I)V

    .line 384
    .line 385
    .line 386
    const/4 v5, 0x5

    .line 387
    invoke-virtual {v3, v5, v4}, Lh1/p;->c(ILh1/m;)V

    .line 388
    .line 389
    .line 390
    :cond_17
    iget v3, v2, Landroidx/media3/exoplayer/PlaybackInfo;->playbackSuppressionReason:I

    .line 391
    .line 392
    iget v4, v1, Landroidx/media3/exoplayer/PlaybackInfo;->playbackSuppressionReason:I

    .line 393
    .line 394
    if-eq v3, v4, :cond_18

    .line 395
    .line 396
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 397
    .line 398
    new-instance v4, Landroidx/media3/exoplayer/l;

    .line 399
    .line 400
    const/4 v5, 0x4

    .line 401
    invoke-direct {v4, v1, v5}, Landroidx/media3/exoplayer/l;-><init>(Landroidx/media3/exoplayer/PlaybackInfo;I)V

    .line 402
    .line 403
    .line 404
    const/4 v5, 0x6

    .line 405
    invoke-virtual {v3, v5, v4}, Lh1/p;->c(ILh1/m;)V

    .line 406
    .line 407
    .line 408
    :cond_18
    invoke-virtual {v2}, Landroidx/media3/exoplayer/PlaybackInfo;->isPlaying()Z

    .line 409
    .line 410
    .line 411
    move-result v3

    .line 412
    invoke-virtual {v1}, Landroidx/media3/exoplayer/PlaybackInfo;->isPlaying()Z

    .line 413
    .line 414
    .line 415
    move-result v4

    .line 416
    if-eq v3, v4, :cond_19

    .line 417
    .line 418
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 419
    .line 420
    new-instance v4, Landroidx/media3/exoplayer/l;

    .line 421
    .line 422
    const/4 v5, 0x5

    .line 423
    invoke-direct {v4, v1, v5}, Landroidx/media3/exoplayer/l;-><init>(Landroidx/media3/exoplayer/PlaybackInfo;I)V

    .line 424
    .line 425
    .line 426
    const/4 v5, 0x7

    .line 427
    invoke-virtual {v3, v5, v4}, Lh1/p;->c(ILh1/m;)V

    .line 428
    .line 429
    .line 430
    :cond_19
    iget-object v3, v2, Landroidx/media3/exoplayer/PlaybackInfo;->playbackParameters:Landroidx/media3/common/y0;

    .line 431
    .line 432
    iget-object v4, v1, Landroidx/media3/exoplayer/PlaybackInfo;->playbackParameters:Landroidx/media3/common/y0;

    .line 433
    .line 434
    invoke-virtual {v3, v4}, Landroidx/media3/common/y0;->equals(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result v3

    .line 438
    if-nez v3, :cond_1a

    .line 439
    .line 440
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 441
    .line 442
    new-instance v4, Landroidx/media3/exoplayer/l;

    .line 443
    .line 444
    const/4 v5, 0x6

    .line 445
    invoke-direct {v4, v1, v5}, Landroidx/media3/exoplayer/l;-><init>(Landroidx/media3/exoplayer/PlaybackInfo;I)V

    .line 446
    .line 447
    .line 448
    const/16 v5, 0xc

    .line 449
    .line 450
    invoke-virtual {v3, v5, v4}, Lh1/p;->c(ILh1/m;)V

    .line 451
    .line 452
    .line 453
    :cond_1a
    invoke-direct {v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updateAvailableCommands()V

    .line 454
    .line 455
    .line 456
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 457
    .line 458
    invoke-virtual {v3}, Lh1/p;->b()V

    .line 459
    .line 460
    .line 461
    iget-boolean v2, v2, Landroidx/media3/exoplayer/PlaybackInfo;->sleepingForOffload:Z

    .line 462
    .line 463
    iget-boolean v3, v1, Landroidx/media3/exoplayer/PlaybackInfo;->sleepingForOffload:Z

    .line 464
    .line 465
    if-eq v2, v3, :cond_1b

    .line 466
    .line 467
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioOffloadListeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 468
    .line 469
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 474
    .line 475
    .line 476
    move-result v3

    .line 477
    if-eqz v3, :cond_1b

    .line 478
    .line 479
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v3

    .line 483
    check-cast v3, Landroidx/media3/exoplayer/ExoPlayer$AudioOffloadListener;

    .line 484
    .line 485
    iget-boolean v4, v1, Landroidx/media3/exoplayer/PlaybackInfo;->sleepingForOffload:Z

    .line 486
    .line 487
    invoke-interface {v3, v4}, Landroidx/media3/exoplayer/ExoPlayer$AudioOffloadListener;->onSleepingForOffloadChanged(Z)V

    .line 488
    .line 489
    .line 490
    goto :goto_5

    .line 491
    :cond_1b
    return-void
.end method

.method private updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(ZII)V
    .locals 10

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 8
    .line 9
    iget-boolean v1, v0, Landroidx/media3/exoplayer/PlaybackInfo;->sleepingForOffload:Z

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithEstimatedPosition()Landroidx/media3/exoplayer/PlaybackInfo;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithPlayWhenReady(ZII)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->internalPlayer:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 22
    .line 23
    invoke-virtual {v0, p1, p2, p3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setPlayWhenReady(ZII)V

    .line 24
    .line 25
    .line 26
    const/4 v8, -0x1

    .line 27
    const/4 v9, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x5

    .line 31
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    move-object v1, p0

    .line 37
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updatePlaybackInfo(Landroidx/media3/exoplayer/PlaybackInfo;IZIJIZ)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method private updatePriorityTaskManagerForIsLoadingChange(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method private updateWakeAndWifiLock()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getPlaybackState()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eq v0, v2, :cond_3

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    if-eq v0, v3, :cond_1

    .line 11
    .line 12
    const/4 v3, 0x3

    .line 13
    if-eq v0, v3, :cond_1

    .line 14
    .line 15
    const/4 v2, 0x4

    .line 16
    if-ne v0, v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :cond_1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->isSleepingForOffload()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->wakeLockManager:Landroidx/media3/exoplayer/WakeLockManager;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getPlayWhenReady()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    move v1, v2

    .line 40
    :cond_2
    invoke-virtual {v3, v1}, Landroidx/media3/exoplayer/WakeLockManager;->setStayAwake(Z)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->wifiLockManager:Landroidx/media3/exoplayer/WifiLockManager;

    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getPlayWhenReady()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/WifiLockManager;->setStayAwake(Z)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_3
    :goto_0
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->wakeLockManager:Landroidx/media3/exoplayer/WakeLockManager;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/WakeLockManager;->setStayAwake(Z)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->wifiLockManager:Landroidx/media3/exoplayer/WifiLockManager;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/WifiLockManager;->setStayAwake(Z)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public static synthetic v(Landroidx/media3/common/r0;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$updatePlaybackInfo$18(Landroidx/media3/common/r0;Landroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private verifyApplicationThread()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->constructorFinished:Lh1/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh1/e;->b()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getApplicationLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eq v0, v1, :cond_2

    .line 19
    .line 20
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getApplicationLooper()Landroid/os/Looper;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    sget v2, Lh1/i0;->a:I

    .line 41
    .line 42
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 43
    .line 44
    new-instance v2, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v3, "Player is accessed on the wrong thread.\nCurrent thread: \'"

    .line 47
    .line 48
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v0, "\'\nExpected thread: \'"

    .line 55
    .line 56
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v0, "\'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread"

    .line 63
    .line 64
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-boolean v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->throwsWhenUsingWrongThread:Z

    .line 72
    .line 73
    if-nez v1, :cond_1

    .line 74
    .line 75
    iget-boolean v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->hasNotifiedFullWrongThreadWarning:Z

    .line 76
    .line 77
    if-eqz v1, :cond_0

    .line 78
    .line 79
    const/4 v1, 0x0

    .line 80
    goto :goto_0

    .line 81
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 82
    .line 83
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 84
    .line 85
    .line 86
    :goto_0
    const-string v2, "ExoPlayerImpl"

    .line 87
    .line 88
    invoke-static {v2, v0, v1}, Lh1/a;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    const/4 v0, 0x1

    .line 92
    iput-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->hasNotifiedFullWrongThreadWarning:Z

    .line 93
    .line 94
    return-void

    .line 95
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 96
    .line 97
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v1

    .line 101
    :cond_2
    return-void
.end method

.method public static synthetic w(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$updatePlaybackInfo$24(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic x(Landroidx/media3/exoplayer/ExoPlayerImpl;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->onSelectedOutputSuitabilityChanged(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic y(Landroidx/media3/common/v1;Landroidx/media3/common/b1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$setTrackSelectionParameters$6(Landroidx/media3/common/v1;Landroidx/media3/common/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic z(Landroidx/media3/exoplayer/ExoPlayerImpl;Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->lambda$new$1(Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public addAnalyticsListener(Landroidx/media3/exoplayer/analytics/AnalyticsListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->analyticsCollector:Landroidx/media3/exoplayer/analytics/AnalyticsCollector;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/analytics/AnalyticsCollector;->addListener(Landroidx/media3/exoplayer/analytics/AnalyticsListener;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public addAudioOffloadListener(Landroidx/media3/exoplayer/ExoPlayer$AudioOffloadListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioOffloadListeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addListener(Landroidx/media3/common/b1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lh1/p;->a(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public addMediaItems(ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Landroidx/media3/common/o0;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2}, Landroidx/media3/exoplayer/ExoPlayerImpl;->createMediaSources(Ljava/util/List;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImpl;->addMediaSources(ILjava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public addMediaSource(ILandroidx/media3/exoplayer/source/MediaSource;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 4
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImpl;->addMediaSources(ILjava/util/List;)V

    return-void
.end method

.method public addMediaSource(Landroidx/media3/exoplayer/source/MediaSource;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->addMediaSources(Ljava/util/List;)V

    return-void
.end method

.method public addMediaSources(ILjava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/source/MediaSource;",
            ">;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ltz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    .line 4
    :goto_0
    invoke-static {v2}, Lh1/a;->d(Z)V

    .line 5
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaSourceHolderSnapshots:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 6
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaSourceHolderSnapshots:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    iget p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskingWindowIndex:I

    const/4 v2, -0x1

    if-ne p1, v2, :cond_1

    move v0, v1

    :cond_1
    invoke-virtual {p0, p2, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setMediaSources(Ljava/util/List;Z)V

    return-void

    .line 8
    :cond_2
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    invoke-direct {p0, v0, p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImpl;->addMediaSourcesInternal(Landroidx/media3/exoplayer/PlaybackInfo;ILjava/util/List;)Landroidx/media3/exoplayer/PlaybackInfo;

    move-result-object v2

    const/4 v8, -0x1

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x5

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    move-object v1, p0

    .line 9
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updatePlaybackInfo(Landroidx/media3/exoplayer/PlaybackInfo;IZIJIZ)V

    return-void
.end method

.method public addMediaSources(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/source/MediaSource;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaSourceHolderSnapshots:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->addMediaSources(ILjava/util/List;)V

    return-void
.end method

.method public clearAuxEffectInfo()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/media3/common/h;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setAuxEffectInfo(Landroidx/media3/common/h;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public clearCameraMotionListener(Landroidx/media3/exoplayer/video/spherical/CameraMotionListener;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->cameraMotionListener:Landroidx/media3/exoplayer/video/spherical/CameraMotionListener;

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->frameMetadataListener:Landroidx/media3/exoplayer/ExoPlayerImpl$FrameMetadataListener;

    .line 10
    .line 11
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->createMessageInternal(Landroidx/media3/exoplayer/PlayerMessage$Target;)Landroidx/media3/exoplayer/PlayerMessage;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/16 v0, 0x8

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/PlayerMessage;->setType(I)Landroidx/media3/exoplayer/PlayerMessage;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/PlayerMessage;->setPayload(Ljava/lang/Object;)Landroidx/media3/exoplayer/PlayerMessage;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Landroidx/media3/exoplayer/PlayerMessage;->send()Landroidx/media3/exoplayer/PlayerMessage;

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public clearVideoFrameMetadataListener(Landroidx/media3/exoplayer/video/VideoFrameMetadataListener;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->videoFrameMetadataListener:Landroidx/media3/exoplayer/video/VideoFrameMetadataListener;

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->frameMetadataListener:Landroidx/media3/exoplayer/ExoPlayerImpl$FrameMetadataListener;

    .line 10
    .line 11
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->createMessageInternal(Landroidx/media3/exoplayer/PlayerMessage$Target;)Landroidx/media3/exoplayer/PlayerMessage;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v0, 0x7

    .line 16
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/PlayerMessage;->setType(I)Landroidx/media3/exoplayer/PlayerMessage;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/PlayerMessage;->setPayload(Ljava/lang/Object;)Landroidx/media3/exoplayer/PlayerMessage;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Landroidx/media3/exoplayer/PlayerMessage;->send()Landroidx/media3/exoplayer/PlayerMessage;

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public clearVideoSurface()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->removeSurfaceCallbacks()V

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setVideoOutputInternal(Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->maybeNotifySurfaceSizeChanged(II)V

    return-void
.end method

.method public clearVideoSurface(Landroid/view/Surface;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    if-eqz p1, :cond_0

    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->videoOutput:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    .line 7
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->clearVideoSurface()V

    :cond_0
    return-void
.end method

.method public clearVideoSurfaceHolder(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->surfaceHolder:Landroid/view/SurfaceHolder;

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->clearVideoSurface()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public clearVideoSurfaceView(Landroid/view/SurfaceView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->clearVideoSurfaceHolder(Landroid/view/SurfaceHolder;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public clearVideoTextureView(Landroid/view/TextureView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->textureView:Landroid/view/TextureView;

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->clearVideoSurface()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public createMessage(Landroidx/media3/exoplayer/PlayerMessage$Target;)Landroidx/media3/exoplayer/PlayerMessage;
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->createMessageInternal(Landroidx/media3/exoplayer/PlayerMessage$Target;)Landroidx/media3/exoplayer/PlayerMessage;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public decreaseDeviceVolume()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->streamVolumeManager:Landroidx/media3/exoplayer/StreamVolumeManager;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/StreamVolumeManager;->decreaseVolume(I)V

    :cond_0
    return-void
.end method

.method public decreaseDeviceVolume(I)V
    .locals 1

    .line 4
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->streamVolumeManager:Landroidx/media3/exoplayer/StreamVolumeManager;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/StreamVolumeManager;->decreaseVolume(I)V

    :cond_0
    return-void
.end method

.method public getAnalyticsCollector()Landroidx/media3/exoplayer/analytics/AnalyticsCollector;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->analyticsCollector:Landroidx/media3/exoplayer/analytics/AnalyticsCollector;

    .line 5
    .line 6
    return-object v0
.end method

.method public getApplicationLooper()Landroid/os/Looper;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->applicationLooper:Landroid/os/Looper;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAudioAttributes()Landroidx/media3/common/g;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioAttributes:Landroidx/media3/common/g;

    .line 5
    .line 6
    return-object v0
.end method

.method public getAudioComponent()Landroidx/media3/exoplayer/ExoPlayer$AudioComponent;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public getAudioDecoderCounters()Landroidx/media3/exoplayer/DecoderCounters;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioDecoderCounters:Landroidx/media3/exoplayer/DecoderCounters;

    .line 5
    .line 6
    return-object v0
.end method

.method public getAudioFormat()Landroidx/media3/common/w;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioFormat:Landroidx/media3/common/w;

    .line 5
    .line 6
    return-object v0
.end method

.method public getAudioSessionId()I
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioSessionId:I

    .line 5
    .line 6
    return v0
.end method

.method public getAvailableCommands()Landroidx/media3/common/z0;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->availableCommands:Landroidx/media3/common/z0;

    .line 5
    .line 6
    return-object v0
.end method

.method public getBufferedPosition()J
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->isPlayingAd()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 11
    .line 12
    iget-object v1, v0, Landroidx/media3/exoplayer/PlaybackInfo;->loadingMediaPeriodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 13
    .line 14
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 23
    .line 24
    iget-wide v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->bufferedPositionUs:J

    .line 25
    .line 26
    invoke-static {v0, v1}, Lh1/i0;->f0(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    return-wide v0

    .line 31
    :cond_0
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getDuration()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    return-wide v0

    .line 36
    :cond_1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getContentBufferedPosition()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    return-wide v0
.end method

.method public getClock()Lh1/b;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->clock:Lh1/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public getContentBufferedPosition()J
    .locals 5

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-wide v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskingWindowPositionMs:J

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 18
    .line 19
    iget-object v1, v0, Landroidx/media3/exoplayer/PlaybackInfo;->loadingMediaPeriodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 20
    .line 21
    iget-wide v1, v1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->windowSequenceNumber:J

    .line 22
    .line 23
    iget-object v3, v0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 24
    .line 25
    iget-wide v3, v3, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->windowSequenceNumber:J

    .line 26
    .line 27
    cmp-long v1, v1, v3

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getCurrentMediaItemIndex()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iget-object v2, p0, Landroidx/media3/common/i;->window:Landroidx/media3/common/o1;

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-wide v0, v0, Landroidx/media3/common/o1;->m:J

    .line 44
    .line 45
    invoke-static {v0, v1}, Lh1/i0;->f0(J)J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    return-wide v0

    .line 50
    :cond_1
    iget-wide v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->bufferedPositionUs:J

    .line 51
    .line 52
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 53
    .line 54
    iget-object v2, v2, Landroidx/media3/exoplayer/PlaybackInfo;->loadingMediaPeriodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 55
    .line 56
    invoke-virtual {v2}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_3

    .line 61
    .line 62
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 63
    .line 64
    iget-object v1, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 65
    .line 66
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->loadingMediaPeriodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 67
    .line 68
    iget-object v0, v0, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 69
    .line 70
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->period:Landroidx/media3/common/m1;

    .line 71
    .line 72
    invoke-virtual {v1, v0, v2}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 77
    .line 78
    iget-object v1, v1, Landroidx/media3/exoplayer/PlaybackInfo;->loadingMediaPeriodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 79
    .line 80
    iget v1, v1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Landroidx/media3/common/m1;->d(I)J

    .line 83
    .line 84
    .line 85
    move-result-wide v1

    .line 86
    const-wide/high16 v3, -0x8000000000000000L

    .line 87
    .line 88
    cmp-long v3, v1, v3

    .line 89
    .line 90
    if-nez v3, :cond_2

    .line 91
    .line 92
    iget-wide v0, v0, Landroidx/media3/common/m1;->d:J

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    move-wide v0, v1

    .line 96
    :cond_3
    :goto_0
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 97
    .line 98
    iget-object v3, v2, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 99
    .line 100
    iget-object v2, v2, Landroidx/media3/exoplayer/PlaybackInfo;->loadingMediaPeriodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 101
    .line 102
    invoke-direct {p0, v3, v2, v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->periodPositionUsToWindowPositionUs(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;J)J

    .line 103
    .line 104
    .line 105
    move-result-wide v0

    .line 106
    invoke-static {v0, v1}, Lh1/i0;->f0(J)J

    .line 107
    .line 108
    .line 109
    move-result-wide v0

    .line 110
    return-wide v0
.end method

.method public getContentPosition()J
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 5
    .line 6
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getContentPositionInternal(Landroidx/media3/exoplayer/PlaybackInfo;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
.end method

.method public getCurrentAdGroupIndex()I
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->isPlayingAd()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 11
    .line 12
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 13
    .line 14
    iget v0, v0, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, -0x1

    .line 18
    return v0
.end method

.method public getCurrentAdIndexInAdGroup()I
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->isPlayingAd()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 11
    .line 12
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 13
    .line 14
    iget v0, v0, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adIndexInAdGroup:I

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, -0x1

    .line 18
    return v0
.end method

.method public getCurrentCues()Lg1/c;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->currentCueGroup:Lg1/c;

    .line 5
    .line 6
    return-object v0
.end method

.method public getCurrentMediaItemIndex()I
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 5
    .line 6
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getCurrentWindowIndexInternal(Landroidx/media3/exoplayer/PlaybackInfo;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, -0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :cond_0
    return v0
.end method

.method public getCurrentPeriodIndex()I
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskingPeriodIndex:I

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 18
    .line 19
    iget-object v1, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 20
    .line 21
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 22
    .line 23
    iget-object v0, v0, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    return v0
.end method

.method public getCurrentPosition()J
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 5
    .line 6
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getCurrentPositionUsInternal(Landroidx/media3/exoplayer/PlaybackInfo;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Lh1/i0;->f0(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
.end method

.method public getCurrentTimeline()Landroidx/media3/common/p1;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 7
    .line 8
    return-object v0
.end method

.method public getCurrentTrackGroups()Landroidx/media3/exoplayer/source/TrackGroupArray;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->trackGroups:Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 7
    .line 8
    return-object v0
.end method

.method public getCurrentTrackSelections()Landroidx/media3/exoplayer/trackselection/TrackSelectionArray;
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/media3/exoplayer/trackselection/TrackSelectionArray;

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 7
    .line 8
    iget-object v1, v1, Landroidx/media3/exoplayer/PlaybackInfo;->trackSelectorResult:Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 9
    .line 10
    iget-object v1, v1, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->selections:[Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;

    .line 11
    .line 12
    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/trackselection/TrackSelectionArray;-><init>([Landroidx/media3/exoplayer/trackselection/TrackSelection;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public getCurrentTracks()Landroidx/media3/common/x1;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->trackSelectorResult:Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->tracks:Landroidx/media3/common/x1;

    .line 9
    .line 10
    return-object v0
.end method

.method public getDeviceComponent()Landroidx/media3/exoplayer/ExoPlayer$DeviceComponent;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public getDeviceInfo()Landroidx/media3/common/q;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->deviceInfo:Landroidx/media3/common/q;

    .line 5
    .line 6
    return-object v0
.end method

.method public getDeviceVolume()I
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->streamVolumeManager:Landroidx/media3/exoplayer/StreamVolumeManager;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/media3/exoplayer/StreamVolumeManager;->getVolume()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public getDuration()J
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->isPlayingAd()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 11
    .line 12
    iget-object v1, v0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 13
    .line 14
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 15
    .line 16
    iget-object v2, v1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->period:Landroidx/media3/common/m1;

    .line 19
    .line 20
    invoke-virtual {v0, v2, v3}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->period:Landroidx/media3/common/m1;

    .line 24
    .line 25
    iget v2, v1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 26
    .line 27
    iget v1, v1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adIndexInAdGroup:I

    .line 28
    .line 29
    invoke-virtual {v0, v2, v1}, Landroidx/media3/common/m1;->a(II)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    invoke-static {v0, v1}, Lh1/i0;->f0(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    return-wide v0

    .line 38
    :cond_0
    invoke-virtual {p0}, Landroidx/media3/common/i;->getContentDuration()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    return-wide v0
.end method

.method public getMaxSeekToPreviousPosition()J
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->maxSeekToPreviousPositionMs:J

    .line 5
    .line 6
    return-wide v0
.end method

.method public getMediaMetadata()Landroidx/media3/common/r0;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaMetadata:Landroidx/media3/common/r0;

    .line 5
    .line 6
    return-object v0
.end method

.method public getPauseAtEndOfMediaItems()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pauseAtEndOfMediaItems:Z

    .line 5
    .line 6
    return v0
.end method

.method public getPlayWhenReady()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 5
    .line 6
    iget-boolean v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->playWhenReady:Z

    .line 7
    .line 8
    return v0
.end method

.method public getPlaybackLooper()Landroid/os/Looper;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->internalPlayer:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->getPlaybackLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getPlaybackParameters()Landroidx/media3/common/y0;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->playbackParameters:Landroidx/media3/common/y0;

    .line 7
    .line 8
    return-object v0
.end method

.method public getPlaybackState()I
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 5
    .line 6
    iget v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 7
    .line 8
    return v0
.end method

.method public getPlaybackSuppressionReason()I
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 5
    .line 6
    iget v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->playbackSuppressionReason:I

    .line 7
    .line 8
    return v0
.end method

.method public bridge synthetic getPlayerError()Landroidx/media3/common/x0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getPlayerError()Landroidx/media3/exoplayer/ExoPlaybackException;

    move-result-object v0

    return-object v0
.end method

.method public getPlayerError()Landroidx/media3/exoplayer/ExoPlaybackException;
    .locals 1

    .line 2
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->playbackError:Landroidx/media3/exoplayer/ExoPlaybackException;

    return-object v0
.end method

.method public getPlaylistMetadata()Landroidx/media3/common/r0;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playlistMetadata:Landroidx/media3/common/r0;

    .line 5
    .line 6
    return-object v0
.end method

.method public getPreloadConfiguration()Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->preloadConfiguration:Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRenderer(I)Landroidx/media3/exoplayer/Renderer;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 5
    .line 6
    aget-object p1, v0, p1

    .line 7
    .line 8
    return-object p1
.end method

.method public getRendererCount()I
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 5
    .line 6
    array-length v0, v0

    .line 7
    return v0
.end method

.method public getRendererType(I)I
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 5
    .line 6
    aget-object p1, v0, p1

    .line 7
    .line 8
    invoke-interface {p1}, Landroidx/media3/exoplayer/Renderer;->getTrackType()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public getRepeatMode()I
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->repeatMode:I

    .line 5
    .line 6
    return v0
.end method

.method public getSeekBackIncrement()J
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->seekBackIncrementMs:J

    .line 5
    .line 6
    return-wide v0
.end method

.method public getSeekForwardIncrement()J
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->seekForwardIncrementMs:J

    .line 5
    .line 6
    return-wide v0
.end method

.method public getSeekParameters()Landroidx/media3/exoplayer/SeekParameters;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->seekParameters:Landroidx/media3/exoplayer/SeekParameters;

    .line 5
    .line 6
    return-object v0
.end method

.method public getShuffleModeEnabled()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->shuffleModeEnabled:Z

    .line 5
    .line 6
    return v0
.end method

.method public getSkipSilenceEnabled()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->skipSilenceEnabled:Z

    .line 5
    .line 6
    return v0
.end method

.method public getSurfaceSize()Lh1/y;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->surfaceSize:Lh1/y;

    .line 5
    .line 6
    return-object v0
.end method

.method public getTextComponent()Landroidx/media3/exoplayer/ExoPlayer$TextComponent;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public getTotalBufferedDuration()J
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 5
    .line 6
    iget-wide v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->totalBufferedDurationUs:J

    .line 7
    .line 8
    invoke-static {v0, v1}, Lh1/i0;->f0(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public getTrackSelectionParameters()Landroidx/media3/common/v1;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->trackSelector:Landroidx/media3/exoplayer/trackselection/TrackSelector;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/media3/exoplayer/trackselection/TrackSelector;->getParameters()Landroidx/media3/common/v1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public getTrackSelector()Landroidx/media3/exoplayer/trackselection/TrackSelector;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->trackSelector:Landroidx/media3/exoplayer/trackselection/TrackSelector;

    .line 5
    .line 6
    return-object v0
.end method

.method public getVideoChangeFrameRateStrategy()I
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->videoChangeFrameRateStrategy:I

    .line 5
    .line 6
    return v0
.end method

.method public getVideoComponent()Landroidx/media3/exoplayer/ExoPlayer$VideoComponent;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public getVideoDecoderCounters()Landroidx/media3/exoplayer/DecoderCounters;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->videoDecoderCounters:Landroidx/media3/exoplayer/DecoderCounters;

    .line 5
    .line 6
    return-object v0
.end method

.method public getVideoFormat()Landroidx/media3/common/w;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->videoFormat:Landroidx/media3/common/w;

    .line 5
    .line 6
    return-object v0
.end method

.method public getVideoScalingMode()I
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->videoScalingMode:I

    .line 5
    .line 6
    return v0
.end method

.method public getVideoSize()Landroidx/media3/common/d2;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->videoSize:Landroidx/media3/common/d2;

    .line 5
    .line 6
    return-object v0
.end method

.method public getVolume()F
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->volume:F

    .line 5
    .line 6
    return v0
.end method

.method public increaseDeviceVolume()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->streamVolumeManager:Landroidx/media3/exoplayer/StreamVolumeManager;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/StreamVolumeManager;->increaseVolume(I)V

    :cond_0
    return-void
.end method

.method public increaseDeviceVolume(I)V
    .locals 1

    .line 4
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->streamVolumeManager:Landroidx/media3/exoplayer/StreamVolumeManager;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/StreamVolumeManager;->increaseVolume(I)V

    :cond_0
    return-void
.end method

.method public isDeviceMuted()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->streamVolumeManager:Landroidx/media3/exoplayer/StreamVolumeManager;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/media3/exoplayer/StreamVolumeManager;->isMuted()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public isLoading()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 5
    .line 6
    iget-boolean v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->isLoading:Z

    .line 7
    .line 8
    return v0
.end method

.method public isPlayingAd()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public isReleased()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playerReleased:Z

    .line 5
    .line 6
    return v0
.end method

.method public isSleepingForOffload()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 5
    .line 6
    iget-boolean v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->sleepingForOffload:Z

    .line 7
    .line 8
    return v0
.end method

.method public isTunnelingEnabled()Z
    .locals 5

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->trackSelectorResult:Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->rendererConfigurations:[Landroidx/media3/exoplayer/RendererConfiguration;

    .line 9
    .line 10
    array-length v1, v0

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :goto_0
    if-ge v3, v1, :cond_1

    .line 14
    .line 15
    aget-object v4, v0, v3

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    iget-boolean v4, v4, Landroidx/media3/exoplayer/RendererConfiguration;->tunneling:Z

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return v2
.end method

.method public moveMediaItems(III)V
    .locals 10

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    const/4 v3, 0x1

    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    if-gt p1, p2, :cond_0

    .line 8
    .line 9
    if-ltz p3, :cond_0

    .line 10
    .line 11
    move v4, v3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v4, 0x0

    .line 14
    :goto_0
    invoke-static {v4}, Lh1/a;->d(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v4, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaSourceHolderSnapshots:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-static {p2, v4}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    sub-int v1, v7, p1

    .line 28
    .line 29
    sub-int v1, v4, v1

    .line 30
    .line 31
    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    if-ge p1, v4, :cond_2

    .line 36
    .line 37
    if-eq p1, v7, :cond_2

    .line 38
    .line 39
    if-ne p1, v8, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getCurrentTimeline()Landroidx/media3/common/p1;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    .line 47
    .line 48
    add-int/2addr v2, v3

    .line 49
    iput v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    .line 50
    .line 51
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaSourceHolderSnapshots:Ljava/util/List;

    .line 52
    .line 53
    invoke-static {v2, p1, v7, v8}, Lh1/i0;->R(Ljava/util/List;III)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->createMaskingTimeline()Landroidx/media3/common/p1;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iget-object v9, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 61
    .line 62
    invoke-direct {p0, v9}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getCurrentWindowIndexInternal(Landroidx/media3/exoplayer/PlaybackInfo;)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    iget-object v4, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 67
    .line 68
    invoke-direct {p0, v4}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getContentPositionInternal(Landroidx/media3/exoplayer/PlaybackInfo;)J

    .line 69
    .line 70
    .line 71
    move-result-wide v4

    .line 72
    move-object v0, p0

    .line 73
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getPeriodPositionUsAfterTimelineChanged(Landroidx/media3/common/p1;Landroidx/media3/common/p1;IJ)Landroid/util/Pair;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-direct {p0, v9, v2, v1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskTimelineAndPosition(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/p1;Landroid/util/Pair;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->internalPlayer:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 82
    .line 83
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->shuffleOrder:Landroidx/media3/exoplayer/source/ShuffleOrder;

    .line 84
    .line 85
    invoke-virtual {v2, p1, v7, v8, v3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->moveMediaSources(IIILandroidx/media3/exoplayer/source/ShuffleOrder;)V

    .line 86
    .line 87
    .line 88
    const/4 v7, -0x1

    .line 89
    const/4 v8, 0x0

    .line 90
    const/4 v2, 0x0

    .line 91
    const/4 v3, 0x0

    .line 92
    const/4 v4, 0x5

    .line 93
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updatePlaybackInfo(Landroidx/media3/exoplayer/PlaybackInfo;IZIJIZ)V

    .line 99
    .line 100
    .line 101
    :cond_2
    :goto_1
    return-void
.end method

.method public prepare()V
    .locals 13

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getPlayWhenReady()Z

    move-result v0

    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioFocusManager:Landroidx/media3/exoplayer/AudioFocusManager;

    const/4 v2, 0x2

    invoke-virtual {v1, v0, v2}, Landroidx/media3/exoplayer/AudioFocusManager;->updateAudioFocus(ZI)I

    move-result v1

    .line 4
    invoke-static {v1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getPlayWhenReadyChangeReason(I)I

    move-result v3

    invoke-direct {p0, v0, v1, v3}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updatePlayWhenReady(ZII)V

    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    iget v1, v0, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    const/4 v3, 0x1

    if-eq v1, v3, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithPlaybackError(Landroidx/media3/exoplayer/ExoPlaybackException;)Landroidx/media3/exoplayer/PlaybackInfo;

    move-result-object v0

    .line 7
    iget-object v1, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    invoke-virtual {v1}, Landroidx/media3/common/p1;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v2, 0x4

    .line 8
    :cond_1
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithPlaybackState(I)Landroidx/media3/exoplayer/PlaybackInfo;

    move-result-object v5

    .line 9
    iget v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    add-int/2addr v0, v3

    iput v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->internalPlayer:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    invoke-virtual {v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->prepare()V

    const/4 v11, -0x1

    const/4 v12, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x5

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v4, p0

    .line 11
    invoke-direct/range {v4 .. v12}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updatePlaybackInfo(Landroidx/media3/exoplayer/PlaybackInfo;IZIJIZ)V

    return-void
.end method

.method public prepare(Landroidx/media3/exoplayer/source/MediaSource;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 12
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 13
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setMediaSource(Landroidx/media3/exoplayer/source/MediaSource;)V

    .line 14
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->prepare()V

    return-void
.end method

.method public prepare(Landroidx/media3/exoplayer/source/MediaSource;ZZ)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 15
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 16
    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setMediaSource(Landroidx/media3/exoplayer/source/MediaSource;Z)V

    .line 17
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->prepare()V

    return-void
.end method

.method public release()V
    .locals 5

    .line 1
    const-string v0, "ExoPlayerImpl"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Release "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v2, " [AndroidXMedia3/1.5.1] ["

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    sget-object v2, Lh1/i0;->e:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v2, "] ["

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    sget-object v2, Landroidx/media3/common/p0;->a:Ljava/util/HashSet;

    .line 37
    .line 38
    const-class v2, Landroidx/media3/common/p0;

    .line 39
    .line 40
    monitor-enter v2

    .line 41
    :try_start_0
    sget-object v3, Landroidx/media3/common/p0;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    monitor-exit v2

    .line 44
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v2, "]"

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v0, v1}, Lh1/a;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioBecomingNoisyManager:Landroidx/media3/exoplayer/AudioBecomingNoisyManager;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/AudioBecomingNoisyManager;->setEnabled(Z)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->streamVolumeManager:Landroidx/media3/exoplayer/StreamVolumeManager;

    .line 69
    .line 70
    if-eqz v0, :cond_0

    .line 71
    .line 72
    invoke-virtual {v0}, Landroidx/media3/exoplayer/StreamVolumeManager;->release()V

    .line 73
    .line 74
    .line 75
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->wakeLockManager:Landroidx/media3/exoplayer/WakeLockManager;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/WakeLockManager;->setStayAwake(Z)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->wifiLockManager:Landroidx/media3/exoplayer/WifiLockManager;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/WifiLockManager;->setStayAwake(Z)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioFocusManager:Landroidx/media3/exoplayer/AudioFocusManager;

    .line 86
    .line 87
    invoke-virtual {v0}, Landroidx/media3/exoplayer/AudioFocusManager;->release()V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->internalPlayer:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 91
    .line 92
    invoke-virtual {v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->release()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-nez v0, :cond_1

    .line 97
    .line 98
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 99
    .line 100
    new-instance v2, Landroidx/media3/exoplayer/q;

    .line 101
    .line 102
    invoke-direct {v2, v1}, Landroidx/media3/exoplayer/q;-><init>(I)V

    .line 103
    .line 104
    .line 105
    const/16 v1, 0xa

    .line 106
    .line 107
    invoke-virtual {v0, v1, v2}, Lh1/p;->f(ILh1/m;)V

    .line 108
    .line 109
    .line 110
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 111
    .line 112
    invoke-virtual {v0}, Lh1/p;->d()V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfoUpdateHandler:Lh1/k;

    .line 116
    .line 117
    check-cast v0, Lh1/b0;

    .line 118
    .line 119
    iget-object v0, v0, Lh1/b0;->a:Landroid/os/Handler;

    .line 120
    .line 121
    const/4 v1, 0x0

    .line 122
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->bandwidthMeter:Landroidx/media3/exoplayer/upstream/BandwidthMeter;

    .line 126
    .line 127
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->analyticsCollector:Landroidx/media3/exoplayer/analytics/AnalyticsCollector;

    .line 128
    .line 129
    invoke-interface {v0, v2}, Landroidx/media3/exoplayer/upstream/BandwidthMeter;->removeEventListener(Landroidx/media3/exoplayer/upstream/BandwidthMeter$EventListener;)V

    .line 130
    .line 131
    .line 132
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 133
    .line 134
    iget-boolean v2, v0, Landroidx/media3/exoplayer/PlaybackInfo;->sleepingForOffload:Z

    .line 135
    .line 136
    if-eqz v2, :cond_2

    .line 137
    .line 138
    invoke-virtual {v0}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithEstimatedPosition()Landroidx/media3/exoplayer/PlaybackInfo;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 143
    .line 144
    :cond_2
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->suitableOutputChecker:Landroidx/media3/exoplayer/SuitableOutputChecker;

    .line 145
    .line 146
    if-eqz v0, :cond_3

    .line 147
    .line 148
    sget v2, Lh1/i0;->a:I

    .line 149
    .line 150
    const/16 v3, 0x23

    .line 151
    .line 152
    if-lt v2, v3, :cond_3

    .line 153
    .line 154
    invoke-interface {v0}, Landroidx/media3/exoplayer/SuitableOutputChecker;->disable()V

    .line 155
    .line 156
    .line 157
    :cond_3
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 158
    .line 159
    const/4 v2, 0x1

    .line 160
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithPlaybackState(I)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 165
    .line 166
    iget-object v3, v0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 167
    .line 168
    invoke-virtual {v0, v3}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithLoadingMediaPeriodId(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 173
    .line 174
    iget-wide v3, v0, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 175
    .line 176
    iput-wide v3, v0, Landroidx/media3/exoplayer/PlaybackInfo;->bufferedPositionUs:J

    .line 177
    .line 178
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 179
    .line 180
    const-wide/16 v3, 0x0

    .line 181
    .line 182
    iput-wide v3, v0, Landroidx/media3/exoplayer/PlaybackInfo;->totalBufferedDurationUs:J

    .line 183
    .line 184
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->analyticsCollector:Landroidx/media3/exoplayer/analytics/AnalyticsCollector;

    .line 185
    .line 186
    invoke-interface {v0}, Landroidx/media3/exoplayer/analytics/AnalyticsCollector;->release()V

    .line 187
    .line 188
    .line 189
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->trackSelector:Landroidx/media3/exoplayer/trackselection/TrackSelector;

    .line 190
    .line 191
    invoke-virtual {v0}, Landroidx/media3/exoplayer/trackselection/TrackSelector;->release()V

    .line 192
    .line 193
    .line 194
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->removeSurfaceCallbacks()V

    .line 195
    .line 196
    .line 197
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->ownedSurface:Landroid/view/Surface;

    .line 198
    .line 199
    if-eqz v0, :cond_4

    .line 200
    .line 201
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 202
    .line 203
    .line 204
    iput-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->ownedSurface:Landroid/view/Surface;

    .line 205
    .line 206
    :cond_4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->isPriorityTaskManagerRegistered:Z

    .line 207
    .line 208
    if-nez v0, :cond_5

    .line 209
    .line 210
    sget-object v0, Lg1/c;->b:Lg1/c;

    .line 211
    .line 212
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->currentCueGroup:Lg1/c;

    .line 213
    .line 214
    iput-boolean v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playerReleased:Z

    .line 215
    .line 216
    return-void

    .line 217
    :cond_5
    throw v1

    .line 218
    :catchall_0
    move-exception v0

    .line 219
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 220
    throw v0
.end method

.method public removeAnalyticsListener(Landroidx/media3/exoplayer/analytics/AnalyticsListener;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->analyticsCollector:Landroidx/media3/exoplayer/analytics/AnalyticsCollector;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/analytics/AnalyticsCollector;->removeListener(Landroidx/media3/exoplayer/analytics/AnalyticsListener;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public removeAudioOffloadListener(Landroidx/media3/exoplayer/ExoPlayer$AudioOffloadListener;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioOffloadListeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public removeListener(Landroidx/media3/common/b1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lh1/p;->e(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public removeMediaItems(II)V
    .locals 11

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    if-lt p2, p1, :cond_0

    .line 8
    .line 9
    move v1, v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-static {v1}, Lh1/a;->d(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaSourceHolderSnapshots:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-ge p1, v1, :cond_2

    .line 26
    .line 27
    if-ne p1, p2, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 31
    .line 32
    invoke-direct {p0, v1, p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImpl;->removeMediaItemsInternal(Landroidx/media3/exoplayer/PlaybackInfo;II)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    iget-object p1, v3, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 37
    .line 38
    iget-object p1, p1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 39
    .line 40
    iget-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 41
    .line 42
    iget-object p2, p2, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 43
    .line 44
    iget-object p2, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    xor-int/lit8 v5, p1, 0x1

    .line 51
    .line 52
    invoke-direct {p0, v3}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getCurrentPositionUsInternal(Landroidx/media3/exoplayer/PlaybackInfo;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v7

    .line 56
    const/4 v9, -0x1

    .line 57
    const/4 v10, 0x0

    .line 58
    const/4 v4, 0x0

    .line 59
    const/4 v6, 0x4

    .line 60
    move-object v2, p0

    .line 61
    invoke-direct/range {v2 .. v10}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updatePlaybackInfo(Landroidx/media3/exoplayer/PlaybackInfo;IZIJIZ)V

    .line 62
    .line 63
    .line 64
    :cond_2
    :goto_1
    return-void
.end method

.method public replaceMediaItems(IILjava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Landroidx/media3/common/o0;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ltz p1, :cond_0

    .line 7
    .line 8
    if-lt p2, p1, :cond_0

    .line 9
    .line 10
    move v2, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v2, v0

    .line 13
    :goto_0
    invoke-static {v2}, Lh1/a;->d(Z)V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaSourceHolderSnapshots:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-le p1, v2, :cond_1

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/exoplayer/ExoPlayerImpl;->canUpdateMediaSourcesWithMediaItems(IILjava/util/List;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updateMediaSourcesWithMediaItems(IILjava/util/List;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    invoke-direct {p0, p3}, Landroidx/media3/exoplayer/ExoPlayerImpl;->createMediaSources(Ljava/util/List;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaSourceHolderSnapshots:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_4

    .line 50
    .line 51
    iget p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskingWindowIndex:I

    .line 52
    .line 53
    const/4 p2, -0x1

    .line 54
    if-ne p1, p2, :cond_3

    .line 55
    .line 56
    move v0, v1

    .line 57
    :cond_3
    invoke-virtual {p0, p3, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setMediaSources(Ljava/util/List;Z)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 62
    .line 63
    invoke-direct {p0, v0, p2, p3}, Landroidx/media3/exoplayer/ExoPlayerImpl;->addMediaSourcesInternal(Landroidx/media3/exoplayer/PlaybackInfo;ILjava/util/List;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    invoke-direct {p0, p3, p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImpl;->removeMediaItemsInternal(Landroidx/media3/exoplayer/PlaybackInfo;II)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    iget-object p1, v3, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 72
    .line 73
    iget-object p1, p1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 74
    .line 75
    iget-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 76
    .line 77
    iget-object p2, p2, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 78
    .line 79
    iget-object p2, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 80
    .line 81
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    xor-int/lit8 v5, p1, 0x1

    .line 86
    .line 87
    invoke-direct {p0, v3}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getCurrentPositionUsInternal(Landroidx/media3/exoplayer/PlaybackInfo;)J

    .line 88
    .line 89
    .line 90
    move-result-wide v7

    .line 91
    const/4 v9, -0x1

    .line 92
    const/4 v10, 0x0

    .line 93
    const/4 v4, 0x0

    .line 94
    const/4 v6, 0x4

    .line 95
    move-object v2, p0

    .line 96
    invoke-direct/range {v2 .. v10}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updatePlaybackInfo(Landroidx/media3/exoplayer/PlaybackInfo;IZIJIZ)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public seekTo(IJIZ)V
    .locals 10

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    const/4 p4, -0x1

    .line 5
    if-ne p1, p4, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 p4, 0x1

    .line 9
    if-ltz p1, :cond_1

    .line 10
    .line 11
    move v0, p4

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/4 v0, 0x0

    .line 14
    :goto_0
    invoke-static {v0}, Lh1/a;->d(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 18
    .line 19
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/media3/common/p1;->getWindowCount()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-lt p1, v1, :cond_2

    .line 32
    .line 33
    :goto_1
    return-void

    .line 34
    :cond_2
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->analyticsCollector:Landroidx/media3/exoplayer/analytics/AnalyticsCollector;

    .line 35
    .line 36
    invoke-interface {v1}, Landroidx/media3/exoplayer/analytics/AnalyticsCollector;->notifySeekStarted()V

    .line 37
    .line 38
    .line 39
    iget v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    .line 40
    .line 41
    add-int/2addr v1, p4

    .line 42
    iput v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    .line 43
    .line 44
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->isPlayingAd()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    const-string p1, "ExoPlayerImpl"

    .line 51
    .line 52
    const-string p2, "seekTo ignored because an ad is playing"

    .line 53
    .line 54
    invoke-static {p1, p2}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    new-instance p1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;

    .line 58
    .line 59
    iget-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 60
    .line 61
    invoke-direct {p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;-><init>(Landroidx/media3/exoplayer/PlaybackInfo;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p4}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->incrementPendingOperationAcks(I)V

    .line 65
    .line 66
    .line 67
    iget-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfoUpdateListener:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdateListener;

    .line 68
    .line 69
    invoke-interface {p2, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdateListener;->onPlaybackInfoUpdate(Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_3
    iget-object p4, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 74
    .line 75
    iget v1, p4, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 76
    .line 77
    const/4 v2, 0x3

    .line 78
    if-eq v1, v2, :cond_4

    .line 79
    .line 80
    const/4 v2, 0x4

    .line 81
    if-ne v1, v2, :cond_5

    .line 82
    .line 83
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_5

    .line 88
    .line 89
    :cond_4
    iget-object p4, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 90
    .line 91
    const/4 v1, 0x2

    .line 92
    invoke-virtual {p4, v1}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithPlaybackState(I)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 93
    .line 94
    .line 95
    move-result-object p4

    .line 96
    :cond_5
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getCurrentMediaItemIndex()I

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    invoke-direct {p0, v0, p1, p2, p3}, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskWindowPositionMsOrGetPeriodPositionUs(Landroidx/media3/common/p1;IJ)Landroid/util/Pair;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-direct {p0, p4, v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskTimelineAndPosition(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/p1;Landroid/util/Pair;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    iget-object p4, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->internalPlayer:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 109
    .line 110
    invoke-static {p2, p3}, Lh1/i0;->S(J)J

    .line 111
    .line 112
    .line 113
    move-result-wide p2

    .line 114
    invoke-virtual {p4, v0, p1, p2, p3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->seekTo(Landroidx/media3/common/p1;IJ)V

    .line 115
    .line 116
    .line 117
    const/4 v5, 0x1

    .line 118
    invoke-direct {p0, v2}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getCurrentPositionUsInternal(Landroidx/media3/exoplayer/PlaybackInfo;)J

    .line 119
    .line 120
    .line 121
    move-result-wide v6

    .line 122
    const/4 v3, 0x0

    .line 123
    const/4 v4, 0x1

    .line 124
    move-object v1, p0

    .line 125
    move v9, p5

    .line 126
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updatePlaybackInfo(Landroidx/media3/exoplayer/PlaybackInfo;IZIJIZ)V

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method public setAudioAttributes(Landroidx/media3/common/g;Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playerReleased:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioAttributes:Landroidx/media3/common/g;

    .line 10
    .line 11
    sget v1, Lh1/i0;->a:I

    .line 12
    .line 13
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioAttributes:Landroidx/media3/common/g;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    const/4 v1, 0x3

    .line 23
    invoke-direct {p0, v0, v1, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendRendererMessage(IILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->streamVolumeManager:Landroidx/media3/exoplayer/StreamVolumeManager;

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v1}, Landroidx/media3/exoplayer/StreamVolumeManager;->setStreamType(I)V

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 37
    .line 38
    new-instance v2, Landroidx/media3/exoplayer/k;

    .line 39
    .line 40
    invoke-direct {v2, v0, p1}, Landroidx/media3/exoplayer/k;-><init>(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    const/16 v0, 0x14

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Lh1/p;->c(ILh1/m;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioFocusManager:Landroidx/media3/exoplayer/AudioFocusManager;

    .line 49
    .line 50
    if-eqz p2, :cond_3

    .line 51
    .line 52
    move-object p2, p1

    .line 53
    goto :goto_0

    .line 54
    :cond_3
    const/4 p2, 0x0

    .line 55
    :goto_0
    invoke-virtual {v0, p2}, Landroidx/media3/exoplayer/AudioFocusManager;->setAudioAttributes(Landroidx/media3/common/g;)V

    .line 56
    .line 57
    .line 58
    iget-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->trackSelector:Landroidx/media3/exoplayer/trackselection/TrackSelector;

    .line 59
    .line 60
    invoke-virtual {p2, p1}, Landroidx/media3/exoplayer/trackselection/TrackSelector;->setAudioAttributes(Landroidx/media3/common/g;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getPlayWhenReady()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    iget-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioFocusManager:Landroidx/media3/exoplayer/AudioFocusManager;

    .line 68
    .line 69
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getPlaybackState()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    invoke-virtual {p2, p1, v0}, Landroidx/media3/exoplayer/AudioFocusManager;->updateAudioFocus(ZI)I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    invoke-static {p2}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getPlayWhenReadyChangeReason(I)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-direct {p0, p1, p2, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updatePlayWhenReady(ZII)V

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 85
    .line 86
    invoke-virtual {p1}, Lh1/p;->b()V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public setAudioSessionId(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioSessionId:I

    .line 5
    .line 6
    if-ne v0, p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    if-nez p1, :cond_2

    .line 10
    .line 11
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->applicationContext:Landroid/content/Context;

    .line 12
    .line 13
    sget v0, Lh1/i0;->a:I

    .line 14
    .line 15
    const-string v0, "audio"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Landroid/media/AudioManager;

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    const/4 p1, -0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {p1}, Landroid/media/AudioManager;->generateAudioSessionId()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    :cond_2
    :goto_0
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioSessionId:I

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const/16 v2, 0xa

    .line 39
    .line 40
    invoke-direct {p0, v0, v2, v1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendRendererMessage(IILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x2

    .line 44
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-direct {p0, v0, v2, v1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendRendererMessage(IILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 52
    .line 53
    new-instance v1, Landroidx/media3/exoplayer/p;

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    invoke-direct {v1, p1, v2}, Landroidx/media3/exoplayer/p;-><init>(II)V

    .line 57
    .line 58
    .line 59
    const/16 p1, 0x15

    .line 60
    .line 61
    invoke-virtual {v0, p1, v1}, Lh1/p;->f(ILh1/m;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public setAuxEffectInfo(Landroidx/media3/common/h;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    const/4 v1, 0x6

    .line 6
    invoke-direct {p0, v0, v1, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendRendererMessage(IILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setCameraMotionListener(Landroidx/media3/exoplayer/video/spherical/CameraMotionListener;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->cameraMotionListener:Landroidx/media3/exoplayer/video/spherical/CameraMotionListener;

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->frameMetadataListener:Landroidx/media3/exoplayer/ExoPlayerImpl$FrameMetadataListener;

    .line 7
    .line 8
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->createMessageInternal(Landroidx/media3/exoplayer/PlayerMessage$Target;)Landroidx/media3/exoplayer/PlayerMessage;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/16 v1, 0x8

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/PlayerMessage;->setType(I)Landroidx/media3/exoplayer/PlayerMessage;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/PlayerMessage;->setPayload(Ljava/lang/Object;)Landroidx/media3/exoplayer/PlayerMessage;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Landroidx/media3/exoplayer/PlayerMessage;->send()Landroidx/media3/exoplayer/PlayerMessage;

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public setDeviceMuted(Z)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->streamVolumeManager:Landroidx/media3/exoplayer/StreamVolumeManager;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, p1, v1}, Landroidx/media3/exoplayer/StreamVolumeManager;->setMuted(ZI)V

    :cond_0
    return-void
.end method

.method public setDeviceMuted(ZI)V
    .locals 1

    .line 4
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->streamVolumeManager:Landroidx/media3/exoplayer/StreamVolumeManager;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0, p1, p2}, Landroidx/media3/exoplayer/StreamVolumeManager;->setMuted(ZI)V

    :cond_0
    return-void
.end method

.method public setDeviceVolume(I)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->streamVolumeManager:Landroidx/media3/exoplayer/StreamVolumeManager;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, p1, v1}, Landroidx/media3/exoplayer/StreamVolumeManager;->setVolume(II)V

    :cond_0
    return-void
.end method

.method public setDeviceVolume(II)V
    .locals 1

    .line 4
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->streamVolumeManager:Landroidx/media3/exoplayer/StreamVolumeManager;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0, p1, p2}, Landroidx/media3/exoplayer/StreamVolumeManager;->setVolume(II)V

    :cond_0
    return-void
.end method

.method public setForegroundMode(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->foregroundMode:Z

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    iput-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->foregroundMode:Z

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->internalPlayer:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setForegroundMode(Z)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    new-instance p1, Landroidx/media3/exoplayer/ExoTimeoutException;

    .line 19
    .line 20
    const/4 v0, 0x2

    .line 21
    invoke-direct {p1, v0}, Landroidx/media3/exoplayer/ExoTimeoutException;-><init>(I)V

    .line 22
    .line 23
    .line 24
    const/16 v0, 0x3eb

    .line 25
    .line 26
    invoke-static {p1, v0}, Landroidx/media3/exoplayer/ExoPlaybackException;->createForUnexpected(Ljava/lang/RuntimeException;I)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->stopInternal(Landroidx/media3/exoplayer/ExoPlaybackException;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public setHandleAudioBecomingNoisy(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playerReleased:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioBecomingNoisyManager:Landroidx/media3/exoplayer/AudioBecomingNoisyManager;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/AudioBecomingNoisyManager;->setEnabled(Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setImageOutput(Landroidx/media3/exoplayer/image/ImageOutput;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    const/16 v1, 0xf

    .line 6
    .line 7
    invoke-direct {p0, v0, v1, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendRendererMessage(IILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setMediaItems(Ljava/util/List;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/common/o0;",
            ">;IJ)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 4
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->createMediaSources(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setMediaSources(Ljava/util/List;IJ)V

    return-void
.end method

.method public setMediaItems(Ljava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/common/o0;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->createMediaSources(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setMediaSources(Ljava/util/List;Z)V

    return-void
.end method

.method public setMediaSource(Landroidx/media3/exoplayer/source/MediaSource;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setMediaSources(Ljava/util/List;)V

    return-void
.end method

.method public setMediaSource(Landroidx/media3/exoplayer/source/MediaSource;J)V
    .locals 1

    .line 3
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 4
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, v0, p2, p3}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setMediaSources(Ljava/util/List;IJ)V

    return-void
.end method

.method public setMediaSource(Landroidx/media3/exoplayer/source/MediaSource;Z)V
    .locals 0

    .line 6
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 7
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setMediaSources(Ljava/util/List;Z)V

    return-void
.end method

.method public setMediaSources(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/source/MediaSource;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setMediaSources(Ljava/util/List;Z)V

    return-void
.end method

.method public setMediaSources(Ljava/util/List;IJ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/source/MediaSource;",
            ">;IJ)V"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-wide v3, p3

    .line 6
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setMediaSourcesInternal(Ljava/util/List;IJZ)V

    return-void
.end method

.method public setMediaSources(Ljava/util/List;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/source/MediaSource;",
            ">;Z)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    const/4 v2, -0x1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v5, p2

    .line 4
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setMediaSourcesInternal(Ljava/util/List;IJZ)V

    return-void
.end method

.method public setPauseAtEndOfMediaItems(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pauseAtEndOfMediaItems:Z

    .line 5
    .line 6
    if-ne v0, p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iput-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pauseAtEndOfMediaItems:Z

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->internalPlayer:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setPauseAtEndOfWindow(Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setPlayWhenReady(Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioFocusManager:Landroidx/media3/exoplayer/AudioFocusManager;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getPlaybackState()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {v0, p1, v1}, Landroidx/media3/exoplayer/AudioFocusManager;->updateAudioFocus(ZI)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getPlayWhenReadyChangeReason(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-direct {p0, p1, v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updatePlayWhenReady(ZII)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public setPlaybackParameters(Landroidx/media3/common/y0;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    sget-object p1, Landroidx/media3/common/y0;->d:Landroidx/media3/common/y0;

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->playbackParameters:Landroidx/media3/common/y0;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroidx/media3/common/y0;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithPlaybackParameters(Landroidx/media3/common/y0;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    iput v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    .line 30
    .line 31
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->internalPlayer:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setPlaybackParameters(Landroidx/media3/common/y0;)V

    .line 34
    .line 35
    .line 36
    const/4 v8, -0x1

    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v3, 0x0

    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x5

    .line 41
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    move-object v1, p0

    .line 47
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updatePlaybackInfo(Landroidx/media3/exoplayer/PlaybackInfo;IZIJIZ)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public setPlaylistMetadata(Landroidx/media3/common/r0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playlistMetadata:Landroidx/media3/common/r0;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroidx/media3/common/r0;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playlistMetadata:Landroidx/media3/common/r0;

    .line 17
    .line 18
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 19
    .line 20
    new-instance v0, Landroidx/media3/exoplayer/t;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, p0, v1}, Landroidx/media3/exoplayer/t;-><init>(Landroidx/media3/exoplayer/ExoPlayerImpl;I)V

    .line 24
    .line 25
    .line 26
    const/16 v1, 0xf

    .line 27
    .line 28
    invoke-virtual {p1, v1, v0}, Lh1/p;->f(ILh1/m;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public setPreferredAudioDevice(Landroid/media/AudioDeviceInfo;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    const/16 v1, 0xc

    .line 6
    .line 7
    invoke-direct {p0, v0, v1, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendRendererMessage(IILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setPreloadConfiguration(Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->preloadConfiguration:Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->preloadConfiguration:Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->internalPlayer:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setPreloadConfiguration(Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public setPriority(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->priority:I

    .line 5
    .line 6
    if-ne v0, p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->isPriorityTaskManagerRegistered:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->priority:I

    .line 14
    .line 15
    const/16 v0, 0x10

    .line 16
    .line 17
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {p0, v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendRendererMessage(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    throw p1
.end method

.method public setPriorityTaskManager(Landroidx/media3/common/g1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    sget p1, Lh1/i0;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public setRepeatMode(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->repeatMode:I

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->repeatMode:I

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->internalPlayer:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setRepeatMode(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 16
    .line 17
    new-instance v1, Landroidx/media3/exoplayer/p;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-direct {v1, p1, v2}, Landroidx/media3/exoplayer/p;-><init>(II)V

    .line 21
    .line 22
    .line 23
    const/16 p1, 0x8

    .line 24
    .line 25
    invoke-virtual {v0, p1, v1}, Lh1/p;->c(ILh1/m;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updateAvailableCommands()V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 32
    .line 33
    invoke-virtual {p1}, Lh1/p;->b()V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public setSeekParameters(Landroidx/media3/exoplayer/SeekParameters;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    sget-object p1, Landroidx/media3/exoplayer/SeekParameters;->DEFAULT:Landroidx/media3/exoplayer/SeekParameters;

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->seekParameters:Landroidx/media3/exoplayer/SeekParameters;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/SeekParameters;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->seekParameters:Landroidx/media3/exoplayer/SeekParameters;

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->internalPlayer:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setSeekParameters(Landroidx/media3/exoplayer/SeekParameters;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public setShuffleModeEnabled(Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->shuffleModeEnabled:Z

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    iput-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->shuffleModeEnabled:Z

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->internalPlayer:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setShuffleModeEnabled(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 16
    .line 17
    new-instance v1, Landroidx/media3/exoplayer/m;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-direct {v1, p1, v2}, Landroidx/media3/exoplayer/m;-><init>(ZI)V

    .line 21
    .line 22
    .line 23
    const/16 p1, 0x9

    .line 24
    .line 25
    invoke-virtual {v0, p1, v1}, Lh1/p;->c(ILh1/m;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updateAvailableCommands()V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 32
    .line 33
    invoke-virtual {p1}, Lh1/p;->b()V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public setShuffleOrder(Landroidx/media3/exoplayer/source/ShuffleOrder;)V
    .locals 13

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Landroidx/media3/exoplayer/source/ShuffleOrder;->getLength()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->mediaSourceHolderSnapshots:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x1

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    move v0, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    invoke-static {v0}, Lh1/a;->d(Z)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->shuffleOrder:Landroidx/media3/exoplayer/source/ShuffleOrder;

    .line 24
    .line 25
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->createMaskingTimeline()Landroidx/media3/common/p1;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getCurrentMediaItemIndex()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getCurrentPosition()J

    .line 36
    .line 37
    .line 38
    move-result-wide v4

    .line 39
    invoke-direct {p0, v0, v3, v4, v5}, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskWindowPositionMsOrGetPeriodPositionUs(Landroidx/media3/common/p1;IJ)Landroid/util/Pair;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-direct {p0, v1, v0, v3}, Landroidx/media3/exoplayer/ExoPlayerImpl;->maskTimelineAndPosition(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/p1;Landroid/util/Pair;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    iget v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    .line 48
    .line 49
    add-int/2addr v0, v2

    .line 50
    iput v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->pendingOperationAcks:I

    .line 51
    .line 52
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->internalPlayer:Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setShuffleOrder(Landroidx/media3/exoplayer/source/ShuffleOrder;)V

    .line 55
    .line 56
    .line 57
    const/4 v11, -0x1

    .line 58
    const/4 v12, 0x0

    .line 59
    const/4 v6, 0x0

    .line 60
    const/4 v7, 0x0

    .line 61
    const/4 v8, 0x5

    .line 62
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    move-object v4, p0

    .line 68
    invoke-direct/range {v4 .. v12}, Landroidx/media3/exoplayer/ExoPlayerImpl;->updatePlaybackInfo(Landroidx/media3/exoplayer/PlaybackInfo;IZIJIZ)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public setSkipSilenceEnabled(Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->skipSilenceEnabled:Z

    .line 5
    .line 6
    if-ne v0, p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iput-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->skipSilenceEnabled:Z

    .line 10
    .line 11
    const/16 v0, 0x9

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-direct {p0, v2, v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendRendererMessage(IILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 22
    .line 23
    new-instance v1, Landroidx/media3/exoplayer/m;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v1, p1, v2}, Landroidx/media3/exoplayer/m;-><init>(ZI)V

    .line 27
    .line 28
    .line 29
    const/16 p1, 0x17

    .line 30
    .line 31
    invoke-virtual {v0, p1, v1}, Lh1/p;->f(ILh1/m;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public setThrowsWhenUsingWrongThread(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->throwsWhenUsingWrongThread:Z

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 4
    .line 5
    iput-boolean p1, v0, Lh1/p;->i:Z

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->analyticsCollector:Landroidx/media3/exoplayer/analytics/AnalyticsCollector;

    .line 8
    .line 9
    instance-of v1, v0, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->setThrowsWhenUsingWrongThread(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setTrackSelectionParameters(Landroidx/media3/common/v1;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->trackSelector:Landroidx/media3/exoplayer/trackselection/TrackSelector;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/media3/exoplayer/trackselection/TrackSelector;->isSetParametersSupported()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->trackSelector:Landroidx/media3/exoplayer/trackselection/TrackSelector;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/media3/exoplayer/trackselection/TrackSelector;->getParameters()Landroidx/media3/common/v1;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p1, v0}, Landroidx/media3/common/v1;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->trackSelector:Landroidx/media3/exoplayer/trackselection/TrackSelector;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/trackselection/TrackSelector;->setParameters(Landroidx/media3/common/v1;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 31
    .line 32
    new-instance v1, Landroidx/media3/exoplayer/k;

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    invoke-direct {v1, v2, p1}, Landroidx/media3/exoplayer/k;-><init>(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    const/16 p1, 0x13

    .line 39
    .line 40
    invoke-virtual {v0, p1, v1}, Lh1/p;->f(ILh1/m;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    :goto_0
    return-void
.end method

.method public setVideoChangeFrameRateStrategy(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->videoChangeFrameRateStrategy:I

    .line 5
    .line 6
    if-ne v0, p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->videoChangeFrameRateStrategy:I

    .line 10
    .line 11
    const/4 v0, 0x5

    .line 12
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-direct {p0, v1, v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendRendererMessage(IILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public setVideoEffects(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    const-string v0, "androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory"

    .line 5
    .line 6
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-class v1, Landroidx/media3/common/z1;

    .line 11
    .line 12
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    const/16 v1, 0xd

    .line 21
    .line 22
    invoke-direct {p0, v0, v1, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendRendererMessage(IILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception p1

    .line 27
    goto :goto_0

    .line 28
    :catch_1
    move-exception p1

    .line 29
    :goto_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v1, "Could not find required lib-effect dependencies."

    .line 32
    .line 33
    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    throw v0
.end method

.method public setVideoFrameMetadataListener(Landroidx/media3/exoplayer/video/VideoFrameMetadataListener;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->videoFrameMetadataListener:Landroidx/media3/exoplayer/video/VideoFrameMetadataListener;

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->frameMetadataListener:Landroidx/media3/exoplayer/ExoPlayerImpl$FrameMetadataListener;

    .line 7
    .line 8
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->createMessageInternal(Landroidx/media3/exoplayer/PlayerMessage$Target;)Landroidx/media3/exoplayer/PlayerMessage;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x7

    .line 13
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/PlayerMessage;->setType(I)Landroidx/media3/exoplayer/PlayerMessage;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/PlayerMessage;->setPayload(Ljava/lang/Object;)Landroidx/media3/exoplayer/PlayerMessage;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Landroidx/media3/exoplayer/PlayerMessage;->send()Landroidx/media3/exoplayer/PlayerMessage;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setVideoScalingMode(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->videoScalingMode:I

    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {p0, v1, v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendRendererMessage(IILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setVideoSurface(Landroid/view/Surface;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->removeSurfaceCallbacks()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setVideoOutputInternal(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, -0x1

    .line 15
    :goto_0
    invoke-direct {p0, p1, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->maybeNotifySurfaceSizeChanged(II)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public setVideoSurfaceHolder(Landroid/view/SurfaceHolder;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->clearVideoSurface()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->removeSurfaceCallbacks()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->surfaceHolderSurfaceIsVideoOutput:Z

    .line 15
    .line 16
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->surfaceHolder:Landroid/view/SurfaceHolder;

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->componentListener:Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;

    .line 19
    .line 20
    invoke-interface {p1, v0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setVideoOutputInternal(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-direct {p0, v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->maybeNotifySurfaceSizeChanged(II)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    const/4 p1, 0x0

    .line 55
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setVideoOutputInternal(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    invoke-direct {p0, p1, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->maybeNotifySurfaceSizeChanged(II)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public setVideoSurfaceView(Landroid/view/SurfaceView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Landroidx/media3/exoplayer/video/VideoDecoderOutputBufferRenderer;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->removeSurfaceCallbacks()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setVideoOutputInternal(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setNonVideoOutputSurfaceHolderInternal(Landroid/view/SurfaceHolder;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    instance-of v0, p1, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->removeSurfaceCallbacks()V

    .line 27
    .line 28
    .line 29
    move-object v0, p1

    .line 30
    check-cast v0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;

    .line 31
    .line 32
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->sphericalGLSurfaceView:Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;

    .line 33
    .line 34
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->frameMetadataListener:Landroidx/media3/exoplayer/ExoPlayerImpl$FrameMetadataListener;

    .line 35
    .line 36
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->createMessageInternal(Landroidx/media3/exoplayer/PlayerMessage$Target;)Landroidx/media3/exoplayer/PlayerMessage;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/16 v1, 0x2710

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/PlayerMessage;->setType(I)Landroidx/media3/exoplayer/PlayerMessage;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->sphericalGLSurfaceView:Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/PlayerMessage;->setPayload(Ljava/lang/Object;)Landroidx/media3/exoplayer/PlayerMessage;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Landroidx/media3/exoplayer/PlayerMessage;->send()Landroidx/media3/exoplayer/PlayerMessage;

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->sphericalGLSurfaceView:Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;

    .line 56
    .line 57
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->componentListener:Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->addVideoSurfaceListener(Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$VideoSurfaceListener;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->sphericalGLSurfaceView:Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;

    .line 63
    .line 64
    invoke-virtual {v0}, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->getVideoSurface()Landroid/view/Surface;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setVideoOutputInternal(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setNonVideoOutputSurfaceHolderInternal(Landroid/view/SurfaceHolder;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_1
    if-nez p1, :cond_2

    .line 80
    .line 81
    const/4 p1, 0x0

    .line 82
    goto :goto_0

    .line 83
    :cond_2
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    :goto_0
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setVideoSurfaceHolder(Landroid/view/SurfaceHolder;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public setVideoTextureView(Landroid/view/TextureView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->clearVideoSurface()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->removeSurfaceCallbacks()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->textureView:Landroid/view/TextureView;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const-string v0, "ExoPlayerImpl"

    .line 22
    .line 23
    const-string v1, "Replacing existing SurfaceTextureListener."

    .line 24
    .line 25
    invoke-static {v0, v1}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->componentListener:Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/view/TextureView;->isAvailable()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v1, 0x0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    move-object v0, v1

    .line 46
    :goto_0
    if-nez v0, :cond_3

    .line 47
    .line 48
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setVideoOutputInternal(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    invoke-direct {p0, p1, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->maybeNotifySurfaceSizeChanged(II)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->setSurfaceTextureInternal(Landroid/graphics/SurfaceTexture;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    invoke-direct {p0, v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->maybeNotifySurfaceSizeChanged(II)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public setVolume(F)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-static {p1, v0, v1}, Lh1/i0;->i(FFF)F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->volume:F

    .line 12
    .line 13
    cmpl-float v0, v0, p1

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->volume:F

    .line 19
    .line 20
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->sendVolumeToRenderers()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->listeners:Lh1/p;

    .line 24
    .line 25
    new-instance v1, Landroidx/media3/exoplayer/n;

    .line 26
    .line 27
    invoke-direct {v1, p1}, Landroidx/media3/exoplayer/n;-><init>(F)V

    .line 28
    .line 29
    .line 30
    const/16 p1, 0x16

    .line 31
    .line 32
    invoke-virtual {v0, p1, v1}, Lh1/p;->f(ILh1/m;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public setWakeMode(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq p1, v1, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p1, v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->wakeLockManager:Landroidx/media3/exoplayer/WakeLockManager;

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Landroidx/media3/exoplayer/WakeLockManager;->setEnabled(Z)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->wifiLockManager:Landroidx/media3/exoplayer/WifiLockManager;

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Landroidx/media3/exoplayer/WifiLockManager;->setEnabled(Z)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->wakeLockManager:Landroidx/media3/exoplayer/WakeLockManager;

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Landroidx/media3/exoplayer/WakeLockManager;->setEnabled(Z)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->wifiLockManager:Landroidx/media3/exoplayer/WifiLockManager;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/WifiLockManager;->setEnabled(Z)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->wakeLockManager:Landroidx/media3/exoplayer/WakeLockManager;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/WakeLockManager;->setEnabled(Z)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->wifiLockManager:Landroidx/media3/exoplayer/WifiLockManager;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/WifiLockManager;->setEnabled(Z)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public stop()V
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->verifyApplicationThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->audioFocusManager:Landroidx/media3/exoplayer/AudioFocusManager;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->getPlayWhenReady()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {v0, v1, v2}, Landroidx/media3/exoplayer/AudioFocusManager;->updateAudioFocus(ZI)I

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImpl;->stopInternal(Landroidx/media3/exoplayer/ExoPlaybackException;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lg1/c;

    .line 19
    .line 20
    sget-object v1, Lf6/l1;->n:Lf6/l1;

    .line 21
    .line 22
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 23
    .line 24
    iget-wide v2, v2, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 25
    .line 26
    invoke-direct {v0, v1}, Lg1/c;-><init>(Ljava/util/List;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImpl;->currentCueGroup:Lg1/c;

    .line 30
    .line 31
    return-void
.end method
