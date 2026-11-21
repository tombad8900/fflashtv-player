.class public abstract Lx4/r;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final a:Lh7/f;

.field public static final b:Lh7/f;

.field public static final c:Lh7/f;

.field public static final d:Lh7/f;

.field public static final e:Lh7/f;

.field public static final f:Lh7/f;

.field public static final g:Lh7/f;

.field public static final h:Lh7/f;

.field public static final i:Ljava/lang/Object;

.field public static final j:Ljava/util/Set;

.field public static final k:Ljava/util/List;

.field public static final l:Ljava/util/Set;

.field public static final m:Ljava/util/Set;

.field public static final n:Ljava/util/Set;

.field public static final o:Ljava/util/Set;

.field public static final p:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 58

    .line 1
    new-instance v0, Lh7/f;

    .line 2
    .line 3
    const-string v1, "\\b(19\\d{2}|20\\d{2})\\b"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lh7/f;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lx4/r;->a:Lh7/f;

    .line 9
    .line 10
    new-instance v0, Lh7/f;

    .line 11
    .line 12
    const-string v1, "2160p|\\b4k\\b|uhd"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lh7/f;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lx4/r;->b:Lh7/f;

    .line 18
    .line 19
    new-instance v0, Lh7/f;

    .line 20
    .line 21
    const-string v1, "1080[pi]"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lh7/f;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lx4/r;->c:Lh7/f;

    .line 27
    .line 28
    new-instance v0, Lh7/f;

    .line 29
    .line 30
    const-string v1, "720p"

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lh7/f;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lx4/r;->d:Lh7/f;

    .line 36
    .line 37
    new-instance v0, Lh7/f;

    .line 38
    .line 39
    const-string v1, "480p"

    .line 40
    .line 41
    invoke-direct {v0, v1}, Lh7/f;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lx4/r;->e:Lh7/f;

    .line 45
    .line 46
    new-instance v0, Lh7/f;

    .line 47
    .line 48
    const-string v1, "s(\\d{1,2})[. _-]?e(\\d{1,3})"

    .line 49
    .line 50
    invoke-direct {v0, v1}, Lh7/f;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lx4/r;->f:Lh7/f;

    .line 54
    .line 55
    new-instance v0, Lh7/f;

    .line 56
    .line 57
    const-string v1, "\\b(\\d{1,2})x(\\d{1,3})\\b"

    .line 58
    .line 59
    invoke-direct {v0, v1}, Lh7/f;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    sput-object v0, Lx4/r;->g:Lh7/f;

    .line 63
    .line 64
    new-instance v0, Lh7/f;

    .line 65
    .line 66
    const-string v1, "[^a-z0-9]+"

    .line 67
    .line 68
    invoke-direct {v0, v1}, Lh7/f;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lx4/r;->h:Lh7/f;

    .line 72
    .line 73
    new-instance v2, Ll6/d;

    .line 74
    .line 75
    const-string v0, "yify"

    .line 76
    .line 77
    invoke-direct {v2, v0, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    new-instance v3, Ll6/d;

    .line 81
    .line 82
    const-string v1, "yts"

    .line 83
    .line 84
    invoke-direct {v3, v1, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    new-instance v4, Ll6/d;

    .line 88
    .line 89
    const-string v1, "ytsgg"

    .line 90
    .line 91
    invoke-direct {v4, v1, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    new-instance v5, Ll6/d;

    .line 95
    .line 96
    const-string v1, "ytsbz"

    .line 97
    .line 98
    invoke-direct {v5, v1, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    new-instance v6, Ll6/d;

    .line 102
    .line 103
    const-string v1, "ytslt"

    .line 104
    .line 105
    invoke-direct {v6, v1, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    new-instance v7, Ll6/d;

    .line 109
    .line 110
    const-string v1, "ytsmx"

    .line 111
    .line 112
    invoke-direct {v7, v1, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    new-instance v8, Ll6/d;

    .line 116
    .line 117
    const-string v0, "framestor"

    .line 118
    .line 119
    invoke-direct {v8, v0, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    new-instance v9, Ll6/d;

    .line 123
    .line 124
    const-string v0, "maximersk"

    .line 125
    .line 126
    invoke-direct {v9, v0, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    new-instance v10, Ll6/d;

    .line 130
    .line 131
    const-string v0, "carbon"

    .line 132
    .line 133
    invoke-direct {v10, v0, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    new-instance v11, Ll6/d;

    .line 137
    .line 138
    const-string v0, "byndr"

    .line 139
    .line 140
    invoke-direct {v11, v0, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    new-instance v12, Ll6/d;

    .line 144
    .line 145
    const-string v0, "rapta"

    .line 146
    .line 147
    invoke-direct {v12, v0, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    new-instance v13, Ll6/d;

    .line 151
    .line 152
    const-string v0, "neonoir"

    .line 153
    .line 154
    invoke-direct {v13, v0, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    new-instance v14, Ll6/d;

    .line 158
    .line 159
    const-string v0, "ethel"

    .line 160
    .line 161
    invoke-direct {v14, v0, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    new-instance v15, Ll6/d;

    .line 165
    .line 166
    const-string v0, "hone"

    .line 167
    .line 168
    invoke-direct {v15, v0, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    new-instance v0, Ll6/d;

    .line 172
    .line 173
    const-string v1, "etrg"

    .line 174
    .line 175
    invoke-direct {v0, v1, v1}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    new-instance v1, Ll6/d;

    .line 179
    .line 180
    move-object/from16 v16, v0

    .line 181
    .line 182
    const-string v0, "publichd"

    .line 183
    .line 184
    invoke-direct {v1, v0, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    new-instance v0, Ll6/d;

    .line 188
    .line 189
    move-object/from16 v17, v1

    .line 190
    .line 191
    const-string v1, "webios"

    .line 192
    .line 193
    invoke-direct {v0, v1, v1}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    new-instance v1, Ll6/d;

    .line 197
    .line 198
    move-object/from16 v18, v0

    .line 199
    .line 200
    const-string v0, "vision"

    .line 201
    .line 202
    invoke-direct {v1, v0, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    new-instance v0, Ll6/d;

    .line 206
    .line 207
    move-object/from16 v19, v1

    .line 208
    .line 209
    const-string v1, "tode"

    .line 210
    .line 211
    invoke-direct {v0, v1, v1}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    new-instance v1, Ll6/d;

    .line 215
    .line 216
    move-object/from16 v20, v0

    .line 217
    .line 218
    const-string v0, "rarbg"

    .line 219
    .line 220
    invoke-direct {v1, v0, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    new-instance v0, Ll6/d;

    .line 224
    .line 225
    move-object/from16 v21, v1

    .line 226
    .line 227
    const-string v1, "tigole"

    .line 228
    .line 229
    invoke-direct {v0, v1, v1}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    new-instance v1, Ll6/d;

    .line 233
    .line 234
    move-object/from16 v22, v0

    .line 235
    .line 236
    const-string v0, "qxr"

    .line 237
    .line 238
    invoke-direct {v1, v0, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    new-instance v0, Ll6/d;

    .line 242
    .line 243
    move-object/from16 v23, v1

    .line 244
    .line 245
    const-string v1, "ntb"

    .line 246
    .line 247
    invoke-direct {v0, v1, v1}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    new-instance v1, Ll6/d;

    .line 251
    .line 252
    move-object/from16 v24, v0

    .line 253
    .line 254
    const-string v0, "sparks"

    .line 255
    .line 256
    invoke-direct {v1, v0, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    new-instance v0, Ll6/d;

    .line 260
    .line 261
    move-object/from16 v25, v1

    .line 262
    .line 263
    const-string v1, "psa"

    .line 264
    .line 265
    invoke-direct {v0, v1, v1}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    new-instance v1, Ll6/d;

    .line 269
    .line 270
    move-object/from16 v26, v0

    .line 271
    .line 272
    const-string v0, "rbb"

    .line 273
    .line 274
    invoke-direct {v1, v0, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    new-instance v0, Ll6/d;

    .line 278
    .line 279
    move-object/from16 v27, v1

    .line 280
    .line 281
    const-string v1, "pahe"

    .line 282
    .line 283
    invoke-direct {v0, v1, v1}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    new-instance v1, Ll6/d;

    .line 287
    .line 288
    move-object/from16 v28, v0

    .line 289
    .line 290
    const-string v0, "brg"

    .line 291
    .line 292
    invoke-direct {v1, v0, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    new-instance v0, Ll6/d;

    .line 296
    .line 297
    move-object/from16 v29, v1

    .line 298
    .line 299
    const-string v1, "joy"

    .line 300
    .line 301
    invoke-direct {v0, v1, v1}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    new-instance v1, Ll6/d;

    .line 305
    .line 306
    move-object/from16 v30, v0

    .line 307
    .line 308
    const-string v0, "evo"

    .line 309
    .line 310
    invoke-direct {v1, v0, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    new-instance v0, Ll6/d;

    .line 314
    .line 315
    move-object/from16 v31, v1

    .line 316
    .line 317
    const-string v1, "kogi"

    .line 318
    .line 319
    invoke-direct {v0, v1, v1}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    move-object/from16 v32, v0

    .line 323
    .line 324
    filled-new-array/range {v2 .. v32}, [Ll6/d;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-static {v0}, Lm6/s;->U([Ll6/d;)Ljava/util/Map;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    sput-object v0, Lx4/r;->i:Ljava/lang/Object;

    .line 333
    .line 334
    const-string v56, "en"

    .line 335
    .line 336
    const-string v57, "ar"

    .line 337
    .line 338
    const-string v1, "x264"

    .line 339
    .line 340
    const-string v2, "x265"

    .line 341
    .line 342
    const-string v3, "h264"

    .line 343
    .line 344
    const-string v4, "h265"

    .line 345
    .line 346
    const-string v5, "hevc"

    .line 347
    .line 348
    const-string v6, "avc"

    .line 349
    .line 350
    const-string v7, "aac"

    .line 351
    .line 352
    const-string v8, "ac3"

    .line 353
    .line 354
    const-string v9, "eac3"

    .line 355
    .line 356
    const-string v10, "dts"

    .line 357
    .line 358
    const-string v11, "dd"

    .line 359
    .line 360
    const-string v12, "ddp"

    .line 361
    .line 362
    const-string v13, "atmos"

    .line 363
    .line 364
    const-string v14, "truehd"

    .line 365
    .line 366
    const-string v15, "flac"

    .line 367
    .line 368
    const-string v16, "opus"

    .line 369
    .line 370
    const-string v17, "bit"

    .line 371
    .line 372
    const-string v18, "10bit"

    .line 373
    .line 374
    const-string v19, "8bit"

    .line 375
    .line 376
    const-string v20, "hdr"

    .line 377
    .line 378
    const-string v21, "dv"

    .line 379
    .line 380
    const-string v22, "sdr"

    .line 381
    .line 382
    const-string v23, "remux"

    .line 383
    .line 384
    const-string v24, "proper"

    .line 385
    .line 386
    const-string v25, "repack"

    .line 387
    .line 388
    const-string v26, "internal"

    .line 389
    .line 390
    const-string v27, "limited"

    .line 391
    .line 392
    const-string v28, "hybrid"

    .line 393
    .line 394
    const-string v29, "amzn"

    .line 395
    .line 396
    const-string v30, "nf"

    .line 397
    .line 398
    const-string v31, "dsnp"

    .line 399
    .line 400
    const-string v32, "hmax"

    .line 401
    .line 402
    const-string v33, "atvp"

    .line 403
    .line 404
    const-string v34, "max"

    .line 405
    .line 406
    const-string v35, "web"

    .line 407
    .line 408
    const-string v36, "dl"

    .line 409
    .line 410
    const-string v37, "rip"

    .line 411
    .line 412
    const-string v38, "webrip"

    .line 413
    .line 414
    const-string v39, "hdrip"

    .line 415
    .line 416
    const-string v40, "brrip"

    .line 417
    .line 418
    const-string v41, "bdrip"

    .line 419
    .line 420
    const-string v42, "bluray"

    .line 421
    .line 422
    const-string v43, "hdtv"

    .line 423
    .line 424
    const-string v44, "dvdrip"

    .line 425
    .line 426
    const-string v45, "mkv"

    .line 427
    .line 428
    const-string v46, "mp4"

    .line 429
    .line 430
    const-string v47, "avi"

    .line 431
    .line 432
    const-string v48, "srt"

    .line 433
    .line 434
    const-string v49, "ass"

    .line 435
    .line 436
    const-string v50, "sub"

    .line 437
    .line 438
    const-string v51, "eng"

    .line 439
    .line 440
    const-string v52, "ara"

    .line 441
    .line 442
    const-string v53, "forced"

    .line 443
    .line 444
    const-string v54, "sdh"

    .line 445
    .line 446
    const-string v55, "hi"

    .line 447
    .line 448
    filled-new-array/range {v1 .. v57}, [Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    invoke-static {v0}, Lcom/bumptech/glide/c;->a0([Ljava/lang/Object;)Ljava/util/Set;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    sput-object v0, Lx4/r;->j:Ljava/util/Set;

    .line 457
    .line 458
    const-string v9, "anniversary"

    .line 459
    .line 460
    const-string v10, "special.edition"

    .line 461
    .line 462
    const-string v1, "extended"

    .line 463
    .line 464
    const-string v2, "remastered"

    .line 465
    .line 466
    const-string v3, "unrated"

    .line 467
    .line 468
    const-string v4, "directors"

    .line 469
    .line 470
    const-string v5, "director"

    .line 471
    .line 472
    const-string v6, "imax"

    .line 473
    .line 474
    const-string v7, "criterion"

    .line 475
    .line 476
    const-string v8, "theatrical"

    .line 477
    .line 478
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    invoke-static {v0}, Lm6/i;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    sput-object v0, Lx4/r;->k:Ljava/util/List;

    .line 487
    .line 488
    const-string v0, "webrip2"

    .line 489
    .line 490
    const-string v1, "webdlrip"

    .line 491
    .line 492
    const-string v2, "webrip"

    .line 493
    .line 494
    const-string v3, "webdl"

    .line 495
    .line 496
    const-string v4, "web"

    .line 497
    .line 498
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    invoke-static {v0}, Lcom/bumptech/glide/c;->a0([Ljava/lang/Object;)Ljava/util/Set;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    sput-object v0, Lx4/r;->l:Ljava/util/Set;

    .line 507
    .line 508
    const-string v7, "bd25"

    .line 509
    .line 510
    const-string v8, "bd50"

    .line 511
    .line 512
    const-string v1, "bluray"

    .line 513
    .line 514
    const-string v2, "blu"

    .line 515
    .line 516
    const-string v3, "brrip"

    .line 517
    .line 518
    const-string v4, "bdrip"

    .line 519
    .line 520
    const-string v5, "bdremux"

    .line 521
    .line 522
    const-string v6, "remux"

    .line 523
    .line 524
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    invoke-static {v0}, Lcom/bumptech/glide/c;->a0([Ljava/lang/Object;)Ljava/util/Set;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    sput-object v0, Lx4/r;->m:Ljava/util/Set;

    .line 533
    .line 534
    const-string v5, "dvd9"

    .line 535
    .line 536
    const-string v6, "dvdrip2"

    .line 537
    .line 538
    const-string v1, "dvdrip"

    .line 539
    .line 540
    const-string v2, "dvd"

    .line 541
    .line 542
    const-string v3, "dvdr"

    .line 543
    .line 544
    const-string v4, "dvd5"

    .line 545
    .line 546
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    invoke-static {v0}, Lcom/bumptech/glide/c;->a0([Ljava/lang/Object;)Ljava/util/Set;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    sput-object v0, Lx4/r;->n:Ljava/util/Set;

    .line 555
    .line 556
    const-string v7, "camrip"

    .line 557
    .line 558
    const-string v8, "telesync"

    .line 559
    .line 560
    const-string v1, "cam"

    .line 561
    .line 562
    const-string v2, "ts"

    .line 563
    .line 564
    const-string v3, "tc"

    .line 565
    .line 566
    const-string v4, "r6"

    .line 567
    .line 568
    const-string v5, "line"

    .line 569
    .line 570
    const-string v6, "hdcam"

    .line 571
    .line 572
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    invoke-static {v0}, Lcom/bumptech/glide/c;->a0([Ljava/lang/Object;)Ljava/util/Set;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    sput-object v0, Lx4/r;->o:Ljava/util/Set;

    .line 581
    .line 582
    const-string v16, "gz"

    .line 583
    .line 584
    const-string v17, "zip"

    .line 585
    .line 586
    const-string v1, "mp4"

    .line 587
    .line 588
    const-string v2, "mkv"

    .line 589
    .line 590
    const-string v3, "avi"

    .line 591
    .line 592
    const-string v4, "m4v"

    .line 593
    .line 594
    const-string v5, "mov"

    .line 595
    .line 596
    const-string v6, "ts"

    .line 597
    .line 598
    const-string v7, "m2ts"

    .line 599
    .line 600
    const-string v8, "webm"

    .line 601
    .line 602
    const-string v9, "m3u8"

    .line 603
    .line 604
    const-string v10, "srt"

    .line 605
    .line 606
    const-string v11, "ass"

    .line 607
    .line 608
    const-string v12, "ssa"

    .line 609
    .line 610
    const-string v13, "sub"

    .line 611
    .line 612
    const-string v14, "vtt"

    .line 613
    .line 614
    const-string v15, "smi"

    .line 615
    .line 616
    filled-new-array/range {v1 .. v17}, [Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    invoke-static {v0}, Lcom/bumptech/glide/c;->a0([Ljava/lang/Object;)Ljava/util/Set;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    sput-object v0, Lx4/r;->p:Ljava/util/Set;

    .line 625
    .line 626
    return-void
.end method

.method public static a(Ljava/lang/String;)Lx4/o;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    :cond_0
    :goto_0
    const/16 v16, 0x0

    .line 12
    .line 13
    goto/16 :goto_1a

    .line 14
    .line 15
    :cond_1
    const/16 v2, 0x2f

    .line 16
    .line 17
    invoke-static {v0, v2, v0}, Lh7/h;->O0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/16 v2, 0x2e

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x6

    .line 25
    invoke-static {v0, v2, v3, v4}, Lh7/h;->E0(Ljava/lang/CharSequence;CII)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const-string v5, "toLowerCase(...)"

    .line 30
    .line 31
    const-string v6, "US"

    .line 32
    .line 33
    const-string v7, "substring(...)"

    .line 34
    .line 35
    if-gtz v2, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    add-int/lit8 v8, v2, 0x1

    .line 39
    .line 40
    invoke-virtual {v0, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    invoke-static {v7, v8}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 48
    .line 49
    invoke-static {v6, v9}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v8, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    invoke-static {v5, v8}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    sget-object v9, Lx4/r;->p:Ljava/util/Set;

    .line 60
    .line 61
    invoke-interface {v9, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    if-eqz v8, :cond_3

    .line 66
    .line 67
    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v7, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_3
    :goto_1
    invoke-static {v0}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_4
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 82
    .line 83
    invoke-static {v6, v2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v5, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    sget-object v2, Lx4/r;->f:Lh7/f;

    .line 94
    .line 95
    invoke-static {v2, v0}, Lh7/f;->b(Lh7/f;Ljava/lang/String;)La1/e;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    const/4 v5, 0x1

    .line 100
    const/4 v6, 0x2

    .line 101
    if-nez v2, :cond_6

    .line 102
    .line 103
    sget-object v2, Lx4/r;->g:Lh7/f;

    .line 104
    .line 105
    invoke-static {v2, v0}, Lh7/f;->b(Lh7/f;Ljava/lang/String;)La1/e;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    if-nez v2, :cond_6

    .line 110
    .line 111
    :cond_5
    const/4 v9, 0x0

    .line 112
    goto :goto_2

    .line 113
    :cond_6
    invoke-virtual {v2}, La1/e;->A()Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    check-cast v8, Lh7/e;

    .line 118
    .line 119
    invoke-virtual {v8, v5}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    check-cast v8, Ljava/lang/String;

    .line 124
    .line 125
    invoke-static {v8}, Lh7/o;->k0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    if-eqz v8, :cond_5

    .line 130
    .line 131
    invoke-virtual {v2}, La1/e;->A()Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    check-cast v2, Lh7/e;

    .line 136
    .line 137
    invoke-virtual {v2, v6}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    check-cast v2, Ljava/lang/String;

    .line 142
    .line 143
    invoke-static {v2}, Lh7/o;->k0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    if-eqz v2, :cond_5

    .line 148
    .line 149
    new-instance v9, Ll6/d;

    .line 150
    .line 151
    invoke-direct {v9, v8, v2}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :goto_2
    const-string v2, "hdcam"

    .line 155
    .line 156
    invoke-static {v0, v2, v3}, Lh7/h;->u0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    const-string v8, "hdtv"

    .line 161
    .line 162
    sget-object v10, Lx4/r;->h:Lh7/f;

    .line 163
    .line 164
    if-nez v2, :cond_18

    .line 165
    .line 166
    const-string v2, "camrip"

    .line 167
    .line 168
    invoke-static {v0, v2, v3}, Lh7/h;->u0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-nez v2, :cond_18

    .line 173
    .line 174
    const-string v2, "telesync"

    .line 175
    .line 176
    invoke-static {v0, v2, v3}, Lh7/h;->u0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-nez v2, :cond_18

    .line 181
    .line 182
    const-string v2, "telecine"

    .line 183
    .line 184
    invoke-static {v0, v2, v3}, Lh7/h;->u0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    if-eqz v2, :cond_7

    .line 189
    .line 190
    goto/16 :goto_a

    .line 191
    .line 192
    :cond_7
    invoke-virtual {v10, v0}, Lh7/f;->e(Ljava/lang/String;)Ljava/util/List;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-static {v2}, Lm6/h;->N0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 201
    .line 202
    .line 203
    move-result v11

    .line 204
    if-eqz v11, :cond_8

    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_8
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v11

    .line 211
    :cond_9
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v12

    .line 215
    if-eqz v12, :cond_a

    .line 216
    .line 217
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v12

    .line 221
    check-cast v12, Ljava/lang/String;

    .line 222
    .line 223
    sget-object v13, Lx4/r;->l:Ljava/util/Set;

    .line 224
    .line 225
    invoke-interface {v13, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v12

    .line 229
    if-eqz v12, :cond_9

    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_a
    :goto_3
    const-string v11, "web-dl"

    .line 233
    .line 234
    invoke-static {v0, v11, v3}, Lh7/h;->u0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 235
    .line 236
    .line 237
    move-result v11

    .line 238
    if-nez v11, :cond_13

    .line 239
    .line 240
    const-string v11, "webrip"

    .line 241
    .line 242
    invoke-static {v0, v11, v3}, Lh7/h;->u0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 243
    .line 244
    .line 245
    move-result v11

    .line 246
    if-eqz v11, :cond_b

    .line 247
    .line 248
    goto :goto_6

    .line 249
    :cond_b
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 250
    .line 251
    .line 252
    move-result v11

    .line 253
    if-eqz v11, :cond_c

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_c
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 257
    .line 258
    .line 259
    move-result-object v11

    .line 260
    :cond_d
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 261
    .line 262
    .line 263
    move-result v12

    .line 264
    if-eqz v12, :cond_e

    .line 265
    .line 266
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v12

    .line 270
    check-cast v12, Ljava/lang/String;

    .line 271
    .line 272
    sget-object v13, Lx4/r;->m:Ljava/util/Set;

    .line 273
    .line 274
    invoke-interface {v13, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v12

    .line 278
    if-eqz v12, :cond_d

    .line 279
    .line 280
    sget-object v11, Lx4/p;->l:Lx4/p;

    .line 281
    .line 282
    goto :goto_7

    .line 283
    :cond_e
    :goto_4
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 284
    .line 285
    .line 286
    move-result v11

    .line 287
    if-eqz v11, :cond_f

    .line 288
    .line 289
    goto :goto_5

    .line 290
    :cond_f
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 291
    .line 292
    .line 293
    move-result-object v11

    .line 294
    :cond_10
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 295
    .line 296
    .line 297
    move-result v12

    .line 298
    if-eqz v12, :cond_11

    .line 299
    .line 300
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v12

    .line 304
    check-cast v12, Ljava/lang/String;

    .line 305
    .line 306
    sget-object v13, Lx4/r;->n:Ljava/util/Set;

    .line 307
    .line 308
    invoke-interface {v13, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v12

    .line 312
    if-eqz v12, :cond_10

    .line 313
    .line 314
    sget-object v11, Lx4/p;->n:Lx4/p;

    .line 315
    .line 316
    goto :goto_7

    .line 317
    :cond_11
    :goto_5
    invoke-interface {v2, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v11

    .line 321
    if-eqz v11, :cond_12

    .line 322
    .line 323
    sget-object v11, Lx4/p;->m:Lx4/p;

    .line 324
    .line 325
    goto :goto_7

    .line 326
    :cond_12
    sget-object v11, Lx4/p;->o:Lx4/p;

    .line 327
    .line 328
    goto :goto_7

    .line 329
    :cond_13
    :goto_6
    sget-object v11, Lx4/p;->k:Lx4/p;

    .line 330
    .line 331
    :goto_7
    sget-object v12, Lx4/p;->o:Lx4/p;

    .line 332
    .line 333
    if-eq v11, v12, :cond_14

    .line 334
    .line 335
    :goto_8
    move-object v15, v11

    .line 336
    goto :goto_b

    .line 337
    :cond_14
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 338
    .line 339
    .line 340
    move-result v11

    .line 341
    if-eqz v11, :cond_15

    .line 342
    .line 343
    goto :goto_9

    .line 344
    :cond_15
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    :cond_16
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 349
    .line 350
    .line 351
    move-result v11

    .line 352
    if-eqz v11, :cond_17

    .line 353
    .line 354
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v11

    .line 358
    check-cast v11, Ljava/lang/String;

    .line 359
    .line 360
    sget-object v12, Lx4/r;->o:Ljava/util/Set;

    .line 361
    .line 362
    invoke-interface {v12, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v11

    .line 366
    if-eqz v11, :cond_16

    .line 367
    .line 368
    sget-object v11, Lx4/p;->j:Lx4/p;

    .line 369
    .line 370
    goto :goto_8

    .line 371
    :cond_17
    :goto_9
    sget-object v11, Lx4/p;->o:Lx4/p;

    .line 372
    .line 373
    goto :goto_8

    .line 374
    :cond_18
    :goto_a
    sget-object v11, Lx4/p;->j:Lx4/p;

    .line 375
    .line 376
    goto :goto_8

    .line 377
    :goto_b
    sget-object v2, Lx4/r;->a:Lh7/f;

    .line 378
    .line 379
    invoke-static {v2, v0}, Lh7/f;->b(Lh7/f;Ljava/lang/String;)La1/e;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    if-eqz v2, :cond_19

    .line 384
    .line 385
    invoke-virtual {v2}, La1/e;->A()Ljava/util/List;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    check-cast v2, Lh7/e;

    .line 390
    .line 391
    invoke-virtual {v2, v5}, Lh7/e;->get(I)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    check-cast v2, Ljava/lang/String;

    .line 396
    .line 397
    if-eqz v2, :cond_19

    .line 398
    .line 399
    invoke-static {v2}, Lh7/o;->k0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    move-object v13, v2

    .line 404
    goto :goto_c

    .line 405
    :cond_19
    const/4 v13, 0x0

    .line 406
    :goto_c
    sget-object v2, Lx4/r;->b:Lh7/f;

    .line 407
    .line 408
    invoke-virtual {v2, v0}, Lh7/f;->a(Ljava/lang/String;)Z

    .line 409
    .line 410
    .line 411
    move-result v2

    .line 412
    if-eqz v2, :cond_1a

    .line 413
    .line 414
    const/16 v2, 0x870

    .line 415
    .line 416
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    :goto_d
    move-object v14, v2

    .line 421
    goto :goto_e

    .line 422
    :cond_1a
    sget-object v2, Lx4/r;->c:Lh7/f;

    .line 423
    .line 424
    invoke-virtual {v2, v0}, Lh7/f;->a(Ljava/lang/String;)Z

    .line 425
    .line 426
    .line 427
    move-result v2

    .line 428
    if-eqz v2, :cond_1b

    .line 429
    .line 430
    const/16 v2, 0x438

    .line 431
    .line 432
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    goto :goto_d

    .line 437
    :cond_1b
    sget-object v2, Lx4/r;->d:Lh7/f;

    .line 438
    .line 439
    invoke-virtual {v2, v0}, Lh7/f;->a(Ljava/lang/String;)Z

    .line 440
    .line 441
    .line 442
    move-result v2

    .line 443
    if-eqz v2, :cond_1c

    .line 444
    .line 445
    const/16 v2, 0x2d0

    .line 446
    .line 447
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    goto :goto_d

    .line 452
    :cond_1c
    sget-object v2, Lx4/r;->e:Lh7/f;

    .line 453
    .line 454
    invoke-virtual {v2, v0}, Lh7/f;->a(Ljava/lang/String;)Z

    .line 455
    .line 456
    .line 457
    move-result v2

    .line 458
    if-eqz v2, :cond_1d

    .line 459
    .line 460
    const/16 v2, 0x1e0

    .line 461
    .line 462
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    goto :goto_d

    .line 467
    :cond_1d
    const/4 v14, 0x0

    .line 468
    :goto_e
    invoke-virtual {v10, v0}, Lh7/f;->e(Ljava/lang/String;)Ljava/util/List;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    :cond_1e
    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 477
    .line 478
    .line 479
    move-result v11

    .line 480
    const-string v12, ""

    .line 481
    .line 482
    if-eqz v11, :cond_20

    .line 483
    .line 484
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v11

    .line 488
    check-cast v11, Ljava/lang/String;

    .line 489
    .line 490
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 491
    .line 492
    .line 493
    move-result v16

    .line 494
    if-nez v16, :cond_1f

    .line 495
    .line 496
    goto :goto_f

    .line 497
    :cond_1f
    const/16 v16, 0x0

    .line 498
    .line 499
    sget-object v1, Lx4/r;->i:Ljava/lang/Object;

    .line 500
    .line 501
    invoke-interface {v1, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    check-cast v1, Ljava/lang/String;

    .line 506
    .line 507
    if-eqz v1, :cond_1e

    .line 508
    .line 509
    goto/16 :goto_14

    .line 510
    .line 511
    :cond_20
    const/16 v16, 0x0

    .line 512
    .line 513
    const/16 v1, 0x2d

    .line 514
    .line 515
    invoke-static {v0, v1, v3, v4}, Lh7/h;->E0(Ljava/lang/CharSequence;CII)I

    .line 516
    .line 517
    .line 518
    move-result v1

    .line 519
    if-ltz v1, :cond_25

    .line 520
    .line 521
    add-int/2addr v1, v5

    .line 522
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    invoke-static {v7, v1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v10, v1}, Lh7/f;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 534
    .line 535
    .line 536
    move-result v2

    .line 537
    if-gt v6, v2, :cond_25

    .line 538
    .line 539
    const/16 v4, 0x11

    .line 540
    .line 541
    if-ge v2, v4, :cond_25

    .line 542
    .line 543
    move v2, v3

    .line 544
    :goto_10
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 545
    .line 546
    .line 547
    move-result v4

    .line 548
    if-ge v2, v4, :cond_25

    .line 549
    .line 550
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 551
    .line 552
    .line 553
    move-result v4

    .line 554
    invoke-static {v4}, Ljava/lang/Character;->isLetter(C)Z

    .line 555
    .line 556
    .line 557
    move-result v4

    .line 558
    if-eqz v4, :cond_24

    .line 559
    .line 560
    sget-object v2, Lx4/r;->j:Ljava/util/Set;

    .line 561
    .line 562
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    move-result v4

    .line 566
    if-eqz v4, :cond_21

    .line 567
    .line 568
    goto :goto_13

    .line 569
    :cond_21
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 570
    .line 571
    .line 572
    move-result v4

    .line 573
    move v5, v3

    .line 574
    :goto_11
    if-ge v5, v4, :cond_23

    .line 575
    .line 576
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 577
    .line 578
    .line 579
    move-result v10

    .line 580
    invoke-static {v10}, Ljava/lang/Character;->isDigit(C)Z

    .line 581
    .line 582
    .line 583
    move-result v10

    .line 584
    if-eqz v10, :cond_22

    .line 585
    .line 586
    invoke-virtual {v1, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v4

    .line 590
    invoke-static {v7, v4}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 591
    .line 592
    .line 593
    goto :goto_12

    .line 594
    :cond_22
    add-int/lit8 v5, v5, 0x1

    .line 595
    .line 596
    goto :goto_11

    .line 597
    :cond_23
    move-object v4, v1

    .line 598
    :goto_12
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 599
    .line 600
    .line 601
    move-result v5

    .line 602
    if-lt v5, v6, :cond_26

    .line 603
    .line 604
    invoke-interface {v2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 605
    .line 606
    .line 607
    move-result v2

    .line 608
    if-eqz v2, :cond_26

    .line 609
    .line 610
    goto :goto_13

    .line 611
    :cond_24
    add-int/lit8 v2, v2, 0x1

    .line 612
    .line 613
    goto :goto_10

    .line 614
    :cond_25
    :goto_13
    move-object v1, v12

    .line 615
    :cond_26
    :goto_14
    invoke-static {v0, v8, v3}, Lh7/h;->u0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 616
    .line 617
    .line 618
    move-result v2

    .line 619
    const-wide/16 v4, 0x0

    .line 620
    .line 621
    if-eqz v2, :cond_28

    .line 622
    .line 623
    :cond_27
    :goto_15
    move-wide/from16 v17, v4

    .line 624
    .line 625
    goto :goto_16

    .line 626
    :cond_28
    sget-object v2, Lx4/p;->k:Lx4/p;

    .line 627
    .line 628
    if-eq v15, v2, :cond_29

    .line 629
    .line 630
    sget-object v2, Lx4/p;->l:Lx4/p;

    .line 631
    .line 632
    if-ne v15, v2, :cond_27

    .line 633
    .line 634
    :cond_29
    const-wide v4, 0x4037f9db22d0e560L    # 23.976

    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    goto :goto_15

    .line 640
    :goto_16
    if-eqz v9, :cond_2a

    .line 641
    .line 642
    iget-object v2, v9, Ll6/d;->j:Ljava/lang/Object;

    .line 643
    .line 644
    check-cast v2, Ljava/lang/Integer;

    .line 645
    .line 646
    move-object/from16 v19, v2

    .line 647
    .line 648
    goto :goto_17

    .line 649
    :cond_2a
    move-object/from16 v19, v16

    .line 650
    .line 651
    :goto_17
    if-eqz v9, :cond_2b

    .line 652
    .line 653
    iget-object v2, v9, Ll6/d;->k:Ljava/lang/Object;

    .line 654
    .line 655
    check-cast v2, Ljava/lang/Integer;

    .line 656
    .line 657
    move-object/from16 v20, v2

    .line 658
    .line 659
    goto :goto_18

    .line 660
    :cond_2b
    move-object/from16 v20, v16

    .line 661
    .line 662
    :goto_18
    sget-object v2, Lx4/r;->k:Ljava/util/List;

    .line 663
    .line 664
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 665
    .line 666
    .line 667
    move-result-object v2

    .line 668
    :cond_2c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 669
    .line 670
    .line 671
    move-result v4

    .line 672
    if-eqz v4, :cond_2d

    .line 673
    .line 674
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v4

    .line 678
    move-object v5, v4

    .line 679
    check-cast v5, Ljava/lang/String;

    .line 680
    .line 681
    invoke-static {v0, v5, v3}, Lh7/h;->u0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 682
    .line 683
    .line 684
    move-result v5

    .line 685
    if-eqz v5, :cond_2c

    .line 686
    .line 687
    move-object/from16 v16, v4

    .line 688
    .line 689
    :cond_2d
    check-cast v16, Ljava/lang/String;

    .line 690
    .line 691
    if-nez v16, :cond_2e

    .line 692
    .line 693
    move-object/from16 v21, v12

    .line 694
    .line 695
    goto :goto_19

    .line 696
    :cond_2e
    move-object/from16 v21, v16

    .line 697
    .line 698
    :goto_19
    new-instance v12, Lx4/o;

    .line 699
    .line 700
    move-object/from16 v16, v1

    .line 701
    .line 702
    invoke-direct/range {v12 .. v21}, Lx4/o;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lx4/p;Ljava/lang/String;DLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 703
    .line 704
    .line 705
    return-object v12

    .line 706
    :goto_1a
    return-object v16
.end method
