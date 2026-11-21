.class public final Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/p;
.implements Landroidx/media3/exoplayer/source/chunk/ChunkExtractor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;,
        Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;
    }
.end annotation


# static fields
.field public static final FACTORY:Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;

.field private static final POSITION_HOLDER:Ln1/a0;


# instance fields
.field private final bindingTrackOutputs:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;",
            ">;"
        }
    .end annotation
.end field

.field private endTimeUs:J

.field private final extractor:Ln1/n;

.field private extractorInitialized:Z

.field private final primaryTrackManifestFormat:Landroidx/media3/common/w;

.field private final primaryTrackType:I

.field private sampleFormats:[Landroidx/media3/common/w;

.field private seekMap:Ln1/c0;

.field private trackOutputProvider:Landroidx/media3/exoplayer/source/chunk/ChunkExtractor$TrackOutputProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->FACTORY:Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$Factory;

    .line 7
    .line 8
    new-instance v0, Ln1/a0;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->POSITION_HOLDER:Ln1/a0;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Ln1/n;ILandroidx/media3/common/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->extractor:Ln1/n;

    .line 5
    .line 6
    iput p2, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->primaryTrackType:I

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->primaryTrackManifestFormat:Landroidx/media3/common/w;

    .line 9
    .line 10
    new-instance p1, Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->bindingTrackOutputs:Landroid/util/SparseArray;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public endTracks()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->bindingTrackOutputs:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-array v0, v0, [Landroidx/media3/common/w;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    iget-object v2, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->bindingTrackOutputs:Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ge v1, v2, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->bindingTrackOutputs:Landroid/util/SparseArray;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;

    .line 25
    .line 26
    iget-object v2, v2, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;->sampleFormat:Landroidx/media3/common/w;

    .line 27
    .line 28
    invoke-static {v2}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    aput-object v2, v0, v1

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iput-object v0, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->sampleFormats:[Landroidx/media3/common/w;

    .line 37
    .line 38
    return-void
.end method

.method public getChunkIndex()Ln1/j;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->seekMap:Ln1/c0;

    .line 2
    .line 3
    instance-of v1, v0, Ln1/j;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ln1/j;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public getSampleFormats()[Landroidx/media3/common/w;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->sampleFormats:[Landroidx/media3/common/w;

    .line 2
    .line 3
    return-object v0
.end method

.method public init(Landroidx/media3/exoplayer/source/chunk/ChunkExtractor$TrackOutputProvider;JJ)V
    .locals 5

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->trackOutputProvider:Landroidx/media3/exoplayer/source/chunk/ChunkExtractor$TrackOutputProvider;

    .line 2
    .line 3
    iput-wide p4, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->endTimeUs:J

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->extractorInitialized:Z

    .line 6
    .line 7
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->extractor:Ln1/n;

    .line 17
    .line 18
    invoke-interface {p1, p0}, Ln1/n;->init(Ln1/p;)V

    .line 19
    .line 20
    .line 21
    cmp-long p1, p2, v1

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->extractor:Ln1/n;

    .line 26
    .line 27
    invoke-interface {p1, v3, v4, p2, p3}, Ln1/n;->seek(JJ)V

    .line 28
    .line 29
    .line 30
    :cond_0
    const/4 p1, 0x1

    .line 31
    iput-boolean p1, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->extractorInitialized:Z

    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->extractor:Ln1/n;

    .line 35
    .line 36
    cmp-long v1, p2, v1

    .line 37
    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    move-wide p2, v3

    .line 41
    :cond_2
    invoke-interface {v0, v3, v4, p2, p3}, Ln1/n;->seek(JJ)V

    .line 42
    .line 43
    .line 44
    const/4 p2, 0x0

    .line 45
    :goto_0
    iget-object p3, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->bindingTrackOutputs:Landroid/util/SparseArray;

    .line 46
    .line 47
    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    if-ge p2, p3, :cond_3

    .line 52
    .line 53
    iget-object p3, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->bindingTrackOutputs:Landroid/util/SparseArray;

    .line 54
    .line 55
    invoke-virtual {p3, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    check-cast p3, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;

    .line 60
    .line 61
    invoke-virtual {p3, p1, p4, p5}, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;->bind(Landroidx/media3/exoplayer/source/chunk/ChunkExtractor$TrackOutputProvider;J)V

    .line 62
    .line 63
    .line 64
    add-int/lit8 p2, p2, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    return-void
.end method

.method public read(Ln1/o;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->extractor:Ln1/n;

    .line 2
    .line 3
    sget-object v1, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->POSITION_HOLDER:Ln1/a0;

    .line 4
    .line 5
    invoke-interface {v0, p1, v1}, Ln1/n;->read(Ln1/o;Ln1/a0;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-eq p1, v1, :cond_0

    .line 12
    .line 13
    move v2, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v2, v0

    .line 16
    :goto_0
    invoke-static {v2}, Lh1/a;->j(Z)V

    .line 17
    .line 18
    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    return v1

    .line 22
    :cond_1
    return v0
.end method

.method public release()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->extractor:Ln1/n;

    .line 2
    .line 3
    invoke-interface {v0}, Ln1/n;->release()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public seekMap(Ln1/c0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->seekMap:Ln1/c0;

    .line 2
    .line 3
    return-void
.end method

.method public track(II)Ln1/i0;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->bindingTrackOutputs:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;

    .line 8
    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->sampleFormats:[Landroidx/media3/common/w;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;

    .line 22
    .line 23
    iget v1, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->primaryTrackType:I

    .line 24
    .line 25
    if-ne p2, v1, :cond_1

    .line 26
    .line 27
    iget-object v1, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->primaryTrackManifestFormat:Landroidx/media3/common/w;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/4 v1, 0x0

    .line 31
    :goto_1
    invoke-direct {v0, p1, p2, v1}, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;-><init>(IILandroidx/media3/common/w;)V

    .line 32
    .line 33
    .line 34
    iget-object p2, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->trackOutputProvider:Landroidx/media3/exoplayer/source/chunk/ChunkExtractor$TrackOutputProvider;

    .line 35
    .line 36
    iget-wide v1, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->endTimeUs:J

    .line 37
    .line 38
    invoke-virtual {v0, p2, v1, v2}, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;->bind(Landroidx/media3/exoplayer/source/chunk/ChunkExtractor$TrackOutputProvider;J)V

    .line 39
    .line 40
    .line 41
    iget-object p2, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;->bindingTrackOutputs:Landroid/util/SparseArray;

    .line 42
    .line 43
    invoke-virtual {p2, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    return-object v0
.end method
