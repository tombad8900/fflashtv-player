.class final Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/MetadataRetriever;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MetadataRetrieverInternal"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;
    }
.end annotation


# static fields
.field private static final MESSAGE_CHECK_FOR_FAILURE:I = 0x2

.field private static final MESSAGE_CONTINUE_LOADING:I = 0x3

.field private static final MESSAGE_PREPARE_SOURCE:I = 0x1

.field private static final MESSAGE_RELEASE:I = 0x4

.field private static final SHARED_WORKER_THREAD:Landroidx/media3/exoplayer/MetadataRetriever$SharedWorkerThread;


# instance fields
.field private final mediaItem:Landroidx/media3/common/o0;

.field private final mediaSourceFactory:Landroidx/media3/exoplayer/source/MediaSource$Factory;

.field private final mediaSourceHandler:Lh1/k;

.field private final trackGroupsFuture:Lj6/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj6/t;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/MetadataRetriever$SharedWorkerThread;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media3/exoplayer/MetadataRetriever$SharedWorkerThread;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;->SHARED_WORKER_THREAD:Landroidx/media3/exoplayer/MetadataRetriever$SharedWorkerThread;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroidx/media3/exoplayer/source/MediaSource$Factory;Landroidx/media3/common/o0;Lh1/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;->mediaSourceFactory:Landroidx/media3/exoplayer/source/MediaSource$Factory;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;->mediaItem:Landroidx/media3/common/o0;

    .line 7
    .line 8
    sget-object p1, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;->SHARED_WORKER_THREAD:Landroidx/media3/exoplayer/MetadataRetriever$SharedWorkerThread;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/media3/exoplayer/MetadataRetriever$SharedWorkerThread;->addWorker()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance p2, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;

    .line 15
    .line 16
    invoke-direct {p2, p0}, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;-><init>(Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;)V

    .line 17
    .line 18
    .line 19
    check-cast p3, Lh1/z;

    .line 20
    .line 21
    invoke-virtual {p3, p1, p2}, Lh1/z;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lh1/b0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;->mediaSourceHandler:Lh1/k;

    .line 26
    .line 27
    new-instance p1, Lj6/t;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;->trackGroupsFuture:Lj6/t;

    .line 33
    .line 34
    return-void
.end method

.method public static synthetic access$000(Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;->mediaSourceFactory:Landroidx/media3/exoplayer/source/MediaSource$Factory;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100(Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;)Lh1/k;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;->mediaSourceHandler:Lh1/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$200(Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;)Lj6/t;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;->trackGroupsFuture:Lj6/t;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$300()Landroidx/media3/exoplayer/MetadataRetriever$SharedWorkerThread;
    .locals 1

    .line 1
    sget-object v0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;->SHARED_WORKER_THREAD:Landroidx/media3/exoplayer/MetadataRetriever$SharedWorkerThread;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public retrieveMetadata()Lj6/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj6/s;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;->SHARED_WORKER_THREAD:Landroidx/media3/exoplayer/MetadataRetriever$SharedWorkerThread;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/media3/exoplayer/MetadataRetriever$SharedWorkerThread;->startRetrieval(Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;->trackGroupsFuture:Lj6/t;

    .line 7
    .line 8
    return-object v0
.end method

.method public start()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;->mediaSourceHandler:Lh1/k;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;->mediaItem:Landroidx/media3/common/o0;

    .line 4
    .line 5
    check-cast v0, Lh1/b0;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-virtual {v0, v2, v1}, Lh1/b0;->c(ILjava/lang/Object;)Lh1/a0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lh1/a0;->b()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
