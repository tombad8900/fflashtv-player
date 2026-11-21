.class public final Landroidx/media3/exoplayer/ExoPlayer$Builder;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/ExoPlayer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field analyticsCollectorFunction:Le6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le6/d;"
        }
    .end annotation
.end field

.field audioAttributes:Landroidx/media3/common/g;

.field bandwidthMeterSupplier:Le6/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le6/i;"
        }
    .end annotation
.end field

.field buildCalled:Z

.field clock:Lh1/b;

.field final context:Landroid/content/Context;

.field detachSurfaceTimeoutMs:J

.field deviceVolumeControlEnabled:Z

.field dynamicSchedulingEnabled:Z

.field foregroundModeTimeoutMs:J

.field handleAudioBecomingNoisy:Z

.field handleAudioFocus:Z

.field livePlaybackSpeedControl:Landroidx/media3/exoplayer/LivePlaybackSpeedControl;

.field loadControlSupplier:Le6/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le6/i;"
        }
    .end annotation
.end field

.field looper:Landroid/os/Looper;

.field maxSeekToPreviousPositionMs:J

.field mediaSourceFactorySupplier:Le6/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le6/i;"
        }
    .end annotation
.end field

.field pauseAtEndOfMediaItems:Z

.field playbackLooperProvider:Landroidx/media3/exoplayer/PlaybackLooperProvider;

.field playerName:Ljava/lang/String;

.field priority:I

.field priorityTaskManager:Landroidx/media3/common/g1;

.field releaseTimeoutMs:J

.field renderersFactorySupplier:Le6/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le6/i;"
        }
    .end annotation
.end field

.field seekBackIncrementMs:J

.field seekForwardIncrementMs:J

.field seekParameters:Landroidx/media3/exoplayer/SeekParameters;

.field skipSilenceEnabled:Z

.field suitableOutputChecker:Landroidx/media3/exoplayer/SuitableOutputChecker;

.field suppressPlaybackOnUnsuitableOutput:Z

.field trackSelectorSupplier:Le6/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le6/i;"
        }
    .end annotation
.end field

.field useLazyPreparation:Z

.field usePlatformDiagnostics:Z

.field videoChangeFrameRateStrategy:I

.field videoScalingMode:I

.field wakeMode:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/a;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Landroidx/media3/exoplayer/a;-><init>(Landroid/content/Context;I)V

    new-instance v1, Landroidx/media3/exoplayer/a;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, Landroidx/media3/exoplayer/a;-><init>(Landroid/content/Context;I)V

    invoke-direct {p0, p1, v0, v1}, Landroidx/media3/exoplayer/ExoPlayer$Builder;-><init>(Landroid/content/Context;Le6/i;Le6/i;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/media3/exoplayer/RenderersFactory;)V
    .locals 3

    .line 2
    new-instance v0, Landroidx/media3/exoplayer/e;

    const/4 v1, 0x2

    invoke-direct {v0, p2, v1}, Landroidx/media3/exoplayer/e;-><init>(Landroidx/media3/exoplayer/RenderersFactory;I)V

    new-instance v1, Landroidx/media3/exoplayer/a;

    const/4 v2, 0x3

    invoke-direct {v1, p1, v2}, Landroidx/media3/exoplayer/a;-><init>(Landroid/content/Context;I)V

    invoke-direct {p0, p1, v0, v1}, Landroidx/media3/exoplayer/ExoPlayer$Builder;-><init>(Landroid/content/Context;Le6/i;Le6/i;)V

    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/media3/exoplayer/RenderersFactory;Landroidx/media3/exoplayer/source/MediaSource$Factory;)V
    .locals 3

    .line 6
    new-instance v0, Landroidx/media3/exoplayer/e;

    const/4 v1, 0x1

    invoke-direct {v0, p2, v1}, Landroidx/media3/exoplayer/e;-><init>(Landroidx/media3/exoplayer/RenderersFactory;I)V

    new-instance v1, Landroidx/media3/exoplayer/f;

    const/4 v2, 0x0

    invoke-direct {v1, p3, v2}, Landroidx/media3/exoplayer/f;-><init>(Landroidx/media3/exoplayer/source/MediaSource$Factory;I)V

    invoke-direct {p0, p1, v0, v1}, Landroidx/media3/exoplayer/ExoPlayer$Builder;-><init>(Landroid/content/Context;Le6/i;Le6/i;)V

    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/media3/exoplayer/RenderersFactory;Landroidx/media3/exoplayer/source/MediaSource$Factory;Landroidx/media3/exoplayer/trackselection/TrackSelector;Landroidx/media3/exoplayer/LoadControl;Landroidx/media3/exoplayer/upstream/BandwidthMeter;Landroidx/media3/exoplayer/analytics/AnalyticsCollector;)V
    .locals 8

    .line 9
    new-instance v2, Landroidx/media3/exoplayer/e;

    const/4 v0, 0x3

    invoke-direct {v2, p2, v0}, Landroidx/media3/exoplayer/e;-><init>(Landroidx/media3/exoplayer/RenderersFactory;I)V

    new-instance v3, Landroidx/media3/exoplayer/f;

    const/4 v0, 0x1

    invoke-direct {v3, p3, v0}, Landroidx/media3/exoplayer/f;-><init>(Landroidx/media3/exoplayer/source/MediaSource$Factory;I)V

    new-instance v4, Landroidx/media3/exoplayer/h;

    const/4 v0, 0x0

    invoke-direct {v4, p4, v0}, Landroidx/media3/exoplayer/h;-><init>(Landroidx/media3/exoplayer/trackselection/TrackSelector;I)V

    new-instance v5, Landroidx/media3/exoplayer/c;

    const/4 v0, 0x1

    invoke-direct {v5, p5, v0}, Landroidx/media3/exoplayer/c;-><init>(Landroidx/media3/exoplayer/LoadControl;I)V

    new-instance v6, Landroidx/media3/exoplayer/g;

    const/4 p5, 0x1

    invoke-direct {v6, p6, p5}, Landroidx/media3/exoplayer/g;-><init>(Landroidx/media3/exoplayer/upstream/BandwidthMeter;I)V

    new-instance v7, Landroidx/media3/exoplayer/d;

    invoke-direct {v7, p7, p5}, Landroidx/media3/exoplayer/d;-><init>(Landroidx/media3/exoplayer/analytics/AnalyticsCollector;I)V

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Landroidx/media3/exoplayer/ExoPlayer$Builder;-><init>(Landroid/content/Context;Le6/i;Le6/i;Le6/i;Le6/i;Le6/i;Le6/d;)V

    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/media3/exoplayer/source/MediaSource$Factory;)V
    .locals 3

    .line 4
    new-instance v0, Landroidx/media3/exoplayer/a;

    const/4 v1, 0x6

    invoke-direct {v0, p1, v1}, Landroidx/media3/exoplayer/a;-><init>(Landroid/content/Context;I)V

    new-instance v1, Landroidx/media3/exoplayer/f;

    const/4 v2, 0x2

    invoke-direct {v1, p2, v2}, Landroidx/media3/exoplayer/f;-><init>(Landroidx/media3/exoplayer/source/MediaSource$Factory;I)V

    invoke-direct {p0, p1, v0, v1}, Landroidx/media3/exoplayer/ExoPlayer$Builder;-><init>(Landroid/content/Context;Le6/i;Le6/i;)V

    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Le6/i;Le6/i;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Le6/i;",
            "Le6/i;",
            ")V"
        }
    .end annotation

    .line 15
    new-instance v4, Landroidx/media3/exoplayer/a;

    const/4 v0, 0x4

    invoke-direct {v4, p1, v0}, Landroidx/media3/exoplayer/a;-><init>(Landroid/content/Context;I)V

    new-instance v5, Landroidx/media3/exoplayer/i;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Landroidx/media3/exoplayer/a;

    const/4 v0, 0x5

    invoke-direct {v6, p1, v0}, Landroidx/media3/exoplayer/a;-><init>(Landroid/content/Context;I)V

    new-instance v7, Landroidx/media3/exoplayer/q;

    const/4 v0, 0x4

    invoke-direct {v7, v0}, Landroidx/media3/exoplayer/q;-><init>(I)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v7}, Landroidx/media3/exoplayer/ExoPlayer$Builder;-><init>(Landroid/content/Context;Le6/i;Le6/i;Le6/i;Le6/i;Le6/i;Le6/d;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Le6/i;Le6/i;Le6/i;Le6/i;Le6/i;Le6/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Le6/i;",
            "Le6/i;",
            "Le6/i;",
            "Le6/i;",
            "Le6/i;",
            "Le6/d;",
            ")V"
        }
    .end annotation

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->context:Landroid/content/Context;

    .line 19
    iput-object p2, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->renderersFactorySupplier:Le6/i;

    .line 20
    iput-object p3, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->mediaSourceFactorySupplier:Le6/i;

    .line 21
    iput-object p4, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->trackSelectorSupplier:Le6/i;

    .line 22
    iput-object p5, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->loadControlSupplier:Le6/i;

    .line 23
    iput-object p6, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->bandwidthMeterSupplier:Le6/i;

    .line 24
    iput-object p7, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->analyticsCollectorFunction:Le6/d;

    .line 25
    sget p1, Lh1/i0;->a:I

    .line 26
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 27
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    .line 28
    :goto_0
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->looper:Landroid/os/Looper;

    .line 29
    sget-object p1, Landroidx/media3/common/g;->b:Landroidx/media3/common/g;

    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->audioAttributes:Landroidx/media3/common/g;

    const/4 p1, 0x0

    .line 30
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->wakeMode:I

    const/4 p2, 0x1

    .line 31
    iput p2, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->videoScalingMode:I

    .line 32
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->videoChangeFrameRateStrategy:I

    .line 33
    iput-boolean p2, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->useLazyPreparation:Z

    .line 34
    sget-object p1, Landroidx/media3/exoplayer/SeekParameters;->DEFAULT:Landroidx/media3/exoplayer/SeekParameters;

    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->seekParameters:Landroidx/media3/exoplayer/SeekParameters;

    const-wide/16 p3, 0x1388

    .line 35
    iput-wide p3, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->seekBackIncrementMs:J

    const-wide/16 p3, 0x3a98

    .line 36
    iput-wide p3, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->seekForwardIncrementMs:J

    const-wide/16 p3, 0xbb8

    .line 37
    iput-wide p3, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->maxSeekToPreviousPositionMs:J

    .line 38
    new-instance p1, Landroidx/media3/exoplayer/DefaultLivePlaybackSpeedControl$Builder;

    invoke-direct {p1}, Landroidx/media3/exoplayer/DefaultLivePlaybackSpeedControl$Builder;-><init>()V

    invoke-virtual {p1}, Landroidx/media3/exoplayer/DefaultLivePlaybackSpeedControl$Builder;->build()Landroidx/media3/exoplayer/DefaultLivePlaybackSpeedControl;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->livePlaybackSpeedControl:Landroidx/media3/exoplayer/LivePlaybackSpeedControl;

    .line 39
    sget-object p1, Lh1/b;->a:Lh1/z;

    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->clock:Lh1/b;

    const-wide/16 p3, 0x1f4

    .line 40
    iput-wide p3, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->releaseTimeoutMs:J

    const-wide/16 p3, 0x7d0

    .line 41
    iput-wide p3, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->detachSurfaceTimeoutMs:J

    .line 42
    iput-boolean p2, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->usePlatformDiagnostics:Z

    .line 43
    const-string p1, ""

    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->playerName:Ljava/lang/String;

    const/16 p1, -0x3e8

    .line 44
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->priority:I

    return-void
.end method

.method public static synthetic a(Landroidx/media3/exoplayer/RenderersFactory;)Landroidx/media3/exoplayer/RenderersFactory;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->lambda$setRenderersFactory$16(Landroidx/media3/exoplayer/RenderersFactory;)Landroidx/media3/exoplayer/RenderersFactory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;)Landroidx/media3/exoplayer/RenderersFactory;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->lambda$new$0(Landroid/content/Context;)Landroidx/media3/exoplayer/RenderersFactory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Landroidx/media3/exoplayer/source/MediaSource$Factory;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->lambda$new$5(Landroidx/media3/exoplayer/source/MediaSource$Factory;)Landroidx/media3/exoplayer/source/MediaSource$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(Landroid/content/Context;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->lambda$new$3(Landroid/content/Context;)Landroidx/media3/exoplayer/source/MediaSource$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Landroid/content/Context;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->lambda$new$1(Landroid/content/Context;)Landroidx/media3/exoplayer/source/MediaSource$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f(Landroidx/media3/exoplayer/RenderersFactory;)Landroidx/media3/exoplayer/RenderersFactory;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->lambda$new$6(Landroidx/media3/exoplayer/RenderersFactory;)Landroidx/media3/exoplayer/RenderersFactory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic g(Landroidx/media3/exoplayer/LoadControl;)Landroidx/media3/exoplayer/LoadControl;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->lambda$setLoadControl$19(Landroidx/media3/exoplayer/LoadControl;)Landroidx/media3/exoplayer/LoadControl;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic h(Landroidx/media3/exoplayer/source/MediaSource$Factory;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->lambda$setMediaSourceFactory$17(Landroidx/media3/exoplayer/source/MediaSource$Factory;)Landroidx/media3/exoplayer/source/MediaSource$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic i(Landroidx/media3/exoplayer/upstream/BandwidthMeter;)Landroidx/media3/exoplayer/upstream/BandwidthMeter;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->lambda$new$12(Landroidx/media3/exoplayer/upstream/BandwidthMeter;)Landroidx/media3/exoplayer/upstream/BandwidthMeter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic j(Landroidx/media3/exoplayer/source/MediaSource$Factory;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->lambda$new$7(Landroidx/media3/exoplayer/source/MediaSource$Factory;)Landroidx/media3/exoplayer/source/MediaSource$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic k(Landroid/content/Context;)Landroidx/media3/exoplayer/RenderersFactory;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->lambda$new$4(Landroid/content/Context;)Landroidx/media3/exoplayer/RenderersFactory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic l(Landroid/content/Context;)Landroidx/media3/exoplayer/upstream/BandwidthMeter;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->lambda$new$15(Landroid/content/Context;)Landroidx/media3/exoplayer/upstream/BandwidthMeter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static synthetic lambda$new$0(Landroid/content/Context;)Landroidx/media3/exoplayer/RenderersFactory;
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/DefaultRenderersFactory;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/media3/exoplayer/DefaultRenderersFactory;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static synthetic lambda$new$1(Landroid/content/Context;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 2

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;

    .line 2
    .line 3
    new-instance v1, Ln1/l;

    .line 4
    .line 5
    invoke-direct {v1}, Ln1/l;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;-><init>(Landroid/content/Context;Ln1/q;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method private static synthetic lambda$new$10(Landroidx/media3/exoplayer/trackselection/TrackSelector;)Landroidx/media3/exoplayer/trackselection/TrackSelector;
    .locals 0

    .line 1
    return-object p0
.end method

.method private static synthetic lambda$new$11(Landroidx/media3/exoplayer/LoadControl;)Landroidx/media3/exoplayer/LoadControl;
    .locals 0

    .line 1
    return-object p0
.end method

.method private static synthetic lambda$new$12(Landroidx/media3/exoplayer/upstream/BandwidthMeter;)Landroidx/media3/exoplayer/upstream/BandwidthMeter;
    .locals 0

    .line 1
    return-object p0
.end method

.method private static synthetic lambda$new$13(Landroidx/media3/exoplayer/analytics/AnalyticsCollector;Lh1/b;)Landroidx/media3/exoplayer/analytics/AnalyticsCollector;
    .locals 0

    .line 1
    return-object p0
.end method

.method private static synthetic lambda$new$14(Landroid/content/Context;)Landroidx/media3/exoplayer/trackselection/TrackSelector;
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static synthetic lambda$new$15(Landroid/content/Context;)Landroidx/media3/exoplayer/upstream/BandwidthMeter;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/upstream/DefaultBandwidthMeter;->getSingletonInstance(Landroid/content/Context;)Landroidx/media3/exoplayer/upstream/DefaultBandwidthMeter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static synthetic lambda$new$2(Landroidx/media3/exoplayer/RenderersFactory;)Landroidx/media3/exoplayer/RenderersFactory;
    .locals 0

    .line 1
    return-object p0
.end method

.method private static synthetic lambda$new$3(Landroid/content/Context;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 2

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;

    .line 2
    .line 3
    new-instance v1, Ln1/l;

    .line 4
    .line 5
    invoke-direct {v1}, Ln1/l;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;-><init>(Landroid/content/Context;Ln1/q;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method private static synthetic lambda$new$4(Landroid/content/Context;)Landroidx/media3/exoplayer/RenderersFactory;
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/DefaultRenderersFactory;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/media3/exoplayer/DefaultRenderersFactory;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static synthetic lambda$new$5(Landroidx/media3/exoplayer/source/MediaSource$Factory;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 0

    .line 1
    return-object p0
.end method

.method private static synthetic lambda$new$6(Landroidx/media3/exoplayer/RenderersFactory;)Landroidx/media3/exoplayer/RenderersFactory;
    .locals 0

    .line 1
    return-object p0
.end method

.method private static synthetic lambda$new$7(Landroidx/media3/exoplayer/source/MediaSource$Factory;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 0

    .line 1
    return-object p0
.end method

.method private static synthetic lambda$new$8(Landroidx/media3/exoplayer/RenderersFactory;)Landroidx/media3/exoplayer/RenderersFactory;
    .locals 0

    .line 1
    return-object p0
.end method

.method private static synthetic lambda$new$9(Landroidx/media3/exoplayer/source/MediaSource$Factory;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 0

    .line 1
    return-object p0
.end method

.method private static synthetic lambda$setAnalyticsCollector$21(Landroidx/media3/exoplayer/analytics/AnalyticsCollector;Lh1/b;)Landroidx/media3/exoplayer/analytics/AnalyticsCollector;
    .locals 0

    .line 1
    return-object p0
.end method

.method private static synthetic lambda$setBandwidthMeter$20(Landroidx/media3/exoplayer/upstream/BandwidthMeter;)Landroidx/media3/exoplayer/upstream/BandwidthMeter;
    .locals 0

    .line 1
    return-object p0
.end method

.method private static synthetic lambda$setLoadControl$19(Landroidx/media3/exoplayer/LoadControl;)Landroidx/media3/exoplayer/LoadControl;
    .locals 0

    .line 1
    return-object p0
.end method

.method private static synthetic lambda$setMediaSourceFactory$17(Landroidx/media3/exoplayer/source/MediaSource$Factory;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 0

    .line 1
    return-object p0
.end method

.method private static synthetic lambda$setRenderersFactory$16(Landroidx/media3/exoplayer/RenderersFactory;)Landroidx/media3/exoplayer/RenderersFactory;
    .locals 0

    .line 1
    return-object p0
.end method

.method private static synthetic lambda$setTrackSelector$18(Landroidx/media3/exoplayer/trackselection/TrackSelector;)Landroidx/media3/exoplayer/trackselection/TrackSelector;
    .locals 0

    .line 1
    return-object p0
.end method

.method public static synthetic m(Landroidx/media3/exoplayer/trackselection/TrackSelector;)Landroidx/media3/exoplayer/trackselection/TrackSelector;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->lambda$setTrackSelector$18(Landroidx/media3/exoplayer/trackselection/TrackSelector;)Landroidx/media3/exoplayer/trackselection/TrackSelector;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic n(Landroidx/media3/exoplayer/RenderersFactory;)Landroidx/media3/exoplayer/RenderersFactory;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->lambda$new$8(Landroidx/media3/exoplayer/RenderersFactory;)Landroidx/media3/exoplayer/RenderersFactory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic o(Landroidx/media3/exoplayer/analytics/AnalyticsCollector;Lh1/b;)Landroidx/media3/exoplayer/analytics/AnalyticsCollector;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->lambda$new$13(Landroidx/media3/exoplayer/analytics/AnalyticsCollector;Lh1/b;)Landroidx/media3/exoplayer/analytics/AnalyticsCollector;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic p(Landroidx/media3/exoplayer/source/MediaSource$Factory;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->lambda$new$9(Landroidx/media3/exoplayer/source/MediaSource$Factory;)Landroidx/media3/exoplayer/source/MediaSource$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic q(Landroidx/media3/exoplayer/RenderersFactory;)Landroidx/media3/exoplayer/RenderersFactory;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->lambda$new$2(Landroidx/media3/exoplayer/RenderersFactory;)Landroidx/media3/exoplayer/RenderersFactory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic r(Landroidx/media3/exoplayer/analytics/AnalyticsCollector;Lh1/b;)Landroidx/media3/exoplayer/analytics/AnalyticsCollector;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->lambda$setAnalyticsCollector$21(Landroidx/media3/exoplayer/analytics/AnalyticsCollector;Lh1/b;)Landroidx/media3/exoplayer/analytics/AnalyticsCollector;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic s(Landroidx/media3/exoplayer/trackselection/TrackSelector;)Landroidx/media3/exoplayer/trackselection/TrackSelector;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->lambda$new$10(Landroidx/media3/exoplayer/trackselection/TrackSelector;)Landroidx/media3/exoplayer/trackselection/TrackSelector;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic t(Landroidx/media3/exoplayer/upstream/BandwidthMeter;)Landroidx/media3/exoplayer/upstream/BandwidthMeter;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->lambda$setBandwidthMeter$20(Landroidx/media3/exoplayer/upstream/BandwidthMeter;)Landroidx/media3/exoplayer/upstream/BandwidthMeter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic u(Landroid/content/Context;)Landroidx/media3/exoplayer/trackselection/TrackSelector;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->lambda$new$14(Landroid/content/Context;)Landroidx/media3/exoplayer/trackselection/TrackSelector;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic v(Landroidx/media3/exoplayer/LoadControl;)Landroidx/media3/exoplayer/LoadControl;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->lambda$new$11(Landroidx/media3/exoplayer/LoadControl;)Landroidx/media3/exoplayer/LoadControl;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public build()Landroidx/media3/exoplayer/ExoPlayer;
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean v1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->suitableOutputChecker:Landroidx/media3/exoplayer/SuitableOutputChecker;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    sget v0, Lh1/i0;->a:I

    .line 15
    .line 16
    const/16 v1, 0x23

    .line 17
    .line 18
    if-lt v0, v1, :cond_0

    .line 19
    .line 20
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->suppressPlaybackOnUnsuitableOutput:Z

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v0, Landroidx/media3/exoplayer/DefaultSuitableOutputChecker;

    .line 25
    .line 26
    iget-object v1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->context:Landroid/content/Context;

    .line 27
    .line 28
    new-instance v2, Landroid/os/Handler;

    .line 29
    .line 30
    iget-object v3, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->looper:Landroid/os/Looper;

    .line 31
    .line 32
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v1, v2}, Landroidx/media3/exoplayer/DefaultSuitableOutputChecker;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->suitableOutputChecker:Landroidx/media3/exoplayer/SuitableOutputChecker;

    .line 39
    .line 40
    :cond_0
    new-instance v0, Landroidx/media3/exoplayer/ExoPlayerImpl;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-direct {v0, p0, v1}, Landroidx/media3/exoplayer/ExoPlayerImpl;-><init>(Landroidx/media3/exoplayer/ExoPlayer$Builder;Landroidx/media3/common/d1;)V

    .line 44
    .line 45
    .line 46
    return-object v0
.end method

.method public buildSimpleExoPlayer()Landroidx/media3/exoplayer/SimpleExoPlayer;
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean v1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 9
    .line 10
    new-instance v0, Landroidx/media3/exoplayer/SimpleExoPlayer;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Landroidx/media3/exoplayer/SimpleExoPlayer;-><init>(Landroidx/media3/exoplayer/ExoPlayer$Builder;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public experimentalSetDynamicSchedulingEnabled(Z)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->dynamicSchedulingEnabled:Z

    .line 9
    .line 10
    return-object p0
.end method

.method public experimentalSetForegroundModeTimeoutMs(J)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iput-wide p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->foregroundModeTimeoutMs:J

    .line 9
    .line 10
    return-object p0
.end method

.method public setAnalyticsCollector(Landroidx/media3/exoplayer/analytics/AnalyticsCollector;)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroidx/media3/exoplayer/d;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p1, v1}, Landroidx/media3/exoplayer/d;-><init>(Landroidx/media3/exoplayer/analytics/AnalyticsCollector;I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->analyticsCollectorFunction:Le6/d;

    .line 18
    .line 19
    return-object p0
.end method

.method public setAudioAttributes(Landroidx/media3/common/g;Z)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->audioAttributes:Landroidx/media3/common/g;

    .line 12
    .line 13
    iput-boolean p2, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->handleAudioFocus:Z

    .line 14
    .line 15
    return-object p0
.end method

.method public setBandwidthMeter(Landroidx/media3/exoplayer/upstream/BandwidthMeter;)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroidx/media3/exoplayer/g;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p1, v1}, Landroidx/media3/exoplayer/g;-><init>(Landroidx/media3/exoplayer/upstream/BandwidthMeter;I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->bandwidthMeterSupplier:Le6/i;

    .line 18
    .line 19
    return-object p0
.end method

.method public setClock(Lh1/b;)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->clock:Lh1/b;

    .line 9
    .line 10
    return-object p0
.end method

.method public setDetachSurfaceTimeoutMs(J)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iput-wide p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->detachSurfaceTimeoutMs:J

    .line 9
    .line 10
    return-object p0
.end method

.method public setDeviceVolumeControlEnabled(Z)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->deviceVolumeControlEnabled:Z

    .line 9
    .line 10
    return-object p0
.end method

.method public setHandleAudioBecomingNoisy(Z)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->handleAudioBecomingNoisy:Z

    .line 9
    .line 10
    return-object p0
.end method

.method public setLivePlaybackSpeedControl(Landroidx/media3/exoplayer/LivePlaybackSpeedControl;)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->livePlaybackSpeedControl:Landroidx/media3/exoplayer/LivePlaybackSpeedControl;

    .line 12
    .line 13
    return-object p0
.end method

.method public setLoadControl(Landroidx/media3/exoplayer/LoadControl;)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroidx/media3/exoplayer/c;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p1, v1}, Landroidx/media3/exoplayer/c;-><init>(Landroidx/media3/exoplayer/LoadControl;I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->loadControlSupplier:Le6/i;

    .line 18
    .line 19
    return-object p0
.end method

.method public setLooper(Landroid/os/Looper;)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->looper:Landroid/os/Looper;

    .line 12
    .line 13
    return-object p0
.end method

.method public setMaxSeekToPreviousPositionMs(J)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-ltz v0, :cond_0

    .line 7
    .line 8
    move v0, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    invoke-static {v0}, Lh1/a;->d(Z)V

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 15
    .line 16
    xor-int/2addr v0, v1

    .line 17
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 18
    .line 19
    .line 20
    iput-wide p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->maxSeekToPreviousPositionMs:J

    .line 21
    .line 22
    return-object p0
.end method

.method public setMediaSourceFactory(Landroidx/media3/exoplayer/source/MediaSource$Factory;)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroidx/media3/exoplayer/f;

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    invoke-direct {v0, p1, v1}, Landroidx/media3/exoplayer/f;-><init>(Landroidx/media3/exoplayer/source/MediaSource$Factory;I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->mediaSourceFactorySupplier:Le6/i;

    .line 18
    .line 19
    return-object p0
.end method

.method public setName(Ljava/lang/String;)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->playerName:Ljava/lang/String;

    .line 9
    .line 10
    return-object p0
.end method

.method public setPauseAtEndOfMediaItems(Z)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->pauseAtEndOfMediaItems:Z

    .line 9
    .line 10
    return-object p0
.end method

.method public setPlaybackLooper(Landroid/os/Looper;)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Landroidx/media3/exoplayer/PlaybackLooperProvider;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Landroidx/media3/exoplayer/PlaybackLooperProvider;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->playbackLooperProvider:Landroidx/media3/exoplayer/PlaybackLooperProvider;

    .line 14
    .line 15
    return-object p0
.end method

.method public setPlaybackLooperProvider(Landroidx/media3/exoplayer/PlaybackLooperProvider;)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->playbackLooperProvider:Landroidx/media3/exoplayer/PlaybackLooperProvider;

    .line 9
    .line 10
    return-object p0
.end method

.method public setPriority(I)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->priority:I

    .line 9
    .line 10
    return-object p0
.end method

.method public setPriorityTaskManager(Landroidx/media3/common/g1;)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 0

    .line 1
    iget-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    invoke-static {p1}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public setReleaseTimeoutMs(J)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iput-wide p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->releaseTimeoutMs:J

    .line 9
    .line 10
    return-object p0
.end method

.method public setRenderersFactory(Landroidx/media3/exoplayer/RenderersFactory;)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroidx/media3/exoplayer/e;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p1, v1}, Landroidx/media3/exoplayer/e;-><init>(Landroidx/media3/exoplayer/RenderersFactory;I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->renderersFactorySupplier:Le6/i;

    .line 18
    .line 19
    return-object p0
.end method

.method public setSeekBackIncrementMs(J)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    move v0, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    invoke-static {v0}, Lh1/a;->d(Z)V

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 15
    .line 16
    xor-int/2addr v0, v1

    .line 17
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 18
    .line 19
    .line 20
    iput-wide p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->seekBackIncrementMs:J

    .line 21
    .line 22
    return-object p0
.end method

.method public setSeekForwardIncrementMs(J)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    move v0, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    invoke-static {v0}, Lh1/a;->d(Z)V

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 15
    .line 16
    xor-int/2addr v0, v1

    .line 17
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 18
    .line 19
    .line 20
    iput-wide p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->seekForwardIncrementMs:J

    .line 21
    .line 22
    return-object p0
.end method

.method public setSeekParameters(Landroidx/media3/exoplayer/SeekParameters;)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->seekParameters:Landroidx/media3/exoplayer/SeekParameters;

    .line 12
    .line 13
    return-object p0
.end method

.method public setSkipSilenceEnabled(Z)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->skipSilenceEnabled:Z

    .line 9
    .line 10
    return-object p0
.end method

.method public setSuitableOutputChecker(Landroidx/media3/exoplayer/SuitableOutputChecker;)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->suitableOutputChecker:Landroidx/media3/exoplayer/SuitableOutputChecker;

    .line 9
    .line 10
    return-object p0
.end method

.method public setSuppressPlaybackOnUnsuitableOutput(Z)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->suppressPlaybackOnUnsuitableOutput:Z

    .line 9
    .line 10
    return-object p0
.end method

.method public setTrackSelector(Landroidx/media3/exoplayer/trackselection/TrackSelector;)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroidx/media3/exoplayer/h;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, p1, v1}, Landroidx/media3/exoplayer/h;-><init>(Landroidx/media3/exoplayer/trackselection/TrackSelector;I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->trackSelectorSupplier:Le6/i;

    .line 18
    .line 19
    return-object p0
.end method

.method public setUseLazyPreparation(Z)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->useLazyPreparation:Z

    .line 9
    .line 10
    return-object p0
.end method

.method public setUsePlatformDiagnostics(Z)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->usePlatformDiagnostics:Z

    .line 9
    .line 10
    return-object p0
.end method

.method public setVideoChangeFrameRateStrategy(I)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->videoChangeFrameRateStrategy:I

    .line 9
    .line 10
    return-object p0
.end method

.method public setVideoScalingMode(I)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->videoScalingMode:I

    .line 9
    .line 10
    return-object p0
.end method

.method public setWakeMode(I)Landroidx/media3/exoplayer/ExoPlayer$Builder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->buildCalled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iput p1, p0, Landroidx/media3/exoplayer/ExoPlayer$Builder;->wakeMode:I

    .line 9
    .line 10
    return-object p0
.end method
