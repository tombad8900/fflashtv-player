.class final Landroidx/media3/exoplayer/hls/MediaParserHlsMediaChunkExtractor$PeekingInputReader;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/media/MediaParser$SeekableInputReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/hls/MediaParserHlsMediaChunkExtractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PeekingInputReader"
.end annotation


# instance fields
.field private final extractorInput:Ln1/o;

.field private totalPeekedBytes:I


# direct methods
.method private constructor <init>(Ln1/o;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/MediaParserHlsMediaChunkExtractor$PeekingInputReader;->extractorInput:Ln1/o;

    return-void
.end method

.method public synthetic constructor <init>(Ln1/o;Landroidx/media3/exoplayer/hls/MediaParserHlsMediaChunkExtractor$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/hls/MediaParserHlsMediaChunkExtractor$PeekingInputReader;-><init>(Ln1/o;)V

    return-void
.end method

.method public static synthetic access$100(Landroidx/media3/exoplayer/hls/MediaParserHlsMediaChunkExtractor$PeekingInputReader;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/exoplayer/hls/MediaParserHlsMediaChunkExtractor$PeekingInputReader;->totalPeekedBytes:I

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public getLength()J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/MediaParserHlsMediaChunkExtractor$PeekingInputReader;->extractorInput:Ln1/o;

    .line 2
    .line 3
    invoke-interface {v0}, Ln1/o;->getLength()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public getPosition()J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/MediaParserHlsMediaChunkExtractor$PeekingInputReader;->extractorInput:Ln1/o;

    .line 2
    .line 3
    invoke-interface {v0}, Ln1/o;->c()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public read([BII)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/MediaParserHlsMediaChunkExtractor$PeekingInputReader;->extractorInput:Ln1/o;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Ln1/o;->f([BII)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget p2, p0, Landroidx/media3/exoplayer/hls/MediaParserHlsMediaChunkExtractor$PeekingInputReader;->totalPeekedBytes:I

    .line 8
    .line 9
    add-int/2addr p2, p1

    .line 10
    iput p2, p0, Landroidx/media3/exoplayer/hls/MediaParserHlsMediaChunkExtractor$PeekingInputReader;->totalPeekedBytes:I

    .line 11
    .line 12
    return p1
.end method

.method public seekToPosition(J)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method
