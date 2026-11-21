.class public final Lc5/h0;
.super Lz2/z0;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final c:Lc5/d0;

.field public d:I

.field public e:F


# direct methods
.method public constructor <init>(Lc5/d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lz2/z0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc5/h0;->c:Lc5/d0;

    .line 5
    .line 6
    const/4 p1, -0x1

    .line 7
    iput p1, p0, Lc5/h0;->d:I

    .line 8
    .line 9
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 10
    .line 11
    iput p1, p0, Lc5/h0;->e:F

    .line 12
    .line 13
    return-void
.end method

.method public static g(Lz2/f0;Landroid/view/View;Landroid/view/ViewGroup;)F
    .locals 4

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getPaddingLeft()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p2}, Landroid/view/View;->getPaddingLeft()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    sub-int/2addr v1, v2

    .line 15
    invoke-virtual {p2}, Landroid/view/View;->getPaddingRight()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    sub-int/2addr v1, p2

    .line 20
    int-to-float p2, v1

    .line 21
    const/high16 v1, 0x40000000    # 2.0f

    .line 22
    .line 23
    div-float/2addr p2, v1

    .line 24
    add-float/2addr p2, v0

    .line 25
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    int-to-float v0, v0

    .line 30
    const/high16 v2, 0x3f800000    # 1.0f

    .line 31
    .line 32
    cmpg-float v3, v0, v2

    .line 33
    .line 34
    if-gez v3, :cond_0

    .line 35
    .line 36
    move v0, v2

    .line 37
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    add-int/2addr v3, v2

    .line 46
    int-to-float v2, v3

    .line 47
    div-float/2addr v2, v1

    .line 48
    sub-float/2addr p2, v2

    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Lz2/f0;->H(Landroid/view/View;)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    int-to-float p0, p0

    .line 57
    div-float/2addr p2, v0

    .line 58
    add-float/2addr p2, p0

    .line 59
    return p2
.end method

.method public static h(Lz2/f0;)Landroid/view/ViewGroup;
    .locals 2

    .line 1
    instance-of v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object v0, p0

    .line 7
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v0, v1

    .line 11
    :goto_0
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->M0()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    check-cast p0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->q(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move-object p0, v1

    .line 31
    :goto_1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    check-cast p0, Landroid/view/ViewGroup;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_2
    return-object v1
.end method


# virtual methods
.method public final b(Lz2/f0;Landroid/view/View;)[I
    .locals 6

    .line 1
    const-string v0, "layoutManager"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "view"

    .line 7
    .line 8
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lc5/h0;->h(Lz2/f0;)Landroid/view/ViewGroup;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    new-array p1, v1, [I

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    iget v2, p0, Lc5/h0;->d:I

    .line 22
    .line 23
    const/4 v3, -0x1

    .line 24
    if-ne v2, v3, :cond_1

    .line 25
    .line 26
    invoke-static {p2}, Lz2/f0;->H(Landroid/view/View;)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    :cond_1
    iput v3, p0, Lc5/h0;->d:I

    .line 31
    .line 32
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    int-to-float v3, v3

    .line 37
    const/high16 v4, 0x3f800000    # 1.0f

    .line 38
    .line 39
    cmpg-float v5, v3, v4

    .line 40
    .line 41
    if-gez v5, :cond_2

    .line 42
    .line 43
    move v3, v4

    .line 44
    :cond_2
    int-to-float v2, v2

    .line 45
    invoke-static {p1, p2, v0}, Lc5/h0;->g(Lz2/f0;Landroid/view/View;Landroid/view/ViewGroup;)F

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    sub-float/2addr v2, p1

    .line 50
    mul-float/2addr v2, v3

    .line 51
    invoke-static {v2}, Lcom/bumptech/glide/d;->f0(F)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    const/4 v0, 0x2

    .line 60
    if-gt p2, v0, :cond_3

    .line 61
    .line 62
    move p1, v1

    .line 63
    :cond_3
    filled-new-array {p1, v1}, [I

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    return-object p1
.end method

.method public final d(Lz2/f0;)Landroid/view/View;
    .locals 9

    .line 1
    invoke-static {p1}, Lc5/h0;->h(Lz2/f0;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    int-to-float v1, v1

    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    sub-int/2addr v2, v3

    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    sub-int/2addr v2, v3

    .line 28
    int-to-float v2, v2

    .line 29
    const/high16 v3, 0x40000000    # 2.0f

    .line 30
    .line 31
    div-float/2addr v2, v3

    .line 32
    add-float/2addr v2, v1

    .line 33
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const v4, 0x7f7fffff    # Float.MAX_VALUE

    .line 38
    .line 39
    .line 40
    const/4 v5, 0x0

    .line 41
    :goto_0
    if-ge v5, v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    invoke-virtual {v6}, Landroid/view/View;->getRight()I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    add-int/2addr v8, v7

    .line 56
    int-to-float v7, v8

    .line 57
    div-float/2addr v7, v3

    .line 58
    sub-float/2addr v7, v2

    .line 59
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    cmpg-float v8, v7, v4

    .line 64
    .line 65
    if-gez v8, :cond_1

    .line 66
    .line 67
    move-object v0, v6

    .line 68
    move v4, v7

    .line 69
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    return-object v0
.end method

.method public final e(Lz2/f0;II)I
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lc5/h0;->d(Lz2/f0;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const/4 p3, 0x0

    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    return p3

    .line 9
    :cond_0
    invoke-static {p1}, Lc5/h0;->h(Lz2/f0;)Landroid/view/ViewGroup;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-static {p2}, Lz2/f0;->H(Landroid/view/View;)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_1
    iget-object v1, p0, Lc5/h0;->c:Lc5/d0;

    .line 21
    .line 22
    invoke-virtual {v1}, Lc5/d0;->invoke()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/Number;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    add-int/lit8 v1, v1, -0x1

    .line 33
    .line 34
    if-gez v1, :cond_2

    .line 35
    .line 36
    move v1, p3

    .line 37
    :cond_2
    invoke-static {p1, p2, v0}, Lc5/h0;->g(Lz2/f0;Landroid/view/View;Landroid/view/ViewGroup;)F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iget p2, p0, Lc5/h0;->e:F

    .line 42
    .line 43
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_3

    .line 48
    .line 49
    iput p1, p0, Lc5/h0;->e:F

    .line 50
    .line 51
    :cond_3
    iget p2, p0, Lc5/h0;->e:F

    .line 52
    .line 53
    invoke-static {p2}, Lcom/bumptech/glide/d;->f0(F)I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    iget v0, p0, Lc5/h0;->e:F

    .line 58
    .line 59
    sub-float/2addr p1, v0

    .line 60
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const v2, 0x3df5c28f    # 0.12f

    .line 65
    .line 66
    .line 67
    cmpg-float v0, v0, v2

    .line 68
    .line 69
    if-gez v0, :cond_4

    .line 70
    .line 71
    invoke-static {p2, p3, v1}, Lcom/bumptech/glide/c;->t(III)I

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    goto :goto_0

    .line 76
    :cond_4
    const/4 v0, 0x0

    .line 77
    cmpl-float p1, p1, v0

    .line 78
    .line 79
    if-lez p1, :cond_5

    .line 80
    .line 81
    add-int/lit8 p3, p2, 0x1

    .line 82
    .line 83
    if-le p3, v1, :cond_7

    .line 84
    .line 85
    move p3, v1

    .line 86
    goto :goto_0

    .line 87
    :cond_5
    add-int/lit8 p2, p2, -0x1

    .line 88
    .line 89
    if-gez p2, :cond_6

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_6
    move p3, p2

    .line 93
    :cond_7
    :goto_0
    iput p3, p0, Lc5/h0;->d:I

    .line 94
    .line 95
    return p3
.end method
