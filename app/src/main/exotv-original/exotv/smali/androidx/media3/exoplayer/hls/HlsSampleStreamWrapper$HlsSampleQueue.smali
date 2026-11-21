.class final Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper$HlsSampleQueue;
.super Landroidx/media3/exoplayer/source/SampleQueue;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "HlsSampleQueue"
.end annotation


# instance fields
.field private drmInitData:Landroidx/media3/common/s;

.field private final overridingDrmInitData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/media3/common/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroidx/media3/exoplayer/upstream/Allocator;Landroidx/media3/exoplayer/drm/DrmSessionManager;Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/exoplayer/upstream/Allocator;",
            "Landroidx/media3/exoplayer/drm/DrmSessionManager;",
            "Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/media3/common/s;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/exoplayer/source/SampleQueue;-><init>(Landroidx/media3/exoplayer/upstream/Allocator;Landroidx/media3/exoplayer/drm/DrmSessionManager;Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;)V

    .line 3
    iput-object p4, p0, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper$HlsSampleQueue;->overridingDrmInitData:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/media3/exoplayer/upstream/Allocator;Landroidx/media3/exoplayer/drm/DrmSessionManager;Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;Ljava/util/Map;Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper$HlsSampleQueue;-><init>(Landroidx/media3/exoplayer/upstream/Allocator;Landroidx/media3/exoplayer/drm/DrmSessionManager;Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;Ljava/util/Map;)V

    return-void
.end method

.method private getAdjustedMetadata(Landroidx/media3/common/t0;)Landroidx/media3/common/t0;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    iget-object v1, p1, Landroidx/media3/common/t0;->j:[Landroidx/media3/common/s0;

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    const/4 v3, 0x0

    .line 9
    move v4, v3

    .line 10
    :goto_0
    const/4 v5, -0x1

    .line 11
    if-ge v4, v2, :cond_2

    .line 12
    .line 13
    aget-object v6, v1, v4

    .line 14
    .line 15
    instance-of v7, v6, Lb2/n;

    .line 16
    .line 17
    if-eqz v7, :cond_1

    .line 18
    .line 19
    check-cast v6, Lb2/n;

    .line 20
    .line 21
    const-string v7, "com.apple.streaming.transportStreamTimestamp"

    .line 22
    .line 23
    iget-object v6, v6, Lb2/n;->k:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-eqz v6, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    move v4, v5

    .line 36
    :goto_1
    if-ne v4, v5, :cond_3

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_3
    const/4 p1, 0x1

    .line 40
    if-ne v2, p1, :cond_4

    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_4
    add-int/lit8 p1, v2, -0x1

    .line 44
    .line 45
    new-array p1, p1, [Landroidx/media3/common/s0;

    .line 46
    .line 47
    :goto_2
    if-ge v3, v2, :cond_7

    .line 48
    .line 49
    if-eq v3, v4, :cond_6

    .line 50
    .line 51
    if-ge v3, v4, :cond_5

    .line 52
    .line 53
    move v0, v3

    .line 54
    goto :goto_3

    .line 55
    :cond_5
    add-int/lit8 v0, v3, -0x1

    .line 56
    .line 57
    :goto_3
    aget-object v5, v1, v3

    .line 58
    .line 59
    aput-object v5, p1, v0

    .line 60
    .line 61
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_7
    new-instance v0, Landroidx/media3/common/t0;

    .line 65
    .line 66
    invoke-direct {v0, p1}, Landroidx/media3/common/t0;-><init>([Landroidx/media3/common/s0;)V

    .line 67
    .line 68
    .line 69
    return-object v0
.end method


# virtual methods
.method public getAdjustedUpstreamFormat(Landroidx/media3/common/w;)Landroidx/media3/common/w;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper$HlsSampleQueue;->drmInitData:Landroidx/media3/common/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p1, Landroidx/media3/common/w;->r:Landroidx/media3/common/s;

    .line 7
    .line 8
    :goto_0
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper$HlsSampleQueue;->overridingDrmInitData:Ljava/util/Map;

    .line 11
    .line 12
    iget-object v2, v0, Landroidx/media3/common/s;->l:Ljava/lang/String;

    .line 13
    .line 14
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Landroidx/media3/common/s;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    move-object v0, v1

    .line 23
    :cond_1
    iget-object v1, p1, Landroidx/media3/common/w;->l:Landroidx/media3/common/t0;

    .line 24
    .line 25
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper$HlsSampleQueue;->getAdjustedMetadata(Landroidx/media3/common/t0;)Landroidx/media3/common/t0;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v2, p1, Landroidx/media3/common/w;->r:Landroidx/media3/common/s;

    .line 30
    .line 31
    if-ne v0, v2, :cond_2

    .line 32
    .line 33
    iget-object v2, p1, Landroidx/media3/common/w;->l:Landroidx/media3/common/t0;

    .line 34
    .line 35
    if-eq v1, v2, :cond_3

    .line 36
    .line 37
    :cond_2
    invoke-virtual {p1}, Landroidx/media3/common/w;->a()Landroidx/media3/common/v;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object v0, p1, Landroidx/media3/common/v;->q:Landroidx/media3/common/s;

    .line 42
    .line 43
    iput-object v1, p1, Landroidx/media3/common/v;->k:Landroidx/media3/common/t0;

    .line 44
    .line 45
    new-instance v0, Landroidx/media3/common/w;

    .line 46
    .line 47
    invoke-direct {v0, p1}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 48
    .line 49
    .line 50
    move-object p1, v0

    .line 51
    :cond_3
    invoke-super {p0, p1}, Landroidx/media3/exoplayer/source/SampleQueue;->getAdjustedUpstreamFormat(Landroidx/media3/common/w;)Landroidx/media3/common/w;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1
.end method

.method public sampleData(Landroidx/media3/common/m;IZ)I
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-interface {p0, p1, p2, p3, v0}, Ln1/i0;->sampleData(Landroidx/media3/common/m;IZI)I

    move-result p1

    return p1
.end method

.method public sampleData(Lh1/w;I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, p1, p2, v0}, Ln1/i0;->sampleData(Lh1/w;II)V

    return-void
.end method

.method public sampleMetadata(JIIILn1/h0;)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p6}, Landroidx/media3/exoplayer/source/SampleQueue;->sampleMetadata(JIIILn1/h0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setDrmInitData(Landroidx/media3/common/s;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper$HlsSampleQueue;->drmInitData:Landroidx/media3/common/s;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/exoplayer/source/SampleQueue;->invalidateUpstreamFormatAdjustment()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setSourceChunk(Landroidx/media3/exoplayer/hls/HlsMediaChunk;)V
    .locals 2

    .line 1
    iget p1, p1, Landroidx/media3/exoplayer/hls/HlsMediaChunk;->uid:I

    .line 2
    .line 3
    int-to-long v0, p1

    .line 4
    invoke-virtual {p0, v0, v1}, Landroidx/media3/exoplayer/source/SampleQueue;->sourceId(J)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
