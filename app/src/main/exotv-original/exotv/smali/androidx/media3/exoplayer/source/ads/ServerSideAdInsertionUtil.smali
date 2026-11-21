.class public final Landroidx/media3/exoplayer/source/ads/ServerSideAdInsertionUtil;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static varargs addAdGroupToAdPlaybackState(Landroidx/media3/common/c;JJ[J)Landroidx/media3/common/c;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    move-wide/from16 v3, p1

    .line 7
    .line 8
    invoke-static {v3, v4, v2, v0}, Landroidx/media3/exoplayer/source/ads/ServerSideAdInsertionUtil;->getMediaPeriodPositionUsForContent(JILandroidx/media3/common/c;)J

    .line 9
    .line 10
    .line 11
    move-result-wide v3

    .line 12
    iget v5, v0, Landroidx/media3/common/c;->e:I

    .line 13
    .line 14
    move v7, v5

    .line 15
    :goto_0
    iget v5, v0, Landroidx/media3/common/c;->b:I

    .line 16
    .line 17
    if-ge v7, v5, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, v7}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    iget-wide v5, v5, Landroidx/media3/common/b;->a:J

    .line 24
    .line 25
    const-wide/high16 v8, -0x8000000000000000L

    .line 26
    .line 27
    cmp-long v5, v5, v8

    .line 28
    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0, v7}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    iget-wide v5, v5, Landroidx/media3/common/b;->a:J

    .line 36
    .line 37
    cmp-long v5, v5, v3

    .line 38
    .line 39
    if-gtz v5, :cond_0

    .line 40
    .line 41
    add-int/lit8 v7, v7, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget v5, v0, Landroidx/media3/common/c;->e:I

    .line 45
    .line 46
    sub-int v5, v7, v5

    .line 47
    .line 48
    new-instance v6, Landroidx/media3/common/b;

    .line 49
    .line 50
    invoke-direct {v6, v3, v4}, Landroidx/media3/common/b;-><init>(J)V

    .line 51
    .line 52
    .line 53
    iget-object v3, v0, Landroidx/media3/common/c;->f:[Landroidx/media3/common/b;

    .line 54
    .line 55
    sget v4, Lh1/i0;->a:I

    .line 56
    .line 57
    array-length v4, v3

    .line 58
    const/4 v8, 0x1

    .line 59
    add-int/2addr v4, v8

    .line 60
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    array-length v9, v3

    .line 65
    aput-object v6, v4, v9

    .line 66
    .line 67
    move-object v12, v4

    .line 68
    check-cast v12, [Landroidx/media3/common/b;

    .line 69
    .line 70
    add-int/lit8 v4, v5, 0x1

    .line 71
    .line 72
    array-length v3, v3

    .line 73
    sub-int/2addr v3, v5

    .line 74
    invoke-static {v12, v5, v12, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 75
    .line 76
    .line 77
    aput-object v6, v12, v5

    .line 78
    .line 79
    new-instance v10, Landroidx/media3/common/c;

    .line 80
    .line 81
    iget-object v11, v0, Landroidx/media3/common/c;->a:Ljava/lang/Object;

    .line 82
    .line 83
    iget-wide v13, v0, Landroidx/media3/common/c;->c:J

    .line 84
    .line 85
    iget-wide v3, v0, Landroidx/media3/common/c;->d:J

    .line 86
    .line 87
    iget v0, v0, Landroidx/media3/common/c;->e:I

    .line 88
    .line 89
    move/from16 v17, v0

    .line 90
    .line 91
    move-wide v15, v3

    .line 92
    invoke-direct/range {v10 .. v17}, Landroidx/media3/common/c;-><init>(Ljava/lang/Object;[Landroidx/media3/common/b;JJI)V

    .line 93
    .line 94
    .line 95
    sub-int v0, v7, v17

    .line 96
    .line 97
    aget-object v3, v12, v0

    .line 98
    .line 99
    iget-boolean v3, v3, Landroidx/media3/common/b;->i:Z

    .line 100
    .line 101
    const/4 v4, 0x1

    .line 102
    if-ne v3, v4, :cond_1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_1
    array-length v3, v12

    .line 106
    invoke-static {v3, v12}, Lh1/i0;->U(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    check-cast v3, [Landroidx/media3/common/b;

    .line 111
    .line 112
    aget-object v5, v3, v0

    .line 113
    .line 114
    new-instance v18, Landroidx/media3/common/b;

    .line 115
    .line 116
    iget-wide v9, v5, Landroidx/media3/common/b;->a:J

    .line 117
    .line 118
    iget v6, v5, Landroidx/media3/common/b;->b:I

    .line 119
    .line 120
    iget v12, v5, Landroidx/media3/common/b;->c:I

    .line 121
    .line 122
    iget-object v4, v5, Landroidx/media3/common/b;->f:[I

    .line 123
    .line 124
    iget-object v8, v5, Landroidx/media3/common/b;->e:[Landroidx/media3/common/o0;

    .line 125
    .line 126
    iget-object v2, v5, Landroidx/media3/common/b;->g:[J

    .line 127
    .line 128
    move-object/from16 v25, v2

    .line 129
    .line 130
    move-object/from16 p0, v3

    .line 131
    .line 132
    iget-wide v2, v5, Landroidx/media3/common/b;->h:J

    .line 133
    .line 134
    move-wide/from16 v26, v2

    .line 135
    .line 136
    move-object/from16 v23, v4

    .line 137
    .line 138
    move/from16 v21, v6

    .line 139
    .line 140
    move-object/from16 v24, v8

    .line 141
    .line 142
    move-wide/from16 v19, v9

    .line 143
    .line 144
    move/from16 v22, v12

    .line 145
    .line 146
    const/16 v28, 0x1

    .line 147
    .line 148
    invoke-direct/range {v18 .. v28}, Landroidx/media3/common/b;-><init>(JII[I[Landroidx/media3/common/o0;[JJZ)V

    .line 149
    .line 150
    .line 151
    aput-object v18, p0, v0

    .line 152
    .line 153
    move-wide/from16 v18, v15

    .line 154
    .line 155
    move/from16 v20, v17

    .line 156
    .line 157
    move-wide/from16 v16, v13

    .line 158
    .line 159
    new-instance v13, Landroidx/media3/common/c;

    .line 160
    .line 161
    move-object/from16 v15, p0

    .line 162
    .line 163
    move-object v14, v11

    .line 164
    invoke-direct/range {v13 .. v20}, Landroidx/media3/common/c;-><init>(Ljava/lang/Object;[Landroidx/media3/common/b;JJI)V

    .line 165
    .line 166
    .line 167
    move-object v10, v13

    .line 168
    :goto_1
    array-length v0, v1

    .line 169
    const/4 v2, 0x0

    .line 170
    if-lez v0, :cond_2

    .line 171
    .line 172
    const/4 v3, 0x1

    .line 173
    goto :goto_2

    .line 174
    :cond_2
    move v3, v2

    .line 175
    :goto_2
    invoke-static {v3}, Lh1/a;->d(Z)V

    .line 176
    .line 177
    .line 178
    iget v3, v10, Landroidx/media3/common/c;->e:I

    .line 179
    .line 180
    sub-int v3, v7, v3

    .line 181
    .line 182
    iget-object v4, v10, Landroidx/media3/common/c;->f:[Landroidx/media3/common/b;

    .line 183
    .line 184
    aget-object v5, v4, v3

    .line 185
    .line 186
    iget v5, v5, Landroidx/media3/common/b;->b:I

    .line 187
    .line 188
    if-ne v5, v0, :cond_3

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_3
    array-length v5, v4

    .line 192
    invoke-static {v5, v4}, Lh1/i0;->U(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    move-object v13, v5

    .line 197
    check-cast v13, [Landroidx/media3/common/b;

    .line 198
    .line 199
    aget-object v4, v4, v3

    .line 200
    .line 201
    invoke-virtual {v4, v0}, Landroidx/media3/common/b;->c(I)Landroidx/media3/common/b;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    aput-object v0, v13, v3

    .line 206
    .line 207
    new-instance v11, Landroidx/media3/common/c;

    .line 208
    .line 209
    iget-wide v3, v10, Landroidx/media3/common/c;->d:J

    .line 210
    .line 211
    iget v0, v10, Landroidx/media3/common/c;->e:I

    .line 212
    .line 213
    iget-object v12, v10, Landroidx/media3/common/c;->a:Ljava/lang/Object;

    .line 214
    .line 215
    iget-wide v14, v10, Landroidx/media3/common/c;->c:J

    .line 216
    .line 217
    move/from16 v18, v0

    .line 218
    .line 219
    move-wide/from16 v16, v3

    .line 220
    .line 221
    invoke-direct/range {v11 .. v18}, Landroidx/media3/common/c;-><init>(Ljava/lang/Object;[Landroidx/media3/common/b;JJI)V

    .line 222
    .line 223
    .line 224
    move-object v10, v11

    .line 225
    :goto_3
    iget v0, v10, Landroidx/media3/common/c;->e:I

    .line 226
    .line 227
    sub-int v0, v7, v0

    .line 228
    .line 229
    iget-object v3, v10, Landroidx/media3/common/c;->f:[Landroidx/media3/common/b;

    .line 230
    .line 231
    array-length v4, v3

    .line 232
    invoke-static {v4, v3}, Lh1/i0;->U(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    move-object v13, v3

    .line 237
    check-cast v13, [Landroidx/media3/common/b;

    .line 238
    .line 239
    aget-object v3, v13, v0

    .line 240
    .line 241
    invoke-virtual {v3, v1}, Landroidx/media3/common/b;->d([J)Landroidx/media3/common/b;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    aput-object v3, v13, v0

    .line 246
    .line 247
    new-instance v11, Landroidx/media3/common/c;

    .line 248
    .line 249
    iget-object v12, v10, Landroidx/media3/common/c;->a:Ljava/lang/Object;

    .line 250
    .line 251
    iget-wide v14, v10, Landroidx/media3/common/c;->c:J

    .line 252
    .line 253
    iget-wide v3, v10, Landroidx/media3/common/c;->d:J

    .line 254
    .line 255
    iget v0, v10, Landroidx/media3/common/c;->e:I

    .line 256
    .line 257
    move/from16 v18, v0

    .line 258
    .line 259
    move-wide/from16 v16, v3

    .line 260
    .line 261
    invoke-direct/range {v11 .. v18}, Landroidx/media3/common/c;-><init>(Ljava/lang/Object;[Landroidx/media3/common/b;JJI)V

    .line 262
    .line 263
    .line 264
    sub-int v0, v7, v18

    .line 265
    .line 266
    aget-object v3, v13, v0

    .line 267
    .line 268
    iget-wide v3, v3, Landroidx/media3/common/b;->h:J

    .line 269
    .line 270
    cmp-long v3, v3, p3

    .line 271
    .line 272
    if-nez v3, :cond_4

    .line 273
    .line 274
    goto :goto_4

    .line 275
    :cond_4
    array-length v3, v13

    .line 276
    invoke-static {v3, v13}, Lh1/i0;->U(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    check-cast v3, [Landroidx/media3/common/b;

    .line 281
    .line 282
    aget-object v4, v3, v0

    .line 283
    .line 284
    new-instance v30, Landroidx/media3/common/b;

    .line 285
    .line 286
    iget-wide v5, v4, Landroidx/media3/common/b;->a:J

    .line 287
    .line 288
    iget v8, v4, Landroidx/media3/common/b;->b:I

    .line 289
    .line 290
    iget v9, v4, Landroidx/media3/common/b;->c:I

    .line 291
    .line 292
    iget-object v10, v4, Landroidx/media3/common/b;->f:[I

    .line 293
    .line 294
    iget-object v11, v4, Landroidx/media3/common/b;->e:[Landroidx/media3/common/o0;

    .line 295
    .line 296
    iget-object v13, v4, Landroidx/media3/common/b;->g:[J

    .line 297
    .line 298
    iget-boolean v4, v4, Landroidx/media3/common/b;->i:Z

    .line 299
    .line 300
    move-wide/from16 v38, p3

    .line 301
    .line 302
    move/from16 v40, v4

    .line 303
    .line 304
    move-wide/from16 v31, v5

    .line 305
    .line 306
    move/from16 v33, v8

    .line 307
    .line 308
    move/from16 v34, v9

    .line 309
    .line 310
    move-object/from16 v35, v10

    .line 311
    .line 312
    move-object/from16 v36, v11

    .line 313
    .line 314
    move-object/from16 v37, v13

    .line 315
    .line 316
    invoke-direct/range {v30 .. v40}, Landroidx/media3/common/b;-><init>(JII[I[Landroidx/media3/common/o0;[JJZ)V

    .line 317
    .line 318
    .line 319
    aput-object v30, v3, v0

    .line 320
    .line 321
    move-wide/from16 v19, v16

    .line 322
    .line 323
    move/from16 v21, v18

    .line 324
    .line 325
    move-wide/from16 v17, v14

    .line 326
    .line 327
    new-instance v14, Landroidx/media3/common/c;

    .line 328
    .line 329
    move-object/from16 v16, v3

    .line 330
    .line 331
    move-object v15, v12

    .line 332
    invoke-direct/range {v14 .. v21}, Landroidx/media3/common/c;-><init>(Ljava/lang/Object;[Landroidx/media3/common/b;JJI)V

    .line 333
    .line 334
    .line 335
    move-object v11, v14

    .line 336
    :goto_4
    move v0, v2

    .line 337
    move-object v6, v11

    .line 338
    :goto_5
    array-length v3, v1

    .line 339
    const-wide/16 v4, 0x0

    .line 340
    .line 341
    if-ge v0, v3, :cond_b

    .line 342
    .line 343
    aget-wide v8, v1, v0

    .line 344
    .line 345
    cmp-long v3, v8, v4

    .line 346
    .line 347
    if-nez v3, :cond_b

    .line 348
    .line 349
    add-int/lit8 v3, v0, 0x1

    .line 350
    .line 351
    iget v4, v6, Landroidx/media3/common/c;->e:I

    .line 352
    .line 353
    sub-int v4, v7, v4

    .line 354
    .line 355
    iget-object v5, v6, Landroidx/media3/common/c;->f:[Landroidx/media3/common/b;

    .line 356
    .line 357
    array-length v8, v5

    .line 358
    invoke-static {v8, v5}, Lh1/i0;->U(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v5

    .line 362
    move-object v10, v5

    .line 363
    check-cast v10, [Landroidx/media3/common/b;

    .line 364
    .line 365
    aget-object v5, v10, v4

    .line 366
    .line 367
    iget v8, v5, Landroidx/media3/common/b;->b:I

    .line 368
    .line 369
    const/4 v9, -0x1

    .line 370
    if-eq v8, v9, :cond_6

    .line 371
    .line 372
    if-ge v0, v8, :cond_5

    .line 373
    .line 374
    goto :goto_6

    .line 375
    :cond_5
    move v8, v2

    .line 376
    goto :goto_7

    .line 377
    :cond_6
    :goto_6
    const/4 v8, 0x1

    .line 378
    :goto_7
    invoke-static {v8}, Lh1/a;->d(Z)V

    .line 379
    .line 380
    .line 381
    iget-object v8, v5, Landroidx/media3/common/b;->f:[I

    .line 382
    .line 383
    array-length v11, v8

    .line 384
    invoke-static {v3, v11}, Ljava/lang/Math;->max(II)I

    .line 385
    .line 386
    .line 387
    move-result v12

    .line 388
    invoke-static {v8, v12}, Ljava/util/Arrays;->copyOf([II)[I

    .line 389
    .line 390
    .line 391
    move-result-object v8

    .line 392
    invoke-static {v8, v11, v12, v2}, Ljava/util/Arrays;->fill([IIII)V

    .line 393
    .line 394
    .line 395
    aget v11, v8, v0

    .line 396
    .line 397
    const/4 v12, 0x2

    .line 398
    const/4 v13, 0x1

    .line 399
    if-eqz v11, :cond_8

    .line 400
    .line 401
    if-eq v11, v13, :cond_8

    .line 402
    .line 403
    if-ne v11, v12, :cond_7

    .line 404
    .line 405
    goto :goto_8

    .line 406
    :cond_7
    move v11, v2

    .line 407
    goto :goto_9

    .line 408
    :cond_8
    :goto_8
    move v11, v13

    .line 409
    :goto_9
    invoke-static {v11}, Lh1/a;->d(Z)V

    .line 410
    .line 411
    .line 412
    iget-object v11, v5, Landroidx/media3/common/b;->g:[J

    .line 413
    .line 414
    array-length v14, v11

    .line 415
    array-length v15, v8

    .line 416
    if-ne v14, v15, :cond_9

    .line 417
    .line 418
    move/from16 p1, v3

    .line 419
    .line 420
    :goto_a
    move-object/from16 v20, v11

    .line 421
    .line 422
    goto :goto_b

    .line 423
    :cond_9
    array-length v14, v8

    .line 424
    array-length v15, v11

    .line 425
    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    .line 426
    .line 427
    .line 428
    move-result v14

    .line 429
    invoke-static {v11, v14}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 430
    .line 431
    .line 432
    move-result-object v11

    .line 433
    move/from16 p1, v3

    .line 434
    .line 435
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    invoke-static {v11, v15, v14, v2, v3}, Ljava/util/Arrays;->fill([JIIJ)V

    .line 441
    .line 442
    .line 443
    goto :goto_a

    .line 444
    :goto_b
    iget-object v2, v5, Landroidx/media3/common/b;->e:[Landroidx/media3/common/o0;

    .line 445
    .line 446
    array-length v3, v2

    .line 447
    array-length v11, v8

    .line 448
    if-ne v3, v11, :cond_a

    .line 449
    .line 450
    :goto_c
    move-object/from16 v19, v2

    .line 451
    .line 452
    goto :goto_d

    .line 453
    :cond_a
    array-length v3, v8

    .line 454
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    check-cast v2, [Landroidx/media3/common/o0;

    .line 459
    .line 460
    goto :goto_c

    .line 461
    :goto_d
    aput v12, v8, v0

    .line 462
    .line 463
    move v0, v13

    .line 464
    new-instance v13, Landroidx/media3/common/b;

    .line 465
    .line 466
    iget-wide v14, v5, Landroidx/media3/common/b;->a:J

    .line 467
    .line 468
    iget v2, v5, Landroidx/media3/common/b;->b:I

    .line 469
    .line 470
    iget v3, v5, Landroidx/media3/common/b;->c:I

    .line 471
    .line 472
    iget-wide v11, v5, Landroidx/media3/common/b;->h:J

    .line 473
    .line 474
    iget-boolean v5, v5, Landroidx/media3/common/b;->i:Z

    .line 475
    .line 476
    move/from16 v16, v2

    .line 477
    .line 478
    move/from16 v17, v3

    .line 479
    .line 480
    move/from16 v23, v5

    .line 481
    .line 482
    move-object/from16 v18, v8

    .line 483
    .line 484
    move-wide/from16 v21, v11

    .line 485
    .line 486
    invoke-direct/range {v13 .. v23}, Landroidx/media3/common/b;-><init>(JII[I[Landroidx/media3/common/o0;[JJZ)V

    .line 487
    .line 488
    .line 489
    aput-object v13, v10, v4

    .line 490
    .line 491
    new-instance v8, Landroidx/media3/common/c;

    .line 492
    .line 493
    iget-wide v13, v6, Landroidx/media3/common/c;->d:J

    .line 494
    .line 495
    iget v15, v6, Landroidx/media3/common/c;->e:I

    .line 496
    .line 497
    move/from16 v29, v9

    .line 498
    .line 499
    iget-object v9, v6, Landroidx/media3/common/c;->a:Ljava/lang/Object;

    .line 500
    .line 501
    iget-wide v11, v6, Landroidx/media3/common/c;->c:J

    .line 502
    .line 503
    invoke-direct/range {v8 .. v15}, Landroidx/media3/common/c;-><init>(Ljava/lang/Object;[Landroidx/media3/common/b;JJI)V

    .line 504
    .line 505
    .line 506
    move/from16 v0, p1

    .line 507
    .line 508
    move-object v6, v8

    .line 509
    const/4 v2, 0x0

    .line 510
    goto/16 :goto_5

    .line 511
    .line 512
    :cond_b
    array-length v0, v1

    .line 513
    move-wide v8, v4

    .line 514
    const/4 v2, 0x0

    .line 515
    :goto_e
    if-ge v2, v0, :cond_c

    .line 516
    .line 517
    aget-wide v3, v1, v2

    .line 518
    .line 519
    add-long/2addr v8, v3

    .line 520
    add-int/lit8 v2, v2, 0x1

    .line 521
    .line 522
    goto :goto_e

    .line 523
    :cond_c
    move-wide/from16 v10, p3

    .line 524
    .line 525
    invoke-static/range {v6 .. v11}, Landroidx/media3/exoplayer/source/ads/ServerSideAdInsertionUtil;->correctFollowingAdGroupTimes(Landroidx/media3/common/c;IJJ)Landroidx/media3/common/c;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    return-object v0
.end method

.method private static correctFollowingAdGroupTimes(Landroidx/media3/common/c;IJJ)Landroidx/media3/common/c;
    .locals 18

    .line 1
    move-wide/from16 v0, p2

    .line 2
    .line 3
    neg-long v0, v0

    .line 4
    add-long v0, v0, p4

    .line 5
    .line 6
    add-int/lit8 v2, p1, 0x1

    .line 7
    .line 8
    move v3, v2

    .line 9
    move-object/from16 v2, p0

    .line 10
    .line 11
    :goto_0
    iget v4, v2, Landroidx/media3/common/c;->b:I

    .line 12
    .line 13
    if-ge v3, v4, :cond_1

    .line 14
    .line 15
    invoke-virtual {v2, v3}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    iget-wide v4, v4, Landroidx/media3/common/b;->a:J

    .line 20
    .line 21
    const-wide/high16 v6, -0x8000000000000000L

    .line 22
    .line 23
    cmp-long v6, v4, v6

    .line 24
    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    add-long v8, v4, v0

    .line 28
    .line 29
    iget v4, v2, Landroidx/media3/common/c;->e:I

    .line 30
    .line 31
    sub-int v4, v3, v4

    .line 32
    .line 33
    iget-object v5, v2, Landroidx/media3/common/c;->f:[Landroidx/media3/common/b;

    .line 34
    .line 35
    array-length v6, v5

    .line 36
    invoke-static {v6, v5}, Lh1/i0;->U(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    check-cast v6, [Landroidx/media3/common/b;

    .line 41
    .line 42
    aget-object v5, v5, v4

    .line 43
    .line 44
    new-instance v7, Landroidx/media3/common/b;

    .line 45
    .line 46
    iget v10, v5, Landroidx/media3/common/b;->b:I

    .line 47
    .line 48
    iget v11, v5, Landroidx/media3/common/b;->c:I

    .line 49
    .line 50
    iget-object v12, v5, Landroidx/media3/common/b;->f:[I

    .line 51
    .line 52
    iget-object v13, v5, Landroidx/media3/common/b;->e:[Landroidx/media3/common/o0;

    .line 53
    .line 54
    iget-object v14, v5, Landroidx/media3/common/b;->g:[J

    .line 55
    .line 56
    move-wide/from16 p2, v0

    .line 57
    .line 58
    iget-wide v0, v5, Landroidx/media3/common/b;->h:J

    .line 59
    .line 60
    iget-boolean v5, v5, Landroidx/media3/common/b;->i:Z

    .line 61
    .line 62
    move-wide v15, v0

    .line 63
    move/from16 v17, v5

    .line 64
    .line 65
    invoke-direct/range {v7 .. v17}, Landroidx/media3/common/b;-><init>(JII[I[Landroidx/media3/common/o0;[JJZ)V

    .line 66
    .line 67
    .line 68
    aput-object v7, v6, v4

    .line 69
    .line 70
    new-instance v10, Landroidx/media3/common/c;

    .line 71
    .line 72
    iget-object v11, v2, Landroidx/media3/common/c;->a:Ljava/lang/Object;

    .line 73
    .line 74
    iget-wide v13, v2, Landroidx/media3/common/c;->c:J

    .line 75
    .line 76
    iget-wide v0, v2, Landroidx/media3/common/c;->d:J

    .line 77
    .line 78
    iget v2, v2, Landroidx/media3/common/c;->e:I

    .line 79
    .line 80
    move-wide v15, v0

    .line 81
    move/from16 v17, v2

    .line 82
    .line 83
    move-object v12, v6

    .line 84
    invoke-direct/range {v10 .. v17}, Landroidx/media3/common/c;-><init>(Ljava/lang/Object;[Landroidx/media3/common/b;JJI)V

    .line 85
    .line 86
    .line 87
    move-object v2, v10

    .line 88
    goto :goto_1

    .line 89
    :cond_0
    move-wide/from16 p2, v0

    .line 90
    .line 91
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 92
    .line 93
    move-wide/from16 v0, p2

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    return-object v2
.end method

.method public static getAdCountInGroup(Landroidx/media3/common/c;I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, Landroidx/media3/common/b;->b:I

    .line 6
    .line 7
    const/4 p1, -0x1

    .line 8
    if-ne p0, p1, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    :cond_0
    return p0
.end method

.method public static getMediaPeriodPositionUs(JLandroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;Landroidx/media3/common/c;)J
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    .line 8
    .line 9
    iget p2, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adIndexInAdGroup:I

    .line 10
    .line 11
    invoke-static {p0, p1, v0, p2, p3}, Landroidx/media3/exoplayer/source/ads/ServerSideAdInsertionUtil;->getMediaPeriodPositionUsForAd(JIILandroidx/media3/common/c;)J

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    return-wide p0

    .line 16
    :cond_0
    iget p2, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->nextAdGroupIndex:I

    .line 17
    .line 18
    invoke-static {p0, p1, p2, p3}, Landroidx/media3/exoplayer/source/ads/ServerSideAdInsertionUtil;->getMediaPeriodPositionUsForContent(JILandroidx/media3/common/c;)J

    .line 19
    .line 20
    .line 21
    move-result-wide p0

    .line 22
    return-wide p0
.end method

.method public static getMediaPeriodPositionUsForAd(JIILandroidx/media3/common/c;)J
    .locals 7

    .line 1
    invoke-virtual {p4, p2}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-wide v1, v0, Landroidx/media3/common/b;->a:J

    .line 6
    .line 7
    sub-long/2addr p0, v1

    .line 8
    iget v1, p4, Landroidx/media3/common/c;->e:I

    .line 9
    .line 10
    :goto_0
    const/4 v2, 0x0

    .line 11
    if-ge v1, p2, :cond_1

    .line 12
    .line 13
    invoke-virtual {p4, v1}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    :goto_1
    invoke-static {p4, v1}, Landroidx/media3/exoplayer/source/ads/ServerSideAdInsertionUtil;->getAdCountInGroup(Landroidx/media3/common/c;I)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-ge v2, v4, :cond_0

    .line 22
    .line 23
    iget-object v4, v3, Landroidx/media3/common/b;->g:[J

    .line 24
    .line 25
    aget-wide v5, v4, v2

    .line 26
    .line 27
    sub-long/2addr p0, v5

    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    iget-wide v2, v3, Landroidx/media3/common/b;->h:J

    .line 32
    .line 33
    add-long/2addr p0, v2

    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-static {p4, p2}, Landroidx/media3/exoplayer/source/ads/ServerSideAdInsertionUtil;->getAdCountInGroup(Landroidx/media3/common/c;I)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-ge p3, p2, :cond_2

    .line 42
    .line 43
    :goto_2
    if-ge v2, p3, :cond_2

    .line 44
    .line 45
    iget-object p2, v0, Landroidx/media3/common/b;->g:[J

    .line 46
    .line 47
    aget-wide v3, p2, v2

    .line 48
    .line 49
    sub-long/2addr p0, v3

    .line 50
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    return-wide p0
.end method

.method public static getMediaPeriodPositionUsForContent(JILandroidx/media3/common/c;)J
    .locals 10

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p2, v0, :cond_0

    .line 3
    .line 4
    iget p2, p3, Landroidx/media3/common/c;->b:I

    .line 5
    .line 6
    :cond_0
    iget v0, p3, Landroidx/media3/common/c;->e:I

    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    :goto_0
    if-ge v0, p2, :cond_4

    .line 11
    .line 12
    invoke-virtual {p3, v0}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    iget-wide v4, v3, Landroidx/media3/common/b;->a:J

    .line 17
    .line 18
    const-wide/high16 v6, -0x8000000000000000L

    .line 19
    .line 20
    cmp-long v6, v4, v6

    .line 21
    .line 22
    if-eqz v6, :cond_4

    .line 23
    .line 24
    sub-long v6, p0, v1

    .line 25
    .line 26
    cmp-long v4, v4, v6

    .line 27
    .line 28
    if-lez v4, :cond_1

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    const/4 v4, 0x0

    .line 32
    :goto_1
    invoke-static {p3, v0}, Landroidx/media3/exoplayer/source/ads/ServerSideAdInsertionUtil;->getAdCountInGroup(Landroidx/media3/common/c;I)I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-ge v4, v5, :cond_2

    .line 37
    .line 38
    iget-object v5, v3, Landroidx/media3/common/b;->g:[J

    .line 39
    .line 40
    aget-wide v6, v5, v4

    .line 41
    .line 42
    add-long/2addr v1, v6

    .line 43
    add-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    iget-wide v4, v3, Landroidx/media3/common/b;->h:J

    .line 47
    .line 48
    sub-long/2addr v1, v4

    .line 49
    iget-wide v6, v3, Landroidx/media3/common/b;->a:J

    .line 50
    .line 51
    add-long/2addr v4, v6

    .line 52
    sub-long v8, p0, v1

    .line 53
    .line 54
    cmp-long v3, v4, v8

    .line 55
    .line 56
    if-lez v3, :cond_3

    .line 57
    .line 58
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 59
    .line 60
    .line 61
    move-result-wide p0

    .line 62
    return-wide p0

    .line 63
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    :goto_2
    sub-long/2addr p0, v1

    .line 67
    return-wide p0
.end method

.method public static getStreamPositionUs(JLandroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;Landroidx/media3/common/c;)J
    .locals 1

    .line 16
    invoke-virtual {p2}, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->isAd()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 17
    iget v0, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adGroupIndex:I

    iget p2, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->adIndexInAdGroup:I

    invoke-static {p0, p1, v0, p2, p3}, Landroidx/media3/exoplayer/source/ads/ServerSideAdInsertionUtil;->getStreamPositionUsForAd(JIILandroidx/media3/common/c;)J

    move-result-wide p0

    return-wide p0

    .line 18
    :cond_0
    iget p2, p2, Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;->nextAdGroupIndex:I

    invoke-static {p0, p1, p2, p3}, Landroidx/media3/exoplayer/source/ads/ServerSideAdInsertionUtil;->getStreamPositionUsForContent(JILandroidx/media3/common/c;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static getStreamPositionUs(Landroidx/media3/common/d1;Landroidx/media3/common/c;)J
    .locals 6

    .line 1
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentTimeline()Landroidx/media3/common/p1;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Landroidx/media3/common/p1;->isEmpty()Z

    move-result v1

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v1, :cond_0

    return-wide v2

    .line 3
    :cond_0
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentPeriodIndex()I

    move-result v1

    new-instance v4, Landroidx/media3/common/m1;

    invoke-direct {v4}, Landroidx/media3/common/m1;-><init>()V

    invoke-virtual {v0, v1, v4}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;)Landroidx/media3/common/m1;

    move-result-object v0

    .line 4
    iget-object v1, v0, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 5
    iget-object v1, v1, Landroidx/media3/common/c;->a:Ljava/lang/Object;

    .line 6
    iget-object v4, p1, Landroidx/media3/common/c;->a:Ljava/lang/Object;

    sget v5, Lh1/i0;->a:I

    .line 7
    invoke-static {v1, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    return-wide v2

    .line 8
    :cond_1
    invoke-interface {p0}, Landroidx/media3/common/d1;->isPlayingAd()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 9
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentAdGroupIndex()I

    move-result v0

    .line 10
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentAdIndexInAdGroup()I

    move-result v1

    .line 11
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentPosition()J

    move-result-wide v2

    invoke-static {v2, v3}, Lh1/i0;->S(J)J

    move-result-wide v2

    .line 12
    invoke-static {v2, v3, v0, v1, p1}, Landroidx/media3/exoplayer/source/ads/ServerSideAdInsertionUtil;->getStreamPositionUsForAd(JIILandroidx/media3/common/c;)J

    move-result-wide p0

    return-wide p0

    .line 13
    :cond_2
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentPosition()J

    move-result-wide v1

    invoke-static {v1, v2}, Lh1/i0;->S(J)J

    move-result-wide v1

    .line 14
    iget-wide v3, v0, Landroidx/media3/common/m1;->e:J

    sub-long/2addr v1, v3

    const/4 p0, -0x1

    .line 15
    invoke-static {v1, v2, p0, p1}, Landroidx/media3/exoplayer/source/ads/ServerSideAdInsertionUtil;->getStreamPositionUsForContent(JILandroidx/media3/common/c;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static getStreamPositionUsForAd(JIILandroidx/media3/common/c;)J
    .locals 7

    .line 1
    invoke-virtual {p4, p2}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-wide v1, v0, Landroidx/media3/common/b;->a:J

    .line 6
    .line 7
    add-long/2addr p0, v1

    .line 8
    iget v1, p4, Landroidx/media3/common/c;->e:I

    .line 9
    .line 10
    :goto_0
    const/4 v2, 0x0

    .line 11
    if-ge v1, p2, :cond_1

    .line 12
    .line 13
    invoke-virtual {p4, v1}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    :goto_1
    invoke-static {p4, v1}, Landroidx/media3/exoplayer/source/ads/ServerSideAdInsertionUtil;->getAdCountInGroup(Landroidx/media3/common/c;I)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-ge v2, v4, :cond_0

    .line 22
    .line 23
    iget-object v4, v3, Landroidx/media3/common/b;->g:[J

    .line 24
    .line 25
    aget-wide v5, v4, v2

    .line 26
    .line 27
    add-long/2addr p0, v5

    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    iget-wide v2, v3, Landroidx/media3/common/b;->h:J

    .line 32
    .line 33
    sub-long/2addr p0, v2

    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-static {p4, p2}, Landroidx/media3/exoplayer/source/ads/ServerSideAdInsertionUtil;->getAdCountInGroup(Landroidx/media3/common/c;I)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-ge p3, p2, :cond_2

    .line 42
    .line 43
    :goto_2
    if-ge v2, p3, :cond_2

    .line 44
    .line 45
    iget-object p2, v0, Landroidx/media3/common/b;->g:[J

    .line 46
    .line 47
    aget-wide v3, p2, v2

    .line 48
    .line 49
    add-long/2addr p0, v3

    .line 50
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    return-wide p0
.end method

.method public static getStreamPositionUsForContent(JILandroidx/media3/common/c;)J
    .locals 10

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p2, v0, :cond_0

    .line 3
    .line 4
    iget p2, p3, Landroidx/media3/common/c;->b:I

    .line 5
    .line 6
    :cond_0
    iget v0, p3, Landroidx/media3/common/c;->e:I

    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    :goto_0
    if-ge v0, p2, :cond_4

    .line 11
    .line 12
    invoke-virtual {p3, v0}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    iget-wide v4, v3, Landroidx/media3/common/b;->a:J

    .line 17
    .line 18
    const-wide/high16 v6, -0x8000000000000000L

    .line 19
    .line 20
    cmp-long v6, v4, v6

    .line 21
    .line 22
    if-eqz v6, :cond_4

    .line 23
    .line 24
    cmp-long v6, v4, p0

    .line 25
    .line 26
    if-lez v6, :cond_1

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_1
    add-long/2addr v4, v1

    .line 30
    const/4 v6, 0x0

    .line 31
    :goto_1
    invoke-static {p3, v0}, Landroidx/media3/exoplayer/source/ads/ServerSideAdInsertionUtil;->getAdCountInGroup(Landroidx/media3/common/c;I)I

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    if-ge v6, v7, :cond_2

    .line 36
    .line 37
    iget-object v7, v3, Landroidx/media3/common/b;->g:[J

    .line 38
    .line 39
    aget-wide v8, v7, v6

    .line 40
    .line 41
    add-long/2addr v1, v8

    .line 42
    add-int/lit8 v6, v6, 0x1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    iget-wide v6, v3, Landroidx/media3/common/b;->h:J

    .line 46
    .line 47
    sub-long/2addr v1, v6

    .line 48
    iget-wide v8, v3, Landroidx/media3/common/b;->a:J

    .line 49
    .line 50
    add-long/2addr v8, v6

    .line 51
    cmp-long v3, v8, p0

    .line 52
    .line 53
    if-lez v3, :cond_3

    .line 54
    .line 55
    add-long/2addr p0, v1

    .line 56
    invoke-static {v4, v5, p0, p1}, Ljava/lang/Math;->max(JJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide p0

    .line 60
    return-wide p0

    .line 61
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_4
    :goto_2
    add-long/2addr p0, v1

    .line 65
    return-wide p0
.end method
