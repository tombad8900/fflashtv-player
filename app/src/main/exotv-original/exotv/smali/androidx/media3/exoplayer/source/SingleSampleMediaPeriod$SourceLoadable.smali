.class final Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/upstream/Loader$Loadable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SourceLoadable"
.end annotation


# instance fields
.field private final dataSource:Lk1/b0;

.field public final dataSpec:Lk1/l;

.field public final loadTaskId:J

.field private sampleData:[B


# direct methods
.method public constructor <init>(Lk1/l;Lk1/h;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroidx/media3/exoplayer/source/LoadEventInfo;->getNewId()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iput-wide v0, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->loadTaskId:J

    .line 9
    .line 10
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->dataSpec:Lk1/l;

    .line 11
    .line 12
    new-instance p1, Lk1/b0;

    .line 13
    .line 14
    invoke-direct {p1, p2}, Lk1/b0;-><init>(Lk1/h;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->dataSource:Lk1/b0;

    .line 18
    .line 19
    return-void
.end method

.method public static synthetic access$100(Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;)Lk1/b0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->dataSource:Lk1/b0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$200(Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;)[B
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->sampleData:[B

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public cancelLoad()V
    .locals 0

    .line 1
    return-void
.end method

.method public load()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->dataSource:Lk1/b0;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    iput-wide v1, v0, Lk1/b0;->k:J

    .line 6
    .line 7
    :try_start_0
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->dataSpec:Lk1/l;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lk1/b0;->open(Lk1/l;)J

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    :goto_0
    const/4 v1, -0x1

    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->dataSource:Lk1/b0;

    .line 17
    .line 18
    iget-wide v0, v0, Lk1/b0;->k:J

    .line 19
    .line 20
    long-to-int v0, v0

    .line 21
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->sampleData:[B

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    const/16 v1, 0x400

    .line 26
    .line 27
    new-array v1, v1, [B

    .line 28
    .line 29
    iput-object v1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->sampleData:[B

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    goto :goto_2

    .line 34
    :cond_0
    array-length v2, v1

    .line 35
    if-ne v0, v2, :cond_1

    .line 36
    .line 37
    array-length v2, v1

    .line 38
    mul-int/lit8 v2, v2, 0x2

    .line 39
    .line 40
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iput-object v1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->sampleData:[B

    .line 45
    .line 46
    :cond_1
    :goto_1
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->dataSource:Lk1/b0;

    .line 47
    .line 48
    iget-object v2, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->sampleData:[B

    .line 49
    .line 50
    array-length v3, v2

    .line 51
    sub-int/2addr v3, v0

    .line 52
    invoke-virtual {v1, v2, v0, v3}, Lk1/b0;->read([BII)I

    .line 53
    .line 54
    .line 55
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->dataSource:Lk1/b0;

    .line 58
    .line 59
    invoke-static {v0}, Lcom/bumptech/glide/d;->p(Lk1/h;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :goto_2
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SingleSampleMediaPeriod$SourceLoadable;->dataSource:Lk1/b0;

    .line 64
    .line 65
    invoke-static {v1}, Lcom/bumptech/glide/d;->p(Lk1/h;)V

    .line 66
    .line 67
    .line 68
    throw v0
.end method
