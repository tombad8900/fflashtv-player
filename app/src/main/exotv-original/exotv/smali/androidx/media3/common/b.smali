.class public final Landroidx/media3/common/b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final j:Ljava/lang/String;

.field public static final k:Ljava/lang/String;

.field public static final l:Ljava/lang/String;

.field public static final m:Ljava/lang/String;

.field public static final n:Ljava/lang/String;

.field public static final o:Ljava/lang/String;

.field public static final p:Ljava/lang/String;

.field public static final q:Ljava/lang/String;

.field public static final r:Ljava/lang/String;


# instance fields
.field public final a:J

.field public final b:I

.field public final c:I

.field public final d:[Landroid/net/Uri;

.field public final e:[Landroidx/media3/common/o0;

.field public final f:[I

.field public final g:[J

.field public final h:J

.field public final i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Lh1/i0;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/16 v1, 0x24

    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Landroidx/media3/common/b;->j:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Landroidx/media3/common/b;->k:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Landroidx/media3/common/b;->l:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v0, 0x3

    .line 27
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Landroidx/media3/common/b;->m:Ljava/lang/String;

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Landroidx/media3/common/b;->n:Ljava/lang/String;

    .line 39
    .line 40
    const/4 v0, 0x5

    .line 41
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Landroidx/media3/common/b;->o:Ljava/lang/String;

    .line 46
    .line 47
    const/4 v0, 0x6

    .line 48
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 53
    .line 54
    const/4 v0, 0x7

    .line 55
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Landroidx/media3/common/b;->q:Ljava/lang/String;

    .line 60
    .line 61
    const/16 v0, 0x8

    .line 62
    .line 63
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, Landroidx/media3/common/b;->r:Ljava/lang/String;

    .line 68
    .line 69
    return-void
.end method

.method public constructor <init>(J)V
    .locals 12

    const/4 v0, 0x0

    .line 1
    new-array v6, v0, [I

    new-array v7, v0, [Landroidx/media3/common/o0;

    new-array v8, v0, [J

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v4, -0x1

    const/4 v5, -0x1

    move-object v1, p0

    move-wide v2, p1

    invoke-direct/range {v1 .. v11}, Landroidx/media3/common/b;-><init>(JII[I[Landroidx/media3/common/o0;[JJZ)V

    return-void
.end method

.method public constructor <init>(JII[I[Landroidx/media3/common/o0;[JJZ)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    array-length v0, p5

    array-length v1, p6

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lh1/a;->d(Z)V

    .line 4
    iput-wide p1, p0, Landroidx/media3/common/b;->a:J

    .line 5
    iput p3, p0, Landroidx/media3/common/b;->b:I

    .line 6
    iput p4, p0, Landroidx/media3/common/b;->c:I

    .line 7
    iput-object p5, p0, Landroidx/media3/common/b;->f:[I

    .line 8
    iput-object p6, p0, Landroidx/media3/common/b;->e:[Landroidx/media3/common/o0;

    .line 9
    iput-object p7, p0, Landroidx/media3/common/b;->g:[J

    .line 10
    iput-wide p8, p0, Landroidx/media3/common/b;->h:J

    .line 11
    iput-boolean p10, p0, Landroidx/media3/common/b;->i:Z

    .line 12
    array-length p1, p6

    new-array p1, p1, [Landroid/net/Uri;

    iput-object p1, p0, Landroidx/media3/common/b;->d:[Landroid/net/Uri;

    .line 13
    :goto_1
    iget-object p1, p0, Landroidx/media3/common/b;->d:[Landroid/net/Uri;

    array-length p2, p1

    if-ge v2, p2, :cond_2

    .line 14
    aget-object p2, p6, v2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    goto :goto_2

    :cond_1
    iget-object p2, p2, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    iget-object p2, p2, Landroidx/media3/common/j0;->a:Landroid/net/Uri;

    :goto_2
    aput-object p2, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static a(Landroid/os/Bundle;)Landroidx/media3/common/b;
    .locals 15

    .line 1
    sget-object v0, Landroidx/media3/common/b;->j:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    sget-object v0, Landroidx/media3/common/b;->k:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    sget-object v0, Landroidx/media3/common/b;->q:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    sget-object v0, Landroidx/media3/common/b;->l:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, Landroidx/media3/common/b;->r:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sget-object v6, Landroidx/media3/common/b;->m:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p0, v6}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    sget-object v7, Landroidx/media3/common/b;->n:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p0, v7}, Landroid/os/BaseBundle;->getLongArray(Ljava/lang/String;)[J

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    sget-object v8, Landroidx/media3/common/b;->o:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p0, v8}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v9

    .line 49
    sget-object v8, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {p0, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v11

    .line 55
    move-object p0, v1

    .line 56
    new-instance v1, Landroidx/media3/common/b;

    .line 57
    .line 58
    const/4 v8, 0x0

    .line 59
    if-nez v6, :cond_0

    .line 60
    .line 61
    new-array v6, v8, [I

    .line 62
    .line 63
    :cond_0
    const/4 v12, 0x0

    .line 64
    if-eqz p0, :cond_2

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    new-array v0, v0, [Landroidx/media3/common/o0;

    .line 71
    .line 72
    move v13, v8

    .line 73
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v14

    .line 77
    if-ge v13, v14, :cond_6

    .line 78
    .line 79
    invoke-virtual {p0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v14

    .line 83
    check-cast v14, Landroid/os/Bundle;

    .line 84
    .line 85
    if-nez v14, :cond_1

    .line 86
    .line 87
    move-object v14, v12

    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-static {v14}, Landroidx/media3/common/o0;->b(Landroid/os/Bundle;)Landroidx/media3/common/o0;

    .line 90
    .line 91
    .line 92
    move-result-object v14

    .line 93
    :goto_1
    aput-object v14, v0, v13

    .line 94
    .line 95
    add-int/lit8 v13, v13, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    if-eqz v0, :cond_5

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    new-array p0, p0, [Landroidx/media3/common/o0;

    .line 105
    .line 106
    move v13, v8

    .line 107
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 108
    .line 109
    .line 110
    move-result v14

    .line 111
    if-ge v13, v14, :cond_4

    .line 112
    .line 113
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v14

    .line 117
    check-cast v14, Landroid/net/Uri;

    .line 118
    .line 119
    if-nez v14, :cond_3

    .line 120
    .line 121
    move-object v14, v12

    .line 122
    goto :goto_3

    .line 123
    :cond_3
    invoke-static {v14}, Landroidx/media3/common/o0;->c(Landroid/net/Uri;)Landroidx/media3/common/o0;

    .line 124
    .line 125
    .line 126
    move-result-object v14

    .line 127
    :goto_3
    aput-object v14, p0, v13

    .line 128
    .line 129
    add-int/lit8 v13, v13, 0x1

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_4
    move-object v0, p0

    .line 133
    goto :goto_4

    .line 134
    :cond_5
    new-array v0, v8, [Landroidx/media3/common/o0;

    .line 135
    .line 136
    :cond_6
    :goto_4
    if-nez v7, :cond_7

    .line 137
    .line 138
    new-array v7, v8, [J

    .line 139
    .line 140
    :cond_7
    move-object v8, v7

    .line 141
    move-object v7, v0

    .line 142
    invoke-direct/range {v1 .. v11}, Landroidx/media3/common/b;-><init>(JII[I[Landroidx/media3/common/o0;[JJZ)V

    .line 143
    .line 144
    .line 145
    return-object v1
.end method


# virtual methods
.method public final b(I)I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    add-int/2addr p1, v0

    .line 3
    :goto_0
    iget-object v1, p0, Landroidx/media3/common/b;->f:[I

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-ge p1, v2, :cond_1

    .line 7
    .line 8
    iget-boolean v2, p0, Landroidx/media3/common/b;->i:Z

    .line 9
    .line 10
    if-nez v2, :cond_1

    .line 11
    .line 12
    aget v1, v1, p1

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    if-ne v1, v0, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    :goto_1
    return p1
.end method

.method public final c(I)Landroidx/media3/common/b;
    .locals 14

    .line 1
    iget-object v0, p0, Landroidx/media3/common/b;->f:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([II)[I

    .line 9
    .line 10
    .line 11
    move-result-object v8

    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {v8, v1, v2, v0}, Ljava/util/Arrays;->fill([IIII)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/common/b;->g:[J

    .line 17
    .line 18
    array-length v1, v0

    .line 19
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 24
    .line 25
    .line 26
    move-result-object v10

    .line 27
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v10, v1, v2, v3, v4}, Ljava/util/Arrays;->fill([JIIJ)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Landroidx/media3/common/b;->e:[Landroidx/media3/common/o0;

    .line 36
    .line 37
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    move-object v9, v0

    .line 42
    check-cast v9, [Landroidx/media3/common/o0;

    .line 43
    .line 44
    new-instance v3, Landroidx/media3/common/b;

    .line 45
    .line 46
    iget-wide v11, p0, Landroidx/media3/common/b;->h:J

    .line 47
    .line 48
    iget-boolean v13, p0, Landroidx/media3/common/b;->i:Z

    .line 49
    .line 50
    iget-wide v4, p0, Landroidx/media3/common/b;->a:J

    .line 51
    .line 52
    iget v7, p0, Landroidx/media3/common/b;->c:I

    .line 53
    .line 54
    move v6, p1

    .line 55
    invoke-direct/range {v3 .. v13}, Landroidx/media3/common/b;-><init>(JII[I[Landroidx/media3/common/o0;[JJZ)V

    .line 56
    .line 57
    .line 58
    return-object v3
.end method

.method public final d([J)Landroidx/media3/common/b;
    .locals 11

    .line 1
    array-length v0, p1

    .line 2
    iget-object v1, p0, Landroidx/media3/common/b;->e:[Landroidx/media3/common/o0;

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ge v0, v2, :cond_1

    .line 6
    .line 7
    array-length v0, v1

    .line 8
    array-length v1, p1

    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {p1, v1, v0, v2, v3}, Ljava/util/Arrays;->fill([JIIJ)V

    .line 23
    .line 24
    .line 25
    :cond_0
    :goto_0
    move-object v7, p1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    iget v0, p0, Landroidx/media3/common/b;->b:I

    .line 28
    .line 29
    const/4 v2, -0x1

    .line 30
    if-eq v0, v2, :cond_0

    .line 31
    .line 32
    array-length v0, p1

    .line 33
    array-length v2, v1

    .line 34
    if-le v0, v2, :cond_0

    .line 35
    .line 36
    array-length v0, v1

    .line 37
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    goto :goto_0

    .line 42
    :goto_1
    new-instance v0, Landroidx/media3/common/b;

    .line 43
    .line 44
    iget-wide v8, p0, Landroidx/media3/common/b;->h:J

    .line 45
    .line 46
    iget-boolean v10, p0, Landroidx/media3/common/b;->i:Z

    .line 47
    .line 48
    iget-wide v1, p0, Landroidx/media3/common/b;->a:J

    .line 49
    .line 50
    iget v3, p0, Landroidx/media3/common/b;->b:I

    .line 51
    .line 52
    iget v4, p0, Landroidx/media3/common/b;->c:I

    .line 53
    .line 54
    iget-object v5, p0, Landroidx/media3/common/b;->f:[I

    .line 55
    .line 56
    iget-object v6, p0, Landroidx/media3/common/b;->e:[Landroidx/media3/common/o0;

    .line 57
    .line 58
    invoke-direct/range {v0 .. v10}, Landroidx/media3/common/b;-><init>(JII[I[Landroidx/media3/common/o0;[JJZ)V

    .line 59
    .line 60
    .line 61
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

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
    const-class v2, Landroidx/media3/common/b;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Landroidx/media3/common/b;

    .line 18
    .line 19
    iget-wide v2, p0, Landroidx/media3/common/b;->a:J

    .line 20
    .line 21
    iget-wide v4, p1, Landroidx/media3/common/b;->a:J

    .line 22
    .line 23
    cmp-long v2, v2, v4

    .line 24
    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    iget v2, p0, Landroidx/media3/common/b;->b:I

    .line 28
    .line 29
    iget v3, p1, Landroidx/media3/common/b;->b:I

    .line 30
    .line 31
    if-ne v2, v3, :cond_2

    .line 32
    .line 33
    iget v2, p0, Landroidx/media3/common/b;->c:I

    .line 34
    .line 35
    iget v3, p1, Landroidx/media3/common/b;->c:I

    .line 36
    .line 37
    if-ne v2, v3, :cond_2

    .line 38
    .line 39
    iget-object v2, p0, Landroidx/media3/common/b;->e:[Landroidx/media3/common/o0;

    .line 40
    .line 41
    iget-object v3, p1, Landroidx/media3/common/b;->e:[Landroidx/media3/common/o0;

    .line 42
    .line 43
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    iget-object v2, p0, Landroidx/media3/common/b;->f:[I

    .line 50
    .line 51
    iget-object v3, p1, Landroidx/media3/common/b;->f:[I

    .line 52
    .line 53
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([I[I)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    iget-object v2, p0, Landroidx/media3/common/b;->g:[J

    .line 60
    .line 61
    iget-object v3, p1, Landroidx/media3/common/b;->g:[J

    .line 62
    .line 63
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([J[J)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_2

    .line 68
    .line 69
    iget-wide v2, p0, Landroidx/media3/common/b;->h:J

    .line 70
    .line 71
    iget-wide v4, p1, Landroidx/media3/common/b;->h:J

    .line 72
    .line 73
    cmp-long v2, v2, v4

    .line 74
    .line 75
    if-nez v2, :cond_2

    .line 76
    .line 77
    iget-boolean v2, p0, Landroidx/media3/common/b;->i:Z

    .line 78
    .line 79
    iget-boolean p1, p1, Landroidx/media3/common/b;->i:Z

    .line 80
    .line 81
    if-ne v2, p1, :cond_2

    .line 82
    .line 83
    return v0

    .line 84
    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget v0, p0, Landroidx/media3/common/b;->b:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget v1, p0, Landroidx/media3/common/b;->c:I

    .line 6
    .line 7
    add-int/2addr v0, v1

    .line 8
    mul-int/lit8 v0, v0, 0x1f

    .line 9
    .line 10
    iget-wide v1, p0, Landroidx/media3/common/b;->a:J

    .line 11
    .line 12
    const/16 v3, 0x20

    .line 13
    .line 14
    ushr-long v4, v1, v3

    .line 15
    .line 16
    xor-long/2addr v1, v4

    .line 17
    long-to-int v1, v1

    .line 18
    add-int/2addr v0, v1

    .line 19
    mul-int/lit8 v0, v0, 0x1f

    .line 20
    .line 21
    iget-object v1, p0, Landroidx/media3/common/b;->e:[Landroidx/media3/common/o0;

    .line 22
    .line 23
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    add-int/2addr v1, v0

    .line 28
    mul-int/lit8 v1, v1, 0x1f

    .line 29
    .line 30
    iget-object v0, p0, Landroidx/media3/common/b;->f:[I

    .line 31
    .line 32
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([I)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    add-int/2addr v0, v1

    .line 37
    mul-int/lit8 v0, v0, 0x1f

    .line 38
    .line 39
    iget-object v1, p0, Landroidx/media3/common/b;->g:[J

    .line 40
    .line 41
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([J)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    add-int/2addr v1, v0

    .line 46
    mul-int/lit8 v1, v1, 0x1f

    .line 47
    .line 48
    iget-wide v4, p0, Landroidx/media3/common/b;->h:J

    .line 49
    .line 50
    ushr-long v2, v4, v3

    .line 51
    .line 52
    xor-long/2addr v2, v4

    .line 53
    long-to-int v0, v2

    .line 54
    add-int/2addr v1, v0

    .line 55
    mul-int/lit8 v1, v1, 0x1f

    .line 56
    .line 57
    iget-boolean v0, p0, Landroidx/media3/common/b;->i:Z

    .line 58
    .line 59
    add-int/2addr v1, v0

    .line 60
    return v1
.end method
