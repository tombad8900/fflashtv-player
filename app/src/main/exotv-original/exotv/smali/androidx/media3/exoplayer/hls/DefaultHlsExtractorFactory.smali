.class public final Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/hls/HlsExtractorFactory;


# static fields
.field private static final DEFAULT_EXTRACTOR_ORDER:[I


# instance fields
.field private final exposeCea608WhenMissingDeclarations:Z

.field private parseSubtitlesDuringExtraction:Z

.field private final payloadReaderFactoryFlags:I

.field private subtitleParserFactory:Lk2/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->DEFAULT_EXTRACTOR_ORDER:[I

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 4
        0x8
        0xd
        0xb
        0x2
        0x0
        0x1
        0x7
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;-><init>(IZ)V

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->payloadReaderFactoryFlags:I

    .line 4
    iput-boolean p2, p0, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->exposeCea608WhenMissingDeclarations:Z

    .line 5
    new-instance p1, Lk2/e;

    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->subtitleParserFactory:Lk2/o;

    return-void
.end method

.method private static addFileTypeIfValidAndNotPresent(ILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->DEFAULT_EXTRACTOR_ORDER:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    array-length v2, v0

    .line 5
    invoke-static {v0, p0, v1, v2}, Lcom/bumptech/glide/d;->M([IIII)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    return-void
.end method

.method private createExtractorByFileType(ILandroidx/media3/common/w;Ljava/util/List;Lh1/d0;)Ln1/n;
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SwitchIntDef"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/media3/common/w;",
            "Ljava/util/List<",
            "Landroidx/media3/common/w;",
            ">;",
            "Lh1/d0;",
            ")",
            "Ln1/n;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_6

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_5

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_4

    .line 8
    .line 9
    const/4 v0, 0x7

    .line 10
    if-eq p1, v0, :cond_3

    .line 11
    .line 12
    const/16 v0, 0x8

    .line 13
    .line 14
    if-eq p1, v0, :cond_2

    .line 15
    .line 16
    const/16 v0, 0xb

    .line 17
    .line 18
    if-eq p1, v0, :cond_1

    .line 19
    .line 20
    const/16 p3, 0xd

    .line 21
    .line 22
    if-eq p1, p3, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    return-object p1

    .line 26
    :cond_0
    new-instance p1, Landroidx/media3/exoplayer/hls/WebvttExtractor;

    .line 27
    .line 28
    iget-object p2, p2, Landroidx/media3/common/w;->d:Ljava/lang/String;

    .line 29
    .line 30
    iget-object p3, p0, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->subtitleParserFactory:Lk2/o;

    .line 31
    .line 32
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->parseSubtitlesDuringExtraction:Z

    .line 33
    .line 34
    invoke-direct {p1, p2, p4, p3, v0}, Landroidx/media3/exoplayer/hls/WebvttExtractor;-><init>(Ljava/lang/String;Lh1/d0;Lk2/o;Z)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_1
    iget v1, p0, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->payloadReaderFactoryFlags:I

    .line 39
    .line 40
    iget-boolean v2, p0, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->exposeCea608WhenMissingDeclarations:Z

    .line 41
    .line 42
    iget-object v6, p0, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->subtitleParserFactory:Lk2/o;

    .line 43
    .line 44
    iget-boolean v7, p0, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->parseSubtitlesDuringExtraction:Z

    .line 45
    .line 46
    move-object v3, p2

    .line 47
    move-object v4, p3

    .line 48
    move-object v5, p4

    .line 49
    invoke-static/range {v1 .. v7}, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->createTsExtractor(IZLandroidx/media3/common/w;Ljava/util/List;Lh1/d0;Lk2/o;Z)Lt2/e0;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    :cond_2
    move-object v3, p2

    .line 55
    move-object v4, p3

    .line 56
    move-object v5, p4

    .line 57
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->subtitleParserFactory:Lk2/o;

    .line 58
    .line 59
    iget-boolean p2, p0, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->parseSubtitlesDuringExtraction:Z

    .line 60
    .line 61
    invoke-static {p1, p2, v5, v3, v4}, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->createFragmentedMp4Extractor(Lk2/o;ZLh1/d0;Landroidx/media3/common/w;Ljava/util/List;)Lh2/i;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1

    .line 66
    :cond_3
    new-instance p1, Lg2/e;

    .line 67
    .line 68
    const-wide/16 p2, 0x0

    .line 69
    .line 70
    invoke-direct {p1, p2, p3}, Lg2/e;-><init>(J)V

    .line 71
    .line 72
    .line 73
    return-object p1

    .line 74
    :cond_4
    new-instance p1, Lt2/d;

    .line 75
    .line 76
    const/4 p2, 0x0

    .line 77
    invoke-direct {p1, p2}, Lt2/d;-><init>(I)V

    .line 78
    .line 79
    .line 80
    return-object p1

    .line 81
    :cond_5
    new-instance p1, Lt2/c;

    .line 82
    .line 83
    invoke-direct {p1}, Lt2/c;-><init>()V

    .line 84
    .line 85
    .line 86
    return-object p1

    .line 87
    :cond_6
    new-instance p1, Lt2/a;

    .line 88
    .line 89
    invoke-direct {p1}, Lt2/a;-><init>()V

    .line 90
    .line 91
    .line 92
    return-object p1
.end method

.method private static createFragmentedMp4Extractor(Lk2/o;ZLh1/d0;Landroidx/media3/common/w;Ljava/util/List;)Lh2/i;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk2/o;",
            "Z",
            "Lh1/d0;",
            "Landroidx/media3/common/w;",
            "Ljava/util/List<",
            "Landroidx/media3/common/w;",
            ">;)",
            "Lh2/i;"
        }
    .end annotation

    .line 1
    invoke-static {p3}, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->isFmp4Variant(Landroidx/media3/common/w;)Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p3, 0x4

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p3, 0x0

    .line 10
    :goto_0
    if-nez p1, :cond_1

    .line 11
    .line 12
    or-int/lit8 p3, p3, 0x20

    .line 13
    .line 14
    sget-object p0, Lk2/o;->g:Lk2/b;

    .line 15
    .line 16
    :cond_1
    move-object v1, p0

    .line 17
    move v2, p3

    .line 18
    new-instance v0, Lh2/i;

    .line 19
    .line 20
    if-eqz p4, :cond_2

    .line 21
    .line 22
    :goto_1
    move-object v5, p4

    .line 23
    goto :goto_2

    .line 24
    :cond_2
    sget-object p4, Lf6/l1;->n:Lf6/l1;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :goto_2
    const/4 v6, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    move-object v3, p2

    .line 30
    invoke-direct/range {v0 .. v6}, Lh2/i;-><init>(Lk2/o;ILh1/d0;Lh2/q;Ljava/util/List;Ln1/i0;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method private static createTsExtractor(IZLandroidx/media3/common/w;Ljava/util/List;Lh1/d0;Lk2/o;Z)Lt2/e0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Landroidx/media3/common/w;",
            "Ljava/util/List<",
            "Landroidx/media3/common/w;",
            ">;",
            "Lh1/d0;",
            "Lk2/o;",
            "Z)",
            "Lt2/e0;"
        }
    .end annotation

    .line 1
    or-int/lit8 v0, p0, 0x10

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    or-int/lit8 v0, p0, 0x30

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    if-eqz p1, :cond_1

    .line 9
    .line 10
    new-instance p0, Landroidx/media3/common/v;

    .line 11
    .line 12
    invoke-direct {p0}, Landroidx/media3/common/v;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string p1, "application/cea-608"

    .line 16
    .line 17
    invoke-static {p1}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 22
    .line 23
    new-instance p1, Landroidx/media3/common/w;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    sget-object p3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 34
    .line 35
    :goto_0
    iget-object p0, p2, Landroidx/media3/common/w;->k:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_4

    .line 42
    .line 43
    const-string p1, "audio/mp4a-latm"

    .line 44
    .line 45
    invoke-static {p0, p1}, Landroidx/media3/common/u0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    or-int/lit8 v0, v0, 0x2

    .line 53
    .line 54
    :goto_1
    const-string p1, "video/avc"

    .line 55
    .line 56
    invoke-static {p0, p1}, Landroidx/media3/common/u0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-eqz p0, :cond_3

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    or-int/lit8 v0, v0, 0x4

    .line 64
    .line 65
    :cond_4
    :goto_2
    if-nez p6, :cond_5

    .line 66
    .line 67
    sget-object p5, Lk2/o;->g:Lk2/b;

    .line 68
    .line 69
    const/4 p0, 0x1

    .line 70
    :goto_3
    move v3, p0

    .line 71
    move-object v4, p5

    .line 72
    goto :goto_4

    .line 73
    :cond_5
    const/4 p0, 0x0

    .line 74
    goto :goto_3

    .line 75
    :goto_4
    new-instance v1, Lt2/e0;

    .line 76
    .line 77
    new-instance v6, Lj0/i;

    .line 78
    .line 79
    invoke-direct {v6, v0, p3}, Lj0/i;-><init>(ILjava/util/List;)V

    .line 80
    .line 81
    .line 82
    const/4 v2, 0x2

    .line 83
    move-object v5, p4

    .line 84
    invoke-direct/range {v1 .. v6}, Lt2/e0;-><init>(IILk2/o;Lh1/d0;Lj0/i;)V

    .line 85
    .line 86
    .line 87
    return-object v1
.end method

.method private static isFmp4Variant(Landroidx/media3/common/w;)Z
    .locals 4

    .line 1
    iget-object p0, p0, Landroidx/media3/common/w;->l:Landroidx/media3/common/t0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    move v1, v0

    .line 8
    :goto_0
    iget-object v2, p0, Landroidx/media3/common/t0;->j:[Landroidx/media3/common/s0;

    .line 9
    .line 10
    array-length v3, v2

    .line 11
    if-ge v1, v3, :cond_2

    .line 12
    .line 13
    aget-object v2, v2, v1

    .line 14
    .line 15
    instance-of v3, v2, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;

    .line 16
    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    check-cast v2, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;

    .line 20
    .line 21
    iget-object p0, v2, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->variantInfos:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    xor-int/lit8 p0, p0, 0x1

    .line 28
    .line 29
    return p0

    .line 30
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    return v0
.end method

.method private static sniffQuietly(Ln1/n;Ln1/o;)Z
    .locals 0

    .line 1
    :try_start_0
    invoke-interface {p0, p1}, Ln1/n;->sniff(Ln1/o;)Z

    .line 2
    .line 3
    .line 4
    move-result p0
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    invoke-interface {p1}, Ln1/o;->g()V

    .line 6
    .line 7
    .line 8
    return p0

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    invoke-interface {p1}, Ln1/o;->g()V

    .line 11
    .line 12
    .line 13
    throw p0

    .line 14
    :catch_0
    invoke-interface {p1}, Ln1/o;->g()V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return p0
.end method


# virtual methods
.method public createExtractor(Landroid/net/Uri;Landroidx/media3/common/w;Ljava/util/List;Lh1/d0;Ljava/util/Map;Ln1/o;Landroidx/media3/exoplayer/analytics/PlayerId;)Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroidx/media3/common/w;",
            "Ljava/util/List<",
            "Landroidx/media3/common/w;",
            ">;",
            "Lh1/d0;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Ln1/o;",
            "Landroidx/media3/exoplayer/analytics/PlayerId;",
            ")",
            "Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;"
        }
    .end annotation

    move-object v2, p2

    .line 2
    iget-object v0, v2, Landroidx/media3/common/w;->n:Ljava/lang/String;

    invoke-static {v0}, Lcom/bumptech/glide/d;->N(Ljava/lang/String;)I

    move-result v0

    .line 3
    const-string v1, "Content-Type"

    move-object/from16 v3, p5

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    .line 4
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_1

    :cond_1
    :goto_0
    move-object v1, v3

    .line 5
    :goto_1
    invoke-static {v1}, Lcom/bumptech/glide/d;->N(Ljava/lang/String;)I

    move-result v1

    .line 6
    invoke-static {p1}, Lcom/bumptech/glide/d;->O(Landroid/net/Uri;)I

    move-result v5

    .line 7
    new-instance v6, Ljava/util/ArrayList;

    sget-object v7, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->DEFAULT_EXTRACTOR_ORDER:[I

    array-length v8, v7

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    invoke-static {v0, v6}, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->addFileTypeIfValidAndNotPresent(ILjava/util/List;)V

    .line 9
    invoke-static {v1, v6}, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->addFileTypeIfValidAndNotPresent(ILjava/util/List;)V

    .line 10
    invoke-static {v5, v6}, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->addFileTypeIfValidAndNotPresent(ILjava/util/List;)V

    .line 11
    array-length v8, v7

    move v9, v4

    :goto_2
    if-ge v9, v8, :cond_2

    aget v10, v7, v9

    .line 12
    invoke-static {v10, v6}, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->addFileTypeIfValidAndNotPresent(ILjava/util/List;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 13
    :cond_2
    invoke-interface/range {p6 .. p6}, Ln1/o;->g()V

    .line 14
    :goto_3
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v4, v7, :cond_6

    .line 15
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    move-object/from16 v8, p3

    move v10, v1

    move-object v9, v3

    move-object/from16 v3, p4

    .line 16
    invoke-direct {p0, v7, p2, v8, v3}, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->createExtractorByFileType(ILandroidx/media3/common/w;Ljava/util/List;Lh1/d0;)Ln1/n;

    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v11, p6

    .line 18
    invoke-static {v1, v11}, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->sniffQuietly(Ln1/n;Ln1/o;)Z

    move-result v12

    if-eqz v12, :cond_3

    .line 19
    new-instance v0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;

    iget-object v4, p0, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->subtitleParserFactory:Lk2/o;

    iget-boolean v5, p0, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->parseSubtitlesDuringExtraction:Z

    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;-><init>(Ln1/n;Landroidx/media3/common/w;Lh1/d0;Lk2/o;Z)V

    return-object v0

    :cond_3
    if-nez v9, :cond_5

    if-eq v7, v0, :cond_4

    if-eq v7, v10, :cond_4

    if-eq v7, v5, :cond_4

    const/16 v2, 0xb

    if-ne v7, v2, :cond_5

    :cond_4
    move-object v3, v1

    goto :goto_4

    :cond_5
    move-object v3, v9

    :goto_4
    add-int/lit8 v4, v4, 0x1

    move-object v2, p2

    move v1, v10

    goto :goto_3

    :cond_6
    move-object v9, v3

    .line 20
    new-instance v0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;

    .line 21
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->subtitleParserFactory:Lk2/o;

    iget-boolean v5, p0, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->parseSubtitlesDuringExtraction:Z

    move-object v2, p2

    move-object/from16 v3, p4

    move-object v1, v9

    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;-><init>(Ln1/n;Landroidx/media3/common/w;Lh1/d0;Lk2/o;Z)V

    return-object v0
.end method

.method public bridge synthetic createExtractor(Landroid/net/Uri;Landroidx/media3/common/w;Ljava/util/List;Lh1/d0;Ljava/util/Map;Ln1/o;Landroidx/media3/exoplayer/analytics/PlayerId;)Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p7}, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->createExtractor(Landroid/net/Uri;Landroidx/media3/common/w;Ljava/util/List;Lh1/d0;Ljava/util/Map;Ln1/o;Landroidx/media3/exoplayer/analytics/PlayerId;)Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;

    move-result-object p1

    return-object p1
.end method

.method public experimentalParseSubtitlesDuringExtraction(Z)Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;
    .locals 0

    .line 2
    iput-boolean p1, p0, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->parseSubtitlesDuringExtraction:Z

    return-object p0
.end method

.method public bridge synthetic experimentalParseSubtitlesDuringExtraction(Z)Landroidx/media3/exoplayer/hls/HlsExtractorFactory;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->experimentalParseSubtitlesDuringExtraction(Z)Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;

    move-result-object p1

    return-object p1
.end method

.method public getOutputTextFormat(Landroidx/media3/common/w;)Landroidx/media3/common/w;
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->parseSubtitlesDuringExtraction:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->subtitleParserFactory:Lk2/o;

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
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->subtitleParserFactory:Lk2/o;

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

.method public setSubtitleParserFactory(Lk2/o;)Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;
    .locals 0

    .line 2
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->subtitleParserFactory:Lk2/o;

    return-object p0
.end method

.method public bridge synthetic setSubtitleParserFactory(Lk2/o;)Landroidx/media3/exoplayer/hls/HlsExtractorFactory;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;->setSubtitleParserFactory(Lk2/o;)Landroidx/media3/exoplayer/hls/DefaultHlsExtractorFactory;

    move-result-object p1

    return-object p1
.end method
