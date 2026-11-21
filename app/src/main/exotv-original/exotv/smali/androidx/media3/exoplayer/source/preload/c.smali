.class public final synthetic Landroidx/media3/exoplayer/source/preload/c;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lh1/n;
.implements Landroidx/media3/exoplayer/trackselection/TrackSelector$InvalidationListener;
.implements Landroidx/media3/exoplayer/trackselection/TrackSelector$Factory;


# virtual methods
.method public c(Ljava/lang/Object;Landroidx/media3/common/u;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/media3/exoplayer/source/preload/BasePreloadManager$Listener;

    .line 2
    .line 3
    invoke-static {p1, p2}, Landroidx/media3/exoplayer/source/preload/BasePreloadManager;->f(Landroidx/media3/exoplayer/source/preload/BasePreloadManager$Listener;Landroidx/media3/common/u;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public createTrackSelector(Landroid/content/Context;)Landroidx/media3/exoplayer/trackselection/TrackSelector;
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroidx/media3/exoplayer/trackselection/DefaultTrackSelector;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public onTrackSelectionsInvalidated()V
    .locals 0

    .line 1
    invoke-static {}, Landroidx/media3/exoplayer/source/preload/DefaultPreloadManager;->g()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
