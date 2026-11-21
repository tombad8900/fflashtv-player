.class final Landroidx/media3/exoplayer/hls/HlsMediaPeriod;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/source/MediaPeriod;
.implements Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistTracker$PlaylistEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/hls/HlsMediaPeriod$SampleStreamWrapperCallback;
    }
.end annotation


# instance fields
.field private final allocator:Landroidx/media3/exoplayer/upstream/Allocator;

.field private final allowChunklessPreparation:Z

.field private audioVideoSampleStreamWrapperCount:I

.field private final cmcdConfiguration:Landroidx/media3/exoplayer/upstream/CmcdConfiguration;

.field private compositeSequenceableLoader:Landroidx/media3/exoplayer/source/SequenceableLoader;

.field private final compositeSequenceableLoaderFactory:Landroidx/media3/exoplayer/source/CompositeSequenceableLoaderFactory;

.field private final dataSourceFactory:Landroidx/media3/exoplayer/hls/HlsDataSourceFactory;

.field private final drmEventDispatcher:Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;

.field private final drmSessionManager:Landroidx/media3/exoplayer/drm/DrmSessionManager;

.field private enabledSampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

.field private final eventDispatcher:Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;

.field private final extractorFactory:Landroidx/media3/exoplayer/hls/HlsExtractorFactory;

.field private final loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

.field private manifestUrlIndicesPerWrapper:[[I

.field private mediaPeriodCallback:Landroidx/media3/exoplayer/source/MediaPeriod$Callback;

.field private final mediaTransferListener:Lk1/c0;

.field private final metadataType:I

.field private pendingPrepareCount:I

.field private final playerId:Landroidx/media3/exoplayer/analytics/PlayerId;

.field private final playlistTracker:Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistTracker;

.field private final sampleStreamWrapperCallback:Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper$Callback;

.field private sampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

.field private final streamWrapperIndices:Ljava/util/IdentityHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/IdentityHashMap<",
            "Landroidx/media3/exoplayer/source/SampleStream;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final timestampAdjusterInitializationTimeoutMs:J

.field private final timestampAdjusterProvider:Landroidx/media3/exoplayer/hls/TimestampAdjusterProvider;

.field private trackGroups:Landroidx/media3/exoplayer/source/TrackGroupArray;

.field private final useSessionKeys:Z


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/hls/HlsExtractorFactory;Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistTracker;Landroidx/media3/exoplayer/hls/HlsDataSourceFactory;Lk1/c0;Landroidx/media3/exoplayer/upstream/CmcdConfiguration;Landroidx/media3/exoplayer/drm/DrmSessionManager;Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;Landroidx/media3/exoplayer/upstream/Allocator;Landroidx/media3/exoplayer/source/CompositeSequenceableLoaderFactory;ZIZLandroidx/media3/exoplayer/analytics/PlayerId;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->extractorFactory:Landroidx/media3/exoplayer/hls/HlsExtractorFactory;

    .line 3
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->playlistTracker:Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistTracker;

    .line 4
    iput-object p3, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->dataSourceFactory:Landroidx/media3/exoplayer/hls/HlsDataSourceFactory;

    .line 5
    iput-object p4, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->mediaTransferListener:Lk1/c0;

    .line 6
    iput-object p5, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->cmcdConfiguration:Landroidx/media3/exoplayer/upstream/CmcdConfiguration;

    .line 7
    iput-object p6, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->drmSessionManager:Landroidx/media3/exoplayer/drm/DrmSessionManager;

    .line 8
    iput-object p7, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->drmEventDispatcher:Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;

    .line 9
    iput-object p8, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    .line 10
    iput-object p9, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->eventDispatcher:Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;

    .line 11
    iput-object p10, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->allocator:Landroidx/media3/exoplayer/upstream/Allocator;

    .line 12
    iput-object p11, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->compositeSequenceableLoaderFactory:Landroidx/media3/exoplayer/source/CompositeSequenceableLoaderFactory;

    .line 13
    iput-boolean p12, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->allowChunklessPreparation:Z

    .line 14
    iput p13, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->metadataType:I

    .line 15
    iput-boolean p14, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->useSessionKeys:Z

    .line 16
    iput-object p15, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->playerId:Landroidx/media3/exoplayer/analytics/PlayerId;

    move-wide/from16 p1, p16

    .line 17
    iput-wide p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->timestampAdjusterInitializationTimeoutMs:J

    .line 18
    new-instance p1, Landroidx/media3/exoplayer/hls/HlsMediaPeriod$SampleStreamWrapperCallback;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Landroidx/media3/exoplayer/hls/HlsMediaPeriod$SampleStreamWrapperCallback;-><init>(Landroidx/media3/exoplayer/hls/HlsMediaPeriod;Landroidx/media3/exoplayer/hls/HlsMediaPeriod$1;)V

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->sampleStreamWrapperCallback:Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper$Callback;

    .line 19
    invoke-interface {p11}, Landroidx/media3/exoplayer/source/CompositeSequenceableLoaderFactory;->empty()Landroidx/media3/exoplayer/source/SequenceableLoader;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->compositeSequenceableLoader:Landroidx/media3/exoplayer/source/SequenceableLoader;

    .line 20
    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->streamWrapperIndices:Ljava/util/IdentityHashMap;

    .line 21
    new-instance p1, Landroidx/media3/exoplayer/hls/TimestampAdjusterProvider;

    invoke-direct {p1}, Landroidx/media3/exoplayer/hls/TimestampAdjusterProvider;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->timestampAdjusterProvider:Landroidx/media3/exoplayer/hls/TimestampAdjusterProvider;

    const/4 p1, 0x0

    .line 22
    new-array p2, p1, [Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    iput-object p2, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->sampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 23
    new-array p2, p1, [Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    iput-object p2, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->enabledSampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 24
    new-array p1, p1, [[I

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->manifestUrlIndicesPerWrapper:[[I

    return-void
.end method

.method public static synthetic a(Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->lambda$selectTracks$0(Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$106(Landroidx/media3/exoplayer/hls/HlsMediaPeriod;)I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->pendingPrepareCount:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->pendingPrepareCount:I

    .line 6
    .line 7
    return v0
.end method

.method public static synthetic access$200(Landroidx/media3/exoplayer/hls/HlsMediaPeriod;)[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->sampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$302(Landroidx/media3/exoplayer/hls/HlsMediaPeriod;Landroidx/media3/exoplayer/source/TrackGroupArray;)Landroidx/media3/exoplayer/source/TrackGroupArray;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->trackGroups:Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$400(Landroidx/media3/exoplayer/hls/HlsMediaPeriod;)Landroidx/media3/exoplayer/source/MediaPeriod$Callback;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->mediaPeriodCallback:Landroidx/media3/exoplayer/source/MediaPeriod$Callback;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$500(Landroidx/media3/exoplayer/hls/HlsMediaPeriod;)Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistTracker;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->playlistTracker:Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistTracker;

    .line 2
    .line 3
    return-object p0
.end method

.method private buildAndPrepareAudioSampleStreamWrappers(JLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Rendition;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;",
            ">;",
            "Ljava/util/List<",
            "[I>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/media3/common/s;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v2, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    new-instance v4, Ljava/util/HashSet;

    .line 31
    .line 32
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 33
    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    move v6, v5

    .line 37
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-ge v6, v7, :cond_5

    .line 42
    .line 43
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    check-cast v7, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Rendition;

    .line 48
    .line 49
    iget-object v7, v7, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Rendition;->name:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v4, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    if-nez v8, :cond_0

    .line 56
    .line 57
    move-object/from16 v11, p0

    .line 58
    .line 59
    move-object/from16 v8, p4

    .line 60
    .line 61
    move-object/from16 v9, p5

    .line 62
    .line 63
    goto/16 :goto_3

    .line 64
    .line 65
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 72
    .line 73
    .line 74
    const/4 v8, 0x1

    .line 75
    move v9, v5

    .line 76
    move v10, v8

    .line 77
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 78
    .line 79
    .line 80
    move-result v11

    .line 81
    if-ge v9, v11, :cond_3

    .line 82
    .line 83
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    check-cast v11, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Rendition;

    .line 88
    .line 89
    iget-object v11, v11, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Rendition;->name:Ljava/lang/String;

    .line 90
    .line 91
    sget v12, Lh1/i0;->a:I

    .line 92
    .line 93
    invoke-static {v7, v11}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v11

    .line 97
    if-eqz v11, :cond_2

    .line 98
    .line 99
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    check-cast v11, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Rendition;

    .line 104
    .line 105
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v12

    .line 109
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    iget-object v12, v11, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Rendition;->url:Landroid/net/Uri;

    .line 113
    .line 114
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    iget-object v12, v11, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Rendition;->format:Landroidx/media3/common/w;

    .line 118
    .line 119
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    iget-object v11, v11, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Rendition;->format:Landroidx/media3/common/w;

    .line 123
    .line 124
    iget-object v11, v11, Landroidx/media3/common/w;->k:Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {v8, v11}, Lh1/i0;->v(ILjava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result v11

    .line 130
    if-ne v11, v8, :cond_1

    .line 131
    .line 132
    move v11, v8

    .line 133
    goto :goto_2

    .line 134
    :cond_1
    move v11, v5

    .line 135
    :goto_2
    and-int/2addr v10, v11

    .line 136
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_3
    const-string v8, "audio:"

    .line 140
    .line 141
    invoke-static {v8, v7}, La1/a1;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v12

    .line 145
    new-array v7, v5, [Landroid/net/Uri;

    .line 146
    .line 147
    sget v8, Lh1/i0;->a:I

    .line 148
    .line 149
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    move-object v14, v7

    .line 154
    check-cast v14, [Landroid/net/Uri;

    .line 155
    .line 156
    new-array v7, v5, [Landroidx/media3/common/w;

    .line 157
    .line 158
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    move-object v15, v7

    .line 163
    check-cast v15, [Landroidx/media3/common/w;

    .line 164
    .line 165
    const/16 v16, 0x0

    .line 166
    .line 167
    sget-object v17, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 168
    .line 169
    const/4 v13, 0x1

    .line 170
    move-object/from16 v11, p0

    .line 171
    .line 172
    move-wide/from16 v19, p1

    .line 173
    .line 174
    move-object/from16 v18, p6

    .line 175
    .line 176
    invoke-direct/range {v11 .. v20}, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->buildSampleStreamWrapper(Ljava/lang/String;I[Landroid/net/Uri;[Landroidx/media3/common/w;Landroidx/media3/common/w;Ljava/util/List;Ljava/util/Map;J)Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    invoke-static {v3}, Lcom/bumptech/glide/d;->p0(Ljava/util/Collection;)[I

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    move-object/from16 v9, p5

    .line 185
    .line 186
    invoke-interface {v9, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-object/from16 v8, p4

    .line 190
    .line 191
    invoke-interface {v8, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    iget-boolean v13, v11, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->allowChunklessPreparation:Z

    .line 195
    .line 196
    if-eqz v13, :cond_4

    .line 197
    .line 198
    if-eqz v10, :cond_4

    .line 199
    .line 200
    new-array v10, v5, [Landroidx/media3/common/w;

    .line 201
    .line 202
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v10

    .line 206
    check-cast v10, [Landroidx/media3/common/w;

    .line 207
    .line 208
    new-instance v13, Landroidx/media3/common/q1;

    .line 209
    .line 210
    invoke-direct {v13, v12, v10}, Landroidx/media3/common/q1;-><init>(Ljava/lang/String;[Landroidx/media3/common/w;)V

    .line 211
    .line 212
    .line 213
    filled-new-array {v13}, [Landroidx/media3/common/q1;

    .line 214
    .line 215
    .line 216
    move-result-object v10

    .line 217
    new-array v12, v5, [I

    .line 218
    .line 219
    invoke-virtual {v7, v10, v5, v12}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->prepareWithMultivariantPlaylistInfo([Landroidx/media3/common/q1;I[I)V

    .line 220
    .line 221
    .line 222
    :cond_4
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :cond_5
    move-object/from16 v11, p0

    .line 227
    .line 228
    return-void
.end method

.method private buildAndPrepareMainSampleStreamWrapper(Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;JLjava/util/List;Ljava/util/List;Ljava/util/Map;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;",
            "J",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;",
            ">;",
            "Ljava/util/List<",
            "[I>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/media3/common/s;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v10, p1

    .line 2
    .line 3
    iget-object v0, v10, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;->variants:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    new-array v1, v0, [I

    .line 10
    .line 11
    const/4 v11, 0x0

    .line 12
    move v2, v11

    .line 13
    move v3, v2

    .line 14
    move v4, v3

    .line 15
    :goto_0
    iget-object v5, v10, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;->variants:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    const/4 v6, 0x2

    .line 22
    const/4 v12, 0x1

    .line 23
    if-ge v2, v5, :cond_3

    .line 24
    .line 25
    iget-object v5, v10, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;->variants:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    check-cast v5, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;

    .line 32
    .line 33
    iget-object v5, v5, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->format:Landroidx/media3/common/w;

    .line 34
    .line 35
    iget v7, v5, Landroidx/media3/common/w;->v:I

    .line 36
    .line 37
    iget-object v5, v5, Landroidx/media3/common/w;->k:Ljava/lang/String;

    .line 38
    .line 39
    if-gtz v7, :cond_2

    .line 40
    .line 41
    invoke-static {v6, v5}, Lh1/i0;->w(ILjava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    if-eqz v7, :cond_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    invoke-static {v12, v5}, Lh1/i0;->w(ILjava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    if-eqz v5, :cond_1

    .line 53
    .line 54
    aput v12, v1, v2

    .line 55
    .line 56
    add-int/lit8 v4, v4, 0x1

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_1
    const/4 v5, -0x1

    .line 60
    aput v5, v1, v2

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    :goto_1
    aput v6, v1, v2

    .line 64
    .line 65
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    if-lez v3, :cond_4

    .line 71
    .line 72
    move v13, v3

    .line 73
    move v2, v11

    .line 74
    move v0, v12

    .line 75
    goto :goto_3

    .line 76
    :cond_4
    if-ge v4, v0, :cond_5

    .line 77
    .line 78
    sub-int/2addr v0, v4

    .line 79
    move v13, v0

    .line 80
    move v0, v11

    .line 81
    move v2, v12

    .line 82
    goto :goto_3

    .line 83
    :cond_5
    move v13, v0

    .line 84
    move v0, v11

    .line 85
    move v2, v0

    .line 86
    :goto_3
    new-array v3, v13, [Landroid/net/Uri;

    .line 87
    .line 88
    new-array v4, v13, [Landroidx/media3/common/w;

    .line 89
    .line 90
    new-array v14, v13, [I

    .line 91
    .line 92
    move v5, v11

    .line 93
    move v7, v5

    .line 94
    :goto_4
    iget-object v8, v10, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;->variants:Ljava/util/List;

    .line 95
    .line 96
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    if-ge v5, v8, :cond_9

    .line 101
    .line 102
    if-eqz v0, :cond_6

    .line 103
    .line 104
    aget v8, v1, v5

    .line 105
    .line 106
    if-ne v8, v6, :cond_8

    .line 107
    .line 108
    :cond_6
    if-eqz v2, :cond_7

    .line 109
    .line 110
    aget v8, v1, v5

    .line 111
    .line 112
    if-eq v8, v12, :cond_8

    .line 113
    .line 114
    :cond_7
    iget-object v8, v10, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;->variants:Ljava/util/List;

    .line 115
    .line 116
    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    check-cast v8, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;

    .line 121
    .line 122
    iget-object v9, v8, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->url:Landroid/net/Uri;

    .line 123
    .line 124
    aput-object v9, v3, v7

    .line 125
    .line 126
    iget-object v8, v8, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->format:Landroidx/media3/common/w;

    .line 127
    .line 128
    aput-object v8, v4, v7

    .line 129
    .line 130
    add-int/lit8 v8, v7, 0x1

    .line 131
    .line 132
    aput v5, v14, v7

    .line 133
    .line 134
    move v7, v8

    .line 135
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_9
    aget-object v1, v4, v11

    .line 139
    .line 140
    iget-object v1, v1, Landroidx/media3/common/w;->k:Ljava/lang/String;

    .line 141
    .line 142
    invoke-static {v6, v1}, Lh1/i0;->v(ILjava/lang/String;)I

    .line 143
    .line 144
    .line 145
    move-result v15

    .line 146
    invoke-static {v12, v1}, Lh1/i0;->v(ILjava/lang/String;)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-eq v1, v12, :cond_a

    .line 151
    .line 152
    if-nez v1, :cond_b

    .line 153
    .line 154
    iget-object v2, v10, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;->audios:Ljava/util/List;

    .line 155
    .line 156
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-eqz v2, :cond_b

    .line 161
    .line 162
    :cond_a
    if-gt v15, v12, :cond_b

    .line 163
    .line 164
    add-int v2, v1, v15

    .line 165
    .line 166
    if-lez v2, :cond_b

    .line 167
    .line 168
    move/from16 v16, v12

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_b
    move/from16 v16, v11

    .line 172
    .line 173
    :goto_5
    if-nez v0, :cond_c

    .line 174
    .line 175
    if-lez v1, :cond_c

    .line 176
    .line 177
    move v2, v12

    .line 178
    goto :goto_6

    .line 179
    :cond_c
    move v2, v11

    .line 180
    :goto_6
    iget-object v5, v10, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;->muxedAudioFormat:Landroidx/media3/common/w;

    .line 181
    .line 182
    iget-object v6, v10, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;->muxedCaptionFormats:Ljava/util/List;

    .line 183
    .line 184
    move v0, v1

    .line 185
    const-string v1, "main"

    .line 186
    .line 187
    move-wide/from16 v8, p2

    .line 188
    .line 189
    move-object/from16 v7, p6

    .line 190
    .line 191
    move/from16 v17, v0

    .line 192
    .line 193
    move-object/from16 v0, p0

    .line 194
    .line 195
    invoke-direct/range {v0 .. v9}, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->buildSampleStreamWrapper(Ljava/lang/String;I[Landroid/net/Uri;[Landroidx/media3/common/w;Landroidx/media3/common/w;Ljava/util/List;Ljava/util/Map;J)Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    move-object v3, v1

    .line 200
    move-object/from16 v1, p4

    .line 201
    .line 202
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-object/from16 v1, p5

    .line 206
    .line 207
    invoke-interface {v1, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    iget-boolean v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->allowChunklessPreparation:Z

    .line 211
    .line 212
    if-eqz v1, :cond_13

    .line 213
    .line 214
    if-eqz v16, :cond_13

    .line 215
    .line 216
    new-instance v1, Ljava/util/ArrayList;

    .line 217
    .line 218
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 219
    .line 220
    .line 221
    if-lez v15, :cond_10

    .line 222
    .line 223
    new-array v5, v13, [Landroidx/media3/common/w;

    .line 224
    .line 225
    move v6, v11

    .line 226
    :goto_7
    if-ge v6, v13, :cond_d

    .line 227
    .line 228
    aget-object v7, v4, v6

    .line 229
    .line 230
    invoke-static {v7}, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->deriveVideoFormat(Landroidx/media3/common/w;)Landroidx/media3/common/w;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    aput-object v7, v5, v6

    .line 235
    .line 236
    add-int/lit8 v6, v6, 0x1

    .line 237
    .line 238
    goto :goto_7

    .line 239
    :cond_d
    new-instance v6, Landroidx/media3/common/q1;

    .line 240
    .line 241
    invoke-direct {v6, v3, v5}, Landroidx/media3/common/q1;-><init>(Ljava/lang/String;[Landroidx/media3/common/w;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    if-lez v17, :cond_f

    .line 248
    .line 249
    iget-object v3, v10, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;->muxedAudioFormat:Landroidx/media3/common/w;

    .line 250
    .line 251
    if-nez v3, :cond_e

    .line 252
    .line 253
    iget-object v3, v10, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;->audios:Ljava/util/List;

    .line 254
    .line 255
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    if-eqz v3, :cond_f

    .line 260
    .line 261
    :cond_e
    new-instance v3, Landroidx/media3/common/q1;

    .line 262
    .line 263
    aget-object v4, v4, v11

    .line 264
    .line 265
    iget-object v5, v10, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;->muxedAudioFormat:Landroidx/media3/common/w;

    .line 266
    .line 267
    invoke-static {v4, v5, v11}, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->deriveAudioFormat(Landroidx/media3/common/w;Landroidx/media3/common/w;Z)Landroidx/media3/common/w;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    filled-new-array {v4}, [Landroidx/media3/common/w;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    const-string v5, "main:audio"

    .line 276
    .line 277
    invoke-direct {v3, v5, v4}, Landroidx/media3/common/q1;-><init>(Ljava/lang/String;[Landroidx/media3/common/w;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    :cond_f
    iget-object v3, v10, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;->muxedCaptionFormats:Ljava/util/List;

    .line 284
    .line 285
    if-eqz v3, :cond_12

    .line 286
    .line 287
    move v4, v11

    .line 288
    :goto_8
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 289
    .line 290
    .line 291
    move-result v5

    .line 292
    if-ge v4, v5, :cond_12

    .line 293
    .line 294
    const-string v5, "main:cc:"

    .line 295
    .line 296
    invoke-static {v4, v5}, La1/a1;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    new-instance v6, Landroidx/media3/common/q1;

    .line 301
    .line 302
    iget-object v7, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->extractorFactory:Landroidx/media3/exoplayer/hls/HlsExtractorFactory;

    .line 303
    .line 304
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v8

    .line 308
    check-cast v8, Landroidx/media3/common/w;

    .line 309
    .line 310
    invoke-interface {v7, v8}, Landroidx/media3/exoplayer/hls/HlsExtractorFactory;->getOutputTextFormat(Landroidx/media3/common/w;)Landroidx/media3/common/w;

    .line 311
    .line 312
    .line 313
    move-result-object v7

    .line 314
    filled-new-array {v7}, [Landroidx/media3/common/w;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    invoke-direct {v6, v5, v7}, Landroidx/media3/common/q1;-><init>(Ljava/lang/String;[Landroidx/media3/common/w;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    add-int/lit8 v4, v4, 0x1

    .line 325
    .line 326
    goto :goto_8

    .line 327
    :cond_10
    new-array v5, v13, [Landroidx/media3/common/w;

    .line 328
    .line 329
    move v6, v11

    .line 330
    :goto_9
    if-ge v6, v13, :cond_11

    .line 331
    .line 332
    aget-object v7, v4, v6

    .line 333
    .line 334
    iget-object v8, v10, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;->muxedAudioFormat:Landroidx/media3/common/w;

    .line 335
    .line 336
    invoke-static {v7, v8, v12}, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->deriveAudioFormat(Landroidx/media3/common/w;Landroidx/media3/common/w;Z)Landroidx/media3/common/w;

    .line 337
    .line 338
    .line 339
    move-result-object v7

    .line 340
    aput-object v7, v5, v6

    .line 341
    .line 342
    add-int/lit8 v6, v6, 0x1

    .line 343
    .line 344
    goto :goto_9

    .line 345
    :cond_11
    new-instance v4, Landroidx/media3/common/q1;

    .line 346
    .line 347
    invoke-direct {v4, v3, v5}, Landroidx/media3/common/q1;-><init>(Ljava/lang/String;[Landroidx/media3/common/w;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    :cond_12
    new-instance v3, Landroidx/media3/common/q1;

    .line 354
    .line 355
    new-instance v4, Landroidx/media3/common/v;

    .line 356
    .line 357
    invoke-direct {v4}, Landroidx/media3/common/v;-><init>()V

    .line 358
    .line 359
    .line 360
    const-string v5, "ID3"

    .line 361
    .line 362
    iput-object v5, v4, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 363
    .line 364
    const-string v5, "application/id3"

    .line 365
    .line 366
    invoke-static {v5}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v5

    .line 370
    iput-object v5, v4, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 371
    .line 372
    new-instance v5, Landroidx/media3/common/w;

    .line 373
    .line 374
    invoke-direct {v5, v4}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 375
    .line 376
    .line 377
    filled-new-array {v5}, [Landroidx/media3/common/w;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    const-string v5, "main:id3"

    .line 382
    .line 383
    invoke-direct {v3, v5, v4}, Landroidx/media3/common/q1;-><init>(Ljava/lang/String;[Landroidx/media3/common/w;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    new-array v4, v11, [Landroidx/media3/common/q1;

    .line 390
    .line 391
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v4

    .line 395
    check-cast v4, [Landroidx/media3/common/q1;

    .line 396
    .line 397
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    filled-new-array {v1}, [I

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    invoke-virtual {v2, v4, v11, v1}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->prepareWithMultivariantPlaylistInfo([Landroidx/media3/common/q1;I[I)V

    .line 406
    .line 407
    .line 408
    :cond_13
    return-void
.end method

.method private buildAndPrepareSampleStreamWrappers(J)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->playlistTracker:Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistTracker;

    .line 4
    .line 5
    invoke-interface {v1}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistTracker;->getMultivariantPlaylist()Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-boolean v2, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->useSessionKeys:Z

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v2, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;->sessionKeyDrmInitData:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v2}, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->deriveOverridingDrmInitData(Ljava/util/List;)Ljava/util/Map;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :goto_0
    move-object v6, v2

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v2, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;->variants:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    iget-object v7, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;->audios:Ljava/util/List;

    .line 34
    .line 35
    iget-object v10, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;->subtitles:Ljava/util/List;

    .line 36
    .line 37
    const/4 v11, 0x0

    .line 38
    iput v11, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->pendingPrepareCount:I

    .line 39
    .line 40
    new-instance v4, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    new-instance v5, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    if-nez v2, :cond_1

    .line 51
    .line 52
    move-wide/from16 v2, p1

    .line 53
    .line 54
    invoke-direct/range {v0 .. v6}, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->buildAndPrepareMainSampleStreamWrapper(Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;JLjava/util/List;Ljava/util/List;Ljava/util/Map;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    move-object/from16 v0, p0

    .line 58
    .line 59
    move-wide/from16 v1, p1

    .line 60
    .line 61
    move-object v3, v7

    .line 62
    invoke-direct/range {v0 .. v6}, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->buildAndPrepareAudioSampleStreamWrappers(JLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V

    .line 63
    .line 64
    .line 65
    move-object v12, v4

    .line 66
    move-object v13, v5

    .line 67
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    iput v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->audioVideoSampleStreamWrapperCount:I

    .line 72
    .line 73
    move v14, v11

    .line 74
    :goto_2
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-ge v14, v1, :cond_2

    .line 79
    .line 80
    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Rendition;

    .line 85
    .line 86
    new-instance v2, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v3, "subtitle:"

    .line 89
    .line 90
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v3, ":"

    .line 97
    .line 98
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    iget-object v3, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Rendition;->name:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    iget-object v15, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Rendition;->format:Landroidx/media3/common/w;

    .line 111
    .line 112
    iget-object v1, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Rendition;->url:Landroid/net/Uri;

    .line 113
    .line 114
    filled-new-array {v1}, [Landroid/net/Uri;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    filled-new-array {v15}, [Landroidx/media3/common/w;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    const/4 v5, 0x0

    .line 123
    move-object v7, v6

    .line 124
    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 125
    .line 126
    move-object v1, v2

    .line 127
    const/4 v2, 0x3

    .line 128
    move-wide/from16 v8, p1

    .line 129
    .line 130
    invoke-direct/range {v0 .. v9}, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->buildSampleStreamWrapper(Ljava/lang/String;I[Landroid/net/Uri;[Landroidx/media3/common/w;Landroidx/media3/common/w;Ljava/util/List;Ljava/util/Map;J)Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    move-object v6, v7

    .line 135
    filled-new-array {v14}, [I

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    new-instance v3, Landroidx/media3/common/q1;

    .line 146
    .line 147
    iget-object v4, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->extractorFactory:Landroidx/media3/exoplayer/hls/HlsExtractorFactory;

    .line 148
    .line 149
    invoke-interface {v4, v15}, Landroidx/media3/exoplayer/hls/HlsExtractorFactory;->getOutputTextFormat(Landroidx/media3/common/w;)Landroidx/media3/common/w;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    filled-new-array {v4}, [Landroidx/media3/common/w;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-direct {v3, v1, v4}, Landroidx/media3/common/q1;-><init>(Ljava/lang/String;[Landroidx/media3/common/w;)V

    .line 158
    .line 159
    .line 160
    filled-new-array {v3}, [Landroidx/media3/common/q1;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    new-array v3, v11, [I

    .line 165
    .line 166
    invoke-virtual {v2, v1, v11, v3}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->prepareWithMultivariantPlaylistInfo([Landroidx/media3/common/q1;I[I)V

    .line 167
    .line 168
    .line 169
    add-int/lit8 v14, v14, 0x1

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_2
    new-array v1, v11, [Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 173
    .line 174
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    check-cast v1, [Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 179
    .line 180
    iput-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->sampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 181
    .line 182
    new-array v1, v11, [[I

    .line 183
    .line 184
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    check-cast v1, [[I

    .line 189
    .line 190
    iput-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->manifestUrlIndicesPerWrapper:[[I

    .line 191
    .line 192
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->sampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 193
    .line 194
    array-length v1, v1

    .line 195
    iput v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->pendingPrepareCount:I

    .line 196
    .line 197
    move v1, v11

    .line 198
    :goto_3
    iget v2, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->audioVideoSampleStreamWrapperCount:I

    .line 199
    .line 200
    if-ge v1, v2, :cond_3

    .line 201
    .line 202
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->sampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 203
    .line 204
    aget-object v2, v2, v1

    .line 205
    .line 206
    const/4 v3, 0x1

    .line 207
    invoke-virtual {v2, v3}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->setIsPrimaryTimestampSource(Z)V

    .line 208
    .line 209
    .line 210
    add-int/lit8 v1, v1, 0x1

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_3
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->sampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 214
    .line 215
    array-length v2, v1

    .line 216
    :goto_4
    if-ge v11, v2, :cond_4

    .line 217
    .line 218
    aget-object v3, v1, v11

    .line 219
    .line 220
    invoke-virtual {v3}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->continuePreparing()V

    .line 221
    .line 222
    .line 223
    add-int/lit8 v11, v11, 0x1

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_4
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->sampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 227
    .line 228
    iput-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->enabledSampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 229
    .line 230
    return-void
.end method

.method private buildSampleStreamWrapper(Ljava/lang/String;I[Landroid/net/Uri;[Landroidx/media3/common/w;Landroidx/media3/common/w;Ljava/util/List;Ljava/util/Map;J)Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I[",
            "Landroid/net/Uri;",
            "[",
            "Landroidx/media3/common/w;",
            "Landroidx/media3/common/w;",
            "Ljava/util/List<",
            "Landroidx/media3/common/w;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/media3/common/s;",
            ">;J)",
            "Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Landroidx/media3/exoplayer/hls/HlsChunkSource;

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->extractorFactory:Landroidx/media3/exoplayer/hls/HlsExtractorFactory;

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->playlistTracker:Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistTracker;

    .line 8
    .line 9
    iget-object v6, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->dataSourceFactory:Landroidx/media3/exoplayer/hls/HlsDataSourceFactory;

    .line 10
    .line 11
    iget-object v7, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->mediaTransferListener:Lk1/c0;

    .line 12
    .line 13
    iget-object v8, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->timestampAdjusterProvider:Landroidx/media3/exoplayer/hls/TimestampAdjusterProvider;

    .line 14
    .line 15
    iget-wide v9, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->timestampAdjusterInitializationTimeoutMs:J

    .line 16
    .line 17
    iget-object v12, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->playerId:Landroidx/media3/exoplayer/analytics/PlayerId;

    .line 18
    .line 19
    iget-object v13, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->cmcdConfiguration:Landroidx/media3/exoplayer/upstream/CmcdConfiguration;

    .line 20
    .line 21
    move-object/from16 v4, p3

    .line 22
    .line 23
    move-object/from16 v5, p4

    .line 24
    .line 25
    move-object/from16 v11, p6

    .line 26
    .line 27
    invoke-direct/range {v1 .. v13}, Landroidx/media3/exoplayer/hls/HlsChunkSource;-><init>(Landroidx/media3/exoplayer/hls/HlsExtractorFactory;Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistTracker;[Landroid/net/Uri;[Landroidx/media3/common/w;Landroidx/media3/exoplayer/hls/HlsDataSourceFactory;Lk1/c0;Landroidx/media3/exoplayer/hls/TimestampAdjusterProvider;JLjava/util/List;Landroidx/media3/exoplayer/analytics/PlayerId;Landroidx/media3/exoplayer/upstream/CmcdConfiguration;)V

    .line 28
    .line 29
    .line 30
    new-instance v2, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 31
    .line 32
    iget-object v4, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->sampleStreamWrapperCallback:Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper$Callback;

    .line 33
    .line 34
    iget-object v7, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->allocator:Landroidx/media3/exoplayer/upstream/Allocator;

    .line 35
    .line 36
    iget-object v11, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->drmSessionManager:Landroidx/media3/exoplayer/drm/DrmSessionManager;

    .line 37
    .line 38
    iget-object v12, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->drmEventDispatcher:Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;

    .line 39
    .line 40
    iget-object v13, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->loadErrorHandlingPolicy:Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;

    .line 41
    .line 42
    iget-object v14, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->eventDispatcher:Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;

    .line 43
    .line 44
    iget v15, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->metadataType:I

    .line 45
    .line 46
    move/from16 v3, p2

    .line 47
    .line 48
    move-object/from16 v10, p5

    .line 49
    .line 50
    move-object/from16 v6, p7

    .line 51
    .line 52
    move-wide/from16 v8, p8

    .line 53
    .line 54
    move-object v5, v1

    .line 55
    move-object v1, v2

    .line 56
    move-object/from16 v2, p1

    .line 57
    .line 58
    invoke-direct/range {v1 .. v15}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;-><init>(Ljava/lang/String;ILandroidx/media3/exoplayer/hls/HlsSampleStreamWrapper$Callback;Landroidx/media3/exoplayer/hls/HlsChunkSource;Ljava/util/Map;Landroidx/media3/exoplayer/upstream/Allocator;JLandroidx/media3/common/w;Landroidx/media3/exoplayer/drm/DrmSessionManager;Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;Landroidx/media3/exoplayer/source/MediaSourceEventListener$EventDispatcher;I)V

    .line 59
    .line 60
    .line 61
    return-object v1
.end method

.method private static deriveAudioFormat(Landroidx/media3/common/w;Landroidx/media3/common/w;Z)Landroidx/media3/common/w;
    .locals 12

    .line 1
    sget-object v0, Lf6/m0;->k:Lf6/k0;

    .line 2
    .line 3
    sget-object v0, Lf6/l1;->n:Lf6/l1;

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p1, Landroidx/media3/common/w;->k:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p1, Landroidx/media3/common/w;->l:Landroidx/media3/common/t0;

    .line 11
    .line 12
    iget v3, p1, Landroidx/media3/common/w;->C:I

    .line 13
    .line 14
    iget v4, p1, Landroidx/media3/common/w;->e:I

    .line 15
    .line 16
    iget v5, p1, Landroidx/media3/common/w;->f:I

    .line 17
    .line 18
    iget-object v6, p1, Landroidx/media3/common/w;->d:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v7, p1, Landroidx/media3/common/w;->b:Ljava/lang/String;

    .line 21
    .line 22
    iget-object p1, p1, Landroidx/media3/common/w;->c:Lf6/m0;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object p1, p0, Landroidx/media3/common/w;->k:Ljava/lang/String;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-static {v2, p1}, Lh1/i0;->w(ILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object v2, p0, Landroidx/media3/common/w;->l:Landroidx/media3/common/t0;

    .line 33
    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    iget v3, p0, Landroidx/media3/common/w;->C:I

    .line 37
    .line 38
    iget v4, p0, Landroidx/media3/common/w;->e:I

    .line 39
    .line 40
    iget v5, p0, Landroidx/media3/common/w;->f:I

    .line 41
    .line 42
    iget-object v6, p0, Landroidx/media3/common/w;->d:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v7, p0, Landroidx/media3/common/w;->b:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v0, p0, Landroidx/media3/common/w;->c:Lf6/m0;

    .line 47
    .line 48
    move-object v11, v0

    .line 49
    move-object v0, p1

    .line 50
    move-object p1, v11

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/4 v4, 0x0

    .line 53
    const/4 v6, 0x0

    .line 54
    move-object v3, v0

    .line 55
    move-object v0, p1

    .line 56
    move-object p1, v3

    .line 57
    move v3, v1

    .line 58
    move v5, v4

    .line 59
    move-object v7, v6

    .line 60
    :goto_0
    invoke-static {v0}, Landroidx/media3/common/u0;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    if-eqz p2, :cond_2

    .line 65
    .line 66
    iget v9, p0, Landroidx/media3/common/w;->h:I

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    move v9, v1

    .line 70
    :goto_1
    if-eqz p2, :cond_3

    .line 71
    .line 72
    iget v1, p0, Landroidx/media3/common/w;->i:I

    .line 73
    .line 74
    :cond_3
    new-instance p2, Landroidx/media3/common/v;

    .line 75
    .line 76
    invoke-direct {p2}, Landroidx/media3/common/v;-><init>()V

    .line 77
    .line 78
    .line 79
    iget-object v10, p0, Landroidx/media3/common/w;->a:Ljava/lang/String;

    .line 80
    .line 81
    iput-object v10, p2, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 82
    .line 83
    iput-object v7, p2, Landroidx/media3/common/v;->b:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {p1}, Lf6/m0;->j(Ljava/util/Collection;)Lf6/m0;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iput-object p1, p2, Landroidx/media3/common/v;->c:Lf6/m0;

    .line 90
    .line 91
    iget-object p0, p0, Landroidx/media3/common/w;->m:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {p0}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    iput-object p0, p2, Landroidx/media3/common/v;->l:Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {v8}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    iput-object p0, p2, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 104
    .line 105
    iput-object v0, p2, Landroidx/media3/common/v;->j:Ljava/lang/String;

    .line 106
    .line 107
    iput-object v2, p2, Landroidx/media3/common/v;->k:Landroidx/media3/common/t0;

    .line 108
    .line 109
    iput v9, p2, Landroidx/media3/common/v;->h:I

    .line 110
    .line 111
    iput v1, p2, Landroidx/media3/common/v;->i:I

    .line 112
    .line 113
    iput v3, p2, Landroidx/media3/common/v;->B:I

    .line 114
    .line 115
    iput v4, p2, Landroidx/media3/common/v;->e:I

    .line 116
    .line 117
    iput v5, p2, Landroidx/media3/common/v;->f:I

    .line 118
    .line 119
    iput-object v6, p2, Landroidx/media3/common/v;->d:Ljava/lang/String;

    .line 120
    .line 121
    new-instance p0, Landroidx/media3/common/w;

    .line 122
    .line 123
    invoke-direct {p0, p2}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 124
    .line 125
    .line 126
    return-object p0
.end method

.method private static deriveOverridingDrmInitData(Ljava/util/List;)Ljava/util/Map;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/common/s;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/media3/common/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-ge v3, v4, :cond_5

    .line 18
    .line 19
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Landroidx/media3/common/s;

    .line 24
    .line 25
    iget-object v5, v4, Landroidx/media3/common/s;->l:Ljava/lang/String;

    .line 26
    .line 27
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    move v6, v3

    .line 30
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    if-ge v6, v7, :cond_4

    .line 35
    .line 36
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    check-cast v7, Landroidx/media3/common/s;

    .line 41
    .line 42
    iget-object v8, v7, Landroidx/media3/common/s;->l:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v8, v5}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    if-eqz v9, :cond_3

    .line 49
    .line 50
    iget-object v9, v4, Landroidx/media3/common/s;->l:Ljava/lang/String;

    .line 51
    .line 52
    const/4 v10, 0x1

    .line 53
    if-eqz v9, :cond_1

    .line 54
    .line 55
    if-eqz v8, :cond_1

    .line 56
    .line 57
    invoke-static {v9, v8}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    if-eqz v11, :cond_0

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_0
    move v11, v2

    .line 65
    goto :goto_3

    .line 66
    :cond_1
    :goto_2
    move v11, v10

    .line 67
    :goto_3
    invoke-static {v11}, Lh1/a;->j(Z)V

    .line 68
    .line 69
    .line 70
    if-eqz v9, :cond_2

    .line 71
    .line 72
    move-object v8, v9

    .line 73
    :cond_2
    iget-object v4, v4, Landroidx/media3/common/s;->j:[Landroidx/media3/common/r;

    .line 74
    .line 75
    iget-object v7, v7, Landroidx/media3/common/s;->j:[Landroidx/media3/common/r;

    .line 76
    .line 77
    sget v9, Lh1/i0;->a:I

    .line 78
    .line 79
    array-length v9, v4

    .line 80
    array-length v11, v7

    .line 81
    add-int/2addr v9, v11

    .line 82
    invoke-static {v4, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    array-length v4, v4

    .line 87
    array-length v11, v7

    .line 88
    invoke-static {v7, v2, v9, v4, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 89
    .line 90
    .line 91
    check-cast v9, [Landroidx/media3/common/r;

    .line 92
    .line 93
    new-instance v4, Landroidx/media3/common/s;

    .line 94
    .line 95
    invoke-direct {v4, v8, v10, v9}, Landroidx/media3/common/s;-><init>(Ljava/lang/String;Z[Landroidx/media3/common/r;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_5
    return-object v1
.end method

.method private static deriveVideoFormat(Landroidx/media3/common/w;)Landroidx/media3/common/w;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/common/w;->k:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v1, v0}, Lh1/i0;->w(ILjava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Landroidx/media3/common/u0;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Landroidx/media3/common/v;

    .line 13
    .line 14
    invoke-direct {v2}, Landroidx/media3/common/v;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, Landroidx/media3/common/w;->a:Ljava/lang/String;

    .line 18
    .line 19
    iput-object v3, v2, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v3, p0, Landroidx/media3/common/w;->b:Ljava/lang/String;

    .line 22
    .line 23
    iput-object v3, v2, Landroidx/media3/common/v;->b:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v3, p0, Landroidx/media3/common/w;->c:Lf6/m0;

    .line 26
    .line 27
    invoke-static {v3}, Lf6/m0;->j(Ljava/util/Collection;)Lf6/m0;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iput-object v3, v2, Landroidx/media3/common/v;->c:Lf6/m0;

    .line 32
    .line 33
    iget-object v3, p0, Landroidx/media3/common/w;->m:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v3}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iput-object v3, v2, Landroidx/media3/common/v;->l:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v1}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iput-object v1, v2, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 46
    .line 47
    iput-object v0, v2, Landroidx/media3/common/v;->j:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v0, p0, Landroidx/media3/common/w;->l:Landroidx/media3/common/t0;

    .line 50
    .line 51
    iput-object v0, v2, Landroidx/media3/common/v;->k:Landroidx/media3/common/t0;

    .line 52
    .line 53
    iget v0, p0, Landroidx/media3/common/w;->h:I

    .line 54
    .line 55
    iput v0, v2, Landroidx/media3/common/v;->h:I

    .line 56
    .line 57
    iget v0, p0, Landroidx/media3/common/w;->i:I

    .line 58
    .line 59
    iput v0, v2, Landroidx/media3/common/v;->i:I

    .line 60
    .line 61
    iget v0, p0, Landroidx/media3/common/w;->u:I

    .line 62
    .line 63
    iput v0, v2, Landroidx/media3/common/v;->t:I

    .line 64
    .line 65
    iget v0, p0, Landroidx/media3/common/w;->v:I

    .line 66
    .line 67
    iput v0, v2, Landroidx/media3/common/v;->u:I

    .line 68
    .line 69
    iget v0, p0, Landroidx/media3/common/w;->w:F

    .line 70
    .line 71
    iput v0, v2, Landroidx/media3/common/v;->v:F

    .line 72
    .line 73
    iget v0, p0, Landroidx/media3/common/w;->e:I

    .line 74
    .line 75
    iput v0, v2, Landroidx/media3/common/v;->e:I

    .line 76
    .line 77
    iget p0, p0, Landroidx/media3/common/w;->f:I

    .line 78
    .line 79
    iput p0, v2, Landroidx/media3/common/v;->f:I

    .line 80
    .line 81
    new-instance p0, Landroidx/media3/common/w;

    .line 82
    .line 83
    invoke-direct {p0, v2}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 84
    .line 85
    .line 86
    return-object p0
.end method

.method private static synthetic lambda$selectTracks$0(Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->getTrackGroups()Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/media3/exoplayer/source/TrackGroupArray;->getTrackTypes()Lf6/m0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method


# virtual methods
.method public continueLoading(Landroidx/media3/exoplayer/LoadingInfo;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->trackGroups:Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->sampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 6
    .line 7
    array-length v0, p1

    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    if-ge v2, v0, :cond_0

    .line 11
    .line 12
    aget-object v3, p1, v2

    .line 13
    .line 14
    invoke-virtual {v3}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->continuePreparing()V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return v1

    .line 21
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->compositeSequenceableLoader:Landroidx/media3/exoplayer/source/SequenceableLoader;

    .line 22
    .line 23
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/source/SequenceableLoader;->continueLoading(Landroidx/media3/exoplayer/LoadingInfo;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
.end method

.method public discardBuffer(JZ)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->enabledSampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3, p1, p2, p3}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->discardBuffer(JZ)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method public getAdjustedSeekPositionUs(JLandroidx/media3/exoplayer/SeekParameters;)J
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->enabledSampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->isVideoSampleStream()Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    invoke-virtual {v3, p1, p2, p3}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->getAdjustedSeekPositionUs(JLandroidx/media3/exoplayer/SeekParameters;)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    return-wide p1

    .line 20
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return-wide p1
.end method

.method public getBufferedPositionUs()J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->compositeSequenceableLoader:Landroidx/media3/exoplayer/source/SequenceableLoader;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/media3/exoplayer/source/SequenceableLoader;->getBufferedPositionUs()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public getNextLoadPositionUs()J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->compositeSequenceableLoader:Landroidx/media3/exoplayer/source/SequenceableLoader;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/media3/exoplayer/source/SequenceableLoader;->getNextLoadPositionUs()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public getStreamKeys(Ljava/util/List;)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/media3/common/j1;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->playlistTracker:Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistTracker;

    .line 4
    .line 5
    invoke-interface {v1}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistTracker;->getMultivariantPlaylist()Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v2, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;->variants:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    xor-int/lit8 v3, v2, 0x1

    .line 19
    .line 20
    iget-object v4, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->sampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 21
    .line 22
    array-length v4, v4

    .line 23
    iget-object v5, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;->subtitles:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    sub-int/2addr v4, v5

    .line 30
    const/4 v5, 0x0

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->sampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 34
    .line 35
    aget-object v2, v2, v5

    .line 36
    .line 37
    iget-object v6, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->manifestUrlIndicesPerWrapper:[[I

    .line 38
    .line 39
    aget-object v6, v6, v5

    .line 40
    .line 41
    invoke-virtual {v2}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->getTrackGroups()Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-virtual {v2}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->getPrimaryTrackGroupIndex()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    new-array v6, v5, [I

    .line 51
    .line 52
    sget-object v7, Landroidx/media3/exoplayer/source/TrackGroupArray;->EMPTY:Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 53
    .line 54
    move v2, v5

    .line 55
    :goto_0
    new-instance v8, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    move v10, v5

    .line 65
    move v11, v10

    .line 66
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v12

    .line 70
    if-eqz v12, :cond_7

    .line 71
    .line 72
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v12

    .line 76
    check-cast v12, Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;

    .line 77
    .line 78
    invoke-interface {v12}, Landroidx/media3/exoplayer/trackselection/TrackSelection;->getTrackGroup()Landroidx/media3/common/q1;

    .line 79
    .line 80
    .line 81
    move-result-object v14

    .line 82
    invoke-virtual {v7, v14}, Landroidx/media3/exoplayer/source/TrackGroupArray;->indexOf(Landroidx/media3/common/q1;)I

    .line 83
    .line 84
    .line 85
    move-result v15

    .line 86
    const/4 v13, -0x1

    .line 87
    if-eq v15, v13, :cond_3

    .line 88
    .line 89
    if-ne v15, v2, :cond_2

    .line 90
    .line 91
    move v11, v5

    .line 92
    :goto_2
    invoke-interface {v12}, Landroidx/media3/exoplayer/trackselection/TrackSelection;->length()I

    .line 93
    .line 94
    .line 95
    move-result v13

    .line 96
    if-ge v11, v13, :cond_1

    .line 97
    .line 98
    invoke-interface {v12, v11}, Landroidx/media3/exoplayer/trackselection/TrackSelection;->getIndexInTrackGroup(I)I

    .line 99
    .line 100
    .line 101
    move-result v13

    .line 102
    aget v13, v6, v13

    .line 103
    .line 104
    new-instance v14, Landroidx/media3/common/j1;

    .line 105
    .line 106
    invoke-direct {v14, v5, v5, v13}, Landroidx/media3/common/j1;-><init>(III)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    add-int/lit8 v11, v11, 0x1

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_1
    move/from16 v17, v2

    .line 116
    .line 117
    const/4 v11, 0x1

    .line 118
    goto :goto_6

    .line 119
    :cond_2
    move/from16 v17, v2

    .line 120
    .line 121
    const/4 v10, 0x1

    .line 122
    goto :goto_6

    .line 123
    :cond_3
    move v15, v3

    .line 124
    :goto_3
    iget-object v5, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->sampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 125
    .line 126
    array-length v13, v5

    .line 127
    if-ge v15, v13, :cond_5

    .line 128
    .line 129
    aget-object v5, v5, v15

    .line 130
    .line 131
    invoke-virtual {v5}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->getTrackGroups()Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    invoke-virtual {v5, v14}, Landroidx/media3/exoplayer/source/TrackGroupArray;->indexOf(Landroidx/media3/common/q1;)I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    const/4 v13, -0x1

    .line 140
    if-eq v5, v13, :cond_6

    .line 141
    .line 142
    if-ge v15, v4, :cond_4

    .line 143
    .line 144
    const/4 v13, 0x1

    .line 145
    goto :goto_4

    .line 146
    :cond_4
    const/4 v13, 0x2

    .line 147
    :goto_4
    iget-object v5, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->manifestUrlIndicesPerWrapper:[[I

    .line 148
    .line 149
    aget-object v5, v5, v15

    .line 150
    .line 151
    const/4 v14, 0x0

    .line 152
    :goto_5
    invoke-interface {v12}, Landroidx/media3/exoplayer/trackselection/TrackSelection;->length()I

    .line 153
    .line 154
    .line 155
    move-result v15

    .line 156
    if-ge v14, v15, :cond_5

    .line 157
    .line 158
    invoke-interface {v12, v14}, Landroidx/media3/exoplayer/trackselection/TrackSelection;->getIndexInTrackGroup(I)I

    .line 159
    .line 160
    .line 161
    move-result v15

    .line 162
    aget v15, v5, v15

    .line 163
    .line 164
    new-instance v0, Landroidx/media3/common/j1;

    .line 165
    .line 166
    move/from16 v17, v2

    .line 167
    .line 168
    const/4 v2, 0x0

    .line 169
    invoke-direct {v0, v2, v13, v15}, Landroidx/media3/common/j1;-><init>(III)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    add-int/lit8 v14, v14, 0x1

    .line 176
    .line 177
    move-object/from16 v0, p0

    .line 178
    .line 179
    move/from16 v2, v17

    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_5
    move/from16 v17, v2

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_6
    move/from16 v17, v2

    .line 186
    .line 187
    add-int/lit8 v15, v15, 0x1

    .line 188
    .line 189
    move-object/from16 v0, p0

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :goto_6
    move-object/from16 v0, p0

    .line 193
    .line 194
    move/from16 v2, v17

    .line 195
    .line 196
    const/4 v5, 0x0

    .line 197
    goto/16 :goto_1

    .line 198
    .line 199
    :cond_7
    if-eqz v10, :cond_a

    .line 200
    .line 201
    if-nez v11, :cond_a

    .line 202
    .line 203
    const/16 v16, 0x0

    .line 204
    .line 205
    aget v0, v6, v16

    .line 206
    .line 207
    iget-object v2, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;->variants:Ljava/util/List;

    .line 208
    .line 209
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    check-cast v2, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;

    .line 214
    .line 215
    iget-object v2, v2, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->format:Landroidx/media3/common/w;

    .line 216
    .line 217
    iget v2, v2, Landroidx/media3/common/w;->j:I

    .line 218
    .line 219
    const/4 v13, 0x1

    .line 220
    :goto_7
    array-length v3, v6

    .line 221
    if-ge v13, v3, :cond_9

    .line 222
    .line 223
    iget-object v3, v1, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist;->variants:Ljava/util/List;

    .line 224
    .line 225
    aget v4, v6, v13

    .line 226
    .line 227
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    check-cast v3, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;

    .line 232
    .line 233
    iget-object v3, v3, Landroidx/media3/exoplayer/hls/playlist/HlsMultivariantPlaylist$Variant;->format:Landroidx/media3/common/w;

    .line 234
    .line 235
    iget v3, v3, Landroidx/media3/common/w;->j:I

    .line 236
    .line 237
    if-ge v3, v2, :cond_8

    .line 238
    .line 239
    aget v0, v6, v13

    .line 240
    .line 241
    move v2, v3

    .line 242
    :cond_8
    add-int/lit8 v13, v13, 0x1

    .line 243
    .line 244
    goto :goto_7

    .line 245
    :cond_9
    new-instance v1, Landroidx/media3/common/j1;

    .line 246
    .line 247
    const/4 v2, 0x0

    .line 248
    invoke-direct {v1, v2, v2, v0}, Landroidx/media3/common/j1;-><init>(III)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    :cond_a
    return-object v8
.end method

.method public getTrackGroups()Landroidx/media3/exoplayer/source/TrackGroupArray;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->trackGroups:Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public isLoading()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->compositeSequenceableLoader:Landroidx/media3/exoplayer/source/SequenceableLoader;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/media3/exoplayer/source/SequenceableLoader;->isLoading()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public maybeThrowPrepareError()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->sampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->maybeThrowPrepareError()V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method public onPlaylistChanged()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->sampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->onPlaylistUpdated()V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->mediaPeriodCallback:Landroidx/media3/exoplayer/source/MediaPeriod$Callback;

    .line 16
    .line 17
    invoke-interface {v0, p0}, Landroidx/media3/exoplayer/source/SequenceableLoader$Callback;->onContinueLoadingRequested(Landroidx/media3/exoplayer/source/SequenceableLoader;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onPlaylistError(Landroid/net/Uri;Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy$LoadErrorInfo;Z)Z
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->sampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    :goto_0
    if-ge v3, v1, :cond_0

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    invoke-virtual {v4, p1, p2, p3}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->onPlaylistError(Landroid/net/Uri;Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy$LoadErrorInfo;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    and-int/2addr v2, v4

    .line 15
    add-int/lit8 v3, v3, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->mediaPeriodCallback:Landroidx/media3/exoplayer/source/MediaPeriod$Callback;

    .line 19
    .line 20
    invoke-interface {p1, p0}, Landroidx/media3/exoplayer/source/SequenceableLoader$Callback;->onContinueLoadingRequested(Landroidx/media3/exoplayer/source/SequenceableLoader;)V

    .line 21
    .line 22
    .line 23
    return v2
.end method

.method public prepare(Landroidx/media3/exoplayer/source/MediaPeriod$Callback;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->mediaPeriodCallback:Landroidx/media3/exoplayer/source/MediaPeriod$Callback;

    .line 2
    .line 3
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->playlistTracker:Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistTracker;

    .line 4
    .line 5
    invoke-interface {p1, p0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistTracker;->addListener(Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistTracker$PlaylistEventListener;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p2, p3}, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->buildAndPrepareSampleStreamWrappers(J)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public readDiscontinuity()J
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide v0
.end method

.method public reevaluateBuffer(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->compositeSequenceableLoader:Landroidx/media3/exoplayer/source/SequenceableLoader;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Landroidx/media3/exoplayer/source/SequenceableLoader;->reevaluateBuffer(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public release()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->playlistTracker:Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistTracker;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistTracker;->removeListener(Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistTracker$PlaylistEventListener;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->sampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_0

    .line 11
    .line 12
    aget-object v3, v0, v2

    .line 13
    .line 14
    invoke-virtual {v3}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->release()V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->mediaPeriodCallback:Landroidx/media3/exoplayer/source/MediaPeriod$Callback;

    .line 22
    .line 23
    return-void
.end method

.method public seekToUs(J)J
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->enabledSampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-lez v1, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aget-object v0, v0, v1

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, v1}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->seekToUs(JZ)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    :goto_0
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->enabledSampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 15
    .line 16
    array-length v3, v2

    .line 17
    if-ge v1, v3, :cond_0

    .line 18
    .line 19
    aget-object v2, v2, v1

    .line 20
    .line 21
    invoke-virtual {v2, p1, p2, v0}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->seekToUs(JZ)Z

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->timestampAdjusterProvider:Landroidx/media3/exoplayer/hls/TimestampAdjusterProvider;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/media3/exoplayer/hls/TimestampAdjusterProvider;->reset()V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-wide p1
.end method

.method public selectTracks([Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;[Z[Landroidx/media3/exoplayer/source/SampleStream;[ZJ)J
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    new-array v3, v3, [I

    .line 9
    .line 10
    array-length v4, v1

    .line 11
    new-array v4, v4, [I

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    :goto_0
    array-length v7, v1

    .line 15
    if-ge v6, v7, :cond_3

    .line 16
    .line 17
    aget-object v7, v2, v6

    .line 18
    .line 19
    const/4 v8, -0x1

    .line 20
    if-nez v7, :cond_0

    .line 21
    .line 22
    move v7, v8

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object v9, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->streamWrapperIndices:Ljava/util/IdentityHashMap;

    .line 25
    .line 26
    invoke-virtual {v9, v7}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    check-cast v7, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    :goto_1
    aput v7, v3, v6

    .line 37
    .line 38
    aput v8, v4, v6

    .line 39
    .line 40
    aget-object v7, v1, v6

    .line 41
    .line 42
    if-eqz v7, :cond_2

    .line 43
    .line 44
    invoke-interface {v7}, Landroidx/media3/exoplayer/trackselection/TrackSelection;->getTrackGroup()Landroidx/media3/common/q1;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    const/4 v9, 0x0

    .line 49
    :goto_2
    iget-object v10, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->sampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 50
    .line 51
    array-length v11, v10

    .line 52
    if-ge v9, v11, :cond_2

    .line 53
    .line 54
    aget-object v10, v10, v9

    .line 55
    .line 56
    invoke-virtual {v10}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->getTrackGroups()Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    invoke-virtual {v10, v7}, Landroidx/media3/exoplayer/source/TrackGroupArray;->indexOf(Landroidx/media3/common/q1;)I

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    if-eq v10, v8, :cond_1

    .line 65
    .line 66
    aput v9, v4, v6

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    iget-object v6, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->streamWrapperIndices:Ljava/util/IdentityHashMap;

    .line 76
    .line 77
    invoke-virtual {v6}, Ljava/util/IdentityHashMap;->clear()V

    .line 78
    .line 79
    .line 80
    array-length v6, v1

    .line 81
    new-array v7, v6, [Landroidx/media3/exoplayer/source/SampleStream;

    .line 82
    .line 83
    array-length v8, v1

    .line 84
    new-array v12, v8, [Landroidx/media3/exoplayer/source/SampleStream;

    .line 85
    .line 86
    array-length v8, v1

    .line 87
    new-array v10, v8, [Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;

    .line 88
    .line 89
    iget-object v8, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->sampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 90
    .line 91
    array-length v8, v8

    .line 92
    new-array v8, v8, [Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 93
    .line 94
    const/4 v9, 0x0

    .line 95
    const/4 v11, 0x0

    .line 96
    const/16 v16, 0x0

    .line 97
    .line 98
    :goto_4
    iget-object v13, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->sampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 99
    .line 100
    array-length v13, v13

    .line 101
    if-ge v9, v13, :cond_10

    .line 102
    .line 103
    const/4 v13, 0x0

    .line 104
    :goto_5
    array-length v14, v1

    .line 105
    if-ge v13, v14, :cond_6

    .line 106
    .line 107
    aget v14, v3, v13

    .line 108
    .line 109
    const/4 v15, 0x0

    .line 110
    if-ne v14, v9, :cond_4

    .line 111
    .line 112
    aget-object v14, v2, v13

    .line 113
    .line 114
    goto :goto_6

    .line 115
    :cond_4
    move-object v14, v15

    .line 116
    :goto_6
    aput-object v14, v12, v13

    .line 117
    .line 118
    aget v14, v4, v13

    .line 119
    .line 120
    if-ne v14, v9, :cond_5

    .line 121
    .line 122
    aget-object v15, v1, v13

    .line 123
    .line 124
    :cond_5
    aput-object v15, v10, v13

    .line 125
    .line 126
    add-int/lit8 v13, v13, 0x1

    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_6
    iget-object v13, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->sampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 130
    .line 131
    aget-object v13, v13, v9

    .line 132
    .line 133
    move-wide/from16 v14, p5

    .line 134
    .line 135
    move-object/from16 v18, v3

    .line 136
    .line 137
    move v3, v9

    .line 138
    move v5, v11

    .line 139
    move-object v9, v13

    .line 140
    const/16 v17, 0x0

    .line 141
    .line 142
    move-object/from16 v11, p2

    .line 143
    .line 144
    move-object/from16 v13, p4

    .line 145
    .line 146
    invoke-virtual/range {v9 .. v16}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->selectTracks([Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;[Z[Landroidx/media3/exoplayer/source/SampleStream;[ZJZ)Z

    .line 147
    .line 148
    .line 149
    move-result v19

    .line 150
    move/from16 v11, v17

    .line 151
    .line 152
    move v13, v11

    .line 153
    :goto_7
    array-length v14, v1

    .line 154
    if-ge v11, v14, :cond_a

    .line 155
    .line 156
    aget-object v14, v12, v11

    .line 157
    .line 158
    aget v15, v4, v11

    .line 159
    .line 160
    if-ne v15, v3, :cond_7

    .line 161
    .line 162
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    aput-object v14, v7, v11

    .line 166
    .line 167
    iget-object v13, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->streamWrapperIndices:Ljava/util/IdentityHashMap;

    .line 168
    .line 169
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v15

    .line 173
    invoke-virtual {v13, v14, v15}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    const/4 v13, 0x1

    .line 177
    goto :goto_9

    .line 178
    :cond_7
    aget v15, v18, v11

    .line 179
    .line 180
    if-ne v15, v3, :cond_9

    .line 181
    .line 182
    if-nez v14, :cond_8

    .line 183
    .line 184
    const/4 v15, 0x1

    .line 185
    goto :goto_8

    .line 186
    :cond_8
    move/from16 v15, v17

    .line 187
    .line 188
    :goto_8
    invoke-static {v15}, Lh1/a;->j(Z)V

    .line 189
    .line 190
    .line 191
    :cond_9
    :goto_9
    add-int/lit8 v11, v11, 0x1

    .line 192
    .line 193
    goto :goto_7

    .line 194
    :cond_a
    if-eqz v13, :cond_e

    .line 195
    .line 196
    aput-object v9, v8, v5

    .line 197
    .line 198
    add-int/lit8 v11, v5, 0x1

    .line 199
    .line 200
    if-nez v5, :cond_c

    .line 201
    .line 202
    const/4 v5, 0x1

    .line 203
    invoke-virtual {v9, v5}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->setIsPrimaryTimestampSource(Z)V

    .line 204
    .line 205
    .line 206
    if-nez v19, :cond_b

    .line 207
    .line 208
    iget-object v13, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->enabledSampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 209
    .line 210
    array-length v14, v13

    .line 211
    if-eqz v14, :cond_b

    .line 212
    .line 213
    aget-object v13, v13, v17

    .line 214
    .line 215
    if-eq v9, v13, :cond_f

    .line 216
    .line 217
    :cond_b
    iget-object v9, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->timestampAdjusterProvider:Landroidx/media3/exoplayer/hls/TimestampAdjusterProvider;

    .line 218
    .line 219
    invoke-virtual {v9}, Landroidx/media3/exoplayer/hls/TimestampAdjusterProvider;->reset()V

    .line 220
    .line 221
    .line 222
    move/from16 v16, v5

    .line 223
    .line 224
    goto :goto_b

    .line 225
    :cond_c
    const/4 v5, 0x1

    .line 226
    iget v13, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->audioVideoSampleStreamWrapperCount:I

    .line 227
    .line 228
    if-ge v3, v13, :cond_d

    .line 229
    .line 230
    move v15, v5

    .line 231
    goto :goto_a

    .line 232
    :cond_d
    move/from16 v15, v17

    .line 233
    .line 234
    :goto_a
    invoke-virtual {v9, v15}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->setIsPrimaryTimestampSource(Z)V

    .line 235
    .line 236
    .line 237
    goto :goto_b

    .line 238
    :cond_e
    move v11, v5

    .line 239
    :cond_f
    :goto_b
    add-int/lit8 v9, v3, 0x1

    .line 240
    .line 241
    move-object/from16 v3, v18

    .line 242
    .line 243
    goto/16 :goto_4

    .line 244
    .line 245
    :cond_10
    move v5, v11

    .line 246
    const/4 v3, 0x0

    .line 247
    invoke-static {v7, v3, v2, v3, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 248
    .line 249
    .line 250
    invoke-static {v5, v8}, Lh1/i0;->U(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    check-cast v1, [Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 255
    .line 256
    iput-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->enabledSampleStreamWrappers:[Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 257
    .line 258
    invoke-static {v1}, Lf6/m0;->k([Ljava/lang/Object;)Lf6/l1;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->compositeSequenceableLoaderFactory:Landroidx/media3/exoplayer/source/CompositeSequenceableLoaderFactory;

    .line 263
    .line 264
    new-instance v3, Landroidx/media3/exoplayer/hls/a;

    .line 265
    .line 266
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 267
    .line 268
    .line 269
    invoke-static {v3, v1}, Lf6/u;->u(Le6/d;Ljava/util/List;)Ljava/util/AbstractList;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    invoke-interface {v2, v1, v3}, Landroidx/media3/exoplayer/source/CompositeSequenceableLoaderFactory;->create(Ljava/util/List;Ljava/util/List;)Landroidx/media3/exoplayer/source/SequenceableLoader;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    iput-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaPeriod;->compositeSequenceableLoader:Landroidx/media3/exoplayer/source/SequenceableLoader;

    .line 278
    .line 279
    return-wide p5
.end method
