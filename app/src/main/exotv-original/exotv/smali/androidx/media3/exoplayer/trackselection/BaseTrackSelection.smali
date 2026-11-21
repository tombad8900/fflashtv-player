.class public abstract Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;


# instance fields
.field private final excludeUntilTimes:[J

.field private final formats:[Landroidx/media3/common/w;

.field protected final group:Landroidx/media3/common/q1;

.field private hashCode:I

.field protected final length:I

.field private playWhenReady:Z

.field protected final tracks:[I

.field private final type:I


# direct methods
.method public varargs constructor <init>(Landroidx/media3/common/q1;[I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;-><init>(Landroidx/media3/common/q1;[II)V

    return-void
.end method

.method public constructor <init>(Landroidx/media3/common/q1;[II)V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    array-length v0, p2

    const/4 v1, 0x0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 4
    iput p3, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->type:I

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    iput-object p1, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->group:Landroidx/media3/common/q1;

    .line 7
    array-length p3, p2

    iput p3, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->length:I

    .line 8
    new-array p3, p3, [Landroidx/media3/common/w;

    iput-object p3, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->formats:[Landroidx/media3/common/w;

    move p3, v1

    .line 9
    :goto_1
    array-length v0, p2

    if-ge p3, v0, :cond_1

    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->formats:[Landroidx/media3/common/w;

    aget v2, p2, p3

    .line 11
    iget-object v3, p1, Landroidx/media3/common/q1;->d:[Landroidx/media3/common/w;

    aget-object v2, v3, v2

    .line 12
    aput-object v2, v0, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    .line 13
    :cond_1
    iget-object p2, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->formats:[Landroidx/media3/common/w;

    new-instance p3, Landroidx/media3/exoplayer/trackselection/b;

    const/4 v0, 0x6

    invoke-direct {p3, v0}, Landroidx/media3/exoplayer/trackselection/b;-><init>(I)V

    invoke-static {p2, p3}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 14
    iget p2, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->length:I

    new-array p2, p2, [I

    iput-object p2, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->tracks:[I

    move p2, v1

    .line 15
    :goto_2
    iget p3, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->length:I

    if-ge p2, p3, :cond_2

    .line 16
    iget-object p3, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->tracks:[I

    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->formats:[Landroidx/media3/common/w;

    aget-object v0, v0, p2

    invoke-virtual {p1, v0}, Landroidx/media3/common/q1;->b(Landroidx/media3/common/w;)I

    move-result v0

    aput v0, p3, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    .line 17
    :cond_2
    new-array p1, p3, [J

    iput-object p1, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->excludeUntilTimes:[J

    .line 18
    iput-boolean v1, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->playWhenReady:Z

    return-void
.end method

.method public static synthetic a(Landroidx/media3/common/w;Landroidx/media3/common/w;)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->lambda$new$0(Landroidx/media3/common/w;Landroidx/media3/common/w;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static synthetic lambda$new$0(Landroidx/media3/common/w;Landroidx/media3/common/w;)I
    .locals 0

    .line 1
    iget p1, p1, Landroidx/media3/common/w;->j:I

    .line 2
    .line 3
    iget p0, p0, Landroidx/media3/common/w;->j:I

    .line 4
    .line 5
    sub-int/2addr p1, p0

    .line 6
    return p1
.end method


# virtual methods
.method public disable()V
    .locals 0

    .line 1
    return-void
.end method

.method public enable()V
    .locals 0

    .line 1
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eq v2, v3, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    check-cast p1, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;

    .line 20
    .line 21
    iget-object v2, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->group:Landroidx/media3/common/q1;

    .line 22
    .line 23
    iget-object v3, p1, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->group:Landroidx/media3/common/q1;

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Landroidx/media3/common/q1;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    iget-object v2, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->tracks:[I

    .line 32
    .line 33
    iget-object p1, p1, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->tracks:[I

    .line 34
    .line 35
    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([I[I)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    return v0

    .line 42
    :cond_2
    :goto_0
    return v1
.end method

.method public evaluateQueueSize(JLjava/util/List;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "+",
            "Landroidx/media3/exoplayer/source/chunk/MediaChunk;",
            ">;)I"
        }
    .end annotation

    .line 1
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public excludeTrack(IJ)Z
    .locals 9

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0, p1, v0, v1}, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->isTrackExcluded(IJ)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    :goto_0
    iget v5, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->length:I

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    if-ge v4, v5, :cond_1

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    if-eq v4, p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, v4, v0, v1}, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->isTrackExcluded(IJ)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    move v2, v6

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    move v2, v3

    .line 29
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    if-nez v2, :cond_2

    .line 33
    .line 34
    return v3

    .line 35
    :cond_2
    iget-object v2, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->excludeUntilTimes:[J

    .line 36
    .line 37
    aget-wide v3, v2, p1

    .line 38
    .line 39
    sget v5, Lh1/i0;->a:I

    .line 40
    .line 41
    add-long v7, v0, p2

    .line 42
    .line 43
    xor-long/2addr v0, v7

    .line 44
    xor-long/2addr p2, v7

    .line 45
    and-long/2addr p2, v0

    .line 46
    const-wide/16 v0, 0x0

    .line 47
    .line 48
    cmp-long p2, p2, v0

    .line 49
    .line 50
    if-gez p2, :cond_3

    .line 51
    .line 52
    const-wide v7, 0x7fffffffffffffffL

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    :cond_3
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 58
    .line 59
    .line 60
    move-result-wide p2

    .line 61
    aput-wide p2, v2, p1

    .line 62
    .line 63
    return v6
.end method

.method public final getFormat(I)Landroidx/media3/common/w;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->formats:[Landroidx/media3/common/w;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    return-object p1
.end method

.method public final getIndexInTrackGroup(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->tracks:[I

    .line 2
    .line 3
    aget p1, v0, p1

    .line 4
    .line 5
    return p1
.end method

.method public final getPlayWhenReady()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->playWhenReady:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getSelectedFormat()Landroidx/media3/common/w;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->formats:[Landroidx/media3/common/w;

    .line 2
    .line 3
    invoke-interface {p0}, Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;->getSelectedIndex()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget-object v0, v0, v1

    .line 8
    .line 9
    return-object v0
.end method

.method public final getSelectedIndexInTrackGroup()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->tracks:[I

    .line 2
    .line 3
    invoke-interface {p0}, Landroidx/media3/exoplayer/trackselection/ExoTrackSelection;->getSelectedIndex()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    return v0
.end method

.method public final getTrackGroup()Landroidx/media3/common/q1;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->group:Landroidx/media3/common/q1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getType()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->type:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->hashCode:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->group:Landroidx/media3/common/q1;

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    mul-int/lit8 v0, v0, 0x1f

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->tracks:[I

    .line 14
    .line 15
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v1, v0

    .line 20
    iput v1, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->hashCode:I

    .line 21
    .line 22
    :cond_0
    iget v0, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->hashCode:I

    .line 23
    .line 24
    return v0
.end method

.method public final indexOf(I)I
    .locals 2

    const/4 v0, 0x0

    .line 3
    :goto_0
    iget v1, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->length:I

    if-ge v0, v1, :cond_1

    .line 4
    iget-object v1, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->tracks:[I

    aget v1, v1, v0

    if-ne v1, p1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final indexOf(Landroidx/media3/common/w;)I
    .locals 2

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget v1, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->length:I

    if-ge v0, v1, :cond_1

    .line 2
    iget-object v1, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->formats:[Landroidx/media3/common/w;

    aget-object v1, v1, v0

    if-ne v1, p1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public isTrackExcluded(IJ)Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->excludeUntilTimes:[J

    .line 2
    .line 3
    aget-wide v1, v0, p1

    .line 4
    .line 5
    cmp-long p1, v1, p2

    .line 6
    .line 7
    if-lez p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method public final length()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->tracks:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    return v0
.end method

.method public onPlayWhenReadyChanged(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/trackselection/BaseTrackSelection;->playWhenReady:Z

    .line 2
    .line 3
    return-void
.end method

.method public onPlaybackSpeed(F)V
    .locals 0

    .line 1
    return-void
.end method
