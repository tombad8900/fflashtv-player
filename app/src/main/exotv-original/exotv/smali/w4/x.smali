.class public final Lw4/x;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public final synthetic n:I

.field public o:I

.field public final synthetic p:Lcom/exotv/net/model/Channel;

.field public final synthetic q:Lcom/exotv/net/MainActivity;


# direct methods
.method public constructor <init>(Lcom/exotv/net/MainActivity;Lcom/exotv/net/model/Channel;Lp6/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lw4/x;->n:I

    .line 1
    iput-object p1, p0, Lw4/x;->q:Lcom/exotv/net/MainActivity;

    iput-object p2, p0, Lw4/x;->p:Lcom/exotv/net/model/Channel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lr6/h;-><init>(ILp6/c;)V

    return-void
.end method

.method public constructor <init>(Lcom/exotv/net/model/Channel;Lcom/exotv/net/MainActivity;Lp6/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lw4/x;->n:I

    .line 2
    iput-object p1, p0, Lw4/x;->p:Lcom/exotv/net/model/Channel;

    iput-object p2, p0, Lw4/x;->q:Lcom/exotv/net/MainActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lr6/h;-><init>(ILp6/c;)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lw4/x;->n:I

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
    invoke-virtual {p0, p1, p2}, Lw4/x;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lw4/x;

    .line 15
    .line 16
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lw4/x;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lw4/x;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lw4/x;

    .line 28
    .line 29
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lw4/x;->h(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 2

    .line 1
    iget p1, p0, Lw4/x;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lw4/x;

    .line 7
    .line 8
    iget-object v0, p0, Lw4/x;->p:Lcom/exotv/net/model/Channel;

    .line 9
    .line 10
    iget-object v1, p0, Lw4/x;->q:Lcom/exotv/net/MainActivity;

    .line 11
    .line 12
    invoke-direct {p1, v0, v1, p2}, Lw4/x;-><init>(Lcom/exotv/net/model/Channel;Lcom/exotv/net/MainActivity;Lp6/c;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    new-instance p1, Lw4/x;

    .line 17
    .line 18
    iget-object v0, p0, Lw4/x;->q:Lcom/exotv/net/MainActivity;

    .line 19
    .line 20
    iget-object v1, p0, Lw4/x;->p:Lcom/exotv/net/model/Channel;

    .line 21
    .line 22
    invoke-direct {p1, v0, v1, p2}, Lw4/x;-><init>(Lcom/exotv/net/MainActivity;Lcom/exotv/net/model/Channel;Lp6/c;)V

    .line 23
    .line 24
    .line 25
    return-object p1

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lw4/x;->n:I

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, Lw4/x;->q:Lcom/exotv/net/MainActivity;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, p0, Lw4/x;->p:Lcom/exotv/net/model/Channel;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 15
    .line 16
    iget v6, p0, Lw4/x;->o:I

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v3, :cond_0

    .line 21
    .line 22
    :try_start_0
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :try_start_1
    sget-object p1, Li7/e0;->a:Lo7/e;

    .line 38
    .line 39
    sget-object p1, Lo7/d;->l:Lo7/d;

    .line 40
    .line 41
    new-instance v1, Lw4/x;

    .line 42
    .line 43
    invoke-direct {v1, v2, v4, v5}, Lw4/x;-><init>(Lcom/exotv/net/MainActivity;Lcom/exotv/net/model/Channel;Lp6/c;)V

    .line 44
    .line 45
    .line 46
    iput v3, p0, Lw4/x;->o:I

    .line 47
    .line 48
    invoke-static {p1, v1, p0}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v0, :cond_2

    .line 53
    .line 54
    goto/16 :goto_9

    .line 55
    .line 56
    :cond_2
    :goto_0
    check-cast p1, Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :goto_1
    invoke-virtual {v4}, Lcom/exotv/net/model/Channel;->getDisplayName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v6, "resolve threw for \'"

    .line 66
    .line 67
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v0, "\'"

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const-string v1, "MainActivity"

    .line 83
    .line 84
    invoke-static {v1, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 85
    .line 86
    .line 87
    sget-object p1, Lm6/p;->j:Lm6/p;

    .line 88
    .line 89
    :goto_2
    const/4 v0, 0x0

    .line 90
    iput-boolean v0, v2, Lcom/exotv/net/MainActivity;->W:Z

    .line 91
    .line 92
    sget-object v1, Lw4/q;->j:Lw4/q;

    .line 93
    .line 94
    invoke-virtual {v2, v0, v5, v0, v1}, Lcom/exotv/net/MainActivity;->T(ZLjava/lang/String;ZLw4/q;)V

    .line 95
    .line 96
    .line 97
    invoke-static {p1}, Lm6/h;->B0(Ljava/util/List;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, Lcom/exotv/net/model/ResolvedStream;

    .line 102
    .line 103
    sget-object v5, Ll6/j;->a:Ll6/j;

    .line 104
    .line 105
    if-eqz v1, :cond_b

    .line 106
    .line 107
    invoke-virtual {v1}, Lcom/exotv/net/model/ResolvedStream;->getUrl()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-static {v6}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-eqz v6, :cond_3

    .line 116
    .line 117
    goto/16 :goto_8

    .line 118
    .line 119
    :cond_3
    new-instance v3, Landroid/content/Intent;

    .line 120
    .line 121
    const-class v6, Lcom/exotv/net/PlayerActivity;

    .line 122
    .line 123
    invoke-direct {v3, v2, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 124
    .line 125
    .line 126
    const-string v6, "exo_url"

    .line 127
    .line 128
    invoke-virtual {v1}, Lcom/exotv/net/model/ResolvedStream;->getUrl()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    invoke-virtual {v3, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 133
    .line 134
    .line 135
    const-string v6, "exo_title"

    .line 136
    .line 137
    invoke-virtual {v4}, Lcom/exotv/net/model/Channel;->getDisplayName()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    invoke-virtual {v3, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1}, Lcom/exotv/net/model/ResolvedStream;->getHeaders()Ljava/util/Map;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    new-instance v6, Lorg/json/JSONObject;

    .line 149
    .line 150
    invoke-direct {v6, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    const-string v6, "toString(...)"

    .line 158
    .line 159
    invoke-static {v6, v1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    const-string v7, "exo_headers"

    .line 163
    .line 164
    invoke-virtual {v3, v7, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4}, Lcom/exotv/net/model/Channel;->getBackups()Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    const-string v4, "apiBackups"

    .line 172
    .line 173
    invoke-static {v4, v1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    new-instance v4, Ljava/util/HashSet;

    .line 177
    .line 178
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 179
    .line 180
    .line 181
    new-instance v7, Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 184
    .line 185
    .line 186
    move-result v8

    .line 187
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 188
    .line 189
    .line 190
    move-result v9

    .line 191
    add-int/2addr v9, v8

    .line 192
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 193
    .line 194
    .line 195
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    :cond_4
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v8

    .line 203
    if-eqz v8, :cond_5

    .line 204
    .line 205
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    check-cast v8, Lcom/exotv/net/model/ResolvedStream;

    .line 210
    .line 211
    invoke-virtual {v8}, Lcom/exotv/net/model/ResolvedStream;->getUrl()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v9

    .line 215
    invoke-static {v9}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 216
    .line 217
    .line 218
    move-result v9

    .line 219
    if-nez v9, :cond_4

    .line 220
    .line 221
    invoke-virtual {v8}, Lcom/exotv/net/model/ResolvedStream;->getUrl()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v9

    .line 225
    invoke-virtual {v4, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v9

    .line 229
    if-eqz v9, :cond_4

    .line 230
    .line 231
    new-instance v9, Lcom/exotv/net/model/BackupSource;

    .line 232
    .line 233
    invoke-virtual {v8}, Lcom/exotv/net/model/ResolvedStream;->getUrl()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v10

    .line 237
    invoke-virtual {v8}, Lcom/exotv/net/model/ResolvedStream;->getHeaders()Ljava/util/Map;

    .line 238
    .line 239
    .line 240
    move-result-object v11

    .line 241
    invoke-virtual {v8}, Lcom/exotv/net/model/ResolvedStream;->getName()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    invoke-direct {v9, v10, v11, v8}, Lcom/exotv/net/model/BackupSource;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    goto :goto_3

    .line 252
    :cond_5
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    :cond_6
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    if-eqz v1, :cond_7

    .line 261
    .line 262
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    check-cast v1, Lcom/exotv/net/model/BackupSource;

    .line 267
    .line 268
    invoke-virtual {v1}, Lcom/exotv/net/model/BackupSource;->getUrl()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v8

    .line 272
    invoke-static {v8}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 273
    .line 274
    .line 275
    move-result v8

    .line 276
    if-nez v8, :cond_6

    .line 277
    .line 278
    invoke-virtual {v1}, Lcom/exotv/net/model/BackupSource;->getUrl()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v8

    .line 282
    invoke-virtual {v4, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v8

    .line 286
    if-eqz v8, :cond_6

    .line 287
    .line 288
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    goto :goto_4

    .line 292
    :cond_7
    new-instance p1, Lorg/json/JSONArray;

    .line 293
    .line 294
    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    :goto_5
    if-ge v0, v1, :cond_a

    .line 302
    .line 303
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    add-int/lit8 v0, v0, 0x1

    .line 308
    .line 309
    check-cast v4, Lcom/exotv/net/model/BackupSource;

    .line 310
    .line 311
    new-instance v8, Lorg/json/JSONObject;

    .line 312
    .line 313
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v4}, Lcom/exotv/net/model/BackupSource;->getHeaders()Ljava/util/Map;

    .line 317
    .line 318
    .line 319
    move-result-object v9

    .line 320
    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 321
    .line 322
    .line 323
    move-result-object v9

    .line 324
    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 325
    .line 326
    .line 327
    move-result-object v9

    .line 328
    :goto_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 329
    .line 330
    .line 331
    move-result v10

    .line 332
    if-eqz v10, :cond_8

    .line 333
    .line 334
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v10

    .line 338
    check-cast v10, Ljava/util/Map$Entry;

    .line 339
    .line 340
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v11

    .line 344
    check-cast v11, Ljava/lang/String;

    .line 345
    .line 346
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v10

    .line 350
    check-cast v10, Ljava/lang/String;

    .line 351
    .line 352
    invoke-virtual {v8, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 353
    .line 354
    .line 355
    goto :goto_6

    .line 356
    :cond_8
    new-instance v9, Lorg/json/JSONObject;

    .line 357
    .line 358
    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 359
    .line 360
    .line 361
    const-string v10, "url"

    .line 362
    .line 363
    invoke-virtual {v4}, Lcom/exotv/net/model/BackupSource;->getUrl()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v11

    .line 367
    invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 368
    .line 369
    .line 370
    move-result-object v9

    .line 371
    const-string v10, "headers"

    .line 372
    .line 373
    invoke-virtual {v9, v10, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 374
    .line 375
    .line 376
    move-result-object v8

    .line 377
    invoke-virtual {v4}, Lcom/exotv/net/model/BackupSource;->getName()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v9

    .line 381
    if-eqz v9, :cond_9

    .line 382
    .line 383
    const-string v9, "name"

    .line 384
    .line 385
    invoke-virtual {v4}, Lcom/exotv/net/model/BackupSource;->getName()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v4

    .line 389
    invoke-virtual {v8, v9, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 390
    .line 391
    .line 392
    :cond_9
    invoke-virtual {p1, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 393
    .line 394
    .line 395
    goto :goto_5

    .line 396
    :cond_a
    invoke-virtual {p1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object p1

    .line 400
    invoke-static {v6, p1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    const-string v0, "exo_backups"

    .line 404
    .line 405
    invoke-virtual {v3, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 406
    .line 407
    .line 408
    invoke-static {v2, v3}, Landroid/support/v4/media/session/b;->L(Landroid/app/Activity;Landroid/content/Intent;)V

    .line 409
    .line 410
    .line 411
    :goto_7
    move-object v0, v5

    .line 412
    goto :goto_9

    .line 413
    :cond_b
    :goto_8
    invoke-virtual {v4}, Lcom/exotv/net/model/Channel;->getDisplayName()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object p1

    .line 417
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object p1

    .line 421
    const v0, 0x7f110110

    .line 422
    .line 423
    .line 424
    invoke-virtual {v2, v0, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object p1

    .line 428
    invoke-static {v2, p1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 429
    .line 430
    .line 431
    move-result-object p1

    .line 432
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 433
    .line 434
    .line 435
    goto :goto_7

    .line 436
    :goto_9
    return-object v0

    .line 437
    :pswitch_0
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 438
    .line 439
    iget v6, p0, Lw4/x;->o:I

    .line 440
    .line 441
    if-eqz v6, :cond_d

    .line 442
    .line 443
    if-ne v6, v3, :cond_c

    .line 444
    .line 445
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    goto :goto_a

    .line 449
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 450
    .line 451
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    throw p1

    .line 455
    :cond_d
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 456
    .line 457
    .line 458
    iget-object p1, v2, Lcom/exotv/net/MainActivity;->Q:Ll/o;

    .line 459
    .line 460
    if-eqz p1, :cond_f

    .line 461
    .line 462
    iput v3, p0, Lw4/x;->o:I

    .line 463
    .line 464
    invoke-virtual {p1, v4, p0}, Ll/o;->x(Lcom/exotv/net/model/Channel;Lr6/c;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object p1

    .line 468
    if-ne p1, v0, :cond_e

    .line 469
    .line 470
    move-object p1, v0

    .line 471
    :cond_e
    :goto_a
    return-object p1

    .line 472
    :cond_f
    const-string p1, "resolver"

    .line 473
    .line 474
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    throw v5

    .line 478
    nop

    .line 479
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
