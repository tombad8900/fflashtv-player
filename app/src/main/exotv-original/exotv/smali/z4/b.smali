.class public final Lz4/b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final a(Lr6/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p0, Lz4/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lz4/a;

    .line 7
    .line 8
    iget v1, v0, Lz4/a;->n:I

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
    iput v1, v0, Lz4/a;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lz4/a;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Lr6/c;-><init>(Lp6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Lz4/a;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lq6/a;->j:Lq6/a;

    .line 28
    .line 29
    iget v2, v0, Lz4/a;->n:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    :try_start_0
    invoke-static {p0}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 38
    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p0

    .line 49
    :cond_2
    invoke-static {p0}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :try_start_1
    iput v3, v0, Lz4/a;->n:I

    .line 53
    .line 54
    sget-object p0, Lb5/h;->a:Lb5/i;

    .line 55
    .line 56
    if-eqz p0, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    sget-object p0, Li7/e0;->a:Lo7/e;

    .line 60
    .line 61
    sget-object p0, Lo7/d;->l:Lo7/d;

    .line 62
    .line 63
    new-instance v2, Lb5/g;

    .line 64
    .line 65
    const/4 v3, 0x2

    .line 66
    invoke-direct {v2, v3, v4}, Lr6/h;-><init>(ILp6/c;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p0, v2, v0}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    :goto_1
    if-ne p0, v1, :cond_4

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_4
    :goto_2
    check-cast p0, Lb5/i;

    .line 77
    .line 78
    iget-object p0, p0, Lb5/i;->h:Ljava/lang/String;

    .line 79
    .line 80
    if-eqz p0, :cond_5

    .line 81
    .line 82
    invoke-static {p0}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_5

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_5
    move-object p0, v4

    .line 90
    :goto_3
    if-nez p0, :cond_6

    .line 91
    .line 92
    goto :goto_6

    .line 93
    :cond_6
    new-instance v0, Lokhttp3/g0$a;

    .line 94
    .line 95
    invoke-direct {v0}, Lokhttp3/g0$a;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, p0}, Lokhttp3/g0$a;->url(Ljava/lang/String;)Lokhttp3/g0$a;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    const-string v0, "User-Agent"

    .line 103
    .line 104
    const-string v1, "okhttp/4.12.0"

    .line 105
    .line 106
    invoke-virtual {p0, v0, v1}, Lokhttp3/g0$a;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/g0$a;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0}, Lokhttp3/g0$a;->build()Lokhttp3/g0;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    sget-object v0, Lb5/m;->a:Lokhttp3/e0;

    .line 115
    .line 116
    invoke-virtual {v0, p0}, Lokhttp3/e0;->newCall(Lokhttp3/g0;)Lokhttp3/g;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-interface {p0}, Lokhttp3/g;->execute()Lokhttp3/i0;

    .line 121
    .line 122
    .line 123
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 124
    :try_start_2
    invoke-virtual {p0}, Lokhttp3/i0;->body()Lokhttp3/j0;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-eqz v0, :cond_7

    .line 129
    .line 130
    invoke-virtual {v0}, Lokhttp3/j0;->string()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    goto :goto_4

    .line 135
    :catchall_0
    move-exception v0

    .line 136
    goto :goto_5

    .line 137
    :cond_7
    move-object v0, v4

    .line 138
    :goto_4
    if-nez v0, :cond_8

    .line 139
    .line 140
    const-string v0, ""
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 141
    .line 142
    :cond_8
    :try_start_3
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 143
    .line 144
    .line 145
    return-object v0

    .line 146
    :goto_5
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 147
    :catchall_1
    move-exception v1

    .line 148
    :try_start_5
    invoke-static {p0, v0}, Lt5/a;->b(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 149
    .line 150
    .line 151
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 152
    :catchall_2
    :goto_6
    return-object v4
.end method

.method public static b(Lorg/json/JSONArray;)Ln6/c;
    .locals 42

    .line 1
    invoke-static {}, Lcom/bumptech/glide/d;->w()Ln6/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual/range {p0 .. p0}, Lorg/json/JSONArray;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v3, 0x0

    .line 10
    :goto_0
    if-ge v3, v1, :cond_11

    .line 11
    .line 12
    move-object/from16 v4, p0

    .line 13
    .line 14
    invoke-virtual {v4, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    if-nez v5, :cond_0

    .line 19
    .line 20
    move/from16 v17, v1

    .line 21
    .line 22
    move/from16 v18, v3

    .line 23
    .line 24
    goto/16 :goto_d

    .line 25
    .line 26
    :cond_0
    const-string v6, "channels"

    .line 27
    .line 28
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    const-string v7, "title"

    .line 33
    .line 34
    const-string v8, "id"

    .line 35
    .line 36
    sget-object v9, Lm6/p;->j:Lm6/p;

    .line 37
    .line 38
    const-string v10, "id_o"

    .line 39
    .line 40
    if-nez v6, :cond_1

    .line 41
    .line 42
    move/from16 v17, v1

    .line 43
    .line 44
    move/from16 v18, v3

    .line 45
    .line 46
    goto/16 :goto_c

    .line 47
    .line 48
    :cond_1
    invoke-static {}, Lcom/bumptech/glide/d;->w()Ln6/c;

    .line 49
    .line 50
    .line 51
    move-result-object v11

    .line 52
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    .line 53
    .line 54
    .line 55
    move-result v12

    .line 56
    const/4 v13, 0x0

    .line 57
    :goto_1
    if-ge v13, v12, :cond_f

    .line 58
    .line 59
    invoke-virtual {v6, v13}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 60
    .line 61
    .line 62
    move-result-object v14

    .line 63
    if-eqz v14, :cond_e

    .line 64
    .line 65
    const-string v15, "backupURLs"

    .line 66
    .line 67
    invoke-virtual {v14, v15}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 68
    .line 69
    .line 70
    move-result-object v15

    .line 71
    const-string v2, "name"

    .line 72
    .line 73
    const/16 v16, 0x0

    .line 74
    .line 75
    move/from16 v17, v1

    .line 76
    .line 77
    if-eqz v15, :cond_a

    .line 78
    .line 79
    invoke-static {}, Lcom/bumptech/glide/d;->w()Ln6/c;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    move/from16 v18, v3

    .line 84
    .line 85
    invoke-virtual {v15}, Lorg/json/JSONArray;->length()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    const/4 v4, 0x0

    .line 90
    :goto_2
    if-ge v4, v3, :cond_9

    .line 91
    .line 92
    move/from16 v19, v3

    .line 93
    .line 94
    invoke-virtual {v15, v4}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    move/from16 v20, v4

    .line 99
    .line 100
    instance-of v4, v3, Ljava/lang/String;

    .line 101
    .line 102
    if-eqz v4, :cond_4

    .line 103
    .line 104
    move-object v4, v3

    .line 105
    check-cast v4, Ljava/lang/String;

    .line 106
    .line 107
    invoke-static {v4}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-nez v4, :cond_2

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_2
    move-object/from16 v3, v16

    .line 115
    .line 116
    :goto_3
    move-object/from16 v22, v3

    .line 117
    .line 118
    check-cast v22, Ljava/lang/String;

    .line 119
    .line 120
    if-eqz v22, :cond_3

    .line 121
    .line 122
    new-instance v21, Lcom/exotv/net/model/BackupSource;

    .line 123
    .line 124
    const/16 v25, 0x6

    .line 125
    .line 126
    const/16 v26, 0x0

    .line 127
    .line 128
    const/16 v23, 0x0

    .line 129
    .line 130
    const/16 v24, 0x0

    .line 131
    .line 132
    invoke-direct/range {v21 .. v26}, Lcom/exotv/net/model/BackupSource;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILz6/e;)V

    .line 133
    .line 134
    .line 135
    move-object/from16 v22, v9

    .line 136
    .line 137
    move/from16 v23, v12

    .line 138
    .line 139
    move/from16 v24, v13

    .line 140
    .line 141
    move-object/from16 v9, v21

    .line 142
    .line 143
    move-object/from16 v21, v6

    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_3
    :goto_4
    move-object/from16 v21, v6

    .line 147
    .line 148
    move-object/from16 v22, v9

    .line 149
    .line 150
    move/from16 v23, v12

    .line 151
    .line 152
    move/from16 v24, v13

    .line 153
    .line 154
    move-object/from16 v9, v16

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_4
    instance-of v4, v3, Lorg/json/JSONObject;

    .line 158
    .line 159
    if-eqz v4, :cond_3

    .line 160
    .line 161
    check-cast v3, Lorg/json/JSONObject;

    .line 162
    .line 163
    const-string v4, "url"

    .line 164
    .line 165
    invoke-static {v3, v4}, Lt2/w;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    if-nez v4, :cond_5

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_5
    move-object/from16 v21, v6

    .line 173
    .line 174
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 175
    .line 176
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 177
    .line 178
    .line 179
    move-object/from16 v22, v9

    .line 180
    .line 181
    const-string v9, "headers"

    .line 182
    .line 183
    invoke-virtual {v3, v9}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 184
    .line 185
    .line 186
    move-result-object v9

    .line 187
    move/from16 v23, v12

    .line 188
    .line 189
    if-eqz v9, :cond_6

    .line 190
    .line 191
    invoke-virtual {v9}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object v12

    .line 195
    move/from16 v24, v13

    .line 196
    .line 197
    const-string v13, "keys(...)"

    .line 198
    .line 199
    invoke-static {v13, v12}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    :goto_5
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v13

    .line 206
    if-eqz v13, :cond_7

    .line 207
    .line 208
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v13

    .line 212
    check-cast v13, Ljava/lang/String;

    .line 213
    .line 214
    move-object/from16 v25, v12

    .line 215
    .line 216
    invoke-virtual {v9, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v12

    .line 220
    invoke-interface {v6, v13, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-object/from16 v12, v25

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_6
    move/from16 v24, v13

    .line 227
    .line 228
    :cond_7
    new-instance v9, Lcom/exotv/net/model/BackupSource;

    .line 229
    .line 230
    invoke-static {v3, v2}, Lt2/w;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    invoke-direct {v9, v4, v6, v3}, Lcom/exotv/net/model/BackupSource;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    :goto_6
    if-eqz v9, :cond_8

    .line 238
    .line 239
    invoke-virtual {v1, v9}, Ln6/c;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    :cond_8
    add-int/lit8 v4, v20, 0x1

    .line 243
    .line 244
    move/from16 v3, v19

    .line 245
    .line 246
    move-object/from16 v6, v21

    .line 247
    .line 248
    move-object/from16 v9, v22

    .line 249
    .line 250
    move/from16 v12, v23

    .line 251
    .line 252
    move/from16 v13, v24

    .line 253
    .line 254
    goto/16 :goto_2

    .line 255
    .line 256
    :cond_9
    move-object/from16 v21, v6

    .line 257
    .line 258
    move-object/from16 v22, v9

    .line 259
    .line 260
    move/from16 v23, v12

    .line 261
    .line 262
    move/from16 v24, v13

    .line 263
    .line 264
    invoke-static {v1}, Lcom/bumptech/glide/d;->h(Ln6/c;)Ln6/c;

    .line 265
    .line 266
    .line 267
    move-result-object v16

    .line 268
    goto :goto_7

    .line 269
    :cond_a
    move/from16 v18, v3

    .line 270
    .line 271
    move-object/from16 v21, v6

    .line 272
    .line 273
    move-object/from16 v22, v9

    .line 274
    .line 275
    move/from16 v23, v12

    .line 276
    .line 277
    move/from16 v24, v13

    .line 278
    .line 279
    :goto_7
    if-nez v16, :cond_b

    .line 280
    .line 281
    move-object/from16 v40, v22

    .line 282
    .line 283
    goto :goto_8

    .line 284
    :cond_b
    move-object/from16 v40, v16

    .line 285
    .line 286
    :goto_8
    new-instance v25, Lcom/exotv/net/model/Channel;

    .line 287
    .line 288
    invoke-static {v14, v8}, Lt2/w;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v26

    .line 292
    invoke-static {v14, v10}, Lt2/w;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v27

    .line 296
    invoke-static {v14, v2}, Lt2/w;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v28

    .line 300
    invoke-static {v14, v7}, Lt2/w;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v29

    .line 304
    const-string v1, "icon"

    .line 305
    .line 306
    invoke-static {v14, v1}, Lt2/w;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v30

    .line 310
    const-string v1, "type"

    .line 311
    .line 312
    invoke-static {v14, v1}, Lt2/w;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v31

    .line 316
    const-string v1, "cat_o"

    .line 317
    .line 318
    invoke-static {v14, v1}, Lt2/w;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v32

    .line 322
    const-string v1, "cat_real_name"

    .line 323
    .line 324
    invoke-static {v14, v1}, Lt2/w;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v33

    .line 328
    const-string v1, "ch_real_name"

    .line 329
    .line 330
    invoke-static {v14, v1}, Lt2/w;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v34

    .line 334
    const-string v1, "id_gen"

    .line 335
    .line 336
    invoke-static {v14, v1}, Lt2/w;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v35

    .line 340
    const-string v1, "parent"

    .line 341
    .line 342
    invoke-static {v14, v1}, Lt2/w;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v36

    .line 346
    const-string v1, "server"

    .line 347
    .line 348
    invoke-static {v14, v1}, Lt2/w;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v37

    .line 352
    const-string v1, "isSub"

    .line 353
    .line 354
    invoke-virtual {v14, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    if-eqz v2, :cond_c

    .line 359
    .line 360
    const/16 v38, 0x0

    .line 361
    .line 362
    goto :goto_9

    .line 363
    :cond_c
    invoke-virtual {v14, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    move/from16 v38, v1

    .line 368
    .line 369
    :goto_9
    const-string v1, "isBackup"

    .line 370
    .line 371
    invoke-virtual {v14, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    if-eqz v2, :cond_d

    .line 376
    .line 377
    const/16 v39, 0x0

    .line 378
    .line 379
    goto :goto_a

    .line 380
    :cond_d
    invoke-virtual {v14, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    move/from16 v39, v1

    .line 385
    .line 386
    :goto_a
    const-string v1, "x_cat_info"

    .line 387
    .line 388
    invoke-static {v14, v1}, Lt2/w;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v41

    .line 392
    invoke-direct/range {v25 .. v41}, Lcom/exotv/net/model/Channel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    move-object/from16 v1, v25

    .line 396
    .line 397
    invoke-virtual {v11, v1}, Ln6/c;->add(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    goto :goto_b

    .line 401
    :cond_e
    move/from16 v17, v1

    .line 402
    .line 403
    move/from16 v18, v3

    .line 404
    .line 405
    move-object/from16 v21, v6

    .line 406
    .line 407
    move-object/from16 v22, v9

    .line 408
    .line 409
    move/from16 v23, v12

    .line 410
    .line 411
    move/from16 v24, v13

    .line 412
    .line 413
    :goto_b
    add-int/lit8 v13, v24, 0x1

    .line 414
    .line 415
    move-object/from16 v4, p0

    .line 416
    .line 417
    move/from16 v1, v17

    .line 418
    .line 419
    move/from16 v3, v18

    .line 420
    .line 421
    move-object/from16 v6, v21

    .line 422
    .line 423
    move-object/from16 v9, v22

    .line 424
    .line 425
    move/from16 v12, v23

    .line 426
    .line 427
    goto/16 :goto_1

    .line 428
    .line 429
    :cond_f
    move/from16 v17, v1

    .line 430
    .line 431
    move/from16 v18, v3

    .line 432
    .line 433
    invoke-static {v11}, Lcom/bumptech/glide/d;->h(Ln6/c;)Ln6/c;

    .line 434
    .line 435
    .line 436
    move-result-object v9

    .line 437
    :goto_c
    new-instance v1, Lcom/exotv/net/model/ChannelCategory;

    .line 438
    .line 439
    invoke-static {v5, v8}, Lt2/w;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    if-nez v2, :cond_10

    .line 444
    .line 445
    invoke-static {v5, v10}, Lt2/w;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    :cond_10
    invoke-static {v5, v10}, Lt2/w;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v3

    .line 453
    invoke-static {v5, v7}, Lt2/w;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v4

    .line 457
    invoke-direct {v1, v2, v3, v4, v9}, Lcom/exotv/net/model/ChannelCategory;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v0, v1}, Ln6/c;->add(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    :goto_d
    add-int/lit8 v3, v18, 0x1

    .line 464
    .line 465
    move/from16 v1, v17

    .line 466
    .line 467
    goto/16 :goto_0

    .line 468
    .line 469
    :cond_11
    invoke-static {v0}, Lcom/bumptech/glide/d;->h(Ln6/c;)Ln6/c;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    return-object v0
.end method
