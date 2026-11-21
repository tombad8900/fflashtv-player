.class public final Lb5/k;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public final synthetic n:I

.field public o:I

.field public p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILp6/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lb5/k;->n:I

    invoke-direct {p0, p1, p2}, Lr6/h;-><init>(ILp6/c;)V

    return-void
.end method

.method public constructor <init>(Lx4/t;Lp6/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb5/k;->n:I

    .line 2
    iput-object p1, p0, Lb5/k;->p:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lr6/h;-><init>(ILp6/c;)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lb5/k;->n:I

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
    invoke-virtual {p0, p1, p2}, Lb5/k;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lb5/k;

    .line 15
    .line 16
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lb5/k;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lb5/k;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lb5/k;

    .line 28
    .line 29
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lb5/k;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/Object;Lp6/c;)Lp6/c;
    .locals 1

    .line 1
    iget p1, p0, Lb5/k;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lb5/k;

    .line 7
    .line 8
    iget-object v0, p0, Lb5/k;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lx4/t;

    .line 11
    .line 12
    invoke-direct {p1, v0, p2}, Lb5/k;-><init>(Lx4/t;Lp6/c;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    new-instance p1, Lb5/k;

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    invoke-direct {p1, v0, p2}, Lb5/k;-><init>(ILp6/c;)V

    .line 20
    .line 21
    .line 22
    return-object p1

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lb5/k;->n:I

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    const-string v0, "forName(...)"

    .line 11
    .line 12
    iget-object v4, p0, Lb5/k;->p:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v4, Lx4/t;

    .line 15
    .line 16
    sget-object v5, Lq6/a;->j:Lq6/a;

    .line 17
    .line 18
    iget v6, p0, Lb5/k;->o:I

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    if-eqz v6, :cond_1

    .line 22
    .line 23
    if-ne v6, v3, :cond_0

    .line 24
    .line 25
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Lx4/k;->a:Lx4/k;

    .line 39
    .line 40
    iget-object p1, v4, Lx4/t;->j:Ljava/lang/String;

    .line 41
    .line 42
    iput v3, p0, Lb5/k;->o:I

    .line 43
    .line 44
    sget-object v1, Li7/e0;->a:Lo7/e;

    .line 45
    .line 46
    sget-object v1, Lo7/d;->l:Lo7/d;

    .line 47
    .line 48
    new-instance v6, Lx4/h;

    .line 49
    .line 50
    invoke-direct {v6, p1, v2, v7}, Lx4/h;-><init>(Ljava/lang/String;Lp6/c;I)V

    .line 51
    .line 52
    .line 53
    invoke-static {v1, v6, p0}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-ne p1, v5, :cond_2

    .line 58
    .line 59
    goto/16 :goto_f

    .line 60
    .line 61
    :cond_2
    :goto_0
    check-cast p1, [B

    .line 62
    .line 63
    array-length v1, p1

    .line 64
    const/4 v5, 0x2

    .line 65
    if-le v1, v5, :cond_4

    .line 66
    .line 67
    aget-byte v1, p1, v7

    .line 68
    .line 69
    const/16 v6, 0x1f

    .line 70
    .line 71
    if-ne v1, v6, :cond_4

    .line 72
    .line 73
    aget-byte v1, p1, v3

    .line 74
    .line 75
    const/16 v6, -0x75

    .line 76
    .line 77
    if-ne v1, v6, :cond_4

    .line 78
    .line 79
    new-instance v1, Ljava/util/zip/GZIPInputStream;

    .line 80
    .line 81
    new-instance v6, Ljava/io/ByteArrayInputStream;

    .line 82
    .line 83
    invoke-direct {v6, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 84
    .line 85
    .line 86
    invoke-direct {v1, v6}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 87
    .line 88
    .line 89
    :try_start_0
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    const/16 v8, 0x2000

    .line 96
    .line 97
    invoke-static {v8, v6}, Ljava/lang/Math;->max(II)I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    invoke-direct {p1, v6}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 102
    .line 103
    .line 104
    new-array v6, v8, [B

    .line 105
    .line 106
    invoke-virtual {v1, v6}, Ljava/io/InputStream;->read([B)I

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    :goto_1
    if-ltz v8, :cond_3

    .line 111
    .line 112
    invoke-virtual {p1, v6, v7, v8}, Ljava/io/OutputStream;->write([BII)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v6}, Ljava/io/InputStream;->read([B)I

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    goto :goto_1

    .line 120
    :cond_3
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    const-string v6, "toByteArray(...)"

    .line 125
    .line 126
    invoke-static {v6, p1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/util/zip/GZIPInputStream;->close()V

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :catchall_0
    move-exception p1

    .line 134
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 135
    :catchall_1
    move-exception v0

    .line 136
    invoke-static {v1, p1}, Lt5/a;->b(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    throw v0

    .line 140
    :cond_4
    :goto_2
    sget-object v1, Lx4/v;->a:Lx4/v;

    .line 141
    .line 142
    iget-object v1, v4, Lx4/t;->f:Ljava/lang/String;

    .line 143
    .line 144
    array-length v4, p1

    .line 145
    const/4 v6, 0x3

    .line 146
    if-lt v4, v6, :cond_5

    .line 147
    .line 148
    aget-byte v4, p1, v7

    .line 149
    .line 150
    const/16 v8, -0x11

    .line 151
    .line 152
    if-ne v4, v8, :cond_5

    .line 153
    .line 154
    aget-byte v3, p1, v3

    .line 155
    .line 156
    const/16 v4, -0x45

    .line 157
    .line 158
    if-ne v3, v4, :cond_5

    .line 159
    .line 160
    aget-byte v3, p1, v5

    .line 161
    .line 162
    const/16 v4, -0x41

    .line 163
    .line 164
    if-ne v3, v4, :cond_5

    .line 165
    .line 166
    array-length v3, p1

    .line 167
    invoke-static {p1, v6, v3}, Lm6/g;->n0([BII)[B

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    :cond_5
    move-object v4, p1

    .line 172
    :try_start_2
    invoke-static {v1}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    if-eqz p1, :cond_6

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_6
    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-static {v0, p1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 184
    .line 185
    .line 186
    goto :goto_4

    .line 187
    :catch_0
    :goto_3
    move-object p1, v2

    .line 188
    :goto_4
    sget-object v1, Lh7/a;->a:Ljava/nio/charset/Charset;

    .line 189
    .line 190
    invoke-static {p1, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    const v5, 0xfffd

    .line 195
    .line 196
    .line 197
    if-nez v3, :cond_7

    .line 198
    .line 199
    if-nez p1, :cond_a

    .line 200
    .line 201
    :cond_7
    new-instance v3, Ljava/lang/String;

    .line 202
    .line 203
    invoke-direct {v3, v4, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 204
    .line 205
    .line 206
    move v1, v7

    .line 207
    :goto_5
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 208
    .line 209
    .line 210
    move-result v6

    .line 211
    if-ge v1, v6, :cond_9

    .line 212
    .line 213
    invoke-virtual {v3, v1}, Ljava/lang/String;->charAt(I)C

    .line 214
    .line 215
    .line 216
    move-result v6

    .line 217
    if-ne v6, v5, :cond_8

    .line 218
    .line 219
    move-object v3, v2

    .line 220
    goto :goto_6

    .line 221
    :cond_8
    add-int/lit8 v1, v1, 0x1

    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_9
    :goto_6
    if-eqz v3, :cond_a

    .line 225
    .line 226
    move-object v5, v3

    .line 227
    goto/16 :goto_f

    .line 228
    .line 229
    :cond_a
    invoke-static {}, Lcom/bumptech/glide/d;->w()Ln6/c;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    if-eqz p1, :cond_b

    .line 234
    .line 235
    invoke-virtual {v1, p1}, Ln6/c;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    :cond_b
    sget-object p1, Lh7/a;->a:Ljava/nio/charset/Charset;

    .line 239
    .line 240
    invoke-virtual {v1, p1}, Ln6/c;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    const-string p1, "windows-1252"

    .line 244
    .line 245
    const-string v3, "ISO-8859-1"

    .line 246
    .line 247
    const-string v6, "windows-1256"

    .line 248
    .line 249
    const-string v8, "ISO-8859-6"

    .line 250
    .line 251
    filled-new-array {v6, v8, p1, v3}, [Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    invoke-static {p1}, Lm6/i;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    new-instance v3, Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 262
    .line 263
    .line 264
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    :cond_c
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 269
    .line 270
    .line 271
    move-result v6

    .line 272
    if-eqz v6, :cond_e

    .line 273
    .line 274
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    check-cast v6, Ljava/lang/String;

    .line 279
    .line 280
    sget-object v8, Lx4/v;->a:Lx4/v;

    .line 281
    .line 282
    :try_start_3
    invoke-static {v6}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 283
    .line 284
    .line 285
    move-result v8

    .line 286
    if-eqz v8, :cond_d

    .line 287
    .line 288
    goto :goto_8

    .line 289
    :cond_d
    invoke-static {v6}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    invoke-static {v0, v6}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 294
    .line 295
    .line 296
    goto :goto_9

    .line 297
    :catch_1
    :goto_8
    move-object v6, v2

    .line 298
    :goto_9
    if-eqz v6, :cond_c

    .line 299
    .line 300
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    goto :goto_7

    .line 304
    :cond_e
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 305
    .line 306
    .line 307
    move-result p1

    .line 308
    move v0, v7

    .line 309
    :goto_a
    if-ge v0, p1, :cond_f

    .line 310
    .line 311
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v6

    .line 315
    add-int/lit8 v0, v0, 0x1

    .line 316
    .line 317
    check-cast v6, Ljava/nio/charset/Charset;

    .line 318
    .line 319
    invoke-virtual {v1, v6}, Ln6/c;->add(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    goto :goto_a

    .line 323
    :cond_f
    invoke-static {v1}, Lcom/bumptech/glide/d;->h(Ln6/c;)Ln6/c;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    const-string v0, "<this>"

    .line 328
    .line 329
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 333
    .line 334
    invoke-direct {v0, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 335
    .line 336
    .line 337
    invoke-static {v0}, Lm6/h;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    new-instance v0, Ljava/util/ArrayList;

    .line 342
    .line 343
    invoke-static {p1}, Lm6/j;->w0(Ljava/lang/Iterable;)I

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 348
    .line 349
    .line 350
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 355
    .line 356
    .line 357
    move-result v1

    .line 358
    if-eqz v1, :cond_10

    .line 359
    .line 360
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    check-cast v1, Ljava/nio/charset/Charset;

    .line 365
    .line 366
    new-instance v3, Ljava/lang/String;

    .line 367
    .line 368
    invoke-direct {v3, v4, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    goto :goto_b

    .line 375
    :cond_10
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 380
    .line 381
    .line 382
    move-result p1

    .line 383
    if-nez p1, :cond_11

    .line 384
    .line 385
    goto :goto_e

    .line 386
    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 391
    .line 392
    .line 393
    move-result p1

    .line 394
    if-nez p1, :cond_12

    .line 395
    .line 396
    goto :goto_e

    .line 397
    :cond_12
    move-object p1, v2

    .line 398
    check-cast p1, Ljava/lang/String;

    .line 399
    .line 400
    move v1, v7

    .line 401
    move v3, v1

    .line 402
    :goto_c
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 403
    .line 404
    .line 405
    move-result v6

    .line 406
    if-ge v1, v6, :cond_14

    .line 407
    .line 408
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 409
    .line 410
    .line 411
    move-result v6

    .line 412
    if-ne v6, v5, :cond_13

    .line 413
    .line 414
    add-int/lit8 v3, v3, 0x1

    .line 415
    .line 416
    :cond_13
    add-int/lit8 v1, v1, 0x1

    .line 417
    .line 418
    goto :goto_c

    .line 419
    :cond_14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object p1

    .line 423
    move-object v1, p1

    .line 424
    check-cast v1, Ljava/lang/String;

    .line 425
    .line 426
    move v6, v7

    .line 427
    move v8, v6

    .line 428
    :goto_d
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 429
    .line 430
    .line 431
    move-result v9

    .line 432
    if-ge v6, v9, :cond_16

    .line 433
    .line 434
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    .line 435
    .line 436
    .line 437
    move-result v9

    .line 438
    if-ne v9, v5, :cond_15

    .line 439
    .line 440
    add-int/lit8 v8, v8, 0x1

    .line 441
    .line 442
    :cond_15
    add-int/lit8 v6, v6, 0x1

    .line 443
    .line 444
    goto :goto_d

    .line 445
    :cond_16
    if-le v3, v8, :cond_17

    .line 446
    .line 447
    move-object v2, p1

    .line 448
    move v3, v8

    .line 449
    :cond_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 450
    .line 451
    .line 452
    move-result p1

    .line 453
    if-nez p1, :cond_14

    .line 454
    .line 455
    :goto_e
    move-object v5, v2

    .line 456
    check-cast v5, Ljava/lang/String;

    .line 457
    .line 458
    if-nez v5, :cond_18

    .line 459
    .line 460
    new-instance v5, Ljava/lang/String;

    .line 461
    .line 462
    sget-object p1, Lh7/a;->a:Ljava/nio/charset/Charset;

    .line 463
    .line 464
    invoke-direct {v5, v4, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 465
    .line 466
    .line 467
    :cond_18
    :goto_f
    return-object v5

    .line 468
    :pswitch_0
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 469
    .line 470
    iget v4, p0, Lb5/k;->o:I

    .line 471
    .line 472
    if-eqz v4, :cond_1a

    .line 473
    .line 474
    if-ne v4, v3, :cond_19

    .line 475
    .line 476
    iget-object v0, p0, Lb5/k;->p:Ljava/lang/Object;

    .line 477
    .line 478
    check-cast v0, Lp7/b;

    .line 479
    .line 480
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    goto/16 :goto_14

    .line 484
    .line 485
    :cond_19
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 486
    .line 487
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    throw p1

    .line 491
    :cond_1a
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 492
    .line 493
    .line 494
    sget-object p1, Lb5/l;->b:Lp7/b;

    .line 495
    .line 496
    iput-object p1, p0, Lb5/k;->p:Ljava/lang/Object;

    .line 497
    .line 498
    iput v3, p0, Lb5/k;->o:I

    .line 499
    .line 500
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    iget v1, p1, Lp7/g;->a:I

    .line 504
    .line 505
    sget-object v3, Lp7/b;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 506
    .line 507
    :cond_1b
    :goto_10
    sget-object v4, Lp7/g;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 508
    .line 509
    invoke-virtual {v4, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 510
    .line 511
    .line 512
    move-result v5

    .line 513
    if-le v5, v1, :cond_1d

    .line 514
    .line 515
    :cond_1c
    sget-object v4, Lp7/g;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 516
    .line 517
    invoke-virtual {v4, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 518
    .line 519
    .line 520
    move-result v5

    .line 521
    if-le v5, v1, :cond_1b

    .line 522
    .line 523
    invoke-virtual {v4, p1, v5, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 524
    .line 525
    .line 526
    move-result v4

    .line 527
    if-eqz v4, :cond_1c

    .line 528
    .line 529
    goto :goto_10

    .line 530
    :cond_1d
    sget-object v6, Ll6/j;->a:Ll6/j;

    .line 531
    .line 532
    if-gtz v5, :cond_21

    .line 533
    .line 534
    invoke-static {p0}, Lcom/bumptech/glide/d;->P(Lp6/c;)Lp6/c;

    .line 535
    .line 536
    .line 537
    move-result-object v3

    .line 538
    invoke-static {v3}, Li7/x;->h(Lp6/c;)Li7/g;

    .line 539
    .line 540
    .line 541
    move-result-object v3

    .line 542
    :try_start_4
    new-instance v4, Lp7/a;

    .line 543
    .line 544
    invoke-direct {v4, p1, v3}, Lp7/a;-><init>(Lp7/b;Li7/g;)V

    .line 545
    .line 546
    .line 547
    :cond_1e
    sget-object v5, Lp7/g;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 548
    .line 549
    invoke-virtual {v5, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    .line 550
    .line 551
    .line 552
    move-result v5

    .line 553
    if-gt v5, v1, :cond_1e

    .line 554
    .line 555
    if-lez v5, :cond_1f

    .line 556
    .line 557
    iget-object v1, p1, Lp7/g;->b:Li7/f;

    .line 558
    .line 559
    invoke-virtual {v4, v1}, Lp7/a;->i(Li7/f;)V

    .line 560
    .line 561
    .line 562
    goto :goto_11

    .line 563
    :cond_1f
    invoke-virtual {p1, v4}, Lp7/g;->a(Li7/p1;)Z

    .line 564
    .line 565
    .line 566
    move-result v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 567
    if-eqz v5, :cond_1e

    .line 568
    .line 569
    :goto_11
    invoke-virtual {v3}, Li7/g;->u()Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v1

    .line 573
    sget-object v3, Lq6/a;->j:Lq6/a;

    .line 574
    .line 575
    if-ne v1, v3, :cond_20

    .line 576
    .line 577
    goto :goto_12

    .line 578
    :cond_20
    move-object v1, v6

    .line 579
    :goto_12
    if-ne v1, v3, :cond_22

    .line 580
    .line 581
    move-object v6, v1

    .line 582
    goto :goto_13

    .line 583
    :catchall_2
    move-exception p1

    .line 584
    invoke-virtual {v3}, Li7/g;->C()V

    .line 585
    .line 586
    .line 587
    throw p1

    .line 588
    :cond_21
    add-int/lit8 v7, v5, -0x1

    .line 589
    .line 590
    invoke-virtual {v4, p1, v5, v7}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 591
    .line 592
    .line 593
    move-result v4

    .line 594
    if-eqz v4, :cond_1b

    .line 595
    .line 596
    invoke-virtual {v3, p1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    :cond_22
    :goto_13
    if-ne v6, v0, :cond_23

    .line 600
    .line 601
    goto :goto_16

    .line 602
    :cond_23
    move-object v0, p1

    .line 603
    :goto_14
    :try_start_5
    sget-object p1, Lb5/l;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 604
    .line 605
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v1

    .line 609
    check-cast v1, Ljava/lang/String;

    .line 610
    .line 611
    if-nez v1, :cond_25

    .line 612
    .line 613
    invoke-static {}, Lb5/l;->a()Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    if-eqz v1, :cond_24

    .line 618
    .line 619
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 620
    .line 621
    .line 622
    goto :goto_15

    .line 623
    :catchall_3
    move-exception p1

    .line 624
    goto :goto_17

    .line 625
    :cond_24
    move-object v1, v2

    .line 626
    :goto_15
    if-nez v1, :cond_25

    .line 627
    .line 628
    const-string p1, "https://smarthomeapi.space"
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 629
    .line 630
    move-object v1, p1

    .line 631
    :cond_25
    invoke-virtual {v0, v2}, Lp7/b;->c(Ljava/lang/Object;)V

    .line 632
    .line 633
    .line 634
    move-object v0, v1

    .line 635
    :goto_16
    return-object v0

    .line 636
    :goto_17
    invoke-virtual {v0, v2}, Lp7/b;->c(Ljava/lang/Object;)V

    .line 637
    .line 638
    .line 639
    throw p1

    .line 640
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
