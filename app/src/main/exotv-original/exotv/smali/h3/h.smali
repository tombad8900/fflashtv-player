.class public final Lh3/h;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lr3/c;

.field public final c:Ll6/g;

.field public final d:Lv3/j;

.field public final e:Lm7/c;

.field public final f:La4/c;

.field public final g:Lh3/c;

.field public final h:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lr3/c;Ll6/g;Ll6/g;Ll6/g;Lh3/c;Lv3/j;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p1

    .line 9
    .line 10
    iput-object v2, v0, Lh3/h;->a:Landroid/content/Context;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    iput-object v2, v0, Lh3/h;->b:Lr3/c;

    .line 15
    .line 16
    move-object/from16 v2, p3

    .line 17
    .line 18
    iput-object v2, v0, Lh3/h;->c:Ll6/g;

    .line 19
    .line 20
    iput-object v1, v0, Lh3/h;->d:Lv3/j;

    .line 21
    .line 22
    new-instance v2, Li7/f1;

    .line 23
    .line 24
    invoke-direct {v2}, Li7/u0;-><init>()V

    .line 25
    .line 26
    .line 27
    sget-object v3, Li7/e0;->a:Lo7/e;

    .line 28
    .line 29
    sget-object v3, Lm7/n;->a:Lj7/d;

    .line 30
    .line 31
    iget-object v3, v3, Lj7/d;->n:Lj7/d;

    .line 32
    .line 33
    invoke-static {v2, v3}, Lcom/bumptech/glide/c;->W(Lp6/f;Lp6/h;)Lp6/h;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    new-instance v3, Lh3/g;

    .line 38
    .line 39
    sget-object v4, Li7/s;->j:Li7/s;

    .line 40
    .line 41
    invoke-direct {v3, v4}, Lp6/a;-><init>(Lp6/g;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v2, v3}, Lp6/h;->c(Lp6/h;)Lp6/h;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {v2}, Li7/x;->a(Lp6/h;)Lm7/c;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iput-object v2, v0, Lh3/h;->e:Lm7/c;

    .line 53
    .line 54
    new-instance v2, Lv3/l;

    .line 55
    .line 56
    invoke-direct {v2, v0}, Lv3/l;-><init>(Lh3/h;)V

    .line 57
    .line 58
    .line 59
    new-instance v3, La4/c;

    .line 60
    .line 61
    invoke-direct {v3, v0, v2}, La4/c;-><init>(Lh3/h;Lv3/l;)V

    .line 62
    .line 63
    .line 64
    iput-object v3, v0, Lh3/h;->f:La4/c;

    .line 65
    .line 66
    new-instance v4, Lh3/b;

    .line 67
    .line 68
    move-object/from16 v5, p6

    .line 69
    .line 70
    invoke-direct {v4, v5}, Lh3/b;-><init>(Lh3/c;)V

    .line 71
    .line 72
    .line 73
    new-instance v5, Lo3/a;

    .line 74
    .line 75
    const/4 v6, 0x2

    .line 76
    invoke-direct {v5, v6}, Lo3/a;-><init>(I)V

    .line 77
    .line 78
    .line 79
    const-class v7, Lokhttp3/z;

    .line 80
    .line 81
    invoke-virtual {v4, v5, v7}, Lh3/b;->b(Lo3/a;Ljava/lang/Class;)V

    .line 82
    .line 83
    .line 84
    new-instance v5, Lo3/a;

    .line 85
    .line 86
    const/4 v7, 0x5

    .line 87
    invoke-direct {v5, v7}, Lo3/a;-><init>(I)V

    .line 88
    .line 89
    .line 90
    const-class v8, Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v4, v5, v8}, Lh3/b;->b(Lo3/a;Ljava/lang/Class;)V

    .line 93
    .line 94
    .line 95
    new-instance v5, Lo3/a;

    .line 96
    .line 97
    const/4 v8, 0x1

    .line 98
    invoke-direct {v5, v8}, Lo3/a;-><init>(I)V

    .line 99
    .line 100
    .line 101
    const-class v9, Landroid/net/Uri;

    .line 102
    .line 103
    invoke-virtual {v4, v5, v9}, Lh3/b;->b(Lo3/a;Ljava/lang/Class;)V

    .line 104
    .line 105
    .line 106
    new-instance v5, Lo3/a;

    .line 107
    .line 108
    const/4 v10, 0x4

    .line 109
    invoke-direct {v5, v10}, Lo3/a;-><init>(I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4, v5, v9}, Lh3/b;->b(Lo3/a;Ljava/lang/Class;)V

    .line 113
    .line 114
    .line 115
    new-instance v5, Lo3/a;

    .line 116
    .line 117
    const/4 v11, 0x3

    .line 118
    invoke-direct {v5, v11}, Lo3/a;-><init>(I)V

    .line 119
    .line 120
    .line 121
    const-class v12, Ljava/lang/Integer;

    .line 122
    .line 123
    invoke-virtual {v4, v5, v12}, Lh3/b;->b(Lo3/a;Ljava/lang/Class;)V

    .line 124
    .line 125
    .line 126
    new-instance v5, Lo3/a;

    .line 127
    .line 128
    const/4 v12, 0x0

    .line 129
    invoke-direct {v5, v12}, Lo3/a;-><init>(I)V

    .line 130
    .line 131
    .line 132
    const-class v13, [B

    .line 133
    .line 134
    invoke-virtual {v4, v5, v13}, Lh3/b;->b(Lo3/a;Ljava/lang/Class;)V

    .line 135
    .line 136
    .line 137
    new-instance v5, Ln3/c;

    .line 138
    .line 139
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 140
    .line 141
    .line 142
    iget-object v13, v4, Lh3/b;->l:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v13, Ljava/util/ArrayList;

    .line 145
    .line 146
    new-instance v14, Ll6/d;

    .line 147
    .line 148
    invoke-direct {v14, v5, v9}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    new-instance v5, Ln3/a;

    .line 155
    .line 156
    iget-boolean v14, v1, Lv3/j;->a:Z

    .line 157
    .line 158
    invoke-direct {v5, v14}, Ln3/a;-><init>(Z)V

    .line 159
    .line 160
    .line 161
    new-instance v14, Ll6/d;

    .line 162
    .line 163
    const-class v15, Ljava/io/File;

    .line 164
    .line 165
    invoke-direct {v14, v5, v15}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    new-instance v5, Ll3/j;

    .line 172
    .line 173
    iget-boolean v14, v1, Lv3/j;->c:Z

    .line 174
    .line 175
    move-object/from16 v6, p4

    .line 176
    .line 177
    move-object/from16 v8, p5

    .line 178
    .line 179
    invoke-direct {v5, v8, v6, v14}, Ll3/j;-><init>(Ll6/g;Ll6/g;Z)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4, v5, v9}, Lh3/b;->a(Ll3/g;Ljava/lang/Class;)V

    .line 183
    .line 184
    .line 185
    new-instance v5, Ll3/a;

    .line 186
    .line 187
    invoke-direct {v5, v7}, Ll3/a;-><init>(I)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4, v5, v15}, Lh3/b;->a(Ll3/g;Ljava/lang/Class;)V

    .line 191
    .line 192
    .line 193
    new-instance v5, Ll3/a;

    .line 194
    .line 195
    invoke-direct {v5, v12}, Ll3/a;-><init>(I)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v4, v5, v9}, Lh3/b;->a(Ll3/g;Ljava/lang/Class;)V

    .line 199
    .line 200
    .line 201
    new-instance v5, Ll3/a;

    .line 202
    .line 203
    invoke-direct {v5, v11}, Ll3/a;-><init>(I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v4, v5, v9}, Lh3/b;->a(Ll3/g;Ljava/lang/Class;)V

    .line 207
    .line 208
    .line 209
    new-instance v5, Ll3/a;

    .line 210
    .line 211
    const/4 v6, 0x6

    .line 212
    invoke-direct {v5, v6}, Ll3/a;-><init>(I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v4, v5, v9}, Lh3/b;->a(Ll3/g;Ljava/lang/Class;)V

    .line 216
    .line 217
    .line 218
    new-instance v5, Ll3/a;

    .line 219
    .line 220
    invoke-direct {v5, v10}, Ll3/a;-><init>(I)V

    .line 221
    .line 222
    .line 223
    const-class v6, Landroid/graphics/drawable/Drawable;

    .line 224
    .line 225
    invoke-virtual {v4, v5, v6}, Lh3/b;->a(Ll3/g;Ljava/lang/Class;)V

    .line 226
    .line 227
    .line 228
    new-instance v5, Ll3/a;

    .line 229
    .line 230
    const/4 v6, 0x1

    .line 231
    invoke-direct {v5, v6}, Ll3/a;-><init>(I)V

    .line 232
    .line 233
    .line 234
    const-class v6, Landroid/graphics/Bitmap;

    .line 235
    .line 236
    invoke-virtual {v4, v5, v6}, Lh3/b;->a(Ll3/g;Ljava/lang/Class;)V

    .line 237
    .line 238
    .line 239
    new-instance v5, Ll3/a;

    .line 240
    .line 241
    const/4 v6, 0x2

    .line 242
    invoke-direct {v5, v6}, Ll3/a;-><init>(I)V

    .line 243
    .line 244
    .line 245
    const-class v6, Ljava/nio/ByteBuffer;

    .line 246
    .line 247
    invoke-virtual {v4, v5, v6}, Lh3/b;->a(Ll3/g;Ljava/lang/Class;)V

    .line 248
    .line 249
    .line 250
    new-instance v5, Li3/c;

    .line 251
    .line 252
    iget v6, v1, Lv3/j;->d:I

    .line 253
    .line 254
    iget-object v1, v1, Lv3/j;->e:Li3/k;

    .line 255
    .line 256
    invoke-direct {v5, v6, v1}, Li3/c;-><init>(ILi3/k;)V

    .line 257
    .line 258
    .line 259
    iget-object v1, v4, Lh3/b;->n:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v1, Ljava/util/ArrayList;

    .line 262
    .line 263
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    new-instance v5, Lh3/c;

    .line 267
    .line 268
    iget-object v6, v4, Lh3/b;->j:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v6, Ljava/util/ArrayList;

    .line 271
    .line 272
    invoke-static {v6}, Lt2/i0;->F(Ljava/util/ArrayList;)Ljava/util/List;

    .line 273
    .line 274
    .line 275
    move-result-object v6

    .line 276
    iget-object v7, v4, Lh3/b;->k:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v7, Ljava/util/ArrayList;

    .line 279
    .line 280
    invoke-static {v7}, Lt2/i0;->F(Ljava/util/ArrayList;)Ljava/util/List;

    .line 281
    .line 282
    .line 283
    move-result-object v7

    .line 284
    invoke-static {v13}, Lt2/i0;->F(Ljava/util/ArrayList;)Ljava/util/List;

    .line 285
    .line 286
    .line 287
    move-result-object v8

    .line 288
    iget-object v4, v4, Lh3/b;->m:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v4, Ljava/util/ArrayList;

    .line 291
    .line 292
    invoke-static {v4}, Lt2/i0;->F(Ljava/util/ArrayList;)Ljava/util/List;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    invoke-static {v1}, Lt2/i0;->F(Ljava/util/ArrayList;)Ljava/util/List;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    move-object/from16 p6, v1

    .line 301
    .line 302
    move-object/from16 p5, v4

    .line 303
    .line 304
    move-object/from16 p1, v5

    .line 305
    .line 306
    move-object/from16 p2, v6

    .line 307
    .line 308
    move-object/from16 p3, v7

    .line 309
    .line 310
    move-object/from16 p4, v8

    .line 311
    .line 312
    invoke-direct/range {p1 .. p6}, Lh3/c;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 313
    .line 314
    .line 315
    move-object/from16 v1, p1

    .line 316
    .line 317
    move-object/from16 v4, p2

    .line 318
    .line 319
    iput-object v1, v0, Lh3/h;->g:Lh3/c;

    .line 320
    .line 321
    new-instance v1, Lm3/h;

    .line 322
    .line 323
    invoke-direct {v1, v0, v2, v3}, Lm3/h;-><init>(Lh3/h;Lv3/l;La4/c;)V

    .line 324
    .line 325
    .line 326
    invoke-static {v4, v1}, Lm6/h;->I0(Ljava/util/List;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    iput-object v1, v0, Lh3/h;->h:Ljava/util/ArrayList;

    .line 331
    .line 332
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 333
    .line 334
    invoke-direct {v1, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 335
    .line 336
    .line 337
    return-void
.end method

.method public static final a(Lh3/h;Lr3/k;Lr6/c;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    instance-of v2, v0, Lh3/f;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    move-object v2, v0

    .line 12
    check-cast v2, Lh3/f;

    .line 13
    .line 14
    iget v3, v2, Lh3/f;->t:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v3, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v3, v5

    .line 23
    iput v3, v2, Lh3/f;->t:I

    .line 24
    .line 25
    :goto_0
    move-object v0, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v2, Lh3/f;

    .line 28
    .line 29
    invoke-direct {v2, v1, v0}, Lh3/f;-><init>(Lh3/h;Lr6/c;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v2, v0, Lh3/f;->r:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v8, Lq6/a;->j:Lq6/a;

    .line 36
    .line 37
    iget v3, v0, Lh3/f;->t:I

    .line 38
    .line 39
    const/4 v9, 0x3

    .line 40
    const/4 v10, 0x2

    .line 41
    const/4 v11, 0x1

    .line 42
    const/4 v12, 0x0

    .line 43
    if-eqz v3, :cond_4

    .line 44
    .line 45
    if-eq v3, v11, :cond_3

    .line 46
    .line 47
    if-eq v3, v10, :cond_2

    .line 48
    .line 49
    if-ne v3, v9, :cond_1

    .line 50
    .line 51
    iget-object v1, v0, Lh3/f;->p:Lh3/d;

    .line 52
    .line 53
    iget-object v3, v0, Lh3/f;->o:Lr3/k;

    .line 54
    .line 55
    iget-object v4, v0, Lh3/f;->n:Lr3/q;

    .line 56
    .line 57
    iget-object v5, v0, Lh3/f;->m:Lh3/h;

    .line 58
    .line 59
    :try_start_0
    invoke-static {v2}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    move-object v15, v5

    .line 63
    goto/16 :goto_7

    .line 64
    .line 65
    :catchall_0
    move-exception v0

    .line 66
    move-object v2, v4

    .line 67
    move-object v4, v1

    .line 68
    move-object v1, v5

    .line 69
    goto/16 :goto_b

    .line 70
    .line 71
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 74
    .line 75
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v0

    .line 79
    :cond_2
    iget-object v1, v0, Lh3/f;->q:Landroid/graphics/Bitmap;

    .line 80
    .line 81
    iget-object v3, v0, Lh3/f;->p:Lh3/d;

    .line 82
    .line 83
    iget-object v4, v0, Lh3/f;->o:Lr3/k;

    .line 84
    .line 85
    iget-object v5, v0, Lh3/f;->n:Lr3/q;

    .line 86
    .line 87
    iget-object v6, v0, Lh3/f;->m:Lh3/h;

    .line 88
    .line 89
    :try_start_1
    invoke-static {v2}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 90
    .line 91
    .line 92
    move-object/from16 v18, v1

    .line 93
    .line 94
    move-object/from16 v17, v3

    .line 95
    .line 96
    move-object v14, v4

    .line 97
    move-object v4, v5

    .line 98
    move-object v15, v6

    .line 99
    goto/16 :goto_5

    .line 100
    .line 101
    :catchall_1
    move-exception v0

    .line 102
    move-object v1, v4

    .line 103
    move-object v4, v3

    .line 104
    move-object v3, v1

    .line 105
    move-object v2, v5

    .line 106
    move-object v1, v6

    .line 107
    goto/16 :goto_b

    .line 108
    .line 109
    :cond_3
    iget-object v1, v0, Lh3/f;->p:Lh3/d;

    .line 110
    .line 111
    iget-object v3, v0, Lh3/f;->o:Lr3/k;

    .line 112
    .line 113
    iget-object v4, v0, Lh3/f;->n:Lr3/q;

    .line 114
    .line 115
    iget-object v5, v0, Lh3/f;->m:Lh3/h;

    .line 116
    .line 117
    :try_start_2
    invoke-static {v2}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 118
    .line 119
    .line 120
    move-object v2, v4

    .line 121
    move-object v4, v1

    .line 122
    move-object v1, v5

    .line 123
    goto :goto_3

    .line 124
    :cond_4
    invoke-static {v2}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    iget-object v2, v1, Lh3/h;->f:La4/c;

    .line 128
    .line 129
    iget-object v3, v0, Lr6/c;->k:Lp6/h;

    .line 130
    .line 131
    invoke-static {v3}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v3}, Li7/x;->g(Lp6/h;)Li7/s0;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    iget-object v6, v4, Lr3/k;->v:Landroidx/lifecycle/o;

    .line 142
    .line 143
    iget-object v5, v4, Lr3/k;->c:Lt3/a;

    .line 144
    .line 145
    instance-of v3, v5, Lt3/a;

    .line 146
    .line 147
    if-eqz v3, :cond_5

    .line 148
    .line 149
    new-instance v3, Lr3/t;

    .line 150
    .line 151
    iget-object v2, v2, La4/c;->k:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v2, Lh3/h;

    .line 154
    .line 155
    move-object/from16 v21, v3

    .line 156
    .line 157
    move-object v3, v2

    .line 158
    move-object/from16 v2, v21

    .line 159
    .line 160
    invoke-direct/range {v2 .. v7}, Lr3/t;-><init>(Lh3/h;Lr3/k;Lt3/a;Landroidx/lifecycle/o;Li7/s0;)V

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_5
    new-instance v2, Lr3/a;

    .line 165
    .line 166
    invoke-direct {v2, v6, v7}, Lr3/a;-><init>(Landroidx/lifecycle/o;Li7/s0;)V

    .line 167
    .line 168
    .line 169
    :goto_2
    invoke-interface {v2}, Lr3/q;->g()V

    .line 170
    .line 171
    .line 172
    iget-object v3, v4, Lr3/k;->a:Landroid/content/Context;

    .line 173
    .line 174
    new-instance v5, Lr3/i;

    .line 175
    .line 176
    invoke-direct {v5, v4, v3}, Lr3/i;-><init>(Lr3/k;Landroid/content/Context;)V

    .line 177
    .line 178
    .line 179
    iget-object v3, v1, Lh3/h;->b:Lr3/c;

    .line 180
    .line 181
    iput-object v3, v5, Lr3/i;->b:Lr3/c;

    .line 182
    .line 183
    iput-object v12, v5, Lr3/i;->o:Ls3/g;

    .line 184
    .line 185
    invoke-virtual {v5}, Lr3/i;->a()Lr3/k;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    sget-object v4, Lh3/d;->j:Lh3/d;

    .line 190
    .line 191
    :try_start_3
    iget-object v5, v3, Lr3/k;->b:Ljava/lang/Object;

    .line 192
    .line 193
    sget-object v6, Lr3/m;->b:Lr3/m;

    .line 194
    .line 195
    if-eq v5, v6, :cond_d

    .line 196
    .line 197
    invoke-interface {v2}, Lr3/q;->start()V

    .line 198
    .line 199
    .line 200
    iget-object v5, v3, Lr3/k;->v:Landroidx/lifecycle/o;

    .line 201
    .line 202
    iput-object v1, v0, Lh3/f;->m:Lh3/h;

    .line 203
    .line 204
    iput-object v2, v0, Lh3/f;->n:Lr3/q;

    .line 205
    .line 206
    iput-object v3, v0, Lh3/f;->o:Lr3/k;

    .line 207
    .line 208
    iput-object v4, v0, Lh3/f;->p:Lh3/d;

    .line 209
    .line 210
    iput v11, v0, Lh3/f;->t:I

    .line 211
    .line 212
    invoke-static {v5, v0}, Lt2/w;->b(Landroidx/lifecycle/o;Lr6/c;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    if-ne v5, v8, :cond_6

    .line 217
    .line 218
    goto :goto_6

    .line 219
    :cond_6
    :goto_3
    iget-object v5, v1, Lh3/h;->c:Ll6/g;

    .line 220
    .line 221
    invoke-virtual {v5}, Ll6/g;->getValue()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    check-cast v5, Lp3/c;

    .line 226
    .line 227
    if-eqz v5, :cond_7

    .line 228
    .line 229
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    goto :goto_4

    .line 233
    :catchall_2
    move-exception v0

    .line 234
    goto/16 :goto_b

    .line 235
    .line 236
    :cond_7
    :goto_4
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    iget-object v5, v3, Lr3/k;->A:Lr3/c;

    .line 240
    .line 241
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    sget-object v5, Lv3/d;->a:Lr3/c;

    .line 245
    .line 246
    iget-object v5, v3, Lr3/k;->c:Lt3/a;

    .line 247
    .line 248
    if-eqz v5, :cond_8

    .line 249
    .line 250
    invoke-virtual {v5, v12}, Lt3/a;->d(Landroid/graphics/drawable/Drawable;)V

    .line 251
    .line 252
    .line 253
    :cond_8
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    iget-object v5, v3, Lr3/k;->w:Ls3/i;

    .line 257
    .line 258
    iput-object v1, v0, Lh3/f;->m:Lh3/h;

    .line 259
    .line 260
    iput-object v2, v0, Lh3/f;->n:Lr3/q;

    .line 261
    .line 262
    iput-object v3, v0, Lh3/f;->o:Lr3/k;

    .line 263
    .line 264
    iput-object v4, v0, Lh3/f;->p:Lh3/d;

    .line 265
    .line 266
    iput-object v12, v0, Lh3/f;->q:Landroid/graphics/Bitmap;

    .line 267
    .line 268
    iput v10, v0, Lh3/f;->t:I

    .line 269
    .line 270
    invoke-interface {v5, v0}, Ls3/i;->a(Lh3/f;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 274
    if-ne v5, v8, :cond_9

    .line 275
    .line 276
    goto :goto_6

    .line 277
    :cond_9
    move-object v15, v1

    .line 278
    move-object v14, v3

    .line 279
    move-object/from16 v17, v4

    .line 280
    .line 281
    move-object/from16 v18, v12

    .line 282
    .line 283
    move-object v4, v2

    .line 284
    move-object v2, v5

    .line 285
    :goto_5
    :try_start_4
    move-object/from16 v16, v2

    .line 286
    .line 287
    check-cast v16, Ls3/h;

    .line 288
    .line 289
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    iget-object v1, v14, Lr3/k;->r:Li7/r;

    .line 293
    .line 294
    new-instance v13, Lc5/j0;

    .line 295
    .line 296
    const/16 v19, 0x0

    .line 297
    .line 298
    const/16 v20, 0x1

    .line 299
    .line 300
    invoke-direct/range {v13 .. v20}, Lc5/j0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lp6/c;I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 301
    .line 302
    .line 303
    move-object/from16 v3, v17

    .line 304
    .line 305
    :try_start_5
    iput-object v15, v0, Lh3/f;->m:Lh3/h;

    .line 306
    .line 307
    iput-object v4, v0, Lh3/f;->n:Lr3/q;

    .line 308
    .line 309
    iput-object v14, v0, Lh3/f;->o:Lr3/k;

    .line 310
    .line 311
    iput-object v3, v0, Lh3/f;->p:Lh3/d;

    .line 312
    .line 313
    iput-object v12, v0, Lh3/f;->q:Landroid/graphics/Bitmap;

    .line 314
    .line 315
    iput v9, v0, Lh3/f;->t:I

    .line 316
    .line 317
    invoke-static {v1, v13, v0}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 321
    if-ne v2, v8, :cond_a

    .line 322
    .line 323
    :goto_6
    return-object v8

    .line 324
    :cond_a
    move-object v1, v3

    .line 325
    move-object v3, v14

    .line 326
    :goto_7
    :try_start_6
    check-cast v2, Lr3/l;

    .line 327
    .line 328
    instance-of v0, v2, Lr3/r;

    .line 329
    .line 330
    if-eqz v0, :cond_b

    .line 331
    .line 332
    move-object v0, v2

    .line 333
    check-cast v0, Lr3/r;

    .line 334
    .line 335
    iget-object v5, v3, Lr3/k;->c:Lt3/a;

    .line 336
    .line 337
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    invoke-static {v0, v5, v1}, Lh3/h;->d(Lr3/r;Lt3/a;Lh3/d;)V

    .line 341
    .line 342
    .line 343
    goto :goto_9

    .line 344
    :goto_8
    move-object v2, v4

    .line 345
    move-object v4, v1

    .line 346
    move-object v1, v15

    .line 347
    goto :goto_b

    .line 348
    :catchall_3
    move-exception v0

    .line 349
    goto :goto_8

    .line 350
    :cond_b
    instance-of v0, v2, Lr3/f;

    .line 351
    .line 352
    if-eqz v0, :cond_c

    .line 353
    .line 354
    move-object v0, v2

    .line 355
    check-cast v0, Lr3/f;

    .line 356
    .line 357
    iget-object v5, v3, Lr3/k;->c:Lt3/a;

    .line 358
    .line 359
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    invoke-static {v0, v5, v1}, Lh3/h;->c(Lr3/f;Lt3/a;Lh3/d;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 363
    .line 364
    .line 365
    :goto_9
    invoke-interface {v4}, Lr3/q;->k()V

    .line 366
    .line 367
    .line 368
    return-object v2

    .line 369
    :cond_c
    :try_start_7
    new-instance v0, La1/u;

    .line 370
    .line 371
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 372
    .line 373
    .line 374
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 375
    :catchall_4
    move-exception v0

    .line 376
    :goto_a
    move-object v2, v4

    .line 377
    move-object v1, v15

    .line 378
    move-object v4, v3

    .line 379
    move-object v3, v14

    .line 380
    goto :goto_b

    .line 381
    :catchall_5
    move-exception v0

    .line 382
    move-object/from16 v3, v17

    .line 383
    .line 384
    goto :goto_a

    .line 385
    :cond_d
    :try_start_8
    new-instance v0, Lr3/n;

    .line 386
    .line 387
    const-string v5, "The request\'s data is null."

    .line 388
    .line 389
    invoke-direct {v0, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 393
    :goto_b
    :try_start_9
    instance-of v5, v0, Ljava/util/concurrent/CancellationException;

    .line 394
    .line 395
    if-nez v5, :cond_e

    .line 396
    .line 397
    iget-object v1, v1, Lh3/h;->f:La4/c;

    .line 398
    .line 399
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    invoke-static {v3, v0}, La4/c;->v(Lr3/k;Ljava/lang/Throwable;)Lr3/f;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    iget-object v1, v3, Lr3/k;->c:Lt3/a;

    .line 407
    .line 408
    invoke-static {v0, v1, v4}, Lh3/h;->c(Lr3/f;Lt3/a;Lh3/d;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 409
    .line 410
    .line 411
    invoke-interface {v2}, Lr3/q;->k()V

    .line 412
    .line 413
    .line 414
    return-object v0

    .line 415
    :catchall_6
    move-exception v0

    .line 416
    goto :goto_c

    .line 417
    :cond_e
    :try_start_a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    iget-object v1, v3, Lr3/k;->d:Lr3/j;

    .line 424
    .line 425
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 426
    :goto_c
    invoke-interface {v2}, Lr3/q;->k()V

    .line 427
    .line 428
    .line 429
    throw v0
.end method

.method public static c(Lr3/f;Lt3/a;Lh3/d;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lr3/f;->b:Lr3/k;

    .line 2
    .line 3
    iget-object v1, p0, Lr3/f;->a:Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    instance-of v2, p1, Lt3/a;

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    if-eqz p1, :cond_2

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v2, v0, Lr3/k;->h:Lu3/d;

    .line 13
    .line 14
    invoke-interface {v2, p1, p0}, Lu3/d;->a(Lt3/a;Lr3/l;)Lu3/e;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    instance-of v2, p0, Lu3/c;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    :goto_0
    invoke-virtual {p1, v1}, Lt3/a;->d(Landroid/graphics/drawable/Drawable;)V

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-interface {p0}, Lu3/e;->a()V

    .line 30
    .line 31
    .line 32
    :cond_2
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object p0, v0, Lr3/k;->d:Lr3/j;

    .line 36
    .line 37
    if-eqz p0, :cond_3

    .line 38
    .line 39
    invoke-interface {p0}, Lr3/j;->e()V

    .line 40
    .line 41
    .line 42
    :cond_3
    return-void
.end method

.method public static d(Lr3/r;Lt3/a;Lh3/d;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lr3/r;->b:Lr3/k;

    .line 2
    .line 3
    iget-object v1, p0, Lr3/r;->a:Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    instance-of v2, p1, Lt3/a;

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    if-eqz p1, :cond_2

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v2, v0, Lr3/k;->h:Lu3/d;

    .line 13
    .line 14
    invoke-interface {v2, p1, p0}, Lu3/d;->a(Lt3/a;Lr3/l;)Lu3/e;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    instance-of v2, p0, Lu3/c;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    :goto_0
    invoke-virtual {p1, v1}, Lt3/a;->d(Landroid/graphics/drawable/Drawable;)V

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-interface {p0}, Lu3/e;->a()V

    .line 30
    .line 31
    .line 32
    :cond_2
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object p0, v0, Lr3/k;->d:Lr3/j;

    .line 36
    .line 37
    if-eqz p0, :cond_3

    .line 38
    .line 39
    invoke-interface {p0}, Lr3/j;->l()V

    .line 40
    .line 41
    .line 42
    :cond_3
    return-void
.end method


# virtual methods
.method public final b(Lr3/k;)Lr3/e;
    .locals 7

    .line 1
    iget-object v0, p0, Lh3/h;->e:Lm7/c;

    .line 2
    .line 3
    new-instance v1, Lc5/q0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v1, p0, p1, v2, v3}, Lc5/q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lp6/c;I)V

    .line 8
    .line 9
    .line 10
    sget-object v4, Lp6/i;->j:Lp6/i;

    .line 11
    .line 12
    sget-object v5, Li7/v;->j:Li7/v;

    .line 13
    .line 14
    invoke-virtual {v0}, Lm7/c;->h()Lp6/h;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0, v4, v3}, Li7/x;->d(Lp6/h;Lp6/h;Z)Lp6/h;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v4, Li7/e0;->a:Lo7/e;

    .line 23
    .line 24
    if-eq v0, v4, :cond_0

    .line 25
    .line 26
    sget-object v6, Lp6/d;->j:Lp6/d;

    .line 27
    .line 28
    invoke-interface {v0, v6}, Lp6/h;->b(Lp6/g;)Lp6/f;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    if-nez v6, :cond_0

    .line 33
    .line 34
    invoke-interface {v0, v4}, Lp6/h;->c(Lp6/h;)Lp6/h;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :cond_0
    sget-object v4, Li7/v;->j:Li7/v;

    .line 39
    .line 40
    new-instance v4, Li7/a0;

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    invoke-direct {v4, v0, v3, v6}, Li7/a0;-><init>(Lp6/h;ZI)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, v5, v4, v1}, Li7/a;->T(Li7/v;Li7/a;Ly6/p;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p1, Lr3/k;->c:Lt3/a;

    .line 50
    .line 51
    instance-of v0, p1, Lt3/a;

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    iget-object p1, p1, Lt3/a;->k:Landroid/widget/ImageView;

    .line 56
    .line 57
    invoke-static {p1}, Lv3/f;->c(Landroid/view/View;)Lr3/u;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    monitor-enter p1

    .line 62
    :try_start_0
    iget-object v0, p1, Lr3/u;->k:Landroidx/media3/common/a;

    .line 63
    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-static {v1, v3}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_1

    .line 79
    .line 80
    iget-boolean v1, p1, Lr3/u;->n:Z

    .line 81
    .line 82
    if-eqz v1, :cond_1

    .line 83
    .line 84
    iput-boolean v6, p1, Lr3/u;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    monitor-exit p1

    .line 87
    return-object v0

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    goto :goto_0

    .line 90
    :cond_1
    :try_start_1
    iget-object v0, p1, Lr3/u;->l:Li7/a0;

    .line 91
    .line 92
    if-eqz v0, :cond_2

    .line 93
    .line 94
    invoke-static {v0}, Li7/x;->b(Li7/s0;)V

    .line 95
    .line 96
    .line 97
    :cond_2
    iput-object v2, p1, Lr3/u;->l:Li7/a0;

    .line 98
    .line 99
    new-instance v0, Landroidx/media3/common/a;

    .line 100
    .line 101
    iget-object v1, p1, Lr3/u;->j:Landroid/view/View;

    .line 102
    .line 103
    invoke-direct {v0, v1}, Landroidx/media3/common/a;-><init>(Landroid/view/View;)V

    .line 104
    .line 105
    .line 106
    iput-object v0, p1, Lr3/u;->k:Landroidx/media3/common/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    .line 108
    monitor-exit p1

    .line 109
    return-object v0

    .line 110
    :goto_0
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 111
    throw v0

    .line 112
    :cond_3
    new-instance p1, Lr3/m;

    .line 113
    .line 114
    invoke-direct {p1, v3}, Lr3/m;-><init>(I)V

    .line 115
    .line 116
    .line 117
    return-object p1
.end method
