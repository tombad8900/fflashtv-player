.class public final Lw4/c1;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public final synthetic n:I

.field public o:I

.field public final synthetic p:Lcom/exotv/net/SeriesDetailActivity;

.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(Lcom/exotv/net/SeriesDetailActivity;ILp6/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Lw4/c1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lw4/c1;->p:Lcom/exotv/net/SeriesDetailActivity;

    .line 4
    .line 5
    iput p2, p0, Lw4/c1;->q:I

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Lr6/h;-><init>(ILp6/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lw4/c1;->n:I

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
    invoke-virtual {p0, p1, p2}, Lw4/c1;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lw4/c1;

    .line 15
    .line 16
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lw4/c1;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lw4/c1;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lw4/c1;

    .line 28
    .line 29
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lw4/c1;->h(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget p1, p0, Lw4/c1;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lw4/c1;

    .line 7
    .line 8
    iget v0, p0, Lw4/c1;->q:I

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iget-object v2, p0, Lw4/c1;->p:Lcom/exotv/net/SeriesDetailActivity;

    .line 12
    .line 13
    invoke-direct {p1, v2, v0, p2, v1}, Lw4/c1;-><init>(Lcom/exotv/net/SeriesDetailActivity;ILp6/c;I)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, Lw4/c1;

    .line 18
    .line 19
    iget v0, p0, Lw4/c1;->q:I

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iget-object v2, p0, Lw4/c1;->p:Lcom/exotv/net/SeriesDetailActivity;

    .line 23
    .line 24
    invoke-direct {p1, v2, v0, p2, v1}, Lw4/c1;-><init>(Lcom/exotv/net/SeriesDetailActivity;ILp6/c;I)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lw4/c1;->n:I

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v6, Ll6/j;->a:Ll6/j;

    .line 14
    .line 15
    iget-object v7, v1, Lw4/c1;->p:Lcom/exotv/net/SeriesDetailActivity;

    .line 16
    .line 17
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 18
    .line 19
    iget v8, v1, Lw4/c1;->o:I

    .line 20
    .line 21
    if-eqz v8, :cond_1

    .line 22
    .line 23
    if-ne v8, v3, :cond_0

    .line 24
    .line 25
    :try_start_0
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    move-object/from16 v2, p1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-exception v0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0

    .line 39
    :cond_1
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :try_start_1
    iget v2, v1, Lw4/c1;->q:I

    .line 43
    .line 44
    iput v3, v1, Lw4/c1;->o:I

    .line 45
    .line 46
    sget v8, Lcom/exotv/net/SeriesDetailActivity;->k0:I

    .line 47
    .line 48
    sget-object v8, Li7/e0;->a:Lo7/e;

    .line 49
    .line 50
    sget-object v8, Lo7/d;->l:Lo7/d;

    .line 51
    .line 52
    new-instance v9, Lw4/c1;

    .line 53
    .line 54
    invoke-direct {v9, v7, v2, v4, v5}, Lw4/c1;-><init>(Lcom/exotv/net/SeriesDetailActivity;ILp6/c;I)V

    .line 55
    .line 56
    .line 57
    invoke-static {v8, v9, v1}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-ne v2, v0, :cond_2

    .line 62
    .line 63
    move-object v6, v0

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    :goto_0
    check-cast v2, Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 66
    .line 67
    iput-object v2, v7, Lcom/exotv/net/SeriesDetailActivity;->g0:Ljava/util/List;

    .line 68
    .line 69
    iput v3, v7, Lcom/exotv/net/SeriesDetailActivity;->h0:I

    .line 70
    .line 71
    invoke-virtual {v7}, Lcom/exotv/net/SeriesDetailActivity;->C()V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :goto_1
    const-string v2, "SeriesDetailActivity"

    .line 76
    .line 77
    const-string v3, "episodes load failed"

    .line 78
    .line 79
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 80
    .line 81
    .line 82
    iput-boolean v5, v7, Lcom/exotv/net/SeriesDetailActivity;->R:Z

    .line 83
    .line 84
    iget-object v0, v7, Lcom/exotv/net/SeriesDetailActivity;->L:Landroid/widget/LinearLayout;

    .line 85
    .line 86
    const-string v2, "episodeBox"

    .line 87
    .line 88
    if-eqz v0, :cond_4

    .line 89
    .line 90
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 91
    .line 92
    .line 93
    iget-object v0, v7, Lcom/exotv/net/SeriesDetailActivity;->L:Landroid/widget/LinearLayout;

    .line 94
    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    const v2, 0x7f110046

    .line 98
    .line 99
    .line 100
    invoke-virtual {v7, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    const-string v3, "getString(...)"

    .line 105
    .line 106
    invoke-static {v3, v2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v7, v2}, Lcom/exotv/net/SeriesDetailActivity;->y(Ljava/lang/String;)Landroid/widget/TextView;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    const/4 v12, 0x0

    .line 114
    const/16 v13, 0x3f

    .line 115
    .line 116
    const/4 v8, 0x0

    .line 117
    const/4 v9, 0x0

    .line 118
    const/4 v10, 0x0

    .line 119
    const/4 v11, 0x0

    .line 120
    invoke-static/range {v7 .. v13}, Lcom/exotv/net/SeriesDetailActivity;->x(Lcom/exotv/net/SeriesDetailActivity;IIIIII)Landroid/widget/LinearLayout$LayoutParams;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-virtual {v0, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 125
    .line 126
    .line 127
    :goto_2
    return-object v6

    .line 128
    :cond_3
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v4

    .line 132
    :cond_4
    invoke-static {v2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v4

    .line 136
    :pswitch_0
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 137
    .line 138
    iget v6, v1, Lw4/c1;->o:I

    .line 139
    .line 140
    if-eqz v6, :cond_6

    .line 141
    .line 142
    if-ne v6, v3, :cond_5

    .line 143
    .line 144
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    move-object/from16 v2, p1

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 151
    .line 152
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v0

    .line 156
    :cond_6
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    sget-object v2, Lx4/k;->a:Lx4/k;

    .line 160
    .line 161
    iget-object v2, v1, Lw4/c1;->p:Lcom/exotv/net/SeriesDetailActivity;

    .line 162
    .line 163
    iget-wide v6, v2, Lcom/exotv/net/SeriesDetailActivity;->b0:J

    .line 164
    .line 165
    iget v2, v1, Lw4/c1;->q:I

    .line 166
    .line 167
    new-instance v8, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    const-string v9, "https://api.themoviedb.org/3/tv/"

    .line 170
    .line 171
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v8, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const-string v6, "/season/"

    .line 178
    .line 179
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    const-string v6, "url"

    .line 190
    .line 191
    invoke-static {v6, v2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    const/16 v6, 0x3f

    .line 195
    .line 196
    invoke-static {v2, v6}, Lh7/h;->v0(Ljava/lang/CharSequence;C)Z

    .line 197
    .line 198
    .line 199
    move-result v6

    .line 200
    if-eqz v6, :cond_7

    .line 201
    .line 202
    const-string v6, "&"

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_7
    const-string v6, "?"

    .line 206
    .line 207
    :goto_3
    sget-object v7, Lb5/h;->a:Lb5/i;

    .line 208
    .line 209
    if-eqz v7, :cond_8

    .line 210
    .line 211
    iget-object v7, v7, Lb5/i;->r:Ljava/lang/String;

    .line 212
    .line 213
    if-nez v7, :cond_9

    .line 214
    .line 215
    :cond_8
    const-string v7, "4e44d9029b1270a757cddc766a1bcb63"

    .line 216
    .line 217
    :cond_9
    new-instance v8, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    const-string v2, "api_key="

    .line 229
    .line 230
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    iput v3, v1, Lw4/c1;->o:I

    .line 241
    .line 242
    invoke-static {v2, v1}, Lx4/k;->f(Ljava/lang/String;Lr6/h;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    if-ne v2, v0, :cond_a

    .line 247
    .line 248
    goto/16 :goto_d

    .line 249
    .line 250
    :cond_a
    :goto_4
    check-cast v2, Ljava/lang/String;

    .line 251
    .line 252
    new-instance v0, Lorg/json/JSONObject;

    .line 253
    .line 254
    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    const-string v2, "episodes"

    .line 258
    .line 259
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    if-nez v0, :cond_b

    .line 264
    .line 265
    sget-object v0, Lm6/p;->j:Lm6/p;

    .line 266
    .line 267
    goto/16 :goto_d

    .line 268
    .line 269
    :cond_b
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    invoke-static {v5, v2}, Lcom/bumptech/glide/c;->g0(II)Le7/c;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    new-instance v3, Ljava/util/ArrayList;

    .line 278
    .line 279
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2}, Le7/a;->iterator()Ljava/util/Iterator;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    :cond_c
    :goto_5
    move-object v6, v2

    .line 287
    check-cast v6, Le7/b;

    .line 288
    .line 289
    iget-boolean v7, v6, Le7/b;->l:Z

    .line 290
    .line 291
    if-eqz v7, :cond_12

    .line 292
    .line 293
    invoke-virtual {v6}, Le7/b;->nextInt()I

    .line 294
    .line 295
    .line 296
    move-result v6

    .line 297
    invoke-virtual {v0, v6}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 298
    .line 299
    .line 300
    move-result-object v6

    .line 301
    if-nez v6, :cond_d

    .line 302
    .line 303
    :goto_6
    move-object v8, v4

    .line 304
    goto/16 :goto_9

    .line 305
    .line 306
    :cond_d
    const-string v7, "episode_number"

    .line 307
    .line 308
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 309
    .line 310
    .line 311
    move-result v9

    .line 312
    if-gtz v9, :cond_e

    .line 313
    .line 314
    goto :goto_6

    .line 315
    :cond_e
    const-string v7, "name"

    .line 316
    .line 317
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v7

    .line 321
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 322
    .line 323
    .line 324
    move-result v8

    .line 325
    if-nez v8, :cond_f

    .line 326
    .line 327
    const-string v7, "Episode "

    .line 328
    .line 329
    invoke-static {v9, v7}, La1/a1;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v7

    .line 333
    :cond_f
    move-object v10, v7

    .line 334
    const-string v7, "ifEmpty(...)"

    .line 335
    .line 336
    invoke-static {v7, v10}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    const-string v7, "still_path"

    .line 340
    .line 341
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v7

    .line 345
    invoke-static {v7}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 349
    .line 350
    .line 351
    move-result v8

    .line 352
    const-string v11, "null"

    .line 353
    .line 354
    if-lez v8, :cond_10

    .line 355
    .line 356
    invoke-virtual {v7, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v8

    .line 360
    if-nez v8, :cond_10

    .line 361
    .line 362
    goto :goto_7

    .line 363
    :cond_10
    move-object v7, v4

    .line 364
    :goto_7
    const-string v8, "runtime"

    .line 365
    .line 366
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 367
    .line 368
    .line 369
    move-result v12

    .line 370
    const-string v8, "overview"

    .line 371
    .line 372
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v13

    .line 376
    const-string v8, "optString(...)"

    .line 377
    .line 378
    invoke-static {v8, v13}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    const-string v8, "air_date"

    .line 382
    .line 383
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v6

    .line 387
    invoke-static {v6}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    invoke-static {v6}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 391
    .line 392
    .line 393
    move-result v8

    .line 394
    if-nez v8, :cond_11

    .line 395
    .line 396
    invoke-virtual {v6, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v8

    .line 400
    if-nez v8, :cond_11

    .line 401
    .line 402
    move-object v14, v6

    .line 403
    goto :goto_8

    .line 404
    :cond_11
    move-object v14, v4

    .line 405
    :goto_8
    new-instance v8, Lw4/a1;

    .line 406
    .line 407
    move v15, v9

    .line 408
    move-object v11, v7

    .line 409
    invoke-direct/range {v8 .. v15}, Lw4/a1;-><init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 410
    .line 411
    .line 412
    :goto_9
    if-eqz v8, :cond_c

    .line 413
    .line 414
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    goto/16 :goto_5

    .line 418
    .line 419
    :cond_12
    new-instance v0, Ls/d;

    .line 420
    .line 421
    const/4 v2, 0x3

    .line 422
    invoke-direct {v0, v2}, Ls/d;-><init>(I)V

    .line 423
    .line 424
    .line 425
    invoke-static {v3, v0}, Lm6/h;->J0(Ljava/util/ArrayList;Ljava/util/Comparator;)Ljava/util/List;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    new-instance v2, Ljava/util/ArrayList;

    .line 430
    .line 431
    invoke-static {v0}, Lm6/j;->w0(Ljava/lang/Iterable;)I

    .line 432
    .line 433
    .line 434
    move-result v3

    .line 435
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 436
    .line 437
    .line 438
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 443
    .line 444
    .line 445
    move-result v6

    .line 446
    if-eqz v6, :cond_13

    .line 447
    .line 448
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v6

    .line 452
    check-cast v6, Lw4/a1;

    .line 453
    .line 454
    iget v6, v6, Lw4/a1;->g:I

    .line 455
    .line 456
    new-instance v7, Ljava/lang/Integer;

    .line 457
    .line 458
    invoke-direct {v7, v6}, Ljava/lang/Integer;-><init>(I)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    goto :goto_a

    .line 465
    :cond_13
    new-instance v3, Ljava/util/ArrayList;

    .line 466
    .line 467
    invoke-static {v2}, Lm6/j;->w0(Ljava/lang/Iterable;)I

    .line 468
    .line 469
    .line 470
    move-result v6

    .line 471
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 475
    .line 476
    .line 477
    move-result v6

    .line 478
    move v7, v5

    .line 479
    move v8, v7

    .line 480
    :goto_b
    if-ge v8, v6, :cond_15

    .line 481
    .line 482
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v9

    .line 486
    add-int/lit8 v8, v8, 0x1

    .line 487
    .line 488
    add-int/lit8 v10, v7, 0x1

    .line 489
    .line 490
    if-ltz v7, :cond_14

    .line 491
    .line 492
    check-cast v9, Ljava/lang/Number;

    .line 493
    .line 494
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 495
    .line 496
    .line 497
    move-result v7

    .line 498
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 499
    .line 500
    .line 501
    move-result-object v9

    .line 502
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 503
    .line 504
    .line 505
    move-result-object v7

    .line 506
    new-instance v11, Ll6/d;

    .line 507
    .line 508
    invoke-direct {v11, v9, v7}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    move v7, v10

    .line 515
    goto :goto_b

    .line 516
    :cond_14
    invoke-static {}, Lm6/i;->v0()V

    .line 517
    .line 518
    .line 519
    throw v4

    .line 520
    :cond_15
    new-instance v2, Ljava/util/ArrayList;

    .line 521
    .line 522
    invoke-static {v3}, Lm6/j;->w0(Ljava/lang/Iterable;)I

    .line 523
    .line 524
    .line 525
    move-result v6

    .line 526
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 530
    .line 531
    .line 532
    move-result v6

    .line 533
    move v7, v5

    .line 534
    :goto_c
    if-ge v7, v6, :cond_17

    .line 535
    .line 536
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v8

    .line 540
    add-int/lit8 v7, v7, 0x1

    .line 541
    .line 542
    add-int/lit8 v9, v5, 0x1

    .line 543
    .line 544
    if-ltz v5, :cond_16

    .line 545
    .line 546
    check-cast v8, Ll6/d;

    .line 547
    .line 548
    iget-object v10, v8, Ll6/d;->j:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast v10, Ljava/lang/Number;

    .line 551
    .line 552
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 553
    .line 554
    .line 555
    move-result v12

    .line 556
    iget-object v8, v8, Ll6/d;->k:Ljava/lang/Object;

    .line 557
    .line 558
    check-cast v8, Ljava/lang/Number;

    .line 559
    .line 560
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 561
    .line 562
    .line 563
    move-result v18

    .line 564
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v5

    .line 568
    check-cast v5, Lw4/a1;

    .line 569
    .line 570
    iget-object v13, v5, Lw4/a1;->b:Ljava/lang/String;

    .line 571
    .line 572
    iget-object v14, v5, Lw4/a1;->c:Ljava/lang/String;

    .line 573
    .line 574
    iget v15, v5, Lw4/a1;->d:I

    .line 575
    .line 576
    iget-object v8, v5, Lw4/a1;->e:Ljava/lang/String;

    .line 577
    .line 578
    iget-object v5, v5, Lw4/a1;->f:Ljava/lang/String;

    .line 579
    .line 580
    new-instance v11, Lw4/a1;

    .line 581
    .line 582
    move-object/from16 v17, v5

    .line 583
    .line 584
    move-object/from16 v16, v8

    .line 585
    .line 586
    invoke-direct/range {v11 .. v18}, Lw4/a1;-><init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    move v5, v9

    .line 593
    goto :goto_c

    .line 594
    :cond_16
    invoke-static {}, Lm6/i;->v0()V

    .line 595
    .line 596
    .line 597
    throw v4

    .line 598
    :cond_17
    move-object v0, v2

    .line 599
    :goto_d
    return-object v0

    .line 600
    nop

    .line 601
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
