.class public final Lw2/t;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public final a:Lw2/o;

.field public final b:Landroid/view/View;

.field public final c:Landroid/view/ViewGroup;

.field public final d:Landroid/view/ViewGroup;

.field public final e:Landroid/view/ViewGroup;

.field public final f:Landroid/view/ViewGroup;

.field public final g:Landroid/view/ViewGroup;

.field public final h:Landroid/view/ViewGroup;

.field public final i:Landroid/view/ViewGroup;

.field public final j:Landroid/view/View;

.field public final k:Landroid/view/View;

.field public final l:Landroid/animation/AnimatorSet;

.field public final m:Landroid/animation/AnimatorSet;

.field public final n:Landroid/animation/AnimatorSet;

.field public final o:Landroid/animation/AnimatorSet;

.field public final p:Landroid/animation/AnimatorSet;

.field public final q:Landroid/animation/ValueAnimator;

.field public final r:Landroid/animation/ValueAnimator;

.field public final s:Lw2/p;

.field public final t:Lw2/p;

.field public final u:Lw2/p;

.field public final v:Lw2/p;

.field public final w:Lw2/p;

.field public final x:Lk5/a;

.field public final y:Ljava/util/ArrayList;

.field public z:I


# direct methods
.method public constructor <init>(Lw2/o;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v1, v0, Lw2/t;->a:Lw2/o;

    .line 9
    .line 10
    new-instance v2, Lw2/p;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-direct {v2, v0, v3}, Lw2/p;-><init>(Lw2/t;I)V

    .line 14
    .line 15
    .line 16
    iput-object v2, v0, Lw2/t;->s:Lw2/p;

    .line 17
    .line 18
    new-instance v2, Lw2/p;

    .line 19
    .line 20
    const/4 v4, 0x3

    .line 21
    invoke-direct {v2, v0, v4}, Lw2/p;-><init>(Lw2/t;I)V

    .line 22
    .line 23
    .line 24
    iput-object v2, v0, Lw2/t;->t:Lw2/p;

    .line 25
    .line 26
    new-instance v2, Lw2/p;

    .line 27
    .line 28
    const/4 v5, 0x4

    .line 29
    invoke-direct {v2, v0, v5}, Lw2/p;-><init>(Lw2/t;I)V

    .line 30
    .line 31
    .line 32
    iput-object v2, v0, Lw2/t;->u:Lw2/p;

    .line 33
    .line 34
    new-instance v2, Lw2/p;

    .line 35
    .line 36
    const/4 v6, 0x5

    .line 37
    invoke-direct {v2, v0, v6}, Lw2/p;-><init>(Lw2/t;I)V

    .line 38
    .line 39
    .line 40
    iput-object v2, v0, Lw2/t;->v:Lw2/p;

    .line 41
    .line 42
    new-instance v2, Lw2/p;

    .line 43
    .line 44
    const/4 v7, 0x6

    .line 45
    invoke-direct {v2, v0, v7}, Lw2/p;-><init>(Lw2/t;I)V

    .line 46
    .line 47
    .line 48
    iput-object v2, v0, Lw2/t;->w:Lw2/p;

    .line 49
    .line 50
    new-instance v2, Lk5/a;

    .line 51
    .line 52
    const/4 v7, 0x2

    .line 53
    invoke-direct {v2, v7, v0}, Lk5/a;-><init>(ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iput-object v2, v0, Lw2/t;->x:Lk5/a;

    .line 57
    .line 58
    const/4 v2, 0x1

    .line 59
    iput-boolean v2, v0, Lw2/t;->C:Z

    .line 60
    .line 61
    iput v3, v0, Lw2/t;->z:I

    .line 62
    .line 63
    new-instance v8, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object v8, v0, Lw2/t;->y:Ljava/util/ArrayList;

    .line 69
    .line 70
    const v8, 0x7f0a00eb

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    iput-object v8, v0, Lw2/t;->b:Landroid/view/View;

    .line 78
    .line 79
    const v8, 0x7f0a00e6

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    check-cast v8, Landroid/view/ViewGroup;

    .line 87
    .line 88
    iput-object v8, v0, Lw2/t;->c:Landroid/view/ViewGroup;

    .line 89
    .line 90
    const v8, 0x7f0a00f6

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    check-cast v8, Landroid/view/ViewGroup;

    .line 98
    .line 99
    iput-object v8, v0, Lw2/t;->e:Landroid/view/ViewGroup;

    .line 100
    .line 101
    const v8, 0x7f0a00e4

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    check-cast v8, Landroid/view/ViewGroup;

    .line 109
    .line 110
    iput-object v8, v0, Lw2/t;->d:Landroid/view/ViewGroup;

    .line 111
    .line 112
    const v9, 0x7f0a010f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    check-cast v9, Landroid/view/ViewGroup;

    .line 120
    .line 121
    iput-object v9, v0, Lw2/t;->i:Landroid/view/ViewGroup;

    .line 122
    .line 123
    const v9, 0x7f0a0102

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    iput-object v9, v0, Lw2/t;->j:Landroid/view/View;

    .line 131
    .line 132
    const v10, 0x7f0a00e3

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    check-cast v10, Landroid/view/ViewGroup;

    .line 140
    .line 141
    iput-object v10, v0, Lw2/t;->f:Landroid/view/ViewGroup;

    .line 142
    .line 143
    const v10, 0x7f0a00ee

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v10

    .line 150
    check-cast v10, Landroid/view/ViewGroup;

    .line 151
    .line 152
    iput-object v10, v0, Lw2/t;->g:Landroid/view/ViewGroup;

    .line 153
    .line 154
    const v10, 0x7f0a00ef

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    check-cast v10, Landroid/view/ViewGroup;

    .line 162
    .line 163
    iput-object v10, v0, Lw2/t;->h:Landroid/view/ViewGroup;

    .line 164
    .line 165
    const v10, 0x7f0a00fa

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 169
    .line 170
    .line 171
    move-result-object v10

    .line 172
    iput-object v10, v0, Lw2/t;->k:Landroid/view/View;

    .line 173
    .line 174
    const v11, 0x7f0a00f9

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 178
    .line 179
    .line 180
    move-result-object v11

    .line 181
    if-eqz v10, :cond_0

    .line 182
    .line 183
    if-eqz v11, :cond_0

    .line 184
    .line 185
    new-instance v12, Lb6/a;

    .line 186
    .line 187
    const/16 v13, 0x9

    .line 188
    .line 189
    invoke-direct {v12, v13, v0}, Lb6/a;-><init>(ILjava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v10, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 193
    .line 194
    .line 195
    new-instance v10, Lb6/a;

    .line 196
    .line 197
    invoke-direct {v10, v13, v0}, Lb6/a;-><init>(ILjava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v11, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 201
    .line 202
    .line 203
    :cond_0
    new-array v10, v7, [F

    .line 204
    .line 205
    fill-array-data v10, :array_0

    .line 206
    .line 207
    .line 208
    invoke-static {v10}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 209
    .line 210
    .line 211
    move-result-object v10

    .line 212
    new-instance v11, Landroid/view/animation/LinearInterpolator;

    .line 213
    .line 214
    invoke-direct {v11}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v10, v11}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 218
    .line 219
    .line 220
    new-instance v11, Lw2/q;

    .line 221
    .line 222
    invoke-direct {v11, v0, v4}, Lw2/q;-><init>(Lw2/t;I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v10, v11}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 226
    .line 227
    .line 228
    new-instance v11, Lw2/r;

    .line 229
    .line 230
    invoke-direct {v11, v0, v3}, Lw2/r;-><init>(Lw2/t;I)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v10, v11}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 234
    .line 235
    .line 236
    new-array v11, v7, [F

    .line 237
    .line 238
    fill-array-data v11, :array_1

    .line 239
    .line 240
    .line 241
    invoke-static {v11}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 242
    .line 243
    .line 244
    move-result-object v11

    .line 245
    new-instance v12, Landroid/view/animation/LinearInterpolator;

    .line 246
    .line 247
    invoke-direct {v12}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v11, v12}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 251
    .line 252
    .line 253
    new-instance v12, Lw2/q;

    .line 254
    .line 255
    invoke-direct {v12, v0, v3}, Lw2/q;-><init>(Lw2/t;I)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v11, v12}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 259
    .line 260
    .line 261
    new-instance v12, Lw2/r;

    .line 262
    .line 263
    invoke-direct {v12, v0, v2}, Lw2/r;-><init>(Lw2/t;I)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v11, v12}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 270
    .line 271
    .line 272
    move-result-object v12

    .line 273
    const v13, 0x7f0700ba

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getDimension(I)F

    .line 277
    .line 278
    .line 279
    move-result v14

    .line 280
    const v15, 0x7f0700bf

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12, v15}, Landroid/content/res/Resources;->getDimension(I)F

    .line 284
    .line 285
    .line 286
    move-result v15

    .line 287
    sub-float/2addr v14, v15

    .line 288
    invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getDimension(I)F

    .line 289
    .line 290
    .line 291
    move-result v12

    .line 292
    new-instance v13, Landroid/animation/AnimatorSet;

    .line 293
    .line 294
    invoke-direct {v13}, Landroid/animation/AnimatorSet;-><init>()V

    .line 295
    .line 296
    .line 297
    iput-object v13, v0, Lw2/t;->l:Landroid/animation/AnimatorSet;

    .line 298
    .line 299
    const-wide/16 v5, 0xfa

    .line 300
    .line 301
    invoke-virtual {v13, v5, v6}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 302
    .line 303
    .line 304
    new-instance v15, Lw2/s;

    .line 305
    .line 306
    invoke-direct {v15, v0, v1, v3}, Lw2/s;-><init>(Lw2/t;Lw2/o;I)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v13, v15}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v13, v10}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    const/4 v13, 0x0

    .line 317
    invoke-static {v9, v13, v14}, Lw2/t;->d(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 318
    .line 319
    .line 320
    move-result-object v15

    .line 321
    invoke-virtual {v3, v15}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    invoke-static {v8, v13, v14}, Lw2/t;->d(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 326
    .line 327
    .line 328
    move-result-object v15

    .line 329
    invoke-virtual {v3, v15}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 330
    .line 331
    .line 332
    new-instance v3, Landroid/animation/AnimatorSet;

    .line 333
    .line 334
    invoke-direct {v3}, Landroid/animation/AnimatorSet;-><init>()V

    .line 335
    .line 336
    .line 337
    iput-object v3, v0, Lw2/t;->m:Landroid/animation/AnimatorSet;

    .line 338
    .line 339
    invoke-virtual {v3, v5, v6}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 340
    .line 341
    .line 342
    new-instance v15, Lw2/s;

    .line 343
    .line 344
    invoke-direct {v15, v0, v1, v2}, Lw2/s;-><init>(Lw2/t;Lw2/o;I)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v3, v15}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 348
    .line 349
    .line 350
    invoke-static {v9, v14, v12}, Lw2/t;->d(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 351
    .line 352
    .line 353
    move-result-object v15

    .line 354
    invoke-virtual {v3, v15}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    invoke-static {v8, v14, v12}, Lw2/t;->d(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 359
    .line 360
    .line 361
    move-result-object v15

    .line 362
    invoke-virtual {v3, v15}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 363
    .line 364
    .line 365
    new-instance v3, Landroid/animation/AnimatorSet;

    .line 366
    .line 367
    invoke-direct {v3}, Landroid/animation/AnimatorSet;-><init>()V

    .line 368
    .line 369
    .line 370
    iput-object v3, v0, Lw2/t;->n:Landroid/animation/AnimatorSet;

    .line 371
    .line 372
    invoke-virtual {v3, v5, v6}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 373
    .line 374
    .line 375
    new-instance v15, Lw2/s;

    .line 376
    .line 377
    invoke-direct {v15, v0, v1, v7}, Lw2/s;-><init>(Lw2/t;Lw2/o;I)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v3, v15}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v3, v10}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    invoke-static {v9, v13, v12}, Lw2/t;->d(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 388
    .line 389
    .line 390
    move-result-object v3

    .line 391
    invoke-virtual {v1, v3}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-static {v8, v13, v12}, Lw2/t;->d(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 396
    .line 397
    .line 398
    move-result-object v3

    .line 399
    invoke-virtual {v1, v3}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 400
    .line 401
    .line 402
    new-instance v1, Landroid/animation/AnimatorSet;

    .line 403
    .line 404
    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 405
    .line 406
    .line 407
    iput-object v1, v0, Lw2/t;->o:Landroid/animation/AnimatorSet;

    .line 408
    .line 409
    invoke-virtual {v1, v5, v6}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 410
    .line 411
    .line 412
    new-instance v3, Lw2/r;

    .line 413
    .line 414
    invoke-direct {v3, v0, v7}, Lw2/r;-><init>(Lw2/t;I)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v1, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v1, v11}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    invoke-static {v9, v14, v13}, Lw2/t;->d(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    invoke-virtual {v1, v3}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    invoke-static {v8, v14, v13}, Lw2/t;->d(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 433
    .line 434
    .line 435
    move-result-object v3

    .line 436
    invoke-virtual {v1, v3}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 437
    .line 438
    .line 439
    new-instance v1, Landroid/animation/AnimatorSet;

    .line 440
    .line 441
    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 442
    .line 443
    .line 444
    iput-object v1, v0, Lw2/t;->p:Landroid/animation/AnimatorSet;

    .line 445
    .line 446
    invoke-virtual {v1, v5, v6}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 447
    .line 448
    .line 449
    new-instance v3, Lw2/r;

    .line 450
    .line 451
    invoke-direct {v3, v0, v4}, Lw2/r;-><init>(Lw2/t;I)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v1, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v1, v11}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    invoke-static {v9, v12, v13}, Lw2/t;->d(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    invoke-virtual {v1, v3}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    invoke-static {v8, v12, v13}, Lw2/t;->d(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 470
    .line 471
    .line 472
    move-result-object v3

    .line 473
    invoke-virtual {v1, v3}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 474
    .line 475
    .line 476
    new-array v1, v7, [F

    .line 477
    .line 478
    fill-array-data v1, :array_2

    .line 479
    .line 480
    .line 481
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    iput-object v1, v0, Lw2/t;->q:Landroid/animation/ValueAnimator;

    .line 486
    .line 487
    invoke-virtual {v1, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 488
    .line 489
    .line 490
    new-instance v3, Lw2/q;

    .line 491
    .line 492
    invoke-direct {v3, v0, v2}, Lw2/q;-><init>(Lw2/t;I)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v1, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 496
    .line 497
    .line 498
    new-instance v2, Lw2/r;

    .line 499
    .line 500
    const/4 v15, 0x4

    .line 501
    invoke-direct {v2, v0, v15}, Lw2/r;-><init>(Lw2/t;I)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 505
    .line 506
    .line 507
    new-array v1, v7, [F

    .line 508
    .line 509
    fill-array-data v1, :array_3

    .line 510
    .line 511
    .line 512
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    iput-object v1, v0, Lw2/t;->r:Landroid/animation/ValueAnimator;

    .line 517
    .line 518
    invoke-virtual {v1, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 519
    .line 520
    .line 521
    new-instance v2, Lw2/q;

    .line 522
    .line 523
    invoke-direct {v2, v0, v7}, Lw2/q;-><init>(Lw2/t;I)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 527
    .line 528
    .line 529
    new-instance v2, Lw2/r;

    .line 530
    .line 531
    const/4 v3, 0x5

    .line 532
    invoke-direct {v2, v0, v3}, Lw2/r;-><init>(Lw2/t;I)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 536
    .line 537
    .line 538
    return-void

    .line 539
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    :array_2
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    :array_3
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public static c(Landroid/view/View;)I
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    instance-of v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 18
    .line 19
    iget v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 20
    .line 21
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 22
    .line 23
    add-int/2addr v1, p0

    .line 24
    add-int/2addr v1, v0

    .line 25
    return v1

    .line 26
    :cond_1
    return v0
.end method

.method public static d(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    aput p1, v0, v1

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    aput p2, v0, p1

    .line 9
    .line 10
    const-string p1, "translationY"

    .line 11
    .line 12
    invoke-static {p0, p1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static j(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const v0, 0x7f0a00e4

    .line 6
    .line 7
    .line 8
    if-eq p0, v0, :cond_1

    .line 9
    .line 10
    const v0, 0x7f0a0101

    .line 11
    .line 12
    .line 13
    if-eq p0, v0, :cond_1

    .line 14
    .line 15
    const v0, 0x7f0a00f8

    .line 16
    .line 17
    .line 18
    if-eq p0, v0, :cond_1

    .line 19
    .line 20
    const v0, 0x7f0a0105

    .line 21
    .line 22
    .line 23
    if-eq p0, v0, :cond_1

    .line 24
    .line 25
    const v0, 0x7f0a0106

    .line 26
    .line 27
    .line 28
    if-eq p0, v0, :cond_1

    .line 29
    .line 30
    const v0, 0x7f0a00f0

    .line 31
    .line 32
    .line 33
    if-eq p0, v0, :cond_1

    .line 34
    .line 35
    const v0, 0x7f0a00f1

    .line 36
    .line 37
    .line 38
    if-ne p0, v0, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 p0, 0x0

    .line 42
    return p0

    .line 43
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 44
    return p0
.end method


# virtual methods
.method public final a(F)V
    .locals 4

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    iget-object v1, p0, Lw2/t;->h:Landroid/view/ViewGroup;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    int-to-float v2, v2

    .line 12
    sub-float v3, v0, p1

    .line 13
    .line 14
    mul-float/2addr v3, v2

    .line 15
    float-to-int v2, v3

    .line 16
    int-to-float v2, v2

    .line 17
    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationX(F)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v1, p0, Lw2/t;->i:Landroid/view/ViewGroup;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    sub-float v2, v0, p1

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v1, p0, Lw2/t;->f:Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    sub-float/2addr v0, p1

    .line 34
    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 35
    .line 36
    .line 37
    :cond_2
    return-void
.end method

.method public final b(Landroid/view/View;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lw2/t;->y:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method public final e(Ljava/lang/Runnable;J)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p2, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lw2/t;->a:Lw2/o;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw2/t;->w:Lw2/p;

    .line 2
    .line 3
    iget-object v1, p0, Lw2/t;->a:Lw2/o;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lw2/t;->t:Lw2/p;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lw2/t;->v:Lw2/p;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lw2/t;->u:Lw2/p;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final g()V
    .locals 4

    .line 1
    iget v0, p0, Lw2/t;->z:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0}, Lw2/t;->f()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lw2/t;->a:Lw2/o;

    .line 11
    .line 12
    invoke-virtual {v0}, Lw2/o;->getShowTimeoutMs()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_3

    .line 17
    .line 18
    iget-boolean v1, p0, Lw2/t;->C:Z

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Lw2/t;->w:Lw2/p;

    .line 23
    .line 24
    int-to-long v2, v0

    .line 25
    invoke-virtual {p0, v1, v2, v3}, Lw2/t;->e(Ljava/lang/Runnable;J)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget v1, p0, Lw2/t;->z:I

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-ne v1, v2, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, Lw2/t;->u:Lw2/p;

    .line 35
    .line 36
    const-wide/16 v1, 0x7d0

    .line 37
    .line 38
    invoke-virtual {p0, v0, v1, v2}, Lw2/t;->e(Ljava/lang/Runnable;J)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    iget-object v1, p0, Lw2/t;->v:Lw2/p;

    .line 43
    .line 44
    int-to-long v2, v0

    .line 45
    invoke-virtual {p0, v1, v2, v3}, Lw2/t;->e(Ljava/lang/Runnable;J)V

    .line 46
    .line 47
    .line 48
    :cond_3
    :goto_0
    return-void
.end method

.method public final h(Landroid/view/View;Z)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lw2/t;->y:Ljava/util/ArrayList;

    .line 5
    .line 6
    if-nez p2, :cond_1

    .line 7
    .line 8
    const/16 p2, 0x8

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    iget-boolean p2, p0, Lw2/t;->A:Z

    .line 18
    .line 19
    if-eqz p2, :cond_2

    .line 20
    .line 21
    invoke-static {p1}, Lw2/t;->j(Landroid/view/View;)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_2

    .line 26
    .line 27
    const/4 p2, 0x4

    .line 28
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    const/4 p2, 0x0

    .line 33
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final i(I)V
    .locals 3

    .line 1
    iget v0, p0, Lw2/t;->z:I

    .line 2
    .line 3
    iput p1, p0, Lw2/t;->z:I

    .line 4
    .line 5
    iget-object v1, p0, Lw2/t;->a:Lw2/o;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    if-ne p1, v2, :cond_0

    .line 9
    .line 10
    const/16 v2, 0x8

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    if-ne v0, v2, :cond_1

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    if-eq v0, p1, :cond_2

    .line 23
    .line 24
    iget-object p1, v1, Lw2/o;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lw2/n;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 43
    .line 44
    .line 45
    check-cast v0, Lw2/v;

    .line 46
    .line 47
    iget-object v0, v0, Lw2/v;->l:Landroidx/media3/ui/PlayerView;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->l()V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    return-void
.end method

.method public final k()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lw2/t;->C:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Lw2/t;->i(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lw2/t;->g()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget v0, p0, Lw2/t;->z:I

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-eq v0, v1, :cond_4

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    if-eq v0, v2, :cond_3

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    if-eq v0, v2, :cond_2

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    if-eq v0, v1, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return-void

    .line 29
    :cond_2
    iput-boolean v1, p0, Lw2/t;->B:Z

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_3
    iget-object v0, p0, Lw2/t;->p:Landroid/animation/AnimatorSet;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_4
    iget-object v0, p0, Lw2/t;->o:Landroid/animation/AnimatorSet;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-virtual {p0}, Lw2/t;->g()V

    .line 44
    .line 45
    .line 46
    return-void
.end method
