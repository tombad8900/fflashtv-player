.class public final Lt2/s;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lt2/h;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Lh1/w;

.field public final d:Lh1/v;

.field public e:Ln1/i0;

.field public f:Ljava/lang/String;

.field public g:Landroidx/media3/common/w;

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:J

.field public m:Z

.field public n:I

.field public o:I

.field public p:I

.field public q:Z

.field public r:J

.field public s:I

.field public t:J

.field public u:I

.field public v:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt2/s;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lt2/s;->b:I

    .line 7
    .line 8
    new-instance p1, Lh1/w;

    .line 9
    .line 10
    const/16 p2, 0x400

    .line 11
    .line 12
    invoke-direct {p1, p2}, Lh1/w;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lt2/s;->c:Lh1/w;

    .line 16
    .line 17
    new-instance p2, Lh1/v;

    .line 18
    .line 19
    iget-object p1, p1, Lh1/w;->a:[B

    .line 20
    .line 21
    array-length v0, p1

    .line 22
    invoke-direct {p2, p1, v0}, Lh1/v;-><init>([BI)V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Lt2/s;->d:Lh1/v;

    .line 26
    .line 27
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    iput-wide p1, p0, Lt2/s;->l:J

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a(Lh1/w;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lt2/s;->e:Ln1/i0;

    .line 4
    .line 5
    invoke-static {v1}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lh1/w;->a()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-lez v1, :cond_1e

    .line 13
    .line 14
    iget v1, v0, Lt2/s;->h:I

    .line 15
    .line 16
    const/16 v2, 0x56

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    if-eqz v1, :cond_1d

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    const/4 v5, 0x0

    .line 23
    if-eq v1, v3, :cond_1b

    .line 24
    .line 25
    iget-object v2, v0, Lt2/s;->c:Lh1/w;

    .line 26
    .line 27
    const/16 v6, 0x8

    .line 28
    .line 29
    const/4 v7, 0x3

    .line 30
    iget-object v8, v0, Lt2/s;->d:Lh1/v;

    .line 31
    .line 32
    if-eq v1, v4, :cond_19

    .line 33
    .line 34
    if-ne v1, v7, :cond_18

    .line 35
    .line 36
    invoke-virtual/range {p1 .. p1}, Lh1/w;->a()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iget v9, v0, Lt2/s;->j:I

    .line 41
    .line 42
    iget v10, v0, Lt2/s;->i:I

    .line 43
    .line 44
    sub-int/2addr v9, v10

    .line 45
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    iget-object v9, v8, Lh1/v;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v9, [B

    .line 52
    .line 53
    iget v10, v0, Lt2/s;->i:I

    .line 54
    .line 55
    move-object/from16 v11, p1

    .line 56
    .line 57
    invoke-virtual {v11, v9, v10, v1}, Lh1/w;->e([BII)V

    .line 58
    .line 59
    .line 60
    iget v9, v0, Lt2/s;->i:I

    .line 61
    .line 62
    add-int/2addr v9, v1

    .line 63
    iput v9, v0, Lt2/s;->i:I

    .line 64
    .line 65
    iget v1, v0, Lt2/s;->j:I

    .line 66
    .line 67
    if-ne v9, v1, :cond_0

    .line 68
    .line 69
    invoke-virtual {v8, v5}, Lh1/v;->s(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v8}, Lh1/v;->j()Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    const/4 v9, 0x0

    .line 77
    if-nez v1, :cond_f

    .line 78
    .line 79
    iput-boolean v3, v0, Lt2/s;->m:Z

    .line 80
    .line 81
    invoke-virtual {v8, v3}, Lh1/v;->k(I)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-ne v1, v3, :cond_1

    .line 86
    .line 87
    invoke-virtual {v8, v3}, Lh1/v;->k(I)I

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    goto :goto_1

    .line 92
    :cond_1
    move v10, v5

    .line 93
    :goto_1
    iput v10, v0, Lt2/s;->n:I

    .line 94
    .line 95
    if-nez v10, :cond_e

    .line 96
    .line 97
    if-ne v1, v3, :cond_2

    .line 98
    .line 99
    invoke-virtual {v8, v4}, Lh1/v;->k(I)I

    .line 100
    .line 101
    .line 102
    move-result v10

    .line 103
    add-int/2addr v10, v3

    .line 104
    mul-int/2addr v10, v6

    .line 105
    invoke-virtual {v8, v10}, Lh1/v;->k(I)I

    .line 106
    .line 107
    .line 108
    :cond_2
    invoke-virtual {v8}, Lh1/v;->j()Z

    .line 109
    .line 110
    .line 111
    move-result v10

    .line 112
    if-eqz v10, :cond_d

    .line 113
    .line 114
    const/4 v10, 0x6

    .line 115
    invoke-virtual {v8, v10}, Lh1/v;->k(I)I

    .line 116
    .line 117
    .line 118
    move-result v12

    .line 119
    iput v12, v0, Lt2/s;->o:I

    .line 120
    .line 121
    const/4 v12, 0x4

    .line 122
    invoke-virtual {v8, v12}, Lh1/v;->k(I)I

    .line 123
    .line 124
    .line 125
    move-result v13

    .line 126
    invoke-virtual {v8, v7}, Lh1/v;->k(I)I

    .line 127
    .line 128
    .line 129
    move-result v14

    .line 130
    if-nez v13, :cond_c

    .line 131
    .line 132
    if-nez v14, :cond_c

    .line 133
    .line 134
    if-nez v1, :cond_3

    .line 135
    .line 136
    invoke-virtual {v8}, Lh1/v;->i()I

    .line 137
    .line 138
    .line 139
    move-result v13

    .line 140
    invoke-virtual {v8}, Lh1/v;->c()I

    .line 141
    .line 142
    .line 143
    move-result v14

    .line 144
    invoke-static {v8, v3}, Ln1/b;->n(Lh1/v;Z)Ln1/a;

    .line 145
    .line 146
    .line 147
    move-result-object v15

    .line 148
    iget-object v5, v15, Ln1/a;->a:Ljava/lang/String;

    .line 149
    .line 150
    iput-object v5, v0, Lt2/s;->v:Ljava/lang/String;

    .line 151
    .line 152
    iget v5, v15, Ln1/a;->b:I

    .line 153
    .line 154
    iput v5, v0, Lt2/s;->s:I

    .line 155
    .line 156
    iget v5, v15, Ln1/a;->c:I

    .line 157
    .line 158
    iput v5, v0, Lt2/s;->u:I

    .line 159
    .line 160
    invoke-virtual {v8}, Lh1/v;->c()I

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    sub-int/2addr v14, v5

    .line 165
    invoke-virtual {v8, v13}, Lh1/v;->s(I)V

    .line 166
    .line 167
    .line 168
    add-int/lit8 v5, v14, 0x7

    .line 169
    .line 170
    div-int/2addr v5, v6

    .line 171
    new-array v5, v5, [B

    .line 172
    .line 173
    invoke-virtual {v8, v5, v14}, Lh1/v;->l([BI)V

    .line 174
    .line 175
    .line 176
    new-instance v13, Landroidx/media3/common/v;

    .line 177
    .line 178
    invoke-direct {v13}, Landroidx/media3/common/v;-><init>()V

    .line 179
    .line 180
    .line 181
    iget-object v14, v0, Lt2/s;->f:Ljava/lang/String;

    .line 182
    .line 183
    iput-object v14, v13, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 184
    .line 185
    const-string v14, "audio/mp4a-latm"

    .line 186
    .line 187
    invoke-static {v14}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v14

    .line 191
    iput-object v14, v13, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 192
    .line 193
    iget-object v14, v0, Lt2/s;->v:Ljava/lang/String;

    .line 194
    .line 195
    iput-object v14, v13, Landroidx/media3/common/v;->j:Ljava/lang/String;

    .line 196
    .line 197
    iget v14, v0, Lt2/s;->u:I

    .line 198
    .line 199
    iput v14, v13, Landroidx/media3/common/v;->B:I

    .line 200
    .line 201
    iget v14, v0, Lt2/s;->s:I

    .line 202
    .line 203
    iput v14, v13, Landroidx/media3/common/v;->C:I

    .line 204
    .line 205
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    iput-object v5, v13, Landroidx/media3/common/v;->p:Ljava/util/List;

    .line 210
    .line 211
    iget-object v5, v0, Lt2/s;->a:Ljava/lang/String;

    .line 212
    .line 213
    iput-object v5, v13, Landroidx/media3/common/v;->d:Ljava/lang/String;

    .line 214
    .line 215
    iget v5, v0, Lt2/s;->b:I

    .line 216
    .line 217
    iput v5, v13, Landroidx/media3/common/v;->f:I

    .line 218
    .line 219
    new-instance v5, Landroidx/media3/common/w;

    .line 220
    .line 221
    invoke-direct {v5, v13}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 222
    .line 223
    .line 224
    iget-object v13, v0, Lt2/s;->g:Landroidx/media3/common/w;

    .line 225
    .line 226
    invoke-virtual {v5, v13}, Landroidx/media3/common/w;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v13

    .line 230
    if-nez v13, :cond_4

    .line 231
    .line 232
    iput-object v5, v0, Lt2/s;->g:Landroidx/media3/common/w;

    .line 233
    .line 234
    iget v13, v5, Landroidx/media3/common/w;->D:I

    .line 235
    .line 236
    int-to-long v13, v13

    .line 237
    const-wide/32 v16, 0x3d090000

    .line 238
    .line 239
    .line 240
    div-long v13, v16, v13

    .line 241
    .line 242
    iput-wide v13, v0, Lt2/s;->t:J

    .line 243
    .line 244
    iget-object v13, v0, Lt2/s;->e:Ln1/i0;

    .line 245
    .line 246
    invoke-interface {v13, v5}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 247
    .line 248
    .line 249
    goto :goto_2

    .line 250
    :cond_3
    invoke-virtual {v8, v4}, Lh1/v;->k(I)I

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    add-int/2addr v5, v3

    .line 255
    mul-int/2addr v5, v6

    .line 256
    invoke-virtual {v8, v5}, Lh1/v;->k(I)I

    .line 257
    .line 258
    .line 259
    move-result v5

    .line 260
    int-to-long v13, v5

    .line 261
    long-to-int v5, v13

    .line 262
    invoke-virtual {v8}, Lh1/v;->c()I

    .line 263
    .line 264
    .line 265
    move-result v13

    .line 266
    invoke-static {v8, v3}, Ln1/b;->n(Lh1/v;Z)Ln1/a;

    .line 267
    .line 268
    .line 269
    move-result-object v14

    .line 270
    iget-object v15, v14, Ln1/a;->a:Ljava/lang/String;

    .line 271
    .line 272
    iput-object v15, v0, Lt2/s;->v:Ljava/lang/String;

    .line 273
    .line 274
    iget v15, v14, Ln1/a;->b:I

    .line 275
    .line 276
    iput v15, v0, Lt2/s;->s:I

    .line 277
    .line 278
    iget v14, v14, Ln1/a;->c:I

    .line 279
    .line 280
    iput v14, v0, Lt2/s;->u:I

    .line 281
    .line 282
    invoke-virtual {v8}, Lh1/v;->c()I

    .line 283
    .line 284
    .line 285
    move-result v14

    .line 286
    sub-int/2addr v13, v14

    .line 287
    sub-int/2addr v5, v13

    .line 288
    invoke-virtual {v8, v5}, Lh1/v;->v(I)V

    .line 289
    .line 290
    .line 291
    :cond_4
    :goto_2
    invoke-virtual {v8, v7}, Lh1/v;->k(I)I

    .line 292
    .line 293
    .line 294
    move-result v5

    .line 295
    iput v5, v0, Lt2/s;->p:I

    .line 296
    .line 297
    if-eqz v5, :cond_9

    .line 298
    .line 299
    if-eq v5, v3, :cond_8

    .line 300
    .line 301
    if-eq v5, v7, :cond_7

    .line 302
    .line 303
    if-eq v5, v12, :cond_7

    .line 304
    .line 305
    const/4 v7, 0x5

    .line 306
    if-eq v5, v7, :cond_7

    .line 307
    .line 308
    if-eq v5, v10, :cond_6

    .line 309
    .line 310
    const/4 v7, 0x7

    .line 311
    if-ne v5, v7, :cond_5

    .line 312
    .line 313
    goto :goto_3

    .line 314
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 315
    .line 316
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 317
    .line 318
    .line 319
    throw v1

    .line 320
    :cond_6
    :goto_3
    invoke-virtual {v8, v3}, Lh1/v;->v(I)V

    .line 321
    .line 322
    .line 323
    goto :goto_4

    .line 324
    :cond_7
    invoke-virtual {v8, v10}, Lh1/v;->v(I)V

    .line 325
    .line 326
    .line 327
    goto :goto_4

    .line 328
    :cond_8
    const/16 v5, 0x9

    .line 329
    .line 330
    invoke-virtual {v8, v5}, Lh1/v;->v(I)V

    .line 331
    .line 332
    .line 333
    goto :goto_4

    .line 334
    :cond_9
    invoke-virtual {v8, v6}, Lh1/v;->v(I)V

    .line 335
    .line 336
    .line 337
    :goto_4
    invoke-virtual {v8}, Lh1/v;->j()Z

    .line 338
    .line 339
    .line 340
    move-result v5

    .line 341
    iput-boolean v5, v0, Lt2/s;->q:Z

    .line 342
    .line 343
    const-wide/16 v12, 0x0

    .line 344
    .line 345
    iput-wide v12, v0, Lt2/s;->r:J

    .line 346
    .line 347
    if-eqz v5, :cond_b

    .line 348
    .line 349
    if-ne v1, v3, :cond_a

    .line 350
    .line 351
    invoke-virtual {v8, v4}, Lh1/v;->k(I)I

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    add-int/2addr v1, v3

    .line 356
    mul-int/2addr v1, v6

    .line 357
    invoke-virtual {v8, v1}, Lh1/v;->k(I)I

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    int-to-long v4, v1

    .line 362
    iput-wide v4, v0, Lt2/s;->r:J

    .line 363
    .line 364
    goto :goto_5

    .line 365
    :cond_a
    invoke-virtual {v8}, Lh1/v;->j()Z

    .line 366
    .line 367
    .line 368
    move-result v1

    .line 369
    iget-wide v4, v0, Lt2/s;->r:J

    .line 370
    .line 371
    shl-long/2addr v4, v6

    .line 372
    invoke-virtual {v8, v6}, Lh1/v;->k(I)I

    .line 373
    .line 374
    .line 375
    move-result v7

    .line 376
    int-to-long v12, v7

    .line 377
    add-long/2addr v4, v12

    .line 378
    iput-wide v4, v0, Lt2/s;->r:J

    .line 379
    .line 380
    if-nez v1, :cond_a

    .line 381
    .line 382
    :cond_b
    :goto_5
    invoke-virtual {v8}, Lh1/v;->j()Z

    .line 383
    .line 384
    .line 385
    move-result v1

    .line 386
    if-eqz v1, :cond_10

    .line 387
    .line 388
    invoke-virtual {v8, v6}, Lh1/v;->v(I)V

    .line 389
    .line 390
    .line 391
    goto :goto_6

    .line 392
    :cond_c
    invoke-static {v9, v9}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    throw v1

    .line 397
    :cond_d
    invoke-static {v9, v9}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    throw v1

    .line 402
    :cond_e
    invoke-static {v9, v9}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    throw v1

    .line 407
    :cond_f
    iget-boolean v1, v0, Lt2/s;->m:Z

    .line 408
    .line 409
    if-nez v1, :cond_10

    .line 410
    .line 411
    goto :goto_a

    .line 412
    :cond_10
    :goto_6
    iget v1, v0, Lt2/s;->n:I

    .line 413
    .line 414
    if-nez v1, :cond_17

    .line 415
    .line 416
    iget v1, v0, Lt2/s;->o:I

    .line 417
    .line 418
    if-nez v1, :cond_16

    .line 419
    .line 420
    iget v1, v0, Lt2/s;->p:I

    .line 421
    .line 422
    if-nez v1, :cond_15

    .line 423
    .line 424
    const/4 v1, 0x0

    .line 425
    :goto_7
    invoke-virtual {v8, v6}, Lh1/v;->k(I)I

    .line 426
    .line 427
    .line 428
    move-result v4

    .line 429
    add-int/2addr v1, v4

    .line 430
    const/16 v5, 0xff

    .line 431
    .line 432
    if-eq v4, v5, :cond_14

    .line 433
    .line 434
    invoke-virtual {v8}, Lh1/v;->i()I

    .line 435
    .line 436
    .line 437
    move-result v4

    .line 438
    and-int/lit8 v5, v4, 0x7

    .line 439
    .line 440
    if-nez v5, :cond_11

    .line 441
    .line 442
    shr-int/lit8 v4, v4, 0x3

    .line 443
    .line 444
    invoke-virtual {v2, v4}, Lh1/w;->G(I)V

    .line 445
    .line 446
    .line 447
    goto :goto_8

    .line 448
    :cond_11
    iget-object v4, v2, Lh1/w;->a:[B

    .line 449
    .line 450
    mul-int/lit8 v5, v1, 0x8

    .line 451
    .line 452
    invoke-virtual {v8, v4, v5}, Lh1/v;->l([BI)V

    .line 453
    .line 454
    .line 455
    const/4 v4, 0x0

    .line 456
    invoke-virtual {v2, v4}, Lh1/w;->G(I)V

    .line 457
    .line 458
    .line 459
    :goto_8
    iget-object v4, v0, Lt2/s;->e:Ln1/i0;

    .line 460
    .line 461
    invoke-interface {v4, v2, v1}, Ln1/i0;->sampleData(Lh1/w;I)V

    .line 462
    .line 463
    .line 464
    iget-wide v4, v0, Lt2/s;->l:J

    .line 465
    .line 466
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    cmp-long v2, v4, v6

    .line 472
    .line 473
    if-eqz v2, :cond_12

    .line 474
    .line 475
    goto :goto_9

    .line 476
    :cond_12
    const/4 v3, 0x0

    .line 477
    :goto_9
    invoke-static {v3}, Lh1/a;->j(Z)V

    .line 478
    .line 479
    .line 480
    iget-object v2, v0, Lt2/s;->e:Ln1/i0;

    .line 481
    .line 482
    iget-wide v3, v0, Lt2/s;->l:J

    .line 483
    .line 484
    const/16 v21, 0x0

    .line 485
    .line 486
    const/16 v22, 0x0

    .line 487
    .line 488
    const/16 v19, 0x1

    .line 489
    .line 490
    move/from16 v20, v1

    .line 491
    .line 492
    move-object/from16 v16, v2

    .line 493
    .line 494
    move-wide/from16 v17, v3

    .line 495
    .line 496
    invoke-interface/range {v16 .. v22}, Ln1/i0;->sampleMetadata(JIIILn1/h0;)V

    .line 497
    .line 498
    .line 499
    iget-wide v1, v0, Lt2/s;->l:J

    .line 500
    .line 501
    iget-wide v3, v0, Lt2/s;->t:J

    .line 502
    .line 503
    add-long/2addr v1, v3

    .line 504
    iput-wide v1, v0, Lt2/s;->l:J

    .line 505
    .line 506
    iget-boolean v1, v0, Lt2/s;->q:Z

    .line 507
    .line 508
    if-eqz v1, :cond_13

    .line 509
    .line 510
    iget-wide v1, v0, Lt2/s;->r:J

    .line 511
    .line 512
    long-to-int v1, v1

    .line 513
    invoke-virtual {v8, v1}, Lh1/v;->v(I)V

    .line 514
    .line 515
    .line 516
    :cond_13
    :goto_a
    const/4 v4, 0x0

    .line 517
    iput v4, v0, Lt2/s;->h:I

    .line 518
    .line 519
    goto/16 :goto_0

    .line 520
    .line 521
    :cond_14
    move/from16 v20, v1

    .line 522
    .line 523
    goto :goto_7

    .line 524
    :cond_15
    invoke-static {v9, v9}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    throw v1

    .line 529
    :cond_16
    invoke-static {v9, v9}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    throw v1

    .line 534
    :cond_17
    invoke-static {v9, v9}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 535
    .line 536
    .line 537
    move-result-object v1

    .line 538
    throw v1

    .line 539
    :cond_18
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 540
    .line 541
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 542
    .line 543
    .line 544
    throw v1

    .line 545
    :cond_19
    move-object/from16 v11, p1

    .line 546
    .line 547
    iget v1, v0, Lt2/s;->k:I

    .line 548
    .line 549
    and-int/lit16 v1, v1, -0xe1

    .line 550
    .line 551
    shl-int/2addr v1, v6

    .line 552
    invoke-virtual {v11}, Lh1/w;->u()I

    .line 553
    .line 554
    .line 555
    move-result v3

    .line 556
    or-int/2addr v1, v3

    .line 557
    iput v1, v0, Lt2/s;->j:I

    .line 558
    .line 559
    iget-object v3, v2, Lh1/w;->a:[B

    .line 560
    .line 561
    array-length v3, v3

    .line 562
    if-le v1, v3, :cond_1a

    .line 563
    .line 564
    invoke-virtual {v2, v1}, Lh1/w;->D(I)V

    .line 565
    .line 566
    .line 567
    iget-object v1, v2, Lh1/w;->a:[B

    .line 568
    .line 569
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    array-length v2, v1

    .line 573
    invoke-virtual {v8, v1, v2}, Lh1/v;->r([BI)V

    .line 574
    .line 575
    .line 576
    :cond_1a
    const/4 v4, 0x0

    .line 577
    iput v4, v0, Lt2/s;->i:I

    .line 578
    .line 579
    iput v7, v0, Lt2/s;->h:I

    .line 580
    .line 581
    goto/16 :goto_0

    .line 582
    .line 583
    :cond_1b
    move-object/from16 v11, p1

    .line 584
    .line 585
    invoke-virtual {v11}, Lh1/w;->u()I

    .line 586
    .line 587
    .line 588
    move-result v1

    .line 589
    and-int/lit16 v3, v1, 0xe0

    .line 590
    .line 591
    const/16 v5, 0xe0

    .line 592
    .line 593
    if-ne v3, v5, :cond_1c

    .line 594
    .line 595
    iput v1, v0, Lt2/s;->k:I

    .line 596
    .line 597
    iput v4, v0, Lt2/s;->h:I

    .line 598
    .line 599
    goto/16 :goto_0

    .line 600
    .line 601
    :cond_1c
    if-eq v1, v2, :cond_0

    .line 602
    .line 603
    const/4 v4, 0x0

    .line 604
    iput v4, v0, Lt2/s;->h:I

    .line 605
    .line 606
    goto/16 :goto_0

    .line 607
    .line 608
    :cond_1d
    move-object/from16 v11, p1

    .line 609
    .line 610
    invoke-virtual {v11}, Lh1/w;->u()I

    .line 611
    .line 612
    .line 613
    move-result v1

    .line 614
    if-ne v1, v2, :cond_0

    .line 615
    .line 616
    iput v3, v0, Lt2/s;->h:I

    .line 617
    .line 618
    goto/16 :goto_0

    .line 619
    .line 620
    :cond_1e
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lt2/s;->h:I

    .line 3
    .line 4
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v1, p0, Lt2/s;->l:J

    .line 10
    .line 11
    iput-boolean v0, p0, Lt2/s;->m:Z

    .line 12
    .line 13
    return-void
.end method

.method public final d(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final e(Ln1/p;Lt2/g0;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lt2/g0;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lt2/g0;->b()V

    .line 5
    .line 6
    .line 7
    iget v0, p2, Lt2/g0;->d:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-interface {p1, v0, v1}, Ln1/p;->track(II)Ln1/i0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lt2/s;->e:Ln1/i0;

    .line 15
    .line 16
    invoke-virtual {p2}, Lt2/g0;->b()V

    .line 17
    .line 18
    .line 19
    iget-object p1, p2, Lt2/g0;->e:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p1, p0, Lt2/s;->f:Ljava/lang/String;

    .line 22
    .line 23
    return-void
.end method

.method public final f(IJ)V
    .locals 0

    .line 1
    iput-wide p2, p0, Lt2/s;->l:J

    .line 2
    .line 3
    return-void
.end method
