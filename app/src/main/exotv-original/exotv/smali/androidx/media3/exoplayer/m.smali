.class public final synthetic Landroidx/media3/exoplayer/m;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lh1/m;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Z


# direct methods
.method public synthetic constructor <init>(ZI)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/media3/exoplayer/m;->j:I

    .line 2
    .line 3
    iput-boolean p1, p0, Landroidx/media3/exoplayer/m;->k:Z

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/m;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Landroidx/media3/exoplayer/m;->k:Z

    .line 7
    .line 8
    check-cast p1, Landroidx/media3/common/b1;

    .line 9
    .line 10
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl$ComponentListener;->g(ZLandroidx/media3/common/b1;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-boolean v0, p0, Landroidx/media3/exoplayer/m;->k:Z

    .line 15
    .line 16
    check-cast p1, Landroidx/media3/common/b1;

    .line 17
    .line 18
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->k(ZLandroidx/media3/common/b1;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/m;->k:Z

    .line 23
    .line 24
    check-cast p1, Landroidx/media3/common/b1;

    .line 25
    .line 26
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->j(ZLandroidx/media3/common/b1;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
