.class public final Lokhttp3/internal/cache/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lokhttp3/c0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/cache/a$a;
    }
.end annotation


# static fields
.field public static final Companion:Lokhttp3/internal/cache/a$a;


# instance fields
.field private final cache:Lokhttp3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lokhttp3/internal/cache/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lokhttp3/internal/cache/a$a;-><init>(Lz6/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lokhttp3/internal/cache/a;->Companion:Lokhttp3/internal/cache/a$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lokhttp3/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lokhttp3/internal/cache/a;->cache:Lokhttp3/d;

    .line 5
    .line 6
    return-void
.end method

.method private final cacheWritingResponse(Lokhttp3/internal/cache/b;Lokhttp3/i0;)Lokhttp3/i0;
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-object p2

    .line 4
    :cond_0
    invoke-interface {p1}, Lokhttp3/internal/cache/b;->body()Lv7/i0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p2}, Lokhttp3/i0;->body()Lokhttp3/j0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lokhttp3/j0;->source()Lv7/l;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v0}, Lv7/b;->b(Lv7/i0;)Lv7/d0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v2, Lokhttp3/internal/cache/a$b;

    .line 24
    .line 25
    invoke-direct {v2, v1, p1, v0}, Lokhttp3/internal/cache/a$b;-><init>(Lv7/l;Lokhttp3/internal/cache/b;Lv7/k;)V

    .line 26
    .line 27
    .line 28
    const-string p1, "Content-Type"

    .line 29
    .line 30
    const/4 v0, 0x2

    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-static {p2, p1, v1, v0, v1}, Lokhttp3/i0;->header$default(Lokhttp3/i0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p2}, Lokhttp3/i0;->body()Lokhttp3/j0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lokhttp3/j0;->contentLength()J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    invoke-virtual {p2}, Lokhttp3/i0;->newBuilder()Lokhttp3/i0$a;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    new-instance v3, Lokhttp3/internal/http/j;

    .line 49
    .line 50
    invoke-static {v2}, Lv7/b;->c(Lv7/k0;)Lv7/e0;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-direct {v3, p1, v0, v1, v2}, Lokhttp3/internal/http/j;-><init>(Ljava/lang/String;JLv7/l;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2, v3}, Lokhttp3/i0$a;->body(Lokhttp3/j0;)Lokhttp3/i0$a;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, Lokhttp3/i0$a;->build()Lokhttp3/i0;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1
.end method


# virtual methods
.method public final getCache$okhttp()Lokhttp3/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/cache/a;->cache:Lokhttp3/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public intercept(Lokhttp3/a0;)Lokhttp3/i0;
    .locals 8

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lokhttp3/a0;->call()Lokhttp3/g;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lokhttp3/internal/cache/a;->cache:Lokhttp3/d;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Lokhttp3/a0;->request()Lokhttp3/g0;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v1, v3}, Lokhttp3/d;->get$okhttp(Lokhttp3/g0;)Lokhttp3/i0;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v1, v2

    .line 25
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    new-instance v5, Lokhttp3/internal/cache/c$b;

    .line 30
    .line 31
    invoke-interface {p1}, Lokhttp3/a0;->request()Lokhttp3/g0;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    invoke-direct {v5, v3, v4, v6, v1}, Lokhttp3/internal/cache/c$b;-><init>(JLokhttp3/g0;Lokhttp3/i0;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v5}, Lokhttp3/internal/cache/c$b;->compute()Lokhttp3/internal/cache/c;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v3}, Lokhttp3/internal/cache/c;->getNetworkRequest()Lokhttp3/g0;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v3}, Lokhttp3/internal/cache/c;->getCacheResponse()Lokhttp3/i0;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    iget-object v6, p0, Lokhttp3/internal/cache/a;->cache:Lokhttp3/d;

    .line 51
    .line 52
    if-eqz v6, :cond_1

    .line 53
    .line 54
    invoke-virtual {v6, v3}, Lokhttp3/d;->trackResponse$okhttp(Lokhttp3/internal/cache/c;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    instance-of v3, v0, Lokhttp3/internal/connection/e;

    .line 58
    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    move-object v2, v0

    .line 62
    check-cast v2, Lokhttp3/internal/connection/e;

    .line 63
    .line 64
    :cond_2
    if-eqz v2, :cond_3

    .line 65
    .line 66
    invoke-virtual {v2}, Lokhttp3/internal/connection/e;->getEventListener$okhttp()Lokhttp3/v;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    if-nez v2, :cond_4

    .line 71
    .line 72
    :cond_3
    sget-object v2, Lokhttp3/v;->NONE:Lokhttp3/v;

    .line 73
    .line 74
    :cond_4
    if-eqz v1, :cond_5

    .line 75
    .line 76
    if-nez v5, :cond_5

    .line 77
    .line 78
    invoke-virtual {v1}, Lokhttp3/i0;->body()Lokhttp3/j0;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    if-eqz v3, :cond_5

    .line 83
    .line 84
    invoke-static {v3}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 85
    .line 86
    .line 87
    :cond_5
    if-nez v4, :cond_6

    .line 88
    .line 89
    if-nez v5, :cond_6

    .line 90
    .line 91
    new-instance v1, Lokhttp3/i0$a;

    .line 92
    .line 93
    invoke-direct {v1}, Lokhttp3/i0$a;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-interface {p1}, Lokhttp3/a0;->request()Lokhttp3/g0;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {v1, p1}, Lokhttp3/i0$a;->request(Lokhttp3/g0;)Lokhttp3/i0$a;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    sget-object v1, Lokhttp3/f0;->HTTP_1_1:Lokhttp3/f0;

    .line 105
    .line 106
    invoke-virtual {p1, v1}, Lokhttp3/i0$a;->protocol(Lokhttp3/f0;)Lokhttp3/i0$a;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    const/16 v1, 0x1f8

    .line 111
    .line 112
    invoke-virtual {p1, v1}, Lokhttp3/i0$a;->code(I)Lokhttp3/i0$a;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    const-string v1, "Unsatisfiable Request (only-if-cached)"

    .line 117
    .line 118
    invoke-virtual {p1, v1}, Lokhttp3/i0$a;->message(Ljava/lang/String;)Lokhttp3/i0$a;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    sget-object v1, Lq7/c;->EMPTY_RESPONSE:Lokhttp3/j0;

    .line 123
    .line 124
    invoke-virtual {p1, v1}, Lokhttp3/i0$a;->body(Lokhttp3/j0;)Lokhttp3/i0$a;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    const-wide/16 v3, -0x1

    .line 129
    .line 130
    invoke-virtual {p1, v3, v4}, Lokhttp3/i0$a;->sentRequestAtMillis(J)Lokhttp3/i0$a;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 135
    .line 136
    .line 137
    move-result-wide v3

    .line 138
    invoke-virtual {p1, v3, v4}, Lokhttp3/i0$a;->receivedResponseAtMillis(J)Lokhttp3/i0$a;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p1}, Lokhttp3/i0$a;->build()Lokhttp3/i0;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {v2, v0, p1}, Lokhttp3/v;->satisfactionFailure(Lokhttp3/g;Lokhttp3/i0;)V

    .line 147
    .line 148
    .line 149
    return-object p1

    .line 150
    :cond_6
    if-nez v4, :cond_7

    .line 151
    .line 152
    invoke-static {v5}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v5}, Lokhttp3/i0;->newBuilder()Lokhttp3/i0$a;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    sget-object v1, Lokhttp3/internal/cache/a;->Companion:Lokhttp3/internal/cache/a$a;

    .line 160
    .line 161
    invoke-static {v1, v5}, Lokhttp3/internal/cache/a$a;->access$stripBody(Lokhttp3/internal/cache/a$a;Lokhttp3/i0;)Lokhttp3/i0;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-virtual {p1, v1}, Lokhttp3/i0$a;->cacheResponse(Lokhttp3/i0;)Lokhttp3/i0$a;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {p1}, Lokhttp3/i0$a;->build()Lokhttp3/i0;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {v2, v0, p1}, Lokhttp3/v;->cacheHit(Lokhttp3/g;Lokhttp3/i0;)V

    .line 174
    .line 175
    .line 176
    return-object p1

    .line 177
    :cond_7
    if-eqz v5, :cond_8

    .line 178
    .line 179
    invoke-virtual {v2, v0, v5}, Lokhttp3/v;->cacheConditionalHit(Lokhttp3/g;Lokhttp3/i0;)V

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_8
    iget-object v3, p0, Lokhttp3/internal/cache/a;->cache:Lokhttp3/d;

    .line 184
    .line 185
    if-eqz v3, :cond_9

    .line 186
    .line 187
    invoke-virtual {v2, v0}, Lokhttp3/v;->cacheMiss(Lokhttp3/g;)V

    .line 188
    .line 189
    .line 190
    :cond_9
    :goto_1
    :try_start_0
    invoke-interface {p1, v4}, Lokhttp3/a0;->proceed(Lokhttp3/g0;)Lokhttp3/i0;

    .line 191
    .line 192
    .line 193
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 194
    if-nez p1, :cond_a

    .line 195
    .line 196
    if-eqz v1, :cond_a

    .line 197
    .line 198
    invoke-virtual {v1}, Lokhttp3/i0;->body()Lokhttp3/j0;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    if-eqz v1, :cond_a

    .line 203
    .line 204
    invoke-static {v1}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 205
    .line 206
    .line 207
    :cond_a
    if-eqz v5, :cond_c

    .line 208
    .line 209
    if-eqz p1, :cond_b

    .line 210
    .line 211
    invoke-virtual {p1}, Lokhttp3/i0;->code()I

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    const/16 v3, 0x130

    .line 216
    .line 217
    if-ne v1, v3, :cond_b

    .line 218
    .line 219
    invoke-virtual {v5}, Lokhttp3/i0;->newBuilder()Lokhttp3/i0$a;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    sget-object v3, Lokhttp3/internal/cache/a;->Companion:Lokhttp3/internal/cache/a$a;

    .line 224
    .line 225
    invoke-virtual {v5}, Lokhttp3/i0;->headers()Lokhttp3/y;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-virtual {p1}, Lokhttp3/i0;->headers()Lokhttp3/y;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    invoke-static {v3, v4, v6}, Lokhttp3/internal/cache/a$a;->access$combine(Lokhttp3/internal/cache/a$a;Lokhttp3/y;Lokhttp3/y;)Lokhttp3/y;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    invoke-virtual {v1, v4}, Lokhttp3/i0$a;->headers(Lokhttp3/y;)Lokhttp3/i0$a;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-virtual {p1}, Lokhttp3/i0;->sentRequestAtMillis()J

    .line 242
    .line 243
    .line 244
    move-result-wide v6

    .line 245
    invoke-virtual {v1, v6, v7}, Lokhttp3/i0$a;->sentRequestAtMillis(J)Lokhttp3/i0$a;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-virtual {p1}, Lokhttp3/i0;->receivedResponseAtMillis()J

    .line 250
    .line 251
    .line 252
    move-result-wide v6

    .line 253
    invoke-virtual {v1, v6, v7}, Lokhttp3/i0$a;->receivedResponseAtMillis(J)Lokhttp3/i0$a;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-static {v3, v5}, Lokhttp3/internal/cache/a$a;->access$stripBody(Lokhttp3/internal/cache/a$a;Lokhttp3/i0;)Lokhttp3/i0;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    invoke-virtual {v1, v4}, Lokhttp3/i0$a;->cacheResponse(Lokhttp3/i0;)Lokhttp3/i0$a;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-static {v3, p1}, Lokhttp3/internal/cache/a$a;->access$stripBody(Lokhttp3/internal/cache/a$a;Lokhttp3/i0;)Lokhttp3/i0;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    invoke-virtual {v1, v3}, Lokhttp3/i0$a;->networkResponse(Lokhttp3/i0;)Lokhttp3/i0$a;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-virtual {v1}, Lokhttp3/i0$a;->build()Lokhttp3/i0;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-virtual {p1}, Lokhttp3/i0;->body()Lokhttp3/j0;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    invoke-static {p1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {p1}, Lokhttp3/j0;->close()V

    .line 285
    .line 286
    .line 287
    iget-object p1, p0, Lokhttp3/internal/cache/a;->cache:Lokhttp3/d;

    .line 288
    .line 289
    invoke-static {p1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1}, Lokhttp3/d;->trackConditionalCacheHit$okhttp()V

    .line 293
    .line 294
    .line 295
    iget-object p1, p0, Lokhttp3/internal/cache/a;->cache:Lokhttp3/d;

    .line 296
    .line 297
    invoke-virtual {p1, v5, v1}, Lokhttp3/d;->update$okhttp(Lokhttp3/i0;Lokhttp3/i0;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2, v0, v1}, Lokhttp3/v;->cacheHit(Lokhttp3/g;Lokhttp3/i0;)V

    .line 301
    .line 302
    .line 303
    return-object v1

    .line 304
    :cond_b
    invoke-virtual {v5}, Lokhttp3/i0;->body()Lokhttp3/j0;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    if-eqz v1, :cond_c

    .line 309
    .line 310
    invoke-static {v1}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 311
    .line 312
    .line 313
    :cond_c
    invoke-static {p1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {p1}, Lokhttp3/i0;->newBuilder()Lokhttp3/i0$a;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    sget-object v3, Lokhttp3/internal/cache/a;->Companion:Lokhttp3/internal/cache/a$a;

    .line 321
    .line 322
    invoke-static {v3, v5}, Lokhttp3/internal/cache/a$a;->access$stripBody(Lokhttp3/internal/cache/a$a;Lokhttp3/i0;)Lokhttp3/i0;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    invoke-virtual {v1, v6}, Lokhttp3/i0$a;->cacheResponse(Lokhttp3/i0;)Lokhttp3/i0$a;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    invoke-static {v3, p1}, Lokhttp3/internal/cache/a$a;->access$stripBody(Lokhttp3/internal/cache/a$a;Lokhttp3/i0;)Lokhttp3/i0;

    .line 331
    .line 332
    .line 333
    move-result-object p1

    .line 334
    invoke-virtual {v1, p1}, Lokhttp3/i0$a;->networkResponse(Lokhttp3/i0;)Lokhttp3/i0$a;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    invoke-virtual {p1}, Lokhttp3/i0$a;->build()Lokhttp3/i0;

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    iget-object v1, p0, Lokhttp3/internal/cache/a;->cache:Lokhttp3/d;

    .line 343
    .line 344
    if-eqz v1, :cond_f

    .line 345
    .line 346
    invoke-static {p1}, Lokhttp3/internal/http/g;->promisesBody(Lokhttp3/i0;)Z

    .line 347
    .line 348
    .line 349
    move-result v1

    .line 350
    if-eqz v1, :cond_e

    .line 351
    .line 352
    sget-object v1, Lokhttp3/internal/cache/c;->Companion:Lokhttp3/internal/cache/c$a;

    .line 353
    .line 354
    invoke-virtual {v1, p1, v4}, Lokhttp3/internal/cache/c$a;->isCacheable(Lokhttp3/i0;Lokhttp3/g0;)Z

    .line 355
    .line 356
    .line 357
    move-result v1

    .line 358
    if-eqz v1, :cond_e

    .line 359
    .line 360
    iget-object v1, p0, Lokhttp3/internal/cache/a;->cache:Lokhttp3/d;

    .line 361
    .line 362
    invoke-virtual {v1, p1}, Lokhttp3/d;->put$okhttp(Lokhttp3/i0;)Lokhttp3/internal/cache/b;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    invoke-direct {p0, v1, p1}, Lokhttp3/internal/cache/a;->cacheWritingResponse(Lokhttp3/internal/cache/b;Lokhttp3/i0;)Lokhttp3/i0;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    if-eqz v5, :cond_d

    .line 371
    .line 372
    invoke-virtual {v2, v0}, Lokhttp3/v;->cacheMiss(Lokhttp3/g;)V

    .line 373
    .line 374
    .line 375
    :cond_d
    return-object p1

    .line 376
    :cond_e
    sget-object v0, Lokhttp3/internal/http/h;->INSTANCE:Lokhttp3/internal/http/h;

    .line 377
    .line 378
    invoke-virtual {v4}, Lokhttp3/g0;->method()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    invoke-virtual {v0, v1}, Lokhttp3/internal/http/h;->invalidatesCache(Ljava/lang/String;)Z

    .line 383
    .line 384
    .line 385
    move-result v0

    .line 386
    if-eqz v0, :cond_f

    .line 387
    .line 388
    :try_start_1
    iget-object v0, p0, Lokhttp3/internal/cache/a;->cache:Lokhttp3/d;

    .line 389
    .line 390
    invoke-virtual {v0, v4}, Lokhttp3/d;->remove$okhttp(Lokhttp3/g0;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 391
    .line 392
    .line 393
    :catch_0
    :cond_f
    return-object p1

    .line 394
    :catchall_0
    move-exception p1

    .line 395
    if-eqz v1, :cond_10

    .line 396
    .line 397
    invoke-virtual {v1}, Lokhttp3/i0;->body()Lokhttp3/j0;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    if-eqz v0, :cond_10

    .line 402
    .line 403
    invoke-static {v0}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 404
    .line 405
    .line 406
    :cond_10
    throw p1
.end method
