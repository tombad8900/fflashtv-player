.class public final synthetic Lw4/f0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Lcom/exotv/net/PlayerActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/exotv/net/PlayerActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw4/f0;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lw4/f0;->k:Lcom/exotv/net/PlayerActivity;

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
    iget p1, p0, Lw4/f0;->j:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, "b"

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    iget-object v3, p0, Lw4/f0;->k:Lcom/exotv/net/PlayerActivity;

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object p1, v3, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 13
    .line 14
    if-eqz p1, :cond_c

    .line 15
    .line 16
    iget-object p1, p1, La5/b;->C:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    iget-object p1, v3, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget-object p1, p1, La5/b;->j:Landroid/widget/LinearLayout;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v3}, Lcom/exotv/net/PlayerActivity;->Q()V

    .line 38
    .line 39
    .line 40
    goto :goto_4

    .line 41
    :cond_1
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v2

    .line 45
    :cond_2
    :goto_0
    iget-object p1, v3, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 46
    .line 47
    if-eqz p1, :cond_b

    .line 48
    .line 49
    iget-object p1, p1, La5/b;->C:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    const/16 v0, 0x8

    .line 56
    .line 57
    if-nez p1, :cond_4

    .line 58
    .line 59
    iget-object p1, v3, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    iget-object p1, p1, La5/b;->C:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v2

    .line 73
    :cond_4
    :goto_1
    iget-object p1, v3, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 74
    .line 75
    if-eqz p1, :cond_a

    .line 76
    .line 77
    iget-object p1, p1, La5/b;->r:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-nez p1, :cond_6

    .line 84
    .line 85
    iget-object p1, v3, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 86
    .line 87
    if-eqz p1, :cond_5

    .line 88
    .line 89
    iget-object p1, p1, La5/b;->r:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 90
    .line 91
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_5
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw v2

    .line 99
    :cond_6
    :goto_2
    iget-object p1, v3, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 100
    .line 101
    if-eqz p1, :cond_9

    .line 102
    .line 103
    iget-object p1, p1, La5/b;->x:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 104
    .line 105
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_8

    .line 110
    .line 111
    iget-object p1, v3, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 112
    .line 113
    if-eqz p1, :cond_7

    .line 114
    .line 115
    iget-object p1, p1, La5/b;->x:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 116
    .line 117
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_7
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v2

    .line 125
    :cond_8
    :goto_3
    invoke-virtual {v3}, Lcom/exotv/net/PlayerActivity;->D()V

    .line 126
    .line 127
    .line 128
    :goto_4
    return-void

    .line 129
    :cond_9
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v2

    .line 133
    :cond_a
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw v2

    .line 137
    :cond_b
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw v2

    .line 141
    :cond_c
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v2

    .line 145
    :pswitch_0
    sget p1, Lcom/exotv/net/PlayerActivity;->z0:I

    .line 146
    .line 147
    invoke-virtual {v3}, Lcom/exotv/net/PlayerActivity;->U()V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :pswitch_1
    sget p1, Lcom/exotv/net/PlayerActivity;->z0:I

    .line 152
    .line 153
    invoke-virtual {v3}, Lcom/exotv/net/PlayerActivity;->V()V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :pswitch_2
    iget-boolean p1, v3, Lcom/exotv/net/PlayerActivity;->N:Z

    .line 158
    .line 159
    xor-int/lit8 p1, p1, 0x1

    .line 160
    .line 161
    iput-boolean p1, v3, Lcom/exotv/net/PlayerActivity;->N:Z

    .line 162
    .line 163
    const-string v1, "exotv_player"

    .line 164
    .line 165
    invoke-virtual {v3, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    const-string v1, "stretch"

    .line 174
    .line 175
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v3}, Lcom/exotv/net/PlayerActivity;->v()V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3}, Lcom/exotv/net/PlayerActivity;->Q()V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :pswitch_3
    iget-object p1, v3, Lcom/exotv/net/PlayerActivity;->I:Landroidx/media3/exoplayer/ExoPlayer;

    .line 190
    .line 191
    if-nez p1, :cond_d

    .line 192
    .line 193
    goto :goto_7

    .line 194
    :cond_d
    invoke-interface {p1}, Landroidx/media3/exoplayer/ExoPlayer;->getVolume()F

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    const/4 v4, 0x0

    .line 199
    cmpl-float v0, v0, v4

    .line 200
    .line 201
    if-lez v0, :cond_e

    .line 202
    .line 203
    move v0, v4

    .line 204
    goto :goto_5

    .line 205
    :cond_e
    const/high16 v0, 0x3f800000    # 1.0f

    .line 206
    .line 207
    :goto_5
    invoke-interface {p1, v0}, Landroidx/media3/exoplayer/ExoPlayer;->setVolume(F)V

    .line 208
    .line 209
    .line 210
    iget-object v0, v3, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 211
    .line 212
    if-eqz v0, :cond_10

    .line 213
    .line 214
    iget-object v0, v0, La5/b;->c:Landroid/widget/ImageView;

    .line 215
    .line 216
    invoke-interface {p1}, Landroidx/media3/exoplayer/ExoPlayer;->getVolume()F

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    cmpl-float p1, p1, v4

    .line 221
    .line 222
    if-lez p1, :cond_f

    .line 223
    .line 224
    const p1, 0x7f08010e

    .line 225
    .line 226
    .line 227
    goto :goto_6

    .line 228
    :cond_f
    const p1, 0x7f08010d

    .line 229
    .line 230
    .line 231
    :goto_6
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v3}, Lcom/exotv/net/PlayerActivity;->Q()V

    .line 235
    .line 236
    .line 237
    :goto_7
    return-void

    .line 238
    :cond_10
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw v2

    .line 242
    :pswitch_4
    iget-object p1, v3, Lcom/exotv/net/PlayerActivity;->I:Landroidx/media3/exoplayer/ExoPlayer;

    .line 243
    .line 244
    if-nez p1, :cond_11

    .line 245
    .line 246
    goto :goto_9

    .line 247
    :cond_11
    invoke-interface {p1}, Landroidx/media3/exoplayer/ExoPlayer;->getPlayWhenReady()Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-eqz v0, :cond_13

    .line 252
    .line 253
    invoke-interface {p1}, Landroidx/media3/exoplayer/ExoPlayer;->pause()V

    .line 254
    .line 255
    .line 256
    iget-object p1, v3, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 257
    .line 258
    if-eqz p1, :cond_12

    .line 259
    .line 260
    iget-object p1, p1, La5/b;->d:Landroid/widget/ImageView;

    .line 261
    .line 262
    const v1, 0x7f080103

    .line 263
    .line 264
    .line 265
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 266
    .line 267
    .line 268
    goto :goto_8

    .line 269
    :cond_12
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    throw v2

    .line 273
    :cond_13
    invoke-interface {p1}, Landroidx/media3/exoplayer/ExoPlayer;->play()V

    .line 274
    .line 275
    .line 276
    iget-object p1, v3, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 277
    .line 278
    if-eqz p1, :cond_14

    .line 279
    .line 280
    iget-object p1, p1, La5/b;->d:Landroid/widget/ImageView;

    .line 281
    .line 282
    const v1, 0x7f080102

    .line 283
    .line 284
    .line 285
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 286
    .line 287
    .line 288
    iget-object p1, v3, Lcom/exotv/net/PlayerActivity;->O:Lc5/b1;

    .line 289
    .line 290
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 291
    .line 292
    .line 293
    move-result-wide v1

    .line 294
    iput-wide v1, p1, Lc5/b1;->c:J

    .line 295
    .line 296
    :goto_8
    iput-boolean v0, v3, Lcom/exotv/net/PlayerActivity;->P:Z

    .line 297
    .line 298
    invoke-virtual {v3}, Lcom/exotv/net/PlayerActivity;->Q()V

    .line 299
    .line 300
    .line 301
    :goto_9
    return-void

    .line 302
    :cond_14
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    throw v2

    .line 306
    :pswitch_5
    sget p1, Lcom/exotv/net/PlayerActivity;->z0:I

    .line 307
    .line 308
    invoke-virtual {v3}, Landroid/app/Activity;->finish()V

    .line 309
    .line 310
    .line 311
    return-void

    .line 312
    :pswitch_6
    sget p1, Lcom/exotv/net/PlayerActivity;->z0:I

    .line 313
    .line 314
    invoke-virtual {v3}, Lcom/exotv/net/PlayerActivity;->W()V

    .line 315
    .line 316
    .line 317
    return-void

    .line 318
    :pswitch_7
    sget p1, Lcom/exotv/net/PlayerActivity;->z0:I

    .line 319
    .line 320
    invoke-virtual {v3}, Landroid/app/Activity;->finish()V

    .line 321
    .line 322
    .line 323
    return-void

    .line 324
    :pswitch_8
    iget-object p1, v3, Lcom/exotv/net/PlayerActivity;->J:Landroid/os/Handler;

    .line 325
    .line 326
    iget-object v1, v3, Lcom/exotv/net/PlayerActivity;->x0:Ljava/lang/String;

    .line 327
    .line 328
    if-nez v1, :cond_15

    .line 329
    .line 330
    invoke-virtual {v3}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    const-string v2, "exo_url"

    .line 335
    .line 336
    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    if-nez v1, :cond_15

    .line 341
    .line 342
    goto :goto_a

    .line 343
    :cond_15
    iget-object v2, v3, Lcom/exotv/net/PlayerActivity;->O:Lc5/b1;

    .line 344
    .line 345
    iput v0, v2, Lc5/b1;->d:I

    .line 346
    .line 347
    iput-boolean v0, v2, Lc5/b1;->b:Z

    .line 348
    .line 349
    iget-object v2, v3, Lcom/exotv/net/PlayerActivity;->T:Lw4/n0;

    .line 350
    .line 351
    invoke-virtual {p1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 352
    .line 353
    .line 354
    const-wide/16 v4, 0x7d0

    .line 355
    .line 356
    invoke-virtual {p1, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 357
    .line 358
    .line 359
    iget-object v2, v3, Lcom/exotv/net/PlayerActivity;->W:Lw4/g0;

    .line 360
    .line 361
    invoke-virtual {p1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 362
    .line 363
    .line 364
    iput-boolean v0, v3, Lcom/exotv/net/PlayerActivity;->P:Z

    .line 365
    .line 366
    iget-object p1, v3, Lcom/exotv/net/PlayerActivity;->y0:Ljava/util/Map;

    .line 367
    .line 368
    invoke-virtual {v3}, Lcom/exotv/net/PlayerActivity;->M()J

    .line 369
    .line 370
    .line 371
    move-result-wide v4

    .line 372
    invoke-virtual {v3, v1, p1, v4, v5}, Lcom/exotv/net/PlayerActivity;->T(Ljava/lang/String;Ljava/util/Map;J)V

    .line 373
    .line 374
    .line 375
    :goto_a
    return-void

    .line 376
    nop

    .line 377
    :pswitch_data_0
    .packed-switch 0x0
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
