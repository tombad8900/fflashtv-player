.class public final synthetic Landroidx/media3/exoplayer/f0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Landroidx/media3/exoplayer/StreamVolumeManager;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/StreamVolumeManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/f0;->j:Landroidx/media3/exoplayer/StreamVolumeManager;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/f0;->j:Landroidx/media3/exoplayer/StreamVolumeManager;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/StreamVolumeManager$VolumeChangeReceiver;->a(Landroidx/media3/exoplayer/StreamVolumeManager;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
