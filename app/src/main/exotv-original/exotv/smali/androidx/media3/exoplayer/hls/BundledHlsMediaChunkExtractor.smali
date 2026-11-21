.class public final Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;


# static fields
.field private static final POSITION_HOLDER:Ln1/a0;


# instance fields
.field final extractor:Ln1/n;

.field private final multivariantPlaylistFormat:Landroidx/media3/common/w;

.field private final parseSubtitlesDuringExtraction:Z

.field private final subtitleParserFactory:Lk2/o;

.field private final timestampAdjuster:Lh1/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ln1/a0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->POSITION_HOLDER:Ln1/a0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ln1/n;Landroidx/media3/common/w;Lh1/d0;)V
    .locals 6

    .line 1
    sget-object v4, Lk2/o;->g:Lk2/b;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;-><init>(Ln1/n;Landroidx/media3/common/w;Lh1/d0;Lk2/o;Z)V

    return-void
.end method

.method public constructor <init>(Ln1/n;Landroidx/media3/common/w;Lh1/d0;Lk2/o;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->extractor:Ln1/n;

    .line 4
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->multivariantPlaylistFormat:Landroidx/media3/common/w;

    .line 5
    iput-object p3, p0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->timestampAdjuster:Lh1/d0;

    .line 6
    iput-object p4, p0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->subtitleParserFactory:Lk2/o;

    .line 7
    iput-boolean p5, p0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->parseSubtitlesDuringExtraction:Z

    return-void
.end method


# virtual methods
.method public init(Ln1/p;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->extractor:Ln1/n;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ln1/n;->init(Ln1/p;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public isPackedAudioExtractor()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->extractor:Ln1/n;

    .line 2
    .line 3
    invoke-interface {v0}, Ln1/n;->getUnderlyingImplementation()Ln1/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Lt2/d;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    instance-of v1, v0, Lt2/a;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    instance-of v1, v0, Lt2/c;

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    instance-of v0, v0, Lg2/e;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return v0

    .line 26
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 27
    return v0
.end method

.method public isReusable()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->extractor:Ln1/n;

    .line 2
    .line 3
    invoke-interface {v0}, Ln1/n;->getUnderlyingImplementation()Ln1/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Lt2/e0;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    instance-of v0, v0, Lh2/i;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 19
    return v0
.end method

.method public onTruncatedSegmentParsed()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->extractor:Ln1/n;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-interface {v0, v1, v2, v1, v2}, Ln1/n;->seek(JJ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public read(Ln1/o;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->extractor:Ln1/n;

    .line 2
    .line 3
    sget-object v1, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->POSITION_HOLDER:Ln1/a0;

    .line 4
    .line 5
    invoke-interface {v0, p1, v1}, Ln1/n;->read(Ln1/o;Ln1/a0;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method public recreate()Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->isReusable()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    xor-int/2addr v0, v1

    .line 7
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->extractor:Ln1/n;

    .line 11
    .line 12
    invoke-interface {v0}, Ln1/n;->getUnderlyingImplementation()Ln1/n;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->extractor:Ln1/n;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-ne v0, v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v1, v3

    .line 23
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v2, "Can\'t recreate wrapped extractors. Outer type: "

    .line 26
    .line 27
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->extractor:Ln1/n;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0, v1}, Lh1/a;->i(Ljava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->extractor:Ln1/n;

    .line 47
    .line 48
    instance-of v1, v0, Landroidx/media3/exoplayer/hls/WebvttExtractor;

    .line 49
    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    new-instance v0, Landroidx/media3/exoplayer/hls/WebvttExtractor;

    .line 53
    .line 54
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->multivariantPlaylistFormat:Landroidx/media3/common/w;

    .line 55
    .line 56
    iget-object v1, v1, Landroidx/media3/common/w;->d:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->timestampAdjuster:Lh1/d0;

    .line 59
    .line 60
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->subtitleParserFactory:Lk2/o;

    .line 61
    .line 62
    iget-boolean v4, p0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->parseSubtitlesDuringExtraction:Z

    .line 63
    .line 64
    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/media3/exoplayer/hls/WebvttExtractor;-><init>(Ljava/lang/String;Lh1/d0;Lk2/o;Z)V

    .line 65
    .line 66
    .line 67
    :goto_1
    move-object v5, v0

    .line 68
    goto :goto_2

    .line 69
    :cond_1
    instance-of v1, v0, Lt2/d;

    .line 70
    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    new-instance v0, Lt2/d;

    .line 74
    .line 75
    invoke-direct {v0, v3}, Lt2/d;-><init>(I)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    instance-of v1, v0, Lt2/a;

    .line 80
    .line 81
    if-eqz v1, :cond_3

    .line 82
    .line 83
    new-instance v0, Lt2/a;

    .line 84
    .line 85
    invoke-direct {v0}, Lt2/a;-><init>()V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    instance-of v1, v0, Lt2/c;

    .line 90
    .line 91
    if-eqz v1, :cond_4

    .line 92
    .line 93
    new-instance v0, Lt2/c;

    .line 94
    .line 95
    invoke-direct {v0}, Lt2/c;-><init>()V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    instance-of v0, v0, Lg2/e;

    .line 100
    .line 101
    if-eqz v0, :cond_5

    .line 102
    .line 103
    new-instance v0, Lg2/e;

    .line 104
    .line 105
    invoke-direct {v0, v3}, Lg2/e;-><init>(I)V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :goto_2
    new-instance v4, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;

    .line 110
    .line 111
    iget-object v6, p0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->multivariantPlaylistFormat:Landroidx/media3/common/w;

    .line 112
    .line 113
    iget-object v7, p0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->timestampAdjuster:Lh1/d0;

    .line 114
    .line 115
    iget-object v8, p0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->subtitleParserFactory:Lk2/o;

    .line 116
    .line 117
    iget-boolean v9, p0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->parseSubtitlesDuringExtraction:Z

    .line 118
    .line 119
    invoke-direct/range {v4 .. v9}, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;-><init>(Ln1/n;Landroidx/media3/common/w;Lh1/d0;Lk2/o;Z)V

    .line 120
    .line 121
    .line 122
    return-object v4

    .line 123
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 124
    .line 125
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/BundledHlsMediaChunkExtractor;->extractor:Ln1/n;

    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    const-string v2, "Unexpected extractor type for recreation: "

    .line 136
    .line 137
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v0
.end method
