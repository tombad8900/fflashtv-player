.class public abstract Le0/e;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final a:Lcom/bumptech/glide/d;

.field public static final b:Lp/j;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "TypefaceCompat static init"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bumptech/glide/d;->g(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1d

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    new-instance v0, Le0/j;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/bumptech/glide/d;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Le0/e;->a:Lcom/bumptech/glide/d;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/16 v1, 0x1c

    .line 21
    .line 22
    if-lt v0, v1, :cond_1

    .line 23
    .line 24
    new-instance v0, Le0/i;

    .line 25
    .line 26
    invoke-direct {v0}, Le0/h;-><init>()V

    .line 27
    .line 28
    .line 29
    sput-object v0, Le0/e;->a:Lcom/bumptech/glide/d;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/16 v1, 0x1a

    .line 33
    .line 34
    if-lt v0, v1, :cond_2

    .line 35
    .line 36
    new-instance v0, Le0/h;

    .line 37
    .line 38
    invoke-direct {v0}, Le0/h;-><init>()V

    .line 39
    .line 40
    .line 41
    sput-object v0, Le0/e;->a:Lcom/bumptech/glide/d;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    sget-object v0, Le0/g;->p:Ljava/lang/reflect/Method;

    .line 45
    .line 46
    if-nez v0, :cond_3

    .line 47
    .line 48
    const-string v1, "TypefaceCompatApi24Impl"

    .line 49
    .line 50
    const-string v2, "Unable to collect necessary private methods.Fallback to legacy implementation."

    .line 51
    .line 52
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    :cond_3
    if-eqz v0, :cond_4

    .line 56
    .line 57
    new-instance v0, Le0/g;

    .line 58
    .line 59
    invoke-direct {v0}, Lcom/bumptech/glide/d;-><init>()V

    .line 60
    .line 61
    .line 62
    sput-object v0, Le0/e;->a:Lcom/bumptech/glide/d;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_4
    new-instance v0, Le0/f;

    .line 66
    .line 67
    invoke-direct {v0}, Lcom/bumptech/glide/d;-><init>()V

    .line 68
    .line 69
    .line 70
    sput-object v0, Le0/e;->a:Lcom/bumptech/glide/d;

    .line 71
    .line 72
    :goto_0
    new-instance v0, Lp/j;

    .line 73
    .line 74
    const/16 v1, 0x10

    .line 75
    .line 76
    invoke-direct {v0, v1}, Lp/j;-><init>(I)V

    .line 77
    .line 78
    .line 79
    sput-object v0, Le0/e;->b:Lp/j;

    .line 80
    .line 81
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public static a(Landroid/content/Context;Ld0/d;Landroid/content/res/Resources;ILjava/lang/String;IILd0/b;Z)Landroid/graphics/Typeface;
    .locals 16

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move/from16 v4, p6

    .line 6
    .line 7
    move-object/from16 v1, p7

    .line 8
    .line 9
    instance-of v3, v0, Ld0/g;

    .line 10
    .line 11
    const/4 v5, 0x6

    .line 12
    const/4 v6, -0x3

    .line 13
    if-eqz v3, :cond_10

    .line 14
    .line 15
    check-cast v0, Ld0/g;

    .line 16
    .line 17
    iget-object v3, v0, Ld0/g;->e:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v7, 0x0

    .line 20
    const/4 v8, 0x0

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v9

    .line 27
    if-eqz v9, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v3, v8}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    sget-object v9, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 35
    .line 36
    invoke-static {v9, v8}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 37
    .line 38
    .line 39
    move-result-object v9

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    invoke-virtual {v3, v9}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    if-nez v9, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    :goto_0
    move-object v3, v7

    .line 50
    :goto_1
    if-eqz v3, :cond_3

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    new-instance v0, Landroid/os/Handler;

    .line 55
    .line 56
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 61
    .line 62
    .line 63
    new-instance v2, Landroidx/media3/exoplayer/audio/i;

    .line 64
    .line 65
    invoke-direct {v2, v1, v5, v3}, Landroidx/media3/exoplayer/audio/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 69
    .line 70
    .line 71
    :cond_2
    return-object v3

    .line 72
    :cond_3
    const/4 v9, 0x1

    .line 73
    if-eqz p8, :cond_5

    .line 74
    .line 75
    iget v3, v0, Ld0/g;->d:I

    .line 76
    .line 77
    if-nez v3, :cond_4

    .line 78
    .line 79
    :goto_2
    move v3, v9

    .line 80
    goto :goto_3

    .line 81
    :cond_4
    move v3, v8

    .line 82
    goto :goto_3

    .line 83
    :cond_5
    if-nez v1, :cond_4

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :goto_3
    const/4 v5, -0x1

    .line 87
    if-eqz p8, :cond_6

    .line 88
    .line 89
    iget v10, v0, Ld0/g;->c:I

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_6
    move v10, v5

    .line 93
    :goto_4
    new-instance v11, Landroid/os/Handler;

    .line 94
    .line 95
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 96
    .line 97
    .line 98
    move-result-object v12

    .line 99
    invoke-direct {v11, v12}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 100
    .line 101
    .line 102
    new-instance v12, La1/o;

    .line 103
    .line 104
    const/16 v13, 0xf

    .line 105
    .line 106
    invoke-direct {v12, v13, v8}, La1/o;-><init>(IZ)V

    .line 107
    .line 108
    .line 109
    iput-object v1, v12, La1/o;->k:Ljava/lang/Object;

    .line 110
    .line 111
    iget-object v1, v0, Ld0/g;->b:Lj0/d;

    .line 112
    .line 113
    if-eqz v1, :cond_8

    .line 114
    .line 115
    iget-object v0, v0, Ld0/g;->a:Lj0/d;

    .line 116
    .line 117
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    new-instance v1, Ljava/util/ArrayList;

    .line 122
    .line 123
    const/4 v13, 0x2

    .line 124
    invoke-direct {v1, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 125
    .line 126
    .line 127
    move v14, v8

    .line 128
    :goto_5
    if-ge v14, v13, :cond_7

    .line 129
    .line 130
    aget-object v15, v0, v14

    .line 131
    .line 132
    invoke-static {v15}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    add-int/lit8 v14, v14, 0x1

    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_7
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    goto :goto_6

    .line 146
    :cond_8
    iget-object v0, v0, Ld0/g;->a:Lj0/d;

    .line 147
    .line 148
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    new-instance v1, Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-direct {v1, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 155
    .line 156
    .line 157
    aget-object v0, v0, v8

    .line 158
    .line 159
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    :goto_6
    new-instance v13, La1/e;

    .line 170
    .line 171
    new-instance v1, Lj0/l;

    .line 172
    .line 173
    invoke-direct {v1, v11}, Lj0/l;-><init>(Landroid/os/Handler;)V

    .line 174
    .line 175
    .line 176
    const/16 v11, 0x12

    .line 177
    .line 178
    invoke-direct {v13, v12, v11, v1}, La1/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    const/4 v11, 0x7

    .line 182
    if-eqz v3, :cond_c

    .line 183
    .line 184
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    if-gt v3, v9, :cond_b

    .line 189
    .line 190
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    move-object v3, v0

    .line 195
    check-cast v3, Lj0/d;

    .line 196
    .line 197
    sget-object v0, Lj0/h;->a:Lp/j;

    .line 198
    .line 199
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    new-instance v14, Ljava/util/ArrayList;

    .line 204
    .line 205
    invoke-direct {v14, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 206
    .line 207
    .line 208
    aget-object v0, v0, v8

    .line 209
    .line 210
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    invoke-static {v14}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-static {v4, v0}, Lj0/h;->a(ILjava/util/List;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    sget-object v14, Lj0/h;->a:Lp/j;

    .line 225
    .line 226
    invoke-virtual {v14, v0}, Lp/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v14

    .line 230
    check-cast v14, Landroid/graphics/Typeface;

    .line 231
    .line 232
    if-eqz v14, :cond_9

    .line 233
    .line 234
    new-instance v0, Lj6/q;

    .line 235
    .line 236
    invoke-direct {v0, v12, v11, v14}, Lj6/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, v0}, Lj0/l;->execute(Ljava/lang/Runnable;)V

    .line 240
    .line 241
    .line 242
    move-object v7, v14

    .line 243
    goto/16 :goto_a

    .line 244
    .line 245
    :cond_9
    if-ne v10, v5, :cond_a

    .line 246
    .line 247
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    new-instance v3, Ljava/util/ArrayList;

    .line 252
    .line 253
    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 254
    .line 255
    .line 256
    aget-object v1, v1, v8

    .line 257
    .line 258
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-static {v0, v2, v1, v4}, Lj0/h;->b(Ljava/lang/String;Landroid/content/Context;Ljava/util/List;I)Lj0/g;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-virtual {v13, v0}, La1/e;->I(Lj0/g;)V

    .line 273
    .line 274
    .line 275
    iget-object v7, v0, Lj0/g;->a:Landroid/graphics/Typeface;

    .line 276
    .line 277
    goto/16 :goto_a

    .line 278
    .line 279
    :cond_a
    move-object v1, v0

    .line 280
    new-instance v0, Lj0/e;

    .line 281
    .line 282
    const/4 v5, 0x0

    .line 283
    invoke-direct/range {v0 .. v5}, Lj0/e;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V

    .line 284
    .line 285
    .line 286
    :try_start_0
    sget-object v1, Lj0/h;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 287
    .line 288
    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 289
    .line 290
    .line 291
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3

    .line 292
    int-to-long v1, v10

    .line 293
    :try_start_1
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 294
    .line 295
    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_2

    .line 299
    :try_start_2
    check-cast v0, Lj0/g;

    .line 300
    .line 301
    invoke-virtual {v13, v0}, La1/e;->I(Lj0/g;)V

    .line 302
    .line 303
    .line 304
    iget-object v7, v0, Lj0/g;->a:Landroid/graphics/Typeface;

    .line 305
    .line 306
    goto/16 :goto_a

    .line 307
    .line 308
    :catch_0
    move-exception v0

    .line 309
    goto :goto_7

    .line 310
    :catch_1
    move-exception v0

    .line 311
    goto :goto_8

    .line 312
    :catch_2
    new-instance v0, Ljava/lang/InterruptedException;

    .line 313
    .line 314
    const-string v1, "timeout"

    .line 315
    .line 316
    invoke-direct {v0, v1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    throw v0

    .line 320
    :goto_7
    throw v0

    .line 321
    :goto_8
    new-instance v1, Ljava/lang/RuntimeException;

    .line 322
    .line 323
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 324
    .line 325
    .line 326
    throw v1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_3

    .line 327
    :catch_3
    iget-object v0, v13, La1/e;->l:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v0, Lj0/l;

    .line 330
    .line 331
    iget-object v1, v13, La1/e;->k:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v1, La1/o;

    .line 334
    .line 335
    new-instance v2, Lcom/google/android/material/datepicker/f;

    .line 336
    .line 337
    invoke-direct {v2, v6, v9, v1}, Lcom/google/android/material/datepicker/f;-><init>(IILjava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0, v2}, Lj0/l;->execute(Ljava/lang/Runnable;)V

    .line 341
    .line 342
    .line 343
    goto/16 :goto_a

    .line 344
    .line 345
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 346
    .line 347
    const-string v1, "Fallbacks with blocking fetches are not supported for performance reasons"

    .line 348
    .line 349
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    throw v0

    .line 353
    :cond_c
    invoke-static {v4, v0}, Lj0/h;->a(ILjava/util/List;)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    sget-object v3, Lj0/h;->a:Lp/j;

    .line 358
    .line 359
    invoke-virtual {v3, v2}, Lp/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    check-cast v3, Landroid/graphics/Typeface;

    .line 364
    .line 365
    if-eqz v3, :cond_d

    .line 366
    .line 367
    new-instance v0, Lj6/q;

    .line 368
    .line 369
    invoke-direct {v0, v12, v11, v3}, Lj6/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v1, v0}, Lj0/l;->execute(Ljava/lang/Runnable;)V

    .line 373
    .line 374
    .line 375
    move-object v7, v3

    .line 376
    goto :goto_a

    .line 377
    :cond_d
    new-instance v1, Lj0/f;

    .line 378
    .line 379
    invoke-direct {v1, v8, v13}, Lj0/f;-><init>(ILjava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    sget-object v3, Lj0/h;->c:Ljava/lang/Object;

    .line 383
    .line 384
    monitor-enter v3

    .line 385
    :try_start_3
    sget-object v5, Lj0/h;->d:Lp/k;

    .line 386
    .line 387
    invoke-virtual {v5, v2}, Lp/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v6

    .line 391
    check-cast v6, Ljava/util/ArrayList;

    .line 392
    .line 393
    if-eqz v6, :cond_e

    .line 394
    .line 395
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    monitor-exit v3

    .line 399
    goto :goto_a

    .line 400
    :catchall_0
    move-exception v0

    .line 401
    goto :goto_b

    .line 402
    :cond_e
    new-instance v6, Ljava/util/ArrayList;

    .line 403
    .line 404
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    invoke-virtual {v5, v2, v6}, Lp/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 414
    move-object v3, v0

    .line 415
    new-instance v0, Lj0/e;

    .line 416
    .line 417
    const/4 v5, 0x1

    .line 418
    move-object v1, v2

    .line 419
    move-object/from16 v2, p0

    .line 420
    .line 421
    invoke-direct/range {v0 .. v5}, Lj0/e;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V

    .line 422
    .line 423
    .line 424
    sget-object v2, Lj0/h;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 425
    .line 426
    new-instance v3, Lj0/f;

    .line 427
    .line 428
    invoke-direct {v3, v9, v1}, Lj0/f;-><init>(ILjava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    if-nez v1, :cond_f

    .line 436
    .line 437
    new-instance v1, Landroid/os/Handler;

    .line 438
    .line 439
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 440
    .line 441
    .line 442
    move-result-object v5

    .line 443
    invoke-direct {v1, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 444
    .line 445
    .line 446
    goto :goto_9

    .line 447
    :cond_f
    new-instance v1, Landroid/os/Handler;

    .line 448
    .line 449
    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 450
    .line 451
    .line 452
    :goto_9
    new-instance v5, Lj0/m;

    .line 453
    .line 454
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 455
    .line 456
    .line 457
    iput-object v0, v5, Lj0/m;->j:Lj0/e;

    .line 458
    .line 459
    iput-object v3, v5, Lj0/m;->k:Lj0/f;

    .line 460
    .line 461
    iput-object v1, v5, Lj0/m;->l:Landroid/os/Handler;

    .line 462
    .line 463
    invoke-virtual {v2, v5}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 464
    .line 465
    .line 466
    :goto_a
    move-object v0, v7

    .line 467
    move-object/from16 v7, p2

    .line 468
    .line 469
    goto :goto_c

    .line 470
    :goto_b
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 471
    throw v0

    .line 472
    :cond_10
    sget-object v3, Le0/e;->a:Lcom/bumptech/glide/d;

    .line 473
    .line 474
    check-cast v0, Ld0/e;

    .line 475
    .line 476
    move-object/from16 v7, p2

    .line 477
    .line 478
    invoke-virtual {v3, v2, v0, v7, v4}, Lcom/bumptech/glide/d;->r(Landroid/content/Context;Ld0/e;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    if-eqz v1, :cond_12

    .line 483
    .line 484
    if-eqz v0, :cond_11

    .line 485
    .line 486
    new-instance v2, Landroid/os/Handler;

    .line 487
    .line 488
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 489
    .line 490
    .line 491
    move-result-object v3

    .line 492
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 493
    .line 494
    .line 495
    new-instance v3, Landroidx/media3/exoplayer/audio/i;

    .line 496
    .line 497
    invoke-direct {v3, v1, v5, v0}, Landroidx/media3/exoplayer/audio/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 501
    .line 502
    .line 503
    goto :goto_c

    .line 504
    :cond_11
    invoke-virtual {v1, v6}, Ld0/b;->a(I)V

    .line 505
    .line 506
    .line 507
    :cond_12
    :goto_c
    if-eqz v0, :cond_13

    .line 508
    .line 509
    sget-object v1, Le0/e;->b:Lp/j;

    .line 510
    .line 511
    invoke-static/range {p2 .. p6}, Le0/e;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    invoke-virtual {v1, v2, v0}, Lp/j;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    :cond_13
    return-object v0
.end method

.method public static b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x2d

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method
