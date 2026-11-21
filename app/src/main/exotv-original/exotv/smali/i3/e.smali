.class public final Li3/e;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Li3/h;


# instance fields
.field public final a:Li3/o;

.field public final b:Lr3/o;

.field public final c:Lp7/d;

.field public final d:Li3/k;


# direct methods
.method public constructor <init>(Li3/o;Lr3/o;Lp7/d;Li3/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li3/e;->a:Li3/o;

    .line 5
    .line 6
    iput-object p2, p0, Li3/e;->b:Lr3/o;

    .line 7
    .line 8
    iput-object p3, p0, Li3/e;->c:Lp7/d;

    .line 9
    .line 10
    iput-object p4, p0, Li3/e;->d:Li3/k;

    .line 11
    .line 12
    return-void
.end method

.method public static a(Li3/e;)Li3/g;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    .line 4
    .line 5
    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Li3/e;->b:Lr3/o;

    .line 9
    .line 10
    new-instance v3, Li3/b;

    .line 11
    .line 12
    iget-object v4, v0, Li3/e;->a:Li3/o;

    .line 13
    .line 14
    invoke-virtual {v4}, Li3/o;->c()Lv7/l;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    invoke-direct {v3, v5}, Lv7/r;-><init>(Lv7/k0;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v3}, Lv7/b;->c(Lv7/k0;)Lv7/e0;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    const/4 v6, 0x1

    .line 26
    iput-boolean v6, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 27
    .line 28
    invoke-virtual {v5}, Lv7/e0;->peek()Lv7/e0;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    new-instance v8, Lv7/i;

    .line 33
    .line 34
    invoke-direct {v8, v7, v6}, Lv7/i;-><init>(Lv7/l;I)V

    .line 35
    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    invoke-static {v8, v7, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 39
    .line 40
    .line 41
    iget-object v8, v3, Li3/b;->j:Ljava/lang/Exception;

    .line 42
    .line 43
    if-nez v8, :cond_2a

    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    iput-boolean v8, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 47
    .line 48
    sget-object v9, Li3/l;->a:Landroid/graphics/Paint;

    .line 49
    .line 50
    iget-object v9, v1, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v0, v0, Li3/e;->d:Li3/k;

    .line 53
    .line 54
    sget-object v10, Li3/m;->a:Ljava/util/Set;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    const/16 v11, 0x5a

    .line 61
    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    const/4 v12, 0x2

    .line 65
    if-eq v0, v6, :cond_1

    .line 66
    .line 67
    if-ne v0, v12, :cond_0

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    new-instance v0, La1/u;

    .line 71
    .line 72
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 73
    .line 74
    .line 75
    throw v0

    .line 76
    :cond_1
    if-eqz v9, :cond_3

    .line 77
    .line 78
    sget-object v0, Li3/m;->a:Ljava/util/Set;

    .line 79
    .line 80
    invoke-interface {v0, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    :goto_0
    new-instance v0, Ly0/g;

    .line 87
    .line 88
    new-instance v9, Li3/j;

    .line 89
    .line 90
    invoke-virtual {v5}, Lv7/e0;->peek()Lv7/e0;

    .line 91
    .line 92
    .line 93
    move-result-object v13

    .line 94
    new-instance v14, Lv7/i;

    .line 95
    .line 96
    invoke-direct {v14, v13, v6}, Lv7/i;-><init>(Lv7/l;I)V

    .line 97
    .line 98
    .line 99
    invoke-direct {v9, v14}, Li3/j;-><init>(Ljava/io/InputStream;)V

    .line 100
    .line 101
    .line 102
    invoke-direct {v0, v9}, Ly0/g;-><init>(Ljava/io/InputStream;)V

    .line 103
    .line 104
    .line 105
    new-instance v9, Li3/i;

    .line 106
    .line 107
    invoke-virtual {v0}, Ly0/g;->c()I

    .line 108
    .line 109
    .line 110
    move-result v13

    .line 111
    if-eq v13, v12, :cond_2

    .line 112
    .line 113
    const/4 v12, 0x7

    .line 114
    if-eq v13, v12, :cond_2

    .line 115
    .line 116
    const/4 v12, 0x4

    .line 117
    if-eq v13, v12, :cond_2

    .line 118
    .line 119
    const/4 v12, 0x5

    .line 120
    if-eq v13, v12, :cond_2

    .line 121
    .line 122
    move v12, v8

    .line 123
    goto :goto_1

    .line 124
    :cond_2
    move v12, v6

    .line 125
    :goto_1
    invoke-virtual {v0}, Ly0/g;->c()I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    packed-switch v0, :pswitch_data_0

    .line 130
    .line 131
    .line 132
    move v0, v8

    .line 133
    goto :goto_2

    .line 134
    :pswitch_0
    move v0, v11

    .line 135
    goto :goto_2

    .line 136
    :pswitch_1
    const/16 v0, 0x10e

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :pswitch_2
    const/16 v0, 0xb4

    .line 140
    .line 141
    :goto_2
    invoke-direct {v9, v12, v0}, Li3/i;-><init>(ZI)V

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_3
    sget-object v9, Li3/i;->c:Li3/i;

    .line 146
    .line 147
    :goto_3
    iget v0, v9, Li3/i;->b:I

    .line 148
    .line 149
    iget-boolean v9, v9, Li3/i;->a:Z

    .line 150
    .line 151
    iget-object v12, v3, Li3/b;->j:Ljava/lang/Exception;

    .line 152
    .line 153
    if-nez v12, :cond_29

    .line 154
    .line 155
    iput-boolean v8, v1, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 156
    .line 157
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 158
    .line 159
    const/16 v13, 0x1a

    .line 160
    .line 161
    if-lt v12, v13, :cond_4

    .line 162
    .line 163
    iget-object v14, v2, Lr3/o;->c:Landroid/graphics/ColorSpace;

    .line 164
    .line 165
    if-eqz v14, :cond_4

    .line 166
    .line 167
    iput-object v14, v1, Landroid/graphics/BitmapFactory$Options;->inPreferredColorSpace:Landroid/graphics/ColorSpace;

    .line 168
    .line 169
    :cond_4
    iget-boolean v14, v2, Lr3/o;->h:Z

    .line 170
    .line 171
    iget-object v15, v2, Lr3/o;->a:Landroid/content/Context;

    .line 172
    .line 173
    iget-object v7, v2, Lr3/o;->d:Ls3/h;

    .line 174
    .line 175
    iput-boolean v14, v1, Landroid/graphics/BitmapFactory$Options;->inPremultiplied:Z

    .line 176
    .line 177
    iget-object v14, v2, Lr3/o;->b:Landroid/graphics/Bitmap$Config;

    .line 178
    .line 179
    if-nez v9, :cond_5

    .line 180
    .line 181
    if-lez v0, :cond_7

    .line 182
    .line 183
    :cond_5
    if-eqz v14, :cond_6

    .line 184
    .line 185
    invoke-static {v14}, Lb6/v;->h(Landroid/graphics/Bitmap$Config;)Z

    .line 186
    .line 187
    .line 188
    move-result v16

    .line 189
    if-eqz v16, :cond_7

    .line 190
    .line 191
    :cond_6
    sget-object v14, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 192
    .line 193
    :cond_7
    iget-boolean v8, v2, Lr3/o;->g:Z

    .line 194
    .line 195
    if-eqz v8, :cond_8

    .line 196
    .line 197
    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 198
    .line 199
    if-ne v14, v8, :cond_8

    .line 200
    .line 201
    iget-object v8, v1, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 202
    .line 203
    const-string v10, "image/jpeg"

    .line 204
    .line 205
    invoke-static {v8, v10}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    if-eqz v8, :cond_8

    .line 210
    .line 211
    sget-object v14, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 212
    .line 213
    :cond_8
    if-lt v12, v13, :cond_9

    .line 214
    .line 215
    iget-object v8, v1, Landroid/graphics/BitmapFactory$Options;->outConfig:Landroid/graphics/Bitmap$Config;

    .line 216
    .line 217
    sget-object v10, Landroid/graphics/Bitmap$Config;->RGBA_F16:Landroid/graphics/Bitmap$Config;

    .line 218
    .line 219
    if-ne v8, v10, :cond_9

    .line 220
    .line 221
    sget-object v8, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    .line 222
    .line 223
    if-eq v14, v8, :cond_9

    .line 224
    .line 225
    move-object v14, v10

    .line 226
    :cond_9
    iput-object v14, v1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 227
    .line 228
    invoke-virtual {v4}, Li3/o;->b()Lcom/bumptech/glide/c;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    instance-of v8, v4, Li3/p;

    .line 233
    .line 234
    if-eqz v8, :cond_a

    .line 235
    .line 236
    sget-object v8, Ls3/h;->c:Ls3/h;

    .line 237
    .line 238
    invoke-static {v7, v8}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v8

    .line 242
    if-eqz v8, :cond_a

    .line 243
    .line 244
    iput v6, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 245
    .line 246
    iput-boolean v6, v1, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 247
    .line 248
    check-cast v4, Li3/p;

    .line 249
    .line 250
    iget v2, v4, Li3/p;->p:I

    .line 251
    .line 252
    iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 253
    .line 254
    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    iget v2, v2, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 263
    .line 264
    iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 265
    .line 266
    move v14, v6

    .line 267
    move-object v10, v15

    .line 268
    const/4 v2, 0x0

    .line 269
    goto/16 :goto_e

    .line 270
    .line 271
    :cond_a
    iget v4, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 272
    .line 273
    if-lez v4, :cond_1b

    .line 274
    .line 275
    iget v8, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 276
    .line 277
    if-gtz v8, :cond_b

    .line 278
    .line 279
    move v14, v6

    .line 280
    move-object v10, v15

    .line 281
    goto/16 :goto_d

    .line 282
    .line 283
    :cond_b
    const/16 v10, 0x10e

    .line 284
    .line 285
    if-eq v0, v11, :cond_d

    .line 286
    .line 287
    if-ne v0, v10, :cond_c

    .line 288
    .line 289
    goto :goto_4

    .line 290
    :cond_c
    move v12, v4

    .line 291
    goto :goto_5

    .line 292
    :cond_d
    :goto_4
    move v12, v8

    .line 293
    :goto_5
    if-eq v0, v11, :cond_f

    .line 294
    .line 295
    if-ne v0, v10, :cond_e

    .line 296
    .line 297
    goto :goto_6

    .line 298
    :cond_e
    move v4, v8

    .line 299
    :cond_f
    :goto_6
    iget-object v8, v2, Lr3/o;->e:Ls3/g;

    .line 300
    .line 301
    sget-object v10, Ls3/h;->c:Ls3/h;

    .line 302
    .line 303
    invoke-static {v7, v10}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v13

    .line 307
    if-eqz v13, :cond_10

    .line 308
    .line 309
    move v13, v12

    .line 310
    goto :goto_7

    .line 311
    :cond_10
    iget-object v13, v7, Ls3/h;->a:Lcom/bumptech/glide/d;

    .line 312
    .line 313
    invoke-static {v13, v8}, Lv3/f;->e(Lcom/bumptech/glide/d;Ls3/g;)I

    .line 314
    .line 315
    .line 316
    move-result v13

    .line 317
    :goto_7
    invoke-static {v7, v10}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v10

    .line 321
    if-eqz v10, :cond_11

    .line 322
    .line 323
    move v7, v4

    .line 324
    goto :goto_8

    .line 325
    :cond_11
    iget-object v7, v7, Ls3/h;->b:Lcom/bumptech/glide/d;

    .line 326
    .line 327
    invoke-static {v7, v8}, Lv3/f;->e(Lcom/bumptech/glide/d;Ls3/g;)I

    .line 328
    .line 329
    .line 330
    move-result v7

    .line 331
    :goto_8
    div-int v10, v12, v13

    .line 332
    .line 333
    invoke-static {v10}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 334
    .line 335
    .line 336
    move-result v10

    .line 337
    div-int v14, v4, v7

    .line 338
    .line 339
    invoke-static {v14}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 340
    .line 341
    .line 342
    move-result v14

    .line 343
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 344
    .line 345
    .line 346
    move-result v11

    .line 347
    if-eqz v11, :cond_13

    .line 348
    .line 349
    if-ne v11, v6, :cond_12

    .line 350
    .line 351
    invoke-static {v10, v14}, Ljava/lang/Math;->max(II)I

    .line 352
    .line 353
    .line 354
    move-result v10

    .line 355
    goto :goto_9

    .line 356
    :cond_12
    new-instance v0, La1/u;

    .line 357
    .line 358
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 359
    .line 360
    .line 361
    throw v0

    .line 362
    :cond_13
    invoke-static {v10, v14}, Ljava/lang/Math;->min(II)I

    .line 363
    .line 364
    .line 365
    move-result v10

    .line 366
    :goto_9
    if-ge v10, v6, :cond_14

    .line 367
    .line 368
    move v10, v6

    .line 369
    :cond_14
    iput v10, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 370
    .line 371
    int-to-double v11, v12

    .line 372
    move/from16 v17, v7

    .line 373
    .line 374
    int-to-double v6, v10

    .line 375
    div-double/2addr v11, v6

    .line 376
    move-object v10, v15

    .line 377
    int-to-double v14, v4

    .line 378
    div-double/2addr v14, v6

    .line 379
    int-to-double v6, v13

    .line 380
    move-wide/from16 v18, v6

    .line 381
    .line 382
    move/from16 v4, v17

    .line 383
    .line 384
    int-to-double v6, v4

    .line 385
    div-double v11, v18, v11

    .line 386
    .line 387
    div-double/2addr v6, v14

    .line 388
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 389
    .line 390
    .line 391
    move-result v4

    .line 392
    if-eqz v4, :cond_16

    .line 393
    .line 394
    const/4 v14, 0x1

    .line 395
    if-ne v4, v14, :cond_15

    .line 396
    .line 397
    invoke-static {v11, v12, v6, v7}, Ljava/lang/Math;->min(DD)D

    .line 398
    .line 399
    .line 400
    move-result-wide v6

    .line 401
    goto :goto_a

    .line 402
    :cond_15
    new-instance v0, La1/u;

    .line 403
    .line 404
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 405
    .line 406
    .line 407
    throw v0

    .line 408
    :cond_16
    invoke-static {v11, v12, v6, v7}, Ljava/lang/Math;->max(DD)D

    .line 409
    .line 410
    .line 411
    move-result-wide v6

    .line 412
    :goto_a
    iget-boolean v2, v2, Lr3/o;->f:Z

    .line 413
    .line 414
    const-wide/high16 v11, 0x3ff0000000000000L    # 1.0

    .line 415
    .line 416
    if-eqz v2, :cond_17

    .line 417
    .line 418
    cmpl-double v2, v6, v11

    .line 419
    .line 420
    if-lez v2, :cond_17

    .line 421
    .line 422
    move-wide v6, v11

    .line 423
    :cond_17
    cmpg-double v2, v6, v11

    .line 424
    .line 425
    if-nez v2, :cond_18

    .line 426
    .line 427
    const/4 v2, 0x1

    .line 428
    goto :goto_b

    .line 429
    :cond_18
    const/4 v2, 0x0

    .line 430
    :goto_b
    xor-int/lit8 v4, v2, 0x1

    .line 431
    .line 432
    iput-boolean v4, v1, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 433
    .line 434
    if-nez v2, :cond_19

    .line 435
    .line 436
    cmpl-double v2, v6, v11

    .line 437
    .line 438
    const v4, 0x7fffffff

    .line 439
    .line 440
    .line 441
    if-lez v2, :cond_1a

    .line 442
    .line 443
    int-to-double v11, v4

    .line 444
    div-double/2addr v11, v6

    .line 445
    invoke-static {v11, v12}, Lcom/bumptech/glide/d;->e0(D)I

    .line 446
    .line 447
    .line 448
    move-result v2

    .line 449
    iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 450
    .line 451
    iput v4, v1, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 452
    .line 453
    :cond_19
    :goto_c
    const/4 v2, 0x0

    .line 454
    const/4 v14, 0x1

    .line 455
    goto :goto_e

    .line 456
    :cond_1a
    iput v4, v1, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 457
    .line 458
    int-to-double v11, v4

    .line 459
    mul-double/2addr v11, v6

    .line 460
    invoke-static {v11, v12}, Lcom/bumptech/glide/d;->e0(D)I

    .line 461
    .line 462
    .line 463
    move-result v2

    .line 464
    iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 465
    .line 466
    goto :goto_c

    .line 467
    :cond_1b
    move-object v10, v15

    .line 468
    move v14, v6

    .line 469
    :goto_d
    iput v14, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 470
    .line 471
    const/4 v2, 0x0

    .line 472
    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 473
    .line 474
    :goto_e
    :try_start_0
    new-instance v4, Lv7/i;

    .line 475
    .line 476
    invoke-direct {v4, v5, v14}, Lv7/i;-><init>(Lv7/l;I)V

    .line 477
    .line 478
    .line 479
    const/4 v6, 0x0

    .line 480
    invoke-static {v4, v6, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 481
    .line 482
    .line 483
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 484
    invoke-virtual {v5}, Lv7/e0;->close()V

    .line 485
    .line 486
    .line 487
    iget-object v3, v3, Li3/b;->j:Ljava/lang/Exception;

    .line 488
    .line 489
    if-nez v3, :cond_28

    .line 490
    .line 491
    if-eqz v4, :cond_27

    .line 492
    .line 493
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 494
    .line 495
    .line 496
    move-result-object v3

    .line 497
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 498
    .line 499
    .line 500
    move-result-object v3

    .line 501
    iget v3, v3, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 502
    .line 503
    invoke-virtual {v4, v3}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 504
    .line 505
    .line 506
    if-nez v9, :cond_1c

    .line 507
    .line 508
    if-lez v0, :cond_24

    .line 509
    .line 510
    :cond_1c
    new-instance v3, Landroid/graphics/Matrix;

    .line 511
    .line 512
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 516
    .line 517
    .line 518
    move-result v5

    .line 519
    int-to-float v5, v5

    .line 520
    const/high16 v6, 0x40000000    # 2.0f

    .line 521
    .line 522
    div-float/2addr v5, v6

    .line 523
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 524
    .line 525
    .line 526
    move-result v7

    .line 527
    int-to-float v7, v7

    .line 528
    div-float/2addr v7, v6

    .line 529
    if-eqz v9, :cond_1d

    .line 530
    .line 531
    const/high16 v6, -0x40800000    # -1.0f

    .line 532
    .line 533
    const/high16 v8, 0x3f800000    # 1.0f

    .line 534
    .line 535
    invoke-virtual {v3, v6, v8, v5, v7}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 536
    .line 537
    .line 538
    :cond_1d
    if-lez v0, :cond_1e

    .line 539
    .line 540
    int-to-float v6, v0

    .line 541
    invoke-virtual {v3, v6, v5, v7}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 542
    .line 543
    .line 544
    :cond_1e
    new-instance v5, Landroid/graphics/RectF;

    .line 545
    .line 546
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 547
    .line 548
    .line 549
    move-result v6

    .line 550
    int-to-float v6, v6

    .line 551
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 552
    .line 553
    .line 554
    move-result v7

    .line 555
    int-to-float v7, v7

    .line 556
    const/4 v8, 0x0

    .line 557
    invoke-direct {v5, v8, v8, v6, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v3, v5}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 561
    .line 562
    .line 563
    iget v6, v5, Landroid/graphics/RectF;->left:F

    .line 564
    .line 565
    cmpg-float v7, v6, v8

    .line 566
    .line 567
    if-nez v7, :cond_1f

    .line 568
    .line 569
    iget v7, v5, Landroid/graphics/RectF;->top:F

    .line 570
    .line 571
    cmpg-float v7, v7, v8

    .line 572
    .line 573
    if-nez v7, :cond_1f

    .line 574
    .line 575
    :goto_f
    const/16 v5, 0x5a

    .line 576
    .line 577
    goto :goto_10

    .line 578
    :cond_1f
    neg-float v6, v6

    .line 579
    iget v5, v5, Landroid/graphics/RectF;->top:F

    .line 580
    .line 581
    neg-float v5, v5

    .line 582
    invoke-virtual {v3, v6, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 583
    .line 584
    .line 585
    goto :goto_f

    .line 586
    :goto_10
    if-eq v0, v5, :cond_22

    .line 587
    .line 588
    const/16 v5, 0x10e

    .line 589
    .line 590
    if-ne v0, v5, :cond_20

    .line 591
    .line 592
    goto :goto_11

    .line 593
    :cond_20
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 594
    .line 595
    .line 596
    move-result v0

    .line 597
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 598
    .line 599
    .line 600
    move-result v5

    .line 601
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 602
    .line 603
    .line 604
    move-result-object v6

    .line 605
    if-nez v6, :cond_21

    .line 606
    .line 607
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 608
    .line 609
    :cond_21
    invoke-static {v0, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    goto :goto_12

    .line 614
    :cond_22
    :goto_11
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 615
    .line 616
    .line 617
    move-result v0

    .line 618
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 619
    .line 620
    .line 621
    move-result v5

    .line 622
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 623
    .line 624
    .line 625
    move-result-object v6

    .line 626
    if-nez v6, :cond_23

    .line 627
    .line 628
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 629
    .line 630
    :cond_23
    invoke-static {v0, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    :goto_12
    new-instance v5, Landroid/graphics/Canvas;

    .line 635
    .line 636
    invoke-direct {v5, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 637
    .line 638
    .line 639
    sget-object v6, Li3/l;->a:Landroid/graphics/Paint;

    .line 640
    .line 641
    invoke-virtual {v5, v4, v3, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 645
    .line 646
    .line 647
    move-object v4, v0

    .line 648
    :cond_24
    new-instance v0, Li3/g;

    .line 649
    .line 650
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 651
    .line 652
    .line 653
    move-result-object v3

    .line 654
    new-instance v5, Landroid/graphics/drawable/BitmapDrawable;

    .line 655
    .line 656
    invoke-direct {v5, v3, v4}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 657
    .line 658
    .line 659
    iget v3, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 660
    .line 661
    const/4 v14, 0x1

    .line 662
    if-gt v3, v14, :cond_26

    .line 663
    .line 664
    iget-boolean v1, v1, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 665
    .line 666
    if-eqz v1, :cond_25

    .line 667
    .line 668
    goto :goto_13

    .line 669
    :cond_25
    move v6, v2

    .line 670
    goto :goto_14

    .line 671
    :cond_26
    :goto_13
    move v6, v14

    .line 672
    :goto_14
    invoke-direct {v0, v5, v6}, Li3/g;-><init>(Landroid/graphics/drawable/BitmapDrawable;Z)V

    .line 673
    .line 674
    .line 675
    return-object v0

    .line 676
    :cond_27
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 677
    .line 678
    const-string v1, "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it\'s not encoded as a valid image format."

    .line 679
    .line 680
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    throw v0

    .line 684
    :cond_28
    throw v3

    .line 685
    :catchall_0
    move-exception v0

    .line 686
    move-object v1, v0

    .line 687
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 688
    :catchall_1
    move-exception v0

    .line 689
    invoke-static {v5, v1}, Lt5/a;->b(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 690
    .line 691
    .line 692
    throw v0

    .line 693
    :cond_29
    throw v12

    .line 694
    :cond_2a
    throw v8

    .line 695
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final b(Lr6/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, Li3/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Li3/d;

    .line 7
    .line 8
    iget v1, v0, Li3/d;->q:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Li3/d;->q:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Li3/d;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Li3/d;-><init>(Li3/e;Lr6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Li3/d;->o:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lq6/a;->j:Lq6/a;

    .line 28
    .line 29
    iget v2, v0, Li3/d;->q:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object v0, v0, Li3/d;->m:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lp7/d;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto/16 :goto_6

    .line 47
    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto/16 :goto_8

    .line 50
    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    iget-object v2, v0, Li3/d;->n:Lp7/d;

    .line 60
    .line 61
    iget-object v4, v0, Li3/d;->m:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v4, Li3/e;

    .line 64
    .line 65
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object p1, v2

    .line 69
    goto :goto_4

    .line 70
    :cond_3
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iput-object p0, v0, Li3/d;->m:Ljava/lang/Object;

    .line 74
    .line 75
    iget-object p1, p0, Li3/e;->c:Lp7/d;

    .line 76
    .line 77
    iput-object p1, v0, Li3/d;->n:Lp7/d;

    .line 78
    .line 79
    iput v4, v0, Li3/d;->q:I

    .line 80
    .line 81
    move-object v2, p1

    .line 82
    check-cast v2, Lp7/g;

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget v4, v2, Lp7/g;->a:I

    .line 88
    .line 89
    :cond_4
    sget-object v5, Lp7/g;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 90
    .line 91
    invoke-virtual {v5, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-gt v5, v4, :cond_4

    .line 96
    .line 97
    sget-object v6, Ll6/j;->a:Ll6/j;

    .line 98
    .line 99
    if-lez v5, :cond_5

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_5
    invoke-static {v0}, Lcom/bumptech/glide/d;->P(Lp6/c;)Lp6/c;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-static {v5}, Li7/x;->h(Lp6/c;)Li7/g;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    :try_start_1
    invoke-virtual {v2, v5}, Lp7/g;->a(Li7/p1;)Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-nez v7, :cond_8

    .line 115
    .line 116
    :cond_6
    sget-object v7, Lp7/g;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 117
    .line 118
    invoke-virtual {v7, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-gt v7, v4, :cond_6

    .line 123
    .line 124
    if-lez v7, :cond_7

    .line 125
    .line 126
    iget-object v2, v2, Lp7/g;->b:Li7/f;

    .line 127
    .line 128
    invoke-virtual {v5, v2}, Li7/g;->i(Li7/f;)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_7
    invoke-virtual {v2, v5}, Lp7/g;->a(Li7/p1;)Z

    .line 133
    .line 134
    .line 135
    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 136
    if-eqz v7, :cond_6

    .line 137
    .line 138
    :cond_8
    :goto_1
    invoke-virtual {v5}, Li7/g;->u()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    if-ne v2, v1, :cond_9

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_9
    move-object v2, v6

    .line 146
    :goto_2
    if-ne v2, v1, :cond_a

    .line 147
    .line 148
    move-object v6, v2

    .line 149
    :cond_a
    :goto_3
    if-ne v6, v1, :cond_b

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_b
    move-object v4, p0

    .line 153
    :goto_4
    :try_start_2
    new-instance v2, Lc5/d0;

    .line 154
    .line 155
    const/4 v5, 0x1

    .line 156
    invoke-direct {v2, v5, v4}, Lc5/d0;-><init>(ILjava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    iput-object p1, v0, Li3/d;->m:Ljava/lang/Object;

    .line 160
    .line 161
    const/4 v4, 0x0

    .line 162
    iput-object v4, v0, Li3/d;->n:Lp7/d;

    .line 163
    .line 164
    iput v3, v0, Li3/d;->q:I

    .line 165
    .line 166
    sget-object v3, Lp6/i;->j:Lp6/i;

    .line 167
    .line 168
    new-instance v5, Landroidx/lifecycle/p;

    .line 169
    .line 170
    const/4 v6, 0x1

    .line 171
    invoke-direct {v5, v2, v4, v6}, Landroidx/lifecycle/p;-><init>(Ljava/lang/Object;Lp6/c;I)V

    .line 172
    .line 173
    .line 174
    invoke-static {v3, v5, v0}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 178
    if-ne v0, v1, :cond_c

    .line 179
    .line 180
    :goto_5
    return-object v1

    .line 181
    :cond_c
    move-object v8, v0

    .line 182
    move-object v0, p1

    .line 183
    move-object p1, v8

    .line 184
    :goto_6
    :try_start_3
    check-cast p1, Li3/g;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 185
    .line 186
    check-cast v0, Lp7/g;

    .line 187
    .line 188
    invoke-virtual {v0}, Lp7/g;->b()V

    .line 189
    .line 190
    .line 191
    return-object p1

    .line 192
    :goto_7
    move-object v8, v0

    .line 193
    move-object v0, p1

    .line 194
    move-object p1, v8

    .line 195
    goto :goto_8

    .line 196
    :catchall_1
    move-exception v0

    .line 197
    goto :goto_7

    .line 198
    :goto_8
    check-cast v0, Lp7/g;

    .line 199
    .line 200
    invoke-virtual {v0}, Lp7/g;->b()V

    .line 201
    .line 202
    .line 203
    throw p1

    .line 204
    :catchall_2
    move-exception p1

    .line 205
    invoke-virtual {v5}, Li7/g;->C()V

    .line 206
    .line 207
    .line 208
    throw p1
.end method
