.class public final Lt2/b0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/n;


# instance fields
.field public final a:Lh1/d0;

.field public final b:Landroid/util/SparseArray;

.field public final c:Lh1/w;

.field public final d:Lt2/z;

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:J

.field public i:Ls1/b;

.field public j:Ln1/p;

.field public k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, Lh1/d0;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-direct {v0, v1, v2}, Lh1/d0;-><init>(J)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lt2/b0;->a:Lh1/d0;

    .line 12
    .line 13
    new-instance v0, Lh1/w;

    .line 14
    .line 15
    const/16 v1, 0x1000

    .line 16
    .line 17
    invoke-direct {v0, v1}, Lh1/w;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lt2/b0;->c:Lh1/w;

    .line 21
    .line 22
    new-instance v0, Landroid/util/SparseArray;

    .line 23
    .line 24
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lt2/b0;->b:Landroid/util/SparseArray;

    .line 28
    .line 29
    new-instance v0, Lt2/z;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, v1}, Lt2/z;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lt2/b0;->d:Lt2/z;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final init(Ln1/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt2/b0;->j:Ln1/p;

    .line 2
    .line 3
    return-void
.end method

.method public final read(Ln1/o;Ln1/a0;)I
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Lt2/b0;->j:Ln1/p;

    .line 8
    .line 9
    invoke-static {v3}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v1}, Ln1/o;->getLength()J

    .line 13
    .line 14
    .line 15
    move-result-wide v13

    .line 16
    const-wide/16 v18, -0x1

    .line 17
    .line 18
    cmp-long v3, v13, v18

    .line 19
    .line 20
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    const/16 v7, 0x1ba

    .line 26
    .line 27
    iget-object v8, v0, Lt2/b0;->d:Lt2/z;

    .line 28
    .line 29
    const/4 v9, 0x4

    .line 30
    const/4 v10, 0x1

    .line 31
    const/4 v11, 0x0

    .line 32
    if-eqz v3, :cond_a

    .line 33
    .line 34
    iget-boolean v12, v8, Lt2/z;->d:Z

    .line 35
    .line 36
    if-nez v12, :cond_a

    .line 37
    .line 38
    iget-object v3, v8, Lt2/z;->b:Lh1/d0;

    .line 39
    .line 40
    iget-object v12, v8, Lt2/z;->c:Lh1/w;

    .line 41
    .line 42
    iget-boolean v13, v8, Lt2/z;->f:Z

    .line 43
    .line 44
    const-wide/16 v14, 0x4e20

    .line 45
    .line 46
    if-nez v13, :cond_3

    .line 47
    .line 48
    invoke-interface {v1}, Ln1/o;->getLength()J

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    invoke-static {v14, v15, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 53
    .line 54
    .line 55
    move-result-wide v13

    .line 56
    long-to-int v13, v13

    .line 57
    int-to-long v14, v13

    .line 58
    sub-long/2addr v3, v14

    .line 59
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 60
    .line 61
    .line 62
    move-result-wide v14

    .line 63
    cmp-long v14, v14, v3

    .line 64
    .line 65
    if-eqz v14, :cond_0

    .line 66
    .line 67
    iput-wide v3, v2, Ln1/a0;->a:J

    .line 68
    .line 69
    return v10

    .line 70
    :cond_0
    invoke-virtual {v12, v13}, Lh1/w;->D(I)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v1}, Ln1/o;->g()V

    .line 74
    .line 75
    .line 76
    iget-object v2, v12, Lh1/w;->a:[B

    .line 77
    .line 78
    invoke-interface {v1, v2, v11, v13}, Ln1/o;->i([BII)V

    .line 79
    .line 80
    .line 81
    iget v1, v12, Lh1/w;->b:I

    .line 82
    .line 83
    iget v2, v12, Lh1/w;->c:I

    .line 84
    .line 85
    sub-int/2addr v2, v9

    .line 86
    :goto_0
    if-lt v2, v1, :cond_2

    .line 87
    .line 88
    iget-object v3, v12, Lh1/w;->a:[B

    .line 89
    .line 90
    invoke-static {v3, v2}, Lt2/z;->b([BI)I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-ne v3, v7, :cond_1

    .line 95
    .line 96
    add-int/lit8 v3, v2, 0x4

    .line 97
    .line 98
    invoke-virtual {v12, v3}, Lh1/w;->G(I)V

    .line 99
    .line 100
    .line 101
    invoke-static {v12}, Lt2/z;->c(Lh1/w;)J

    .line 102
    .line 103
    .line 104
    move-result-wide v3

    .line 105
    cmp-long v9, v3, v5

    .line 106
    .line 107
    if-eqz v9, :cond_1

    .line 108
    .line 109
    move-wide v5, v3

    .line 110
    goto :goto_1

    .line 111
    :cond_1
    add-int/lit8 v2, v2, -0x1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    :goto_1
    iput-wide v5, v8, Lt2/z;->h:J

    .line 115
    .line 116
    iput-boolean v10, v8, Lt2/z;->f:Z

    .line 117
    .line 118
    return v11

    .line 119
    :cond_3
    move-wide/from16 v20, v5

    .line 120
    .line 121
    const/16 v16, 0x3

    .line 122
    .line 123
    iget-wide v4, v8, Lt2/z;->h:J

    .line 124
    .line 125
    cmp-long v4, v4, v20

    .line 126
    .line 127
    if-nez v4, :cond_4

    .line 128
    .line 129
    invoke-virtual {v8, v1}, Lt2/z;->a(Ln1/o;)V

    .line 130
    .line 131
    .line 132
    return v11

    .line 133
    :cond_4
    iget-boolean v4, v8, Lt2/z;->e:Z

    .line 134
    .line 135
    if-nez v4, :cond_8

    .line 136
    .line 137
    invoke-interface {v1}, Ln1/o;->getLength()J

    .line 138
    .line 139
    .line 140
    move-result-wide v3

    .line 141
    invoke-static {v14, v15, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 142
    .line 143
    .line 144
    move-result-wide v3

    .line 145
    long-to-int v3, v3

    .line 146
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 147
    .line 148
    .line 149
    move-result-wide v4

    .line 150
    int-to-long v13, v11

    .line 151
    cmp-long v4, v4, v13

    .line 152
    .line 153
    if-eqz v4, :cond_5

    .line 154
    .line 155
    iput-wide v13, v2, Ln1/a0;->a:J

    .line 156
    .line 157
    return v10

    .line 158
    :cond_5
    invoke-virtual {v12, v3}, Lh1/w;->D(I)V

    .line 159
    .line 160
    .line 161
    invoke-interface {v1}, Ln1/o;->g()V

    .line 162
    .line 163
    .line 164
    iget-object v2, v12, Lh1/w;->a:[B

    .line 165
    .line 166
    invoke-interface {v1, v2, v11, v3}, Ln1/o;->i([BII)V

    .line 167
    .line 168
    .line 169
    iget v1, v12, Lh1/w;->b:I

    .line 170
    .line 171
    iget v2, v12, Lh1/w;->c:I

    .line 172
    .line 173
    :goto_2
    add-int/lit8 v3, v2, -0x3

    .line 174
    .line 175
    if-ge v1, v3, :cond_7

    .line 176
    .line 177
    iget-object v3, v12, Lh1/w;->a:[B

    .line 178
    .line 179
    invoke-static {v3, v1}, Lt2/z;->b([BI)I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    if-ne v3, v7, :cond_6

    .line 184
    .line 185
    add-int/lit8 v3, v1, 0x4

    .line 186
    .line 187
    invoke-virtual {v12, v3}, Lh1/w;->G(I)V

    .line 188
    .line 189
    .line 190
    invoke-static {v12}, Lt2/z;->c(Lh1/w;)J

    .line 191
    .line 192
    .line 193
    move-result-wide v3

    .line 194
    cmp-long v5, v3, v20

    .line 195
    .line 196
    if-eqz v5, :cond_6

    .line 197
    .line 198
    move-wide v5, v3

    .line 199
    goto :goto_3

    .line 200
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_7
    move-wide/from16 v5, v20

    .line 204
    .line 205
    :goto_3
    iput-wide v5, v8, Lt2/z;->g:J

    .line 206
    .line 207
    iput-boolean v10, v8, Lt2/z;->e:Z

    .line 208
    .line 209
    return v11

    .line 210
    :cond_8
    iget-wide v4, v8, Lt2/z;->g:J

    .line 211
    .line 212
    cmp-long v2, v4, v20

    .line 213
    .line 214
    if-nez v2, :cond_9

    .line 215
    .line 216
    invoke-virtual {v8, v1}, Lt2/z;->a(Ln1/o;)V

    .line 217
    .line 218
    .line 219
    return v11

    .line 220
    :cond_9
    invoke-virtual {v3, v4, v5}, Lh1/d0;->b(J)J

    .line 221
    .line 222
    .line 223
    move-result-wide v4

    .line 224
    iget-wide v6, v8, Lt2/z;->h:J

    .line 225
    .line 226
    invoke-virtual {v3, v6, v7}, Lh1/d0;->c(J)J

    .line 227
    .line 228
    .line 229
    move-result-wide v2

    .line 230
    sub-long/2addr v2, v4

    .line 231
    iput-wide v2, v8, Lt2/z;->i:J

    .line 232
    .line 233
    invoke-virtual {v8, v1}, Lt2/z;->a(Ln1/o;)V

    .line 234
    .line 235
    .line 236
    return v11

    .line 237
    :cond_a
    move-wide/from16 v20, v5

    .line 238
    .line 239
    const/16 v16, 0x3

    .line 240
    .line 241
    iget-boolean v4, v0, Lt2/b0;->k:Z

    .line 242
    .line 243
    if-nez v4, :cond_c

    .line 244
    .line 245
    iput-boolean v10, v0, Lt2/b0;->k:Z

    .line 246
    .line 247
    iget-wide v4, v8, Lt2/z;->i:J

    .line 248
    .line 249
    cmp-long v6, v4, v20

    .line 250
    .line 251
    if-eqz v6, :cond_b

    .line 252
    .line 253
    move-wide v5, v4

    .line 254
    new-instance v4, Ls1/b;

    .line 255
    .line 256
    iget-object v8, v8, Lt2/z;->b:Lh1/d0;

    .line 257
    .line 258
    move-wide/from16 v20, v5

    .line 259
    .line 260
    new-instance v5, Lk2/b;

    .line 261
    .line 262
    const/4 v6, 0x6

    .line 263
    invoke-direct {v5, v6}, Lk2/b;-><init>(I)V

    .line 264
    .line 265
    .line 266
    new-instance v6, Ls/e;

    .line 267
    .line 268
    invoke-direct {v6, v8}, Ls/e;-><init>(Lh1/d0;)V

    .line 269
    .line 270
    .line 271
    const-wide/16 v22, 0x1

    .line 272
    .line 273
    add-long v22, v20, v22

    .line 274
    .line 275
    move/from16 v8, v16

    .line 276
    .line 277
    const-wide/16 v15, 0xbc

    .line 278
    .line 279
    const/16 v17, 0x3e8

    .line 280
    .line 281
    move/from16 v24, v11

    .line 282
    .line 283
    const-wide/16 v11, 0x0

    .line 284
    .line 285
    move/from16 v25, v3

    .line 286
    .line 287
    move v3, v9

    .line 288
    move-wide/from16 v7, v20

    .line 289
    .line 290
    move-wide/from16 v9, v22

    .line 291
    .line 292
    invoke-direct/range {v4 .. v17}, Ls1/b;-><init>(Ln1/g;Ln1/i;JJJJJI)V

    .line 293
    .line 294
    .line 295
    iput-object v4, v0, Lt2/b0;->i:Ls1/b;

    .line 296
    .line 297
    iget-object v5, v0, Lt2/b0;->j:Ln1/p;

    .line 298
    .line 299
    iget-object v4, v4, Ls1/b;->a:Ln1/e;

    .line 300
    .line 301
    invoke-interface {v5, v4}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 302
    .line 303
    .line 304
    goto :goto_4

    .line 305
    :cond_b
    move/from16 v25, v3

    .line 306
    .line 307
    move-wide v5, v4

    .line 308
    move v3, v9

    .line 309
    iget-object v4, v0, Lt2/b0;->j:Ln1/p;

    .line 310
    .line 311
    new-instance v7, Ln1/s;

    .line 312
    .line 313
    invoke-direct {v7, v5, v6}, Ln1/s;-><init>(J)V

    .line 314
    .line 315
    .line 316
    invoke-interface {v4, v7}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 317
    .line 318
    .line 319
    goto :goto_4

    .line 320
    :cond_c
    move/from16 v25, v3

    .line 321
    .line 322
    move v3, v9

    .line 323
    :goto_4
    iget-object v4, v0, Lt2/b0;->i:Ls1/b;

    .line 324
    .line 325
    if-eqz v4, :cond_d

    .line 326
    .line 327
    iget-object v5, v4, Ls1/b;->c:Ln1/f;

    .line 328
    .line 329
    if-eqz v5, :cond_d

    .line 330
    .line 331
    invoke-virtual {v4, v1, v2}, Ls1/b;->b(Ln1/o;Ln1/a0;)I

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    return v1

    .line 336
    :cond_d
    invoke-interface {v1}, Ln1/o;->g()V

    .line 337
    .line 338
    .line 339
    if-eqz v25, :cond_e

    .line 340
    .line 341
    invoke-interface {v1}, Ln1/o;->c()J

    .line 342
    .line 343
    .line 344
    move-result-wide v4

    .line 345
    sub-long/2addr v13, v4

    .line 346
    goto :goto_5

    .line 347
    :cond_e
    move-wide/from16 v13, v18

    .line 348
    .line 349
    :goto_5
    cmp-long v2, v13, v18

    .line 350
    .line 351
    if-eqz v2, :cond_f

    .line 352
    .line 353
    const-wide/16 v4, 0x4

    .line 354
    .line 355
    cmp-long v2, v13, v4

    .line 356
    .line 357
    if-gez v2, :cond_f

    .line 358
    .line 359
    goto :goto_6

    .line 360
    :cond_f
    iget-object v2, v0, Lt2/b0;->c:Lh1/w;

    .line 361
    .line 362
    iget-object v4, v2, Lh1/w;->a:[B

    .line 363
    .line 364
    const/4 v5, 0x1

    .line 365
    const/4 v6, 0x0

    .line 366
    invoke-interface {v1, v4, v6, v3, v5}, Ln1/o;->b([BIIZ)Z

    .line 367
    .line 368
    .line 369
    move-result v4

    .line 370
    if-nez v4, :cond_10

    .line 371
    .line 372
    goto :goto_6

    .line 373
    :cond_10
    invoke-virtual {v2, v6}, Lh1/w;->G(I)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2}, Lh1/w;->g()I

    .line 377
    .line 378
    .line 379
    move-result v4

    .line 380
    const/16 v7, 0x1b9

    .line 381
    .line 382
    if-ne v4, v7, :cond_11

    .line 383
    .line 384
    :goto_6
    const/4 v1, -0x1

    .line 385
    return v1

    .line 386
    :cond_11
    const/16 v7, 0x1ba

    .line 387
    .line 388
    if-ne v4, v7, :cond_12

    .line 389
    .line 390
    iget-object v3, v2, Lh1/w;->a:[B

    .line 391
    .line 392
    const/16 v4, 0xa

    .line 393
    .line 394
    invoke-interface {v1, v3, v6, v4}, Ln1/o;->i([BII)V

    .line 395
    .line 396
    .line 397
    const/16 v3, 0x9

    .line 398
    .line 399
    invoke-virtual {v2, v3}, Lh1/w;->G(I)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v2}, Lh1/w;->u()I

    .line 403
    .line 404
    .line 405
    move-result v2

    .line 406
    and-int/lit8 v2, v2, 0x7

    .line 407
    .line 408
    add-int/lit8 v2, v2, 0xe

    .line 409
    .line 410
    invoke-interface {v1, v2}, Ln1/o;->h(I)V

    .line 411
    .line 412
    .line 413
    return v6

    .line 414
    :cond_12
    const/16 v7, 0x1bb

    .line 415
    .line 416
    const/4 v8, 0x2

    .line 417
    const/4 v9, 0x6

    .line 418
    if-ne v4, v7, :cond_13

    .line 419
    .line 420
    iget-object v3, v2, Lh1/w;->a:[B

    .line 421
    .line 422
    invoke-interface {v1, v3, v6, v8}, Ln1/o;->i([BII)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v2, v6}, Lh1/w;->G(I)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v2}, Lh1/w;->A()I

    .line 429
    .line 430
    .line 431
    move-result v2

    .line 432
    add-int/2addr v2, v9

    .line 433
    invoke-interface {v1, v2}, Ln1/o;->h(I)V

    .line 434
    .line 435
    .line 436
    return v6

    .line 437
    :cond_13
    and-int/lit16 v7, v4, -0x100

    .line 438
    .line 439
    const/16 v10, 0x8

    .line 440
    .line 441
    shr-int/2addr v7, v10

    .line 442
    if-eq v7, v5, :cond_14

    .line 443
    .line 444
    invoke-interface {v1, v5}, Ln1/o;->h(I)V

    .line 445
    .line 446
    .line 447
    return v6

    .line 448
    :cond_14
    and-int/lit16 v7, v4, 0xff

    .line 449
    .line 450
    iget-object v11, v0, Lt2/b0;->b:Landroid/util/SparseArray;

    .line 451
    .line 452
    invoke-virtual {v11, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v12

    .line 456
    check-cast v12, Lt2/a0;

    .line 457
    .line 458
    iget-boolean v13, v0, Lt2/b0;->e:Z

    .line 459
    .line 460
    if-nez v13, :cond_1a

    .line 461
    .line 462
    if-nez v12, :cond_18

    .line 463
    .line 464
    const/16 v13, 0xbd

    .line 465
    .line 466
    if-ne v7, v13, :cond_15

    .line 467
    .line 468
    new-instance v4, Lt2/b;

    .line 469
    .line 470
    invoke-direct {v4}, Lt2/b;-><init>()V

    .line 471
    .line 472
    .line 473
    iput-boolean v5, v0, Lt2/b0;->f:Z

    .line 474
    .line 475
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 476
    .line 477
    .line 478
    move-result-wide v13

    .line 479
    iput-wide v13, v0, Lt2/b0;->h:J

    .line 480
    .line 481
    goto :goto_7

    .line 482
    :cond_15
    and-int/lit16 v13, v4, 0xe0

    .line 483
    .line 484
    const/16 v14, 0xc0

    .line 485
    .line 486
    const/4 v15, 0x0

    .line 487
    if-ne v13, v14, :cond_16

    .line 488
    .line 489
    new-instance v4, Lt2/t;

    .line 490
    .line 491
    invoke-direct {v4, v15, v6}, Lt2/t;-><init>(Ljava/lang/String;I)V

    .line 492
    .line 493
    .line 494
    iput-boolean v5, v0, Lt2/b0;->f:Z

    .line 495
    .line 496
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 497
    .line 498
    .line 499
    move-result-wide v13

    .line 500
    iput-wide v13, v0, Lt2/b0;->h:J

    .line 501
    .line 502
    goto :goto_7

    .line 503
    :cond_16
    and-int/lit16 v4, v4, 0xf0

    .line 504
    .line 505
    const/16 v13, 0xe0

    .line 506
    .line 507
    if-ne v4, v13, :cond_17

    .line 508
    .line 509
    new-instance v4, Lt2/j;

    .line 510
    .line 511
    invoke-direct {v4, v15}, Lt2/j;-><init>(Ls/e;)V

    .line 512
    .line 513
    .line 514
    iput-boolean v5, v0, Lt2/b0;->g:Z

    .line 515
    .line 516
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 517
    .line 518
    .line 519
    move-result-wide v13

    .line 520
    iput-wide v13, v0, Lt2/b0;->h:J

    .line 521
    .line 522
    goto :goto_7

    .line 523
    :cond_17
    move-object v4, v15

    .line 524
    :goto_7
    if-eqz v4, :cond_18

    .line 525
    .line 526
    new-instance v12, Lt2/g0;

    .line 527
    .line 528
    const/16 v13, 0x100

    .line 529
    .line 530
    invoke-direct {v12, v7, v13}, Lt2/g0;-><init>(II)V

    .line 531
    .line 532
    .line 533
    iget-object v13, v0, Lt2/b0;->j:Ln1/p;

    .line 534
    .line 535
    invoke-interface {v4, v13, v12}, Lt2/h;->e(Ln1/p;Lt2/g0;)V

    .line 536
    .line 537
    .line 538
    new-instance v12, Lt2/a0;

    .line 539
    .line 540
    iget-object v13, v0, Lt2/b0;->a:Lh1/d0;

    .line 541
    .line 542
    invoke-direct {v12, v4, v13}, Lt2/a0;-><init>(Lt2/h;Lh1/d0;)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v11, v7, v12}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    :cond_18
    iget-boolean v4, v0, Lt2/b0;->f:Z

    .line 549
    .line 550
    if-eqz v4, :cond_19

    .line 551
    .line 552
    iget-boolean v4, v0, Lt2/b0;->g:Z

    .line 553
    .line 554
    if-eqz v4, :cond_19

    .line 555
    .line 556
    iget-wide v13, v0, Lt2/b0;->h:J

    .line 557
    .line 558
    const-wide/16 v15, 0x2000

    .line 559
    .line 560
    add-long/2addr v13, v15

    .line 561
    goto :goto_8

    .line 562
    :cond_19
    const-wide/32 v13, 0x100000

    .line 563
    .line 564
    .line 565
    :goto_8
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 566
    .line 567
    .line 568
    move-result-wide v15

    .line 569
    cmp-long v4, v15, v13

    .line 570
    .line 571
    if-lez v4, :cond_1a

    .line 572
    .line 573
    iput-boolean v5, v0, Lt2/b0;->e:Z

    .line 574
    .line 575
    iget-object v4, v0, Lt2/b0;->j:Ln1/p;

    .line 576
    .line 577
    invoke-interface {v4}, Ln1/p;->endTracks()V

    .line 578
    .line 579
    .line 580
    :cond_1a
    iget-object v4, v2, Lh1/w;->a:[B

    .line 581
    .line 582
    invoke-interface {v1, v4, v6, v8}, Ln1/o;->i([BII)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v2, v6}, Lh1/w;->G(I)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v2}, Lh1/w;->A()I

    .line 589
    .line 590
    .line 591
    move-result v4

    .line 592
    add-int/2addr v4, v9

    .line 593
    if-nez v12, :cond_1b

    .line 594
    .line 595
    invoke-interface {v1, v4}, Ln1/o;->h(I)V

    .line 596
    .line 597
    .line 598
    return v6

    .line 599
    :cond_1b
    invoke-virtual {v2, v4}, Lh1/w;->D(I)V

    .line 600
    .line 601
    .line 602
    iget-object v7, v2, Lh1/w;->a:[B

    .line 603
    .line 604
    invoke-interface {v1, v7, v6, v4}, Ln1/o;->readFully([BII)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v2, v9}, Lh1/w;->G(I)V

    .line 608
    .line 609
    .line 610
    iget-object v1, v12, Lt2/a0;->a:Lt2/h;

    .line 611
    .line 612
    iget-object v4, v12, Lt2/a0;->c:Lh1/v;

    .line 613
    .line 614
    iget-object v7, v4, Lh1/v;->b:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast v7, [B

    .line 617
    .line 618
    const/4 v8, 0x3

    .line 619
    invoke-virtual {v2, v7, v6, v8}, Lh1/w;->e([BII)V

    .line 620
    .line 621
    .line 622
    invoke-virtual {v4, v6}, Lh1/v;->s(I)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v4, v10}, Lh1/v;->v(I)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {v4}, Lh1/v;->j()Z

    .line 629
    .line 630
    .line 631
    move-result v7

    .line 632
    iput-boolean v7, v12, Lt2/a0;->d:Z

    .line 633
    .line 634
    invoke-virtual {v4}, Lh1/v;->j()Z

    .line 635
    .line 636
    .line 637
    move-result v7

    .line 638
    iput-boolean v7, v12, Lt2/a0;->e:Z

    .line 639
    .line 640
    invoke-virtual {v4, v9}, Lh1/v;->v(I)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v4, v10}, Lh1/v;->k(I)I

    .line 644
    .line 645
    .line 646
    move-result v7

    .line 647
    iget-object v8, v4, Lh1/v;->b:Ljava/lang/Object;

    .line 648
    .line 649
    check-cast v8, [B

    .line 650
    .line 651
    invoke-virtual {v2, v8, v6, v7}, Lh1/w;->e([BII)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v4, v6}, Lh1/v;->s(I)V

    .line 655
    .line 656
    .line 657
    iget-object v7, v12, Lt2/a0;->b:Lh1/d0;

    .line 658
    .line 659
    const-wide/16 v8, 0x0

    .line 660
    .line 661
    iput-wide v8, v12, Lt2/a0;->g:J

    .line 662
    .line 663
    iget-boolean v8, v12, Lt2/a0;->d:Z

    .line 664
    .line 665
    if-eqz v8, :cond_1d

    .line 666
    .line 667
    invoke-virtual {v4, v3}, Lh1/v;->v(I)V

    .line 668
    .line 669
    .line 670
    const/4 v8, 0x3

    .line 671
    invoke-virtual {v4, v8}, Lh1/v;->k(I)I

    .line 672
    .line 673
    .line 674
    move-result v9

    .line 675
    int-to-long v8, v9

    .line 676
    const/16 v10, 0x1e

    .line 677
    .line 678
    shl-long/2addr v8, v10

    .line 679
    invoke-virtual {v4, v5}, Lh1/v;->v(I)V

    .line 680
    .line 681
    .line 682
    const/16 v11, 0xf

    .line 683
    .line 684
    invoke-virtual {v4, v11}, Lh1/v;->k(I)I

    .line 685
    .line 686
    .line 687
    move-result v13

    .line 688
    shl-int/2addr v13, v11

    .line 689
    int-to-long v13, v13

    .line 690
    or-long/2addr v8, v13

    .line 691
    invoke-virtual {v4, v5}, Lh1/v;->v(I)V

    .line 692
    .line 693
    .line 694
    invoke-virtual {v4, v11}, Lh1/v;->k(I)I

    .line 695
    .line 696
    .line 697
    move-result v13

    .line 698
    int-to-long v13, v13

    .line 699
    or-long/2addr v8, v13

    .line 700
    invoke-virtual {v4, v5}, Lh1/v;->v(I)V

    .line 701
    .line 702
    .line 703
    iget-boolean v13, v12, Lt2/a0;->f:Z

    .line 704
    .line 705
    if-nez v13, :cond_1c

    .line 706
    .line 707
    iget-boolean v13, v12, Lt2/a0;->e:Z

    .line 708
    .line 709
    if-eqz v13, :cond_1c

    .line 710
    .line 711
    invoke-virtual {v4, v3}, Lh1/v;->v(I)V

    .line 712
    .line 713
    .line 714
    const/4 v13, 0x3

    .line 715
    invoke-virtual {v4, v13}, Lh1/v;->k(I)I

    .line 716
    .line 717
    .line 718
    move-result v13

    .line 719
    int-to-long v13, v13

    .line 720
    shl-long/2addr v13, v10

    .line 721
    invoke-virtual {v4, v5}, Lh1/v;->v(I)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v4, v11}, Lh1/v;->k(I)I

    .line 725
    .line 726
    .line 727
    move-result v10

    .line 728
    shl-int/2addr v10, v11

    .line 729
    move-object v15, v7

    .line 730
    int-to-long v6, v10

    .line 731
    or-long/2addr v6, v13

    .line 732
    invoke-virtual {v4, v5}, Lh1/v;->v(I)V

    .line 733
    .line 734
    .line 735
    invoke-virtual {v4, v11}, Lh1/v;->k(I)I

    .line 736
    .line 737
    .line 738
    move-result v10

    .line 739
    int-to-long v10, v10

    .line 740
    or-long/2addr v6, v10

    .line 741
    invoke-virtual {v4, v5}, Lh1/v;->v(I)V

    .line 742
    .line 743
    .line 744
    invoke-virtual {v15, v6, v7}, Lh1/d0;->b(J)J

    .line 745
    .line 746
    .line 747
    iput-boolean v5, v12, Lt2/a0;->f:Z

    .line 748
    .line 749
    goto :goto_9

    .line 750
    :cond_1c
    move-object v15, v7

    .line 751
    :goto_9
    invoke-virtual {v15, v8, v9}, Lh1/d0;->b(J)J

    .line 752
    .line 753
    .line 754
    move-result-wide v4

    .line 755
    iput-wide v4, v12, Lt2/a0;->g:J

    .line 756
    .line 757
    :cond_1d
    iget-wide v4, v12, Lt2/a0;->g:J

    .line 758
    .line 759
    invoke-interface {v1, v3, v4, v5}, Lt2/h;->f(IJ)V

    .line 760
    .line 761
    .line 762
    invoke-interface {v1, v2}, Lt2/h;->a(Lh1/w;)V

    .line 763
    .line 764
    .line 765
    const/4 v6, 0x0

    .line 766
    invoke-interface {v1, v6}, Lt2/h;->d(Z)V

    .line 767
    .line 768
    .line 769
    iget-object v1, v2, Lh1/w;->a:[B

    .line 770
    .line 771
    array-length v1, v1

    .line 772
    invoke-virtual {v2, v1}, Lh1/w;->F(I)V

    .line 773
    .line 774
    .line 775
    return v6
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method

.method public final seek(JJ)V
    .locals 7

    .line 1
    iget-object p1, p0, Lt2/b0;->b:Landroid/util/SparseArray;

    .line 2
    .line 3
    iget-object p2, p0, Lt2/b0;->a:Lh1/d0;

    .line 4
    .line 5
    monitor-enter p2

    .line 6
    :try_start_0
    iget-wide v0, p2, Lh1/d0;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit p2

    .line 9
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v0, v0, v2

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    const/4 v4, 0x0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    move v0, v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v4

    .line 23
    :goto_0
    if-nez v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p2}, Lh1/d0;->d()J

    .line 26
    .line 27
    .line 28
    move-result-wide v5

    .line 29
    cmp-long v0, v5, v2

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    const-wide/16 v2, 0x0

    .line 34
    .line 35
    cmp-long v0, v5, v2

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    cmp-long v0, v5, p3

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move v1, v4

    .line 45
    :goto_1
    move v0, v1

    .line 46
    :cond_2
    if-eqz v0, :cond_3

    .line 47
    .line 48
    invoke-virtual {p2, p3, p4}, Lh1/d0;->f(J)V

    .line 49
    .line 50
    .line 51
    :cond_3
    iget-object p2, p0, Lt2/b0;->i:Ls1/b;

    .line 52
    .line 53
    if-eqz p2, :cond_4

    .line 54
    .line 55
    invoke-virtual {p2, p3, p4}, Ls1/b;->d(J)V

    .line 56
    .line 57
    .line 58
    :cond_4
    move p2, v4

    .line 59
    :goto_2
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    if-ge p2, p3, :cond_5

    .line 64
    .line 65
    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    check-cast p3, Lt2/a0;

    .line 70
    .line 71
    iput-boolean v4, p3, Lt2/a0;->f:Z

    .line 72
    .line 73
    iget-object p3, p3, Lt2/a0;->a:Lt2/h;

    .line 74
    .line 75
    invoke-interface {p3}, Lt2/h;->c()V

    .line 76
    .line 77
    .line 78
    add-int/lit8 p2, p2, 0x1

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_5
    return-void

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    throw p1
.end method

.method public final sniff(Ln1/o;)Z
    .locals 9

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {p1, v1, v2, v0}, Ln1/o;->i([BII)V

    .line 7
    .line 8
    .line 9
    aget-byte v0, v1, v2

    .line 10
    .line 11
    and-int/lit16 v0, v0, 0xff

    .line 12
    .line 13
    shl-int/lit8 v0, v0, 0x18

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    aget-byte v4, v1, v3

    .line 17
    .line 18
    and-int/lit16 v4, v4, 0xff

    .line 19
    .line 20
    shl-int/lit8 v4, v4, 0x10

    .line 21
    .line 22
    or-int/2addr v0, v4

    .line 23
    const/4 v4, 0x2

    .line 24
    aget-byte v5, v1, v4

    .line 25
    .line 26
    and-int/lit16 v5, v5, 0xff

    .line 27
    .line 28
    const/16 v6, 0x8

    .line 29
    .line 30
    shl-int/2addr v5, v6

    .line 31
    or-int/2addr v0, v5

    .line 32
    const/4 v5, 0x3

    .line 33
    aget-byte v7, v1, v5

    .line 34
    .line 35
    and-int/lit16 v7, v7, 0xff

    .line 36
    .line 37
    or-int/2addr v0, v7

    .line 38
    const/16 v7, 0x1ba

    .line 39
    .line 40
    if-eq v7, v0, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v0, 0x4

    .line 44
    aget-byte v7, v1, v0

    .line 45
    .line 46
    and-int/lit16 v7, v7, 0xc4

    .line 47
    .line 48
    const/16 v8, 0x44

    .line 49
    .line 50
    if-eq v7, v8, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const/4 v7, 0x6

    .line 54
    aget-byte v7, v1, v7

    .line 55
    .line 56
    and-int/2addr v7, v0

    .line 57
    if-eq v7, v0, :cond_2

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    aget-byte v7, v1, v6

    .line 61
    .line 62
    and-int/2addr v7, v0

    .line 63
    if-eq v7, v0, :cond_3

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    const/16 v0, 0x9

    .line 67
    .line 68
    aget-byte v0, v1, v0

    .line 69
    .line 70
    and-int/2addr v0, v3

    .line 71
    if-eq v0, v3, :cond_4

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    const/16 v0, 0xc

    .line 75
    .line 76
    aget-byte v0, v1, v0

    .line 77
    .line 78
    and-int/2addr v0, v5

    .line 79
    if-eq v0, v5, :cond_5

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_5
    const/16 v0, 0xd

    .line 83
    .line 84
    aget-byte v0, v1, v0

    .line 85
    .line 86
    and-int/lit8 v0, v0, 0x7

    .line 87
    .line 88
    invoke-interface {p1, v0}, Ln1/o;->d(I)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p1, v1, v2, v5}, Ln1/o;->i([BII)V

    .line 92
    .line 93
    .line 94
    aget-byte p1, v1, v2

    .line 95
    .line 96
    and-int/lit16 p1, p1, 0xff

    .line 97
    .line 98
    shl-int/lit8 p1, p1, 0x10

    .line 99
    .line 100
    aget-byte v0, v1, v3

    .line 101
    .line 102
    and-int/lit16 v0, v0, 0xff

    .line 103
    .line 104
    shl-int/2addr v0, v6

    .line 105
    or-int/2addr p1, v0

    .line 106
    aget-byte v0, v1, v4

    .line 107
    .line 108
    and-int/lit16 v0, v0, 0xff

    .line 109
    .line 110
    or-int/2addr p1, v0

    .line 111
    if-ne v3, p1, :cond_6

    .line 112
    .line 113
    return v3

    .line 114
    :cond_6
    :goto_0
    return v2
.end method
