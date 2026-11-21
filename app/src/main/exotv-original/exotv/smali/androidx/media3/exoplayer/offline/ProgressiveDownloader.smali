.class public final Landroidx/media3/exoplayer/offline/ProgressiveDownloader;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/offline/Downloader;


# instance fields
.field private final cacheWriter:Ll1/f;

.field private final dataSource:Ll1/c;

.field private final dataSpec:Lk1/l;

.field private volatile downloadRunnable:Lh1/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh1/x;"
        }
    .end annotation
.end field

.field private final executor:Ljava/util/concurrent/Executor;

.field private volatile isCanceled:Z

.field private final priorityTaskManager:Landroidx/media3/common/g1;

.field private progressListener:Landroidx/media3/exoplayer/offline/Downloader$ProgressListener;


# direct methods
.method public constructor <init>(Landroidx/media3/common/o0;Ll1/b;)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/dash/offline/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Landroidx/media3/exoplayer/offline/ProgressiveDownloader;-><init>(Landroidx/media3/common/o0;Ll1/b;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public constructor <init>(Landroidx/media3/common/o0;Ll1/b;Ljava/util/concurrent/Executor;)V
    .locals 11

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    iput-object p3, p0, Landroidx/media3/exoplayer/offline/ProgressiveDownloader;->executor:Ljava/util/concurrent/Executor;

    .line 5
    iget-object p3, p1, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 6
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    sget-object v4, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 8
    iget-object p1, p1, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    iget-object v1, p1, Landroidx/media3/common/j0;->a:Landroid/net/Uri;

    .line 9
    iget-object v9, p1, Landroidx/media3/common/j0;->f:Ljava/lang/String;

    .line 10
    const-string p1, "The uri must be set."

    invoke-static {p1, v1}, Lh1/a;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    new-instance v0, Lk1/l;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, -0x1

    const/4 v10, 0x4

    .line 12
    invoke-direct/range {v0 .. v10}, Lk1/l;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 13
    iput-object v0, p0, Landroidx/media3/exoplayer/offline/ProgressiveDownloader;->dataSpec:Lk1/l;

    .line 14
    iget-object p1, p2, Ll1/b;->j:Lk1/g;

    if-eqz p1, :cond_0

    .line 15
    invoke-interface {p1}, Lk1/g;->l()Lk1/h;

    :cond_0
    const/4 p1, 0x0

    .line 16
    throw p1
.end method

.method public static synthetic access$000(Landroidx/media3/exoplayer/offline/ProgressiveDownloader;)Ll1/f;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/offline/ProgressiveDownloader;->cacheWriter:Ll1/f;

    .line 2
    .line 3
    return-object p0
.end method

.method private onProgress(JJJ)V
    .locals 2

    .line 1
    move-wide p4, p3

    .line 2
    move-wide p2, p1

    .line 3
    iget-object p1, p0, Landroidx/media3/exoplayer/offline/ProgressiveDownloader;->progressListener:Landroidx/media3/exoplayer/offline/Downloader$ProgressListener;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-wide/16 v0, -0x1

    .line 9
    .line 10
    cmp-long p6, p2, v0

    .line 11
    .line 12
    if-eqz p6, :cond_2

    .line 13
    .line 14
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    cmp-long p6, p2, v0

    .line 17
    .line 18
    if-nez p6, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    long-to-float p6, p4

    .line 22
    const/high16 v0, 0x42c80000    # 100.0f

    .line 23
    .line 24
    mul-float/2addr p6, v0

    .line 25
    long-to-float v0, p2

    .line 26
    div-float/2addr p6, v0

    .line 27
    goto :goto_1

    .line 28
    :cond_2
    :goto_0
    const/high16 p6, -0x40800000    # -1.0f

    .line 29
    .line 30
    :goto_1
    invoke-interface/range {p1 .. p6}, Landroidx/media3/exoplayer/offline/Downloader$ProgressListener;->onProgress(JJF)V

    .line 31
    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/offline/ProgressiveDownloader;->isCanceled:Z

    .line 3
    .line 4
    iget-object v1, p0, Landroidx/media3/exoplayer/offline/ProgressiveDownloader;->downloadRunnable:Lh1/x;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Lh1/x;->cancel(Z)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public download(Landroidx/media3/exoplayer/offline/Downloader$ProgressListener;)V
    .locals 1

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/offline/ProgressiveDownloader;->progressListener:Landroidx/media3/exoplayer/offline/Downloader$ProgressListener;

    .line 2
    .line 3
    :try_start_0
    iget-boolean p1, p0, Landroidx/media3/exoplayer/offline/ProgressiveDownloader;->isCanceled:Z

    .line 4
    .line 5
    if-nez p1, :cond_1

    .line 6
    .line 7
    new-instance p1, Landroidx/media3/exoplayer/offline/ProgressiveDownloader$1;

    .line 8
    .line 9
    invoke-direct {p1, p0}, Landroidx/media3/exoplayer/offline/ProgressiveDownloader$1;-><init>(Landroidx/media3/exoplayer/offline/ProgressiveDownloader;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Landroidx/media3/exoplayer/offline/ProgressiveDownloader;->downloadRunnable:Lh1/x;

    .line 13
    .line 14
    iget-object p1, p0, Landroidx/media3/exoplayer/offline/ProgressiveDownloader;->executor:Ljava/util/concurrent/Executor;

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/ProgressiveDownloader;->downloadRunnable:Lh1/x;

    .line 17
    .line 18
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    :try_start_1
    iget-object p1, p0, Landroidx/media3/exoplayer/offline/ProgressiveDownloader;->downloadRunnable:Lh1/x;

    .line 22
    .line 23
    invoke-virtual {p1}, Lh1/x;->get()Ljava/lang/Object;
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_1

    .line 29
    :catch_0
    move-exception p1

    .line 30
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    instance-of v0, p1, Ljava/io/IOException;

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    check-cast p1, Ljava/io/IOException;

    .line 42
    .line 43
    throw p1

    .line 44
    :cond_0
    sget v0, Lh1/i0;->a:I

    .line 45
    .line 46
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    :cond_1
    :goto_0
    iget-object p1, p0, Landroidx/media3/exoplayer/offline/ProgressiveDownloader;->downloadRunnable:Lh1/x;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Lh1/x;->blockUntilFinished()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :goto_1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/ProgressiveDownloader;->downloadRunnable:Lh1/x;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lh1/x;->blockUntilFinished()V

    .line 62
    .line 63
    .line 64
    throw p1
.end method

.method public remove()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    throw v0
.end method
