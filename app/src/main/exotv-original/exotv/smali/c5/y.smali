.class public final Lc5/y;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:Lw4/e;

.field public final b:Lw4/g;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroid/widget/LinearLayout;

.field public final e:Lcom/exotv/net/MainActivity;

.field public final f:Ljava/util/ArrayList;

.field public final g:Z

.field public final h:I

.field public i:Z

.field public final j:I

.field public final k:F

.field public l:Landroid/widget/LinearLayout;

.field public final m:I

.field public final n:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>(Lcom/exotv/net/MainActivity;Lw4/e;Lw4/g;)V
    .locals 21

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
    move-object/from16 v2, p2

    .line 9
    .line 10
    iput-object v2, v0, Lc5/y;->a:Lw4/e;

    .line 11
    .line 12
    move-object/from16 v2, p3

    .line 13
    .line 14
    iput-object v2, v0, Lc5/y;->b:Lw4/g;

    .line 15
    .line 16
    iput-object v1, v0, Lc5/y;->e:Lcom/exotv/net/MainActivity;

    .line 17
    .line 18
    new-instance v2, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v2, v0, Lc5/y;->f:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const v3, 0x7f050002

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    iput-boolean v2, v0, Lc5/y;->g:Z

    .line 37
    .line 38
    const-string v3, "#861337"

    .line 39
    .line 40
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    iput v3, v0, Lc5/y;->h:I

    .line 45
    .line 46
    xor-int/lit8 v3, v2, 0x1

    .line 47
    .line 48
    iput-boolean v3, v0, Lc5/y;->i:Z

    .line 49
    .line 50
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    const v4, 0x7f07049c

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    iput v3, v0, Lc5/y;->j:I

    .line 62
    .line 63
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    const v4, 0x7f070497

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    iput v3, v0, Lc5/y;->k:F

    .line 75
    .line 76
    const/4 v3, -0x2

    .line 77
    iput v3, v0, Lc5/y;->m:I

    .line 78
    .line 79
    new-instance v4, Landroid/widget/LinearLayout;

    .line 80
    .line 81
    invoke-direct {v4, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 85
    .line 86
    .line 87
    if-eqz v2, :cond_0

    .line 88
    .line 89
    const/16 v6, 0x30

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_0
    const/16 v6, 0x11

    .line 93
    .line 94
    :goto_0
    invoke-virtual {v4, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 95
    .line 96
    .line 97
    sget v6, Lc5/z;->b:I

    .line 98
    .line 99
    invoke-virtual {v4, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    const v7, 0x7f070496

    .line 107
    .line 108
    .line 109
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    const v8, 0x7f0704a3

    .line 118
    .line 119
    .line 120
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    invoke-virtual {v4, v6, v7, v6, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 125
    .line 126
    .line 127
    const/4 v6, 0x0

    .line 128
    if-eqz v2, :cond_1

    .line 129
    .line 130
    invoke-virtual {v4, v6}, Landroid/view/View;->setFocusable(Z)V

    .line 131
    .line 132
    .line 133
    const/high16 v7, 0x40000

    .line 134
    .line 135
    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 142
    .line 143
    .line 144
    :cond_1
    iput-object v4, v0, Lc5/y;->n:Landroid/widget/LinearLayout;

    .line 145
    .line 146
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    const v9, 0x7f070498

    .line 151
    .line 152
    .line 153
    invoke-virtual {v7, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 158
    .line 159
    .line 160
    move-result-object v9

    .line 161
    const v10, 0x7f07049d

    .line 162
    .line 163
    .line 164
    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getDimension(I)F

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 169
    .line 170
    .line 171
    move-result-object v10

    .line 172
    const v11, 0x7f07049a

    .line 173
    .line 174
    .line 175
    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 176
    .line 177
    .line 178
    move-result v10

    .line 179
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 180
    .line 181
    .line 182
    move-result-object v11

    .line 183
    const v12, 0x7f07049b

    .line 184
    .line 185
    .line 186
    invoke-virtual {v11, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 187
    .line 188
    .line 189
    move-result v11

    .line 190
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 191
    .line 192
    .line 193
    move-result-object v12

    .line 194
    const v13, 0x7f070499

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 198
    .line 199
    .line 200
    move-result v12

    .line 201
    const/16 v14, 0x10

    .line 202
    .line 203
    const/4 v15, 0x1

    .line 204
    if-eqz v2, :cond_5

    .line 205
    .line 206
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    const/16 p3, 0x2

    .line 211
    .line 212
    const v13, 0x7f0704a1

    .line 213
    .line 214
    .line 215
    invoke-virtual {v5, v13}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    new-instance v13, Landroid/widget/TextView;

    .line 220
    .line 221
    invoke-direct {v13, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 222
    .line 223
    .line 224
    const v8, 0x7f110022

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    invoke-virtual {v13, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    const v8, 0x7f0704a2

    .line 239
    .line 240
    .line 241
    invoke-virtual {v3, v8}, Landroid/content/res/Resources;->getDimension(I)F

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    invoke-virtual {v13, v6, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 246
    .line 247
    .line 248
    const/4 v3, -0x1

    .line 249
    invoke-virtual {v13, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 250
    .line 251
    .line 252
    sget-object v3, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 253
    .line 254
    invoke-virtual {v13, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v13}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    invoke-virtual {v3, v15}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v13, v6}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 265
    .line 266
    .line 267
    iput-object v13, v0, Lc5/y;->c:Landroid/widget/TextView;

    .line 268
    .line 269
    new-instance v3, Landroid/widget/LinearLayout;

    .line 270
    .line 271
    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v3, v14}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 278
    .line 279
    .line 280
    sub-int v8, v5, v7

    .line 281
    .line 282
    div-int/lit8 v8, v8, 0x2

    .line 283
    .line 284
    sub-int v8, v10, v8

    .line 285
    .line 286
    if-gez v8, :cond_2

    .line 287
    .line 288
    move v8, v6

    .line 289
    :cond_2
    invoke-virtual {v3, v8, v6, v6, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 290
    .line 291
    .line 292
    new-instance v8, Landroid/widget/ImageView;

    .line 293
    .line 294
    invoke-direct {v8, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 295
    .line 296
    .line 297
    const v6, 0x7f0800c9

    .line 298
    .line 299
    .line 300
    invoke-virtual {v8, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 301
    .line 302
    .line 303
    sget-object v6, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 304
    .line 305
    invoke-virtual {v8, v6}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 306
    .line 307
    .line 308
    const v6, 0x7f110022

    .line 309
    .line 310
    .line 311
    invoke-virtual {v1, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v6

    .line 315
    invoke-virtual {v8, v6}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 316
    .line 317
    .line 318
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 319
    .line 320
    invoke-direct {v6, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v3, v8, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 324
    .line 325
    .line 326
    iget-boolean v5, v0, Lc5/y;->i:Z

    .line 327
    .line 328
    if-eqz v5, :cond_3

    .line 329
    .line 330
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 331
    .line 332
    const/4 v6, -0x2

    .line 333
    invoke-direct {v5, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 337
    .line 338
    .line 339
    move-result-object v8

    .line 340
    const v14, 0x7f0704a0

    .line 341
    .line 342
    .line 343
    invoke-virtual {v8, v14}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 344
    .line 345
    .line 346
    move-result v8

    .line 347
    invoke-virtual {v5, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v3, v13, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 351
    .line 352
    .line 353
    goto :goto_1

    .line 354
    :cond_3
    const/4 v6, -0x2

    .line 355
    :goto_1
    iput-object v3, v0, Lc5/y;->d:Landroid/widget/LinearLayout;

    .line 356
    .line 357
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 358
    .line 359
    invoke-direct {v5, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 363
    .line 364
    .line 365
    move-result-object v6

    .line 366
    const v8, 0x7f0704b9

    .line 367
    .line 368
    .line 369
    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 370
    .line 371
    .line 372
    move-result v6

    .line 373
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 374
    .line 375
    .line 376
    move-result-object v8

    .line 377
    const v13, 0x7f07005a

    .line 378
    .line 379
    .line 380
    invoke-virtual {v8, v13}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 381
    .line 382
    .line 383
    move-result v8

    .line 384
    add-int/2addr v8, v6

    .line 385
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 386
    .line 387
    .line 388
    move-result-object v6

    .line 389
    const v13, 0x7f0704a3

    .line 390
    .line 391
    .line 392
    invoke-virtual {v6, v13}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 393
    .line 394
    .line 395
    move-result v6

    .line 396
    sub-int v6, v8, v6

    .line 397
    .line 398
    if-gez v6, :cond_4

    .line 399
    .line 400
    const/4 v6, 0x0

    .line 401
    :cond_4
    iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 402
    .line 403
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 404
    .line 405
    .line 406
    move-result-object v6

    .line 407
    const v8, 0x7f07049f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 411
    .line 412
    .line 413
    move-result v6

    .line 414
    iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 415
    .line 416
    invoke-virtual {v4, v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 417
    .line 418
    .line 419
    goto :goto_2

    .line 420
    :cond_5
    const/16 p3, 0x2

    .line 421
    .line 422
    :goto_2
    const/high16 v3, 0x3f800000    # 1.0f

    .line 423
    .line 424
    if-eqz v2, :cond_6

    .line 425
    .line 426
    new-instance v2, Landroid/widget/LinearLayout;

    .line 427
    .line 428
    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 432
    .line 433
    .line 434
    const/16 v5, 0x10

    .line 435
    .line 436
    invoke-virtual {v2, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 437
    .line 438
    .line 439
    const/4 v5, 0x0

    .line 440
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 444
    .line 445
    .line 446
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 447
    .line 448
    const/4 v8, -0x2

    .line 449
    invoke-direct {v6, v8, v5, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v4, v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 453
    .line 454
    .line 455
    move-object v4, v2

    .line 456
    :cond_6
    invoke-static {}, Lc5/w;->values()[Lc5/w;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    array-length v5, v2

    .line 461
    const/4 v6, 0x0

    .line 462
    const/4 v8, 0x0

    .line 463
    :goto_3
    if-ge v6, v5, :cond_13

    .line 464
    .line 465
    aget-object v13, v2, v6

    .line 466
    .line 467
    add-int/lit8 v14, v8, 0x1

    .line 468
    .line 469
    new-instance v3, Landroid/widget/ImageView;

    .line 470
    .line 471
    invoke-direct {v3, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 472
    .line 473
    .line 474
    iget v15, v13, Lc5/w;->k:I

    .line 475
    .line 476
    move-object/from16 v16, v2

    .line 477
    .line 478
    iget v2, v13, Lc5/w;->l:F

    .line 479
    .line 480
    invoke-virtual {v3, v15}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 481
    .line 482
    .line 483
    sget-object v15, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 484
    .line 485
    invoke-virtual {v3, v15}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 486
    .line 487
    .line 488
    sget v15, Lc5/z;->d:I

    .line 489
    .line 490
    invoke-virtual {v3, v15}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 491
    .line 492
    .line 493
    move/from16 v17, v5

    .line 494
    .line 495
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 496
    .line 497
    invoke-direct {v5, v7, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v3, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v3, v2}, Landroid/view/View;->setScaleX(F)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v3, v2}, Landroid/view/View;->setScaleY(F)V

    .line 507
    .line 508
    .line 509
    new-instance v2, Landroid/widget/TextView;

    .line 510
    .line 511
    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 512
    .line 513
    .line 514
    iget v5, v13, Lc5/w;->j:I

    .line 515
    .line 516
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v5

    .line 520
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 521
    .line 522
    .line 523
    iget-boolean v5, v0, Lc5/y;->g:Z

    .line 524
    .line 525
    if-eqz v5, :cond_7

    .line 526
    .line 527
    const/high16 v5, 0x41880000    # 17.0f

    .line 528
    .line 529
    :goto_4
    move/from16 v18, v6

    .line 530
    .line 531
    move/from16 v6, p3

    .line 532
    .line 533
    goto :goto_5

    .line 534
    :cond_7
    iget-object v5, v0, Lc5/y;->e:Lcom/exotv/net/MainActivity;

    .line 535
    .line 536
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 537
    .line 538
    .line 539
    move-result-object v5

    .line 540
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 541
    .line 542
    .line 543
    move-result-object v5

    .line 544
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 545
    .line 546
    move/from16 v18, v5

    .line 547
    .line 548
    iget-object v5, v0, Lc5/y;->e:Lcom/exotv/net/MainActivity;

    .line 549
    .line 550
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 551
    .line 552
    .line 553
    move-result-object v5

    .line 554
    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 555
    .line 556
    .line 557
    move-result-object v5

    .line 558
    iget v5, v5, Landroid/content/res/Configuration;->fontScale:F

    .line 559
    .line 560
    mul-float v5, v5, v18

    .line 561
    .line 562
    div-float v5, v9, v5

    .line 563
    .line 564
    goto :goto_4

    .line 565
    :goto_5
    invoke-virtual {v2, v6, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 566
    .line 567
    .line 568
    const/16 v6, 0x10

    .line 569
    .line 570
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 571
    .line 572
    .line 573
    sget-object v6, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 574
    .line 575
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 579
    .line 580
    .line 581
    move-result-object v6

    .line 582
    move/from16 v19, v7

    .line 583
    .line 584
    const/4 v7, 0x1

    .line 585
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 586
    .line 587
    .line 588
    const/4 v6, 0x0

    .line 589
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 593
    .line 594
    .line 595
    sget-object v6, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 596
    .line 597
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 598
    .line 599
    .line 600
    iget-boolean v6, v0, Lc5/y;->g:Z

    .line 601
    .line 602
    if-nez v6, :cond_9

    .line 603
    .line 604
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 605
    .line 606
    const/16 v7, 0x1a

    .line 607
    .line 608
    if-lt v6, v7, :cond_9

    .line 609
    .line 610
    float-to-int v5, v5

    .line 611
    const/16 v6, 0xb

    .line 612
    .line 613
    if-ge v5, v6, :cond_8

    .line 614
    .line 615
    move v5, v6

    .line 616
    :cond_8
    move/from16 p3, v9

    .line 617
    .line 618
    const/16 v6, 0xa

    .line 619
    .line 620
    const/4 v7, 0x2

    .line 621
    const/4 v9, 0x1

    .line 622
    invoke-virtual {v2, v6, v5, v9, v7}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    .line 623
    .line 624
    .line 625
    goto :goto_6

    .line 626
    :cond_9
    move/from16 p3, v9

    .line 627
    .line 628
    const/4 v7, 0x2

    .line 629
    :goto_6
    invoke-virtual {v2, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 630
    .line 631
    .line 632
    iget-boolean v5, v0, Lc5/y;->i:Z

    .line 633
    .line 634
    if-eqz v5, :cond_a

    .line 635
    .line 636
    const/4 v5, 0x0

    .line 637
    goto :goto_7

    .line 638
    :cond_a
    const/16 v5, 0x8

    .line 639
    .line 640
    :goto_7
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 644
    .line 645
    .line 646
    move-result-object v5

    .line 647
    invoke-virtual {v5}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 648
    .line 649
    .line 650
    move-result-object v5

    .line 651
    new-instance v6, Landroid/graphics/Rect;

    .line 652
    .line 653
    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 657
    .line 658
    .line 659
    move-result-object v9

    .line 660
    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 661
    .line 662
    .line 663
    move-result-object v15

    .line 664
    invoke-virtual {v15}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v15

    .line 668
    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 669
    .line 670
    .line 671
    move-result-object v20

    .line 672
    invoke-interface/range {v20 .. v20}, Ljava/lang/CharSequence;->length()I

    .line 673
    .line 674
    .line 675
    move-result v7

    .line 676
    move/from16 v20, v14

    .line 677
    .line 678
    const/4 v14, 0x0

    .line 679
    invoke-virtual {v9, v15, v14, v7, v6}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 680
    .line 681
    .line 682
    iget v7, v6, Landroid/graphics/Rect;->top:I

    .line 683
    .line 684
    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    .line 685
    .line 686
    add-int/2addr v7, v6

    .line 687
    int-to-float v6, v7

    .line 688
    const/high16 v7, 0x40000000    # 2.0f

    .line 689
    .line 690
    div-float/2addr v6, v7

    .line 691
    iget v9, v5, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 692
    .line 693
    iget v5, v5, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 694
    .line 695
    add-float/2addr v9, v5

    .line 696
    div-float/2addr v9, v7

    .line 697
    sub-float/2addr v6, v9

    .line 698
    iget v5, v0, Lc5/y;->k:F

    .line 699
    .line 700
    sub-float/2addr v6, v5

    .line 701
    invoke-virtual {v3, v6}, Landroid/view/View;->setTranslationY(F)V

    .line 702
    .line 703
    .line 704
    new-instance v5, Landroid/widget/LinearLayout;

    .line 705
    .line 706
    invoke-direct {v5, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 707
    .line 708
    .line 709
    const/4 v14, 0x0

    .line 710
    invoke-virtual {v5, v14}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 711
    .line 712
    .line 713
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 714
    .line 715
    .line 716
    move-result v6

    .line 717
    invoke-virtual {v5, v6}, Landroid/view/View;->setId(I)V

    .line 718
    .line 719
    .line 720
    iget-boolean v6, v0, Lc5/y;->g:Z

    .line 721
    .line 722
    if-eqz v6, :cond_b

    .line 723
    .line 724
    const/16 v6, 0x10

    .line 725
    .line 726
    goto :goto_8

    .line 727
    :cond_b
    const/16 v6, 0x11

    .line 728
    .line 729
    :goto_8
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v5, v10, v11, v10, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 733
    .line 734
    .line 735
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 736
    .line 737
    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 738
    .line 739
    .line 740
    invoke-virtual {v6, v14}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 741
    .line 742
    .line 743
    const/16 v7, 0xa

    .line 744
    .line 745
    int-to-float v7, v7

    .line 746
    invoke-virtual {v6, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v6, v14}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 750
    .line 751
    .line 752
    invoke-virtual {v5, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 753
    .line 754
    .line 755
    const/4 v7, 0x1

    .line 756
    invoke-virtual {v5, v7}, Landroid/view/View;->setClickable(Z)V

    .line 757
    .line 758
    .line 759
    invoke-virtual {v5, v7}, Landroid/view/View;->setFocusable(Z)V

    .line 760
    .line 761
    .line 762
    iget-boolean v6, v0, Lc5/y;->g:Z

    .line 763
    .line 764
    if-eqz v6, :cond_c

    .line 765
    .line 766
    invoke-virtual {v5, v7}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v5, v14}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 770
    .line 771
    .line 772
    invoke-virtual {v5, v14}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 773
    .line 774
    .line 775
    :cond_c
    new-instance v6, Lc5/p;

    .line 776
    .line 777
    const/4 v9, 0x1

    .line 778
    invoke-direct {v6, v0, v9, v13}, Lc5/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 779
    .line 780
    .line 781
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 782
    .line 783
    .line 784
    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 785
    .line 786
    .line 787
    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 788
    .line 789
    .line 790
    iget-boolean v6, v0, Lc5/y;->g:Z

    .line 791
    .line 792
    if-eqz v6, :cond_d

    .line 793
    .line 794
    new-instance v6, Lc5/u;

    .line 795
    .line 796
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 797
    .line 798
    .line 799
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 800
    .line 801
    .line 802
    :cond_d
    new-instance v6, Lc5/x;

    .line 803
    .line 804
    invoke-direct {v6, v5, v3, v2}, Lc5/x;-><init>(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    .line 805
    .line 806
    .line 807
    iget-object v2, v0, Lc5/y;->f:Ljava/util/ArrayList;

    .line 808
    .line 809
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 810
    .line 811
    .line 812
    new-instance v2, Lc5/l;

    .line 813
    .line 814
    const/4 v3, 0x1

    .line 815
    invoke-direct {v2, v3, v0}, Lc5/l;-><init>(ILjava/lang/Object;)V

    .line 816
    .line 817
    .line 818
    invoke-virtual {v5, v2}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 819
    .line 820
    .line 821
    new-instance v2, Lc5/v;

    .line 822
    .line 823
    invoke-direct {v2, v0, v6}, Lc5/v;-><init>(Lc5/y;Lc5/x;)V

    .line 824
    .line 825
    .line 826
    invoke-virtual {v5, v2}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 827
    .line 828
    .line 829
    iget-boolean v2, v0, Lc5/y;->g:Z

    .line 830
    .line 831
    if-eqz v2, :cond_f

    .line 832
    .line 833
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 834
    .line 835
    iget v3, v0, Lc5/y;->m:I

    .line 836
    .line 837
    invoke-direct {v2, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 838
    .line 839
    .line 840
    if-lez v8, :cond_e

    .line 841
    .line 842
    iput v12, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 843
    .line 844
    :cond_e
    const/high16 v6, 0x3f800000    # 1.0f

    .line 845
    .line 846
    const/4 v14, 0x0

    .line 847
    goto :goto_9

    .line 848
    :cond_f
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 849
    .line 850
    iget v3, v0, Lc5/y;->m:I

    .line 851
    .line 852
    const/high16 v6, 0x3f800000    # 1.0f

    .line 853
    .line 854
    const/4 v14, 0x0

    .line 855
    invoke-direct {v2, v14, v3, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 856
    .line 857
    .line 858
    if-lez v8, :cond_10

    .line 859
    .line 860
    iput v12, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 861
    .line 862
    :cond_10
    iget-object v3, v0, Lc5/y;->e:Lcom/exotv/net/MainActivity;

    .line 863
    .line 864
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 865
    .line 866
    .line 867
    move-result-object v3

    .line 868
    const v9, 0x7f070495

    .line 869
    .line 870
    .line 871
    invoke-virtual {v3, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 872
    .line 873
    .line 874
    move-result v3

    .line 875
    if-nez v8, :cond_11

    .line 876
    .line 877
    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 878
    .line 879
    :cond_11
    sget-object v9, Lc5/w;->r:Ls6/b;

    .line 880
    .line 881
    invoke-static {v9}, Lm6/i;->s0(Ljava/util/List;)I

    .line 882
    .line 883
    .line 884
    move-result v9

    .line 885
    if-ne v8, v9, :cond_12

    .line 886
    .line 887
    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 888
    .line 889
    :cond_12
    :goto_9
    invoke-virtual {v4, v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 890
    .line 891
    .line 892
    add-int/lit8 v2, v18, 0x1

    .line 893
    .line 894
    move/from16 v9, p3

    .line 895
    .line 896
    move v3, v6

    .line 897
    move v15, v7

    .line 898
    move/from16 v5, v17

    .line 899
    .line 900
    move/from16 v7, v19

    .line 901
    .line 902
    move/from16 v8, v20

    .line 903
    .line 904
    const/16 p3, 0x2

    .line 905
    .line 906
    move v6, v2

    .line 907
    move-object/from16 v2, v16

    .line 908
    .line 909
    goto/16 :goto_3

    .line 910
    .line 911
    :cond_13
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lc5/y;->g:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object v0, p0, Lc5/y;->f:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    :cond_1
    if-ge v2, v1, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    move-object v4, v3

    .line 22
    check-cast v4, Lc5/x;

    .line 23
    .line 24
    iget-object v4, v4, Lc5/x;->a:Landroid/widget/LinearLayout;

    .line 25
    .line 26
    invoke-virtual {v4}, Landroid/view/View;->isSelected()Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    const/4 v3, 0x0

    .line 34
    :goto_0
    check-cast v3, Lc5/x;

    .line 35
    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    iget-object v0, v3, Lc5/x;->a:Landroid/widget/LinearLayout;

    .line 39
    .line 40
    new-instance v1, Landroidx/lifecycle/c0;

    .line 41
    .line 42
    const/16 v2, 0xd

    .line 43
    .line 44
    invoke-direct {v1, v2, v0}, Landroidx/lifecycle/c0;-><init>(ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 48
    .line 49
    .line 50
    :cond_3
    :goto_1
    return-void
.end method

.method public final b()I
    .locals 5

    .line 1
    iget-object v0, p0, Lc5/y;->f:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :cond_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    move-object v4, v3

    .line 17
    check-cast v4, Lc5/x;

    .line 18
    .line 19
    iget-object v4, v4, Lc5/x;->a:Landroid/widget/LinearLayout;

    .line 20
    .line 21
    invoke-virtual {v4}, Landroid/view/View;->isSelected()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v3, 0x0

    .line 29
    :goto_0
    check-cast v3, Lc5/x;

    .line 30
    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    iget-object v0, v3, Lc5/x;->a:Landroid/widget/LinearLayout;

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    iget-object v0, p0, Lc5/y;->l:Landroid/widget/LinearLayout;

    .line 37
    .line 38
    :goto_1
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    return v0

    .line 45
    :cond_3
    const/4 v0, -0x1

    .line 46
    return v0
.end method

.method public final c(Lc5/x;Z)V
    .locals 7

    .line 1
    iget-object v0, p1, Lc5/x;->a:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-boolean v3, p0, Lc5/y;->g:Z

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    move v4, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v4, v2

    .line 18
    :goto_0
    if-nez p2, :cond_2

    .line 19
    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    sget v5, Lc5/z;->d:I

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    :goto_1
    const/4 v5, -0x1

    .line 27
    :goto_2
    iget-object v6, p1, Lc5/x;->c:Landroid/widget/TextView;

    .line 28
    .line 29
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p1, Lc5/x;->b:Landroid/widget/ImageView;

    .line 33
    .line 34
    invoke-virtual {p1, v5}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 35
    .line 36
    .line 37
    const/16 p1, 0xa

    .line 38
    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    sget v5, Lc5/z;->f:I

    .line 42
    .line 43
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 44
    .line 45
    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v6, v2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 49
    .line 50
    .line 51
    int-to-float p1, p1

    .line 52
    invoke-virtual {v6, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 56
    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_3
    if-eqz p2, :cond_4

    .line 60
    .line 61
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 62
    .line 63
    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v6, v2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 67
    .line 68
    .line 69
    int-to-float p1, p1

    .line 70
    invoke-virtual {v6, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 71
    .line 72
    .line 73
    iget p1, p0, Lc5/y;->h:I

    .line 74
    .line 75
    invoke-virtual {v6, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 76
    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_4
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 80
    .line 81
    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6, v2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 85
    .line 86
    .line 87
    int-to-float p1, p1

    .line 88
    invoke-virtual {v6, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v6, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 92
    .line 93
    .line 94
    :goto_3
    invoke-virtual {v0, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 95
    .line 96
    .line 97
    const/4 p1, 0x0

    .line 98
    invoke-virtual {v0, p1}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 99
    .line 100
    .line 101
    if-eqz v4, :cond_5

    .line 102
    .line 103
    const/16 p1, 0x8

    .line 104
    .line 105
    int-to-float p1, p1

    .line 106
    iget-object v2, p0, Lc5/y;->e:Lcom/exotv/net/MainActivity;

    .line 107
    .line 108
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-static {v1, p1, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    float-to-int p1, p1

    .line 121
    int-to-float p1, p1

    .line 122
    goto :goto_4

    .line 123
    :cond_5
    const/4 p1, 0x0

    .line 124
    :goto_4
    invoke-virtual {v0, p1}, Landroid/view/View;->setElevation(F)V

    .line 125
    .line 126
    .line 127
    if-eqz v4, :cond_6

    .line 128
    .line 129
    const p1, 0x3f8ccccd    # 1.1f

    .line 130
    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_6
    if-eqz v3, :cond_7

    .line 134
    .line 135
    if-eqz p2, :cond_7

    .line 136
    .line 137
    const p1, 0x3f851eb8    # 1.04f

    .line 138
    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_7
    const/high16 p1, 0x3f800000    # 1.0f

    .line 142
    .line 143
    :goto_5
    if-eqz v3, :cond_8

    .line 144
    .line 145
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    invoke-virtual {p2}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    invoke-virtual {p2, p1}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-virtual {p2, p1}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    const-wide/16 v0, 0x8c

    .line 165
    .line 166
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :cond_8
    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleX(F)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleY(F)V

    .line 178
    .line 179
    .line 180
    return-void
.end method

.method public final d(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lc5/y;->f:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    check-cast v3, Lc5/x;

    .line 17
    .line 18
    iget-object v3, v3, Lc5/x;->a:Landroid/widget/LinearLayout;

    .line 19
    .line 20
    invoke-virtual {v3, p1}, Landroid/view/View;->setClickable(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3, p1}, Landroid/view/View;->setFocusable(Z)V

    .line 24
    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    const/high16 v4, 0x3f800000    # 1.0f

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    const v4, 0x3ecccccd    # 0.4f

    .line 32
    .line 33
    .line 34
    :goto_1
    invoke-virtual {v3, v4}, Landroid/view/View;->setAlpha(F)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    if-nez p1, :cond_2

    .line 39
    .line 40
    iget-boolean p1, p0, Lc5/y;->g:Z

    .line 41
    .line 42
    xor-int/lit8 p1, p1, 0x1

    .line 43
    .line 44
    iput-boolean p1, p0, Lc5/y;->i:Z

    .line 45
    .line 46
    :cond_2
    invoke-virtual {p0}, Lc5/y;->f()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final e(Lc5/w;)V
    .locals 9

    .line 1
    invoke-static {}, Lc5/w;->values()[Lc5/w;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    move v4, v3

    .line 9
    :goto_0
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    aget-object v5, v0, v3

    .line 12
    .line 13
    add-int/lit8 v6, v4, 0x1

    .line 14
    .line 15
    if-ne v5, p1, :cond_0

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    move v5, v2

    .line 20
    :goto_1
    iget-object v7, p0, Lc5/y;->f:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    check-cast v8, Lc5/x;

    .line 27
    .line 28
    iget-object v8, v8, Lc5/x;->a:Landroid/widget/LinearLayout;

    .line 29
    .line 30
    invoke-virtual {v8, v5}, Landroid/view/View;->setSelected(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const-string v7, "get(...)"

    .line 38
    .line 39
    invoke-static {v7, v4}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    check-cast v4, Lc5/x;

    .line 43
    .line 44
    invoke-virtual {p0, v4, v5}, Lc5/y;->c(Lc5/x;Z)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    move v4, v6

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    return-void
.end method

.method public final f()V
    .locals 12

    .line 1
    iget-boolean v0, p0, Lc5/y;->i:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move v2, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/16 v2, 0x8

    .line 9
    .line 10
    :goto_0
    iget v3, p0, Lc5/y;->m:I

    .line 11
    .line 12
    iget-object v4, p0, Lc5/y;->e:Lcom/exotv/net/MainActivity;

    .line 13
    .line 14
    iget-boolean v5, p0, Lc5/y;->g:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const v6, 0x7f0700da

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v0, v3

    .line 33
    :goto_1
    iget-object v6, p0, Lc5/y;->f:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    move v8, v1

    .line 40
    :cond_2
    :goto_2
    if-ge v8, v7, :cond_5

    .line 41
    .line 42
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    add-int/lit8 v8, v8, 0x1

    .line 47
    .line 48
    check-cast v9, Lc5/x;

    .line 49
    .line 50
    iget-object v10, v9, Lc5/x;->c:Landroid/widget/TextView;

    .line 51
    .line 52
    iget-object v9, v9, Lc5/x;->a:Landroid/widget/LinearLayout;

    .line 53
    .line 54
    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    if-eq v11, v2, :cond_4

    .line 59
    .line 60
    invoke-virtual {v10, v2}, Landroid/view/View;->setVisibility(I)V

    .line 61
    .line 62
    .line 63
    iget-boolean v11, p0, Lc5/y;->i:Z

    .line 64
    .line 65
    if-eqz v11, :cond_3

    .line 66
    .line 67
    iget v11, p0, Lc5/y;->j:I

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_3
    move v11, v1

    .line 71
    :goto_3
    invoke-virtual {v10, v11, v1, v1, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 72
    .line 73
    .line 74
    :cond_4
    if-eqz v5, :cond_2

    .line 75
    .line 76
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    if-eqz v10, :cond_2

    .line 81
    .line 82
    iget v11, v10, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 83
    .line 84
    if-eq v11, v0, :cond_2

    .line 85
    .line 86
    iput v0, v10, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 87
    .line 88
    invoke-virtual {v9, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    iget-object v0, p0, Lc5/y;->d:Landroid/widget/LinearLayout;

    .line 93
    .line 94
    if-eqz v0, :cond_8

    .line 95
    .line 96
    iget-object v2, p0, Lc5/y;->c:Landroid/widget/TextView;

    .line 97
    .line 98
    if-nez v2, :cond_6

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_6
    iget-boolean v5, p0, Lc5/y;->i:Z

    .line 102
    .line 103
    if-eqz v5, :cond_7

    .line 104
    .line 105
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    if-nez v5, :cond_7

    .line 110
    .line 111
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 112
    .line 113
    .line 114
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 115
    .line 116
    invoke-direct {v1, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    const v4, 0x7f0704a0

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 134
    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_7
    iget-boolean v1, p0, Lc5/y;->i:Z

    .line 138
    .line 139
    if-nez v1, :cond_8

    .line 140
    .line 141
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    if-eqz v1, :cond_8

    .line 146
    .line 147
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 148
    .line 149
    .line 150
    :cond_8
    :goto_4
    iget-object v0, p0, Lc5/y;->n:Landroid/widget/LinearLayout;

    .line 151
    .line 152
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 153
    .line 154
    .line 155
    return-void
.end method
