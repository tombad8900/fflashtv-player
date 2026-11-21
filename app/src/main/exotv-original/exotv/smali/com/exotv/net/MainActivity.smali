.class public final Lcom/exotv/net/MainActivity;
.super Lh/i;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final p0:Ljava/util/Set;

.field public static final q0:Ljava/lang/String;


# instance fields
.field public H:Landroid/widget/LinearLayout;

.field public I:Landroid/widget/FrameLayout;

.field public J:Lc5/y;

.field public K:Lw4/q;

.field public L:Lw4/q;

.field public M:Lc5/a1;

.field public N:La1/e;

.field public O:Z

.field public P:La5/a;

.field public Q:Ll/o;

.field public R:Lw4/b;

.field public S:Lc5/o;

.field public T:Lc5/t;

.field public U:Ljava/util/List;

.field public V:I

.field public W:Z

.field public X:Z

.field public Y:Lb5/i;

.field public Z:Lcom/exotv/net/model/Channel;

.field public final a0:Ljava/util/List;

.field public final b0:Ljava/util/List;

.field public final c0:Ljava/util/HashMap;

.field public d0:Landroid/widget/LinearLayout;

.field public e0:Landroid/widget/TextView;

.field public f0:Landroid/widget/LinearLayout;

.field public g0:I

.field public h0:I

.field public i0:I

.field public j0:I

.field public final k0:I

.field public final l0:I

.field public m0:Lw4/o;

.field public n0:Lw4/q;

.field public o0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x2a0b

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/16 v2, 0x2a0c

    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/16 v3, 0x2a0f

    .line 20
    .line 21
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lcom/bumptech/glide/c;->a0([Ljava/lang/Object;)Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sput-object v1, Lcom/exotv/net/MainActivity;->p0:Ljava/util/Set;

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/16 v6, 0x3e

    .line 37
    .line 38
    const-string v2, "%7C"

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-static/range {v1 .. v6}, Lm6/h;->E0(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly6/l;I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lcom/exotv/net/MainActivity;->q0:Ljava/lang/String;

    .line 47
    .line 48
    return-void
.end method

.method public constructor <init>()V
    .locals 18

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    invoke-direct {v2}, Lh/i;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lw4/q;->j:Lw4/q;

    .line 7
    .line 8
    iput-object v0, v2, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 9
    .line 10
    iput-object v0, v2, Lcom/exotv/net/MainActivity;->L:Lw4/q;

    .line 11
    .line 12
    sget-object v0, Lm6/p;->j:Lm6/p;

    .line 13
    .line 14
    iput-object v0, v2, Lcom/exotv/net/MainActivity;->U:Ljava/util/List;

    .line 15
    .line 16
    new-instance v3, Lw4/k;

    .line 17
    .line 18
    new-instance v4, Lw4/m;

    .line 19
    .line 20
    const-string v0, "Trending"

    .line 21
    .line 22
    const-string v1, "/trending/movie/day"

    .line 23
    .line 24
    const-string v9, "trending"

    .line 25
    .line 26
    invoke-direct {v4, v9, v0, v1}, Lw4/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sget-object v5, Lw4/p;->j:Lw4/p;

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    const/16 v8, 0xc

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    invoke-direct/range {v3 .. v8}, Lw4/k;-><init>(Lw4/m;Lw4/p;Lb/w;Ljava/util/Set;I)V

    .line 36
    .line 37
    .line 38
    new-instance v10, Lw4/k;

    .line 39
    .line 40
    new-instance v11, Lw4/m;

    .line 41
    .line 42
    const-string v0, "Now Playing"

    .line 43
    .line 44
    const-string v1, "/movie/now_playing"

    .line 45
    .line 46
    const-string v4, "now_playing"

    .line 47
    .line 48
    invoke-direct {v11, v4, v0, v1}, Lw4/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    sget-object v14, Lw4/p;->k:Lw4/p;

    .line 52
    .line 53
    move-object v12, v14

    .line 54
    const/4 v14, 0x0

    .line 55
    const/16 v15, 0xc

    .line 56
    .line 57
    const/4 v13, 0x0

    .line 58
    invoke-direct/range {v10 .. v15}, Lw4/k;-><init>(Lw4/m;Lw4/p;Lb/w;Ljava/util/Set;I)V

    .line 59
    .line 60
    .line 61
    move-object v14, v12

    .line 62
    new-instance v12, Lw4/k;

    .line 63
    .line 64
    new-instance v13, Lw4/m;

    .line 65
    .line 66
    const-string v0, "Popular"

    .line 67
    .line 68
    const-string v1, "/movie/popular"

    .line 69
    .line 70
    const-string v4, "popular"

    .line 71
    .line 72
    invoke-direct {v13, v4, v0, v1}, Lw4/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/16 v16, 0x0

    .line 76
    .line 77
    const/16 v17, 0xc

    .line 78
    .line 79
    const/4 v15, 0x0

    .line 80
    invoke-direct/range {v12 .. v17}, Lw4/k;-><init>(Lw4/m;Lw4/p;Lb/w;Ljava/util/Set;I)V

    .line 81
    .line 82
    .line 83
    move-object v0, v12

    .line 84
    new-instance v12, Lw4/k;

    .line 85
    .line 86
    new-instance v13, Lw4/m;

    .line 87
    .line 88
    const-string v1, "Top Rated"

    .line 89
    .line 90
    const-string v6, "/movie/top_rated"

    .line 91
    .line 92
    const-string v7, "top_rated"

    .line 93
    .line 94
    invoke-direct {v13, v7, v1, v6}, Lw4/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-direct/range {v12 .. v17}, Lw4/k;-><init>(Lw4/m;Lw4/p;Lb/w;Ljava/util/Set;I)V

    .line 98
    .line 99
    .line 100
    move-object/from16 v16, v14

    .line 101
    .line 102
    filled-new-array {v3, v10, v0, v12}, [Lw4/k;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {v0}, Lm6/i;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iput-object v0, v2, Lcom/exotv/net/MainActivity;->a0:Ljava/util/List;

    .line 111
    .line 112
    new-instance v10, Lw4/k;

    .line 113
    .line 114
    new-instance v11, Lw4/m;

    .line 115
    .line 116
    const-string v0, "Trending Series"

    .line 117
    .line 118
    const-string v1, "/trending/tv/day"

    .line 119
    .line 120
    invoke-direct {v11, v9, v0, v1}, Lw4/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    sget-object v14, Lcom/exotv/net/MainActivity;->p0:Ljava/util/Set;

    .line 124
    .line 125
    const/4 v15, 0x4

    .line 126
    const/4 v13, 0x0

    .line 127
    move-object v12, v5

    .line 128
    invoke-direct/range {v10 .. v15}, Lw4/k;-><init>(Lw4/m;Lw4/p;Lb/w;Ljava/util/Set;I)V

    .line 129
    .line 130
    .line 131
    new-instance v12, Lw4/k;

    .line 132
    .line 133
    new-instance v13, Lw4/m;

    .line 134
    .line 135
    const-string v0, "New on Streaming"

    .line 136
    .line 137
    const-string v1, "/discover/tv"

    .line 138
    .line 139
    const-string v3, "new_streaming"

    .line 140
    .line 141
    invoke-direct {v13, v3, v0, v1}, Lw4/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    new-instance v15, Lb/w;

    .line 145
    .line 146
    move-object v0, v7

    .line 147
    const/4 v7, 0x0

    .line 148
    const/4 v8, 0x2

    .line 149
    const/4 v1, 0x0

    .line 150
    const-class v3, Lcom/exotv/net/MainActivity;

    .line 151
    .line 152
    move-object v5, v4

    .line 153
    const-string v4, "streamingQuery"

    .line 154
    .line 155
    move-object v6, v5

    .line 156
    const-string v5, "streamingQuery()Ljava/lang/String;"

    .line 157
    .line 158
    move-object v9, v6

    .line 159
    const/4 v6, 0x0

    .line 160
    move-object v11, v0

    .line 161
    move-object v0, v15

    .line 162
    invoke-direct/range {v0 .. v8}, Lb/w;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 163
    .line 164
    .line 165
    move-object/from16 v14, v16

    .line 166
    .line 167
    const/16 v16, 0x0

    .line 168
    .line 169
    const/16 v17, 0x8

    .line 170
    .line 171
    invoke-direct/range {v12 .. v17}, Lw4/k;-><init>(Lw4/m;Lw4/p;Lb/w;Ljava/util/Set;I)V

    .line 172
    .line 173
    .line 174
    move-object v0, v12

    .line 175
    new-instance v12, Lw4/k;

    .line 176
    .line 177
    new-instance v13, Lw4/m;

    .line 178
    .line 179
    sget-object v1, Lcom/exotv/net/MainActivity;->q0:Ljava/lang/String;

    .line 180
    .line 181
    const-string v3, "/discover/tv?sort_by=popularity.desc&without_genres="

    .line 182
    .line 183
    invoke-static {v3, v1}, La1/a1;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    const-string v3, "Popular Series"

    .line 188
    .line 189
    invoke-direct {v13, v9, v3, v1}, Lw4/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    const/16 v17, 0xc

    .line 193
    .line 194
    const/4 v15, 0x0

    .line 195
    invoke-direct/range {v12 .. v17}, Lw4/k;-><init>(Lw4/m;Lw4/p;Lb/w;Ljava/util/Set;I)V

    .line 196
    .line 197
    .line 198
    move-object v1, v12

    .line 199
    new-instance v12, Lw4/k;

    .line 200
    .line 201
    new-instance v13, Lw4/m;

    .line 202
    .line 203
    const-string v3, "Top Rated Series"

    .line 204
    .line 205
    const-string v4, "/tv/top_rated"

    .line 206
    .line 207
    invoke-direct {v13, v11, v3, v4}, Lw4/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-direct/range {v12 .. v17}, Lw4/k;-><init>(Lw4/m;Lw4/p;Lb/w;Ljava/util/Set;I)V

    .line 211
    .line 212
    .line 213
    filled-new-array {v10, v0, v1, v12}, [Lw4/k;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-static {v0}, Lm6/i;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    iput-object v0, v2, Lcom/exotv/net/MainActivity;->b0:Ljava/util/List;

    .line 222
    .line 223
    new-instance v0, Ljava/util/HashMap;

    .line 224
    .line 225
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 226
    .line 227
    .line 228
    iput-object v0, v2, Lcom/exotv/net/MainActivity;->c0:Ljava/util/HashMap;

    .line 229
    .line 230
    const/4 v0, -0x1

    .line 231
    iput v0, v2, Lcom/exotv/net/MainActivity;->k0:I

    .line 232
    .line 233
    const/4 v0, -0x2

    .line 234
    iput v0, v2, Lcom/exotv/net/MainActivity;->l0:I

    .line 235
    .line 236
    return-void
.end method

.method public static C(Landroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;
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

.method public static D(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 3

    .line 1
    instance-of v0, p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move-object v1, v0

    .line 17
    :goto_0
    instance-of v2, v1, Landroid/view/View;

    .line 18
    .line 19
    if-eqz v2, :cond_3

    .line 20
    .line 21
    instance-of v2, v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_2
    check-cast v1, Landroid/view/View;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    goto :goto_0

    .line 35
    :cond_3
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 36
    .line 37
    if-eqz v1, :cond_4

    .line 38
    .line 39
    check-cast p0, Landroid/view/ViewGroup;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_4
    move-object p0, v0

    .line 43
    :goto_1
    if-eqz p0, :cond_5

    .line 44
    .line 45
    invoke-static {p0}, Lcom/exotv/net/MainActivity;->E(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_5
    return-object v0
.end method

.method public static final E(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 4

    .line 1
    instance-of v0, p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    check-cast p0, Landroid/view/ViewGroup;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    if-ge v1, v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-string v3, "getChildAt(...)"

    .line 26
    .line 27
    invoke-static {v3, v2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, Lcom/exotv/net/MainActivity;->E(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    return-object v2

    .line 37
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method

.method public static H(Landroid/view/View;Landroid/view/ViewGroup;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    instance-of v0, p0, Landroid/view/View;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    check-cast p0, Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public static L(Lcom/exotv/net/MainActivity;I)V
    .locals 9

    .line 1
    and-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v5, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v5, v1

    .line 10
    :goto_0
    and-int/lit8 v0, p1, 0x2

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    move v7, v2

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move v7, v1

    .line 17
    :goto_1
    and-int/lit8 p1, p1, 0x4

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    move v6, v2

    .line 22
    goto :goto_2

    .line 23
    :cond_2
    move v6, v1

    .line 24
    :goto_2
    iget-boolean p1, p0, Lcom/exotv/net/MainActivity;->X:Z

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    return-void

    .line 29
    :cond_3
    iput-boolean v1, p0, Lcom/exotv/net/MainActivity;->X:Z

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Lcom/exotv/net/MainActivity;->Q(Z)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Landroidx/lifecycle/m0;->e(Landroidx/lifecycle/v;)Landroidx/lifecycle/q;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance v3, Lw4/w;

    .line 39
    .line 40
    const/4 v8, 0x0

    .line 41
    move-object v4, p0

    .line 42
    invoke-direct/range {v3 .. v8}, Lw4/w;-><init>(Lcom/exotv/net/MainActivity;ZZZLp6/c;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x3

    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-static {p1, v0, v3, p0}, Li7/x;->k(Li7/u;Lj7/d;Ly6/p;I)Li7/a0;

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static N(Landroid/widget/HorizontalScrollView;)Landroid/view/View;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, v0}, Landroid/widget/HorizontalScrollView;->scrollTo(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-lez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p0, v2

    .line 18
    :goto_0
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    check-cast p0, Landroid/view/ViewGroup;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-lez v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move-object p0, v2

    .line 36
    :goto_1
    if-nez p0, :cond_2

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_3
    :goto_2
    return-object v2
.end method

.method public static W(Landroid/view/View;)Landroid/widget/HorizontalScrollView;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    instance-of v0, p0, Landroid/view/View;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    instance-of v0, p0, Landroid/widget/HorizontalScrollView;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p0, Landroid/widget/HorizontalScrollView;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    check-cast p0, Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public static Y(Lw4/q;)Lc5/w;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p0, v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    if-ne p0, v0, :cond_0

    .line 15
    .line 16
    sget-object p0, Lc5/w;->p:Lc5/w;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance p0, La1/u;

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 22
    .line 23
    .line 24
    throw p0

    .line 25
    :cond_1
    sget-object p0, Lc5/w;->o:Lc5/w;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    sget-object p0, Lc5/w;->n:Lc5/w;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_3
    sget-object p0, Lc5/w;->m:Lc5/w;

    .line 32
    .line 33
    return-object p0
.end method

.method public static final r(Lcom/exotv/net/MainActivity;Lx4/l;Lx4/m;)V
    .locals 3

    .line 1
    sget-object v0, Lx4/m;->k:Lx4/m;

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    new-instance p2, Landroid/content/Intent;

    .line 6
    .line 7
    const-class v0, Lcom/exotv/net/SeriesDetailActivity;

    .line 8
    .line 9
    invoke-direct {p2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "series_id"

    .line 13
    .line 14
    iget-wide v1, p1, Lx4/l;->a:J

    .line 15
    .line 16
    invoke-virtual {p2, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    const-string v0, "series_title"

    .line 21
    .line 22
    iget-object p1, p1, Lx4/l;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    new-instance p2, Landroid/content/Intent;

    .line 33
    .line 34
    const-class v0, Lcom/exotv/net/MovieDetailActivity;

    .line 35
    .line 36
    invoke-direct {p2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 37
    .line 38
    .line 39
    const-string v0, "movie_id"

    .line 40
    .line 41
    iget-wide v1, p1, Lx4/l;->a:J

    .line 42
    .line 43
    invoke-virtual {p2, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    const-string v0, "movie_title"

    .line 48
    .line 49
    iget-object p1, p1, Lx4/l;->b:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public static final s(Lcom/exotv/net/MainActivity;Lb5/i;)V
    .locals 5

    .line 1
    iget-boolean v0, p1, Lb5/i;->b:Z

    .line 2
    .line 3
    iput-object p1, p0, Lcom/exotv/net/MainActivity;->Y:Lb5/i;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 6
    .line 7
    sget-object v2, Lw4/q;->j:Lw4/q;

    .line 8
    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v2}, Lcom/exotv/net/MainActivity;->O(Lw4/q;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const-string v3, "b"

    .line 18
    .line 19
    if-eqz v1, :cond_17

    .line 20
    .line 21
    iget-object v1, v1, La5/a;->m:Landroid/widget/TextView;

    .line 22
    .line 23
    const v4, 0x7f11013f

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 34
    .line 35
    if-eqz v1, :cond_16

    .line 36
    .line 37
    iget-object v1, v1, La5/a;->m:Landroid/widget/TextView;

    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 44
    .line 45
    if-eqz v1, :cond_15

    .line 46
    .line 47
    iget-object v1, v1, La5/a;->a:Landroid/widget/TextView;

    .line 48
    .line 49
    xor-int/lit8 v4, v0, 0x1

    .line 50
    .line 51
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 55
    .line 56
    if-eqz v1, :cond_14

    .line 57
    .line 58
    iget-object v1, v1, La5/a;->m:Landroid/widget/TextView;

    .line 59
    .line 60
    const/high16 v4, 0x3f800000    # 1.0f

    .line 61
    .line 62
    invoke-virtual {v1, v4}, Landroid/view/View;->setAlpha(F)V

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 66
    .line 67
    if-eqz v1, :cond_13

    .line 68
    .line 69
    iget-object v1, v1, La5/a;->a:Landroid/widget/TextView;

    .line 70
    .line 71
    if-eqz v0, :cond_1

    .line 72
    .line 73
    const v4, 0x3ecccccd    # 0.4f

    .line 74
    .line 75
    .line 76
    :cond_1
    invoke-virtual {v1, v4}, Landroid/view/View;->setAlpha(F)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 80
    .line 81
    if-eqz v0, :cond_12

    .line 82
    .line 83
    iget-object v0, v0, La5/a;->f:Landroid/widget/ProgressBar;

    .line 84
    .line 85
    const/4 v1, 0x0

    .line 86
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 90
    .line 91
    if-eqz v0, :cond_11

    .line 92
    .line 93
    iget-object v0, v0, La5/a;->f:Landroid/widget/ProgressBar;

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 99
    .line 100
    if-eqz v0, :cond_10

    .line 101
    .line 102
    iget-object v0, v0, La5/a;->p:Landroid/widget/LinearLayout;

    .line 103
    .line 104
    const/16 v4, 0x8

    .line 105
    .line 106
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 107
    .line 108
    .line 109
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 110
    .line 111
    if-eqz v0, :cond_f

    .line 112
    .line 113
    iget-object v0, v0, La5/a;->o:Landroid/widget/TextView;

    .line 114
    .line 115
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 116
    .line 117
    .line 118
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 119
    .line 120
    if-eqz v0, :cond_e

    .line 121
    .line 122
    iget-object v0, v0, La5/a;->n:Landroid/widget/TextView;

    .line 123
    .line 124
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 128
    .line 129
    if-eqz v0, :cond_d

    .line 130
    .line 131
    iget-object v0, v0, La5/a;->i:Landroid/widget/LinearLayout;

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 134
    .line 135
    .line 136
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 137
    .line 138
    if-eqz v0, :cond_c

    .line 139
    .line 140
    iget-object v0, v0, La5/a;->k:Landroid/widget/ProgressBar;

    .line 141
    .line 142
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 143
    .line 144
    .line 145
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 146
    .line 147
    if-eqz v0, :cond_b

    .line 148
    .line 149
    iget-object v0, v0, La5/a;->j:Landroid/widget/TextView;

    .line 150
    .line 151
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 152
    .line 153
    .line 154
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 155
    .line 156
    if-eqz v0, :cond_a

    .line 157
    .line 158
    iget-object v0, v0, La5/a;->q:Landroid/widget/TextView;

    .line 159
    .line 160
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 161
    .line 162
    .line 163
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 164
    .line 165
    if-eqz v0, :cond_9

    .line 166
    .line 167
    iget-object v0, v0, La5/a;->l:Landroid/widget/TextView;

    .line 168
    .line 169
    iget-object p1, p1, Lb5/i;->c:Ljava/lang/String;

    .line 170
    .line 171
    if-nez p1, :cond_2

    .line 172
    .line 173
    const-string p1, ""

    .line 174
    .line 175
    :cond_2
    invoke-static {p1}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    if-eqz v4, :cond_3

    .line 180
    .line 181
    const p1, 0x7f110141

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    const-string v4, "getString(...)"

    .line 189
    .line 190
    invoke-static {v4, p1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :cond_3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 194
    .line 195
    .line 196
    iget-object p1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 197
    .line 198
    if-eqz p1, :cond_8

    .line 199
    .line 200
    iget-object p1, p1, La5/a;->m:Landroid/widget/TextView;

    .line 201
    .line 202
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 203
    .line 204
    .line 205
    iget-object p1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 206
    .line 207
    if-eqz p1, :cond_7

    .line 208
    .line 209
    iget-object p1, p1, La5/a;->a:Landroid/widget/TextView;

    .line 210
    .line 211
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0, v1}, Lcom/exotv/net/MainActivity;->P(Z)V

    .line 215
    .line 216
    .line 217
    iget-object p1, p0, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 218
    .line 219
    if-eqz p1, :cond_6

    .line 220
    .line 221
    invoke-virtual {p1, v1}, Lc5/y;->d(Z)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0}, Lcom/exotv/net/MainActivity;->J()Z

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    if-eqz p1, :cond_5

    .line 229
    .line 230
    iget-object p1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 231
    .line 232
    if-eqz p1, :cond_4

    .line 233
    .line 234
    iget-object p1, p1, La5/a;->m:Landroid/widget/TextView;

    .line 235
    .line 236
    new-instance v0, Lw4/h;

    .line 237
    .line 238
    const/4 v1, 0x1

    .line 239
    invoke-direct {v0, p0, v1}, Lw4/h;-><init>(Lcom/exotv/net/MainActivity;I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :cond_4
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    throw v2

    .line 250
    :cond_5
    return-void

    .line 251
    :cond_6
    const-string p0, "nav"

    .line 252
    .line 253
    invoke-static {p0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    throw v2

    .line 257
    :cond_7
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    throw v2

    .line 261
    :cond_8
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw v2

    .line 265
    :cond_9
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    throw v2

    .line 269
    :cond_a
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    throw v2

    .line 273
    :cond_b
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    throw v2

    .line 277
    :cond_c
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    throw v2

    .line 281
    :cond_d
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    throw v2

    .line 285
    :cond_e
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    throw v2

    .line 289
    :cond_f
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    throw v2

    .line 293
    :cond_10
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    throw v2

    .line 297
    :cond_11
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    throw v2

    .line 301
    :cond_12
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    throw v2

    .line 305
    :cond_13
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    throw v2

    .line 309
    :cond_14
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    throw v2

    .line 313
    :cond_15
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    throw v2

    .line 317
    :cond_16
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    throw v2

    .line 321
    :cond_17
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    throw v2
.end method

.method public static x(Landroid/view/View;)Landroid/widget/HorizontalScrollView;
    .locals 4

    .line 1
    instance-of v0, p0, Landroid/widget/HorizontalScrollView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Landroid/widget/HorizontalScrollView;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_1
    check-cast p0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    :goto_0
    if-ge v1, v0, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v3, "getChildAt(...)"

    .line 27
    .line 28
    invoke-static {v3, v2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v2}, Lcom/exotv/net/MainActivity;->x(Landroid/view/View;)Landroid/widget/HorizontalScrollView;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    return-object v2

    .line 38
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 42
    return-object p0
.end method

.method public static final y(IILandroidx/recyclerview/widget/RecyclerView;Lcom/exotv/net/MainActivity;)V
    .locals 3

    .line 1
    if-lez p1, :cond_3

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    if-eq p0, v0, :cond_3

    .line 5
    .line 6
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lz2/f0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    instance-of v2, v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    check-cast v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    if-eqz v1, :cond_2

    .line 19
    .line 20
    iput p0, v1, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    iput v2, v1, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 24
    .line 25
    iget-object v2, v1, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lz2/q;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    iput v0, v2, Lz2/q;->j:I

    .line 30
    .line 31
    :cond_1
    invoke-virtual {v1}, Lz2/f0;->n0()V

    .line 32
    .line 33
    .line 34
    :cond_2
    new-instance v0, Lw4/j;

    .line 35
    .line 36
    invoke-direct {v0, p1, p0, p2, p3}, Lw4/j;-><init>(IILandroidx/recyclerview/widget/RecyclerView;Lcom/exotv/net/MainActivity;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_3
    invoke-virtual {p2, p0}, Landroidx/recyclerview/widget/RecyclerView;->H(I)Lz2/v0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-eqz p0, :cond_4

    .line 48
    .line 49
    iget-object p0, p0, Lz2/v0;->a:Landroid/view/View;

    .line 50
    .line 51
    if-nez p0, :cond_5

    .line 52
    .line 53
    :cond_4
    invoke-static {p2}, Lcom/exotv/net/MainActivity;->C(Landroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    :cond_5
    if-eqz p0, :cond_6

    .line 58
    .line 59
    const/4 p1, 0x1

    .line 60
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusable(Z)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 67
    .line 68
    .line 69
    :cond_6
    return-void
.end method

.method public static z(Landroidx/recyclerview/widget/RecyclerView;I)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p1, :cond_7

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lz2/x;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, Lz2/x;->a()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v1, v0

    .line 16
    :goto_0
    if-lt p1, v1, :cond_1

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->H(I)Lz2/v0;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    iget-object v1, v1, Lz2/v0;->a:Landroid/view/View;

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_2
    move-object v1, v2

    .line 30
    :goto_1
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/view/View;->isShown()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_3

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 40
    .line 41
    .line 42
    return v3

    .line 43
    :cond_3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lz2/f0;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    instance-of v4, v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 48
    .line 49
    if-eqz v4, :cond_4

    .line 50
    .line 51
    move-object v2, v1

    .line 52
    check-cast v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 53
    .line 54
    :cond_4
    if-eqz v2, :cond_6

    .line 55
    .line 56
    iput p1, v2, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 57
    .line 58
    iput v0, v2, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 59
    .line 60
    iget-object v0, v2, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lz2/q;

    .line 61
    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    const/4 v1, -0x1

    .line 65
    iput v1, v0, Lz2/q;->j:I

    .line 66
    .line 67
    :cond_5
    invoke-virtual {v2}, Lz2/f0;->n0()V

    .line 68
    .line 69
    .line 70
    :cond_6
    new-instance v0, Lw4/f;

    .line 71
    .line 72
    invoke-direct {v0, p0, p1}, Lw4/f;-><init>(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 76
    .line 77
    .line 78
    return v3

    .line 79
    :cond_7
    :goto_2
    return v0
.end method


# virtual methods
.method public final A()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 2
    .line 3
    sget-object v1, Lw4/q;->j:Lw4/q;

    .line 4
    .line 5
    if-ne v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, La5/a;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 12
    .line 13
    iget v1, p0, Lcom/exotv/net/MainActivity;->V:I

    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/exotv/net/MainActivity;->z(Landroidx/recyclerview/widget/RecyclerView;I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const-string v0, "b"

    .line 24
    .line 25
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    throw v0

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method public final B()Lx4/m;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    return-object v0

    .line 15
    :cond_0
    sget-object v0, Lx4/m;->k:Lx4/m;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    sget-object v0, Lx4/m;->j:Lx4/m;

    .line 19
    .line 20
    return-object v0
.end method

.method public final F()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/exotv/net/MainActivity;->J()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lc5/j;->a(Lh/i;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 16
    .line 17
    if-eqz v1, :cond_4

    .line 18
    .line 19
    iget-object v1, v1, La5/a;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 20
    .line 21
    new-instance v2, Ll/o;

    .line 22
    .line 23
    invoke-direct {v2, v1}, Ll/o;-><init>(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 27
    .line 28
    const/16 v3, 0x23

    .line 29
    .line 30
    if-lt v1, v3, :cond_1

    .line 31
    .line 32
    new-instance v1, Lm0/w1;

    .line 33
    .line 34
    invoke-direct {v1, v0, v2}, Lm0/u1;-><init>(Landroid/view/Window;Ll/o;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/16 v3, 0x1e

    .line 39
    .line 40
    if-lt v1, v3, :cond_2

    .line 41
    .line 42
    new-instance v1, Lm0/u1;

    .line 43
    .line 44
    invoke-direct {v1, v0, v2}, Lm0/u1;-><init>(Landroid/view/Window;Ll/o;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/16 v3, 0x1a

    .line 49
    .line 50
    if-lt v1, v3, :cond_3

    .line 51
    .line 52
    new-instance v1, Lm0/t1;

    .line 53
    .line 54
    invoke-direct {v1, v0, v2}, Lm0/s1;-><init>(Landroid/view/Window;Ll/o;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    new-instance v1, Lm0/s1;

    .line 59
    .line 60
    invoke-direct {v1, v0, v2}, Lm0/s1;-><init>(Landroid/view/Window;Ll/o;)V

    .line 61
    .line 62
    .line 63
    :goto_0
    const/16 v0, 0x207

    .line 64
    .line 65
    invoke-virtual {v1, v0}, Lcom/bumptech/glide/d;->L(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Lcom/bumptech/glide/d;->j0()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_4
    const-string v0, "b"

    .line 73
    .line 74
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const/4 v0, 0x0

    .line 78
    throw v0
.end method

.method public final G()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/exotv/net/MainActivity;->Y:Lb5/i;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 5
    .line 6
    const-string v2, "b"

    .line 7
    .line 8
    if-eqz v1, :cond_e

    .line 9
    .line 10
    iget-object v1, v1, La5/a;->q:Landroid/widget/TextView;

    .line 11
    .line 12
    const/16 v3, 0x8

    .line 13
    .line 14
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 18
    .line 19
    if-eqz v1, :cond_d

    .line 20
    .line 21
    iget-object v1, v1, La5/a;->m:Landroid/widget/TextView;

    .line 22
    .line 23
    const v4, 0x7f11013f

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 34
    .line 35
    if-eqz v1, :cond_c

    .line 36
    .line 37
    iget-object v1, v1, La5/a;->m:Landroid/widget/TextView;

    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 44
    .line 45
    if-eqz v1, :cond_b

    .line 46
    .line 47
    iget-object v1, v1, La5/a;->a:Landroid/widget/TextView;

    .line 48
    .line 49
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 53
    .line 54
    if-eqz v1, :cond_a

    .line 55
    .line 56
    iget-object v1, v1, La5/a;->m:Landroid/widget/TextView;

    .line 57
    .line 58
    const/high16 v5, 0x3f800000    # 1.0f

    .line 59
    .line 60
    invoke-virtual {v1, v5}, Landroid/view/View;->setAlpha(F)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 64
    .line 65
    if-eqz v1, :cond_9

    .line 66
    .line 67
    iget-object v1, v1, La5/a;->a:Landroid/widget/TextView;

    .line 68
    .line 69
    invoke-virtual {v1, v5}, Landroid/view/View;->setAlpha(F)V

    .line 70
    .line 71
    .line 72
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 73
    .line 74
    if-eqz v1, :cond_8

    .line 75
    .line 76
    iget-object v1, v1, La5/a;->f:Landroid/widget/ProgressBar;

    .line 77
    .line 78
    const/4 v5, 0x0

    .line 79
    invoke-virtual {v1, v5}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 80
    .line 81
    .line 82
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 83
    .line 84
    if-eqz v1, :cond_7

    .line 85
    .line 86
    iget-object v1, v1, La5/a;->f:Landroid/widget/ProgressBar;

    .line 87
    .line 88
    invoke-virtual {v1, v5}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 89
    .line 90
    .line 91
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 92
    .line 93
    if-eqz v1, :cond_6

    .line 94
    .line 95
    iget-object v1, v1, La5/a;->e:Landroid/widget/TextView;

    .line 96
    .line 97
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    const v6, 0x7f110044

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, v6, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 113
    .line 114
    .line 115
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 116
    .line 117
    if-eqz v1, :cond_5

    .line 118
    .line 119
    iget-object v1, v1, La5/a;->p:Landroid/widget/LinearLayout;

    .line 120
    .line 121
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 122
    .line 123
    .line 124
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 125
    .line 126
    if-eqz v1, :cond_4

    .line 127
    .line 128
    iget-object v1, v1, La5/a;->m:Landroid/widget/TextView;

    .line 129
    .line 130
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 131
    .line 132
    .line 133
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 134
    .line 135
    if-eqz v1, :cond_3

    .line 136
    .line 137
    iget-object v1, v1, La5/a;->a:Landroid/widget/TextView;

    .line 138
    .line 139
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 140
    .line 141
    .line 142
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 143
    .line 144
    if-eqz v1, :cond_2

    .line 145
    .line 146
    iget-object v1, v1, La5/a;->o:Landroid/widget/TextView;

    .line 147
    .line 148
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 149
    .line 150
    .line 151
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 152
    .line 153
    if-eqz v1, :cond_1

    .line 154
    .line 155
    iget-object v1, v1, La5/a;->n:Landroid/widget/TextView;

    .line 156
    .line 157
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 158
    .line 159
    .line 160
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 161
    .line 162
    if-eqz v1, :cond_0

    .line 163
    .line 164
    invoke-virtual {v1, v4}, Lc5/y;->d(Z)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_0
    const-string v1, "nav"

    .line 169
    .line 170
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v0

    .line 174
    :cond_1
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v0

    .line 178
    :cond_2
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw v0

    .line 182
    :cond_3
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v0

    .line 186
    :cond_4
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw v0

    .line 190
    :cond_5
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw v0

    .line 194
    :cond_6
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw v0

    .line 198
    :cond_7
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw v0

    .line 202
    :cond_8
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw v0

    .line 206
    :cond_9
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw v0

    .line 210
    :cond_a
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw v0

    .line 214
    :cond_b
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw v0

    .line 218
    :cond_c
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw v0

    .line 222
    :cond_d
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw v0

    .line 226
    :cond_e
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    throw v0
.end method

.method public final I()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f050002

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final J()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f050003

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final K(Lx4/m;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->c0:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lm6/s;->S(Ljava/util/Map;Lx4/m;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v2, v0

    .line 8
    check-cast v2, Lw4/l;

    .line 9
    .line 10
    iget-boolean v0, v2, Lw4/l;->d:Z

    .line 11
    .line 12
    iget-object v1, v2, Lw4/l;->b:Landroid/widget/LinearLayout;

    .line 13
    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    iget-boolean v0, v2, Lw4/l;->c:Z

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    const/4 v0, 0x1

    .line 22
    iput-boolean v0, v2, Lw4/l;->d:Z

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, v2, Lw4/l;->e:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 28
    .line 29
    .line 30
    new-instance v3, Landroid/widget/ProgressBar;

    .line 31
    .line 32
    invoke-direct {v3, p0}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 36
    .line 37
    iget v5, p0, Lcom/exotv/net/MainActivity;->k0:I

    .line 38
    .line 39
    iget v6, p0, Lcom/exotv/net/MainActivity;->l0:I

    .line 40
    .line 41
    invoke-direct {v4, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 42
    .line 43
    .line 44
    const/16 v5, 0x11

    .line 45
    .line 46
    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 47
    .line 48
    invoke-virtual {v1, v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/exotv/net/MainActivity;->X()V

    .line 52
    .line 53
    .line 54
    sget-object v1, Lx4/m;->j:Lx4/m;

    .line 55
    .line 56
    if-ne p1, v1, :cond_1

    .line 57
    .line 58
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->a0:Ljava/util/List;

    .line 59
    .line 60
    :goto_0
    move-object v5, v1

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->b0:Ljava/util/List;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :goto_1
    invoke-static {p0}, Landroidx/lifecycle/m0;->e(Landroidx/lifecycle/v;)Landroidx/lifecycle/q;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    new-instance v1, Lw4/t;

    .line 70
    .line 71
    const/4 v6, 0x0

    .line 72
    const/4 v7, 0x0

    .line 73
    move-object v4, p0

    .line 74
    move-object v3, p1

    .line 75
    invoke-direct/range {v1 .. v7}, Lw4/t;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lp6/c;I)V

    .line 76
    .line 77
    .line 78
    const/4 p1, 0x3

    .line 79
    invoke-static {v8, v0, v1, p1}, Li7/x;->k(Li7/u;Lj7/d;Ly6/p;I)Li7/a0;

    .line 80
    .line 81
    .line 82
    :cond_2
    :goto_2
    return-void
.end method

.method public final M()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->m0:Lw4/o;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/16 v3, 0x8

    .line 6
    .line 7
    const-string v4, "b"

    .line 8
    .line 9
    if-eqz v0, :cond_d

    .line 10
    .line 11
    iget-boolean v5, v0, Lw4/o;->c:Z

    .line 12
    .line 13
    iget-object v6, v0, Lw4/o;->b:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v7, p0, Lcom/exotv/net/MainActivity;->n0:Lw4/q;

    .line 16
    .line 17
    iget-object v8, p0, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 18
    .line 19
    if-eq v7, v8, :cond_0

    .line 20
    .line 21
    goto/16 :goto_1

    .line 22
    .line 23
    :cond_0
    iget-object v7, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 24
    .line 25
    if-eqz v7, :cond_c

    .line 26
    .line 27
    iget-object v7, v7, La5/a;->i:Landroid/widget/LinearLayout;

    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    invoke-virtual {v7, v8}, Landroid/view/View;->setVisibility(I)V

    .line 31
    .line 32
    .line 33
    iget-boolean v0, v0, Lw4/o;->a:Z

    .line 34
    .line 35
    if-eqz v0, :cond_5

    .line 36
    .line 37
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 38
    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    iget-object v0, v0, La5/a;->k:Landroid/widget/ProgressBar;

    .line 42
    .line 43
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 47
    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    iget-object v0, v0, La5/a;->l:Landroid/widget/TextView;

    .line 51
    .line 52
    if-eqz v6, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const v5, 0x7f110085

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    const-string v5, "getString(...)"

    .line 63
    .line 64
    invoke-static {v5, v6}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :goto_0
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 71
    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    iget-object v0, v0, La5/a;->j:Landroid/widget/TextView;

    .line 75
    .line 76
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v2}, Lcom/exotv/net/MainActivity;->P(Z)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_2
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v1

    .line 87
    :cond_3
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v1

    .line 91
    :cond_4
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v1

    .line 95
    :cond_5
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 96
    .line 97
    if-eqz v0, :cond_b

    .line 98
    .line 99
    iget-object v0, v0, La5/a;->k:Landroid/widget/ProgressBar;

    .line 100
    .line 101
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 105
    .line 106
    if-eqz v0, :cond_a

    .line 107
    .line 108
    iget-object v0, v0, La5/a;->l:Landroid/widget/TextView;

    .line 109
    .line 110
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 114
    .line 115
    if-eqz v0, :cond_9

    .line 116
    .line 117
    iget-object v0, v0, La5/a;->j:Landroid/widget/TextView;

    .line 118
    .line 119
    if-eqz v5, :cond_6

    .line 120
    .line 121
    move v3, v8

    .line 122
    :cond_6
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Lcom/exotv/net/MainActivity;->J()Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_8

    .line 130
    .line 131
    if-eqz v5, :cond_8

    .line 132
    .line 133
    invoke-virtual {p0, v8}, Lcom/exotv/net/MainActivity;->P(Z)V

    .line 134
    .line 135
    .line 136
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 137
    .line 138
    if-eqz v0, :cond_7

    .line 139
    .line 140
    iget-object v0, v0, La5/a;->j:Landroid/widget/TextView;

    .line 141
    .line 142
    new-instance v1, Lw4/h;

    .line 143
    .line 144
    const/4 v2, 0x0

    .line 145
    invoke-direct {v1, p0, v2}, Lw4/h;-><init>(Lcom/exotv/net/MainActivity;I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_7
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v1

    .line 156
    :cond_8
    invoke-virtual {p0, v2}, Lcom/exotv/net/MainActivity;->P(Z)V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :cond_9
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw v1

    .line 164
    :cond_a
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw v1

    .line 168
    :cond_b
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw v1

    .line 172
    :cond_c
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw v1

    .line 176
    :cond_d
    :goto_1
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 177
    .line 178
    if-eqz v0, :cond_e

    .line 179
    .line 180
    iget-object v0, v0, La5/a;->i:Landroid/widget/LinearLayout;

    .line 181
    .line 182
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0, v2}, Lcom/exotv/net/MainActivity;->P(Z)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_e
    invoke-static {v4}, Lz6/h;->h(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    throw v1
.end method

.method public final O(Lw4/q;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-object p1, p0, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 7
    .line 8
    sget-object v0, Lw4/q;->m:Lw4/q;

    .line 9
    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    iput-object p1, p0, Lcom/exotv/net/MainActivity;->L:Lw4/q;

    .line 13
    .line 14
    :cond_1
    invoke-virtual {p0}, Lcom/exotv/net/MainActivity;->U()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final P(Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/high16 p1, 0x40000

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/high16 p1, 0x60000

    .line 7
    .line 8
    :goto_0
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, v0, La5/a;->d:Landroid/widget/LinearLayout;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const-string p1, "b"

    .line 19
    .line 20
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    throw p1
.end method

.method public final Q(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, v0, La5/a;->g:Landroid/widget/ProgressBar;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/16 p1, 0x8

    .line 12
    .line 13
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    const-string p1, "b"

    .line 18
    .line 19
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    throw p1
.end method

.method public final R(Z)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->Y:Lb5/i;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, v0, Lb5/i;->b:Z

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    move v0, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, v2

    .line 14
    :goto_0
    iget-object v3, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const-string v5, "b"

    .line 18
    .line 19
    if-eqz v3, :cond_e

    .line 20
    .line 21
    iget-object v3, v3, La5/a;->m:Landroid/widget/TextView;

    .line 22
    .line 23
    xor-int/lit8 v6, p1, 0x1

    .line 24
    .line 25
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 26
    .line 27
    .line 28
    iget-object v3, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 29
    .line 30
    if-eqz v3, :cond_d

    .line 31
    .line 32
    iget-object v3, v3, La5/a;->a:Landroid/widget/TextView;

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v1, v2

    .line 40
    :goto_1
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 44
    .line 45
    if-eqz v1, :cond_c

    .line 46
    .line 47
    iget-object v1, v1, La5/a;->m:Landroid/widget/TextView;

    .line 48
    .line 49
    const/high16 v3, 0x3f800000    # 1.0f

    .line 50
    .line 51
    const v6, 0x3f19999a    # 0.6f

    .line 52
    .line 53
    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    move v7, v6

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    move v7, v3

    .line 59
    :goto_2
    invoke-virtual {v1, v7}, Landroid/view/View;->setAlpha(F)V

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 63
    .line 64
    if-eqz v1, :cond_b

    .line 65
    .line 66
    iget-object v1, v1, La5/a;->a:Landroid/widget/TextView;

    .line 67
    .line 68
    if-eqz p1, :cond_3

    .line 69
    .line 70
    move v3, v6

    .line 71
    goto :goto_3

    .line 72
    :cond_3
    if-eqz v0, :cond_4

    .line 73
    .line 74
    const v3, 0x3ecccccd    # 0.4f

    .line 75
    .line 76
    .line 77
    :cond_4
    :goto_3
    invoke-virtual {v1, v3}, Landroid/view/View;->setAlpha(F)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 81
    .line 82
    if-eqz v0, :cond_a

    .line 83
    .line 84
    iget-object v0, v0, La5/a;->p:Landroid/widget/LinearLayout;

    .line 85
    .line 86
    if-eqz p1, :cond_5

    .line 87
    .line 88
    move v1, v2

    .line 89
    goto :goto_4

    .line 90
    :cond_5
    const/16 v1, 0x8

    .line 91
    .line 92
    :goto_4
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 93
    .line 94
    .line 95
    if-eqz p1, :cond_9

    .line 96
    .line 97
    iget-object p1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 98
    .line 99
    if-eqz p1, :cond_8

    .line 100
    .line 101
    iget-object p1, p1, La5/a;->f:Landroid/widget/ProgressBar;

    .line 102
    .line 103
    invoke-virtual {p1, v2}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 107
    .line 108
    if-eqz p1, :cond_7

    .line 109
    .line 110
    iget-object p1, p1, La5/a;->f:Landroid/widget/ProgressBar;

    .line 111
    .line 112
    invoke-virtual {p1, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 113
    .line 114
    .line 115
    iget-object p1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 116
    .line 117
    if-eqz p1, :cond_6

    .line 118
    .line 119
    iget-object p1, p1, La5/a;->e:Landroid/widget/TextView;

    .line 120
    .line 121
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    const v1, 0x7f110044

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_6
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw v4

    .line 144
    :cond_7
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw v4

    .line 148
    :cond_8
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw v4

    .line 152
    :cond_9
    return-void

    .line 153
    :cond_a
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw v4

    .line 157
    :cond_b
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw v4

    .line 161
    :cond_c
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v4

    .line 165
    :cond_d
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw v4

    .line 169
    :cond_e
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw v4
.end method

.method public final S(Ljava/util/List;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->T:Lc5/t;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "channelAdapter"

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    const-string v3, "channels"

    .line 9
    .line 10
    invoke-static {v3, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, Lc5/t;->g:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object p1, v0, Lz2/x;->a:Lz2/y;

    .line 16
    .line 17
    invoke-virtual {p1}, Lz2/y;->b()V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/exotv/net/MainActivity;->T:Lc5/t;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->Z:Lcom/exotv/net/model/Channel;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lc5/t;->g(Lcom/exotv/net/model/Channel;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v1

    .line 34
    :cond_1
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v1
.end method

.method public final T(ZLjava/lang/String;ZLw4/q;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/exotv/net/MainActivity;->G()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    new-instance p1, Lw4/o;

    .line 9
    .line 10
    const/4 p3, 0x1

    .line 11
    invoke-direct {p1, p2, p3, v1}, Lw4/o;-><init>(Ljava/lang/String;ZZ)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    if-eqz p2, :cond_1

    .line 16
    .line 17
    new-instance p1, Lw4/o;

    .line 18
    .line 19
    invoke-direct {p1, p2, v1, p3}, Lw4/o;-><init>(Ljava/lang/String;ZZ)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move-object p1, v0

    .line 24
    :goto_0
    iput-object p1, p0, Lcom/exotv/net/MainActivity;->m0:Lw4/o;

    .line 25
    .line 26
    if-nez p1, :cond_2

    .line 27
    .line 28
    move-object p4, v0

    .line 29
    :cond_2
    iput-object p4, p0, Lcom/exotv/net/MainActivity;->n0:Lw4/q;

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/exotv/net/MainActivity;->M()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/exotv/net/MainActivity;->Z()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final U()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 2
    .line 3
    sget-object v1, Lw4/q;->j:Lw4/q;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v2

    .line 11
    :goto_0
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v1, :cond_f

    .line 15
    .line 16
    iget-object v1, v1, La5/a;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 17
    .line 18
    const/16 v4, 0x8

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    move v5, v2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v5, v4

    .line 25
    :goto_1
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->d0:Landroid/widget/LinearLayout;

    .line 29
    .line 30
    const-string v5, "catalogPage"

    .line 31
    .line 32
    if-eqz v1, :cond_e

    .line 33
    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 37
    .line 38
    sget-object v6, Lw4/q;->m:Lw4/q;

    .line 39
    .line 40
    if-ne v0, v6, :cond_2

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    move v0, v2

    .line 44
    goto :goto_3

    .line 45
    :cond_3
    :goto_2
    move v0, v4

    .line 46
    :goto_3
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->M:Lc5/a1;

    .line 50
    .line 51
    if-eqz v0, :cond_5

    .line 52
    .line 53
    iget-object v0, v0, Lc5/a1;->n:Landroid/widget/LinearLayout;

    .line 54
    .line 55
    if-eqz v0, :cond_5

    .line 56
    .line 57
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 58
    .line 59
    sget-object v6, Lw4/q;->m:Lw4/q;

    .line 60
    .line 61
    if-ne v1, v6, :cond_4

    .line 62
    .line 63
    move v1, v2

    .line 64
    goto :goto_4

    .line 65
    :cond_4
    move v1, v4

    .line 66
    :goto_4
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 67
    .line 68
    .line 69
    :cond_5
    invoke-virtual {p0}, Lcom/exotv/net/MainActivity;->B()Lx4/m;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-eqz v0, :cond_b

    .line 74
    .line 75
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->c0:Ljava/util/HashMap;

    .line 76
    .line 77
    invoke-static {v1, v0}, Lm6/s;->S(Ljava/util/Map;Lx4/m;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    check-cast v6, Lw4/l;

    .line 82
    .line 83
    iget-object v7, v6, Lw4/l;->b:Landroid/widget/LinearLayout;

    .line 84
    .line 85
    iput-object v7, p0, Lcom/exotv/net/MainActivity;->f0:Landroid/widget/LinearLayout;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    if-eqz v7, :cond_7

    .line 100
    .line 101
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    check-cast v7, Ljava/util/Map$Entry;

    .line 106
    .line 107
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    check-cast v8, Lx4/m;

    .line 112
    .line 113
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    check-cast v7, Lw4/l;

    .line 118
    .line 119
    iget-object v7, v7, Lw4/l;->a:Landroid/widget/ScrollView;

    .line 120
    .line 121
    if-ne v8, v0, :cond_6

    .line 122
    .line 123
    move v8, v2

    .line 124
    goto :goto_6

    .line 125
    :cond_6
    move v8, v4

    .line 126
    :goto_6
    invoke-virtual {v7, v8}, Landroid/view/View;->setVisibility(I)V

    .line 127
    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_7
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->d0:Landroid/widget/LinearLayout;

    .line 131
    .line 132
    if-eqz v1, :cond_a

    .line 133
    .line 134
    sget-object v2, Lx4/m;->j:Lx4/m;

    .line 135
    .line 136
    if-ne v0, v2, :cond_8

    .line 137
    .line 138
    const v2, 0x7f08007c

    .line 139
    .line 140
    .line 141
    goto :goto_7

    .line 142
    :cond_8
    const v2, 0x7f080089

    .line 143
    .line 144
    .line 145
    :goto_7
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 146
    .line 147
    .line 148
    iget-boolean v1, v6, Lw4/l;->c:Z

    .line 149
    .line 150
    if-nez v1, :cond_9

    .line 151
    .line 152
    iget-boolean v1, v6, Lw4/l;->d:Z

    .line 153
    .line 154
    if-nez v1, :cond_9

    .line 155
    .line 156
    invoke-virtual {p0, v0}, Lcom/exotv/net/MainActivity;->K(Lx4/m;)V

    .line 157
    .line 158
    .line 159
    :cond_9
    invoke-virtual {p0}, Lcom/exotv/net/MainActivity;->X()V

    .line 160
    .line 161
    .line 162
    goto :goto_8

    .line 163
    :cond_a
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw v3

    .line 167
    :cond_b
    :goto_8
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 168
    .line 169
    sget-object v1, Lw4/q;->j:Lw4/q;

    .line 170
    .line 171
    if-ne v0, v1, :cond_c

    .line 172
    .line 173
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->U:Ljava/util/List;

    .line 174
    .line 175
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-eqz v0, :cond_c

    .line 180
    .line 181
    iget-boolean v0, p0, Lcom/exotv/net/MainActivity;->X:Z

    .line 182
    .line 183
    if-nez v0, :cond_c

    .line 184
    .line 185
    const/4 v0, 0x7

    .line 186
    invoke-static {p0, v0}, Lcom/exotv/net/MainActivity;->L(Lcom/exotv/net/MainActivity;I)V

    .line 187
    .line 188
    .line 189
    :cond_c
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 190
    .line 191
    if-eqz v0, :cond_d

    .line 192
    .line 193
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 194
    .line 195
    invoke-static {v1}, Lcom/exotv/net/MainActivity;->Y(Lw4/q;)Lc5/w;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-virtual {v0, v1}, Lc5/y;->e(Lc5/w;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0}, Lcom/exotv/net/MainActivity;->M()V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0}, Lcom/exotv/net/MainActivity;->Z()V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :cond_d
    const-string v0, "nav"

    .line 210
    .line 211
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw v3

    .line 215
    :cond_e
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    throw v3

    .line 219
    :cond_f
    const-string v0, "b"

    .line 220
    .line 221
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw v3
.end method

.method public final V(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "b"

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, v0, La5/a;->n:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, La5/a;->n:Landroid/widget/TextView;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v1

    .line 28
    :cond_1
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v1
.end method

.method public final X()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/exotv/net/MainActivity;->B()Lx4/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->c0:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lm6/s;->S(Ljava/util/Map;Lx4/m;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lw4/l;

    .line 15
    .line 16
    iget-object v0, v0, Lw4/l;->e:Ljava/lang/String;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    const-string v0, ""

    .line 21
    .line 22
    :cond_1
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->e0:Landroid/widget/TextView;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    const-string v3, "status"

    .line 26
    .line 27
    if-eqz v1, :cond_4

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->e0:Landroid/widget/TextView;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-static {v0}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    const/16 v0, 0x8

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const/4 v0, 0x0

    .line 46
    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_3
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v2

    .line 54
    :cond_4
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v2
.end method

.method public final Z()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->N:La1/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->m0:Lw4/o;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->n0:Lw4/q;

    .line 13
    .line 14
    iget-object v4, p0, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 15
    .line 16
    if-ne v1, v4, :cond_1

    .line 17
    .line 18
    move v1, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move v1, v3

    .line 21
    :goto_0
    iget-object v4, p0, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 22
    .line 23
    sget-object v5, Lw4/q;->m:Lw4/q;

    .line 24
    .line 25
    if-ne v4, v5, :cond_2

    .line 26
    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->Y:Lb5/i;

    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    iget-boolean v1, p0, Lcom/exotv/net/MainActivity;->O:Z

    .line 34
    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    sget-boolean v1, La1/e;->m:Z

    .line 38
    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move v2, v3

    .line 43
    :goto_1
    iget-object v0, v0, La1/e;->l:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Landroid/widget/LinearLayout;

    .line 46
    .line 47
    if-eqz v2, :cond_3

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_3
    const/16 v3, 0x8

    .line 51
    .line 52
    :goto_2
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "event"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v1, v2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/exotv/net/MainActivity;->I()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_38

    .line 15
    .line 16
    invoke-virtual {v2}, Landroid/view/KeyEvent;->getAction()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    goto/16 :goto_1c

    .line 23
    .line 24
    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    invoke-super/range {p0 .. p1}, Lh/i;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    return v1

    .line 35
    :cond_1
    invoke-virtual {v2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/16 v4, 0x15

    .line 40
    .line 41
    const-string v5, "nav"

    .line 42
    .line 43
    const/4 v6, 0x1

    .line 44
    const/4 v7, 0x0

    .line 45
    if-ne v3, v4, :cond_3

    .line 46
    .line 47
    iget-object v3, v0, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 48
    .line 49
    if-eqz v3, :cond_2

    .line 50
    .line 51
    iget-object v3, v3, Lc5/y;->n:Landroid/widget/LinearLayout;

    .line 52
    .line 53
    invoke-static {v1, v3}, Lcom/exotv/net/MainActivity;->H(Landroid/view/View;Landroid/view/ViewGroup;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    goto/16 :goto_1b

    .line 60
    .line 61
    :cond_2
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v7

    .line 65
    :cond_3
    invoke-virtual {v2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    const/4 v8, -0x1

    .line 70
    const/16 v9, 0x14

    .line 71
    .line 72
    const/16 v10, 0x13

    .line 73
    .line 74
    const/4 v11, 0x0

    .line 75
    if-eq v3, v10, :cond_5

    .line 76
    .line 77
    invoke-virtual {v2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-ne v3, v9, :cond_4

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    :goto_0
    move-object/from16 v17, v7

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_5
    :goto_1
    iget-object v3, v0, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 88
    .line 89
    if-eqz v3, :cond_37

    .line 90
    .line 91
    iget-object v3, v3, Lc5/y;->n:Landroid/widget/LinearLayout;

    .line 92
    .line 93
    invoke-static {v1, v3}, Lcom/exotv/net/MainActivity;->H(Landroid/view/View;Landroid/view/ViewGroup;)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_4

    .line 98
    .line 99
    iget-object v3, v0, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 100
    .line 101
    if-eqz v3, :cond_c

    .line 102
    .line 103
    invoke-virtual {v2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 104
    .line 105
    .line 106
    move-result v12

    .line 107
    iget-object v13, v3, Lc5/y;->f:Ljava/util/ArrayList;

    .line 108
    .line 109
    iget-boolean v3, v3, Lc5/y;->g:Z

    .line 110
    .line 111
    if-nez v3, :cond_6

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_6
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    move v14, v11

    .line 119
    move v15, v14

    .line 120
    :goto_2
    if-ge v15, v3, :cond_8

    .line 121
    .line 122
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v16

    .line 126
    add-int/lit8 v15, v15, 0x1

    .line 127
    .line 128
    move-object/from16 v17, v7

    .line 129
    .line 130
    move-object/from16 v7, v16

    .line 131
    .line 132
    check-cast v7, Lc5/x;

    .line 133
    .line 134
    iget-object v7, v7, Lc5/x;->a:Landroid/widget/LinearLayout;

    .line 135
    .line 136
    if-ne v7, v1, :cond_7

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_7
    add-int/lit8 v14, v14, 0x1

    .line 140
    .line 141
    move-object/from16 v7, v17

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_8
    move-object/from16 v17, v7

    .line 145
    .line 146
    move v14, v8

    .line 147
    :goto_3
    if-gez v14, :cond_9

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_9
    if-eq v12, v10, :cond_b

    .line 151
    .line 152
    if-eq v12, v9, :cond_a

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_a
    invoke-static {v13}, Lm6/i;->s0(Ljava/util/List;)I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-ne v14, v3, :cond_d

    .line 160
    .line 161
    goto/16 :goto_1b

    .line 162
    .line 163
    :cond_b
    if-nez v14, :cond_d

    .line 164
    .line 165
    goto/16 :goto_1b

    .line 166
    .line 167
    :cond_c
    move-object/from16 v17, v7

    .line 168
    .line 169
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw v17

    .line 173
    :cond_d
    :goto_4
    iget-object v3, v0, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 174
    .line 175
    sget-object v7, Lw4/q;->j:Lw4/q;

    .line 176
    .line 177
    if-ne v3, v7, :cond_e

    .line 178
    .line 179
    invoke-super/range {p0 .. p1}, Lh/i;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    return v1

    .line 184
    :cond_e
    invoke-virtual {v2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    const/16 v7, 0x16

    .line 189
    .line 190
    if-eq v3, v4, :cond_10

    .line 191
    .line 192
    invoke-virtual {v2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    if-ne v3, v7, :cond_f

    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_f
    move v3, v11

    .line 200
    goto :goto_6

    .line 201
    :cond_10
    :goto_5
    move v3, v6

    .line 202
    :goto_6
    if-eqz v3, :cond_11

    .line 203
    .line 204
    invoke-static {v1}, Lcom/exotv/net/MainActivity;->D(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    .line 205
    .line 206
    .line 207
    move-result-object v9

    .line 208
    goto :goto_7

    .line 209
    :cond_11
    move-object/from16 v9, v17

    .line 210
    .line 211
    :goto_7
    if-eqz v9, :cond_14

    .line 212
    .line 213
    sget-object v10, Lc5/r0;->a:Lc5/r0;

    .line 214
    .line 215
    invoke-virtual {v2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 216
    .line 217
    .line 218
    move-result v10

    .line 219
    instance-of v12, v9, Lc5/g0;

    .line 220
    .line 221
    if-eqz v12, :cond_12

    .line 222
    .line 223
    check-cast v9, Lc5/g0;

    .line 224
    .line 225
    goto :goto_8

    .line 226
    :cond_12
    move-object/from16 v9, v17

    .line 227
    .line 228
    :goto_8
    if-eqz v9, :cond_13

    .line 229
    .line 230
    invoke-virtual {v9, v1, v10}, Lc5/g0;->m0(Landroid/view/View;I)Z

    .line 231
    .line 232
    .line 233
    move-result v9

    .line 234
    goto :goto_9

    .line 235
    :cond_13
    move v9, v11

    .line 236
    :goto_9
    if-eqz v9, :cond_14

    .line 237
    .line 238
    goto/16 :goto_1b

    .line 239
    .line 240
    :cond_14
    if-eqz v3, :cond_15

    .line 241
    .line 242
    invoke-static {v1}, Lcom/exotv/net/MainActivity;->W(Landroid/view/View;)Landroid/widget/HorizontalScrollView;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    goto :goto_a

    .line 247
    :cond_15
    move-object/from16 v3, v17

    .line 248
    .line 249
    :goto_a
    if-eqz v3, :cond_20

    .line 250
    .line 251
    sget-object v9, Lc5/r0;->a:Lc5/r0;

    .line 252
    .line 253
    invoke-virtual {v2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 254
    .line 255
    .line 256
    move-result v9

    .line 257
    if-eq v9, v4, :cond_16

    .line 258
    .line 259
    if-eq v9, v7, :cond_16

    .line 260
    .line 261
    :goto_b
    move v3, v11

    .line 262
    goto :goto_10

    .line 263
    :cond_16
    invoke-virtual {v3, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    instance-of v7, v3, Landroid/view/ViewGroup;

    .line 268
    .line 269
    if-eqz v7, :cond_17

    .line 270
    .line 271
    check-cast v3, Landroid/view/ViewGroup;

    .line 272
    .line 273
    goto :goto_c

    .line 274
    :cond_17
    move-object/from16 v3, v17

    .line 275
    .line 276
    :goto_c
    if-nez v3, :cond_18

    .line 277
    .line 278
    goto :goto_b

    .line 279
    :cond_18
    move-object v7, v1

    .line 280
    :cond_19
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 281
    .line 282
    .line 283
    move-result-object v10

    .line 284
    if-eq v10, v3, :cond_1b

    .line 285
    .line 286
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    instance-of v10, v7, Landroid/view/View;

    .line 291
    .line 292
    if-eqz v10, :cond_1a

    .line 293
    .line 294
    check-cast v7, Landroid/view/View;

    .line 295
    .line 296
    goto :goto_d

    .line 297
    :cond_1a
    move-object/from16 v7, v17

    .line 298
    .line 299
    :goto_d
    if-nez v7, :cond_19

    .line 300
    .line 301
    goto :goto_b

    .line 302
    :cond_1b
    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 303
    .line 304
    .line 305
    move-result v7

    .line 306
    if-ne v7, v8, :cond_1c

    .line 307
    .line 308
    goto :goto_b

    .line 309
    :cond_1c
    if-ne v9, v4, :cond_1d

    .line 310
    .line 311
    sub-int/2addr v7, v6

    .line 312
    goto :goto_e

    .line 313
    :cond_1d
    add-int/2addr v7, v6

    .line 314
    :goto_e
    if-gez v7, :cond_1e

    .line 315
    .line 316
    goto :goto_b

    .line 317
    :cond_1e
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    if-lt v7, v4, :cond_1f

    .line 322
    .line 323
    :goto_f
    move v3, v6

    .line 324
    goto :goto_10

    .line 325
    :cond_1f
    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    invoke-virtual {v3}, Landroid/view/View;->requestFocus()Z

    .line 330
    .line 331
    .line 332
    goto :goto_f

    .line 333
    :goto_10
    if-eqz v3, :cond_20

    .line 334
    .line 335
    goto/16 :goto_1b

    .line 336
    .line 337
    :cond_20
    invoke-virtual {v2}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    if-nez v3, :cond_36

    .line 342
    .line 343
    invoke-virtual {v2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 344
    .line 345
    .line 346
    move-result v3

    .line 347
    const/16 v4, 0x21

    .line 348
    .line 349
    const/16 v8, 0x42

    .line 350
    .line 351
    packed-switch v3, :pswitch_data_0

    .line 352
    .line 353
    .line 354
    invoke-super/range {p0 .. p1}, Lh/i;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 355
    .line 356
    .line 357
    move-result v1

    .line 358
    return v1

    .line 359
    :pswitch_0
    move v3, v8

    .line 360
    goto :goto_11

    .line 361
    :pswitch_1
    const/16 v3, 0x11

    .line 362
    .line 363
    goto :goto_11

    .line 364
    :pswitch_2
    const/16 v3, 0x82

    .line 365
    .line 366
    goto :goto_11

    .line 367
    :pswitch_3
    move v3, v4

    .line 368
    :goto_11
    invoke-virtual {v1, v3}, Landroid/view/View;->focusSearch(I)Landroid/view/View;

    .line 369
    .line 370
    .line 371
    move-result-object v9

    .line 372
    if-eqz v9, :cond_36

    .line 373
    .line 374
    if-eq v9, v1, :cond_36

    .line 375
    .line 376
    invoke-static {v1}, Lcom/exotv/net/MainActivity;->D(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    .line 377
    .line 378
    .line 379
    move-result-object v10

    .line 380
    invoke-static {v1}, Lcom/exotv/net/MainActivity;->W(Landroid/view/View;)Landroid/widget/HorizontalScrollView;

    .line 381
    .line 382
    .line 383
    move-result-object v12

    .line 384
    const/16 v13, 0xc

    .line 385
    .line 386
    const-string v14, "catalogContent"

    .line 387
    .line 388
    if-ne v3, v8, :cond_26

    .line 389
    .line 390
    iget-object v15, v0, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 391
    .line 392
    if-eqz v15, :cond_25

    .line 393
    .line 394
    iget-object v5, v15, Lc5/y;->n:Landroid/widget/LinearLayout;

    .line 395
    .line 396
    invoke-static {v1, v5}, Lcom/exotv/net/MainActivity;->H(Landroid/view/View;Landroid/view/ViewGroup;)Z

    .line 397
    .line 398
    .line 399
    move-result v5

    .line 400
    if-eqz v5, :cond_26

    .line 401
    .line 402
    iget-object v5, v0, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 403
    .line 404
    sget-object v15, Lw4/q;->m:Lw4/q;

    .line 405
    .line 406
    if-ne v5, v15, :cond_22

    .line 407
    .line 408
    iget-object v1, v0, Lcom/exotv/net/MainActivity;->M:Lc5/a1;

    .line 409
    .line 410
    if-eqz v1, :cond_35

    .line 411
    .line 412
    iget-object v1, v1, Lc5/a1;->g:Landroid/widget/EditText;

    .line 413
    .line 414
    if-eqz v1, :cond_21

    .line 415
    .line 416
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 417
    .line 418
    .line 419
    move-result v11

    .line 420
    goto/16 :goto_1a

    .line 421
    .line 422
    :cond_21
    const-string v1, "input"

    .line 423
    .line 424
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    throw v17

    .line 428
    :cond_22
    iget-object v5, v0, Lcom/exotv/net/MainActivity;->f0:Landroid/widget/LinearLayout;

    .line 429
    .line 430
    if-eqz v5, :cond_24

    .line 431
    .line 432
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    .line 433
    .line 434
    .line 435
    move-result v5

    .line 436
    invoke-static {v11, v5}, Lcom/bumptech/glide/c;->g0(II)Le7/c;

    .line 437
    .line 438
    .line 439
    move-result-object v5

    .line 440
    const-string v15, "<this>"

    .line 441
    .line 442
    invoke-static {v15, v5}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    new-instance v15, Lg7/g;

    .line 446
    .line 447
    const/4 v7, 0x2

    .line 448
    invoke-direct {v15, v7, v5}, Lg7/g;-><init>(ILjava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    new-instance v5, Lw4/e;

    .line 452
    .line 453
    invoke-direct {v5, v0, v11}, Lw4/e;-><init>(Lcom/exotv/net/MainActivity;I)V

    .line 454
    .line 455
    .line 456
    new-instance v7, Lg7/e;

    .line 457
    .line 458
    invoke-direct {v7, v15, v5, v6}, Lg7/e;-><init>(Lg7/h;Ly6/l;I)V

    .line 459
    .line 460
    .line 461
    new-instance v5, Lg7/l;

    .line 462
    .line 463
    invoke-direct {v5, v6}, Lg7/l;-><init>(I)V

    .line 464
    .line 465
    .line 466
    new-instance v15, Lg7/e;

    .line 467
    .line 468
    invoke-direct {v15, v7, v5, v11}, Lg7/e;-><init>(Lg7/h;Ly6/l;I)V

    .line 469
    .line 470
    .line 471
    new-instance v5, Lg7/d;

    .line 472
    .line 473
    invoke-direct {v5, v15}, Lg7/d;-><init>(Lg7/e;)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v5}, Lg7/d;->hasNext()Z

    .line 477
    .line 478
    .line 479
    move-result v7

    .line 480
    if-nez v7, :cond_23

    .line 481
    .line 482
    move-object/from16 v5, v17

    .line 483
    .line 484
    goto :goto_12

    .line 485
    :cond_23
    invoke-virtual {v5}, Lg7/d;->next()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v5

    .line 489
    :goto_12
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    .line 490
    .line 491
    if-eqz v5, :cond_26

    .line 492
    .line 493
    new-instance v1, Landroidx/media3/exoplayer/audio/i;

    .line 494
    .line 495
    invoke-direct {v1, v5, v13, v0}, Landroidx/media3/exoplayer/audio/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v5, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 499
    .line 500
    .line 501
    :goto_13
    move v11, v6

    .line 502
    goto/16 :goto_1a

    .line 503
    .line 504
    :cond_24
    invoke-static {v14}, Lz6/h;->h(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    throw v17

    .line 508
    :cond_25
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    throw v17

    .line 512
    :cond_26
    if-ne v3, v8, :cond_27

    .line 513
    .line 514
    if-eqz v12, :cond_27

    .line 515
    .line 516
    invoke-static {v9, v12}, Lcom/exotv/net/MainActivity;->H(Landroid/view/View;Landroid/view/ViewGroup;)Z

    .line 517
    .line 518
    .line 519
    move-result v5

    .line 520
    if-nez v5, :cond_27

    .line 521
    .line 522
    :goto_14
    goto :goto_13

    .line 523
    :cond_27
    if-eq v3, v4, :cond_29

    .line 524
    .line 525
    const/16 v5, 0x82

    .line 526
    .line 527
    if-ne v3, v5, :cond_28

    .line 528
    .line 529
    goto :goto_15

    .line 530
    :cond_28
    move v5, v11

    .line 531
    goto :goto_16

    .line 532
    :cond_29
    :goto_15
    move v5, v6

    .line 533
    :goto_16
    invoke-static {v9}, Lcom/exotv/net/MainActivity;->D(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    .line 534
    .line 535
    .line 536
    move-result-object v7

    .line 537
    if-eqz v7, :cond_2a

    .line 538
    .line 539
    if-eq v7, v10, :cond_2a

    .line 540
    .line 541
    new-instance v1, Landroidx/media3/exoplayer/audio/i;

    .line 542
    .line 543
    invoke-direct {v1, v7, v13, v0}, Landroidx/media3/exoplayer/audio/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v7, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 547
    .line 548
    .line 549
    goto :goto_13

    .line 550
    :cond_2a
    if-eqz v5, :cond_34

    .line 551
    .line 552
    if-eqz v10, :cond_34

    .line 553
    .line 554
    move-object v7, v1

    .line 555
    :goto_17
    if-eqz v7, :cond_2b

    .line 556
    .line 557
    iget-object v8, v0, Lcom/exotv/net/MainActivity;->f0:Landroid/widget/LinearLayout;

    .line 558
    .line 559
    if-eqz v8, :cond_33

    .line 560
    .line 561
    if-eq v7, v8, :cond_2b

    .line 562
    .line 563
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 564
    .line 565
    .line 566
    move-result-object v8

    .line 567
    iget-object v10, v0, Lcom/exotv/net/MainActivity;->f0:Landroid/widget/LinearLayout;

    .line 568
    .line 569
    if-eqz v10, :cond_32

    .line 570
    .line 571
    if-ne v8, v10, :cond_30

    .line 572
    .line 573
    invoke-virtual {v10, v7}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 574
    .line 575
    .line 576
    move-result v7

    .line 577
    if-eq v3, v4, :cond_2d

    .line 578
    .line 579
    const/16 v10, 0x82

    .line 580
    .line 581
    if-eq v3, v10, :cond_2c

    .line 582
    .line 583
    :cond_2b
    move-object/from16 v7, v17

    .line 584
    .line 585
    goto :goto_19

    .line 586
    :cond_2c
    add-int/2addr v7, v6

    .line 587
    goto :goto_18

    .line 588
    :cond_2d
    sub-int/2addr v7, v6

    .line 589
    :goto_18
    if-ltz v7, :cond_2b

    .line 590
    .line 591
    iget-object v4, v0, Lcom/exotv/net/MainActivity;->f0:Landroid/widget/LinearLayout;

    .line 592
    .line 593
    if-eqz v4, :cond_2f

    .line 594
    .line 595
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    .line 596
    .line 597
    .line 598
    move-result v4

    .line 599
    if-ge v7, v4, :cond_2b

    .line 600
    .line 601
    iget-object v4, v0, Lcom/exotv/net/MainActivity;->f0:Landroid/widget/LinearLayout;

    .line 602
    .line 603
    if-eqz v4, :cond_2e

    .line 604
    .line 605
    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 606
    .line 607
    .line 608
    move-result-object v4

    .line 609
    invoke-static {v4}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v0, v4, v1, v3}, Lcom/exotv/net/MainActivity;->v(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;

    .line 613
    .line 614
    .line 615
    move-result-object v7

    .line 616
    goto :goto_19

    .line 617
    :cond_2e
    invoke-static {v14}, Lz6/h;->h(Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    throw v17

    .line 621
    :cond_2f
    invoke-static {v14}, Lz6/h;->h(Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    throw v17

    .line 625
    :cond_30
    const/16 v10, 0x82

    .line 626
    .line 627
    instance-of v7, v8, Landroid/view/View;

    .line 628
    .line 629
    if-eqz v7, :cond_31

    .line 630
    .line 631
    check-cast v8, Landroid/view/View;

    .line 632
    .line 633
    move-object v7, v8

    .line 634
    goto :goto_17

    .line 635
    :cond_31
    move-object/from16 v7, v17

    .line 636
    .line 637
    goto :goto_17

    .line 638
    :cond_32
    invoke-static {v14}, Lz6/h;->h(Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    throw v17

    .line 642
    :cond_33
    invoke-static {v14}, Lz6/h;->h(Ljava/lang/String;)V

    .line 643
    .line 644
    .line 645
    throw v17

    .line 646
    :goto_19
    if-eqz v7, :cond_34

    .line 647
    .line 648
    invoke-virtual {v7, v3}, Landroid/view/View;->requestFocus(I)Z

    .line 649
    .line 650
    .line 651
    move-result v4

    .line 652
    if-eqz v4, :cond_34

    .line 653
    .line 654
    goto/16 :goto_14

    .line 655
    .line 656
    :cond_34
    if-eqz v5, :cond_35

    .line 657
    .line 658
    invoke-static {v9}, Lcom/exotv/net/MainActivity;->W(Landroid/view/View;)Landroid/widget/HorizontalScrollView;

    .line 659
    .line 660
    .line 661
    move-result-object v4

    .line 662
    if-eqz v4, :cond_35

    .line 663
    .line 664
    invoke-static {v1}, Lcom/exotv/net/MainActivity;->W(Landroid/view/View;)Landroid/widget/HorizontalScrollView;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    if-eq v4, v1, :cond_35

    .line 669
    .line 670
    invoke-static {v4}, Lcom/exotv/net/MainActivity;->N(Landroid/widget/HorizontalScrollView;)Landroid/view/View;

    .line 671
    .line 672
    .line 673
    move-result-object v1

    .line 674
    if-eqz v1, :cond_35

    .line 675
    .line 676
    invoke-virtual {v1, v3}, Landroid/view/View;->requestFocus(I)Z

    .line 677
    .line 678
    .line 679
    move-result v1

    .line 680
    if-eqz v1, :cond_35

    .line 681
    .line 682
    goto/16 :goto_14

    .line 683
    .line 684
    :cond_35
    :goto_1a
    if-eqz v11, :cond_36

    .line 685
    .line 686
    :goto_1b
    return v6

    .line 687
    :cond_36
    invoke-super/range {p0 .. p1}, Lh/i;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 688
    .line 689
    .line 690
    move-result v1

    .line 691
    return v1

    .line 692
    :cond_37
    move-object/from16 v17, v7

    .line 693
    .line 694
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 695
    .line 696
    .line 697
    throw v17

    .line 698
    :cond_38
    :goto_1c
    invoke-super/range {p0 .. p1}, Lh/i;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 699
    .line 700
    .line 701
    move-result v1

    .line 702
    return v1

    .line 703
    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const v1, 0x7f1202d4

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Lh/i;->setTheme(I)V

    .line 7
    .line 8
    .line 9
    invoke-super/range {p0 .. p1}, Lh/i;->onCreate(Landroid/os/Bundle;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/4 v3, 0x2

    .line 25
    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->rotationAnimation:I

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const v2, 0x7f0d001d

    .line 35
    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    invoke-virtual {v1, v2, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const v2, 0x7f0a007c

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v2}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    move-object v8, v6

    .line 51
    check-cast v8, Landroid/widget/TextView;

    .line 52
    .line 53
    if-eqz v8, :cond_3a

    .line 54
    .line 55
    const v2, 0x7f0a0080

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v2}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    move-object v9, v6

    .line 63
    check-cast v9, Landroidx/recyclerview/widget/RecyclerView;

    .line 64
    .line 65
    if-eqz v9, :cond_3a

    .line 66
    .line 67
    const v2, 0x7f0a008c

    .line 68
    .line 69
    .line 70
    invoke-static {v1, v2}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    move-object v10, v6

    .line 75
    check-cast v10, Landroidx/recyclerview/widget/RecyclerView;

    .line 76
    .line 77
    if-eqz v10, :cond_3a

    .line 78
    .line 79
    const v2, 0x7f0a00a2

    .line 80
    .line 81
    .line 82
    invoke-static {v1, v2}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    move-object v11, v6

    .line 87
    check-cast v11, Landroid/widget/LinearLayout;

    .line 88
    .line 89
    if-eqz v11, :cond_3a

    .line 90
    .line 91
    const v2, 0x7f0a00c4

    .line 92
    .line 93
    .line 94
    invoke-static {v1, v2}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    move-object v12, v6

    .line 99
    check-cast v12, Landroid/widget/TextView;

    .line 100
    .line 101
    if-eqz v12, :cond_3a

    .line 102
    .line 103
    const v2, 0x7f0a00c5

    .line 104
    .line 105
    .line 106
    invoke-static {v1, v2}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    move-object v13, v6

    .line 111
    check-cast v13, Landroid/widget/ProgressBar;

    .line 112
    .line 113
    if-eqz v13, :cond_3a

    .line 114
    .line 115
    const v2, 0x7f0a0157

    .line 116
    .line 117
    .line 118
    invoke-static {v1, v2}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    move-object v14, v6

    .line 123
    check-cast v14, Landroid/widget/ProgressBar;

    .line 124
    .line 125
    if-eqz v14, :cond_3a

    .line 126
    .line 127
    move-object v15, v1

    .line 128
    check-cast v15, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 129
    .line 130
    const v2, 0x7f0a022f

    .line 131
    .line 132
    .line 133
    invoke-static {v1, v2}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    move-object/from16 v16, v6

    .line 138
    .line 139
    check-cast v16, Landroid/widget/LinearLayout;

    .line 140
    .line 141
    if-eqz v16, :cond_3a

    .line 142
    .line 143
    const v2, 0x7f0a0230

    .line 144
    .line 145
    .line 146
    invoke-static {v1, v2}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    move-object/from16 v17, v6

    .line 151
    .line 152
    check-cast v17, Landroid/widget/TextView;

    .line 153
    .line 154
    if-eqz v17, :cond_3a

    .line 155
    .line 156
    const v2, 0x7f0a0231

    .line 157
    .line 158
    .line 159
    invoke-static {v1, v2}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    move-object/from16 v18, v6

    .line 164
    .line 165
    check-cast v18, Landroid/widget/ProgressBar;

    .line 166
    .line 167
    if-eqz v18, :cond_3a

    .line 168
    .line 169
    const v2, 0x7f0a0232

    .line 170
    .line 171
    .line 172
    invoke-static {v1, v2}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    move-object/from16 v19, v6

    .line 177
    .line 178
    check-cast v19, Landroid/widget/TextView;

    .line 179
    .line 180
    if-eqz v19, :cond_3a

    .line 181
    .line 182
    const v2, 0x7f0a027e

    .line 183
    .line 184
    .line 185
    invoke-static {v1, v2}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    move-object/from16 v20, v6

    .line 190
    .line 191
    check-cast v20, Landroid/widget/TextView;

    .line 192
    .line 193
    if-eqz v20, :cond_3a

    .line 194
    .line 195
    const v2, 0x7f0a027f

    .line 196
    .line 197
    .line 198
    invoke-static {v1, v2}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    move-object/from16 v21, v6

    .line 203
    .line 204
    check-cast v21, Landroid/widget/TextView;

    .line 205
    .line 206
    if-eqz v21, :cond_3a

    .line 207
    .line 208
    const v2, 0x7f0a0280

    .line 209
    .line 210
    .line 211
    invoke-static {v1, v2}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    move-object/from16 v22, v6

    .line 216
    .line 217
    check-cast v22, Landroid/widget/TextView;

    .line 218
    .line 219
    if-eqz v22, :cond_3a

    .line 220
    .line 221
    const v2, 0x7f0a0281

    .line 222
    .line 223
    .line 224
    invoke-static {v1, v2}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    move-object/from16 v23, v6

    .line 229
    .line 230
    check-cast v23, Landroid/widget/LinearLayout;

    .line 231
    .line 232
    if-eqz v23, :cond_3a

    .line 233
    .line 234
    const v2, 0x7f0a0282

    .line 235
    .line 236
    .line 237
    invoke-static {v1, v2}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    move-object/from16 v24, v6

    .line 242
    .line 243
    check-cast v24, Landroid/widget/TextView;

    .line 244
    .line 245
    if-eqz v24, :cond_3a

    .line 246
    .line 247
    new-instance v7, La5/a;

    .line 248
    .line 249
    invoke-direct/range {v7 .. v24}, La5/a;-><init>(Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/ProgressBar;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/TextView;)V

    .line 250
    .line 251
    .line 252
    iput-object v7, v0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 253
    .line 254
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-static {v1, v5}, Landroid/support/v4/media/session/b;->G(Landroid/view/Window;Z)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0}, Lcom/exotv/net/MainActivity;->J()Z

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    const/4 v2, 0x4

    .line 266
    const/4 v6, 0x1

    .line 267
    if-eqz v1, :cond_0

    .line 268
    .line 269
    invoke-virtual {v0, v5}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 270
    .line 271
    .line 272
    goto :goto_1

    .line 273
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    const v7, 0x7f050002

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    if-eqz v1, :cond_1

    .line 285
    .line 286
    move v1, v2

    .line 287
    goto :goto_0

    .line 288
    :cond_1
    move v1, v6

    .line 289
    :goto_0
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 290
    .line 291
    .line 292
    :goto_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 293
    .line 294
    const/16 v7, 0x1c

    .line 295
    .line 296
    if-lt v1, v7, :cond_2

    .line 297
    .line 298
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 303
    .line 304
    .line 305
    move-result-object v7

    .line 306
    invoke-virtual {v7}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 307
    .line 308
    .line 309
    move-result-object v7

    .line 310
    invoke-static {v7, v6}, Ln0/b;->c(Landroid/view/WindowManager$LayoutParams;I)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v1, v7}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 314
    .line 315
    .line 316
    :cond_2
    new-instance v1, Ll/o;

    .line 317
    .line 318
    invoke-direct {v1, v0}, Ll/o;-><init>(Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    iput-object v1, v0, Lcom/exotv/net/MainActivity;->Q:Ll/o;

    .line 322
    .line 323
    new-instance v1, Lc5/o;

    .line 324
    .line 325
    new-instance v7, Lw4/e;

    .line 326
    .line 327
    const/4 v8, 0x3

    .line 328
    invoke-direct {v7, v0, v8}, Lw4/e;-><init>(Lcom/exotv/net/MainActivity;I)V

    .line 329
    .line 330
    .line 331
    new-instance v9, Lw4/g;

    .line 332
    .line 333
    invoke-direct {v9, v0, v3}, Lw4/g;-><init>(Lcom/exotv/net/MainActivity;I)V

    .line 334
    .line 335
    .line 336
    new-instance v10, Lw4/g;

    .line 337
    .line 338
    invoke-direct {v10, v0, v8}, Lw4/g;-><init>(Lcom/exotv/net/MainActivity;I)V

    .line 339
    .line 340
    .line 341
    invoke-direct {v1, v7, v9, v10}, Lc5/o;-><init>(Lw4/e;Lw4/g;Lw4/g;)V

    .line 342
    .line 343
    .line 344
    iput-object v1, v0, Lcom/exotv/net/MainActivity;->S:Lc5/o;

    .line 345
    .line 346
    new-instance v1, Lc5/t;

    .line 347
    .line 348
    new-instance v7, Lw4/e;

    .line 349
    .line 350
    invoke-direct {v7, v0, v2}, Lw4/e;-><init>(Lcom/exotv/net/MainActivity;I)V

    .line 351
    .line 352
    .line 353
    new-instance v9, Lw4/g;

    .line 354
    .line 355
    invoke-direct {v9, v0, v2}, Lw4/g;-><init>(Lcom/exotv/net/MainActivity;I)V

    .line 356
    .line 357
    .line 358
    invoke-direct {v1, v7, v9}, Lc5/t;-><init>(Lw4/e;Lw4/g;)V

    .line 359
    .line 360
    .line 361
    iput-object v1, v0, Lcom/exotv/net/MainActivity;->T:Lc5/t;

    .line 362
    .line 363
    iget-object v1, v0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 364
    .line 365
    const-string v7, "b"

    .line 366
    .line 367
    if-eqz v1, :cond_39

    .line 368
    .line 369
    iget-object v1, v1, La5/a;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 370
    .line 371
    new-instance v9, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 372
    .line 373
    invoke-direct {v9, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v1, v9}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lz2/f0;)V

    .line 377
    .line 378
    .line 379
    iget-object v1, v0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 380
    .line 381
    if-eqz v1, :cond_38

    .line 382
    .line 383
    iget-object v1, v1, La5/a;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 384
    .line 385
    iget-object v9, v0, Lcom/exotv/net/MainActivity;->S:Lc5/o;

    .line 386
    .line 387
    if-eqz v9, :cond_37

    .line 388
    .line 389
    invoke-virtual {v1, v9}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lz2/x;)V

    .line 390
    .line 391
    .line 392
    iget-object v1, v0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 393
    .line 394
    if-eqz v1, :cond_36

    .line 395
    .line 396
    iget-object v1, v1, La5/a;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 397
    .line 398
    const v9, 0x7f08007e

    .line 399
    .line 400
    .line 401
    invoke-virtual {v1, v9}, Landroid/view/View;->setBackgroundResource(I)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0}, Lcom/exotv/net/MainActivity;->J()Z

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    if-eqz v1, :cond_3

    .line 409
    .line 410
    const/4 v8, 0x6

    .line 411
    :cond_3
    iget-object v1, v0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 412
    .line 413
    if-eqz v1, :cond_35

    .line 414
    .line 415
    iget-object v1, v1, La5/a;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 416
    .line 417
    new-instance v9, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 418
    .line 419
    invoke-direct {v9, v8}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(I)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v1, v9}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lz2/f0;)V

    .line 423
    .line 424
    .line 425
    iget-object v1, v0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 426
    .line 427
    if-eqz v1, :cond_34

    .line 428
    .line 429
    iget-object v1, v1, La5/a;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 430
    .line 431
    iget-object v8, v0, Lcom/exotv/net/MainActivity;->T:Lc5/t;

    .line 432
    .line 433
    if-eqz v8, :cond_33

    .line 434
    .line 435
    invoke-virtual {v1, v8}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lz2/x;)V

    .line 436
    .line 437
    .line 438
    iget-object v1, v0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 439
    .line 440
    if-eqz v1, :cond_32

    .line 441
    .line 442
    iget-object v1, v1, La5/a;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 443
    .line 444
    invoke-virtual {v1, v6}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 445
    .line 446
    .line 447
    iget-object v1, v0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 448
    .line 449
    if-eqz v1, :cond_31

    .line 450
    .line 451
    iget-object v1, v1, La5/a;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 452
    .line 453
    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Lz2/b0;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 457
    .line 458
    .line 459
    move-result-object v1

    .line 460
    const-string v8, "getResources(...)"

    .line 461
    .line 462
    invoke-static {v8, v1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    new-instance v8, Landroid/util/TypedValue;

    .line 466
    .line 467
    invoke-direct {v8}, Landroid/util/TypedValue;-><init>()V

    .line 468
    .line 469
    .line 470
    const v9, 0x7f0704ba

    .line 471
    .line 472
    .line 473
    invoke-virtual {v1, v9, v8, v6}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v8}, Landroid/util/TypedValue;->getFloat()F

    .line 477
    .line 478
    .line 479
    move-result v1

    .line 480
    iget-object v8, v0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 481
    .line 482
    if-eqz v8, :cond_30

    .line 483
    .line 484
    iget-object v8, v8, La5/a;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 485
    .line 486
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 487
    .line 488
    .line 489
    move-result-object v8

    .line 490
    const-string v9, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"

    .line 491
    .line 492
    invoke-static {v9, v8}, Lz6/h;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    check-cast v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 496
    .line 497
    iput v5, v8, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 498
    .line 499
    iput v1, v8, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 500
    .line 501
    iget-object v8, v0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 502
    .line 503
    if-eqz v8, :cond_2f

    .line 504
    .line 505
    iget-object v8, v8, La5/a;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 506
    .line 507
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 508
    .line 509
    .line 510
    move-result-object v8

    .line 511
    invoke-static {v9, v8}, Lz6/h;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 512
    .line 513
    .line 514
    check-cast v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 515
    .line 516
    iput v5, v8, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 517
    .line 518
    const/high16 v9, 0x3f800000    # 1.0f

    .line 519
    .line 520
    sub-float v1, v9, v1

    .line 521
    .line 522
    iput v1, v8, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 523
    .line 524
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    const v8, 0x7f07005f

    .line 529
    .line 530
    .line 531
    invoke-virtual {v1, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 532
    .line 533
    .line 534
    move-result v1

    .line 535
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 536
    .line 537
    .line 538
    move-result-object v8

    .line 539
    const v10, 0x7f070060

    .line 540
    .line 541
    .line 542
    invoke-virtual {v8, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 543
    .line 544
    .line 545
    move-result v8

    .line 546
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 547
    .line 548
    .line 549
    move-result-object v10

    .line 550
    const v11, 0x7f070063

    .line 551
    .line 552
    .line 553
    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 554
    .line 555
    .line 556
    invoke-virtual {v0}, Lcom/exotv/net/MainActivity;->t()V

    .line 557
    .line 558
    .line 559
    iget-object v10, v0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 560
    .line 561
    if-eqz v10, :cond_2e

    .line 562
    .line 563
    iget-object v10, v10, La5/a;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 564
    .line 565
    new-instance v11, Lw4/n;

    .line 566
    .line 567
    invoke-direct {v11, v1, v8}, Lw4/n;-><init>(II)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v10, v11}, Landroidx/recyclerview/widget/RecyclerView;->i(Lz2/c0;)V

    .line 571
    .line 572
    .line 573
    iget-object v1, v0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 574
    .line 575
    if-eqz v1, :cond_2d

    .line 576
    .line 577
    iget-object v1, v1, La5/a;->j:Landroid/widget/TextView;

    .line 578
    .line 579
    new-instance v8, Lw4/c;

    .line 580
    .line 581
    invoke-direct {v8, v0, v6}, Lw4/c;-><init>(Lcom/exotv/net/MainActivity;I)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v1, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 585
    .line 586
    .line 587
    iget-object v1, v0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 588
    .line 589
    if-eqz v1, :cond_2c

    .line 590
    .line 591
    iget-object v1, v1, La5/a;->j:Landroid/widget/TextView;

    .line 592
    .line 593
    new-instance v8, Lw4/d;

    .line 594
    .line 595
    invoke-direct {v8, v6}, Lw4/d;-><init>(I)V

    .line 596
    .line 597
    .line 598
    invoke-virtual {v1, v8}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 599
    .line 600
    .line 601
    iget-object v1, v0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 602
    .line 603
    if-eqz v1, :cond_2b

    .line 604
    .line 605
    iget-object v1, v1, La5/a;->m:Landroid/widget/TextView;

    .line 606
    .line 607
    new-instance v8, Lw4/c;

    .line 608
    .line 609
    invoke-direct {v8, v0, v3}, Lw4/c;-><init>(Lcom/exotv/net/MainActivity;I)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v1, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 613
    .line 614
    .line 615
    iget-object v1, v0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 616
    .line 617
    if-eqz v1, :cond_2a

    .line 618
    .line 619
    iget-object v1, v1, La5/a;->a:Landroid/widget/TextView;

    .line 620
    .line 621
    new-instance v8, Lw4/c;

    .line 622
    .line 623
    invoke-direct {v8, v0, v5}, Lw4/c;-><init>(Lcom/exotv/net/MainActivity;I)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v1, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 627
    .line 628
    .line 629
    iget-object v1, v0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 630
    .line 631
    if-eqz v1, :cond_29

    .line 632
    .line 633
    iget-object v8, v1, La5/a;->m:Landroid/widget/TextView;

    .line 634
    .line 635
    iget-object v1, v1, La5/a;->a:Landroid/widget/TextView;

    .line 636
    .line 637
    filled-new-array {v8, v1}, [Landroid/widget/TextView;

    .line 638
    .line 639
    .line 640
    move-result-object v1

    .line 641
    move v8, v5

    .line 642
    :goto_2
    if-ge v8, v3, :cond_4

    .line 643
    .line 644
    aget-object v10, v1, v8

    .line 645
    .line 646
    invoke-static {v10}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 647
    .line 648
    .line 649
    new-instance v11, Lw4/d;

    .line 650
    .line 651
    invoke-direct {v11, v5}, Lw4/d;-><init>(I)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v10, v11}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 655
    .line 656
    .line 657
    add-int/lit8 v8, v8, 0x1

    .line 658
    .line 659
    goto :goto_2

    .line 660
    :cond_4
    new-instance v1, Lw4/b;

    .line 661
    .line 662
    invoke-direct {v1, v0}, Lw4/b;-><init>(Lcom/exotv/net/MainActivity;)V

    .line 663
    .line 664
    .line 665
    iput-object v1, v0, Lcom/exotv/net/MainActivity;->R:Lw4/b;

    .line 666
    .line 667
    new-instance v1, Landroid/widget/LinearLayout;

    .line 668
    .line 669
    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 670
    .line 671
    .line 672
    invoke-virtual {v0}, Lcom/exotv/net/MainActivity;->I()Z

    .line 673
    .line 674
    .line 675
    move-result v8

    .line 676
    xor-int/2addr v8, v6

    .line 677
    invoke-virtual {v1, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 678
    .line 679
    .line 680
    iput-object v1, v0, Lcom/exotv/net/MainActivity;->H:Landroid/widget/LinearLayout;

    .line 681
    .line 682
    new-instance v1, Landroid/widget/FrameLayout;

    .line 683
    .line 684
    invoke-direct {v1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 685
    .line 686
    .line 687
    iput-object v1, v0, Lcom/exotv/net/MainActivity;->I:Landroid/widget/FrameLayout;

    .line 688
    .line 689
    new-instance v1, Lc5/y;

    .line 690
    .line 691
    new-instance v8, Lw4/e;

    .line 692
    .line 693
    invoke-direct {v8, v0, v6}, Lw4/e;-><init>(Lcom/exotv/net/MainActivity;I)V

    .line 694
    .line 695
    .line 696
    new-instance v10, Lw4/g;

    .line 697
    .line 698
    invoke-direct {v10, v0, v5}, Lw4/g;-><init>(Lcom/exotv/net/MainActivity;I)V

    .line 699
    .line 700
    .line 701
    invoke-direct {v1, v0, v8, v10}, Lc5/y;-><init>(Lcom/exotv/net/MainActivity;Lw4/e;Lw4/g;)V

    .line 702
    .line 703
    .line 704
    iput-object v1, v0, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 705
    .line 706
    invoke-virtual {v0}, Lcom/exotv/net/MainActivity;->I()Z

    .line 707
    .line 708
    .line 709
    move-result v1

    .line 710
    iget v8, v0, Lcom/exotv/net/MainActivity;->k0:I

    .line 711
    .line 712
    if-eqz v1, :cond_5

    .line 713
    .line 714
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 715
    .line 716
    invoke-direct {v1, v5, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 717
    .line 718
    .line 719
    goto :goto_3

    .line 720
    :cond_5
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 721
    .line 722
    invoke-direct {v1, v8, v5, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 723
    .line 724
    .line 725
    :goto_3
    invoke-virtual {v0}, Lcom/exotv/net/MainActivity;->I()Z

    .line 726
    .line 727
    .line 728
    move-result v10

    .line 729
    iget v11, v0, Lcom/exotv/net/MainActivity;->l0:I

    .line 730
    .line 731
    if-eqz v10, :cond_6

    .line 732
    .line 733
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 734
    .line 735
    invoke-direct {v10, v11, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 736
    .line 737
    .line 738
    goto :goto_4

    .line 739
    :cond_6
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 740
    .line 741
    invoke-direct {v10, v8, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 742
    .line 743
    .line 744
    :goto_4
    invoke-virtual {v0}, Lcom/exotv/net/MainActivity;->I()Z

    .line 745
    .line 746
    .line 747
    move-result v12

    .line 748
    const-string v13, "nav"

    .line 749
    .line 750
    const-string v14, "shell"

    .line 751
    .line 752
    const/16 v15, 0x8

    .line 753
    .line 754
    const-string v16, "tabHost"

    .line 755
    .line 756
    if-eqz v12, :cond_b

    .line 757
    .line 758
    iget-object v12, v0, Lcom/exotv/net/MainActivity;->H:Landroid/widget/LinearLayout;

    .line 759
    .line 760
    if-eqz v12, :cond_a

    .line 761
    .line 762
    move/from16 p1, v3

    .line 763
    .line 764
    iget-object v3, v0, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 765
    .line 766
    if-eqz v3, :cond_9

    .line 767
    .line 768
    iget-object v3, v3, Lc5/y;->n:Landroid/widget/LinearLayout;

    .line 769
    .line 770
    invoke-virtual {v12, v3, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 771
    .line 772
    .line 773
    iget-object v3, v0, Lcom/exotv/net/MainActivity;->H:Landroid/widget/LinearLayout;

    .line 774
    .line 775
    if-eqz v3, :cond_8

    .line 776
    .line 777
    iget-object v10, v0, Lcom/exotv/net/MainActivity;->I:Landroid/widget/FrameLayout;

    .line 778
    .line 779
    if-eqz v10, :cond_7

    .line 780
    .line 781
    invoke-virtual {v3, v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 782
    .line 783
    .line 784
    goto :goto_5

    .line 785
    :cond_7
    invoke-static/range {v16 .. v16}, Lz6/h;->h(Ljava/lang/String;)V

    .line 786
    .line 787
    .line 788
    throw v4

    .line 789
    :cond_8
    invoke-static {v14}, Lz6/h;->h(Ljava/lang/String;)V

    .line 790
    .line 791
    .line 792
    throw v4

    .line 793
    :cond_9
    invoke-static {v13}, Lz6/h;->h(Ljava/lang/String;)V

    .line 794
    .line 795
    .line 796
    throw v4

    .line 797
    :cond_a
    invoke-static {v14}, Lz6/h;->h(Ljava/lang/String;)V

    .line 798
    .line 799
    .line 800
    throw v4

    .line 801
    :cond_b
    move/from16 p1, v3

    .line 802
    .line 803
    iget-object v3, v0, Lcom/exotv/net/MainActivity;->H:Landroid/widget/LinearLayout;

    .line 804
    .line 805
    if-eqz v3, :cond_28

    .line 806
    .line 807
    iget-object v12, v0, Lcom/exotv/net/MainActivity;->I:Landroid/widget/FrameLayout;

    .line 808
    .line 809
    if-eqz v12, :cond_27

    .line 810
    .line 811
    invoke-virtual {v3, v12, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 812
    .line 813
    .line 814
    iget-object v1, v0, Lcom/exotv/net/MainActivity;->H:Landroid/widget/LinearLayout;

    .line 815
    .line 816
    if-eqz v1, :cond_26

    .line 817
    .line 818
    iget-object v3, v0, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 819
    .line 820
    if-eqz v3, :cond_25

    .line 821
    .line 822
    iget-object v3, v3, Lc5/y;->n:Landroid/widget/LinearLayout;

    .line 823
    .line 824
    invoke-virtual {v1, v3, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v0}, Lcom/exotv/net/MainActivity;->J()Z

    .line 828
    .line 829
    .line 830
    move-result v1

    .line 831
    if-nez v1, :cond_d

    .line 832
    .line 833
    new-instance v1, La1/e;

    .line 834
    .line 835
    invoke-direct {v1, v0}, La1/e;-><init>(Lcom/exotv/net/MainActivity;)V

    .line 836
    .line 837
    .line 838
    iget-object v3, v1, La1/e;->l:Ljava/lang/Object;

    .line 839
    .line 840
    check-cast v3, Landroid/widget/LinearLayout;

    .line 841
    .line 842
    iput-object v1, v0, Lcom/exotv/net/MainActivity;->N:La1/e;

    .line 843
    .line 844
    invoke-virtual {v3, v15}, Landroid/view/View;->setVisibility(I)V

    .line 845
    .line 846
    .line 847
    iget-object v1, v0, Lcom/exotv/net/MainActivity;->H:Landroid/widget/LinearLayout;

    .line 848
    .line 849
    if-eqz v1, :cond_c

    .line 850
    .line 851
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 852
    .line 853
    invoke-direct {v10, v8, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v1, v3, v6, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 857
    .line 858
    .line 859
    goto :goto_5

    .line 860
    :cond_c
    invoke-static {v14}, Lz6/h;->h(Ljava/lang/String;)V

    .line 861
    .line 862
    .line 863
    throw v4

    .line 864
    :cond_d
    :goto_5
    iget-object v1, v0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 865
    .line 866
    if-eqz v1, :cond_24

    .line 867
    .line 868
    iget-object v1, v1, La5/a;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 869
    .line 870
    const v3, 0x7f080081

    .line 871
    .line 872
    .line 873
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 874
    .line 875
    .line 876
    iget-object v1, v0, Lcom/exotv/net/MainActivity;->I:Landroid/widget/FrameLayout;

    .line 877
    .line 878
    if-eqz v1, :cond_23

    .line 879
    .line 880
    iget-object v3, v0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 881
    .line 882
    if-eqz v3, :cond_22

    .line 883
    .line 884
    iget-object v3, v3, La5/a;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 885
    .line 886
    new-instance v10, Landroid/widget/FrameLayout$LayoutParams;

    .line 887
    .line 888
    invoke-direct {v10, v8, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 889
    .line 890
    .line 891
    invoke-virtual {v1, v3, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 892
    .line 893
    .line 894
    iget-object v1, v0, Lcom/exotv/net/MainActivity;->I:Landroid/widget/FrameLayout;

    .line 895
    .line 896
    if-eqz v1, :cond_21

    .line 897
    .line 898
    new-instance v3, Landroid/widget/LinearLayout;

    .line 899
    .line 900
    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 901
    .line 902
    .line 903
    invoke-virtual {v3, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 904
    .line 905
    .line 906
    const v10, 0x7f08007c

    .line 907
    .line 908
    .line 909
    invoke-virtual {v3, v10}, Landroid/view/View;->setBackgroundResource(I)V

    .line 910
    .line 911
    .line 912
    iput-object v3, v0, Lcom/exotv/net/MainActivity;->d0:Landroid/widget/LinearLayout;

    .line 913
    .line 914
    new-instance v3, Landroid/widget/TextView;

    .line 915
    .line 916
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 917
    .line 918
    .line 919
    sget v10, Lc5/z;->c:I

    .line 920
    .line 921
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 922
    .line 923
    .line 924
    const/high16 v10, 0x41400000    # 12.0f

    .line 925
    .line 926
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 927
    .line 928
    .line 929
    const/16 v10, 0x10

    .line 930
    .line 931
    invoke-virtual {v0, v10}, Lcom/exotv/net/MainActivity;->w(I)I

    .line 932
    .line 933
    .line 934
    move-result v12

    .line 935
    invoke-virtual {v0, v10}, Lcom/exotv/net/MainActivity;->w(I)I

    .line 936
    .line 937
    .line 938
    move-result v10

    .line 939
    move-object/from16 v17, v4

    .line 940
    .line 941
    invoke-virtual {v0, v15}, Lcom/exotv/net/MainActivity;->w(I)I

    .line 942
    .line 943
    .line 944
    move-result v4

    .line 945
    invoke-virtual {v3, v12, v5, v10, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 946
    .line 947
    .line 948
    invoke-virtual {v3, v15}, Landroid/view/View;->setVisibility(I)V

    .line 949
    .line 950
    .line 951
    iput-object v3, v0, Lcom/exotv/net/MainActivity;->e0:Landroid/widget/TextView;

    .line 952
    .line 953
    invoke-virtual {v0}, Lcom/exotv/net/MainActivity;->I()Z

    .line 954
    .line 955
    .line 956
    move-result v3

    .line 957
    if-eqz v3, :cond_e

    .line 958
    .line 959
    int-to-float v2, v2

    .line 960
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 961
    .line 962
    .line 963
    move-result-object v3

    .line 964
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 965
    .line 966
    .line 967
    move-result-object v3

    .line 968
    invoke-static {v6, v2, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 969
    .line 970
    .line 971
    move-result v2

    .line 972
    float-to-int v2, v2

    .line 973
    div-int/lit8 v2, v2, 0x2

    .line 974
    .line 975
    goto :goto_6

    .line 976
    :cond_e
    move v2, v5

    .line 977
    :goto_6
    iput v2, v0, Lcom/exotv/net/MainActivity;->g0:I

    .line 978
    .line 979
    const/16 v2, 0x14

    .line 980
    .line 981
    invoke-virtual {v0, v2}, Lcom/exotv/net/MainActivity;->w(I)I

    .line 982
    .line 983
    .line 984
    move-result v2

    .line 985
    iput v2, v0, Lcom/exotv/net/MainActivity;->h0:I

    .line 986
    .line 987
    iget-object v2, v0, Lcom/exotv/net/MainActivity;->d0:Landroid/widget/LinearLayout;

    .line 988
    .line 989
    const-string v3, "catalogPage"

    .line 990
    .line 991
    if-eqz v2, :cond_20

    .line 992
    .line 993
    iget-object v4, v0, Lcom/exotv/net/MainActivity;->e0:Landroid/widget/TextView;

    .line 994
    .line 995
    if-eqz v4, :cond_1f

    .line 996
    .line 997
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 998
    .line 999
    invoke-direct {v10, v8, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual {v2, v4, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1003
    .line 1004
    .line 1005
    invoke-static {}, Lx4/m;->values()[Lx4/m;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v2

    .line 1009
    array-length v4, v2

    .line 1010
    move v10, v5

    .line 1011
    :goto_7
    iget-object v12, v0, Lcom/exotv/net/MainActivity;->c0:Ljava/util/HashMap;

    .line 1012
    .line 1013
    if-ge v10, v4, :cond_10

    .line 1014
    .line 1015
    aget-object v9, v2, v10

    .line 1016
    .line 1017
    new-instance v15, Landroid/widget/LinearLayout;

    .line 1018
    .line 1019
    invoke-direct {v15, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v15, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1023
    .line 1024
    .line 1025
    iget v6, v0, Lcom/exotv/net/MainActivity;->g0:I

    .line 1026
    .line 1027
    move-object/from16 v20, v2

    .line 1028
    .line 1029
    iget v2, v0, Lcom/exotv/net/MainActivity;->h0:I

    .line 1030
    .line 1031
    invoke-virtual {v15, v6, v5, v6, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 1032
    .line 1033
    .line 1034
    new-instance v2, Landroid/widget/ScrollView;

    .line 1035
    .line 1036
    invoke-direct {v2, v0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual {v2, v5}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 1046
    .line 1047
    .line 1048
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 1049
    .line 1050
    invoke-direct {v6, v8, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {v2, v15, v6}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1054
    .line 1055
    .line 1056
    const/16 v6, 0x8

    .line 1057
    .line 1058
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1059
    .line 1060
    .line 1061
    iget-object v6, v0, Lcom/exotv/net/MainActivity;->d0:Landroid/widget/LinearLayout;

    .line 1062
    .line 1063
    move-object/from16 v21, v3

    .line 1064
    .line 1065
    if-eqz v6, :cond_f

    .line 1066
    .line 1067
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 1068
    .line 1069
    move/from16 v22, v4

    .line 1070
    .line 1071
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1072
    .line 1073
    invoke-direct {v3, v8, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual {v6, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1077
    .line 1078
    .line 1079
    new-instance v3, Lw4/l;

    .line 1080
    .line 1081
    invoke-direct {v3, v2, v15}, Lw4/l;-><init>(Landroid/widget/ScrollView;Landroid/widget/LinearLayout;)V

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {v12, v9, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1085
    .line 1086
    .line 1087
    add-int/lit8 v10, v10, 0x1

    .line 1088
    .line 1089
    move v9, v4

    .line 1090
    move-object/from16 v2, v20

    .line 1091
    .line 1092
    move-object/from16 v3, v21

    .line 1093
    .line 1094
    move/from16 v4, v22

    .line 1095
    .line 1096
    const/4 v6, 0x1

    .line 1097
    const/16 v15, 0x8

    .line 1098
    .line 1099
    goto :goto_7

    .line 1100
    :cond_f
    invoke-static/range {v21 .. v21}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1101
    .line 1102
    .line 1103
    throw v17

    .line 1104
    :cond_10
    move-object/from16 v21, v3

    .line 1105
    .line 1106
    sget-object v2, Lx4/m;->j:Lx4/m;

    .line 1107
    .line 1108
    invoke-static {v12, v2}, Lm6/s;->S(Ljava/util/Map;Lx4/m;)Ljava/lang/Object;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v2

    .line 1112
    check-cast v2, Lw4/l;

    .line 1113
    .line 1114
    iget-object v2, v2, Lw4/l;->b:Landroid/widget/LinearLayout;

    .line 1115
    .line 1116
    iput-object v2, v0, Lcom/exotv/net/MainActivity;->f0:Landroid/widget/LinearLayout;

    .line 1117
    .line 1118
    iget-object v2, v0, Lcom/exotv/net/MainActivity;->d0:Landroid/widget/LinearLayout;

    .line 1119
    .line 1120
    if-eqz v2, :cond_1e

    .line 1121
    .line 1122
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 1123
    .line 1124
    invoke-direct {v3, v8, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1125
    .line 1126
    .line 1127
    invoke-virtual {v1, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1128
    .line 1129
    .line 1130
    new-instance v1, Lc5/a1;

    .line 1131
    .line 1132
    invoke-static {v0}, Landroidx/lifecycle/m0;->e(Landroidx/lifecycle/v;)Landroidx/lifecycle/q;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v2

    .line 1136
    new-instance v3, Lw4/g;

    .line 1137
    .line 1138
    const/4 v4, 0x1

    .line 1139
    invoke-direct {v3, v0, v4}, Lw4/g;-><init>(Lcom/exotv/net/MainActivity;I)V

    .line 1140
    .line 1141
    .line 1142
    invoke-direct {v1, v0, v2, v3}, Lc5/a1;-><init>(Lcom/exotv/net/MainActivity;Landroidx/lifecycle/q;Lw4/g;)V

    .line 1143
    .line 1144
    .line 1145
    iput-object v1, v0, Lcom/exotv/net/MainActivity;->M:Lc5/a1;

    .line 1146
    .line 1147
    iget-object v2, v0, Lcom/exotv/net/MainActivity;->I:Landroid/widget/FrameLayout;

    .line 1148
    .line 1149
    if-eqz v2, :cond_1d

    .line 1150
    .line 1151
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 1152
    .line 1153
    invoke-direct {v3, v8, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1154
    .line 1155
    .line 1156
    iget-object v1, v1, Lc5/a1;->n:Landroid/widget/LinearLayout;

    .line 1157
    .line 1158
    invoke-virtual {v2, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1159
    .line 1160
    .line 1161
    iget-object v2, v0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 1162
    .line 1163
    if-eqz v2, :cond_1c

    .line 1164
    .line 1165
    iget-object v2, v2, La5/a;->i:Landroid/widget/LinearLayout;

    .line 1166
    .line 1167
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v2

    .line 1171
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 1172
    .line 1173
    if-eqz v3, :cond_11

    .line 1174
    .line 1175
    check-cast v2, Landroid/view/ViewGroup;

    .line 1176
    .line 1177
    goto :goto_8

    .line 1178
    :cond_11
    move-object/from16 v2, v17

    .line 1179
    .line 1180
    :goto_8
    if-eqz v2, :cond_13

    .line 1181
    .line 1182
    iget-object v3, v0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 1183
    .line 1184
    if-eqz v3, :cond_12

    .line 1185
    .line 1186
    iget-object v3, v3, La5/a;->i:Landroid/widget/LinearLayout;

    .line 1187
    .line 1188
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1189
    .line 1190
    .line 1191
    goto :goto_9

    .line 1192
    :cond_12
    invoke-static {v7}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1193
    .line 1194
    .line 1195
    throw v17

    .line 1196
    :cond_13
    :goto_9
    iget-object v2, v0, Lcom/exotv/net/MainActivity;->I:Landroid/widget/FrameLayout;

    .line 1197
    .line 1198
    if-eqz v2, :cond_1b

    .line 1199
    .line 1200
    iget-object v3, v0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 1201
    .line 1202
    if-eqz v3, :cond_1a

    .line 1203
    .line 1204
    iget-object v3, v3, La5/a;->i:Landroid/widget/LinearLayout;

    .line 1205
    .line 1206
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 1207
    .line 1208
    invoke-direct {v4, v8, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {v2, v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1212
    .line 1213
    .line 1214
    iget-object v2, v0, Lcom/exotv/net/MainActivity;->d0:Landroid/widget/LinearLayout;

    .line 1215
    .line 1216
    if-eqz v2, :cond_19

    .line 1217
    .line 1218
    const/16 v6, 0x8

    .line 1219
    .line 1220
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1224
    .line 1225
    .line 1226
    iget-object v1, v0, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 1227
    .line 1228
    if-eqz v1, :cond_18

    .line 1229
    .line 1230
    iget-object v2, v0, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 1231
    .line 1232
    invoke-static {v2}, Lcom/exotv/net/MainActivity;->Y(Lw4/q;)Lc5/w;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v2

    .line 1236
    invoke-virtual {v1, v2}, Lc5/y;->e(Lc5/w;)V

    .line 1237
    .line 1238
    .line 1239
    iget-object v1, v0, Lcom/exotv/net/MainActivity;->H:Landroid/widget/LinearLayout;

    .line 1240
    .line 1241
    if-eqz v1, :cond_17

    .line 1242
    .line 1243
    invoke-virtual {v0, v1}, Lh/i;->setContentView(Landroid/view/View;)V

    .line 1244
    .line 1245
    .line 1246
    iget-object v1, v0, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 1247
    .line 1248
    if-eqz v1, :cond_16

    .line 1249
    .line 1250
    iget-object v1, v1, Lc5/y;->n:Landroid/widget/LinearLayout;

    .line 1251
    .line 1252
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    .line 1253
    .line 1254
    .line 1255
    move-result v1

    .line 1256
    iget-object v2, v0, Lcom/exotv/net/MainActivity;->H:Landroid/widget/LinearLayout;

    .line 1257
    .line 1258
    if-eqz v2, :cond_15

    .line 1259
    .line 1260
    new-instance v3, Lw4/i;

    .line 1261
    .line 1262
    invoke-direct {v3, v1, v0}, Lw4/i;-><init>(ILjava/lang/Object;)V

    .line 1263
    .line 1264
    .line 1265
    sget-object v1, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 1266
    .line 1267
    invoke-static {v2, v3}, Lm0/e0;->j(Landroid/view/View;Lm0/o;)V

    .line 1268
    .line 1269
    .line 1270
    iget-object v1, v0, Lcom/exotv/net/MainActivity;->H:Landroid/widget/LinearLayout;

    .line 1271
    .line 1272
    if-eqz v1, :cond_14

    .line 1273
    .line 1274
    invoke-static {v1}, Lm0/c0;->c(Landroid/view/View;)V

    .line 1275
    .line 1276
    .line 1277
    invoke-virtual {v0}, Lb/l;->i()Lb/x;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v1

    .line 1281
    new-instance v2, La1/f0;

    .line 1282
    .line 1283
    const/4 v4, 0x1

    .line 1284
    invoke-direct {v2, v0, v4}, La1/f0;-><init>(Lh/i;I)V

    .line 1285
    .line 1286
    .line 1287
    invoke-virtual {v1, v0, v2}, Lb/x;->a(Landroidx/lifecycle/v;La1/f0;)V

    .line 1288
    .line 1289
    .line 1290
    const/4 v1, 0x7

    .line 1291
    invoke-static {v0, v1}, Lcom/exotv/net/MainActivity;->L(Lcom/exotv/net/MainActivity;I)V

    .line 1292
    .line 1293
    .line 1294
    invoke-virtual {v0}, Lcom/exotv/net/MainActivity;->u()V

    .line 1295
    .line 1296
    .line 1297
    return-void

    .line 1298
    :cond_14
    invoke-static {v14}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1299
    .line 1300
    .line 1301
    throw v17

    .line 1302
    :cond_15
    invoke-static {v14}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1303
    .line 1304
    .line 1305
    throw v17

    .line 1306
    :cond_16
    invoke-static {v13}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1307
    .line 1308
    .line 1309
    throw v17

    .line 1310
    :cond_17
    invoke-static {v14}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1311
    .line 1312
    .line 1313
    throw v17

    .line 1314
    :cond_18
    invoke-static {v13}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1315
    .line 1316
    .line 1317
    throw v17

    .line 1318
    :cond_19
    invoke-static/range {v21 .. v21}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1319
    .line 1320
    .line 1321
    throw v17

    .line 1322
    :cond_1a
    invoke-static {v7}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1323
    .line 1324
    .line 1325
    throw v17

    .line 1326
    :cond_1b
    invoke-static/range {v16 .. v16}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1327
    .line 1328
    .line 1329
    throw v17

    .line 1330
    :cond_1c
    invoke-static {v7}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1331
    .line 1332
    .line 1333
    throw v17

    .line 1334
    :cond_1d
    invoke-static/range {v16 .. v16}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1335
    .line 1336
    .line 1337
    throw v17

    .line 1338
    :cond_1e
    invoke-static/range {v21 .. v21}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1339
    .line 1340
    .line 1341
    throw v17

    .line 1342
    :cond_1f
    const-string v1, "status"

    .line 1343
    .line 1344
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1345
    .line 1346
    .line 1347
    throw v17

    .line 1348
    :cond_20
    move-object/from16 v21, v3

    .line 1349
    .line 1350
    invoke-static/range {v21 .. v21}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1351
    .line 1352
    .line 1353
    throw v17

    .line 1354
    :cond_21
    move-object/from16 v17, v4

    .line 1355
    .line 1356
    invoke-static/range {v16 .. v16}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1357
    .line 1358
    .line 1359
    throw v17

    .line 1360
    :cond_22
    move-object/from16 v17, v4

    .line 1361
    .line 1362
    invoke-static {v7}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1363
    .line 1364
    .line 1365
    throw v17

    .line 1366
    :cond_23
    move-object/from16 v17, v4

    .line 1367
    .line 1368
    invoke-static/range {v16 .. v16}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1369
    .line 1370
    .line 1371
    throw v17

    .line 1372
    :cond_24
    move-object/from16 v17, v4

    .line 1373
    .line 1374
    invoke-static {v7}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1375
    .line 1376
    .line 1377
    throw v17

    .line 1378
    :cond_25
    move-object/from16 v17, v4

    .line 1379
    .line 1380
    invoke-static {v13}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1381
    .line 1382
    .line 1383
    throw v17

    .line 1384
    :cond_26
    move-object/from16 v17, v4

    .line 1385
    .line 1386
    invoke-static {v14}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1387
    .line 1388
    .line 1389
    throw v17

    .line 1390
    :cond_27
    move-object/from16 v17, v4

    .line 1391
    .line 1392
    invoke-static/range {v16 .. v16}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1393
    .line 1394
    .line 1395
    throw v17

    .line 1396
    :cond_28
    move-object/from16 v17, v4

    .line 1397
    .line 1398
    invoke-static {v14}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1399
    .line 1400
    .line 1401
    throw v17

    .line 1402
    :cond_29
    move-object/from16 v17, v4

    .line 1403
    .line 1404
    invoke-static {v7}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1405
    .line 1406
    .line 1407
    throw v17

    .line 1408
    :cond_2a
    move-object/from16 v17, v4

    .line 1409
    .line 1410
    invoke-static {v7}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1411
    .line 1412
    .line 1413
    throw v17

    .line 1414
    :cond_2b
    move-object/from16 v17, v4

    .line 1415
    .line 1416
    invoke-static {v7}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1417
    .line 1418
    .line 1419
    throw v17

    .line 1420
    :cond_2c
    move-object/from16 v17, v4

    .line 1421
    .line 1422
    invoke-static {v7}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1423
    .line 1424
    .line 1425
    throw v17

    .line 1426
    :cond_2d
    move-object/from16 v17, v4

    .line 1427
    .line 1428
    invoke-static {v7}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1429
    .line 1430
    .line 1431
    throw v17

    .line 1432
    :cond_2e
    move-object/from16 v17, v4

    .line 1433
    .line 1434
    invoke-static {v7}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1435
    .line 1436
    .line 1437
    throw v17

    .line 1438
    :cond_2f
    move-object/from16 v17, v4

    .line 1439
    .line 1440
    invoke-static {v7}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1441
    .line 1442
    .line 1443
    throw v17

    .line 1444
    :cond_30
    move-object/from16 v17, v4

    .line 1445
    .line 1446
    invoke-static {v7}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1447
    .line 1448
    .line 1449
    throw v17

    .line 1450
    :cond_31
    move-object/from16 v17, v4

    .line 1451
    .line 1452
    invoke-static {v7}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1453
    .line 1454
    .line 1455
    throw v17

    .line 1456
    :cond_32
    move-object/from16 v17, v4

    .line 1457
    .line 1458
    invoke-static {v7}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1459
    .line 1460
    .line 1461
    throw v17

    .line 1462
    :cond_33
    move-object/from16 v17, v4

    .line 1463
    .line 1464
    const-string v1, "channelAdapter"

    .line 1465
    .line 1466
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1467
    .line 1468
    .line 1469
    throw v17

    .line 1470
    :cond_34
    move-object/from16 v17, v4

    .line 1471
    .line 1472
    invoke-static {v7}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1473
    .line 1474
    .line 1475
    throw v17

    .line 1476
    :cond_35
    move-object/from16 v17, v4

    .line 1477
    .line 1478
    invoke-static {v7}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1479
    .line 1480
    .line 1481
    throw v17

    .line 1482
    :cond_36
    move-object/from16 v17, v4

    .line 1483
    .line 1484
    invoke-static {v7}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1485
    .line 1486
    .line 1487
    throw v17

    .line 1488
    :cond_37
    move-object/from16 v17, v4

    .line 1489
    .line 1490
    const-string v1, "categoryAdapter"

    .line 1491
    .line 1492
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1493
    .line 1494
    .line 1495
    throw v17

    .line 1496
    :cond_38
    move-object/from16 v17, v4

    .line 1497
    .line 1498
    invoke-static {v7}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1499
    .line 1500
    .line 1501
    throw v17

    .line 1502
    :cond_39
    move-object/from16 v17, v4

    .line 1503
    .line 1504
    invoke-static {v7}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1505
    .line 1506
    .line 1507
    throw v17

    .line 1508
    :cond_3a
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v1

    .line 1512
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v1

    .line 1516
    new-instance v2, Ljava/lang/NullPointerException;

    .line 1517
    .line 1518
    const-string v3, "Missing required view with ID: "

    .line 1519
    .line 1520
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v1

    .line 1524
    invoke-direct {v2, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1525
    .line 1526
    .line 1527
    throw v2
.end method

.method public final onDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->M:Lc5/a1;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Lc5/a1;->d:Li7/a0;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {v1}, Li7/x;->b(Li7/s0;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, v0, Lc5/a1;->e:Lm7/c;

    .line 13
    .line 14
    invoke-static {v0}, Li7/x;->c(Lm7/c;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    invoke-super {p0}, Lh/i;->onDestroy()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 1

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
    invoke-virtual {p0}, Lcom/exotv/net/MainActivity;->u()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Lh/i;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/exotv/net/MainActivity;->F()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/exotv/net/MainActivity;->F()V

    .line 7
    .line 8
    .line 9
    :cond_0
    if-eqz p1, :cond_3

    .line 10
    .line 11
    iget-boolean p1, p0, Lcom/exotv/net/MainActivity;->o0:Z

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Lcom/exotv/net/MainActivity;->o0:Z

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/exotv/net/MainActivity;->I()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_3

    .line 24
    .line 25
    iget-object p1, p0, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    invoke-virtual {p1}, Lc5/y;->a()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_2
    const-string p1, "nav"

    .line 34
    .line 35
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    throw p1

    .line 40
    :cond_3
    :goto_0
    return-void
.end method

.method public final t()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f07005f

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const v2, 0x7f070063

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    div-int/lit8 v0, v0, 0x2

    .line 24
    .line 25
    sub-int/2addr v1, v0

    .line 26
    const/4 v0, 0x0

    .line 27
    if-gez v1, :cond_0

    .line 28
    .line 29
    move v1, v0

    .line 30
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const v3, 0x7f0704b9

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    iget-object v3, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    const-string v5, "b"

    .line 45
    .line 46
    if-eqz v3, :cond_5

    .line 47
    .line 48
    iget-object v6, v3, La5/a;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 49
    .line 50
    if-eqz v3, :cond_4

    .line 51
    .line 52
    invoke-virtual {v6}, Landroid/view/View;->getPaddingLeft()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    iget v7, p0, Lcom/exotv/net/MainActivity;->j0:I

    .line 57
    .line 58
    add-int/2addr v7, v2

    .line 59
    iget-object v8, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 60
    .line 61
    if-eqz v8, :cond_3

    .line 62
    .line 63
    iget-object v8, v8, La5/a;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 64
    .line 65
    invoke-virtual {v8}, Landroid/view/View;->getPaddingRight()I

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    invoke-virtual {v6, v3, v7, v8, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 70
    .line 71
    .line 72
    iget-object v3, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 73
    .line 74
    if-eqz v3, :cond_2

    .line 75
    .line 76
    iget-object v3, v3, La5/a;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 77
    .line 78
    iget v6, p0, Lcom/exotv/net/MainActivity;->j0:I

    .line 79
    .line 80
    add-int/2addr v2, v6

    .line 81
    invoke-virtual {v3, v1, v2, v1, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 85
    .line 86
    if-eqz v1, :cond_1

    .line 87
    .line 88
    iget-object v1, v1, La5/a;->d:Landroid/widget/LinearLayout;

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    const v3, 0x7f07006c

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-virtual {v1, v0, v0, v2, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_1
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw v4

    .line 109
    :cond_2
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v4

    .line 113
    :cond_3
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v4

    .line 117
    :cond_4
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw v4

    .line 121
    :cond_5
    invoke-static {v5}, Lz6/h;->h(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v4
.end method

.method public final u()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "nav_tab"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    sparse-switch v3, :sswitch_data_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :sswitch_0
    const-string v3, "LIVE"

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    sget-object v0, Lw4/q;->j:Lw4/q;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :sswitch_1
    const-string v3, "SERIES"

    .line 34
    .line 35
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    sget-object v0, Lw4/q;->l:Lw4/q;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :sswitch_2
    const-string v3, "SEARCH"

    .line 46
    .line 47
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    sget-object v0, Lw4/q;->m:Lw4/q;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :sswitch_3
    const-string v3, "MOVIES"

    .line 58
    .line 59
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    sget-object v0, Lw4/q;->k:Lw4/q;

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    :goto_0
    move-object v0, v2

    .line 70
    :goto_1
    const-string v3, "nav"

    .line 71
    .line 72
    if-nez v0, :cond_5

    .line 73
    .line 74
    iget-object v0, p0, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 75
    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 79
    .line 80
    invoke-static {v1}, Lcom/exotv/net/MainActivity;->Y(Lw4/q;)Lc5/w;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v0, v1}, Lc5/y;->e(Lc5/w;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_4
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v2

    .line 92
    :cond_5
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {v4, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 100
    .line 101
    if-ne v0, v1, :cond_7

    .line 102
    .line 103
    iget-object v1, p0, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 104
    .line 105
    if-eqz v1, :cond_6

    .line 106
    .line 107
    invoke-static {v0}, Lcom/exotv/net/MainActivity;->Y(Lw4/q;)Lc5/w;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v1, v0}, Lc5/y;->e(Lc5/w;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_6
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw v2

    .line 119
    :cond_7
    iput-object v0, p0, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 120
    .line 121
    sget-object v1, Lw4/q;->m:Lw4/q;

    .line 122
    .line 123
    if-eq v0, v1, :cond_8

    .line 124
    .line 125
    iput-object v0, p0, Lcom/exotv/net/MainActivity;->L:Lw4/q;

    .line 126
    .line 127
    :cond_8
    invoke-virtual {p0}, Lcom/exotv/net/MainActivity;->U()V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :sswitch_data_0
    .sparse-switch
        -0x781964bd -> :sswitch_3
        -0x6e72a658 -> :sswitch_2
        -0x6e6b0d89 -> :sswitch_1
        0x23a8ec -> :sswitch_0
    .end sparse-switch
.end method

.method public final v(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/exotv/net/MainActivity;->D(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {v0}, Lcom/exotv/net/MainActivity;->C(Landroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance p2, Lw4/f;

    .line 14
    .line 15
    invoke-direct {p2, p3, v0, p0}, Lw4/f;-><init>(ILandroidx/recyclerview/widget/RecyclerView;Lcom/exotv/net/MainActivity;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object p1

    .line 22
    :cond_1
    invoke-static {p1}, Lcom/exotv/net/MainActivity;->x(Landroid/view/View;)Landroid/widget/HorizontalScrollView;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    invoke-static {p2, v0}, Lcom/exotv/net/MainActivity;->H(Landroid/view/View;Landroid/view/ViewGroup;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-static {v0}, Lcom/exotv/net/MainActivity;->N(Landroid/widget/HorizontalScrollView;)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->isFocusable()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_4
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 48
    .line 49
    if-eqz v0, :cond_6

    .line 50
    .line 51
    check-cast p1, Landroid/view/ViewGroup;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    const/4 v1, 0x0

    .line 58
    :goto_0
    if-ge v1, v0, :cond_6

    .line 59
    .line 60
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v2}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v2, p2, p3}, Lcom/exotv/net/MainActivity;->v(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    if-eqz v2, :cond_5

    .line 72
    .line 73
    return-object v2

    .line 74
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_6
    :goto_1
    const/4 p1, 0x0

    .line 78
    return-object p1
.end method

.method public final w(I)I
    .locals 2

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    float-to-int p1, p1

    .line 16
    return p1
.end method
