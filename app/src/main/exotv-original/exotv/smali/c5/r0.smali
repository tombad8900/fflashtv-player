.class public final Lc5/r0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final a:Lc5/r0;

.field public static final b:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final c:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final d:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc5/r0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lc5/r0;->a:Lc5/r0;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lc5/r0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lc5/r0;->c:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 20
    .line 21
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lc5/r0;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    return-void
.end method

.method public static a(Landroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lz2/f0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v2

    .line 14
    :goto_0
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-static {p0}, Lc5/r0;->b(Landroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lz2/x;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_b

    .line 26
    .line 27
    invoke-virtual {v1}, Lz2/x;->a()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_a

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-gtz v3, :cond_2

    .line 38
    .line 39
    goto/16 :goto_3

    .line 40
    .line 41
    :cond_2
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->M0()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    const/4 v4, -0x1

    .line 46
    if-ne v3, v4, :cond_3

    .line 47
    .line 48
    invoke-static {p0}, Lc5/r0;->b(Landroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_3
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->q(I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    if-nez v4, :cond_4

    .line 58
    .line 59
    invoke-static {p0}, Lc5/r0;->b(Landroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :cond_4
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    instance-of v7, v6, Lz2/g0;

    .line 73
    .line 74
    if-eqz v7, :cond_5

    .line 75
    .line 76
    check-cast v6, Lz2/g0;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_5
    move-object v6, v2

    .line 80
    :goto_1
    if-eqz v6, :cond_6

    .line 81
    .line 82
    iget v2, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 83
    .line 84
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    :cond_6
    const/4 v6, 0x0

    .line 89
    if-eqz v2, :cond_7

    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    goto :goto_2

    .line 96
    :cond_7
    move v2, v6

    .line 97
    :goto_2
    add-int/2addr v5, v2

    .line 98
    if-gtz v5, :cond_8

    .line 99
    .line 100
    invoke-static {p0}, Lc5/r0;->b(Landroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0

    .line 105
    :cond_8
    int-to-float v2, v3

    .line 106
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    int-to-float v3, v3

    .line 111
    const/high16 v7, 0x40000000    # 2.0f

    .line 112
    .line 113
    div-float/2addr v3, v7

    .line 114
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    invoke-virtual {v4}, Landroid/view/View;->getRight()I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    add-int/2addr v4, v8

    .line 123
    int-to-float v4, v4

    .line 124
    div-float/2addr v4, v7

    .line 125
    sub-float/2addr v3, v4

    .line 126
    int-to-float v4, v5

    .line 127
    div-float/2addr v3, v4

    .line 128
    add-float/2addr v3, v2

    .line 129
    invoke-static {v3}, Lcom/bumptech/glide/d;->f0(F)I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    add-int/lit8 v1, v1, -0x1

    .line 134
    .line 135
    invoke-static {v2, v6, v1}, Lcom/bumptech/glide/c;->t(III)I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->q(I)Landroid/view/View;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    if-nez v0, :cond_9

    .line 144
    .line 145
    invoke-static {p0}, Lc5/r0;->b(Landroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    return-object p0

    .line 150
    :cond_9
    return-object v0

    .line 151
    :cond_a
    :goto_3
    invoke-static {p0}, Lc5/r0;->b(Landroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    return-object p0

    .line 156
    :cond_b
    invoke-static {p0}, Lc5/r0;->b(Landroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    return-object p0
.end method

.method public static final b(Landroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    const/high16 v1, 0x40000000    # 2.0f

    .line 7
    .line 8
    div-float/2addr v0, v1

    .line 9
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    const v4, 0x7f7fffff    # Float.MAX_VALUE

    .line 15
    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    :goto_0
    if-ge v5, v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    if-lez v7, :cond_0

    .line 29
    .line 30
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    invoke-virtual {v6}, Landroid/view/View;->getRight()I

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    add-int/2addr v8, v7

    .line 39
    int-to-float v7, v8

    .line 40
    div-float/2addr v7, v1

    .line 41
    sub-float/2addr v7, v0

    .line 42
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    cmpg-float v8, v7, v4

    .line 47
    .line 48
    if-gez v8, :cond_0

    .line 49
    .line 50
    move-object v3, v6

    .line 51
    move v4, v7

    .line 52
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    return-object v3
.end method

.method public static c(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_6

    .line 8
    :cond_0
    instance-of v0, p0, Lc5/g0;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    move-object v0, p0

    .line 13
    check-cast v0, Lc5/g0;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    :goto_0
    const/4 v1, 0x1

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget-boolean v0, v0, Lc5/g0;->S0:Z

    .line 21
    .line 22
    if-ne v0, v1, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-nez v0, :cond_3

    .line 29
    .line 30
    invoke-static {p0}, Lc5/r0;->a(Landroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-static {p0}, Lc5/r0;->a(Landroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :cond_3
    :goto_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/4 v3, 0x0

    .line 44
    move v4, v3

    .line 45
    :goto_2
    if-ge v4, v2, :cond_7

    .line 46
    .line 47
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    if-ne v5, v0, :cond_4

    .line 52
    .line 53
    move v6, v1

    .line 54
    goto :goto_3

    .line 55
    :cond_4
    move v6, v3

    .line 56
    :goto_3
    const/high16 v7, 0x3f800000    # 1.0f

    .line 57
    .line 58
    if-eqz v6, :cond_5

    .line 59
    .line 60
    move v8, v7

    .line 61
    goto :goto_4

    .line 62
    :cond_5
    const v8, 0x3f19999a    # 0.6f

    .line 63
    .line 64
    .line 65
    :goto_4
    invoke-virtual {v5, v8}, Landroid/view/View;->setAlpha(F)V

    .line 66
    .line 67
    .line 68
    if-eqz v6, :cond_6

    .line 69
    .line 70
    goto :goto_5

    .line 71
    :cond_6
    const v7, 0x3f5c28f6    # 0.86f

    .line 72
    .line 73
    .line 74
    :goto_5
    invoke-virtual {v5, v7}, Landroid/view/View;->setScaleY(F)V

    .line 75
    .line 76
    .line 77
    add-int/lit8 v4, v4, 0x1

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_7
    :goto_6
    return-void
.end method

.method public static d(Landroid/content/Context;Ljava/util/List;Lx4/m;Lw4/r;Lw4/r;Lw4/g;)Landroid/widget/FrameLayout;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v1, "items"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const v11, 0x7f050002

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v11}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 32
    .line 33
    int-to-float v1, v1

    .line 34
    const v3, 0x3eeb851f    # 0.46f

    .line 35
    .line 36
    .line 37
    mul-float/2addr v1, v3

    .line 38
    invoke-static {v1}, Lcom/bumptech/glide/d;->f0(F)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    int-to-float v1, v1

    .line 47
    const/high16 v4, 0x41100000    # 9.0f

    .line 48
    .line 49
    mul-float/2addr v1, v4

    .line 50
    const/high16 v4, 0x41800000    # 16.0f

    .line 51
    .line 52
    div-float/2addr v1, v4

    .line 53
    invoke-static {v1}, Lcom/bumptech/glide/d;->f0(F)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    new-instance v4, Ll6/d;

    .line 62
    .line 63
    invoke-direct {v4, v3, v1}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 76
    .line 77
    int-to-float v1, v1

    .line 78
    const v3, 0x3f333333    # 0.7f

    .line 79
    .line 80
    .line 81
    mul-float/2addr v1, v3

    .line 82
    invoke-static {v1}, Lcom/bumptech/glide/d;->f0(F)I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 99
    .line 100
    int-to-float v3, v3

    .line 101
    const/high16 v4, 0x3f000000    # 0.5f

    .line 102
    .line 103
    mul-float/2addr v3, v4

    .line 104
    invoke-static {v3}, Lcom/bumptech/glide/d;->f0(F)I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    new-instance v4, Ll6/d;

    .line 113
    .line 114
    invoke-direct {v4, v1, v3}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :goto_0
    iget-object v1, v4, Ll6/d;->j:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v1, Ljava/lang/Number;

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    iget-object v1, v4, Ll6/d;->k:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v1, Ljava/lang/Number;

    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v1, v11}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    invoke-static {v2}, Lm6/i;->s0(Ljava/util/List;)I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    const/4 v12, 0x0

    .line 146
    if-gez v1, :cond_1

    .line 147
    .line 148
    move v1, v12

    .line 149
    :cond_1
    const/4 v13, 0x1

    .line 150
    if-le v13, v1, :cond_2

    .line 151
    .line 152
    move v14, v1

    .line 153
    goto :goto_1

    .line 154
    :cond_2
    move v14, v13

    .line 155
    :goto_1
    new-instance v15, Lc5/g0;

    .line 156
    .line 157
    invoke-direct {v15, v14, v0, v7}, Lc5/g0;-><init>(ILandroid/content/Context;Z)V

    .line 158
    .line 159
    .line 160
    iput v3, v15, Lc5/g0;->U0:I

    .line 161
    .line 162
    invoke-virtual {v15, v12}, Landroidx/recyclerview/widget/RecyclerView;->setClipToPadding(Z)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v15, v12}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v15, v12}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 169
    .line 170
    .line 171
    const/4 v1, 0x2

    .line 172
    invoke-virtual {v15, v1}, Landroid/view/View;->setOverScrollMode(I)V

    .line 173
    .line 174
    .line 175
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 176
    .line 177
    invoke-direct {v1, v12}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v15, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lz2/f0;)V

    .line 181
    .line 182
    .line 183
    new-instance v1, Lc5/k0;

    .line 184
    .line 185
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    invoke-virtual {v5, v11}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-eqz v5, :cond_3

    .line 194
    .line 195
    const-string v5, "w1280"

    .line 196
    .line 197
    :goto_2
    move-object/from16 v6, p2

    .line 198
    .line 199
    move-object/from16 v8, p3

    .line 200
    .line 201
    move-object/from16 v9, p4

    .line 202
    .line 203
    move-object/from16 v10, p5

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_3
    const-string v5, "w500"

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :goto_3
    invoke-direct/range {v1 .. v10}, Lc5/k0;-><init>(Ljava/util/List;IILjava/lang/String;Lx4/m;ZLw4/r;Lw4/r;Lw4/g;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v15, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lz2/x;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-virtual {v1, v11}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    if-eqz v1, :cond_4

    .line 224
    .line 225
    invoke-virtual {v15, v13}, Landroid/view/View;->setFocusable(Z)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v15, v13}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 229
    .line 230
    .line 231
    const/high16 v1, 0x40000

    .line 232
    .line 233
    invoke-virtual {v15, v1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 234
    .line 235
    .line 236
    :cond_4
    new-instance v1, Lc5/c0;

    .line 237
    .line 238
    const/4 v3, 0x0

    .line 239
    invoke-direct {v1, v14, v3, v15}, Lc5/c0;-><init>(IILjava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v15, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 243
    .line 244
    .line 245
    if-nez v7, :cond_5

    .line 246
    .line 247
    new-instance v1, Lc5/h0;

    .line 248
    .line 249
    new-instance v3, Lc5/d0;

    .line 250
    .line 251
    const/4 v4, 0x0

    .line 252
    invoke-direct {v3, v4, v2}, Lc5/d0;-><init>(ILjava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    invoke-direct {v1, v3}, Lc5/h0;-><init>(Lc5/d0;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1, v15}, Lz2/z0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 259
    .line 260
    .line 261
    new-instance v2, Lc5/f0;

    .line 262
    .line 263
    const/4 v3, 0x1

    .line 264
    invoke-direct {v2, v3, v1}, Lc5/f0;-><init>(ILjava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v15, v2}, Landroidx/recyclerview/widget/RecyclerView;->j(Lz2/i0;)V

    .line 268
    .line 269
    .line 270
    :cond_5
    invoke-static {v15}, Lc5/r0;->c(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 271
    .line 272
    .line 273
    new-instance v1, Lc5/m0;

    .line 274
    .line 275
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v15, v1}, Landroidx/recyclerview/widget/RecyclerView;->j(Lz2/i0;)V

    .line 279
    .line 280
    .line 281
    new-instance v1, Landroid/widget/FrameLayout;

    .line 282
    .line 283
    invoke-direct {v1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    const v3, 0x7f0700c8

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    const v3, 0x7f0700c9

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    invoke-virtual {v1, v12, v2, v12, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 309
    .line 310
    .line 311
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 312
    .line 313
    const/4 v2, -0x1

    .line 314
    const/4 v3, -0x2

    .line 315
    invoke-direct {v0, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v1, v15, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 319
    .line 320
    .line 321
    return-object v1
.end method

.method public static f(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Ly6/l;Ly6/l;Lw4/g;Ljava/util/ArrayList;Lw4/s0;Lw4/t0;I)Landroid/widget/LinearLayout;
    .locals 28

    move-object/from16 v0, p0

    move/from16 v1, p9

    and-int/lit8 v2, v1, 0x20

    if-eqz v2, :cond_0

    const/4 v9, 0x0

    goto :goto_0

    :cond_0
    move-object/from16 v9, p4

    :goto_0
    and-int/lit8 v2, v1, 0x40

    if-eqz v2, :cond_1

    const/4 v10, 0x0

    goto :goto_1

    :cond_1
    move-object/from16 v10, p5

    :goto_1
    and-int/lit16 v2, v1, 0x80

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eqz v2, :cond_2

    move v13, v12

    goto :goto_2

    :cond_2
    move v13, v11

    :goto_2
    and-int/lit16 v2, v1, 0x100

    if-eqz v2, :cond_3

    .line 1
    sget-object v2, Lm6/p;->j:Lm6/p;

    move-object v14, v2

    goto :goto_3

    :cond_3
    move-object/from16 v14, p6

    :goto_3
    and-int/lit16 v2, v1, 0x200

    if-eqz v2, :cond_4

    const/4 v15, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v15, p7

    :goto_4
    and-int/lit16 v1, v1, 0x400

    if-eqz v1, :cond_5

    const/4 v7, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v7, p8

    .line 2
    :goto_5
    sget-object v16, Lc5/j;->a:Lc5/j;

    const-string v1, "items"

    move-object/from16 v2, p2

    invoke-static {v1, v2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "focusEntryFrom"

    invoke-static {v1, v14}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f050002

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 4
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v1, v1

    const v4, 0x3e9eb852    # 0.31f

    mul-float/2addr v1, v4

    invoke-static {v1}, Lcom/bumptech/glide/d;->f0(F)I

    move-result v1

    int-to-float v4, v1

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v4, v5

    const/high16 v5, 0x40400000    # 3.0f

    div-float/2addr v4, v5

    .line 5
    invoke-static {v4}, Lcom/bumptech/glide/d;->f0(F)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 6
    new-instance v5, Ll6/d;

    invoke-direct {v5, v4, v1}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_6

    .line 7
    :cond_6
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v1, v1

    const v4, 0x3e99999a    # 0.3f

    mul-float/2addr v1, v4

    invoke-static {v1}, Lcom/bumptech/glide/d;->f0(F)I

    move-result v1

    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 9
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v4, v4

    const v5, 0x3e4ccccd    # 0.2f

    mul-float/2addr v4, v5

    invoke-static {v4}, Lcom/bumptech/glide/d;->f0(F)I

    move-result v4

    .line 10
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 11
    new-instance v5, Ll6/d;

    invoke-direct {v5, v1, v4}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    :goto_6
    iget-object v1, v5, Ll6/d;->j:Ljava/lang/Object;

    .line 13
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 14
    iget-object v4, v5, Ll6/d;->k:Ljava/lang/Object;

    .line 15
    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    const/16 v5, 0x10

    .line 16
    invoke-static {v0, v5}, Lc5/j;->d(Landroid/content/Context;I)I

    move-result v6

    .line 17
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v3}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 18
    const-string v5, "w500"

    :goto_7
    const/16 v17, 0x0

    goto :goto_8

    :cond_7
    const-string v5, "w185"

    goto :goto_7

    .line 19
    :goto_8
    new-instance v8, Landroid/widget/LinearLayout;

    invoke-direct {v8, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 20
    invoke-virtual {v8, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v11, 0x20

    .line 21
    invoke-static {v0, v11}, Lc5/j;->d(Landroid/content/Context;I)I

    move-result v11

    invoke-virtual {v8, v12, v12, v12, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 22
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    invoke-virtual {v11, v3}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v11

    move-object/from16 p5, v7

    if-eqz v11, :cond_8

    const/16 v11, 0x8

    :goto_9
    move/from16 v18, v4

    goto :goto_a

    :cond_8
    const/16 v11, 0x10

    goto :goto_9

    :goto_a
    const/16 v4, 0xf

    move/from16 v19, v6

    const/16 v6, 0xa0

    const/high16 v2, 0x41a00000    # 20.0f

    move/from16 v20, v3

    const/4 v3, -0x1

    move-object/from16 v22, v5

    move v5, v11

    move/from16 v21, v18

    move/from16 v7, v19

    move v11, v1

    move-object/from16 v1, p1

    .line 23
    invoke-static/range {v0 .. v6}, Lc5/j;->k(Landroid/content/Context;Ljava/lang/String;FIIII)Landroid/widget/LinearLayout;

    move-result-object v1

    .line 24
    invoke-virtual {v8, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 25
    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 26
    invoke-virtual {v1, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v2, 0xf

    .line 27
    invoke-static {v0, v2}, Lc5/j;->d(Landroid/content/Context;I)I

    move-result v3

    invoke-static {v0, v2}, Lc5/j;->d(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v3, v12, v2, v12}, Landroid/view/View;->setPadding(IIII)V

    .line 28
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f050002

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v2

    if-eqz v2, :cond_9

    const/high16 v2, 0x40000

    .line 29
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    :cond_9
    const/4 v2, 0x4

    .line 30
    invoke-static {v0, v2}, Lc5/j;->d(Landroid/content/Context;I)I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    .line 31
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v3}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 32
    invoke-virtual {v1, v12}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 33
    invoke-virtual {v1, v12}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 34
    :cond_a
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v18

    move/from16 v19, v12

    :goto_b
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, -0x2

    move/from16 p1, v4

    if-eqz v5, :cond_17

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v20, v19, 0x1

    if-ltz v19, :cond_16

    check-cast v5, Lx4/l;

    .line 35
    iget-object v2, v5, Lx4/l;->d:Ljava/lang/String;

    if-eqz v2, :cond_c

    .line 36
    invoke-static {v2}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    move-result v23

    if-nez v23, :cond_b

    const-string v4, "null"

    .line 37
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    goto :goto_c

    :cond_b
    move-object/from16 v2, v17

    :goto_c
    if-nez v2, :cond_d

    :cond_c
    move-object/from16 v3, v22

    goto :goto_e

    .line 38
    :cond_d
    const-string v4, "https://image.tmdb.org/t/p/"

    move-object/from16 v3, v22

    .line 39
    invoke-static {v4, v3, v2}, La1/a1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_d
    move v4, v6

    goto :goto_f

    :goto_e
    move-object/from16 v2, v17

    goto :goto_d

    .line 40
    :goto_f
    new-instance v6, Landroid/widget/ImageView;

    invoke-direct {v6, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 41
    sget-object v4, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v6, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 42
    sget v4, Lc5/z;->j:I

    move-object/from16 p9, v1

    .line 43
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 44
    invoke-virtual {v1, v12}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    const/16 v12, 0x18

    int-to-float v12, v12

    .line 45
    invoke-virtual {v1, v12}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 46
    invoke-virtual {v1, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 47
    invoke-virtual {v6, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v1, 0x1

    .line 48
    invoke-virtual {v6, v1}, Landroid/view/View;->setClipToOutline(Z)V

    if-eqz v2, :cond_e

    .line 49
    invoke-static {v0}, Lcom/bumptech/glide/b;->b(Landroid/content/Context;)Ln4/l;

    move-result-object v1

    invoke-virtual {v1, v0}, Ln4/l;->c(Landroid/content/Context;)Lcom/bumptech/glide/m;

    move-result-object v1

    .line 50
    invoke-virtual {v1, v2}, Lcom/bumptech/glide/m;->m(Ljava/lang/String;)Lcom/bumptech/glide/j;

    move-result-object v1

    invoke-virtual {v1, v6}, Lcom/bumptech/glide/j;->u(Landroid/widget/ImageView;)V

    goto :goto_10

    :cond_e
    const v1, 0x108003f

    .line 51
    invoke-virtual {v6, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 52
    :goto_10
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    .line 53
    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/4 v4, 0x0

    .line 54
    invoke-virtual {v2, v4, v4, v7, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 55
    invoke-virtual {v2, v1}, Landroid/view/View;->setClickable(Z)V

    .line 56
    invoke-virtual {v2, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 57
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v12, 0x7f050002

    invoke-virtual {v1, v12}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 58
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 59
    :cond_f
    new-instance v1, Lc5/p;

    const/4 v4, 0x2

    move-object/from16 v12, p3

    invoke-direct {v1, v12, v4, v5}, Lc5/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz v9, :cond_10

    .line 60
    new-instance v1, Lc5/a0;

    const/4 v4, 0x0

    invoke-direct {v1, v9, v5, v4}, Lc5/a0;-><init>(Ljava/lang/Object;Lx4/l;I)V

    invoke-virtual {v2, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_10
    move-object v1, v5

    if-nez v19, :cond_11

    move-object v5, v10

    :goto_11
    move v4, v7

    goto :goto_12

    :cond_11
    move-object/from16 v5, v17

    goto :goto_11

    :goto_12
    const/16 v7, 0x30

    move-object/from16 v24, v3

    const/16 v3, 0x18

    move/from16 v25, v4

    const/4 v4, 0x0

    move/from16 v12, p1

    move-object/from16 v26, v9

    move/from16 p4, v13

    move-object/from16 p6, v14

    const/4 v14, -0x1

    const/16 v23, 0x4

    move-object/from16 v9, p5

    move-object v13, v1

    move-object v1, v0

    move-object/from16 v0, v16

    move-object/from16 v16, v10

    move-object/from16 v10, p9

    .line 61
    invoke-static/range {v0 .. v7}, Lc5/j;->f(Lc5/j;Landroid/content/Context;Landroid/view/View;ILw4/x0;Ly6/a;Landroid/view/View;I)V

    move-object/from16 v27, v1

    move-object v1, v0

    move-object/from16 v0, v27

    .line 62
    new-instance v3, Lc5/b0;

    move-object/from16 p9, p2

    move/from16 p7, p4

    move-object/from16 p4, v3

    move-object/from16 p5, v15

    move/from16 p8, v19

    invoke-direct/range {p4 .. p9}, Lc5/b0;-><init>(Ly6/a;Ljava/util/List;ZILjava/util/List;)V

    move-object/from16 v15, p4

    move-object/from16 v5, p5

    move-object/from16 v4, p6

    move/from16 v3, p7

    move/from16 v7, p8

    invoke-virtual {v2, v15}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    if-nez v7, :cond_12

    .line 63
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v15

    if-nez v15, :cond_12

    .line 64
    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v15

    invoke-virtual {v2, v15}, Landroid/view/View;->setId(I)V

    .line 65
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_13
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_12

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v14, v19

    check-cast v14, Landroid/view/View;

    move-object/from16 p4, v1

    .line 66
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v14, v1}, Landroid/view/View;->setNextFocusDownId(I)V

    move-object/from16 v1, p4

    const/4 v14, -0x1

    goto :goto_13

    :cond_12
    move-object/from16 p4, v1

    if-nez v7, :cond_13

    if-eqz v9, :cond_13

    .line 67
    invoke-virtual {v9, v2}, Lw4/t0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    :cond_13
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_14

    .line 69
    invoke-static {v4}, Lm6/h;->A0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v2, v1}, Landroid/view/View;->setNextFocusUpId(I)V

    .line 70
    :cond_14
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    move/from16 v7, v21

    invoke-direct {v1, v11, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 71
    iput v12, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 72
    iput v12, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 73
    iput v12, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 74
    iput v12, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 75
    invoke-virtual {v2, v6, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 76
    iget-object v1, v13, Lx4/l;->b:Ljava/lang/String;

    .line 77
    new-instance v6, Landroid/widget/TextView;

    invoke-direct {v6, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 78
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v14, -0x1

    .line 79
    invoke-virtual {v6, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 80
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v13, 0x7f050002

    invoke-virtual {v1, v13}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v1

    if-eqz v1, :cond_15

    const/high16 v1, 0x41a00000    # 20.0f

    .line 81
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 82
    const-string v1, "sans-serif-medium"

    const/4 v13, 0x0

    invoke-static {v1, v13}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :goto_14
    const/4 v1, 0x1

    goto :goto_15

    :cond_15
    const/high16 v1, 0x41600000    # 14.0f

    .line 83
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setTextSize(F)V

    goto :goto_14

    .line 84
    :goto_15
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 85
    invoke-virtual {v6}, Landroid/widget/TextView;->setSingleLine()V

    const v13, 0x800003

    .line 86
    invoke-virtual {v6, v13}, Landroid/widget/TextView;->setGravity(I)V

    .line 87
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v14, -0x2

    const/4 v15, -0x1

    invoke-direct {v13, v15, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 88
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 89
    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 90
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    mul-int/lit8 v13, v12, 0x2

    add-int/2addr v13, v11

    invoke-direct {v1, v13, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 91
    iput v12, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 92
    invoke-virtual {v2, v6, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 93
    invoke-virtual {v10, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move v13, v3

    move-object v14, v4

    move-object v15, v5

    move/from16 v21, v7

    move-object/from16 p5, v9

    move-object v1, v10

    move v4, v12

    move-object/from16 v10, v16

    move/from16 v19, v20

    move/from16 v2, v23

    move-object/from16 v22, v24

    move/from16 v7, v25

    move-object/from16 v9, v26

    const v3, 0x7f050002

    const/4 v12, 0x0

    move-object/from16 v16, p4

    goto/16 :goto_b

    .line 94
    :cond_16
    invoke-static {}, Lm6/i;->v0()V

    throw v17

    :cond_17
    move/from16 v12, p1

    move-object v10, v1

    move/from16 v23, v2

    move v14, v6

    .line 95
    new-instance v1, Lc5/l0;

    .line 96
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v13, 0x7f050002

    invoke-virtual {v2, v13}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v2

    if-eqz v2, :cond_18

    mul-int/lit8 v4, v12, 0x2

    add-int/2addr v4, v11

    int-to-float v2, v4

    const v3, 0x3cf5c280    # 0.029999971f

    mul-float/2addr v2, v3

    .line 97
    invoke-static {v2}, Lcom/bumptech/glide/d;->f0(F)I

    move-result v2

    add-int/lit8 v4, v2, 0x4

    goto :goto_16

    :cond_18
    const/4 v4, 0x0

    .line 98
    :goto_16
    invoke-direct {v1, v0, v4}, Lc5/l0;-><init>(Landroid/content/Context;I)V

    const/4 v13, 0x0

    .line 99
    invoke-virtual {v1, v13}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 100
    invoke-virtual {v1, v13}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 101
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v12, 0x7f050002

    invoke-virtual {v2, v12}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v2

    if-eqz v2, :cond_19

    .line 102
    invoke-virtual {v1, v13}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    const/16 v2, 0x8

    int-to-float v2, v2

    .line 103
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    const/4 v4, 0x1

    .line 104
    invoke-static {v4, v2, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v3

    float-to-int v3, v3

    .line 105
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 106
    invoke-static {v4, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    .line 107
    invoke-virtual {v1, v13, v3, v13, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 108
    :cond_19
    invoke-virtual {v1, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 109
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v15, -0x1

    invoke-direct {v0, v15, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 110
    invoke-virtual {v8, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-object v8
.end method


# virtual methods
.method public final e(Landroid/content/Context;Lx4/l;Lx4/m;Lr6/c;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    instance-of v2, v1, Lc5/n0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lc5/n0;

    .line 11
    .line 12
    iget v3, v2, Lc5/n0;->r:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lc5/n0;->r:I

    .line 22
    .line 23
    move-object/from16 v3, p0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v2, Lc5/n0;

    .line 27
    .line 28
    move-object/from16 v3, p0

    .line 29
    .line 30
    invoke-direct {v2, v3, v1}, Lc5/n0;-><init>(Lc5/r0;Lr6/c;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v1, v2, Lc5/n0;->p:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v4, Lq6/a;->j:Lq6/a;

    .line 36
    .line 37
    iget v5, v2, Lc5/n0;->r:I

    .line 38
    .line 39
    const-string v6, "__no_featured_logo__"

    .line 40
    .line 41
    const/4 v7, 0x0

    .line 42
    sget-object v8, Lc5/r0;->c:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 43
    .line 44
    sget-object v9, Lc5/r0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 45
    .line 46
    sget-object v10, Lc5/r0;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 47
    .line 48
    const/4 v11, 0x2

    .line 49
    const/4 v12, 0x1

    .line 50
    if-eqz v5, :cond_3

    .line 51
    .line 52
    if-eq v5, v12, :cond_2

    .line 53
    .line 54
    if-ne v5, v11, :cond_1

    .line 55
    .line 56
    iget-object v4, v2, Lc5/n0;->o:Li7/m;

    .line 57
    .line 58
    iget-object v0, v2, Lc5/n0;->n:Landroid/content/SharedPreferences;

    .line 59
    .line 60
    iget-object v2, v2, Lc5/n0;->m:Ljava/lang/String;

    .line 61
    .line 62
    :try_start_0
    invoke-static {v1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    goto/16 :goto_2

    .line 66
    .line 67
    :catchall_0
    move-exception v0

    .line 68
    goto/16 :goto_6

    .line 69
    .line 70
    :catch_0
    move-exception v0

    .line 71
    goto/16 :goto_4

    .line 72
    .line 73
    :catch_1
    move-exception v0

    .line 74
    goto/16 :goto_5

    .line 75
    .line 76
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 79
    .line 80
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0

    .line 84
    :cond_2
    invoke-static {v1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    return-object v1

    .line 88
    :cond_3
    invoke-static {v1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    iget-wide v13, v0, Lx4/l;->a:J

    .line 96
    .line 97
    new-instance v5, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v1, ":"

    .line 106
    .line 107
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v5, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v9, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    check-cast v5, Ljava/lang/String;

    .line 122
    .line 123
    if-eqz v5, :cond_4

    .line 124
    .line 125
    return-object v5

    .line 126
    :cond_4
    invoke-virtual {v8, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    const/4 v13, 0x0

    .line 131
    if-eqz v5, :cond_5

    .line 132
    .line 133
    return-object v13

    .line 134
    :cond_5
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    const-string v14, "featured_logo_cache"

    .line 139
    .line 140
    invoke-virtual {v5, v14, v7}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    invoke-interface {v5, v1, v13}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v14

    .line 148
    if-eqz v14, :cond_7

    .line 149
    .line 150
    invoke-virtual {v14, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_6

    .line 155
    .line 156
    invoke-virtual {v8, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    return-object v13

    .line 160
    :cond_6
    invoke-virtual {v9, v1, v14}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    return-object v14

    .line 164
    :cond_7
    new-instance v14, Li7/m;

    .line 165
    .line 166
    invoke-direct {v14, v12}, Li7/a1;-><init>(Z)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v14, v13}, Li7/a1;->C(Li7/s0;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v10, v1, v14}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v15

    .line 176
    check-cast v15, Li7/l;

    .line 177
    .line 178
    if-eqz v15, :cond_9

    .line 179
    .line 180
    iput v12, v2, Lc5/n0;->r:I

    .line 181
    .line 182
    check-cast v15, Li7/m;

    .line 183
    .line 184
    invoke-virtual {v15, v2}, Li7/m;->T(Lr6/c;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    if-ne v0, v4, :cond_8

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_8
    return-object v0

    .line 192
    :cond_9
    :try_start_1
    sget-object v12, Li7/e0;->a:Lo7/e;

    .line 193
    .line 194
    sget-object v12, Lo7/d;->l:Lo7/d;

    .line 195
    .line 196
    new-instance v15, Lc5/q0;

    .line 197
    .line 198
    move-object/from16 v11, p3

    .line 199
    .line 200
    invoke-direct {v15, v11, v0, v13, v7}, Lc5/q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lp6/c;I)V

    .line 201
    .line 202
    .line 203
    iput-object v1, v2, Lc5/n0;->m:Ljava/lang/String;

    .line 204
    .line 205
    iput-object v5, v2, Lc5/n0;->n:Landroid/content/SharedPreferences;

    .line 206
    .line 207
    iput-object v14, v2, Lc5/n0;->o:Li7/m;

    .line 208
    .line 209
    const/4 v0, 0x2

    .line 210
    iput v0, v2, Lc5/n0;->r:I

    .line 211
    .line 212
    invoke-static {v12, v15, v2}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 216
    if-ne v0, v4, :cond_a

    .line 217
    .line 218
    :goto_1
    return-object v4

    .line 219
    :cond_a
    move-object v2, v1

    .line 220
    move-object v4, v14

    .line 221
    move-object v1, v0

    .line 222
    move-object v0, v5

    .line 223
    :goto_2
    :try_start_2
    check-cast v1, Ljava/lang/String;

    .line 224
    .line 225
    if-nez v1, :cond_b

    .line 226
    .line 227
    invoke-virtual {v8, v2}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-interface {v0, v2, v6}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 239
    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_b
    invoke-virtual {v9, v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 254
    .line 255
    .line 256
    :goto_3
    invoke-virtual {v4, v1}, Li7/a1;->G(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 257
    .line 258
    .line 259
    invoke-virtual {v10, v2, v4}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    return-object v1

    .line 263
    :catchall_1
    move-exception v0

    .line 264
    move-object v2, v1

    .line 265
    move-object v4, v14

    .line 266
    goto :goto_6

    .line 267
    :catch_2
    move-exception v0

    .line 268
    move-object v2, v1

    .line 269
    move-object v4, v14

    .line 270
    goto :goto_4

    .line 271
    :catch_3
    move-exception v0

    .line 272
    move-object v2, v1

    .line 273
    move-object v4, v14

    .line 274
    goto :goto_5

    .line 275
    :goto_4
    :try_start_3
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    new-instance v1, Li7/o;

    .line 279
    .line 280
    invoke-direct {v1, v0, v7}, Li7/o;-><init>(Ljava/lang/Throwable;Z)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v4, v1}, Li7/a1;->G(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    throw v0

    .line 287
    :goto_5
    invoke-virtual {v4, v0}, Li7/a1;->m(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 291
    :goto_6
    invoke-virtual {v10, v2, v4}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    throw v0
.end method
