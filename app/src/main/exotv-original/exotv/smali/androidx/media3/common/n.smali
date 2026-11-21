.class public final synthetic Landroidx/media3/common/n;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/common/o;
.implements Le6/d;
.implements Lh1/n;
.implements Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistTracker$Factory;
.implements Landroidx/media3/exoplayer/image/BitmapFactoryImageDecoder$BitmapDecoder;
.implements Lb2/g;
.implements Lb6/h0;
.implements Lm0/o;
.implements Ld3/m;


# instance fields
.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/common/n;->j:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static bridge synthetic d(Landroid/media/MediaParser$TrackData;)Landroid/media/MediaFormat;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/media/MediaParser$TrackData;->mediaFormat:Landroid/media/MediaFormat;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(Ld3/l;Ld3/n;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/common/n;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ld3/l;->f()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-interface {p1}, Ld3/l;->a()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_1
    invoke-interface {p1, p2}, Ld3/l;->b(Ld3/n;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_2
    invoke-interface {p1, p2}, Ld3/l;->d(Ld3/n;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_3
    invoke-interface {p1, p2}, Ld3/l;->e(Ld3/n;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Landroidx/media3/common/n;->j:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Landroid/os/Bundle;

    .line 11
    .line 12
    invoke-static {v1}, Landroidx/media3/common/w;->b(Landroid/os/Bundle;)Landroidx/media3/common/w;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    return-object v1

    .line 17
    :pswitch_0
    move-object/from16 v1, p1

    .line 18
    .line 19
    check-cast v1, Landroid/os/Bundle;

    .line 20
    .line 21
    sget-object v2, Landroidx/media3/common/m1;->h:Ljava/lang/String;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    sget-object v2, Landroidx/media3/common/m1;->i:Ljava/lang/String;

    .line 29
    .line 30
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 36
    .line 37
    .line 38
    move-result-wide v8

    .line 39
    sget-object v2, Landroidx/media3/common/m1;->j:Ljava/lang/String;

    .line 40
    .line 41
    const-wide/16 v10, 0x0

    .line 42
    .line 43
    invoke-virtual {v1, v2, v10, v11}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 44
    .line 45
    .line 46
    move-result-wide v12

    .line 47
    sget-object v2, Landroidx/media3/common/m1;->k:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    sget-object v6, Landroidx/media3/common/m1;->l:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v1, v6}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    sget-object v6, Landroidx/media3/common/c;->i:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v1, v6}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    if-nez v6, :cond_0

    .line 68
    .line 69
    new-array v6, v3, [Landroidx/media3/common/b;

    .line 70
    .line 71
    move-object/from16 v18, v6

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 75
    .line 76
    .line 77
    move-result v14

    .line 78
    new-array v14, v14, [Landroidx/media3/common/b;

    .line 79
    .line 80
    move v15, v3

    .line 81
    :goto_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-ge v15, v3, :cond_1

    .line 86
    .line 87
    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Landroid/os/Bundle;

    .line 92
    .line 93
    invoke-static {v3}, Landroidx/media3/common/b;->a(Landroid/os/Bundle;)Landroidx/media3/common/b;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    aput-object v3, v14, v15

    .line 98
    .line 99
    add-int/lit8 v15, v15, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_1
    move-object/from16 v18, v14

    .line 103
    .line 104
    :goto_1
    sget-object v3, Landroidx/media3/common/c;->j:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {v1, v3, v10, v11}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 107
    .line 108
    .line 109
    move-result-wide v19

    .line 110
    sget-object v3, Landroidx/media3/common/c;->k:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v1, v3, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 113
    .line 114
    .line 115
    move-result-wide v21

    .line 116
    sget-object v3, Landroidx/media3/common/c;->l:Ljava/lang/String;

    .line 117
    .line 118
    const/4 v4, 0x0

    .line 119
    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 120
    .line 121
    .line 122
    move-result v23

    .line 123
    new-instance v16, Landroidx/media3/common/c;

    .line 124
    .line 125
    const/16 v17, 0x0

    .line 126
    .line 127
    invoke-direct/range {v16 .. v23}, Landroidx/media3/common/c;-><init>(Ljava/lang/Object;[Landroidx/media3/common/b;JJI)V

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_2
    sget-object v16, Landroidx/media3/common/c;->g:Landroidx/media3/common/c;

    .line 132
    .line 133
    :goto_2
    new-instance v4, Landroidx/media3/common/m1;

    .line 134
    .line 135
    invoke-direct {v4}, Landroidx/media3/common/m1;-><init>()V

    .line 136
    .line 137
    .line 138
    const/4 v5, 0x0

    .line 139
    const/4 v6, 0x0

    .line 140
    move-wide v10, v12

    .line 141
    move-object/from16 v12, v16

    .line 142
    .line 143
    move v13, v2

    .line 144
    invoke-virtual/range {v4 .. v13}, Landroidx/media3/common/m1;->i(Ljava/lang/Object;Ljava/lang/Object;IJJLandroidx/media3/common/c;Z)V

    .line 145
    .line 146
    .line 147
    return-object v4

    .line 148
    :pswitch_1
    move-object/from16 v1, p1

    .line 149
    .line 150
    check-cast v1, Landroid/os/Bundle;

    .line 151
    .line 152
    sget-object v2, Landroidx/media3/common/o1;->t:Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    if-eqz v2, :cond_3

    .line 159
    .line 160
    invoke-static {v2}, Landroidx/media3/common/o0;->b(Landroid/os/Bundle;)Landroidx/media3/common/o0;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    :goto_3
    move-object v5, v2

    .line 165
    goto :goto_4

    .line 166
    :cond_3
    sget-object v2, Landroidx/media3/common/o0;->g:Landroidx/media3/common/o0;

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :goto_4
    sget-object v2, Landroidx/media3/common/o1;->u:Ljava/lang/String;

    .line 170
    .line 171
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 177
    .line 178
    .line 179
    move-result-wide v7

    .line 180
    sget-object v2, Landroidx/media3/common/o1;->v:Ljava/lang/String;

    .line 181
    .line 182
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 183
    .line 184
    .line 185
    move-result-wide v9

    .line 186
    sget-object v2, Landroidx/media3/common/o1;->w:Ljava/lang/String;

    .line 187
    .line 188
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 189
    .line 190
    .line 191
    move-result-wide v11

    .line 192
    sget-object v2, Landroidx/media3/common/o1;->x:Ljava/lang/String;

    .line 193
    .line 194
    const/4 v6, 0x0

    .line 195
    invoke-virtual {v1, v2, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 196
    .line 197
    .line 198
    move-result v13

    .line 199
    sget-object v2, Landroidx/media3/common/o1;->y:Ljava/lang/String;

    .line 200
    .line 201
    invoke-virtual {v1, v2, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 202
    .line 203
    .line 204
    move-result v14

    .line 205
    sget-object v2, Landroidx/media3/common/o1;->z:Ljava/lang/String;

    .line 206
    .line 207
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    if-eqz v2, :cond_4

    .line 212
    .line 213
    invoke-static {v2}, Landroidx/media3/common/i0;->b(Landroid/os/Bundle;)Landroidx/media3/common/i0;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    :goto_5
    move-object v15, v2

    .line 218
    goto :goto_6

    .line 219
    :cond_4
    const/4 v2, 0x0

    .line 220
    goto :goto_5

    .line 221
    :goto_6
    sget-object v2, Landroidx/media3/common/o1;->A:Ljava/lang/String;

    .line 222
    .line 223
    invoke-virtual {v1, v2, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    sget-object v6, Landroidx/media3/common/o1;->B:Ljava/lang/String;

    .line 228
    .line 229
    const-wide/16 v3, 0x0

    .line 230
    .line 231
    invoke-virtual {v1, v6, v3, v4}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 232
    .line 233
    .line 234
    move-result-wide v18

    .line 235
    sget-object v6, Landroidx/media3/common/o1;->C:Ljava/lang/String;

    .line 236
    .line 237
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    invoke-virtual {v1, v6, v3, v4}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 243
    .line 244
    .line 245
    move-result-wide v3

    .line 246
    sget-object v6, Landroidx/media3/common/o1;->D:Ljava/lang/String;

    .line 247
    .line 248
    const/4 v0, 0x0

    .line 249
    invoke-virtual {v1, v6, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 250
    .line 251
    .line 252
    move-result v6

    .line 253
    move-wide/from16 v16, v3

    .line 254
    .line 255
    sget-object v3, Landroidx/media3/common/o1;->E:Ljava/lang/String;

    .line 256
    .line 257
    invoke-virtual {v1, v3, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    sget-object v3, Landroidx/media3/common/o1;->F:Ljava/lang/String;

    .line 262
    .line 263
    move-object/from16 p1, v5

    .line 264
    .line 265
    const-wide/16 v4, 0x0

    .line 266
    .line 267
    invoke-virtual {v1, v3, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 268
    .line 269
    .line 270
    move-result-wide v22

    .line 271
    new-instance v3, Landroidx/media3/common/o1;

    .line 272
    .line 273
    invoke-direct {v3}, Landroidx/media3/common/o1;-><init>()V

    .line 274
    .line 275
    .line 276
    sget-object v4, Landroidx/media3/common/o1;->r:Ljava/lang/Object;

    .line 277
    .line 278
    move/from16 v20, v6

    .line 279
    .line 280
    const/4 v6, 0x0

    .line 281
    move-wide/from16 v24, v18

    .line 282
    .line 283
    move-wide/from16 v18, v16

    .line 284
    .line 285
    move-wide/from16 v16, v24

    .line 286
    .line 287
    move-object/from16 v5, p1

    .line 288
    .line 289
    move/from16 v21, v0

    .line 290
    .line 291
    invoke-virtual/range {v3 .. v23}, Landroidx/media3/common/o1;->b(Ljava/lang/Object;Landroidx/media3/common/o0;Ljava/lang/Object;JJJZZLandroidx/media3/common/i0;JJIIJ)V

    .line 292
    .line 293
    .line 294
    iput-boolean v2, v3, Landroidx/media3/common/o1;->k:Z

    .line 295
    .line 296
    return-object v3

    .line 297
    :pswitch_2
    move-object/from16 v0, p1

    .line 298
    .line 299
    check-cast v0, Landroid/os/Bundle;

    .line 300
    .line 301
    sget-object v1, Landroidx/media3/common/n0;->h:Ljava/lang/String;

    .line 302
    .line 303
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    check-cast v1, Landroid/net/Uri;

    .line 308
    .line 309
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    sget-object v2, Landroidx/media3/common/n0;->i:Ljava/lang/String;

    .line 313
    .line 314
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    sget-object v3, Landroidx/media3/common/n0;->j:Ljava/lang/String;

    .line 319
    .line 320
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    sget-object v4, Landroidx/media3/common/n0;->k:Ljava/lang/String;

    .line 325
    .line 326
    const/4 v5, 0x0

    .line 327
    invoke-virtual {v0, v4, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    sget-object v6, Landroidx/media3/common/n0;->l:Ljava/lang/String;

    .line 332
    .line 333
    invoke-virtual {v0, v6, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 334
    .line 335
    .line 336
    move-result v5

    .line 337
    sget-object v6, Landroidx/media3/common/n0;->m:Ljava/lang/String;

    .line 338
    .line 339
    invoke-virtual {v0, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v6

    .line 343
    sget-object v7, Landroidx/media3/common/n0;->n:Ljava/lang/String;

    .line 344
    .line 345
    invoke-virtual {v0, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    new-instance v7, Landroidx/media3/common/m0;

    .line 350
    .line 351
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 352
    .line 353
    .line 354
    iput-object v1, v7, Landroidx/media3/common/m0;->a:Landroid/net/Uri;

    .line 355
    .line 356
    invoke-static {v2}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    iput-object v1, v7, Landroidx/media3/common/m0;->b:Ljava/lang/String;

    .line 361
    .line 362
    iput-object v3, v7, Landroidx/media3/common/m0;->c:Ljava/lang/String;

    .line 363
    .line 364
    iput v4, v7, Landroidx/media3/common/m0;->d:I

    .line 365
    .line 366
    iput v5, v7, Landroidx/media3/common/m0;->e:I

    .line 367
    .line 368
    iput-object v6, v7, Landroidx/media3/common/m0;->f:Ljava/lang/String;

    .line 369
    .line 370
    iput-object v0, v7, Landroidx/media3/common/m0;->g:Ljava/lang/String;

    .line 371
    .line 372
    new-instance v0, Landroidx/media3/common/n0;

    .line 373
    .line 374
    invoke-direct {v0, v7}, Landroidx/media3/common/n0;-><init>(Landroidx/media3/common/m0;)V

    .line 375
    .line 376
    .line 377
    return-object v0

    .line 378
    :pswitch_3
    move-object/from16 v0, p1

    .line 379
    .line 380
    check-cast v0, Landroidx/media3/common/n0;

    .line 381
    .line 382
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    new-instance v1, Landroid/os/Bundle;

    .line 386
    .line 387
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 388
    .line 389
    .line 390
    sget-object v2, Landroidx/media3/common/n0;->h:Ljava/lang/String;

    .line 391
    .line 392
    iget-object v3, v0, Landroidx/media3/common/n0;->a:Landroid/net/Uri;

    .line 393
    .line 394
    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 395
    .line 396
    .line 397
    iget-object v2, v0, Landroidx/media3/common/n0;->b:Ljava/lang/String;

    .line 398
    .line 399
    if-eqz v2, :cond_5

    .line 400
    .line 401
    sget-object v3, Landroidx/media3/common/n0;->i:Ljava/lang/String;

    .line 402
    .line 403
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    :cond_5
    iget-object v2, v0, Landroidx/media3/common/n0;->c:Ljava/lang/String;

    .line 407
    .line 408
    if-eqz v2, :cond_6

    .line 409
    .line 410
    sget-object v3, Landroidx/media3/common/n0;->j:Ljava/lang/String;

    .line 411
    .line 412
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    :cond_6
    iget v2, v0, Landroidx/media3/common/n0;->d:I

    .line 416
    .line 417
    if-eqz v2, :cond_7

    .line 418
    .line 419
    sget-object v3, Landroidx/media3/common/n0;->k:Ljava/lang/String;

    .line 420
    .line 421
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 422
    .line 423
    .line 424
    :cond_7
    iget v2, v0, Landroidx/media3/common/n0;->e:I

    .line 425
    .line 426
    if-eqz v2, :cond_8

    .line 427
    .line 428
    sget-object v3, Landroidx/media3/common/n0;->l:Ljava/lang/String;

    .line 429
    .line 430
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 431
    .line 432
    .line 433
    :cond_8
    iget-object v2, v0, Landroidx/media3/common/n0;->f:Ljava/lang/String;

    .line 434
    .line 435
    if-eqz v2, :cond_9

    .line 436
    .line 437
    sget-object v3, Landroidx/media3/common/n0;->m:Ljava/lang/String;

    .line 438
    .line 439
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    :cond_9
    iget-object v0, v0, Landroidx/media3/common/n0;->g:Ljava/lang/String;

    .line 443
    .line 444
    if-eqz v0, :cond_a

    .line 445
    .line 446
    sget-object v2, Landroidx/media3/common/n0;->n:Ljava/lang/String;

    .line 447
    .line 448
    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    :cond_a
    return-object v1

    .line 452
    :pswitch_4
    move-object/from16 v0, p1

    .line 453
    .line 454
    check-cast v0, Landroidx/media3/common/j1;

    .line 455
    .line 456
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    new-instance v1, Landroid/os/Bundle;

    .line 460
    .line 461
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 462
    .line 463
    .line 464
    iget v2, v0, Landroidx/media3/common/j1;->j:I

    .line 465
    .line 466
    if-eqz v2, :cond_b

    .line 467
    .line 468
    sget-object v3, Landroidx/media3/common/j1;->m:Ljava/lang/String;

    .line 469
    .line 470
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 471
    .line 472
    .line 473
    :cond_b
    iget v2, v0, Landroidx/media3/common/j1;->k:I

    .line 474
    .line 475
    if-eqz v2, :cond_c

    .line 476
    .line 477
    sget-object v3, Landroidx/media3/common/j1;->n:Ljava/lang/String;

    .line 478
    .line 479
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 480
    .line 481
    .line 482
    :cond_c
    iget v0, v0, Landroidx/media3/common/j1;->l:I

    .line 483
    .line 484
    if-eqz v0, :cond_d

    .line 485
    .line 486
    sget-object v2, Landroidx/media3/common/j1;->o:Ljava/lang/String;

    .line 487
    .line 488
    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 489
    .line 490
    .line 491
    :cond_d
    return-object v1

    .line 492
    :pswitch_5
    move-object/from16 v0, p1

    .line 493
    .line 494
    check-cast v0, Landroidx/media3/common/z;

    .line 495
    .line 496
    new-instance v1, Ljava/lang/StringBuilder;

    .line 497
    .line 498
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 499
    .line 500
    .line 501
    iget-object v2, v0, Landroidx/media3/common/z;->a:Ljava/lang/String;

    .line 502
    .line 503
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    const-string v2, ": "

    .line 507
    .line 508
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    iget-object v0, v0, Landroidx/media3/common/z;->b:Ljava/lang/String;

    .line 512
    .line 513
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    return-object v0

    .line 521
    :pswitch_6
    move-object/from16 v0, p1

    .line 522
    .line 523
    check-cast v0, Landroid/os/Bundle;

    .line 524
    .line 525
    new-instance v1, Landroidx/media3/common/z;

    .line 526
    .line 527
    sget-object v2, Landroidx/media3/common/z;->c:Ljava/lang/String;

    .line 528
    .line 529
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v2

    .line 533
    sget-object v3, Landroidx/media3/common/z;->d:Ljava/lang/String;

    .line 534
    .line 535
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    invoke-direct {v1, v2, v0}, Landroidx/media3/common/z;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    return-object v1

    .line 546
    nop

    .line 547
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(IIIII)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public c(Ljava/lang/Object;Landroidx/media3/common/u;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/media3/exoplayer/analytics/AnalyticsListener;

    .line 2
    .line 3
    invoke-static {p1, p2}, Landroidx/media3/exoplayer/analytics/DefaultAnalyticsCollector;->o0(Landroidx/media3/exoplayer/analytics/AnalyticsListener;Landroidx/media3/common/u;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public createTracker(Landroidx/media3/exoplayer/hls/HlsDataSourceFactory;Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParserFactory;)Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistTracker;
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/hls/playlist/DefaultHlsPlaylistTracker;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, Landroidx/media3/exoplayer/hls/playlist/DefaultHlsPlaylistTracker;-><init>(Landroidx/media3/exoplayer/hls/HlsDataSourceFactory;Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy;Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParserFactory;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public decode([BI)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Landroidx/media3/exoplayer/image/BitmapFactoryImageDecoder$Factory;->a([BI)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public p(Landroid/view/View;Lm0/r1;)Lm0/r1;
    .locals 3

    .line 1
    invoke-static {p1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iget-object v2, p2, Lm0/r1;->a:Lm0/o1;

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Lm0/o1;->f(I)Le0/b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget v1, v1, Le0/b;->b:I

    .line 18
    .line 19
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 22
    .line 23
    .line 24
    return-object p2

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 26
    .line 27
    const-string p2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 28
    .line 29
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1
.end method
