.class public final Lc5/k0;
.super Lz2/x;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final d:Ljava/util/List;

.field public final e:I

.field public final f:I

.field public final g:Ljava/lang/String;

.field public final h:Lx4/m;

.field public final i:Z

.field public final j:Lw4/r;

.field public final k:Lw4/r;

.field public final l:Lw4/g;

.field public final m:Lm7/c;


# direct methods
.method public constructor <init>(Ljava/util/List;IILjava/lang/String;Lx4/m;ZLw4/r;Lw4/r;Lw4/g;)V
    .locals 1

    .line 1
    const-string v0, "items"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lz2/x;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lc5/k0;->d:Ljava/util/List;

    .line 10
    .line 11
    iput p2, p0, Lc5/k0;->e:I

    .line 12
    .line 13
    iput p3, p0, Lc5/k0;->f:I

    .line 14
    .line 15
    iput-object p4, p0, Lc5/k0;->g:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p5, p0, Lc5/k0;->h:Lx4/m;

    .line 18
    .line 19
    iput-boolean p6, p0, Lc5/k0;->i:Z

    .line 20
    .line 21
    iput-object p7, p0, Lc5/k0;->j:Lw4/r;

    .line 22
    .line 23
    iput-object p8, p0, Lc5/k0;->k:Lw4/r;

    .line 24
    .line 25
    iput-object p9, p0, Lc5/k0;->l:Lw4/g;

    .line 26
    .line 27
    new-instance p1, Li7/f1;

    .line 28
    .line 29
    invoke-direct {p1}, Li7/u0;-><init>()V

    .line 30
    .line 31
    .line 32
    sget-object p2, Li7/e0;->a:Lo7/e;

    .line 33
    .line 34
    sget-object p2, Lm7/n;->a:Lj7/d;

    .line 35
    .line 36
    iget-object p2, p2, Lj7/d;->n:Lj7/d;

    .line 37
    .line 38
    invoke-static {p1, p2}, Lcom/bumptech/glide/c;->W(Lp6/f;Lp6/h;)Lp6/h;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, Li7/x;->a(Lp6/h;)Lm7/c;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lc5/k0;->m:Lm7/c;

    .line 47
    .line 48
    return-void
.end method

.method public static g(Lc5/i0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc5/i0;->y:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lc5/i0;->w:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {v1}, Lcom/bumptech/glide/b;->d(Landroid/widget/ImageView;)Lcom/bumptech/glide/m;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/m;->m(Ljava/lang/String;)Lcom/bumptech/glide/j;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object p2, La4/n;->b:La4/n;

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lq4/a;->d(La4/n;)Lq4/a;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lcom/bumptech/glide/j;

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Lcom/bumptech/glide/j;->u(Landroid/widget/ImageView;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Lc5/i0;->x:Landroid/widget/TextView;

    .line 36
    .line 37
    const/16 p1, 0x8

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc5/k0;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final d(Lz2/v0;I)V
    .locals 12

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, Lc5/i0;

    .line 3
    .line 4
    iget-object p1, v4, Lc5/i0;->x:Landroid/widget/TextView;

    .line 5
    .line 6
    iget-object v0, v4, Lc5/i0;->w:Landroid/widget/ImageView;

    .line 7
    .line 8
    iget-object v1, v4, Lc5/i0;->v:Landroid/widget/ImageView;

    .line 9
    .line 10
    iget-object v2, p0, Lc5/k0;->d:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v2, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lx4/l;

    .line 17
    .line 18
    iget-object v3, v4, Lc5/i0;->u:Landroid/widget/FrameLayout;

    .line 19
    .line 20
    move-object v5, v1

    .line 21
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v6, p0, Lc5/k0;->h:Lx4/m;

    .line 26
    .line 27
    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    iget-wide v7, v2, Lx4/l;->a:J

    .line 32
    .line 33
    iget-object v9, v2, Lx4/l;->b:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v10, v2, Lx4/l;->d:Ljava/lang/String;

    .line 36
    .line 37
    new-instance v11, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v6, ":"

    .line 46
    .line 47
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v11, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    iput-object v6, v4, Lc5/i0;->y:Ljava/lang/String;

    .line 58
    .line 59
    sget-object v7, Lc5/r0;->a:Lc5/r0;

    .line 60
    .line 61
    invoke-static {v1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    const v8, 0x7f050002

    .line 69
    .line 70
    .line 71
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    const/4 v8, 0x0

    .line 76
    iget-object v11, p0, Lc5/k0;->g:Ljava/lang/String;

    .line 77
    .line 78
    if-eqz v7, :cond_0

    .line 79
    .line 80
    iget-object v7, v2, Lx4/l;->e:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v7, v11}, Lt5/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    if-nez v7, :cond_4

    .line 87
    .line 88
    const-string v7, "w780"

    .line 89
    .line 90
    invoke-static {v10, v7}, Lt5/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    goto :goto_2

    .line 95
    :cond_0
    const-string v7, "size"

    .line 96
    .line 97
    invoke-static {v7, v11}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    if-eqz v10, :cond_3

    .line 101
    .line 102
    invoke-static {v10}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-nez v7, :cond_1

    .line 107
    .line 108
    const-string v7, "null"

    .line 109
    .line 110
    invoke-virtual {v10, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-nez v7, :cond_1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_1
    move-object v10, v8

    .line 118
    :goto_0
    if-nez v10, :cond_2

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    const-string v7, "https://image.tmdb.org/t/p/"

    .line 122
    .line 123
    invoke-static {v7, v11, v10}, La1/a1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    goto :goto_2

    .line 128
    :cond_3
    :goto_1
    move-object v7, v8

    .line 129
    :cond_4
    :goto_2
    if-eqz v7, :cond_5

    .line 130
    .line 131
    invoke-static {v5}, Lcom/bumptech/glide/b;->d(Landroid/widget/ImageView;)Lcom/bumptech/glide/m;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    invoke-virtual {v10, v7}, Lcom/bumptech/glide/m;->m(Ljava/lang/String;)Lcom/bumptech/glide/j;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    invoke-virtual {v7, v5}, Lcom/bumptech/glide/j;->u(Landroid/widget/ImageView;)V

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_5
    const v7, 0x108003f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v5, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 147
    .line 148
    .line 149
    :goto_3
    new-instance v5, Lz2/g0;

    .line 150
    .line 151
    iget v7, p0, Lc5/k0;->e:I

    .line 152
    .line 153
    iget v10, p0, Lc5/k0;->f:I

    .line 154
    .line 155
    invoke-direct {v5, v7, v10}, Lz2/g0;-><init>(II)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 159
    .line 160
    .line 161
    iget-object v5, v4, Lz2/v0;->a:Landroid/view/View;

    .line 162
    .line 163
    new-instance v11, Lz2/g0;

    .line 164
    .line 165
    invoke-direct {v11, v7, v10}, Lz2/g0;-><init>(II)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v5, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3, v9}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 175
    .line 176
    .line 177
    const/16 v5, 0x8

    .line 178
    .line 179
    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 180
    .line 181
    .line 182
    iget-boolean v7, p0, Lc5/k0;->i:Z

    .line 183
    .line 184
    if-eqz v7, :cond_6

    .line 185
    .line 186
    const/4 v5, 0x0

    .line 187
    :cond_6
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 188
    .line 189
    .line 190
    invoke-static {v0}, Lcom/bumptech/glide/b;->d(Landroid/widget/ImageView;)Lcom/bumptech/glide/m;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    new-instance v5, Lcom/bumptech/glide/k;

    .line 198
    .line 199
    invoke-direct {v5, v0}, Lcom/bumptech/glide/k;-><init>(Landroid/widget/ImageView;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1, v5}, Lcom/bumptech/glide/m;->l(Lr4/e;)V

    .line 203
    .line 204
    .line 205
    new-instance p1, Lc5/p;

    .line 206
    .line 207
    const/4 v9, 0x3

    .line 208
    invoke-direct {p1, p0, v9, v2}, Lc5/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v3, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 212
    .line 213
    .line 214
    const/4 p1, -0x1

    .line 215
    if-nez p2, :cond_7

    .line 216
    .line 217
    iget-object p2, p0, Lc5/k0;->l:Lw4/g;

    .line 218
    .line 219
    if-eqz p2, :cond_7

    .line 220
    .line 221
    invoke-virtual {p2}, Lw4/g;->invoke()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    check-cast p1, Ljava/lang/Number;

    .line 226
    .line 227
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    :cond_7
    invoke-virtual {v3, p1}, Landroid/view/View;->setNextFocusLeftId(I)V

    .line 232
    .line 233
    .line 234
    iget-object p1, p0, Lc5/k0;->k:Lw4/r;

    .line 235
    .line 236
    if-eqz p1, :cond_8

    .line 237
    .line 238
    new-instance p2, Lc5/a0;

    .line 239
    .line 240
    const/4 v0, 0x1

    .line 241
    invoke-direct {p2, p1, v2, v0}, Lc5/a0;-><init>(Ljava/lang/Object;Lx4/l;I)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v3, p2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 245
    .line 246
    .line 247
    :cond_8
    if-eqz v7, :cond_a

    .line 248
    .line 249
    sget-object p1, Lc5/r0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 250
    .line 251
    invoke-virtual {p1, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    check-cast p1, Ljava/lang/String;

    .line 256
    .line 257
    if-eqz p1, :cond_9

    .line 258
    .line 259
    invoke-static {v4, v6, p1}, Lc5/k0;->g(Lc5/i0;Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    return-void

    .line 263
    :cond_9
    sget-object p1, Lc5/r0;->c:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 264
    .line 265
    invoke-virtual {p1, v6}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result p1

    .line 269
    if-nez p1, :cond_a

    .line 270
    .line 271
    new-instance v0, Lc5/j0;

    .line 272
    .line 273
    move-object v5, v6

    .line 274
    const/4 v6, 0x0

    .line 275
    const/4 v7, 0x0

    .line 276
    move-object v3, p0

    .line 277
    invoke-direct/range {v0 .. v7}, Lc5/j0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lp6/c;I)V

    .line 278
    .line 279
    .line 280
    iget-object p1, v3, Lc5/k0;->m:Lm7/c;

    .line 281
    .line 282
    invoke-static {p1, v8, v0, v9}, Li7/x;->k(Li7/u;Lj7/d;Ly6/p;I)Li7/a0;

    .line 283
    .line 284
    .line 285
    return-void

    .line 286
    :cond_a
    move-object v3, p0

    .line 287
    return-void
.end method

.method public final e(Landroid/view/ViewGroup;)Lz2/v0;
    .locals 14

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    new-instance v2, Landroid/widget/FrameLayout;

    .line 6
    .line 7
    invoke-direct {v2, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    sget-object v0, Lc5/j;->a:Lc5/j;

    .line 11
    .line 12
    sget p1, Lc5/z;->j:I

    .line 13
    .line 14
    const/16 v3, 0x18

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    invoke-static {p1, v3, v8, v8}, Lc5/j;->i(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v2, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    invoke-virtual {v2, p1}, Landroid/view/View;->setClipToOutline(Z)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    const/16 v7, 0x1e4

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    invoke-static/range {v0 .. v7}, Lc5/j;->f(Lc5/j;Landroid/content/Context;Landroid/view/View;ILw4/x0;Ly6/a;Landroid/view/View;I)V

    .line 37
    .line 38
    .line 39
    new-instance v0, Landroid/widget/ImageView;

    .line 40
    .line 41
    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    sget-object v3, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 45
    .line 46
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 50
    .line 51
    const/4 v4, -0x1

    .line 52
    invoke-direct {v3, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 56
    .line 57
    .line 58
    const/16 v3, 0x50

    .line 59
    .line 60
    iget-boolean v5, p0, Lc5/k0;->i:Z

    .line 61
    .line 62
    if-eqz v5, :cond_0

    .line 63
    .line 64
    new-instance v6, Landroid/view/View;

    .line 65
    .line 66
    invoke-direct {v6, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 67
    .line 68
    .line 69
    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    .line 70
    .line 71
    sget-object v9, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 72
    .line 73
    const/high16 v10, -0x27000000

    .line 74
    .line 75
    filled-new-array {v8, v10}, [I

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    invoke-direct {v7, v9, v10}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 83
    .line 84
    .line 85
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    .line 86
    .line 87
    const/16 v9, 0x68

    .line 88
    .line 89
    invoke-static {v1, v9}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 90
    .line 91
    .line 92
    move-result v9

    .line 93
    invoke-direct {v7, v4, v9, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 97
    .line 98
    .line 99
    :cond_0
    new-instance v6, Landroid/widget/ImageView;

    .line 100
    .line 101
    invoke-direct {v6, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 102
    .line 103
    .line 104
    sget-object v7, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 105
    .line 106
    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 107
    .line 108
    .line 109
    const/16 v7, 0x8

    .line 110
    .line 111
    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 112
    .line 113
    .line 114
    new-instance v9, Landroid/widget/FrameLayout$LayoutParams;

    .line 115
    .line 116
    iget v10, p0, Lc5/k0;->e:I

    .line 117
    .line 118
    int-to-float v10, v10

    .line 119
    const v11, 0x3f47ae14    # 0.78f

    .line 120
    .line 121
    .line 122
    mul-float/2addr v10, v11

    .line 123
    invoke-static {v10}, Lcom/bumptech/glide/d;->f0(F)I

    .line 124
    .line 125
    .line 126
    move-result v10

    .line 127
    iget v11, p0, Lc5/k0;->f:I

    .line 128
    .line 129
    int-to-float v11, v11

    .line 130
    const v12, 0x3ec28f5c    # 0.38f

    .line 131
    .line 132
    .line 133
    mul-float/2addr v11, v12

    .line 134
    invoke-static {v11}, Lcom/bumptech/glide/d;->f0(F)I

    .line 135
    .line 136
    .line 137
    move-result v11

    .line 138
    const/16 v12, 0x51

    .line 139
    .line 140
    invoke-direct {v9, v10, v11, v12}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 141
    .line 142
    .line 143
    const/16 v10, 0xc

    .line 144
    .line 145
    invoke-static {v1, v10}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 146
    .line 147
    .line 148
    move-result v11

    .line 149
    iput v11, v9, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 150
    .line 151
    invoke-virtual {v2, v6, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 152
    .line 153
    .line 154
    new-instance v9, Landroid/widget/TextView;

    .line 155
    .line 156
    invoke-direct {v9, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v9, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 160
    .line 161
    .line 162
    const/4 v11, 0x2

    .line 163
    const/high16 v12, 0x41b80000    # 23.0f

    .line 164
    .line 165
    invoke-virtual {v9, v11, v12}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 166
    .line 167
    .line 168
    const-string v11, "sans-serif-medium"

    .line 169
    .line 170
    invoke-static {v11, p1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 171
    .line 172
    .line 173
    move-result-object v11

    .line 174
    invoke-virtual {v9, v11}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v9, p1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 178
    .line 179
    .line 180
    sget-object p1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 181
    .line 182
    invoke-virtual {v9, p1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 183
    .line 184
    .line 185
    const/16 p1, 0x11

    .line 186
    .line 187
    invoke-virtual {v9, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 188
    .line 189
    .line 190
    const/high16 p1, 0x40000000    # 2.0f

    .line 191
    .line 192
    const/high16 v11, -0x1000000

    .line 193
    .line 194
    const/high16 v12, 0x40800000    # 4.0f

    .line 195
    .line 196
    const/4 v13, 0x0

    .line 197
    invoke-virtual {v9, v12, v13, p1, v11}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    .line 198
    .line 199
    .line 200
    if-eqz v5, :cond_1

    .line 201
    .line 202
    goto :goto_0

    .line 203
    :cond_1
    move v8, v7

    .line 204
    :goto_0
    invoke-virtual {v9, v8}, Landroid/view/View;->setVisibility(I)V

    .line 205
    .line 206
    .line 207
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 208
    .line 209
    const/16 v5, 0x3e

    .line 210
    .line 211
    invoke-static {v1, v5}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    invoke-direct {p1, v4, v5, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 216
    .line 217
    .line 218
    const/16 v3, 0x12

    .line 219
    .line 220
    invoke-static {v1, v3}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    iput v4, p1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 225
    .line 226
    invoke-static {v1, v3}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    iput v3, p1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 231
    .line 232
    invoke-static {v1, v10}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    iput v1, p1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 237
    .line 238
    invoke-virtual {v2, v9, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 239
    .line 240
    .line 241
    new-instance p1, Lc5/i0;

    .line 242
    .line 243
    invoke-direct {p1, v2, v0, v6, v9}, Lc5/i0;-><init>(Landroid/widget/FrameLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    .line 244
    .line 245
    .line 246
    return-object p1
.end method

.method public final f(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lc5/k0;->m:Lm7/c;

    .line 2
    .line 3
    invoke-static {p1}, Li7/x;->c(Lm7/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
