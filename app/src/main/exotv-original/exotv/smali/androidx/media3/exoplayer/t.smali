.class public final synthetic Landroidx/media3/exoplayer/t;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lh1/m;
.implements Lh1/n;
.implements Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdateListener;
.implements Landroidx/media3/exoplayer/SuitableOutputChecker$Callback;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Landroidx/media3/exoplayer/ExoPlayerImpl;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/ExoPlayerImpl;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/media3/exoplayer/t;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/t;->k:Landroidx/media3/exoplayer/ExoPlayerImpl;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;Landroidx/media3/common/u;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/t;->k:Landroidx/media3/exoplayer/ExoPlayerImpl;

    .line 2
    .line 3
    check-cast p1, Landroidx/media3/common/b1;

    .line 4
    .line 5
    invoke-static {v0, p1, p2}, Landroidx/media3/exoplayer/ExoPlayerImpl;->l(Landroidx/media3/exoplayer/ExoPlayerImpl;Landroidx/media3/common/b1;Landroidx/media3/common/u;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/t;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/t;->k:Landroidx/media3/exoplayer/ExoPlayerImpl;

    .line 7
    .line 8
    check-cast p1, Landroidx/media3/common/b1;

    .line 9
    .line 10
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->e(Landroidx/media3/exoplayer/ExoPlayerImpl;Landroidx/media3/common/b1;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Landroidx/media3/exoplayer/t;->k:Landroidx/media3/exoplayer/ExoPlayerImpl;

    .line 15
    .line 16
    check-cast p1, Landroidx/media3/common/b1;

    .line 17
    .line 18
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->o(Landroidx/media3/exoplayer/ExoPlayerImpl;Landroidx/media3/common/b1;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onPlaybackInfoUpdate(Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/t;->k:Landroidx/media3/exoplayer/ExoPlayerImpl;

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->B(Landroidx/media3/exoplayer/ExoPlayerImpl;Landroidx/media3/exoplayer/ExoPlayerImplInternal$PlaybackInfoUpdate;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onSelectedOutputSuitabilityChanged(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/t;->k:Landroidx/media3/exoplayer/ExoPlayerImpl;

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->x(Landroidx/media3/exoplayer/ExoPlayerImpl;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
