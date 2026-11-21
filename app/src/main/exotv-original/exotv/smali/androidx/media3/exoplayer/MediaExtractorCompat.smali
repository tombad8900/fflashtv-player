.class public final Landroidx/media3/exoplayer/MediaExtractorCompat;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;,
        Landroidx/media3/exoplayer/MediaExtractorCompat$ExtractorOutputImpl;,
        Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;,
        Landroidx/media3/exoplayer/MediaExtractorCompat$SeekMode;
    }
.end annotation


# static fields
.field public static final SEEK_TO_CLOSEST_SYNC:I = 0x2

.field public static final SEEK_TO_NEXT_SYNC:I = 0x1

.field public static final SEEK_TO_PREVIOUS_SYNC:I = 0x0

.field private static final TAG:Ljava/lang/String; = "MediaExtractorCompat"


# instance fields
.field private final allocator:Landroidx/media3/exoplayer/upstream/Allocator;

.field private currentDataSource:Lk1/h;

.field private currentExtractor:Ln1/n;

.field private currentExtractorInput:Ln1/o;

.field private final dataSourceFactory:Lk1/g;

.field private final extractorsFactory:Ln1/q;

.field private final formatHolder:Landroidx/media3/exoplayer/FormatHolder;

.field private hasBeenPrepared:Z

.field private httpRequestHeaders:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final noDataBuffer:Lm1/g;

.field private offsetInCurrentFile:J

.field private pendingSeek:Ln1/d0;

.field private final positionHolder:Ln1/a0;

.field private final sampleHolderWithBufferReplacementDirect:Lm1/g;

.field private final sampleHolderWithBufferReplacementDisabled:Lm1/g;

.field private final sampleQueues:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;",
            ">;"
        }
    .end annotation
.end field

.field private seekMap:Ln1/c0;

.field private final selectedTrackIndices:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final trackIndicesPerSampleInQueuedOrder:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final tracks:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;",
            ">;"
        }
    .end annotation
.end field

.field private tracksEnded:Z

.field private upstreamFormatsCount:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    new-instance v0, Ln1/l;

    invoke-direct {v0}, Ln1/l;-><init>()V

    new-instance v1, La1/e;

    invoke-direct {v1, p1}, La1/e;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/MediaExtractorCompat;-><init>(Ln1/q;Lk1/g;)V

    return-void
.end method

.method public constructor <init>(Ln1/q;Lk1/g;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->extractorsFactory:Ln1/q;

    .line 4
    iput-object p2, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->dataSourceFactory:Lk1/g;

    .line 5
    new-instance p1, Ln1/a0;

    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->positionHolder:Ln1/a0;

    .line 8
    new-instance p1, Landroidx/media3/exoplayer/upstream/DefaultAllocator;

    const/4 p2, 0x1

    const/high16 v0, 0x10000

    invoke-direct {p1, p2, v0}, Landroidx/media3/exoplayer/upstream/DefaultAllocator;-><init>(ZI)V

    iput-object p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->allocator:Landroidx/media3/exoplayer/upstream/Allocator;

    .line 9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->tracks:Ljava/util/ArrayList;

    .line 10
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->sampleQueues:Landroid/util/SparseArray;

    .line 11
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->trackIndicesPerSampleInQueuedOrder:Ljava/util/ArrayDeque;

    .line 12
    new-instance p1, Landroidx/media3/exoplayer/FormatHolder;

    invoke-direct {p1}, Landroidx/media3/exoplayer/FormatHolder;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->formatHolder:Landroidx/media3/exoplayer/FormatHolder;

    .line 13
    new-instance p1, Lm1/g;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lm1/g;-><init>(I)V

    iput-object p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->sampleHolderWithBufferReplacementDisabled:Lm1/g;

    .line 14
    new-instance p1, Lm1/g;

    const/4 p2, 0x2

    invoke-direct {p1, p2}, Lm1/g;-><init>(I)V

    iput-object p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->sampleHolderWithBufferReplacementDirect:Lm1/g;

    .line 15
    invoke-static {}, Lm1/g;->newNoDataInstance()Lm1/g;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->noDataBuffer:Lm1/g;

    .line 16
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->selectedTrackIndices:Ljava/util/Set;

    return-void
.end method

.method public static synthetic a(Ln1/n;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/MediaExtractorCompat;->lambda$selectExtractor$0(Ln1/n;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$200(Landroidx/media3/exoplayer/MediaExtractorCompat;)Landroid/util/SparseArray;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->sampleQueues:Landroid/util/SparseArray;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$300(Landroidx/media3/exoplayer/MediaExtractorCompat;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->tracksEnded:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$302(Landroidx/media3/exoplayer/MediaExtractorCompat;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->tracksEnded:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$400(Landroidx/media3/exoplayer/MediaExtractorCompat;)Landroidx/media3/exoplayer/upstream/Allocator;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->allocator:Landroidx/media3/exoplayer/upstream/Allocator;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$502(Landroidx/media3/exoplayer/MediaExtractorCompat;Ln1/c0;)Ln1/c0;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->seekMap:Ln1/c0;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$600(Landroidx/media3/exoplayer/MediaExtractorCompat;Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;Landroidx/media3/common/w;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/MediaExtractorCompat;->onSampleQueueFormatInitialized(Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;Landroidx/media3/common/w;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$700(Landroidx/media3/exoplayer/MediaExtractorCompat;)Ljava/util/ArrayDeque;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->trackIndicesPerSampleInQueuedOrder:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    return-object p0
.end method

.method private advanceToSampleOrEndOfInput()Z
    .locals 8
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "trackIndicesPerSampleInQueuedOrder.peekFirst()"
        }
        result = true
    .end annotation

    .line 1
    const-string v0, "Treating exception as the end of input."

    .line 2
    .line 3
    const-string v1, "MediaExtractorCompat"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/MediaExtractorCompat;->maybeResolvePendingSeek()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    .line 7
    .line 8
    .line 9
    move v3, v2

    .line 10
    :cond_0
    :goto_0
    iget-object v4, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->trackIndicesPerSampleInQueuedOrder:Ljava/util/ArrayDeque;

    .line 11
    .line 12
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    const/4 v5, 0x1

    .line 17
    if-nez v4, :cond_2

    .line 18
    .line 19
    iget-object v4, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->selectedTrackIndices:Ljava/util/Set;

    .line 20
    .line 21
    iget-object v6, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->trackIndicesPerSampleInQueuedOrder:Ljava/util/ArrayDeque;

    .line 22
    .line 23
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    invoke-interface {v4, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    return v5

    .line 34
    :cond_1
    invoke-direct {p0}, Landroidx/media3/exoplayer/MediaExtractorCompat;->skipOneSample()V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    if-nez v3, :cond_4

    .line 39
    .line 40
    :try_start_1
    iget-object v4, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->currentExtractor:Ln1/n;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object v6, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->currentExtractorInput:Ln1/o;

    .line 46
    .line 47
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object v7, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->positionHolder:Ln1/a0;

    .line 51
    .line 52
    invoke-interface {v4, v6, v7}, Ln1/n;->read(Ln1/o;Ln1/a0;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    const/4 v6, -0x1

    .line 57
    if-ne v4, v6, :cond_3

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    if-ne v4, v5, :cond_0

    .line 61
    .line 62
    iget-object v4, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->positionHolder:Ln1/a0;

    .line 63
    .line 64
    iget-wide v6, v4, Ln1/a0;->a:J

    .line 65
    .line 66
    invoke-direct {p0, v6, v7}, Landroidx/media3/exoplayer/MediaExtractorCompat;->reopenCurrentDataSource(J)Ln1/o;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    iput-object v4, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->currentExtractorInput:Ln1/o;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catch_0
    move-exception v3

    .line 74
    goto :goto_1

    .line 75
    :catch_1
    move-exception v3

    .line 76
    :goto_1
    invoke-static {v1, v0, v3}, Lh1/a;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    :goto_2
    move v3, v5

    .line 80
    goto :goto_0

    .line 81
    :cond_4
    return v2

    .line 82
    :catch_2
    move-exception v3

    .line 83
    invoke-static {v1, v0, v3}, Lh1/a;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    return v2
.end method

.method private buildDataSpec(Landroid/net/Uri;J)Lk1/l;
    .locals 13

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->httpRequestHeaders:Ljava/util/Map;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v6, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v6, v0

    .line 10
    :goto_0
    const-string v0, "The uri must be set."

    .line 11
    .line 12
    invoke-static {v0, p1}, Lh1/a;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lk1/l;

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    const/4 v5, 0x0

    .line 19
    const-wide/16 v9, -0x1

    .line 20
    .line 21
    const/4 v11, 0x0

    .line 22
    const/4 v12, 0x6

    .line 23
    move-object v3, p1

    .line 24
    move-wide v7, p2

    .line 25
    invoke-direct/range {v2 .. v12}, Lk1/l;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    return-object v2
.end method

.method private static synthetic lambda$selectExtractor$0(Ln1/n;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-interface {p0}, Ln1/n;->getUnderlyingImplementation()Ln1/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method private maybeResolvePendingSeek()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->pendingSeek:Ln1/d0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-wide v1, v0, Ln1/d0;->b:J

    .line 10
    .line 11
    iget-object v3, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->currentExtractor:Ln1/n;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-wide v4, v0, Ln1/d0;->a:J

    .line 17
    .line 18
    invoke-interface {v3, v1, v2, v4, v5}, Ln1/n;->seek(JJ)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, v1, v2}, Landroidx/media3/exoplayer/MediaExtractorCompat;->reopenCurrentDataSource(J)Ln1/o;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->currentExtractorInput:Ln1/o;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    iput-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->pendingSeek:Ln1/d0;

    .line 29
    .line 30
    return-void
.end method

.method private onSampleQueueFormatInitialized(Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;Landroidx/media3/common/w;)V
    .locals 5

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->upstreamFormatsCount:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->upstreamFormatsCount:I

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->tracks:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;->setMainTrackIndex(I)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->tracks:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v2, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct {v2, p1, v3, v4, v4}, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;-><init>(Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;ZLjava/lang/String;Landroidx/media3/exoplayer/MediaExtractorCompat$1;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-static {p2}, Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil;->getAlternativeCodecMimeType(Landroidx/media3/common/w;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    if-eqz p2, :cond_0

    .line 33
    .line 34
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->tracks:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;->setCompatibilityTrackIndex(I)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->tracks:Ljava/util/ArrayList;

    .line 44
    .line 45
    new-instance v2, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;

    .line 46
    .line 47
    invoke-direct {v2, p1, v1, p2, v4}, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;-><init>(Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;ZLjava/lang/String;Landroidx/media3/exoplayer/MediaExtractorCompat$1;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void
.end method

.method private peekNextSelectedTrackSample(Lm1/g;Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->tracks:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->trackIndicesPerSampleInQueuedOrder:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;

    .line 23
    .line 24
    iget-object v0, v0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;->sampleQueue:Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    const/4 p2, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move p2, v1

    .line 32
    :goto_0
    const/4 v2, 0x1

    .line 33
    or-int/2addr p2, v2

    .line 34
    iget-object v3, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->formatHolder:Landroidx/media3/exoplayer/FormatHolder;

    .line 35
    .line 36
    invoke-virtual {v0, v3, p1, p2, v1}, Landroidx/media3/exoplayer/source/SampleQueue;->read(Landroidx/media3/exoplayer/FormatHolder;Lm1/g;IZ)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const/4 v4, -0x5

    .line 41
    if-ne v3, v4, :cond_1

    .line 42
    .line 43
    iget-object v3, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->formatHolder:Landroidx/media3/exoplayer/FormatHolder;

    .line 44
    .line 45
    invoke-virtual {v0, v3, p1, p2, v1}, Landroidx/media3/exoplayer/source/SampleQueue;->read(Landroidx/media3/exoplayer/FormatHolder;Lm1/g;IZ)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    :cond_1
    iget-object p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->formatHolder:Landroidx/media3/exoplayer/FormatHolder;

    .line 50
    .line 51
    invoke-virtual {p1}, Landroidx/media3/exoplayer/FormatHolder;->clear()V

    .line 52
    .line 53
    .line 54
    const/4 p1, -0x4

    .line 55
    if-ne v3, p1, :cond_2

    .line 56
    .line 57
    move v1, v2

    .line 58
    :cond_2
    invoke-static {v1}, Lh1/a;->j(Z)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method private prepareDataSource(Lk1/h;Lk1/l;)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->hasBeenPrepared:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean v1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->hasBeenPrepared:Z

    .line 9
    .line 10
    iget-wide v2, p2, Lk1/l;->e:J

    .line 11
    .line 12
    iput-wide v2, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->offsetInCurrentFile:J

    .line 13
    .line 14
    iput-object p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->currentDataSource:Lk1/h;

    .line 15
    .line 16
    invoke-interface {p1, p2}, Lk1/h;->open(Lk1/l;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v8

    .line 20
    new-instance v4, Ln1/k;

    .line 21
    .line 22
    iget-object v5, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->currentDataSource:Lk1/h;

    .line 23
    .line 24
    const-wide/16 v6, 0x0

    .line 25
    .line 26
    invoke-direct/range {v4 .. v9}, Ln1/k;-><init>(Landroidx/media3/common/m;JJ)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v4}, Landroidx/media3/exoplayer/MediaExtractorCompat;->selectExtractor(Ln1/o;)Ln1/n;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance p2, Landroidx/media3/exoplayer/MediaExtractorCompat$ExtractorOutputImpl;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-direct {p2, p0, v0}, Landroidx/media3/exoplayer/MediaExtractorCompat$ExtractorOutputImpl;-><init>(Landroidx/media3/exoplayer/MediaExtractorCompat;Landroidx/media3/exoplayer/MediaExtractorCompat$1;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p1, p2}, Ln1/n;->init(Ln1/p;)V

    .line 40
    .line 41
    .line 42
    move p2, v1

    .line 43
    :goto_0
    if-eqz p2, :cond_6

    .line 44
    .line 45
    const/4 p2, -0x1

    .line 46
    :try_start_0
    iget-object v2, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->positionHolder:Ln1/a0;

    .line 47
    .line 48
    invoke-interface {p1, v4, v2}, Ln1/n;->read(Ln1/o;Ln1/a0;)I

    .line 49
    .line 50
    .line 51
    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    goto :goto_2

    .line 53
    :catch_0
    move-exception v0

    .line 54
    goto :goto_1

    .line 55
    :catch_1
    move-exception v0

    .line 56
    :goto_1
    move v2, p2

    .line 57
    :goto_2
    iget-boolean v3, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->tracksEnded:Z

    .line 58
    .line 59
    if-eqz v3, :cond_1

    .line 60
    .line 61
    iget v3, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->upstreamFormatsCount:I

    .line 62
    .line 63
    iget-object v5, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->sampleQueues:Landroid/util/SparseArray;

    .line 64
    .line 65
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-lt v3, v5, :cond_1

    .line 70
    .line 71
    iget-object v3, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->seekMap:Ln1/c0;

    .line 72
    .line 73
    if-nez v3, :cond_0

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_0
    const/4 v3, 0x0

    .line 77
    goto :goto_4

    .line 78
    :cond_1
    :goto_3
    move v3, v1

    .line 79
    :goto_4
    if-nez v0, :cond_4

    .line 80
    .line 81
    if-eqz v3, :cond_2

    .line 82
    .line 83
    if-ne v2, p2, :cond_2

    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_2
    if-ne v2, v1, :cond_3

    .line 87
    .line 88
    iget-object p2, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->positionHolder:Ln1/a0;

    .line 89
    .line 90
    iget-wide v4, p2, Ln1/a0;->a:J

    .line 91
    .line 92
    invoke-direct {p0, v4, v5}, Landroidx/media3/exoplayer/MediaExtractorCompat;->reopenCurrentDataSource(J)Ln1/o;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    move-object v4, p2

    .line 97
    :cond_3
    move p2, v3

    .line 98
    goto :goto_0

    .line 99
    :cond_4
    :goto_5
    invoke-virtual {p0}, Landroidx/media3/exoplayer/MediaExtractorCompat;->release()V

    .line 100
    .line 101
    .line 102
    if-eqz v0, :cond_5

    .line 103
    .line 104
    const-string p1, "Exception encountered while parsing input media."

    .line 105
    .line 106
    goto :goto_6

    .line 107
    :cond_5
    const-string p1, "Reached end of input before preparation completed."

    .line 108
    .line 109
    :goto_6
    invoke-static {p1, v0}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    throw p1

    .line 114
    :cond_6
    iput-object v4, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->currentExtractorInput:Ln1/o;

    .line 115
    .line 116
    iput-object p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->currentExtractor:Ln1/n;

    .line 117
    .line 118
    return-void
.end method

.method private reopenCurrentDataSource(J)Ln1/o;
    .locals 6

    .line 1
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->currentDataSource:Lk1/h;

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v1}, Lk1/h;->getUri()Landroid/net/Uri;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {v1}, Lcom/bumptech/glide/d;->p(Lk1/h;)V

    .line 14
    .line 15
    .line 16
    iget-wide v2, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->offsetInCurrentFile:J

    .line 17
    .line 18
    add-long/2addr v2, p1

    .line 19
    invoke-direct {p0, v0, v2, v3}, Landroidx/media3/exoplayer/MediaExtractorCompat;->buildDataSpec(Landroid/net/Uri;J)Lk1/l;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v1, v0}, Lk1/h;->open(Lk1/l;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    const-wide/16 v4, -0x1

    .line 28
    .line 29
    cmp-long v0, v2, v4

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    add-long/2addr v2, p1

    .line 34
    :cond_0
    move-wide v4, v2

    .line 35
    new-instance v0, Ln1/k;

    .line 36
    .line 37
    move-wide v2, p1

    .line 38
    invoke-direct/range {v0 .. v5}, Ln1/k;-><init>(Landroidx/media3/common/m;JJ)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method

.method private selectExtractor(Ln1/o;)Ln1/n;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->extractorsFactory:Ln1/q;

    .line 2
    .line 3
    invoke-interface {v0}, Ln1/q;->a()[Ln1/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    :try_start_0
    invoke-interface {v3, p1}, Ln1/n;->sniff(Ln1/o;)Z

    .line 14
    .line 15
    .line 16
    move-result v4
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    invoke-interface {p1}, Ln1/o;->g()V

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :catch_0
    :cond_0
    invoke-interface {p1}, Ln1/o;->g()V

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    invoke-interface {p1}, Ln1/o;->g()V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v3, 0x0

    .line 36
    :goto_2
    if-eqz v3, :cond_2

    .line 37
    .line 38
    return-object v3

    .line 39
    :cond_2
    new-instance p1, Landroidx/media3/exoplayer/source/UnrecognizedInputFormatException;

    .line 40
    .line 41
    new-instance v1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v2, "None of the available extractors ("

    .line 44
    .line 45
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    new-instance v2, Le6/e;

    .line 49
    .line 50
    const-string v3, ", "

    .line 51
    .line 52
    invoke-direct {v2, v3}, Le6/e;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, Lf6/m0;->k([Ljava/lang/Object;)Lf6/l1;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    new-instance v3, Landroidx/media3/exoplayer/q;

    .line 60
    .line 61
    const/4 v4, 0x7

    .line 62
    invoke-direct {v3, v4}, Landroidx/media3/exoplayer/q;-><init>(I)V

    .line 63
    .line 64
    .line 65
    invoke-static {v3, v0}, Lf6/u;->u(Le6/d;Ljava/util/List;)Ljava/util/AbstractList;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v2, v0}, Le6/e;->b(Ljava/util/List;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v0, ") could read the stream."

    .line 77
    .line 78
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->currentDataSource:Lk1/h;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-interface {v1}, Lk1/h;->getUri()Landroid/net/Uri;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    sget-object v2, Lf6/l1;->n:Lf6/l1;

    .line 98
    .line 99
    invoke-direct {p1, v0, v1, v2}, Landroidx/media3/exoplayer/source/UnrecognizedInputFormatException;-><init>(Ljava/lang/String;Landroid/net/Uri;Ljava/util/List;)V

    .line 100
    .line 101
    .line 102
    throw p1
.end method

.method private skipOneSample()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->trackIndicesPerSampleInQueuedOrder:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->tracks:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;

    .line 20
    .line 21
    iget-boolean v1, v0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;->isCompatibilityTrack:Z

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;->discardFrontSample()V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method


# virtual methods
.method public advance()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/MediaExtractorCompat;->advanceToSampleOrEndOfInput()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/MediaExtractorCompat;->skipOneSample()V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Landroidx/media3/exoplayer/MediaExtractorCompat;->advanceToSampleOrEndOfInput()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
.end method

.method public getAllocator()Landroidx/media3/exoplayer/upstream/Allocator;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->allocator:Landroidx/media3/exoplayer/upstream/Allocator;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSampleFlags()I
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/MediaExtractorCompat;->advanceToSampleOrEndOfInput()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->noDataBuffer:Lm1/g;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/MediaExtractorCompat;->peekNextSelectedTrackSample(Lm1/g;Z)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->noDataBuffer:Lm1/g;

    .line 16
    .line 17
    invoke-virtual {v0}, Lm1/g;->isEncrypted()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x2

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->noDataBuffer:Lm1/g;

    .line 27
    .line 28
    invoke-virtual {v1}, Lm1/a;->isKeyFrame()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    or-int/2addr v0, v1

    .line 33
    return v0
.end method

.method public getSampleSize()J
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/MediaExtractorCompat;->advanceToSampleOrEndOfInput()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide/16 v0, -0x1

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->sampleHolderWithBufferReplacementDirect:Lm1/g;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/MediaExtractorCompat;->peekNextSelectedTrackSample(Lm1/g;Z)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->sampleHolderWithBufferReplacementDirect:Lm1/g;

    .line 17
    .line 18
    iget-object v0, v0, Lm1/g;->data:Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 28
    .line 29
    .line 30
    int-to-long v0, v2

    .line 31
    return-wide v0
.end method

.method public getSampleTime()J
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/MediaExtractorCompat;->advanceToSampleOrEndOfInput()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide/16 v0, -0x1

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->noDataBuffer:Lm1/g;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/MediaExtractorCompat;->peekNextSelectedTrackSample(Lm1/g;Z)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->noDataBuffer:Lm1/g;

    .line 17
    .line 18
    iget-wide v0, v0, Lm1/g;->timeUs:J

    .line 19
    .line 20
    return-wide v0
.end method

.method public getSampleTrackIndex()I
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/MediaExtractorCompat;->advanceToSampleOrEndOfInput()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->trackIndicesPerSampleInQueuedOrder:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0
.end method

.method public getTrackCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->tracks:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getTrackFormat(I)Landroid/media/MediaFormat;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->tracks:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->formatHolder:Landroidx/media3/exoplayer/FormatHolder;

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->noDataBuffer:Lm1/g;

    .line 12
    .line 13
    invoke-virtual {p1, v0, v1}, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;->createDownstreamMediaFormat(Landroidx/media3/exoplayer/FormatHolder;Lm1/g;)Landroid/media/MediaFormat;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public readSampleData(Ljava/nio/ByteBuffer;I)I
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/MediaExtractorCompat;->advanceToSampleOrEndOfInput()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, -0x1

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->sampleHolderWithBufferReplacementDisabled:Lm1/g;

    .line 20
    .line 21
    iput-object p1, v0, Lm1/g;->data:Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/MediaExtractorCompat;->peekNextSelectedTrackSample(Lm1/g;Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 31
    .line 32
    .line 33
    iget-object p2, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->sampleHolderWithBufferReplacementDisabled:Lm1/g;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    iput-object v0, p2, Lm1/g;->data:Ljava/nio/ByteBuffer;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    return p1
.end method

.method public release()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->sampleQueues:Landroid/util/SparseArray;

    .line 3
    .line 4
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->sampleQueues:Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroidx/media3/exoplayer/source/SampleQueue;->release()V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->sampleQueues:Landroid/util/SparseArray;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->currentExtractor:Ln1/n;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, Ln1/n;->release()V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->currentExtractor:Ln1/n;

    .line 38
    .line 39
    :cond_1
    iput-object v1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->currentExtractorInput:Ln1/o;

    .line 40
    .line 41
    iput-object v1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->pendingSeek:Ln1/d0;

    .line 42
    .line 43
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->currentDataSource:Lk1/h;

    .line 44
    .line 45
    invoke-static {v0}, Lcom/bumptech/glide/d;->p(Lk1/h;)V

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->currentDataSource:Lk1/h;

    .line 49
    .line 50
    return-void
.end method

.method public seekTo(JI)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->seekMap:Ln1/c0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->selectedTrackIndices:Ljava/util/Set;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->currentExtractor:Ln1/n;

    .line 16
    .line 17
    instance-of v2, v0, Lh2/m;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    check-cast v0, Lh2/m;

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->tracks:Ljava/util/ArrayList;

    .line 24
    .line 25
    iget-object v3, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->selectedTrackIndices:Ljava/util/Set;

    .line 26
    .line 27
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;

    .line 46
    .line 47
    invoke-virtual {v2}, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorTrack;->getIdOfBackingTrack()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-virtual {v0, v2, p1, p2}, Lh2/m;->c(IJ)Ln1/b0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->seekMap:Ln1/c0;

    .line 57
    .line 58
    invoke-interface {v0, p1, p2}, Ln1/c0;->getSeekPoints(J)Ln1/b0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :goto_0
    if-eqz p3, :cond_4

    .line 63
    .line 64
    if-eq p3, v1, :cond_3

    .line 65
    .line 66
    const/4 v1, 0x2

    .line 67
    if-ne p3, v1, :cond_2

    .line 68
    .line 69
    iget-object p3, v0, Ln1/b0;->b:Ln1/d0;

    .line 70
    .line 71
    iget-object v1, v0, Ln1/b0;->a:Ln1/d0;

    .line 72
    .line 73
    iget-wide v2, p3, Ln1/d0;->a:J

    .line 74
    .line 75
    sub-long v2, p1, v2

    .line 76
    .line 77
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    .line 78
    .line 79
    .line 80
    move-result-wide v2

    .line 81
    iget-wide v4, v1, Ln1/d0;->a:J

    .line 82
    .line 83
    sub-long/2addr p1, v4

    .line 84
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(J)J

    .line 85
    .line 86
    .line 87
    move-result-wide p1

    .line 88
    cmp-long p1, v2, p1

    .line 89
    .line 90
    if-gez p1, :cond_5

    .line 91
    .line 92
    iget-object v1, v0, Ln1/b0;->b:Ln1/d0;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 96
    .line 97
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 98
    .line 99
    .line 100
    throw p1

    .line 101
    :cond_3
    iget-object v1, v0, Ln1/b0;->b:Ln1/d0;

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    iget-object v1, v0, Ln1/b0;->a:Ln1/d0;

    .line 105
    .line 106
    :cond_5
    :goto_1
    iget-object p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->trackIndicesPerSampleInQueuedOrder:Ljava/util/ArrayDeque;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 109
    .line 110
    .line 111
    const/4 p1, 0x0

    .line 112
    :goto_2
    iget-object p2, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->sampleQueues:Landroid/util/SparseArray;

    .line 113
    .line 114
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    if-ge p1, p2, :cond_6

    .line 119
    .line 120
    iget-object p2, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->sampleQueues:Landroid/util/SparseArray;

    .line 121
    .line 122
    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    check-cast p2, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;

    .line 127
    .line 128
    invoke-virtual {p2}, Landroidx/media3/exoplayer/source/SampleQueue;->reset()V

    .line 129
    .line 130
    .line 131
    add-int/lit8 p1, p1, 0x1

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_6
    iput-object v1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->pendingSeek:Ln1/d0;

    .line 135
    .line 136
    return-void
.end method

.method public selectTrack(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->selectedTrackIndices:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setDataSource(Landroid/content/Context;Landroid/net/Uri;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 13
    invoke-virtual {p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    .line 14
    invoke-virtual {p2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_0

    .line 15
    const-string v2, "file"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    if-eqz v1, :cond_1

    .line 16
    invoke-virtual {p0, v1}, Landroidx/media3/exoplayer/MediaExtractorCompat;->setDataSource(Ljava/lang/String;)V

    return-void

    .line 17
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    .line 18
    :try_start_0
    const-string v0, "r"

    invoke-virtual {p1, p2, v0}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_2

    .line 19
    :try_start_1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/MediaExtractorCompat;->setDataSource(Landroid/content/res/AssetFileDescriptor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    :try_start_2
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catchall_0
    move-exception v0

    .line 21
    :try_start_3
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0

    :cond_2
    if-eqz p1, :cond_3

    .line 22
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_0

    .line 23
    :catch_0
    :cond_3
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Landroidx/media3/exoplayer/MediaExtractorCompat;->setDataSource(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public setDataSource(Landroid/content/res/AssetFileDescriptor;)V
    .locals 6

    .line 4
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->getDeclaredLength()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 5
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/MediaExtractorCompat;->setDataSource(Ljava/io/FileDescriptor;)V

    return-void

    .line 6
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    .line 7
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v2

    .line 8
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->getDeclaredLength()J

    move-result-wide v4

    move-object v0, p0

    .line 9
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/exoplayer/MediaExtractorCompat;->setDataSource(Ljava/io/FileDescriptor;JJ)V

    return-void
.end method

.method public setDataSource(Landroid/media/MediaDataSource;)V
    .locals 3

    .line 29
    new-instance v0, Lk1/y;

    invoke-direct {v0, p1}, Lk1/y;-><init>(Landroid/media/MediaDataSource;)V

    .line 30
    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    const-wide/16 v1, 0x0

    invoke-direct {p0, p1, v1, v2}, Landroidx/media3/exoplayer/MediaExtractorCompat;->buildDataSpec(Landroid/net/Uri;J)Lk1/l;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Landroidx/media3/exoplayer/MediaExtractorCompat;->prepareDataSource(Lk1/h;Lk1/l;)V

    return-void
.end method

.method public setDataSource(Landroid/net/Uri;J)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->dataSourceFactory:Lk1/g;

    .line 2
    invoke-interface {v0}, Lk1/g;->l()Lk1/h;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/exoplayer/MediaExtractorCompat;->buildDataSpec(Landroid/net/Uri;J)Lk1/l;

    move-result-object p1

    .line 3
    invoke-direct {p0, v0, p1}, Landroidx/media3/exoplayer/MediaExtractorCompat;->prepareDataSource(Lk1/h;Lk1/l;)V

    return-void
.end method

.method public setDataSource(Ljava/io/FileDescriptor;)V
    .locals 6

    const-wide/16 v2, 0x0

    const-wide/16 v4, -0x1

    move-object v0, p0

    move-object v1, p1

    .line 10
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/exoplayer/MediaExtractorCompat;->setDataSource(Ljava/io/FileDescriptor;JJ)V

    return-void
.end method

.method public setDataSource(Ljava/io/FileDescriptor;JJ)V
    .locals 6

    .line 11
    new-instance v0, Lk1/s;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-direct/range {v0 .. v5}, Lk1/s;-><init>(Ljava/io/FileDescriptor;JJ)V

    .line 12
    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    const-wide/16 p2, 0x0

    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/exoplayer/MediaExtractorCompat;->buildDataSpec(Landroid/net/Uri;J)Lk1/l;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Landroidx/media3/exoplayer/MediaExtractorCompat;->prepareDataSource(Lk1/h;Lk1/l;)V

    return-void
.end method

.method public setDataSource(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 24
    invoke-virtual {p0, p1, v0}, Landroidx/media3/exoplayer/MediaExtractorCompat;->setDataSource(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public setDataSource(Ljava/lang/String;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 25
    iput-object p2, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->httpRequestHeaders:Ljava/util/Map;

    .line 26
    iget-object p2, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->dataSourceFactory:Lk1/g;

    .line 27
    invoke-interface {p2}, Lk1/g;->l()Lk1/h;

    move-result-object p2

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-wide/16 v0, 0x0

    invoke-direct {p0, p1, v0, v1}, Landroidx/media3/exoplayer/MediaExtractorCompat;->buildDataSpec(Landroid/net/Uri;J)Lk1/l;

    move-result-object p1

    .line 28
    invoke-direct {p0, p2, p1}, Landroidx/media3/exoplayer/MediaExtractorCompat;->prepareDataSource(Lk1/h;Lk1/l;)V

    return-void
.end method

.method public unselectTrack(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat;->selectedTrackIndices:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method
