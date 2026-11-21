.class public final Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/video/VideoSinkProvider;
.implements Landroidx/media3/common/c2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Builder;,
        Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;,
        Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;,
        Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Listener;,
        Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$ReflectiveDefaultVideoFrameProcessorFactory;,
        Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$ReflectivePreviewingSingleInputVideoGraphFactory;
    }
.end annotation


# static fields
.field private static final NO_OP_EXECUTOR:Ljava/util/concurrent/Executor;

.field private static final STATE_CREATED:I = 0x0

.field private static final STATE_INITIALIZED:I = 0x1

.field private static final STATE_RELEASED:I = 0x2


# instance fields
.field private bufferTimestampAdjustmentUs:J

.field private final clock:Lh1/b;

.field private final compositionEffects:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private currentSurfaceAndSize:Landroid/util/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Pair<",
            "Landroid/view/Surface;",
            "Lh1/y;",
            ">;"
        }
    .end annotation
.end field

.field private final defaultVideoSink:Landroidx/media3/exoplayer/video/VideoSink;

.field private handler:Lh1/k;

.field private final inputVideoSink:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;

.field private final listeners:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Listener;",
            ">;"
        }
    .end annotation
.end field

.field private outputFormat:Landroidx/media3/common/w;

.field private pendingFlushCount:I

.field private final previewingVideoGraphFactory:Landroidx/media3/common/e1;

.field private state:I

.field private videoFrameMetadataListener:Landroidx/media3/exoplayer/video/VideoFrameMetadataListener;

.field private final videoFrameReleaseControl:Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;

.field private final videoFrameRenderControl:Landroidx/media3/exoplayer/video/VideoFrameRenderControl;

.field private videoGraph:Landroidx/media3/common/f1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/video/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->NO_OP_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Builder;)V
    .locals 5

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Builder;->access$200(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Builder;)Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->context:Landroid/content/Context;

    .line 4
    new-instance v1, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;

    invoke-direct {v1, p0, v0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;-><init>(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;Landroid/content/Context;)V

    iput-object v1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->inputVideoSink:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;

    .line 5
    invoke-static {p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Builder;->access$300(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Builder;)Lh1/b;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->clock:Lh1/b;

    .line 6
    invoke-static {p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Builder;->access$400(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Builder;)Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;

    move-result-object v2

    iput-object v2, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->videoFrameReleaseControl:Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;

    .line 7
    invoke-virtual {v2, v0}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->setClock(Lh1/b;)V

    .line 8
    new-instance v0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;

    new-instance v3, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;-><init>(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$1;)V

    invoke-direct {v0, v3, v2}, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;-><init>(Landroidx/media3/exoplayer/video/VideoFrameRenderControl$FrameRenderer;Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;)V

    iput-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->videoFrameRenderControl:Landroidx/media3/exoplayer/video/VideoFrameRenderControl;

    .line 9
    invoke-static {p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Builder;->access$600(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Builder;)Landroidx/media3/common/e1;

    move-result-object v3

    invoke-static {v3}, Lh1/a;->k(Ljava/lang/Object;)V

    iput-object v3, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->previewingVideoGraphFactory:Landroidx/media3/common/e1;

    .line 10
    invoke-static {p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Builder;->access$700(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Builder;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->compositionEffects:Ljava/util/List;

    .line 11
    new-instance p1, Landroidx/media3/exoplayer/video/DefaultVideoSink;

    invoke-direct {p1, v2, v0}, Landroidx/media3/exoplayer/video/DefaultVideoSink;-><init>(Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;Landroidx/media3/exoplayer/video/VideoFrameRenderControl;)V

    iput-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->defaultVideoSink:Landroidx/media3/exoplayer/video/VideoSink;

    .line 12
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->listeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    const/4 p1, 0x0

    .line 13
    iput p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->state:I

    .line 14
    invoke-virtual {p0, v1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->addListener(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Listener;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Builder;Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;-><init>(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Builder;)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->lambda$static$0(Ljava/lang/Runnable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$1000(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;Landroidx/media3/common/w;)Landroidx/media3/common/b2;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->initialize(Landroidx/media3/common/w;)Landroidx/media3/common/b2;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method public static synthetic access$1100(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->flush(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$1200(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;Z)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->isReady(Z)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic access$1300(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;J)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->hasReleasedFrame(J)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic access$1400(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->videoFrameReleaseControl:Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1500(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;Landroidx/media3/exoplayer/video/VideoFrameMetadataListener;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->setVideoFrameMetadataListener(Landroidx/media3/exoplayer/video/VideoFrameMetadataListener;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$1600(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->setPlaybackSpeed(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$1700(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->compositionEffects:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1800(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->render(JJ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$1900(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;JJJ)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->onStreamOffsetChange(JJJ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$2000(Landroidx/media3/common/l;)Landroidx/media3/common/l;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->getAdjustedInputColorInfo(Landroidx/media3/common/l;)Landroidx/media3/common/l;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$2100(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/common/w;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->outputFormat:Landroidx/media3/common/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2102(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;Landroidx/media3/common/w;)Landroidx/media3/common/w;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->outputFormat:Landroidx/media3/common/w;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$2200(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->listeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2300(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroid/util/Pair;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->currentSurfaceAndSize:Landroid/util/Pair;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2400(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/exoplayer/video/VideoFrameMetadataListener;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->videoFrameMetadataListener:Landroidx/media3/exoplayer/video/VideoFrameMetadataListener;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2500(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Lh1/b;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->clock:Lh1/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2600(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/common/f1;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method public static synthetic access$800()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->NO_OP_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$900(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/exoplayer/video/VideoSink;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->defaultVideoSink:Landroidx/media3/exoplayer/video/VideoSink;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->lambda$flush$1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private flush(Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->isInitialized()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->pendingFlushCount:I

    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    iput v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->pendingFlushCount:I

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->defaultVideoSink:Landroidx/media3/exoplayer/video/VideoSink;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/video/VideoSink;->flush(Z)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->handler:Lh1/k;

    .line 20
    .line 21
    invoke-static {p1}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Landroidx/lifecycle/c0;

    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    invoke-direct {v0, v1, p0}, Landroidx/lifecycle/c0;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    check-cast p1, Lh1/b0;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Lh1/b0;->e(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method private static getAdjustedInputColorInfo(Landroidx/media3/common/l;)Landroidx/media3/common/l;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/common/l;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-object p0

    .line 11
    :cond_1
    :goto_0
    sget-object p0, Landroidx/media3/common/l;->h:Landroidx/media3/common/l;

    .line 12
    .line 13
    return-object p0
.end method

.method private hasReleasedFrame(J)Z
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->pendingFlushCount:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->videoFrameRenderControl:Landroidx/media3/exoplayer/video/VideoFrameRenderControl;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->hasReleasedFrame(J)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return p1
.end method

.method private initialize(Landroidx/media3/common/w;)Landroidx/media3/common/b2;
    .locals 13

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->state:I

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
    iget-object v0, p1, Landroidx/media3/common/w;->B:Landroidx/media3/common/l;

    .line 12
    .line 13
    invoke-static {v0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->getAdjustedInputColorInfo(Landroidx/media3/common/l;)Landroidx/media3/common/l;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget v1, v0, Landroidx/media3/common/l;->c:I

    .line 18
    .line 19
    const/4 v2, 0x7

    .line 20
    if-ne v1, v2, :cond_1

    .line 21
    .line 22
    sget v1, Lh1/i0;->a:I

    .line 23
    .line 24
    const/16 v2, 0x22

    .line 25
    .line 26
    if-ge v1, v2, :cond_1

    .line 27
    .line 28
    iget v4, v0, Landroidx/media3/common/l;->a:I

    .line 29
    .line 30
    iget v5, v0, Landroidx/media3/common/l;->b:I

    .line 31
    .line 32
    iget-object v9, v0, Landroidx/media3/common/l;->d:[B

    .line 33
    .line 34
    iget v7, v0, Landroidx/media3/common/l;->e:I

    .line 35
    .line 36
    iget v8, v0, Landroidx/media3/common/l;->f:I

    .line 37
    .line 38
    new-instance v3, Landroidx/media3/common/l;

    .line 39
    .line 40
    const/4 v6, 0x6

    .line 41
    invoke-direct/range {v3 .. v9}, Landroidx/media3/common/l;-><init>(IIIII[B)V

    .line 42
    .line 43
    .line 44
    move-object v6, v3

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object v6, v0

    .line 47
    :goto_1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->clock:Lh1/b;

    .line 48
    .line 49
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v1}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    check-cast v0, Lh1/z;

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    invoke-virtual {v0, v1, v2}, Lh1/z;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lh1/b0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->handler:Lh1/k;

    .line 64
    .line 65
    :try_start_0
    iget-object v4, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->previewingVideoGraphFactory:Landroidx/media3/common/e1;

    .line 66
    .line 67
    iget-object v5, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->context:Landroid/content/Context;

    .line 68
    .line 69
    sget-object v7, Landroidx/media3/common/o;->a:Landroidx/media3/common/n;

    .line 70
    .line 71
    new-instance v9, Landroidx/media3/exoplayer/video/b;

    .line 72
    .line 73
    invoke-direct {v9, v0}, Landroidx/media3/exoplayer/video/b;-><init>(Lh1/b0;)V

    .line 74
    .line 75
    .line 76
    sget-object v0, Lf6/m0;->k:Lf6/k0;

    .line 77
    .line 78
    sget-object v10, Lf6/l1;->n:Lf6/l1;
    :try_end_0
    .catch Landroidx/media3/common/y1; {:try_start_0 .. :try_end_0} :catch_1

    .line 79
    .line 80
    const-wide/16 v11, 0x0

    .line 81
    .line 82
    move-object v8, p0

    .line 83
    :try_start_1
    invoke-interface/range {v4 .. v12}, Landroidx/media3/common/e1;->create(Landroid/content/Context;Landroidx/media3/common/l;Landroidx/media3/common/o;Landroidx/media3/common/c2;Ljava/util/concurrent/Executor;Ljava/util/List;J)Landroidx/media3/common/f1;

    .line 84
    .line 85
    .line 86
    iget-object v0, v8, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->currentSurfaceAndSize:Landroid/util/Pair;

    .line 87
    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, Landroid/view/Surface;

    .line 93
    .line 94
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Lh1/y;

    .line 97
    .line 98
    iget v3, v0, Lh1/y;->a:I

    .line 99
    .line 100
    iget v0, v0, Lh1/y;->b:I

    .line 101
    .line 102
    invoke-direct {p0, v1, v3, v0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->maybeSetOutputSurfaceInfo(Landroid/view/Surface;II)V
    :try_end_1
    .catch Landroidx/media3/common/y1; {:try_start_1 .. :try_end_1} :catch_0

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :catch_0
    move-exception v0

    .line 107
    goto :goto_3

    .line 108
    :cond_2
    :goto_2
    throw v2

    .line 109
    :catch_1
    move-exception v0

    .line 110
    move-object v8, p0

    .line 111
    :goto_3
    new-instance v1, Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException;

    .line 112
    .line 113
    invoke-direct {v1, v0, p1}, Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException;-><init>(Ljava/lang/Throwable;Landroidx/media3/common/w;)V

    .line 114
    .line 115
    .line 116
    throw v1
.end method

.method private isInitialized()Z
    .locals 2

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->state:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method private isReady(Z)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->defaultVideoSink:Landroidx/media3/exoplayer/video/VideoSink;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->pendingFlushCount:I

    .line 6
    .line 7
    if-nez p1, :cond_0

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
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/video/VideoSink;->isReady(Z)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

.method private synthetic lambda$flush$1()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->pendingFlushCount:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->pendingFlushCount:I

    .line 6
    .line 7
    return-void
.end method

.method private static synthetic lambda$static$0(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    return-void
.end method

.method private maybeSetOutputSurfaceInfo(Landroid/view/Surface;II)V
    .locals 0

    .line 1
    return-void
.end method

.method private onStreamOffsetChange(JJJ)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->bufferTimestampAdjustmentUs:J

    .line 2
    .line 3
    iget-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->videoFrameRenderControl:Landroidx/media3/exoplayer/video/VideoFrameRenderControl;

    .line 4
    .line 5
    invoke-virtual {p1, p3, p4, p5, p6}, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->onStreamOffsetChange(JJ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private render(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->videoFrameRenderControl:Landroidx/media3/exoplayer/video/VideoFrameRenderControl;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->render(JJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private setPlaybackSpeed(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->defaultVideoSink:Landroidx/media3/exoplayer/video/VideoSink;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/video/VideoSink;->setPlaybackSpeed(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private setVideoFrameMetadataListener(Landroidx/media3/exoplayer/video/VideoFrameMetadataListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->videoFrameMetadataListener:Landroidx/media3/exoplayer/video/VideoFrameMetadataListener;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public addListener(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Listener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->listeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public clearOutputSurfaceInfo()V
    .locals 3

    .line 1
    sget-object v0, Lh1/y;->c:Lh1/y;

    .line 2
    .line 3
    iget v1, v0, Lh1/y;->a:I

    .line 4
    .line 5
    iget v0, v0, Lh1/y;->b:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {p0, v2, v1, v0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->maybeSetOutputSurfaceInfo(Landroid/view/Surface;II)V

    .line 9
    .line 10
    .line 11
    iput-object v2, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->currentSurfaceAndSize:Landroid/util/Pair;

    .line 12
    .line 13
    return-void
.end method

.method public getSink()Landroidx/media3/exoplayer/video/VideoSink;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->inputVideoSink:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;

    .line 2
    .line 3
    return-object v0
.end method

.method public onEnded(J)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public onError(Landroidx/media3/common/y1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->listeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Listener;

    .line 18
    .line 19
    invoke-interface {v1, p0, p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Listener;->onError(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;Landroidx/media3/common/y1;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public onOutputFrameAvailableForRendering(J)V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->pendingFlushCount:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->videoFrameRenderControl:Landroidx/media3/exoplayer/video/VideoFrameRenderControl;

    .line 7
    .line 8
    iget-wide v1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->bufferTimestampAdjustmentUs:J

    .line 9
    .line 10
    sub-long/2addr p1, v1

    .line 11
    invoke-virtual {v0, p1, p2}, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->onOutputFrameAvailableForRendering(J)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onOutputSizeChanged(II)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/common/v;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media3/common/v;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p1, v0, Landroidx/media3/common/v;->t:I

    .line 7
    .line 8
    iput p2, v0, Landroidx/media3/common/v;->u:I

    .line 9
    .line 10
    new-instance p1, Landroidx/media3/common/w;

    .line 11
    .line 12
    invoke-direct {p1, v0}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->defaultVideoSink:Landroidx/media3/exoplayer/video/VideoSink;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-interface {p2, v0, p1}, Landroidx/media3/exoplayer/video/VideoSink;->onInputStreamChanged(ILandroidx/media3/common/w;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public release()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->state:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->handler:Lh1/k;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast v0, Lh1/b0;

    .line 13
    .line 14
    iget-object v0, v0, Lh1/b0;->a:Landroid/os/Handler;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iput-object v2, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->currentSurfaceAndSize:Landroid/util/Pair;

    .line 20
    .line 21
    iput v1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->state:I

    .line 22
    .line 23
    return-void
.end method

.method public removeListener(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Listener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->listeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setOutputSurfaceInfo(Landroid/view/Surface;Lh1/y;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->currentSurfaceAndSize:Landroid/util/Pair;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/view/Surface;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->currentSurfaceAndSize:Landroid/util/Pair;

    .line 16
    .line 17
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lh1/y;

    .line 20
    .line 21
    invoke-virtual {v0, p2}, Lh1/y;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->currentSurfaceAndSize:Landroid/util/Pair;

    .line 33
    .line 34
    iget v0, p2, Lh1/y;->a:I

    .line 35
    .line 36
    iget p2, p2, Lh1/y;->b:I

    .line 37
    .line 38
    invoke-direct {p0, p1, v0, p2}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->maybeSetOutputSurfaceInfo(Landroid/view/Surface;II)V

    .line 39
    .line 40
    .line 41
    return-void
.end method
