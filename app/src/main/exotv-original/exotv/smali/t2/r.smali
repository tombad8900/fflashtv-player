.class public final Lt2/r;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lt2/h;


# instance fields
.field public final a:La4/c;

.field public b:Ljava/lang/String;

.field public c:Ln1/i0;

.field public d:Lt2/q;

.field public e:Z

.field public final f:[Z

.field public final g:Lt2/x;

.field public final h:Lt2/x;

.field public final i:Lt2/x;

.field public final j:Lt2/x;

.field public final k:Lt2/x;

.field public l:J

.field public m:J

.field public final n:Lh1/w;


# direct methods
.method public constructor <init>(La4/c;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt2/r;->a:La4/c;

    .line 5
    .line 6
    const/4 p1, 0x3

    .line 7
    new-array p1, p1, [Z

    .line 8
    .line 9
    iput-object p1, p0, Lt2/r;->f:[Z

    .line 10
    .line 11
    new-instance p1, Lt2/x;

    .line 12
    .line 13
    const/16 v0, 0x20

    .line 14
    .line 15
    invoke-direct {p1, v0}, Lt2/x;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lt2/r;->g:Lt2/x;

    .line 19
    .line 20
    new-instance p1, Lt2/x;

    .line 21
    .line 22
    const/16 v0, 0x21

    .line 23
    .line 24
    invoke-direct {p1, v0}, Lt2/x;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lt2/r;->h:Lt2/x;

    .line 28
    .line 29
    new-instance p1, Lt2/x;

    .line 30
    .line 31
    const/16 v0, 0x22

    .line 32
    .line 33
    invoke-direct {p1, v0}, Lt2/x;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lt2/r;->i:Lt2/x;

    .line 37
    .line 38
    new-instance p1, Lt2/x;

    .line 39
    .line 40
    const/16 v0, 0x27

    .line 41
    .line 42
    invoke-direct {p1, v0}, Lt2/x;-><init>(I)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lt2/r;->j:Lt2/x;

    .line 46
    .line 47
    new-instance p1, Lt2/x;

    .line 48
    .line 49
    const/16 v0, 0x28

    .line 50
    .line 51
    invoke-direct {p1, v0}, Lt2/x;-><init>(I)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lt2/r;->k:Lt2/x;

    .line 55
    .line 56
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    iput-wide v0, p0, Lt2/r;->m:J

    .line 62
    .line 63
    new-instance p1, Lh1/w;

    .line 64
    .line 65
    invoke-direct {p1}, Lh1/w;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Lt2/r;->n:Lh1/w;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final a(Lh1/w;)V
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lt2/r;->c:Ln1/i0;

    .line 6
    .line 7
    invoke-static {v2}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sget v2, Lh1/i0;->a:I

    .line 11
    .line 12
    :goto_0
    invoke-virtual {v1}, Lh1/w;->a()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-lez v2, :cond_19

    .line 17
    .line 18
    iget v2, v1, Lh1/w;->b:I

    .line 19
    .line 20
    iget v3, v1, Lh1/w;->c:I

    .line 21
    .line 22
    iget-object v4, v1, Lh1/w;->a:[B

    .line 23
    .line 24
    iget-wide v5, v0, Lt2/r;->l:J

    .line 25
    .line 26
    invoke-virtual {v1}, Lh1/w;->a()I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    int-to-long v7, v7

    .line 31
    add-long/2addr v5, v7

    .line 32
    iput-wide v5, v0, Lt2/r;->l:J

    .line 33
    .line 34
    iget-object v5, v0, Lt2/r;->c:Ln1/i0;

    .line 35
    .line 36
    invoke-virtual {v1}, Lh1/w;->a()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    invoke-interface {v5, v1, v6}, Ln1/i0;->sampleData(Lh1/w;I)V

    .line 41
    .line 42
    .line 43
    :goto_1
    if-ge v2, v3, :cond_18

    .line 44
    .line 45
    iget-object v5, v0, Lt2/r;->f:[Z

    .line 46
    .line 47
    invoke-static {v4, v2, v3, v5}, Li1/p;->b([BII[Z)I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-ne v5, v3, :cond_0

    .line 52
    .line 53
    invoke-virtual {v0, v4, v2, v3}, Lt2/r;->b([BII)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    add-int/lit8 v6, v5, 0x3

    .line 58
    .line 59
    aget-byte v7, v4, v6

    .line 60
    .line 61
    and-int/lit8 v7, v7, 0x7e

    .line 62
    .line 63
    const/4 v8, 0x1

    .line 64
    shr-int/2addr v7, v8

    .line 65
    sub-int v9, v5, v2

    .line 66
    .line 67
    if-lez v9, :cond_1

    .line 68
    .line 69
    invoke-virtual {v0, v4, v2, v5}, Lt2/r;->b([BII)V

    .line 70
    .line 71
    .line 72
    :cond_1
    sub-int v2, v3, v5

    .line 73
    .line 74
    iget-wide v10, v0, Lt2/r;->l:J

    .line 75
    .line 76
    int-to-long v12, v2

    .line 77
    sub-long/2addr v10, v12

    .line 78
    if-gez v9, :cond_2

    .line 79
    .line 80
    neg-int v9, v9

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    const/4 v9, 0x0

    .line 83
    :goto_2
    iget-wide v12, v0, Lt2/r;->m:J

    .line 84
    .line 85
    iget-object v14, v0, Lt2/r;->a:La4/c;

    .line 86
    .line 87
    iget-object v14, v14, La4/c;->m:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v14, Li1/s;

    .line 90
    .line 91
    iget-object v15, v0, Lt2/r;->d:Lt2/q;

    .line 92
    .line 93
    iget-boolean v8, v0, Lt2/r;->e:Z

    .line 94
    .line 95
    iget-boolean v5, v15, Lt2/q;->j:Z

    .line 96
    .line 97
    if-eqz v5, :cond_4

    .line 98
    .line 99
    iget-boolean v5, v15, Lt2/q;->g:Z

    .line 100
    .line 101
    if-eqz v5, :cond_4

    .line 102
    .line 103
    iget-boolean v5, v15, Lt2/q;->c:Z

    .line 104
    .line 105
    iput-boolean v5, v15, Lt2/q;->m:Z

    .line 106
    .line 107
    const/4 v5, 0x0

    .line 108
    iput-boolean v5, v15, Lt2/q;->j:Z

    .line 109
    .line 110
    :cond_3
    move v5, v3

    .line 111
    move-object v8, v4

    .line 112
    goto :goto_4

    .line 113
    :cond_4
    iget-boolean v5, v15, Lt2/q;->h:Z

    .line 114
    .line 115
    if-nez v5, :cond_5

    .line 116
    .line 117
    iget-boolean v5, v15, Lt2/q;->g:Z

    .line 118
    .line 119
    if-eqz v5, :cond_3

    .line 120
    .line 121
    :cond_5
    if-eqz v8, :cond_6

    .line 122
    .line 123
    iget-boolean v5, v15, Lt2/q;->i:Z

    .line 124
    .line 125
    if-eqz v5, :cond_6

    .line 126
    .line 127
    move v5, v3

    .line 128
    move-object v8, v4

    .line 129
    iget-wide v3, v15, Lt2/q;->b:J

    .line 130
    .line 131
    sub-long v3, v10, v3

    .line 132
    .line 133
    long-to-int v3, v3

    .line 134
    add-int/2addr v3, v2

    .line 135
    invoke-virtual {v15, v3}, Lt2/q;->a(I)V

    .line 136
    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_6
    move v5, v3

    .line 140
    move-object v8, v4

    .line 141
    :goto_3
    iget-wide v3, v15, Lt2/q;->b:J

    .line 142
    .line 143
    iput-wide v3, v15, Lt2/q;->k:J

    .line 144
    .line 145
    iget-wide v3, v15, Lt2/q;->e:J

    .line 146
    .line 147
    iput-wide v3, v15, Lt2/q;->l:J

    .line 148
    .line 149
    iget-boolean v3, v15, Lt2/q;->c:Z

    .line 150
    .line 151
    iput-boolean v3, v15, Lt2/q;->m:Z

    .line 152
    .line 153
    const/4 v3, 0x1

    .line 154
    iput-boolean v3, v15, Lt2/q;->i:Z

    .line 155
    .line 156
    :goto_4
    iget-boolean v3, v0, Lt2/r;->e:Z

    .line 157
    .line 158
    iget-object v4, v0, Lt2/r;->g:Lt2/x;

    .line 159
    .line 160
    iget-object v15, v0, Lt2/r;->h:Lt2/x;

    .line 161
    .line 162
    iget-object v1, v0, Lt2/r;->i:Lt2/x;

    .line 163
    .line 164
    if-nez v3, :cond_a

    .line 165
    .line 166
    invoke-virtual {v4, v9}, Lt2/x;->e(I)Z

    .line 167
    .line 168
    .line 169
    invoke-virtual {v15, v9}, Lt2/x;->e(I)Z

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1, v9}, Lt2/x;->e(I)Z

    .line 173
    .line 174
    .line 175
    iget-boolean v3, v4, Lt2/x;->e:Z

    .line 176
    .line 177
    if-eqz v3, :cond_a

    .line 178
    .line 179
    iget-boolean v3, v15, Lt2/x;->e:Z

    .line 180
    .line 181
    if-eqz v3, :cond_a

    .line 182
    .line 183
    iget-boolean v3, v1, Lt2/x;->e:Z

    .line 184
    .line 185
    if-eqz v3, :cond_a

    .line 186
    .line 187
    iget-object v3, v0, Lt2/r;->b:Ljava/lang/String;

    .line 188
    .line 189
    move/from16 v16, v5

    .line 190
    .line 191
    iget v5, v4, Lt2/x;->c:I

    .line 192
    .line 193
    move/from16 v17, v6

    .line 194
    .line 195
    iget v6, v15, Lt2/x;->c:I

    .line 196
    .line 197
    add-int/2addr v6, v5

    .line 198
    move/from16 v18, v6

    .line 199
    .line 200
    iget v6, v1, Lt2/x;->c:I

    .line 201
    .line 202
    add-int v6, v18, v6

    .line 203
    .line 204
    new-array v6, v6, [B

    .line 205
    .line 206
    move-object/from16 v18, v8

    .line 207
    .line 208
    iget-object v8, v4, Lt2/x;->f:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v8, [B

    .line 211
    .line 212
    move/from16 v19, v2

    .line 213
    .line 214
    const/4 v2, 0x0

    .line 215
    invoke-static {v8, v2, v6, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 216
    .line 217
    .line 218
    iget-object v5, v15, Lt2/x;->f:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v5, [B

    .line 221
    .line 222
    iget v8, v4, Lt2/x;->c:I

    .line 223
    .line 224
    move/from16 v20, v7

    .line 225
    .line 226
    iget v7, v15, Lt2/x;->c:I

    .line 227
    .line 228
    invoke-static {v5, v2, v6, v8, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 229
    .line 230
    .line 231
    iget-object v5, v1, Lt2/x;->f:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v5, [B

    .line 234
    .line 235
    iget v7, v4, Lt2/x;->c:I

    .line 236
    .line 237
    iget v8, v15, Lt2/x;->c:I

    .line 238
    .line 239
    add-int/2addr v7, v8

    .line 240
    iget v8, v1, Lt2/x;->c:I

    .line 241
    .line 242
    invoke-static {v5, v2, v6, v7, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 243
    .line 244
    .line 245
    iget-object v2, v15, Lt2/x;->f:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v2, [B

    .line 248
    .line 249
    iget v5, v15, Lt2/x;->c:I

    .line 250
    .line 251
    const/4 v7, 0x3

    .line 252
    const/4 v8, 0x0

    .line 253
    invoke-static {v2, v7, v5, v8}, Li1/p;->g([BIILa1/h;)Li1/l;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    iget-object v5, v2, Li1/l;->a:Li1/h;

    .line 258
    .line 259
    if-eqz v5, :cond_7

    .line 260
    .line 261
    iget v7, v5, Li1/h;->a:I

    .line 262
    .line 263
    iget-boolean v8, v5, Li1/h;->b:Z

    .line 264
    .line 265
    move-object/from16 v27, v6

    .line 266
    .line 267
    iget v6, v5, Li1/h;->c:I

    .line 268
    .line 269
    move/from16 v23, v6

    .line 270
    .line 271
    iget v6, v5, Li1/h;->d:I

    .line 272
    .line 273
    move/from16 v24, v6

    .line 274
    .line 275
    iget-object v6, v5, Li1/h;->e:[I

    .line 276
    .line 277
    iget v5, v5, Li1/h;->f:I

    .line 278
    .line 279
    move/from16 v26, v5

    .line 280
    .line 281
    move-object/from16 v25, v6

    .line 282
    .line 283
    move/from16 v21, v7

    .line 284
    .line 285
    move/from16 v22, v8

    .line 286
    .line 287
    invoke-static/range {v21 .. v26}, Lh1/c;->a(IZII[II)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v8

    .line 291
    goto :goto_5

    .line 292
    :cond_7
    move-object/from16 v27, v6

    .line 293
    .line 294
    :goto_5
    new-instance v5, Landroidx/media3/common/v;

    .line 295
    .line 296
    invoke-direct {v5}, Landroidx/media3/common/v;-><init>()V

    .line 297
    .line 298
    .line 299
    iput-object v3, v5, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 300
    .line 301
    const-string v3, "video/hevc"

    .line 302
    .line 303
    invoke-static {v3}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    iput-object v3, v5, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 308
    .line 309
    iput-object v8, v5, Landroidx/media3/common/v;->j:Ljava/lang/String;

    .line 310
    .line 311
    iget v3, v2, Li1/l;->d:I

    .line 312
    .line 313
    iput v3, v5, Landroidx/media3/common/v;->t:I

    .line 314
    .line 315
    iget v3, v2, Li1/l;->e:I

    .line 316
    .line 317
    iput v3, v5, Landroidx/media3/common/v;->u:I

    .line 318
    .line 319
    iget v3, v2, Li1/l;->h:I

    .line 320
    .line 321
    iget v6, v2, Li1/l;->i:I

    .line 322
    .line 323
    iget v7, v2, Li1/l;->j:I

    .line 324
    .line 325
    iget v8, v2, Li1/l;->b:I

    .line 326
    .line 327
    add-int/lit8 v32, v8, 0x8

    .line 328
    .line 329
    iget v8, v2, Li1/l;->c:I

    .line 330
    .line 331
    add-int/lit8 v33, v8, 0x8

    .line 332
    .line 333
    new-instance v28, Landroidx/media3/common/l;

    .line 334
    .line 335
    const/16 v34, 0x0

    .line 336
    .line 337
    move/from16 v29, v3

    .line 338
    .line 339
    move/from16 v30, v6

    .line 340
    .line 341
    move/from16 v31, v7

    .line 342
    .line 343
    invoke-direct/range {v28 .. v34}, Landroidx/media3/common/l;-><init>(IIIII[B)V

    .line 344
    .line 345
    .line 346
    move-object/from16 v3, v28

    .line 347
    .line 348
    iput-object v3, v5, Landroidx/media3/common/v;->A:Landroidx/media3/common/l;

    .line 349
    .line 350
    iget v3, v2, Li1/l;->f:F

    .line 351
    .line 352
    iput v3, v5, Landroidx/media3/common/v;->x:F

    .line 353
    .line 354
    iget v2, v2, Li1/l;->g:I

    .line 355
    .line 356
    iput v2, v5, Landroidx/media3/common/v;->o:I

    .line 357
    .line 358
    invoke-static/range {v27 .. v27}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    iput-object v2, v5, Landroidx/media3/common/v;->p:Ljava/util/List;

    .line 363
    .line 364
    new-instance v2, Landroidx/media3/common/w;

    .line 365
    .line 366
    invoke-direct {v2, v5}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 367
    .line 368
    .line 369
    iget-object v3, v0, Lt2/r;->c:Ln1/i0;

    .line 370
    .line 371
    invoke-interface {v3, v2}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 372
    .line 373
    .line 374
    const/4 v3, -0x1

    .line 375
    iget v2, v2, Landroidx/media3/common/w;->p:I

    .line 376
    .line 377
    if-eq v2, v3, :cond_9

    .line 378
    .line 379
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    if-ltz v2, :cond_8

    .line 383
    .line 384
    const/4 v3, 0x1

    .line 385
    goto :goto_6

    .line 386
    :cond_8
    const/4 v3, 0x0

    .line 387
    :goto_6
    invoke-static {v3}, Lh1/a;->j(Z)V

    .line 388
    .line 389
    .line 390
    iput v2, v14, Li1/s;->a:I

    .line 391
    .line 392
    invoke-virtual {v14, v2}, Li1/s;->i(I)V

    .line 393
    .line 394
    .line 395
    const/4 v3, 0x1

    .line 396
    iput-boolean v3, v0, Lt2/r;->e:Z

    .line 397
    .line 398
    goto :goto_7

    .line 399
    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 400
    .line 401
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 402
    .line 403
    .line 404
    throw v1

    .line 405
    :cond_a
    move/from16 v19, v2

    .line 406
    .line 407
    move/from16 v16, v5

    .line 408
    .line 409
    move/from16 v17, v6

    .line 410
    .line 411
    move/from16 v20, v7

    .line 412
    .line 413
    move-object/from16 v18, v8

    .line 414
    .line 415
    :goto_7
    iget-object v2, v0, Lt2/r;->j:Lt2/x;

    .line 416
    .line 417
    invoke-virtual {v2, v9}, Lt2/x;->e(I)Z

    .line 418
    .line 419
    .line 420
    move-result v3

    .line 421
    const/4 v5, 0x5

    .line 422
    iget-object v6, v0, Lt2/r;->n:Lh1/w;

    .line 423
    .line 424
    if-eqz v3, :cond_b

    .line 425
    .line 426
    iget-object v3, v2, Lt2/x;->f:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v3, [B

    .line 429
    .line 430
    iget v7, v2, Lt2/x;->c:I

    .line 431
    .line 432
    invoke-static {v3, v7}, Li1/p;->k([BI)I

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    iget-object v7, v2, Lt2/x;->f:Ljava/lang/Object;

    .line 437
    .line 438
    check-cast v7, [B

    .line 439
    .line 440
    invoke-virtual {v6, v7, v3}, Lh1/w;->E([BI)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v6, v5}, Lh1/w;->H(I)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v14, v12, v13, v6}, Li1/s;->a(JLh1/w;)V

    .line 447
    .line 448
    .line 449
    :cond_b
    iget-object v3, v0, Lt2/r;->k:Lt2/x;

    .line 450
    .line 451
    invoke-virtual {v3, v9}, Lt2/x;->e(I)Z

    .line 452
    .line 453
    .line 454
    move-result v7

    .line 455
    if-eqz v7, :cond_c

    .line 456
    .line 457
    iget-object v7, v3, Lt2/x;->f:Ljava/lang/Object;

    .line 458
    .line 459
    check-cast v7, [B

    .line 460
    .line 461
    iget v8, v3, Lt2/x;->c:I

    .line 462
    .line 463
    invoke-static {v7, v8}, Li1/p;->k([BI)I

    .line 464
    .line 465
    .line 466
    move-result v7

    .line 467
    iget-object v8, v3, Lt2/x;->f:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast v8, [B

    .line 470
    .line 471
    invoke-virtual {v6, v8, v7}, Lh1/w;->E([BI)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v6, v5}, Lh1/w;->H(I)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v14, v12, v13, v6}, Li1/s;->a(JLh1/w;)V

    .line 478
    .line 479
    .line 480
    :cond_c
    iget-wide v5, v0, Lt2/r;->m:J

    .line 481
    .line 482
    iget-object v7, v0, Lt2/r;->d:Lt2/q;

    .line 483
    .line 484
    iget-boolean v8, v0, Lt2/r;->e:Z

    .line 485
    .line 486
    const/4 v9, 0x0

    .line 487
    iput-boolean v9, v7, Lt2/q;->g:Z

    .line 488
    .line 489
    iput-boolean v9, v7, Lt2/q;->h:Z

    .line 490
    .line 491
    iput-wide v5, v7, Lt2/q;->e:J

    .line 492
    .line 493
    iput v9, v7, Lt2/q;->d:I

    .line 494
    .line 495
    iput-wide v10, v7, Lt2/q;->b:J

    .line 496
    .line 497
    const/16 v5, 0x20

    .line 498
    .line 499
    move/from16 v6, v20

    .line 500
    .line 501
    if-lt v6, v5, :cond_d

    .line 502
    .line 503
    const/16 v9, 0x28

    .line 504
    .line 505
    if-ne v6, v9, :cond_e

    .line 506
    .line 507
    :cond_d
    const/4 v8, 0x1

    .line 508
    const/4 v9, 0x0

    .line 509
    goto :goto_9

    .line 510
    :cond_e
    iget-boolean v9, v7, Lt2/q;->i:Z

    .line 511
    .line 512
    if-eqz v9, :cond_10

    .line 513
    .line 514
    iget-boolean v9, v7, Lt2/q;->j:Z

    .line 515
    .line 516
    if-nez v9, :cond_10

    .line 517
    .line 518
    if-eqz v8, :cond_f

    .line 519
    .line 520
    move/from16 v8, v19

    .line 521
    .line 522
    invoke-virtual {v7, v8}, Lt2/q;->a(I)V

    .line 523
    .line 524
    .line 525
    :cond_f
    const/4 v9, 0x0

    .line 526
    iput-boolean v9, v7, Lt2/q;->i:Z

    .line 527
    .line 528
    goto :goto_8

    .line 529
    :cond_10
    const/4 v9, 0x0

    .line 530
    :goto_8
    if-gt v5, v6, :cond_11

    .line 531
    .line 532
    const/16 v5, 0x23

    .line 533
    .line 534
    if-le v6, v5, :cond_12

    .line 535
    .line 536
    :cond_11
    const/16 v5, 0x27

    .line 537
    .line 538
    if-ne v6, v5, :cond_13

    .line 539
    .line 540
    :cond_12
    iget-boolean v5, v7, Lt2/q;->j:Z

    .line 541
    .line 542
    const/4 v8, 0x1

    .line 543
    xor-int/2addr v5, v8

    .line 544
    iput-boolean v5, v7, Lt2/q;->h:Z

    .line 545
    .line 546
    iput-boolean v8, v7, Lt2/q;->j:Z

    .line 547
    .line 548
    goto :goto_9

    .line 549
    :cond_13
    const/4 v8, 0x1

    .line 550
    :goto_9
    const/16 v5, 0x10

    .line 551
    .line 552
    if-lt v6, v5, :cond_14

    .line 553
    .line 554
    const/16 v5, 0x15

    .line 555
    .line 556
    if-gt v6, v5, :cond_14

    .line 557
    .line 558
    move v5, v8

    .line 559
    goto :goto_a

    .line 560
    :cond_14
    move v5, v9

    .line 561
    :goto_a
    iput-boolean v5, v7, Lt2/q;->c:Z

    .line 562
    .line 563
    if-nez v5, :cond_16

    .line 564
    .line 565
    const/16 v5, 0x9

    .line 566
    .line 567
    if-gt v6, v5, :cond_15

    .line 568
    .line 569
    goto :goto_b

    .line 570
    :cond_15
    move v8, v9

    .line 571
    :cond_16
    :goto_b
    iput-boolean v8, v7, Lt2/q;->f:Z

    .line 572
    .line 573
    iget-boolean v5, v0, Lt2/r;->e:Z

    .line 574
    .line 575
    if-nez v5, :cond_17

    .line 576
    .line 577
    invoke-virtual {v4, v6}, Lt2/x;->g(I)V

    .line 578
    .line 579
    .line 580
    invoke-virtual {v15, v6}, Lt2/x;->g(I)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v1, v6}, Lt2/x;->g(I)V

    .line 584
    .line 585
    .line 586
    :cond_17
    invoke-virtual {v2, v6}, Lt2/x;->g(I)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v3, v6}, Lt2/x;->g(I)V

    .line 590
    .line 591
    .line 592
    move-object/from16 v1, p1

    .line 593
    .line 594
    move/from16 v3, v16

    .line 595
    .line 596
    move/from16 v2, v17

    .line 597
    .line 598
    move-object/from16 v4, v18

    .line 599
    .line 600
    goto/16 :goto_1

    .line 601
    .line 602
    :cond_18
    move-object/from16 v1, p1

    .line 603
    .line 604
    goto/16 :goto_0

    .line 605
    .line 606
    :cond_19
    return-void
.end method

.method public final b([BII)V
    .locals 3

    .line 1
    iget-object v0, p0, Lt2/r;->d:Lt2/q;

    .line 2
    .line 3
    iget-boolean v1, v0, Lt2/q;->f:Z

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    add-int/lit8 v1, p2, 0x2

    .line 8
    .line 9
    iget v2, v0, Lt2/q;->d:I

    .line 10
    .line 11
    sub-int/2addr v1, v2

    .line 12
    if-ge v1, p3, :cond_1

    .line 13
    .line 14
    aget-byte v1, p1, v1

    .line 15
    .line 16
    and-int/lit16 v1, v1, 0x80

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v1, v2

    .line 24
    :goto_0
    iput-boolean v1, v0, Lt2/q;->g:Z

    .line 25
    .line 26
    iput-boolean v2, v0, Lt2/q;->f:Z

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    sub-int v1, p3, p2

    .line 30
    .line 31
    add-int/2addr v1, v2

    .line 32
    iput v1, v0, Lt2/q;->d:I

    .line 33
    .line 34
    :cond_2
    :goto_1
    iget-boolean v0, p0, Lt2/r;->e:Z

    .line 35
    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    iget-object v0, p0, Lt2/r;->g:Lt2/x;

    .line 39
    .line 40
    invoke-virtual {v0, p1, p2, p3}, Lt2/x;->a([BII)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lt2/r;->h:Lt2/x;

    .line 44
    .line 45
    invoke-virtual {v0, p1, p2, p3}, Lt2/x;->a([BII)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lt2/r;->i:Lt2/x;

    .line 49
    .line 50
    invoke-virtual {v0, p1, p2, p3}, Lt2/x;->a([BII)V

    .line 51
    .line 52
    .line 53
    :cond_3
    iget-object v0, p0, Lt2/r;->j:Lt2/x;

    .line 54
    .line 55
    invoke-virtual {v0, p1, p2, p3}, Lt2/x;->a([BII)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lt2/r;->k:Lt2/x;

    .line 59
    .line 60
    invoke-virtual {v0, p1, p2, p3}, Lt2/x;->a([BII)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lt2/r;->l:J

    .line 4
    .line 5
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    iput-wide v0, p0, Lt2/r;->m:J

    .line 11
    .line 12
    iget-object v0, p0, Lt2/r;->f:[Z

    .line 13
    .line 14
    invoke-static {v0}, Li1/p;->a([Z)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lt2/r;->g:Lt2/x;

    .line 18
    .line 19
    invoke-virtual {v0}, Lt2/x;->f()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lt2/r;->h:Lt2/x;

    .line 23
    .line 24
    invoke-virtual {v0}, Lt2/x;->f()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lt2/r;->i:Lt2/x;

    .line 28
    .line 29
    invoke-virtual {v0}, Lt2/x;->f()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lt2/r;->j:Lt2/x;

    .line 33
    .line 34
    invoke-virtual {v0}, Lt2/x;->f()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lt2/r;->k:Lt2/x;

    .line 38
    .line 39
    invoke-virtual {v0}, Lt2/x;->f()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lt2/r;->a:La4/c;

    .line 43
    .line 44
    iget-object v0, v0, La4/c;->m:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Li1/s;

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-virtual {v0, v1}, Li1/s;->i(I)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lt2/r;->d:Lt2/q;

    .line 53
    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    iput-boolean v1, v0, Lt2/q;->f:Z

    .line 57
    .line 58
    iput-boolean v1, v0, Lt2/q;->g:Z

    .line 59
    .line 60
    iput-boolean v1, v0, Lt2/q;->h:Z

    .line 61
    .line 62
    iput-boolean v1, v0, Lt2/q;->i:Z

    .line 63
    .line 64
    iput-boolean v1, v0, Lt2/q;->j:Z

    .line 65
    .line 66
    :cond_0
    return-void
.end method

.method public final d(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lt2/r;->c:Ln1/i0;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget v0, Lh1/i0;->a:I

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lt2/r;->a:La4/c;

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
    iget-object p1, p0, Lt2/r;->d:Lt2/q;

    .line 21
    .line 22
    iget-wide v1, p0, Lt2/r;->l:J

    .line 23
    .line 24
    iget-boolean v3, p1, Lt2/q;->c:Z

    .line 25
    .line 26
    iput-boolean v3, p1, Lt2/q;->m:Z

    .line 27
    .line 28
    iget-wide v3, p1, Lt2/q;->b:J

    .line 29
    .line 30
    sub-long v3, v1, v3

    .line 31
    .line 32
    long-to-int v3, v3

    .line 33
    invoke-virtual {p1, v3}, Lt2/q;->a(I)V

    .line 34
    .line 35
    .line 36
    iget-wide v3, p1, Lt2/q;->b:J

    .line 37
    .line 38
    iput-wide v3, p1, Lt2/q;->k:J

    .line 39
    .line 40
    iput-wide v1, p1, Lt2/q;->b:J

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Lt2/q;->a(I)V

    .line 43
    .line 44
    .line 45
    iput-boolean v0, p1, Lt2/q;->i:Z

    .line 46
    .line 47
    :cond_0
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
    iget-object v0, p2, Lt2/g0;->e:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lt2/r;->b:Ljava/lang/String;

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
    iput-object v0, p0, Lt2/r;->c:Ln1/i0;

    .line 22
    .line 23
    new-instance v1, Lt2/q;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lt2/q;-><init>(Ln1/i0;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lt2/r;->d:Lt2/q;

    .line 29
    .line 30
    iget-object v0, p0, Lt2/r;->a:La4/c;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, La4/c;->s(Ln1/p;Lt2/g0;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final f(IJ)V
    .locals 0

    .line 1
    iput-wide p2, p0, Lt2/r;->m:J

    .line 2
    .line 3
    return-void
.end method
