.class public final Lw4/v;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public final synthetic n:I

.field public o:I

.field public final synthetic p:Z

.field public final synthetic q:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/exotv/net/MainActivity;ZLp6/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lw4/v;->n:I

    .line 1
    iput-object p1, p0, Lw4/v;->q:Landroid/content/Context;

    iput-boolean p2, p0, Lw4/v;->p:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lr6/h;-><init>(ILp6/c;)V

    return-void
.end method

.method public constructor <init>(ZLandroid/content/Context;Lp6/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lw4/v;->n:I

    .line 2
    iput-boolean p1, p0, Lw4/v;->p:Z

    iput-object p2, p0, Lw4/v;->q:Landroid/content/Context;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lr6/h;-><init>(ILp6/c;)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lw4/v;->n:I

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
    invoke-virtual {p0, p1, p2}, Lw4/v;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lw4/v;

    .line 15
    .line 16
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lw4/v;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lw4/v;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lw4/v;

    .line 28
    .line 29
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lw4/v;->h(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget p1, p0, Lw4/v;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lw4/v;

    .line 7
    .line 8
    iget-boolean v0, p0, Lw4/v;->p:Z

    .line 9
    .line 10
    iget-object v1, p0, Lw4/v;->q:Landroid/content/Context;

    .line 11
    .line 12
    invoke-direct {p1, v0, v1, p2}, Lw4/v;-><init>(ZLandroid/content/Context;Lp6/c;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    new-instance p1, Lw4/v;

    .line 17
    .line 18
    iget-object v0, p0, Lw4/v;->q:Landroid/content/Context;

    .line 19
    .line 20
    check-cast v0, Lcom/exotv/net/MainActivity;

    .line 21
    .line 22
    iget-boolean v1, p0, Lw4/v;->p:Z

    .line 23
    .line 24
    invoke-direct {p1, v0, v1, p2}, Lw4/v;-><init>(Lcom/exotv/net/MainActivity;ZLp6/c;)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lw4/v;->n:I

    .line 2
    .line 3
    iget-boolean v1, p0, Lw4/v;->p:Z

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, p0, Lw4/v;->q:Landroid/content/Context;

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
    iget v6, p0, Lw4/v;->o:I

    .line 17
    .line 18
    const-string v7, "channels_cache"

    .line 19
    .line 20
    if-eqz v6, :cond_1

    .line 21
    .line 22
    if-ne v6, v3, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    if-nez v1, :cond_7

    .line 39
    .line 40
    const-string p1, "substring(...)"

    .line 41
    .line 42
    :try_start_0
    new-instance v1, Ljava/io/File;

    .line 43
    .line 44
    invoke-virtual {v4}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-direct {v1, v2, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_3

    .line 56
    .line 57
    :catchall_0
    :cond_2
    :goto_0
    move-object p1, v5

    .line 58
    goto :goto_2

    .line 59
    :cond_3
    invoke-static {v1}, Lw6/a;->u(Ljava/io/File;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const/16 v2, 0xa

    .line 64
    .line 65
    const/4 v6, 0x6

    .line 66
    const/4 v8, 0x0

    .line 67
    invoke-static {v1, v2, v8, v6}, Lh7/h;->A0(Ljava/lang/CharSequence;CII)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-gtz v2, :cond_4

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    invoke-virtual {v1, v8, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-static {p1, v6}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v6}, Lh7/o;->l0(Ljava/lang/String;)Ljava/lang/Long;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    if-nez v6, :cond_5

    .line 86
    .line 87
    const-wide v8, 0x7fffffffffffffffL

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 94
    .line 95
    .line 96
    move-result-wide v8

    .line 97
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 98
    .line 99
    .line 100
    move-result-wide v10

    .line 101
    sub-long/2addr v8, v10

    .line 102
    :goto_1
    const-wide/16 v10, 0x0

    .line 103
    .line 104
    cmp-long v6, v8, v10

    .line 105
    .line 106
    if-ltz v6, :cond_2

    .line 107
    .line 108
    const-wide/32 v10, 0x2932e00

    .line 109
    .line 110
    .line 111
    cmp-long v6, v8, v10

    .line 112
    .line 113
    if-ltz v6, :cond_6

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_6
    add-int/2addr v2, v3

    .line 117
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-static {p1, v1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    new-instance p1, Lorg/json/JSONArray;

    .line 125
    .line 126
    new-instance v2, Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {v1}, Lt2/i0;->a(Ljava/lang/String;)[B

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-static {v1}, Lt2/i0;->I([B)[B

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    sget-object v6, Lh7/a;->a:Ljava/nio/charset/Charset;

    .line 137
    .line 138
    invoke-direct {v2, v1, v6}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 139
    .line 140
    .line 141
    invoke-direct {p1, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-static {p1}, Lz4/b;->b(Lorg/json/JSONArray;)Ln6/c;

    .line 145
    .line 146
    .line 147
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    :goto_2
    if-eqz p1, :cond_7

    .line 149
    .line 150
    move-object v5, p1

    .line 151
    goto :goto_4

    .line 152
    :cond_7
    iput v3, p0, Lw4/v;->o:I

    .line 153
    .line 154
    invoke-static {p0}, Lz4/b;->a(Lr6/c;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    if-ne p1, v0, :cond_8

    .line 159
    .line 160
    move-object v5, v0

    .line 161
    goto :goto_4

    .line 162
    :cond_8
    :goto_3
    check-cast p1, Ljava/lang/String;

    .line 163
    .line 164
    if-nez p1, :cond_9

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_9
    :try_start_1
    new-instance v0, Lorg/json/JSONArray;

    .line 168
    .line 169
    new-instance v1, Ljava/lang/String;

    .line 170
    .line 171
    invoke-static {p1}, Lt2/i0;->a(Ljava/lang/String;)[B

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-static {v2}, Lt2/i0;->I([B)[B

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    sget-object v3, Lh7/a;->a:Ljava/nio/charset/Charset;

    .line 180
    .line 181
    invoke-direct {v1, v2, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 182
    .line 183
    .line 184
    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v0}, Lz4/b;->b(Lorg/json/JSONArray;)Ln6/c;

    .line 188
    .line 189
    .line 190
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 191
    :catchall_1
    if-eqz v5, :cond_a

    .line 192
    .line 193
    :try_start_2
    new-instance v0, Ljava/io/File;

    .line 194
    .line 195
    invoke-virtual {v4}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-direct {v0, v1, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 203
    .line 204
    .line 205
    move-result-wide v1

    .line 206
    new-instance v3, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    const-string v1, "\n"

    .line 215
    .line 216
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    sget-object v1, Lh7/a;->a:Ljava/nio/charset/Charset;

    .line 227
    .line 228
    const-string v2, "text"

    .line 229
    .line 230
    invoke-static {v2, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    const-string v2, "charset"

    .line 234
    .line 235
    invoke-static {v2, v1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    new-instance v2, Ljava/io/FileOutputStream;

    .line 239
    .line 240
    invoke-direct {v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 241
    .line 242
    .line 243
    :try_start_3
    invoke-static {v2, p1, v1}, Lw6/a;->w(Ljava/io/FileOutputStream;Ljava/lang/String;Ljava/nio/charset/Charset;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 244
    .line 245
    .line 246
    :try_start_4
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 247
    .line 248
    .line 249
    goto :goto_4

    .line 250
    :catchall_2
    move-exception p1

    .line 251
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 252
    :catchall_3
    move-exception v0

    .line 253
    :try_start_6
    invoke-static {v2, p1}, Lt5/a;->b(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 254
    .line 255
    .line 256
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 257
    :catchall_4
    :cond_a
    :goto_4
    return-object v5

    .line 258
    :pswitch_0
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 259
    .line 260
    iget v6, p0, Lw4/v;->o:I

    .line 261
    .line 262
    if-eqz v6, :cond_c

    .line 263
    .line 264
    if-ne v6, v3, :cond_b

    .line 265
    .line 266
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 271
    .line 272
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    throw p1

    .line 276
    :cond_c
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    check-cast v4, Lcom/exotv/net/MainActivity;

    .line 280
    .line 281
    iput v3, p0, Lw4/v;->o:I

    .line 282
    .line 283
    sget-object p1, Li7/e0;->a:Lo7/e;

    .line 284
    .line 285
    sget-object p1, Lo7/d;->l:Lo7/d;

    .line 286
    .line 287
    new-instance v2, Lw4/v;

    .line 288
    .line 289
    invoke-direct {v2, v1, v4, v5}, Lw4/v;-><init>(ZLandroid/content/Context;Lp6/c;)V

    .line 290
    .line 291
    .line 292
    invoke-static {p1, v2, p0}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    if-ne p1, v0, :cond_d

    .line 297
    .line 298
    move-object p1, v0

    .line 299
    :cond_d
    :goto_5
    return-object p1

    .line 300
    nop

    .line 301
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
