.class public final Lc5/g0;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final S0:Z

.field public T0:I

.field public U0:I

.field public V0:Ljava/lang/Integer;

.field public W0:I


# direct methods
.method public constructor <init>(ILandroid/content/Context;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p2, v0}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    .line 4
    .line 5
    iput-boolean p3, p0, Lc5/g0;->S0:Z

    .line 6
    .line 7
    const/4 p2, -0x1

    .line 8
    iput p2, p0, Lc5/g0;->T0:I

    .line 9
    .line 10
    if-eqz p3, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move p1, p2

    .line 14
    :goto_0
    iput p1, p0, Lc5/g0;->W0:I

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    if-eqz p3, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusable(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 23
    .line 24
    .line 25
    const/high16 p2, 0x40000

    .line 26
    .line 27
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 28
    .line 29
    .line 30
    :cond_1
    new-instance p2, Lc5/f0;

    .line 31
    .line 32
    const/4 p3, 0x0

    .line 33
    invoke-direct {p2, p3, p0}, Lc5/f0;-><init>(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView;->j(Lz2/i0;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 40
    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    move-object v0, p0

    .line 19
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p0, v0, v1}, Lc5/g0;->m0(Landroid/view/View;I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    return p1

    .line 31
    :cond_1
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    return p1
.end method

.method public final m0(Landroid/view/View;I)Z
    .locals 8

    .line 1
    const/16 v0, 0x16

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x15

    .line 5
    .line 6
    if-eq p2, v2, :cond_0

    .line 7
    .line 8
    if-eq p2, v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_c

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lz2/x;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    invoke-virtual {v3}, Lz2/x;->a()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move v3, v1

    .line 24
    :goto_0
    if-nez v3, :cond_2

    .line 25
    .line 26
    goto/16 :goto_c

    .line 27
    .line 28
    :cond_2
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->D(Landroid/view/View;)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-nez p1, :cond_3

    .line 34
    .line 35
    move-object p1, v4

    .line 36
    goto :goto_1

    .line 37
    :cond_3
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->L(Landroid/view/View;)Lz2/v0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :goto_1
    const/4 v5, -0x1

    .line 42
    if-eqz p1, :cond_9

    .line 43
    .line 44
    iget-object v6, p1, Lz2/v0;->s:Lz2/x;

    .line 45
    .line 46
    if-nez v6, :cond_5

    .line 47
    .line 48
    :cond_4
    :goto_2
    move v7, v5

    .line 49
    goto :goto_3

    .line 50
    :cond_5
    iget-object v6, p1, Lz2/v0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 51
    .line 52
    if-nez v6, :cond_6

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_6
    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lz2/x;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    if-nez v6, :cond_7

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_7
    iget-object v7, p1, Lz2/v0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 63
    .line 64
    invoke-virtual {v7, p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Lz2/v0;)I

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-ne v7, v5, :cond_8

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_8
    iget-object p1, p1, Lz2/v0;->s:Lz2/x;

    .line 72
    .line 73
    if-ne p1, v6, :cond_4

    .line 74
    .line 75
    :goto_3
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-eq v7, v5, :cond_9

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_9
    move-object p1, v4

    .line 83
    :goto_4
    if-eqz p1, :cond_a

    .line 84
    .line 85
    :goto_5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    goto :goto_8

    .line 90
    :cond_a
    iget p1, p0, Lc5/g0;->W0:I

    .line 91
    .line 92
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    if-eq p1, v5, :cond_b

    .line 97
    .line 98
    goto :goto_6

    .line 99
    :cond_b
    move-object v6, v4

    .line 100
    :goto_6
    if-eqz v6, :cond_c

    .line 101
    .line 102
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    goto :goto_8

    .line 107
    :cond_c
    sget-object p1, Lc5/r0;->a:Lc5/r0;

    .line 108
    .line 109
    invoke-static {p0}, Lc5/r0;->a(Landroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-eqz p1, :cond_d

    .line 114
    .line 115
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->K(Landroid/view/View;)I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    goto :goto_7

    .line 124
    :cond_d
    move-object p1, v4

    .line 125
    :goto_7
    if-eqz p1, :cond_1f

    .line 126
    .line 127
    goto :goto_5

    .line 128
    :goto_8
    const/4 v6, 0x1

    .line 129
    if-eq p2, v2, :cond_f

    .line 130
    .line 131
    if-eq p2, v0, :cond_e

    .line 132
    .line 133
    move v2, p1

    .line 134
    goto :goto_9

    .line 135
    :cond_e
    add-int/lit8 v2, p1, 0x1

    .line 136
    .line 137
    sub-int/2addr v3, v6

    .line 138
    if-le v2, v3, :cond_10

    .line 139
    .line 140
    move v2, v3

    .line 141
    goto :goto_9

    .line 142
    :cond_f
    add-int/lit8 v2, p1, -0x1

    .line 143
    .line 144
    if-gez v2, :cond_10

    .line 145
    .line 146
    move v2, v1

    .line 147
    :cond_10
    :goto_9
    if-eq v2, p1, :cond_1d

    .line 148
    .line 149
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lz2/f0;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    instance-of v0, p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 154
    .line 155
    if-eqz v0, :cond_11

    .line 156
    .line 157
    move-object v4, p2

    .line 158
    check-cast v4, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 159
    .line 160
    :cond_11
    if-nez v4, :cond_12

    .line 161
    .line 162
    goto/16 :goto_b

    .line 163
    .line 164
    :cond_12
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    iput-object p2, p0, Lc5/g0;->V0:Ljava/lang/Integer;

    .line 169
    .line 170
    iput v2, p0, Lc5/g0;->W0:I

    .line 171
    .line 172
    invoke-virtual {v4, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->q(I)Landroid/view/View;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    if-nez p1, :cond_13

    .line 177
    .line 178
    sget-object p1, Lc5/r0;->a:Lc5/r0;

    .line 179
    .line 180
    invoke-static {p0}, Lc5/r0;->a(Landroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    :cond_13
    invoke-virtual {v4, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->q(I)Landroid/view/View;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    iget-boolean v0, p0, Lc5/g0;->S0:Z

    .line 189
    .line 190
    if-eqz v0, :cond_16

    .line 191
    .line 192
    if-eqz p1, :cond_14

    .line 193
    .line 194
    if-nez p2, :cond_16

    .line 195
    .line 196
    :cond_14
    iput v2, v4, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 197
    .line 198
    iput v1, v4, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 199
    .line 200
    iget-object p1, v4, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lz2/q;

    .line 201
    .line 202
    if-eqz p1, :cond_15

    .line 203
    .line 204
    iput v5, p1, Lz2/q;->j:I

    .line 205
    .line 206
    :cond_15
    invoke-virtual {v4}, Lz2/f0;->n0()V

    .line 207
    .line 208
    .line 209
    new-instance p1, Lc5/e0;

    .line 210
    .line 211
    invoke-direct {p1, p0, v6}, Lc5/e0;-><init>(Lc5/g0;I)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 215
    .line 216
    .line 217
    goto :goto_b

    .line 218
    :cond_16
    if-eqz p1, :cond_19

    .line 219
    .line 220
    if-nez p2, :cond_17

    .line 221
    .line 222
    goto :goto_a

    .line 223
    :cond_17
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    .line 228
    .line 229
    .line 230
    move-result p2

    .line 231
    add-int/2addr p2, v2

    .line 232
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 237
    .line 238
    .line 239
    move-result p1

    .line 240
    add-int/2addr p1, v2

    .line 241
    sub-int/2addr p2, p1

    .line 242
    div-int/lit8 p2, p2, 0x2

    .line 243
    .line 244
    if-eqz p2, :cond_18

    .line 245
    .line 246
    invoke-virtual {p0, p2, v1}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 247
    .line 248
    .line 249
    :cond_18
    if-eqz v0, :cond_1c

    .line 250
    .line 251
    invoke-virtual {p0}, Lc5/g0;->n0()V

    .line 252
    .line 253
    .line 254
    goto :goto_b

    .line 255
    :cond_19
    :goto_a
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Z

    .line 256
    .line 257
    if-eqz p1, :cond_1a

    .line 258
    .line 259
    goto :goto_b

    .line 260
    :cond_1a
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->w:Lz2/f0;

    .line 261
    .line 262
    if-nez p1, :cond_1b

    .line 263
    .line 264
    const-string p1, "RecyclerView"

    .line 265
    .line 266
    const-string p2, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    .line 267
    .line 268
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 269
    .line 270
    .line 271
    goto :goto_b

    .line 272
    :cond_1b
    invoke-virtual {p1, p0, v2}, Lz2/f0;->z0(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 273
    .line 274
    .line 275
    :cond_1c
    :goto_b
    new-instance p1, Lc5/e0;

    .line 276
    .line 277
    invoke-direct {p1, p0, v1}, Lc5/e0;-><init>(Lc5/g0;I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 281
    .line 282
    .line 283
    return v6

    .line 284
    :cond_1d
    if-eq p2, v0, :cond_1e

    .line 285
    .line 286
    if-lez p1, :cond_1f

    .line 287
    .line 288
    :cond_1e
    return v6

    .line 289
    :cond_1f
    :goto_c
    return v1
.end method

.method public final n0()V
    .locals 8

    .line 1
    iget-object v0, p0, Lc5/g0;->V0:Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollState()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_7

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lz2/x;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Lz2/x;->a()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move v0, v1

    .line 26
    :goto_0
    if-nez v0, :cond_2

    .line 27
    .line 28
    goto/16 :goto_7

    .line 29
    .line 30
    :cond_2
    iget-object v2, p0, Lc5/g0;->V0:Ljava/lang/Integer;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    iget-boolean v4, p0, Lc5/g0;->S0:Z

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    sub-int/2addr v0, v5

    .line 43
    invoke-static {v2, v1, v0}, Lcom/bumptech/glide/c;->t(III)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    goto :goto_3

    .line 48
    :cond_3
    iget v2, p0, Lc5/g0;->W0:I

    .line 49
    .line 50
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    if-eqz v4, :cond_4

    .line 55
    .line 56
    if-ltz v2, :cond_4

    .line 57
    .line 58
    if-ge v2, v0, :cond_4

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    move-object v6, v3

    .line 62
    :goto_1
    if-eqz v6, :cond_5

    .line 63
    .line 64
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    goto :goto_3

    .line 69
    :cond_5
    sget-object v0, Lc5/r0;->a:Lc5/r0;

    .line 70
    .line 71
    invoke-static {p0}, Lc5/r0;->a(Landroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_6

    .line 76
    .line 77
    invoke-static {v0}, Landroidx/recyclerview/widget/RecyclerView;->K(Landroid/view/View;)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    goto :goto_2

    .line 86
    :cond_6
    move-object v0, v3

    .line 87
    :goto_2
    if-eqz v0, :cond_10

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    :goto_3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lz2/f0;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    instance-of v6, v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 98
    .line 99
    if-eqz v6, :cond_7

    .line 100
    .line 101
    check-cast v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_7
    move-object v2, v3

    .line 105
    :goto_4
    if-eqz v2, :cond_8

    .line 106
    .line 107
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->q(I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    if-nez v2, :cond_9

    .line 112
    .line 113
    :cond_8
    sget-object v2, Lc5/r0;->a:Lc5/r0;

    .line 114
    .line 115
    invoke-static {p0}, Lc5/r0;->a(Landroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    if-nez v2, :cond_9

    .line 120
    .line 121
    goto :goto_7

    .line 122
    :cond_9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollState()I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-eqz v6, :cond_a

    .line 127
    .line 128
    goto :goto_7

    .line 129
    :cond_a
    iput-object v3, p0, Lc5/g0;->V0:Ljava/lang/Integer;

    .line 130
    .line 131
    if-eqz v4, :cond_b

    .line 132
    .line 133
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-eqz v3, :cond_b

    .line 138
    .line 139
    iput v0, p0, Lc5/g0;->W0:I

    .line 140
    .line 141
    :cond_b
    if-eqz v4, :cond_c

    .line 142
    .line 143
    iget v3, p0, Lc5/g0;->T0:I

    .line 144
    .line 145
    if-ne v0, v3, :cond_c

    .line 146
    .line 147
    invoke-virtual {v2}, Landroid/view/View;->isFocused()Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-eqz v2, :cond_c

    .line 152
    .line 153
    goto :goto_7

    .line 154
    :cond_c
    iput v0, p0, Lc5/g0;->T0:I

    .line 155
    .line 156
    if-eqz v4, :cond_f

    .line 157
    .line 158
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    move v4, v1

    .line 167
    :goto_5
    if-ge v4, v3, :cond_f

    .line 168
    .line 169
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    invoke-static {v6}, Landroidx/recyclerview/widget/RecyclerView;->K(Landroid/view/View;)I

    .line 174
    .line 175
    .line 176
    move-result v7

    .line 177
    if-ne v7, v0, :cond_d

    .line 178
    .line 179
    move v7, v5

    .line 180
    goto :goto_6

    .line 181
    :cond_d
    move v7, v1

    .line 182
    :goto_6
    invoke-virtual {v6, v7}, Landroid/view/View;->setFocusable(Z)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v6, v7}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 186
    .line 187
    .line 188
    if-eqz v2, :cond_e

    .line 189
    .line 190
    if-eqz v7, :cond_e

    .line 191
    .line 192
    invoke-virtual {v6}, Landroid/view/View;->isFocused()Z

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    if-nez v7, :cond_e

    .line 197
    .line 198
    invoke-virtual {v6}, Landroid/view/View;->requestFocus()Z

    .line 199
    .line 200
    .line 201
    :cond_e
    add-int/lit8 v4, v4, 0x1

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_f
    sget-object v0, Lc5/r0;->a:Lc5/r0;

    .line 205
    .line 206
    invoke-static {p0}, Lc5/r0;->c(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 207
    .line 208
    .line 209
    :cond_10
    :goto_7
    return-void
.end method

.method public final onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/view/View;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p2, p0, Lc5/g0;->S0:Z

    .line 5
    .line 6
    if-eqz p2, :cond_1

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    sget-object p1, Lc5/r0;->a:Lc5/r0;

    .line 11
    .line 12
    invoke-static {p0}, Lc5/r0;->a(Landroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->K(Landroid/view/View;)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p1, -0x1

    .line 24
    :goto_0
    iput p1, p0, Lc5/g0;->W0:I

    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public final onMeasure(II)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget p1, p0, Lc5/g0;->U0:I

    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    if-lez p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-lez p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iget v0, p0, Lc5/g0;->U0:I

    .line 20
    .line 21
    sub-int/2addr p1, v0

    .line 22
    div-int/lit8 p1, p1, 0x2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move p1, p2

    .line 26
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eq v0, p1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, p1, p2, p1, p2}, Landroid/view/View;->setPadding(IIII)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method
