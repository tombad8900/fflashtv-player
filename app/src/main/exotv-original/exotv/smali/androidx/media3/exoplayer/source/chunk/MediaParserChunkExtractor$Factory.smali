.class public Landroidx/media3/exoplayer/source/chunk/MediaParserChunkExtractor$Factory;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/source/chunk/ChunkExtractor$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/source/chunk/MediaParserChunkExtractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Factory"
.end annotation


# instance fields
.field private parseSubtitlesDuringExtraction:Z

.field private subtitleParserFactory:Lk2/o;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lk2/e;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/media3/exoplayer/source/chunk/MediaParserChunkExtractor$Factory;->subtitleParserFactory:Lk2/o;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public createProgressiveMediaExtractor(ILandroidx/media3/common/w;ZLjava/util/List;Ln1/i0;Landroidx/media3/exoplayer/analytics/PlayerId;)Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/media3/common/w;",
            "Z",
            "Ljava/util/List<",
            "Landroidx/media3/common/w;",
            ">;",
            "Ln1/i0;",
            "Landroidx/media3/exoplayer/analytics/PlayerId;",
            ")",
            "Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;"
        }
    .end annotation

    .line 1
    iget-object p3, p2, Landroidx/media3/common/w;->m:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p3}, Landroidx/media3/common/u0;->n(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    if-nez p3, :cond_0

    .line 8
    .line 9
    new-instance p3, Landroidx/media3/exoplayer/source/chunk/MediaParserChunkExtractor;

    .line 10
    .line 11
    invoke-direct {p3, p1, p2, p4, p6}, Landroidx/media3/exoplayer/source/chunk/MediaParserChunkExtractor;-><init>(ILandroidx/media3/common/w;Ljava/util/List;Landroidx/media3/exoplayer/analytics/PlayerId;)V

    .line 12
    .line 13
    .line 14
    return-object p3

    .line 15
    :cond_0
    iget-boolean p3, p0, Landroidx/media3/exoplayer/source/chunk/MediaParserChunkExtractor$Factory;->parseSubtitlesDuringExtraction:Z

    .line 16
    .line 17
    if-nez p3, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    return-object p1

    .line 21
    :cond_1
    new-instance p3, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;

    .line 22
    .line 23
    new-instance p4, Lk2/l;

    .line 24
    .line 25
    iget-object p5, p0, Landroidx/media3/exoplayer/source/chunk/MediaParserChunkExtractor$Factory;->subtitleParserFactory:Lk2/o;

    .line 26
    .line 27
    invoke-interface {p5, p2}, Lk2/o;->g(Landroidx/media3/common/w;)Lk2/q;

    .line 28
    .line 29
    .line 30
    move-result-object p5

    .line 31
    invoke-direct {p4, p5, p2}, Lk2/l;-><init>(Lk2/q;Landroidx/media3/common/w;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p3, p4, p1, p2}, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;-><init>(Ln1/n;ILandroidx/media3/common/w;)V

    .line 35
    .line 36
    .line 37
    return-object p3
.end method

.method public bridge synthetic experimentalParseSubtitlesDuringExtraction(Z)Landroidx/media3/exoplayer/source/chunk/ChunkExtractor$Factory;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/source/chunk/MediaParserChunkExtractor$Factory;->experimentalParseSubtitlesDuringExtraction(Z)Landroidx/media3/exoplayer/source/chunk/MediaParserChunkExtractor$Factory;

    move-result-object p1

    return-object p1
.end method

.method public experimentalParseSubtitlesDuringExtraction(Z)Landroidx/media3/exoplayer/source/chunk/MediaParserChunkExtractor$Factory;
    .locals 0

    .line 2
    iput-boolean p1, p0, Landroidx/media3/exoplayer/source/chunk/MediaParserChunkExtractor$Factory;->parseSubtitlesDuringExtraction:Z

    return-object p0
.end method

.method public getOutputTextFormat(Landroidx/media3/common/w;)Landroidx/media3/common/w;
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/source/chunk/MediaParserChunkExtractor$Factory;->parseSubtitlesDuringExtraction:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/source/chunk/MediaParserChunkExtractor$Factory;->subtitleParserFactory:Lk2/o;

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
    iget-object v2, p0, Landroidx/media3/exoplayer/source/chunk/MediaParserChunkExtractor$Factory;->subtitleParserFactory:Lk2/o;

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

.method public bridge synthetic setSubtitleParserFactory(Lk2/o;)Landroidx/media3/exoplayer/source/chunk/ChunkExtractor$Factory;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/source/chunk/MediaParserChunkExtractor$Factory;->setSubtitleParserFactory(Lk2/o;)Landroidx/media3/exoplayer/source/chunk/MediaParserChunkExtractor$Factory;

    move-result-object p1

    return-object p1
.end method

.method public setSubtitleParserFactory(Lk2/o;)Landroidx/media3/exoplayer/source/chunk/MediaParserChunkExtractor$Factory;
    .locals 0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/source/chunk/MediaParserChunkExtractor$Factory;->subtitleParserFactory:Lk2/o;

    return-object p0
.end method
