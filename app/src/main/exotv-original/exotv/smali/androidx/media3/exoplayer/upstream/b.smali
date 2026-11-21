.class public final synthetic Landroidx/media3/exoplayer/upstream/b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/upstream/CmcdConfiguration$Factory;
.implements Lh1/f;


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public createCmcdConfiguration(Landroidx/media3/common/o0;)Landroidx/media3/exoplayer/upstream/CmcdConfiguration;
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/media3/exoplayer/upstream/CmcdConfiguration$Factory;->a(Landroidx/media3/common/o0;)Landroidx/media3/exoplayer/upstream/CmcdConfiguration;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
