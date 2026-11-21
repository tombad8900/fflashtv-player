.class public final Lc5/i;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public n:J

.field public o:I

.field public final synthetic p:Ly6/a;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:I

.field public final synthetic s:I

.field public final synthetic t:Lb/l;

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:I


# direct methods
.method public constructor <init>(Ly6/a;Ljava/lang/String;IILb/l;Ljava/lang/String;ILp6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc5/i;->p:Ly6/a;

    .line 2
    .line 3
    iput-object p2, p0, Lc5/i;->q:Ljava/lang/String;

    .line 4
    .line 5
    iput p3, p0, Lc5/i;->r:I

    .line 6
    .line 7
    iput p4, p0, Lc5/i;->s:I

    .line 8
    .line 9
    iput-object p5, p0, Lc5/i;->t:Lb/l;

    .line 10
    .line 11
    iput-object p6, p0, Lc5/i;->u:Ljava/lang/String;

    .line 12
    .line 13
    iput p7, p0, Lc5/i;->v:I

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Lr6/h;-><init>(ILp6/c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Li7/u;

    .line 2
    .line 3
    check-cast p2, Lp6/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lc5/i;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lc5/i;

    .line 10
    .line 11
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lc5/i;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final g(Ljava/lang/Object;Lp6/c;)Lp6/c;
    .locals 9

    .line 1
    new-instance v0, Lc5/i;

    .line 2
    .line 3
    iget-object v6, p0, Lc5/i;->u:Ljava/lang/String;

    .line 4
    .line 5
    iget v7, p0, Lc5/i;->v:I

    .line 6
    .line 7
    iget-object v1, p0, Lc5/i;->p:Ly6/a;

    .line 8
    .line 9
    iget-object v2, p0, Lc5/i;->q:Ljava/lang/String;

    .line 10
    .line 11
    iget v3, p0, Lc5/i;->r:I

    .line 12
    .line 13
    iget v4, p0, Lc5/i;->s:I

    .line 14
    .line 15
    iget-object v5, p0, Lc5/i;->t:Lb/l;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, Lc5/i;-><init>(Ly6/a;Ljava/lang/String;IILb/l;Ljava/lang/String;ILp6/c;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    sget-object v0, Ll6/j;->a:Ll6/j;

    .line 2
    .line 3
    sget-object v1, Lq6/a;->j:Lq6/a;

    .line 4
    .line 5
    iget v2, p0, Lc5/i;->o:I

    .line 6
    .line 7
    const-wide/32 v3, 0x15f90

    .line 8
    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    if-ne v2, v5, :cond_0

    .line 14
    .line 15
    iget-wide v1, p0, Lc5/i;->n:J

    .line 16
    .line 17
    :try_start_0
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    move-object p1, v0

    .line 23
    goto/16 :goto_6

    .line 24
    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 37
    .line 38
    .line 39
    move-result-wide v6

    .line 40
    :try_start_1
    new-instance v8, Lc5/h;

    .line 41
    .line 42
    iget-object v9, p0, Lc5/i;->t:Lb/l;

    .line 43
    .line 44
    iget-object v10, p0, Lc5/i;->q:Ljava/lang/String;

    .line 45
    .line 46
    iget v11, p0, Lc5/i;->r:I

    .line 47
    .line 48
    iget v12, p0, Lc5/i;->s:I

    .line 49
    .line 50
    const/4 v13, 0x0

    .line 51
    invoke-direct/range {v8 .. v13}, Lc5/h;-><init>(Lb/l;Ljava/lang/String;IILp6/c;)V

    .line 52
    .line 53
    .line 54
    iput-wide v6, p0, Lc5/i;->n:J

    .line 55
    .line 56
    iput v5, p0, Lc5/i;->o:I

    .line 57
    .line 58
    invoke-static {v3, v4, v8, p0}, Li7/x;->s(JLy6/p;Lr6/c;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v1, :cond_2

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_2
    move-wide v1, v6

    .line 66
    :goto_0
    check-cast p1, Lz4/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    .line 68
    iget-object v6, p0, Lc5/i;->p:Ly6/a;

    .line 69
    .line 70
    invoke-interface {v6}, Ly6/a;->invoke()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 74
    .line 75
    .line 76
    move-result-wide v6

    .line 77
    sub-long/2addr v6, v1

    .line 78
    const-string v1, "AutoPlay"

    .line 79
    .line 80
    if-nez p1, :cond_3

    .line 81
    .line 82
    new-instance v2, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v8, "resolve gave nothing after "

    .line 85
    .line 86
    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v8, "ms"

    .line 93
    .line 94
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    :cond_3
    if-nez p1, :cond_4

    .line 105
    .line 106
    cmp-long v2, v6, v3

    .line 107
    .line 108
    if-ltz v2, :cond_4

    .line 109
    .line 110
    iget-object v2, p0, Lc5/i;->q:Ljava/lang/String;

    .line 111
    .line 112
    iget v3, p0, Lc5/i;->r:I

    .line 113
    .line 114
    iget v4, p0, Lc5/i;->s:I

    .line 115
    .line 116
    new-instance v6, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string v7, "resolve was cut off at its 90000ms ceiling: "

    .line 119
    .line 120
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v2, " s"

    .line 127
    .line 128
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string v2, " e"

    .line 135
    .line 136
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 147
    .line 148
    .line 149
    :cond_4
    iget-object v1, p0, Lc5/i;->t:Lb/l;

    .line 150
    .line 151
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-nez v1, :cond_f

    .line 156
    .line 157
    iget-object v1, p0, Lc5/i;->t:Lb/l;

    .line 158
    .line 159
    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-eqz v1, :cond_5

    .line 164
    .line 165
    goto/16 :goto_5

    .line 166
    .line 167
    :cond_5
    if-eqz p1, :cond_c

    .line 168
    .line 169
    iget-object v1, p1, Lz4/n;->a:Ljava/util/List;

    .line 170
    .line 171
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-eqz v1, :cond_6

    .line 176
    .line 177
    goto/16 :goto_2

    .line 178
    .line 179
    :cond_6
    iget-object v1, p0, Lc5/i;->t:Lb/l;

    .line 180
    .line 181
    iget-object v2, p0, Lc5/i;->q:Ljava/lang/String;

    .line 182
    .line 183
    iget-object v3, p0, Lc5/i;->u:Ljava/lang/String;

    .line 184
    .line 185
    iget v4, p0, Lc5/i;->r:I

    .line 186
    .line 187
    iget v5, p0, Lc5/i;->s:I

    .line 188
    .line 189
    iget v6, p0, Lc5/i;->v:I

    .line 190
    .line 191
    new-instance v7, Landroid/content/Intent;

    .line 192
    .line 193
    const-class v8, Lcom/exotv/net/PlayerActivity;

    .line 194
    .line 195
    invoke-direct {v7, v1, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 196
    .line 197
    .line 198
    iget-object v8, p1, Lz4/n;->a:Ljava/util/List;

    .line 199
    .line 200
    iget-object v9, p1, Lz4/n;->c:Ljava/util/Map;

    .line 201
    .line 202
    invoke-static {v8}, Lm6/h;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v8

    .line 206
    check-cast v8, Ljava/lang/String;

    .line 207
    .line 208
    const-string v10, "exo_url"

    .line 209
    .line 210
    invoke-virtual {v7, v10, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 211
    .line 212
    .line 213
    new-instance v8, Lorg/json/JSONArray;

    .line 214
    .line 215
    iget-object v10, p1, Lz4/n;->a:Ljava/util/List;

    .line 216
    .line 217
    invoke-direct {v8, v10}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v8}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v8

    .line 224
    const-string v10, "exo_backups"

    .line 225
    .line 226
    invoke-virtual {v7, v10, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 227
    .line 228
    .line 229
    const-string v8, "exo_referer"

    .line 230
    .line 231
    iget-object v10, p1, Lz4/n;->b:Ljava/lang/String;

    .line 232
    .line 233
    invoke-virtual {v7, v8, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 234
    .line 235
    .line 236
    const-string v8, "exo_title"

    .line 237
    .line 238
    invoke-virtual {v7, v8, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 239
    .line 240
    .line 241
    const-string v3, "exo_tmdb_id"

    .line 242
    .line 243
    invoke-virtual {v7, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 244
    .line 245
    .line 246
    const-string v2, "exo_season"

    .line 247
    .line 248
    invoke-virtual {v7, v2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 249
    .line 250
    .line 251
    const-string v2, "exo_episode"

    .line 252
    .line 253
    invoke-virtual {v7, v2, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 254
    .line 255
    .line 256
    if-lez v6, :cond_7

    .line 257
    .line 258
    const-string v2, "exo_episode_tmdb"

    .line 259
    .line 260
    invoke-virtual {v7, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 261
    .line 262
    .line 263
    :cond_7
    iget-object v2, p1, Lz4/n;->d:Ljava/lang/String;

    .line 264
    .line 265
    if-eqz v2, :cond_8

    .line 266
    .line 267
    const-string v3, "exo_file_name"

    .line 268
    .line 269
    invoke-virtual {v7, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 270
    .line 271
    .line 272
    :cond_8
    iget-object p1, p1, Lz4/n;->e:Ljava/lang/String;

    .line 273
    .line 274
    if-eqz p1, :cond_9

    .line 275
    .line 276
    const-string v2, "exo_imdb_id"

    .line 277
    .line 278
    invoke-virtual {v7, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 279
    .line 280
    .line 281
    :cond_9
    invoke-interface {v9}, Ljava/util/Map;->isEmpty()Z

    .line 282
    .line 283
    .line 284
    move-result p1

    .line 285
    if-nez p1, :cond_b

    .line 286
    .line 287
    new-instance p1, Lorg/json/JSONObject;

    .line 288
    .line 289
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 290
    .line 291
    .line 292
    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    if-eqz v3, :cond_a

    .line 305
    .line 306
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    check-cast v3, Ljava/util/Map$Entry;

    .line 311
    .line 312
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    check-cast v4, Ljava/lang/String;

    .line 317
    .line 318
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    check-cast v3, Ljava/lang/String;

    .line 323
    .line 324
    invoke-virtual {p1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 325
    .line 326
    .line 327
    goto :goto_1

    .line 328
    :cond_a
    const-string v2, "exo_headers"

    .line 329
    .line 330
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object p1

    .line 334
    invoke-virtual {v7, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 335
    .line 336
    .line 337
    :cond_b
    invoke-static {v1, v7}, Landroid/support/v4/media/session/b;->L(Landroid/app/Activity;Landroid/content/Intent;)V

    .line 338
    .line 339
    .line 340
    return-object v0

    .line 341
    :cond_c
    :goto_2
    sget-object p1, Lz4/g0;->a:Lz4/g0;

    .line 342
    .line 343
    sget-object p1, Lz4/g0;->c:Lz4/l;

    .line 344
    .line 345
    if-nez p1, :cond_d

    .line 346
    .line 347
    const/4 p1, -0x1

    .line 348
    goto :goto_3

    .line 349
    :cond_d
    sget-object v1, Lc5/g;->a:[I

    .line 350
    .line 351
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 352
    .line 353
    .line 354
    move-result p1

    .line 355
    aget p1, v1, p1

    .line 356
    .line 357
    :goto_3
    if-ne p1, v5, :cond_e

    .line 358
    .line 359
    const p1, 0x7f110025

    .line 360
    .line 361
    .line 362
    goto :goto_4

    .line 363
    :cond_e
    const p1, 0x7f110024

    .line 364
    .line 365
    .line 366
    :goto_4
    iget-object v1, p0, Lc5/i;->t:Lb/l;

    .line 367
    .line 368
    invoke-static {v1, p1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 373
    .line 374
    .line 375
    :cond_f
    :goto_5
    return-object v0

    .line 376
    :goto_6
    iget-object v0, p0, Lc5/i;->p:Ly6/a;

    .line 377
    .line 378
    invoke-interface {v0}, Ly6/a;->invoke()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    throw p1
.end method
