.class public final Lcom/exotv/net/SeriesDetailActivity;
.super Lh/i;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final synthetic k0:I


# instance fields
.field public H:Landroid/widget/LinearLayout;

.field public I:Landroid/widget/TextView;

.field public J:Landroid/widget/ScrollView;

.field public K:Landroid/widget/LinearLayout;

.field public L:Landroid/widget/LinearLayout;

.field public M:Landroid/widget/TextView;

.field public final N:Ljava/util/ArrayList;

.field public O:Landroid/widget/LinearLayout;

.field public P:Landroid/widget/TextView;

.field public Q:Landroid/view/View;

.field public R:Z

.field public S:Ljava/lang/String;

.field public T:Ljava/lang/Integer;

.field public U:Landroid/widget/TextView;

.field public V:Landroid/widget/ProgressBar;

.field public W:Z

.field public X:Landroid/widget/LinearLayout;

.field public Y:Landroid/widget/TextView;

.field public Z:I

.field public final a0:Ll6/g;

.field public b0:J

.field public c0:Ljava/lang/String;

.field public d0:Ljava/util/List;

.field public e0:I

.field public f0:Li7/a0;

.field public g0:Ljava/util/List;

.field public h0:I

.field public final i0:I

.field public final j0:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lh/i;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/exotv/net/SeriesDetailActivity;->N:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Lw4/s0;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, v1, p0}, Lw4/s0;-><init>(ILcom/exotv/net/SeriesDetailActivity;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Ll6/g;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Ll6/g;-><init>(Ly6/a;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lcom/exotv/net/SeriesDetailActivity;->a0:Ll6/g;

    .line 23
    .line 24
    const-string v0, ""

    .line 25
    .line 26
    iput-object v0, p0, Lcom/exotv/net/SeriesDetailActivity;->c0:Ljava/lang/String;

    .line 27
    .line 28
    new-instance v0, Lw4/b1;

    .line 29
    .line 30
    const/16 v1, 0x1e

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lw4/b1;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lcom/bumptech/glide/d;->T(Ljava/lang/Object;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lcom/exotv/net/SeriesDetailActivity;->d0:Ljava/util/List;

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    iput v0, p0, Lcom/exotv/net/SeriesDetailActivity;->e0:I

    .line 43
    .line 44
    sget-object v1, Lm6/p;->j:Lm6/p;

    .line 45
    .line 46
    iput-object v1, p0, Lcom/exotv/net/SeriesDetailActivity;->g0:Ljava/util/List;

    .line 47
    .line 48
    iput v0, p0, Lcom/exotv/net/SeriesDetailActivity;->h0:I

    .line 49
    .line 50
    const/4 v0, -0x1

    .line 51
    iput v0, p0, Lcom/exotv/net/SeriesDetailActivity;->i0:I

    .line 52
    .line 53
    const/4 v0, -0x2

    .line 54
    iput v0, p0, Lcom/exotv/net/SeriesDetailActivity;->j0:I

    .line 55
    .line 56
    return-void
.end method

.method public static A(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    if-ge p0, v0, :cond_0

    .line 4
    .line 5
    const-string v0, "0"

    .line 6
    .line 7
    invoke-static {p0, v0}, La1/a1;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static final r(Lcom/exotv/net/SeriesDetailActivity;Lr6/c;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Lw4/e1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lw4/e1;

    .line 11
    .line 12
    iget v3, v2, Lw4/e1;->p:I

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
    iput v3, v2, Lw4/e1;->p:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lw4/e1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lw4/e1;-><init>(Lcom/exotv/net/SeriesDetailActivity;Lr6/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lw4/e1;->n:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Lq6/a;->j:Lq6/a;

    .line 32
    .line 33
    iget v4, v2, Lw4/e1;->p:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x1

    .line 37
    sget-object v7, Ll6/j;->a:Ll6/j;

    .line 38
    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    if-ne v4, v6, :cond_2

    .line 42
    .line 43
    iget-object v0, v2, Lw4/e1;->m:Lcom/exotv/net/SeriesDetailActivity;

    .line 44
    .line 45
    :try_start_0
    invoke-static {v1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    :cond_1
    move-object v8, v0

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :cond_3
    invoke-static {v1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :try_start_1
    iput-object v0, v2, Lw4/e1;->m:Lcom/exotv/net/SeriesDetailActivity;

    .line 62
    .line 63
    iput v6, v2, Lw4/e1;->p:I

    .line 64
    .line 65
    sget-object v1, Li7/e0;->a:Lo7/e;

    .line 66
    .line 67
    sget-object v1, Lo7/d;->l:Lo7/d;

    .line 68
    .line 69
    new-instance v4, Lw4/d1;

    .line 70
    .line 71
    invoke-direct {v4, v0, v5, v6}, Lw4/d1;-><init>(Lcom/exotv/net/SeriesDetailActivity;Lp6/c;I)V

    .line 72
    .line 73
    .line 74
    invoke-static {v1, v4, v2}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-ne v1, v3, :cond_1

    .line 79
    .line 80
    return-object v3

    .line 81
    :goto_1
    check-cast v1, Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 82
    .line 83
    new-instance v10, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_5

    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    move-object v2, v1

    .line 103
    check-cast v2, Lx4/l;

    .line 104
    .line 105
    iget-wide v2, v2, Lx4/l;->a:J

    .line 106
    .line 107
    iget-wide v11, v8, Lcom/exotv/net/SeriesDetailActivity;->b0:J

    .line 108
    .line 109
    cmp-long v2, v2, v11

    .line 110
    .line 111
    if-eqz v2, :cond_4

    .line 112
    .line 113
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_5
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_6

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_6
    iget-object v0, v8, Lcom/exotv/net/SeriesDetailActivity;->H:Landroid/widget/LinearLayout;

    .line 125
    .line 126
    if-eqz v0, :cond_7

    .line 127
    .line 128
    sget-object v1, Lc5/r0;->a:Lc5/r0;

    .line 129
    .line 130
    const v1, 0x7f11011c

    .line 131
    .line 132
    .line 133
    invoke-virtual {v8, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    const-string v1, "getString(...)"

    .line 138
    .line 139
    invoke-static {v1, v9}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    new-instance v11, Lw4/t0;

    .line 143
    .line 144
    invoke-direct {v11, v6, v8}, Lw4/t0;-><init>(ILcom/exotv/net/SeriesDetailActivity;)V

    .line 145
    .line 146
    .line 147
    new-instance v15, Lw4/s0;

    .line 148
    .line 149
    invoke-direct {v15, v6, v8}, Lw4/s0;-><init>(ILcom/exotv/net/SeriesDetailActivity;)V

    .line 150
    .line 151
    .line 152
    new-instance v1, Lw4/t0;

    .line 153
    .line 154
    const/4 v2, 0x0

    .line 155
    invoke-direct {v1, v2, v8}, Lw4/t0;-><init>(ILcom/exotv/net/SeriesDetailActivity;)V

    .line 156
    .line 157
    .line 158
    const/16 v17, 0x168

    .line 159
    .line 160
    const/4 v12, 0x0

    .line 161
    const/4 v13, 0x0

    .line 162
    const/4 v14, 0x0

    .line 163
    move-object/from16 v16, v1

    .line 164
    .line 165
    invoke-static/range {v8 .. v17}, Lc5/r0;->f(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Ly6/l;Ly6/l;Lw4/g;Ljava/util/ArrayList;Lw4/s0;Lw4/t0;I)Landroid/widget/LinearLayout;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    const/4 v13, 0x0

    .line 170
    const/16 v14, 0x3e

    .line 171
    .line 172
    const/16 v9, 0x10

    .line 173
    .line 174
    const/4 v10, 0x0

    .line 175
    const/4 v11, 0x0

    .line 176
    const/4 v12, 0x0

    .line 177
    invoke-static/range {v8 .. v14}, Lcom/exotv/net/SeriesDetailActivity;->x(Lcom/exotv/net/SeriesDetailActivity;IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 182
    .line 183
    .line 184
    return-object v7

    .line 185
    :cond_7
    const-string v0, "content"

    .line 186
    .line 187
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw v5

    .line 191
    :catch_0
    :goto_3
    return-object v7
.end method

.method public static x(Lcom/exotv/net/SeriesDetailActivity;IIIIII)Landroid/widget/LinearLayout$LayoutParams;
    .locals 3

    .line 1
    and-int/lit8 v0, p6, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p1, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p6, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    move p2, v1

    .line 12
    :cond_1
    and-int/lit8 v0, p6, 0x4

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    iget p3, p0, Lcom/exotv/net/SeriesDetailActivity;->i0:I

    .line 17
    .line 18
    :cond_2
    iget v0, p0, Lcom/exotv/net/SeriesDetailActivity;->j0:I

    .line 19
    .line 20
    and-int/lit8 v2, p6, 0x10

    .line 21
    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    move p4, v1

    .line 25
    :cond_3
    and-int/lit8 p6, p6, 0x20

    .line 26
    .line 27
    if-eqz p6, :cond_4

    .line 28
    .line 29
    move p5, v1

    .line 30
    :cond_4
    new-instance p6, Landroid/widget/LinearLayout$LayoutParams;

    .line 31
    .line 32
    invoke-direct {p6, p3, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0, p1}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iput p1, p6, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 40
    .line 41
    invoke-static {p0, p2}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    iput p1, p6, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 46
    .line 47
    invoke-static {p0, p4}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iput p1, p6, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 52
    .line 53
    invoke-static {p0, p5}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    iput p0, p6, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 58
    .line 59
    return-object p6
.end method

.method public static z(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "null"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method


# virtual methods
.method public final B(Ljava/lang/String;Ly6/a;)Landroid/widget/TextView;
    .locals 8

    .line 1
    new-instance v2, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {v2, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    const/high16 v0, 0x41d00000    # 26.0f

    .line 10
    .line 11
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 12
    .line 13
    .line 14
    const/16 v0, 0x11

    .line 15
    .line 16
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 17
    .line 18
    .line 19
    sget v0, Lw4/z0;->h:I

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 22
    .line 23
    .line 24
    sget-object v0, Lc5/j;->a:Lc5/j;

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    const/16 v7, 0x1e4

    .line 28
    .line 29
    const/16 v3, 0x10

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v5, 0x0

    .line 33
    move-object v1, p0

    .line 34
    invoke-static/range {v0 .. v7}, Lc5/j;->f(Lc5/j;Landroid/content/Context;Landroid/view/View;ILw4/x0;Ly6/a;Landroid/view/View;I)V

    .line 35
    .line 36
    .line 37
    const/16 v0, 0x14

    .line 38
    .line 39
    invoke-static {p0, v0}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const/16 v4, 0x12

    .line 44
    .line 45
    invoke-static {p0, v4}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    invoke-static {p0, v0}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-static {p0, v4}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-virtual {v2, v3, v5, v0, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 58
    .line 59
    .line 60
    new-instance v0, Lc5/f1;

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    invoke-direct {v0, p0, p1, p2, v3}, Lc5/f1;-><init>(Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 67
    .line 68
    .line 69
    new-instance p1, Lw4/v0;

    .line 70
    .line 71
    const/4 p2, 0x2

    .line 72
    invoke-direct {p1, p2, p0}, Lw4/v0;-><init>(ILcom/exotv/net/SeriesDetailActivity;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, p1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 76
    .line 77
    .line 78
    return-object v2
.end method

.method public final C()V
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lc5/j;->a:Lc5/j;

    .line 4
    .line 5
    iget-object v2, v0, Lcom/exotv/net/SeriesDetailActivity;->L:Landroid/widget/LinearLayout;

    .line 6
    .line 7
    const-string v8, "episodeBox"

    .line 8
    .line 9
    const/4 v9, 0x0

    .line 10
    if-eqz v2, :cond_2d

    .line 11
    .line 12
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 13
    .line 14
    .line 15
    iget-object v10, v0, Lcom/exotv/net/SeriesDetailActivity;->N:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    .line 18
    .line 19
    .line 20
    iput-object v9, v0, Lcom/exotv/net/SeriesDetailActivity;->P:Landroid/widget/TextView;

    .line 21
    .line 22
    iget-object v2, v0, Lcom/exotv/net/SeriesDetailActivity;->g0:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    iget-object v7, v0, Lcom/exotv/net/SeriesDetailActivity;->L:Landroid/widget/LinearLayout;

    .line 31
    .line 32
    if-eqz v7, :cond_0

    .line 33
    .line 34
    iget v1, v0, Lcom/exotv/net/SeriesDetailActivity;->e0:I

    .line 35
    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v3, "No episodes listed for season "

    .line 39
    .line 40
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Lcom/exotv/net/SeriesDetailActivity;->y(Ljava/lang/String;)Landroid/widget/TextView;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    const/4 v5, 0x0

    .line 55
    const/16 v6, 0x3f

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    const/4 v2, 0x0

    .line 59
    const/4 v3, 0x0

    .line 60
    const/4 v4, 0x0

    .line 61
    invoke-static/range {v0 .. v6}, Lcom/exotv/net/SeriesDetailActivity;->x(Lcom/exotv/net/SeriesDetailActivity;IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v7, v8, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_0
    invoke-static {v8}, Lz6/h;->h(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v9

    .line 73
    :cond_1
    iget-object v2, v0, Lcom/exotv/net/SeriesDetailActivity;->g0:Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    const/4 v12, 0x0

    .line 80
    if-gtz v11, :cond_2

    .line 81
    .line 82
    move v13, v12

    .line 83
    goto :goto_0

    .line 84
    :cond_2
    add-int/lit8 v2, v11, 0x13

    .line 85
    .line 86
    div-int/lit8 v2, v2, 0x14

    .line 87
    .line 88
    move v13, v2

    .line 89
    :goto_0
    const/4 v14, 0x1

    .line 90
    if-nez v13, :cond_3

    .line 91
    .line 92
    move v15, v14

    .line 93
    goto :goto_1

    .line 94
    :cond_3
    iget v2, v0, Lcom/exotv/net/SeriesDetailActivity;->h0:I

    .line 95
    .line 96
    invoke-static {v2, v14, v13}, Lcom/bumptech/glide/c;->t(III)I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    move v15, v2

    .line 101
    :goto_1
    if-gtz v11, :cond_4

    .line 102
    .line 103
    invoke-static {v12, v12}, Lcom/bumptech/glide/c;->g0(II)Le7/c;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    goto :goto_3

    .line 108
    :cond_4
    if-gtz v11, :cond_5

    .line 109
    .line 110
    move v2, v12

    .line 111
    goto :goto_2

    .line 112
    :cond_5
    add-int/lit8 v2, v11, 0x13

    .line 113
    .line 114
    div-int/lit8 v2, v2, 0x14

    .line 115
    .line 116
    :goto_2
    invoke-static {v15, v14, v2}, Lcom/bumptech/glide/c;->t(III)I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    sub-int/2addr v2, v14

    .line 121
    mul-int/lit8 v2, v2, 0x14

    .line 122
    .line 123
    add-int/lit8 v3, v2, 0x14

    .line 124
    .line 125
    invoke-static {v3, v11}, Ljava/lang/Math;->min(II)I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    invoke-static {v2, v3}, Lcom/bumptech/glide/c;->g0(II)Le7/c;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    :goto_3
    iget-object v3, v0, Lcom/exotv/net/SeriesDetailActivity;->g0:Ljava/util/List;

    .line 134
    .line 135
    iget v4, v2, Le7/a;->j:I

    .line 136
    .line 137
    iget v5, v2, Le7/a;->k:I

    .line 138
    .line 139
    add-int/2addr v5, v14

    .line 140
    invoke-interface {v3, v4, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v16

    .line 148
    :goto_4
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    const/16 v17, -0x1

    .line 153
    .line 154
    if-eqz v3, :cond_12

    .line 155
    .line 156
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    check-cast v3, Lw4/a1;

    .line 161
    .line 162
    sget-object v19, Lz4/g0;->a:Lz4/g0;

    .line 163
    .line 164
    iget-object v4, v3, Lw4/a1;->f:Ljava/lang/String;

    .line 165
    .line 166
    iget-object v9, v3, Lw4/a1;->e:Ljava/lang/String;

    .line 167
    .line 168
    move-object/from16 v20, v4

    .line 169
    .line 170
    iget v4, v3, Lw4/a1;->a:I

    .line 171
    .line 172
    invoke-static/range {v20 .. v20}, Lz4/g0;->e(Ljava/lang/String;)Z

    .line 173
    .line 174
    .line 175
    move-result v20

    .line 176
    move-object/from16 v21, v2

    .line 177
    .line 178
    new-instance v2, Landroid/widget/LinearLayout;

    .line 179
    .line 180
    invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 184
    .line 185
    .line 186
    const/16 v12, 0x10

    .line 187
    .line 188
    invoke-virtual {v2, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 189
    .line 190
    .line 191
    const/16 v6, 0xa

    .line 192
    .line 193
    invoke-static {v0, v6}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 194
    .line 195
    .line 196
    move-result v7

    .line 197
    invoke-static {v0, v6}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 198
    .line 199
    .line 200
    move-result v12

    .line 201
    const/16 v14, 0xe

    .line 202
    .line 203
    invoke-static {v0, v14}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 204
    .line 205
    .line 206
    move-result v14

    .line 207
    invoke-static {v0, v6}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 208
    .line 209
    .line 210
    move-result v6

    .line 211
    invoke-virtual {v2, v7, v12, v14, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 212
    .line 213
    .line 214
    sget v6, Lw4/z0;->b:I

    .line 215
    .line 216
    sget v7, Lw4/z0;->e:I

    .line 217
    .line 218
    const/16 v12, 0x18

    .line 219
    .line 220
    const/4 v14, 0x1

    .line 221
    invoke-static {v6, v12, v14, v7}, Lc5/j;->i(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 222
    .line 223
    .line 224
    move-result-object v6

    .line 225
    invoke-virtual {v2, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 226
    .line 227
    .line 228
    if-eqz v20, :cond_6

    .line 229
    .line 230
    const v6, 0x3ecccccd    # 0.4f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, v6}, Landroid/view/View;->setAlpha(F)V

    .line 234
    .line 235
    .line 236
    move-object v7, v1

    .line 237
    move-object v6, v2

    .line 238
    move-object/from16 v19, v3

    .line 239
    .line 240
    move/from16 v26, v4

    .line 241
    .line 242
    move/from16 v27, v5

    .line 243
    .line 244
    move-object/from16 v14, v21

    .line 245
    .line 246
    const/16 v12, 0x8

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_6
    const/4 v6, 0x0

    .line 250
    const/16 v7, 0x1f4

    .line 251
    .line 252
    move-object v14, v3

    .line 253
    const/16 v3, 0x18

    .line 254
    .line 255
    move/from16 v26, v4

    .line 256
    .line 257
    const/4 v4, 0x0

    .line 258
    move/from16 v27, v5

    .line 259
    .line 260
    const/4 v5, 0x0

    .line 261
    move-object v12, v1

    .line 262
    move-object v1, v0

    .line 263
    move-object v0, v12

    .line 264
    move-object/from16 v19, v14

    .line 265
    .line 266
    move-object/from16 v14, v21

    .line 267
    .line 268
    const/16 v12, 0x8

    .line 269
    .line 270
    invoke-static/range {v0 .. v7}, Lc5/j;->f(Lc5/j;Landroid/content/Context;Landroid/view/View;ILw4/x0;Ly6/a;Landroid/view/View;I)V

    .line 271
    .line 272
    .line 273
    move-object v7, v0

    .line 274
    move-object v0, v1

    .line 275
    move-object v6, v2

    .line 276
    new-instance v1, Lw4/v0;

    .line 277
    .line 278
    const/4 v2, 0x1

    .line 279
    invoke-direct {v1, v2, v0}, Lw4/v0;-><init>(ILcom/exotv/net/SeriesDetailActivity;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v6, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 283
    .line 284
    .line 285
    :goto_5
    new-instance v1, Landroid/widget/FrameLayout;

    .line 286
    .line 287
    invoke-direct {v1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 288
    .line 289
    .line 290
    new-instance v2, Landroid/widget/ImageView;

    .line 291
    .line 292
    invoke-direct {v2, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 293
    .line 294
    .line 295
    sget-object v3, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 296
    .line 297
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 298
    .line 299
    .line 300
    sget v3, Lw4/z0;->c:I

    .line 301
    .line 302
    const/16 v4, 0x10

    .line 303
    .line 304
    const/4 v5, 0x0

    .line 305
    invoke-static {v3, v4, v5, v5}, Lc5/j;->i(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 310
    .line 311
    .line 312
    const/4 v3, 0x1

    .line 313
    invoke-virtual {v2, v3}, Landroid/view/View;->setClipToOutline(Z)V

    .line 314
    .line 315
    .line 316
    sget-object v3, Landroid/view/ViewOutlineProvider;->BACKGROUND:Landroid/view/ViewOutlineProvider;

    .line 317
    .line 318
    invoke-virtual {v2, v3}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 319
    .line 320
    .line 321
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 322
    .line 323
    iget v4, v0, Lcom/exotv/net/SeriesDetailActivity;->i0:I

    .line 324
    .line 325
    invoke-direct {v3, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v1, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 329
    .line 330
    .line 331
    invoke-static/range {v26 .. v26}, Lcom/exotv/net/SeriesDetailActivity;->A(I)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    sget v4, Lw4/z0;->d:I

    .line 336
    .line 337
    const/4 v5, 0x6

    .line 338
    const/4 v12, 0x4

    .line 339
    invoke-static {v0, v3, v4, v5, v12}, Lc5/j;->b(Landroid/content/Context;Ljava/lang/String;III)Landroid/widget/TextView;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    const/16 v4, 0x11

    .line 344
    .line 345
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 346
    .line 347
    .line 348
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    .line 349
    .line 350
    iget v12, v0, Lcom/exotv/net/SeriesDetailActivity;->j0:I

    .line 351
    .line 352
    invoke-direct {v5, v12, v12}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 353
    .line 354
    .line 355
    iput v4, v5, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 356
    .line 357
    invoke-virtual {v1, v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 358
    .line 359
    .line 360
    new-instance v4, Landroid/widget/ProgressBar;

    .line 361
    .line 362
    const v5, 0x1010077

    .line 363
    .line 364
    .line 365
    move-object/from16 v23, v2

    .line 366
    .line 367
    const/4 v2, 0x0

    .line 368
    invoke-direct {v4, v0, v2, v5}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 369
    .line 370
    .line 371
    invoke-static/range {v17 .. v17}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    invoke-virtual {v4, v2}, Landroid/widget/ProgressBar;->setIndeterminateTintList(Landroid/content/res/ColorStateList;)V

    .line 376
    .line 377
    .line 378
    const/16 v2, 0x8

    .line 379
    .line 380
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 381
    .line 382
    .line 383
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 384
    .line 385
    move-object/from16 v21, v3

    .line 386
    .line 387
    const/16 v5, 0x18

    .line 388
    .line 389
    invoke-static {v0, v5}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 390
    .line 391
    .line 392
    move-result v3

    .line 393
    invoke-static {v0, v5}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 394
    .line 395
    .line 396
    move-result v5

    .line 397
    invoke-direct {v2, v3, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 398
    .line 399
    .line 400
    const/16 v3, 0x11

    .line 401
    .line 402
    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 403
    .line 404
    invoke-virtual {v1, v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 405
    .line 406
    .line 407
    if-nez v20, :cond_7

    .line 408
    .line 409
    new-instance v0, Lw2/m;

    .line 410
    .line 411
    const/4 v5, 0x1

    .line 412
    move-object/from16 v24, v7

    .line 413
    .line 414
    move-object/from16 v2, v19

    .line 415
    .line 416
    move-object/from16 v3, v21

    .line 417
    .line 418
    move-object v7, v1

    .line 419
    move-object/from16 v19, v8

    .line 420
    .line 421
    move-object/from16 v8, v23

    .line 422
    .line 423
    move-object/from16 v1, p0

    .line 424
    .line 425
    invoke-direct/range {v0 .. v5}, Lw2/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 426
    .line 427
    .line 428
    move-object/from16 v35, v1

    .line 429
    .line 430
    move-object v1, v0

    .line 431
    move-object/from16 v0, v35

    .line 432
    .line 433
    invoke-virtual {v6, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 434
    .line 435
    .line 436
    goto :goto_6

    .line 437
    :cond_7
    move-object/from16 v24, v7

    .line 438
    .line 439
    move-object/from16 v2, v19

    .line 440
    .line 441
    move-object v7, v1

    .line 442
    move-object/from16 v19, v8

    .line 443
    .line 444
    move-object/from16 v8, v23

    .line 445
    .line 446
    :goto_6
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 447
    .line 448
    const/16 v3, 0x7c

    .line 449
    .line 450
    invoke-static {v0, v3}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 451
    .line 452
    .line 453
    move-result v3

    .line 454
    const/16 v4, 0x46

    .line 455
    .line 456
    invoke-static {v0, v4}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 457
    .line 458
    .line 459
    move-result v4

    .line 460
    invoke-direct {v1, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 461
    .line 462
    .line 463
    const/16 v3, 0xc

    .line 464
    .line 465
    invoke-static {v0, v3}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 466
    .line 467
    .line 468
    move-result v3

    .line 469
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v6, v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 473
    .line 474
    .line 475
    iget-object v1, v2, Lw4/a1;->c:Ljava/lang/String;

    .line 476
    .line 477
    if-eqz v1, :cond_a

    .line 478
    .line 479
    invoke-static {v1}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 480
    .line 481
    .line 482
    move-result v3

    .line 483
    if-nez v3, :cond_8

    .line 484
    .line 485
    const-string v3, "null"

    .line 486
    .line 487
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    move-result v3

    .line 491
    if-nez v3, :cond_8

    .line 492
    .line 493
    goto :goto_7

    .line 494
    :cond_8
    const/4 v1, 0x0

    .line 495
    :goto_7
    if-nez v1, :cond_9

    .line 496
    .line 497
    goto :goto_8

    .line 498
    :cond_9
    const-string v3, "https://image.tmdb.org/t/p/w342"

    .line 499
    .line 500
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    goto :goto_9

    .line 505
    :cond_a
    :goto_8
    const/4 v1, 0x0

    .line 506
    :goto_9
    if-eqz v1, :cond_b

    .line 507
    .line 508
    invoke-static {v0}, Lcom/bumptech/glide/b;->b(Landroid/content/Context;)Ln4/l;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    invoke-virtual {v3, v0}, Ln4/l;->d(Lh/i;)Lcom/bumptech/glide/m;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    invoke-virtual {v3, v1}, Lcom/bumptech/glide/m;->m(Ljava/lang/String;)Lcom/bumptech/glide/j;

    .line 517
    .line 518
    .line 519
    move-result-object v1

    .line 520
    invoke-virtual {v1, v8}, Lcom/bumptech/glide/j;->u(Landroid/widget/ImageView;)V

    .line 521
    .line 522
    .line 523
    :cond_b
    new-instance v1, Landroid/widget/LinearLayout;

    .line 524
    .line 525
    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 526
    .line 527
    .line 528
    const/4 v3, 0x1

    .line 529
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 530
    .line 531
    .line 532
    new-instance v3, Ljava/util/ArrayList;

    .line 533
    .line 534
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 535
    .line 536
    .line 537
    invoke-static/range {v26 .. v26}, Lcom/exotv/net/SeriesDetailActivity;->A(I)Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v4

    .line 541
    new-instance v5, Ljava/lang/StringBuilder;

    .line 542
    .line 543
    const-string v7, "E"

    .line 544
    .line 545
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v4

    .line 555
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 556
    .line 557
    .line 558
    iget v4, v2, Lw4/a1;->d:I

    .line 559
    .line 560
    if-lez v4, :cond_c

    .line 561
    .line 562
    new-instance v5, Ljava/lang/StringBuilder;

    .line 563
    .line 564
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 565
    .line 566
    .line 567
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 568
    .line 569
    .line 570
    const-string v4, " min"

    .line 571
    .line 572
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    move-result-object v4

    .line 579
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    :cond_c
    new-instance v4, Landroid/widget/TextView;

    .line 583
    .line 584
    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 585
    .line 586
    .line 587
    const/16 v33, 0x0

    .line 588
    .line 589
    const/16 v34, 0x3e

    .line 590
    .line 591
    const-string v30, "  \u00b7  "

    .line 592
    .line 593
    const/16 v31, 0x0

    .line 594
    .line 595
    const/16 v32, 0x0

    .line 596
    .line 597
    move-object/from16 v29, v3

    .line 598
    .line 599
    invoke-static/range {v29 .. v34}, Lm6/h;->E0(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly6/l;I)Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v3

    .line 603
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 604
    .line 605
    .line 606
    sget v3, Lw4/z0;->f:I

    .line 607
    .line 608
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 609
    .line 610
    .line 611
    const/high16 v3, 0x41500000    # 13.0f

    .line 612
    .line 613
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 614
    .line 615
    .line 616
    sget-object v3, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 617
    .line 618
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 619
    .line 620
    .line 621
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 622
    .line 623
    .line 624
    new-instance v3, Landroid/widget/TextView;

    .line 625
    .line 626
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 627
    .line 628
    .line 629
    iget-object v2, v2, Lw4/a1;->b:Ljava/lang/String;

    .line 630
    .line 631
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 632
    .line 633
    .line 634
    sget v2, Lw4/z0;->g:I

    .line 635
    .line 636
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 637
    .line 638
    .line 639
    const/high16 v2, 0x41880000    # 17.0f

    .line 640
    .line 641
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 642
    .line 643
    .line 644
    const/4 v8, 0x2

    .line 645
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 646
    .line 647
    .line 648
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 649
    .line 650
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 651
    .line 652
    .line 653
    invoke-static {v0, v8}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 654
    .line 655
    .line 656
    move-result v4

    .line 657
    int-to-float v4, v4

    .line 658
    const/high16 v5, 0x3f800000    # 1.0f

    .line 659
    .line 660
    invoke-virtual {v3, v4, v5}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 661
    .line 662
    .line 663
    const/4 v4, 0x3

    .line 664
    invoke-static {v0, v4}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 665
    .line 666
    .line 667
    move-result v7

    .line 668
    const/4 v4, 0x0

    .line 669
    invoke-virtual {v3, v4, v7, v4, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 670
    .line 671
    .line 672
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 673
    .line 674
    .line 675
    invoke-static {v9}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 676
    .line 677
    .line 678
    move-result v3

    .line 679
    if-nez v3, :cond_d

    .line 680
    .line 681
    new-instance v3, Landroid/widget/TextView;

    .line 682
    .line 683
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 687
    .line 688
    .line 689
    sget v4, Lw4/z0;->h:I

    .line 690
    .line 691
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 692
    .line 693
    .line 694
    const/high16 v4, 0x41600000    # 14.0f

    .line 695
    .line 696
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 697
    .line 698
    .line 699
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 703
    .line 704
    .line 705
    invoke-static {v0, v8}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 706
    .line 707
    .line 708
    move-result v2

    .line 709
    int-to-float v2, v2

    .line 710
    invoke-virtual {v3, v2, v5}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 711
    .line 712
    .line 713
    const/4 v2, 0x3

    .line 714
    invoke-static {v0, v2}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 715
    .line 716
    .line 717
    move-result v2

    .line 718
    const/4 v4, 0x0

    .line 719
    invoke-virtual {v3, v4, v2, v4, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 723
    .line 724
    .line 725
    goto :goto_a

    .line 726
    :cond_d
    const/4 v4, 0x0

    .line 727
    :goto_a
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 728
    .line 729
    invoke-direct {v2, v4, v12, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v6, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 733
    .line 734
    .line 735
    invoke-virtual {v0}, Lcom/exotv/net/SeriesDetailActivity;->u()Z

    .line 736
    .line 737
    .line 738
    move-result v1

    .line 739
    if-eqz v1, :cond_f

    .line 740
    .line 741
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 742
    .line 743
    .line 744
    move-result-object v1

    .line 745
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 746
    .line 747
    .line 748
    move-result-object v1

    .line 749
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 750
    .line 751
    int-to-float v1, v1

    .line 752
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 753
    .line 754
    .line 755
    move-result-object v2

    .line 756
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 757
    .line 758
    .line 759
    move-result-object v2

    .line 760
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 761
    .line 762
    div-float/2addr v1, v2

    .line 763
    const v2, 0x3cf5c280    # 0.029999971f

    .line 764
    .line 765
    .line 766
    mul-float/2addr v1, v2

    .line 767
    const/high16 v2, 0x40000000    # 2.0f

    .line 768
    .line 769
    add-float/2addr v1, v2

    .line 770
    invoke-virtual {v0}, Lcom/exotv/net/SeriesDetailActivity;->t()I

    .line 771
    .line 772
    .line 773
    move-result v2

    .line 774
    int-to-float v2, v2

    .line 775
    sub-float/2addr v1, v2

    .line 776
    float-to-double v1, v1

    .line 777
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 778
    .line 779
    .line 780
    move-result-wide v1

    .line 781
    double-to-float v1, v1

    .line 782
    float-to-int v1, v1

    .line 783
    const/16 v2, 0x60

    .line 784
    .line 785
    if-ge v1, v2, :cond_e

    .line 786
    .line 787
    move v1, v2

    .line 788
    :cond_e
    move v4, v1

    .line 789
    goto :goto_b

    .line 790
    :cond_f
    const/4 v4, 0x0

    .line 791
    :goto_b
    iget-object v7, v0, Lcom/exotv/net/SeriesDetailActivity;->L:Landroid/widget/LinearLayout;

    .line 792
    .line 793
    if-eqz v7, :cond_11

    .line 794
    .line 795
    const/4 v3, 0x0

    .line 796
    move-object v2, v6

    .line 797
    const/16 v6, 0xd

    .line 798
    .line 799
    const/4 v1, 0x0

    .line 800
    move-object v5, v2

    .line 801
    const/16 v2, 0xa

    .line 802
    .line 803
    move-object v8, v5

    .line 804
    move v5, v4

    .line 805
    invoke-static/range {v0 .. v6}, Lcom/exotv/net/SeriesDetailActivity;->x(Lcom/exotv/net/SeriesDetailActivity;IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 806
    .line 807
    .line 808
    move-result-object v1

    .line 809
    invoke-virtual {v7, v8, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 810
    .line 811
    .line 812
    if-nez v20, :cond_10

    .line 813
    .line 814
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 815
    .line 816
    .line 817
    :cond_10
    move-object v2, v14

    .line 818
    move-object/from16 v8, v19

    .line 819
    .line 820
    move-object/from16 v1, v24

    .line 821
    .line 822
    move/from16 v5, v27

    .line 823
    .line 824
    const/4 v9, 0x0

    .line 825
    const/4 v12, 0x0

    .line 826
    const/4 v14, 0x1

    .line 827
    goto/16 :goto_4

    .line 828
    .line 829
    :cond_11
    invoke-static/range {v19 .. v19}, Lz6/h;->h(Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    const/16 v18, 0x0

    .line 833
    .line 834
    throw v18

    .line 835
    :cond_12
    move-object/from16 v24, v1

    .line 836
    .line 837
    move-object v14, v2

    .line 838
    move/from16 v27, v5

    .line 839
    .line 840
    move-object/from16 v19, v8

    .line 841
    .line 842
    const/16 v3, 0xc

    .line 843
    .line 844
    const/4 v8, 0x2

    .line 845
    iget-boolean v1, v0, Lcom/exotv/net/SeriesDetailActivity;->R:Z

    .line 846
    .line 847
    if-eqz v1, :cond_14

    .line 848
    .line 849
    invoke-static {v10}, Lm6/h;->B0(Ljava/util/List;)Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v1

    .line 853
    check-cast v1, Landroid/view/View;

    .line 854
    .line 855
    if-eqz v1, :cond_13

    .line 856
    .line 857
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 858
    .line 859
    .line 860
    :cond_13
    const/4 v4, 0x0

    .line 861
    iput-boolean v4, v0, Lcom/exotv/net/SeriesDetailActivity;->R:Z

    .line 862
    .line 863
    :goto_c
    const/4 v2, 0x1

    .line 864
    goto :goto_d

    .line 865
    :cond_14
    const/4 v4, 0x0

    .line 866
    goto :goto_c

    .line 867
    :goto_d
    if-le v13, v2, :cond_2c

    .line 868
    .line 869
    iget v9, v14, Le7/a;->j:I

    .line 870
    .line 871
    new-instance v10, Landroid/widget/LinearLayout;

    .line 872
    .line 873
    invoke-direct {v10, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 874
    .line 875
    .line 876
    invoke-virtual {v10, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 877
    .line 878
    .line 879
    const/16 v4, 0x11

    .line 880
    .line 881
    invoke-virtual {v10, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 882
    .line 883
    .line 884
    int-to-float v1, v3

    .line 885
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 886
    .line 887
    .line 888
    move-result-object v4

    .line 889
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 890
    .line 891
    .line 892
    move-result-object v4

    .line 893
    invoke-static {v2, v1, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 894
    .line 895
    .line 896
    move-result v1

    .line 897
    float-to-int v1, v1

    .line 898
    const/16 v12, 0x8

    .line 899
    .line 900
    int-to-float v4, v12

    .line 901
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 902
    .line 903
    .line 904
    move-result-object v5

    .line 905
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 906
    .line 907
    .line 908
    move-result-object v5

    .line 909
    invoke-static {v2, v4, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 910
    .line 911
    .line 912
    move-result v4

    .line 913
    float-to-int v2, v4

    .line 914
    const/4 v4, 0x0

    .line 915
    invoke-virtual {v10, v4, v1, v4, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 916
    .line 917
    .line 918
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 919
    .line 920
    .line 921
    move-result-object v1

    .line 922
    if-gtz v11, :cond_15

    .line 923
    .line 924
    const/4 v2, 0x0

    .line 925
    goto :goto_e

    .line 926
    :cond_15
    add-int/lit8 v2, v11, 0x13

    .line 927
    .line 928
    div-int/lit8 v2, v2, 0x14

    .line 929
    .line 930
    :goto_e
    if-nez v2, :cond_16

    .line 931
    .line 932
    new-instance v2, Ll6/h;

    .line 933
    .line 934
    invoke-direct {v2, v1, v1, v1}, Ll6/h;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 935
    .line 936
    .line 937
    goto :goto_f

    .line 938
    :cond_16
    const/4 v14, 0x1

    .line 939
    invoke-static {v15, v14, v2}, Lcom/bumptech/glide/c;->t(III)I

    .line 940
    .line 941
    .line 942
    move-result v1

    .line 943
    sub-int/2addr v1, v14

    .line 944
    div-int/lit8 v1, v1, 0x5

    .line 945
    .line 946
    mul-int/lit8 v1, v1, 0x5

    .line 947
    .line 948
    add-int/lit8 v4, v1, 0x1

    .line 949
    .line 950
    add-int/lit8 v1, v1, 0x5

    .line 951
    .line 952
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 953
    .line 954
    .line 955
    move-result v1

    .line 956
    new-instance v5, Ll6/h;

    .line 957
    .line 958
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 959
    .line 960
    .line 961
    move-result-object v4

    .line 962
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 963
    .line 964
    .line 965
    move-result-object v1

    .line 966
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 967
    .line 968
    .line 969
    move-result-object v2

    .line 970
    invoke-direct {v5, v4, v1, v2}, Ll6/h;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 971
    .line 972
    .line 973
    move-object v2, v5

    .line 974
    :goto_f
    iget-object v1, v2, Ll6/h;->j:Ljava/lang/Integer;

    .line 975
    .line 976
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 977
    .line 978
    .line 979
    move-result v7

    .line 980
    iget-object v1, v2, Ll6/h;->k:Ljava/lang/Integer;

    .line 981
    .line 982
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 983
    .line 984
    .line 985
    move-result v12

    .line 986
    const-string v14, "\u2039"

    .line 987
    .line 988
    const/4 v2, 0x1

    .line 989
    if-le v7, v2, :cond_17

    .line 990
    .line 991
    new-instance v1, Lw4/u0;

    .line 992
    .line 993
    const/4 v4, 0x0

    .line 994
    invoke-direct {v1, v0, v7, v13, v4}, Lw4/u0;-><init>(Lcom/exotv/net/SeriesDetailActivity;III)V

    .line 995
    .line 996
    .line 997
    invoke-virtual {v0, v14, v1}, Lcom/exotv/net/SeriesDetailActivity;->B(Ljava/lang/String;Ly6/a;)Landroid/widget/TextView;

    .line 998
    .line 999
    .line 1000
    move-result-object v2

    .line 1001
    const/4 v5, 0x4

    .line 1002
    const/16 v6, 0x1b

    .line 1003
    .line 1004
    const/4 v1, 0x0

    .line 1005
    move-object v4, v2

    .line 1006
    const/4 v2, 0x0

    .line 1007
    move/from16 v28, v3

    .line 1008
    .line 1009
    iget v3, v0, Lcom/exotv/net/SeriesDetailActivity;->j0:I

    .line 1010
    .line 1011
    move-object/from16 v16, v4

    .line 1012
    .line 1013
    const/4 v4, 0x0

    .line 1014
    move-object/from16 v8, v16

    .line 1015
    .line 1016
    move/from16 v16, v9

    .line 1017
    .line 1018
    move/from16 v9, v28

    .line 1019
    .line 1020
    invoke-static/range {v0 .. v6}, Lcom/exotv/net/SeriesDetailActivity;->x(Lcom/exotv/net/SeriesDetailActivity;IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v1

    .line 1024
    invoke-virtual {v10, v8, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1025
    .line 1026
    .line 1027
    goto :goto_10

    .line 1028
    :cond_17
    move/from16 v16, v9

    .line 1029
    .line 1030
    move v9, v3

    .line 1031
    const/4 v8, 0x0

    .line 1032
    :goto_10
    const/high16 v1, 0x41700000    # 15.0f

    .line 1033
    .line 1034
    if-gt v7, v12, :cond_1f

    .line 1035
    .line 1036
    move v2, v7

    .line 1037
    const/16 v20, 0x0

    .line 1038
    .line 1039
    :goto_11
    if-ne v2, v15, :cond_18

    .line 1040
    .line 1041
    const/16 v21, 0x1

    .line 1042
    .line 1043
    goto :goto_12

    .line 1044
    :cond_18
    const/16 v21, 0x0

    .line 1045
    .line 1046
    :goto_12
    new-instance v3, Landroid/widget/TextView;

    .line 1047
    .line 1048
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1049
    .line 1050
    .line 1051
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v4

    .line 1055
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1059
    .line 1060
    .line 1061
    const/16 v4, 0x11

    .line 1062
    .line 1063
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 1064
    .line 1065
    .line 1066
    if-eqz v21, :cond_19

    .line 1067
    .line 1068
    move/from16 v4, v17

    .line 1069
    .line 1070
    goto :goto_13

    .line 1071
    :cond_19
    sget v4, Lw4/z0;->h:I

    .line 1072
    .line 1073
    :goto_13
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1074
    .line 1075
    .line 1076
    if-eqz v21, :cond_1a

    .line 1077
    .line 1078
    sget-object v4, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 1079
    .line 1080
    goto :goto_14

    .line 1081
    :cond_1a
    sget-object v4, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 1082
    .line 1083
    :goto_14
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1084
    .line 1085
    .line 1086
    new-instance v4, Landroid/graphics/drawable/StateListDrawable;

    .line 1087
    .line 1088
    invoke-direct {v4}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 1089
    .line 1090
    .line 1091
    const v5, 0x101009c

    .line 1092
    .line 1093
    .line 1094
    filled-new-array {v5}, [I

    .line 1095
    .line 1096
    .line 1097
    move-result-object v5

    .line 1098
    sget v6, Lw4/z0;->f:I

    .line 1099
    .line 1100
    const/4 v7, 0x0

    .line 1101
    invoke-static {v6, v9, v7, v7}, Lc5/j;->i(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v6

    .line 1105
    invoke-virtual {v4, v5, v6}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 1106
    .line 1107
    .line 1108
    new-array v5, v7, [I

    .line 1109
    .line 1110
    if-eqz v21, :cond_1b

    .line 1111
    .line 1112
    const-string v6, "#8B0000"

    .line 1113
    .line 1114
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1115
    .line 1116
    .line 1117
    move-result v6

    .line 1118
    invoke-static {v6, v9, v7, v7}, Lc5/j;->i(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v6

    .line 1122
    goto :goto_15

    .line 1123
    :cond_1b
    sget v6, Lw4/z0;->e:I

    .line 1124
    .line 1125
    const/4 v1, 0x1

    .line 1126
    invoke-static {v7, v9, v1, v6}, Lc5/j;->i(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v6

    .line 1130
    :goto_15
    invoke-virtual {v4, v5, v6}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 1131
    .line 1132
    .line 1133
    invoke-virtual {v3, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1134
    .line 1135
    .line 1136
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v1

    .line 1140
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v1

    .line 1144
    const v4, 0x7f11001c

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual {v0, v4, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v1

    .line 1151
    invoke-virtual {v3, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1152
    .line 1153
    .line 1154
    const/16 v1, 0x12

    .line 1155
    .line 1156
    invoke-static {v0, v1}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 1157
    .line 1158
    .line 1159
    move-result v4

    .line 1160
    const/16 v5, 0xf

    .line 1161
    .line 1162
    invoke-static {v0, v5}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 1163
    .line 1164
    .line 1165
    move-result v6

    .line 1166
    invoke-static {v0, v1}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 1167
    .line 1168
    .line 1169
    move-result v1

    .line 1170
    invoke-static {v0, v5}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 1171
    .line 1172
    .line 1173
    move-result v5

    .line 1174
    invoke-virtual {v3, v4, v6, v1, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1175
    .line 1176
    .line 1177
    new-instance v1, Lc5/k;

    .line 1178
    .line 1179
    invoke-direct {v1, v2, v0}, Lc5/k;-><init>(ILcom/exotv/net/SeriesDetailActivity;)V

    .line 1180
    .line 1181
    .line 1182
    invoke-virtual {v3, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1183
    .line 1184
    .line 1185
    new-instance v1, Lw4/v0;

    .line 1186
    .line 1187
    const/4 v4, 0x0

    .line 1188
    invoke-direct {v1, v4, v0}, Lw4/v0;-><init>(ILcom/exotv/net/SeriesDetailActivity;)V

    .line 1189
    .line 1190
    .line 1191
    invoke-virtual {v3, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 1192
    .line 1193
    .line 1194
    const/4 v6, 0x0

    .line 1195
    const/16 v7, 0x1e4

    .line 1196
    .line 1197
    move v1, v2

    .line 1198
    move-object v2, v3

    .line 1199
    const/16 v3, 0xc

    .line 1200
    .line 1201
    const/4 v4, 0x0

    .line 1202
    const/4 v5, 0x0

    .line 1203
    move v9, v1

    .line 1204
    const/high16 v22, 0x41700000    # 15.0f

    .line 1205
    .line 1206
    move-object v1, v0

    .line 1207
    move-object/from16 v0, v24

    .line 1208
    .line 1209
    invoke-static/range {v0 .. v7}, Lc5/j;->f(Lc5/j;Landroid/content/Context;Landroid/view/View;ILw4/x0;Ly6/a;Landroid/view/View;I)V

    .line 1210
    .line 1211
    .line 1212
    move-object v7, v0

    .line 1213
    move-object v0, v1

    .line 1214
    move-object v1, v2

    .line 1215
    if-eqz v21, :cond_1c

    .line 1216
    .line 1217
    iput-object v1, v0, Lcom/exotv/net/SeriesDetailActivity;->P:Landroid/widget/TextView;

    .line 1218
    .line 1219
    :cond_1c
    iget-object v2, v0, Lcom/exotv/net/SeriesDetailActivity;->T:Ljava/lang/Integer;

    .line 1220
    .line 1221
    if-nez v2, :cond_1d

    .line 1222
    .line 1223
    goto :goto_16

    .line 1224
    :cond_1d
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1225
    .line 1226
    .line 1227
    move-result v2

    .line 1228
    if-ne v2, v9, :cond_1e

    .line 1229
    .line 1230
    move-object/from16 v20, v1

    .line 1231
    .line 1232
    :cond_1e
    :goto_16
    const/4 v5, 0x4

    .line 1233
    const/16 v6, 0x1b

    .line 1234
    .line 1235
    move-object v2, v1

    .line 1236
    const/4 v1, 0x0

    .line 1237
    move-object v3, v2

    .line 1238
    const/4 v2, 0x0

    .line 1239
    move-object v4, v3

    .line 1240
    iget v3, v0, Lcom/exotv/net/SeriesDetailActivity;->j0:I

    .line 1241
    .line 1242
    move-object/from16 v21, v4

    .line 1243
    .line 1244
    const/4 v4, 0x0

    .line 1245
    move-object/from16 v24, v7

    .line 1246
    .line 1247
    move-object/from16 v7, v21

    .line 1248
    .line 1249
    invoke-static/range {v0 .. v6}, Lcom/exotv/net/SeriesDetailActivity;->x(Lcom/exotv/net/SeriesDetailActivity;IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v1

    .line 1253
    invoke-virtual {v10, v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1254
    .line 1255
    .line 1256
    if-eq v9, v12, :cond_20

    .line 1257
    .line 1258
    add-int/lit8 v2, v9, 0x1

    .line 1259
    .line 1260
    move/from16 v1, v22

    .line 1261
    .line 1262
    const/16 v9, 0xc

    .line 1263
    .line 1264
    goto/16 :goto_11

    .line 1265
    .line 1266
    :cond_1f
    move/from16 v22, v1

    .line 1267
    .line 1268
    const/16 v20, 0x0

    .line 1269
    .line 1270
    :cond_20
    if-ge v12, v13, :cond_21

    .line 1271
    .line 1272
    new-instance v1, Lw4/u0;

    .line 1273
    .line 1274
    const/4 v2, 0x1

    .line 1275
    invoke-direct {v1, v0, v12, v13, v2}, Lw4/u0;-><init>(Lcom/exotv/net/SeriesDetailActivity;III)V

    .line 1276
    .line 1277
    .line 1278
    const-string v2, "\u203a"

    .line 1279
    .line 1280
    invoke-virtual {v0, v2, v1}, Lcom/exotv/net/SeriesDetailActivity;->B(Ljava/lang/String;Ly6/a;)Landroid/widget/TextView;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v7

    .line 1284
    const/4 v5, 0x0

    .line 1285
    const/16 v6, 0x3b

    .line 1286
    .line 1287
    const/4 v1, 0x0

    .line 1288
    const/4 v2, 0x0

    .line 1289
    iget v3, v0, Lcom/exotv/net/SeriesDetailActivity;->j0:I

    .line 1290
    .line 1291
    const/4 v4, 0x0

    .line 1292
    invoke-static/range {v0 .. v6}, Lcom/exotv/net/SeriesDetailActivity;->x(Lcom/exotv/net/SeriesDetailActivity;IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v1

    .line 1296
    invoke-virtual {v10, v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1297
    .line 1298
    .line 1299
    goto :goto_17

    .line 1300
    :cond_21
    const/4 v7, 0x0

    .line 1301
    :goto_17
    iget-object v9, v0, Lcom/exotv/net/SeriesDetailActivity;->L:Landroid/widget/LinearLayout;

    .line 1302
    .line 1303
    if-eqz v9, :cond_2b

    .line 1304
    .line 1305
    new-instance v12, Landroid/widget/TextView;

    .line 1306
    .line 1307
    invoke-direct {v12, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1308
    .line 1309
    .line 1310
    const/16 v25, 0x1

    .line 1311
    .line 1312
    add-int/lit8 v1, v16, 0x1

    .line 1313
    .line 1314
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v1

    .line 1318
    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v2

    .line 1322
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v3

    .line 1326
    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v1

    .line 1330
    const v2, 0x7f110047

    .line 1331
    .line 1332
    .line 1333
    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v1

    .line 1337
    invoke-virtual {v12, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1338
    .line 1339
    .line 1340
    sget v1, Lw4/z0;->i:I

    .line 1341
    .line 1342
    invoke-virtual {v12, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1343
    .line 1344
    .line 1345
    invoke-virtual {v0}, Lcom/exotv/net/SeriesDetailActivity;->u()Z

    .line 1346
    .line 1347
    .line 1348
    move-result v1

    .line 1349
    if-eqz v1, :cond_22

    .line 1350
    .line 1351
    move/from16 v1, v22

    .line 1352
    .line 1353
    goto :goto_18

    .line 1354
    :cond_22
    const/high16 v1, 0x41300000    # 11.0f

    .line 1355
    .line 1356
    :goto_18
    invoke-virtual {v12, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1357
    .line 1358
    .line 1359
    const/16 v4, 0x11

    .line 1360
    .line 1361
    invoke-virtual {v12, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 1362
    .line 1363
    .line 1364
    const/4 v1, 0x2

    .line 1365
    int-to-float v1, v1

    .line 1366
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v2

    .line 1370
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v2

    .line 1374
    const/4 v3, 0x1

    .line 1375
    invoke-static {v3, v1, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 1376
    .line 1377
    .line 1378
    move-result v1

    .line 1379
    float-to-int v1, v1

    .line 1380
    const/4 v4, 0x0

    .line 1381
    invoke-virtual {v12, v4, v4, v4, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1382
    .line 1383
    .line 1384
    const/4 v5, 0x0

    .line 1385
    const/16 v6, 0x3e

    .line 1386
    .line 1387
    const/16 v1, 0xc

    .line 1388
    .line 1389
    const/4 v2, 0x0

    .line 1390
    const/4 v3, 0x0

    .line 1391
    const/4 v4, 0x0

    .line 1392
    invoke-static/range {v0 .. v6}, Lcom/exotv/net/SeriesDetailActivity;->x(Lcom/exotv/net/SeriesDetailActivity;IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v1

    .line 1396
    invoke-virtual {v9, v12, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1397
    .line 1398
    .line 1399
    iget-object v9, v0, Lcom/exotv/net/SeriesDetailActivity;->L:Landroid/widget/LinearLayout;

    .line 1400
    .line 1401
    if-eqz v9, :cond_2a

    .line 1402
    .line 1403
    const/4 v5, 0x0

    .line 1404
    const/16 v6, 0x3f

    .line 1405
    .line 1406
    const/4 v1, 0x0

    .line 1407
    const/4 v2, 0x0

    .line 1408
    const/4 v3, 0x0

    .line 1409
    const/4 v4, 0x0

    .line 1410
    invoke-static/range {v0 .. v6}, Lcom/exotv/net/SeriesDetailActivity;->x(Lcom/exotv/net/SeriesDetailActivity;IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v1

    .line 1414
    invoke-virtual {v9, v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1415
    .line 1416
    .line 1417
    iget-object v1, v0, Lcom/exotv/net/SeriesDetailActivity;->S:Ljava/lang/String;

    .line 1418
    .line 1419
    if-eqz v20, :cond_23

    .line 1420
    .line 1421
    invoke-virtual/range {v20 .. v20}, Landroid/view/View;->requestFocus()Z

    .line 1422
    .line 1423
    .line 1424
    goto :goto_1b

    .line 1425
    :cond_23
    if-eqz v1, :cond_28

    .line 1426
    .line 1427
    invoke-virtual {v1, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1428
    .line 1429
    .line 1430
    move-result v2

    .line 1431
    if-eqz v2, :cond_24

    .line 1432
    .line 1433
    if-nez v8, :cond_26

    .line 1434
    .line 1435
    goto :goto_19

    .line 1436
    :cond_24
    if-nez v7, :cond_25

    .line 1437
    .line 1438
    goto :goto_1a

    .line 1439
    :cond_25
    :goto_19
    move-object v8, v7

    .line 1440
    :cond_26
    :goto_1a
    if-nez v8, :cond_27

    .line 1441
    .line 1442
    iget-object v8, v0, Lcom/exotv/net/SeriesDetailActivity;->P:Landroid/widget/TextView;

    .line 1443
    .line 1444
    :cond_27
    if-eqz v8, :cond_28

    .line 1445
    .line 1446
    invoke-virtual {v8}, Landroid/view/View;->requestFocus()Z

    .line 1447
    .line 1448
    .line 1449
    :cond_28
    :goto_1b
    const/4 v2, 0x0

    .line 1450
    if-eqz v1, :cond_29

    .line 1451
    .line 1452
    iput-object v2, v0, Lcom/exotv/net/SeriesDetailActivity;->S:Ljava/lang/String;

    .line 1453
    .line 1454
    :cond_29
    iget-object v1, v0, Lcom/exotv/net/SeriesDetailActivity;->T:Ljava/lang/Integer;

    .line 1455
    .line 1456
    if-eqz v1, :cond_2c

    .line 1457
    .line 1458
    iput-object v2, v0, Lcom/exotv/net/SeriesDetailActivity;->T:Ljava/lang/Integer;

    .line 1459
    .line 1460
    return-void

    .line 1461
    :cond_2a
    const/4 v2, 0x0

    .line 1462
    invoke-static/range {v19 .. v19}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1463
    .line 1464
    .line 1465
    throw v2

    .line 1466
    :cond_2b
    const/4 v2, 0x0

    .line 1467
    invoke-static/range {v19 .. v19}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1468
    .line 1469
    .line 1470
    throw v2

    .line 1471
    :cond_2c
    return-void

    .line 1472
    :cond_2d
    move-object/from16 v19, v8

    .line 1473
    .line 1474
    move-object v2, v9

    .line 1475
    invoke-static/range {v19 .. v19}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1476
    .line 1477
    .line 1478
    throw v2
.end method

.method public final D()V
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/exotv/net/SeriesDetailActivity;->K:Landroid/widget/LinearLayout;

    .line 4
    .line 5
    const-string v8, "seasonStrip"

    .line 6
    .line 7
    const/4 v9, 0x0

    .line 8
    if-eqz v0, :cond_14

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 11
    .line 12
    .line 13
    iput-object v9, v1, Lcom/exotv/net/SeriesDetailActivity;->O:Landroid/widget/LinearLayout;

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/exotv/net/SeriesDetailActivity;->u()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 30
    .line 31
    int-to-float v0, v0

    .line 32
    const v2, 0x3e8f5c29    # 0.28f

    .line 33
    .line 34
    .line 35
    mul-float/2addr v0, v2

    .line 36
    float-to-int v0, v0

    .line 37
    int-to-float v2, v0

    .line 38
    const/high16 v3, 0x40000000    # 2.0f

    .line 39
    .line 40
    mul-float/2addr v2, v3

    .line 41
    const/high16 v3, 0x40400000    # 3.0f

    .line 42
    .line 43
    div-float/2addr v2, v3

    .line 44
    float-to-int v2, v2

    .line 45
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    new-instance v3, Ll6/d;

    .line 54
    .line 55
    invoke-direct {v3, v2, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 68
    .line 69
    int-to-float v0, v0

    .line 70
    const v2, 0x3e8a3d71    # 0.27f

    .line 71
    .line 72
    .line 73
    mul-float/2addr v0, v2

    .line 74
    float-to-int v0, v0

    .line 75
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    int-to-float v0, v0

    .line 80
    const/high16 v3, 0x3fc00000    # 1.5f

    .line 81
    .line 82
    mul-float/2addr v0, v3

    .line 83
    float-to-int v0, v0

    .line 84
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    new-instance v3, Ll6/d;

    .line 89
    .line 90
    invoke-direct {v3, v2, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :goto_0
    iget-object v0, v3, Ll6/d;->j:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Ljava/lang/Number;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    iget-object v0, v3, Ll6/d;->k:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Ljava/lang/Number;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result v11

    .line 109
    const/4 v12, 0x4

    .line 110
    int-to-float v0, v12

    .line 111
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    const/4 v13, 0x1

    .line 120
    invoke-static {v13, v0, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    float-to-int v0, v0

    .line 125
    const/4 v14, 0x2

    .line 126
    div-int/lit8 v15, v0, 0x2

    .line 127
    .line 128
    iget-object v0, v1, Lcom/exotv/net/SeriesDetailActivity;->d0:Ljava/util/List;

    .line 129
    .line 130
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v16

    .line 134
    const/4 v0, 0x0

    .line 135
    move v2, v0

    .line 136
    :goto_1
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-eqz v3, :cond_13

    .line 141
    .line 142
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    add-int/lit8 v17, v2, 0x1

    .line 147
    .line 148
    if-ltz v2, :cond_12

    .line 149
    .line 150
    check-cast v3, Lw4/b1;

    .line 151
    .line 152
    iget v4, v3, Lw4/b1;->a:I

    .line 153
    .line 154
    iget v5, v1, Lcom/exotv/net/SeriesDetailActivity;->e0:I

    .line 155
    .line 156
    if-ne v4, v5, :cond_1

    .line 157
    .line 158
    move v5, v13

    .line 159
    goto :goto_2

    .line 160
    :cond_1
    move v5, v0

    .line 161
    :goto_2
    if-eqz v5, :cond_2

    .line 162
    .line 163
    const/high16 v6, 0x3f800000    # 1.0f

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_2
    const v6, 0x3f19999a    # 0.6f

    .line 167
    .line 168
    .line 169
    :goto_3
    new-instance v7, Landroid/widget/LinearLayout;

    .line 170
    .line 171
    invoke-direct {v7, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v7, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v7, v6}, Landroid/view/View;->setAlpha(F)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 184
    .line 185
    .line 186
    move-object/from16 v18, v9

    .line 187
    .line 188
    new-instance v9, Lw4/w0;

    .line 189
    .line 190
    invoke-direct {v9, v5, v1, v3}, Lw4/w0;-><init>(ZLcom/exotv/net/SeriesDetailActivity;Lw4/b1;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v7, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 194
    .line 195
    .line 196
    new-instance v9, Lc5/q;

    .line 197
    .line 198
    const/4 v14, 0x2

    .line 199
    invoke-direct {v9, v2, v14, v1}, Lc5/q;-><init>(IILjava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v7, v9}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 203
    .line 204
    .line 205
    new-instance v9, Landroid/widget/FrameLayout;

    .line 206
    .line 207
    invoke-direct {v9, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 208
    .line 209
    .line 210
    sget-object v2, Lc5/j;->a:Lc5/j;

    .line 211
    .line 212
    if-eqz v5, :cond_3

    .line 213
    .line 214
    move v14, v0

    .line 215
    goto :goto_4

    .line 216
    :cond_3
    sget v14, Lw4/z0;->c:I

    .line 217
    .line 218
    :goto_4
    if-eqz v5, :cond_4

    .line 219
    .line 220
    const/4 v12, 0x2

    .line 221
    :goto_5
    move/from16 v19, v5

    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_4
    move v12, v0

    .line 225
    goto :goto_5

    .line 226
    :goto_6
    sget v5, Lw4/z0;->f:I

    .line 227
    .line 228
    const/16 v13, 0x18

    .line 229
    .line 230
    invoke-static {v14, v13, v12, v5}, Lc5/j;->i(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 231
    .line 232
    .line 233
    move-result-object v12

    .line 234
    invoke-virtual {v9, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 235
    .line 236
    .line 237
    new-instance v12, Landroid/widget/ImageView;

    .line 238
    .line 239
    invoke-direct {v12, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 240
    .line 241
    .line 242
    sget-object v14, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 243
    .line 244
    invoke-virtual {v12, v14}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 245
    .line 246
    .line 247
    sget v14, Lw4/z0;->c:I

    .line 248
    .line 249
    invoke-static {v14, v13, v0, v0}, Lc5/j;->i(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 250
    .line 251
    .line 252
    move-result-object v13

    .line 253
    invoke-virtual {v12, v13}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 254
    .line 255
    .line 256
    const/4 v13, 0x1

    .line 257
    invoke-virtual {v12, v13}, Landroid/view/View;->setClipToOutline(Z)V

    .line 258
    .line 259
    .line 260
    sget-object v13, Landroid/view/ViewOutlineProvider;->BACKGROUND:Landroid/view/ViewOutlineProvider;

    .line 261
    .line 262
    invoke-virtual {v12, v13}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v9, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v9, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 269
    .line 270
    .line 271
    new-instance v13, Landroid/widget/FrameLayout$LayoutParams;

    .line 272
    .line 273
    iget v14, v1, Lcom/exotv/net/SeriesDetailActivity;->i0:I

    .line 274
    .line 275
    invoke-direct {v13, v14, v14}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v13, v15, v15, v15, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v9, v12, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 282
    .line 283
    .line 284
    iget-object v13, v3, Lw4/b1;->d:Ljava/lang/String;

    .line 285
    .line 286
    if-eqz v13, :cond_7

    .line 287
    .line 288
    invoke-static {v13}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 289
    .line 290
    .line 291
    move-result v14

    .line 292
    if-nez v14, :cond_5

    .line 293
    .line 294
    const-string v14, "null"

    .line 295
    .line 296
    invoke-virtual {v13, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v14

    .line 300
    if-nez v14, :cond_5

    .line 301
    .line 302
    goto :goto_7

    .line 303
    :cond_5
    move-object/from16 v13, v18

    .line 304
    .line 305
    :goto_7
    if-nez v13, :cond_6

    .line 306
    .line 307
    goto :goto_8

    .line 308
    :cond_6
    const-string v14, "https://image.tmdb.org/t/p/w500"

    .line 309
    .line 310
    invoke-virtual {v14, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v13

    .line 314
    goto :goto_9

    .line 315
    :cond_7
    :goto_8
    move-object/from16 v13, v18

    .line 316
    .line 317
    :goto_9
    if-eqz v13, :cond_8

    .line 318
    .line 319
    invoke-static {v1}, Lcom/bumptech/glide/b;->b(Landroid/content/Context;)Ln4/l;

    .line 320
    .line 321
    .line 322
    move-result-object v14

    .line 323
    invoke-virtual {v14, v1}, Ln4/l;->d(Lh/i;)Lcom/bumptech/glide/m;

    .line 324
    .line 325
    .line 326
    move-result-object v14

    .line 327
    invoke-virtual {v14, v13}, Lcom/bumptech/glide/m;->m(Ljava/lang/String;)Lcom/bumptech/glide/j;

    .line 328
    .line 329
    .line 330
    move-result-object v13

    .line 331
    invoke-virtual {v13, v12}, Lcom/bumptech/glide/j;->u(Landroid/widget/ImageView;)V

    .line 332
    .line 333
    .line 334
    :cond_8
    move v13, v4

    .line 335
    new-instance v4, Lw4/x0;

    .line 336
    .line 337
    invoke-direct {v4, v6}, Lw4/x0;-><init>(F)V

    .line 338
    .line 339
    .line 340
    move v6, v5

    .line 341
    const/4 v5, 0x0

    .line 342
    move v14, v0

    .line 343
    move-object v0, v2

    .line 344
    move-object v2, v7

    .line 345
    const/16 v7, 0x54

    .line 346
    .line 347
    move-object/from16 v20, v3

    .line 348
    .line 349
    const/16 v3, 0x18

    .line 350
    .line 351
    move-object/from16 v27, v12

    .line 352
    .line 353
    move v12, v6

    .line 354
    move-object/from16 v6, v27

    .line 355
    .line 356
    move-object/from16 v27, v20

    .line 357
    .line 358
    move-object/from16 v20, v8

    .line 359
    .line 360
    move v8, v14

    .line 361
    move v14, v13

    .line 362
    move-object/from16 v13, v27

    .line 363
    .line 364
    invoke-static/range {v0 .. v7}, Lc5/j;->f(Lc5/j;Landroid/content/Context;Landroid/view/View;ILw4/x0;Ly6/a;Landroid/view/View;I)V

    .line 365
    .line 366
    .line 367
    if-eqz v19, :cond_9

    .line 368
    .line 369
    iput-object v2, v1, Lcom/exotv/net/SeriesDetailActivity;->O:Landroid/widget/LinearLayout;

    .line 370
    .line 371
    :cond_9
    invoke-static {v14}, Lcom/exotv/net/SeriesDetailActivity;->A(I)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    const-string v3, "S"

    .line 376
    .line 377
    invoke-static {v3, v0}, La1/a1;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    sget v3, Lw4/z0;->d:I

    .line 382
    .line 383
    const/16 v4, 0x8

    .line 384
    .line 385
    const/4 v5, 0x6

    .line 386
    invoke-static {v1, v0, v3, v4, v5}, Lc5/j;->b(Landroid/content/Context;Ljava/lang/String;III)Landroid/widget/TextView;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    const/16 v3, 0x11

    .line 391
    .line 392
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 393
    .line 394
    .line 395
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 396
    .line 397
    iget v6, v1, Lcom/exotv/net/SeriesDetailActivity;->j0:I

    .line 398
    .line 399
    invoke-direct {v3, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 400
    .line 401
    .line 402
    const v7, 0x800033

    .line 403
    .line 404
    .line 405
    iput v7, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 406
    .line 407
    invoke-static {v1, v4}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 408
    .line 409
    .line 410
    move-result v7

    .line 411
    iput v7, v3, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 412
    .line 413
    invoke-static {v1, v4}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 414
    .line 415
    .line 416
    move-result v4

    .line 417
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v9, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 421
    .line 422
    .line 423
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 424
    .line 425
    invoke-direct {v0, v10, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v0, v15, v15, v15, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2, v9, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 432
    .line 433
    .line 434
    iget-object v0, v13, Lw4/b1;->b:Ljava/lang/String;

    .line 435
    .line 436
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 437
    .line 438
    .line 439
    move-result v3

    .line 440
    if-nez v3, :cond_a

    .line 441
    .line 442
    const-string v0, "Season "

    .line 443
    .line 444
    invoke-static {v14, v0}, La1/a1;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    :cond_a
    new-instance v3, Landroid/widget/TextView;

    .line 449
    .line 450
    invoke-direct {v3, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 451
    .line 452
    .line 453
    const/16 v4, 0x16

    .line 454
    .line 455
    invoke-static {v4, v0}, Lc5/j;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 460
    .line 461
    .line 462
    sget v0, Lw4/z0;->g:I

    .line 463
    .line 464
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 465
    .line 466
    .line 467
    const/high16 v0, 0x41400000    # 12.0f

    .line 468
    .line 469
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 470
    .line 471
    .line 472
    const/4 v0, 0x1

    .line 473
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 474
    .line 475
    .line 476
    if-eqz v19, :cond_b

    .line 477
    .line 478
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 479
    .line 480
    goto :goto_a

    .line 481
    :cond_b
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 482
    .line 483
    :goto_a
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 484
    .line 485
    .line 486
    invoke-static {v1, v5}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 487
    .line 488
    .line 489
    move-result v0

    .line 490
    invoke-virtual {v3, v8, v0, v8, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 491
    .line 492
    .line 493
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 494
    .line 495
    invoke-direct {v0, v10, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v2, v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 499
    .line 500
    .line 501
    new-instance v0, Ljava/util/ArrayList;

    .line 502
    .line 503
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 504
    .line 505
    .line 506
    iget v3, v13, Lw4/b1;->c:I

    .line 507
    .line 508
    if-lez v3, :cond_c

    .line 509
    .line 510
    new-instance v4, Ljava/lang/StringBuilder;

    .line 511
    .line 512
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    .line 518
    const-string v3, " episodes"

    .line 519
    .line 520
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v3

    .line 527
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    :cond_c
    iget-object v3, v13, Lw4/b1;->e:Ljava/lang/String;

    .line 531
    .line 532
    const/4 v4, 0x4

    .line 533
    if-eqz v3, :cond_e

    .line 534
    .line 535
    invoke-static {v4, v3}, Lh7/h;->R0(ILjava/lang/String;)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 540
    .line 541
    .line 542
    move-result v5

    .line 543
    if-ne v5, v4, :cond_d

    .line 544
    .line 545
    goto :goto_b

    .line 546
    :cond_d
    move-object/from16 v3, v18

    .line 547
    .line 548
    :goto_b
    if-eqz v3, :cond_e

    .line 549
    .line 550
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    :cond_e
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 554
    .line 555
    .line 556
    move-result v3

    .line 557
    if-nez v3, :cond_10

    .line 558
    .line 559
    new-instance v3, Landroid/widget/TextView;

    .line 560
    .line 561
    invoke-direct {v3, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 562
    .line 563
    .line 564
    const/16 v25, 0x0

    .line 565
    .line 566
    const/16 v26, 0x3e

    .line 567
    .line 568
    const-string v22, " \u2022 "

    .line 569
    .line 570
    const/16 v23, 0x0

    .line 571
    .line 572
    const/16 v24, 0x0

    .line 573
    .line 574
    move-object/from16 v21, v0

    .line 575
    .line 576
    invoke-static/range {v21 .. v26}, Lm6/h;->E0(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly6/l;I)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 581
    .line 582
    .line 583
    if-eqz v19, :cond_f

    .line 584
    .line 585
    move v5, v12

    .line 586
    goto :goto_c

    .line 587
    :cond_f
    sget v5, Lw4/z0;->i:I

    .line 588
    .line 589
    :goto_c
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 590
    .line 591
    .line 592
    const/high16 v0, 0x41300000    # 11.0f

    .line 593
    .line 594
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 595
    .line 596
    .line 597
    const/4 v0, 0x1

    .line 598
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 599
    .line 600
    .line 601
    const/4 v5, 0x2

    .line 602
    invoke-static {v1, v5}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 603
    .line 604
    .line 605
    move-result v7

    .line 606
    invoke-virtual {v3, v8, v7, v8, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 607
    .line 608
    .line 609
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 610
    .line 611
    invoke-direct {v7, v10, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v2, v3, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 615
    .line 616
    .line 617
    goto :goto_d

    .line 618
    :cond_10
    const/4 v0, 0x1

    .line 619
    const/4 v5, 0x2

    .line 620
    :goto_d
    iget-object v3, v1, Lcom/exotv/net/SeriesDetailActivity;->K:Landroid/widget/LinearLayout;

    .line 621
    .line 622
    if-eqz v3, :cond_11

    .line 623
    .line 624
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 625
    .line 626
    invoke-direct {v7, v10, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 627
    .line 628
    .line 629
    const/16 v6, 0x10

    .line 630
    .line 631
    invoke-static {v1, v6}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 632
    .line 633
    .line 634
    move-result v6

    .line 635
    invoke-virtual {v7, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v3, v2, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 639
    .line 640
    .line 641
    move v13, v0

    .line 642
    move v12, v4

    .line 643
    move v14, v5

    .line 644
    move v0, v8

    .line 645
    move/from16 v2, v17

    .line 646
    .line 647
    move-object/from16 v9, v18

    .line 648
    .line 649
    move-object/from16 v8, v20

    .line 650
    .line 651
    goto/16 :goto_1

    .line 652
    .line 653
    :cond_11
    invoke-static/range {v20 .. v20}, Lz6/h;->h(Ljava/lang/String;)V

    .line 654
    .line 655
    .line 656
    throw v18

    .line 657
    :cond_12
    move-object/from16 v18, v9

    .line 658
    .line 659
    invoke-static {}, Lm6/i;->v0()V

    .line 660
    .line 661
    .line 662
    throw v18

    .line 663
    :cond_13
    return-void

    .line 664
    :cond_14
    move-object/from16 v20, v8

    .line 665
    .line 666
    move-object/from16 v18, v9

    .line 667
    .line 668
    invoke-static/range {v20 .. v20}, Lz6/h;->h(Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    throw v18
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 14

    .line 1
    invoke-super {p0, p1}, Lh/i;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x2

    .line 17
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->rotationAnimation:I

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 20
    .line 21
    .line 22
    sget-object v2, Lc5/j;->a:Lc5/j;

    .line 23
    .line 24
    invoke-static {p0}, Lc5/j;->a(Lh/i;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, Lc5/j;->g(Lh/i;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v0, "series_id"

    .line 35
    .line 36
    const-wide/16 v3, 0x0

    .line 37
    .line 38
    invoke-virtual {p1, v0, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    iput-wide v0, p0, Lcom/exotv/net/SeriesDetailActivity;->b0:J

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string v0, "series_title"

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-nez p1, :cond_0

    .line 55
    .line 56
    const-string p1, ""

    .line 57
    .line 58
    :cond_0
    iput-object p1, p0, Lcom/exotv/net/SeriesDetailActivity;->c0:Ljava/lang/String;

    .line 59
    .line 60
    new-instance p1, Landroid/widget/FrameLayout;

    .line 61
    .line 62
    invoke-direct {p1, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 63
    .line 64
    .line 65
    sget v0, Lw4/z0;->a:I

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/exotv/net/SeriesDetailActivity;->u()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    const/4 v1, 0x1

    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    new-instance v3, Lw4/k0;

    .line 82
    .line 83
    invoke-direct {v3, p0, v1}, Lw4/k0;-><init>(Lh/i;I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v3}, Landroid/view/ViewTreeObserver;->addOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    .line 87
    .line 88
    .line 89
    :cond_1
    new-instance v0, Landroid/widget/ScrollView;

    .line 90
    .line 91
    invoke-direct {v0, p0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 92
    .line 93
    .line 94
    const/4 v10, 0x0

    .line 95
    invoke-virtual {v0, v10}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    .line 99
    .line 100
    .line 101
    iput-object v0, p0, Lcom/exotv/net/SeriesDetailActivity;->J:Landroid/widget/ScrollView;

    .line 102
    .line 103
    new-instance v0, Landroid/widget/LinearLayout;

    .line 104
    .line 105
    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 109
    .line 110
    .line 111
    new-instance v3, Landroid/widget/TextView;

    .line 112
    .line 113
    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 114
    .line 115
    .line 116
    sget v4, Lw4/z0;->i:I

    .line 117
    .line 118
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 119
    .line 120
    .line 121
    const/high16 v4, 0x41400000    # 12.0f

    .line 122
    .line 123
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 124
    .line 125
    .line 126
    const/16 v11, 0x8

    .line 127
    .line 128
    invoke-virtual {v3, v11}, Landroid/view/View;->setVisibility(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Lcom/exotv/net/SeriesDetailActivity;->t()I

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    const/16 v5, 0xc

    .line 136
    .line 137
    invoke-static {p0, v5}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    invoke-virtual {p0}, Lcom/exotv/net/SeriesDetailActivity;->t()I

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    invoke-static {p0, v5}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    invoke-virtual {v3, v4, v6, v7, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 150
    .line 151
    .line 152
    iput-object v3, p0, Lcom/exotv/net/SeriesDetailActivity;->I:Landroid/widget/TextView;

    .line 153
    .line 154
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 155
    .line 156
    .line 157
    new-instance v3, Landroid/widget/LinearLayout;

    .line 158
    .line 159
    invoke-direct {v3, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 163
    .line 164
    .line 165
    iput-object v3, p0, Lcom/exotv/net/SeriesDetailActivity;->H:Landroid/widget/LinearLayout;

    .line 166
    .line 167
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 168
    .line 169
    iget v12, p0, Lcom/exotv/net/SeriesDetailActivity;->i0:I

    .line 170
    .line 171
    iget v13, p0, Lcom/exotv/net/SeriesDetailActivity;->j0:I

    .line 172
    .line 173
    invoke-direct {v4, v12, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 177
    .line 178
    .line 179
    iget-object v3, p0, Lcom/exotv/net/SeriesDetailActivity;->J:Landroid/widget/ScrollView;

    .line 180
    .line 181
    const/4 v4, 0x0

    .line 182
    const-string v6, "pageScroll"

    .line 183
    .line 184
    if-eqz v3, :cond_3

    .line 185
    .line 186
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    .line 187
    .line 188
    invoke-direct {v7, v12, v13}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3, v0, v7}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 192
    .line 193
    .line 194
    iget-object v3, p0, Lcom/exotv/net/SeriesDetailActivity;->J:Landroid/widget/ScrollView;

    .line 195
    .line 196
    if-eqz v3, :cond_2

    .line 197
    .line 198
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 199
    .line 200
    invoke-direct {v4, v12, v12}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1, v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 204
    .line 205
    .line 206
    new-instance v4, Landroid/widget/TextView;

    .line 207
    .line 208
    invoke-direct {v4, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 209
    .line 210
    .line 211
    const-string v3, "\u2039"

    .line 212
    .line 213
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 214
    .line 215
    .line 216
    const/high16 v3, 0x41f00000    # 30.0f

    .line 217
    .line 218
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 219
    .line 220
    .line 221
    const/4 v3, -0x1

    .line 222
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 223
    .line 224
    .line 225
    const/16 v3, 0x11

    .line 226
    .line 227
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 228
    .line 229
    .line 230
    const v3, 0x7f11001b

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    invoke-virtual {v4, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 238
    .line 239
    .line 240
    const/16 v3, 0x66

    .line 241
    .line 242
    invoke-static {v3, v10, v10, v10}, Landroid/graphics/Color;->argb(IIII)I

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    const/16 v6, 0x16

    .line 247
    .line 248
    invoke-static {v3, v6, v10, v10}, Lc5/j;->i(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-virtual {v4, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 253
    .line 254
    .line 255
    const/16 v3, 0x2c

    .line 256
    .line 257
    invoke-static {p0, v3}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 258
    .line 259
    .line 260
    move-result v6

    .line 261
    invoke-virtual {v4, v6}, Landroid/view/View;->setMinimumWidth(I)V

    .line 262
    .line 263
    .line 264
    invoke-static {p0, v3}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    invoke-virtual {v4, v3}, Landroid/view/View;->setMinimumHeight(I)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v4, v1}, Landroid/view/View;->setClickable(Z)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v4, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 275
    .line 276
    .line 277
    new-instance v1, Lb6/a;

    .line 278
    .line 279
    invoke-direct {v1, v5, p0}, Lb6/a;-><init>(ILjava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v4, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 283
    .line 284
    .line 285
    new-instance v1, Lw4/v0;

    .line 286
    .line 287
    const/4 v3, 0x3

    .line 288
    invoke-direct {v1, v3, p0}, Lw4/v0;-><init>(ILcom/exotv/net/SeriesDetailActivity;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v4, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 292
    .line 293
    .line 294
    const/4 v8, 0x0

    .line 295
    const/16 v9, 0x1e4

    .line 296
    .line 297
    const/16 v5, 0x16

    .line 298
    .line 299
    const/4 v6, 0x0

    .line 300
    const/4 v7, 0x0

    .line 301
    move-object v3, p0

    .line 302
    invoke-static/range {v2 .. v9}, Lc5/j;->f(Lc5/j;Landroid/content/Context;Landroid/view/View;ILw4/x0;Ly6/a;Landroid/view/View;I)V

    .line 303
    .line 304
    .line 305
    iput-object v4, v3, Lcom/exotv/net/SeriesDetailActivity;->M:Landroid/widget/TextView;

    .line 306
    .line 307
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 308
    .line 309
    invoke-direct {v1, v13, v13}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 310
    .line 311
    .line 312
    const v2, 0x800033

    .line 313
    .line 314
    .line 315
    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 316
    .line 317
    invoke-static {p0, v11}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 322
    .line 323
    .line 324
    invoke-static {p0, v11}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 329
    .line 330
    invoke-virtual {p1, v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 331
    .line 332
    .line 333
    sget v1, Lc5/z;->b:I

    .line 334
    .line 335
    new-instance v2, Landroid/view/View;

    .line 336
    .line 337
    invoke-direct {v2, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 341
    .line 342
    .line 343
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 344
    .line 345
    invoke-direct {v1, v12, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 346
    .line 347
    .line 348
    const/16 v4, 0x50

    .line 349
    .line 350
    iput v4, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 351
    .line 352
    invoke-virtual {p1, v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 353
    .line 354
    .line 355
    new-instance v1, Landroidx/media3/exoplayer/source/i;

    .line 356
    .line 357
    invoke-direct {v1, p0, v0, v2}, Landroidx/media3/exoplayer/source/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    sget-object v0, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 361
    .line 362
    invoke-static {p1, v1}, Lm0/e0;->j(Landroid/view/View;Lm0/o;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {p0, p1}, Lh/i;->setContentView(Landroid/view/View;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {p0}, Lcom/exotv/net/SeriesDetailActivity;->w()V

    .line 369
    .line 370
    .line 371
    return-void

    .line 372
    :cond_2
    move-object v3, p0

    .line 373
    invoke-static {v6}, Lz6/h;->h(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    throw v4

    .line 377
    :cond_3
    move-object v3, p0

    .line 378
    invoke-static {v6}, Lz6/h;->h(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    throw v4
.end method

.method public final onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/exotv/net/SeriesDetailActivity;->f0:Li7/a0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Li7/x;->b(Li7/s0;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-super {p0}, Lh/i;->onDestroy()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 3

    .line 1
    const-string v0, "intent"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lb/l;->onNewIntent(Landroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/exotv/net/SeriesDetailActivity;->f0:Li7/a0;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {v0}, Li7/x;->b(Li7/s0;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const-string v0, "series_id"

    .line 20
    .line 21
    const-wide/16 v1, 0x0

    .line 22
    .line 23
    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    iput-wide v0, p0, Lcom/exotv/net/SeriesDetailActivity;->b0:J

    .line 28
    .line 29
    const-string v0, "series_title"

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-nez p1, :cond_1

    .line 36
    .line 37
    const-string p1, ""

    .line 38
    .line 39
    :cond_1
    iput-object p1, p0, Lcom/exotv/net/SeriesDetailActivity;->c0:Ljava/lang/String;

    .line 40
    .line 41
    iget-object p1, p0, Lcom/exotv/net/SeriesDetailActivity;->I:Landroid/widget/TextView;

    .line 42
    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/exotv/net/SeriesDetailActivity;->w()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    const-string p1, "status"

    .line 54
    .line 55
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    throw p1
.end method

.method public final onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Lh/i;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/exotv/net/SeriesDetailActivity;->s()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final s()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/exotv/net/SeriesDetailActivity;->W:Z

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "episode pending cleared (was pending="

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v0, ")"

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "SeriesDetail"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    iget-boolean v0, p0, Lcom/exotv/net/SeriesDetailActivity;->W:Z

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v0, 0x0

    .line 33
    iput-boolean v0, p0, Lcom/exotv/net/SeriesDetailActivity;->W:Z

    .line 34
    .line 35
    iget-object v1, p0, Lcom/exotv/net/SeriesDetailActivity;->U:Landroid/widget/TextView;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object v0, p0, Lcom/exotv/net/SeriesDetailActivity;->V:Landroid/widget/ProgressBar;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    const/16 v1, 0x8

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    :cond_2
    :goto_0
    return-void
.end method

.method public final t()I
    .locals 3

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-static {v2, v0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    float-to-int v0, v0

    .line 18
    return v0
.end method

.method public final u()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/exotv/net/SeriesDetailActivity;->a0:Ll6/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll6/g;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final v(I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/exotv/net/SeriesDetailActivity;->f0:Li7/a0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Li7/x;->b(Li7/s0;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput p1, p0, Lcom/exotv/net/SeriesDetailActivity;->e0:I

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput v0, p0, Lcom/exotv/net/SeriesDetailActivity;->h0:I

    .line 12
    .line 13
    iget-object v0, p0, Lcom/exotv/net/SeriesDetailActivity;->Y:Landroid/widget/TextView;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    invoke-static {p1}, Lcom/exotv/net/SeriesDetailActivity;->A(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const v2, 0x7f11011a

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-virtual {p0}, Lcom/exotv/net/SeriesDetailActivity;->D()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/exotv/net/SeriesDetailActivity;->L:Landroid/widget/LinearLayout;

    .line 40
    .line 41
    const-string v1, "episodeBox"

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lcom/exotv/net/SeriesDetailActivity;->L:Landroid/widget/LinearLayout;

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    new-instance v1, Landroid/widget/ProgressBar;

    .line 54
    .line 55
    invoke-direct {v1, p0}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    .line 56
    .line 57
    .line 58
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 59
    .line 60
    iget v4, p0, Lcom/exotv/net/SeriesDetailActivity;->i0:I

    .line 61
    .line 62
    iget v5, p0, Lcom/exotv/net/SeriesDetailActivity;->j0:I

    .line 63
    .line 64
    invoke-direct {v3, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 65
    .line 66
    .line 67
    const/16 v4, 0x11

    .line 68
    .line 69
    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 70
    .line 71
    invoke-virtual {v0, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 72
    .line 73
    .line 74
    invoke-static {p0}, Landroidx/lifecycle/m0;->e(Landroidx/lifecycle/v;)Landroidx/lifecycle/q;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    new-instance v1, Lw4/c1;

    .line 79
    .line 80
    const/4 v3, 0x1

    .line 81
    invoke-direct {v1, p0, p1, v2, v3}, Lw4/c1;-><init>(Lcom/exotv/net/SeriesDetailActivity;ILp6/c;I)V

    .line 82
    .line 83
    .line 84
    const/4 p1, 0x3

    .line 85
    invoke-static {v0, v2, v1, p1}, Li7/x;->k(Li7/u;Lj7/d;Ly6/p;I)Li7/a0;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iput-object p1, p0, Lcom/exotv/net/SeriesDetailActivity;->f0:Li7/a0;

    .line 90
    .line 91
    return-void

    .line 92
    :cond_2
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw v2

    .line 96
    :cond_3
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v2
.end method

.method public final w()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/exotv/net/SeriesDetailActivity;->I:Landroid/widget/TextView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "status"

    .line 5
    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    const-string v3, ""

    .line 9
    .line 10
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/exotv/net/SeriesDetailActivity;->I:Landroid/widget/TextView;

    .line 14
    .line 15
    if-eqz v0, :cond_4

    .line 16
    .line 17
    const/16 v3, 0x8

    .line 18
    .line 19
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/exotv/net/SeriesDetailActivity;->I:Landroid/widget/TextView;

    .line 23
    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-virtual {v0, v2, v2, v2, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/exotv/net/SeriesDetailActivity;->H:Landroid/widget/LinearLayout;

    .line 31
    .line 32
    const-string v2, "content"

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/exotv/net/SeriesDetailActivity;->H:Landroid/widget/LinearLayout;

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    new-instance v2, Landroid/widget/FrameLayout;

    .line 44
    .line 45
    invoke-direct {v2, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 46
    .line 47
    .line 48
    new-instance v3, Landroid/widget/ProgressBar;

    .line 49
    .line 50
    invoke-direct {v3, p0}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    .line 51
    .line 52
    .line 53
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 54
    .line 55
    iget v5, p0, Lcom/exotv/net/SeriesDetailActivity;->j0:I

    .line 56
    .line 57
    invoke-direct {v4, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 58
    .line 59
    .line 60
    const/16 v5, 0x11

    .line 61
    .line 62
    iput v5, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 63
    .line 64
    invoke-virtual {v2, v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 65
    .line 66
    .line 67
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 68
    .line 69
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 78
    .line 79
    int-to-float v4, v4

    .line 80
    invoke-virtual {p0}, Lcom/exotv/net/SeriesDetailActivity;->u()Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_0

    .line 85
    .line 86
    const v5, 0x3f051eb8    # 0.52f

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    const v5, 0x3ed70a3d    # 0.42f

    .line 91
    .line 92
    .line 93
    :goto_0
    mul-float/2addr v4, v5

    .line 94
    float-to-int v4, v4

    .line 95
    iget v5, p0, Lcom/exotv/net/SeriesDetailActivity;->Z:I

    .line 96
    .line 97
    add-int/2addr v4, v5

    .line 98
    iget v5, p0, Lcom/exotv/net/SeriesDetailActivity;->i0:I

    .line 99
    .line 100
    invoke-direct {v3, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 104
    .line 105
    .line 106
    invoke-static {p0}, Landroidx/lifecycle/m0;->e(Landroidx/lifecycle/v;)Landroidx/lifecycle/q;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    new-instance v2, Lc5/q0;

    .line 111
    .line 112
    const/4 v3, 0x5

    .line 113
    invoke-direct {v2, p0, v1, v3}, Lc5/q0;-><init>(Lh/i;Lp6/c;I)V

    .line 114
    .line 115
    .line 116
    const/4 v3, 0x3

    .line 117
    invoke-static {v0, v1, v2, v3}, Li7/x;->k(Li7/u;Lj7/d;Ly6/p;I)Li7/a0;

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_1
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v1

    .line 125
    :cond_2
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v1

    .line 129
    :cond_3
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v1

    .line 133
    :cond_4
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw v1

    .line 137
    :cond_5
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw v1
.end method

.method public final y(Ljava/lang/String;)Landroid/widget/TextView;
    .locals 4

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    sget p1, Lw4/z0;->a:I

    .line 10
    .line 11
    sget p1, Lw4/z0;->i:I

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 14
    .line 15
    .line 16
    const/high16 p1, 0x41500000    # 13.0f

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/exotv/net/SeriesDetailActivity;->t()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    const/16 v1, 0xc

    .line 26
    .line 27
    int-to-float v1, v1

    .line 28
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/4 v3, 0x1

    .line 37
    invoke-static {v3, v1, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    float-to-int v1, v1

    .line 42
    invoke-virtual {p0}, Lcom/exotv/net/SeriesDetailActivity;->t()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-virtual {v0, p1, v1, v2, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 48
    .line 49
    .line 50
    return-object v0
.end method
