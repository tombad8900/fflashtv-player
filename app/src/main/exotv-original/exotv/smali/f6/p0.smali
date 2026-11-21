.class public final Lf6/p0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public a:[Ljava/lang/Object;

.field public b:I

.field public c:Lf6/o0;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    mul-int/lit8 p1, p1, 0x2

    .line 5
    .line 6
    new-array p1, p1, [Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p1, p0, Lf6/p0;->a:[Ljava/lang/Object;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lf6/p0;->b:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Lf6/q1;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lf6/p0;->c:Lf6/o0;

    .line 4
    .line 5
    if-nez v1, :cond_16

    .line 6
    .line 7
    iget v1, v0, Lf6/p0;->b:I

    .line 8
    .line 9
    iget-object v2, v0, Lf6/p0;->a:[Ljava/lang/Object;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    sget-object v1, Lf6/q1;->p:Lf6/q1;

    .line 14
    .line 15
    goto/16 :goto_c

    .line 16
    .line 17
    :cond_0
    const/4 v3, 0x1

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    if-ne v1, v3, :cond_1

    .line 21
    .line 22
    aget-object v1, v2, v5

    .line 23
    .line 24
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    aget-object v1, v2, v3

    .line 28
    .line 29
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    new-instance v1, Lf6/q1;

    .line 33
    .line 34
    invoke-direct {v1, v4, v2, v3}, Lf6/q1;-><init>(Ljava/lang/Object;[Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_c

    .line 38
    .line 39
    :cond_1
    array-length v6, v2

    .line 40
    shr-int/2addr v6, v3

    .line 41
    invoke-static {v1, v6}, Lcom/bumptech/glide/c;->p(II)V

    .line 42
    .line 43
    .line 44
    invoke-static {v1}, Lf6/w0;->h(I)I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    const/4 v7, 0x2

    .line 49
    if-ne v1, v3, :cond_2

    .line 50
    .line 51
    aget-object v6, v2, v5

    .line 52
    .line 53
    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    aget-object v6, v2, v3

    .line 57
    .line 58
    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move/from16 v16, v3

    .line 62
    .line 63
    move/from16 v17, v5

    .line 64
    .line 65
    :goto_0
    move/from16 v18, v7

    .line 66
    .line 67
    goto/16 :goto_b

    .line 68
    .line 69
    :cond_2
    add-int/lit8 v8, v6, -0x1

    .line 70
    .line 71
    const/16 v9, 0x80

    .line 72
    .line 73
    const/4 v10, 0x3

    .line 74
    const/4 v11, -0x1

    .line 75
    if-gt v6, v9, :cond_8

    .line 76
    .line 77
    new-array v6, v6, [B

    .line 78
    .line 79
    invoke-static {v6, v11}, Ljava/util/Arrays;->fill([BB)V

    .line 80
    .line 81
    .line 82
    move v9, v5

    .line 83
    move v11, v9

    .line 84
    :goto_1
    if-ge v9, v1, :cond_6

    .line 85
    .line 86
    mul-int/lit8 v12, v9, 0x2

    .line 87
    .line 88
    mul-int/lit8 v13, v11, 0x2

    .line 89
    .line 90
    aget-object v14, v2, v12

    .line 91
    .line 92
    invoke-static {v14}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    xor-int/2addr v12, v3

    .line 96
    aget-object v12, v2, v12

    .line 97
    .line 98
    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v14}, Ljava/lang/Object;->hashCode()I

    .line 102
    .line 103
    .line 104
    move-result v15

    .line 105
    invoke-static {v15}, Lf6/u;->q(I)I

    .line 106
    .line 107
    .line 108
    move-result v15

    .line 109
    :goto_2
    and-int/2addr v15, v8

    .line 110
    move/from16 v16, v3

    .line 111
    .line 112
    aget-byte v3, v6, v15

    .line 113
    .line 114
    move/from16 v17, v5

    .line 115
    .line 116
    const/16 v5, 0xff

    .line 117
    .line 118
    and-int/2addr v3, v5

    .line 119
    if-ne v3, v5, :cond_4

    .line 120
    .line 121
    int-to-byte v3, v13

    .line 122
    aput-byte v3, v6, v15

    .line 123
    .line 124
    if-ge v11, v9, :cond_3

    .line 125
    .line 126
    aput-object v14, v2, v13

    .line 127
    .line 128
    xor-int/lit8 v3, v13, 0x1

    .line 129
    .line 130
    aput-object v12, v2, v3

    .line 131
    .line 132
    :cond_3
    add-int/lit8 v11, v11, 0x1

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_4
    aget-object v5, v2, v3

    .line 136
    .line 137
    invoke-virtual {v14, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-eqz v5, :cond_5

    .line 142
    .line 143
    new-instance v4, Lf6/o0;

    .line 144
    .line 145
    xor-int/lit8 v3, v3, 0x1

    .line 146
    .line 147
    aget-object v5, v2, v3

    .line 148
    .line 149
    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    invoke-direct {v4, v14, v12, v5}, Lf6/o0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    aput-object v12, v2, v3

    .line 156
    .line 157
    :goto_3
    add-int/lit8 v9, v9, 0x1

    .line 158
    .line 159
    move/from16 v3, v16

    .line 160
    .line 161
    move/from16 v5, v17

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_5
    add-int/lit8 v15, v15, 0x1

    .line 165
    .line 166
    move/from16 v3, v16

    .line 167
    .line 168
    move/from16 v5, v17

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_6
    move/from16 v16, v3

    .line 172
    .line 173
    move/from16 v17, v5

    .line 174
    .line 175
    if-ne v11, v1, :cond_7

    .line 176
    .line 177
    move-object v4, v6

    .line 178
    goto :goto_0

    .line 179
    :cond_7
    new-array v3, v10, [Ljava/lang/Object;

    .line 180
    .line 181
    aput-object v6, v3, v17

    .line 182
    .line 183
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    aput-object v5, v3, v16

    .line 188
    .line 189
    aput-object v4, v3, v7

    .line 190
    .line 191
    :goto_4
    move-object v4, v3

    .line 192
    goto :goto_0

    .line 193
    :cond_8
    move/from16 v16, v3

    .line 194
    .line 195
    move/from16 v17, v5

    .line 196
    .line 197
    const v3, 0x8000

    .line 198
    .line 199
    .line 200
    if-gt v6, v3, :cond_e

    .line 201
    .line 202
    new-array v3, v6, [S

    .line 203
    .line 204
    invoke-static {v3, v11}, Ljava/util/Arrays;->fill([SS)V

    .line 205
    .line 206
    .line 207
    move/from16 v5, v17

    .line 208
    .line 209
    move v6, v5

    .line 210
    :goto_5
    if-ge v5, v1, :cond_c

    .line 211
    .line 212
    mul-int/lit8 v9, v5, 0x2

    .line 213
    .line 214
    mul-int/lit8 v11, v6, 0x2

    .line 215
    .line 216
    aget-object v12, v2, v9

    .line 217
    .line 218
    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    xor-int/lit8 v9, v9, 0x1

    .line 222
    .line 223
    aget-object v9, v2, v9

    .line 224
    .line 225
    invoke-static {v9}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v12}, Ljava/lang/Object;->hashCode()I

    .line 229
    .line 230
    .line 231
    move-result v13

    .line 232
    invoke-static {v13}, Lf6/u;->q(I)I

    .line 233
    .line 234
    .line 235
    move-result v13

    .line 236
    :goto_6
    and-int/2addr v13, v8

    .line 237
    aget-short v14, v3, v13

    .line 238
    .line 239
    const v15, 0xffff

    .line 240
    .line 241
    .line 242
    and-int/2addr v14, v15

    .line 243
    if-ne v14, v15, :cond_a

    .line 244
    .line 245
    int-to-short v14, v11

    .line 246
    aput-short v14, v3, v13

    .line 247
    .line 248
    if-ge v6, v5, :cond_9

    .line 249
    .line 250
    aput-object v12, v2, v11

    .line 251
    .line 252
    xor-int/lit8 v11, v11, 0x1

    .line 253
    .line 254
    aput-object v9, v2, v11

    .line 255
    .line 256
    :cond_9
    add-int/lit8 v6, v6, 0x1

    .line 257
    .line 258
    goto :goto_7

    .line 259
    :cond_a
    aget-object v15, v2, v14

    .line 260
    .line 261
    invoke-virtual {v12, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v15

    .line 265
    if-eqz v15, :cond_b

    .line 266
    .line 267
    new-instance v4, Lf6/o0;

    .line 268
    .line 269
    xor-int/lit8 v11, v14, 0x1

    .line 270
    .line 271
    aget-object v13, v2, v11

    .line 272
    .line 273
    invoke-static {v13}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    invoke-direct {v4, v12, v9, v13}, Lf6/o0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    aput-object v9, v2, v11

    .line 280
    .line 281
    :goto_7
    add-int/lit8 v5, v5, 0x1

    .line 282
    .line 283
    goto :goto_5

    .line 284
    :cond_b
    add-int/lit8 v13, v13, 0x1

    .line 285
    .line 286
    goto :goto_6

    .line 287
    :cond_c
    if-ne v6, v1, :cond_d

    .line 288
    .line 289
    goto :goto_4

    .line 290
    :cond_d
    new-array v5, v10, [Ljava/lang/Object;

    .line 291
    .line 292
    aput-object v3, v5, v17

    .line 293
    .line 294
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    aput-object v3, v5, v16

    .line 299
    .line 300
    aput-object v4, v5, v7

    .line 301
    .line 302
    move-object v4, v5

    .line 303
    goto/16 :goto_0

    .line 304
    .line 305
    :cond_e
    new-array v3, v6, [I

    .line 306
    .line 307
    invoke-static {v3, v11}, Ljava/util/Arrays;->fill([II)V

    .line 308
    .line 309
    .line 310
    move/from16 v5, v17

    .line 311
    .line 312
    move v6, v5

    .line 313
    :goto_8
    if-ge v5, v1, :cond_12

    .line 314
    .line 315
    mul-int/lit8 v9, v5, 0x2

    .line 316
    .line 317
    mul-int/lit8 v12, v6, 0x2

    .line 318
    .line 319
    aget-object v13, v2, v9

    .line 320
    .line 321
    invoke-static {v13}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    xor-int/lit8 v9, v9, 0x1

    .line 325
    .line 326
    aget-object v9, v2, v9

    .line 327
    .line 328
    invoke-static {v9}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v13}, Ljava/lang/Object;->hashCode()I

    .line 332
    .line 333
    .line 334
    move-result v14

    .line 335
    invoke-static {v14}, Lf6/u;->q(I)I

    .line 336
    .line 337
    .line 338
    move-result v14

    .line 339
    :goto_9
    and-int/2addr v14, v8

    .line 340
    aget v15, v3, v14

    .line 341
    .line 342
    if-ne v15, v11, :cond_10

    .line 343
    .line 344
    aput v12, v3, v14

    .line 345
    .line 346
    if-ge v6, v5, :cond_f

    .line 347
    .line 348
    aput-object v13, v2, v12

    .line 349
    .line 350
    xor-int/lit8 v12, v12, 0x1

    .line 351
    .line 352
    aput-object v9, v2, v12

    .line 353
    .line 354
    :cond_f
    add-int/lit8 v6, v6, 0x1

    .line 355
    .line 356
    move/from16 v18, v7

    .line 357
    .line 358
    goto :goto_a

    .line 359
    :cond_10
    move/from16 v18, v7

    .line 360
    .line 361
    aget-object v7, v2, v15

    .line 362
    .line 363
    invoke-virtual {v13, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v7

    .line 367
    if-eqz v7, :cond_11

    .line 368
    .line 369
    new-instance v4, Lf6/o0;

    .line 370
    .line 371
    xor-int/lit8 v7, v15, 0x1

    .line 372
    .line 373
    aget-object v12, v2, v7

    .line 374
    .line 375
    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    invoke-direct {v4, v13, v9, v12}, Lf6/o0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    aput-object v9, v2, v7

    .line 382
    .line 383
    :goto_a
    add-int/lit8 v5, v5, 0x1

    .line 384
    .line 385
    move/from16 v7, v18

    .line 386
    .line 387
    goto :goto_8

    .line 388
    :cond_11
    add-int/lit8 v14, v14, 0x1

    .line 389
    .line 390
    move/from16 v7, v18

    .line 391
    .line 392
    goto :goto_9

    .line 393
    :cond_12
    move/from16 v18, v7

    .line 394
    .line 395
    if-ne v6, v1, :cond_13

    .line 396
    .line 397
    move-object v4, v3

    .line 398
    goto :goto_b

    .line 399
    :cond_13
    new-array v5, v10, [Ljava/lang/Object;

    .line 400
    .line 401
    aput-object v3, v5, v17

    .line 402
    .line 403
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    aput-object v3, v5, v16

    .line 408
    .line 409
    aput-object v4, v5, v18

    .line 410
    .line 411
    move-object v4, v5

    .line 412
    :goto_b
    instance-of v3, v4, [Ljava/lang/Object;

    .line 413
    .line 414
    if-eqz v3, :cond_14

    .line 415
    .line 416
    check-cast v4, [Ljava/lang/Object;

    .line 417
    .line 418
    aget-object v1, v4, v18

    .line 419
    .line 420
    check-cast v1, Lf6/o0;

    .line 421
    .line 422
    iput-object v1, v0, Lf6/p0;->c:Lf6/o0;

    .line 423
    .line 424
    aget-object v1, v4, v17

    .line 425
    .line 426
    aget-object v3, v4, v16

    .line 427
    .line 428
    check-cast v3, Ljava/lang/Integer;

    .line 429
    .line 430
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 431
    .line 432
    .line 433
    move-result v3

    .line 434
    mul-int/lit8 v4, v3, 0x2

    .line 435
    .line 436
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    move-object v4, v1

    .line 441
    move v1, v3

    .line 442
    :cond_14
    new-instance v3, Lf6/q1;

    .line 443
    .line 444
    invoke-direct {v3, v4, v2, v1}, Lf6/q1;-><init>(Ljava/lang/Object;[Ljava/lang/Object;I)V

    .line 445
    .line 446
    .line 447
    move-object v1, v3

    .line 448
    :goto_c
    iget-object v2, v0, Lf6/p0;->c:Lf6/o0;

    .line 449
    .line 450
    if-nez v2, :cond_15

    .line 451
    .line 452
    return-object v1

    .line 453
    :cond_15
    invoke-virtual {v2}, Lf6/o0;->a()Ljava/lang/IllegalArgumentException;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    throw v1

    .line 458
    :cond_16
    invoke-virtual {v1}, Lf6/o0;->a()Ljava/lang/IllegalArgumentException;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    throw v1
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lf6/p0;->b:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    mul-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    iget-object v1, p0, Lf6/p0;->a:[Ljava/lang/Object;

    .line 8
    .line 9
    array-length v2, v1

    .line 10
    if-le v0, v2, :cond_0

    .line 11
    .line 12
    array-length v2, v1

    .line 13
    invoke-static {v2, v0}, Lf6/g0;->e(II)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lf6/p0;->a:[Ljava/lang/Object;

    .line 22
    .line 23
    :cond_0
    if-eqz p1, :cond_2

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lf6/p0;->a:[Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, p0, Lf6/p0;->b:I

    .line 30
    .line 31
    mul-int/lit8 v2, v1, 0x2

    .line 32
    .line 33
    aput-object p1, v0, v2

    .line 34
    .line 35
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    aput-object p2, v0, v2

    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    iput v1, p0, Lf6/p0;->b:I

    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    new-instance p2, Ljava/lang/NullPointerException;

    .line 45
    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v1, "null value in entry: "

    .line 49
    .line 50
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p1, "=null"

    .line 57
    .line 58
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p2

    .line 69
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 70
    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v1, "null key in entry: null="

    .line 74
    .line 75
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p1
.end method
