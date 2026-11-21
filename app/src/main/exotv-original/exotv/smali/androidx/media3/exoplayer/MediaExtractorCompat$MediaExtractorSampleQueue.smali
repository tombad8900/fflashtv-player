.class final Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;
.super Landroidx/media3/exoplayer/source/SampleQueue;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/MediaExtractorCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "MediaExtractorSampleQueue"
.end annotation


# instance fields
.field private compatibilityTrackIndex:I

.field private mainTrackIndex:I

.field final synthetic this$0:Landroidx/media3/exoplayer/MediaExtractorCompat;

.field public final trackId:I


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/MediaExtractorCompat;Landroidx/media3/exoplayer/upstream/Allocator;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;->this$0:Landroidx/media3/exoplayer/MediaExtractorCompat;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p2, p1, p1}, Landroidx/media3/exoplayer/source/SampleQueue;-><init>(Landroidx/media3/exoplayer/upstream/Allocator;Landroidx/media3/exoplayer/drm/DrmSessionManager;Landroidx/media3/exoplayer/drm/DrmSessionEventListener$EventDispatcher;)V

    .line 5
    .line 6
    .line 7
    iput p3, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;->trackId:I

    .line 8
    .line 9
    const/4 p1, -0x1

    .line 10
    iput p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;->mainTrackIndex:I

    .line 11
    .line 12
    iput p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;->compatibilityTrackIndex:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public getAdjustedUpstreamFormat(Landroidx/media3/common/w;)Landroidx/media3/common/w;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/source/SampleQueue;->getUpstreamFormat()Landroidx/media3/common/w;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;->this$0:Landroidx/media3/exoplayer/MediaExtractorCompat;

    .line 8
    .line 9
    invoke-static {v0, p0, p1}, Landroidx/media3/exoplayer/MediaExtractorCompat;->access$600(Landroidx/media3/exoplayer/MediaExtractorCompat;Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;Landroidx/media3/common/w;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-super {p0, p1}, Landroidx/media3/exoplayer/source/SampleQueue;->getAdjustedUpstreamFormat(Landroidx/media3/common/w;)Landroidx/media3/common/w;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
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
    .locals 9

    .line 1
    const v0, -0x20000001

    .line 2
    .line 3
    .line 4
    and-int v4, p3, v0

    .line 5
    .line 6
    iget p3, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;->mainTrackIndex:I

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    const/4 v8, -0x1

    .line 10
    if-eq p3, v8, :cond_0

    .line 11
    .line 12
    move p3, v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p3, 0x0

    .line 15
    :goto_0
    invoke-static {p3}, Lh1/a;->j(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/media3/exoplayer/source/SampleQueue;->getWriteIndex()I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    move-object v1, p0

    .line 23
    move-wide v2, p1

    .line 24
    move v5, p4

    .line 25
    move v6, p5

    .line 26
    move-object v7, p6

    .line 27
    invoke-super/range {v1 .. v7}, Landroidx/media3/exoplayer/source/SampleQueue;->sampleMetadata(JIIILn1/h0;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/media3/exoplayer/source/SampleQueue;->getWriteIndex()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    add-int/2addr p3, v0

    .line 35
    if-ne p1, p3, :cond_2

    .line 36
    .line 37
    iget p1, v1, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;->compatibilityTrackIndex:I

    .line 38
    .line 39
    if-eq p1, v8, :cond_1

    .line 40
    .line 41
    iget-object p1, v1, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;->this$0:Landroidx/media3/exoplayer/MediaExtractorCompat;

    .line 42
    .line 43
    invoke-static {p1}, Landroidx/media3/exoplayer/MediaExtractorCompat;->access$700(Landroidx/media3/exoplayer/MediaExtractorCompat;)Ljava/util/ArrayDeque;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget p2, v1, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;->compatibilityTrackIndex:I

    .line 48
    .line 49
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    iget-object p1, v1, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;->this$0:Landroidx/media3/exoplayer/MediaExtractorCompat;

    .line 57
    .line 58
    invoke-static {p1}, Landroidx/media3/exoplayer/MediaExtractorCompat;->access$700(Landroidx/media3/exoplayer/MediaExtractorCompat;)Ljava/util/ArrayDeque;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget p2, v1, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;->mainTrackIndex:I

    .line 63
    .line 64
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_2
    return-void
.end method

.method public setCompatibilityTrackIndex(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;->compatibilityTrackIndex:I

    .line 2
    .line 3
    return-void
.end method

.method public setMainTrackIndex(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;->mainTrackIndex:I

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;->trackId:I

    .line 2
    .line 3
    iget v1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;->mainTrackIndex:I

    .line 4
    .line 5
    iget v2, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;->compatibilityTrackIndex:I

    .line 6
    .line 7
    const-string v3, ", mainTrackIndex: "

    .line 8
    .line 9
    const-string v4, ", compatibilityTrackIndex: "

    .line 10
    .line 11
    const-string v5, "trackId: "

    .line 12
    .line 13
    invoke-static {v0, v1, v5, v3, v4}, La1/a1;->o(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method
