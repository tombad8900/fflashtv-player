.class final Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/video/VideoSink;
.implements Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "InputVideoSink"
.end annotation


# instance fields
.field private finalBufferPresentationTimeUs:J

.field private final frameReleaseInfo:Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;

.field private hasRegisteredFirstInputStream:Z

.field private inputBufferTimestampAdjustmentUs:J

.field private inputFormat:Landroidx/media3/common/w;

.field private inputStreamOffsetUs:J

.field private inputStreamStartPositionUs:J

.field private inputType:I

.field private isInputStreamChangePending:Z

.field private lastBufferPresentationTimeUs:J

.field private lastResetPositionUs:J

.field private listener:Landroidx/media3/exoplayer/video/VideoSink$Listener;

.field private listenerExecutor:Ljava/util/concurrent/Executor;

.field private pendingInputStreamBufferPresentationTimeUs:J

.field private pendingInputStreamOffsetChange:Z

.field final synthetic this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

.field private final videoEffects:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private videoFrameProcessor:Landroidx/media3/common/b2;

.field private final videoFrameProcessorMaxPendingFrameCount:I


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p2}, Lh1/i0;->O(Landroid/content/Context;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x5

    .line 15
    :goto_0
    iput p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->videoFrameProcessorMaxPendingFrameCount:I

    .line 16
    .line 17
    new-instance p1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->videoEffects:Ljava/util/ArrayList;

    .line 23
    .line 24
    new-instance p1, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;

    .line 25
    .line 26
    invoke-direct {p1}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->frameReleaseInfo:Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;

    .line 30
    .line 31
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    iput-wide p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->finalBufferPresentationTimeUs:J

    .line 37
    .line 38
    iput-wide p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->lastBufferPresentationTimeUs:J

    .line 39
    .line 40
    sget-object p1, Landroidx/media3/exoplayer/video/VideoSink$Listener;->NO_OP:Landroidx/media3/exoplayer/video/VideoSink$Listener;

    .line 41
    .line 42
    iput-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->listener:Landroidx/media3/exoplayer/video/VideoSink$Listener;

    .line 43
    .line 44
    invoke-static {}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$800()Ljava/util/concurrent/Executor;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->listenerExecutor:Ljava/util/concurrent/Executor;

    .line 49
    .line 50
    return-void
.end method

.method public static synthetic a(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;Landroidx/media3/exoplayer/video/VideoSink$Listener;Landroidx/media3/common/y1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->lambda$onError$3(Landroidx/media3/exoplayer/video/VideoSink$Listener;Landroidx/media3/common/y1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;Landroidx/media3/exoplayer/video/VideoSink$Listener;Landroidx/media3/common/d2;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->lambda$onVideoSizeChanged$2(Landroidx/media3/exoplayer/video/VideoSink$Listener;Landroidx/media3/common/d2;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;Landroidx/media3/exoplayer/video/VideoSink$Listener;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->lambda$onFrameDropped$1(Landroidx/media3/exoplayer/video/VideoSink$Listener;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;Landroidx/media3/exoplayer/video/VideoSink$Listener;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->lambda$onFirstFrameRendered$0(Landroidx/media3/exoplayer/video/VideoSink$Listener;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic lambda$onError$3(Landroidx/media3/exoplayer/video/VideoSink$Listener;Landroidx/media3/common/y1;)V
    .locals 2

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->inputFormat:Landroidx/media3/common/w;

    .line 4
    .line 5
    invoke-static {v1}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p2, v1}, Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException;-><init>(Ljava/lang/Throwable;Landroidx/media3/common/w;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, p0, v0}, Landroidx/media3/exoplayer/video/VideoSink$Listener;->onError(Landroidx/media3/exoplayer/video/VideoSink;Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private synthetic lambda$onFirstFrameRendered$0(Landroidx/media3/exoplayer/video/VideoSink$Listener;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Landroidx/media3/exoplayer/video/VideoSink$Listener;->onFirstFrameRendered(Landroidx/media3/exoplayer/video/VideoSink;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private lambda$onFrameDropped$1(Landroidx/media3/exoplayer/video/VideoSink$Listener;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Landroidx/media3/exoplayer/video/VideoSink$Listener;->onFrameDropped(Landroidx/media3/exoplayer/video/VideoSink;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic lambda$onVideoSizeChanged$2(Landroidx/media3/exoplayer/video/VideoSink$Listener;Landroidx/media3/common/d2;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0, p2}, Landroidx/media3/exoplayer/video/VideoSink$Listener;->onVideoSizeChanged(Landroidx/media3/exoplayer/video/VideoSink;Landroidx/media3/common/d2;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private maybeRegisterInputStream()V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->inputFormat:Landroidx/media3/common/w;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->videoEffects:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->inputFormat:Landroidx/media3/common/w;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-static {v1}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v2, v0, Landroidx/media3/common/w;->B:Landroidx/media3/common/l;

    .line 23
    .line 24
    invoke-static {v2}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2000(Landroidx/media3/common/l;)Landroidx/media3/common/l;

    .line 25
    .line 26
    .line 27
    iget v2, v0, Landroidx/media3/common/w;->u:I

    .line 28
    .line 29
    iget v0, v0, Landroidx/media3/common/w;->v:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-lez v2, :cond_1

    .line 34
    .line 35
    move v5, v4

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v5, v3

    .line 38
    :goto_0
    new-instance v6, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v7, "width must be positive, but is: "

    .line 41
    .line 42
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {v2, v5}, Lh1/a;->c(Ljava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    if-lez v0, :cond_2

    .line 56
    .line 57
    move v3, v4

    .line 58
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v4, "height must be positive, but is: "

    .line 61
    .line 62
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0, v3}, Lh1/a;->c(Ljava/lang/String;Z)V

    .line 73
    .line 74
    .line 75
    throw v1
.end method

.method private maybeRegisterPendingInputStream()Z
    .locals 7

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->isInputStreamChangePending:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-wide v2, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->pendingInputStreamBufferPresentationTimeUs:J

    .line 8
    .line 9
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v0, v2, v4

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 20
    .line 21
    invoke-static {v0, v2, v3}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$1300(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;J)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return v6

    .line 29
    :cond_2
    :goto_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->maybeRegisterInputStream()V

    .line 30
    .line 31
    .line 32
    iput-boolean v6, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->isInputStreamChangePending:Z

    .line 33
    .line 34
    iput-wide v4, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->pendingInputStreamBufferPresentationTimeUs:J

    .line 35
    .line 36
    return v1
.end method

.method private maybeSetStreamOffsetChange(J)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->pendingInputStreamOffsetChange:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 6
    .line 7
    iget-wide v2, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->inputBufferTimestampAdjustmentUs:J

    .line 8
    .line 9
    iget-wide v6, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->inputStreamOffsetUs:J

    .line 10
    .line 11
    move-wide v4, p1

    .line 12
    invoke-static/range {v1 .. v7}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$1900(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;JJJ)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-boolean p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->pendingInputStreamOffsetChange:Z

    .line 17
    .line 18
    :cond_0
    return-void
.end method


# virtual methods
.method public clearOutputSurfaceInfo()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->clearOutputSurfaceInfo()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public enableMayRenderStartOfStream()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$900(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/exoplayer/video/VideoSink;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Landroidx/media3/exoplayer/video/VideoSink;->enableMayRenderStartOfStream()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public flush(Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->isInitialized()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->hasRegisteredFirstInputStream:Z

    .line 9
    .line 10
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->finalBufferPresentationTimeUs:J

    .line 16
    .line 17
    iput-wide v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->lastBufferPresentationTimeUs:J

    .line 18
    .line 19
    iget-object v2, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 20
    .line 21
    invoke-static {v2, p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$1100(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;Z)V

    .line 22
    .line 23
    .line 24
    iput-wide v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->pendingInputStreamBufferPresentationTimeUs:J

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    throw p1
.end method

.method public getInputSurface()Landroid/view/Surface;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->isInitialized()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    throw v0
.end method

.method public handleInputBitmap(Landroid/graphics/Bitmap;Lh1/e0;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->isInitialized()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->maybeRegisterPendingInputStream()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    invoke-static {p1}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    throw p1
.end method

.method public handleInputFrame(JZJJLandroidx/media3/exoplayer/video/VideoSink$VideoFrameHandler;)Z
    .locals 13

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->isInitialized()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iget-wide v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->inputBufferTimestampAdjustmentUs:J

    .line 9
    .line 10
    sub-long v3, p1, v0

    .line 11
    .line 12
    :try_start_0
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 13
    .line 14
    invoke-static {v0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$1400(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-wide v9, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->inputStreamStartPositionUs:J

    .line 19
    .line 20
    iget-object v12, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->frameReleaseInfo:Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;

    .line 21
    .line 22
    move/from16 v11, p3

    .line 23
    .line 24
    move-wide/from16 v5, p4

    .line 25
    .line 26
    move-wide/from16 v7, p6

    .line 27
    .line 28
    invoke-virtual/range {v2 .. v12}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->getFrameReleaseAction(JJJJZLandroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;)I

    .line 29
    .line 30
    .line 31
    move-result v0
    :try_end_0
    .catch Landroidx/media3/exoplayer/ExoPlaybackException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    const/4 v1, 0x4

    .line 33
    const/4 v2, 0x0

    .line 34
    if-ne v0, v1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-wide v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->lastResetPositionUs:J

    .line 38
    .line 39
    cmp-long v0, v3, v0

    .line 40
    .line 41
    if-gez v0, :cond_1

    .line 42
    .line 43
    if-nez p3, :cond_1

    .line 44
    .line 45
    invoke-interface/range {p8 .. p8}, Landroidx/media3/exoplayer/video/VideoSink$VideoFrameHandler;->skip()V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    return v0

    .line 50
    :cond_1
    move-wide/from16 v5, p4

    .line 51
    .line 52
    move-wide/from16 v7, p6

    .line 53
    .line 54
    invoke-virtual {p0, v5, v6, v7, v8}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->render(JJ)V

    .line 55
    .line 56
    .line 57
    iget-boolean v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->isInputStreamChangePending:Z

    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    iget-wide v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->pendingInputStreamBufferPresentationTimeUs:J

    .line 62
    .line 63
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    cmp-long v5, v0, v3

    .line 69
    .line 70
    if-eqz v5, :cond_2

    .line 71
    .line 72
    iget-object v5, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 73
    .line 74
    invoke-static {v5, v0, v1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$1300(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;J)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_2

    .line 79
    .line 80
    :goto_0
    return v2

    .line 81
    :cond_2
    invoke-direct {p0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->maybeRegisterInputStream()V

    .line 82
    .line 83
    .line 84
    iput-boolean v2, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->isInputStreamChangePending:Z

    .line 85
    .line 86
    iput-wide v3, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->pendingInputStreamBufferPresentationTimeUs:J

    .line 87
    .line 88
    :cond_3
    const/4 v0, 0x0

    .line 89
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    throw v0

    .line 93
    :catch_0
    move-exception v0

    .line 94
    new-instance v1, Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException;

    .line 95
    .line 96
    iget-object v2, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->inputFormat:Landroidx/media3/common/w;

    .line 97
    .line 98
    invoke-static {v2}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-direct {v1, v0, v2}, Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException;-><init>(Ljava/lang/Throwable;Landroidx/media3/common/w;)V

    .line 102
    .line 103
    .line 104
    throw v1
.end method

.method public initialize(Landroidx/media3/common/w;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->isInitialized()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 11
    .line 12
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$1000(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;Landroidx/media3/common/w;)Landroidx/media3/common/b2;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public isEnded()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->isInitialized()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-wide v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->finalBufferPresentationTimeUs:J

    .line 8
    .line 9
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v2, v0, v2

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 19
    .line 20
    invoke-static {v2, v0, v1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$1300(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;J)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    return v0
.end method

.method public isInitialized()Z
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "videoFrameProcessor"
        }
        result = true
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public isReady(Z)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->isInitialized()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$1200(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;Z)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1
.end method

.method public join(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$900(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/exoplayer/video/VideoSink;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/video/VideoSink;->join(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onError(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;Landroidx/media3/common/y1;)V
    .locals 3

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->listener:Landroidx/media3/exoplayer/video/VideoSink$Listener;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->listenerExecutor:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    new-instance v1, Landroidx/media3/exoplayer/video/c;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, p0, p1, p2, v2}, Landroidx/media3/exoplayer/video/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onFirstFrameRendered(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)V
    .locals 3

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->listener:Landroidx/media3/exoplayer/video/VideoSink$Listener;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->listenerExecutor:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    new-instance v1, Landroidx/media3/exoplayer/video/d;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Landroidx/media3/exoplayer/video/d;-><init>(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;Landroidx/media3/exoplayer/video/VideoSink$Listener;I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onFrameDropped(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)V
    .locals 3

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->listener:Landroidx/media3/exoplayer/video/VideoSink$Listener;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->listenerExecutor:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    new-instance v1, Landroidx/media3/exoplayer/video/d;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, p0, p1, v2}, Landroidx/media3/exoplayer/video/d;-><init>(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;Landroidx/media3/exoplayer/video/VideoSink$Listener;I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onInputStreamChanged(ILandroidx/media3/common/w;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->isInitialized()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    if-eq p1, v0, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    if-ne p1, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance p2, Ljava/lang/UnsupportedOperationException;

    .line 16
    .line 17
    const-string v0, "Unsupported input type "

    .line 18
    .line 19
    invoke-static {p1, v0}, La1/a1;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {p2, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p2

    .line 27
    :cond_1
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 28
    .line 29
    invoke-static {v1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$1400(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget v2, p2, Landroidx/media3/common/w;->w:F

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->setFrameRate(F)V

    .line 36
    .line 37
    .line 38
    iput p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->inputType:I

    .line 39
    .line 40
    iput-object p2, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->inputFormat:Landroidx/media3/common/w;

    .line 41
    .line 42
    iget-boolean p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->hasRegisteredFirstInputStream:Z

    .line 43
    .line 44
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    const/4 p2, 0x0

    .line 50
    if-nez p1, :cond_2

    .line 51
    .line 52
    invoke-direct {p0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->maybeRegisterInputStream()V

    .line 53
    .line 54
    .line 55
    iput-boolean v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->hasRegisteredFirstInputStream:Z

    .line 56
    .line 57
    iput-boolean p2, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->isInputStreamChangePending:Z

    .line 58
    .line 59
    iput-wide v1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->pendingInputStreamBufferPresentationTimeUs:J

    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    iget-wide v3, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->lastBufferPresentationTimeUs:J

    .line 63
    .line 64
    cmp-long p1, v3, v1

    .line 65
    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    move p2, v0

    .line 69
    :cond_3
    invoke-static {p2}, Lh1/a;->j(Z)V

    .line 70
    .line 71
    .line 72
    iput-boolean v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->isInputStreamChangePending:Z

    .line 73
    .line 74
    iget-wide p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->lastBufferPresentationTimeUs:J

    .line 75
    .line 76
    iput-wide p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->pendingInputStreamBufferPresentationTimeUs:J

    .line 77
    .line 78
    return-void
.end method

.method public onRendererDisabled()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$900(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/exoplayer/video/VideoSink;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Landroidx/media3/exoplayer/video/VideoSink;->onRendererDisabled()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onRendererEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$900(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/exoplayer/video/VideoSink;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/video/VideoSink;->onRendererEnabled(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onRendererStarted()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$900(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/exoplayer/video/VideoSink;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Landroidx/media3/exoplayer/video/VideoSink;->onRendererStarted()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onRendererStopped()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$900(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/exoplayer/video/VideoSink;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Landroidx/media3/exoplayer/video/VideoSink;->onRendererStopped()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onVideoSizeChanged(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;Landroidx/media3/common/d2;)V
    .locals 3

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->listener:Landroidx/media3/exoplayer/video/VideoSink$Listener;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->listenerExecutor:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    new-instance v1, Landroidx/media3/exoplayer/video/c;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, p2, v2}, Landroidx/media3/exoplayer/video/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public release()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->release()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public render(JJ)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3, p4}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$1800(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;JJ)V
    :try_end_0
    .catch Landroidx/media3/exoplayer/ExoPlaybackException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception p1

    .line 8
    new-instance p2, Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException;

    .line 9
    .line 10
    iget-object p3, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->inputFormat:Landroidx/media3/common/w;

    .line 11
    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance p3, Landroidx/media3/common/v;

    .line 16
    .line 17
    invoke-direct {p3}, Landroidx/media3/common/v;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance p4, Landroidx/media3/common/w;

    .line 21
    .line 22
    invoke-direct {p4, p3}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 23
    .line 24
    .line 25
    move-object p3, p4

    .line 26
    :goto_0
    invoke-direct {p2, p1, p3}, Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException;-><init>(Ljava/lang/Throwable;Landroidx/media3/common/w;)V

    .line 27
    .line 28
    .line 29
    throw p2
.end method

.method public setChangeFrameRateStrategy(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$900(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/exoplayer/video/VideoSink;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/video/VideoSink;->setChangeFrameRateStrategy(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setListener(Landroidx/media3/exoplayer/video/VideoSink$Listener;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->listener:Landroidx/media3/exoplayer/video/VideoSink$Listener;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->listenerExecutor:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    return-void
.end method

.method public setOutputSurfaceInfo(Landroid/view/Surface;Lh1/y;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->setOutputSurfaceInfo(Landroid/view/Surface;Lh1/y;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setPendingVideoEffects(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->videoEffects:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->videoEffects:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->videoEffects:Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 14
    .line 15
    invoke-static {v0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$1700(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public setPlaybackSpeed(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$1600(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setStreamTimestampInfo(JJJJ)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->pendingInputStreamOffsetChange:Z

    .line 2
    .line 3
    iget-wide v1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->inputStreamOffsetUs:J

    .line 4
    .line 5
    cmp-long v1, v1, p3

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    iget-wide v1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->inputBufferTimestampAdjustmentUs:J

    .line 10
    .line 11
    cmp-long v1, v1, p5

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 19
    :goto_1
    or-int/2addr v0, v1

    .line 20
    iput-boolean v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->pendingInputStreamOffsetChange:Z

    .line 21
    .line 22
    iput-wide p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->inputStreamStartPositionUs:J

    .line 23
    .line 24
    iput-wide p3, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->inputStreamOffsetUs:J

    .line 25
    .line 26
    iput-wide p5, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->inputBufferTimestampAdjustmentUs:J

    .line 27
    .line 28
    iput-wide p7, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->lastResetPositionUs:J

    .line 29
    .line 30
    return-void
.end method

.method public setVideoEffects(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->videoEffects:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

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
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->setPendingVideoEffects(Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->maybeRegisterInputStream()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setVideoFrameMetadataListener(Landroidx/media3/exoplayer/video/VideoFrameMetadataListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$InputVideoSink;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$1500(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;Landroidx/media3/exoplayer/video/VideoFrameMetadataListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
