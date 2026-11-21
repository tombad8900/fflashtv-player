.class public final Lz4/k0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final a:Lz4/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lz4/k0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lz4/k0;->a:Lz4/k0;

    .line 7
    .line 8
    return-void
.end method

.method public static b(Lorg/json/JSONObject;)Ljava/util/List;
    .locals 14

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lm6/p;->j:Lm6/p;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    move v3, v2

    .line 23
    :goto_0
    if-ge v3, v1, :cond_15

    .line 24
    .line 25
    invoke-virtual {p0, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    if-nez v4, :cond_1

    .line 30
    .line 31
    goto/16 :goto_a

    .line 32
    .line 33
    :cond_1
    const-string v5, "url"

    .line 34
    .line 35
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-static {v5}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v5}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    const/4 v7, 0x0

    .line 47
    if-nez v6, :cond_2

    .line 48
    .line 49
    move-object v9, v5

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move-object v9, v7

    .line 52
    :goto_1
    if-nez v9, :cond_3

    .line 53
    .line 54
    goto/16 :goto_9

    .line 55
    .line 56
    :cond_3
    new-instance v10, Ljava/util/LinkedHashMap;

    .line 57
    .line 58
    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string v5, "headers"

    .line 62
    .line 63
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    if-eqz v5, :cond_4

    .line 68
    .line 69
    invoke-virtual {v5}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    const-string v8, "keys(...)"

    .line 74
    .line 75
    invoke-static {v8, v6}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    if-eqz v8, :cond_4

    .line 83
    .line 84
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    check-cast v8, Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v11

    .line 94
    invoke-interface {v10, v8, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    invoke-virtual {v10}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    const-string v6, "<get-keys>(...)"

    .line 103
    .line 104
    invoke-static {v6, v5}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    const-string v11, "User-Agent"

    .line 112
    .line 113
    if-eqz v8, :cond_5

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    :cond_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    if-eqz v8, :cond_7

    .line 125
    .line 126
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    check-cast v8, Ljava/lang/String;

    .line 131
    .line 132
    invoke-static {v8, v11}, Lh7/p;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    if-eqz v8, :cond_6

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_7
    :goto_3
    const-string v5, "user_agent"

    .line 140
    .line 141
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    invoke-static {v5}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-static {v5}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 149
    .line 150
    .line 151
    move-result v8

    .line 152
    if-nez v8, :cond_8

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_8
    move-object v5, v7

    .line 156
    :goto_4
    if-eqz v5, :cond_9

    .line 157
    .line 158
    invoke-interface {v10, v11, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    :cond_9
    :goto_5
    invoke-virtual {v10}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    invoke-static {v6, v5}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 169
    .line 170
    .line 171
    move-result v8

    .line 172
    const-string v12, "Referer"

    .line 173
    .line 174
    if-eqz v8, :cond_a

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_a
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    :cond_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    if-eqz v8, :cond_c

    .line 186
    .line 187
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    check-cast v8, Ljava/lang/String;

    .line 192
    .line 193
    invoke-static {v8, v12}, Lh7/p;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    if-eqz v8, :cond_b

    .line 198
    .line 199
    goto :goto_8

    .line 200
    :cond_c
    :goto_6
    const-string v5, "referer"

    .line 201
    .line 202
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-static {v4}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    invoke-static {v4}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    if-nez v5, :cond_d

    .line 214
    .line 215
    goto :goto_7

    .line 216
    :cond_d
    move-object v4, v7

    .line 217
    :goto_7
    if-eqz v4, :cond_e

    .line 218
    .line 219
    invoke-interface {v10, v12, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    :cond_e
    :goto_8
    invoke-virtual {v10}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    invoke-static {v6, v4}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    :cond_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    if-eqz v5, :cond_10

    .line 238
    .line 239
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    move-object v6, v5

    .line 244
    check-cast v6, Ljava/lang/String;

    .line 245
    .line 246
    invoke-static {v6, v11}, Lh7/p;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 247
    .line 248
    .line 249
    move-result v6

    .line 250
    if-eqz v6, :cond_f

    .line 251
    .line 252
    move-object v7, v5

    .line 253
    :cond_10
    check-cast v7, Ljava/lang/String;

    .line 254
    .line 255
    if-eqz v7, :cond_12

    .line 256
    .line 257
    invoke-virtual {v10, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    check-cast v4, Ljava/lang/String;

    .line 262
    .line 263
    const-string v5, ""

    .line 264
    .line 265
    if-nez v4, :cond_11

    .line 266
    .line 267
    move-object v4, v5

    .line 268
    :cond_11
    const-string v6, "\u3164 "

    .line 269
    .line 270
    invoke-static {v4, v6, v2}, Lh7/h;->u0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    if-eqz v4, :cond_12

    .line 275
    .line 276
    invoke-interface {v10, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    :cond_12
    new-instance v8, Lcom/exotv/net/model/ResolvedStream;

    .line 280
    .line 281
    const/4 v12, 0x4

    .line 282
    const/4 v13, 0x0

    .line 283
    const/4 v11, 0x0

    .line 284
    invoke-direct/range {v8 .. v13}, Lcom/exotv/net/model/ResolvedStream;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILz6/e;)V

    .line 285
    .line 286
    .line 287
    move-object v7, v8

    .line 288
    :goto_9
    if-nez v7, :cond_13

    .line 289
    .line 290
    goto :goto_a

    .line 291
    :cond_13
    invoke-virtual {v7}, Lcom/exotv/net/model/ResolvedStream;->getUrl()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    invoke-virtual {v0, v4}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v4

    .line 299
    if-nez v4, :cond_14

    .line 300
    .line 301
    invoke-virtual {v7}, Lcom/exotv/net/model/ResolvedStream;->getUrl()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    invoke-interface {v0, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    :cond_14
    invoke-virtual {v0}, Ljava/util/AbstractMap;->size()I

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    const/4 v5, 0x6

    .line 313
    if-ge v4, v5, :cond_15

    .line 314
    .line 315
    :goto_a
    add-int/lit8 v3, v3, 0x1

    .line 316
    .line 317
    goto/16 :goto_0

    .line 318
    .line 319
    :cond_15
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 320
    .line 321
    .line 322
    move-result-object p0

    .line 323
    const-string v0, "<get-values>(...)"

    .line 324
    .line 325
    invoke-static {v0, p0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    invoke-static {p0}, Lm6/h;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 329
    .line 330
    .line 331
    move-result-object p0

    .line 332
    return-object p0
.end method

.method public static c(Lorg/json/JSONObject;)Ljava/util/List;
    .locals 6

    .line 1
    const-string v0, "channels"

    .line 2
    .line 3
    const-string v1, "list"

    .line 4
    .line 5
    const-string v2, "data"

    .line 6
    .line 7
    const-string v3, "categories"

    .line 8
    .line 9
    const-string v4, "items"

    .line 10
    .line 11
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lm6/i;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    instance-of v5, v1, Lorg/json/JSONArray;

    .line 41
    .line 42
    if-eqz v5, :cond_0

    .line 43
    .line 44
    check-cast v1, Lorg/json/JSONArray;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move-object v1, v3

    .line 48
    :goto_0
    if-nez v1, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-eqz p0, :cond_3

    .line 55
    .line 56
    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    move-object v3, v1

    .line 62
    :cond_3
    :goto_1
    if-nez v3, :cond_4

    .line 63
    .line 64
    sget-object p0, Lm6/p;->j:Lm6/p;

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_4
    invoke-static {}, Lcom/bumptech/glide/d;->w()Ln6/c;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    const/4 v1, 0x0

    .line 76
    :goto_2
    if-ge v1, v0, :cond_6

    .line 77
    .line 78
    invoke-virtual {v3, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    if-eqz v2, :cond_5

    .line 83
    .line 84
    invoke-virtual {p0, v2}, Ln6/c;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    invoke-static {p0}, Lcom/bumptech/glide/d;->h(Ln6/c;)Ln6/c;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Lr6/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p3, Lz4/h0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lz4/h0;

    .line 7
    .line 8
    iget v1, v0, Lz4/h0;->p:I

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
    iput v1, v0, Lz4/h0;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lz4/h0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lz4/h0;-><init>(Lz4/k0;Lr6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lz4/h0;->n:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lq6/a;->j:Lq6/a;

    .line 28
    .line 29
    iget v2, v0, Lz4/h0;->p:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    sget-object v5, Lm6/p;->j:Lm6/p;

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lz4/h0;->m:Ljava/lang/String;

    .line 40
    .line 41
    :try_start_0
    invoke-static {p3}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    move-object p1, v0

    .line 47
    goto/16 :goto_b

    .line 48
    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    invoke-static {p3}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :try_start_1
    iput-object p1, v0, Lz4/h0;->m:Ljava/lang/String;

    .line 61
    .line 62
    iput v3, v0, Lz4/h0;->p:I

    .line 63
    .line 64
    sget-object p3, Li7/e0;->a:Lo7/e;

    .line 65
    .line 66
    sget-object p3, Lo7/d;->l:Lo7/d;

    .line 67
    .line 68
    new-instance v2, Lb5/b;

    .line 69
    .line 70
    invoke-direct {v2, p2, v4}, Lb5/b;-><init>(Ljava/lang/String;Lp6/c;)V

    .line 71
    .line 72
    .line 73
    invoke-static {p3, v2, v0}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    if-ne p3, v1, :cond_3

    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_3
    :goto_1
    check-cast p3, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    .line 82
    if-nez p3, :cond_4

    .line 83
    .line 84
    goto/16 :goto_c

    .line 85
    .line 86
    :cond_4
    const/4 p2, 0x2

    .line 87
    :try_start_2
    const-string v0, "4e5c6d1a8b3fe8137a3b9df26a9c4de195267b8e6f6c0b4e1c3ae1d27f2b4e6f"

    .line 88
    .line 89
    invoke-static {v0}, Lt2/w;->t(Ljava/lang/String;)[B

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const-string v1, "a9c21f8d7e6b4a9db12e4f9d5c1a7b8e"

    .line 94
    .line 95
    invoke-static {v1}, Lt2/w;->t(Ljava/lang/String;)[B

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-static {p3}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    invoke-static {p3}, Lt2/i0;->a(Ljava/lang/String;)[B

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    new-instance v2, Ljava/lang/String;

    .line 112
    .line 113
    const-string v6, "AES/CBC/PKCS5Padding"

    .line 114
    .line 115
    invoke-static {v6}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    new-instance v7, Ljavax/crypto/spec/SecretKeySpec;

    .line 120
    .line 121
    const-string v8, "AES"

    .line 122
    .line 123
    invoke-direct {v7, v0, v8}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 124
    .line 125
    .line 126
    new-instance v0, Ljavax/crypto/spec/IvParameterSpec;

    .line 127
    .line 128
    invoke-direct {v0, v1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v6, p2, v7, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v6, p3}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 135
    .line 136
    .line 137
    move-result-object p3

    .line 138
    const-string v0, "doFinal(...)"

    .line 139
    .line 140
    invoke-static {v0, p3}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    sget-object v0, Lh7/a;->a:Ljava/nio/charset/Charset;

    .line 144
    .line 145
    invoke-direct {v2, p3, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :catchall_1
    move-object v2, v4

    .line 150
    :goto_2
    if-nez v2, :cond_5

    .line 151
    .line 152
    goto :goto_7

    .line 153
    :cond_5
    :try_start_3
    new-instance p3, Lorg/json/JSONObject;

    .line 154
    .line 155
    invoke-direct {p3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    const-string v0, "data"

    .line 159
    .line 160
    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 161
    .line 162
    .line 163
    move-result-object p3

    .line 164
    if-eqz p3, :cond_6

    .line 165
    .line 166
    const-string v0, "items"

    .line 167
    .line 168
    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 169
    .line 170
    .line 171
    move-result-object p3

    .line 172
    if-nez p3, :cond_7

    .line 173
    .line 174
    :cond_6
    new-instance p3, Lorg/json/JSONArray;

    .line 175
    .line 176
    invoke-direct {p3}, Lorg/json/JSONArray;-><init>()V

    .line 177
    .line 178
    .line 179
    :cond_7
    invoke-virtual {p3}, Lorg/json/JSONArray;->length()I

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    const/4 v1, 0x0

    .line 184
    move v2, v1

    .line 185
    :goto_3
    if-ge v2, v0, :cond_b

    .line 186
    .line 187
    invoke-virtual {p3, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    if-nez v6, :cond_8

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_8
    const-string v7, "id"

    .line 195
    .line 196
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    if-eqz v7, :cond_9

    .line 201
    .line 202
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    goto :goto_4

    .line 207
    :cond_9
    move-object v7, v4

    .line 208
    :goto_4
    invoke-static {v7, p1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    if-eqz v7, :cond_a

    .line 213
    .line 214
    move-object v4, v6

    .line 215
    goto :goto_6

    .line 216
    :cond_a
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_b
    :goto_6
    if-nez v4, :cond_c

    .line 220
    .line 221
    :goto_7
    return-object v5

    .line 222
    :cond_c
    const-string p1, "source"

    .line 223
    .line 224
    invoke-virtual {v4, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    const-string p3, "optString(...)"

    .line 229
    .line 230
    invoke-static {p3, p1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    const-string p3, "http"

    .line 234
    .line 235
    invoke-static {p1, p3, v1, v3, p2}, Lh7/h;->B0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 236
    .line 237
    .line 238
    move-result p2

    .line 239
    if-ltz p2, :cond_d

    .line 240
    .line 241
    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    const-string p2, "substring(...)"

    .line 246
    .line 247
    invoke-static {p2, p1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-static {p1}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    goto :goto_9

    .line 255
    :goto_8
    move-object v7, p1

    .line 256
    goto :goto_a

    .line 257
    :cond_d
    invoke-static {p1}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    :goto_9
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    goto :goto_8

    .line 266
    :goto_a
    invoke-static {v7}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 267
    .line 268
    .line 269
    move-result p1

    .line 270
    if-eqz p1, :cond_e

    .line 271
    .line 272
    goto :goto_c

    .line 273
    :cond_e
    new-instance v6, Lcom/exotv/net/model/ResolvedStream;

    .line 274
    .line 275
    const-string p1, "Referer"

    .line 276
    .line 277
    const-string p2, "https://www2.maziika.shop/"

    .line 278
    .line 279
    new-instance p3, Ll6/d;

    .line 280
    .line 281
    invoke-direct {p3, p1, p2}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    const-string p1, "User-Agent"

    .line 285
    .line 286
    const-string p2, "agent"

    .line 287
    .line 288
    invoke-virtual {v4, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p2

    .line 292
    new-instance v0, Ll6/d;

    .line 293
    .line 294
    invoke-direct {v0, p1, p2}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    filled-new-array {p3, v0}, [Ll6/d;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-static {p1}, Lm6/s;->U([Ll6/d;)Ljava/util/Map;

    .line 302
    .line 303
    .line 304
    move-result-object v8

    .line 305
    const/4 v10, 0x4

    .line 306
    const/4 v11, 0x0

    .line 307
    const/4 v9, 0x0

    .line 308
    invoke-direct/range {v6 .. v11}, Lcom/exotv/net/model/ResolvedStream;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILz6/e;)V

    .line 309
    .line 310
    .line 311
    invoke-static {v6}, Lcom/bumptech/glide/d;->T(Ljava/lang/Object;)Ljava/util/List;

    .line 312
    .line 313
    .line 314
    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 315
    goto :goto_c

    .line 316
    :goto_b
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object p2

    .line 320
    new-instance p3, Ljava/lang/StringBuilder;

    .line 321
    .line 322
    const-string v0, "o resolve error: "

    .line 323
    .line 324
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object p2

    .line 334
    const-string p3, "SimpleResolvers"

    .line 335
    .line 336
    invoke-static {p3, p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 337
    .line 338
    .line 339
    :goto_c
    return-object v5
.end method

.method public final d(Ljava/lang/String;Lr6/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lz4/i0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lz4/i0;

    .line 7
    .line 8
    iget v1, v0, Lz4/i0;->p:I

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
    iput v1, v0, Lz4/i0;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lz4/i0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lz4/i0;-><init>(Lz4/k0;Lr6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lz4/i0;->n:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lq6/a;->j:Lq6/a;

    .line 28
    .line 29
    iget v2, v0, Lz4/i0;->p:I

    .line 30
    .line 31
    const-string v3, "SimpleResolvers"

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v5, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lz4/i0;->m:Lz4/k0;

    .line 40
    .line 41
    :try_start_0
    invoke-static {p2}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catchall_0
    move-exception p2

    .line 46
    goto :goto_4

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    invoke-static {p2}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :try_start_1
    iput-object p0, v0, Lz4/i0;->m:Lz4/k0;

    .line 59
    .line 60
    iput v5, v0, Lz4/i0;->p:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 61
    .line 62
    :try_start_2
    sget-object p2, Li7/e0;->a:Lo7/e;

    .line 63
    .line 64
    sget-object p2, Lo7/d;->l:Lo7/d;

    .line 65
    .line 66
    new-instance v2, Lb5/a;

    .line 67
    .line 68
    invoke-direct {v2, p1, v4}, Lb5/a;-><init>(Ljava/lang/String;Lp6/c;)V

    .line 69
    .line 70
    .line 71
    invoke-static {p2, v2, v0}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 75
    if-ne p2, v1, :cond_3

    .line 76
    .line 77
    return-object v1

    .line 78
    :cond_3
    move-object p1, p0

    .line 79
    :goto_1
    :try_start_3
    check-cast p2, Lb5/j;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 80
    .line 81
    move-object v4, p2

    .line 82
    goto :goto_5

    .line 83
    :goto_2
    move-object p2, p1

    .line 84
    goto :goto_3

    .line 85
    :catchall_1
    move-exception p1

    .line 86
    goto :goto_2

    .line 87
    :goto_3
    move-object p1, p0

    .line 88
    goto :goto_4

    .line 89
    :catchall_2
    move-exception p2

    .line 90
    goto :goto_3

    .line 91
    :goto_4
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    new-instance v1, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v2, "yt resolve error: "

    .line 98
    .line 99
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {v3, v0, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 110
    .line 111
    .line 112
    :goto_5
    sget-object p2, Lm6/p;->j:Lm6/p;

    .line 113
    .line 114
    if-nez v4, :cond_4

    .line 115
    .line 116
    return-object p2

    .line 117
    :cond_4
    iget-object v0, v4, Lb5/j;->a:Ljava/lang/String;

    .line 118
    .line 119
    iget-object v1, v4, Lb5/j;->b:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    :try_start_4
    new-instance p1, Lorg/json/JSONObject;

    .line 125
    .line 126
    invoke-static {v0}, Lt2/i0;->a(Ljava/lang/String;)[B

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    if-nez v1, :cond_5

    .line 131
    .line 132
    const-string v1, ""

    .line 133
    .line 134
    :cond_5
    const-string v2, "c!xZj+N9&G@Ev@vw"

    .line 135
    .line 136
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    sget-object v2, Lh7/a;->a:Ljava/nio/charset/Charset;

    .line 141
    .line 142
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    const-string v2, "getBytes(...)"

    .line 147
    .line 148
    invoke-static {v2, v1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    array-length v2, v0

    .line 152
    new-array v2, v2, [B

    .line 153
    .line 154
    array-length v4, v0

    .line 155
    const/4 v5, 0x0

    .line 156
    :goto_6
    if-ge v5, v4, :cond_6

    .line 157
    .line 158
    aget-byte v6, v0, v5

    .line 159
    .line 160
    array-length v7, v1

    .line 161
    rem-int v7, v5, v7

    .line 162
    .line 163
    aget-byte v7, v1, v7

    .line 164
    .line 165
    xor-int/2addr v6, v7

    .line 166
    int-to-byte v6, v6

    .line 167
    aput-byte v6, v2, v5

    .line 168
    .line 169
    add-int/lit8 v5, v5, 0x1

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_6
    new-instance v0, Ljava/lang/String;

    .line 173
    .line 174
    sget-object v1, Lh7/a;->a:Ljava/nio/charset/Charset;

    .line 175
    .line 176
    invoke-direct {v0, v2, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 177
    .line 178
    .line 179
    invoke-direct {p1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-static {p1}, Lz4/k0;->b(Lorg/json/JSONObject;)Ljava/util/List;

    .line 183
    .line 184
    .line 185
    move-result-object p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 186
    goto :goto_7

    .line 187
    :catchall_3
    move-exception p1

    .line 188
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    new-instance v0, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    const-string v1, "yt payload could not be read: "

    .line 195
    .line 196
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 207
    .line 208
    .line 209
    :goto_7
    return-object p2
.end method

.method public final e(Lcom/exotv/net/model/Channel;Lr6/c;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    instance-of v2, v0, Lz4/j0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lz4/j0;

    .line 11
    .line 12
    iget v3, v2, Lz4/j0;->q:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lz4/j0;->q:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lz4/j0;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Lz4/j0;-><init>(Lz4/k0;Lr6/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Lz4/j0;->o:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Lq6/a;->j:Lq6/a;

    .line 32
    .line 33
    iget v4, v2, Lz4/j0;->q:I

    .line 34
    .line 35
    const-string v5, "optString(...)"

    .line 36
    .line 37
    const-string v6, "id"

    .line 38
    .line 39
    const-string v7, "\' not found among "

    .line 40
    .line 41
    const-string v8, "name"

    .line 42
    .line 43
    const-string v10, "getBytes(...)"

    .line 44
    .line 45
    const-string v11, "c!xZj+N9&G@Ev@vw"

    .line 46
    .line 47
    const-string v12, ""

    .line 48
    .line 49
    const-string v14, "SimpleResolvers"

    .line 50
    .line 51
    const/4 v15, 0x2

    .line 52
    const/4 v9, 0x1

    .line 53
    sget-object v16, Lm6/p;->j:Lm6/p;

    .line 54
    .line 55
    const/4 v13, 0x0

    .line 56
    if-eqz v4, :cond_4

    .line 57
    .line 58
    if-eq v4, v9, :cond_3

    .line 59
    .line 60
    if-eq v4, v15, :cond_2

    .line 61
    .line 62
    const/4 v9, 0x3

    .line 63
    if-ne v4, v9, :cond_1

    .line 64
    .line 65
    :try_start_0
    invoke-static {v0}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    goto/16 :goto_9

    .line 69
    .line 70
    :catchall_0
    move-exception v0

    .line 71
    goto/16 :goto_a

    .line 72
    .line 73
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 76
    .line 77
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v0

    .line 81
    :cond_2
    iget-object v4, v2, Lz4/j0;->n:Lcom/exotv/net/model/Channel;

    .line 82
    .line 83
    iget-object v9, v2, Lz4/j0;->m:Lz4/k0;

    .line 84
    .line 85
    :try_start_1
    invoke-static {v0}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    .line 87
    .line 88
    move-object/from16 v17, v12

    .line 89
    .line 90
    const/4 v13, 0x0

    .line 91
    goto/16 :goto_4

    .line 92
    .line 93
    :cond_3
    iget-object v4, v2, Lz4/j0;->n:Lcom/exotv/net/model/Channel;

    .line 94
    .line 95
    iget-object v9, v2, Lz4/j0;->m:Lz4/k0;

    .line 96
    .line 97
    :try_start_2
    invoke-static {v0}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 98
    .line 99
    .line 100
    move-object/from16 v20, v4

    .line 101
    .line 102
    move-object v4, v0

    .line 103
    move-object/from16 v0, v20

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_4
    invoke-static {v0}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :try_start_3
    iput-object v1, v2, Lz4/j0;->m:Lz4/k0;

    .line 110
    .line 111
    move-object/from16 v0, p1

    .line 112
    .line 113
    iput-object v0, v2, Lz4/j0;->n:Lcom/exotv/net/model/Channel;

    .line 114
    .line 115
    iput v9, v2, Lz4/j0;->q:I

    .line 116
    .line 117
    sget-object v4, Li7/e0;->a:Lo7/e;

    .line 118
    .line 119
    sget-object v4, Lo7/d;->l:Lo7/d;

    .line 120
    .line 121
    new-instance v9, Lb5/c;

    .line 122
    .line 123
    invoke-direct {v9, v15, v13}, Lr6/h;-><init>(ILp6/c;)V

    .line 124
    .line 125
    .line 126
    invoke-static {v4, v9, v2}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    if-ne v4, v3, :cond_5

    .line 131
    .line 132
    goto/16 :goto_8

    .line 133
    .line 134
    :cond_5
    move-object v9, v1

    .line 135
    :goto_1
    check-cast v4, Lb5/j;

    .line 136
    .line 137
    if-nez v4, :cond_6

    .line 138
    .line 139
    goto/16 :goto_5

    .line 140
    .line 141
    :cond_6
    new-instance v13, Lorg/json/JSONObject;

    .line 142
    .line 143
    iget-object v15, v4, Lb5/j;->a:Ljava/lang/String;

    .line 144
    .line 145
    iget-object v4, v4, Lb5/j;->b:Ljava/lang/String;

    .line 146
    .line 147
    invoke-static {v15}, Lt2/i0;->a(Ljava/lang/String;)[B

    .line 148
    .line 149
    .line 150
    move-result-object v15

    .line 151
    if-nez v4, :cond_7

    .line 152
    .line 153
    move-object v4, v12

    .line 154
    :cond_7
    invoke-virtual {v11, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    sget-object v1, Lh7/a;->a:Ljava/nio/charset/Charset;

    .line 159
    .line 160
    invoke-virtual {v4, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-static {v10, v1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    array-length v4, v15

    .line 168
    new-array v4, v4, [B

    .line 169
    .line 170
    move-object/from16 v17, v12

    .line 171
    .line 172
    array-length v12, v15

    .line 173
    move-object/from16 p1, v15

    .line 174
    .line 175
    const/4 v15, 0x0

    .line 176
    :goto_2
    if-ge v15, v12, :cond_8

    .line 177
    .line 178
    aget-byte v18, p1, v15

    .line 179
    .line 180
    move/from16 v19, v12

    .line 181
    .line 182
    array-length v12, v1

    .line 183
    rem-int v12, v15, v12

    .line 184
    .line 185
    aget-byte v12, v1, v12

    .line 186
    .line 187
    xor-int v12, v18, v12

    .line 188
    .line 189
    int-to-byte v12, v12

    .line 190
    aput-byte v12, v4, v15

    .line 191
    .line 192
    add-int/lit8 v15, v15, 0x1

    .line 193
    .line 194
    move/from16 v12, v19

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_8
    new-instance v1, Ljava/lang/String;

    .line 198
    .line 199
    sget-object v12, Lh7/a;->a:Ljava/nio/charset/Charset;

    .line 200
    .line 201
    invoke-direct {v1, v4, v12}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 202
    .line 203
    .line 204
    invoke-direct {v13, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-static {v13}, Lz4/k0;->c(Lorg/json/JSONObject;)Ljava/util/List;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    :cond_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v12

    .line 222
    if-eqz v12, :cond_a

    .line 223
    .line 224
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v12

    .line 228
    move-object v13, v12

    .line 229
    check-cast v13, Lorg/json/JSONObject;

    .line 230
    .line 231
    invoke-virtual {v13, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v13

    .line 235
    invoke-virtual {v0}, Lcom/exotv/net/model/Channel;->getCatRealName()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v15

    .line 239
    invoke-static {v13, v15}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v13

    .line 243
    if-eqz v13, :cond_9

    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_a
    const/4 v12, 0x0

    .line 247
    :goto_3
    check-cast v12, Lorg/json/JSONObject;

    .line 248
    .line 249
    if-nez v12, :cond_b

    .line 250
    .line 251
    invoke-virtual {v0}, Lcom/exotv/net/model/Channel;->getCatRealName()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    new-instance v2, Ljava/lang/StringBuilder;

    .line 260
    .line 261
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 262
    .line 263
    .line 264
    const-string v3, "ytv category \'"

    .line 265
    .line 266
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-static {v14, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 283
    .line 284
    .line 285
    return-object v16

    .line 286
    :cond_b
    invoke-virtual {v12, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    invoke-static {v5, v1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    iput-object v9, v2, Lz4/j0;->m:Lz4/k0;

    .line 294
    .line 295
    iput-object v0, v2, Lz4/j0;->n:Lcom/exotv/net/model/Channel;

    .line 296
    .line 297
    const/4 v4, 0x2

    .line 298
    iput v4, v2, Lz4/j0;->q:I

    .line 299
    .line 300
    sget-object v4, Li7/e0;->a:Lo7/e;

    .line 301
    .line 302
    sget-object v4, Lo7/d;->l:Lo7/d;

    .line 303
    .line 304
    new-instance v12, Lb5/d;

    .line 305
    .line 306
    const/4 v13, 0x0

    .line 307
    const/4 v15, 0x0

    .line 308
    invoke-direct {v12, v1, v15, v13}, Lb5/d;-><init>(Ljava/lang/String;Lp6/c;I)V

    .line 309
    .line 310
    .line 311
    invoke-static {v4, v12, v2}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    if-ne v1, v3, :cond_c

    .line 316
    .line 317
    goto/16 :goto_8

    .line 318
    .line 319
    :cond_c
    move-object v4, v0

    .line 320
    move-object v0, v1

    .line 321
    :goto_4
    check-cast v0, Lb5/j;

    .line 322
    .line 323
    if-nez v0, :cond_d

    .line 324
    .line 325
    :goto_5
    return-object v16

    .line 326
    :cond_d
    new-instance v1, Lorg/json/JSONObject;

    .line 327
    .line 328
    iget-object v12, v0, Lb5/j;->a:Ljava/lang/String;

    .line 329
    .line 330
    iget-object v0, v0, Lb5/j;->b:Ljava/lang/String;

    .line 331
    .line 332
    invoke-static {v12}, Lt2/i0;->a(Ljava/lang/String;)[B

    .line 333
    .line 334
    .line 335
    move-result-object v12

    .line 336
    if-nez v0, :cond_e

    .line 337
    .line 338
    move-object/from16 v0, v17

    .line 339
    .line 340
    :cond_e
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    sget-object v11, Lh7/a;->a:Ljava/nio/charset/Charset;

    .line 345
    .line 346
    invoke-virtual {v0, v11}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-static {v10, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    array-length v10, v12

    .line 354
    new-array v10, v10, [B

    .line 355
    .line 356
    array-length v11, v12

    .line 357
    :goto_6
    if-ge v13, v11, :cond_f

    .line 358
    .line 359
    aget-byte v15, v12, v13

    .line 360
    .line 361
    move-object/from16 p1, v4

    .line 362
    .line 363
    array-length v4, v0

    .line 364
    rem-int v4, v13, v4

    .line 365
    .line 366
    aget-byte v4, v0, v4

    .line 367
    .line 368
    xor-int/2addr v4, v15

    .line 369
    int-to-byte v4, v4

    .line 370
    aput-byte v4, v10, v13

    .line 371
    .line 372
    add-int/lit8 v13, v13, 0x1

    .line 373
    .line 374
    move-object/from16 v4, p1

    .line 375
    .line 376
    goto :goto_6

    .line 377
    :cond_f
    move-object/from16 p1, v4

    .line 378
    .line 379
    new-instance v0, Ljava/lang/String;

    .line 380
    .line 381
    sget-object v4, Lh7/a;->a:Ljava/nio/charset/Charset;

    .line 382
    .line 383
    invoke-direct {v0, v10, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 384
    .line 385
    .line 386
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    invoke-static {v1}, Lz4/k0;->c(Lorg/json/JSONObject;)Ljava/util/List;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    :cond_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 401
    .line 402
    .line 403
    move-result v4

    .line 404
    if-eqz v4, :cond_11

    .line 405
    .line 406
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v15

    .line 410
    move-object v4, v15

    .line 411
    check-cast v4, Lorg/json/JSONObject;

    .line 412
    .line 413
    invoke-virtual {v4, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v4

    .line 417
    invoke-virtual/range {p1 .. p1}, Lcom/exotv/net/model/Channel;->getChRealName()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v10

    .line 421
    invoke-static {v4, v10}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v4

    .line 425
    if-eqz v4, :cond_10

    .line 426
    .line 427
    goto :goto_7

    .line 428
    :cond_11
    const/4 v15, 0x0

    .line 429
    :goto_7
    check-cast v15, Lorg/json/JSONObject;

    .line 430
    .line 431
    if-nez v15, :cond_12

    .line 432
    .line 433
    invoke-virtual/range {p1 .. p1}, Lcom/exotv/net/model/Channel;->getChRealName()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    new-instance v2, Ljava/lang/StringBuilder;

    .line 442
    .line 443
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 444
    .line 445
    .line 446
    const-string v3, "ytv channel \'"

    .line 447
    .line 448
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    invoke-static {v14, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 465
    .line 466
    .line 467
    return-object v16

    .line 468
    :cond_12
    invoke-virtual {v15, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    invoke-static {v5, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    const/4 v15, 0x0

    .line 476
    iput-object v15, v2, Lz4/j0;->m:Lz4/k0;

    .line 477
    .line 478
    iput-object v15, v2, Lz4/j0;->n:Lcom/exotv/net/model/Channel;

    .line 479
    .line 480
    const/4 v1, 0x3

    .line 481
    iput v1, v2, Lz4/j0;->q:I

    .line 482
    .line 483
    invoke-virtual {v9, v0, v2}, Lz4/k0;->d(Ljava/lang/String;Lr6/c;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    if-ne v0, v3, :cond_13

    .line 488
    .line 489
    :goto_8
    return-object v3

    .line 490
    :cond_13
    :goto_9
    check-cast v0, Ljava/util/List;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 491
    .line 492
    return-object v0

    .line 493
    :goto_a
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    new-instance v2, Ljava/lang/StringBuilder;

    .line 498
    .line 499
    const-string v3, "ytv resolve error: "

    .line 500
    .line 501
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    invoke-static {v14, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 512
    .line 513
    .line 514
    return-object v16
.end method
