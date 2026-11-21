.class public final Lc2/d;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc2/d;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lc2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lz2/d1;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iput v1, v0, Lz2/d1;->j:I

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iput v1, v0, Lz2/d1;->k:I

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iput v1, v0, Lz2/d1;->l:I

    .line 28
    .line 29
    if-lez v1, :cond_0

    .line 30
    .line 31
    new-array v1, v1, [I

    .line 32
    .line 33
    iput-object v1, v0, Lz2/d1;->m:[I

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iput v1, v0, Lz2/d1;->n:I

    .line 43
    .line 44
    if-lez v1, :cond_1

    .line 45
    .line 46
    new-array v1, v1, [I

    .line 47
    .line 48
    iput-object v1, v0, Lz2/d1;->o:[I

    .line 49
    .line 50
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    const/4 v2, 0x0

    .line 58
    const/4 v3, 0x1

    .line 59
    if-ne v1, v3, :cond_2

    .line 60
    .line 61
    move v1, v3

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    move v1, v2

    .line 64
    :goto_0
    iput-boolean v1, v0, Lz2/d1;->q:Z

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-ne v1, v3, :cond_3

    .line 71
    .line 72
    move v1, v3

    .line 73
    goto :goto_1

    .line 74
    :cond_3
    move v1, v2

    .line 75
    :goto_1
    iput-boolean v1, v0, Lz2/d1;->r:Z

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-ne v1, v3, :cond_4

    .line 82
    .line 83
    move v2, v3

    .line 84
    :cond_4
    iput-boolean v2, v0, Lz2/d1;->s:Z

    .line 85
    .line 86
    const-class v1, Lz2/c1;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iput-object p1, v0, Lz2/d1;->p:Ljava/util/ArrayList;

    .line 97
    .line 98
    return-object v0

    .line 99
    :pswitch_0
    new-instance v0, Lz2/c1;

    .line 100
    .line 101
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    iput v1, v0, Lz2/c1;->j:I

    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    iput v1, v0, Lz2/c1;->k:I

    .line 115
    .line 116
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    const/4 v2, 0x1

    .line 121
    if-ne v1, v2, :cond_5

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_5
    const/4 v2, 0x0

    .line 125
    :goto_2
    iput-boolean v2, v0, Lz2/c1;->m:Z

    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-lez v1, :cond_6

    .line 132
    .line 133
    new-array v1, v1, [I

    .line 134
    .line 135
    iput-object v1, v0, Lz2/c1;->l:[I

    .line 136
    .line 137
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    .line 138
    .line 139
    .line 140
    :cond_6
    return-object v0

    .line 141
    :pswitch_1
    new-instance v0, Lz2/q;

    .line 142
    .line 143
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    iput v1, v0, Lz2/q;->j:I

    .line 151
    .line 152
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    iput v1, v0, Lz2/q;->k:I

    .line 157
    .line 158
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    const/4 v1, 0x1

    .line 163
    if-ne p1, v1, :cond_7

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_7
    const/4 v1, 0x0

    .line 167
    :goto_3
    iput-boolean v1, v0, Lz2/q;->l:Z

    .line 168
    .line 169
    return-object v0

    .line 170
    :pswitch_2
    new-instance v0, Lz1/b;

    .line 171
    .line 172
    invoke-direct {v0, p1}, Lz1/b;-><init>(Landroid/os/Parcel;)V

    .line 173
    .line 174
    .line 175
    return-object v0

    .line 176
    :pswitch_3
    new-instance v0, Lz1/a;

    .line 177
    .line 178
    invoke-direct {v0, p1}, Lz1/a;-><init>(Landroid/os/Parcel;)V

    .line 179
    .line 180
    .line 181
    return-object v0

    .line 182
    :pswitch_4
    new-instance v0, Ly1/a;

    .line 183
    .line 184
    invoke-direct {v0, p1}, Ly1/a;-><init>(Landroid/os/Parcel;)V

    .line 185
    .line 186
    .line 187
    return-object v0

    .line 188
    :pswitch_5
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    new-instance v1, Lx1/a;

    .line 200
    .line 201
    invoke-direct {v1, p1, v0}, Lx1/a;-><init>(ILjava/lang/String;)V

    .line 202
    .line 203
    .line 204
    return-object v1

    .line 205
    :pswitch_6
    new-instance v0, Lq0/g;

    .line 206
    .line 207
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    iput p1, v0, Lq0/g;->j:I

    .line 215
    .line 216
    return-object v0

    .line 217
    :pswitch_7
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 229
    .line 230
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 231
    .line 232
    .line 233
    const/4 v3, 0x0

    .line 234
    :goto_4
    if-ge v3, v1, :cond_8

    .line 235
    .line 236
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    invoke-static {v4}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    invoke-static {v5}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    add-int/lit8 v3, v3, 0x1

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_8
    new-instance p1, Lp3/a;

    .line 257
    .line 258
    invoke-direct {p1, v0, v2}, Lp3/a;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 259
    .line 260
    .line 261
    return-object p1

    .line 262
    :pswitch_8
    new-instance v0, Lm/l0;

    .line 263
    .line 264
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 268
    .line 269
    .line 270
    move-result p1

    .line 271
    if-eqz p1, :cond_9

    .line 272
    .line 273
    const/4 p1, 0x1

    .line 274
    goto :goto_5

    .line 275
    :cond_9
    const/4 p1, 0x0

    .line 276
    :goto_5
    iput-boolean p1, v0, Lm/l0;->j:Z

    .line 277
    .line 278
    return-object v0

    .line 279
    :pswitch_9
    new-instance v0, Ll5/b;

    .line 280
    .line 281
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 282
    .line 283
    .line 284
    const-class v1, Ll5/b;

    .line 285
    .line 286
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    check-cast p1, Ljava/lang/Integer;

    .line 295
    .line 296
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 297
    .line 298
    .line 299
    move-result p1

    .line 300
    iput p1, v0, Ll5/b;->j:I

    .line 301
    .line 302
    return-object v0

    .line 303
    :pswitch_a
    new-instance v0, Li1/f;

    .line 304
    .line 305
    invoke-direct {v0, p1}, Li1/f;-><init>(Landroid/os/Parcel;)V

    .line 306
    .line 307
    .line 308
    return-object v0

    .line 309
    :pswitch_b
    new-instance v0, Li1/e;

    .line 310
    .line 311
    invoke-direct {v0, p1}, Li1/e;-><init>(Landroid/os/Parcel;)V

    .line 312
    .line 313
    .line 314
    return-object v0

    .line 315
    :pswitch_c
    new-instance v0, Li1/a;

    .line 316
    .line 317
    invoke-direct {v0, p1}, Li1/a;-><init>(Landroid/os/Parcel;)V

    .line 318
    .line 319
    .line 320
    return-object v0

    .line 321
    :pswitch_d
    new-instance v0, Landroidx/versionedparcelable/ParcelImpl;

    .line 322
    .line 323
    invoke-direct {v0, p1}, Landroidx/versionedparcelable/ParcelImpl;-><init>(Landroid/os/Parcel;)V

    .line 324
    .line 325
    .line 326
    return-object v0

    .line 327
    :pswitch_e
    new-instance v0, Le2/a;

    .line 328
    .line 329
    invoke-direct {v0, p1}, Lz1/b;-><init>(Landroid/os/Parcel;)V

    .line 330
    .line 331
    .line 332
    return-object v0

    .line 333
    :pswitch_f
    new-instance v0, Ld2/j;

    .line 334
    .line 335
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    .line 336
    .line 337
    .line 338
    move-result-wide v1

    .line 339
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    .line 340
    .line 341
    .line 342
    move-result-wide v3

    .line 343
    invoke-direct {v0, v1, v2, v3, v4}, Ld2/j;-><init>(JJ)V

    .line 344
    .line 345
    .line 346
    return-object v0

    .line 347
    :pswitch_10
    new-instance v0, Ld2/i;

    .line 348
    .line 349
    invoke-direct {v0, p1}, Ld2/i;-><init>(Landroid/os/Parcel;)V

    .line 350
    .line 351
    .line 352
    return-object v0

    .line 353
    :pswitch_11
    new-instance p1, Ld2/f;

    .line 354
    .line 355
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 356
    .line 357
    .line 358
    return-object p1

    .line 359
    :pswitch_12
    new-instance v0, Ld2/e;

    .line 360
    .line 361
    invoke-direct {v0, p1}, Ld2/e;-><init>(Landroid/os/Parcel;)V

    .line 362
    .line 363
    .line 364
    return-object v0

    .line 365
    :pswitch_13
    new-instance v0, Ld2/a;

    .line 366
    .line 367
    invoke-direct {v0, p1}, Ld2/a;-><init>(Landroid/os/Parcel;)V

    .line 368
    .line 369
    .line 370
    return-object v0

    .line 371
    :pswitch_14
    const-string v0, "parcel"

    .line 372
    .line 373
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    new-instance v0, Ld/a;

    .line 377
    .line 378
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 379
    .line 380
    .line 381
    move-result v1

    .line 382
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    if-nez v2, :cond_a

    .line 387
    .line 388
    const/4 p1, 0x0

    .line 389
    goto :goto_6

    .line 390
    :cond_a
    sget-object v2, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 391
    .line 392
    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object p1

    .line 396
    check-cast p1, Landroid/content/Intent;

    .line 397
    .line 398
    :goto_6
    invoke-direct {v0, p1, v1}, Ld/a;-><init>(Landroid/content/Intent;I)V

    .line 399
    .line 400
    .line 401
    return-object v0

    .line 402
    :pswitch_15
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 407
    .line 408
    .line 409
    move-result p1

    .line 410
    invoke-static {v0, p1}, Lcom/google/android/material/datepicker/s;->a(II)Lcom/google/android/material/datepicker/s;

    .line 411
    .line 412
    .line 413
    move-result-object p1

    .line 414
    return-object p1

    .line 415
    :pswitch_16
    new-instance v0, Lcom/google/android/material/datepicker/c;

    .line 416
    .line 417
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    .line 418
    .line 419
    .line 420
    move-result-wide v1

    .line 421
    invoke-direct {v0, v1, v2}, Lcom/google/android/material/datepicker/c;-><init>(J)V

    .line 422
    .line 423
    .line 424
    return-object v0

    .line 425
    :pswitch_17
    const-class v0, Lcom/google/android/material/datepicker/s;

    .line 426
    .line 427
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    move-object v3, v1

    .line 436
    check-cast v3, Lcom/google/android/material/datepicker/s;

    .line 437
    .line 438
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    move-object v4, v1

    .line 447
    check-cast v4, Lcom/google/android/material/datepicker/s;

    .line 448
    .line 449
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    move-object v6, v0

    .line 458
    check-cast v6, Lcom/google/android/material/datepicker/s;

    .line 459
    .line 460
    const-class v0, Lcom/google/android/material/datepicker/c;

    .line 461
    .line 462
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    move-object v5, v0

    .line 471
    check-cast v5, Lcom/google/android/material/datepicker/c;

    .line 472
    .line 473
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 474
    .line 475
    .line 476
    move-result v7

    .line 477
    new-instance v2, Lcom/google/android/material/datepicker/b;

    .line 478
    .line 479
    invoke-direct/range {v2 .. v7}, Lcom/google/android/material/datepicker/b;-><init>(Lcom/google/android/material/datepicker/s;Lcom/google/android/material/datepicker/s;Lcom/google/android/material/datepicker/c;Lcom/google/android/material/datepicker/s;I)V

    .line 480
    .line 481
    .line 482
    return-object v2

    .line 483
    :pswitch_18
    new-instance v0, Lc2/e;

    .line 484
    .line 485
    invoke-direct {v0, p1}, Lc2/e;-><init>(Landroid/os/Parcel;)V

    .line 486
    .line 487
    .line 488
    return-object v0

    .line 489
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_18
        :pswitch_17
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

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lc2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [Lz2/d1;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [Lz2/c1;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [Lz2/q;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [Lz1/b;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [Lz1/a;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [Ly1/a;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [Lx1/a;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [Lq0/g;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [Lp3/a;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [Lm/l0;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_9
    new-array p1, p1, [Ll5/b;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_a
    new-array p1, p1, [Li1/f;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_b
    new-array p1, p1, [Li1/e;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_c
    new-array p1, p1, [Li1/a;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_d
    new-array p1, p1, [Landroidx/versionedparcelable/ParcelImpl;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_e
    new-array p1, p1, [Le2/a;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_f
    new-array p1, p1, [Ld2/j;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_10
    new-array p1, p1, [Ld2/i;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_11
    new-array p1, p1, [Ld2/f;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_12
    new-array p1, p1, [Ld2/e;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_13
    new-array p1, p1, [Ld2/a;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_14
    new-array p1, p1, [Ld/a;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_15
    new-array p1, p1, [Lcom/google/android/material/datepicker/s;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_16
    new-array p1, p1, [Lcom/google/android/material/datepicker/c;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_17
    new-array p1, p1, [Lcom/google/android/material/datepicker/b;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_18
    new-array p1, p1, [Lc2/e;

    .line 82
    .line 83
    return-object p1

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_18
        :pswitch_17
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
