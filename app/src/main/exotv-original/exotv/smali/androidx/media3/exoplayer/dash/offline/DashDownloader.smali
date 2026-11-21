.class public final Landroidx/media3/exoplayer/dash/offline/DashDownloader;
.super Landroidx/media3/exoplayer/offline/SegmentDownloader;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/media3/exoplayer/offline/SegmentDownloader<",
        "Landroidx/media3/exoplayer/dash/manifest/DashManifest;",
        ">;"
    }
.end annotation


# instance fields
.field private final baseUrlExclusionList:Landroidx/media3/exoplayer/dash/BaseUrlExclusionList;


# direct methods
.method public constructor <init>(Landroidx/media3/common/o0;Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;Ll1/b;Ljava/util/concurrent/Executor;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/o0;",
            "Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser<",
            "Landroidx/media3/exoplayer/dash/manifest/DashManifest;",
            ">;",
            "Ll1/b;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-wide/16 v5, 0x4e20

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 3
    invoke-direct/range {v0 .. v6}, Landroidx/media3/exoplayer/dash/offline/DashDownloader;-><init>(Landroidx/media3/common/o0;Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;Ll1/b;Ljava/util/concurrent/Executor;J)V

    return-void
.end method

.method public constructor <init>(Landroidx/media3/common/o0;Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;Ll1/b;Ljava/util/concurrent/Executor;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/o0;",
            "Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser<",
            "Landroidx/media3/exoplayer/dash/manifest/DashManifest;",
            ">;",
            "Ll1/b;",
            "Ljava/util/concurrent/Executor;",
            "J)V"
        }
    .end annotation

    .line 4
    invoke-direct/range {p0 .. p6}, Landroidx/media3/exoplayer/offline/SegmentDownloader;-><init>(Landroidx/media3/common/o0;Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;Ll1/b;Ljava/util/concurrent/Executor;J)V

    move-object p1, p0

    .line 5
    new-instance p2, Landroidx/media3/exoplayer/dash/BaseUrlExclusionList;

    invoke-direct {p2}, Landroidx/media3/exoplayer/dash/BaseUrlExclusionList;-><init>()V

    iput-object p2, p1, Landroidx/media3/exoplayer/dash/offline/DashDownloader;->baseUrlExclusionList:Landroidx/media3/exoplayer/dash/BaseUrlExclusionList;

    return-void
.end method

.method public constructor <init>(Landroidx/media3/common/o0;Ll1/b;)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/dash/offline/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Landroidx/media3/exoplayer/dash/offline/DashDownloader;-><init>(Landroidx/media3/common/o0;Ll1/b;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public constructor <init>(Landroidx/media3/common/o0;Ll1/b;Ljava/util/concurrent/Executor;)V
    .locals 7

    .line 2
    new-instance v2, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;

    invoke-direct {v2}, Landroidx/media3/exoplayer/dash/manifest/DashManifestParser;-><init>()V

    const-wide/16 v5, 0x4e20

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v6}, Landroidx/media3/exoplayer/dash/offline/DashDownloader;-><init>(Landroidx/media3/common/o0;Landroidx/media3/exoplayer/upstream/ParsingLoadable$Parser;Ll1/b;Ljava/util/concurrent/Executor;J)V

    return-void
.end method

.method private addSegmentsForAdaptationSet(Lk1/h;Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;JJZLjava/util/ArrayList;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk1/h;",
            "Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;",
            "JJZ",
            "Ljava/util/ArrayList<",
            "Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p2

    .line 4
    .line 5
    move/from16 v8, p7

    .line 6
    .line 7
    move-object/from16 v9, p8

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    move v10, v0

    .line 11
    :goto_0
    iget-object v0, v7, Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;->representations:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ge v10, v0, :cond_6

    .line 18
    .line 19
    iget-object v0, v7, Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;->representations:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    move-object v2, v0

    .line 26
    check-cast v2, Landroidx/media3/exoplayer/dash/manifest/Representation;

    .line 27
    .line 28
    :try_start_0
    iget v0, v7, Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;->type:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    .line 29
    .line 30
    move-object/from16 v11, p1

    .line 31
    .line 32
    :try_start_1
    invoke-direct {v1, v11, v0, v2, v8}, Landroidx/media3/exoplayer/dash/offline/DashDownloader;->getSegmentIndex(Lk1/h;ILandroidx/media3/exoplayer/dash/manifest/Representation;Z)Landroidx/media3/exoplayer/dash/DashSegmentIndex;

    .line 33
    .line 34
    .line 35
    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    move-wide/from16 v12, p5

    .line 39
    .line 40
    invoke-interface {v0, v12, v13}, Landroidx/media3/exoplayer/dash/DashSegmentIndex;->getSegmentCount(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v14

    .line 44
    const-wide/16 v3, -0x1

    .line 45
    .line 46
    cmp-long v3, v14, v3

    .line 47
    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    iget-object v3, v1, Landroidx/media3/exoplayer/dash/offline/DashDownloader;->baseUrlExclusionList:Landroidx/media3/exoplayer/dash/BaseUrlExclusionList;

    .line 51
    .line 52
    iget-object v4, v2, Landroidx/media3/exoplayer/dash/manifest/Representation;->baseUrls:Lf6/m0;

    .line 53
    .line 54
    invoke-virtual {v3, v4}, Landroidx/media3/exoplayer/dash/BaseUrlExclusionList;->selectBaseUrl(Ljava/util/List;)Landroidx/media3/exoplayer/dash/manifest/BaseUrl;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    sget v4, Lh1/i0;->a:I

    .line 59
    .line 60
    iget-object v3, v3, Landroidx/media3/exoplayer/dash/manifest/BaseUrl;->url:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v2}, Landroidx/media3/exoplayer/dash/manifest/Representation;->getInitializationUri()Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    if-eqz v6, :cond_0

    .line 67
    .line 68
    move-wide/from16 v4, p3

    .line 69
    .line 70
    invoke-direct/range {v1 .. v6}, Landroidx/media3/exoplayer/dash/offline/DashDownloader;->createSegment(Landroidx/media3/exoplayer/dash/manifest/Representation;Ljava/lang/String;JLandroidx/media3/exoplayer/dash/manifest/RangedUri;)Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    :cond_0
    invoke-virtual {v2}, Landroidx/media3/exoplayer/dash/manifest/Representation;->getIndexUri()Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    if-eqz v6, :cond_1

    .line 82
    .line 83
    move-object/from16 v1, p0

    .line 84
    .line 85
    move-wide/from16 v4, p3

    .line 86
    .line 87
    invoke-direct/range {v1 .. v6}, Landroidx/media3/exoplayer/dash/offline/DashDownloader;->createSegment(Landroidx/media3/exoplayer/dash/manifest/Representation;Ljava/lang/String;JLandroidx/media3/exoplayer/dash/manifest/RangedUri;)Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    :cond_1
    invoke-interface {v0}, Landroidx/media3/exoplayer/dash/DashSegmentIndex;->getFirstSegmentNum()J

    .line 95
    .line 96
    .line 97
    move-result-wide v4

    .line 98
    add-long/2addr v14, v4

    .line 99
    const-wide/16 v16, 0x1

    .line 100
    .line 101
    sub-long v14, v14, v16

    .line 102
    .line 103
    :goto_1
    cmp-long v1, v4, v14

    .line 104
    .line 105
    if-gtz v1, :cond_4

    .line 106
    .line 107
    invoke-interface {v0, v4, v5}, Landroidx/media3/exoplayer/dash/DashSegmentIndex;->getTimeUs(J)J

    .line 108
    .line 109
    .line 110
    move-result-wide v18

    .line 111
    add-long v18, v18, p3

    .line 112
    .line 113
    invoke-interface {v0, v4, v5}, Landroidx/media3/exoplayer/dash/DashSegmentIndex;->getSegmentUrl(J)Landroidx/media3/exoplayer/dash/manifest/RangedUri;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    move-wide/from16 v20, v18

    .line 118
    .line 119
    move-wide/from16 v18, v4

    .line 120
    .line 121
    move-wide/from16 v4, v20

    .line 122
    .line 123
    move-object/from16 v1, p0

    .line 124
    .line 125
    invoke-direct/range {v1 .. v6}, Landroidx/media3/exoplayer/dash/offline/DashDownloader;->createSegment(Landroidx/media3/exoplayer/dash/manifest/Representation;Ljava/lang/String;JLandroidx/media3/exoplayer/dash/manifest/RangedUri;)Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    add-long v4, v18, v16

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_2
    new-instance v0, Landroidx/media3/exoplayer/offline/DownloadException;

    .line 136
    .line 137
    const-string v1, "Unbounded segment index"

    .line 138
    .line 139
    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/offline/DownloadException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v0

    .line 143
    :cond_3
    move-wide/from16 v12, p5

    .line 144
    .line 145
    :try_start_2
    new-instance v0, Landroidx/media3/exoplayer/offline/DownloadException;

    .line 146
    .line 147
    const-string v1, "Missing segment index"

    .line 148
    .line 149
    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/offline/DownloadException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 153
    :catch_0
    move-exception v0

    .line 154
    goto :goto_3

    .line 155
    :catch_1
    move-exception v0

    .line 156
    :goto_2
    move-wide/from16 v12, p5

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :catch_2
    move-exception v0

    .line 160
    move-object/from16 v11, p1

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :goto_3
    if-eqz v8, :cond_5

    .line 164
    .line 165
    :cond_4
    add-int/lit8 v10, v10, 0x1

    .line 166
    .line 167
    move-object/from16 v1, p0

    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_5
    throw v0

    .line 172
    :cond_6
    return-void
.end method

.method private createSegment(Landroidx/media3/exoplayer/dash/manifest/Representation;Ljava/lang/String;JLandroidx/media3/exoplayer/dash/manifest/RangedUri;)Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    sget-object v1, Lf6/q1;->p:Lf6/q1;

    .line 3
    .line 4
    invoke-static {p1, p2, p5, v0, v1}, Landroidx/media3/exoplayer/dash/DashUtil;->buildDataSpec(Landroidx/media3/exoplayer/dash/manifest/Representation;Ljava/lang/String;Landroidx/media3/exoplayer/dash/manifest/RangedUri;ILjava/util/Map;)Lk1/l;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance p2, Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;

    .line 9
    .line 10
    invoke-direct {p2, p3, p4, p1}, Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;-><init>(JLk1/l;)V

    .line 11
    .line 12
    .line 13
    return-object p2
.end method

.method private getSegmentIndex(Lk1/h;ILandroidx/media3/exoplayer/dash/manifest/Representation;Z)Landroidx/media3/exoplayer/dash/DashSegmentIndex;
    .locals 1

    .line 1
    invoke-virtual {p3}, Landroidx/media3/exoplayer/dash/manifest/Representation;->getIndex()Landroidx/media3/exoplayer/dash/DashSegmentIndex;

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
    new-instance v0, Landroidx/media3/exoplayer/dash/offline/DashDownloader$1;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1, p2, p3}, Landroidx/media3/exoplayer/dash/offline/DashDownloader$1;-><init>(Landroidx/media3/exoplayer/dash/offline/DashDownloader;Lk1/h;ILandroidx/media3/exoplayer/dash/manifest/Representation;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0, p4}, Landroidx/media3/exoplayer/offline/SegmentDownloader;->execute(Lh1/x;Z)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ln1/j;

    .line 18
    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    return-object p1

    .line 23
    :cond_1
    new-instance p2, Landroidx/media3/exoplayer/dash/DashWrappingSegmentIndex;

    .line 24
    .line 25
    iget-wide p3, p3, Landroidx/media3/exoplayer/dash/manifest/Representation;->presentationTimeOffsetUs:J

    .line 26
    .line 27
    invoke-direct {p2, p1, p3, p4}, Landroidx/media3/exoplayer/dash/DashWrappingSegmentIndex;-><init>(Ln1/j;J)V

    .line 28
    .line 29
    .line 30
    return-object p2
.end method


# virtual methods
.method public getSegments(Lk1/h;Landroidx/media3/exoplayer/dash/manifest/DashManifest;Z)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk1/h;",
            "Landroidx/media3/exoplayer/dash/manifest/DashManifest;",
            "Z)",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/offline/SegmentDownloader$Segment;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p2

    .line 2
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    const/4 v10, 0x0

    move v11, v10

    .line 3
    :goto_0
    invoke-virtual {v0}, Landroidx/media3/exoplayer/dash/manifest/DashManifest;->getPeriodCount()I

    move-result v1

    if-ge v11, v1, :cond_1

    .line 4
    invoke-virtual {v0, v11}, Landroidx/media3/exoplayer/dash/manifest/DashManifest;->getPeriod(I)Landroidx/media3/exoplayer/dash/manifest/Period;

    move-result-object v1

    .line 5
    iget-wide v2, v1, Landroidx/media3/exoplayer/dash/manifest/Period;->startMs:J

    invoke-static {v2, v3}, Lh1/i0;->S(J)J

    move-result-wide v4

    .line 6
    invoke-virtual {v0, v11}, Landroidx/media3/exoplayer/dash/manifest/DashManifest;->getPeriodDurationUs(I)J

    move-result-wide v6

    .line 7
    iget-object v12, v1, Landroidx/media3/exoplayer/dash/manifest/Period;->adaptationSets:Ljava/util/List;

    move v13, v10

    .line 8
    :goto_1
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v1

    if-ge v13, v1, :cond_0

    .line 9
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;

    move-object v1, p0

    move-object v2, p1

    move/from16 v8, p3

    .line 10
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/dash/offline/DashDownloader;->addSegmentsForAdaptationSet(Lk1/h;Landroidx/media3/exoplayer/dash/manifest/AdaptationSet;JJZLjava/util/ArrayList;)V

    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_1
    return-object v9
.end method

.method public bridge synthetic getSegments(Lk1/h;Landroidx/media3/exoplayer/offline/FilterableManifest;Z)Ljava/util/List;
    .locals 0

    .line 1
    check-cast p2, Landroidx/media3/exoplayer/dash/manifest/DashManifest;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/media3/exoplayer/dash/offline/DashDownloader;->getSegments(Lk1/h;Landroidx/media3/exoplayer/dash/manifest/DashManifest;Z)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
