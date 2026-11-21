.class Landroidx/media3/exoplayer/offline/ProgressiveDownloader$1;
.super Lh1/x;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media3/exoplayer/offline/ProgressiveDownloader;->download(Landroidx/media3/exoplayer/offline/Downloader$ProgressListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lh1/x;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media3/exoplayer/offline/ProgressiveDownloader;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/offline/ProgressiveDownloader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/offline/ProgressiveDownloader$1;->this$0:Landroidx/media3/exoplayer/offline/ProgressiveDownloader;

    .line 2
    .line 3
    invoke-direct {p0}, Lh1/x;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public cancelWork()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/ProgressiveDownloader$1;->this$0:Landroidx/media3/exoplayer/offline/ProgressiveDownloader;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/exoplayer/offline/ProgressiveDownloader;->access$000(Landroidx/media3/exoplayer/offline/ProgressiveDownloader;)Ll1/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, v0, Ll1/f;->a:Z

    .line 9
    .line 10
    return-void
.end method

.method public bridge synthetic doWork()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/offline/ProgressiveDownloader$1;->doWork()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public doWork()Ljava/lang/Void;
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/ProgressiveDownloader$1;->this$0:Landroidx/media3/exoplayer/offline/ProgressiveDownloader;

    invoke-static {v0}, Landroidx/media3/exoplayer/offline/ProgressiveDownloader;->access$000(Landroidx/media3/exoplayer/offline/ProgressiveDownloader;)Ll1/f;

    move-result-object v0

    .line 3
    iget-boolean v0, v0, Ll1/f;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 4
    throw v0

    .line 5
    :cond_0
    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0
.end method
