.class final Landroidx/media3/exoplayer/ExoPlayerImplInternal;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Landroidx/media3/exoplayer/source/MediaPeriod$Callback;
.implements Landroidx/media3/exoplayer/trackselection/TrackSelector$InvalidationListener;
.implements Landroidx/media3/exoplayer/MediaSourceList$MediaSourceListInfoRefreshListener;
.implements Landroidx/media3/exoplayer/DefaultMediaClock$PlaybackParametersListener;
.implements Landroidx/media3/exoplayer/PlayerMessage$Sender;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdateListener;,
        Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;,
        Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;,
        Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;,
        Landroidx/media3/exoplayer/ExoPlayerImplInternal$MoveMediaItemsMessage;,
        Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;,
        Landroidx/media3/exoplayer/ExoPlayerImplInternal$PositionUpdateForPlaylistChange;
    }
.end annotation


# static fields
.field private static final BUFFERING_MAXIMUM_INTERVAL_MS:J

.field private static final MSG_ADD_MEDIA_SOURCES:I = 0x12

.field private static final MSG_ATTEMPT_RENDERER_ERROR_RECOVERY:I = 0x19

.field private static final MSG_DO_SOME_WORK:I = 0x2

.field private static final MSG_MOVE_MEDIA_SOURCES:I = 0x13

.field private static final MSG_PERIOD_PREPARED:I = 0x8

.field private static final MSG_PLAYBACK_PARAMETERS_CHANGED_INTERNAL:I = 0x10

.field private static final MSG_PLAYLIST_UPDATE_REQUESTED:I = 0x16

.field private static final MSG_PREPARE:I = 0x1d

.field private static final MSG_RELEASE:I = 0x7

.field private static final MSG_REMOVE_MEDIA_SOURCES:I = 0x14

.field private static final MSG_RENDERER_CAPABILITIES_CHANGED:I = 0x1a

.field private static final MSG_SEEK_TO:I = 0x3

.field private static final MSG_SEND_MESSAGE:I = 0xe

.field private static final MSG_SEND_MESSAGE_TO_TARGET_THREAD:I = 0xf

.field private static final MSG_SET_FOREGROUND_MODE:I = 0xd

.field private static final MSG_SET_MEDIA_SOURCES:I = 0x11

.field private static final MSG_SET_PAUSE_AT_END_OF_WINDOW:I = 0x17

.field private static final MSG_SET_PLAYBACK_PARAMETERS:I = 0x4

.field private static final MSG_SET_PLAY_WHEN_READY:I = 0x1

.field private static final MSG_SET_PRELOAD_CONFIGURATION:I = 0x1c

.field private static final MSG_SET_REPEAT_MODE:I = 0xb

.field private static final MSG_SET_SEEK_PARAMETERS:I = 0x5

.field private static final MSG_SET_SHUFFLE_ENABLED:I = 0xc

.field private static final MSG_SET_SHUFFLE_ORDER:I = 0x15

.field private static final MSG_SOURCE_CONTINUE_LOADING_REQUESTED:I = 0x9

.field private static final MSG_STOP:I = 0x6

.field private static final MSG_TRACK_SELECTION_INVALIDATED:I = 0xa

.field private static final MSG_UPDATE_MEDIA_SOURCES_WITH_MEDIA_ITEMS:I = 0x1b

.field private static final PLAYBACK_BUFFER_EMPTY_THRESHOLD_US:J = 0x7a120L

.field private static final PLAYBACK_STUCK_AFTER_MS:J = 0xfa0L

.field private static final READY_MAXIMUM_INTERVAL_MS:J = 0x3e8L

.field private static final TAG:Ljava/lang/String; = "ExoPlayerImplInternal"


# instance fields
.field private final analyticsCollector:Landroidx/media3/exoplayer/analytics/AnalyticsCollector;

.field private final applicationLooperHandler:Lh1/k;

.field private final backBufferDurationUs:J

.field private final bandwidthMeter:Landroidx/media3/exoplayer/upstream/BandwidthMeter;

.field private final clock:Lh1/b;

.field private deliverPendingMessageAtStartPositionRequired:Z

.field private final dynamicSchedulingEnabled:Z

.field private final emptyTrackSelectorResult:Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

.field private enabledRendererCount:I

.field private foregroundMode:Z

.field private final handler:Lh1/k;

.field private isRebuffering:Z

.field private lastPreloadPoolInvalidationTimeline:Landroidx/media3/common/p1;

.field private lastRebufferRealtimeMs:J

.field private final livePlaybackSpeedControl:Landroidx/media3/exoplayer/LivePlaybackSpeedControl;

.field private final loadControl:Landroidx/media3/exoplayer/LoadControl;

.field private final mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

.field private final mediaSourceList:Landroidx/media3/exoplayer/MediaSourceList;

.field private nextPendingMessageIndexHint:I

.field private offloadSchedulingEnabled:Z

.field private pauseAtEndOfWindow:Z

.field private pendingInitialSeekPosition:Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;

.field private final pendingMessages:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;",
            ">;"
        }
    .end annotation
.end field

.field private pendingPauseAtEndOfPeriod:Z

.field private pendingRecoverableRendererError:Landroidx/media3/exoplayer/ExoPlaybackException;

.field private final period:Landroidx/media3/common/m1;

.field private playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

.field private playbackInfoUpdate:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;

.field private final playbackInfoUpdateListener:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdateListener;

.field private final playbackLooper:Landroid/os/Looper;

.field private final playbackLooperProvider:Landroidx/media3/exoplayer/PlaybackLooperProvider;

.field private playbackMaybeBecameStuckAtMs:J

.field private final playerId:Landroidx/media3/exoplayer/analytics/PlayerId;

.field private preloadConfiguration:Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;

.field private final queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

.field private final releaseTimeoutMs:J

.field private released:Z

.field private final rendererCapabilities:[Landroidx/media3/exoplayer/RendererCapabilities;

.field private rendererPositionElapsedRealtimeUs:J

.field private rendererPositionUs:J

.field private final rendererReportedReady:[Z

.field private final renderers:[Landroidx/media3/exoplayer/Renderer;

.field private final renderersToReset:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/media3/exoplayer/Renderer;",
            ">;"
        }
    .end annotation
.end field

.field private repeatMode:I

.field private requestForRendererSleep:Z

.field private final retainBackBufferFromKeyframe:Z

.field private seekParameters:Landroidx/media3/exoplayer/SeekParameters;

.field private setForegroundModeTimeoutMs:J

.field private shouldContinueLoading:Z

.field private shuffleModeEnabled:Z

.field private final trackSelector:Landroidx/media3/exoplayer/trackselection/TrackSelector;

.field private final window:Landroidx/media3/common/o1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x2710

    .line 2
    .line 3
    invoke-static {v0, v1}, Lh1/i0;->f0(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sput-wide v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->BUFFERING_MAXIMUM_INTERVAL_MS:J

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>([Landroidx/media3/exoplayer/Renderer;Landroidx/media3/exoplayer/trackselection/TrackSelector;Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;Landroidx/media3/exoplayer/LoadControl;Landroidx/media3/exoplayer/upstream/BandwidthMeter;IZLandroidx/media3/exoplayer/analytics/AnalyticsCollector;Landroidx/media3/exoplayer/SeekParameters;Landroidx/media3/exoplayer/LivePlaybackSpeedControl;JZZLandroid/os/Looper;Lh1/b;Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdateListener;Landroidx/media3/exoplayer/analytics/PlayerId;Landroidx/media3/exoplayer/PlaybackLooperProvider;Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;)V
    .locals 9

    .line 1
    move-object/from16 v2, p8

    .line 2
    .line 3
    move-wide/from16 v3, p11

    .line 4
    .line 5
    move-object/from16 v5, p16

    .line 6
    .line 7
    move-object/from16 v6, p18

    .line 8
    .line 9
    move-object/from16 v7, p20

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    move-object/from16 v8, p17

    .line 15
    .line 16
    iput-object v8, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfoUpdateListener:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdateListener;

    .line 17
    .line 18
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 19
    .line 20
    iput-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->trackSelector:Landroidx/media3/exoplayer/trackselection/TrackSelector;

    .line 21
    .line 22
    iput-object p3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->emptyTrackSelectorResult:Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 23
    .line 24
    iput-object p4, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->loadControl:Landroidx/media3/exoplayer/LoadControl;

    .line 25
    .line 26
    iput-object p5, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->bandwidthMeter:Landroidx/media3/exoplayer/upstream/BandwidthMeter;

    .line 27
    .line 28
    iput p6, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->repeatMode:I

    .line 29
    .line 30
    move/from16 v8, p7

    .line 31
    .line 32
    iput-boolean v8, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shuffleModeEnabled:Z

    .line 33
    .line 34
    move-object/from16 v8, p9

    .line 35
    .line 36
    iput-object v8, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->seekParameters:Landroidx/media3/exoplayer/SeekParameters;

    .line 37
    .line 38
    move-object/from16 v8, p10

    .line 39
    .line 40
    iput-object v8, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->livePlaybackSpeedControl:Landroidx/media3/exoplayer/LivePlaybackSpeedControl;

    .line 41
    .line 42
    iput-wide v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->releaseTimeoutMs:J

    .line 43
    .line 44
    iput-wide v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setForegroundModeTimeoutMs:J

    .line 45
    .line 46
    move/from16 v3, p13

    .line 47
    .line 48
    iput-boolean v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pauseAtEndOfWindow:Z

    .line 49
    .line 50
    move/from16 v3, p14

    .line 51
    .line 52
    iput-boolean v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->dynamicSchedulingEnabled:Z

    .line 53
    .line 54
    iput-object v5, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->clock:Lh1/b;

    .line 55
    .line 56
    iput-object v6, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playerId:Landroidx/media3/exoplayer/analytics/PlayerId;

    .line 57
    .line 58
    iput-object v7, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->preloadConfiguration:Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;

    .line 59
    .line 60
    iput-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->analyticsCollector:Landroidx/media3/exoplayer/analytics/AnalyticsCollector;

    .line 61
    .line 62
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    iput-wide v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackMaybeBecameStuckAtMs:J

    .line 68
    .line 69
    iput-wide v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->lastRebufferRealtimeMs:J

    .line 70
    .line 71
    invoke-interface {p4, v6}, Landroidx/media3/exoplayer/LoadControl;->getBackBufferDurationUs(Landroidx/media3/exoplayer/analytics/PlayerId;)J

    .line 72
    .line 73
    .line 74
    move-result-wide v3

    .line 75
    iput-wide v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->backBufferDurationUs:J

    .line 76
    .line 77
    invoke-interface {p4, v6}, Landroidx/media3/exoplayer/LoadControl;->retainBackBufferFromKeyframe(Landroidx/media3/exoplayer/analytics/PlayerId;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    iput-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->retainBackBufferFromKeyframe:Z

    .line 82
    .line 83
    sget-object v0, Landroidx/media3/common/p1;->EMPTY:Landroidx/media3/common/p1;

    .line 84
    .line 85
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->lastPreloadPoolInvalidationTimeline:Landroidx/media3/common/p1;

    .line 86
    .line 87
    invoke-static {p3}, Landroidx/media3/exoplayer/PlaybackInfo;->createDummy(Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    iput-object p3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 92
    .line 93
    new-instance v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;

    .line 94
    .line 95
    invoke-direct {v0, p3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;-><init>(Landroidx/media3/exoplayer/PlaybackInfo;)V

    .line 96
    .line 97
    .line 98
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfoUpdate:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;

    .line 99
    .line 100
    array-length p3, p1

    .line 101
    new-array p3, p3, [Landroidx/media3/exoplayer/RendererCapabilities;

    .line 102
    .line 103
    iput-object p3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererCapabilities:[Landroidx/media3/exoplayer/RendererCapabilities;

    .line 104
    .line 105
    array-length p3, p1

    .line 106
    new-array p3, p3, [Z

    .line 107
    .line 108
    iput-object p3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererReportedReady:[Z

    .line 109
    .line 110
    invoke-virtual {p2}, Landroidx/media3/exoplayer/trackselection/TrackSelector;->getRendererCapabilitiesListener()Landroidx/media3/exoplayer/RendererCapabilities$Listener;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    const/4 v0, 0x0

    .line 115
    :goto_0
    array-length v3, p1

    .line 116
    if-ge v0, v3, :cond_1

    .line 117
    .line 118
    aget-object v3, p1, v0

    .line 119
    .line 120
    invoke-interface {v3, v0, v6, v5}, Landroidx/media3/exoplayer/Renderer;->init(ILandroidx/media3/exoplayer/analytics/PlayerId;Lh1/b;)V

    .line 121
    .line 122
    .line 123
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererCapabilities:[Landroidx/media3/exoplayer/RendererCapabilities;

    .line 124
    .line 125
    aget-object v4, p1, v0

    .line 126
    .line 127
    invoke-interface {v4}, Landroidx/media3/exoplayer/Renderer;->getCapabilities()Landroidx/media3/exoplayer/RendererCapabilities;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    aput-object v4, v3, v0

    .line 132
    .line 133
    if-eqz p3, :cond_0

    .line 134
    .line 135
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererCapabilities:[Landroidx/media3/exoplayer/RendererCapabilities;

    .line 136
    .line 137
    aget-object v3, v3, v0

    .line 138
    .line 139
    invoke-interface {v3, p3}, Landroidx/media3/exoplayer/RendererCapabilities;->setListener(Landroidx/media3/exoplayer/RendererCapabilities$Listener;)V

    .line 140
    .line 141
    .line 142
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_1
    new-instance p1, Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 146
    .line 147
    invoke-direct {p1, p0, v5}, Landroidx/media3/exoplayer/DefaultMediaClock;-><init>(Landroidx/media3/exoplayer/DefaultMediaClock$PlaybackParametersListener;Lh1/b;)V

    .line 148
    .line 149
    .line 150
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 151
    .line 152
    new-instance p1, Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 155
    .line 156
    .line 157
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingMessages:Ljava/util/ArrayList;

    .line 158
    .line 159
    new-instance p1, Ljava/util/IdentityHashMap;

    .line 160
    .line 161
    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderersToReset:Ljava/util/Set;

    .line 169
    .line 170
    new-instance p1, Landroidx/media3/common/o1;

    .line 171
    .line 172
    invoke-direct {p1}, Landroidx/media3/common/o1;-><init>()V

    .line 173
    .line 174
    .line 175
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->window:Landroidx/media3/common/o1;

    .line 176
    .line 177
    new-instance p1, Landroidx/media3/common/m1;

    .line 178
    .line 179
    invoke-direct {p1}, Landroidx/media3/common/m1;-><init>()V

    .line 180
    .line 181
    .line 182
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->period:Landroidx/media3/common/m1;

    .line 183
    .line 184
    invoke-virtual {p2, p0, p5}, Landroidx/media3/exoplayer/trackselection/TrackSelector;->init(Landroidx/media3/exoplayer/trackselection/TrackSelector$InvalidationListener;Landroidx/media3/exoplayer/upstream/BandwidthMeter;)V

    .line 185
    .line 186
    .line 187
    const/4 p1, 0x1

    .line 188
    iput-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->deliverPendingMessageAtStartPositionRequired:Z

    .line 189
    .line 190
    move-object p1, v5

    .line 191
    check-cast p1, Lh1/z;

    .line 192
    .line 193
    const/4 p2, 0x0

    .line 194
    move-object/from16 p3, p15

    .line 195
    .line 196
    invoke-virtual {p1, p3, p2}, Lh1/z;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lh1/b0;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    iput-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->applicationLooperHandler:Lh1/k;

    .line 201
    .line 202
    new-instance p3, Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 203
    .line 204
    new-instance v0, Landroidx/media3/exoplayer/k;

    .line 205
    .line 206
    const/16 v1, 0x9

    .line 207
    .line 208
    invoke-direct {v0, v1, p0}, Landroidx/media3/exoplayer/k;-><init>(ILjava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    invoke-direct {p3, v2, p2, v0, v7}, Landroidx/media3/exoplayer/MediaPeriodQueue;-><init>(Landroidx/media3/exoplayer/analytics/AnalyticsCollector;Lh1/k;Landroidx/media3/exoplayer/MediaPeriodHolder$Factory;Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;)V

    .line 212
    .line 213
    .line 214
    iput-object p3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 215
    .line 216
    new-instance p3, Landroidx/media3/exoplayer/MediaSourceList;

    .line 217
    .line 218
    invoke-direct {p3, p0, v2, p2, v6}, Landroidx/media3/exoplayer/MediaSourceList;-><init>(Landroidx/media3/exoplayer/MediaSourceList$MediaSourceListInfoRefreshListener;Landroidx/media3/exoplayer/analytics/AnalyticsCollector;Lh1/k;Landroidx/media3/exoplayer/analytics/PlayerId;)V

    .line 219
    .line 220
    .line 221
    iput-object p3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaSourceList:Landroidx/media3/exoplayer/MediaSourceList;

    .line 222
    .line 223
    if-nez p19, :cond_2

    .line 224
    .line 225
    new-instance p2, Landroidx/media3/exoplayer/PlaybackLooperProvider;

    .line 226
    .line 227
    invoke-direct {p2}, Landroidx/media3/exoplayer/PlaybackLooperProvider;-><init>()V

    .line 228
    .line 229
    .line 230
    goto :goto_1

    .line 231
    :cond_2
    move-object/from16 p2, p19

    .line 232
    .line 233
    :goto_1
    iput-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackLooperProvider:Landroidx/media3/exoplayer/PlaybackLooperProvider;

    .line 234
    .line 235
    invoke-virtual {p2}, Landroidx/media3/exoplayer/PlaybackLooperProvider;->obtainLooper()Landroid/os/Looper;

    .line 236
    .line 237
    .line 238
    move-result-object p2

    .line 239
    iput-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackLooper:Landroid/os/Looper;

    .line 240
    .line 241
    invoke-virtual {p1, p2, p0}, Lh1/z;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lh1/b0;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 246
    .line 247
    return-void
.end method

.method public static synthetic a(Landroidx/media3/exoplayer/ExoPlayerImplInternal;Landroidx/media3/exoplayer/MediaPeriodInfo;J)Landroidx/media3/exoplayer/MediaPeriodHolder;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->createMediaPeriodHolder(Landroidx/media3/exoplayer/MediaPeriodInfo;J)Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$602(Landroidx/media3/exoplayer/ExoPlayerImplInternal;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->requestForRendererSleep:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$700(Landroidx/media3/exoplayer/ExoPlayerImplInternal;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->dynamicSchedulingEnabled:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$800(Landroidx/media3/exoplayer/ExoPlayerImplInternal;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->offloadSchedulingEnabled:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$900(Landroidx/media3/exoplayer/ExoPlayerImplInternal;)Lh1/k;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 2
    .line 3
    return-object p0
.end method

.method private addMediaItemsInternal(Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfoUpdate:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->incrementPendingOperationAcks(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaSourceList:Landroidx/media3/exoplayer/MediaSourceList;

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    if-ne p2, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaSourceList;->getSize()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    :cond_0
    invoke-static {p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;->access$300(Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;->access$400(Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;)Landroidx/media3/exoplayer/source/ShuffleOrder;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p2, v1, p1}, Landroidx/media3/exoplayer/MediaSourceList;->addMediaSources(ILjava/util/List;Landroidx/media3/exoplayer/source/ShuffleOrder;)Landroidx/media3/common/p1;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleMediaSourceListInfoRefreshed(Landroidx/media3/common/p1;Z)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method private allowRenderersToRenderStartOfStreams()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getTrackSelectorResult()Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 13
    .line 14
    array-length v2, v2

    .line 15
    if-ge v1, v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->isRendererEnabled(I)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 24
    .line 25
    aget-object v2, v2, v1

    .line 26
    .line 27
    invoke-interface {v2}, Landroidx/media3/exoplayer/Renderer;->enableMayRenderStartOfStream()V

    .line 28
    .line 29
    .line 30
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-void
.end method

.method private attemptRendererErrorRecovery()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->reselectTracksInternalAndSeek()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Landroidx/media3/exoplayer/ExoPlayerImplInternal;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->lambda$maybeTriggerOnRendererReadyChanged$1(IZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Landroidx/media3/exoplayer/ExoPlayerImplInternal;Landroidx/media3/exoplayer/PlayerMessage;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->lambda$sendMessageToTargetThread$2(Landroidx/media3/exoplayer/PlayerMessage;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private createMediaPeriodHolder(Landroidx/media3/exoplayer/MediaPeriodInfo;J)Landroidx/media3/exoplayer/MediaPeriodHolder;
    .locals 11

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererCapabilities:[Landroidx/media3/exoplayer/RendererCapabilities;

    .line 4
    .line 5
    iget-object v4, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->trackSelector:Landroidx/media3/exoplayer/trackselection/TrackSelector;

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->loadControl:Landroidx/media3/exoplayer/LoadControl;

    .line 8
    .line 9
    invoke-interface {v2}, Landroidx/media3/exoplayer/LoadControl;->getAllocator()Landroidx/media3/exoplayer/upstream/Allocator;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    iget-object v6, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaSourceList:Landroidx/media3/exoplayer/MediaSourceList;

    .line 14
    .line 15
    iget-object v8, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->emptyTrackSelectorResult:Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 16
    .line 17
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->preloadConfiguration:Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;

    .line 18
    .line 19
    iget-wide v9, v2, Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;->targetPreloadDurationUs:J

    .line 20
    .line 21
    move-object v7, p1

    .line 22
    move-wide v2, p2

    .line 23
    invoke-direct/range {v0 .. v10}, Landroidx/media3/exoplayer/MediaPeriodHolder;-><init>([Landroidx/media3/exoplayer/RendererCapabilities;JLandroidx/media3/exoplayer/trackselection/TrackSelector;Landroidx/media3/exoplayer/upstream/Allocator;Landroidx/media3/exoplayer/MediaSourceList;Landroidx/media3/exoplayer/MediaPeriodInfo;Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;J)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public static synthetic d(Landroidx/media3/exoplayer/ExoPlayerImplInternal;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->lambda$release$0()Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private deliverMessage(Landroidx/media3/exoplayer/PlayerMessage;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroidx/media3/exoplayer/PlayerMessage;->isCanceled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :try_start_0
    invoke-virtual {p1}, Landroidx/media3/exoplayer/PlayerMessage;->getTarget()Landroidx/media3/exoplayer/PlayerMessage$Target;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p1}, Landroidx/media3/exoplayer/PlayerMessage;->getType()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {p1}, Landroidx/media3/exoplayer/PlayerMessage;->getPayload()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-interface {v1, v2, v3}, Landroidx/media3/exoplayer/PlayerMessage$Target;->handleMessage(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/PlayerMessage;->markAsProcessed(Z)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/PlayerMessage;->markAsProcessed(Z)V

    .line 30
    .line 31
    .line 32
    throw v1
.end method

.method private disableRenderer(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isRendererEnabled(Landroidx/media3/exoplayer/Renderer;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    invoke-direct {p0, p1, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeTriggerOnRendererReadyChanged(IZ)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/DefaultMediaClock;->onRendererDisabled(Landroidx/media3/exoplayer/Renderer;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->ensureStopped(Landroidx/media3/exoplayer/Renderer;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Landroidx/media3/exoplayer/Renderer;->disable()V

    .line 25
    .line 26
    .line 27
    iget p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->enabledRendererCount:I

    .line 28
    .line 29
    add-int/lit8 p1, p1, -0x1

    .line 30
    .line 31
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->enabledRendererCount:I

    .line 32
    .line 33
    return-void
.end method

.method private doSomeWork()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->clock:Lh1/b;

    .line 4
    .line 5
    check-cast v1, Lh1/z;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 15
    .line 16
    check-cast v3, Lh1/b0;

    .line 17
    .line 18
    const/4 v4, 0x2

    .line 19
    invoke-virtual {v3, v4}, Lh1/b0;->f(I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->updatePeriods()V

    .line 23
    .line 24
    .line 25
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 26
    .line 27
    iget v3, v3, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 28
    .line 29
    const/4 v5, 0x1

    .line 30
    if-eq v3, v5, :cond_21

    .line 31
    .line 32
    const/4 v6, 0x4

    .line 33
    if-ne v3, v6, :cond_0

    .line 34
    .line 35
    goto/16 :goto_10

    .line 36
    .line 37
    :cond_0
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 38
    .line 39
    invoke-virtual {v3}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    if-nez v3, :cond_1

    .line 44
    .line 45
    invoke-direct {v0, v1, v2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->scheduleNextWork(J)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    const-string v7, "doSomeWork"

    .line 50
    .line 51
    invoke-static {v7}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-direct {v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->updatePlaybackPositions()V

    .line 55
    .line 56
    .line 57
    iget-boolean v7, v3, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepared:Z

    .line 58
    .line 59
    const/4 v8, 0x0

    .line 60
    if-eqz v7, :cond_a

    .line 61
    .line 62
    iget-object v7, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->clock:Lh1/b;

    .line 63
    .line 64
    check-cast v7, Lh1/z;

    .line 65
    .line 66
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 70
    .line 71
    .line 72
    move-result-wide v9

    .line 73
    invoke-static {v9, v10}, Lh1/i0;->S(J)J

    .line 74
    .line 75
    .line 76
    move-result-wide v9

    .line 77
    iput-wide v9, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionElapsedRealtimeUs:J

    .line 78
    .line 79
    iget-object v7, v3, Landroidx/media3/exoplayer/MediaPeriodHolder;->mediaPeriod:Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 80
    .line 81
    iget-object v9, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 82
    .line 83
    iget-wide v9, v9, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 84
    .line 85
    iget-wide v11, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->backBufferDurationUs:J

    .line 86
    .line 87
    sub-long/2addr v9, v11

    .line 88
    iget-boolean v11, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->retainBackBufferFromKeyframe:Z

    .line 89
    .line 90
    invoke-interface {v7, v9, v10, v11}, Landroidx/media3/exoplayer/source/MediaPeriod;->discardBuffer(JZ)V

    .line 91
    .line 92
    .line 93
    move v9, v5

    .line 94
    move v10, v9

    .line 95
    move v7, v8

    .line 96
    :goto_0
    iget-object v11, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 97
    .line 98
    array-length v12, v11

    .line 99
    if-ge v7, v12, :cond_b

    .line 100
    .line 101
    aget-object v11, v11, v7

    .line 102
    .line 103
    invoke-static {v11}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isRendererEnabled(Landroidx/media3/exoplayer/Renderer;)Z

    .line 104
    .line 105
    .line 106
    move-result v12

    .line 107
    if-nez v12, :cond_2

    .line 108
    .line 109
    invoke-direct {v0, v7, v8}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeTriggerOnRendererReadyChanged(IZ)V

    .line 110
    .line 111
    .line 112
    goto :goto_7

    .line 113
    :cond_2
    iget-wide v12, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J

    .line 114
    .line 115
    iget-wide v14, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionElapsedRealtimeUs:J

    .line 116
    .line 117
    invoke-interface {v11, v12, v13, v14, v15}, Landroidx/media3/exoplayer/Renderer;->render(JJ)V

    .line 118
    .line 119
    .line 120
    if-eqz v9, :cond_3

    .line 121
    .line 122
    invoke-interface {v11}, Landroidx/media3/exoplayer/Renderer;->isEnded()Z

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    if-eqz v9, :cond_3

    .line 127
    .line 128
    move v9, v5

    .line 129
    goto :goto_1

    .line 130
    :cond_3
    move v9, v8

    .line 131
    :goto_1
    iget-object v12, v3, Landroidx/media3/exoplayer/MediaPeriodHolder;->sampleStreams:[Landroidx/media3/exoplayer/source/SampleStream;

    .line 132
    .line 133
    aget-object v12, v12, v7

    .line 134
    .line 135
    invoke-interface {v11}, Landroidx/media3/exoplayer/Renderer;->getStream()Landroidx/media3/exoplayer/source/SampleStream;

    .line 136
    .line 137
    .line 138
    move-result-object v13

    .line 139
    if-eq v12, v13, :cond_4

    .line 140
    .line 141
    move v12, v5

    .line 142
    goto :goto_2

    .line 143
    :cond_4
    move v12, v8

    .line 144
    :goto_2
    if-nez v12, :cond_5

    .line 145
    .line 146
    invoke-interface {v11}, Landroidx/media3/exoplayer/Renderer;->hasReadStreamToEnd()Z

    .line 147
    .line 148
    .line 149
    move-result v13

    .line 150
    if-eqz v13, :cond_5

    .line 151
    .line 152
    move v13, v5

    .line 153
    goto :goto_3

    .line 154
    :cond_5
    move v13, v8

    .line 155
    :goto_3
    if-nez v12, :cond_7

    .line 156
    .line 157
    if-nez v13, :cond_7

    .line 158
    .line 159
    invoke-interface {v11}, Landroidx/media3/exoplayer/Renderer;->isReady()Z

    .line 160
    .line 161
    .line 162
    move-result v12

    .line 163
    if-nez v12, :cond_7

    .line 164
    .line 165
    invoke-interface {v11}, Landroidx/media3/exoplayer/Renderer;->isEnded()Z

    .line 166
    .line 167
    .line 168
    move-result v11

    .line 169
    if-eqz v11, :cond_6

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_6
    move v11, v8

    .line 173
    goto :goto_5

    .line 174
    :cond_7
    :goto_4
    move v11, v5

    .line 175
    :goto_5
    invoke-direct {v0, v7, v11}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeTriggerOnRendererReadyChanged(IZ)V

    .line 176
    .line 177
    .line 178
    if-eqz v10, :cond_8

    .line 179
    .line 180
    if-eqz v11, :cond_8

    .line 181
    .line 182
    move v10, v5

    .line 183
    goto :goto_6

    .line 184
    :cond_8
    move v10, v8

    .line 185
    :goto_6
    if-nez v11, :cond_9

    .line 186
    .line 187
    invoke-direct {v0, v7}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeThrowRendererStreamError(I)V

    .line 188
    .line 189
    .line 190
    :cond_9
    :goto_7
    add-int/lit8 v7, v7, 0x1

    .line 191
    .line 192
    goto :goto_0

    .line 193
    :cond_a
    iget-object v7, v3, Landroidx/media3/exoplayer/MediaPeriodHolder;->mediaPeriod:Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 194
    .line 195
    invoke-interface {v7}, Landroidx/media3/exoplayer/source/MediaPeriod;->maybeThrowPrepareError()V

    .line 196
    .line 197
    .line 198
    move v9, v5

    .line 199
    move v10, v9

    .line 200
    :cond_b
    iget-object v7, v3, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 201
    .line 202
    iget-wide v11, v7, Landroidx/media3/exoplayer/MediaPeriodInfo;->durationUs:J

    .line 203
    .line 204
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    if-eqz v9, :cond_d

    .line 210
    .line 211
    iget-boolean v7, v3, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepared:Z

    .line 212
    .line 213
    if-eqz v7, :cond_d

    .line 214
    .line 215
    cmp-long v7, v11, v13

    .line 216
    .line 217
    if-eqz v7, :cond_c

    .line 218
    .line 219
    iget-object v7, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 220
    .line 221
    move-wide v15, v13

    .line 222
    iget-wide v13, v7, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 223
    .line 224
    cmp-long v7, v11, v13

    .line 225
    .line 226
    if-gtz v7, :cond_e

    .line 227
    .line 228
    goto :goto_8

    .line 229
    :cond_c
    move-wide v15, v13

    .line 230
    :goto_8
    move v7, v5

    .line 231
    goto :goto_9

    .line 232
    :cond_d
    move-wide v15, v13

    .line 233
    :cond_e
    move v7, v8

    .line 234
    :goto_9
    if-eqz v7, :cond_f

    .line 235
    .line 236
    iget-boolean v9, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingPauseAtEndOfPeriod:Z

    .line 237
    .line 238
    if-eqz v9, :cond_f

    .line 239
    .line 240
    iput-boolean v8, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingPauseAtEndOfPeriod:Z

    .line 241
    .line 242
    iget-object v9, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 243
    .line 244
    iget v9, v9, Landroidx/media3/exoplayer/PlaybackInfo;->playbackSuppressionReason:I

    .line 245
    .line 246
    const/4 v11, 0x5

    .line 247
    invoke-direct {v0, v8, v9, v8, v11}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setPlayWhenReadyInternal(ZIZI)V

    .line 248
    .line 249
    .line 250
    :cond_f
    const/4 v9, 0x3

    .line 251
    if-eqz v7, :cond_10

    .line 252
    .line 253
    iget-object v7, v3, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 254
    .line 255
    iget-boolean v7, v7, Landroidx/media3/exoplayer/MediaPeriodInfo;->isFinal:Z

    .line 256
    .line 257
    if-eqz v7, :cond_10

    .line 258
    .line 259
    invoke-direct {v0, v6}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setState(I)V

    .line 260
    .line 261
    .line 262
    invoke-direct {v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->stopRenderers()V

    .line 263
    .line 264
    .line 265
    goto :goto_a

    .line 266
    :cond_10
    iget-object v7, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 267
    .line 268
    iget v7, v7, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 269
    .line 270
    if-ne v7, v4, :cond_11

    .line 271
    .line 272
    invoke-direct {v0, v10}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shouldTransitionToReadyState(Z)Z

    .line 273
    .line 274
    .line 275
    move-result v7

    .line 276
    if-eqz v7, :cond_11

    .line 277
    .line 278
    invoke-direct {v0, v9}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setState(I)V

    .line 279
    .line 280
    .line 281
    const/4 v7, 0x0

    .line 282
    iput-object v7, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingRecoverableRendererError:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 283
    .line 284
    invoke-direct {v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shouldPlayWhenReady()Z

    .line 285
    .line 286
    .line 287
    move-result v7

    .line 288
    if-eqz v7, :cond_15

    .line 289
    .line 290
    invoke-direct {v0, v8, v8}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->updateRebufferingState(ZZ)V

    .line 291
    .line 292
    .line 293
    iget-object v7, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 294
    .line 295
    invoke-virtual {v7}, Landroidx/media3/exoplayer/DefaultMediaClock;->start()V

    .line 296
    .line 297
    .line 298
    invoke-direct {v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->startRenderers()V

    .line 299
    .line 300
    .line 301
    goto :goto_a

    .line 302
    :cond_11
    iget-object v7, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 303
    .line 304
    iget v7, v7, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 305
    .line 306
    if-ne v7, v9, :cond_15

    .line 307
    .line 308
    iget v7, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->enabledRendererCount:I

    .line 309
    .line 310
    if-nez v7, :cond_12

    .line 311
    .line 312
    invoke-direct {v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isTimelineReady()Z

    .line 313
    .line 314
    .line 315
    move-result v7

    .line 316
    if-eqz v7, :cond_13

    .line 317
    .line 318
    goto :goto_a

    .line 319
    :cond_12
    if-nez v10, :cond_15

    .line 320
    .line 321
    :cond_13
    invoke-direct {v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shouldPlayWhenReady()Z

    .line 322
    .line 323
    .line 324
    move-result v7

    .line 325
    invoke-direct {v0, v7, v8}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->updateRebufferingState(ZZ)V

    .line 326
    .line 327
    .line 328
    invoke-direct {v0, v4}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setState(I)V

    .line 329
    .line 330
    .line 331
    iget-boolean v7, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isRebuffering:Z

    .line 332
    .line 333
    if-eqz v7, :cond_14

    .line 334
    .line 335
    invoke-direct {v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->notifyTrackSelectionRebuffer()V

    .line 336
    .line 337
    .line 338
    iget-object v7, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->livePlaybackSpeedControl:Landroidx/media3/exoplayer/LivePlaybackSpeedControl;

    .line 339
    .line 340
    invoke-interface {v7}, Landroidx/media3/exoplayer/LivePlaybackSpeedControl;->notifyRebuffer()V

    .line 341
    .line 342
    .line 343
    :cond_14
    invoke-direct {v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->stopRenderers()V

    .line 344
    .line 345
    .line 346
    :cond_15
    :goto_a
    iget-object v7, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 347
    .line 348
    iget v7, v7, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 349
    .line 350
    if-ne v7, v4, :cond_1a

    .line 351
    .line 352
    move v7, v8

    .line 353
    :goto_b
    iget-object v10, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 354
    .line 355
    array-length v11, v10

    .line 356
    if-ge v7, v11, :cond_17

    .line 357
    .line 358
    aget-object v10, v10, v7

    .line 359
    .line 360
    invoke-static {v10}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isRendererEnabled(Landroidx/media3/exoplayer/Renderer;)Z

    .line 361
    .line 362
    .line 363
    move-result v10

    .line 364
    if-eqz v10, :cond_16

    .line 365
    .line 366
    iget-object v10, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 367
    .line 368
    aget-object v10, v10, v7

    .line 369
    .line 370
    invoke-interface {v10}, Landroidx/media3/exoplayer/Renderer;->getStream()Landroidx/media3/exoplayer/source/SampleStream;

    .line 371
    .line 372
    .line 373
    move-result-object v10

    .line 374
    iget-object v11, v3, Landroidx/media3/exoplayer/MediaPeriodHolder;->sampleStreams:[Landroidx/media3/exoplayer/source/SampleStream;

    .line 375
    .line 376
    aget-object v11, v11, v7

    .line 377
    .line 378
    if-ne v10, v11, :cond_16

    .line 379
    .line 380
    invoke-direct {v0, v7}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeThrowRendererStreamError(I)V

    .line 381
    .line 382
    .line 383
    :cond_16
    add-int/lit8 v7, v7, 0x1

    .line 384
    .line 385
    goto :goto_b

    .line 386
    :cond_17
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 387
    .line 388
    iget-boolean v7, v3, Landroidx/media3/exoplayer/PlaybackInfo;->isLoading:Z

    .line 389
    .line 390
    if-nez v7, :cond_1a

    .line 391
    .line 392
    iget-wide v10, v3, Landroidx/media3/exoplayer/PlaybackInfo;->totalBufferedDurationUs:J

    .line 393
    .line 394
    const-wide/32 v12, 0x7a120

    .line 395
    .line 396
    .line 397
    cmp-long v3, v10, v12

    .line 398
    .line 399
    if-gez v3, :cond_1a

    .line 400
    .line 401
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 402
    .line 403
    invoke-virtual {v3}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getLoadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    invoke-direct {v0, v3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isLoadingPossible(Landroidx/media3/exoplayer/MediaPeriodHolder;)Z

    .line 408
    .line 409
    .line 410
    move-result v3

    .line 411
    if-eqz v3, :cond_1a

    .line 412
    .line 413
    iget-wide v10, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackMaybeBecameStuckAtMs:J

    .line 414
    .line 415
    cmp-long v3, v10, v15

    .line 416
    .line 417
    if-nez v3, :cond_18

    .line 418
    .line 419
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->clock:Lh1/b;

    .line 420
    .line 421
    check-cast v3, Lh1/z;

    .line 422
    .line 423
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 427
    .line 428
    .line 429
    move-result-wide v10

    .line 430
    iput-wide v10, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackMaybeBecameStuckAtMs:J

    .line 431
    .line 432
    goto :goto_c

    .line 433
    :cond_18
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->clock:Lh1/b;

    .line 434
    .line 435
    check-cast v3, Lh1/z;

    .line 436
    .line 437
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 441
    .line 442
    .line 443
    move-result-wide v10

    .line 444
    iget-wide v12, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackMaybeBecameStuckAtMs:J

    .line 445
    .line 446
    sub-long/2addr v10, v12

    .line 447
    const-wide/16 v12, 0xfa0

    .line 448
    .line 449
    cmp-long v3, v10, v12

    .line 450
    .line 451
    if-gez v3, :cond_19

    .line 452
    .line 453
    goto :goto_c

    .line 454
    :cond_19
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 455
    .line 456
    const-string v2, "Playback stuck buffering and not loading"

    .line 457
    .line 458
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 459
    .line 460
    .line 461
    throw v1

    .line 462
    :cond_1a
    move-wide v10, v15

    .line 463
    iput-wide v10, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackMaybeBecameStuckAtMs:J

    .line 464
    .line 465
    :goto_c
    invoke-direct {v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shouldPlayWhenReady()Z

    .line 466
    .line 467
    .line 468
    move-result v3

    .line 469
    if-eqz v3, :cond_1b

    .line 470
    .line 471
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 472
    .line 473
    iget v3, v3, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 474
    .line 475
    if-ne v3, v9, :cond_1b

    .line 476
    .line 477
    move v3, v5

    .line 478
    goto :goto_d

    .line 479
    :cond_1b
    move v3, v8

    .line 480
    :goto_d
    iget-boolean v7, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->offloadSchedulingEnabled:Z

    .line 481
    .line 482
    if-eqz v7, :cond_1c

    .line 483
    .line 484
    iget-boolean v7, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->requestForRendererSleep:Z

    .line 485
    .line 486
    if-eqz v7, :cond_1c

    .line 487
    .line 488
    if-eqz v3, :cond_1c

    .line 489
    .line 490
    goto :goto_e

    .line 491
    :cond_1c
    move v5, v8

    .line 492
    :goto_e
    iget-object v7, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 493
    .line 494
    iget-boolean v10, v7, Landroidx/media3/exoplayer/PlaybackInfo;->sleepingForOffload:Z

    .line 495
    .line 496
    if-eq v10, v5, :cond_1d

    .line 497
    .line 498
    invoke-virtual {v7, v5}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithSleepingForOffload(Z)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 499
    .line 500
    .line 501
    move-result-object v7

    .line 502
    iput-object v7, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 503
    .line 504
    :cond_1d
    iput-boolean v8, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->requestForRendererSleep:Z

    .line 505
    .line 506
    if-nez v5, :cond_20

    .line 507
    .line 508
    iget-object v5, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 509
    .line 510
    iget v5, v5, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 511
    .line 512
    if-ne v5, v6, :cond_1e

    .line 513
    .line 514
    goto :goto_f

    .line 515
    :cond_1e
    if-nez v3, :cond_1f

    .line 516
    .line 517
    if-eq v5, v4, :cond_1f

    .line 518
    .line 519
    if-ne v5, v9, :cond_20

    .line 520
    .line 521
    iget v3, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->enabledRendererCount:I

    .line 522
    .line 523
    if-eqz v3, :cond_20

    .line 524
    .line 525
    :cond_1f
    invoke-direct {v0, v1, v2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->scheduleNextWork(J)V

    .line 526
    .line 527
    .line 528
    :cond_20
    :goto_f
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 529
    .line 530
    .line 531
    :cond_21
    :goto_10
    return-void
.end method

.method private enableRenderer(IZJ)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 4
    .line 5
    aget-object v2, v1, p1

    .line 6
    .line 7
    invoke-static {v2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isRendererEnabled(Landroidx/media3/exoplayer/Renderer;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_3

    .line 14
    .line 15
    :cond_0
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getReadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 22
    .line 23
    invoke-virtual {v3}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x1

    .line 29
    if-ne v1, v3, :cond_1

    .line 30
    .line 31
    move v9, v5

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move v9, v4

    .line 34
    :goto_0
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getTrackSelectorResult()Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    iget-object v6, v3, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->rendererConfigurations:[Landroidx/media3/exoplayer/RendererConfiguration;

    .line 39
    .line 40
    aget-object v6, v6, p1

    .line 41
    .line 42
    iget-object v3, v3, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->selections:[Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;

    .line 43
    .line 44
    aget-object v3, v3, p1

    .line 45
    .line 46
    invoke-static {v3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->getFormats(Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;)[Landroidx/media3/common/w;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-direct {v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shouldPlayWhenReady()Z

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    if-eqz v7, :cond_2

    .line 55
    .line 56
    iget-object v7, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 57
    .line 58
    iget v7, v7, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 59
    .line 60
    const/4 v8, 0x3

    .line 61
    if-ne v7, v8, :cond_2

    .line 62
    .line 63
    move v15, v5

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    move v15, v4

    .line 66
    :goto_1
    if-nez p2, :cond_3

    .line 67
    .line 68
    if-eqz v15, :cond_3

    .line 69
    .line 70
    move v8, v5

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    move v8, v4

    .line 73
    :goto_2
    iget v4, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->enabledRendererCount:I

    .line 74
    .line 75
    add-int/2addr v4, v5

    .line 76
    iput v4, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->enabledRendererCount:I

    .line 77
    .line 78
    iget-object v4, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderersToReset:Ljava/util/Set;

    .line 79
    .line 80
    invoke-interface {v4, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    iget-object v4, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->sampleStreams:[Landroidx/media3/exoplayer/source/SampleStream;

    .line 84
    .line 85
    aget-object v5, v4, p1

    .line 86
    .line 87
    move-object v4, v3

    .line 88
    move-object v3, v6

    .line 89
    iget-wide v6, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J

    .line 90
    .line 91
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getRendererOffset()J

    .line 92
    .line 93
    .line 94
    move-result-wide v12

    .line 95
    iget-object v1, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 96
    .line 97
    iget-object v14, v1, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 98
    .line 99
    move-wide/from16 v10, p3

    .line 100
    .line 101
    invoke-interface/range {v2 .. v14}, Landroidx/media3/exoplayer/Renderer;->enable(Landroidx/media3/exoplayer/RendererConfiguration;[Landroidx/media3/common/w;Landroidx/media3/exoplayer/source/SampleStream;JZZJJLandroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)V

    .line 102
    .line 103
    .line 104
    new-instance v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$1;

    .line 105
    .line 106
    invoke-direct {v1, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$1;-><init>(Landroidx/media3/exoplayer/ExoPlayerImplInternal;)V

    .line 107
    .line 108
    .line 109
    const/16 v3, 0xb

    .line 110
    .line 111
    invoke-interface {v2, v3, v1}, Landroidx/media3/exoplayer/PlayerMessage$Target;->handleMessage(ILjava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 115
    .line 116
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/DefaultMediaClock;->onRendererEnabled(Landroidx/media3/exoplayer/Renderer;)V

    .line 117
    .line 118
    .line 119
    if-eqz v15, :cond_4

    .line 120
    .line 121
    if-eqz v9, :cond_4

    .line 122
    .line 123
    invoke-interface {v2}, Landroidx/media3/exoplayer/Renderer;->start()V

    .line 124
    .line 125
    .line 126
    :cond_4
    :goto_3
    return-void
.end method

.method private enableRenderers()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    array-length v0, v0

    new-array v0, v0, [Z

    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getReadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getStartPositionRendererTime()J

    move-result-wide v1

    .line 3
    invoke-direct {p0, v0, v1, v2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->enableRenderers([ZJ)V

    return-void
.end method

.method private enableRenderers([ZJ)V
    .locals 6

    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getReadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getTrackSelectorResult()Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    .line 6
    :goto_0
    iget-object v4, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    array-length v4, v4

    if-ge v3, v4, :cond_1

    .line 7
    invoke-virtual {v1, v3}, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->isRendererEnabled(I)Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v4, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderersToReset:Ljava/util/Set;

    iget-object v5, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    aget-object v5, v5, v3

    invoke-interface {v4, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 8
    iget-object v4, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    aget-object v4, v4, v3

    invoke-interface {v4}, Landroidx/media3/exoplayer/Renderer;->reset()V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 9
    :cond_1
    :goto_1
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    array-length v3, v3

    if-ge v2, v3, :cond_3

    .line 10
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->isRendererEnabled(I)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 11
    aget-boolean v3, p1, v2

    invoke-direct {p0, v2, v3, p2, p3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->enableRenderer(IZJ)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->allRenderersInCorrectState:Z

    return-void
.end method

.method private ensureStopped(Landroidx/media3/exoplayer/Renderer;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Landroidx/media3/exoplayer/Renderer;->getState()I

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
    invoke-interface {p1}, Landroidx/media3/exoplayer/Renderer;->stop()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method private extractMetadataFromTrackSelectionArray([Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;)Lf6/m0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;",
            ")",
            "Lf6/m0;"
        }
    .end annotation

    .line 1
    new-instance v0, Lf6/j0;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lf6/g0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    array-length v1, p1

    .line 8
    const/4 v2, 0x0

    .line 9
    move v3, v2

    .line 10
    move v4, v3

    .line 11
    :goto_0
    if-ge v3, v1, :cond_2

    .line 12
    .line 13
    aget-object v5, p1, v3

    .line 14
    .line 15
    if-eqz v5, :cond_1

    .line 16
    .line 17
    invoke-interface {v5, v2}, Landroidx/media3/exoplayer/trackselection/TrackSelection;->getFormat(I)Landroidx/media3/common/w;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    iget-object v5, v5, Landroidx/media3/common/w;->l:Landroidx/media3/common/t0;

    .line 22
    .line 23
    if-nez v5, :cond_0

    .line 24
    .line 25
    new-instance v5, Landroidx/media3/common/t0;

    .line 26
    .line 27
    new-array v6, v2, [Landroidx/media3/common/s0;

    .line 28
    .line 29
    invoke-direct {v5, v6}, Landroidx/media3/common/t0;-><init>([Landroidx/media3/common/s0;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v5}, Lf6/g0;->a(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    invoke-virtual {v0, v5}, Lf6/g0;->a(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    if-eqz v4, :cond_3

    .line 44
    .line 45
    invoke-virtual {v0}, Lf6/j0;->f()Lf6/l1;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :cond_3
    sget-object p1, Lf6/m0;->k:Lf6/k0;

    .line 51
    .line 52
    sget-object p1, Lf6/l1;->n:Lf6/l1;

    .line 53
    .line 54
    return-object p1
.end method

.method private getCurrentLiveOffsetUs()J
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 6
    .line 7
    iget-object v2, v2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 8
    .line 9
    iget-wide v3, v0, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 10
    .line 11
    invoke-direct {p0, v1, v2, v3, v4}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->getLiveOffsetUs(Landroidx/media3/common/p1;Ljava/lang/Object;J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0
.end method

.method private static getFormats(Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;)[Landroidx/media3/common/w;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    invoke-interface {p0}, Landroidx/media3/exoplayer/trackselection/TrackSelection;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    new-array v2, v1, [Landroidx/media3/common/w;

    .line 11
    .line 12
    :goto_1
    if-ge v0, v1, :cond_1

    .line 13
    .line 14
    invoke-interface {p0, v0}, Landroidx/media3/exoplayer/trackselection/TrackSelection;->getFormat(I)Landroidx/media3/common/w;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    aput-object v3, v2, v0

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    return-object v2
.end method

.method private getLiveOffsetUs(Landroidx/media3/common/p1;Ljava/lang/Object;J)J
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->period:Landroidx/media3/common/m1;

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
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->window:Landroidx/media3/common/o1;

    .line 10
    .line 11
    invoke-virtual {p1, p2, v0}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->window:Landroidx/media3/common/o1;

    .line 15
    .line 16
    iget-wide v0, p1, Landroidx/media3/common/o1;->f:J

    .line 17
    .line 18
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long p2, v0, v2

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1}, Landroidx/media3/common/o1;->a()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->window:Landroidx/media3/common/o1;

    .line 34
    .line 35
    iget-boolean p2, p1, Landroidx/media3/common/o1;->i:Z

    .line 36
    .line 37
    if-nez p2, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-wide p1, p1, Landroidx/media3/common/o1;->g:J

    .line 41
    .line 42
    invoke-static {p1, p2}, Lh1/i0;->C(J)J

    .line 43
    .line 44
    .line 45
    move-result-wide p1

    .line 46
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->window:Landroidx/media3/common/o1;

    .line 47
    .line 48
    iget-wide v0, v0, Landroidx/media3/common/o1;->f:J

    .line 49
    .line 50
    sub-long/2addr p1, v0

    .line 51
    invoke-static {p1, p2}, Lh1/i0;->S(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide p1

    .line 55
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->period:Landroidx/media3/common/m1;

    .line 56
    .line 57
    iget-wide v0, v0, Landroidx/media3/common/m1;->e:J

    .line 58
    .line 59
    add-long/2addr p3, v0

    .line 60
    sub-long/2addr p1, p3

    .line 61
    return-wide p1

    .line 62
    :cond_1
    :goto_0
    return-wide v2
.end method

.method private getMaxRendererReadPositionUs()J
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getReadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    return-wide v0

    .line 12
    :cond_0
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getRendererOffset()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    iget-boolean v3, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepared:Z

    .line 17
    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    return-wide v1

    .line 21
    :cond_1
    const/4 v3, 0x0

    .line 22
    :goto_0
    iget-object v4, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 23
    .line 24
    array-length v5, v4

    .line 25
    if-ge v3, v5, :cond_5

    .line 26
    .line 27
    aget-object v4, v4, v3

    .line 28
    .line 29
    invoke-static {v4}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isRendererEnabled(Landroidx/media3/exoplayer/Renderer;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_4

    .line 34
    .line 35
    iget-object v4, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 36
    .line 37
    aget-object v4, v4, v3

    .line 38
    .line 39
    invoke-interface {v4}, Landroidx/media3/exoplayer/Renderer;->getStream()Landroidx/media3/exoplayer/source/SampleStream;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iget-object v5, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->sampleStreams:[Landroidx/media3/exoplayer/source/SampleStream;

    .line 44
    .line 45
    aget-object v5, v5, v3

    .line 46
    .line 47
    if-eq v4, v5, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    iget-object v4, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 51
    .line 52
    aget-object v4, v4, v3

    .line 53
    .line 54
    invoke-interface {v4}, Landroidx/media3/exoplayer/Renderer;->getReadingPositionUs()J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    const-wide/high16 v6, -0x8000000000000000L

    .line 59
    .line 60
    cmp-long v8, v4, v6

    .line 61
    .line 62
    if-nez v8, :cond_3

    .line 63
    .line 64
    return-wide v6

    .line 65
    :cond_3
    invoke-static {v4, v5, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 66
    .line 67
    .line 68
    move-result-wide v1

    .line 69
    :cond_4
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_5
    return-wide v1
.end method

.method private getPlaceholderFirstMediaPeriodPositionUs(Landroidx/media3/common/p1;)Landroid/util/Pair;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/p1;",
            ")",
            "Landroid/util/Pair<",
            "Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;",
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
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Landroidx/media3/exoplayer/PlaybackInfo;->getDummyPeriodForEmptyTimeline()Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shuffleModeEnabled:Z

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroidx/media3/common/p1;->getFirstWindowIndex(Z)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    iget-object v4, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->window:Landroidx/media3/common/o1;

    .line 29
    .line 30
    iget-object v5, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->period:Landroidx/media3/common/m1;

    .line 31
    .line 32
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    move-object v3, p1

    .line 38
    invoke-virtual/range {v3 .. v8}, Landroidx/media3/common/p1;->getPeriodPositionUs(Landroidx/media3/common/o1;Landroidx/media3/common/m1;IJ)Landroid/util/Pair;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 43
    .line 44
    iget-object v4, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {v0, v3, v4, v1, v2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->resolveMediaPeriodIdForAdsAfterPeriodPositionChange(Landroidx/media3/common/p1;Ljava/lang/Object;J)Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Ljava/lang/Long;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    invoke-virtual {v0}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_2

    .line 63
    .line 64
    iget-object p1, v0, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 65
    .line 66
    iget-object v4, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->period:Landroidx/media3/common/m1;

    .line 67
    .line 68
    invoke-virtual {v3, p1, v4}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 69
    .line 70
    .line 71
    iget p1, v0, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adIndexInAdGroup:I

    .line 72
    .line 73
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->period:Landroidx/media3/common/m1;

    .line 74
    .line 75
    iget v4, v0, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 76
    .line 77
    invoke-virtual {v3, v4}, Landroidx/media3/common/m1;->f(I)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-ne p1, v3, :cond_1

    .line 82
    .line 83
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->period:Landroidx/media3/common/m1;

    .line 84
    .line 85
    iget-object p1, p1, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 86
    .line 87
    iget-wide v1, p1, Landroidx/media3/common/c;->c:J

    .line 88
    .line 89
    :cond_1
    move-wide v4, v1

    .line 90
    :cond_2
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-static {v0, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    return-object p1
.end method

.method private getTotalBufferedDurationUs()J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    iget-wide v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->bufferedPositionUs:J

    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->getTotalBufferedDurationUs(J)J

    move-result-wide v0

    return-wide v0
.end method

.method private getTotalBufferedDurationUs(J)J
    .locals 5

    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getLoadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    move-result-object v0

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    return-wide v1

    .line 3
    :cond_0
    iget-wide v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J

    .line 4
    invoke-virtual {v0, v3, v4}, Landroidx/media3/exoplayer/MediaPeriodHolder;->toPeriodTime(J)J

    move-result-wide v3

    sub-long/2addr p1, v3

    .line 5
    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method private handleContinueLoadingRequested(Landroidx/media3/exoplayer/source/MediaPeriod;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->isLoading(Landroidx/media3/exoplayer/source/MediaPeriod;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 10
    .line 11
    iget-wide v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J

    .line 12
    .line 13
    invoke-virtual {p1, v0, v1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->reevaluateBuffer(J)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeContinueLoading()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->isPreloading(Landroidx/media3/exoplayer/source/MediaPeriod;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeContinuePreloading()V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method private handleIoException(Ljava/io/IOException;I)V
    .locals 1

    .line 1
    invoke-static {p1, p2}, Landroidx/media3/exoplayer/ExoPlaybackException;->createForSource(Ljava/io/IOException;I)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 6
    .line 7
    invoke-virtual {p2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    iget-object p2, p2, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 14
    .line 15
    iget-object p2, p2, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 16
    .line 17
    invoke-virtual {p1, p2}, Landroidx/media3/exoplayer/ExoPlaybackException;->copyWithMediaPeriodId(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :cond_0
    const-string p2, "ExoPlayerImplInternal"

    .line 22
    .line 23
    const-string v0, "Playback error"

    .line 24
    .line 25
    invoke-static {p2, v0, p1}, Lh1/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-direct {p0, p2, p2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->stopInternal(ZZ)V

    .line 30
    .line 31
    .line 32
    iget-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 33
    .line 34
    invoke-virtual {p2, p1}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithPlaybackError(Landroidx/media3/exoplayer/ExoPlaybackException;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 39
    .line 40
    return-void
.end method

.method private handleLoadingMediaPeriodChanged(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getLoadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 10
    .line 11
    iget-object v1, v1, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v1, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 15
    .line 16
    iget-object v1, v1, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 17
    .line 18
    :goto_0
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 19
    .line 20
    iget-object v2, v2, Landroidx/media3/exoplayer/PlaybackInfo;->loadingMediaPeriodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 29
    .line 30
    invoke-virtual {v3, v1}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithLoadingMediaPeriodId(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iput-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 35
    .line 36
    :cond_1
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    iget-wide v3, v1, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getBufferedPositionUs()J

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    :goto_1
    iput-wide v3, v1, Landroidx/media3/exoplayer/PlaybackInfo;->bufferedPositionUs:J

    .line 48
    .line 49
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 50
    .line 51
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->getTotalBufferedDurationUs()J

    .line 52
    .line 53
    .line 54
    move-result-wide v3

    .line 55
    iput-wide v3, v1, Landroidx/media3/exoplayer/PlaybackInfo;->totalBufferedDurationUs:J

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    if-eqz p1, :cond_4

    .line 60
    .line 61
    :cond_3
    if-eqz v0, :cond_4

    .line 62
    .line 63
    iget-boolean p1, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepared:Z

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    iget-object p1, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 68
    .line 69
    iget-object p1, p1, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 70
    .line 71
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getTrackGroups()Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getTrackSelectorResult()Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-direct {p0, p1, v1, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->updateLoadControlTrackSelection(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;Landroidx/media3/exoplayer/source/TrackGroupArray;Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;)V

    .line 80
    .line 81
    .line 82
    :cond_4
    return-void
.end method

.method private handleLoadingPeriodPrepared(Landroidx/media3/exoplayer/MediaPeriodHolder;)V
    .locals 11

    .line 1
    iget-boolean v0, p1, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepared:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/media3/exoplayer/DefaultMediaClock;->getPlaybackParameters()Landroidx/media3/common/y0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Landroidx/media3/common/y0;->a:F

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 14
    .line 15
    iget-object v2, v1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 16
    .line 17
    iget-boolean v1, v1, Landroidx/media3/exoplayer/PlaybackInfo;->playWhenReady:Z

    .line 18
    .line 19
    invoke-virtual {p1, v0, v2, v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->handlePrepared(FLandroidx/media3/common/p1;Z)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v0, p1, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 23
    .line 24
    iget-object v0, v0, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getTrackGroups()Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getTrackSelectorResult()Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-direct {p0, v0, v1, v2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->updateLoadControlTrackSelection(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;Landroidx/media3/exoplayer/source/TrackGroupArray;Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-ne p1, v0, :cond_1

    .line 44
    .line 45
    iget-object v0, p1, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 46
    .line 47
    iget-wide v0, v0, Landroidx/media3/exoplayer/MediaPeriodInfo;->startPositionUs:J

    .line 48
    .line 49
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resetRendererPosition(J)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->enableRenderers()V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 56
    .line 57
    iget-object v2, v0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 58
    .line 59
    iget-object p1, p1, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 60
    .line 61
    iget-wide v3, p1, Landroidx/media3/exoplayer/MediaPeriodInfo;->startPositionUs:J

    .line 62
    .line 63
    iget-wide v5, v0, Landroidx/media3/exoplayer/PlaybackInfo;->requestedContentPositionUs:J

    .line 64
    .line 65
    const/4 v9, 0x0

    .line 66
    const/4 v10, 0x5

    .line 67
    move-wide v7, v3

    .line 68
    move-object v1, p0

    .line 69
    invoke-direct/range {v1 .. v10}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handlePositionDiscontinuity(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJJZI)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    move-object v1, p0

    .line 77
    :goto_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeContinueLoading()V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method private handleMediaSourceListInfoRefreshed(Landroidx/media3/common/p1;Z)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v3, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 4
    .line 5
    iget-object v4, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingInitialSeekPosition:Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;

    .line 6
    .line 7
    iget-object v5, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 8
    .line 9
    iget v6, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->repeatMode:I

    .line 10
    .line 11
    iget-boolean v7, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shuffleModeEnabled:Z

    .line 12
    .line 13
    iget-object v8, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->window:Landroidx/media3/common/o1;

    .line 14
    .line 15
    iget-object v9, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->period:Landroidx/media3/common/m1;

    .line 16
    .line 17
    move-object/from16 v2, p1

    .line 18
    .line 19
    invoke-static/range {v2 .. v9}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resolvePositionForPlaylistChange(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;Landroidx/media3/exoplayer/MediaPeriodQueue;IZLandroidx/media3/common/o1;Landroidx/media3/common/m1;)Landroidx/media3/exoplayer/ExoPlayerImplInternal$PositionUpdateForPlaylistChange;

    .line 20
    .line 21
    .line 22
    move-result-object v8

    .line 23
    iget-object v9, v8, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PositionUpdateForPlaylistChange;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 24
    .line 25
    iget-wide v10, v8, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PositionUpdateForPlaylistChange;->requestedContentPositionUs:J

    .line 26
    .line 27
    iget-boolean v0, v8, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PositionUpdateForPlaylistChange;->forceBufferingState:Z

    .line 28
    .line 29
    iget-wide v12, v8, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PositionUpdateForPlaylistChange;->periodPositionUs:J

    .line 30
    .line 31
    iget-object v3, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 32
    .line 33
    iget-object v3, v3, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 34
    .line 35
    invoke-virtual {v3, v9}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/4 v14, 0x1

    .line 40
    const/4 v15, 0x0

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    iget-object v3, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 44
    .line 45
    iget-wide v3, v3, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 46
    .line 47
    cmp-long v3, v12, v3

    .line 48
    .line 49
    if-eqz v3, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move/from16 v16, v15

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    :goto_0
    move/from16 v16, v14

    .line 56
    .line 57
    :goto_1
    const/16 v17, 0x3

    .line 58
    .line 59
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    const/4 v6, 0x4

    .line 65
    :try_start_0
    iget-boolean v7, v8, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PositionUpdateForPlaylistChange;->endPlayback:Z

    .line 66
    .line 67
    if-eqz v7, :cond_3

    .line 68
    .line 69
    iget-object v7, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 70
    .line 71
    iget v7, v7, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 72
    .line 73
    if-eq v7, v14, :cond_2

    .line 74
    .line 75
    invoke-direct {v1, v6}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setState(I)V

    .line 76
    .line 77
    .line 78
    goto :goto_3

    .line 79
    :catchall_0
    move-exception v0

    .line 80
    move/from16 v20, v6

    .line 81
    .line 82
    move-object v3, v9

    .line 83
    move-wide v9, v10

    .line 84
    const/4 v14, -0x1

    .line 85
    :goto_2
    move-object v11, v2

    .line 86
    goto/16 :goto_f

    .line 87
    .line 88
    :cond_2
    :goto_3
    invoke-direct {v1, v15, v15, v15, v14}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resetInternal(ZZZZ)V

    .line 89
    .line 90
    .line 91
    :cond_3
    iget-object v7, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 92
    .line 93
    array-length v3, v7

    .line 94
    move v4, v15

    .line 95
    :goto_4
    if-ge v4, v3, :cond_4

    .line 96
    .line 97
    aget-object v5, v7, v4

    .line 98
    .line 99
    invoke-interface {v5, v2}, Landroidx/media3/exoplayer/Renderer;->setTimeline(Landroidx/media3/common/p1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    .line 101
    .line 102
    add-int/lit8 v4, v4, 0x1

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_4
    if-nez v16, :cond_5

    .line 106
    .line 107
    :try_start_1
    iget-object v2, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 108
    .line 109
    iget-wide v4, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 110
    .line 111
    move v3, v6

    .line 112
    :try_start_2
    invoke-direct {v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->getMaxRendererReadPositionUs()J

    .line 113
    .line 114
    .line 115
    move-result-wide v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 116
    move/from16 v20, v3

    .line 117
    .line 118
    const/4 v14, -0x1

    .line 119
    move-object/from16 v3, p1

    .line 120
    .line 121
    :try_start_3
    invoke-virtual/range {v2 .. v7}, Landroidx/media3/exoplayer/MediaPeriodQueue;->updateQueuedPeriods(Landroidx/media3/common/p1;JJ)Z

    .line 122
    .line 123
    .line 124
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 125
    move-object v2, v3

    .line 126
    if-nez v0, :cond_8

    .line 127
    .line 128
    :try_start_4
    invoke-direct {v1, v15}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->seekToCurrentPosition(Z)V

    .line 129
    .line 130
    .line 131
    goto :goto_8

    .line 132
    :catchall_1
    move-exception v0

    .line 133
    :goto_5
    move-object v3, v9

    .line 134
    move-wide v9, v10

    .line 135
    goto :goto_2

    .line 136
    :catchall_2
    move-exception v0

    .line 137
    move-object v2, v3

    .line 138
    goto :goto_5

    .line 139
    :catchall_3
    move-exception v0

    .line 140
    move-object/from16 v2, p1

    .line 141
    .line 142
    move/from16 v20, v3

    .line 143
    .line 144
    :goto_6
    const/4 v14, -0x1

    .line 145
    goto :goto_5

    .line 146
    :catchall_4
    move-exception v0

    .line 147
    move-object/from16 v2, p1

    .line 148
    .line 149
    move/from16 v20, v6

    .line 150
    .line 151
    goto :goto_6

    .line 152
    :cond_5
    move/from16 v20, v6

    .line 153
    .line 154
    const/4 v14, -0x1

    .line 155
    invoke-virtual {v2}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-nez v3, :cond_8

    .line 160
    .line 161
    iget-object v3, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 162
    .line 163
    invoke-virtual {v3}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    :goto_7
    if-eqz v3, :cond_7

    .line 168
    .line 169
    iget-object v4, v3, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 170
    .line 171
    iget-object v4, v4, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 172
    .line 173
    invoke-virtual {v4, v9}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    if-eqz v4, :cond_6

    .line 178
    .line 179
    iget-object v4, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 180
    .line 181
    iget-object v5, v3, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 182
    .line 183
    invoke-virtual {v4, v2, v5}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getUpdatedMediaPeriodInfo(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/MediaPeriodInfo;)Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    iput-object v4, v3, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 188
    .line 189
    invoke-virtual {v3}, Landroidx/media3/exoplayer/MediaPeriodHolder;->updateClipping()V

    .line 190
    .line 191
    .line 192
    :cond_6
    invoke-virtual {v3}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    goto :goto_7

    .line 197
    :cond_7
    invoke-direct {v1, v9, v12, v13, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->seekToPeriodPosition(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JZ)J

    .line 198
    .line 199
    .line 200
    move-result-wide v12
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 201
    :cond_8
    :goto_8
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 202
    .line 203
    iget-object v4, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 204
    .line 205
    iget-object v5, v0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 206
    .line 207
    iget-boolean v0, v8, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PositionUpdateForPlaylistChange;->setTargetLiveOffset:Z

    .line 208
    .line 209
    if-eqz v0, :cond_9

    .line 210
    .line 211
    move-wide v6, v12

    .line 212
    goto :goto_9

    .line 213
    :cond_9
    move-wide/from16 v6, v18

    .line 214
    .line 215
    :goto_9
    const/4 v8, 0x0

    .line 216
    move-object v3, v9

    .line 217
    invoke-direct/range {v1 .. v8}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->updatePlaybackSpeedSettingsForNewPeriod(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JZ)V

    .line 218
    .line 219
    .line 220
    if-nez v16, :cond_b

    .line 221
    .line 222
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 223
    .line 224
    iget-wide v4, v0, Landroidx/media3/exoplayer/PlaybackInfo;->requestedContentPositionUs:J

    .line 225
    .line 226
    cmp-long v0, v10, v4

    .line 227
    .line 228
    if-eqz v0, :cond_a

    .line 229
    .line 230
    goto :goto_a

    .line 231
    :cond_a
    move-object v11, v2

    .line 232
    goto :goto_e

    .line 233
    :cond_b
    :goto_a
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 234
    .line 235
    iget-object v4, v0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 236
    .line 237
    iget-object v4, v4, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 238
    .line 239
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 240
    .line 241
    if-eqz v16, :cond_c

    .line 242
    .line 243
    if-eqz p2, :cond_c

    .line 244
    .line 245
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 246
    .line 247
    .line 248
    move-result v5

    .line 249
    if-nez v5, :cond_c

    .line 250
    .line 251
    iget-object v5, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->period:Landroidx/media3/common/m1;

    .line 252
    .line 253
    invoke-virtual {v0, v4, v5}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    iget-boolean v0, v0, Landroidx/media3/common/m1;->f:Z

    .line 258
    .line 259
    if-nez v0, :cond_c

    .line 260
    .line 261
    const/4 v9, 0x1

    .line 262
    goto :goto_b

    .line 263
    :cond_c
    move v9, v15

    .line 264
    :goto_b
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 265
    .line 266
    iget-wide v7, v0, Landroidx/media3/exoplayer/PlaybackInfo;->discontinuityStartPositionUs:J

    .line 267
    .line 268
    invoke-virtual {v2, v4}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    if-ne v0, v14, :cond_d

    .line 273
    .line 274
    move-wide v5, v10

    .line 275
    move/from16 v10, v20

    .line 276
    .line 277
    :goto_c
    move-object v11, v2

    .line 278
    move-object v2, v3

    .line 279
    move-wide v3, v12

    .line 280
    goto :goto_d

    .line 281
    :cond_d
    move-wide v5, v10

    .line 282
    move/from16 v10, v17

    .line 283
    .line 284
    goto :goto_c

    .line 285
    :goto_d
    invoke-direct/range {v1 .. v10}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handlePositionDiscontinuity(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJJZI)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    iput-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 290
    .line 291
    :goto_e
    invoke-direct {v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resetPendingPauseAtEndOfPeriod()V

    .line 292
    .line 293
    .line 294
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 295
    .line 296
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 297
    .line 298
    invoke-direct {v1, v11, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resolvePendingMessagePositions(Landroidx/media3/common/p1;Landroidx/media3/common/p1;)V

    .line 299
    .line 300
    .line 301
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 302
    .line 303
    invoke-virtual {v0, v11}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithTimeline(Landroidx/media3/common/p1;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    iput-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 308
    .line 309
    invoke-virtual {v11}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    if-nez v0, :cond_e

    .line 314
    .line 315
    const/4 v2, 0x0

    .line 316
    iput-object v2, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingInitialSeekPosition:Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;

    .line 317
    .line 318
    :cond_e
    invoke-direct {v1, v15}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleLoadingMediaPeriodChanged(Z)V

    .line 319
    .line 320
    .line 321
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 322
    .line 323
    check-cast v0, Lh1/b0;

    .line 324
    .line 325
    const/4 v2, 0x2

    .line 326
    invoke-virtual {v0, v2}, Lh1/b0;->g(I)Z

    .line 327
    .line 328
    .line 329
    return-void

    .line 330
    :goto_f
    iget-object v2, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 331
    .line 332
    iget-object v4, v2, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 333
    .line 334
    iget-object v5, v2, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 335
    .line 336
    iget-boolean v2, v8, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PositionUpdateForPlaylistChange;->setTargetLiveOffset:Z

    .line 337
    .line 338
    if-eqz v2, :cond_f

    .line 339
    .line 340
    move-wide v6, v12

    .line 341
    goto :goto_10

    .line 342
    :cond_f
    move-wide/from16 v6, v18

    .line 343
    .line 344
    :goto_10
    const/4 v8, 0x0

    .line 345
    move-object v2, v11

    .line 346
    invoke-direct/range {v1 .. v8}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->updatePlaybackSpeedSettingsForNewPeriod(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JZ)V

    .line 347
    .line 348
    .line 349
    if-nez v16, :cond_10

    .line 350
    .line 351
    iget-object v2, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 352
    .line 353
    iget-wide v4, v2, Landroidx/media3/exoplayer/PlaybackInfo;->requestedContentPositionUs:J

    .line 354
    .line 355
    cmp-long v2, v9, v4

    .line 356
    .line 357
    if-eqz v2, :cond_13

    .line 358
    .line 359
    :cond_10
    iget-object v2, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 360
    .line 361
    iget-object v4, v2, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 362
    .line 363
    iget-object v4, v4, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 364
    .line 365
    iget-object v2, v2, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 366
    .line 367
    if-eqz v16, :cond_11

    .line 368
    .line 369
    if-eqz p2, :cond_11

    .line 370
    .line 371
    invoke-virtual {v2}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 372
    .line 373
    .line 374
    move-result v5

    .line 375
    if-nez v5, :cond_11

    .line 376
    .line 377
    iget-object v5, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->period:Landroidx/media3/common/m1;

    .line 378
    .line 379
    invoke-virtual {v2, v4, v5}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    iget-boolean v2, v2, Landroidx/media3/common/m1;->f:Z

    .line 384
    .line 385
    if-nez v2, :cond_11

    .line 386
    .line 387
    move-wide v5, v9

    .line 388
    const/4 v9, 0x1

    .line 389
    goto :goto_11

    .line 390
    :cond_11
    move-wide v5, v9

    .line 391
    move v9, v15

    .line 392
    :goto_11
    iget-object v2, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 393
    .line 394
    iget-wide v7, v2, Landroidx/media3/exoplayer/PlaybackInfo;->discontinuityStartPositionUs:J

    .line 395
    .line 396
    invoke-virtual {v11, v4}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 397
    .line 398
    .line 399
    move-result v2

    .line 400
    if-ne v2, v14, :cond_12

    .line 401
    .line 402
    move/from16 v10, v20

    .line 403
    .line 404
    :goto_12
    move-object v2, v3

    .line 405
    move-wide v3, v12

    .line 406
    goto :goto_13

    .line 407
    :cond_12
    move/from16 v10, v17

    .line 408
    .line 409
    goto :goto_12

    .line 410
    :goto_13
    invoke-direct/range {v1 .. v10}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handlePositionDiscontinuity(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJJZI)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    iput-object v2, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 415
    .line 416
    :cond_13
    invoke-direct {v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resetPendingPauseAtEndOfPeriod()V

    .line 417
    .line 418
    .line 419
    iget-object v2, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 420
    .line 421
    iget-object v2, v2, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 422
    .line 423
    invoke-direct {v1, v11, v2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resolvePendingMessagePositions(Landroidx/media3/common/p1;Landroidx/media3/common/p1;)V

    .line 424
    .line 425
    .line 426
    iget-object v2, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 427
    .line 428
    invoke-virtual {v2, v11}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithTimeline(Landroidx/media3/common/p1;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    iput-object v2, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 433
    .line 434
    invoke-virtual {v11}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 435
    .line 436
    .line 437
    move-result v2

    .line 438
    if-nez v2, :cond_14

    .line 439
    .line 440
    const/4 v2, 0x0

    .line 441
    iput-object v2, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingInitialSeekPosition:Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;

    .line 442
    .line 443
    :cond_14
    invoke-direct {v1, v15}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleLoadingMediaPeriodChanged(Z)V

    .line 444
    .line 445
    .line 446
    iget-object v2, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 447
    .line 448
    check-cast v2, Lh1/b0;

    .line 449
    .line 450
    const/4 v3, 0x2

    .line 451
    invoke-virtual {v2, v3}, Lh1/b0;->g(I)Z

    .line 452
    .line 453
    .line 454
    throw v0
.end method

.method private handlePeriodPrepared(Landroidx/media3/exoplayer/source/MediaPeriod;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->isLoading(Landroidx/media3/exoplayer/source/MediaPeriod;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getLoadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleLoadingPeriodPrepared(Landroidx/media3/exoplayer/MediaPeriodHolder;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPreloadHolderByMediaPeriod(Landroidx/media3/exoplayer/source/MediaPeriod;)Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-boolean v1, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepared:Z

    .line 31
    .line 32
    xor-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    invoke-static {v1}, Lh1/a;->j(Z)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 38
    .line 39
    invoke-virtual {v1}, Landroidx/media3/exoplayer/DefaultMediaClock;->getPlaybackParameters()Landroidx/media3/common/y0;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget v1, v1, Landroidx/media3/common/y0;->a:F

    .line 44
    .line 45
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 46
    .line 47
    iget-object v3, v2, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 48
    .line 49
    iget-boolean v2, v2, Landroidx/media3/exoplayer/PlaybackInfo;->playWhenReady:Z

    .line 50
    .line 51
    invoke-virtual {v0, v1, v3, v2}, Landroidx/media3/exoplayer/MediaPeriodHolder;->handlePrepared(FLandroidx/media3/common/p1;Z)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->isPreloading(Landroidx/media3/exoplayer/source/MediaPeriod;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeContinuePreloading()V

    .line 63
    .line 64
    .line 65
    :cond_1
    return-void
.end method

.method private handlePlaybackParameters(Landroidx/media3/common/y0;FZZ)V
    .locals 3

    if-eqz p3, :cond_1

    if-eqz p4, :cond_0

    .line 2
    iget-object p3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfoUpdate:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;

    const/4 p4, 0x1

    invoke-virtual {p3, p4}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->incrementPendingOperationAcks(I)V

    .line 3
    :cond_0
    iget-object p3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    invoke-virtual {p3, p1}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithPlaybackParameters(Landroidx/media3/common/y0;)Landroidx/media3/exoplayer/PlaybackInfo;

    move-result-object p3

    iput-object p3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 4
    :cond_1
    iget p3, p1, Landroidx/media3/common/y0;->a:F

    invoke-direct {p0, p3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->updateTrackSelectionPlaybackSpeed(F)V

    .line 5
    iget-object p3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    array-length p4, p3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p4, :cond_3

    aget-object v1, p3, v0

    if-eqz v1, :cond_2

    .line 6
    iget v2, p1, Landroidx/media3/common/y0;->a:F

    invoke-interface {v1, p2, v2}, Landroidx/media3/exoplayer/Renderer;->setPlaybackSpeed(FF)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method private handlePlaybackParameters(Landroidx/media3/common/y0;Z)V
    .locals 2

    .line 1
    iget v0, p1, Landroidx/media3/common/y0;->a:F

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1, p2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handlePlaybackParameters(Landroidx/media3/common/y0;FZZ)V

    return-void
.end method

.method private handlePositionDiscontinuity(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJJZI)Landroidx/media3/exoplayer/PlaybackInfo;
    .locals 13

    .line 1
    move-wide/from16 v4, p4

    .line 2
    .line 3
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->deliverPendingMessageAtStartPositionRequired:Z

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 8
    .line 9
    iget-wide v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 10
    .line 11
    cmp-long v0, p2, v0

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 16
    .line 17
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 29
    :goto_1
    iput-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->deliverPendingMessageAtStartPositionRequired:Z

    .line 30
    .line 31
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resetPendingPauseAtEndOfPeriod()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 35
    .line 36
    iget-object v1, v0, Landroidx/media3/exoplayer/PlaybackInfo;->trackGroups:Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 37
    .line 38
    iget-object v2, v0, Landroidx/media3/exoplayer/PlaybackInfo;->trackSelectorResult:Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 39
    .line 40
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->staticMetadata:Ljava/util/List;

    .line 41
    .line 42
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaSourceList:Landroidx/media3/exoplayer/MediaSourceList;

    .line 43
    .line 44
    invoke-virtual {v3}, Landroidx/media3/exoplayer/MediaSourceList;->isPrepared()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_5

    .line 49
    .line 50
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 51
    .line 52
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    sget-object v1, Landroidx/media3/exoplayer/source/TrackGroupArray;->EMPTY:Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getTrackGroups()Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    :goto_2
    if-nez v0, :cond_3

    .line 66
    .line 67
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->emptyTrackSelectorResult:Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getTrackSelectorResult()Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    :goto_3
    iget-object v3, v2, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->selections:[Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;

    .line 75
    .line 76
    invoke-direct {p0, v3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->extractMetadataFromTrackSelectionArray([Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;)Lf6/m0;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    iget-object v6, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 83
    .line 84
    iget-wide v7, v6, Landroidx/media3/exoplayer/MediaPeriodInfo;->requestedContentPositionUs:J

    .line 85
    .line 86
    cmp-long v7, v7, v4

    .line 87
    .line 88
    if-eqz v7, :cond_4

    .line 89
    .line 90
    invoke-virtual {v6, v4, v5}, Landroidx/media3/exoplayer/MediaPeriodInfo;->copyWithRequestedContentPositionUs(J)Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    iput-object v6, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 95
    .line 96
    :cond_4
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeUpdateOffloadScheduling()V

    .line 97
    .line 98
    .line 99
    move-object v10, v1

    .line 100
    move-object v11, v2

    .line 101
    move-object v12, v3

    .line 102
    goto :goto_4

    .line 103
    :cond_5
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 104
    .line 105
    iget-object v3, v3, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 106
    .line 107
    invoke-virtual {p1, v3}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-nez v3, :cond_6

    .line 112
    .line 113
    sget-object v1, Landroidx/media3/exoplayer/source/TrackGroupArray;->EMPTY:Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 114
    .line 115
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->emptyTrackSelectorResult:Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 116
    .line 117
    sget-object v0, Lf6/m0;->k:Lf6/k0;

    .line 118
    .line 119
    sget-object v0, Lf6/l1;->n:Lf6/l1;

    .line 120
    .line 121
    :cond_6
    move-object v12, v0

    .line 122
    move-object v10, v1

    .line 123
    move-object v11, v2

    .line 124
    :goto_4
    if-eqz p8, :cond_7

    .line 125
    .line 126
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfoUpdate:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;

    .line 127
    .line 128
    move/from16 v1, p9

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->setPositionDiscontinuity(I)V

    .line 131
    .line 132
    .line 133
    :cond_7
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 134
    .line 135
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->getTotalBufferedDurationUs()J

    .line 136
    .line 137
    .line 138
    move-result-wide v8

    .line 139
    move-object v1, p1

    .line 140
    move-wide v2, p2

    .line 141
    move-wide/from16 v6, p6

    .line 142
    .line 143
    invoke-virtual/range {v0 .. v12}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithNewPosition(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJJJLandroidx/media3/exoplayer/source/TrackGroupArray;Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;Ljava/util/List;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    return-object p1
.end method

.method private hasReachedServerSideInsertedAdsTransition(Landroidx/media3/exoplayer/Renderer;Landroidx/media3/exoplayer/MediaPeriodHolder;)Z
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p2, p2, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 6
    .line 7
    iget-boolean p2, p2, Landroidx/media3/exoplayer/MediaPeriodInfo;->isFollowedByTransitionToSameStream:Z

    .line 8
    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    iget-boolean p2, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepared:Z

    .line 12
    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    instance-of p2, p1, Landroidx/media3/exoplayer/text/TextRenderer;

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    instance-of p2, p1, Landroidx/media3/exoplayer/metadata/MetadataRenderer;

    .line 20
    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    invoke-interface {p1}, Landroidx/media3/exoplayer/Renderer;->getReadingPositionUs()J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getStartPositionRendererTime()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    cmp-long p1, p1, v0

    .line 32
    .line 33
    if-ltz p1, :cond_1

    .line 34
    .line 35
    :cond_0
    const/4 p1, 0x1

    .line 36
    return p1

    .line 37
    :cond_1
    const/4 p1, 0x0

    .line 38
    return p1
.end method

.method private hasReadingPeriodFinishedReading()Z
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getReadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v1, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepared:Z

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    move v1, v2

    .line 14
    :goto_0
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 15
    .line 16
    array-length v4, v3

    .line 17
    if-ge v1, v4, :cond_3

    .line 18
    .line 19
    aget-object v3, v3, v1

    .line 20
    .line 21
    iget-object v4, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->sampleStreams:[Landroidx/media3/exoplayer/source/SampleStream;

    .line 22
    .line 23
    aget-object v4, v4, v1

    .line 24
    .line 25
    invoke-interface {v3}, Landroidx/media3/exoplayer/Renderer;->getStream()Landroidx/media3/exoplayer/source/SampleStream;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    if-ne v5, v4, :cond_2

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    invoke-interface {v3}, Landroidx/media3/exoplayer/Renderer;->hasReadStreamToEnd()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-nez v4, :cond_1

    .line 38
    .line 39
    invoke-direct {p0, v3, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->hasReachedServerSideInsertedAdsTransition(Landroidx/media3/exoplayer/Renderer;Landroidx/media3/exoplayer/MediaPeriodHolder;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-nez v3, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    :goto_1
    return v2

    .line 50
    :cond_3
    const/4 v0, 0x1

    .line 51
    return v0
.end method

.method private static isIgnorableServerSideAdInsertionPeriodChange(ZLandroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JLandroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;Landroidx/media3/common/m1;J)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_3

    .line 3
    .line 4
    cmp-long p0, p2, p6

    .line 5
    .line 6
    if-nez p0, :cond_3

    .line 7
    .line 8
    iget-object p0, p1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p2, p4, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {p0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p1}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    const/4 p2, 0x1

    .line 24
    if-eqz p0, :cond_2

    .line 25
    .line 26
    iget p0, p1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 27
    .line 28
    invoke-virtual {p5, p0}, Landroidx/media3/common/m1;->h(I)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    iget p0, p1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 35
    .line 36
    iget p3, p1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adIndexInAdGroup:I

    .line 37
    .line 38
    invoke-virtual {p5, p0, p3}, Landroidx/media3/common/m1;->e(II)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    const/4 p3, 0x4

    .line 43
    if-eq p0, p3, :cond_1

    .line 44
    .line 45
    iget p0, p1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 46
    .line 47
    iget p1, p1, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adIndexInAdGroup:I

    .line 48
    .line 49
    invoke-virtual {p5, p0, p1}, Landroidx/media3/common/m1;->e(II)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    const/4 p1, 0x2

    .line 54
    if-eq p0, p1, :cond_1

    .line 55
    .line 56
    return p2

    .line 57
    :cond_1
    return v0

    .line 58
    :cond_2
    invoke-virtual {p4}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_3

    .line 63
    .line 64
    iget p0, p4, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 65
    .line 66
    invoke-virtual {p5, p0}, Landroidx/media3/common/m1;->h(I)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-eqz p0, :cond_3

    .line 71
    .line 72
    return p2

    .line 73
    :cond_3
    :goto_0
    return v0
.end method

.method private isLoadingPossible(Landroidx/media3/exoplayer/MediaPeriodHolder;)Z
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->hasLoadingError()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNextLoadPositionUs()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/high16 v2, -0x8000000000000000L

    .line 14
    .line 15
    cmp-long p1, v0, v2

    .line 16
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

.method private static isRendererEnabled(Landroidx/media3/exoplayer/Renderer;)Z
    .locals 0

    .line 1
    invoke-interface {p0}, Landroidx/media3/exoplayer/Renderer;->getState()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method private isTimelineReady()Z
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 8
    .line 9
    iget-wide v1, v1, Landroidx/media3/exoplayer/MediaPeriodInfo;->durationUs:J

    .line 10
    .line 11
    iget-boolean v0, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepared:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmp-long v0, v1, v3

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 25
    .line 26
    iget-wide v3, v0, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 27
    .line 28
    cmp-long v0, v3, v1

    .line 29
    .line 30
    if-ltz v0, :cond_0

    .line 31
    .line 32
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shouldPlayWhenReady()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    :cond_0
    const/4 v0, 0x1

    .line 39
    return v0

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    return v0
.end method

.method private static isUsingPlaceholderPeriod(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/m1;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget-object v0, v0, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {p0, v0, p1}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    iget-boolean p0, p0, Landroidx/media3/common/m1;->f:Z

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 25
    return p0
.end method

.method private synthetic lambda$maybeTriggerOnRendererReadyChanged$1(IZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->analyticsCollector:Landroidx/media3/exoplayer/analytics/AnalyticsCollector;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 4
    .line 5
    aget-object v1, v1, p1

    .line 6
    .line 7
    invoke-interface {v1}, Landroidx/media3/exoplayer/Renderer;->getTrackType()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-interface {v0, p1, v1, p2}, Landroidx/media3/exoplayer/analytics/AnalyticsCollector;->onRendererReadyChanged(IIZ)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private synthetic lambda$release$0()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->released:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private synthetic lambda$sendMessageToTargetThread$2(Landroidx/media3/exoplayer/PlayerMessage;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->deliverMessage(Landroidx/media3/exoplayer/PlayerMessage;)V
    :try_end_0
    .catch Landroidx/media3/exoplayer/ExoPlaybackException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception p1

    .line 6
    const-string v0, "ExoPlayerImplInternal"

    .line 7
    .line 8
    const-string v1, "Unexpected error delivering message on external thread."

    .line 9
    .line 10
    invoke-static {v0, v1, p1}, Lh1/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Ljava/lang/RuntimeException;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method private maybeContinueLoading()V
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shouldContinueLoading()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shouldContinueLoading:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getLoadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v1, Landroidx/media3/exoplayer/LoadingInfo$Builder;

    .line 19
    .line 20
    invoke-direct {v1}, Landroidx/media3/exoplayer/LoadingInfo$Builder;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-wide v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J

    .line 24
    .line 25
    invoke-virtual {v0, v2, v3}, Landroidx/media3/exoplayer/MediaPeriodHolder;->toPeriodTime(J)J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/LoadingInfo$Builder;->setPlaybackPositionUs(J)Landroidx/media3/exoplayer/LoadingInfo$Builder;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 34
    .line 35
    invoke-virtual {v2}, Landroidx/media3/exoplayer/DefaultMediaClock;->getPlaybackParameters()Landroidx/media3/common/y0;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget v2, v2, Landroidx/media3/common/y0;->a:F

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/LoadingInfo$Builder;->setPlaybackSpeed(F)Landroidx/media3/exoplayer/LoadingInfo$Builder;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-wide v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->lastRebufferRealtimeMs:J

    .line 46
    .line 47
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/LoadingInfo$Builder;->setLastRebufferRealtimeMs(J)Landroidx/media3/exoplayer/LoadingInfo$Builder;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Landroidx/media3/exoplayer/LoadingInfo$Builder;->build()Landroidx/media3/exoplayer/LoadingInfo;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->continueLoading(Landroidx/media3/exoplayer/LoadingInfo;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->updateIsLoading()V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method private maybeContinuePreloading()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->maybeUpdatePreloadMediaPeriodHolder()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPreloadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    iget-boolean v1, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepareCalled:Z

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-boolean v1, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepared:Z

    .line 19
    .line 20
    if-eqz v1, :cond_4

    .line 21
    .line 22
    :cond_0
    iget-object v1, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->mediaPeriod:Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 23
    .line 24
    invoke-interface {v1}, Landroidx/media3/exoplayer/source/MediaPeriod;->isLoading()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_4

    .line 29
    .line 30
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->loadControl:Landroidx/media3/exoplayer/LoadControl;

    .line 31
    .line 32
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 33
    .line 34
    iget-object v2, v2, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 35
    .line 36
    iget-object v3, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 37
    .line 38
    iget-object v3, v3, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 39
    .line 40
    iget-boolean v4, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepared:Z

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    iget-object v4, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->mediaPeriod:Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 45
    .line 46
    invoke-interface {v4}, Landroidx/media3/exoplayer/source/MediaPeriod;->getBufferedPositionUs()J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const-wide/16 v4, 0x0

    .line 52
    .line 53
    :goto_0
    invoke-interface {v1, v2, v3, v4, v5}, Landroidx/media3/exoplayer/LoadControl;->shouldContinuePreloading(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;J)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    iget-boolean v1, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepareCalled:Z

    .line 61
    .line 62
    if-nez v1, :cond_3

    .line 63
    .line 64
    iget-object v1, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 65
    .line 66
    iget-wide v1, v1, Landroidx/media3/exoplayer/MediaPeriodInfo;->startPositionUs:J

    .line 67
    .line 68
    invoke-virtual {v0, p0, v1, v2}, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepare(Landroidx/media3/exoplayer/source/MediaPeriod$Callback;J)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_3
    new-instance v1, Landroidx/media3/exoplayer/LoadingInfo$Builder;

    .line 73
    .line 74
    invoke-direct {v1}, Landroidx/media3/exoplayer/LoadingInfo$Builder;-><init>()V

    .line 75
    .line 76
    .line 77
    iget-wide v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J

    .line 78
    .line 79
    invoke-virtual {v0, v2, v3}, Landroidx/media3/exoplayer/MediaPeriodHolder;->toPeriodTime(J)J

    .line 80
    .line 81
    .line 82
    move-result-wide v2

    .line 83
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/LoadingInfo$Builder;->setPlaybackPositionUs(J)Landroidx/media3/exoplayer/LoadingInfo$Builder;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 88
    .line 89
    invoke-virtual {v2}, Landroidx/media3/exoplayer/DefaultMediaClock;->getPlaybackParameters()Landroidx/media3/common/y0;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    iget v2, v2, Landroidx/media3/common/y0;->a:F

    .line 94
    .line 95
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/LoadingInfo$Builder;->setPlaybackSpeed(F)Landroidx/media3/exoplayer/LoadingInfo$Builder;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iget-wide v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->lastRebufferRealtimeMs:J

    .line 100
    .line 101
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/LoadingInfo$Builder;->setLastRebufferRealtimeMs(J)Landroidx/media3/exoplayer/LoadingInfo$Builder;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v1}, Landroidx/media3/exoplayer/LoadingInfo$Builder;->build()Landroidx/media3/exoplayer/LoadingInfo;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->continueLoading(Landroidx/media3/exoplayer/LoadingInfo;)V

    .line 110
    .line 111
    .line 112
    :cond_4
    :goto_1
    return-void
.end method

.method private maybeNotifyPlaybackInfoChanged()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfoUpdate:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->setPlaybackInfo(Landroidx/media3/exoplayer/PlaybackInfo;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfoUpdate:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;

    .line 9
    .line 10
    invoke-static {v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->access$100(Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfoUpdateListener:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdateListener;

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfoUpdate:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;

    .line 19
    .line 20
    invoke-interface {v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdateListener;->onPlaybackInfoUpdate(Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;

    .line 24
    .line 25
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 26
    .line 27
    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;-><init>(Landroidx/media3/exoplayer/PlaybackInfo;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfoUpdate:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;

    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method private maybeThrowRendererStreamError(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    :try_start_0
    invoke-interface {v0}, Landroidx/media3/exoplayer/Renderer;->maybeThrowStreamError()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catch_0
    move-exception v1

    .line 10
    goto :goto_0

    .line 11
    :catch_1
    move-exception v1

    .line 12
    :goto_0
    invoke-interface {v0}, Landroidx/media3/exoplayer/Renderer;->getTrackType()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x3

    .line 17
    if-eq v0, v2, :cond_1

    .line 18
    .line 19
    const/4 v2, 0x5

    .line 20
    if-ne v0, v2, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    throw v1

    .line 24
    :cond_1
    :goto_1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getTrackSelectorResult()Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v2, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v3, "Disabling track due to error: "

    .line 37
    .line 38
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v3, v0, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->selections:[Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;

    .line 42
    .line 43
    aget-object v3, v3, p1

    .line 44
    .line 45
    invoke-interface {v3}, Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;->getSelectedFormat()Landroidx/media3/common/w;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-static {v3}, Landroidx/media3/common/w;->e(Landroidx/media3/common/w;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v3, "ExoPlayerImplInternal"

    .line 61
    .line 62
    invoke-static {v3, v2, v1}, Lh1/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    new-instance v1, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 66
    .line 67
    iget-object v2, v0, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->rendererConfigurations:[Landroidx/media3/exoplayer/RendererConfiguration;

    .line 68
    .line 69
    invoke-virtual {v2}, [Landroidx/media3/exoplayer/RendererConfiguration;->clone()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, [Landroidx/media3/exoplayer/RendererConfiguration;

    .line 74
    .line 75
    iget-object v3, v0, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->selections:[Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;

    .line 76
    .line 77
    invoke-virtual {v3}, [Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;->clone()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    check-cast v3, [Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;

    .line 82
    .line 83
    iget-object v4, v0, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->tracks:Landroidx/media3/common/x1;

    .line 84
    .line 85
    iget-object v0, v0, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->info:Ljava/lang/Object;

    .line 86
    .line 87
    invoke-direct {v1, v2, v3, v4, v0}, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;-><init>([Landroidx/media3/exoplayer/RendererConfiguration;[Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;Landroidx/media3/common/x1;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, v1, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->rendererConfigurations:[Landroidx/media3/exoplayer/RendererConfiguration;

    .line 91
    .line 92
    const/4 v2, 0x0

    .line 93
    aput-object v2, v0, p1

    .line 94
    .line 95
    iget-object v0, v1, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->selections:[Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;

    .line 96
    .line 97
    aput-object v2, v0, p1

    .line 98
    .line 99
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->disableRenderer(I)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 103
    .line 104
    invoke-virtual {p1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 109
    .line 110
    iget-wide v2, v0, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 111
    .line 112
    const/4 v0, 0x0

    .line 113
    invoke-virtual {p1, v1, v2, v3, v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->applyTrackSelection(Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;JZ)J

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method private maybeTriggerOnRendererReadyChanged(IZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererReportedReady:[Z

    .line 2
    .line 3
    aget-boolean v1, v0, p1

    .line 4
    .line 5
    if-eq v1, p2, :cond_0

    .line 6
    .line 7
    aput-boolean p2, v0, p1

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->applicationLooperHandler:Lh1/k;

    .line 10
    .line 11
    new-instance v1, Landroidx/media3/exoplayer/x;

    .line 12
    .line 13
    invoke-direct {v1, p0, p1, p2}, Landroidx/media3/exoplayer/x;-><init>(Landroidx/media3/exoplayer/ExoPlayerImplInternal;IZ)V

    .line 14
    .line 15
    .line 16
    check-cast v0, Lh1/b0;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lh1/b0;->e(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method private maybeTriggerPendingMessages(JJ)V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingMessages:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_f

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 10
    .line 11
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto/16 :goto_6

    .line 20
    .line 21
    :cond_0
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->deliverPendingMessageAtStartPositionRequired:Z

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const-wide/16 v0, 0x1

    .line 26
    .line 27
    sub-long/2addr p1, v0

    .line 28
    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->deliverPendingMessageAtStartPositionRequired:Z

    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 32
    .line 33
    iget-object v1, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 34
    .line 35
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 36
    .line 37
    iget-object v0, v0, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->nextPendingMessageIndexHint:I

    .line 44
    .line 45
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingMessages:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    const/4 v2, 0x0

    .line 56
    if-lez v1, :cond_2

    .line 57
    .line 58
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingMessages:Ljava/util/ArrayList;

    .line 59
    .line 60
    add-int/lit8 v4, v1, -0x1

    .line 61
    .line 62
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move-object v3, v2

    .line 70
    :goto_0
    if-eqz v3, :cond_5

    .line 71
    .line 72
    iget v4, v3, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->resolvedPeriodIndex:I

    .line 73
    .line 74
    if-gt v4, v0, :cond_3

    .line 75
    .line 76
    if-ne v4, v0, :cond_5

    .line 77
    .line 78
    iget-wide v3, v3, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->resolvedPeriodTimeUs:J

    .line 79
    .line 80
    cmp-long v3, v3, p1

    .line 81
    .line 82
    if-lez v3, :cond_5

    .line 83
    .line 84
    :cond_3
    add-int/lit8 v3, v1, -0x1

    .line 85
    .line 86
    if-lez v3, :cond_4

    .line 87
    .line 88
    iget-object v4, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingMessages:Ljava/util/ArrayList;

    .line 89
    .line 90
    add-int/lit8 v1, v1, -0x2

    .line 91
    .line 92
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    move-object v1, v2

    .line 100
    :goto_1
    move v7, v3

    .line 101
    move-object v3, v1

    .line 102
    move v1, v7

    .line 103
    goto :goto_0

    .line 104
    :cond_5
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingMessages:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-ge v1, v3, :cond_6

    .line 111
    .line 112
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingMessages:Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    check-cast v3, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_6
    move-object v3, v2

    .line 122
    :goto_2
    if-eqz v3, :cond_8

    .line 123
    .line 124
    iget-object v4, v3, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->resolvedPeriodUid:Ljava/lang/Object;

    .line 125
    .line 126
    if-eqz v4, :cond_8

    .line 127
    .line 128
    iget v4, v3, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->resolvedPeriodIndex:I

    .line 129
    .line 130
    if-lt v4, v0, :cond_7

    .line 131
    .line 132
    if-ne v4, v0, :cond_8

    .line 133
    .line 134
    iget-wide v4, v3, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->resolvedPeriodTimeUs:J

    .line 135
    .line 136
    cmp-long v4, v4, p1

    .line 137
    .line 138
    if-gtz v4, :cond_8

    .line 139
    .line 140
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 141
    .line 142
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingMessages:Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-ge v1, v3, :cond_6

    .line 149
    .line 150
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingMessages:Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    check-cast v3, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_8
    :goto_3
    if-eqz v3, :cond_e

    .line 160
    .line 161
    iget-object v4, v3, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->resolvedPeriodUid:Ljava/lang/Object;

    .line 162
    .line 163
    if-eqz v4, :cond_e

    .line 164
    .line 165
    iget v4, v3, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->resolvedPeriodIndex:I

    .line 166
    .line 167
    if-ne v4, v0, :cond_e

    .line 168
    .line 169
    iget-wide v4, v3, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->resolvedPeriodTimeUs:J

    .line 170
    .line 171
    cmp-long v6, v4, p1

    .line 172
    .line 173
    if-lez v6, :cond_e

    .line 174
    .line 175
    cmp-long v4, v4, p3

    .line 176
    .line 177
    if-gtz v4, :cond_e

    .line 178
    .line 179
    :try_start_0
    iget-object v4, v3, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->message:Landroidx/media3/exoplayer/PlayerMessage;

    .line 180
    .line 181
    invoke-direct {p0, v4}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->sendMessageToTarget(Landroidx/media3/exoplayer/PlayerMessage;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    .line 183
    .line 184
    iget-object v4, v3, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->message:Landroidx/media3/exoplayer/PlayerMessage;

    .line 185
    .line 186
    invoke-virtual {v4}, Landroidx/media3/exoplayer/PlayerMessage;->getDeleteAfterDelivery()Z

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    if-nez v4, :cond_a

    .line 191
    .line 192
    iget-object v3, v3, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->message:Landroidx/media3/exoplayer/PlayerMessage;

    .line 193
    .line 194
    invoke-virtual {v3}, Landroidx/media3/exoplayer/PlayerMessage;->isCanceled()Z

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    if-eqz v3, :cond_9

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_9
    add-int/lit8 v1, v1, 0x1

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_a
    :goto_4
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingMessages:Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    :goto_5
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingMessages:Ljava/util/ArrayList;

    .line 210
    .line 211
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-ge v1, v3, :cond_b

    .line 216
    .line 217
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingMessages:Ljava/util/ArrayList;

    .line 218
    .line 219
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    check-cast v3, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_b
    move-object v3, v2

    .line 227
    goto :goto_3

    .line 228
    :catchall_0
    move-exception p1

    .line 229
    iget-object p2, v3, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->message:Landroidx/media3/exoplayer/PlayerMessage;

    .line 230
    .line 231
    invoke-virtual {p2}, Landroidx/media3/exoplayer/PlayerMessage;->getDeleteAfterDelivery()Z

    .line 232
    .line 233
    .line 234
    move-result p2

    .line 235
    if-nez p2, :cond_c

    .line 236
    .line 237
    iget-object p2, v3, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->message:Landroidx/media3/exoplayer/PlayerMessage;

    .line 238
    .line 239
    invoke-virtual {p2}, Landroidx/media3/exoplayer/PlayerMessage;->isCanceled()Z

    .line 240
    .line 241
    .line 242
    move-result p2

    .line 243
    if-eqz p2, :cond_d

    .line 244
    .line 245
    :cond_c
    iget-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingMessages:Ljava/util/ArrayList;

    .line 246
    .line 247
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    :cond_d
    throw p1

    .line 251
    :cond_e
    iput v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->nextPendingMessageIndexHint:I

    .line 252
    .line 253
    :cond_f
    :goto_6
    return-void
.end method

.method private maybeUpdateLoadingPeriod()Z
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    .line 3
    iget-wide v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->reevaluateBuffer(J)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->shouldLoadNextMediaPeriod()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 18
    .line 19
    iget-wide v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J

    .line 20
    .line 21
    iget-object v4, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 22
    .line 23
    invoke-virtual {v0, v2, v3, v4}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getNextMediaPeriodInfo(JLandroidx/media3/exoplayer/PlaybackInfo;)Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->enqueueNextMediaPeriodHolder(Landroidx/media3/exoplayer/MediaPeriodInfo;)Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-boolean v3, v2, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepareCalled:Z

    .line 36
    .line 37
    if-nez v3, :cond_0

    .line 38
    .line 39
    iget-wide v3, v0, Landroidx/media3/exoplayer/MediaPeriodInfo;->startPositionUs:J

    .line 40
    .line 41
    invoke-virtual {v2, p0, v3, v4}, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepare(Landroidx/media3/exoplayer/source/MediaPeriod$Callback;J)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iget-boolean v3, v2, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepared:Z

    .line 46
    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 50
    .line 51
    iget-object v4, v2, Landroidx/media3/exoplayer/MediaPeriodHolder;->mediaPeriod:Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 52
    .line 53
    check-cast v3, Lh1/b0;

    .line 54
    .line 55
    const/16 v5, 0x8

    .line 56
    .line 57
    invoke-virtual {v3, v5, v4}, Lh1/b0;->c(ILjava/lang/Object;)Lh1/a0;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v3}, Lh1/a0;->b()V

    .line 62
    .line 63
    .line 64
    :cond_1
    :goto_0
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 65
    .line 66
    invoke-virtual {v3}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    if-ne v3, v2, :cond_2

    .line 71
    .line 72
    iget-wide v2, v0, Landroidx/media3/exoplayer/MediaPeriodInfo;->startPositionUs:J

    .line 73
    .line 74
    invoke-direct {p0, v2, v3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resetRendererPosition(J)V

    .line 75
    .line 76
    .line 77
    :cond_2
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleLoadingMediaPeriodChanged(Z)V

    .line 78
    .line 79
    .line 80
    const/4 v1, 0x1

    .line 81
    :cond_3
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shouldContinueLoading:Z

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 86
    .line 87
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getLoadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isLoadingPossible(Landroidx/media3/exoplayer/MediaPeriodHolder;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    iput-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shouldContinueLoading:Z

    .line 96
    .line 97
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->updateIsLoading()V

    .line 98
    .line 99
    .line 100
    return v1

    .line 101
    :cond_4
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeContinueLoading()V

    .line 102
    .line 103
    .line 104
    return v1
.end method

.method private maybeUpdateOffloadScheduling()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getTrackSelectorResult()Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    move v3, v2

    .line 16
    :goto_0
    iget-object v4, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 17
    .line 18
    array-length v4, v4

    .line 19
    const/4 v5, 0x1

    .line 20
    if-ge v2, v4, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->isRendererEnabled(I)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    iget-object v4, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 29
    .line 30
    aget-object v4, v4, v2

    .line 31
    .line 32
    invoke-interface {v4}, Landroidx/media3/exoplayer/Renderer;->getTrackType()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eq v4, v5, :cond_0

    .line 37
    .line 38
    move v0, v1

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    iget-object v4, v0, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->rendererConfigurations:[Landroidx/media3/exoplayer/RendererConfiguration;

    .line 41
    .line 42
    aget-object v4, v4, v2

    .line 43
    .line 44
    iget v4, v4, Landroidx/media3/exoplayer/RendererConfiguration;->offloadModePreferred:I

    .line 45
    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    move v3, v5

    .line 49
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    move v0, v5

    .line 53
    :goto_1
    if-eqz v3, :cond_3

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    move v1, v5

    .line 58
    :cond_3
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setOffloadSchedulingEnabled(Z)V

    .line 59
    .line 60
    .line 61
    :cond_4
    return-void
.end method

.method private maybeUpdatePlayingPeriod()V
    .locals 14

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shouldAdvancePlayingPeriod()Z

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-eqz v2, :cond_3

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeNotifyPlaybackInfoChanged()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 15
    .line 16
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->advancePlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 24
    .line 25
    iget-object v2, v2, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 26
    .line 27
    iget-object v2, v2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v3, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 30
    .line 31
    iget-object v3, v3, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 32
    .line 33
    iget-object v3, v3, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const/4 v3, 0x1

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 43
    .line 44
    iget-object v2, v2, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 45
    .line 46
    iget v4, v2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 47
    .line 48
    const/4 v5, -0x1

    .line 49
    if-ne v4, v5, :cond_1

    .line 50
    .line 51
    iget-object v4, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 52
    .line 53
    iget-object v4, v4, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 54
    .line 55
    iget v6, v4, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 56
    .line 57
    if-ne v6, v5, :cond_1

    .line 58
    .line 59
    iget v2, v2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->nextAdGroupIndex:I

    .line 60
    .line 61
    iget v4, v4, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->nextAdGroupIndex:I

    .line 62
    .line 63
    if-eq v2, v4, :cond_1

    .line 64
    .line 65
    move v2, v3

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    move v2, v0

    .line 68
    :goto_1
    iget-object v1, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 69
    .line 70
    iget-object v5, v1, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 71
    .line 72
    iget-wide v6, v1, Landroidx/media3/exoplayer/MediaPeriodInfo;->startPositionUs:J

    .line 73
    .line 74
    iget-wide v8, v1, Landroidx/media3/exoplayer/MediaPeriodInfo;->requestedContentPositionUs:J

    .line 75
    .line 76
    xor-int/lit8 v12, v2, 0x1

    .line 77
    .line 78
    const/4 v13, 0x0

    .line 79
    move-wide v10, v6

    .line 80
    move-object v4, p0

    .line 81
    invoke-direct/range {v4 .. v13}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handlePositionDiscontinuity(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJJZI)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iput-object v1, v4, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 86
    .line 87
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resetPendingPauseAtEndOfPeriod()V

    .line 88
    .line 89
    .line 90
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->updatePlaybackPositions()V

    .line 91
    .line 92
    .line 93
    iget-object v1, v4, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 94
    .line 95
    iget v1, v1, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 96
    .line 97
    const/4 v2, 0x3

    .line 98
    if-ne v1, v2, :cond_2

    .line 99
    .line 100
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->startRenderers()V

    .line 101
    .line 102
    .line 103
    :cond_2
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->allowRenderersToRenderStartOfStreams()V

    .line 104
    .line 105
    .line 106
    move v1, v3

    .line 107
    goto :goto_0

    .line 108
    :cond_3
    move-object v4, p0

    .line 109
    return-void
.end method

.method private maybeUpdatePreloadPeriods(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->preloadConfiguration:Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;

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
    if-nez v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    if-nez p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 18
    .line 19
    iget-object p1, p1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->lastPreloadPoolInvalidationTimeline:Landroidx/media3/common/p1;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroidx/media3/common/p1;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_2

    .line 28
    .line 29
    :cond_1
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 30
    .line 31
    iget-object p1, p1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 32
    .line 33
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->lastPreloadPoolInvalidationTimeline:Landroidx/media3/common/p1;

    .line 34
    .line 35
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->invalidatePreloadPool(Landroidx/media3/common/p1;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeContinuePreloading()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method private maybeUpdateReadingPeriod()V
    .locals 14

    .line 1
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    .line 3
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getReadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_5

    .line 10
    .line 11
    :cond_0
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    const/4 v10, 0x0

    .line 21
    if-eqz v2, :cond_8

    .line 22
    .line 23
    iget-boolean v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingPauseAtEndOfPeriod:Z

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :cond_1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->hasReadingPeriodFinishedReading()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    goto/16 :goto_5

    .line 36
    .line 37
    :cond_2
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iget-boolean v2, v2, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepared:Z

    .line 42
    .line 43
    if-nez v2, :cond_3

    .line 44
    .line 45
    iget-wide v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J

    .line 46
    .line 47
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v4}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getStartPositionRendererTime()J

    .line 52
    .line 53
    .line 54
    move-result-wide v4

    .line 55
    cmp-long v2, v2, v4

    .line 56
    .line 57
    if-gez v2, :cond_3

    .line 58
    .line 59
    goto/16 :goto_5

    .line 60
    .line 61
    :cond_3
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getTrackSelectorResult()Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 62
    .line 63
    .line 64
    move-result-object v11

    .line 65
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 66
    .line 67
    invoke-virtual {v2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->advanceReadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 68
    .line 69
    .line 70
    move-result-object v12

    .line 71
    invoke-virtual {v12}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getTrackSelectorResult()Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 72
    .line 73
    .line 74
    move-result-object v13

    .line 75
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 76
    .line 77
    iget-object v2, v2, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 78
    .line 79
    iget-object v3, v12, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 80
    .line 81
    iget-object v3, v3, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 82
    .line 83
    iget-object v1, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 84
    .line 85
    iget-object v4, v1, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 86
    .line 87
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    const/4 v7, 0x0

    .line 93
    move-object v1, v2

    .line 94
    move-object v2, v3

    .line 95
    move-object v3, v1

    .line 96
    move-object v0, p0

    .line 97
    invoke-direct/range {v0 .. v7}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->updatePlaybackSpeedSettingsForNewPeriod(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JZ)V

    .line 98
    .line 99
    .line 100
    iget-boolean v1, v12, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepared:Z

    .line 101
    .line 102
    if-eqz v1, :cond_4

    .line 103
    .line 104
    iget-object v1, v12, Landroidx/media3/exoplayer/MediaPeriodHolder;->mediaPeriod:Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 105
    .line 106
    invoke-interface {v1}, Landroidx/media3/exoplayer/source/MediaPeriod;->readDiscontinuity()J

    .line 107
    .line 108
    .line 109
    move-result-wide v1

    .line 110
    cmp-long v1, v1, v8

    .line 111
    .line 112
    if-eqz v1, :cond_4

    .line 113
    .line 114
    invoke-virtual {v12}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getStartPositionRendererTime()J

    .line 115
    .line 116
    .line 117
    move-result-wide v1

    .line 118
    invoke-direct {p0, v1, v2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setAllRendererStreamsFinal(J)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12}, Landroidx/media3/exoplayer/MediaPeriodHolder;->isFullyBuffered()Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-nez v1, :cond_c

    .line 126
    .line 127
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 128
    .line 129
    invoke-virtual {v1, v12}, Landroidx/media3/exoplayer/MediaPeriodQueue;->removeAfter(Landroidx/media3/exoplayer/MediaPeriodHolder;)Z

    .line 130
    .line 131
    .line 132
    invoke-direct {p0, v10}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleLoadingMediaPeriodChanged(Z)V

    .line 133
    .line 134
    .line 135
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeContinueLoading()V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_4
    move v1, v10

    .line 140
    :goto_0
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 141
    .line 142
    array-length v2, v2

    .line 143
    if-ge v1, v2, :cond_c

    .line 144
    .line 145
    invoke-virtual {v11, v1}, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->isRendererEnabled(I)Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    invoke-virtual {v13, v1}, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->isRendererEnabled(I)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-eqz v2, :cond_7

    .line 154
    .line 155
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 156
    .line 157
    aget-object v2, v2, v1

    .line 158
    .line 159
    invoke-interface {v2}, Landroidx/media3/exoplayer/Renderer;->isCurrentStreamFinal()Z

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    if-nez v2, :cond_7

    .line 164
    .line 165
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererCapabilities:[Landroidx/media3/exoplayer/RendererCapabilities;

    .line 166
    .line 167
    aget-object v2, v2, v1

    .line 168
    .line 169
    invoke-interface {v2}, Landroidx/media3/exoplayer/RendererCapabilities;->getTrackType()I

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    const/4 v4, -0x2

    .line 174
    if-ne v2, v4, :cond_5

    .line 175
    .line 176
    const/4 v2, 0x1

    .line 177
    goto :goto_1

    .line 178
    :cond_5
    move v2, v10

    .line 179
    :goto_1
    iget-object v4, v11, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->rendererConfigurations:[Landroidx/media3/exoplayer/RendererConfiguration;

    .line 180
    .line 181
    aget-object v4, v4, v1

    .line 182
    .line 183
    iget-object v5, v13, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->rendererConfigurations:[Landroidx/media3/exoplayer/RendererConfiguration;

    .line 184
    .line 185
    aget-object v5, v5, v1

    .line 186
    .line 187
    if-eqz v3, :cond_6

    .line 188
    .line 189
    invoke-virtual {v5, v4}, Landroidx/media3/exoplayer/RendererConfiguration;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    if-eqz v3, :cond_6

    .line 194
    .line 195
    if-eqz v2, :cond_7

    .line 196
    .line 197
    :cond_6
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 198
    .line 199
    aget-object v2, v2, v1

    .line 200
    .line 201
    invoke-virtual {v12}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getStartPositionRendererTime()J

    .line 202
    .line 203
    .line 204
    move-result-wide v3

    .line 205
    invoke-direct {p0, v2, v3, v4}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setCurrentStreamFinal(Landroidx/media3/exoplayer/Renderer;J)V

    .line 206
    .line 207
    .line 208
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 209
    .line 210
    goto :goto_0

    .line 211
    :cond_8
    :goto_2
    iget-object v2, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 212
    .line 213
    iget-boolean v2, v2, Landroidx/media3/exoplayer/MediaPeriodInfo;->isFinal:Z

    .line 214
    .line 215
    if-nez v2, :cond_9

    .line 216
    .line 217
    iget-boolean v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingPauseAtEndOfPeriod:Z

    .line 218
    .line 219
    if-eqz v2, :cond_c

    .line 220
    .line 221
    :cond_9
    :goto_3
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 222
    .line 223
    array-length v3, v2

    .line 224
    if-ge v10, v3, :cond_c

    .line 225
    .line 226
    aget-object v2, v2, v10

    .line 227
    .line 228
    iget-object v3, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->sampleStreams:[Landroidx/media3/exoplayer/source/SampleStream;

    .line 229
    .line 230
    aget-object v3, v3, v10

    .line 231
    .line 232
    if-eqz v3, :cond_b

    .line 233
    .line 234
    invoke-interface {v2}, Landroidx/media3/exoplayer/Renderer;->getStream()Landroidx/media3/exoplayer/source/SampleStream;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    if-ne v4, v3, :cond_b

    .line 239
    .line 240
    invoke-interface {v2}, Landroidx/media3/exoplayer/Renderer;->hasReadStreamToEnd()Z

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    if-eqz v3, :cond_b

    .line 245
    .line 246
    iget-object v3, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 247
    .line 248
    iget-wide v3, v3, Landroidx/media3/exoplayer/MediaPeriodInfo;->durationUs:J

    .line 249
    .line 250
    cmp-long v5, v3, v8

    .line 251
    .line 252
    if-eqz v5, :cond_a

    .line 253
    .line 254
    const-wide/high16 v5, -0x8000000000000000L

    .line 255
    .line 256
    cmp-long v3, v3, v5

    .line 257
    .line 258
    if-eqz v3, :cond_a

    .line 259
    .line 260
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getRendererOffset()J

    .line 261
    .line 262
    .line 263
    move-result-wide v3

    .line 264
    iget-object v5, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 265
    .line 266
    iget-wide v5, v5, Landroidx/media3/exoplayer/MediaPeriodInfo;->durationUs:J

    .line 267
    .line 268
    add-long/2addr v3, v5

    .line 269
    goto :goto_4

    .line 270
    :cond_a
    move-wide v3, v8

    .line 271
    :goto_4
    invoke-direct {p0, v2, v3, v4}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setCurrentStreamFinal(Landroidx/media3/exoplayer/Renderer;J)V

    .line 272
    .line 273
    .line 274
    :cond_b
    add-int/lit8 v10, v10, 0x1

    .line 275
    .line 276
    goto :goto_3

    .line 277
    :cond_c
    :goto_5
    return-void
.end method

.method private maybeUpdateReadingRenderers()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getReadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eq v1, v0, :cond_1

    .line 16
    .line 17
    iget-boolean v0, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->allRenderersInCorrectState:Z

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->replaceStreamsOrDisableRendererForTransition()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->enableRenderers()V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    return-void
.end method

.method private mediaSourceListUpdateRequestedInternal()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaSourceList:Landroidx/media3/exoplayer/MediaSourceList;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaSourceList;->createTimeline()Landroidx/media3/common/p1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleMediaSourceListInfoRefreshed(Landroidx/media3/common/p1;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private moveMediaItemsInternal(Landroidx/media3/exoplayer/ExoPlayerImplInternal$MoveMediaItemsMessage;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfoUpdate:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->incrementPendingOperationAcks(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaSourceList:Landroidx/media3/exoplayer/MediaSourceList;

    .line 8
    .line 9
    iget v1, p1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$MoveMediaItemsMessage;->fromIndex:I

    .line 10
    .line 11
    iget v2, p1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$MoveMediaItemsMessage;->toIndex:I

    .line 12
    .line 13
    iget v3, p1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$MoveMediaItemsMessage;->newFromIndex:I

    .line 14
    .line 15
    iget-object p1, p1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$MoveMediaItemsMessage;->shuffleOrder:Landroidx/media3/exoplayer/source/ShuffleOrder;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, v3, p1}, Landroidx/media3/exoplayer/MediaSourceList;->moveMediaSourceRange(IIILandroidx/media3/exoplayer/source/ShuffleOrder;)Landroidx/media3/common/p1;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleMediaSourceListInfoRefreshed(Landroidx/media3/common/p1;Z)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private notifyTrackSelectionDiscontinuity()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getTrackSelectorResult()Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->selections:[Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_1
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    aget-object v4, v1, v3

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-interface {v4}, Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;->onDiscontinuity()V

    .line 24
    .line 25
    .line 26
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return-void
.end method

.method private notifyTrackSelectionPlayWhenReadyChanged(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getTrackSelectorResult()Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->selections:[Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_1
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    aget-object v4, v1, v3

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-interface {v4, p1}, Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;->onPlayWhenReadyChanged(Z)V

    .line 24
    .line 25
    .line 26
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return-void
.end method

.method private notifyTrackSelectionRebuffer()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getTrackSelectorResult()Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->selections:[Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_1
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    aget-object v4, v1, v3

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-interface {v4}, Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;->onRebuffer()V

    .line 24
    .line 25
    .line 26
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return-void
.end method

.method private prepareInternal()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfoUpdate:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->incrementPendingOperationAcks(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, v0, v0, v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resetInternal(ZZZZ)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->loadControl:Landroidx/media3/exoplayer/LoadControl;

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playerId:Landroidx/media3/exoplayer/analytics/PlayerId;

    .line 14
    .line 15
    invoke-interface {v0, v1}, Landroidx/media3/exoplayer/LoadControl;->onPrepared(Landroidx/media3/exoplayer/analytics/PlayerId;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 19
    .line 20
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x2

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v0, v1

    .line 32
    :goto_0
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setState(I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaSourceList:Landroidx/media3/exoplayer/MediaSourceList;

    .line 36
    .line 37
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->bandwidthMeter:Landroidx/media3/exoplayer/upstream/BandwidthMeter;

    .line 38
    .line 39
    invoke-interface {v2}, Landroidx/media3/exoplayer/upstream/BandwidthMeter;->getTransferListener()Lk1/c0;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/MediaSourceList;->prepare(Lk1/c0;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 47
    .line 48
    check-cast v0, Lh1/b0;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lh1/b0;->g(I)Z

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method private releaseInternal()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    invoke-direct {p0, v1, v0, v1, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resetInternal(ZZZZ)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->releaseRenderers()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->loadControl:Landroidx/media3/exoplayer/LoadControl;

    .line 10
    .line 11
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playerId:Landroidx/media3/exoplayer/analytics/PlayerId;

    .line 12
    .line 13
    invoke-interface {v0, v2}, Landroidx/media3/exoplayer/LoadControl;->onReleased(Landroidx/media3/exoplayer/analytics/PlayerId;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setState(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackLooperProvider:Landroidx/media3/exoplayer/PlaybackLooperProvider;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/media3/exoplayer/PlaybackLooperProvider;->releaseLooper()V

    .line 22
    .line 23
    .line 24
    monitor-enter p0

    .line 25
    :try_start_1
    iput-boolean v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->released:Z

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 28
    .line 29
    .line 30
    monitor-exit p0

    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    throw v0

    .line 35
    :catchall_1
    move-exception v0

    .line 36
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackLooperProvider:Landroidx/media3/exoplayer/PlaybackLooperProvider;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroidx/media3/exoplayer/PlaybackLooperProvider;->releaseLooper()V

    .line 39
    .line 40
    .line 41
    monitor-enter p0

    .line 42
    :try_start_2
    iput-boolean v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->released:Z

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 45
    .line 46
    .line 47
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 48
    throw v0

    .line 49
    :catchall_2
    move-exception v0

    .line 50
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 51
    throw v0
.end method

.method private releaseRenderers()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 3
    .line 4
    array-length v1, v1

    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererCapabilities:[Landroidx/media3/exoplayer/RendererCapabilities;

    .line 8
    .line 9
    aget-object v1, v1, v0

    .line 10
    .line 11
    invoke-interface {v1}, Landroidx/media3/exoplayer/RendererCapabilities;->clearListener()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 15
    .line 16
    aget-object v1, v1, v0

    .line 17
    .line 18
    invoke-interface {v1}, Landroidx/media3/exoplayer/Renderer;->release()V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void
.end method

.method private removeMediaItemsInternal(IILandroidx/media3/exoplayer/source/ShuffleOrder;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfoUpdate:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->incrementPendingOperationAcks(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaSourceList:Landroidx/media3/exoplayer/MediaSourceList;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, Landroidx/media3/exoplayer/MediaSourceList;->removeMediaSourceRange(IILandroidx/media3/exoplayer/source/ShuffleOrder;)Landroidx/media3/common/p1;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 p2, 0x0

    .line 14
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleMediaSourceListInfoRefreshed(Landroidx/media3/common/p1;Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private replaceStreamsOrDisableRendererForTransition()Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getReadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getTrackSelectorResult()Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x0

    .line 14
    move v4, v3

    .line 15
    move v5, v4

    .line 16
    :goto_0
    iget-object v6, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 17
    .line 18
    array-length v7, v6

    .line 19
    const/4 v8, 0x1

    .line 20
    if-ge v4, v7, :cond_6

    .line 21
    .line 22
    aget-object v9, v6, v4

    .line 23
    .line 24
    invoke-static {v9}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isRendererEnabled(Landroidx/media3/exoplayer/Renderer;)Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-nez v6, :cond_0

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_0
    invoke-interface {v9}, Landroidx/media3/exoplayer/Renderer;->getStream()Landroidx/media3/exoplayer/source/SampleStream;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    iget-object v7, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->sampleStreams:[Landroidx/media3/exoplayer/source/SampleStream;

    .line 36
    .line 37
    aget-object v7, v7, v4

    .line 38
    .line 39
    if-eq v6, v7, :cond_1

    .line 40
    .line 41
    move v6, v8

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v6, v3

    .line 44
    :goto_1
    invoke-virtual {v2, v4}, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->isRendererEnabled(I)Z

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    if-eqz v7, :cond_2

    .line 49
    .line 50
    if-nez v6, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    invoke-interface {v9}, Landroidx/media3/exoplayer/Renderer;->isCurrentStreamFinal()Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-nez v6, :cond_3

    .line 58
    .line 59
    iget-object v6, v2, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->selections:[Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;

    .line 60
    .line 61
    aget-object v6, v6, v4

    .line 62
    .line 63
    invoke-static {v6}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->getFormats(Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;)[Landroidx/media3/common/w;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    iget-object v6, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->sampleStreams:[Landroidx/media3/exoplayer/source/SampleStream;

    .line 68
    .line 69
    aget-object v11, v6, v4

    .line 70
    .line 71
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getStartPositionRendererTime()J

    .line 72
    .line 73
    .line 74
    move-result-wide v12

    .line 75
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getRendererOffset()J

    .line 76
    .line 77
    .line 78
    move-result-wide v14

    .line 79
    iget-object v6, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 80
    .line 81
    iget-object v6, v6, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 82
    .line 83
    move-object/from16 v16, v6

    .line 84
    .line 85
    invoke-interface/range {v9 .. v16}, Landroidx/media3/exoplayer/Renderer;->replaceStream([Landroidx/media3/common/w;Landroidx/media3/exoplayer/source/SampleStream;JJLandroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)V

    .line 86
    .line 87
    .line 88
    iget-boolean v6, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->offloadSchedulingEnabled:Z

    .line 89
    .line 90
    if-eqz v6, :cond_5

    .line 91
    .line 92
    invoke-direct {v0, v3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setOffloadSchedulingEnabled(Z)V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_3
    invoke-interface {v9}, Landroidx/media3/exoplayer/Renderer;->isEnded()Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_4

    .line 101
    .line 102
    invoke-direct {v0, v4}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->disableRenderer(I)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    move v5, v8

    .line 107
    :cond_5
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_6
    xor-int/lit8 v1, v5, 0x1

    .line 111
    .line 112
    return v1
.end method

.method private reselectTracksInternal()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/media3/exoplayer/DefaultMediaClock;->getPlaybackParameters()Landroidx/media3/common/y0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v1, v1, Landroidx/media3/common/y0;->a:F

    .line 10
    .line 11
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 18
    .line 19
    invoke-virtual {v3}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getReadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/4 v10, 0x1

    .line 24
    const/4 v4, 0x0

    .line 25
    move v5, v10

    .line 26
    :goto_0
    if-eqz v2, :cond_b

    .line 27
    .line 28
    iget-boolean v6, v2, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepared:Z

    .line 29
    .line 30
    if-nez v6, :cond_0

    .line 31
    .line 32
    goto/16 :goto_6

    .line 33
    .line 34
    :cond_0
    iget-object v6, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 35
    .line 36
    iget-object v7, v6, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 37
    .line 38
    iget-boolean v6, v6, Landroidx/media3/exoplayer/PlaybackInfo;->playWhenReady:Z

    .line 39
    .line 40
    invoke-virtual {v2, v1, v7, v6}, Landroidx/media3/exoplayer/MediaPeriodHolder;->selectTracks(FLandroidx/media3/common/p1;Z)Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    iget-object v7, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 45
    .line 46
    invoke-virtual {v7}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    if-ne v2, v7, :cond_1

    .line 51
    .line 52
    move-object v12, v6

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move-object v12, v4

    .line 55
    :goto_1
    invoke-virtual {v2}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getTrackSelectorResult()Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v6, v4}, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->isEquivalent(Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    const/4 v7, 0x0

    .line 64
    if-nez v4, :cond_9

    .line 65
    .line 66
    const/4 v1, 0x4

    .line 67
    if-eqz v5, :cond_7

    .line 68
    .line 69
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 70
    .line 71
    invoke-virtual {v2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 72
    .line 73
    .line 74
    move-result-object v11

    .line 75
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 76
    .line 77
    invoke-virtual {v2, v11}, Landroidx/media3/exoplayer/MediaPeriodQueue;->removeAfter(Landroidx/media3/exoplayer/MediaPeriodHolder;)Z

    .line 78
    .line 79
    .line 80
    move-result v15

    .line 81
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 82
    .line 83
    array-length v2, v2

    .line 84
    new-array v2, v2, [Z

    .line 85
    .line 86
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 90
    .line 91
    iget-wide v13, v3, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 92
    .line 93
    move-object/from16 v16, v2

    .line 94
    .line 95
    invoke-virtual/range {v11 .. v16}, Landroidx/media3/exoplayer/MediaPeriodHolder;->applyTrackSelection(Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;JZ[Z)J

    .line 96
    .line 97
    .line 98
    move-result-wide v2

    .line 99
    iget-object v4, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 100
    .line 101
    iget v5, v4, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 102
    .line 103
    if-eq v5, v1, :cond_2

    .line 104
    .line 105
    iget-wide v4, v4, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 106
    .line 107
    cmp-long v4, v2, v4

    .line 108
    .line 109
    if-eqz v4, :cond_2

    .line 110
    .line 111
    move v8, v10

    .line 112
    goto :goto_2

    .line 113
    :cond_2
    move v8, v7

    .line 114
    :goto_2
    iget-object v4, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 115
    .line 116
    move v5, v1

    .line 117
    iget-object v1, v4, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 118
    .line 119
    iget-wide v12, v4, Landroidx/media3/exoplayer/PlaybackInfo;->requestedContentPositionUs:J

    .line 120
    .line 121
    iget-wide v14, v4, Landroidx/media3/exoplayer/PlaybackInfo;->discontinuityStartPositionUs:J

    .line 122
    .line 123
    const/4 v9, 0x5

    .line 124
    move-wide/from16 v17, v12

    .line 125
    .line 126
    move v13, v5

    .line 127
    move-wide/from16 v4, v17

    .line 128
    .line 129
    move v12, v7

    .line 130
    move-wide v6, v14

    .line 131
    invoke-direct/range {v0 .. v9}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handlePositionDiscontinuity(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJJZI)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    iput-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 136
    .line 137
    if-eqz v8, :cond_3

    .line 138
    .line 139
    invoke-direct {v0, v2, v3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resetRendererPosition(J)V

    .line 140
    .line 141
    .line 142
    :cond_3
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 143
    .line 144
    array-length v1, v1

    .line 145
    new-array v1, v1, [Z

    .line 146
    .line 147
    move v7, v12

    .line 148
    :goto_3
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 149
    .line 150
    array-length v3, v2

    .line 151
    if-ge v7, v3, :cond_6

    .line 152
    .line 153
    aget-object v2, v2, v7

    .line 154
    .line 155
    invoke-static {v2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isRendererEnabled(Landroidx/media3/exoplayer/Renderer;)Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    aput-boolean v3, v1, v7

    .line 160
    .line 161
    iget-object v4, v11, Landroidx/media3/exoplayer/MediaPeriodHolder;->sampleStreams:[Landroidx/media3/exoplayer/source/SampleStream;

    .line 162
    .line 163
    aget-object v4, v4, v7

    .line 164
    .line 165
    if-eqz v3, :cond_5

    .line 166
    .line 167
    invoke-interface {v2}, Landroidx/media3/exoplayer/Renderer;->getStream()Landroidx/media3/exoplayer/source/SampleStream;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    if-eq v4, v3, :cond_4

    .line 172
    .line 173
    invoke-direct {v0, v7}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->disableRenderer(I)V

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_4
    aget-boolean v3, v16, v7

    .line 178
    .line 179
    if-eqz v3, :cond_5

    .line 180
    .line 181
    iget-wide v3, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J

    .line 182
    .line 183
    invoke-interface {v2, v3, v4}, Landroidx/media3/exoplayer/Renderer;->resetPosition(J)V

    .line 184
    .line 185
    .line 186
    :cond_5
    :goto_4
    add-int/lit8 v7, v7, 0x1

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_6
    iget-wide v2, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J

    .line 190
    .line 191
    invoke-direct {v0, v1, v2, v3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->enableRenderers([ZJ)V

    .line 192
    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_7
    move v13, v1

    .line 196
    move v12, v7

    .line 197
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 198
    .line 199
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->removeAfter(Landroidx/media3/exoplayer/MediaPeriodHolder;)Z

    .line 200
    .line 201
    .line 202
    iget-boolean v1, v2, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepared:Z

    .line 203
    .line 204
    if-eqz v1, :cond_8

    .line 205
    .line 206
    iget-object v1, v2, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 207
    .line 208
    iget-wide v3, v1, Landroidx/media3/exoplayer/MediaPeriodInfo;->startPositionUs:J

    .line 209
    .line 210
    iget-wide v7, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J

    .line 211
    .line 212
    invoke-virtual {v2, v7, v8}, Landroidx/media3/exoplayer/MediaPeriodHolder;->toPeriodTime(J)J

    .line 213
    .line 214
    .line 215
    move-result-wide v7

    .line 216
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 217
    .line 218
    .line 219
    move-result-wide v3

    .line 220
    invoke-virtual {v2, v6, v3, v4, v12}, Landroidx/media3/exoplayer/MediaPeriodHolder;->applyTrackSelection(Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;JZ)J

    .line 221
    .line 222
    .line 223
    :cond_8
    :goto_5
    invoke-direct {v0, v10}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleLoadingMediaPeriodChanged(Z)V

    .line 224
    .line 225
    .line 226
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 227
    .line 228
    iget v1, v1, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 229
    .line 230
    if-eq v1, v13, :cond_b

    .line 231
    .line 232
    invoke-direct {v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeContinueLoading()V

    .line 233
    .line 234
    .line 235
    invoke-direct {v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->updatePlaybackPositions()V

    .line 236
    .line 237
    .line 238
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 239
    .line 240
    const/4 v2, 0x2

    .line 241
    check-cast v1, Lh1/b0;

    .line 242
    .line 243
    invoke-virtual {v1, v2}, Lh1/b0;->g(I)Z

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :cond_9
    move-object v4, v12

    .line 248
    move v12, v7

    .line 249
    if-ne v2, v3, :cond_a

    .line 250
    .line 251
    move v5, v12

    .line 252
    :cond_a
    invoke-virtual {v2}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :cond_b
    :goto_6
    return-void
.end method

.method private reselectTracksInternalAndSeek()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->reselectTracksInternal()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->seekToCurrentPosition(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private resetInternal(ZZZZ)V
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    check-cast v0, Lh1/b0;

    .line 7
    .line 8
    invoke-virtual {v0, v2}, Lh1/b0;->f(I)V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iput-object v2, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingRecoverableRendererError:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->updateRebufferingState(ZZ)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/media3/exoplayer/DefaultMediaClock;->stop()V

    .line 22
    .line 23
    .line 24
    const-wide v5, 0xe8d4a51000L

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    iput-wide v5, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J

    .line 30
    .line 31
    move v5, v3

    .line 32
    :goto_0
    iget-object v6, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 33
    .line 34
    array-length v0, v6

    .line 35
    const-string v7, "ExoPlayerImplInternal"

    .line 36
    .line 37
    if-ge v5, v0, :cond_0

    .line 38
    .line 39
    :try_start_0
    invoke-direct {v1, v5}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->disableRenderer(I)V
    :try_end_0
    .catch Landroidx/media3/exoplayer/ExoPlaybackException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_2

    .line 43
    :catch_0
    move-exception v0

    .line 44
    goto :goto_1

    .line 45
    :catch_1
    move-exception v0

    .line 46
    :goto_1
    const-string v6, "Disable failed."

    .line 47
    .line 48
    invoke-static {v7, v6, v0}, Lh1/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    if-eqz p1, :cond_2

    .line 55
    .line 56
    array-length v5, v6

    .line 57
    move v8, v3

    .line 58
    :goto_3
    if-ge v8, v5, :cond_2

    .line 59
    .line 60
    aget-object v0, v6, v8

    .line 61
    .line 62
    iget-object v9, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderersToReset:Ljava/util/Set;

    .line 63
    .line 64
    invoke-interface {v9, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    if-eqz v9, :cond_1

    .line 69
    .line 70
    :try_start_1
    invoke-interface {v0}, Landroidx/media3/exoplayer/Renderer;->reset()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 71
    .line 72
    .line 73
    goto :goto_4

    .line 74
    :catch_2
    move-exception v0

    .line 75
    const-string v9, "Reset failed."

    .line 76
    .line 77
    invoke-static {v7, v9, v0}, Lh1/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    :cond_1
    :goto_4
    add-int/lit8 v8, v8, 0x1

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_2
    iput v3, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->enabledRendererCount:I

    .line 84
    .line 85
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 86
    .line 87
    iget-object v5, v0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 88
    .line 89
    iget-wide v6, v0, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 90
    .line 91
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 92
    .line 93
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 94
    .line 95
    invoke-virtual {v0}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_4

    .line 100
    .line 101
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 102
    .line 103
    iget-object v8, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->period:Landroidx/media3/common/m1;

    .line 104
    .line 105
    invoke-static {v0, v8}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isUsingPlaceholderPeriod(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/m1;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_3

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_3
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 113
    .line 114
    iget-wide v8, v0, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_4
    :goto_5
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 118
    .line 119
    iget-wide v8, v0, Landroidx/media3/exoplayer/PlaybackInfo;->requestedContentPositionUs:J

    .line 120
    .line 121
    :goto_6
    if-eqz p2, :cond_5

    .line 122
    .line 123
    iput-object v2, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingInitialSeekPosition:Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;

    .line 124
    .line 125
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 126
    .line 127
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 128
    .line 129
    invoke-direct {v1, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->getPlaceholderFirstMediaPeriodPositionUs(Landroidx/media3/common/p1;)Landroid/util/Pair;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    iget-object v5, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v5, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 136
    .line 137
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, Ljava/lang/Long;

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 142
    .line 143
    .line 144
    move-result-wide v6

    .line 145
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 146
    .line 147
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 148
    .line 149
    invoke-virtual {v5, v0}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    if-nez v0, :cond_5

    .line 159
    .line 160
    :goto_7
    move-wide v11, v6

    .line 161
    move-wide v9, v8

    .line 162
    goto :goto_8

    .line 163
    :cond_5
    move v4, v3

    .line 164
    goto :goto_7

    .line 165
    :goto_8
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 166
    .line 167
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->clear()V

    .line 168
    .line 169
    .line 170
    iput-boolean v3, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shouldContinueLoading:Z

    .line 171
    .line 172
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 173
    .line 174
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 175
    .line 176
    if-eqz p3, :cond_6

    .line 177
    .line 178
    instance-of v3, v0, Landroidx/media3/exoplayer/PlaylistTimeline;

    .line 179
    .line 180
    if-eqz v3, :cond_6

    .line 181
    .line 182
    check-cast v0, Landroidx/media3/exoplayer/PlaylistTimeline;

    .line 183
    .line 184
    iget-object v3, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaSourceList:Landroidx/media3/exoplayer/MediaSourceList;

    .line 185
    .line 186
    invoke-virtual {v3}, Landroidx/media3/exoplayer/MediaSourceList;->getShuffleOrder()Landroidx/media3/exoplayer/source/ShuffleOrder;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-virtual {v0, v3}, Landroidx/media3/exoplayer/PlaylistTimeline;->copyWithPlaceholderTimeline(Landroidx/media3/exoplayer/source/ShuffleOrder;)Landroidx/media3/exoplayer/PlaylistTimeline;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    iget v3, v5, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 195
    .line 196
    const/4 v6, -0x1

    .line 197
    if-eq v3, v6, :cond_6

    .line 198
    .line 199
    iget-object v3, v5, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 200
    .line 201
    iget-object v6, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->period:Landroidx/media3/common/m1;

    .line 202
    .line 203
    invoke-virtual {v0, v3, v6}, Landroidx/media3/exoplayer/AbstractConcatenatedTimeline;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 204
    .line 205
    .line 206
    iget-object v3, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->period:Landroidx/media3/common/m1;

    .line 207
    .line 208
    iget v3, v3, Landroidx/media3/common/m1;->c:I

    .line 209
    .line 210
    iget-object v6, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->window:Landroidx/media3/common/o1;

    .line 211
    .line 212
    invoke-virtual {v0, v3, v6}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    invoke-virtual {v3}, Landroidx/media3/common/o1;->a()Z

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    if-eqz v3, :cond_6

    .line 221
    .line 222
    new-instance v3, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 223
    .line 224
    iget-object v6, v5, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 225
    .line 226
    iget-wide v7, v5, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->windowSequenceNumber:J

    .line 227
    .line 228
    invoke-direct {v3, v6, v7, v8}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;-><init>(Ljava/lang/Object;J)V

    .line 229
    .line 230
    .line 231
    move-object v7, v0

    .line 232
    move-object v8, v3

    .line 233
    goto :goto_9

    .line 234
    :cond_6
    move-object v7, v0

    .line 235
    move-object v8, v5

    .line 236
    :goto_9
    new-instance v6, Landroidx/media3/exoplayer/PlaybackInfo;

    .line 237
    .line 238
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 239
    .line 240
    iget v13, v0, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 241
    .line 242
    if-eqz p4, :cond_7

    .line 243
    .line 244
    :goto_a
    move-object v14, v2

    .line 245
    goto :goto_b

    .line 246
    :cond_7
    iget-object v2, v0, Landroidx/media3/exoplayer/PlaybackInfo;->playbackError:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 247
    .line 248
    goto :goto_a

    .line 249
    :goto_b
    if-eqz v4, :cond_8

    .line 250
    .line 251
    sget-object v2, Landroidx/media3/exoplayer/source/TrackGroupArray;->EMPTY:Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 252
    .line 253
    :goto_c
    move-object/from16 v16, v2

    .line 254
    .line 255
    goto :goto_d

    .line 256
    :cond_8
    iget-object v2, v0, Landroidx/media3/exoplayer/PlaybackInfo;->trackGroups:Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 257
    .line 258
    goto :goto_c

    .line 259
    :goto_d
    if-eqz v4, :cond_9

    .line 260
    .line 261
    iget-object v2, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->emptyTrackSelectorResult:Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 262
    .line 263
    :goto_e
    move-object/from16 v17, v2

    .line 264
    .line 265
    goto :goto_f

    .line 266
    :cond_9
    iget-object v2, v0, Landroidx/media3/exoplayer/PlaybackInfo;->trackSelectorResult:Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 267
    .line 268
    goto :goto_e

    .line 269
    :goto_f
    if-eqz v4, :cond_a

    .line 270
    .line 271
    sget-object v2, Lf6/m0;->k:Lf6/k0;

    .line 272
    .line 273
    sget-object v2, Lf6/l1;->n:Lf6/l1;

    .line 274
    .line 275
    :goto_10
    move-object/from16 v18, v2

    .line 276
    .line 277
    goto :goto_11

    .line 278
    :cond_a
    iget-object v2, v0, Landroidx/media3/exoplayer/PlaybackInfo;->staticMetadata:Ljava/util/List;

    .line 279
    .line 280
    goto :goto_10

    .line 281
    :goto_11
    iget-boolean v2, v0, Landroidx/media3/exoplayer/PlaybackInfo;->playWhenReady:Z

    .line 282
    .line 283
    iget v3, v0, Landroidx/media3/exoplayer/PlaybackInfo;->playWhenReadyChangeReason:I

    .line 284
    .line 285
    iget v4, v0, Landroidx/media3/exoplayer/PlaybackInfo;->playbackSuppressionReason:I

    .line 286
    .line 287
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->playbackParameters:Landroidx/media3/common/y0;

    .line 288
    .line 289
    const-wide/16 v30, 0x0

    .line 290
    .line 291
    const/16 v32, 0x0

    .line 292
    .line 293
    const/4 v15, 0x0

    .line 294
    const-wide/16 v26, 0x0

    .line 295
    .line 296
    move-object/from16 v19, v8

    .line 297
    .line 298
    move-wide/from16 v24, v11

    .line 299
    .line 300
    move-wide/from16 v28, v11

    .line 301
    .line 302
    move-object/from16 v23, v0

    .line 303
    .line 304
    move/from16 v20, v2

    .line 305
    .line 306
    move/from16 v21, v3

    .line 307
    .line 308
    move/from16 v22, v4

    .line 309
    .line 310
    invoke-direct/range {v6 .. v32}, Landroidx/media3/exoplayer/PlaybackInfo;-><init>(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJILandroidx/media3/exoplayer/ExoPlaybackException;ZLandroidx/media3/exoplayer/source/TrackGroupArray;Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;Ljava/util/List;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;ZIILandroidx/media3/common/y0;JJJJZ)V

    .line 311
    .line 312
    .line 313
    iput-object v6, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 314
    .line 315
    if-eqz p3, :cond_b

    .line 316
    .line 317
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 318
    .line 319
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->releasePreloadPool()V

    .line 320
    .line 321
    .line 322
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaSourceList:Landroidx/media3/exoplayer/MediaSourceList;

    .line 323
    .line 324
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaSourceList;->release()V

    .line 325
    .line 326
    .line 327
    :cond_b
    return-void
.end method

.method private resetPendingPauseAtEndOfPeriod()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 10
    .line 11
    iget-boolean v0, v0, Landroidx/media3/exoplayer/MediaPeriodInfo;->isLastInTimelineWindow:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pauseAtEndOfWindow:Z

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    iput-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingPauseAtEndOfPeriod:Z

    .line 23
    .line 24
    return-void
.end method

.method private resetRendererPosition(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-wide v0, 0xe8d4a51000L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    add-long/2addr p1, v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v0, p1, p2}, Landroidx/media3/exoplayer/MediaPeriodHolder;->toRendererTime(J)J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    :goto_0
    iput-wide p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J

    .line 21
    .line 22
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Landroidx/media3/exoplayer/DefaultMediaClock;->resetPosition(J)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 28
    .line 29
    array-length p2, p1

    .line 30
    const/4 v0, 0x0

    .line 31
    :goto_1
    if-ge v0, p2, :cond_2

    .line 32
    .line 33
    aget-object v1, p1, v0

    .line 34
    .line 35
    invoke-static {v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isRendererEnabled(Landroidx/media3/exoplayer/Renderer;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    iget-wide v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J

    .line 42
    .line 43
    invoke-interface {v1, v2, v3}, Landroidx/media3/exoplayer/Renderer;->resetPosition(J)V

    .line 44
    .line 45
    .line 46
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->notifyTrackSelectionDiscontinuity()V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method private static resolvePendingMessageEndOfStreamPosition(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;Landroidx/media3/common/o1;Landroidx/media3/common/m1;)V
    .locals 4

    .line 1
    iget-object v0, p1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->resolvedPeriodUid:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p3}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, Landroidx/media3/common/m1;->c:I

    .line 8
    .line 9
    invoke-virtual {p0, v0, p2}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget p2, p2, Landroidx/media3/common/o1;->o:I

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    invoke-virtual {p0, p2, p3, v0}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;Z)Landroidx/media3/common/m1;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object p0, p0, Landroidx/media3/common/m1;->b:Ljava/lang/Object;

    .line 21
    .line 22
    iget-wide v0, p3, Landroidx/media3/common/m1;->d:J

    .line 23
    .line 24
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    cmp-long p3, v0, v2

    .line 30
    .line 31
    if-eqz p3, :cond_0

    .line 32
    .line 33
    const-wide/16 v2, 0x1

    .line 34
    .line 35
    sub-long/2addr v0, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual {p1, p2, v0, v1, p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->setResolvedPosition(IJLjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method private static resolvePendingMessagePosition(Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;Landroidx/media3/common/p1;Landroidx/media3/common/p1;IZLandroidx/media3/common/o1;Landroidx/media3/common/m1;)Z
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->resolvedPeriodUid:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    const/4 v8, 0x1

    .line 5
    const-wide/high16 v9, -0x8000000000000000L

    .line 6
    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iget-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->message:Landroidx/media3/exoplayer/PlayerMessage;

    .line 10
    .line 11
    invoke-virtual {p2}, Landroidx/media3/exoplayer/PlayerMessage;->getPositionMs()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    cmp-long p2, v0, v9

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->message:Landroidx/media3/exoplayer/PlayerMessage;

    .line 26
    .line 27
    invoke-virtual {p2}, Landroidx/media3/exoplayer/PlayerMessage;->getPositionMs()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-static {v0, v1}, Lh1/i0;->S(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    :goto_0
    new-instance p2, Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;

    .line 36
    .line 37
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->message:Landroidx/media3/exoplayer/PlayerMessage;

    .line 38
    .line 39
    invoke-virtual {v2}, Landroidx/media3/exoplayer/PlayerMessage;->getTimeline()Landroidx/media3/common/p1;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->message:Landroidx/media3/exoplayer/PlayerMessage;

    .line 44
    .line 45
    invoke-virtual {v3}, Landroidx/media3/exoplayer/PlayerMessage;->getMediaItemIndex()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-direct {p2, v2, v3, v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;-><init>(Landroidx/media3/common/p1;IJ)V

    .line 50
    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    move-object v0, p1

    .line 54
    move-object v1, p2

    .line 55
    move v3, p3

    .line 56
    move v4, p4

    .line 57
    move-object/from16 v5, p5

    .line 58
    .line 59
    move-object/from16 v6, p6

    .line 60
    .line 61
    invoke-static/range {v0 .. v6}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resolveSeekPositionUs(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;ZIZLandroidx/media3/common/o1;Landroidx/media3/common/m1;)Landroid/util/Pair;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    move-object v2, v6

    .line 66
    if-nez p2, :cond_1

    .line 67
    .line 68
    return v7

    .line 69
    :cond_1
    iget-object v0, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    iget-object v3, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v3, Ljava/lang/Long;

    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 80
    .line 81
    .line 82
    move-result-wide v3

    .line 83
    iget-object p2, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-virtual {p0, v0, v3, v4, p2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->setResolvedPosition(IJLjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->message:Landroidx/media3/exoplayer/PlayerMessage;

    .line 89
    .line 90
    invoke-virtual {p2}, Landroidx/media3/exoplayer/PlayerMessage;->getPositionMs()J

    .line 91
    .line 92
    .line 93
    move-result-wide v3

    .line 94
    cmp-long p2, v3, v9

    .line 95
    .line 96
    if-nez p2, :cond_2

    .line 97
    .line 98
    invoke-static {p1, p0, v5, v2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resolvePendingMessageEndOfStreamPosition(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;Landroidx/media3/common/o1;Landroidx/media3/common/m1;)V

    .line 99
    .line 100
    .line 101
    :cond_2
    return v8

    .line 102
    :cond_3
    move-object/from16 v5, p5

    .line 103
    .line 104
    move-object/from16 v2, p6

    .line 105
    .line 106
    invoke-virtual {p1, v0}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    const/4 v3, -0x1

    .line 111
    if-ne v0, v3, :cond_4

    .line 112
    .line 113
    return v7

    .line 114
    :cond_4
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->message:Landroidx/media3/exoplayer/PlayerMessage;

    .line 115
    .line 116
    invoke-virtual {v3}, Landroidx/media3/exoplayer/PlayerMessage;->getPositionMs()J

    .line 117
    .line 118
    .line 119
    move-result-wide v3

    .line 120
    cmp-long v3, v3, v9

    .line 121
    .line 122
    if-nez v3, :cond_5

    .line 123
    .line 124
    invoke-static {p1, p0, v5, v2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resolvePendingMessageEndOfStreamPosition(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;Landroidx/media3/common/o1;Landroidx/media3/common/m1;)V

    .line 125
    .line 126
    .line 127
    return v8

    .line 128
    :cond_5
    iput v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->resolvedPeriodIndex:I

    .line 129
    .line 130
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->resolvedPeriodUid:Ljava/lang/Object;

    .line 131
    .line 132
    invoke-virtual {p2, v0, v2}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 133
    .line 134
    .line 135
    iget-boolean v0, v2, Landroidx/media3/common/m1;->f:Z

    .line 136
    .line 137
    if-eqz v0, :cond_6

    .line 138
    .line 139
    iget v0, v2, Landroidx/media3/common/m1;->c:I

    .line 140
    .line 141
    invoke-virtual {p2, v0, v5}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    iget v0, v0, Landroidx/media3/common/o1;->n:I

    .line 146
    .line 147
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->resolvedPeriodUid:Ljava/lang/Object;

    .line 148
    .line 149
    invoke-virtual {p2, v3}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    if-ne v0, p2, :cond_6

    .line 154
    .line 155
    iget-wide v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->resolvedPeriodTimeUs:J

    .line 156
    .line 157
    iget-wide v6, v2, Landroidx/media3/common/m1;->e:J

    .line 158
    .line 159
    add-long/2addr v3, v6

    .line 160
    iget-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->resolvedPeriodUid:Ljava/lang/Object;

    .line 161
    .line 162
    invoke-virtual {p1, p2, v2}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    iget p2, p2, Landroidx/media3/common/m1;->c:I

    .line 167
    .line 168
    move-object v0, p1

    .line 169
    move-object v1, v5

    .line 170
    move-wide v4, v3

    .line 171
    move v3, p2

    .line 172
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/common/p1;->getPeriodPositionUs(Landroidx/media3/common/o1;Landroidx/media3/common/m1;IJ)Landroid/util/Pair;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    iget-object v1, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 177
    .line 178
    invoke-virtual {p1, v1}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    iget-object v0, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v0, Ljava/lang/Long;

    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 187
    .line 188
    .line 189
    move-result-wide v0

    .line 190
    iget-object p2, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 191
    .line 192
    invoke-virtual {p0, p1, v0, v1, p2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->setResolvedPosition(IJLjava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    :cond_6
    return v8
.end method

.method private resolvePendingMessagePositions(Landroidx/media3/common/p1;Landroidx/media3/common/p1;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingMessages:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    add-int/lit8 v0, v0, -0x1

    .line 21
    .line 22
    :goto_0
    if-ltz v0, :cond_2

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingMessages:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    move-object v2, v1

    .line 31
    check-cast v2, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;

    .line 32
    .line 33
    iget v5, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->repeatMode:I

    .line 34
    .line 35
    iget-boolean v6, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shuffleModeEnabled:Z

    .line 36
    .line 37
    iget-object v7, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->window:Landroidx/media3/common/o1;

    .line 38
    .line 39
    iget-object v8, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->period:Landroidx/media3/common/m1;

    .line 40
    .line 41
    move-object v3, p1

    .line 42
    move-object v4, p2

    .line 43
    invoke-static/range {v2 .. v8}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resolvePendingMessagePosition(Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;Landroidx/media3/common/p1;Landroidx/media3/common/p1;IZLandroidx/media3/common/o1;Landroidx/media3/common/m1;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-nez p1, :cond_1

    .line 48
    .line 49
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingMessages:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;

    .line 56
    .line 57
    iget-object p1, p1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;->message:Landroidx/media3/exoplayer/PlayerMessage;

    .line 58
    .line 59
    const/4 p2, 0x0

    .line 60
    invoke-virtual {p1, p2}, Landroidx/media3/exoplayer/PlayerMessage;->markAsProcessed(Z)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingMessages:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 69
    .line 70
    move-object p1, v3

    .line 71
    move-object p2, v4

    .line 72
    goto :goto_0

    .line 73
    :cond_2
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingMessages:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method private static resolvePositionForPlaylistChange(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;Landroidx/media3/exoplayer/MediaPeriodQueue;IZLandroidx/media3/common/o1;Landroidx/media3/common/m1;)Landroidx/media3/exoplayer/ExoPlayerImplInternal$PositionUpdateForPlaylistChange;
    .locals 30

    .line 1
    move-object/from16 v7, p1

    .line 2
    .line 3
    move-object/from16 v2, p7

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PositionUpdateForPlaylistChange;

    .line 12
    .line 13
    invoke-static {}, Landroidx/media3/exoplayer/PlaybackInfo;->getDummyPeriodForEmptyTimeline()Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v8, 0x1

    .line 18
    const/4 v9, 0x0

    .line 19
    const-wide/16 v3, 0x0

    .line 20
    .line 21
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PositionUpdateForPlaylistChange;-><init>(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJZZZ)V

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_0
    iget-object v9, v7, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 32
    .line 33
    iget-object v8, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {v7, v2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isUsingPlaceholderPeriod(Landroidx/media3/exoplayer/PlaybackInfo;Landroidx/media3/common/m1;)Z

    .line 36
    .line 37
    .line 38
    move-result v10

    .line 39
    iget-object v0, v7, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    if-eqz v10, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    iget-wide v0, v7, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 51
    .line 52
    :goto_0
    move-wide v11, v0

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    :goto_1
    iget-wide v0, v7, Landroidx/media3/exoplayer/PlaybackInfo;->requestedContentPositionUs:J

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :goto_2
    const/4 v15, 0x0

    .line 58
    const/4 v0, -0x1

    .line 59
    const/16 v16, 0x1

    .line 60
    .line 61
    if-eqz p2, :cond_6

    .line 62
    .line 63
    const/4 v2, 0x1

    .line 64
    move-object/from16 v1, p2

    .line 65
    .line 66
    move/from16 v3, p4

    .line 67
    .line 68
    move/from16 v4, p5

    .line 69
    .line 70
    move-object/from16 v5, p6

    .line 71
    .line 72
    move-object/from16 v6, p7

    .line 73
    .line 74
    move v13, v0

    .line 75
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    move-object/from16 v0, p0

    .line 81
    .line 82
    invoke-static/range {v0 .. v6}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resolveSeekPositionUs(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;ZIZLandroidx/media3/common/o1;Landroidx/media3/common/m1;)Landroid/util/Pair;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    move v3, v4

    .line 87
    if-nez v2, :cond_3

    .line 88
    .line 89
    invoke-virtual {v0, v3}, Landroidx/media3/common/p1;->getFirstWindowIndex(Z)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    move-wide v2, v11

    .line 94
    move v4, v15

    .line 95
    move v5, v4

    .line 96
    move/from16 v14, v16

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_3
    iget-wide v3, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;->windowPositionUs:J

    .line 100
    .line 101
    cmp-long v1, v3, v17

    .line 102
    .line 103
    if-nez v1, :cond_4

    .line 104
    .line 105
    iget-object v1, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 106
    .line 107
    invoke-virtual {v0, v1, v6}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iget v1, v1, Landroidx/media3/common/m1;->c:I

    .line 112
    .line 113
    move-wide v2, v11

    .line 114
    move v4, v15

    .line 115
    goto :goto_3

    .line 116
    :cond_4
    iget-object v8, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 117
    .line 118
    iget-object v1, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v1, Ljava/lang/Long;

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 123
    .line 124
    .line 125
    move-result-wide v1

    .line 126
    move-wide v2, v1

    .line 127
    move v1, v13

    .line 128
    move/from16 v4, v16

    .line 129
    .line 130
    :goto_3
    iget v5, v7, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 131
    .line 132
    const/4 v14, 0x4

    .line 133
    if-ne v5, v14, :cond_5

    .line 134
    .line 135
    move/from16 v5, v16

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_5
    move v5, v15

    .line 139
    :goto_4
    move v14, v15

    .line 140
    :goto_5
    move-wide/from16 v25, v2

    .line 141
    .line 142
    move v3, v1

    .line 143
    move-wide/from16 v0, v25

    .line 144
    .line 145
    move/from16 v27, v4

    .line 146
    .line 147
    move/from16 v25, v5

    .line 148
    .line 149
    move/from16 v26, v14

    .line 150
    .line 151
    goto/16 :goto_a

    .line 152
    .line 153
    :cond_6
    move/from16 v3, p5

    .line 154
    .line 155
    move v13, v0

    .line 156
    move-object v6, v2

    .line 157
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    move-object/from16 v0, p0

    .line 163
    .line 164
    iget-object v1, v7, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 165
    .line 166
    invoke-virtual {v1}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_7

    .line 171
    .line 172
    invoke-virtual {v0, v3}, Landroidx/media3/common/p1;->getFirstWindowIndex(Z)I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    move v3, v1

    .line 177
    :goto_6
    move-wide v0, v11

    .line 178
    :goto_7
    move/from16 v25, v15

    .line 179
    .line 180
    move/from16 v26, v25

    .line 181
    .line 182
    move/from16 v27, v26

    .line 183
    .line 184
    goto/16 :goto_a

    .line 185
    .line 186
    :cond_7
    invoke-virtual {v0, v8}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-ne v1, v13, :cond_9

    .line 191
    .line 192
    iget-object v5, v7, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 193
    .line 194
    move/from16 v2, p4

    .line 195
    .line 196
    move-object v1, v6

    .line 197
    move-object v4, v8

    .line 198
    move-object v6, v0

    .line 199
    move-object/from16 v0, p6

    .line 200
    .line 201
    invoke-static/range {v0 .. v6}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resolveSubsequentPeriod(Landroidx/media3/common/o1;Landroidx/media3/common/m1;IZLjava/lang/Object;Landroidx/media3/common/p1;Landroidx/media3/common/p1;)I

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    move-object v0, v6

    .line 206
    move-object v6, v1

    .line 207
    if-ne v2, v13, :cond_8

    .line 208
    .line 209
    invoke-virtual {v0, v3}, Landroidx/media3/common/p1;->getFirstWindowIndex(Z)I

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    move/from16 v14, v16

    .line 214
    .line 215
    goto :goto_8

    .line 216
    :cond_8
    move v1, v2

    .line 217
    move v14, v15

    .line 218
    :goto_8
    move v3, v1

    .line 219
    move-object v8, v4

    .line 220
    move-wide v0, v11

    .line 221
    move/from16 v26, v14

    .line 222
    .line 223
    move/from16 v25, v15

    .line 224
    .line 225
    move/from16 v27, v25

    .line 226
    .line 227
    goto/16 :goto_a

    .line 228
    .line 229
    :cond_9
    move-object v4, v8

    .line 230
    cmp-long v1, v11, v17

    .line 231
    .line 232
    if-nez v1, :cond_a

    .line 233
    .line 234
    invoke-virtual {v0, v4, v6}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    iget v1, v1, Landroidx/media3/common/m1;->c:I

    .line 239
    .line 240
    move v3, v1

    .line 241
    move-object v8, v4

    .line 242
    goto :goto_6

    .line 243
    :cond_a
    if-eqz v10, :cond_c

    .line 244
    .line 245
    iget-object v1, v7, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 246
    .line 247
    iget-object v2, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 248
    .line 249
    invoke-virtual {v1, v2, v6}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 250
    .line 251
    .line 252
    iget-object v1, v7, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 253
    .line 254
    iget v2, v6, Landroidx/media3/common/m1;->c:I

    .line 255
    .line 256
    move-object/from16 v5, p6

    .line 257
    .line 258
    invoke-virtual {v1, v2, v5}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    iget v1, v1, Landroidx/media3/common/o1;->n:I

    .line 263
    .line 264
    iget-object v2, v7, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 265
    .line 266
    iget-object v3, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 267
    .line 268
    invoke-virtual {v2, v3}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    if-ne v1, v2, :cond_b

    .line 273
    .line 274
    iget-wide v1, v6, Landroidx/media3/common/m1;->e:J

    .line 275
    .line 276
    add-long/2addr v1, v11

    .line 277
    invoke-virtual {v0, v4, v6}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    iget v3, v3, Landroidx/media3/common/m1;->c:I

    .line 282
    .line 283
    move-wide/from16 v28, v1

    .line 284
    .line 285
    move-object v1, v5

    .line 286
    move-wide/from16 v4, v28

    .line 287
    .line 288
    move-object v2, v6

    .line 289
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/common/p1;->getPeriodPositionUs(Landroidx/media3/common/o1;Landroidx/media3/common/m1;IJ)Landroid/util/Pair;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    iget-object v8, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 294
    .line 295
    iget-object v0, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v0, Ljava/lang/Long;

    .line 298
    .line 299
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 300
    .line 301
    .line 302
    move-result-wide v0

    .line 303
    move-wide v2, v0

    .line 304
    goto :goto_9

    .line 305
    :cond_b
    move-object v8, v4

    .line 306
    move-wide v2, v11

    .line 307
    :goto_9
    move-wide v0, v2

    .line 308
    move v3, v13

    .line 309
    move/from16 v25, v15

    .line 310
    .line 311
    move/from16 v26, v25

    .line 312
    .line 313
    move/from16 v27, v16

    .line 314
    .line 315
    goto :goto_a

    .line 316
    :cond_c
    move-object v8, v4

    .line 317
    move-wide v0, v11

    .line 318
    move v3, v13

    .line 319
    goto/16 :goto_7

    .line 320
    .line 321
    :goto_a
    if-eq v3, v13, :cond_d

    .line 322
    .line 323
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    move-object/from16 v0, p0

    .line 329
    .line 330
    move-object/from16 v1, p6

    .line 331
    .line 332
    move-object/from16 v2, p7

    .line 333
    .line 334
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/common/p1;->getPeriodPositionUs(Landroidx/media3/common/o1;Landroidx/media3/common/m1;IJ)Landroid/util/Pair;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    move-object v6, v0

    .line 339
    iget-object v8, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 340
    .line 341
    iget-object v0, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v0, Ljava/lang/Long;

    .line 344
    .line 345
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 346
    .line 347
    .line 348
    move-result-wide v0

    .line 349
    move-wide/from16 v23, v17

    .line 350
    .line 351
    :goto_b
    move-object/from16 v3, p3

    .line 352
    .line 353
    goto :goto_c

    .line 354
    :cond_d
    move-object/from16 v6, p0

    .line 355
    .line 356
    move-object/from16 v2, p7

    .line 357
    .line 358
    move-wide/from16 v23, v0

    .line 359
    .line 360
    goto :goto_b

    .line 361
    :goto_c
    invoke-virtual {v3, v6, v8, v0, v1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->resolveMediaPeriodIdForAdsAfterPeriodPositionChange(Landroidx/media3/common/p1;Ljava/lang/Object;J)Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    iget v4, v3, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->nextAdGroupIndex:I

    .line 366
    .line 367
    if-eq v4, v13, :cond_f

    .line 368
    .line 369
    iget v5, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->nextAdGroupIndex:I

    .line 370
    .line 371
    if-eq v5, v13, :cond_e

    .line 372
    .line 373
    if-lt v4, v5, :cond_e

    .line 374
    .line 375
    goto :goto_d

    .line 376
    :cond_e
    move v4, v15

    .line 377
    goto :goto_e

    .line 378
    :cond_f
    :goto_d
    move/from16 v4, v16

    .line 379
    .line 380
    :goto_e
    iget-object v5, v9, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 381
    .line 382
    invoke-virtual {v5, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v5

    .line 386
    if-eqz v5, :cond_10

    .line 387
    .line 388
    invoke-virtual {v9}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 389
    .line 390
    .line 391
    move-result v5

    .line 392
    if-nez v5, :cond_10

    .line 393
    .line 394
    invoke-virtual {v3}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 395
    .line 396
    .line 397
    move-result v5

    .line 398
    if-nez v5, :cond_10

    .line 399
    .line 400
    if-eqz v4, :cond_10

    .line 401
    .line 402
    goto :goto_f

    .line 403
    :cond_10
    move/from16 v16, v15

    .line 404
    .line 405
    :goto_f
    invoke-virtual {v6, v8, v2}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 406
    .line 407
    .line 408
    move-result-object v13

    .line 409
    move v8, v10

    .line 410
    move-wide v10, v11

    .line 411
    move-wide/from16 v14, v23

    .line 412
    .line 413
    move-object v12, v3

    .line 414
    invoke-static/range {v8 .. v15}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isIgnorableServerSideAdInsertionPeriodChange(ZLandroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JLandroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;Landroidx/media3/common/m1;J)Z

    .line 415
    .line 416
    .line 417
    move-result v3

    .line 418
    if-nez v16, :cond_11

    .line 419
    .line 420
    if-eqz v3, :cond_12

    .line 421
    .line 422
    :cond_11
    move-object v12, v9

    .line 423
    :cond_12
    invoke-virtual {v12}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 424
    .line 425
    .line 426
    move-result v3

    .line 427
    if-eqz v3, :cond_13

    .line 428
    .line 429
    invoke-virtual {v12, v9}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->equals(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v0

    .line 433
    if-eqz v0, :cond_14

    .line 434
    .line 435
    iget-wide v0, v7, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 436
    .line 437
    :cond_13
    :goto_10
    move-wide/from16 v21, v0

    .line 438
    .line 439
    goto :goto_11

    .line 440
    :cond_14
    iget-object v0, v12, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 441
    .line 442
    invoke-virtual {v6, v0, v2}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 443
    .line 444
    .line 445
    iget v0, v12, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adIndexInAdGroup:I

    .line 446
    .line 447
    iget v1, v12, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 448
    .line 449
    invoke-virtual {v2, v1}, Landroidx/media3/common/m1;->f(I)I

    .line 450
    .line 451
    .line 452
    move-result v1

    .line 453
    if-ne v0, v1, :cond_15

    .line 454
    .line 455
    iget-object v0, v2, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 456
    .line 457
    iget-wide v0, v0, Landroidx/media3/common/c;->c:J

    .line 458
    .line 459
    goto :goto_10

    .line 460
    :cond_15
    const-wide/16 v0, 0x0

    .line 461
    .line 462
    goto :goto_10

    .line 463
    :goto_11
    new-instance v19, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PositionUpdateForPlaylistChange;

    .line 464
    .line 465
    move-object/from16 v20, v12

    .line 466
    .line 467
    move-wide/from16 v23, v14

    .line 468
    .line 469
    invoke-direct/range {v19 .. v27}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PositionUpdateForPlaylistChange;-><init>(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJZZZ)V

    .line 470
    .line 471
    .line 472
    return-object v19
.end method

.method private static resolveSeekPositionUs(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;ZIZLandroidx/media3/common/o1;Landroidx/media3/common/m1;)Landroid/util/Pair;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/p1;",
            "Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;",
            "ZIZ",
            "Landroidx/media3/common/o1;",
            "Landroidx/media3/common/m1;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v2, p1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;->timeline:Landroidx/media3/common/p1;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v3

    .line 7
    const/4 v8, 0x0

    .line 8
    if-eqz v3, :cond_0

    .line 9
    .line 10
    return-object v8

    .line 11
    :cond_0
    invoke-virtual {v2}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    move-object v2, p0

    .line 18
    :cond_1
    :try_start_0
    iget v5, p1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;->windowIndex:I

    .line 19
    .line 20
    iget-wide v6, p1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;->windowPositionUs:J

    .line 21
    .line 22
    move-object v3, p5

    .line 23
    move-object v4, p6

    .line 24
    invoke-virtual/range {v2 .. v7}, Landroidx/media3/common/p1;->getPeriodPositionUs(Landroidx/media3/common/o1;Landroidx/media3/common/m1;IJ)Landroid/util/Pair;

    .line 25
    .line 26
    .line 27
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    move-object v3, v2

    .line 29
    invoke-virtual {p0, v3}, Landroidx/media3/common/p1;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_2

    .line 34
    .line 35
    return-object v5

    .line 36
    :cond_2
    iget-object v4, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {p0, v4}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    const/4 v7, -0x1

    .line 43
    if-eq v4, v7, :cond_4

    .line 44
    .line 45
    iget-object v4, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-virtual {v3, v4, p6}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    iget-boolean v4, v4, Landroidx/media3/common/m1;->f:Z

    .line 52
    .line 53
    if-eqz v4, :cond_3

    .line 54
    .line 55
    iget v4, p6, Landroidx/media3/common/m1;->c:I

    .line 56
    .line 57
    invoke-virtual {v3, v4, p5}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    iget v4, v4, Landroidx/media3/common/o1;->n:I

    .line 62
    .line 63
    iget-object v7, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 64
    .line 65
    invoke-virtual {v3, v7}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-ne v4, v3, :cond_3

    .line 70
    .line 71
    iget-object v3, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 72
    .line 73
    invoke-virtual {p0, v3, p6}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    iget v3, v3, Landroidx/media3/common/m1;->c:I

    .line 78
    .line 79
    iget-wide v4, p1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;->windowPositionUs:J

    .line 80
    .line 81
    move-object v0, p0

    .line 82
    move-object v1, p5

    .line 83
    move-object v2, p6

    .line 84
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/common/p1;->getPeriodPositionUs(Landroidx/media3/common/o1;Landroidx/media3/common/m1;IJ)Landroid/util/Pair;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    return-object v0

    .line 89
    :cond_3
    return-object v5

    .line 90
    :cond_4
    if-eqz p2, :cond_5

    .line 91
    .line 92
    iget-object v4, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v6, p0

    .line 95
    move v2, p3

    .line 96
    move-object v0, p5

    .line 97
    move-object v1, p6

    .line 98
    move-object v5, v3

    .line 99
    move v3, p4

    .line 100
    invoke-static/range {v0 .. v6}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resolveSubsequentPeriod(Landroidx/media3/common/o1;Landroidx/media3/common/m1;IZLjava/lang/Object;Landroidx/media3/common/p1;Landroidx/media3/common/p1;)I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eq v3, v7, :cond_5

    .line 105
    .line 106
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    move-object v0, p0

    .line 112
    move-object v1, p5

    .line 113
    move-object v2, p6

    .line 114
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/common/p1;->getPeriodPositionUs(Landroidx/media3/common/o1;Landroidx/media3/common/m1;IJ)Landroid/util/Pair;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    return-object v0

    .line 119
    :catch_0
    :cond_5
    return-object v8
.end method

.method public static resolveSubsequentPeriod(Landroidx/media3/common/o1;Landroidx/media3/common/m1;IZLjava/lang/Object;Landroidx/media3/common/p1;Landroidx/media3/common/p1;)I
    .locals 9

    .line 1
    invoke-virtual {p5, p4, p1}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Landroidx/media3/common/m1;->c:I

    .line 6
    .line 7
    invoke-virtual {p5, v0, p0}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, Landroidx/media3/common/o1;->a:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    :goto_0
    invoke-virtual {p6}, Landroidx/media3/common/p1;->getWindowCount()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-ge v2, v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {p6, v2, p0}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-object v3, v3, Landroidx/media3/common/o1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    return v2

    .line 34
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {p5, p4}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result p4

    .line 41
    invoke-virtual {p5}, Landroidx/media3/common/p1;->getPeriodCount()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/4 v2, -0x1

    .line 46
    move v4, p4

    .line 47
    move p4, v2

    .line 48
    :goto_1
    if-ge v1, v0, :cond_3

    .line 49
    .line 50
    if-ne p4, v2, :cond_3

    .line 51
    .line 52
    move-object v6, p0

    .line 53
    move-object v5, p1

    .line 54
    move v7, p2

    .line 55
    move v8, p3

    .line 56
    move-object v3, p5

    .line 57
    invoke-virtual/range {v3 .. v8}, Landroidx/media3/common/p1;->getNextPeriodIndex(ILandroidx/media3/common/m1;Landroidx/media3/common/o1;IZ)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-ne v4, v2, :cond_2

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-virtual {v3, v4}, Landroidx/media3/common/p1;->getUidOfPeriod(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p6, p0}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 69
    .line 70
    .line 71
    move-result p4

    .line 72
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    move-object p5, v3

    .line 75
    move-object p1, v5

    .line 76
    move-object p0, v6

    .line 77
    move p2, v7

    .line 78
    move p3, v8

    .line 79
    goto :goto_1

    .line 80
    :cond_3
    move-object v5, p1

    .line 81
    :goto_2
    if-ne p4, v2, :cond_4

    .line 82
    .line 83
    return v2

    .line 84
    :cond_4
    invoke-virtual {p6, p4, v5}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    iget p0, p0, Landroidx/media3/common/m1;->c:I

    .line 89
    .line 90
    return p0
.end method

.method private scheduleNextWork(J)V
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 2
    .line 3
    iget v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->dynamicSchedulingEnabled:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shouldPlayWhenReady()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    :cond_0
    const-wide/16 v0, 0x3e8

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    sget-wide v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->BUFFERING_MAXIMUM_INTERVAL_MS:J

    .line 22
    .line 23
    :goto_0
    iget-boolean v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->dynamicSchedulingEnabled:Z

    .line 24
    .line 25
    if-eqz v2, :cond_3

    .line 26
    .line 27
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shouldPlayWhenReady()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_3

    .line 32
    .line 33
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 34
    .line 35
    array-length v3, v2

    .line 36
    const/4 v4, 0x0

    .line 37
    :goto_1
    if-ge v4, v3, :cond_3

    .line 38
    .line 39
    aget-object v5, v2, v4

    .line 40
    .line 41
    invoke-static {v5}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isRendererEnabled(Landroidx/media3/exoplayer/Renderer;)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_2

    .line 46
    .line 47
    iget-wide v6, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J

    .line 48
    .line 49
    iget-wide v8, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionElapsedRealtimeUs:J

    .line 50
    .line 51
    invoke-interface {v5, v6, v7, v8, v9}, Landroidx/media3/exoplayer/Renderer;->getDurationToProgressUs(JJ)J

    .line 52
    .line 53
    .line 54
    move-result-wide v5

    .line 55
    invoke-static {v5, v6}, Lh1/i0;->f0(J)J

    .line 56
    .line 57
    .line 58
    move-result-wide v5

    .line 59
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 67
    .line 68
    add-long/2addr p1, v0

    .line 69
    check-cast v2, Lh1/b0;

    .line 70
    .line 71
    iget-object v0, v2, Lh1/b0;->a:Landroid/os/Handler;

    .line 72
    .line 73
    const/4 v1, 0x2

    .line 74
    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method private seekToCurrentPosition(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 8
    .line 9
    iget-object v2, v0, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 12
    .line 13
    iget-wide v3, v0, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    const/4 v6, 0x0

    .line 17
    move-object v1, p0

    .line 18
    invoke-direct/range {v1 .. v6}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->seekToPeriodPosition(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JZZ)J

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 23
    .line 24
    iget-wide v5, v0, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 25
    .line 26
    cmp-long v0, v3, v5

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 31
    .line 32
    iget-wide v5, v0, Landroidx/media3/exoplayer/PlaybackInfo;->requestedContentPositionUs:J

    .line 33
    .line 34
    iget-wide v7, v0, Landroidx/media3/exoplayer/PlaybackInfo;->discontinuityStartPositionUs:J

    .line 35
    .line 36
    const/4 v10, 0x5

    .line 37
    move v9, p1

    .line 38
    invoke-direct/range {v1 .. v10}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handlePositionDiscontinuity(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJJZI)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 43
    .line 44
    :cond_0
    return-void
.end method

.method private seekToInternal(Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfoUpdate:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;

    .line 4
    .line 5
    const/4 v9, 0x1

    .line 6
    invoke-virtual {v0, v9}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->incrementPendingOperationAcks(I)V

    .line 7
    .line 8
    .line 9
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 10
    .line 11
    iget-object v2, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 12
    .line 13
    iget v5, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->repeatMode:I

    .line 14
    .line 15
    iget-boolean v6, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shuffleModeEnabled:Z

    .line 16
    .line 17
    iget-object v7, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->window:Landroidx/media3/common/o1;

    .line 18
    .line 19
    iget-object v8, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->period:Landroidx/media3/common/m1;

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    move-object/from16 v3, p1

    .line 23
    .line 24
    invoke-static/range {v2 .. v8}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resolveSeekPositionUs(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;ZIZLandroidx/media3/common/o1;Landroidx/media3/common/m1;)Landroid/util/Pair;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    iget-object v8, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 37
    .line 38
    iget-object v8, v8, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 39
    .line 40
    invoke-direct {v1, v8}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->getPlaceholderFirstMediaPeriodPositionUs(Landroidx/media3/common/p1;)Landroid/util/Pair;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    iget-object v10, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v10, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 47
    .line 48
    iget-object v8, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v8, Ljava/lang/Long;

    .line 51
    .line 52
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v11

    .line 56
    iget-object v8, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 57
    .line 58
    iget-object v8, v8, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 59
    .line 60
    invoke-virtual {v8}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    xor-int/2addr v8, v9

    .line 65
    move-wide v5, v6

    .line 66
    :goto_0
    const-wide/16 v15, 0x0

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_0
    iget-object v8, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 70
    .line 71
    iget-object v10, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v10, Ljava/lang/Long;

    .line 74
    .line 75
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 76
    .line 77
    .line 78
    move-result-wide v11

    .line 79
    iget-wide v13, v3, Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;->windowPositionUs:J

    .line 80
    .line 81
    cmp-long v10, v13, v6

    .line 82
    .line 83
    if-nez v10, :cond_1

    .line 84
    .line 85
    move-wide v13, v6

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    move-wide v13, v11

    .line 88
    :goto_1
    iget-object v10, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 89
    .line 90
    iget-object v15, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 91
    .line 92
    iget-object v15, v15, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 93
    .line 94
    invoke-virtual {v10, v15, v8, v11, v12}, Landroidx/media3/exoplayer/MediaPeriodQueue;->resolveMediaPeriodIdForAdsAfterPeriodPositionChange(Landroidx/media3/common/p1;Ljava/lang/Object;J)Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    invoke-virtual {v10}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    if-eqz v8, :cond_3

    .line 103
    .line 104
    iget-object v6, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 105
    .line 106
    iget-object v6, v6, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 107
    .line 108
    iget-object v7, v10, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 109
    .line 110
    iget-object v8, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->period:Landroidx/media3/common/m1;

    .line 111
    .line 112
    invoke-virtual {v6, v7, v8}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 113
    .line 114
    .line 115
    iget-object v6, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->period:Landroidx/media3/common/m1;

    .line 116
    .line 117
    iget v7, v10, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 118
    .line 119
    invoke-virtual {v6, v7}, Landroidx/media3/common/m1;->f(I)I

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    iget v7, v10, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adIndexInAdGroup:I

    .line 124
    .line 125
    if-ne v6, v7, :cond_2

    .line 126
    .line 127
    iget-object v6, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->period:Landroidx/media3/common/m1;

    .line 128
    .line 129
    iget-object v6, v6, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 130
    .line 131
    iget-wide v6, v6, Landroidx/media3/common/c;->c:J

    .line 132
    .line 133
    move-wide v11, v6

    .line 134
    goto :goto_2

    .line 135
    :cond_2
    const-wide/16 v11, 0x0

    .line 136
    .line 137
    :goto_2
    move v8, v9

    .line 138
    move-wide v5, v13

    .line 139
    goto :goto_0

    .line 140
    :cond_3
    const-wide/16 v15, 0x0

    .line 141
    .line 142
    iget-wide v4, v3, Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;->windowPositionUs:J

    .line 143
    .line 144
    cmp-long v4, v4, v6

    .line 145
    .line 146
    if-nez v4, :cond_4

    .line 147
    .line 148
    move v8, v9

    .line 149
    goto :goto_3

    .line 150
    :cond_4
    move v8, v2

    .line 151
    :goto_3
    move-wide v5, v13

    .line 152
    :goto_4
    :try_start_0
    iget-object v4, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 153
    .line 154
    iget-object v4, v4, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 155
    .line 156
    invoke-virtual {v4}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-eqz v4, :cond_5

    .line 161
    .line 162
    iput-object v3, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingInitialSeekPosition:Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;

    .line 163
    .line 164
    goto :goto_6

    .line 165
    :catchall_0
    move-exception v0

    .line 166
    move v9, v8

    .line 167
    move-object v2, v10

    .line 168
    :goto_5
    move-wide v3, v11

    .line 169
    goto/16 :goto_f

    .line 170
    .line 171
    :cond_5
    const/4 v3, 0x4

    .line 172
    if-nez v0, :cond_7

    .line 173
    .line 174
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 175
    .line 176
    iget v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 177
    .line 178
    if-eq v0, v9, :cond_6

    .line 179
    .line 180
    invoke-direct {v1, v3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setState(I)V

    .line 181
    .line 182
    .line 183
    :cond_6
    invoke-direct {v1, v2, v9, v2, v9}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resetInternal(ZZZZ)V

    .line 184
    .line 185
    .line 186
    :goto_6
    move v9, v8

    .line 187
    move-object v2, v10

    .line 188
    move-wide v3, v11

    .line 189
    goto/16 :goto_d

    .line 190
    .line 191
    :cond_7
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 192
    .line 193
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 194
    .line 195
    invoke-virtual {v10, v0}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    if-eqz v0, :cond_b

    .line 200
    .line 201
    :try_start_1
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 202
    .line 203
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 204
    .line 205
    .line 206
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 207
    if-eqz v0, :cond_8

    .line 208
    .line 209
    :try_start_2
    iget-boolean v4, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepared:Z

    .line 210
    .line 211
    if-eqz v4, :cond_8

    .line 212
    .line 213
    cmp-long v4, v11, v15

    .line 214
    .line 215
    if-eqz v4, :cond_8

    .line 216
    .line 217
    iget-object v0, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->mediaPeriod:Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 218
    .line 219
    iget-object v4, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->seekParameters:Landroidx/media3/exoplayer/SeekParameters;

    .line 220
    .line 221
    invoke-interface {v0, v11, v12, v4}, Landroidx/media3/exoplayer/source/MediaPeriod;->getAdjustedSeekPositionUs(JLandroidx/media3/exoplayer/SeekParameters;)J

    .line 222
    .line 223
    .line 224
    move-result-wide v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 225
    goto :goto_7

    .line 226
    :cond_8
    move-wide v13, v11

    .line 227
    :goto_7
    :try_start_3
    invoke-static {v13, v14}, Lh1/i0;->f0(J)J

    .line 228
    .line 229
    .line 230
    move-result-wide v15

    .line 231
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 232
    .line 233
    move-object v4, v10

    .line 234
    :try_start_4
    iget-wide v9, v0, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 235
    .line 236
    invoke-static {v9, v10}, Lh1/i0;->f0(J)J

    .line 237
    .line 238
    .line 239
    move-result-wide v9

    .line 240
    cmp-long v0, v15, v9

    .line 241
    .line 242
    if-nez v0, :cond_9

    .line 243
    .line 244
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 245
    .line 246
    iget v9, v0, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 247
    .line 248
    const/4 v10, 0x2

    .line 249
    if-eq v9, v10, :cond_a

    .line 250
    .line 251
    const/4 v10, 0x3

    .line 252
    if-ne v9, v10, :cond_9

    .line 253
    .line 254
    goto :goto_8

    .line 255
    :cond_9
    move v9, v8

    .line 256
    goto :goto_b

    .line 257
    :cond_a
    :goto_8
    iget-wide v2, v0, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 258
    .line 259
    const/4 v10, 0x2

    .line 260
    move v9, v8

    .line 261
    move-wide v7, v2

    .line 262
    move-wide/from16 v17, v2

    .line 263
    .line 264
    move-object v2, v4

    .line 265
    move-wide/from16 v3, v17

    .line 266
    .line 267
    :goto_9
    invoke-direct/range {v1 .. v10}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handlePositionDiscontinuity(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJJZI)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    iput-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 272
    .line 273
    return-void

    .line 274
    :catchall_1
    move-exception v0

    .line 275
    move v9, v8

    .line 276
    :goto_a
    move-object v2, v4

    .line 277
    goto :goto_5

    .line 278
    :catchall_2
    move-exception v0

    .line 279
    move v9, v8

    .line 280
    move-object v4, v10

    .line 281
    goto :goto_a

    .line 282
    :cond_b
    move v9, v8

    .line 283
    move-object v4, v10

    .line 284
    move-wide v13, v11

    .line 285
    :goto_b
    :try_start_5
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 286
    .line 287
    iget v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 288
    .line 289
    if-ne v0, v3, :cond_c

    .line 290
    .line 291
    const/4 v0, 0x1

    .line 292
    goto :goto_c

    .line 293
    :cond_c
    move v0, v2

    .line 294
    :goto_c
    invoke-direct {v1, v4, v13, v14, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->seekToPeriodPosition(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JZ)J

    .line 295
    .line 296
    .line 297
    move-result-wide v13
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 298
    cmp-long v0, v11, v13

    .line 299
    .line 300
    if-eqz v0, :cond_d

    .line 301
    .line 302
    const/4 v2, 0x1

    .line 303
    :cond_d
    or-int/2addr v9, v2

    .line 304
    :try_start_6
    iget-object v0, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 305
    .line 306
    iget-object v2, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 307
    .line 308
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 309
    .line 310
    const/4 v8, 0x1

    .line 311
    move-object v3, v4

    .line 312
    move-object v4, v2

    .line 313
    move-wide v6, v5

    .line 314
    move-object v5, v0

    .line 315
    :try_start_7
    invoke-direct/range {v1 .. v8}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->updatePlaybackSpeedSettingsForNewPeriod(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JZ)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 316
    .line 317
    .line 318
    move-object v2, v3

    .line 319
    move-wide v5, v6

    .line 320
    move-wide v3, v13

    .line 321
    :goto_d
    const/4 v10, 0x2

    .line 322
    move-wide v7, v3

    .line 323
    move-object/from16 v1, p0

    .line 324
    .line 325
    goto :goto_9

    .line 326
    :catchall_3
    move-exception v0

    .line 327
    move-object v2, v3

    .line 328
    move-wide v5, v6

    .line 329
    :goto_e
    move-wide v3, v13

    .line 330
    goto :goto_f

    .line 331
    :catchall_4
    move-exception v0

    .line 332
    move-object v2, v4

    .line 333
    goto :goto_e

    .line 334
    :catchall_5
    move-exception v0

    .line 335
    goto :goto_a

    .line 336
    :goto_f
    const/4 v10, 0x2

    .line 337
    move-wide v7, v3

    .line 338
    invoke-direct/range {v1 .. v10}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handlePositionDiscontinuity(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJJZI)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    iput-object v2, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 343
    .line 344
    throw v0
.end method

.method private seekToPeriodPosition(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JZ)J
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    move-result-object v0

    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getReadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move v6, p4

    move v5, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 3
    :goto_1
    invoke-direct/range {v1 .. v6}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->seekToPeriodPosition(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JZZ)J

    move-result-wide p1

    return-wide p1
.end method

.method private seekToPeriodPosition(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JZZ)J
    .locals 5

    .line 4
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->stopRenderers()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 5
    invoke-direct {p0, v1, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->updateRebufferingState(ZZ)V

    const/4 v0, 0x2

    if-nez p5, :cond_0

    .line 6
    iget-object p5, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    iget p5, p5, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    const/4 v2, 0x3

    if-ne p5, v2, :cond_1

    .line 7
    :cond_0
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setState(I)V

    .line 8
    :cond_1
    iget-object p5, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    invoke-virtual {p5}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    move-result-object p5

    move-object v2, p5

    :goto_0
    if-eqz v2, :cond_3

    .line 9
    iget-object v3, v2, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    iget-object v3, v3, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    invoke-virtual {p1, v3}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    .line 10
    :cond_2
    invoke-virtual {v2}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    move-result-object v2

    goto :goto_0

    :cond_3
    :goto_1
    if-nez p4, :cond_4

    if-ne p5, v2, :cond_4

    if-eqz v2, :cond_7

    .line 11
    invoke-virtual {v2, p2, p3}, Landroidx/media3/exoplayer/MediaPeriodHolder;->toRendererTime(J)J

    move-result-wide p4

    const-wide/16 v3, 0x0

    cmp-long p1, p4, v3

    if-gez p1, :cond_7

    :cond_4
    move p1, v1

    .line 12
    :goto_2
    iget-object p4, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    array-length p4, p4

    if-ge p1, p4, :cond_5

    .line 13
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->disableRenderer(I)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_5
    if-eqz v2, :cond_7

    .line 14
    :goto_3
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    invoke-virtual {p1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    move-result-object p1

    if-eq p1, v2, :cond_6

    .line 15
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    invoke-virtual {p1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->advancePlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    goto :goto_3

    .line 16
    :cond_6
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    invoke-virtual {p1, v2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->removeAfter(Landroidx/media3/exoplayer/MediaPeriodHolder;)Z

    const-wide p4, 0xe8d4a51000L

    .line 17
    invoke-virtual {v2, p4, p5}, Landroidx/media3/exoplayer/MediaPeriodHolder;->setRendererOffset(J)V

    .line 18
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->enableRenderers()V

    :cond_7
    if-eqz v2, :cond_a

    .line 19
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    invoke-virtual {p1, v2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->removeAfter(Landroidx/media3/exoplayer/MediaPeriodHolder;)Z

    .line 20
    iget-boolean p1, v2, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepared:Z

    if-nez p1, :cond_8

    .line 21
    iget-object p1, v2, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 22
    invoke-virtual {p1, p2, p3}, Landroidx/media3/exoplayer/MediaPeriodInfo;->copyWithStartPositionUs(J)Landroidx/media3/exoplayer/MediaPeriodInfo;

    move-result-object p1

    iput-object p1, v2, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    goto :goto_4

    .line 23
    :cond_8
    iget-boolean p1, v2, Landroidx/media3/exoplayer/MediaPeriodHolder;->hasEnabledTracks:Z

    if-eqz p1, :cond_9

    .line 24
    iget-object p1, v2, Landroidx/media3/exoplayer/MediaPeriodHolder;->mediaPeriod:Landroidx/media3/exoplayer/source/MediaPeriod;

    invoke-interface {p1, p2, p3}, Landroidx/media3/exoplayer/source/MediaPeriod;->seekToUs(J)J

    move-result-wide p2

    .line 25
    iget-object p1, v2, Landroidx/media3/exoplayer/MediaPeriodHolder;->mediaPeriod:Landroidx/media3/exoplayer/source/MediaPeriod;

    iget-wide p4, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->backBufferDurationUs:J

    sub-long p4, p2, p4

    iget-boolean v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->retainBackBufferFromKeyframe:Z

    invoke-interface {p1, p4, p5, v2}, Landroidx/media3/exoplayer/source/MediaPeriod;->discardBuffer(JZ)V

    .line 26
    :cond_9
    :goto_4
    invoke-direct {p0, p2, p3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resetRendererPosition(J)V

    .line 27
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeContinueLoading()V

    goto :goto_5

    .line 28
    :cond_a
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    invoke-virtual {p1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->clear()V

    .line 29
    invoke-direct {p0, p2, p3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resetRendererPosition(J)V

    .line 30
    :goto_5
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleLoadingMediaPeriodChanged(Z)V

    .line 31
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    check-cast p1, Lh1/b0;

    invoke-virtual {p1, v0}, Lh1/b0;->g(I)Z

    return-wide p2
.end method

.method private sendMessageInternal(Landroidx/media3/exoplayer/PlayerMessage;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroidx/media3/exoplayer/PlayerMessage;->getPositionMs()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

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
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->sendMessageToTarget(Landroidx/media3/exoplayer/PlayerMessage;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 19
    .line 20
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingMessages:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;

    .line 31
    .line 32
    invoke-direct {v1, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;-><init>(Landroidx/media3/exoplayer/PlayerMessage;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    new-instance v2, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;

    .line 40
    .line 41
    invoke-direct {v2, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;-><init>(Landroidx/media3/exoplayer/PlayerMessage;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 45
    .line 46
    iget-object v3, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 47
    .line 48
    iget v5, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->repeatMode:I

    .line 49
    .line 50
    iget-boolean v6, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shuffleModeEnabled:Z

    .line 51
    .line 52
    iget-object v7, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->window:Landroidx/media3/common/o1;

    .line 53
    .line 54
    iget-object v8, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->period:Landroidx/media3/common/m1;

    .line 55
    .line 56
    move-object v4, v3

    .line 57
    invoke-static/range {v2 .. v8}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resolvePendingMessagePosition(Landroidx/media3/exoplayer/ExoPlayerImplInternal$PendingMessageInfo;Landroidx/media3/common/p1;Landroidx/media3/common/p1;IZLandroidx/media3/common/o1;Landroidx/media3/common/m1;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingMessages:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingMessages:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    const/4 v0, 0x0

    .line 75
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/PlayerMessage;->markAsProcessed(Z)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method private sendMessageToTarget(Landroidx/media3/exoplayer/PlayerMessage;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroidx/media3/exoplayer/PlayerMessage;->getLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackLooper:Landroid/os/Looper;

    .line 6
    .line 7
    if-ne v0, v1, :cond_2

    .line 8
    .line 9
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->deliverMessage(Landroidx/media3/exoplayer/PlayerMessage;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 13
    .line 14
    iget p1, p1, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 15
    .line 16
    const/4 v0, 0x3

    .line 17
    const/4 v1, 0x2

    .line 18
    if-eq p1, v0, :cond_1

    .line 19
    .line 20
    if-ne p1, v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void

    .line 24
    :cond_1
    :goto_0
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 25
    .line 26
    check-cast p1, Lh1/b0;

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Lh1/b0;->g(I)Z

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 33
    .line 34
    const/16 v1, 0xf

    .line 35
    .line 36
    check-cast v0, Lh1/b0;

    .line 37
    .line 38
    invoke-virtual {v0, v1, p1}, Lh1/b0;->c(ILjava/lang/Object;)Lh1/a0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Lh1/a0;->b()V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method private sendMessageToTargetThread(Landroidx/media3/exoplayer/PlayerMessage;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroidx/media3/exoplayer/PlayerMessage;->getLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const-string v0, "TAG"

    .line 16
    .line 17
    const-string v1, "Trying to send message on a dead thread."

    .line 18
    .line 19
    invoke-static {v0, v1}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/PlayerMessage;->markAsProcessed(Z)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->clock:Lh1/b;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    check-cast v1, Lh1/z;

    .line 31
    .line 32
    invoke-virtual {v1, v0, v2}, Lh1/z;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lh1/b0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, Landroidx/media3/exoplayer/s;

    .line 37
    .line 38
    const/4 v2, 0x1

    .line 39
    invoke-direct {v1, p0, v2, p1}, Landroidx/media3/exoplayer/s;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lh1/b0;->e(Ljava/lang/Runnable;)Z

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method private setAllRendererStreamsFinal(J)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-interface {v3}, Landroidx/media3/exoplayer/Renderer;->getStream()Landroidx/media3/exoplayer/source/SampleStream;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    invoke-direct {p0, v3, p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setCurrentStreamFinal(Landroidx/media3/exoplayer/Renderer;J)V

    .line 16
    .line 17
    .line 18
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    return-void
.end method

.method private setCurrentStreamFinal(Landroidx/media3/exoplayer/Renderer;J)V
    .locals 1

    .line 1
    invoke-interface {p1}, Landroidx/media3/exoplayer/Renderer;->setCurrentStreamFinal()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Landroidx/media3/exoplayer/text/TextRenderer;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p1, Landroidx/media3/exoplayer/text/TextRenderer;

    .line 9
    .line 10
    invoke-virtual {p1, p2, p3}, Landroidx/media3/exoplayer/text/TextRenderer;->setFinalStreamEndPositionUs(J)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method private setForegroundModeInternal(ZLjava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->foregroundMode:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->foregroundMode:Z

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 10
    .line 11
    array-length v0, p1

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_1

    .line 14
    .line 15
    aget-object v2, p1, v1

    .line 16
    .line 17
    invoke-static {v2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isRendererEnabled(Landroidx/media3/exoplayer/Renderer;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderersToReset:Ljava/util/Set;

    .line 24
    .line 25
    invoke-interface {v3, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-interface {v2}, Landroidx/media3/exoplayer/Renderer;->reset()V

    .line 32
    .line 33
    .line 34
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    if-eqz p2, :cond_2

    .line 38
    .line 39
    monitor-enter p0

    .line 40
    const/4 p1, 0x1

    .line 41
    :try_start_0
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 45
    .line 46
    .line 47
    monitor-exit p0

    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    throw p1

    .line 52
    :cond_2
    return-void
.end method

.method private setMediaClockPlaybackParameters(Landroidx/media3/common/y0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    check-cast v0, Lh1/b0;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lh1/b0;->f(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/DefaultMediaClock;->setPlaybackParameters(Landroidx/media3/common/y0;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private setMediaItemsInternal(Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfoUpdate:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->incrementPendingOperationAcks(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;->access$200(Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    new-instance v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;

    .line 15
    .line 16
    new-instance v1, Landroidx/media3/exoplayer/PlaylistTimeline;

    .line 17
    .line 18
    invoke-static {p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;->access$300(Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;->access$400(Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;)Landroidx/media3/exoplayer/source/ShuffleOrder;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-direct {v1, v2, v3}, Landroidx/media3/exoplayer/PlaylistTimeline;-><init>(Ljava/util/Collection;Landroidx/media3/exoplayer/source/ShuffleOrder;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;->access$200(Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-static {p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;->access$500(Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;-><init>(Landroidx/media3/common/p1;IJ)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingInitialSeekPosition:Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;

    .line 41
    .line 42
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaSourceList:Landroidx/media3/exoplayer/MediaSourceList;

    .line 43
    .line 44
    invoke-static {p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;->access$300(Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;->access$400(Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;)Landroidx/media3/exoplayer/source/ShuffleOrder;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v0, v1, p1}, Landroidx/media3/exoplayer/MediaSourceList;->setMediaSources(Ljava/util/List;Landroidx/media3/exoplayer/source/ShuffleOrder;)Landroidx/media3/common/p1;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const/4 v0, 0x0

    .line 57
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleMediaSourceListInfoRefreshed(Landroidx/media3/common/p1;Z)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method private setOffloadSchedulingEnabled(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->offloadSchedulingEnabled:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->offloadSchedulingEnabled:Z

    .line 7
    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 11
    .line 12
    iget-boolean p1, p1, Landroidx/media3/exoplayer/PlaybackInfo;->sleepingForOffload:Z

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    check-cast p1, Lh1/b0;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lh1/b0;->g(I)Z

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    return-void
.end method

.method private setPauseAtEndOfWindowInternal(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pauseAtEndOfWindow:Z

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resetPendingPauseAtEndOfPeriod()V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingPauseAtEndOfPeriod:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getReadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eq p1, v0, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->seekToCurrentPosition(Z)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleLoadingMediaPeriodChanged(Z)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method private setPlayWhenReadyInternal(ZIZI)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfoUpdate:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;

    .line 2
    .line 3
    invoke-virtual {v0, p3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->incrementPendingOperationAcks(I)V

    .line 4
    .line 5
    .line 6
    iget-object p3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 7
    .line 8
    invoke-virtual {p3, p1, p4, p2}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithPlayWhenReady(ZII)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    iput-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-direct {p0, p2, p2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->updateRebufferingState(ZZ)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->notifyTrackSelectionPlayWhenReadyChanged(Z)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shouldPlayWhenReady()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->stopRenderers()V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->updatePlaybackPositions()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 35
    .line 36
    iget p1, p1, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 37
    .line 38
    const/4 p2, 0x3

    .line 39
    const/4 p3, 0x2

    .line 40
    if-ne p1, p2, :cond_1

    .line 41
    .line 42
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 43
    .line 44
    invoke-virtual {p1}, Landroidx/media3/exoplayer/DefaultMediaClock;->start()V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->startRenderers()V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 51
    .line 52
    check-cast p1, Lh1/b0;

    .line 53
    .line 54
    invoke-virtual {p1, p3}, Lh1/b0;->g(I)Z

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    if-ne p1, p3, :cond_2

    .line 59
    .line 60
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 61
    .line 62
    check-cast p1, Lh1/b0;

    .line 63
    .line 64
    invoke-virtual {p1, p3}, Lh1/b0;->g(I)Z

    .line 65
    .line 66
    .line 67
    :cond_2
    return-void
.end method

.method private setPlaybackParametersInternal(Landroidx/media3/common/y0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setMediaClockPlaybackParameters(Landroidx/media3/common/y0;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/media3/exoplayer/DefaultMediaClock;->getPlaybackParameters()Landroidx/media3/common/y0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handlePlaybackParameters(Landroidx/media3/common/y0;Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private setPreloadConfigurationInternal(Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;)V
    .locals 2

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->preloadConfiguration:Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 6
    .line 7
    iget-object v1, v1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 8
    .line 9
    invoke-virtual {v0, v1, p1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->updatePreloadConfiguration(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private setRepeatModeInternal(I)V
    .locals 2

    .line 1
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->repeatMode:I

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 6
    .line 7
    iget-object v1, v1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 8
    .line 9
    invoke-virtual {v0, v1, p1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->updateRepeatMode(Landroidx/media3/common/p1;I)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->seekToCurrentPosition(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleLoadingMediaPeriodChanged(Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method private setSeekParametersInternal(Landroidx/media3/exoplayer/SeekParameters;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->seekParameters:Landroidx/media3/exoplayer/SeekParameters;

    .line 2
    .line 3
    return-void
.end method

.method private setShuffleModeEnabledInternal(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shuffleModeEnabled:Z

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 6
    .line 7
    iget-object v1, v1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 8
    .line 9
    invoke-virtual {v0, v1, p1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->updateShuffleModeEnabled(Landroidx/media3/common/p1;Z)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->seekToCurrentPosition(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleLoadingMediaPeriodChanged(Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method private setShuffleOrderInternal(Landroidx/media3/exoplayer/source/ShuffleOrder;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfoUpdate:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->incrementPendingOperationAcks(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaSourceList:Landroidx/media3/exoplayer/MediaSourceList;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/MediaSourceList;->setShuffleOrder(Landroidx/media3/exoplayer/source/ShuffleOrder;)Landroidx/media3/common/p1;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleMediaSourceListInfoRefreshed(Landroidx/media3/common/p1;Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private setState(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 2
    .line 3
    iget v1, v0, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq p1, v1, :cond_0

    .line 9
    .line 10
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackMaybeBecameStuckAtMs:J

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithPlaybackState(I)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method private shouldAdvancePlayingPeriod()Z
    .locals 6

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shouldPlayWhenReady()Z

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
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingPauseAtEndOfPeriod:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    return v1

    .line 14
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    return v1

    .line 23
    :cond_2
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    iget-wide v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J

    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getStartPositionRendererTime()J

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    cmp-long v2, v2, v4

    .line 36
    .line 37
    if-ltz v2, :cond_3

    .line 38
    .line 39
    iget-boolean v0, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->allRenderersInCorrectState:Z

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    return v0

    .line 45
    :cond_3
    return v1
.end method

.method private shouldContinueLoading()Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getLoadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isLoadingPossible(Landroidx/media3/exoplayer/MediaPeriodHolder;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    return v2

    .line 17
    :cond_0
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getLoadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNextLoadPositionUs()J

    .line 24
    .line 25
    .line 26
    move-result-wide v3

    .line 27
    invoke-direct {v0, v3, v4}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->getTotalBufferedDurationUs(J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v11

    .line 31
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 32
    .line 33
    invoke-virtual {v3}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-ne v1, v3, :cond_1

    .line 38
    .line 39
    iget-wide v3, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J

    .line 40
    .line 41
    invoke-virtual {v1, v3, v4}, Landroidx/media3/exoplayer/MediaPeriodHolder;->toPeriodTime(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    :goto_0
    move-wide v9, v3

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    iget-wide v3, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J

    .line 48
    .line 49
    invoke-virtual {v1, v3, v4}, Landroidx/media3/exoplayer/MediaPeriodHolder;->toPeriodTime(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v3

    .line 53
    iget-object v5, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 54
    .line 55
    iget-wide v5, v5, Landroidx/media3/exoplayer/MediaPeriodInfo;->startPositionUs:J

    .line 56
    .line 57
    sub-long/2addr v3, v5

    .line 58
    goto :goto_0

    .line 59
    :goto_1
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 60
    .line 61
    iget-object v3, v3, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 62
    .line 63
    iget-object v4, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 64
    .line 65
    iget-object v4, v4, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 66
    .line 67
    invoke-direct {v0, v3, v4}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shouldUseLivePlaybackSpeedControl(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_2

    .line 72
    .line 73
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->livePlaybackSpeedControl:Landroidx/media3/exoplayer/LivePlaybackSpeedControl;

    .line 74
    .line 75
    invoke-interface {v3}, Landroidx/media3/exoplayer/LivePlaybackSpeedControl;->getTargetLiveOffsetUs()J

    .line 76
    .line 77
    .line 78
    move-result-wide v3

    .line 79
    :goto_2
    move-wide/from16 v16, v3

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_2
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :goto_3
    new-instance v5, Landroidx/media3/exoplayer/LoadControl$Parameters;

    .line 89
    .line 90
    iget-object v6, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playerId:Landroidx/media3/exoplayer/analytics/PlayerId;

    .line 91
    .line 92
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 93
    .line 94
    iget-object v7, v3, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 95
    .line 96
    iget-object v1, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 97
    .line 98
    iget-object v8, v1, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 99
    .line 100
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 101
    .line 102
    invoke-virtual {v1}, Landroidx/media3/exoplayer/DefaultMediaClock;->getPlaybackParameters()Landroidx/media3/common/y0;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    iget v13, v1, Landroidx/media3/common/y0;->a:F

    .line 107
    .line 108
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 109
    .line 110
    iget-boolean v14, v1, Landroidx/media3/exoplayer/PlaybackInfo;->playWhenReady:Z

    .line 111
    .line 112
    iget-boolean v15, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isRebuffering:Z

    .line 113
    .line 114
    invoke-direct/range {v5 .. v17}, Landroidx/media3/exoplayer/LoadControl$Parameters;-><init>(Landroidx/media3/exoplayer/analytics/PlayerId;Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJFZZJ)V

    .line 115
    .line 116
    .line 117
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->loadControl:Landroidx/media3/exoplayer/LoadControl;

    .line 118
    .line 119
    invoke-interface {v1, v5}, Landroidx/media3/exoplayer/LoadControl;->shouldContinueLoading(Landroidx/media3/exoplayer/LoadControl$Parameters;)Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 124
    .line 125
    invoke-virtual {v3}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    if-nez v1, :cond_4

    .line 130
    .line 131
    iget-boolean v4, v3, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepared:Z

    .line 132
    .line 133
    if-eqz v4, :cond_4

    .line 134
    .line 135
    const-wide/32 v6, 0x7a120

    .line 136
    .line 137
    .line 138
    cmp-long v4, v11, v6

    .line 139
    .line 140
    if-gez v4, :cond_4

    .line 141
    .line 142
    iget-wide v6, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->backBufferDurationUs:J

    .line 143
    .line 144
    const-wide/16 v8, 0x0

    .line 145
    .line 146
    cmp-long v4, v6, v8

    .line 147
    .line 148
    if-gtz v4, :cond_3

    .line 149
    .line 150
    iget-boolean v4, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->retainBackBufferFromKeyframe:Z

    .line 151
    .line 152
    if-eqz v4, :cond_4

    .line 153
    .line 154
    :cond_3
    iget-object v1, v3, Landroidx/media3/exoplayer/MediaPeriodHolder;->mediaPeriod:Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 155
    .line 156
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 157
    .line 158
    iget-wide v3, v3, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 159
    .line 160
    invoke-interface {v1, v3, v4, v2}, Landroidx/media3/exoplayer/source/MediaPeriod;->discardBuffer(JZ)V

    .line 161
    .line 162
    .line 163
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->loadControl:Landroidx/media3/exoplayer/LoadControl;

    .line 164
    .line 165
    invoke-interface {v1, v5}, Landroidx/media3/exoplayer/LoadControl;->shouldContinueLoading(Landroidx/media3/exoplayer/LoadControl$Parameters;)Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    :cond_4
    return v1
.end method

.method private shouldPlayWhenReady()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/media3/exoplayer/PlaybackInfo;->playWhenReady:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->playbackSuppressionReason:I

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method private shouldTransitionToReadyState(Z)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->enabledRendererCount:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isTimelineReady()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    return v1

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 17
    .line 18
    iget-boolean v2, v2, Landroidx/media3/exoplayer/PlaybackInfo;->isLoading:Z

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    if-nez v2, :cond_2

    .line 22
    .line 23
    return v3

    .line 24
    :cond_2
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 25
    .line 26
    invoke-virtual {v2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget-object v4, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 31
    .line 32
    iget-object v4, v4, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 33
    .line 34
    iget-object v5, v2, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 35
    .line 36
    iget-object v5, v5, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 37
    .line 38
    invoke-direct {v0, v4, v5}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shouldUseLivePlaybackSpeedControl(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_3

    .line 43
    .line 44
    iget-object v4, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->livePlaybackSpeedControl:Landroidx/media3/exoplayer/LivePlaybackSpeedControl;

    .line 45
    .line 46
    invoke-interface {v4}, Landroidx/media3/exoplayer/LivePlaybackSpeedControl;->getTargetLiveOffsetUs()J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    :goto_0
    move-wide/from16 v17, v4

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :goto_1
    iget-object v4, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 60
    .line 61
    invoke-virtual {v4}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getLoadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v4}, Landroidx/media3/exoplayer/MediaPeriodHolder;->isFullyBuffered()Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz v5, :cond_4

    .line 70
    .line 71
    iget-object v5, v4, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 72
    .line 73
    iget-boolean v5, v5, Landroidx/media3/exoplayer/MediaPeriodInfo;->isFinal:Z

    .line 74
    .line 75
    if-eqz v5, :cond_4

    .line 76
    .line 77
    move v5, v3

    .line 78
    goto :goto_2

    .line 79
    :cond_4
    move v5, v1

    .line 80
    :goto_2
    iget-object v6, v4, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 81
    .line 82
    iget-object v6, v6, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 83
    .line 84
    invoke-virtual {v6}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-eqz v6, :cond_5

    .line 89
    .line 90
    iget-boolean v6, v4, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepared:Z

    .line 91
    .line 92
    if-nez v6, :cond_5

    .line 93
    .line 94
    move v1, v3

    .line 95
    :cond_5
    if-nez v5, :cond_7

    .line 96
    .line 97
    if-eqz v1, :cond_6

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_6
    invoke-virtual {v4}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getBufferedPositionUs()J

    .line 101
    .line 102
    .line 103
    move-result-wide v3

    .line 104
    invoke-direct {v0, v3, v4}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->getTotalBufferedDurationUs(J)J

    .line 105
    .line 106
    .line 107
    move-result-wide v12

    .line 108
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->loadControl:Landroidx/media3/exoplayer/LoadControl;

    .line 109
    .line 110
    new-instance v6, Landroidx/media3/exoplayer/LoadControl$Parameters;

    .line 111
    .line 112
    iget-object v7, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playerId:Landroidx/media3/exoplayer/analytics/PlayerId;

    .line 113
    .line 114
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 115
    .line 116
    iget-object v8, v3, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 117
    .line 118
    iget-object v3, v2, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 119
    .line 120
    iget-object v9, v3, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 121
    .line 122
    iget-wide v3, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J

    .line 123
    .line 124
    invoke-virtual {v2, v3, v4}, Landroidx/media3/exoplayer/MediaPeriodHolder;->toPeriodTime(J)J

    .line 125
    .line 126
    .line 127
    move-result-wide v10

    .line 128
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 129
    .line 130
    invoke-virtual {v2}, Landroidx/media3/exoplayer/DefaultMediaClock;->getPlaybackParameters()Landroidx/media3/common/y0;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    iget v14, v2, Landroidx/media3/common/y0;->a:F

    .line 135
    .line 136
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 137
    .line 138
    iget-boolean v15, v2, Landroidx/media3/exoplayer/PlaybackInfo;->playWhenReady:Z

    .line 139
    .line 140
    iget-boolean v2, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isRebuffering:Z

    .line 141
    .line 142
    move/from16 v16, v2

    .line 143
    .line 144
    invoke-direct/range {v6 .. v18}, Landroidx/media3/exoplayer/LoadControl$Parameters;-><init>(Landroidx/media3/exoplayer/analytics/PlayerId;Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJFZZJ)V

    .line 145
    .line 146
    .line 147
    invoke-interface {v1, v6}, Landroidx/media3/exoplayer/LoadControl;->shouldStartPlayback(Landroidx/media3/exoplayer/LoadControl$Parameters;)Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    return v1

    .line 152
    :cond_7
    :goto_3
    return v3
.end method

.method private shouldUseLivePlaybackSpeedControl(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Z
    .locals 4

    .line 1
    invoke-virtual {p2}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object p2, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->period:Landroidx/media3/common/m1;

    .line 18
    .line 19
    invoke-virtual {p1, p2, v0}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iget p2, p2, Landroidx/media3/common/m1;->c:I

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->window:Landroidx/media3/common/o1;

    .line 26
    .line 27
    invoke-virtual {p1, p2, v0}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->window:Landroidx/media3/common/o1;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/media3/common/o1;->a()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->window:Landroidx/media3/common/o1;

    .line 39
    .line 40
    iget-boolean p2, p1, Landroidx/media3/common/o1;->i:Z

    .line 41
    .line 42
    if-eqz p2, :cond_1

    .line 43
    .line 44
    iget-wide p1, p1, Landroidx/media3/common/o1;->f:J

    .line 45
    .line 46
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    cmp-long p1, p1, v2

    .line 52
    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    return p1

    .line 57
    :cond_1
    :goto_0
    return v1
.end method

.method private startRenderers()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getTrackSelectorResult()Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 16
    .line 17
    array-length v2, v2

    .line 18
    if-ge v1, v2, :cond_2

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->isRendererEnabled(I)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 27
    .line 28
    aget-object v2, v2, v1

    .line 29
    .line 30
    invoke-interface {v2}, Landroidx/media3/exoplayer/Renderer;->getState()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/4 v3, 0x1

    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 38
    .line 39
    aget-object v2, v2, v1

    .line 40
    .line 41
    invoke-interface {v2}, Landroidx/media3/exoplayer/Renderer;->start()V

    .line 42
    .line 43
    .line 44
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    :goto_1
    return-void
.end method

.method private stopInternal(ZZ)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->foregroundMode:Z

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p1, v1

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    move p1, v0

    .line 13
    :goto_1
    invoke-direct {p0, p1, v1, v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resetInternal(ZZZZ)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfoUpdate:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->incrementPendingOperationAcks(I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->loadControl:Landroidx/media3/exoplayer/LoadControl;

    .line 22
    .line 23
    iget-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playerId:Landroidx/media3/exoplayer/analytics/PlayerId;

    .line 24
    .line 25
    invoke-interface {p1, p2}, Landroidx/media3/exoplayer/LoadControl;->onStopped(Landroidx/media3/exoplayer/analytics/PlayerId;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setState(I)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private stopRenderers()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/DefaultMediaClock;->stop()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->renderers:[Landroidx/media3/exoplayer/Renderer;

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_1

    .line 11
    .line 12
    aget-object v3, v0, v2

    .line 13
    .line 14
    invoke-static {v3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isRendererEnabled(Landroidx/media3/exoplayer/Renderer;)Z

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    invoke-direct {p0, v3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->ensureStopped(Landroidx/media3/exoplayer/Renderer;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return-void
.end method

.method private updateIsLoading()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getLoadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shouldContinueLoading:Z

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, Landroidx/media3/exoplayer/MediaPeriodHolder;->mediaPeriod:Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 14
    .line 15
    invoke-interface {v0}, Landroidx/media3/exoplayer/source/MediaPeriod;->isLoading()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 25
    :goto_1
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 26
    .line 27
    iget-boolean v2, v1, Landroidx/media3/exoplayer/PlaybackInfo;->isLoading:Z

    .line 28
    .line 29
    if-eq v0, v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithIsLoading(Z)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 36
    .line 37
    :cond_2
    return-void
.end method

.method private updateLoadControlTrackSelection(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;Landroidx/media3/exoplayer/source/TrackGroupArray;Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getLoadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 13
    .line 14
    invoke-virtual {v2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    iget-wide v2, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J

    .line 21
    .line 22
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/MediaPeriodHolder;->toPeriodTime(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    :goto_0
    move-wide v8, v2

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    iget-wide v2, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J

    .line 29
    .line 30
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/MediaPeriodHolder;->toPeriodTime(J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    iget-object v4, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 35
    .line 36
    iget-wide v4, v4, Landroidx/media3/exoplayer/MediaPeriodInfo;->startPositionUs:J

    .line 37
    .line 38
    sub-long/2addr v2, v4

    .line 39
    goto :goto_0

    .line 40
    :goto_1
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getBufferedPositionUs()J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    invoke-direct {v0, v2, v3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->getTotalBufferedDurationUs(J)J

    .line 45
    .line 46
    .line 47
    move-result-wide v10

    .line 48
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 49
    .line 50
    iget-object v2, v2, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 51
    .line 52
    iget-object v1, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 53
    .line 54
    iget-object v1, v1, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 55
    .line 56
    invoke-direct {v0, v2, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shouldUseLivePlaybackSpeedControl(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->livePlaybackSpeedControl:Landroidx/media3/exoplayer/LivePlaybackSpeedControl;

    .line 63
    .line 64
    invoke-interface {v1}, Landroidx/media3/exoplayer/LivePlaybackSpeedControl;->getTargetLiveOffsetUs()J

    .line 65
    .line 66
    .line 67
    move-result-wide v1

    .line 68
    :goto_2
    move-wide v15, v1

    .line 69
    goto :goto_3

    .line 70
    :cond_1
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :goto_3
    iget-object v1, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->loadControl:Landroidx/media3/exoplayer/LoadControl;

    .line 77
    .line 78
    new-instance v4, Landroidx/media3/exoplayer/LoadControl$Parameters;

    .line 79
    .line 80
    iget-object v5, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playerId:Landroidx/media3/exoplayer/analytics/PlayerId;

    .line 81
    .line 82
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 83
    .line 84
    iget-object v6, v2, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 85
    .line 86
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 87
    .line 88
    invoke-virtual {v2}, Landroidx/media3/exoplayer/DefaultMediaClock;->getPlaybackParameters()Landroidx/media3/common/y0;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    iget v12, v2, Landroidx/media3/common/y0;->a:F

    .line 93
    .line 94
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 95
    .line 96
    iget-boolean v13, v2, Landroidx/media3/exoplayer/PlaybackInfo;->playWhenReady:Z

    .line 97
    .line 98
    iget-boolean v14, v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isRebuffering:Z

    .line 99
    .line 100
    move-object/from16 v7, p1

    .line 101
    .line 102
    invoke-direct/range {v4 .. v16}, Landroidx/media3/exoplayer/LoadControl$Parameters;-><init>(Landroidx/media3/exoplayer/analytics/PlayerId;Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJFZZJ)V

    .line 103
    .line 104
    .line 105
    move-object/from16 v2, p3

    .line 106
    .line 107
    iget-object v2, v2, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->selections:[Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;

    .line 108
    .line 109
    move-object/from16 v3, p2

    .line 110
    .line 111
    invoke-interface {v1, v4, v3, v2}, Landroidx/media3/exoplayer/LoadControl;->onTracksSelected(Landroidx/media3/exoplayer/LoadControl$Parameters;Landroidx/media3/exoplayer/source/TrackGroupArray;[Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method private updateMediaSourcesWithMediaItemsInternal(IILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Landroidx/media3/common/o0;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfoUpdate:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->incrementPendingOperationAcks(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaSourceList:Landroidx/media3/exoplayer/MediaSourceList;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, Landroidx/media3/exoplayer/MediaSourceList;->updateMediaSourcesWithMediaItems(IILjava/util/List;)Landroidx/media3/common/p1;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 p2, 0x0

    .line 14
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleMediaSourceListInfoRefreshed(Landroidx/media3/common/p1;Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private updatePeriods()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaSourceList:Landroidx/media3/exoplayer/MediaSourceList;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaSourceList;->isPrepared()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeUpdateLoadingPeriod()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeUpdateReadingPeriod()V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeUpdateReadingRenderers()V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeUpdatePlayingPeriod()V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeUpdatePreloadPeriods(Z)V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void
.end method

.method private updatePlaybackPositions()V
    .locals 13

    .line 1
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    .line 3
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    iget-boolean v2, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->prepared:Z

    .line 12
    .line 13
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget-object v2, v1, Landroidx/media3/exoplayer/MediaPeriodHolder;->mediaPeriod:Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 21
    .line 22
    invoke-interface {v2}, Landroidx/media3/exoplayer/source/MediaPeriod;->readDiscontinuity()J

    .line 23
    .line 24
    .line 25
    move-result-wide v5

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-wide v5, v3

    .line 28
    :goto_0
    cmp-long v2, v5, v3

    .line 29
    .line 30
    const/4 v10, 0x0

    .line 31
    if-eqz v2, :cond_3

    .line 32
    .line 33
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->isFullyBuffered()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 40
    .line 41
    invoke-virtual {v2, v1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->removeAfter(Landroidx/media3/exoplayer/MediaPeriodHolder;)Z

    .line 42
    .line 43
    .line 44
    invoke-direct {p0, v10}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleLoadingMediaPeriodChanged(Z)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeContinueLoading()V

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-direct {p0, v5, v6}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->resetRendererPosition(J)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 54
    .line 55
    iget-wide v1, v1, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 56
    .line 57
    cmp-long v1, v5, v1

    .line 58
    .line 59
    if-eqz v1, :cond_6

    .line 60
    .line 61
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 62
    .line 63
    iget-object v2, v1, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 64
    .line 65
    iget-wide v3, v1, Landroidx/media3/exoplayer/PlaybackInfo;->requestedContentPositionUs:J

    .line 66
    .line 67
    const/4 v8, 0x1

    .line 68
    const/4 v9, 0x5

    .line 69
    move-object v1, v2

    .line 70
    move-wide v11, v5

    .line 71
    move-wide v4, v3

    .line 72
    move-wide v2, v11

    .line 73
    move-wide v6, v2

    .line 74
    move-object v0, p0

    .line 75
    invoke-direct/range {v0 .. v9}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handlePositionDiscontinuity(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJJZI)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iput-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 83
    .line 84
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 85
    .line 86
    invoke-virtual {v3}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getReadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    const/4 v4, 0x1

    .line 91
    if-eq v1, v3, :cond_4

    .line 92
    .line 93
    move v3, v4

    .line 94
    goto :goto_1

    .line 95
    :cond_4
    move v3, v10

    .line 96
    :goto_1
    invoke-virtual {v2, v3}, Landroidx/media3/exoplayer/DefaultMediaClock;->syncAndGetPositionUs(Z)J

    .line 97
    .line 98
    .line 99
    move-result-wide v2

    .line 100
    iput-wide v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->rendererPositionUs:J

    .line 101
    .line 102
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/MediaPeriodHolder;->toPeriodTime(J)J

    .line 103
    .line 104
    .line 105
    move-result-wide v2

    .line 106
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 107
    .line 108
    iget-wide v5, v1, Landroidx/media3/exoplayer/PlaybackInfo;->positionUs:J

    .line 109
    .line 110
    invoke-direct {p0, v5, v6, v2, v3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeTriggerPendingMessages(JJ)V

    .line 111
    .line 112
    .line 113
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 114
    .line 115
    invoke-virtual {v1}, Landroidx/media3/exoplayer/DefaultMediaClock;->hasSkippedSilenceSinceLastCall()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_5

    .line 120
    .line 121
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfoUpdate:Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;

    .line 122
    .line 123
    iget-boolean v1, v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;->positionDiscontinuity:Z

    .line 124
    .line 125
    xor-int/lit8 v8, v1, 0x1

    .line 126
    .line 127
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 128
    .line 129
    iget-object v4, v1, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 130
    .line 131
    iget-wide v5, v1, Landroidx/media3/exoplayer/PlaybackInfo;->requestedContentPositionUs:J

    .line 132
    .line 133
    const/4 v9, 0x6

    .line 134
    move-object v1, v4

    .line 135
    move-wide v4, v5

    .line 136
    move-wide v6, v2

    .line 137
    move-object v0, p0

    .line 138
    invoke-direct/range {v0 .. v9}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handlePositionDiscontinuity(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJJZI)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    iput-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_5
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 146
    .line 147
    invoke-virtual {v1, v2, v3}, Landroidx/media3/exoplayer/PlaybackInfo;->updatePositionUs(J)V

    .line 148
    .line 149
    .line 150
    :cond_6
    :goto_2
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 151
    .line 152
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getLoadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 157
    .line 158
    invoke-virtual {v1}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getBufferedPositionUs()J

    .line 159
    .line 160
    .line 161
    move-result-wide v3

    .line 162
    iput-wide v3, v2, Landroidx/media3/exoplayer/PlaybackInfo;->bufferedPositionUs:J

    .line 163
    .line 164
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 165
    .line 166
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->getTotalBufferedDurationUs()J

    .line 167
    .line 168
    .line 169
    move-result-wide v2

    .line 170
    iput-wide v2, v1, Landroidx/media3/exoplayer/PlaybackInfo;->totalBufferedDurationUs:J

    .line 171
    .line 172
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 173
    .line 174
    iget-boolean v2, v1, Landroidx/media3/exoplayer/PlaybackInfo;->playWhenReady:Z

    .line 175
    .line 176
    if-eqz v2, :cond_7

    .line 177
    .line 178
    iget v2, v1, Landroidx/media3/exoplayer/PlaybackInfo;->playbackState:I

    .line 179
    .line 180
    const/4 v3, 0x3

    .line 181
    if-ne v2, v3, :cond_7

    .line 182
    .line 183
    iget-object v2, v1, Landroidx/media3/exoplayer/PlaybackInfo;->timeline:Landroidx/media3/common/p1;

    .line 184
    .line 185
    iget-object v1, v1, Landroidx/media3/exoplayer/PlaybackInfo;->periodId:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 186
    .line 187
    invoke-direct {p0, v2, v1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shouldUseLivePlaybackSpeedControl(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-eqz v1, :cond_7

    .line 192
    .line 193
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 194
    .line 195
    iget-object v1, v1, Landroidx/media3/exoplayer/PlaybackInfo;->playbackParameters:Landroidx/media3/common/y0;

    .line 196
    .line 197
    iget v1, v1, Landroidx/media3/common/y0;->a:F

    .line 198
    .line 199
    const/high16 v2, 0x3f800000    # 1.0f

    .line 200
    .line 201
    cmpl-float v1, v1, v2

    .line 202
    .line 203
    if-nez v1, :cond_7

    .line 204
    .line 205
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->livePlaybackSpeedControl:Landroidx/media3/exoplayer/LivePlaybackSpeedControl;

    .line 206
    .line 207
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->getCurrentLiveOffsetUs()J

    .line 208
    .line 209
    .line 210
    move-result-wide v2

    .line 211
    iget-object v4, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 212
    .line 213
    iget-wide v4, v4, Landroidx/media3/exoplayer/PlaybackInfo;->totalBufferedDurationUs:J

    .line 214
    .line 215
    invoke-interface {v1, v2, v3, v4, v5}, Landroidx/media3/exoplayer/LivePlaybackSpeedControl;->getAdjustedPlaybackSpeed(JJ)F

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 220
    .line 221
    invoke-virtual {v2}, Landroidx/media3/exoplayer/DefaultMediaClock;->getPlaybackParameters()Landroidx/media3/common/y0;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    iget v2, v2, Landroidx/media3/common/y0;->a:F

    .line 226
    .line 227
    cmpl-float v2, v2, v1

    .line 228
    .line 229
    if-eqz v2, :cond_7

    .line 230
    .line 231
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 232
    .line 233
    iget-object v2, v2, Landroidx/media3/exoplayer/PlaybackInfo;->playbackParameters:Landroidx/media3/common/y0;

    .line 234
    .line 235
    new-instance v3, Landroidx/media3/common/y0;

    .line 236
    .line 237
    iget v2, v2, Landroidx/media3/common/y0;->b:F

    .line 238
    .line 239
    invoke-direct {v3, v1, v2}, Landroidx/media3/common/y0;-><init>(FF)V

    .line 240
    .line 241
    .line 242
    invoke-direct {p0, v3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setMediaClockPlaybackParameters(Landroidx/media3/common/y0;)V

    .line 243
    .line 244
    .line 245
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 246
    .line 247
    iget-object v1, v1, Landroidx/media3/exoplayer/PlaybackInfo;->playbackParameters:Landroidx/media3/common/y0;

    .line 248
    .line 249
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 250
    .line 251
    invoke-virtual {v2}, Landroidx/media3/exoplayer/DefaultMediaClock;->getPlaybackParameters()Landroidx/media3/common/y0;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    iget v2, v2, Landroidx/media3/common/y0;->a:F

    .line 256
    .line 257
    invoke-direct {p0, v1, v2, v10, v10}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handlePlaybackParameters(Landroidx/media3/common/y0;FZZ)V

    .line 258
    .line 259
    .line 260
    :cond_7
    :goto_3
    return-void
.end method

.method private updatePlaybackSpeedSettingsForNewPeriod(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JZ)V
    .locals 3

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->shouldUseLivePlaybackSpeedControl(Landroidx/media3/common/p1;Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p2}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    sget-object p1, Landroidx/media3/common/y0;->d:Landroidx/media3/common/y0;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 17
    .line 18
    iget-object p1, p1, Landroidx/media3/exoplayer/PlaybackInfo;->playbackParameters:Landroidx/media3/common/y0;

    .line 19
    .line 20
    :goto_0
    iget-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaClock:Landroidx/media3/exoplayer/DefaultMediaClock;

    .line 21
    .line 22
    invoke-virtual {p2}, Landroidx/media3/exoplayer/DefaultMediaClock;->getPlaybackParameters()Landroidx/media3/common/y0;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p2, p1}, Landroidx/media3/common/y0;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-nez p2, :cond_4

    .line 31
    .line 32
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setMediaClockPlaybackParameters(Landroidx/media3/common/y0;)V

    .line 33
    .line 34
    .line 35
    iget-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 36
    .line 37
    iget-object p2, p2, Landroidx/media3/exoplayer/PlaybackInfo;->playbackParameters:Landroidx/media3/common/y0;

    .line 38
    .line 39
    iget p1, p1, Landroidx/media3/common/y0;->a:F

    .line 40
    .line 41
    const/4 p3, 0x0

    .line 42
    invoke-direct {p0, p2, p1, p3, p3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handlePlaybackParameters(Landroidx/media3/common/y0;FZZ)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    iget-object v0, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 47
    .line 48
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->period:Landroidx/media3/common/m1;

    .line 49
    .line 50
    invoke-virtual {p1, v0, v1}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget v0, v0, Landroidx/media3/common/m1;->c:I

    .line 55
    .line 56
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->window:Landroidx/media3/common/o1;

    .line 57
    .line 58
    invoke-virtual {p1, v0, v1}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->livePlaybackSpeedControl:Landroidx/media3/exoplayer/LivePlaybackSpeedControl;

    .line 62
    .line 63
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->window:Landroidx/media3/common/o1;

    .line 64
    .line 65
    iget-object v1, v1, Landroidx/media3/common/o1;->j:Landroidx/media3/common/i0;

    .line 66
    .line 67
    invoke-interface {v0, v1}, Landroidx/media3/exoplayer/LivePlaybackSpeedControl;->setLiveConfiguration(Landroidx/media3/common/i0;)V

    .line 68
    .line 69
    .line 70
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    cmp-long v2, p5, v0

    .line 76
    .line 77
    if-eqz v2, :cond_2

    .line 78
    .line 79
    iget-object p3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->livePlaybackSpeedControl:Landroidx/media3/exoplayer/LivePlaybackSpeedControl;

    .line 80
    .line 81
    iget-object p2, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 82
    .line 83
    invoke-direct {p0, p1, p2, p5, p6}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->getLiveOffsetUs(Landroidx/media3/common/p1;Ljava/lang/Object;J)J

    .line 84
    .line 85
    .line 86
    move-result-wide p1

    .line 87
    invoke-interface {p3, p1, p2}, Landroidx/media3/exoplayer/LivePlaybackSpeedControl;->setTargetLiveOffsetOverrideUs(J)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_2
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->window:Landroidx/media3/common/o1;

    .line 92
    .line 93
    iget-object p1, p1, Landroidx/media3/common/o1;->a:Ljava/lang/Object;

    .line 94
    .line 95
    invoke-virtual {p3}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-nez p2, :cond_3

    .line 100
    .line 101
    iget-object p2, p4, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->periodUid:Ljava/lang/Object;

    .line 102
    .line 103
    iget-object p4, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->period:Landroidx/media3/common/m1;

    .line 104
    .line 105
    invoke-virtual {p3, p2, p4}, Landroidx/media3/common/p1;->getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    iget p2, p2, Landroidx/media3/common/m1;->c:I

    .line 110
    .line 111
    iget-object p4, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->window:Landroidx/media3/common/o1;

    .line 112
    .line 113
    invoke-virtual {p3, p2, p4}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    iget-object p2, p2, Landroidx/media3/common/o1;->a:Ljava/lang/Object;

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_3
    const/4 p2, 0x0

    .line 121
    :goto_1
    invoke-static {p2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-eqz p1, :cond_5

    .line 126
    .line 127
    if-eqz p7, :cond_4

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_4
    return-void

    .line 131
    :cond_5
    :goto_2
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->livePlaybackSpeedControl:Landroidx/media3/exoplayer/LivePlaybackSpeedControl;

    .line 132
    .line 133
    invoke-interface {p1, v0, v1}, Landroidx/media3/exoplayer/LivePlaybackSpeedControl;->setTargetLiveOffsetOverrideUs(J)V

    .line 134
    .line 135
    .line 136
    return-void
.end method

.method private updateRebufferingState(ZZ)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->isRebuffering:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->clock:Lh1/b;

    .line 8
    .line 9
    check-cast p1, Lh1/z;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    :goto_0
    iput-wide p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->lastRebufferRealtimeMs:J

    .line 25
    .line 26
    return-void
.end method

.method private updateTrackSelectionPlaybackSpeed(F)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getTrackSelectorResult()Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, Landroidx/media3/exoplayer/trackselection/TrackSelectorResult;->selections:[Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_1
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    aget-object v4, v1, v3

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-interface {v4, p1}, Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;->onPlaybackSpeed(F)V

    .line 24
    .line 25
    .line 26
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaPeriodHolder;->getNext()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return-void
.end method

.method private declared-synchronized waitUninterruptibly(Le6/i;J)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le6/i;",
            "J)V"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->clock:Lh1/b;

    .line 3
    .line 4
    check-cast v0, Lh1/z;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    add-long/2addr v0, p2

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    invoke-interface {p1}, Le6/i;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    const-wide/16 v3, 0x0

    .line 28
    .line 29
    cmp-long v3, p2, v3

    .line 30
    .line 31
    if-lez v3, :cond_0

    .line 32
    .line 33
    :try_start_1
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->clock:Lh1/b;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p2, p3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_2

    .line 44
    :catch_0
    const/4 p2, 0x1

    .line 45
    move v2, p2

    .line 46
    :goto_1
    :try_start_2
    iget-object p2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->clock:Lh1/b;

    .line 47
    .line 48
    check-cast p2, Lh1/z;

    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 54
    .line 55
    .line 56
    move-result-wide p2

    .line 57
    sub-long p2, v0, p2

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    if-eqz v2, :cond_1

    .line 61
    .line 62
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 67
    .line 68
    .line 69
    :cond_1
    monitor-exit p0

    .line 70
    return-void

    .line 71
    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 72
    throw p1
.end method


# virtual methods
.method public addMediaSources(ILjava/util/List;Landroidx/media3/exoplayer/source/ShuffleOrder;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/MediaSourceList$MediaSourceHolder;",
            ">;",
            "Landroidx/media3/exoplayer/source/ShuffleOrder;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 2
    .line 3
    new-instance v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;

    .line 4
    .line 5
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v4, -0x1

    .line 12
    move-object v2, p2

    .line 13
    move-object v3, p3

    .line 14
    invoke-direct/range {v1 .. v7}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;-><init>(Ljava/util/List;Landroidx/media3/exoplayer/source/ShuffleOrder;IJLandroidx/media3/exoplayer/ExoPlayerImplInternal$1;)V

    .line 15
    .line 16
    .line 17
    check-cast v0, Lh1/b0;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lh1/b0;->d()Lh1/a0;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iget-object p3, v0, Lh1/b0;->a:Landroid/os/Handler;

    .line 27
    .line 28
    const/16 v0, 0x12

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-virtual {p3, v0, p1, v2, v1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p2, Lh1/a0;->a:Landroid/os/Message;

    .line 36
    .line 37
    invoke-virtual {p2}, Lh1/a0;->b()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public experimentalSetForegroundModeTimeoutMs(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setForegroundModeTimeoutMs:J

    .line 2
    .line 3
    return-void
.end method

.method public getPlaybackLooper()Landroid/os/Looper;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackLooper:Landroid/os/Looper;

    .line 2
    .line 3
    return-object v0
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 13

    .line 1
    const-string v2, "Playback error"

    .line 2
    .line 3
    const-string v3, "ExoPlayerImplInternal"

    .line 4
    .line 5
    const/16 v4, 0x3e8

    .line 6
    .line 7
    const/4 v11, 0x0

    .line 8
    const/4 v12, 0x1

    .line 9
    :try_start_0
    iget v5, p1, Landroid/os/Message;->what:I

    .line 10
    .line 11
    packed-switch v5, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    :pswitch_0
    return v11

    .line 15
    :pswitch_1
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->prepareInternal()V

    .line 16
    .line 17
    .line 18
    goto/16 :goto_f

    .line 19
    .line 20
    :catch_0
    move-exception v0

    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :catch_1
    move-exception v0

    .line 24
    goto/16 :goto_5

    .line 25
    .line 26
    :catch_2
    move-exception v0

    .line 27
    goto/16 :goto_6

    .line 28
    .line 29
    :catch_3
    move-exception v0

    .line 30
    goto/16 :goto_7

    .line 31
    .line 32
    :catch_4
    move-exception v0

    .line 33
    goto/16 :goto_8

    .line 34
    .line 35
    :catch_5
    move-exception v0

    .line 36
    goto/16 :goto_b

    .line 37
    .line 38
    :catch_6
    move-exception v0

    .line 39
    goto/16 :goto_c

    .line 40
    .line 41
    :pswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;

    .line 44
    .line 45
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setPreloadConfigurationInternal(Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_f

    .line 49
    .line 50
    :pswitch_3
    iget v5, p1, Landroid/os/Message;->arg1:I

    .line 51
    .line 52
    iget v6, p1, Landroid/os/Message;->arg2:I

    .line 53
    .line 54
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Ljava/util/List;

    .line 57
    .line 58
    invoke-direct {p0, v5, v6, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->updateMediaSourcesWithMediaItemsInternal(IILjava/util/List;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_f

    .line 62
    .line 63
    :pswitch_4
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->reselectTracksInternalAndSeek()V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_f

    .line 67
    .line 68
    :pswitch_5
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->attemptRendererErrorRecovery()V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_f

    .line 72
    .line 73
    :pswitch_6
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 74
    .line 75
    if-eqz v0, :cond_0

    .line 76
    .line 77
    move v0, v12

    .line 78
    goto :goto_0

    .line 79
    :cond_0
    move v0, v11

    .line 80
    :goto_0
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setPauseAtEndOfWindowInternal(Z)V

    .line 81
    .line 82
    .line 83
    goto/16 :goto_f

    .line 84
    .line 85
    :pswitch_7
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->mediaSourceListUpdateRequestedInternal()V

    .line 86
    .line 87
    .line 88
    goto/16 :goto_f

    .line 89
    .line 90
    :pswitch_8
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Landroidx/media3/exoplayer/source/ShuffleOrder;

    .line 93
    .line 94
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setShuffleOrderInternal(Landroidx/media3/exoplayer/source/ShuffleOrder;)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_f

    .line 98
    .line 99
    :pswitch_9
    iget v5, p1, Landroid/os/Message;->arg1:I

    .line 100
    .line 101
    iget v6, p1, Landroid/os/Message;->arg2:I

    .line 102
    .line 103
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Landroidx/media3/exoplayer/source/ShuffleOrder;

    .line 106
    .line 107
    invoke-direct {p0, v5, v6, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->removeMediaItemsInternal(IILandroidx/media3/exoplayer/source/ShuffleOrder;)V

    .line 108
    .line 109
    .line 110
    goto/16 :goto_f

    .line 111
    .line 112
    :pswitch_a
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal$MoveMediaItemsMessage;

    .line 115
    .line 116
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->moveMediaItemsInternal(Landroidx/media3/exoplayer/ExoPlayerImplInternal$MoveMediaItemsMessage;)V

    .line 117
    .line 118
    .line 119
    goto/16 :goto_f

    .line 120
    .line 121
    :pswitch_b
    iget-object v5, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v5, Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;

    .line 124
    .line 125
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 126
    .line 127
    invoke-direct {p0, v5, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->addMediaItemsInternal(Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;I)V

    .line 128
    .line 129
    .line 130
    goto/16 :goto_f

    .line 131
    .line 132
    :pswitch_c
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;

    .line 135
    .line 136
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setMediaItemsInternal(Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;)V

    .line 137
    .line 138
    .line 139
    goto/16 :goto_f

    .line 140
    .line 141
    :pswitch_d
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v0, Landroidx/media3/common/y0;

    .line 144
    .line 145
    invoke-direct {p0, v0, v11}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handlePlaybackParameters(Landroidx/media3/common/y0;Z)V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_f

    .line 149
    .line 150
    :pswitch_e
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v0, Landroidx/media3/exoplayer/PlayerMessage;

    .line 153
    .line 154
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->sendMessageToTargetThread(Landroidx/media3/exoplayer/PlayerMessage;)V

    .line 155
    .line 156
    .line 157
    goto/16 :goto_f

    .line 158
    .line 159
    :pswitch_f
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v0, Landroidx/media3/exoplayer/PlayerMessage;

    .line 162
    .line 163
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->sendMessageInternal(Landroidx/media3/exoplayer/PlayerMessage;)V

    .line 164
    .line 165
    .line 166
    goto/16 :goto_f

    .line 167
    .line 168
    :pswitch_10
    iget v5, p1, Landroid/os/Message;->arg1:I

    .line 169
    .line 170
    if-eqz v5, :cond_1

    .line 171
    .line 172
    move v5, v12

    .line 173
    goto :goto_1

    .line 174
    :cond_1
    move v5, v11

    .line 175
    :goto_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 178
    .line 179
    invoke-direct {p0, v5, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setForegroundModeInternal(ZLjava/util/concurrent/atomic/AtomicBoolean;)V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_f

    .line 183
    .line 184
    :pswitch_11
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 185
    .line 186
    if-eqz v0, :cond_2

    .line 187
    .line 188
    move v0, v12

    .line 189
    goto :goto_2

    .line 190
    :cond_2
    move v0, v11

    .line 191
    :goto_2
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setShuffleModeEnabledInternal(Z)V

    .line 192
    .line 193
    .line 194
    goto/16 :goto_f

    .line 195
    .line 196
    :pswitch_12
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 197
    .line 198
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setRepeatModeInternal(I)V

    .line 199
    .line 200
    .line 201
    goto/16 :goto_f

    .line 202
    .line 203
    :pswitch_13
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->reselectTracksInternal()V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_f

    .line 207
    .line 208
    :pswitch_14
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v0, Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 211
    .line 212
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleContinueLoadingRequested(Landroidx/media3/exoplayer/source/MediaPeriod;)V

    .line 213
    .line 214
    .line 215
    goto/16 :goto_f

    .line 216
    .line 217
    :pswitch_15
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v0, Landroidx/media3/exoplayer/source/MediaPeriod;

    .line 220
    .line 221
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handlePeriodPrepared(Landroidx/media3/exoplayer/source/MediaPeriod;)V

    .line 222
    .line 223
    .line 224
    goto/16 :goto_f

    .line 225
    .line 226
    :pswitch_16
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->releaseInternal()V

    .line 227
    .line 228
    .line 229
    return v12

    .line 230
    :pswitch_17
    invoke-direct {p0, v11, v12}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->stopInternal(ZZ)V

    .line 231
    .line 232
    .line 233
    goto/16 :goto_f

    .line 234
    .line 235
    :pswitch_18
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v0, Landroidx/media3/exoplayer/SeekParameters;

    .line 238
    .line 239
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setSeekParametersInternal(Landroidx/media3/exoplayer/SeekParameters;)V

    .line 240
    .line 241
    .line 242
    goto/16 :goto_f

    .line 243
    .line 244
    :pswitch_19
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v0, Landroidx/media3/common/y0;

    .line 247
    .line 248
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setPlaybackParametersInternal(Landroidx/media3/common/y0;)V

    .line 249
    .line 250
    .line 251
    goto/16 :goto_f

    .line 252
    .line 253
    :pswitch_1a
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;

    .line 256
    .line 257
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->seekToInternal(Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;)V

    .line 258
    .line 259
    .line 260
    goto/16 :goto_f

    .line 261
    .line 262
    :pswitch_1b
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->doSomeWork()V

    .line 263
    .line 264
    .line 265
    goto/16 :goto_f

    .line 266
    .line 267
    :pswitch_1c
    iget v5, p1, Landroid/os/Message;->arg1:I

    .line 268
    .line 269
    if-eqz v5, :cond_3

    .line 270
    .line 271
    move v5, v12

    .line 272
    goto :goto_3

    .line 273
    :cond_3
    move v5, v11

    .line 274
    :goto_3
    iget v0, p1, Landroid/os/Message;->arg2:I

    .line 275
    .line 276
    shr-int/lit8 v6, v0, 0x4

    .line 277
    .line 278
    and-int/lit8 v0, v0, 0xf

    .line 279
    .line 280
    invoke-direct {p0, v5, v6, v12, v0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setPlayWhenReadyInternal(ZIZI)V
    :try_end_0
    .catch Landroidx/media3/exoplayer/ExoPlaybackException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Landroidx/media3/common/v0; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lk1/i; {:try_start_0 .. :try_end_0} :catch_3
    .catch Landroidx/media3/exoplayer/source/BehindLiveWindowException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 281
    .line 282
    .line 283
    goto/16 :goto_f

    .line 284
    .line 285
    :goto_4
    instance-of v5, v0, Ljava/lang/IllegalStateException;

    .line 286
    .line 287
    if-nez v5, :cond_4

    .line 288
    .line 289
    instance-of v5, v0, Ljava/lang/IllegalArgumentException;

    .line 290
    .line 291
    if-eqz v5, :cond_5

    .line 292
    .line 293
    :cond_4
    const/16 v4, 0x3ec

    .line 294
    .line 295
    :cond_5
    invoke-static {v0, v4}, Landroidx/media3/exoplayer/ExoPlaybackException;->createForUnexpected(Ljava/lang/RuntimeException;I)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    invoke-static {v3, v2, v0}, Lh1/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 300
    .line 301
    .line 302
    invoke-direct {p0, v12, v11}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->stopInternal(ZZ)V

    .line 303
    .line 304
    .line 305
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 306
    .line 307
    invoke-virtual {v2, v0}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithPlaybackError(Landroidx/media3/exoplayer/ExoPlaybackException;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 312
    .line 313
    goto/16 :goto_f

    .line 314
    .line 315
    :goto_5
    const/16 v2, 0x7d0

    .line 316
    .line 317
    invoke-direct {p0, v0, v2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleIoException(Ljava/io/IOException;I)V

    .line 318
    .line 319
    .line 320
    goto/16 :goto_f

    .line 321
    .line 322
    :goto_6
    const/16 v2, 0x3ea

    .line 323
    .line 324
    invoke-direct {p0, v0, v2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleIoException(Ljava/io/IOException;I)V

    .line 325
    .line 326
    .line 327
    goto/16 :goto_f

    .line 328
    .line 329
    :goto_7
    iget v2, v0, Lk1/i;->j:I

    .line 330
    .line 331
    invoke-direct {p0, v0, v2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleIoException(Ljava/io/IOException;I)V

    .line 332
    .line 333
    .line 334
    goto/16 :goto_f

    .line 335
    .line 336
    :goto_8
    iget v2, v0, Landroidx/media3/common/v0;->dataType:I

    .line 337
    .line 338
    if-ne v2, v12, :cond_7

    .line 339
    .line 340
    iget-boolean v2, v0, Landroidx/media3/common/v0;->contentIsMalformed:Z

    .line 341
    .line 342
    if-eqz v2, :cond_6

    .line 343
    .line 344
    const/16 v2, 0xbb9

    .line 345
    .line 346
    :goto_9
    move v4, v2

    .line 347
    goto :goto_a

    .line 348
    :cond_6
    const/16 v2, 0xbbb

    .line 349
    .line 350
    goto :goto_9

    .line 351
    :cond_7
    const/4 v3, 0x4

    .line 352
    if-ne v2, v3, :cond_9

    .line 353
    .line 354
    iget-boolean v2, v0, Landroidx/media3/common/v0;->contentIsMalformed:Z

    .line 355
    .line 356
    if-eqz v2, :cond_8

    .line 357
    .line 358
    const/16 v2, 0xbba

    .line 359
    .line 360
    goto :goto_9

    .line 361
    :cond_8
    const/16 v2, 0xbbc

    .line 362
    .line 363
    goto :goto_9

    .line 364
    :cond_9
    :goto_a
    invoke-direct {p0, v0, v4}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleIoException(Ljava/io/IOException;I)V

    .line 365
    .line 366
    .line 367
    goto/16 :goto_f

    .line 368
    .line 369
    :goto_b
    iget v2, v0, Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;->errorCode:I

    .line 370
    .line 371
    invoke-direct {p0, v0, v2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handleIoException(Ljava/io/IOException;I)V

    .line 372
    .line 373
    .line 374
    goto/16 :goto_f

    .line 375
    .line 376
    :goto_c
    iget v4, v0, Landroidx/media3/exoplayer/ExoPlaybackException;->type:I

    .line 377
    .line 378
    if-ne v4, v12, :cond_a

    .line 379
    .line 380
    iget-object v4, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 381
    .line 382
    invoke-virtual {v4}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getReadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    if-eqz v4, :cond_a

    .line 387
    .line 388
    iget-object v4, v4, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 389
    .line 390
    iget-object v4, v4, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 391
    .line 392
    invoke-virtual {v0, v4}, Landroidx/media3/exoplayer/ExoPlaybackException;->copyWithMediaPeriodId(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    :cond_a
    iget-boolean v4, v0, Landroidx/media3/exoplayer/ExoPlaybackException;->isRecoverable:Z

    .line 397
    .line 398
    if-eqz v4, :cond_d

    .line 399
    .line 400
    iget-object v4, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingRecoverableRendererError:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 401
    .line 402
    if-eqz v4, :cond_b

    .line 403
    .line 404
    iget v4, v0, Landroidx/media3/common/x0;->errorCode:I

    .line 405
    .line 406
    const/16 v5, 0x138c

    .line 407
    .line 408
    if-eq v4, v5, :cond_b

    .line 409
    .line 410
    const/16 v5, 0x138b

    .line 411
    .line 412
    if-ne v4, v5, :cond_d

    .line 413
    .line 414
    :cond_b
    const-string v2, "Recoverable renderer error"

    .line 415
    .line 416
    invoke-static {v3, v2, v0}, Lh1/a;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 417
    .line 418
    .line 419
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingRecoverableRendererError:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 420
    .line 421
    if-eqz v2, :cond_c

    .line 422
    .line 423
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 424
    .line 425
    .line 426
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingRecoverableRendererError:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 427
    .line 428
    goto :goto_d

    .line 429
    :cond_c
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingRecoverableRendererError:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 430
    .line 431
    :goto_d
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 432
    .line 433
    check-cast v2, Lh1/b0;

    .line 434
    .line 435
    const/16 v3, 0x19

    .line 436
    .line 437
    invoke-virtual {v2, v3, v0}, Lh1/b0;->c(ILjava/lang/Object;)Lh1/a0;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    iget-object v2, v2, Lh1/b0;->a:Landroid/os/Handler;

    .line 442
    .line 443
    iget-object v3, v0, Lh1/a0;->a:Landroid/os/Message;

    .line 444
    .line 445
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2, v3}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 449
    .line 450
    .line 451
    invoke-virtual {v0}, Lh1/a0;->a()V

    .line 452
    .line 453
    .line 454
    goto :goto_f

    .line 455
    :cond_d
    iget-object v4, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingRecoverableRendererError:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 456
    .line 457
    if-eqz v4, :cond_e

    .line 458
    .line 459
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 460
    .line 461
    .line 462
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->pendingRecoverableRendererError:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 463
    .line 464
    :cond_e
    invoke-static {v3, v2, v0}, Lh1/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 465
    .line 466
    .line 467
    iget v2, v0, Landroidx/media3/exoplayer/ExoPlaybackException;->type:I

    .line 468
    .line 469
    if-ne v2, v12, :cond_10

    .line 470
    .line 471
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 472
    .line 473
    invoke-virtual {v2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 478
    .line 479
    invoke-virtual {v3}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getReadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 480
    .line 481
    .line 482
    move-result-object v3

    .line 483
    if-eq v2, v3, :cond_10

    .line 484
    .line 485
    :goto_e
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 486
    .line 487
    invoke-virtual {v2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 492
    .line 493
    invoke-virtual {v3}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getReadingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 494
    .line 495
    .line 496
    move-result-object v3

    .line 497
    if-eq v2, v3, :cond_f

    .line 498
    .line 499
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 500
    .line 501
    invoke-virtual {v2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->advancePlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 502
    .line 503
    .line 504
    goto :goto_e

    .line 505
    :cond_f
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->queue:Landroidx/media3/exoplayer/MediaPeriodQueue;

    .line 506
    .line 507
    invoke-virtual {v2}, Landroidx/media3/exoplayer/MediaPeriodQueue;->getPlayingPeriod()Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeNotifyPlaybackInfoChanged()V

    .line 515
    .line 516
    .line 517
    iget-object v2, v2, Landroidx/media3/exoplayer/MediaPeriodHolder;->info:Landroidx/media3/exoplayer/MediaPeriodInfo;

    .line 518
    .line 519
    iget-object v3, v2, Landroidx/media3/exoplayer/MediaPeriodInfo;->id:Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;

    .line 520
    .line 521
    move-object v5, v3

    .line 522
    iget-wide v3, v2, Landroidx/media3/exoplayer/MediaPeriodInfo;->startPositionUs:J

    .line 523
    .line 524
    iget-wide v6, v2, Landroidx/media3/exoplayer/MediaPeriodInfo;->requestedContentPositionUs:J

    .line 525
    .line 526
    const/4 v9, 0x1

    .line 527
    const/4 v10, 0x0

    .line 528
    move-object v2, v5

    .line 529
    move-wide v5, v6

    .line 530
    move-wide v7, v3

    .line 531
    move-object v1, p0

    .line 532
    invoke-direct/range {v1 .. v10}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handlePositionDiscontinuity(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;JJJZI)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 533
    .line 534
    .line 535
    move-result-object v2

    .line 536
    iput-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 537
    .line 538
    :cond_10
    invoke-direct {p0, v12, v11}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->stopInternal(ZZ)V

    .line 539
    .line 540
    .line 541
    iget-object v2, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 542
    .line 543
    invoke-virtual {v2, v0}, Landroidx/media3/exoplayer/PlaybackInfo;->copyWithPlaybackError(Landroidx/media3/exoplayer/ExoPlaybackException;)Landroidx/media3/exoplayer/PlaybackInfo;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackInfo:Landroidx/media3/exoplayer/PlaybackInfo;

    .line 548
    .line 549
    :goto_f
    invoke-direct {p0}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->maybeNotifyPlaybackInfoChanged()V

    .line 550
    .line 551
    .line 552
    return v12

    .line 553
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public moveMediaSources(IIILandroidx/media3/exoplayer/source/ShuffleOrder;)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal$MoveMediaItemsMessage;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$MoveMediaItemsMessage;-><init>(IIILandroidx/media3/exoplayer/source/ShuffleOrder;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 7
    .line 8
    const/16 p2, 0x13

    .line 9
    .line 10
    check-cast p1, Lh1/b0;

    .line 11
    .line 12
    invoke-virtual {p1, p2, v0}, Lh1/b0;->c(ILjava/lang/Object;)Lh1/a0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Lh1/a0;->b()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public onContinueLoadingRequested(Landroidx/media3/exoplayer/source/MediaPeriod;)V
    .locals 2

    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    const/16 v1, 0x9

    check-cast v0, Lh1/b0;

    invoke-virtual {v0, v1, p1}, Lh1/b0;->c(ILjava/lang/Object;)Lh1/a0;

    move-result-object p1

    invoke-virtual {p1}, Lh1/a0;->b()V

    return-void
.end method

.method public bridge synthetic onContinueLoadingRequested(Landroidx/media3/exoplayer/source/SequenceableLoader;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/media3/exoplayer/source/MediaPeriod;

    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->onContinueLoadingRequested(Landroidx/media3/exoplayer/source/MediaPeriod;)V

    return-void
.end method

.method public onPlaybackParametersChanged(Landroidx/media3/common/y0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    check-cast v0, Lh1/b0;

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, Lh1/b0;->c(ILjava/lang/Object;)Lh1/a0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lh1/a0;->b()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onPlaylistUpdateRequested()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    check-cast v0, Lh1/b0;

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Lh1/b0;->f(I)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 10
    .line 11
    const/16 v1, 0x16

    .line 12
    .line 13
    check-cast v0, Lh1/b0;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lh1/b0;->g(I)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public onPrepared(Landroidx/media3/exoplayer/source/MediaPeriod;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    check-cast v0, Lh1/b0;

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, Lh1/b0;->c(ILjava/lang/Object;)Lh1/a0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lh1/a0;->b()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onRendererCapabilitiesChanged(Landroidx/media3/exoplayer/Renderer;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 2
    .line 3
    const/16 v0, 0x1a

    .line 4
    .line 5
    check-cast p1, Lh1/b0;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lh1/b0;->g(I)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onTrackSelectionsInvalidated()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    check-cast v0, Lh1/b0;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lh1/b0;->g(I)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public prepare()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    check-cast v0, Lh1/b0;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lh1/b0;->a(I)Lh1/a0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lh1/a0;->b()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public declared-synchronized release()Z
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->released:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackLooper:Landroid/os/Looper;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 20
    .line 21
    check-cast v0, Lh1/b0;

    .line 22
    .line 23
    const/4 v1, 0x7

    .line 24
    invoke-virtual {v0, v1}, Lh1/b0;->g(I)Z

    .line 25
    .line 26
    .line 27
    new-instance v0, Landroidx/media3/exoplayer/w;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v0, v1, p0}, Landroidx/media3/exoplayer/w;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-wide v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->releaseTimeoutMs:J

    .line 34
    .line 35
    invoke-direct {p0, v0, v1, v2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->waitUninterruptibly(Le6/i;J)V

    .line 36
    .line 37
    .line 38
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->released:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    monitor-exit p0

    .line 41
    return v0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    :goto_0
    monitor-exit p0

    .line 45
    const/4 v0, 0x1

    .line 46
    return v0

    .line 47
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    throw v0
.end method

.method public removeMediaSources(IILandroidx/media3/exoplayer/source/ShuffleOrder;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 2
    .line 3
    check-cast v0, Lh1/b0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lh1/b0;->d()Lh1/a0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v0, v0, Lh1/b0;->a:Landroid/os/Handler;

    .line 13
    .line 14
    const/16 v2, 0x14

    .line 15
    .line 16
    invoke-virtual {v0, v2, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, v1, Lh1/a0;->a:Landroid/os/Message;

    .line 21
    .line 22
    invoke-virtual {v1}, Lh1/a0;->b()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public seekTo(Landroidx/media3/common/p1;IJ)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 2
    .line 3
    new-instance v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2, p3, p4}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$SeekPosition;-><init>(Landroidx/media3/common/p1;IJ)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Lh1/b0;

    .line 9
    .line 10
    const/4 p1, 0x3

    .line 11
    invoke-virtual {v0, p1, v1}, Lh1/b0;->c(ILjava/lang/Object;)Lh1/a0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lh1/a0;->b()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public declared-synchronized sendMessage(Landroidx/media3/exoplayer/PlayerMessage;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->released:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackLooper:Landroid/os/Looper;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 20
    .line 21
    check-cast v0, Lh1/b0;

    .line 22
    .line 23
    const/16 v1, 0xe

    .line 24
    .line 25
    invoke-virtual {v0, v1, p1}, Lh1/b0;->c(ILjava/lang/Object;)Lh1/a0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lh1/a0;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    monitor-exit p0

    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    :try_start_1
    const-string v0, "ExoPlayerImplInternal"

    .line 37
    .line 38
    const-string v1, "Ignoring messages sent after release."

    .line 39
    .line 40
    invoke-static {v0, v1}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/PlayerMessage;->markAsProcessed(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    .line 47
    monitor-exit p0

    .line 48
    return-void

    .line 49
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 50
    throw p1
.end method

.method public declared-synchronized setForegroundMode(Z)Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->released:Z

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->playbackLooper:Landroid/os/Looper;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/16 v0, 0xd

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object p1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 26
    .line 27
    check-cast p1, Lh1/b0;

    .line 28
    .line 29
    invoke-virtual {p1, v0, v1, v2}, Lh1/b0;->b(III)Lh1/a0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lh1/a0;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    monitor-exit p0

    .line 37
    return v1

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :try_start_1
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 46
    .line 47
    check-cast v1, Lh1/b0;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {}, Lh1/b0;->d()Lh1/a0;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    iget-object v1, v1, Lh1/b0;->a:Landroid/os/Handler;

    .line 57
    .line 58
    invoke-virtual {v1, v0, v2, v2, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, v3, Lh1/a0;->a:Landroid/os/Message;

    .line 63
    .line 64
    invoke-virtual {v3}, Lh1/a0;->b()V

    .line 65
    .line 66
    .line 67
    new-instance v0, Landroidx/media3/exoplayer/w;

    .line 68
    .line 69
    const/4 v1, 0x1

    .line 70
    invoke-direct {v0, v1, p1}, Landroidx/media3/exoplayer/w;-><init>(ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-wide v1, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->setForegroundModeTimeoutMs:J

    .line 74
    .line 75
    invoke-direct {p0, v0, v1, v2}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->waitUninterruptibly(Le6/i;J)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 79
    .line 80
    .line 81
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    monitor-exit p0

    .line 83
    return p1

    .line 84
    :cond_2
    :goto_0
    monitor-exit p0

    .line 85
    return v1

    .line 86
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 87
    throw p1
.end method

.method public setMediaSources(Ljava/util/List;IJLandroidx/media3/exoplayer/source/ShuffleOrder;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/MediaSourceList$MediaSourceHolder;",
            ">;IJ",
            "Landroidx/media3/exoplayer/source/ShuffleOrder;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 2
    .line 3
    new-instance v1, Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    move-object v2, p1

    .line 7
    move v4, p2

    .line 8
    move-wide v5, p3

    .line 9
    move-object v3, p5

    .line 10
    invoke-direct/range {v1 .. v7}, Landroidx/media3/exoplayer/ExoPlayerImplInternal$MediaSourceListUpdateMessage;-><init>(Ljava/util/List;Landroidx/media3/exoplayer/source/ShuffleOrder;IJLandroidx/media3/exoplayer/ExoPlayerImplInternal$1;)V

    .line 11
    .line 12
    .line 13
    check-cast v0, Lh1/b0;

    .line 14
    .line 15
    const/16 p1, 0x11

    .line 16
    .line 17
    invoke-virtual {v0, p1, v1}, Lh1/b0;->c(ILjava/lang/Object;)Lh1/a0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Lh1/a0;->b()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setPauseAtEndOfWindow(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    check-cast v0, Lh1/b0;

    .line 5
    .line 6
    const/16 v2, 0x17

    .line 7
    .line 8
    invoke-virtual {v0, v2, p1, v1}, Lh1/b0;->b(III)Lh1/a0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lh1/a0;->b()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setPlayWhenReady(ZII)V
    .locals 1

    .line 1
    shl-int/lit8 p3, p3, 0x4

    .line 2
    .line 3
    or-int/2addr p2, p3

    .line 4
    iget-object p3, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    check-cast p3, Lh1/b0;

    .line 8
    .line 9
    invoke-virtual {p3, v0, p1, p2}, Lh1/b0;->b(III)Lh1/a0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Lh1/a0;->b()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setPlaybackParameters(Landroidx/media3/common/y0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    check-cast v0, Lh1/b0;

    .line 5
    .line 6
    invoke-virtual {v0, v1, p1}, Lh1/b0;->c(ILjava/lang/Object;)Lh1/a0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lh1/a0;->b()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setPreloadConfiguration(Landroidx/media3/exoplayer/ExoPlayer$PreloadConfiguration;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    check-cast v0, Lh1/b0;

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, Lh1/b0;->c(ILjava/lang/Object;)Lh1/a0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lh1/a0;->b()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setRepeatMode(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    check-cast v0, Lh1/b0;

    .line 5
    .line 6
    const/16 v2, 0xb

    .line 7
    .line 8
    invoke-virtual {v0, v2, p1, v1}, Lh1/b0;->b(III)Lh1/a0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lh1/a0;->b()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setSeekParameters(Landroidx/media3/exoplayer/SeekParameters;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    check-cast v0, Lh1/b0;

    .line 5
    .line 6
    invoke-virtual {v0, v1, p1}, Lh1/b0;->c(ILjava/lang/Object;)Lh1/a0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lh1/a0;->b()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setShuffleModeEnabled(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    check-cast v0, Lh1/b0;

    .line 5
    .line 6
    const/16 v2, 0xc

    .line 7
    .line 8
    invoke-virtual {v0, v2, p1, v1}, Lh1/b0;->b(III)Lh1/a0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lh1/a0;->b()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setShuffleOrder(Landroidx/media3/exoplayer/source/ShuffleOrder;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    check-cast v0, Lh1/b0;

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, Lh1/b0;->c(ILjava/lang/Object;)Lh1/a0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lh1/a0;->b()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public stop()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    check-cast v0, Lh1/b0;

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Lh1/b0;->a(I)Lh1/a0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lh1/a0;->b()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public updateMediaSourcesWithMediaItems(IILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Landroidx/media3/common/o0;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->handler:Lh1/k;

    .line 2
    .line 3
    check-cast v0, Lh1/b0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lh1/b0;->d()Lh1/a0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v0, v0, Lh1/b0;->a:Landroid/os/Handler;

    .line 13
    .line 14
    const/16 v2, 0x1b

    .line 15
    .line 16
    invoke-virtual {v0, v2, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, v1, Lh1/a0;->a:Landroid/os/Message;

    .line 21
    .line 22
    invoke-virtual {v1}, Lh1/a0;->b()V

    .line 23
    .line 24
    .line 25
    return-void
.end method
