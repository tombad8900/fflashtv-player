.class public final Lw4/q0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field public final synthetic a:Lcom/exotv/net/PlayerActivity;


# direct methods
.method public constructor <init>(Lcom/exotv/net/PlayerActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw4/q0;->a:Lcom/exotv/net/PlayerActivity;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 4

    .line 1
    iget-object p1, p0, Lw4/q0;->a:Lcom/exotv/net/PlayerActivity;

    .line 2
    .line 3
    iget-object v0, p1, Lcom/exotv/net/PlayerActivity;->m0:Lw4/g0;

    .line 4
    .line 5
    iget-object v1, p1, Lcom/exotv/net/PlayerActivity;->J:Landroid/os/Handler;

    .line 6
    .line 7
    if-nez p3, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 p3, 0x1

    .line 11
    iput-boolean p3, p1, Lcom/exotv/net/PlayerActivity;->l0:Z

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    const-wide/16 v2, 0x4b0

    .line 17
    .line 18
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 19
    .line 20
    .line 21
    iget-object p3, p1, Lcom/exotv/net/PlayerActivity;->I:Landroidx/media3/exoplayer/ExoPlayer;

    .line 22
    .line 23
    if-eqz p3, :cond_1

    .line 24
    .line 25
    int-to-long v2, p2

    .line 26
    invoke-interface {p3, v2, v3}, Landroidx/media3/exoplayer/ExoPlayer;->seekTo(J)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object p1, p1, Lcom/exotv/net/PlayerActivity;->K:Lw4/g0;

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    const-wide/16 p2, 0xfa0

    .line 35
    .line 36
    invoke-virtual {v1, p1, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .line 1
    const/4 p1, 0x1

    .line 2
    iget-object v0, p0, Lw4/q0;->a:Lcom/exotv/net/PlayerActivity;

    .line 3
    .line 4
    iput-boolean p1, v0, Lcom/exotv/net/PlayerActivity;->l0:Z

    .line 5
    .line 6
    iget-object p1, v0, Lcom/exotv/net/PlayerActivity;->J:Landroid/os/Handler;

    .line 7
    .line 8
    iget-object v1, v0, Lcom/exotv/net/PlayerActivity;->m0:Lw4/g0;

    .line 9
    .line 10
    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lcom/exotv/net/PlayerActivity;->K:Lw4/g0;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lw4/q0;->a:Lcom/exotv/net/PlayerActivity;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/exotv/net/PlayerActivity;->I:Landroidx/media3/exoplayer/ExoPlayer;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move p1, v2

    .line 16
    :goto_0
    int-to-long v3, p1

    .line 17
    invoke-interface {v1, v3, v4}, Landroidx/media3/exoplayer/ExoPlayer;->seekTo(J)V

    .line 18
    .line 19
    .line 20
    :cond_1
    iput-boolean v2, v0, Lcom/exotv/net/PlayerActivity;->l0:Z

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/exotv/net/PlayerActivity;->Q()V

    .line 23
    .line 24
    .line 25
    return-void
.end method
