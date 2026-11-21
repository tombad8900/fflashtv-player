.class public final Lv1/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/n;


# instance fields
.field public final a:Lh1/w;

.field public b:Ln1/p;

.field public c:I

.field public d:I

.field public e:I

.field public f:J

.field public g:Lc2/a;

.field public h:Ln1/o;

.field public i:Lv1/c;

.field public j:Lh2/m;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lh1/w;

    .line 5
    .line 6
    const/4 v1, 0x6

    .line 7
    invoke-direct {v0, v1}, Lh1/w;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lv1/a;->a:Lh1/w;

    .line 11
    .line 12
    const-wide/16 v0, -0x1

    .line 13
    .line 14
    iput-wide v0, p0, Lv1/a;->f:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lv1/a;->b:Ln1/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Ln1/p;->endTracks()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lv1/a;->b:Ln1/p;

    .line 10
    .line 11
    new-instance v1, Ln1/s;

    .line 12
    .line 13
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2, v3}, Ln1/s;-><init>(J)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v1}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x6

    .line 25
    iput v0, p0, Lv1/a;->c:I

    .line 26
    .line 27
    return-void
.end method

.method public final init(Ln1/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv1/a;->b:Ln1/p;

    .line 2
    .line 3
    return-void
.end method

.method public final read(Ln1/o;Ln1/a0;)I
    .locals 25

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
    iget v3, v0, Lv1/a;->c:I

    .line 8
    .line 9
    const-wide/16 v4, -0x1

    .line 10
    .line 11
    iget-object v6, v0, Lv1/a;->a:Lh1/w;

    .line 12
    .line 13
    const/4 v7, 0x4

    .line 14
    const/4 v8, 0x2

    .line 15
    const/4 v9, 0x1

    .line 16
    const/4 v10, 0x0

    .line 17
    if-eqz v3, :cond_17

    .line 18
    .line 19
    if-eq v3, v9, :cond_16

    .line 20
    .line 21
    if-eq v3, v8, :cond_a

    .line 22
    .line 23
    const/4 v4, 0x5

    .line 24
    if-eq v3, v7, :cond_5

    .line 25
    .line 26
    if-eq v3, v4, :cond_1

    .line 27
    .line 28
    const/4 v1, 0x6

    .line 29
    if-ne v3, v1, :cond_0

    .line 30
    .line 31
    const/4 v1, -0x1

    .line 32
    return v1

    .line 33
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 36
    .line 37
    .line 38
    throw v1

    .line 39
    :cond_1
    iget-object v3, v0, Lv1/a;->i:Lv1/c;

    .line 40
    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    iget-object v3, v0, Lv1/a;->h:Ln1/o;

    .line 44
    .line 45
    if-eq v1, v3, :cond_3

    .line 46
    .line 47
    :cond_2
    iput-object v1, v0, Lv1/a;->h:Ln1/o;

    .line 48
    .line 49
    new-instance v3, Lv1/c;

    .line 50
    .line 51
    iget-wide v4, v0, Lv1/a;->f:J

    .line 52
    .line 53
    invoke-direct {v3, v1, v4, v5}, Lv1/c;-><init>(Ln1/o;J)V

    .line 54
    .line 55
    .line 56
    iput-object v3, v0, Lv1/a;->i:Lv1/c;

    .line 57
    .line 58
    :cond_3
    iget-object v1, v0, Lv1/a;->j:Lh2/m;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object v3, v0, Lv1/a;->i:Lv1/c;

    .line 64
    .line 65
    invoke-virtual {v1, v3, v2}, Lh2/m;->read(Ln1/o;Ln1/a0;)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-ne v1, v9, :cond_4

    .line 70
    .line 71
    iget-wide v3, v2, Ln1/a0;->a:J

    .line 72
    .line 73
    iget-wide v5, v0, Lv1/a;->f:J

    .line 74
    .line 75
    add-long/2addr v3, v5

    .line 76
    iput-wide v3, v2, Ln1/a0;->a:J

    .line 77
    .line 78
    :cond_4
    return v1

    .line 79
    :cond_5
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 80
    .line 81
    .line 82
    move-result-wide v11

    .line 83
    iget-wide v13, v0, Lv1/a;->f:J

    .line 84
    .line 85
    cmp-long v3, v11, v13

    .line 86
    .line 87
    if-eqz v3, :cond_6

    .line 88
    .line 89
    iput-wide v13, v2, Ln1/a0;->a:J

    .line 90
    .line 91
    return v9

    .line 92
    :cond_6
    iget-object v2, v6, Lh1/w;->a:[B

    .line 93
    .line 94
    invoke-interface {v1, v2, v10, v9, v9}, Ln1/o;->b([BIIZ)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-nez v2, :cond_7

    .line 99
    .line 100
    invoke-virtual {v0}, Lv1/a;->a()V

    .line 101
    .line 102
    .line 103
    return v10

    .line 104
    :cond_7
    invoke-interface {v1}, Ln1/o;->g()V

    .line 105
    .line 106
    .line 107
    iget-object v2, v0, Lv1/a;->j:Lh2/m;

    .line 108
    .line 109
    if-nez v2, :cond_8

    .line 110
    .line 111
    new-instance v2, Lh2/m;

    .line 112
    .line 113
    sget-object v3, Lk2/o;->g:Lk2/b;

    .line 114
    .line 115
    const/16 v5, 0x8

    .line 116
    .line 117
    invoke-direct {v2, v5, v3}, Lh2/m;-><init>(ILk2/o;)V

    .line 118
    .line 119
    .line 120
    iput-object v2, v0, Lv1/a;->j:Lh2/m;

    .line 121
    .line 122
    :cond_8
    new-instance v2, Lv1/c;

    .line 123
    .line 124
    iget-wide v5, v0, Lv1/a;->f:J

    .line 125
    .line 126
    invoke-direct {v2, v1, v5, v6}, Lv1/c;-><init>(Ln1/o;J)V

    .line 127
    .line 128
    .line 129
    iput-object v2, v0, Lv1/a;->i:Lv1/c;

    .line 130
    .line 131
    iget-object v1, v0, Lv1/a;->j:Lh2/m;

    .line 132
    .line 133
    invoke-virtual {v1, v2}, Lh2/m;->sniff(Ln1/o;)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eqz v1, :cond_9

    .line 138
    .line 139
    iget-object v1, v0, Lv1/a;->j:Lh2/m;

    .line 140
    .line 141
    new-instance v2, Lv1/c;

    .line 142
    .line 143
    iget-wide v5, v0, Lv1/a;->f:J

    .line 144
    .line 145
    iget-object v3, v0, Lv1/a;->b:Ln1/p;

    .line 146
    .line 147
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-direct {v2, v8, v5, v6, v3}, Lv1/c;-><init>(IJLjava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, v2}, Lh2/m;->init(Ln1/p;)V

    .line 154
    .line 155
    .line 156
    iget-object v1, v0, Lv1/a;->g:Lc2/a;

    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    iget-object v2, v0, Lv1/a;->b:Ln1/p;

    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    const/16 v3, 0x400

    .line 167
    .line 168
    invoke-interface {v2, v3, v7}, Ln1/p;->track(II)Ln1/i0;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    new-instance v3, Landroidx/media3/common/v;

    .line 173
    .line 174
    invoke-direct {v3}, Landroidx/media3/common/v;-><init>()V

    .line 175
    .line 176
    .line 177
    const-string v5, "image/jpeg"

    .line 178
    .line 179
    invoke-static {v5}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    iput-object v5, v3, Landroidx/media3/common/v;->l:Ljava/lang/String;

    .line 184
    .line 185
    new-instance v5, Landroidx/media3/common/t0;

    .line 186
    .line 187
    new-array v6, v9, [Landroidx/media3/common/s0;

    .line 188
    .line 189
    aput-object v1, v6, v10

    .line 190
    .line 191
    invoke-direct {v5, v6}, Landroidx/media3/common/t0;-><init>([Landroidx/media3/common/s0;)V

    .line 192
    .line 193
    .line 194
    iput-object v5, v3, Landroidx/media3/common/v;->k:Landroidx/media3/common/t0;

    .line 195
    .line 196
    new-instance v1, Landroidx/media3/common/w;

    .line 197
    .line 198
    invoke-direct {v1, v3}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 199
    .line 200
    .line 201
    invoke-interface {v2, v1}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 202
    .line 203
    .line 204
    iput v4, v0, Lv1/a;->c:I

    .line 205
    .line 206
    return v10

    .line 207
    :cond_9
    invoke-virtual {v0}, Lv1/a;->a()V

    .line 208
    .line 209
    .line 210
    return v10

    .line 211
    :cond_a
    iget v2, v0, Lv1/a;->d:I

    .line 212
    .line 213
    const v3, 0xffe1

    .line 214
    .line 215
    .line 216
    if-ne v2, v3, :cond_14

    .line 217
    .line 218
    new-instance v2, Lh1/w;

    .line 219
    .line 220
    iget v3, v0, Lv1/a;->e:I

    .line 221
    .line 222
    invoke-direct {v2, v3}, Lh1/w;-><init>(I)V

    .line 223
    .line 224
    .line 225
    iget-object v3, v2, Lh1/w;->a:[B

    .line 226
    .line 227
    iget v6, v0, Lv1/a;->e:I

    .line 228
    .line 229
    invoke-interface {v1, v3, v10, v6}, Ln1/o;->readFully([BII)V

    .line 230
    .line 231
    .line 232
    iget-object v3, v0, Lv1/a;->g:Lc2/a;

    .line 233
    .line 234
    if-nez v3, :cond_15

    .line 235
    .line 236
    const-string v3, "http://ns.adobe.com/xap/1.0/"

    .line 237
    .line 238
    invoke-virtual {v2}, Lh1/w;->p()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    if-eqz v3, :cond_15

    .line 247
    .line 248
    invoke-virtual {v2}, Lh1/w;->p()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    if-eqz v2, :cond_15

    .line 253
    .line 254
    invoke-interface {v1}, Ln1/o;->getLength()J

    .line 255
    .line 256
    .line 257
    move-result-wide v6

    .line 258
    cmp-long v1, v6, v4

    .line 259
    .line 260
    if-nez v1, :cond_c

    .line 261
    .line 262
    :cond_b
    :goto_0
    const/4 v3, 0x0

    .line 263
    goto/16 :goto_5

    .line 264
    .line 265
    :cond_c
    :try_start_0
    invoke-static {v2}, Lv1/e;->a(Ljava/lang/String;)Lv1/c;

    .line 266
    .line 267
    .line 268
    move-result-object v1
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroidx/media3/common/v0; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 269
    goto :goto_1

    .line 270
    :catch_0
    const-string v1, "MotionPhotoXmpParser"

    .line 271
    .line 272
    const-string v2, "Ignoring unexpected XMP metadata"

    .line 273
    .line 274
    invoke-static {v1, v2}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    const/4 v1, 0x0

    .line 278
    :goto_1
    if-nez v1, :cond_d

    .line 279
    .line 280
    goto :goto_0

    .line 281
    :cond_d
    iget-object v2, v1, Lv1/c;->l:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v2, Lf6/l1;

    .line 284
    .line 285
    iget v11, v2, Lf6/l1;->m:I

    .line 286
    .line 287
    if-ge v11, v8, :cond_e

    .line 288
    .line 289
    goto :goto_0

    .line 290
    :cond_e
    sub-int/2addr v11, v9

    .line 291
    move-wide v13, v4

    .line 292
    move-wide v15, v13

    .line 293
    move-wide/from16 v19, v15

    .line 294
    .line 295
    move-wide/from16 v21, v19

    .line 296
    .line 297
    move v8, v10

    .line 298
    :goto_2
    if-ltz v11, :cond_12

    .line 299
    .line 300
    invoke-virtual {v2, v11}, Lf6/l1;->get(I)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v9

    .line 304
    check-cast v9, Lv1/b;

    .line 305
    .line 306
    const-string v12, "video/mp4"

    .line 307
    .line 308
    iget-object v3, v9, Lv1/b;->a:Ljava/lang/String;

    .line 309
    .line 310
    invoke-virtual {v12, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    or-int/2addr v3, v8

    .line 315
    if-nez v11, :cond_f

    .line 316
    .line 317
    iget-wide v8, v9, Lv1/b;->c:J

    .line 318
    .line 319
    sub-long/2addr v6, v8

    .line 320
    const-wide/16 v8, 0x0

    .line 321
    .line 322
    :goto_3
    move-wide/from16 v23, v8

    .line 323
    .line 324
    move-wide v8, v6

    .line 325
    move-wide/from16 v6, v23

    .line 326
    .line 327
    goto :goto_4

    .line 328
    :cond_f
    iget-wide v8, v9, Lv1/b;->b:J

    .line 329
    .line 330
    sub-long v8, v6, v8

    .line 331
    .line 332
    goto :goto_3

    .line 333
    :goto_4
    if-eqz v3, :cond_10

    .line 334
    .line 335
    cmp-long v12, v6, v8

    .line 336
    .line 337
    if-eqz v12, :cond_10

    .line 338
    .line 339
    sub-long v21, v8, v6

    .line 340
    .line 341
    move-wide/from16 v19, v6

    .line 342
    .line 343
    move v3, v10

    .line 344
    :cond_10
    if-nez v11, :cond_11

    .line 345
    .line 346
    move-wide v13, v6

    .line 347
    move-wide v15, v8

    .line 348
    :cond_11
    add-int/lit8 v11, v11, -0x1

    .line 349
    .line 350
    move v8, v3

    .line 351
    goto :goto_2

    .line 352
    :cond_12
    cmp-long v2, v19, v4

    .line 353
    .line 354
    if-eqz v2, :cond_b

    .line 355
    .line 356
    cmp-long v2, v21, v4

    .line 357
    .line 358
    if-eqz v2, :cond_b

    .line 359
    .line 360
    cmp-long v2, v13, v4

    .line 361
    .line 362
    if-eqz v2, :cond_b

    .line 363
    .line 364
    cmp-long v2, v15, v4

    .line 365
    .line 366
    if-nez v2, :cond_13

    .line 367
    .line 368
    goto :goto_0

    .line 369
    :cond_13
    new-instance v12, Lc2/a;

    .line 370
    .line 371
    iget-wide v1, v1, Lv1/c;->k:J

    .line 372
    .line 373
    move-wide/from16 v17, v1

    .line 374
    .line 375
    invoke-direct/range {v12 .. v22}, Lc2/a;-><init>(JJJJJ)V

    .line 376
    .line 377
    .line 378
    move-object v3, v12

    .line 379
    :goto_5
    iput-object v3, v0, Lv1/a;->g:Lc2/a;

    .line 380
    .line 381
    if-eqz v3, :cond_15

    .line 382
    .line 383
    iget-wide v1, v3, Lc2/a;->m:J

    .line 384
    .line 385
    iput-wide v1, v0, Lv1/a;->f:J

    .line 386
    .line 387
    goto :goto_6

    .line 388
    :cond_14
    iget v2, v0, Lv1/a;->e:I

    .line 389
    .line 390
    invoke-interface {v1, v2}, Ln1/o;->h(I)V

    .line 391
    .line 392
    .line 393
    :cond_15
    :goto_6
    iput v10, v0, Lv1/a;->c:I

    .line 394
    .line 395
    return v10

    .line 396
    :cond_16
    invoke-virtual {v6, v8}, Lh1/w;->D(I)V

    .line 397
    .line 398
    .line 399
    iget-object v2, v6, Lh1/w;->a:[B

    .line 400
    .line 401
    invoke-interface {v1, v2, v10, v8}, Ln1/o;->readFully([BII)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v6}, Lh1/w;->A()I

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    sub-int/2addr v1, v8

    .line 409
    iput v1, v0, Lv1/a;->e:I

    .line 410
    .line 411
    iput v8, v0, Lv1/a;->c:I

    .line 412
    .line 413
    return v10

    .line 414
    :cond_17
    invoke-virtual {v6, v8}, Lh1/w;->D(I)V

    .line 415
    .line 416
    .line 417
    iget-object v2, v6, Lh1/w;->a:[B

    .line 418
    .line 419
    invoke-interface {v1, v2, v10, v8}, Ln1/o;->readFully([BII)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v6}, Lh1/w;->A()I

    .line 423
    .line 424
    .line 425
    move-result v1

    .line 426
    iput v1, v0, Lv1/a;->d:I

    .line 427
    .line 428
    const v2, 0xffda

    .line 429
    .line 430
    .line 431
    if-ne v1, v2, :cond_19

    .line 432
    .line 433
    iget-wide v1, v0, Lv1/a;->f:J

    .line 434
    .line 435
    cmp-long v1, v1, v4

    .line 436
    .line 437
    if-eqz v1, :cond_18

    .line 438
    .line 439
    iput v7, v0, Lv1/a;->c:I

    .line 440
    .line 441
    return v10

    .line 442
    :cond_18
    invoke-virtual {v0}, Lv1/a;->a()V

    .line 443
    .line 444
    .line 445
    return v10

    .line 446
    :cond_19
    const v2, 0xffd0

    .line 447
    .line 448
    .line 449
    if-lt v1, v2, :cond_1a

    .line 450
    .line 451
    const v2, 0xffd9

    .line 452
    .line 453
    .line 454
    if-le v1, v2, :cond_1b

    .line 455
    .line 456
    :cond_1a
    const v2, 0xff01

    .line 457
    .line 458
    .line 459
    if-eq v1, v2, :cond_1b

    .line 460
    .line 461
    iput v9, v0, Lv1/a;->c:I

    .line 462
    .line 463
    :cond_1b
    return v10
.end method

.method public final release()V
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/a;->j:Lh2/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final seek(JJ)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput p1, p0, Lv1/a;->c:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lv1/a;->j:Lh2/m;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget v0, p0, Lv1/a;->c:I

    .line 15
    .line 16
    const/4 v1, 0x5

    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lv1/a;->j:Lh2/m;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1, p2, p3, p4}, Lh2/m;->seek(JJ)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final sniff(Ln1/o;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lv1/a;->a:Lh1/w;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Lh1/w;->D(I)V

    .line 5
    .line 6
    .line 7
    iget-object v2, v0, Lh1/w;->a:[B

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-interface {p1, v2, v3, v1}, Ln1/o;->i([BII)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lh1/w;->A()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const v4, 0xffd8

    .line 18
    .line 19
    .line 20
    if-eq v2, v4, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v0, v1}, Lh1/w;->D(I)V

    .line 24
    .line 25
    .line 26
    iget-object v2, v0, Lh1/w;->a:[B

    .line 27
    .line 28
    invoke-interface {p1, v2, v3, v1}, Ln1/o;->i([BII)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lh1/w;->A()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    iput v2, p0, Lv1/a;->d:I

    .line 36
    .line 37
    const v4, 0xffe0

    .line 38
    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lh1/w;->D(I)V

    .line 43
    .line 44
    .line 45
    iget-object v2, v0, Lh1/w;->a:[B

    .line 46
    .line 47
    invoke-interface {p1, v2, v3, v1}, Ln1/o;->i([BII)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lh1/w;->A()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    sub-int/2addr v2, v1

    .line 55
    invoke-interface {p1, v2}, Ln1/o;->d(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lh1/w;->D(I)V

    .line 59
    .line 60
    .line 61
    iget-object v2, v0, Lh1/w;->a:[B

    .line 62
    .line 63
    invoke-interface {p1, v2, v3, v1}, Ln1/o;->i([BII)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lh1/w;->A()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    iput v2, p0, Lv1/a;->d:I

    .line 71
    .line 72
    :cond_1
    iget v2, p0, Lv1/a;->d:I

    .line 73
    .line 74
    const v4, 0xffe1

    .line 75
    .line 76
    .line 77
    if-eq v2, v4, :cond_2

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    invoke-interface {p1, v1}, Ln1/o;->d(I)V

    .line 81
    .line 82
    .line 83
    const/4 v1, 0x6

    .line 84
    invoke-virtual {v0, v1}, Lh1/w;->D(I)V

    .line 85
    .line 86
    .line 87
    iget-object v2, v0, Lh1/w;->a:[B

    .line 88
    .line 89
    invoke-interface {p1, v2, v3, v1}, Ln1/o;->i([BII)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Lh1/w;->w()J

    .line 93
    .line 94
    .line 95
    move-result-wide v1

    .line 96
    const-wide/32 v4, 0x45786966    # 5.758429993E-315

    .line 97
    .line 98
    .line 99
    cmp-long p1, v1, v4

    .line 100
    .line 101
    if-nez p1, :cond_3

    .line 102
    .line 103
    invoke-virtual {v0}, Lh1/w;->A()I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-nez p1, :cond_3

    .line 108
    .line 109
    const/4 p1, 0x1

    .line 110
    return p1

    .line 111
    :cond_3
    :goto_0
    return v3
.end method
