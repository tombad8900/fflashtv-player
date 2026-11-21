.class public final Lr3/i;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lr3/c;

.field public c:Ljava/lang/Object;

.field public d:Lt3/a;

.field public e:Lr3/j;

.field public final f:Ljava/util/List;

.field public g:Lu3/d;

.field public final h:Lokhttp3/y$a;

.field public final i:Ljava/util/LinkedHashMap;

.field public final j:Z

.field public final k:Z

.field public final l:Lq/b;

.field public m:Landroidx/lifecycle/o;

.field public n:Ls3/i;

.field public o:Ls3/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lr3/i;->a:Landroid/content/Context;

    .line 3
    sget-object p1, Lv3/d;->a:Lr3/c;

    .line 4
    iput-object p1, p0, Lr3/i;->b:Lr3/c;

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lr3/i;->c:Ljava/lang/Object;

    .line 6
    iput-object p1, p0, Lr3/i;->d:Lt3/a;

    .line 7
    iput-object p1, p0, Lr3/i;->e:Lr3/j;

    .line 8
    sget-object v0, Lm6/p;->j:Lm6/p;

    iput-object v0, p0, Lr3/i;->f:Ljava/util/List;

    .line 9
    iput-object p1, p0, Lr3/i;->g:Lu3/d;

    .line 10
    iput-object p1, p0, Lr3/i;->h:Lokhttp3/y$a;

    .line 11
    iput-object p1, p0, Lr3/i;->i:Ljava/util/LinkedHashMap;

    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lr3/i;->j:Z

    .line 13
    iput-boolean v0, p0, Lr3/i;->k:Z

    .line 14
    iput-object p1, p0, Lr3/i;->l:Lq/b;

    .line 15
    iput-object p1, p0, Lr3/i;->m:Landroidx/lifecycle/o;

    .line 16
    iput-object p1, p0, Lr3/i;->n:Ls3/i;

    .line 17
    iput-object p1, p0, Lr3/i;->o:Ls3/g;

    return-void
.end method

.method public constructor <init>(Lr3/k;Landroid/content/Context;)V
    .locals 2

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p2, p0, Lr3/i;->a:Landroid/content/Context;

    .line 20
    iget-object v0, p1, Lr3/k;->A:Lr3/c;

    .line 21
    iput-object v0, p0, Lr3/i;->b:Lr3/c;

    .line 22
    iget-object v0, p1, Lr3/k;->b:Ljava/lang/Object;

    .line 23
    iput-object v0, p0, Lr3/i;->c:Ljava/lang/Object;

    .line 24
    iget-object v0, p1, Lr3/k;->c:Lt3/a;

    .line 25
    iput-object v0, p0, Lr3/i;->d:Lt3/a;

    .line 26
    iget-object v0, p1, Lr3/k;->d:Lr3/j;

    .line 27
    iput-object v0, p0, Lr3/i;->e:Lr3/j;

    .line 28
    iget-object v0, p1, Lr3/k;->z:Lr3/d;

    .line 29
    iget-object v1, p1, Lr3/k;->g:Ljava/util/List;

    .line 30
    iput-object v1, p0, Lr3/i;->f:Ljava/util/List;

    .line 31
    iget-object v0, v0, Lr3/d;->a:Lu3/d;

    .line 32
    iput-object v0, p0, Lr3/i;->g:Lu3/d;

    .line 33
    iget-object v0, p1, Lr3/k;->i:Lokhttp3/y;

    .line 34
    invoke-virtual {v0}, Lokhttp3/y;->newBuilder()Lokhttp3/y$a;

    move-result-object v0

    iput-object v0, p0, Lr3/i;->h:Lokhttp3/y$a;

    .line 35
    iget-object v0, p1, Lr3/k;->j:Lr3/s;

    .line 36
    iget-object v0, v0, Lr3/s;->a:Ljava/util/Map;

    .line 37
    invoke-static {v0}, Lm6/s;->Y(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iput-object v0, p0, Lr3/i;->i:Ljava/util/LinkedHashMap;

    .line 38
    iget-boolean v0, p1, Lr3/k;->k:Z

    .line 39
    iput-boolean v0, p0, Lr3/i;->j:Z

    .line 40
    iget-boolean v0, p1, Lr3/k;->n:Z

    .line 41
    iput-boolean v0, p0, Lr3/i;->k:Z

    .line 42
    iget-object v0, p1, Lr3/k;->y:Lr3/p;

    .line 43
    new-instance v1, Lq/b;

    invoke-direct {v1, v0}, Lq/b;-><init>(Lr3/p;)V

    .line 44
    iput-object v1, p0, Lr3/i;->l:Lq/b;

    .line 45
    iget-object v0, p1, Lr3/k;->a:Landroid/content/Context;

    if-ne v0, p2, :cond_0

    .line 46
    iget-object p2, p1, Lr3/k;->v:Landroidx/lifecycle/o;

    .line 47
    iput-object p2, p0, Lr3/i;->m:Landroidx/lifecycle/o;

    .line 48
    iget-object p2, p1, Lr3/k;->w:Ls3/i;

    .line 49
    iput-object p2, p0, Lr3/i;->n:Ls3/i;

    .line 50
    iget-object p1, p1, Lr3/k;->x:Ls3/g;

    .line 51
    iput-object p1, p0, Lr3/i;->o:Ls3/g;

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 52
    iput-object p1, p0, Lr3/i;->m:Landroidx/lifecycle/o;

    .line 53
    iput-object p1, p0, Lr3/i;->n:Ls3/i;

    .line 54
    iput-object p1, p0, Lr3/i;->o:Ls3/g;

    return-void
.end method


# virtual methods
.method public final a()Lr3/k;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lr3/i;->c:Ljava/lang/Object;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    sget-object v1, Lr3/m;->b:Lr3/m;

    .line 8
    .line 9
    :cond_0
    move-object v4, v1

    .line 10
    iget-object v5, v0, Lr3/i;->d:Lt3/a;

    .line 11
    .line 12
    iget-object v6, v0, Lr3/i;->e:Lr3/j;

    .line 13
    .line 14
    iget-object v1, v0, Lr3/i;->b:Lr3/c;

    .line 15
    .line 16
    iget-object v7, v1, Lr3/c;->g:Landroid/graphics/Bitmap$Config;

    .line 17
    .line 18
    iget-object v8, v1, Lr3/c;->f:Ls3/d;

    .line 19
    .line 20
    iget-object v2, v0, Lr3/i;->g:Lu3/d;

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    iget-object v2, v1, Lr3/c;->e:Lu3/b;

    .line 25
    .line 26
    :cond_1
    move-object v10, v2

    .line 27
    iget-object v2, v0, Lr3/i;->h:Lokhttp3/y$a;

    .line 28
    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {v2}, Lokhttp3/y$a;->build()Lokhttp3/y;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const/4 v2, 0x0

    .line 37
    :goto_0
    if-nez v2, :cond_3

    .line 38
    .line 39
    sget-object v2, Lv3/f;->c:Lokhttp3/y;

    .line 40
    .line 41
    :goto_1
    move-object v11, v2

    .line 42
    goto :goto_2

    .line 43
    :cond_3
    sget-object v3, Lv3/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :goto_2
    iget-object v2, v0, Lr3/i;->i:Ljava/util/LinkedHashMap;

    .line 47
    .line 48
    if-eqz v2, :cond_4

    .line 49
    .line 50
    new-instance v3, Lr3/s;

    .line 51
    .line 52
    invoke-static {v2}, Lt2/i0;->G(Ljava/util/Map;)Ljava/util/Map;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-direct {v3, v2}, Lr3/s;-><init>(Ljava/util/Map;)V

    .line 57
    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_4
    const/4 v3, 0x0

    .line 61
    :goto_3
    if-nez v3, :cond_5

    .line 62
    .line 63
    sget-object v3, Lr3/s;->b:Lr3/s;

    .line 64
    .line 65
    :cond_5
    move-object v12, v3

    .line 66
    iget-object v2, v0, Lr3/i;->b:Lr3/c;

    .line 67
    .line 68
    iget-boolean v14, v2, Lr3/c;->h:Z

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-object v2, v0, Lr3/i;->b:Lr3/c;

    .line 74
    .line 75
    iget-object v3, v2, Lr3/c;->i:Lr3/b;

    .line 76
    .line 77
    iget-object v9, v2, Lr3/c;->j:Lr3/b;

    .line 78
    .line 79
    iget-object v13, v2, Lr3/c;->k:Lr3/b;

    .line 80
    .line 81
    iget-object v15, v2, Lr3/c;->a:Li7/r;

    .line 82
    .line 83
    iget-object v1, v2, Lr3/c;->b:Li7/r;

    .line 84
    .line 85
    move-object/from16 v21, v1

    .line 86
    .line 87
    iget-object v1, v2, Lr3/c;->c:Li7/r;

    .line 88
    .line 89
    iget-object v2, v2, Lr3/c;->d:Li7/r;

    .line 90
    .line 91
    move-object/from16 v22, v1

    .line 92
    .line 93
    iget-object v1, v0, Lr3/i;->m:Landroidx/lifecycle/o;

    .line 94
    .line 95
    move-object/from16 v17, v3

    .line 96
    .line 97
    iget-object v3, v0, Lr3/i;->a:Landroid/content/Context;

    .line 98
    .line 99
    if-nez v1, :cond_a

    .line 100
    .line 101
    iget-object v1, v0, Lr3/i;->d:Lt3/a;

    .line 102
    .line 103
    move-object/from16 v23, v2

    .line 104
    .line 105
    instance-of v2, v1, Lt3/a;

    .line 106
    .line 107
    if-eqz v2, :cond_6

    .line 108
    .line 109
    iget-object v1, v1, Lt3/a;->k:Landroid/widget/ImageView;

    .line 110
    .line 111
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    goto :goto_4

    .line 116
    :cond_6
    move-object v1, v3

    .line 117
    :goto_4
    instance-of v2, v1, Landroidx/lifecycle/v;

    .line 118
    .line 119
    if-eqz v2, :cond_7

    .line 120
    .line 121
    check-cast v1, Landroidx/lifecycle/v;

    .line 122
    .line 123
    invoke-interface {v1}, Landroidx/lifecycle/v;->e()Landroidx/lifecycle/o;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    goto :goto_5

    .line 128
    :cond_7
    instance-of v2, v1, Landroid/content/ContextWrapper;

    .line 129
    .line 130
    if-nez v2, :cond_9

    .line 131
    .line 132
    const/4 v1, 0x0

    .line 133
    :goto_5
    if-nez v1, :cond_8

    .line 134
    .line 135
    sget-object v1, Lr3/h;->k:Lr3/h;

    .line 136
    .line 137
    :cond_8
    :goto_6
    move-object/from16 v24, v1

    .line 138
    .line 139
    goto :goto_7

    .line 140
    :cond_9
    check-cast v1, Landroid/content/ContextWrapper;

    .line 141
    .line 142
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    goto :goto_4

    .line 147
    :cond_a
    move-object/from16 v23, v2

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :goto_7
    iget-object v1, v0, Lr3/i;->n:Ls3/i;

    .line 151
    .line 152
    if-nez v1, :cond_e

    .line 153
    .line 154
    iget-object v1, v0, Lr3/i;->d:Lt3/a;

    .line 155
    .line 156
    instance-of v2, v1, Lt3/a;

    .line 157
    .line 158
    if-eqz v2, :cond_d

    .line 159
    .line 160
    iget-object v1, v1, Lt3/a;->k:Landroid/widget/ImageView;

    .line 161
    .line 162
    invoke-virtual {v1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    move-object/from16 v18, v4

    .line 167
    .line 168
    sget-object v4, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    .line 169
    .line 170
    if-eq v2, v4, :cond_c

    .line 171
    .line 172
    sget-object v4, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    .line 173
    .line 174
    if-ne v2, v4, :cond_b

    .line 175
    .line 176
    goto :goto_8

    .line 177
    :cond_b
    new-instance v2, Ls3/f;

    .line 178
    .line 179
    invoke-direct {v2, v1}, Ls3/f;-><init>(Landroid/widget/ImageView;)V

    .line 180
    .line 181
    .line 182
    move-object v1, v2

    .line 183
    goto :goto_9

    .line 184
    :cond_c
    :goto_8
    sget-object v1, Ls3/h;->c:Ls3/h;

    .line 185
    .line 186
    new-instance v1, Ls3/e;

    .line 187
    .line 188
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 189
    .line 190
    .line 191
    goto :goto_9

    .line 192
    :cond_d
    move-object/from16 v18, v4

    .line 193
    .line 194
    new-instance v1, Ls3/c;

    .line 195
    .line 196
    invoke-direct {v1, v3}, Ls3/c;-><init>(Landroid/content/Context;)V

    .line 197
    .line 198
    .line 199
    :goto_9
    move-object/from16 v25, v1

    .line 200
    .line 201
    goto :goto_a

    .line 202
    :cond_e
    move-object/from16 v18, v4

    .line 203
    .line 204
    goto :goto_9

    .line 205
    :goto_a
    iget-object v1, v0, Lr3/i;->o:Ls3/g;

    .line 206
    .line 207
    if-nez v1, :cond_14

    .line 208
    .line 209
    iget-object v1, v0, Lr3/i;->d:Lt3/a;

    .line 210
    .line 211
    instance-of v2, v1, Lt3/a;

    .line 212
    .line 213
    if-eqz v2, :cond_f

    .line 214
    .line 215
    goto :goto_b

    .line 216
    :cond_f
    const/4 v1, 0x0

    .line 217
    :goto_b
    if-eqz v1, :cond_10

    .line 218
    .line 219
    iget-object v1, v1, Lt3/a;->k:Landroid/widget/ImageView;

    .line 220
    .line 221
    goto :goto_c

    .line 222
    :cond_10
    const/4 v1, 0x0

    .line 223
    :goto_c
    if-eqz v1, :cond_13

    .line 224
    .line 225
    sget-object v2, Lv3/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 226
    .line 227
    invoke-virtual {v1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    if-nez v1, :cond_11

    .line 232
    .line 233
    const/4 v1, -0x1

    .line 234
    goto :goto_d

    .line 235
    :cond_11
    sget-object v2, Lv3/e;->a:[I

    .line 236
    .line 237
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    aget v1, v2, v1

    .line 242
    .line 243
    :goto_d
    const/4 v2, 0x1

    .line 244
    if-eq v1, v2, :cond_12

    .line 245
    .line 246
    const/4 v2, 0x2

    .line 247
    if-eq v1, v2, :cond_12

    .line 248
    .line 249
    const/4 v2, 0x3

    .line 250
    if-eq v1, v2, :cond_12

    .line 251
    .line 252
    const/4 v2, 0x4

    .line 253
    if-eq v1, v2, :cond_12

    .line 254
    .line 255
    sget-object v1, Ls3/g;->j:Ls3/g;

    .line 256
    .line 257
    goto :goto_e

    .line 258
    :cond_12
    sget-object v1, Ls3/g;->k:Ls3/g;

    .line 259
    .line 260
    goto :goto_e

    .line 261
    :cond_13
    sget-object v1, Ls3/g;->k:Ls3/g;

    .line 262
    .line 263
    :cond_14
    :goto_e
    move-object/from16 v26, v1

    .line 264
    .line 265
    iget-object v1, v0, Lr3/i;->l:Lq/b;

    .line 266
    .line 267
    if-eqz v1, :cond_15

    .line 268
    .line 269
    new-instance v2, Lr3/p;

    .line 270
    .line 271
    iget-object v1, v1, Lq/b;->a:Ljava/util/LinkedHashMap;

    .line 272
    .line 273
    invoke-static {v1}, Lt2/i0;->G(Ljava/util/Map;)Ljava/util/Map;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-direct {v2, v1}, Lr3/p;-><init>(Ljava/util/Map;)V

    .line 278
    .line 279
    .line 280
    move-object v1, v2

    .line 281
    goto :goto_f

    .line 282
    :cond_15
    const/4 v1, 0x0

    .line 283
    :goto_f
    if-nez v1, :cond_16

    .line 284
    .line 285
    sget-object v1, Lr3/p;->k:Lr3/p;

    .line 286
    .line 287
    :cond_16
    move-object/from16 v27, v1

    .line 288
    .line 289
    new-instance v1, Lr3/d;

    .line 290
    .line 291
    iget-object v2, v0, Lr3/i;->g:Lu3/d;

    .line 292
    .line 293
    invoke-direct {v1, v2}, Lr3/d;-><init>(Lu3/d;)V

    .line 294
    .line 295
    .line 296
    iget-object v2, v0, Lr3/i;->b:Lr3/c;

    .line 297
    .line 298
    move-object/from16 v29, v2

    .line 299
    .line 300
    new-instance v2, Lr3/k;

    .line 301
    .line 302
    move-object/from16 v4, v18

    .line 303
    .line 304
    move-object/from16 v18, v9

    .line 305
    .line 306
    iget-object v9, v0, Lr3/i;->f:Ljava/util/List;

    .line 307
    .line 308
    move-object/from16 v19, v13

    .line 309
    .line 310
    iget-boolean v13, v0, Lr3/i;->j:Z

    .line 311
    .line 312
    move-object/from16 v20, v15

    .line 313
    .line 314
    iget-boolean v15, v0, Lr3/i;->k:Z

    .line 315
    .line 316
    move-object/from16 v28, v1

    .line 317
    .line 318
    move/from16 v16, v15

    .line 319
    .line 320
    const/4 v15, 0x0

    .line 321
    invoke-direct/range {v2 .. v29}, Lr3/k;-><init>(Landroid/content/Context;Ljava/lang/Object;Lt3/a;Lr3/j;Landroid/graphics/Bitmap$Config;Ls3/d;Ljava/util/List;Lu3/d;Lokhttp3/y;Lr3/s;ZZZZLr3/b;Lr3/b;Lr3/b;Li7/r;Li7/r;Li7/r;Li7/r;Landroidx/lifecycle/o;Ls3/i;Ls3/g;Lr3/p;Lr3/d;Lr3/c;)V

    .line 322
    .line 323
    .line 324
    return-object v2
.end method
