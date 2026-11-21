.class Landroidx/media3/exoplayer/offline/SegmentDownloader$1;
.super Lh1/x;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media3/exoplayer/offline/SegmentDownloader;->getManifest(Lk1/h;Lk1/l;Z)Landroidx/media3/exoplayer/offline/FilterableManifest;
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
.field final synthetic this$0:Landroidx/media3/exoplayer/offline/SegmentDownloader;

.field final synthetic val$dataSource:Lk1/h;

.field final synthetic val$dataSpec:Lk1/l;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/offline/SegmentDownloader;Lk1/h;Lk1/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader$1;->this$0:Landroidx/media3/exoplayer/offline/SegmentDownloader;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader$1;->val$dataSource:Lk1/h;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader$1;->val$dataSpec:Lk1/l;

    .line 6
    .line 7
    invoke-direct {p0}, Lh1/x;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public doWork()Landroidx/media3/exoplayer/offline/FilterableManifest;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TM;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader$1;->val$dataSource:Lk1/h;

    iget-object v1, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader$1;->this$0:Landroidx/media3/exoplayer/offline/SegmentDownloader;

    invoke-static {v1}, Landroidx/media3/exoplayer/offline/SegmentDownloader;->access$000(Landroidx/media3/exoplayer/offline/SegmentDownloader;)Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;

    move-result-object v1

    iget-object v2, p0, Landroidx/media3/exoplayer/offline/SegmentDownloader$1;->val$dataSpec:Lk1/l;

    const/4 v3, 0x4

    invoke-static {v0, v1, v2, v3}, Landroidx/media3/exoplayer/upstream/ParsingLoadable;->load(Lk1/h;Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;Lk1/l;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/media3/exoplayer/offline/FilterableManifest;

    return-object v0
.end method

.method public bridge synthetic doWork()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/offline/SegmentDownloader$1;->doWork()Landroidx/media3/exoplayer/offline/FilterableManifest;

    move-result-object v0

    return-object v0
.end method
