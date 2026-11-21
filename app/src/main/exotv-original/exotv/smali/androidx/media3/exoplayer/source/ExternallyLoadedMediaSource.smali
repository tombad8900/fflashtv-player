.class public final Landroidx/media3/exoplayer/source/ExternallyLoadedMediaSource;
.super Landroidx/media3/exoplayer/source/BaseMediaSource;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/source/ExternallyLoadedMediaSource$Factory;
    }
.end annotation


# instance fields
.field private final externalLoader:Landroidx/media3/exoplayer/source/ExternalLoader;

.field private mediaItem:Landroidx/media3/common/o0;

.field private final timelineDurationUs:J


# direct methods
.method private constructor <init>(Landroidx/media3/common/o0;JLandroidx/media3/exoplayer/source/ExternalLoader;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroidx/media3/exoplayer/source/BaseMediaSource;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/source/ExternallyLoadedMediaSource;->mediaItem:Landroidx/media3/common/o0;

    .line 4
    iput-wide p2, p0, Landroidx/media3/exoplayer/source/ExternallyLoadedMediaSource;->timelineDurationUs:J

    .line 5
    iput-object p4, p0, Landroidx/media3/exoplayer/source/ExternallyLoadedMediaSource;->externalLoader:Landroidx/media3/exoplayer/source/ExternalLoader;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/media3/common/o0;JLandroidx/media3/exoplayer/source/ExternalLoader;Landroidx/media3/exoplayer/source/ExternallyLoadedMediaSource$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/media3/exoplayer/source/ExternallyLoadedMediaSource;-><init>(Landroidx/media3/common/o0;JLandroidx/media3/exoplayer/source/ExternalLoader;)V

    return-void
.end method


# virtual methods
.method public canUpdateMediaItem(Landroidx/media3/common/o0;)Z
    .locals 4

    .line 1
    iget-object p1, p1, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/exoplayer/source/ExternallyLoadedMediaSource;->getMediaItem()Landroidx/media3/common/o0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object v1, p1, Landroidx/media3/common/j0;->a:Landroid/net/Uri;

    .line 15
    .line 16
    iget-object v2, v0, Landroidx/media3/common/j0;->a:Landroid/net/Uri;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object v1, p1, Landroidx/media3/common/j0;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v0, v0, Landroidx/media3/common/j0;->b:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-wide v0, p1, Landroidx/media3/common/j0;->i:J

    .line 35
    .line 36
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    cmp-long p1, v0, v2

    .line 42
    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    invoke-static {v0, v1}, Lh1/i0;->S(J)J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    iget-wide v2, p0, Landroidx/media3/exoplayer/source/ExternallyLoadedMediaSource;->timelineDurationUs:J

    .line 50
    .line 51
    cmp-long p1, v0, v2

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    :cond_0
    const/4 p1, 0x1

    .line 56
    return p1

    .line 57
    :cond_1
    const/4 p1, 0x0

    .line 58
    return p1
.end method

.method public createPeriod(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;Landroidx/media3/exoplayer/upstream/Allocator;J)Landroidx/media3/exoplayer/source/MediaPeriod;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/source/ExternallyLoadedMediaSource;->getMediaItem()Landroidx/media3/common/o0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p1, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object p1, p1, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 11
    .line 12
    iget-object p2, p1, Landroidx/media3/common/j0;->b:Ljava/lang/String;

    .line 13
    .line 14
    const-string p3, "Externally loaded mediaItems require a MIME type."

    .line 15
    .line 16
    invoke-static {p3, p2}, Lh1/a;->h(Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance p2, Landroidx/media3/exoplayer/source/ExternallyLoadedMediaPeriod;

    .line 20
    .line 21
    iget-object p3, p1, Landroidx/media3/common/j0;->a:Landroid/net/Uri;

    .line 22
    .line 23
    iget-object p1, p1, Landroidx/media3/common/j0;->b:Ljava/lang/String;

    .line 24
    .line 25
    iget-object p4, p0, Landroidx/media3/exoplayer/source/ExternallyLoadedMediaSource;->externalLoader:Landroidx/media3/exoplayer/source/ExternalLoader;

    .line 26
    .line 27
    invoke-direct {p2, p3, p1, p4}, Landroidx/media3/exoplayer/source/ExternallyLoadedMediaPeriod;-><init>(Landroid/net/Uri;Ljava/lang/String;Landroidx/media3/exoplayer/source/ExternalLoader;)V

    .line 28
    .line 29
    .line 30
    return-object p2
.end method

.method public declared-synchronized getMediaItem()Landroidx/media3/common/o0;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Landroidx/media3/exoplayer/source/ExternallyLoadedMediaSource;->mediaItem:Landroidx/media3/common/o0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public maybeThrowSourceInfoRefreshError()V
    .locals 0

    .line 1
    return-void
.end method

.method public prepareSourceInternal(Lk1/c0;)V
    .locals 8

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;

    .line 2
    .line 3
    iget-wide v1, p0, Landroidx/media3/exoplayer/source/ExternallyLoadedMediaSource;->timelineDurationUs:J

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    invoke-virtual {p0}, Landroidx/media3/exoplayer/source/ExternallyLoadedMediaSource;->getMediaItem()Landroidx/media3/common/o0;

    .line 7
    .line 8
    .line 9
    move-result-object v7

    .line 10
    const/4 v3, 0x1

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    invoke-direct/range {v0 .. v7}, Landroidx/media3/exoplayer/source/SinglePeriodTimeline;-><init>(JZZZLjava/lang/Object;Landroidx/media3/common/o0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroidx/media3/exoplayer/source/BaseMediaSource;->refreshSourceInfo(Landroidx/media3/common/p1;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public releasePeriod(Landroidx/media3/exoplayer/source/MediaPeriod;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/media3/exoplayer/source/ExternallyLoadedMediaPeriod;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/media3/exoplayer/source/ExternallyLoadedMediaPeriod;->releasePeriod()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public releaseSourceInternal()V
    .locals 0

    .line 1
    return-void
.end method

.method public declared-synchronized updateMediaItem(Landroidx/media3/common/o0;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Landroidx/media3/exoplayer/source/ExternallyLoadedMediaSource;->mediaItem:Landroidx/media3/common/o0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method
