.class public final Landroidx/media3/common/g0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final i:Ljava/lang/String;

.field public static final j:Ljava/lang/String;

.field public static final k:Ljava/lang/String;

.field public static final l:Ljava/lang/String;

.field public static final m:Ljava/lang/String;

.field public static final n:Ljava/lang/String;

.field public static final o:Ljava/lang/String;

.field public static final p:Ljava/lang/String;


# instance fields
.field public final a:Ljava/util/UUID;

.field public final b:Landroid/net/Uri;

.field public final c:Lf6/q0;

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Lf6/m0;

.field public final h:[B


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
    sput-object v0, Landroidx/media3/common/g0;->i:Ljava/lang/String;

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
    sput-object v0, Landroidx/media3/common/g0;->j:Ljava/lang/String;

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
    sput-object v0, Landroidx/media3/common/g0;->k:Ljava/lang/String;

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
    sput-object v0, Landroidx/media3/common/g0;->l:Ljava/lang/String;

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
    sput-object v0, Landroidx/media3/common/g0;->m:Ljava/lang/String;

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
    sput-object v0, Landroidx/media3/common/g0;->n:Ljava/lang/String;

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
    sput-object v0, Landroidx/media3/common/g0;->o:Ljava/lang/String;

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
    sput-object v0, Landroidx/media3/common/g0;->p:Ljava/lang/String;

    .line 60
    .line 61
    return-void
.end method

.method public constructor <init>(Landroidx/media3/common/f0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p1, Landroidx/media3/common/f0;->f:Z

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p1, Landroidx/media3/common/f0;->b:Landroid/net/Uri;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    goto :goto_1

    .line 15
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 16
    :goto_1
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p1, Landroidx/media3/common/f0;->a:Ljava/util/UUID;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Landroidx/media3/common/g0;->a:Ljava/util/UUID;

    .line 25
    .line 26
    iget-object v0, p1, Landroidx/media3/common/f0;->b:Landroid/net/Uri;

    .line 27
    .line 28
    iput-object v0, p0, Landroidx/media3/common/g0;->b:Landroid/net/Uri;

    .line 29
    .line 30
    iget-object v0, p1, Landroidx/media3/common/f0;->c:Lf6/q0;

    .line 31
    .line 32
    iput-object v0, p0, Landroidx/media3/common/g0;->c:Lf6/q0;

    .line 33
    .line 34
    iget-boolean v0, p1, Landroidx/media3/common/f0;->d:Z

    .line 35
    .line 36
    iput-boolean v0, p0, Landroidx/media3/common/g0;->d:Z

    .line 37
    .line 38
    iget-boolean v0, p1, Landroidx/media3/common/f0;->f:Z

    .line 39
    .line 40
    iput-boolean v0, p0, Landroidx/media3/common/g0;->f:Z

    .line 41
    .line 42
    iget-boolean v0, p1, Landroidx/media3/common/f0;->e:Z

    .line 43
    .line 44
    iput-boolean v0, p0, Landroidx/media3/common/g0;->e:Z

    .line 45
    .line 46
    iget-object v0, p1, Landroidx/media3/common/f0;->g:Lf6/m0;

    .line 47
    .line 48
    iput-object v0, p0, Landroidx/media3/common/g0;->g:Lf6/m0;

    .line 49
    .line 50
    iget-object p1, p1, Landroidx/media3/common/f0;->h:[B

    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    array-length v0, p1

    .line 55
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    const/4 p1, 0x0

    .line 61
    :goto_2
    iput-object p1, p0, Landroidx/media3/common/g0;->h:[B

    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final a()Landroidx/media3/common/f0;
    .locals 2

    .line 1
    new-instance v0, Landroidx/media3/common/f0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/common/g0;->a:Ljava/util/UUID;

    .line 7
    .line 8
    iput-object v1, v0, Landroidx/media3/common/f0;->a:Ljava/util/UUID;

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/common/g0;->b:Landroid/net/Uri;

    .line 11
    .line 12
    iput-object v1, v0, Landroidx/media3/common/f0;->b:Landroid/net/Uri;

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/media3/common/g0;->c:Lf6/q0;

    .line 15
    .line 16
    iput-object v1, v0, Landroidx/media3/common/f0;->c:Lf6/q0;

    .line 17
    .line 18
    iget-boolean v1, p0, Landroidx/media3/common/g0;->d:Z

    .line 19
    .line 20
    iput-boolean v1, v0, Landroidx/media3/common/f0;->d:Z

    .line 21
    .line 22
    iget-boolean v1, p0, Landroidx/media3/common/g0;->e:Z

    .line 23
    .line 24
    iput-boolean v1, v0, Landroidx/media3/common/f0;->e:Z

    .line 25
    .line 26
    iget-boolean v1, p0, Landroidx/media3/common/g0;->f:Z

    .line 27
    .line 28
    iput-boolean v1, v0, Landroidx/media3/common/f0;->f:Z

    .line 29
    .line 30
    iget-object v1, p0, Landroidx/media3/common/g0;->g:Lf6/m0;

    .line 31
    .line 32
    iput-object v1, v0, Landroidx/media3/common/f0;->g:Lf6/m0;

    .line 33
    .line 34
    iget-object v1, p0, Landroidx/media3/common/g0;->h:[B

    .line 35
    .line 36
    iput-object v1, v0, Landroidx/media3/common/f0;->h:[B

    .line 37
    .line 38
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
    instance-of v1, p1, Landroidx/media3/common/g0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Landroidx/media3/common/g0;

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/media3/common/g0;->a:Ljava/util/UUID;

    .line 14
    .line 15
    iget-object v3, p1, Landroidx/media3/common/g0;->a:Ljava/util/UUID;

    .line 16
    .line 17
    invoke-virtual {v1, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p1, Landroidx/media3/common/g0;->b:Landroid/net/Uri;

    .line 24
    .line 25
    sget v3, Lh1/i0;->a:I

    .line 26
    .line 27
    iget-object v3, p0, Landroidx/media3/common/g0;->b:Landroid/net/Uri;

    .line 28
    .line 29
    invoke-static {v3, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    iget-object v1, p0, Landroidx/media3/common/g0;->c:Lf6/q0;

    .line 36
    .line 37
    iget-object v3, p1, Landroidx/media3/common/g0;->c:Lf6/q0;

    .line 38
    .line 39
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    iget-boolean v1, p0, Landroidx/media3/common/g0;->d:Z

    .line 46
    .line 47
    iget-boolean v3, p1, Landroidx/media3/common/g0;->d:Z

    .line 48
    .line 49
    if-ne v1, v3, :cond_2

    .line 50
    .line 51
    iget-boolean v1, p0, Landroidx/media3/common/g0;->f:Z

    .line 52
    .line 53
    iget-boolean v3, p1, Landroidx/media3/common/g0;->f:Z

    .line 54
    .line 55
    if-ne v1, v3, :cond_2

    .line 56
    .line 57
    iget-boolean v1, p0, Landroidx/media3/common/g0;->e:Z

    .line 58
    .line 59
    iget-boolean v3, p1, Landroidx/media3/common/g0;->e:Z

    .line 60
    .line 61
    if-ne v1, v3, :cond_2

    .line 62
    .line 63
    iget-object v1, p0, Landroidx/media3/common/g0;->g:Lf6/m0;

    .line 64
    .line 65
    iget-object v3, p1, Landroidx/media3/common/g0;->g:Lf6/m0;

    .line 66
    .line 67
    invoke-virtual {v1, v3}, Lf6/m0;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    iget-object v1, p0, Landroidx/media3/common/g0;->h:[B

    .line 74
    .line 75
    iget-object p1, p1, Landroidx/media3/common/g0;->h:[B

    .line 76
    .line 77
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

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
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/common/g0;->a:Ljava/util/UUID;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/UUID;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/media3/common/g0;->b:Landroid/net/Uri;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/net/Uri;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    add-int/2addr v0, v1

    .line 20
    mul-int/lit8 v0, v0, 0x1f

    .line 21
    .line 22
    iget-object v1, p0, Landroidx/media3/common/g0;->c:Lf6/q0;

    .line 23
    .line 24
    invoke-virtual {v1}, Lf6/q0;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/2addr v1, v0

    .line 29
    mul-int/lit8 v1, v1, 0x1f

    .line 30
    .line 31
    iget-boolean v0, p0, Landroidx/media3/common/g0;->d:Z

    .line 32
    .line 33
    add-int/2addr v1, v0

    .line 34
    mul-int/lit8 v1, v1, 0x1f

    .line 35
    .line 36
    iget-boolean v0, p0, Landroidx/media3/common/g0;->f:Z

    .line 37
    .line 38
    add-int/2addr v1, v0

    .line 39
    mul-int/lit8 v1, v1, 0x1f

    .line 40
    .line 41
    iget-boolean v0, p0, Landroidx/media3/common/g0;->e:Z

    .line 42
    .line 43
    add-int/2addr v1, v0

    .line 44
    mul-int/lit8 v1, v1, 0x1f

    .line 45
    .line 46
    iget-object v0, p0, Landroidx/media3/common/g0;->g:Lf6/m0;

    .line 47
    .line 48
    invoke-virtual {v0}, Lf6/m0;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    add-int/2addr v0, v1

    .line 53
    mul-int/lit8 v0, v0, 0x1f

    .line 54
    .line 55
    iget-object v1, p0, Landroidx/media3/common/g0;->h:[B

    .line 56
    .line 57
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    add-int/2addr v1, v0

    .line 62
    return v1
.end method
