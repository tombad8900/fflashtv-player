.class public final Lw4/w;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public n:I

.field public final synthetic o:Lcom/exotv/net/MainActivity;

.field public final synthetic p:Z

.field public final synthetic q:Z

.field public final synthetic r:Z


# direct methods
.method public constructor <init>(Lcom/exotv/net/MainActivity;ZZZLp6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw4/w;->o:Lcom/exotv/net/MainActivity;

    .line 2
    .line 3
    iput-boolean p2, p0, Lw4/w;->p:Z

    .line 4
    .line 5
    iput-boolean p3, p0, Lw4/w;->q:Z

    .line 6
    .line 7
    iput-boolean p4, p0, Lw4/w;->r:Z

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lr6/h;-><init>(ILp6/c;)V

    .line 11
    .line 12
    .line 13
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
    invoke-virtual {p0, p1, p2}, Lw4/w;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw4/w;

    .line 10
    .line 11
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw4/w;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final g(Ljava/lang/Object;Lp6/c;)Lp6/c;
    .locals 6

    .line 1
    new-instance v0, Lw4/w;

    .line 2
    .line 3
    iget-boolean v3, p0, Lw4/w;->q:Z

    .line 4
    .line 5
    iget-boolean v4, p0, Lw4/w;->r:Z

    .line 6
    .line 7
    iget-object v1, p0, Lw4/w;->o:Lcom/exotv/net/MainActivity;

    .line 8
    .line 9
    iget-boolean v2, p0, Lw4/w;->p:Z

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lw4/w;-><init>(Lcom/exotv/net/MainActivity;ZZZLp6/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    const-string v0, "version mismatch local=1.1.7 remote="

    .line 2
    .line 3
    const-string v1, "config version="

    .line 4
    .line 5
    sget-object v2, Lq6/a;->j:Lq6/a;

    .line 6
    .line 7
    iget v3, p0, Lw4/w;->n:I

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    sget-object v5, Ll6/j;->a:Ll6/j;

    .line 11
    .line 12
    const-string v6, "MainActivity"

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    const/4 v8, 0x0

    .line 16
    iget-object v9, p0, Lw4/w;->o:Lcom/exotv/net/MainActivity;

    .line 17
    .line 18
    const/4 v10, 0x0

    .line 19
    if-eqz v3, :cond_2

    .line 20
    .line 21
    if-eq v3, v7, :cond_1

    .line 22
    .line 23
    if-ne v3, v4, :cond_0

    .line 24
    .line 25
    :try_start_0
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    goto/16 :goto_7

    .line 29
    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto/16 :goto_9

    .line 32
    .line 33
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1

    .line 41
    :cond_1
    :try_start_1
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_1
    move-exception p1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :try_start_2
    sget-object p1, Li7/e0;->a:Lo7/e;

    .line 51
    .line 52
    sget-object p1, Lo7/d;->l:Lo7/d;

    .line 53
    .line 54
    new-instance v3, Lw4/u;

    .line 55
    .line 56
    iget-boolean v11, p0, Lw4/w;->q:Z

    .line 57
    .line 58
    invoke-direct {v3, v11, v8}, Lw4/u;-><init>(ZLp6/c;)V

    .line 59
    .line 60
    .line 61
    iput v7, p0, Lw4/w;->n:I

    .line 62
    .line 63
    invoke-static {p1, v3, p0}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v2, :cond_3

    .line 68
    .line 69
    goto/16 :goto_6

    .line 70
    .line 71
    :cond_3
    :goto_0
    check-cast p1, Lb5/i;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :goto_1
    :try_start_3
    const-string v3, "config load failed"

    .line 75
    .line 76
    invoke-static {v6, v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 77
    .line 78
    .line 79
    move-object p1, v8

    .line 80
    :goto_2
    if-nez p1, :cond_5

    .line 81
    .line 82
    const-string p1, "no config: showing the reload screen"

    .line 83
    .line 84
    invoke-static {v6, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    const p1, 0x7f110084

    .line 88
    .line 89
    .line 90
    invoke-virtual {v9, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    sget-object v0, Lw4/q;->j:Lw4/q;

    .line 95
    .line 96
    invoke-virtual {v9, v10, p1, v7, v0}, Lcom/exotv/net/MainActivity;->T(ZLjava/lang/String;ZLw4/q;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 97
    .line 98
    .line 99
    :cond_4
    :goto_3
    iput-boolean v10, v9, Lcom/exotv/net/MainActivity;->X:Z

    .line 100
    .line 101
    invoke-virtual {v9, v10}, Lcom/exotv/net/MainActivity;->Q(Z)V

    .line 102
    .line 103
    .line 104
    return-object v5

    .line 105
    :cond_5
    :try_start_4
    iget-object v3, p1, Lb5/i;->a:Ljava/lang/String;

    .line 106
    .line 107
    iget-object v11, p1, Lb5/i;->d:Ljava/lang/String;

    .line 108
    .line 109
    if-eqz v11, :cond_7

    .line 110
    .line 111
    invoke-static {v11}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 112
    .line 113
    .line 114
    move-result v12

    .line 115
    if-nez v12, :cond_6

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_6
    move-object v11, v8

    .line 119
    :goto_4
    if-nez v11, :cond_8

    .line 120
    .line 121
    :cond_7
    iget-object v11, p1, Lb5/i;->e:Ljava/lang/String;

    .line 122
    .line 123
    :cond_8
    if-eqz v11, :cond_9

    .line 124
    .line 125
    move v11, v7

    .line 126
    goto :goto_5

    .line 127
    :cond_9
    move v11, v10

    .line 128
    :goto_5
    new-instance v12, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {v12, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string v1, " apkUrl="

    .line 137
    .line 138
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-static {v6, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    iget-boolean v1, p0, Lw4/w;->p:Z

    .line 152
    .line 153
    if-nez v1, :cond_a

    .line 154
    .line 155
    iget-object v1, p1, Lb5/i;->a:Ljava/lang/String;

    .line 156
    .line 157
    const-string v3, "1.1.7"

    .line 158
    .line 159
    invoke-static {v1, v3}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-nez v1, :cond_a

    .line 164
    .line 165
    iget-object v1, p1, Lb5/i;->a:Ljava/lang/String;

    .line 166
    .line 167
    new-instance v2, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-static {v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 180
    .line 181
    .line 182
    invoke-static {v9, p1}, Lcom/exotv/net/MainActivity;->s(Lcom/exotv/net/MainActivity;Lb5/i;)V

    .line 183
    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_a
    sget-object p1, Li7/e0;->a:Lo7/e;

    .line 187
    .line 188
    sget-object p1, Lo7/d;->l:Lo7/d;

    .line 189
    .line 190
    new-instance v0, Lw4/v;

    .line 191
    .line 192
    iget-boolean v1, p0, Lw4/w;->r:Z

    .line 193
    .line 194
    invoke-direct {v0, v9, v1, v8}, Lw4/v;-><init>(Lcom/exotv/net/MainActivity;ZLp6/c;)V

    .line 195
    .line 196
    .line 197
    iput v4, p0, Lw4/w;->n:I

    .line 198
    .line 199
    invoke-static {p1, v0, p0}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    if-ne p1, v2, :cond_b

    .line 204
    .line 205
    :goto_6
    return-object v2

    .line 206
    :cond_b
    :goto_7
    check-cast p1, Ljava/util/List;

    .line 207
    .line 208
    if-eqz p1, :cond_11

    .line 209
    .line 210
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_c

    .line 215
    .line 216
    goto :goto_8

    .line 217
    :cond_c
    iput-object p1, v9, Lcom/exotv/net/MainActivity;->U:Ljava/util/List;

    .line 218
    .line 219
    iget-object v0, v9, Lcom/exotv/net/MainActivity;->S:Lc5/o;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 220
    .line 221
    const-string v1, "categoryAdapter"

    .line 222
    .line 223
    if-eqz v0, :cond_10

    .line 224
    .line 225
    :try_start_5
    iput-object p1, v0, Lc5/o;->g:Ljava/util/List;

    .line 226
    .line 227
    iget-object v0, v0, Lz2/x;->a:Lz2/y;

    .line 228
    .line 229
    invoke-virtual {v0}, Lz2/y;->b()V

    .line 230
    .line 231
    .line 232
    iget-object v0, v9, Lcom/exotv/net/MainActivity;->S:Lc5/o;

    .line 233
    .line 234
    if-eqz v0, :cond_f

    .line 235
    .line 236
    invoke-virtual {v0, v10}, Lc5/o;->g(I)V

    .line 237
    .line 238
    .line 239
    iput v10, v9, Lcom/exotv/net/MainActivity;->V:I

    .line 240
    .line 241
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    check-cast p1, Lcom/exotv/net/model/ChannelCategory;

    .line 246
    .line 247
    invoke-virtual {p1}, Lcom/exotv/net/model/ChannelCategory;->getChannels()Ljava/util/List;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-virtual {v9, p1}, Lcom/exotv/net/MainActivity;->S(Ljava/util/List;)V

    .line 252
    .line 253
    .line 254
    sget-object p1, Lw4/q;->j:Lw4/q;

    .line 255
    .line 256
    invoke-virtual {v9, v10, v8, v10, p1}, Lcom/exotv/net/MainActivity;->T(ZLjava/lang/String;ZLw4/q;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v9}, Lcom/exotv/net/MainActivity;->I()Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-eqz v0, :cond_4

    .line 264
    .line 265
    iget-object v0, v9, Lcom/exotv/net/MainActivity;->K:Lw4/q;

    .line 266
    .line 267
    if-eq v0, p1, :cond_d

    .line 268
    .line 269
    goto/16 :goto_3

    .line 270
    .line 271
    :cond_d
    iget-object p1, v9, Lcom/exotv/net/MainActivity;->J:Lc5/y;

    .line 272
    .line 273
    if-eqz p1, :cond_e

    .line 274
    .line 275
    invoke-virtual {p1}, Lc5/y;->a()V

    .line 276
    .line 277
    .line 278
    goto/16 :goto_3

    .line 279
    .line 280
    :cond_e
    const-string p1, "nav"

    .line 281
    .line 282
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    throw v8

    .line 286
    :cond_f
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    throw v8

    .line 290
    :cond_10
    invoke-static {v1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    throw v8

    .line 294
    :cond_11
    :goto_8
    const p1, 0x7f1100fe

    .line 295
    .line 296
    .line 297
    invoke-virtual {v9, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    sget-object v0, Lw4/q;->j:Lw4/q;

    .line 302
    .line 303
    invoke-virtual {v9, v10, p1, v7, v0}, Lcom/exotv/net/MainActivity;->T(ZLjava/lang/String;ZLw4/q;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 304
    .line 305
    .line 306
    goto/16 :goto_3

    .line 307
    .line 308
    :goto_9
    iput-boolean v10, v9, Lcom/exotv/net/MainActivity;->X:Z

    .line 309
    .line 310
    invoke-virtual {v9, v10}, Lcom/exotv/net/MainActivity;->Q(Z)V

    .line 311
    .line 312
    .line 313
    throw p1
.end method
