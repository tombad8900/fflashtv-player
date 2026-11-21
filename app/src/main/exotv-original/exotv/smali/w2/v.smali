.class public final Lw2/v;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/common/b1;
.implements Landroid/view/View$OnClickListener;
.implements Lw2/n;
.implements Lw2/g;


# instance fields
.field public final j:Landroidx/media3/common/m1;

.field public k:Ljava/lang/Object;

.field public final synthetic l:Landroidx/media3/ui/PlayerView;


# direct methods
.method public constructor <init>(Landroidx/media3/ui/PlayerView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw2/v;->l:Landroidx/media3/ui/PlayerView;

    .line 5
    .line 6
    new-instance p1, Landroidx/media3/common/m1;

    .line 7
    .line 8
    invoke-direct {p1}, Landroidx/media3/common/m1;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lw2/v;->j:Landroidx/media3/common/m1;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    sget p1, Landroidx/media3/ui/PlayerView;->P:I

    .line 2
    .line 3
    iget-object p1, p0, Lw2/v;->l:Landroidx/media3/ui/PlayerView;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/media3/ui/PlayerView;->i()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onCues(Lg1/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw2/v;->l:Landroidx/media3/ui/PlayerView;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/media3/ui/PlayerView;->r:Landroidx/media3/ui/SubtitleView;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p1, Lg1/c;->a:Lf6/m0;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroidx/media3/ui/SubtitleView;->setCues(Ljava/util/List;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final onPlayWhenReadyChanged(ZI)V
    .locals 0

    .line 1
    sget p1, Landroidx/media3/ui/PlayerView;->P:I

    .line 2
    .line 3
    iget-object p1, p0, Lw2/v;->l:Landroidx/media3/ui/PlayerView;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/media3/ui/PlayerView;->k()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/media3/ui/PlayerView;->d()Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    iget-boolean p2, p1, Landroidx/media3/ui/PlayerView;->M:Z

    .line 15
    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    iget-object p1, p1, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Lw2/o;->f()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :cond_1
    const/4 p2, 0x0

    .line 27
    invoke-virtual {p1, p2}, Landroidx/media3/ui/PlayerView;->e(Z)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final onPlaybackStateChanged(I)V
    .locals 1

    .line 1
    sget p1, Landroidx/media3/ui/PlayerView;->P:I

    .line 2
    .line 3
    iget-object p1, p0, Lw2/v;->l:Landroidx/media3/ui/PlayerView;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/media3/ui/PlayerView;->k()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/media3/ui/PlayerView;->m()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/media3/ui/PlayerView;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-boolean v0, p1, Landroidx/media3/ui/PlayerView;->M:Z

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object p1, p1, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Lw2/o;->f()V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void

    .line 29
    :cond_1
    const/4 v0, 0x0

    .line 30
    invoke-virtual {p1, v0}, Landroidx/media3/ui/PlayerView;->e(Z)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final onPositionDiscontinuity(Landroidx/media3/common/c1;Landroidx/media3/common/c1;I)V
    .locals 0

    .line 1
    sget p1, Landroidx/media3/ui/PlayerView;->P:I

    .line 2
    .line 3
    iget-object p1, p0, Lw2/v;->l:Landroidx/media3/ui/PlayerView;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/media3/ui/PlayerView;->d()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    iget-boolean p2, p1, Landroidx/media3/ui/PlayerView;->M:Z

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    iget-object p1, p1, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Lw2/o;->f()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final onRenderedFirstFrame()V
    .locals 3

    .line 1
    iget-object v0, p0, Lw2/v;->l:Landroidx/media3/ui/PlayerView;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/ui/PlayerView;->l:Landroid/view/View;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    const/4 v2, 0x4

    .line 8
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->b()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v0, v0, Landroidx/media3/ui/PlayerView;->p:Landroid/widget/ImageView;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->c()V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public final onSurfaceSizeChanged(II)V
    .locals 4

    .line 1
    iget-object p1, p0, Lw2/v;->l:Landroidx/media3/ui/PlayerView;

    .line 2
    .line 3
    iget-object p2, p1, Landroidx/media3/ui/PlayerView;->m:Landroid/view/View;

    .line 4
    .line 5
    sget v0, Lh1/i0;->a:I

    .line 6
    .line 7
    const/16 v1, 0x22

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    instance-of v0, p2, Landroid/view/SurfaceView;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-boolean v0, p1, Landroidx/media3/ui/PlayerView;->O:Z

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p1, Landroidx/media3/ui/PlayerView;->o:Lw2/z;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v1, p1, Landroidx/media3/ui/PlayerView;->x:Landroid/os/Handler;

    .line 25
    .line 26
    check-cast p2, Landroid/view/SurfaceView;

    .line 27
    .line 28
    new-instance v2, Landroidx/lifecycle/c0;

    .line 29
    .line 30
    const/16 v3, 0x15

    .line 31
    .line 32
    invoke-direct {v2, v3, p1}, Landroidx/lifecycle/c0;-><init>(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance p1, Landroidx/media3/exoplayer/audio/f;

    .line 36
    .line 37
    const/4 v3, 0x4

    .line 38
    invoke-direct {p1, v0, p2, v2, v3}, Landroidx/media3/exoplayer/audio/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method

.method public final onTracksChanged(Landroidx/media3/common/x1;)V
    .locals 6

    .line 1
    iget-object p1, p0, Lw2/v;->l:Landroidx/media3/ui/PlayerView;

    .line 2
    .line 3
    iget-object v0, p1, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/16 v1, 0x11

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Landroidx/media3/common/d1;->getCurrentTimeline()Landroidx/media3/common/p1;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    sget-object v1, Landroidx/media3/common/p1;->EMPTY:Landroidx/media3/common/p1;

    .line 22
    .line 23
    :goto_0
    invoke-virtual {v1}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    iput-object v3, p0, Lw2/v;->k:Ljava/lang/Object;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/16 v2, 0x1e

    .line 34
    .line 35
    invoke-interface {v0, v2}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    iget-object v4, p0, Lw2/v;->j:Landroidx/media3/common/m1;

    .line 40
    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    invoke-interface {v0}, Landroidx/media3/common/d1;->getCurrentTracks()Landroidx/media3/common/x1;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iget-object v2, v2, Landroidx/media3/common/x1;->a:Lf6/m0;

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_2

    .line 54
    .line 55
    invoke-interface {v0}, Landroidx/media3/common/d1;->getCurrentPeriodIndex()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    const/4 v2, 0x1

    .line 60
    invoke-virtual {v1, v0, v4, v2}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;Z)Landroidx/media3/common/m1;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v0, v0, Landroidx/media3/common/m1;->b:Ljava/lang/Object;

    .line 65
    .line 66
    iput-object v0, p0, Lw2/v;->k:Ljava/lang/Object;

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    iget-object v2, p0, Lw2/v;->k:Ljava/lang/Object;

    .line 70
    .line 71
    if-eqz v2, :cond_4

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    const/4 v5, -0x1

    .line 78
    if-eq v2, v5, :cond_3

    .line 79
    .line 80
    invoke-virtual {v1, v2, v4}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iget v1, v1, Landroidx/media3/common/m1;->c:I

    .line 85
    .line 86
    invoke-interface {v0}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-ne v0, v1, :cond_3

    .line 91
    .line 92
    return-void

    .line 93
    :cond_3
    iput-object v3, p0, Lw2/v;->k:Ljava/lang/Object;

    .line 94
    .line 95
    :cond_4
    :goto_1
    const/4 v0, 0x0

    .line 96
    invoke-virtual {p1, v0}, Landroidx/media3/ui/PlayerView;->n(Z)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public final onVideoSizeChanged(Landroidx/media3/common/d2;)V
    .locals 2

    .line 1
    sget-object v0, Landroidx/media3/common/d2;->d:Landroidx/media3/common/d2;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroidx/media3/common/d2;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Lw2/v;->l:Landroidx/media3/ui/PlayerView;

    .line 10
    .line 11
    iget-object v0, p1, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Landroidx/media3/common/d1;->getPlaybackState()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x1

    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p1}, Landroidx/media3/ui/PlayerView;->j()V

    .line 24
    .line 25
    .line 26
    :cond_1
    :goto_0
    return-void
.end method
