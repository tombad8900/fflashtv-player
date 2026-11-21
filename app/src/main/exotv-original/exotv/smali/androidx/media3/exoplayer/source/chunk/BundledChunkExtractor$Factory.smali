.class public final Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/source/chunk/ChunkExtractor$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation


# instance fields
.field private parseSubtitlesDuringExtraction:Z

.field private parseWithinGopSampleDependencies:Z

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
    iput-object v0, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;->subtitleParserFactory:Lk2/o;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public createProgressiveMediaExtractor(ILandroidx/media3/common/w;ZLjava/util/List;Ln1/i0;Landroidx/media3/exoplayer/analytics/PlayerId;)Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;
    .locals 7
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
    iget-object p6, p2, Landroidx/media3/common/w;->m:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p6}, Landroidx/media3/common/u0;->n(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-boolean p3, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;->parseSubtitlesDuringExtraction:Z

    .line 10
    .line 11
    if-nez p3, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    return-object p1

    .line 15
    :cond_0
    new-instance p3, Lk2/l;

    .line 16
    .line 17
    iget-object p4, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;->subtitleParserFactory:Lk2/o;

    .line 18
    .line 19
    invoke-interface {p4, p2}, Lk2/o;->g(Landroidx/media3/common/w;)Lk2/q;

    .line 20
    .line 21
    .line 22
    move-result-object p4

    .line 23
    invoke-direct {p3, p4, p2}, Lk2/l;-><init>(Lk2/q;Landroidx/media3/common/w;)V

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-static {p6}, Landroidx/media3/common/u0;->m(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v1, 0x1

    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-boolean p3, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;->parseSubtitlesDuringExtraction:Z

    .line 35
    .line 36
    if-nez p3, :cond_2

    .line 37
    .line 38
    const/4 v1, 0x3

    .line 39
    :cond_2
    new-instance p3, Lf2/d;

    .line 40
    .line 41
    iget-object p4, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;->subtitleParserFactory:Lk2/o;

    .line 42
    .line 43
    invoke-direct {p3, v1, p4}, Lf2/d;-><init>(ILk2/o;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    const-string v0, "image/jpeg"

    .line 48
    .line 49
    invoke-static {p6, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    new-instance p3, Lj2/a;

    .line 56
    .line 57
    invoke-direct {p3, v1}, Lj2/a;-><init>(I)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    const-string v0, "image/png"

    .line 62
    .line 63
    invoke-static {p6, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p6

    .line 67
    if-eqz p6, :cond_5

    .line 68
    .line 69
    new-instance p3, Lj2/a;

    .line 70
    .line 71
    const/4 p4, 0x0

    .line 72
    const/4 p5, 0x0

    .line 73
    invoke-direct {p3, p5, p4}, Lj2/a;-><init>(BI)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_5
    if-eqz p3, :cond_6

    .line 78
    .line 79
    const/4 p3, 0x4

    .line 80
    goto :goto_0

    .line 81
    :cond_6
    const/4 p3, 0x0

    .line 82
    :goto_0
    iget-boolean p6, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;->parseSubtitlesDuringExtraction:Z

    .line 83
    .line 84
    if-nez p6, :cond_7

    .line 85
    .line 86
    or-int/lit8 p3, p3, 0x20

    .line 87
    .line 88
    :cond_7
    iget-boolean p6, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;->parseWithinGopSampleDependencies:Z

    .line 89
    .line 90
    if-eqz p6, :cond_8

    .line 91
    .line 92
    or-int/lit8 p3, p3, 0x40

    .line 93
    .line 94
    :cond_8
    move v2, p3

    .line 95
    new-instance v0, Lh2/i;

    .line 96
    .line 97
    iget-object v1, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;->subtitleParserFactory:Lk2/o;

    .line 98
    .line 99
    const/4 v3, 0x0

    .line 100
    const/4 v4, 0x0

    .line 101
    move-object v5, p4

    .line 102
    move-object v6, p5

    .line 103
    invoke-direct/range {v0 .. v6}, Lh2/i;-><init>(Lk2/o;ILh1/d0;Lh2/q;Ljava/util/List;Ln1/i0;)V

    .line 104
    .line 105
    .line 106
    move-object p3, v0

    .line 107
    :goto_1
    new-instance p4, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;

    .line 108
    .line 109
    invoke-direct {p4, p3, p1, p2}, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;-><init>(Ln1/n;ILandroidx/media3/common/w;)V

    .line 110
    .line 111
    .line 112
    return-object p4
.end method

.method public experimentalParseSubtitlesDuringExtraction(Z)Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;
    .locals 0

    .line 2
    iput-boolean p1, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;->parseSubtitlesDuringExtraction:Z

    return-object p0
.end method

.method public bridge synthetic experimentalParseSubtitlesDuringExtraction(Z)Landroidx/media3/exoplayer/source/chunk/ChunkExtractor$Factory;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;->experimentalParseSubtitlesDuringExtraction(Z)Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;

    move-result-object p1

    return-object p1
.end method

.method public experimentalParseWithinGopSampleDependencies(Z)Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;->parseWithinGopSampleDependencies:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public getOutputTextFormat(Landroidx/media3/common/w;)Landroidx/media3/common/w;
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;->parseSubtitlesDuringExtraction:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;->subtitleParserFactory:Lk2/o;

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
    iget-object v2, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;->subtitleParserFactory:Lk2/o;

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

.method public setSubtitleParserFactory(Lk2/o;)Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;
    .locals 0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;->subtitleParserFactory:Lk2/o;

    return-object p0
.end method

.method public bridge synthetic setSubtitleParserFactory(Lk2/o;)Landroidx/media3/exoplayer/source/chunk/ChunkExtractor$Factory;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;->setSubtitleParserFactory(Lk2/o;)Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;

    move-result-object p1

    return-object p1
.end method
