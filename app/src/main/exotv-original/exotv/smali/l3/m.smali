.class public final Ll3/m;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ll3/h;


# static fields
.field public static final f:Lokhttp3/e;

.field public static final g:Lokhttp3/e;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lr3/o;

.field public final c:Ll6/g;

.field public final d:Ll6/g;

.field public final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lokhttp3/e$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lokhttp3/e$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lokhttp3/e$a;->noCache()Lokhttp3/e$a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lokhttp3/e$a;->noStore()Lokhttp3/e$a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lokhttp3/e$a;->build()Lokhttp3/e;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Ll3/m;->f:Lokhttp3/e;

    .line 19
    .line 20
    new-instance v0, Lokhttp3/e$a;

    .line 21
    .line 22
    invoke-direct {v0}, Lokhttp3/e$a;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lokhttp3/e$a;->noCache()Lokhttp3/e$a;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lokhttp3/e$a;->onlyIfCached()Lokhttp3/e$a;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Lokhttp3/e$a;->build()Lokhttp3/e;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Ll3/m;->g:Lokhttp3/e;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lr3/o;Ll6/g;Ll6/g;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll3/m;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ll3/m;->b:Lr3/o;

    .line 7
    .line 8
    iput-object p3, p0, Ll3/m;->c:Ll6/g;

    .line 9
    .line 10
    iput-object p4, p0, Ll3/m;->d:Ll6/g;

    .line 11
    .line 12
    iput-boolean p5, p0, Ll3/m;->e:Z

    .line 13
    .line 14
    return-void
.end method

.method public static d(Ljava/lang/String;Lokhttp3/d0;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Lokhttp3/d0;->toString()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p1, v0

    .line 10
    :goto_0
    if-eqz p1, :cond_1

    .line 11
    .line 12
    const-string v1, "text/plain"

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static {p1, v1, v2}, Lh7/p;->t0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    :cond_1
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1, p0}, Lv3/f;->b(Landroid/webkit/MimeTypeMap;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_2
    if-eqz p1, :cond_3

    .line 33
    .line 34
    const/16 p0, 0x3b

    .line 35
    .line 36
    invoke-static {p1, p0, p1}, Lh7/h;->P0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_3
    return-object v0
.end method


# virtual methods
.method public final a(Lp6/c;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p1, Ll3/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ll3/l;

    .line 7
    .line 8
    iget v1, v0, Ll3/l;->r:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ll3/l;->r:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ll3/l;

    .line 21
    .line 22
    check-cast p1, Lr6/c;

    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Ll3/l;-><init>(Ll3/m;Lr6/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v0, Ll3/l;->p:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, Lq6/a;->j:Lq6/a;

    .line 30
    .line 31
    iget v2, v0, Ll3/l;->r:I

    .line 32
    .line 33
    const-string v3, "response body == null"

    .line 34
    .line 35
    const/4 v4, 0x2

    .line 36
    const/4 v5, 0x1

    .line 37
    const/4 v6, 0x0

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v5, :cond_2

    .line 41
    .line 42
    if-ne v2, v4, :cond_1

    .line 43
    .line 44
    iget-object v1, v0, Ll3/l;->o:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Lokhttp3/i0;

    .line 47
    .line 48
    iget-object v2, v0, Ll3/l;->n:Lj3/h;

    .line 49
    .line 50
    iget-object v0, v0, Ll3/l;->m:Ll3/m;

    .line 51
    .line 52
    :try_start_0
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    goto/16 :goto_8

    .line 56
    .line 57
    :catch_0
    move-exception p1

    .line 58
    goto/16 :goto_a

    .line 59
    .line 60
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_2
    iget-object v2, v0, Ll3/l;->o:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v2, Lq3/e;

    .line 71
    .line 72
    iget-object v5, v0, Ll3/l;->n:Lj3/h;

    .line 73
    .line 74
    iget-object v7, v0, Ll3/l;->m:Ll3/m;

    .line 75
    .line 76
    :try_start_1
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 77
    .line 78
    .line 79
    move-object v12, v5

    .line 80
    move-object v5, v2

    .line 81
    move-object v2, v12

    .line 82
    goto/16 :goto_3

    .line 83
    .line 84
    :catch_1
    move-exception p1

    .line 85
    goto/16 :goto_b

    .line 86
    .line 87
    :cond_3
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, Ll3/m;->b:Lr3/o;

    .line 91
    .line 92
    iget-object v2, p1, Lr3/o;->n:Lr3/b;

    .line 93
    .line 94
    iget-boolean v2, v2, Lr3/b;->j:Z

    .line 95
    .line 96
    iget-object v7, p0, Ll3/m;->a:Ljava/lang/String;

    .line 97
    .line 98
    if-eqz v2, :cond_5

    .line 99
    .line 100
    iget-object v2, p0, Ll3/m;->d:Ll6/g;

    .line 101
    .line 102
    invoke-virtual {v2}, Ll6/g;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    check-cast v2, Lj3/i;

    .line 107
    .line 108
    if-eqz v2, :cond_5

    .line 109
    .line 110
    iget-object p1, p1, Lr3/o;->i:Ljava/lang/String;

    .line 111
    .line 112
    if-nez p1, :cond_4

    .line 113
    .line 114
    move-object p1, v7

    .line 115
    :cond_4
    iget-object v2, v2, Lj3/i;->b:Lj3/f;

    .line 116
    .line 117
    sget-object v8, Lv7/m;->m:Lv7/m;

    .line 118
    .line 119
    invoke-static {p1}, Lk2/b;->p(Ljava/lang/String;)Lv7/m;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    const-string v8, "SHA-256"

    .line 124
    .line 125
    invoke-virtual {p1, v8}, Lv7/m;->c(Ljava/lang/String;)Lv7/m;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p1}, Lv7/m;->e()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {v2, p1}, Lj3/f;->g(Ljava/lang/String;)Lj3/c;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    if-eqz p1, :cond_5

    .line 138
    .line 139
    new-instance v2, Lj3/h;

    .line 140
    .line 141
    invoke-direct {v2, p1}, Lj3/h;-><init>(Lj3/c;)V

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_5
    move-object v2, v6

    .line 146
    :goto_1
    if-eqz v2, :cond_b

    .line 147
    .line 148
    :try_start_2
    invoke-virtual {p0}, Ll3/m;->c()Lv7/p;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    iget-object v8, v2, Lj3/h;->j:Lj3/c;

    .line 153
    .line 154
    iget-boolean v9, v8, Lj3/c;->k:Z

    .line 155
    .line 156
    if-nez v9, :cond_a

    .line 157
    .line 158
    iget-object v8, v8, Lj3/c;->j:Lj3/b;

    .line 159
    .line 160
    iget-object v8, v8, Lj3/b;->c:Ljava/util/ArrayList;

    .line 161
    .line 162
    const/4 v9, 0x0

    .line 163
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    check-cast v8, Lv7/b0;

    .line 168
    .line 169
    invoke-virtual {p1, v8}, Lv7/p;->h(Lv7/b0;)Lv/e;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    iget-object p1, p1, Lv/e;->e:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast p1, Ljava/lang/Long;

    .line 176
    .line 177
    if-nez p1, :cond_6

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 181
    .line 182
    .line 183
    move-result-wide v8

    .line 184
    const-wide/16 v10, 0x0

    .line 185
    .line 186
    cmp-long p1, v8, v10

    .line 187
    .line 188
    if-nez p1, :cond_7

    .line 189
    .line 190
    new-instance p1, Ll3/n;

    .line 191
    .line 192
    invoke-virtual {p0, v2}, Ll3/m;->g(Lj3/h;)Li3/n;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-static {v7, v6}, Ll3/m;->d(Ljava/lang/String;Lokhttp3/d0;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    sget-object v3, Li3/f;->l:Li3/f;

    .line 201
    .line 202
    invoke-direct {p1, v0, v1, v3}, Ll3/n;-><init>(Li3/o;Ljava/lang/String;Li3/f;)V

    .line 203
    .line 204
    .line 205
    return-object p1

    .line 206
    :catch_2
    move-exception p1

    .line 207
    move-object v5, v2

    .line 208
    goto/16 :goto_b

    .line 209
    .line 210
    :cond_7
    :goto_2
    iget-boolean p1, p0, Ll3/m;->e:Z

    .line 211
    .line 212
    if-eqz p1, :cond_8

    .line 213
    .line 214
    new-instance p1, Lq3/d;

    .line 215
    .line 216
    invoke-virtual {p0}, Ll3/m;->e()Lokhttp3/g0;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    invoke-virtual {p0, v2}, Ll3/m;->f(Lj3/h;)Lq3/b;

    .line 221
    .line 222
    .line 223
    move-result-object v9

    .line 224
    invoke-direct {p1, v8, v9}, Lq3/d;-><init>(Lokhttp3/g0;Lq3/b;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1}, Lq3/d;->a()Lq3/e;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    iget-object v8, p1, Lq3/e;->b:Lq3/b;

    .line 232
    .line 233
    iget-object v9, p1, Lq3/e;->a:Lokhttp3/g0;

    .line 234
    .line 235
    if-nez v9, :cond_c

    .line 236
    .line 237
    if-eqz v8, :cond_c

    .line 238
    .line 239
    new-instance p1, Ll3/n;

    .line 240
    .line 241
    invoke-virtual {p0, v2}, Ll3/m;->g(Lj3/h;)Li3/n;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    iget-object v1, v8, Lq3/b;->b:Ljava/lang/Object;

    .line 246
    .line 247
    invoke-interface {v1}, Ll6/b;->getValue()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    check-cast v1, Lokhttp3/d0;

    .line 252
    .line 253
    invoke-static {v7, v1}, Ll3/m;->d(Ljava/lang/String;Lokhttp3/d0;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    sget-object v3, Li3/f;->l:Li3/f;

    .line 258
    .line 259
    invoke-direct {p1, v0, v1, v3}, Ll3/n;-><init>(Li3/o;Ljava/lang/String;Li3/f;)V

    .line 260
    .line 261
    .line 262
    return-object p1

    .line 263
    :cond_8
    new-instance p1, Ll3/n;

    .line 264
    .line 265
    invoke-virtual {p0, v2}, Ll3/m;->g(Lj3/h;)Li3/n;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-virtual {p0, v2}, Ll3/m;->f(Lj3/h;)Lq3/b;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    if-eqz v1, :cond_9

    .line 274
    .line 275
    iget-object v1, v1, Lq3/b;->b:Ljava/lang/Object;

    .line 276
    .line 277
    invoke-interface {v1}, Ll6/b;->getValue()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    move-object v6, v1

    .line 282
    check-cast v6, Lokhttp3/d0;

    .line 283
    .line 284
    :cond_9
    invoke-static {v7, v6}, Ll3/m;->d(Ljava/lang/String;Lokhttp3/d0;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    sget-object v3, Li3/f;->l:Li3/f;

    .line 289
    .line 290
    invoke-direct {p1, v0, v1, v3}, Ll3/n;-><init>(Li3/o;Ljava/lang/String;Li3/f;)V

    .line 291
    .line 292
    .line 293
    return-object p1

    .line 294
    :cond_a
    const-string p1, "snapshot is closed"

    .line 295
    .line 296
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 297
    .line 298
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    throw v0

    .line 302
    :cond_b
    new-instance p1, Lq3/d;

    .line 303
    .line 304
    invoke-virtual {p0}, Ll3/m;->e()Lokhttp3/g0;

    .line 305
    .line 306
    .line 307
    move-result-object v7

    .line 308
    invoke-direct {p1, v7, v6}, Lq3/d;-><init>(Lokhttp3/g0;Lq3/b;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {p1}, Lq3/d;->a()Lq3/e;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    :cond_c
    iget-object v7, p1, Lq3/e;->a:Lokhttp3/g0;

    .line 316
    .line 317
    invoke-static {v7}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    iput-object p0, v0, Ll3/l;->m:Ll3/m;

    .line 321
    .line 322
    iput-object v2, v0, Ll3/l;->n:Lj3/h;

    .line 323
    .line 324
    iput-object p1, v0, Ll3/l;->o:Ljava/lang/Object;

    .line 325
    .line 326
    iput v5, v0, Ll3/l;->r:I

    .line 327
    .line 328
    invoke-virtual {p0, v7, v0}, Ll3/m;->b(Lokhttp3/g0;Lr6/c;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v5

    .line 332
    if-ne v5, v1, :cond_d

    .line 333
    .line 334
    goto/16 :goto_7

    .line 335
    .line 336
    :cond_d
    move-object v7, v5

    .line 337
    move-object v5, p1

    .line 338
    move-object p1, v7

    .line 339
    move-object v7, p0

    .line 340
    :goto_3
    check-cast p1, Lokhttp3/i0;

    .line 341
    .line 342
    sget-object v8, Lv3/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 343
    .line 344
    invoke-virtual {p1}, Lokhttp3/i0;->body()Lokhttp3/j0;

    .line 345
    .line 346
    .line 347
    move-result-object v8
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 348
    if-eqz v8, :cond_15

    .line 349
    .line 350
    :try_start_3
    iget-object v9, v5, Lq3/e;->a:Lokhttp3/g0;

    .line 351
    .line 352
    iget-object v5, v5, Lq3/e;->b:Lq3/b;

    .line 353
    .line 354
    invoke-virtual {v7, v2, v9, p1, v5}, Ll3/m;->h(Lj3/h;Lokhttp3/g0;Lokhttp3/i0;Lq3/b;)Lj3/h;

    .line 355
    .line 356
    .line 357
    move-result-object v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 358
    iget-object v5, v7, Ll3/m;->a:Ljava/lang/String;

    .line 359
    .line 360
    if-eqz v2, :cond_f

    .line 361
    .line 362
    :try_start_4
    new-instance v0, Ll3/n;

    .line 363
    .line 364
    invoke-virtual {v7, v2}, Ll3/m;->g(Lj3/h;)Li3/n;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    invoke-virtual {v7, v2}, Ll3/m;->f(Lj3/h;)Lq3/b;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    if-eqz v3, :cond_e

    .line 373
    .line 374
    iget-object v3, v3, Lq3/b;->b:Ljava/lang/Object;

    .line 375
    .line 376
    invoke-interface {v3}, Ll6/b;->getValue()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    move-object v6, v3

    .line 381
    check-cast v6, Lokhttp3/d0;

    .line 382
    .line 383
    goto :goto_5

    .line 384
    :goto_4
    move-object v1, p1

    .line 385
    move-object p1, v0

    .line 386
    goto/16 :goto_a

    .line 387
    .line 388
    :cond_e
    :goto_5
    invoke-static {v5, v6}, Ll3/m;->d(Ljava/lang/String;Lokhttp3/d0;)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    sget-object v4, Li3/f;->m:Li3/f;

    .line 393
    .line 394
    invoke-direct {v0, v1, v3, v4}, Ll3/n;-><init>(Li3/o;Ljava/lang/String;Li3/f;)V

    .line 395
    .line 396
    .line 397
    return-object v0

    .line 398
    :catch_3
    move-exception v0

    .line 399
    goto :goto_4

    .line 400
    :cond_f
    invoke-virtual {v8}, Lokhttp3/j0;->source()Lv7/l;

    .line 401
    .line 402
    .line 403
    move-result-object v9

    .line 404
    const-wide/16 v10, 0x1

    .line 405
    .line 406
    invoke-interface {v9, v10, v11}, Lv7/l;->request(J)Z

    .line 407
    .line 408
    .line 409
    move-result v9

    .line 410
    if-eqz v9, :cond_11

    .line 411
    .line 412
    new-instance v0, Ll3/n;

    .line 413
    .line 414
    invoke-virtual {v8}, Lokhttp3/j0;->source()Lv7/l;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    iget-object v3, v7, Ll3/m;->b:Lr3/o;

    .line 419
    .line 420
    iget-object v3, v3, Lr3/o;->a:Landroid/content/Context;

    .line 421
    .line 422
    new-instance v3, Li3/q;

    .line 423
    .line 424
    invoke-direct {v3, v1, v6}, Li3/q;-><init>(Lv7/l;Lcom/bumptech/glide/c;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v8}, Lokhttp3/j0;->contentType()Lokhttp3/d0;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    invoke-static {v5, v1}, Ll3/m;->d(Ljava/lang/String;Lokhttp3/d0;)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    invoke-virtual {p1}, Lokhttp3/i0;->networkResponse()Lokhttp3/i0;

    .line 436
    .line 437
    .line 438
    move-result-object v4

    .line 439
    if-eqz v4, :cond_10

    .line 440
    .line 441
    sget-object v4, Li3/f;->m:Li3/f;

    .line 442
    .line 443
    goto :goto_6

    .line 444
    :cond_10
    sget-object v4, Li3/f;->l:Li3/f;

    .line 445
    .line 446
    :goto_6
    invoke-direct {v0, v3, v1, v4}, Ll3/n;-><init>(Li3/o;Ljava/lang/String;Li3/f;)V

    .line 447
    .line 448
    .line 449
    return-object v0

    .line 450
    :cond_11
    invoke-static {p1}, Lv3/f;->a(Ljava/io/Closeable;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v7}, Ll3/m;->e()Lokhttp3/g0;

    .line 454
    .line 455
    .line 456
    move-result-object v5

    .line 457
    iput-object v7, v0, Ll3/l;->m:Ll3/m;

    .line 458
    .line 459
    iput-object v2, v0, Ll3/l;->n:Lj3/h;

    .line 460
    .line 461
    iput-object p1, v0, Ll3/l;->o:Ljava/lang/Object;

    .line 462
    .line 463
    iput v4, v0, Ll3/l;->r:I

    .line 464
    .line 465
    invoke-virtual {v7, v5, v0}, Ll3/m;->b(Lokhttp3/g0;Lr6/c;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 469
    if-ne v0, v1, :cond_12

    .line 470
    .line 471
    :goto_7
    return-object v1

    .line 472
    :cond_12
    move-object v1, p1

    .line 473
    move-object p1, v0

    .line 474
    move-object v0, v7

    .line 475
    :goto_8
    :try_start_5
    check-cast p1, Lokhttp3/i0;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 476
    .line 477
    :try_start_6
    sget-object v1, Lv3/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 478
    .line 479
    invoke-virtual {p1}, Lokhttp3/i0;->body()Lokhttp3/j0;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    if-eqz v1, :cond_14

    .line 484
    .line 485
    new-instance v3, Ll3/n;

    .line 486
    .line 487
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v1}, Lokhttp3/j0;->source()Lv7/l;

    .line 491
    .line 492
    .line 493
    move-result-object v4

    .line 494
    iget-object v5, v0, Ll3/m;->b:Lr3/o;

    .line 495
    .line 496
    iget-object v5, v5, Lr3/o;->a:Landroid/content/Context;

    .line 497
    .line 498
    new-instance v5, Li3/q;

    .line 499
    .line 500
    invoke-direct {v5, v4, v6}, Li3/q;-><init>(Lv7/l;Lcom/bumptech/glide/c;)V

    .line 501
    .line 502
    .line 503
    iget-object v0, v0, Ll3/m;->a:Ljava/lang/String;

    .line 504
    .line 505
    invoke-virtual {v1}, Lokhttp3/j0;->contentType()Lokhttp3/d0;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    invoke-static {v0, v1}, Ll3/m;->d(Ljava/lang/String;Lokhttp3/d0;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    invoke-virtual {p1}, Lokhttp3/i0;->networkResponse()Lokhttp3/i0;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    if-eqz v1, :cond_13

    .line 518
    .line 519
    sget-object v1, Li3/f;->m:Li3/f;

    .line 520
    .line 521
    goto :goto_9

    .line 522
    :cond_13
    sget-object v1, Li3/f;->l:Li3/f;

    .line 523
    .line 524
    :goto_9
    invoke-direct {v3, v5, v0, v1}, Ll3/n;-><init>(Li3/o;Ljava/lang/String;Li3/f;)V

    .line 525
    .line 526
    .line 527
    return-object v3

    .line 528
    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 529
    .line 530
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    throw v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    .line 534
    :goto_a
    :try_start_7
    invoke-static {v1}, Lv3/f;->a(Ljava/io/Closeable;)V

    .line 535
    .line 536
    .line 537
    throw p1

    .line 538
    :cond_15
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 539
    .line 540
    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 541
    .line 542
    .line 543
    throw p1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    .line 544
    :goto_b
    if-eqz v5, :cond_16

    .line 545
    .line 546
    invoke-static {v5}, Lv3/f;->a(Ljava/io/Closeable;)V

    .line 547
    .line 548
    .line 549
    :cond_16
    throw p1
.end method

.method public final b(Lokhttp3/g0;Lr6/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Ll3/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ll3/k;

    .line 7
    .line 8
    iget v1, v0, Ll3/k;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ll3/k;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ll3/k;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Ll3/k;-><init>(Ll3/m;Lr6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Ll3/k;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lq6/a;->j:Lq6/a;

    .line 28
    .line 29
    iget v2, v0, Ll3/k;->o:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p2}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-static {p2}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    sget-object p2, Lv3/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 52
    .line 53
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-static {p2, v2}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    iget-object v2, p0, Ll3/m;->c:Ll6/g;

    .line 66
    .line 67
    if-eqz p2, :cond_4

    .line 68
    .line 69
    iget-object p2, p0, Ll3/m;->b:Lr3/o;

    .line 70
    .line 71
    iget-object p2, p2, Lr3/o;->o:Lr3/b;

    .line 72
    .line 73
    iget-boolean p2, p2, Lr3/b;->j:Z

    .line 74
    .line 75
    if-nez p2, :cond_3

    .line 76
    .line 77
    invoke-virtual {v2}, Ll6/g;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    check-cast p2, Lokhttp3/f;

    .line 82
    .line 83
    invoke-interface {p2, p1}, Lokhttp3/f;->newCall(Lokhttp3/g0;)Lokhttp3/g;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-interface {p1}, Lokhttp3/g;->execute()Lokhttp3/i0;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    goto :goto_2

    .line 92
    :cond_3
    new-instance p1, Landroid/os/NetworkOnMainThreadException;

    .line 93
    .line 94
    invoke-direct {p1}, Landroid/os/NetworkOnMainThreadException;-><init>()V

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_4
    invoke-virtual {v2}, Ll6/g;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    check-cast p2, Lokhttp3/f;

    .line 103
    .line 104
    invoke-interface {p2, p1}, Lokhttp3/f;->newCall(Lokhttp3/g0;)Lokhttp3/g;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iput v3, v0, Ll3/k;->o:I

    .line 109
    .line 110
    new-instance p2, Li7/g;

    .line 111
    .line 112
    invoke-static {v0}, Lcom/bumptech/glide/d;->P(Lp6/c;)Lp6/c;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-direct {p2, v3, v0}, Li7/g;-><init>(ILp6/c;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2}, Li7/g;->v()V

    .line 120
    .line 121
    .line 122
    new-instance v0, Lv3/g;

    .line 123
    .line 124
    invoke-direct {v0, p1, p2}, Lv3/g;-><init>(Lokhttp3/g;Li7/g;)V

    .line 125
    .line 126
    .line 127
    invoke-interface {p1, v0}, Lokhttp3/g;->enqueue(Lokhttp3/h;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2, v0}, Li7/g;->x(Ly6/l;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2}, Li7/g;->u()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    if-ne p2, v1, :cond_5

    .line 138
    .line 139
    return-object v1

    .line 140
    :cond_5
    :goto_1
    move-object p1, p2

    .line 141
    check-cast p1, Lokhttp3/i0;

    .line 142
    .line 143
    :goto_2
    invoke-virtual {p1}, Lokhttp3/i0;->isSuccessful()Z

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    if-nez p2, :cond_7

    .line 148
    .line 149
    invoke-virtual {p1}, Lokhttp3/i0;->code()I

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    const/16 v0, 0x130

    .line 154
    .line 155
    if-eq p2, v0, :cond_7

    .line 156
    .line 157
    invoke-virtual {p1}, Lokhttp3/i0;->body()Lokhttp3/j0;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    if-eqz p2, :cond_6

    .line 162
    .line 163
    invoke-static {p2}, Lv3/f;->a(Ljava/io/Closeable;)V

    .line 164
    .line 165
    .line 166
    :cond_6
    new-instance p2, La1/u;

    .line 167
    .line 168
    new-instance v0, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    const-string v1, "HTTP "

    .line 171
    .line 172
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1}, Lokhttp3/i0;->code()I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string v1, ": "

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1}, Lokhttp3/i0;->message()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw p2

    .line 202
    :cond_7
    return-object p1
.end method

.method public final c()Lv7/p;
    .locals 1

    .line 1
    iget-object v0, p0, Ll3/m;->d:Ll6/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll6/g;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    check-cast v0, Lj3/i;

    .line 11
    .line 12
    iget-object v0, v0, Lj3/i;->a:Lv7/p;

    .line 13
    .line 14
    return-object v0
.end method

.method public final e()Lokhttp3/g0;
    .locals 6

    .line 1
    new-instance v0, Lokhttp3/g0$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lokhttp3/g0$a;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ll3/m;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lokhttp3/g0$a;->url(Ljava/lang/String;)Lokhttp3/g0$a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Ll3/m;->b:Lr3/o;

    .line 13
    .line 14
    iget-object v2, v1, Lr3/o;->j:Lokhttp3/y;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Lokhttp3/g0$a;->headers(Lokhttp3/y;)Lokhttp3/g0$a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v2, v1, Lr3/o;->k:Lr3/s;

    .line 21
    .line 22
    iget-object v2, v2, Lr3/s;->a:Ljava/util/Map;

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/util/Map$Entry;

    .line 43
    .line 44
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const-string v5, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>"

    .line 49
    .line 50
    invoke-static {v5, v4}, Lz6/h;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    check-cast v4, Ljava/lang/Class;

    .line 54
    .line 55
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v0, v4, v3}, Lokhttp3/g0$a;->tag(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/g0$a;

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    iget-object v2, v1, Lr3/o;->n:Lr3/b;

    .line 64
    .line 65
    iget-boolean v3, v2, Lr3/b;->j:Z

    .line 66
    .line 67
    iget-object v1, v1, Lr3/o;->o:Lr3/b;

    .line 68
    .line 69
    iget-boolean v1, v1, Lr3/b;->j:Z

    .line 70
    .line 71
    if-nez v1, :cond_1

    .line 72
    .line 73
    if-eqz v3, :cond_1

    .line 74
    .line 75
    sget-object v1, Lokhttp3/e;->FORCE_CACHE:Lokhttp3/e;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Lokhttp3/g0$a;->cacheControl(Lokhttp3/e;)Lokhttp3/g0$a;

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    if-eqz v1, :cond_3

    .line 82
    .line 83
    if-nez v3, :cond_3

    .line 84
    .line 85
    iget-boolean v1, v2, Lr3/b;->k:Z

    .line 86
    .line 87
    if-eqz v1, :cond_2

    .line 88
    .line 89
    sget-object v1, Lokhttp3/e;->FORCE_NETWORK:Lokhttp3/e;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Lokhttp3/g0$a;->cacheControl(Lokhttp3/e;)Lokhttp3/g0$a;

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    sget-object v1, Ll3/m;->f:Lokhttp3/e;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Lokhttp3/g0$a;->cacheControl(Lokhttp3/e;)Lokhttp3/g0$a;

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    if-nez v1, :cond_4

    .line 102
    .line 103
    if-nez v3, :cond_4

    .line 104
    .line 105
    sget-object v1, Ll3/m;->g:Lokhttp3/e;

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Lokhttp3/g0$a;->cacheControl(Lokhttp3/e;)Lokhttp3/g0$a;

    .line 108
    .line 109
    .line 110
    :cond_4
    :goto_1
    invoke-virtual {v0}, Lokhttp3/g0$a;->build()Lokhttp3/g0;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    return-object v0
.end method

.method public final f(Lj3/h;)Lq3/b;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ll3/m;->c()Lv7/p;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget-object p1, p1, Lj3/h;->j:Lj3/c;

    .line 7
    .line 8
    iget-boolean v2, p1, Lj3/c;->k:Z

    .line 9
    .line 10
    if-nez v2, :cond_1

    .line 11
    .line 12
    iget-object p1, p1, Lj3/c;->j:Lj3/b;

    .line 13
    .line 14
    iget-object p1, p1, Lj3/b;->c:Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lv7/b0;

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Lv7/p;->l(Lv7/b0;)Lv7/k0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Lv7/b;->c(Lv7/k0;)Lv7/e0;

    .line 28
    .line 29
    .line 30
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    :try_start_1
    new-instance v1, Lq3/b;

    .line 32
    .line 33
    invoke-direct {v1, p1}, Lq3/b;-><init>(Lv7/e0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 34
    .line 35
    .line 36
    :try_start_2
    invoke-virtual {p1}, Lv7/e0;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 37
    .line 38
    .line 39
    move-object p1, v0

    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_1

    .line 43
    :catchall_1
    move-exception v1

    .line 44
    :try_start_3
    invoke-virtual {p1}, Lv7/e0;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_2
    move-exception p1

    .line 49
    :try_start_4
    invoke-static {v1, p1}, Lcom/bumptech/glide/d;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    move-object p1, v1

    .line 53
    move-object v1, v0

    .line 54
    :goto_1
    if-nez p1, :cond_0

    .line 55
    .line 56
    return-object v1

    .line 57
    :cond_0
    throw p1

    .line 58
    :cond_1
    const-string p1, "snapshot is closed"

    .line 59
    .line 60
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 66
    :catch_0
    return-object v0
.end method

.method public final g(Lj3/h;)Li3/n;
    .locals 4

    .line 1
    iget-object v0, p1, Lj3/h;->j:Lj3/c;

    .line 2
    .line 3
    iget-boolean v1, v0, Lj3/c;->k:Z

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    iget-object v0, v0, Lj3/c;->j:Lj3/b;

    .line 8
    .line 9
    iget-object v0, v0, Lj3/b;->c:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lv7/b0;

    .line 17
    .line 18
    invoke-virtual {p0}, Ll3/m;->c()Lv7/p;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p0, Ll3/m;->b:Lr3/o;

    .line 23
    .line 24
    iget-object v2, v2, Lr3/o;->i:Ljava/lang/String;

    .line 25
    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    iget-object v2, p0, Ll3/m;->a:Ljava/lang/String;

    .line 29
    .line 30
    :cond_0
    new-instance v3, Li3/n;

    .line 31
    .line 32
    invoke-direct {v3, v0, v1, v2, p1}, Li3/n;-><init>(Lv7/b0;Lv7/p;Ljava/lang/String;Ljava/io/Closeable;)V

    .line 33
    .line 34
    .line 35
    return-object v3

    .line 36
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string v0, "snapshot is closed"

    .line 39
    .line 40
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1
.end method

.method public final h(Lj3/h;Lokhttp3/g0;Lokhttp3/i0;Lq3/b;)Lj3/h;
    .locals 3

    .line 1
    iget-object v0, p0, Ll3/m;->b:Lr3/o;

    .line 2
    .line 3
    iget-object v0, v0, Lr3/o;->n:Lr3/b;

    .line 4
    .line 5
    iget-boolean v0, v0, Lr3/b;->k:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_9

    .line 9
    .line 10
    iget-boolean v0, p0, Ll3/m;->e:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p2}, Lokhttp3/g0;->cacheControl()Lokhttp3/e;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-virtual {p2}, Lokhttp3/e;->noStore()Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-nez p2, :cond_9

    .line 23
    .line 24
    invoke-virtual {p3}, Lokhttp3/i0;->cacheControl()Lokhttp3/e;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p2}, Lokhttp3/e;->noStore()Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-nez p2, :cond_9

    .line 33
    .line 34
    invoke-virtual {p3}, Lokhttp3/i0;->headers()Lokhttp3/y;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    const-string v0, "Vary"

    .line 39
    .line 40
    invoke-virtual {p2, v0}, Lokhttp3/y;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    const-string v0, "*"

    .line 45
    .line 46
    invoke-static {p2, v0}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-nez p2, :cond_9

    .line 51
    .line 52
    :cond_0
    const/16 p2, 0x1b

    .line 53
    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    iget-object p1, p1, Lj3/h;->j:Lj3/c;

    .line 57
    .line 58
    iget-object v0, p1, Lj3/c;->l:Lj3/f;

    .line 59
    .line 60
    monitor-enter v0

    .line 61
    :try_start_0
    invoke-virtual {p1}, Lj3/c;->close()V

    .line 62
    .line 63
    .line 64
    iget-object p1, p1, Lj3/c;->j:Lj3/b;

    .line 65
    .line 66
    iget-object p1, p1, Lj3/b;->a:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v0, p1}, Lj3/f;->c(Ljava/lang/String;)Lj3/a;

    .line 69
    .line 70
    .line 71
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    monitor-exit v0

    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    new-instance v0, La1/o;

    .line 76
    .line 77
    invoke-direct {v0, p2, p1}, La1/o;-><init>(ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catchall_0
    move-exception p1

    .line 82
    monitor-exit v0

    .line 83
    throw p1

    .line 84
    :cond_1
    iget-object p1, p0, Ll3/m;->d:Ll6/g;

    .line 85
    .line 86
    invoke-virtual {p1}, Ll6/g;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Lj3/i;

    .line 91
    .line 92
    if-eqz p1, :cond_3

    .line 93
    .line 94
    iget-object v0, p0, Ll3/m;->b:Lr3/o;

    .line 95
    .line 96
    iget-object v0, v0, Lr3/o;->i:Ljava/lang/String;

    .line 97
    .line 98
    if-nez v0, :cond_2

    .line 99
    .line 100
    iget-object v0, p0, Ll3/m;->a:Ljava/lang/String;

    .line 101
    .line 102
    :cond_2
    iget-object p1, p1, Lj3/i;->b:Lj3/f;

    .line 103
    .line 104
    sget-object v2, Lv7/m;->m:Lv7/m;

    .line 105
    .line 106
    invoke-static {v0}, Lk2/b;->p(Ljava/lang/String;)Lv7/m;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const-string v2, "SHA-256"

    .line 111
    .line 112
    invoke-virtual {v0, v2}, Lv7/m;->c(Ljava/lang/String;)Lv7/m;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Lv7/m;->e()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {p1, v0}, Lj3/f;->c(Ljava/lang/String;)Lj3/a;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    if-eqz p1, :cond_3

    .line 125
    .line 126
    new-instance v0, La1/o;

    .line 127
    .line 128
    invoke-direct {v0, p2, p1}, La1/o;-><init>(ILjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_3
    move-object v0, v1

    .line 133
    :goto_0
    if-nez v0, :cond_4

    .line 134
    .line 135
    goto/16 :goto_8

    .line 136
    .line 137
    :cond_4
    const/4 p1, 0x0

    .line 138
    :try_start_1
    invoke-virtual {p3}, Lokhttp3/i0;->code()I

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    const/16 v2, 0x130

    .line 143
    .line 144
    if-ne p2, v2, :cond_6

    .line 145
    .line 146
    if-eqz p4, :cond_6

    .line 147
    .line 148
    invoke-virtual {p3}, Lokhttp3/i0;->newBuilder()Lokhttp3/i0$a;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    iget-object p4, p4, Lq3/b;->f:Lokhttp3/y;

    .line 153
    .line 154
    invoke-virtual {p3}, Lokhttp3/i0;->headers()Lokhttp3/y;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-static {p4, v2}, Lq3/c;->a(Lokhttp3/y;Lokhttp3/y;)Lokhttp3/y;

    .line 159
    .line 160
    .line 161
    move-result-object p4

    .line 162
    invoke-virtual {p2, p4}, Lokhttp3/i0$a;->headers(Lokhttp3/y;)Lokhttp3/i0$a;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    invoke-virtual {p2}, Lokhttp3/i0$a;->build()Lokhttp3/i0;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-virtual {p0}, Ll3/m;->c()Lv7/p;

    .line 171
    .line 172
    .line 173
    move-result-object p4

    .line 174
    iget-object v2, v0, La1/o;->k:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v2, Lj3/a;

    .line 177
    .line 178
    invoke-virtual {v2, p1}, Lj3/a;->c(I)Lv7/b0;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-virtual {p4, v2}, Lv7/p;->k(Lv7/b0;)Lv7/i0;

    .line 183
    .line 184
    .line 185
    move-result-object p4

    .line 186
    invoke-static {p4}, Lv7/b;->b(Lv7/i0;)Lv7/d0;

    .line 187
    .line 188
    .line 189
    move-result-object p4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 190
    :try_start_2
    new-instance v2, Lq3/b;

    .line 191
    .line 192
    invoke-direct {v2, p2}, Lq3/b;-><init>(Lokhttp3/i0;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2, p4}, Lq3/b;->a(Lv7/d0;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 196
    .line 197
    .line 198
    :try_start_3
    invoke-virtual {p4}, Lv7/d0;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 199
    .line 200
    .line 201
    goto :goto_1

    .line 202
    :catchall_1
    move-exception v1

    .line 203
    goto :goto_1

    .line 204
    :catchall_2
    move-exception p2

    .line 205
    move-object v1, p2

    .line 206
    :try_start_4
    invoke-virtual {p4}, Lv7/d0;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :catchall_3
    move-exception p2

    .line 211
    :try_start_5
    invoke-static {v1, p2}, Lcom/bumptech/glide/d;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 212
    .line 213
    .line 214
    :goto_1
    if-nez v1, :cond_5

    .line 215
    .line 216
    goto/16 :goto_5

    .line 217
    .line 218
    :cond_5
    throw v1

    .line 219
    :catchall_4
    move-exception p1

    .line 220
    goto/16 :goto_7

    .line 221
    .line 222
    :catch_0
    move-exception p2

    .line 223
    goto/16 :goto_6

    .line 224
    .line 225
    :cond_6
    invoke-virtual {p0}, Ll3/m;->c()Lv7/p;

    .line 226
    .line 227
    .line 228
    move-result-object p2

    .line 229
    iget-object p4, v0, La1/o;->k:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast p4, Lj3/a;

    .line 232
    .line 233
    invoke-virtual {p4, p1}, Lj3/a;->c(I)Lv7/b0;

    .line 234
    .line 235
    .line 236
    move-result-object p4

    .line 237
    invoke-virtual {p2, p4}, Lv7/p;->k(Lv7/b0;)Lv7/i0;

    .line 238
    .line 239
    .line 240
    move-result-object p2

    .line 241
    invoke-static {p2}, Lv7/b;->b(Lv7/i0;)Lv7/d0;

    .line 242
    .line 243
    .line 244
    move-result-object p2
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 245
    :try_start_6
    new-instance p4, Lq3/b;

    .line 246
    .line 247
    invoke-direct {p4, p3}, Lq3/b;-><init>(Lokhttp3/i0;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p4, p2}, Lq3/b;->a(Lv7/d0;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 251
    .line 252
    .line 253
    :try_start_7
    invoke-virtual {p2}, Lv7/d0;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 254
    .line 255
    .line 256
    move-object p2, v1

    .line 257
    goto :goto_3

    .line 258
    :catchall_5
    move-exception p2

    .line 259
    goto :goto_3

    .line 260
    :catchall_6
    move-exception p4

    .line 261
    :try_start_8
    invoke-virtual {p2}, Lv7/d0;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 262
    .line 263
    .line 264
    goto :goto_2

    .line 265
    :catchall_7
    move-exception p2

    .line 266
    :try_start_9
    invoke-static {p4, p2}, Lcom/bumptech/glide/d;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 267
    .line 268
    .line 269
    :goto_2
    move-object p2, p4

    .line 270
    :goto_3
    if-nez p2, :cond_8

    .line 271
    .line 272
    invoke-virtual {p0}, Ll3/m;->c()Lv7/p;

    .line 273
    .line 274
    .line 275
    move-result-object p2

    .line 276
    iget-object p4, v0, La1/o;->k:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast p4, Lj3/a;

    .line 279
    .line 280
    const/4 v2, 0x1

    .line 281
    invoke-virtual {p4, v2}, Lj3/a;->c(I)Lv7/b0;

    .line 282
    .line 283
    .line 284
    move-result-object p4

    .line 285
    invoke-virtual {p2, p4}, Lv7/p;->k(Lv7/b0;)Lv7/i0;

    .line 286
    .line 287
    .line 288
    move-result-object p2

    .line 289
    invoke-static {p2}, Lv7/b;->b(Lv7/i0;)Lv7/d0;

    .line 290
    .line 291
    .line 292
    move-result-object p2
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 293
    :try_start_a
    invoke-virtual {p3}, Lokhttp3/i0;->body()Lokhttp3/j0;

    .line 294
    .line 295
    .line 296
    move-result-object p4

    .line 297
    invoke-static {p4}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {p4}, Lokhttp3/j0;->source()Lv7/l;

    .line 301
    .line 302
    .line 303
    move-result-object p4

    .line 304
    invoke-interface {p4, p2}, Lv7/l;->u(Lv7/d0;)J
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 305
    .line 306
    .line 307
    :try_start_b
    invoke-virtual {p2}, Lv7/d0;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 308
    .line 309
    .line 310
    goto :goto_4

    .line 311
    :catchall_8
    move-exception v1

    .line 312
    goto :goto_4

    .line 313
    :catchall_9
    move-exception p4

    .line 314
    move-object v1, p4

    .line 315
    :try_start_c
    invoke-virtual {p2}, Lv7/d0;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    .line 316
    .line 317
    .line 318
    goto :goto_4

    .line 319
    :catchall_a
    move-exception p2

    .line 320
    :try_start_d
    invoke-static {v1, p2}, Lcom/bumptech/glide/d;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 321
    .line 322
    .line 323
    :goto_4
    if-nez v1, :cond_7

    .line 324
    .line 325
    :goto_5
    invoke-virtual {v0}, La1/o;->l()Lj3/h;

    .line 326
    .line 327
    .line 328
    move-result-object p1
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 329
    invoke-static {p3}, Lv3/f;->a(Ljava/io/Closeable;)V

    .line 330
    .line 331
    .line 332
    return-object p1

    .line 333
    :cond_7
    :try_start_e
    throw v1

    .line 334
    :cond_8
    throw p2
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 335
    :goto_6
    :try_start_f
    sget-object p4, Lv3/f;->a:[Landroid/graphics/Bitmap$Config;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    .line 336
    .line 337
    :try_start_10
    iget-object p4, v0, La1/o;->k:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast p4, Lj3/a;

    .line 340
    .line 341
    invoke-virtual {p4, p1}, Lj3/a;->b(Z)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_1
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 342
    .line 343
    .line 344
    :catch_1
    :try_start_11
    throw p2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 345
    :goto_7
    invoke-static {p3}, Lv3/f;->a(Ljava/io/Closeable;)V

    .line 346
    .line 347
    .line 348
    throw p1

    .line 349
    :cond_9
    if-eqz p1, :cond_a

    .line 350
    .line 351
    invoke-static {p1}, Lv3/f;->a(Ljava/io/Closeable;)V

    .line 352
    .line 353
    .line 354
    :cond_a
    :goto_8
    return-object v1
.end method
