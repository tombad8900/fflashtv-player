.class public abstract Landroidx/media3/exoplayer/source/chunk/Chunk;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/upstream/Loader$Loadable;


# instance fields
.field protected final dataSource:Lk1/b0;

.field public final dataSpec:Lk1/l;

.field public final endTimeUs:J

.field public final loadTaskId:J

.field public final startTimeUs:J

.field public final trackFormat:Landroidx/media3/common/w;

.field public final trackSelectionData:Ljava/lang/Object;

.field public final trackSelectionReason:I

.field public final type:I


# direct methods
.method public constructor <init>(Lk1/h;Lk1/l;ILandroidx/media3/common/w;ILjava/lang/Object;JJ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lk1/b0;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lk1/b0;-><init>(Lk1/h;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->dataSource:Lk1/b0;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->dataSpec:Lk1/l;

    .line 15
    .line 16
    iput p3, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->type:I

    .line 17
    .line 18
    iput-object p4, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->trackFormat:Landroidx/media3/common/w;

    .line 19
    .line 20
    iput p5, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->trackSelectionReason:I

    .line 21
    .line 22
    iput-object p6, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->trackSelectionData:Ljava/lang/Object;

    .line 23
    .line 24
    iput-wide p7, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->startTimeUs:J

    .line 25
    .line 26
    iput-wide p9, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->endTimeUs:J

    .line 27
    .line 28
    invoke-static {}, Landroidx/media3/exoplayer/source/LoadEventInfo;->getNewId()J

    .line 29
    .line 30
    .line 31
    move-result-wide p1

    .line 32
    iput-wide p1, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->loadTaskId:J

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final bytesLoaded()J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->dataSource:Lk1/b0;

    .line 2
    .line 3
    iget-wide v0, v0, Lk1/b0;->k:J

    .line 4
    .line 5
    return-wide v0
.end method

.method public final getDurationUs()J
    .locals 4

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->endTimeUs:J

    .line 2
    .line 3
    iget-wide v2, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->startTimeUs:J

    .line 4
    .line 5
    sub-long/2addr v0, v2

    .line 6
    return-wide v0
.end method

.method public final getResponseHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->dataSource:Lk1/b0;

    .line 2
    .line 3
    iget-object v0, v0, Lk1/b0;->m:Ljava/util/Map;

    .line 4
    .line 5
    return-object v0
.end method

.method public final getUri()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/chunk/Chunk;->dataSource:Lk1/b0;

    .line 2
    .line 3
    iget-object v0, v0, Lk1/b0;->l:Landroid/net/Uri;

    .line 4
    .line 5
    return-object v0
.end method
