.class public final Landroidx/media3/common/n1;
.super Landroidx/media3/common/p1;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:Lf6/m0;

.field public final b:Lf6/m0;

.field public final c:[I

.field public final d:[I


# direct methods
.method public constructor <init>(Lf6/l1;Lf6/l1;[I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget v0, p1, Lf6/l1;->m:I

    .line 5
    .line 6
    array-length v1, p3

    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v2

    .line 13
    :goto_0
    invoke-static {v0}, Lh1/a;->d(Z)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Landroidx/media3/common/n1;->a:Lf6/m0;

    .line 17
    .line 18
    iput-object p2, p0, Landroidx/media3/common/n1;->b:Lf6/m0;

    .line 19
    .line 20
    iput-object p3, p0, Landroidx/media3/common/n1;->c:[I

    .line 21
    .line 22
    array-length p1, p3

    .line 23
    new-array p1, p1, [I

    .line 24
    .line 25
    iput-object p1, p0, Landroidx/media3/common/n1;->d:[I

    .line 26
    .line 27
    :goto_1
    array-length p1, p3

    .line 28
    if-ge v2, p1, :cond_1

    .line 29
    .line 30
    iget-object p1, p0, Landroidx/media3/common/n1;->d:[I

    .line 31
    .line 32
    aget p2, p3, v2

    .line 33
    .line 34
    aput v2, p1, p2

    .line 35
    .line 36
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    return-void
.end method


# virtual methods
.method public final getFirstWindowIndex(Z)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, -0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Landroidx/media3/common/n1;->c:[I

    .line 13
    .line 14
    aget p1, p1, v0

    .line 15
    .line 16
    return p1

    .line 17
    :cond_1
    return v0
.end method

.method public final getIndexOfPeriod(Ljava/lang/Object;)I
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

.method public final getLastWindowIndex(Z)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, -0x1

    .line 8
    return p1

    .line 9
    :cond_0
    iget-object v0, p0, Landroidx/media3/common/n1;->a:Lf6/m0;

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    add-int/lit8 p1, p1, -0x1

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/media3/common/n1;->c:[I

    .line 20
    .line 21
    aget p1, v0, p1

    .line 22
    .line 23
    return p1

    .line 24
    :cond_1
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    add-int/lit8 p1, p1, -0x1

    .line 29
    .line 30
    return p1
.end method

.method public final getNextWindowIndex(IIZ)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p2, v0, :cond_0

    .line 3
    .line 4
    return p1

    .line 5
    :cond_0
    invoke-virtual {p0, p3}, Landroidx/media3/common/n1;->getLastWindowIndex(Z)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ne p1, v1, :cond_2

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    if-ne p2, p1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, p3}, Landroidx/media3/common/n1;->getFirstWindowIndex(Z)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_1
    const/4 p1, -0x1

    .line 20
    return p1

    .line 21
    :cond_2
    if-eqz p3, :cond_3

    .line 22
    .line 23
    iget-object p2, p0, Landroidx/media3/common/n1;->d:[I

    .line 24
    .line 25
    aget p1, p2, p1

    .line 26
    .line 27
    add-int/2addr p1, v0

    .line 28
    iget-object p2, p0, Landroidx/media3/common/n1;->c:[I

    .line 29
    .line 30
    aget p1, p2, p1

    .line 31
    .line 32
    return p1

    .line 33
    :cond_3
    add-int/2addr p1, v0

    .line 34
    return p1
.end method

.method public final getPeriod(ILandroidx/media3/common/m1;Z)Landroidx/media3/common/m1;
    .locals 10

    .line 1
    iget-object p3, p0, Landroidx/media3/common/n1;->b:Lf6/m0;

    .line 2
    .line 3
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroidx/media3/common/m1;

    .line 8
    .line 9
    iget-object v1, p1, Landroidx/media3/common/m1;->a:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v2, p1, Landroidx/media3/common/m1;->b:Ljava/lang/Object;

    .line 12
    .line 13
    iget v3, p1, Landroidx/media3/common/m1;->c:I

    .line 14
    .line 15
    iget-wide v4, p1, Landroidx/media3/common/m1;->d:J

    .line 16
    .line 17
    iget-wide v6, p1, Landroidx/media3/common/m1;->e:J

    .line 18
    .line 19
    iget-object v8, p1, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 20
    .line 21
    iget-boolean v9, p1, Landroidx/media3/common/m1;->f:Z

    .line 22
    .line 23
    move-object v0, p2

    .line 24
    invoke-virtual/range {v0 .. v9}, Landroidx/media3/common/m1;->i(Ljava/lang/Object;Ljava/lang/Object;IJJLandroidx/media3/common/c;Z)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public final getPeriodCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/common/n1;->b:Lf6/m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getPreviousWindowIndex(IIZ)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p2, v0, :cond_0

    .line 3
    .line 4
    return p1

    .line 5
    :cond_0
    invoke-virtual {p0, p3}, Landroidx/media3/common/n1;->getFirstWindowIndex(Z)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ne p1, v1, :cond_2

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    if-ne p2, p1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, p3}, Landroidx/media3/common/n1;->getLastWindowIndex(Z)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_1
    const/4 p1, -0x1

    .line 20
    return p1

    .line 21
    :cond_2
    if-eqz p3, :cond_3

    .line 22
    .line 23
    iget-object p2, p0, Landroidx/media3/common/n1;->d:[I

    .line 24
    .line 25
    aget p1, p2, p1

    .line 26
    .line 27
    sub-int/2addr p1, v0

    .line 28
    iget-object p2, p0, Landroidx/media3/common/n1;->c:[I

    .line 29
    .line 30
    aget p1, p2, p1

    .line 31
    .line 32
    return p1

    .line 33
    :cond_3
    sub-int/2addr p1, v0

    .line 34
    return p1
.end method

.method public final getUidOfPeriod(I)Ljava/lang/Object;
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

.method public final getWindow(ILandroidx/media3/common/o1;J)Landroidx/media3/common/o1;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/common/n1;->a:Lf6/m0;

    .line 4
    .line 5
    move/from16 v2, p1

    .line 6
    .line 7
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Landroidx/media3/common/o1;

    .line 12
    .line 13
    iget-object v2, v1, Landroidx/media3/common/o1;->a:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, v2

    .line 16
    iget-object v2, v1, Landroidx/media3/common/o1;->c:Landroidx/media3/common/o0;

    .line 17
    .line 18
    move-object v4, v3

    .line 19
    iget-object v3, v1, Landroidx/media3/common/o1;->d:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v6, v4

    .line 22
    iget-wide v4, v1, Landroidx/media3/common/o1;->e:J

    .line 23
    .line 24
    move-object v8, v6

    .line 25
    iget-wide v6, v1, Landroidx/media3/common/o1;->f:J

    .line 26
    .line 27
    move-object v10, v8

    .line 28
    iget-wide v8, v1, Landroidx/media3/common/o1;->g:J

    .line 29
    .line 30
    move-object v11, v10

    .line 31
    iget-boolean v10, v1, Landroidx/media3/common/o1;->h:Z

    .line 32
    .line 33
    move-object v12, v11

    .line 34
    iget-boolean v11, v1, Landroidx/media3/common/o1;->i:Z

    .line 35
    .line 36
    move-object v13, v12

    .line 37
    iget-object v12, v1, Landroidx/media3/common/o1;->j:Landroidx/media3/common/i0;

    .line 38
    .line 39
    move-object v15, v13

    .line 40
    iget-wide v13, v1, Landroidx/media3/common/o1;->l:J

    .line 41
    .line 42
    move-object/from16 v16, v2

    .line 43
    .line 44
    move-object/from16 v17, v3

    .line 45
    .line 46
    iget-wide v2, v1, Landroidx/media3/common/o1;->m:J

    .line 47
    .line 48
    iget v0, v1, Landroidx/media3/common/o1;->n:I

    .line 49
    .line 50
    move/from16 v18, v0

    .line 51
    .line 52
    iget v0, v1, Landroidx/media3/common/o1;->o:I

    .line 53
    .line 54
    move-wide/from16 v19, v2

    .line 55
    .line 56
    iget-wide v2, v1, Landroidx/media3/common/o1;->p:J

    .line 57
    .line 58
    move-object/from16 v21, v1

    .line 59
    .line 60
    move-object v1, v15

    .line 61
    move/from16 v22, v0

    .line 62
    .line 63
    move-object/from16 v0, p2

    .line 64
    .line 65
    move/from16 v23, v18

    .line 66
    .line 67
    move/from16 v18, v22

    .line 68
    .line 69
    move-wide/from16 v24, v2

    .line 70
    .line 71
    move-object/from16 v2, v16

    .line 72
    .line 73
    move-object/from16 v3, v17

    .line 74
    .line 75
    move/from16 v17, v23

    .line 76
    .line 77
    move-wide/from16 v15, v19

    .line 78
    .line 79
    move-wide/from16 v19, v24

    .line 80
    .line 81
    invoke-virtual/range {v0 .. v20}, Landroidx/media3/common/o1;->b(Ljava/lang/Object;Landroidx/media3/common/o0;Ljava/lang/Object;JJJZZLandroidx/media3/common/i0;JJIIJ)V

    .line 82
    .line 83
    .line 84
    move-object/from16 v1, v21

    .line 85
    .line 86
    iget-boolean v1, v1, Landroidx/media3/common/o1;->k:Z

    .line 87
    .line 88
    iput-boolean v1, v0, Landroidx/media3/common/o1;->k:Z

    .line 89
    .line 90
    return-object v0
.end method

.method public final getWindowCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/common/n1;->a:Lf6/m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
