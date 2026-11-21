.class Landroidx/media3/exoplayer/dash/offline/DashDownloader$1;
.super Lh1/x;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media3/exoplayer/dash/offline/DashDownloader;->getSegmentIndex(Lk1/h;ILandroidx/media3/exoplayer/dash/manifest/Representation;Z)Landroidx/media3/exoplayer/dash/DashSegmentIndex;
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
.field final synthetic this$0:Landroidx/media3/exoplayer/dash/offline/DashDownloader;

.field final synthetic val$dataSource:Lk1/h;

.field final synthetic val$representation:Landroidx/media3/exoplayer/dash/manifest/Representation;

.field final synthetic val$trackType:I


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/dash/offline/DashDownloader;Lk1/h;ILandroidx/media3/exoplayer/dash/manifest/Representation;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/offline/DashDownloader$1;->this$0:Landroidx/media3/exoplayer/dash/offline/DashDownloader;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/media3/exoplayer/dash/offline/DashDownloader$1;->val$dataSource:Lk1/h;

    .line 4
    .line 5
    iput p3, p0, Landroidx/media3/exoplayer/dash/offline/DashDownloader$1;->val$trackType:I

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/media3/exoplayer/dash/offline/DashDownloader$1;->val$representation:Landroidx/media3/exoplayer/dash/manifest/Representation;

    .line 8
    .line 9
    invoke-direct {p0}, Lh1/x;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public bridge synthetic doWork()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/dash/offline/DashDownloader$1;->doWork()Ln1/j;

    move-result-object v0

    return-object v0
.end method

.method public doWork()Ln1/j;
    .locals 3

    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/offline/DashDownloader$1;->val$dataSource:Lk1/h;

    iget v1, p0, Landroidx/media3/exoplayer/dash/offline/DashDownloader$1;->val$trackType:I

    iget-object v2, p0, Landroidx/media3/exoplayer/dash/offline/DashDownloader$1;->val$representation:Landroidx/media3/exoplayer/dash/manifest/Representation;

    invoke-static {v0, v1, v2}, Landroidx/media3/exoplayer/dash/DashUtil;->loadChunkIndex(Lk1/h;ILandroidx/media3/exoplayer/dash/manifest/Representation;)Ln1/j;

    move-result-object v0

    return-object v0
.end method
