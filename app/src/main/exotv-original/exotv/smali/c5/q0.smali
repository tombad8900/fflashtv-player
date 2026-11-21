.class public final Lc5/q0;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public final synthetic n:I

.field public o:I

.field public p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lh/i;Lp6/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lc5/q0;->n:I

    iput-object p1, p0, Lc5/q0;->q:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lr6/h;-><init>(ILp6/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lp6/c;I)V
    .locals 0

    .line 2
    iput p4, p0, Lc5/q0;->n:I

    iput-object p1, p0, Lc5/q0;->p:Ljava/lang/Object;

    iput-object p2, p0, Lc5/q0;->q:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lr6/h;-><init>(ILp6/c;)V

    return-void
.end method

.method private final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 38

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v2, Lc5/j;->a:Lc5/j;

    .line 4
    .line 5
    iget-object v0, v1, Lc5/q0;->q:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v3, v0

    .line 8
    check-cast v3, Lcom/exotv/net/MovieDetailActivity;

    .line 9
    .line 10
    iget-object v10, v3, Lcom/exotv/net/MovieDetailActivity;->O:Ljava/util/ArrayList;

    .line 11
    .line 12
    iget v11, v3, Lcom/exotv/net/MovieDetailActivity;->W:I

    .line 13
    .line 14
    iget v12, v3, Lcom/exotv/net/MovieDetailActivity;->X:I

    .line 15
    .line 16
    sget-object v13, Lq6/a;->j:Lq6/a;

    .line 17
    .line 18
    iget v0, v1, Lc5/q0;->o:I

    .line 19
    .line 20
    sget-object v14, Ll6/j;->a:Ll6/j;

    .line 21
    .line 22
    const-string v5, "MovieDetailActivity"

    .line 23
    .line 24
    const/4 v15, 0x3

    .line 25
    const-string v6, "getString(...)"

    .line 26
    .line 27
    const-string v16, "body"

    .line 28
    .line 29
    const/4 v9, 0x2

    .line 30
    move-object/from16 v17, v6

    .line 31
    .line 32
    const/4 v6, 0x1

    .line 33
    const/4 v4, 0x0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    if-eq v0, v6, :cond_2

    .line 37
    .line 38
    if-eq v0, v9, :cond_1

    .line 39
    .line 40
    if-ne v0, v15, :cond_0

    .line 41
    .line 42
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object v14

    .line 46
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :cond_1
    iget-object v0, v1, Lc5/q0;->p:Ljava/lang/Object;

    .line 55
    .line 56
    move-object/from16 v19, v0

    .line 57
    .line 58
    check-cast v19, Lx4/n;

    .line 59
    .line 60
    :try_start_0
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    move-object/from16 v0, p1

    .line 64
    .line 65
    move-object/from16 v15, v19

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :catch_0
    move-exception v0

    .line 69
    move-object/from16 v15, v19

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_2
    :try_start_1
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 73
    .line 74
    .line 75
    move-object/from16 v0, p1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catch_1
    move-exception v0

    .line 79
    move-object v7, v1

    .line 80
    move-object v9, v4

    .line 81
    move v2, v11

    .line 82
    move v6, v12

    .line 83
    move-object/from16 v29, v14

    .line 84
    .line 85
    move-object/from16 v4, v17

    .line 86
    .line 87
    goto/16 :goto_26

    .line 88
    .line 89
    :cond_3
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :try_start_2
    sget-object v0, Li7/e0;->a:Lo7/e;

    .line 93
    .line 94
    sget-object v0, Lo7/d;->l:Lo7/d;

    .line 95
    .line 96
    new-instance v15, Lc5/q0;

    .line 97
    .line 98
    invoke-direct {v15, v3, v4, v9}, Lc5/q0;-><init>(Lh/i;Lp6/c;I)V

    .line 99
    .line 100
    .line 101
    iput v6, v1, Lc5/q0;->o:I

    .line 102
    .line 103
    invoke-static {v0, v15, v1}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    if-ne v0, v13, :cond_4

    .line 108
    .line 109
    :goto_0
    move-object v7, v1

    .line 110
    move-object v1, v13

    .line 111
    goto/16 :goto_25

    .line 112
    .line 113
    :cond_4
    :goto_1
    move-object v15, v0

    .line 114
    check-cast v15, Lx4/n;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 115
    .line 116
    :try_start_3
    sget-object v0, Lz4/g0;->a:Lz4/g0;

    .line 117
    .line 118
    iget-wide v6, v3, Lcom/exotv/net/MovieDetailActivity;->I:J

    .line 119
    .line 120
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    iput-object v15, v1, Lc5/q0;->p:Ljava/lang/Object;

    .line 125
    .line 126
    iput v9, v1, Lc5/q0;->o:I

    .line 127
    .line 128
    invoke-virtual {v0, v6, v1}, Lz4/g0;->g(Ljava/lang/String;Lr6/c;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    if-ne v0, v13, :cond_5

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_5
    :goto_2
    check-cast v0, Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :catch_2
    move-exception v0

    .line 139
    :goto_3
    const-string v6, "quality lookup failed"

    .line 140
    .line 141
    invoke-static {v5, v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 142
    .line 143
    .line 144
    move-object v0, v4

    .line 145
    :goto_4
    iget-object v5, v3, Lcom/exotv/net/MovieDetailActivity;->J:Landroid/widget/LinearLayout;

    .line 146
    .line 147
    if-eqz v5, :cond_48

    .line 148
    .line 149
    invoke-virtual {v5}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 150
    .line 151
    .line 152
    new-instance v5, Landroid/widget/FrameLayout;

    .line 153
    .line 154
    invoke-direct {v5, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 155
    .line 156
    .line 157
    iput-object v5, v3, Lcom/exotv/net/MovieDetailActivity;->L:Landroid/widget/FrameLayout;

    .line 158
    .line 159
    new-instance v5, Landroid/widget/ImageView;

    .line 160
    .line 161
    invoke-direct {v5, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 162
    .line 163
    .line 164
    sget-object v6, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 165
    .line 166
    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 178
    .line 179
    int-to-float v6, v6

    .line 180
    invoke-virtual {v3}, Lcom/exotv/net/MovieDetailActivity;->t()Z

    .line 181
    .line 182
    .line 183
    move-result v7

    .line 184
    if-eqz v7, :cond_6

    .line 185
    .line 186
    const v7, 0x3f051eb8    # 0.52f

    .line 187
    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_6
    const v7, 0x3ed70a3d    # 0.42f

    .line 191
    .line 192
    .line 193
    :goto_5
    mul-float/2addr v6, v7

    .line 194
    float-to-int v6, v6

    .line 195
    int-to-float v7, v6

    .line 196
    const v22, 0x3f0ccccd    # 0.55f

    .line 197
    .line 198
    .line 199
    mul-float v7, v7, v22

    .line 200
    .line 201
    float-to-int v7, v7

    .line 202
    move-object/from16 v22, v4

    .line 203
    .line 204
    iget-object v4, v15, Lx4/n;->j:Ljava/lang/String;

    .line 205
    .line 206
    iget-object v9, v15, Lx4/n;->h:Ljava/lang/Object;

    .line 207
    .line 208
    move/from16 p1, v6

    .line 209
    .line 210
    iget-object v6, v15, Lx4/n;->c:Ljava/lang/String;

    .line 211
    .line 212
    iget v8, v15, Lx4/n;->f:I

    .line 213
    .line 214
    move-object/from16 v24, v2

    .line 215
    .line 216
    const-string v2, "original"

    .line 217
    .line 218
    invoke-static {v4, v2}, Lt5/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    if-nez v2, :cond_7

    .line 223
    .line 224
    const-string v2, "w1280"

    .line 225
    .line 226
    invoke-static {v4, v2}, Lt5/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    if-nez v2, :cond_7

    .line 231
    .line 232
    const-string v2, "w780"

    .line 233
    .line 234
    invoke-static {v4, v2}, Lt5/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    :cond_7
    if-nez v2, :cond_8

    .line 239
    .line 240
    iget-object v2, v15, Lx4/n;->i:Ljava/lang/String;

    .line 241
    .line 242
    const-string v4, "w500"

    .line 243
    .line 244
    invoke-static {v2, v4}, Lt5/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    :cond_8
    if-eqz v2, :cond_9

    .line 249
    .line 250
    const/16 v25, 0x1

    .line 251
    .line 252
    goto :goto_6

    .line 253
    :cond_9
    const/16 v25, 0x0

    .line 254
    .line 255
    :goto_6
    if-eqz v25, :cond_a

    .line 256
    .line 257
    iget v4, v3, Lcom/exotv/net/MovieDetailActivity;->U:I

    .line 258
    .line 259
    add-int v4, p1, v4

    .line 260
    .line 261
    goto :goto_7

    .line 262
    :cond_a
    move/from16 v4, p1

    .line 263
    .line 264
    :goto_7
    move-object/from16 p1, v6

    .line 265
    .line 266
    if-eqz v2, :cond_b

    .line 267
    .line 268
    invoke-static {v3}, Lcom/bumptech/glide/b;->b(Landroid/content/Context;)Ln4/l;

    .line 269
    .line 270
    .line 271
    move-result-object v6

    .line 272
    invoke-virtual {v6, v3}, Ln4/l;->d(Lh/i;)Lcom/bumptech/glide/m;

    .line 273
    .line 274
    .line 275
    move-result-object v6

    .line 276
    invoke-virtual {v6, v2}, Lcom/bumptech/glide/m;->m(Ljava/lang/String;)Lcom/bumptech/glide/j;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    invoke-virtual {v2, v5}, Lcom/bumptech/glide/j;->u(Landroid/widget/ImageView;)V

    .line 281
    .line 282
    .line 283
    :cond_b
    iget-object v2, v3, Lcom/exotv/net/MovieDetailActivity;->L:Landroid/widget/FrameLayout;

    .line 284
    .line 285
    const-string v6, "hero"

    .line 286
    .line 287
    if-eqz v2, :cond_47

    .line 288
    .line 289
    move-object/from16 v27, v6

    .line 290
    .line 291
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 292
    .line 293
    invoke-direct {v6, v11, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2, v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 297
    .line 298
    .line 299
    iget-object v2, v3, Lcom/exotv/net/MovieDetailActivity;->L:Landroid/widget/FrameLayout;

    .line 300
    .line 301
    if-eqz v2, :cond_46

    .line 302
    .line 303
    new-instance v5, Landroid/view/View;

    .line 304
    .line 305
    invoke-direct {v5, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 306
    .line 307
    .line 308
    invoke-static {}, Lc5/j;->c()Landroid/graphics/drawable/GradientDrawable;

    .line 309
    .line 310
    .line 311
    move-result-object v6

    .line 312
    invoke-virtual {v5, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 313
    .line 314
    .line 315
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 316
    .line 317
    invoke-direct {v6, v11, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 318
    .line 319
    .line 320
    const/16 v7, 0x50

    .line 321
    .line 322
    iput v7, v6, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 323
    .line 324
    invoke-virtual {v2, v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 325
    .line 326
    .line 327
    new-instance v2, Landroid/widget/TextView;

    .line 328
    .line 329
    invoke-direct {v2, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 330
    .line 331
    .line 332
    iget-object v5, v15, Lx4/n;->b:Ljava/lang/String;

    .line 333
    .line 334
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 335
    .line 336
    .line 337
    const/4 v5, -0x1

    .line 338
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 339
    .line 340
    .line 341
    const/high16 v6, 0x41d00000    # 26.0f

    .line 342
    .line 343
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 344
    .line 345
    .line 346
    sget-object v6, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 347
    .line 348
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 349
    .line 350
    .line 351
    const v5, 0x3da3d70a    # 0.08f

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setLetterSpacing(F)V

    .line 355
    .line 356
    .line 357
    const/16 v5, 0x11

    .line 358
    .line 359
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 360
    .line 361
    .line 362
    const/4 v5, 0x4

    .line 363
    invoke-virtual {v3, v5}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 364
    .line 365
    .line 366
    move-result v5

    .line 367
    int-to-float v5, v5

    .line 368
    move-object/from16 v28, v9

    .line 369
    .line 370
    const/4 v7, 0x1

    .line 371
    invoke-virtual {v3, v7}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 372
    .line 373
    .line 374
    move-result v9

    .line 375
    int-to-float v7, v9

    .line 376
    const/high16 v9, -0x1000000

    .line 377
    .line 378
    move-object/from16 v29, v14

    .line 379
    .line 380
    const/4 v14, 0x0

    .line 381
    invoke-virtual {v2, v5, v14, v7, v9}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    .line 382
    .line 383
    .line 384
    const/16 v14, 0xc

    .line 385
    .line 386
    if-eqz v25, :cond_d

    .line 387
    .line 388
    iget-object v5, v3, Lcom/exotv/net/MovieDetailActivity;->L:Landroid/widget/FrameLayout;

    .line 389
    .line 390
    if-eqz v5, :cond_c

    .line 391
    .line 392
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    .line 393
    .line 394
    invoke-direct {v7, v11, v12}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 395
    .line 396
    .line 397
    const/16 v9, 0x51

    .line 398
    .line 399
    iput v9, v7, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 400
    .line 401
    invoke-virtual {v3, v14}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 402
    .line 403
    .line 404
    move-result v9

    .line 405
    iput v9, v7, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 406
    .line 407
    const/16 v9, 0x10

    .line 408
    .line 409
    invoke-virtual {v3, v9}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 410
    .line 411
    .line 412
    move-result v14

    .line 413
    iput v14, v7, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 414
    .line 415
    invoke-virtual {v3, v9}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 416
    .line 417
    .line 418
    move-result v14

    .line 419
    iput v14, v7, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 420
    .line 421
    invoke-virtual {v5, v2, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 422
    .line 423
    .line 424
    goto :goto_8

    .line 425
    :cond_c
    invoke-static/range {v27 .. v27}, Lz6/h;->h(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    throw v22

    .line 429
    :cond_d
    :goto_8
    iget-object v5, v3, Lcom/exotv/net/MovieDetailActivity;->J:Landroid/widget/LinearLayout;

    .line 430
    .line 431
    if-eqz v5, :cond_45

    .line 432
    .line 433
    iget-object v7, v3, Lcom/exotv/net/MovieDetailActivity;->L:Landroid/widget/FrameLayout;

    .line 434
    .line 435
    if-eqz v7, :cond_44

    .line 436
    .line 437
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 438
    .line 439
    invoke-direct {v9, v11, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v5, v7, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 443
    .line 444
    .line 445
    new-instance v4, Landroid/widget/LinearLayout;

    .line 446
    .line 447
    invoke-direct {v4, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 448
    .line 449
    .line 450
    const/4 v7, 0x1

    .line 451
    invoke-virtual {v4, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 452
    .line 453
    .line 454
    const/4 v5, 0x2

    .line 455
    if-eqz v25, :cond_e

    .line 456
    .line 457
    invoke-virtual {v3, v5}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 458
    .line 459
    .line 460
    move-result v7

    .line 461
    const/16 v9, 0x10

    .line 462
    .line 463
    :goto_9
    const/4 v14, 0x0

    .line 464
    goto :goto_a

    .line 465
    :cond_e
    const/16 v9, 0x10

    .line 466
    .line 467
    invoke-virtual {v3, v9}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 468
    .line 469
    .line 470
    move-result v7

    .line 471
    iget v14, v3, Lcom/exotv/net/MovieDetailActivity;->U:I

    .line 472
    .line 473
    add-int/2addr v7, v14

    .line 474
    goto :goto_9

    .line 475
    :goto_a
    invoke-virtual {v4, v14, v7, v14, v14}, Landroid/view/View;->setPadding(IIII)V

    .line 476
    .line 477
    .line 478
    if-nez v25, :cond_f

    .line 479
    .line 480
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 481
    .line 482
    .line 483
    :cond_f
    new-instance v2, Ljava/lang/StringBuilder;

    .line 484
    .line 485
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 486
    .line 487
    .line 488
    iget-object v7, v15, Lx4/n;->g:Ljava/lang/String;

    .line 489
    .line 490
    invoke-static {v7}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 491
    .line 492
    .line 493
    move-result v14

    .line 494
    if-nez v14, :cond_10

    .line 495
    .line 496
    goto :goto_b

    .line 497
    :cond_10
    move-object/from16 v7, v22

    .line 498
    .line 499
    :goto_b
    if-eqz v7, :cond_11

    .line 500
    .line 501
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    :cond_11
    iget-object v7, v15, Lx4/n;->d:Ljava/lang/String;

    .line 505
    .line 506
    invoke-static {v7}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 507
    .line 508
    .line 509
    move-result v14

    .line 510
    if-nez v14, :cond_12

    .line 511
    .line 512
    goto :goto_c

    .line 513
    :cond_12
    move-object/from16 v7, v22

    .line 514
    .line 515
    :goto_c
    const-string v14, " \u2022 "

    .line 516
    .line 517
    if-eqz v7, :cond_14

    .line 518
    .line 519
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 520
    .line 521
    .line 522
    move-result v23

    .line 523
    if-lez v23, :cond_13

    .line 524
    .line 525
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    :cond_13
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    :cond_14
    if-lez v8, :cond_16

    .line 532
    .line 533
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 534
    .line 535
    .line 536
    move-result v7

    .line 537
    if-lez v7, :cond_15

    .line 538
    .line 539
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 540
    .line 541
    .line 542
    :cond_15
    new-instance v7, Ljava/lang/StringBuilder;

    .line 543
    .line 544
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 548
    .line 549
    .line 550
    const-string v8, " min"

    .line 551
    .line 552
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v7

    .line 559
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 560
    .line 561
    .line 562
    :cond_16
    new-instance v7, Landroid/widget/TextView;

    .line 563
    .line 564
    invoke-direct {v7, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 565
    .line 566
    .line 567
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v8

    .line 571
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 572
    .line 573
    .line 574
    sget v8, Lc5/z;->c:I

    .line 575
    .line 576
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 577
    .line 578
    .line 579
    const/high16 v14, 0x41600000    # 14.0f

    .line 580
    .line 581
    invoke-virtual {v7, v14}, Landroid/widget/TextView;->setTextSize(F)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 585
    .line 586
    .line 587
    const/16 v14, 0x11

    .line 588
    .line 589
    invoke-virtual {v7, v14}, Landroid/widget/TextView;->setGravity(I)V

    .line 590
    .line 591
    .line 592
    const/4 v14, 0x6

    .line 593
    invoke-virtual {v3, v14}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 594
    .line 595
    .line 596
    move-result v5

    .line 597
    const/4 v9, 0x0

    .line 598
    invoke-virtual {v7, v9, v5, v9, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 602
    .line 603
    .line 604
    move-result v2

    .line 605
    const/16 v5, 0x8

    .line 606
    .line 607
    if-nez v2, :cond_17

    .line 608
    .line 609
    invoke-virtual {v7, v5}, Landroid/view/View;->setVisibility(I)V

    .line 610
    .line 611
    .line 612
    :cond_17
    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 613
    .line 614
    .line 615
    invoke-interface/range {v28 .. v28}, Ljava/util/Collection;->isEmpty()Z

    .line 616
    .line 617
    .line 618
    move-result v2

    .line 619
    const/16 v7, 0xa

    .line 620
    .line 621
    if-nez v2, :cond_18

    .line 622
    .line 623
    new-instance v2, Landroid/widget/TextView;

    .line 624
    .line 625
    invoke-direct {v2, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 626
    .line 627
    .line 628
    const/16 v35, 0x3e

    .line 629
    .line 630
    move-object/from16 v30, v28

    .line 631
    .line 632
    check-cast v30, Ljava/util/Collection;

    .line 633
    .line 634
    const-string v31, " \u2022 "

    .line 635
    .line 636
    const/16 v32, 0x0

    .line 637
    .line 638
    const/16 v33, 0x0

    .line 639
    .line 640
    const/16 v34, 0x0

    .line 641
    .line 642
    invoke-static/range {v30 .. v35}, Lm6/h;->E0(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly6/l;I)Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v9

    .line 646
    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 647
    .line 648
    .line 649
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 650
    .line 651
    .line 652
    const/high16 v8, 0x41600000    # 14.0f

    .line 653
    .line 654
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 658
    .line 659
    .line 660
    const/16 v8, 0x11

    .line 661
    .line 662
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 663
    .line 664
    .line 665
    invoke-virtual {v3, v7}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 666
    .line 667
    .line 668
    move-result v8

    .line 669
    const/4 v9, 0x0

    .line 670
    invoke-virtual {v2, v9, v8, v9, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 671
    .line 672
    .line 673
    const v8, 0x3ca3d70a    # 0.02f

    .line 674
    .line 675
    .line 676
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setLetterSpacing(F)V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 680
    .line 681
    .line 682
    :cond_18
    iget-object v2, v15, Lx4/n;->k:Ljava/lang/Double;

    .line 683
    .line 684
    sget v8, Lc5/z;->f:I

    .line 685
    .line 686
    invoke-static {v3, v2, v8, v0}, Lc5/j;->j(Landroid/content/Context;Ljava/lang/Double;ILjava/lang/String;)Landroid/widget/LinearLayout;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    if-eqz v0, :cond_19

    .line 691
    .line 692
    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 693
    .line 694
    .line 695
    :cond_19
    iget-object v0, v3, Lcom/exotv/net/MovieDetailActivity;->J:Landroid/widget/LinearLayout;

    .line 696
    .line 697
    if-eqz v0, :cond_43

    .line 698
    .line 699
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 700
    .line 701
    .line 702
    new-instance v0, Lw4/y;

    .line 703
    .line 704
    const/4 v9, 0x0

    .line 705
    invoke-direct {v0, v3, v15, v9}, Lw4/y;-><init>(Lh/i;Ljava/lang/Object;I)V

    .line 706
    .line 707
    .line 708
    new-instance v4, Landroid/widget/LinearLayout;

    .line 709
    .line 710
    invoke-direct {v4, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v3}, Lcom/exotv/net/MovieDetailActivity;->t()Z

    .line 714
    .line 715
    .line 716
    move-result v2

    .line 717
    if-eqz v2, :cond_1a

    .line 718
    .line 719
    const/high16 v2, 0x41a00000    # 20.0f

    .line 720
    .line 721
    goto :goto_d

    .line 722
    :cond_1a
    const/high16 v2, 0x41880000    # 17.0f

    .line 723
    .line 724
    :goto_d
    invoke-virtual {v3}, Lcom/exotv/net/MovieDetailActivity;->t()Z

    .line 725
    .line 726
    .line 727
    move-result v9

    .line 728
    if-eqz v9, :cond_1b

    .line 729
    .line 730
    const/high16 v9, 0x41980000    # 19.0f

    .line 731
    .line 732
    :goto_e
    const/4 v5, 0x0

    .line 733
    goto :goto_f

    .line 734
    :cond_1b
    const/high16 v9, 0x41800000    # 16.0f

    .line 735
    .line 736
    goto :goto_e

    .line 737
    :goto_f
    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 738
    .line 739
    .line 740
    const/16 v5, 0x11

    .line 741
    .line 742
    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 743
    .line 744
    .line 745
    invoke-virtual {v3}, Lcom/exotv/net/MovieDetailActivity;->t()Z

    .line 746
    .line 747
    .line 748
    move-result v20

    .line 749
    const/16 v27, 0x1c

    .line 750
    .line 751
    if-eqz v20, :cond_1c

    .line 752
    .line 753
    move/from16 v7, v27

    .line 754
    .line 755
    goto :goto_10

    .line 756
    :cond_1c
    const/16 v7, 0x18

    .line 757
    .line 758
    :goto_10
    invoke-virtual {v3, v7}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 759
    .line 760
    .line 761
    move-result v7

    .line 762
    invoke-virtual {v3}, Lcom/exotv/net/MovieDetailActivity;->t()Z

    .line 763
    .line 764
    .line 765
    move-result v28

    .line 766
    if-eqz v28, :cond_1d

    .line 767
    .line 768
    move/from16 v14, v27

    .line 769
    .line 770
    goto :goto_11

    .line 771
    :cond_1d
    const/16 v14, 0x18

    .line 772
    .line 773
    :goto_11
    invoke-virtual {v3, v14}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 774
    .line 775
    .line 776
    move-result v14

    .line 777
    const/4 v5, 0x0

    .line 778
    invoke-virtual {v4, v7, v5, v14, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 779
    .line 780
    .line 781
    invoke-virtual {v3}, Lcom/exotv/net/MovieDetailActivity;->t()Z

    .line 782
    .line 783
    .line 784
    move-result v5

    .line 785
    if-eqz v5, :cond_1e

    .line 786
    .line 787
    const/16 v5, 0xc8

    .line 788
    .line 789
    goto :goto_12

    .line 790
    :cond_1e
    const/16 v5, 0xb0

    .line 791
    .line 792
    :goto_12
    invoke-virtual {v3, v5}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 793
    .line 794
    .line 795
    move-result v5

    .line 796
    invoke-virtual {v4, v5}, Landroid/view/View;->setMinimumWidth(I)V

    .line 797
    .line 798
    .line 799
    invoke-virtual {v3}, Lcom/exotv/net/MovieDetailActivity;->t()Z

    .line 800
    .line 801
    .line 802
    move-result v5

    .line 803
    if-eqz v5, :cond_1f

    .line 804
    .line 805
    const/16 v5, 0x3a

    .line 806
    .line 807
    goto :goto_13

    .line 808
    :cond_1f
    const/16 v5, 0x34

    .line 809
    .line 810
    :goto_13
    invoke-virtual {v3, v5}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 811
    .line 812
    .line 813
    move-result v5

    .line 814
    invoke-virtual {v4, v5}, Landroid/view/View;->setMinimumHeight(I)V

    .line 815
    .line 816
    .line 817
    new-instance v5, Landroid/graphics/drawable/StateListDrawable;

    .line 818
    .line 819
    invoke-direct {v5}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 820
    .line 821
    .line 822
    const v7, 0x101009c

    .line 823
    .line 824
    .line 825
    filled-new-array {v7}, [I

    .line 826
    .line 827
    .line 828
    move-result-object v7

    .line 829
    move/from16 v26, v2

    .line 830
    .line 831
    const/4 v2, 0x0

    .line 832
    const/16 v14, 0x18

    .line 833
    .line 834
    invoke-static {v8, v14, v2, v2}, Lc5/j;->i(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 835
    .line 836
    .line 837
    move-result-object v8

    .line 838
    invoke-virtual {v5, v7, v8}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 839
    .line 840
    .line 841
    new-array v7, v2, [I

    .line 842
    .line 843
    const-string v8, "#8B0000"

    .line 844
    .line 845
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 846
    .line 847
    .line 848
    move-result v8

    .line 849
    invoke-static {v8, v14, v2, v2}, Lc5/j;->i(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 850
    .line 851
    .line 852
    move-result-object v8

    .line 853
    invoke-virtual {v5, v7, v8}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v4, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 857
    .line 858
    .line 859
    const v5, 0x7f11001d

    .line 860
    .line 861
    .line 862
    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 863
    .line 864
    .line 865
    move-result-object v7

    .line 866
    invoke-virtual {v4, v7}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 867
    .line 868
    .line 869
    const/4 v7, 0x1

    .line 870
    invoke-virtual {v4, v7}, Landroid/view/View;->setClickable(Z)V

    .line 871
    .line 872
    .line 873
    invoke-virtual {v4, v7}, Landroid/view/View;->setFocusable(Z)V

    .line 874
    .line 875
    .line 876
    new-instance v8, Lc5/p;

    .line 877
    .line 878
    const/4 v2, 0x6

    .line 879
    invoke-direct {v8, v3, v2, v0}, Lc5/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 880
    .line 881
    .line 882
    invoke-virtual {v4, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 883
    .line 884
    .line 885
    const/4 v8, 0x0

    .line 886
    move v0, v9

    .line 887
    const/16 v9, 0x1f4

    .line 888
    .line 889
    move v2, v5

    .line 890
    const/16 v5, 0x18

    .line 891
    .line 892
    move-object/from16 v28, v6

    .line 893
    .line 894
    const/4 v6, 0x0

    .line 895
    move/from16 v30, v7

    .line 896
    .line 897
    const/4 v7, 0x0

    .line 898
    move v14, v0

    .line 899
    move-object/from16 v37, v17

    .line 900
    .line 901
    move-object/from16 v2, v24

    .line 902
    .line 903
    move/from16 v36, v26

    .line 904
    .line 905
    move-object/from16 v0, v28

    .line 906
    .line 907
    move-object/from16 v17, v13

    .line 908
    .line 909
    const/4 v13, -0x1

    .line 910
    invoke-static/range {v2 .. v9}, Lc5/j;->f(Lc5/j;Landroid/content/Context;Landroid/view/View;ILw4/x0;Ly6/a;Landroid/view/View;I)V

    .line 911
    .line 912
    .line 913
    invoke-virtual {v3}, Lcom/exotv/net/MovieDetailActivity;->t()Z

    .line 914
    .line 915
    .line 916
    move-result v5

    .line 917
    if-eqz v5, :cond_20

    .line 918
    .line 919
    const/16 v5, 0x18

    .line 920
    .line 921
    goto :goto_14

    .line 922
    :cond_20
    const/16 v5, 0x14

    .line 923
    .line 924
    :goto_14
    invoke-virtual {v3, v5}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 925
    .line 926
    .line 927
    move-result v5

    .line 928
    new-instance v6, Landroid/widget/TextView;

    .line 929
    .line 930
    invoke-direct {v6, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 931
    .line 932
    .line 933
    const-string v7, "\u25b6"

    .line 934
    .line 935
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 936
    .line 937
    .line 938
    invoke-virtual {v6, v14}, Landroid/widget/TextView;->setTextSize(F)V

    .line 939
    .line 940
    .line 941
    invoke-virtual {v6, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 942
    .line 943
    .line 944
    const/16 v14, 0x11

    .line 945
    .line 946
    invoke-virtual {v6, v14}, Landroid/widget/TextView;->setGravity(I)V

    .line 947
    .line 948
    .line 949
    const/4 v9, 0x0

    .line 950
    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 951
    .line 952
    .line 953
    iput-object v6, v3, Lcom/exotv/net/MovieDetailActivity;->P:Landroid/widget/TextView;

    .line 954
    .line 955
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 956
    .line 957
    invoke-direct {v7, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 958
    .line 959
    .line 960
    const/16 v8, 0x10

    .line 961
    .line 962
    iput v8, v7, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 963
    .line 964
    invoke-virtual {v3}, Lcom/exotv/net/MovieDetailActivity;->t()Z

    .line 965
    .line 966
    .line 967
    move-result v9

    .line 968
    if-eqz v9, :cond_21

    .line 969
    .line 970
    const/16 v9, 0xc

    .line 971
    .line 972
    goto :goto_15

    .line 973
    :cond_21
    const/16 v9, 0xa

    .line 974
    .line 975
    :goto_15
    invoke-virtual {v3, v9}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 976
    .line 977
    .line 978
    move-result v9

    .line 979
    invoke-virtual {v7, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 980
    .line 981
    .line 982
    invoke-virtual {v4, v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 983
    .line 984
    .line 985
    new-instance v6, Landroid/widget/ProgressBar;

    .line 986
    .line 987
    const v7, 0x1010077

    .line 988
    .line 989
    .line 990
    const/4 v9, 0x0

    .line 991
    invoke-direct {v6, v3, v9, v7}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 992
    .line 993
    .line 994
    invoke-static {v13}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 995
    .line 996
    .line 997
    move-result-object v7

    .line 998
    invoke-virtual {v6, v7}, Landroid/widget/ProgressBar;->setIndeterminateTintList(Landroid/content/res/ColorStateList;)V

    .line 999
    .line 1000
    .line 1001
    const/16 v7, 0x8

    .line 1002
    .line 1003
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 1004
    .line 1005
    .line 1006
    iput-object v6, v3, Lcom/exotv/net/MovieDetailActivity;->Q:Landroid/widget/ProgressBar;

    .line 1007
    .line 1008
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 1009
    .line 1010
    invoke-direct {v7, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1011
    .line 1012
    .line 1013
    iput v8, v7, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 1014
    .line 1015
    invoke-virtual {v3}, Lcom/exotv/net/MovieDetailActivity;->t()Z

    .line 1016
    .line 1017
    .line 1018
    move-result v5

    .line 1019
    if-eqz v5, :cond_22

    .line 1020
    .line 1021
    const/16 v5, 0xc

    .line 1022
    .line 1023
    goto :goto_16

    .line 1024
    :cond_22
    const/16 v5, 0xa

    .line 1025
    .line 1026
    :goto_16
    invoke-virtual {v3, v5}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 1027
    .line 1028
    .line 1029
    move-result v5

    .line 1030
    invoke-virtual {v7, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v4, v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1034
    .line 1035
    .line 1036
    new-instance v5, Landroid/widget/TextView;

    .line 1037
    .line 1038
    invoke-direct {v5, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1039
    .line 1040
    .line 1041
    const v6, 0x7f11001d

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v3, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v6

    .line 1048
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1052
    .line 1053
    .line 1054
    move/from16 v6, v36

    .line 1055
    .line 1056
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1060
    .line 1061
    .line 1062
    const/4 v0, 0x0

    .line 1063
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 1064
    .line 1065
    .line 1066
    iput-object v5, v3, Lcom/exotv/net/MovieDetailActivity;->R:Landroid/widget/TextView;

    .line 1067
    .line 1068
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 1069
    .line 1070
    invoke-direct {v0, v12, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1071
    .line 1072
    .line 1073
    iput v8, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 1074
    .line 1075
    invoke-virtual {v4, v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1076
    .line 1077
    .line 1078
    iput-object v4, v3, Lcom/exotv/net/MovieDetailActivity;->N:Landroid/widget/LinearLayout;

    .line 1079
    .line 1080
    new-instance v0, Lc5/l;

    .line 1081
    .line 1082
    const/4 v5, 0x2

    .line 1083
    invoke-direct {v0, v5, v3}, Lc5/l;-><init>(ILjava/lang/Object;)V

    .line 1084
    .line 1085
    .line 1086
    invoke-virtual {v4, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 1087
    .line 1088
    .line 1089
    iget-object v0, v3, Lcom/exotv/net/MovieDetailActivity;->J:Landroid/widget/LinearLayout;

    .line 1090
    .line 1091
    if-eqz v0, :cond_42

    .line 1092
    .line 1093
    iget-object v4, v3, Lcom/exotv/net/MovieDetailActivity;->N:Landroid/widget/LinearLayout;

    .line 1094
    .line 1095
    const-string v18, "playAction"

    .line 1096
    .line 1097
    if-eqz v4, :cond_41

    .line 1098
    .line 1099
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 1100
    .line 1101
    invoke-direct {v6, v12, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1102
    .line 1103
    .line 1104
    const/4 v7, 0x1

    .line 1105
    iput v7, v6, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 1106
    .line 1107
    const/16 v8, 0x12

    .line 1108
    .line 1109
    invoke-virtual {v3, v8}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 1110
    .line 1111
    .line 1112
    move-result v8

    .line 1113
    iput v8, v6, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1114
    .line 1115
    invoke-virtual {v3, v5}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 1116
    .line 1117
    .line 1118
    move-result v5

    .line 1119
    iput v5, v6, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1120
    .line 1121
    invoke-virtual {v0, v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v3}, Lcom/exotv/net/MovieDetailActivity;->t()Z

    .line 1125
    .line 1126
    .line 1127
    move-result v0

    .line 1128
    if-eqz v0, :cond_24

    .line 1129
    .line 1130
    iget-object v0, v3, Lcom/exotv/net/MovieDetailActivity;->N:Landroid/widget/LinearLayout;

    .line 1131
    .line 1132
    if-eqz v0, :cond_23

    .line 1133
    .line 1134
    new-instance v4, Lw4/z;

    .line 1135
    .line 1136
    invoke-direct {v4, v3, v7}, Lw4/z;-><init>(Lcom/exotv/net/MovieDetailActivity;I)V

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {v0, v4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1140
    .line 1141
    .line 1142
    goto :goto_17

    .line 1143
    :cond_23
    invoke-static/range {v18 .. v18}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1144
    .line 1145
    .line 1146
    throw v9

    .line 1147
    :cond_24
    :goto_17
    iget-object v0, v15, Lx4/n;->e:Ljava/lang/String;

    .line 1148
    .line 1149
    iget-boolean v4, v3, Lcom/exotv/net/MovieDetailActivity;->T:Z

    .line 1150
    .line 1151
    if-eqz v4, :cond_26

    .line 1152
    .line 1153
    :cond_25
    move-object/from16 v4, v37

    .line 1154
    .line 1155
    goto/16 :goto_1c

    .line 1156
    .line 1157
    :cond_26
    invoke-static {v0}, Lz4/g0;->e(Ljava/lang/String;)Z

    .line 1158
    .line 1159
    .line 1160
    move-result v0

    .line 1161
    if-eqz v0, :cond_25

    .line 1162
    .line 1163
    iput-boolean v7, v3, Lcom/exotv/net/MovieDetailActivity;->T:Z

    .line 1164
    .line 1165
    const v0, 0x7f110107

    .line 1166
    .line 1167
    .line 1168
    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v0

    .line 1172
    move-object/from16 v4, v37

    .line 1173
    .line 1174
    invoke-static {v4, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1175
    .line 1176
    .line 1177
    iget-object v5, v3, Lcom/exotv/net/MovieDetailActivity;->N:Landroid/widget/LinearLayout;

    .line 1178
    .line 1179
    if-eqz v5, :cond_30

    .line 1180
    .line 1181
    const v6, 0x3ecccccd    # 0.4f

    .line 1182
    .line 1183
    .line 1184
    invoke-virtual {v5, v6}, Landroid/view/View;->setAlpha(F)V

    .line 1185
    .line 1186
    .line 1187
    iget-object v5, v3, Lcom/exotv/net/MovieDetailActivity;->R:Landroid/widget/TextView;

    .line 1188
    .line 1189
    if-eqz v5, :cond_27

    .line 1190
    .line 1191
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1192
    .line 1193
    .line 1194
    :cond_27
    iget-object v5, v3, Lcom/exotv/net/MovieDetailActivity;->N:Landroid/widget/LinearLayout;

    .line 1195
    .line 1196
    if-eqz v5, :cond_2f

    .line 1197
    .line 1198
    invoke-virtual {v5, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual {v3}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v0

    .line 1205
    if-eqz v0, :cond_2c

    .line 1206
    .line 1207
    iget-object v5, v3, Lcom/exotv/net/MovieDetailActivity;->N:Landroid/widget/LinearLayout;

    .line 1208
    .line 1209
    if-eqz v5, :cond_2b

    .line 1210
    .line 1211
    if-eq v0, v5, :cond_2c

    .line 1212
    .line 1213
    if-eqz v10, :cond_28

    .line 1214
    .line 1215
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1216
    .line 1217
    .line 1218
    move-result v5

    .line 1219
    if-eqz v5, :cond_28

    .line 1220
    .line 1221
    goto :goto_18

    .line 1222
    :cond_28
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 1223
    .line 1224
    .line 1225
    move-result v5

    .line 1226
    const/4 v6, 0x0

    .line 1227
    :cond_29
    if-ge v6, v5, :cond_2a

    .line 1228
    .line 1229
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v8

    .line 1233
    add-int/lit8 v6, v6, 0x1

    .line 1234
    .line 1235
    check-cast v8, Landroid/view/View;

    .line 1236
    .line 1237
    if-ne v8, v0, :cond_29

    .line 1238
    .line 1239
    goto :goto_1a

    .line 1240
    :cond_2a
    :goto_18
    const/4 v6, 0x0

    .line 1241
    :goto_19
    const/4 v5, 0x0

    .line 1242
    goto :goto_1b

    .line 1243
    :cond_2b
    invoke-static/range {v18 .. v18}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1244
    .line 1245
    .line 1246
    throw v9

    .line 1247
    :cond_2c
    :goto_1a
    move v6, v7

    .line 1248
    goto :goto_19

    .line 1249
    :goto_1b
    invoke-virtual {v3, v5}, Lcom/exotv/net/MovieDetailActivity;->v(Z)V

    .line 1250
    .line 1251
    .line 1252
    invoke-virtual {v3}, Lcom/exotv/net/MovieDetailActivity;->t()Z

    .line 1253
    .line 1254
    .line 1255
    move-result v0

    .line 1256
    if-eqz v0, :cond_31

    .line 1257
    .line 1258
    if-eqz v6, :cond_31

    .line 1259
    .line 1260
    iget-object v0, v3, Lcom/exotv/net/MovieDetailActivity;->M:Landroid/widget/TextView;

    .line 1261
    .line 1262
    const-string v6, "back"

    .line 1263
    .line 1264
    if-eqz v0, :cond_2e

    .line 1265
    .line 1266
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 1267
    .line 1268
    .line 1269
    iget-object v0, v3, Lcom/exotv/net/MovieDetailActivity;->M:Landroid/widget/TextView;

    .line 1270
    .line 1271
    if-eqz v0, :cond_2d

    .line 1272
    .line 1273
    new-instance v6, Lw4/z;

    .line 1274
    .line 1275
    invoke-direct {v6, v3, v5}, Lw4/z;-><init>(Lcom/exotv/net/MovieDetailActivity;I)V

    .line 1276
    .line 1277
    .line 1278
    invoke-virtual {v0, v6}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1279
    .line 1280
    .line 1281
    goto :goto_1c

    .line 1282
    :cond_2d
    invoke-static {v6}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1283
    .line 1284
    .line 1285
    throw v9

    .line 1286
    :cond_2e
    invoke-static {v6}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1287
    .line 1288
    .line 1289
    throw v9

    .line 1290
    :cond_2f
    invoke-static/range {v18 .. v18}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1291
    .line 1292
    .line 1293
    throw v9

    .line 1294
    :cond_30
    invoke-static/range {v18 .. v18}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1295
    .line 1296
    .line 1297
    throw v9

    .line 1298
    :cond_31
    :goto_1c
    invoke-static/range {p1 .. p1}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 1299
    .line 1300
    .line 1301
    move-result v0

    .line 1302
    if-nez v0, :cond_33

    .line 1303
    .line 1304
    iget-object v0, v3, Lcom/exotv/net/MovieDetailActivity;->J:Landroid/widget/LinearLayout;

    .line 1305
    .line 1306
    if-eqz v0, :cond_32

    .line 1307
    .line 1308
    move-object/from16 v5, p1

    .line 1309
    .line 1310
    invoke-virtual {v2, v3, v5}, Lc5/j;->h(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/FrameLayout;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v5

    .line 1314
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 1315
    .line 1316
    invoke-direct {v6, v11, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1317
    .line 1318
    .line 1319
    invoke-virtual {v0, v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1320
    .line 1321
    .line 1322
    goto :goto_1d

    .line 1323
    :cond_32
    invoke-static/range {v16 .. v16}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1324
    .line 1325
    .line 1326
    throw v9

    .line 1327
    :cond_33
    :goto_1d
    iget-object v0, v15, Lx4/n;->l:Ljava/lang/Object;

    .line 1328
    .line 1329
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1330
    .line 1331
    .line 1332
    move-result v5

    .line 1333
    if-eqz v5, :cond_34

    .line 1334
    .line 1335
    goto/16 :goto_24

    .line 1336
    .line 1337
    :cond_34
    iget-object v15, v3, Lcom/exotv/net/MovieDetailActivity;->J:Landroid/widget/LinearLayout;

    .line 1338
    .line 1339
    if-eqz v15, :cond_40

    .line 1340
    .line 1341
    new-instance v5, Landroid/widget/LinearLayout;

    .line 1342
    .line 1343
    invoke-direct {v5, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1344
    .line 1345
    .line 1346
    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1347
    .line 1348
    .line 1349
    const/16 v6, 0x18

    .line 1350
    .line 1351
    invoke-virtual {v3, v6}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 1352
    .line 1353
    .line 1354
    move-result v6

    .line 1355
    const/16 v8, 0x20

    .line 1356
    .line 1357
    invoke-virtual {v3, v8}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 1358
    .line 1359
    .line 1360
    move-result v8

    .line 1361
    const/4 v7, 0x0

    .line 1362
    invoke-virtual {v5, v7, v6, v7, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 1363
    .line 1364
    .line 1365
    const v6, 0x7f110119

    .line 1366
    .line 1367
    .line 1368
    invoke-virtual {v3, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v6

    .line 1372
    invoke-static {v4, v6}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1373
    .line 1374
    .line 1375
    const/16 v8, 0x10

    .line 1376
    .line 1377
    move-object/from16 v22, v9

    .line 1378
    .line 1379
    const/16 v9, 0xa0

    .line 1380
    .line 1381
    move-object v4, v5

    .line 1382
    const/high16 v5, 0x41900000    # 18.0f

    .line 1383
    .line 1384
    move-object v7, v4

    .line 1385
    move-object v4, v6

    .line 1386
    const/4 v6, -0x1

    .line 1387
    move-object/from16 v16, v7

    .line 1388
    .line 1389
    const/16 v7, 0x10

    .line 1390
    .line 1391
    move-object/from16 v14, v16

    .line 1392
    .line 1393
    const/16 v13, 0x10

    .line 1394
    .line 1395
    invoke-static/range {v3 .. v9}, Lc5/j;->k(Landroid/content/Context;Ljava/lang/String;FIIII)Landroid/widget/LinearLayout;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v4

    .line 1399
    invoke-virtual {v14, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1400
    .line 1401
    .line 1402
    new-instance v4, Landroid/widget/LinearLayout;

    .line 1403
    .line 1404
    invoke-direct {v4, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1405
    .line 1406
    .line 1407
    const/4 v9, 0x0

    .line 1408
    invoke-virtual {v4, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1409
    .line 1410
    .line 1411
    invoke-virtual {v3, v13}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 1412
    .line 1413
    .line 1414
    move-result v5

    .line 1415
    invoke-virtual {v3, v13}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 1416
    .line 1417
    .line 1418
    move-result v6

    .line 1419
    invoke-virtual {v4, v5, v9, v6, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 1420
    .line 1421
    .line 1422
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v5

    .line 1426
    const v6, 0x7f050002

    .line 1427
    .line 1428
    .line 1429
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 1430
    .line 1431
    .line 1432
    move-result v5

    .line 1433
    if-eqz v5, :cond_35

    .line 1434
    .line 1435
    sget v5, Lcom/exotv/net/MovieDetailActivity;->Y:I

    .line 1436
    .line 1437
    const/high16 v5, 0x40000

    .line 1438
    .line 1439
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 1440
    .line 1441
    .line 1442
    :cond_35
    const/16 v5, 0x50

    .line 1443
    .line 1444
    invoke-virtual {v3, v5}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 1445
    .line 1446
    .line 1447
    move-result v5

    .line 1448
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v16

    .line 1452
    const/4 v6, 0x0

    .line 1453
    :goto_1e
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 1454
    .line 1455
    .line 1456
    move-result v7

    .line 1457
    if-eqz v7, :cond_3e

    .line 1458
    .line 1459
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v7

    .line 1463
    add-int/lit8 v21, v6, 0x1

    .line 1464
    .line 1465
    if-ltz v6, :cond_3d

    .line 1466
    .line 1467
    check-cast v7, Lx4/a;

    .line 1468
    .line 1469
    new-instance v8, Landroid/widget/LinearLayout;

    .line 1470
    .line 1471
    invoke-direct {v8, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1472
    .line 1473
    .line 1474
    const/4 v9, 0x1

    .line 1475
    invoke-virtual {v8, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1476
    .line 1477
    .line 1478
    invoke-virtual {v8, v9}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1479
    .line 1480
    .line 1481
    invoke-virtual {v3, v13}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 1482
    .line 1483
    .line 1484
    move-result v9

    .line 1485
    const/4 v13, 0x0

    .line 1486
    invoke-virtual {v8, v13, v13, v9, v13}, Landroid/view/View;->setPadding(IIII)V

    .line 1487
    .line 1488
    .line 1489
    invoke-virtual {v8, v13}, Landroid/view/View;->setFocusable(Z)V

    .line 1490
    .line 1491
    .line 1492
    new-instance v9, Landroid/widget/FrameLayout;

    .line 1493
    .line 1494
    invoke-direct {v9, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 1495
    .line 1496
    .line 1497
    move-object/from16 v24, v2

    .line 1498
    .line 1499
    sget v2, Lc5/z;->d:I

    .line 1500
    .line 1501
    move-object/from16 p1, v4

    .line 1502
    .line 1503
    const/16 v4, 0x28

    .line 1504
    .line 1505
    move/from16 v22, v6

    .line 1506
    .line 1507
    const/4 v6, 0x1

    .line 1508
    invoke-static {v13, v4, v6, v2}, Lc5/j;->i(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v2

    .line 1512
    invoke-virtual {v9, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1513
    .line 1514
    .line 1515
    new-instance v2, Landroid/widget/ImageView;

    .line 1516
    .line 1517
    invoke-direct {v2, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 1518
    .line 1519
    .line 1520
    sget-object v6, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 1521
    .line 1522
    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 1523
    .line 1524
    .line 1525
    sget v6, Lc5/z;->j:I

    .line 1526
    .line 1527
    invoke-static {v6, v4, v13, v13}, Lc5/j;->i(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v4

    .line 1531
    invoke-virtual {v2, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1532
    .line 1533
    .line 1534
    const/4 v6, 0x1

    .line 1535
    invoke-virtual {v2, v6}, Landroid/view/View;->setClipToOutline(Z)V

    .line 1536
    .line 1537
    .line 1538
    iget-object v4, v7, Lx4/a;->d:Ljava/lang/String;

    .line 1539
    .line 1540
    if-eqz v4, :cond_38

    .line 1541
    .line 1542
    invoke-static {v4}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 1543
    .line 1544
    .line 1545
    move-result v13

    .line 1546
    if-nez v13, :cond_36

    .line 1547
    .line 1548
    const-string v13, "null"

    .line 1549
    .line 1550
    invoke-virtual {v4, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1551
    .line 1552
    .line 1553
    move-result v13

    .line 1554
    if-nez v13, :cond_36

    .line 1555
    .line 1556
    goto :goto_1f

    .line 1557
    :cond_36
    const/4 v4, 0x0

    .line 1558
    :goto_1f
    if-nez v4, :cond_37

    .line 1559
    .line 1560
    goto :goto_20

    .line 1561
    :cond_37
    const-string v13, "https://image.tmdb.org/t/p/w185"

    .line 1562
    .line 1563
    invoke-virtual {v13, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v4

    .line 1567
    goto :goto_21

    .line 1568
    :cond_38
    :goto_20
    const/4 v4, 0x0

    .line 1569
    :goto_21
    if-eqz v4, :cond_39

    .line 1570
    .line 1571
    invoke-static {v3}, Lcom/bumptech/glide/b;->b(Landroid/content/Context;)Ln4/l;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v13

    .line 1575
    invoke-virtual {v13, v3}, Ln4/l;->d(Lh/i;)Lcom/bumptech/glide/m;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v13

    .line 1579
    invoke-virtual {v13, v4}, Lcom/bumptech/glide/m;->m(Ljava/lang/String;)Lcom/bumptech/glide/j;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v4

    .line 1583
    invoke-virtual {v4, v2}, Lcom/bumptech/glide/j;->u(Landroid/widget/ImageView;)V

    .line 1584
    .line 1585
    .line 1586
    goto :goto_22

    .line 1587
    :cond_39
    const v4, 0x108003f

    .line 1588
    .line 1589
    .line 1590
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1591
    .line 1592
    .line 1593
    :goto_22
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 1594
    .line 1595
    invoke-direct {v4, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1596
    .line 1597
    .line 1598
    invoke-virtual {v9, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1599
    .line 1600
    .line 1601
    move-object v4, v8

    .line 1602
    const/4 v8, 0x0

    .line 1603
    move-object v13, v9

    .line 1604
    const/16 v9, 0x1e4

    .line 1605
    .line 1606
    move/from16 v23, v5

    .line 1607
    .line 1608
    const/16 v5, 0x28

    .line 1609
    .line 1610
    move/from16 v30, v6

    .line 1611
    .line 1612
    const/4 v6, 0x0

    .line 1613
    move-object/from16 v25, v7

    .line 1614
    .line 1615
    const/4 v7, 0x0

    .line 1616
    move-object v1, v4

    .line 1617
    move-object v4, v2

    .line 1618
    move-object/from16 v2, v24

    .line 1619
    .line 1620
    move/from16 v24, v11

    .line 1621
    .line 1622
    move-object v11, v1

    .line 1623
    move/from16 v1, v22

    .line 1624
    .line 1625
    move-object/from16 v22, v15

    .line 1626
    .line 1627
    move v15, v1

    .line 1628
    move/from16 v1, v23

    .line 1629
    .line 1630
    move-object/from16 v23, v14

    .line 1631
    .line 1632
    move-object/from16 v14, v25

    .line 1633
    .line 1634
    move/from16 v25, v12

    .line 1635
    .line 1636
    move-object v12, v13

    .line 1637
    move/from16 v13, v30

    .line 1638
    .line 1639
    invoke-static/range {v2 .. v9}, Lc5/j;->f(Lc5/j;Landroid/content/Context;Landroid/view/View;ILw4/x0;Ly6/a;Landroid/view/View;I)V

    .line 1640
    .line 1641
    .line 1642
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 1643
    .line 1644
    .line 1645
    move-result v5

    .line 1646
    const/4 v6, -0x1

    .line 1647
    if-ne v5, v6, :cond_3a

    .line 1648
    .line 1649
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 1650
    .line 1651
    .line 1652
    move-result v5

    .line 1653
    invoke-virtual {v4, v5}, Landroid/view/View;->setId(I)V

    .line 1654
    .line 1655
    .line 1656
    :cond_3a
    if-nez v15, :cond_3b

    .line 1657
    .line 1658
    iget-object v5, v3, Lcom/exotv/net/MovieDetailActivity;->N:Landroid/widget/LinearLayout;

    .line 1659
    .line 1660
    if-eqz v5, :cond_3c

    .line 1661
    .line 1662
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 1663
    .line 1664
    .line 1665
    move-result v6

    .line 1666
    invoke-virtual {v5, v6}, Landroid/view/View;->setNextFocusDownId(I)V

    .line 1667
    .line 1668
    .line 1669
    :cond_3b
    const/4 v9, 0x0

    .line 1670
    goto :goto_23

    .line 1671
    :cond_3c
    invoke-static/range {v18 .. v18}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1672
    .line 1673
    .line 1674
    const/4 v9, 0x0

    .line 1675
    throw v9

    .line 1676
    :goto_23
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1677
    .line 1678
    .line 1679
    new-instance v5, Lw4/b0;

    .line 1680
    .line 1681
    invoke-direct {v5, v3, v15, v0}, Lw4/b0;-><init>(Lcom/exotv/net/MovieDetailActivity;ILjava/util/List;)V

    .line 1682
    .line 1683
    .line 1684
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 1685
    .line 1686
    .line 1687
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 1688
    .line 1689
    invoke-direct {v4, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1690
    .line 1691
    .line 1692
    invoke-virtual {v11, v12, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1693
    .line 1694
    .line 1695
    new-instance v4, Landroid/widget/TextView;

    .line 1696
    .line 1697
    invoke-direct {v4, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1698
    .line 1699
    .line 1700
    iget-object v5, v14, Lx4/a;->c:Ljava/lang/String;

    .line 1701
    .line 1702
    const/16 v6, 0xa

    .line 1703
    .line 1704
    invoke-static {v6, v5}, Lc5/j;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 1705
    .line 1706
    .line 1707
    move-result-object v5

    .line 1708
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1709
    .line 1710
    .line 1711
    const/4 v5, -0x1

    .line 1712
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1713
    .line 1714
    .line 1715
    const/high16 v7, 0x41400000    # 12.0f

    .line 1716
    .line 1717
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1718
    .line 1719
    .line 1720
    const/16 v8, 0x11

    .line 1721
    .line 1722
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 1723
    .line 1724
    .line 1725
    invoke-virtual {v4, v13}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 1726
    .line 1727
    .line 1728
    invoke-virtual {v4}, Landroid/widget/TextView;->setSingleLine()V

    .line 1729
    .line 1730
    .line 1731
    const/4 v8, 0x6

    .line 1732
    invoke-virtual {v3, v8}, Lcom/exotv/net/MovieDetailActivity;->s(I)I

    .line 1733
    .line 1734
    .line 1735
    move-result v12

    .line 1736
    const/4 v15, 0x0

    .line 1737
    invoke-virtual {v4, v15, v12, v15, v15}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1738
    .line 1739
    .line 1740
    invoke-virtual {v11, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1741
    .line 1742
    .line 1743
    new-instance v4, Landroid/widget/TextView;

    .line 1744
    .line 1745
    invoke-direct {v4, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1746
    .line 1747
    .line 1748
    iget-object v12, v14, Lx4/a;->b:Ljava/lang/String;

    .line 1749
    .line 1750
    invoke-static {v6, v12}, Lc5/j;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v12

    .line 1754
    invoke-virtual {v4, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1755
    .line 1756
    .line 1757
    sget v12, Lc5/z;->c:I

    .line 1758
    .line 1759
    invoke-virtual {v4, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1760
    .line 1761
    .line 1762
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1763
    .line 1764
    .line 1765
    const/16 v14, 0x11

    .line 1766
    .line 1767
    invoke-virtual {v4, v14}, Landroid/widget/TextView;->setGravity(I)V

    .line 1768
    .line 1769
    .line 1770
    invoke-virtual {v4, v13}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 1771
    .line 1772
    .line 1773
    invoke-virtual {v4}, Landroid/widget/TextView;->setSingleLine()V

    .line 1774
    .line 1775
    .line 1776
    invoke-virtual {v11, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1777
    .line 1778
    .line 1779
    move-object/from16 v4, p1

    .line 1780
    .line 1781
    invoke-virtual {v4, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1782
    .line 1783
    .line 1784
    move v5, v1

    .line 1785
    move/from16 v6, v21

    .line 1786
    .line 1787
    move-object/from16 v15, v22

    .line 1788
    .line 1789
    move-object/from16 v14, v23

    .line 1790
    .line 1791
    move/from16 v11, v24

    .line 1792
    .line 1793
    move/from16 v12, v25

    .line 1794
    .line 1795
    const/16 v13, 0x10

    .line 1796
    .line 1797
    move-object/from16 v1, p0

    .line 1798
    .line 1799
    goto/16 :goto_1e

    .line 1800
    .line 1801
    :cond_3d
    const/4 v9, 0x0

    .line 1802
    invoke-static {}, Lm6/i;->v0()V

    .line 1803
    .line 1804
    .line 1805
    throw v9

    .line 1806
    :cond_3e
    move/from16 v24, v11

    .line 1807
    .line 1808
    move/from16 v25, v12

    .line 1809
    .line 1810
    move-object/from16 v23, v14

    .line 1811
    .line 1812
    move-object/from16 v22, v15

    .line 1813
    .line 1814
    const/4 v9, 0x0

    .line 1815
    new-instance v0, Landroid/widget/HorizontalScrollView;

    .line 1816
    .line 1817
    invoke-direct {v0, v3}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;)V

    .line 1818
    .line 1819
    .line 1820
    const/4 v5, 0x0

    .line 1821
    invoke-virtual {v0, v5}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 1822
    .line 1823
    .line 1824
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 1825
    .line 1826
    .line 1827
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 1828
    .line 1829
    .line 1830
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 1831
    .line 1832
    .line 1833
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 1834
    .line 1835
    .line 1836
    invoke-virtual {v0, v4}, Landroid/widget/HorizontalScrollView;->addView(Landroid/view/View;)V

    .line 1837
    .line 1838
    .line 1839
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 1840
    .line 1841
    move/from16 v2, v24

    .line 1842
    .line 1843
    move/from16 v6, v25

    .line 1844
    .line 1845
    invoke-direct {v1, v2, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1846
    .line 1847
    .line 1848
    invoke-virtual {v14, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1849
    .line 1850
    .line 1851
    move-object/from16 v0, v22

    .line 1852
    .line 1853
    invoke-virtual {v0, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1854
    .line 1855
    .line 1856
    :goto_24
    iget-wide v0, v3, Lcom/exotv/net/MovieDetailActivity;->I:J

    .line 1857
    .line 1858
    move-object/from16 v7, p0

    .line 1859
    .line 1860
    iput-object v9, v7, Lc5/q0;->p:Ljava/lang/Object;

    .line 1861
    .line 1862
    const/4 v2, 0x3

    .line 1863
    iput v2, v7, Lc5/q0;->o:I

    .line 1864
    .line 1865
    invoke-static {v3, v0, v1, v7}, Lcom/exotv/net/MovieDetailActivity;->r(Lcom/exotv/net/MovieDetailActivity;JLr6/c;)Ljava/lang/Object;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v0

    .line 1869
    move-object/from16 v1, v17

    .line 1870
    .line 1871
    if-ne v0, v1, :cond_3f

    .line 1872
    .line 1873
    :goto_25
    return-object v1

    .line 1874
    :cond_3f
    return-object v29

    .line 1875
    :cond_40
    move-object v7, v1

    .line 1876
    invoke-static/range {v16 .. v16}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1877
    .line 1878
    .line 1879
    throw v9

    .line 1880
    :cond_41
    move-object v7, v1

    .line 1881
    invoke-static/range {v18 .. v18}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1882
    .line 1883
    .line 1884
    throw v9

    .line 1885
    :cond_42
    move-object v7, v1

    .line 1886
    invoke-static/range {v16 .. v16}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1887
    .line 1888
    .line 1889
    throw v9

    .line 1890
    :cond_43
    move-object v7, v1

    .line 1891
    move-object/from16 v9, v22

    .line 1892
    .line 1893
    invoke-static/range {v16 .. v16}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1894
    .line 1895
    .line 1896
    throw v9

    .line 1897
    :cond_44
    move-object v7, v1

    .line 1898
    move-object/from16 v9, v22

    .line 1899
    .line 1900
    invoke-static/range {v27 .. v27}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1901
    .line 1902
    .line 1903
    throw v9

    .line 1904
    :cond_45
    move-object v7, v1

    .line 1905
    move-object/from16 v9, v22

    .line 1906
    .line 1907
    invoke-static/range {v16 .. v16}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1908
    .line 1909
    .line 1910
    throw v9

    .line 1911
    :cond_46
    move-object v7, v1

    .line 1912
    move-object/from16 v9, v22

    .line 1913
    .line 1914
    invoke-static/range {v27 .. v27}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1915
    .line 1916
    .line 1917
    throw v9

    .line 1918
    :cond_47
    move-object v7, v1

    .line 1919
    move-object/from16 v27, v6

    .line 1920
    .line 1921
    move-object/from16 v9, v22

    .line 1922
    .line 1923
    invoke-static/range {v27 .. v27}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1924
    .line 1925
    .line 1926
    throw v9

    .line 1927
    :cond_48
    move-object v7, v1

    .line 1928
    move-object v9, v4

    .line 1929
    invoke-static/range {v16 .. v16}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1930
    .line 1931
    .line 1932
    throw v9

    .line 1933
    :goto_26
    sget v1, Lcom/exotv/net/MovieDetailActivity;->Y:I

    .line 1934
    .line 1935
    const-string v1, "load failed"

    .line 1936
    .line 1937
    invoke-static {v5, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1938
    .line 1939
    .line 1940
    iget-object v0, v3, Lcom/exotv/net/MovieDetailActivity;->J:Landroid/widget/LinearLayout;

    .line 1941
    .line 1942
    if-eqz v0, :cond_4a

    .line 1943
    .line 1944
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 1945
    .line 1946
    .line 1947
    iget-object v0, v3, Lcom/exotv/net/MovieDetailActivity;->J:Landroid/widget/LinearLayout;

    .line 1948
    .line 1949
    if-eqz v0, :cond_49

    .line 1950
    .line 1951
    const v1, 0x7f110042

    .line 1952
    .line 1953
    .line 1954
    invoke-virtual {v3, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1955
    .line 1956
    .line 1957
    move-result-object v1

    .line 1958
    invoke-static {v4, v1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1959
    .line 1960
    .line 1961
    new-instance v4, Landroid/widget/TextView;

    .line 1962
    .line 1963
    invoke-direct {v4, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1964
    .line 1965
    .line 1966
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1967
    .line 1968
    .line 1969
    sget v1, Lc5/z;->c:I

    .line 1970
    .line 1971
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1972
    .line 1973
    .line 1974
    const/high16 v14, 0x41600000    # 14.0f

    .line 1975
    .line 1976
    invoke-virtual {v4, v14}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1977
    .line 1978
    .line 1979
    const/16 v14, 0x11

    .line 1980
    .line 1981
    invoke-virtual {v4, v14}, Landroid/widget/TextView;->setGravity(I)V

    .line 1982
    .line 1983
    .line 1984
    const/16 v9, 0x10

    .line 1985
    .line 1986
    invoke-static {v3, v9}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 1987
    .line 1988
    .line 1989
    move-result v1

    .line 1990
    const/16 v5, 0x30

    .line 1991
    .line 1992
    invoke-static {v3, v5}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 1993
    .line 1994
    .line 1995
    move-result v8

    .line 1996
    invoke-static {v3, v9}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 1997
    .line 1998
    .line 1999
    move-result v9

    .line 2000
    invoke-static {v3, v5}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 2001
    .line 2002
    .line 2003
    move-result v3

    .line 2004
    invoke-virtual {v4, v1, v8, v9, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 2005
    .line 2006
    .line 2007
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 2008
    .line 2009
    invoke-direct {v1, v2, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 2010
    .line 2011
    .line 2012
    invoke-virtual {v0, v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 2013
    .line 2014
    .line 2015
    return-object v29

    .line 2016
    :cond_49
    invoke-static/range {v16 .. v16}, Lz6/h;->h(Ljava/lang/String;)V

    .line 2017
    .line 2018
    .line 2019
    throw v9

    .line 2020
    :cond_4a
    invoke-static/range {v16 .. v16}, Lz6/h;->h(Ljava/lang/String;)V

    .line 2021
    .line 2022
    .line 2023
    throw v9
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lc5/q0;->n:I

    .line 2
    .line 3
    check-cast p1, Li7/u;

    .line 4
    .line 5
    check-cast p2, Lp6/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lc5/q0;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lc5/q0;

    .line 15
    .line 16
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lc5/q0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lc5/q0;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lc5/q0;

    .line 28
    .line 29
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lc5/q0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lc5/q0;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lc5/q0;

    .line 41
    .line 42
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lc5/q0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lc5/q0;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Lc5/q0;

    .line 54
    .line 55
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Lc5/q0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, Lc5/q0;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Lc5/q0;

    .line 67
    .line 68
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Lc5/q0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :pswitch_4
    invoke-virtual {p0, p1, p2}, Lc5/q0;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Lc5/q0;

    .line 80
    .line 81
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 82
    .line 83
    invoke-virtual {p1, p2}, Lc5/q0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/Object;Lp6/c;)Lp6/c;
    .locals 3

    .line 1
    iget p1, p0, Lc5/q0;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lc5/q0;

    .line 7
    .line 8
    iget-object v0, p0, Lc5/q0;->q:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lcom/exotv/net/SeriesDetailActivity;

    .line 11
    .line 12
    const/4 v1, 0x5

    .line 13
    invoke-direct {p1, v0, p2, v1}, Lc5/q0;-><init>(Lh/i;Lp6/c;I)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, Lc5/q0;

    .line 18
    .line 19
    iget-object v0, p0, Lc5/q0;->p:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lcom/exotv/net/PlayerActivity;

    .line 22
    .line 23
    iget-object v1, p0, Lc5/q0;->q:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Ljava/lang/String;

    .line 26
    .line 27
    const/4 v2, 0x4

    .line 28
    invoke-direct {p1, v0, v1, p2, v2}, Lc5/q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lp6/c;I)V

    .line 29
    .line 30
    .line 31
    return-object p1

    .line 32
    :pswitch_1
    new-instance p1, Lc5/q0;

    .line 33
    .line 34
    iget-object v0, p0, Lc5/q0;->q:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lcom/exotv/net/MovieDetailActivity;

    .line 37
    .line 38
    const/4 v1, 0x3

    .line 39
    invoke-direct {p1, v0, p2, v1}, Lc5/q0;-><init>(Lh/i;Lp6/c;I)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_2
    new-instance p1, Lc5/q0;

    .line 44
    .line 45
    iget-object v0, p0, Lc5/q0;->q:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lcom/exotv/net/MovieDetailActivity;

    .line 48
    .line 49
    const/4 v1, 0x2

    .line 50
    invoke-direct {p1, v0, p2, v1}, Lc5/q0;-><init>(Lh/i;Lp6/c;I)V

    .line 51
    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_3
    new-instance p1, Lc5/q0;

    .line 55
    .line 56
    iget-object v0, p0, Lc5/q0;->p:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Lh3/h;

    .line 59
    .line 60
    iget-object v1, p0, Lc5/q0;->q:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Lr3/k;

    .line 63
    .line 64
    const/4 v2, 0x1

    .line 65
    invoke-direct {p1, v0, v1, p2, v2}, Lc5/q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lp6/c;I)V

    .line 66
    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_4
    new-instance p1, Lc5/q0;

    .line 70
    .line 71
    iget-object v0, p0, Lc5/q0;->p:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Lx4/m;

    .line 74
    .line 75
    iget-object v1, p0, Lc5/q0;->q:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, Lx4/l;

    .line 78
    .line 79
    const/4 v2, 0x0

    .line 80
    invoke-direct {p1, v0, v1, p2, v2}, Lc5/q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lp6/c;I)V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 42

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lc5/q0;->n:I

    .line 4
    .line 5
    const-string v2, "api_key="

    .line 6
    .line 7
    const-string v3, "4e44d9029b1270a757cddc766a1bcb63"

    .line 8
    .line 9
    const-string v4, "?"

    .line 10
    .line 11
    const-string v5, "&"

    .line 12
    .line 13
    const-string v7, "url"

    .line 14
    .line 15
    const-string v8, "overview"

    .line 16
    .line 17
    const-string v9, "genres"

    .line 18
    .line 19
    const-string v10, "backdrop_path"

    .line 20
    .line 21
    const-string v12, "status"

    .line 22
    .line 23
    const-string v13, "name"

    .line 24
    .line 25
    const-string v14, "optString(...)"

    .line 26
    .line 27
    const-string v15, "poster_path"

    .line 28
    .line 29
    const-string v6, "getString(...)"

    .line 30
    .line 31
    const-string v11, "null"

    .line 32
    .line 33
    move-object/from16 v18, v3

    .line 34
    .line 35
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    move-object/from16 v20, v4

    .line 38
    .line 39
    packed-switch v0, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    sget-object v2, Ll6/j;->a:Ll6/j;

    .line 43
    .line 44
    sget-object v5, Lc5/j;->a:Lc5/j;

    .line 45
    .line 46
    iget-object v0, v1, Lc5/q0;->q:Ljava/lang/Object;

    .line 47
    .line 48
    move-object v7, v0

    .line 49
    check-cast v7, Lcom/exotv/net/SeriesDetailActivity;

    .line 50
    .line 51
    iget v4, v7, Lcom/exotv/net/SeriesDetailActivity;->i0:I

    .line 52
    .line 53
    move-object/from16 v16, v2

    .line 54
    .line 55
    iget v2, v7, Lcom/exotv/net/SeriesDetailActivity;->j0:I

    .line 56
    .line 57
    move-object/from16 v30, v6

    .line 58
    .line 59
    sget-object v6, Lq6/a;->j:Lq6/a;

    .line 60
    .line 61
    iget v0, v1, Lc5/q0;->o:I

    .line 62
    .line 63
    move-object/from16 v18, v5

    .line 64
    .line 65
    const-string v5, "SeriesDetailActivity"

    .line 66
    .line 67
    move-object/from16 v23, v8

    .line 68
    .line 69
    const-string v33, "content"

    .line 70
    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    const/4 v8, 0x1

    .line 74
    if-eq v0, v8, :cond_2

    .line 75
    .line 76
    const/4 v8, 0x2

    .line 77
    if-eq v0, v8, :cond_1

    .line 78
    .line 79
    const/4 v8, 0x3

    .line 80
    if-ne v0, v8, :cond_0

    .line 81
    .line 82
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    goto/16 :goto_13

    .line 86
    .line 87
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw v0

    .line 93
    :cond_1
    iget-object v0, v1, Lc5/q0;->p:Ljava/lang/Object;

    .line 94
    .line 95
    move-object v3, v0

    .line 96
    check-cast v3, Lorg/json/JSONObject;

    .line 97
    .line 98
    :try_start_0
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    .line 100
    .line 101
    move-object/from16 v0, p1

    .line 102
    .line 103
    move-object/from16 v24, v9

    .line 104
    .line 105
    move-object/from16 v25, v12

    .line 106
    .line 107
    goto/16 :goto_5

    .line 108
    .line 109
    :catch_0
    move-exception v0

    .line 110
    move-object/from16 v24, v9

    .line 111
    .line 112
    move-object/from16 v25, v12

    .line 113
    .line 114
    goto/16 :goto_6

    .line 115
    .line 116
    :cond_2
    :try_start_1
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 117
    .line 118
    .line 119
    move-object/from16 v0, p1

    .line 120
    .line 121
    move-object/from16 v24, v9

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :catch_1
    move-exception v0

    .line 125
    move-object v8, v7

    .line 126
    move-object/from16 v7, v30

    .line 127
    .line 128
    goto/16 :goto_14

    .line 129
    .line 130
    :cond_3
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    const/4 v8, 0x1

    .line 134
    :try_start_2
    iput v8, v1, Lc5/q0;->o:I

    .line 135
    .line 136
    sget v0, Lcom/exotv/net/SeriesDetailActivity;->k0:I

    .line 137
    .line 138
    sget-object v0, Li7/e0;->a:Lo7/e;

    .line 139
    .line 140
    sget-object v0, Lo7/d;->l:Lo7/d;

    .line 141
    .line 142
    new-instance v3, Lw4/d1;

    .line 143
    .line 144
    move-object/from16 v24, v9

    .line 145
    .line 146
    const/4 v8, 0x0

    .line 147
    const/4 v9, 0x0

    .line 148
    invoke-direct {v3, v7, v8, v9}, Lw4/d1;-><init>(Lcom/exotv/net/SeriesDetailActivity;Lp6/c;I)V

    .line 149
    .line 150
    .line 151
    invoke-static {v0, v3, v1}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    if-ne v0, v6, :cond_4

    .line 156
    .line 157
    goto/16 :goto_12

    .line 158
    .line 159
    :cond_4
    :goto_0
    move-object v3, v0

    .line 160
    check-cast v3, Lorg/json/JSONObject;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 161
    .line 162
    invoke-virtual {v3, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 167
    .line 168
    .line 169
    move-result v8

    .line 170
    if-nez v8, :cond_5

    .line 171
    .line 172
    const-string v0, "original_name"

    .line 173
    .line 174
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 179
    .line 180
    .line 181
    move-result v8

    .line 182
    if-nez v8, :cond_6

    .line 183
    .line 184
    iget-object v0, v7, Lcom/exotv/net/SeriesDetailActivity;->c0:Ljava/lang/String;

    .line 185
    .line 186
    :cond_6
    iput-object v0, v7, Lcom/exotv/net/SeriesDetailActivity;->c0:Ljava/lang/String;

    .line 187
    .line 188
    new-instance v0, Ljava/util/ArrayList;

    .line 189
    .line 190
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 191
    .line 192
    .line 193
    const-string v8, "seasons"

    .line 194
    .line 195
    invoke-virtual {v3, v8}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 196
    .line 197
    .line 198
    move-result-object v8

    .line 199
    if-eqz v8, :cond_b

    .line 200
    .line 201
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    .line 202
    .line 203
    .line 204
    move-result v9

    .line 205
    move-object/from16 v25, v12

    .line 206
    .line 207
    const/4 v12, 0x0

    .line 208
    :goto_1
    if-ge v12, v9, :cond_c

    .line 209
    .line 210
    move/from16 p1, v9

    .line 211
    .line 212
    invoke-virtual {v8, v12}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 213
    .line 214
    .line 215
    move-result-object v9

    .line 216
    if-nez v9, :cond_7

    .line 217
    .line 218
    move-object/from16 v26, v8

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_7
    move-object/from16 v26, v8

    .line 222
    .line 223
    const-string v8, "season_number"

    .line 224
    .line 225
    invoke-virtual {v9, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 226
    .line 227
    .line 228
    move-result v36

    .line 229
    if-lez v36, :cond_a

    .line 230
    .line 231
    invoke-virtual {v9, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    invoke-static {v14, v8}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    move-object/from16 v38, v8

    .line 239
    .line 240
    const-string v8, "episode_count"

    .line 241
    .line 242
    invoke-virtual {v9, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 243
    .line 244
    .line 245
    move-result v37

    .line 246
    invoke-virtual {v9, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v8

    .line 250
    invoke-static {v8}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 254
    .line 255
    .line 256
    move-result v27

    .line 257
    if-lez v27, :cond_8

    .line 258
    .line 259
    invoke-virtual {v8, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v27

    .line 263
    if-nez v27, :cond_8

    .line 264
    .line 265
    move-object/from16 v39, v8

    .line 266
    .line 267
    goto :goto_2

    .line 268
    :cond_8
    const/16 v39, 0x0

    .line 269
    .line 270
    :goto_2
    const-string v8, "air_date"

    .line 271
    .line 272
    invoke-virtual {v9, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    invoke-static {v8}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 280
    .line 281
    .line 282
    move-result v9

    .line 283
    if-lez v9, :cond_9

    .line 284
    .line 285
    move-object/from16 v40, v8

    .line 286
    .line 287
    goto :goto_3

    .line 288
    :cond_9
    const/16 v40, 0x0

    .line 289
    .line 290
    :goto_3
    new-instance v35, Lw4/b1;

    .line 291
    .line 292
    invoke-direct/range {v35 .. v40}, Lw4/b1;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    move-object/from16 v8, v35

    .line 296
    .line 297
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    :cond_a
    :goto_4
    add-int/lit8 v12, v12, 0x1

    .line 301
    .line 302
    move/from16 v9, p1

    .line 303
    .line 304
    move-object/from16 v8, v26

    .line 305
    .line 306
    goto :goto_1

    .line 307
    :cond_b
    move-object/from16 v25, v12

    .line 308
    .line 309
    :cond_c
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 310
    .line 311
    .line 312
    move-result v8

    .line 313
    if-eqz v8, :cond_d

    .line 314
    .line 315
    new-instance v0, Lw4/b1;

    .line 316
    .line 317
    const/16 v8, 0x18

    .line 318
    .line 319
    invoke-direct {v0, v8}, Lw4/b1;-><init>(I)V

    .line 320
    .line 321
    .line 322
    invoke-static {v0}, Lcom/bumptech/glide/d;->T(Ljava/lang/Object;)Ljava/util/List;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    :cond_d
    iput-object v0, v7, Lcom/exotv/net/SeriesDetailActivity;->d0:Ljava/util/List;

    .line 327
    .line 328
    invoke-static {v0}, Lm6/h;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    check-cast v0, Lw4/b1;

    .line 333
    .line 334
    iget v0, v0, Lw4/b1;->a:I

    .line 335
    .line 336
    iput v0, v7, Lcom/exotv/net/SeriesDetailActivity;->e0:I

    .line 337
    .line 338
    iget-object v0, v7, Lcom/exotv/net/SeriesDetailActivity;->I:Landroid/widget/TextView;

    .line 339
    .line 340
    if-eqz v0, :cond_39

    .line 341
    .line 342
    const-string v8, ""

    .line 343
    .line 344
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 345
    .line 346
    .line 347
    iget-object v0, v7, Lcom/exotv/net/SeriesDetailActivity;->I:Landroid/widget/TextView;

    .line 348
    .line 349
    if-eqz v0, :cond_38

    .line 350
    .line 351
    const/16 v8, 0x8

    .line 352
    .line 353
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 354
    .line 355
    .line 356
    iget-object v0, v7, Lcom/exotv/net/SeriesDetailActivity;->H:Landroid/widget/LinearLayout;

    .line 357
    .line 358
    if-eqz v0, :cond_37

    .line 359
    .line 360
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 361
    .line 362
    .line 363
    iget-object v0, v7, Lcom/exotv/net/SeriesDetailActivity;->N:Ljava/util/ArrayList;

    .line 364
    .line 365
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 366
    .line 367
    .line 368
    const/4 v8, 0x0

    .line 369
    iput-object v8, v7, Lcom/exotv/net/SeriesDetailActivity;->Q:Landroid/view/View;

    .line 370
    .line 371
    :try_start_3
    sget-object v0, Lz4/g0;->a:Lz4/g0;

    .line 372
    .line 373
    iget-wide v8, v7, Lcom/exotv/net/SeriesDetailActivity;->b0:J

    .line 374
    .line 375
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v8

    .line 379
    iput-object v3, v1, Lc5/q0;->p:Ljava/lang/Object;

    .line 380
    .line 381
    const/4 v9, 0x2

    .line 382
    iput v9, v1, Lc5/q0;->o:I

    .line 383
    .line 384
    invoke-virtual {v0, v8, v1}, Lz4/g0;->m(Ljava/lang/String;Lr6/c;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    if-ne v0, v6, :cond_e

    .line 389
    .line 390
    goto/16 :goto_12

    .line 391
    .line 392
    :cond_e
    :goto_5
    check-cast v0, Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 393
    .line 394
    goto :goto_7

    .line 395
    :catch_2
    move-exception v0

    .line 396
    :goto_6
    const-string v8, "quality lookup failed"

    .line 397
    .line 398
    invoke-static {v5, v8, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 399
    .line 400
    .line 401
    const/4 v0, 0x0

    .line 402
    :goto_7
    invoke-virtual {v3, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v5

    .line 406
    invoke-static {v14, v5}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    invoke-static {v5}, Lcom/exotv/net/SeriesDetailActivity;->z(Ljava/lang/String;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v5

    .line 413
    if-nez v5, :cond_f

    .line 414
    .line 415
    invoke-virtual {v3, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v5

    .line 419
    invoke-static {v14, v5}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    invoke-static {v5}, Lcom/exotv/net/SeriesDetailActivity;->z(Ljava/lang/String;)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v5

    .line 426
    :cond_f
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 427
    .line 428
    .line 429
    move-result-object v8

    .line 430
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 431
    .line 432
    .line 433
    move-result-object v8

    .line 434
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 435
    .line 436
    int-to-float v8, v8

    .line 437
    invoke-virtual {v7}, Lcom/exotv/net/SeriesDetailActivity;->u()Z

    .line 438
    .line 439
    .line 440
    move-result v9

    .line 441
    if-eqz v9, :cond_10

    .line 442
    .line 443
    const v9, 0x3f051eb8    # 0.52f

    .line 444
    .line 445
    .line 446
    goto :goto_8

    .line 447
    :cond_10
    const v9, 0x3ed70a3d    # 0.42f

    .line 448
    .line 449
    .line 450
    :goto_8
    mul-float/2addr v8, v9

    .line 451
    float-to-int v8, v8

    .line 452
    int-to-float v9, v8

    .line 453
    const v10, 0x3f0ccccd    # 0.55f

    .line 454
    .line 455
    .line 456
    mul-float/2addr v9, v10

    .line 457
    float-to-int v9, v9

    .line 458
    new-instance v10, Landroid/widget/FrameLayout;

    .line 459
    .line 460
    invoke-direct {v10, v7}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 461
    .line 462
    .line 463
    if-eqz v5, :cond_14

    .line 464
    .line 465
    new-instance v11, Landroid/widget/ImageView;

    .line 466
    .line 467
    invoke-direct {v11, v7}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 468
    .line 469
    .line 470
    sget-object v12, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 471
    .line 472
    invoke-virtual {v11, v12}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 473
    .line 474
    .line 475
    sget v12, Lw4/z0;->c:I

    .line 476
    .line 477
    invoke-virtual {v11, v12}, Landroid/view/View;->setBackgroundColor(I)V

    .line 478
    .line 479
    .line 480
    iget v12, v7, Lcom/exotv/net/SeriesDetailActivity;->Z:I

    .line 481
    .line 482
    add-int/2addr v8, v12

    .line 483
    const-string v12, "original"

    .line 484
    .line 485
    invoke-static {v5, v12}, Lt5/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v12

    .line 489
    if-nez v12, :cond_11

    .line 490
    .line 491
    const-string v12, "w1280"

    .line 492
    .line 493
    invoke-static {v5, v12}, Lt5/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v12

    .line 497
    if-nez v12, :cond_11

    .line 498
    .line 499
    const-string v12, "w780"

    .line 500
    .line 501
    invoke-static {v5, v12}, Lt5/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v12

    .line 505
    :cond_11
    if-eqz v12, :cond_12

    .line 506
    .line 507
    invoke-static {v7}, Lcom/bumptech/glide/b;->b(Landroid/content/Context;)Ln4/l;

    .line 508
    .line 509
    .line 510
    move-result-object v15

    .line 511
    invoke-virtual {v15, v7}, Ln4/l;->d(Lh/i;)Lcom/bumptech/glide/m;

    .line 512
    .line 513
    .line 514
    move-result-object v15

    .line 515
    invoke-virtual {v15, v12}, Lcom/bumptech/glide/m;->m(Ljava/lang/String;)Lcom/bumptech/glide/j;

    .line 516
    .line 517
    .line 518
    move-result-object v12

    .line 519
    invoke-virtual {v12, v11}, Lcom/bumptech/glide/j;->u(Landroid/widget/ImageView;)V

    .line 520
    .line 521
    .line 522
    :cond_12
    new-instance v12, Landroid/widget/FrameLayout$LayoutParams;

    .line 523
    .line 524
    invoke-direct {v12, v4, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v10, v11, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 528
    .line 529
    .line 530
    new-instance v11, Landroid/view/View;

    .line 531
    .line 532
    invoke-direct {v11, v7}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 533
    .line 534
    .line 535
    invoke-static {}, Lc5/j;->c()Landroid/graphics/drawable/GradientDrawable;

    .line 536
    .line 537
    .line 538
    move-result-object v12

    .line 539
    invoke-virtual {v11, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 540
    .line 541
    .line 542
    new-instance v12, Landroid/widget/FrameLayout$LayoutParams;

    .line 543
    .line 544
    invoke-direct {v12, v4, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 545
    .line 546
    .line 547
    const/16 v9, 0x50

    .line 548
    .line 549
    iput v9, v12, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 550
    .line 551
    invoke-virtual {v10, v11, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 552
    .line 553
    .line 554
    iget-object v9, v7, Lcom/exotv/net/SeriesDetailActivity;->H:Landroid/widget/LinearLayout;

    .line 555
    .line 556
    if-eqz v9, :cond_13

    .line 557
    .line 558
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 559
    .line 560
    invoke-direct {v11, v4, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v9, v10, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 564
    .line 565
    .line 566
    goto :goto_9

    .line 567
    :cond_13
    invoke-static/range {v33 .. v33}, Lz6/h;->h(Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    const/16 v19, 0x0

    .line 571
    .line 572
    throw v19

    .line 573
    :cond_14
    :goto_9
    new-instance v8, Landroid/widget/TextView;

    .line 574
    .line 575
    invoke-direct {v8, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 576
    .line 577
    .line 578
    iget-object v9, v7, Lcom/exotv/net/SeriesDetailActivity;->c0:Ljava/lang/String;

    .line 579
    .line 580
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 581
    .line 582
    .line 583
    const/4 v9, -0x1

    .line 584
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 585
    .line 586
    .line 587
    const/high16 v9, 0x41d00000    # 26.0f

    .line 588
    .line 589
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 590
    .line 591
    .line 592
    sget-object v9, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 593
    .line 594
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 595
    .line 596
    .line 597
    const v11, 0x3da3d70a    # 0.08f

    .line 598
    .line 599
    .line 600
    invoke-virtual {v8, v11}, Landroid/widget/TextView;->setLetterSpacing(F)V

    .line 601
    .line 602
    .line 603
    const/16 v11, 0x11

    .line 604
    .line 605
    invoke-virtual {v8, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 606
    .line 607
    .line 608
    const/4 v11, 0x4

    .line 609
    invoke-static {v7, v11}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 610
    .line 611
    .line 612
    move-result v12

    .line 613
    int-to-float v12, v12

    .line 614
    const/4 v15, 0x1

    .line 615
    invoke-static {v7, v15}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 616
    .line 617
    .line 618
    move-result v11

    .line 619
    int-to-float v11, v11

    .line 620
    const/high16 v15, -0x1000000

    .line 621
    .line 622
    move-object/from16 v26, v5

    .line 623
    .line 624
    const/4 v5, 0x0

    .line 625
    invoke-virtual {v8, v12, v5, v11, v15}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    .line 626
    .line 627
    .line 628
    const/16 v5, 0xc

    .line 629
    .line 630
    if-eqz v26, :cond_15

    .line 631
    .line 632
    new-instance v11, Landroid/widget/FrameLayout$LayoutParams;

    .line 633
    .line 634
    invoke-direct {v11, v4, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 635
    .line 636
    .line 637
    const/16 v12, 0x51

    .line 638
    .line 639
    iput v12, v11, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 640
    .line 641
    invoke-static {v7, v5}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 642
    .line 643
    .line 644
    move-result v12

    .line 645
    iput v12, v11, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 646
    .line 647
    const/16 v12, 0x10

    .line 648
    .line 649
    invoke-static {v7, v12}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 650
    .line 651
    .line 652
    move-result v15

    .line 653
    iput v15, v11, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 654
    .line 655
    invoke-static {v7, v12}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 656
    .line 657
    .line 658
    move-result v15

    .line 659
    iput v15, v11, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 660
    .line 661
    invoke-virtual {v10, v8, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 662
    .line 663
    .line 664
    :cond_15
    new-instance v10, Landroid/widget/LinearLayout;

    .line 665
    .line 666
    invoke-direct {v10, v7}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 667
    .line 668
    .line 669
    const/4 v15, 0x1

    .line 670
    invoke-virtual {v10, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 671
    .line 672
    .line 673
    const/4 v11, 0x2

    .line 674
    invoke-static {v7, v11}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 675
    .line 676
    .line 677
    move-result v12

    .line 678
    if-nez v26, :cond_16

    .line 679
    .line 680
    iget v11, v7, Lcom/exotv/net/SeriesDetailActivity;->Z:I

    .line 681
    .line 682
    goto :goto_a

    .line 683
    :cond_16
    const/4 v11, 0x0

    .line 684
    :goto_a
    add-int/2addr v12, v11

    .line 685
    const/4 v11, 0x0

    .line 686
    invoke-virtual {v10, v11, v12, v11, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 687
    .line 688
    .line 689
    if-nez v26, :cond_17

    .line 690
    .line 691
    invoke-virtual {v10, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 692
    .line 693
    .line 694
    :cond_17
    new-instance v8, Ljava/util/ArrayList;

    .line 695
    .line 696
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 697
    .line 698
    .line 699
    move-object/from16 v12, v25

    .line 700
    .line 701
    invoke-virtual {v3, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 702
    .line 703
    .line 704
    move-result-object v11

    .line 705
    invoke-static {v14, v11}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 706
    .line 707
    .line 708
    invoke-static {v11}, Lcom/exotv/net/SeriesDetailActivity;->z(Ljava/lang/String;)Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v11

    .line 712
    if-eqz v11, :cond_19

    .line 713
    .line 714
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 715
    .line 716
    .line 717
    move-result v12

    .line 718
    if-lez v12, :cond_18

    .line 719
    .line 720
    new-instance v12, Ljava/lang/StringBuilder;

    .line 721
    .line 722
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 723
    .line 724
    .line 725
    const/4 v15, 0x0

    .line 726
    invoke-virtual {v11, v15}, Ljava/lang/String;->charAt(I)C

    .line 727
    .line 728
    .line 729
    move-result v25

    .line 730
    invoke-static/range {v25 .. v25}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    move-result-object v15

    .line 734
    const-string v5, "null cannot be cast to non-null type java.lang.String"

    .line 735
    .line 736
    invoke-static {v5, v15}, Lz6/h;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 737
    .line 738
    .line 739
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 740
    .line 741
    invoke-virtual {v15, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v5

    .line 745
    const-string v15, "toUpperCase(...)"

    .line 746
    .line 747
    invoke-static {v15, v5}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    .line 753
    const/4 v15, 0x1

    .line 754
    invoke-virtual {v11, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    move-result-object v5

    .line 758
    const-string v11, "substring(...)"

    .line 759
    .line 760
    invoke-static {v11, v5}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 764
    .line 765
    .line 766
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 767
    .line 768
    .line 769
    move-result-object v11

    .line 770
    :cond_18
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 771
    .line 772
    .line 773
    :cond_19
    const-string v5, "first_air_date"

    .line 774
    .line 775
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object v5

    .line 779
    invoke-static {v14, v5}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 780
    .line 781
    .line 782
    const/4 v11, 0x4

    .line 783
    invoke-static {v11, v5}, Lh7/h;->R0(ILjava/lang/String;)Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v5

    .line 787
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 788
    .line 789
    .line 790
    move-result v12

    .line 791
    if-ne v12, v11, :cond_1a

    .line 792
    .line 793
    goto :goto_b

    .line 794
    :cond_1a
    const/4 v5, 0x0

    .line 795
    :goto_b
    if-eqz v5, :cond_1b

    .line 796
    .line 797
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 798
    .line 799
    .line 800
    :cond_1b
    const-string v5, "number_of_seasons"

    .line 801
    .line 802
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 803
    .line 804
    .line 805
    move-result v5

    .line 806
    if-lez v5, :cond_1c

    .line 807
    .line 808
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 809
    .line 810
    .line 811
    move-result-object v11

    .line 812
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 813
    .line 814
    .line 815
    move-result-object v12

    .line 816
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 817
    .line 818
    .line 819
    move-result-object v12

    .line 820
    const v15, 0x7f100004

    .line 821
    .line 822
    .line 823
    invoke-virtual {v11, v15, v5, v12}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v5

    .line 827
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 828
    .line 829
    .line 830
    :cond_1c
    const-string v5, "number_of_episodes"

    .line 831
    .line 832
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 833
    .line 834
    .line 835
    move-result v5

    .line 836
    if-lez v5, :cond_1d

    .line 837
    .line 838
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 839
    .line 840
    .line 841
    move-result-object v11

    .line 842
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 843
    .line 844
    .line 845
    move-result-object v12

    .line 846
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v12

    .line 850
    const/high16 v15, 0x7f100000

    .line 851
    .line 852
    invoke-virtual {v11, v15, v5, v12}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 853
    .line 854
    .line 855
    move-result-object v5

    .line 856
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 857
    .line 858
    .line 859
    :cond_1d
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 860
    .line 861
    .line 862
    move-result v5

    .line 863
    if-nez v5, :cond_1e

    .line 864
    .line 865
    new-instance v5, Landroid/widget/TextView;

    .line 866
    .line 867
    invoke-direct {v5, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 868
    .line 869
    .line 870
    const/16 v39, 0x0

    .line 871
    .line 872
    const/16 v40, 0x3e

    .line 873
    .line 874
    const-string v36, " \u2022 "

    .line 875
    .line 876
    const/16 v37, 0x0

    .line 877
    .line 878
    const/16 v38, 0x0

    .line 879
    .line 880
    move-object/from16 v35, v8

    .line 881
    .line 882
    invoke-static/range {v35 .. v40}, Lm6/h;->E0(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly6/l;I)Ljava/lang/String;

    .line 883
    .line 884
    .line 885
    move-result-object v8

    .line 886
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 887
    .line 888
    .line 889
    sget v8, Lc5/z;->c:I

    .line 890
    .line 891
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 892
    .line 893
    .line 894
    const/high16 v8, 0x41600000    # 14.0f

    .line 895
    .line 896
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 897
    .line 898
    .line 899
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 900
    .line 901
    .line 902
    const/16 v11, 0x11

    .line 903
    .line 904
    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 905
    .line 906
    .line 907
    const/4 v8, 0x6

    .line 908
    invoke-static {v7, v8}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 909
    .line 910
    .line 911
    move-result v8

    .line 912
    const/4 v15, 0x0

    .line 913
    invoke-virtual {v5, v15, v8, v15, v15}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 914
    .line 915
    .line 916
    invoke-virtual {v10, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 917
    .line 918
    .line 919
    :cond_1e
    new-instance v5, Ljava/util/ArrayList;

    .line 920
    .line 921
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 922
    .line 923
    .line 924
    move-object/from16 v8, v24

    .line 925
    .line 926
    invoke-virtual {v3, v8}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 927
    .line 928
    .line 929
    move-result-object v8

    .line 930
    if-nez v8, :cond_1f

    .line 931
    .line 932
    goto :goto_d

    .line 933
    :cond_1f
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    .line 934
    .line 935
    .line 936
    move-result v9

    .line 937
    const/4 v11, 0x0

    .line 938
    :goto_c
    if-ge v11, v9, :cond_21

    .line 939
    .line 940
    invoke-virtual {v8, v11}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 941
    .line 942
    .line 943
    move-result-object v12

    .line 944
    if-eqz v12, :cond_20

    .line 945
    .line 946
    invoke-virtual {v12, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 947
    .line 948
    .line 949
    move-result-object v12

    .line 950
    if-eqz v12, :cond_20

    .line 951
    .line 952
    invoke-static {v12}, Lcom/exotv/net/SeriesDetailActivity;->z(Ljava/lang/String;)Ljava/lang/String;

    .line 953
    .line 954
    .line 955
    move-result-object v12

    .line 956
    if-eqz v12, :cond_20

    .line 957
    .line 958
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 959
    .line 960
    .line 961
    :cond_20
    add-int/lit8 v11, v11, 0x1

    .line 962
    .line 963
    goto :goto_c

    .line 964
    :cond_21
    :goto_d
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 965
    .line 966
    .line 967
    move-result v8

    .line 968
    if-nez v8, :cond_22

    .line 969
    .line 970
    new-instance v8, Landroid/widget/TextView;

    .line 971
    .line 972
    invoke-direct {v8, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 973
    .line 974
    .line 975
    const/16 v39, 0x0

    .line 976
    .line 977
    const/16 v40, 0x3e

    .line 978
    .line 979
    const-string v36, " \u2022 "

    .line 980
    .line 981
    const/16 v37, 0x0

    .line 982
    .line 983
    const/16 v38, 0x0

    .line 984
    .line 985
    move-object/from16 v35, v5

    .line 986
    .line 987
    invoke-static/range {v35 .. v40}, Lm6/h;->E0(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly6/l;I)Ljava/lang/String;

    .line 988
    .line 989
    .line 990
    move-result-object v5

    .line 991
    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 992
    .line 993
    .line 994
    sget v5, Lc5/z;->c:I

    .line 995
    .line 996
    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 997
    .line 998
    .line 999
    const/high16 v5, 0x41600000    # 14.0f

    .line 1000
    .line 1001
    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1002
    .line 1003
    .line 1004
    sget-object v5, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 1005
    .line 1006
    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1007
    .line 1008
    .line 1009
    const/16 v11, 0x11

    .line 1010
    .line 1011
    invoke-virtual {v8, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 1012
    .line 1013
    .line 1014
    const/16 v5, 0xa

    .line 1015
    .line 1016
    int-to-float v5, v5

    .line 1017
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v9

    .line 1021
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v9

    .line 1025
    const/4 v15, 0x1

    .line 1026
    invoke-static {v15, v5, v9}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 1027
    .line 1028
    .line 1029
    move-result v5

    .line 1030
    float-to-int v5, v5

    .line 1031
    const/4 v15, 0x0

    .line 1032
    invoke-virtual {v8, v15, v5, v15, v15}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1033
    .line 1034
    .line 1035
    const v5, 0x3ca3d70a    # 0.02f

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setLetterSpacing(F)V

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual {v10, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1042
    .line 1043
    .line 1044
    :cond_22
    const-string v5, "vote_average"

    .line 1045
    .line 1046
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 1047
    .line 1048
    .line 1049
    move-result v8

    .line 1050
    if-eqz v8, :cond_24

    .line 1051
    .line 1052
    :cond_23
    const/4 v5, 0x0

    .line 1053
    goto :goto_e

    .line 1054
    :cond_24
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    .line 1055
    .line 1056
    .line 1057
    move-result-wide v8

    .line 1058
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v5

    .line 1062
    const-wide/16 v11, 0x0

    .line 1063
    .line 1064
    cmpl-double v8, v8, v11

    .line 1065
    .line 1066
    if-lez v8, :cond_23

    .line 1067
    .line 1068
    :goto_e
    sget v8, Lw4/z0;->f:I

    .line 1069
    .line 1070
    invoke-static {v7, v5, v8, v0}, Lc5/j;->j(Landroid/content/Context;Ljava/lang/Double;ILjava/lang/String;)Landroid/widget/LinearLayout;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v0

    .line 1074
    if-eqz v0, :cond_25

    .line 1075
    .line 1076
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1077
    .line 1078
    .line 1079
    :cond_25
    iget-object v0, v7, Lcom/exotv/net/SeriesDetailActivity;->H:Landroid/widget/LinearLayout;

    .line 1080
    .line 1081
    if-eqz v0, :cond_36

    .line 1082
    .line 1083
    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1084
    .line 1085
    .line 1086
    move-object/from16 v9, v23

    .line 1087
    .line 1088
    invoke-virtual {v3, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v0

    .line 1092
    invoke-static {v14, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1093
    .line 1094
    .line 1095
    invoke-static {v0}, Lcom/exotv/net/SeriesDetailActivity;->z(Ljava/lang/String;)Ljava/lang/String;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v0

    .line 1099
    if-eqz v0, :cond_27

    .line 1100
    .line 1101
    iget-object v3, v7, Lcom/exotv/net/SeriesDetailActivity;->H:Landroid/widget/LinearLayout;

    .line 1102
    .line 1103
    if-eqz v3, :cond_26

    .line 1104
    .line 1105
    move-object/from16 v5, v18

    .line 1106
    .line 1107
    invoke-virtual {v5, v7, v0}, Lc5/j;->h(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/FrameLayout;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v0

    .line 1111
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 1112
    .line 1113
    invoke-direct {v5, v4, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual {v3, v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1117
    .line 1118
    .line 1119
    goto :goto_f

    .line 1120
    :cond_26
    invoke-static/range {v33 .. v33}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1121
    .line 1122
    .line 1123
    const/16 v19, 0x0

    .line 1124
    .line 1125
    throw v19

    .line 1126
    :cond_27
    :goto_f
    iget-object v0, v7, Lcom/exotv/net/SeriesDetailActivity;->H:Landroid/widget/LinearLayout;

    .line 1127
    .line 1128
    if-eqz v0, :cond_35

    .line 1129
    .line 1130
    sget v25, Lw4/z0;->g:I

    .line 1131
    .line 1132
    invoke-virtual {v7}, Lcom/exotv/net/SeriesDetailActivity;->t()I

    .line 1133
    .line 1134
    .line 1135
    move-result v26

    .line 1136
    const/16 v27, 0x0

    .line 1137
    .line 1138
    const/16 v28, 0xc0

    .line 1139
    .line 1140
    const-string v23, "Seasons"

    .line 1141
    .line 1142
    const/high16 v24, 0x41700000    # 15.0f

    .line 1143
    .line 1144
    move-object/from16 v22, v7

    .line 1145
    .line 1146
    invoke-static/range {v22 .. v28}, Lc5/j;->k(Landroid/content/Context;Ljava/lang/String;FIIII)Landroid/widget/LinearLayout;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v2

    .line 1150
    move/from16 v3, v25

    .line 1151
    .line 1152
    const/16 v28, 0x3f

    .line 1153
    .line 1154
    const/16 v23, 0x0

    .line 1155
    .line 1156
    const/16 v24, 0x0

    .line 1157
    .line 1158
    const/16 v25, 0x0

    .line 1159
    .line 1160
    const/16 v26, 0x0

    .line 1161
    .line 1162
    invoke-static/range {v22 .. v28}, Lcom/exotv/net/SeriesDetailActivity;->x(Lcom/exotv/net/SeriesDetailActivity;IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v4

    .line 1166
    move-object/from16 v5, v22

    .line 1167
    .line 1168
    invoke-virtual {v0, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1169
    .line 1170
    .line 1171
    const/4 v11, 0x4

    .line 1172
    invoke-static {v5, v11}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 1173
    .line 1174
    .line 1175
    new-instance v0, Landroid/widget/LinearLayout;

    .line 1176
    .line 1177
    invoke-direct {v0, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1178
    .line 1179
    .line 1180
    const/4 v15, 0x0

    .line 1181
    invoke-virtual {v0, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1182
    .line 1183
    .line 1184
    const/16 v12, 0x10

    .line 1185
    .line 1186
    invoke-virtual {v0, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1187
    .line 1188
    .line 1189
    const/16 v2, 0xf

    .line 1190
    .line 1191
    invoke-static {v5, v2}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 1192
    .line 1193
    .line 1194
    move-result v4

    .line 1195
    invoke-static {v5, v2}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 1196
    .line 1197
    .line 1198
    move-result v2

    .line 1199
    invoke-virtual {v0, v4, v15, v2, v15}, Landroid/view/View;->setPadding(IIII)V

    .line 1200
    .line 1201
    .line 1202
    iput-object v0, v5, Lcom/exotv/net/SeriesDetailActivity;->K:Landroid/widget/LinearLayout;

    .line 1203
    .line 1204
    iget-object v0, v5, Lcom/exotv/net/SeriesDetailActivity;->H:Landroid/widget/LinearLayout;

    .line 1205
    .line 1206
    if-eqz v0, :cond_34

    .line 1207
    .line 1208
    new-instance v2, Lc5/l0;

    .line 1209
    .line 1210
    invoke-virtual {v5}, Lcom/exotv/net/SeriesDetailActivity;->u()Z

    .line 1211
    .line 1212
    .line 1213
    move-result v4

    .line 1214
    if-nez v4, :cond_28

    .line 1215
    .line 1216
    const/4 v4, 0x0

    .line 1217
    goto :goto_10

    .line 1218
    :cond_28
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v4

    .line 1222
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v4

    .line 1226
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 1227
    .line 1228
    int-to-float v4, v4

    .line 1229
    const v7, 0x3e8f5c29    # 0.28f

    .line 1230
    .line 1231
    .line 1232
    mul-float/2addr v4, v7

    .line 1233
    float-to-int v4, v4

    .line 1234
    int-to-float v4, v4

    .line 1235
    const/high16 v7, 0x40000000    # 2.0f

    .line 1236
    .line 1237
    mul-float/2addr v4, v7

    .line 1238
    const/high16 v7, 0x40400000    # 3.0f

    .line 1239
    .line 1240
    div-float/2addr v4, v7

    .line 1241
    float-to-int v4, v4

    .line 1242
    const/4 v11, 0x4

    .line 1243
    int-to-float v7, v11

    .line 1244
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v8

    .line 1248
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v8

    .line 1252
    const/4 v15, 0x1

    .line 1253
    invoke-static {v15, v7, v8}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 1254
    .line 1255
    .line 1256
    move-result v7

    .line 1257
    float-to-int v7, v7

    .line 1258
    const/16 v17, 0x2

    .line 1259
    .line 1260
    div-int/lit8 v7, v7, 0x2

    .line 1261
    .line 1262
    mul-int/lit8 v7, v7, 0x2

    .line 1263
    .line 1264
    add-int/2addr v7, v4

    .line 1265
    int-to-float v4, v7

    .line 1266
    const v7, 0x3cf5c280    # 0.029999971f

    .line 1267
    .line 1268
    .line 1269
    mul-float/2addr v4, v7

    .line 1270
    float-to-double v7, v4

    .line 1271
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 1272
    .line 1273
    .line 1274
    move-result-wide v7

    .line 1275
    double-to-float v4, v7

    .line 1276
    float-to-int v4, v4

    .line 1277
    const/4 v11, 0x4

    .line 1278
    add-int/2addr v4, v11

    .line 1279
    :goto_10
    invoke-direct {v2, v5, v4}, Lc5/l0;-><init>(Landroid/content/Context;I)V

    .line 1280
    .line 1281
    .line 1282
    const/4 v15, 0x0

    .line 1283
    invoke-virtual {v2, v15}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 1284
    .line 1285
    .line 1286
    invoke-virtual {v2, v15}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 1287
    .line 1288
    .line 1289
    invoke-virtual {v2, v15}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 1290
    .line 1291
    .line 1292
    const/16 v8, 0x8

    .line 1293
    .line 1294
    invoke-static {v5, v8}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 1295
    .line 1296
    .line 1297
    move-result v4

    .line 1298
    invoke-virtual {v5}, Lcom/exotv/net/SeriesDetailActivity;->u()Z

    .line 1299
    .line 1300
    .line 1301
    move-result v7

    .line 1302
    if-eqz v7, :cond_29

    .line 1303
    .line 1304
    const/16 v7, 0xc

    .line 1305
    .line 1306
    invoke-static {v5, v7}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 1307
    .line 1308
    .line 1309
    move-result v21

    .line 1310
    move/from16 v7, v21

    .line 1311
    .line 1312
    goto :goto_11

    .line 1313
    :cond_29
    move v7, v15

    .line 1314
    :goto_11
    invoke-virtual {v2, v15, v4, v15, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 1315
    .line 1316
    .line 1317
    iget-object v4, v5, Lcom/exotv/net/SeriesDetailActivity;->K:Landroid/widget/LinearLayout;

    .line 1318
    .line 1319
    const-string v7, "seasonStrip"

    .line 1320
    .line 1321
    if-eqz v4, :cond_33

    .line 1322
    .line 1323
    invoke-virtual {v4, v15}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 1324
    .line 1325
    .line 1326
    iget-object v4, v5, Lcom/exotv/net/SeriesDetailActivity;->K:Landroid/widget/LinearLayout;

    .line 1327
    .line 1328
    if-eqz v4, :cond_32

    .line 1329
    .line 1330
    invoke-virtual {v4, v15}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 1331
    .line 1332
    .line 1333
    iget-object v4, v5, Lcom/exotv/net/SeriesDetailActivity;->K:Landroid/widget/LinearLayout;

    .line 1334
    .line 1335
    if-eqz v4, :cond_31

    .line 1336
    .line 1337
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1338
    .line 1339
    .line 1340
    const/16 v27, 0x0

    .line 1341
    .line 1342
    const/16 v28, 0x3c

    .line 1343
    .line 1344
    const/16 v23, 0x8

    .line 1345
    .line 1346
    const/16 v24, 0x4

    .line 1347
    .line 1348
    const/16 v25, 0x0

    .line 1349
    .line 1350
    const/16 v26, 0x0

    .line 1351
    .line 1352
    move-object/from16 v22, v5

    .line 1353
    .line 1354
    invoke-static/range {v22 .. v28}, Lcom/exotv/net/SeriesDetailActivity;->x(Lcom/exotv/net/SeriesDetailActivity;IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v4

    .line 1358
    invoke-virtual {v0, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1359
    .line 1360
    .line 1361
    invoke-virtual {v5}, Lcom/exotv/net/SeriesDetailActivity;->D()V

    .line 1362
    .line 1363
    .line 1364
    invoke-virtual {v5}, Lcom/exotv/net/SeriesDetailActivity;->u()Z

    .line 1365
    .line 1366
    .line 1367
    move-result v0

    .line 1368
    if-eqz v0, :cond_2a

    .line 1369
    .line 1370
    iget-object v0, v5, Lcom/exotv/net/SeriesDetailActivity;->O:Landroid/widget/LinearLayout;

    .line 1371
    .line 1372
    if-eqz v0, :cond_2a

    .line 1373
    .line 1374
    new-instance v2, Landroidx/lifecycle/c0;

    .line 1375
    .line 1376
    const/16 v4, 0x16

    .line 1377
    .line 1378
    invoke-direct {v2, v4, v5}, Landroidx/lifecycle/c0;-><init>(ILjava/lang/Object;)V

    .line 1379
    .line 1380
    .line 1381
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1382
    .line 1383
    .line 1384
    :cond_2a
    iget v0, v5, Lcom/exotv/net/SeriesDetailActivity;->e0:I

    .line 1385
    .line 1386
    invoke-static {v0}, Lcom/exotv/net/SeriesDetailActivity;->A(I)Ljava/lang/String;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v0

    .line 1390
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v0

    .line 1394
    const v2, 0x7f11011a

    .line 1395
    .line 1396
    .line 1397
    invoke-virtual {v5, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v0

    .line 1401
    move-object/from16 v7, v30

    .line 1402
    .line 1403
    invoke-static {v7, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1404
    .line 1405
    .line 1406
    invoke-virtual {v5}, Lcom/exotv/net/SeriesDetailActivity;->t()I

    .line 1407
    .line 1408
    .line 1409
    move-result v26

    .line 1410
    const/16 v27, 0x0

    .line 1411
    .line 1412
    const/16 v28, 0xc0

    .line 1413
    .line 1414
    const/high16 v24, 0x41700000    # 15.0f

    .line 1415
    .line 1416
    move-object/from16 v23, v0

    .line 1417
    .line 1418
    move/from16 v25, v3

    .line 1419
    .line 1420
    move-object/from16 v22, v5

    .line 1421
    .line 1422
    invoke-static/range {v22 .. v28}, Lc5/j;->k(Landroid/content/Context;Ljava/lang/String;FIIII)Landroid/widget/LinearLayout;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v0

    .line 1426
    iput-object v0, v5, Lcom/exotv/net/SeriesDetailActivity;->X:Landroid/widget/LinearLayout;

    .line 1427
    .line 1428
    iget-object v0, v5, Lcom/exotv/net/SeriesDetailActivity;->H:Landroid/widget/LinearLayout;

    .line 1429
    .line 1430
    if-eqz v0, :cond_30

    .line 1431
    .line 1432
    iget-object v2, v5, Lcom/exotv/net/SeriesDetailActivity;->X:Landroid/widget/LinearLayout;

    .line 1433
    .line 1434
    const-string v3, "episodesHeading"

    .line 1435
    .line 1436
    if-eqz v2, :cond_2f

    .line 1437
    .line 1438
    const/16 v27, 0x0

    .line 1439
    .line 1440
    const/16 v28, 0x3f

    .line 1441
    .line 1442
    const/16 v23, 0x0

    .line 1443
    .line 1444
    const/16 v24, 0x0

    .line 1445
    .line 1446
    const/16 v25, 0x0

    .line 1447
    .line 1448
    const/16 v26, 0x0

    .line 1449
    .line 1450
    move-object/from16 v22, v5

    .line 1451
    .line 1452
    invoke-static/range {v22 .. v28}, Lcom/exotv/net/SeriesDetailActivity;->x(Lcom/exotv/net/SeriesDetailActivity;IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v4

    .line 1456
    invoke-virtual {v0, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1457
    .line 1458
    .line 1459
    iget-object v0, v5, Lcom/exotv/net/SeriesDetailActivity;->X:Landroid/widget/LinearLayout;

    .line 1460
    .line 1461
    if-eqz v0, :cond_2e

    .line 1462
    .line 1463
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 1464
    .line 1465
    .line 1466
    move-result v2

    .line 1467
    const/4 v15, 0x1

    .line 1468
    sub-int/2addr v2, v15

    .line 1469
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v0

    .line 1473
    const-string v2, "null cannot be cast to non-null type android.widget.TextView"

    .line 1474
    .line 1475
    invoke-static {v2, v0}, Lz6/h;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1476
    .line 1477
    .line 1478
    check-cast v0, Landroid/widget/TextView;

    .line 1479
    .line 1480
    iput-object v0, v5, Lcom/exotv/net/SeriesDetailActivity;->Y:Landroid/widget/TextView;

    .line 1481
    .line 1482
    new-instance v0, Landroid/widget/LinearLayout;

    .line 1483
    .line 1484
    invoke-direct {v0, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1485
    .line 1486
    .line 1487
    invoke-virtual {v0, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1488
    .line 1489
    .line 1490
    const/4 v15, 0x0

    .line 1491
    invoke-virtual {v0, v15}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 1492
    .line 1493
    .line 1494
    invoke-virtual {v0, v15}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 1495
    .line 1496
    .line 1497
    invoke-virtual {v5}, Lcom/exotv/net/SeriesDetailActivity;->t()I

    .line 1498
    .line 1499
    .line 1500
    move-result v2

    .line 1501
    const/16 v8, 0x8

    .line 1502
    .line 1503
    invoke-static {v5, v8}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 1504
    .line 1505
    .line 1506
    move-result v3

    .line 1507
    invoke-virtual {v5}, Lcom/exotv/net/SeriesDetailActivity;->t()I

    .line 1508
    .line 1509
    .line 1510
    move-result v4

    .line 1511
    invoke-virtual {v0, v2, v3, v4, v15}, Landroid/view/View;->setPadding(IIII)V

    .line 1512
    .line 1513
    .line 1514
    iput-object v0, v5, Lcom/exotv/net/SeriesDetailActivity;->L:Landroid/widget/LinearLayout;

    .line 1515
    .line 1516
    iget-object v0, v5, Lcom/exotv/net/SeriesDetailActivity;->H:Landroid/widget/LinearLayout;

    .line 1517
    .line 1518
    if-eqz v0, :cond_2d

    .line 1519
    .line 1520
    iget-object v2, v5, Lcom/exotv/net/SeriesDetailActivity;->L:Landroid/widget/LinearLayout;

    .line 1521
    .line 1522
    if-eqz v2, :cond_2c

    .line 1523
    .line 1524
    const/16 v27, 0x0

    .line 1525
    .line 1526
    const/16 v28, 0x3e

    .line 1527
    .line 1528
    const/16 v23, 0xc

    .line 1529
    .line 1530
    const/16 v24, 0x0

    .line 1531
    .line 1532
    const/16 v25, 0x0

    .line 1533
    .line 1534
    const/16 v26, 0x0

    .line 1535
    .line 1536
    move-object/from16 v22, v5

    .line 1537
    .line 1538
    invoke-static/range {v22 .. v28}, Lcom/exotv/net/SeriesDetailActivity;->x(Lcom/exotv/net/SeriesDetailActivity;IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v3

    .line 1542
    move-object/from16 v8, v22

    .line 1543
    .line 1544
    invoke-virtual {v0, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1545
    .line 1546
    .line 1547
    iget v0, v8, Lcom/exotv/net/SeriesDetailActivity;->e0:I

    .line 1548
    .line 1549
    invoke-virtual {v8, v0}, Lcom/exotv/net/SeriesDetailActivity;->v(I)V

    .line 1550
    .line 1551
    .line 1552
    const/4 v2, 0x0

    .line 1553
    iput-object v2, v1, Lc5/q0;->p:Ljava/lang/Object;

    .line 1554
    .line 1555
    const/4 v2, 0x3

    .line 1556
    iput v2, v1, Lc5/q0;->o:I

    .line 1557
    .line 1558
    invoke-static {v8, v1}, Lcom/exotv/net/SeriesDetailActivity;->r(Lcom/exotv/net/SeriesDetailActivity;Lr6/c;)Ljava/lang/Object;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v0

    .line 1562
    if-ne v0, v6, :cond_2b

    .line 1563
    .line 1564
    :goto_12
    move-object v2, v6

    .line 1565
    goto/16 :goto_15

    .line 1566
    .line 1567
    :cond_2b
    :goto_13
    move-object/from16 v2, v16

    .line 1568
    .line 1569
    goto/16 :goto_15

    .line 1570
    .line 1571
    :cond_2c
    const/4 v2, 0x0

    .line 1572
    const-string v0, "episodeBox"

    .line 1573
    .line 1574
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1575
    .line 1576
    .line 1577
    throw v2

    .line 1578
    :cond_2d
    const/4 v2, 0x0

    .line 1579
    invoke-static/range {v33 .. v33}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1580
    .line 1581
    .line 1582
    throw v2

    .line 1583
    :cond_2e
    const/4 v2, 0x0

    .line 1584
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1585
    .line 1586
    .line 1587
    throw v2

    .line 1588
    :cond_2f
    const/4 v2, 0x0

    .line 1589
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1590
    .line 1591
    .line 1592
    throw v2

    .line 1593
    :cond_30
    const/4 v2, 0x0

    .line 1594
    invoke-static/range {v33 .. v33}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1595
    .line 1596
    .line 1597
    throw v2

    .line 1598
    :cond_31
    const/4 v2, 0x0

    .line 1599
    invoke-static {v7}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1600
    .line 1601
    .line 1602
    throw v2

    .line 1603
    :cond_32
    const/4 v2, 0x0

    .line 1604
    invoke-static {v7}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1605
    .line 1606
    .line 1607
    throw v2

    .line 1608
    :cond_33
    const/4 v2, 0x0

    .line 1609
    invoke-static {v7}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1610
    .line 1611
    .line 1612
    throw v2

    .line 1613
    :cond_34
    const/4 v2, 0x0

    .line 1614
    invoke-static/range {v33 .. v33}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1615
    .line 1616
    .line 1617
    throw v2

    .line 1618
    :cond_35
    const/4 v2, 0x0

    .line 1619
    invoke-static/range {v33 .. v33}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1620
    .line 1621
    .line 1622
    throw v2

    .line 1623
    :cond_36
    const/4 v2, 0x0

    .line 1624
    invoke-static/range {v33 .. v33}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1625
    .line 1626
    .line 1627
    throw v2

    .line 1628
    :cond_37
    const/4 v2, 0x0

    .line 1629
    invoke-static/range {v33 .. v33}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1630
    .line 1631
    .line 1632
    throw v2

    .line 1633
    :cond_38
    move-object/from16 v12, v25

    .line 1634
    .line 1635
    const/4 v2, 0x0

    .line 1636
    invoke-static {v12}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1637
    .line 1638
    .line 1639
    throw v2

    .line 1640
    :cond_39
    move-object/from16 v12, v25

    .line 1641
    .line 1642
    const/4 v2, 0x0

    .line 1643
    invoke-static {v12}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1644
    .line 1645
    .line 1646
    throw v2

    .line 1647
    :goto_14
    const-string v3, "series load failed"

    .line 1648
    .line 1649
    invoke-static {v5, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1650
    .line 1651
    .line 1652
    iget-object v0, v8, Lcom/exotv/net/SeriesDetailActivity;->I:Landroid/widget/TextView;

    .line 1653
    .line 1654
    if-eqz v0, :cond_3c

    .line 1655
    .line 1656
    const/16 v3, 0x8

    .line 1657
    .line 1658
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1659
    .line 1660
    .line 1661
    iget-object v0, v8, Lcom/exotv/net/SeriesDetailActivity;->H:Landroid/widget/LinearLayout;

    .line 1662
    .line 1663
    if-eqz v0, :cond_3b

    .line 1664
    .line 1665
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 1666
    .line 1667
    .line 1668
    iget-object v0, v8, Lcom/exotv/net/SeriesDetailActivity;->H:Landroid/widget/LinearLayout;

    .line 1669
    .line 1670
    if-eqz v0, :cond_3a

    .line 1671
    .line 1672
    const v3, 0x7f110042

    .line 1673
    .line 1674
    .line 1675
    invoke-virtual {v8, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v3

    .line 1679
    invoke-static {v7, v3}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1680
    .line 1681
    .line 1682
    new-instance v5, Landroid/widget/TextView;

    .line 1683
    .line 1684
    invoke-direct {v5, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1685
    .line 1686
    .line 1687
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1688
    .line 1689
    .line 1690
    sget v3, Lc5/z;->c:I

    .line 1691
    .line 1692
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1693
    .line 1694
    .line 1695
    const/high16 v3, 0x41600000    # 14.0f

    .line 1696
    .line 1697
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1698
    .line 1699
    .line 1700
    const/16 v11, 0x11

    .line 1701
    .line 1702
    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 1703
    .line 1704
    .line 1705
    const/16 v12, 0x10

    .line 1706
    .line 1707
    invoke-static {v8, v12}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 1708
    .line 1709
    .line 1710
    move-result v3

    .line 1711
    const/16 v6, 0x30

    .line 1712
    .line 1713
    invoke-static {v8, v6}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 1714
    .line 1715
    .line 1716
    move-result v7

    .line 1717
    invoke-static {v8, v12}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 1718
    .line 1719
    .line 1720
    move-result v9

    .line 1721
    invoke-static {v8, v6}, Lc5/j;->d(Landroid/content/Context;I)I

    .line 1722
    .line 1723
    .line 1724
    move-result v6

    .line 1725
    invoke-virtual {v5, v3, v7, v9, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1726
    .line 1727
    .line 1728
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 1729
    .line 1730
    invoke-direct {v3, v4, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1731
    .line 1732
    .line 1733
    invoke-virtual {v0, v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1734
    .line 1735
    .line 1736
    goto/16 :goto_13

    .line 1737
    .line 1738
    :goto_15
    return-object v2

    .line 1739
    :cond_3a
    invoke-static/range {v33 .. v33}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1740
    .line 1741
    .line 1742
    const/16 v19, 0x0

    .line 1743
    .line 1744
    throw v19

    .line 1745
    :cond_3b
    const/16 v19, 0x0

    .line 1746
    .line 1747
    invoke-static/range {v33 .. v33}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1748
    .line 1749
    .line 1750
    throw v19

    .line 1751
    :cond_3c
    const/16 v19, 0x0

    .line 1752
    .line 1753
    invoke-static {v12}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1754
    .line 1755
    .line 1756
    throw v19

    .line 1757
    :pswitch_0
    move-object v7, v6

    .line 1758
    iget-object v0, v1, Lc5/q0;->q:Ljava/lang/Object;

    .line 1759
    .line 1760
    check-cast v0, Ljava/lang/String;

    .line 1761
    .line 1762
    iget-object v2, v1, Lc5/q0;->p:Ljava/lang/Object;

    .line 1763
    .line 1764
    check-cast v2, Lcom/exotv/net/PlayerActivity;

    .line 1765
    .line 1766
    sget-object v4, Lq6/a;->j:Lq6/a;

    .line 1767
    .line 1768
    iget v5, v1, Lc5/q0;->o:I

    .line 1769
    .line 1770
    if-eqz v5, :cond_3e

    .line 1771
    .line 1772
    const/4 v15, 0x1

    .line 1773
    if-ne v5, v15, :cond_3d

    .line 1774
    .line 1775
    :try_start_4
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 1776
    .line 1777
    .line 1778
    move-object/from16 v3, p1

    .line 1779
    .line 1780
    goto :goto_16

    .line 1781
    :catch_3
    move-exception v0

    .line 1782
    goto :goto_19

    .line 1783
    :cond_3d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1784
    .line 1785
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1786
    .line 1787
    .line 1788
    throw v0

    .line 1789
    :cond_3e
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 1790
    .line 1791
    .line 1792
    const/4 v15, 0x1

    .line 1793
    :try_start_5
    iput v15, v1, Lc5/q0;->o:I

    .line 1794
    .line 1795
    invoke-static {v2, v0, v1}, Lcom/exotv/net/PlayerActivity;->s(Lcom/exotv/net/PlayerActivity;Ljava/lang/String;Lr6/c;)Ljava/lang/Object;

    .line 1796
    .line 1797
    .line 1798
    move-result-object v3

    .line 1799
    if-ne v3, v4, :cond_3f

    .line 1800
    .line 1801
    goto :goto_18

    .line 1802
    :cond_3f
    :goto_16
    check-cast v3, Ljava/util/List;

    .line 1803
    .line 1804
    iget-object v4, v2, Lcom/exotv/net/PlayerActivity;->X:Ljava/util/HashMap;

    .line 1805
    .line 1806
    invoke-virtual {v4, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1807
    .line 1808
    .line 1809
    iget-object v3, v2, Lcom/exotv/net/PlayerActivity;->Y:Ljava/lang/String;

    .line 1810
    .line 1811
    invoke-static {v3, v0}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1812
    .line 1813
    .line 1814
    move-result v3

    .line 1815
    if-eqz v3, :cond_40

    .line 1816
    .line 1817
    invoke-virtual {v2}, Lcom/exotv/net/PlayerActivity;->x()V

    .line 1818
    .line 1819
    .line 1820
    invoke-virtual {v2}, Lcom/exotv/net/PlayerActivity;->L()V

    .line 1821
    .line 1822
    .line 1823
    invoke-virtual {v2, v0}, Lcom/exotv/net/PlayerActivity;->w(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 1824
    .line 1825
    .line 1826
    goto :goto_17

    .line 1827
    :catch_4
    const v0, 0x7f110133

    .line 1828
    .line 1829
    .line 1830
    invoke-virtual {v2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1831
    .line 1832
    .line 1833
    move-result-object v0

    .line 1834
    invoke-static {v7, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1835
    .line 1836
    .line 1837
    invoke-virtual {v2, v0}, Lcom/exotv/net/PlayerActivity;->S(Ljava/lang/String;)V

    .line 1838
    .line 1839
    .line 1840
    :cond_40
    :goto_17
    sget-object v4, Ll6/j;->a:Ll6/j;

    .line 1841
    .line 1842
    :goto_18
    return-object v4

    .line 1843
    :goto_19
    throw v0

    .line 1844
    :pswitch_1
    invoke-direct/range {p0 .. p1}, Lc5/q0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1845
    .line 1846
    .line 1847
    move-result-object v0

    .line 1848
    return-object v0

    .line 1849
    :pswitch_2
    move-object/from16 v41, v9

    .line 1850
    .line 1851
    move-object v9, v8

    .line 1852
    move-object/from16 v8, v41

    .line 1853
    .line 1854
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 1855
    .line 1856
    iget v4, v1, Lc5/q0;->o:I

    .line 1857
    .line 1858
    if-eqz v4, :cond_42

    .line 1859
    .line 1860
    const/4 v6, 0x1

    .line 1861
    if-ne v4, v6, :cond_41

    .line 1862
    .line 1863
    iget-object v0, v1, Lc5/q0;->p:Ljava/lang/Object;

    .line 1864
    .line 1865
    check-cast v0, Lx4/x;

    .line 1866
    .line 1867
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 1868
    .line 1869
    .line 1870
    move-object/from16 v2, p1

    .line 1871
    .line 1872
    move-object/from16 v17, v10

    .line 1873
    .line 1874
    goto :goto_1b

    .line 1875
    :cond_41
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1876
    .line 1877
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1878
    .line 1879
    .line 1880
    throw v0

    .line 1881
    :cond_42
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 1882
    .line 1883
    .line 1884
    sget-object v3, Lx4/x;->a:Lx4/x;

    .line 1885
    .line 1886
    sget-object v4, Lx4/k;->a:Lx4/k;

    .line 1887
    .line 1888
    iget-object v4, v1, Lc5/q0;->q:Ljava/lang/Object;

    .line 1889
    .line 1890
    check-cast v4, Lcom/exotv/net/MovieDetailActivity;

    .line 1891
    .line 1892
    move-object v6, v5

    .line 1893
    iget-wide v4, v4, Lcom/exotv/net/MovieDetailActivity;->I:J

    .line 1894
    .line 1895
    move-object/from16 v22, v6

    .line 1896
    .line 1897
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1898
    .line 1899
    move-object/from16 v17, v10

    .line 1900
    .line 1901
    const-string v10, "https://api.themoviedb.org/3/movie/"

    .line 1902
    .line 1903
    invoke-direct {v6, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1904
    .line 1905
    .line 1906
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1907
    .line 1908
    .line 1909
    const-string v4, "?append_to_response=credits"

    .line 1910
    .line 1911
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1912
    .line 1913
    .line 1914
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1915
    .line 1916
    .line 1917
    move-result-object v4

    .line 1918
    invoke-static {v7, v4}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1919
    .line 1920
    .line 1921
    const/16 v5, 0x3f

    .line 1922
    .line 1923
    invoke-static {v4, v5}, Lh7/h;->v0(Ljava/lang/CharSequence;C)Z

    .line 1924
    .line 1925
    .line 1926
    move-result v5

    .line 1927
    if-eqz v5, :cond_43

    .line 1928
    .line 1929
    move-object/from16 v5, v22

    .line 1930
    .line 1931
    goto :goto_1a

    .line 1932
    :cond_43
    move-object/from16 v5, v20

    .line 1933
    .line 1934
    :goto_1a
    sget-object v6, Lb5/h;->a:Lb5/i;

    .line 1935
    .line 1936
    if-eqz v6, :cond_44

    .line 1937
    .line 1938
    iget-object v6, v6, Lb5/i;->r:Ljava/lang/String;

    .line 1939
    .line 1940
    if-nez v6, :cond_45

    .line 1941
    .line 1942
    :cond_44
    move-object/from16 v6, v18

    .line 1943
    .line 1944
    :cond_45
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1945
    .line 1946
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 1947
    .line 1948
    .line 1949
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1950
    .line 1951
    .line 1952
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1953
    .line 1954
    .line 1955
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1956
    .line 1957
    .line 1958
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1959
    .line 1960
    .line 1961
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1962
    .line 1963
    .line 1964
    move-result-object v2

    .line 1965
    iput-object v3, v1, Lc5/q0;->p:Ljava/lang/Object;

    .line 1966
    .line 1967
    const/4 v6, 0x1

    .line 1968
    iput v6, v1, Lc5/q0;->o:I

    .line 1969
    .line 1970
    invoke-static {v2, v1}, Lx4/k;->f(Ljava/lang/String;Lr6/h;)Ljava/lang/Object;

    .line 1971
    .line 1972
    .line 1973
    move-result-object v2

    .line 1974
    if-ne v2, v0, :cond_46

    .line 1975
    .line 1976
    goto/16 :goto_2a

    .line 1977
    .line 1978
    :cond_46
    move-object v0, v3

    .line 1979
    :goto_1b
    check-cast v2, Ljava/lang/String;

    .line 1980
    .line 1981
    new-instance v3, Lorg/json/JSONObject;

    .line 1982
    .line 1983
    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1984
    .line 1985
    .line 1986
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1987
    .line 1988
    .line 1989
    sget-object v0, Lm6/p;->j:Lm6/p;

    .line 1990
    .line 1991
    const-string v2, "id"

    .line 1992
    .line 1993
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 1994
    .line 1995
    .line 1996
    move-result-wide v23

    .line 1997
    sget-object v4, Lx4/w;->a:Lx4/w;

    .line 1998
    .line 1999
    sget-object v4, Lx4/m;->j:Lx4/m;

    .line 2000
    .line 2001
    sget-object v5, Lx4/w;->b:Ljava/lang/Object;

    .line 2002
    .line 2003
    invoke-static {v5, v4}, Lm6/s;->S(Ljava/util/Map;Lx4/m;)Ljava/lang/Object;

    .line 2004
    .line 2005
    .line 2006
    move-result-object v5

    .line 2007
    check-cast v5, Ljava/util/List;

    .line 2008
    .line 2009
    invoke-static {v3, v5}, Lx4/w;->a(Lorg/json/JSONObject;Ljava/util/List;)Ljava/lang/String;

    .line 2010
    .line 2011
    .line 2012
    move-result-object v5

    .line 2013
    if-nez v5, :cond_47

    .line 2014
    .line 2015
    const-string v5, "Untitled"

    .line 2016
    .line 2017
    :cond_47
    move-object/from16 v25, v5

    .line 2018
    .line 2019
    invoke-virtual {v3, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2020
    .line 2021
    .line 2022
    move-result-object v5

    .line 2023
    invoke-static {v14, v5}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2024
    .line 2025
    .line 2026
    invoke-static {v3, v4}, Lx4/w;->d(Lorg/json/JSONObject;Lx4/m;)Ljava/lang/String;

    .line 2027
    .line 2028
    .line 2029
    move-result-object v27

    .line 2030
    const-string v4, "release_date"

    .line 2031
    .line 2032
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2033
    .line 2034
    .line 2035
    move-result-object v4

    .line 2036
    invoke-static {v4}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 2037
    .line 2038
    .line 2039
    invoke-static {v4}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 2040
    .line 2041
    .line 2042
    move-result v6

    .line 2043
    if-nez v6, :cond_48

    .line 2044
    .line 2045
    invoke-virtual {v4, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2046
    .line 2047
    .line 2048
    move-result v6

    .line 2049
    if-nez v6, :cond_48

    .line 2050
    .line 2051
    move-object/from16 v28, v4

    .line 2052
    .line 2053
    goto :goto_1c

    .line 2054
    :cond_48
    const/16 v28, 0x0

    .line 2055
    .line 2056
    :goto_1c
    const-string v4, "runtime"

    .line 2057
    .line 2058
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 2059
    .line 2060
    .line 2061
    move-result v29

    .line 2062
    invoke-virtual {v3, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2063
    .line 2064
    .line 2065
    move-result-object v4

    .line 2066
    invoke-static {v14, v4}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2067
    .line 2068
    .line 2069
    invoke-virtual {v3, v8}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 2070
    .line 2071
    .line 2072
    move-result-object v6

    .line 2073
    if-nez v6, :cond_49

    .line 2074
    .line 2075
    move-object/from16 v31, v0

    .line 2076
    .line 2077
    goto :goto_1f

    .line 2078
    :cond_49
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    .line 2079
    .line 2080
    .line 2081
    move-result v7

    .line 2082
    const/4 v9, 0x0

    .line 2083
    invoke-static {v9, v7}, Lcom/bumptech/glide/c;->g0(II)Le7/c;

    .line 2084
    .line 2085
    .line 2086
    move-result-object v7

    .line 2087
    new-instance v8, Ljava/util/ArrayList;

    .line 2088
    .line 2089
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 2090
    .line 2091
    .line 2092
    invoke-virtual {v7}, Le7/a;->iterator()Ljava/util/Iterator;

    .line 2093
    .line 2094
    .line 2095
    move-result-object v7

    .line 2096
    :cond_4a
    :goto_1d
    move-object v9, v7

    .line 2097
    check-cast v9, Le7/b;

    .line 2098
    .line 2099
    iget-boolean v10, v9, Le7/b;->l:Z

    .line 2100
    .line 2101
    if-eqz v10, :cond_4c

    .line 2102
    .line 2103
    invoke-virtual {v9}, Le7/b;->nextInt()I

    .line 2104
    .line 2105
    .line 2106
    move-result v9

    .line 2107
    invoke-virtual {v6, v9}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 2108
    .line 2109
    .line 2110
    move-result-object v9

    .line 2111
    if-eqz v9, :cond_4b

    .line 2112
    .line 2113
    invoke-virtual {v9, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2114
    .line 2115
    .line 2116
    move-result-object v9

    .line 2117
    if-eqz v9, :cond_4b

    .line 2118
    .line 2119
    invoke-static {v9}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 2120
    .line 2121
    .line 2122
    move-result v10

    .line 2123
    if-nez v10, :cond_4b

    .line 2124
    .line 2125
    goto :goto_1e

    .line 2126
    :cond_4b
    const/4 v9, 0x0

    .line 2127
    :goto_1e
    if-eqz v9, :cond_4a

    .line 2128
    .line 2129
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2130
    .line 2131
    .line 2132
    goto :goto_1d

    .line 2133
    :cond_4c
    move-object/from16 v31, v8

    .line 2134
    .line 2135
    :goto_1f
    invoke-virtual {v3, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v8

    .line 2139
    invoke-static {v8}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 2140
    .line 2141
    .line 2142
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 2143
    .line 2144
    .line 2145
    move-result v6

    .line 2146
    if-lez v6, :cond_4d

    .line 2147
    .line 2148
    invoke-virtual {v8, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2149
    .line 2150
    .line 2151
    move-result v6

    .line 2152
    if-nez v6, :cond_4d

    .line 2153
    .line 2154
    move-object/from16 v32, v8

    .line 2155
    .line 2156
    :goto_20
    move-object/from16 v6, v17

    .line 2157
    .line 2158
    goto :goto_21

    .line 2159
    :cond_4d
    const/16 v32, 0x0

    .line 2160
    .line 2161
    goto :goto_20

    .line 2162
    :goto_21
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2163
    .line 2164
    .line 2165
    move-result-object v8

    .line 2166
    invoke-static {v8}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 2167
    .line 2168
    .line 2169
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 2170
    .line 2171
    .line 2172
    move-result v6

    .line 2173
    if-lez v6, :cond_4e

    .line 2174
    .line 2175
    invoke-virtual {v8, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2176
    .line 2177
    .line 2178
    move-result v6

    .line 2179
    if-nez v6, :cond_4e

    .line 2180
    .line 2181
    move-object/from16 v33, v8

    .line 2182
    .line 2183
    goto :goto_22

    .line 2184
    :cond_4e
    const/16 v33, 0x0

    .line 2185
    .line 2186
    :goto_22
    sget-object v6, Lx4/w;->a:Lx4/w;

    .line 2187
    .line 2188
    invoke-static {v3}, Lx4/w;->c(Lorg/json/JSONObject;)Ljava/lang/Double;

    .line 2189
    .line 2190
    .line 2191
    move-result-object v34

    .line 2192
    const-string v6, "credits"

    .line 2193
    .line 2194
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 2195
    .line 2196
    .line 2197
    move-result-object v3

    .line 2198
    if-eqz v3, :cond_56

    .line 2199
    .line 2200
    const-string v6, "cast"

    .line 2201
    .line 2202
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 2203
    .line 2204
    .line 2205
    move-result-object v3

    .line 2206
    if-nez v3, :cond_4f

    .line 2207
    .line 2208
    goto/16 :goto_28

    .line 2209
    .line 2210
    :cond_4f
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 2211
    .line 2212
    .line 2213
    move-result v0

    .line 2214
    const/4 v15, 0x0

    .line 2215
    invoke-static {v15, v0}, Lcom/bumptech/glide/c;->g0(II)Le7/c;

    .line 2216
    .line 2217
    .line 2218
    move-result-object v0

    .line 2219
    new-instance v6, Ljava/util/ArrayList;

    .line 2220
    .line 2221
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 2222
    .line 2223
    .line 2224
    invoke-virtual {v0}, Le7/a;->iterator()Ljava/util/Iterator;

    .line 2225
    .line 2226
    .line 2227
    move-result-object v0

    .line 2228
    :cond_50
    :goto_23
    move-object v7, v0

    .line 2229
    check-cast v7, Le7/b;

    .line 2230
    .line 2231
    iget-boolean v8, v7, Le7/b;->l:Z

    .line 2232
    .line 2233
    if-eqz v8, :cond_55

    .line 2234
    .line 2235
    invoke-virtual {v7}, Le7/b;->nextInt()I

    .line 2236
    .line 2237
    .line 2238
    move-result v7

    .line 2239
    invoke-virtual {v3, v7}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 2240
    .line 2241
    .line 2242
    move-result-object v7

    .line 2243
    if-nez v7, :cond_51

    .line 2244
    .line 2245
    :goto_24
    const/4 v8, 0x0

    .line 2246
    goto :goto_27

    .line 2247
    :cond_51
    invoke-virtual {v7, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2248
    .line 2249
    .line 2250
    move-result-object v8

    .line 2251
    invoke-static {v8}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 2252
    .line 2253
    .line 2254
    invoke-static {v8}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 2255
    .line 2256
    .line 2257
    move-result v9

    .line 2258
    if-nez v9, :cond_52

    .line 2259
    .line 2260
    move-object/from16 v38, v8

    .line 2261
    .line 2262
    goto :goto_25

    .line 2263
    :cond_52
    const/16 v38, 0x0

    .line 2264
    .line 2265
    :goto_25
    if-nez v38, :cond_53

    .line 2266
    .line 2267
    goto :goto_24

    .line 2268
    :cond_53
    invoke-virtual {v7, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 2269
    .line 2270
    .line 2271
    move-result-wide v36

    .line 2272
    const-string v8, "character"

    .line 2273
    .line 2274
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2275
    .line 2276
    .line 2277
    move-result-object v8

    .line 2278
    invoke-static {v14, v8}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2279
    .line 2280
    .line 2281
    const-string v9, "profile_path"

    .line 2282
    .line 2283
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2284
    .line 2285
    .line 2286
    move-result-object v7

    .line 2287
    invoke-static {v7}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 2288
    .line 2289
    .line 2290
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 2291
    .line 2292
    .line 2293
    move-result v9

    .line 2294
    if-lez v9, :cond_54

    .line 2295
    .line 2296
    invoke-virtual {v7, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2297
    .line 2298
    .line 2299
    move-result v9

    .line 2300
    if-nez v9, :cond_54

    .line 2301
    .line 2302
    move-object/from16 v40, v7

    .line 2303
    .line 2304
    goto :goto_26

    .line 2305
    :cond_54
    const/16 v40, 0x0

    .line 2306
    .line 2307
    :goto_26
    new-instance v35, Lx4/a;

    .line 2308
    .line 2309
    move-object/from16 v39, v8

    .line 2310
    .line 2311
    invoke-direct/range {v35 .. v40}, Lx4/a;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2312
    .line 2313
    .line 2314
    move-object/from16 v8, v35

    .line 2315
    .line 2316
    :goto_27
    if-eqz v8, :cond_50

    .line 2317
    .line 2318
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2319
    .line 2320
    .line 2321
    goto :goto_23

    .line 2322
    :cond_55
    move-object/from16 v35, v6

    .line 2323
    .line 2324
    goto :goto_29

    .line 2325
    :cond_56
    :goto_28
    move-object/from16 v35, v0

    .line 2326
    .line 2327
    :goto_29
    new-instance v22, Lx4/n;

    .line 2328
    .line 2329
    move-object/from16 v30, v4

    .line 2330
    .line 2331
    move-object/from16 v26, v5

    .line 2332
    .line 2333
    invoke-direct/range {v22 .. v35}, Lx4/n;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;)V

    .line 2334
    .line 2335
    .line 2336
    move-object/from16 v0, v22

    .line 2337
    .line 2338
    :goto_2a
    return-object v0

    .line 2339
    :pswitch_3
    iget-object v0, v1, Lc5/q0;->p:Ljava/lang/Object;

    .line 2340
    .line 2341
    check-cast v0, Lh3/h;

    .line 2342
    .line 2343
    sget-object v2, Lq6/a;->j:Lq6/a;

    .line 2344
    .line 2345
    iget v4, v1, Lc5/q0;->o:I

    .line 2346
    .line 2347
    const/4 v15, 0x1

    .line 2348
    if-eqz v4, :cond_58

    .line 2349
    .line 2350
    if-ne v4, v15, :cond_57

    .line 2351
    .line 2352
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 2353
    .line 2354
    .line 2355
    move-object/from16 v0, p1

    .line 2356
    .line 2357
    goto :goto_2b

    .line 2358
    :cond_57
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2359
    .line 2360
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2361
    .line 2362
    .line 2363
    throw v0

    .line 2364
    :cond_58
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 2365
    .line 2366
    .line 2367
    iget-object v3, v1, Lc5/q0;->q:Ljava/lang/Object;

    .line 2368
    .line 2369
    check-cast v3, Lr3/k;

    .line 2370
    .line 2371
    iput v15, v1, Lc5/q0;->o:I

    .line 2372
    .line 2373
    invoke-static {v0, v3, v1}, Lh3/h;->a(Lh3/h;Lr3/k;Lr6/c;)Ljava/lang/Object;

    .line 2374
    .line 2375
    .line 2376
    move-result-object v0

    .line 2377
    if-ne v0, v2, :cond_59

    .line 2378
    .line 2379
    goto :goto_2c

    .line 2380
    :cond_59
    :goto_2b
    move-object v2, v0

    .line 2381
    check-cast v2, Lr3/l;

    .line 2382
    .line 2383
    move-object v2, v0

    .line 2384
    :goto_2c
    return-object v2

    .line 2385
    :pswitch_4
    move-object/from16 v22, v5

    .line 2386
    .line 2387
    const/4 v15, 0x1

    .line 2388
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 2389
    .line 2390
    iget v4, v1, Lc5/q0;->o:I

    .line 2391
    .line 2392
    if-eqz v4, :cond_5b

    .line 2393
    .line 2394
    if-ne v4, v15, :cond_5a

    .line 2395
    .line 2396
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 2397
    .line 2398
    .line 2399
    move-object/from16 v2, p1

    .line 2400
    .line 2401
    const/4 v8, 0x0

    .line 2402
    goto/16 :goto_2f

    .line 2403
    .line 2404
    :cond_5a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2405
    .line 2406
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2407
    .line 2408
    .line 2409
    throw v0

    .line 2410
    :cond_5b
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 2411
    .line 2412
    .line 2413
    iget-object v3, v1, Lc5/q0;->p:Ljava/lang/Object;

    .line 2414
    .line 2415
    check-cast v3, Lx4/m;

    .line 2416
    .line 2417
    sget-object v4, Lx4/m;->j:Lx4/m;

    .line 2418
    .line 2419
    if-ne v3, v4, :cond_5c

    .line 2420
    .line 2421
    const-string v3, "movie"

    .line 2422
    .line 2423
    goto :goto_2d

    .line 2424
    :cond_5c
    const-string v3, "tv"

    .line 2425
    .line 2426
    :goto_2d
    iget-object v4, v1, Lc5/q0;->q:Ljava/lang/Object;

    .line 2427
    .line 2428
    check-cast v4, Lx4/l;

    .line 2429
    .line 2430
    iget-wide v4, v4, Lx4/l;->a:J

    .line 2431
    .line 2432
    new-instance v6, Ljava/lang/StringBuilder;

    .line 2433
    .line 2434
    const-string v8, "https://api.themoviedb.org/3/"

    .line 2435
    .line 2436
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2437
    .line 2438
    .line 2439
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2440
    .line 2441
    .line 2442
    const-string v3, "/"

    .line 2443
    .line 2444
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2445
    .line 2446
    .line 2447
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2448
    .line 2449
    .line 2450
    const-string v3, "/images?include_image_language=en,null"

    .line 2451
    .line 2452
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2453
    .line 2454
    .line 2455
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2456
    .line 2457
    .line 2458
    move-result-object v3

    .line 2459
    invoke-static {v7, v3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2460
    .line 2461
    .line 2462
    const/16 v5, 0x3f

    .line 2463
    .line 2464
    invoke-static {v3, v5}, Lh7/h;->v0(Ljava/lang/CharSequence;C)Z

    .line 2465
    .line 2466
    .line 2467
    move-result v4

    .line 2468
    if-eqz v4, :cond_5d

    .line 2469
    .line 2470
    move-object/from16 v4, v22

    .line 2471
    .line 2472
    goto :goto_2e

    .line 2473
    :cond_5d
    move-object/from16 v4, v20

    .line 2474
    .line 2475
    :goto_2e
    sget-object v5, Lb5/h;->a:Lb5/i;

    .line 2476
    .line 2477
    if-eqz v5, :cond_5e

    .line 2478
    .line 2479
    iget-object v5, v5, Lb5/i;->r:Ljava/lang/String;

    .line 2480
    .line 2481
    if-nez v5, :cond_5f

    .line 2482
    .line 2483
    :cond_5e
    move-object/from16 v5, v18

    .line 2484
    .line 2485
    :cond_5f
    new-instance v6, Ljava/lang/StringBuilder;

    .line 2486
    .line 2487
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 2488
    .line 2489
    .line 2490
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2491
    .line 2492
    .line 2493
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2494
    .line 2495
    .line 2496
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2497
    .line 2498
    .line 2499
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2500
    .line 2501
    .line 2502
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2503
    .line 2504
    .line 2505
    move-result-object v2

    .line 2506
    sget-object v3, Lx4/k;->a:Lx4/k;

    .line 2507
    .line 2508
    const/4 v15, 0x1

    .line 2509
    iput v15, v1, Lc5/q0;->o:I

    .line 2510
    .line 2511
    const/4 v8, 0x0

    .line 2512
    invoke-static {v2, v8, v1}, Lx4/k;->e(Ljava/lang/String;Ljava/lang/String;Lr6/c;)Ljava/lang/Object;

    .line 2513
    .line 2514
    .line 2515
    move-result-object v2

    .line 2516
    if-ne v2, v0, :cond_60

    .line 2517
    .line 2518
    move-object v3, v0

    .line 2519
    goto/16 :goto_34

    .line 2520
    .line 2521
    :cond_60
    :goto_2f
    check-cast v2, Lorg/json/JSONObject;

    .line 2522
    .line 2523
    const-string v0, "logos"

    .line 2524
    .line 2525
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 2526
    .line 2527
    .line 2528
    move-result-object v0

    .line 2529
    if-nez v0, :cond_61

    .line 2530
    .line 2531
    goto/16 :goto_33

    .line 2532
    .line 2533
    :cond_61
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 2534
    .line 2535
    .line 2536
    move-result v2

    .line 2537
    const/4 v15, 0x0

    .line 2538
    invoke-static {v15, v2}, Lcom/bumptech/glide/c;->g0(II)Le7/c;

    .line 2539
    .line 2540
    .line 2541
    move-result-object v2

    .line 2542
    new-instance v3, Ljava/util/ArrayList;

    .line 2543
    .line 2544
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 2545
    .line 2546
    .line 2547
    invoke-virtual {v2}, Le7/a;->iterator()Ljava/util/Iterator;

    .line 2548
    .line 2549
    .line 2550
    move-result-object v2

    .line 2551
    :cond_62
    :goto_30
    move-object v4, v2

    .line 2552
    check-cast v4, Le7/b;

    .line 2553
    .line 2554
    iget-boolean v5, v4, Le7/b;->l:Z

    .line 2555
    .line 2556
    if-eqz v5, :cond_63

    .line 2557
    .line 2558
    invoke-virtual {v4}, Le7/b;->nextInt()I

    .line 2559
    .line 2560
    .line 2561
    move-result v4

    .line 2562
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 2563
    .line 2564
    .line 2565
    move-result-object v4

    .line 2566
    if-eqz v4, :cond_62

    .line 2567
    .line 2568
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2569
    .line 2570
    .line 2571
    goto :goto_30

    .line 2572
    :cond_63
    new-instance v0, Ljava/util/ArrayList;

    .line 2573
    .line 2574
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2575
    .line 2576
    .line 2577
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 2578
    .line 2579
    .line 2580
    move-result v2

    .line 2581
    const/4 v9, 0x0

    .line 2582
    :cond_64
    :goto_31
    const-string v4, "file_path"

    .line 2583
    .line 2584
    if-ge v9, v2, :cond_65

    .line 2585
    .line 2586
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2587
    .line 2588
    .line 2589
    move-result-object v5

    .line 2590
    add-int/lit8 v9, v9, 0x1

    .line 2591
    .line 2592
    move-object v6, v5

    .line 2593
    check-cast v6, Lorg/json/JSONObject;

    .line 2594
    .line 2595
    invoke-virtual {v6, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2596
    .line 2597
    .line 2598
    move-result-object v4

    .line 2599
    invoke-static {v4}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 2600
    .line 2601
    .line 2602
    invoke-static {v4}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 2603
    .line 2604
    .line 2605
    move-result v6

    .line 2606
    if-nez v6, :cond_64

    .line 2607
    .line 2608
    invoke-virtual {v4, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2609
    .line 2610
    .line 2611
    move-result v4

    .line 2612
    if-nez v4, :cond_64

    .line 2613
    .line 2614
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2615
    .line 2616
    .line 2617
    goto :goto_31

    .line 2618
    :cond_65
    new-instance v2, Lc5/o0;

    .line 2619
    .line 2620
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 2621
    .line 2622
    .line 2623
    new-instance v3, Lc5/p0;

    .line 2624
    .line 2625
    const/4 v15, 0x0

    .line 2626
    invoke-direct {v3, v2, v15}, Lc5/p0;-><init>(Ljava/util/Comparator;I)V

    .line 2627
    .line 2628
    .line 2629
    new-instance v2, Lc5/p0;

    .line 2630
    .line 2631
    const/4 v15, 0x1

    .line 2632
    invoke-direct {v2, v3, v15}, Lc5/p0;-><init>(Ljava/util/Comparator;I)V

    .line 2633
    .line 2634
    .line 2635
    invoke-static {v0, v2}, Lm6/h;->J0(Ljava/util/ArrayList;Ljava/util/Comparator;)Ljava/util/List;

    .line 2636
    .line 2637
    .line 2638
    move-result-object v0

    .line 2639
    invoke-static {v0}, Lm6/h;->B0(Ljava/util/List;)Ljava/lang/Object;

    .line 2640
    .line 2641
    .line 2642
    move-result-object v0

    .line 2643
    check-cast v0, Lorg/json/JSONObject;

    .line 2644
    .line 2645
    if-eqz v0, :cond_68

    .line 2646
    .line 2647
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2648
    .line 2649
    .line 2650
    move-result-object v0

    .line 2651
    if-eqz v0, :cond_68

    .line 2652
    .line 2653
    sget-object v2, Lh7/g;->k:Lh7/g;

    .line 2654
    .line 2655
    const/16 v17, 0x2

    .line 2656
    .line 2657
    invoke-static/range {v17 .. v17}, Ly5/f;->o(I)I

    .line 2658
    .line 2659
    .line 2660
    move-result v2

    .line 2661
    const-string v3, "\\.svg$"

    .line 2662
    .line 2663
    invoke-static {v3, v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 2664
    .line 2665
    .line 2666
    move-result-object v2

    .line 2667
    const-string v3, "compile(...)"

    .line 2668
    .line 2669
    invoke-static {v3, v2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2670
    .line 2671
    .line 2672
    const-string v3, ".png"

    .line 2673
    .line 2674
    invoke-virtual {v2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2675
    .line 2676
    .line 2677
    move-result-object v0

    .line 2678
    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 2679
    .line 2680
    .line 2681
    move-result-object v0

    .line 2682
    const-string v2, "replaceAll(...)"

    .line 2683
    .line 2684
    invoke-static {v2, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2685
    .line 2686
    .line 2687
    invoke-static {v0}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 2688
    .line 2689
    .line 2690
    move-result v2

    .line 2691
    if-nez v2, :cond_66

    .line 2692
    .line 2693
    invoke-virtual {v0, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2694
    .line 2695
    .line 2696
    move-result v2

    .line 2697
    if-nez v2, :cond_66

    .line 2698
    .line 2699
    goto :goto_32

    .line 2700
    :cond_66
    move-object v0, v8

    .line 2701
    :goto_32
    if-nez v0, :cond_67

    .line 2702
    .line 2703
    goto :goto_33

    .line 2704
    :cond_67
    const-string v2, "https://image.tmdb.org/t/p/w500"

    .line 2705
    .line 2706
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2707
    .line 2708
    .line 2709
    move-result-object v3

    .line 2710
    goto :goto_34

    .line 2711
    :cond_68
    :goto_33
    move-object v3, v8

    .line 2712
    :goto_34
    return-object v3

    .line 2713
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
