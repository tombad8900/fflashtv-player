.class final Landroidx/media3/exoplayer/text/ReplacingCuesResolver;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/exoplayer/text/CuesResolver;


# instance fields
.field private final cuesWithTimingList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lk2/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 10
    .line 11
    return-void
.end method

.method private getIndexOfCuesStartingAfter(J)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lk2/c;

    .line 17
    .line 18
    iget-wide v1, v1, Lk2/c;->b:J

    .line 19
    .line 20
    cmp-long v1, p1, v1

    .line 21
    .line 22
    if-gez v1, :cond_0

    .line 23
    .line 24
    return v0

    .line 25
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget-object p1, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1
.end method


# virtual methods
.method public addCues(Lk2/c;J)Z
    .locals 9

    .line 1
    iget-wide v0, p1, Lk2/c;->b:J

    .line 2
    .line 3
    iget-wide v2, p1, Lk2/c;->b:J

    .line 4
    .line 5
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v0, v0, v4

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v6, 0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    move v0, v6

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v1

    .line 19
    :goto_0
    invoke-static {v0}, Lh1/a;->d(Z)V

    .line 20
    .line 21
    .line 22
    cmp-long v0, v2, p2

    .line 23
    .line 24
    if-gtz v0, :cond_2

    .line 25
    .line 26
    iget-wide v7, p1, Lk2/c;->d:J

    .line 27
    .line 28
    cmp-long v0, v7, v4

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    cmp-long v0, p2, v7

    .line 33
    .line 34
    if-gez v0, :cond_2

    .line 35
    .line 36
    :cond_1
    move v0, v6

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v0, v1

    .line 39
    :goto_1
    iget-object v4, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    sub-int/2addr v4, v6

    .line 46
    :goto_2
    if-ltz v4, :cond_5

    .line 47
    .line 48
    iget-object v5, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    check-cast v5, Lk2/c;

    .line 55
    .line 56
    iget-wide v7, v5, Lk2/c;->b:J

    .line 57
    .line 58
    cmp-long v5, v2, v7

    .line 59
    .line 60
    if-ltz v5, :cond_3

    .line 61
    .line 62
    iget-object p2, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 63
    .line 64
    add-int/2addr v4, v6

    .line 65
    invoke-virtual {p2, v4, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return v0

    .line 69
    :cond_3
    iget-object v5, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    check-cast v5, Lk2/c;

    .line 76
    .line 77
    iget-wide v7, v5, Lk2/c;->b:J

    .line 78
    .line 79
    cmp-long v5, v7, p2

    .line 80
    .line 81
    if-gtz v5, :cond_4

    .line 82
    .line 83
    move v0, v1

    .line 84
    :cond_4
    add-int/lit8 v4, v4, -0x1

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_5
    iget-object p2, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-virtual {p2, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    return v0
.end method

.method public clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public discardCuesBeforeTimeUs(J)V
    .locals 5

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->getIndexOfCuesStartingAfter(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 9
    .line 10
    add-int/lit8 v2, v0, -0x1

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lk2/c;

    .line 17
    .line 18
    iget-wide v1, v1, Lk2/c;->d:J

    .line 19
    .line 20
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    cmp-long v3, v1, v3

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    cmp-long p1, v1, p1

    .line 30
    .line 31
    if-ltz p1, :cond_2

    .line 32
    .line 33
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 34
    .line 35
    :cond_2
    iget-object p1, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 36
    .line 37
    const/4 p2, 0x0

    .line 38
    invoke-virtual {p1, p2, v0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public getCuesAtTimeUs(J)Lf6/m0;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lf6/m0;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->getIndexOfCuesStartingAfter(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object p1, Lf6/m0;->k:Lf6/k0;

    .line 8
    .line 9
    sget-object p1, Lf6/l1;->n:Lf6/l1;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    iget-object v1, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 13
    .line 14
    add-int/lit8 v0, v0, -0x1

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lk2/c;

    .line 21
    .line 22
    iget-wide v1, v0, Lk2/c;->d:J

    .line 23
    .line 24
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    cmp-long v3, v1, v3

    .line 30
    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    cmp-long p1, p1, v1

    .line 34
    .line 35
    if-gez p1, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    sget-object p1, Lf6/m0;->k:Lf6/k0;

    .line 39
    .line 40
    sget-object p1, Lf6/l1;->n:Lf6/l1;

    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_2
    :goto_0
    iget-object p1, v0, Lk2/c;->a:Lf6/m0;

    .line 44
    .line 45
    return-object p1
.end method

.method public getNextCueChangeTimeUs(J)J
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-wide/high16 v1, -0x8000000000000000L

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-wide v1

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lk2/c;

    .line 20
    .line 21
    iget-wide v4, v0, Lk2/c;->b:J

    .line 22
    .line 23
    cmp-long v0, p1, v4

    .line 24
    .line 25
    if-gez v0, :cond_1

    .line 26
    .line 27
    iget-object p1, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lk2/c;

    .line 34
    .line 35
    iget-wide p1, p1, Lk2/c;->b:J

    .line 36
    .line 37
    return-wide p1

    .line 38
    :cond_1
    const/4 v0, 0x1

    .line 39
    move v3, v0

    .line 40
    :goto_0
    iget-object v4, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    if-ge v3, v4, :cond_4

    .line 52
    .line 53
    iget-object v4, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Lk2/c;

    .line 60
    .line 61
    iget-wide v7, v4, Lk2/c;->b:J

    .line 62
    .line 63
    iget-wide v9, v4, Lk2/c;->b:J

    .line 64
    .line 65
    cmp-long v4, p1, v7

    .line 66
    .line 67
    if-gez v4, :cond_3

    .line 68
    .line 69
    iget-object v1, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 70
    .line 71
    sub-int/2addr v3, v0

    .line 72
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Lk2/c;

    .line 77
    .line 78
    iget-wide v0, v0, Lk2/c;->d:J

    .line 79
    .line 80
    cmp-long v2, v0, v5

    .line 81
    .line 82
    if-eqz v2, :cond_2

    .line 83
    .line 84
    cmp-long p1, v0, p1

    .line 85
    .line 86
    if-lez p1, :cond_2

    .line 87
    .line 88
    cmp-long p1, v0, v9

    .line 89
    .line 90
    if-gez p1, :cond_2

    .line 91
    .line 92
    return-wide v0

    .line 93
    :cond_2
    return-wide v9

    .line 94
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_4
    iget-object v0, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-static {v0}, Lf6/u;->i(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, Lk2/c;

    .line 104
    .line 105
    iget-wide v3, v0, Lk2/c;->d:J

    .line 106
    .line 107
    cmp-long v0, v3, v5

    .line 108
    .line 109
    if-eqz v0, :cond_5

    .line 110
    .line 111
    cmp-long p1, p1, v3

    .line 112
    .line 113
    if-gez p1, :cond_5

    .line 114
    .line 115
    return-wide v3

    .line 116
    :cond_5
    return-wide v1
.end method

.method public getPreviousCueChangeTimeUs(J)J
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    if-nez v0, :cond_7

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lk2/c;

    .line 22
    .line 23
    iget-wide v3, v0, Lk2/c;->b:J

    .line 24
    .line 25
    cmp-long v0, p1, v3

    .line 26
    .line 27
    if-gez v0, :cond_0

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_0
    const/4 v0, 0x1

    .line 31
    move v3, v0

    .line 32
    :goto_0
    iget-object v4, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-ge v3, v4, :cond_4

    .line 39
    .line 40
    iget-object v4, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Lk2/c;

    .line 47
    .line 48
    iget-wide v4, v4, Lk2/c;->b:J

    .line 49
    .line 50
    cmp-long v6, p1, v4

    .line 51
    .line 52
    if-nez v6, :cond_1

    .line 53
    .line 54
    return-wide v4

    .line 55
    :cond_1
    if-gez v6, :cond_3

    .line 56
    .line 57
    iget-object v4, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 58
    .line 59
    sub-int/2addr v3, v0

    .line 60
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Lk2/c;

    .line 65
    .line 66
    iget-wide v3, v0, Lk2/c;->d:J

    .line 67
    .line 68
    cmp-long v1, v3, v1

    .line 69
    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    cmp-long p1, v3, p1

    .line 73
    .line 74
    if-gtz p1, :cond_2

    .line 75
    .line 76
    return-wide v3

    .line 77
    :cond_2
    iget-wide p1, v0, Lk2/c;->b:J

    .line 78
    .line 79
    return-wide p1

    .line 80
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    iget-object v0, p0, Landroidx/media3/exoplayer/text/ReplacingCuesResolver;->cuesWithTimingList:Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-static {v0}, Lf6/u;->i(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Lk2/c;

    .line 90
    .line 91
    iget-wide v3, v0, Lk2/c;->d:J

    .line 92
    .line 93
    cmp-long v1, v3, v1

    .line 94
    .line 95
    if-eqz v1, :cond_6

    .line 96
    .line 97
    cmp-long p1, p1, v3

    .line 98
    .line 99
    if-gez p1, :cond_5

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_5
    return-wide v3

    .line 103
    :cond_6
    :goto_1
    iget-wide p1, v0, Lk2/c;->b:J

    .line 104
    .line 105
    return-wide p1

    .line 106
    :cond_7
    :goto_2
    return-wide v1
.end method
