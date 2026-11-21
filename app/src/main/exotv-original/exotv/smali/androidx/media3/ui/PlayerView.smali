.class public Landroidx/media3/ui/PlayerView;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/common/d;


# static fields
.field public static final synthetic P:I


# instance fields
.field public final A:Ljava/lang/Object;

.field public B:Landroidx/media3/common/d1;

.field public C:Z

.field public D:Lw2/n;

.field public E:I

.field public F:I

.field public G:Landroid/graphics/drawable/Drawable;

.field public H:I

.field public I:Z

.field public J:Ljava/lang/CharSequence;

.field public K:I

.field public L:Z

.field public M:Z

.field public N:Z

.field public O:Z

.field public final j:Lw2/v;

.field public final k:Landroidx/media3/ui/AspectRatioFrameLayout;

.field public final l:Landroid/view/View;

.field public final m:Landroid/view/View;

.field public final n:Z

.field public final o:Lw2/z;

.field public final p:Landroid/widget/ImageView;

.field public final q:Landroid/widget/ImageView;

.field public final r:Landroidx/media3/ui/SubtitleView;

.field public final s:Landroid/view/View;

.field public final t:Landroid/widget/TextView;

.field public final u:Lw2/o;

.field public final v:Landroid/widget/FrameLayout;

.field public final w:Landroid/widget/FrameLayout;

.field public final x:Landroid/os/Handler;

.field public final y:Ljava/lang/Class;

.field public final z:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v1, v0, v2, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 9
    .line 10
    .line 11
    new-instance v4, Lw2/v;

    .line 12
    .line 13
    invoke-direct {v4, v1}, Lw2/v;-><init>(Landroidx/media3/ui/PlayerView;)V

    .line 14
    .line 15
    .line 16
    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->j:Lw2/v;

    .line 17
    .line 18
    new-instance v5, Landroid/os/Handler;

    .line 19
    .line 20
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    invoke-direct {v5, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 25
    .line 26
    .line 27
    iput-object v5, v1, Landroidx/media3/ui/PlayerView;->x:Landroid/os/Handler;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/view/View;->isInEditMode()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const/4 v6, 0x0

    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->k:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 37
    .line 38
    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->l:Landroid/view/View;

    .line 39
    .line 40
    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->m:Landroid/view/View;

    .line 41
    .line 42
    iput-boolean v3, v1, Landroidx/media3/ui/PlayerView;->n:Z

    .line 43
    .line 44
    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->o:Lw2/z;

    .line 45
    .line 46
    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->p:Landroid/widget/ImageView;

    .line 47
    .line 48
    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->q:Landroid/widget/ImageView;

    .line 49
    .line 50
    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->r:Landroidx/media3/ui/SubtitleView;

    .line 51
    .line 52
    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->s:Landroid/view/View;

    .line 53
    .line 54
    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->t:Landroid/widget/TextView;

    .line 55
    .line 56
    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 57
    .line 58
    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->v:Landroid/widget/FrameLayout;

    .line 59
    .line 60
    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->w:Landroid/widget/FrameLayout;

    .line 61
    .line 62
    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->y:Ljava/lang/Class;

    .line 63
    .line 64
    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->z:Ljava/lang/reflect/Method;

    .line 65
    .line 66
    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->A:Ljava/lang/Object;

    .line 67
    .line 68
    new-instance v2, Landroid/widget/ImageView;

    .line 69
    .line 70
    invoke-direct {v2, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 71
    .line 72
    .line 73
    sget v3, Lh1/i0;->a:I

    .line 74
    .line 75
    const/16 v4, 0x17

    .line 76
    .line 77
    const v5, 0x7f080099

    .line 78
    .line 79
    .line 80
    const v7, 0x7f060068

    .line 81
    .line 82
    .line 83
    if-lt v3, v4, :cond_0

    .line 84
    .line 85
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v3, v5, v0}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, v7, v6}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v3, v5, v0}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3, v7}, Landroid/content/res/Resources;->getColor(I)I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 128
    .line 129
    .line 130
    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_1
    const/4 v7, 0x3

    .line 135
    const/4 v8, 0x1

    .line 136
    const v9, 0x7f0d0034

    .line 137
    .line 138
    .line 139
    if-eqz v2, :cond_2

    .line 140
    .line 141
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 142
    .line 143
    .line 144
    move-result-object v11

    .line 145
    sget-object v12, Lw2/a0;->d:[I

    .line 146
    .line 147
    invoke-virtual {v11, v2, v12, v3, v3}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 148
    .line 149
    .line 150
    move-result-object v11

    .line 151
    const/16 v12, 0x2a

    .line 152
    .line 153
    :try_start_0
    invoke-virtual {v11, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 154
    .line 155
    .line 156
    move-result v13

    .line 157
    invoke-virtual {v11, v12, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 158
    .line 159
    .line 160
    move-result v12

    .line 161
    const/16 v14, 0x16

    .line 162
    .line 163
    invoke-virtual {v11, v14, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 164
    .line 165
    .line 166
    move-result v9

    .line 167
    const/16 v14, 0x31

    .line 168
    .line 169
    invoke-virtual {v11, v14, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 170
    .line 171
    .line 172
    move-result v14

    .line 173
    invoke-virtual {v11, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 174
    .line 175
    .line 176
    move-result v15

    .line 177
    const/16 v6, 0x9

    .line 178
    .line 179
    invoke-virtual {v11, v6, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 180
    .line 181
    .line 182
    move-result v6

    .line 183
    const/16 v7, 0xf

    .line 184
    .line 185
    invoke-virtual {v11, v7, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    const/16 v5, 0x32

    .line 190
    .line 191
    invoke-virtual {v11, v5, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    const/16 v10, 0x2d

    .line 196
    .line 197
    invoke-virtual {v11, v10, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 198
    .line 199
    .line 200
    move-result v10

    .line 201
    const/16 v8, 0x1c

    .line 202
    .line 203
    invoke-virtual {v11, v8, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 204
    .line 205
    .line 206
    move-result v8

    .line 207
    const/16 v3, 0x26

    .line 208
    .line 209
    move/from16 v17, v5

    .line 210
    .line 211
    const/16 v5, 0x1388

    .line 212
    .line 213
    invoke-virtual {v11, v3, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    const/16 v5, 0xe

    .line 218
    .line 219
    move/from16 v16, v3

    .line 220
    .line 221
    const/4 v3, 0x1

    .line 222
    invoke-virtual {v11, v5, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 223
    .line 224
    .line 225
    move-result v5

    .line 226
    move/from16 v18, v5

    .line 227
    .line 228
    const/4 v5, 0x4

    .line 229
    invoke-virtual {v11, v5, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 230
    .line 231
    .line 232
    move-result v19

    .line 233
    const/16 v3, 0x23

    .line 234
    .line 235
    const/4 v5, 0x0

    .line 236
    invoke-virtual {v11, v3, v5}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    iget-boolean v5, v1, Landroidx/media3/ui/PlayerView;->I:Z

    .line 241
    .line 242
    move/from16 v20, v3

    .line 243
    .line 244
    const/16 v3, 0x10

    .line 245
    .line 246
    invoke-virtual {v11, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    iput-boolean v3, v1, Landroidx/media3/ui/PlayerView;->I:Z

    .line 251
    .line 252
    const/16 v3, 0xd

    .line 253
    .line 254
    const/4 v5, 0x1

    .line 255
    invoke-virtual {v11, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 256
    .line 257
    .line 258
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 259
    invoke-virtual {v11}, Landroid/content/res/TypedArray;->recycle()V

    .line 260
    .line 261
    .line 262
    move v11, v9

    .line 263
    move/from16 v5, v19

    .line 264
    .line 265
    move v9, v7

    .line 266
    move/from16 v19, v13

    .line 267
    .line 268
    move/from16 v7, v20

    .line 269
    .line 270
    move v13, v12

    .line 271
    move v12, v10

    .line 272
    move v10, v8

    .line 273
    move v8, v6

    .line 274
    move v6, v3

    .line 275
    move/from16 v3, v18

    .line 276
    .line 277
    move/from16 v18, v15

    .line 278
    .line 279
    move v15, v14

    .line 280
    goto :goto_1

    .line 281
    :catchall_0
    move-exception v0

    .line 282
    invoke-virtual {v11}, Landroid/content/res/TypedArray;->recycle()V

    .line 283
    .line 284
    .line 285
    throw v0

    .line 286
    :cond_2
    const/16 v5, 0x1388

    .line 287
    .line 288
    move/from16 v16, v5

    .line 289
    .line 290
    move v11, v9

    .line 291
    const/4 v3, 0x1

    .line 292
    const/4 v5, 0x1

    .line 293
    const/4 v6, 0x1

    .line 294
    const/4 v7, 0x0

    .line 295
    const/4 v8, 0x0

    .line 296
    const/4 v9, 0x0

    .line 297
    const/4 v10, 0x0

    .line 298
    const/4 v12, 0x1

    .line 299
    const/4 v13, 0x0

    .line 300
    const/4 v15, 0x1

    .line 301
    const/16 v17, 0x1

    .line 302
    .line 303
    const/16 v18, 0x1

    .line 304
    .line 305
    const/16 v19, 0x0

    .line 306
    .line 307
    :goto_1
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 308
    .line 309
    .line 310
    move-result-object v14

    .line 311
    invoke-virtual {v14, v11, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 312
    .line 313
    .line 314
    const/high16 v11, 0x40000

    .line 315
    .line 316
    invoke-virtual {v1, v11}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 317
    .line 318
    .line 319
    const v11, 0x7f0a00e8

    .line 320
    .line 321
    .line 322
    invoke-virtual {v1, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 323
    .line 324
    .line 325
    move-result-object v11

    .line 326
    check-cast v11, Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 327
    .line 328
    iput-object v11, v1, Landroidx/media3/ui/PlayerView;->k:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 329
    .line 330
    if-eqz v11, :cond_3

    .line 331
    .line 332
    invoke-virtual {v11, v10}, Landroidx/media3/ui/AspectRatioFrameLayout;->setResizeMode(I)V

    .line 333
    .line 334
    .line 335
    :cond_3
    const v10, 0x7f0a010a

    .line 336
    .line 337
    .line 338
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 339
    .line 340
    .line 341
    move-result-object v10

    .line 342
    iput-object v10, v1, Landroidx/media3/ui/PlayerView;->l:Landroid/view/View;

    .line 343
    .line 344
    if-eqz v10, :cond_4

    .line 345
    .line 346
    if-eqz v19, :cond_4

    .line 347
    .line 348
    invoke-virtual {v10, v13}, Landroid/view/View;->setBackgroundColor(I)V

    .line 349
    .line 350
    .line 351
    :cond_4
    const/4 v13, 0x2

    .line 352
    if-eqz v11, :cond_9

    .line 353
    .line 354
    if-eqz v12, :cond_9

    .line 355
    .line 356
    new-instance v14, Landroid/view/ViewGroup$LayoutParams;

    .line 357
    .line 358
    const/4 v10, -0x1

    .line 359
    invoke-direct {v14, v10, v10}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 360
    .line 361
    .line 362
    if-eq v12, v13, :cond_8

    .line 363
    .line 364
    const-class v10, Landroid/content/Context;

    .line 365
    .line 366
    const/4 v13, 0x3

    .line 367
    if-eq v12, v13, :cond_7

    .line 368
    .line 369
    const/4 v13, 0x4

    .line 370
    if-eq v12, v13, :cond_6

    .line 371
    .line 372
    new-instance v10, Landroid/view/SurfaceView;

    .line 373
    .line 374
    invoke-direct {v10, v0}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    .line 375
    .line 376
    .line 377
    sget v12, Lh1/i0;->a:I

    .line 378
    .line 379
    const/16 v13, 0x22

    .line 380
    .line 381
    if-lt v12, v13, :cond_5

    .line 382
    .line 383
    invoke-static {v10}, Lm0/w;->i(Landroid/view/SurfaceView;)V

    .line 384
    .line 385
    .line 386
    :cond_5
    iput-object v10, v1, Landroidx/media3/ui/PlayerView;->m:Landroid/view/View;

    .line 387
    .line 388
    goto :goto_2

    .line 389
    :cond_6
    :try_start_1
    const-class v12, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView;

    .line 390
    .line 391
    sget v13, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView;->j:I

    .line 392
    .line 393
    filled-new-array {v10}, [Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    move-result-object v10

    .line 397
    invoke-virtual {v12, v10}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 398
    .line 399
    .line 400
    move-result-object v10

    .line 401
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v12

    .line 405
    invoke-virtual {v10, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v10

    .line 409
    check-cast v10, Landroid/view/View;

    .line 410
    .line 411
    iput-object v10, v1, Landroidx/media3/ui/PlayerView;->m:Landroid/view/View;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 412
    .line 413
    goto :goto_2

    .line 414
    :catch_0
    move-exception v0

    .line 415
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 416
    .line 417
    const-string v3, "video_decoder_gl_surface_view requires an ExoPlayer dependency"

    .line 418
    .line 419
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 420
    .line 421
    .line 422
    throw v2

    .line 423
    :cond_7
    :try_start_2
    const-class v12, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;

    .line 424
    .line 425
    sget v13, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->j:I

    .line 426
    .line 427
    filled-new-array {v10}, [Ljava/lang/Class;

    .line 428
    .line 429
    .line 430
    move-result-object v10

    .line 431
    invoke-virtual {v12, v10}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 432
    .line 433
    .line 434
    move-result-object v10

    .line 435
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v12

    .line 439
    invoke-virtual {v10, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v10

    .line 443
    check-cast v10, Landroid/view/View;

    .line 444
    .line 445
    iput-object v10, v1, Landroidx/media3/ui/PlayerView;->m:Landroid/view/View;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 446
    .line 447
    const/4 v10, 0x1

    .line 448
    goto :goto_3

    .line 449
    :catch_1
    move-exception v0

    .line 450
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 451
    .line 452
    const-string v3, "spherical_gl_surface_view requires an ExoPlayer dependency"

    .line 453
    .line 454
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 455
    .line 456
    .line 457
    throw v2

    .line 458
    :cond_8
    new-instance v10, Landroid/view/TextureView;

    .line 459
    .line 460
    invoke-direct {v10, v0}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    .line 461
    .line 462
    .line 463
    iput-object v10, v1, Landroidx/media3/ui/PlayerView;->m:Landroid/view/View;

    .line 464
    .line 465
    :goto_2
    const/4 v10, 0x0

    .line 466
    :goto_3
    iget-object v12, v1, Landroidx/media3/ui/PlayerView;->m:Landroid/view/View;

    .line 467
    .line 468
    invoke-virtual {v12, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 469
    .line 470
    .line 471
    iget-object v12, v1, Landroidx/media3/ui/PlayerView;->m:Landroid/view/View;

    .line 472
    .line 473
    invoke-virtual {v12, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 474
    .line 475
    .line 476
    iget-object v4, v1, Landroidx/media3/ui/PlayerView;->m:Landroid/view/View;

    .line 477
    .line 478
    const/4 v12, 0x0

    .line 479
    invoke-virtual {v4, v12}, Landroid/view/View;->setClickable(Z)V

    .line 480
    .line 481
    .line 482
    iget-object v4, v1, Landroidx/media3/ui/PlayerView;->m:Landroid/view/View;

    .line 483
    .line 484
    invoke-virtual {v11, v4, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 485
    .line 486
    .line 487
    goto :goto_4

    .line 488
    :cond_9
    const/4 v12, 0x0

    .line 489
    const/4 v4, 0x0

    .line 490
    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->m:Landroid/view/View;

    .line 491
    .line 492
    move v10, v12

    .line 493
    :goto_4
    iput-boolean v10, v1, Landroidx/media3/ui/PlayerView;->n:Z

    .line 494
    .line 495
    sget v4, Lh1/i0;->a:I

    .line 496
    .line 497
    const/16 v13, 0x22

    .line 498
    .line 499
    if-ne v4, v13, :cond_a

    .line 500
    .line 501
    new-instance v4, Lw2/z;

    .line 502
    .line 503
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 504
    .line 505
    .line 506
    goto :goto_5

    .line 507
    :cond_a
    const/4 v4, 0x0

    .line 508
    :goto_5
    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->o:Lw2/z;

    .line 509
    .line 510
    const v4, 0x7f0a00e0

    .line 511
    .line 512
    .line 513
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 514
    .line 515
    .line 516
    move-result-object v4

    .line 517
    check-cast v4, Landroid/widget/FrameLayout;

    .line 518
    .line 519
    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->v:Landroid/widget/FrameLayout;

    .line 520
    .line 521
    const v4, 0x7f0a00fb

    .line 522
    .line 523
    .line 524
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 525
    .line 526
    .line 527
    move-result-object v4

    .line 528
    check-cast v4, Landroid/widget/FrameLayout;

    .line 529
    .line 530
    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->w:Landroid/widget/FrameLayout;

    .line 531
    .line 532
    const v4, 0x7f0a00f4

    .line 533
    .line 534
    .line 535
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 536
    .line 537
    .line 538
    move-result-object v4

    .line 539
    check-cast v4, Landroid/widget/ImageView;

    .line 540
    .line 541
    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->p:Landroid/widget/ImageView;

    .line 542
    .line 543
    iput v9, v1, Landroidx/media3/ui/PlayerView;->F:I

    .line 544
    .line 545
    :try_start_3
    const-class v4, Landroidx/media3/exoplayer/ExoPlayer;

    .line 546
    .line 547
    const-class v9, Landroidx/media3/exoplayer/image/ImageOutput;

    .line 548
    .line 549
    sget-object v10, Landroidx/media3/exoplayer/image/ImageOutput;->NO_OP:Landroidx/media3/exoplayer/image/ImageOutput;

    .line 550
    .line 551
    const-string v10, "setImageOutput"

    .line 552
    .line 553
    filled-new-array {v9}, [Ljava/lang/Class;

    .line 554
    .line 555
    .line 556
    move-result-object v11

    .line 557
    invoke-virtual {v4, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 558
    .line 559
    .line 560
    move-result-object v10

    .line 561
    invoke-virtual {v9}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 562
    .line 563
    .line 564
    move-result-object v11

    .line 565
    filled-new-array {v9}, [Ljava/lang/Class;

    .line 566
    .line 567
    .line 568
    move-result-object v9

    .line 569
    new-instance v13, Lw2/u;

    .line 570
    .line 571
    invoke-direct {v13, v1}, Lw2/u;-><init>(Landroidx/media3/ui/PlayerView;)V

    .line 572
    .line 573
    .line 574
    invoke-static {v11, v9, v13}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v9
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_2

    .line 578
    goto :goto_6

    .line 579
    :catch_2
    const/4 v4, 0x0

    .line 580
    const/4 v9, 0x0

    .line 581
    const/4 v10, 0x0

    .line 582
    :goto_6
    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->y:Ljava/lang/Class;

    .line 583
    .line 584
    iput-object v10, v1, Landroidx/media3/ui/PlayerView;->z:Ljava/lang/reflect/Method;

    .line 585
    .line 586
    iput-object v9, v1, Landroidx/media3/ui/PlayerView;->A:Ljava/lang/Object;

    .line 587
    .line 588
    const v4, 0x7f0a00e1

    .line 589
    .line 590
    .line 591
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 592
    .line 593
    .line 594
    move-result-object v4

    .line 595
    check-cast v4, Landroid/widget/ImageView;

    .line 596
    .line 597
    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->q:Landroid/widget/ImageView;

    .line 598
    .line 599
    if-eqz v15, :cond_b

    .line 600
    .line 601
    if-eqz v18, :cond_b

    .line 602
    .line 603
    if-eqz v4, :cond_b

    .line 604
    .line 605
    move/from16 v4, v18

    .line 606
    .line 607
    goto :goto_7

    .line 608
    :cond_b
    move v4, v12

    .line 609
    :goto_7
    iput v4, v1, Landroidx/media3/ui/PlayerView;->E:I

    .line 610
    .line 611
    if-eqz v8, :cond_c

    .line 612
    .line 613
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 614
    .line 615
    .line 616
    move-result-object v4

    .line 617
    invoke-virtual {v4, v8}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 618
    .line 619
    .line 620
    move-result-object v4

    .line 621
    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->G:Landroid/graphics/drawable/Drawable;

    .line 622
    .line 623
    :cond_c
    const v4, 0x7f0a010d

    .line 624
    .line 625
    .line 626
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 627
    .line 628
    .line 629
    move-result-object v4

    .line 630
    check-cast v4, Landroidx/media3/ui/SubtitleView;

    .line 631
    .line 632
    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->r:Landroidx/media3/ui/SubtitleView;

    .line 633
    .line 634
    if-eqz v4, :cond_d

    .line 635
    .line 636
    invoke-virtual {v4}, Landroidx/media3/ui/SubtitleView;->a()V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v4}, Landroidx/media3/ui/SubtitleView;->b()V

    .line 640
    .line 641
    .line 642
    :cond_d
    const v4, 0x7f0a00e5

    .line 643
    .line 644
    .line 645
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 646
    .line 647
    .line 648
    move-result-object v4

    .line 649
    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->s:Landroid/view/View;

    .line 650
    .line 651
    const/16 v8, 0x8

    .line 652
    .line 653
    if-eqz v4, :cond_e

    .line 654
    .line 655
    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    .line 656
    .line 657
    .line 658
    :cond_e
    iput v7, v1, Landroidx/media3/ui/PlayerView;->H:I

    .line 659
    .line 660
    const v4, 0x7f0a00ed

    .line 661
    .line 662
    .line 663
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 664
    .line 665
    .line 666
    move-result-object v4

    .line 667
    check-cast v4, Landroid/widget/TextView;

    .line 668
    .line 669
    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->t:Landroid/widget/TextView;

    .line 670
    .line 671
    if-eqz v4, :cond_f

    .line 672
    .line 673
    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    .line 674
    .line 675
    .line 676
    :cond_f
    const v4, 0x7f0a00e9

    .line 677
    .line 678
    .line 679
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 680
    .line 681
    .line 682
    move-result-object v7

    .line 683
    check-cast v7, Lw2/o;

    .line 684
    .line 685
    const v8, 0x7f0a00ea

    .line 686
    .line 687
    .line 688
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 689
    .line 690
    .line 691
    move-result-object v8

    .line 692
    if-eqz v7, :cond_10

    .line 693
    .line 694
    iput-object v7, v1, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 695
    .line 696
    goto :goto_8

    .line 697
    :cond_10
    if-eqz v8, :cond_11

    .line 698
    .line 699
    new-instance v7, Lw2/o;

    .line 700
    .line 701
    invoke-direct {v7, v0, v2}, Lw2/o;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 702
    .line 703
    .line 704
    iput-object v7, v1, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 705
    .line 706
    invoke-virtual {v7, v4}, Landroid/view/View;->setId(I)V

    .line 707
    .line 708
    .line 709
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    invoke-virtual {v7, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 714
    .line 715
    .line 716
    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    check-cast v0, Landroid/view/ViewGroup;

    .line 721
    .line 722
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 723
    .line 724
    .line 725
    move-result v2

    .line 726
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v0, v7, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 730
    .line 731
    .line 732
    goto :goto_8

    .line 733
    :cond_11
    const/4 v4, 0x0

    .line 734
    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 735
    .line 736
    :goto_8
    iget-object v0, v1, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 737
    .line 738
    if-eqz v0, :cond_12

    .line 739
    .line 740
    move/from16 v2, v16

    .line 741
    .line 742
    goto :goto_9

    .line 743
    :cond_12
    move v2, v12

    .line 744
    :goto_9
    iput v2, v1, Landroidx/media3/ui/PlayerView;->K:I

    .line 745
    .line 746
    iput-boolean v3, v1, Landroidx/media3/ui/PlayerView;->N:Z

    .line 747
    .line 748
    iput-boolean v5, v1, Landroidx/media3/ui/PlayerView;->L:Z

    .line 749
    .line 750
    iput-boolean v6, v1, Landroidx/media3/ui/PlayerView;->M:Z

    .line 751
    .line 752
    if-eqz v17, :cond_13

    .line 753
    .line 754
    if-eqz v0, :cond_13

    .line 755
    .line 756
    const/4 v3, 0x1

    .line 757
    goto :goto_a

    .line 758
    :cond_13
    move v3, v12

    .line 759
    :goto_a
    iput-boolean v3, v1, Landroidx/media3/ui/PlayerView;->C:Z

    .line 760
    .line 761
    if-eqz v0, :cond_16

    .line 762
    .line 763
    iget-object v0, v0, Lw2/o;->j:Lw2/t;

    .line 764
    .line 765
    iget v2, v0, Lw2/t;->z:I

    .line 766
    .line 767
    const/4 v13, 0x3

    .line 768
    if-eq v2, v13, :cond_15

    .line 769
    .line 770
    const/4 v3, 0x2

    .line 771
    if-ne v2, v3, :cond_14

    .line 772
    .line 773
    goto :goto_b

    .line 774
    :cond_14
    invoke-virtual {v0}, Lw2/t;->f()V

    .line 775
    .line 776
    .line 777
    invoke-virtual {v0, v3}, Lw2/t;->i(I)V

    .line 778
    .line 779
    .line 780
    :cond_15
    :goto_b
    iget-object v0, v1, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 781
    .line 782
    iget-object v2, v1, Landroidx/media3/ui/PlayerView;->j:Lw2/v;

    .line 783
    .line 784
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 785
    .line 786
    .line 787
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 788
    .line 789
    .line 790
    iget-object v0, v0, Lw2/o;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 791
    .line 792
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 793
    .line 794
    .line 795
    :cond_16
    if-eqz v17, :cond_17

    .line 796
    .line 797
    const/4 v3, 0x1

    .line 798
    invoke-virtual {v1, v3}, Landroid/view/View;->setClickable(Z)V

    .line 799
    .line 800
    .line 801
    :cond_17
    invoke-virtual {v1}, Landroidx/media3/ui/PlayerView;->l()V

    .line 802
    .line 803
    .line 804
    return-void
.end method

.method public static a(Landroidx/media3/ui/PlayerView;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v0}, Landroidx/media3/ui/PlayerView;->setImage(Landroid/graphics/drawable/Drawable;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/16 v0, 0x1e

    .line 18
    .line 19
    invoke-interface {p1, v0}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-interface {p1}, Landroidx/media3/common/d1;->getCurrentTracks()Landroidx/media3/common/x1;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 v0, 0x2

    .line 30
    invoke-virtual {p1, v0}, Landroidx/media3/common/x1;->a(I)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    iget-object p1, p0, Landroidx/media3/ui/PlayerView;->p:Landroid/widget/ImageView;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->o()V

    .line 46
    .line 47
    .line 48
    :cond_1
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->l:Landroid/view/View;

    .line 49
    .line 50
    if-eqz p0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 53
    .line 54
    .line 55
    :cond_2
    return-void
.end method

.method private setImage(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->p:Landroid/widget/ImageView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->o()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private setImageOutput(Landroidx/media3/common/d1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->y:Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    :try_start_0
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->z:Ljava/lang/reflect/Method;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->A:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catch_0
    move-exception p1

    .line 34
    goto :goto_0

    .line 35
    :catch_1
    move-exception p1

    .line 36
    :goto_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 37
    .line 38
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :cond_0
    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->A:Ljava/lang/Object;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/16 v1, 0x1e

    .line 10
    .line 11
    invoke-interface {v0, v1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Landroidx/media3/common/d1;->getCurrentTracks()Landroidx/media3/common/x1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x4

    .line 22
    invoke-virtual {v0, v1}, Landroidx/media3/common/x1;->a(I)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    return v0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->p:Landroid/widget/ImageView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 7
    .line 8
    .line 9
    :cond_0
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const v1, 0x106000d

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
.end method

.method public final d()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x10

    .line 6
    .line 7
    invoke-interface {v0, v1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 14
    .line 15
    invoke-interface {v0}, Landroidx/media3/common/d1;->isPlayingAd()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 22
    .line 23
    invoke-interface {v0}, Landroidx/media3/common/d1;->getPlayWhenReady()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    return v0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    return v0
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    sget p1, Lh1/i0;->a:I

    .line 5
    .line 6
    const/16 v0, 0x22

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Landroidx/media3/ui/PlayerView;->o:Lw2/z;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->O:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Lw2/z;->b()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x10

    .line 6
    .line 7
    invoke-interface {v0, v1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 14
    .line 15
    invoke-interface {v0}, Landroidx/media3/common/d1;->isPlayingAd()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1

    .line 26
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/16 v1, 0x13

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x1

    .line 34
    if-eq v0, v1, :cond_2

    .line 35
    .line 36
    const/16 v1, 0x10e

    .line 37
    .line 38
    if-eq v0, v1, :cond_2

    .line 39
    .line 40
    const/16 v1, 0x16

    .line 41
    .line 42
    if-eq v0, v1, :cond_2

    .line 43
    .line 44
    const/16 v1, 0x10f

    .line 45
    .line 46
    if-eq v0, v1, :cond_2

    .line 47
    .line 48
    const/16 v1, 0x14

    .line 49
    .line 50
    if-eq v0, v1, :cond_2

    .line 51
    .line 52
    const/16 v1, 0x10d

    .line 53
    .line 54
    if-eq v0, v1, :cond_2

    .line 55
    .line 56
    const/16 v1, 0x15

    .line 57
    .line 58
    if-eq v0, v1, :cond_2

    .line 59
    .line 60
    const/16 v1, 0x10c

    .line 61
    .line 62
    if-eq v0, v1, :cond_2

    .line 63
    .line 64
    const/16 v1, 0x17

    .line 65
    .line 66
    if-ne v0, v1, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    move v0, v2

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    :goto_0
    move v0, v3

    .line 72
    :goto_1
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->p()Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_3

    .line 81
    .line 82
    invoke-virtual {v1}, Lw2/o;->g()Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-nez v4, :cond_3

    .line 87
    .line 88
    invoke-virtual {p0, v3}, Landroidx/media3/ui/PlayerView;->e(Z)V

    .line 89
    .line 90
    .line 91
    return v3

    .line 92
    :cond_3
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->p()Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-eqz v4, :cond_4

    .line 97
    .line 98
    invoke-virtual {v1, p1}, Lw2/o;->c(Landroid/view/KeyEvent;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_4

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_5

    .line 110
    .line 111
    :goto_2
    invoke-virtual {p0, v3}, Landroidx/media3/ui/PlayerView;->e(Z)V

    .line 112
    .line 113
    .line 114
    return v3

    .line 115
    :cond_5
    if-eqz v0, :cond_6

    .line 116
    .line 117
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->p()Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eqz p1, :cond_6

    .line 122
    .line 123
    invoke-virtual {p0, v3}, Landroidx/media3/ui/PlayerView;->e(Z)V

    .line 124
    .line 125
    .line 126
    :cond_6
    return v2
.end method

.method public final e(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->M:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->p()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 19
    .line 20
    invoke-virtual {v0}, Lw2/o;->g()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Lw2/o;->getShowTimeoutMs()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-gtz v0, :cond_1

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v0, 0x0

    .line 35
    :goto_0
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->g()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    :cond_2
    invoke-virtual {p0, v1}, Landroidx/media3/ui/PlayerView;->h(Z)V

    .line 46
    .line 47
    .line 48
    :cond_3
    :goto_1
    return-void
.end method

.method public final f(Landroid/graphics/drawable/Drawable;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->q:Landroid/widget/ImageView;

    .line 3
    .line 4
    if-eqz v1, :cond_2

    .line 5
    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-lez v2, :cond_2

    .line 17
    .line 18
    if-lez v3, :cond_2

    .line 19
    .line 20
    int-to-float v2, v2

    .line 21
    int-to-float v3, v3

    .line 22
    div-float/2addr v2, v3

    .line 23
    sget-object v3, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    .line 24
    .line 25
    iget v4, p0, Landroidx/media3/ui/PlayerView;->E:I

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    if-ne v4, v5, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    int-to-float v2, v2

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    int-to-float v3, v3

    .line 40
    div-float/2addr v2, v3

    .line 41
    sget-object v3, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 42
    .line 43
    :cond_0
    iget-object v4, p0, Landroidx/media3/ui/PlayerView;->k:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 44
    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    invoke-virtual {v4, v2}, Landroidx/media3/ui/AspectRatioFrameLayout;->setAspectRatio(F)V

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    const/4 p1, 0x1

    .line 60
    return p1

    .line 61
    :cond_2
    return v0
.end method

.method public final g()Z
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-interface {v0}, Landroidx/media3/common/d1;->getPlaybackState()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-boolean v2, p0, Landroidx/media3/ui/PlayerView;->L:Z

    .line 12
    .line 13
    if-eqz v2, :cond_3

    .line 14
    .line 15
    iget-object v2, p0, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 16
    .line 17
    const/16 v3, 0x11

    .line 18
    .line 19
    invoke-interface {v2, v3}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    iget-object v2, p0, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 26
    .line 27
    invoke-interface {v2}, Landroidx/media3/common/d1;->getCurrentTimeline()Landroidx/media3/common/p1;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_3

    .line 36
    .line 37
    :cond_1
    if-eq v0, v1, :cond_2

    .line 38
    .line 39
    const/4 v2, 0x4

    .line 40
    if-eq v0, v2, :cond_2

    .line 41
    .line 42
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-interface {v0}, Landroidx/media3/common/d1;->getPlayWhenReady()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    :cond_2
    return v1

    .line 54
    :cond_3
    const/4 v0, 0x0

    .line 55
    return v0
.end method

.method public getAdOverlayInfos()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/media3/common/a;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->w:Landroid/widget/FrameLayout;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v2, Landroidx/media3/common/a;

    .line 11
    .line 12
    invoke-direct {v2, v1}, Landroidx/media3/common/a;-><init>(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    new-instance v2, Landroidx/media3/common/a;

    .line 23
    .line 24
    invoke-direct {v2, v1}, Landroidx/media3/common/a;-><init>(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-static {v0}, Lf6/m0;->j(Ljava/util/Collection;)Lf6/m0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0
.end method

.method public getAdViewGroup()Landroid/view/ViewGroup;
    .locals 2

    .line 1
    const-string v0, "exo_ad_overlay must be present for ad playback"

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->v:Landroid/widget/FrameLayout;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lh1/a;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v1
.end method

.method public getArtworkDisplayMode()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/ui/PlayerView;->E:I

    .line 2
    .line 3
    return v0
.end method

.method public getControllerAutoShow()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->L:Z

    .line 2
    .line 3
    return v0
.end method

.method public getControllerHideOnTouch()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->N:Z

    .line 2
    .line 3
    return v0
.end method

.method public getControllerShowTimeoutMs()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/ui/PlayerView;->K:I

    .line 2
    .line 3
    return v0
.end method

.method public getDefaultArtwork()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->G:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public getImageDisplayMode()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/ui/PlayerView;->F:I

    .line 2
    .line 3
    return v0
.end method

.method public getOverlayFrameLayout()Landroid/widget/FrameLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->w:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPlayer()Landroidx/media3/common/d1;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 2
    .line 3
    return-object v0
.end method

.method public getResizeMode()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->k:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/media3/ui/AspectRatioFrameLayout;->getResizeMode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method

.method public getSubtitleView()Landroidx/media3/ui/SubtitleView;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->r:Landroidx/media3/ui/SubtitleView;

    .line 2
    .line 3
    return-object v0
.end method

.method public getUseArtwork()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget v0, p0, Landroidx/media3/ui/PlayerView;->E:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public getUseController()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->C:Z

    .line 2
    .line 3
    return v0
.end method

.method public getVideoSurfaceView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->m:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h(Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    move p1, v0

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    iget p1, p0, Landroidx/media3/ui/PlayerView;->K:I

    .line 14
    .line 15
    :goto_0
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Lw2/o;->setShowTimeoutMs(I)V

    .line 18
    .line 19
    .line 20
    iget-object p1, v1, Lw2/o;->j:Lw2/t;

    .line 21
    .line 22
    iget-object v1, p1, Lw2/t;->a:Lw2/o;

    .line 23
    .line 24
    invoke-virtual {v1}, Lw2/o;->h()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lw2/o;->i()V

    .line 34
    .line 35
    .line 36
    iget-object v0, v1, Lw2/o;->x:Landroid/widget/ImageView;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-virtual {p1}, Lw2/t;->k()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final i()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 13
    .line 14
    invoke-virtual {v0}, Lw2/o;->g()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-virtual {p0, v0}, Landroidx/media3/ui/PlayerView;->e(Z)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    iget-boolean v1, p0, Landroidx/media3/ui/PlayerView;->N:Z

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {v0}, Lw2/o;->f()V

    .line 30
    .line 31
    .line 32
    :cond_2
    :goto_0
    return-void
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/media3/common/d1;->getVideoSize()Landroidx/media3/common/d2;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, Landroidx/media3/common/d2;->d:Landroidx/media3/common/d2;

    .line 11
    .line 12
    :goto_0
    iget v1, v0, Landroidx/media3/common/d2;->a:I

    .line 13
    .line 14
    iget v2, v0, Landroidx/media3/common/d2;->b:I

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    int-to-float v1, v1

    .line 23
    iget v0, v0, Landroidx/media3/common/d2;->c:F

    .line 24
    .line 25
    mul-float/2addr v1, v0

    .line 26
    int-to-float v0, v2

    .line 27
    div-float/2addr v1, v0

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    :goto_1
    move v1, v3

    .line 30
    :goto_2
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->n:Z

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_3
    move v3, v1

    .line 36
    :goto_3
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->k:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 37
    .line 38
    if-eqz v0, :cond_4

    .line 39
    .line 40
    invoke-virtual {v0, v3}, Landroidx/media3/ui/AspectRatioFrameLayout;->setAspectRatio(F)V

    .line 41
    .line 42
    .line 43
    :cond_4
    return-void
.end method

.method public final k()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->s:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-interface {v1}, Landroidx/media3/common/d1;->getPlaybackState()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v3, 0x2

    .line 15
    if-ne v1, v3, :cond_0

    .line 16
    .line 17
    iget v1, p0, Landroidx/media3/ui/PlayerView;->H:I

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    if-eq v1, v3, :cond_1

    .line 21
    .line 22
    if-ne v1, v4, :cond_0

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 25
    .line 26
    invoke-interface {v1}, Landroidx/media3/common/d1;->getPlayWhenReady()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v4, v2

    .line 34
    :cond_1
    :goto_0
    if-eqz v4, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    const/16 v2, 0x8

    .line 38
    .line 39
    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    :cond_3
    return-void
.end method

.method public final l()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 3
    .line 4
    if-eqz v1, :cond_3

    .line 5
    .line 6
    iget-boolean v2, p0, Landroidx/media3/ui/PlayerView;->C:Z

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v1}, Lw2/o;->g()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    iget-boolean v1, p0, Landroidx/media3/ui/PlayerView;->N:Z

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const v1, 0x7f110050

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const v1, 0x7f11005e

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    :goto_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final m()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->t:Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->J:Ljava/lang/CharSequence;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {v1}, Landroidx/media3/common/d1;->getPlayerError()Landroidx/media3/common/x0;

    .line 22
    .line 23
    .line 24
    :cond_1
    const/16 v1, 0x8

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    :cond_2
    return-void
.end method

.method public final n(Z)V
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, v1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Landroidx/media3/common/d1;->getCurrentTracks()Landroidx/media3/common/x1;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    iget-object v4, v4, Landroidx/media3/common/x1;->a:Lf6/m0;

    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    move v4, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v4, v3

    .line 30
    :goto_0
    iget-boolean v5, p0, Landroidx/media3/ui/PlayerView;->I:Z

    .line 31
    .line 32
    const v6, 0x106000d

    .line 33
    .line 34
    .line 35
    const/4 v7, 0x4

    .line 36
    iget-object v8, p0, Landroidx/media3/ui/PlayerView;->q:Landroid/widget/ImageView;

    .line 37
    .line 38
    iget-object v9, p0, Landroidx/media3/ui/PlayerView;->l:Landroid/view/View;

    .line 39
    .line 40
    if-nez v5, :cond_4

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    if-eqz p1, :cond_4

    .line 45
    .line 46
    :cond_1
    if-eqz v8, :cond_2

    .line 47
    .line 48
    invoke-virtual {v8, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v8, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    :cond_2
    if-eqz v9, :cond_3

    .line 55
    .line 56
    invoke-virtual {v9, v3}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->c()V

    .line 60
    .line 61
    .line 62
    :cond_4
    if-nez v4, :cond_5

    .line 63
    .line 64
    goto/16 :goto_6

    .line 65
    .line 66
    :cond_5
    iget-object p1, p0, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 67
    .line 68
    if-eqz p1, :cond_6

    .line 69
    .line 70
    invoke-interface {p1, v1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_6

    .line 75
    .line 76
    invoke-interface {p1}, Landroidx/media3/common/d1;->getCurrentTracks()Landroidx/media3/common/x1;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const/4 v1, 0x2

    .line 81
    invoke-virtual {p1, v1}, Landroidx/media3/common/x1;->a(I)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_6

    .line 86
    .line 87
    move p1, v2

    .line 88
    goto :goto_1

    .line 89
    :cond_6
    move p1, v3

    .line 90
    :goto_1
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->b()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez p1, :cond_8

    .line 95
    .line 96
    if-nez v1, :cond_8

    .line 97
    .line 98
    if-eqz v9, :cond_7

    .line 99
    .line 100
    invoke-virtual {v9, v3}, Landroid/view/View;->setVisibility(I)V

    .line 101
    .line 102
    .line 103
    :cond_7
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->c()V

    .line 104
    .line 105
    .line 106
    :cond_8
    iget-object v4, p0, Landroidx/media3/ui/PlayerView;->p:Landroid/widget/ImageView;

    .line 107
    .line 108
    if-eqz v9, :cond_a

    .line 109
    .line 110
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    if-ne v5, v7, :cond_a

    .line 115
    .line 116
    if-nez v4, :cond_9

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_9
    invoke-virtual {v4}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    if-eqz v5, :cond_a

    .line 124
    .line 125
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getAlpha()I

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-eqz v5, :cond_a

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_a
    :goto_2
    move v2, v3

    .line 133
    :goto_3
    if-eqz v1, :cond_c

    .line 134
    .line 135
    if-nez p1, :cond_c

    .line 136
    .line 137
    if-eqz v2, :cond_c

    .line 138
    .line 139
    if-eqz v9, :cond_b

    .line 140
    .line 141
    invoke-virtual {v9, v3}, Landroid/view/View;->setVisibility(I)V

    .line 142
    .line 143
    .line 144
    :cond_b
    if-eqz v4, :cond_d

    .line 145
    .line 146
    invoke-virtual {v4, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->o()V

    .line 150
    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_c
    if-eqz p1, :cond_d

    .line 154
    .line 155
    if-nez v1, :cond_d

    .line 156
    .line 157
    if-eqz v2, :cond_d

    .line 158
    .line 159
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->c()V

    .line 160
    .line 161
    .line 162
    :cond_d
    :goto_4
    if-nez p1, :cond_12

    .line 163
    .line 164
    if-nez v1, :cond_12

    .line 165
    .line 166
    iget p1, p0, Landroidx/media3/ui/PlayerView;->E:I

    .line 167
    .line 168
    if-eqz p1, :cond_12

    .line 169
    .line 170
    invoke-static {v8}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    if-eqz v0, :cond_10

    .line 174
    .line 175
    const/16 p1, 0x12

    .line 176
    .line 177
    invoke-interface {v0, p1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    if-nez p1, :cond_e

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_e
    invoke-interface {v0}, Landroidx/media3/common/d1;->getMediaMetadata()Landroidx/media3/common/r0;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    iget-object p1, p1, Landroidx/media3/common/r0;->k:[B

    .line 189
    .line 190
    if-nez p1, :cond_f

    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_f
    array-length v0, p1

    .line 194
    invoke-static {p1, v3, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 199
    .line 200
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-direct {v0, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0, v0}, Landroidx/media3/ui/PlayerView;->f(Landroid/graphics/drawable/Drawable;)Z

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    :cond_10
    :goto_5
    if-eqz v3, :cond_11

    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_11
    iget-object p1, p0, Landroidx/media3/ui/PlayerView;->G:Landroid/graphics/drawable/Drawable;

    .line 215
    .line 216
    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerView;->f(Landroid/graphics/drawable/Drawable;)Z

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    if-eqz p1, :cond_12

    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_12
    if-eqz v8, :cond_13

    .line 224
    .line 225
    invoke-virtual {v8, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v8, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 229
    .line 230
    .line 231
    :cond_13
    :goto_6
    return-void
.end method

.method public final o()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->p:Landroid/widget/ImageView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-lez v2, :cond_5

    .line 22
    .line 23
    if-gtz v1, :cond_2

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    int-to-float v2, v2

    .line 27
    int-to-float v1, v1

    .line 28
    div-float/2addr v2, v1

    .line 29
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    .line 30
    .line 31
    iget v3, p0, Landroidx/media3/ui/PlayerView;->F:I

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-ne v3, v4, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    int-to-float v1, v1

    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    int-to-float v2, v2

    .line 46
    div-float v2, v1, v2

    .line 47
    .line 48
    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 49
    .line 50
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_4

    .line 55
    .line 56
    iget-object v3, p0, Landroidx/media3/ui/PlayerView;->k:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 57
    .line 58
    if-eqz v3, :cond_4

    .line 59
    .line 60
    invoke-virtual {v3, v2}, Landroidx/media3/ui/AspectRatioFrameLayout;->setAspectRatio(F)V

    .line 61
    .line 62
    .line 63
    :cond_4
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 64
    .line 65
    .line 66
    :cond_5
    :goto_0
    return-void
.end method

.method public final onTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->p()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    iget-object p1, p0, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x1

    .line 13
    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerView;->e(Z)V

    .line 14
    .line 15
    .line 16
    return p1

    .line 17
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method public final p()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->C:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 6
    .line 7
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
.end method

.method public final performClick()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->i()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public setArtworkDisplayMode(I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->q:Landroid/widget/ImageView;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    goto :goto_1

    .line 11
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 12
    :goto_1
    invoke-static {v1}, Lh1/a;->j(Z)V

    .line 13
    .line 14
    .line 15
    iget v1, p0, Landroidx/media3/ui/PlayerView;->E:I

    .line 16
    .line 17
    if-eq v1, p1, :cond_2

    .line 18
    .line 19
    iput p1, p0, Landroidx/media3/ui/PlayerView;->E:I

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroidx/media3/ui/PlayerView;->n(Z)V

    .line 22
    .line 23
    .line 24
    :cond_2
    return-void
.end method

.method public setAspectRatioListener(Lw2/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->k:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/media3/ui/AspectRatioFrameLayout;->setAspectRatioListener(Lw2/a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setControllerAnimationEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lw2/o;->setAnimationEnabled(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setControllerAutoShow(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerView;->L:Z

    .line 2
    .line 3
    return-void
.end method

.method public setControllerHideDuringAds(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerView;->M:Z

    .line 2
    .line 3
    return-void
.end method

.method public setControllerHideOnTouch(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerView;->N:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->l()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setControllerOnFullScreenModeChangedListener(Lw2/g;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lw2/o;->setOnFullScreenModeChangedListener(Lw2/g;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setControllerShowTimeoutMs(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput p1, p0, Landroidx/media3/ui/PlayerView;->K:I

    .line 7
    .line 8
    invoke-virtual {v0}, Lw2/o;->g()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->g()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerView;->h(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public setControllerVisibilityListener(Lw2/n;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    iget-object v0, v0, Lw2/o;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 3
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->D:Lw2/n;

    if-ne v1, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 5
    :cond_1
    iput-object p1, p0, Landroidx/media3/ui/PlayerView;->D:Lw2/n;

    if-eqz p1, :cond_2

    .line 6
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    .line 7
    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerView;->setControllerVisibilityListener(Lw2/w;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public setControllerVisibilityListener(Lw2/w;)V
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerView;->setControllerVisibilityListener(Lw2/n;)V

    :cond_0
    return-void
.end method

.method public setCustomErrorMessage(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->t:Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/media3/ui/PlayerView;->J:Ljava/lang/CharSequence;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->m()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setDefaultArtwork(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->G:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/media3/ui/PlayerView;->G:Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerView;->n(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setEnableComposeSurfaceSyncWorkaround(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerView;->O:Z

    .line 2
    .line 3
    return-void
.end method

.method public setErrorMessageProvider(Landroidx/media3/common/t;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/t;",
            ")V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->m()V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public setFullscreenButtonClickListener(Lw2/x;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 2
    .line 3
    invoke-static {p1}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->j:Lw2/v;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lw2/o;->setOnFullScreenModeChangedListener(Lw2/g;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setFullscreenButtonState(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lw2/o;->k(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setImageDisplayMode(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->p:Landroid/widget/ImageView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Landroidx/media3/ui/PlayerView;->F:I

    .line 12
    .line 13
    if-eq v0, p1, :cond_1

    .line 14
    .line 15
    iput p1, p0, Landroidx/media3/ui/PlayerView;->F:I

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->o()V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public setKeepContentOnPlayerReset(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->I:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerView;->I:Z

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerView;->n(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setPlayer(Landroidx/media3/common/d1;)V
    .locals 9

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    move v0, v3

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v2

    .line 16
    :goto_0
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 17
    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    invoke-interface {p1}, Landroidx/media3/common/d1;->getApplicationLooper()Landroid/os/Looper;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-ne v0, v1, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v0, v2

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    :goto_1
    move v0, v3

    .line 35
    :goto_2
    invoke-static {v0}, Lh1/a;->d(Z)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 39
    .line 40
    if-ne v0, p1, :cond_3

    .line 41
    .line 42
    goto/16 :goto_a

    .line 43
    .line 44
    :cond_3
    const/4 v1, 0x0

    .line 45
    iget-object v4, p0, Landroidx/media3/ui/PlayerView;->m:Landroid/view/View;

    .line 46
    .line 47
    const/16 v5, 0x1b

    .line 48
    .line 49
    iget-object v6, p0, Landroidx/media3/ui/PlayerView;->j:Lw2/v;

    .line 50
    .line 51
    if-eqz v0, :cond_6

    .line 52
    .line 53
    invoke-interface {v0, v6}, Landroidx/media3/common/d1;->removeListener(Landroidx/media3/common/b1;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v0, v5}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_5

    .line 61
    .line 62
    instance-of v7, v4, Landroid/view/TextureView;

    .line 63
    .line 64
    if-eqz v7, :cond_4

    .line 65
    .line 66
    move-object v7, v4

    .line 67
    check-cast v7, Landroid/view/TextureView;

    .line 68
    .line 69
    invoke-interface {v0, v7}, Landroidx/media3/common/d1;->clearVideoTextureView(Landroid/view/TextureView;)V

    .line 70
    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    instance-of v7, v4, Landroid/view/SurfaceView;

    .line 74
    .line 75
    if-eqz v7, :cond_5

    .line 76
    .line 77
    move-object v7, v4

    .line 78
    check-cast v7, Landroid/view/SurfaceView;

    .line 79
    .line 80
    invoke-interface {v0, v7}, Landroidx/media3/common/d1;->clearVideoSurfaceView(Landroid/view/SurfaceView;)V

    .line 81
    .line 82
    .line 83
    :cond_5
    :goto_3
    iget-object v7, p0, Landroidx/media3/ui/PlayerView;->y:Ljava/lang/Class;

    .line 84
    .line 85
    if-eqz v7, :cond_6

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    invoke-virtual {v7, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-eqz v7, :cond_6

    .line 96
    .line 97
    :try_start_0
    iget-object v7, p0, Landroidx/media3/ui/PlayerView;->z:Ljava/lang/reflect/Method;

    .line 98
    .line 99
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    invoke-virtual {v7, v0, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    .line 108
    .line 109
    goto :goto_5

    .line 110
    :catch_0
    move-exception p1

    .line 111
    goto :goto_4

    .line 112
    :catch_1
    move-exception p1

    .line 113
    :goto_4
    new-instance v0, Ljava/lang/RuntimeException;

    .line 114
    .line 115
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    throw v0

    .line 119
    :cond_6
    :goto_5
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->r:Landroidx/media3/ui/SubtitleView;

    .line 120
    .line 121
    if-eqz v0, :cond_7

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Landroidx/media3/ui/SubtitleView;->setCues(Ljava/util/List;)V

    .line 124
    .line 125
    .line 126
    :cond_7
    iput-object p1, p0, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 127
    .line 128
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->p()Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    iget-object v7, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 133
    .line 134
    if-eqz v1, :cond_8

    .line 135
    .line 136
    invoke-virtual {v7, p1}, Lw2/o;->setPlayer(Landroidx/media3/common/d1;)V

    .line 137
    .line 138
    .line 139
    :cond_8
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->k()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->m()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, v3}, Landroidx/media3/ui/PlayerView;->n(Z)V

    .line 146
    .line 147
    .line 148
    if-eqz p1, :cond_11

    .line 149
    .line 150
    invoke-interface {p1, v5}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_f

    .line 155
    .line 156
    instance-of v1, v4, Landroid/view/TextureView;

    .line 157
    .line 158
    if-eqz v1, :cond_9

    .line 159
    .line 160
    check-cast v4, Landroid/view/TextureView;

    .line 161
    .line 162
    invoke-interface {p1, v4}, Landroidx/media3/common/d1;->setVideoTextureView(Landroid/view/TextureView;)V

    .line 163
    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_9
    instance-of v1, v4, Landroid/view/SurfaceView;

    .line 167
    .line 168
    if-eqz v1, :cond_a

    .line 169
    .line 170
    check-cast v4, Landroid/view/SurfaceView;

    .line 171
    .line 172
    invoke-interface {p1, v4}, Landroidx/media3/common/d1;->setVideoSurfaceView(Landroid/view/SurfaceView;)V

    .line 173
    .line 174
    .line 175
    :cond_a
    :goto_6
    const/16 v1, 0x1e

    .line 176
    .line 177
    invoke-interface {p1, v1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-eqz v1, :cond_e

    .line 182
    .line 183
    invoke-interface {p1}, Landroidx/media3/common/d1;->getCurrentTracks()Landroidx/media3/common/x1;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    iget-object v1, v1, Landroidx/media3/common/x1;->a:Lf6/m0;

    .line 188
    .line 189
    const/4 v3, 0x0

    .line 190
    move v4, v3

    .line 191
    :goto_7
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-ge v4, v5, :cond_d

    .line 196
    .line 197
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    check-cast v5, Landroidx/media3/common/w1;

    .line 202
    .line 203
    iget-object v5, v5, Landroidx/media3/common/w1;->b:Landroidx/media3/common/q1;

    .line 204
    .line 205
    iget v5, v5, Landroidx/media3/common/q1;->c:I

    .line 206
    .line 207
    const/4 v7, 0x2

    .line 208
    if-ne v5, v7, :cond_c

    .line 209
    .line 210
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    check-cast v5, Landroidx/media3/common/w1;

    .line 215
    .line 216
    move v7, v3

    .line 217
    :goto_8
    iget-object v8, v5, Landroidx/media3/common/w1;->d:[I

    .line 218
    .line 219
    array-length v8, v8

    .line 220
    if-ge v7, v8, :cond_c

    .line 221
    .line 222
    invoke-virtual {v5, v7}, Landroidx/media3/common/w1;->b(I)Z

    .line 223
    .line 224
    .line 225
    move-result v8

    .line 226
    if-eqz v8, :cond_b

    .line 227
    .line 228
    const/4 v3, 0x1

    .line 229
    goto :goto_9

    .line 230
    :cond_b
    add-int/lit8 v7, v7, 0x1

    .line 231
    .line 232
    goto :goto_8

    .line 233
    :cond_c
    add-int/lit8 v4, v4, 0x1

    .line 234
    .line 235
    goto :goto_7

    .line 236
    :cond_d
    :goto_9
    if-eqz v3, :cond_f

    .line 237
    .line 238
    :cond_e
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->j()V

    .line 239
    .line 240
    .line 241
    :cond_f
    if-eqz v0, :cond_10

    .line 242
    .line 243
    const/16 v1, 0x1c

    .line 244
    .line 245
    invoke-interface {p1, v1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    if-eqz v1, :cond_10

    .line 250
    .line 251
    invoke-interface {p1}, Landroidx/media3/common/d1;->getCurrentCues()Lg1/c;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    iget-object v1, v1, Lg1/c;->a:Lf6/m0;

    .line 256
    .line 257
    invoke-virtual {v0, v1}, Landroidx/media3/ui/SubtitleView;->setCues(Ljava/util/List;)V

    .line 258
    .line 259
    .line 260
    :cond_10
    invoke-interface {p1, v6}, Landroidx/media3/common/d1;->addListener(Landroidx/media3/common/b1;)V

    .line 261
    .line 262
    .line 263
    invoke-direct {p0, p1}, Landroidx/media3/ui/PlayerView;->setImageOutput(Landroidx/media3/common/d1;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p0, v2}, Landroidx/media3/ui/PlayerView;->e(Z)V

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    :cond_11
    if-eqz v7, :cond_12

    .line 271
    .line 272
    invoke-virtual {v7}, Lw2/o;->f()V

    .line 273
    .line 274
    .line 275
    :cond_12
    :goto_a
    return-void
.end method

.method public setRepeatToggleModes(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lw2/o;->setRepeatToggleModes(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setResizeMode(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->k:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/media3/ui/AspectRatioFrameLayout;->setResizeMode(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setShowBuffering(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/ui/PlayerView;->H:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Landroidx/media3/ui/PlayerView;->H:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->k()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setShowFastForwardButton(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lw2/o;->setShowFastForwardButton(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setShowMultiWindowTimeBar(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lw2/o;->setShowMultiWindowTimeBar(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setShowNextButton(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lw2/o;->setShowNextButton(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setShowPlayButtonIfPlaybackIsSuppressed(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lw2/o;->setShowPlayButtonIfPlaybackIsSuppressed(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setShowPreviousButton(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lw2/o;->setShowPreviousButton(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setShowRewindButton(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lw2/o;->setShowRewindButton(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setShowShuffleButton(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lw2/o;->setShowShuffleButton(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setShowSubtitleButton(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lw2/o;->setShowSubtitleButton(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setShowVrButton(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 2
    .line 3
    invoke-static {v0}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lw2/o;->setShowVrButton(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setShutterBackgroundColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->l:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setUseArtwork(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    xor-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerView;->setArtworkDisplayMode(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setUseController(Z)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, Landroidx/media3/ui/PlayerView;->u:Lw2/o;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v3, v1

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    move v3, v0

    .line 13
    :goto_1
    invoke-static {v3}, Lh1/a;->j(Z)V

    .line 14
    .line 15
    .line 16
    if-nez p1, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->hasOnClickListeners()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_2

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_2
    move v0, v1

    .line 26
    :cond_3
    :goto_2
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 27
    .line 28
    .line 29
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->C:Z

    .line 30
    .line 31
    if-ne v0, p1, :cond_4

    .line 32
    .line 33
    return-void

    .line 34
    :cond_4
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerView;->C:Z

    .line 35
    .line 36
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->p()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_5

    .line 41
    .line 42
    iget-object p1, p0, Landroidx/media3/ui/PlayerView;->B:Landroidx/media3/common/d1;

    .line 43
    .line 44
    invoke-virtual {v2, p1}, Lw2/o;->setPlayer(Landroidx/media3/common/d1;)V

    .line 45
    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_5
    if-eqz v2, :cond_6

    .line 49
    .line 50
    invoke-virtual {v2}, Lw2/o;->f()V

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    invoke-virtual {v2, p1}, Lw2/o;->setPlayer(Landroidx/media3/common/d1;)V

    .line 55
    .line 56
    .line 57
    :cond_6
    :goto_3
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->l()V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public setVisibility(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->m:Landroid/view/View;

    .line 5
    .line 6
    instance-of v1, v0, Landroid/view/SurfaceView;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method
