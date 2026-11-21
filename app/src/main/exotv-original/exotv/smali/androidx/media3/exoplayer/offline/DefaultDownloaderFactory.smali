.class public Landroidx/media3/exoplayer/offline/DefaultDownloaderFactory;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/offline/DownloaderFactory;


# static fields
.field private static final CONSTRUCTORS:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/reflect/Constructor<",
            "+",
            "Landroidx/media3/exoplayer/offline/Downloader;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field private final cacheDataSourceFactory:Ll1/b;

.field private final executor:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Landroidx/media3/exoplayer/offline/DefaultDownloaderFactory;->createDownloaderConstructors()Landroid/util/SparseArray;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Landroidx/media3/exoplayer/offline/DefaultDownloaderFactory;->CONSTRUCTORS:Landroid/util/SparseArray;

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(Ll1/b;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/dash/offline/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/offline/DefaultDownloaderFactory;-><init>(Ll1/b;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public constructor <init>(Ll1/b;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/offline/DefaultDownloaderFactory;->cacheDataSourceFactory:Ll1/b;

    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    iput-object p2, p0, Landroidx/media3/exoplayer/offline/DefaultDownloaderFactory;->executor:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private createDownloader(Landroidx/media3/exoplayer/offline/DownloadRequest;I)Landroidx/media3/exoplayer/offline/Downloader;
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v2, p2

    .line 34
    sget-object v3, Landroidx/media3/exoplayer/offline/DefaultDownloaderFactory;->CONSTRUCTORS:Landroid/util/SparseArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Constructor;

    if-eqz v3, :cond_5

    .line 35
    new-instance v4, Landroidx/media3/common/c0;

    invoke-direct {v4}, Landroidx/media3/common/c0;-><init>()V

    .line 36
    new-instance v5, Landroidx/media3/common/f0;

    .line 37
    invoke-direct {v5}, Landroidx/media3/common/f0;-><init>()V

    .line 38
    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 39
    sget-object v14, Lf6/l1;->n:Lf6/l1;

    .line 40
    new-instance v6, Landroidx/media3/common/h0;

    invoke-direct {v6}, Landroidx/media3/common/h0;-><init>()V

    .line 41
    sget-object v18, Landroidx/media3/common/k0;->d:Landroidx/media3/common/k0;

    .line 42
    iget-object v8, v0, Landroidx/media3/exoplayer/offline/DownloadRequest;->uri:Landroid/net/Uri;

    .line 43
    iget-object v7, v0, Landroidx/media3/exoplayer/offline/DownloadRequest;->streamKeys:Ljava/util/List;

    if-eqz v7, :cond_0

    .line 44
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_0

    .line 45
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v9}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    :goto_0
    move-object v12, v7

    goto :goto_1

    .line 46
    :cond_0
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    .line 47
    :goto_1
    iget-object v13, v0, Landroidx/media3/exoplayer/offline/DownloadRequest;->customCacheKey:Ljava/lang/String;

    .line 48
    iget-object v0, v5, Landroidx/media3/common/f0;->b:Landroid/net/Uri;

    if-eqz v0, :cond_2

    .line 49
    iget-object v0, v5, Landroidx/media3/common/f0;->a:Ljava/util/UUID;

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    goto :goto_3

    :cond_2
    :goto_2
    const/4 v0, 0x1

    .line 50
    :goto_3
    invoke-static {v0}, Lh1/a;->j(Z)V

    const/4 v0, 0x0

    if-eqz v8, :cond_4

    .line 51
    new-instance v7, Landroidx/media3/common/j0;

    .line 52
    iget-object v9, v5, Landroidx/media3/common/f0;->a:Ljava/util/UUID;

    if-eqz v9, :cond_3

    .line 53
    new-instance v0, Landroidx/media3/common/g0;

    invoke-direct {v0, v5}, Landroidx/media3/common/g0;-><init>(Landroidx/media3/common/f0;)V

    :cond_3
    move-object v10, v0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 54
    invoke-direct/range {v7 .. v17}, Landroidx/media3/common/j0;-><init>(Landroid/net/Uri;Ljava/lang/String;Landroidx/media3/common/g0;Landroidx/media3/common/a0;Ljava/util/List;Ljava/lang/String;Lf6/m0;Ljava/lang/Object;J)V

    move-object v10, v7

    goto :goto_4

    :cond_4
    move-object v10, v0

    .line 55
    :goto_4
    new-instance v7, Landroidx/media3/common/o0;

    .line 56
    new-instance v9, Landroidx/media3/common/e0;

    .line 57
    invoke-direct {v9, v4}, Landroidx/media3/common/d0;-><init>(Landroidx/media3/common/c0;)V

    .line 58
    new-instance v11, Landroidx/media3/common/i0;

    invoke-direct {v11, v6}, Landroidx/media3/common/i0;-><init>(Landroidx/media3/common/h0;)V

    .line 59
    sget-object v12, Landroidx/media3/common/r0;->K:Landroidx/media3/common/r0;

    .line 60
    const-string v8, ""

    move-object/from16 v13, v18

    invoke-direct/range {v7 .. v13}, Landroidx/media3/common/o0;-><init>(Ljava/lang/String;Landroidx/media3/common/e0;Landroidx/media3/common/j0;Landroidx/media3/common/i0;Landroidx/media3/common/r0;Landroidx/media3/common/k0;)V

    .line 61
    :try_start_0
    iget-object v0, v1, Landroidx/media3/exoplayer/offline/DefaultDownloaderFactory;->cacheDataSourceFactory:Ll1/b;

    iget-object v4, v1, Landroidx/media3/exoplayer/offline/DefaultDownloaderFactory;->executor:Ljava/util/concurrent/Executor;

    filled-new-array {v7, v0, v4}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/media3/exoplayer/offline/Downloader;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 62
    new-instance v3, Ljava/lang/IllegalStateException;

    const-string v4, "Failed to instantiate downloader for content type "

    .line 63
    invoke-static {v2, v4}, La1/a1;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 64
    invoke-direct {v3, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    .line 65
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "Module missing for content type "

    .line 66
    invoke-static {v2, v3}, La1/a1;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 67
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static createDownloaderConstructors()Landroid/util/SparseArray;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/SparseArray<",
            "Ljava/lang/reflect/Constructor<",
            "+",
            "Landroidx/media3/exoplayer/offline/Downloader;",
            ">;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    const-class v1, Landroidx/media3/exoplayer/dash/offline/DashDownloader;

    .line 7
    .line 8
    invoke-static {v1}, Landroidx/media3/exoplayer/offline/DefaultDownloaderFactory;->getDownloaderConstructor(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    :catch_0
    :try_start_1
    const-class v1, Landroidx/media3/exoplayer/hls/offline/HlsDownloader;

    .line 17
    .line 18
    invoke-static {v1}, Landroidx/media3/exoplayer/offline/DefaultDownloaderFactory;->getDownloaderConstructor(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x2

    .line 23
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 24
    .line 25
    .line 26
    :catch_1
    :try_start_2
    const-class v1, Landroidx/media3/exoplayer/smoothstreaming/offline/SsDownloader;

    .line 27
    .line 28
    invoke-static {v1}, Landroidx/media3/exoplayer/offline/DefaultDownloaderFactory;->getDownloaderConstructor(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    .line 34
    .line 35
    .line 36
    :catch_2
    return-object v0
.end method

.method private static getDownloaderConstructor(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/reflect/Constructor<",
            "+",
            "Landroidx/media3/exoplayer/offline/Downloader;",
            ">;"
        }
    .end annotation

    .line 1
    :try_start_0
    const-class v0, Landroidx/media3/exoplayer/offline/Downloader;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-class v0, Landroidx/media3/common/o0;

    .line 8
    .line 9
    const-class v1, Ll1/b;

    .line 10
    .line 11
    const-class v2, Ljava/util/concurrent/Executor;

    .line 12
    .line 13
    filled-new-array {v0, v1, v2}, [Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    return-object p0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v1, "Downloader constructor missing"

    .line 26
    .line 27
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    throw v0
.end method


# virtual methods
.method public createDownloader(Landroidx/media3/exoplayer/offline/DownloadRequest;)Landroidx/media3/exoplayer/offline/Downloader;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    iget-object v2, v1, Landroidx/media3/exoplayer/offline/DownloadRequest;->uri:Landroid/net/Uri;

    iget-object v3, v1, Landroidx/media3/exoplayer/offline/DownloadRequest;->mimeType:Ljava/lang/String;

    invoke-static {v2, v3}, Lh1/i0;->K(Landroid/net/Uri;Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_5

    const/4 v3, 0x1

    if-eq v2, v3, :cond_5

    const/4 v4, 0x2

    if-eq v2, v4, :cond_5

    const/4 v4, 0x4

    if-ne v2, v4, :cond_4

    .line 2
    new-instance v2, Landroidx/media3/exoplayer/offline/ProgressiveDownloader;

    .line 3
    new-instance v4, Landroidx/media3/common/c0;

    invoke-direct {v4}, Landroidx/media3/common/c0;-><init>()V

    .line 4
    new-instance v5, Landroidx/media3/common/f0;

    .line 5
    invoke-direct {v5}, Landroidx/media3/common/f0;-><init>()V

    .line 6
    sget-object v11, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 7
    sget-object v13, Lf6/l1;->n:Lf6/l1;

    .line 8
    new-instance v6, Landroidx/media3/common/h0;

    invoke-direct {v6}, Landroidx/media3/common/h0;-><init>()V

    .line 9
    sget-object v20, Landroidx/media3/common/k0;->d:Landroidx/media3/common/k0;

    .line 10
    iget-object v7, v1, Landroidx/media3/exoplayer/offline/DownloadRequest;->uri:Landroid/net/Uri;

    .line 11
    iget-object v12, v1, Landroidx/media3/exoplayer/offline/DownloadRequest;->customCacheKey:Ljava/lang/String;

    .line 12
    iget-object v1, v5, Landroidx/media3/common/f0;->b:Landroid/net/Uri;

    if-eqz v1, :cond_1

    .line 13
    iget-object v1, v5, Landroidx/media3/common/f0;->a:Ljava/util/UUID;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 14
    :cond_1
    :goto_0
    invoke-static {v3}, Lh1/a;->j(Z)V

    const/4 v1, 0x0

    move-object v3, v6

    if-eqz v7, :cond_3

    .line 15
    new-instance v6, Landroidx/media3/common/j0;

    .line 16
    iget-object v8, v5, Landroidx/media3/common/f0;->a:Ljava/util/UUID;

    if-eqz v8, :cond_2

    .line 17
    new-instance v1, Landroidx/media3/common/g0;

    invoke-direct {v1, v5}, Landroidx/media3/common/g0;-><init>(Landroidx/media3/common/f0;)V

    :cond_2
    move-object v9, v1

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    invoke-direct/range {v6 .. v16}, Landroidx/media3/common/j0;-><init>(Landroid/net/Uri;Ljava/lang/String;Landroidx/media3/common/g0;Landroidx/media3/common/a0;Ljava/util/List;Ljava/lang/String;Lf6/m0;Ljava/lang/Object;J)V

    move-object/from16 v17, v6

    goto :goto_1

    :cond_3
    move-object/from16 v17, v1

    .line 19
    :goto_1
    new-instance v14, Landroidx/media3/common/o0;

    .line 20
    new-instance v1, Landroidx/media3/common/e0;

    .line 21
    invoke-direct {v1, v4}, Landroidx/media3/common/d0;-><init>(Landroidx/media3/common/c0;)V

    .line 22
    new-instance v4, Landroidx/media3/common/i0;

    invoke-direct {v4, v3}, Landroidx/media3/common/i0;-><init>(Landroidx/media3/common/h0;)V

    .line 23
    sget-object v19, Landroidx/media3/common/r0;->K:Landroidx/media3/common/r0;

    .line 24
    const-string v15, ""

    move-object/from16 v16, v1

    move-object/from16 v18, v4

    invoke-direct/range {v14 .. v20}, Landroidx/media3/common/o0;-><init>(Ljava/lang/String;Landroidx/media3/common/e0;Landroidx/media3/common/j0;Landroidx/media3/common/i0;Landroidx/media3/common/r0;Landroidx/media3/common/k0;)V

    .line 25
    iget-object v1, v0, Landroidx/media3/exoplayer/offline/DefaultDownloaderFactory;->cacheDataSourceFactory:Ll1/b;

    iget-object v3, v0, Landroidx/media3/exoplayer/offline/DefaultDownloaderFactory;->executor:Ljava/util/concurrent/Executor;

    invoke-direct {v2, v14, v1, v3}, Landroidx/media3/exoplayer/offline/ProgressiveDownloader;-><init>(Landroidx/media3/common/o0;Ll1/b;Ljava/util/concurrent/Executor;)V

    return-object v2

    .line 26
    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v3, "Unsupported type: "

    .line 27
    invoke-static {v2, v3}, La1/a1;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 28
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 29
    :cond_5
    invoke-direct {v0, v1, v2}, Landroidx/media3/exoplayer/offline/DefaultDownloaderFactory;->createDownloader(Landroidx/media3/exoplayer/offline/DownloadRequest;I)Landroidx/media3/exoplayer/offline/Downloader;

    move-result-object v1

    return-object v1
.end method
