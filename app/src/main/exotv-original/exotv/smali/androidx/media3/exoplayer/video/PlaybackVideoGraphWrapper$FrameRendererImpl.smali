.class final Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/video/VideoFrameRenderControl$FrameRenderer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "FrameRendererImpl"
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;


# direct methods
.method private constructor <init>(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;-><init>(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)V

    return-void
.end method


# virtual methods
.method public dropFrame()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2200(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Listener;

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 24
    .line 25
    invoke-interface {v1, v2}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Listener;->onFrameDropped(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 30
    .line 31
    invoke-static {v0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2600(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/common/f1;

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    throw v0
.end method

.method public onVideoSizeChanged(Landroidx/media3/common/d2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 2
    .line 3
    new-instance v1, Landroidx/media3/common/v;

    .line 4
    .line 5
    invoke-direct {v1}, Landroidx/media3/common/v;-><init>()V

    .line 6
    .line 7
    .line 8
    iget v2, p1, Landroidx/media3/common/d2;->a:I

    .line 9
    .line 10
    iput v2, v1, Landroidx/media3/common/v;->t:I

    .line 11
    .line 12
    iget v2, p1, Landroidx/media3/common/d2;->b:I

    .line 13
    .line 14
    iput v2, v1, Landroidx/media3/common/v;->u:I

    .line 15
    .line 16
    const-string v2, "video/raw"

    .line 17
    .line 18
    invoke-static {v2}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iput-object v2, v1, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 23
    .line 24
    new-instance v2, Landroidx/media3/common/w;

    .line 25
    .line 26
    invoke-direct {v2, v1}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v2}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2102(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;Landroidx/media3/common/w;)Landroidx/media3/common/w;

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 33
    .line 34
    invoke-static {v0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2200(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Listener;

    .line 53
    .line 54
    iget-object v2, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 55
    .line 56
    invoke-interface {v1, v2, p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Listener;->onVideoSizeChanged(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;Landroidx/media3/common/d2;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    return-void
.end method

.method public renderFrame(JJJZ)V
    .locals 7

    .line 1
    if-eqz p7, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 4
    .line 5
    invoke-static {p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2300(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroid/util/Pair;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 12
    .line 13
    invoke-static {p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2200(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    check-cast p2, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Listener;

    .line 32
    .line 33
    iget-object p5, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 34
    .line 35
    invoke-interface {p2, p5}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Listener;->onFirstFrameRendered(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 40
    .line 41
    invoke-static {p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2400(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/exoplayer/video/VideoFrameMetadataListener;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    iget-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 48
    .line 49
    invoke-static {p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2100(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/common/w;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    new-instance p1, Landroidx/media3/common/v;

    .line 56
    .line 57
    invoke-direct {p1}, Landroidx/media3/common/v;-><init>()V

    .line 58
    .line 59
    .line 60
    new-instance p2, Landroidx/media3/common/w;

    .line 61
    .line 62
    invoke-direct {p2, p1}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 63
    .line 64
    .line 65
    :goto_1
    move-object v5, p2

    .line 66
    goto :goto_2

    .line 67
    :cond_1
    iget-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 68
    .line 69
    invoke-static {p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2100(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/common/w;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    goto :goto_1

    .line 74
    :goto_2
    iget-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 75
    .line 76
    invoke-static {p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2400(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/exoplayer/video/VideoFrameMetadataListener;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iget-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 81
    .line 82
    invoke-static {p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2500(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Lh1/b;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, Lh1/z;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 92
    .line 93
    .line 94
    move-result-wide v3

    .line 95
    const/4 v6, 0x0

    .line 96
    move-wide v1, p3

    .line 97
    invoke-interface/range {v0 .. v6}, Landroidx/media3/exoplayer/video/VideoFrameMetadataListener;->onVideoFrameAboutToBeRendered(JJLandroidx/media3/common/w;Landroid/media/MediaFormat;)V

    .line 98
    .line 99
    .line 100
    :cond_2
    iget-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 101
    .line 102
    invoke-static {p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2600(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/common/f1;

    .line 103
    .line 104
    .line 105
    const/4 p1, 0x0

    .line 106
    invoke-static {p1}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    throw p1
.end method
