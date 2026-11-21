.class public final Lt2/e;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lt2/h;


# static fields
.field public static final w:[B


# instance fields
.field public final a:Z

.field public final b:Lh1/v;

.field public final c:Lh1/w;

.field public final d:Ljava/lang/String;

.field public final e:I

.field public f:Ljava/lang/String;

.field public g:Ln1/i0;

.field public h:Ln1/i0;

.field public i:I

.field public j:I

.field public k:I

.field public l:Z

.field public m:Z

.field public n:I

.field public o:I

.field public p:I

.field public q:Z

.field public r:J

.field public s:I

.field public t:J

.field public u:Ln1/i0;

.field public v:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Lt2/e;->w:[B

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 1
        0x49t
        0x44t
        0x33t
    .end array-data
.end method

.method public constructor <init>(ILjava/lang/String;Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lh1/v;

    .line 5
    .line 6
    const/4 v1, 0x7

    .line 7
    new-array v2, v1, [B

    .line 8
    .line 9
    invoke-direct {v0, v2, v1}, Lh1/v;-><init>([BI)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lt2/e;->b:Lh1/v;

    .line 13
    .line 14
    new-instance v0, Lh1/w;

    .line 15
    .line 16
    sget-object v1, Lt2/e;->w:[B

    .line 17
    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v0, v1}, Lh1/w;-><init>([B)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lt2/e;->c:Lh1/w;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iput v0, p0, Lt2/e;->i:I

    .line 31
    .line 32
    iput v0, p0, Lt2/e;->j:I

    .line 33
    .line 34
    const/16 v0, 0x100

    .line 35
    .line 36
    iput v0, p0, Lt2/e;->k:I

    .line 37
    .line 38
    const/4 v0, -0x1

    .line 39
    iput v0, p0, Lt2/e;->n:I

    .line 40
    .line 41
    iput v0, p0, Lt2/e;->o:I

    .line 42
    .line 43
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    iput-wide v0, p0, Lt2/e;->r:J

    .line 49
    .line 50
    iput-wide v0, p0, Lt2/e;->t:J

    .line 51
    .line 52
    iput-boolean p3, p0, Lt2/e;->a:Z

    .line 53
    .line 54
    iput-object p2, p0, Lt2/e;->d:Ljava/lang/String;

    .line 55
    .line 56
    iput p1, p0, Lt2/e;->e:I

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final a(Lh1/w;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lt2/e;->g:Ln1/i0;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget v2, Lh1/i0;->a:I

    .line 11
    .line 12
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lh1/w;->a()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-lez v2, :cond_27

    .line 17
    .line 18
    iget v2, v0, Lt2/e;->i:I

    .line 19
    .line 20
    const/16 v3, 0x100

    .line 21
    .line 22
    const/4 v4, -0x1

    .line 23
    const/16 v5, 0xd

    .line 24
    .line 25
    iget-object v6, v0, Lt2/e;->c:Lh1/w;

    .line 26
    .line 27
    const/4 v8, 0x3

    .line 28
    iget-object v9, v0, Lt2/e;->b:Lh1/v;

    .line 29
    .line 30
    const/4 v10, 0x0

    .line 31
    const/4 v11, 0x4

    .line 32
    const/4 v12, 0x2

    .line 33
    const/4 v13, 0x1

    .line 34
    if-eqz v2, :cond_d

    .line 35
    .line 36
    if-eq v2, v13, :cond_9

    .line 37
    .line 38
    const/16 v4, 0xa

    .line 39
    .line 40
    if-eq v2, v12, :cond_8

    .line 41
    .line 42
    if-eq v2, v8, :cond_3

    .line 43
    .line 44
    if-ne v2, v11, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1}, Lh1/w;->a()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    iget v4, v0, Lt2/e;->s:I

    .line 51
    .line 52
    iget v5, v0, Lt2/e;->j:I

    .line 53
    .line 54
    sub-int/2addr v4, v5

    .line 55
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    iget-object v4, v0, Lt2/e;->u:Ln1/i0;

    .line 60
    .line 61
    invoke-interface {v4, v1, v2}, Ln1/i0;->sampleData(Lh1/w;I)V

    .line 62
    .line 63
    .line 64
    iget v4, v0, Lt2/e;->j:I

    .line 65
    .line 66
    add-int/2addr v4, v2

    .line 67
    iput v4, v0, Lt2/e;->j:I

    .line 68
    .line 69
    iget v2, v0, Lt2/e;->s:I

    .line 70
    .line 71
    if-ne v4, v2, :cond_0

    .line 72
    .line 73
    iget-wide v4, v0, Lt2/e;->t:J

    .line 74
    .line 75
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    cmp-long v2, v4, v6

    .line 81
    .line 82
    if-eqz v2, :cond_1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    move v13, v10

    .line 86
    :goto_1
    invoke-static {v13}, Lh1/a;->j(Z)V

    .line 87
    .line 88
    .line 89
    iget-object v14, v0, Lt2/e;->u:Ln1/i0;

    .line 90
    .line 91
    iget-wide v4, v0, Lt2/e;->t:J

    .line 92
    .line 93
    iget v2, v0, Lt2/e;->s:I

    .line 94
    .line 95
    const/16 v19, 0x0

    .line 96
    .line 97
    const/16 v20, 0x0

    .line 98
    .line 99
    const/16 v17, 0x1

    .line 100
    .line 101
    move/from16 v18, v2

    .line 102
    .line 103
    move-wide v15, v4

    .line 104
    invoke-interface/range {v14 .. v20}, Ln1/i0;->sampleMetadata(JIIILn1/h0;)V

    .line 105
    .line 106
    .line 107
    iget-wide v4, v0, Lt2/e;->t:J

    .line 108
    .line 109
    iget-wide v6, v0, Lt2/e;->v:J

    .line 110
    .line 111
    add-long/2addr v4, v6

    .line 112
    iput-wide v4, v0, Lt2/e;->t:J

    .line 113
    .line 114
    iput v10, v0, Lt2/e;->i:I

    .line 115
    .line 116
    iput v10, v0, Lt2/e;->j:I

    .line 117
    .line 118
    iput v3, v0, Lt2/e;->k:I

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 122
    .line 123
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 124
    .line 125
    .line 126
    throw v1

    .line 127
    :cond_3
    iget-boolean v2, v0, Lt2/e;->l:Z

    .line 128
    .line 129
    const/4 v3, 0x5

    .line 130
    if-eqz v2, :cond_4

    .line 131
    .line 132
    const/4 v7, 0x7

    .line 133
    goto :goto_2

    .line 134
    :cond_4
    move v7, v3

    .line 135
    :goto_2
    iget-object v2, v9, Lh1/v;->b:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v2, [B

    .line 138
    .line 139
    invoke-virtual {v1}, Lh1/w;->a()I

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    iget v14, v0, Lt2/e;->j:I

    .line 144
    .line 145
    sub-int v14, v7, v14

    .line 146
    .line 147
    invoke-static {v6, v14}, Ljava/lang/Math;->min(II)I

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    iget v14, v0, Lt2/e;->j:I

    .line 152
    .line 153
    invoke-virtual {v1, v2, v14, v6}, Lh1/w;->e([BII)V

    .line 154
    .line 155
    .line 156
    iget v2, v0, Lt2/e;->j:I

    .line 157
    .line 158
    add-int/2addr v2, v6

    .line 159
    iput v2, v0, Lt2/e;->j:I

    .line 160
    .line 161
    if-ne v2, v7, :cond_0

    .line 162
    .line 163
    invoke-virtual {v9, v10}, Lh1/v;->s(I)V

    .line 164
    .line 165
    .line 166
    iget-boolean v2, v0, Lt2/e;->q:Z

    .line 167
    .line 168
    if-nez v2, :cond_6

    .line 169
    .line 170
    invoke-virtual {v9, v12}, Lh1/v;->k(I)I

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    add-int/2addr v2, v13

    .line 175
    if-eq v2, v12, :cond_5

    .line 176
    .line 177
    new-instance v4, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    const-string v6, "Detected audio object type: "

    .line 180
    .line 181
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    const-string v2, ", but assuming AAC LC."

    .line 188
    .line 189
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    const-string v4, "AdtsReader"

    .line 197
    .line 198
    invoke-static {v4, v2}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    move v2, v12

    .line 202
    :cond_5
    invoke-virtual {v9, v3}, Lh1/v;->v(I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v9, v8}, Lh1/v;->k(I)I

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    iget v4, v0, Lt2/e;->o:I

    .line 210
    .line 211
    invoke-static {v2, v4, v3}, Ln1/b;->a(III)[B

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    new-instance v3, Lh1/v;

    .line 216
    .line 217
    invoke-direct {v3, v2, v12}, Lh1/v;-><init>([BI)V

    .line 218
    .line 219
    .line 220
    invoke-static {v3, v10}, Ln1/b;->n(Lh1/v;Z)Ln1/a;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    new-instance v4, Landroidx/media3/common/v;

    .line 225
    .line 226
    invoke-direct {v4}, Landroidx/media3/common/v;-><init>()V

    .line 227
    .line 228
    .line 229
    iget-object v6, v0, Lt2/e;->f:Ljava/lang/String;

    .line 230
    .line 231
    iput-object v6, v4, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 232
    .line 233
    const-string v6, "audio/mp4a-latm"

    .line 234
    .line 235
    invoke-static {v6}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    iput-object v6, v4, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 240
    .line 241
    iget-object v6, v3, Ln1/a;->a:Ljava/lang/String;

    .line 242
    .line 243
    iput-object v6, v4, Landroidx/media3/common/v;->j:Ljava/lang/String;

    .line 244
    .line 245
    iget v6, v3, Ln1/a;->c:I

    .line 246
    .line 247
    iput v6, v4, Landroidx/media3/common/v;->B:I

    .line 248
    .line 249
    iget v3, v3, Ln1/a;->b:I

    .line 250
    .line 251
    iput v3, v4, Landroidx/media3/common/v;->C:I

    .line 252
    .line 253
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    iput-object v2, v4, Landroidx/media3/common/v;->p:Ljava/util/List;

    .line 258
    .line 259
    iget-object v2, v0, Lt2/e;->d:Ljava/lang/String;

    .line 260
    .line 261
    iput-object v2, v4, Landroidx/media3/common/v;->d:Ljava/lang/String;

    .line 262
    .line 263
    iget v2, v0, Lt2/e;->e:I

    .line 264
    .line 265
    iput v2, v4, Landroidx/media3/common/v;->f:I

    .line 266
    .line 267
    new-instance v2, Landroidx/media3/common/w;

    .line 268
    .line 269
    invoke-direct {v2, v4}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 270
    .line 271
    .line 272
    iget v3, v2, Landroidx/media3/common/w;->D:I

    .line 273
    .line 274
    int-to-long v3, v3

    .line 275
    const-wide/32 v6, 0x3d090000

    .line 276
    .line 277
    .line 278
    div-long/2addr v6, v3

    .line 279
    iput-wide v6, v0, Lt2/e;->r:J

    .line 280
    .line 281
    iget-object v3, v0, Lt2/e;->g:Ln1/i0;

    .line 282
    .line 283
    invoke-interface {v3, v2}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 284
    .line 285
    .line 286
    iput-boolean v13, v0, Lt2/e;->q:Z

    .line 287
    .line 288
    goto :goto_3

    .line 289
    :cond_6
    invoke-virtual {v9, v4}, Lh1/v;->v(I)V

    .line 290
    .line 291
    .line 292
    :goto_3
    invoke-virtual {v9, v11}, Lh1/v;->v(I)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v9, v5}, Lh1/v;->k(I)I

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    add-int/lit8 v3, v2, -0x7

    .line 300
    .line 301
    iget-boolean v4, v0, Lt2/e;->l:Z

    .line 302
    .line 303
    if-eqz v4, :cond_7

    .line 304
    .line 305
    add-int/lit8 v3, v2, -0x9

    .line 306
    .line 307
    :cond_7
    iget-object v2, v0, Lt2/e;->g:Ln1/i0;

    .line 308
    .line 309
    iget-wide v4, v0, Lt2/e;->r:J

    .line 310
    .line 311
    iput v11, v0, Lt2/e;->i:I

    .line 312
    .line 313
    iput v10, v0, Lt2/e;->j:I

    .line 314
    .line 315
    iput-object v2, v0, Lt2/e;->u:Ln1/i0;

    .line 316
    .line 317
    iput-wide v4, v0, Lt2/e;->v:J

    .line 318
    .line 319
    iput v3, v0, Lt2/e;->s:I

    .line 320
    .line 321
    goto/16 :goto_0

    .line 322
    .line 323
    :cond_8
    iget-object v2, v6, Lh1/w;->a:[B

    .line 324
    .line 325
    invoke-virtual {v1}, Lh1/w;->a()I

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    iget v5, v0, Lt2/e;->j:I

    .line 330
    .line 331
    rsub-int/lit8 v5, v5, 0xa

    .line 332
    .line 333
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    iget v5, v0, Lt2/e;->j:I

    .line 338
    .line 339
    invoke-virtual {v1, v2, v5, v3}, Lh1/w;->e([BII)V

    .line 340
    .line 341
    .line 342
    iget v2, v0, Lt2/e;->j:I

    .line 343
    .line 344
    add-int/2addr v2, v3

    .line 345
    iput v2, v0, Lt2/e;->j:I

    .line 346
    .line 347
    if-ne v2, v4, :cond_0

    .line 348
    .line 349
    iget-object v2, v0, Lt2/e;->h:Ln1/i0;

    .line 350
    .line 351
    invoke-interface {v2, v6, v4}, Ln1/i0;->sampleData(Lh1/w;I)V

    .line 352
    .line 353
    .line 354
    const/4 v2, 0x6

    .line 355
    invoke-virtual {v6, v2}, Lh1/w;->G(I)V

    .line 356
    .line 357
    .line 358
    iget-object v2, v0, Lt2/e;->h:Ln1/i0;

    .line 359
    .line 360
    invoke-virtual {v6}, Lh1/w;->t()I

    .line 361
    .line 362
    .line 363
    move-result v3

    .line 364
    add-int/2addr v3, v4

    .line 365
    iput v11, v0, Lt2/e;->i:I

    .line 366
    .line 367
    iput v4, v0, Lt2/e;->j:I

    .line 368
    .line 369
    iput-object v2, v0, Lt2/e;->u:Ln1/i0;

    .line 370
    .line 371
    const-wide/16 v4, 0x0

    .line 372
    .line 373
    iput-wide v4, v0, Lt2/e;->v:J

    .line 374
    .line 375
    iput v3, v0, Lt2/e;->s:I

    .line 376
    .line 377
    goto/16 :goto_0

    .line 378
    .line 379
    :cond_9
    invoke-virtual {v1}, Lh1/w;->a()I

    .line 380
    .line 381
    .line 382
    move-result v2

    .line 383
    if-nez v2, :cond_a

    .line 384
    .line 385
    goto/16 :goto_0

    .line 386
    .line 387
    :cond_a
    iget-object v2, v9, Lh1/v;->b:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v2, [B

    .line 390
    .line 391
    iget-object v5, v1, Lh1/w;->a:[B

    .line 392
    .line 393
    iget v6, v1, Lh1/w;->b:I

    .line 394
    .line 395
    aget-byte v5, v5, v6

    .line 396
    .line 397
    aput-byte v5, v2, v10

    .line 398
    .line 399
    invoke-virtual {v9, v12}, Lh1/v;->s(I)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v9, v11}, Lh1/v;->k(I)I

    .line 403
    .line 404
    .line 405
    move-result v2

    .line 406
    iget v5, v0, Lt2/e;->o:I

    .line 407
    .line 408
    if-eq v5, v4, :cond_b

    .line 409
    .line 410
    if-eq v2, v5, :cond_b

    .line 411
    .line 412
    iput-boolean v10, v0, Lt2/e;->m:Z

    .line 413
    .line 414
    iput v10, v0, Lt2/e;->i:I

    .line 415
    .line 416
    iput v10, v0, Lt2/e;->j:I

    .line 417
    .line 418
    iput v3, v0, Lt2/e;->k:I

    .line 419
    .line 420
    goto/16 :goto_0

    .line 421
    .line 422
    :cond_b
    iget-boolean v3, v0, Lt2/e;->m:Z

    .line 423
    .line 424
    if-nez v3, :cond_c

    .line 425
    .line 426
    iput-boolean v13, v0, Lt2/e;->m:Z

    .line 427
    .line 428
    iget v3, v0, Lt2/e;->p:I

    .line 429
    .line 430
    iput v3, v0, Lt2/e;->n:I

    .line 431
    .line 432
    iput v2, v0, Lt2/e;->o:I

    .line 433
    .line 434
    :cond_c
    iput v8, v0, Lt2/e;->i:I

    .line 435
    .line 436
    iput v10, v0, Lt2/e;->j:I

    .line 437
    .line 438
    goto/16 :goto_0

    .line 439
    .line 440
    :cond_d
    iget-object v2, v1, Lh1/w;->a:[B

    .line 441
    .line 442
    iget v14, v1, Lh1/w;->b:I

    .line 443
    .line 444
    iget v15, v1, Lh1/w;->c:I

    .line 445
    .line 446
    :goto_4
    if-ge v14, v15, :cond_26

    .line 447
    .line 448
    add-int/lit8 v3, v14, 0x1

    .line 449
    .line 450
    move/from16 v17, v8

    .line 451
    .line 452
    aget-byte v8, v2, v14

    .line 453
    .line 454
    and-int/lit16 v7, v8, 0xff

    .line 455
    .line 456
    iget v5, v0, Lt2/e;->k:I

    .line 457
    .line 458
    const/16 v12, 0x200

    .line 459
    .line 460
    if-ne v5, v12, :cond_20

    .line 461
    .line 462
    int-to-byte v5, v7

    .line 463
    and-int/lit16 v5, v5, 0xff

    .line 464
    .line 465
    const v21, 0xff00

    .line 466
    .line 467
    .line 468
    or-int v5, v21, v5

    .line 469
    .line 470
    const v22, 0xfff6

    .line 471
    .line 472
    .line 473
    and-int v5, v5, v22

    .line 474
    .line 475
    const v12, 0xfff0

    .line 476
    .line 477
    .line 478
    if-ne v5, v12, :cond_20

    .line 479
    .line 480
    iget-boolean v5, v0, Lt2/e;->m:Z

    .line 481
    .line 482
    if-nez v5, :cond_1d

    .line 483
    .line 484
    add-int/lit8 v5, v14, -0x1

    .line 485
    .line 486
    invoke-virtual {v1, v14}, Lh1/w;->G(I)V

    .line 487
    .line 488
    .line 489
    iget-object v12, v9, Lh1/v;->b:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast v12, [B

    .line 492
    .line 493
    invoke-virtual {v1}, Lh1/w;->a()I

    .line 494
    .line 495
    .line 496
    move-result v4

    .line 497
    if-ge v4, v13, :cond_e

    .line 498
    .line 499
    :goto_5
    const/4 v10, -0x1

    .line 500
    goto/16 :goto_7

    .line 501
    .line 502
    :cond_e
    invoke-virtual {v1, v12, v10, v13}, Lh1/w;->e([BII)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v9, v11}, Lh1/v;->s(I)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v9, v13}, Lh1/v;->k(I)I

    .line 509
    .line 510
    .line 511
    move-result v4

    .line 512
    iget v12, v0, Lt2/e;->n:I

    .line 513
    .line 514
    const/4 v11, -0x1

    .line 515
    if-eq v12, v11, :cond_f

    .line 516
    .line 517
    if-eq v4, v12, :cond_f

    .line 518
    .line 519
    move v10, v11

    .line 520
    goto/16 :goto_7

    .line 521
    .line 522
    :cond_f
    iget v12, v0, Lt2/e;->o:I

    .line 523
    .line 524
    if-eq v12, v11, :cond_12

    .line 525
    .line 526
    iget-object v11, v9, Lh1/v;->b:Ljava/lang/Object;

    .line 527
    .line 528
    check-cast v11, [B

    .line 529
    .line 530
    invoke-virtual {v1}, Lh1/w;->a()I

    .line 531
    .line 532
    .line 533
    move-result v12

    .line 534
    if-ge v12, v13, :cond_10

    .line 535
    .line 536
    goto/16 :goto_8

    .line 537
    .line 538
    :cond_10
    invoke-virtual {v1, v11, v10, v13}, Lh1/w;->e([BII)V

    .line 539
    .line 540
    .line 541
    const/4 v11, 0x2

    .line 542
    invoke-virtual {v9, v11}, Lh1/v;->s(I)V

    .line 543
    .line 544
    .line 545
    const/4 v11, 0x4

    .line 546
    invoke-virtual {v9, v11}, Lh1/v;->k(I)I

    .line 547
    .line 548
    .line 549
    move-result v12

    .line 550
    iget v13, v0, Lt2/e;->o:I

    .line 551
    .line 552
    if-eq v12, v13, :cond_11

    .line 553
    .line 554
    goto :goto_5

    .line 555
    :cond_11
    invoke-virtual {v1, v3}, Lh1/w;->G(I)V

    .line 556
    .line 557
    .line 558
    goto :goto_6

    .line 559
    :cond_12
    const/4 v11, 0x4

    .line 560
    :goto_6
    iget-object v12, v9, Lh1/v;->b:Ljava/lang/Object;

    .line 561
    .line 562
    check-cast v12, [B

    .line 563
    .line 564
    invoke-virtual {v1}, Lh1/w;->a()I

    .line 565
    .line 566
    .line 567
    move-result v13

    .line 568
    if-ge v13, v11, :cond_13

    .line 569
    .line 570
    goto :goto_8

    .line 571
    :cond_13
    invoke-virtual {v1, v12, v10, v11}, Lh1/w;->e([BII)V

    .line 572
    .line 573
    .line 574
    const/16 v12, 0xe

    .line 575
    .line 576
    invoke-virtual {v9, v12}, Lh1/v;->s(I)V

    .line 577
    .line 578
    .line 579
    const/16 v12, 0xd

    .line 580
    .line 581
    invoke-virtual {v9, v12}, Lh1/v;->k(I)I

    .line 582
    .line 583
    .line 584
    move-result v13

    .line 585
    const/4 v11, 0x7

    .line 586
    if-ge v13, v11, :cond_14

    .line 587
    .line 588
    goto :goto_5

    .line 589
    :cond_14
    iget-object v11, v1, Lh1/w;->a:[B

    .line 590
    .line 591
    iget v12, v1, Lh1/w;->c:I

    .line 592
    .line 593
    add-int/2addr v5, v13

    .line 594
    if-lt v5, v12, :cond_15

    .line 595
    .line 596
    goto :goto_8

    .line 597
    :cond_15
    aget-byte v13, v11, v5

    .line 598
    .line 599
    const/4 v10, -0x1

    .line 600
    if-ne v13, v10, :cond_17

    .line 601
    .line 602
    add-int/lit8 v5, v5, 0x1

    .line 603
    .line 604
    if-ne v5, v12, :cond_16

    .line 605
    .line 606
    goto :goto_8

    .line 607
    :cond_16
    aget-byte v5, v11, v5

    .line 608
    .line 609
    and-int/lit16 v11, v5, 0xff

    .line 610
    .line 611
    or-int v11, v21, v11

    .line 612
    .line 613
    and-int v11, v11, v22

    .line 614
    .line 615
    const v12, 0xfff0

    .line 616
    .line 617
    .line 618
    if-ne v11, v12, :cond_1c

    .line 619
    .line 620
    and-int/lit8 v5, v5, 0x8

    .line 621
    .line 622
    shr-int/lit8 v5, v5, 0x3

    .line 623
    .line 624
    if-ne v5, v4, :cond_1c

    .line 625
    .line 626
    goto :goto_8

    .line 627
    :cond_17
    const/16 v4, 0x49

    .line 628
    .line 629
    if-eq v13, v4, :cond_18

    .line 630
    .line 631
    goto :goto_7

    .line 632
    :cond_18
    add-int/lit8 v4, v5, 0x1

    .line 633
    .line 634
    if-ne v4, v12, :cond_19

    .line 635
    .line 636
    goto :goto_8

    .line 637
    :cond_19
    aget-byte v4, v11, v4

    .line 638
    .line 639
    const/16 v13, 0x44

    .line 640
    .line 641
    if-eq v4, v13, :cond_1a

    .line 642
    .line 643
    goto :goto_7

    .line 644
    :cond_1a
    add-int/lit8 v5, v5, 0x2

    .line 645
    .line 646
    if-ne v5, v12, :cond_1b

    .line 647
    .line 648
    goto :goto_8

    .line 649
    :cond_1b
    aget-byte v4, v11, v5

    .line 650
    .line 651
    const/16 v5, 0x33

    .line 652
    .line 653
    if-ne v4, v5, :cond_1c

    .line 654
    .line 655
    goto :goto_8

    .line 656
    :cond_1c
    :goto_7
    const/4 v4, 0x1

    .line 657
    goto :goto_b

    .line 658
    :cond_1d
    :goto_8
    and-int/lit8 v2, v8, 0x8

    .line 659
    .line 660
    shr-int/lit8 v2, v2, 0x3

    .line 661
    .line 662
    iput v2, v0, Lt2/e;->p:I

    .line 663
    .line 664
    and-int/lit8 v2, v8, 0x1

    .line 665
    .line 666
    if-nez v2, :cond_1e

    .line 667
    .line 668
    const/4 v2, 0x1

    .line 669
    goto :goto_9

    .line 670
    :cond_1e
    const/4 v2, 0x0

    .line 671
    :goto_9
    iput-boolean v2, v0, Lt2/e;->l:Z

    .line 672
    .line 673
    iget-boolean v2, v0, Lt2/e;->m:Z

    .line 674
    .line 675
    if-nez v2, :cond_1f

    .line 676
    .line 677
    const/4 v4, 0x1

    .line 678
    iput v4, v0, Lt2/e;->i:I

    .line 679
    .line 680
    const/4 v2, 0x0

    .line 681
    iput v2, v0, Lt2/e;->j:I

    .line 682
    .line 683
    goto :goto_a

    .line 684
    :cond_1f
    move/from16 v4, v17

    .line 685
    .line 686
    const/4 v2, 0x0

    .line 687
    iput v4, v0, Lt2/e;->i:I

    .line 688
    .line 689
    iput v2, v0, Lt2/e;->j:I

    .line 690
    .line 691
    :goto_a
    invoke-virtual {v1, v3}, Lh1/w;->G(I)V

    .line 692
    .line 693
    .line 694
    goto/16 :goto_0

    .line 695
    .line 696
    :cond_20
    move v10, v4

    .line 697
    move v4, v13

    .line 698
    :goto_b
    iget v5, v0, Lt2/e;->k:I

    .line 699
    .line 700
    or-int/2addr v7, v5

    .line 701
    const/16 v8, 0x149

    .line 702
    .line 703
    if-eq v7, v8, :cond_25

    .line 704
    .line 705
    const/16 v8, 0x1ff

    .line 706
    .line 707
    if-eq v7, v8, :cond_24

    .line 708
    .line 709
    const/16 v8, 0x344

    .line 710
    .line 711
    if-eq v7, v8, :cond_23

    .line 712
    .line 713
    const/16 v8, 0x433

    .line 714
    .line 715
    if-eq v7, v8, :cond_22

    .line 716
    .line 717
    const/16 v7, 0x100

    .line 718
    .line 719
    if-eq v5, v7, :cond_21

    .line 720
    .line 721
    iput v7, v0, Lt2/e;->k:I

    .line 722
    .line 723
    const/4 v5, 0x3

    .line 724
    const/4 v8, 0x0

    .line 725
    const/4 v11, 0x2

    .line 726
    goto :goto_d

    .line 727
    :cond_21
    const/4 v5, 0x3

    .line 728
    const/4 v8, 0x0

    .line 729
    const/4 v11, 0x2

    .line 730
    goto :goto_c

    .line 731
    :cond_22
    const/4 v11, 0x2

    .line 732
    iput v11, v0, Lt2/e;->i:I

    .line 733
    .line 734
    const/4 v5, 0x3

    .line 735
    iput v5, v0, Lt2/e;->j:I

    .line 736
    .line 737
    const/4 v8, 0x0

    .line 738
    iput v8, v0, Lt2/e;->s:I

    .line 739
    .line 740
    invoke-virtual {v6, v8}, Lh1/w;->G(I)V

    .line 741
    .line 742
    .line 743
    invoke-virtual {v1, v3}, Lh1/w;->G(I)V

    .line 744
    .line 745
    .line 746
    goto/16 :goto_0

    .line 747
    .line 748
    :cond_23
    const/4 v5, 0x3

    .line 749
    const/16 v7, 0x100

    .line 750
    .line 751
    const/4 v8, 0x0

    .line 752
    const/4 v11, 0x2

    .line 753
    const/16 v12, 0x400

    .line 754
    .line 755
    iput v12, v0, Lt2/e;->k:I

    .line 756
    .line 757
    goto :goto_c

    .line 758
    :cond_24
    const/4 v5, 0x3

    .line 759
    const/16 v7, 0x100

    .line 760
    .line 761
    const/4 v8, 0x0

    .line 762
    const/4 v11, 0x2

    .line 763
    const/16 v12, 0x200

    .line 764
    .line 765
    iput v12, v0, Lt2/e;->k:I

    .line 766
    .line 767
    goto :goto_c

    .line 768
    :cond_25
    const/4 v5, 0x3

    .line 769
    const/16 v7, 0x100

    .line 770
    .line 771
    const/4 v8, 0x0

    .line 772
    const/4 v11, 0x2

    .line 773
    const/16 v12, 0x300

    .line 774
    .line 775
    iput v12, v0, Lt2/e;->k:I

    .line 776
    .line 777
    :goto_c
    move v14, v3

    .line 778
    :goto_d
    move v13, v4

    .line 779
    move v3, v7

    .line 780
    move v4, v10

    .line 781
    move v12, v11

    .line 782
    const/4 v11, 0x4

    .line 783
    move v10, v8

    .line 784
    move v8, v5

    .line 785
    const/16 v5, 0xd

    .line 786
    .line 787
    goto/16 :goto_4

    .line 788
    .line 789
    :cond_26
    invoke-virtual {v1, v14}, Lh1/w;->G(I)V

    .line 790
    .line 791
    .line 792
    goto/16 :goto_0

    .line 793
    .line 794
    :cond_27
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Lt2/e;->t:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lt2/e;->m:Z

    .line 10
    .line 11
    iput v0, p0, Lt2/e;->i:I

    .line 12
    .line 13
    iput v0, p0, Lt2/e;->j:I

    .line 14
    .line 15
    const/16 v0, 0x100

    .line 16
    .line 17
    iput v0, p0, Lt2/e;->k:I

    .line 18
    .line 19
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
    iget-object v0, p2, Lt2/g0;->e:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lt2/e;->f:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, Lt2/g0;->b()V

    .line 12
    .line 13
    .line 14
    iget v0, p2, Lt2/g0;->d:I

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-interface {p1, v0, v1}, Ln1/p;->track(II)Ln1/i0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lt2/e;->g:Ln1/i0;

    .line 22
    .line 23
    iput-object v0, p0, Lt2/e;->u:Ln1/i0;

    .line 24
    .line 25
    iget-boolean v0, p0, Lt2/e;->a:Z

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p2}, Lt2/g0;->a()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Lt2/g0;->b()V

    .line 33
    .line 34
    .line 35
    iget v0, p2, Lt2/g0;->d:I

    .line 36
    .line 37
    const/4 v1, 0x5

    .line 38
    invoke-interface {p1, v0, v1}, Ln1/p;->track(II)Ln1/i0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Lt2/e;->h:Ln1/i0;

    .line 43
    .line 44
    new-instance v0, Landroidx/media3/common/v;

    .line 45
    .line 46
    invoke-direct {v0}, Landroidx/media3/common/v;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2}, Lt2/g0;->b()V

    .line 50
    .line 51
    .line 52
    iget-object p2, p2, Lt2/g0;->e:Ljava/lang/String;

    .line 53
    .line 54
    iput-object p2, v0, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 55
    .line 56
    const-string p2, "application/id3"

    .line 57
    .line 58
    invoke-static {p2}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    iput-object p2, v0, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 63
    .line 64
    new-instance p2, Landroidx/media3/common/w;

    .line 65
    .line 66
    invoke-direct {p2, v0}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p1, p2}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_0
    new-instance p1, Ln1/m;

    .line 74
    .line 75
    invoke-direct {p1}, Ln1/m;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lt2/e;->h:Ln1/i0;

    .line 79
    .line 80
    return-void
.end method

.method public final f(IJ)V
    .locals 0

    .line 1
    iput-wide p2, p0, Lt2/e;->t:J

    .line 2
    .line 3
    return-void
.end method
