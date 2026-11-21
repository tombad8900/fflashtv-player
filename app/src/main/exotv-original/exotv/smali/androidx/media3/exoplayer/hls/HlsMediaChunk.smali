.class final Landroidx/media3/exoplayer/hls/HlsMediaChunk;
.super Landroidx/media3/exoplayer/source/chunk/MediaChunk;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final PRIV_TIMESTAMP_FRAME_OWNER:Ljava/lang/String; = "com.apple.streaming.transportStreamTimestamp"

.field private static final uidSource:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public final discontinuitySequenceNumber:I

.field private final drmInitData:Landroidx/media3/common/s;

.field private extractor:Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;

.field private final extractorFactory:Landroidx/media3/exoplayer/hls/HlsExtractorFactory;

.field private extractorInvalidated:Z

.field private final hasGapTag:Z

.field private final id3Decoder:Lb2/i;

.field private initDataLoadRequired:Z

.field private final initDataSource:Lk1/h;

.field private final initDataSpec:Lk1/l;

.field private final initSegmentEncrypted:Z

.field private final isPrimaryTimestampSource:Z

.field private isPublished:Z

.field private volatile loadCanceled:Z

.field private loadCompleted:Z

.field private final mediaSegmentEncrypted:Z

.field private final muxedCaptionFormats:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/media3/common/w;",
            ">;"
        }
    .end annotation
.end field

.field private nextLoadPosition:I

.field private output:Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

.field public final partIndex:I

.field private final playerId:Landroidx/media3/exoplayer/analytics/PlayerId;

.field public final playlistUrl:Landroid/net/Uri;

.field private final previousExtractor:Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;

.field private sampleQueueFirstSampleIndices:Lf6/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/m0;"
        }
    .end annotation
.end field

.field private final scratchId3Data:Lh1/w;

.field public final shouldSpliceIn:Z

.field private final timestampAdjuster:Lh1/d0;

.field private final timestampAdjusterInitializationTimeoutMs:J

.field public final uid:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->uidSource:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>(Landroidx/media3/exoplayer/hls/HlsExtractorFactory;Lk1/h;Lk1/l;Landroidx/media3/common/w;ZLk1/h;Lk1/l;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLh1/d0;JLandroidx/media3/common/s;Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;Lb2/i;Lh1/w;ZLandroidx/media3/exoplayer/analytics/PlayerId;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/hls/HlsExtractorFactory;",
            "Lk1/h;",
            "Lk1/l;",
            "Landroidx/media3/common/w;",
            "Z",
            "Lk1/h;",
            "Lk1/l;",
            "Z",
            "Landroid/net/Uri;",
            "Ljava/util/List<",
            "Landroidx/media3/common/w;",
            ">;I",
            "Ljava/lang/Object;",
            "JJJIZIZZ",
            "Lh1/d0;",
            "J",
            "Landroidx/media3/common/s;",
            "Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;",
            "Lb2/i;",
            "Lh1/w;",
            "Z",
            "Landroidx/media3/exoplayer/analytics/PlayerId;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p7

    move-object v1, p0

    move-object v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p11

    move-object/from16 v6, p12

    move-wide/from16 v7, p13

    move-wide/from16 v9, p15

    move-wide/from16 v11, p17

    .line 1
    invoke-direct/range {v1 .. v12}, Landroidx/media3/exoplayer/source/chunk/MediaChunk;-><init>(Lk1/h;Lk1/l;Landroidx/media3/common/w;ILjava/lang/Object;JJJ)V

    move/from16 p2, p5

    .line 2
    iput-boolean p2, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->mediaSegmentEncrypted:Z

    move/from16 p2, p19

    .line 3
    iput p2, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->partIndex:I

    move/from16 p2, p20

    .line 4
    iput-boolean p2, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->isPublished:Z

    move/from16 p2, p21

    .line 5
    iput p2, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->discontinuitySequenceNumber:I

    .line 6
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->initDataSpec:Lk1/l;

    move-object/from16 p2, p6

    .line 7
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->initDataSource:Lk1/h;

    if-eqz v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 8
    :goto_0
    iput-boolean p2, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->initDataLoadRequired:Z

    move/from16 p2, p8

    .line 9
    iput-boolean p2, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->initSegmentEncrypted:Z

    move-object/from16 p2, p9

    .line 10
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->playlistUrl:Landroid/net/Uri;

    move/from16 p2, p23

    .line 11
    iput-boolean p2, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->isPrimaryTimestampSource:Z

    move-object/from16 p2, p24

    .line 12
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->timestampAdjuster:Lh1/d0;

    move-wide/from16 v2, p25

    .line 13
    iput-wide v2, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->timestampAdjusterInitializationTimeoutMs:J

    move/from16 p2, p22

    .line 14
    iput-boolean p2, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->hasGapTag:Z

    .line 15
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->extractorFactory:Landroidx/media3/exoplayer/hls/HlsExtractorFactory;

    move-object/from16 p1, p10

    .line 16
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->muxedCaptionFormats:Ljava/util/List;

    move-object/from16 p1, p27

    .line 17
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->drmInitData:Landroidx/media3/common/s;

    move-object/from16 p1, p28

    .line 18
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->previousExtractor:Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;

    move-object/from16 p1, p29

    .line 19
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->id3Decoder:Lb2/i;

    move-object/from16 p1, p30

    .line 20
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->scratchId3Data:Lh1/w;

    move/from16 p1, p31

    .line 21
    iput-boolean p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->shouldSpliceIn:Z

    move-object/from16 p1, p32

    .line 22
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->playerId:Landroidx/media3/exoplayer/analytics/PlayerId;

    .line 23
    sget-object p1, Lf6/m0;->k:Lf6/k0;

    .line 24
    sget-object p1, Lf6/l1;->n:Lf6/l1;

    .line 25
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->sampleQueueFirstSampleIndices:Lf6/m0;

    .line 26
    sget-object p1, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->uidSource:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    iput p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->uid:I

    return-void
.end method

.method private static buildDataSource(Lk1/h;[B[B)Lk1/h;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/media3/exoplayer/hls/Aes128DataSource;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1, p2}, Landroidx/media3/exoplayer/hls/Aes128DataSource;-><init>(Lk1/h;[B[B)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    return-object p0
.end method

.method public static createInstance(Landroidx/media3/exoplayer/hls/HlsExtractorFactory;Lk1/h;Landroidx/media3/common/w;JLandroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;Landroidx/media3/exoplayer/hls/HlsChunkSource$SegmentBaseHolder;Landroid/net/Uri;Ljava/util/List;ILjava/lang/Object;ZLandroidx/media3/exoplayer/hls/TimestampAdjusterProvider;JLandroidx/media3/exoplayer/hls/HlsMediaChunk;[B[BZLandroidx/media3/exoplayer/analytics/PlayerId;Landroidx/media3/exoplayer/upstream/CmcdData$Factory;)Landroidx/media3/exoplayer/hls/HlsMediaChunk;
    .locals 55
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/hls/HlsExtractorFactory;",
            "Lk1/h;",
            "Landroidx/media3/common/w;",
            "J",
            "Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;",
            "Landroidx/media3/exoplayer/hls/HlsChunkSource$SegmentBaseHolder;",
            "Landroid/net/Uri;",
            "Ljava/util/List<",
            "Landroidx/media3/common/w;",
            ">;I",
            "Ljava/lang/Object;",
            "Z",
            "Landroidx/media3/exoplayer/hls/TimestampAdjusterProvider;",
            "J",
            "Landroidx/media3/exoplayer/hls/HlsMediaChunk;",
            "[B[BZ",
            "Landroidx/media3/exoplayer/analytics/PlayerId;",
            "Landroidx/media3/exoplayer/upstream/CmcdData$Factory;",
            ")",
            "Landroidx/media3/exoplayer/hls/HlsMediaChunk;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    move-object/from16 v2, p6

    .line 6
    .line 7
    move-object/from16 v3, p15

    .line 8
    .line 9
    move-object/from16 v4, p16

    .line 10
    .line 11
    move-object/from16 v5, p17

    .line 12
    .line 13
    move-object/from16 v6, p20

    .line 14
    .line 15
    iget-object v7, v2, Landroidx/media3/exoplayer/hls/HlsChunkSource$SegmentBaseHolder;->segmentBase:Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;

    .line 16
    .line 17
    sget-object v12, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 18
    .line 19
    iget-object v8, v1, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylist;->baseUri:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v9, v7, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->url:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v8, v9}, Lh1/a;->C(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object v9

    .line 27
    iget-wide v13, v7, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->byteRangeOffset:J

    .line 28
    .line 29
    iget-wide v10, v7, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->byteRangeLength:J

    .line 30
    .line 31
    iget-boolean v8, v2, Landroidx/media3/exoplayer/hls/HlsChunkSource$SegmentBaseHolder;->isPreload:Z

    .line 32
    .line 33
    const/16 v19, 0x0

    .line 34
    .line 35
    if-eqz v8, :cond_0

    .line 36
    .line 37
    const/16 v8, 0x8

    .line 38
    .line 39
    move/from16 v18, v8

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move/from16 v18, v19

    .line 43
    .line 44
    :goto_0
    const-string v8, "The uri must be set."

    .line 45
    .line 46
    invoke-static {v8, v9}, Lh1/a;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object v15, v8

    .line 50
    new-instance v8, Lk1/l;

    .line 51
    .line 52
    move-wide/from16 v53, v10

    .line 53
    .line 54
    move-object v11, v15

    .line 55
    move-wide/from16 v15, v53

    .line 56
    .line 57
    const/4 v10, 0x1

    .line 58
    move-object/from16 v17, v11

    .line 59
    .line 60
    const/4 v11, 0x0

    .line 61
    move-object/from16 v20, v17

    .line 62
    .line 63
    const/16 v17, 0x0

    .line 64
    .line 65
    move-object/from16 v2, v20

    .line 66
    .line 67
    invoke-direct/range {v8 .. v18}, Lk1/l;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 68
    .line 69
    .line 70
    if-eqz v6, :cond_1

    .line 71
    .line 72
    iget-wide v9, v7, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->durationUs:J

    .line 73
    .line 74
    invoke-virtual {v6, v9, v10}, Landroidx/media3/exoplayer/upstream/CmcdData$Factory;->setChunkDurationUs(J)Landroidx/media3/exoplayer/upstream/CmcdData$Factory;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    invoke-virtual {v9}, Landroidx/media3/exoplayer/upstream/CmcdData$Factory;->createCmcdData()Landroidx/media3/exoplayer/upstream/CmcdData;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-virtual {v9, v8}, Landroidx/media3/exoplayer/upstream/CmcdData;->addToDataSpec(Lk1/l;)Lk1/l;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    :cond_1
    move-object/from16 v23, v8

    .line 87
    .line 88
    const/16 v20, 0x1

    .line 89
    .line 90
    if-eqz v4, :cond_2

    .line 91
    .line 92
    move/from16 v25, v20

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    move/from16 v25, v19

    .line 96
    .line 97
    :goto_1
    if-eqz v25, :cond_3

    .line 98
    .line 99
    iget-object v9, v7, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->encryptionIV:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-static {v9}, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->getEncryptionIvArray(Ljava/lang/String;)[B

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    goto :goto_2

    .line 109
    :cond_3
    const/4 v9, 0x0

    .line 110
    :goto_2
    invoke-static {v0, v4, v9}, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->buildDataSource(Lk1/h;[B[B)Lk1/h;

    .line 111
    .line 112
    .line 113
    move-result-object v22

    .line 114
    iget-object v4, v7, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->initializationSegment:Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Segment;

    .line 115
    .line 116
    if-eqz v4, :cond_7

    .line 117
    .line 118
    if-eqz v5, :cond_4

    .line 119
    .line 120
    move/from16 v21, v20

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_4
    move/from16 v21, v19

    .line 124
    .line 125
    :goto_3
    if-eqz v21, :cond_5

    .line 126
    .line 127
    iget-object v9, v4, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->encryptionIV:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-static {v9}, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->getEncryptionIvArray(Ljava/lang/String;)[B

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    goto :goto_4

    .line 137
    :cond_5
    const/4 v9, 0x0

    .line 138
    :goto_4
    iget-object v10, v1, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylist;->baseUri:Ljava/lang/String;

    .line 139
    .line 140
    iget-object v11, v4, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->url:Ljava/lang/String;

    .line 141
    .line 142
    invoke-static {v10, v11}, Lh1/a;->C(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 143
    .line 144
    .line 145
    move-result-object v10

    .line 146
    iget-wide v13, v4, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->byteRangeOffset:J

    .line 147
    .line 148
    move-object/from16 p16, v9

    .line 149
    .line 150
    iget-wide v8, v4, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->byteRangeLength:J

    .line 151
    .line 152
    invoke-static {v2, v10}, Lh1/a;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    move-wide v15, v8

    .line 156
    new-instance v8, Lk1/l;

    .line 157
    .line 158
    move-object v9, v10

    .line 159
    const/4 v10, 0x1

    .line 160
    const/4 v2, 0x0

    .line 161
    const/4 v11, 0x0

    .line 162
    const/16 v17, 0x0

    .line 163
    .line 164
    const/16 v18, 0x0

    .line 165
    .line 166
    move-object/from16 v4, p16

    .line 167
    .line 168
    invoke-direct/range {v8 .. v18}, Lk1/l;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 169
    .line 170
    .line 171
    if-eqz v6, :cond_6

    .line 172
    .line 173
    const-string v9, "i"

    .line 174
    .line 175
    invoke-virtual {v6, v9}, Landroidx/media3/exoplayer/upstream/CmcdData$Factory;->setObjectType(Ljava/lang/String;)Landroidx/media3/exoplayer/upstream/CmcdData$Factory;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    invoke-virtual {v6}, Landroidx/media3/exoplayer/upstream/CmcdData$Factory;->createCmcdData()Landroidx/media3/exoplayer/upstream/CmcdData;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    invoke-virtual {v6, v8}, Landroidx/media3/exoplayer/upstream/CmcdData;->addToDataSpec(Lk1/l;)Lk1/l;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    move-object v8, v6

    .line 188
    :cond_6
    invoke-static {v0, v5, v4}, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->buildDataSource(Lk1/h;[B[B)Lk1/h;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    move-object/from16 v26, v0

    .line 193
    .line 194
    move/from16 v28, v21

    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_7
    const/4 v2, 0x0

    .line 198
    move-object v8, v2

    .line 199
    move-object/from16 v26, v8

    .line 200
    .line 201
    move/from16 v28, v19

    .line 202
    .line 203
    :goto_5
    iget-wide v4, v7, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->relativeStartTimeUs:J

    .line 204
    .line 205
    add-long v33, p3, v4

    .line 206
    .line 207
    iget-wide v4, v7, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->durationUs:J

    .line 208
    .line 209
    add-long v35, v33, v4

    .line 210
    .line 211
    iget v0, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;->discontinuitySequence:I

    .line 212
    .line 213
    iget v1, v7, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->relativeDiscontinuitySequence:I

    .line 214
    .line 215
    add-int/2addr v0, v1

    .line 216
    if-eqz v3, :cond_c

    .line 217
    .line 218
    iget-object v1, v3, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->initDataSpec:Lk1/l;

    .line 219
    .line 220
    if-eq v8, v1, :cond_9

    .line 221
    .line 222
    if-eqz v8, :cond_8

    .line 223
    .line 224
    if-eqz v1, :cond_8

    .line 225
    .line 226
    iget-object v4, v8, Lk1/l;->a:Landroid/net/Uri;

    .line 227
    .line 228
    iget-object v1, v1, Lk1/l;->a:Landroid/net/Uri;

    .line 229
    .line 230
    invoke-virtual {v4, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    if-eqz v1, :cond_8

    .line 235
    .line 236
    iget-wide v4, v8, Lk1/l;->e:J

    .line 237
    .line 238
    iget-object v1, v3, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->initDataSpec:Lk1/l;

    .line 239
    .line 240
    iget-wide v9, v1, Lk1/l;->e:J

    .line 241
    .line 242
    cmp-long v1, v4, v9

    .line 243
    .line 244
    if-nez v1, :cond_8

    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_8
    move/from16 v1, v19

    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_9
    :goto_6
    move/from16 v1, v20

    .line 251
    .line 252
    :goto_7
    iget-object v4, v3, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->playlistUrl:Landroid/net/Uri;

    .line 253
    .line 254
    move-object/from16 v5, p7

    .line 255
    .line 256
    invoke-virtual {v5, v4}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v4

    .line 260
    if-eqz v4, :cond_a

    .line 261
    .line 262
    iget-boolean v4, v3, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->loadCompleted:Z

    .line 263
    .line 264
    if-eqz v4, :cond_a

    .line 265
    .line 266
    move/from16 v19, v20

    .line 267
    .line 268
    :cond_a
    iget-object v4, v3, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->id3Decoder:Lb2/i;

    .line 269
    .line 270
    iget-object v6, v3, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->scratchId3Data:Lh1/w;

    .line 271
    .line 272
    if-eqz v1, :cond_b

    .line 273
    .line 274
    if-eqz v19, :cond_b

    .line 275
    .line 276
    iget-boolean v1, v3, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->extractorInvalidated:Z

    .line 277
    .line 278
    if-nez v1, :cond_b

    .line 279
    .line 280
    iget v1, v3, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->discontinuitySequenceNumber:I

    .line 281
    .line 282
    if-ne v1, v0, :cond_b

    .line 283
    .line 284
    iget-object v1, v3, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->extractor:Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;

    .line 285
    .line 286
    goto :goto_8

    .line 287
    :cond_b
    move-object v1, v2

    .line 288
    :goto_8
    move-object/from16 v48, v1

    .line 289
    .line 290
    :goto_9
    move-object/from16 v49, v4

    .line 291
    .line 292
    move-object/from16 v50, v6

    .line 293
    .line 294
    move/from16 v1, v20

    .line 295
    .line 296
    goto :goto_a

    .line 297
    :cond_c
    move-object/from16 v5, p7

    .line 298
    .line 299
    new-instance v4, Lb2/i;

    .line 300
    .line 301
    invoke-direct {v4, v2}, Lb2/i;-><init>(Lb2/g;)V

    .line 302
    .line 303
    .line 304
    new-instance v6, Lh1/w;

    .line 305
    .line 306
    const/16 v1, 0xa

    .line 307
    .line 308
    invoke-direct {v6, v1}, Lh1/w;-><init>(I)V

    .line 309
    .line 310
    .line 311
    move-object/from16 v48, v2

    .line 312
    .line 313
    goto :goto_9

    .line 314
    :goto_a
    new-instance v20, Landroidx/media3/exoplayer/hls/HlsMediaChunk;

    .line 315
    .line 316
    move-object/from16 v2, p6

    .line 317
    .line 318
    iget-wide v3, v2, Landroidx/media3/exoplayer/hls/HlsChunkSource$SegmentBaseHolder;->mediaSequence:J

    .line 319
    .line 320
    iget v6, v2, Landroidx/media3/exoplayer/hls/HlsChunkSource$SegmentBaseHolder;->partIndex:I

    .line 321
    .line 322
    iget-boolean v2, v2, Landroidx/media3/exoplayer/hls/HlsChunkSource$SegmentBaseHolder;->isPreload:Z

    .line 323
    .line 324
    xor-int/lit8 v40, v2, 0x1

    .line 325
    .line 326
    iget-boolean v1, v7, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->hasGapTag:Z

    .line 327
    .line 328
    move-object/from16 v2, p12

    .line 329
    .line 330
    invoke-virtual {v2, v0}, Landroidx/media3/exoplayer/hls/TimestampAdjusterProvider;->getAdjuster(I)Lh1/d0;

    .line 331
    .line 332
    .line 333
    move-result-object v44

    .line 334
    iget-object v2, v7, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->drmInitData:Landroidx/media3/common/s;

    .line 335
    .line 336
    move-object/from16 v21, p0

    .line 337
    .line 338
    move-object/from16 v24, p2

    .line 339
    .line 340
    move-object/from16 v30, p8

    .line 341
    .line 342
    move/from16 v31, p9

    .line 343
    .line 344
    move-object/from16 v32, p10

    .line 345
    .line 346
    move/from16 v43, p11

    .line 347
    .line 348
    move-wide/from16 v45, p13

    .line 349
    .line 350
    move/from16 v51, p18

    .line 351
    .line 352
    move-object/from16 v52, p19

    .line 353
    .line 354
    move/from16 v41, v0

    .line 355
    .line 356
    move/from16 v42, v1

    .line 357
    .line 358
    move-object/from16 v47, v2

    .line 359
    .line 360
    move-wide/from16 v37, v3

    .line 361
    .line 362
    move-object/from16 v29, v5

    .line 363
    .line 364
    move/from16 v39, v6

    .line 365
    .line 366
    move-object/from16 v27, v8

    .line 367
    .line 368
    invoke-direct/range {v20 .. v52}, Landroidx/media3/exoplayer/hls/HlsMediaChunk;-><init>(Landroidx/media3/exoplayer/hls/HlsExtractorFactory;Lk1/h;Lk1/l;Landroidx/media3/common/w;ZLk1/h;Lk1/l;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLh1/d0;JLandroidx/media3/common/s;Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;Lb2/i;Lh1/w;ZLandroidx/media3/exoplayer/analytics/PlayerId;)V

    .line 369
    .line 370
    .line 371
    return-object v20
.end method

.method private feedDataToExtractor(Lk1/h;Lk1/l;ZZ)V
    .locals 3
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "output"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_1

    .line 3
    .line 4
    iget p3, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->nextLoadPosition:I

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    :cond_0
    move-object p3, p2

    .line 10
    goto :goto_0

    .line 11
    :cond_1
    iget p3, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->nextLoadPosition:I

    .line 12
    .line 13
    int-to-long v1, p3

    .line 14
    invoke-virtual {p2, v1, v2}, Lk1/l;->b(J)Lk1/l;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    :goto_0
    :try_start_0
    invoke-direct {p0, p1, p3, p4}, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->prepareExtraction(Lk1/h;Lk1/l;Z)Ln1/k;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget p4, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->nextLoadPosition:I

    .line 25
    .line 26
    invoke-virtual {p3, p4}, Ln1/k;->h(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception p2

    .line 31
    goto :goto_6

    .line 32
    :cond_2
    :goto_1
    :try_start_1
    iget-boolean p4, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->loadCanceled:Z

    .line 33
    .line 34
    if-nez p4, :cond_3

    .line 35
    .line 36
    iget-object p4, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->extractor:Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;

    .line 37
    .line 38
    invoke-interface {p4, p3}, Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;->read(Ln1/o;)Z

    .line 39
    .line 40
    .line 41
    move-result p4
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 42
    if-eqz p4, :cond_3

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catchall_1
    move-exception p4

    .line 46
    goto :goto_5

    .line 47
    :catch_0
    move-exception p4

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    :try_start_2
    iget-wide p3, p3, Ln1/k;->m:J

    .line 50
    .line 51
    :goto_2
    iget-wide v0, p2, Lk1/l;->e:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 52
    .line 53
    goto :goto_4

    .line 54
    :goto_3
    :try_start_3
    iget-object v0, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->trackFormat:Landroidx/media3/common/w;

    .line 55
    .line 56
    iget v0, v0, Landroidx/media3/common/w;->f:I

    .line 57
    .line 58
    and-int/lit16 v0, v0, 0x4000

    .line 59
    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    iget-object p4, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->extractor:Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;

    .line 63
    .line 64
    invoke-interface {p4}, Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;->onTruncatedSegmentParsed()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 65
    .line 66
    .line 67
    :try_start_4
    iget-wide p3, p3, Ln1/k;->m:J

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :goto_4
    sub-long/2addr p3, v0

    .line 71
    long-to-int p2, p3

    .line 72
    iput p2, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->nextLoadPosition:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 73
    .line 74
    invoke-static {p1}, Lcom/bumptech/glide/d;->p(Lk1/h;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_4
    :try_start_5
    throw p4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 79
    :goto_5
    :try_start_6
    iget-wide v0, p3, Ln1/k;->m:J

    .line 80
    .line 81
    iget-wide p2, p2, Lk1/l;->e:J

    .line 82
    .line 83
    sub-long/2addr v0, p2

    .line 84
    long-to-int p2, v0

    .line 85
    iput p2, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->nextLoadPosition:I

    .line 86
    .line 87
    throw p4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 88
    :goto_6
    invoke-static {p1}, Lcom/bumptech/glide/d;->p(Lk1/h;)V

    .line 89
    .line 90
    .line 91
    throw p2
.end method

.method private static getEncryptionIvArray(Ljava/lang/String;)[B
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/bumptech/glide/c;->e0(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "0x"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    new-instance v0, Ljava/math/BigInteger;

    .line 19
    .line 20
    const/16 v1, 0x10

    .line 21
    .line 22
    invoke-direct {v0, p0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-array v0, v1, [B

    .line 30
    .line 31
    array-length v2, p0

    .line 32
    if-le v2, v1, :cond_1

    .line 33
    .line 34
    array-length v2, p0

    .line 35
    sub-int/2addr v2, v1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v2, 0x0

    .line 38
    :goto_0
    array-length v3, p0

    .line 39
    sub-int/2addr v1, v3

    .line 40
    add-int/2addr v1, v2

    .line 41
    array-length v3, p0

    .line 42
    sub-int/2addr v3, v2

    .line 43
    invoke-static {p0, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    return-object v0
.end method

.method private static isIndependent(Landroidx/media3/exoplayer/hls/HlsChunkSource$SegmentBaseHolder;Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsChunkSource$SegmentBaseHolder;->segmentBase:Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;

    .line 2
    .line 3
    instance-of v1, v0, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Part;

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    check-cast v0, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Part;

    .line 8
    .line 9
    iget-boolean v0, v0, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$Part;->isIndependent:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget p0, p0, Landroidx/media3/exoplayer/hls/HlsChunkSource$SegmentBaseHolder;->partIndex:I

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    iget-boolean p0, p1, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylist;->hasIndependentSegments:Z

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 25
    return p0

    .line 26
    :cond_2
    iget-boolean p0, p1, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylist;->hasIndependentSegments:Z

    .line 27
    .line 28
    return p0
.end method

.method private loadMedia()V
    .locals 4
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "output"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->dataSource:Lk1/b0;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->dataSpec:Lk1/l;

    .line 4
    .line 5
    iget-boolean v2, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->mediaSegmentEncrypted:Z

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-direct {p0, v0, v1, v2, v3}, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->feedDataToExtractor(Lk1/h;Lk1/l;ZZ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private maybeLoadInitData()V
    .locals 4
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "output"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->initDataLoadRequired:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->initDataSource:Lk1/h;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->initDataSpec:Lk1/l;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->initDataSource:Lk1/h;

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->initDataSpec:Lk1/l;

    .line 19
    .line 20
    iget-boolean v2, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->initSegmentEncrypted:Z

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {p0, v0, v1, v2, v3}, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->feedDataToExtractor(Lk1/h;Lk1/l;ZZ)V

    .line 24
    .line 25
    .line 26
    iput v3, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->nextLoadPosition:I

    .line 27
    .line 28
    iput-boolean v3, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->initDataLoadRequired:Z

    .line 29
    .line 30
    return-void
.end method

.method private peekId3PrivTimestamp(Ln1/o;)J
    .locals 7

    .line 1
    invoke-interface {p1}, Ln1/o;->g()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->scratchId3Data:Lh1/w;

    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lh1/w;->D(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->scratchId3Data:Lh1/w;

    .line 12
    .line 13
    iget-object v0, v0, Lh1/w;->a:[B

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-interface {p1, v0, v2, v1}, Ln1/o;->i([BII)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->scratchId3Data:Lh1/w;

    .line 20
    .line 21
    invoke-virtual {v0}, Lh1/w;->x()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const v3, 0x494433

    .line 26
    .line 27
    .line 28
    if-eq v0, v3, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->scratchId3Data:Lh1/w;

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    invoke-virtual {v0, v3}, Lh1/w;->H(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->scratchId3Data:Lh1/w;

    .line 38
    .line 39
    invoke-virtual {v0}, Lh1/w;->t()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    add-int/lit8 v3, v0, 0xa

    .line 44
    .line 45
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->scratchId3Data:Lh1/w;

    .line 46
    .line 47
    iget-object v5, v4, Lh1/w;->a:[B

    .line 48
    .line 49
    array-length v6, v5

    .line 50
    if-le v3, v6, :cond_1

    .line 51
    .line 52
    invoke-virtual {v4, v3}, Lh1/w;->D(I)V

    .line 53
    .line 54
    .line 55
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->scratchId3Data:Lh1/w;

    .line 56
    .line 57
    iget-object v3, v3, Lh1/w;->a:[B

    .line 58
    .line 59
    invoke-static {v5, v2, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 60
    .line 61
    .line 62
    :cond_1
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->scratchId3Data:Lh1/w;

    .line 63
    .line 64
    iget-object v3, v3, Lh1/w;->a:[B

    .line 65
    .line 66
    invoke-interface {p1, v3, v1, v0}, Ln1/o;->i([BII)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->id3Decoder:Lb2/i;

    .line 70
    .line 71
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->scratchId3Data:Lh1/w;

    .line 72
    .line 73
    iget-object v1, v1, Lh1/w;->a:[B

    .line 74
    .line 75
    invoke-virtual {p1, v1, v0}, Lb2/i;->v([BI)Landroidx/media3/common/t0;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-nez p1, :cond_2

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    iget-object p1, p1, Landroidx/media3/common/t0;->j:[Landroidx/media3/common/s0;

    .line 83
    .line 84
    array-length v0, p1

    .line 85
    move v1, v2

    .line 86
    :goto_0
    if-ge v1, v0, :cond_4

    .line 87
    .line 88
    aget-object v3, p1, v1

    .line 89
    .line 90
    instance-of v4, v3, Lb2/n;

    .line 91
    .line 92
    if-eqz v4, :cond_3

    .line 93
    .line 94
    check-cast v3, Lb2/n;

    .line 95
    .line 96
    const-string v4, "com.apple.streaming.transportStreamTimestamp"

    .line 97
    .line 98
    iget-object v5, v3, Lb2/n;->k:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-eqz v4, :cond_3

    .line 105
    .line 106
    iget-object p1, v3, Lb2/n;->l:[B

    .line 107
    .line 108
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->scratchId3Data:Lh1/w;

    .line 109
    .line 110
    iget-object v0, v0, Lh1/w;->a:[B

    .line 111
    .line 112
    const/16 v1, 0x8

    .line 113
    .line 114
    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 115
    .line 116
    .line 117
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->scratchId3Data:Lh1/w;

    .line 118
    .line 119
    invoke-virtual {p1, v2}, Lh1/w;->G(I)V

    .line 120
    .line 121
    .line 122
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->scratchId3Data:Lh1/w;

    .line 123
    .line 124
    invoke-virtual {p1, v1}, Lh1/w;->F(I)V

    .line 125
    .line 126
    .line 127
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->scratchId3Data:Lh1/w;

    .line 128
    .line 129
    invoke-virtual {p1}, Lh1/w;->o()J

    .line 130
    .line 131
    .line 132
    move-result-wide v0

    .line 133
    const-wide v2, 0x1ffffffffL

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    and-long/2addr v0, v2

    .line 139
    return-wide v0

    .line 140
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :catch_0
    :cond_4
    :goto_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    return-wide v0
.end method

.method private prepareExtraction(Lk1/h;Lk1/l;Z)Ln1/k;
    .locals 12
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "extractor"
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "output"
        }
    .end annotation

    .line 1
    invoke-interface {p1, p2}, Lk1/h;->open(Lk1/l;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v4

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    :try_start_0
    iget-object v6, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->timestampAdjuster:Lh1/d0;

    .line 8
    .line 9
    iget-boolean v7, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->isPrimaryTimestampSource:Z

    .line 10
    .line 11
    iget-wide v8, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->startTimeUs:J

    .line 12
    .line 13
    iget-wide v10, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->timestampAdjusterInitializationTimeoutMs:J

    .line 14
    .line 15
    invoke-virtual/range {v6 .. v11}, Lh1/d0;->g(ZJJ)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catch_0
    move-exception v0

    .line 20
    move-object p1, v0

    .line 21
    new-instance p2, Ljava/io/IOException;

    .line 22
    .line 23
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    throw p2

    .line 27
    :catch_1
    new-instance p1, Ljava/io/InterruptedIOException;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_0
    :goto_0
    new-instance v0, Ln1/k;

    .line 34
    .line 35
    iget-wide v2, p2, Lk1/l;->e:J

    .line 36
    .line 37
    move-object v1, p1

    .line 38
    invoke-direct/range {v0 .. v5}, Ln1/k;-><init>(Landroidx/media3/common/m;JJ)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->extractor:Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;

    .line 42
    .line 43
    if-nez p1, :cond_4

    .line 44
    .line 45
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->peekId3PrivTimestamp(Ln1/o;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v8

    .line 49
    const/4 p1, 0x0

    .line 50
    iput p1, v0, Ln1/k;->o:I

    .line 51
    .line 52
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->previousExtractor:Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;

    .line 53
    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    invoke-interface {p1}, Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;->recreate()Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move-object v6, v0

    .line 62
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->extractorFactory:Landroidx/media3/exoplayer/hls/HlsExtractorFactory;

    .line 63
    .line 64
    iget-object p1, p2, Lk1/l;->a:Landroid/net/Uri;

    .line 65
    .line 66
    iget-object v2, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->trackFormat:Landroidx/media3/common/w;

    .line 67
    .line 68
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->muxedCaptionFormats:Ljava/util/List;

    .line 69
    .line 70
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->timestampAdjuster:Lh1/d0;

    .line 71
    .line 72
    invoke-interface {v1}, Lk1/h;->getResponseHeaders()Ljava/util/Map;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    iget-object v7, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->playerId:Landroidx/media3/exoplayer/analytics/PlayerId;

    .line 77
    .line 78
    move-object v1, p1

    .line 79
    invoke-interface/range {v0 .. v7}, Landroidx/media3/exoplayer/hls/HlsExtractorFactory;->createExtractor(Landroid/net/Uri;Landroidx/media3/common/w;Ljava/util/List;Lh1/d0;Ljava/util/Map;Ln1/o;Landroidx/media3/exoplayer/analytics/PlayerId;)Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    move-object v0, v6

    .line 84
    :goto_1
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->extractor:Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;

    .line 85
    .line 86
    invoke-interface {p1}, Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;->isPackedAudioExtractor()Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->output:Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 93
    .line 94
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    cmp-long p2, v8, p2

    .line 100
    .line 101
    if-eqz p2, :cond_2

    .line 102
    .line 103
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->timestampAdjuster:Lh1/d0;

    .line 104
    .line 105
    invoke-virtual {p2, v8, v9}, Lh1/d0;->b(J)J

    .line 106
    .line 107
    .line 108
    move-result-wide p2

    .line 109
    goto :goto_2

    .line 110
    :cond_2
    iget-wide p2, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->startTimeUs:J

    .line 111
    .line 112
    :goto_2
    invoke-virtual {p1, p2, p3}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->setSampleOffsetUs(J)V

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_3
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->output:Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 117
    .line 118
    const-wide/16 p2, 0x0

    .line 119
    .line 120
    invoke-virtual {p1, p2, p3}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->setSampleOffsetUs(J)V

    .line 121
    .line 122
    .line 123
    :goto_3
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->output:Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 124
    .line 125
    invoke-virtual {p1}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->onNewExtractor()V

    .line 126
    .line 127
    .line 128
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->extractor:Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;

    .line 129
    .line 130
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->output:Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 131
    .line 132
    invoke-interface {p1, p2}, Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;->init(Ln1/p;)V

    .line 133
    .line 134
    .line 135
    :cond_4
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->output:Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 136
    .line 137
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->drmInitData:Landroidx/media3/common/s;

    .line 138
    .line 139
    invoke-virtual {p1, p2}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->setDrmInitData(Landroidx/media3/common/s;)V

    .line 140
    .line 141
    .line 142
    return-object v0
.end method

.method public static shouldSpliceIn(Landroidx/media3/exoplayer/hls/HlsMediaChunk;Landroid/net/Uri;Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;Landroidx/media3/exoplayer/hls/HlsChunkSource$SegmentBaseHolder;J)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->playlistUrl:Landroid/net/Uri;

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    iget-boolean p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->loadCompleted:Z

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    return v0

    .line 18
    :cond_1
    iget-object p1, p3, Landroidx/media3/exoplayer/hls/HlsChunkSource$SegmentBaseHolder;->segmentBase:Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;

    .line 19
    .line 20
    iget-wide v1, p1, Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist$SegmentBase;->relativeStartTimeUs:J

    .line 21
    .line 22
    add-long/2addr p4, v1

    .line 23
    invoke-static {p3, p2}, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->isIndependent(Landroidx/media3/exoplayer/hls/HlsChunkSource$SegmentBaseHolder;Landroidx/media3/exoplayer/hls/playlist/HlsMediaPlaylist;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_3

    .line 28
    .line 29
    iget-wide p0, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->endTimeUs:J

    .line 30
    .line 31
    cmp-long p0, p4, p0

    .line 32
    .line 33
    if-gez p0, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    return v0

    .line 37
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 38
    return p0
.end method


# virtual methods
.method public cancelLoad()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->loadCanceled:Z

    .line 3
    .line 4
    return-void
.end method

.method public getFirstSampleIndex(I)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->shouldSpliceIn:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->sampleQueueFirstSampleIndices:Lf6/m0;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-lt p1, v0, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->sampleQueueFirstSampleIndices:Lf6/m0;

    .line 19
    .line 20
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1
.end method

.method public init(Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;Lf6/m0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;",
            "Lf6/m0;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->output:Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->sampleQueueFirstSampleIndices:Lf6/m0;

    .line 4
    .line 5
    return-void
.end method

.method public invalidateExtractor()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->extractorInvalidated:Z

    .line 3
    .line 4
    return-void
.end method

.method public isLoadCompleted()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->loadCompleted:Z

    .line 2
    .line 3
    return v0
.end method

.method public isPublished()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->isPublished:Z

    .line 2
    .line 3
    return v0
.end method

.method public load()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->output:Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->extractor:Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->previousExtractor:Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;->isReusable()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->previousExtractor:Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;

    .line 21
    .line 22
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->extractor:Landroidx/media3/exoplayer/hls/HlsMediaChunkExtractor;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->initDataLoadRequired:Z

    .line 26
    .line 27
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->maybeLoadInitData()V

    .line 28
    .line 29
    .line 30
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->loadCanceled:Z

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->hasGapTag:Z

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->loadMedia()V

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->loadCanceled:Z

    .line 42
    .line 43
    xor-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->loadCompleted:Z

    .line 46
    .line 47
    :cond_2
    return-void
.end method

.method public publish()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->isPublished:Z

    .line 3
    .line 4
    return-void
.end method
