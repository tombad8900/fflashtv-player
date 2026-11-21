.class public final synthetic Lg2/d;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lb2/g;
.implements Le6/d;
.implements Ll1/d;


# instance fields
.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lg2/d;->j:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static bridge synthetic a(Landroid/content/res/Configuration;)I
    .locals 0

    .line 1
    iget p0, p0, Landroid/content/res/Configuration;->colorMode:I

    .line 2
    .line 3
    return p0
.end method

.method public static bridge synthetic c()Landroid/graphics/ColorSpace$Named;
    .locals 1

    .line 1
    sget-object v0, Landroid/graphics/ColorSpace$Named;->DISPLAY_P3:Landroid/graphics/ColorSpace$Named;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic d(Ljava/lang/Object;)Landroid/graphics/ImageDecoder$Source;
    .locals 0

    .line 1
    check-cast p0, Landroid/graphics/ImageDecoder$Source;

    .line 2
    .line 3
    return-object p0
.end method

.method public static bridge synthetic e()Landroid/view/WindowInsets;
    .locals 1

    .line 1
    sget-object v0, Landroid/view/WindowInsets;->CONSUMED:Landroid/view/WindowInsets;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic f(Landroid/content/res/Configuration;I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/content/res/Configuration;->colorMode:I

    .line 2
    .line 3
    return-void
.end method

.method public static bridge synthetic g(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/ColorSpace;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/graphics/BitmapFactory$Options;->inPreferredColorSpace:Landroid/graphics/ColorSpace;

    .line 2
    .line 3
    return-void
.end method

.method public static bridge synthetic h(Landroid/content/res/Configuration;)I
    .locals 0

    .line 1
    iget p0, p0, Landroid/content/res/Configuration;->fontWeightAdjustment:I

    .line 2
    .line 3
    return p0
.end method

.method public static bridge synthetic i()Landroid/graphics/ColorSpace$Named;
    .locals 1

    .line 1
    sget-object v0, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lg2/d;->j:I

    .line 4
    .line 5
    const/4 v5, 0x2

    .line 6
    const/4 v6, 0x1

    .line 7
    const/4 v7, 0x0

    .line 8
    sparse-switch v1, :sswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, Lk2/c;

    .line 14
    .line 15
    iget-wide v1, v1, Lk2/c;->b:J

    .line 16
    .line 17
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    cmp-long v3, v1, v3

    .line 23
    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    const-wide/16 v1, 0x0

    .line 27
    .line 28
    :cond_0
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    return-object v1

    .line 33
    :sswitch_0
    move-object/from16 v1, p1

    .line 34
    .line 35
    check-cast v1, Lg1/b;

    .line 36
    .line 37
    iget-object v8, v1, Lg1/b;->d:Landroid/graphics/Bitmap;

    .line 38
    .line 39
    new-instance v9, Landroid/os/Bundle;

    .line 40
    .line 41
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 42
    .line 43
    .line 44
    iget-object v10, v1, Lg1/b;->a:Ljava/lang/CharSequence;

    .line 45
    .line 46
    if-eqz v10, :cond_5

    .line 47
    .line 48
    sget-object v11, Lg1/b;->r:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v9, v11, v10}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    instance-of v11, v10, Landroid/text/Spanned;

    .line 54
    .line 55
    if-eqz v11, :cond_5

    .line 56
    .line 57
    check-cast v10, Landroid/text/Spanned;

    .line 58
    .line 59
    sget-object v11, Lg1/d;->a:Ljava/lang/String;

    .line 60
    .line 61
    new-instance v11, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 67
    .line 68
    .line 69
    move-result v12

    .line 70
    const-class v13, Lg1/g;

    .line 71
    .line 72
    invoke-interface {v10, v7, v12, v13}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v12

    .line 76
    check-cast v12, [Lg1/g;

    .line 77
    .line 78
    array-length v13, v12

    .line 79
    move v14, v7

    .line 80
    :goto_0
    if-ge v14, v13, :cond_1

    .line 81
    .line 82
    aget-object v15, v12, v14

    .line 83
    .line 84
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v2, Landroid/os/Bundle;

    .line 88
    .line 89
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 90
    .line 91
    .line 92
    sget-object v3, Lg1/g;->c:Ljava/lang/String;

    .line 93
    .line 94
    iget-object v4, v15, Lg1/g;->a:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    sget-object v3, Lg1/g;->d:Ljava/lang/String;

    .line 100
    .line 101
    iget v4, v15, Lg1/g;->b:I

    .line 102
    .line 103
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 104
    .line 105
    .line 106
    invoke-static {v10, v15, v6, v2}, Lg1/d;->a(Landroid/text/Spanned;Ljava/lang/Object;ILandroid/os/Bundle;)Landroid/os/Bundle;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    add-int/lit8 v14, v14, 0x1

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_1
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    const-class v3, Lg1/h;

    .line 121
    .line 122
    invoke-interface {v10, v7, v2, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    check-cast v2, [Lg1/h;

    .line 127
    .line 128
    array-length v3, v2

    .line 129
    move v4, v7

    .line 130
    :goto_1
    if-ge v4, v3, :cond_2

    .line 131
    .line 132
    aget-object v6, v2, v4

    .line 133
    .line 134
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    new-instance v12, Landroid/os/Bundle;

    .line 138
    .line 139
    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    .line 140
    .line 141
    .line 142
    sget-object v13, Lg1/h;->d:Ljava/lang/String;

    .line 143
    .line 144
    iget v14, v6, Lg1/h;->a:I

    .line 145
    .line 146
    invoke-virtual {v12, v13, v14}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 147
    .line 148
    .line 149
    sget-object v13, Lg1/h;->e:Ljava/lang/String;

    .line 150
    .line 151
    iget v14, v6, Lg1/h;->b:I

    .line 152
    .line 153
    invoke-virtual {v12, v13, v14}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 154
    .line 155
    .line 156
    sget-object v13, Lg1/h;->f:Ljava/lang/String;

    .line 157
    .line 158
    iget v14, v6, Lg1/h;->c:I

    .line 159
    .line 160
    invoke-virtual {v12, v13, v14}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 161
    .line 162
    .line 163
    invoke-static {v10, v6, v5, v12}, Lg1/d;->a(Landroid/text/Spanned;Ljava/lang/Object;ILandroid/os/Bundle;)Landroid/os/Bundle;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    add-int/lit8 v4, v4, 0x1

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_2
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    const-class v3, Lg1/e;

    .line 178
    .line 179
    invoke-interface {v10, v7, v2, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    check-cast v2, [Lg1/e;

    .line 184
    .line 185
    array-length v3, v2

    .line 186
    move v4, v7

    .line 187
    :goto_2
    if-ge v4, v3, :cond_3

    .line 188
    .line 189
    aget-object v5, v2, v4

    .line 190
    .line 191
    const/4 v6, 0x3

    .line 192
    const/4 v12, 0x0

    .line 193
    invoke-static {v10, v5, v6, v12}, Lg1/d;->a(Landroid/text/Spanned;Ljava/lang/Object;ILandroid/os/Bundle;)Landroid/os/Bundle;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    add-int/lit8 v4, v4, 0x1

    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_3
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    const-class v3, Lg1/i;

    .line 208
    .line 209
    invoke-interface {v10, v7, v2, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    check-cast v2, [Lg1/i;

    .line 214
    .line 215
    array-length v3, v2

    .line 216
    move v4, v7

    .line 217
    :goto_3
    if-ge v4, v3, :cond_4

    .line 218
    .line 219
    aget-object v5, v2, v4

    .line 220
    .line 221
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    new-instance v6, Landroid/os/Bundle;

    .line 225
    .line 226
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 227
    .line 228
    .line 229
    sget-object v12, Lg1/i;->b:Ljava/lang/String;

    .line 230
    .line 231
    iget-object v13, v5, Lg1/i;->a:Ljava/lang/String;

    .line 232
    .line 233
    invoke-virtual {v6, v12, v13}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    const/4 v12, 0x4

    .line 237
    invoke-static {v10, v5, v12, v6}, Lg1/d;->a(Landroid/text/Spanned;Ljava/lang/Object;ILandroid/os/Bundle;)Landroid/os/Bundle;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    add-int/lit8 v4, v4, 0x1

    .line 245
    .line 246
    goto :goto_3

    .line 247
    :cond_4
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    if-nez v2, :cond_5

    .line 252
    .line 253
    sget-object v2, Lg1/b;->s:Ljava/lang/String;

    .line 254
    .line 255
    invoke-virtual {v9, v2, v11}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 256
    .line 257
    .line 258
    :cond_5
    sget-object v2, Lg1/b;->t:Ljava/lang/String;

    .line 259
    .line 260
    iget-object v3, v1, Lg1/b;->b:Landroid/text/Layout$Alignment;

    .line 261
    .line 262
    invoke-virtual {v9, v2, v3}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 263
    .line 264
    .line 265
    sget-object v2, Lg1/b;->u:Ljava/lang/String;

    .line 266
    .line 267
    iget-object v3, v1, Lg1/b;->c:Landroid/text/Layout$Alignment;

    .line 268
    .line 269
    invoke-virtual {v9, v2, v3}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 270
    .line 271
    .line 272
    sget-object v2, Lg1/b;->x:Ljava/lang/String;

    .line 273
    .line 274
    iget v3, v1, Lg1/b;->e:F

    .line 275
    .line 276
    invoke-virtual {v9, v2, v3}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 277
    .line 278
    .line 279
    sget-object v2, Lg1/b;->y:Ljava/lang/String;

    .line 280
    .line 281
    iget v3, v1, Lg1/b;->f:I

    .line 282
    .line 283
    invoke-virtual {v9, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 284
    .line 285
    .line 286
    sget-object v2, Lg1/b;->z:Ljava/lang/String;

    .line 287
    .line 288
    iget v3, v1, Lg1/b;->g:I

    .line 289
    .line 290
    invoke-virtual {v9, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 291
    .line 292
    .line 293
    sget-object v2, Lg1/b;->A:Ljava/lang/String;

    .line 294
    .line 295
    iget v3, v1, Lg1/b;->h:F

    .line 296
    .line 297
    invoke-virtual {v9, v2, v3}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 298
    .line 299
    .line 300
    sget-object v2, Lg1/b;->B:Ljava/lang/String;

    .line 301
    .line 302
    iget v3, v1, Lg1/b;->i:I

    .line 303
    .line 304
    invoke-virtual {v9, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 305
    .line 306
    .line 307
    sget-object v2, Lg1/b;->C:Ljava/lang/String;

    .line 308
    .line 309
    iget v3, v1, Lg1/b;->n:I

    .line 310
    .line 311
    invoke-virtual {v9, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 312
    .line 313
    .line 314
    sget-object v2, Lg1/b;->D:Ljava/lang/String;

    .line 315
    .line 316
    iget v3, v1, Lg1/b;->o:F

    .line 317
    .line 318
    invoke-virtual {v9, v2, v3}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 319
    .line 320
    .line 321
    sget-object v2, Lg1/b;->E:Ljava/lang/String;

    .line 322
    .line 323
    iget v3, v1, Lg1/b;->j:F

    .line 324
    .line 325
    invoke-virtual {v9, v2, v3}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 326
    .line 327
    .line 328
    sget-object v2, Lg1/b;->F:Ljava/lang/String;

    .line 329
    .line 330
    iget v3, v1, Lg1/b;->k:F

    .line 331
    .line 332
    invoke-virtual {v9, v2, v3}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 333
    .line 334
    .line 335
    sget-object v2, Lg1/b;->H:Ljava/lang/String;

    .line 336
    .line 337
    iget-boolean v3, v1, Lg1/b;->l:Z

    .line 338
    .line 339
    invoke-virtual {v9, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 340
    .line 341
    .line 342
    sget-object v2, Lg1/b;->G:Ljava/lang/String;

    .line 343
    .line 344
    iget v3, v1, Lg1/b;->m:I

    .line 345
    .line 346
    invoke-virtual {v9, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 347
    .line 348
    .line 349
    sget-object v2, Lg1/b;->I:Ljava/lang/String;

    .line 350
    .line 351
    iget v3, v1, Lg1/b;->p:I

    .line 352
    .line 353
    invoke-virtual {v9, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 354
    .line 355
    .line 356
    sget-object v2, Lg1/b;->J:Ljava/lang/String;

    .line 357
    .line 358
    iget v1, v1, Lg1/b;->q:F

    .line 359
    .line 360
    invoke-virtual {v9, v2, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 361
    .line 362
    .line 363
    if-eqz v8, :cond_6

    .line 364
    .line 365
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 366
    .line 367
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 368
    .line 369
    .line 370
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 371
    .line 372
    invoke-virtual {v8, v2, v7, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    invoke-static {v2}, Lh1/a;->j(Z)V

    .line 377
    .line 378
    .line 379
    sget-object v2, Lg1/b;->w:Ljava/lang/String;

    .line 380
    .line 381
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    invoke-virtual {v9, v2, v1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 386
    .line 387
    .line 388
    :cond_6
    return-object v9

    .line 389
    :sswitch_1
    const/4 v12, 0x0

    .line 390
    move-object/from16 v1, p1

    .line 391
    .line 392
    check-cast v1, Landroid/os/Bundle;

    .line 393
    .line 394
    sget-object v2, Lg1/b;->r:Ljava/lang/String;

    .line 395
    .line 396
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    if-eqz v2, :cond_c

    .line 401
    .line 402
    sget-object v3, Lg1/b;->s:Ljava/lang/String;

    .line 403
    .line 404
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    if-eqz v3, :cond_b

    .line 409
    .line 410
    invoke-static {v2}, Landroid/text/SpannableString;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableString;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 415
    .line 416
    .line 417
    move-result v4

    .line 418
    move v8, v7

    .line 419
    :goto_4
    if-ge v8, v4, :cond_b

    .line 420
    .line 421
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v9

    .line 425
    add-int/lit8 v8, v8, 0x1

    .line 426
    .line 427
    check-cast v9, Landroid/os/Bundle;

    .line 428
    .line 429
    sget-object v10, Lg1/d;->a:Ljava/lang/String;

    .line 430
    .line 431
    invoke-virtual {v9, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 432
    .line 433
    .line 434
    move-result v10

    .line 435
    sget-object v11, Lg1/d;->b:Ljava/lang/String;

    .line 436
    .line 437
    invoke-virtual {v9, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 438
    .line 439
    .line 440
    move-result v11

    .line 441
    sget-object v13, Lg1/d;->c:Ljava/lang/String;

    .line 442
    .line 443
    invoke-virtual {v9, v13}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 444
    .line 445
    .line 446
    move-result v13

    .line 447
    sget-object v14, Lg1/d;->d:Ljava/lang/String;

    .line 448
    .line 449
    const/4 v15, -0x1

    .line 450
    invoke-virtual {v9, v14, v15}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 451
    .line 452
    .line 453
    move-result v14

    .line 454
    sget-object v15, Lg1/d;->e:Ljava/lang/String;

    .line 455
    .line 456
    invoke-virtual {v9, v15}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 457
    .line 458
    .line 459
    move-result-object v9

    .line 460
    if-eq v14, v6, :cond_a

    .line 461
    .line 462
    if-eq v14, v5, :cond_9

    .line 463
    .line 464
    const/4 v15, 0x3

    .line 465
    if-eq v14, v15, :cond_8

    .line 466
    .line 467
    const/4 v5, 0x4

    .line 468
    if-eq v14, v5, :cond_7

    .line 469
    .line 470
    goto :goto_5

    .line 471
    :cond_7
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    new-instance v14, Lg1/i;

    .line 475
    .line 476
    sget-object v5, Lg1/i;->b:Ljava/lang/String;

    .line 477
    .line 478
    invoke-virtual {v9, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v5

    .line 482
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    invoke-direct {v14, v5}, Lg1/i;-><init>(Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    invoke-interface {v2, v14, v10, v11, v13}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 489
    .line 490
    .line 491
    goto :goto_5

    .line 492
    :cond_8
    new-instance v5, Lg1/e;

    .line 493
    .line 494
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 495
    .line 496
    .line 497
    invoke-interface {v2, v5, v10, v11, v13}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 498
    .line 499
    .line 500
    goto :goto_5

    .line 501
    :cond_9
    const/4 v15, 0x3

    .line 502
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    new-instance v5, Lg1/h;

    .line 506
    .line 507
    sget-object v14, Lg1/h;->d:Ljava/lang/String;

    .line 508
    .line 509
    invoke-virtual {v9, v14}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 510
    .line 511
    .line 512
    move-result v14

    .line 513
    sget-object v6, Lg1/h;->e:Ljava/lang/String;

    .line 514
    .line 515
    invoke-virtual {v9, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 516
    .line 517
    .line 518
    move-result v6

    .line 519
    sget-object v12, Lg1/h;->f:Ljava/lang/String;

    .line 520
    .line 521
    invoke-virtual {v9, v12}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 522
    .line 523
    .line 524
    move-result v9

    .line 525
    invoke-direct {v5, v14, v6, v9}, Lg1/h;-><init>(III)V

    .line 526
    .line 527
    .line 528
    invoke-interface {v2, v5, v10, v11, v13}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 529
    .line 530
    .line 531
    goto :goto_5

    .line 532
    :cond_a
    const/4 v15, 0x3

    .line 533
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    new-instance v5, Lg1/g;

    .line 537
    .line 538
    sget-object v6, Lg1/g;->c:Ljava/lang/String;

    .line 539
    .line 540
    invoke-virtual {v9, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v6

    .line 544
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    sget-object v12, Lg1/g;->d:Ljava/lang/String;

    .line 548
    .line 549
    invoke-virtual {v9, v12}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 550
    .line 551
    .line 552
    move-result v9

    .line 553
    invoke-direct {v5, v6, v9}, Lg1/g;-><init>(Ljava/lang/String;I)V

    .line 554
    .line 555
    .line 556
    invoke-interface {v2, v5, v10, v11, v13}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 557
    .line 558
    .line 559
    :goto_5
    const/4 v5, 0x2

    .line 560
    const/4 v6, 0x1

    .line 561
    const/4 v12, 0x0

    .line 562
    goto/16 :goto_4

    .line 563
    .line 564
    :cond_b
    move-object/from16 v17, v2

    .line 565
    .line 566
    goto :goto_6

    .line 567
    :cond_c
    const/16 v17, 0x0

    .line 568
    .line 569
    :goto_6
    sget-object v2, Lg1/b;->t:Ljava/lang/String;

    .line 570
    .line 571
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    check-cast v2, Landroid/text/Layout$Alignment;

    .line 576
    .line 577
    if-eqz v2, :cond_d

    .line 578
    .line 579
    move-object/from16 v18, v2

    .line 580
    .line 581
    goto :goto_7

    .line 582
    :cond_d
    const/16 v18, 0x0

    .line 583
    .line 584
    :goto_7
    sget-object v2, Lg1/b;->u:Ljava/lang/String;

    .line 585
    .line 586
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 587
    .line 588
    .line 589
    move-result-object v2

    .line 590
    check-cast v2, Landroid/text/Layout$Alignment;

    .line 591
    .line 592
    if-eqz v2, :cond_e

    .line 593
    .line 594
    move-object/from16 v19, v2

    .line 595
    .line 596
    goto :goto_8

    .line 597
    :cond_e
    const/16 v19, 0x0

    .line 598
    .line 599
    :goto_8
    sget-object v2, Lg1/b;->v:Ljava/lang/String;

    .line 600
    .line 601
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    check-cast v2, Landroid/graphics/Bitmap;

    .line 606
    .line 607
    if-eqz v2, :cond_f

    .line 608
    .line 609
    move-object/from16 v20, v2

    .line 610
    .line 611
    goto :goto_9

    .line 612
    :cond_f
    sget-object v2, Lg1/b;->w:Ljava/lang/String;

    .line 613
    .line 614
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    if-eqz v2, :cond_10

    .line 619
    .line 620
    array-length v3, v2

    .line 621
    invoke-static {v2, v7, v3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 622
    .line 623
    .line 624
    move-result-object v3

    .line 625
    move-object/from16 v20, v3

    .line 626
    .line 627
    goto :goto_9

    .line 628
    :cond_10
    const/16 v20, 0x0

    .line 629
    .line 630
    :goto_9
    sget-object v2, Lg1/b;->x:Ljava/lang/String;

    .line 631
    .line 632
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 633
    .line 634
    .line 635
    move-result v3

    .line 636
    const v4, -0x800001

    .line 637
    .line 638
    .line 639
    const/high16 v5, -0x80000000

    .line 640
    .line 641
    if-eqz v3, :cond_11

    .line 642
    .line 643
    sget-object v3, Lg1/b;->y:Ljava/lang/String;

    .line 644
    .line 645
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 646
    .line 647
    .line 648
    move-result v6

    .line 649
    if-eqz v6, :cond_11

    .line 650
    .line 651
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 652
    .line 653
    .line 654
    move-result v2

    .line 655
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 656
    .line 657
    .line 658
    move-result v3

    .line 659
    move/from16 v21, v2

    .line 660
    .line 661
    move/from16 v22, v3

    .line 662
    .line 663
    goto :goto_a

    .line 664
    :cond_11
    move/from16 v21, v4

    .line 665
    .line 666
    move/from16 v22, v5

    .line 667
    .line 668
    :goto_a
    sget-object v2, Lg1/b;->z:Ljava/lang/String;

    .line 669
    .line 670
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 671
    .line 672
    .line 673
    move-result v3

    .line 674
    if-eqz v3, :cond_12

    .line 675
    .line 676
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 677
    .line 678
    .line 679
    move-result v2

    .line 680
    move/from16 v23, v2

    .line 681
    .line 682
    goto :goto_b

    .line 683
    :cond_12
    move/from16 v23, v5

    .line 684
    .line 685
    :goto_b
    sget-object v2, Lg1/b;->A:Ljava/lang/String;

    .line 686
    .line 687
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 688
    .line 689
    .line 690
    move-result v3

    .line 691
    if-eqz v3, :cond_13

    .line 692
    .line 693
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 694
    .line 695
    .line 696
    move-result v2

    .line 697
    move/from16 v24, v2

    .line 698
    .line 699
    goto :goto_c

    .line 700
    :cond_13
    move/from16 v24, v4

    .line 701
    .line 702
    :goto_c
    sget-object v2, Lg1/b;->B:Ljava/lang/String;

    .line 703
    .line 704
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 705
    .line 706
    .line 707
    move-result v3

    .line 708
    if-eqz v3, :cond_14

    .line 709
    .line 710
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 711
    .line 712
    .line 713
    move-result v2

    .line 714
    move/from16 v25, v2

    .line 715
    .line 716
    goto :goto_d

    .line 717
    :cond_14
    move/from16 v25, v5

    .line 718
    .line 719
    :goto_d
    sget-object v2, Lg1/b;->D:Ljava/lang/String;

    .line 720
    .line 721
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 722
    .line 723
    .line 724
    move-result v3

    .line 725
    if-eqz v3, :cond_15

    .line 726
    .line 727
    sget-object v3, Lg1/b;->C:Ljava/lang/String;

    .line 728
    .line 729
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 730
    .line 731
    .line 732
    move-result v6

    .line 733
    if-eqz v6, :cond_15

    .line 734
    .line 735
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 736
    .line 737
    .line 738
    move-result v2

    .line 739
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 740
    .line 741
    .line 742
    move-result v3

    .line 743
    move/from16 v27, v2

    .line 744
    .line 745
    move/from16 v26, v3

    .line 746
    .line 747
    goto :goto_e

    .line 748
    :cond_15
    move/from16 v27, v4

    .line 749
    .line 750
    move/from16 v26, v5

    .line 751
    .line 752
    :goto_e
    sget-object v2, Lg1/b;->E:Ljava/lang/String;

    .line 753
    .line 754
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 755
    .line 756
    .line 757
    move-result v3

    .line 758
    if-eqz v3, :cond_16

    .line 759
    .line 760
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 761
    .line 762
    .line 763
    move-result v2

    .line 764
    move/from16 v28, v2

    .line 765
    .line 766
    goto :goto_f

    .line 767
    :cond_16
    move/from16 v28, v4

    .line 768
    .line 769
    :goto_f
    sget-object v2, Lg1/b;->F:Ljava/lang/String;

    .line 770
    .line 771
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 772
    .line 773
    .line 774
    move-result v3

    .line 775
    if-eqz v3, :cond_17

    .line 776
    .line 777
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 778
    .line 779
    .line 780
    move-result v4

    .line 781
    :cond_17
    move/from16 v29, v4

    .line 782
    .line 783
    sget-object v2, Lg1/b;->G:Ljava/lang/String;

    .line 784
    .line 785
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 786
    .line 787
    .line 788
    move-result v3

    .line 789
    if-eqz v3, :cond_18

    .line 790
    .line 791
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 792
    .line 793
    .line 794
    move-result v2

    .line 795
    const/4 v6, 0x1

    .line 796
    :goto_10
    move/from16 v31, v2

    .line 797
    .line 798
    goto :goto_11

    .line 799
    :cond_18
    const/high16 v2, -0x1000000

    .line 800
    .line 801
    move v6, v7

    .line 802
    goto :goto_10

    .line 803
    :goto_11
    sget-object v2, Lg1/b;->H:Ljava/lang/String;

    .line 804
    .line 805
    invoke-virtual {v1, v2, v7}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 806
    .line 807
    .line 808
    move-result v2

    .line 809
    if-nez v2, :cond_19

    .line 810
    .line 811
    move/from16 v30, v7

    .line 812
    .line 813
    goto :goto_12

    .line 814
    :cond_19
    move/from16 v30, v6

    .line 815
    .line 816
    :goto_12
    sget-object v2, Lg1/b;->I:Ljava/lang/String;

    .line 817
    .line 818
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 819
    .line 820
    .line 821
    move-result v3

    .line 822
    if-eqz v3, :cond_1a

    .line 823
    .line 824
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 825
    .line 826
    .line 827
    move-result v5

    .line 828
    :cond_1a
    move/from16 v32, v5

    .line 829
    .line 830
    sget-object v2, Lg1/b;->J:Ljava/lang/String;

    .line 831
    .line 832
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 833
    .line 834
    .line 835
    move-result v3

    .line 836
    if-eqz v3, :cond_1b

    .line 837
    .line 838
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 839
    .line 840
    .line 841
    move-result v1

    .line 842
    :goto_13
    move/from16 v33, v1

    .line 843
    .line 844
    goto :goto_14

    .line 845
    :cond_1b
    const/4 v1, 0x0

    .line 846
    goto :goto_13

    .line 847
    :goto_14
    new-instance v16, Lg1/b;

    .line 848
    .line 849
    invoke-direct/range {v16 .. v33}, Lg1/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    .line 850
    .line 851
    .line 852
    return-object v16

    .line 853
    :sswitch_2
    move-object/from16 v1, p1

    .line 854
    .line 855
    check-cast v1, Lh2/q;

    .line 856
    .line 857
    return-object v1

    .line 858
    nop

    .line 859
    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_2
        0xc -> :sswitch_1
        0xd -> :sswitch_0
    .end sparse-switch
.end method

.method public b(IIIII)Z
    .locals 3

    .line 1
    const/16 v0, 0x43

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/16 v2, 0x4d

    .line 5
    .line 6
    if-ne p2, v0, :cond_0

    .line 7
    .line 8
    const/16 v0, 0x4f

    .line 9
    .line 10
    if-ne p3, v0, :cond_0

    .line 11
    .line 12
    if-ne p4, v2, :cond_0

    .line 13
    .line 14
    if-eq p5, v2, :cond_1

    .line 15
    .line 16
    if-eq p1, v1, :cond_1

    .line 17
    .line 18
    :cond_0
    if-ne p2, v2, :cond_2

    .line 19
    .line 20
    const/16 p2, 0x4c

    .line 21
    .line 22
    if-ne p3, p2, :cond_2

    .line 23
    .line 24
    if-ne p4, p2, :cond_2

    .line 25
    .line 26
    const/16 p2, 0x54

    .line 27
    .line 28
    if-eq p5, p2, :cond_1

    .line 29
    .line 30
    if-ne p1, v1, :cond_2

    .line 31
    .line 32
    :cond_1
    const/4 p1, 0x1

    .line 33
    return p1

    .line 34
    :cond_2
    const/4 p1, 0x0

    .line 35
    return p1
.end method
