.class public final Lt2/y;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lt2/h0;


# instance fields
.field public final a:Lt2/h;

.field public final b:Lh1/v;

.field public c:I

.field public d:I

.field public e:Lh1/d0;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:Z

.field public l:J


# direct methods
.method public constructor <init>(Lt2/h;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt2/y;->a:Lt2/h;

    .line 5
    .line 6
    new-instance p1, Lh1/v;

    .line 7
    .line 8
    const/16 v0, 0xa

    .line 9
    .line 10
    new-array v1, v0, [B

    .line 11
    .line 12
    invoke-direct {p1, v1, v0}, Lh1/v;-><init>([BI)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lt2/y;->b:Lh1/v;

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput p1, p0, Lt2/y;->c:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(Lh1/w;I)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lt2/y;->e:Lh1/d0;

    .line 6
    .line 7
    invoke-static {v2}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    and-int/lit8 v2, p2, 0x1

    .line 11
    .line 12
    const-string v3, "PesReader"

    .line 13
    .line 14
    iget-object v4, v0, Lt2/y;->a:Lt2/h;

    .line 15
    .line 16
    const/4 v5, -0x1

    .line 17
    const/4 v6, 0x3

    .line 18
    const/4 v7, 0x2

    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v9, 0x1

    .line 21
    if-eqz v2, :cond_5

    .line 22
    .line 23
    iget v2, v0, Lt2/y;->c:I

    .line 24
    .line 25
    if-eqz v2, :cond_4

    .line 26
    .line 27
    if-eq v2, v9, :cond_4

    .line 28
    .line 29
    if-eq v2, v7, :cond_3

    .line 30
    .line 31
    if-ne v2, v6, :cond_2

    .line 32
    .line 33
    iget v2, v0, Lt2/y;->j:I

    .line 34
    .line 35
    if-eq v2, v5, :cond_0

    .line 36
    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v10, "Unexpected start indicator: expected "

    .line 40
    .line 41
    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget v10, v0, Lt2/y;->j:I

    .line 45
    .line 46
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v10, " more bytes"

    .line 50
    .line 51
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v3, v2}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    iget v2, v1, Lh1/w;->c:I

    .line 62
    .line 63
    if-nez v2, :cond_1

    .line 64
    .line 65
    move v2, v9

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    move v2, v8

    .line 68
    :goto_0
    invoke-interface {v4, v2}, Lt2/h;->d(Z)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 75
    .line 76
    .line 77
    throw v1

    .line 78
    :cond_3
    const-string v2, "Unexpected start indicator reading extended header"

    .line 79
    .line 80
    invoke-static {v3, v2}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_4
    :goto_1
    iput v9, v0, Lt2/y;->c:I

    .line 84
    .line 85
    iput v8, v0, Lt2/y;->d:I

    .line 86
    .line 87
    :cond_5
    move/from16 v2, p2

    .line 88
    .line 89
    :goto_2
    invoke-virtual {v1}, Lh1/w;->a()I

    .line 90
    .line 91
    .line 92
    move-result v10

    .line 93
    if-lez v10, :cond_14

    .line 94
    .line 95
    iget v10, v0, Lt2/y;->c:I

    .line 96
    .line 97
    if-eqz v10, :cond_13

    .line 98
    .line 99
    iget-object v11, v0, Lt2/y;->b:Lh1/v;

    .line 100
    .line 101
    if-eq v10, v9, :cond_e

    .line 102
    .line 103
    if-eq v10, v7, :cond_a

    .line 104
    .line 105
    if-ne v10, v6, :cond_9

    .line 106
    .line 107
    invoke-virtual {v1}, Lh1/w;->a()I

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    iget v11, v0, Lt2/y;->j:I

    .line 112
    .line 113
    if-ne v11, v5, :cond_6

    .line 114
    .line 115
    move v11, v8

    .line 116
    goto :goto_3

    .line 117
    :cond_6
    sub-int v11, v10, v11

    .line 118
    .line 119
    :goto_3
    if-lez v11, :cond_7

    .line 120
    .line 121
    sub-int/2addr v10, v11

    .line 122
    iget v11, v1, Lh1/w;->b:I

    .line 123
    .line 124
    add-int/2addr v11, v10

    .line 125
    invoke-virtual {v1, v11}, Lh1/w;->F(I)V

    .line 126
    .line 127
    .line 128
    :cond_7
    invoke-interface {v4, v1}, Lt2/h;->a(Lh1/w;)V

    .line 129
    .line 130
    .line 131
    iget v11, v0, Lt2/y;->j:I

    .line 132
    .line 133
    if-eq v11, v5, :cond_8

    .line 134
    .line 135
    sub-int/2addr v11, v10

    .line 136
    iput v11, v0, Lt2/y;->j:I

    .line 137
    .line 138
    if-nez v11, :cond_8

    .line 139
    .line 140
    invoke-interface {v4, v8}, Lt2/h;->d(Z)V

    .line 141
    .line 142
    .line 143
    iput v9, v0, Lt2/y;->c:I

    .line 144
    .line 145
    iput v8, v0, Lt2/y;->d:I

    .line 146
    .line 147
    :cond_8
    move v10, v7

    .line 148
    move v7, v8

    .line 149
    goto/16 :goto_7

    .line 150
    .line 151
    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 152
    .line 153
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 154
    .line 155
    .line 156
    throw v1

    .line 157
    :cond_a
    const/16 v10, 0xa

    .line 158
    .line 159
    iget v12, v0, Lt2/y;->i:I

    .line 160
    .line 161
    invoke-static {v10, v12}, Ljava/lang/Math;->min(II)I

    .line 162
    .line 163
    .line 164
    move-result v10

    .line 165
    iget-object v12, v11, Lh1/v;->b:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v12, [B

    .line 168
    .line 169
    invoke-virtual {v0, v1, v12, v10}, Lt2/y;->d(Lh1/w;[BI)Z

    .line 170
    .line 171
    .line 172
    move-result v10

    .line 173
    if-eqz v10, :cond_8

    .line 174
    .line 175
    const/4 v10, 0x0

    .line 176
    iget v12, v0, Lt2/y;->i:I

    .line 177
    .line 178
    invoke-virtual {v0, v1, v10, v12}, Lt2/y;->d(Lh1/w;[BI)Z

    .line 179
    .line 180
    .line 181
    move-result v10

    .line 182
    if-eqz v10, :cond_8

    .line 183
    .line 184
    invoke-virtual {v11, v8}, Lh1/v;->s(I)V

    .line 185
    .line 186
    .line 187
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    iput-wide v12, v0, Lt2/y;->l:J

    .line 193
    .line 194
    iget-boolean v10, v0, Lt2/y;->f:Z

    .line 195
    .line 196
    const/4 v12, 0x4

    .line 197
    if-eqz v10, :cond_c

    .line 198
    .line 199
    invoke-virtual {v11, v12}, Lh1/v;->v(I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v11, v6}, Lh1/v;->k(I)I

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    int-to-long v13, v10

    .line 207
    const/16 v10, 0x1e

    .line 208
    .line 209
    shl-long/2addr v13, v10

    .line 210
    invoke-virtual {v11, v9}, Lh1/v;->v(I)V

    .line 211
    .line 212
    .line 213
    const/16 v15, 0xf

    .line 214
    .line 215
    invoke-virtual {v11, v15}, Lh1/v;->k(I)I

    .line 216
    .line 217
    .line 218
    move-result v16

    .line 219
    move/from16 p2, v10

    .line 220
    .line 221
    shl-int/lit8 v10, v16, 0xf

    .line 222
    .line 223
    int-to-long v7, v10

    .line 224
    or-long/2addr v7, v13

    .line 225
    invoke-virtual {v11, v9}, Lh1/v;->v(I)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v11, v15}, Lh1/v;->k(I)I

    .line 229
    .line 230
    .line 231
    move-result v10

    .line 232
    int-to-long v13, v10

    .line 233
    or-long/2addr v7, v13

    .line 234
    invoke-virtual {v11, v9}, Lh1/v;->v(I)V

    .line 235
    .line 236
    .line 237
    iget-boolean v10, v0, Lt2/y;->h:Z

    .line 238
    .line 239
    if-nez v10, :cond_b

    .line 240
    .line 241
    iget-boolean v10, v0, Lt2/y;->g:Z

    .line 242
    .line 243
    if-eqz v10, :cond_b

    .line 244
    .line 245
    invoke-virtual {v11, v12}, Lh1/v;->v(I)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v11, v6}, Lh1/v;->k(I)I

    .line 249
    .line 250
    .line 251
    move-result v10

    .line 252
    int-to-long v13, v10

    .line 253
    shl-long v13, v13, p2

    .line 254
    .line 255
    invoke-virtual {v11, v9}, Lh1/v;->v(I)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v11, v15}, Lh1/v;->k(I)I

    .line 259
    .line 260
    .line 261
    move-result v10

    .line 262
    shl-int/2addr v10, v15

    .line 263
    move-wide/from16 v17, v13

    .line 264
    .line 265
    int-to-long v12, v10

    .line 266
    or-long v12, v17, v12

    .line 267
    .line 268
    invoke-virtual {v11, v9}, Lh1/v;->v(I)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v11, v15}, Lh1/v;->k(I)I

    .line 272
    .line 273
    .line 274
    move-result v10

    .line 275
    int-to-long v14, v10

    .line 276
    or-long/2addr v12, v14

    .line 277
    invoke-virtual {v11, v9}, Lh1/v;->v(I)V

    .line 278
    .line 279
    .line 280
    iget-object v10, v0, Lt2/y;->e:Lh1/d0;

    .line 281
    .line 282
    invoke-virtual {v10, v12, v13}, Lh1/d0;->b(J)J

    .line 283
    .line 284
    .line 285
    iput-boolean v9, v0, Lt2/y;->h:Z

    .line 286
    .line 287
    :cond_b
    iget-object v10, v0, Lt2/y;->e:Lh1/d0;

    .line 288
    .line 289
    invoke-virtual {v10, v7, v8}, Lh1/d0;->b(J)J

    .line 290
    .line 291
    .line 292
    move-result-wide v7

    .line 293
    iput-wide v7, v0, Lt2/y;->l:J

    .line 294
    .line 295
    :cond_c
    iget-boolean v7, v0, Lt2/y;->k:Z

    .line 296
    .line 297
    if-eqz v7, :cond_d

    .line 298
    .line 299
    const/4 v12, 0x4

    .line 300
    goto :goto_4

    .line 301
    :cond_d
    const/4 v12, 0x0

    .line 302
    :goto_4
    or-int/2addr v2, v12

    .line 303
    iget-wide v7, v0, Lt2/y;->l:J

    .line 304
    .line 305
    invoke-interface {v4, v2, v7, v8}, Lt2/h;->f(IJ)V

    .line 306
    .line 307
    .line 308
    iput v6, v0, Lt2/y;->c:I

    .line 309
    .line 310
    const/4 v7, 0x0

    .line 311
    iput v7, v0, Lt2/y;->d:I

    .line 312
    .line 313
    move v8, v7

    .line 314
    const/4 v7, 0x2

    .line 315
    goto/16 :goto_2

    .line 316
    .line 317
    :cond_e
    move v7, v8

    .line 318
    iget-object v8, v11, Lh1/v;->b:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v8, [B

    .line 321
    .line 322
    const/16 v10, 0x9

    .line 323
    .line 324
    invoke-virtual {v0, v1, v8, v10}, Lt2/y;->d(Lh1/w;[BI)Z

    .line 325
    .line 326
    .line 327
    move-result v8

    .line 328
    if-eqz v8, :cond_12

    .line 329
    .line 330
    invoke-virtual {v11, v7}, Lh1/v;->s(I)V

    .line 331
    .line 332
    .line 333
    const/16 v7, 0x18

    .line 334
    .line 335
    invoke-virtual {v11, v7}, Lh1/v;->k(I)I

    .line 336
    .line 337
    .line 338
    move-result v7

    .line 339
    if-eq v7, v9, :cond_f

    .line 340
    .line 341
    const-string v8, "Unexpected start code prefix: "

    .line 342
    .line 343
    invoke-static {v8, v7, v3}, La1/a1;->s(Ljava/lang/String;ILjava/lang/String;)V

    .line 344
    .line 345
    .line 346
    iput v5, v0, Lt2/y;->j:I

    .line 347
    .line 348
    const/4 v7, 0x0

    .line 349
    const/4 v10, 0x2

    .line 350
    goto :goto_6

    .line 351
    :cond_f
    const/16 v7, 0x8

    .line 352
    .line 353
    invoke-virtual {v11, v7}, Lh1/v;->v(I)V

    .line 354
    .line 355
    .line 356
    const/16 v8, 0x10

    .line 357
    .line 358
    invoke-virtual {v11, v8}, Lh1/v;->k(I)I

    .line 359
    .line 360
    .line 361
    move-result v8

    .line 362
    const/4 v10, 0x5

    .line 363
    invoke-virtual {v11, v10}, Lh1/v;->v(I)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v11}, Lh1/v;->j()Z

    .line 367
    .line 368
    .line 369
    move-result v10

    .line 370
    iput-boolean v10, v0, Lt2/y;->k:Z

    .line 371
    .line 372
    const/4 v10, 0x2

    .line 373
    invoke-virtual {v11, v10}, Lh1/v;->v(I)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v11}, Lh1/v;->j()Z

    .line 377
    .line 378
    .line 379
    move-result v12

    .line 380
    iput-boolean v12, v0, Lt2/y;->f:Z

    .line 381
    .line 382
    invoke-virtual {v11}, Lh1/v;->j()Z

    .line 383
    .line 384
    .line 385
    move-result v12

    .line 386
    iput-boolean v12, v0, Lt2/y;->g:Z

    .line 387
    .line 388
    const/4 v12, 0x6

    .line 389
    invoke-virtual {v11, v12}, Lh1/v;->v(I)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v11, v7}, Lh1/v;->k(I)I

    .line 393
    .line 394
    .line 395
    move-result v7

    .line 396
    iput v7, v0, Lt2/y;->i:I

    .line 397
    .line 398
    if-nez v8, :cond_10

    .line 399
    .line 400
    iput v5, v0, Lt2/y;->j:I

    .line 401
    .line 402
    goto :goto_5

    .line 403
    :cond_10
    add-int/lit8 v8, v8, -0x3

    .line 404
    .line 405
    sub-int/2addr v8, v7

    .line 406
    iput v8, v0, Lt2/y;->j:I

    .line 407
    .line 408
    if-gez v8, :cond_11

    .line 409
    .line 410
    new-instance v7, Ljava/lang/StringBuilder;

    .line 411
    .line 412
    const-string v8, "Found negative packet payload size: "

    .line 413
    .line 414
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    iget v8, v0, Lt2/y;->j:I

    .line 418
    .line 419
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v7

    .line 426
    invoke-static {v3, v7}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    iput v5, v0, Lt2/y;->j:I

    .line 430
    .line 431
    :cond_11
    :goto_5
    move v7, v10

    .line 432
    :goto_6
    iput v7, v0, Lt2/y;->c:I

    .line 433
    .line 434
    const/4 v7, 0x0

    .line 435
    iput v7, v0, Lt2/y;->d:I

    .line 436
    .line 437
    goto :goto_7

    .line 438
    :cond_12
    const/4 v10, 0x2

    .line 439
    goto :goto_7

    .line 440
    :cond_13
    move v10, v7

    .line 441
    move v7, v8

    .line 442
    invoke-virtual {v1}, Lh1/w;->a()I

    .line 443
    .line 444
    .line 445
    move-result v8

    .line 446
    invoke-virtual {v1, v8}, Lh1/w;->H(I)V

    .line 447
    .line 448
    .line 449
    :goto_7
    move v8, v7

    .line 450
    move v7, v10

    .line 451
    goto/16 :goto_2

    .line 452
    .line 453
    :cond_14
    return-void
.end method

.method public final b(Lh1/d0;Ln1/p;Lt2/g0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt2/y;->e:Lh1/d0;

    .line 2
    .line 3
    iget-object p1, p0, Lt2/y;->a:Lt2/h;

    .line 4
    .line 5
    invoke-interface {p1, p2, p3}, Lt2/h;->e(Ln1/p;Lt2/g0;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lt2/y;->c:I

    .line 3
    .line 4
    iput v0, p0, Lt2/y;->d:I

    .line 5
    .line 6
    iput-boolean v0, p0, Lt2/y;->h:Z

    .line 7
    .line 8
    iget-object v0, p0, Lt2/y;->a:Lt2/h;

    .line 9
    .line 10
    invoke-interface {v0}, Lt2/h;->c()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final d(Lh1/w;[BI)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Lh1/w;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lt2/y;->d:I

    .line 6
    .line 7
    sub-int v1, p3, v1

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-gtz v0, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    if-nez p2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lh1/w;->H(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget v2, p0, Lt2/y;->d:I

    .line 24
    .line 25
    invoke-virtual {p1, p2, v2, v0}, Lh1/w;->e([BII)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget p1, p0, Lt2/y;->d:I

    .line 29
    .line 30
    add-int/2addr p1, v0

    .line 31
    iput p1, p0, Lt2/y;->d:I

    .line 32
    .line 33
    if-ne p1, p3, :cond_2

    .line 34
    .line 35
    return v1

    .line 36
    :cond_2
    const/4 p1, 0x0

    .line 37
    return p1
.end method
