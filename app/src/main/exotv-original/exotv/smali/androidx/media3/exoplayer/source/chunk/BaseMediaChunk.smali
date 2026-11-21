.class public abstract Landroidx/media3/exoplayer/source/chunk/BaseMediaChunk;
.super Landroidx/media3/exoplayer/source/chunk/MediaChunk;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final clippedEndTimeUs:J

.field public final clippedStartTimeUs:J

.field private firstSampleIndices:[I

.field private output:Landroidx/media3/exoplayer/source/chunk/BaseMediaChunkOutput;


# direct methods
.method public constructor <init>(Lk1/h;Lk1/l;Landroidx/media3/common/w;ILjava/lang/Object;JJJJJ)V
    .locals 12

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p1

    .line 3
    move-object v2, p2

    .line 4
    move-object v3, p3

    .line 5
    move/from16 v4, p4

    .line 6
    .line 7
    move-object/from16 v5, p5

    .line 8
    .line 9
    move-wide/from16 v6, p6

    .line 10
    .line 11
    move-wide/from16 v8, p8

    .line 12
    .line 13
    move-wide/from16 v10, p14

    .line 14
    .line 15
    invoke-direct/range {v0 .. v11}, Landroidx/media3/exoplayer/source/chunk/MediaChunk;-><init>(Lk1/h;Lk1/l;Landroidx/media3/common/w;ILjava/lang/Object;JJJ)V

    .line 16
    .line 17
    .line 18
    move-wide/from16 p1, p10

    .line 19
    .line 20
    iput-wide p1, p0, Landroidx/media3/exoplayer/source/chunk/BaseMediaChunk;->clippedStartTimeUs:J

    .line 21
    .line 22
    move-wide/from16 p1, p12

    .line 23
    .line 24
    iput-wide p1, p0, Landroidx/media3/exoplayer/source/chunk/BaseMediaChunk;->clippedEndTimeUs:J

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final getFirstSampleIndex(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/chunk/BaseMediaChunk;->firstSampleIndices:[I

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    aget p1, v0, p1

    .line 7
    .line 8
    return p1
.end method

.method public final getOutput()Landroidx/media3/exoplayer/source/chunk/BaseMediaChunkOutput;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/chunk/BaseMediaChunk;->output:Landroidx/media3/exoplayer/source/chunk/BaseMediaChunkOutput;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public init(Landroidx/media3/exoplayer/source/chunk/BaseMediaChunkOutput;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/source/chunk/BaseMediaChunk;->output:Landroidx/media3/exoplayer/source/chunk/BaseMediaChunkOutput;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/media3/exoplayer/source/chunk/BaseMediaChunkOutput;->getWriteIndices()[I

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iput-object p1, p0, Landroidx/media3/exoplayer/source/chunk/BaseMediaChunk;->firstSampleIndices:[I

    .line 8
    .line 9
    return-void
.end method
