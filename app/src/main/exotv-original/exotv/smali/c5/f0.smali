.class public final Lc5/f0;
.super Lz2/i0;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lc5/f0;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lc5/f0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 2

    .line 1
    iget v0, p0, Lc5/f0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    const/4 v0, 0x1

    .line 8
    if-ne p2, v0, :cond_3

    .line 9
    .line 10
    iget-object p2, p0, Lc5/f0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p2, Lc5/h0;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lz2/f0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p2, p1}, Lc5/h0;->d(Lz2/f0;)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-static {p1}, Lc5/h0;->h(Lz2/f0;)Landroid/view/ViewGroup;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p1, v0, v1}, Lc5/h0;->g(Lz2/f0;Landroid/view/View;Landroid/view/ViewGroup;)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iput p1, p2, Lc5/h0;->e:F

    .line 40
    .line 41
    :cond_3
    :goto_0
    return-void

    .line 42
    :pswitch_1
    if-nez p2, :cond_4

    .line 43
    .line 44
    iget-object p1, p0, Lc5/f0;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Lc5/g0;

    .line 47
    .line 48
    invoke-virtual {p1}, Lc5/g0;->n0()V

    .line 49
    .line 50
    .line 51
    :cond_4
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 8

    .line 1
    iget p2, p0, Lc5/f0;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    return-void

    .line 7
    :pswitch_1
    iget-object p2, p0, Lc5/f0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, Lz2/j;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollOffset()I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iget v0, p2, Lz2/j;->a:I

    .line 20
    .line 21
    iget-object v1, p2, Lz2/j;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollRange()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iget v2, p2, Lz2/j;->r:I

    .line 28
    .line 29
    sub-int v3, v1, v2

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v5, 0x1

    .line 33
    if-lez v3, :cond_0

    .line 34
    .line 35
    if-lt v2, v0, :cond_0

    .line 36
    .line 37
    move v3, v5

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v3, v4

    .line 40
    :goto_0
    iput-boolean v3, p2, Lz2/j;->t:Z

    .line 41
    .line 42
    iget-object v3, p2, Lz2/j;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 43
    .line 44
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollRange()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    iget v6, p2, Lz2/j;->q:I

    .line 49
    .line 50
    sub-int v7, v3, v6

    .line 51
    .line 52
    if-lez v7, :cond_1

    .line 53
    .line 54
    if-lt v6, v0, :cond_1

    .line 55
    .line 56
    move v0, v5

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move v0, v4

    .line 59
    :goto_1
    iput-boolean v0, p2, Lz2/j;->u:Z

    .line 60
    .line 61
    iget-boolean v7, p2, Lz2/j;->t:Z

    .line 62
    .line 63
    if-nez v7, :cond_2

    .line 64
    .line 65
    if-nez v0, :cond_2

    .line 66
    .line 67
    iget p1, p2, Lz2/j;->v:I

    .line 68
    .line 69
    if-eqz p1, :cond_6

    .line 70
    .line 71
    invoke-virtual {p2, v4}, Lz2/j;->g(I)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_2
    const/high16 v0, 0x40000000    # 2.0f

    .line 76
    .line 77
    if-eqz v7, :cond_3

    .line 78
    .line 79
    int-to-float p1, p1

    .line 80
    int-to-float v4, v2

    .line 81
    div-float v7, v4, v0

    .line 82
    .line 83
    add-float/2addr v7, p1

    .line 84
    mul-float/2addr v7, v4

    .line 85
    int-to-float p1, v1

    .line 86
    div-float/2addr v7, p1

    .line 87
    float-to-int p1, v7

    .line 88
    iput p1, p2, Lz2/j;->l:I

    .line 89
    .line 90
    mul-int p1, v2, v2

    .line 91
    .line 92
    div-int/2addr p1, v1

    .line 93
    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    iput p1, p2, Lz2/j;->k:I

    .line 98
    .line 99
    :cond_3
    iget-boolean p1, p2, Lz2/j;->u:Z

    .line 100
    .line 101
    if-eqz p1, :cond_4

    .line 102
    .line 103
    int-to-float p1, p3

    .line 104
    int-to-float p3, v6

    .line 105
    div-float v0, p3, v0

    .line 106
    .line 107
    add-float/2addr v0, p1

    .line 108
    mul-float/2addr v0, p3

    .line 109
    int-to-float p1, v3

    .line 110
    div-float/2addr v0, p1

    .line 111
    float-to-int p1, v0

    .line 112
    iput p1, p2, Lz2/j;->o:I

    .line 113
    .line 114
    mul-int p1, v6, v6

    .line 115
    .line 116
    div-int/2addr p1, v3

    .line 117
    invoke-static {v6, p1}, Ljava/lang/Math;->min(II)I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    iput p1, p2, Lz2/j;->n:I

    .line 122
    .line 123
    :cond_4
    iget p1, p2, Lz2/j;->v:I

    .line 124
    .line 125
    if-eqz p1, :cond_5

    .line 126
    .line 127
    if-ne p1, v5, :cond_6

    .line 128
    .line 129
    :cond_5
    invoke-virtual {p2, v5}, Lz2/j;->g(I)V

    .line 130
    .line 131
    .line 132
    :cond_6
    :goto_2
    return-void

    .line 133
    :pswitch_2
    iget-object p1, p0, Lc5/f0;->b:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p1, Lc5/g0;

    .line 136
    .line 137
    invoke-virtual {p1}, Lc5/g0;->n0()V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
