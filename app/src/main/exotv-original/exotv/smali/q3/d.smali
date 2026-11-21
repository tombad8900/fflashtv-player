.class public final Lq3/d;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:Lokhttp3/g0;

.field public final b:Lq3/b;

.field public final c:Ljava/util/Date;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/Date;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/util/Date;

.field public final h:J

.field public final i:J

.field public final j:Ljava/lang/String;

.field public final k:I


# direct methods
.method public constructor <init>(Lokhttp3/g0;Lq3/b;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq3/d;->a:Lokhttp3/g0;

    .line 5
    .line 6
    iput-object p2, p0, Lq3/d;->b:Lq3/b;

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    iput p1, p0, Lq3/d;->k:I

    .line 10
    .line 11
    if-eqz p2, :cond_8

    .line 12
    .line 13
    iget-wide v0, p2, Lq3/b;->c:J

    .line 14
    .line 15
    iput-wide v0, p0, Lq3/d;->h:J

    .line 16
    .line 17
    iget-wide v0, p2, Lq3/b;->d:J

    .line 18
    .line 19
    iput-wide v0, p0, Lq3/d;->i:J

    .line 20
    .line 21
    iget-object p2, p2, Lq3/b;->f:Lokhttp3/y;

    .line 22
    .line 23
    invoke-virtual {p2}, Lokhttp3/y;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x0

    .line 28
    move v2, v1

    .line 29
    :goto_0
    if-ge v2, v0, :cond_8

    .line 30
    .line 31
    invoke-virtual {p2, v2}, Lokhttp3/y;->name(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    const-string v4, "Date"

    .line 36
    .line 37
    invoke-static {v3, v4}, Lh7/p;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_0

    .line 42
    .line 43
    invoke-virtual {p2, v4}, Lokhttp3/y;->getDate(Ljava/lang/String;)Ljava/util/Date;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    iput-object v3, p0, Lq3/d;->c:Ljava/util/Date;

    .line 48
    .line 49
    invoke-virtual {p2, v2}, Lokhttp3/y;->value(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    iput-object v3, p0, Lq3/d;->d:Ljava/lang/String;

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_0
    const-string v4, "Expires"

    .line 57
    .line 58
    invoke-static {v3, v4}, Lh7/p;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_1

    .line 63
    .line 64
    invoke-virtual {p2, v4}, Lokhttp3/y;->getDate(Ljava/lang/String;)Ljava/util/Date;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    iput-object v3, p0, Lq3/d;->g:Ljava/util/Date;

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_1
    const-string v4, "Last-Modified"

    .line 72
    .line 73
    invoke-static {v3, v4}, Lh7/p;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-eqz v5, :cond_2

    .line 78
    .line 79
    invoke-virtual {p2, v4}, Lokhttp3/y;->getDate(Ljava/lang/String;)Ljava/util/Date;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    iput-object v3, p0, Lq3/d;->e:Ljava/util/Date;

    .line 84
    .line 85
    invoke-virtual {p2, v2}, Lokhttp3/y;->value(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    iput-object v3, p0, Lq3/d;->f:Ljava/lang/String;

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_2
    const-string v4, "ETag"

    .line 93
    .line 94
    invoke-static {v3, v4}, Lh7/p;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_3

    .line 99
    .line 100
    invoke-virtual {p2, v2}, Lokhttp3/y;->value(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    iput-object v3, p0, Lq3/d;->j:Ljava/lang/String;

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_3
    const-string v4, "Age"

    .line 108
    .line 109
    invoke-static {v3, v4}, Lh7/p;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eqz v3, :cond_7

    .line 114
    .line 115
    invoke-virtual {p2, v2}, Lokhttp3/y;->value(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    sget-object v4, Lv3/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 120
    .line 121
    invoke-static {v3}, Lh7/o;->l0(Ljava/lang/String;)Ljava/lang/Long;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    if-eqz v3, :cond_6

    .line 126
    .line 127
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 128
    .line 129
    .line 130
    move-result-wide v3

    .line 131
    const-wide/32 v5, 0x7fffffff

    .line 132
    .line 133
    .line 134
    cmp-long v5, v3, v5

    .line 135
    .line 136
    if-lez v5, :cond_4

    .line 137
    .line 138
    const v3, 0x7fffffff

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_4
    const-wide/16 v5, 0x0

    .line 143
    .line 144
    cmp-long v5, v3, v5

    .line 145
    .line 146
    if-gez v5, :cond_5

    .line 147
    .line 148
    move v3, v1

    .line 149
    goto :goto_1

    .line 150
    :cond_5
    long-to-int v3, v3

    .line 151
    goto :goto_1

    .line 152
    :cond_6
    move v3, p1

    .line 153
    :goto_1
    iput v3, p0, Lq3/d;->k:I

    .line 154
    .line 155
    :cond_7
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 156
    .line 157
    goto/16 :goto_0

    .line 158
    .line 159
    :cond_8
    return-void
.end method


# virtual methods
.method public final a()Lq3/e;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lq3/d;->a:Lokhttp3/g0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, Lq3/d;->b:Lq3/b;

    .line 7
    .line 8
    if-nez v3, :cond_0

    .line 9
    .line 10
    new-instance v3, Lq3/e;

    .line 11
    .line 12
    invoke-direct {v3, v1, v2}, Lq3/e;-><init>(Lokhttp3/g0;Lq3/b;)V

    .line 13
    .line 14
    .line 15
    return-object v3

    .line 16
    :cond_0
    iget-object v4, v3, Lq3/b;->a:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {v1}, Lokhttp3/g0;->isHttps()Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-eqz v5, :cond_1

    .line 23
    .line 24
    iget-boolean v5, v3, Lq3/b;->e:Z

    .line 25
    .line 26
    if-nez v5, :cond_1

    .line 27
    .line 28
    new-instance v3, Lq3/e;

    .line 29
    .line 30
    invoke-direct {v3, v1, v2}, Lq3/e;-><init>(Lokhttp3/g0;Lq3/b;)V

    .line 31
    .line 32
    .line 33
    return-object v3

    .line 34
    :cond_1
    invoke-interface {v4}, Ll6/b;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    check-cast v5, Lokhttp3/e;

    .line 39
    .line 40
    invoke-virtual {v1}, Lokhttp3/g0;->cacheControl()Lokhttp3/e;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-virtual {v6}, Lokhttp3/e;->noStore()Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-nez v6, :cond_12

    .line 49
    .line 50
    invoke-interface {v4}, Ll6/b;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    check-cast v6, Lokhttp3/e;

    .line 55
    .line 56
    invoke-virtual {v6}, Lokhttp3/e;->noStore()Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-nez v6, :cond_12

    .line 61
    .line 62
    iget-object v6, v3, Lq3/b;->f:Lokhttp3/y;

    .line 63
    .line 64
    const-string v7, "Vary"

    .line 65
    .line 66
    invoke-virtual {v6, v7}, Lokhttp3/y;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    const-string v7, "*"

    .line 71
    .line 72
    invoke-static {v6, v7}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-nez v6, :cond_12

    .line 77
    .line 78
    invoke-virtual {v1}, Lokhttp3/g0;->cacheControl()Lokhttp3/e;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-virtual {v6}, Lokhttp3/e;->noCache()Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-nez v7, :cond_11

    .line 87
    .line 88
    const-string v7, "If-Modified-Since"

    .line 89
    .line 90
    invoke-virtual {v1, v7}, Lokhttp3/g0;->header(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    if-nez v8, :cond_11

    .line 95
    .line 96
    const-string v8, "If-None-Match"

    .line 97
    .line 98
    invoke-virtual {v1, v8}, Lokhttp3/g0;->header(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v9

    .line 102
    if-eqz v9, :cond_2

    .line 103
    .line 104
    goto/16 :goto_5

    .line 105
    .line 106
    :cond_2
    iget-wide v9, v0, Lq3/d;->i:J

    .line 107
    .line 108
    iget-object v11, v0, Lq3/d;->c:Ljava/util/Date;

    .line 109
    .line 110
    const-wide/16 v12, 0x0

    .line 111
    .line 112
    if-eqz v11, :cond_3

    .line 113
    .line 114
    invoke-virtual {v11}, Ljava/util/Date;->getTime()J

    .line 115
    .line 116
    .line 117
    move-result-wide v14

    .line 118
    sub-long v14, v9, v14

    .line 119
    .line 120
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->max(JJ)J

    .line 121
    .line 122
    .line 123
    move-result-wide v14

    .line 124
    move-wide/from16 v16, v12

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_3
    move-wide v14, v12

    .line 128
    move-wide/from16 v16, v14

    .line 129
    .line 130
    :goto_0
    const/4 v12, -0x1

    .line 131
    iget v13, v0, Lq3/d;->k:I

    .line 132
    .line 133
    if-eq v13, v12, :cond_4

    .line 134
    .line 135
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 136
    .line 137
    int-to-long v12, v13

    .line 138
    invoke-virtual {v2, v12, v13}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 139
    .line 140
    .line 141
    move-result-wide v12

    .line 142
    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->max(JJ)J

    .line 143
    .line 144
    .line 145
    move-result-wide v14

    .line 146
    :cond_4
    iget-wide v12, v0, Lq3/d;->h:J

    .line 147
    .line 148
    sub-long v18, v9, v12

    .line 149
    .line 150
    sget-object v2, Lv3/n;->a:Lv3/m;

    .line 151
    .line 152
    invoke-virtual {v2}, Lv3/m;->invoke()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    check-cast v2, Ljava/lang/Number;

    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 159
    .line 160
    .line 161
    move-result-wide v20

    .line 162
    sub-long v20, v20, v9

    .line 163
    .line 164
    add-long v14, v14, v18

    .line 165
    .line 166
    add-long v14, v14, v20

    .line 167
    .line 168
    invoke-interface {v4}, Ll6/b;->getValue()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    check-cast v2, Lokhttp3/e;

    .line 173
    .line 174
    invoke-virtual {v2}, Lokhttp3/e;->maxAgeSeconds()I

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    move-object/from16 v18, v2

    .line 179
    .line 180
    iget-object v2, v0, Lq3/d;->e:Ljava/util/Date;

    .line 181
    .line 182
    move-object/from16 v19, v2

    .line 183
    .line 184
    const/4 v2, -0x1

    .line 185
    if-eq v4, v2, :cond_5

    .line 186
    .line 187
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 188
    .line 189
    invoke-virtual/range {v18 .. v18}, Lokhttp3/e;->maxAgeSeconds()I

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    int-to-long v9, v4

    .line 194
    invoke-virtual {v2, v9, v10}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 195
    .line 196
    .line 197
    move-result-wide v9

    .line 198
    goto :goto_1

    .line 199
    :cond_5
    iget-object v2, v0, Lq3/d;->g:Ljava/util/Date;

    .line 200
    .line 201
    if-eqz v2, :cond_8

    .line 202
    .line 203
    if-eqz v11, :cond_6

    .line 204
    .line 205
    invoke-virtual {v11}, Ljava/util/Date;->getTime()J

    .line 206
    .line 207
    .line 208
    move-result-wide v9

    .line 209
    :cond_6
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    .line 210
    .line 211
    .line 212
    move-result-wide v12

    .line 213
    sub-long v9, v12, v9

    .line 214
    .line 215
    cmp-long v2, v9, v16

    .line 216
    .line 217
    if-lez v2, :cond_7

    .line 218
    .line 219
    goto :goto_1

    .line 220
    :cond_7
    move-wide/from16 v9, v16

    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_8
    if-eqz v19, :cond_7

    .line 224
    .line 225
    invoke-virtual {v1}, Lokhttp3/g0;->url()Lokhttp3/z;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-virtual {v2}, Lokhttp3/z;->query()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    if-nez v2, :cond_7

    .line 234
    .line 235
    if-eqz v11, :cond_9

    .line 236
    .line 237
    invoke-virtual {v11}, Ljava/util/Date;->getTime()J

    .line 238
    .line 239
    .line 240
    move-result-wide v12

    .line 241
    :cond_9
    invoke-virtual/range {v19 .. v19}, Ljava/util/Date;->getTime()J

    .line 242
    .line 243
    .line 244
    move-result-wide v9

    .line 245
    sub-long/2addr v12, v9

    .line 246
    cmp-long v2, v12, v16

    .line 247
    .line 248
    if-lez v2, :cond_7

    .line 249
    .line 250
    const/16 v2, 0xa

    .line 251
    .line 252
    int-to-long v9, v2

    .line 253
    div-long v9, v12, v9

    .line 254
    .line 255
    :goto_1
    invoke-virtual {v6}, Lokhttp3/e;->maxAgeSeconds()I

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    const/4 v4, -0x1

    .line 260
    if-eq v2, v4, :cond_a

    .line 261
    .line 262
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 263
    .line 264
    invoke-virtual {v6}, Lokhttp3/e;->maxAgeSeconds()I

    .line 265
    .line 266
    .line 267
    move-result v12

    .line 268
    int-to-long v12, v12

    .line 269
    invoke-virtual {v2, v12, v13}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 270
    .line 271
    .line 272
    move-result-wide v12

    .line 273
    invoke-static {v9, v10, v12, v13}, Ljava/lang/Math;->min(JJ)J

    .line 274
    .line 275
    .line 276
    move-result-wide v9

    .line 277
    :cond_a
    invoke-virtual {v6}, Lokhttp3/e;->minFreshSeconds()I

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    if-eq v2, v4, :cond_b

    .line 282
    .line 283
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 284
    .line 285
    invoke-virtual {v6}, Lokhttp3/e;->minFreshSeconds()I

    .line 286
    .line 287
    .line 288
    move-result v12

    .line 289
    int-to-long v12, v12

    .line 290
    invoke-virtual {v2, v12, v13}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 291
    .line 292
    .line 293
    move-result-wide v12

    .line 294
    goto :goto_2

    .line 295
    :cond_b
    move-wide/from16 v12, v16

    .line 296
    .line 297
    :goto_2
    invoke-virtual {v5}, Lokhttp3/e;->mustRevalidate()Z

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    if-nez v2, :cond_c

    .line 302
    .line 303
    invoke-virtual {v6}, Lokhttp3/e;->maxStaleSeconds()I

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    if-eq v2, v4, :cond_c

    .line 308
    .line 309
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 310
    .line 311
    invoke-virtual {v6}, Lokhttp3/e;->maxStaleSeconds()I

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    move-object v6, v5

    .line 316
    int-to-long v4, v4

    .line 317
    invoke-virtual {v2, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 318
    .line 319
    .line 320
    move-result-wide v4

    .line 321
    move-wide/from16 v16, v4

    .line 322
    .line 323
    goto :goto_3

    .line 324
    :cond_c
    move-object v6, v5

    .line 325
    :goto_3
    invoke-virtual {v6}, Lokhttp3/e;->noCache()Z

    .line 326
    .line 327
    .line 328
    move-result v2

    .line 329
    if-nez v2, :cond_d

    .line 330
    .line 331
    add-long/2addr v14, v12

    .line 332
    add-long v9, v9, v16

    .line 333
    .line 334
    cmp-long v2, v14, v9

    .line 335
    .line 336
    if-gez v2, :cond_d

    .line 337
    .line 338
    new-instance v1, Lq3/e;

    .line 339
    .line 340
    const/4 v2, 0x0

    .line 341
    invoke-direct {v1, v2, v3}, Lq3/e;-><init>(Lokhttp3/g0;Lq3/b;)V

    .line 342
    .line 343
    .line 344
    return-object v1

    .line 345
    :cond_d
    iget-object v2, v0, Lq3/d;->j:Ljava/lang/String;

    .line 346
    .line 347
    if-eqz v2, :cond_e

    .line 348
    .line 349
    move-object v7, v8

    .line 350
    goto :goto_4

    .line 351
    :cond_e
    if-eqz v19, :cond_f

    .line 352
    .line 353
    iget-object v2, v0, Lq3/d;->f:Ljava/lang/String;

    .line 354
    .line 355
    invoke-static {v2}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    goto :goto_4

    .line 359
    :cond_f
    if-eqz v11, :cond_10

    .line 360
    .line 361
    iget-object v2, v0, Lq3/d;->d:Ljava/lang/String;

    .line 362
    .line 363
    invoke-static {v2}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    :goto_4
    invoke-virtual {v1}, Lokhttp3/g0;->newBuilder()Lokhttp3/g0$a;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    invoke-virtual {v1, v7, v2}, Lokhttp3/g0$a;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/g0$a;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    invoke-virtual {v1}, Lokhttp3/g0$a;->build()Lokhttp3/g0;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    new-instance v2, Lq3/e;

    .line 379
    .line 380
    invoke-direct {v2, v1, v3}, Lq3/e;-><init>(Lokhttp3/g0;Lq3/b;)V

    .line 381
    .line 382
    .line 383
    return-object v2

    .line 384
    :cond_10
    new-instance v2, Lq3/e;

    .line 385
    .line 386
    const/4 v3, 0x0

    .line 387
    invoke-direct {v2, v1, v3}, Lq3/e;-><init>(Lokhttp3/g0;Lq3/b;)V

    .line 388
    .line 389
    .line 390
    return-object v2

    .line 391
    :cond_11
    :goto_5
    move-object v3, v2

    .line 392
    new-instance v2, Lq3/e;

    .line 393
    .line 394
    invoke-direct {v2, v1, v3}, Lq3/e;-><init>(Lokhttp3/g0;Lq3/b;)V

    .line 395
    .line 396
    .line 397
    return-object v2

    .line 398
    :cond_12
    move-object v3, v2

    .line 399
    new-instance v2, Lq3/e;

    .line 400
    .line 401
    invoke-direct {v2, v1, v3}, Lq3/e;-><init>(Lokhttp3/g0;Lq3/b;)V

    .line 402
    .line 403
    .line 404
    return-object v2
.end method
