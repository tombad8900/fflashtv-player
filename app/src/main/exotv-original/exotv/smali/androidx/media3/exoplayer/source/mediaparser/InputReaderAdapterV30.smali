.class public final Landroidx/media3/exoplayer/source/mediaparser/InputReaderAdapterV30;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/media/MediaParser$SeekableInputReader;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "Override"
    }
.end annotation


# instance fields
.field private currentPosition:J

.field private dataReader:Landroidx/media3/common/m;

.field private lastSeekPosition:J

.field private resourceLength:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getAndResetSeekPosition()J
    .locals 4

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/source/mediaparser/InputReaderAdapterV30;->lastSeekPosition:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    iput-wide v2, p0, Landroidx/media3/exoplayer/source/mediaparser/InputReaderAdapterV30;->lastSeekPosition:J

    .line 6
    .line 7
    return-wide v0
.end method

.method public getLength()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/source/mediaparser/InputReaderAdapterV30;->resourceLength:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getPosition()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/source/mediaparser/InputReaderAdapterV30;->currentPosition:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public read([BII)I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/mediaparser/InputReaderAdapterV30;->dataReader:Landroidx/media3/common/m;

    .line 2
    .line 3
    sget v1, Lh1/i0;->a:I

    .line 4
    .line 5
    invoke-interface {v0, p1, p2, p3}, Landroidx/media3/common/m;->read([BII)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-wide p2, p0, Landroidx/media3/exoplayer/source/mediaparser/InputReaderAdapterV30;->currentPosition:J

    .line 10
    .line 11
    int-to-long v0, p1

    .line 12
    add-long/2addr p2, v0

    .line 13
    iput-wide p2, p0, Landroidx/media3/exoplayer/source/mediaparser/InputReaderAdapterV30;->currentPosition:J

    .line 14
    .line 15
    return p1
.end method

.method public seekToPosition(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/media3/exoplayer/source/mediaparser/InputReaderAdapterV30;->lastSeekPosition:J

    .line 2
    .line 3
    return-void
.end method

.method public setCurrentPosition(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/media3/exoplayer/source/mediaparser/InputReaderAdapterV30;->currentPosition:J

    .line 2
    .line 3
    return-void
.end method

.method public setDataReader(Landroidx/media3/common/m;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/source/mediaparser/InputReaderAdapterV30;->dataReader:Landroidx/media3/common/m;

    .line 2
    .line 3
    iput-wide p2, p0, Landroidx/media3/exoplayer/source/mediaparser/InputReaderAdapterV30;->resourceLength:J

    .line 4
    .line 5
    const-wide/16 p1, -0x1

    .line 6
    .line 7
    iput-wide p1, p0, Landroidx/media3/exoplayer/source/mediaparser/InputReaderAdapterV30;->lastSeekPosition:J

    .line 8
    .line 9
    return-void
.end method
