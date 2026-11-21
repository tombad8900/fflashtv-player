.class public abstract Lj5/h;
.super Landroid/widget/LinearLayout;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final u:Ljava/lang/Object;


# instance fields
.field public j:I

.field public final k:Ljava/util/ArrayList;

.field public final l:La1/o;

.field public final m:Lj5/f;

.field public n:[Ljava/lang/Integer;

.field public o:Ly5/a0;

.field public p:Ly5/c0;

.field public q:I

.field public r:Ly5/e0;

.field public s:Z

.field public final t:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 11

    .line 1
    const v0, 0x7f1204f4

    .line 2
    .line 3
    .line 4
    const v4, 0x7f04035e

    .line 5
    .line 6
    .line 7
    invoke-static {p1, p2, v4, v0}, Ld6/a;->b(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, p1, p2, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput p1, p0, Lj5/h;->j:I

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lj5/h;->k:Ljava/util/ArrayList;

    .line 23
    .line 24
    new-instance v0, La1/o;

    .line 25
    .line 26
    move-object v1, p0

    .line 27
    check-cast v1, Lcom/google/android/material/button/MaterialButtonToggleGroup;

    .line 28
    .line 29
    const/16 v2, 0x1c

    .line 30
    .line 31
    invoke-direct {v0, v2, v1}, La1/o;-><init>(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lj5/h;->l:La1/o;

    .line 35
    .line 36
    new-instance v0, Lj5/f;

    .line 37
    .line 38
    invoke-direct {v0, v1}, Lj5/f;-><init>(Lcom/google/android/material/button/MaterialButtonToggleGroup;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lj5/h;->m:Lj5/f;

    .line 42
    .line 43
    const/4 v7, 0x1

    .line 44
    iput-boolean v7, p0, Lj5/h;->s:Z

    .line 45
    .line 46
    new-instance v0, Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 49
    .line 50
    .line 51
    new-instance v0, Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 54
    .line 55
    .line 56
    new-instance v0, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    new-instance v0, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    new-instance v0, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Lj5/h;->t:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const v5, 0x7f1204f4

    .line 78
    .line 79
    .line 80
    new-array v6, p1, [I

    .line 81
    .line 82
    sget-object v3, Ld5/a;->l:[I

    .line 83
    .line 84
    move-object v2, p2

    .line 85
    invoke-static/range {v1 .. v6}, Ls5/l;->e(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    const/4 v2, 0x2

    .line 90
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    const-string v3, "No start tag found"

    .line 95
    .line 96
    const-string v4, "selector"

    .line 97
    .line 98
    const-string v5, "xml"

    .line 99
    .line 100
    if-eqz v0, :cond_6

    .line 101
    .line 102
    invoke-virtual {p2, v2, p1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    const/4 v6, 0x0

    .line 107
    if-nez v0, :cond_0

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_0
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    invoke-virtual {v8, v0}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    if-nez v8, :cond_1

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_1
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    invoke-virtual {v8, v0}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 130
    .line 131
    .line 132
    move-result-object v8
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    :try_start_1
    new-instance v0, Ly5/e0;

    .line 134
    .line 135
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 136
    .line 137
    .line 138
    const/16 v9, 0xa

    .line 139
    .line 140
    new-array v10, v9, [[I

    .line 141
    .line 142
    iput-object v10, v0, Ly5/e0;->c:[[I

    .line 143
    .line 144
    new-array v9, v9, [Ll/o;

    .line 145
    .line 146
    iput-object v9, v0, Ly5/e0;->d:[Ll/o;

    .line 147
    .line 148
    invoke-static {v8}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    :goto_0
    invoke-interface {v8}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 153
    .line 154
    .line 155
    move-result v10

    .line 156
    if-eq v10, v2, :cond_2

    .line 157
    .line 158
    if-eq v10, v7, :cond_2

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_2
    if-ne v10, v2, :cond_4

    .line 162
    .line 163
    invoke-interface {v8}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v10

    .line 167
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    if-eqz v10, :cond_3

    .line 172
    .line 173
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    invoke-virtual {v0, v1, v8, v9, v10}, Ly5/e0;->a(Landroid/content/Context;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 178
    .line 179
    .line 180
    goto :goto_1

    .line 181
    :catchall_0
    move-exception v0

    .line 182
    move-object v9, v0

    .line 183
    goto :goto_2

    .line 184
    :cond_3
    :goto_1
    :try_start_2
    invoke-interface {v8}, Landroid/content/res/XmlResourceParser;->close()V
    :try_end_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    .line 185
    .line 186
    .line 187
    move-object v6, v0

    .line 188
    goto :goto_4

    .line 189
    :cond_4
    :try_start_3
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 190
    .line 191
    invoke-direct {v0, v3}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 195
    :goto_2
    if-eqz v8, :cond_5

    .line 196
    .line 197
    :try_start_4
    invoke-interface {v8}, Landroid/content/res/XmlResourceParser;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 198
    .line 199
    .line 200
    goto :goto_3

    .line 201
    :catchall_1
    move-exception v0

    .line 202
    :try_start_5
    invoke-virtual {v9, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 203
    .line 204
    .line 205
    :cond_5
    :goto_3
    throw v9
    :try_end_5
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_5 .. :try_end_5} :catch_0

    .line 206
    :catch_0
    :goto_4
    iput-object v6, p0, Lj5/h;->r:Ly5/e0;

    .line 207
    .line 208
    :cond_6
    const/4 v0, 0x6

    .line 209
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    if-eqz v6, :cond_8

    .line 214
    .line 215
    invoke-static {v1, p2, v0}, Ly5/c0;->g(Landroid/content/Context;Landroid/content/res/TypedArray;I)Ly5/c0;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    iput-object v6, p0, Lj5/h;->p:Ly5/c0;

    .line 220
    .line 221
    if-nez v6, :cond_8

    .line 222
    .line 223
    new-instance v6, Ly5/b0;

    .line 224
    .line 225
    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    const/4 v8, 0x7

    .line 230
    invoke-virtual {p2, v8, p1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 231
    .line 232
    .line 233
    move-result v8

    .line 234
    new-instance v9, Ly5/a;

    .line 235
    .line 236
    int-to-float v10, p1

    .line 237
    invoke-direct {v9, v10}, Ly5/a;-><init>(F)V

    .line 238
    .line 239
    .line 240
    new-instance v10, Landroid/view/ContextThemeWrapper;

    .line 241
    .line 242
    invoke-direct {v10, v1, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 243
    .line 244
    .line 245
    if-eqz v8, :cond_7

    .line 246
    .line 247
    invoke-virtual {v10}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-virtual {v0, v8, v7}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 252
    .line 253
    .line 254
    :cond_7
    sget-object v0, Ld5/a;->A:[I

    .line 255
    .line 256
    invoke-virtual {v10, v0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-static {v0, v9}, Ly5/o;->g(Landroid/content/res/TypedArray;Ly5/a;)Ly5/n;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-virtual {v0}, Ly5/n;->a()Ly5/o;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-direct {v6, v0}, Ly5/b0;-><init>(Ly5/o;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v6}, Ly5/b0;->b()Ly5/c0;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    iput-object v0, p0, Lj5/h;->p:Ly5/c0;

    .line 276
    .line 277
    :cond_8
    const/4 v0, 0x3

    .line 278
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 279
    .line 280
    .line 281
    move-result v6

    .line 282
    if-eqz v6, :cond_f

    .line 283
    .line 284
    new-instance v6, Ly5/a;

    .line 285
    .line 286
    const/4 v8, 0x0

    .line 287
    invoke-direct {v6, v8}, Ly5/a;-><init>(F)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 291
    .line 292
    .line 293
    move-result v8

    .line 294
    if-nez v8, :cond_9

    .line 295
    .line 296
    invoke-static {p2, v0, v6}, Ly5/o;->h(Landroid/content/res/TypedArray;ILy5/d;)Ly5/d;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-static {v0}, Ly5/a0;->b(Ly5/d;)Ly5/a0;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    goto :goto_9

    .line 305
    :cond_9
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 306
    .line 307
    .line 308
    move-result-object v9

    .line 309
    invoke-virtual {v9, v8}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v9

    .line 313
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v5

    .line 317
    if-nez v5, :cond_a

    .line 318
    .line 319
    invoke-static {p2, v0, v6}, Ly5/o;->h(Landroid/content/res/TypedArray;ILy5/d;)Ly5/d;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-static {v0}, Ly5/a0;->b(Ly5/d;)Ly5/a0;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    goto :goto_9

    .line 328
    :cond_a
    :try_start_6
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 333
    .line 334
    .line 335
    move-result-object v5
    :try_end_6
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_6 .. :try_end_6} :catch_1

    .line 336
    :try_start_7
    new-instance v0, Ly5/a0;

    .line 337
    .line 338
    invoke-direct {v0}, Ly5/a0;-><init>()V

    .line 339
    .line 340
    .line 341
    invoke-static {v5}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 342
    .line 343
    .line 344
    move-result-object v8

    .line 345
    :goto_5
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 346
    .line 347
    .line 348
    move-result v9

    .line 349
    if-eq v9, v2, :cond_b

    .line 350
    .line 351
    if-eq v9, v7, :cond_b

    .line 352
    .line 353
    goto :goto_5

    .line 354
    :cond_b
    if-ne v9, v2, :cond_d

    .line 355
    .line 356
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v2

    .line 364
    if-eqz v2, :cond_c

    .line 365
    .line 366
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    invoke-virtual {v0, v1, v5, v8, v2}, Ly5/a0;->d(Landroid/content/Context;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 371
    .line 372
    .line 373
    goto :goto_6

    .line 374
    :catchall_2
    move-exception v0

    .line 375
    move-object v1, v0

    .line 376
    goto :goto_7

    .line 377
    :cond_c
    :goto_6
    :try_start_8
    invoke-interface {v5}, Landroid/content/res/XmlResourceParser;->close()V
    :try_end_8
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_8 .. :try_end_8} :catch_1

    .line 378
    .line 379
    .line 380
    goto :goto_9

    .line 381
    :cond_d
    :try_start_9
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 382
    .line 383
    invoke-direct {v0, v3}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 387
    :goto_7
    if-eqz v5, :cond_e

    .line 388
    .line 389
    :try_start_a
    invoke-interface {v5}, Landroid/content/res/XmlResourceParser;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 390
    .line 391
    .line 392
    goto :goto_8

    .line 393
    :catchall_3
    move-exception v0

    .line 394
    :try_start_b
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 395
    .line 396
    .line 397
    :cond_e
    :goto_8
    throw v1
    :try_end_b
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_b .. :try_end_b} :catch_1
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_b .. :try_end_b} :catch_1

    .line 398
    :catch_1
    invoke-static {v6}, Ly5/a0;->b(Ly5/d;)Ly5/a0;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    :goto_9
    iput-object v0, p0, Lj5/h;->o:Ly5/a0;

    .line 403
    .line 404
    :cond_f
    invoke-virtual {p2, v7, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    iput v0, p0, Lj5/h;->q:I

    .line 409
    .line 410
    invoke-virtual {p0, v7}, Landroid/view/ViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {p2, p1, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    invoke-virtual {p0, v0}, Lj5/h;->setEnabled(Z)V

    .line 418
    .line 419
    .line 420
    const/4 v0, 0x5

    .line 421
    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 422
    .line 423
    .line 424
    move-result p1

    .line 425
    invoke-virtual {p0, p1}, Lj5/h;->setOverflowMode(I)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 429
    .line 430
    .line 431
    move-result-object p1

    .line 432
    const v0, 0x7f07011e

    .line 433
    .line 434
    .line 435
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 436
    .line 437
    .line 438
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 439
    .line 440
    .line 441
    return-void
.end method

.method public static d(Landroid/view/View;)Landroid/widget/LinearLayout$LayoutParams;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lj5/g;

    .line 13
    .line 14
    iget v1, p0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 15
    .line 16
    iget p0, p0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 17
    .line 18
    invoke-direct {v0, v1, p0}, Lj5/g;-><init>(II)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public static f(Landroid/view/ViewGroup$LayoutParams;)Lj5/g;
    .locals 1

    .line 1
    instance-of v0, p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lj5/g;

    .line 6
    .line 7
    check-cast p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/widget/LinearLayout$LayoutParams;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Lj5/g;

    .line 18
    .line 19
    check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    new-instance v0, Lj5/g;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method private getFirstVisibleChildIndex()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lj5/h;->i(I)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 v0, -0x1

    .line 19
    return v0
.end method

.method private getLastVisibleChildIndex()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    :goto_0
    if-ltz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lj5/h;->i(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    return v0

    .line 16
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 v0, -0x1

    .line 20
    return v0
.end method

.method private setGeneratedIdIfNeeded(Lcom/google/android/material/button/MaterialButton;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1, v0}, Landroid/view/View;->setId(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 10

    .line 1
    invoke-direct {p0}, Lj5/h;->getFirstVisibleChildIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_3

    .line 9
    .line 10
    :cond_0
    add-int/lit8 v2, v0, 0x1

    .line 11
    .line 12
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, 0x1

    .line 17
    const/4 v5, 0x0

    .line 18
    if-ge v2, v3, :cond_4

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    add-int/lit8 v6, v2, -0x1

    .line 25
    .line 26
    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    instance-of v7, v3, Lcom/google/android/material/button/MaterialButton;

    .line 31
    .line 32
    if-eqz v7, :cond_2

    .line 33
    .line 34
    instance-of v7, v6, Lcom/google/android/material/button/MaterialButton;

    .line 35
    .line 36
    if-eqz v7, :cond_2

    .line 37
    .line 38
    move-object v7, v3

    .line 39
    check-cast v7, Lcom/google/android/material/button/MaterialButton;

    .line 40
    .line 41
    check-cast v6, Lcom/google/android/material/button/MaterialButton;

    .line 42
    .line 43
    iget v8, p0, Lj5/h;->q:I

    .line 44
    .line 45
    if-gtz v8, :cond_1

    .line 46
    .line 47
    invoke-virtual {v7}, Lcom/google/android/material/button/MaterialButton;->getStrokeWidth()I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    invoke-virtual {v6}, Lcom/google/android/material/button/MaterialButton;->getStrokeWidth()I

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    invoke-virtual {v7, v4}, Lcom/google/android/material/button/MaterialButton;->setShouldDrawSurfaceColorStroke(Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v6, v4}, Lcom/google/android/material/button/MaterialButton;->setShouldDrawSurfaceColorStroke(Z)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-virtual {v7, v5}, Lcom/google/android/material/button/MaterialButton;->setShouldDrawSurfaceColorStroke(Z)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v6, v5}, Lcom/google/android/material/button/MaterialButton;->setShouldDrawSurfaceColorStroke(Z)V

    .line 70
    .line 71
    .line 72
    :cond_2
    move v8, v5

    .line 73
    :goto_1
    invoke-static {v3}, Lj5/h;->d(Landroid/view/View;)Landroid/widget/LinearLayout$LayoutParams;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getOrientation()I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-nez v6, :cond_3

    .line 82
    .line 83
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 84
    .line 85
    .line 86
    iget v6, p0, Lj5/h;->q:I

    .line 87
    .line 88
    sub-int/2addr v6, v8

    .line 89
    invoke-virtual {v4, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 90
    .line 91
    .line 92
    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 96
    .line 97
    iget v6, p0, Lj5/h;->q:I

    .line 98
    .line 99
    sub-int/2addr v6, v8

    .line 100
    iput v6, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 101
    .line 102
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 103
    .line 104
    .line 105
    :goto_2
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 106
    .line 107
    .line 108
    add-int/lit8 v2, v2, 0x1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_7

    .line 116
    .line 117
    if-ne v0, v1, :cond_5

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_5
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 125
    .line 126
    invoke-static {v0}, Lj5/h;->d(Landroid/view/View;)Landroid/widget/LinearLayout$LayoutParams;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getOrientation()I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-ne v1, v4, :cond_6

    .line 135
    .line 136
    iput v5, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 137
    .line 138
    iput v5, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 139
    .line 140
    return-void

    .line 141
    :cond_6
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 145
    .line 146
    .line 147
    iput v5, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 148
    .line 149
    iput v5, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 150
    .line 151
    :cond_7
    :goto_3
    return-void
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/google/android/material/button/MaterialButton;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p1, "MButtonGroup"

    .line 6
    .line 7
    const-string p2, "Child views must be of type MaterialButton."

    .line 8
    .line 9
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p0}, Lj5/h;->j()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Lj5/h;->s:Z

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-ltz v0, :cond_1

    .line 25
    .line 26
    const/4 v1, -0x1

    .line 27
    if-ne p2, v1, :cond_1

    .line 28
    .line 29
    invoke-super {p0, p1, v0, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 37
    .line 38
    invoke-direct {p0, p1}, Lj5/h;->setGeneratedIdIfNeeded(Lcom/google/android/material/button/MaterialButton;)V

    .line 39
    .line 40
    .line 41
    iget-object p2, p0, Lj5/h;->l:La1/o;

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Lcom/google/android/material/button/MaterialButton;->setOnPressedChangeListenerInternal(Lj5/c;)V

    .line 44
    .line 45
    .line 46
    iget-object p2, p0, Lj5/h;->k:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/google/android/material/button/MaterialButton;->getShapeAppearance()Ly5/m;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lj5/h;->getFirstVisibleChildIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0}, Lj5/h;->getLastVisibleChildIndex()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, -0x1

    .line 10
    if-eq v0, v2, :cond_3

    .line 11
    .line 12
    iget-object v2, p0, Lj5/h;->r:Ly5/e0;

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    goto :goto_3

    .line 17
    :cond_0
    iget v2, p0, Lj5/h;->j:I

    .line 18
    .line 19
    const/4 v3, 0x2

    .line 20
    if-ne v2, v3, :cond_2

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    :goto_0
    iget-object v1, p0, Lj5/h;->t:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-ge v0, v2, :cond_3

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    add-int/lit8 v3, v3, -0x1

    .line 46
    .line 47
    if-ne v0, v3, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    :goto_1
    add-int/lit8 v1, v1, -0x1

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_1
    add-int/lit8 v3, v0, 0x1

    .line 57
    .line 58
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    goto :goto_1

    .line 69
    :goto_2
    invoke-virtual {p0, v2, v1}, Lj5/h;->c(II)V

    .line 70
    .line 71
    .line 72
    add-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    invoke-virtual {p0, v0, v1}, Lj5/h;->c(II)V

    .line 76
    .line 77
    .line 78
    :cond_3
    :goto_3
    return-void
.end method

.method public final c(II)V
    .locals 11

    .line 1
    if-ne p1, p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 8
    .line 9
    sget-object p2, Lj5/e;->j:Lj5/e;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Lcom/google/android/material/button/MaterialButton;->setWidthChangeDirection(Lj5/e;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const v0, 0x7fffffff

    .line 16
    .line 17
    .line 18
    move v1, p1

    .line 19
    :goto_0
    const/4 v2, 0x2

    .line 20
    if-gt v1, p2, :cond_c

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lj5/h;->i(I)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    goto/16 :goto_8

    .line 29
    .line 30
    :cond_1
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lcom/google/android/material/button/MaterialButton;

    .line 35
    .line 36
    if-ne v1, p1, :cond_2

    .line 37
    .line 38
    sget-object v4, Lj5/e;->l:Lj5/e;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    if-ne v1, p2, :cond_3

    .line 42
    .line 43
    sget-object v4, Lj5/e;->k:Lj5/e;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    sget-object v4, Lj5/e;->m:Lj5/e;

    .line 47
    .line 48
    :goto_1
    invoke-virtual {v3, v4}, Lcom/google/android/material/button/MaterialButton;->setWidthChangeDirection(Lj5/e;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v1}, Lj5/h;->i(I)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    const/4 v4, 0x0

    .line 56
    if-eqz v3, :cond_a

    .line 57
    .line 58
    iget-object v3, p0, Lj5/h;->r:Ly5/e0;

    .line 59
    .line 60
    if-nez v3, :cond_4

    .line 61
    .line 62
    goto :goto_7

    .line 63
    :cond_4
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    check-cast v3, Lcom/google/android/material/button/MaterialButton;

    .line 68
    .line 69
    iget-object v5, p0, Lj5/h;->r:Ly5/e0;

    .line 70
    .line 71
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    neg-int v6, v3

    .line 76
    move v7, v4

    .line 77
    :goto_2
    iget v8, v5, Ly5/e0;->a:I

    .line 78
    .line 79
    if-ge v7, v8, :cond_7

    .line 80
    .line 81
    iget-object v8, v5, Ly5/e0;->d:[Ll/o;

    .line 82
    .line 83
    aget-object v8, v8, v7

    .line 84
    .line 85
    iget-object v8, v8, Ll/o;->j:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v8, Ly5/d0;

    .line 88
    .line 89
    iget v9, v8, Ly5/d0;->a:I

    .line 90
    .line 91
    iget v8, v8, Ly5/d0;->b:F

    .line 92
    .line 93
    if-ne v9, v2, :cond_5

    .line 94
    .line 95
    int-to-float v6, v6

    .line 96
    invoke-static {v6, v8}, Ljava/lang/Math;->max(FF)F

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    :goto_3
    float-to-int v6, v6

    .line 101
    goto :goto_4

    .line 102
    :cond_5
    const/4 v10, 0x1

    .line 103
    if-ne v9, v10, :cond_6

    .line 104
    .line 105
    int-to-float v6, v6

    .line 106
    int-to-float v9, v3

    .line 107
    mul-float/2addr v9, v8

    .line 108
    invoke-static {v6, v9}, Ljava/lang/Math;->max(FF)F

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    goto :goto_3

    .line 113
    :cond_6
    :goto_4
    add-int/lit8 v7, v7, 0x1

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_7
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    invoke-virtual {p0, v1}, Lj5/h;->h(I)Lcom/google/android/material/button/MaterialButton;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    if-nez v3, :cond_8

    .line 125
    .line 126
    move v3, v4

    .line 127
    goto :goto_5

    .line 128
    :cond_8
    invoke-virtual {v3}, Lcom/google/android/material/button/MaterialButton;->getAllowedWidthDecrease()I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    :goto_5
    invoke-virtual {p0, v1}, Lj5/h;->g(I)Lcom/google/android/material/button/MaterialButton;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    if-nez v5, :cond_9

    .line 137
    .line 138
    goto :goto_6

    .line 139
    :cond_9
    invoke-virtual {v5}, Lcom/google/android/material/button/MaterialButton;->getAllowedWidthDecrease()I

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    :goto_6
    add-int/2addr v3, v4

    .line 144
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    :cond_a
    :goto_7
    if-eq v1, p1, :cond_b

    .line 149
    .line 150
    if-eq v1, p2, :cond_b

    .line 151
    .line 152
    div-int/lit8 v4, v4, 0x2

    .line 153
    .line 154
    :cond_b
    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    :goto_8
    add-int/lit8 v1, v1, 0x1

    .line 159
    .line 160
    goto/16 :goto_0

    .line 161
    .line 162
    :cond_c
    :goto_9
    if-gt p1, p2, :cond_e

    .line 163
    .line 164
    invoke-virtual {p0, p1}, Lj5/h;->i(I)Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-nez v1, :cond_d

    .line 169
    .line 170
    goto :goto_a

    .line 171
    :cond_d
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    check-cast v1, Lcom/google/android/material/button/MaterialButton;

    .line 176
    .line 177
    iget-object v3, p0, Lj5/h;->r:Ly5/e0;

    .line 178
    .line 179
    invoke-virtual {v1, v3}, Lcom/google/android/material/button/MaterialButton;->setSizeChange(Ly5/e0;)V

    .line 180
    .line 181
    .line 182
    mul-int/lit8 v3, v0, 0x2

    .line 183
    .line 184
    invoke-virtual {v1, v3}, Lcom/google/android/material/button/MaterialButton;->setWidthChangeMax(I)V

    .line 185
    .line 186
    .line 187
    :goto_a
    add-int/lit8 p1, p1, 0x1

    .line 188
    .line 189
    goto :goto_9

    .line 190
    :cond_e
    return-void
.end method

.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Lj5/g;

    .line 2
    .line 3
    return p1
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/TreeMap;

    .line 2
    .line 3
    iget-object v1, p0, Lj5/h;->m:Lj5/f;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v2

    .line 14
    :goto_0
    if-ge v3, v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    check-cast v4, Lcom/google/android/material/button/MaterialButton;

    .line 21
    .line 22
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-virtual {v0, v4, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-array v1, v2, [Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, [Ljava/lang/Integer;

    .line 43
    .line 44
    iput-object v0, p0, Lj5/h;->n:[Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final e(Landroid/util/AttributeSet;)Lj5/g;
    .locals 3

    .line 1
    new-instance v0, Lj5/g;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 8
    .line 9
    .line 10
    sget-object v2, Ld5/a;->m:[I

    .line 11
    .line 12
    invoke-virtual {v1, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public final g(I)Lcom/google/android/material/button/MaterialButton;
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v1, p1, 0x1

    .line 6
    .line 7
    :goto_0
    const/4 v2, -0x1

    .line 8
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lj5/h;->i(I)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move v1, v2

    .line 21
    :goto_1
    iget-object v3, p0, Lj5/h;->t:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-nez v4, :cond_4

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    :goto_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-ge v4, v5, :cond_4

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    check-cast v5, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    add-int/lit8 v6, v6, -0x1

    .line 51
    .line 52
    if-ne v4, v6, :cond_2

    .line 53
    .line 54
    add-int/lit8 v6, v0, -0x1

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_2
    add-int/lit8 v6, v4, 0x1

    .line 58
    .line 59
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    check-cast v6, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    add-int/lit8 v6, v6, -0x1

    .line 70
    .line 71
    :goto_3
    if-lt p1, v5, :cond_3

    .line 72
    .line 73
    if-gt p1, v6, :cond_3

    .line 74
    .line 75
    if-lt v1, v5, :cond_5

    .line 76
    .line 77
    if-le v1, v6, :cond_3

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    if-ne v1, v2, :cond_6

    .line 84
    .line 85
    :cond_5
    :goto_4
    const/4 p1, 0x0

    .line 86
    return-object p1

    .line 87
    :cond_6
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 92
    .line 93
    return-object p1
.end method

.method public final generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1
    new-instance v0, Lj5/g;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Lj5/g;-><init>(II)V

    return-object v0
.end method

.method public final generateDefaultLayoutParams()Landroid/widget/LinearLayout$LayoutParams;
    .locals 2

    .line 2
    new-instance v0, Lj5/g;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Lj5/g;-><init>(II)V

    return-object v0
.end method

.method public final bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lj5/h;->e(Landroid/util/AttributeSet;)Lj5/g;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 2
    invoke-static {p1}, Lj5/h;->f(Landroid/view/ViewGroup$LayoutParams;)Lj5/g;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/widget/LinearLayout$LayoutParams;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lj5/h;->e(Landroid/util/AttributeSet;)Lj5/g;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/widget/LinearLayout$LayoutParams;
    .locals 0

    .line 4
    invoke-static {p1}, Lj5/h;->f(Landroid/view/ViewGroup$LayoutParams;)Lj5/g;

    move-result-object p1

    return-object p1
.end method

.method public getButtonSizeChange()Ly5/e0;
    .locals 1

    .line 1
    iget-object v0, p0, Lj5/h;->r:Ly5/e0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getChildDrawingOrder(II)I
    .locals 1

    .line 1
    iget-object p1, p0, Lj5/h;->n:[Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    array-length v0, p1

    .line 6
    if-lt p2, v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    aget-object p1, p1, p2

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_1
    :goto_0
    const-string p1, "MButtonGroup"

    .line 17
    .line 18
    const-string v0, "Child order wasn\'t updated"

    .line 19
    .line 20
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    return p2
.end method

.method public getInnerCornerSize()Ly5/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lj5/h;->o:Ly5/a0;

    .line 2
    .line 3
    iget-object v0, v0, Ly5/a0;->b:Ly5/d;

    .line 4
    .line 5
    return-object v0
.end method

.method public getInnerCornerSizeStateList()Ly5/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Lj5/h;->o:Ly5/a0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getOverflowButtonIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    throw v0
.end method

.method public getOverflowMode()I
    .locals 1

    .line 1
    iget v0, p0, Lj5/h;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public getShapeAppearance()Ly5/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lj5/h;->p:Ly5/c0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ly5/c0;->h()Ly5/o;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public getSpacing()I
    .locals 1

    .line 1
    iget v0, p0, Lj5/h;->q:I

    .line 2
    .line 3
    return v0
.end method

.method public getStateListShapeAppearance()Ly5/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Lj5/h;->p:Ly5/c0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h(I)Lcom/google/android/material/button/MaterialButton;
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v1, p1, -0x1

    .line 6
    .line 7
    :goto_0
    const/4 v2, -0x1

    .line 8
    if-ltz v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lj5/h;->i(I)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move v1, v2

    .line 21
    :goto_1
    iget-object v3, p0, Lj5/h;->t:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-nez v4, :cond_4

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    :goto_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-ge v4, v5, :cond_4

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    check-cast v5, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    add-int/lit8 v6, v6, -0x1

    .line 51
    .line 52
    if-ne v4, v6, :cond_2

    .line 53
    .line 54
    move v6, v0

    .line 55
    goto :goto_3

    .line 56
    :cond_2
    add-int/lit8 v6, v4, 0x1

    .line 57
    .line 58
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    check-cast v6, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    :goto_3
    if-lt p1, v5, :cond_3

    .line 69
    .line 70
    if-ge p1, v6, :cond_3

    .line 71
    .line 72
    if-lt v1, v5, :cond_5

    .line 73
    .line 74
    if-lt v1, v6, :cond_3

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    if-ne v1, v2, :cond_6

    .line 81
    .line 82
    :cond_5
    :goto_4
    const/4 p1, 0x0

    .line 83
    return-object p1

    .line 84
    :cond_6
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 89
    .line 90
    return-object p1
.end method

.method public final i(I)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    if-eq p1, v0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return p1
.end method

.method public final j()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lcom/google/android/material/button/MaterialButton;

    .line 13
    .line 14
    iget-object v2, v1, Lcom/google/android/material/button/MaterialButton;->M:Landroid/widget/LinearLayout$LayoutParams;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    iput-object v2, v1, Lcom/google/android/material/button/MaterialButton;->M:Landroid/widget/LinearLayout$LayoutParams;

    .line 23
    .line 24
    const/high16 v2, -0x31000000

    .line 25
    .line 26
    iput v2, v1, Lcom/google/android/material/button/MaterialButton;->J:F

    .line 27
    .line 28
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-void
.end method

.method public final k()V
    .locals 12

    .line 1
    iget-object v0, p0, Lj5/h;->o:Ly5/a0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lj5/h;->p:Ly5/c0;

    .line 6
    .line 7
    if-eqz v0, :cond_14

    .line 8
    .line 9
    :cond_0
    iget-boolean v0, p0, Lj5/h;->s:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    goto/16 :goto_c

    .line 14
    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lj5/h;->s:Z

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-direct {p0}, Lj5/h;->getFirstVisibleChildIndex()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-direct {p0}, Lj5/h;->getLastVisibleChildIndex()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    move v4, v0

    .line 31
    :goto_0
    if-ge v4, v1, :cond_14

    .line 32
    .line 33
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    check-cast v5, Lcom/google/android/material/button/MaterialButton;

    .line 38
    .line 39
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    const/16 v7, 0x8

    .line 44
    .line 45
    if-ne v6, v7, :cond_2

    .line 46
    .line 47
    goto/16 :goto_b

    .line 48
    .line 49
    :cond_2
    const/4 v6, 0x1

    .line 50
    if-ne v4, v2, :cond_3

    .line 51
    .line 52
    move v7, v6

    .line 53
    goto :goto_1

    .line 54
    :cond_3
    move v7, v0

    .line 55
    :goto_1
    if-ne v4, v3, :cond_4

    .line 56
    .line 57
    move v8, v6

    .line 58
    goto :goto_2

    .line 59
    :cond_4
    move v8, v0

    .line 60
    :goto_2
    iget-object v9, p0, Lj5/h;->p:Ly5/c0;

    .line 61
    .line 62
    iget-object v10, p0, Lj5/h;->k:Ljava/util/ArrayList;

    .line 63
    .line 64
    if-eqz v9, :cond_5

    .line 65
    .line 66
    if-nez v7, :cond_6

    .line 67
    .line 68
    if-eqz v8, :cond_5

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_5
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    check-cast v9, Ly5/m;

    .line 76
    .line 77
    :cond_6
    :goto_3
    instance-of v11, v9, Ly5/c0;

    .line 78
    .line 79
    if-nez v11, :cond_7

    .line 80
    .line 81
    new-instance v9, Ly5/b0;

    .line 82
    .line 83
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    check-cast v10, Ly5/o;

    .line 88
    .line 89
    invoke-direct {v9, v10}, Ly5/b0;-><init>(Ly5/o;)V

    .line 90
    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_7
    check-cast v9, Ly5/c0;

    .line 94
    .line 95
    invoke-virtual {v9}, Ly5/c0;->i()Ly5/b0;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    :goto_4
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getOrientation()I

    .line 100
    .line 101
    .line 102
    move-result v10

    .line 103
    if-nez v10, :cond_8

    .line 104
    .line 105
    move v10, v6

    .line 106
    goto :goto_5

    .line 107
    :cond_8
    move v10, v0

    .line 108
    :goto_5
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    if-ne v11, v6, :cond_9

    .line 113
    .line 114
    move v11, v6

    .line 115
    goto :goto_6

    .line 116
    :cond_9
    move v11, v0

    .line 117
    :goto_6
    if-eqz v10, :cond_c

    .line 118
    .line 119
    if-eqz v7, :cond_a

    .line 120
    .line 121
    const/4 v7, 0x5

    .line 122
    goto :goto_7

    .line 123
    :cond_a
    move v7, v0

    .line 124
    :goto_7
    if-eqz v8, :cond_b

    .line 125
    .line 126
    or-int/lit8 v7, v7, 0xa

    .line 127
    .line 128
    :cond_b
    if-eqz v11, :cond_e

    .line 129
    .line 130
    and-int/lit8 v8, v7, 0x5

    .line 131
    .line 132
    and-int/lit8 v7, v7, 0xa

    .line 133
    .line 134
    shl-int/2addr v8, v6

    .line 135
    shr-int/lit8 v6, v7, 0x1

    .line 136
    .line 137
    or-int v7, v8, v6

    .line 138
    .line 139
    goto :goto_9

    .line 140
    :cond_c
    if-eqz v7, :cond_d

    .line 141
    .line 142
    const/4 v6, 0x3

    .line 143
    move v7, v6

    .line 144
    goto :goto_8

    .line 145
    :cond_d
    move v7, v0

    .line 146
    :goto_8
    if-eqz v8, :cond_e

    .line 147
    .line 148
    or-int/lit8 v7, v7, 0xc

    .line 149
    .line 150
    :cond_e
    :goto_9
    not-int v6, v7

    .line 151
    iget-object v7, p0, Lj5/h;->o:Ly5/a0;

    .line 152
    .line 153
    or-int/lit8 v8, v6, 0x1

    .line 154
    .line 155
    if-ne v8, v6, :cond_f

    .line 156
    .line 157
    iput-object v7, v9, Ly5/b0;->e:Ly5/a0;

    .line 158
    .line 159
    :cond_f
    or-int/lit8 v8, v6, 0x2

    .line 160
    .line 161
    if-ne v8, v6, :cond_10

    .line 162
    .line 163
    iput-object v7, v9, Ly5/b0;->f:Ly5/a0;

    .line 164
    .line 165
    :cond_10
    or-int/lit8 v8, v6, 0x4

    .line 166
    .line 167
    if-ne v8, v6, :cond_11

    .line 168
    .line 169
    iput-object v7, v9, Ly5/b0;->g:Ly5/a0;

    .line 170
    .line 171
    :cond_11
    or-int/lit8 v8, v6, 0x8

    .line 172
    .line 173
    if-ne v8, v6, :cond_12

    .line 174
    .line 175
    iput-object v7, v9, Ly5/b0;->h:Ly5/a0;

    .line 176
    .line 177
    :cond_12
    invoke-virtual {v9}, Ly5/b0;->b()Ly5/c0;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-virtual {v6}, Ly5/c0;->e()Z

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    if-eqz v7, :cond_13

    .line 186
    .line 187
    goto :goto_a

    .line 188
    :cond_13
    invoke-virtual {v6}, Ly5/c0;->h()Ly5/o;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    :goto_a
    invoke-virtual {v5, v6}, Lcom/google/android/material/button/MaterialButton;->setShapeAppearance(Ly5/m;)V

    .line 193
    .line 194
    .line 195
    :goto_b
    add-int/lit8 v4, v4, 0x1

    .line 196
    .line 197
    goto/16 :goto_0

    .line 198
    .line 199
    :cond_14
    :goto_c
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lj5/h;->j()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lj5/h;->b()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lj5/h;->a()V

    .line 4
    .line 5
    .line 6
    iget v1, v0, Lj5/h;->j:I

    .line 7
    .line 8
    const/4 v3, 0x2

    .line 9
    if-ne v1, v3, :cond_e

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getOrientation()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v4, 0x1

    .line 16
    if-eq v1, v4, :cond_d

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/high16 v5, -0x80000000

    .line 23
    .line 24
    if-eq v1, v5, :cond_c

    .line 25
    .line 26
    iget-object v1, v0, Lj5/h;->t:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 29
    .line 30
    .line 31
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    new-instance v6, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    new-instance v7, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    const/4 v9, 0x0

    .line 47
    const/4 v10, 0x0

    .line 48
    const/4 v11, 0x0

    .line 49
    :goto_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 50
    .line 51
    .line 52
    move-result v12

    .line 53
    if-ge v8, v12, :cond_8

    .line 54
    .line 55
    invoke-virtual {v0, v8}, Lj5/h;->i(I)Z

    .line 56
    .line 57
    .line 58
    move-result v12

    .line 59
    if-nez v12, :cond_0

    .line 60
    .line 61
    move/from16 v13, p1

    .line 62
    .line 63
    move/from16 v14, p2

    .line 64
    .line 65
    goto/16 :goto_4

    .line 66
    .line 67
    :cond_0
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v12

    .line 71
    check-cast v12, Lcom/google/android/material/button/MaterialButton;

    .line 72
    .line 73
    move/from16 v13, p1

    .line 74
    .line 75
    move/from16 v14, p2

    .line 76
    .line 77
    invoke-virtual {v0, v12, v13, v14}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 81
    .line 82
    .line 83
    move-result v15

    .line 84
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-gtz v15, :cond_1

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_1
    invoke-static {v12}, Lj5/h;->d(Landroid/view/View;)Landroid/widget/LinearLayout$LayoutParams;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    add-int v17, v9, v15

    .line 96
    .line 97
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v18

    .line 101
    if-eqz v18, :cond_2

    .line 102
    .line 103
    const/4 v4, 0x0

    .line 104
    goto :goto_1

    .line 105
    :cond_2
    iget v4, v0, Lj5/h;->q:I

    .line 106
    .line 107
    :goto_1
    add-int v4, v17, v4

    .line 108
    .line 109
    if-gt v4, v5, :cond_3

    .line 110
    .line 111
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-eqz v4, :cond_6

    .line 116
    .line 117
    :cond_3
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-nez v4, :cond_4

    .line 122
    .line 123
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-eqz v4, :cond_5

    .line 135
    .line 136
    const/4 v4, 0x0

    .line 137
    goto :goto_2

    .line 138
    :cond_5
    iget v4, v0, Lj5/h;->q:I

    .line 139
    .line 140
    :goto_2
    add-int/2addr v10, v4

    .line 141
    add-int/2addr v11, v10

    .line 142
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    neg-int v4, v9

    .line 150
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 154
    .line 155
    .line 156
    const/4 v9, 0x0

    .line 157
    const/4 v10, 0x0

    .line 158
    :cond_6
    if-nez v9, :cond_7

    .line 159
    .line 160
    const/4 v4, 0x0

    .line 161
    goto :goto_3

    .line 162
    :cond_7
    iget v4, v0, Lj5/h;->q:I

    .line 163
    .line 164
    :goto_3
    add-int/2addr v15, v4

    .line 165
    add-int/2addr v9, v15

    .line 166
    invoke-static {v10, v2}, Ljava/lang/Math;->max(II)I

    .line 167
    .line 168
    .line 169
    move-result v10

    .line 170
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    iget v2, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 178
    .line 179
    add-int/2addr v2, v11

    .line 180
    iput v2, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 181
    .line 182
    invoke-virtual {v12, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 183
    .line 184
    .line 185
    :goto_4
    add-int/lit8 v8, v8, 0x1

    .line 186
    .line 187
    const/4 v3, 0x2

    .line 188
    const/4 v4, 0x1

    .line 189
    goto/16 :goto_0

    .line 190
    .line 191
    :cond_8
    move/from16 v13, p1

    .line 192
    .line 193
    move/from16 v14, p2

    .line 194
    .line 195
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    invoke-static {v7}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    check-cast v2, Ljava/lang/Integer;

    .line 207
    .line 208
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    const/4 v3, 0x0

    .line 213
    const/16 v16, 0x0

    .line 214
    .line 215
    :goto_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    if-ge v3, v4, :cond_b

    .line 220
    .line 221
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    check-cast v4, Ljava/lang/Integer;

    .line 226
    .line 227
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    check-cast v5, Ljava/lang/Integer;

    .line 236
    .line 237
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    check-cast v4, Lcom/google/android/material/button/MaterialButton;

    .line 246
    .line 247
    invoke-static {v4}, Lj5/h;->d(Landroid/view/View;)Landroid/widget/LinearLayout$LayoutParams;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    iget v8, v6, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 252
    .line 253
    const v9, 0x800007

    .line 254
    .line 255
    .line 256
    and-int/2addr v8, v9

    .line 257
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 258
    .line 259
    .line 260
    move-result v9

    .line 261
    invoke-static {v8, v9}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 262
    .line 263
    .line 264
    move-result v9

    .line 265
    sub-int v5, v2, v5

    .line 266
    .line 267
    const v12, 0x800003

    .line 268
    .line 269
    .line 270
    if-ne v8, v12, :cond_9

    .line 271
    .line 272
    const/4 v8, 0x1

    .line 273
    goto :goto_6

    .line 274
    :cond_9
    const/4 v8, 0x1

    .line 275
    if-ne v9, v8, :cond_a

    .line 276
    .line 277
    div-int/lit8 v5, v5, 0x2

    .line 278
    .line 279
    :cond_a
    invoke-virtual {v6}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    .line 280
    .line 281
    .line 282
    move-result v9

    .line 283
    add-int/2addr v9, v5

    .line 284
    sub-int v9, v9, v16

    .line 285
    .line 286
    invoke-virtual {v6, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v4, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 290
    .line 291
    .line 292
    move/from16 v16, v5

    .line 293
    .line 294
    :goto_6
    add-int/lit8 v3, v3, 0x1

    .line 295
    .line 296
    goto :goto_5

    .line 297
    :cond_b
    add-int/2addr v11, v10

    .line 298
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    add-int/2addr v1, v11

    .line 303
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    add-int/2addr v2, v1

    .line 308
    goto :goto_7

    .line 309
    :cond_c
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 310
    .line 311
    const-string v2, "The wrap overflow mode is not compatible with wrap_content layout width."

    .line 312
    .line 313
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    throw v1

    .line 317
    :cond_d
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 318
    .line 319
    const-string v2, "The wrap overflow mode is not compatible to the vertical orientation."

    .line 320
    .line 321
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    throw v1

    .line 325
    :cond_e
    move/from16 v13, p1

    .line 326
    .line 327
    move/from16 v14, p2

    .line 328
    .line 329
    const/4 v2, 0x0

    .line 330
    :goto_7
    invoke-virtual {v0}, Lj5/h;->k()V

    .line 331
    .line 332
    .line 333
    invoke-super/range {p0 .. p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 334
    .line 335
    .line 336
    iget v1, v0, Lj5/h;->j:I

    .line 337
    .line 338
    const/4 v3, 0x2

    .line 339
    if-ne v1, v3, :cond_f

    .line 340
    .line 341
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    if-eq v2, v1, :cond_f

    .line 346
    .line 347
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 352
    .line 353
    .line 354
    :cond_f
    return-void
.end method

.method public final onViewRemoved(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewRemoved(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lcom/google/android/material/button/MaterialButton;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Lcom/google/android/material/button/MaterialButton;->setOnPressedChangeListenerInternal(Lj5/c;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-ltz p1, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lj5/h;->k:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    :cond_1
    const/4 p1, 0x1

    .line 27
    iput-boolean p1, p0, Lj5/h;->s:Z

    .line 28
    .line 29
    invoke-virtual {p0}, Lj5/h;->k()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lj5/h;->j()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lj5/h;->a()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public setButtonSizeChange(Ly5/e0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lj5/h;->r:Ly5/e0;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lj5/h;->r:Ly5/e0;

    .line 6
    .line 7
    invoke-virtual {p0}, Lj5/h;->b()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setEnabled(Z)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lcom/google/android/material/button/MaterialButton;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public setInnerCornerSize(Ly5/d;)V
    .locals 0

    .line 1
    invoke-static {p1}, Ly5/a0;->b(Ly5/d;)Ly5/a0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lj5/h;->o:Ly5/a0;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lj5/h;->s:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lj5/h;->k()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setInnerCornerSizeStateList(Ly5/a0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj5/h;->o:Ly5/a0;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lj5/h;->s:Z

    .line 5
    .line 6
    invoke-virtual {p0}, Lj5/h;->k()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setOrientation(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getOrientation()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lj5/h;->s:Z

    .line 9
    .line 10
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setOverflowButtonIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    throw p1
.end method

.method public setOverflowButtonIconResource(I)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    throw p1
.end method

.method public setOverflowMode(I)V
    .locals 1

    .line 1
    iget v0, p0, Lj5/h;->j:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lj5/h;->j:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public setShapeAppearance(Ly5/o;)V
    .locals 1

    .line 1
    new-instance v0, Ly5/b0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ly5/b0;-><init>(Ly5/o;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ly5/b0;->b()Ly5/c0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lj5/h;->p:Ly5/c0;

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    iput-boolean p1, p0, Lj5/h;->s:Z

    .line 14
    .line 15
    invoke-virtual {p0}, Lj5/h;->k()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public setSpacing(I)V
    .locals 0

    .line 1
    iput p1, p0, Lj5/h;->q:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setStateListShapeAppearance(Ly5/c0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj5/h;->p:Ly5/c0;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lj5/h;->s:Z

    .line 5
    .line 6
    invoke-virtual {p0}, Lj5/h;->k()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 10
    .line 11
    .line 12
    return-void
.end method
