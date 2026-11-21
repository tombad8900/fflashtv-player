.class public final Lw4/n0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lcom/exotv/net/PlayerActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/exotv/net/PlayerActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw4/n0;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lw4/n0;->k:Lcom/exotv/net/PlayerActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Lw4/n0;->j:I

    .line 2
    .line 3
    iget-object v1, p0, Lw4/n0;->k:Lcom/exotv/net/PlayerActivity;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->O:Lc5/b1;

    .line 9
    .line 10
    iget-object v2, v1, Lcom/exotv/net/PlayerActivity;->I:Landroidx/media3/exoplayer/ExoPlayer;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-interface {v2}, Landroidx/media3/exoplayer/ExoPlayer;->isPlaying()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-interface {v2}, Landroidx/media3/exoplayer/ExoPlayer;->getCurrentPosition()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    iget-wide v4, v1, Lcom/exotv/net/PlayerActivity;->Q:J

    .line 27
    .line 28
    cmp-long v4, v2, v4

    .line 29
    .line 30
    if-eqz v4, :cond_2

    .line 31
    .line 32
    iput-wide v2, v1, Lcom/exotv/net/PlayerActivity;->Q:J

    .line 33
    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    iput-wide v2, v0, Lc5/b1;->c:J

    .line 39
    .line 40
    :cond_2
    :goto_0
    iget-boolean v2, v1, Lcom/exotv/net/PlayerActivity;->R:Z

    .line 41
    .line 42
    if-eqz v2, :cond_4

    .line 43
    .line 44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    iget-boolean v4, v1, Lcom/exotv/net/PlayerActivity;->P:Z

    .line 49
    .line 50
    if-nez v4, :cond_3

    .line 51
    .line 52
    iget-wide v4, v0, Lc5/b1;->c:J

    .line 53
    .line 54
    sub-long/2addr v2, v4

    .line 55
    const-wide/16 v4, 0x2710

    .line 56
    .line 57
    cmp-long v0, v2, v4

    .line 58
    .line 59
    if-lez v0, :cond_4

    .line 60
    .line 61
    const-string v0, "stall"

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Lcom/exotv/net/PlayerActivity;->N(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    :cond_4
    :goto_1
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->J:Landroid/os/Handler;

    .line 71
    .line 72
    const-wide/16 v1, 0x7d0

    .line 73
    .line 74
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :pswitch_0
    invoke-static {v1}, Lcom/exotv/net/PlayerActivity;->t(Lcom/exotv/net/PlayerActivity;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->J:Landroid/os/Handler;

    .line 82
    .line 83
    const-wide/16 v1, 0x1f4

    .line 84
    .line 85
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :pswitch_1
    sget v0, Lcom/exotv/net/PlayerActivity;->z0:I

    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/exotv/net/PlayerActivity;->I()V

    .line 92
    .line 93
    .line 94
    iget-object v0, v1, Lcom/exotv/net/PlayerActivity;->J:Landroid/os/Handler;

    .line 95
    .line 96
    const-wide/16 v1, 0xfa

    .line 97
    .line 98
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
