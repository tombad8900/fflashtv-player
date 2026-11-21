.class public final synthetic Lb6/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lb6/a;->j:I

    .line 2
    .line 3
    iput-object p2, p0, Lb6/a;->k:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget v0, p0, Lb6/a;->j:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x1d

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v5, p0, Lb6/a;->k:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v5, Lcom/exotv/net/SeriesDetailActivity;

    .line 14
    .line 15
    sget p1, Lcom/exotv/net/SeriesDetailActivity;->k0:I

    .line 16
    .line 17
    invoke-virtual {v5}, Landroid/app/Activity;->finish()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    check-cast v5, Ly6/a;

    .line 22
    .line 23
    sget p1, Lcom/exotv/net/PlayerActivity;->z0:I

    .line 24
    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    invoke-interface {v5}, Ly6/a;->invoke()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void

    .line 31
    :pswitch_1
    check-cast v5, Lcom/exotv/net/MovieDetailActivity;

    .line 32
    .line 33
    sget p1, Lcom/exotv/net/MovieDetailActivity;->Y:I

    .line 34
    .line 35
    invoke-virtual {v5}, Landroid/app/Activity;->finish()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_2
    check-cast v5, Lw2/t;

    .line 40
    .line 41
    invoke-virtual {v5}, Lw2/t;->g()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const v1, 0x7f0a00fa

    .line 49
    .line 50
    .line 51
    if-ne v0, v1, :cond_1

    .line 52
    .line 53
    iget-object p1, v5, Lw2/t;->q:Landroid/animation/ValueAnimator;

    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    const v0, 0x7f0a00f9

    .line 64
    .line 65
    .line 66
    if-ne p1, v0, :cond_2

    .line 67
    .line 68
    iget-object p1, v5, Lw2/t;->r:Landroid/animation/ValueAnimator;

    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 71
    .line 72
    .line 73
    :cond_2
    :goto_0
    return-void

    .line 74
    :pswitch_3
    check-cast v5, Lw2/e;

    .line 75
    .line 76
    iget-object p1, v5, Lw2/e;->g:Lw2/o;

    .line 77
    .line 78
    iget-object v0, p1, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 79
    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    invoke-interface {v0, v2}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_3

    .line 87
    .line 88
    iget-object v0, p1, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 89
    .line 90
    invoke-interface {v0}, Landroidx/media3/common/d1;->getTrackSelectionParameters()Landroidx/media3/common/v1;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget-object v2, p1, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 95
    .line 96
    invoke-virtual {v0}, Landroidx/media3/common/v1;->buildUpon()Landroidx/media3/common/u1;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    const/4 v3, 0x3

    .line 101
    invoke-virtual {v0, v3}, Landroidx/media3/common/u1;->clearOverridesOfType(I)Landroidx/media3/common/u1;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const/4 v3, -0x3

    .line 106
    invoke-virtual {v0, v3}, Landroidx/media3/common/u1;->setIgnoredTextSelectionFlags(I)Landroidx/media3/common/u1;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0, v4}, Landroidx/media3/common/u1;->setPreferredTextLanguage(Ljava/lang/String;)Landroidx/media3/common/u1;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0, v1}, Landroidx/media3/common/u1;->setPreferredTextRoleFlags(I)Landroidx/media3/common/u1;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0}, Landroidx/media3/common/u1;->build()Landroidx/media3/common/v1;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-interface {v2, v0}, Landroidx/media3/common/d1;->setTrackSelectionParameters(Landroidx/media3/common/v1;)V

    .line 123
    .line 124
    .line 125
    iget-object p1, p1, Lw2/o;->t:Landroid/widget/PopupWindow;

    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 128
    .line 129
    .line 130
    :cond_3
    return-void

    .line 131
    :pswitch_4
    check-cast v5, Lw2/j;

    .line 132
    .line 133
    iget-object p1, v5, Lw2/j;->x:Lw2/o;

    .line 134
    .line 135
    iget-object v0, v5, Lz2/v0;->s:Lz2/x;

    .line 136
    .line 137
    const/4 v1, -0x1

    .line 138
    if-nez v0, :cond_4

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_4
    iget-object v0, v5, Lz2/v0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 142
    .line 143
    if-nez v0, :cond_5

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_5
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lz2/x;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    if-nez v0, :cond_6

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_6
    iget-object v2, v5, Lz2/v0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 154
    .line 155
    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->I(Lz2/v0;)I

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-ne v2, v1, :cond_7

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_7
    iget-object v4, v5, Lz2/v0;->s:Lz2/x;

    .line 163
    .line 164
    if-ne v4, v0, :cond_8

    .line 165
    .line 166
    move v1, v2

    .line 167
    :cond_8
    :goto_1
    iget-object v0, p1, Lw2/o;->I:Landroid/view/View;

    .line 168
    .line 169
    if-nez v1, :cond_9

    .line 170
    .line 171
    iget-object v1, p1, Lw2/o;->p:Lw2/h;

    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1, v1, v0}, Lw2/o;->d(Lz2/x;Landroid/view/View;)V

    .line 177
    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_9
    if-ne v1, v3, :cond_a

    .line 181
    .line 182
    iget-object v1, p1, Lw2/o;->r:Lw2/e;

    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1, v1, v0}, Lw2/o;->d(Lz2/x;Landroid/view/View;)V

    .line 188
    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_a
    iget-object p1, p1, Lw2/o;->t:Landroid/widget/PopupWindow;

    .line 192
    .line 193
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 194
    .line 195
    .line 196
    :goto_2
    return-void

    .line 197
    :pswitch_5
    check-cast v5, Lw2/e;

    .line 198
    .line 199
    iget-object p1, v5, Lw2/e;->g:Lw2/o;

    .line 200
    .line 201
    iget-object v0, p1, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 202
    .line 203
    if-eqz v0, :cond_c

    .line 204
    .line 205
    invoke-interface {v0, v2}, Landroidx/media3/common/d1;->isCommandAvailable(I)Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-nez v0, :cond_b

    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_b
    iget-object v0, p1, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 213
    .line 214
    invoke-interface {v0}, Landroidx/media3/common/d1;->getTrackSelectionParameters()Landroidx/media3/common/v1;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    iget-object v2, p1, Lw2/o;->s0:Landroidx/media3/common/d1;

    .line 219
    .line 220
    sget v4, Lh1/i0;->a:I

    .line 221
    .line 222
    invoke-virtual {v0}, Landroidx/media3/common/v1;->buildUpon()Landroidx/media3/common/u1;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {v0, v3}, Landroidx/media3/common/u1;->clearOverridesOfType(I)Landroidx/media3/common/u1;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-virtual {v0, v3, v1}, Landroidx/media3/common/u1;->setTrackTypeDisabled(IZ)Landroidx/media3/common/u1;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {v0}, Landroidx/media3/common/u1;->build()Landroidx/media3/common/v1;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-interface {v2, v0}, Landroidx/media3/common/d1;->setTrackSelectionParameters(Landroidx/media3/common/v1;)V

    .line 239
    .line 240
    .line 241
    iget-object v0, p1, Lw2/o;->o:Lc5/t;

    .line 242
    .line 243
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    const v2, 0x7f110075

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    iget-object v0, v0, Lc5/t;->f:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v0, [Ljava/lang/String;

    .line 257
    .line 258
    aput-object v1, v0, v3

    .line 259
    .line 260
    iget-object p1, p1, Lw2/o;->t:Landroid/widget/PopupWindow;

    .line 261
    .line 262
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 263
    .line 264
    .line 265
    :cond_c
    :goto_3
    return-void

    .line 266
    :pswitch_6
    check-cast v5, Lw2/o;

    .line 267
    .line 268
    iget-boolean p1, v5, Lw2/o;->t0:Z

    .line 269
    .line 270
    xor-int/2addr p1, v3

    .line 271
    invoke-virtual {v5, p1}, Lw2/o;->k(Z)V

    .line 272
    .line 273
    .line 274
    return-void

    .line 275
    :pswitch_7
    check-cast v5, Lc5/a1;

    .line 276
    .line 277
    iget-object p1, v5, Lc5/a1;->g:Landroid/widget/EditText;

    .line 278
    .line 279
    if-eqz p1, :cond_d

    .line 280
    .line 281
    const-string v0, ""

    .line 282
    .line 283
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 284
    .line 285
    .line 286
    return-void

    .line 287
    :cond_d
    const-string p1, "input"

    .line 288
    .line 289
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    throw v4

    .line 293
    :pswitch_8
    check-cast v5, Lcom/exotv/net/ui/AdActivity;

    .line 294
    .line 295
    invoke-static {v5}, Lcom/exotv/net/ui/AdActivity;->r(Lcom/exotv/net/ui/AdActivity;)V

    .line 296
    .line 297
    .line 298
    return-void

    .line 299
    :pswitch_9
    check-cast v5, Lb6/b0;

    .line 300
    .line 301
    iget-object p1, v5, Lb6/b0;->f:Landroid/widget/EditText;

    .line 302
    .line 303
    if-nez p1, :cond_e

    .line 304
    .line 305
    goto :goto_5

    .line 306
    :cond_e
    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 307
    .line 308
    .line 309
    move-result p1

    .line 310
    iget-object v0, v5, Lb6/b0;->f:Landroid/widget/EditText;

    .line 311
    .line 312
    if-eqz v0, :cond_f

    .line 313
    .line 314
    invoke-virtual {v0}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    instance-of v0, v0, Landroid/text/method/PasswordTransformationMethod;

    .line 319
    .line 320
    if-eqz v0, :cond_f

    .line 321
    .line 322
    iget-object v0, v5, Lb6/b0;->f:Landroid/widget/EditText;

    .line 323
    .line 324
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 325
    .line 326
    .line 327
    goto :goto_4

    .line 328
    :cond_f
    iget-object v0, v5, Lb6/b0;->f:Landroid/widget/EditText;

    .line 329
    .line 330
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 335
    .line 336
    .line 337
    :goto_4
    if-ltz p1, :cond_10

    .line 338
    .line 339
    iget-object v0, v5, Lb6/b0;->f:Landroid/widget/EditText;

    .line 340
    .line 341
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 342
    .line 343
    .line 344
    :cond_10
    invoke-virtual {v5}, Lb6/u;->p()V

    .line 345
    .line 346
    .line 347
    :goto_5
    return-void

    .line 348
    :pswitch_a
    check-cast v5, Lb6/o;

    .line 349
    .line 350
    invoke-virtual {v5}, Lb6/o;->t()V

    .line 351
    .line 352
    .line 353
    return-void

    .line 354
    :pswitch_b
    check-cast v5, Lb6/e;

    .line 355
    .line 356
    iget-object v0, v5, Lb6/e;->i:Landroid/widget/EditText;

    .line 357
    .line 358
    if-nez v0, :cond_11

    .line 359
    .line 360
    goto :goto_6

    .line 361
    :cond_11
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-virtual {p1}, Landroid/view/View;->hasFocus()Z

    .line 366
    .line 367
    .line 368
    move-result p1

    .line 369
    if-eqz p1, :cond_12

    .line 370
    .line 371
    iget-object p1, v5, Lb6/e;->i:Landroid/widget/EditText;

    .line 372
    .line 373
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 374
    .line 375
    .line 376
    :cond_12
    if-eqz v0, :cond_13

    .line 377
    .line 378
    invoke-interface {v0}, Landroid/text/Editable;->clear()V

    .line 379
    .line 380
    .line 381
    :cond_13
    invoke-virtual {v5}, Lb6/u;->p()V

    .line 382
    .line 383
    .line 384
    :goto_6
    return-void

    .line 385
    :pswitch_data_0
    .packed-switch 0x0
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
