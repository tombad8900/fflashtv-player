.class public final synthetic Landroidx/media3/exoplayer/k;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lh1/m;
.implements Landroidx/media3/exoplayer/MediaPeriodHolder$Factory;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/exoplayer/k;->j:I

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/media3/exoplayer/k;->k:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public create(Landroidx/media3/exoplayer/MediaPeriodInfo;J)Landroidx/media3/exoplayer/MediaPeriodHolder;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/media3/exoplayer/ExoPlayerImplInternal;

    .line 4
    .line 5
    invoke-static {v0, p1, p2, p3}, Landroidx/media3/exoplayer/ExoPlayerImplInternal;->a(Landroidx/media3/exoplayer/ExoPlayerImplInternal;Landroidx/media3/exoplayer/MediaPeriodInfo;J)Landroidx/media3/exoplayer/MediaPeriodHolder;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/k;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/media3/common/q;

    .line 9
    .line 10
    check-cast p1, Landroidx/media3/common/b1;

    .line 11
    .line 12
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;->f(Landroidx/media3/common/q;Landroidx/media3/common/b1;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->k:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Landroidx/media3/common/d2;

    .line 19
    .line 20
    check-cast p1, Landroidx/media3/common/b1;

    .line 21
    .line 22
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;->e(Landroidx/media3/common/d2;Landroidx/media3/common/b1;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->k:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ljava/util/List;

    .line 29
    .line 30
    check-cast p1, Landroidx/media3/common/b1;

    .line 31
    .line 32
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;->b(Ljava/util/List;Landroidx/media3/common/b1;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_2
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->k:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Landroidx/media3/common/t0;

    .line 39
    .line 40
    check-cast p1, Landroidx/media3/common/b1;

    .line 41
    .line 42
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;->c(Landroidx/media3/common/t0;Landroidx/media3/common/b1;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_3
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->k:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;

    .line 49
    .line 50
    check-cast p1, Landroidx/media3/common/b1;

    .line 51
    .line 52
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;->h(Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;Landroidx/media3/common/b1;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_4
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->k:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Lg1/c;

    .line 59
    .line 60
    check-cast p1, Landroidx/media3/common/b1;

    .line 61
    .line 62
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;->d(Lg1/c;Landroidx/media3/common/b1;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_5
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->k:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Landroidx/media3/common/v1;

    .line 69
    .line 70
    check-cast p1, Landroidx/media3/common/b1;

    .line 71
    .line 72
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->y(Landroidx/media3/common/v1;Landroidx/media3/common/b1;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :pswitch_6
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->k:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Landroidx/media3/common/g;

    .line 79
    .line 80
    check-cast p1, Landroidx/media3/common/b1;

    .line 81
    .line 82
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->u(Landroidx/media3/common/g;Landroidx/media3/common/b1;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :pswitch_7
    iget-object v0, p0, Landroidx/media3/exoplayer/k;->k:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Landroidx/media3/common/r0;

    .line 89
    .line 90
    check-cast p1, Landroidx/media3/common/b1;

    .line 91
    .line 92
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->v(Landroidx/media3/common/r0;Landroidx/media3/common/b1;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
