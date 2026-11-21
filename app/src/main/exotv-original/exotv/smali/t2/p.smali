.class public final Lt2/p;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lt2/h;


# instance fields
.field public final a:La4/c;

.field public final b:Z

.field public final c:Z

.field public final d:Lt2/x;

.field public final e:Lt2/x;

.field public final f:Lt2/x;

.field public g:J

.field public final h:[Z

.field public i:Ljava/lang/String;

.field public j:Ln1/i0;

.field public k:Lt2/o;

.field public l:Z

.field public m:J

.field public n:Z

.field public final o:Lh1/w;


# direct methods
.method public constructor <init>(La4/c;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt2/p;->a:La4/c;

    .line 5
    .line 6
    iput-boolean p2, p0, Lt2/p;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lt2/p;->c:Z

    .line 9
    .line 10
    const/4 p1, 0x3

    .line 11
    new-array p1, p1, [Z

    .line 12
    .line 13
    iput-object p1, p0, Lt2/p;->h:[Z

    .line 14
    .line 15
    new-instance p1, Lt2/x;

    .line 16
    .line 17
    const/4 p2, 0x7

    .line 18
    invoke-direct {p1, p2}, Lt2/x;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lt2/p;->d:Lt2/x;

    .line 22
    .line 23
    new-instance p1, Lt2/x;

    .line 24
    .line 25
    const/16 p2, 0x8

    .line 26
    .line 27
    invoke-direct {p1, p2}, Lt2/x;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lt2/p;->e:Lt2/x;

    .line 31
    .line 32
    new-instance p1, Lt2/x;

    .line 33
    .line 34
    const/4 p2, 0x6

    .line 35
    invoke-direct {p1, p2}, Lt2/x;-><init>(I)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lt2/p;->f:Lt2/x;

    .line 39
    .line 40
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    iput-wide p1, p0, Lt2/p;->m:J

    .line 46
    .line 47
    new-instance p1, Lh1/w;

    .line 48
    .line 49
    invoke-direct {p1}, Lh1/w;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lt2/p;->o:Lh1/w;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final a(Lh1/w;)V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lt2/p;->j:Ln1/i0;

    .line 6
    .line 7
    invoke-static {v2}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sget v2, Lh1/i0;->a:I

    .line 11
    .line 12
    iget v2, v1, Lh1/w;->b:I

    .line 13
    .line 14
    iget v3, v1, Lh1/w;->c:I

    .line 15
    .line 16
    iget-object v4, v1, Lh1/w;->a:[B

    .line 17
    .line 18
    iget-wide v5, v0, Lt2/p;->g:J

    .line 19
    .line 20
    invoke-virtual {v1}, Lh1/w;->a()I

    .line 21
    .line 22
    .line 23
    move-result v7

    .line 24
    int-to-long v7, v7

    .line 25
    add-long/2addr v5, v7

    .line 26
    iput-wide v5, v0, Lt2/p;->g:J

    .line 27
    .line 28
    iget-object v5, v0, Lt2/p;->j:Ln1/i0;

    .line 29
    .line 30
    invoke-virtual {v1}, Lh1/w;->a()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-interface {v5, v1, v6}, Ln1/i0;->sampleData(Lh1/w;I)V

    .line 35
    .line 36
    .line 37
    :goto_0
    iget-object v1, v0, Lt2/p;->h:[Z

    .line 38
    .line 39
    invoke-static {v4, v2, v3, v1}, Li1/p;->b([BII[Z)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-ne v1, v3, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0, v4, v2, v3}, Lt2/p;->b([BII)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    add-int/lit8 v5, v1, 0x3

    .line 50
    .line 51
    aget-byte v6, v4, v5

    .line 52
    .line 53
    and-int/lit8 v6, v6, 0x1f

    .line 54
    .line 55
    sub-int v7, v1, v2

    .line 56
    .line 57
    if-lez v7, :cond_1

    .line 58
    .line 59
    invoke-virtual {v0, v4, v2, v1}, Lt2/p;->b([BII)V

    .line 60
    .line 61
    .line 62
    :cond_1
    sub-int v1, v3, v1

    .line 63
    .line 64
    iget-wide v8, v0, Lt2/p;->g:J

    .line 65
    .line 66
    int-to-long v10, v1

    .line 67
    sub-long/2addr v8, v10

    .line 68
    if-gez v7, :cond_2

    .line 69
    .line 70
    neg-int v7, v7

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    const/4 v7, 0x0

    .line 73
    :goto_1
    iget-wide v10, v0, Lt2/p;->m:J

    .line 74
    .line 75
    iget-object v12, v0, Lt2/p;->a:La4/c;

    .line 76
    .line 77
    iget-object v12, v12, La4/c;->m:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v12, Li1/s;

    .line 80
    .line 81
    iget-boolean v13, v0, Lt2/p;->l:Z

    .line 82
    .line 83
    iget-object v15, v0, Lt2/p;->d:Lt2/x;

    .line 84
    .line 85
    iget-object v2, v0, Lt2/p;->e:Lt2/x;

    .line 86
    .line 87
    if-eqz v13, :cond_4

    .line 88
    .line 89
    iget-object v13, v0, Lt2/p;->k:Lt2/o;

    .line 90
    .line 91
    iget-boolean v13, v13, Lt2/o;->c:Z

    .line 92
    .line 93
    if-eqz v13, :cond_3

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_3
    move/from16 v17, v1

    .line 97
    .line 98
    move/from16 v18, v3

    .line 99
    .line 100
    move-object/from16 v19, v4

    .line 101
    .line 102
    move/from16 v20, v5

    .line 103
    .line 104
    move/from16 v23, v6

    .line 105
    .line 106
    move-wide/from16 v21, v8

    .line 107
    .line 108
    goto/16 :goto_5

    .line 109
    .line 110
    :cond_4
    :goto_2
    invoke-virtual {v15, v7}, Lt2/x;->e(I)Z

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v7}, Lt2/x;->e(I)Z

    .line 114
    .line 115
    .line 116
    iget-boolean v13, v0, Lt2/p;->l:Z

    .line 117
    .line 118
    if-nez v13, :cond_6

    .line 119
    .line 120
    iget-boolean v13, v15, Lt2/x;->e:Z

    .line 121
    .line 122
    if-eqz v13, :cond_3

    .line 123
    .line 124
    iget-boolean v13, v2, Lt2/x;->e:Z

    .line 125
    .line 126
    if-eqz v13, :cond_3

    .line 127
    .line 128
    new-instance v13, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 131
    .line 132
    .line 133
    iget-object v14, v15, Lt2/x;->f:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v14, [B

    .line 136
    .line 137
    move/from16 v17, v1

    .line 138
    .line 139
    iget v1, v15, Lt2/x;->c:I

    .line 140
    .line 141
    invoke-static {v14, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    iget-object v1, v2, Lt2/x;->f:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v1, [B

    .line 151
    .line 152
    iget v14, v2, Lt2/x;->c:I

    .line 153
    .line 154
    invoke-static {v1, v14}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    iget-object v1, v15, Lt2/x;->f:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v1, [B

    .line 164
    .line 165
    iget v14, v15, Lt2/x;->c:I

    .line 166
    .line 167
    move/from16 v18, v3

    .line 168
    .line 169
    const/4 v3, 0x3

    .line 170
    invoke-static {v1, v3, v14}, Li1/p;->i([BII)Li1/o;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    iget v3, v1, Li1/o;->s:I

    .line 175
    .line 176
    iget-object v14, v2, Lt2/x;->f:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v14, [B

    .line 179
    .line 180
    move-object/from16 v19, v4

    .line 181
    .line 182
    iget v4, v2, Lt2/x;->c:I

    .line 183
    .line 184
    move/from16 v20, v5

    .line 185
    .line 186
    new-instance v5, Lh1/v;

    .line 187
    .line 188
    move-wide/from16 v21, v8

    .line 189
    .line 190
    const/4 v8, 0x4

    .line 191
    invoke-direct {v5, v14, v8, v4}, Lh1/v;-><init>([BII)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v5}, Lh1/v;->o()I

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    invoke-virtual {v5}, Lh1/v;->o()I

    .line 199
    .line 200
    .line 201
    move-result v8

    .line 202
    invoke-virtual {v5}, Lh1/v;->u()V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v5}, Lh1/v;->j()Z

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    new-instance v9, Li1/n;

    .line 210
    .line 211
    invoke-direct {v9, v4, v8, v5}, Li1/n;-><init>(IIZ)V

    .line 212
    .line 213
    .line 214
    iget v5, v1, Li1/o;->a:I

    .line 215
    .line 216
    iget v8, v1, Li1/o;->b:I

    .line 217
    .line 218
    iget v14, v1, Li1/o;->c:I

    .line 219
    .line 220
    sget-object v16, Lh1/c;->a:[B

    .line 221
    .line 222
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 227
    .line 228
    .line 229
    move-result-object v8

    .line 230
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 231
    .line 232
    .line 233
    move-result-object v14

    .line 234
    filled-new-array {v5, v8, v14}, [Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    const-string v8, "avc1.%02X%02X%02X"

    .line 239
    .line 240
    invoke-static {v8, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    iget-object v8, v0, Lt2/p;->j:Ln1/i0;

    .line 245
    .line 246
    new-instance v14, Landroidx/media3/common/v;

    .line 247
    .line 248
    invoke-direct {v14}, Landroidx/media3/common/v;-><init>()V

    .line 249
    .line 250
    .line 251
    move/from16 v23, v6

    .line 252
    .line 253
    iget-object v6, v0, Lt2/p;->i:Ljava/lang/String;

    .line 254
    .line 255
    iput-object v6, v14, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 256
    .line 257
    const-string v6, "video/avc"

    .line 258
    .line 259
    invoke-static {v6}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v6

    .line 263
    iput-object v6, v14, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 264
    .line 265
    iput-object v5, v14, Landroidx/media3/common/v;->j:Ljava/lang/String;

    .line 266
    .line 267
    iget v5, v1, Li1/o;->e:I

    .line 268
    .line 269
    iput v5, v14, Landroidx/media3/common/v;->t:I

    .line 270
    .line 271
    iget v5, v1, Li1/o;->f:I

    .line 272
    .line 273
    iput v5, v14, Landroidx/media3/common/v;->u:I

    .line 274
    .line 275
    iget v5, v1, Li1/o;->p:I

    .line 276
    .line 277
    iget v6, v1, Li1/o;->q:I

    .line 278
    .line 279
    move/from16 v25, v5

    .line 280
    .line 281
    iget v5, v1, Li1/o;->r:I

    .line 282
    .line 283
    move/from16 v27, v5

    .line 284
    .line 285
    iget v5, v1, Li1/o;->h:I

    .line 286
    .line 287
    add-int/lit8 v28, v5, 0x8

    .line 288
    .line 289
    iget v5, v1, Li1/o;->i:I

    .line 290
    .line 291
    add-int/lit8 v29, v5, 0x8

    .line 292
    .line 293
    new-instance v24, Landroidx/media3/common/l;

    .line 294
    .line 295
    const/16 v30, 0x0

    .line 296
    .line 297
    move/from16 v26, v6

    .line 298
    .line 299
    invoke-direct/range {v24 .. v30}, Landroidx/media3/common/l;-><init>(IIIII[B)V

    .line 300
    .line 301
    .line 302
    move-object/from16 v5, v24

    .line 303
    .line 304
    iput-object v5, v14, Landroidx/media3/common/v;->A:Landroidx/media3/common/l;

    .line 305
    .line 306
    iget v5, v1, Li1/o;->g:F

    .line 307
    .line 308
    iput v5, v14, Landroidx/media3/common/v;->x:F

    .line 309
    .line 310
    iput-object v13, v14, Landroidx/media3/common/v;->p:Ljava/util/List;

    .line 311
    .line 312
    iput v3, v14, Landroidx/media3/common/v;->o:I

    .line 313
    .line 314
    new-instance v5, Landroidx/media3/common/w;

    .line 315
    .line 316
    invoke-direct {v5, v14}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 317
    .line 318
    .line 319
    invoke-interface {v8, v5}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 320
    .line 321
    .line 322
    const/4 v5, 0x1

    .line 323
    iput-boolean v5, v0, Lt2/p;->l:Z

    .line 324
    .line 325
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    if-ltz v3, :cond_5

    .line 329
    .line 330
    const/4 v5, 0x1

    .line 331
    goto :goto_3

    .line 332
    :cond_5
    const/4 v5, 0x0

    .line 333
    :goto_3
    invoke-static {v5}, Lh1/a;->j(Z)V

    .line 334
    .line 335
    .line 336
    iput v3, v12, Li1/s;->a:I

    .line 337
    .line 338
    invoke-virtual {v12, v3}, Li1/s;->i(I)V

    .line 339
    .line 340
    .line 341
    iget-object v3, v0, Lt2/p;->k:Lt2/o;

    .line 342
    .line 343
    iget-object v3, v3, Lt2/o;->d:Landroid/util/SparseArray;

    .line 344
    .line 345
    iget v5, v1, Li1/o;->d:I

    .line 346
    .line 347
    invoke-virtual {v3, v5, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    iget-object v1, v0, Lt2/p;->k:Lt2/o;

    .line 351
    .line 352
    iget-object v1, v1, Lt2/o;->e:Landroid/util/SparseArray;

    .line 353
    .line 354
    invoke-virtual {v1, v4, v9}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v15}, Lt2/x;->f()V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v2}, Lt2/x;->f()V

    .line 361
    .line 362
    .line 363
    goto :goto_5

    .line 364
    :cond_6
    move/from16 v17, v1

    .line 365
    .line 366
    move/from16 v18, v3

    .line 367
    .line 368
    move-object/from16 v19, v4

    .line 369
    .line 370
    move/from16 v20, v5

    .line 371
    .line 372
    move/from16 v23, v6

    .line 373
    .line 374
    move-wide/from16 v21, v8

    .line 375
    .line 376
    iget-boolean v1, v15, Lt2/x;->e:Z

    .line 377
    .line 378
    if-eqz v1, :cond_8

    .line 379
    .line 380
    iget-object v1, v15, Lt2/x;->f:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v1, [B

    .line 383
    .line 384
    iget v3, v15, Lt2/x;->c:I

    .line 385
    .line 386
    const/4 v4, 0x3

    .line 387
    invoke-static {v1, v4, v3}, Li1/p;->i([BII)Li1/o;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    iget v3, v1, Li1/o;->s:I

    .line 392
    .line 393
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    if-ltz v3, :cond_7

    .line 397
    .line 398
    const/4 v4, 0x1

    .line 399
    goto :goto_4

    .line 400
    :cond_7
    const/4 v4, 0x0

    .line 401
    :goto_4
    invoke-static {v4}, Lh1/a;->j(Z)V

    .line 402
    .line 403
    .line 404
    iput v3, v12, Li1/s;->a:I

    .line 405
    .line 406
    invoke-virtual {v12, v3}, Li1/s;->i(I)V

    .line 407
    .line 408
    .line 409
    iget-object v3, v0, Lt2/p;->k:Lt2/o;

    .line 410
    .line 411
    iget-object v3, v3, Lt2/o;->d:Landroid/util/SparseArray;

    .line 412
    .line 413
    iget v4, v1, Li1/o;->d:I

    .line 414
    .line 415
    invoke-virtual {v3, v4, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v15}, Lt2/x;->f()V

    .line 419
    .line 420
    .line 421
    goto :goto_5

    .line 422
    :cond_8
    iget-boolean v1, v2, Lt2/x;->e:Z

    .line 423
    .line 424
    if-eqz v1, :cond_9

    .line 425
    .line 426
    iget-object v1, v2, Lt2/x;->f:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v1, [B

    .line 429
    .line 430
    iget v3, v2, Lt2/x;->c:I

    .line 431
    .line 432
    new-instance v4, Lh1/v;

    .line 433
    .line 434
    const/4 v8, 0x4

    .line 435
    invoke-direct {v4, v1, v8, v3}, Lh1/v;-><init>([BII)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v4}, Lh1/v;->o()I

    .line 439
    .line 440
    .line 441
    move-result v1

    .line 442
    invoke-virtual {v4}, Lh1/v;->o()I

    .line 443
    .line 444
    .line 445
    move-result v3

    .line 446
    invoke-virtual {v4}, Lh1/v;->u()V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v4}, Lh1/v;->j()Z

    .line 450
    .line 451
    .line 452
    move-result v4

    .line 453
    new-instance v5, Li1/n;

    .line 454
    .line 455
    invoke-direct {v5, v1, v3, v4}, Li1/n;-><init>(IIZ)V

    .line 456
    .line 457
    .line 458
    iget-object v3, v0, Lt2/p;->k:Lt2/o;

    .line 459
    .line 460
    iget-object v3, v3, Lt2/o;->e:Landroid/util/SparseArray;

    .line 461
    .line 462
    invoke-virtual {v3, v1, v5}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v2}, Lt2/x;->f()V

    .line 466
    .line 467
    .line 468
    :cond_9
    :goto_5
    iget-object v1, v0, Lt2/p;->f:Lt2/x;

    .line 469
    .line 470
    invoke-virtual {v1, v7}, Lt2/x;->e(I)Z

    .line 471
    .line 472
    .line 473
    move-result v3

    .line 474
    if-eqz v3, :cond_a

    .line 475
    .line 476
    iget-object v3, v1, Lt2/x;->f:Ljava/lang/Object;

    .line 477
    .line 478
    check-cast v3, [B

    .line 479
    .line 480
    iget v4, v1, Lt2/x;->c:I

    .line 481
    .line 482
    invoke-static {v3, v4}, Li1/p;->k([BI)I

    .line 483
    .line 484
    .line 485
    move-result v3

    .line 486
    iget-object v4, v1, Lt2/x;->f:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast v4, [B

    .line 489
    .line 490
    iget-object v5, v0, Lt2/p;->o:Lh1/w;

    .line 491
    .line 492
    invoke-virtual {v5, v4, v3}, Lh1/w;->E([BI)V

    .line 493
    .line 494
    .line 495
    const/4 v8, 0x4

    .line 496
    invoke-virtual {v5, v8}, Lh1/w;->G(I)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12, v10, v11, v5}, Li1/s;->a(JLh1/w;)V

    .line 500
    .line 501
    .line 502
    :cond_a
    iget-object v3, v0, Lt2/p;->k:Lt2/o;

    .line 503
    .line 504
    iget-boolean v4, v0, Lt2/p;->l:Z

    .line 505
    .line 506
    iget v5, v3, Lt2/o;->i:I

    .line 507
    .line 508
    const/16 v6, 0x9

    .line 509
    .line 510
    if-eq v5, v6, :cond_12

    .line 511
    .line 512
    iget-boolean v5, v3, Lt2/o;->c:Z

    .line 513
    .line 514
    if-eqz v5, :cond_11

    .line 515
    .line 516
    iget-object v5, v3, Lt2/o;->n:Lt2/n;

    .line 517
    .line 518
    iget-object v6, v3, Lt2/o;->m:Lt2/n;

    .line 519
    .line 520
    iget-boolean v7, v5, Lt2/n;->a:Z

    .line 521
    .line 522
    if-nez v7, :cond_b

    .line 523
    .line 524
    goto/16 :goto_6

    .line 525
    .line 526
    :cond_b
    iget-boolean v7, v6, Lt2/n;->a:Z

    .line 527
    .line 528
    if-nez v7, :cond_c

    .line 529
    .line 530
    goto/16 :goto_7

    .line 531
    .line 532
    :cond_c
    iget-object v7, v5, Lt2/n;->c:Li1/o;

    .line 533
    .line 534
    invoke-static {v7}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 535
    .line 536
    .line 537
    iget-object v8, v6, Lt2/n;->c:Li1/o;

    .line 538
    .line 539
    invoke-static {v8}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    iget v8, v8, Li1/o;->m:I

    .line 543
    .line 544
    iget v9, v5, Lt2/n;->f:I

    .line 545
    .line 546
    iget v10, v6, Lt2/n;->f:I

    .line 547
    .line 548
    if-ne v9, v10, :cond_12

    .line 549
    .line 550
    iget v9, v5, Lt2/n;->g:I

    .line 551
    .line 552
    iget v10, v6, Lt2/n;->g:I

    .line 553
    .line 554
    if-ne v9, v10, :cond_12

    .line 555
    .line 556
    iget-boolean v9, v5, Lt2/n;->h:Z

    .line 557
    .line 558
    iget-boolean v10, v6, Lt2/n;->h:Z

    .line 559
    .line 560
    if-ne v9, v10, :cond_12

    .line 561
    .line 562
    iget-boolean v9, v5, Lt2/n;->i:Z

    .line 563
    .line 564
    if-eqz v9, :cond_d

    .line 565
    .line 566
    iget-boolean v9, v6, Lt2/n;->i:Z

    .line 567
    .line 568
    if-eqz v9, :cond_d

    .line 569
    .line 570
    iget-boolean v9, v5, Lt2/n;->j:Z

    .line 571
    .line 572
    iget-boolean v10, v6, Lt2/n;->j:Z

    .line 573
    .line 574
    if-ne v9, v10, :cond_12

    .line 575
    .line 576
    :cond_d
    iget v9, v5, Lt2/n;->d:I

    .line 577
    .line 578
    iget v10, v6, Lt2/n;->d:I

    .line 579
    .line 580
    if-eq v9, v10, :cond_e

    .line 581
    .line 582
    if-eqz v9, :cond_12

    .line 583
    .line 584
    if-eqz v10, :cond_12

    .line 585
    .line 586
    :cond_e
    iget v7, v7, Li1/o;->m:I

    .line 587
    .line 588
    if-nez v7, :cond_f

    .line 589
    .line 590
    if-nez v8, :cond_f

    .line 591
    .line 592
    iget v9, v5, Lt2/n;->m:I

    .line 593
    .line 594
    iget v10, v6, Lt2/n;->m:I

    .line 595
    .line 596
    if-ne v9, v10, :cond_12

    .line 597
    .line 598
    iget v9, v5, Lt2/n;->n:I

    .line 599
    .line 600
    iget v10, v6, Lt2/n;->n:I

    .line 601
    .line 602
    if-ne v9, v10, :cond_12

    .line 603
    .line 604
    :cond_f
    const/4 v9, 0x1

    .line 605
    if-ne v7, v9, :cond_10

    .line 606
    .line 607
    if-ne v8, v9, :cond_10

    .line 608
    .line 609
    iget v7, v5, Lt2/n;->o:I

    .line 610
    .line 611
    iget v8, v6, Lt2/n;->o:I

    .line 612
    .line 613
    if-ne v7, v8, :cond_12

    .line 614
    .line 615
    iget v7, v5, Lt2/n;->p:I

    .line 616
    .line 617
    iget v8, v6, Lt2/n;->p:I

    .line 618
    .line 619
    if-ne v7, v8, :cond_12

    .line 620
    .line 621
    :cond_10
    iget-boolean v7, v5, Lt2/n;->k:Z

    .line 622
    .line 623
    iget-boolean v8, v6, Lt2/n;->k:Z

    .line 624
    .line 625
    if-ne v7, v8, :cond_12

    .line 626
    .line 627
    if-eqz v7, :cond_11

    .line 628
    .line 629
    iget v5, v5, Lt2/n;->l:I

    .line 630
    .line 631
    iget v6, v6, Lt2/n;->l:I

    .line 632
    .line 633
    if-eq v5, v6, :cond_11

    .line 634
    .line 635
    goto :goto_7

    .line 636
    :cond_11
    :goto_6
    const/4 v4, 0x0

    .line 637
    goto :goto_9

    .line 638
    :cond_12
    :goto_7
    if-eqz v4, :cond_14

    .line 639
    .line 640
    iget-boolean v4, v3, Lt2/o;->o:Z

    .line 641
    .line 642
    if-eqz v4, :cond_14

    .line 643
    .line 644
    iget-wide v4, v3, Lt2/o;->j:J

    .line 645
    .line 646
    sub-long v8, v21, v4

    .line 647
    .line 648
    long-to-int v6, v8

    .line 649
    add-int v12, v17, v6

    .line 650
    .line 651
    iget-wide v8, v3, Lt2/o;->q:J

    .line 652
    .line 653
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    cmp-long v6, v8, v6

    .line 659
    .line 660
    if-nez v6, :cond_13

    .line 661
    .line 662
    goto :goto_8

    .line 663
    :cond_13
    iget-boolean v10, v3, Lt2/o;->r:Z

    .line 664
    .line 665
    iget-wide v6, v3, Lt2/o;->p:J

    .line 666
    .line 667
    sub-long/2addr v4, v6

    .line 668
    long-to-int v11, v4

    .line 669
    iget-object v7, v3, Lt2/o;->a:Ln1/i0;

    .line 670
    .line 671
    const/4 v13, 0x0

    .line 672
    invoke-interface/range {v7 .. v13}, Ln1/i0;->sampleMetadata(JIIILn1/h0;)V

    .line 673
    .line 674
    .line 675
    :cond_14
    :goto_8
    iget-wide v4, v3, Lt2/o;->j:J

    .line 676
    .line 677
    iput-wide v4, v3, Lt2/o;->p:J

    .line 678
    .line 679
    iget-wide v4, v3, Lt2/o;->l:J

    .line 680
    .line 681
    iput-wide v4, v3, Lt2/o;->q:J

    .line 682
    .line 683
    const/4 v4, 0x0

    .line 684
    iput-boolean v4, v3, Lt2/o;->r:Z

    .line 685
    .line 686
    const/4 v5, 0x1

    .line 687
    iput-boolean v5, v3, Lt2/o;->o:Z

    .line 688
    .line 689
    :goto_9
    invoke-virtual {v3}, Lt2/o;->a()V

    .line 690
    .line 691
    .line 692
    iget-boolean v3, v3, Lt2/o;->r:Z

    .line 693
    .line 694
    if-eqz v3, :cond_15

    .line 695
    .line 696
    iput-boolean v4, v0, Lt2/p;->n:Z

    .line 697
    .line 698
    :cond_15
    iget-wide v3, v0, Lt2/p;->m:J

    .line 699
    .line 700
    iget-boolean v5, v0, Lt2/p;->l:Z

    .line 701
    .line 702
    if-eqz v5, :cond_16

    .line 703
    .line 704
    iget-object v5, v0, Lt2/p;->k:Lt2/o;

    .line 705
    .line 706
    iget-boolean v5, v5, Lt2/o;->c:Z

    .line 707
    .line 708
    if-eqz v5, :cond_17

    .line 709
    .line 710
    :cond_16
    move/from16 v5, v23

    .line 711
    .line 712
    goto :goto_a

    .line 713
    :cond_17
    move/from16 v5, v23

    .line 714
    .line 715
    goto :goto_b

    .line 716
    :goto_a
    invoke-virtual {v15, v5}, Lt2/x;->g(I)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v2, v5}, Lt2/x;->g(I)V

    .line 720
    .line 721
    .line 722
    :goto_b
    invoke-virtual {v1, v5}, Lt2/x;->g(I)V

    .line 723
    .line 724
    .line 725
    iget-object v1, v0, Lt2/p;->k:Lt2/o;

    .line 726
    .line 727
    iget-boolean v2, v0, Lt2/p;->n:Z

    .line 728
    .line 729
    iput v5, v1, Lt2/o;->i:I

    .line 730
    .line 731
    iput-wide v3, v1, Lt2/o;->l:J

    .line 732
    .line 733
    move-wide/from16 v8, v21

    .line 734
    .line 735
    iput-wide v8, v1, Lt2/o;->j:J

    .line 736
    .line 737
    iput-boolean v2, v1, Lt2/o;->s:Z

    .line 738
    .line 739
    iget-boolean v2, v1, Lt2/o;->b:Z

    .line 740
    .line 741
    const/4 v9, 0x1

    .line 742
    if-eqz v2, :cond_18

    .line 743
    .line 744
    if-eq v5, v9, :cond_19

    .line 745
    .line 746
    :cond_18
    iget-boolean v2, v1, Lt2/o;->c:Z

    .line 747
    .line 748
    if-eqz v2, :cond_1a

    .line 749
    .line 750
    const/4 v2, 0x5

    .line 751
    if-eq v5, v2, :cond_19

    .line 752
    .line 753
    if-eq v5, v9, :cond_19

    .line 754
    .line 755
    const/4 v2, 0x2

    .line 756
    if-ne v5, v2, :cond_1a

    .line 757
    .line 758
    :cond_19
    iget-object v2, v1, Lt2/o;->m:Lt2/n;

    .line 759
    .line 760
    iget-object v3, v1, Lt2/o;->n:Lt2/n;

    .line 761
    .line 762
    iput-object v3, v1, Lt2/o;->m:Lt2/n;

    .line 763
    .line 764
    iput-object v2, v1, Lt2/o;->n:Lt2/n;

    .line 765
    .line 766
    const/4 v4, 0x0

    .line 767
    iput-boolean v4, v2, Lt2/n;->b:Z

    .line 768
    .line 769
    iput-boolean v4, v2, Lt2/n;->a:Z

    .line 770
    .line 771
    iput v4, v1, Lt2/o;->h:I

    .line 772
    .line 773
    const/4 v5, 0x1

    .line 774
    iput-boolean v5, v1, Lt2/o;->k:Z

    .line 775
    .line 776
    :cond_1a
    move/from16 v3, v18

    .line 777
    .line 778
    move-object/from16 v4, v19

    .line 779
    .line 780
    move/from16 v2, v20

    .line 781
    .line 782
    goto/16 :goto_0
.end method

.method public final b([BII)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    iget-boolean v4, v0, Lt2/p;->l:Z

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    iget-object v4, v0, Lt2/p;->k:Lt2/o;

    .line 14
    .line 15
    iget-boolean v4, v4, Lt2/o;->c:Z

    .line 16
    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    :cond_0
    iget-object v4, v0, Lt2/p;->d:Lt2/x;

    .line 20
    .line 21
    invoke-virtual {v4, v1, v2, v3}, Lt2/x;->a([BII)V

    .line 22
    .line 23
    .line 24
    iget-object v4, v0, Lt2/p;->e:Lt2/x;

    .line 25
    .line 26
    invoke-virtual {v4, v1, v2, v3}, Lt2/x;->a([BII)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v4, v0, Lt2/p;->f:Lt2/x;

    .line 30
    .line 31
    invoke-virtual {v4, v1, v2, v3}, Lt2/x;->a([BII)V

    .line 32
    .line 33
    .line 34
    iget-object v4, v0, Lt2/p;->k:Lt2/o;

    .line 35
    .line 36
    iget-object v5, v4, Lt2/o;->e:Landroid/util/SparseArray;

    .line 37
    .line 38
    iget-object v6, v4, Lt2/o;->f:Lh1/v;

    .line 39
    .line 40
    iget-boolean v7, v4, Lt2/o;->k:Z

    .line 41
    .line 42
    if-nez v7, :cond_2

    .line 43
    .line 44
    goto/16 :goto_6

    .line 45
    .line 46
    :cond_2
    sub-int/2addr v3, v2

    .line 47
    iget-object v7, v4, Lt2/o;->g:[B

    .line 48
    .line 49
    array-length v8, v7

    .line 50
    iget v9, v4, Lt2/o;->h:I

    .line 51
    .line 52
    add-int/2addr v9, v3

    .line 53
    const/4 v10, 0x2

    .line 54
    if-ge v8, v9, :cond_3

    .line 55
    .line 56
    mul-int/2addr v9, v10

    .line 57
    invoke-static {v7, v9}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    iput-object v7, v4, Lt2/o;->g:[B

    .line 62
    .line 63
    :cond_3
    iget-object v7, v4, Lt2/o;->g:[B

    .line 64
    .line 65
    iget v8, v4, Lt2/o;->h:I

    .line 66
    .line 67
    invoke-static {v1, v2, v7, v8, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 68
    .line 69
    .line 70
    iget v1, v4, Lt2/o;->h:I

    .line 71
    .line 72
    add-int/2addr v1, v3

    .line 73
    iput v1, v4, Lt2/o;->h:I

    .line 74
    .line 75
    iget-object v2, v4, Lt2/o;->g:[B

    .line 76
    .line 77
    iput-object v2, v6, Lh1/v;->b:Ljava/lang/Object;

    .line 78
    .line 79
    const/4 v2, 0x0

    .line 80
    iput v2, v6, Lh1/v;->d:I

    .line 81
    .line 82
    iput v1, v6, Lh1/v;->c:I

    .line 83
    .line 84
    iput v2, v6, Lh1/v;->e:I

    .line 85
    .line 86
    invoke-virtual {v6}, Lh1/v;->b()V

    .line 87
    .line 88
    .line 89
    const/16 v1, 0x8

    .line 90
    .line 91
    invoke-virtual {v6, v1}, Lh1/v;->e(I)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-nez v1, :cond_4

    .line 96
    .line 97
    goto/16 :goto_6

    .line 98
    .line 99
    :cond_4
    invoke-virtual {v6}, Lh1/v;->u()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v6, v10}, Lh1/v;->k(I)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    const/4 v3, 0x5

    .line 107
    invoke-virtual {v6, v3}, Lh1/v;->v(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v6}, Lh1/v;->f()Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-nez v7, :cond_5

    .line 115
    .line 116
    goto/16 :goto_6

    .line 117
    .line 118
    :cond_5
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 119
    .line 120
    .line 121
    invoke-virtual {v6}, Lh1/v;->f()Z

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    if-nez v7, :cond_6

    .line 126
    .line 127
    goto/16 :goto_6

    .line 128
    .line 129
    :cond_6
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    iget-boolean v8, v4, Lt2/o;->c:Z

    .line 134
    .line 135
    const/4 v9, 0x1

    .line 136
    if-nez v8, :cond_7

    .line 137
    .line 138
    iput-boolean v2, v4, Lt2/o;->k:Z

    .line 139
    .line 140
    iget-object v1, v4, Lt2/o;->n:Lt2/n;

    .line 141
    .line 142
    iput v7, v1, Lt2/n;->e:I

    .line 143
    .line 144
    iput-boolean v9, v1, Lt2/n;->b:Z

    .line 145
    .line 146
    return-void

    .line 147
    :cond_7
    invoke-virtual {v6}, Lh1/v;->f()Z

    .line 148
    .line 149
    .line 150
    move-result v8

    .line 151
    if-nez v8, :cond_8

    .line 152
    .line 153
    goto/16 :goto_6

    .line 154
    .line 155
    :cond_8
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 156
    .line 157
    .line 158
    move-result v8

    .line 159
    invoke-virtual {v5, v8}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 160
    .line 161
    .line 162
    move-result v11

    .line 163
    if-gez v11, :cond_9

    .line 164
    .line 165
    iput-boolean v2, v4, Lt2/o;->k:Z

    .line 166
    .line 167
    return-void

    .line 168
    :cond_9
    invoke-virtual {v5, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    check-cast v5, Li1/n;

    .line 173
    .line 174
    iget-object v11, v4, Lt2/o;->d:Landroid/util/SparseArray;

    .line 175
    .line 176
    iget v12, v5, Li1/n;->a:I

    .line 177
    .line 178
    iget-boolean v5, v5, Li1/n;->b:Z

    .line 179
    .line 180
    invoke-virtual {v11, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v11

    .line 184
    check-cast v11, Li1/o;

    .line 185
    .line 186
    iget-boolean v12, v11, Li1/o;->j:Z

    .line 187
    .line 188
    iget v13, v11, Li1/o;->n:I

    .line 189
    .line 190
    iget v14, v11, Li1/o;->l:I

    .line 191
    .line 192
    if-eqz v12, :cond_b

    .line 193
    .line 194
    invoke-virtual {v6, v10}, Lh1/v;->e(I)Z

    .line 195
    .line 196
    .line 197
    move-result v12

    .line 198
    if-nez v12, :cond_a

    .line 199
    .line 200
    goto/16 :goto_6

    .line 201
    .line 202
    :cond_a
    invoke-virtual {v6, v10}, Lh1/v;->v(I)V

    .line 203
    .line 204
    .line 205
    :cond_b
    invoke-virtual {v6, v14}, Lh1/v;->e(I)Z

    .line 206
    .line 207
    .line 208
    move-result v10

    .line 209
    if-nez v10, :cond_c

    .line 210
    .line 211
    goto/16 :goto_6

    .line 212
    .line 213
    :cond_c
    invoke-virtual {v6, v14}, Lh1/v;->k(I)I

    .line 214
    .line 215
    .line 216
    move-result v10

    .line 217
    iget-boolean v12, v11, Li1/o;->k:Z

    .line 218
    .line 219
    if-nez v12, :cond_10

    .line 220
    .line 221
    invoke-virtual {v6, v9}, Lh1/v;->e(I)Z

    .line 222
    .line 223
    .line 224
    move-result v12

    .line 225
    if-nez v12, :cond_d

    .line 226
    .line 227
    goto/16 :goto_6

    .line 228
    .line 229
    :cond_d
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 230
    .line 231
    .line 232
    move-result v12

    .line 233
    if-eqz v12, :cond_f

    .line 234
    .line 235
    invoke-virtual {v6, v9}, Lh1/v;->e(I)Z

    .line 236
    .line 237
    .line 238
    move-result v14

    .line 239
    if-nez v14, :cond_e

    .line 240
    .line 241
    goto/16 :goto_6

    .line 242
    .line 243
    :cond_e
    invoke-virtual {v6}, Lh1/v;->j()Z

    .line 244
    .line 245
    .line 246
    move-result v14

    .line 247
    move v15, v9

    .line 248
    goto :goto_1

    .line 249
    :cond_f
    move v14, v2

    .line 250
    :goto_0
    move v15, v14

    .line 251
    goto :goto_1

    .line 252
    :cond_10
    move v12, v2

    .line 253
    move v14, v12

    .line 254
    goto :goto_0

    .line 255
    :goto_1
    iget v2, v4, Lt2/o;->i:I

    .line 256
    .line 257
    if-ne v2, v3, :cond_11

    .line 258
    .line 259
    move v2, v9

    .line 260
    goto :goto_2

    .line 261
    :cond_11
    const/4 v2, 0x0

    .line 262
    :goto_2
    if-eqz v2, :cond_13

    .line 263
    .line 264
    invoke-virtual {v6}, Lh1/v;->f()Z

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    if-nez v3, :cond_12

    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_12
    invoke-virtual {v6}, Lh1/v;->o()I

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    goto :goto_3

    .line 276
    :cond_13
    const/4 v3, 0x0

    .line 277
    :goto_3
    iget v9, v11, Li1/o;->m:I

    .line 278
    .line 279
    if-nez v9, :cond_17

    .line 280
    .line 281
    invoke-virtual {v6, v13}, Lh1/v;->e(I)Z

    .line 282
    .line 283
    .line 284
    move-result v9

    .line 285
    if-nez v9, :cond_14

    .line 286
    .line 287
    goto :goto_6

    .line 288
    :cond_14
    invoke-virtual {v6, v13}, Lh1/v;->k(I)I

    .line 289
    .line 290
    .line 291
    move-result v9

    .line 292
    if-eqz v5, :cond_16

    .line 293
    .line 294
    if-nez v12, :cond_16

    .line 295
    .line 296
    invoke-virtual {v6}, Lh1/v;->f()Z

    .line 297
    .line 298
    .line 299
    move-result v5

    .line 300
    if-nez v5, :cond_15

    .line 301
    .line 302
    goto :goto_6

    .line 303
    :cond_15
    invoke-virtual {v6}, Lh1/v;->p()I

    .line 304
    .line 305
    .line 306
    move-result v5

    .line 307
    :goto_4
    const/4 v6, 0x0

    .line 308
    :goto_5
    const/4 v13, 0x0

    .line 309
    goto :goto_8

    .line 310
    :cond_16
    const/4 v5, 0x0

    .line 311
    goto :goto_4

    .line 312
    :cond_17
    const/4 v13, 0x1

    .line 313
    if-ne v9, v13, :cond_1b

    .line 314
    .line 315
    iget-boolean v9, v11, Li1/o;->o:Z

    .line 316
    .line 317
    if-nez v9, :cond_1b

    .line 318
    .line 319
    invoke-virtual {v6}, Lh1/v;->f()Z

    .line 320
    .line 321
    .line 322
    move-result v9

    .line 323
    if-nez v9, :cond_18

    .line 324
    .line 325
    goto :goto_6

    .line 326
    :cond_18
    invoke-virtual {v6}, Lh1/v;->p()I

    .line 327
    .line 328
    .line 329
    move-result v9

    .line 330
    if-eqz v5, :cond_1a

    .line 331
    .line 332
    if-nez v12, :cond_1a

    .line 333
    .line 334
    invoke-virtual {v6}, Lh1/v;->f()Z

    .line 335
    .line 336
    .line 337
    move-result v5

    .line 338
    if-nez v5, :cond_19

    .line 339
    .line 340
    :goto_6
    return-void

    .line 341
    :cond_19
    invoke-virtual {v6}, Lh1/v;->p()I

    .line 342
    .line 343
    .line 344
    move-result v5

    .line 345
    move v6, v5

    .line 346
    move v13, v9

    .line 347
    const/4 v5, 0x0

    .line 348
    :goto_7
    const/4 v9, 0x0

    .line 349
    goto :goto_8

    .line 350
    :cond_1a
    move v13, v9

    .line 351
    const/4 v5, 0x0

    .line 352
    const/4 v6, 0x0

    .line 353
    goto :goto_7

    .line 354
    :cond_1b
    const/4 v5, 0x0

    .line 355
    const/4 v6, 0x0

    .line 356
    const/4 v9, 0x0

    .line 357
    goto :goto_5

    .line 358
    :goto_8
    iget-object v0, v4, Lt2/o;->n:Lt2/n;

    .line 359
    .line 360
    iput-object v11, v0, Lt2/n;->c:Li1/o;

    .line 361
    .line 362
    iput v1, v0, Lt2/n;->d:I

    .line 363
    .line 364
    iput v7, v0, Lt2/n;->e:I

    .line 365
    .line 366
    iput v10, v0, Lt2/n;->f:I

    .line 367
    .line 368
    iput v8, v0, Lt2/n;->g:I

    .line 369
    .line 370
    iput-boolean v12, v0, Lt2/n;->h:Z

    .line 371
    .line 372
    iput-boolean v15, v0, Lt2/n;->i:Z

    .line 373
    .line 374
    iput-boolean v14, v0, Lt2/n;->j:Z

    .line 375
    .line 376
    iput-boolean v2, v0, Lt2/n;->k:Z

    .line 377
    .line 378
    iput v3, v0, Lt2/n;->l:I

    .line 379
    .line 380
    iput v9, v0, Lt2/n;->m:I

    .line 381
    .line 382
    iput v5, v0, Lt2/n;->n:I

    .line 383
    .line 384
    iput v13, v0, Lt2/n;->o:I

    .line 385
    .line 386
    iput v6, v0, Lt2/n;->p:I

    .line 387
    .line 388
    const/4 v13, 0x1

    .line 389
    iput-boolean v13, v0, Lt2/n;->a:Z

    .line 390
    .line 391
    iput-boolean v13, v0, Lt2/n;->b:Z

    .line 392
    .line 393
    const/4 v0, 0x0

    .line 394
    iput-boolean v0, v4, Lt2/o;->k:Z

    .line 395
    .line 396
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lt2/p;->g:J

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lt2/p;->n:Z

    .line 7
    .line 8
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide v1, p0, Lt2/p;->m:J

    .line 14
    .line 15
    iget-object v1, p0, Lt2/p;->h:[Z

    .line 16
    .line 17
    invoke-static {v1}, Li1/p;->a([Z)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lt2/p;->d:Lt2/x;

    .line 21
    .line 22
    invoke-virtual {v1}, Lt2/x;->f()V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lt2/p;->e:Lt2/x;

    .line 26
    .line 27
    invoke-virtual {v1}, Lt2/x;->f()V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lt2/p;->f:Lt2/x;

    .line 31
    .line 32
    invoke-virtual {v1}, Lt2/x;->f()V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lt2/p;->a:La4/c;

    .line 36
    .line 37
    iget-object v1, v1, La4/c;->m:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Li1/s;

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Li1/s;->i(I)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lt2/p;->k:Lt2/o;

    .line 45
    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    iput-boolean v0, v1, Lt2/o;->k:Z

    .line 49
    .line 50
    iput-boolean v0, v1, Lt2/o;->o:Z

    .line 51
    .line 52
    iget-object v1, v1, Lt2/o;->n:Lt2/n;

    .line 53
    .line 54
    iput-boolean v0, v1, Lt2/n;->b:Z

    .line 55
    .line 56
    iput-boolean v0, v1, Lt2/n;->a:Z

    .line 57
    .line 58
    :cond_0
    return-void
.end method

.method public final d(Z)V
    .locals 10

    .line 1
    iget-object v0, p0, Lt2/p;->j:Ln1/i0;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget v0, Lh1/i0;->a:I

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    iget-object p1, p0, Lt2/p;->a:La4/c;

    .line 11
    .line 12
    iget-object p1, p1, La4/c;->m:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Li1/s;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, v0}, Li1/s;->i(I)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lt2/p;->k:Lt2/o;

    .line 21
    .line 22
    iget-wide v0, p0, Lt2/p;->g:J

    .line 23
    .line 24
    invoke-virtual {p1}, Lt2/o;->a()V

    .line 25
    .line 26
    .line 27
    iput-wide v0, p1, Lt2/o;->j:J

    .line 28
    .line 29
    iget-wide v3, p1, Lt2/o;->q:J

    .line 30
    .line 31
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    cmp-long v2, v3, v5

    .line 37
    .line 38
    const/4 v7, 0x0

    .line 39
    if-nez v2, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-boolean v5, p1, Lt2/o;->r:Z

    .line 43
    .line 44
    iget-wide v8, p1, Lt2/o;->p:J

    .line 45
    .line 46
    sub-long/2addr v0, v8

    .line 47
    long-to-int v6, v0

    .line 48
    iget-object v2, p1, Lt2/o;->a:Ln1/i0;

    .line 49
    .line 50
    const/4 v8, 0x0

    .line 51
    invoke-interface/range {v2 .. v8}, Ln1/i0;->sampleMetadata(JIIILn1/h0;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    iput-boolean v7, p1, Lt2/o;->o:Z

    .line 55
    .line 56
    :cond_1
    return-void
.end method

.method public final e(Ln1/p;Lt2/g0;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Lt2/g0;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lt2/g0;->b()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, Lt2/g0;->e:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lt2/p;->i:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, Lt2/g0;->b()V

    .line 12
    .line 13
    .line 14
    iget v0, p2, Lt2/g0;->d:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-interface {p1, v0, v1}, Ln1/p;->track(II)Ln1/i0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lt2/p;->j:Ln1/i0;

    .line 22
    .line 23
    new-instance v1, Lt2/o;

    .line 24
    .line 25
    iget-boolean v2, p0, Lt2/p;->b:Z

    .line 26
    .line 27
    iget-boolean v3, p0, Lt2/p;->c:Z

    .line 28
    .line 29
    invoke-direct {v1, v0, v2, v3}, Lt2/o;-><init>(Ln1/i0;ZZ)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lt2/p;->k:Lt2/o;

    .line 33
    .line 34
    iget-object v0, p0, Lt2/p;->a:La4/c;

    .line 35
    .line 36
    invoke-virtual {v0, p1, p2}, La4/c;->s(Ln1/p;Lt2/g0;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final f(IJ)V
    .locals 0

    .line 1
    iput-wide p2, p0, Lt2/p;->m:J

    .line 2
    .line 3
    iget-boolean p2, p0, Lt2/p;->n:Z

    .line 4
    .line 5
    and-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    or-int/2addr p1, p2

    .line 13
    iput-boolean p1, p0, Lt2/p;->n:Z

    .line 14
    .line 15
    return-void
.end method
