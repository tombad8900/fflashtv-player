.class public final synthetic Landroidx/media3/exoplayer/offline/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/drm/DrmSessionManagerProvider;
.implements Landroidx/media3/exoplayer/scheduler/RequirementsWatcher$Listener;


# instance fields
.field public final synthetic a:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/offline/a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public get(Landroidx/media3/common/o0;)Landroidx/media3/exoplayer/drm/DrmSessionManager;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/media3/exoplayer/drm/DrmSessionManager;

    .line 4
    .line 5
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/offline/DownloadHelper;->d(Landroidx/media3/exoplayer/drm/DrmSessionManager;Landroidx/media3/common/o0;)Landroidx/media3/exoplayer/drm/DrmSessionManager;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public onRequirementsStateChanged(Landroidx/media3/exoplayer/scheduler/RequirementsWatcher;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/media3/exoplayer/offline/DownloadManager;

    .line 4
    .line 5
    invoke-static {v0, p1, p2}, Landroidx/media3/exoplayer/offline/DownloadManager;->a(Landroidx/media3/exoplayer/offline/DownloadManager;Landroidx/media3/exoplayer/scheduler/RequirementsWatcher;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
