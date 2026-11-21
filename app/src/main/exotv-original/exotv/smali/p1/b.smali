.class public final Lp1/b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/n;


# instance fields
.field public final a:Lh1/w;

.field public final b:Lc4/h;

.field public final c:Z

.field public final d:Lk2/o;

.field public e:I

.field public f:Ln1/p;

.field public g:Lp1/c;

.field public h:J

.field public i:[Lp1/e;

.field public j:J

.field public k:Lp1/e;

.field public l:I

.field public m:J

.field public n:J

.field public o:I

.field public p:Z


# direct methods
.method public constructor <init>(ILk2/o;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lp1/b;->d:Lk2/o;

    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    and-int/2addr p1, p2

    .line 8
    const/4 v0, 0x0

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move p2, v0

    .line 13
    :goto_0
    iput-boolean p2, p0, Lp1/b;->c:Z

    .line 14
    .line 15
    new-instance p1, Lh1/w;

    .line 16
    .line 17
    const/16 p2, 0xc

    .line 18
    .line 19
    invoke-direct {p1, p2}, Lh1/w;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lp1/b;->a:Lh1/w;

    .line 23
    .line 24
    new-instance p1, Lc4/h;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lp1/b;->b:Lc4/h;

    .line 30
    .line 31
    new-instance p1, Lk2/b;

    .line 32
    .line 33
    const/16 p2, 0x8

    .line 34
    .line 35
    invoke-direct {p1, p2}, Lk2/b;-><init>(I)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lp1/b;->f:Ln1/p;

    .line 39
    .line 40
    new-array p1, v0, [Lp1/e;

    .line 41
    .line 42
    iput-object p1, p0, Lp1/b;->i:[Lp1/e;

    .line 43
    .line 44
    const-wide/16 p1, -0x1

    .line 45
    .line 46
    iput-wide p1, p0, Lp1/b;->m:J

    .line 47
    .line 48
    iput-wide p1, p0, Lp1/b;->n:J

    .line 49
    .line 50
    const/4 p1, -0x1

    .line 51
    iput p1, p0, Lp1/b;->l:I

    .line 52
    .line 53
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    iput-wide p1, p0, Lp1/b;->h:J

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final init(Ln1/p;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lp1/b;->e:I

    .line 3
    .line 4
    iget-boolean v0, p0, Lp1/b;->c:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, La4/c;

    .line 9
    .line 10
    iget-object v1, p0, Lp1/b;->d:Lk2/o;

    .line 11
    .line 12
    invoke-direct {v0, p1, v1}, La4/c;-><init>(Ln1/p;Lk2/o;)V

    .line 13
    .line 14
    .line 15
    move-object p1, v0

    .line 16
    :cond_0
    iput-object p1, p0, Lp1/b;->f:Ln1/p;

    .line 17
    .line 18
    const-wide/16 v0, -0x1

    .line 19
    .line 20
    iput-wide v0, p0, Lp1/b;->j:J

    .line 21
    .line 22
    return-void
.end method

.method public final read(Ln1/o;Ln1/a0;)I
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-wide v2, v0, Lp1/b;->j:J

    .line 6
    .line 7
    const-wide/16 v4, -0x1

    .line 8
    .line 9
    cmp-long v2, v2, v4

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 16
    .line 17
    .line 18
    move-result-wide v7

    .line 19
    iget-wide v9, v0, Lp1/b;->j:J

    .line 20
    .line 21
    cmp-long v2, v9, v7

    .line 22
    .line 23
    if-ltz v2, :cond_0

    .line 24
    .line 25
    const-wide/32 v11, 0x40000

    .line 26
    .line 27
    .line 28
    add-long/2addr v11, v7

    .line 29
    cmp-long v2, v9, v11

    .line 30
    .line 31
    if-lez v2, :cond_1

    .line 32
    .line 33
    :cond_0
    move-object/from16 v2, p2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    sub-long/2addr v9, v7

    .line 37
    long-to-int v2, v9

    .line 38
    invoke-interface {v1, v2}, Ln1/o;->h(I)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :goto_0
    iput-wide v9, v2, Ln1/a0;->a:J

    .line 43
    .line 44
    move v2, v3

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    :goto_1
    move v2, v6

    .line 47
    :goto_2
    iput-wide v4, v0, Lp1/b;->j:J

    .line 48
    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    return v3

    .line 52
    :cond_3
    iget v2, v0, Lp1/b;->e:I

    .line 53
    .line 54
    const/16 v11, 0x10

    .line 55
    .line 56
    const v12, 0x69766f6d

    .line 57
    .line 58
    .line 59
    const/4 v13, 0x2

    .line 60
    const v14, 0x5453494c

    .line 61
    .line 62
    .line 63
    const/16 v15, 0x8

    .line 64
    .line 65
    const-wide/16 v16, 0x8

    .line 66
    .line 67
    move-wide/from16 v18, v4

    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    const/16 v5, 0xc

    .line 71
    .line 72
    const/16 p2, 0x3

    .line 73
    .line 74
    iget-object v10, v0, Lp1/b;->b:Lc4/h;

    .line 75
    .line 76
    iget-object v7, v0, Lp1/b;->a:Lh1/w;

    .line 77
    .line 78
    packed-switch v2, :pswitch_data_0

    .line 79
    .line 80
    .line 81
    new-instance v1, Ljava/lang/AssertionError;

    .line 82
    .line 83
    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    .line 84
    .line 85
    .line 86
    throw v1

    .line 87
    :pswitch_0
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 88
    .line 89
    .line 90
    move-result-wide v8

    .line 91
    iget-wide v10, v0, Lp1/b;->n:J

    .line 92
    .line 93
    cmp-long v2, v8, v10

    .line 94
    .line 95
    if-ltz v2, :cond_4

    .line 96
    .line 97
    const/4 v1, -0x1

    .line 98
    return v1

    .line 99
    :cond_4
    iget-object v2, v0, Lp1/b;->k:Lp1/e;

    .line 100
    .line 101
    if-eqz v2, :cond_a

    .line 102
    .line 103
    iget v5, v2, Lp1/e;->g:I

    .line 104
    .line 105
    iget-object v7, v2, Lp1/e;->a:Ln1/i0;

    .line 106
    .line 107
    invoke-interface {v7, v1, v5, v6}, Ln1/i0;->sampleData(Landroidx/media3/common/m;IZ)I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    sub-int/2addr v5, v1

    .line 112
    iput v5, v2, Lp1/e;->g:I

    .line 113
    .line 114
    if-nez v5, :cond_5

    .line 115
    .line 116
    move v1, v3

    .line 117
    goto :goto_3

    .line 118
    :cond_5
    move v1, v6

    .line 119
    :goto_3
    if-eqz v1, :cond_8

    .line 120
    .line 121
    iget v5, v2, Lp1/e;->f:I

    .line 122
    .line 123
    if-lez v5, :cond_7

    .line 124
    .line 125
    iget-object v7, v2, Lp1/e;->a:Ln1/i0;

    .line 126
    .line 127
    iget v5, v2, Lp1/e;->h:I

    .line 128
    .line 129
    iget-wide v8, v2, Lp1/e;->d:J

    .line 130
    .line 131
    int-to-long v10, v5

    .line 132
    mul-long/2addr v8, v10

    .line 133
    iget v10, v2, Lp1/e;->e:I

    .line 134
    .line 135
    int-to-long v10, v10

    .line 136
    div-long/2addr v8, v10

    .line 137
    iget-object v10, v2, Lp1/e;->m:[I

    .line 138
    .line 139
    invoke-static {v10, v5}, Ljava/util/Arrays;->binarySearch([II)I

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    if-ltz v5, :cond_6

    .line 144
    .line 145
    move v10, v3

    .line 146
    goto :goto_4

    .line 147
    :cond_6
    move v10, v6

    .line 148
    :goto_4
    iget v11, v2, Lp1/e;->f:I

    .line 149
    .line 150
    const/4 v12, 0x0

    .line 151
    const/4 v13, 0x0

    .line 152
    invoke-interface/range {v7 .. v13}, Ln1/i0;->sampleMetadata(JIIILn1/h0;)V

    .line 153
    .line 154
    .line 155
    :cond_7
    iget v5, v2, Lp1/e;->h:I

    .line 156
    .line 157
    add-int/2addr v5, v3

    .line 158
    iput v5, v2, Lp1/e;->h:I

    .line 159
    .line 160
    :cond_8
    if-eqz v1, :cond_9

    .line 161
    .line 162
    iput-object v4, v0, Lp1/b;->k:Lp1/e;

    .line 163
    .line 164
    :cond_9
    return v6

    .line 165
    :cond_a
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 166
    .line 167
    .line 168
    move-result-wide v8

    .line 169
    const-wide/16 v10, 0x1

    .line 170
    .line 171
    and-long/2addr v8, v10

    .line 172
    cmp-long v2, v8, v10

    .line 173
    .line 174
    if-nez v2, :cond_b

    .line 175
    .line 176
    invoke-interface {v1, v3}, Ln1/o;->h(I)V

    .line 177
    .line 178
    .line 179
    :cond_b
    iget-object v2, v7, Lh1/w;->a:[B

    .line 180
    .line 181
    invoke-interface {v1, v2, v6, v5}, Ln1/o;->i([BII)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v7, v6}, Lh1/w;->G(I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v7}, Lh1/w;->i()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    if-ne v2, v14, :cond_d

    .line 192
    .line 193
    invoke-virtual {v7, v15}, Lh1/w;->G(I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v7}, Lh1/w;->i()I

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-ne v2, v12, :cond_c

    .line 201
    .line 202
    move v15, v5

    .line 203
    :cond_c
    invoke-interface {v1, v15}, Ln1/o;->h(I)V

    .line 204
    .line 205
    .line 206
    invoke-interface {v1}, Ln1/o;->g()V

    .line 207
    .line 208
    .line 209
    return v6

    .line 210
    :cond_d
    invoke-virtual {v7}, Lh1/w;->i()I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    const v5, 0x4b4e554a    # 1.352225E7f

    .line 215
    .line 216
    .line 217
    if-ne v2, v5, :cond_e

    .line 218
    .line 219
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 220
    .line 221
    .line 222
    move-result-wide v1

    .line 223
    int-to-long v3, v3

    .line 224
    add-long/2addr v1, v3

    .line 225
    add-long v1, v1, v16

    .line 226
    .line 227
    iput-wide v1, v0, Lp1/b;->j:J

    .line 228
    .line 229
    return v6

    .line 230
    :cond_e
    invoke-interface {v1, v15}, Ln1/o;->h(I)V

    .line 231
    .line 232
    .line 233
    invoke-interface {v1}, Ln1/o;->g()V

    .line 234
    .line 235
    .line 236
    iget-object v5, v0, Lp1/b;->i:[Lp1/e;

    .line 237
    .line 238
    array-length v7, v5

    .line 239
    move v8, v6

    .line 240
    :goto_5
    if-ge v8, v7, :cond_11

    .line 241
    .line 242
    aget-object v9, v5, v8

    .line 243
    .line 244
    iget v10, v9, Lp1/e;->b:I

    .line 245
    .line 246
    if-eq v10, v2, :cond_10

    .line 247
    .line 248
    iget v10, v9, Lp1/e;->c:I

    .line 249
    .line 250
    if-ne v10, v2, :cond_f

    .line 251
    .line 252
    goto :goto_6

    .line 253
    :cond_f
    add-int/lit8 v8, v8, 0x1

    .line 254
    .line 255
    goto :goto_5

    .line 256
    :cond_10
    :goto_6
    move-object v4, v9

    .line 257
    :cond_11
    if-nez v4, :cond_12

    .line 258
    .line 259
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 260
    .line 261
    .line 262
    move-result-wide v1

    .line 263
    int-to-long v3, v3

    .line 264
    add-long/2addr v1, v3

    .line 265
    iput-wide v1, v0, Lp1/b;->j:J

    .line 266
    .line 267
    return v6

    .line 268
    :cond_12
    iput v3, v4, Lp1/e;->f:I

    .line 269
    .line 270
    iput v3, v4, Lp1/e;->g:I

    .line 271
    .line 272
    iput-object v4, v0, Lp1/b;->k:Lp1/e;

    .line 273
    .line 274
    return v6

    .line 275
    :pswitch_1
    new-instance v2, Lh1/w;

    .line 276
    .line 277
    iget v5, v0, Lp1/b;->o:I

    .line 278
    .line 279
    invoke-direct {v2, v5}, Lh1/w;-><init>(I)V

    .line 280
    .line 281
    .line 282
    iget-object v5, v2, Lh1/w;->a:[B

    .line 283
    .line 284
    iget v7, v0, Lp1/b;->o:I

    .line 285
    .line 286
    invoke-interface {v1, v5, v6, v7}, Ln1/o;->readFully([BII)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2}, Lh1/w;->a()I

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    if-ge v1, v11, :cond_13

    .line 294
    .line 295
    const-wide/16 v7, 0x0

    .line 296
    .line 297
    goto :goto_8

    .line 298
    :cond_13
    iget v1, v2, Lh1/w;->b:I

    .line 299
    .line 300
    invoke-virtual {v2, v15}, Lh1/w;->H(I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v2}, Lh1/w;->i()I

    .line 304
    .line 305
    .line 306
    move-result v5

    .line 307
    int-to-long v14, v5

    .line 308
    iget-wide v7, v0, Lp1/b;->m:J

    .line 309
    .line 310
    cmp-long v5, v14, v7

    .line 311
    .line 312
    if-lez v5, :cond_14

    .line 313
    .line 314
    const-wide/16 v7, 0x0

    .line 315
    .line 316
    goto :goto_7

    .line 317
    :cond_14
    add-long v7, v7, v16

    .line 318
    .line 319
    :goto_7
    invoke-virtual {v2, v1}, Lh1/w;->G(I)V

    .line 320
    .line 321
    .line 322
    :goto_8
    invoke-virtual {v2}, Lh1/w;->a()I

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    if-lt v1, v11, :cond_1d

    .line 327
    .line 328
    invoke-virtual {v2}, Lh1/w;->i()I

    .line 329
    .line 330
    .line 331
    move-result v1

    .line 332
    invoke-virtual {v2}, Lh1/w;->i()I

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    invoke-virtual {v2}, Lh1/w;->i()I

    .line 337
    .line 338
    .line 339
    move-result v10

    .line 340
    int-to-long v14, v10

    .line 341
    add-long/2addr v14, v7

    .line 342
    invoke-virtual {v2}, Lh1/w;->i()I

    .line 343
    .line 344
    .line 345
    iget-object v10, v0, Lp1/b;->i:[Lp1/e;

    .line 346
    .line 347
    array-length v12, v10

    .line 348
    move v4, v6

    .line 349
    :goto_9
    if-ge v4, v12, :cond_16

    .line 350
    .line 351
    move/from16 v21, v6

    .line 352
    .line 353
    aget-object v6, v10, v4

    .line 354
    .line 355
    iget v9, v6, Lp1/e;->b:I

    .line 356
    .line 357
    if-eq v9, v1, :cond_17

    .line 358
    .line 359
    iget v9, v6, Lp1/e;->c:I

    .line 360
    .line 361
    if-ne v9, v1, :cond_15

    .line 362
    .line 363
    goto :goto_a

    .line 364
    :cond_15
    add-int/lit8 v4, v4, 0x1

    .line 365
    .line 366
    move/from16 v6, v21

    .line 367
    .line 368
    goto :goto_9

    .line 369
    :cond_16
    move/from16 v21, v6

    .line 370
    .line 371
    const/4 v6, 0x0

    .line 372
    :cond_17
    :goto_a
    if-nez v6, :cond_18

    .line 373
    .line 374
    :goto_b
    move/from16 v6, v21

    .line 375
    .line 376
    const/4 v4, 0x0

    .line 377
    goto :goto_8

    .line 378
    :cond_18
    and-int/lit8 v1, v5, 0x10

    .line 379
    .line 380
    if-ne v1, v11, :cond_19

    .line 381
    .line 382
    move v1, v3

    .line 383
    goto :goto_c

    .line 384
    :cond_19
    move/from16 v1, v21

    .line 385
    .line 386
    :goto_c
    iget-wide v4, v6, Lp1/e;->k:J

    .line 387
    .line 388
    cmp-long v4, v4, v18

    .line 389
    .line 390
    if-nez v4, :cond_1a

    .line 391
    .line 392
    iput-wide v14, v6, Lp1/e;->k:J

    .line 393
    .line 394
    :cond_1a
    if-eqz v1, :cond_1c

    .line 395
    .line 396
    iget v1, v6, Lp1/e;->j:I

    .line 397
    .line 398
    iget-object v4, v6, Lp1/e;->m:[I

    .line 399
    .line 400
    array-length v4, v4

    .line 401
    if-ne v1, v4, :cond_1b

    .line 402
    .line 403
    iget-object v1, v6, Lp1/e;->l:[J

    .line 404
    .line 405
    array-length v4, v1

    .line 406
    mul-int/lit8 v4, v4, 0x3

    .line 407
    .line 408
    div-int/2addr v4, v13

    .line 409
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    iput-object v1, v6, Lp1/e;->l:[J

    .line 414
    .line 415
    iget-object v1, v6, Lp1/e;->m:[I

    .line 416
    .line 417
    array-length v4, v1

    .line 418
    mul-int/lit8 v4, v4, 0x3

    .line 419
    .line 420
    div-int/2addr v4, v13

    .line 421
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([II)[I

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    iput-object v1, v6, Lp1/e;->m:[I

    .line 426
    .line 427
    :cond_1b
    iget-object v1, v6, Lp1/e;->l:[J

    .line 428
    .line 429
    iget v4, v6, Lp1/e;->j:I

    .line 430
    .line 431
    aput-wide v14, v1, v4

    .line 432
    .line 433
    iget-object v1, v6, Lp1/e;->m:[I

    .line 434
    .line 435
    iget v5, v6, Lp1/e;->i:I

    .line 436
    .line 437
    aput v5, v1, v4

    .line 438
    .line 439
    add-int/2addr v4, v3

    .line 440
    iput v4, v6, Lp1/e;->j:I

    .line 441
    .line 442
    :cond_1c
    iget v1, v6, Lp1/e;->i:I

    .line 443
    .line 444
    add-int/2addr v1, v3

    .line 445
    iput v1, v6, Lp1/e;->i:I

    .line 446
    .line 447
    goto :goto_b

    .line 448
    :cond_1d
    move/from16 v21, v6

    .line 449
    .line 450
    iget-object v1, v0, Lp1/b;->i:[Lp1/e;

    .line 451
    .line 452
    array-length v2, v1

    .line 453
    move/from16 v4, v21

    .line 454
    .line 455
    :goto_d
    if-ge v4, v2, :cond_1e

    .line 456
    .line 457
    aget-object v5, v1, v4

    .line 458
    .line 459
    iget-object v6, v5, Lp1/e;->l:[J

    .line 460
    .line 461
    iget v7, v5, Lp1/e;->j:I

    .line 462
    .line 463
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 464
    .line 465
    .line 466
    move-result-object v6

    .line 467
    iput-object v6, v5, Lp1/e;->l:[J

    .line 468
    .line 469
    iget-object v6, v5, Lp1/e;->m:[I

    .line 470
    .line 471
    iget v7, v5, Lp1/e;->j:I

    .line 472
    .line 473
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([II)[I

    .line 474
    .line 475
    .line 476
    move-result-object v6

    .line 477
    iput-object v6, v5, Lp1/e;->m:[I

    .line 478
    .line 479
    add-int/lit8 v4, v4, 0x1

    .line 480
    .line 481
    goto :goto_d

    .line 482
    :cond_1e
    iput-boolean v3, v0, Lp1/b;->p:Z

    .line 483
    .line 484
    iget-object v1, v0, Lp1/b;->f:Ln1/p;

    .line 485
    .line 486
    new-instance v2, Ln1/s;

    .line 487
    .line 488
    iget-wide v3, v0, Lp1/b;->h:J

    .line 489
    .line 490
    invoke-direct {v2, v0, v3, v4, v13}, Ln1/s;-><init>(Ljava/lang/Object;JI)V

    .line 491
    .line 492
    .line 493
    invoke-interface {v1, v2}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 494
    .line 495
    .line 496
    const/4 v1, 0x6

    .line 497
    iput v1, v0, Lp1/b;->e:I

    .line 498
    .line 499
    iget-wide v1, v0, Lp1/b;->m:J

    .line 500
    .line 501
    iput-wide v1, v0, Lp1/b;->j:J

    .line 502
    .line 503
    return v21

    .line 504
    :pswitch_2
    move/from16 v21, v6

    .line 505
    .line 506
    iget-object v2, v7, Lh1/w;->a:[B

    .line 507
    .line 508
    move/from16 v4, v21

    .line 509
    .line 510
    invoke-interface {v1, v2, v4, v15}, Ln1/o;->readFully([BII)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v7, v4}, Lh1/w;->G(I)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v7}, Lh1/w;->i()I

    .line 517
    .line 518
    .line 519
    move-result v2

    .line 520
    invoke-virtual {v7}, Lh1/w;->i()I

    .line 521
    .line 522
    .line 523
    move-result v3

    .line 524
    const v5, 0x31786469

    .line 525
    .line 526
    .line 527
    if-ne v2, v5, :cond_1f

    .line 528
    .line 529
    const/4 v1, 0x5

    .line 530
    iput v1, v0, Lp1/b;->e:I

    .line 531
    .line 532
    iput v3, v0, Lp1/b;->o:I

    .line 533
    .line 534
    return v4

    .line 535
    :cond_1f
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 536
    .line 537
    .line 538
    move-result-wide v1

    .line 539
    int-to-long v5, v3

    .line 540
    add-long/2addr v1, v5

    .line 541
    iput-wide v1, v0, Lp1/b;->j:J

    .line 542
    .line 543
    return v4

    .line 544
    :pswitch_3
    move v4, v6

    .line 545
    iget-wide v8, v0, Lp1/b;->m:J

    .line 546
    .line 547
    cmp-long v6, v8, v18

    .line 548
    .line 549
    if-eqz v6, :cond_20

    .line 550
    .line 551
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 552
    .line 553
    .line 554
    move-result-wide v8

    .line 555
    iget-wide v2, v0, Lp1/b;->m:J

    .line 556
    .line 557
    cmp-long v8, v8, v2

    .line 558
    .line 559
    if-eqz v8, :cond_20

    .line 560
    .line 561
    iput-wide v2, v0, Lp1/b;->j:J

    .line 562
    .line 563
    return v4

    .line 564
    :cond_20
    iget-object v2, v7, Lh1/w;->a:[B

    .line 565
    .line 566
    invoke-interface {v1, v2, v4, v5}, Ln1/o;->i([BII)V

    .line 567
    .line 568
    .line 569
    invoke-interface {v1}, Ln1/o;->g()V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v7, v4}, Lh1/w;->G(I)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v7}, Lh1/w;->i()I

    .line 579
    .line 580
    .line 581
    move-result v2

    .line 582
    iput v2, v10, Lc4/h;->a:I

    .line 583
    .line 584
    invoke-virtual {v7}, Lh1/w;->i()I

    .line 585
    .line 586
    .line 587
    move-result v2

    .line 588
    iput v2, v10, Lc4/h;->b:I

    .line 589
    .line 590
    iput v4, v10, Lc4/h;->c:I

    .line 591
    .line 592
    invoke-virtual {v7}, Lh1/w;->i()I

    .line 593
    .line 594
    .line 595
    move-result v2

    .line 596
    iget v3, v10, Lc4/h;->a:I

    .line 597
    .line 598
    const v7, 0x46464952

    .line 599
    .line 600
    .line 601
    if-ne v3, v7, :cond_21

    .line 602
    .line 603
    invoke-interface {v1, v5}, Ln1/o;->h(I)V

    .line 604
    .line 605
    .line 606
    return v4

    .line 607
    :cond_21
    if-ne v3, v14, :cond_22

    .line 608
    .line 609
    if-eq v2, v12, :cond_23

    .line 610
    .line 611
    :cond_22
    const/4 v4, 0x0

    .line 612
    goto :goto_e

    .line 613
    :cond_23
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 614
    .line 615
    .line 616
    move-result-wide v2

    .line 617
    iput-wide v2, v0, Lp1/b;->m:J

    .line 618
    .line 619
    iget v4, v10, Lc4/h;->b:I

    .line 620
    .line 621
    int-to-long v4, v4

    .line 622
    add-long/2addr v2, v4

    .line 623
    add-long v2, v2, v16

    .line 624
    .line 625
    iput-wide v2, v0, Lp1/b;->n:J

    .line 626
    .line 627
    iget-boolean v2, v0, Lp1/b;->p:Z

    .line 628
    .line 629
    if-nez v2, :cond_25

    .line 630
    .line 631
    iget-object v2, v0, Lp1/b;->g:Lp1/c;

    .line 632
    .line 633
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 634
    .line 635
    .line 636
    iget v2, v2, Lp1/c;->b:I

    .line 637
    .line 638
    and-int/2addr v2, v11

    .line 639
    if-ne v2, v11, :cond_24

    .line 640
    .line 641
    const/4 v2, 0x4

    .line 642
    iput v2, v0, Lp1/b;->e:I

    .line 643
    .line 644
    iget-wide v1, v0, Lp1/b;->n:J

    .line 645
    .line 646
    iput-wide v1, v0, Lp1/b;->j:J

    .line 647
    .line 648
    const/16 v21, 0x0

    .line 649
    .line 650
    return v21

    .line 651
    :cond_24
    iget-object v2, v0, Lp1/b;->f:Ln1/p;

    .line 652
    .line 653
    new-instance v3, Ln1/s;

    .line 654
    .line 655
    iget-wide v4, v0, Lp1/b;->h:J

    .line 656
    .line 657
    invoke-direct {v3, v4, v5}, Ln1/s;-><init>(J)V

    .line 658
    .line 659
    .line 660
    invoke-interface {v2, v3}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 661
    .line 662
    .line 663
    const/4 v6, 0x1

    .line 664
    iput-boolean v6, v0, Lp1/b;->p:Z

    .line 665
    .line 666
    :cond_25
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 667
    .line 668
    .line 669
    move-result-wide v1

    .line 670
    const-wide/16 v3, 0xc

    .line 671
    .line 672
    add-long/2addr v1, v3

    .line 673
    iput-wide v1, v0, Lp1/b;->j:J

    .line 674
    .line 675
    const/4 v1, 0x6

    .line 676
    iput v1, v0, Lp1/b;->e:I

    .line 677
    .line 678
    const/4 v4, 0x0

    .line 679
    return v4

    .line 680
    :goto_e
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 681
    .line 682
    .line 683
    move-result-wide v1

    .line 684
    iget v3, v10, Lc4/h;->b:I

    .line 685
    .line 686
    int-to-long v5, v3

    .line 687
    add-long/2addr v1, v5

    .line 688
    add-long v1, v1, v16

    .line 689
    .line 690
    iput-wide v1, v0, Lp1/b;->j:J

    .line 691
    .line 692
    return v4

    .line 693
    :pswitch_4
    move v4, v6

    .line 694
    iget v3, v0, Lp1/b;->l:I

    .line 695
    .line 696
    const/4 v2, 0x4

    .line 697
    sub-int/2addr v3, v2

    .line 698
    new-instance v2, Lh1/w;

    .line 699
    .line 700
    invoke-direct {v2, v3}, Lh1/w;-><init>(I)V

    .line 701
    .line 702
    .line 703
    iget-object v5, v2, Lh1/w;->a:[B

    .line 704
    .line 705
    invoke-interface {v1, v5, v4, v3}, Ln1/o;->readFully([BII)V

    .line 706
    .line 707
    .line 708
    const v1, 0x6c726468

    .line 709
    .line 710
    .line 711
    invoke-static {v2, v1}, Lp1/f;->b(Lh1/w;I)Lp1/f;

    .line 712
    .line 713
    .line 714
    move-result-object v2

    .line 715
    iget v3, v2, Lp1/f;->b:I

    .line 716
    .line 717
    if-ne v3, v1, :cond_30

    .line 718
    .line 719
    const-class v1, Lp1/c;

    .line 720
    .line 721
    invoke-virtual {v2, v1}, Lp1/f;->a(Ljava/lang/Class;)Lp1/a;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    check-cast v1, Lp1/c;

    .line 726
    .line 727
    if-eqz v1, :cond_2f

    .line 728
    .line 729
    iput-object v1, v0, Lp1/b;->g:Lp1/c;

    .line 730
    .line 731
    iget v3, v1, Lp1/c;->c:I

    .line 732
    .line 733
    int-to-long v3, v3

    .line 734
    iget v1, v1, Lp1/c;->a:I

    .line 735
    .line 736
    int-to-long v7, v1

    .line 737
    mul-long/2addr v3, v7

    .line 738
    iput-wide v3, v0, Lp1/b;->h:J

    .line 739
    .line 740
    new-instance v1, Ljava/util/ArrayList;

    .line 741
    .line 742
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 743
    .line 744
    .line 745
    iget-object v2, v2, Lp1/f;->a:Lf6/m0;

    .line 746
    .line 747
    const/4 v4, 0x0

    .line 748
    invoke-virtual {v2, v4}, Lf6/m0;->l(I)Lf6/k0;

    .line 749
    .line 750
    .line 751
    move-result-object v2

    .line 752
    const/4 v15, 0x0

    .line 753
    :cond_26
    :goto_f
    invoke-virtual {v2}, Lf6/a;->hasNext()Z

    .line 754
    .line 755
    .line 756
    move-result v3

    .line 757
    if-eqz v3, :cond_2e

    .line 758
    .line 759
    invoke-virtual {v2}, Lf6/a;->next()Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object v3

    .line 763
    check-cast v3, Lp1/a;

    .line 764
    .line 765
    invoke-interface {v3}, Lp1/a;->getType()I

    .line 766
    .line 767
    .line 768
    move-result v4

    .line 769
    const v5, 0x6c727473

    .line 770
    .line 771
    .line 772
    if-ne v4, v5, :cond_26

    .line 773
    .line 774
    check-cast v3, Lp1/f;

    .line 775
    .line 776
    add-int/lit8 v4, v15, 0x1

    .line 777
    .line 778
    const-class v5, Lp1/d;

    .line 779
    .line 780
    invoke-virtual {v3, v5}, Lp1/f;->a(Ljava/lang/Class;)Lp1/a;

    .line 781
    .line 782
    .line 783
    move-result-object v5

    .line 784
    check-cast v5, Lp1/d;

    .line 785
    .line 786
    const-class v7, Lp1/g;

    .line 787
    .line 788
    invoke-virtual {v3, v7}, Lp1/f;->a(Ljava/lang/Class;)Lp1/a;

    .line 789
    .line 790
    .line 791
    move-result-object v7

    .line 792
    check-cast v7, Lp1/g;

    .line 793
    .line 794
    const-string v8, "AviExtractor"

    .line 795
    .line 796
    if-nez v5, :cond_28

    .line 797
    .line 798
    const-string v3, "Missing Stream Header"

    .line 799
    .line 800
    invoke-static {v8, v3}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 801
    .line 802
    .line 803
    :cond_27
    :goto_10
    const/4 v14, 0x0

    .line 804
    goto/16 :goto_11

    .line 805
    .line 806
    :cond_28
    if-nez v7, :cond_29

    .line 807
    .line 808
    const-string v3, "Missing Stream Format"

    .line 809
    .line 810
    invoke-static {v8, v3}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 811
    .line 812
    .line 813
    goto :goto_10

    .line 814
    :cond_29
    iget v8, v5, Lp1/d;->d:I

    .line 815
    .line 816
    int-to-long v8, v8

    .line 817
    iget v10, v5, Lp1/d;->b:I

    .line 818
    .line 819
    int-to-long v10, v10

    .line 820
    const-wide/32 v16, 0xf4240

    .line 821
    .line 822
    .line 823
    mul-long v24, v10, v16

    .line 824
    .line 825
    iget v10, v5, Lp1/d;->c:I

    .line 826
    .line 827
    int-to-long v10, v10

    .line 828
    sget v12, Lh1/i0;->a:I

    .line 829
    .line 830
    sget-object v28, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 831
    .line 832
    move-wide/from16 v22, v8

    .line 833
    .line 834
    move-wide/from16 v26, v10

    .line 835
    .line 836
    invoke-static/range {v22 .. v28}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 837
    .line 838
    .line 839
    move-result-wide v17

    .line 840
    iget-object v7, v7, Lp1/g;->a:Landroidx/media3/common/w;

    .line 841
    .line 842
    invoke-virtual {v7}, Landroidx/media3/common/w;->a()Landroidx/media3/common/v;

    .line 843
    .line 844
    .line 845
    move-result-object v8

    .line 846
    invoke-static {v15}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v9

    .line 850
    iput-object v9, v8, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 851
    .line 852
    iget v9, v5, Lp1/d;->e:I

    .line 853
    .line 854
    if-eqz v9, :cond_2a

    .line 855
    .line 856
    iput v9, v8, Landroidx/media3/common/v;->n:I

    .line 857
    .line 858
    :cond_2a
    const-class v9, Lp1/h;

    .line 859
    .line 860
    invoke-virtual {v3, v9}, Lp1/f;->a(Ljava/lang/Class;)Lp1/a;

    .line 861
    .line 862
    .line 863
    move-result-object v3

    .line 864
    check-cast v3, Lp1/h;

    .line 865
    .line 866
    if-eqz v3, :cond_2b

    .line 867
    .line 868
    iget-object v3, v3, Lp1/h;->a:Ljava/lang/String;

    .line 869
    .line 870
    iput-object v3, v8, Landroidx/media3/common/v;->b:Ljava/lang/String;

    .line 871
    .line 872
    :cond_2b
    iget-object v3, v7, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 873
    .line 874
    invoke-static {v3}, Landroidx/media3/common/u0;->i(Ljava/lang/String;)I

    .line 875
    .line 876
    .line 877
    move-result v3

    .line 878
    const/4 v6, 0x1

    .line 879
    if-eq v3, v6, :cond_2c

    .line 880
    .line 881
    if-ne v3, v13, :cond_27

    .line 882
    .line 883
    :cond_2c
    iget-object v7, v0, Lp1/b;->f:Ln1/p;

    .line 884
    .line 885
    invoke-interface {v7, v15, v3}, Ln1/p;->track(II)Ln1/i0;

    .line 886
    .line 887
    .line 888
    move-result-object v7

    .line 889
    new-instance v9, Landroidx/media3/common/w;

    .line 890
    .line 891
    invoke-direct {v9, v8}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 892
    .line 893
    .line 894
    invoke-interface {v7, v9}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 895
    .line 896
    .line 897
    new-instance v14, Lp1/e;

    .line 898
    .line 899
    iget v5, v5, Lp1/d;->d:I

    .line 900
    .line 901
    move/from16 v16, v3

    .line 902
    .line 903
    move/from16 v19, v5

    .line 904
    .line 905
    move-object/from16 v20, v7

    .line 906
    .line 907
    invoke-direct/range {v14 .. v20}, Lp1/e;-><init>(IIJILn1/i0;)V

    .line 908
    .line 909
    .line 910
    move-wide/from16 v7, v17

    .line 911
    .line 912
    iget-wide v9, v0, Lp1/b;->h:J

    .line 913
    .line 914
    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 915
    .line 916
    .line 917
    move-result-wide v7

    .line 918
    iput-wide v7, v0, Lp1/b;->h:J

    .line 919
    .line 920
    :goto_11
    if-eqz v14, :cond_2d

    .line 921
    .line 922
    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 923
    .line 924
    .line 925
    :cond_2d
    move v15, v4

    .line 926
    goto/16 :goto_f

    .line 927
    .line 928
    :cond_2e
    const/4 v4, 0x0

    .line 929
    new-array v2, v4, [Lp1/e;

    .line 930
    .line 931
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    move-result-object v1

    .line 935
    check-cast v1, [Lp1/e;

    .line 936
    .line 937
    iput-object v1, v0, Lp1/b;->i:[Lp1/e;

    .line 938
    .line 939
    iget-object v1, v0, Lp1/b;->f:Ln1/p;

    .line 940
    .line 941
    invoke-interface {v1}, Ln1/p;->endTracks()V

    .line 942
    .line 943
    .line 944
    move/from16 v1, p2

    .line 945
    .line 946
    iput v1, v0, Lp1/b;->e:I

    .line 947
    .line 948
    return v4

    .line 949
    :cond_2f
    const-string v1, "AviHeader not found"

    .line 950
    .line 951
    const/4 v2, 0x0

    .line 952
    invoke-static {v1, v2}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 953
    .line 954
    .line 955
    move-result-object v1

    .line 956
    throw v1

    .line 957
    :cond_30
    const/4 v2, 0x0

    .line 958
    new-instance v1, Ljava/lang/StringBuilder;

    .line 959
    .line 960
    const-string v4, "Unexpected header list type "

    .line 961
    .line 962
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 963
    .line 964
    .line 965
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 966
    .line 967
    .line 968
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 969
    .line 970
    .line 971
    move-result-object v1

    .line 972
    invoke-static {v1, v2}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 973
    .line 974
    .line 975
    move-result-object v1

    .line 976
    throw v1

    .line 977
    :pswitch_5
    iget-object v2, v7, Lh1/w;->a:[B

    .line 978
    .line 979
    const/4 v4, 0x0

    .line 980
    invoke-interface {v1, v2, v4, v5}, Ln1/o;->readFully([BII)V

    .line 981
    .line 982
    .line 983
    invoke-virtual {v7, v4}, Lh1/w;->G(I)V

    .line 984
    .line 985
    .line 986
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 987
    .line 988
    .line 989
    invoke-virtual {v7}, Lh1/w;->i()I

    .line 990
    .line 991
    .line 992
    move-result v1

    .line 993
    iput v1, v10, Lc4/h;->a:I

    .line 994
    .line 995
    invoke-virtual {v7}, Lh1/w;->i()I

    .line 996
    .line 997
    .line 998
    move-result v1

    .line 999
    iput v1, v10, Lc4/h;->b:I

    .line 1000
    .line 1001
    iput v4, v10, Lc4/h;->c:I

    .line 1002
    .line 1003
    iget v1, v10, Lc4/h;->a:I

    .line 1004
    .line 1005
    if-ne v1, v14, :cond_32

    .line 1006
    .line 1007
    invoke-virtual {v7}, Lh1/w;->i()I

    .line 1008
    .line 1009
    .line 1010
    move-result v1

    .line 1011
    iput v1, v10, Lc4/h;->c:I

    .line 1012
    .line 1013
    const v2, 0x6c726468

    .line 1014
    .line 1015
    .line 1016
    if-ne v1, v2, :cond_31

    .line 1017
    .line 1018
    iget v1, v10, Lc4/h;->b:I

    .line 1019
    .line 1020
    iput v1, v0, Lp1/b;->l:I

    .line 1021
    .line 1022
    iput v13, v0, Lp1/b;->e:I

    .line 1023
    .line 1024
    return v4

    .line 1025
    :cond_31
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1026
    .line 1027
    const-string v2, "hdrl expected, found: "

    .line 1028
    .line 1029
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1030
    .line 1031
    .line 1032
    iget v2, v10, Lc4/h;->c:I

    .line 1033
    .line 1034
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v1

    .line 1041
    const/4 v2, 0x0

    .line 1042
    invoke-static {v1, v2}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v1

    .line 1046
    throw v1

    .line 1047
    :cond_32
    const/4 v2, 0x0

    .line 1048
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1049
    .line 1050
    const-string v3, "LIST expected, found: "

    .line 1051
    .line 1052
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1053
    .line 1054
    .line 1055
    iget v3, v10, Lc4/h;->a:I

    .line 1056
    .line 1057
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v1

    .line 1064
    invoke-static {v1, v2}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v1

    .line 1068
    throw v1

    .line 1069
    :pswitch_6
    move-object v2, v4

    .line 1070
    invoke-virtual/range {p0 .. p1}, Lp1/b;->sniff(Ln1/o;)Z

    .line 1071
    .line 1072
    .line 1073
    move-result v3

    .line 1074
    if-eqz v3, :cond_33

    .line 1075
    .line 1076
    invoke-interface {v1, v5}, Ln1/o;->h(I)V

    .line 1077
    .line 1078
    .line 1079
    const/4 v6, 0x1

    .line 1080
    iput v6, v0, Lp1/b;->e:I

    .line 1081
    .line 1082
    const/16 v21, 0x0

    .line 1083
    .line 1084
    return v21

    .line 1085
    :cond_33
    const-string v1, "AVI Header List not found"

    .line 1086
    .line 1087
    invoke-static {v1, v2}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v1

    .line 1091
    throw v1

    .line 1092
    nop

    .line 1093
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method

.method public final seek(JJ)V
    .locals 5

    .line 1
    const-wide/16 p3, -0x1

    .line 2
    .line 3
    iput-wide p3, p0, Lp1/b;->j:J

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    iput-object p3, p0, Lp1/b;->k:Lp1/e;

    .line 7
    .line 8
    iget-object p3, p0, Lp1/b;->i:[Lp1/e;

    .line 9
    .line 10
    array-length p4, p3

    .line 11
    const/4 v0, 0x0

    .line 12
    move v1, v0

    .line 13
    :goto_0
    if-ge v1, p4, :cond_1

    .line 14
    .line 15
    aget-object v2, p3, v1

    .line 16
    .line 17
    iget v3, v2, Lp1/e;->j:I

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    iput v0, v2, Lp1/e;->h:I

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object v3, v2, Lp1/e;->l:[J

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    invoke-static {v3, p1, p2, v4}, Lh1/i0;->e([JJZ)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    iget-object v4, v2, Lp1/e;->m:[I

    .line 32
    .line 33
    aget v3, v4, v3

    .line 34
    .line 35
    iput v3, v2, Lp1/e;->h:I

    .line 36
    .line 37
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const-wide/16 p3, 0x0

    .line 41
    .line 42
    cmp-long p1, p1, p3

    .line 43
    .line 44
    if-nez p1, :cond_3

    .line 45
    .line 46
    iget-object p1, p0, Lp1/b;->i:[Lp1/e;

    .line 47
    .line 48
    array-length p1, p1

    .line 49
    if-nez p1, :cond_2

    .line 50
    .line 51
    iput v0, p0, Lp1/b;->e:I

    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    const/4 p1, 0x3

    .line 55
    iput p1, p0, Lp1/b;->e:I

    .line 56
    .line 57
    return-void

    .line 58
    :cond_3
    const/4 p1, 0x6

    .line 59
    iput p1, p0, Lp1/b;->e:I

    .line 60
    .line 61
    return-void
.end method

.method public final sniff(Ln1/o;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lp1/b;->a:Lh1/w;

    .line 2
    .line 3
    iget-object v1, v0, Lh1/w;->a:[B

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-interface {p1, v1, v3, v2}, Ln1/o;->i([BII)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v3}, Lh1/w;->G(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lh1/w;->i()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const v1, 0x46464952

    .line 19
    .line 20
    .line 21
    if-eq p1, v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x4

    .line 25
    invoke-virtual {v0, p1}, Lh1/w;->H(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lh1/w;->i()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    const v0, 0x20495641

    .line 33
    .line 34
    .line 35
    if-ne p1, v0, :cond_1

    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    return p1

    .line 39
    :cond_1
    :goto_0
    return v3
.end method
