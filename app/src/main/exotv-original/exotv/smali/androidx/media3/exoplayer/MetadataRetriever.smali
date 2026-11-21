.class public final Landroidx/media3/exoplayer/MetadataRetriever;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;,
        Landroidx/media3/exoplayer/MetadataRetriever$SharedWorkerThread;
    }
.end annotation


# static fields
.field public static final DEFAULT_MAXIMUM_PARALLEL_RETRIEVALS:I = 0x5


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static retrieveMetadata(Landroid/content/Context;Landroidx/media3/common/o0;)Lj6/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/media3/common/o0;",
            ")",
            "Lj6/s;"
        }
    .end annotation

    .line 1
    sget-object v0, Lh1/b;->a:Lh1/z;

    invoke-static {p0, p1, v0}, Landroidx/media3/exoplayer/MetadataRetriever;->retrieveMetadata(Landroid/content/Context;Landroidx/media3/common/o0;Lh1/b;)Lj6/s;

    move-result-object p0

    return-object p0
.end method

.method public static retrieveMetadata(Landroid/content/Context;Landroidx/media3/common/o0;Lh1/b;)Lj6/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/media3/common/o0;",
            "Lh1/b;",
            ")",
            "Lj6/s;"
        }
    .end annotation

    .line 3
    new-instance v0, Ln1/l;

    invoke-direct {v0}, Ln1/l;-><init>()V

    .line 4
    monitor-enter v0

    const/4 v1, 0x6

    .line 5
    :try_start_0
    iput v1, v0, Ln1/l;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    monitor-exit v0

    .line 7
    new-instance v1, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;

    invoke-direct {v1, p0, v0}, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;-><init>(Landroid/content/Context;Ln1/q;)V

    .line 8
    invoke-static {v1, p1, p2}, Landroidx/media3/exoplayer/MetadataRetriever;->retrieveMetadata(Landroidx/media3/exoplayer/source/MediaSource$Factory;Landroidx/media3/common/o0;Lh1/b;)Lj6/s;

    move-result-object p0

    return-object p0

    :catchall_0
    move-exception p0

    .line 9
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static retrieveMetadata(Landroidx/media3/exoplayer/source/MediaSource$Factory;Landroidx/media3/common/o0;)Lj6/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/source/MediaSource$Factory;",
            "Landroidx/media3/common/o0;",
            ")",
            "Lj6/s;"
        }
    .end annotation

    .line 2
    sget-object v0, Lh1/b;->a:Lh1/z;

    invoke-static {p0, p1, v0}, Landroidx/media3/exoplayer/MetadataRetriever;->retrieveMetadata(Landroidx/media3/exoplayer/source/MediaSource$Factory;Landroidx/media3/common/o0;Lh1/b;)Lj6/s;

    move-result-object p0

    return-object p0
.end method

.method private static retrieveMetadata(Landroidx/media3/exoplayer/source/MediaSource$Factory;Landroidx/media3/common/o0;Lh1/b;)Lj6/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/source/MediaSource$Factory;",
            "Landroidx/media3/common/o0;",
            "Lh1/b;",
            ")",
            "Lj6/s;"
        }
    .end annotation

    .line 10
    new-instance v0, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;

    invoke-direct {v0, p0, p1, p2}, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;-><init>(Landroidx/media3/exoplayer/source/MediaSource$Factory;Landroidx/media3/common/o0;Lh1/b;)V

    invoke-virtual {v0}, Landroidx/media3/exoplayer/MetadataRetriever$MetadataRetrieverInternal;->retrieveMetadata()Lj6/s;

    move-result-object p0

    return-object p0
.end method

.method public static setMaximumParallelRetrievals(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p0, v0, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-static {v0}, Lh1/a;->d(Z)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Landroidx/media3/exoplayer/MetadataRetriever$SharedWorkerThread;->MAX_PARALLEL_RETRIEVALS:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
