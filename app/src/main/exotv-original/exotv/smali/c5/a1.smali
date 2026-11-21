.class public final Lc5/a1;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:Lcom/exotv/net/MainActivity;

.field public final b:Landroidx/lifecycle/q;

.field public final c:Lw4/g;

.field public d:Li7/a0;

.field public final e:Lm7/c;

.field public f:Lc5/w0;

.field public final g:Landroid/widget/EditText;

.field public final h:Landroid/widget/TextView;

.field public final i:Landroid/widget/LinearLayout;

.field public j:Landroid/widget/LinearLayout;

.field public final k:Ljava/util/ArrayList;

.field public final l:I

.field public final m:I

.field public final n:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>(Lcom/exotv/net/MainActivity;Landroidx/lifecycle/q;Lw4/g;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v2, v0, Lc5/a1;->a:Lcom/exotv/net/MainActivity;

    .line 9
    .line 10
    move-object/from16 v1, p2

    .line 11
    .line 12
    iput-object v1, v0, Lc5/a1;->b:Landroidx/lifecycle/q;

    .line 13
    .line 14
    move-object/from16 v1, p3

    .line 15
    .line 16
    iput-object v1, v0, Lc5/a1;->c:Lw4/g;

    .line 17
    .line 18
    new-instance v1, Li7/f1;

    .line 19
    .line 20
    invoke-direct {v1}, Li7/u0;-><init>()V

    .line 21
    .line 22
    .line 23
    sget-object v3, Li7/e0;->a:Lo7/e;

    .line 24
    .line 25
    sget-object v3, Lm7/n;->a:Lj7/d;

    .line 26
    .line 27
    iget-object v3, v3, Lj7/d;->n:Lj7/d;

    .line 28
    .line 29
    invoke-static {v1, v3}, Lcom/bumptech/glide/c;->W(Lp6/f;Lp6/h;)Lp6/h;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1}, Li7/x;->a(Lp6/h;)Lm7/c;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iput-object v1, v0, Lc5/a1;->e:Lm7/c;

    .line 38
    .line 39
    sget-object v1, Lc5/w0;->l:Lc5/w0;

    .line 40
    .line 41
    iput-object v1, v0, Lc5/a1;->f:Lc5/w0;

    .line 42
    .line 43
    new-instance v1, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v1, v0, Lc5/a1;->k:Ljava/util/ArrayList;

    .line 49
    .line 50
    const/4 v9, -0x1

    .line 51
    iput v9, v0, Lc5/a1;->l:I

    .line 52
    .line 53
    const/4 v10, -0x2

    .line 54
    iput v10, v0, Lc5/a1;->m:I

    .line 55
    .line 56
    new-instance v11, Landroid/widget/LinearLayout;

    .line 57
    .line 58
    invoke-direct {v11, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 59
    .line 60
    .line 61
    const/4 v12, 0x1

    .line 62
    invoke-virtual {v11, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 63
    .line 64
    .line 65
    sget v1, Lc5/z;->b:I

    .line 66
    .line 67
    invoke-virtual {v11, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 68
    .line 69
    .line 70
    const/16 v1, 0x8

    .line 71
    .line 72
    invoke-virtual {v11, v1}, Landroid/view/View;->setVisibility(I)V

    .line 73
    .line 74
    .line 75
    new-instance v13, Landroid/widget/LinearLayout;

    .line 76
    .line 77
    invoke-direct {v13, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 78
    .line 79
    .line 80
    const/4 v14, 0x0

    .line 81
    invoke-virtual {v13, v14}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 82
    .line 83
    .line 84
    const/16 v15, 0x10

    .line 85
    .line 86
    invoke-virtual {v13, v15}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 87
    .line 88
    .line 89
    const/4 v3, 0x6

    .line 90
    invoke-virtual {v0, v3}, Lc5/a1;->a(I)I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    const/4 v5, 0x4

    .line 95
    invoke-virtual {v0, v5}, Lc5/a1;->a(I)I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    invoke-virtual {v0, v3}, Lc5/a1;->a(I)I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-virtual {v0, v5}, Lc5/a1;->a(I)I

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    invoke-virtual {v13, v4, v6, v3, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 108
    .line 109
    .line 110
    sget-object v16, Lc5/j;->a:Lc5/j;

    .line 111
    .line 112
    sget v3, Lc5/z;->h:I

    .line 113
    .line 114
    sget v4, Lc5/z;->i:I

    .line 115
    .line 116
    invoke-static {v3, v15, v12, v4}, Lc5/j;->i(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-virtual {v13, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 121
    .line 122
    .line 123
    new-instance v6, Landroid/widget/EditText;

    .line 124
    .line 125
    invoke-direct {v6, v2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 126
    .line 127
    .line 128
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    invoke-virtual {v6, v7}, Landroid/view/View;->setId(I)V

    .line 133
    .line 134
    .line 135
    const v7, 0x7f110114

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 143
    .line 144
    .line 145
    sget v7, Lc5/z;->d:I

    .line 146
    .line 147
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 151
    .line 152
    .line 153
    const/high16 v7, 0x41700000    # 15.0f

    .line 154
    .line 155
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v6, v12}, Landroid/widget/TextView;->setInputType(I)V

    .line 159
    .line 160
    .line 161
    const/4 v7, 0x3

    .line 162
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setImeOptions(I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v6}, Landroid/widget/TextView;->setSingleLine()V

    .line 166
    .line 167
    .line 168
    const/16 v7, 0xe

    .line 169
    .line 170
    invoke-virtual {v0, v7}, Lc5/a1;->a(I)I

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    const/16 v7, 0xa

    .line 175
    .line 176
    invoke-virtual {v0, v7}, Lc5/a1;->a(I)I

    .line 177
    .line 178
    .line 179
    move-result v9

    .line 180
    invoke-virtual {v0, v1}, Lc5/a1;->a(I)I

    .line 181
    .line 182
    .line 183
    move-result v15

    .line 184
    invoke-virtual {v0, v7}, Lc5/a1;->a(I)I

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    invoke-virtual {v6, v8, v9, v15, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 189
    .line 190
    .line 191
    const/4 v9, 0x0

    .line 192
    invoke-virtual {v6, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 193
    .line 194
    .line 195
    new-instance v7, Lc5/y0;

    .line 196
    .line 197
    invoke-direct {v7, v0}, Lc5/y0;-><init>(Lc5/a1;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 201
    .line 202
    .line 203
    new-instance v7, Lc5/t0;

    .line 204
    .line 205
    invoke-direct {v7, v0, v14}, Lc5/t0;-><init>(Lc5/a1;I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v6, v7}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 209
    .line 210
    .line 211
    iput-object v6, v0, Lc5/a1;->g:Landroid/widget/EditText;

    .line 212
    .line 213
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 214
    .line 215
    const/high16 v15, 0x3f800000    # 1.0f

    .line 216
    .line 217
    invoke-direct {v7, v14, v10, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v13, v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 221
    .line 222
    .line 223
    move v6, v3

    .line 224
    new-instance v3, Landroid/widget/TextView;

    .line 225
    .line 226
    invoke-direct {v3, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 227
    .line 228
    .line 229
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 230
    .line 231
    .line 232
    move-result v7

    .line 233
    invoke-virtual {v3, v7}, Landroid/view/View;->setId(I)V

    .line 234
    .line 235
    .line 236
    const-string v7, "\u2715"

    .line 237
    .line 238
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 239
    .line 240
    .line 241
    const/high16 v7, 0x41400000    # 12.0f

    .line 242
    .line 243
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 244
    .line 245
    .line 246
    const/16 v7, 0x11

    .line 247
    .line 248
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 249
    .line 250
    .line 251
    sget v8, Lc5/z;->c:I

    .line 252
    .line 253
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 254
    .line 255
    .line 256
    const v8, 0x7f110111

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v8

    .line 263
    invoke-virtual {v3, v8}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 264
    .line 265
    .line 266
    const/16 v8, 0x3e7

    .line 267
    .line 268
    invoke-static {v4, v8, v14, v14}, Lc5/j;->i(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 269
    .line 270
    .line 271
    move-result-object v8

    .line 272
    invoke-virtual {v3, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v3, v12}, Landroid/view/View;->setClickable(Z)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v3, v12}, Landroid/view/View;->setFocusable(Z)V

    .line 282
    .line 283
    .line 284
    new-instance v1, Lb6/a;

    .line 285
    .line 286
    invoke-direct {v1, v5, v0}, Lb6/a;-><init>(ILjava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v3, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 290
    .line 291
    .line 292
    move v1, v7

    .line 293
    const/4 v7, 0x0

    .line 294
    const/16 v8, 0x1e4

    .line 295
    .line 296
    move/from16 v17, v4

    .line 297
    .line 298
    const/16 v4, 0x3e7

    .line 299
    .line 300
    move/from16 v18, v5

    .line 301
    .line 302
    const/4 v5, 0x0

    .line 303
    move/from16 v19, v6

    .line 304
    .line 305
    const/4 v6, 0x0

    .line 306
    move-object/from16 v24, v9

    .line 307
    .line 308
    move-object/from16 v1, v16

    .line 309
    .line 310
    move/from16 v15, v17

    .line 311
    .line 312
    move/from16 v9, v19

    .line 313
    .line 314
    const/16 v10, 0xe

    .line 315
    .line 316
    invoke-static/range {v1 .. v8}, Lc5/j;->f(Lc5/j;Landroid/content/Context;Landroid/view/View;ILw4/x0;Ly6/a;Landroid/view/View;I)V

    .line 317
    .line 318
    .line 319
    new-instance v1, Lc5/t0;

    .line 320
    .line 321
    invoke-direct {v1, v0, v12}, Lc5/t0;-><init>(Lc5/a1;I)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v3, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 325
    .line 326
    .line 327
    iput-object v3, v0, Lc5/a1;->h:Landroid/widget/TextView;

    .line 328
    .line 329
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 330
    .line 331
    const/16 v4, 0x20

    .line 332
    .line 333
    invoke-virtual {v0, v4}, Lc5/a1;->a(I)I

    .line 334
    .line 335
    .line 336
    move-result v5

    .line 337
    invoke-virtual {v0, v4}, Lc5/a1;->a(I)I

    .line 338
    .line 339
    .line 340
    move-result v4

    .line 341
    invoke-direct {v1, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v13, v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 345
    .line 346
    .line 347
    new-instance v1, Lc5/u0;

    .line 348
    .line 349
    invoke-direct {v1, v0, v13, v14}, Lc5/u0;-><init>(Lc5/a1;Landroid/widget/LinearLayout;I)V

    .line 350
    .line 351
    .line 352
    const-string v3, "ctx"

    .line 353
    .line 354
    invoke-static {v3, v2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 358
    .line 359
    .line 360
    move-result-object v3

    .line 361
    const v4, 0x7f050002

    .line 362
    .line 363
    .line 364
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 365
    .line 366
    .line 367
    move-result v3

    .line 368
    if-eqz v3, :cond_0

    .line 369
    .line 370
    invoke-interface {v1}, Ly6/a;->invoke()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    :cond_0
    new-instance v1, Landroid/widget/LinearLayout;

    .line 374
    .line 375
    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v1, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 379
    .line 380
    .line 381
    const/16 v3, 0x10

    .line 382
    .line 383
    invoke-virtual {v0, v3}, Lc5/a1;->a(I)I

    .line 384
    .line 385
    .line 386
    move-result v5

    .line 387
    invoke-virtual {v0, v10}, Lc5/a1;->a(I)I

    .line 388
    .line 389
    .line 390
    move-result v6

    .line 391
    invoke-virtual {v0, v3}, Lc5/a1;->a(I)I

    .line 392
    .line 393
    .line 394
    move-result v7

    .line 395
    invoke-virtual {v1, v5, v6, v7, v14}, Landroid/view/View;->setPadding(IIII)V

    .line 396
    .line 397
    .line 398
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 399
    .line 400
    const/4 v5, -0x1

    .line 401
    const/4 v6, -0x2

    .line 402
    invoke-direct {v3, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v1, v13, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 409
    .line 410
    .line 411
    new-instance v1, Landroid/widget/LinearLayout;

    .line 412
    .line 413
    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v1, v14}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 417
    .line 418
    .line 419
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 420
    .line 421
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v3, v14}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 425
    .line 426
    .line 427
    int-to-float v5, v10

    .line 428
    invoke-virtual {v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v3, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v3, v12, v15}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 438
    .line 439
    .line 440
    invoke-static {}, Lc5/w0;->values()[Lc5/w0;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    array-length v5, v3

    .line 445
    move v6, v14

    .line 446
    move v7, v6

    .line 447
    :goto_0
    if-ge v6, v5, :cond_4

    .line 448
    .line 449
    aget-object v8, v3, v6

    .line 450
    .line 451
    add-int/lit8 v9, v7, 0x1

    .line 452
    .line 453
    if-lez v7, :cond_1

    .line 454
    .line 455
    new-instance v10, Landroid/view/View;

    .line 456
    .line 457
    invoke-direct {v10, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 458
    .line 459
    .line 460
    sget v13, Lc5/z;->i:I

    .line 461
    .line 462
    invoke-virtual {v10, v13}, Landroid/view/View;->setBackgroundColor(I)V

    .line 463
    .line 464
    .line 465
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    .line 466
    .line 467
    invoke-virtual {v0, v12}, Lc5/a1;->a(I)I

    .line 468
    .line 469
    .line 470
    move-result v15

    .line 471
    const/16 v14, 0x14

    .line 472
    .line 473
    invoke-virtual {v0, v14}, Lc5/a1;->a(I)I

    .line 474
    .line 475
    .line 476
    move-result v14

    .line 477
    invoke-direct {v13, v15, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 478
    .line 479
    .line 480
    const/16 v14, 0x10

    .line 481
    .line 482
    iput v14, v13, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 483
    .line 484
    invoke-virtual {v1, v10, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 485
    .line 486
    .line 487
    :cond_1
    new-instance v10, Landroid/widget/TextView;

    .line 488
    .line 489
    invoke-direct {v10, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 490
    .line 491
    .line 492
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 493
    .line 494
    .line 495
    move-result v13

    .line 496
    invoke-virtual {v10, v13}, Landroid/view/View;->setId(I)V

    .line 497
    .line 498
    .line 499
    iget-object v13, v8, Lc5/w0;->j:Ljava/lang/String;

    .line 500
    .line 501
    invoke-virtual {v10, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 502
    .line 503
    .line 504
    const/high16 v13, 0x41500000    # 13.0f

    .line 505
    .line 506
    invoke-virtual {v10, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 507
    .line 508
    .line 509
    const/16 v13, 0x11

    .line 510
    .line 511
    invoke-virtual {v10, v13}, Landroid/widget/TextView;->setGravity(I)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v10, v12}, Landroid/view/View;->setClickable(Z)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v10, v12}, Landroid/view/View;->setFocusable(Z)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 521
    .line 522
    .line 523
    move-result-object v14

    .line 524
    invoke-virtual {v14, v4}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 525
    .line 526
    .line 527
    move-result v14

    .line 528
    if-eqz v14, :cond_3

    .line 529
    .line 530
    iget-object v14, v0, Lc5/a1;->a:Lcom/exotv/net/MainActivity;

    .line 531
    .line 532
    if-nez v7, :cond_2

    .line 533
    .line 534
    iget-object v15, v0, Lc5/a1;->c:Lw4/g;

    .line 535
    .line 536
    move-object/from16 v21, v15

    .line 537
    .line 538
    goto :goto_1

    .line 539
    :cond_2
    move-object/from16 v21, v24

    .line 540
    .line 541
    :goto_1
    const/16 v22, 0x0

    .line 542
    .line 543
    const/16 v23, 0x1a4

    .line 544
    .line 545
    const/16 v19, 0xb

    .line 546
    .line 547
    const/16 v20, 0x0

    .line 548
    .line 549
    move-object/from16 v18, v10

    .line 550
    .line 551
    move-object/from16 v17, v14

    .line 552
    .line 553
    invoke-static/range {v16 .. v23}, Lc5/j;->f(Lc5/j;Landroid/content/Context;Landroid/view/View;ILw4/x0;Ly6/a;Landroid/view/View;I)V

    .line 554
    .line 555
    .line 556
    :cond_3
    new-instance v14, Lc5/p;

    .line 557
    .line 558
    const/4 v15, 0x4

    .line 559
    invoke-direct {v14, v0, v15, v8}, Lc5/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v10, v14}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 563
    .line 564
    .line 565
    new-instance v8, Lc5/q;

    .line 566
    .line 567
    invoke-direct {v8, v7, v12, v0}, Lc5/q;-><init>(IILjava/lang/Object;)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v10, v8}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 571
    .line 572
    .line 573
    iget-object v7, v0, Lc5/a1;->k:Ljava/util/ArrayList;

    .line 574
    .line 575
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 579
    .line 580
    const/16 v8, 0x26

    .line 581
    .line 582
    invoke-virtual {v0, v8}, Lc5/a1;->a(I)I

    .line 583
    .line 584
    .line 585
    move-result v8

    .line 586
    const/high16 v4, 0x3f800000    # 1.0f

    .line 587
    .line 588
    const/4 v14, 0x0

    .line 589
    invoke-direct {v7, v14, v8, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v1, v10, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 593
    .line 594
    .line 595
    add-int/lit8 v6, v6, 0x1

    .line 596
    .line 597
    move v7, v9

    .line 598
    const v4, 0x7f050002

    .line 599
    .line 600
    .line 601
    const/4 v14, 0x0

    .line 602
    goto/16 :goto_0

    .line 603
    .line 604
    :cond_4
    invoke-virtual {v0}, Lc5/a1;->e()V

    .line 605
    .line 606
    .line 607
    new-instance v3, Landroid/widget/LinearLayout;

    .line 608
    .line 609
    invoke-direct {v3, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v3, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 613
    .line 614
    .line 615
    const/16 v14, 0x10

    .line 616
    .line 617
    invoke-virtual {v0, v14}, Lc5/a1;->a(I)I

    .line 618
    .line 619
    .line 620
    move-result v4

    .line 621
    const/16 v5, 0xc

    .line 622
    .line 623
    invoke-virtual {v0, v5}, Lc5/a1;->a(I)I

    .line 624
    .line 625
    .line 626
    move-result v6

    .line 627
    invoke-virtual {v0, v14}, Lc5/a1;->a(I)I

    .line 628
    .line 629
    .line 630
    move-result v7

    .line 631
    invoke-virtual {v0, v5}, Lc5/a1;->a(I)I

    .line 632
    .line 633
    .line 634
    move-result v5

    .line 635
    invoke-virtual {v3, v4, v6, v7, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 636
    .line 637
    .line 638
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 639
    .line 640
    const/4 v5, -0x1

    .line 641
    const/4 v6, -0x2

    .line 642
    invoke-direct {v4, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 643
    .line 644
    .line 645
    invoke-virtual {v3, v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v11, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 649
    .line 650
    .line 651
    new-instance v1, Landroid/widget/FrameLayout;

    .line 652
    .line 653
    invoke-direct {v1, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 654
    .line 655
    .line 656
    new-instance v3, Landroid/widget/LinearLayout;

    .line 657
    .line 658
    invoke-direct {v3, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v3, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 662
    .line 663
    .line 664
    iput-object v3, v0, Lc5/a1;->i:Landroid/widget/LinearLayout;

    .line 665
    .line 666
    new-instance v2, Lc5/s0;

    .line 667
    .line 668
    iget-object v3, v0, Lc5/a1;->i:Landroid/widget/LinearLayout;

    .line 669
    .line 670
    if-eqz v3, :cond_6

    .line 671
    .line 672
    invoke-virtual {v0}, Lc5/a1;->b()Z

    .line 673
    .line 674
    .line 675
    move-result v4

    .line 676
    if-eqz v4, :cond_5

    .line 677
    .line 678
    const/16 v14, 0x10

    .line 679
    .line 680
    invoke-virtual {v0, v14}, Lc5/a1;->a(I)I

    .line 681
    .line 682
    .line 683
    move-result v14

    .line 684
    goto :goto_2

    .line 685
    :cond_5
    const/4 v14, 0x0

    .line 686
    :goto_2
    invoke-direct {v2, v3, v14}, Lc5/s0;-><init>(Landroid/widget/LinearLayout;I)V

    .line 687
    .line 688
    .line 689
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 690
    .line 691
    const/4 v5, -0x1

    .line 692
    invoke-direct {v3, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 693
    .line 694
    .line 695
    invoke-virtual {v1, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 696
    .line 697
    .line 698
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 699
    .line 700
    const/high16 v4, 0x3f800000    # 1.0f

    .line 701
    .line 702
    const/4 v14, 0x0

    .line 703
    invoke-direct {v2, v5, v14, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 704
    .line 705
    .line 706
    invoke-virtual {v11, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 707
    .line 708
    .line 709
    iput-object v11, v0, Lc5/a1;->n:Landroid/widget/LinearLayout;

    .line 710
    .line 711
    return-void

    .line 712
    :cond_6
    const-string v1, "results"

    .line 713
    .line 714
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 715
    .line 716
    .line 717
    throw v24
.end method


# virtual methods
.method public final a(I)I
    .locals 2

    .line 1
    int-to-float p1, p1

    .line 2
    iget-object v0, p0, Lc5/a1;->a:Lcom/exotv/net/MainActivity;

    .line 3
    .line 4
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    float-to-int p1, p1

    .line 18
    return p1
.end method

.method public final b()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lc5/a1;->a:Lcom/exotv/net/MainActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const v1, 0x7f050002

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
.end method

.method public final c(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lc5/a1;->d:Li7/a0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Li7/x;->b(Li7/s0;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-static {p1}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, Lc5/a1;->f:Lc5/w0;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    iget-object v3, p0, Lc5/a1;->h:Landroid/widget/TextView;

    .line 20
    .line 21
    if-eqz v3, :cond_3

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    const/16 p1, 0x8

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 p1, 0x0

    .line 33
    :goto_0
    invoke-virtual {v3, p1}, Landroid/view/View;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    const/4 v3, 0x3

    .line 41
    if-ge p1, v3, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Lc5/a1;->d()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    new-instance p1, Lc5/x0;

    .line 48
    .line 49
    invoke-direct {p1, p0, v0, v1, v2}, Lc5/x0;-><init>(Lc5/a1;Ljava/lang/String;Lc5/w0;Lp6/c;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lc5/a1;->b:Landroidx/lifecycle/q;

    .line 53
    .line 54
    invoke-static {v0, v2, p1, v3}, Li7/x;->k(Li7/u;Lj7/d;Ly6/p;I)Li7/a0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lc5/a1;->d:Li7/a0;

    .line 59
    .line 60
    return-void

    .line 61
    :cond_3
    const-string p1, "clear"

    .line 62
    .line 63
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v2
.end method

.method public final d()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lc5/a1;->j:Landroid/widget/LinearLayout;

    .line 3
    .line 4
    const-string v1, "results"

    .line 5
    .line 6
    iget-object v2, p0, Lc5/a1;->i:Landroid/widget/LinearLayout;

    .line 7
    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lc5/a1;->i:Landroid/widget/LinearLayout;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    new-instance v0, Landroid/widget/TextView;

    .line 18
    .line 19
    iget-object v1, p0, Lc5/a1;->a:Lcom/exotv/net/MainActivity;

    .line 20
    .line 21
    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    iget-object v3, p0, Lc5/a1;->f:Lc5/w0;

    .line 25
    .line 26
    iget-object v3, v3, Lc5/w0;->j:Ljava/lang/String;

    .line 27
    .line 28
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const v4, 0x7f110112

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v4, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    const/4 v1, -0x1

    .line 43
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 44
    .line 45
    .line 46
    const/high16 v1, 0x41d00000    # 26.0f

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 49
    .line 50
    .line 51
    const/16 v1, 0x11

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 54
    .line 55
    .line 56
    const/16 v1, 0x50

    .line 57
    .line 58
    invoke-virtual {p0, v1}, Lc5/a1;->a(I)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    invoke-virtual {p0, v1}, Lc5/a1;->a(I)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    const/4 v4, 0x0

    .line 67
    invoke-virtual {v0, v4, v3, v4, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 68
    .line 69
    .line 70
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 71
    .line 72
    iget v3, p0, Lc5/a1;->l:I

    .line 73
    .line 74
    iget v4, p0, Lc5/a1;->m:I

    .line 75
    .line 76
    invoke-direct {v1, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_0
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :cond_1
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v0
.end method

.method public final e()V
    .locals 9

    .line 1
    invoke-static {}, Lc5/w0;->values()[Lc5/w0;

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
    if-ge v3, v1, :cond_4

    .line 10
    .line 11
    aget-object v5, v0, v3

    .line 12
    .line 13
    add-int/lit8 v6, v4, 0x1

    .line 14
    .line 15
    iget-object v7, p0, Lc5/a1;->k:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const-string v7, "get(...)"

    .line 22
    .line 23
    invoke-static {v7, v4}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    check-cast v4, Landroid/widget/TextView;

    .line 27
    .line 28
    iget-object v7, p0, Lc5/a1;->f:Lc5/w0;

    .line 29
    .line 30
    if-ne v5, v7, :cond_0

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    move v5, v2

    .line 35
    :goto_1
    if-eqz v5, :cond_1

    .line 36
    .line 37
    const/4 v7, -0x1

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    sget v7, Lc5/z;->c:I

    .line 40
    .line 41
    :goto_2
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 42
    .line 43
    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    sget-object v7, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_2
    sget-object v7, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 50
    .line 51
    :goto_3
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 52
    .line 53
    .line 54
    if-eqz v5, :cond_3

    .line 55
    .line 56
    const-string v5, "#8B0000"

    .line 57
    .line 58
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    goto :goto_4

    .line 63
    :cond_3
    move v5, v2

    .line 64
    :goto_4
    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    .line 65
    .line 66
    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v7, v2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 70
    .line 71
    .line 72
    const/16 v8, 0xb

    .line 73
    .line 74
    int-to-float v8, v8

    .line 75
    invoke-virtual {v7, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v7, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 82
    .line 83
    .line 84
    add-int/lit8 v3, v3, 0x1

    .line 85
    .line 86
    move v4, v6

    .line 87
    goto :goto_0

    .line 88
    :cond_4
    iget-object v0, p0, Lc5/a1;->g:Landroid/widget/EditText;

    .line 89
    .line 90
    if-eqz v0, :cond_5

    .line 91
    .line 92
    iget-object v1, p0, Lc5/a1;->a:Lcom/exotv/net/MainActivity;

    .line 93
    .line 94
    const v2, 0x7f110114

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    const-string v2, "getString(...)"

    .line 102
    .line 103
    invoke-static {v2, v1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iget-object v2, p0, Lc5/a1;->f:Lc5/w0;

    .line 107
    .line 108
    iget-object v2, v2, Lc5/w0;->j:Ljava/lang/String;

    .line 109
    .line 110
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 111
    .line 112
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    const-string v3, "toLowerCase(...)"

    .line 117
    .line 118
    invoke-static {v3, v2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    const-string v3, "movie"

    .line 122
    .line 123
    invoke-static {v1, v3, v2}, Lh7/p;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_5
    const-string v0, "input"

    .line 132
    .line 133
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    const/4 v0, 0x0

    .line 137
    throw v0
.end method
