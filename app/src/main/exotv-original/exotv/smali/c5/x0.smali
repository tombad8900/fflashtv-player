.class public final Lc5/x0;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public final synthetic n:I

.field public o:I

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Lc5/w0;

.field public r:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc5/a1;Ljava/lang/String;Lc5/w0;Lp6/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lc5/x0;->n:I

    .line 2
    iput-object p1, p0, Lc5/x0;->r:Ljava/lang/Object;

    iput-object p2, p0, Lc5/x0;->p:Ljava/lang/String;

    iput-object p3, p0, Lc5/x0;->q:Lc5/w0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lr6/h;-><init>(ILp6/c;)V

    return-void
.end method

.method public constructor <init>(Lc5/w0;Ljava/lang/String;Lp6/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lc5/x0;->n:I

    .line 1
    iput-object p1, p0, Lc5/x0;->q:Lc5/w0;

    iput-object p2, p0, Lc5/x0;->p:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lr6/h;-><init>(ILp6/c;)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lc5/x0;->n:I

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
    invoke-virtual {p0, p1, p2}, Lc5/x0;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lc5/x0;

    .line 15
    .line 16
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lc5/x0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lc5/x0;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lc5/x0;

    .line 28
    .line 29
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lc5/x0;->h(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 3

    .line 1
    iget p1, p0, Lc5/x0;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lc5/x0;

    .line 7
    .line 8
    iget-object v0, p0, Lc5/x0;->r:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lc5/a1;

    .line 11
    .line 12
    iget-object v1, p0, Lc5/x0;->p:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v2, p0, Lc5/x0;->q:Lc5/w0;

    .line 15
    .line 16
    invoke-direct {p1, v0, v1, v2, p2}, Lc5/x0;-><init>(Lc5/a1;Ljava/lang/String;Lc5/w0;Lp6/c;)V

    .line 17
    .line 18
    .line 19
    return-object p1

    .line 20
    :pswitch_0
    new-instance p1, Lc5/x0;

    .line 21
    .line 22
    iget-object v0, p0, Lc5/x0;->q:Lc5/w0;

    .line 23
    .line 24
    iget-object v1, p0, Lc5/x0;->p:Ljava/lang/String;

    .line 25
    .line 26
    invoke-direct {p1, v0, v1, p2}, Lc5/x0;-><init>(Lc5/w0;Ljava/lang/String;Lp6/c;)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lc5/x0;->n:I

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const-string v3, "results"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v1, Lc5/x0;->p:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v5, v1, Lc5/x0;->q:Lc5/w0;

    .line 16
    .line 17
    sget-object v6, Ll6/j;->a:Ll6/j;

    .line 18
    .line 19
    iget-object v7, v1, Lc5/x0;->r:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v9, v7

    .line 22
    check-cast v9, Lc5/a1;

    .line 23
    .line 24
    iget v7, v9, Lc5/a1;->m:I

    .line 25
    .line 26
    iget v8, v9, Lc5/a1;->l:I

    .line 27
    .line 28
    iget-object v11, v9, Lc5/a1;->a:Lcom/exotv/net/MainActivity;

    .line 29
    .line 30
    sget-object v10, Lq6/a;->j:Lq6/a;

    .line 31
    .line 32
    iget v12, v1, Lc5/x0;->o:I

    .line 33
    .line 34
    const/4 v13, 0x2

    .line 35
    const/16 v15, 0x11

    .line 36
    .line 37
    const/4 v14, 0x0

    .line 38
    if-eqz v12, :cond_2

    .line 39
    .line 40
    if-eq v12, v4, :cond_1

    .line 41
    .line 42
    if-ne v12, v13, :cond_0

    .line 43
    .line 44
    :try_start_0
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    move-object/from16 v2, p1

    .line 48
    .line 49
    goto/16 :goto_3

    .line 50
    .line 51
    :catch_0
    move-exception v0

    .line 52
    move-object/from16 v22, v6

    .line 53
    .line 54
    move v6, v8

    .line 55
    move-object v10, v11

    .line 56
    const/4 v2, 0x0

    .line 57
    goto/16 :goto_14

    .line 58
    .line 59
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :cond_1
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iput v4, v1, Lc5/x0;->o:I

    .line 73
    .line 74
    new-instance v2, Li7/g;

    .line 75
    .line 76
    invoke-static {v1}, Lcom/bumptech/glide/d;->P(Lp6/c;)Lp6/c;

    .line 77
    .line 78
    .line 79
    move-result-object v12

    .line 80
    invoke-direct {v2, v4, v12}, Li7/g;-><init>(ILp6/c;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Li7/g;->v()V

    .line 84
    .line 85
    .line 86
    iget-object v12, v2, Li7/g;->n:Lp6/h;

    .line 87
    .line 88
    invoke-static {v12}, Li7/x;->e(Lp6/h;)Li7/b0;

    .line 89
    .line 90
    .line 91
    move-result-object v12

    .line 92
    invoke-interface {v12, v2}, Li7/b0;->x(Li7/g;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Li7/g;->u()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    if-ne v2, v10, :cond_3

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_3
    move-object v2, v6

    .line 103
    :goto_0
    if-ne v2, v10, :cond_4

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    :goto_1
    iput-object v14, v9, Lc5/a1;->j:Landroid/widget/LinearLayout;

    .line 107
    .line 108
    iget-object v2, v9, Lc5/a1;->i:Landroid/widget/LinearLayout;

    .line 109
    .line 110
    if-eqz v2, :cond_1e

    .line 111
    .line 112
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 113
    .line 114
    .line 115
    iget-object v2, v9, Lc5/a1;->i:Landroid/widget/LinearLayout;

    .line 116
    .line 117
    if-eqz v2, :cond_1d

    .line 118
    .line 119
    new-instance v12, Landroid/widget/ProgressBar;

    .line 120
    .line 121
    invoke-direct {v12, v11}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    .line 122
    .line 123
    .line 124
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 125
    .line 126
    invoke-direct {v4, v8, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 127
    .line 128
    .line 129
    iput v15, v4, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 130
    .line 131
    invoke-virtual {v2, v12, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 132
    .line 133
    .line 134
    :try_start_1
    sget-object v2, Li7/e0;->a:Lo7/e;

    .line 135
    .line 136
    sget-object v2, Lo7/d;->l:Lo7/d;

    .line 137
    .line 138
    new-instance v4, Lc5/x0;

    .line 139
    .line 140
    invoke-direct {v4, v5, v0, v14}, Lc5/x0;-><init>(Lc5/w0;Ljava/lang/String;Lp6/c;)V

    .line 141
    .line 142
    .line 143
    iput v13, v1, Lc5/x0;->o:I

    .line 144
    .line 145
    invoke-static {v2, v4, v1}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    if-ne v2, v10, :cond_5

    .line 150
    .line 151
    :goto_2
    move-object v6, v10

    .line 152
    goto/16 :goto_15

    .line 153
    .line 154
    :cond_5
    :goto_3
    check-cast v2, Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 155
    .line 156
    iget-object v4, v9, Lc5/a1;->g:Landroid/widget/EditText;

    .line 157
    .line 158
    if-eqz v4, :cond_1a

    .line 159
    .line 160
    invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    invoke-static {v4}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    invoke-static {v4, v0}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_6

    .line 181
    .line 182
    iget-object v0, v9, Lc5/a1;->f:Lc5/w0;

    .line 183
    .line 184
    if-eq v0, v5, :cond_7

    .line 185
    .line 186
    :cond_6
    move-object/from16 v22, v6

    .line 187
    .line 188
    goto/16 :goto_13

    .line 189
    .line 190
    :cond_7
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_8

    .line 195
    .line 196
    invoke-virtual {v9}, Lc5/a1;->d()V

    .line 197
    .line 198
    .line 199
    goto/16 :goto_15

    .line 200
    .line 201
    :cond_8
    iput-object v14, v9, Lc5/a1;->j:Landroid/widget/LinearLayout;

    .line 202
    .line 203
    iget-object v0, v9, Lc5/a1;->i:Landroid/widget/LinearLayout;

    .line 204
    .line 205
    if-eqz v0, :cond_19

    .line 206
    .line 207
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-virtual {v9}, Lc5/a1;->b()Z

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    if-eqz v4, :cond_9

    .line 223
    .line 224
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 225
    .line 226
    int-to-float v0, v0

    .line 227
    const v4, 0x3ecccccd    # 0.4f

    .line 228
    .line 229
    .line 230
    mul-float/2addr v0, v4

    .line 231
    float-to-int v0, v0

    .line 232
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    int-to-float v0, v0

    .line 237
    const/high16 v5, 0x41100000    # 9.0f

    .line 238
    .line 239
    mul-float/2addr v0, v5

    .line 240
    const/high16 v5, 0x41800000    # 16.0f

    .line 241
    .line 242
    div-float/2addr v0, v5

    .line 243
    float-to-int v0, v0

    .line 244
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    new-instance v5, Ll6/d;

    .line 249
    .line 250
    invoke-direct {v5, v4, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_9
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 255
    .line 256
    int-to-float v0, v0

    .line 257
    const v4, 0x3ee147ae    # 0.44f

    .line 258
    .line 259
    .line 260
    mul-float/2addr v0, v4

    .line 261
    float-to-int v0, v0

    .line 262
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    int-to-float v0, v0

    .line 267
    const/high16 v5, 0x40400000    # 3.0f

    .line 268
    .line 269
    mul-float/2addr v0, v5

    .line 270
    const/high16 v5, 0x40000000    # 2.0f

    .line 271
    .line 272
    div-float/2addr v0, v5

    .line 273
    float-to-int v0, v0

    .line 274
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    new-instance v5, Ll6/d;

    .line 279
    .line 280
    invoke-direct {v5, v4, v0}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    :goto_4
    iget-object v0, v5, Ll6/d;->j:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v0, Ljava/lang/Number;

    .line 286
    .line 287
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    iget-object v4, v5, Ll6/d;->k:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v4, Ljava/lang/Number;

    .line 294
    .line 295
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 296
    .line 297
    .line 298
    move-result v4

    .line 299
    new-instance v5, Lc5/h1;

    .line 300
    .line 301
    invoke-direct {v5, v11}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 302
    .line 303
    .line 304
    const/16 v7, 0xf

    .line 305
    .line 306
    invoke-virtual {v9, v7}, Lc5/a1;->a(I)I

    .line 307
    .line 308
    .line 309
    move-result v10

    .line 310
    invoke-virtual {v9}, Lc5/a1;->b()Z

    .line 311
    .line 312
    .line 313
    move-result v12

    .line 314
    const/16 v15, 0x10

    .line 315
    .line 316
    if-eqz v12, :cond_a

    .line 317
    .line 318
    invoke-virtual {v9, v15}, Lc5/a1;->a(I)I

    .line 319
    .line 320
    .line 321
    move-result v12

    .line 322
    goto :goto_5

    .line 323
    :cond_a
    const/4 v12, 0x0

    .line 324
    :goto_5
    invoke-virtual {v9, v7}, Lc5/a1;->a(I)I

    .line 325
    .line 326
    .line 327
    move-result v7

    .line 328
    const/16 v14, 0x18

    .line 329
    .line 330
    move/from16 v18, v13

    .line 331
    .line 332
    invoke-virtual {v9, v14}, Lc5/a1;->a(I)I

    .line 333
    .line 334
    .line 335
    move-result v13

    .line 336
    invoke-virtual {v5, v10, v12, v7, v13}, Landroid/view/View;->setPadding(IIII)V

    .line 337
    .line 338
    .line 339
    iput v0, v5, Lc5/h1;->j:I

    .line 340
    .line 341
    invoke-virtual {v9}, Lc5/a1;->b()Z

    .line 342
    .line 343
    .line 344
    move-result v7

    .line 345
    if-eqz v7, :cond_b

    .line 346
    .line 347
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 348
    .line 349
    .line 350
    move-result-object v7

    .line 351
    iput-object v7, v5, Lc5/h1;->k:Ljava/lang/Integer;

    .line 352
    .line 353
    const/16 v7, 0x20

    .line 354
    .line 355
    invoke-virtual {v9, v7}, Lc5/a1;->a(I)I

    .line 356
    .line 357
    .line 358
    move-result v7

    .line 359
    iput v7, v5, Lc5/h1;->l:I

    .line 360
    .line 361
    :cond_b
    const/4 v7, 0x0

    .line 362
    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 366
    .line 367
    .line 368
    iget-object v7, v9, Lc5/a1;->i:Landroid/widget/LinearLayout;

    .line 369
    .line 370
    if-eqz v7, :cond_18

    .line 371
    .line 372
    invoke-virtual {v7, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 373
    .line 374
    .line 375
    const/4 v3, 0x4

    .line 376
    int-to-float v3, v3

    .line 377
    invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 378
    .line 379
    .line 380
    move-result-object v7

    .line 381
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 382
    .line 383
    .line 384
    move-result-object v7

    .line 385
    const/4 v10, 0x1

    .line 386
    invoke-static {v10, v3, v7}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 387
    .line 388
    .line 389
    move-result v3

    .line 390
    float-to-int v3, v3

    .line 391
    div-int/lit8 v3, v3, 0x2

    .line 392
    .line 393
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 398
    .line 399
    .line 400
    move-result v7

    .line 401
    if-eqz v7, :cond_6

    .line 402
    .line 403
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v7

    .line 407
    check-cast v7, Lx4/l;

    .line 408
    .line 409
    new-instance v10, Landroid/widget/ImageView;

    .line 410
    .line 411
    invoke-direct {v10, v11}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 412
    .line 413
    .line 414
    sget-object v12, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 415
    .line 416
    invoke-virtual {v10, v12}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 417
    .line 418
    .line 419
    sget-object v12, Lc5/j;->a:Lc5/j;

    .line 420
    .line 421
    sget v13, Lc5/z;->j:I

    .line 422
    .line 423
    move-object/from16 v19, v2

    .line 424
    .line 425
    const/4 v15, 0x0

    .line 426
    invoke-static {v13, v14, v15, v15}, Lc5/j;->i(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    invoke-virtual {v10, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 431
    .line 432
    .line 433
    const/4 v2, 0x1

    .line 434
    invoke-virtual {v10, v2}, Landroid/view/View;->setClipToOutline(Z)V

    .line 435
    .line 436
    .line 437
    new-instance v2, Landroid/widget/FrameLayout;

    .line 438
    .line 439
    invoke-direct {v2, v11}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 440
    .line 441
    .line 442
    invoke-static {v13, v14, v15, v15}, Lc5/j;->i(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 443
    .line 444
    .line 445
    move-result-object v13

    .line 446
    invoke-virtual {v2, v13}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 447
    .line 448
    .line 449
    const/4 v13, 0x1

    .line 450
    invoke-virtual {v2, v13}, Landroid/view/View;->setClipToOutline(Z)V

    .line 451
    .line 452
    .line 453
    new-instance v13, Landroid/widget/FrameLayout$LayoutParams;

    .line 454
    .line 455
    invoke-direct {v13, v8, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v2, v10, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v9}, Lc5/a1;->b()Z

    .line 462
    .line 463
    .line 464
    move-result v13

    .line 465
    const v15, 0x108003f

    .line 466
    .line 467
    .line 468
    move/from16 v20, v13

    .line 469
    .line 470
    if-eqz v20, :cond_e

    .line 471
    .line 472
    iget-object v14, v7, Lx4/l;->e:Ljava/lang/String;

    .line 473
    .line 474
    const-string v13, "w780"

    .line 475
    .line 476
    invoke-static {v14, v13}, Lt5/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v14

    .line 480
    if-nez v14, :cond_c

    .line 481
    .line 482
    iget-object v14, v7, Lx4/l;->d:Ljava/lang/String;

    .line 483
    .line 484
    invoke-static {v14, v13}, Lt5/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v14

    .line 488
    :cond_c
    if-eqz v14, :cond_d

    .line 489
    .line 490
    invoke-static {v11}, Lcom/bumptech/glide/b;->b(Landroid/content/Context;)Ln4/l;

    .line 491
    .line 492
    .line 493
    move-result-object v13

    .line 494
    invoke-virtual {v13, v11}, Ln4/l;->d(Lh/i;)Lcom/bumptech/glide/m;

    .line 495
    .line 496
    .line 497
    move-result-object v13

    .line 498
    invoke-virtual {v13, v14}, Lcom/bumptech/glide/m;->m(Ljava/lang/String;)Lcom/bumptech/glide/j;

    .line 499
    .line 500
    .line 501
    move-result-object v13

    .line 502
    invoke-virtual {v13, v10}, Lcom/bumptech/glide/j;->u(Landroid/widget/ImageView;)V

    .line 503
    .line 504
    .line 505
    goto :goto_7

    .line 506
    :cond_d
    invoke-virtual {v10, v15}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 507
    .line 508
    .line 509
    :goto_7
    new-instance v10, Landroid/view/View;

    .line 510
    .line 511
    invoke-direct {v10, v11}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 512
    .line 513
    .line 514
    new-instance v13, Landroid/graphics/drawable/GradientDrawable;

    .line 515
    .line 516
    sget-object v14, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 517
    .line 518
    const/high16 v15, -0x27000000

    .line 519
    .line 520
    move-object/from16 v22, v6

    .line 521
    .line 522
    const/4 v6, 0x0

    .line 523
    filled-new-array {v6, v15}, [I

    .line 524
    .line 525
    .line 526
    move-result-object v15

    .line 527
    invoke-direct {v13, v14, v15}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v10, v13}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 531
    .line 532
    .line 533
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 534
    .line 535
    const/16 v13, 0x64

    .line 536
    .line 537
    invoke-virtual {v9, v13}, Lc5/a1;->a(I)I

    .line 538
    .line 539
    .line 540
    move-result v13

    .line 541
    const/16 v14, 0x50

    .line 542
    .line 543
    invoke-direct {v6, v8, v13, v14}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v2, v10, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 547
    .line 548
    .line 549
    new-instance v6, Landroid/widget/ImageView;

    .line 550
    .line 551
    invoke-direct {v6, v11}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 552
    .line 553
    .line 554
    sget-object v10, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 555
    .line 556
    invoke-virtual {v6, v10}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 557
    .line 558
    .line 559
    const/16 v13, 0x8

    .line 560
    .line 561
    invoke-virtual {v6, v13}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 562
    .line 563
    .line 564
    new-instance v10, Landroid/widget/FrameLayout$LayoutParams;

    .line 565
    .line 566
    int-to-float v14, v0

    .line 567
    const v15, 0x3f47ae14    # 0.78f

    .line 568
    .line 569
    .line 570
    mul-float/2addr v14, v15

    .line 571
    float-to-int v14, v14

    .line 572
    int-to-float v15, v4

    .line 573
    const v21, 0x3ec28f5c    # 0.38f

    .line 574
    .line 575
    .line 576
    mul-float v15, v15, v21

    .line 577
    .line 578
    float-to-int v15, v15

    .line 579
    const/16 v13, 0x51

    .line 580
    .line 581
    invoke-direct {v10, v14, v15, v13}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 582
    .line 583
    .line 584
    const/16 v13, 0xc

    .line 585
    .line 586
    invoke-virtual {v9, v13}, Lc5/a1;->a(I)I

    .line 587
    .line 588
    .line 589
    move-result v13

    .line 590
    iput v13, v10, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 591
    .line 592
    invoke-virtual {v2, v6, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 593
    .line 594
    .line 595
    goto :goto_c

    .line 596
    :cond_e
    move-object/from16 v22, v6

    .line 597
    .line 598
    iget-object v6, v7, Lx4/l;->d:Ljava/lang/String;

    .line 599
    .line 600
    if-eqz v6, :cond_11

    .line 601
    .line 602
    invoke-static {v6}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 603
    .line 604
    .line 605
    move-result v13

    .line 606
    if-nez v13, :cond_f

    .line 607
    .line 608
    const-string v13, "null"

    .line 609
    .line 610
    invoke-virtual {v6, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 611
    .line 612
    .line 613
    move-result v13

    .line 614
    if-nez v13, :cond_f

    .line 615
    .line 616
    goto :goto_8

    .line 617
    :cond_f
    const/4 v6, 0x0

    .line 618
    :goto_8
    if-nez v6, :cond_10

    .line 619
    .line 620
    goto :goto_9

    .line 621
    :cond_10
    const-string v13, "https://image.tmdb.org/t/p/w500"

    .line 622
    .line 623
    invoke-virtual {v13, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v6

    .line 627
    goto :goto_a

    .line 628
    :cond_11
    :goto_9
    const/4 v6, 0x0

    .line 629
    :goto_a
    if-eqz v6, :cond_12

    .line 630
    .line 631
    invoke-static {v11}, Lcom/bumptech/glide/b;->b(Landroid/content/Context;)Ln4/l;

    .line 632
    .line 633
    .line 634
    move-result-object v13

    .line 635
    invoke-virtual {v13, v11}, Ln4/l;->d(Lh/i;)Lcom/bumptech/glide/m;

    .line 636
    .line 637
    .line 638
    move-result-object v13

    .line 639
    invoke-virtual {v13, v6}, Lcom/bumptech/glide/m;->m(Ljava/lang/String;)Lcom/bumptech/glide/j;

    .line 640
    .line 641
    .line 642
    move-result-object v6

    .line 643
    invoke-virtual {v6, v10}, Lcom/bumptech/glide/j;->u(Landroid/widget/ImageView;)V

    .line 644
    .line 645
    .line 646
    goto :goto_b

    .line 647
    :cond_12
    invoke-virtual {v10, v15}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 648
    .line 649
    .line 650
    :goto_b
    const/4 v6, 0x0

    .line 651
    :goto_c
    iget-object v10, v9, Lc5/a1;->f:Lc5/w0;

    .line 652
    .line 653
    sget-object v13, Lc5/w0;->l:Lc5/w0;

    .line 654
    .line 655
    if-ne v10, v13, :cond_13

    .line 656
    .line 657
    sget-object v10, Lx4/m;->j:Lx4/m;

    .line 658
    .line 659
    :goto_d
    move-object/from16 v23, v10

    .line 660
    .line 661
    goto :goto_e

    .line 662
    :cond_13
    sget-object v10, Lx4/m;->k:Lx4/m;

    .line 663
    .line 664
    goto :goto_d

    .line 665
    :goto_e
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v10

    .line 669
    iget-wide v14, v7, Lx4/l;->a:J

    .line 670
    .line 671
    move/from16 v24, v0

    .line 672
    .line 673
    new-instance v0, Ljava/lang/StringBuilder;

    .line 674
    .line 675
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 679
    .line 680
    .line 681
    const-string v10, ":"

    .line 682
    .line 683
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 684
    .line 685
    .line 686
    invoke-virtual {v0, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    move-object v10, v12

    .line 694
    new-instance v12, Landroid/widget/LinearLayout;

    .line 695
    .line 696
    invoke-direct {v12, v11}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 697
    .line 698
    .line 699
    invoke-virtual {v12, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 700
    .line 701
    .line 702
    const/4 v14, 0x1

    .line 703
    invoke-virtual {v12, v14}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 704
    .line 705
    .line 706
    move-object/from16 p1, v0

    .line 707
    .line 708
    const/16 v15, 0x10

    .line 709
    .line 710
    invoke-virtual {v9, v15}, Lc5/a1;->a(I)I

    .line 711
    .line 712
    .line 713
    move-result v0

    .line 714
    const/4 v15, 0x0

    .line 715
    invoke-virtual {v12, v15, v15, v15, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v12, v14}, Landroid/view/View;->setClickable(Z)V

    .line 719
    .line 720
    .line 721
    invoke-virtual {v12, v14}, Landroid/view/View;->setFocusable(Z)V

    .line 722
    .line 723
    .line 724
    new-instance v0, Lc5/p;

    .line 725
    .line 726
    const/4 v14, 0x5

    .line 727
    invoke-direct {v0, v9, v14, v7}, Lc5/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 728
    .line 729
    .line 730
    invoke-virtual {v12, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 731
    .line 732
    .line 733
    iget-object v0, v9, Lc5/a1;->f:Lc5/w0;

    .line 734
    .line 735
    if-ne v0, v13, :cond_14

    .line 736
    .line 737
    new-instance v0, Lc5/a0;

    .line 738
    .line 739
    move/from16 v13, v18

    .line 740
    .line 741
    invoke-direct {v0, v9, v7, v13}, Lc5/a0;-><init>(Ljava/lang/Object;Lx4/l;I)V

    .line 742
    .line 743
    .line 744
    invoke-virtual {v12, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 745
    .line 746
    .line 747
    :goto_f
    move/from16 v16, v15

    .line 748
    .line 749
    goto :goto_10

    .line 750
    :cond_14
    move/from16 v13, v18

    .line 751
    .line 752
    goto :goto_f

    .line 753
    :goto_10
    new-instance v15, Lc5/u0;

    .line 754
    .line 755
    const/4 v14, 0x1

    .line 756
    invoke-direct {v15, v9, v12, v14}, Lc5/u0;-><init>(Lc5/a1;Landroid/widget/LinearLayout;I)V

    .line 757
    .line 758
    .line 759
    const/4 v14, 0x0

    .line 760
    const/16 v17, 0x134

    .line 761
    .line 762
    move/from16 v18, v13

    .line 763
    .line 764
    const/16 v13, 0x18

    .line 765
    .line 766
    move-object/from16 v26, v14

    .line 767
    .line 768
    const/4 v14, 0x0

    .line 769
    move/from16 v0, v16

    .line 770
    .line 771
    move-object/from16 v16, v2

    .line 772
    .line 773
    move v2, v0

    .line 774
    move/from16 v0, v18

    .line 775
    .line 776
    const/16 v20, 0x18

    .line 777
    .line 778
    const/16 v25, 0x10

    .line 779
    .line 780
    invoke-static/range {v10 .. v17}, Lc5/j;->f(Lc5/j;Landroid/content/Context;Landroid/view/View;ILw4/x0;Ly6/a;Landroid/view/View;I)V

    .line 781
    .line 782
    .line 783
    move-object v10, v11

    .line 784
    move-object/from16 v11, v16

    .line 785
    .line 786
    new-instance v13, Lc5/v0;

    .line 787
    .line 788
    invoke-direct {v13, v9, v5}, Lc5/v0;-><init>(Lc5/a1;Lc5/h1;)V

    .line 789
    .line 790
    .line 791
    invoke-virtual {v12, v13}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 792
    .line 793
    .line 794
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    .line 795
    .line 796
    mul-int/lit8 v14, v3, 0x2

    .line 797
    .line 798
    sub-int v15, v24, v14

    .line 799
    .line 800
    sub-int v0, v4, v14

    .line 801
    .line 802
    invoke-direct {v13, v15, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 803
    .line 804
    .line 805
    iput v3, v13, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 806
    .line 807
    iput v3, v13, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 808
    .line 809
    iput v3, v13, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 810
    .line 811
    invoke-virtual {v12, v11, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 812
    .line 813
    .line 814
    new-instance v0, Landroid/widget/TextView;

    .line 815
    .line 816
    invoke-direct {v0, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 817
    .line 818
    .line 819
    iget-object v11, v7, Lx4/l;->b:Ljava/lang/String;

    .line 820
    .line 821
    const/16 v13, 0x24

    .line 822
    .line 823
    invoke-static {v13, v11}, Lc5/j;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v11

    .line 827
    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 828
    .line 829
    .line 830
    sget v11, Lc5/z;->e:I

    .line 831
    .line 832
    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 833
    .line 834
    .line 835
    invoke-virtual {v9}, Lc5/a1;->b()Z

    .line 836
    .line 837
    .line 838
    move-result v11

    .line 839
    if-eqz v11, :cond_15

    .line 840
    .line 841
    const/high16 v11, 0x41900000    # 18.0f

    .line 842
    .line 843
    goto :goto_11

    .line 844
    :cond_15
    const/high16 v11, 0x41700000    # 15.0f

    .line 845
    .line 846
    :goto_11
    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setTextSize(F)V

    .line 847
    .line 848
    .line 849
    const-string v11, "sans-serif-medium"

    .line 850
    .line 851
    invoke-static {v11, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 852
    .line 853
    .line 854
    move-result-object v11

    .line 855
    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 856
    .line 857
    .line 858
    const/4 v11, 0x2

    .line 859
    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 860
    .line 861
    .line 862
    sget-object v13, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 863
    .line 864
    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 865
    .line 866
    .line 867
    const/16 v13, 0x8

    .line 868
    .line 869
    invoke-virtual {v9, v13}, Lc5/a1;->a(I)I

    .line 870
    .line 871
    .line 872
    move-result v15

    .line 873
    invoke-virtual {v9, v13}, Lc5/a1;->a(I)I

    .line 874
    .line 875
    .line 876
    move-result v13

    .line 877
    invoke-virtual {v0, v15, v14, v13, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 878
    .line 879
    .line 880
    invoke-virtual {v12, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 881
    .line 882
    .line 883
    invoke-virtual {v5, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 884
    .line 885
    .line 886
    iget-object v0, v9, Lc5/a1;->j:Landroid/widget/LinearLayout;

    .line 887
    .line 888
    if-nez v0, :cond_16

    .line 889
    .line 890
    iput-object v12, v9, Lc5/a1;->j:Landroid/widget/LinearLayout;

    .line 891
    .line 892
    :cond_16
    if-eqz v6, :cond_17

    .line 893
    .line 894
    iget-object v0, v9, Lc5/a1;->e:Lm7/c;

    .line 895
    .line 896
    move v13, v8

    .line 897
    new-instance v8, Lc5/z0;

    .line 898
    .line 899
    const/4 v15, 0x0

    .line 900
    move-object v14, v10

    .line 901
    move-object v10, v7

    .line 902
    move-object v7, v14

    .line 903
    move-object v14, v6

    .line 904
    move/from16 v18, v11

    .line 905
    .line 906
    move v6, v13

    .line 907
    move-object/from16 v11, v23

    .line 908
    .line 909
    move-object/from16 v13, p1

    .line 910
    .line 911
    invoke-direct/range {v8 .. v15}, Lc5/z0;-><init>(Lc5/a1;Lx4/l;Lx4/m;Landroid/widget/LinearLayout;Ljava/lang/String;Landroid/widget/ImageView;Lp6/c;)V

    .line 912
    .line 913
    .line 914
    const/4 v10, 0x3

    .line 915
    const/4 v14, 0x0

    .line 916
    invoke-static {v0, v14, v8, v10}, Li7/x;->k(Li7/u;Lj7/d;Ly6/p;I)Li7/a0;

    .line 917
    .line 918
    .line 919
    goto :goto_12

    .line 920
    :cond_17
    move v6, v8

    .line 921
    move-object v7, v10

    .line 922
    move/from16 v18, v11

    .line 923
    .line 924
    const/4 v14, 0x0

    .line 925
    :goto_12
    move v8, v6

    .line 926
    move-object v11, v7

    .line 927
    move-object/from16 v2, v19

    .line 928
    .line 929
    move/from16 v14, v20

    .line 930
    .line 931
    move-object/from16 v6, v22

    .line 932
    .line 933
    move/from16 v0, v24

    .line 934
    .line 935
    move/from16 v15, v25

    .line 936
    .line 937
    goto/16 :goto_6

    .line 938
    .line 939
    :cond_18
    const/4 v14, 0x0

    .line 940
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 941
    .line 942
    .line 943
    throw v14

    .line 944
    :cond_19
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 945
    .line 946
    .line 947
    throw v14

    .line 948
    :goto_13
    move-object/from16 v6, v22

    .line 949
    .line 950
    goto :goto_15

    .line 951
    :cond_1a
    const-string v0, "input"

    .line 952
    .line 953
    invoke-static {v0}, Lz6/h;->h(Ljava/lang/String;)V

    .line 954
    .line 955
    .line 956
    throw v14

    .line 957
    :goto_14
    const-string v4, "SearchPanel"

    .line 958
    .line 959
    const-string v5, "search failed"

    .line 960
    .line 961
    invoke-static {v4, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 962
    .line 963
    .line 964
    const v0, 0x7f110113

    .line 965
    .line 966
    .line 967
    invoke-virtual {v10, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 968
    .line 969
    .line 970
    move-result-object v0

    .line 971
    const-string v4, "getString(...)"

    .line 972
    .line 973
    invoke-static {v4, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 974
    .line 975
    .line 976
    iput-object v14, v9, Lc5/a1;->j:Landroid/widget/LinearLayout;

    .line 977
    .line 978
    iget-object v4, v9, Lc5/a1;->i:Landroid/widget/LinearLayout;

    .line 979
    .line 980
    if-eqz v4, :cond_1c

    .line 981
    .line 982
    invoke-virtual {v4}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 983
    .line 984
    .line 985
    iget-object v4, v9, Lc5/a1;->i:Landroid/widget/LinearLayout;

    .line 986
    .line 987
    if-eqz v4, :cond_1b

    .line 988
    .line 989
    new-instance v3, Landroid/widget/TextView;

    .line 990
    .line 991
    invoke-direct {v3, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 992
    .line 993
    .line 994
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 995
    .line 996
    .line 997
    sget v0, Lc5/z;->c:I

    .line 998
    .line 999
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1000
    .line 1001
    .line 1002
    const/high16 v0, 0x41600000    # 14.0f

    .line 1003
    .line 1004
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v3, v15}, Landroid/widget/TextView;->setGravity(I)V

    .line 1008
    .line 1009
    .line 1010
    const/16 v0, 0x30

    .line 1011
    .line 1012
    invoke-virtual {v9, v0}, Lc5/a1;->a(I)I

    .line 1013
    .line 1014
    .line 1015
    move-result v5

    .line 1016
    invoke-virtual {v9, v0}, Lc5/a1;->a(I)I

    .line 1017
    .line 1018
    .line 1019
    move-result v0

    .line 1020
    invoke-virtual {v3, v2, v5, v2, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1021
    .line 1022
    .line 1023
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 1024
    .line 1025
    invoke-direct {v0, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {v4, v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1029
    .line 1030
    .line 1031
    goto :goto_13

    .line 1032
    :goto_15
    return-object v6

    .line 1033
    :cond_1b
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1034
    .line 1035
    .line 1036
    throw v14

    .line 1037
    :cond_1c
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1038
    .line 1039
    .line 1040
    throw v14

    .line 1041
    :cond_1d
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1042
    .line 1043
    .line 1044
    throw v14

    .line 1045
    :cond_1e
    invoke-static {v3}, Lz6/h;->h(Ljava/lang/String;)V

    .line 1046
    .line 1047
    .line 1048
    throw v14

    .line 1049
    :pswitch_0
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 1050
    .line 1051
    iget v4, v1, Lc5/x0;->o:I

    .line 1052
    .line 1053
    if-eqz v4, :cond_20

    .line 1054
    .line 1055
    const/4 v14, 0x1

    .line 1056
    if-ne v4, v14, :cond_1f

    .line 1057
    .line 1058
    iget-object v0, v1, Lc5/x0;->r:Ljava/lang/Object;

    .line 1059
    .line 1060
    check-cast v0, Lx4/w;

    .line 1061
    .line 1062
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 1063
    .line 1064
    .line 1065
    move-object/from16 v2, p1

    .line 1066
    .line 1067
    goto/16 :goto_17

    .line 1068
    .line 1069
    :cond_1f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1070
    .line 1071
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1072
    .line 1073
    .line 1074
    throw v0

    .line 1075
    :cond_20
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 1076
    .line 1077
    .line 1078
    iget-object v2, v1, Lc5/x0;->q:Lc5/w0;

    .line 1079
    .line 1080
    iget-object v2, v2, Lc5/w0;->k:Ljava/lang/String;

    .line 1081
    .line 1082
    iget-object v4, v1, Lc5/x0;->p:Ljava/lang/String;

    .line 1083
    .line 1084
    const-string v5, "UTF-8"

    .line 1085
    .line 1086
    invoke-static {v4, v5}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v4

    .line 1090
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1091
    .line 1092
    const-string v6, "https://api.themoviedb.org/3"

    .line 1093
    .line 1094
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1098
    .line 1099
    .line 1100
    const-string v2, "?query="

    .line 1101
    .line 1102
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1106
    .line 1107
    .line 1108
    const-string v2, "&include_adult=false"

    .line 1109
    .line 1110
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v2

    .line 1117
    const-string v4, "url"

    .line 1118
    .line 1119
    invoke-static {v4, v2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1120
    .line 1121
    .line 1122
    const/16 v4, 0x3f

    .line 1123
    .line 1124
    invoke-static {v2, v4}, Lh7/h;->v0(Ljava/lang/CharSequence;C)Z

    .line 1125
    .line 1126
    .line 1127
    move-result v4

    .line 1128
    if-eqz v4, :cond_21

    .line 1129
    .line 1130
    const-string v4, "&"

    .line 1131
    .line 1132
    goto :goto_16

    .line 1133
    :cond_21
    const-string v4, "?"

    .line 1134
    .line 1135
    :goto_16
    sget-object v5, Lb5/h;->a:Lb5/i;

    .line 1136
    .line 1137
    if-eqz v5, :cond_22

    .line 1138
    .line 1139
    iget-object v5, v5, Lb5/i;->r:Ljava/lang/String;

    .line 1140
    .line 1141
    if-nez v5, :cond_23

    .line 1142
    .line 1143
    :cond_22
    const-string v5, "4e44d9029b1270a757cddc766a1bcb63"

    .line 1144
    .line 1145
    :cond_23
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1146
    .line 1147
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1154
    .line 1155
    .line 1156
    const-string v2, "api_key="

    .line 1157
    .line 1158
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v2

    .line 1168
    sget-object v4, Lx4/w;->a:Lx4/w;

    .line 1169
    .line 1170
    sget-object v5, Lx4/k;->a:Lx4/k;

    .line 1171
    .line 1172
    iput-object v4, v1, Lc5/x0;->r:Ljava/lang/Object;

    .line 1173
    .line 1174
    const/4 v14, 0x1

    .line 1175
    iput v14, v1, Lc5/x0;->o:I

    .line 1176
    .line 1177
    invoke-static {v2, v1}, Lx4/k;->f(Ljava/lang/String;Lr6/h;)Ljava/lang/Object;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v2

    .line 1181
    if-ne v2, v0, :cond_24

    .line 1182
    .line 1183
    goto :goto_19

    .line 1184
    :cond_24
    move-object v0, v4

    .line 1185
    :goto_17
    check-cast v2, Ljava/lang/String;

    .line 1186
    .line 1187
    new-instance v4, Lorg/json/JSONObject;

    .line 1188
    .line 1189
    invoke-direct {v4, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1190
    .line 1191
    .line 1192
    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v2

    .line 1196
    iget-object v3, v1, Lc5/x0;->q:Lc5/w0;

    .line 1197
    .line 1198
    sget-object v4, Lc5/w0;->l:Lc5/w0;

    .line 1199
    .line 1200
    if-ne v3, v4, :cond_25

    .line 1201
    .line 1202
    sget-object v3, Lx4/m;->j:Lx4/m;

    .line 1203
    .line 1204
    goto :goto_18

    .line 1205
    :cond_25
    sget-object v3, Lx4/m;->k:Lx4/m;

    .line 1206
    .line 1207
    :goto_18
    sget-object v4, Lx4/w;->a:Lx4/w;

    .line 1208
    .line 1209
    sget-object v4, Lm6/r;->j:Lm6/r;

    .line 1210
    .line 1211
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1212
    .line 1213
    .line 1214
    invoke-static {v2, v3, v4}, Lx4/w;->b(Lorg/json/JSONArray;Lx4/m;Ljava/util/Set;)Ljava/util/List;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v0

    .line 1218
    :goto_19
    return-object v0

    .line 1219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
