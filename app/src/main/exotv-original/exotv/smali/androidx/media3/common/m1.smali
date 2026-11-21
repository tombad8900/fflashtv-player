.class public final Landroidx/media3/common/m1;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final h:Ljava/lang/String;

.field public static final i:Ljava/lang/String;

.field public static final j:Ljava/lang/String;

.field public static final k:Ljava/lang/String;

.field public static final l:Ljava/lang/String;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:I

.field public d:J

.field public e:J

.field public f:Z

.field public g:Landroidx/media3/common/c;


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
    sput-object v0, Landroidx/media3/common/m1;->h:Ljava/lang/String;

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
    sput-object v0, Landroidx/media3/common/m1;->i:Ljava/lang/String;

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
    sput-object v0, Landroidx/media3/common/m1;->j:Ljava/lang/String;

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
    sput-object v0, Landroidx/media3/common/m1;->k:Ljava/lang/String;

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
    sput-object v0, Landroidx/media3/common/m1;->l:Ljava/lang/String;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroidx/media3/common/c;->g:Landroidx/media3/common/c;

    .line 5
    .line 6
    iput-object v0, p0, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(II)J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget v0, p1, Landroidx/media3/common/b;->b:I

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    iget-object p1, p1, Landroidx/media3/common/b;->g:[J

    .line 13
    .line 14
    aget-wide v0, p1, p2

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    return-wide p1
.end method

.method public final b(J)I
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 2
    .line 3
    iget-wide v1, p0, Landroidx/media3/common/m1;->d:J

    .line 4
    .line 5
    iget v3, v0, Landroidx/media3/common/c;->b:I

    .line 6
    .line 7
    const-wide/high16 v4, -0x8000000000000000L

    .line 8
    .line 9
    cmp-long v6, p1, v4

    .line 10
    .line 11
    const/4 v7, -0x1

    .line 12
    if-eqz v6, :cond_4

    .line 13
    .line 14
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v6, v1, v8

    .line 20
    .line 21
    if-eqz v6, :cond_0

    .line 22
    .line 23
    cmp-long v1, p1, v1

    .line 24
    .line 25
    if-ltz v1, :cond_0

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_0
    iget v1, v0, Landroidx/media3/common/c;->e:I

    .line 29
    .line 30
    :goto_0
    if-ge v1, v3, :cond_3

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iget-wide v8, v2, Landroidx/media3/common/b;->a:J

    .line 37
    .line 38
    cmp-long v2, v8, v4

    .line 39
    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget-wide v8, v2, Landroidx/media3/common/b;->a:J

    .line 47
    .line 48
    cmp-long v2, v8, p1

    .line 49
    .line 50
    if-lez v2, :cond_2

    .line 51
    .line 52
    :cond_1
    invoke-virtual {v0, v1}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget v6, v2, Landroidx/media3/common/b;->b:I

    .line 57
    .line 58
    if-eq v6, v7, :cond_3

    .line 59
    .line 60
    invoke-virtual {v2, v7}, Landroidx/media3/common/b;->b(I)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-ge v2, v6, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    :goto_1
    if-ge v1, v3, :cond_4

    .line 71
    .line 72
    return v1

    .line 73
    :cond_4
    :goto_2
    return v7
.end method

.method public final c(J)I
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 2
    .line 3
    iget-wide v1, p0, Landroidx/media3/common/m1;->d:J

    .line 4
    .line 5
    iget v3, v0, Landroidx/media3/common/c;->b:I

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    sub-int/2addr v3, v4

    .line 9
    invoke-virtual {v0, v3}, Landroidx/media3/common/c;->b(I)Z

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    sub-int/2addr v3, v5

    .line 14
    :goto_0
    const/4 v5, -0x1

    .line 15
    if-ltz v3, :cond_4

    .line 16
    .line 17
    const-wide/high16 v6, -0x8000000000000000L

    .line 18
    .line 19
    cmp-long v8, p1, v6

    .line 20
    .line 21
    if-nez v8, :cond_0

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_0
    invoke-virtual {v0, v3}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 25
    .line 26
    .line 27
    move-result-object v8

    .line 28
    iget-wide v9, v8, Landroidx/media3/common/b;->a:J

    .line 29
    .line 30
    cmp-long v6, v9, v6

    .line 31
    .line 32
    if-nez v6, :cond_2

    .line 33
    .line 34
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    cmp-long v6, v1, v6

    .line 40
    .line 41
    if-eqz v6, :cond_3

    .line 42
    .line 43
    iget-boolean v6, v8, Landroidx/media3/common/b;->i:Z

    .line 44
    .line 45
    if-eqz v6, :cond_1

    .line 46
    .line 47
    iget v6, v8, Landroidx/media3/common/b;->b:I

    .line 48
    .line 49
    if-eq v6, v5, :cond_3

    .line 50
    .line 51
    :cond_1
    cmp-long v6, p1, v1

    .line 52
    .line 53
    if-gez v6, :cond_4

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    cmp-long v6, p1, v9

    .line 57
    .line 58
    if-gez v6, :cond_4

    .line 59
    .line 60
    :cond_3
    :goto_1
    add-int/lit8 v3, v3, -0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_4
    :goto_2
    if-ltz v3, :cond_8

    .line 64
    .line 65
    invoke-virtual {v0, v3}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iget p2, p1, Landroidx/media3/common/b;->b:I

    .line 70
    .line 71
    if-ne p2, v5, :cond_5

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_5
    const/4 v0, 0x0

    .line 75
    :goto_3
    if-ge v0, p2, :cond_8

    .line 76
    .line 77
    iget-object v1, p1, Landroidx/media3/common/b;->f:[I

    .line 78
    .line 79
    aget v1, v1, v0

    .line 80
    .line 81
    if-eqz v1, :cond_7

    .line 82
    .line 83
    if-ne v1, v4, :cond_6

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_7
    :goto_4
    return v3

    .line 90
    :cond_8
    return v5
.end method

.method public final d(I)J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-wide v0, p1, Landroidx/media3/common/b;->a:J

    .line 8
    .line 9
    return-wide v0
.end method

.method public final e(II)I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget v0, p1, Landroidx/media3/common/b;->b:I

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    iget-object p1, p1, Landroidx/media3/common/b;->f:[I

    .line 13
    .line 14
    aget p1, p1, p2

    .line 15
    .line 16
    return p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
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
    const-class v2, Landroidx/media3/common/m1;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    check-cast p1, Landroidx/media3/common/m1;

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/media3/common/m1;->a:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v3, p1, Landroidx/media3/common/m1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget v4, Lh1/i0;->a:I

    .line 28
    .line 29
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    iget-object v2, p0, Landroidx/media3/common/m1;->b:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v3, p1, Landroidx/media3/common/m1;->b:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    iget v2, p0, Landroidx/media3/common/m1;->c:I

    .line 46
    .line 47
    iget v3, p1, Landroidx/media3/common/m1;->c:I

    .line 48
    .line 49
    if-ne v2, v3, :cond_2

    .line 50
    .line 51
    iget-wide v2, p0, Landroidx/media3/common/m1;->d:J

    .line 52
    .line 53
    iget-wide v4, p1, Landroidx/media3/common/m1;->d:J

    .line 54
    .line 55
    cmp-long v2, v2, v4

    .line 56
    .line 57
    if-nez v2, :cond_2

    .line 58
    .line 59
    iget-wide v2, p0, Landroidx/media3/common/m1;->e:J

    .line 60
    .line 61
    iget-wide v4, p1, Landroidx/media3/common/m1;->e:J

    .line 62
    .line 63
    cmp-long v2, v2, v4

    .line 64
    .line 65
    if-nez v2, :cond_2

    .line 66
    .line 67
    iget-boolean v2, p0, Landroidx/media3/common/m1;->f:Z

    .line 68
    .line 69
    iget-boolean v3, p1, Landroidx/media3/common/m1;->f:Z

    .line 70
    .line 71
    if-ne v2, v3, :cond_2

    .line 72
    .line 73
    iget-object v2, p0, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 74
    .line 75
    iget-object p1, p1, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 76
    .line 77
    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_2

    .line 82
    .line 83
    return v0

    .line 84
    :cond_2
    :goto_0
    return v1
.end method

.method public final f(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, -0x1

    .line 8
    invoke-virtual {p1, v0}, Landroidx/media3/common/b;->b(I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final g(I)Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 2
    .line 3
    iget v1, v0, Landroidx/media3/common/c;->b:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    sub-int/2addr v1, v2

    .line 7
    if-ne p1, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroidx/media3/common/c;->b(I)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    return v2

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public final h(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-boolean p1, p1, Landroidx/media3/common/b;->i:Z

    .line 8
    .line 9
    return p1
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/common/m1;->a:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    const/16 v2, 0xd9

    .line 13
    .line 14
    add-int/2addr v2, v0

    .line 15
    mul-int/lit8 v2, v2, 0x1f

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/common/m1;->b:Ljava/lang/Object;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    :goto_1
    add-int/2addr v2, v1

    .line 27
    mul-int/lit8 v2, v2, 0x1f

    .line 28
    .line 29
    iget v0, p0, Landroidx/media3/common/m1;->c:I

    .line 30
    .line 31
    add-int/2addr v2, v0

    .line 32
    mul-int/lit8 v2, v2, 0x1f

    .line 33
    .line 34
    iget-wide v0, p0, Landroidx/media3/common/m1;->d:J

    .line 35
    .line 36
    const/16 v3, 0x20

    .line 37
    .line 38
    ushr-long v4, v0, v3

    .line 39
    .line 40
    xor-long/2addr v0, v4

    .line 41
    long-to-int v0, v0

    .line 42
    add-int/2addr v2, v0

    .line 43
    mul-int/lit8 v2, v2, 0x1f

    .line 44
    .line 45
    iget-wide v0, p0, Landroidx/media3/common/m1;->e:J

    .line 46
    .line 47
    ushr-long v3, v0, v3

    .line 48
    .line 49
    xor-long/2addr v0, v3

    .line 50
    long-to-int v0, v0

    .line 51
    add-int/2addr v2, v0

    .line 52
    mul-int/lit8 v2, v2, 0x1f

    .line 53
    .line 54
    iget-boolean v0, p0, Landroidx/media3/common/m1;->f:Z

    .line 55
    .line 56
    add-int/2addr v2, v0

    .line 57
    mul-int/lit8 v2, v2, 0x1f

    .line 58
    .line 59
    iget-object v0, p0, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/media3/common/c;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    add-int/2addr v0, v2

    .line 66
    return v0
.end method

.method public final i(Ljava/lang/Object;Ljava/lang/Object;IJJLandroidx/media3/common/c;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/common/m1;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/media3/common/m1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput p3, p0, Landroidx/media3/common/m1;->c:I

    .line 6
    .line 7
    iput-wide p4, p0, Landroidx/media3/common/m1;->d:J

    .line 8
    .line 9
    iput-wide p6, p0, Landroidx/media3/common/m1;->e:J

    .line 10
    .line 11
    iput-object p8, p0, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 12
    .line 13
    iput-boolean p9, p0, Landroidx/media3/common/m1;->f:Z

    .line 14
    .line 15
    return-void
.end method
