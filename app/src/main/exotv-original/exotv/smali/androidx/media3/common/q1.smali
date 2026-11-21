.class public final Landroidx/media3/common/q1;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final f:Ljava/lang/String;

.field public static final g:Ljava/lang/String;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:[Landroidx/media3/common/w;

.field public e:I


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
    sput-object v0, Landroidx/media3/common/q1;->f:Ljava/lang/String;

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
    sput-object v0, Landroidx/media3/common/q1;->g:Ljava/lang/String;

    .line 18
    .line 19
    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;[Landroidx/media3/common/w;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    array-length v0, p2

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    move v0, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v2

    .line 12
    :goto_0
    invoke-static {v0}, Lh1/a;->d(Z)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Landroidx/media3/common/q1;->b:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p2, p0, Landroidx/media3/common/q1;->d:[Landroidx/media3/common/w;

    .line 18
    .line 19
    array-length p1, p2

    .line 20
    iput p1, p0, Landroidx/media3/common/q1;->a:I

    .line 21
    .line 22
    aget-object p1, p2, v2

    .line 23
    .line 24
    iget-object p1, p1, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {p1}, Landroidx/media3/common/u0;->i(Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    const/4 v0, -0x1

    .line 31
    if-ne p1, v0, :cond_1

    .line 32
    .line 33
    aget-object p1, p2, v2

    .line 34
    .line 35
    iget-object p1, p1, Landroidx/media3/common/w;->m:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p1}, Landroidx/media3/common/u0;->i(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    :cond_1
    iput p1, p0, Landroidx/media3/common/q1;->c:I

    .line 42
    .line 43
    aget-object p1, p2, v2

    .line 44
    .line 45
    iget-object p1, p1, Landroidx/media3/common/w;->d:Ljava/lang/String;

    .line 46
    .line 47
    const-string v0, ""

    .line 48
    .line 49
    const-string v3, "und"

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_3

    .line 58
    .line 59
    :cond_2
    move-object p1, v0

    .line 60
    :cond_3
    aget-object v4, p2, v2

    .line 61
    .line 62
    iget v4, v4, Landroidx/media3/common/w;->f:I

    .line 63
    .line 64
    or-int/lit16 v4, v4, 0x4000

    .line 65
    .line 66
    :goto_1
    array-length v5, p2

    .line 67
    if-ge v1, v5, :cond_8

    .line 68
    .line 69
    aget-object v5, p2, v1

    .line 70
    .line 71
    iget-object v5, v5, Landroidx/media3/common/w;->d:Ljava/lang/String;

    .line 72
    .line 73
    if-eqz v5, :cond_4

    .line 74
    .line 75
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_5

    .line 80
    .line 81
    :cond_4
    move-object v5, v0

    .line 82
    :cond_5
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-nez v5, :cond_6

    .line 87
    .line 88
    aget-object p1, p2, v2

    .line 89
    .line 90
    iget-object p1, p1, Landroidx/media3/common/w;->d:Ljava/lang/String;

    .line 91
    .line 92
    aget-object p2, p2, v1

    .line 93
    .line 94
    iget-object p2, p2, Landroidx/media3/common/w;->d:Ljava/lang/String;

    .line 95
    .line 96
    const-string v0, "languages"

    .line 97
    .line 98
    invoke-static {v1, v0, p1, p2}, Landroidx/media3/common/q1;->c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_6
    aget-object v5, p2, v1

    .line 103
    .line 104
    iget v5, v5, Landroidx/media3/common/w;->f:I

    .line 105
    .line 106
    or-int/lit16 v5, v5, 0x4000

    .line 107
    .line 108
    if-eq v4, v5, :cond_7

    .line 109
    .line 110
    aget-object p1, p2, v2

    .line 111
    .line 112
    iget p1, p1, Landroidx/media3/common/w;->f:I

    .line 113
    .line 114
    invoke-static {p1}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    aget-object p2, p2, v1

    .line 119
    .line 120
    iget p2, p2, Landroidx/media3/common/w;->f:I

    .line 121
    .line 122
    invoke-static {p2}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    const-string v0, "role flags"

    .line 127
    .line 128
    invoke-static {v1, v0, p1, p2}, Landroidx/media3/common/q1;->c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_8
    return-void
.end method

.method public static a(Landroid/os/Bundle;)Landroidx/media3/common/q1;
    .locals 3

    .line 1
    sget-object v0, Landroidx/media3/common/q1;->f:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lf6/m0;->k:Lf6/k0;

    .line 10
    .line 11
    sget-object v0, Lf6/l1;->n:Lf6/l1;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v1, Landroidx/media3/common/n;

    .line 15
    .line 16
    const/16 v2, 0x8

    .line 17
    .line 18
    invoke-direct {v1, v2}, Landroidx/media3/common/n;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v0}, Lh1/a;->q(Le6/d;Ljava/util/List;)Lf6/l1;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    sget-object v1, Landroidx/media3/common/q1;->g:Ljava/lang/String;

    .line 26
    .line 27
    const-string v2, ""

    .line 28
    .line 29
    invoke-virtual {p0, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    new-instance v1, Landroidx/media3/common/q1;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    new-array v2, v2, [Landroidx/media3/common/w;

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Lf6/h0;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, [Landroidx/media3/common/w;

    .line 43
    .line 44
    invoke-direct {v1, p0, v0}, Landroidx/media3/common/q1;-><init>(Ljava/lang/String;[Landroidx/media3/common/w;)V

    .line 45
    .line 46
    .line 47
    return-object v1
.end method

.method public static c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Different "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p1, " combined in one TrackGroup: \'"

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p1, "\' (track 0) and \'"

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p1, "\' (track "

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p0, ")"

    .line 38
    .line 39
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-string p0, "TrackGroup"

    .line 50
    .line 51
    const-string p1, ""

    .line 52
    .line 53
    invoke-static {p0, p1, v0}, Lh1/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final b(Landroidx/media3/common/w;)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Landroidx/media3/common/q1;->d:[Landroidx/media3/common/w;

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ge v0, v2, :cond_1

    .line 6
    .line 7
    aget-object v1, v1, v0

    .line 8
    .line 9
    if-ne p1, v1, :cond_0

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const/4 p1, -0x1

    .line 16
    return p1
.end method

.method public final d()Landroid/os/Bundle;
    .locals 7

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object v2, p0, Landroidx/media3/common/q1;->d:[Landroidx/media3/common/w;

    .line 9
    .line 10
    array-length v3, v2

    .line 11
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    array-length v3, v2

    .line 15
    const/4 v4, 0x0

    .line 16
    :goto_0
    if-ge v4, v3, :cond_0

    .line 17
    .line 18
    aget-object v5, v2, v4

    .line 19
    .line 20
    const/4 v6, 0x1

    .line 21
    invoke-virtual {v5, v6}, Landroidx/media3/common/w;->d(Z)Landroid/os/Bundle;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    add-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    sget-object v2, Landroidx/media3/common/q1;->f:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 34
    .line 35
    .line 36
    sget-object v1, Landroidx/media3/common/q1;->g:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v2, p0, Landroidx/media3/common/q1;->b:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
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
    const-class v2, Landroidx/media3/common/q1;

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
    check-cast p1, Landroidx/media3/common/q1;

    .line 18
    .line 19
    iget-object v2, p0, Landroidx/media3/common/q1;->b:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v3, p1, Landroidx/media3/common/q1;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iget-object v2, p0, Landroidx/media3/common/q1;->d:[Landroidx/media3/common/w;

    .line 30
    .line 31
    iget-object p1, p1, Landroidx/media3/common/q1;->d:[Landroidx/media3/common/w;

    .line 32
    .line 33
    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    return v0

    .line 40
    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Landroidx/media3/common/q1;->e:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/common/q1;->b:Ljava/lang/String;

    .line 6
    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    const/16 v2, 0x20f

    .line 10
    .line 11
    invoke-static {v0, v2, v1}, La1/a1;->e(Ljava/lang/String;II)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p0, Landroidx/media3/common/q1;->d:[Landroidx/media3/common/w;

    .line 16
    .line 17
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    add-int/2addr v1, v0

    .line 22
    iput v1, p0, Landroidx/media3/common/q1;->e:I

    .line 23
    .line 24
    :cond_0
    iget v0, p0, Landroidx/media3/common/q1;->e:I

    .line 25
    .line 26
    return v0
.end method
