.class public final synthetic Landroidx/media3/exoplayer/source/f;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Le6/i;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/media3/exoplayer/source/f;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/source/f;->k:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/media3/exoplayer/source/f;->l:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/source/f;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/source/f;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Le6/i;

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/exoplayer/source/f;->l:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lh1/f;

    .line 13
    .line 14
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/source/ProgressiveMediaSource$Factory;->b(Le6/i;Lh1/f;)Landroidx/media3/exoplayer/util/ReleasableExecutor;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :pswitch_0
    iget-object v0, p0, Landroidx/media3/exoplayer/source/f;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;

    .line 22
    .line 23
    iget-object v1, p0, Landroidx/media3/exoplayer/source/f;->l:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lk1/g;

    .line 26
    .line 27
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;->c(Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$DelegateFactoryLoader;Lk1/g;)Landroidx/media3/exoplayer/source/MediaSource$Factory;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
