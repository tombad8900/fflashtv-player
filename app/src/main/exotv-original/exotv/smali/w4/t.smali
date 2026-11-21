.class public final Lw4/t;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public final synthetic n:I

.field public o:I

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lp6/c;I)V
    .locals 0

    .line 1
    iput p6, p0, Lw4/t;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lw4/t;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lw4/t;->q:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lw4/t;->r:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lw4/t;->s:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p5}, Lr6/h;-><init>(ILp6/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lw4/t;->n:I

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
    invoke-virtual {p0, p1, p2}, Lw4/t;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lw4/t;

    .line 15
    .line 16
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lw4/t;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lw4/t;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lw4/t;

    .line 28
    .line 29
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lw4/t;->h(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    iget p1, p0, Lw4/t;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lw4/t;

    .line 7
    .line 8
    iget-object p1, p0, Lw4/t;->p:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    .line 13
    iget-object p1, p0, Lw4/t;->q:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v2, p1

    .line 16
    check-cast v2, Ljava/lang/String;

    .line 17
    .line 18
    iget-object p1, p0, Lw4/t;->r:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v3, p1

    .line 21
    check-cast v3, Ljava/lang/Integer;

    .line 22
    .line 23
    iget-object p1, p0, Lw4/t;->s:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v4, p1

    .line 26
    check-cast v4, Ljava/lang/Integer;

    .line 27
    .line 28
    const/4 v6, 0x1

    .line 29
    move-object v5, p2

    .line 30
    invoke-direct/range {v0 .. v6}, Lw4/t;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lp6/c;I)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_0
    move-object v5, p2

    .line 35
    new-instance v1, Lw4/t;

    .line 36
    .line 37
    iget-object p1, p0, Lw4/t;->p:Ljava/lang/Object;

    .line 38
    .line 39
    move-object v2, p1

    .line 40
    check-cast v2, Lw4/l;

    .line 41
    .line 42
    iget-object p1, p0, Lw4/t;->q:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v3, p1

    .line 45
    check-cast v3, Lx4/m;

    .line 46
    .line 47
    iget-object p1, p0, Lw4/t;->r:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v4, p1

    .line 50
    check-cast v4, Lcom/exotv/net/MainActivity;

    .line 51
    .line 52
    iget-object p1, p0, Lw4/t;->s:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Ljava/util/List;

    .line 55
    .line 56
    const/4 v7, 0x0

    .line 57
    move-object v6, v5

    .line 58
    move-object v5, p1

    .line 59
    invoke-direct/range {v1 .. v7}, Lw4/t;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lp6/c;I)V

    .line 60
    .line 61
    .line 62
    return-object v1

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lw4/t;->n:I

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 14
    .line 15
    iget v6, v1, Lw4/t;->o:I

    .line 16
    .line 17
    if-eqz v6, :cond_1

    .line 18
    .line 19
    if-ne v6, v5, :cond_0

    .line 20
    .line 21
    :try_start_0
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v2, p1

    .line 25
    .line 26
    goto/16 :goto_1

    .line 27
    .line 28
    :catch_0
    move-exception v0

    .line 29
    goto/16 :goto_e

    .line 30
    .line 31
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :cond_1
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    sget-object v2, Lx4/v;->a:Lx4/v;

    .line 41
    .line 42
    sget-object v2, Lb5/h;->a:Lb5/i;

    .line 43
    .line 44
    if-eqz v2, :cond_3

    .line 45
    .line 46
    iget-object v2, v2, Lb5/i;->v:Ljava/lang/String;

    .line 47
    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    new-array v6, v5, [C

    .line 51
    .line 52
    const/16 v7, 0x2f

    .line 53
    .line 54
    aput-char v7, v6, v4

    .line 55
    .line 56
    invoke-static {v2, v6}, Lh7/h;->T0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    if-eqz v2, :cond_3

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-lez v6, :cond_2

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move-object v2, v3

    .line 70
    :goto_0
    if-nez v2, :cond_4

    .line 71
    .line 72
    :cond_3
    const-string v2, "https://rest.opensubtitles.org/search"

    .line 73
    .line 74
    :cond_4
    iget-object v6, v1, Lw4/t;->p:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v6, Ljava/lang/String;

    .line 77
    .line 78
    iget-object v7, v1, Lw4/t;->q:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v7, Ljava/lang/String;

    .line 81
    .line 82
    iget-object v8, v1, Lw4/t;->r:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v8, Ljava/lang/Integer;

    .line 85
    .line 86
    iget-object v9, v1, Lw4/t;->s:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v9, Ljava/lang/Integer;

    .line 89
    .line 90
    const-string v10, "lang"

    .line 91
    .line 92
    invoke-static {v10, v7}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    new-instance v10, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    if-eqz v9, :cond_5

    .line 101
    .line 102
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result v11

    .line 106
    if-lez v11, :cond_5

    .line 107
    .line 108
    const-string v11, "/episode-"

    .line 109
    .line 110
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 114
    .line 115
    .line 116
    move-result v9

    .line 117
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    :cond_5
    const-string v9, "/imdbid-"

    .line 121
    .line 122
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    if-eqz v8, :cond_6

    .line 129
    .line 130
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    if-lez v6, :cond_6

    .line 135
    .line 136
    const-string v6, "/season-"

    .line 137
    .line 138
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    :cond_6
    const-string v6, "/sublanguageid-"

    .line 149
    .line 150
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v6, "UTF-8"

    .line 154
    .line 155
    invoke-static {v7, v6}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    invoke-static {v2, v6}, La1/a1;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    :try_start_1
    sget-object v6, Lx4/k;->a:Lx4/k;

    .line 171
    .line 172
    iput v5, v1, Lw4/t;->o:I

    .line 173
    .line 174
    invoke-static {v2, v1}, Lx4/k;->f(Ljava/lang/String;Lr6/h;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    if-ne v2, v0, :cond_7

    .line 179
    .line 180
    goto/16 :goto_d

    .line 181
    .line 182
    :cond_7
    :goto_1
    check-cast v2, Ljava/lang/String;

    .line 183
    .line 184
    new-instance v0, Lorg/json/JSONArray;

    .line 185
    .line 186
    invoke-direct {v0, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    invoke-static {v4, v2}, Lcom/bumptech/glide/c;->g0(II)Le7/c;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    new-instance v6, Ljava/util/ArrayList;

    .line 198
    .line 199
    invoke-static {v2}, Lm6/j;->w0(Ljava/lang/Iterable;)I

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2}, Le7/a;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    :goto_2
    move-object v7, v2

    .line 211
    check-cast v7, Le7/b;

    .line 212
    .line 213
    iget-boolean v8, v7, Le7/b;->l:Z

    .line 214
    .line 215
    if-eqz v8, :cond_f

    .line 216
    .line 217
    invoke-virtual {v7}, Le7/b;->nextInt()I

    .line 218
    .line 219
    .line 220
    move-result v7

    .line 221
    invoke-virtual {v0, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    const-string v8, "IDSubtitle"

    .line 226
    .line 227
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v10

    .line 231
    const-string v8, "optString(...)"

    .line 232
    .line 233
    invoke-static {v8, v10}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    const-string v9, "SubFileName"

    .line 237
    .line 238
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v11

    .line 242
    invoke-static {v8, v11}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    const-string v9, "MovieReleaseName"

    .line 246
    .line 247
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v12

    .line 251
    invoke-static {v8, v12}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    const-string v9, "LanguageName"

    .line 255
    .line 256
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v13

    .line 260
    invoke-static {v8, v13}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    const-string v9, "SubFormat"

    .line 264
    .line 265
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v14

    .line 269
    invoke-static {v8, v14}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    const-string v9, "SubEncoding"

    .line 273
    .line 274
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v15

    .line 278
    invoke-static {v8, v15}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    const-string v9, "SubDownloadsCnt"

    .line 282
    .line 283
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v9

    .line 287
    invoke-static {v8, v9}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    invoke-static {v9}, Lh7/o;->k0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v9

    .line 294
    if-eqz v9, :cond_8

    .line 295
    .line 296
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 297
    .line 298
    .line 299
    move-result v9

    .line 300
    move/from16 v16, v9

    .line 301
    .line 302
    goto :goto_3

    .line 303
    :cond_8
    move/from16 v16, v4

    .line 304
    .line 305
    :goto_3
    const-string v9, "SeriesSeason"

    .line 306
    .line 307
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v9

    .line 311
    invoke-static {v8, v9}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    invoke-static {v9}, Lh7/o;->k0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 315
    .line 316
    .line 317
    move-result-object v9

    .line 318
    if-eqz v9, :cond_9

    .line 319
    .line 320
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 321
    .line 322
    .line 323
    move-result v9

    .line 324
    move/from16 v17, v9

    .line 325
    .line 326
    goto :goto_4

    .line 327
    :cond_9
    move/from16 v17, v4

    .line 328
    .line 329
    :goto_4
    const-string v9, "SeriesEpisode"

    .line 330
    .line 331
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v9

    .line 335
    invoke-static {v8, v9}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    invoke-static {v9}, Lh7/o;->k0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 339
    .line 340
    .line 341
    move-result-object v9

    .line 342
    if-eqz v9, :cond_a

    .line 343
    .line 344
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 345
    .line 346
    .line 347
    move-result v9

    .line 348
    move/from16 v18, v9

    .line 349
    .line 350
    goto :goto_5

    .line 351
    :cond_a
    move/from16 v18, v4

    .line 352
    .line 353
    :goto_5
    const-string v9, "SubDownloadLink"

    .line 354
    .line 355
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v9

    .line 359
    invoke-static {v8, v9}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    const-string v4, "MovieFPS"

    .line 363
    .line 364
    invoke-virtual {v7, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    invoke-static {v8, v4}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    :try_start_2
    invoke-static {v4}, Lh7/n;->i0(Ljava/lang/String;)Z

    .line 372
    .line 373
    .line 374
    move-result v19

    .line 375
    if-eqz v19, :cond_b

    .line 376
    .line 377
    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 378
    .line 379
    .line 380
    move-result-wide v19

    .line 381
    invoke-static/range {v19 .. v20}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 382
    .line 383
    .line 384
    move-result-object v4
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 385
    goto :goto_6

    .line 386
    :catch_1
    :cond_b
    move-object v4, v3

    .line 387
    :goto_6
    if-eqz v4, :cond_c

    .line 388
    .line 389
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 390
    .line 391
    .line 392
    move-result-wide v19

    .line 393
    :goto_7
    move-wide/from16 v20, v19

    .line 394
    .line 395
    goto :goto_8

    .line 396
    :cond_c
    const-wide/16 v19, 0x0

    .line 397
    .line 398
    goto :goto_7

    .line 399
    :goto_8
    const-string v4, "SubSumCD"

    .line 400
    .line 401
    invoke-virtual {v7, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    invoke-static {v8, v4}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    invoke-static {v4}, Lh7/o;->k0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 409
    .line 410
    .line 411
    move-result-object v4

    .line 412
    if-eqz v4, :cond_e

    .line 413
    .line 414
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 415
    .line 416
    .line 417
    move-result v8

    .line 418
    if-lez v8, :cond_d

    .line 419
    .line 420
    goto :goto_9

    .line 421
    :cond_d
    move-object v4, v3

    .line 422
    :goto_9
    if-eqz v4, :cond_e

    .line 423
    .line 424
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 425
    .line 426
    .line 427
    move-result v4

    .line 428
    move/from16 v22, v4

    .line 429
    .line 430
    goto :goto_a

    .line 431
    :cond_e
    move/from16 v22, v5

    .line 432
    .line 433
    :goto_a
    const-string v4, "SubAutoTranslation"

    .line 434
    .line 435
    invoke-virtual {v7, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v4

    .line 439
    const-string v8, "1"

    .line 440
    .line 441
    invoke-static {v4, v8}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    move-result v23

    .line 445
    const-string v4, "SubHearingImpaired"

    .line 446
    .line 447
    invoke-virtual {v7, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v4

    .line 451
    invoke-static {v4, v8}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-result v24

    .line 455
    const-string v4, "SubForeignPartsOnly"

    .line 456
    .line 457
    invoke-virtual {v7, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v4

    .line 461
    invoke-static {v4, v8}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move-result v25

    .line 465
    move-object/from16 v19, v9

    .line 466
    .line 467
    new-instance v9, Lx4/t;

    .line 468
    .line 469
    invoke-direct/range {v9 .. v25}, Lx4/t;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;DIZZZ)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    const/4 v4, 0x0

    .line 476
    goto/16 :goto_2

    .line 477
    .line 478
    :cond_f
    iget-object v0, v1, Lw4/t;->r:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast v0, Ljava/lang/Integer;

    .line 481
    .line 482
    iget-object v2, v1, Lw4/t;->s:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast v2, Ljava/lang/Integer;

    .line 485
    .line 486
    new-instance v3, Ljava/util/ArrayList;

    .line 487
    .line 488
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 492
    .line 493
    .line 494
    move-result v4

    .line 495
    const/4 v5, 0x0

    .line 496
    :cond_10
    :goto_b
    if-ge v5, v4, :cond_14

    .line 497
    .line 498
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v7

    .line 502
    add-int/lit8 v5, v5, 0x1

    .line 503
    .line 504
    move-object v8, v7

    .line 505
    check-cast v8, Lx4/t;

    .line 506
    .line 507
    if-eqz v0, :cond_13

    .line 508
    .line 509
    if-nez v2, :cond_11

    .line 510
    .line 511
    goto :goto_c

    .line 512
    :cond_11
    iget v9, v8, Lx4/t;->h:I

    .line 513
    .line 514
    if-eqz v9, :cond_12

    .line 515
    .line 516
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 517
    .line 518
    .line 519
    move-result v10

    .line 520
    if-ne v9, v10, :cond_10

    .line 521
    .line 522
    :cond_12
    iget v8, v8, Lx4/t;->i:I

    .line 523
    .line 524
    if-eqz v8, :cond_13

    .line 525
    .line 526
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 527
    .line 528
    .line 529
    move-result v9

    .line 530
    if-ne v8, v9, :cond_10

    .line 531
    .line 532
    :cond_13
    :goto_c
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    goto :goto_b

    .line 536
    :cond_14
    move-object v0, v3

    .line 537
    :goto_d
    return-object v0

    .line 538
    :goto_e
    new-instance v2, Ljava/io/IOException;

    .line 539
    .line 540
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v3

    .line 544
    if-nez v3, :cond_15

    .line 545
    .line 546
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v3

    .line 550
    :cond_15
    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    throw v2

    .line 554
    :pswitch_0
    iget-object v0, v1, Lw4/t;->q:Ljava/lang/Object;

    .line 555
    .line 556
    move-object v8, v0

    .line 557
    check-cast v8, Lx4/m;

    .line 558
    .line 559
    iget-object v0, v1, Lw4/t;->r:Ljava/lang/Object;

    .line 560
    .line 561
    move-object v6, v0

    .line 562
    check-cast v6, Lcom/exotv/net/MainActivity;

    .line 563
    .line 564
    iget-object v0, v1, Lw4/t;->p:Ljava/lang/Object;

    .line 565
    .line 566
    move-object v4, v0

    .line 567
    check-cast v4, Lw4/l;

    .line 568
    .line 569
    iget-object v7, v4, Lw4/l;->b:Landroid/widget/LinearLayout;

    .line 570
    .line 571
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 572
    .line 573
    iget v9, v1, Lw4/t;->o:I

    .line 574
    .line 575
    if-eqz v9, :cond_17

    .line 576
    .line 577
    if-ne v9, v5, :cond_16

    .line 578
    .line 579
    :try_start_3
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 580
    .line 581
    .line 582
    move-object/from16 v2, p1

    .line 583
    .line 584
    goto :goto_11

    .line 585
    :catchall_0
    move-exception v0

    .line 586
    :goto_f
    const/4 v2, 0x0

    .line 587
    goto/16 :goto_1c

    .line 588
    .line 589
    :catch_2
    move-exception v0

    .line 590
    :goto_10
    move-object v2, v7

    .line 591
    goto/16 :goto_16

    .line 592
    .line 593
    :catch_3
    move-exception v0

    .line 594
    goto/16 :goto_1b

    .line 595
    .line 596
    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 597
    .line 598
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    throw v0

    .line 602
    :cond_17
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 603
    .line 604
    .line 605
    :try_start_4
    sget-object v2, Li7/e0;->a:Lo7/e;

    .line 606
    .line 607
    sget-object v2, Lo7/d;->l:Lo7/d;

    .line 608
    .line 609
    new-instance v9, Lw4/s;

    .line 610
    .line 611
    iget-object v10, v1, Lw4/t;->s:Ljava/lang/Object;

    .line 612
    .line 613
    check-cast v10, Ljava/util/List;

    .line 614
    .line 615
    invoke-direct {v9, v10, v8, v3}, Lw4/s;-><init>(Ljava/util/List;Lx4/m;Lp6/c;)V

    .line 616
    .line 617
    .line 618
    iput v5, v1, Lw4/t;->o:I

    .line 619
    .line 620
    invoke-static {v2, v9, v1}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    if-ne v2, v0, :cond_18

    .line 625
    .line 626
    goto/16 :goto_1a

    .line 627
    .line 628
    :cond_18
    :goto_11
    check-cast v2, Ljava/util/List;

    .line 629
    .line 630
    invoke-virtual {v7}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 631
    .line 632
    .line 633
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 638
    .line 639
    .line 640
    move-result v2

    .line 641
    if-eqz v2, :cond_1c

    .line 642
    .line 643
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v2

    .line 647
    check-cast v2, Ll6/d;

    .line 648
    .line 649
    iget-object v3, v2, Ll6/d;->j:Ljava/lang/Object;

    .line 650
    .line 651
    check-cast v3, Lw4/k;

    .line 652
    .line 653
    iget-object v2, v2, Ll6/d;->k:Ljava/lang/Object;

    .line 654
    .line 655
    move-object v11, v2

    .line 656
    check-cast v11, Ljava/util/List;

    .line 657
    .line 658
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 659
    .line 660
    .line 661
    move-result v2

    .line 662
    if-nez v2, :cond_1b

    .line 663
    .line 664
    iget-object v2, v3, Lw4/k;->b:Lw4/p;

    .line 665
    .line 666
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 667
    .line 668
    .line 669
    move-result v2

    .line 670
    if-eqz v2, :cond_1a

    .line 671
    .line 672
    if-ne v2, v5, :cond_19

    .line 673
    .line 674
    sget-object v2, Lc5/r0;->a:Lc5/r0;

    .line 675
    .line 676
    iget-object v2, v3, Lw4/k;->a:Lw4/m;

    .line 677
    .line 678
    iget-object v10, v2, Lw4/m;->b:Ljava/lang/String;

    .line 679
    .line 680
    new-instance v12, Lw4/r;

    .line 681
    .line 682
    const/4 v2, 0x2

    .line 683
    invoke-direct {v12, v6, v2, v8}, Lw4/r;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 684
    .line 685
    .line 686
    new-instance v13, Lw4/r;

    .line 687
    .line 688
    const/4 v2, 0x3

    .line 689
    invoke-direct {v13, v8, v6, v2}, Lw4/r;-><init>(Lx4/m;Lcom/exotv/net/MainActivity;I)V

    .line 690
    .line 691
    .line 692
    new-instance v14, Lw4/g;

    .line 693
    .line 694
    const/4 v2, 0x6

    .line 695
    invoke-direct {v14, v6, v2}, Lw4/g;-><init>(Lcom/exotv/net/MainActivity;I)V
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 696
    .line 697
    .line 698
    const/16 v17, 0x0

    .line 699
    .line 700
    const/16 v18, 0x788

    .line 701
    .line 702
    const/4 v15, 0x0

    .line 703
    const/16 v16, 0x0

    .line 704
    .line 705
    move-object v9, v6

    .line 706
    :try_start_5
    invoke-static/range {v9 .. v18}, Lc5/r0;->f(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Ly6/l;Ly6/l;Lw4/g;Ljava/util/ArrayList;Lw4/s0;Lw4/t0;I)Landroid/widget/LinearLayout;

    .line 707
    .line 708
    .line 709
    move-result-object v2
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 710
    move-object v3, v2

    .line 711
    move-object v2, v7

    .line 712
    goto :goto_13

    .line 713
    :catchall_1
    move-exception v0

    .line 714
    move-object v6, v9

    .line 715
    goto/16 :goto_f

    .line 716
    .line 717
    :catch_4
    move-exception v0

    .line 718
    move-object v6, v9

    .line 719
    goto/16 :goto_10

    .line 720
    .line 721
    :catch_5
    move-exception v0

    .line 722
    move-object v6, v9

    .line 723
    goto/16 :goto_1b

    .line 724
    .line 725
    :cond_19
    :try_start_6
    new-instance v0, La1/u;

    .line 726
    .line 727
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 728
    .line 729
    .line 730
    throw v0

    .line 731
    :cond_1a
    new-instance v9, Lw4/r;

    .line 732
    .line 733
    const/4 v2, 0x0

    .line 734
    invoke-direct {v9, v6, v2, v8}, Lw4/r;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 735
    .line 736
    .line 737
    new-instance v10, Lw4/r;

    .line 738
    .line 739
    invoke-direct {v10, v8, v6, v5}, Lw4/r;-><init>(Lx4/m;Lcom/exotv/net/MainActivity;I)V

    .line 740
    .line 741
    .line 742
    move-object v2, v11

    .line 743
    new-instance v11, Lw4/g;

    .line 744
    .line 745
    const/4 v3, 0x5

    .line 746
    invoke-direct {v11, v6, v3}, Lw4/g;-><init>(Lcom/exotv/net/MainActivity;I)V
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 747
    .line 748
    .line 749
    move-object/from16 v26, v7

    .line 750
    .line 751
    move-object v7, v2

    .line 752
    move-object/from16 v2, v26

    .line 753
    .line 754
    :try_start_7
    invoke-static/range {v6 .. v11}, Lc5/r0;->d(Landroid/content/Context;Ljava/util/List;Lx4/m;Lw4/r;Lw4/r;Lw4/g;)Landroid/widget/FrameLayout;

    .line 755
    .line 756
    .line 757
    move-result-object v3

    .line 758
    :goto_13
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 759
    .line 760
    .line 761
    goto :goto_14

    .line 762
    :catch_6
    move-exception v0

    .line 763
    goto :goto_16

    .line 764
    :cond_1b
    move-object v2, v7

    .line 765
    :goto_14
    move-object v7, v2

    .line 766
    goto/16 :goto_12

    .line 767
    .line 768
    :cond_1c
    move-object v2, v7

    .line 769
    iput-boolean v5, v4, Lw4/l;->c:Z
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 770
    .line 771
    const/4 v2, 0x0

    .line 772
    iput-boolean v2, v4, Lw4/l;->d:Z

    .line 773
    .line 774
    sget-object v0, Lcom/exotv/net/MainActivity;->p0:Ljava/util/Set;

    .line 775
    .line 776
    :goto_15
    invoke-virtual {v6}, Lcom/exotv/net/MainActivity;->X()V

    .line 777
    .line 778
    .line 779
    goto :goto_19

    .line 780
    :goto_16
    :try_start_8
    const-string v3, "MainActivity"

    .line 781
    .line 782
    new-instance v7, Ljava/lang/StringBuilder;

    .line 783
    .line 784
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 785
    .line 786
    .line 787
    const-string v9, "catalog "

    .line 788
    .line 789
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 790
    .line 791
    .line 792
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 793
    .line 794
    .line 795
    const-string v9, " failed"

    .line 796
    .line 797
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 798
    .line 799
    .line 800
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v7

    .line 804
    invoke-static {v3, v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 805
    .line 806
    .line 807
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 808
    .line 809
    .line 810
    const v0, 0x7f110084

    .line 811
    .line 812
    .line 813
    invoke-virtual {v6, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    iput-object v0, v4, Lw4/l;->e:Ljava/lang/String;

    .line 818
    .line 819
    sget-object v2, Lx4/m;->j:Lx4/m;

    .line 820
    .line 821
    if-ne v8, v2, :cond_1d

    .line 822
    .line 823
    sget-object v2, Lw4/q;->k:Lw4/q;

    .line 824
    .line 825
    :goto_17
    const/4 v3, 0x0

    .line 826
    goto :goto_18

    .line 827
    :cond_1d
    sget-object v2, Lw4/q;->l:Lw4/q;

    .line 828
    .line 829
    goto :goto_17

    .line 830
    :goto_18
    invoke-virtual {v6, v3, v0, v5, v2}, Lcom/exotv/net/MainActivity;->T(ZLjava/lang/String;ZLw4/q;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 831
    .line 832
    .line 833
    iput-boolean v3, v4, Lw4/l;->d:Z

    .line 834
    .line 835
    goto :goto_15

    .line 836
    :goto_19
    sget-object v0, Ll6/j;->a:Ll6/j;

    .line 837
    .line 838
    :goto_1a
    return-object v0

    .line 839
    :goto_1b
    :try_start_9
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 840
    :goto_1c
    iput-boolean v2, v4, Lw4/l;->d:Z

    .line 841
    .line 842
    sget-object v2, Lcom/exotv/net/MainActivity;->p0:Ljava/util/Set;

    .line 843
    .line 844
    invoke-virtual {v6}, Lcom/exotv/net/MainActivity;->X()V

    .line 845
    .line 846
    .line 847
    throw v0

    .line 848
    nop

    .line 849
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
