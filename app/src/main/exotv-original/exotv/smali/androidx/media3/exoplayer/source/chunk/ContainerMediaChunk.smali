.class public Landroidx/media3/exoplayer/source/chunk/ContainerMediaChunk;
.super Landroidx/media3/exoplayer/source/chunk/BaseMediaChunk;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field private final chunkCount:I

.field private final chunkExtractor:Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;

.field private volatile loadCanceled:Z

.field private loadCompleted:Z

.field private nextLoadPosition:J

.field private final sampleOffsetUs:J


# direct methods
.method public constructor <init>(Lk1/h;Lk1/l;Landroidx/media3/common/w;ILjava/lang/Object;JJJJJIJLandroidx/media3/exoplayer/source/chunk/ChunkExtractor;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p15}, Landroidx/media3/exoplayer/source/chunk/BaseMediaChunk;-><init>(Lk1/h;Lk1/l;Landroidx/media3/common/w;ILjava/lang/Object;JJJJJ)V

    .line 2
    .line 3
    .line 4
    move/from16 p1, p16

    .line 5
    .line 6
    iput p1, p0, Landroidx/media3/exoplayer/source/chunk/ContainerMediaChunk;->chunkCount:I

    .line 7
    .line 8
    move-wide/from16 p1, p17

    .line 9
    .line 10
    iput-wide p1, p0, Landroidx/media3/exoplayer/source/chunk/ContainerMediaChunk;->sampleOffsetUs:J

    .line 11
    .line 12
    move-object/from16 p1, p19

    .line 13
    .line 14
    iput-object p1, p0, Landroidx/media3/exoplayer/source/chunk/ContainerMediaChunk;->chunkExtractor:Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;

    .line 15
    .line 16
    return-void
.end method

.method private maybeWriteEmptySamples(Landroidx/media3/exoplayer/source/chunk/BaseMediaChunkOutput;)V
    .locals 12

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->trackFormat:Landroidx/media3/common/w;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/media3/common/w;->m:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/common/u0;->l(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->trackFormat:Landroidx/media3/common/w;

    .line 13
    .line 14
    iget v1, v0, Landroidx/media3/common/w;->J:I

    .line 15
    .line 16
    iget v0, v0, Landroidx/media3/common/w;->K:I

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    if-gt v1, v2, :cond_1

    .line 20
    .line 21
    if-le v0, v2, :cond_3

    .line 22
    .line 23
    :cond_1
    const/4 v3, -0x1

    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    if-ne v0, v3, :cond_2

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_2
    const/4 v0, 0x4

    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-virtual {p1, v1, v0}, Landroidx/media3/exoplayer/source/chunk/BaseMediaChunkOutput;->track(II)Ln1/i0;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget-object p1, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->trackFormat:Landroidx/media3/common/w;

    .line 36
    .line 37
    iget v0, p1, Landroidx/media3/common/w;->J:I

    .line 38
    .line 39
    iget p1, p1, Landroidx/media3/common/w;->K:I

    .line 40
    .line 41
    mul-int/2addr v0, p1

    .line 42
    iget-wide v4, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->endTimeUs:J

    .line 43
    .line 44
    iget-wide v6, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->startTimeUs:J

    .line 45
    .line 46
    sub-long/2addr v4, v6

    .line 47
    int-to-long v6, v0

    .line 48
    div-long v10, v4, v6

    .line 49
    .line 50
    :goto_0
    if-ge v2, v0, :cond_3

    .line 51
    .line 52
    int-to-long v4, v2

    .line 53
    mul-long/2addr v4, v10

    .line 54
    new-instance p1, Lh1/w;

    .line 55
    .line 56
    invoke-direct {p1}, Lh1/w;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-interface {v3, p1, v1}, Ln1/i0;->sampleData(Lh1/w;I)V

    .line 60
    .line 61
    .line 62
    const/4 v8, 0x0

    .line 63
    const/4 v9, 0x0

    .line 64
    const/4 v6, 0x0

    .line 65
    const/4 v7, 0x0

    .line 66
    invoke-interface/range {v3 .. v9}, Ln1/i0;->sampleMetadata(JIIILn1/h0;)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public final cancelLoad()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/source/chunk/ContainerMediaChunk;->loadCanceled:Z

    .line 3
    .line 4
    return-void
.end method

.method public getNextChunkIndex()J
    .locals 4

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/source/chunk/MediaChunk;->chunkIndex:J

    .line 2
    .line 3
    iget v2, p0, Landroidx/media3/exoplayer/source/chunk/ContainerMediaChunk;->chunkCount:I

    .line 4
    .line 5
    int-to-long v2, v2

    .line 6
    add-long/2addr v0, v2

    .line 7
    return-wide v0
.end method

.method public getTrackOutputProvider(Landroidx/media3/exoplayer/source/chunk/BaseMediaChunkOutput;)Landroidx/media3/exoplayer/source/chunk/ChunkExtractor$TrackOutputProvider;
    .locals 0

    .line 1
    return-object p1
.end method

.method public isLoadCompleted()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/source/chunk/ContainerMediaChunk;->loadCompleted:Z

    .line 2
    .line 3
    return v0
.end method

.method public final load()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/source/chunk/BaseMediaChunk;->getOutput()Landroidx/media3/exoplayer/source/chunk/BaseMediaChunkOutput;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-wide v1, p0, Landroidx/media3/exoplayer/source/chunk/ContainerMediaChunk;->nextLoadPosition:J

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    cmp-long v1, v1, v3

    .line 10
    .line 11
    if-nez v1, :cond_2

    .line 12
    .line 13
    iget-wide v1, p0, Landroidx/media3/exoplayer/source/chunk/ContainerMediaChunk;->sampleOffsetUs:J

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Landroidx/media3/exoplayer/source/chunk/BaseMediaChunkOutput;->setSampleOffsetUs(J)V

    .line 16
    .line 17
    .line 18
    iget-object v3, p0, Landroidx/media3/exoplayer/source/chunk/ContainerMediaChunk;->chunkExtractor:Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroidx/media3/exoplayer/source/chunk/ContainerMediaChunk;->getTrackOutputProvider(Landroidx/media3/exoplayer/source/chunk/BaseMediaChunkOutput;)Landroidx/media3/exoplayer/source/chunk/ChunkExtractor$TrackOutputProvider;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    iget-wide v1, p0, Landroidx/media3/exoplayer/source/chunk/BaseMediaChunk;->clippedStartTimeUs:J

    .line 25
    .line 26
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    cmp-long v7, v1, v5

    .line 32
    .line 33
    if-nez v7, :cond_0

    .line 34
    .line 35
    move-wide v1, v5

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-wide v7, p0, Landroidx/media3/exoplayer/source/chunk/ContainerMediaChunk;->sampleOffsetUs:J

    .line 38
    .line 39
    sub-long/2addr v1, v7

    .line 40
    :goto_0
    iget-wide v7, p0, Landroidx/media3/exoplayer/source/chunk/BaseMediaChunk;->clippedEndTimeUs:J

    .line 41
    .line 42
    cmp-long v9, v7, v5

    .line 43
    .line 44
    if-nez v9, :cond_1

    .line 45
    .line 46
    :goto_1
    move-wide v7, v5

    .line 47
    move-wide v5, v1

    .line 48
    goto :goto_2

    .line 49
    :cond_1
    iget-wide v5, p0, Landroidx/media3/exoplayer/source/chunk/ContainerMediaChunk;->sampleOffsetUs:J

    .line 50
    .line 51
    sub-long v5, v7, v5

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :goto_2
    invoke-interface/range {v3 .. v8}, Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;->init(Landroidx/media3/exoplayer/source/chunk/ChunkExtractor$TrackOutputProvider;JJ)V

    .line 55
    .line 56
    .line 57
    :cond_2
    :try_start_0
    iget-object v1, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->dataSpec:Lk1/l;

    .line 58
    .line 59
    iget-wide v2, p0, Landroidx/media3/exoplayer/source/chunk/ContainerMediaChunk;->nextLoadPosition:J

    .line 60
    .line 61
    invoke-virtual {v1, v2, v3}, Lk1/l;->b(J)Lk1/l;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    new-instance v2, Ln1/k;

    .line 66
    .line 67
    iget-object v3, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->dataSource:Lk1/b0;

    .line 68
    .line 69
    iget-wide v4, v1, Lk1/l;->e:J

    .line 70
    .line 71
    invoke-virtual {v3, v1}, Lk1/b0;->open(Lk1/l;)J

    .line 72
    .line 73
    .line 74
    move-result-wide v6

    .line 75
    invoke-direct/range {v2 .. v7}, Ln1/k;-><init>(Landroidx/media3/common/m;JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 76
    .line 77
    .line 78
    :goto_3
    :try_start_1
    iget-boolean v1, p0, Landroidx/media3/exoplayer/source/chunk/ContainerMediaChunk;->loadCanceled:Z

    .line 79
    .line 80
    if-nez v1, :cond_3

    .line 81
    .line 82
    iget-object v1, p0, Landroidx/media3/exoplayer/source/chunk/ContainerMediaChunk;->chunkExtractor:Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;

    .line 83
    .line 84
    invoke-interface {v1, v2}, Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;->read(Ln1/o;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_3

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :catchall_0
    move-exception v0

    .line 92
    goto :goto_4

    .line 93
    :cond_3
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/source/chunk/ContainerMediaChunk;->maybeWriteEmptySamples(Landroidx/media3/exoplayer/source/chunk/BaseMediaChunkOutput;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    .line 95
    .line 96
    :try_start_2
    iget-wide v0, v2, Ln1/k;->m:J

    .line 97
    .line 98
    iget-object v2, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->dataSpec:Lk1/l;

    .line 99
    .line 100
    iget-wide v2, v2, Lk1/l;->e:J

    .line 101
    .line 102
    sub-long/2addr v0, v2

    .line 103
    iput-wide v0, p0, Landroidx/media3/exoplayer/source/chunk/ContainerMediaChunk;->nextLoadPosition:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 104
    .line 105
    iget-object v0, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->dataSource:Lk1/b0;

    .line 106
    .line 107
    invoke-static {v0}, Lcom/bumptech/glide/d;->p(Lk1/h;)V

    .line 108
    .line 109
    .line 110
    iget-boolean v0, p0, Landroidx/media3/exoplayer/source/chunk/ContainerMediaChunk;->loadCanceled:Z

    .line 111
    .line 112
    xor-int/lit8 v0, v0, 0x1

    .line 113
    .line 114
    iput-boolean v0, p0, Landroidx/media3/exoplayer/source/chunk/ContainerMediaChunk;->loadCompleted:Z

    .line 115
    .line 116
    return-void

    .line 117
    :catchall_1
    move-exception v0

    .line 118
    goto :goto_5

    .line 119
    :goto_4
    :try_start_3
    iget-wide v1, v2, Ln1/k;->m:J

    .line 120
    .line 121
    iget-object v3, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->dataSpec:Lk1/l;

    .line 122
    .line 123
    iget-wide v3, v3, Lk1/l;->e:J

    .line 124
    .line 125
    sub-long/2addr v1, v3

    .line 126
    iput-wide v1, p0, Landroidx/media3/exoplayer/source/chunk/ContainerMediaChunk;->nextLoadPosition:J

    .line 127
    .line 128
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 129
    :goto_5
    iget-object v1, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->dataSource:Lk1/b0;

    .line 130
    .line 131
    invoke-static {v1}, Lcom/bumptech/glide/d;->p(Lk1/h;)V

    .line 132
    .line 133
    .line 134
    throw v0
.end method
