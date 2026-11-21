.class public final Lt1/b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/n;


# instance fields
.field public final a:Lh1/w;

.field public final b:Lh1/w;

.field public final c:Lh1/w;

.field public final d:Lh1/w;

.field public final e:Lt1/c;

.field public f:Ln1/p;

.field public g:I

.field public h:Z

.field public i:J

.field public j:I

.field public k:I

.field public l:I

.field public m:J

.field public n:Z

.field public o:Lt1/a;

.field public p:Lt1/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lh1/w;

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-direct {v0, v1}, Lh1/w;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lt1/b;->a:Lh1/w;

    .line 11
    .line 12
    new-instance v0, Lh1/w;

    .line 13
    .line 14
    const/16 v1, 0x9

    .line 15
    .line 16
    invoke-direct {v0, v1}, Lh1/w;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lt1/b;->b:Lh1/w;

    .line 20
    .line 21
    new-instance v0, Lh1/w;

    .line 22
    .line 23
    const/16 v1, 0xb

    .line 24
    .line 25
    invoke-direct {v0, v1}, Lh1/w;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lt1/b;->c:Lh1/w;

    .line 29
    .line 30
    new-instance v0, Lh1/w;

    .line 31
    .line 32
    invoke-direct {v0}, Lh1/w;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lt1/b;->d:Lh1/w;

    .line 36
    .line 37
    new-instance v0, Lt1/c;

    .line 38
    .line 39
    new-instance v1, Ln1/m;

    .line 40
    .line 41
    invoke-direct {v1}, Ln1/m;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, v1}, Landroidx/lifecycle/o;-><init>(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    iput-wide v1, v0, Lt1/c;->k:J

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    new-array v2, v1, [J

    .line 56
    .line 57
    iput-object v2, v0, Lt1/c;->l:[J

    .line 58
    .line 59
    new-array v1, v1, [J

    .line 60
    .line 61
    iput-object v1, v0, Lt1/c;->m:[J

    .line 62
    .line 63
    iput-object v0, p0, Lt1/b;->e:Lt1/c;

    .line 64
    .line 65
    const/4 v0, 0x1

    .line 66
    iput v0, p0, Lt1/b;->g:I

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final a(Ln1/o;)Lh1/w;
    .locals 5

    .line 1
    iget v0, p0, Lt1/b;->l:I

    .line 2
    .line 3
    iget-object v1, p0, Lt1/b;->d:Lh1/w;

    .line 4
    .line 5
    iget-object v2, v1, Lh1/w;->a:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    const/4 v4, 0x0

    .line 9
    if-le v0, v3, :cond_0

    .line 10
    .line 11
    array-length v2, v2

    .line 12
    mul-int/lit8 v2, v2, 0x2

    .line 13
    .line 14
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    new-array v0, v0, [B

    .line 19
    .line 20
    invoke-virtual {v1, v0, v4}, Lh1/w;->E([BI)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v1, v4}, Lh1/w;->G(I)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget v0, p0, Lt1/b;->l:I

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Lh1/w;->F(I)V

    .line 30
    .line 31
    .line 32
    iget-object v0, v1, Lh1/w;->a:[B

    .line 33
    .line 34
    iget v2, p0, Lt1/b;->l:I

    .line 35
    .line 36
    invoke-interface {p1, v0, v4, v2}, Ln1/o;->readFully([BII)V

    .line 37
    .line 38
    .line 39
    return-object v1
.end method

.method public final init(Ln1/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt1/b;->f:Ln1/p;

    .line 2
    .line 3
    return-void
.end method

.method public final read(Ln1/o;Ln1/a0;)I
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lt1/b;->f:Ln1/p;

    .line 6
    .line 7
    invoke-static {v2}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    :goto_0
    iget v2, v0, Lt1/b;->g:I

    .line 11
    .line 12
    const/16 v3, 0x9

    .line 13
    .line 14
    const/16 v4, 0x8

    .line 15
    .line 16
    const/4 v5, 0x2

    .line 17
    const/4 v6, 0x4

    .line 18
    const/4 v7, 0x1

    .line 19
    if-eq v2, v7, :cond_28

    .line 20
    .line 21
    const/4 v9, 0x3

    .line 22
    if-eq v2, v5, :cond_27

    .line 23
    .line 24
    if-eq v2, v9, :cond_25

    .line 25
    .line 26
    if-ne v2, v6, :cond_24

    .line 27
    .line 28
    iget-boolean v2, v0, Lt1/b;->h:Z

    .line 29
    .line 30
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    iget-object v13, v0, Lt1/b;->e:Lt1/c;

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    iget-wide v14, v0, Lt1/b;->i:J

    .line 40
    .line 41
    iget-wide v11, v0, Lt1/b;->m:J

    .line 42
    .line 43
    add-long/2addr v14, v11

    .line 44
    :goto_1
    move-wide/from16 v17, v14

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    iget-wide v11, v13, Lt1/c;->k:J

    .line 48
    .line 49
    cmp-long v2, v11, v9

    .line 50
    .line 51
    if-nez v2, :cond_2

    .line 52
    .line 53
    const-wide/16 v17, 0x0

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    iget-wide v14, v0, Lt1/b;->m:J

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :goto_2
    iget v2, v0, Lt1/b;->k:I

    .line 60
    .line 61
    if-ne v2, v4, :cond_e

    .line 62
    .line 63
    iget-object v4, v0, Lt1/b;->o:Lt1/a;

    .line 64
    .line 65
    if-eqz v4, :cond_e

    .line 66
    .line 67
    iget-boolean v2, v0, Lt1/b;->n:Z

    .line 68
    .line 69
    if-nez v2, :cond_3

    .line 70
    .line 71
    iget-object v2, v0, Lt1/b;->f:Ln1/p;

    .line 72
    .line 73
    new-instance v3, Ln1/s;

    .line 74
    .line 75
    invoke-direct {v3, v9, v10}, Ln1/s;-><init>(J)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v2, v3}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 79
    .line 80
    .line 81
    iput-boolean v7, v0, Lt1/b;->n:Z

    .line 82
    .line 83
    :cond_3
    iget-object v2, v0, Lt1/b;->o:Lt1/a;

    .line 84
    .line 85
    invoke-virtual/range {p0 .. p1}, Lt1/b;->a(Ln1/o;)Lh1/w;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    iget-object v4, v2, Landroidx/lifecycle/o;->j:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v4, Ln1/i0;

    .line 92
    .line 93
    iget-boolean v11, v2, Lt1/a;->k:Z

    .line 94
    .line 95
    const/4 v12, 0x1

    .line 96
    if-nez v11, :cond_9

    .line 97
    .line 98
    invoke-virtual {v3}, Lh1/w;->u()I

    .line 99
    .line 100
    .line 101
    move-result v11

    .line 102
    shr-int/lit8 v14, v11, 0x4

    .line 103
    .line 104
    and-int/lit8 v14, v14, 0xf

    .line 105
    .line 106
    iput v14, v2, Lt1/a;->m:I

    .line 107
    .line 108
    const/4 v15, 0x2

    .line 109
    if-ne v14, v15, :cond_4

    .line 110
    .line 111
    shr-int/lit8 v11, v11, 0x2

    .line 112
    .line 113
    and-int/lit8 v11, v11, 0x3

    .line 114
    .line 115
    sget-object v14, Lt1/a;->n:[I

    .line 116
    .line 117
    aget v11, v14, v11

    .line 118
    .line 119
    new-instance v14, Landroidx/media3/common/v;

    .line 120
    .line 121
    invoke-direct {v14}, Landroidx/media3/common/v;-><init>()V

    .line 122
    .line 123
    .line 124
    const-string v15, "audio/mpeg"

    .line 125
    .line 126
    invoke-static {v15}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v15

    .line 130
    iput-object v15, v14, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 131
    .line 132
    iput v12, v14, Landroidx/media3/common/v;->B:I

    .line 133
    .line 134
    iput v11, v14, Landroidx/media3/common/v;->C:I

    .line 135
    .line 136
    new-instance v11, Landroidx/media3/common/w;

    .line 137
    .line 138
    invoke-direct {v11, v14}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v4, v11}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 142
    .line 143
    .line 144
    iput-boolean v12, v2, Lt1/a;->l:Z

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_4
    const/4 v11, 0x7

    .line 148
    if-eq v14, v11, :cond_7

    .line 149
    .line 150
    const/16 v15, 0x8

    .line 151
    .line 152
    if-ne v14, v15, :cond_5

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_5
    const/16 v4, 0xa

    .line 156
    .line 157
    if-ne v14, v4, :cond_6

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_6
    new-instance v1, Lt1/d;

    .line 161
    .line 162
    new-instance v3, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    const-string v4, "Audio format not supported: "

    .line 165
    .line 166
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    iget v2, v2, Lt1/a;->m:I

    .line 170
    .line 171
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-direct {v1, v2}, Lt1/d;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw v1

    .line 182
    :cond_7
    :goto_3
    if-ne v14, v11, :cond_8

    .line 183
    .line 184
    const-string v11, "audio/g711-alaw"

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_8
    const-string v11, "audio/g711-mlaw"

    .line 188
    .line 189
    :goto_4
    new-instance v14, Landroidx/media3/common/v;

    .line 190
    .line 191
    invoke-direct {v14}, Landroidx/media3/common/v;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-static {v11}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v11

    .line 198
    iput-object v11, v14, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 199
    .line 200
    iput v12, v14, Landroidx/media3/common/v;->B:I

    .line 201
    .line 202
    const/16 v11, 0x1f40

    .line 203
    .line 204
    iput v11, v14, Landroidx/media3/common/v;->C:I

    .line 205
    .line 206
    new-instance v11, Landroidx/media3/common/w;

    .line 207
    .line 208
    invoke-direct {v11, v14}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 209
    .line 210
    .line 211
    invoke-interface {v4, v11}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 212
    .line 213
    .line 214
    iput-boolean v12, v2, Lt1/a;->l:Z

    .line 215
    .line 216
    :goto_5
    iput-boolean v12, v2, Lt1/a;->k:Z

    .line 217
    .line 218
    goto :goto_6

    .line 219
    :cond_9
    invoke-virtual {v3, v12}, Lh1/w;->H(I)V

    .line 220
    .line 221
    .line 222
    :goto_6
    iget-object v4, v2, Landroidx/lifecycle/o;->j:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v4, Ln1/i0;

    .line 225
    .line 226
    iget v11, v2, Lt1/a;->m:I

    .line 227
    .line 228
    const/4 v12, 0x2

    .line 229
    const/4 v14, 0x1

    .line 230
    if-ne v11, v12, :cond_a

    .line 231
    .line 232
    invoke-virtual {v3}, Lh1/w;->a()I

    .line 233
    .line 234
    .line 235
    move-result v11

    .line 236
    invoke-interface {v4, v3, v11}, Ln1/i0;->sampleData(Lh1/w;I)V

    .line 237
    .line 238
    .line 239
    iget-object v2, v2, Landroidx/lifecycle/o;->j:Ljava/lang/Object;

    .line 240
    .line 241
    move-object/from16 v16, v2

    .line 242
    .line 243
    check-cast v16, Ln1/i0;

    .line 244
    .line 245
    const/16 v21, 0x0

    .line 246
    .line 247
    const/16 v22, 0x0

    .line 248
    .line 249
    const/16 v19, 0x1

    .line 250
    .line 251
    move/from16 v20, v11

    .line 252
    .line 253
    invoke-interface/range {v16 .. v22}, Ln1/i0;->sampleMetadata(JIIILn1/h0;)V

    .line 254
    .line 255
    .line 256
    goto :goto_7

    .line 257
    :cond_a
    invoke-virtual {v3}, Lh1/w;->u()I

    .line 258
    .line 259
    .line 260
    move-result v11

    .line 261
    const/4 v12, 0x0

    .line 262
    if-nez v11, :cond_c

    .line 263
    .line 264
    iget-boolean v15, v2, Lt1/a;->l:Z

    .line 265
    .line 266
    if-nez v15, :cond_c

    .line 267
    .line 268
    invoke-virtual {v3}, Lh1/w;->a()I

    .line 269
    .line 270
    .line 271
    move-result v11

    .line 272
    new-array v15, v11, [B

    .line 273
    .line 274
    invoke-virtual {v3, v15, v12, v11}, Lh1/w;->e([BII)V

    .line 275
    .line 276
    .line 277
    new-instance v3, Lh1/v;

    .line 278
    .line 279
    invoke-direct {v3, v15, v11}, Lh1/v;-><init>([BI)V

    .line 280
    .line 281
    .line 282
    invoke-static {v3, v12}, Ln1/b;->n(Lh1/v;Z)Ln1/a;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    new-instance v11, Landroidx/media3/common/v;

    .line 287
    .line 288
    invoke-direct {v11}, Landroidx/media3/common/v;-><init>()V

    .line 289
    .line 290
    .line 291
    const-string v16, "audio/mp4a-latm"

    .line 292
    .line 293
    invoke-static/range {v16 .. v16}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v12

    .line 297
    iput-object v12, v11, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 298
    .line 299
    iget-object v12, v3, Ln1/a;->a:Ljava/lang/String;

    .line 300
    .line 301
    iput-object v12, v11, Landroidx/media3/common/v;->j:Ljava/lang/String;

    .line 302
    .line 303
    iget v12, v3, Ln1/a;->c:I

    .line 304
    .line 305
    iput v12, v11, Landroidx/media3/common/v;->B:I

    .line 306
    .line 307
    iget v3, v3, Ln1/a;->b:I

    .line 308
    .line 309
    iput v3, v11, Landroidx/media3/common/v;->C:I

    .line 310
    .line 311
    invoke-static {v15}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    iput-object v3, v11, Landroidx/media3/common/v;->p:Ljava/util/List;

    .line 316
    .line 317
    new-instance v3, Landroidx/media3/common/w;

    .line 318
    .line 319
    invoke-direct {v3, v11}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 320
    .line 321
    .line 322
    invoke-interface {v4, v3}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 323
    .line 324
    .line 325
    iput-boolean v14, v2, Lt1/a;->l:Z

    .line 326
    .line 327
    :cond_b
    const/4 v14, 0x0

    .line 328
    goto :goto_7

    .line 329
    :cond_c
    iget v12, v2, Lt1/a;->m:I

    .line 330
    .line 331
    const/16 v15, 0xa

    .line 332
    .line 333
    if-ne v12, v15, :cond_d

    .line 334
    .line 335
    if-ne v11, v14, :cond_b

    .line 336
    .line 337
    :cond_d
    invoke-virtual {v3}, Lh1/w;->a()I

    .line 338
    .line 339
    .line 340
    move-result v11

    .line 341
    invoke-interface {v4, v3, v11}, Ln1/i0;->sampleData(Lh1/w;I)V

    .line 342
    .line 343
    .line 344
    iget-object v2, v2, Landroidx/lifecycle/o;->j:Ljava/lang/Object;

    .line 345
    .line 346
    move-object/from16 v16, v2

    .line 347
    .line 348
    check-cast v16, Ln1/i0;

    .line 349
    .line 350
    const/16 v21, 0x0

    .line 351
    .line 352
    const/16 v22, 0x0

    .line 353
    .line 354
    const/16 v19, 0x1

    .line 355
    .line 356
    move/from16 v20, v11

    .line 357
    .line 358
    invoke-interface/range {v16 .. v22}, Ln1/i0;->sampleMetadata(JIIILn1/h0;)V

    .line 359
    .line 360
    .line 361
    :goto_7
    move v2, v7

    .line 362
    move-wide/from16 v19, v9

    .line 363
    .line 364
    const/16 p2, 0x0

    .line 365
    .line 366
    goto/16 :goto_10

    .line 367
    .line 368
    :cond_e
    if-ne v2, v3, :cond_18

    .line 369
    .line 370
    iget-object v3, v0, Lt1/b;->p:Lt1/e;

    .line 371
    .line 372
    if-eqz v3, :cond_18

    .line 373
    .line 374
    iget-boolean v2, v0, Lt1/b;->n:Z

    .line 375
    .line 376
    if-nez v2, :cond_f

    .line 377
    .line 378
    iget-object v2, v0, Lt1/b;->f:Ln1/p;

    .line 379
    .line 380
    new-instance v3, Ln1/s;

    .line 381
    .line 382
    invoke-direct {v3, v9, v10}, Ln1/s;-><init>(J)V

    .line 383
    .line 384
    .line 385
    invoke-interface {v2, v3}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 386
    .line 387
    .line 388
    iput-boolean v7, v0, Lt1/b;->n:Z

    .line 389
    .line 390
    :cond_f
    iget-object v2, v0, Lt1/b;->p:Lt1/e;

    .line 391
    .line 392
    invoke-virtual/range {p0 .. p1}, Lt1/b;->a(Ln1/o;)Lh1/w;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v3}, Lh1/w;->u()I

    .line 400
    .line 401
    .line 402
    move-result v4

    .line 403
    shr-int/lit8 v11, v4, 0x4

    .line 404
    .line 405
    and-int/lit8 v11, v11, 0xf

    .line 406
    .line 407
    and-int/lit8 v4, v4, 0xf

    .line 408
    .line 409
    const/4 v12, 0x7

    .line 410
    if-ne v4, v12, :cond_17

    .line 411
    .line 412
    iput v11, v2, Lt1/e;->p:I

    .line 413
    .line 414
    const/4 v4, 0x5

    .line 415
    if-eq v11, v4, :cond_10

    .line 416
    .line 417
    const/4 v4, 0x1

    .line 418
    goto :goto_8

    .line 419
    :cond_10
    const/4 v4, 0x0

    .line 420
    :goto_8
    if-eqz v4, :cond_16

    .line 421
    .line 422
    iget-object v4, v2, Lt1/e;->k:Lh1/w;

    .line 423
    .line 424
    iget-object v11, v2, Landroidx/lifecycle/o;->j:Ljava/lang/Object;

    .line 425
    .line 426
    check-cast v11, Ln1/i0;

    .line 427
    .line 428
    iget-object v12, v2, Lt1/e;->l:Lh1/w;

    .line 429
    .line 430
    invoke-virtual {v3}, Lh1/w;->u()I

    .line 431
    .line 432
    .line 433
    move-result v14

    .line 434
    iget-object v15, v3, Lh1/w;->a:[B

    .line 435
    .line 436
    move-wide/from16 v19, v9

    .line 437
    .line 438
    iget v9, v3, Lh1/w;->b:I

    .line 439
    .line 440
    add-int/lit8 v10, v9, 0x1

    .line 441
    .line 442
    iput v10, v3, Lh1/w;->b:I

    .line 443
    .line 444
    const/16 p2, 0x0

    .line 445
    .line 446
    aget-byte v8, v15, v9

    .line 447
    .line 448
    and-int/lit16 v8, v8, 0xff

    .line 449
    .line 450
    shl-int/lit8 v8, v8, 0x18

    .line 451
    .line 452
    shr-int/lit8 v8, v8, 0x8

    .line 453
    .line 454
    add-int/lit8 v5, v9, 0x2

    .line 455
    .line 456
    iput v5, v3, Lh1/w;->b:I

    .line 457
    .line 458
    aget-byte v10, v15, v10

    .line 459
    .line 460
    and-int/lit16 v10, v10, 0xff

    .line 461
    .line 462
    shl-int/lit8 v10, v10, 0x8

    .line 463
    .line 464
    or-int/2addr v8, v10

    .line 465
    add-int/lit8 v9, v9, 0x3

    .line 466
    .line 467
    iput v9, v3, Lh1/w;->b:I

    .line 468
    .line 469
    aget-byte v5, v15, v5

    .line 470
    .line 471
    and-int/lit16 v5, v5, 0xff

    .line 472
    .line 473
    or-int/2addr v5, v8

    .line 474
    int-to-long v8, v5

    .line 475
    const-wide/16 v21, 0x3e8

    .line 476
    .line 477
    mul-long v8, v8, v21

    .line 478
    .line 479
    add-long v22, v8, v17

    .line 480
    .line 481
    const/4 v5, 0x0

    .line 482
    const/4 v8, 0x1

    .line 483
    if-nez v14, :cond_11

    .line 484
    .line 485
    iget-boolean v9, v2, Lt1/e;->n:Z

    .line 486
    .line 487
    if-nez v9, :cond_11

    .line 488
    .line 489
    new-instance v4, Lh1/w;

    .line 490
    .line 491
    invoke-virtual {v3}, Lh1/w;->a()I

    .line 492
    .line 493
    .line 494
    move-result v9

    .line 495
    new-array v9, v9, [B

    .line 496
    .line 497
    invoke-direct {v4, v9}, Lh1/w;-><init>([B)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v3}, Lh1/w;->a()I

    .line 501
    .line 502
    .line 503
    move-result v10

    .line 504
    invoke-virtual {v3, v9, v5, v10}, Lh1/w;->e([BII)V

    .line 505
    .line 506
    .line 507
    invoke-static {v4}, Ln1/d;->a(Lh1/w;)Ln1/d;

    .line 508
    .line 509
    .line 510
    move-result-object v3

    .line 511
    iget v4, v3, Ln1/d;->b:I

    .line 512
    .line 513
    iput v4, v2, Lt1/e;->m:I

    .line 514
    .line 515
    new-instance v4, Landroidx/media3/common/v;

    .line 516
    .line 517
    invoke-direct {v4}, Landroidx/media3/common/v;-><init>()V

    .line 518
    .line 519
    .line 520
    const-string v9, "video/avc"

    .line 521
    .line 522
    invoke-static {v9}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v9

    .line 526
    iput-object v9, v4, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 527
    .line 528
    iget-object v9, v3, Ln1/d;->l:Ljava/lang/String;

    .line 529
    .line 530
    iput-object v9, v4, Landroidx/media3/common/v;->j:Ljava/lang/String;

    .line 531
    .line 532
    iget v9, v3, Ln1/d;->c:I

    .line 533
    .line 534
    iput v9, v4, Landroidx/media3/common/v;->t:I

    .line 535
    .line 536
    iget v9, v3, Ln1/d;->d:I

    .line 537
    .line 538
    iput v9, v4, Landroidx/media3/common/v;->u:I

    .line 539
    .line 540
    iget v9, v3, Ln1/d;->k:F

    .line 541
    .line 542
    iput v9, v4, Landroidx/media3/common/v;->x:F

    .line 543
    .line 544
    iget-object v3, v3, Ln1/d;->a:Ljava/util/ArrayList;

    .line 545
    .line 546
    iput-object v3, v4, Landroidx/media3/common/v;->p:Ljava/util/List;

    .line 547
    .line 548
    new-instance v3, Landroidx/media3/common/w;

    .line 549
    .line 550
    invoke-direct {v3, v4}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 551
    .line 552
    .line 553
    invoke-interface {v11, v3}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 554
    .line 555
    .line 556
    iput-boolean v8, v2, Lt1/e;->n:Z

    .line 557
    .line 558
    goto :goto_b

    .line 559
    :cond_11
    if-ne v14, v8, :cond_15

    .line 560
    .line 561
    iget-boolean v9, v2, Lt1/e;->n:Z

    .line 562
    .line 563
    if-eqz v9, :cond_15

    .line 564
    .line 565
    iget v9, v2, Lt1/e;->p:I

    .line 566
    .line 567
    if-ne v9, v8, :cond_12

    .line 568
    .line 569
    move/from16 v24, v8

    .line 570
    .line 571
    goto :goto_9

    .line 572
    :cond_12
    move/from16 v24, v5

    .line 573
    .line 574
    :goto_9
    iget-boolean v9, v2, Lt1/e;->o:Z

    .line 575
    .line 576
    if-nez v9, :cond_13

    .line 577
    .line 578
    if-nez v24, :cond_13

    .line 579
    .line 580
    goto :goto_b

    .line 581
    :cond_13
    iget-object v9, v12, Lh1/w;->a:[B

    .line 582
    .line 583
    aput-byte v5, v9, v5

    .line 584
    .line 585
    aput-byte v5, v9, v8

    .line 586
    .line 587
    const/4 v10, 0x2

    .line 588
    aput-byte v5, v9, v10

    .line 589
    .line 590
    iget v9, v2, Lt1/e;->m:I

    .line 591
    .line 592
    const/4 v10, 0x4

    .line 593
    rsub-int/lit8 v9, v9, 0x4

    .line 594
    .line 595
    move/from16 v25, v5

    .line 596
    .line 597
    :goto_a
    invoke-virtual {v3}, Lh1/w;->a()I

    .line 598
    .line 599
    .line 600
    move-result v14

    .line 601
    if-lez v14, :cond_14

    .line 602
    .line 603
    iget-object v14, v12, Lh1/w;->a:[B

    .line 604
    .line 605
    iget v15, v2, Lt1/e;->m:I

    .line 606
    .line 607
    invoke-virtual {v3, v14, v9, v15}, Lh1/w;->e([BII)V

    .line 608
    .line 609
    .line 610
    invoke-virtual {v12, v5}, Lh1/w;->G(I)V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v12}, Lh1/w;->y()I

    .line 614
    .line 615
    .line 616
    move-result v14

    .line 617
    invoke-virtual {v4, v5}, Lh1/w;->G(I)V

    .line 618
    .line 619
    .line 620
    invoke-interface {v11, v4, v10}, Ln1/i0;->sampleData(Lh1/w;I)V

    .line 621
    .line 622
    .line 623
    add-int/lit8 v25, v25, 0x4

    .line 624
    .line 625
    invoke-interface {v11, v3, v14}, Ln1/i0;->sampleData(Lh1/w;I)V

    .line 626
    .line 627
    .line 628
    add-int v25, v25, v14

    .line 629
    .line 630
    goto :goto_a

    .line 631
    :cond_14
    iget-object v3, v2, Landroidx/lifecycle/o;->j:Ljava/lang/Object;

    .line 632
    .line 633
    move-object/from16 v21, v3

    .line 634
    .line 635
    check-cast v21, Ln1/i0;

    .line 636
    .line 637
    const/16 v26, 0x0

    .line 638
    .line 639
    const/16 v27, 0x0

    .line 640
    .line 641
    invoke-interface/range {v21 .. v27}, Ln1/i0;->sampleMetadata(JIIILn1/h0;)V

    .line 642
    .line 643
    .line 644
    iput-boolean v8, v2, Lt1/e;->o:Z

    .line 645
    .line 646
    move v5, v8

    .line 647
    :cond_15
    :goto_b
    if-eqz v5, :cond_20

    .line 648
    .line 649
    move v14, v7

    .line 650
    goto :goto_c

    .line 651
    :cond_16
    move-wide/from16 v19, v9

    .line 652
    .line 653
    const/16 p2, 0x0

    .line 654
    .line 655
    goto/16 :goto_f

    .line 656
    .line 657
    :goto_c
    move v2, v7

    .line 658
    goto/16 :goto_10

    .line 659
    .line 660
    :cond_17
    new-instance v1, Lt1/d;

    .line 661
    .line 662
    const-string v2, "Video format not supported: "

    .line 663
    .line 664
    invoke-static {v4, v2}, La1/a1;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v2

    .line 668
    invoke-direct {v1, v2}, Lt1/d;-><init>(Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    throw v1

    .line 672
    :cond_18
    move-wide/from16 v19, v9

    .line 673
    .line 674
    const/16 p2, 0x0

    .line 675
    .line 676
    const/16 v3, 0x12

    .line 677
    .line 678
    if-ne v2, v3, :cond_21

    .line 679
    .line 680
    iget-boolean v2, v0, Lt1/b;->n:Z

    .line 681
    .line 682
    if-nez v2, :cond_21

    .line 683
    .line 684
    invoke-virtual/range {p0 .. p1}, Lt1/b;->a(Ln1/o;)Lh1/w;

    .line 685
    .line 686
    .line 687
    move-result-object v2

    .line 688
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 689
    .line 690
    .line 691
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 692
    .line 693
    .line 694
    invoke-virtual {v2}, Lh1/w;->u()I

    .line 695
    .line 696
    .line 697
    move-result v3

    .line 698
    const/4 v4, 0x2

    .line 699
    if-eq v3, v4, :cond_19

    .line 700
    .line 701
    goto/16 :goto_e

    .line 702
    .line 703
    :cond_19
    invoke-static {v2}, Lt1/c;->l(Lh1/w;)Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v3

    .line 707
    const-string v4, "onMetaData"

    .line 708
    .line 709
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 710
    .line 711
    .line 712
    move-result v3

    .line 713
    if-nez v3, :cond_1a

    .line 714
    .line 715
    goto/16 :goto_e

    .line 716
    .line 717
    :cond_1a
    invoke-virtual {v2}, Lh1/w;->a()I

    .line 718
    .line 719
    .line 720
    move-result v3

    .line 721
    if-nez v3, :cond_1b

    .line 722
    .line 723
    goto/16 :goto_e

    .line 724
    .line 725
    :cond_1b
    invoke-virtual {v2}, Lh1/w;->u()I

    .line 726
    .line 727
    .line 728
    move-result v3

    .line 729
    const/16 v4, 0x8

    .line 730
    .line 731
    if-eq v3, v4, :cond_1c

    .line 732
    .line 733
    goto/16 :goto_e

    .line 734
    .line 735
    :cond_1c
    invoke-static {v2}, Lt1/c;->k(Lh1/w;)Ljava/util/HashMap;

    .line 736
    .line 737
    .line 738
    move-result-object v2

    .line 739
    const-string v3, "duration"

    .line 740
    .line 741
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v3

    .line 745
    instance-of v4, v3, Ljava/lang/Double;

    .line 746
    .line 747
    const-wide v8, 0x412e848000000000L    # 1000000.0

    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    if-eqz v4, :cond_1d

    .line 753
    .line 754
    check-cast v3, Ljava/lang/Double;

    .line 755
    .line 756
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 757
    .line 758
    .line 759
    move-result-wide v3

    .line 760
    const-wide/16 v10, 0x0

    .line 761
    .line 762
    cmpl-double v5, v3, v10

    .line 763
    .line 764
    if-lez v5, :cond_1d

    .line 765
    .line 766
    mul-double/2addr v3, v8

    .line 767
    double-to-long v3, v3

    .line 768
    iput-wide v3, v13, Lt1/c;->k:J

    .line 769
    .line 770
    :cond_1d
    const-string v3, "keyframes"

    .line 771
    .line 772
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 773
    .line 774
    .line 775
    move-result-object v2

    .line 776
    instance-of v3, v2, Ljava/util/Map;

    .line 777
    .line 778
    if-eqz v3, :cond_1f

    .line 779
    .line 780
    check-cast v2, Ljava/util/Map;

    .line 781
    .line 782
    const-string v3, "filepositions"

    .line 783
    .line 784
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v3

    .line 788
    const-string v4, "times"

    .line 789
    .line 790
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v2

    .line 794
    instance-of v4, v3, Ljava/util/List;

    .line 795
    .line 796
    if-eqz v4, :cond_1f

    .line 797
    .line 798
    instance-of v4, v2, Ljava/util/List;

    .line 799
    .line 800
    if-eqz v4, :cond_1f

    .line 801
    .line 802
    check-cast v3, Ljava/util/List;

    .line 803
    .line 804
    check-cast v2, Ljava/util/List;

    .line 805
    .line 806
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 807
    .line 808
    .line 809
    move-result v4

    .line 810
    new-array v5, v4, [J

    .line 811
    .line 812
    iput-object v5, v13, Lt1/c;->l:[J

    .line 813
    .line 814
    new-array v5, v4, [J

    .line 815
    .line 816
    iput-object v5, v13, Lt1/c;->m:[J

    .line 817
    .line 818
    const/4 v5, 0x0

    .line 819
    move v10, v5

    .line 820
    :goto_d
    if-ge v10, v4, :cond_1f

    .line 821
    .line 822
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v11

    .line 826
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object v12

    .line 830
    instance-of v14, v12, Ljava/lang/Double;

    .line 831
    .line 832
    if-eqz v14, :cond_1e

    .line 833
    .line 834
    instance-of v14, v11, Ljava/lang/Double;

    .line 835
    .line 836
    if-eqz v14, :cond_1e

    .line 837
    .line 838
    iget-object v14, v13, Lt1/c;->l:[J

    .line 839
    .line 840
    check-cast v12, Ljava/lang/Double;

    .line 841
    .line 842
    invoke-virtual {v12}, Ljava/lang/Double;->doubleValue()D

    .line 843
    .line 844
    .line 845
    move-result-wide v17

    .line 846
    move-wide/from16 v21, v8

    .line 847
    .line 848
    mul-double v8, v17, v21

    .line 849
    .line 850
    double-to-long v8, v8

    .line 851
    aput-wide v8, v14, v10

    .line 852
    .line 853
    iget-object v8, v13, Lt1/c;->m:[J

    .line 854
    .line 855
    check-cast v11, Ljava/lang/Double;

    .line 856
    .line 857
    invoke-virtual {v11}, Ljava/lang/Double;->longValue()J

    .line 858
    .line 859
    .line 860
    move-result-wide v11

    .line 861
    aput-wide v11, v8, v10

    .line 862
    .line 863
    add-int/lit8 v10, v10, 0x1

    .line 864
    .line 865
    move-wide/from16 v8, v21

    .line 866
    .line 867
    goto :goto_d

    .line 868
    :cond_1e
    new-array v2, v5, [J

    .line 869
    .line 870
    iput-object v2, v13, Lt1/c;->l:[J

    .line 871
    .line 872
    new-array v2, v5, [J

    .line 873
    .line 874
    iput-object v2, v13, Lt1/c;->m:[J

    .line 875
    .line 876
    :cond_1f
    :goto_e
    iget-wide v2, v13, Lt1/c;->k:J

    .line 877
    .line 878
    cmp-long v4, v2, v19

    .line 879
    .line 880
    if-eqz v4, :cond_20

    .line 881
    .line 882
    iget-object v4, v0, Lt1/b;->f:Ln1/p;

    .line 883
    .line 884
    new-instance v5, Ln1/y;

    .line 885
    .line 886
    iget-object v8, v13, Lt1/c;->m:[J

    .line 887
    .line 888
    iget-object v9, v13, Lt1/c;->l:[J

    .line 889
    .line 890
    invoke-direct {v5, v2, v3, v8, v9}, Ln1/y;-><init>(J[J[J)V

    .line 891
    .line 892
    .line 893
    invoke-interface {v4, v5}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 894
    .line 895
    .line 896
    iput-boolean v7, v0, Lt1/b;->n:Z

    .line 897
    .line 898
    :cond_20
    :goto_f
    move/from16 v14, p2

    .line 899
    .line 900
    goto/16 :goto_c

    .line 901
    .line 902
    :cond_21
    iget v2, v0, Lt1/b;->l:I

    .line 903
    .line 904
    invoke-interface {v1, v2}, Ln1/o;->h(I)V

    .line 905
    .line 906
    .line 907
    move/from16 v2, p2

    .line 908
    .line 909
    move v14, v2

    .line 910
    :goto_10
    iget-boolean v3, v0, Lt1/b;->h:Z

    .line 911
    .line 912
    if-nez v3, :cond_23

    .line 913
    .line 914
    if-eqz v14, :cond_23

    .line 915
    .line 916
    iput-boolean v7, v0, Lt1/b;->h:Z

    .line 917
    .line 918
    iget-wide v3, v13, Lt1/c;->k:J

    .line 919
    .line 920
    cmp-long v3, v3, v19

    .line 921
    .line 922
    if-nez v3, :cond_22

    .line 923
    .line 924
    iget-wide v3, v0, Lt1/b;->m:J

    .line 925
    .line 926
    neg-long v11, v3

    .line 927
    goto :goto_11

    .line 928
    :cond_22
    const-wide/16 v11, 0x0

    .line 929
    .line 930
    :goto_11
    iput-wide v11, v0, Lt1/b;->i:J

    .line 931
    .line 932
    :cond_23
    iput v6, v0, Lt1/b;->j:I

    .line 933
    .line 934
    const/4 v3, 0x2

    .line 935
    iput v3, v0, Lt1/b;->g:I

    .line 936
    .line 937
    if-eqz v2, :cond_0

    .line 938
    .line 939
    return p2

    .line 940
    :cond_24
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 941
    .line 942
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 943
    .line 944
    .line 945
    throw v1

    .line 946
    :cond_25
    const/16 p2, 0x0

    .line 947
    .line 948
    iget-object v2, v0, Lt1/b;->c:Lh1/w;

    .line 949
    .line 950
    iget-object v3, v2, Lh1/w;->a:[B

    .line 951
    .line 952
    const/16 v4, 0xb

    .line 953
    .line 954
    move/from16 v5, p2

    .line 955
    .line 956
    invoke-interface {v1, v3, v5, v4, v7}, Ln1/o;->a([BIIZ)Z

    .line 957
    .line 958
    .line 959
    move-result v3

    .line 960
    if-nez v3, :cond_26

    .line 961
    .line 962
    goto :goto_12

    .line 963
    :cond_26
    invoke-virtual {v2, v5}, Lh1/w;->G(I)V

    .line 964
    .line 965
    .line 966
    invoke-virtual {v2}, Lh1/w;->u()I

    .line 967
    .line 968
    .line 969
    move-result v3

    .line 970
    iput v3, v0, Lt1/b;->k:I

    .line 971
    .line 972
    invoke-virtual {v2}, Lh1/w;->x()I

    .line 973
    .line 974
    .line 975
    move-result v3

    .line 976
    iput v3, v0, Lt1/b;->l:I

    .line 977
    .line 978
    invoke-virtual {v2}, Lh1/w;->x()I

    .line 979
    .line 980
    .line 981
    move-result v3

    .line 982
    int-to-long v3, v3

    .line 983
    iput-wide v3, v0, Lt1/b;->m:J

    .line 984
    .line 985
    invoke-virtual {v2}, Lh1/w;->u()I

    .line 986
    .line 987
    .line 988
    move-result v3

    .line 989
    shl-int/lit8 v3, v3, 0x18

    .line 990
    .line 991
    int-to-long v3, v3

    .line 992
    iget-wide v7, v0, Lt1/b;->m:J

    .line 993
    .line 994
    or-long/2addr v3, v7

    .line 995
    const-wide/16 v7, 0x3e8

    .line 996
    .line 997
    mul-long/2addr v3, v7

    .line 998
    iput-wide v3, v0, Lt1/b;->m:J

    .line 999
    .line 1000
    invoke-virtual {v2, v9}, Lh1/w;->H(I)V

    .line 1001
    .line 1002
    .line 1003
    iput v6, v0, Lt1/b;->g:I

    .line 1004
    .line 1005
    goto/16 :goto_0

    .line 1006
    .line 1007
    :cond_27
    iget v2, v0, Lt1/b;->j:I

    .line 1008
    .line 1009
    invoke-interface {v1, v2}, Ln1/o;->h(I)V

    .line 1010
    .line 1011
    .line 1012
    const/4 v5, 0x0

    .line 1013
    iput v5, v0, Lt1/b;->j:I

    .line 1014
    .line 1015
    iput v9, v0, Lt1/b;->g:I

    .line 1016
    .line 1017
    goto/16 :goto_0

    .line 1018
    .line 1019
    :cond_28
    const/4 v5, 0x0

    .line 1020
    iget-object v2, v0, Lt1/b;->b:Lh1/w;

    .line 1021
    .line 1022
    iget-object v8, v2, Lh1/w;->a:[B

    .line 1023
    .line 1024
    invoke-interface {v1, v8, v5, v3, v7}, Ln1/o;->a([BIIZ)Z

    .line 1025
    .line 1026
    .line 1027
    move-result v8

    .line 1028
    if-nez v8, :cond_29

    .line 1029
    .line 1030
    :goto_12
    const/4 v1, -0x1

    .line 1031
    return v1

    .line 1032
    :cond_29
    invoke-virtual {v2, v5}, Lh1/w;->G(I)V

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual {v2, v6}, Lh1/w;->H(I)V

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual {v2}, Lh1/w;->u()I

    .line 1039
    .line 1040
    .line 1041
    move-result v6

    .line 1042
    and-int/lit8 v8, v6, 0x4

    .line 1043
    .line 1044
    if-eqz v8, :cond_2a

    .line 1045
    .line 1046
    move v8, v7

    .line 1047
    goto :goto_13

    .line 1048
    :cond_2a
    move v8, v5

    .line 1049
    :goto_13
    and-int/lit8 v6, v6, 0x1

    .line 1050
    .line 1051
    if-eqz v6, :cond_2b

    .line 1052
    .line 1053
    move v5, v7

    .line 1054
    :cond_2b
    if-eqz v8, :cond_2c

    .line 1055
    .line 1056
    iget-object v6, v0, Lt1/b;->o:Lt1/a;

    .line 1057
    .line 1058
    if-nez v6, :cond_2c

    .line 1059
    .line 1060
    new-instance v6, Lt1/a;

    .line 1061
    .line 1062
    iget-object v8, v0, Lt1/b;->f:Ln1/p;

    .line 1063
    .line 1064
    invoke-interface {v8, v4, v7}, Ln1/p;->track(II)Ln1/i0;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v4

    .line 1068
    invoke-direct {v6, v4}, Landroidx/lifecycle/o;-><init>(Ljava/lang/Object;)V

    .line 1069
    .line 1070
    .line 1071
    iput-object v6, v0, Lt1/b;->o:Lt1/a;

    .line 1072
    .line 1073
    :cond_2c
    if-eqz v5, :cond_2d

    .line 1074
    .line 1075
    iget-object v4, v0, Lt1/b;->p:Lt1/e;

    .line 1076
    .line 1077
    if-nez v4, :cond_2d

    .line 1078
    .line 1079
    new-instance v4, Lt1/e;

    .line 1080
    .line 1081
    iget-object v5, v0, Lt1/b;->f:Ln1/p;

    .line 1082
    .line 1083
    const/4 v6, 0x2

    .line 1084
    invoke-interface {v5, v3, v6}, Ln1/p;->track(II)Ln1/i0;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v3

    .line 1088
    invoke-direct {v4, v3}, Lt1/e;-><init>(Ln1/i0;)V

    .line 1089
    .line 1090
    .line 1091
    iput-object v4, v0, Lt1/b;->p:Lt1/e;

    .line 1092
    .line 1093
    :cond_2d
    iget-object v3, v0, Lt1/b;->f:Ln1/p;

    .line 1094
    .line 1095
    invoke-interface {v3}, Ln1/p;->endTracks()V

    .line 1096
    .line 1097
    .line 1098
    invoke-virtual {v2}, Lh1/w;->g()I

    .line 1099
    .line 1100
    .line 1101
    move-result v2

    .line 1102
    add-int/lit8 v2, v2, -0x5

    .line 1103
    .line 1104
    iput v2, v0, Lt1/b;->j:I

    .line 1105
    .line 1106
    const/4 v3, 0x2

    .line 1107
    iput v3, v0, Lt1/b;->g:I

    .line 1108
    .line 1109
    goto/16 :goto_0
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method

.method public final seek(JJ)V
    .locals 0

    .line 1
    const-wide/16 p3, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, p3

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput p1, p0, Lt1/b;->g:I

    .line 10
    .line 11
    iput-boolean p2, p0, Lt1/b;->h:Z

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x3

    .line 15
    iput p1, p0, Lt1/b;->g:I

    .line 16
    .line 17
    :goto_0
    iput p2, p0, Lt1/b;->j:I

    .line 18
    .line 19
    return-void
.end method

.method public final sniff(Ln1/o;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lt1/b;->a:Lh1/w;

    .line 2
    .line 3
    iget-object v1, v0, Lh1/w;->a:[B

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-interface {p1, v1, v3, v2}, Ln1/o;->i([BII)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v3}, Lh1/w;->G(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lh1/w;->x()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const v2, 0x464c56

    .line 18
    .line 19
    .line 20
    if-eq v1, v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v1, v0, Lh1/w;->a:[B

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-interface {p1, v1, v3, v2}, Ln1/o;->i([BII)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v3}, Lh1/w;->G(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lh1/w;->A()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    and-int/lit16 v1, v1, 0xfa

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object v1, v0, Lh1/w;->a:[B

    .line 42
    .line 43
    const/4 v2, 0x4

    .line 44
    invoke-interface {p1, v1, v3, v2}, Ln1/o;->i([BII)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v3}, Lh1/w;->G(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lh1/w;->g()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-interface {p1}, Ln1/o;->g()V

    .line 55
    .line 56
    .line 57
    invoke-interface {p1, v1}, Ln1/o;->d(I)V

    .line 58
    .line 59
    .line 60
    iget-object v1, v0, Lh1/w;->a:[B

    .line 61
    .line 62
    invoke-interface {p1, v1, v3, v2}, Ln1/o;->i([BII)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v3}, Lh1/w;->G(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lh1/w;->g()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-nez p1, :cond_2

    .line 73
    .line 74
    const/4 p1, 0x1

    .line 75
    return p1

    .line 76
    :cond_2
    :goto_0
    return v3
.end method
