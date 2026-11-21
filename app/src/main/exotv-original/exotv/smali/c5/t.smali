.class public final Lc5/t;
.super Lz2/x;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final synthetic d:I

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lw2/o;[Ljava/lang/String;[Landroid/graphics/drawable/Drawable;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lc5/t;->d:I

    .line 5
    iput-object p1, p0, Lc5/t;->h:Ljava/lang/Object;

    invoke-direct {p0}, Lz2/x;-><init>()V

    .line 6
    iput-object p2, p0, Lc5/t;->e:Ljava/lang/Object;

    .line 7
    array-length p1, p2

    new-array p1, p1, [Ljava/lang/String;

    iput-object p1, p0, Lc5/t;->f:Ljava/lang/Object;

    .line 8
    iput-object p3, p0, Lc5/t;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lw4/e;Lw4/g;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lc5/t;->d:I

    .line 1
    invoke-direct {p0}, Lz2/x;-><init>()V

    .line 2
    iput-object p1, p0, Lc5/t;->e:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lc5/t;->f:Ljava/lang/Object;

    .line 4
    sget-object p1, Lm6/p;->j:Lm6/p;

    iput-object p1, p0, Lc5/t;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lc5/t;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc5/t;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, [Ljava/lang/String;

    .line 9
    .line 10
    array-length v0, v0

    .line 11
    return v0

    .line 12
    :pswitch_0
    iget-object v0, p0, Lc5/t;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    return v0

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(I)J
    .locals 2

    .line 1
    iget v0, p0, Lc5/t;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lz2/x;->b(I)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0

    .line 11
    :pswitch_0
    int-to-long v0, p1

    .line 12
    return-wide v0

    .line 13
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Lz2/v0;I)V
    .locals 10

    .line 1
    iget v0, p0, Lc5/t;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lw2/j;

    .line 7
    .line 8
    iget-object v0, p1, Lz2/v0;->a:Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {p0, p2}, Lc5/t;->h(I)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    new-instance v1, Lz2/g0;

    .line 17
    .line 18
    const/4 v2, -0x1

    .line 19
    const/4 v3, -0x2

    .line 20
    invoke-direct {v1, v2, v3}, Lz2/g0;-><init>(II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v1, Lz2/g0;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-direct {v1, v2, v2}, Lz2/g0;-><init>(II)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v0, p1, Lw2/j;->u:Landroid/widget/TextView;

    .line 37
    .line 38
    iget-object v1, p1, Lw2/j;->w:Landroid/widget/ImageView;

    .line 39
    .line 40
    iget-object p1, p1, Lw2/j;->v:Landroid/widget/TextView;

    .line 41
    .line 42
    iget-object v2, p0, Lc5/t;->e:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, [Ljava/lang/String;

    .line 45
    .line 46
    aget-object v2, v2, p2

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lc5/t;->f:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, [Ljava/lang/String;

    .line 54
    .line 55
    aget-object v0, v0, p2

    .line 56
    .line 57
    const/16 v2, 0x8

    .line 58
    .line 59
    if-nez v0, :cond_1

    .line 60
    .line 61
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    :goto_1
    iget-object p1, p0, Lc5/t;->g:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, [Landroid/graphics/drawable/Drawable;

    .line 71
    .line 72
    aget-object p1, p1, p2

    .line 73
    .line 74
    if-nez p1, :cond_2

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 81
    .line 82
    .line 83
    :goto_2
    return-void

    .line 84
    :pswitch_0
    check-cast p1, Lc5/s;

    .line 85
    .line 86
    iget-object v0, p0, Lc5/t;->g:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Ljava/util/List;

    .line 89
    .line 90
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Lcom/exotv/net/model/Channel;

    .line 95
    .line 96
    invoke-virtual {v0}, Lcom/exotv/net/model/Channel;->getDisplayName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iget-object v2, p1, Lc5/s;->u:La5/c;

    .line 101
    .line 102
    iget-object v2, v2, La5/c;->a:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 105
    .line 106
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    iget-object v3, p1, Lc5/s;->u:La5/c;

    .line 111
    .line 112
    iget-object v3, v3, La5/c;->d:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v3, Landroid/widget/TextView;

    .line 115
    .line 116
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 117
    .line 118
    .line 119
    iget-object v3, p1, Lc5/s;->u:La5/c;

    .line 120
    .line 121
    iget-object v3, v3, La5/c;->a:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 124
    .line 125
    new-instance v4, Lc5/p;

    .line 126
    .line 127
    const/4 v5, 0x0

    .line 128
    invoke-direct {v4, p0, v5, v0}, Lc5/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 132
    .line 133
    .line 134
    iget-object v3, p1, Lc5/s;->u:La5/c;

    .line 135
    .line 136
    iget-object v3, v3, La5/c;->a:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 139
    .line 140
    new-instance v4, Lc5/q;

    .line 141
    .line 142
    invoke-direct {v4, p2, p0}, Lc5/q;-><init>(ILc5/t;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Lcom/exotv/net/model/Channel;->getIcon()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    const/16 v3, 0x8

    .line 153
    .line 154
    const/4 v4, 0x0

    .line 155
    if-eqz p2, :cond_6

    .line 156
    .line 157
    invoke-static {p2}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 158
    .line 159
    .line 160
    move-result v6

    .line 161
    if-eqz v6, :cond_3

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_3
    iget-object v6, p1, Lc5/s;->u:La5/c;

    .line 165
    .line 166
    iget-object v6, v6, La5/c;->c:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v6, Landroid/widget/TextView;

    .line 169
    .line 170
    invoke-virtual {v6, v3}, Landroid/view/View;->setVisibility(I)V

    .line 171
    .line 172
    .line 173
    iget-object v6, p1, Lc5/s;->u:La5/c;

    .line 174
    .line 175
    iget-object v6, v6, La5/c;->f:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v6, Landroid/widget/ImageView;

    .line 178
    .line 179
    invoke-virtual {v6, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 180
    .line 181
    .line 182
    iget-object v6, p1, Lc5/s;->u:La5/c;

    .line 183
    .line 184
    iget-object v6, v6, La5/c;->f:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v6, Landroid/widget/ImageView;

    .line 187
    .line 188
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    sget-object v8, Lh3/a;->b:Lh3/h;

    .line 193
    .line 194
    if-nez v8, :cond_5

    .line 195
    .line 196
    sget-object v9, Lh3/a;->a:Lh3/a;

    .line 197
    .line 198
    monitor-enter v9

    .line 199
    :try_start_0
    sget-object v8, Lh3/a;->b:Lh3/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 200
    .line 201
    if-eqz v8, :cond_4

    .line 202
    .line 203
    monitor-exit v9

    .line 204
    goto :goto_3

    .line 205
    :cond_4
    :try_start_1
    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 206
    .line 207
    .line 208
    invoke-static {v7}, Lcom/bumptech/glide/c;->x(Landroid/content/Context;)Lh3/h;

    .line 209
    .line 210
    .line 211
    move-result-object v8

    .line 212
    sput-object v8, Lh3/a;->b:Lh3/h;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 213
    .line 214
    monitor-exit v9

    .line 215
    goto :goto_3

    .line 216
    :catchall_0
    move-exception p1

    .line 217
    :try_start_2
    monitor-exit v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 218
    throw p1

    .line 219
    :cond_5
    :goto_3
    new-instance v7, Lr3/i;

    .line 220
    .line 221
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 222
    .line 223
    .line 224
    move-result-object v9

    .line 225
    invoke-direct {v7, v9}, Lr3/i;-><init>(Landroid/content/Context;)V

    .line 226
    .line 227
    .line 228
    iput-object p2, v7, Lr3/i;->c:Ljava/lang/Object;

    .line 229
    .line 230
    new-instance p2, Lt3/a;

    .line 231
    .line 232
    invoke-direct {p2, v6}, Lt3/a;-><init>(Landroid/widget/ImageView;)V

    .line 233
    .line 234
    .line 235
    iput-object p2, v7, Lr3/i;->d:Lt3/a;

    .line 236
    .line 237
    iput-object v4, v7, Lr3/i;->m:Landroidx/lifecycle/o;

    .line 238
    .line 239
    iput-object v4, v7, Lr3/i;->n:Ls3/i;

    .line 240
    .line 241
    iput-object v4, v7, Lr3/i;->o:Ls3/g;

    .line 242
    .line 243
    new-instance p2, Lu3/a;

    .line 244
    .line 245
    const/16 v4, 0x64

    .line 246
    .line 247
    invoke-direct {p2, v4}, Lu3/a;-><init>(I)V

    .line 248
    .line 249
    .line 250
    iput-object p2, v7, Lr3/i;->g:Lu3/d;

    .line 251
    .line 252
    new-instance p2, La4/c;

    .line 253
    .line 254
    const/4 v4, 0x5

    .line 255
    invoke-direct {p2, p1, v1, p1, v4}, La4/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 256
    .line 257
    .line 258
    iput-object p2, v7, Lr3/i;->e:Lr3/j;

    .line 259
    .line 260
    invoke-virtual {v7}, Lr3/i;->a()Lr3/k;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    invoke-virtual {v8, p2}, Lh3/h;->b(Lr3/k;)Lr3/e;

    .line 265
    .line 266
    .line 267
    goto :goto_5

    .line 268
    :cond_6
    :goto_4
    iget-object p2, p1, Lc5/s;->u:La5/c;

    .line 269
    .line 270
    iget-object p2, p2, La5/c;->f:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast p2, Landroid/widget/ImageView;

    .line 273
    .line 274
    invoke-static {p2}, Lv3/f;->c(Landroid/view/View;)Lr3/u;

    .line 275
    .line 276
    .line 277
    move-result-object p2

    .line 278
    invoke-virtual {p2}, Lr3/u;->a()V

    .line 279
    .line 280
    .line 281
    iget-object p2, p1, Lc5/s;->u:La5/c;

    .line 282
    .line 283
    iget-object p2, p2, La5/c;->f:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast p2, Landroid/widget/ImageView;

    .line 286
    .line 287
    invoke-virtual {p2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 288
    .line 289
    .line 290
    iget-object p2, p1, Lc5/s;->u:La5/c;

    .line 291
    .line 292
    iget-object p2, p2, La5/c;->f:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast p2, Landroid/widget/ImageView;

    .line 295
    .line 296
    invoke-virtual {p2, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 297
    .line 298
    .line 299
    iget-object p2, p1, Lc5/s;->u:La5/c;

    .line 300
    .line 301
    iget-object p2, p2, La5/c;->c:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast p2, Landroid/widget/TextView;

    .line 304
    .line 305
    invoke-virtual {p2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 306
    .line 307
    .line 308
    iget-object p2, p1, Lc5/s;->u:La5/c;

    .line 309
    .line 310
    iget-object p2, p2, La5/c;->c:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast p2, Landroid/widget/TextView;

    .line 313
    .line 314
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 315
    .line 316
    .line 317
    :goto_5
    invoke-virtual {v0}, Lcom/exotv/net/model/Channel;->getSelectionKey()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object p2

    .line 321
    iget-object v0, p0, Lc5/t;->h:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v0, Ljava/lang/String;

    .line 324
    .line 325
    invoke-static {p2, v0}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result p2

    .line 329
    iget-object v0, p1, Lc5/s;->u:La5/c;

    .line 330
    .line 331
    iget-object v0, v0, La5/c;->e:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v0, Landroid/widget/TextView;

    .line 334
    .line 335
    if-eqz p2, :cond_7

    .line 336
    .line 337
    move v3, v5

    .line 338
    :cond_7
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 339
    .line 340
    .line 341
    iget-object v0, p1, Lc5/s;->u:La5/c;

    .line 342
    .line 343
    iget-object v0, v0, La5/c;->d:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v0, Landroid/widget/TextView;

    .line 346
    .line 347
    if-eqz p2, :cond_8

    .line 348
    .line 349
    const v1, 0x7f0603d7

    .line 350
    .line 351
    .line 352
    goto :goto_6

    .line 353
    :cond_8
    const v1, 0x7f060070

    .line 354
    .line 355
    .line 356
    :goto_6
    invoke-virtual {v2, v1}, Landroid/content/Context;->getColor(I)I

    .line 357
    .line 358
    .line 359
    move-result v1

    .line 360
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 361
    .line 362
    .line 363
    iget-object v0, p1, Lc5/s;->u:La5/c;

    .line 364
    .line 365
    iget-object v0, v0, La5/c;->c:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v0, Landroid/widget/TextView;

    .line 368
    .line 369
    const/4 v1, -0x1

    .line 370
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 371
    .line 372
    .line 373
    iget-object v0, p1, Lc5/s;->u:La5/c;

    .line 374
    .line 375
    iget-object v0, v0, La5/c;->b:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v0, Landroid/widget/FrameLayout;

    .line 378
    .line 379
    if-eqz p2, :cond_9

    .line 380
    .line 381
    const v1, 0x7f080080

    .line 382
    .line 383
    .line 384
    goto :goto_7

    .line 385
    :cond_9
    const v1, 0x7f08007f

    .line 386
    .line 387
    .line 388
    :goto_7
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 389
    .line 390
    .line 391
    iget-object v0, p1, Lc5/s;->u:La5/c;

    .line 392
    .line 393
    iget-object v0, v0, La5/c;->a:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 396
    .line 397
    new-instance v1, Lc5/r;

    .line 398
    .line 399
    invoke-direct {v1, p1, v2, p2}, Lc5/r;-><init>(Lc5/s;Landroid/content/Context;Z)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 403
    .line 404
    .line 405
    return-void

    .line 406
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Landroid/view/ViewGroup;)Lz2/v0;
    .locals 10

    .line 1
    iget v0, p0, Lc5/t;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc5/t;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lw2/o;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const v2, 0x7f0d0036

    .line 19
    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v1, Lw2/j;

    .line 27
    .line 28
    invoke-direct {v1, v0, p1}, Lw2/j;-><init>(Lw2/o;Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :pswitch_0
    new-instance v0, Lc5/s;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const v2, 0x7f0d003c

    .line 43
    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const v1, 0x7f0a008a

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v1}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    move-object v5, v2

    .line 58
    check-cast v5, Landroid/widget/FrameLayout;

    .line 59
    .line 60
    if-eqz v5, :cond_0

    .line 61
    .line 62
    const v1, 0x7f0a008b

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v1}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    move-object v6, v2

    .line 70
    check-cast v6, Landroid/widget/TextView;

    .line 71
    .line 72
    if-eqz v6, :cond_0

    .line 73
    .line 74
    const v1, 0x7f0a008d

    .line 75
    .line 76
    .line 77
    invoke-static {p1, v1}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    move-object v7, v2

    .line 82
    check-cast v7, Landroid/widget/ImageView;

    .line 83
    .line 84
    if-eqz v7, :cond_0

    .line 85
    .line 86
    const v1, 0x7f0a008e

    .line 87
    .line 88
    .line 89
    invoke-static {p1, v1}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    move-object v8, v2

    .line 94
    check-cast v8, Landroid/widget/TextView;

    .line 95
    .line 96
    if-eqz v8, :cond_0

    .line 97
    .line 98
    const v1, 0x7f0a008f

    .line 99
    .line 100
    .line 101
    invoke-static {p1, v1}, Lcom/bumptech/glide/c;->G(Landroid/view/View;I)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    move-object v9, v2

    .line 106
    check-cast v9, Landroid/widget/TextView;

    .line 107
    .line 108
    if-eqz v9, :cond_0

    .line 109
    .line 110
    move-object v4, p1

    .line 111
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 112
    .line 113
    new-instance v3, La5/c;

    .line 114
    .line 115
    invoke-direct/range {v3 .. v9}, La5/c;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 116
    .line 117
    .line 118
    invoke-direct {v0, v3}, Lc5/s;-><init>(La5/c;)V

    .line 119
    .line 120
    .line 121
    return-object v0

    .line 122
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    new-instance v0, Ljava/lang/NullPointerException;

    .line 131
    .line 132
    const-string v1, "Missing required view with ID: "

    .line 133
    .line 134
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-direct {v0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw v0

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public g(Lcom/exotv/net/model/Channel;)V
    .locals 6

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/exotv/net/model/Channel;->getSelectionKey()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    iget-object v0, p0, Lc5/t;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {p1, v0}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    goto :goto_5

    .line 20
    :cond_1
    iget-object v0, p0, Lc5/t;->g:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x0

    .line 29
    move v2, v1

    .line 30
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v4, -0x1

    .line 35
    if-eqz v3, :cond_3

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Lcom/exotv/net/model/Channel;

    .line 42
    .line 43
    invoke-virtual {v3}, Lcom/exotv/net/model/Channel;->getSelectionKey()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    iget-object v5, p0, Lc5/t;->h:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v5, Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v3, v5}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    move v2, v4

    .line 62
    :goto_2
    iput-object p1, p0, Lc5/t;->h:Ljava/lang/Object;

    .line 63
    .line 64
    iget-object v0, p0, Lc5/t;->g:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_5

    .line 77
    .line 78
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    check-cast v3, Lcom/exotv/net/model/Channel;

    .line 83
    .line 84
    invoke-virtual {v3}, Lcom/exotv/net/model/Channel;->getSelectionKey()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-static {v3, p1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-eqz v3, :cond_4

    .line 93
    .line 94
    move v4, v1

    .line 95
    goto :goto_4

    .line 96
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_5
    :goto_4
    if-ltz v2, :cond_6

    .line 100
    .line 101
    invoke-virtual {p0, v2}, Lz2/x;->c(I)V

    .line 102
    .line 103
    .line 104
    :cond_6
    if-ltz v4, :cond_7

    .line 105
    .line 106
    invoke-virtual {p0, v4}, Lz2/x;->c(I)V

    .line 107
    .line 108
    .line 109
    :cond_7
    :goto_5
    return-void
.end method

.method public h(I)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lc5/t;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lw2/o;

    .line 4
    .line 5
    iget-object v1, v0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    if-eqz p1, :cond_3

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    if-eq p1, v3, :cond_1

    .line 15
    .line 16
    return v3

    .line 17
    :cond_1
    const/16 p1, 0x1e

    .line 18
    .line 19
    invoke-interface {v1, p1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    iget-object p1, v0, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 26
    .line 27
    const/16 v0, 0x1d

    .line 28
    .line 29
    invoke-interface {p1, v0}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    return v3

    .line 36
    :cond_2
    return v2

    .line 37
    :cond_3
    const/16 p1, 0xd

    .line 38
    .line 39
    invoke-interface {v1, p1}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    return p1
.end method
