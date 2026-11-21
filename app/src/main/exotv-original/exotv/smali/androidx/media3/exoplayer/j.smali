.class public final synthetic Landroidx/media3/exoplayer/j;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lh1/m;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/media3/exoplayer/j;->j:I

    .line 2
    .line 3
    iput-object p3, p0, Landroidx/media3/exoplayer/j;->l:Ljava/lang/Object;

    .line 4
    .line 5
    iput p1, p0, Landroidx/media3/exoplayer/j;->k:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/j;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/j;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/media3/common/o0;

    .line 9
    .line 10
    iget v1, p0, Landroidx/media3/exoplayer/j;->k:I

    .line 11
    .line 12
    check-cast p1, Landroidx/media3/common/b1;

    .line 13
    .line 14
    invoke-static {v0, v1, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->t(Landroidx/media3/common/o0;ILandroidx/media3/common/b1;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Landroidx/media3/exoplayer/j;->l:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Landroidx/media3/exoplayer/PlaybackInfo;

    .line 21
    .line 22
    iget v1, p0, Landroidx/media3/exoplayer/j;->k:I

    .line 23
    .line 24
    check-cast p1, Landroidx/media3/common/b1;

    .line 25
    .line 26
    invoke-static {v0, v1, p1}, Landroidx/media3/exoplayer/ExoPlayerImpl;->A(Landroidx/media3/exoplayer/PlaybackInfo;ILandroidx/media3/common/b1;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
