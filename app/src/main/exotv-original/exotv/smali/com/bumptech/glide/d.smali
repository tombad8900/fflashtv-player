.class public abstract Lcom/bumptech/glide/d;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lm0/s0;


# static fields
.field public static a:J = 0x0L

.field public static b:Ljava/lang/reflect/Method; = null

.field public static c:Z = true

.field public static d:Ljava/lang/reflect/Field;

.field public static e:Z

.field public static f:Ljava/lang/reflect/Field;

.field public static g:Z

.field public static h:Ljava/lang/Class;

.field public static i:Z

.field public static j:Ljava/lang/reflect/Field;

.field public static k:Z

.field public static l:Ljava/lang/reflect/Field;

.field public static m:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static C(Landroid/widget/EdgeEffect;)F
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lq0/c;->b(Landroid/widget/EdgeEffect;)F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public static D(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    invoke-static {}, Lm/y1;->b()Lm/y1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0, p1}, Lm/y1;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static E(D)J
    .locals 3

    .line 1
    invoke-static {p0, p1}, Lcom/bumptech/glide/d;->R(D)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0, p1}, Ljava/lang/Math;->getExponent(D)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {p0, p1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    const-wide v1, 0xfffffffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long/2addr p0, v1

    .line 21
    const/16 v1, -0x3ff

    .line 22
    .line 23
    if-ne v0, v1, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    shl-long/2addr p0, v0

    .line 27
    return-wide p0

    .line 28
    :cond_0
    const-wide/high16 v0, 0x10000000000000L

    .line 29
    .line 30
    or-long/2addr p0, v0

    .line 31
    return-wide p0

    .line 32
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    const-string p1, "not a normal value"

    .line 35
    .line 36
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p0
.end method

.method public static M([IIII)I
    .locals 1

    .line 1
    :goto_0
    if-ge p2, p3, :cond_1

    .line 2
    .line 3
    aget v0, p0, p2

    .line 4
    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    return p2

    .line 8
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const/4 p0, -0x1

    .line 12
    return p0
.end method

.method public static N(Ljava/lang/String;)I
    .locals 24

    .line 1
    const/4 v0, -0x1

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-static/range {p0 .. p0}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/16 v3, 0x15

    .line 17
    .line 18
    const/16 v4, 0x14

    .line 19
    .line 20
    const/16 v5, 0x13

    .line 21
    .line 22
    const/16 v6, 0x12

    .line 23
    .line 24
    const/16 v7, 0x11

    .line 25
    .line 26
    const/16 v8, 0x10

    .line 27
    .line 28
    const/16 v9, 0xf

    .line 29
    .line 30
    const/16 v10, 0xe

    .line 31
    .line 32
    const/16 v11, 0xd

    .line 33
    .line 34
    const/16 v12, 0xc

    .line 35
    .line 36
    const/16 v13, 0xb

    .line 37
    .line 38
    const/16 v14, 0xa

    .line 39
    .line 40
    const/16 v15, 0x9

    .line 41
    .line 42
    const/16 v16, 0x8

    .line 43
    .line 44
    const/16 v17, 0x7

    .line 45
    .line 46
    const/16 v18, 0x6

    .line 47
    .line 48
    const/16 v19, 0x5

    .line 49
    .line 50
    const/16 v20, 0x4

    .line 51
    .line 52
    const/16 v21, 0x3

    .line 53
    .line 54
    const/16 v22, 0x1

    .line 55
    .line 56
    const/16 v23, 0x0

    .line 57
    .line 58
    sparse-switch v2, :sswitch_data_0

    .line 59
    .line 60
    .line 61
    :goto_0
    move v1, v0

    .line 62
    goto/16 :goto_1

    .line 63
    .line 64
    :sswitch_0
    const-string v2, "video/x-matroska"

    .line 65
    .line 66
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    const/16 v1, 0x1f

    .line 74
    .line 75
    goto/16 :goto_1

    .line 76
    .line 77
    :sswitch_1
    const-string v2, "audio/webm"

    .line 78
    .line 79
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_2

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    const/16 v1, 0x1e

    .line 87
    .line 88
    goto/16 :goto_1

    .line 89
    .line 90
    :sswitch_2
    const-string v2, "audio/mpeg"

    .line 91
    .line 92
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-nez v1, :cond_3

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_3
    const/16 v1, 0x1d

    .line 100
    .line 101
    goto/16 :goto_1

    .line 102
    .line 103
    :sswitch_3
    const-string v2, "audio/midi"

    .line 104
    .line 105
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_4

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_4
    const/16 v1, 0x1c

    .line 113
    .line 114
    goto/16 :goto_1

    .line 115
    .line 116
    :sswitch_4
    const-string v2, "audio/flac"

    .line 117
    .line 118
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-nez v1, :cond_5

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_5
    const/16 v1, 0x1b

    .line 126
    .line 127
    goto/16 :goto_1

    .line 128
    .line 129
    :sswitch_5
    const-string v2, "audio/eac3"

    .line 130
    .line 131
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-nez v1, :cond_6

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_6
    const/16 v1, 0x1a

    .line 139
    .line 140
    goto/16 :goto_1

    .line 141
    .line 142
    :sswitch_6
    const-string v2, "audio/3gpp"

    .line 143
    .line 144
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-nez v1, :cond_7

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_7
    const/16 v1, 0x19

    .line 152
    .line 153
    goto/16 :goto_1

    .line 154
    .line 155
    :sswitch_7
    const-string v2, "video/mp4"

    .line 156
    .line 157
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-nez v1, :cond_8

    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_8
    const/16 v1, 0x18

    .line 165
    .line 166
    goto/16 :goto_1

    .line 167
    .line 168
    :sswitch_8
    const-string v2, "audio/wav"

    .line 169
    .line 170
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-nez v1, :cond_9

    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_9
    const/16 v1, 0x17

    .line 178
    .line 179
    goto/16 :goto_1

    .line 180
    .line 181
    :sswitch_9
    const-string v2, "audio/ogg"

    .line 182
    .line 183
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-nez v1, :cond_a

    .line 188
    .line 189
    goto/16 :goto_0

    .line 190
    .line 191
    :cond_a
    const/16 v1, 0x16

    .line 192
    .line 193
    goto/16 :goto_1

    .line 194
    .line 195
    :sswitch_a
    const-string v2, "audio/mp4"

    .line 196
    .line 197
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-nez v1, :cond_b

    .line 202
    .line 203
    goto/16 :goto_0

    .line 204
    .line 205
    :cond_b
    move v1, v3

    .line 206
    goto/16 :goto_1

    .line 207
    .line 208
    :sswitch_b
    const-string v2, "audio/amr"

    .line 209
    .line 210
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    if-nez v1, :cond_c

    .line 215
    .line 216
    goto/16 :goto_0

    .line 217
    .line 218
    :cond_c
    move v1, v4

    .line 219
    goto/16 :goto_1

    .line 220
    .line 221
    :sswitch_c
    const-string v2, "audio/ac4"

    .line 222
    .line 223
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    if-nez v1, :cond_d

    .line 228
    .line 229
    goto/16 :goto_0

    .line 230
    .line 231
    :cond_d
    move v1, v5

    .line 232
    goto/16 :goto_1

    .line 233
    .line 234
    :sswitch_d
    const-string v2, "audio/ac3"

    .line 235
    .line 236
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    if-nez v1, :cond_e

    .line 241
    .line 242
    goto/16 :goto_0

    .line 243
    .line 244
    :cond_e
    move v1, v6

    .line 245
    goto/16 :goto_1

    .line 246
    .line 247
    :sswitch_e
    const-string v2, "video/x-flv"

    .line 248
    .line 249
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    if-nez v1, :cond_f

    .line 254
    .line 255
    goto/16 :goto_0

    .line 256
    .line 257
    :cond_f
    move v1, v7

    .line 258
    goto/16 :goto_1

    .line 259
    .line 260
    :sswitch_f
    const-string v2, "application/webm"

    .line 261
    .line 262
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    if-nez v1, :cond_10

    .line 267
    .line 268
    goto/16 :goto_0

    .line 269
    .line 270
    :cond_10
    move v1, v8

    .line 271
    goto/16 :goto_1

    .line 272
    .line 273
    :sswitch_10
    const-string v2, "audio/x-matroska"

    .line 274
    .line 275
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    if-nez v1, :cond_11

    .line 280
    .line 281
    goto/16 :goto_0

    .line 282
    .line 283
    :cond_11
    move v1, v9

    .line 284
    goto/16 :goto_1

    .line 285
    .line 286
    :sswitch_11
    const-string v2, "image/png"

    .line 287
    .line 288
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v1

    .line 292
    if-nez v1, :cond_12

    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :cond_12
    move v1, v10

    .line 297
    goto/16 :goto_1

    .line 298
    .line 299
    :sswitch_12
    const-string v2, "image/bmp"

    .line 300
    .line 301
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v1

    .line 305
    if-nez v1, :cond_13

    .line 306
    .line 307
    goto/16 :goto_0

    .line 308
    .line 309
    :cond_13
    move v1, v11

    .line 310
    goto/16 :goto_1

    .line 311
    .line 312
    :sswitch_13
    const-string v2, "text/vtt"

    .line 313
    .line 314
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    if-nez v1, :cond_14

    .line 319
    .line 320
    goto/16 :goto_0

    .line 321
    .line 322
    :cond_14
    move v1, v12

    .line 323
    goto/16 :goto_1

    .line 324
    .line 325
    :sswitch_14
    const-string v2, "video/x-msvideo"

    .line 326
    .line 327
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    if-nez v1, :cond_15

    .line 332
    .line 333
    goto/16 :goto_0

    .line 334
    .line 335
    :cond_15
    move v1, v13

    .line 336
    goto/16 :goto_1

    .line 337
    .line 338
    :sswitch_15
    const-string v2, "application/mp4"

    .line 339
    .line 340
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    if-nez v1, :cond_16

    .line 345
    .line 346
    goto/16 :goto_0

    .line 347
    .line 348
    :cond_16
    move v1, v14

    .line 349
    goto/16 :goto_1

    .line 350
    .line 351
    :sswitch_16
    const-string v2, "image/webp"

    .line 352
    .line 353
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result v1

    .line 357
    if-nez v1, :cond_17

    .line 358
    .line 359
    goto/16 :goto_0

    .line 360
    .line 361
    :cond_17
    move v1, v15

    .line 362
    goto/16 :goto_1

    .line 363
    .line 364
    :sswitch_17
    const-string v2, "image/jpeg"

    .line 365
    .line 366
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-result v1

    .line 370
    if-nez v1, :cond_18

    .line 371
    .line 372
    goto/16 :goto_0

    .line 373
    .line 374
    :cond_18
    move/from16 v1, v16

    .line 375
    .line 376
    goto/16 :goto_1

    .line 377
    .line 378
    :sswitch_18
    const-string v2, "image/heif"

    .line 379
    .line 380
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    if-nez v1, :cond_19

    .line 385
    .line 386
    goto/16 :goto_0

    .line 387
    .line 388
    :cond_19
    move/from16 v1, v17

    .line 389
    .line 390
    goto :goto_1

    .line 391
    :sswitch_19
    const-string v2, "image/heic"

    .line 392
    .line 393
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    if-nez v1, :cond_1a

    .line 398
    .line 399
    goto/16 :goto_0

    .line 400
    .line 401
    :cond_1a
    move/from16 v1, v18

    .line 402
    .line 403
    goto :goto_1

    .line 404
    :sswitch_1a
    const-string v2, "image/avif"

    .line 405
    .line 406
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result v1

    .line 410
    if-nez v1, :cond_1b

    .line 411
    .line 412
    goto/16 :goto_0

    .line 413
    .line 414
    :cond_1b
    move/from16 v1, v19

    .line 415
    .line 416
    goto :goto_1

    .line 417
    :sswitch_1b
    const-string v2, "audio/amr-wb"

    .line 418
    .line 419
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    if-nez v1, :cond_1c

    .line 424
    .line 425
    goto/16 :goto_0

    .line 426
    .line 427
    :cond_1c
    move/from16 v1, v20

    .line 428
    .line 429
    goto :goto_1

    .line 430
    :sswitch_1c
    const-string v2, "video/webm"

    .line 431
    .line 432
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v1

    .line 436
    if-nez v1, :cond_1d

    .line 437
    .line 438
    goto/16 :goto_0

    .line 439
    .line 440
    :cond_1d
    move/from16 v1, v21

    .line 441
    .line 442
    goto :goto_1

    .line 443
    :sswitch_1d
    const-string v2, "video/mp2t"

    .line 444
    .line 445
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v1

    .line 449
    if-nez v1, :cond_1e

    .line 450
    .line 451
    goto/16 :goto_0

    .line 452
    .line 453
    :cond_1e
    const/4 v1, 0x2

    .line 454
    goto :goto_1

    .line 455
    :sswitch_1e
    const-string v2, "video/mp2p"

    .line 456
    .line 457
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result v1

    .line 461
    if-nez v1, :cond_1f

    .line 462
    .line 463
    goto/16 :goto_0

    .line 464
    .line 465
    :cond_1f
    move/from16 v1, v22

    .line 466
    .line 467
    goto :goto_1

    .line 468
    :sswitch_1f
    const-string v2, "audio/eac3-joc"

    .line 469
    .line 470
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    move-result v1

    .line 474
    if-nez v1, :cond_20

    .line 475
    .line 476
    goto/16 :goto_0

    .line 477
    .line 478
    :cond_20
    move/from16 v1, v23

    .line 479
    .line 480
    :goto_1
    packed-switch v1, :pswitch_data_0

    .line 481
    .line 482
    .line 483
    return v0

    .line 484
    :pswitch_0
    return v17

    .line 485
    :pswitch_1
    return v9

    .line 486
    :pswitch_2
    return v20

    .line 487
    :pswitch_3
    return v12

    .line 488
    :pswitch_4
    return v15

    .line 489
    :pswitch_5
    return v22

    .line 490
    :pswitch_6
    return v19

    .line 491
    :pswitch_7
    return v7

    .line 492
    :pswitch_8
    return v5

    .line 493
    :pswitch_9
    return v11

    .line 494
    :pswitch_a
    return v8

    .line 495
    :pswitch_b
    return v16

    .line 496
    :pswitch_c
    return v6

    .line 497
    :pswitch_d
    return v10

    .line 498
    :pswitch_e
    return v4

    .line 499
    :pswitch_f
    return v3

    .line 500
    :pswitch_10
    return v21

    .line 501
    :pswitch_11
    return v18

    .line 502
    :pswitch_12
    return v13

    .line 503
    :pswitch_13
    return v14

    .line 504
    :pswitch_14
    return v23

    .line 505
    :sswitch_data_0
    .sparse-switch
        -0x7e929daa -> :sswitch_1f
        -0x6315f78b -> :sswitch_1e
        -0x6315f787 -> :sswitch_1d
        -0x63118f53 -> :sswitch_1c
        -0x5fc6f775 -> :sswitch_1b
        -0x58abd7ba -> :sswitch_1a
        -0x58a8e8f5 -> :sswitch_19
        -0x58a8e8f2 -> :sswitch_18
        -0x58a7d764 -> :sswitch_17
        -0x58a21830 -> :sswitch_16
        -0x4a681e4e -> :sswitch_15
        -0x405dba54 -> :sswitch_14
        -0x3be2f26c -> :sswitch_13
        -0x3468a12f -> :sswitch_12
        -0x34686c8b -> :sswitch_11
        -0x17118226 -> :sswitch_10
        -0x2974308 -> :sswitch_f
        0xd45707 -> :sswitch_e
        0xb269698 -> :sswitch_d
        0xb269699 -> :sswitch_c
        0xb26980d -> :sswitch_b
        0xb26c538 -> :sswitch_a
        0xb26cbd6 -> :sswitch_9
        0xb26e933 -> :sswitch_8
        0x4f62635d -> :sswitch_7
        0x59976a2d -> :sswitch_6
        0x59ae0c65 -> :sswitch_5
        0x59aeaa01 -> :sswitch_4
        0x59b1cdba -> :sswitch_3
        0x59b1e81e -> :sswitch_2
        0x59b64a32 -> :sswitch_1
        0x79909c15 -> :sswitch_0
    .end sparse-switch

    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_11
        :pswitch_11
        :pswitch_6
        :pswitch_14
        :pswitch_5
        :pswitch_10
        :pswitch_b
        :pswitch_4
        :pswitch_3
        :pswitch_b
        :pswitch_10
        :pswitch_14
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_11
        :pswitch_11
    .end packed-switch
.end method

.method public static O(Landroid/net/Uri;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, -0x1

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    const-string v1, ".ac3"

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_23

    .line 16
    .line 17
    const-string v1, ".ec3"

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    goto/16 :goto_c

    .line 26
    .line 27
    :cond_1
    const-string v1, ".ac4"

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_2
    const-string v1, ".adts"

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_22

    .line 44
    .line 45
    const-string v1, ".aac"

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    goto/16 :goto_b

    .line 54
    .line 55
    :cond_3
    const-string v1, ".amr"

    .line 56
    .line 57
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    const/4 p0, 0x3

    .line 64
    return p0

    .line 65
    :cond_4
    const-string v1, ".flac"

    .line 66
    .line 67
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    const/4 v2, 0x4

    .line 72
    if-eqz v1, :cond_5

    .line 73
    .line 74
    return v2

    .line 75
    :cond_5
    const-string v1, ".flv"

    .line 76
    .line 77
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    const/4 v3, 0x5

    .line 82
    if-eqz v1, :cond_6

    .line 83
    .line 84
    return v3

    .line 85
    :cond_6
    const-string v1, ".mid"

    .line 86
    .line 87
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_21

    .line 92
    .line 93
    const-string v1, ".midi"

    .line 94
    .line 95
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_21

    .line 100
    .line 101
    const-string v1, ".smf"

    .line 102
    .line 103
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_7

    .line 108
    .line 109
    goto/16 :goto_a

    .line 110
    .line 111
    :cond_7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    sub-int/2addr v1, v2

    .line 116
    const-string v4, ".mk"

    .line 117
    .line 118
    invoke-virtual {p0, v4, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-nez v1, :cond_20

    .line 123
    .line 124
    const-string v1, ".webm"

    .line 125
    .line 126
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_8

    .line 131
    .line 132
    goto/16 :goto_9

    .line 133
    .line 134
    :cond_8
    const-string v1, ".mp3"

    .line 135
    .line 136
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-eqz v1, :cond_9

    .line 141
    .line 142
    const/4 p0, 0x7

    .line 143
    return p0

    .line 144
    :cond_9
    const-string v1, ".mp4"

    .line 145
    .line 146
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-nez v4, :cond_1f

    .line 151
    .line 152
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    sub-int/2addr v4, v2

    .line 157
    const-string v5, ".m4"

    .line 158
    .line 159
    invoke-virtual {p0, v5, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    if-nez v4, :cond_1f

    .line 164
    .line 165
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    sub-int/2addr v4, v3

    .line 170
    invoke-virtual {p0, v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-nez v1, :cond_1f

    .line 175
    .line 176
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    sub-int/2addr v1, v3

    .line 181
    const-string v3, ".cmf"

    .line 182
    .line 183
    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-eqz v1, :cond_a

    .line 188
    .line 189
    goto/16 :goto_8

    .line 190
    .line 191
    :cond_a
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    sub-int/2addr v1, v2

    .line 196
    const-string v3, ".og"

    .line 197
    .line 198
    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-nez v1, :cond_1e

    .line 203
    .line 204
    const-string v1, ".opus"

    .line 205
    .line 206
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_b

    .line 211
    .line 212
    goto/16 :goto_7

    .line 213
    .line 214
    :cond_b
    const-string v1, ".ps"

    .line 215
    .line 216
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    if-nez v1, :cond_1d

    .line 221
    .line 222
    const-string v1, ".mpeg"

    .line 223
    .line 224
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    if-nez v1, :cond_1d

    .line 229
    .line 230
    const-string v1, ".mpg"

    .line 231
    .line 232
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    if-nez v1, :cond_1d

    .line 237
    .line 238
    const-string v1, ".m2p"

    .line 239
    .line 240
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    if-eqz v1, :cond_c

    .line 245
    .line 246
    goto/16 :goto_6

    .line 247
    .line 248
    :cond_c
    const-string v1, ".ts"

    .line 249
    .line 250
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    if-nez v3, :cond_1c

    .line 255
    .line 256
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    sub-int/2addr v3, v2

    .line 261
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    if-eqz v1, :cond_d

    .line 266
    .line 267
    goto/16 :goto_5

    .line 268
    .line 269
    :cond_d
    const-string v1, ".wav"

    .line 270
    .line 271
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    if-nez v1, :cond_1b

    .line 276
    .line 277
    const-string v1, ".wave"

    .line 278
    .line 279
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    if-eqz v1, :cond_e

    .line 284
    .line 285
    goto/16 :goto_4

    .line 286
    .line 287
    :cond_e
    const-string v1, ".vtt"

    .line 288
    .line 289
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    if-nez v1, :cond_1a

    .line 294
    .line 295
    const-string v1, ".webvtt"

    .line 296
    .line 297
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    if-eqz v1, :cond_f

    .line 302
    .line 303
    goto :goto_3

    .line 304
    :cond_f
    const-string v1, ".jpg"

    .line 305
    .line 306
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    if-nez v1, :cond_19

    .line 311
    .line 312
    const-string v1, ".jpeg"

    .line 313
    .line 314
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    if-eqz v1, :cond_10

    .line 319
    .line 320
    goto :goto_2

    .line 321
    :cond_10
    const-string v1, ".avi"

    .line 322
    .line 323
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    if-eqz v1, :cond_11

    .line 328
    .line 329
    const/16 p0, 0x10

    .line 330
    .line 331
    return p0

    .line 332
    :cond_11
    const-string v1, ".png"

    .line 333
    .line 334
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    if-eqz v1, :cond_12

    .line 339
    .line 340
    const/16 p0, 0x11

    .line 341
    .line 342
    return p0

    .line 343
    :cond_12
    const-string v1, ".webp"

    .line 344
    .line 345
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 346
    .line 347
    .line 348
    move-result v1

    .line 349
    if-eqz v1, :cond_13

    .line 350
    .line 351
    const/16 p0, 0x12

    .line 352
    .line 353
    return p0

    .line 354
    :cond_13
    const-string v1, ".bmp"

    .line 355
    .line 356
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 357
    .line 358
    .line 359
    move-result v1

    .line 360
    if-nez v1, :cond_18

    .line 361
    .line 362
    const-string v1, ".dib"

    .line 363
    .line 364
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 365
    .line 366
    .line 367
    move-result v1

    .line 368
    if-eqz v1, :cond_14

    .line 369
    .line 370
    goto :goto_1

    .line 371
    :cond_14
    const-string v1, ".heic"

    .line 372
    .line 373
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 374
    .line 375
    .line 376
    move-result v1

    .line 377
    if-nez v1, :cond_17

    .line 378
    .line 379
    const-string v1, ".heif"

    .line 380
    .line 381
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    if-eqz v1, :cond_15

    .line 386
    .line 387
    goto :goto_0

    .line 388
    :cond_15
    const-string v1, ".avif"

    .line 389
    .line 390
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 391
    .line 392
    .line 393
    move-result p0

    .line 394
    if-eqz p0, :cond_16

    .line 395
    .line 396
    const/16 p0, 0x15

    .line 397
    .line 398
    return p0

    .line 399
    :cond_16
    return v0

    .line 400
    :cond_17
    :goto_0
    const/16 p0, 0x14

    .line 401
    .line 402
    return p0

    .line 403
    :cond_18
    :goto_1
    const/16 p0, 0x13

    .line 404
    .line 405
    return p0

    .line 406
    :cond_19
    :goto_2
    const/16 p0, 0xe

    .line 407
    .line 408
    return p0

    .line 409
    :cond_1a
    :goto_3
    const/16 p0, 0xd

    .line 410
    .line 411
    return p0

    .line 412
    :cond_1b
    :goto_4
    const/16 p0, 0xc

    .line 413
    .line 414
    return p0

    .line 415
    :cond_1c
    :goto_5
    const/16 p0, 0xb

    .line 416
    .line 417
    return p0

    .line 418
    :cond_1d
    :goto_6
    const/16 p0, 0xa

    .line 419
    .line 420
    return p0

    .line 421
    :cond_1e
    :goto_7
    const/16 p0, 0x9

    .line 422
    .line 423
    return p0

    .line 424
    :cond_1f
    :goto_8
    const/16 p0, 0x8

    .line 425
    .line 426
    return p0

    .line 427
    :cond_20
    :goto_9
    const/4 p0, 0x6

    .line 428
    return p0

    .line 429
    :cond_21
    :goto_a
    const/16 p0, 0xf

    .line 430
    .line 431
    return p0

    .line 432
    :cond_22
    :goto_b
    const/4 p0, 0x2

    .line 433
    return p0

    .line 434
    :cond_23
    :goto_c
    const/4 p0, 0x0

    .line 435
    return p0
.end method

.method public static P(Lp6/c;)Lp6/c;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Lr6/c;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p0

    .line 11
    check-cast v0, Lr6/c;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-object p0, v0, Lr6/c;->l:Lp6/c;

    .line 18
    .line 19
    if-nez p0, :cond_2

    .line 20
    .line 21
    iget-object p0, v0, Lr6/c;->k:Lp6/h;

    .line 22
    .line 23
    invoke-static {p0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    sget-object v1, Lp6/d;->j:Lp6/d;

    .line 27
    .line 28
    invoke-interface {p0, v1}, Lp6/h;->b(Lp6/g;)Lp6/f;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Lp6/e;

    .line 33
    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    check-cast p0, Li7/r;

    .line 37
    .line 38
    new-instance v1, Lm7/f;

    .line 39
    .line 40
    invoke-direct {v1, p0, v0}, Lm7/f;-><init>(Li7/r;Lr6/c;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v1, v0

    .line 45
    :goto_1
    iput-object v1, v0, Lr6/c;->l:Lp6/c;

    .line 46
    .line 47
    return-object v1

    .line 48
    :cond_2
    return-object p0
.end method

.method public static Q()Z
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lc3/a;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    const-class v0, Landroid/os/Trace;

    .line 13
    .line 14
    :try_start_0
    sget-object v1, Lcom/bumptech/glide/d;->b:Ljava/lang/reflect/Method;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    const-string v1, "TRACE_TAG_APP"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    sput-wide v3, Lcom/bumptech/glide/d;->a:J

    .line 30
    .line 31
    const-string v1, "isTagEnabled"

    .line 32
    .line 33
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, Lcom/bumptech/glide/d;->b:Ljava/lang/reflect/Method;

    .line 44
    .line 45
    :cond_1
    sget-object v0, Lcom/bumptech/glide/d;->b:Ljava/lang/reflect/Method;

    .line 46
    .line 47
    sget-wide v3, Lcom/bumptech/glide/d;->a:J

    .line 48
    .line 49
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    return v0

    .line 68
    :catch_0
    move-exception v0

    .line 69
    instance-of v1, v0, Ljava/lang/reflect/InvocationTargetException;

    .line 70
    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    instance-of v1, v0, Ljava/lang/RuntimeException;

    .line 78
    .line 79
    if-eqz v1, :cond_2

    .line 80
    .line 81
    check-cast v0, Ljava/lang/RuntimeException;

    .line 82
    .line 83
    throw v0

    .line 84
    :cond_2
    new-instance v1, Ljava/lang/RuntimeException;

    .line 85
    .line 86
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    throw v1

    .line 90
    :cond_3
    const-string v1, "Trace"

    .line 91
    .line 92
    const-string v2, "Unable to call isTagEnabled via reflection"

    .line 93
    .line 94
    invoke-static {v1, v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 95
    .line 96
    .line 97
    const/4 v0, 0x0

    .line 98
    return v0
.end method

.method public static R(D)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Math;->getExponent(D)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 p1, 0x3ff

    .line 6
    .line 7
    if-gt p0, p1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static varargs S(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    array-length v2, p1

    .line 4
    if-ge v1, v2, :cond_1

    .line 5
    .line 6
    aget-object v2, p1, v1

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    const-string v2, "null"

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    goto :goto_1

    .line 18
    :catch_0
    move-exception v3

    .line 19
    new-instance v4, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const/16 v5, 0x40

    .line 36
    .line 37
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-static {v2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const-string v4, "com.google.common.base.Strings"

    .line 56
    .line 57
    invoke-static {v4}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    sget-object v5, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 62
    .line 63
    new-instance v6, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v7, "Exception during lenientFormat for "

    .line 66
    .line 67
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-virtual {v4, v5, v6, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    new-instance v4, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v5, "<"

    .line 83
    .line 84
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v2, " threw "

    .line 91
    .line 92
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v2, ">"

    .line 107
    .line 108
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    :goto_1
    aput-object v2, p1, v1

    .line 116
    .line 117
    add-int/lit8 v1, v1, 0x1

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    array-length v3, p1

    .line 127
    mul-int/lit8 v3, v3, 0x10

    .line 128
    .line 129
    add-int/2addr v3, v2

    .line 130
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 131
    .line 132
    .line 133
    move v2, v0

    .line 134
    :goto_2
    array-length v3, p1

    .line 135
    if-ge v0, v3, :cond_3

    .line 136
    .line 137
    const-string v3, "%s"

    .line 138
    .line 139
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    const/4 v4, -0x1

    .line 144
    if-ne v3, v4, :cond_2

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_2
    invoke-virtual {v1, p0, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    add-int/lit8 v2, v0, 0x1

    .line 151
    .line 152
    aget-object v0, p1, v0

    .line 153
    .line 154
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    add-int/lit8 v0, v3, 0x2

    .line 158
    .line 159
    move v8, v2

    .line 160
    move v2, v0

    .line 161
    move v0, v8

    .line 162
    goto :goto_2

    .line 163
    :cond_3
    :goto_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    invoke-virtual {v1, p0, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    array-length p0, p1

    .line 171
    if-ge v0, p0, :cond_5

    .line 172
    .line 173
    const-string p0, " ["

    .line 174
    .line 175
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    add-int/lit8 p0, v0, 0x1

    .line 179
    .line 180
    aget-object v0, p1, v0

    .line 181
    .line 182
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    :goto_4
    array-length v0, p1

    .line 186
    if-ge p0, v0, :cond_4

    .line 187
    .line 188
    const-string v0, ", "

    .line 189
    .line 190
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    add-int/lit8 v0, p0, 0x1

    .line 194
    .line 195
    aget-object p0, p1, p0

    .line 196
    .line 197
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    move p0, v0

    .line 201
    goto :goto_4

    .line 202
    :cond_4
    const/16 p0, 0x5d

    .line 203
    .line 204
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    :cond_5
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    return-object p0
.end method

.method public static T(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "singletonList(...)"

    .line 6
    .line 7
    invoke-static {v0, p0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public static U(Landroid/view/inputmethod/EditorInfo;Landroid/view/inputmethod/InputConnection;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Landroid/view/inputmethod/EditorInfo;->hintText:Ljava/lang/CharSequence;

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :goto_0
    instance-of p1, p0, Landroid/view/View;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void
.end method

.method public static V(Landroid/widget/EdgeEffect;FF)F
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1, p2}, Lq0/c;->c(Landroid/widget/EdgeEffect;FF)F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-static {p0, p1, p2}, Lq0/b;->a(Landroid/widget/EdgeEffect;FF)V

    .line 13
    .line 14
    .line 15
    return p1
.end method

.method public static a0(Ljava/lang/String;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4

    .line 5
    const/4 v0, 0x0

    .line 6
    :try_start_1
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0

    .line 14
    new-instance v0, Ljava/lang/RuntimeException;

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v2, "Expected instanceof GlideModule, but found: "

    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :catch_0
    move-exception v1

    .line 35
    goto :goto_0

    .line 36
    :catch_1
    move-exception v1

    .line 37
    goto :goto_1

    .line 38
    :catch_2
    move-exception v1

    .line 39
    goto :goto_2

    .line 40
    :catch_3
    move-exception v1

    .line 41
    goto :goto_3

    .line 42
    :goto_0
    invoke-static {p0, v1}, Lcom/bumptech/glide/d;->o0(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :goto_1
    invoke-static {p0, v1}, Lcom/bumptech/glide/d;->o0(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :goto_2
    invoke-static {p0, v1}, Lcom/bumptech/glide/d;->o0(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :goto_3
    invoke-static {p0, v1}, Lcom/bumptech/glide/d;->o0(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :catch_4
    move-exception p0

    .line 59
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 60
    .line 61
    const-string v1, "Unable to find GlideModule implementation"

    .line 62
    .line 63
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    throw v0
.end method

.method public static final d([Ljava/lang/Object;IILm6/d;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    mul-int/lit8 v1, p2, 0x3

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x2

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const-string v1, "["

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, p2, :cond_2

    .line 17
    .line 18
    if-lez v1, :cond_0

    .line 19
    .line 20
    const-string v2, ", "

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    :cond_0
    add-int v2, p1, v1

    .line 26
    .line 27
    aget-object v2, p0, v2

    .line 28
    .line 29
    if-ne v2, p3, :cond_1

    .line 30
    .line 31
    const-string v2, "(this Collection)"

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    const-string p0, "]"

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-string p1, "toString(...)"

    .line 53
    .line 54
    invoke-static {p1, p0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-object p0
.end method

.method public static final d0([Ljava/lang/Object;II)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-ge p1, p2, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    aput-object v0, p0, p1

    .line 10
    .line 11
    add-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-void
.end method

.method public static e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "exception"

    .line 7
    .line 8
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    if-eq p0, p1, :cond_2

    .line 12
    .line 13
    sget-object v0, Lu6/a;->a:Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/16 v1, 0x13

    .line 22
    .line 23
    if-lt v0, v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget-object v0, Lt6/a;->a:Ljava/lang/reflect/Method;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    return-void
.end method

.method public static e0(D)I
    .locals 2

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    const-wide v0, 0x41dfffffffc00000L    # 2.147483647E9

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmpl-double v0, p0, v0

    .line 13
    .line 14
    if-lez v0, :cond_0

    .line 15
    .line 16
    const p0, 0x7fffffff

    .line 17
    .line 18
    .line 19
    return p0

    .line 20
    :cond_0
    const-wide/high16 v0, -0x3e20000000000000L    # -2.147483648E9

    .line 21
    .line 22
    cmpg-double v0, p0, v0

    .line 23
    .line 24
    if-gez v0, :cond_1

    .line 25
    .line 26
    const/high16 p0, -0x80000000

    .line 27
    .line 28
    return p0

    .line 29
    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    .line 30
    .line 31
    .line 32
    move-result-wide p0

    .line 33
    long-to-int p0, p0

    .line 34
    return p0

    .line 35
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 36
    .line 37
    const-string p1, "Cannot round NaN value."

    .line 38
    .line 39
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p0
.end method

.method public static varargs f([I)Ljava/util/List;
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    if-nez v0, :cond_0

    .line 3
    .line 4
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_0
    new-instance v0, Li6/b;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    array-length v2, p0

    .line 11
    invoke-direct {v0, v1, v2, p0}, Li6/b;-><init>(II[I)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static f0(F)I
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string v0, "Cannot round NaN value."

    .line 15
    .line 16
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method public static g(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x7f

    .line 6
    .line 7
    if-gt v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :goto_0
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static g0(J)I
    .locals 2

    .line 1
    const-wide/32 v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    cmp-long v0, p0, v0

    .line 5
    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    const p0, 0x7fffffff

    .line 9
    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    const-wide/32 v0, -0x80000000

    .line 13
    .line 14
    .line 15
    cmp-long v0, p0, v0

    .line 16
    .line 17
    if-gez v0, :cond_1

    .line 18
    .line 19
    const/high16 p0, -0x80000000

    .line 20
    .line 21
    return p0

    .line 22
    :cond_1
    long-to-int p0, p0

    .line 23
    return p0
.end method

.method public static h(Ln6/c;)Ln6/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ln6/c;->f()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Ln6/c;->l:Z

    .line 6
    .line 7
    iget v0, p0, Ln6/c;->k:I

    .line 8
    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Ln6/c;->m:Ln6/c;

    .line 13
    .line 14
    return-object p0
.end method

.method public static k0(Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static l(Ljava/lang/String;J)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p0, " ("

    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p0, ") must be >= 0"

    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0
.end method

.method public static m(J)I
    .locals 3

    .line 1
    long-to-int v0, p0

    .line 2
    int-to-long v1, v0

    .line 3
    cmp-long v1, v1, p0

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    const-string v2, "Out of range: %s"

    .line 11
    .line 12
    invoke-static {v1, v2, p0, p1}, Lcom/bumptech/glide/c;->k(ZLjava/lang/String;J)V

    .line 13
    .line 14
    .line 15
    return v0
.end method

.method public static o0(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Unable to instantiate GlideModule implementation for "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-direct {v0, p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    throw v0
.end method

.method public static p(Lk1/h;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p0}, Lk1/h;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :catch_0
    :cond_0
    return-void
.end method

.method public static p0(Ljava/util/Collection;)[I
    .locals 4

    .line 1
    instance-of v0, p0, Li6/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Li6/b;

    .line 6
    .line 7
    iget-object v0, p0, Li6/b;->j:[I

    .line 8
    .line 9
    iget v1, p0, Li6/b;->k:I

    .line 10
    .line 11
    iget p0, p0, Li6/b;->l:I

    .line 12
    .line 13
    invoke-static {v0, v1, p0}, Ljava/util/Arrays;->copyOfRange([III)[I

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    array-length v0, p0

    .line 23
    new-array v1, v0, [I

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    :goto_0
    if-ge v2, v0, :cond_1

    .line 27
    .line 28
    aget-object v3, p0, v2

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    check-cast v3, Ljava/lang/Number;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    aput v3, v1, v2

    .line 40
    .line 41
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    return-object v1
.end method

.method public static q(Lcom/bumptech/glide/b;Ljava/util/ArrayList;)Lcom/bumptech/glide/h;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/bumptech/glide/b;->j:Lb4/a;

    .line 4
    .line 5
    iget-object v2, v0, Lcom/bumptech/glide/b;->m:Lb4/f;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/bumptech/glide/b;->l:Lcom/bumptech/glide/e;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-object v0, v0, Lcom/bumptech/glide/e;->h:La1/o;

    .line 14
    .line 15
    new-instance v4, Lcom/bumptech/glide/h;

    .line 16
    .line 17
    invoke-direct {v4}, Lcom/bumptech/glide/h;-><init>()V

    .line 18
    .line 19
    .line 20
    const-class v5, Lx3/d;

    .line 21
    .line 22
    const-string v6, "BitmapDrawable"

    .line 23
    .line 24
    const-class v7, Ljava/lang/String;

    .line 25
    .line 26
    const-string v8, "legacy_append"

    .line 27
    .line 28
    const-class v9, Ll4/b;

    .line 29
    .line 30
    const-string v10, "Animation"

    .line 31
    .line 32
    const-class v11, [B

    .line 33
    .line 34
    const-class v12, Ljava/lang/Integer;

    .line 35
    .line 36
    const-class v13, Landroid/graphics/drawable/BitmapDrawable;

    .line 37
    .line 38
    const-string v14, "Bitmap"

    .line 39
    .line 40
    const-class v15, Ljava/io/File;

    .line 41
    .line 42
    move-object/from16 p0, v11

    .line 43
    .line 44
    const-class v11, Landroid/os/ParcelFileDescriptor;

    .line 45
    .line 46
    move-object/from16 v16, v7

    .line 47
    .line 48
    const-class v7, Landroid/content/res/AssetFileDescriptor;

    .line 49
    .line 50
    move-object/from16 v17, v12

    .line 51
    .line 52
    const-class v12, Ljava/nio/ByteBuffer;

    .line 53
    .line 54
    move-object/from16 v18, v15

    .line 55
    .line 56
    const-class v15, Landroid/graphics/drawable/Drawable;

    .line 57
    .line 58
    move-object/from16 v19, v8

    .line 59
    .line 60
    const-class v8, Landroid/graphics/Bitmap;

    .line 61
    .line 62
    move-object/from16 v20, v5

    .line 63
    .line 64
    const-class v5, Landroid/net/Uri;

    .line 65
    .line 66
    move-object/from16 v21, v5

    .line 67
    .line 68
    const-class v5, Ljava/io/InputStream;

    .line 69
    .line 70
    move-object/from16 v22, v9

    .line 71
    .line 72
    new-instance v9, Lh4/l;

    .line 73
    .line 74
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 75
    .line 76
    .line 77
    move-object/from16 v23, v6

    .line 78
    .line 79
    iget-object v6, v4, Lcom/bumptech/glide/h;->g:Lm4/c;

    .line 80
    .line 81
    monitor-enter v6

    .line 82
    move-object/from16 v24, v13

    .line 83
    .line 84
    :try_start_0
    iget-object v13, v6, Lm4/c;->a:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 87
    .line 88
    .line 89
    monitor-exit v6

    .line 90
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 91
    .line 92
    const/16 v9, 0x1b

    .line 93
    .line 94
    if-lt v6, v9, :cond_0

    .line 95
    .line 96
    new-instance v9, Lh4/s;

    .line 97
    .line 98
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 99
    .line 100
    .line 101
    iget-object v13, v4, Lcom/bumptech/glide/h;->g:Lm4/c;

    .line 102
    .line 103
    monitor-enter v13

    .line 104
    move-object/from16 v25, v7

    .line 105
    .line 106
    :try_start_1
    iget-object v7, v13, Lm4/c;->a:Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    .line 110
    .line 111
    monitor-exit v13

    .line 112
    goto :goto_0

    .line 113
    :catchall_0
    move-exception v0

    .line 114
    :try_start_2
    monitor-exit v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 115
    throw v0

    .line 116
    :cond_0
    move-object/from16 v25, v7

    .line 117
    .line 118
    :goto_0
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    invoke-virtual {v4}, Lcom/bumptech/glide/h;->e()Ljava/util/ArrayList;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    new-instance v13, Ll4/a;

    .line 127
    .line 128
    invoke-direct {v13, v3, v9, v1, v2}, Ll4/a;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Lb4/a;Lb4/f;)V

    .line 129
    .line 130
    .line 131
    move-object/from16 v26, v13

    .line 132
    .line 133
    new-instance v13, Lh4/c0;

    .line 134
    .line 135
    move-object/from16 v27, v7

    .line 136
    .line 137
    new-instance v7, Ly5/f;

    .line 138
    .line 139
    move-object/from16 v28, v11

    .line 140
    .line 141
    const/16 v11, 0x1a

    .line 142
    .line 143
    invoke-direct {v7, v11}, Ly5/f;-><init>(I)V

    .line 144
    .line 145
    .line 146
    invoke-direct {v13, v1, v7}, Lh4/c0;-><init>(Lb4/a;Ly5/f;)V

    .line 147
    .line 148
    .line 149
    new-instance v7, Lh4/o;

    .line 150
    .line 151
    invoke-virtual {v4}, Lcom/bumptech/glide/h;->e()Ljava/util/ArrayList;

    .line 152
    .line 153
    .line 154
    move-result-object v11

    .line 155
    move-object/from16 v29, v13

    .line 156
    .line 157
    invoke-virtual/range {v27 .. v27}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 158
    .line 159
    .line 160
    move-result-object v13

    .line 161
    invoke-direct {v7, v11, v13, v1, v2}, Lh4/o;-><init>(Ljava/util/ArrayList;Landroid/util/DisplayMetrics;Lb4/a;Lb4/f;)V

    .line 162
    .line 163
    .line 164
    const/16 v11, 0x1c

    .line 165
    .line 166
    if-lt v6, v11, :cond_1

    .line 167
    .line 168
    const-class v13, Lcom/bumptech/glide/c;

    .line 169
    .line 170
    iget-object v0, v0, La1/o;->k:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, Ljava/util/Map;

    .line 173
    .line 174
    invoke-interface {v0, v13}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-eqz v0, :cond_1

    .line 179
    .line 180
    new-instance v0, Lh4/f;

    .line 181
    .line 182
    const/4 v13, 0x1

    .line 183
    invoke-direct {v0, v13}, Lh4/f;-><init>(I)V

    .line 184
    .line 185
    .line 186
    new-instance v13, Lh4/f;

    .line 187
    .line 188
    const/4 v11, 0x0

    .line 189
    invoke-direct {v13, v11}, Lh4/f;-><init>(I)V

    .line 190
    .line 191
    .line 192
    :goto_1
    const/16 v11, 0x1c

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_1
    new-instance v13, Lh4/e;

    .line 196
    .line 197
    const/4 v0, 0x0

    .line 198
    invoke-direct {v13, v0, v7}, Lh4/e;-><init>(ILjava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    new-instance v0, Lh4/a;

    .line 202
    .line 203
    const/4 v11, 0x2

    .line 204
    invoke-direct {v0, v7, v11, v2}, Lh4/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    goto :goto_1

    .line 208
    :goto_2
    if-lt v6, v11, :cond_2

    .line 209
    .line 210
    new-instance v11, Lj4/b;

    .line 211
    .line 212
    move/from16 v30, v6

    .line 213
    .line 214
    new-instance v6, Lj4/c;

    .line 215
    .line 216
    invoke-direct {v6, v9, v2}, Lj4/c;-><init>(Ljava/util/ArrayList;Lb4/f;)V

    .line 217
    .line 218
    .line 219
    move-object/from16 v31, v1

    .line 220
    .line 221
    const/4 v1, 0x1

    .line 222
    invoke-direct {v11, v6, v1}, Lj4/b;-><init>(Lj4/c;I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v4, v10, v5, v15, v11}, Lcom/bumptech/glide/h;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly3/j;)V

    .line 226
    .line 227
    .line 228
    new-instance v1, Lj4/b;

    .line 229
    .line 230
    new-instance v6, Lj4/c;

    .line 231
    .line 232
    invoke-direct {v6, v9, v2}, Lj4/c;-><init>(Ljava/util/ArrayList;Lb4/f;)V

    .line 233
    .line 234
    .line 235
    const/4 v11, 0x0

    .line 236
    invoke-direct {v1, v6, v11}, Lj4/b;-><init>(Lj4/c;I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v4, v10, v12, v15, v1}, Lcom/bumptech/glide/h;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly3/j;)V

    .line 240
    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_2
    move-object/from16 v31, v1

    .line 244
    .line 245
    move/from16 v30, v6

    .line 246
    .line 247
    :goto_3
    new-instance v1, Lj4/e;

    .line 248
    .line 249
    invoke-direct {v1, v3}, Lj4/e;-><init>(Landroid/content/Context;)V

    .line 250
    .line 251
    .line 252
    new-instance v6, Lh4/b;

    .line 253
    .line 254
    invoke-direct {v6, v2}, Lh4/b;-><init>(Lb4/f;)V

    .line 255
    .line 256
    .line 257
    new-instance v11, La4/j;

    .line 258
    .line 259
    move-object/from16 v32, v3

    .line 260
    .line 261
    const/4 v3, 0x4

    .line 262
    move-object/from16 v33, v1

    .line 263
    .line 264
    const/4 v1, 0x0

    .line 265
    invoke-direct {v11, v3, v1}, La4/j;-><init>(IZ)V

    .line 266
    .line 267
    .line 268
    new-instance v1, Lm4/d;

    .line 269
    .line 270
    const/4 v3, 0x1

    .line 271
    invoke-direct {v1, v3}, Lm4/d;-><init>(I)V

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v32 .. v32}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    move-object/from16 v34, v1

    .line 279
    .line 280
    new-instance v1, Le4/a0;

    .line 281
    .line 282
    move-object/from16 v35, v11

    .line 283
    .line 284
    const/4 v11, 0x5

    .line 285
    invoke-direct {v1, v11}, Le4/a0;-><init>(I)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v4, v12, v1}, Lcom/bumptech/glide/h;->b(Ljava/lang/Class;Ly3/b;)V

    .line 289
    .line 290
    .line 291
    new-instance v1, La1/o;

    .line 292
    .line 293
    const/16 v11, 0x12

    .line 294
    .line 295
    invoke-direct {v1, v11, v2}, La1/o;-><init>(ILjava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v4, v5, v1}, Lcom/bumptech/glide/h;->b(Ljava/lang/Class;Ly3/b;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v4, v14, v12, v8, v13}, Lcom/bumptech/glide/h;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly3/j;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v4, v14, v5, v8, v0}, Lcom/bumptech/glide/h;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly3/j;)V

    .line 305
    .line 306
    .line 307
    const-string v1, "robolectric"

    .line 308
    .line 309
    sget-object v11, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 310
    .line 311
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    if-nez v1, :cond_3

    .line 316
    .line 317
    new-instance v1, Lh4/e;

    .line 318
    .line 319
    move-object/from16 v36, v3

    .line 320
    .line 321
    const/4 v3, 0x1

    .line 322
    invoke-direct {v1, v3, v7}, Lh4/e;-><init>(ILjava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    move-object/from16 v3, v28

    .line 326
    .line 327
    invoke-virtual {v4, v14, v3, v8, v1}, Lcom/bumptech/glide/h;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly3/j;)V

    .line 328
    .line 329
    .line 330
    goto :goto_4

    .line 331
    :cond_3
    move-object/from16 v36, v3

    .line 332
    .line 333
    move-object/from16 v3, v28

    .line 334
    .line 335
    :goto_4
    new-instance v1, Lh4/c0;

    .line 336
    .line 337
    new-instance v7, Ly5/f;

    .line 338
    .line 339
    move-object/from16 v28, v11

    .line 340
    .line 341
    const/16 v11, 0x17

    .line 342
    .line 343
    invoke-direct {v7, v11}, Ly5/f;-><init>(I)V

    .line 344
    .line 345
    .line 346
    move-object/from16 v11, v31

    .line 347
    .line 348
    invoke-direct {v1, v11, v7}, Lh4/c0;-><init>(Lb4/a;Ly5/f;)V

    .line 349
    .line 350
    .line 351
    move-object/from16 v7, v25

    .line 352
    .line 353
    invoke-virtual {v4, v14, v7, v8, v1}, Lcom/bumptech/glide/h;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly3/j;)V

    .line 354
    .line 355
    .line 356
    move-object/from16 v1, v29

    .line 357
    .line 358
    invoke-virtual {v4, v14, v3, v8, v1}, Lcom/bumptech/glide/h;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly3/j;)V

    .line 359
    .line 360
    .line 361
    sget-object v7, Le4/a0;->k:Le4/a0;

    .line 362
    .line 363
    invoke-virtual {v4, v8, v8, v7}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 364
    .line 365
    .line 366
    move-object/from16 v29, v15

    .line 367
    .line 368
    new-instance v15, Lh4/a0;

    .line 369
    .line 370
    move-object/from16 v31, v7

    .line 371
    .line 372
    const/4 v7, 0x0

    .line 373
    invoke-direct {v15, v7}, Lh4/a0;-><init>(I)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v4, v14, v8, v8, v15}, Lcom/bumptech/glide/h;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly3/j;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v4, v8, v6}, Lcom/bumptech/glide/h;->c(Ljava/lang/Class;Ly3/k;)V

    .line 380
    .line 381
    .line 382
    new-instance v7, Lh4/a;

    .line 383
    .line 384
    move-object/from16 v15, v27

    .line 385
    .line 386
    invoke-direct {v7, v15, v13}, Lh4/a;-><init>(Landroid/content/res/Resources;Ly3/j;)V

    .line 387
    .line 388
    .line 389
    move-object/from16 v13, v23

    .line 390
    .line 391
    move-object/from16 v23, v8

    .line 392
    .line 393
    move-object/from16 v8, v24

    .line 394
    .line 395
    invoke-virtual {v4, v13, v12, v8, v7}, Lcom/bumptech/glide/h;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly3/j;)V

    .line 396
    .line 397
    .line 398
    new-instance v7, Lh4/a;

    .line 399
    .line 400
    invoke-direct {v7, v15, v0}, Lh4/a;-><init>(Landroid/content/res/Resources;Ly3/j;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v4, v13, v5, v8, v7}, Lcom/bumptech/glide/h;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly3/j;)V

    .line 404
    .line 405
    .line 406
    new-instance v0, Lh4/a;

    .line 407
    .line 408
    invoke-direct {v0, v15, v1}, Lh4/a;-><init>(Landroid/content/res/Resources;Ly3/j;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v4, v13, v3, v8, v0}, Lcom/bumptech/glide/h;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly3/j;)V

    .line 412
    .line 413
    .line 414
    new-instance v0, La1/e;

    .line 415
    .line 416
    const/16 v1, 0xe

    .line 417
    .line 418
    invoke-direct {v0, v11, v1, v6}, La1/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v4, v8, v0}, Lcom/bumptech/glide/h;->c(Ljava/lang/Class;Ly3/k;)V

    .line 422
    .line 423
    .line 424
    new-instance v0, Ll4/h;

    .line 425
    .line 426
    move-object/from16 v1, v26

    .line 427
    .line 428
    invoke-direct {v0, v9, v1, v2}, Ll4/h;-><init>(Ljava/util/ArrayList;Ll4/a;Lb4/f;)V

    .line 429
    .line 430
    .line 431
    move-object/from16 v6, v22

    .line 432
    .line 433
    invoke-virtual {v4, v10, v5, v6, v0}, Lcom/bumptech/glide/h;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly3/j;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v4, v10, v12, v6, v1}, Lcom/bumptech/glide/h;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly3/j;)V

    .line 437
    .line 438
    .line 439
    new-instance v0, Lk2/b;

    .line 440
    .line 441
    const/4 v1, 0x3

    .line 442
    invoke-direct {v0, v1}, Lk2/b;-><init>(I)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v4, v6, v0}, Lcom/bumptech/glide/h;->c(Ljava/lang/Class;Ly3/k;)V

    .line 446
    .line 447
    .line 448
    move-object/from16 v0, v20

    .line 449
    .line 450
    move-object/from16 v1, v31

    .line 451
    .line 452
    invoke-virtual {v4, v0, v0, v1}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 453
    .line 454
    .line 455
    new-instance v7, Lh4/e;

    .line 456
    .line 457
    const/4 v9, 0x2

    .line 458
    invoke-direct {v7, v9, v11}, Lh4/e;-><init>(ILjava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    move-object/from16 v9, v23

    .line 462
    .line 463
    invoke-virtual {v4, v14, v0, v9, v7}, Lcom/bumptech/glide/h;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly3/j;)V

    .line 464
    .line 465
    .line 466
    move-object/from16 v0, v19

    .line 467
    .line 468
    move-object/from16 v10, v21

    .line 469
    .line 470
    move-object/from16 v7, v29

    .line 471
    .line 472
    move-object/from16 v13, v33

    .line 473
    .line 474
    invoke-virtual {v4, v0, v10, v7, v13}, Lcom/bumptech/glide/h;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly3/j;)V

    .line 475
    .line 476
    .line 477
    new-instance v14, Lh4/a;

    .line 478
    .line 479
    const/4 v6, 0x1

    .line 480
    invoke-direct {v14, v13, v6, v11}, Lh4/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v4, v0, v10, v9, v14}, Lcom/bumptech/glide/h;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly3/j;)V

    .line 484
    .line 485
    .line 486
    new-instance v6, Lcom/bumptech/glide/load/data/h;

    .line 487
    .line 488
    const/4 v13, 0x2

    .line 489
    invoke-direct {v6, v13}, Lcom/bumptech/glide/load/data/h;-><init>(I)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v4, v6}, Lcom/bumptech/glide/h;->h(Lcom/bumptech/glide/load/data/f;)V

    .line 493
    .line 494
    .line 495
    new-instance v6, Le4/a0;

    .line 496
    .line 497
    const/4 v13, 0x6

    .line 498
    invoke-direct {v6, v13}, Le4/a0;-><init>(I)V

    .line 499
    .line 500
    .line 501
    move-object/from16 v13, v18

    .line 502
    .line 503
    invoke-virtual {v4, v13, v12, v6}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 504
    .line 505
    .line 506
    new-instance v6, Le4/g;

    .line 507
    .line 508
    new-instance v14, Le4/a0;

    .line 509
    .line 510
    move-object/from16 v31, v11

    .line 511
    .line 512
    const/16 v11, 0x9

    .line 513
    .line 514
    invoke-direct {v14, v11}, Le4/a0;-><init>(I)V

    .line 515
    .line 516
    .line 517
    invoke-direct {v6, v14}, Landroidx/lifecycle/o;-><init>(Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v4, v13, v5, v6}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 521
    .line 522
    .line 523
    new-instance v6, Lh4/a0;

    .line 524
    .line 525
    const/4 v11, 0x2

    .line 526
    invoke-direct {v6, v11}, Lh4/a0;-><init>(I)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v4, v0, v13, v13, v6}, Lcom/bumptech/glide/h;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly3/j;)V

    .line 530
    .line 531
    .line 532
    new-instance v6, Le4/g;

    .line 533
    .line 534
    new-instance v11, Le4/a0;

    .line 535
    .line 536
    const/16 v14, 0x8

    .line 537
    .line 538
    invoke-direct {v11, v14}, Le4/a0;-><init>(I)V

    .line 539
    .line 540
    .line 541
    invoke-direct {v6, v11}, Landroidx/lifecycle/o;-><init>(Ljava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    invoke-virtual {v4, v13, v3, v6}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v4, v13, v13, v1}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 548
    .line 549
    .line 550
    new-instance v6, Lcom/bumptech/glide/load/data/m;

    .line 551
    .line 552
    invoke-direct {v6, v2}, Lcom/bumptech/glide/load/data/m;-><init>(Lb4/f;)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v4, v6}, Lcom/bumptech/glide/h;->h(Lcom/bumptech/glide/load/data/f;)V

    .line 556
    .line 557
    .line 558
    const-string v2, "robolectric"

    .line 559
    .line 560
    move-object/from16 v6, v28

    .line 561
    .line 562
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    move-result v2

    .line 566
    if-nez v2, :cond_4

    .line 567
    .line 568
    new-instance v2, Lcom/bumptech/glide/load/data/h;

    .line 569
    .line 570
    const/4 v6, 0x1

    .line 571
    invoke-direct {v2, v6}, Lcom/bumptech/glide/load/data/h;-><init>(I)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v4, v2}, Lcom/bumptech/glide/h;->h(Lcom/bumptech/glide/load/data/f;)V

    .line 575
    .line 576
    .line 577
    :cond_4
    new-instance v2, Lc4/e;

    .line 578
    .line 579
    const/4 v6, 0x3

    .line 580
    move-object/from16 v11, v32

    .line 581
    .line 582
    invoke-direct {v2, v11, v6}, Lc4/e;-><init>(Landroid/content/Context;I)V

    .line 583
    .line 584
    .line 585
    new-instance v6, Lc4/e;

    .line 586
    .line 587
    const/4 v14, 0x1

    .line 588
    invoke-direct {v6, v11, v14}, Lc4/e;-><init>(Landroid/content/Context;I)V

    .line 589
    .line 590
    .line 591
    new-instance v14, Lc4/e;

    .line 592
    .line 593
    move-object/from16 v24, v8

    .line 594
    .line 595
    const/4 v8, 0x2

    .line 596
    invoke-direct {v14, v11, v8}, Lc4/e;-><init>(Landroid/content/Context;I)V

    .line 597
    .line 598
    .line 599
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 600
    .line 601
    invoke-virtual {v4, v8, v5, v2}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 602
    .line 603
    .line 604
    move-object/from16 v23, v9

    .line 605
    .line 606
    move-object/from16 v9, v17

    .line 607
    .line 608
    invoke-virtual {v4, v9, v5, v2}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 609
    .line 610
    .line 611
    move-object/from16 v2, v25

    .line 612
    .line 613
    invoke-virtual {v4, v8, v2, v6}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v4, v9, v2, v6}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v4, v8, v7, v14}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 620
    .line 621
    .line 622
    invoke-virtual {v4, v9, v7, v14}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 623
    .line 624
    .line 625
    new-instance v6, Lc4/e;

    .line 626
    .line 627
    const/4 v14, 0x6

    .line 628
    invoke-direct {v6, v11, v14}, Lc4/e;-><init>(Landroid/content/Context;I)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v4, v10, v5, v6}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 632
    .line 633
    .line 634
    new-instance v6, Lc4/e;

    .line 635
    .line 636
    const/4 v14, 0x5

    .line 637
    invoke-direct {v6, v11, v14}, Lc4/e;-><init>(Landroid/content/Context;I)V

    .line 638
    .line 639
    .line 640
    invoke-virtual {v4, v10, v2, v6}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 641
    .line 642
    .line 643
    new-instance v6, Le4/y;

    .line 644
    .line 645
    const/4 v14, 0x2

    .line 646
    invoke-direct {v6, v15, v14}, Le4/y;-><init>(Landroid/content/res/Resources;I)V

    .line 647
    .line 648
    .line 649
    new-instance v14, Le4/y;

    .line 650
    .line 651
    move-object/from16 v19, v0

    .line 652
    .line 653
    const/4 v0, 0x0

    .line 654
    invoke-direct {v14, v15, v0}, Le4/y;-><init>(Landroid/content/res/Resources;I)V

    .line 655
    .line 656
    .line 657
    new-instance v0, Le4/y;

    .line 658
    .line 659
    move-object/from16 v29, v7

    .line 660
    .line 661
    const/4 v7, 0x1

    .line 662
    invoke-direct {v0, v15, v7}, Le4/y;-><init>(Landroid/content/res/Resources;I)V

    .line 663
    .line 664
    .line 665
    invoke-virtual {v4, v9, v10, v6}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v4, v8, v10, v6}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 669
    .line 670
    .line 671
    invoke-virtual {v4, v9, v2, v14}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v4, v8, v2, v14}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v4, v9, v5, v0}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v4, v8, v5, v0}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 681
    .line 682
    .line 683
    new-instance v0, La1/o;

    .line 684
    .line 685
    const/16 v6, 0x10

    .line 686
    .line 687
    invoke-direct {v0, v6}, La1/o;-><init>(I)V

    .line 688
    .line 689
    .line 690
    move-object/from16 v6, v16

    .line 691
    .line 692
    invoke-virtual {v4, v6, v5, v0}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 693
    .line 694
    .line 695
    new-instance v0, La1/o;

    .line 696
    .line 697
    const/16 v7, 0x10

    .line 698
    .line 699
    invoke-direct {v0, v7}, La1/o;-><init>(I)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v4, v10, v5, v0}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 703
    .line 704
    .line 705
    new-instance v0, Le4/a0;

    .line 706
    .line 707
    const/16 v7, 0xd

    .line 708
    .line 709
    invoke-direct {v0, v7}, Le4/a0;-><init>(I)V

    .line 710
    .line 711
    .line 712
    invoke-virtual {v4, v6, v5, v0}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 713
    .line 714
    .line 715
    new-instance v0, Le4/a0;

    .line 716
    .line 717
    const/16 v7, 0xc

    .line 718
    .line 719
    invoke-direct {v0, v7}, Le4/a0;-><init>(I)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v4, v6, v3, v0}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 723
    .line 724
    .line 725
    new-instance v0, Le4/a0;

    .line 726
    .line 727
    const/16 v7, 0xb

    .line 728
    .line 729
    invoke-direct {v0, v7}, Le4/a0;-><init>(I)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v4, v6, v2, v0}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 733
    .line 734
    .line 735
    new-instance v0, Le4/a;

    .line 736
    .line 737
    invoke-virtual {v11}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 738
    .line 739
    .line 740
    move-result-object v6

    .line 741
    const/4 v7, 0x1

    .line 742
    invoke-direct {v0, v6, v7}, Le4/a;-><init>(Landroid/content/res/AssetManager;I)V

    .line 743
    .line 744
    .line 745
    invoke-virtual {v4, v10, v5, v0}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 746
    .line 747
    .line 748
    new-instance v0, Le4/a;

    .line 749
    .line 750
    invoke-virtual {v11}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 751
    .line 752
    .line 753
    move-result-object v6

    .line 754
    const/4 v7, 0x0

    .line 755
    invoke-direct {v0, v6, v7}, Le4/a;-><init>(Landroid/content/res/AssetManager;I)V

    .line 756
    .line 757
    .line 758
    invoke-virtual {v4, v10, v2, v0}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 759
    .line 760
    .line 761
    new-instance v0, Lc4/e;

    .line 762
    .line 763
    const/4 v6, 0x7

    .line 764
    invoke-direct {v0, v11, v6}, Lc4/e;-><init>(Landroid/content/Context;I)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v4, v10, v5, v0}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 768
    .line 769
    .line 770
    new-instance v0, Lc4/e;

    .line 771
    .line 772
    const/16 v6, 0x8

    .line 773
    .line 774
    invoke-direct {v0, v11, v6}, Lc4/e;-><init>(Landroid/content/Context;I)V

    .line 775
    .line 776
    .line 777
    invoke-virtual {v4, v10, v5, v0}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 778
    .line 779
    .line 780
    const/16 v0, 0x1d

    .line 781
    .line 782
    move/from16 v6, v30

    .line 783
    .line 784
    if-lt v6, v0, :cond_5

    .line 785
    .line 786
    new-instance v0, Lf4/b;

    .line 787
    .line 788
    invoke-direct {v0, v11, v5}, La1/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 789
    .line 790
    .line 791
    invoke-virtual {v4, v10, v5, v0}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 792
    .line 793
    .line 794
    new-instance v0, Lf4/b;

    .line 795
    .line 796
    invoke-direct {v0, v11, v3}, La1/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 797
    .line 798
    .line 799
    invoke-virtual {v4, v10, v3, v0}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 800
    .line 801
    .line 802
    :cond_5
    new-instance v0, Le4/c0;

    .line 803
    .line 804
    const/4 v6, 0x2

    .line 805
    move-object/from16 v7, v36

    .line 806
    .line 807
    invoke-direct {v0, v7, v6}, Le4/c0;-><init>(Landroid/content/ContentResolver;I)V

    .line 808
    .line 809
    .line 810
    invoke-virtual {v4, v10, v5, v0}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 811
    .line 812
    .line 813
    new-instance v0, Le4/c0;

    .line 814
    .line 815
    const/4 v6, 0x1

    .line 816
    invoke-direct {v0, v7, v6}, Le4/c0;-><init>(Landroid/content/ContentResolver;I)V

    .line 817
    .line 818
    .line 819
    invoke-virtual {v4, v10, v3, v0}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 820
    .line 821
    .line 822
    new-instance v0, Le4/c0;

    .line 823
    .line 824
    const/4 v3, 0x0

    .line 825
    invoke-direct {v0, v7, v3}, Le4/c0;-><init>(Landroid/content/ContentResolver;I)V

    .line 826
    .line 827
    .line 828
    invoke-virtual {v4, v10, v2, v0}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 829
    .line 830
    .line 831
    new-instance v0, Le4/a0;

    .line 832
    .line 833
    const/16 v2, 0xe

    .line 834
    .line 835
    invoke-direct {v0, v2}, Le4/a0;-><init>(I)V

    .line 836
    .line 837
    .line 838
    invoke-virtual {v4, v10, v5, v0}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 839
    .line 840
    .line 841
    const-class v0, Ljava/net/URL;

    .line 842
    .line 843
    new-instance v2, Ly5/f;

    .line 844
    .line 845
    const/16 v3, 0x13

    .line 846
    .line 847
    invoke-direct {v2, v3}, Ly5/f;-><init>(I)V

    .line 848
    .line 849
    .line 850
    invoke-virtual {v4, v0, v5, v2}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 851
    .line 852
    .line 853
    new-instance v0, Lc4/e;

    .line 854
    .line 855
    const/4 v2, 0x4

    .line 856
    invoke-direct {v0, v11, v2}, Lc4/e;-><init>(Landroid/content/Context;I)V

    .line 857
    .line 858
    .line 859
    invoke-virtual {v4, v10, v13, v0}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 860
    .line 861
    .line 862
    const-class v0, Le4/h;

    .line 863
    .line 864
    new-instance v2, La1/o;

    .line 865
    .line 866
    const/16 v3, 0x15

    .line 867
    .line 868
    invoke-direct {v2, v3}, La1/o;-><init>(I)V

    .line 869
    .line 870
    .line 871
    invoke-virtual {v4, v0, v5, v2}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 872
    .line 873
    .line 874
    new-instance v0, Le4/a0;

    .line 875
    .line 876
    const/4 v2, 0x2

    .line 877
    invoke-direct {v0, v2}, Le4/a0;-><init>(I)V

    .line 878
    .line 879
    .line 880
    move-object/from16 v2, p0

    .line 881
    .line 882
    invoke-virtual {v4, v2, v12, v0}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 883
    .line 884
    .line 885
    new-instance v0, Le4/a0;

    .line 886
    .line 887
    const/4 v3, 0x4

    .line 888
    invoke-direct {v0, v3}, Le4/a0;-><init>(I)V

    .line 889
    .line 890
    .line 891
    invoke-virtual {v4, v2, v5, v0}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 892
    .line 893
    .line 894
    invoke-virtual {v4, v10, v10, v1}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 895
    .line 896
    .line 897
    move-object/from16 v7, v29

    .line 898
    .line 899
    invoke-virtual {v4, v7, v7, v1}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Le4/s;)V

    .line 900
    .line 901
    .line 902
    new-instance v0, Lh4/a0;

    .line 903
    .line 904
    const/4 v1, 0x1

    .line 905
    invoke-direct {v0, v1}, Lh4/a0;-><init>(I)V

    .line 906
    .line 907
    .line 908
    move-object/from16 v1, v19

    .line 909
    .line 910
    invoke-virtual {v4, v1, v7, v7, v0}, Lcom/bumptech/glide/h;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly3/j;)V

    .line 911
    .line 912
    .line 913
    new-instance v0, Le4/y;

    .line 914
    .line 915
    const/4 v1, 0x3

    .line 916
    invoke-direct {v0, v15, v1}, Le4/y;-><init>(Landroid/content/res/Resources;I)V

    .line 917
    .line 918
    .line 919
    move-object/from16 v9, v23

    .line 920
    .line 921
    move-object/from16 v8, v24

    .line 922
    .line 923
    invoke-virtual {v4, v9, v8, v0}, Lcom/bumptech/glide/h;->i(Ljava/lang/Class;Ljava/lang/Class;Lm4/a;)V

    .line 924
    .line 925
    .line 926
    move-object/from16 v0, v35

    .line 927
    .line 928
    invoke-virtual {v4, v9, v2, v0}, Lcom/bumptech/glide/h;->i(Ljava/lang/Class;Ljava/lang/Class;Lm4/a;)V

    .line 929
    .line 930
    .line 931
    new-instance v1, La4/c;

    .line 932
    .line 933
    const/16 v3, 0x11

    .line 934
    .line 935
    move-object/from16 v11, v31

    .line 936
    .line 937
    move-object/from16 v5, v34

    .line 938
    .line 939
    invoke-direct {v1, v11, v0, v5, v3}, La4/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 940
    .line 941
    .line 942
    invoke-virtual {v4, v7, v2, v1}, Lcom/bumptech/glide/h;->i(Ljava/lang/Class;Ljava/lang/Class;Lm4/a;)V

    .line 943
    .line 944
    .line 945
    move-object/from16 v6, v22

    .line 946
    .line 947
    invoke-virtual {v4, v6, v2, v5}, Lcom/bumptech/glide/h;->i(Ljava/lang/Class;Ljava/lang/Class;Lm4/a;)V

    .line 948
    .line 949
    .line 950
    new-instance v0, Lh4/c0;

    .line 951
    .line 952
    new-instance v1, Ly5/f;

    .line 953
    .line 954
    const/16 v2, 0x18

    .line 955
    .line 956
    invoke-direct {v1, v2}, Ly5/f;-><init>(I)V

    .line 957
    .line 958
    .line 959
    invoke-direct {v0, v11, v1}, Lh4/c0;-><init>(Lb4/a;Ly5/f;)V

    .line 960
    .line 961
    .line 962
    const-class v1, Ljava/nio/ByteBuffer;

    .line 963
    .line 964
    const-string v2, "legacy_append"

    .line 965
    .line 966
    invoke-virtual {v4, v2, v1, v9, v0}, Lcom/bumptech/glide/h;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly3/j;)V

    .line 967
    .line 968
    .line 969
    new-instance v1, Lh4/a;

    .line 970
    .line 971
    invoke-direct {v1, v15, v0}, Lh4/a;-><init>(Landroid/content/res/Resources;Ly3/j;)V

    .line 972
    .line 973
    .line 974
    const-class v0, Ljava/nio/ByteBuffer;

    .line 975
    .line 976
    const-string v2, "legacy_append"

    .line 977
    .line 978
    invoke-virtual {v4, v2, v0, v8, v1}, Lcom/bumptech/glide/h;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ly3/j;)V

    .line 979
    .line 980
    .line 981
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 982
    .line 983
    .line 984
    move-result-object v0

    .line 985
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 986
    .line 987
    .line 988
    move-result v1

    .line 989
    if-nez v1, :cond_6

    .line 990
    .line 991
    return-object v4

    .line 992
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 997
    .line 998
    .line 999
    new-instance v0, Ljava/lang/ClassCastException;

    .line 1000
    .line 1001
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 1002
    .line 1003
    .line 1004
    throw v0

    .line 1005
    :catchall_1
    move-exception v0

    .line 1006
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1007
    throw v0
.end method

.method public static r0(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    :goto_0
    const/4 v0, 0x0

    .line 13
    const/16 v16, 0x0

    .line 14
    .line 15
    goto/16 :goto_6

    .line 16
    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/16 v4, 0x2d

    .line 23
    .line 24
    if-ne v3, v4, :cond_1

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-ne v1, v3, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    add-int/lit8 v3, v1, 0x1

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const/4 v5, -0x1

    .line 41
    const/16 v6, 0x80

    .line 42
    .line 43
    if-ge v4, v6, :cond_3

    .line 44
    .line 45
    sget-object v7, Li6/c;->a:[B

    .line 46
    .line 47
    aget-byte v4, v7, v4

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    sget-object v4, Li6/c;->a:[B

    .line 51
    .line 52
    move v4, v5

    .line 53
    :goto_1
    if-ltz v4, :cond_6

    .line 54
    .line 55
    const/16 v7, 0xa

    .line 56
    .line 57
    if-lt v4, v7, :cond_4

    .line 58
    .line 59
    goto :goto_4

    .line 60
    :cond_4
    neg-int v4, v4

    .line 61
    int-to-long v8, v4

    .line 62
    int-to-long v10, v7

    .line 63
    const-wide/high16 v12, -0x8000000000000000L

    .line 64
    .line 65
    div-long v14, v12, v10

    .line 66
    .line 67
    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-ge v3, v4, :cond_9

    .line 72
    .line 73
    add-int/lit8 v4, v3, 0x1

    .line 74
    .line 75
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-ge v3, v6, :cond_5

    .line 80
    .line 81
    sget-object v16, Li6/c;->a:[B

    .line 82
    .line 83
    aget-byte v3, v16, v3

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_5
    sget-object v3, Li6/c;->a:[B

    .line 87
    .line 88
    move v3, v5

    .line 89
    :goto_3
    if-ltz v3, :cond_6

    .line 90
    .line 91
    if-ge v3, v7, :cond_6

    .line 92
    .line 93
    cmp-long v16, v8, v14

    .line 94
    .line 95
    if-gez v16, :cond_7

    .line 96
    .line 97
    :cond_6
    :goto_4
    const/16 v16, 0x0

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_7
    mul-long/2addr v8, v10

    .line 101
    const/16 v16, 0x0

    .line 102
    .line 103
    int-to-long v2, v3

    .line 104
    add-long v17, v2, v12

    .line 105
    .line 106
    cmp-long v17, v8, v17

    .line 107
    .line 108
    if-gez v17, :cond_8

    .line 109
    .line 110
    :goto_5
    move-object/from16 v0, v16

    .line 111
    .line 112
    goto :goto_6

    .line 113
    :cond_8
    sub-long/2addr v8, v2

    .line 114
    move v3, v4

    .line 115
    goto :goto_2

    .line 116
    :cond_9
    const/16 v16, 0x0

    .line 117
    .line 118
    if-eqz v1, :cond_a

    .line 119
    .line 120
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    goto :goto_6

    .line 125
    :cond_a
    cmp-long v0, v8, v12

    .line 126
    .line 127
    if-nez v0, :cond_b

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_b
    neg-long v0, v8

    .line 131
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    :goto_6
    if-eqz v0, :cond_d

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 138
    .line 139
    .line 140
    move-result-wide v1

    .line 141
    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    int-to-long v3, v3

    .line 146
    cmp-long v1, v1, v3

    .line 147
    .line 148
    if-eqz v1, :cond_c

    .line 149
    .line 150
    goto :goto_7

    .line 151
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    return-object v0

    .line 160
    :cond_d
    :goto_7
    return-object v16
.end method

.method public static w()Ln6/c;
    .locals 2

    .line 1
    new-instance v0, Ln6/c;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ln6/c;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static y(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    if-eqz p1, :cond_1

    .line 5
    .line 6
    return-object p1

    .line 7
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    .line 8
    .line 9
    const-string p1, "Both parameters are null"

    .line 10
    .line 11
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    throw p0
.end method

.method public static z([B)I
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    const/4 v3, 0x4

    .line 5
    if-lt v0, v3, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    array-length v4, p0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    aget-byte v0, p0, v1

    .line 14
    .line 15
    aget-byte v1, p0, v2

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    aget-byte v2, p0, v2

    .line 19
    .line 20
    const/4 v3, 0x3

    .line 21
    aget-byte p0, p0, v3

    .line 22
    .line 23
    shl-int/lit8 v0, v0, 0x18

    .line 24
    .line 25
    and-int/lit16 v1, v1, 0xff

    .line 26
    .line 27
    shl-int/lit8 v1, v1, 0x10

    .line 28
    .line 29
    or-int/2addr v0, v1

    .line 30
    and-int/lit16 v1, v2, 0xff

    .line 31
    .line 32
    shl-int/lit8 v1, v1, 0x8

    .line 33
    .line 34
    or-int/2addr v0, v1

    .line 35
    and-int/lit16 p0, p0, 0xff

    .line 36
    .line 37
    or-int/2addr p0, v0

    .line 38
    return p0

    .line 39
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 40
    .line 41
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const-string v1, "array too small: %s < %s"

    .line 54
    .line 55
    invoke-static {v1, v0}, Lcom/bumptech/glide/d;->S(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p0
.end method


# virtual methods
.method public abstract A(Lj6/n;)Lj6/d;
.end method

.method public abstract B(Lj6/n;)Lj6/m;
.end method

.method public abstract F(Landroid/view/View;Landroid/view/ViewGroup$MarginLayoutParams;)I
.end method

.method public G(Landroid/view/View;)F
    .locals 1

    .line 1
    sget-boolean v0, Lcom/bumptech/glide/d;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-static {p1}, Ld3/y;->a(Landroid/view/View;)F

    .line 6
    .line 7
    .line 8
    move-result p1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return p1

    .line 10
    :catch_0
    const/4 v0, 0x0

    .line 11
    sput-boolean v0, Lcom/bumptech/glide/d;->c:Z

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public abstract H()I
.end method

.method public I(Landroid/view/View;)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public abstract J(Landroid/view/View;I)Landroid/view/ViewPropertyAnimator;
.end method

.method public K()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public abstract L(I)V
.end method

.method public W(Landroid/view/View;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract X(I)V
.end method

.method public abstract Y(Landroid/view/View;II)V
.end method

.method public abstract Z(Landroid/view/View;FF)V
.end method

.method public a()V
    .locals 0

    .line 1
    return-void
.end method

.method public b()V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract b0(Lj6/m;Lj6/m;)V
.end method

.method public abstract c0(Lj6/m;Ljava/lang/Thread;)V
.end method

.method public h0(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract i(Lj6/n;Lj6/d;Lj6/d;)Z
.end method

.method public abstract i0(Z)V
.end method

.method public abstract j(Lj6/n;Ljava/lang/Object;Ljava/lang/Object;)Z
.end method

.method public abstract j0()V
.end method

.method public abstract k(Lj6/n;Lj6/m;Lj6/m;)Z
.end method

.method public l0(Landroid/view/View;F)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/bumptech/glide/d;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-static {p1, p2}, Ld3/y;->b(Landroid/view/View;F)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catch_0
    const/4 v0, 0x0

    .line 10
    sput-boolean v0, Lcom/bumptech/glide/d;->c:Z

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public m0(Landroid/view/View;I)V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/bumptech/glide/d;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    :try_start_0
    const-class v1, Landroid/view/View;

    .line 7
    .line 8
    const-string v2, "mViewFlags"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sput-object v1, Lcom/bumptech/glide/d;->d:Ljava/lang/reflect/Field;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catch_0
    const-string v1, "ViewUtilsApi19"

    .line 21
    .line 22
    const-string v2, "fetchViewFlagsField: "

    .line 23
    .line 24
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :goto_0
    sput-boolean v0, Lcom/bumptech/glide/d;->e:Z

    .line 28
    .line 29
    :cond_0
    sget-object v0, Lcom/bumptech/glide/d;->d:Ljava/lang/reflect/Field;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    :try_start_1
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    sget-object v1, Lcom/bumptech/glide/d;->d:Ljava/lang/reflect/Field;

    .line 38
    .line 39
    and-int/lit8 v0, v0, -0xd

    .line 40
    .line 41
    or-int/2addr p2, v0

    .line 42
    invoke-virtual {v1, p1, p2}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 43
    .line 44
    .line 45
    :catch_1
    :cond_1
    return-void
.end method

.method public abstract n(Landroid/view/View;I)I
.end method

.method public abstract n0(I)V
.end method

.method public abstract o(Landroid/view/View;I)I
.end method

.method public abstract q0(Landroid/view/View;I)Z
.end method

.method public abstract r(Landroid/content/Context;Ld0/e;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;
.end method

.method public abstract s(Landroid/content/Context;[Lj0/j;I)Landroid/graphics/Typeface;
.end method

.method public t(Landroid/content/Context;Ljava/util/List;I)Landroid/graphics/Typeface;
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p2, "createFromFontInfoWithFallback must only be called on API 29+"

    .line 4
    .line 5
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public u(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/support/v4/media/session/b;->v(Landroid/content/Context;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    :try_start_0
    invoke-static {p1, p2}, Landroid/support/v4/media/session/b;->p(Ljava/io/File;Ljava/io/InputStream;)Z

    .line 10
    .line 11
    .line 12
    move-result p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    if-nez p2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p2}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 24
    .line 25
    .line 26
    move-result-object p2
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 28
    .line 29
    .line 30
    return-object p2

    .line 31
    :catchall_0
    move-exception p2

    .line 32
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 33
    .line 34
    .line 35
    throw p2

    .line 36
    :catch_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public v(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/support/v4/media/session/b;->v(Landroid/content/Context;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 p4, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return-object p4

    .line 9
    :cond_0
    :try_start_0
    invoke-static {p1, p2, p3}, Landroid/support/v4/media/session/b;->o(Ljava/io/File;Landroid/content/res/Resources;I)Z

    .line 10
    .line 11
    .line 12
    move-result p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    if-nez p2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 16
    .line 17
    .line 18
    return-object p4

    .line 19
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p2}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 24
    .line 25
    .line 26
    move-result-object p2
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 28
    .line 29
    .line 30
    return-object p2

    .line 31
    :catchall_0
    move-exception p2

    .line 32
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 33
    .line 34
    .line 35
    throw p2

    .line 36
    :catch_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 37
    .line 38
    .line 39
    return-object p4
.end method

.method public x([Lj0/j;I)Lj0/j;
    .locals 10

    .line 1
    new-instance v0, Ly5/f;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ly5/f;-><init>(I)V

    .line 6
    .line 7
    .line 8
    and-int/lit8 v0, p2, 0x1

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/16 v0, 0x190

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/16 v0, 0x2bc

    .line 16
    .line 17
    :goto_0
    and-int/lit8 p2, p2, 0x2

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x1

    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    move p2, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move p2, v1

    .line 26
    :goto_1
    array-length v3, p1

    .line 27
    const/4 v4, 0x0

    .line 28
    const v5, 0x7fffffff

    .line 29
    .line 30
    .line 31
    move v6, v1

    .line 32
    :goto_2
    if-ge v6, v3, :cond_5

    .line 33
    .line 34
    aget-object v7, p1, v6

    .line 35
    .line 36
    iget v8, v7, Lj0/j;->c:I

    .line 37
    .line 38
    sub-int/2addr v8, v0

    .line 39
    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    mul-int/lit8 v8, v8, 0x2

    .line 44
    .line 45
    iget-boolean v9, v7, Lj0/j;->d:Z

    .line 46
    .line 47
    if-ne v9, p2, :cond_2

    .line 48
    .line 49
    move v9, v1

    .line 50
    goto :goto_3

    .line 51
    :cond_2
    move v9, v2

    .line 52
    :goto_3
    add-int/2addr v8, v9

    .line 53
    if-eqz v4, :cond_3

    .line 54
    .line 55
    if-le v5, v8, :cond_4

    .line 56
    .line 57
    :cond_3
    move-object v4, v7

    .line 58
    move v5, v8

    .line 59
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_5
    return-object v4
.end method
