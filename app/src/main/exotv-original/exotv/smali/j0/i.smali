.class public final Lj0/i;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:I

.field public final b:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lj0/i;->a:I

    const/4 v0, 0x0

    .line 6
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lj0/i;->b:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lj0/i;->a:I

    .line 3
    iput-object p2, p0, Lj0/i;->b:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lj0/i;->a:I

    .line 9
    iput-object p1, p0, Lj0/i;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(ILh1/t;)Lt2/h0;
    .locals 4

    .line 1
    iget-object v0, p2, Lh1/t;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    if-eq p1, v1, :cond_e

    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    if-eq p1, v2, :cond_d

    .line 10
    .line 11
    const/4 v2, 0x4

    .line 12
    if-eq p1, v2, :cond_d

    .line 13
    .line 14
    const/16 v3, 0x15

    .line 15
    .line 16
    if-eq p1, v3, :cond_c

    .line 17
    .line 18
    const/16 v3, 0x1b

    .line 19
    .line 20
    if-eq p1, v3, :cond_a

    .line 21
    .line 22
    const/16 v2, 0x24

    .line 23
    .line 24
    if-eq p1, v2, :cond_9

    .line 25
    .line 26
    const/16 v2, 0x2d

    .line 27
    .line 28
    if-eq p1, v2, :cond_8

    .line 29
    .line 30
    const/16 v2, 0x59

    .line 31
    .line 32
    if-eq p1, v2, :cond_7

    .line 33
    .line 34
    const/16 v2, 0xac

    .line 35
    .line 36
    if-eq p1, v2, :cond_6

    .line 37
    .line 38
    const/16 v2, 0x101

    .line 39
    .line 40
    if-eq p1, v2, :cond_5

    .line 41
    .line 42
    const/16 v2, 0x8a

    .line 43
    .line 44
    if-eq p1, v2, :cond_4

    .line 45
    .line 46
    const/16 v2, 0x8b

    .line 47
    .line 48
    if-eq p1, v2, :cond_3

    .line 49
    .line 50
    packed-switch p1, :pswitch_data_0

    .line 51
    .line 52
    .line 53
    packed-switch p1, :pswitch_data_1

    .line 54
    .line 55
    .line 56
    packed-switch p1, :pswitch_data_2

    .line 57
    .line 58
    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :pswitch_0
    const/16 p1, 0x10

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Lj0/i;->c(I)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_0

    .line 68
    .line 69
    goto/16 :goto_0

    .line 70
    .line 71
    :cond_0
    new-instance p1, Lt2/d0;

    .line 72
    .line 73
    new-instance p2, La4/c;

    .line 74
    .line 75
    const-string v0, "application/x-scte35"

    .line 76
    .line 77
    const/16 v1, 0x18

    .line 78
    .line 79
    invoke-direct {p2, v0, v1}, La4/c;-><init>(Ljava/lang/String;I)V

    .line 80
    .line 81
    .line 82
    invoke-direct {p1, p2}, Lt2/d0;-><init>(Lt2/c0;)V

    .line 83
    .line 84
    .line 85
    return-object p1

    .line 86
    :pswitch_1
    const/16 p1, 0x40

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Lj0/i;->c(I)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-nez p1, :cond_4

    .line 93
    .line 94
    goto/16 :goto_0

    .line 95
    .line 96
    :pswitch_2
    new-instance p1, Lt2/y;

    .line 97
    .line 98
    new-instance v1, Lt2/b;

    .line 99
    .line 100
    invoke-virtual {p2}, Lh1/t;->d()I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    const/4 v2, 0x0

    .line 105
    invoke-direct {v1, v0, p2, v2}, Lt2/b;-><init>(Ljava/lang/String;II)V

    .line 106
    .line 107
    .line 108
    invoke-direct {p1, v1}, Lt2/y;-><init>(Lt2/h;)V

    .line 109
    .line 110
    .line 111
    return-object p1

    .line 112
    :pswitch_3
    invoke-virtual {p0, v1}, Lj0/i;->c(I)Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_1

    .line 117
    .line 118
    goto/16 :goto_0

    .line 119
    .line 120
    :cond_1
    new-instance p1, Lt2/y;

    .line 121
    .line 122
    new-instance v1, Lt2/s;

    .line 123
    .line 124
    invoke-virtual {p2}, Lh1/t;->d()I

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    invoke-direct {v1, v0, p2}, Lt2/s;-><init>(Ljava/lang/String;I)V

    .line 129
    .line 130
    .line 131
    invoke-direct {p1, v1}, Lt2/y;-><init>(Lt2/h;)V

    .line 132
    .line 133
    .line 134
    return-object p1

    .line 135
    :pswitch_4
    new-instance p1, Lt2/y;

    .line 136
    .line 137
    new-instance v0, Lt2/m;

    .line 138
    .line 139
    new-instance v1, Ls/e;

    .line 140
    .line 141
    invoke-virtual {p0, p2}, Lj0/i;->b(Lh1/t;)Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-direct {v1, p2}, Ls/e;-><init>(Ljava/util/List;)V

    .line 146
    .line 147
    .line 148
    invoke-direct {v0, v1}, Lt2/m;-><init>(Ls/e;)V

    .line 149
    .line 150
    .line 151
    invoke-direct {p1, v0}, Lt2/y;-><init>(Lt2/h;)V

    .line 152
    .line 153
    .line 154
    return-object p1

    .line 155
    :pswitch_5
    invoke-virtual {p0, v1}, Lj0/i;->c(I)Z

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-eqz p1, :cond_2

    .line 160
    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :cond_2
    new-instance p1, Lt2/y;

    .line 164
    .line 165
    new-instance v1, Lt2/e;

    .line 166
    .line 167
    const/4 v2, 0x0

    .line 168
    invoke-virtual {p2}, Lh1/t;->d()I

    .line 169
    .line 170
    .line 171
    move-result p2

    .line 172
    invoke-direct {v1, p2, v0, v2}, Lt2/e;-><init>(ILjava/lang/String;Z)V

    .line 173
    .line 174
    .line 175
    invoke-direct {p1, v1}, Lt2/y;-><init>(Lt2/h;)V

    .line 176
    .line 177
    .line 178
    return-object p1

    .line 179
    :cond_3
    new-instance p1, Lt2/y;

    .line 180
    .line 181
    new-instance v1, Lt2/f;

    .line 182
    .line 183
    invoke-virtual {p2}, Lh1/t;->d()I

    .line 184
    .line 185
    .line 186
    move-result p2

    .line 187
    const/16 v2, 0x1520

    .line 188
    .line 189
    invoke-direct {v1, v0, p2, v2}, Lt2/f;-><init>(Ljava/lang/String;II)V

    .line 190
    .line 191
    .line 192
    invoke-direct {p1, v1}, Lt2/y;-><init>(Lt2/h;)V

    .line 193
    .line 194
    .line 195
    return-object p1

    .line 196
    :cond_4
    :pswitch_6
    new-instance p1, Lt2/y;

    .line 197
    .line 198
    new-instance v1, Lt2/f;

    .line 199
    .line 200
    invoke-virtual {p2}, Lh1/t;->d()I

    .line 201
    .line 202
    .line 203
    move-result p2

    .line 204
    const/16 v2, 0x1000

    .line 205
    .line 206
    invoke-direct {v1, v0, p2, v2}, Lt2/f;-><init>(Ljava/lang/String;II)V

    .line 207
    .line 208
    .line 209
    invoke-direct {p1, v1}, Lt2/y;-><init>(Lt2/h;)V

    .line 210
    .line 211
    .line 212
    return-object p1

    .line 213
    :cond_5
    new-instance p1, Lt2/d0;

    .line 214
    .line 215
    new-instance p2, La4/c;

    .line 216
    .line 217
    const-string v0, "application/vnd.dvb.ait"

    .line 218
    .line 219
    const/16 v1, 0x18

    .line 220
    .line 221
    invoke-direct {p2, v0, v1}, La4/c;-><init>(Ljava/lang/String;I)V

    .line 222
    .line 223
    .line 224
    invoke-direct {p1, p2}, Lt2/d0;-><init>(Lt2/c0;)V

    .line 225
    .line 226
    .line 227
    return-object p1

    .line 228
    :cond_6
    new-instance p1, Lt2/y;

    .line 229
    .line 230
    new-instance v1, Lt2/b;

    .line 231
    .line 232
    invoke-virtual {p2}, Lh1/t;->d()I

    .line 233
    .line 234
    .line 235
    move-result p2

    .line 236
    const/4 v2, 0x1

    .line 237
    invoke-direct {v1, v0, p2, v2}, Lt2/b;-><init>(Ljava/lang/String;II)V

    .line 238
    .line 239
    .line 240
    invoke-direct {p1, v1}, Lt2/y;-><init>(Lt2/h;)V

    .line 241
    .line 242
    .line 243
    return-object p1

    .line 244
    :cond_7
    new-instance p1, Lt2/y;

    .line 245
    .line 246
    new-instance v0, Lt2/g;

    .line 247
    .line 248
    iget-object p2, p2, Lh1/t;->c:Ljava/util/List;

    .line 249
    .line 250
    invoke-direct {v0, p2}, Lt2/g;-><init>(Ljava/util/List;)V

    .line 251
    .line 252
    .line 253
    invoke-direct {p1, v0}, Lt2/y;-><init>(Lt2/h;)V

    .line 254
    .line 255
    .line 256
    return-object p1

    .line 257
    :cond_8
    new-instance p1, Lt2/y;

    .line 258
    .line 259
    new-instance p2, Lt2/u;

    .line 260
    .line 261
    invoke-direct {p2}, Lt2/u;-><init>()V

    .line 262
    .line 263
    .line 264
    invoke-direct {p1, p2}, Lt2/y;-><init>(Lt2/h;)V

    .line 265
    .line 266
    .line 267
    return-object p1

    .line 268
    :cond_9
    new-instance p1, Lt2/y;

    .line 269
    .line 270
    new-instance v0, Lt2/r;

    .line 271
    .line 272
    new-instance v1, La4/c;

    .line 273
    .line 274
    invoke-virtual {p0, p2}, Lj0/i;->b(Lh1/t;)Ljava/util/List;

    .line 275
    .line 276
    .line 277
    move-result-object p2

    .line 278
    invoke-direct {v1, p2}, La4/c;-><init>(Ljava/util/List;)V

    .line 279
    .line 280
    .line 281
    invoke-direct {v0, v1}, Lt2/r;-><init>(La4/c;)V

    .line 282
    .line 283
    .line 284
    invoke-direct {p1, v0}, Lt2/y;-><init>(Lt2/h;)V

    .line 285
    .line 286
    .line 287
    return-object p1

    .line 288
    :cond_a
    invoke-virtual {p0, v2}, Lj0/i;->c(I)Z

    .line 289
    .line 290
    .line 291
    move-result p1

    .line 292
    if-eqz p1, :cond_b

    .line 293
    .line 294
    :goto_0
    const/4 p1, 0x0

    .line 295
    return-object p1

    .line 296
    :cond_b
    new-instance p1, Lt2/y;

    .line 297
    .line 298
    new-instance v0, Lt2/p;

    .line 299
    .line 300
    new-instance v1, La4/c;

    .line 301
    .line 302
    invoke-virtual {p0, p2}, Lj0/i;->b(Lh1/t;)Ljava/util/List;

    .line 303
    .line 304
    .line 305
    move-result-object p2

    .line 306
    invoke-direct {v1, p2}, La4/c;-><init>(Ljava/util/List;)V

    .line 307
    .line 308
    .line 309
    const/4 p2, 0x1

    .line 310
    invoke-virtual {p0, p2}, Lj0/i;->c(I)Z

    .line 311
    .line 312
    .line 313
    move-result p2

    .line 314
    const/16 v2, 0x8

    .line 315
    .line 316
    invoke-virtual {p0, v2}, Lj0/i;->c(I)Z

    .line 317
    .line 318
    .line 319
    move-result v2

    .line 320
    invoke-direct {v0, v1, p2, v2}, Lt2/p;-><init>(La4/c;ZZ)V

    .line 321
    .line 322
    .line 323
    invoke-direct {p1, v0}, Lt2/y;-><init>(Lt2/h;)V

    .line 324
    .line 325
    .line 326
    return-object p1

    .line 327
    :cond_c
    new-instance p1, Lt2/y;

    .line 328
    .line 329
    new-instance p2, Lt2/g;

    .line 330
    .line 331
    invoke-direct {p2}, Lt2/g;-><init>()V

    .line 332
    .line 333
    .line 334
    invoke-direct {p1, p2}, Lt2/y;-><init>(Lt2/h;)V

    .line 335
    .line 336
    .line 337
    return-object p1

    .line 338
    :cond_d
    new-instance p1, Lt2/y;

    .line 339
    .line 340
    new-instance v1, Lt2/t;

    .line 341
    .line 342
    invoke-virtual {p2}, Lh1/t;->d()I

    .line 343
    .line 344
    .line 345
    move-result p2

    .line 346
    invoke-direct {v1, v0, p2}, Lt2/t;-><init>(Ljava/lang/String;I)V

    .line 347
    .line 348
    .line 349
    invoke-direct {p1, v1}, Lt2/y;-><init>(Lt2/h;)V

    .line 350
    .line 351
    .line 352
    return-object p1

    .line 353
    :cond_e
    :pswitch_7
    new-instance p1, Lt2/y;

    .line 354
    .line 355
    new-instance v0, Lt2/j;

    .line 356
    .line 357
    new-instance v1, Ls/e;

    .line 358
    .line 359
    invoke-virtual {p0, p2}, Lj0/i;->b(Lh1/t;)Ljava/util/List;

    .line 360
    .line 361
    .line 362
    move-result-object p2

    .line 363
    invoke-direct {v1, p2}, Ls/e;-><init>(Ljava/util/List;)V

    .line 364
    .line 365
    .line 366
    invoke-direct {v0, v1}, Lt2/j;-><init>(Ls/e;)V

    .line 367
    .line 368
    .line 369
    invoke-direct {p1, v0}, Lt2/y;-><init>(Lt2/h;)V

    .line 370
    .line 371
    .line 372
    return-object p1

    .line 373
    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    :pswitch_data_1
    .packed-switch 0x80
        :pswitch_7
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    :pswitch_data_2
    .packed-switch 0x86
        :pswitch_0
        :pswitch_2
        :pswitch_6
    .end packed-switch
.end method

.method public b(Lh1/t;)Ljava/util/List;
    .locals 11

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lj0/i;->c(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lj0/i;->b:Ljava/util/List;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    new-instance v0, Lh1/w;

    .line 13
    .line 14
    iget-object p1, p1, Lh1/t;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, [B

    .line 17
    .line 18
    invoke-direct {v0, p1}, Lh1/w;-><init>([B)V

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-virtual {v0}, Lh1/w;->a()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-lez p1, :cond_8

    .line 26
    .line 27
    invoke-virtual {v0}, Lh1/w;->u()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-virtual {v0}, Lh1/w;->u()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    iget v3, v0, Lh1/w;->b:I

    .line 36
    .line 37
    add-int/2addr v3, v2

    .line 38
    const/16 v2, 0x86

    .line 39
    .line 40
    if-ne p1, v2, :cond_7

    .line 41
    .line 42
    new-instance p1, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lh1/w;->u()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    and-int/lit8 v1, v1, 0x1f

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    move v4, v2

    .line 55
    :goto_1
    if-ge v4, v1, :cond_6

    .line 56
    .line 57
    const/4 v5, 0x3

    .line 58
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 59
    .line 60
    invoke-virtual {v0, v5, v6}, Lh1/w;->s(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-virtual {v0}, Lh1/w;->u()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    and-int/lit16 v7, v6, 0x80

    .line 69
    .line 70
    const/4 v8, 0x1

    .line 71
    if-eqz v7, :cond_1

    .line 72
    .line 73
    move v7, v8

    .line 74
    goto :goto_2

    .line 75
    :cond_1
    move v7, v2

    .line 76
    :goto_2
    if-eqz v7, :cond_2

    .line 77
    .line 78
    and-int/lit8 v6, v6, 0x3f

    .line 79
    .line 80
    const-string v9, "application/cea-708"

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_2
    const-string v9, "application/cea-608"

    .line 84
    .line 85
    move v6, v8

    .line 86
    :goto_3
    invoke-virtual {v0}, Lh1/w;->u()I

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    int-to-byte v10, v10

    .line 91
    invoke-virtual {v0, v8}, Lh1/w;->H(I)V

    .line 92
    .line 93
    .line 94
    if-eqz v7, :cond_5

    .line 95
    .line 96
    and-int/lit8 v7, v10, 0x40

    .line 97
    .line 98
    if-eqz v7, :cond_3

    .line 99
    .line 100
    move v7, v8

    .line 101
    goto :goto_4

    .line 102
    :cond_3
    move v7, v2

    .line 103
    :goto_4
    sget-object v10, Lh1/c;->a:[B

    .line 104
    .line 105
    if-eqz v7, :cond_4

    .line 106
    .line 107
    new-array v7, v8, [B

    .line 108
    .line 109
    aput-byte v8, v7, v2

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_4
    new-array v7, v8, [B

    .line 113
    .line 114
    aput-byte v2, v7, v2

    .line 115
    .line 116
    :goto_5
    invoke-static {v7}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    goto :goto_6

    .line 121
    :cond_5
    const/4 v7, 0x0

    .line 122
    :goto_6
    new-instance v8, Landroidx/media3/common/v;

    .line 123
    .line 124
    invoke-direct {v8}, Landroidx/media3/common/v;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-static {v9}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    iput-object v9, v8, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 132
    .line 133
    iput-object v5, v8, Landroidx/media3/common/v;->d:Ljava/lang/String;

    .line 134
    .line 135
    iput v6, v8, Landroidx/media3/common/v;->G:I

    .line 136
    .line 137
    iput-object v7, v8, Landroidx/media3/common/v;->p:Ljava/util/List;

    .line 138
    .line 139
    new-instance v5, Landroidx/media3/common/w;

    .line 140
    .line 141
    invoke-direct {v5, v8}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    add-int/lit8 v4, v4, 0x1

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_6
    move-object v1, p1

    .line 151
    :cond_7
    invoke-virtual {v0, v3}, Lh1/w;->G(I)V

    .line 152
    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :cond_8
    return-object v1
.end method

.method public c(I)Z
    .locals 1

    .line 1
    iget v0, p0, Lj0/i;->a:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    return p1

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    return p1
.end method
