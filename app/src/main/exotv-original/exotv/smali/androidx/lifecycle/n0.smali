.class public final Landroidx/lifecycle/n0;
.super Lz6/i;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/a;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/lifecycle/n0;->j:I

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/lifecycle/n0;->k:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lz6/i;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Landroidx/lifecycle/n0;->j:I

    .line 4
    .line 5
    iget-object v2, v1, Landroidx/lifecycle/n0;->k:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, Lw7/f;

    .line 11
    .line 12
    iget-object v0, v2, Lw7/f;->b:Ljava/lang/ClassLoader;

    .line 13
    .line 14
    iget-object v2, v2, Lw7/f;->c:Lv7/p;

    .line 15
    .line 16
    const-string v3, ""

    .line 17
    .line 18
    invoke-virtual {v0, v3}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const-string v4, "getResources(...)"

    .line 23
    .line 24
    invoke-static {v4, v3}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v3}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const-string v5, "list(...)"

    .line 32
    .line 33
    invoke-static {v5, v3}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    new-instance v6, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    const/4 v8, 0x0

    .line 46
    move v9, v8

    .line 47
    :cond_0
    :goto_0
    if-ge v9, v7, :cond_2

    .line 48
    .line 49
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v11

    .line 53
    add-int/lit8 v9, v9, 0x1

    .line 54
    .line 55
    check-cast v11, Ljava/net/URL;

    .line 56
    .line 57
    invoke-static {v11}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v11}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    const-string v13, "file"

    .line 65
    .line 66
    invoke-static {v12, v13}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v12

    .line 70
    if-nez v12, :cond_1

    .line 71
    .line 72
    const/4 v10, 0x0

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    sget-object v10, Lv7/b0;->k:Ljava/lang/String;

    .line 75
    .line 76
    new-instance v10, Ljava/io/File;

    .line 77
    .line 78
    invoke-virtual {v11}, Ljava/net/URL;->toURI()Ljava/net/URI;

    .line 79
    .line 80
    .line 81
    move-result-object v11

    .line 82
    invoke-direct {v10, v11}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    .line 83
    .line 84
    .line 85
    invoke-static {v10}, Lv7/a0;->e(Ljava/io/File;)Lv7/b0;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    new-instance v11, Ll6/d;

    .line 90
    .line 91
    invoke-direct {v11, v2, v10}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    move-object v10, v11

    .line 95
    :goto_1
    if-eqz v10, :cond_0

    .line 96
    .line 97
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    const-string v3, "META-INF/MANIFEST.MF"

    .line 102
    .line 103
    invoke-virtual {v0, v3}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-static {v4, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v0}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-static {v5, v3}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    new-instance v4, Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    move v0, v8

    .line 127
    :goto_2
    if-ge v0, v5, :cond_17

    .line 128
    .line 129
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    add-int/lit8 v9, v0, 0x1

    .line 134
    .line 135
    check-cast v7, Ljava/net/URL;

    .line 136
    .line 137
    invoke-static {v7}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v7}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const-string v7, "toString(...)"

    .line 145
    .line 146
    invoke-static {v7, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    const-string v7, "jar:file:"

    .line 150
    .line 151
    invoke-static {v0, v7, v8}, Lh7/p;->t0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 152
    .line 153
    .line 154
    move-result v7

    .line 155
    if-nez v7, :cond_3

    .line 156
    .line 157
    :goto_3
    move/from16 v18, v9

    .line 158
    .line 159
    const/4 v7, 0x0

    .line 160
    goto/16 :goto_16

    .line 161
    .line 162
    :cond_3
    const/4 v7, 0x6

    .line 163
    and-int/lit8 v7, v7, 0x2

    .line 164
    .line 165
    if-eqz v7, :cond_4

    .line 166
    .line 167
    invoke-static {v0}, Lh7/h;->x0(Ljava/lang/CharSequence;)I

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    goto :goto_4

    .line 172
    :cond_4
    move v7, v8

    .line 173
    :goto_4
    const-string v11, "<this>"

    .line 174
    .line 175
    invoke-static {v11, v0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    const-string v11, "string"

    .line 179
    .line 180
    const-string v12, "!"

    .line 181
    .line 182
    invoke-static {v11, v12}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v12, v7}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;I)I

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    const/4 v11, -0x1

    .line 190
    if-ne v7, v11, :cond_5

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_5
    sget-object v11, Lv7/b0;->k:Ljava/lang/String;

    .line 194
    .line 195
    new-instance v11, Ljava/io/File;

    .line 196
    .line 197
    const/4 v12, 0x4

    .line 198
    invoke-virtual {v0, v12, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    const-string v7, "substring(...)"

    .line 203
    .line 204
    invoke-static {v7, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    invoke-static {v0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-direct {v11, v0}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    .line 212
    .line 213
    .line 214
    invoke-static {v11}, Lv7/a0;->e(Ljava/io/File;)Lv7/b0;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    const-string v0, "not a zip: size="

    .line 219
    .line 220
    invoke-virtual {v2, v7}, Lv7/p;->j(Lv7/b0;)Lv7/v;

    .line 221
    .line 222
    .line 223
    move-result-object v11

    .line 224
    :try_start_0
    invoke-virtual {v11}, Lv7/v;->size()J

    .line 225
    .line 226
    .line 227
    move-result-wide v12

    .line 228
    const/16 v14, 0x16

    .line 229
    .line 230
    int-to-long v14, v14

    .line 231
    sub-long/2addr v12, v14

    .line 232
    const-wide/16 v14, 0x0

    .line 233
    .line 234
    cmp-long v16, v12, v14

    .line 235
    .line 236
    if-ltz v16, :cond_15

    .line 237
    .line 238
    const-wide/32 v16, 0x10000

    .line 239
    .line 240
    .line 241
    move/from16 v18, v9

    .line 242
    .line 243
    sub-long v8, v12, v16

    .line 244
    .line 245
    invoke-static {v8, v9, v14, v15}, Ljava/lang/Math;->max(JJ)J

    .line 246
    .line 247
    .line 248
    move-result-wide v8

    .line 249
    :goto_5
    invoke-virtual {v11, v12, v13}, Lv7/v;->b(J)Lv7/o;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-static {v0}, Lv7/b;->c(Lv7/k0;)Lv7/e0;

    .line 254
    .line 255
    .line 256
    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 257
    :try_start_1
    invoke-virtual {v10}, Lv7/e0;->c()I

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    move-wide/from16 v19, v14

    .line 262
    .line 263
    const v14, 0x6054b50

    .line 264
    .line 265
    .line 266
    if-ne v0, v14, :cond_13

    .line 267
    .line 268
    invoke-virtual {v10}, Lv7/e0;->k()S

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    const v8, 0xffff

    .line 273
    .line 274
    .line 275
    and-int/2addr v0, v8

    .line 276
    invoke-virtual {v10}, Lv7/e0;->k()S

    .line 277
    .line 278
    .line 279
    move-result v9

    .line 280
    and-int/2addr v9, v8

    .line 281
    invoke-virtual {v10}, Lv7/e0;->k()S

    .line 282
    .line 283
    .line 284
    move-result v14

    .line 285
    and-int/2addr v14, v8

    .line 286
    int-to-long v14, v14

    .line 287
    invoke-virtual {v10}, Lv7/e0;->k()S

    .line 288
    .line 289
    .line 290
    move-result v17
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_c

    .line 291
    move/from16 v21, v8

    .line 292
    .line 293
    and-int v8, v17, v21

    .line 294
    .line 295
    move/from16 v17, v0

    .line 296
    .line 297
    int-to-long v0, v8

    .line 298
    cmp-long v0, v14, v0

    .line 299
    .line 300
    const-string v1, "unsupported zip: spanned"

    .line 301
    .line 302
    if-nez v0, :cond_12

    .line 303
    .line 304
    if-nez v17, :cond_12

    .line 305
    .line 306
    if-nez v9, :cond_12

    .line 307
    .line 308
    const-wide/16 v8, 0x4

    .line 309
    .line 310
    :try_start_2
    invoke-virtual {v10, v8, v9}, Lv7/e0;->skip(J)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v10}, Lv7/e0;->c()I

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    int-to-long v8, v0

    .line 318
    const-wide v22, 0xffffffffL

    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    and-long v25, v8, v22

    .line 324
    .line 325
    invoke-virtual {v10}, Lv7/e0;->k()S

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    and-int v22, v0, v21

    .line 330
    .line 331
    new-instance v21, Lw7/d;

    .line 332
    .line 333
    move-wide/from16 v23, v14

    .line 334
    .line 335
    invoke-direct/range {v21 .. v26}, Lw7/d;-><init>(IJJ)V

    .line 336
    .line 337
    .line 338
    move/from16 v0, v22

    .line 339
    .line 340
    int-to-long v8, v0

    .line 341
    invoke-virtual {v10, v8, v9}, Lv7/e0;->p(J)Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_c

    .line 342
    .line 343
    .line 344
    :try_start_3
    invoke-virtual {v10}, Lv7/e0;->close()V

    .line 345
    .line 346
    .line 347
    const/16 v8, 0x14

    .line 348
    .line 349
    int-to-long v8, v8

    .line 350
    sub-long/2addr v12, v8

    .line 351
    cmp-long v8, v12, v19

    .line 352
    .line 353
    if-lez v8, :cond_b

    .line 354
    .line 355
    invoke-virtual {v11, v12, v13}, Lv7/v;->b(J)Lv7/o;

    .line 356
    .line 357
    .line 358
    move-result-object v8

    .line 359
    invoke-static {v8}, Lv7/b;->c(Lv7/k0;)Lv7/e0;

    .line 360
    .line 361
    .line 362
    move-result-object v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    .line 363
    :try_start_4
    invoke-virtual {v8}, Lv7/e0;->c()I

    .line 364
    .line 365
    .line 366
    move-result v9

    .line 367
    const v10, 0x7064b50

    .line 368
    .line 369
    .line 370
    if-ne v9, v10, :cond_a

    .line 371
    .line 372
    invoke-virtual {v8}, Lv7/e0;->c()I

    .line 373
    .line 374
    .line 375
    move-result v9

    .line 376
    invoke-virtual {v8}, Lv7/e0;->g()J

    .line 377
    .line 378
    .line 379
    move-result-wide v12

    .line 380
    invoke-virtual {v8}, Lv7/e0;->c()I

    .line 381
    .line 382
    .line 383
    move-result v10

    .line 384
    const/4 v14, 0x1

    .line 385
    if-ne v10, v14, :cond_9

    .line 386
    .line 387
    if-nez v9, :cond_9

    .line 388
    .line 389
    invoke-virtual {v11, v12, v13}, Lv7/v;->b(J)Lv7/o;

    .line 390
    .line 391
    .line 392
    move-result-object v9

    .line 393
    invoke-static {v9}, Lv7/b;->c(Lv7/k0;)Lv7/e0;

    .line 394
    .line 395
    .line 396
    move-result-object v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 397
    :try_start_5
    invoke-virtual {v9}, Lv7/e0;->c()I

    .line 398
    .line 399
    .line 400
    move-result v10

    .line 401
    const v12, 0x6064b50

    .line 402
    .line 403
    .line 404
    if-ne v10, v12, :cond_7

    .line 405
    .line 406
    const-wide/16 v12, 0xc

    .line 407
    .line 408
    invoke-virtual {v9, v12, v13}, Lv7/e0;->skip(J)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v9}, Lv7/e0;->c()I

    .line 412
    .line 413
    .line 414
    move-result v10

    .line 415
    invoke-virtual {v9}, Lv7/e0;->c()I

    .line 416
    .line 417
    .line 418
    move-result v12

    .line 419
    invoke-virtual {v9}, Lv7/e0;->g()J

    .line 420
    .line 421
    .line 422
    move-result-wide v29

    .line 423
    invoke-virtual {v9}, Lv7/e0;->g()J

    .line 424
    .line 425
    .line 426
    move-result-wide v13

    .line 427
    cmp-long v13, v29, v13

    .line 428
    .line 429
    if-nez v13, :cond_6

    .line 430
    .line 431
    if-nez v10, :cond_6

    .line 432
    .line 433
    if-nez v12, :cond_6

    .line 434
    .line 435
    const-wide/16 v12, 0x8

    .line 436
    .line 437
    invoke-virtual {v9, v12, v13}, Lv7/e0;->skip(J)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v9}, Lv7/e0;->g()J

    .line 441
    .line 442
    .line 443
    move-result-wide v31

    .line 444
    new-instance v27, Lw7/d;

    .line 445
    .line 446
    move/from16 v28, v0

    .line 447
    .line 448
    invoke-direct/range {v27 .. v32}, Lw7/d;-><init>(IJJ)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 449
    .line 450
    .line 451
    :try_start_6
    invoke-virtual {v9}, Lv7/e0;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 452
    .line 453
    .line 454
    const/4 v0, 0x0

    .line 455
    goto :goto_6

    .line 456
    :catchall_0
    move-exception v0

    .line 457
    :goto_6
    move-object/from16 v21, v27

    .line 458
    .line 459
    goto :goto_a

    .line 460
    :cond_6
    :try_start_7
    new-instance v0, Ljava/io/IOException;

    .line 461
    .line 462
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    throw v0

    .line 466
    :goto_7
    move-object v1, v0

    .line 467
    goto :goto_8

    .line 468
    :cond_7
    new-instance v0, Ljava/io/IOException;

    .line 469
    .line 470
    new-instance v1, Ljava/lang/StringBuilder;

    .line 471
    .line 472
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 473
    .line 474
    .line 475
    const-string v13, "bad zip: expected "

    .line 476
    .line 477
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    .line 480
    invoke-static {v12}, Lw7/b;->c(I)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v12

    .line 484
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 485
    .line 486
    .line 487
    const-string v12, " but was "

    .line 488
    .line 489
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    invoke-static {v10}, Lw7/b;->c(I)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v10

    .line 496
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 507
    :catchall_1
    move-exception v0

    .line 508
    goto :goto_7

    .line 509
    :goto_8
    :try_start_8
    invoke-virtual {v9}, Lv7/e0;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 510
    .line 511
    .line 512
    goto :goto_9

    .line 513
    :catchall_2
    move-exception v0

    .line 514
    :try_start_9
    invoke-static {v1, v0}, Lcom/bumptech/glide/d;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 515
    .line 516
    .line 517
    :goto_9
    move-object v0, v1

    .line 518
    :goto_a
    if-nez v0, :cond_8

    .line 519
    .line 520
    goto :goto_b

    .line 521
    :cond_8
    throw v0

    .line 522
    :catchall_3
    move-exception v0

    .line 523
    move-object v1, v0

    .line 524
    goto :goto_c

    .line 525
    :cond_9
    new-instance v0, Ljava/io/IOException;

    .line 526
    .line 527
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 531
    :cond_a
    :goto_b
    :try_start_a
    invoke-virtual {v8}, Lv7/e0;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 532
    .line 533
    .line 534
    const/4 v0, 0x0

    .line 535
    goto :goto_e

    .line 536
    :catchall_4
    move-exception v0

    .line 537
    goto :goto_e

    .line 538
    :goto_c
    :try_start_b
    invoke-virtual {v8}, Lv7/e0;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 539
    .line 540
    .line 541
    goto :goto_d

    .line 542
    :catchall_5
    move-exception v0

    .line 543
    :try_start_c
    invoke-static {v1, v0}, Lcom/bumptech/glide/d;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 544
    .line 545
    .line 546
    :goto_d
    move-object v0, v1

    .line 547
    :goto_e
    if-nez v0, :cond_c

    .line 548
    .line 549
    :cond_b
    move-object/from16 v0, v21

    .line 550
    .line 551
    goto :goto_f

    .line 552
    :cond_c
    throw v0

    .line 553
    :catchall_6
    move-exception v0

    .line 554
    move-object v1, v0

    .line 555
    goto/16 :goto_18

    .line 556
    .line 557
    :goto_f
    new-instance v1, Ljava/util/ArrayList;

    .line 558
    .line 559
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 560
    .line 561
    .line 562
    iget-wide v8, v0, Lw7/d;->b:J

    .line 563
    .line 564
    invoke-virtual {v11, v8, v9}, Lv7/v;->b(J)Lv7/o;

    .line 565
    .line 566
    .line 567
    move-result-object v8

    .line 568
    invoke-static {v8}, Lv7/b;->c(Lv7/k0;)Lv7/e0;

    .line 569
    .line 570
    .line 571
    move-result-object v8
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 572
    :try_start_d
    iget-wide v9, v0, Lw7/d;->a:J

    .line 573
    .line 574
    move-wide/from16 v14, v19

    .line 575
    .line 576
    :goto_10
    cmp-long v12, v14, v9

    .line 577
    .line 578
    if-gez v12, :cond_f

    .line 579
    .line 580
    invoke-static {v8}, Lw7/b;->d(Lv7/e0;)Lw7/g;

    .line 581
    .line 582
    .line 583
    move-result-object v12
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 584
    move-object v13, v8

    .line 585
    move-wide/from16 v21, v9

    .line 586
    .line 587
    :try_start_e
    iget-wide v8, v12, Lw7/g;->h:J

    .line 588
    .line 589
    move-wide/from16 v19, v8

    .line 590
    .line 591
    iget-wide v8, v0, Lw7/d;->b:J

    .line 592
    .line 593
    cmp-long v8, v19, v8

    .line 594
    .line 595
    if-gez v8, :cond_e

    .line 596
    .line 597
    sget-object v8, Lw7/f;->e:Lv7/b0;

    .line 598
    .line 599
    iget-object v8, v12, Lw7/g;->a:Lv7/b0;

    .line 600
    .line 601
    invoke-static {v8}, Lv7/a0;->b(Lv7/b0;)Z

    .line 602
    .line 603
    .line 604
    move-result v8

    .line 605
    if-eqz v8, :cond_d

    .line 606
    .line 607
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 608
    .line 609
    .line 610
    goto :goto_12

    .line 611
    :catchall_7
    move-exception v0

    .line 612
    :goto_11
    move-object v8, v0

    .line 613
    goto :goto_13

    .line 614
    :cond_d
    :goto_12
    const-wide/16 v8, 0x1

    .line 615
    .line 616
    add-long/2addr v14, v8

    .line 617
    move-object v8, v13

    .line 618
    move-wide/from16 v9, v21

    .line 619
    .line 620
    goto :goto_10

    .line 621
    :cond_e
    new-instance v0, Ljava/io/IOException;

    .line 622
    .line 623
    const-string v8, "bad zip: local file header offset >= central directory offset"

    .line 624
    .line 625
    invoke-direct {v0, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 626
    .line 627
    .line 628
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .line 629
    :catchall_8
    move-exception v0

    .line 630
    move-object v13, v8

    .line 631
    goto :goto_11

    .line 632
    :cond_f
    move-object v13, v8

    .line 633
    :try_start_f
    invoke-virtual {v13}, Lv7/e0;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    .line 634
    .line 635
    .line 636
    const/4 v0, 0x0

    .line 637
    goto :goto_15

    .line 638
    :catchall_9
    move-exception v0

    .line 639
    goto :goto_15

    .line 640
    :goto_13
    :try_start_10
    invoke-virtual {v13}, Lv7/e0;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    .line 641
    .line 642
    .line 643
    goto :goto_14

    .line 644
    :catchall_a
    move-exception v0

    .line 645
    :try_start_11
    invoke-static {v8, v0}, Lcom/bumptech/glide/d;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 646
    .line 647
    .line 648
    :goto_14
    move-object v0, v8

    .line 649
    :goto_15
    if-nez v0, :cond_11

    .line 650
    .line 651
    invoke-static {v1}, Lw7/b;->b(Ljava/util/ArrayList;)Ljava/util/LinkedHashMap;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    new-instance v1, Lv7/o0;

    .line 656
    .line 657
    invoke-direct {v1, v7, v2, v0}, Lv7/o0;-><init>(Lv7/b0;Lv7/p;Ljava/util/LinkedHashMap;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    .line 658
    .line 659
    .line 660
    :try_start_12
    invoke-virtual {v11}, Lv7/v;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_b

    .line 661
    .line 662
    .line 663
    :catchall_b
    sget-object v0, Lw7/f;->e:Lv7/b0;

    .line 664
    .line 665
    new-instance v7, Ll6/d;

    .line 666
    .line 667
    invoke-direct {v7, v1, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 668
    .line 669
    .line 670
    :goto_16
    if-eqz v7, :cond_10

    .line 671
    .line 672
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 673
    .line 674
    .line 675
    :cond_10
    move-object/from16 v1, p0

    .line 676
    .line 677
    move/from16 v0, v18

    .line 678
    .line 679
    const/4 v8, 0x0

    .line 680
    goto/16 :goto_2

    .line 681
    .line 682
    :cond_11
    :try_start_13
    throw v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    .line 683
    :catchall_c
    move-exception v0

    .line 684
    goto :goto_17

    .line 685
    :cond_12
    :try_start_14
    new-instance v0, Ljava/io/IOException;

    .line 686
    .line 687
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    throw v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_c

    .line 691
    :cond_13
    :try_start_15
    invoke-virtual {v10}, Lv7/e0;->close()V

    .line 692
    .line 693
    .line 694
    const-wide/16 v0, -0x1

    .line 695
    .line 696
    add-long/2addr v12, v0

    .line 697
    cmp-long v0, v12, v8

    .line 698
    .line 699
    if-ltz v0, :cond_14

    .line 700
    .line 701
    move-object/from16 v1, p0

    .line 702
    .line 703
    move-wide/from16 v14, v19

    .line 704
    .line 705
    goto/16 :goto_5

    .line 706
    .line 707
    :cond_14
    new-instance v0, Ljava/io/IOException;

    .line 708
    .line 709
    const-string v1, "not a zip: end of central directory signature not found"

    .line 710
    .line 711
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    throw v0

    .line 715
    :goto_17
    invoke-virtual {v10}, Lv7/e0;->close()V

    .line 716
    .line 717
    .line 718
    throw v0

    .line 719
    :cond_15
    new-instance v1, Ljava/io/IOException;

    .line 720
    .line 721
    new-instance v2, Ljava/lang/StringBuilder;

    .line 722
    .line 723
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 724
    .line 725
    .line 726
    invoke-virtual {v11}, Lv7/v;->size()J

    .line 727
    .line 728
    .line 729
    move-result-wide v3

    .line 730
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 731
    .line 732
    .line 733
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v0

    .line 737
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 738
    .line 739
    .line 740
    throw v1
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_6

    .line 741
    :goto_18
    if-eqz v11, :cond_16

    .line 742
    .line 743
    :try_start_16
    invoke-virtual {v11}, Lv7/v;->close()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_d

    .line 744
    .line 745
    .line 746
    goto :goto_19

    .line 747
    :catchall_d
    move-exception v0

    .line 748
    invoke-static {v1, v0}, Lcom/bumptech/glide/d;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 749
    .line 750
    .line 751
    :cond_16
    :goto_19
    throw v1

    .line 752
    :cond_17
    invoke-static {v6, v4}, Lm6/h;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    return-object v0

    .line 757
    :pswitch_0
    check-cast v2, Landroidx/lifecycle/u0;

    .line 758
    .line 759
    invoke-static {v2}, Landroidx/lifecycle/m0;->f(Landroidx/lifecycle/u0;)Landroidx/lifecycle/p0;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    return-object v0

    .line 764
    nop

    .line 765
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
