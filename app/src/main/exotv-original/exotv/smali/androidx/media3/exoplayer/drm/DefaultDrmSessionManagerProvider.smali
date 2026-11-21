.class public final Landroidx/media3/exoplayer/drm/DefaultDrmSessionManagerProvider;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/drm/DrmSessionManagerProvider;


# instance fields
.field private drmConfiguration:Landroidx/media3/common/g0;

.field private drmHttpDataSourceFactory:Lk1/g;

.field private drmLoadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

.field private final lock:Ljava/lang/Object;

.field private manager:Landroidx/media3/exoplayer/drm/DrmSessionManager;

.field private userAgent:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManagerProvider;->lock:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method private createManager(Landroidx/media3/common/g0;)Landroidx/media3/exoplayer/drm/DrmSessionManager;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManagerProvider;->drmHttpDataSourceFactory:Lk1/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Li2/e;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, v1}, Li2/e;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManagerProvider;->userAgent:Ljava/lang/String;

    .line 13
    .line 14
    iput-object v1, v0, Li2/e;->n:Ljava/lang/Object;

    .line 15
    .line 16
    :goto_0
    new-instance v1, Landroidx/media3/exoplayer/drm/HttpMediaDrmCallback;

    .line 17
    .line 18
    iget-object v2, p1, Landroidx/media3/common/g0;->b:Landroid/net/Uri;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    move-object v2, v3

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :goto_1
    iget-boolean v4, p1, Landroidx/media3/common/g0;->f:Z

    .line 30
    .line 31
    invoke-direct {v1, v2, v4, v0}, Landroidx/media3/exoplayer/drm/HttpMediaDrmCallback;-><init>(Ljava/lang/String;ZLk1/g;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p1, Landroidx/media3/common/g0;->c:Lf6/q0;

    .line 35
    .line 36
    invoke-virtual {v0}, Lf6/q0;->b()Lf6/w0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lf6/h0;->g()Lf6/z1;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Ljava/util/Map$Entry;

    .line 55
    .line 56
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    check-cast v4, Ljava/lang/String;

    .line 61
    .line 62
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v1, v4, v2}, Landroidx/media3/exoplayer/drm/HttpMediaDrmCallback;->setKeyRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    new-instance v0, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManager$Builder;

    .line 73
    .line 74
    invoke-direct {v0}, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManager$Builder;-><init>()V

    .line 75
    .line 76
    .line 77
    iget-object v2, p1, Landroidx/media3/common/g0;->a:Ljava/util/UUID;

    .line 78
    .line 79
    sget-object v4, Landroidx/media3/exoplayer/drm/FrameworkMediaDrm;->DEFAULT_PROVIDER:Landroidx/media3/exoplayer/drm/ExoMediaDrm$Provider;

    .line 80
    .line 81
    invoke-virtual {v0, v2, v4}, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManager$Builder;->setUuidAndExoMediaDrmProvider(Ljava/util/UUID;Landroidx/media3/exoplayer/drm/ExoMediaDrm$Provider;)Landroidx/media3/exoplayer/drm/DefaultDrmSessionManager$Builder;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget-boolean v2, p1, Landroidx/media3/common/g0;->d:Z

    .line 86
    .line 87
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManager$Builder;->setMultiSession(Z)Landroidx/media3/exoplayer/drm/DefaultDrmSessionManager$Builder;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-boolean v2, p1, Landroidx/media3/common/g0;->e:Z

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManager$Builder;->setPlayClearSamplesWithoutKeys(Z)Landroidx/media3/exoplayer/drm/DefaultDrmSessionManager$Builder;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iget-object v2, p1, Landroidx/media3/common/g0;->g:Lf6/m0;

    .line 98
    .line 99
    invoke-static {v2}, Lcom/bumptech/glide/d;->p0(Ljava/util/Collection;)[I

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManager$Builder;->setUseDrmSessionsForClearContent([I)Landroidx/media3/exoplayer/drm/DefaultDrmSessionManager$Builder;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iget-object v2, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManagerProvider;->drmLoadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    .line 108
    .line 109
    if-eqz v2, :cond_3

    .line 110
    .line 111
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManager$Builder;->setLoadErrorHandlingPolicy(Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;)Landroidx/media3/exoplayer/drm/DefaultDrmSessionManager$Builder;

    .line 112
    .line 113
    .line 114
    :cond_3
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManager$Builder;->build(Landroidx/media3/exoplayer/drm/MediaDrmCallback;)Landroidx/media3/exoplayer/drm/DefaultDrmSessionManager;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iget-object p1, p1, Landroidx/media3/common/g0;->h:[B

    .line 119
    .line 120
    if-eqz p1, :cond_4

    .line 121
    .line 122
    array-length v1, p1

    .line 123
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    :cond_4
    const/4 p1, 0x0

    .line 128
    invoke-virtual {v0, p1, v3}, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManager;->setMode(I[B)V

    .line 129
    .line 130
    .line 131
    return-object v0
.end method


# virtual methods
.method public get(Landroidx/media3/common/o0;)Landroidx/media3/exoplayer/drm/DrmSessionManager;
    .locals 3

    .line 1
    iget-object v0, p1, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 7
    .line 8
    iget-object p1, p1, Landroidx/media3/common/j0;->c:Landroidx/media3/common/g0;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    sget-object p1, Landroidx/media3/exoplayer/drm/DrmSessionManager;->DRM_UNSUPPORTED:Landroidx/media3/exoplayer/drm/DrmSessionManager;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManagerProvider;->lock:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    iget-object v1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManagerProvider;->drmConfiguration:Landroidx/media3/common/g0;

    .line 19
    .line 20
    sget v2, Lh1/i0;->a:I

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Landroidx/media3/common/g0;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    iput-object p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManagerProvider;->drmConfiguration:Landroidx/media3/common/g0;

    .line 29
    .line 30
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManagerProvider;->createManager(Landroidx/media3/common/g0;)Landroidx/media3/exoplayer/drm/DrmSessionManager;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManagerProvider;->manager:Landroidx/media3/exoplayer/drm/DrmSessionManager;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    iget-object p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManagerProvider;->manager:Landroidx/media3/exoplayer/drm/DrmSessionManager;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    monitor-exit v0

    .line 45
    return-object p1

    .line 46
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    throw p1
.end method

.method public setDrmHttpDataSourceFactory(Lk1/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManagerProvider;->drmHttpDataSourceFactory:Lk1/g;

    .line 2
    .line 3
    return-void
.end method

.method public setDrmLoadErrorHandlingPolicy(Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManagerProvider;->drmLoadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    .line 2
    .line 3
    return-void
.end method

.method public setDrmUserAgent(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManagerProvider;->userAgent:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
