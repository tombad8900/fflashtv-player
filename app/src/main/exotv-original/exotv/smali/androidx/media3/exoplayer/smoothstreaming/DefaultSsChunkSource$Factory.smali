.class public final Landroidx/media3/exoplayer/smoothstreaming/DefaultSsChunkSource$Factory;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/smoothstreaming/SsChunkSource$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/smoothstreaming/DefaultSsChunkSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation


# instance fields
.field private final dataSourceFactory:Lk1/g;

.field private parseSubtitlesDuringExtraction:Z

.field private subtitleParserFactory:Lk2/o;


# direct methods
.method public constructor <init>(Lk1/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/DefaultSsChunkSource$Factory;->dataSourceFactory:Lk1/g;

    .line 5
    .line 6
    new-instance p1, Lk2/e;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/DefaultSsChunkSource$Factory;->subtitleParserFactory:Lk2/o;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public createChunkSource(Landroidx/media3/exoplayer/upstream/LoaderErrorThrower;Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest;ILandroidx/media3/exoplayer/trackselection/ExoTrackSelection;Lk1/c0;Landroidx/media3/exoplayer/upstream/CmcdConfiguration;)Landroidx/media3/exoplayer/smoothstreaming/SsChunkSource;
    .locals 11

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/smoothstreaming/DefaultSsChunkSource$Factory;->dataSourceFactory:Lk1/g;

    .line 4
    .line 5
    invoke-interface {v1}, Lk1/g;->l()Lk1/h;

    .line 6
    .line 7
    .line 8
    move-result-object v7

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v7, v0}, Lk1/h;->addTransferListener(Lk1/c0;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    new-instance v2, Landroidx/media3/exoplayer/smoothstreaming/DefaultSsChunkSource;

    .line 15
    .line 16
    iget-object v9, p0, Landroidx/media3/exoplayer/smoothstreaming/DefaultSsChunkSource$Factory;->subtitleParserFactory:Lk2/o;

    .line 17
    .line 18
    iget-boolean v10, p0, Landroidx/media3/exoplayer/smoothstreaming/DefaultSsChunkSource$Factory;->parseSubtitlesDuringExtraction:Z

    .line 19
    .line 20
    move-object v3, p1

    .line 21
    move-object v4, p2

    .line 22
    move v5, p3

    .line 23
    move-object v6, p4

    .line 24
    move-object/from16 v8, p6

    .line 25
    .line 26
    invoke-direct/range {v2 .. v10}, Landroidx/media3/exoplayer/smoothstreaming/DefaultSsChunkSource;-><init>(Landroidx/media3/exoplayer/upstream/LoaderErrorThrower;Landroidx/media3/exoplayer/smoothstreaming/manifest/SsManifest;ILandroidx/media3/exoplayer/trackselection/ExoTrackSelection;Lk1/h;Landroidx/media3/exoplayer/upstream/CmcdConfiguration;Lk2/o;Z)V

    .line 27
    .line 28
    .line 29
    return-object v2
.end method

.method public experimentalParseSubtitlesDuringExtraction(Z)Landroidx/media3/exoplayer/smoothstreaming/DefaultSsChunkSource$Factory;
    .locals 0

    .line 2
    iput-boolean p1, p0, Landroidx/media3/exoplayer/smoothstreaming/DefaultSsChunkSource$Factory;->parseSubtitlesDuringExtraction:Z

    return-object p0
.end method

.method public bridge synthetic experimentalParseSubtitlesDuringExtraction(Z)Landroidx/media3/exoplayer/smoothstreaming/SsChunkSource$Factory;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/smoothstreaming/DefaultSsChunkSource$Factory;->experimentalParseSubtitlesDuringExtraction(Z)Landroidx/media3/exoplayer/smoothstreaming/DefaultSsChunkSource$Factory;

    move-result-object p1

    return-object p1
.end method

.method public getOutputTextFormat(Landroidx/media3/common/w;)Landroidx/media3/common/w;
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/smoothstreaming/DefaultSsChunkSource$Factory;->parseSubtitlesDuringExtraction:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/smoothstreaming/DefaultSsChunkSource$Factory;->subtitleParserFactory:Lk2/o;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lk2/o;->supportsFormat(Landroidx/media3/common/w;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/media3/common/w;->a()Landroidx/media3/common/v;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p1, Landroidx/media3/common/w;->k:Ljava/lang/String;

    .line 18
    .line 19
    const-string v2, "application/x-media3-cues"

    .line 20
    .line 21
    invoke-static {v2}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iput-object v2, v0, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v2, p0, Landroidx/media3/exoplayer/smoothstreaming/DefaultSsChunkSource$Factory;->subtitleParserFactory:Lk2/o;

    .line 28
    .line 29
    invoke-interface {v2, p1}, Lk2/o;->c(Landroidx/media3/common/w;)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    iput v2, v0, Landroidx/media3/common/v;->H:I

    .line 34
    .line 35
    new-instance v2, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    iget-object p1, p1, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    const-string p1, " "

    .line 48
    .line 49
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const-string p1, ""

    .line 55
    .line 56
    :goto_0
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, v0, Landroidx/media3/common/v;->j:Ljava/lang/String;

    .line 64
    .line 65
    const-wide v1, 0x7fffffffffffffffL

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    iput-wide v1, v0, Landroidx/media3/common/v;->r:J

    .line 71
    .line 72
    new-instance p1, Landroidx/media3/common/w;

    .line 73
    .line 74
    invoke-direct {p1, v0}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    return-object p1
.end method

.method public setSubtitleParserFactory(Lk2/o;)Landroidx/media3/exoplayer/smoothstreaming/DefaultSsChunkSource$Factory;
    .locals 0

    .line 2
    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/DefaultSsChunkSource$Factory;->subtitleParserFactory:Lk2/o;

    return-object p0
.end method

.method public bridge synthetic setSubtitleParserFactory(Lk2/o;)Landroidx/media3/exoplayer/smoothstreaming/SsChunkSource$Factory;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/smoothstreaming/DefaultSsChunkSource$Factory;->setSubtitleParserFactory(Lk2/o;)Landroidx/media3/exoplayer/smoothstreaming/DefaultSsChunkSource$Factory;

    move-result-object p1

    return-object p1
.end method
