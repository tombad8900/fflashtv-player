.class public final Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/source/MediaSourceFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation


# static fields
.field public static final synthetic a:I


# instance fields
.field private final chunkSourceFactory:Landroidx/media3/exoplayer/smoothstreaming/SsChunkSource$Factory;

.field private cmcdConfigurationFactory:Landroidx/media3/exoplayer/upstream/CmcdConfiguration$Factory;

.field private compositeSequenceableLoaderFactory:Landroidx/media3/exoplayer/source/CompositeSequenceableLoaderFactory;

.field private drmSessionManagerProvider:Landroidx/media3/exoplayer/drm/DrmSessionManagerProvider;

.field private livePresentationDelayMs:J

.field private loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

.field private final manifestDataSourceFactory:Lk1/g;

.field private manifestParser:Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser<",
            "+",
            "Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/smoothstreaming/SsChunkSource$Factory;Lk1/g;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->chunkSourceFactory:Landroidx/media3/exoplayer/smoothstreaming/SsChunkSource$Factory;

    .line 5
    iput-object p2, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->manifestDataSourceFactory:Lk1/g;

    .line 6
    new-instance p1, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManagerProvider;

    invoke-direct {p1}, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManagerProvider;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->drmSessionManagerProvider:Landroidx/media3/exoplayer/drm/DrmSessionManagerProvider;

    .line 7
    new-instance p1, Landroidx/media3/exoplayer/upstream/DefaultLoadErrorHandlingPolicy;

    invoke-direct {p1}, Landroidx/media3/exoplayer/upstream/DefaultLoadErrorHandlingPolicy;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    const-wide/16 p1, 0x7530

    .line 8
    iput-wide p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->livePresentationDelayMs:J

    .line 9
    new-instance p1, Landroidx/media3/exoplayer/source/DefaultCompositeSequenceableLoaderFactory;

    invoke-direct {p1}, Landroidx/media3/exoplayer/source/DefaultCompositeSequenceableLoaderFactory;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->compositeSequenceableLoaderFactory:Landroidx/media3/exoplayer/source/CompositeSequenceableLoaderFactory;

    const/4 p1, 0x1

    .line 10
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->experimentalParseSubtitlesDuringExtraction(Z)Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;

    return-void
.end method

.method public constructor <init>(Lk1/g;)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/smoothstreaming/DefaultSsChunkSource$Factory;

    invoke-direct {v0, p1}, Landroidx/media3/exoplayer/smoothstreaming/DefaultSsChunkSource$Factory;-><init>(Lk1/g;)V

    invoke-direct {p0, v0, p1}, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;-><init>(Landroidx/media3/exoplayer/smoothstreaming/SsChunkSource$Factory;Lk1/g;)V

    return-void
.end method


# virtual methods
.method public createMediaSource(Landroidx/media3/common/o0;)Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource;
    .locals 13

    .line 18
    iget-object v0, p1, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    iget-object v0, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->manifestParser:Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;

    if-nez v0, :cond_0

    .line 21
    new-instance v0, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser;

    invoke-direct {v0}, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifestParser;-><init>()V

    .line 22
    :cond_0
    iget-object v2, p1, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    iget-object v2, v2, Landroidx/media3/common/j0;->e:Ljava/util/List;

    .line 23
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 24
    new-instance v3, Landroidx/media3/exoplayer/offline/FilteringManifestParser;

    invoke-direct {v3, v0, v2}, Landroidx/media3/exoplayer/offline/FilteringManifestParser;-><init>(Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;Ljava/util/List;)V

    move-object v4, v3

    goto :goto_0

    :cond_1
    move-object v4, v0

    .line 25
    :goto_0
    iget-object v0, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->cmcdConfigurationFactory:Landroidx/media3/exoplayer/upstream/CmcdConfiguration$Factory;

    if-nez v0, :cond_2

    const/4 v0, 0x0

    :goto_1
    move-object v7, v0

    goto :goto_2

    .line 26
    :cond_2
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/upstream/CmcdConfiguration$Factory;->createCmcdConfiguration(Landroidx/media3/common/o0;)Landroidx/media3/exoplayer/upstream/CmcdConfiguration;

    move-result-object v0

    goto :goto_1

    .line 27
    :goto_2
    new-instance v0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource;

    iget-object v3, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->manifestDataSourceFactory:Lk1/g;

    iget-object v5, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->chunkSourceFactory:Landroidx/media3/exoplayer/smoothstreaming/SsChunkSource$Factory;

    iget-object v6, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->compositeSequenceableLoaderFactory:Landroidx/media3/exoplayer/source/CompositeSequenceableLoaderFactory;

    iget-object v2, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->drmSessionManagerProvider:Landroidx/media3/exoplayer/drm/DrmSessionManagerProvider;

    .line 28
    invoke-interface {v2, p1}, Landroidx/media3/exoplayer/drm/DrmSessionManagerProvider;->get(Landroidx/media3/common/o0;)Landroidx/media3/exoplayer/drm/DrmSessionManager;

    move-result-object v8

    iget-object v9, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    iget-wide v10, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->livePresentationDelayMs:J

    const/4 v12, 0x0

    const/4 v2, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v12}, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource;-><init>(Landroidx/media3/common/o0;Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest;Lk1/g;Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;Landroidx/media3/exoplayer/smoothstreaming/SsChunkSource$Factory;Landroidx/media3/exoplayer/source/CompositeSequenceableLoaderFactory;Landroidx/media3/exoplayer/upstream/CmcdConfiguration;Landroidx/media3/exoplayer/drm/DrmSessionManager;Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;JLandroidx/media3/exoplayer/smoothstreaming/SsMediaSource$1;)V

    return-object v0
.end method

.method public createMediaSource(Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest;)Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource;
    .locals 1

    .line 2
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-static {v0}, Landroidx/media3/common/o0;->c(Landroid/net/Uri;)Landroidx/media3/common/o0;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->createMediaSource(Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest;Landroidx/media3/common/o0;)Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource;

    move-result-object p1

    return-object p1
.end method

.method public createMediaSource(Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest;Landroidx/media3/common/o0;)Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 3
    iget-boolean v2, v1, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest;->isLive:Z

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    invoke-static {v2}, Lh1/a;->d(Z)V

    move-object/from16 v2, p2

    .line 4
    iget-object v4, v2, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    if-eqz v4, :cond_0

    .line 5
    iget-object v5, v4, Landroidx/media3/common/j0;->e:Ljava/util/List;

    goto :goto_0

    .line 6
    :cond_0
    sget-object v5, Lf6/l1;->n:Lf6/l1;

    .line 7
    :goto_0
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_1

    .line 8
    invoke-virtual {v1, v5}, Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest;->copy(Ljava/util/List;)Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest;

    move-result-object v1

    :cond_1
    move-object v7, v1

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    .line 9
    :goto_1
    invoke-virtual {v2}, Landroidx/media3/common/o0;->a()Landroidx/media3/common/b0;

    move-result-object v1

    const-string v2, "application/vnd.ms-sstr+xml"

    .line 10
    iput-object v2, v1, Landroidx/media3/common/b0;->c:Ljava/lang/String;

    if-eqz v3, :cond_3

    .line 11
    iget-object v2, v4, Landroidx/media3/common/j0;->a:Landroid/net/Uri;

    goto :goto_2

    :cond_3
    sget-object v2, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 12
    :goto_2
    iput-object v2, v1, Landroidx/media3/common/b0;->b:Landroid/net/Uri;

    .line 13
    invoke-virtual {v1}, Landroidx/media3/common/b0;->a()Landroidx/media3/common/o0;

    move-result-object v6

    .line 14
    iget-object v1, v0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->cmcdConfigurationFactory:Landroidx/media3/exoplayer/upstream/CmcdConfiguration$Factory;

    if-nez v1, :cond_4

    const/4 v1, 0x0

    :goto_3
    move-object v12, v1

    goto :goto_4

    .line 15
    :cond_4
    invoke-interface {v1, v6}, Landroidx/media3/exoplayer/upstream/CmcdConfiguration$Factory;->createCmcdConfiguration(Landroidx/media3/common/o0;)Landroidx/media3/exoplayer/upstream/CmcdConfiguration;

    move-result-object v1

    goto :goto_3

    .line 16
    :goto_4
    new-instance v5, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource;

    iget-object v10, v0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->chunkSourceFactory:Landroidx/media3/exoplayer/smoothstreaming/SsChunkSource$Factory;

    iget-object v11, v0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->compositeSequenceableLoaderFactory:Landroidx/media3/exoplayer/source/CompositeSequenceableLoaderFactory;

    iget-object v1, v0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->drmSessionManagerProvider:Landroidx/media3/exoplayer/drm/DrmSessionManagerProvider;

    .line 17
    invoke-interface {v1, v6}, Landroidx/media3/exoplayer/drm/DrmSessionManagerProvider;->get(Landroidx/media3/common/o0;)Landroidx/media3/exoplayer/drm/DrmSessionManager;

    move-result-object v13

    iget-object v14, v0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    iget-wide v1, v0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->livePresentationDelayMs:J

    const/16 v17, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-wide v15, v1

    invoke-direct/range {v5 .. v17}, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource;-><init>(Landroidx/media3/common/o0;Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest;Lk1/g;Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;Landroidx/media3/exoplayer/smoothstreaming/SsChunkSource$Factory;Landroidx/media3/exoplayer/source/CompositeSequenceableLoaderFactory;Landroidx/media3/exoplayer/upstream/CmcdConfiguration;Landroidx/media3/exoplayer/drm/DrmSessionManager;Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;JLandroidx/media3/exoplayer/smoothstreaming/SsMediaSource$1;)V

    return-object v5
.end method

.method public bridge synthetic createMediaSource(Landroidx/media3/common/o0;)Landroidx/media3/exoplayer/source/MediaSource;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->createMediaSource(Landroidx/media3/common/o0;)Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource;

    move-result-object p1

    return-object p1
.end method

.method public experimentalParseSubtitlesDuringExtraction(Z)Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->chunkSourceFactory:Landroidx/media3/exoplayer/smoothstreaming/SsChunkSource$Factory;

    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/smoothstreaming/SsChunkSource$Factory;->experimentalParseSubtitlesDuringExtraction(Z)Landroidx/media3/exoplayer/smoothstreaming/SsChunkSource$Factory;

    return-object p0
.end method

.method public bridge synthetic experimentalParseSubtitlesDuringExtraction(Z)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->experimentalParseSubtitlesDuringExtraction(Z)Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;

    move-result-object p1

    return-object p1
.end method

.method public getSupportedTypes()[I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    filled-new-array {v0}, [I

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method

.method public setCmcdConfigurationFactory(Landroidx/media3/exoplayer/upstream/CmcdConfiguration$Factory;)Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;
    .locals 0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->cmcdConfigurationFactory:Landroidx/media3/exoplayer/upstream/CmcdConfiguration$Factory;

    return-object p0
.end method

.method public bridge synthetic setCmcdConfigurationFactory(Landroidx/media3/exoplayer/upstream/CmcdConfiguration$Factory;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->setCmcdConfigurationFactory(Landroidx/media3/exoplayer/upstream/CmcdConfiguration$Factory;)Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;

    move-result-object p1

    return-object p1
.end method

.method public setCompositeSequenceableLoaderFactory(Landroidx/media3/exoplayer/source/CompositeSequenceableLoaderFactory;)Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;
    .locals 1

    .line 1
    const-string v0, "SsMediaSource.Factory#setCompositeSequenceableLoaderFactory no longer handles null by instantiating a new DefaultCompositeSequenceableLoaderFactory. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 2
    .line 3
    invoke-static {v0, p1}, Lh1/a;->h(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->compositeSequenceableLoaderFactory:Landroidx/media3/exoplayer/source/CompositeSequenceableLoaderFactory;

    .line 7
    .line 8
    return-object p0
.end method

.method public setDrmSessionManagerProvider(Landroidx/media3/exoplayer/drm/DrmSessionManagerProvider;)Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;
    .locals 1

    .line 2
    const-string v0, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 3
    invoke-static {v0, p1}, Lh1/a;->h(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->drmSessionManagerProvider:Landroidx/media3/exoplayer/drm/DrmSessionManagerProvider;

    return-object p0
.end method

.method public bridge synthetic setDrmSessionManagerProvider(Landroidx/media3/exoplayer/drm/DrmSessionManagerProvider;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->setDrmSessionManagerProvider(Landroidx/media3/exoplayer/drm/DrmSessionManagerProvider;)Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;

    move-result-object p1

    return-object p1
.end method

.method public setLivePresentationDelayMs(J)Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->livePresentationDelayMs:J

    .line 2
    .line 3
    return-object p0
.end method

.method public setLoadErrorHandlingPolicy(Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;)Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;
    .locals 1

    .line 2
    const-string v0, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 3
    invoke-static {v0, p1}, Lh1/a;->h(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    return-object p0
.end method

.method public bridge synthetic setLoadErrorHandlingPolicy(Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->setLoadErrorHandlingPolicy(Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;)Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;

    move-result-object p1

    return-object p1
.end method

.method public setManifestParser(Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;)Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser<",
            "+",
            "Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest;",
            ">;)",
            "Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->manifestParser:Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;

    .line 2
    .line 3
    return-object p0
.end method

.method public setSubtitleParserFactory(Lk2/o;)Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->chunkSourceFactory:Landroidx/media3/exoplayer/smoothstreaming/SsChunkSource$Factory;

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/smoothstreaming/SsChunkSource$Factory;->setSubtitleParserFactory(Lk2/o;)Landroidx/media3/exoplayer/smoothstreaming/SsChunkSource$Factory;

    return-object p0
.end method

.method public bridge synthetic setSubtitleParserFactory(Lk2/o;)Landroidx/media3/exoplayer/source/MediaSource$Factory;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->setSubtitleParserFactory(Lk2/o;)Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;

    move-result-object p1

    return-object p1
.end method
