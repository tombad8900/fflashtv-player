.class public final synthetic Landroidx/media3/exoplayer/video/g;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Landroidx/media3/exoplayer/video/VideoRendererEventListener$EventDispatcher;

.field public final synthetic l:J

.field public final synthetic m:I


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/video/VideoRendererEventListener$EventDispatcher;IJ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Landroidx/media3/exoplayer/video/g;->j:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/video/g;->k:Landroidx/media3/exoplayer/video/VideoRendererEventListener$EventDispatcher;

    iput p2, p0, Landroidx/media3/exoplayer/video/g;->m:I

    iput-wide p3, p0, Landroidx/media3/exoplayer/video/g;->l:J

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/media3/exoplayer/video/VideoRendererEventListener$EventDispatcher;JI)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Landroidx/media3/exoplayer/video/g;->j:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/video/g;->k:Landroidx/media3/exoplayer/video/VideoRendererEventListener$EventDispatcher;

    iput-wide p2, p0, Landroidx/media3/exoplayer/video/g;->l:J

    iput p4, p0, Landroidx/media3/exoplayer/video/g;->m:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/video/g;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Landroidx/media3/exoplayer/video/g;->l:J

    .line 7
    .line 8
    iget v2, p0, Landroidx/media3/exoplayer/video/g;->m:I

    .line 9
    .line 10
    iget-object v3, p0, Landroidx/media3/exoplayer/video/g;->k:Landroidx/media3/exoplayer/video/VideoRendererEventListener$EventDispatcher;

    .line 11
    .line 12
    invoke-static {v3, v2, v0, v1}, Landroidx/media3/exoplayer/video/VideoRendererEventListener$EventDispatcher;->g(Landroidx/media3/exoplayer/video/VideoRendererEventListener$EventDispatcher;IJ)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget v0, p0, Landroidx/media3/exoplayer/video/g;->m:I

    .line 17
    .line 18
    iget-wide v1, p0, Landroidx/media3/exoplayer/video/g;->l:J

    .line 19
    .line 20
    iget-object v3, p0, Landroidx/media3/exoplayer/video/g;->k:Landroidx/media3/exoplayer/video/VideoRendererEventListener$EventDispatcher;

    .line 21
    .line 22
    invoke-static {v3, v0, v1, v2}, Landroidx/media3/exoplayer/video/VideoRendererEventListener$EventDispatcher;->c(Landroidx/media3/exoplayer/video/VideoRendererEventListener$EventDispatcher;IJ)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
