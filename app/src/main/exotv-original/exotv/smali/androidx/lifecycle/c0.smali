.class public final synthetic Landroidx/lifecycle/c0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/lifecycle/c0;->j:I

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 35

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Landroidx/lifecycle/c0;->j:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Li5/d;

    .line 14
    .line 15
    iput-boolean v5, v0, Li5/d;->c:Z

    .line 16
    .line 17
    iget-object v3, v0, Li5/d;->e:Lz/a;

    .line 18
    .line 19
    check-cast v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 20
    .line 21
    iget-object v4, v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:Lt0/f;

    .line 22
    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    invoke-virtual {v4}, Lt0/f;->f()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    iget v2, v0, Li5/d;->b:I

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Li5/d;->a(I)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget v4, v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 38
    .line 39
    if-ne v4, v2, :cond_1

    .line 40
    .line 41
    iget v0, v0, Li5/d;->b:I

    .line 42
    .line 43
    invoke-virtual {v3, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r(I)V

    .line 44
    .line 45
    .line 46
    :cond_1
    :goto_0
    return-void

    .line 47
    :pswitch_0
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lcom/exotv/net/SeriesDetailActivity;

    .line 50
    .line 51
    iget-object v2, v0, Lcom/exotv/net/SeriesDetailActivity;->O:Landroid/widget/LinearLayout;

    .line 52
    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    .line 56
    .line 57
    .line 58
    :cond_2
    iget-object v0, v0, Lcom/exotv/net/SeriesDetailActivity;->J:Landroid/widget/ScrollView;

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    invoke-virtual {v0, v5, v5}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_3
    const-string v0, "pageScroll"

    .line 67
    .line 68
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v4

    .line 72
    :pswitch_1
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Landroidx/media3/ui/PlayerView;

    .line 75
    .line 76
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_2
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Lw2/o;

    .line 83
    .line 84
    invoke-virtual {v0}, Lw2/o;->o()V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_3
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Lw2/d;

    .line 91
    .line 92
    invoke-virtual {v0, v5}, Lw2/d;->d(Z)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :pswitch_4
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v3, v0

    .line 99
    check-cast v3, Lv0/q;

    .line 100
    .line 101
    const-string v0, "fetchFonts result is not OK. ("

    .line 102
    .line 103
    iget-object v6, v3, Lv0/q;->m:Ljava/lang/Object;

    .line 104
    .line 105
    monitor-enter v6

    .line 106
    :try_start_0
    iget-object v4, v3, Lv0/q;->q:Lt2/i0;

    .line 107
    .line 108
    if-nez v4, :cond_4

    .line 109
    .line 110
    monitor-exit v6

    .line 111
    goto/16 :goto_7

    .line 112
    .line 113
    :catchall_0
    move-exception v0

    .line 114
    goto/16 :goto_9

    .line 115
    .line 116
    :cond_4
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    :try_start_1
    invoke-virtual {v3}, Lv0/q;->c()Lj0/j;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    iget v6, v4, Lj0/j;->e:I

    .line 122
    .line 123
    if-ne v6, v2, :cond_5

    .line 124
    .line 125
    iget-object v2, v3, Lv0/q;->m:Ljava/lang/Object;

    .line 126
    .line 127
    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 128
    :try_start_2
    monitor-exit v2

    .line 129
    goto :goto_1

    .line 130
    :catchall_1
    move-exception v0

    .line 131
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 132
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 133
    :catchall_2
    move-exception v0

    .line 134
    goto/16 :goto_5

    .line 135
    .line 136
    :cond_5
    :goto_1
    if-nez v6, :cond_8

    .line 137
    .line 138
    :try_start_4
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 139
    .line 140
    sget v2, Li0/f;->a:I

    .line 141
    .line 142
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    iget-object v0, v3, Lv0/q;->l:Lk2/b;

    .line 146
    .line 147
    iget-object v2, v3, Lv0/q;->j:Landroid/content/Context;

    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    filled-new-array {v4}, [Lj0/j;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    sget-object v6, Le0/e;->a:Lcom/bumptech/glide/d;

    .line 157
    .line 158
    const-string v6, "TypefaceCompat.createFromFontInfo"

    .line 159
    .line 160
    invoke-static {v6}, Lcom/bumptech/glide/d;->g(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 161
    .line 162
    .line 163
    :try_start_5
    sget-object v6, Le0/e;->a:Lcom/bumptech/glide/d;

    .line 164
    .line 165
    invoke-virtual {v6, v2, v0, v5}, Lcom/bumptech/glide/d;->s(Landroid/content/Context;[Lj0/j;I)Landroid/graphics/Typeface;

    .line 166
    .line 167
    .line 168
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 169
    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 170
    .line 171
    .line 172
    iget-object v2, v3, Lv0/q;->j:Landroid/content/Context;

    .line 173
    .line 174
    iget-object v4, v4, Lj0/j;->a:Landroid/net/Uri;

    .line 175
    .line 176
    invoke-static {v2, v4}, Landroid/support/v4/media/session/b;->B(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 177
    .line 178
    .line 179
    move-result-object v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 180
    if-eqz v2, :cond_7

    .line 181
    .line 182
    if-eqz v0, :cond_7

    .line 183
    .line 184
    :try_start_7
    const-string v4, "EmojiCompat.MetadataRepo.create"

    .line 185
    .line 186
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    new-instance v4, La1/h;

    .line 190
    .line 191
    invoke-static {v2}, Lt2/w;->m(Ljava/nio/MappedByteBuffer;)Lw0/b;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-direct {v4, v0, v2}, La1/h;-><init>(Landroid/graphics/Typeface;Lw0/b;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 196
    .line 197
    .line 198
    :try_start_8
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 199
    .line 200
    .line 201
    :try_start_9
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 202
    .line 203
    .line 204
    iget-object v2, v3, Lv0/q;->m:Ljava/lang/Object;

    .line 205
    .line 206
    monitor-enter v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 207
    :try_start_a
    iget-object v0, v3, Lv0/q;->q:Lt2/i0;

    .line 208
    .line 209
    if-eqz v0, :cond_6

    .line 210
    .line 211
    invoke-virtual {v0, v4}, Lt2/i0;->x(La1/h;)V

    .line 212
    .line 213
    .line 214
    goto :goto_2

    .line 215
    :catchall_3
    move-exception v0

    .line 216
    goto :goto_3

    .line 217
    :cond_6
    :goto_2
    monitor-exit v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 218
    :try_start_b
    invoke-virtual {v3}, Lv0/q;->b()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 219
    .line 220
    .line 221
    goto :goto_7

    .line 222
    :goto_3
    :try_start_c
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 223
    :try_start_d
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 224
    :catchall_4
    move-exception v0

    .line 225
    :try_start_e
    sget v2, Li0/f;->a:I

    .line 226
    .line 227
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 228
    .line 229
    .line 230
    throw v0

    .line 231
    :cond_7
    new-instance v0, Ljava/lang/RuntimeException;

    .line 232
    .line 233
    const-string v2, "Unable to open file."

    .line 234
    .line 235
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    throw v0

    .line 239
    :catchall_5
    move-exception v0

    .line 240
    goto :goto_4

    .line 241
    :catchall_6
    move-exception v0

    .line 242
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 243
    .line 244
    .line 245
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 246
    :goto_4
    :try_start_f
    sget v2, Li0/f;->a:I

    .line 247
    .line 248
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 249
    .line 250
    .line 251
    throw v0

    .line 252
    :cond_8
    new-instance v2, Ljava/lang/RuntimeException;

    .line 253
    .line 254
    new-instance v4, Ljava/lang/StringBuilder;

    .line 255
    .line 256
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    const-string v0, ")"

    .line 263
    .line 264
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    throw v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 275
    :goto_5
    iget-object v2, v3, Lv0/q;->m:Ljava/lang/Object;

    .line 276
    .line 277
    monitor-enter v2

    .line 278
    :try_start_10
    iget-object v4, v3, Lv0/q;->q:Lt2/i0;

    .line 279
    .line 280
    if-eqz v4, :cond_9

    .line 281
    .line 282
    invoke-virtual {v4, v0}, Lt2/i0;->u(Ljava/lang/Throwable;)V

    .line 283
    .line 284
    .line 285
    goto :goto_6

    .line 286
    :catchall_7
    move-exception v0

    .line 287
    goto :goto_8

    .line 288
    :cond_9
    :goto_6
    monitor-exit v2
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 289
    invoke-virtual {v3}, Lv0/q;->b()V

    .line 290
    .line 291
    .line 292
    :goto_7
    return-void

    .line 293
    :goto_8
    :try_start_11
    monitor-exit v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 294
    throw v0

    .line 295
    :goto_9
    :try_start_12
    monitor-exit v6
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    .line 296
    throw v0

    .line 297
    :pswitch_5
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v0, Lu0/d;

    .line 300
    .line 301
    iget-object v0, v0, Lu0/d;->c:Ll/o;

    .line 302
    .line 303
    iget-object v0, v0, Ll/o;->j:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v0, Lu0/d;

    .line 306
    .line 307
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 308
    .line 309
    .line 310
    move-result-wide v6

    .line 311
    iget-object v2, v0, Lu0/d;->b:Ljava/util/ArrayList;

    .line 312
    .line 313
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 314
    .line 315
    .line 316
    move-result-wide v8

    .line 317
    move v10, v5

    .line 318
    :goto_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 319
    .line 320
    .line 321
    move-result v11

    .line 322
    if-ge v10, v11, :cond_17

    .line 323
    .line 324
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v11

    .line 328
    check-cast v11, Lu0/f;

    .line 329
    .line 330
    if-nez v11, :cond_a

    .line 331
    .line 332
    goto/16 :goto_13

    .line 333
    .line 334
    :cond_a
    iget-object v12, v0, Lu0/d;->a:Lp/k;

    .line 335
    .line 336
    invoke-virtual {v12, v11}, Lp/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v13

    .line 340
    check-cast v13, Ljava/lang/Long;

    .line 341
    .line 342
    if-nez v13, :cond_b

    .line 343
    .line 344
    goto :goto_b

    .line 345
    :cond_b
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 346
    .line 347
    .line 348
    move-result-wide v13

    .line 349
    cmp-long v13, v13, v8

    .line 350
    .line 351
    if-gez v13, :cond_16

    .line 352
    .line 353
    invoke-virtual {v12, v11}, Lp/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    :goto_b
    iget-wide v12, v11, Lu0/f;->f:J

    .line 357
    .line 358
    const-wide/16 v14, 0x0

    .line 359
    .line 360
    cmp-long v16, v12, v14

    .line 361
    .line 362
    if-nez v16, :cond_c

    .line 363
    .line 364
    iput-wide v6, v11, Lu0/f;->f:J

    .line 365
    .line 366
    iget v12, v11, Lu0/f;->b:F

    .line 367
    .line 368
    invoke-virtual {v11, v12}, Lu0/f;->c(F)V

    .line 369
    .line 370
    .line 371
    goto/16 :goto_13

    .line 372
    .line 373
    :cond_c
    sub-long v12, v6, v12

    .line 374
    .line 375
    iput-wide v6, v11, Lu0/f;->f:J

    .line 376
    .line 377
    invoke-static {}, Lu0/f;->b()Lu0/d;

    .line 378
    .line 379
    .line 380
    move-result-object v14

    .line 381
    iget v14, v14, Lu0/d;->g:F

    .line 382
    .line 383
    const/4 v15, 0x0

    .line 384
    cmpl-float v18, v14, v15

    .line 385
    .line 386
    if-nez v18, :cond_d

    .line 387
    .line 388
    const-wide/32 v12, 0x7fffffff

    .line 389
    .line 390
    .line 391
    :goto_c
    move-wide/from16 v23, v12

    .line 392
    .line 393
    goto :goto_d

    .line 394
    :cond_d
    long-to-float v12, v12

    .line 395
    div-float/2addr v12, v14

    .line 396
    float-to-long v12, v12

    .line 397
    goto :goto_c

    .line 398
    :goto_d
    iget-boolean v12, v11, Lu0/f;->l:Z

    .line 399
    .line 400
    const v14, 0x7f7fffff    # Float.MAX_VALUE

    .line 401
    .line 402
    .line 403
    if-eqz v12, :cond_f

    .line 404
    .line 405
    iget v12, v11, Lu0/f;->k:F

    .line 406
    .line 407
    cmpl-float v18, v12, v14

    .line 408
    .line 409
    if-eqz v18, :cond_e

    .line 410
    .line 411
    iget-object v3, v11, Lu0/f;->j:Lu0/g;

    .line 412
    .line 413
    float-to-double v4, v12

    .line 414
    iput-wide v4, v3, Lu0/g;->i:D

    .line 415
    .line 416
    iput v14, v11, Lu0/f;->k:F

    .line 417
    .line 418
    :cond_e
    iget-object v3, v11, Lu0/f;->j:Lu0/g;

    .line 419
    .line 420
    iget-wide v3, v3, Lu0/g;->i:D

    .line 421
    .line 422
    double-to-float v3, v3

    .line 423
    iput v3, v11, Lu0/f;->b:F

    .line 424
    .line 425
    iput v15, v11, Lu0/f;->a:F

    .line 426
    .line 427
    const/4 v3, 0x0

    .line 428
    iput-boolean v3, v11, Lu0/f;->l:Z

    .line 429
    .line 430
    :goto_e
    const/4 v3, 0x1

    .line 431
    goto/16 :goto_10

    .line 432
    .line 433
    :cond_f
    iget v3, v11, Lu0/f;->k:F

    .line 434
    .line 435
    cmpl-float v3, v3, v14

    .line 436
    .line 437
    if-eqz v3, :cond_10

    .line 438
    .line 439
    iget-object v3, v11, Lu0/f;->j:Lu0/g;

    .line 440
    .line 441
    iget v4, v11, Lu0/f;->b:F

    .line 442
    .line 443
    float-to-double v4, v4

    .line 444
    iget v12, v11, Lu0/f;->a:F

    .line 445
    .line 446
    float-to-double v13, v12

    .line 447
    const-wide/16 v18, 0x2

    .line 448
    .line 449
    div-long v33, v23, v18

    .line 450
    .line 451
    move-object/from16 v28, v3

    .line 452
    .line 453
    move-wide/from16 v29, v4

    .line 454
    .line 455
    move-wide/from16 v31, v13

    .line 456
    .line 457
    invoke-virtual/range {v28 .. v34}, Lu0/g;->a(DDJ)Lk5/e;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    iget-object v4, v11, Lu0/f;->j:Lu0/g;

    .line 462
    .line 463
    iget v5, v11, Lu0/f;->k:F

    .line 464
    .line 465
    float-to-double v12, v5

    .line 466
    iput-wide v12, v4, Lu0/g;->i:D

    .line 467
    .line 468
    const v5, 0x7f7fffff    # Float.MAX_VALUE

    .line 469
    .line 470
    .line 471
    iput v5, v11, Lu0/f;->k:F

    .line 472
    .line 473
    iget v5, v3, Lk5/e;->a:F

    .line 474
    .line 475
    float-to-double v12, v5

    .line 476
    iget v3, v3, Lk5/e;->b:F

    .line 477
    .line 478
    move-object/from16 v28, v4

    .line 479
    .line 480
    float-to-double v3, v3

    .line 481
    move-wide/from16 v31, v3

    .line 482
    .line 483
    move-wide/from16 v29, v12

    .line 484
    .line 485
    invoke-virtual/range {v28 .. v34}, Lu0/g;->a(DDJ)Lk5/e;

    .line 486
    .line 487
    .line 488
    move-result-object v3

    .line 489
    iget v4, v3, Lk5/e;->a:F

    .line 490
    .line 491
    iput v4, v11, Lu0/f;->b:F

    .line 492
    .line 493
    iget v3, v3, Lk5/e;->b:F

    .line 494
    .line 495
    iput v3, v11, Lu0/f;->a:F

    .line 496
    .line 497
    goto :goto_f

    .line 498
    :cond_10
    iget-object v3, v11, Lu0/f;->j:Lu0/g;

    .line 499
    .line 500
    iget v4, v11, Lu0/f;->b:F

    .line 501
    .line 502
    float-to-double v4, v4

    .line 503
    iget v12, v11, Lu0/f;->a:F

    .line 504
    .line 505
    float-to-double v12, v12

    .line 506
    move-object/from16 v18, v3

    .line 507
    .line 508
    move-wide/from16 v19, v4

    .line 509
    .line 510
    move-wide/from16 v21, v12

    .line 511
    .line 512
    invoke-virtual/range {v18 .. v24}, Lu0/g;->a(DDJ)Lk5/e;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    iget v4, v3, Lk5/e;->a:F

    .line 517
    .line 518
    iput v4, v11, Lu0/f;->b:F

    .line 519
    .line 520
    iget v3, v3, Lk5/e;->b:F

    .line 521
    .line 522
    iput v3, v11, Lu0/f;->a:F

    .line 523
    .line 524
    :goto_f
    iget v3, v11, Lu0/f;->b:F

    .line 525
    .line 526
    const v4, -0x800001

    .line 527
    .line 528
    .line 529
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 530
    .line 531
    .line 532
    move-result v3

    .line 533
    iput v3, v11, Lu0/f;->b:F

    .line 534
    .line 535
    const v5, 0x7f7fffff    # Float.MAX_VALUE

    .line 536
    .line 537
    .line 538
    invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F

    .line 539
    .line 540
    .line 541
    move-result v3

    .line 542
    iput v3, v11, Lu0/f;->b:F

    .line 543
    .line 544
    iget v4, v11, Lu0/f;->a:F

    .line 545
    .line 546
    iget-object v5, v11, Lu0/f;->j:Lu0/g;

    .line 547
    .line 548
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 552
    .line 553
    .line 554
    move-result v4

    .line 555
    float-to-double v12, v4

    .line 556
    move v14, v3

    .line 557
    iget-wide v3, v5, Lu0/g;->e:D

    .line 558
    .line 559
    cmpg-double v3, v12, v3

    .line 560
    .line 561
    if-gez v3, :cond_11

    .line 562
    .line 563
    iget-wide v3, v5, Lu0/g;->i:D

    .line 564
    .line 565
    double-to-float v3, v3

    .line 566
    sub-float v3, v14, v3

    .line 567
    .line 568
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 569
    .line 570
    .line 571
    move-result v3

    .line 572
    float-to-double v3, v3

    .line 573
    iget-wide v12, v5, Lu0/g;->d:D

    .line 574
    .line 575
    cmpg-double v3, v3, v12

    .line 576
    .line 577
    if-gez v3, :cond_11

    .line 578
    .line 579
    iget-object v3, v11, Lu0/f;->j:Lu0/g;

    .line 580
    .line 581
    iget-wide v3, v3, Lu0/g;->i:D

    .line 582
    .line 583
    double-to-float v3, v3

    .line 584
    iput v3, v11, Lu0/f;->b:F

    .line 585
    .line 586
    iput v15, v11, Lu0/f;->a:F

    .line 587
    .line 588
    goto/16 :goto_e

    .line 589
    .line 590
    :cond_11
    const/4 v3, 0x0

    .line 591
    :goto_10
    iget v4, v11, Lu0/f;->b:F

    .line 592
    .line 593
    const v5, 0x7f7fffff    # Float.MAX_VALUE

    .line 594
    .line 595
    .line 596
    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    .line 597
    .line 598
    .line 599
    move-result v4

    .line 600
    iput v4, v11, Lu0/f;->b:F

    .line 601
    .line 602
    const v5, -0x800001

    .line 603
    .line 604
    .line 605
    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    .line 606
    .line 607
    .line 608
    move-result v4

    .line 609
    iput v4, v11, Lu0/f;->b:F

    .line 610
    .line 611
    invoke-virtual {v11, v4}, Lu0/f;->c(F)V

    .line 612
    .line 613
    .line 614
    if-eqz v3, :cond_16

    .line 615
    .line 616
    iget-object v3, v11, Lu0/f;->h:Ljava/util/ArrayList;

    .line 617
    .line 618
    const/4 v4, 0x0

    .line 619
    iput-boolean v4, v11, Lu0/f;->e:Z

    .line 620
    .line 621
    invoke-static {}, Lu0/f;->b()Lu0/d;

    .line 622
    .line 623
    .line 624
    move-result-object v4

    .line 625
    iget-object v5, v4, Lu0/d;->a:Lp/k;

    .line 626
    .line 627
    invoke-virtual {v5, v11}, Lp/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    iget-object v5, v4, Lu0/d;->b:Ljava/util/ArrayList;

    .line 631
    .line 632
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 633
    .line 634
    .line 635
    move-result v12

    .line 636
    if-ltz v12, :cond_12

    .line 637
    .line 638
    const/4 v13, 0x0

    .line 639
    invoke-virtual {v5, v12, v13}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    const/4 v5, 0x1

    .line 643
    iput-boolean v5, v4, Lu0/d;->f:Z

    .line 644
    .line 645
    :cond_12
    const-wide/16 v4, 0x0

    .line 646
    .line 647
    iput-wide v4, v11, Lu0/f;->f:J

    .line 648
    .line 649
    const/4 v4, 0x0

    .line 650
    :goto_11
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 651
    .line 652
    .line 653
    move-result v5

    .line 654
    if-ge v4, v5, :cond_14

    .line 655
    .line 656
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v5

    .line 660
    if-nez v5, :cond_13

    .line 661
    .line 662
    add-int/lit8 v4, v4, 0x1

    .line 663
    .line 664
    goto :goto_11

    .line 665
    :cond_13
    invoke-static {v4, v3}, La1/a1;->f(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    throw v0

    .line 670
    :cond_14
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 671
    .line 672
    .line 673
    move-result v4

    .line 674
    const/16 v25, 0x1

    .line 675
    .line 676
    add-int/lit8 v4, v4, -0x1

    .line 677
    .line 678
    :goto_12
    if-ltz v4, :cond_16

    .line 679
    .line 680
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v5

    .line 684
    if-nez v5, :cond_15

    .line 685
    .line 686
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    :cond_15
    add-int/lit8 v4, v4, -0x1

    .line 690
    .line 691
    goto :goto_12

    .line 692
    :cond_16
    :goto_13
    add-int/lit8 v10, v10, 0x1

    .line 693
    .line 694
    const/4 v4, 0x0

    .line 695
    const/4 v5, 0x0

    .line 696
    goto/16 :goto_a

    .line 697
    .line 698
    :cond_17
    iget-boolean v3, v0, Lu0/d;->f:Z

    .line 699
    .line 700
    if-eqz v3, :cond_1b

    .line 701
    .line 702
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 703
    .line 704
    .line 705
    move-result v3

    .line 706
    const/16 v25, 0x1

    .line 707
    .line 708
    add-int/lit8 v3, v3, -0x1

    .line 709
    .line 710
    :goto_14
    if-ltz v3, :cond_19

    .line 711
    .line 712
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v4

    .line 716
    if-nez v4, :cond_18

    .line 717
    .line 718
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    :cond_18
    add-int/lit8 v3, v3, -0x1

    .line 722
    .line 723
    goto :goto_14

    .line 724
    :cond_19
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 725
    .line 726
    .line 727
    move-result v3

    .line 728
    if-nez v3, :cond_1a

    .line 729
    .line 730
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 731
    .line 732
    const/16 v4, 0x21

    .line 733
    .line 734
    if-lt v3, v4, :cond_1a

    .line 735
    .line 736
    iget-object v3, v0, Lu0/d;->h:Lu0/b;

    .line 737
    .line 738
    invoke-virtual {v3}, Lu0/b;->a()Z

    .line 739
    .line 740
    .line 741
    :cond_1a
    const/4 v3, 0x0

    .line 742
    iput-boolean v3, v0, Lu0/d;->f:Z

    .line 743
    .line 744
    :cond_1b
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 745
    .line 746
    .line 747
    move-result v2

    .line 748
    if-lez v2, :cond_1c

    .line 749
    .line 750
    iget-object v2, v0, Lu0/d;->e:Ls/e;

    .line 751
    .line 752
    iget-object v0, v0, Lu0/d;->d:Landroidx/lifecycle/c0;

    .line 753
    .line 754
    iget-object v2, v2, Ls/e;->k:Ljava/lang/Object;

    .line 755
    .line 756
    check-cast v2, Landroid/view/Choreographer;

    .line 757
    .line 758
    new-instance v3, Lu0/c;

    .line 759
    .line 760
    invoke-direct {v3, v0}, Lu0/c;-><init>(Ljava/lang/Runnable;)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {v2, v3}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 764
    .line 765
    .line 766
    :cond_1c
    return-void

    .line 767
    :pswitch_6
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 768
    .line 769
    check-cast v0, Lp0/d;

    .line 770
    .line 771
    iget-object v0, v0, Lp0/d;->a:Lp0/b;

    .line 772
    .line 773
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 774
    .line 775
    .line 776
    move-result-object v2

    .line 777
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 778
    .line 779
    if-eqz v3, :cond_1d

    .line 780
    .line 781
    check-cast v2, Landroid/view/ViewGroup;

    .line 782
    .line 783
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 784
    .line 785
    .line 786
    :cond_1d
    return-void

    .line 787
    :pswitch_7
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 788
    .line 789
    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 790
    .line 791
    invoke-virtual {v0}, Lz2/f0;->n0()V

    .line 792
    .line 793
    .line 794
    return-void

    .line 795
    :pswitch_8
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 796
    .line 797
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 798
    .line 799
    invoke-static {v0}, Lcom/google/android/material/button/MaterialButton;->b(Lcom/google/android/material/button/MaterialButton;)V

    .line 800
    .line 801
    .line 802
    return-void

    .line 803
    :pswitch_9
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 804
    .line 805
    check-cast v0, Landroid/widget/LinearLayout;

    .line 806
    .line 807
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 808
    .line 809
    .line 810
    return-void

    .line 811
    :pswitch_a
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 812
    .line 813
    check-cast v0, Lcom/exotv/net/ui/AdActivity;

    .line 814
    .line 815
    iget-object v0, v0, Lcom/exotv/net/ui/AdActivity;->I:Landroid/widget/Button;

    .line 816
    .line 817
    if-eqz v0, :cond_1e

    .line 818
    .line 819
    invoke-virtual {v0}, Landroid/view/View;->requestFocusFromTouch()Z

    .line 820
    .line 821
    .line 822
    return-void

    .line 823
    :cond_1e
    const-string v0, "close"

    .line 824
    .line 825
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 826
    .line 827
    .line 828
    const/16 v26, 0x0

    .line 829
    .line 830
    throw v26

    .line 831
    :pswitch_b
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 832
    .line 833
    check-cast v0, Landroid/webkit/WebView;

    .line 834
    .line 835
    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 836
    .line 837
    .line 838
    return-void

    .line 839
    :pswitch_c
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 840
    .line 841
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 842
    .line 843
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->n:Landroid/widget/EditText;

    .line 844
    .line 845
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 846
    .line 847
    .line 848
    return-void

    .line 849
    :pswitch_d
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 850
    .line 851
    check-cast v0, Lb6/o;

    .line 852
    .line 853
    iget-object v2, v0, Lb6/o;->h:Landroid/widget/AutoCompleteTextView;

    .line 854
    .line 855
    invoke-virtual {v2}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    .line 856
    .line 857
    .line 858
    move-result v2

    .line 859
    invoke-virtual {v0, v2}, Lb6/o;->s(Z)V

    .line 860
    .line 861
    .line 862
    iput-boolean v2, v0, Lb6/o;->m:Z

    .line 863
    .line 864
    return-void

    .line 865
    :pswitch_e
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 866
    .line 867
    check-cast v0, Lb6/e;

    .line 868
    .line 869
    const/4 v5, 0x1

    .line 870
    invoke-virtual {v0, v5}, Lb6/e;->s(Z)V

    .line 871
    .line 872
    .line 873
    return-void

    .line 874
    :pswitch_f
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 875
    .line 876
    move-object v3, v0

    .line 877
    check-cast v3, Landroid/app/Activity;

    .line 878
    .line 879
    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    .line 880
    .line 881
    .line 882
    move-result v0

    .line 883
    if-nez v0, :cond_28

    .line 884
    .line 885
    sget-object v4, Lb0/b;->g:Landroid/os/Handler;

    .line 886
    .line 887
    sget-object v0, Lb0/b;->f:Ljava/lang/reflect/Method;

    .line 888
    .line 889
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 890
    .line 891
    const/16 v6, 0x1c

    .line 892
    .line 893
    if-lt v5, v6, :cond_1f

    .line 894
    .line 895
    invoke-virtual {v3}, Landroid/app/Activity;->recreate()V

    .line 896
    .line 897
    .line 898
    goto/16 :goto_1a

    .line 899
    .line 900
    :cond_1f
    const/16 v6, 0x1b

    .line 901
    .line 902
    const/16 v7, 0x1a

    .line 903
    .line 904
    if-eq v5, v7, :cond_20

    .line 905
    .line 906
    if-ne v5, v6, :cond_21

    .line 907
    .line 908
    :cond_20
    if-nez v0, :cond_21

    .line 909
    .line 910
    goto/16 :goto_19

    .line 911
    .line 912
    :cond_21
    sget-object v8, Lb0/b;->e:Ljava/lang/reflect/Method;

    .line 913
    .line 914
    if-nez v8, :cond_22

    .line 915
    .line 916
    sget-object v8, Lb0/b;->d:Ljava/lang/reflect/Method;

    .line 917
    .line 918
    if-nez v8, :cond_22

    .line 919
    .line 920
    goto/16 :goto_19

    .line 921
    .line 922
    :cond_22
    :try_start_13
    sget-object v8, Lb0/b;->c:Ljava/lang/reflect/Field;

    .line 923
    .line 924
    invoke-virtual {v8, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 925
    .line 926
    .line 927
    move-result-object v9

    .line 928
    if-nez v9, :cond_23

    .line 929
    .line 930
    goto/16 :goto_19

    .line 931
    .line 932
    :cond_23
    sget-object v8, Lb0/b;->b:Ljava/lang/reflect/Field;

    .line 933
    .line 934
    invoke-virtual {v8, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 935
    .line 936
    .line 937
    move-result-object v8

    .line 938
    if-nez v8, :cond_24

    .line 939
    .line 940
    goto :goto_19

    .line 941
    :cond_24
    invoke-virtual {v3}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 942
    .line 943
    .line 944
    move-result-object v10

    .line 945
    new-instance v11, Lb0/a;

    .line 946
    .line 947
    invoke-direct {v11, v3}, Lb0/a;-><init>(Landroid/app/Activity;)V

    .line 948
    .line 949
    .line 950
    invoke-virtual {v10, v11}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 951
    .line 952
    .line 953
    new-instance v12, Lj6/q;

    .line 954
    .line 955
    invoke-direct {v12, v11, v2, v9}, Lj6/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 956
    .line 957
    .line 958
    invoke-virtual {v4, v12}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_a

    .line 959
    .line 960
    .line 961
    if-eq v5, v7, :cond_26

    .line 962
    .line 963
    if-ne v5, v6, :cond_25

    .line 964
    .line 965
    goto :goto_15

    .line 966
    :cond_25
    const/16 v25, 0x0

    .line 967
    .line 968
    goto :goto_16

    .line 969
    :cond_26
    :goto_15
    const/16 v25, 0x1

    .line 970
    .line 971
    :goto_16
    const/4 v2, 0x3

    .line 972
    if-eqz v25, :cond_27

    .line 973
    .line 974
    const/16 v27, 0x0

    .line 975
    .line 976
    :try_start_14
    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 977
    .line 978
    .line 979
    move-result-object v12

    .line 980
    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_9

    .line 981
    .line 982
    const/4 v14, 0x0

    .line 983
    const/4 v15, 0x0

    .line 984
    move-object v5, v10

    .line 985
    const/4 v10, 0x0

    .line 986
    move-object v6, v11

    .line 987
    const/4 v11, 0x0

    .line 988
    move-object/from16 v16, v13

    .line 989
    .line 990
    move-object/from16 v17, v13

    .line 991
    .line 992
    :try_start_15
    filled-new-array/range {v9 .. v17}, [Ljava/lang/Object;

    .line 993
    .line 994
    .line 995
    move-result-object v7

    .line 996
    invoke-virtual {v0, v8, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 997
    .line 998
    .line 999
    goto :goto_17

    .line 1000
    :catchall_8
    move-exception v0

    .line 1001
    goto :goto_18

    .line 1002
    :catchall_9
    move-exception v0

    .line 1003
    move-object v5, v10

    .line 1004
    move-object v6, v11

    .line 1005
    goto :goto_18

    .line 1006
    :cond_27
    move-object v5, v10

    .line 1007
    move-object v6, v11

    .line 1008
    invoke-virtual {v3}, Landroid/app/Activity;->recreate()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_8

    .line 1009
    .line 1010
    .line 1011
    :goto_17
    :try_start_16
    new-instance v0, Lj6/q;

    .line 1012
    .line 1013
    invoke-direct {v0, v5, v2, v6}, Lj6/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v4, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1017
    .line 1018
    .line 1019
    goto :goto_1a

    .line 1020
    :goto_18
    new-instance v7, Lj6/q;

    .line 1021
    .line 1022
    invoke-direct {v7, v5, v2, v6}, Lj6/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {v4, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1026
    .line 1027
    .line 1028
    throw v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_a

    .line 1029
    :catchall_a
    :goto_19
    invoke-virtual {v3}, Landroid/app/Activity;->recreate()V

    .line 1030
    .line 1031
    .line 1032
    :cond_28
    :goto_1a
    return-void

    .line 1033
    :pswitch_10
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 1034
    .line 1035
    check-cast v0, Lb/m;

    .line 1036
    .line 1037
    invoke-static {v0}, Lb/m;->a(Lb/m;)V

    .line 1038
    .line 1039
    .line 1040
    return-void

    .line 1041
    :pswitch_11
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 1042
    .line 1043
    check-cast v0, Lb/i;

    .line 1044
    .line 1045
    const-string v2, "this$0"

    .line 1046
    .line 1047
    invoke-static {v2, v0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1048
    .line 1049
    .line 1050
    iget-object v2, v0, Lb/i;->k:Ljava/lang/Runnable;

    .line 1051
    .line 1052
    if-eqz v2, :cond_29

    .line 1053
    .line 1054
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 1055
    .line 1056
    .line 1057
    const/4 v13, 0x0

    .line 1058
    iput-object v13, v0, Lb/i;->k:Ljava/lang/Runnable;

    .line 1059
    .line 1060
    :cond_29
    return-void

    .line 1061
    :pswitch_12
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 1062
    .line 1063
    check-cast v0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 1064
    .line 1065
    invoke-static {v0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->b(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)V

    .line 1066
    .line 1067
    .line 1068
    return-void

    .line 1069
    :pswitch_13
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 1070
    .line 1071
    check-cast v0, Landroidx/media3/exoplayer/source/preload/DefaultPreloadManager;

    .line 1072
    .line 1073
    invoke-static {v0}, Landroidx/media3/exoplayer/source/preload/DefaultPreloadManager;->h(Landroidx/media3/exoplayer/source/preload/DefaultPreloadManager;)V

    .line 1074
    .line 1075
    .line 1076
    return-void

    .line 1077
    :pswitch_14
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 1078
    .line 1079
    check-cast v0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource;

    .line 1080
    .line 1081
    invoke-static {v0}, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource;->a(Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource;)V

    .line 1082
    .line 1083
    .line 1084
    return-void

    .line 1085
    :pswitch_15
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 1086
    .line 1087
    check-cast v0, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;

    .line 1088
    .line 1089
    invoke-static {v0}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->Q(Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;)V

    .line 1090
    .line 1091
    .line 1092
    return-void

    .line 1093
    :pswitch_16
    iget-object v0, v1, Landroidx/lifecycle/c0;->k:Ljava/lang/Object;

    .line 1094
    .line 1095
    check-cast v0, Landroidx/lifecycle/f0;

    .line 1096
    .line 1097
    iget-object v2, v0, Landroidx/lifecycle/f0;->o:Landroidx/lifecycle/x;

    .line 1098
    .line 1099
    iget v3, v0, Landroidx/lifecycle/f0;->k:I

    .line 1100
    .line 1101
    if-nez v3, :cond_2a

    .line 1102
    .line 1103
    const/4 v5, 0x1

    .line 1104
    iput-boolean v5, v0, Landroidx/lifecycle/f0;->l:Z

    .line 1105
    .line 1106
    sget-object v3, Landroidx/lifecycle/m;->ON_PAUSE:Landroidx/lifecycle/m;

    .line 1107
    .line 1108
    invoke-virtual {v2, v3}, Landroidx/lifecycle/x;->l(Landroidx/lifecycle/m;)V

    .line 1109
    .line 1110
    .line 1111
    goto :goto_1b

    .line 1112
    :cond_2a
    const/4 v5, 0x1

    .line 1113
    :goto_1b
    iget v3, v0, Landroidx/lifecycle/f0;->j:I

    .line 1114
    .line 1115
    if-nez v3, :cond_2b

    .line 1116
    .line 1117
    iget-boolean v3, v0, Landroidx/lifecycle/f0;->l:Z

    .line 1118
    .line 1119
    if-eqz v3, :cond_2b

    .line 1120
    .line 1121
    sget-object v3, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 1122
    .line 1123
    invoke-virtual {v2, v3}, Landroidx/lifecycle/x;->l(Landroidx/lifecycle/m;)V

    .line 1124
    .line 1125
    .line 1126
    iput-boolean v5, v0, Landroidx/lifecycle/f0;->m:Z

    .line 1127
    .line 1128
    :cond_2b
    return-void

    .line 1129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
