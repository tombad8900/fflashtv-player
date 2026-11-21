.class public final Ln1/l;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/q;


# static fields
.field public static final g:[I

.field public static final h:La1/e;

.field public static final i:La1/e;


# instance fields
.field public b:I

.field public c:Lf6/l1;

.field public d:Z

.field public e:Lk2/o;

.field public f:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/16 v0, 0x15

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Ln1/l;->g:[I

    .line 9
    .line 10
    new-instance v0, La1/e;

    .line 11
    .line 12
    new-instance v1, Ln0/b;

    .line 13
    .line 14
    const/4 v2, 0x7

    .line 15
    invoke-direct {v1, v2}, Ln0/b;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, La1/e;-><init>(Ln0/b;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Ln1/l;->h:La1/e;

    .line 22
    .line 23
    new-instance v0, La1/e;

    .line 24
    .line 25
    new-instance v1, Ln0/b;

    .line 26
    .line 27
    const/16 v2, 0x8

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ln0/b;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1}, La1/e;-><init>(Ln0/b;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Ln1/l;->i:La1/e;

    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :array_0
    .array-data 4
        0x5
        0x4
        0xc
        0x8
        0x3
        0xa
        0x9
        0xb
        0x6
        0x2
        0x0
        0x1
        0x7
        0x10
        0xf
        0xe
        0x11
        0x12
        0x13
        0x14
        0x15
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lk2/e;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ln1/l;->e:Lk2/o;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Ln1/l;->d:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final declared-synchronized a()[Ln1/n;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 3
    .line 4
    new-instance v1, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Ln1/l;->c(Landroid/net/Uri;Ljava/util/Map;)[Ln1/n;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    monitor-exit p0

    .line 14
    return-object v0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    throw v0
.end method

.method public final b(Z)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-boolean p1, p0, Ln1/l;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public final declared-synchronized c(Landroid/net/Uri;Ljava/util/Map;)[Ln1/n;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    sget-object v1, Ln1/l;->g:[I

    .line 5
    .line 6
    const/16 v2, 0x15

    .line 7
    .line 8
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const-string v3, "Content-Type"

    .line 12
    .line 13
    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    check-cast p2, Ljava/util/List;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, Ljava/lang/String;

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    const/4 p2, 0x0

    .line 37
    :goto_1
    invoke-static {p2}, Lcom/bumptech/glide/d;->N(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    const/4 v4, -0x1

    .line 42
    if-eq p2, v4, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0, p2, v0}, Ln1/l;->d(ILjava/util/ArrayList;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_4

    .line 50
    :cond_2
    :goto_2
    invoke-static {p1}, Lcom/bumptech/glide/d;->O(Landroid/net/Uri;)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eq p1, v4, :cond_3

    .line 55
    .line 56
    if-eq p1, p2, :cond_3

    .line 57
    .line 58
    invoke-virtual {p0, p1, v0}, Ln1/l;->d(ILjava/util/ArrayList;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    :goto_3
    if-ge v3, v2, :cond_5

    .line 62
    .line 63
    aget v4, v1, v3

    .line 64
    .line 65
    if-eq v4, p2, :cond_4

    .line 66
    .line 67
    if-eq v4, p1, :cond_4

    .line 68
    .line 69
    invoke-virtual {p0, v4, v0}, Ln1/l;->d(ILjava/util/ArrayList;)V

    .line 70
    .line 71
    .line 72
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    new-array p1, p1, [Ln1/n;

    .line 80
    .line 81
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, [Ln1/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    monitor-exit p0

    .line 88
    return-object p1

    .line 89
    :goto_4
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    throw p1
.end method

.method public final d(ILjava/util/ArrayList;)V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x0

    .line 4
    packed-switch p1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    :pswitch_0
    goto :goto_0

    .line 8
    :pswitch_1
    new-instance p1, Lq1/a;

    .line 9
    .line 10
    invoke-direct {p1, v2}, Lq1/a;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_2
    iget p1, p0, Ln1/l;->b:I

    .line 18
    .line 19
    and-int/lit8 v1, p1, 0x2

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    and-int/lit8 p1, p1, 0x4

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    new-instance p1, Lq1/a;

    .line 28
    .line 29
    invoke-direct {p1, v0}, Lq1/a;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_3
    new-instance p1, Lj2/a;

    .line 37
    .line 38
    invoke-direct {p1, v2, v0}, Lj2/a;-><init>(BI)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_4
    new-instance p1, Lq1/a;

    .line 46
    .line 47
    invoke-direct {p1, v1}, Lq1/a;-><init>(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_5
    new-instance p1, Lj2/a;

    .line 55
    .line 56
    invoke-direct {p1, v2, v2}, Lj2/a;-><init>(BI)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_6
    new-instance p1, Lp1/b;

    .line 64
    .line 65
    iget-boolean v1, p0, Ln1/l;->d:Z

    .line 66
    .line 67
    xor-int/2addr v0, v1

    .line 68
    iget-object v1, p0, Ln1/l;->e:Lk2/o;

    .line 69
    .line 70
    invoke-direct {p1, v0, v1}, Lp1/b;-><init>(ILk2/o;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_7
    sget-object p1, Ln1/l;->i:La1/e;

    .line 78
    .line 79
    new-array v0, v2, [Ljava/lang/Object;

    .line 80
    .line 81
    invoke-virtual {p1, v0}, La1/e;->z([Ljava/lang/Object;)Ln1/n;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-eqz p1, :cond_0

    .line 86
    .line 87
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    :cond_0
    :goto_0
    return-void

    .line 91
    :pswitch_8
    new-instance p1, Lj2/a;

    .line 92
    .line 93
    iget v0, p0, Ln1/l;->f:I

    .line 94
    .line 95
    invoke-direct {p1, v0}, Lj2/a;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :pswitch_9
    new-instance p1, Lu2/c;

    .line 103
    .line 104
    invoke-direct {p1}, Lu2/c;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_a
    iget-object p1, p0, Ln1/l;->c:Lf6/l1;

    .line 112
    .line 113
    if-nez p1, :cond_1

    .line 114
    .line 115
    sget-object p1, Lf6/m0;->k:Lf6/k0;

    .line 116
    .line 117
    sget-object p1, Lf6/l1;->n:Lf6/l1;

    .line 118
    .line 119
    iput-object p1, p0, Ln1/l;->c:Lf6/l1;

    .line 120
    .line 121
    :cond_1
    new-instance v3, Lt2/e0;

    .line 122
    .line 123
    iget-boolean p1, p0, Ln1/l;->d:Z

    .line 124
    .line 125
    xor-int/lit8 v5, p1, 0x1

    .line 126
    .line 127
    iget-object v6, p0, Ln1/l;->e:Lk2/o;

    .line 128
    .line 129
    new-instance v7, Lh1/d0;

    .line 130
    .line 131
    const-wide/16 v0, 0x0

    .line 132
    .line 133
    invoke-direct {v7, v0, v1}, Lh1/d0;-><init>(J)V

    .line 134
    .line 135
    .line 136
    new-instance v8, Lj0/i;

    .line 137
    .line 138
    iget-object p1, p0, Ln1/l;->c:Lf6/l1;

    .line 139
    .line 140
    invoke-direct {v8, v2, p1}, Lj0/i;-><init>(ILjava/util/List;)V

    .line 141
    .line 142
    .line 143
    const/4 v4, 0x1

    .line 144
    invoke-direct/range {v3 .. v8}, Lt2/e0;-><init>(IILk2/o;Lh1/d0;Lj0/i;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :pswitch_b
    new-instance p1, Lt2/b0;

    .line 152
    .line 153
    invoke-direct {p1}, Lt2/b0;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :pswitch_c
    new-instance p1, Li2/d;

    .line 161
    .line 162
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :pswitch_d
    new-instance p1, Lh2/i;

    .line 170
    .line 171
    iget-object v0, p0, Ln1/l;->e:Lk2/o;

    .line 172
    .line 173
    iget-boolean v1, p0, Ln1/l;->d:Z

    .line 174
    .line 175
    if-eqz v1, :cond_2

    .line 176
    .line 177
    move v1, v2

    .line 178
    goto :goto_1

    .line 179
    :cond_2
    const/16 v1, 0x20

    .line 180
    .line 181
    :goto_1
    invoke-direct {p1, v1, v0}, Lh2/i;-><init>(ILk2/o;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    new-instance p1, Lh2/m;

    .line 188
    .line 189
    iget-object v0, p0, Ln1/l;->e:Lk2/o;

    .line 190
    .line 191
    iget v1, p0, Ln1/l;->b:I

    .line 192
    .line 193
    iget-boolean v3, p0, Ln1/l;->d:Z

    .line 194
    .line 195
    if-eqz v3, :cond_3

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_3
    const/16 v2, 0x10

    .line 199
    .line 200
    :goto_2
    or-int/2addr v1, v2

    .line 201
    invoke-direct {p1, v1, v0}, Lh2/m;-><init>(ILk2/o;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    :pswitch_e
    new-instance p1, Lg2/e;

    .line 209
    .line 210
    invoke-direct {p1, v2}, Lg2/e;-><init>(I)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :pswitch_f
    new-instance p1, Lf2/d;

    .line 218
    .line 219
    iget-object v0, p0, Ln1/l;->e:Lk2/o;

    .line 220
    .line 221
    iget-boolean v3, p0, Ln1/l;->d:Z

    .line 222
    .line 223
    if-eqz v3, :cond_4

    .line 224
    .line 225
    move v1, v2

    .line 226
    :cond_4
    invoke-direct {p1, v1, v0}, Lf2/d;-><init>(ILk2/o;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    return-void

    .line 233
    :pswitch_10
    new-instance p1, Lt1/b;

    .line 234
    .line 235
    invoke-direct {p1}, Lt1/b;-><init>()V

    .line 236
    .line 237
    .line 238
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    return-void

    .line 242
    :pswitch_11
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    sget-object v0, Ln1/l;->h:La1/e;

    .line 251
    .line 252
    invoke-virtual {v0, p1}, La1/e;->z([Ljava/lang/Object;)Ln1/n;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    if-eqz p1, :cond_5

    .line 257
    .line 258
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    return-void

    .line 262
    :cond_5
    new-instance p1, Ls1/c;

    .line 263
    .line 264
    invoke-direct {p1}, Ls1/c;-><init>()V

    .line 265
    .line 266
    .line 267
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    return-void

    .line 271
    :pswitch_12
    new-instance p1, Lo1/a;

    .line 272
    .line 273
    invoke-direct {p1}, Lo1/a;-><init>()V

    .line 274
    .line 275
    .line 276
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    return-void

    .line 280
    :pswitch_13
    new-instance p1, Lt2/d;

    .line 281
    .line 282
    invoke-direct {p1, v2}, Lt2/d;-><init>(I)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    return-void

    .line 289
    :pswitch_14
    new-instance p1, Lt2/c;

    .line 290
    .line 291
    invoke-direct {p1}, Lt2/c;-><init>()V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    return-void

    .line 298
    :pswitch_15
    new-instance p1, Lt2/a;

    .line 299
    .line 300
    invoke-direct {p1}, Lt2/a;-><init>()V

    .line 301
    .line 302
    .line 303
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    return-void

    .line 307
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final setSubtitleParserFactory(Lk2/o;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Ln1/l;->e:Lk2/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method
