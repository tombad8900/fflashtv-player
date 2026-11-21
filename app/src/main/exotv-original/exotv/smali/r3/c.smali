.class public final Lr3/c;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:Li7/r;

.field public final b:Li7/r;

.field public final c:Li7/r;

.field public final d:Li7/r;

.field public final e:Lu3/b;

.field public final f:Ls3/d;

.field public final g:Landroid/graphics/Bitmap$Config;

.field public final h:Z

.field public final i:Lr3/b;

.field public final j:Lr3/b;

.field public final k:Lr3/b;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    sget-object v0, Li7/e0;->a:Lo7/e;

    .line 2
    .line 3
    sget-object v0, Lm7/n;->a:Lj7/d;

    .line 4
    .line 5
    iget-object v0, v0, Lj7/d;->n:Lj7/d;

    .line 6
    .line 7
    sget-object v1, Lo7/d;->l:Lo7/d;

    .line 8
    .line 9
    sget-object v2, Ls3/d;->j:Ls3/d;

    .line 10
    .line 11
    sget-object v3, Lv3/f;->b:Landroid/graphics/Bitmap$Config;

    .line 12
    .line 13
    sget-object v4, Lr3/b;->l:Lr3/b;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lr3/c;->a:Li7/r;

    .line 19
    .line 20
    iput-object v1, p0, Lr3/c;->b:Li7/r;

    .line 21
    .line 22
    iput-object v1, p0, Lr3/c;->c:Li7/r;

    .line 23
    .line 24
    iput-object v1, p0, Lr3/c;->d:Li7/r;

    .line 25
    .line 26
    sget-object v0, Lu3/d;->a:Lu3/b;

    .line 27
    .line 28
    iput-object v0, p0, Lr3/c;->e:Lu3/b;

    .line 29
    .line 30
    iput-object v2, p0, Lr3/c;->f:Ls3/d;

    .line 31
    .line 32
    iput-object v3, p0, Lr3/c;->g:Landroid/graphics/Bitmap$Config;

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p0, Lr3/c;->h:Z

    .line 36
    .line 37
    iput-object v4, p0, Lr3/c;->i:Lr3/b;

    .line 38
    .line 39
    iput-object v4, p0, Lr3/c;->j:Lr3/b;

    .line 40
    .line 41
    iput-object v4, p0, Lr3/c;->k:Lr3/b;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lr3/c;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, Lr3/c;

    .line 9
    .line 10
    iget-object v0, p1, Lr3/c;->a:Li7/r;

    .line 11
    .line 12
    iget-object v1, p0, Lr3/c;->a:Li7/r;

    .line 13
    .line 14
    invoke-static {v1, v0}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lr3/c;->b:Li7/r;

    .line 21
    .line 22
    iget-object v1, p1, Lr3/c;->b:Li7/r;

    .line 23
    .line 24
    invoke-static {v0, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lr3/c;->c:Li7/r;

    .line 31
    .line 32
    iget-object v1, p1, Lr3/c;->c:Li7/r;

    .line 33
    .line 34
    invoke-static {v0, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    iget-object v0, p0, Lr3/c;->d:Li7/r;

    .line 41
    .line 42
    iget-object v1, p1, Lr3/c;->d:Li7/r;

    .line 43
    .line 44
    invoke-static {v0, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    iget-object v0, p0, Lr3/c;->e:Lu3/b;

    .line 51
    .line 52
    iget-object v1, p1, Lr3/c;->e:Lu3/b;

    .line 53
    .line 54
    invoke-static {v0, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    iget-object v0, p0, Lr3/c;->f:Ls3/d;

    .line 61
    .line 62
    iget-object v1, p1, Lr3/c;->f:Ls3/d;

    .line 63
    .line 64
    if-ne v0, v1, :cond_1

    .line 65
    .line 66
    iget-object v0, p0, Lr3/c;->g:Landroid/graphics/Bitmap$Config;

    .line 67
    .line 68
    iget-object v1, p1, Lr3/c;->g:Landroid/graphics/Bitmap$Config;

    .line 69
    .line 70
    if-ne v0, v1, :cond_1

    .line 71
    .line 72
    iget-boolean v0, p0, Lr3/c;->h:Z

    .line 73
    .line 74
    iget-boolean v1, p1, Lr3/c;->h:Z

    .line 75
    .line 76
    if-ne v0, v1, :cond_1

    .line 77
    .line 78
    iget-object v0, p0, Lr3/c;->i:Lr3/b;

    .line 79
    .line 80
    iget-object v1, p1, Lr3/c;->i:Lr3/b;

    .line 81
    .line 82
    if-ne v0, v1, :cond_1

    .line 83
    .line 84
    iget-object v0, p0, Lr3/c;->j:Lr3/b;

    .line 85
    .line 86
    iget-object v1, p1, Lr3/c;->j:Lr3/b;

    .line 87
    .line 88
    if-ne v0, v1, :cond_1

    .line 89
    .line 90
    iget-object v0, p0, Lr3/c;->k:Lr3/b;

    .line 91
    .line 92
    iget-object p1, p1, Lr3/c;->k:Lr3/b;

    .line 93
    .line 94
    if-ne v0, p1, :cond_1

    .line 95
    .line 96
    :goto_0
    const/4 p1, 0x1

    .line 97
    return p1

    .line 98
    :cond_1
    const/4 p1, 0x0

    .line 99
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr3/c;->a:Li7/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lr3/c;->b:Li7/r;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object v0, p0, Lr3/c;->c:Li7/r;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v1, p0, Lr3/c;->d:Li7/r;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v1, v0

    .line 34
    mul-int/lit8 v1, v1, 0x1f

    .line 35
    .line 36
    iget-object v0, p0, Lr3/c;->e:Lu3/b;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const-class v0, Lu3/b;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    add-int/2addr v0, v1

    .line 48
    mul-int/lit8 v0, v0, 0x1f

    .line 49
    .line 50
    iget-object v1, p0, Lr3/c;->f:Ls3/d;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    add-int/2addr v1, v0

    .line 57
    mul-int/lit8 v1, v1, 0x1f

    .line 58
    .line 59
    iget-object v0, p0, Lr3/c;->g:Landroid/graphics/Bitmap$Config;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    add-int/2addr v0, v1

    .line 66
    mul-int/lit8 v0, v0, 0x1f

    .line 67
    .line 68
    iget-boolean v1, p0, Lr3/c;->h:Z

    .line 69
    .line 70
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    add-int/2addr v1, v0

    .line 75
    mul-int/lit8 v1, v1, 0x1f

    .line 76
    .line 77
    const/4 v0, 0x0

    .line 78
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    add-int/2addr v0, v1

    .line 83
    const v1, 0xe1781

    .line 84
    .line 85
    .line 86
    mul-int/2addr v0, v1

    .line 87
    iget-object v1, p0, Lr3/c;->i:Lr3/b;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    add-int/2addr v1, v0

    .line 94
    mul-int/lit8 v1, v1, 0x1f

    .line 95
    .line 96
    iget-object v0, p0, Lr3/c;->j:Lr3/b;

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    add-int/2addr v0, v1

    .line 103
    mul-int/lit8 v0, v0, 0x1f

    .line 104
    .line 105
    iget-object v1, p0, Lr3/c;->k:Lr3/b;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    add-int/2addr v1, v0

    .line 112
    return v1
.end method
