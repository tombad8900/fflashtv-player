.class final Landroidx/media3/exoplayer/video/VideoFrameRenderControl;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/video/VideoFrameRenderControl$FrameRenderer;
    }
.end annotation


# instance fields
.field private final frameRenderer:Landroidx/media3/exoplayer/video/VideoFrameRenderControl$FrameRenderer;

.field private lastPresentationTimeUs:J

.field private outputStreamOffsetUs:J

.field private pendingOutputVideoSize:Landroidx/media3/common/d2;

.field private final presentationTimestampsUs:Lh1/q;

.field private reportedVideoSize:Landroidx/media3/common/d2;

.field private final streamOffsets:Lh1/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh1/c0;"
        }
    .end annotation
.end field

.field private final videoFrameReleaseControl:Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;

.field private final videoFrameReleaseInfo:Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;

.field private final videoSizeChanges:Lh1/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh1/c0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/video/VideoFrameRenderControl$FrameRenderer;Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->frameRenderer:Landroidx/media3/exoplayer/video/VideoFrameRenderControl$FrameRenderer;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->videoFrameReleaseControl:Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;

    .line 7
    .line 8
    new-instance p1, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;

    .line 9
    .line 10
    invoke-direct {p1}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->videoFrameReleaseInfo:Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;

    .line 14
    .line 15
    new-instance p1, Lh1/c0;

    .line 16
    .line 17
    invoke-direct {p1}, Lh1/c0;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->videoSizeChanges:Lh1/c0;

    .line 21
    .line 22
    new-instance p1, Lh1/c0;

    .line 23
    .line 24
    invoke-direct {p1}, Lh1/c0;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->streamOffsets:Lh1/c0;

    .line 28
    .line 29
    new-instance p1, Lh1/q;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    const/16 p2, 0x10

    .line 35
    .line 36
    invoke-static {p2}, Ljava/lang/Integer;->bitCount(I)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/4 v1, 0x1

    .line 41
    if-eq v0, v1, :cond_0

    .line 42
    .line 43
    const/16 p2, 0xf

    .line 44
    .line 45
    invoke-static {p2}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    shl-int/2addr p2, v1

    .line 50
    :cond_0
    const/4 v0, 0x0

    .line 51
    iput v0, p1, Lh1/q;->a:I

    .line 52
    .line 53
    const/4 v2, -0x1

    .line 54
    iput v2, p1, Lh1/q;->b:I

    .line 55
    .line 56
    iput v0, p1, Lh1/q;->c:I

    .line 57
    .line 58
    new-array v0, p2, [J

    .line 59
    .line 60
    iput-object v0, p1, Lh1/q;->d:[J

    .line 61
    .line 62
    sub-int/2addr p2, v1

    .line 63
    iput p2, p1, Lh1/q;->e:I

    .line 64
    .line 65
    iput-object p1, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->presentationTimestampsUs:Lh1/q;

    .line 66
    .line 67
    sget-object p1, Landroidx/media3/common/d2;->d:Landroidx/media3/common/d2;

    .line 68
    .line 69
    iput-object p1, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->reportedVideoSize:Landroidx/media3/common/d2;

    .line 70
    .line 71
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    iput-wide p1, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->lastPresentationTimeUs:J

    .line 77
    .line 78
    return-void
.end method

.method private dropFrame()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->presentationTimestampsUs:Lh1/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh1/q;->a()J

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->frameRenderer:Landroidx/media3/exoplayer/video/VideoFrameRenderControl$FrameRenderer;

    .line 7
    .line 8
    invoke-interface {v0}, Landroidx/media3/exoplayer/video/VideoFrameRenderControl$FrameRenderer;->dropFrame()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static getLastAndClear(Lh1/c0;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lh1/c0;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lh1/c0;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

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
    :goto_1
    invoke-virtual {p0}, Lh1/c0;->h()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-le v0, v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lh1/c0;->e()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-virtual {p0}, Lh1/c0;->e()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    return-object p0
.end method

.method private maybeUpdateOutputStreamOffset(J)Z
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->streamOffsets:Lh1/c0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lh1/c0;->f(J)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Long;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-wide v2, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->outputStreamOffsetUs:J

    .line 16
    .line 17
    cmp-long p2, v0, v2

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    iput-wide p1, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->outputStreamOffsetUs:J

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    return p1
.end method

.method private maybeUpdateVideoSize(J)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->videoSizeChanges:Lh1/c0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lh1/c0;->f(J)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroidx/media3/common/d2;

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    return p2

    .line 13
    :cond_0
    sget-object v0, Landroidx/media3/common/d2;->d:Landroidx/media3/common/d2;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroidx/media3/common/d2;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->reportedVideoSize:Landroidx/media3/common/d2;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroidx/media3/common/d2;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    iput-object p1, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->reportedVideoSize:Landroidx/media3/common/d2;

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    return p1

    .line 33
    :cond_1
    return p2
.end method

.method private renderFrame(Z)V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->presentationTimestampsUs:Lh1/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh1/q;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide v4

    .line 15
    invoke-direct {p0, v4, v5}, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->maybeUpdateVideoSize(J)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->frameRenderer:Landroidx/media3/exoplayer/video/VideoFrameRenderControl$FrameRenderer;

    .line 22
    .line 23
    iget-object v1, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->reportedVideoSize:Landroidx/media3/common/d2;

    .line 24
    .line 25
    invoke-interface {v0, v1}, Landroidx/media3/exoplayer/video/VideoFrameRenderControl$FrameRenderer;->onVideoSizeChanged(Landroidx/media3/common/d2;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    if-eqz p1, :cond_1

    .line 29
    .line 30
    const-wide/16 v0, -0x1

    .line 31
    .line 32
    :goto_0
    move-wide v2, v0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    iget-object p1, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->videoFrameReleaseInfo:Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;->getReleaseTimeNs()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    goto :goto_0

    .line 41
    :goto_1
    iget-object v1, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->frameRenderer:Landroidx/media3/exoplayer/video/VideoFrameRenderControl$FrameRenderer;

    .line 42
    .line 43
    iget-wide v6, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->outputStreamOffsetUs:J

    .line 44
    .line 45
    iget-object p1, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->videoFrameReleaseControl:Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;

    .line 46
    .line 47
    invoke-virtual {p1}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->onFrameReleasedIsFirstFrame()Z

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    invoke-interface/range {v1 .. v8}, Landroidx/media3/exoplayer/video/VideoFrameRenderControl$FrameRenderer;->renderFrame(JJJZ)V

    .line 52
    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public flush()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->presentationTimestampsUs:Lh1/q;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput v1, v0, Lh1/q;->a:I

    .line 5
    .line 6
    const/4 v2, -0x1

    .line 7
    iput v2, v0, Lh1/q;->b:I

    .line 8
    .line 9
    iput v1, v0, Lh1/q;->c:I

    .line 10
    .line 11
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    iput-wide v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->lastPresentationTimeUs:J

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->streamOffsets:Lh1/c0;

    .line 19
    .line 20
    invoke-virtual {v0}, Lh1/c0;->h()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-lez v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->streamOffsets:Lh1/c0;

    .line 27
    .line 28
    invoke-static {v0}, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->getLastAndClear(Lh1/c0;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/lang/Long;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->streamOffsets:Lh1/c0;

    .line 38
    .line 39
    const-wide/16 v2, 0x0

    .line 40
    .line 41
    invoke-virtual {v1, v0, v2, v3}, Lh1/c0;->a(Ljava/lang/Object;J)V

    .line 42
    .line 43
    .line 44
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->pendingOutputVideoSize:Landroidx/media3/common/d2;

    .line 45
    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->videoSizeChanges:Lh1/c0;

    .line 49
    .line 50
    invoke-virtual {v0}, Lh1/c0;->h()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-lez v0, :cond_1

    .line 55
    .line 56
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->videoSizeChanges:Lh1/c0;

    .line 57
    .line 58
    invoke-static {v0}, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->getLastAndClear(Lh1/c0;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Landroidx/media3/common/d2;

    .line 63
    .line 64
    iput-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->pendingOutputVideoSize:Landroidx/media3/common/d2;

    .line 65
    .line 66
    :cond_1
    return-void

    .line 67
    :cond_2
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->videoSizeChanges:Lh1/c0;

    .line 68
    .line 69
    invoke-virtual {v0}, Lh1/c0;->b()V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public hasReleasedFrame(J)Z
    .locals 4

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->lastPresentationTimeUs:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    cmp-long p1, v0, p1

    .line 13
    .line 14
    if-ltz p1, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1
.end method

.method public onOutputFrameAvailableForRendering(J)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->pendingOutputVideoSize:Landroidx/media3/common/d2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->videoSizeChanges:Lh1/c0;

    .line 6
    .line 7
    invoke-virtual {v1, v0, p1, p2}, Lh1/c0;->a(Ljava/lang/Object;J)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->pendingOutputVideoSize:Landroidx/media3/common/d2;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->presentationTimestampsUs:Lh1/q;

    .line 14
    .line 15
    iget v1, v0, Lh1/q;->c:I

    .line 16
    .line 17
    iget-object v2, v0, Lh1/q;->d:[J

    .line 18
    .line 19
    array-length v3, v2

    .line 20
    if-ne v1, v3, :cond_2

    .line 21
    .line 22
    array-length v1, v2

    .line 23
    shl-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    if-ltz v1, :cond_1

    .line 26
    .line 27
    new-array v3, v1, [J

    .line 28
    .line 29
    array-length v4, v2

    .line 30
    iget v5, v0, Lh1/q;->a:I

    .line 31
    .line 32
    sub-int/2addr v4, v5

    .line 33
    const/4 v6, 0x0

    .line 34
    invoke-static {v2, v5, v3, v6, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    iget-object v2, v0, Lh1/q;->d:[J

    .line 38
    .line 39
    invoke-static {v2, v6, v3, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 40
    .line 41
    .line 42
    iput v6, v0, Lh1/q;->a:I

    .line 43
    .line 44
    iget v2, v0, Lh1/q;->c:I

    .line 45
    .line 46
    add-int/lit8 v2, v2, -0x1

    .line 47
    .line 48
    iput v2, v0, Lh1/q;->b:I

    .line 49
    .line 50
    iput-object v3, v0, Lh1/q;->d:[J

    .line 51
    .line 52
    add-int/lit8 v1, v1, -0x1

    .line 53
    .line 54
    iput v1, v0, Lh1/q;->e:I

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_2
    :goto_0
    iget v1, v0, Lh1/q;->b:I

    .line 64
    .line 65
    add-int/lit8 v1, v1, 0x1

    .line 66
    .line 67
    iget v2, v0, Lh1/q;->e:I

    .line 68
    .line 69
    and-int/2addr v1, v2

    .line 70
    iput v1, v0, Lh1/q;->b:I

    .line 71
    .line 72
    iget-object v2, v0, Lh1/q;->d:[J

    .line 73
    .line 74
    aput-wide p1, v2, v1

    .line 75
    .line 76
    iget p1, v0, Lh1/q;->c:I

    .line 77
    .line 78
    add-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    iput p1, v0, Lh1/q;->c:I

    .line 81
    .line 82
    return-void
.end method

.method public onOutputSizeChanged(II)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/common/d2;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroidx/media3/common/d2;-><init>(II)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->pendingOutputVideoSize:Landroidx/media3/common/d2;

    .line 7
    .line 8
    return-void
.end method

.method public onStreamOffsetChange(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->streamOffsets:Lh1/c0;

    .line 2
    .line 3
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    invoke-virtual {v0, p3, p1, p2}, Lh1/c0;->a(Ljava/lang/Object;J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public render(JJ)V
    .locals 13

    .line 1
    :goto_0
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->presentationTimestampsUs:Lh1/q;

    .line 2
    .line 3
    iget v1, v0, Lh1/q;->c:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    if-eqz v1, :cond_6

    .line 9
    .line 10
    iget-object v1, v0, Lh1/q;->d:[J

    .line 11
    .line 12
    iget v0, v0, Lh1/q;->a:I

    .line 13
    .line 14
    aget-wide v3, v1, v0

    .line 15
    .line 16
    invoke-direct {p0, v3, v4}, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->maybeUpdateOutputStreamOffset(J)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->videoFrameReleaseControl:Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->onProcessedStreamChange()V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-object v2, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->videoFrameReleaseControl:Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;

    .line 28
    .line 29
    iget-wide v9, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->outputStreamOffsetUs:J

    .line 30
    .line 31
    const/4 v11, 0x0

    .line 32
    iget-object v12, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->videoFrameReleaseInfo:Landroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;

    .line 33
    .line 34
    move-wide v5, p1

    .line 35
    move-wide/from16 v7, p3

    .line 36
    .line 37
    invoke-virtual/range {v2 .. v12}, Landroidx/media3/exoplayer/video/VideoFrameReleaseControl;->getFrameReleaseAction(JJJJZLandroidx/media3/exoplayer/video/VideoFrameReleaseControl$FrameReleaseInfo;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v1, 0x1

    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    if-eq v0, v1, :cond_4

    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    if-eq v0, v1, :cond_3

    .line 48
    .line 49
    const/4 v1, 0x3

    .line 50
    if-eq v0, v1, :cond_3

    .line 51
    .line 52
    const/4 v1, 0x4

    .line 53
    if-eq v0, v1, :cond_3

    .line 54
    .line 55
    const/4 p1, 0x5

    .line 56
    if-ne v0, p1, :cond_2

    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_3
    iput-wide v3, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->lastPresentationTimeUs:J

    .line 70
    .line 71
    invoke-direct {p0}, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->dropFrame()V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    iput-wide v3, p0, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->lastPresentationTimeUs:J

    .line 76
    .line 77
    if-nez v0, :cond_5

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_5
    const/4 v1, 0x0

    .line 81
    :goto_1
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/video/VideoFrameRenderControl;->renderFrame(Z)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_6
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 86
    .line 87
    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    .line 88
    .line 89
    .line 90
    throw p1
.end method
