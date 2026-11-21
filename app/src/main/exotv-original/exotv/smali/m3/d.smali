.class public final Lm3/d;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public final synthetic n:I

.field public o:I

.field public final synthetic p:Lm3/h;

.field public final synthetic q:Lr3/k;

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lh3/d;

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;

.field public final synthetic v:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lm3/h;Lr3/k;Ljava/lang/Object;Lr3/o;Lh3/d;Lp3/a;Lm3/j;Lp6/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lm3/d;->n:I

    .line 1
    iput-object p1, p0, Lm3/d;->p:Lm3/h;

    iput-object p2, p0, Lm3/d;->q:Lr3/k;

    iput-object p3, p0, Lm3/d;->r:Ljava/lang/Object;

    iput-object p4, p0, Lm3/d;->t:Ljava/lang/Object;

    iput-object p5, p0, Lm3/d;->s:Lh3/d;

    iput-object p6, p0, Lm3/d;->u:Ljava/lang/Object;

    iput-object p7, p0, Lm3/d;->v:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lr6/h;-><init>(ILp6/c;)V

    return-void
.end method

.method public constructor <init>(Lm3/h;Lz6/n;Lz6/n;Lr3/k;Ljava/lang/Object;Lz6/n;Lh3/d;Lp6/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lm3/d;->n:I

    .line 2
    iput-object p1, p0, Lm3/d;->p:Lm3/h;

    iput-object p2, p0, Lm3/d;->t:Ljava/lang/Object;

    iput-object p3, p0, Lm3/d;->u:Ljava/lang/Object;

    iput-object p4, p0, Lm3/d;->q:Lr3/k;

    iput-object p5, p0, Lm3/d;->r:Ljava/lang/Object;

    iput-object p6, p0, Lm3/d;->v:Ljava/lang/Object;

    iput-object p7, p0, Lm3/d;->s:Lh3/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lr6/h;-><init>(ILp6/c;)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lm3/d;->n:I

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
    invoke-virtual {p0, p1, p2}, Lm3/d;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lm3/d;

    .line 15
    .line 16
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lm3/d;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lm3/d;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lm3/d;

    .line 28
    .line 29
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lm3/d;->h(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 10

    .line 1
    iget p1, p0, Lm3/d;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lm3/d;

    .line 7
    .line 8
    iget-object p1, p0, Lm3/d;->t:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v4, p1

    .line 11
    check-cast v4, Lr3/o;

    .line 12
    .line 13
    iget-object p1, p0, Lm3/d;->u:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v6, p1

    .line 16
    check-cast v6, Lp3/a;

    .line 17
    .line 18
    iget-object p1, p0, Lm3/d;->v:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v7, p1

    .line 21
    check-cast v7, Lm3/j;

    .line 22
    .line 23
    iget-object v1, p0, Lm3/d;->p:Lm3/h;

    .line 24
    .line 25
    iget-object v2, p0, Lm3/d;->q:Lr3/k;

    .line 26
    .line 27
    iget-object v3, p0, Lm3/d;->r:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v5, p0, Lm3/d;->s:Lh3/d;

    .line 30
    .line 31
    move-object v8, p2

    .line 32
    invoke-direct/range {v0 .. v8}, Lm3/d;-><init>(Lm3/h;Lr3/k;Ljava/lang/Object;Lr3/o;Lh3/d;Lp3/a;Lm3/j;Lp6/c;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    move-object v8, p2

    .line 37
    new-instance v1, Lm3/d;

    .line 38
    .line 39
    iget-object p1, p0, Lm3/d;->t:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v3, p1

    .line 42
    check-cast v3, Lz6/n;

    .line 43
    .line 44
    iget-object p1, p0, Lm3/d;->u:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v4, p1

    .line 47
    check-cast v4, Lz6/n;

    .line 48
    .line 49
    iget-object p1, p0, Lm3/d;->v:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v7, p1

    .line 52
    check-cast v7, Lz6/n;

    .line 53
    .line 54
    move-object v9, v8

    .line 55
    iget-object v8, p0, Lm3/d;->s:Lh3/d;

    .line 56
    .line 57
    iget-object v2, p0, Lm3/d;->p:Lm3/h;

    .line 58
    .line 59
    iget-object v5, p0, Lm3/d;->q:Lr3/k;

    .line 60
    .line 61
    iget-object v6, p0, Lm3/d;->r:Ljava/lang/Object;

    .line 62
    .line 63
    invoke-direct/range {v1 .. v9}, Lm3/d;-><init>(Lm3/h;Lz6/n;Lz6/n;Lr3/k;Ljava/lang/Object;Lz6/n;Lh3/d;Lp6/c;)V

    .line 64
    .line 65
    .line 66
    return-object v1

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget v0, v5, Lm3/d;->n:I

    .line 4
    .line 5
    const/4 v6, 0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v7, Lq6/a;->j:Lq6/a;

    .line 10
    .line 11
    iget v0, v5, Lm3/d;->o:I

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    if-ne v0, v6, :cond_0

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    move-object/from16 v0, p1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0

    .line 31
    :cond_1
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, v5, Lm3/d;->p:Lm3/h;

    .line 35
    .line 36
    iget-object v1, v5, Lm3/d;->q:Lr3/k;

    .line 37
    .line 38
    iget-object v2, v5, Lm3/d;->r:Ljava/lang/Object;

    .line 39
    .line 40
    iget-object v3, v5, Lm3/d;->t:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Lr3/o;

    .line 43
    .line 44
    iget-object v4, v5, Lm3/d;->s:Lh3/d;

    .line 45
    .line 46
    iput v6, v5, Lm3/d;->o:I

    .line 47
    .line 48
    invoke-static/range {v0 .. v5}, Lm3/h;->b(Lm3/h;Lr3/k;Ljava/lang/Object;Lr3/o;Lh3/d;Lr6/c;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-ne v0, v7, :cond_2

    .line 53
    .line 54
    goto/16 :goto_7

    .line 55
    .line 56
    :cond_2
    :goto_0
    check-cast v0, Lm3/a;

    .line 57
    .line 58
    iget-object v1, v5, Lm3/d;->p:Lm3/h;

    .line 59
    .line 60
    iget-object v1, v1, Lm3/h;->b:Lv3/l;

    .line 61
    .line 62
    monitor-enter v1

    .line 63
    :try_start_0
    iget-object v2, v1, Lv3/l;->j:Ljava/lang/ref/WeakReference;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Lh3/h;

    .line 70
    .line 71
    if-eqz v2, :cond_3

    .line 72
    .line 73
    iget-object v3, v1, Lv3/l;->k:Landroid/content/Context;

    .line 74
    .line 75
    if-nez v3, :cond_4

    .line 76
    .line 77
    iget-object v2, v2, Lh3/h;->a:Landroid/content/Context;

    .line 78
    .line 79
    iput-object v2, v1, Lv3/l;->k:Landroid/content/Context;

    .line 80
    .line 81
    invoke-virtual {v2, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :catchall_0
    move-exception v0

    .line 86
    goto/16 :goto_8

    .line 87
    .line 88
    :cond_3
    invoke-virtual {v1}, Lv3/l;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    .line 91
    :cond_4
    :goto_1
    monitor-exit v1

    .line 92
    iget-object v1, v5, Lm3/d;->p:Lm3/h;

    .line 93
    .line 94
    iget-object v1, v1, Lm3/h;->d:Ll/o;

    .line 95
    .line 96
    iget-object v2, v5, Lm3/d;->u:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v2, Lp3/a;

    .line 99
    .line 100
    iget-object v3, v5, Lm3/d;->q:Lr3/k;

    .line 101
    .line 102
    iget-object v3, v3, Lr3/k;->o:Lr3/b;

    .line 103
    .line 104
    iget-boolean v3, v3, Lr3/b;->k:Z

    .line 105
    .line 106
    const/4 v4, 0x0

    .line 107
    const/4 v7, 0x0

    .line 108
    if-nez v3, :cond_6

    .line 109
    .line 110
    :cond_5
    :goto_2
    move v1, v4

    .line 111
    goto :goto_4

    .line 112
    :cond_6
    iget-object v1, v1, Ll/o;->j:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v1, Lh3/h;

    .line 115
    .line 116
    iget-object v1, v1, Lh3/h;->c:Ll6/g;

    .line 117
    .line 118
    invoke-virtual {v1}, Ll6/g;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    check-cast v1, Lp3/c;

    .line 123
    .line 124
    if-eqz v1, :cond_5

    .line 125
    .line 126
    if-nez v2, :cond_7

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_7
    iget-object v3, v0, Lm3/a;->a:Landroid/graphics/drawable/Drawable;

    .line 130
    .line 131
    instance-of v8, v3, Landroid/graphics/drawable/BitmapDrawable;

    .line 132
    .line 133
    if-eqz v8, :cond_8

    .line 134
    .line 135
    check-cast v3, Landroid/graphics/drawable/BitmapDrawable;

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_8
    move-object v3, v7

    .line 139
    :goto_3
    if-eqz v3, :cond_5

    .line 140
    .line 141
    invoke-virtual {v3}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    if-nez v3, :cond_9

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_9
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 149
    .line 150
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 151
    .line 152
    .line 153
    const-string v9, "coil#is_sampled"

    .line 154
    .line 155
    iget-boolean v10, v0, Lm3/a;->b:Z

    .line 156
    .line 157
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    invoke-interface {v8, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    iget-object v9, v0, Lm3/a;->d:Ljava/lang/String;

    .line 165
    .line 166
    if-eqz v9, :cond_a

    .line 167
    .line 168
    const-string v10, "coil#disk_cache_key"

    .line 169
    .line 170
    invoke-interface {v8, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    :cond_a
    iget-object v1, v1, Lp3/c;->a:Lp3/g;

    .line 174
    .line 175
    iget-object v9, v2, Lp3/a;->k:Ljava/util/Map;

    .line 176
    .line 177
    invoke-static {v9}, Lt2/i0;->G(Ljava/util/Map;)Ljava/util/Map;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    iget-object v2, v2, Lp3/a;->j:Ljava/lang/String;

    .line 182
    .line 183
    new-instance v10, Lp3/a;

    .line 184
    .line 185
    invoke-direct {v10, v2, v9}, Lp3/a;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 186
    .line 187
    .line 188
    invoke-static {v8}, Lt2/i0;->G(Ljava/util/Map;)Ljava/util/Map;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-interface {v1, v10, v3, v2}, Lp3/g;->g(Lp3/a;Landroid/graphics/Bitmap;Ljava/util/Map;)V

    .line 193
    .line 194
    .line 195
    move v1, v6

    .line 196
    :goto_4
    iget-object v9, v0, Lm3/a;->a:Landroid/graphics/drawable/Drawable;

    .line 197
    .line 198
    iget-object v10, v5, Lm3/d;->q:Lr3/k;

    .line 199
    .line 200
    iget-object v11, v0, Lm3/a;->c:Li3/f;

    .line 201
    .line 202
    iget-object v2, v5, Lm3/d;->u:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v2, Lp3/a;

    .line 205
    .line 206
    if-eqz v1, :cond_b

    .line 207
    .line 208
    move-object v12, v2

    .line 209
    goto :goto_5

    .line 210
    :cond_b
    move-object v12, v7

    .line 211
    :goto_5
    iget-object v13, v0, Lm3/a;->d:Ljava/lang/String;

    .line 212
    .line 213
    iget-boolean v14, v0, Lm3/a;->b:Z

    .line 214
    .line 215
    iget-object v0, v5, Lm3/d;->v:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v0, Lm3/j;

    .line 218
    .line 219
    sget-object v1, Lv3/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 220
    .line 221
    if-eqz v0, :cond_c

    .line 222
    .line 223
    iget-boolean v0, v0, Lm3/j;->g:Z

    .line 224
    .line 225
    if-eqz v0, :cond_c

    .line 226
    .line 227
    move v15, v6

    .line 228
    goto :goto_6

    .line 229
    :cond_c
    move v15, v4

    .line 230
    :goto_6
    new-instance v8, Lr3/r;

    .line 231
    .line 232
    invoke-direct/range {v8 .. v15}, Lr3/r;-><init>(Landroid/graphics/drawable/Drawable;Lr3/k;Li3/f;Lp3/a;Ljava/lang/String;ZZ)V

    .line 233
    .line 234
    .line 235
    move-object v7, v8

    .line 236
    :goto_7
    return-object v7

    .line 237
    :goto_8
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 238
    throw v0

    .line 239
    :pswitch_0
    sget-object v8, Lq6/a;->j:Lq6/a;

    .line 240
    .line 241
    iget v0, v5, Lm3/d;->o:I

    .line 242
    .line 243
    if-eqz v0, :cond_e

    .line 244
    .line 245
    if-ne v0, v6, :cond_d

    .line 246
    .line 247
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    move-object/from16 v0, p1

    .line 251
    .line 252
    goto :goto_9

    .line 253
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 254
    .line 255
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 256
    .line 257
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    throw v0

    .line 261
    :cond_e
    invoke-static/range {p1 .. p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    iget-object v0, v5, Lm3/d;->p:Lm3/h;

    .line 265
    .line 266
    iget-object v1, v5, Lm3/d;->t:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v1, Lz6/n;

    .line 269
    .line 270
    iget-object v1, v1, Lz6/n;->j:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v1, Ll3/n;

    .line 273
    .line 274
    iget-object v2, v5, Lm3/d;->u:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v2, Lz6/n;

    .line 277
    .line 278
    iget-object v2, v2, Lz6/n;->j:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v2, Lh3/c;

    .line 281
    .line 282
    iget-object v3, v5, Lm3/d;->q:Lr3/k;

    .line 283
    .line 284
    iget-object v4, v5, Lm3/d;->r:Ljava/lang/Object;

    .line 285
    .line 286
    iget-object v7, v5, Lm3/d;->v:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v7, Lz6/n;

    .line 289
    .line 290
    iget-object v7, v7, Lz6/n;->j:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v7, Lr3/o;

    .line 293
    .line 294
    iget-object v9, v5, Lm3/d;->s:Lh3/d;

    .line 295
    .line 296
    iput v6, v5, Lm3/d;->o:I

    .line 297
    .line 298
    move-object v6, v7

    .line 299
    move-object v7, v5

    .line 300
    move-object v5, v6

    .line 301
    move-object v6, v9

    .line 302
    invoke-static/range {v0 .. v7}, Lm3/h;->a(Lm3/h;Ll3/n;Lh3/c;Lr3/k;Ljava/lang/Object;Lr3/o;Lh3/d;Lr6/c;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    if-ne v0, v8, :cond_f

    .line 307
    .line 308
    move-object v0, v8

    .line 309
    :cond_f
    :goto_9
    return-object v0

    .line 310
    nop

    .line 311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
