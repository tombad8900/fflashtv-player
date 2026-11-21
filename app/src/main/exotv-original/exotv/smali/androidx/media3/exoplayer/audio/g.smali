.class public final synthetic Landroidx/media3/exoplayer/audio/g;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;

.field public final synthetic k:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/g;->j:Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;

    .line 5
    .line 6
    iput-boolean p2, p0, Landroidx/media3/exoplayer/audio/g;->k:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/g;->j:Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;

    .line 2
    .line 3
    iget-boolean v1, p0, Landroidx/media3/exoplayer/audio/g;->k:Z

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;->a(Landroidx/media3/exoplayer/audio/AudioRendererEventListener$EventDispatcher;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
