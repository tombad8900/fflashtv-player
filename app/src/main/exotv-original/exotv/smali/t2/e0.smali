.class public final Lt2/e0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/n;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/util/List;

.field public final d:Lh1/w;

.field public final e:Landroid/util/SparseIntArray;

.field public final f:Lj0/i;

.field public final g:Lk2/o;

.field public final h:Landroid/util/SparseArray;

.field public final i:Landroid/util/SparseBooleanArray;

.field public final j:Landroid/util/SparseBooleanArray;

.field public final k:Lt2/z;

.field public l:Ls1/b;

.field public m:Ln1/p;

.field public n:I

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Lt2/h0;

.field public s:I

.field public t:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(IILk2/o;Lh1/d0;Lj0/i;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p5, p0, Lt2/e0;->f:Lj0/i;

    .line 5
    .line 6
    iput p1, p0, Lt2/e0;->a:I

    .line 7
    .line 8
    iput p2, p0, Lt2/e0;->b:I

    .line 9
    .line 10
    iput-object p3, p0, Lt2/e0;->g:Lk2/o;

    .line 11
    .line 12
    const/4 p2, 0x1

    .line 13
    if-eq p1, p2, :cond_1

    .line 14
    .line 15
    const/4 p2, 0x2

    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lt2/e0;->c:Ljava/util/List;

    .line 25
    .line 26
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    invoke-static {p4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lt2/e0;->c:Ljava/util/List;

    .line 35
    .line 36
    :goto_1
    new-instance p1, Lh1/w;

    .line 37
    .line 38
    const/16 p2, 0x24b8

    .line 39
    .line 40
    new-array p2, p2, [B

    .line 41
    .line 42
    const/4 p3, 0x0

    .line 43
    invoke-direct {p1, p2, p3}, Lh1/w;-><init>([BI)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lt2/e0;->d:Lh1/w;

    .line 47
    .line 48
    new-instance p1, Landroid/util/SparseBooleanArray;

    .line 49
    .line 50
    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lt2/e0;->i:Landroid/util/SparseBooleanArray;

    .line 54
    .line 55
    new-instance p2, Landroid/util/SparseBooleanArray;

    .line 56
    .line 57
    invoke-direct {p2}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p2, p0, Lt2/e0;->j:Landroid/util/SparseBooleanArray;

    .line 61
    .line 62
    new-instance p2, Landroid/util/SparseArray;

    .line 63
    .line 64
    invoke-direct {p2}, Landroid/util/SparseArray;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object p2, p0, Lt2/e0;->h:Landroid/util/SparseArray;

    .line 68
    .line 69
    new-instance p4, Landroid/util/SparseIntArray;

    .line 70
    .line 71
    invoke-direct {p4}, Landroid/util/SparseIntArray;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object p4, p0, Lt2/e0;->e:Landroid/util/SparseIntArray;

    .line 75
    .line 76
    new-instance p4, Lt2/z;

    .line 77
    .line 78
    const/4 p5, 0x1

    .line 79
    invoke-direct {p4, p5}, Lt2/z;-><init>(I)V

    .line 80
    .line 81
    .line 82
    iput-object p4, p0, Lt2/e0;->k:Lt2/z;

    .line 83
    .line 84
    sget-object p4, Ln1/p;->i:Lk2/b;

    .line 85
    .line 86
    iput-object p4, p0, Lt2/e0;->m:Ln1/p;

    .line 87
    .line 88
    const/4 p4, -0x1

    .line 89
    iput p4, p0, Lt2/e0;->t:I

    .line 90
    .line 91
    invoke-virtual {p1}, Landroid/util/SparseBooleanArray;->clear()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Landroid/util/SparseArray;->clear()V

    .line 95
    .line 96
    .line 97
    new-instance p1, Landroid/util/SparseArray;

    .line 98
    .line 99
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 103
    .line 104
    .line 105
    move-result p4

    .line 106
    move p5, p3

    .line 107
    :goto_2
    if-ge p5, p4, :cond_2

    .line 108
    .line 109
    invoke-virtual {p1, p5}, Landroid/util/SparseArray;->keyAt(I)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-virtual {p1, p5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Lt2/h0;

    .line 118
    .line 119
    invoke-virtual {p2, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    add-int/lit8 p5, p5, 0x1

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_2
    new-instance p1, Lt2/d0;

    .line 126
    .line 127
    new-instance p4, Ls/e;

    .line 128
    .line 129
    invoke-direct {p4, p0}, Ls/e;-><init>(Lt2/e0;)V

    .line 130
    .line 131
    .line 132
    invoke-direct {p1, p4}, Lt2/d0;-><init>(Lt2/c0;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, p3, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    const/4 p1, 0x0

    .line 139
    iput-object p1, p0, Lt2/e0;->r:Lt2/h0;

    .line 140
    .line 141
    return-void
.end method


# virtual methods
.method public final init(Ln1/p;)V
    .locals 2

    .line 1
    iget v0, p0, Lt2/e0;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, La4/c;

    .line 8
    .line 9
    iget-object v1, p0, Lt2/e0;->g:Lk2/o;

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, La4/c;-><init>(Ln1/p;Lk2/o;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v0

    .line 15
    :cond_0
    iput-object p1, p0, Lt2/e0;->m:Ln1/p;

    .line 16
    .line 17
    return-void
.end method

.method public final read(Ln1/o;Ln1/a0;)I
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-interface {v1}, Ln1/o;->getLength()J

    .line 8
    .line 9
    .line 10
    move-result-wide v12

    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    iget v5, v0, Lt2/e0;->a:I

    .line 14
    .line 15
    const/4 v6, 0x2

    .line 16
    if-ne v5, v6, :cond_0

    .line 17
    .line 18
    move/from16 v17, v3

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move/from16 v17, v4

    .line 22
    .line 23
    :goto_0
    iget-boolean v7, v0, Lt2/e0;->o:Z

    .line 24
    .line 25
    const/16 v8, 0x47

    .line 26
    .line 27
    const-wide/16 v18, -0x1

    .line 28
    .line 29
    if-eqz v7, :cond_15

    .line 30
    .line 31
    cmp-long v7, v12, v18

    .line 32
    .line 33
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    iget-object v11, v0, Lt2/e0;->k:Lt2/z;

    .line 39
    .line 40
    if-eqz v7, :cond_10

    .line 41
    .line 42
    if-nez v17, :cond_10

    .line 43
    .line 44
    iget-boolean v7, v11, Lt2/z;->d:Z

    .line 45
    .line 46
    if-nez v7, :cond_10

    .line 47
    .line 48
    iget v5, v0, Lt2/e0;->t:I

    .line 49
    .line 50
    iget-object v6, v11, Lt2/z;->b:Lh1/d0;

    .line 51
    .line 52
    iget-object v7, v11, Lt2/z;->c:Lh1/w;

    .line 53
    .line 54
    if-gtz v5, :cond_1

    .line 55
    .line 56
    invoke-virtual {v11, v1}, Lt2/z;->a(Ln1/o;)V

    .line 57
    .line 58
    .line 59
    return v4

    .line 60
    :cond_1
    iget-boolean v12, v11, Lt2/z;->f:Z

    .line 61
    .line 62
    const v13, 0x1b8a0

    .line 63
    .line 64
    .line 65
    if-nez v12, :cond_8

    .line 66
    .line 67
    invoke-interface {v1}, Ln1/o;->getLength()J

    .line 68
    .line 69
    .line 70
    move-result-wide v14

    .line 71
    int-to-long v12, v13

    .line 72
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->min(JJ)J

    .line 73
    .line 74
    .line 75
    move-result-wide v12

    .line 76
    long-to-int v6, v12

    .line 77
    int-to-long v12, v6

    .line 78
    sub-long/2addr v14, v12

    .line 79
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 80
    .line 81
    .line 82
    move-result-wide v12

    .line 83
    cmp-long v12, v12, v14

    .line 84
    .line 85
    if-eqz v12, :cond_2

    .line 86
    .line 87
    iput-wide v14, v2, Ln1/a0;->a:J

    .line 88
    .line 89
    return v3

    .line 90
    :cond_2
    invoke-virtual {v7, v6}, Lh1/w;->D(I)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v1}, Ln1/o;->g()V

    .line 94
    .line 95
    .line 96
    iget-object v2, v7, Lh1/w;->a:[B

    .line 97
    .line 98
    invoke-interface {v1, v2, v4, v6}, Ln1/o;->i([BII)V

    .line 99
    .line 100
    .line 101
    iget v1, v7, Lh1/w;->b:I

    .line 102
    .line 103
    iget v2, v7, Lh1/w;->c:I

    .line 104
    .line 105
    add-int/lit16 v6, v2, -0xbc

    .line 106
    .line 107
    :goto_1
    if-lt v6, v1, :cond_7

    .line 108
    .line 109
    iget-object v12, v7, Lh1/w;->a:[B

    .line 110
    .line 111
    const/4 v13, -0x4

    .line 112
    move v14, v4

    .line 113
    :goto_2
    const/4 v15, 0x4

    .line 114
    if-gt v13, v15, :cond_6

    .line 115
    .line 116
    mul-int/lit16 v15, v13, 0xbc

    .line 117
    .line 118
    add-int/2addr v15, v6

    .line 119
    if-lt v15, v1, :cond_4

    .line 120
    .line 121
    if-ge v15, v2, :cond_4

    .line 122
    .line 123
    aget-byte v15, v12, v15

    .line 124
    .line 125
    if-eq v15, v8, :cond_3

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_3
    add-int/2addr v14, v3

    .line 129
    const/4 v15, 0x5

    .line 130
    if-ne v14, v15, :cond_5

    .line 131
    .line 132
    invoke-static {v7, v6, v5}, Lt2/i0;->y(Lh1/w;II)J

    .line 133
    .line 134
    .line 135
    move-result-wide v12

    .line 136
    cmp-long v14, v12, v9

    .line 137
    .line 138
    if-eqz v14, :cond_6

    .line 139
    .line 140
    move-wide v9, v12

    .line 141
    goto :goto_4

    .line 142
    :cond_4
    :goto_3
    move v14, v4

    .line 143
    :cond_5
    add-int/lit8 v13, v13, 0x1

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_6
    add-int/lit8 v6, v6, -0x1

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_7
    :goto_4
    iput-wide v9, v11, Lt2/z;->h:J

    .line 150
    .line 151
    iput-boolean v3, v11, Lt2/z;->f:Z

    .line 152
    .line 153
    return v4

    .line 154
    :cond_8
    iget-wide v14, v11, Lt2/z;->h:J

    .line 155
    .line 156
    cmp-long v12, v14, v9

    .line 157
    .line 158
    if-nez v12, :cond_9

    .line 159
    .line 160
    invoke-virtual {v11, v1}, Lt2/z;->a(Ln1/o;)V

    .line 161
    .line 162
    .line 163
    return v4

    .line 164
    :cond_9
    iget-boolean v12, v11, Lt2/z;->e:Z

    .line 165
    .line 166
    if-nez v12, :cond_e

    .line 167
    .line 168
    int-to-long v12, v13

    .line 169
    invoke-interface {v1}, Ln1/o;->getLength()J

    .line 170
    .line 171
    .line 172
    move-result-wide v14

    .line 173
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->min(JJ)J

    .line 174
    .line 175
    .line 176
    move-result-wide v12

    .line 177
    long-to-int v6, v12

    .line 178
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 179
    .line 180
    .line 181
    move-result-wide v12

    .line 182
    int-to-long v14, v4

    .line 183
    cmp-long v12, v12, v14

    .line 184
    .line 185
    if-eqz v12, :cond_a

    .line 186
    .line 187
    iput-wide v14, v2, Ln1/a0;->a:J

    .line 188
    .line 189
    return v3

    .line 190
    :cond_a
    invoke-virtual {v7, v6}, Lh1/w;->D(I)V

    .line 191
    .line 192
    .line 193
    invoke-interface {v1}, Ln1/o;->g()V

    .line 194
    .line 195
    .line 196
    iget-object v2, v7, Lh1/w;->a:[B

    .line 197
    .line 198
    invoke-interface {v1, v2, v4, v6}, Ln1/o;->i([BII)V

    .line 199
    .line 200
    .line 201
    iget v1, v7, Lh1/w;->b:I

    .line 202
    .line 203
    iget v2, v7, Lh1/w;->c:I

    .line 204
    .line 205
    :goto_5
    if-ge v1, v2, :cond_d

    .line 206
    .line 207
    iget-object v6, v7, Lh1/w;->a:[B

    .line 208
    .line 209
    aget-byte v6, v6, v1

    .line 210
    .line 211
    if-eq v6, v8, :cond_b

    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_b
    invoke-static {v7, v1, v5}, Lt2/i0;->y(Lh1/w;II)J

    .line 215
    .line 216
    .line 217
    move-result-wide v12

    .line 218
    cmp-long v6, v12, v9

    .line 219
    .line 220
    if-eqz v6, :cond_c

    .line 221
    .line 222
    move-wide v9, v12

    .line 223
    goto :goto_7

    .line 224
    :cond_c
    :goto_6
    add-int/lit8 v1, v1, 0x1

    .line 225
    .line 226
    goto :goto_5

    .line 227
    :cond_d
    :goto_7
    iput-wide v9, v11, Lt2/z;->g:J

    .line 228
    .line 229
    iput-boolean v3, v11, Lt2/z;->e:Z

    .line 230
    .line 231
    return v4

    .line 232
    :cond_e
    iget-wide v2, v11, Lt2/z;->g:J

    .line 233
    .line 234
    cmp-long v5, v2, v9

    .line 235
    .line 236
    if-nez v5, :cond_f

    .line 237
    .line 238
    invoke-virtual {v11, v1}, Lt2/z;->a(Ln1/o;)V

    .line 239
    .line 240
    .line 241
    return v4

    .line 242
    :cond_f
    invoke-virtual {v6, v2, v3}, Lh1/d0;->b(J)J

    .line 243
    .line 244
    .line 245
    move-result-wide v2

    .line 246
    iget-wide v7, v11, Lt2/z;->h:J

    .line 247
    .line 248
    invoke-virtual {v6, v7, v8}, Lh1/d0;->c(J)J

    .line 249
    .line 250
    .line 251
    move-result-wide v5

    .line 252
    sub-long/2addr v5, v2

    .line 253
    iput-wide v5, v11, Lt2/z;->i:J

    .line 254
    .line 255
    invoke-virtual {v11, v1}, Lt2/z;->a(Ln1/o;)V

    .line 256
    .line 257
    .line 258
    return v4

    .line 259
    :cond_10
    iget-boolean v7, v0, Lt2/e0;->p:Z

    .line 260
    .line 261
    if-nez v7, :cond_12

    .line 262
    .line 263
    iput-boolean v3, v0, Lt2/e0;->p:Z

    .line 264
    .line 265
    move v14, v6

    .line 266
    iget-wide v6, v11, Lt2/z;->i:J

    .line 267
    .line 268
    cmp-long v9, v6, v9

    .line 269
    .line 270
    if-eqz v9, :cond_11

    .line 271
    .line 272
    move v9, v3

    .line 273
    new-instance v3, Ls1/b;

    .line 274
    .line 275
    iget-object v10, v11, Lt2/z;->b:Lh1/d0;

    .line 276
    .line 277
    iget v11, v0, Lt2/e0;->t:I

    .line 278
    .line 279
    move v15, v4

    .line 280
    new-instance v4, Lk2/b;

    .line 281
    .line 282
    const/4 v8, 0x6

    .line 283
    invoke-direct {v4, v8}, Lk2/b;-><init>(I)V

    .line 284
    .line 285
    .line 286
    move v8, v5

    .line 287
    new-instance v5, La4/o;

    .line 288
    .line 289
    invoke-direct {v5, v11, v10}, La4/o;-><init>(ILh1/d0;)V

    .line 290
    .line 291
    .line 292
    const-wide/16 v10, 0x1

    .line 293
    .line 294
    add-long/2addr v10, v6

    .line 295
    move/from16 v21, v14

    .line 296
    .line 297
    move/from16 v20, v15

    .line 298
    .line 299
    const-wide/16 v14, 0xbc

    .line 300
    .line 301
    const/16 v22, 0x47

    .line 302
    .line 303
    const/16 v16, 0x3ac

    .line 304
    .line 305
    move/from16 v24, v8

    .line 306
    .line 307
    move/from16 v23, v9

    .line 308
    .line 309
    move-wide v8, v10

    .line 310
    const-wide/16 v10, 0x0

    .line 311
    .line 312
    move/from16 v1, v20

    .line 313
    .line 314
    move/from16 v25, v24

    .line 315
    .line 316
    invoke-direct/range {v3 .. v16}, Ls1/b;-><init>(Ln1/g;Ln1/i;JJJJJI)V

    .line 317
    .line 318
    .line 319
    iput-object v3, v0, Lt2/e0;->l:Ls1/b;

    .line 320
    .line 321
    iget-object v4, v0, Lt2/e0;->m:Ln1/p;

    .line 322
    .line 323
    iget-object v3, v3, Ls1/b;->a:Ln1/e;

    .line 324
    .line 325
    invoke-interface {v4, v3}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 326
    .line 327
    .line 328
    goto :goto_8

    .line 329
    :cond_11
    move/from16 v23, v3

    .line 330
    .line 331
    move v1, v4

    .line 332
    move/from16 v25, v5

    .line 333
    .line 334
    iget-object v3, v0, Lt2/e0;->m:Ln1/p;

    .line 335
    .line 336
    new-instance v4, Ln1/s;

    .line 337
    .line 338
    invoke-direct {v4, v6, v7}, Ln1/s;-><init>(J)V

    .line 339
    .line 340
    .line 341
    invoke-interface {v3, v4}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 342
    .line 343
    .line 344
    goto :goto_8

    .line 345
    :cond_12
    move/from16 v23, v3

    .line 346
    .line 347
    move v1, v4

    .line 348
    move/from16 v25, v5

    .line 349
    .line 350
    :goto_8
    iget-boolean v3, v0, Lt2/e0;->q:Z

    .line 351
    .line 352
    if-eqz v3, :cond_13

    .line 353
    .line 354
    iput-boolean v1, v0, Lt2/e0;->q:Z

    .line 355
    .line 356
    const-wide/16 v3, 0x0

    .line 357
    .line 358
    invoke-virtual {v0, v3, v4, v3, v4}, Lt2/e0;->seek(JJ)V

    .line 359
    .line 360
    .line 361
    invoke-interface/range {p1 .. p1}, Ln1/o;->getPosition()J

    .line 362
    .line 363
    .line 364
    move-result-wide v5

    .line 365
    cmp-long v5, v5, v3

    .line 366
    .line 367
    if-eqz v5, :cond_13

    .line 368
    .line 369
    iput-wide v3, v2, Ln1/a0;->a:J

    .line 370
    .line 371
    return v23

    .line 372
    :cond_13
    iget-object v3, v0, Lt2/e0;->l:Ls1/b;

    .line 373
    .line 374
    if-eqz v3, :cond_14

    .line 375
    .line 376
    iget-object v4, v3, Ls1/b;->c:Ln1/f;

    .line 377
    .line 378
    if-eqz v4, :cond_14

    .line 379
    .line 380
    move-object/from16 v4, p1

    .line 381
    .line 382
    invoke-virtual {v3, v4, v2}, Ls1/b;->b(Ln1/o;Ln1/a0;)I

    .line 383
    .line 384
    .line 385
    move-result v1

    .line 386
    return v1

    .line 387
    :cond_14
    move-object/from16 v4, p1

    .line 388
    .line 389
    goto :goto_9

    .line 390
    :cond_15
    move/from16 v23, v4

    .line 391
    .line 392
    move-object v4, v1

    .line 393
    move/from16 v1, v23

    .line 394
    .line 395
    move/from16 v23, v3

    .line 396
    .line 397
    move/from16 v25, v5

    .line 398
    .line 399
    :goto_9
    iget-object v2, v0, Lt2/e0;->d:Lh1/w;

    .line 400
    .line 401
    iget-object v3, v2, Lh1/w;->a:[B

    .line 402
    .line 403
    iget v5, v2, Lh1/w;->b:I

    .line 404
    .line 405
    rsub-int v5, v5, 0x24b8

    .line 406
    .line 407
    const/16 v6, 0xbc

    .line 408
    .line 409
    if-ge v5, v6, :cond_17

    .line 410
    .line 411
    invoke-virtual {v2}, Lh1/w;->a()I

    .line 412
    .line 413
    .line 414
    move-result v5

    .line 415
    if-lez v5, :cond_16

    .line 416
    .line 417
    iget v7, v2, Lh1/w;->b:I

    .line 418
    .line 419
    invoke-static {v3, v7, v3, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 420
    .line 421
    .line 422
    :cond_16
    invoke-virtual {v2, v3, v5}, Lh1/w;->E([BI)V

    .line 423
    .line 424
    .line 425
    :cond_17
    :goto_a
    invoke-virtual {v2}, Lh1/w;->a()I

    .line 426
    .line 427
    .line 428
    move-result v5

    .line 429
    iget-object v7, v0, Lt2/e0;->h:Landroid/util/SparseArray;

    .line 430
    .line 431
    if-ge v5, v6, :cond_1c

    .line 432
    .line 433
    iget v5, v2, Lh1/w;->c:I

    .line 434
    .line 435
    rsub-int v8, v5, 0x24b8

    .line 436
    .line 437
    invoke-interface {v4, v3, v5, v8}, Landroidx/media3/common/m;->read([BII)I

    .line 438
    .line 439
    .line 440
    move-result v8

    .line 441
    const/4 v9, -0x1

    .line 442
    if-ne v8, v9, :cond_1b

    .line 443
    .line 444
    move v4, v1

    .line 445
    :goto_b
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    .line 446
    .line 447
    .line 448
    move-result v1

    .line 449
    if-ge v4, v1, :cond_1a

    .line 450
    .line 451
    invoke-virtual {v7, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    check-cast v1, Lt2/h0;

    .line 456
    .line 457
    instance-of v2, v1, Lt2/y;

    .line 458
    .line 459
    if-eqz v2, :cond_19

    .line 460
    .line 461
    check-cast v1, Lt2/y;

    .line 462
    .line 463
    iget v2, v1, Lt2/y;->c:I

    .line 464
    .line 465
    const/4 v3, 0x3

    .line 466
    if-ne v2, v3, :cond_19

    .line 467
    .line 468
    iget v2, v1, Lt2/y;->j:I

    .line 469
    .line 470
    if-ne v2, v9, :cond_19

    .line 471
    .line 472
    if-eqz v17, :cond_18

    .line 473
    .line 474
    iget-object v2, v1, Lt2/y;->a:Lt2/h;

    .line 475
    .line 476
    instance-of v2, v2, Lt2/j;

    .line 477
    .line 478
    if-nez v2, :cond_19

    .line 479
    .line 480
    :cond_18
    new-instance v2, Lh1/w;

    .line 481
    .line 482
    invoke-direct {v2}, Lh1/w;-><init>()V

    .line 483
    .line 484
    .line 485
    move/from16 v3, v23

    .line 486
    .line 487
    invoke-virtual {v1, v2, v3}, Lt2/y;->a(Lh1/w;I)V

    .line 488
    .line 489
    .line 490
    :cond_19
    add-int/lit8 v4, v4, 0x1

    .line 491
    .line 492
    const/16 v23, 0x1

    .line 493
    .line 494
    goto :goto_b

    .line 495
    :cond_1a
    return v9

    .line 496
    :cond_1b
    add-int/2addr v5, v8

    .line 497
    invoke-virtual {v2, v5}, Lh1/w;->F(I)V

    .line 498
    .line 499
    .line 500
    const/16 v23, 0x1

    .line 501
    .line 502
    goto :goto_a

    .line 503
    :cond_1c
    iget v3, v2, Lh1/w;->b:I

    .line 504
    .line 505
    iget v4, v2, Lh1/w;->c:I

    .line 506
    .line 507
    iget-object v5, v2, Lh1/w;->a:[B

    .line 508
    .line 509
    move v6, v3

    .line 510
    :goto_c
    if-ge v6, v4, :cond_1d

    .line 511
    .line 512
    aget-byte v8, v5, v6

    .line 513
    .line 514
    const/16 v9, 0x47

    .line 515
    .line 516
    if-eq v8, v9, :cond_1d

    .line 517
    .line 518
    add-int/lit8 v6, v6, 0x1

    .line 519
    .line 520
    goto :goto_c

    .line 521
    :cond_1d
    invoke-virtual {v2, v6}, Lh1/w;->G(I)V

    .line 522
    .line 523
    .line 524
    add-int/lit16 v5, v6, 0xbc

    .line 525
    .line 526
    const/4 v8, 0x0

    .line 527
    if-le v5, v4, :cond_1f

    .line 528
    .line 529
    iget v4, v0, Lt2/e0;->s:I

    .line 530
    .line 531
    sub-int/2addr v6, v3

    .line 532
    add-int/2addr v6, v4

    .line 533
    iput v6, v0, Lt2/e0;->s:I

    .line 534
    .line 535
    move/from16 v3, v25

    .line 536
    .line 537
    const/4 v14, 0x2

    .line 538
    if-ne v3, v14, :cond_20

    .line 539
    .line 540
    const/16 v4, 0x178

    .line 541
    .line 542
    if-gt v6, v4, :cond_1e

    .line 543
    .line 544
    goto :goto_d

    .line 545
    :cond_1e
    const-string v1, "Cannot find sync byte. Most likely not a Transport Stream."

    .line 546
    .line 547
    invoke-static {v1, v8}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    throw v1

    .line 552
    :cond_1f
    move/from16 v3, v25

    .line 553
    .line 554
    const/4 v14, 0x2

    .line 555
    iput v1, v0, Lt2/e0;->s:I

    .line 556
    .line 557
    :cond_20
    :goto_d
    iget v4, v2, Lh1/w;->c:I

    .line 558
    .line 559
    if-le v5, v4, :cond_21

    .line 560
    .line 561
    return v1

    .line 562
    :cond_21
    invoke-virtual {v2}, Lh1/w;->g()I

    .line 563
    .line 564
    .line 565
    move-result v6

    .line 566
    const/high16 v9, 0x800000

    .line 567
    .line 568
    and-int/2addr v9, v6

    .line 569
    if-eqz v9, :cond_22

    .line 570
    .line 571
    invoke-virtual {v2, v5}, Lh1/w;->G(I)V

    .line 572
    .line 573
    .line 574
    return v1

    .line 575
    :cond_22
    const/high16 v9, 0x400000

    .line 576
    .line 577
    and-int/2addr v9, v6

    .line 578
    if-eqz v9, :cond_23

    .line 579
    .line 580
    const/4 v9, 0x1

    .line 581
    goto :goto_e

    .line 582
    :cond_23
    move v9, v1

    .line 583
    :goto_e
    const v10, 0x1fff00

    .line 584
    .line 585
    .line 586
    and-int/2addr v10, v6

    .line 587
    shr-int/lit8 v10, v10, 0x8

    .line 588
    .line 589
    and-int/lit8 v11, v6, 0x20

    .line 590
    .line 591
    if-eqz v11, :cond_24

    .line 592
    .line 593
    const/4 v11, 0x1

    .line 594
    goto :goto_f

    .line 595
    :cond_24
    move v11, v1

    .line 596
    :goto_f
    and-int/lit8 v15, v6, 0x10

    .line 597
    .line 598
    if-eqz v15, :cond_25

    .line 599
    .line 600
    invoke-virtual {v7, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v7

    .line 604
    move-object v8, v7

    .line 605
    check-cast v8, Lt2/h0;

    .line 606
    .line 607
    :cond_25
    if-nez v8, :cond_26

    .line 608
    .line 609
    invoke-virtual {v2, v5}, Lh1/w;->G(I)V

    .line 610
    .line 611
    .line 612
    return v1

    .line 613
    :cond_26
    if-eq v3, v14, :cond_28

    .line 614
    .line 615
    and-int/lit8 v6, v6, 0xf

    .line 616
    .line 617
    add-int/lit8 v7, v6, -0x1

    .line 618
    .line 619
    iget-object v15, v0, Lt2/e0;->e:Landroid/util/SparseIntArray;

    .line 620
    .line 621
    invoke-virtual {v15, v10, v7}, Landroid/util/SparseIntArray;->get(II)I

    .line 622
    .line 623
    .line 624
    move-result v7

    .line 625
    invoke-virtual {v15, v10, v6}, Landroid/util/SparseIntArray;->put(II)V

    .line 626
    .line 627
    .line 628
    if-ne v7, v6, :cond_27

    .line 629
    .line 630
    invoke-virtual {v2, v5}, Lh1/w;->G(I)V

    .line 631
    .line 632
    .line 633
    return v1

    .line 634
    :cond_27
    const/16 v23, 0x1

    .line 635
    .line 636
    add-int/lit8 v7, v7, 0x1

    .line 637
    .line 638
    and-int/lit8 v7, v7, 0xf

    .line 639
    .line 640
    if-eq v6, v7, :cond_28

    .line 641
    .line 642
    invoke-interface {v8}, Lt2/h0;->c()V

    .line 643
    .line 644
    .line 645
    :cond_28
    if-eqz v11, :cond_2a

    .line 646
    .line 647
    invoke-virtual {v2}, Lh1/w;->u()I

    .line 648
    .line 649
    .line 650
    move-result v6

    .line 651
    invoke-virtual {v2}, Lh1/w;->u()I

    .line 652
    .line 653
    .line 654
    move-result v7

    .line 655
    and-int/lit8 v7, v7, 0x40

    .line 656
    .line 657
    if-eqz v7, :cond_29

    .line 658
    .line 659
    move v7, v14

    .line 660
    goto :goto_10

    .line 661
    :cond_29
    move v7, v1

    .line 662
    :goto_10
    or-int/2addr v9, v7

    .line 663
    const/16 v23, 0x1

    .line 664
    .line 665
    add-int/lit8 v6, v6, -0x1

    .line 666
    .line 667
    invoke-virtual {v2, v6}, Lh1/w;->H(I)V

    .line 668
    .line 669
    .line 670
    :cond_2a
    iget-boolean v6, v0, Lt2/e0;->o:Z

    .line 671
    .line 672
    if-eq v3, v14, :cond_2b

    .line 673
    .line 674
    if-nez v6, :cond_2b

    .line 675
    .line 676
    iget-object v7, v0, Lt2/e0;->j:Landroid/util/SparseBooleanArray;

    .line 677
    .line 678
    invoke-virtual {v7, v10, v1}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    .line 679
    .line 680
    .line 681
    move-result v7

    .line 682
    if-nez v7, :cond_2c

    .line 683
    .line 684
    :cond_2b
    invoke-virtual {v2, v5}, Lh1/w;->F(I)V

    .line 685
    .line 686
    .line 687
    invoke-interface {v8, v2, v9}, Lt2/h0;->a(Lh1/w;I)V

    .line 688
    .line 689
    .line 690
    invoke-virtual {v2, v4}, Lh1/w;->F(I)V

    .line 691
    .line 692
    .line 693
    :cond_2c
    if-eq v3, v14, :cond_2d

    .line 694
    .line 695
    if-nez v6, :cond_2d

    .line 696
    .line 697
    iget-boolean v3, v0, Lt2/e0;->o:Z

    .line 698
    .line 699
    if-eqz v3, :cond_2d

    .line 700
    .line 701
    cmp-long v3, v12, v18

    .line 702
    .line 703
    if-eqz v3, :cond_2d

    .line 704
    .line 705
    const/4 v3, 0x1

    .line 706
    iput-boolean v3, v0, Lt2/e0;->q:Z

    .line 707
    .line 708
    :cond_2d
    invoke-virtual {v2, v5}, Lh1/w;->G(I)V

    .line 709
    .line 710
    .line 711
    return v1
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method

.method public final seek(JJ)V
    .locals 11

    .line 1
    iget-object p1, p0, Lt2/e0;->h:Landroid/util/SparseArray;

    .line 2
    .line 3
    iget-object p2, p0, Lt2/e0;->c:Ljava/util/List;

    .line 4
    .line 5
    iget v0, p0, Lt2/e0;->a:I

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    move v0, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v0, v3

    .line 15
    :goto_0
    invoke-static {v0}, Lh1/a;->j(Z)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    move v1, v3

    .line 23
    :goto_1
    const-wide/16 v4, 0x0

    .line 24
    .line 25
    if-ge v1, v0, :cond_5

    .line 26
    .line 27
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    check-cast v6, Lh1/d0;

    .line 32
    .line 33
    monitor-enter v6

    .line 34
    :try_start_0
    iget-wide v7, v6, Lh1/d0;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    monitor-exit v6

    .line 37
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    cmp-long v7, v7, v9

    .line 43
    .line 44
    if-nez v7, :cond_1

    .line 45
    .line 46
    move v7, v2

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    move v7, v3

    .line 49
    :goto_2
    if-nez v7, :cond_3

    .line 50
    .line 51
    invoke-virtual {v6}, Lh1/d0;->d()J

    .line 52
    .line 53
    .line 54
    move-result-wide v7

    .line 55
    cmp-long v9, v7, v9

    .line 56
    .line 57
    if-eqz v9, :cond_2

    .line 58
    .line 59
    cmp-long v4, v7, v4

    .line 60
    .line 61
    if-eqz v4, :cond_2

    .line 62
    .line 63
    cmp-long v4, v7, p3

    .line 64
    .line 65
    if-eqz v4, :cond_2

    .line 66
    .line 67
    move v7, v2

    .line 68
    goto :goto_3

    .line 69
    :cond_2
    move v7, v3

    .line 70
    :cond_3
    :goto_3
    if-eqz v7, :cond_4

    .line 71
    .line 72
    invoke-virtual {v6, p3, p4}, Lh1/d0;->f(J)V

    .line 73
    .line 74
    .line 75
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catchall_0
    move-exception p1

    .line 79
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    throw p1

    .line 81
    :cond_5
    cmp-long p2, p3, v4

    .line 82
    .line 83
    if-eqz p2, :cond_6

    .line 84
    .line 85
    iget-object p2, p0, Lt2/e0;->l:Ls1/b;

    .line 86
    .line 87
    if-eqz p2, :cond_6

    .line 88
    .line 89
    invoke-virtual {p2, p3, p4}, Ls1/b;->d(J)V

    .line 90
    .line 91
    .line 92
    :cond_6
    iget-object p2, p0, Lt2/e0;->d:Lh1/w;

    .line 93
    .line 94
    invoke-virtual {p2, v3}, Lh1/w;->D(I)V

    .line 95
    .line 96
    .line 97
    iget-object p2, p0, Lt2/e0;->e:Landroid/util/SparseIntArray;

    .line 98
    .line 99
    invoke-virtual {p2}, Landroid/util/SparseIntArray;->clear()V

    .line 100
    .line 101
    .line 102
    move p2, v3

    .line 103
    :goto_4
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 104
    .line 105
    .line 106
    move-result p3

    .line 107
    if-ge p2, p3, :cond_7

    .line 108
    .line 109
    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    check-cast p3, Lt2/h0;

    .line 114
    .line 115
    invoke-interface {p3}, Lt2/h0;->c()V

    .line 116
    .line 117
    .line 118
    add-int/lit8 p2, p2, 0x1

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_7
    iput v3, p0, Lt2/e0;->s:I

    .line 122
    .line 123
    return-void
.end method

.method public final sniff(Ln1/o;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lt2/e0;->d:Lh1/w;

    .line 2
    .line 3
    iget-object v0, v0, Lh1/w;->a:[B

    .line 4
    .line 5
    const/16 v1, 0x3ac

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-interface {p1, v0, v2, v1}, Ln1/o;->i([BII)V

    .line 9
    .line 10
    .line 11
    move v1, v2

    .line 12
    :goto_0
    const/16 v3, 0xbc

    .line 13
    .line 14
    if-ge v1, v3, :cond_2

    .line 15
    .line 16
    move v3, v2

    .line 17
    :goto_1
    const/4 v4, 0x5

    .line 18
    if-ge v3, v4, :cond_1

    .line 19
    .line 20
    mul-int/lit16 v4, v3, 0xbc

    .line 21
    .line 22
    add-int/2addr v4, v1

    .line 23
    aget-byte v4, v0, v4

    .line 24
    .line 25
    const/16 v5, 0x47

    .line 26
    .line 27
    if-eq v4, v5, :cond_0

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-interface {p1, v1}, Ln1/o;->h(I)V

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    return p1

    .line 40
    :cond_2
    return v2
.end method
