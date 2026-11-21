.class public final Lh1/v;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:I

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lh1/v;->a:I

    packed-switch p1, :pswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object p1, Lh1/i0;->f:[B

    iput-object p1, p0, Lh1/v;->b:Ljava/lang/Object;

    return-void

    .line 3
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(II)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lh1/v;->a:I

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput p1, p0, Lh1/v;->c:I

    .line 18
    iput p2, p0, Lh1/v;->d:I

    mul-int/lit8 p2, p2, 0x2

    add-int/lit8 p2, p2, -0x1

    .line 19
    new-array p1, p2, [B

    iput-object p1, p0, Lh1/v;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 20
    iput p1, p0, Lh1/v;->e:I

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lh1/v;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lh1/v;->b:Ljava/lang/Object;

    .line 6
    array-length p1, p1

    iput p1, p0, Lh1/v;->c:I

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh1/v;->a:I

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lh1/v;->b:Ljava/lang/Object;

    .line 15
    iput p2, p0, Lh1/v;->e:I

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh1/v;->a:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lh1/v;->b:Ljava/lang/Object;

    .line 9
    iput p2, p0, Lh1/v;->d:I

    .line 10
    iput p3, p0, Lh1/v;->c:I

    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lh1/v;->e:I

    .line 12
    invoke-virtual {p0}, Lh1/v;->b()V

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 5

    .line 1
    if-ltz p1, :cond_3

    .line 2
    .line 3
    if-ltz p2, :cond_2

    .line 4
    .line 5
    iget v0, p0, Lh1/v;->e:I

    .line 6
    .line 7
    mul-int/lit8 v1, v0, 0x2

    .line 8
    .line 9
    iget-object v2, p0, Lh1/v;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, [I

    .line 12
    .line 13
    const/4 v3, 0x4

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    new-array v0, v3, [I

    .line 17
    .line 18
    iput-object v0, p0, Lh1/v;->b:Ljava/lang/Object;

    .line 19
    .line 20
    const/4 v2, -0x1

    .line 21
    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([II)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    array-length v4, v2

    .line 26
    if-lt v1, v4, :cond_1

    .line 27
    .line 28
    mul-int/2addr v0, v3

    .line 29
    new-array v0, v0, [I

    .line 30
    .line 31
    iput-object v0, p0, Lh1/v;->b:Ljava/lang/Object;

    .line 32
    .line 33
    array-length v3, v2

    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-static {v2, v4, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    iget-object v0, p0, Lh1/v;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, [I

    .line 41
    .line 42
    aput p1, v0, v1

    .line 43
    .line 44
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    aput p2, v0, v1

    .line 47
    .line 48
    iget p1, p0, Lh1/v;->e:I

    .line 49
    .line 50
    add-int/lit8 p1, p1, 0x1

    .line 51
    .line 52
    iput p1, p0, Lh1/v;->e:I

    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 56
    .line 57
    const-string p2, "Pixel distance must be non-negative"

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 64
    .line 65
    const-string p2, "Layout positions must be non-negative"

    .line 66
    .line 67
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1
.end method

.method public b()V
    .locals 2

    .line 1
    iget v0, p0, Lh1/v;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lh1/v;->d:I

    .line 7
    .line 8
    if-ltz v0, :cond_1

    .line 9
    .line 10
    iget v1, p0, Lh1/v;->c:I

    .line 11
    .line 12
    if-lt v0, v1, :cond_0

    .line 13
    .line 14
    if-ne v0, v1, :cond_1

    .line 15
    .line 16
    iget v0, p0, Lh1/v;->e:I

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    :cond_0
    const/4 v0, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    :goto_0
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_0
    iget v0, p0, Lh1/v;->c:I

    .line 28
    .line 29
    if-ltz v0, :cond_3

    .line 30
    .line 31
    iget v1, p0, Lh1/v;->e:I

    .line 32
    .line 33
    if-lt v0, v1, :cond_2

    .line 34
    .line 35
    if-ne v0, v1, :cond_3

    .line 36
    .line 37
    iget v0, p0, Lh1/v;->d:I

    .line 38
    .line 39
    if-nez v0, :cond_3

    .line 40
    .line 41
    :cond_2
    const/4 v0, 0x1

    .line 42
    goto :goto_1

    .line 43
    :cond_3
    const/4 v0, 0x0

    .line 44
    :goto_1
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c()I
    .locals 2

    .line 1
    iget v0, p0, Lh1/v;->e:I

    .line 2
    .line 3
    iget v1, p0, Lh1/v;->c:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    mul-int/lit8 v0, v0, 0x8

    .line 7
    .line 8
    iget v1, p0, Lh1/v;->d:I

    .line 9
    .line 10
    sub-int/2addr v0, v1

    .line 11
    return v0
.end method

.method public d()V
    .locals 1

    .line 1
    iget v0, p0, Lh1/v;->d:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lh1/v;->d:I

    .line 8
    .line 9
    iget v0, p0, Lh1/v;->c:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    iput v0, p0, Lh1/v;->c:I

    .line 14
    .line 15
    invoke-virtual {p0}, Lh1/v;->b()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public e(I)Z
    .locals 4

    .line 1
    iget v0, p0, Lh1/v;->d:I

    .line 2
    .line 3
    div-int/lit8 v1, p1, 0x8

    .line 4
    .line 5
    add-int v2, v0, v1

    .line 6
    .line 7
    iget v3, p0, Lh1/v;->e:I

    .line 8
    .line 9
    add-int/2addr v3, p1

    .line 10
    mul-int/lit8 v1, v1, 0x8

    .line 11
    .line 12
    sub-int/2addr v3, v1

    .line 13
    const/4 p1, 0x7

    .line 14
    if-le v3, p1, :cond_0

    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    add-int/lit8 v3, v3, -0x8

    .line 19
    .line 20
    :cond_0
    const/4 p1, 0x1

    .line 21
    :cond_1
    :goto_0
    add-int/2addr v0, p1

    .line 22
    if-gt v0, v2, :cond_2

    .line 23
    .line 24
    iget v1, p0, Lh1/v;->c:I

    .line 25
    .line 26
    if-ge v2, v1, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lh1/v;->t(I)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    add-int/lit8 v0, v0, 0x2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    iget v0, p0, Lh1/v;->c:I

    .line 40
    .line 41
    if-lt v2, v0, :cond_4

    .line 42
    .line 43
    if-ne v2, v0, :cond_3

    .line 44
    .line 45
    if-nez v3, :cond_3

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const/4 p1, 0x0

    .line 49
    :cond_4
    :goto_1
    return p1
.end method

.method public f()Z
    .locals 7

    .line 1
    iget v0, p0, Lh1/v;->d:I

    .line 2
    .line 3
    iget v1, p0, Lh1/v;->e:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    iget v4, p0, Lh1/v;->d:I

    .line 8
    .line 9
    iget v5, p0, Lh1/v;->c:I

    .line 10
    .line 11
    if-ge v4, v5, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lh1/v;->j()Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-nez v4, :cond_0

    .line 18
    .line 19
    add-int/lit8 v3, v3, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget v4, p0, Lh1/v;->d:I

    .line 23
    .line 24
    iget v5, p0, Lh1/v;->c:I

    .line 25
    .line 26
    const/4 v6, 0x1

    .line 27
    if-ne v4, v5, :cond_1

    .line 28
    .line 29
    move v4, v6

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v4, v2

    .line 32
    :goto_1
    iput v0, p0, Lh1/v;->d:I

    .line 33
    .line 34
    iput v1, p0, Lh1/v;->e:I

    .line 35
    .line 36
    if-nez v4, :cond_2

    .line 37
    .line 38
    mul-int/lit8 v3, v3, 0x2

    .line 39
    .line 40
    add-int/2addr v3, v6

    .line 41
    invoke-virtual {p0, v3}, Lh1/v;->e(I)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    return v6

    .line 48
    :cond_2
    return v2
.end method

.method public g(Landroidx/recyclerview/widget/RecyclerView;Z)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lh1/v;->e:I

    .line 3
    .line 4
    iget-object v0, p0, Lh1/v;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, [I

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView;->w:Lz2/f0;

    .line 15
    .line 16
    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView;->v:Lz2/x;

    .line 17
    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    iget-boolean v1, v0, Lz2/f0;->i:Z

    .line 23
    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView;->n:Li1/s;

    .line 29
    .line 30
    invoke-virtual {v1}, Li1/s;->l()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView;->v:Lz2/x;

    .line 37
    .line 38
    invoke-virtual {v1}, Lz2/x;->a()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {v0, v1, p0}, Lz2/f0;->i(ILh1/v;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->O()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_2

    .line 51
    .line 52
    iget v1, p0, Lh1/v;->c:I

    .line 53
    .line 54
    iget v2, p0, Lh1/v;->d:I

    .line 55
    .line 56
    iget-object v3, p1, Landroidx/recyclerview/widget/RecyclerView;->p0:Lz2/r0;

    .line 57
    .line 58
    invoke-virtual {v0, v1, v2, v3, p0}, Lz2/f0;->h(IILz2/r0;Lh1/v;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    :goto_0
    iget v1, p0, Lh1/v;->e:I

    .line 62
    .line 63
    iget v2, v0, Lz2/f0;->j:I

    .line 64
    .line 65
    if-le v1, v2, :cond_3

    .line 66
    .line 67
    iput v1, v0, Lz2/f0;->j:I

    .line 68
    .line 69
    iput-boolean p2, v0, Lz2/f0;->k:Z

    .line 70
    .line 71
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->l:Lz2/l0;

    .line 72
    .line 73
    invoke-virtual {p1}, Lz2/l0;->n()V

    .line 74
    .line 75
    .line 76
    :cond_3
    return-void
.end method

.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Lh1/v;->d:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lh1/v;->c:I

    .line 12
    .line 13
    return v0
.end method

.method public i()I
    .locals 2

    .line 1
    iget v0, p0, Lh1/v;->c:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x8

    .line 4
    .line 5
    iget v1, p0, Lh1/v;->d:I

    .line 6
    .line 7
    add-int/2addr v0, v1

    .line 8
    return v0
.end method

.method public j()Z
    .locals 3

    .line 1
    iget v0, p0, Lh1/v;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh1/v;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, [B

    .line 9
    .line 10
    iget v1, p0, Lh1/v;->d:I

    .line 11
    .line 12
    aget-byte v0, v0, v1

    .line 13
    .line 14
    and-int/lit16 v0, v0, 0xff

    .line 15
    .line 16
    iget v1, p0, Lh1/v;->e:I

    .line 17
    .line 18
    shr-int/2addr v0, v1

    .line 19
    const/4 v1, 0x1

    .line 20
    and-int/2addr v0, v1

    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    move v0, v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    invoke-virtual {p0, v1}, Lh1/v;->v(I)V

    .line 27
    .line 28
    .line 29
    return v0

    .line 30
    :pswitch_0
    iget-object v0, p0, Lh1/v;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, [B

    .line 33
    .line 34
    iget v1, p0, Lh1/v;->d:I

    .line 35
    .line 36
    aget-byte v0, v0, v1

    .line 37
    .line 38
    const/16 v1, 0x80

    .line 39
    .line 40
    iget v2, p0, Lh1/v;->e:I

    .line 41
    .line 42
    shr-int/2addr v1, v2

    .line 43
    and-int/2addr v0, v1

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const/4 v0, 0x0

    .line 49
    :goto_1
    invoke-virtual {p0}, Lh1/v;->u()V

    .line 50
    .line 51
    .line 52
    return v0

    .line 53
    :pswitch_1
    iget-object v0, p0, Lh1/v;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, [B

    .line 56
    .line 57
    iget v1, p0, Lh1/v;->c:I

    .line 58
    .line 59
    aget-byte v0, v0, v1

    .line 60
    .line 61
    const/16 v1, 0x80

    .line 62
    .line 63
    iget v2, p0, Lh1/v;->d:I

    .line 64
    .line 65
    shr-int/2addr v1, v2

    .line 66
    and-int/2addr v0, v1

    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    const/4 v0, 0x1

    .line 70
    goto :goto_2

    .line 71
    :cond_2
    const/4 v0, 0x0

    .line 72
    :goto_2
    invoke-virtual {p0}, Lh1/v;->u()V

    .line 73
    .line 74
    .line 75
    return v0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public k(I)I
    .locals 9

    .line 1
    iget v0, p0, Lh1/v;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lh1/v;->d:I

    .line 7
    .line 8
    iget v1, p0, Lh1/v;->e:I

    .line 9
    .line 10
    rsub-int/lit8 v1, v1, 0x8

    .line 11
    .line 12
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v2, p0, Lh1/v;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, [B

    .line 19
    .line 20
    add-int/lit8 v3, v0, 0x1

    .line 21
    .line 22
    aget-byte v0, v2, v0

    .line 23
    .line 24
    const/16 v4, 0xff

    .line 25
    .line 26
    and-int/2addr v0, v4

    .line 27
    iget v5, p0, Lh1/v;->e:I

    .line 28
    .line 29
    shr-int/2addr v0, v5

    .line 30
    rsub-int/lit8 v5, v1, 0x8

    .line 31
    .line 32
    shr-int v5, v4, v5

    .line 33
    .line 34
    and-int/2addr v0, v5

    .line 35
    :goto_0
    if-ge v1, p1, :cond_0

    .line 36
    .line 37
    add-int/lit8 v5, v3, 0x1

    .line 38
    .line 39
    aget-byte v3, v2, v3

    .line 40
    .line 41
    and-int/2addr v3, v4

    .line 42
    shl-int/2addr v3, v1

    .line 43
    or-int/2addr v0, v3

    .line 44
    add-int/lit8 v1, v1, 0x8

    .line 45
    .line 46
    move v3, v5

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    rsub-int/lit8 v1, p1, 0x20

    .line 49
    .line 50
    const/4 v2, -0x1

    .line 51
    ushr-int v1, v2, v1

    .line 52
    .line 53
    and-int/2addr v0, v1

    .line 54
    invoke-virtual {p0, p1}, Lh1/v;->v(I)V

    .line 55
    .line 56
    .line 57
    return v0

    .line 58
    :pswitch_0
    iget v0, p0, Lh1/v;->e:I

    .line 59
    .line 60
    add-int/2addr v0, p1

    .line 61
    iput v0, p0, Lh1/v;->e:I

    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    move v1, v0

    .line 65
    :goto_1
    iget v2, p0, Lh1/v;->e:I

    .line 66
    .line 67
    const/4 v3, 0x2

    .line 68
    const/4 v4, 0x1

    .line 69
    const/16 v5, 0x8

    .line 70
    .line 71
    if-le v2, v5, :cond_2

    .line 72
    .line 73
    add-int/lit8 v2, v2, -0x8

    .line 74
    .line 75
    iput v2, p0, Lh1/v;->e:I

    .line 76
    .line 77
    iget-object v5, p0, Lh1/v;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v5, [B

    .line 80
    .line 81
    iget v6, p0, Lh1/v;->d:I

    .line 82
    .line 83
    aget-byte v5, v5, v6

    .line 84
    .line 85
    and-int/lit16 v5, v5, 0xff

    .line 86
    .line 87
    shl-int v2, v5, v2

    .line 88
    .line 89
    or-int/2addr v1, v2

    .line 90
    add-int/lit8 v2, v6, 0x1

    .line 91
    .line 92
    invoke-virtual {p0, v2}, Lh1/v;->t(I)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_1

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_1
    move v3, v4

    .line 100
    :goto_2
    add-int/2addr v6, v3

    .line 101
    iput v6, p0, Lh1/v;->d:I

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    iget-object v6, p0, Lh1/v;->b:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v6, [B

    .line 107
    .line 108
    iget v7, p0, Lh1/v;->d:I

    .line 109
    .line 110
    aget-byte v6, v6, v7

    .line 111
    .line 112
    and-int/lit16 v6, v6, 0xff

    .line 113
    .line 114
    rsub-int/lit8 v8, v2, 0x8

    .line 115
    .line 116
    shr-int/2addr v6, v8

    .line 117
    or-int/2addr v1, v6

    .line 118
    rsub-int/lit8 p1, p1, 0x20

    .line 119
    .line 120
    const/4 v6, -0x1

    .line 121
    ushr-int p1, v6, p1

    .line 122
    .line 123
    and-int/2addr p1, v1

    .line 124
    if-ne v2, v5, :cond_4

    .line 125
    .line 126
    iput v0, p0, Lh1/v;->e:I

    .line 127
    .line 128
    add-int/lit8 v0, v7, 0x1

    .line 129
    .line 130
    invoke-virtual {p0, v0}, Lh1/v;->t(I)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_3

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_3
    move v3, v4

    .line 138
    :goto_3
    add-int/2addr v7, v3

    .line 139
    iput v7, p0, Lh1/v;->d:I

    .line 140
    .line 141
    :cond_4
    invoke-virtual {p0}, Lh1/v;->b()V

    .line 142
    .line 143
    .line 144
    return p1

    .line 145
    :pswitch_1
    const/4 v0, 0x0

    .line 146
    if-nez p1, :cond_5

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_5
    iget v1, p0, Lh1/v;->d:I

    .line 150
    .line 151
    add-int/2addr v1, p1

    .line 152
    iput v1, p0, Lh1/v;->d:I

    .line 153
    .line 154
    move v1, v0

    .line 155
    :goto_4
    iget v2, p0, Lh1/v;->d:I

    .line 156
    .line 157
    const/16 v3, 0x8

    .line 158
    .line 159
    if-le v2, v3, :cond_6

    .line 160
    .line 161
    add-int/lit8 v2, v2, -0x8

    .line 162
    .line 163
    iput v2, p0, Lh1/v;->d:I

    .line 164
    .line 165
    iget-object v3, p0, Lh1/v;->b:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v3, [B

    .line 168
    .line 169
    iget v4, p0, Lh1/v;->c:I

    .line 170
    .line 171
    add-int/lit8 v5, v4, 0x1

    .line 172
    .line 173
    iput v5, p0, Lh1/v;->c:I

    .line 174
    .line 175
    aget-byte v3, v3, v4

    .line 176
    .line 177
    and-int/lit16 v3, v3, 0xff

    .line 178
    .line 179
    shl-int v2, v3, v2

    .line 180
    .line 181
    or-int/2addr v1, v2

    .line 182
    goto :goto_4

    .line 183
    :cond_6
    iget-object v4, p0, Lh1/v;->b:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v4, [B

    .line 186
    .line 187
    iget v5, p0, Lh1/v;->c:I

    .line 188
    .line 189
    aget-byte v4, v4, v5

    .line 190
    .line 191
    and-int/lit16 v4, v4, 0xff

    .line 192
    .line 193
    rsub-int/lit8 v6, v2, 0x8

    .line 194
    .line 195
    shr-int/2addr v4, v6

    .line 196
    or-int/2addr v1, v4

    .line 197
    rsub-int/lit8 p1, p1, 0x20

    .line 198
    .line 199
    const/4 v4, -0x1

    .line 200
    ushr-int p1, v4, p1

    .line 201
    .line 202
    and-int/2addr p1, v1

    .line 203
    if-ne v2, v3, :cond_7

    .line 204
    .line 205
    iput v0, p0, Lh1/v;->d:I

    .line 206
    .line 207
    add-int/lit8 v5, v5, 0x1

    .line 208
    .line 209
    iput v5, p0, Lh1/v;->c:I

    .line 210
    .line 211
    :cond_7
    invoke-virtual {p0}, Lh1/v;->b()V

    .line 212
    .line 213
    .line 214
    move v0, p1

    .line 215
    :goto_5
    return v0

    .line 216
    nop

    .line 217
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public l([BI)V
    .locals 9

    .line 1
    shr-int/lit8 v0, p2, 0x3

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    const/16 v3, 0xff

    .line 6
    .line 7
    const/16 v4, 0x8

    .line 8
    .line 9
    if-ge v2, v0, :cond_0

    .line 10
    .line 11
    iget-object v5, p0, Lh1/v;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v5, [B

    .line 14
    .line 15
    iget v6, p0, Lh1/v;->c:I

    .line 16
    .line 17
    add-int/lit8 v7, v6, 0x1

    .line 18
    .line 19
    iput v7, p0, Lh1/v;->c:I

    .line 20
    .line 21
    aget-byte v6, v5, v6

    .line 22
    .line 23
    iget v8, p0, Lh1/v;->d:I

    .line 24
    .line 25
    shl-int/2addr v6, v8

    .line 26
    int-to-byte v6, v6

    .line 27
    aput-byte v6, p1, v2

    .line 28
    .line 29
    aget-byte v5, v5, v7

    .line 30
    .line 31
    and-int/2addr v3, v5

    .line 32
    sub-int/2addr v4, v8

    .line 33
    shr-int/2addr v3, v4

    .line 34
    or-int/2addr v3, v6

    .line 35
    int-to-byte v3, v3

    .line 36
    aput-byte v3, p1, v2

    .line 37
    .line 38
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    and-int/lit8 p2, p2, 0x7

    .line 42
    .line 43
    if-nez p2, :cond_1

    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    aget-byte v2, p1, v0

    .line 47
    .line 48
    shr-int v5, v3, p2

    .line 49
    .line 50
    and-int/2addr v2, v5

    .line 51
    int-to-byte v2, v2

    .line 52
    aput-byte v2, p1, v0

    .line 53
    .line 54
    iget v5, p0, Lh1/v;->d:I

    .line 55
    .line 56
    add-int v6, v5, p2

    .line 57
    .line 58
    if-le v6, v4, :cond_2

    .line 59
    .line 60
    iget-object v6, p0, Lh1/v;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v6, [B

    .line 63
    .line 64
    iget v7, p0, Lh1/v;->c:I

    .line 65
    .line 66
    add-int/lit8 v8, v7, 0x1

    .line 67
    .line 68
    iput v8, p0, Lh1/v;->c:I

    .line 69
    .line 70
    aget-byte v6, v6, v7

    .line 71
    .line 72
    and-int/2addr v6, v3

    .line 73
    shl-int/2addr v6, v5

    .line 74
    or-int/2addr v2, v6

    .line 75
    int-to-byte v2, v2

    .line 76
    aput-byte v2, p1, v0

    .line 77
    .line 78
    sub-int/2addr v5, v4

    .line 79
    iput v5, p0, Lh1/v;->d:I

    .line 80
    .line 81
    :cond_2
    iget v2, p0, Lh1/v;->d:I

    .line 82
    .line 83
    add-int/2addr v2, p2

    .line 84
    iput v2, p0, Lh1/v;->d:I

    .line 85
    .line 86
    iget-object v5, p0, Lh1/v;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v5, [B

    .line 89
    .line 90
    iget v6, p0, Lh1/v;->c:I

    .line 91
    .line 92
    aget-byte v5, v5, v6

    .line 93
    .line 94
    and-int/2addr v3, v5

    .line 95
    rsub-int/lit8 v5, v2, 0x8

    .line 96
    .line 97
    shr-int/2addr v3, v5

    .line 98
    aget-byte v5, p1, v0

    .line 99
    .line 100
    rsub-int/lit8 p2, p2, 0x8

    .line 101
    .line 102
    shl-int p2, v3, p2

    .line 103
    .line 104
    int-to-byte p2, p2

    .line 105
    or-int/2addr p2, v5

    .line 106
    int-to-byte p2, p2

    .line 107
    aput-byte p2, p1, v0

    .line 108
    .line 109
    if-ne v2, v4, :cond_3

    .line 110
    .line 111
    iput v1, p0, Lh1/v;->d:I

    .line 112
    .line 113
    add-int/lit8 v6, v6, 0x1

    .line 114
    .line 115
    iput v6, p0, Lh1/v;->c:I

    .line 116
    .line 117
    :cond_3
    invoke-virtual {p0}, Lh1/v;->b()V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method public m(I)J
    .locals 6

    .line 1
    const-wide v0, 0xffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const/16 v2, 0x20

    .line 7
    .line 8
    if-gt p1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lh1/v;->k(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    sget v2, Lh1/i0;->a:I

    .line 15
    .line 16
    int-to-long v2, p1

    .line 17
    and-long/2addr v0, v2

    .line 18
    return-wide v0

    .line 19
    :cond_0
    sub-int/2addr p1, v2

    .line 20
    invoke-virtual {p0, p1}, Lh1/v;->k(I)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {p0, v2}, Lh1/v;->k(I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    sget v4, Lh1/i0;->a:I

    .line 29
    .line 30
    int-to-long v4, p1

    .line 31
    and-long/2addr v4, v0

    .line 32
    shl-long/2addr v4, v2

    .line 33
    int-to-long v2, v3

    .line 34
    and-long/2addr v0, v2

    .line 35
    or-long/2addr v0, v4

    .line 36
    return-wide v0
.end method

.method public n([BI)V
    .locals 3

    .line 1
    iget v0, p0, Lh1/v;->d:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v0, v1

    .line 9
    :goto_0
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lh1/v;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, [B

    .line 15
    .line 16
    iget v2, p0, Lh1/v;->c:I

    .line 17
    .line 18
    invoke-static {v0, v2, p1, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 19
    .line 20
    .line 21
    iget p1, p0, Lh1/v;->c:I

    .line 22
    .line 23
    add-int/2addr p1, p2

    .line 24
    iput p1, p0, Lh1/v;->c:I

    .line 25
    .line 26
    invoke-virtual {p0}, Lh1/v;->b()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public o()I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-virtual {p0}, Lh1/v;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    add-int/lit8 v1, v1, 0x1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v2, 0x1

    .line 13
    shl-int v3, v2, v1

    .line 14
    .line 15
    sub-int/2addr v3, v2

    .line 16
    if-lez v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lh1/v;->k(I)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    :cond_1
    add-int/2addr v3, v0

    .line 23
    return v3
.end method

.method public p()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lh1/v;->o()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    rem-int/lit8 v1, v0, 0x2

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v1, v2

    .line 13
    :goto_0
    add-int/2addr v0, v2

    .line 14
    div-int/lit8 v0, v0, 0x2

    .line 15
    .line 16
    mul-int/2addr v0, v1

    .line 17
    return v0
.end method

.method public q(Lh1/w;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lh1/w;->a:[B

    .line 2
    .line 3
    iget v1, p1, Lh1/w;->c:I

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lh1/v;->r([BI)V

    .line 6
    .line 7
    .line 8
    iget p1, p1, Lh1/w;->b:I

    .line 9
    .line 10
    mul-int/lit8 p1, p1, 0x8

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lh1/v;->s(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public r([BI)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh1/v;->b:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lh1/v;->c:I

    .line 5
    .line 6
    iput p1, p0, Lh1/v;->d:I

    .line 7
    .line 8
    iput p2, p0, Lh1/v;->e:I

    .line 9
    .line 10
    return-void
.end method

.method public s(I)V
    .locals 1

    .line 1
    div-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    iput v0, p0, Lh1/v;->c:I

    .line 4
    .line 5
    mul-int/lit8 v0, v0, 0x8

    .line 6
    .line 7
    sub-int/2addr p1, v0

    .line 8
    iput p1, p0, Lh1/v;->d:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lh1/v;->b()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public t(I)Z
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    if-gt v0, p1, :cond_0

    .line 3
    .line 4
    iget v0, p0, Lh1/v;->c:I

    .line 5
    .line 6
    if-ge p1, v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lh1/v;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, [B

    .line 11
    .line 12
    aget-byte v1, v0, p1

    .line 13
    .line 14
    const/4 v2, 0x3

    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    add-int/lit8 v1, p1, -0x2

    .line 18
    .line 19
    aget-byte v1, v0, v1

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    sub-int/2addr p1, v1

    .line 25
    aget-byte p1, v0, p1

    .line 26
    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    return v1

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    return p1
.end method

.method public u()V
    .locals 3

    .line 1
    iget v0, p0, Lh1/v;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lh1/v;->e:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    add-int/2addr v0, v1

    .line 10
    iput v0, p0, Lh1/v;->e:I

    .line 11
    .line 12
    const/16 v2, 0x8

    .line 13
    .line 14
    if-ne v0, v2, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lh1/v;->e:I

    .line 18
    .line 19
    iget v0, p0, Lh1/v;->d:I

    .line 20
    .line 21
    add-int/lit8 v2, v0, 0x1

    .line 22
    .line 23
    invoke-virtual {p0, v2}, Lh1/v;->t(I)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    :cond_0
    add-int/2addr v0, v1

    .line 31
    iput v0, p0, Lh1/v;->d:I

    .line 32
    .line 33
    :cond_1
    invoke-virtual {p0}, Lh1/v;->b()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_0
    iget v0, p0, Lh1/v;->d:I

    .line 38
    .line 39
    add-int/lit8 v0, v0, 0x1

    .line 40
    .line 41
    iput v0, p0, Lh1/v;->d:I

    .line 42
    .line 43
    const/16 v1, 0x8

    .line 44
    .line 45
    if-ne v0, v1, :cond_2

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    iput v0, p0, Lh1/v;->d:I

    .line 49
    .line 50
    iget v0, p0, Lh1/v;->c:I

    .line 51
    .line 52
    add-int/lit8 v0, v0, 0x1

    .line 53
    .line 54
    iput v0, p0, Lh1/v;->c:I

    .line 55
    .line 56
    :cond_2
    invoke-virtual {p0}, Lh1/v;->b()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public v(I)V
    .locals 4

    .line 1
    iget v0, p0, Lh1/v;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    div-int/lit8 v0, p1, 0x8

    .line 7
    .line 8
    iget v1, p0, Lh1/v;->d:I

    .line 9
    .line 10
    add-int/2addr v1, v0

    .line 11
    iput v1, p0, Lh1/v;->d:I

    .line 12
    .line 13
    iget v2, p0, Lh1/v;->e:I

    .line 14
    .line 15
    mul-int/lit8 v0, v0, 0x8

    .line 16
    .line 17
    sub-int/2addr p1, v0

    .line 18
    add-int/2addr p1, v2

    .line 19
    iput p1, p0, Lh1/v;->e:I

    .line 20
    .line 21
    const/4 v0, 0x7

    .line 22
    const/4 v2, 0x1

    .line 23
    if-le p1, v0, :cond_0

    .line 24
    .line 25
    add-int/2addr v1, v2

    .line 26
    iput v1, p0, Lh1/v;->d:I

    .line 27
    .line 28
    add-int/lit8 p1, p1, -0x8

    .line 29
    .line 30
    iput p1, p0, Lh1/v;->e:I

    .line 31
    .line 32
    :cond_0
    iget p1, p0, Lh1/v;->d:I

    .line 33
    .line 34
    if-ltz p1, :cond_1

    .line 35
    .line 36
    iget v0, p0, Lh1/v;->c:I

    .line 37
    .line 38
    if-lt p1, v0, :cond_2

    .line 39
    .line 40
    if-ne p1, v0, :cond_1

    .line 41
    .line 42
    iget p1, p0, Lh1/v;->e:I

    .line 43
    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v2, 0x0

    .line 48
    :cond_2
    :goto_0
    invoke-static {v2}, Lh1/a;->j(Z)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_0
    iget v0, p0, Lh1/v;->d:I

    .line 53
    .line 54
    div-int/lit8 v1, p1, 0x8

    .line 55
    .line 56
    add-int v2, v0, v1

    .line 57
    .line 58
    iput v2, p0, Lh1/v;->d:I

    .line 59
    .line 60
    iget v3, p0, Lh1/v;->e:I

    .line 61
    .line 62
    mul-int/lit8 v1, v1, 0x8

    .line 63
    .line 64
    sub-int/2addr p1, v1

    .line 65
    add-int/2addr p1, v3

    .line 66
    iput p1, p0, Lh1/v;->e:I

    .line 67
    .line 68
    const/4 v1, 0x7

    .line 69
    if-le p1, v1, :cond_3

    .line 70
    .line 71
    add-int/lit8 v2, v2, 0x1

    .line 72
    .line 73
    iput v2, p0, Lh1/v;->d:I

    .line 74
    .line 75
    add-int/lit8 p1, p1, -0x8

    .line 76
    .line 77
    iput p1, p0, Lh1/v;->e:I

    .line 78
    .line 79
    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 80
    .line 81
    iget p1, p0, Lh1/v;->d:I

    .line 82
    .line 83
    if-gt v0, p1, :cond_4

    .line 84
    .line 85
    invoke-virtual {p0, v0}, Lh1/v;->t(I)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_3

    .line 90
    .line 91
    iget p1, p0, Lh1/v;->d:I

    .line 92
    .line 93
    add-int/lit8 p1, p1, 0x1

    .line 94
    .line 95
    iput p1, p0, Lh1/v;->d:I

    .line 96
    .line 97
    add-int/lit8 v0, v0, 0x2

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    invoke-virtual {p0}, Lh1/v;->b()V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :pswitch_1
    div-int/lit8 v0, p1, 0x8

    .line 105
    .line 106
    iget v1, p0, Lh1/v;->c:I

    .line 107
    .line 108
    add-int/2addr v1, v0

    .line 109
    iput v1, p0, Lh1/v;->c:I

    .line 110
    .line 111
    iget v2, p0, Lh1/v;->d:I

    .line 112
    .line 113
    mul-int/lit8 v0, v0, 0x8

    .line 114
    .line 115
    sub-int/2addr p1, v0

    .line 116
    add-int/2addr p1, v2

    .line 117
    iput p1, p0, Lh1/v;->d:I

    .line 118
    .line 119
    const/4 v0, 0x7

    .line 120
    if-le p1, v0, :cond_5

    .line 121
    .line 122
    add-int/lit8 v1, v1, 0x1

    .line 123
    .line 124
    iput v1, p0, Lh1/v;->c:I

    .line 125
    .line 126
    add-int/lit8 p1, p1, -0x8

    .line 127
    .line 128
    iput p1, p0, Lh1/v;->d:I

    .line 129
    .line 130
    :cond_5
    invoke-virtual {p0}, Lh1/v;->b()V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public w(I)V
    .locals 1

    .line 1
    iget v0, p0, Lh1/v;->d:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lh1/v;->c:I

    .line 12
    .line 13
    add-int/2addr v0, p1

    .line 14
    iput v0, p0, Lh1/v;->c:I

    .line 15
    .line 16
    invoke-virtual {p0}, Lh1/v;->b()V

    .line 17
    .line 18
    .line 19
    return-void
.end method
