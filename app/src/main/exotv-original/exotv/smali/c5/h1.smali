.class public final Lc5/h1;
.super Landroid/view/ViewGroup;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public j:I

.field public k:Ljava/lang/Integer;

.field public l:I


# virtual methods
.method public final a(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lc5/h1;->k:Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    iget v0, p0, Lc5/h1;->j:I

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-gtz v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    div-int/2addr p1, v0

    .line 17
    if-ge p1, v1, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    return p1
.end method

.method public final onLayout(ZIIII)V
    .locals 7

    .line 1
    sub-int/2addr p4, p2

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    sub-int/2addr p4, p1

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    sub-int/2addr p4, p1

    .line 12
    invoke-virtual {p0, p4}, Lc5/h1;->a(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 p2, 0x1

    .line 17
    const/4 p3, 0x0

    .line 18
    if-le p1, p2, :cond_0

    .line 19
    .line 20
    add-int/lit8 p2, p1, -0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move p2, p3

    .line 24
    :goto_0
    iget p5, p0, Lc5/h1;->l:I

    .line 25
    .line 26
    if-lez p5, :cond_1

    .line 27
    .line 28
    iget v0, p0, Lc5/h1;->j:I

    .line 29
    .line 30
    add-int/2addr v0, p5

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    if-lez p2, :cond_3

    .line 33
    .line 34
    iget p5, p0, Lc5/h1;->j:I

    .line 35
    .line 36
    mul-int v0, p1, p5

    .line 37
    .line 38
    sub-int v0, p4, v0

    .line 39
    .line 40
    div-int/2addr v0, p2

    .line 41
    if-gez v0, :cond_2

    .line 42
    .line 43
    move v0, p3

    .line 44
    :cond_2
    add-int/2addr v0, p5

    .line 45
    goto :goto_1

    .line 46
    :cond_3
    iget v0, p0, Lc5/h1;->j:I

    .line 47
    .line 48
    :goto_1
    iget p5, p0, Lc5/h1;->j:I

    .line 49
    .line 50
    mul-int v1, p5, p1

    .line 51
    .line 52
    sub-int p5, v0, p5

    .line 53
    .line 54
    mul-int/2addr p5, p2

    .line 55
    add-int/2addr p5, v1

    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    sub-int/2addr p4, p5

    .line 61
    div-int/lit8 p4, p4, 0x2

    .line 62
    .line 63
    if-gez p4, :cond_4

    .line 64
    .line 65
    move p4, p3

    .line 66
    :cond_4
    add-int/2addr p2, p4

    .line 67
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 68
    .line 69
    .line 70
    move-result p4

    .line 71
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 72
    .line 73
    .line 74
    move-result p5

    .line 75
    move v3, p2

    .line 76
    move v1, p3

    .line 77
    move v2, v1

    .line 78
    :goto_2
    if-ge v1, p5, :cond_6

    .line 79
    .line 80
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    if-lez v1, :cond_5

    .line 85
    .line 86
    rem-int v5, v1, p1

    .line 87
    .line 88
    if-nez v5, :cond_5

    .line 89
    .line 90
    add-int/2addr p4, v2

    .line 91
    move v3, p2

    .line 92
    move v2, p3

    .line 93
    :cond_5
    iget v5, p0, Lc5/h1;->j:I

    .line 94
    .line 95
    add-int/2addr v5, v3

    .line 96
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    add-int/2addr v6, p4

    .line 101
    invoke-virtual {v4, v3, p4, v5, v6}, Landroid/view/View;->layout(IIII)V

    .line 102
    .line 103
    .line 104
    add-int/2addr v3, v0

    .line 105
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    add-int/lit8 v1, v1, 0x1

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_6
    return-void
.end method

.method public final onMeasure(II)V
    .locals 9

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    sub-int p2, p1, p2

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sub-int/2addr p2, v0

    .line 16
    invoke-virtual {p0, p2}, Lc5/h1;->a(I)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    iget v0, p0, Lc5/h1;->j:I

    .line 21
    .line 22
    const/high16 v1, 0x40000000    # 2.0f

    .line 23
    .line 24
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    move v4, v1

    .line 38
    move v5, v4

    .line 39
    move v6, v5

    .line 40
    :goto_0
    if-ge v4, v3, :cond_1

    .line 41
    .line 42
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-virtual {p0, v7, v0, v2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 47
    .line 48
    .line 49
    if-lez v4, :cond_0

    .line 50
    .line 51
    rem-int v8, v4, p2

    .line 52
    .line 53
    if-nez v8, :cond_0

    .line 54
    .line 55
    add-int/2addr v5, v6

    .line 56
    move v6, v1

    .line 57
    :cond_0
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    add-int/lit8 v4, v4, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    add-int/2addr v5, v6

    .line 69
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    add-int/2addr p2, v5

    .line 74
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    add-int/2addr v0, p2

    .line 79
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 80
    .line 81
    .line 82
    return-void
.end method
