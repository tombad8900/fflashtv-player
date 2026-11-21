.class public final Lw2/o;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final I0:[F


# instance fields
.field public final A:Landroid/widget/TextView;

.field public A0:I

.field public final B:Landroid/widget/TextView;

.field public B0:I

.field public final C:Landroid/widget/ImageView;

.field public C0:[J

.field public final D:Landroid/widget/ImageView;

.field public D0:[Z

.field public final E:Landroid/widget/ImageView;

.field public final E0:[J

.field public final F:Landroid/widget/ImageView;

.field public final F0:[Z

.field public final G:Landroid/widget/ImageView;

.field public G0:J

.field public final H:Landroid/widget/ImageView;

.field public H0:Z

.field public final I:Landroid/view/View;

.field public final J:Landroid/view/View;

.field public final K:Landroid/view/View;

.field public final L:Landroid/widget/TextView;

.field public final M:Landroid/widget/TextView;

.field public final N:Lw2/g0;

.field public final O:Ljava/lang/StringBuilder;

.field public final P:Ljava/util/Formatter;

.field public final Q:Landroidx/media3/common/m1;

.field public final R:Landroidx/media3/common/o1;

.field public final S:Landroidx/lifecycle/c0;

.field public final T:Landroid/graphics/drawable/Drawable;

.field public final U:Landroid/graphics/drawable/Drawable;

.field public final V:Landroid/graphics/drawable/Drawable;

.field public final W:Landroid/graphics/drawable/Drawable;

.field public final a0:Landroid/graphics/drawable/Drawable;

.field public final b0:Ljava/lang/String;

.field public final c0:Ljava/lang/String;

.field public final d0:Ljava/lang/String;

.field public final e0:Landroid/graphics/drawable/Drawable;

.field public final f0:Landroid/graphics/drawable/Drawable;

.field public final g0:F

.field public final h0:F

.field public final i0:Ljava/lang/String;

.field public final j:Lw2/t;

.field public final j0:Ljava/lang/String;

.field public final k:Landroid/content/res/Resources;

.field public final k0:Landroid/graphics/drawable/Drawable;

.field public final l:Lw2/f;

.field public final l0:Landroid/graphics/drawable/Drawable;

.field public final m:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final m0:Ljava/lang/String;

.field public final n:Landroidx/recyclerview/widget/RecyclerView;

.field public final n0:Ljava/lang/String;

.field public final o:Lc5/t;

.field public final o0:Landroid/graphics/drawable/Drawable;

.field public final p:Lw2/h;

.field public final p0:Landroid/graphics/drawable/Drawable;

.field public final q:Lw2/e;

.field public final q0:Ljava/lang/String;

.field public final r:Lw2/e;

.field public final r0:Ljava/lang/String;

.field public final s:Le4/y;

.field public s0:Landroidx/media3/common/d1;

.field public final t:Landroid/widget/PopupWindow;

.field public t0:Z

.field public final u:I

.field public u0:Z

.field public final v:Landroid/widget/ImageView;

.field public v0:Z

.field public final w:Landroid/widget/ImageView;

.field public w0:Z

.field public final x:Landroid/widget/ImageView;

.field public x0:Z

.field public final y:Landroid/view/View;

.field public y0:Z

.field public final z:Landroid/view/View;

.field public z0:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "media3.ui"

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/media3/common/p0;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x7

    .line 7
    new-array v0, v0, [F

    .line 8
    .line 9
    fill-array-data v0, :array_0

    .line 10
    .line 11
    .line 12
    sput-object v0, Lw2/o;->I0:[F

    .line 13
    .line 14
    return-void

    .line 15
    :array_0
    .array-data 4
        0x3e800000    # 0.25f
        0x3f000000    # 0.5f
        0x3f400000    # 0.75f
        0x3f800000    # 1.0f
        0x3fa00000    # 1.25f
        0x3fc00000    # 1.5f
        0x40000000    # 2.0f
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 45

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    const/4 v9, 0x0

    .line 8
    const/4 v10, 0x0

    .line 9
    invoke-direct {v1, v2, v9, v10}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 10
    .line 11
    .line 12
    const/4 v11, 0x1

    .line 13
    iput-boolean v11, v1, Lw2/o;->w0:Z

    .line 14
    .line 15
    const/16 v3, 0x1388

    .line 16
    .line 17
    iput v3, v1, Lw2/o;->z0:I

    .line 18
    .line 19
    iput v10, v1, Lw2/o;->B0:I

    .line 20
    .line 21
    const/16 v3, 0xc8

    .line 22
    .line 23
    iput v3, v1, Lw2/o;->A0:I

    .line 24
    .line 25
    const/16 v3, 0x14

    .line 26
    .line 27
    const v5, 0x7f0d0033

    .line 28
    .line 29
    .line 30
    const v6, 0x7f0800dc

    .line 31
    .line 32
    .line 33
    const v7, 0x7f0800db

    .line 34
    .line 35
    .line 36
    const v8, 0x7f0800d8

    .line 37
    .line 38
    .line 39
    const v12, 0x7f0800e5

    .line 40
    .line 41
    .line 42
    const v13, 0x7f0800dd

    .line 43
    .line 44
    .line 45
    const v14, 0x7f0800e6

    .line 46
    .line 47
    .line 48
    const v15, 0x7f0800d7

    .line 49
    .line 50
    .line 51
    const v9, 0x7f0800d6

    .line 52
    .line 53
    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 57
    .line 58
    .line 59
    move-result-object v11

    .line 60
    sget-object v4, Lw2/a0;->c:[I

    .line 61
    .line 62
    invoke-virtual {v11, v0, v4, v10, v10}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    const/4 v11, 0x6

    .line 67
    :try_start_0
    invoke-virtual {v4, v11, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    const/16 v11, 0xc

    .line 72
    .line 73
    invoke-virtual {v4, v11, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    const/16 v11, 0xb

    .line 78
    .line 79
    invoke-virtual {v4, v11, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    const/16 v11, 0xa

    .line 84
    .line 85
    invoke-virtual {v4, v11, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    const/4 v11, 0x7

    .line 90
    invoke-virtual {v4, v11, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 91
    .line 92
    .line 93
    move-result v12

    .line 94
    const/16 v11, 0xf

    .line 95
    .line 96
    invoke-virtual {v4, v11, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    invoke-virtual {v4, v3, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 101
    .line 102
    .line 103
    move-result v14

    .line 104
    const/16 v11, 0x9

    .line 105
    .line 106
    invoke-virtual {v4, v11, v15}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 107
    .line 108
    .line 109
    move-result v15

    .line 110
    const/16 v11, 0x8

    .line 111
    .line 112
    invoke-virtual {v4, v11, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 113
    .line 114
    .line 115
    move-result v9

    .line 116
    const/16 v11, 0x11

    .line 117
    .line 118
    const v3, 0x7f0800df

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4, v11, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    const/16 v3, 0x12

    .line 126
    .line 127
    const v10, 0x7f0800e0

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4, v3, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    const/16 v10, 0x10

    .line 135
    .line 136
    move/from16 v16, v3

    .line 137
    .line 138
    const v3, 0x7f0800de

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4, v10, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    const/16 v10, 0x23

    .line 146
    .line 147
    move/from16 v17, v3

    .line 148
    .line 149
    const v3, 0x7f0800e4

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4, v10, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    const/16 v10, 0x22

    .line 157
    .line 158
    move/from16 v18, v3

    .line 159
    .line 160
    const v3, 0x7f0800e3

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4, v10, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    const/16 v10, 0x25

    .line 168
    .line 169
    move/from16 v19, v3

    .line 170
    .line 171
    const v3, 0x7f0800e9

    .line 172
    .line 173
    .line 174
    invoke-virtual {v4, v10, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    const/16 v10, 0x24

    .line 179
    .line 180
    move/from16 v20, v3

    .line 181
    .line 182
    const v3, 0x7f0800e8

    .line 183
    .line 184
    .line 185
    invoke-virtual {v4, v10, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    const/16 v10, 0x29

    .line 190
    .line 191
    move/from16 v21, v3

    .line 192
    .line 193
    const v3, 0x7f0800ea

    .line 194
    .line 195
    .line 196
    invoke-virtual {v4, v10, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    iget v10, v1, Lw2/o;->z0:I

    .line 201
    .line 202
    move/from16 v22, v3

    .line 203
    .line 204
    const/16 v3, 0x20

    .line 205
    .line 206
    invoke-virtual {v4, v3, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    iput v3, v1, Lw2/o;->z0:I

    .line 211
    .line 212
    iget v3, v1, Lw2/o;->B0:I

    .line 213
    .line 214
    const/16 v10, 0x13

    .line 215
    .line 216
    invoke-virtual {v4, v10, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    iput v3, v1, Lw2/o;->B0:I

    .line 221
    .line 222
    const/16 v3, 0x1d

    .line 223
    .line 224
    const/4 v10, 0x1

    .line 225
    invoke-virtual {v4, v3, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    move/from16 v25, v3

    .line 230
    .line 231
    const/16 v3, 0x1a

    .line 232
    .line 233
    invoke-virtual {v4, v3, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    move/from16 v26, v3

    .line 238
    .line 239
    const/16 v3, 0x1c

    .line 240
    .line 241
    invoke-virtual {v4, v3, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    move/from16 v27, v3

    .line 246
    .line 247
    const/16 v3, 0x1b

    .line 248
    .line 249
    invoke-virtual {v4, v3, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    const/16 v10, 0x1e

    .line 254
    .line 255
    move/from16 v28, v3

    .line 256
    .line 257
    const/4 v3, 0x0

    .line 258
    invoke-virtual {v4, v10, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 259
    .line 260
    .line 261
    move-result v10

    .line 262
    move/from16 v29, v5

    .line 263
    .line 264
    const/16 v5, 0x1f

    .line 265
    .line 266
    invoke-virtual {v4, v5, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 267
    .line 268
    .line 269
    move-result v5

    .line 270
    move/from16 v30, v5

    .line 271
    .line 272
    const/16 v5, 0x21

    .line 273
    .line 274
    invoke-virtual {v4, v5, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    iget v3, v1, Lw2/o;->A0:I

    .line 279
    .line 280
    move/from16 v31, v5

    .line 281
    .line 282
    const/16 v5, 0x26

    .line 283
    .line 284
    invoke-virtual {v4, v5, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    invoke-virtual {v1, v3}, Lw2/o;->setTimeBarMinUpdateInterval(I)V

    .line 289
    .line 290
    .line 291
    const/4 v3, 0x2

    .line 292
    const/4 v5, 0x1

    .line 293
    invoke-virtual {v4, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 294
    .line 295
    .line 296
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 297
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 298
    .line 299
    .line 300
    move v4, v12

    .line 301
    move v12, v6

    .line 302
    move v6, v4

    .line 303
    move v4, v13

    .line 304
    move v13, v7

    .line 305
    move v7, v4

    .line 306
    move/from16 v34, v3

    .line 307
    .line 308
    move v4, v11

    .line 309
    move/from16 v32, v14

    .line 310
    .line 311
    move/from16 v33, v15

    .line 312
    .line 313
    move/from16 v15, v25

    .line 314
    .line 315
    move/from16 v5, v29

    .line 316
    .line 317
    move/from16 v11, v31

    .line 318
    .line 319
    move v14, v9

    .line 320
    move/from16 v9, v30

    .line 321
    .line 322
    goto :goto_0

    .line 323
    :catchall_0
    move-exception v0

    .line 324
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 325
    .line 326
    .line 327
    throw v0

    .line 328
    :cond_0
    const v3, 0x7f0800ea

    .line 329
    .line 330
    .line 331
    const v4, 0x7f0800df

    .line 332
    .line 333
    .line 334
    const v10, 0x7f0800e0

    .line 335
    .line 336
    .line 337
    const v17, 0x7f0800de

    .line 338
    .line 339
    .line 340
    const v18, 0x7f0800e4

    .line 341
    .line 342
    .line 343
    const v19, 0x7f0800e3

    .line 344
    .line 345
    .line 346
    const v20, 0x7f0800e9

    .line 347
    .line 348
    .line 349
    const v21, 0x7f0800e8

    .line 350
    .line 351
    .line 352
    move v11, v12

    .line 353
    move v12, v6

    .line 354
    move v6, v11

    .line 355
    move v11, v13

    .line 356
    move v13, v7

    .line 357
    move v7, v11

    .line 358
    move/from16 v22, v3

    .line 359
    .line 360
    move/from16 v16, v10

    .line 361
    .line 362
    move/from16 v32, v14

    .line 363
    .line 364
    move/from16 v33, v15

    .line 365
    .line 366
    const/4 v10, 0x0

    .line 367
    const/4 v11, 0x0

    .line 368
    const/4 v15, 0x1

    .line 369
    const/16 v26, 0x1

    .line 370
    .line 371
    const/16 v27, 0x1

    .line 372
    .line 373
    const/16 v28, 0x1

    .line 374
    .line 375
    const/16 v34, 0x1

    .line 376
    .line 377
    move v14, v9

    .line 378
    const/4 v9, 0x0

    .line 379
    :goto_0
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    invoke-virtual {v3, v5, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 384
    .line 385
    .line 386
    const/high16 v3, 0x40000

    .line 387
    .line 388
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 389
    .line 390
    .line 391
    new-instance v3, Lw2/f;

    .line 392
    .line 393
    invoke-direct {v3, v1}, Lw2/f;-><init>(Lw2/o;)V

    .line 394
    .line 395
    .line 396
    iput-object v3, v1, Lw2/o;->l:Lw2/f;

    .line 397
    .line 398
    new-instance v5, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 399
    .line 400
    invoke-direct {v5}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 401
    .line 402
    .line 403
    iput-object v5, v1, Lw2/o;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 404
    .line 405
    new-instance v5, Landroidx/media3/common/m1;

    .line 406
    .line 407
    invoke-direct {v5}, Landroidx/media3/common/m1;-><init>()V

    .line 408
    .line 409
    .line 410
    iput-object v5, v1, Lw2/o;->Q:Landroidx/media3/common/m1;

    .line 411
    .line 412
    new-instance v5, Landroidx/media3/common/o1;

    .line 413
    .line 414
    invoke-direct {v5}, Landroidx/media3/common/o1;-><init>()V

    .line 415
    .line 416
    .line 417
    iput-object v5, v1, Lw2/o;->R:Landroidx/media3/common/o1;

    .line 418
    .line 419
    new-instance v5, Ljava/lang/StringBuilder;

    .line 420
    .line 421
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 422
    .line 423
    .line 424
    iput-object v5, v1, Lw2/o;->O:Ljava/lang/StringBuilder;

    .line 425
    .line 426
    move/from16 v25, v4

    .line 427
    .line 428
    new-instance v4, Ljava/util/Formatter;

    .line 429
    .line 430
    move/from16 v29, v6

    .line 431
    .line 432
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 433
    .line 434
    .line 435
    move-result-object v6

    .line 436
    invoke-direct {v4, v5, v6}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    .line 437
    .line 438
    .line 439
    iput-object v4, v1, Lw2/o;->P:Ljava/util/Formatter;

    .line 440
    .line 441
    const/4 v4, 0x0

    .line 442
    new-array v5, v4, [J

    .line 443
    .line 444
    iput-object v5, v1, Lw2/o;->C0:[J

    .line 445
    .line 446
    new-array v5, v4, [Z

    .line 447
    .line 448
    iput-object v5, v1, Lw2/o;->D0:[Z

    .line 449
    .line 450
    new-array v5, v4, [J

    .line 451
    .line 452
    iput-object v5, v1, Lw2/o;->E0:[J

    .line 453
    .line 454
    new-array v5, v4, [Z

    .line 455
    .line 456
    iput-object v5, v1, Lw2/o;->F0:[Z

    .line 457
    .line 458
    new-instance v4, Landroidx/lifecycle/c0;

    .line 459
    .line 460
    const/16 v5, 0x14

    .line 461
    .line 462
    invoke-direct {v4, v5, v1}, Landroidx/lifecycle/c0;-><init>(ILjava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    iput-object v4, v1, Lw2/o;->S:Landroidx/lifecycle/c0;

    .line 466
    .line 467
    const v4, 0x7f0a00ec

    .line 468
    .line 469
    .line 470
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 471
    .line 472
    .line 473
    move-result-object v4

    .line 474
    check-cast v4, Landroid/widget/TextView;

    .line 475
    .line 476
    iput-object v4, v1, Lw2/o;->L:Landroid/widget/TextView;

    .line 477
    .line 478
    const v4, 0x7f0a0100

    .line 479
    .line 480
    .line 481
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 482
    .line 483
    .line 484
    move-result-object v4

    .line 485
    check-cast v4, Landroid/widget/TextView;

    .line 486
    .line 487
    iput-object v4, v1, Lw2/o;->M:Landroid/widget/TextView;

    .line 488
    .line 489
    const v4, 0x7f0a010c

    .line 490
    .line 491
    .line 492
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 493
    .line 494
    .line 495
    move-result-object v4

    .line 496
    check-cast v4, Landroid/widget/ImageView;

    .line 497
    .line 498
    iput-object v4, v1, Lw2/o;->F:Landroid/widget/ImageView;

    .line 499
    .line 500
    if-eqz v4, :cond_1

    .line 501
    .line 502
    invoke-virtual {v4, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 503
    .line 504
    .line 505
    :cond_1
    const v5, 0x7f0a00f2

    .line 506
    .line 507
    .line 508
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 509
    .line 510
    .line 511
    move-result-object v5

    .line 512
    check-cast v5, Landroid/widget/ImageView;

    .line 513
    .line 514
    iput-object v5, v1, Lw2/o;->G:Landroid/widget/ImageView;

    .line 515
    .line 516
    new-instance v6, Lb6/a;

    .line 517
    .line 518
    move-object/from16 v24, v4

    .line 519
    .line 520
    const/4 v4, 0x5

    .line 521
    invoke-direct {v6, v4, v1}, Lb6/a;-><init>(ILjava/lang/Object;)V

    .line 522
    .line 523
    .line 524
    if-nez v5, :cond_2

    .line 525
    .line 526
    const/16 v4, 0x8

    .line 527
    .line 528
    goto :goto_1

    .line 529
    :cond_2
    const/16 v4, 0x8

    .line 530
    .line 531
    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 535
    .line 536
    .line 537
    :goto_1
    const v5, 0x7f0a00f7

    .line 538
    .line 539
    .line 540
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 541
    .line 542
    .line 543
    move-result-object v5

    .line 544
    check-cast v5, Landroid/widget/ImageView;

    .line 545
    .line 546
    iput-object v5, v1, Lw2/o;->H:Landroid/widget/ImageView;

    .line 547
    .line 548
    new-instance v6, Lb6/a;

    .line 549
    .line 550
    const/4 v4, 0x5

    .line 551
    invoke-direct {v6, v4, v1}, Lb6/a;-><init>(ILjava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    if-nez v5, :cond_3

    .line 555
    .line 556
    goto :goto_2

    .line 557
    :cond_3
    const/16 v4, 0x8

    .line 558
    .line 559
    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 563
    .line 564
    .line 565
    :goto_2
    const v4, 0x7f0a0107

    .line 566
    .line 567
    .line 568
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 569
    .line 570
    .line 571
    move-result-object v4

    .line 572
    iput-object v4, v1, Lw2/o;->I:Landroid/view/View;

    .line 573
    .line 574
    if-eqz v4, :cond_4

    .line 575
    .line 576
    invoke-virtual {v4, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 577
    .line 578
    .line 579
    :cond_4
    const v4, 0x7f0a00ff

    .line 580
    .line 581
    .line 582
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 583
    .line 584
    .line 585
    move-result-object v4

    .line 586
    iput-object v4, v1, Lw2/o;->J:Landroid/view/View;

    .line 587
    .line 588
    if-eqz v4, :cond_5

    .line 589
    .line 590
    invoke-virtual {v4, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 591
    .line 592
    .line 593
    :cond_5
    const v4, 0x7f0a00e2

    .line 594
    .line 595
    .line 596
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 597
    .line 598
    .line 599
    move-result-object v4

    .line 600
    iput-object v4, v1, Lw2/o;->K:Landroid/view/View;

    .line 601
    .line 602
    if-eqz v4, :cond_6

    .line 603
    .line 604
    invoke-virtual {v4, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 605
    .line 606
    .line 607
    :cond_6
    const v4, 0x7f0a0102

    .line 608
    .line 609
    .line 610
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 611
    .line 612
    .line 613
    move-result-object v5

    .line 614
    check-cast v5, Lw2/g0;

    .line 615
    .line 616
    const v6, 0x7f0a0103

    .line 617
    .line 618
    .line 619
    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 620
    .line 621
    .line 622
    move-result-object v6

    .line 623
    if-eqz v5, :cond_7

    .line 624
    .line 625
    iput-object v5, v1, Lw2/o;->N:Lw2/g0;

    .line 626
    .line 627
    goto :goto_3

    .line 628
    :cond_7
    if-eqz v6, :cond_8

    .line 629
    .line 630
    new-instance v5, Lw2/d;

    .line 631
    .line 632
    invoke-direct {v5, v2, v0}, Lw2/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 633
    .line 634
    .line 635
    invoke-virtual {v5, v4}, Landroid/view/View;->setId(I)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 643
    .line 644
    .line 645
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    check-cast v0, Landroid/view/ViewGroup;

    .line 650
    .line 651
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 652
    .line 653
    .line 654
    move-result v4

    .line 655
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v0, v5, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 659
    .line 660
    .line 661
    iput-object v5, v1, Lw2/o;->N:Lw2/g0;

    .line 662
    .line 663
    goto :goto_3

    .line 664
    :cond_8
    const/4 v0, 0x0

    .line 665
    iput-object v0, v1, Lw2/o;->N:Lw2/g0;

    .line 666
    .line 667
    :goto_3
    iget-object v0, v1, Lw2/o;->N:Lw2/g0;

    .line 668
    .line 669
    if-eqz v0, :cond_9

    .line 670
    .line 671
    check-cast v0, Lw2/d;

    .line 672
    .line 673
    iget-object v0, v0, Lw2/d;->G:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 674
    .line 675
    invoke-virtual {v0, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 676
    .line 677
    .line 678
    :cond_9
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    iput-object v0, v1, Lw2/o;->k:Landroid/content/res/Resources;

    .line 683
    .line 684
    const v4, 0x7f0a00fe

    .line 685
    .line 686
    .line 687
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 688
    .line 689
    .line 690
    move-result-object v4

    .line 691
    check-cast v4, Landroid/widget/ImageView;

    .line 692
    .line 693
    iput-object v4, v1, Lw2/o;->x:Landroid/widget/ImageView;

    .line 694
    .line 695
    if-eqz v4, :cond_a

    .line 696
    .line 697
    invoke-virtual {v4, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 698
    .line 699
    .line 700
    :cond_a
    const v4, 0x7f0a0101

    .line 701
    .line 702
    .line 703
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 704
    .line 705
    .line 706
    move-result-object v4

    .line 707
    check-cast v4, Landroid/widget/ImageView;

    .line 708
    .line 709
    iput-object v4, v1, Lw2/o;->v:Landroid/widget/ImageView;

    .line 710
    .line 711
    if-eqz v4, :cond_b

    .line 712
    .line 713
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 714
    .line 715
    .line 716
    move-result-object v5

    .line 717
    invoke-virtual {v0, v7, v5}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 718
    .line 719
    .line 720
    move-result-object v5

    .line 721
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v4, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 725
    .line 726
    .line 727
    :cond_b
    const v5, 0x7f0a00f8

    .line 728
    .line 729
    .line 730
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 731
    .line 732
    .line 733
    move-result-object v5

    .line 734
    check-cast v5, Landroid/widget/ImageView;

    .line 735
    .line 736
    iput-object v5, v1, Lw2/o;->w:Landroid/widget/ImageView;

    .line 737
    .line 738
    if-eqz v5, :cond_c

    .line 739
    .line 740
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 741
    .line 742
    .line 743
    move-result-object v6

    .line 744
    invoke-virtual {v0, v8, v6}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 745
    .line 746
    .line 747
    move-result-object v6

    .line 748
    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 749
    .line 750
    .line 751
    invoke-virtual {v5, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 752
    .line 753
    .line 754
    :cond_c
    sget-object v6, Ld0/k;->a:Ljava/lang/ThreadLocal;

    .line 755
    .line 756
    invoke-virtual {v2}, Landroid/content/Context;->isRestricted()Z

    .line 757
    .line 758
    .line 759
    move-result v6

    .line 760
    if-eqz v6, :cond_d

    .line 761
    .line 762
    move-object/from16 v43, v4

    .line 763
    .line 764
    move-object/from16 v44, v5

    .line 765
    .line 766
    move/from16 v35, v11

    .line 767
    .line 768
    move/from16 v36, v17

    .line 769
    .line 770
    move/from16 v37, v18

    .line 771
    .line 772
    move/from16 v38, v19

    .line 773
    .line 774
    move-object/from16 v42, v24

    .line 775
    .line 776
    move/from16 v39, v26

    .line 777
    .line 778
    move/from16 v40, v27

    .line 779
    .line 780
    move/from16 v41, v28

    .line 781
    .line 782
    move/from16 v11, v29

    .line 783
    .line 784
    move/from16 v17, v10

    .line 785
    .line 786
    move/from16 v18, v15

    .line 787
    .line 788
    move/from16 v19, v16

    .line 789
    .line 790
    move/from16 v15, v20

    .line 791
    .line 792
    move/from16 v10, v21

    .line 793
    .line 794
    move/from16 v16, v9

    .line 795
    .line 796
    move/from16 v20, v14

    .line 797
    .line 798
    move/from16 v9, v22

    .line 799
    .line 800
    move-object v14, v3

    .line 801
    const/4 v3, 0x0

    .line 802
    goto :goto_4

    .line 803
    :cond_d
    move-object v6, v4

    .line 804
    new-instance v4, Landroid/util/TypedValue;

    .line 805
    .line 806
    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    .line 807
    .line 808
    .line 809
    const/4 v7, 0x0

    .line 810
    const/4 v8, 0x0

    .line 811
    move-object/from16 v23, v3

    .line 812
    .line 813
    const/high16 v3, 0x7f090000

    .line 814
    .line 815
    move-object/from16 v30, v5

    .line 816
    .line 817
    const/4 v5, 0x0

    .line 818
    move-object/from16 v31, v6

    .line 819
    .line 820
    const/4 v6, 0x0

    .line 821
    move/from16 v35, v11

    .line 822
    .line 823
    move/from16 v36, v17

    .line 824
    .line 825
    move/from16 v37, v18

    .line 826
    .line 827
    move/from16 v38, v19

    .line 828
    .line 829
    move-object/from16 v42, v24

    .line 830
    .line 831
    move/from16 v39, v26

    .line 832
    .line 833
    move/from16 v40, v27

    .line 834
    .line 835
    move/from16 v41, v28

    .line 836
    .line 837
    move/from16 v11, v29

    .line 838
    .line 839
    move-object/from16 v44, v30

    .line 840
    .line 841
    move-object/from16 v43, v31

    .line 842
    .line 843
    move/from16 v17, v10

    .line 844
    .line 845
    move/from16 v18, v15

    .line 846
    .line 847
    move/from16 v19, v16

    .line 848
    .line 849
    move/from16 v15, v20

    .line 850
    .line 851
    move/from16 v10, v21

    .line 852
    .line 853
    move/from16 v16, v9

    .line 854
    .line 855
    move/from16 v20, v14

    .line 856
    .line 857
    move/from16 v9, v22

    .line 858
    .line 859
    move-object/from16 v14, v23

    .line 860
    .line 861
    invoke-static/range {v2 .. v8}, Ld0/k;->a(Landroid/content/Context;ILandroid/util/TypedValue;ILd0/b;ZZ)Landroid/graphics/Typeface;

    .line 862
    .line 863
    .line 864
    move-result-object v3

    .line 865
    :goto_4
    const v2, 0x7f0a0105

    .line 866
    .line 867
    .line 868
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 869
    .line 870
    .line 871
    move-result-object v2

    .line 872
    check-cast v2, Landroid/widget/ImageView;

    .line 873
    .line 874
    const v4, 0x7f0a0106

    .line 875
    .line 876
    .line 877
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 878
    .line 879
    .line 880
    move-result-object v4

    .line 881
    check-cast v4, Landroid/widget/TextView;

    .line 882
    .line 883
    if-eqz v2, :cond_e

    .line 884
    .line 885
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 886
    .line 887
    .line 888
    move-result-object v4

    .line 889
    move/from16 v5, v32

    .line 890
    .line 891
    invoke-virtual {v0, v5, v4}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 892
    .line 893
    .line 894
    move-result-object v4

    .line 895
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 896
    .line 897
    .line 898
    iput-object v2, v1, Lw2/o;->z:Landroid/view/View;

    .line 899
    .line 900
    const/4 v2, 0x0

    .line 901
    iput-object v2, v1, Lw2/o;->B:Landroid/widget/TextView;

    .line 902
    .line 903
    goto :goto_5

    .line 904
    :cond_e
    const/4 v2, 0x0

    .line 905
    if-eqz v4, :cond_f

    .line 906
    .line 907
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 908
    .line 909
    .line 910
    iput-object v4, v1, Lw2/o;->B:Landroid/widget/TextView;

    .line 911
    .line 912
    iput-object v4, v1, Lw2/o;->z:Landroid/view/View;

    .line 913
    .line 914
    goto :goto_5

    .line 915
    :cond_f
    iput-object v2, v1, Lw2/o;->B:Landroid/widget/TextView;

    .line 916
    .line 917
    iput-object v2, v1, Lw2/o;->z:Landroid/view/View;

    .line 918
    .line 919
    :goto_5
    iget-object v2, v1, Lw2/o;->z:Landroid/view/View;

    .line 920
    .line 921
    if-eqz v2, :cond_10

    .line 922
    .line 923
    invoke-virtual {v2, v14}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 924
    .line 925
    .line 926
    :cond_10
    const v2, 0x7f0a00f0

    .line 927
    .line 928
    .line 929
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 930
    .line 931
    .line 932
    move-result-object v2

    .line 933
    check-cast v2, Landroid/widget/ImageView;

    .line 934
    .line 935
    const v4, 0x7f0a00f1

    .line 936
    .line 937
    .line 938
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 939
    .line 940
    .line 941
    move-result-object v4

    .line 942
    check-cast v4, Landroid/widget/TextView;

    .line 943
    .line 944
    if-eqz v2, :cond_11

    .line 945
    .line 946
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 947
    .line 948
    .line 949
    move-result-object v3

    .line 950
    invoke-virtual {v0, v11, v3}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 951
    .line 952
    .line 953
    move-result-object v3

    .line 954
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 955
    .line 956
    .line 957
    iput-object v2, v1, Lw2/o;->y:Landroid/view/View;

    .line 958
    .line 959
    const/4 v2, 0x0

    .line 960
    iput-object v2, v1, Lw2/o;->A:Landroid/widget/TextView;

    .line 961
    .line 962
    goto :goto_6

    .line 963
    :cond_11
    const/4 v2, 0x0

    .line 964
    if-eqz v4, :cond_12

    .line 965
    .line 966
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 967
    .line 968
    .line 969
    iput-object v4, v1, Lw2/o;->A:Landroid/widget/TextView;

    .line 970
    .line 971
    iput-object v4, v1, Lw2/o;->y:Landroid/view/View;

    .line 972
    .line 973
    goto :goto_6

    .line 974
    :cond_12
    iput-object v2, v1, Lw2/o;->A:Landroid/widget/TextView;

    .line 975
    .line 976
    iput-object v2, v1, Lw2/o;->y:Landroid/view/View;

    .line 977
    .line 978
    :goto_6
    iget-object v2, v1, Lw2/o;->y:Landroid/view/View;

    .line 979
    .line 980
    if-eqz v2, :cond_13

    .line 981
    .line 982
    invoke-virtual {v2, v14}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 983
    .line 984
    .line 985
    :cond_13
    const v2, 0x7f0a0104

    .line 986
    .line 987
    .line 988
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 989
    .line 990
    .line 991
    move-result-object v2

    .line 992
    check-cast v2, Landroid/widget/ImageView;

    .line 993
    .line 994
    iput-object v2, v1, Lw2/o;->C:Landroid/widget/ImageView;

    .line 995
    .line 996
    if-eqz v2, :cond_14

    .line 997
    .line 998
    invoke-virtual {v2, v14}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 999
    .line 1000
    .line 1001
    :cond_14
    const v3, 0x7f0a0109

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v3

    .line 1008
    check-cast v3, Landroid/widget/ImageView;

    .line 1009
    .line 1010
    iput-object v3, v1, Lw2/o;->D:Landroid/widget/ImageView;

    .line 1011
    .line 1012
    if-eqz v3, :cond_15

    .line 1013
    .line 1014
    invoke-virtual {v3, v14}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1015
    .line 1016
    .line 1017
    :cond_15
    const v4, 0x7f0b0009

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getInteger(I)I

    .line 1021
    .line 1022
    .line 1023
    move-result v4

    .line 1024
    int-to-float v4, v4

    .line 1025
    const/high16 v5, 0x42c80000    # 100.0f

    .line 1026
    .line 1027
    div-float/2addr v4, v5

    .line 1028
    iput v4, v1, Lw2/o;->g0:F

    .line 1029
    .line 1030
    const v4, 0x7f0b0008

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getInteger(I)I

    .line 1034
    .line 1035
    .line 1036
    move-result v4

    .line 1037
    int-to-float v4, v4

    .line 1038
    div-float/2addr v4, v5

    .line 1039
    iput v4, v1, Lw2/o;->h0:F

    .line 1040
    .line 1041
    const v4, 0x7f0a0111

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v4

    .line 1048
    check-cast v4, Landroid/widget/ImageView;

    .line 1049
    .line 1050
    iput-object v4, v1, Lw2/o;->E:Landroid/widget/ImageView;

    .line 1051
    .line 1052
    if-eqz v4, :cond_16

    .line 1053
    .line 1054
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v5

    .line 1058
    invoke-virtual {v0, v9, v5}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v5

    .line 1062
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1063
    .line 1064
    .line 1065
    const/4 v5, 0x0

    .line 1066
    invoke-virtual {v1, v4, v5}, Lw2/o;->j(Landroid/view/View;Z)V

    .line 1067
    .line 1068
    .line 1069
    :cond_16
    new-instance v5, Lw2/t;

    .line 1070
    .line 1071
    invoke-direct {v5, v1}, Lw2/t;-><init>(Lw2/o;)V

    .line 1072
    .line 1073
    .line 1074
    iput-object v5, v1, Lw2/o;->j:Lw2/t;

    .line 1075
    .line 1076
    move/from16 v6, v34

    .line 1077
    .line 1078
    iput-boolean v6, v5, Lw2/t;->C:Z

    .line 1079
    .line 1080
    const v6, 0x7f110056

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v6

    .line 1087
    const v7, 0x7f0800e7

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v8

    .line 1094
    invoke-virtual {v0, v7, v8}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v7

    .line 1098
    const v8, 0x7f110077

    .line 1099
    .line 1100
    .line 1101
    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v8

    .line 1105
    filled-new-array {v6, v8}, [Ljava/lang/String;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v6

    .line 1109
    const v8, 0x7f0800d3

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v9

    .line 1116
    invoke-virtual {v0, v8, v9}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v8

    .line 1120
    filled-new-array {v7, v8}, [Landroid/graphics/drawable/Drawable;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v7

    .line 1124
    new-instance v8, Lc5/t;

    .line 1125
    .line 1126
    invoke-direct {v8, v1, v6, v7}, Lc5/t;-><init>(Lw2/o;[Ljava/lang/String;[Landroid/graphics/drawable/Drawable;)V

    .line 1127
    .line 1128
    .line 1129
    iput-object v8, v1, Lw2/o;->o:Lc5/t;

    .line 1130
    .line 1131
    const v6, 0x7f0700b2

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1135
    .line 1136
    .line 1137
    move-result v6

    .line 1138
    iput v6, v1, Lw2/o;->u:I

    .line 1139
    .line 1140
    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v6

    .line 1144
    const v7, 0x7f0d0035

    .line 1145
    .line 1146
    .line 1147
    const/4 v9, 0x0

    .line 1148
    invoke-virtual {v6, v7, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v6

    .line 1152
    check-cast v6, Landroidx/recyclerview/widget/RecyclerView;

    .line 1153
    .line 1154
    iput-object v6, v1, Lw2/o;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 1155
    .line 1156
    invoke-virtual {v6, v8}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lz2/x;)V

    .line 1157
    .line 1158
    .line 1159
    new-instance v7, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 1160
    .line 1161
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1162
    .line 1163
    .line 1164
    const/4 v8, 0x1

    .line 1165
    invoke-direct {v7, v8}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 1166
    .line 1167
    .line 1168
    invoke-virtual {v6, v7}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lz2/f0;)V

    .line 1169
    .line 1170
    .line 1171
    new-instance v7, Landroid/widget/PopupWindow;

    .line 1172
    .line 1173
    const/4 v9, -0x2

    .line 1174
    invoke-direct {v7, v6, v9, v9, v8}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    .line 1175
    .line 1176
    .line 1177
    iput-object v7, v1, Lw2/o;->t:Landroid/widget/PopupWindow;

    .line 1178
    .line 1179
    sget v6, Lh1/i0;->a:I

    .line 1180
    .line 1181
    const/16 v9, 0x17

    .line 1182
    .line 1183
    if-ge v6, v9, :cond_17

    .line 1184
    .line 1185
    new-instance v6, Landroid/graphics/drawable/ColorDrawable;

    .line 1186
    .line 1187
    const/4 v9, 0x0

    .line 1188
    invoke-direct {v6, v9}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 1189
    .line 1190
    .line 1191
    invoke-virtual {v7, v6}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1192
    .line 1193
    .line 1194
    :cond_17
    invoke-virtual {v7, v14}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 1195
    .line 1196
    .line 1197
    iput-boolean v8, v1, Lw2/o;->H0:Z

    .line 1198
    .line 1199
    new-instance v6, Le4/y;

    .line 1200
    .line 1201
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v7

    .line 1205
    invoke-direct {v6, v7}, Le4/y;-><init>(Landroid/content/res/Resources;)V

    .line 1206
    .line 1207
    .line 1208
    iput-object v6, v1, Lw2/o;->s:Le4/y;

    .line 1209
    .line 1210
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v6

    .line 1214
    invoke-virtual {v0, v15, v6}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v6

    .line 1218
    iput-object v6, v1, Lw2/o;->k0:Landroid/graphics/drawable/Drawable;

    .line 1219
    .line 1220
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v6

    .line 1224
    invoke-virtual {v0, v10, v6}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v6

    .line 1228
    iput-object v6, v1, Lw2/o;->l0:Landroid/graphics/drawable/Drawable;

    .line 1229
    .line 1230
    const v6, 0x7f11004b

    .line 1231
    .line 1232
    .line 1233
    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v6

    .line 1237
    iput-object v6, v1, Lw2/o;->m0:Ljava/lang/String;

    .line 1238
    .line 1239
    const v6, 0x7f11004a

    .line 1240
    .line 1241
    .line 1242
    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v6

    .line 1246
    iput-object v6, v1, Lw2/o;->n0:Ljava/lang/String;

    .line 1247
    .line 1248
    new-instance v6, Lw2/e;

    .line 1249
    .line 1250
    const/4 v8, 0x1

    .line 1251
    invoke-direct {v6, v1, v8}, Lw2/e;-><init>(Lw2/o;I)V

    .line 1252
    .line 1253
    .line 1254
    iput-object v6, v1, Lw2/o;->q:Lw2/e;

    .line 1255
    .line 1256
    new-instance v6, Lw2/e;

    .line 1257
    .line 1258
    const/4 v9, 0x0

    .line 1259
    invoke-direct {v6, v1, v9}, Lw2/e;-><init>(Lw2/o;I)V

    .line 1260
    .line 1261
    .line 1262
    iput-object v6, v1, Lw2/o;->r:Lw2/e;

    .line 1263
    .line 1264
    new-instance v6, Lw2/h;

    .line 1265
    .line 1266
    const/high16 v7, 0x7f030000

    .line 1267
    .line 1268
    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v7

    .line 1272
    sget-object v8, Lw2/o;->I0:[F

    .line 1273
    .line 1274
    invoke-direct {v6, v1, v7, v8}, Lw2/h;-><init>(Lw2/o;[Ljava/lang/String;[F)V

    .line 1275
    .line 1276
    .line 1277
    iput-object v6, v1, Lw2/o;->p:Lw2/h;

    .line 1278
    .line 1279
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v6

    .line 1283
    invoke-virtual {v0, v12, v6}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v6

    .line 1287
    iput-object v6, v1, Lw2/o;->T:Landroid/graphics/drawable/Drawable;

    .line 1288
    .line 1289
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v6

    .line 1293
    invoke-virtual {v0, v13, v6}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v6

    .line 1297
    iput-object v6, v1, Lw2/o;->U:Landroid/graphics/drawable/Drawable;

    .line 1298
    .line 1299
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v6

    .line 1303
    move/from16 v15, v33

    .line 1304
    .line 1305
    invoke-virtual {v0, v15, v6}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v6

    .line 1309
    iput-object v6, v1, Lw2/o;->o0:Landroid/graphics/drawable/Drawable;

    .line 1310
    .line 1311
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v6

    .line 1315
    move/from16 v7, v20

    .line 1316
    .line 1317
    invoke-virtual {v0, v7, v6}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v6

    .line 1321
    iput-object v6, v1, Lw2/o;->p0:Landroid/graphics/drawable/Drawable;

    .line 1322
    .line 1323
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v6

    .line 1327
    move/from16 v11, v25

    .line 1328
    .line 1329
    invoke-virtual {v0, v11, v6}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v6

    .line 1333
    iput-object v6, v1, Lw2/o;->V:Landroid/graphics/drawable/Drawable;

    .line 1334
    .line 1335
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v6

    .line 1339
    move/from16 v10, v19

    .line 1340
    .line 1341
    invoke-virtual {v0, v10, v6}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v6

    .line 1345
    iput-object v6, v1, Lw2/o;->W:Landroid/graphics/drawable/Drawable;

    .line 1346
    .line 1347
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v6

    .line 1351
    move/from16 v7, v36

    .line 1352
    .line 1353
    invoke-virtual {v0, v7, v6}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v6

    .line 1357
    iput-object v6, v1, Lw2/o;->a0:Landroid/graphics/drawable/Drawable;

    .line 1358
    .line 1359
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v6

    .line 1363
    move/from16 v7, v37

    .line 1364
    .line 1365
    invoke-virtual {v0, v7, v6}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v6

    .line 1369
    iput-object v6, v1, Lw2/o;->e0:Landroid/graphics/drawable/Drawable;

    .line 1370
    .line 1371
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v6

    .line 1375
    move/from16 v7, v38

    .line 1376
    .line 1377
    invoke-virtual {v0, v7, v6}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v6

    .line 1381
    iput-object v6, v1, Lw2/o;->f0:Landroid/graphics/drawable/Drawable;

    .line 1382
    .line 1383
    const v6, 0x7f11004f

    .line 1384
    .line 1385
    .line 1386
    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v6

    .line 1390
    iput-object v6, v1, Lw2/o;->q0:Ljava/lang/String;

    .line 1391
    .line 1392
    const v6, 0x7f11004e

    .line 1393
    .line 1394
    .line 1395
    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v6

    .line 1399
    iput-object v6, v1, Lw2/o;->r0:Ljava/lang/String;

    .line 1400
    .line 1401
    const v6, 0x7f110059

    .line 1402
    .line 1403
    .line 1404
    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v6

    .line 1408
    iput-object v6, v1, Lw2/o;->b0:Ljava/lang/String;

    .line 1409
    .line 1410
    const v6, 0x7f11005a

    .line 1411
    .line 1412
    .line 1413
    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v6

    .line 1417
    iput-object v6, v1, Lw2/o;->c0:Ljava/lang/String;

    .line 1418
    .line 1419
    const v6, 0x7f110058

    .line 1420
    .line 1421
    .line 1422
    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v6

    .line 1426
    iput-object v6, v1, Lw2/o;->d0:Ljava/lang/String;

    .line 1427
    .line 1428
    const v6, 0x7f110060

    .line 1429
    .line 1430
    .line 1431
    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v6

    .line 1435
    iput-object v6, v1, Lw2/o;->i0:Ljava/lang/String;

    .line 1436
    .line 1437
    const v6, 0x7f11005f

    .line 1438
    .line 1439
    .line 1440
    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v0

    .line 1444
    iput-object v0, v1, Lw2/o;->j0:Ljava/lang/String;

    .line 1445
    .line 1446
    const v0, 0x7f0a00e4

    .line 1447
    .line 1448
    .line 1449
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v0

    .line 1453
    check-cast v0, Landroid/view/ViewGroup;

    .line 1454
    .line 1455
    const/4 v8, 0x1

    .line 1456
    invoke-virtual {v5, v0, v8}, Lw2/t;->h(Landroid/view/View;Z)V

    .line 1457
    .line 1458
    .line 1459
    iget-object v0, v1, Lw2/o;->y:Landroid/view/View;

    .line 1460
    .line 1461
    move/from16 v6, v39

    .line 1462
    .line 1463
    invoke-virtual {v5, v0, v6}, Lw2/t;->h(Landroid/view/View;Z)V

    .line 1464
    .line 1465
    .line 1466
    iget-object v0, v1, Lw2/o;->z:Landroid/view/View;

    .line 1467
    .line 1468
    move/from16 v6, v18

    .line 1469
    .line 1470
    invoke-virtual {v5, v0, v6}, Lw2/t;->h(Landroid/view/View;Z)V

    .line 1471
    .line 1472
    .line 1473
    move/from16 v0, v40

    .line 1474
    .line 1475
    move-object/from16 v6, v43

    .line 1476
    .line 1477
    invoke-virtual {v5, v6, v0}, Lw2/t;->h(Landroid/view/View;Z)V

    .line 1478
    .line 1479
    .line 1480
    move/from16 v0, v41

    .line 1481
    .line 1482
    move-object/from16 v6, v44

    .line 1483
    .line 1484
    invoke-virtual {v5, v6, v0}, Lw2/t;->h(Landroid/view/View;Z)V

    .line 1485
    .line 1486
    .line 1487
    move/from16 v10, v17

    .line 1488
    .line 1489
    invoke-virtual {v5, v3, v10}, Lw2/t;->h(Landroid/view/View;Z)V

    .line 1490
    .line 1491
    .line 1492
    move/from16 v0, v16

    .line 1493
    .line 1494
    move-object/from16 v3, v42

    .line 1495
    .line 1496
    invoke-virtual {v5, v3, v0}, Lw2/t;->h(Landroid/view/View;Z)V

    .line 1497
    .line 1498
    .line 1499
    move/from16 v0, v35

    .line 1500
    .line 1501
    invoke-virtual {v5, v4, v0}, Lw2/t;->h(Landroid/view/View;Z)V

    .line 1502
    .line 1503
    .line 1504
    iget v0, v1, Lw2/o;->B0:I

    .line 1505
    .line 1506
    if-eqz v0, :cond_18

    .line 1507
    .line 1508
    const/4 v10, 0x1

    .line 1509
    goto :goto_7

    .line 1510
    :cond_18
    move v10, v9

    .line 1511
    :goto_7
    invoke-virtual {v5, v2, v10}, Lw2/t;->h(Landroid/view/View;Z)V

    .line 1512
    .line 1513
    .line 1514
    new-instance v0, Lk5/a;

    .line 1515
    .line 1516
    const/4 v8, 0x1

    .line 1517
    invoke-direct {v0, v8, v1}, Lk5/a;-><init>(ILjava/lang/Object;)V

    .line 1518
    .line 1519
    .line 1520
    invoke-virtual {v1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 1521
    .line 1522
    .line 1523
    return-void
.end method

.method public static synthetic a(Lw2/o;F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lw2/o;->setPlaybackSpeed(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static b(Landroidx/media3/common/d1;Landroidx/media3/common/o1;)Z
    .locals 8

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    invoke-interface {p0, v0}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-interface {p0}, Landroidx/media3/common/d1;->getCurrentTimeline()Landroidx/media3/common/p1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Landroidx/media3/common/p1;->getWindowCount()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-le v0, v2, :cond_4

    .line 21
    .line 22
    const/16 v3, 0x64

    .line 23
    .line 24
    if-le v0, v3, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v3, v1

    .line 28
    :goto_0
    if-ge v3, v0, :cond_3

    .line 29
    .line 30
    invoke-virtual {p0, v3, p1}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    iget-wide v4, v4, Landroidx/media3/common/o1;->m:J

    .line 35
    .line 36
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    cmp-long v4, v4, v6

    .line 42
    .line 43
    if-nez v4, :cond_2

    .line 44
    .line 45
    return v1

    .line 46
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    return v2

    .line 50
    :cond_4
    :goto_1
    return v1
.end method

.method private setPlaybackSpeed(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/16 v1, 0xd

    .line 6
    .line 7
    invoke-interface {v0, v1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 15
    .line 16
    invoke-interface {v0}, Landroidx/media3/common/d1;->getPlaybackParameters()Landroidx/media3/common/y0;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, Landroidx/media3/common/y0;

    .line 21
    .line 22
    iget v1, v1, Landroidx/media3/common/y0;->b:F

    .line 23
    .line 24
    invoke-direct {v2, p1, v1}, Landroidx/media3/common/y0;-><init>(FF)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v2}, Landroidx/media3/common/d1;->setPlaybackParameters(Landroidx/media3/common/y0;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final c(Landroid/view/KeyEvent;)Z
    .locals 12

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 6
    .line 7
    if-eqz v1, :cond_a

    .line 8
    .line 9
    const/16 v2, 0x58

    .line 10
    .line 11
    const/16 v3, 0x57

    .line 12
    .line 13
    const/16 v4, 0x7f

    .line 14
    .line 15
    const/16 v5, 0x7e

    .line 16
    .line 17
    const/16 v6, 0x4f

    .line 18
    .line 19
    const/16 v7, 0x55

    .line 20
    .line 21
    const/16 v8, 0x59

    .line 22
    .line 23
    const/16 v9, 0x5a

    .line 24
    .line 25
    if-eq v0, v9, :cond_0

    .line 26
    .line 27
    if-eq v0, v8, :cond_0

    .line 28
    .line 29
    if-eq v0, v7, :cond_0

    .line 30
    .line 31
    if-eq v0, v6, :cond_0

    .line 32
    .line 33
    if-eq v0, v5, :cond_0

    .line 34
    .line 35
    if-eq v0, v4, :cond_0

    .line 36
    .line 37
    if-eq v0, v3, :cond_0

    .line 38
    .line 39
    if-ne v0, v2, :cond_a

    .line 40
    .line 41
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 42
    .line 43
    .line 44
    move-result v10

    .line 45
    const/4 v11, 0x1

    .line 46
    if-nez v10, :cond_9

    .line 47
    .line 48
    if-ne v0, v9, :cond_1

    .line 49
    .line 50
    invoke-interface {v1}, Landroidx/media3/common/d1;->getPlaybackState()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    const/4 v0, 0x4

    .line 55
    if-eq p1, v0, :cond_9

    .line 56
    .line 57
    const/16 p1, 0xc

    .line 58
    .line 59
    invoke-interface {v1, p1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_9

    .line 64
    .line 65
    invoke-interface {v1}, Landroidx/media3/common/d1;->seekForward()V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    if-ne v0, v8, :cond_2

    .line 70
    .line 71
    const/16 v8, 0xb

    .line 72
    .line 73
    invoke-interface {v1, v8}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-eqz v8, :cond_2

    .line 78
    .line 79
    invoke-interface {v1}, Landroidx/media3/common/d1;->seekBack()V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-nez p1, :cond_9

    .line 88
    .line 89
    if-eq v0, v6, :cond_7

    .line 90
    .line 91
    if-eq v0, v7, :cond_7

    .line 92
    .line 93
    if-eq v0, v3, :cond_6

    .line 94
    .line 95
    if-eq v0, v2, :cond_5

    .line 96
    .line 97
    if-eq v0, v5, :cond_4

    .line 98
    .line 99
    if-eq v0, v4, :cond_3

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_3
    sget p1, Lh1/i0;->a:I

    .line 103
    .line 104
    invoke-interface {v1, v11}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-eqz p1, :cond_9

    .line 109
    .line 110
    invoke-interface {v1}, Landroidx/media3/common/d1;->pause()V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_4
    invoke-static {v1}, Lh1/i0;->J(Landroidx/media3/common/d1;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_5
    const/4 p1, 0x7

    .line 119
    invoke-interface {v1, p1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-eqz p1, :cond_9

    .line 124
    .line 125
    invoke-interface {v1}, Landroidx/media3/common/d1;->seekToPrevious()V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_6
    const/16 p1, 0x9

    .line 130
    .line 131
    invoke-interface {v1, p1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    if-eqz p1, :cond_9

    .line 136
    .line 137
    invoke-interface {v1}, Landroidx/media3/common/d1;->seekToNext()V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_7
    iget-boolean p1, p0, Lw2/o;->w0:Z

    .line 142
    .line 143
    invoke-static {v1, p1}, Lh1/i0;->c0(Landroidx/media3/common/d1;Z)Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-eqz p1, :cond_8

    .line 148
    .line 149
    invoke-static {v1}, Lh1/i0;->J(Landroidx/media3/common/d1;)Z

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_8
    invoke-interface {v1, v11}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    if-eqz p1, :cond_9

    .line 158
    .line 159
    invoke-interface {v1}, Landroidx/media3/common/d1;->pause()V

    .line 160
    .line 161
    .line 162
    :cond_9
    :goto_0
    return v11

    .line 163
    :cond_a
    const/4 p1, 0x0

    .line 164
    return p1
.end method

.method public final d(Lz2/x;Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lw2/o;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lz2/x;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lw2/o;->q()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lw2/o;->H0:Z

    .line 11
    .line 12
    iget-object p1, p0, Lw2/o;->t:Landroid/widget/PopupWindow;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lw2/o;->H0:Z

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    sub-int/2addr v0, v1

    .line 29
    iget v1, p0, Lw2/o;->u:I

    .line 30
    .line 31
    sub-int/2addr v0, v1

    .line 32
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    neg-int v2, v2

    .line 37
    sub-int/2addr v2, v1

    .line 38
    invoke-virtual {p1, p2, v0, v2}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lw2/o;->c(Landroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 17
    return p1
.end method

.method public final e(Landroidx/media3/common/x1;I)Lf6/l1;
    .locals 11

    .line 1
    const-string v0, "initialCapacity"

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-static {v1, v0}, Lf6/u;->c(ILjava/lang/String;)V

    .line 5
    .line 6
    .line 7
    new-array v0, v1, [Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v1, p1, Landroidx/media3/common/x1;->a:Lf6/m0;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    move v4, v3

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    if-ge v3, v5, :cond_5

    .line 19
    .line 20
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    check-cast v5, Landroidx/media3/common/w1;

    .line 25
    .line 26
    iget-object v6, v5, Landroidx/media3/common/w1;->b:Landroidx/media3/common/q1;

    .line 27
    .line 28
    iget v6, v6, Landroidx/media3/common/q1;->c:I

    .line 29
    .line 30
    if-eq v6, p2, :cond_0

    .line 31
    .line 32
    goto :goto_4

    .line 33
    :cond_0
    move v6, v2

    .line 34
    :goto_1
    iget v7, v5, Landroidx/media3/common/w1;->a:I

    .line 35
    .line 36
    if-ge v6, v7, :cond_4

    .line 37
    .line 38
    invoke-virtual {v5, v6}, Landroidx/media3/common/w1;->b(I)Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    if-nez v7, :cond_1

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    invoke-virtual {v5, v6}, Landroidx/media3/common/w1;->a(I)Landroidx/media3/common/w;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    iget v8, v7, Landroidx/media3/common/w;->e:I

    .line 50
    .line 51
    and-int/lit8 v8, v8, 0x2

    .line 52
    .line 53
    if-eqz v8, :cond_2

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_2
    iget-object v8, p0, Lw2/o;->s:Le4/y;

    .line 57
    .line 58
    invoke-virtual {v8, v7}, Le4/y;->c(Landroidx/media3/common/w;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    new-instance v8, Lw2/l;

    .line 63
    .line 64
    invoke-direct {v8, p1, v3, v6, v7}, Lw2/l;-><init>(Landroidx/media3/common/x1;IILjava/lang/String;)V

    .line 65
    .line 66
    .line 67
    array-length v7, v0

    .line 68
    add-int/lit8 v9, v4, 0x1

    .line 69
    .line 70
    invoke-static {v7, v9}, Lf6/g0;->e(II)I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    array-length v10, v0

    .line 75
    if-gt v7, v10, :cond_3

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    :goto_2
    aput-object v8, v0, v4

    .line 83
    .line 84
    move v4, v9

    .line 85
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_5
    invoke-static {v4, v0}, Lf6/m0;->h(I[Ljava/lang/Object;)Lf6/l1;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    return-object p1
.end method

.method public final f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lw2/o;->j:Lw2/t;

    .line 2
    .line 3
    iget v1, v0, Lw2/t;->z:I

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    if-eq v1, v2, :cond_3

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lw2/t;->f()V

    .line 13
    .line 14
    .line 15
    iget-boolean v1, v0, Lw2/t;->C:Z

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Lw2/t;->i(I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget v1, v0, Lw2/t;->z:I

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    if-ne v1, v2, :cond_2

    .line 27
    .line 28
    iget-object v0, v0, Lw2/t;->m:Landroid/animation/AnimatorSet;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_2
    iget-object v0, v0, Lw2/t;->n:Landroid/animation/AnimatorSet;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 37
    .line 38
    .line 39
    :cond_3
    :goto_0
    return-void
.end method

.method public final g()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lw2/o;->j:Lw2/t;

    .line 2
    .line 3
    iget v1, v0, Lw2/t;->z:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lw2/t;->a:Lw2/o;

    .line 8
    .line 9
    invoke-virtual {v0}, Lw2/o;->h()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public getPlayer()Landroidx/media3/common/d1;
    .locals 1

    .line 1
    iget-object v0, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRepeatToggleModes()I
    .locals 1

    .line 1
    iget v0, p0, Lw2/o;->B0:I

    .line 2
    .line 3
    return v0
.end method

.method public getShowShuffleButton()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lw2/o;->j:Lw2/t;

    .line 2
    .line 3
    iget-object v1, p0, Lw2/o;->D:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lw2/t;->b(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getShowSubtitleButton()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lw2/o;->j:Lw2/t;

    .line 2
    .line 3
    iget-object v1, p0, Lw2/o;->F:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lw2/t;->b(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getShowTimeoutMs()I
    .locals 1

    .line 1
    iget v0, p0, Lw2/o;->z0:I

    .line 2
    .line 3
    return v0
.end method

.method public getShowVrButton()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lw2/o;->j:Lw2/t;

    .line 2
    .line 3
    iget-object v1, p0, Lw2/o;->E:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lw2/t;->b(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final h()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final i()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lw2/o;->m()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lw2/o;->l()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lw2/o;->p()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lw2/o;->r()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lw2/o;->t()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lw2/o;->n()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lw2/o;->s()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final j(Landroid/view/View;Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 5
    .line 6
    .line 7
    if-eqz p2, :cond_1

    .line 8
    .line 9
    iget p2, p0, Lw2/o;->g0:F

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    iget p2, p0, Lw2/o;->h0:F

    .line 13
    .line 14
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final k(Z)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lw2/o;->t0:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-boolean p1, p0, Lw2/o;->t0:Z

    .line 7
    .line 8
    iget-object v0, p0, Lw2/o;->r0:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, p0, Lw2/o;->p0:Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    iget-object v2, p0, Lw2/o;->q0:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v3, p0, Lw2/o;->o0:Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    iget-object v4, p0, Lw2/o;->G:Landroid/widget/ImageView;

    .line 17
    .line 18
    if-nez v4, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    if-eqz p1, :cond_2

    .line 22
    .line 23
    invoke-virtual {v4, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v4, p0, Lw2/o;->H:Landroid/widget/ImageView;

    .line 37
    .line 38
    if-nez v4, :cond_3

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    if-eqz p1, :cond_4

    .line 42
    .line 43
    invoke-virtual {v4, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 54
    .line 55
    .line 56
    :goto_1
    return-void
.end method

.method public final l()V
    .locals 12

    .line 1
    invoke-virtual {p0}, Lw2/o;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    iget-boolean v0, p0, Lw2/o;->u0:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_4

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-boolean v1, p0, Lw2/o;->v0:Z

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget-object v1, p0, Lw2/o;->R:Landroidx/media3/common/o1;

    .line 22
    .line 23
    invoke-static {v0, v1}, Lw2/o;->b(Landroidx/media3/common/d1;Landroidx/media3/common/o1;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    const/16 v1, 0xa

    .line 30
    .line 31
    invoke-interface {v0, v1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x5

    .line 37
    invoke-interface {v0, v1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    :goto_0
    const/4 v2, 0x7

    .line 42
    invoke-interface {v0, v2}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const/16 v3, 0xb

    .line 47
    .line 48
    invoke-interface {v0, v3}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const/16 v4, 0xc

    .line 53
    .line 54
    invoke-interface {v0, v4}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    const/16 v5, 0x9

    .line 59
    .line 60
    invoke-interface {v0, v5}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    const/4 v1, 0x0

    .line 66
    move v0, v1

    .line 67
    move v2, v0

    .line 68
    move v3, v2

    .line 69
    move v4, v3

    .line 70
    :goto_1
    iget-object v5, p0, Lw2/o;->k:Landroid/content/res/Resources;

    .line 71
    .line 72
    iget-object v6, p0, Lw2/o;->z:Landroid/view/View;

    .line 73
    .line 74
    const-wide/16 v7, 0x3e8

    .line 75
    .line 76
    if-eqz v3, :cond_5

    .line 77
    .line 78
    iget-object v9, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 79
    .line 80
    if-eqz v9, :cond_3

    .line 81
    .line 82
    invoke-interface {v9}, Landroidx/media3/common/d1;->getSeekBackIncrement()J

    .line 83
    .line 84
    .line 85
    move-result-wide v9

    .line 86
    goto :goto_2

    .line 87
    :cond_3
    const-wide/16 v9, 0x1388

    .line 88
    .line 89
    :goto_2
    div-long/2addr v9, v7

    .line 90
    long-to-int v9, v9

    .line 91
    iget-object v10, p0, Lw2/o;->B:Landroid/widget/TextView;

    .line 92
    .line 93
    if-eqz v10, :cond_4

    .line 94
    .line 95
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    .line 101
    .line 102
    :cond_4
    if-eqz v6, :cond_5

    .line 103
    .line 104
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    const v11, 0x7f100002

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5, v11, v9, v10}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    invoke-virtual {v6, v9}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 120
    .line 121
    .line 122
    :cond_5
    iget-object v9, p0, Lw2/o;->y:Landroid/view/View;

    .line 123
    .line 124
    if-eqz v4, :cond_8

    .line 125
    .line 126
    iget-object v10, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 127
    .line 128
    if-eqz v10, :cond_6

    .line 129
    .line 130
    invoke-interface {v10}, Landroidx/media3/common/d1;->getSeekForwardIncrement()J

    .line 131
    .line 132
    .line 133
    move-result-wide v10

    .line 134
    goto :goto_3

    .line 135
    :cond_6
    const-wide/16 v10, 0x3a98

    .line 136
    .line 137
    :goto_3
    div-long/2addr v10, v7

    .line 138
    long-to-int v7, v10

    .line 139
    iget-object v8, p0, Lw2/o;->A:Landroid/widget/TextView;

    .line 140
    .line 141
    if-eqz v8, :cond_7

    .line 142
    .line 143
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 148
    .line 149
    .line 150
    :cond_7
    if-eqz v9, :cond_8

    .line 151
    .line 152
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    const v10, 0x7f100001

    .line 161
    .line 162
    .line 163
    invoke-virtual {v5, v10, v7, v8}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    invoke-virtual {v9, v5}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 168
    .line 169
    .line 170
    :cond_8
    iget-object v5, p0, Lw2/o;->v:Landroid/widget/ImageView;

    .line 171
    .line 172
    invoke-virtual {p0, v5, v2}, Lw2/o;->j(Landroid/view/View;Z)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0, v6, v3}, Lw2/o;->j(Landroid/view/View;Z)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0, v9, v4}, Lw2/o;->j(Landroid/view/View;Z)V

    .line 179
    .line 180
    .line 181
    iget-object v2, p0, Lw2/o;->w:Landroid/widget/ImageView;

    .line 182
    .line 183
    invoke-virtual {p0, v2, v0}, Lw2/o;->j(Landroid/view/View;Z)V

    .line 184
    .line 185
    .line 186
    iget-object v0, p0, Lw2/o;->N:Lw2/g0;

    .line 187
    .line 188
    if-eqz v0, :cond_9

    .line 189
    .line 190
    check-cast v0, Lw2/d;

    .line 191
    .line 192
    invoke-virtual {v0, v1}, Lw2/d;->setEnabled(Z)V

    .line 193
    .line 194
    .line 195
    :cond_9
    :goto_4
    return-void
.end method

.method public final m()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lw2/o;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    iget-boolean v0, p0, Lw2/o;->u0:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_3

    .line 12
    :cond_0
    iget-object v0, p0, Lw2/o;->x:Landroid/widget/ImageView;

    .line 13
    .line 14
    if-eqz v0, :cond_5

    .line 15
    .line 16
    iget-object v1, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 17
    .line 18
    iget-boolean v2, p0, Lw2/o;->w0:Z

    .line 19
    .line 20
    invoke-static {v1, v2}, Lh1/i0;->c0(Landroidx/media3/common/d1;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v2, p0, Lw2/o;->T:Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object v2, p0, Lw2/o;->U:Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    :goto_0
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const v1, 0x7f110055

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    const v1, 0x7f110054

    .line 38
    .line 39
    .line 40
    :goto_1
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 41
    .line 42
    .line 43
    iget-object v2, p0, Lw2/o;->k:Landroid/content/res/Resources;

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    invoke-interface {v1, v2}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    iget-object v1, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 64
    .line 65
    const/16 v3, 0x11

    .line 66
    .line 67
    invoke-interface {v1, v3}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    iget-object v1, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 74
    .line 75
    invoke-interface {v1}, Landroidx/media3/common/d1;->getCurrentTimeline()Landroidx/media3/common/p1;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v1}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_3

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    const/4 v2, 0x0

    .line 87
    :cond_4
    :goto_2
    invoke-virtual {p0, v0, v2}, Lw2/o;->j(Landroid/view/View;Z)V

    .line 88
    .line 89
    .line 90
    :cond_5
    :goto_3
    return-void
.end method

.method public final n()V
    .locals 8

    .line 1
    iget-object v0, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-interface {v0}, Landroidx/media3/common/d1;->getPlaybackParameters()Landroidx/media3/common/y0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget v0, v0, Landroidx/media3/common/y0;->a:F

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 14
    .line 15
    .line 16
    move v3, v1

    .line 17
    move v4, v3

    .line 18
    :goto_0
    iget-object v5, p0, Lw2/o;->p:Lw2/h;

    .line 19
    .line 20
    iget-object v6, v5, Lw2/h;->e:[F

    .line 21
    .line 22
    array-length v7, v6

    .line 23
    if-ge v3, v7, :cond_2

    .line 24
    .line 25
    aget v5, v6, v3

    .line 26
    .line 27
    sub-float v5, v0, v5

    .line 28
    .line 29
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    cmpg-float v6, v5, v2

    .line 34
    .line 35
    if-gez v6, :cond_1

    .line 36
    .line 37
    move v4, v3

    .line 38
    move v2, v5

    .line 39
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    iput v4, v5, Lw2/h;->f:I

    .line 43
    .line 44
    iget-object v0, v5, Lw2/h;->d:[Ljava/lang/String;

    .line 45
    .line 46
    aget-object v0, v0, v4

    .line 47
    .line 48
    iget-object v2, p0, Lw2/o;->o:Lc5/t;

    .line 49
    .line 50
    iget-object v3, v2, Lc5/t;->f:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v3, [Ljava/lang/String;

    .line 53
    .line 54
    aput-object v0, v3, v1

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    invoke-virtual {v2, v0}, Lc5/t;->h(I)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v3, :cond_3

    .line 62
    .line 63
    invoke-virtual {v2, v1}, Lc5/t;->h(I)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    :cond_3
    move v1, v0

    .line 70
    :cond_4
    iget-object v0, p0, Lw2/o;->I:Landroid/view/View;

    .line 71
    .line 72
    invoke-virtual {p0, v0, v1}, Lw2/o;->j(Landroid/view/View;Z)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final o()V
    .locals 15

    .line 1
    invoke-virtual {p0}, Lw2/o;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_8

    .line 6
    .line 7
    iget-boolean v0, p0, Lw2/o;->u0:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/16 v1, 0x10

    .line 18
    .line 19
    invoke-interface {v0, v1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    iget-wide v1, p0, Lw2/o;->G0:J

    .line 26
    .line 27
    invoke-interface {v0}, Landroidx/media3/common/d1;->getContentPosition()J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    add-long/2addr v3, v1

    .line 32
    iget-wide v1, p0, Lw2/o;->G0:J

    .line 33
    .line 34
    invoke-interface {v0}, Landroidx/media3/common/d1;->getContentBufferedPosition()J

    .line 35
    .line 36
    .line 37
    move-result-wide v5

    .line 38
    add-long/2addr v5, v1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const-wide/16 v3, 0x0

    .line 41
    .line 42
    move-wide v5, v3

    .line 43
    :goto_0
    iget-object v1, p0, Lw2/o;->M:Landroid/widget/TextView;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    iget-boolean v2, p0, Lw2/o;->y0:Z

    .line 48
    .line 49
    if-nez v2, :cond_2

    .line 50
    .line 51
    iget-object v2, p0, Lw2/o;->O:Ljava/lang/StringBuilder;

    .line 52
    .line 53
    iget-object v7, p0, Lw2/o;->P:Ljava/util/Formatter;

    .line 54
    .line 55
    invoke-static {v2, v7, v3, v4}, Lh1/i0;->G(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    iget-object v1, p0, Lw2/o;->N:Lw2/g0;

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    move-object v2, v1

    .line 67
    check-cast v2, Lw2/d;

    .line 68
    .line 69
    invoke-virtual {v2, v3, v4}, Lw2/d;->setPosition(J)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v5, v6}, Lw2/d;->setBufferedPosition(J)V

    .line 73
    .line 74
    .line 75
    :cond_3
    iget-object v2, p0, Lw2/o;->S:Landroidx/lifecycle/c0;

    .line 76
    .line 77
    invoke-virtual {p0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 78
    .line 79
    .line 80
    const/4 v5, 0x1

    .line 81
    if-nez v0, :cond_4

    .line 82
    .line 83
    move v6, v5

    .line 84
    goto :goto_1

    .line 85
    :cond_4
    invoke-interface {v0}, Landroidx/media3/common/d1;->getPlaybackState()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    :goto_1
    const-wide/16 v7, 0x3e8

    .line 90
    .line 91
    if-eqz v0, :cond_7

    .line 92
    .line 93
    invoke-interface {v0}, Landroidx/media3/common/d1;->isPlaying()Z

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    if-eqz v9, :cond_7

    .line 98
    .line 99
    if-eqz v1, :cond_5

    .line 100
    .line 101
    check-cast v1, Lw2/d;

    .line 102
    .line 103
    invoke-virtual {v1}, Lw2/d;->getPreferredUpdateDelay()J

    .line 104
    .line 105
    .line 106
    move-result-wide v5

    .line 107
    goto :goto_2

    .line 108
    :cond_5
    move-wide v5, v7

    .line 109
    :goto_2
    rem-long/2addr v3, v7

    .line 110
    sub-long v3, v7, v3

    .line 111
    .line 112
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 113
    .line 114
    .line 115
    move-result-wide v3

    .line 116
    invoke-interface {v0}, Landroidx/media3/common/d1;->getPlaybackParameters()Landroidx/media3/common/y0;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iget v0, v0, Landroidx/media3/common/y0;->a:F

    .line 121
    .line 122
    const/4 v1, 0x0

    .line 123
    cmpl-float v1, v0, v1

    .line 124
    .line 125
    if-lez v1, :cond_6

    .line 126
    .line 127
    long-to-float v1, v3

    .line 128
    div-float/2addr v1, v0

    .line 129
    float-to-long v7, v1

    .line 130
    :cond_6
    move-wide v9, v7

    .line 131
    iget v0, p0, Lw2/o;->A0:I

    .line 132
    .line 133
    int-to-long v11, v0

    .line 134
    const-wide/16 v13, 0x3e8

    .line 135
    .line 136
    invoke-static/range {v9 .. v14}, Lh1/i0;->k(JJJ)J

    .line 137
    .line 138
    .line 139
    move-result-wide v0

    .line 140
    invoke-virtual {p0, v2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_7
    const/4 v0, 0x4

    .line 145
    if-eq v6, v0, :cond_8

    .line 146
    .line 147
    if-eq v6, v5, :cond_8

    .line 148
    .line 149
    invoke-virtual {p0, v2, v7, v8}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 150
    .line 151
    .line 152
    :cond_8
    :goto_3
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lw2/o;->j:Lw2/t;

    .line 5
    .line 6
    iget-object v1, v0, Lw2/t;->a:Lw2/o;

    .line 7
    .line 8
    iget-object v2, v0, Lw2/t;->x:Lk5/a;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, p0, Lw2/o;->u0:Z

    .line 15
    .line 16
    invoke-virtual {p0}, Lw2/o;->g()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Lw2/t;->g()V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Lw2/o;->i()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lw2/o;->j:Lw2/t;

    .line 5
    .line 6
    iget-object v1, v0, Lw2/t;->a:Lw2/o;

    .line 7
    .line 8
    iget-object v2, v0, Lw2/t;->x:Lk5/a;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-boolean v1, p0, Lw2/o;->u0:Z

    .line 15
    .line 16
    iget-object v1, p0, Lw2/o;->S:Landroidx/lifecycle/c0;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lw2/t;->f()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 1

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iget-object v0, p1, Lw2/o;->j:Lw2/t;

    .line 6
    .line 7
    iget-object v0, v0, Lw2/t;->b:Landroid/view/View;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sub-int/2addr p4, p2

    .line 12
    sub-int/2addr p5, p3

    .line 13
    const/4 p2, 0x0

    .line 14
    invoke-virtual {v0, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final p()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lw2/o;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    iget-boolean v0, p0, Lw2/o;->u0:Z

    .line 8
    .line 9
    if-eqz v0, :cond_7

    .line 10
    .line 11
    iget-object v0, p0, Lw2/o;->C:Landroid/widget/ImageView;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget v1, p0, Lw2/o;->B0:I

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, v0, v2}, Lw2/o;->j(Landroid/view/View;Z)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    iget-object v1, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 26
    .line 27
    iget-object v3, p0, Lw2/o;->b0:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v4, p0, Lw2/o;->V:Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    if-eqz v1, :cond_6

    .line 32
    .line 33
    const/16 v5, 0xf

    .line 34
    .line 35
    invoke-interface {v1, v5}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-nez v5, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const/4 v2, 0x1

    .line 43
    invoke-virtual {p0, v0, v2}, Lw2/o;->j(Landroid/view/View;Z)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v1}, Landroidx/media3/common/d1;->getRepeatMode()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_5

    .line 51
    .line 52
    if-eq v1, v2, :cond_4

    .line 53
    .line 54
    const/4 v2, 0x2

    .line 55
    if-eq v1, v2, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    iget-object v1, p0, Lw2/o;->a0:Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lw2/o;->d0:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_4
    iget-object v1, p0, Lw2/o;->W:Landroid/graphics/drawable/Drawable;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 72
    .line 73
    .line 74
    iget-object v1, p0, Lw2/o;->c0:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_5
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_6
    :goto_0
    invoke-virtual {p0, v0, v2}, Lw2/o;->j(Landroid/view/View;Z)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    .line 96
    :cond_7
    :goto_1
    return-void
.end method

.method public final q()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lw2/o;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    .line 4
    invoke-virtual {v1, v0, v0}, Landroid/view/View;->measure(II)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v2, p0, Lw2/o;->u:I

    .line 12
    .line 13
    mul-int/lit8 v3, v2, 0x2

    .line 14
    .line 15
    sub-int/2addr v0, v3

    .line 16
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v3, p0, Lw2/o;->t:Landroid/widget/PopupWindow;

    .line 25
    .line 26
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    mul-int/lit8 v2, v2, 0x2

    .line 34
    .line 35
    sub-int/2addr v0, v2

    .line 36
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final r()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lw2/o;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    iget-boolean v0, p0, Lw2/o;->u0:Z

    .line 8
    .line 9
    if-eqz v0, :cond_6

    .line 10
    .line 11
    iget-object v0, p0, Lw2/o;->D:Landroid/widget/ImageView;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget-object v1, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 17
    .line 18
    iget-object v2, p0, Lw2/o;->j:Lw2/t;

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Lw2/t;->b(Landroid/view/View;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, v0, v3}, Lw2/o;->j(Landroid/view/View;Z)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget-object v2, p0, Lw2/o;->j0:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v4, p0, Lw2/o;->f0:Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    if-eqz v1, :cond_5

    .line 36
    .line 37
    const/16 v5, 0xe

    .line 38
    .line 39
    invoke-interface {v1, v5}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-nez v5, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 v3, 0x1

    .line 47
    invoke-virtual {p0, v0, v3}, Lw2/o;->j(Landroid/view/View;Z)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v1}, Landroidx/media3/common/d1;->getShuffleModeEnabled()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_3

    .line 55
    .line 56
    iget-object v4, p0, Lw2/o;->e0:Landroid/graphics/drawable/Drawable;

    .line 57
    .line 58
    :cond_3
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v1}, Landroidx/media3/common/d1;->getShuffleModeEnabled()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_4

    .line 66
    .line 67
    iget-object v2, p0, Lw2/o;->i0:Ljava/lang/String;

    .line 68
    .line 69
    :cond_4
    invoke-virtual {v0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_5
    :goto_0
    invoke-virtual {p0, v0, v3}, Lw2/o;->j(Landroid/view/View;Z)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    :cond_6
    :goto_1
    return-void
.end method

.method public final s()V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-boolean v2, v0, Lw2/o;->v0:Z

    .line 9
    .line 10
    iget-object v3, v0, Lw2/o;->R:Landroidx/media3/common/o1;

    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    invoke-static {v1, v3}, Lw2/o;->b(Landroidx/media3/common/d1;Landroidx/media3/common/o1;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    move v2, v5

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v2, 0x0

    .line 24
    :goto_0
    iput-boolean v2, v0, Lw2/o;->x0:Z

    .line 25
    .line 26
    const-wide/16 v6, 0x0

    .line 27
    .line 28
    iput-wide v6, v0, Lw2/o;->G0:J

    .line 29
    .line 30
    const/16 v2, 0x11

    .line 31
    .line 32
    invoke-interface {v1, v2}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    invoke-interface {v1}, Landroidx/media3/common/d1;->getCurrentTimeline()Landroidx/media3/common/p1;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    sget-object v2, Landroidx/media3/common/p1;->EMPTY:Landroidx/media3/common/p1;

    .line 44
    .line 45
    :goto_1
    invoke-virtual {v2}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    if-nez v8, :cond_13

    .line 55
    .line 56
    invoke-interface {v1}, Landroidx/media3/common/d1;->getCurrentMediaItemIndex()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    iget-boolean v8, v0, Lw2/o;->x0:Z

    .line 61
    .line 62
    if-eqz v8, :cond_3

    .line 63
    .line 64
    const/4 v11, 0x0

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move v11, v1

    .line 67
    :goto_2
    if-eqz v8, :cond_4

    .line 68
    .line 69
    invoke-virtual {v2}, Landroidx/media3/common/p1;->getWindowCount()I

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    sub-int/2addr v8, v5

    .line 74
    goto :goto_3

    .line 75
    :cond_4
    move v8, v1

    .line 76
    :goto_3
    move-wide v12, v6

    .line 77
    const/4 v14, 0x0

    .line 78
    :goto_4
    if-gt v11, v8, :cond_6

    .line 79
    .line 80
    move-wide v15, v6

    .line 81
    if-ne v11, v1, :cond_5

    .line 82
    .line 83
    invoke-static {v12, v13}, Lh1/i0;->f0(J)J

    .line 84
    .line 85
    .line 86
    move-result-wide v6

    .line 87
    iput-wide v6, v0, Lw2/o;->G0:J

    .line 88
    .line 89
    :cond_5
    invoke-virtual {v2, v11, v3}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 90
    .line 91
    .line 92
    iget-wide v6, v3, Landroidx/media3/common/o1;->m:J

    .line 93
    .line 94
    cmp-long v6, v6, v9

    .line 95
    .line 96
    if-nez v6, :cond_7

    .line 97
    .line 98
    iget-boolean v1, v0, Lw2/o;->x0:Z

    .line 99
    .line 100
    xor-int/2addr v1, v5

    .line 101
    invoke-static {v1}, Lh1/a;->j(Z)V

    .line 102
    .line 103
    .line 104
    :cond_6
    move v2, v5

    .line 105
    goto/16 :goto_c

    .line 106
    .line 107
    :cond_7
    iget v6, v3, Landroidx/media3/common/o1;->n:I

    .line 108
    .line 109
    :goto_5
    iget v7, v3, Landroidx/media3/common/o1;->o:I

    .line 110
    .line 111
    if-gt v6, v7, :cond_12

    .line 112
    .line 113
    iget-object v7, v0, Lw2/o;->Q:Landroidx/media3/common/m1;

    .line 114
    .line 115
    invoke-virtual {v2, v6, v7}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 116
    .line 117
    .line 118
    move-wide/from16 v17, v9

    .line 119
    .line 120
    iget-object v9, v7, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 121
    .line 122
    iget v10, v9, Landroidx/media3/common/c;->e:I

    .line 123
    .line 124
    iget v9, v9, Landroidx/media3/common/c;->b:I

    .line 125
    .line 126
    :goto_6
    if-ge v10, v9, :cond_11

    .line 127
    .line 128
    invoke-virtual {v7, v10}, Landroidx/media3/common/m1;->d(I)J

    .line 129
    .line 130
    .line 131
    move-result-wide v19

    .line 132
    const-wide/high16 v21, -0x8000000000000000L

    .line 133
    .line 134
    cmp-long v21, v19, v21

    .line 135
    .line 136
    if-nez v21, :cond_a

    .line 137
    .line 138
    iget-wide v4, v7, Landroidx/media3/common/m1;->d:J

    .line 139
    .line 140
    cmp-long v19, v4, v17

    .line 141
    .line 142
    if-nez v19, :cond_9

    .line 143
    .line 144
    :cond_8
    move/from16 v16, v1

    .line 145
    .line 146
    move-object/from16 v24, v2

    .line 147
    .line 148
    const/4 v2, 0x1

    .line 149
    goto/16 :goto_b

    .line 150
    .line 151
    :cond_9
    move-wide/from16 v19, v4

    .line 152
    .line 153
    :cond_a
    iget-wide v4, v7, Landroidx/media3/common/m1;->e:J

    .line 154
    .line 155
    add-long v19, v19, v4

    .line 156
    .line 157
    cmp-long v4, v19, v15

    .line 158
    .line 159
    if-ltz v4, :cond_8

    .line 160
    .line 161
    iget-object v4, v0, Lw2/o;->C0:[J

    .line 162
    .line 163
    array-length v5, v4

    .line 164
    if-ne v14, v5, :cond_c

    .line 165
    .line 166
    array-length v5, v4

    .line 167
    if-nez v5, :cond_b

    .line 168
    .line 169
    const/4 v5, 0x1

    .line 170
    goto :goto_7

    .line 171
    :cond_b
    array-length v5, v4

    .line 172
    mul-int/lit8 v5, v5, 0x2

    .line 173
    .line 174
    :goto_7
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    iput-object v4, v0, Lw2/o;->C0:[J

    .line 179
    .line 180
    iget-object v4, v0, Lw2/o;->D0:[Z

    .line 181
    .line 182
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    iput-object v4, v0, Lw2/o;->D0:[Z

    .line 187
    .line 188
    :cond_c
    iget-object v4, v0, Lw2/o;->C0:[J

    .line 189
    .line 190
    add-long v19, v12, v19

    .line 191
    .line 192
    invoke-static/range {v19 .. v20}, Lh1/i0;->f0(J)J

    .line 193
    .line 194
    .line 195
    move-result-wide v19

    .line 196
    aput-wide v19, v4, v14

    .line 197
    .line 198
    iget-object v4, v0, Lw2/o;->D0:[Z

    .line 199
    .line 200
    iget-object v5, v7, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 201
    .line 202
    invoke-virtual {v5, v10}, Landroidx/media3/common/c;->a(I)Landroidx/media3/common/b;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    iget v15, v5, Landroidx/media3/common/b;->b:I

    .line 207
    .line 208
    move/from16 v16, v1

    .line 209
    .line 210
    const/4 v1, -0x1

    .line 211
    if-ne v15, v1, :cond_d

    .line 212
    .line 213
    move-object/from16 v24, v2

    .line 214
    .line 215
    const/4 v2, 0x1

    .line 216
    const/16 v22, 0x1

    .line 217
    .line 218
    goto :goto_a

    .line 219
    :cond_d
    const/4 v1, 0x0

    .line 220
    :goto_8
    if-ge v1, v15, :cond_10

    .line 221
    .line 222
    move/from16 v23, v1

    .line 223
    .line 224
    iget-object v1, v5, Landroidx/media3/common/b;->f:[I

    .line 225
    .line 226
    aget v1, v1, v23

    .line 227
    .line 228
    move-object/from16 v24, v2

    .line 229
    .line 230
    const/4 v2, 0x1

    .line 231
    if-eqz v1, :cond_f

    .line 232
    .line 233
    if-ne v1, v2, :cond_e

    .line 234
    .line 235
    goto :goto_9

    .line 236
    :cond_e
    add-int/lit8 v1, v23, 0x1

    .line 237
    .line 238
    move-object/from16 v2, v24

    .line 239
    .line 240
    goto :goto_8

    .line 241
    :cond_f
    :goto_9
    move/from16 v22, v2

    .line 242
    .line 243
    goto :goto_a

    .line 244
    :cond_10
    move-object/from16 v24, v2

    .line 245
    .line 246
    const/4 v2, 0x1

    .line 247
    const/16 v22, 0x0

    .line 248
    .line 249
    :goto_a
    xor-int/lit8 v1, v22, 0x1

    .line 250
    .line 251
    aput-boolean v1, v4, v14

    .line 252
    .line 253
    add-int/lit8 v14, v14, 0x1

    .line 254
    .line 255
    :goto_b
    add-int/lit8 v10, v10, 0x1

    .line 256
    .line 257
    move v5, v2

    .line 258
    move/from16 v1, v16

    .line 259
    .line 260
    move-object/from16 v2, v24

    .line 261
    .line 262
    const-wide/16 v15, 0x0

    .line 263
    .line 264
    goto/16 :goto_6

    .line 265
    .line 266
    :cond_11
    move/from16 v16, v1

    .line 267
    .line 268
    move-object/from16 v24, v2

    .line 269
    .line 270
    move v2, v5

    .line 271
    add-int/lit8 v6, v6, 0x1

    .line 272
    .line 273
    move-wide/from16 v9, v17

    .line 274
    .line 275
    move-object/from16 v2, v24

    .line 276
    .line 277
    const-wide/16 v15, 0x0

    .line 278
    .line 279
    goto/16 :goto_5

    .line 280
    .line 281
    :cond_12
    move/from16 v16, v1

    .line 282
    .line 283
    move-object/from16 v24, v2

    .line 284
    .line 285
    move v2, v5

    .line 286
    move-wide/from16 v17, v9

    .line 287
    .line 288
    iget-wide v4, v3, Landroidx/media3/common/o1;->m:J

    .line 289
    .line 290
    add-long/2addr v12, v4

    .line 291
    add-int/lit8 v11, v11, 0x1

    .line 292
    .line 293
    move v5, v2

    .line 294
    move-object/from16 v2, v24

    .line 295
    .line 296
    const-wide/16 v6, 0x0

    .line 297
    .line 298
    goto/16 :goto_4

    .line 299
    .line 300
    :goto_c
    move-wide v6, v12

    .line 301
    goto :goto_e

    .line 302
    :cond_13
    move v2, v5

    .line 303
    move-wide/from16 v17, v9

    .line 304
    .line 305
    const/16 v3, 0x10

    .line 306
    .line 307
    invoke-interface {v1, v3}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    if-eqz v3, :cond_14

    .line 312
    .line 313
    invoke-interface {v1}, Landroidx/media3/common/d1;->getContentDuration()J

    .line 314
    .line 315
    .line 316
    move-result-wide v3

    .line 317
    cmp-long v1, v3, v17

    .line 318
    .line 319
    if-eqz v1, :cond_14

    .line 320
    .line 321
    invoke-static {v3, v4}, Lh1/i0;->S(J)J

    .line 322
    .line 323
    .line 324
    move-result-wide v6

    .line 325
    :goto_d
    const/4 v14, 0x0

    .line 326
    goto :goto_e

    .line 327
    :cond_14
    const-wide/16 v6, 0x0

    .line 328
    .line 329
    goto :goto_d

    .line 330
    :goto_e
    invoke-static {v6, v7}, Lh1/i0;->f0(J)J

    .line 331
    .line 332
    .line 333
    move-result-wide v3

    .line 334
    iget-object v1, v0, Lw2/o;->L:Landroid/widget/TextView;

    .line 335
    .line 336
    if-eqz v1, :cond_15

    .line 337
    .line 338
    iget-object v5, v0, Lw2/o;->O:Ljava/lang/StringBuilder;

    .line 339
    .line 340
    iget-object v6, v0, Lw2/o;->P:Ljava/util/Formatter;

    .line 341
    .line 342
    invoke-static {v5, v6, v3, v4}, Lh1/i0;->G(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v5

    .line 346
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 347
    .line 348
    .line 349
    :cond_15
    iget-object v1, v0, Lw2/o;->N:Lw2/g0;

    .line 350
    .line 351
    if-eqz v1, :cond_19

    .line 352
    .line 353
    check-cast v1, Lw2/d;

    .line 354
    .line 355
    invoke-virtual {v1, v3, v4}, Lw2/d;->setDuration(J)V

    .line 356
    .line 357
    .line 358
    iget-object v3, v0, Lw2/o;->E0:[J

    .line 359
    .line 360
    array-length v4, v3

    .line 361
    add-int v5, v14, v4

    .line 362
    .line 363
    iget-object v6, v0, Lw2/o;->C0:[J

    .line 364
    .line 365
    array-length v7, v6

    .line 366
    if-le v5, v7, :cond_16

    .line 367
    .line 368
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 369
    .line 370
    .line 371
    move-result-object v6

    .line 372
    iput-object v6, v0, Lw2/o;->C0:[J

    .line 373
    .line 374
    iget-object v6, v0, Lw2/o;->D0:[Z

    .line 375
    .line 376
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 377
    .line 378
    .line 379
    move-result-object v6

    .line 380
    iput-object v6, v0, Lw2/o;->D0:[Z

    .line 381
    .line 382
    :cond_16
    iget-object v6, v0, Lw2/o;->C0:[J

    .line 383
    .line 384
    const/4 v7, 0x0

    .line 385
    invoke-static {v3, v7, v6, v14, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 386
    .line 387
    .line 388
    iget-object v3, v0, Lw2/o;->F0:[Z

    .line 389
    .line 390
    iget-object v6, v0, Lw2/o;->D0:[Z

    .line 391
    .line 392
    invoke-static {v3, v7, v6, v14, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 393
    .line 394
    .line 395
    iget-object v3, v0, Lw2/o;->C0:[J

    .line 396
    .line 397
    iget-object v4, v0, Lw2/o;->D0:[Z

    .line 398
    .line 399
    if-eqz v5, :cond_18

    .line 400
    .line 401
    if-eqz v3, :cond_17

    .line 402
    .line 403
    if-eqz v4, :cond_17

    .line 404
    .line 405
    goto :goto_f

    .line 406
    :cond_17
    move v2, v7

    .line 407
    :cond_18
    :goto_f
    invoke-static {v2}, Lh1/a;->d(Z)V

    .line 408
    .line 409
    .line 410
    iput v5, v1, Lw2/d;->V:I

    .line 411
    .line 412
    iput-object v3, v1, Lw2/d;->W:[J

    .line 413
    .line 414
    iput-object v4, v1, Lw2/d;->a0:[Z

    .line 415
    .line 416
    invoke-virtual {v1}, Lw2/d;->e()V

    .line 417
    .line 418
    .line 419
    :cond_19
    invoke-virtual {v0}, Lw2/o;->o()V

    .line 420
    .line 421
    .line 422
    return-void
.end method

.method public setAnimationEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw2/o;->j:Lw2/t;

    .line 2
    .line 3
    iput-boolean p1, v0, Lw2/t;->C:Z

    .line 4
    .line 5
    return-void
.end method

.method public setOnFullScreenModeChangedListener(Lw2/g;)V
    .locals 5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move v2, v1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v2, v0

    .line 8
    :goto_0
    const/16 v3, 0x8

    .line 9
    .line 10
    iget-object v4, p0, Lw2/o;->G:Landroid/widget/ImageView;

    .line 11
    .line 12
    if-nez v4, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    if-eqz v2, :cond_2

    .line 16
    .line 17
    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_2
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    :goto_1
    if-eqz p1, :cond_3

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_3
    move v1, v0

    .line 28
    :goto_2
    iget-object p1, p0, Lw2/o;->H:Landroid/widget/ImageView;

    .line 29
    .line 30
    if-nez p1, :cond_4

    .line 31
    .line 32
    return-void

    .line 33
    :cond_4
    if-eqz v1, :cond_5

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_5
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public setPlayer(Landroidx/media3/common/d1;)V
    .locals 4

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
    if-eqz p1, :cond_1

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
    if-ne v0, v1, :cond_2

    .line 30
    .line 31
    :cond_1
    move v2, v3

    .line 32
    :cond_2
    invoke-static {v2}, Lh1/a;->d(Z)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 36
    .line 37
    if-ne v0, p1, :cond_3

    .line 38
    .line 39
    return-void

    .line 40
    :cond_3
    iget-object v1, p0, Lw2/o;->l:Lw2/f;

    .line 41
    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    invoke-interface {v0, v1}, Landroidx/media3/common/d1;->removeListener(Landroidx/media3/common/b1;)V

    .line 45
    .line 46
    .line 47
    :cond_4
    iput-object p1, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 48
    .line 49
    if-eqz p1, :cond_5

    .line 50
    .line 51
    invoke-interface {p1, v1}, Landroidx/media3/common/d1;->addListener(Landroidx/media3/common/b1;)V

    .line 52
    .line 53
    .line 54
    :cond_5
    invoke-virtual {p0}, Lw2/o;->i()V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public setProgressUpdateListener(Lw2/i;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setRepeatToggleModes(I)V
    .locals 4

    .line 1
    iput p1, p0, Lw2/o;->B0:I

    .line 2
    .line 3
    iget-object v0, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    const/16 v3, 0xf

    .line 10
    .line 11
    invoke-interface {v0, v3}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 18
    .line 19
    invoke-interface {v0}, Landroidx/media3/common/d1;->getRepeatMode()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 28
    .line 29
    invoke-interface {v0, v1}, Landroidx/media3/common/d1;->setRepeatMode(I)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v3, 0x2

    .line 34
    if-ne p1, v2, :cond_1

    .line 35
    .line 36
    if-ne v0, v3, :cond_1

    .line 37
    .line 38
    iget-object v0, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 39
    .line 40
    invoke-interface {v0, v2}, Landroidx/media3/common/d1;->setRepeatMode(I)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    if-ne p1, v3, :cond_2

    .line 45
    .line 46
    if-ne v0, v2, :cond_2

    .line 47
    .line 48
    iget-object v0, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 49
    .line 50
    invoke-interface {v0, v3}, Landroidx/media3/common/d1;->setRepeatMode(I)V

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_0
    if-eqz p1, :cond_3

    .line 54
    .line 55
    move v1, v2

    .line 56
    :cond_3
    iget-object p1, p0, Lw2/o;->j:Lw2/t;

    .line 57
    .line 58
    iget-object v0, p0, Lw2/o;->C:Landroid/widget/ImageView;

    .line 59
    .line 60
    invoke-virtual {p1, v0, v1}, Lw2/t;->h(Landroid/view/View;Z)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lw2/o;->p()V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public setShowFastForwardButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lw2/o;->j:Lw2/t;

    .line 2
    .line 3
    iget-object v1, p0, Lw2/o;->y:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lw2/t;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lw2/o;->l()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowMultiWindowTimeBar(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-boolean p1, p0, Lw2/o;->v0:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lw2/o;->s()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setShowNextButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lw2/o;->j:Lw2/t;

    .line 2
    .line 3
    iget-object v1, p0, Lw2/o;->w:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lw2/t;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lw2/o;->l()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowPlayButtonIfPlaybackIsSuppressed(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lw2/o;->w0:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lw2/o;->m()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setShowPreviousButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lw2/o;->j:Lw2/t;

    .line 2
    .line 3
    iget-object v1, p0, Lw2/o;->v:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lw2/t;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lw2/o;->l()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowRewindButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lw2/o;->j:Lw2/t;

    .line 2
    .line 3
    iget-object v1, p0, Lw2/o;->z:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lw2/t;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lw2/o;->l()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowShuffleButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lw2/o;->j:Lw2/t;

    .line 2
    .line 3
    iget-object v1, p0, Lw2/o;->D:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lw2/t;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lw2/o;->r()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowSubtitleButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lw2/o;->j:Lw2/t;

    .line 2
    .line 3
    iget-object v1, p0, Lw2/o;->F:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lw2/t;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setShowTimeoutMs(I)V
    .locals 0

    .line 1
    iput p1, p0, Lw2/o;->z0:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lw2/o;->g()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lw2/o;->j:Lw2/t;

    .line 10
    .line 11
    invoke-virtual {p1}, Lw2/t;->g()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setShowVrButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lw2/o;->j:Lw2/t;

    .line 2
    .line 3
    iget-object v1, p0, Lw2/o;->E:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lw2/t;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setTimeBarMinUpdateInterval(I)V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    const/16 v1, 0x3e8

    .line 4
    .line 5
    invoke-static {p1, v0, v1}, Lh1/i0;->j(III)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Lw2/o;->A0:I

    .line 10
    .line 11
    return-void
.end method

.method public setVrButtonListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw2/o;->E:Landroid/widget/ImageView;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0, v0, p1}, Lw2/o;->j(Landroid/view/View;Z)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final t()V
    .locals 11

    .line 1
    iget-object v0, p0, Lw2/o;->q:Lw2/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 7
    .line 8
    iput-object v1, v0, Lw2/e;->d:Ljava/util/List;

    .line 9
    .line 10
    iget-object v2, p0, Lw2/o;->r:Lw2/e;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iput-object v1, v2, Lw2/e;->d:Ljava/util/List;

    .line 16
    .line 17
    iget-object v1, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 18
    .line 19
    iget-object v3, p0, Lw2/o;->F:Landroid/widget/ImageView;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x1

    .line 23
    if-eqz v1, :cond_6

    .line 24
    .line 25
    const/16 v6, 0x1e

    .line 26
    .line 27
    invoke-interface {v1, v6}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_6

    .line 32
    .line 33
    iget-object v1, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 34
    .line 35
    const/16 v6, 0x1d

    .line 36
    .line 37
    invoke-interface {v1, v6}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_0

    .line 42
    .line 43
    goto/16 :goto_2

    .line 44
    .line 45
    :cond_0
    iget-object v1, p0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 46
    .line 47
    invoke-interface {v1}, Landroidx/media3/common/d1;->getCurrentTracks()Landroidx/media3/common/x1;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p0, v1, v5}, Lw2/o;->e(Landroidx/media3/common/x1;I)Lf6/l1;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    iput-object v6, v2, Lw2/e;->d:Ljava/util/List;

    .line 56
    .line 57
    iget-object v7, v2, Lw2/e;->g:Lw2/o;

    .line 58
    .line 59
    iget-object v8, v7, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 60
    .line 61
    iget-object v9, v7, Lw2/o;->o:Lc5/t;

    .line 62
    .line 63
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-interface {v8}, Landroidx/media3/common/d1;->getTrackSelectionParameters()Landroidx/media3/common/v1;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    if-eqz v10, :cond_1

    .line 75
    .line 76
    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    const v6, 0x7f110076

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    iget-object v6, v9, Lc5/t;->f:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v6, [Ljava/lang/String;

    .line 90
    .line 91
    aput-object v2, v6, v5

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    invoke-virtual {v2, v8}, Lw2/e;->g(Landroidx/media3/common/v1;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-nez v2, :cond_2

    .line 99
    .line 100
    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    const v6, 0x7f110075

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    iget-object v6, v9, Lc5/t;->f:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v6, [Ljava/lang/String;

    .line 114
    .line 115
    aput-object v2, v6, v5

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_2
    move v2, v4

    .line 119
    :goto_0
    iget v7, v6, Lf6/l1;->m:I

    .line 120
    .line 121
    if-ge v2, v7, :cond_4

    .line 122
    .line 123
    invoke-virtual {v6, v2}, Lf6/l1;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    check-cast v7, Lw2/l;

    .line 128
    .line 129
    iget-object v8, v7, Lw2/l;->a:Landroidx/media3/common/w1;

    .line 130
    .line 131
    iget v10, v7, Lw2/l;->b:I

    .line 132
    .line 133
    iget-object v8, v8, Landroidx/media3/common/w1;->e:[Z

    .line 134
    .line 135
    aget-boolean v8, v8, v10

    .line 136
    .line 137
    if-eqz v8, :cond_3

    .line 138
    .line 139
    iget-object v2, v7, Lw2/l;->c:Ljava/lang/String;

    .line 140
    .line 141
    iget-object v6, v9, Lc5/t;->f:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v6, [Ljava/lang/String;

    .line 144
    .line 145
    aput-object v2, v6, v5

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_4
    :goto_1
    iget-object v2, p0, Lw2/o;->j:Lw2/t;

    .line 152
    .line 153
    invoke-virtual {v2, v3}, Lw2/t;->b(Landroid/view/View;)Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eqz v2, :cond_5

    .line 158
    .line 159
    const/4 v2, 0x3

    .line 160
    invoke-virtual {p0, v1, v2}, Lw2/o;->e(Landroidx/media3/common/x1;I)Lf6/l1;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-virtual {v0, v1}, Lw2/e;->h(Ljava/util/List;)V

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_5
    sget-object v1, Lf6/l1;->n:Lf6/l1;

    .line 169
    .line 170
    invoke-virtual {v0, v1}, Lw2/e;->h(Ljava/util/List;)V

    .line 171
    .line 172
    .line 173
    :cond_6
    :goto_2
    invoke-virtual {v0}, Lw2/e;->a()I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-lez v0, :cond_7

    .line 178
    .line 179
    move v0, v5

    .line 180
    goto :goto_3

    .line 181
    :cond_7
    move v0, v4

    .line 182
    :goto_3
    invoke-virtual {p0, v3, v0}, Lw2/o;->j(Landroid/view/View;Z)V

    .line 183
    .line 184
    .line 185
    iget-object v0, p0, Lw2/o;->o:Lc5/t;

    .line 186
    .line 187
    invoke-virtual {v0, v5}, Lc5/t;->h(I)Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-nez v1, :cond_8

    .line 192
    .line 193
    invoke-virtual {v0, v4}, Lc5/t;->h(I)Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-eqz v0, :cond_9

    .line 198
    .line 199
    :cond_8
    move v4, v5

    .line 200
    :cond_9
    iget-object v0, p0, Lw2/o;->I:Landroid/view/View;

    .line 201
    .line 202
    invoke-virtual {p0, v0, v4}, Lw2/o;->j(Landroid/view/View;Z)V

    .line 203
    .line 204
    .line 205
    return-void
.end method
