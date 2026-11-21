.class final Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/i0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BindingTrackOutput"
.end annotation


# instance fields
.field private endTimeUs:J

.field private final fakeTrackOutput:Ln1/m;

.field private final id:I

.field private final manifestFormat:Landroidx/media3/common/w;

.field public sampleFormat:Landroidx/media3/common/w;

.field private trackOutput:Ln1/i0;

.field private final type:I


# direct methods
.method public constructor <init>(IILandroidx/media3/common/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;->id:I

    .line 5
    .line 6
    iput p2, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;->type:I

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;->manifestFormat:Landroidx/media3/common/w;

    .line 9
    .line 10
    new-instance p1, Ln1/m;

    .line 11
    .line 12
    invoke-direct {p1}, Ln1/m;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;->fakeTrackOutput:Ln1/m;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public bind(Landroidx/media3/exoplayer/source/chunk/ChunkExtractor$TrackOutputProvider;J)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;->fakeTrackOutput:Ln1/m;

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;->trackOutput:Ln1/i0;

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iput-wide p2, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;->endTimeUs:J

    .line 9
    .line 10
    iget p2, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;->id:I

    .line 11
    .line 12
    iget p3, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;->type:I

    .line 13
    .line 14
    invoke-interface {p1, p2, p3}, Landroidx/media3/exoplayer/source/chunk/ChunkExtractor$TrackOutputProvider;->track(II)Ln1/i0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;->trackOutput:Ln1/i0;

    .line 19
    .line 20
    iget-object p2, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;->sampleFormat:Landroidx/media3/common/w;

    .line 21
    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    invoke-interface {p1, p2}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public format(Landroidx/media3/common/w;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;->manifestFormat:Landroidx/media3/common/w;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroidx/media3/common/w;->f(Landroidx/media3/common/w;)Landroidx/media3/common/w;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    iput-object p1, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;->sampleFormat:Landroidx/media3/common/w;

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;->trackOutput:Ln1/i0;

    .line 12
    .line 13
    sget v1, Lh1/i0;->a:I

    .line 14
    .line 15
    invoke-interface {v0, p1}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public sampleData(Landroidx/media3/common/m;IZ)I
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-interface {p0, p1, p2, p3, v0}, Ln1/i0;->sampleData(Landroidx/media3/common/m;IZI)I

    move-result p1

    return p1
.end method

.method public sampleData(Landroidx/media3/common/m;IZI)I
    .locals 1

    .line 3
    iget-object p4, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;->trackOutput:Ln1/i0;

    sget v0, Lh1/i0;->a:I

    invoke-interface {p4, p1, p2, p3}, Ln1/i0;->sampleData(Landroidx/media3/common/m;IZ)I

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

.method public sampleData(Lh1/w;II)V
    .locals 1

    .line 4
    iget-object p3, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;->trackOutput:Ln1/i0;

    sget v0, Lh1/i0;->a:I

    invoke-interface {p3, p1, p2}, Ln1/i0;->sampleData(Lh1/w;I)V

    return-void
.end method

.method public sampleMetadata(JIIILn1/h0;)V
    .locals 8

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;->endTimeUs:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    cmp-long v0, p1, v0

    .line 13
    .line 14
    if-ltz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;->fakeTrackOutput:Ln1/m;

    .line 17
    .line 18
    iput-object v0, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;->trackOutput:Ln1/i0;

    .line 19
    .line 20
    :cond_0
    iget-object v1, p0, Landroidx/media3/exoplayer/source/chunk/BundledChunkExtractor$BindingTrackOutput;->trackOutput:Ln1/i0;

    .line 21
    .line 22
    sget v0, Lh1/i0;->a:I

    .line 23
    .line 24
    move-wide v2, p1

    .line 25
    move v4, p3

    .line 26
    move v5, p4

    .line 27
    move v6, p5

    .line 28
    move-object v7, p6

    .line 29
    invoke-interface/range {v1 .. v7}, Ln1/i0;->sampleMetadata(JIIILn1/h0;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
