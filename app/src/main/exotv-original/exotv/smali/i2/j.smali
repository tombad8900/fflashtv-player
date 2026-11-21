.class public final Li2/j;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lt2/c0;


# instance fields
.field public final synthetic j:I

.field public k:I

.field public final l:Ljava/lang/Object;

.field public final m:Ljava/lang/Object;

.field public final n:Ljava/lang/Cloneable;

.field public o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ln1/z;Ll/o;[B[Ln1/k0;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li2/j;->j:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Li2/j;->l:Ljava/lang/Object;

    .line 8
    iput-object p2, p0, Li2/j;->m:Ljava/lang/Object;

    .line 9
    iput-object p3, p0, Li2/j;->n:Ljava/lang/Cloneable;

    .line 10
    iput-object p4, p0, Li2/j;->o:Ljava/lang/Object;

    .line 11
    iput p5, p0, Li2/j;->k:I

    return-void
.end method

.method public constructor <init>(Lt2/e0;I)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Li2/j;->j:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li2/j;->o:Ljava/lang/Object;

    .line 13
    new-instance p1, Lh1/v;

    const/4 v0, 0x5

    new-array v1, v0, [B

    .line 14
    invoke-direct {p1, v1, v0}, Lh1/v;-><init>([BI)V

    .line 15
    iput-object p1, p0, Li2/j;->l:Ljava/lang/Object;

    .line 16
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Li2/j;->m:Ljava/lang/Object;

    .line 17
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Li2/j;->n:Ljava/lang/Cloneable;

    .line 18
    iput p2, p0, Li2/j;->k:I

    return-void
.end method

.method public constructor <init>(Lz2/w;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Li2/j;->j:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Li2/j;->k:I

    .line 3
    iput-object p1, p0, Li2/j;->l:Ljava/lang/Object;

    .line 4
    new-instance p1, Lv1/c;

    invoke-direct {p1}, Lv1/c;-><init>()V

    iput-object p1, p0, Li2/j;->m:Ljava/lang/Object;

    .line 5
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Li2/j;->n:Ljava/lang/Cloneable;

    return-void
.end method


# virtual methods
.method public a(Lh1/w;)V
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Li2/j;->m:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Landroid/util/SparseArray;

    .line 8
    .line 9
    iget-object v3, v0, Li2/j;->n:Ljava/lang/Cloneable;

    .line 10
    .line 11
    check-cast v3, Landroid/util/SparseIntArray;

    .line 12
    .line 13
    iget-object v4, v0, Li2/j;->l:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Lh1/v;

    .line 16
    .line 17
    iget-object v5, v0, Li2/j;->o:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v5, Lt2/e0;

    .line 20
    .line 21
    iget-object v6, v5, Lt2/e0;->h:Landroid/util/SparseArray;

    .line 22
    .line 23
    iget-object v7, v5, Lt2/e0;->i:Landroid/util/SparseBooleanArray;

    .line 24
    .line 25
    iget-object v8, v5, Lt2/e0;->f:Lj0/i;

    .line 26
    .line 27
    iget-object v9, v5, Lt2/e0;->c:Ljava/util/List;

    .line 28
    .line 29
    iget v10, v5, Lt2/e0;->a:I

    .line 30
    .line 31
    invoke-virtual {v1}, Lh1/w;->u()I

    .line 32
    .line 33
    .line 34
    move-result v11

    .line 35
    const/4 v12, 0x2

    .line 36
    if-eq v11, v12, :cond_0

    .line 37
    .line 38
    :goto_0
    move-object v2, v0

    .line 39
    goto/16 :goto_15

    .line 40
    .line 41
    :cond_0
    const/4 v11, 0x0

    .line 42
    const/4 v13, 0x1

    .line 43
    if-eq v10, v13, :cond_2

    .line 44
    .line 45
    if-eq v10, v12, :cond_2

    .line 46
    .line 47
    iget v14, v5, Lt2/e0;->n:I

    .line 48
    .line 49
    if-ne v14, v13, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    new-instance v14, Lh1/d0;

    .line 53
    .line 54
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v15

    .line 58
    check-cast v15, Lh1/d0;

    .line 59
    .line 60
    invoke-virtual {v15}, Lh1/d0;->d()J

    .line 61
    .line 62
    .line 63
    move-result-wide v12

    .line 64
    invoke-direct {v14, v12, v13}, Lh1/d0;-><init>(J)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v9, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    :goto_1
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    move-object v14, v9

    .line 76
    check-cast v14, Lh1/d0;

    .line 77
    .line 78
    :goto_2
    invoke-virtual {v1}, Lh1/w;->u()I

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    and-int/lit16 v9, v9, 0x80

    .line 83
    .line 84
    if-nez v9, :cond_3

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    const/4 v9, 0x1

    .line 88
    invoke-virtual {v1, v9}, Lh1/w;->H(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Lh1/w;->A()I

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    const/4 v12, 0x3

    .line 96
    invoke-virtual {v1, v12}, Lh1/w;->H(I)V

    .line 97
    .line 98
    .line 99
    iget-object v13, v4, Lh1/v;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v13, [B

    .line 102
    .line 103
    const/4 v15, 0x2

    .line 104
    invoke-virtual {v1, v13, v11, v15}, Lh1/w;->e([BII)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4, v11}, Lh1/v;->s(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4, v12}, Lh1/v;->v(I)V

    .line 111
    .line 112
    .line 113
    const/16 v13, 0xd

    .line 114
    .line 115
    invoke-virtual {v4, v13}, Lh1/v;->k(I)I

    .line 116
    .line 117
    .line 118
    move-result v12

    .line 119
    iput v12, v5, Lt2/e0;->t:I

    .line 120
    .line 121
    iget-object v12, v4, Lh1/v;->b:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v12, [B

    .line 124
    .line 125
    invoke-virtual {v1, v12, v11, v15}, Lh1/w;->e([BII)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4, v11}, Lh1/v;->s(I)V

    .line 129
    .line 130
    .line 131
    const/4 v12, 0x4

    .line 132
    invoke-virtual {v4, v12}, Lh1/v;->v(I)V

    .line 133
    .line 134
    .line 135
    const/16 v12, 0xc

    .line 136
    .line 137
    invoke-virtual {v4, v12}, Lh1/v;->k(I)I

    .line 138
    .line 139
    .line 140
    move-result v13

    .line 141
    invoke-virtual {v1, v13}, Lh1/w;->H(I)V

    .line 142
    .line 143
    .line 144
    const/16 v13, 0x2000

    .line 145
    .line 146
    const/16 v12, 0x15

    .line 147
    .line 148
    if-ne v10, v15, :cond_4

    .line 149
    .line 150
    iget-object v15, v5, Lt2/e0;->r:Lt2/h0;

    .line 151
    .line 152
    if-nez v15, :cond_4

    .line 153
    .line 154
    new-instance v18, Lh1/t;

    .line 155
    .line 156
    const/16 v22, 0x0

    .line 157
    .line 158
    sget-object v23, Lh1/i0;->f:[B

    .line 159
    .line 160
    const/16 v19, 0x15

    .line 161
    .line 162
    const/16 v20, 0x0

    .line 163
    .line 164
    const/16 v21, 0x0

    .line 165
    .line 166
    invoke-direct/range {v18 .. v23}, Lh1/t;-><init>(ILjava/lang/String;ILjava/util/ArrayList;[B)V

    .line 167
    .line 168
    .line 169
    move-object/from16 v15, v18

    .line 170
    .line 171
    invoke-virtual {v8, v12, v15}, Lj0/i;->a(ILh1/t;)Lt2/h0;

    .line 172
    .line 173
    .line 174
    move-result-object v15

    .line 175
    iput-object v15, v5, Lt2/e0;->r:Lt2/h0;

    .line 176
    .line 177
    if-eqz v15, :cond_4

    .line 178
    .line 179
    iget-object v11, v5, Lt2/e0;->m:Ln1/p;

    .line 180
    .line 181
    new-instance v0, Lt2/g0;

    .line 182
    .line 183
    invoke-direct {v0, v9, v12, v13}, Lt2/g0;-><init>(III)V

    .line 184
    .line 185
    .line 186
    invoke-interface {v15, v14, v11, v0}, Lt2/h0;->b(Lh1/d0;Ln1/p;Lt2/g0;)V

    .line 187
    .line 188
    .line 189
    :cond_4
    invoke-virtual {v2}, Landroid/util/SparseArray;->clear()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v3}, Landroid/util/SparseIntArray;->clear()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1}, Lh1/w;->a()I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    :goto_3
    if-lez v0, :cond_1d

    .line 200
    .line 201
    iget-object v11, v4, Lh1/v;->b:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v11, [B

    .line 204
    .line 205
    const/4 v15, 0x5

    .line 206
    const/4 v13, 0x0

    .line 207
    invoke-virtual {v1, v11, v13, v15}, Lh1/w;->e([BII)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v4, v13}, Lh1/v;->s(I)V

    .line 211
    .line 212
    .line 213
    const/16 v11, 0x8

    .line 214
    .line 215
    invoke-virtual {v4, v11}, Lh1/v;->k(I)I

    .line 216
    .line 217
    .line 218
    move-result v11

    .line 219
    const/4 v13, 0x3

    .line 220
    invoke-virtual {v4, v13}, Lh1/v;->v(I)V

    .line 221
    .line 222
    .line 223
    const/16 v13, 0xd

    .line 224
    .line 225
    invoke-virtual {v4, v13}, Lh1/v;->k(I)I

    .line 226
    .line 227
    .line 228
    move-result v12

    .line 229
    const/4 v13, 0x4

    .line 230
    invoke-virtual {v4, v13}, Lh1/v;->v(I)V

    .line 231
    .line 232
    .line 233
    const/16 v13, 0xc

    .line 234
    .line 235
    invoke-virtual {v4, v13}, Lh1/v;->k(I)I

    .line 236
    .line 237
    .line 238
    move-result v17

    .line 239
    iget v13, v1, Lh1/w;->b:I

    .line 240
    .line 241
    add-int v15, v13, v17

    .line 242
    .line 243
    const/16 v23, -0x1

    .line 244
    .line 245
    const/16 v24, 0x0

    .line 246
    .line 247
    move/from16 v26, v23

    .line 248
    .line 249
    move-object/from16 v27, v24

    .line 250
    .line 251
    move-object/from16 v29, v27

    .line 252
    .line 253
    const/16 v28, 0x0

    .line 254
    .line 255
    move/from16 v23, v0

    .line 256
    .line 257
    :goto_4
    iget v0, v1, Lh1/w;->b:I

    .line 258
    .line 259
    if-ge v0, v15, :cond_15

    .line 260
    .line 261
    invoke-virtual {v1}, Lh1/w;->u()I

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    invoke-virtual {v1}, Lh1/w;->u()I

    .line 266
    .line 267
    .line 268
    move-result v24

    .line 269
    move-object/from16 v31, v4

    .line 270
    .line 271
    iget v4, v1, Lh1/w;->b:I

    .line 272
    .line 273
    add-int v4, v4, v24

    .line 274
    .line 275
    if-le v4, v15, :cond_5

    .line 276
    .line 277
    :goto_5
    move-object/from16 v32, v6

    .line 278
    .line 279
    move/from16 v33, v9

    .line 280
    .line 281
    move-object/from16 v16, v14

    .line 282
    .line 283
    const/4 v4, 0x4

    .line 284
    goto/16 :goto_c

    .line 285
    .line 286
    :cond_5
    const/16 v24, 0xac

    .line 287
    .line 288
    const/16 v25, 0x87

    .line 289
    .line 290
    const/16 v30, 0x81

    .line 291
    .line 292
    move-object/from16 v32, v6

    .line 293
    .line 294
    const/4 v6, 0x5

    .line 295
    if-ne v0, v6, :cond_a

    .line 296
    .line 297
    invoke-virtual {v1}, Lh1/w;->w()J

    .line 298
    .line 299
    .line 300
    move-result-wide v33

    .line 301
    const-wide/32 v35, 0x41432d33

    .line 302
    .line 303
    .line 304
    cmp-long v0, v33, v35

    .line 305
    .line 306
    if-nez v0, :cond_6

    .line 307
    .line 308
    move/from16 v26, v30

    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_6
    const-wide/32 v35, 0x45414333

    .line 312
    .line 313
    .line 314
    cmp-long v0, v33, v35

    .line 315
    .line 316
    if-nez v0, :cond_7

    .line 317
    .line 318
    move/from16 v26, v25

    .line 319
    .line 320
    goto :goto_7

    .line 321
    :cond_7
    const-wide/32 v35, 0x41432d34

    .line 322
    .line 323
    .line 324
    cmp-long v0, v33, v35

    .line 325
    .line 326
    if-nez v0, :cond_8

    .line 327
    .line 328
    :goto_6
    move/from16 v26, v24

    .line 329
    .line 330
    goto :goto_7

    .line 331
    :cond_8
    const-wide/32 v24, 0x48455643

    .line 332
    .line 333
    .line 334
    cmp-long v0, v33, v24

    .line 335
    .line 336
    if-nez v0, :cond_9

    .line 337
    .line 338
    const/16 v26, 0x24

    .line 339
    .line 340
    :cond_9
    :goto_7
    move/from16 v25, v4

    .line 341
    .line 342
    :goto_8
    move/from16 v33, v9

    .line 343
    .line 344
    move-object/from16 v16, v14

    .line 345
    .line 346
    :goto_9
    const/4 v4, 0x4

    .line 347
    goto/16 :goto_b

    .line 348
    .line 349
    :cond_a
    const/16 v6, 0x6a

    .line 350
    .line 351
    if-ne v0, v6, :cond_b

    .line 352
    .line 353
    move/from16 v25, v4

    .line 354
    .line 355
    move/from16 v33, v9

    .line 356
    .line 357
    move-object/from16 v16, v14

    .line 358
    .line 359
    move/from16 v26, v30

    .line 360
    .line 361
    goto :goto_9

    .line 362
    :cond_b
    const/16 v6, 0x7a

    .line 363
    .line 364
    if-ne v0, v6, :cond_c

    .line 365
    .line 366
    move/from16 v33, v9

    .line 367
    .line 368
    move-object/from16 v16, v14

    .line 369
    .line 370
    move/from16 v26, v25

    .line 371
    .line 372
    move/from16 v25, v4

    .line 373
    .line 374
    goto :goto_9

    .line 375
    :cond_c
    const/16 v6, 0x7f

    .line 376
    .line 377
    if-ne v0, v6, :cond_f

    .line 378
    .line 379
    invoke-virtual {v1}, Lh1/w;->u()I

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    const/16 v6, 0x15

    .line 384
    .line 385
    if-ne v0, v6, :cond_d

    .line 386
    .line 387
    goto :goto_6

    .line 388
    :cond_d
    const/16 v6, 0xe

    .line 389
    .line 390
    if-ne v0, v6, :cond_e

    .line 391
    .line 392
    const/16 v26, 0x88

    .line 393
    .line 394
    goto :goto_7

    .line 395
    :cond_e
    const/16 v6, 0x21

    .line 396
    .line 397
    if-ne v0, v6, :cond_9

    .line 398
    .line 399
    const/16 v26, 0x8b

    .line 400
    .line 401
    goto :goto_7

    .line 402
    :cond_f
    const/16 v6, 0x7b

    .line 403
    .line 404
    if-ne v0, v6, :cond_10

    .line 405
    .line 406
    const/16 v0, 0x8a

    .line 407
    .line 408
    move/from16 v26, v0

    .line 409
    .line 410
    goto :goto_7

    .line 411
    :cond_10
    const/16 v6, 0xa

    .line 412
    .line 413
    if-ne v0, v6, :cond_11

    .line 414
    .line 415
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 416
    .line 417
    const/4 v6, 0x3

    .line 418
    invoke-virtual {v1, v6, v0}, Lh1/w;->s(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    invoke-virtual {v1}, Lh1/w;->u()I

    .line 427
    .line 428
    .line 429
    move-result v6

    .line 430
    move-object/from16 v27, v0

    .line 431
    .line 432
    move/from16 v25, v4

    .line 433
    .line 434
    move/from16 v28, v6

    .line 435
    .line 436
    goto :goto_8

    .line 437
    :cond_11
    const/16 v6, 0x59

    .line 438
    .line 439
    if-ne v0, v6, :cond_13

    .line 440
    .line 441
    new-instance v0, Ljava/util/ArrayList;

    .line 442
    .line 443
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 444
    .line 445
    .line 446
    :goto_a
    iget v6, v1, Lh1/w;->b:I

    .line 447
    .line 448
    if-ge v6, v4, :cond_12

    .line 449
    .line 450
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 451
    .line 452
    move/from16 v25, v4

    .line 453
    .line 454
    const/4 v4, 0x3

    .line 455
    invoke-virtual {v1, v4, v6}, Lh1/w;->s(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v6

    .line 459
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v6

    .line 463
    invoke-virtual {v1}, Lh1/w;->u()I

    .line 464
    .line 465
    .line 466
    move-object/from16 v16, v14

    .line 467
    .line 468
    const/4 v4, 0x4

    .line 469
    new-array v14, v4, [B

    .line 470
    .line 471
    move/from16 v33, v9

    .line 472
    .line 473
    const/4 v9, 0x0

    .line 474
    invoke-virtual {v1, v14, v9, v4}, Lh1/w;->e([BII)V

    .line 475
    .line 476
    .line 477
    new-instance v9, Lt2/f0;

    .line 478
    .line 479
    invoke-direct {v9, v6, v14}, Lt2/f0;-><init>(Ljava/lang/String;[B)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    move-object/from16 v14, v16

    .line 486
    .line 487
    move/from16 v4, v25

    .line 488
    .line 489
    move/from16 v9, v33

    .line 490
    .line 491
    goto :goto_a

    .line 492
    :cond_12
    move/from16 v25, v4

    .line 493
    .line 494
    move/from16 v33, v9

    .line 495
    .line 496
    move-object/from16 v16, v14

    .line 497
    .line 498
    const/4 v4, 0x4

    .line 499
    move-object/from16 v29, v0

    .line 500
    .line 501
    const/16 v26, 0x59

    .line 502
    .line 503
    goto :goto_b

    .line 504
    :cond_13
    move/from16 v25, v4

    .line 505
    .line 506
    move/from16 v33, v9

    .line 507
    .line 508
    move-object/from16 v16, v14

    .line 509
    .line 510
    const/4 v4, 0x4

    .line 511
    const/16 v6, 0x6f

    .line 512
    .line 513
    if-ne v0, v6, :cond_14

    .line 514
    .line 515
    const/16 v0, 0x101

    .line 516
    .line 517
    move/from16 v26, v0

    .line 518
    .line 519
    :cond_14
    :goto_b
    iget v0, v1, Lh1/w;->b:I

    .line 520
    .line 521
    sub-int v0, v25, v0

    .line 522
    .line 523
    invoke-virtual {v1, v0}, Lh1/w;->H(I)V

    .line 524
    .line 525
    .line 526
    move-object/from16 v14, v16

    .line 527
    .line 528
    move-object/from16 v4, v31

    .line 529
    .line 530
    move-object/from16 v6, v32

    .line 531
    .line 532
    move/from16 v9, v33

    .line 533
    .line 534
    goto/16 :goto_4

    .line 535
    .line 536
    :cond_15
    move-object/from16 v31, v4

    .line 537
    .line 538
    goto/16 :goto_5

    .line 539
    .line 540
    :goto_c
    invoke-virtual {v1, v15}, Lh1/w;->G(I)V

    .line 541
    .line 542
    .line 543
    new-instance v25, Lh1/t;

    .line 544
    .line 545
    iget-object v0, v1, Lh1/w;->a:[B

    .line 546
    .line 547
    invoke-static {v0, v13, v15}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 548
    .line 549
    .line 550
    move-result-object v30

    .line 551
    invoke-direct/range {v25 .. v30}, Lh1/t;-><init>(ILjava/lang/String;ILjava/util/ArrayList;[B)V

    .line 552
    .line 553
    .line 554
    move-object/from16 v0, v25

    .line 555
    .line 556
    const/4 v6, 0x6

    .line 557
    if-eq v11, v6, :cond_16

    .line 558
    .line 559
    const/4 v6, 0x5

    .line 560
    if-ne v11, v6, :cond_17

    .line 561
    .line 562
    :cond_16
    move/from16 v11, v26

    .line 563
    .line 564
    :cond_17
    add-int/lit8 v17, v17, 0x5

    .line 565
    .line 566
    sub-int v6, v23, v17

    .line 567
    .line 568
    const/4 v15, 0x2

    .line 569
    if-ne v10, v15, :cond_18

    .line 570
    .line 571
    move v9, v11

    .line 572
    goto :goto_d

    .line 573
    :cond_18
    move v9, v12

    .line 574
    :goto_d
    invoke-virtual {v7, v9}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 575
    .line 576
    .line 577
    move-result v13

    .line 578
    if-eqz v13, :cond_19

    .line 579
    .line 580
    const/16 v13, 0x15

    .line 581
    .line 582
    goto :goto_f

    .line 583
    :cond_19
    const/16 v13, 0x15

    .line 584
    .line 585
    if-ne v10, v15, :cond_1a

    .line 586
    .line 587
    if-ne v11, v13, :cond_1a

    .line 588
    .line 589
    iget-object v0, v5, Lt2/e0;->r:Lt2/h0;

    .line 590
    .line 591
    goto :goto_e

    .line 592
    :cond_1a
    invoke-virtual {v8, v11, v0}, Lj0/i;->a(ILh1/t;)Lt2/h0;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    :goto_e
    if-ne v10, v15, :cond_1b

    .line 597
    .line 598
    const/16 v11, 0x2000

    .line 599
    .line 600
    invoke-virtual {v3, v9, v11}, Landroid/util/SparseIntArray;->get(II)I

    .line 601
    .line 602
    .line 603
    move-result v14

    .line 604
    if-ge v12, v14, :cond_1c

    .line 605
    .line 606
    :cond_1b
    invoke-virtual {v3, v9, v12}, Landroid/util/SparseIntArray;->put(II)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v2, v9, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 610
    .line 611
    .line 612
    :cond_1c
    :goto_f
    move v0, v6

    .line 613
    move v12, v13

    .line 614
    move-object/from16 v14, v16

    .line 615
    .line 616
    move-object/from16 v4, v31

    .line 617
    .line 618
    move-object/from16 v6, v32

    .line 619
    .line 620
    move/from16 v9, v33

    .line 621
    .line 622
    const/16 v13, 0x2000

    .line 623
    .line 624
    goto/16 :goto_3

    .line 625
    .line 626
    :cond_1d
    move-object/from16 v32, v6

    .line 627
    .line 628
    move/from16 v33, v9

    .line 629
    .line 630
    move-object/from16 v16, v14

    .line 631
    .line 632
    invoke-virtual {v3}, Landroid/util/SparseIntArray;->size()I

    .line 633
    .line 634
    .line 635
    move-result v0

    .line 636
    const/4 v13, 0x0

    .line 637
    :goto_10
    if-ge v13, v0, :cond_20

    .line 638
    .line 639
    invoke-virtual {v3, v13}, Landroid/util/SparseIntArray;->keyAt(I)I

    .line 640
    .line 641
    .line 642
    move-result v1

    .line 643
    invoke-virtual {v3, v13}, Landroid/util/SparseIntArray;->valueAt(I)I

    .line 644
    .line 645
    .line 646
    move-result v4

    .line 647
    const/4 v9, 0x1

    .line 648
    invoke-virtual {v7, v1, v9}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 649
    .line 650
    .line 651
    iget-object v6, v5, Lt2/e0;->j:Landroid/util/SparseBooleanArray;

    .line 652
    .line 653
    invoke-virtual {v6, v4, v9}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v2, v13}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v6

    .line 660
    check-cast v6, Lt2/h0;

    .line 661
    .line 662
    if-eqz v6, :cond_1f

    .line 663
    .line 664
    iget-object v8, v5, Lt2/e0;->r:Lt2/h0;

    .line 665
    .line 666
    if-eq v6, v8, :cond_1e

    .line 667
    .line 668
    iget-object v8, v5, Lt2/e0;->m:Ln1/p;

    .line 669
    .line 670
    new-instance v9, Lt2/g0;

    .line 671
    .line 672
    move/from16 v11, v33

    .line 673
    .line 674
    const/16 v12, 0x2000

    .line 675
    .line 676
    invoke-direct {v9, v11, v1, v12}, Lt2/g0;-><init>(III)V

    .line 677
    .line 678
    .line 679
    move-object/from16 v14, v16

    .line 680
    .line 681
    invoke-interface {v6, v14, v8, v9}, Lt2/h0;->b(Lh1/d0;Ln1/p;Lt2/g0;)V

    .line 682
    .line 683
    .line 684
    :goto_11
    move-object/from16 v1, v32

    .line 685
    .line 686
    goto :goto_12

    .line 687
    :cond_1e
    move-object/from16 v14, v16

    .line 688
    .line 689
    move/from16 v11, v33

    .line 690
    .line 691
    const/16 v12, 0x2000

    .line 692
    .line 693
    goto :goto_11

    .line 694
    :goto_12
    invoke-virtual {v1, v4, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 695
    .line 696
    .line 697
    goto :goto_13

    .line 698
    :cond_1f
    move-object/from16 v14, v16

    .line 699
    .line 700
    move-object/from16 v1, v32

    .line 701
    .line 702
    move/from16 v11, v33

    .line 703
    .line 704
    const/16 v12, 0x2000

    .line 705
    .line 706
    :goto_13
    add-int/lit8 v13, v13, 0x1

    .line 707
    .line 708
    move-object/from16 v32, v1

    .line 709
    .line 710
    move/from16 v33, v11

    .line 711
    .line 712
    move-object/from16 v16, v14

    .line 713
    .line 714
    goto :goto_10

    .line 715
    :cond_20
    move-object/from16 v1, v32

    .line 716
    .line 717
    const/4 v15, 0x2

    .line 718
    if-ne v10, v15, :cond_22

    .line 719
    .line 720
    iget-boolean v0, v5, Lt2/e0;->o:Z

    .line 721
    .line 722
    if-nez v0, :cond_21

    .line 723
    .line 724
    iget-object v0, v5, Lt2/e0;->m:Ln1/p;

    .line 725
    .line 726
    invoke-interface {v0}, Ln1/p;->endTracks()V

    .line 727
    .line 728
    .line 729
    const/4 v9, 0x0

    .line 730
    iput v9, v5, Lt2/e0;->n:I

    .line 731
    .line 732
    const/4 v0, 0x1

    .line 733
    iput-boolean v0, v5, Lt2/e0;->o:Z

    .line 734
    .line 735
    return-void

    .line 736
    :cond_21
    move-object/from16 v2, p0

    .line 737
    .line 738
    goto :goto_15

    .line 739
    :cond_22
    move-object/from16 v2, p0

    .line 740
    .line 741
    const/4 v0, 0x1

    .line 742
    const/4 v9, 0x0

    .line 743
    iget v3, v2, Li2/j;->k:I

    .line 744
    .line 745
    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->remove(I)V

    .line 746
    .line 747
    .line 748
    if-ne v10, v0, :cond_23

    .line 749
    .line 750
    move v11, v9

    .line 751
    goto :goto_14

    .line 752
    :cond_23
    iget v1, v5, Lt2/e0;->n:I

    .line 753
    .line 754
    add-int/lit8 v11, v1, -0x1

    .line 755
    .line 756
    :goto_14
    iput v11, v5, Lt2/e0;->n:I

    .line 757
    .line 758
    if-nez v11, :cond_24

    .line 759
    .line 760
    iget-object v1, v5, Lt2/e0;->m:Ln1/p;

    .line 761
    .line 762
    invoke-interface {v1}, Ln1/p;->endTracks()V

    .line 763
    .line 764
    .line 765
    iput-boolean v0, v5, Lt2/e0;->o:Z

    .line 766
    .line 767
    :cond_24
    :goto_15
    return-void
.end method

.method public b(Lh1/d0;Ln1/p;Lt2/g0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Landroid/view/View;IZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Li2/j;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz2/w;

    .line 4
    .line 5
    iget-object v0, v0, Lz2/w;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    if-gez p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0, p2}, Li2/j;->h(I)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    :goto_0
    iget-object v1, p0, Li2/j;->m:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lv1/c;

    .line 21
    .line 22
    invoke-virtual {v1, p2, p3}, Lv1/c;->n(IZ)V

    .line 23
    .line 24
    .line 25
    if-eqz p3, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Li2/j;->k(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Lz2/v0;

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public d(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Li2/j;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz2/w;

    .line 4
    .line 5
    iget-object v0, v0, Lz2/w;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    if-gez p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0, p2}, Li2/j;->h(I)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    :goto_0
    iget-object v1, p0, Li2/j;->m:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lv1/c;

    .line 21
    .line 22
    invoke-virtual {v1, p2, p4}, Lv1/c;->n(IZ)V

    .line 23
    .line 24
    .line 25
    if-eqz p4, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Li2/j;->k(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Lz2/v0;

    .line 31
    .line 32
    .line 33
    move-result-object p4

    .line 34
    if-eqz p4, :cond_5

    .line 35
    .line 36
    invoke-virtual {p4}, Lz2/v0;->j()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_3

    .line 41
    .line 42
    invoke-virtual {p4}, Lz2/v0;->o()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 50
    .line 51
    new-instance p2, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string p3, "Called attach on a child which is not detached: "

    .line 54
    .line 55
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-static {v0, p2}, La1/a1;->i(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_3
    :goto_1
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->J0:Z

    .line 70
    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    new-instance v1, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-string v2, "reAttach "

    .line 76
    .line 77
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    const-string v2, "RecyclerView"

    .line 88
    .line 89
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    :cond_4
    iget v1, p4, Lz2/v0;->j:I

    .line 93
    .line 94
    and-int/lit16 v1, v1, -0x101

    .line 95
    .line 96
    iput v1, p4, Lz2/v0;->j:I

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_5
    sget-boolean p4, Landroidx/recyclerview/widget/RecyclerView;->I0:Z

    .line 100
    .line 101
    if-nez p4, :cond_6

    .line 102
    .line 103
    :goto_2
    invoke-static {v0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->a(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_6
    new-instance p3, Ljava/lang/IllegalArgumentException;

    .line 108
    .line 109
    new-instance p4, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    const-string v1, "No ViewHolder found for child: "

    .line 112
    .line 113
    invoke-direct {p4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string p1, ", index: "

    .line 120
    .line 121
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-static {v0, p4}, La1/a1;->i(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw p3
.end method

.method public e(I)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Li2/j;->h(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, Li2/j;->m:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lv1/c;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lv1/c;->o(I)Z

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Li2/j;->l:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lz2/w;

    .line 15
    .line 16
    iget-object v0, v0, Lz2/w;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Lz2/v0;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_4

    .line 29
    .line 30
    invoke-virtual {v1}, Lz2/v0;->j()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1}, Lz2/v0;->o()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    new-instance v2, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v3, "called detach on an already detached child "

    .line 48
    .line 49
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v2}, La1/a1;->i(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_1
    :goto_0
    sget-boolean v2, Landroidx/recyclerview/widget/RecyclerView;->J0:Z

    .line 64
    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    new-instance v2, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v3, "tmpDetach "

    .line 70
    .line 71
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    const-string v3, "RecyclerView"

    .line 82
    .line 83
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    :cond_2
    const/16 v2, 0x100

    .line 87
    .line 88
    invoke-virtual {v1, v2}, Lz2/v0;->a(I)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->I0:Z

    .line 93
    .line 94
    if-nez v1, :cond_5

    .line 95
    .line 96
    :cond_4
    :goto_1
    invoke-static {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->b(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 101
    .line 102
    new-instance v2, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v3, "No view at offset "

    .line 105
    .line 106
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-static {v0, v2}, La1/a1;->i(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v1
.end method

.method public f(I)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Li2/j;->h(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, Li2/j;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lz2/w;

    .line 8
    .line 9
    iget-object v0, v0, Lz2/w;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public g()I
    .locals 2

    .line 1
    iget-object v0, p0, Li2/j;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz2/w;

    .line 4
    .line 5
    iget-object v0, v0, Lz2/w;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Li2/j;->n:Ljava/lang/Cloneable;

    .line 12
    .line 13
    check-cast v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    sub-int/2addr v0, v1

    .line 20
    return v0
.end method

.method public h(I)I
    .locals 5

    .line 1
    iget-object v0, p0, Li2/j;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv1/c;

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    if-gez p1, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v2, p0, Li2/j;->l:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lz2/w;

    .line 12
    .line 13
    iget-object v2, v2, Lz2/w;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    move v3, p1

    .line 20
    :goto_0
    if-ge v3, v2, :cond_3

    .line 21
    .line 22
    invoke-virtual {v0, v3}, Lv1/c;->k(I)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    sub-int v4, v3, v4

    .line 27
    .line 28
    sub-int v4, p1, v4

    .line 29
    .line 30
    if-nez v4, :cond_2

    .line 31
    .line 32
    :goto_1
    invoke-virtual {v0, v3}, Lv1/c;->m(I)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    return v3

    .line 42
    :cond_2
    add-int/2addr v3, v4

    .line 43
    goto :goto_0

    .line 44
    :cond_3
    return v1
.end method

.method public i(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Li2/j;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz2/w;

    .line 4
    .line 5
    iget-object v0, v0, Lz2/w;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public j()I
    .locals 1

    .line 1
    iget-object v0, p0, Li2/j;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz2/w;

    .line 4
    .line 5
    iget-object v0, v0, Lz2/w;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public k(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Li2/j;->n:Ljava/lang/Cloneable;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Li2/j;->l:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lz2/w;

    .line 11
    .line 12
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Lz2/v0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    iget-object v1, p1, Lz2/v0;->a:Landroid/view/View;

    .line 19
    .line 20
    iget-object v0, v0, Lz2/w;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 21
    .line 22
    iget v2, p1, Lz2/v0;->q:I

    .line 23
    .line 24
    const/4 v3, -0x1

    .line 25
    if-eq v2, v3, :cond_0

    .line 26
    .line 27
    iput v2, p1, Lz2/v0;->p:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object v2, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/view/View;->getImportantForAccessibility()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    iput v2, p1, Lz2/v0;->p:I

    .line 37
    .line 38
    :goto_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->P()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const/4 v3, 0x4

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    iput v3, p1, Lz2/v0;->q:I

    .line 46
    .line 47
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->C0:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    sget-object p1, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 54
    .line 55
    invoke-virtual {v1, v3}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 56
    .line 57
    .line 58
    :cond_2
    return-void
.end method

.method public l(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Li2/j;->n:Ljava/lang/Cloneable;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Li2/j;->l:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lz2/w;

    .line 14
    .line 15
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Lz2/v0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iget-object v0, v0, Lz2/w;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 22
    .line 23
    iget v1, p1, Lz2/v0;->p:I

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->P()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    iput v1, p1, Lz2/v0;->q:I

    .line 32
    .line 33
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->C0:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object v0, p1, Lz2/v0;->a:Landroid/view/View;

    .line 40
    .line 41
    sget-object v2, Lm0/m0;->a:Ljava/util/WeakHashMap;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 44
    .line 45
    .line 46
    :goto_0
    const/4 v0, 0x0

    .line 47
    iput v0, p1, Lz2/v0;->p:I

    .line 48
    .line 49
    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Li2/j;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Li2/j;->m:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lv1/c;

    .line 19
    .line 20
    invoke-virtual {v1}, Lv1/c;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ", hidden list:"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Li2/j;->n:Ljava/lang/Cloneable;

    .line 33
    .line 34
    check-cast v1, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
