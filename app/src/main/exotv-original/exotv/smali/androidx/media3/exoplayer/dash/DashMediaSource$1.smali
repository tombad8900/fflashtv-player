.class Landroidx/media3/exoplayer/dash/DashMediaSource$1;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/util/SntpClient$InitializationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media3/exoplayer/dash/DashMediaSource;->loadNtpTimeOffset()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media3/exoplayer/dash/DashMediaSource;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/dash/DashMediaSource;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$1;->this$0:Landroidx/media3/exoplayer/dash/DashMediaSource;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onInitializationFailed(Ljava/io/IOException;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$1;->this$0:Landroidx/media3/exoplayer/dash/DashMediaSource;

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->access$600(Landroidx/media3/exoplayer/dash/DashMediaSource;Ljava/io/IOException;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onInitialized()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$1;->this$0:Landroidx/media3/exoplayer/dash/DashMediaSource;

    .line 2
    .line 3
    invoke-static {}, Landroidx/media3/exoplayer/util/SntpClient;->getElapsedRealtimeOffsetMs()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-static {v0, v1, v2}, Landroidx/media3/exoplayer/dash/DashMediaSource;->access$500(Landroidx/media3/exoplayer/dash/DashMediaSource;J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
