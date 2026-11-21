.class public final synthetic Landroidx/media3/exoplayer/video/spherical/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# instance fields
.field public final synthetic j:Landroidx/media3/exoplayer/video/spherical/SceneRenderer;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/video/spherical/SceneRenderer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/video/spherical/a;->j:Landroidx/media3/exoplayer/video/spherical/SceneRenderer;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/spherical/a;->j:Landroidx/media3/exoplayer/video/spherical/SceneRenderer;

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/video/spherical/SceneRenderer;->a(Landroidx/media3/exoplayer/video/spherical/SceneRenderer;Landroid/graphics/SurfaceTexture;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
