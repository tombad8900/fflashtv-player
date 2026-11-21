.class public final synthetic Lh7/q;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lh7/q;->j:I

    .line 2
    .line 3
    iput-object p2, p0, Lh7/q;->k:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lh7/q;->j:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lh7/q;->k:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lcom/exotv/net/MainActivity;

    .line 11
    .line 12
    move-object/from16 v2, p1

    .line 13
    .line 14
    check-cast v2, Ljava/lang/Long;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    move-object/from16 v4, p2

    .line 21
    .line 22
    check-cast v4, Ljava/lang/Long;

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    const-wide/16 v6, 0x0

    .line 29
    .line 30
    cmp-long v6, v4, v6

    .line 31
    .line 32
    const/4 v7, 0x0

    .line 33
    const-string v8, "b"

    .line 34
    .line 35
    if-gtz v6, :cond_2

    .line 36
    .line 37
    iget-object v2, v1, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    iget-object v2, v2, La5/a;->f:Landroid/widget/ProgressBar;

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    invoke-virtual {v2, v3}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 45
    .line 46
    .line 47
    iget-object v2, v1, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 48
    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    iget-object v2, v2, La5/a;->e:Landroid/widget/TextView;

    .line 52
    .line 53
    const v3, 0x7f110045

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-static {v8}, Lz6/h;->h(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v7

    .line 68
    :cond_1
    invoke-static {v8}, Lz6/h;->h(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v7

    .line 72
    :cond_2
    iget-object v6, v1, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 73
    .line 74
    if-eqz v6, :cond_5

    .line 75
    .line 76
    iget-object v6, v6, La5/a;->f:Landroid/widget/ProgressBar;

    .line 77
    .line 78
    const/4 v9, 0x0

    .line 79
    invoke-virtual {v6, v9}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 80
    .line 81
    .line 82
    const/16 v6, 0x64

    .line 83
    .line 84
    int-to-long v10, v6

    .line 85
    mul-long/2addr v2, v10

    .line 86
    div-long/2addr v2, v4

    .line 87
    long-to-int v2, v2

    .line 88
    invoke-static {v2, v9, v6}, Lcom/bumptech/glide/c;->t(III)I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    iget-object v3, v1, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 93
    .line 94
    if-eqz v3, :cond_4

    .line 95
    .line 96
    iget-object v3, v3, La5/a;->f:Landroid/widget/ProgressBar;

    .line 97
    .line 98
    invoke-virtual {v3, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 99
    .line 100
    .line 101
    iget-object v3, v1, Lcom/exotv/net/MainActivity;->P:La5/a;

    .line 102
    .line 103
    if-eqz v3, :cond_3

    .line 104
    .line 105
    iget-object v3, v3, La5/a;->e:Landroid/widget/TextView;

    .line 106
    .line 107
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    const v4, 0x7f110044

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, v4, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 123
    .line 124
    .line 125
    :goto_0
    sget-object v1, Ll6/j;->a:Ll6/j;

    .line 126
    .line 127
    return-object v1

    .line 128
    :cond_3
    invoke-static {v8}, Lz6/h;->h(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v7

    .line 132
    :cond_4
    invoke-static {v8}, Lz6/h;->h(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v7

    .line 136
    :cond_5
    invoke-static {v8}, Lz6/h;->h(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw v7

    .line 140
    :pswitch_0
    iget-object v1, v0, Lh7/q;->k:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v1, Ljava/util/List;

    .line 143
    .line 144
    move-object/from16 v4, p1

    .line 145
    .line 146
    check-cast v4, Ljava/lang/CharSequence;

    .line 147
    .line 148
    move-object/from16 v2, p2

    .line 149
    .line 150
    check-cast v2, Ljava/lang/Integer;

    .line 151
    .line 152
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    const-string v3, "$this$DelimitedRangesSequence"

    .line 157
    .line 158
    invoke-static {v3, v4}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    const/4 v5, 0x0

    .line 166
    const/4 v6, 0x1

    .line 167
    const/4 v8, 0x0

    .line 168
    if-ne v3, v6, :cond_a

    .line 169
    .line 170
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-eqz v3, :cond_9

    .line 175
    .line 176
    if-ne v3, v6, :cond_8

    .line 177
    .line 178
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    check-cast v1, Ljava/lang/String;

    .line 183
    .line 184
    const/4 v3, 0x4

    .line 185
    invoke-static {v4, v1, v2, v5, v3}, Lh7/h;->B0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-gez v2, :cond_7

    .line 190
    .line 191
    :cond_6
    move-object v3, v8

    .line 192
    goto/16 :goto_6

    .line 193
    .line 194
    :cond_7
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    new-instance v3, Ll6/d;

    .line 199
    .line 200
    invoke-direct {v3, v2, v1}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    goto/16 :goto_6

    .line 204
    .line 205
    :cond_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 206
    .line 207
    const-string v2, "List has more than one element."

    .line 208
    .line 209
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw v1

    .line 213
    :cond_9
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 214
    .line 215
    const-string v2, "List is empty."

    .line 216
    .line 217
    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw v1

    .line 221
    :cond_a
    new-instance v3, Le7/c;

    .line 222
    .line 223
    if-gez v2, :cond_b

    .line 224
    .line 225
    move v2, v5

    .line 226
    :cond_b
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 227
    .line 228
    .line 229
    move-result v5

    .line 230
    invoke-direct {v3, v2, v5, v6}, Le7/a;-><init>(III)V

    .line 231
    .line 232
    .line 233
    instance-of v5, v4, Ljava/lang/String;

    .line 234
    .line 235
    const/4 v14, 0x0

    .line 236
    iget v15, v3, Le7/a;->l:I

    .line 237
    .line 238
    iget v3, v3, Le7/a;->k:I

    .line 239
    .line 240
    if-eqz v5, :cond_11

    .line 241
    .line 242
    if-lez v15, :cond_c

    .line 243
    .line 244
    if-le v2, v3, :cond_d

    .line 245
    .line 246
    :cond_c
    if-gez v15, :cond_6

    .line 247
    .line 248
    if-gt v3, v2, :cond_6

    .line 249
    .line 250
    :cond_d
    move v10, v2

    .line 251
    :goto_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    :cond_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    if-eqz v5, :cond_f

    .line 260
    .line 261
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    move-object v12, v5

    .line 266
    check-cast v12, Ljava/lang/String;

    .line 267
    .line 268
    move-object v13, v4

    .line 269
    check-cast v13, Ljava/lang/String;

    .line 270
    .line 271
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 272
    .line 273
    .line 274
    move-result v11

    .line 275
    const/4 v9, 0x0

    .line 276
    invoke-static/range {v9 .. v14}, Lh7/p;->o0(IIILjava/lang/String;Ljava/lang/String;Z)Z

    .line 277
    .line 278
    .line 279
    move-result v6

    .line 280
    if-eqz v6, :cond_e

    .line 281
    .line 282
    goto :goto_2

    .line 283
    :cond_f
    move-object v5, v8

    .line 284
    :goto_2
    check-cast v5, Ljava/lang/String;

    .line 285
    .line 286
    if-eqz v5, :cond_10

    .line 287
    .line 288
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    new-instance v3, Ll6/d;

    .line 293
    .line 294
    invoke-direct {v3, v1, v5}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    goto :goto_6

    .line 298
    :cond_10
    if-eq v10, v3, :cond_6

    .line 299
    .line 300
    add-int/2addr v10, v15

    .line 301
    goto :goto_1

    .line 302
    :cond_11
    if-lez v15, :cond_12

    .line 303
    .line 304
    if-le v2, v3, :cond_13

    .line 305
    .line 306
    :cond_12
    if-gez v15, :cond_6

    .line 307
    .line 308
    if-gt v3, v2, :cond_6

    .line 309
    .line 310
    :cond_13
    move v5, v2

    .line 311
    :goto_3
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 312
    .line 313
    .line 314
    move-result-object v9

    .line 315
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    if-eqz v2, :cond_15

    .line 320
    .line 321
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v10

    .line 325
    move-object v2, v10

    .line 326
    check-cast v2, Ljava/lang/String;

    .line 327
    .line 328
    move v6, v3

    .line 329
    const/4 v3, 0x0

    .line 330
    move v7, v6

    .line 331
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 332
    .line 333
    .line 334
    move-result v6

    .line 335
    move v11, v7

    .line 336
    move v7, v14

    .line 337
    invoke-static/range {v2 .. v7}, Lh7/h;->H0(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    .line 338
    .line 339
    .line 340
    move-result v2

    .line 341
    if-eqz v2, :cond_14

    .line 342
    .line 343
    goto :goto_5

    .line 344
    :cond_14
    move v3, v11

    .line 345
    goto :goto_4

    .line 346
    :cond_15
    move v11, v3

    .line 347
    move-object v10, v8

    .line 348
    :goto_5
    check-cast v10, Ljava/lang/String;

    .line 349
    .line 350
    if-eqz v10, :cond_16

    .line 351
    .line 352
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    new-instance v3, Ll6/d;

    .line 357
    .line 358
    invoke-direct {v3, v1, v10}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    goto :goto_6

    .line 362
    :cond_16
    if-eq v5, v11, :cond_6

    .line 363
    .line 364
    add-int/2addr v5, v15

    .line 365
    move v3, v11

    .line 366
    goto :goto_3

    .line 367
    :goto_6
    if-eqz v3, :cond_17

    .line 368
    .line 369
    iget-object v1, v3, Ll6/d;->j:Ljava/lang/Object;

    .line 370
    .line 371
    iget-object v2, v3, Ll6/d;->k:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v2, Ljava/lang/String;

    .line 374
    .line 375
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 376
    .line 377
    .line 378
    move-result v2

    .line 379
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    new-instance v8, Ll6/d;

    .line 384
    .line 385
    invoke-direct {v8, v1, v2}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    :cond_17
    return-object v8

    .line 389
    :pswitch_1
    iget-object v1, v0, Lh7/q;->k:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v1, [C

    .line 392
    .line 393
    move-object/from16 v2, p1

    .line 394
    .line 395
    check-cast v2, Ljava/lang/CharSequence;

    .line 396
    .line 397
    move-object/from16 v3, p2

    .line 398
    .line 399
    check-cast v3, Ljava/lang/Integer;

    .line 400
    .line 401
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 402
    .line 403
    .line 404
    move-result v3

    .line 405
    const-string v4, "$this$DelimitedRangesSequence"

    .line 406
    .line 407
    invoke-static {v4, v2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    const/4 v4, 0x0

    .line 411
    invoke-static {v2, v1, v3, v4}, Lh7/h;->C0(Ljava/lang/CharSequence;[CIZ)I

    .line 412
    .line 413
    .line 414
    move-result v1

    .line 415
    if-gez v1, :cond_18

    .line 416
    .line 417
    const/4 v1, 0x0

    .line 418
    goto :goto_7

    .line 419
    :cond_18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    const/4 v2, 0x1

    .line 424
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    new-instance v3, Ll6/d;

    .line 429
    .line 430
    invoke-direct {v3, v1, v2}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    move-object v1, v3

    .line 434
    :goto_7
    return-object v1

    .line 435
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
