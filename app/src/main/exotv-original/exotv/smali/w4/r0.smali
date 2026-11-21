.class public final Lw4/r0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Landroidx/media3/common/b1;


# instance fields
.field public final synthetic j:Lcom/exotv/net/PlayerActivity;

.field public final synthetic k:Landroidx/media3/exoplayer/ExoPlayer;


# direct methods
.method public constructor <init>(Lcom/exotv/net/PlayerActivity;Landroidx/media3/exoplayer/ExoPlayer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw4/r0;->j:Lcom/exotv/net/PlayerActivity;

    .line 5
    .line 6
    iput-object p2, p0, Lw4/r0;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onIsPlayingChanged(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lw4/r0;->j:Lcom/exotv/net/PlayerActivity;

    .line 4
    .line 5
    iget-object p1, p1, Lcom/exotv/net/PlayerActivity;->O:Lc5/b1;

    .line 6
    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iput-wide v0, p1, Lc5/b1;->c:J

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final onPlaybackStateChanged(I)V
    .locals 8

    .line 1
    iget-object v0, p0, Lw4/r0;->j:Lcom/exotv/net/PlayerActivity;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/exotv/net/PlayerActivity;->V:Lw4/g0;

    .line 4
    .line 5
    iget-object v2, v0, Lcom/exotv/net/PlayerActivity;->J:Landroid/os/Handler;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eq p1, v3, :cond_4

    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    if-eq p1, v3, :cond_3

    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    if-eq p1, v1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-boolean p1, v0, Lcom/exotv/net/PlayerActivity;->k0:Z

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0, v5}, Lcom/exotv/net/PlayerActivity;->P(Z)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lw4/r0;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 27
    .line 28
    invoke-interface {p1}, Landroidx/media3/exoplayer/ExoPlayer;->pause()V

    .line 29
    .line 30
    .line 31
    iget-object p1, v0, Lcom/exotv/net/PlayerActivity;->H:La5/b;

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    iget-object p1, p1, La5/b;->d:Landroid/widget/ImageView;

    .line 36
    .line 37
    const v1, 0x7f080103

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/exotv/net/PlayerActivity;->Q()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    const-string p1, "b"

    .line 48
    .line 49
    invoke-static {p1}, Lz6/h;->h(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    throw p1

    .line 54
    :cond_2
    const-string p1, "ended"

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Lcom/exotv/net/PlayerActivity;->N(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3
    iget-object p1, v0, Lcom/exotv/net/PlayerActivity;->O:Lc5/b1;

    .line 61
    .line 62
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 63
    .line 64
    .line 65
    move-result-wide v6

    .line 66
    iput v5, p1, Lc5/b1;->d:I

    .line 67
    .line 68
    iput-boolean v4, p1, Lc5/b1;->b:Z

    .line 69
    .line 70
    iput-wide v6, p1, Lc5/b1;->c:J

    .line 71
    .line 72
    const-wide/16 v3, -0x1

    .line 73
    .line 74
    iput-wide v3, v0, Lcom/exotv/net/PlayerActivity;->Q:J

    .line 75
    .line 76
    iget-object p1, v0, Lcom/exotv/net/PlayerActivity;->U:Lw4/g0;

    .line 77
    .line 78
    invoke-virtual {v2, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v5}, Lcom/exotv/net/PlayerActivity;->P(Z)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Lcom/exotv/net/PlayerActivity;->x()V

    .line 88
    .line 89
    .line 90
    invoke-static {v0}, Lcom/exotv/net/PlayerActivity;->t(Lcom/exotv/net/PlayerActivity;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_4
    sget p1, Lcom/exotv/net/PlayerActivity;->z0:I

    .line 95
    .line 96
    invoke-virtual {v0, v4}, Lcom/exotv/net/PlayerActivity;->P(Z)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 100
    .line 101
    .line 102
    const-wide/16 v3, 0x2710

    .line 103
    .line 104
    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final onPlayerError(Landroidx/media3/common/x0;)V
    .locals 4

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/media3/common/x0;->getErrorCodeName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "playback error: "

    .line 13
    .line 14
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v2, "PlayerActivity"

    .line 25
    .line 26
    invoke-static {v2, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 27
    .line 28
    .line 29
    const p1, 0x7f110109

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lw4/r0;->j:Lcom/exotv/net/PlayerActivity;

    .line 33
    .line 34
    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, v1, Lcom/exotv/net/PlayerActivity;->S:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Lcom/exotv/net/PlayerActivity;->N(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final onTracksChanged(Landroidx/media3/common/x1;)V
    .locals 11

    .line 1
    const-string v0, "tracks"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget v0, Lcom/exotv/net/PlayerActivity;->z0:I

    .line 7
    .line 8
    iget-object p1, p1, Landroidx/media3/common/x1;->a:Lf6/m0;

    .line 9
    .line 10
    const-string v0, "getGroups(...)"

    .line 11
    .line 12
    invoke-static {v0, p1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x0

    .line 25
    move v3, v2

    .line 26
    :cond_0
    :goto_0
    const/4 v4, 0x2

    .line 27
    if-ge v3, v1, :cond_1

    .line 28
    .line 29
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    move-object v6, v5

    .line 36
    check-cast v6, Landroidx/media3/common/w1;

    .line 37
    .line 38
    iget-object v6, v6, Landroidx/media3/common/w1;->b:Landroidx/media3/common/q1;

    .line 39
    .line 40
    iget v6, v6, Landroidx/media3/common/q1;->c:I

    .line 41
    .line 42
    if-ne v6, v4, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    move v3, v2

    .line 58
    :goto_1
    const/4 v5, 0x0

    .line 59
    if-ge v3, v1, :cond_5

    .line 60
    .line 61
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    check-cast v6, Landroidx/media3/common/w1;

    .line 68
    .line 69
    iget v7, v6, Landroidx/media3/common/w1;->a:I

    .line 70
    .line 71
    invoke-static {v2, v7}, Lcom/bumptech/glide/c;->g0(II)Le7/c;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    new-instance v8, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v7}, Le7/a;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    :cond_2
    :goto_2
    move-object v9, v7

    .line 85
    check-cast v9, Le7/b;

    .line 86
    .line 87
    iget-boolean v10, v9, Le7/b;->l:Z

    .line 88
    .line 89
    if-eqz v10, :cond_4

    .line 90
    .line 91
    invoke-virtual {v9}, Le7/b;->nextInt()I

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    invoke-virtual {v6, v9}, Landroidx/media3/common/w1;->a(I)Landroidx/media3/common/w;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    iget v9, v9, Landroidx/media3/common/w;->v:I

    .line 100
    .line 101
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    if-lez v9, :cond_3

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_3
    move-object v10, v5

    .line 109
    :goto_3
    if-eqz v10, :cond_2

    .line 110
    .line 111
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_4
    invoke-static {p1, v8}, Lm6/n;->x0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_5
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 120
    .line 121
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    :goto_4
    if-ge v2, v1, :cond_9

    .line 129
    .line 130
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    add-int/lit8 v2, v2, 0x1

    .line 135
    .line 136
    move-object v6, v3

    .line 137
    check-cast v6, Ljava/lang/Number;

    .line 138
    .line 139
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    const/16 v7, 0x2d0

    .line 144
    .line 145
    if-le v6, v7, :cond_6

    .line 146
    .line 147
    const/16 v7, 0x438

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_6
    const/16 v8, 0x168

    .line 151
    .line 152
    if-le v6, v8, :cond_7

    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_7
    move v7, v8

    .line 156
    :goto_5
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    invoke-virtual {v0, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    if-nez v7, :cond_8

    .line 165
    .line 166
    new-instance v7, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-interface {v0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    :cond_8
    check-cast v7, Ljava/util/List;

    .line 175
    .line 176
    invoke-interface {v7, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_9
    new-instance p1, Ljava/util/ArrayList;

    .line 181
    .line 182
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-eqz v1, :cond_d

    .line 202
    .line 203
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    check-cast v1, Ljava/util/Map$Entry;

    .line 208
    .line 209
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    check-cast v2, Ljava/lang/Number;

    .line 214
    .line 215
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    check-cast v1, Ljava/util/List;

    .line 224
    .line 225
    new-instance v3, Lw4/l0;

    .line 226
    .line 227
    const-string v6, "<this>"

    .line 228
    .line 229
    invoke-static {v6, v1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 237
    .line 238
    .line 239
    move-result v6

    .line 240
    if-eqz v6, :cond_c

    .line 241
    .line 242
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    check-cast v6, Ljava/lang/Comparable;

    .line 247
    .line 248
    :cond_a
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    if-eqz v7, :cond_b

    .line 253
    .line 254
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    check-cast v7, Ljava/lang/Comparable;

    .line 259
    .line 260
    invoke-interface {v6, v7}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 261
    .line 262
    .line 263
    move-result v8

    .line 264
    if-gez v8, :cond_a

    .line 265
    .line 266
    move-object v6, v7

    .line 267
    goto :goto_7

    .line 268
    :cond_b
    check-cast v6, Ljava/lang/Number;

    .line 269
    .line 270
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    invoke-direct {v3, v2, v1}, Lw4/l0;-><init>(II)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    goto :goto_6

    .line 281
    :cond_c
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 282
    .line 283
    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    .line 284
    .line 285
    .line 286
    throw p1

    .line 287
    :cond_d
    new-instance v0, Ls/d;

    .line 288
    .line 289
    invoke-direct {v0, v4}, Ls/d;-><init>(I)V

    .line 290
    .line 291
    .line 292
    invoke-static {p1, v0}, Lm6/h;->J0(Ljava/util/ArrayList;Ljava/util/Comparator;)Ljava/util/List;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    iget-object v0, p0, Lw4/r0;->j:Lcom/exotv/net/PlayerActivity;

    .line 297
    .line 298
    iget-object v1, v0, Lcom/exotv/net/PlayerActivity;->p0:Ljava/util/List;

    .line 299
    .line 300
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v1

    .line 304
    if-eqz v1, :cond_e

    .line 305
    .line 306
    return-void

    .line 307
    :cond_e
    iput-object p1, v0, Lcom/exotv/net/PlayerActivity;->p0:Ljava/util/List;

    .line 308
    .line 309
    iget-object v1, v0, Lcom/exotv/net/PlayerActivity;->q0:Ljava/lang/Integer;

    .line 310
    .line 311
    if-eqz v1, :cond_13

    .line 312
    .line 313
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    if-eqz v1, :cond_f

    .line 318
    .line 319
    goto :goto_9

    .line 320
    :cond_f
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    :cond_10
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    if-eqz v1, :cond_12

    .line 329
    .line 330
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    check-cast v1, Lw4/l0;

    .line 335
    .line 336
    iget v1, v1, Lw4/l0;->a:I

    .line 337
    .line 338
    iget-object v2, v0, Lcom/exotv/net/PlayerActivity;->q0:Ljava/lang/Integer;

    .line 339
    .line 340
    if-nez v2, :cond_11

    .line 341
    .line 342
    goto :goto_8

    .line 343
    :cond_11
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    if-ne v1, v2, :cond_10

    .line 348
    .line 349
    goto :goto_a

    .line 350
    :cond_12
    :goto_9
    iput-object v5, v0, Lcom/exotv/net/PlayerActivity;->q0:Ljava/lang/Integer;

    .line 351
    .line 352
    invoke-virtual {v0}, Lcom/exotv/net/PlayerActivity;->u()V

    .line 353
    .line 354
    .line 355
    :cond_13
    :goto_a
    invoke-virtual {v0}, Lcom/exotv/net/PlayerActivity;->J()V

    .line 356
    .line 357
    .line 358
    return-void
.end method
