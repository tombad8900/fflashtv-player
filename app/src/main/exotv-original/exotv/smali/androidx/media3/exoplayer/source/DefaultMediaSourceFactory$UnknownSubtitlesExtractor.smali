.class final Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$UnknownSubtitlesExtractor;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "UnknownSubtitlesExtractor"
.end annotation


# instance fields
.field private final format:Landroidx/media3/common/w;


# direct methods
.method public constructor <init>(Landroidx/media3/common/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$UnknownSubtitlesExtractor;->format:Landroidx/media3/common/w;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getSniffFailureDetails()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lf6/m0;->k:Lf6/k0;

    .line 2
    .line 3
    sget-object v0, Lf6/l1;->n:Lf6/l1;

    .line 4
    .line 5
    return-object v0
.end method

.method public getUnderlyingImplementation()Ln1/n;
    .locals 0
    .annotation runtime Lorg/checkerframework/dataflow/qual/SideEffectFree;
    .end annotation

    .line 1
    return-object p0
.end method

.method public init(Ln1/p;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x3

    .line 3
    invoke-interface {p1, v0, v1}, Ln1/p;->track(II)Ln1/i0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ln1/s;

    .line 8
    .line 9
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v2, v3}, Ln1/s;-><init>(J)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v1}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ln1/p;->endTracks()V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$UnknownSubtitlesExtractor;->format:Landroidx/media3/common/w;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroidx/media3/common/w;->a()Landroidx/media3/common/v;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const-string v1, "text/x-unknown"

    .line 30
    .line 31
    invoke-static {v1}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iput-object v1, p1, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v1, p0, Landroidx/media3/exoplayer/source/DefaultMediaSourceFactory$UnknownSubtitlesExtractor;->format:Landroidx/media3/common/w;

    .line 38
    .line 39
    iget-object v1, v1, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 40
    .line 41
    iput-object v1, p1, Landroidx/media3/common/v;->j:Ljava/lang/String;

    .line 42
    .line 43
    new-instance v1, Landroidx/media3/common/w;

    .line 44
    .line 45
    invoke-direct {v1, p1}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0, v1}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public read(Ln1/o;Ln1/a0;)I
    .locals 0

    .line 1
    const p2, 0x7fffffff

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, p2}, Ln1/o;->e(I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/4 p2, -0x1

    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    return p2

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1
.end method

.method public release()V
    .locals 0

    .line 1
    return-void
.end method

.method public seek(JJ)V
    .locals 0

    .line 1
    return-void
.end method

.method public sniff(Ln1/o;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method
