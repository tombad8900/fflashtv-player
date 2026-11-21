.class public final Landroidx/media3/exoplayer/dash/DashUtil;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


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

.method public static buildDataSpec(Landroidx/media3/exoplayer/dash/manifest/Representation;Landroidx/media3/exoplayer/dash/manifest/RangedUri;I)Lk1/l;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/manifest/Representation;->baseUrls:Lf6/m0;

    const/4 v1, 0x0

    .line 11
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    iget-object v0, v0, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;->url:Ljava/lang/String;

    .line 12
    sget-object v1, Lf6/q1;->p:Lf6/q1;

    .line 13
    invoke-static {p0, v0, p1, p2, v1}, Landroidx/media3/exoplayer/dash/DashUtil;->buildDataSpec(Landroidx/media3/exoplayer/dash/manifest/Representation;Ljava/lang/String;Landroidx/media3/exoplayer/dash/manifest/RangedUri;ILjava/util/Map;)Lk1/l;

    move-result-object p0

    return-object p0
.end method

.method public static buildDataSpec(Landroidx/media3/exoplayer/dash/manifest/Representation;Ljava/lang/String;Landroidx/media3/exoplayer/dash/manifest/RangedUri;I)Lk1/l;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 8
    sget-object v0, Lf6/q1;->p:Lf6/q1;

    .line 9
    invoke-static {p0, p1, p2, p3, v0}, Landroidx/media3/exoplayer/dash/DashUtil;->buildDataSpec(Landroidx/media3/exoplayer/dash/manifest/Representation;Ljava/lang/String;Landroidx/media3/exoplayer/dash/manifest/RangedUri;ILjava/util/Map;)Lk1/l;

    move-result-object p0

    return-object p0
.end method

.method public static buildDataSpec(Landroidx/media3/exoplayer/dash/manifest/Representation;Ljava/lang/String;Landroidx/media3/exoplayer/dash/manifest/RangedUri;ILjava/util/Map;)Lk1/l;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/dash/manifest/Representation;",
            "Ljava/lang/String;",
            "Landroidx/media3/exoplayer/dash/manifest/RangedUri;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lk1/l;"
        }
    .end annotation

    .line 1
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    invoke-virtual {p2, p1}, Landroidx/media3/exoplayer/dash/manifest/RangedUri;->resolveUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-wide v5, p2, Landroidx/media3/exoplayer/dash/manifest/RangedUri;->start:J

    .line 3
    iget-wide v7, p2, Landroidx/media3/exoplayer/dash/manifest/RangedUri;->length:J

    .line 4
    invoke-static {p0, p2}, Landroidx/media3/exoplayer/dash/DashUtil;->resolveCacheKey(Landroidx/media3/exoplayer/dash/manifest/Representation;Landroidx/media3/exoplayer/dash/manifest/RangedUri;)Ljava/lang/String;

    move-result-object v9

    .line 5
    const-string v0, "The uri must be set."

    invoke-static {v0, v1}, Lh1/a;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    new-instance v0, Lk1/l;

    const/4 v2, 0x1

    const/4 v3, 0x0

    move v10, p3

    move-object v4, p4

    .line 7
    invoke-direct/range {v0 .. v10}, Lk1/l;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    return-object v0
.end method

.method private static getFirstRepresentation(Landroidx/media3/exoplayer/dash/manifest/Period;I)Landroidx/media3/exoplayer/dash/manifest/Representation;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/dash/manifest/Period;->getAdaptationSetIndex(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, -0x1

    .line 6
    const/4 v1, 0x0

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    iget-object p0, p0, Landroidx/media3/exoplayer/dash/manifest/Period;->adaptationSets:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;

    .line 17
    .line 18
    iget-object p0, p0, Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;->representations:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Landroidx/media3/exoplayer/dash/manifest/Representation;

    .line 33
    .line 34
    return-object p0
.end method

.method public static loadChunkIndex(Lk1/h;ILandroidx/media3/exoplayer/dash/manifest/Representation;)Ln1/j;
    .locals 1

    const/4 v0, 0x0

    .line 8
    invoke-static {p0, p1, p2, v0}, Landroidx/media3/exoplayer/dash/DashUtil;->loadChunkIndex(Lk1/h;ILandroidx/media3/exoplayer/dash/manifest/Representation;I)Ln1/j;

    move-result-object p0

    return-object p0
.end method

.method public static loadChunkIndex(Lk1/h;ILandroidx/media3/exoplayer/dash/manifest/Representation;I)Ln1/j;
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroidx/media3/exoplayer/dash/manifest/Representation;->getInitializationUri()Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 2
    :cond_0
    iget-object v0, p2, Landroidx/media3/exoplayer/dash/manifest/Representation;->format:Landroidx/media3/common/w;

    invoke-static {p1, v0}, Landroidx/media3/exoplayer/dash/DashUtil;->newChunkExtractor(ILandroidx/media3/common/w;)Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;

    move-result-object p1

    const/4 v0, 0x1

    .line 3
    :try_start_0
    invoke-static {p1, p0, p2, p3, v0}, Landroidx/media3/exoplayer/dash/DashUtil;->loadInitializationData(Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;Lk1/h;Landroidx/media3/exoplayer/dash/manifest/Representation;IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    invoke-interface {p1}, Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;->release()V

    .line 5
    invoke-interface {p1}, Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;->getChunkIndex()Ln1/j;

    move-result-object p0

    return-object p0

    :catchall_0
    move-exception p0

    .line 6
    invoke-interface {p1}, Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;->release()V

    .line 7
    throw p0
.end method

.method public static loadFormatWithDrmInitData(Lk1/h;Landroidx/media3/exoplayer/dash/manifest/Period;)Landroidx/media3/common/w;
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {p1, v0}, Landroidx/media3/exoplayer/dash/DashUtil;->getFirstRepresentation(Landroidx/media3/exoplayer/dash/manifest/Period;I)Landroidx/media3/exoplayer/dash/manifest/Representation;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-static {p1, v0}, Landroidx/media3/exoplayer/dash/DashUtil;->getFirstRepresentation(Landroidx/media3/exoplayer/dash/manifest/Period;I)Landroidx/media3/exoplayer/dash/manifest/Representation;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :cond_0
    iget-object p1, v1, Landroidx/media3/exoplayer/dash/manifest/Representation;->format:Landroidx/media3/common/w;

    .line 18
    .line 19
    invoke-static {p0, v0, v1}, Landroidx/media3/exoplayer/dash/DashUtil;->loadSampleFormat(Lk1/h;ILandroidx/media3/exoplayer/dash/manifest/Representation;)Landroidx/media3/common/w;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_1
    invoke-virtual {p0, p1}, Landroidx/media3/common/w;->f(Landroidx/media3/common/w;)Landroidx/media3/common/w;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method private static loadInitializationData(Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;Lk1/h;Landroidx/media3/exoplayer/dash/manifest/Representation;IZ)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroidx/media3/exoplayer/dash/manifest/Representation;->getInitializationUri()Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p4, :cond_2

    .line 3
    invoke-virtual {p2}, Landroidx/media3/exoplayer/dash/manifest/Representation;->getIndexUri()Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    move-result-object p4

    if-nez p4, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object v1, p2, Landroidx/media3/exoplayer/dash/manifest/Representation;->baseUrls:Lf6/m0;

    .line 5
    invoke-interface {v1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    iget-object v1, v1, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;->url:Ljava/lang/String;

    invoke-virtual {v0, p4, v1}, Landroidx/media3/exoplayer/dash/manifest/RangedUri;->attemptMerge(Landroidx/media3/exoplayer/dash/manifest/RangedUri;Ljava/lang/String;)Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    move-result-object v1

    if-nez v1, :cond_1

    .line 6
    invoke-static {p1, p2, p3, p0, v0}, Landroidx/media3/exoplayer/dash/DashUtil;->loadInitializationData(Lk1/h;Landroidx/media3/exoplayer/dash/manifest/Representation;ILandroidx/media3/exoplayer/source/chunk/ChunkExtractor;Landroidx/media3/exoplayer/dash/manifest/RangedUri;)V

    move-object v0, p4

    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 7
    :cond_2
    :goto_0
    invoke-static {p1, p2, p3, p0, v0}, Landroidx/media3/exoplayer/dash/DashUtil;->loadInitializationData(Lk1/h;Landroidx/media3/exoplayer/dash/manifest/Representation;ILandroidx/media3/exoplayer/source/chunk/ChunkExtractor;Landroidx/media3/exoplayer/dash/manifest/RangedUri;)V

    return-void
.end method

.method public static loadInitializationData(Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;Lk1/h;Landroidx/media3/exoplayer/dash/manifest/Representation;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 8
    invoke-static {p0, p1, p2, v0, p3}, Landroidx/media3/exoplayer/dash/DashUtil;->loadInitializationData(Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;Lk1/h;Landroidx/media3/exoplayer/dash/manifest/Representation;IZ)V

    return-void
.end method

.method private static loadInitializationData(Lk1/h;Landroidx/media3/exoplayer/dash/manifest/Representation;ILandroidx/media3/exoplayer/source/chunk/ChunkExtractor;Landroidx/media3/exoplayer/dash/manifest/RangedUri;)V
    .locals 9

    .line 9
    iget-object v0, p1, Landroidx/media3/exoplayer/dash/manifest/Representation;->baseUrls:Lf6/m0;

    .line 10
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    iget-object p2, p2, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;->url:Ljava/lang/String;

    const/4 v0, 0x0

    .line 11
    sget-object v1, Lf6/q1;->p:Lf6/q1;

    .line 12
    invoke-static {p1, p2, p4, v0, v1}, Landroidx/media3/exoplayer/dash/DashUtil;->buildDataSpec(Landroidx/media3/exoplayer/dash/manifest/Representation;Ljava/lang/String;Landroidx/media3/exoplayer/dash/manifest/RangedUri;ILjava/util/Map;)Lk1/l;

    move-result-object v4

    .line 13
    new-instance v2, Landroidx/media3/exoplayer/source/chunk/InitializationChunk;

    iget-object v5, p1, Landroidx/media3/exoplayer/dash/manifest/Representation;->format:Landroidx/media3/common/w;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p0

    move-object v8, p3

    invoke-direct/range {v2 .. v8}, Landroidx/media3/exoplayer/source/chunk/InitializationChunk;-><init>(Lk1/h;Lk1/l;Landroidx/media3/common/w;ILjava/lang/Object;Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;)V

    .line 14
    invoke-virtual {v2}, Landroidx/media3/exoplayer/source/chunk/InitializationChunk;->load()V

    return-void
.end method

.method public static loadManifest(Lk1/h;Landroid/net/Uri;)Landroidx/media3/exoplayer/dash/manifest/DashManifest;
    .locals 2

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-static {p0, v0, p1, v1}, Landroidx/media3/exoplayer/upstream/ParsingLoadable;->load(Lk1/h;Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;Landroid/net/Uri;I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Landroidx/media3/exoplayer/dash/manifest/DashManifest;

    .line 12
    .line 13
    return-object p0
.end method

.method public static loadSampleFormat(Lk1/h;ILandroidx/media3/exoplayer/dash/manifest/Representation;)Landroidx/media3/common/w;
    .locals 1

    const/4 v0, 0x0

    .line 8
    invoke-static {p0, p1, p2, v0}, Landroidx/media3/exoplayer/dash/DashUtil;->loadSampleFormat(Lk1/h;ILandroidx/media3/exoplayer/dash/manifest/Representation;I)Landroidx/media3/common/w;

    move-result-object p0

    return-object p0
.end method

.method public static loadSampleFormat(Lk1/h;ILandroidx/media3/exoplayer/dash/manifest/Representation;I)Landroidx/media3/common/w;
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroidx/media3/exoplayer/dash/manifest/Representation;->getInitializationUri()Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 2
    :cond_0
    iget-object v0, p2, Landroidx/media3/exoplayer/dash/manifest/Representation;->format:Landroidx/media3/common/w;

    invoke-static {p1, v0}, Landroidx/media3/exoplayer/dash/DashUtil;->newChunkExtractor(ILandroidx/media3/common/w;)Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;

    move-result-object p1

    const/4 v0, 0x0

    .line 3
    :try_start_0
    invoke-static {p1, p0, p2, p3, v0}, Landroidx/media3/exoplayer/dash/DashUtil;->loadInitializationData(Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;Lk1/h;Landroidx/media3/exoplayer/dash/manifest/Representation;IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    invoke-interface {p1}, Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;->release()V

    .line 5
    invoke-interface {p1}, Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;->getSampleFormats()[Landroidx/media3/common/w;

    move-result-object p0

    invoke-static {p0}, Lh1/a;->k(Ljava/lang/Object;)V

    aget-object p0, p0, v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 6
    invoke-interface {p1}, Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;->release()V

    .line 7
    throw p0
.end method

.method private static newChunkExtractor(ILandroidx/media3/common/w;)Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;
    .locals 3

    .line 1
    iget-object v0, p1, Landroidx/media3/common/w;->m:Ljava/lang/String;

    .line 2
    .line 3
    sget-object v1, Lk2/o;->g:Lk2/b;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const-string v2, "video/webm"

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    const-string v2, "audio/webm"

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    :cond_0
    new-instance v0, Lf2/d;

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v2, v1}, Lf2/d;-><init>(ILk2/o;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    new-instance v0, Lh2/i;

    .line 31
    .line 32
    const/16 v2, 0x20

    .line 33
    .line 34
    invoke-direct {v0, v2, v1}, Lh2/i;-><init>(ILk2/o;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    new-instance v1, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;

    .line 38
    .line 39
    invoke-direct {v1, v0, p0, p1}, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;-><init>(Ln1/n;ILandroidx/media3/common/w;)V

    .line 40
    .line 41
    .line 42
    return-object v1
.end method

.method public static resolveCacheKey(Landroidx/media3/exoplayer/dash/manifest/Representation;Landroidx/media3/exoplayer/dash/manifest/RangedUri;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/dash/manifest/Representation;->getCacheKey()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object p0, p0, Landroidx/media3/exoplayer/dash/manifest/Representation;->baseUrls:Lf6/m0;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    .line 16
    .line 17
    iget-object p0, p0, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;->url:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Landroidx/media3/exoplayer/dash/manifest/RangedUri;->resolveUri(Ljava/lang/String;)Landroid/net/Uri;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
