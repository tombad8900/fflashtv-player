.class public final Lh2/m;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/n;
.implements Ln1/c0;


# instance fields
.field public A:[Lh2/l;

.field public B:[[J

.field public C:I

.field public D:J

.field public E:I

.field public F:Lc2/a;

.field public final a:Lk2/o;

.field public final b:I

.field public final c:Lh1/w;

.field public final d:Lh1/w;

.field public final e:Lh1/w;

.field public final f:Lh1/w;

.field public final g:Ljava/util/ArrayDeque;

.field public final h:Lh2/o;

.field public final i:Ljava/util/ArrayList;

.field public j:Lf6/l1;

.field public k:I

.field public l:I

.field public m:J

.field public n:I

.field public o:Lh1/w;

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:J

.field public x:Z

.field public y:J

.field public z:Ln1/p;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(ILk2/o;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lh2/m;->a:Lk2/o;

    .line 5
    .line 6
    iput p1, p0, Lh2/m;->b:I

    .line 7
    .line 8
    sget-object p2, Lf6/m0;->k:Lf6/k0;

    .line 9
    .line 10
    sget-object p2, Lf6/l1;->n:Lf6/l1;

    .line 11
    .line 12
    iput-object p2, p0, Lh2/m;->j:Lf6/l1;

    .line 13
    .line 14
    and-int/lit8 p2, p1, 0x4

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    const/4 p2, 0x3

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move p2, v0

    .line 22
    :goto_0
    iput p2, p0, Lh2/m;->k:I

    .line 23
    .line 24
    new-instance p2, Lh2/o;

    .line 25
    .line 26
    invoke-direct {p2}, Lh2/o;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p2, p0, Lh2/m;->h:Lh2/o;

    .line 30
    .line 31
    new-instance p2, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p2, p0, Lh2/m;->i:Ljava/util/ArrayList;

    .line 37
    .line 38
    new-instance p2, Lh1/w;

    .line 39
    .line 40
    const/16 v1, 0x10

    .line 41
    .line 42
    invoke-direct {p2, v1}, Lh1/w;-><init>(I)V

    .line 43
    .line 44
    .line 45
    iput-object p2, p0, Lh2/m;->f:Lh1/w;

    .line 46
    .line 47
    new-instance p2, Ljava/util/ArrayDeque;

    .line 48
    .line 49
    invoke-direct {p2}, Ljava/util/ArrayDeque;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p2, p0, Lh2/m;->g:Ljava/util/ArrayDeque;

    .line 53
    .line 54
    new-instance p2, Lh1/w;

    .line 55
    .line 56
    sget-object v1, Li1/p;->a:[B

    .line 57
    .line 58
    invoke-direct {p2, v1}, Lh1/w;-><init>([B)V

    .line 59
    .line 60
    .line 61
    iput-object p2, p0, Lh2/m;->c:Lh1/w;

    .line 62
    .line 63
    new-instance p2, Lh1/w;

    .line 64
    .line 65
    const/4 v1, 0x5

    .line 66
    invoke-direct {p2, v1}, Lh1/w;-><init>(I)V

    .line 67
    .line 68
    .line 69
    iput-object p2, p0, Lh2/m;->d:Lh1/w;

    .line 70
    .line 71
    new-instance p2, Lh1/w;

    .line 72
    .line 73
    invoke-direct {p2}, Lh1/w;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object p2, p0, Lh2/m;->e:Lh1/w;

    .line 77
    .line 78
    const/4 p2, -0x1

    .line 79
    iput p2, p0, Lh2/m;->p:I

    .line 80
    .line 81
    sget-object p2, Ln1/p;->i:Lk2/b;

    .line 82
    .line 83
    iput-object p2, p0, Lh2/m;->z:Ln1/p;

    .line 84
    .line 85
    new-array p2, v0, [Lh2/l;

    .line 86
    .line 87
    iput-object p2, p0, Lh2/m;->A:[Lh2/l;

    .line 88
    .line 89
    and-int/lit8 p1, p1, 0x20

    .line 90
    .line 91
    if-nez p1, :cond_1

    .line 92
    .line 93
    const/4 v0, 0x1

    .line 94
    :cond_1
    iput-boolean v0, p0, Lh2/m;->t:Z

    .line 95
    .line 96
    return-void
.end method


# virtual methods
.method public final c(IJ)Ln1/b0;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    iget-object v4, v0, Lh2/m;->A:[Lh2/l;

    .line 8
    .line 9
    array-length v5, v4

    .line 10
    sget-object v6, Ln1/d0;->c:Ln1/d0;

    .line 11
    .line 12
    if-nez v5, :cond_0

    .line 13
    .line 14
    new-instance v1, Ln1/b0;

    .line 15
    .line 16
    invoke-direct {v1, v6, v6}, Ln1/b0;-><init>(Ln1/d0;Ln1/d0;)V

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_0
    const/4 v5, -0x1

    .line 21
    if-eq v1, v5, :cond_1

    .line 22
    .line 23
    move v7, v1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget v7, v0, Lh2/m;->C:I

    .line 26
    .line 27
    :goto_0
    const/4 v8, 0x0

    .line 28
    const-wide/16 v11, -0x1

    .line 29
    .line 30
    if-eq v7, v5, :cond_7

    .line 31
    .line 32
    aget-object v4, v4, v7

    .line 33
    .line 34
    iget-object v4, v4, Lh2/l;->b:Lh2/t;

    .line 35
    .line 36
    iget-object v7, v4, Lh2/t;->f:[J

    .line 37
    .line 38
    invoke-static {v7, v2, v3, v8}, Lh1/i0;->e([JJZ)I

    .line 39
    .line 40
    .line 41
    move-result v13

    .line 42
    :goto_1
    if-ltz v13, :cond_3

    .line 43
    .line 44
    iget-object v14, v4, Lh2/t;->g:[I

    .line 45
    .line 46
    aget v14, v14, v13

    .line 47
    .line 48
    and-int/lit8 v14, v14, 0x1

    .line 49
    .line 50
    if-eqz v14, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    add-int/lit8 v13, v13, -0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    move v13, v5

    .line 57
    :goto_2
    if-ne v13, v5, :cond_4

    .line 58
    .line 59
    invoke-virtual {v4, v2, v3}, Lh2/t;->a(J)I

    .line 60
    .line 61
    .line 62
    move-result v13

    .line 63
    :cond_4
    iget-object v14, v4, Lh2/t;->c:[J

    .line 64
    .line 65
    if-ne v13, v5, :cond_5

    .line 66
    .line 67
    new-instance v1, Ln1/b0;

    .line 68
    .line 69
    invoke-direct {v1, v6, v6}, Ln1/b0;-><init>(Ln1/d0;Ln1/d0;)V

    .line 70
    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_5
    aget-wide v15, v7, v13

    .line 74
    .line 75
    aget-wide v17, v14, v13

    .line 76
    .line 77
    cmp-long v6, v15, v2

    .line 78
    .line 79
    if-gez v6, :cond_6

    .line 80
    .line 81
    iget v6, v4, Lh2/t;->b:I

    .line 82
    .line 83
    add-int/lit8 v6, v6, -0x1

    .line 84
    .line 85
    if-ge v13, v6, :cond_6

    .line 86
    .line 87
    invoke-virtual {v4, v2, v3}, Lh2/t;->a(J)I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eq v2, v5, :cond_6

    .line 92
    .line 93
    if-eq v2, v13, :cond_6

    .line 94
    .line 95
    aget-wide v3, v7, v2

    .line 96
    .line 97
    aget-wide v11, v14, v2

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_6
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    :goto_3
    move-wide v6, v3

    .line 106
    move-wide v2, v15

    .line 107
    goto :goto_4

    .line 108
    :cond_7
    const-wide v17, 0x7fffffffffffffffL

    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    :goto_4
    if-ne v1, v5, :cond_13

    .line 119
    .line 120
    move v1, v8

    .line 121
    move-wide/from16 v13, v17

    .line 122
    .line 123
    :goto_5
    iget-object v4, v0, Lh2/m;->A:[Lh2/l;

    .line 124
    .line 125
    array-length v15, v4

    .line 126
    if-ge v1, v15, :cond_12

    .line 127
    .line 128
    iget v15, v0, Lh2/m;->C:I

    .line 129
    .line 130
    if-eq v1, v15, :cond_11

    .line 131
    .line 132
    aget-object v4, v4, v1

    .line 133
    .line 134
    iget-object v4, v4, Lh2/l;->b:Lh2/t;

    .line 135
    .line 136
    iget-object v15, v4, Lh2/t;->c:[J

    .line 137
    .line 138
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    iget-object v9, v4, Lh2/t;->g:[I

    .line 144
    .line 145
    iget-object v10, v4, Lh2/t;->f:[J

    .line 146
    .line 147
    invoke-static {v10, v2, v3, v8}, Lh1/i0;->e([JJZ)I

    .line 148
    .line 149
    .line 150
    move-result v16

    .line 151
    :goto_6
    if-ltz v16, :cond_9

    .line 152
    .line 153
    aget v17, v9, v16

    .line 154
    .line 155
    and-int/lit8 v17, v17, 0x1

    .line 156
    .line 157
    if-eqz v17, :cond_8

    .line 158
    .line 159
    move/from16 v8, v16

    .line 160
    .line 161
    goto :goto_7

    .line 162
    :cond_8
    add-int/lit8 v16, v16, -0x1

    .line 163
    .line 164
    goto :goto_6

    .line 165
    :cond_9
    move v8, v5

    .line 166
    :goto_7
    if-ne v8, v5, :cond_a

    .line 167
    .line 168
    invoke-virtual {v4, v2, v3}, Lh2/t;->a(J)I

    .line 169
    .line 170
    .line 171
    move-result v8

    .line 172
    :cond_a
    if-ne v8, v5, :cond_b

    .line 173
    .line 174
    move-wide/from16 p2, v6

    .line 175
    .line 176
    goto :goto_8

    .line 177
    :cond_b
    move-wide/from16 p2, v6

    .line 178
    .line 179
    aget-wide v5, v15, v8

    .line 180
    .line 181
    invoke-static {v5, v6, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 182
    .line 183
    .line 184
    move-result-wide v13

    .line 185
    :goto_8
    cmp-long v5, p2, v19

    .line 186
    .line 187
    if-eqz v5, :cond_10

    .line 188
    .line 189
    move-wide/from16 v5, p2

    .line 190
    .line 191
    const/4 v7, 0x0

    .line 192
    invoke-static {v10, v5, v6, v7}, Lh1/i0;->e([JJZ)I

    .line 193
    .line 194
    .line 195
    move-result v8

    .line 196
    :goto_9
    if-ltz v8, :cond_d

    .line 197
    .line 198
    aget v10, v9, v8

    .line 199
    .line 200
    and-int/lit8 v10, v10, 0x1

    .line 201
    .line 202
    if-eqz v10, :cond_c

    .line 203
    .line 204
    :goto_a
    const/4 v9, -0x1

    .line 205
    goto :goto_b

    .line 206
    :cond_c
    add-int/lit8 v8, v8, -0x1

    .line 207
    .line 208
    goto :goto_9

    .line 209
    :cond_d
    const/4 v8, -0x1

    .line 210
    goto :goto_a

    .line 211
    :goto_b
    if-ne v8, v9, :cond_e

    .line 212
    .line 213
    invoke-virtual {v4, v5, v6}, Lh2/t;->a(J)I

    .line 214
    .line 215
    .line 216
    move-result v8

    .line 217
    :cond_e
    if-ne v8, v9, :cond_f

    .line 218
    .line 219
    goto :goto_c

    .line 220
    :cond_f
    aget-wide v7, v15, v8

    .line 221
    .line 222
    invoke-static {v7, v8, v11, v12}, Ljava/lang/Math;->min(JJ)J

    .line 223
    .line 224
    .line 225
    move-result-wide v11

    .line 226
    goto :goto_c

    .line 227
    :cond_10
    move-wide/from16 v5, p2

    .line 228
    .line 229
    const/4 v9, -0x1

    .line 230
    goto :goto_c

    .line 231
    :cond_11
    move v9, v5

    .line 232
    move-wide v5, v6

    .line 233
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    :goto_c
    add-int/lit8 v1, v1, 0x1

    .line 239
    .line 240
    move-wide v6, v5

    .line 241
    move v5, v9

    .line 242
    const/4 v8, 0x0

    .line 243
    goto :goto_5

    .line 244
    :cond_12
    :goto_d
    move-wide v5, v6

    .line 245
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    goto :goto_e

    .line 251
    :cond_13
    move-wide/from16 v13, v17

    .line 252
    .line 253
    goto :goto_d

    .line 254
    :goto_e
    new-instance v1, Ln1/d0;

    .line 255
    .line 256
    invoke-direct {v1, v2, v3, v13, v14}, Ln1/d0;-><init>(JJ)V

    .line 257
    .line 258
    .line 259
    cmp-long v2, v5, v19

    .line 260
    .line 261
    if-nez v2, :cond_14

    .line 262
    .line 263
    new-instance v2, Ln1/b0;

    .line 264
    .line 265
    invoke-direct {v2, v1, v1}, Ln1/b0;-><init>(Ln1/d0;Ln1/d0;)V

    .line 266
    .line 267
    .line 268
    return-object v2

    .line 269
    :cond_14
    new-instance v2, Ln1/d0;

    .line 270
    .line 271
    invoke-direct {v2, v5, v6, v11, v12}, Ln1/d0;-><init>(JJ)V

    .line 272
    .line 273
    .line 274
    new-instance v3, Ln1/b0;

    .line 275
    .line 276
    invoke-direct {v3, v1, v2}, Ln1/b0;-><init>(Ln1/d0;Ln1/d0;)V

    .line 277
    .line 278
    .line 279
    return-object v3
.end method

.method public final d(J)V
    .locals 38

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    :cond_0
    :goto_0
    iget-object v0, v1, Lh2/m;->g:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v2, :cond_6f

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Li1/b;

    .line 17
    .line 18
    iget-wide v5, v2, Li1/b;->c:J

    .line 19
    .line 20
    cmp-long v2, v5, p1

    .line 21
    .line 22
    if-nez v2, :cond_6f

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    move-object v5, v2

    .line 29
    check-cast v5, Li1/b;

    .line 30
    .line 31
    iget v2, v5, Li1/d;->b:I

    .line 32
    .line 33
    const v6, 0x6d6f6f76

    .line 34
    .line 35
    .line 36
    if-ne v2, v6, :cond_6e

    .line 37
    .line 38
    const v2, 0x6d657461

    .line 39
    .line 40
    .line 41
    invoke-virtual {v5, v2}, Li1/b;->g(I)Li1/b;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    new-instance v7, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    const/4 v13, 0x1

    .line 51
    const v8, 0x68646c72    # 4.3148E24f

    .line 52
    .line 53
    .line 54
    const/4 v9, 0x4

    .line 55
    const/16 v10, 0x10

    .line 56
    .line 57
    const v11, 0x64617461

    .line 58
    .line 59
    .line 60
    const/16 v12, 0xc

    .line 61
    .line 62
    const v15, 0x696c7374

    .line 63
    .line 64
    .line 65
    const-wide/16 v16, 0x0

    .line 66
    .line 67
    move-object/from16 v18, v7

    .line 68
    .line 69
    iget v7, v1, Lh2/m;->b:I

    .line 70
    .line 71
    const/16 v2, 0x8

    .line 72
    .line 73
    move/from16 v20, v7

    .line 74
    .line 75
    if-eqz v6, :cond_13

    .line 76
    .line 77
    sget-object v21, Lh2/d;->a:[B

    .line 78
    .line 79
    invoke-virtual {v6, v8}, Li1/b;->h(I)Li1/c;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    const v8, 0x6b657973

    .line 84
    .line 85
    .line 86
    invoke-virtual {v6, v8}, Li1/b;->h(I)Li1/c;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-virtual {v6, v15}, Li1/b;->h(I)Li1/c;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    if-eqz v7, :cond_8

    .line 95
    .line 96
    if-eqz v8, :cond_8

    .line 97
    .line 98
    if-eqz v6, :cond_8

    .line 99
    .line 100
    iget-object v7, v7, Li1/c;->c:Lh1/w;

    .line 101
    .line 102
    invoke-virtual {v7, v10}, Lh1/w;->G(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v7}, Lh1/w;->g()I

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    const v10, 0x6d647461

    .line 110
    .line 111
    .line 112
    if-eq v7, v10, :cond_1

    .line 113
    .line 114
    goto/16 :goto_6

    .line 115
    .line 116
    :cond_1
    iget-object v7, v8, Li1/c;->c:Lh1/w;

    .line 117
    .line 118
    invoke-virtual {v7, v12}, Lh1/w;->G(I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v7}, Lh1/w;->g()I

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    new-array v10, v8, [Ljava/lang/String;

    .line 126
    .line 127
    move v12, v3

    .line 128
    :goto_1
    if-ge v12, v8, :cond_2

    .line 129
    .line 130
    invoke-virtual {v7}, Lh1/w;->g()I

    .line 131
    .line 132
    .line 133
    move-result v25

    .line 134
    invoke-virtual {v7, v9}, Lh1/w;->H(I)V

    .line 135
    .line 136
    .line 137
    add-int/lit8 v15, v25, -0x8

    .line 138
    .line 139
    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 140
    .line 141
    invoke-virtual {v7, v15, v9}, Lh1/w;->s(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    aput-object v9, v10, v12

    .line 146
    .line 147
    add-int/lit8 v12, v12, 0x1

    .line 148
    .line 149
    const/4 v9, 0x4

    .line 150
    const v15, 0x696c7374

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_2
    iget-object v6, v6, Li1/c;->c:Lh1/w;

    .line 155
    .line 156
    invoke-virtual {v6, v2}, Lh1/w;->G(I)V

    .line 157
    .line 158
    .line 159
    new-instance v7, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 162
    .line 163
    .line 164
    :goto_2
    invoke-virtual {v6}, Lh1/w;->a()I

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    if-le v9, v2, :cond_7

    .line 169
    .line 170
    iget v9, v6, Lh1/w;->b:I

    .line 171
    .line 172
    invoke-virtual {v6}, Lh1/w;->g()I

    .line 173
    .line 174
    .line 175
    move-result v12

    .line 176
    invoke-virtual {v6}, Lh1/w;->g()I

    .line 177
    .line 178
    .line 179
    move-result v15

    .line 180
    sub-int/2addr v15, v13

    .line 181
    if-ltz v15, :cond_5

    .line 182
    .line 183
    if-ge v15, v8, :cond_5

    .line 184
    .line 185
    aget-object v15, v10, v15

    .line 186
    .line 187
    add-int v2, v9, v12

    .line 188
    .line 189
    :goto_3
    iget v14, v6, Lh1/w;->b:I

    .line 190
    .line 191
    if-ge v14, v2, :cond_4

    .line 192
    .line 193
    invoke-virtual {v6}, Lh1/w;->g()I

    .line 194
    .line 195
    .line 196
    move-result v27

    .line 197
    invoke-virtual {v6}, Lh1/w;->g()I

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    if-ne v4, v11, :cond_3

    .line 202
    .line 203
    invoke-virtual {v6}, Lh1/w;->g()I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    invoke-virtual {v6}, Lh1/w;->g()I

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    add-int/lit8 v14, v27, -0x10

    .line 212
    .line 213
    new-array v11, v14, [B

    .line 214
    .line 215
    invoke-virtual {v6, v11, v3, v14}, Lh1/w;->e([BII)V

    .line 216
    .line 217
    .line 218
    new-instance v14, Li1/a;

    .line 219
    .line 220
    invoke-direct {v14, v15, v11, v4, v2}, Li1/a;-><init>(Ljava/lang/String;[BII)V

    .line 221
    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_3
    add-int v14, v14, v27

    .line 225
    .line 226
    invoke-virtual {v6, v14}, Lh1/w;->G(I)V

    .line 227
    .line 228
    .line 229
    const v11, 0x64617461

    .line 230
    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_4
    const/4 v14, 0x0

    .line 234
    :goto_4
    if-eqz v14, :cond_6

    .line 235
    .line 236
    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_5
    const-string v2, "BoxParsers"

    .line 241
    .line 242
    const-string v4, "Skipped metadata with unknown key index: "

    .line 243
    .line 244
    invoke-static {v4, v15, v2}, La1/a1;->s(Ljava/lang/String;ILjava/lang/String;)V

    .line 245
    .line 246
    .line 247
    :cond_6
    :goto_5
    add-int/2addr v9, v12

    .line 248
    invoke-virtual {v6, v9}, Lh1/w;->G(I)V

    .line 249
    .line 250
    .line 251
    const/16 v2, 0x8

    .line 252
    .line 253
    const v11, 0x64617461

    .line 254
    .line 255
    .line 256
    goto :goto_2

    .line 257
    :cond_7
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    if-eqz v2, :cond_9

    .line 262
    .line 263
    :cond_8
    :goto_6
    const/4 v2, 0x0

    .line 264
    goto :goto_7

    .line 265
    :cond_9
    new-instance v2, Landroidx/media3/common/t0;

    .line 266
    .line 267
    invoke-direct {v2, v7}, Landroidx/media3/common/t0;-><init>(Ljava/util/List;)V

    .line 268
    .line 269
    .line 270
    :goto_7
    iget-boolean v4, v1, Lh2/m;->x:Z

    .line 271
    .line 272
    if-eqz v4, :cond_10

    .line 273
    .line 274
    invoke-static {v2}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    const-string v4, "editable.tracks.samples.location"

    .line 278
    .line 279
    invoke-static {v2, v4}, Lh2/p;->b(Landroidx/media3/common/t0;Ljava/lang/String;)Li1/a;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    if-eqz v4, :cond_a

    .line 284
    .line 285
    iget-object v4, v4, Li1/a;->k:[B

    .line 286
    .line 287
    aget-byte v4, v4, v3

    .line 288
    .line 289
    if-nez v4, :cond_a

    .line 290
    .line 291
    iget-wide v6, v1, Lh2/m;->w:J

    .line 292
    .line 293
    const-wide/16 v8, 0x10

    .line 294
    .line 295
    add-long/2addr v6, v8

    .line 296
    iput-wide v6, v1, Lh2/m;->y:J

    .line 297
    .line 298
    :cond_a
    const-string v4, "editable.tracks.map"

    .line 299
    .line 300
    invoke-static {v2, v4}, Lh2/p;->b(Landroidx/media3/common/t0;Ljava/lang/String;)Li1/a;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    invoke-static {v4}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v4}, Li1/a;->a()Ljava/util/ArrayList;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    new-instance v7, Ljava/util/ArrayList;

    .line 312
    .line 313
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 314
    .line 315
    .line 316
    move-result v6

    .line 317
    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 318
    .line 319
    .line 320
    move v6, v3

    .line 321
    :goto_8
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 322
    .line 323
    .line 324
    move-result v8

    .line 325
    if-ge v6, v8, :cond_f

    .line 326
    .line 327
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v8

    .line 331
    check-cast v8, Ljava/lang/Integer;

    .line 332
    .line 333
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 334
    .line 335
    .line 336
    move-result v8

    .line 337
    if-eqz v8, :cond_e

    .line 338
    .line 339
    if-eq v8, v13, :cond_d

    .line 340
    .line 341
    const/4 v9, 0x2

    .line 342
    if-eq v8, v9, :cond_c

    .line 343
    .line 344
    const/4 v9, 0x3

    .line 345
    if-eq v8, v9, :cond_b

    .line 346
    .line 347
    move v8, v3

    .line 348
    goto :goto_9

    .line 349
    :cond_b
    const/4 v8, 0x4

    .line 350
    goto :goto_9

    .line 351
    :cond_c
    const/4 v8, 0x3

    .line 352
    goto :goto_9

    .line 353
    :cond_d
    const/4 v8, 0x2

    .line 354
    goto :goto_9

    .line 355
    :cond_e
    move v8, v13

    .line 356
    :goto_9
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 357
    .line 358
    .line 359
    move-result-object v8

    .line 360
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    add-int/lit8 v6, v6, 0x1

    .line 364
    .line 365
    goto :goto_8

    .line 366
    :cond_f
    move-object v4, v7

    .line 367
    goto :goto_b

    .line 368
    :cond_10
    if-nez v2, :cond_11

    .line 369
    .line 370
    goto :goto_a

    .line 371
    :cond_11
    and-int/lit8 v4, v20, 0x40

    .line 372
    .line 373
    if-eqz v4, :cond_12

    .line 374
    .line 375
    const-string v4, "editable.tracks.offset"

    .line 376
    .line 377
    invoke-static {v2, v4}, Lh2/p;->b(Landroidx/media3/common/t0;Ljava/lang/String;)Li1/a;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    if-eqz v4, :cond_12

    .line 382
    .line 383
    new-instance v6, Lh1/w;

    .line 384
    .line 385
    iget-object v4, v4, Li1/a;->k:[B

    .line 386
    .line 387
    invoke-direct {v6, v4}, Lh1/w;-><init>([B)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v6}, Lh1/w;->z()J

    .line 391
    .line 392
    .line 393
    move-result-wide v6

    .line 394
    cmp-long v4, v6, v16

    .line 395
    .line 396
    if-lez v4, :cond_12

    .line 397
    .line 398
    iput-wide v6, v1, Lh2/m;->w:J

    .line 399
    .line 400
    iput-boolean v13, v1, Lh2/m;->v:Z

    .line 401
    .line 402
    move-object/from16 v30, v0

    .line 403
    .line 404
    goto/16 :goto_38

    .line 405
    .line 406
    :cond_12
    :goto_a
    move-object/from16 v4, v18

    .line 407
    .line 408
    goto :goto_b

    .line 409
    :cond_13
    move-object/from16 v4, v18

    .line 410
    .line 411
    const/4 v2, 0x0

    .line 412
    :goto_b
    new-instance v14, Ljava/util/ArrayList;

    .line 413
    .line 414
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 415
    .line 416
    .line 417
    iget v6, v1, Lh2/m;->E:I

    .line 418
    .line 419
    if-ne v6, v13, :cond_14

    .line 420
    .line 421
    move v11, v13

    .line 422
    goto :goto_c

    .line 423
    :cond_14
    move v11, v3

    .line 424
    :goto_c
    new-instance v6, Ln1/v;

    .line 425
    .line 426
    invoke-direct {v6}, Ln1/v;-><init>()V

    .line 427
    .line 428
    .line 429
    const v7, 0x75647461

    .line 430
    .line 431
    .line 432
    invoke-virtual {v5, v7}, Li1/b;->h(I)Li1/c;

    .line 433
    .line 434
    .line 435
    move-result-object v7

    .line 436
    if-eqz v7, :cond_52

    .line 437
    .line 438
    sget-object v8, Lh2/d;->a:[B

    .line 439
    .line 440
    iget-object v7, v7, Li1/c;->c:Lh1/w;

    .line 441
    .line 442
    const/16 v8, 0x8

    .line 443
    .line 444
    invoke-virtual {v7, v8}, Lh1/w;->G(I)V

    .line 445
    .line 446
    .line 447
    new-instance v9, Landroidx/media3/common/t0;

    .line 448
    .line 449
    new-array v10, v3, [Landroidx/media3/common/s0;

    .line 450
    .line 451
    invoke-direct {v9, v10}, Landroidx/media3/common/t0;-><init>([Landroidx/media3/common/s0;)V

    .line 452
    .line 453
    .line 454
    :goto_d
    invoke-virtual {v7}, Lh1/w;->a()I

    .line 455
    .line 456
    .line 457
    move-result v10

    .line 458
    if-lt v10, v8, :cond_51

    .line 459
    .line 460
    iget v10, v7, Lh1/w;->b:I

    .line 461
    .line 462
    invoke-virtual {v7}, Lh1/w;->g()I

    .line 463
    .line 464
    .line 465
    move-result v12

    .line 466
    invoke-virtual {v7}, Lh1/w;->g()I

    .line 467
    .line 468
    .line 469
    move-result v15

    .line 470
    const v3, 0x6d657461

    .line 471
    .line 472
    .line 473
    if-ne v15, v3, :cond_40

    .line 474
    .line 475
    invoke-virtual {v7, v10}, Lh1/w;->G(I)V

    .line 476
    .line 477
    .line 478
    add-int v15, v10, v12

    .line 479
    .line 480
    invoke-virtual {v7, v8}, Lh1/w;->H(I)V

    .line 481
    .line 482
    .line 483
    iget v8, v7, Lh1/w;->b:I

    .line 484
    .line 485
    const/4 v3, 0x4

    .line 486
    invoke-virtual {v7, v3}, Lh1/w;->H(I)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {v7}, Lh1/w;->g()I

    .line 490
    .line 491
    .line 492
    move-result v3

    .line 493
    move/from16 v29, v13

    .line 494
    .line 495
    const v13, 0x68646c72    # 4.3148E24f

    .line 496
    .line 497
    .line 498
    if-eq v3, v13, :cond_15

    .line 499
    .line 500
    add-int/lit8 v8, v8, 0x4

    .line 501
    .line 502
    :cond_15
    invoke-virtual {v7, v8}, Lh1/w;->G(I)V

    .line 503
    .line 504
    .line 505
    :goto_e
    iget v3, v7, Lh1/w;->b:I

    .line 506
    .line 507
    if-ge v3, v15, :cond_3f

    .line 508
    .line 509
    invoke-virtual {v7}, Lh1/w;->g()I

    .line 510
    .line 511
    .line 512
    move-result v8

    .line 513
    invoke-virtual {v7}, Lh1/w;->g()I

    .line 514
    .line 515
    .line 516
    move-result v13

    .line 517
    move-object/from16 v30, v0

    .line 518
    .line 519
    const v0, 0x696c7374

    .line 520
    .line 521
    .line 522
    if-ne v13, v0, :cond_3e

    .line 523
    .line 524
    invoke-virtual {v7, v3}, Lh1/w;->G(I)V

    .line 525
    .line 526
    .line 527
    add-int/2addr v3, v8

    .line 528
    const/16 v8, 0x8

    .line 529
    .line 530
    invoke-virtual {v7, v8}, Lh1/w;->H(I)V

    .line 531
    .line 532
    .line 533
    new-instance v8, Ljava/util/ArrayList;

    .line 534
    .line 535
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 536
    .line 537
    .line 538
    :goto_f
    iget v13, v7, Lh1/w;->b:I

    .line 539
    .line 540
    if-ge v13, v3, :cond_3c

    .line 541
    .line 542
    const-string v15, "Skipped unknown metadata entry: "

    .line 543
    .line 544
    invoke-virtual {v7}, Lh1/w;->g()I

    .line 545
    .line 546
    .line 547
    move-result v26

    .line 548
    add-int v13, v26, v13

    .line 549
    .line 550
    invoke-virtual {v7}, Lh1/w;->g()I

    .line 551
    .line 552
    .line 553
    move-result v0

    .line 554
    move/from16 v31, v3

    .line 555
    .line 556
    shr-int/lit8 v3, v0, 0x18

    .line 557
    .line 558
    and-int/lit16 v3, v3, 0xff

    .line 559
    .line 560
    move/from16 v32, v11

    .line 561
    .line 562
    const/16 v11, 0xa9

    .line 563
    .line 564
    move/from16 v33, v12

    .line 565
    .line 566
    const-string v12, "MetadataUtil"

    .line 567
    .line 568
    move-object/from16 v34, v14

    .line 569
    .line 570
    const-string v14, "TCON"

    .line 571
    .line 572
    if-eq v3, v11, :cond_16

    .line 573
    .line 574
    const/16 v11, 0xfd

    .line 575
    .line 576
    if-ne v3, v11, :cond_17

    .line 577
    .line 578
    :cond_16
    const v3, 0x64617461

    .line 579
    .line 580
    .line 581
    goto/16 :goto_16

    .line 582
    .line 583
    :cond_17
    const v3, 0x676e7265

    .line 584
    .line 585
    .line 586
    if-ne v0, v3, :cond_19

    .line 587
    .line 588
    :try_start_0
    invoke-static {v7}, Lh2/p;->g(Lh1/w;)I

    .line 589
    .line 590
    .line 591
    move-result v0

    .line 592
    add-int/lit8 v0, v0, -0x1

    .line 593
    .line 594
    invoke-static {v0}, Lb2/k;->a(I)Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    if-eqz v0, :cond_18

    .line 599
    .line 600
    new-instance v3, Lb2/o;

    .line 601
    .line 602
    invoke-static {v0}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    const/4 v11, 0x0

    .line 607
    invoke-direct {v3, v14, v11, v0}, Lb2/o;-><init>(Ljava/lang/String;Ljava/lang/String;Lf6/l1;)V

    .line 608
    .line 609
    .line 610
    goto :goto_10

    .line 611
    :cond_18
    const/4 v11, 0x0

    .line 612
    const-string v0, "Failed to parse standard genre code"

    .line 613
    .line 614
    invoke-static {v12, v0}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 615
    .line 616
    .line 617
    move-object v3, v11

    .line 618
    :goto_10
    invoke-virtual {v7, v13}, Lh1/w;->G(I)V

    .line 619
    .line 620
    .line 621
    goto/16 :goto_19

    .line 622
    .line 623
    :cond_19
    const/4 v11, 0x0

    .line 624
    const v3, 0x6469736b

    .line 625
    .line 626
    .line 627
    if-ne v0, v3, :cond_1a

    .line 628
    .line 629
    :try_start_1
    const-string v3, "TPOS"

    .line 630
    .line 631
    invoke-static {v0, v7, v3}, Lh2/p;->f(ILh1/w;Ljava/lang/String;)Lb2/o;

    .line 632
    .line 633
    .line 634
    move-result-object v3

    .line 635
    goto :goto_10

    .line 636
    :catchall_0
    move-exception v0

    .line 637
    goto/16 :goto_1a

    .line 638
    .line 639
    :cond_1a
    const v3, 0x74726b6e

    .line 640
    .line 641
    .line 642
    if-ne v0, v3, :cond_1b

    .line 643
    .line 644
    const-string v3, "TRCK"

    .line 645
    .line 646
    invoke-static {v0, v7, v3}, Lh2/p;->f(ILh1/w;Ljava/lang/String;)Lb2/o;

    .line 647
    .line 648
    .line 649
    move-result-object v3

    .line 650
    goto :goto_10

    .line 651
    :cond_1b
    const v3, 0x746d706f

    .line 652
    .line 653
    .line 654
    if-ne v0, v3, :cond_1c

    .line 655
    .line 656
    const-string v3, "TBPM"

    .line 657
    .line 658
    move/from16 v12, v29

    .line 659
    .line 660
    const/4 v14, 0x0

    .line 661
    invoke-static {v0, v3, v7, v12, v14}, Lh2/p;->h(ILjava/lang/String;Lh1/w;ZZ)Lb2/j;

    .line 662
    .line 663
    .line 664
    move-result-object v3

    .line 665
    goto :goto_10

    .line 666
    :cond_1c
    const v3, 0x6370696c

    .line 667
    .line 668
    .line 669
    if-ne v0, v3, :cond_1d

    .line 670
    .line 671
    const-string v3, "TCMP"

    .line 672
    .line 673
    const/4 v12, 0x1

    .line 674
    invoke-static {v0, v3, v7, v12, v12}, Lh2/p;->h(ILjava/lang/String;Lh1/w;ZZ)Lb2/j;

    .line 675
    .line 676
    .line 677
    move-result-object v3

    .line 678
    goto :goto_10

    .line 679
    :cond_1d
    const v3, 0x636f7672

    .line 680
    .line 681
    .line 682
    if-ne v0, v3, :cond_1e

    .line 683
    .line 684
    invoke-static {v7}, Lh2/p;->e(Lh1/w;)Lb2/a;

    .line 685
    .line 686
    .line 687
    move-result-object v3

    .line 688
    goto :goto_10

    .line 689
    :cond_1e
    const v3, 0x61415254

    .line 690
    .line 691
    .line 692
    if-ne v0, v3, :cond_1f

    .line 693
    .line 694
    const-string v3, "TPE2"

    .line 695
    .line 696
    invoke-static {v0, v7, v3}, Lh2/p;->k(ILh1/w;Ljava/lang/String;)Lb2/o;

    .line 697
    .line 698
    .line 699
    move-result-object v3

    .line 700
    goto :goto_10

    .line 701
    :cond_1f
    const v3, 0x736f6e6d

    .line 702
    .line 703
    .line 704
    if-ne v0, v3, :cond_20

    .line 705
    .line 706
    const-string v3, "TSOT"

    .line 707
    .line 708
    invoke-static {v0, v7, v3}, Lh2/p;->k(ILh1/w;Ljava/lang/String;)Lb2/o;

    .line 709
    .line 710
    .line 711
    move-result-object v3

    .line 712
    goto :goto_10

    .line 713
    :cond_20
    const v3, 0x736f616c

    .line 714
    .line 715
    .line 716
    if-ne v0, v3, :cond_21

    .line 717
    .line 718
    const-string v3, "TSOA"

    .line 719
    .line 720
    invoke-static {v0, v7, v3}, Lh2/p;->k(ILh1/w;Ljava/lang/String;)Lb2/o;

    .line 721
    .line 722
    .line 723
    move-result-object v3

    .line 724
    goto :goto_10

    .line 725
    :cond_21
    const v3, 0x736f6172

    .line 726
    .line 727
    .line 728
    if-ne v0, v3, :cond_22

    .line 729
    .line 730
    const-string v3, "TSOP"

    .line 731
    .line 732
    invoke-static {v0, v7, v3}, Lh2/p;->k(ILh1/w;Ljava/lang/String;)Lb2/o;

    .line 733
    .line 734
    .line 735
    move-result-object v3

    .line 736
    goto :goto_10

    .line 737
    :cond_22
    const v3, 0x736f6161

    .line 738
    .line 739
    .line 740
    if-ne v0, v3, :cond_23

    .line 741
    .line 742
    const-string v3, "TSO2"

    .line 743
    .line 744
    invoke-static {v0, v7, v3}, Lh2/p;->k(ILh1/w;Ljava/lang/String;)Lb2/o;

    .line 745
    .line 746
    .line 747
    move-result-object v3

    .line 748
    goto/16 :goto_10

    .line 749
    .line 750
    :cond_23
    const v3, 0x736f636f

    .line 751
    .line 752
    .line 753
    if-ne v0, v3, :cond_24

    .line 754
    .line 755
    const-string v3, "TSOC"

    .line 756
    .line 757
    invoke-static {v0, v7, v3}, Lh2/p;->k(ILh1/w;Ljava/lang/String;)Lb2/o;

    .line 758
    .line 759
    .line 760
    move-result-object v3

    .line 761
    goto/16 :goto_10

    .line 762
    .line 763
    :cond_24
    const v3, 0x72746e67

    .line 764
    .line 765
    .line 766
    if-ne v0, v3, :cond_25

    .line 767
    .line 768
    const-string v3, "ITUNESADVISORY"

    .line 769
    .line 770
    const/4 v14, 0x0

    .line 771
    invoke-static {v0, v3, v7, v14, v14}, Lh2/p;->h(ILjava/lang/String;Lh1/w;ZZ)Lb2/j;

    .line 772
    .line 773
    .line 774
    move-result-object v3

    .line 775
    goto/16 :goto_10

    .line 776
    .line 777
    :cond_25
    const v3, 0x70676170

    .line 778
    .line 779
    .line 780
    if-ne v0, v3, :cond_26

    .line 781
    .line 782
    const-string v3, "ITUNESGAPLESS"

    .line 783
    .line 784
    const/4 v12, 0x1

    .line 785
    const/4 v14, 0x0

    .line 786
    invoke-static {v0, v3, v7, v14, v12}, Lh2/p;->h(ILjava/lang/String;Lh1/w;ZZ)Lb2/j;

    .line 787
    .line 788
    .line 789
    move-result-object v3

    .line 790
    goto/16 :goto_10

    .line 791
    .line 792
    :cond_26
    const v3, 0x736f736e

    .line 793
    .line 794
    .line 795
    if-ne v0, v3, :cond_27

    .line 796
    .line 797
    const-string v3, "TVSHOWSORT"

    .line 798
    .line 799
    invoke-static {v0, v7, v3}, Lh2/p;->k(ILh1/w;Ljava/lang/String;)Lb2/o;

    .line 800
    .line 801
    .line 802
    move-result-object v3

    .line 803
    goto/16 :goto_10

    .line 804
    .line 805
    :cond_27
    const v3, 0x74767368

    .line 806
    .line 807
    .line 808
    if-ne v0, v3, :cond_28

    .line 809
    .line 810
    const-string v3, "TVSHOW"

    .line 811
    .line 812
    invoke-static {v0, v7, v3}, Lh2/p;->k(ILh1/w;Ljava/lang/String;)Lb2/o;

    .line 813
    .line 814
    .line 815
    move-result-object v3

    .line 816
    goto/16 :goto_10

    .line 817
    .line 818
    :cond_28
    const v3, 0x2d2d2d2d

    .line 819
    .line 820
    .line 821
    if-ne v0, v3, :cond_38

    .line 822
    .line 823
    move-object v12, v11

    .line 824
    move-object v14, v12

    .line 825
    const/4 v0, -0x1

    .line 826
    const/4 v3, -0x1

    .line 827
    :goto_11
    iget v15, v7, Lh1/w;->b:I

    .line 828
    .line 829
    if-ge v15, v13, :cond_2c

    .line 830
    .line 831
    invoke-virtual {v7}, Lh1/w;->g()I

    .line 832
    .line 833
    .line 834
    move-result v21

    .line 835
    invoke-virtual {v7}, Lh1/w;->g()I

    .line 836
    .line 837
    .line 838
    move-result v11

    .line 839
    move/from16 v35, v3

    .line 840
    .line 841
    const/4 v3, 0x4

    .line 842
    invoke-virtual {v7, v3}, Lh1/w;->H(I)V

    .line 843
    .line 844
    .line 845
    const v3, 0x6d65616e

    .line 846
    .line 847
    .line 848
    if-ne v11, v3, :cond_29

    .line 849
    .line 850
    add-int/lit8 v3, v21, -0xc

    .line 851
    .line 852
    invoke-virtual {v7, v3}, Lh1/w;->q(I)Ljava/lang/String;

    .line 853
    .line 854
    .line 855
    move-result-object v12

    .line 856
    :goto_12
    const v3, 0x64617461

    .line 857
    .line 858
    .line 859
    goto :goto_13

    .line 860
    :cond_29
    const v3, 0x6e616d65

    .line 861
    .line 862
    .line 863
    if-ne v11, v3, :cond_2a

    .line 864
    .line 865
    add-int/lit8 v3, v21, -0xc

    .line 866
    .line 867
    invoke-virtual {v7, v3}, Lh1/w;->q(I)Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object v14

    .line 871
    goto :goto_12

    .line 872
    :cond_2a
    const v3, 0x64617461

    .line 873
    .line 874
    .line 875
    if-ne v11, v3, :cond_2b

    .line 876
    .line 877
    move v0, v15

    .line 878
    move/from16 v35, v21

    .line 879
    .line 880
    :cond_2b
    add-int/lit8 v11, v21, -0xc

    .line 881
    .line 882
    invoke-virtual {v7, v11}, Lh1/w;->H(I)V

    .line 883
    .line 884
    .line 885
    :goto_13
    move/from16 v3, v35

    .line 886
    .line 887
    const/4 v11, 0x0

    .line 888
    goto :goto_11

    .line 889
    :cond_2c
    move/from16 v35, v3

    .line 890
    .line 891
    const v3, 0x64617461

    .line 892
    .line 893
    .line 894
    if-eqz v12, :cond_2e

    .line 895
    .line 896
    if-eqz v14, :cond_2e

    .line 897
    .line 898
    const/4 v11, -0x1

    .line 899
    if-ne v0, v11, :cond_2d

    .line 900
    .line 901
    goto :goto_14

    .line 902
    :cond_2d
    invoke-virtual {v7, v0}, Lh1/w;->G(I)V

    .line 903
    .line 904
    .line 905
    const/16 v0, 0x10

    .line 906
    .line 907
    invoke-virtual {v7, v0}, Lh1/w;->H(I)V

    .line 908
    .line 909
    .line 910
    add-int/lit8 v0, v35, -0x10

    .line 911
    .line 912
    invoke-virtual {v7, v0}, Lh1/w;->q(I)Ljava/lang/String;

    .line 913
    .line 914
    .line 915
    move-result-object v0

    .line 916
    new-instance v11, Lb2/l;

    .line 917
    .line 918
    invoke-direct {v11, v12, v14, v0}, Lb2/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 919
    .line 920
    .line 921
    goto :goto_15

    .line 922
    :cond_2e
    :goto_14
    const/4 v11, 0x0

    .line 923
    :goto_15
    invoke-virtual {v7, v13}, Lh1/w;->G(I)V

    .line 924
    .line 925
    .line 926
    move-object v3, v11

    .line 927
    goto/16 :goto_19

    .line 928
    .line 929
    :goto_16
    const v11, 0xffffff

    .line 930
    .line 931
    .line 932
    and-int/2addr v11, v0

    .line 933
    const v3, 0x636d74

    .line 934
    .line 935
    .line 936
    if-ne v11, v3, :cond_2f

    .line 937
    .line 938
    :try_start_2
    invoke-static {v7, v0}, Lh2/p;->d(Lh1/w;I)Lb2/e;

    .line 939
    .line 940
    .line 941
    move-result-object v3

    .line 942
    goto/16 :goto_10

    .line 943
    .line 944
    :cond_2f
    const v3, 0x6e616d

    .line 945
    .line 946
    .line 947
    if-eq v11, v3, :cond_3a

    .line 948
    .line 949
    const v3, 0x74726b

    .line 950
    .line 951
    .line 952
    if-ne v11, v3, :cond_30

    .line 953
    .line 954
    goto/16 :goto_18

    .line 955
    .line 956
    :cond_30
    const v3, 0x636f6d

    .line 957
    .line 958
    .line 959
    if-eq v11, v3, :cond_39

    .line 960
    .line 961
    const v3, 0x777274

    .line 962
    .line 963
    .line 964
    if-ne v11, v3, :cond_31

    .line 965
    .line 966
    goto/16 :goto_17

    .line 967
    .line 968
    :cond_31
    const v3, 0x646179

    .line 969
    .line 970
    .line 971
    if-ne v11, v3, :cond_32

    .line 972
    .line 973
    const-string v3, "TDRC"

    .line 974
    .line 975
    invoke-static {v0, v7, v3}, Lh2/p;->k(ILh1/w;Ljava/lang/String;)Lb2/o;

    .line 976
    .line 977
    .line 978
    move-result-object v3

    .line 979
    goto/16 :goto_10

    .line 980
    .line 981
    :cond_32
    const v3, 0x415254

    .line 982
    .line 983
    .line 984
    if-ne v11, v3, :cond_33

    .line 985
    .line 986
    const-string v3, "TPE1"

    .line 987
    .line 988
    invoke-static {v0, v7, v3}, Lh2/p;->k(ILh1/w;Ljava/lang/String;)Lb2/o;

    .line 989
    .line 990
    .line 991
    move-result-object v3

    .line 992
    goto/16 :goto_10

    .line 993
    .line 994
    :cond_33
    const v3, 0x746f6f

    .line 995
    .line 996
    .line 997
    if-ne v11, v3, :cond_34

    .line 998
    .line 999
    const-string v3, "TSSE"

    .line 1000
    .line 1001
    invoke-static {v0, v7, v3}, Lh2/p;->k(ILh1/w;Ljava/lang/String;)Lb2/o;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v3

    .line 1005
    goto/16 :goto_10

    .line 1006
    .line 1007
    :cond_34
    const v3, 0x616c62

    .line 1008
    .line 1009
    .line 1010
    if-ne v11, v3, :cond_35

    .line 1011
    .line 1012
    const-string v3, "TALB"

    .line 1013
    .line 1014
    invoke-static {v0, v7, v3}, Lh2/p;->k(ILh1/w;Ljava/lang/String;)Lb2/o;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v3

    .line 1018
    goto/16 :goto_10

    .line 1019
    .line 1020
    :cond_35
    const v3, 0x6c7972

    .line 1021
    .line 1022
    .line 1023
    if-ne v11, v3, :cond_36

    .line 1024
    .line 1025
    const-string v3, "USLT"

    .line 1026
    .line 1027
    invoke-static {v0, v7, v3}, Lh2/p;->k(ILh1/w;Ljava/lang/String;)Lb2/o;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v3

    .line 1031
    goto/16 :goto_10

    .line 1032
    .line 1033
    :cond_36
    const v3, 0x67656e

    .line 1034
    .line 1035
    .line 1036
    if-ne v11, v3, :cond_37

    .line 1037
    .line 1038
    invoke-static {v0, v7, v14}, Lh2/p;->k(ILh1/w;Ljava/lang/String;)Lb2/o;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v3

    .line 1042
    goto/16 :goto_10

    .line 1043
    .line 1044
    :cond_37
    const v3, 0x677270

    .line 1045
    .line 1046
    .line 1047
    if-ne v11, v3, :cond_38

    .line 1048
    .line 1049
    const-string v3, "TIT1"

    .line 1050
    .line 1051
    invoke-static {v0, v7, v3}, Lh2/p;->k(ILh1/w;Ljava/lang/String;)Lb2/o;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v3

    .line 1055
    goto/16 :goto_10

    .line 1056
    .line 1057
    :cond_38
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1058
    .line 1059
    invoke-direct {v3, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1060
    .line 1061
    .line 1062
    invoke-static {v0}, Li1/d;->a(I)Ljava/lang/String;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v0

    .line 1066
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v0

    .line 1073
    invoke-static {v12, v0}, Lh1/a;->n(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual {v7, v13}, Lh1/w;->G(I)V

    .line 1077
    .line 1078
    .line 1079
    const/4 v3, 0x0

    .line 1080
    goto :goto_19

    .line 1081
    :cond_39
    :goto_17
    :try_start_3
    const-string v3, "TCOM"

    .line 1082
    .line 1083
    invoke-static {v0, v7, v3}, Lh2/p;->k(ILh1/w;Ljava/lang/String;)Lb2/o;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v3

    .line 1087
    goto/16 :goto_10

    .line 1088
    .line 1089
    :cond_3a
    :goto_18
    const-string v3, "TIT2"

    .line 1090
    .line 1091
    invoke-static {v0, v7, v3}, Lh2/p;->k(ILh1/w;Ljava/lang/String;)Lb2/o;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1095
    goto/16 :goto_10

    .line 1096
    .line 1097
    :goto_19
    if-eqz v3, :cond_3b

    .line 1098
    .line 1099
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1100
    .line 1101
    .line 1102
    :cond_3b
    move/from16 v3, v31

    .line 1103
    .line 1104
    move/from16 v11, v32

    .line 1105
    .line 1106
    move/from16 v12, v33

    .line 1107
    .line 1108
    move-object/from16 v14, v34

    .line 1109
    .line 1110
    const v0, 0x696c7374

    .line 1111
    .line 1112
    .line 1113
    const/16 v29, 0x1

    .line 1114
    .line 1115
    goto/16 :goto_f

    .line 1116
    .line 1117
    :goto_1a
    invoke-virtual {v7, v13}, Lh1/w;->G(I)V

    .line 1118
    .line 1119
    .line 1120
    throw v0

    .line 1121
    :cond_3c
    move/from16 v32, v11

    .line 1122
    .line 1123
    move/from16 v33, v12

    .line 1124
    .line 1125
    move-object/from16 v34, v14

    .line 1126
    .line 1127
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1128
    .line 1129
    .line 1130
    move-result v0

    .line 1131
    if-eqz v0, :cond_3d

    .line 1132
    .line 1133
    const/4 v0, 0x0

    .line 1134
    :goto_1b
    const v28, 0x64617461

    .line 1135
    .line 1136
    .line 1137
    goto :goto_1c

    .line 1138
    :cond_3d
    new-instance v0, Landroidx/media3/common/t0;

    .line 1139
    .line 1140
    invoke-direct {v0, v8}, Landroidx/media3/common/t0;-><init>(Ljava/util/List;)V

    .line 1141
    .line 1142
    .line 1143
    goto :goto_1b

    .line 1144
    :cond_3e
    move/from16 v32, v11

    .line 1145
    .line 1146
    move/from16 v33, v12

    .line 1147
    .line 1148
    move-object/from16 v34, v14

    .line 1149
    .line 1150
    const v28, 0x64617461

    .line 1151
    .line 1152
    .line 1153
    add-int/2addr v3, v8

    .line 1154
    invoke-virtual {v7, v3}, Lh1/w;->G(I)V

    .line 1155
    .line 1156
    .line 1157
    move-object/from16 v0, v30

    .line 1158
    .line 1159
    const v13, 0x68646c72    # 4.3148E24f

    .line 1160
    .line 1161
    .line 1162
    const/16 v29, 0x1

    .line 1163
    .line 1164
    goto/16 :goto_e

    .line 1165
    .line 1166
    :cond_3f
    move-object/from16 v30, v0

    .line 1167
    .line 1168
    move/from16 v32, v11

    .line 1169
    .line 1170
    move/from16 v33, v12

    .line 1171
    .line 1172
    move-object/from16 v34, v14

    .line 1173
    .line 1174
    const v28, 0x64617461

    .line 1175
    .line 1176
    .line 1177
    const/4 v0, 0x0

    .line 1178
    :goto_1c
    invoke-virtual {v9, v0}, Landroidx/media3/common/t0;->b(Landroidx/media3/common/t0;)Landroidx/media3/common/t0;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v0

    .line 1182
    move-object v9, v0

    .line 1183
    const/16 v8, 0x8

    .line 1184
    .line 1185
    const/4 v11, 0x4

    .line 1186
    const/16 v14, 0xc

    .line 1187
    .line 1188
    goto/16 :goto_27

    .line 1189
    .line 1190
    :cond_40
    move-object/from16 v30, v0

    .line 1191
    .line 1192
    move/from16 v32, v11

    .line 1193
    .line 1194
    move/from16 v33, v12

    .line 1195
    .line 1196
    move-object/from16 v34, v14

    .line 1197
    .line 1198
    const v28, 0x64617461

    .line 1199
    .line 1200
    .line 1201
    const v0, 0x736d7461

    .line 1202
    .line 1203
    .line 1204
    if-ne v15, v0, :cond_4f

    .line 1205
    .line 1206
    invoke-virtual {v7, v10}, Lh1/w;->G(I)V

    .line 1207
    .line 1208
    .line 1209
    add-int v12, v10, v33

    .line 1210
    .line 1211
    const/16 v0, 0xc

    .line 1212
    .line 1213
    invoke-virtual {v7, v0}, Lh1/w;->H(I)V

    .line 1214
    .line 1215
    .line 1216
    :goto_1d
    iget v0, v7, Lh1/w;->b:I

    .line 1217
    .line 1218
    if-ge v0, v12, :cond_4e

    .line 1219
    .line 1220
    invoke-virtual {v7}, Lh1/w;->g()I

    .line 1221
    .line 1222
    .line 1223
    move-result v3

    .line 1224
    invoke-virtual {v7}, Lh1/w;->g()I

    .line 1225
    .line 1226
    .line 1227
    move-result v8

    .line 1228
    const v11, 0x73617574

    .line 1229
    .line 1230
    .line 1231
    if-ne v8, v11, :cond_4d

    .line 1232
    .line 1233
    const/16 v8, 0x10

    .line 1234
    .line 1235
    if-ge v3, v8, :cond_41

    .line 1236
    .line 1237
    const/4 v3, 0x0

    .line 1238
    const/16 v8, 0x8

    .line 1239
    .line 1240
    const/4 v11, 0x4

    .line 1241
    const/16 v14, 0xc

    .line 1242
    .line 1243
    goto/16 :goto_24

    .line 1244
    .line 1245
    :cond_41
    const/4 v11, 0x4

    .line 1246
    invoke-virtual {v7, v11}, Lh1/w;->H(I)V

    .line 1247
    .line 1248
    .line 1249
    const/4 v0, -0x1

    .line 1250
    const/4 v3, 0x0

    .line 1251
    const/4 v13, 0x0

    .line 1252
    :goto_1e
    const/4 v14, 0x2

    .line 1253
    if-ge v3, v14, :cond_44

    .line 1254
    .line 1255
    invoke-virtual {v7}, Lh1/w;->u()I

    .line 1256
    .line 1257
    .line 1258
    move-result v14

    .line 1259
    invoke-virtual {v7}, Lh1/w;->u()I

    .line 1260
    .line 1261
    .line 1262
    move-result v15

    .line 1263
    if-nez v14, :cond_42

    .line 1264
    .line 1265
    move v0, v15

    .line 1266
    goto :goto_1f

    .line 1267
    :cond_42
    const/4 v8, 0x1

    .line 1268
    if-ne v14, v8, :cond_43

    .line 1269
    .line 1270
    move v13, v15

    .line 1271
    :cond_43
    :goto_1f
    add-int/lit8 v3, v3, 0x1

    .line 1272
    .line 1273
    const/16 v8, 0x10

    .line 1274
    .line 1275
    goto :goto_1e

    .line 1276
    :cond_44
    const v3, -0x7fffffff

    .line 1277
    .line 1278
    .line 1279
    const/16 v8, 0xc

    .line 1280
    .line 1281
    if-ne v0, v8, :cond_45

    .line 1282
    .line 1283
    const/16 v0, 0xf0

    .line 1284
    .line 1285
    :goto_20
    const/16 v8, 0x8

    .line 1286
    .line 1287
    const/16 v14, 0xc

    .line 1288
    .line 1289
    goto :goto_22

    .line 1290
    :cond_45
    const/16 v8, 0xd

    .line 1291
    .line 1292
    if-ne v0, v8, :cond_46

    .line 1293
    .line 1294
    const/16 v0, 0x78

    .line 1295
    .line 1296
    goto :goto_20

    .line 1297
    :cond_46
    const/16 v8, 0x15

    .line 1298
    .line 1299
    if-eq v0, v8, :cond_47

    .line 1300
    .line 1301
    move v0, v3

    .line 1302
    goto :goto_20

    .line 1303
    :cond_47
    invoke-virtual {v7}, Lh1/w;->a()I

    .line 1304
    .line 1305
    .line 1306
    move-result v0

    .line 1307
    const/16 v8, 0x8

    .line 1308
    .line 1309
    if-lt v0, v8, :cond_48

    .line 1310
    .line 1311
    iget v0, v7, Lh1/w;->b:I

    .line 1312
    .line 1313
    add-int/2addr v0, v8

    .line 1314
    if-le v0, v12, :cond_49

    .line 1315
    .line 1316
    :cond_48
    const/16 v14, 0xc

    .line 1317
    .line 1318
    goto :goto_21

    .line 1319
    :cond_49
    invoke-virtual {v7}, Lh1/w;->g()I

    .line 1320
    .line 1321
    .line 1322
    move-result v0

    .line 1323
    invoke-virtual {v7}, Lh1/w;->g()I

    .line 1324
    .line 1325
    .line 1326
    move-result v12

    .line 1327
    const/16 v14, 0xc

    .line 1328
    .line 1329
    if-lt v0, v14, :cond_4b

    .line 1330
    .line 1331
    const v0, 0x73726672

    .line 1332
    .line 1333
    .line 1334
    if-eq v12, v0, :cond_4a

    .line 1335
    .line 1336
    goto :goto_21

    .line 1337
    :cond_4a
    invoke-virtual {v7}, Lh1/w;->v()I

    .line 1338
    .line 1339
    .line 1340
    move-result v0

    .line 1341
    goto :goto_22

    .line 1342
    :cond_4b
    :goto_21
    move v0, v3

    .line 1343
    :goto_22
    if-ne v0, v3, :cond_4c

    .line 1344
    .line 1345
    :goto_23
    const/4 v3, 0x0

    .line 1346
    goto :goto_24

    .line 1347
    :cond_4c
    new-instance v3, Landroidx/media3/common/t0;

    .line 1348
    .line 1349
    new-instance v12, Lc2/e;

    .line 1350
    .line 1351
    int-to-float v0, v0

    .line 1352
    invoke-direct {v12, v13, v0}, Lc2/e;-><init>(IF)V

    .line 1353
    .line 1354
    .line 1355
    const/4 v0, 0x1

    .line 1356
    new-array v13, v0, [Landroidx/media3/common/s0;

    .line 1357
    .line 1358
    const/16 v27, 0x0

    .line 1359
    .line 1360
    aput-object v12, v13, v27

    .line 1361
    .line 1362
    invoke-direct {v3, v13}, Landroidx/media3/common/t0;-><init>([Landroidx/media3/common/s0;)V

    .line 1363
    .line 1364
    .line 1365
    goto :goto_24

    .line 1366
    :cond_4d
    const/16 v8, 0x8

    .line 1367
    .line 1368
    const/4 v11, 0x4

    .line 1369
    const/16 v14, 0xc

    .line 1370
    .line 1371
    add-int/2addr v0, v3

    .line 1372
    invoke-virtual {v7, v0}, Lh1/w;->G(I)V

    .line 1373
    .line 1374
    .line 1375
    goto/16 :goto_1d

    .line 1376
    .line 1377
    :cond_4e
    const/16 v8, 0x8

    .line 1378
    .line 1379
    const/4 v11, 0x4

    .line 1380
    const/16 v14, 0xc

    .line 1381
    .line 1382
    goto :goto_23

    .line 1383
    :goto_24
    invoke-virtual {v9, v3}, Landroidx/media3/common/t0;->b(Landroidx/media3/common/t0;)Landroidx/media3/common/t0;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v0

    .line 1387
    :goto_25
    move-object v9, v0

    .line 1388
    goto :goto_27

    .line 1389
    :cond_4f
    const/16 v8, 0x8

    .line 1390
    .line 1391
    const/4 v11, 0x4

    .line 1392
    const/16 v14, 0xc

    .line 1393
    .line 1394
    const v0, -0x56878686

    .line 1395
    .line 1396
    .line 1397
    if-ne v15, v0, :cond_50

    .line 1398
    .line 1399
    invoke-virtual {v7}, Lh1/w;->r()S

    .line 1400
    .line 1401
    .line 1402
    move-result v0

    .line 1403
    const/4 v3, 0x2

    .line 1404
    invoke-virtual {v7, v3}, Lh1/w;->H(I)V

    .line 1405
    .line 1406
    .line 1407
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 1408
    .line 1409
    invoke-virtual {v7, v0, v3}, Lh1/w;->s(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v0

    .line 1413
    const/16 v3, 0x2b

    .line 1414
    .line 1415
    invoke-virtual {v0, v3}, Ljava/lang/String;->lastIndexOf(I)I

    .line 1416
    .line 1417
    .line 1418
    move-result v3

    .line 1419
    const/16 v12, 0x2d

    .line 1420
    .line 1421
    invoke-virtual {v0, v12}, Ljava/lang/String;->lastIndexOf(I)I

    .line 1422
    .line 1423
    .line 1424
    move-result v12

    .line 1425
    invoke-static {v3, v12}, Ljava/lang/Math;->max(II)I

    .line 1426
    .line 1427
    .line 1428
    move-result v3

    .line 1429
    const/4 v12, 0x0

    .line 1430
    :try_start_4
    invoke-virtual {v0, v12, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v13

    .line 1434
    invoke-static {v13}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 1435
    .line 1436
    .line 1437
    move-result v12

    .line 1438
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1439
    .line 1440
    .line 1441
    move-result v13

    .line 1442
    const/4 v15, 0x1

    .line 1443
    sub-int/2addr v13, v15

    .line 1444
    invoke-virtual {v0, v3, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v0

    .line 1448
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 1449
    .line 1450
    .line 1451
    move-result v0

    .line 1452
    new-instance v3, Landroidx/media3/common/t0;

    .line 1453
    .line 1454
    new-instance v13, Li1/e;

    .line 1455
    .line 1456
    invoke-direct {v13, v12, v0}, Li1/e;-><init>(FF)V

    .line 1457
    .line 1458
    .line 1459
    new-array v0, v15, [Landroidx/media3/common/s0;

    .line 1460
    .line 1461
    const/16 v27, 0x0

    .line 1462
    .line 1463
    aput-object v13, v0, v27

    .line 1464
    .line 1465
    invoke-direct {v3, v0}, Landroidx/media3/common/t0;-><init>([Landroidx/media3/common/s0;)V
    :try_end_4
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_0

    .line 1466
    .line 1467
    .line 1468
    goto :goto_26

    .line 1469
    :catch_0
    const/4 v3, 0x0

    .line 1470
    :goto_26
    invoke-virtual {v9, v3}, Landroidx/media3/common/t0;->b(Landroidx/media3/common/t0;)Landroidx/media3/common/t0;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v0

    .line 1474
    goto :goto_25

    .line 1475
    :cond_50
    :goto_27
    add-int v10, v10, v33

    .line 1476
    .line 1477
    invoke-virtual {v7, v10}, Lh1/w;->G(I)V

    .line 1478
    .line 1479
    .line 1480
    move-object/from16 v0, v30

    .line 1481
    .line 1482
    move/from16 v11, v32

    .line 1483
    .line 1484
    move-object/from16 v14, v34

    .line 1485
    .line 1486
    const/4 v3, 0x0

    .line 1487
    const/4 v13, 0x1

    .line 1488
    goto/16 :goto_d

    .line 1489
    .line 1490
    :cond_51
    move-object/from16 v30, v0

    .line 1491
    .line 1492
    move/from16 v32, v11

    .line 1493
    .line 1494
    move-object/from16 v34, v14

    .line 1495
    .line 1496
    invoke-virtual {v6, v9}, Ln1/v;->b(Landroidx/media3/common/t0;)V

    .line 1497
    .line 1498
    .line 1499
    move-object v0, v9

    .line 1500
    goto :goto_28

    .line 1501
    :cond_52
    move-object/from16 v30, v0

    .line 1502
    .line 1503
    move/from16 v32, v11

    .line 1504
    .line 1505
    move-object/from16 v34, v14

    .line 1506
    .line 1507
    const/4 v0, 0x0

    .line 1508
    :goto_28
    new-instance v3, Landroidx/media3/common/t0;

    .line 1509
    .line 1510
    const v7, 0x6d766864

    .line 1511
    .line 1512
    .line 1513
    invoke-virtual {v5, v7}, Li1/b;->h(I)Li1/c;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v7

    .line 1517
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1518
    .line 1519
    .line 1520
    iget-object v7, v7, Li1/c;->c:Lh1/w;

    .line 1521
    .line 1522
    invoke-static {v7}, Lh2/d;->d(Lh1/w;)Li1/f;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v7

    .line 1526
    const/4 v12, 0x1

    .line 1527
    new-array v8, v12, [Landroidx/media3/common/s0;

    .line 1528
    .line 1529
    const/16 v27, 0x0

    .line 1530
    .line 1531
    aput-object v7, v8, v27

    .line 1532
    .line 1533
    invoke-direct {v3, v8}, Landroidx/media3/common/t0;-><init>([Landroidx/media3/common/s0;)V

    .line 1534
    .line 1535
    .line 1536
    and-int/lit8 v7, v20, 0x1

    .line 1537
    .line 1538
    if-eqz v7, :cond_53

    .line 1539
    .line 1540
    const/4 v10, 0x1

    .line 1541
    goto :goto_29

    .line 1542
    :cond_53
    const/4 v10, 0x0

    .line 1543
    :goto_29
    new-instance v12, Lg2/d;

    .line 1544
    .line 1545
    const/4 v7, 0x5

    .line 1546
    invoke-direct {v12, v7}, Lg2/d;-><init>(I)V

    .line 1547
    .line 1548
    .line 1549
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    const/4 v9, 0x0

    .line 1555
    move/from16 v11, v32

    .line 1556
    .line 1557
    const/16 v21, 0x0

    .line 1558
    .line 1559
    invoke-static/range {v5 .. v12}, Lh2/d;->g(Li1/b;Ln1/v;JLandroidx/media3/common/s;ZZLe6/d;)Ljava/util/ArrayList;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v5

    .line 1563
    iget-boolean v7, v1, Lh2/m;->x:Z

    .line 1564
    .line 1565
    if-eqz v7, :cond_55

    .line 1566
    .line 1567
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1568
    .line 1569
    .line 1570
    move-result v7

    .line 1571
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1572
    .line 1573
    .line 1574
    move-result v8

    .line 1575
    if-ne v7, v8, :cond_54

    .line 1576
    .line 1577
    const/4 v7, 0x1

    .line 1578
    goto :goto_2a

    .line 1579
    :cond_54
    const/4 v7, 0x0

    .line 1580
    :goto_2a
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1581
    .line 1582
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1583
    .line 1584
    .line 1585
    move-result v8

    .line 1586
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1587
    .line 1588
    .line 1589
    move-result v9

    .line 1590
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1591
    .line 1592
    const-string v11, "The number of auxiliary track types from metadata ("

    .line 1593
    .line 1594
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1595
    .line 1596
    .line 1597
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1598
    .line 1599
    .line 1600
    const-string v8, ") is not same as the number of editable video tracks ("

    .line 1601
    .line 1602
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1603
    .line 1604
    .line 1605
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1606
    .line 1607
    .line 1608
    const-string v8, ")"

    .line 1609
    .line 1610
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1611
    .line 1612
    .line 1613
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v8

    .line 1617
    invoke-static {v8, v7}, Lh1/a;->i(Ljava/lang/String;Z)V

    .line 1618
    .line 1619
    .line 1620
    :cond_55
    const/4 v9, 0x0

    .line 1621
    const/4 v10, 0x0

    .line 1622
    const/4 v11, -0x1

    .line 1623
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    :goto_2b
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1629
    .line 1630
    .line 1631
    move-result v14

    .line 1632
    if-ge v9, v14, :cond_68

    .line 1633
    .line 1634
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v14

    .line 1638
    check-cast v14, Lh2/t;

    .line 1639
    .line 1640
    iget v15, v14, Lh2/t;->b:I

    .line 1641
    .line 1642
    const-wide v22, -0x7fffffffffffffffL    # -4.9E-324

    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    iget v7, v14, Lh2/t;->e:I

    .line 1648
    .line 1649
    if-nez v15, :cond_56

    .line 1650
    .line 1651
    move-object/from16 v19, v0

    .line 1652
    .line 1653
    move-object v15, v2

    .line 1654
    move-object v2, v3

    .line 1655
    move-object/from16 v24, v5

    .line 1656
    .line 1657
    move-object/from16 v3, v34

    .line 1658
    .line 1659
    const/4 v0, -0x1

    .line 1660
    const/4 v14, 0x3

    .line 1661
    goto/16 :goto_34

    .line 1662
    .line 1663
    :cond_56
    iget-object v8, v14, Lh2/t;->a:Lh2/q;

    .line 1664
    .line 1665
    move-object v15, v2

    .line 1666
    move-object/from16 v19, v3

    .line 1667
    .line 1668
    iget-wide v2, v8, Lh2/q;->e:J

    .line 1669
    .line 1670
    move-wide/from16 v24, v2

    .line 1671
    .line 1672
    iget-object v2, v8, Lh2/q;->g:Landroidx/media3/common/w;

    .line 1673
    .line 1674
    iget v3, v8, Lh2/q;->b:I

    .line 1675
    .line 1676
    cmp-long v26, v24, v22

    .line 1677
    .line 1678
    if-eqz v26, :cond_57

    .line 1679
    .line 1680
    move-wide/from16 v36, v24

    .line 1681
    .line 1682
    move-object/from16 v24, v5

    .line 1683
    .line 1684
    move-object/from16 v25, v6

    .line 1685
    .line 1686
    move-wide/from16 v5, v36

    .line 1687
    .line 1688
    goto :goto_2c

    .line 1689
    :cond_57
    move-object/from16 v24, v5

    .line 1690
    .line 1691
    move-object/from16 v25, v6

    .line 1692
    .line 1693
    iget-wide v5, v14, Lh2/t;->h:J

    .line 1694
    .line 1695
    :goto_2c
    invoke-static {v12, v13, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 1696
    .line 1697
    .line 1698
    move-result-wide v12

    .line 1699
    move/from16 v26, v7

    .line 1700
    .line 1701
    new-instance v7, Lh2/l;

    .line 1702
    .line 1703
    move-wide/from16 v31, v12

    .line 1704
    .line 1705
    iget-object v12, v1, Lh2/m;->z:Ln1/p;

    .line 1706
    .line 1707
    add-int/lit8 v13, v10, 0x1

    .line 1708
    .line 1709
    invoke-interface {v12, v10, v3}, Ln1/p;->track(II)Ln1/i0;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v10

    .line 1713
    invoke-direct {v7, v8, v14, v10}, Lh2/l;-><init>(Lh2/q;Lh2/t;Ln1/i0;)V

    .line 1714
    .line 1715
    .line 1716
    const-string v8, "audio/true-hd"

    .line 1717
    .line 1718
    iget-object v10, v2, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 1719
    .line 1720
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1721
    .line 1722
    .line 1723
    move-result v8

    .line 1724
    if-eqz v8, :cond_58

    .line 1725
    .line 1726
    mul-int/lit8 v8, v26, 0x10

    .line 1727
    .line 1728
    goto :goto_2d

    .line 1729
    :cond_58
    add-int/lit8 v8, v26, 0x1e

    .line 1730
    .line 1731
    :goto_2d
    invoke-virtual {v2}, Landroidx/media3/common/w;->a()Landroidx/media3/common/v;

    .line 1732
    .line 1733
    .line 1734
    move-result-object v10

    .line 1735
    iput v8, v10, Landroidx/media3/common/v;->n:I

    .line 1736
    .line 1737
    const/4 v8, 0x2

    .line 1738
    if-ne v3, v8, :cond_5d

    .line 1739
    .line 1740
    iget v8, v2, Landroidx/media3/common/w;->f:I

    .line 1741
    .line 1742
    and-int/lit8 v12, v20, 0x8

    .line 1743
    .line 1744
    if-eqz v12, :cond_5a

    .line 1745
    .line 1746
    const/4 v12, -0x1

    .line 1747
    if-ne v11, v12, :cond_59

    .line 1748
    .line 1749
    const/4 v12, 0x1

    .line 1750
    goto :goto_2e

    .line 1751
    :cond_59
    const/4 v12, 0x2

    .line 1752
    :goto_2e
    or-int/2addr v8, v12

    .line 1753
    :cond_5a
    iget v2, v2, Landroidx/media3/common/w;->w:F

    .line 1754
    .line 1755
    const/high16 v12, -0x40800000    # -1.0f

    .line 1756
    .line 1757
    cmpl-float v2, v2, v12

    .line 1758
    .line 1759
    if-nez v2, :cond_5b

    .line 1760
    .line 1761
    cmp-long v2, v5, v16

    .line 1762
    .line 1763
    if-lez v2, :cond_5b

    .line 1764
    .line 1765
    iget v2, v14, Lh2/t;->b:I

    .line 1766
    .line 1767
    if-lez v2, :cond_5b

    .line 1768
    .line 1769
    int-to-float v2, v2

    .line 1770
    long-to-float v5, v5

    .line 1771
    const v6, 0x49742400    # 1000000.0f

    .line 1772
    .line 1773
    .line 1774
    div-float/2addr v5, v6

    .line 1775
    div-float/2addr v2, v5

    .line 1776
    iput v2, v10, Landroidx/media3/common/v;->v:F

    .line 1777
    .line 1778
    :cond_5b
    iget-boolean v2, v1, Lh2/m;->x:Z

    .line 1779
    .line 1780
    if-eqz v2, :cond_5c

    .line 1781
    .line 1782
    const v2, 0x8000

    .line 1783
    .line 1784
    .line 1785
    or-int/2addr v8, v2

    .line 1786
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1787
    .line 1788
    .line 1789
    move-result-object v2

    .line 1790
    check-cast v2, Ljava/lang/Integer;

    .line 1791
    .line 1792
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1793
    .line 1794
    .line 1795
    move-result v2

    .line 1796
    iput v2, v10, Landroidx/media3/common/v;->g:I

    .line 1797
    .line 1798
    :cond_5c
    iput v8, v10, Landroidx/media3/common/v;->f:I

    .line 1799
    .line 1800
    :cond_5d
    const/4 v12, 0x1

    .line 1801
    move-object/from16 v6, v25

    .line 1802
    .line 1803
    if-ne v3, v12, :cond_5e

    .line 1804
    .line 1805
    iget v2, v6, Ln1/v;->a:I

    .line 1806
    .line 1807
    const/4 v12, -0x1

    .line 1808
    if-eq v2, v12, :cond_5e

    .line 1809
    .line 1810
    iget v5, v6, Ln1/v;->b:I

    .line 1811
    .line 1812
    if-eq v5, v12, :cond_5e

    .line 1813
    .line 1814
    iput v2, v10, Landroidx/media3/common/v;->E:I

    .line 1815
    .line 1816
    iput v5, v10, Landroidx/media3/common/v;->F:I

    .line 1817
    .line 1818
    :cond_5e
    iget-object v2, v1, Lh2/m;->i:Ljava/util/ArrayList;

    .line 1819
    .line 1820
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1821
    .line 1822
    .line 1823
    move-result v5

    .line 1824
    if-eqz v5, :cond_5f

    .line 1825
    .line 1826
    move-object/from16 v5, v21

    .line 1827
    .line 1828
    :goto_2f
    move-object/from16 v2, v19

    .line 1829
    .line 1830
    goto :goto_30

    .line 1831
    :cond_5f
    new-instance v5, Landroidx/media3/common/t0;

    .line 1832
    .line 1833
    invoke-direct {v5, v2}, Landroidx/media3/common/t0;-><init>(Ljava/util/List;)V

    .line 1834
    .line 1835
    .line 1836
    goto :goto_2f

    .line 1837
    :goto_30
    filled-new-array {v5, v0, v2}, [Landroidx/media3/common/t0;

    .line 1838
    .line 1839
    .line 1840
    move-result-object v5

    .line 1841
    new-instance v8, Landroidx/media3/common/t0;

    .line 1842
    .line 1843
    const/4 v14, 0x0

    .line 1844
    new-array v12, v14, [Landroidx/media3/common/s0;

    .line 1845
    .line 1846
    invoke-direct {v8, v12}, Landroidx/media3/common/t0;-><init>([Landroidx/media3/common/s0;)V

    .line 1847
    .line 1848
    .line 1849
    if-eqz v15, :cond_63

    .line 1850
    .line 1851
    const/4 v12, 0x0

    .line 1852
    :goto_31
    iget-object v14, v15, Landroidx/media3/common/t0;->j:[Landroidx/media3/common/s0;

    .line 1853
    .line 1854
    move-object/from16 v19, v0

    .line 1855
    .line 1856
    array-length v0, v14

    .line 1857
    if-ge v12, v0, :cond_64

    .line 1858
    .line 1859
    aget-object v0, v14, v12

    .line 1860
    .line 1861
    instance-of v14, v0, Li1/a;

    .line 1862
    .line 1863
    if-eqz v14, :cond_62

    .line 1864
    .line 1865
    check-cast v0, Li1/a;

    .line 1866
    .line 1867
    iget-object v14, v0, Li1/a;->j:Ljava/lang/String;

    .line 1868
    .line 1869
    move-object/from16 v25, v0

    .line 1870
    .line 1871
    const-string v0, "com.android.capture.fps"

    .line 1872
    .line 1873
    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1874
    .line 1875
    .line 1876
    move-result v0

    .line 1877
    if-eqz v0, :cond_61

    .line 1878
    .line 1879
    const/4 v14, 0x2

    .line 1880
    if-ne v3, v14, :cond_60

    .line 1881
    .line 1882
    const/4 v0, 0x1

    .line 1883
    new-array v14, v0, [Landroidx/media3/common/s0;

    .line 1884
    .line 1885
    const/16 v27, 0x0

    .line 1886
    .line 1887
    aput-object v25, v14, v27

    .line 1888
    .line 1889
    invoke-virtual {v8, v14}, Landroidx/media3/common/t0;->a([Landroidx/media3/common/s0;)Landroidx/media3/common/t0;

    .line 1890
    .line 1891
    .line 1892
    move-result-object v8

    .line 1893
    goto :goto_32

    .line 1894
    :cond_60
    const/16 v27, 0x0

    .line 1895
    .line 1896
    goto :goto_32

    .line 1897
    :cond_61
    const/4 v0, 0x1

    .line 1898
    const/16 v27, 0x0

    .line 1899
    .line 1900
    new-array v14, v0, [Landroidx/media3/common/s0;

    .line 1901
    .line 1902
    aput-object v25, v14, v27

    .line 1903
    .line 1904
    invoke-virtual {v8, v14}, Landroidx/media3/common/t0;->a([Landroidx/media3/common/s0;)Landroidx/media3/common/t0;

    .line 1905
    .line 1906
    .line 1907
    move-result-object v0

    .line 1908
    move-object v8, v0

    .line 1909
    :cond_62
    :goto_32
    add-int/lit8 v12, v12, 0x1

    .line 1910
    .line 1911
    move-object/from16 v0, v19

    .line 1912
    .line 1913
    goto :goto_31

    .line 1914
    :cond_63
    move-object/from16 v19, v0

    .line 1915
    .line 1916
    :cond_64
    const/4 v0, 0x0

    .line 1917
    const/4 v14, 0x3

    .line 1918
    :goto_33
    if-ge v0, v14, :cond_65

    .line 1919
    .line 1920
    aget-object v12, v5, v0

    .line 1921
    .line 1922
    invoke-virtual {v8, v12}, Landroidx/media3/common/t0;->b(Landroidx/media3/common/t0;)Landroidx/media3/common/t0;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v8

    .line 1926
    add-int/lit8 v0, v0, 0x1

    .line 1927
    .line 1928
    goto :goto_33

    .line 1929
    :cond_65
    iget-object v0, v8, Landroidx/media3/common/t0;->j:[Landroidx/media3/common/s0;

    .line 1930
    .line 1931
    array-length v0, v0

    .line 1932
    if-lez v0, :cond_66

    .line 1933
    .line 1934
    iput-object v8, v10, Landroidx/media3/common/v;->k:Landroidx/media3/common/t0;

    .line 1935
    .line 1936
    :cond_66
    new-instance v0, Landroidx/media3/common/w;

    .line 1937
    .line 1938
    invoke-direct {v0, v10}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 1939
    .line 1940
    .line 1941
    iget-object v5, v7, Lh2/l;->c:Ln1/i0;

    .line 1942
    .line 1943
    invoke-interface {v5, v0}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 1944
    .line 1945
    .line 1946
    const/4 v8, 0x2

    .line 1947
    const/4 v0, -0x1

    .line 1948
    if-ne v3, v8, :cond_67

    .line 1949
    .line 1950
    if-ne v11, v0, :cond_67

    .line 1951
    .line 1952
    invoke-virtual/range {v34 .. v34}, Ljava/util/ArrayList;->size()I

    .line 1953
    .line 1954
    .line 1955
    move-result v11

    .line 1956
    :cond_67
    move-object/from16 v3, v34

    .line 1957
    .line 1958
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1959
    .line 1960
    .line 1961
    move v10, v13

    .line 1962
    move-wide/from16 v12, v31

    .line 1963
    .line 1964
    :goto_34
    add-int/lit8 v9, v9, 0x1

    .line 1965
    .line 1966
    move-object/from16 v34, v3

    .line 1967
    .line 1968
    move-object/from16 v0, v19

    .line 1969
    .line 1970
    move-object/from16 v5, v24

    .line 1971
    .line 1972
    move-object v3, v2

    .line 1973
    move-object v2, v15

    .line 1974
    goto/16 :goto_2b

    .line 1975
    .line 1976
    :cond_68
    move-object/from16 v3, v34

    .line 1977
    .line 1978
    const/4 v0, -0x1

    .line 1979
    iput v11, v1, Lh2/m;->C:I

    .line 1980
    .line 1981
    iput-wide v12, v1, Lh2/m;->D:J

    .line 1982
    .line 1983
    const/4 v14, 0x0

    .line 1984
    new-array v2, v14, [Lh2/l;

    .line 1985
    .line 1986
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1987
    .line 1988
    .line 1989
    move-result-object v2

    .line 1990
    check-cast v2, [Lh2/l;

    .line 1991
    .line 1992
    iput-object v2, v1, Lh2/m;->A:[Lh2/l;

    .line 1993
    .line 1994
    array-length v3, v2

    .line 1995
    new-array v3, v3, [[J

    .line 1996
    .line 1997
    array-length v4, v2

    .line 1998
    new-array v4, v4, [I

    .line 1999
    .line 2000
    array-length v5, v2

    .line 2001
    new-array v5, v5, [J

    .line 2002
    .line 2003
    array-length v6, v2

    .line 2004
    new-array v6, v6, [Z

    .line 2005
    .line 2006
    const/4 v14, 0x0

    .line 2007
    :goto_35
    array-length v7, v2

    .line 2008
    if-ge v14, v7, :cond_69

    .line 2009
    .line 2010
    aget-object v7, v2, v14

    .line 2011
    .line 2012
    iget-object v7, v7, Lh2/l;->b:Lh2/t;

    .line 2013
    .line 2014
    iget v7, v7, Lh2/t;->b:I

    .line 2015
    .line 2016
    new-array v7, v7, [J

    .line 2017
    .line 2018
    aput-object v7, v3, v14

    .line 2019
    .line 2020
    aget-object v7, v2, v14

    .line 2021
    .line 2022
    iget-object v7, v7, Lh2/l;->b:Lh2/t;

    .line 2023
    .line 2024
    iget-object v7, v7, Lh2/t;->f:[J

    .line 2025
    .line 2026
    const/16 v27, 0x0

    .line 2027
    .line 2028
    aget-wide v8, v7, v27

    .line 2029
    .line 2030
    aput-wide v8, v5, v14

    .line 2031
    .line 2032
    add-int/lit8 v14, v14, 0x1

    .line 2033
    .line 2034
    goto :goto_35

    .line 2035
    :cond_69
    const/4 v14, 0x0

    .line 2036
    :goto_36
    array-length v7, v2

    .line 2037
    if-ge v14, v7, :cond_6d

    .line 2038
    .line 2039
    const-wide v7, 0x7fffffffffffffffL

    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    move v11, v0

    .line 2045
    const/4 v9, 0x0

    .line 2046
    :goto_37
    array-length v10, v2

    .line 2047
    if-ge v9, v10, :cond_6b

    .line 2048
    .line 2049
    aget-boolean v10, v6, v9

    .line 2050
    .line 2051
    if-nez v10, :cond_6a

    .line 2052
    .line 2053
    aget-wide v12, v5, v9

    .line 2054
    .line 2055
    cmp-long v10, v12, v7

    .line 2056
    .line 2057
    if-gtz v10, :cond_6a

    .line 2058
    .line 2059
    move v11, v9

    .line 2060
    move-wide v7, v12

    .line 2061
    :cond_6a
    add-int/lit8 v9, v9, 0x1

    .line 2062
    .line 2063
    goto :goto_37

    .line 2064
    :cond_6b
    aget v7, v4, v11

    .line 2065
    .line 2066
    aget-object v8, v3, v11

    .line 2067
    .line 2068
    aput-wide v16, v8, v7

    .line 2069
    .line 2070
    aget-object v9, v2, v11

    .line 2071
    .line 2072
    iget-object v9, v9, Lh2/l;->b:Lh2/t;

    .line 2073
    .line 2074
    iget-object v10, v9, Lh2/t;->d:[I

    .line 2075
    .line 2076
    aget v10, v10, v7

    .line 2077
    .line 2078
    int-to-long v12, v10

    .line 2079
    add-long v16, v16, v12

    .line 2080
    .line 2081
    const/16 v29, 0x1

    .line 2082
    .line 2083
    add-int/lit8 v7, v7, 0x1

    .line 2084
    .line 2085
    aput v7, v4, v11

    .line 2086
    .line 2087
    array-length v8, v8

    .line 2088
    if-ge v7, v8, :cond_6c

    .line 2089
    .line 2090
    iget-object v8, v9, Lh2/t;->f:[J

    .line 2091
    .line 2092
    aget-wide v7, v8, v7

    .line 2093
    .line 2094
    aput-wide v7, v5, v11

    .line 2095
    .line 2096
    goto :goto_36

    .line 2097
    :cond_6c
    aput-boolean v29, v6, v11

    .line 2098
    .line 2099
    add-int/lit8 v14, v14, 0x1

    .line 2100
    .line 2101
    goto :goto_36

    .line 2102
    :cond_6d
    iput-object v3, v1, Lh2/m;->B:[[J

    .line 2103
    .line 2104
    iget-object v0, v1, Lh2/m;->z:Ln1/p;

    .line 2105
    .line 2106
    invoke-interface {v0}, Ln1/p;->endTracks()V

    .line 2107
    .line 2108
    .line 2109
    iget-object v0, v1, Lh2/m;->z:Ln1/p;

    .line 2110
    .line 2111
    invoke-interface {v0, v1}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 2112
    .line 2113
    .line 2114
    :goto_38
    invoke-virtual/range {v30 .. v30}, Ljava/util/ArrayDeque;->clear()V

    .line 2115
    .line 2116
    .line 2117
    iget-boolean v0, v1, Lh2/m;->v:Z

    .line 2118
    .line 2119
    if-nez v0, :cond_0

    .line 2120
    .line 2121
    const/4 v14, 0x2

    .line 2122
    iput v14, v1, Lh2/m;->k:I

    .line 2123
    .line 2124
    goto/16 :goto_0

    .line 2125
    .line 2126
    :cond_6e
    move-object/from16 v30, v0

    .line 2127
    .line 2128
    invoke-virtual/range {v30 .. v30}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 2129
    .line 2130
    .line 2131
    move-result v0

    .line 2132
    if-nez v0, :cond_0

    .line 2133
    .line 2134
    invoke-virtual/range {v30 .. v30}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 2135
    .line 2136
    .line 2137
    move-result-object v0

    .line 2138
    check-cast v0, Li1/b;

    .line 2139
    .line 2140
    iget-object v0, v0, Li1/b;->e:Ljava/util/ArrayList;

    .line 2141
    .line 2142
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2143
    .line 2144
    .line 2145
    goto/16 :goto_0

    .line 2146
    .line 2147
    :cond_6f
    iget v0, v1, Lh2/m;->k:I

    .line 2148
    .line 2149
    const/4 v14, 0x2

    .line 2150
    if-eq v0, v14, :cond_70

    .line 2151
    .line 2152
    const/4 v14, 0x0

    .line 2153
    iput v14, v1, Lh2/m;->k:I

    .line 2154
    .line 2155
    iput v14, v1, Lh2/m;->n:I

    .line 2156
    .line 2157
    :cond_70
    return-void
.end method

.method public final getDurationUs()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lh2/m;->D:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getSeekPoints(J)Ln1/b0;
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-virtual {p0, v0, p1, p2}, Lh2/m;->c(IJ)Ln1/b0;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public final getSniffFailureDetails()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lh2/m;->j:Lf6/l1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final init(Ln1/p;)V
    .locals 2

    .line 1
    iget v0, p0, Lh2/m;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x10

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, La4/c;

    .line 8
    .line 9
    iget-object v1, p0, Lh2/m;->a:Lk2/o;

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, La4/c;-><init>(Ln1/p;Lk2/o;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v0

    .line 15
    :cond_0
    iput-object p1, p0, Lh2/m;->z:Ln1/p;

    .line 16
    .line 17
    return-void
.end method

.method public final isSeekable()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final read(Ln1/o;Ln1/a0;)I
    .locals 44

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    :cond_0
    iget v3, v1, Lh2/m;->k:I

    .line 8
    .line 9
    iget-object v5, v1, Lh2/m;->g:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    iget v6, v1, Lh2/m;->b:I

    .line 12
    .line 13
    iget-object v8, v1, Lh2/m;->e:Lh1/w;

    .line 14
    .line 15
    const/4 v11, 0x0

    .line 16
    const/4 v15, 0x4

    .line 17
    const-wide/16 v16, -0x1

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    const/4 v10, 0x2

    .line 21
    const/4 v4, 0x1

    .line 22
    if-eqz v3, :cond_45

    .line 23
    .line 24
    const-wide/32 v19, 0x40000

    .line 25
    .line 26
    .line 27
    if-eq v3, v4, :cond_36

    .line 28
    .line 29
    const-wide/16 v21, 0x8

    .line 30
    .line 31
    if-eq v3, v10, :cond_19

    .line 32
    .line 33
    const/4 v5, 0x3

    .line 34
    if-ne v3, v5, :cond_18

    .line 35
    .line 36
    iget-object v3, v1, Lh2/m;->h:Lh2/o;

    .line 37
    .line 38
    iget-object v6, v3, Lh2/o;->a:Ljava/util/ArrayList;

    .line 39
    .line 40
    iget v8, v3, Lh2/o;->b:I

    .line 41
    .line 42
    if-eqz v8, :cond_14

    .line 43
    .line 44
    if-eq v8, v4, :cond_12

    .line 45
    .line 46
    const/16 v7, 0xb01

    .line 47
    .line 48
    const/16 v12, 0xb00

    .line 49
    .line 50
    const/16 v4, 0x890

    .line 51
    .line 52
    if-eq v8, v10, :cond_d

    .line 53
    .line 54
    if-ne v8, v5, :cond_c

    .line 55
    .line 56
    invoke-interface {v0}, Ln1/o;->getPosition()J

    .line 57
    .line 58
    .line 59
    move-result-wide v16

    .line 60
    invoke-interface {v0}, Ln1/o;->getLength()J

    .line 61
    .line 62
    .line 63
    move-result-wide v18

    .line 64
    invoke-interface {v0}, Ln1/o;->getPosition()J

    .line 65
    .line 66
    .line 67
    move-result-wide v20

    .line 68
    sub-long v18, v18, v20

    .line 69
    .line 70
    iget v3, v3, Lh2/o;->c:I

    .line 71
    .line 72
    int-to-long v13, v3

    .line 73
    sub-long v13, v18, v13

    .line 74
    .line 75
    long-to-int v3, v13

    .line 76
    new-instance v13, Lh1/w;

    .line 77
    .line 78
    invoke-direct {v13, v3}, Lh1/w;-><init>(I)V

    .line 79
    .line 80
    .line 81
    iget-object v14, v13, Lh1/w;->a:[B

    .line 82
    .line 83
    invoke-interface {v0, v14, v9, v3}, Ln1/o;->readFully([BII)V

    .line 84
    .line 85
    .line 86
    move v0, v9

    .line 87
    :goto_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-ge v0, v3, :cond_b

    .line 92
    .line 93
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    check-cast v3, Lh2/n;

    .line 98
    .line 99
    iget-wide v8, v3, Lh2/n;->a:J

    .line 100
    .line 101
    sub-long v8, v8, v16

    .line 102
    .line 103
    long-to-int v8, v8

    .line 104
    invoke-virtual {v13, v8}, Lh1/w;->G(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v13, v15}, Lh1/w;->H(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v13}, Lh1/w;->i()I

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 115
    .line 116
    invoke-virtual {v13, v8, v9}, Lh1/w;->s(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v14

    .line 120
    invoke-virtual {v14}, Ljava/lang/String;->hashCode()I

    .line 121
    .line 122
    .line 123
    move-result v19

    .line 124
    move/from16 v28, v15

    .line 125
    .line 126
    sparse-switch v19, :sswitch_data_0

    .line 127
    .line 128
    .line 129
    :goto_1
    const/4 v14, -0x1

    .line 130
    goto :goto_3

    .line 131
    :sswitch_0
    const-string v15, "Super_SlowMotion_BGM"

    .line 132
    .line 133
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v14

    .line 137
    if-nez v14, :cond_1

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_1
    move/from16 v14, v28

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :sswitch_1
    const-string v15, "Super_SlowMotion_Deflickering_On"

    .line 144
    .line 145
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v14

    .line 149
    if-nez v14, :cond_2

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_2
    move v14, v5

    .line 153
    goto :goto_3

    .line 154
    :sswitch_2
    const-string v15, "Super_SlowMotion_Data"

    .line 155
    .line 156
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v14

    .line 160
    if-nez v14, :cond_3

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_3
    move v14, v10

    .line 164
    goto :goto_3

    .line 165
    :sswitch_3
    const-string v15, "Super_SlowMotion_Edit_Data"

    .line 166
    .line 167
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v14

    .line 171
    if-nez v14, :cond_4

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_4
    const/4 v14, 0x1

    .line 175
    goto :goto_3

    .line 176
    :sswitch_4
    const-string v15, "SlowMotion_Data"

    .line 177
    .line 178
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v14

    .line 182
    if-nez v14, :cond_5

    .line 183
    .line 184
    :goto_2
    goto :goto_1

    .line 185
    :cond_5
    const/4 v14, 0x0

    .line 186
    :goto_3
    packed-switch v14, :pswitch_data_0

    .line 187
    .line 188
    .line 189
    const-string v0, "Invalid SEF name"

    .line 190
    .line 191
    invoke-static {v0, v11}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    throw v0

    .line 196
    :pswitch_0
    move v14, v7

    .line 197
    goto :goto_4

    .line 198
    :pswitch_1
    const/16 v14, 0xb04

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :pswitch_2
    move v14, v12

    .line 202
    goto :goto_4

    .line 203
    :pswitch_3
    const/16 v14, 0xb03

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :pswitch_4
    move v14, v4

    .line 207
    :goto_4
    iget v3, v3, Lh2/n;->b:I

    .line 208
    .line 209
    add-int/lit8 v8, v8, 0x8

    .line 210
    .line 211
    sub-int/2addr v3, v8

    .line 212
    if-eq v14, v4, :cond_7

    .line 213
    .line 214
    if-eq v14, v12, :cond_a

    .line 215
    .line 216
    if-eq v14, v7, :cond_a

    .line 217
    .line 218
    const/16 v3, 0xb03

    .line 219
    .line 220
    if-eq v14, v3, :cond_a

    .line 221
    .line 222
    const/16 v8, 0xb04

    .line 223
    .line 224
    if-ne v14, v8, :cond_6

    .line 225
    .line 226
    goto/16 :goto_6

    .line 227
    .line 228
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 229
    .line 230
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 231
    .line 232
    .line 233
    throw v0

    .line 234
    :cond_7
    new-instance v15, Ljava/util/ArrayList;

    .line 235
    .line 236
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v13, v3, v9}, Lh1/w;->s(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    sget-object v9, Lh2/o;->e:La4/o;

    .line 244
    .line 245
    invoke-virtual {v9, v3}, La4/o;->g(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    const/4 v9, 0x0

    .line 250
    :goto_5
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 251
    .line 252
    .line 253
    move-result v14

    .line 254
    if-ge v9, v14, :cond_9

    .line 255
    .line 256
    sget-object v14, Lh2/o;->d:La4/o;

    .line 257
    .line 258
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v18

    .line 262
    move-object/from16 v8, v18

    .line 263
    .line 264
    check-cast v8, Ljava/lang/CharSequence;

    .line 265
    .line 266
    invoke-virtual {v14, v8}, La4/o;->g(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object v8

    .line 270
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 271
    .line 272
    .line 273
    move-result v14

    .line 274
    if-ne v14, v5, :cond_8

    .line 275
    .line 276
    const/4 v14, 0x0

    .line 277
    :try_start_0
    invoke-interface {v8, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v18

    .line 281
    check-cast v18, Ljava/lang/String;

    .line 282
    .line 283
    invoke-static/range {v18 .. v18}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 284
    .line 285
    .line 286
    move-result-wide v31

    .line 287
    const/4 v14, 0x1

    .line 288
    invoke-interface {v8, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v21

    .line 292
    check-cast v21, Ljava/lang/String;

    .line 293
    .line 294
    invoke-static/range {v21 .. v21}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 295
    .line 296
    .line 297
    move-result-wide v33

    .line 298
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v8

    .line 302
    check-cast v8, Ljava/lang/String;

    .line 303
    .line 304
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 305
    .line 306
    .line 307
    move-result v8

    .line 308
    const/16 v27, 0x1

    .line 309
    .line 310
    add-int/lit8 v8, v8, -0x1

    .line 311
    .line 312
    shl-int v30, v27, v8

    .line 313
    .line 314
    new-instance v29, Lc2/b;

    .line 315
    .line 316
    invoke-direct/range {v29 .. v34}, Lc2/b;-><init>(IJJ)V

    .line 317
    .line 318
    .line 319
    move-object/from16 v8, v29

    .line 320
    .line 321
    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 322
    .line 323
    .line 324
    add-int/lit8 v9, v9, 0x1

    .line 325
    .line 326
    goto :goto_5

    .line 327
    :catch_0
    move-exception v0

    .line 328
    invoke-static {v11, v0}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    throw v0

    .line 333
    :cond_8
    invoke-static {v11, v11}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    throw v0

    .line 338
    :cond_9
    new-instance v3, Lc2/c;

    .line 339
    .line 340
    invoke-direct {v3, v15}, Lc2/c;-><init>(Ljava/util/ArrayList;)V

    .line 341
    .line 342
    .line 343
    iget-object v8, v1, Lh2/m;->i:Ljava/util/ArrayList;

    .line 344
    .line 345
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    :cond_a
    :goto_6
    add-int/lit8 v0, v0, 0x1

    .line 349
    .line 350
    move/from16 v15, v28

    .line 351
    .line 352
    const/4 v9, 0x0

    .line 353
    goto/16 :goto_0

    .line 354
    .line 355
    :cond_b
    const-wide/16 v8, 0x0

    .line 356
    .line 357
    iput-wide v8, v2, Ln1/a0;->a:J

    .line 358
    .line 359
    :goto_7
    const/4 v0, 0x1

    .line 360
    goto/16 :goto_c

    .line 361
    .line 362
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 363
    .line 364
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 365
    .line 366
    .line 367
    throw v0

    .line 368
    :cond_d
    invoke-interface {v0}, Ln1/o;->getLength()J

    .line 369
    .line 370
    .line 371
    move-result-wide v8

    .line 372
    iget v11, v3, Lh2/o;->c:I

    .line 373
    .line 374
    add-int/lit8 v11, v11, -0x14

    .line 375
    .line 376
    new-instance v13, Lh1/w;

    .line 377
    .line 378
    invoke-direct {v13, v11}, Lh1/w;-><init>(I)V

    .line 379
    .line 380
    .line 381
    iget-object v14, v13, Lh1/w;->a:[B

    .line 382
    .line 383
    const/4 v15, 0x0

    .line 384
    invoke-interface {v0, v14, v15, v11}, Ln1/o;->readFully([BII)V

    .line 385
    .line 386
    .line 387
    const/4 v0, 0x0

    .line 388
    :goto_8
    div-int/lit8 v15, v11, 0xc

    .line 389
    .line 390
    if-ge v0, v15, :cond_10

    .line 391
    .line 392
    invoke-virtual {v13, v10}, Lh1/w;->H(I)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v13}, Lh1/w;->k()S

    .line 396
    .line 397
    .line 398
    move-result v15

    .line 399
    if-eq v15, v4, :cond_e

    .line 400
    .line 401
    if-eq v15, v12, :cond_e

    .line 402
    .line 403
    if-eq v15, v7, :cond_e

    .line 404
    .line 405
    const/16 v4, 0xb03

    .line 406
    .line 407
    if-eq v15, v4, :cond_e

    .line 408
    .line 409
    const/16 v4, 0xb04

    .line 410
    .line 411
    if-eq v15, v4, :cond_f

    .line 412
    .line 413
    const/16 v15, 0x8

    .line 414
    .line 415
    invoke-virtual {v13, v15}, Lh1/w;->H(I)V

    .line 416
    .line 417
    .line 418
    move-wide/from16 v18, v8

    .line 419
    .line 420
    move-object/from16 v21, v13

    .line 421
    .line 422
    goto :goto_9

    .line 423
    :cond_e
    const/16 v4, 0xb04

    .line 424
    .line 425
    :cond_f
    iget v15, v3, Lh2/o;->c:I

    .line 426
    .line 427
    move-wide/from16 v18, v8

    .line 428
    .line 429
    int-to-long v7, v15

    .line 430
    sub-long v8, v18, v7

    .line 431
    .line 432
    invoke-virtual {v13}, Lh1/w;->i()I

    .line 433
    .line 434
    .line 435
    move-result v7

    .line 436
    move-object/from16 v21, v13

    .line 437
    .line 438
    int-to-long v12, v7

    .line 439
    sub-long/2addr v8, v12

    .line 440
    invoke-virtual/range {v21 .. v21}, Lh1/w;->i()I

    .line 441
    .line 442
    .line 443
    move-result v7

    .line 444
    new-instance v12, Lh2/n;

    .line 445
    .line 446
    invoke-direct {v12, v8, v9, v7}, Lh2/n;-><init>(JI)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    :goto_9
    add-int/lit8 v0, v0, 0x1

    .line 453
    .line 454
    move-wide/from16 v8, v18

    .line 455
    .line 456
    move-object/from16 v13, v21

    .line 457
    .line 458
    const/16 v4, 0x890

    .line 459
    .line 460
    const/16 v7, 0xb01

    .line 461
    .line 462
    const/16 v12, 0xb00

    .line 463
    .line 464
    goto :goto_8

    .line 465
    :cond_10
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    if-eqz v0, :cond_11

    .line 470
    .line 471
    const-wide/16 v8, 0x0

    .line 472
    .line 473
    iput-wide v8, v2, Ln1/a0;->a:J

    .line 474
    .line 475
    const/4 v14, 0x0

    .line 476
    goto :goto_7

    .line 477
    :cond_11
    iput v5, v3, Lh2/o;->b:I

    .line 478
    .line 479
    const/4 v14, 0x0

    .line 480
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    check-cast v0, Lh2/n;

    .line 485
    .line 486
    iget-wide v3, v0, Lh2/n;->a:J

    .line 487
    .line 488
    iput-wide v3, v2, Ln1/a0;->a:J

    .line 489
    .line 490
    goto/16 :goto_7

    .line 491
    .line 492
    :cond_12
    move v14, v9

    .line 493
    new-instance v4, Lh1/w;

    .line 494
    .line 495
    const/16 v15, 0x8

    .line 496
    .line 497
    invoke-direct {v4, v15}, Lh1/w;-><init>(I)V

    .line 498
    .line 499
    .line 500
    iget-object v5, v4, Lh1/w;->a:[B

    .line 501
    .line 502
    invoke-interface {v0, v5, v14, v15}, Ln1/o;->readFully([BII)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v4}, Lh1/w;->i()I

    .line 506
    .line 507
    .line 508
    move-result v5

    .line 509
    add-int/2addr v5, v15

    .line 510
    iput v5, v3, Lh2/o;->c:I

    .line 511
    .line 512
    invoke-virtual {v4}, Lh1/w;->g()I

    .line 513
    .line 514
    .line 515
    move-result v4

    .line 516
    const v5, 0x53454654

    .line 517
    .line 518
    .line 519
    if-eq v4, v5, :cond_13

    .line 520
    .line 521
    const-wide/16 v8, 0x0

    .line 522
    .line 523
    iput-wide v8, v2, Ln1/a0;->a:J

    .line 524
    .line 525
    goto/16 :goto_7

    .line 526
    .line 527
    :cond_13
    invoke-interface {v0}, Ln1/o;->getPosition()J

    .line 528
    .line 529
    .line 530
    move-result-wide v4

    .line 531
    iget v0, v3, Lh2/o;->c:I

    .line 532
    .line 533
    add-int/lit8 v0, v0, -0xc

    .line 534
    .line 535
    int-to-long v6, v0

    .line 536
    sub-long/2addr v4, v6

    .line 537
    iput-wide v4, v2, Ln1/a0;->a:J

    .line 538
    .line 539
    iput v10, v3, Lh2/o;->b:I

    .line 540
    .line 541
    goto/16 :goto_7

    .line 542
    .line 543
    :cond_14
    invoke-interface {v0}, Ln1/o;->getLength()J

    .line 544
    .line 545
    .line 546
    move-result-wide v4

    .line 547
    cmp-long v0, v4, v16

    .line 548
    .line 549
    if-eqz v0, :cond_16

    .line 550
    .line 551
    cmp-long v0, v4, v21

    .line 552
    .line 553
    if-gez v0, :cond_15

    .line 554
    .line 555
    goto :goto_a

    .line 556
    :cond_15
    sub-long v4, v4, v21

    .line 557
    .line 558
    goto :goto_b

    .line 559
    :cond_16
    :goto_a
    const-wide/16 v4, 0x0

    .line 560
    .line 561
    :goto_b
    iput-wide v4, v2, Ln1/a0;->a:J

    .line 562
    .line 563
    const/4 v0, 0x1

    .line 564
    iput v0, v3, Lh2/o;->b:I

    .line 565
    .line 566
    :goto_c
    iget-wide v2, v2, Ln1/a0;->a:J

    .line 567
    .line 568
    const-wide/16 v25, 0x0

    .line 569
    .line 570
    cmp-long v2, v2, v25

    .line 571
    .line 572
    if-nez v2, :cond_17

    .line 573
    .line 574
    const/4 v14, 0x0

    .line 575
    iput v14, v1, Lh2/m;->k:I

    .line 576
    .line 577
    iput v14, v1, Lh2/m;->n:I

    .line 578
    .line 579
    return v0

    .line 580
    :cond_17
    move v9, v0

    .line 581
    goto/16 :goto_1e

    .line 582
    .line 583
    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 584
    .line 585
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 586
    .line 587
    .line 588
    throw v0

    .line 589
    :cond_19
    move/from16 v28, v15

    .line 590
    .line 591
    invoke-interface {v0}, Ln1/o;->getPosition()J

    .line 592
    .line 593
    .line 594
    move-result-wide v3

    .line 595
    iget v5, v1, Lh2/m;->p:I

    .line 596
    .line 597
    const/4 v7, -0x1

    .line 598
    if-ne v5, v7, :cond_24

    .line 599
    .line 600
    const/4 v5, 0x0

    .line 601
    const/4 v7, -0x1

    .line 602
    const/4 v9, -0x1

    .line 603
    const/4 v12, 0x1

    .line 604
    const/4 v15, 0x1

    .line 605
    const-wide v16, 0x7fffffffffffffffL

    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    const-wide v29, 0x7fffffffffffffffL

    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    const-wide v31, 0x7fffffffffffffffL

    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    const-wide v33, 0x7fffffffffffffffL

    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    :goto_d
    iget-object v13, v1, Lh2/m;->A:[Lh2/l;

    .line 626
    .line 627
    array-length v14, v13

    .line 628
    if-ge v5, v14, :cond_21

    .line 629
    .line 630
    aget-object v13, v13, v5

    .line 631
    .line 632
    iget v14, v13, Lh2/l;->e:I

    .line 633
    .line 634
    iget-object v13, v13, Lh2/l;->b:Lh2/t;

    .line 635
    .line 636
    move/from16 v35, v10

    .line 637
    .line 638
    iget v10, v13, Lh2/t;->b:I

    .line 639
    .line 640
    if-ne v14, v10, :cond_1a

    .line 641
    .line 642
    goto :goto_10

    .line 643
    :cond_1a
    iget-object v10, v13, Lh2/t;->c:[J

    .line 644
    .line 645
    aget-wide v36, v10, v14

    .line 646
    .line 647
    iget-object v10, v1, Lh2/m;->B:[[J

    .line 648
    .line 649
    sget v13, Lh1/i0;->a:I

    .line 650
    .line 651
    aget-object v10, v10, v5

    .line 652
    .line 653
    aget-wide v13, v10, v14

    .line 654
    .line 655
    sub-long v36, v36, v3

    .line 656
    .line 657
    const-wide/16 v25, 0x0

    .line 658
    .line 659
    cmp-long v10, v36, v25

    .line 660
    .line 661
    if-ltz v10, :cond_1c

    .line 662
    .line 663
    cmp-long v10, v36, v19

    .line 664
    .line 665
    if-ltz v10, :cond_1b

    .line 666
    .line 667
    goto :goto_e

    .line 668
    :cond_1b
    const/4 v10, 0x0

    .line 669
    goto :goto_f

    .line 670
    :cond_1c
    :goto_e
    const/4 v10, 0x1

    .line 671
    :goto_f
    if-nez v10, :cond_1d

    .line 672
    .line 673
    if-nez v12, :cond_1e

    .line 674
    .line 675
    :cond_1d
    if-ne v10, v12, :cond_1f

    .line 676
    .line 677
    cmp-long v24, v36, v33

    .line 678
    .line 679
    if-gez v24, :cond_1f

    .line 680
    .line 681
    :cond_1e
    move v9, v5

    .line 682
    move v12, v10

    .line 683
    move-wide/from16 v31, v13

    .line 684
    .line 685
    move-wide/from16 v33, v36

    .line 686
    .line 687
    :cond_1f
    cmp-long v24, v13, v29

    .line 688
    .line 689
    if-gez v24, :cond_20

    .line 690
    .line 691
    move v7, v5

    .line 692
    move v15, v10

    .line 693
    move-wide/from16 v29, v13

    .line 694
    .line 695
    :cond_20
    :goto_10
    add-int/lit8 v5, v5, 0x1

    .line 696
    .line 697
    move/from16 v10, v35

    .line 698
    .line 699
    goto :goto_d

    .line 700
    :cond_21
    move/from16 v35, v10

    .line 701
    .line 702
    cmp-long v5, v29, v16

    .line 703
    .line 704
    if-eqz v5, :cond_22

    .line 705
    .line 706
    if-eqz v15, :cond_22

    .line 707
    .line 708
    const-wide/32 v12, 0xa00000

    .line 709
    .line 710
    .line 711
    add-long v29, v29, v12

    .line 712
    .line 713
    cmp-long v5, v31, v29

    .line 714
    .line 715
    if-gez v5, :cond_23

    .line 716
    .line 717
    :cond_22
    move v7, v9

    .line 718
    :cond_23
    iput v7, v1, Lh2/m;->p:I

    .line 719
    .line 720
    const/4 v5, -0x1

    .line 721
    if-ne v7, v5, :cond_25

    .line 722
    .line 723
    move/from16 v23, v5

    .line 724
    .line 725
    goto/16 :goto_27

    .line 726
    .line 727
    :cond_24
    move/from16 v35, v10

    .line 728
    .line 729
    :cond_25
    iget-object v5, v1, Lh2/m;->A:[Lh2/l;

    .line 730
    .line 731
    iget v7, v1, Lh2/m;->p:I

    .line 732
    .line 733
    aget-object v5, v5, v7

    .line 734
    .line 735
    iget-object v7, v5, Lh2/l;->c:Ln1/i0;

    .line 736
    .line 737
    iget-object v9, v5, Lh2/l;->a:Lh2/q;

    .line 738
    .line 739
    iget-object v10, v5, Lh2/l;->b:Lh2/t;

    .line 740
    .line 741
    iget v12, v5, Lh2/l;->e:I

    .line 742
    .line 743
    iget-object v13, v10, Lh2/t;->c:[J

    .line 744
    .line 745
    aget-wide v14, v13, v12

    .line 746
    .line 747
    move/from16 v16, v12

    .line 748
    .line 749
    iget-wide v11, v1, Lh2/m;->y:J

    .line 750
    .line 751
    add-long/2addr v14, v11

    .line 752
    iget-object v11, v10, Lh2/t;->d:[I

    .line 753
    .line 754
    aget v11, v11, v16

    .line 755
    .line 756
    iget-object v12, v5, Lh2/l;->d:Ln1/j0;

    .line 757
    .line 758
    sub-long v3, v14, v3

    .line 759
    .line 760
    iget v13, v1, Lh2/m;->q:I

    .line 761
    .line 762
    move-wide/from16 v29, v3

    .line 763
    .line 764
    int-to-long v3, v13

    .line 765
    add-long v3, v29, v3

    .line 766
    .line 767
    const-wide/16 v25, 0x0

    .line 768
    .line 769
    cmp-long v13, v3, v25

    .line 770
    .line 771
    if-ltz v13, :cond_35

    .line 772
    .line 773
    cmp-long v13, v3, v19

    .line 774
    .line 775
    if-ltz v13, :cond_26

    .line 776
    .line 777
    goto/16 :goto_17

    .line 778
    .line 779
    :cond_26
    iget v2, v9, Lh2/q;->h:I

    .line 780
    .line 781
    iget-object v15, v9, Lh2/q;->g:Landroidx/media3/common/w;

    .line 782
    .line 783
    const/4 v14, 0x1

    .line 784
    if-ne v2, v14, :cond_27

    .line 785
    .line 786
    add-long v3, v3, v21

    .line 787
    .line 788
    add-int/lit8 v11, v11, -0x8

    .line 789
    .line 790
    :cond_27
    long-to-int v2, v3

    .line 791
    invoke-interface {v0, v2}, Ln1/o;->h(I)V

    .line 792
    .line 793
    .line 794
    iget-object v2, v15, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 795
    .line 796
    const-string v3, "video/avc"

    .line 797
    .line 798
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 799
    .line 800
    .line 801
    move-result v2

    .line 802
    const/4 v14, 0x1

    .line 803
    if-nez v2, :cond_28

    .line 804
    .line 805
    iput-boolean v14, v1, Lh2/m;->t:Z

    .line 806
    .line 807
    :cond_28
    iget v2, v9, Lh2/q;->k:I

    .line 808
    .line 809
    if-eqz v2, :cond_2d

    .line 810
    .line 811
    iget-object v3, v1, Lh2/m;->d:Lh1/w;

    .line 812
    .line 813
    iget-object v4, v3, Lh1/w;->a:[B

    .line 814
    .line 815
    const/16 v18, 0x0

    .line 816
    .line 817
    aput-byte v18, v4, v18

    .line 818
    .line 819
    aput-byte v18, v4, v14

    .line 820
    .line 821
    aput-byte v18, v4, v35

    .line 822
    .line 823
    add-int/lit8 v8, v2, 0x1

    .line 824
    .line 825
    rsub-int/lit8 v15, v2, 0x4

    .line 826
    .line 827
    :goto_11
    iget v2, v1, Lh2/m;->r:I

    .line 828
    .line 829
    if-ge v2, v11, :cond_2c

    .line 830
    .line 831
    iget v2, v1, Lh2/m;->s:I

    .line 832
    .line 833
    if-nez v2, :cond_2b

    .line 834
    .line 835
    invoke-interface {v0, v4, v15, v8}, Ln1/o;->readFully([BII)V

    .line 836
    .line 837
    .line 838
    iget v2, v1, Lh2/m;->q:I

    .line 839
    .line 840
    add-int/2addr v2, v8

    .line 841
    iput v2, v1, Lh2/m;->q:I

    .line 842
    .line 843
    const/4 v14, 0x0

    .line 844
    invoke-virtual {v3, v14}, Lh1/w;->G(I)V

    .line 845
    .line 846
    .line 847
    invoke-virtual {v3}, Lh1/w;->g()I

    .line 848
    .line 849
    .line 850
    move-result v2

    .line 851
    const/4 v9, 0x1

    .line 852
    if-lt v2, v9, :cond_2a

    .line 853
    .line 854
    add-int/lit8 v2, v2, -0x1

    .line 855
    .line 856
    iput v2, v1, Lh2/m;->s:I

    .line 857
    .line 858
    iget-object v2, v1, Lh2/m;->c:Lh1/w;

    .line 859
    .line 860
    invoke-virtual {v2, v14}, Lh1/w;->G(I)V

    .line 861
    .line 862
    .line 863
    move/from16 v13, v28

    .line 864
    .line 865
    invoke-interface {v7, v2, v13}, Ln1/i0;->sampleData(Lh1/w;I)V

    .line 866
    .line 867
    .line 868
    invoke-interface {v7, v3, v9}, Ln1/i0;->sampleData(Lh1/w;I)V

    .line 869
    .line 870
    .line 871
    iget v2, v1, Lh2/m;->r:I

    .line 872
    .line 873
    add-int/lit8 v2, v2, 0x5

    .line 874
    .line 875
    iput v2, v1, Lh2/m;->r:I

    .line 876
    .line 877
    add-int/2addr v11, v15

    .line 878
    iget-boolean v2, v1, Lh2/m;->t:Z

    .line 879
    .line 880
    if-nez v2, :cond_29

    .line 881
    .line 882
    aget-byte v2, v4, v13

    .line 883
    .line 884
    invoke-static {v2}, Li1/p;->c(B)Z

    .line 885
    .line 886
    .line 887
    move-result v2

    .line 888
    if-eqz v2, :cond_29

    .line 889
    .line 890
    iput-boolean v9, v1, Lh2/m;->t:Z

    .line 891
    .line 892
    :cond_29
    :goto_12
    const/16 v28, 0x4

    .line 893
    .line 894
    goto :goto_11

    .line 895
    :cond_2a
    const-string v0, "Invalid NAL length"

    .line 896
    .line 897
    const/4 v13, 0x0

    .line 898
    invoke-static {v0, v13}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    throw v0

    .line 903
    :cond_2b
    const/4 v14, 0x0

    .line 904
    invoke-interface {v7, v0, v2, v14}, Ln1/i0;->sampleData(Landroidx/media3/common/m;IZ)I

    .line 905
    .line 906
    .line 907
    move-result v2

    .line 908
    iget v9, v1, Lh2/m;->q:I

    .line 909
    .line 910
    add-int/2addr v9, v2

    .line 911
    iput v9, v1, Lh2/m;->q:I

    .line 912
    .line 913
    iget v9, v1, Lh2/m;->r:I

    .line 914
    .line 915
    add-int/2addr v9, v2

    .line 916
    iput v9, v1, Lh2/m;->r:I

    .line 917
    .line 918
    iget v9, v1, Lh2/m;->s:I

    .line 919
    .line 920
    sub-int/2addr v9, v2

    .line 921
    iput v9, v1, Lh2/m;->s:I

    .line 922
    .line 923
    goto :goto_12

    .line 924
    :cond_2c
    move/from16 v40, v11

    .line 925
    .line 926
    goto :goto_14

    .line 927
    :cond_2d
    const-string v2, "audio/ac4"

    .line 928
    .line 929
    iget-object v3, v15, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 930
    .line 931
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 932
    .line 933
    .line 934
    move-result v2

    .line 935
    if-eqz v2, :cond_2f

    .line 936
    .line 937
    iget v2, v1, Lh2/m;->r:I

    .line 938
    .line 939
    if-nez v2, :cond_2e

    .line 940
    .line 941
    invoke-static {v8, v11}, Ln1/b;->h(Lh1/w;I)V

    .line 942
    .line 943
    .line 944
    const/4 v2, 0x7

    .line 945
    invoke-interface {v7, v8, v2}, Ln1/i0;->sampleData(Lh1/w;I)V

    .line 946
    .line 947
    .line 948
    iget v3, v1, Lh2/m;->r:I

    .line 949
    .line 950
    add-int/2addr v3, v2

    .line 951
    iput v3, v1, Lh2/m;->r:I

    .line 952
    .line 953
    :cond_2e
    add-int/lit8 v11, v11, 0x7

    .line 954
    .line 955
    goto :goto_13

    .line 956
    :cond_2f
    if-eqz v12, :cond_30

    .line 957
    .line 958
    invoke-virtual {v12, v0}, Ln1/j0;->c(Ln1/o;)V

    .line 959
    .line 960
    .line 961
    :cond_30
    :goto_13
    iget v2, v1, Lh2/m;->r:I

    .line 962
    .line 963
    if-ge v2, v11, :cond_2c

    .line 964
    .line 965
    sub-int v2, v11, v2

    .line 966
    .line 967
    const/4 v14, 0x0

    .line 968
    invoke-interface {v7, v0, v2, v14}, Ln1/i0;->sampleData(Landroidx/media3/common/m;IZ)I

    .line 969
    .line 970
    .line 971
    move-result v2

    .line 972
    iget v3, v1, Lh2/m;->q:I

    .line 973
    .line 974
    add-int/2addr v3, v2

    .line 975
    iput v3, v1, Lh2/m;->q:I

    .line 976
    .line 977
    iget v3, v1, Lh2/m;->r:I

    .line 978
    .line 979
    add-int/2addr v3, v2

    .line 980
    iput v3, v1, Lh2/m;->r:I

    .line 981
    .line 982
    iget v3, v1, Lh2/m;->s:I

    .line 983
    .line 984
    sub-int/2addr v3, v2

    .line 985
    iput v3, v1, Lh2/m;->s:I

    .line 986
    .line 987
    goto :goto_13

    .line 988
    :goto_14
    iget-object v0, v10, Lh2/t;->f:[J

    .line 989
    .line 990
    aget-wide v37, v0, v16

    .line 991
    .line 992
    iget-object v0, v10, Lh2/t;->g:[I

    .line 993
    .line 994
    aget v0, v0, v16

    .line 995
    .line 996
    iget-boolean v2, v1, Lh2/m;->t:Z

    .line 997
    .line 998
    if-nez v2, :cond_31

    .line 999
    .line 1000
    const/high16 v2, 0x4000000

    .line 1001
    .line 1002
    or-int/2addr v0, v2

    .line 1003
    :cond_31
    move/from16 v39, v0

    .line 1004
    .line 1005
    if-eqz v12, :cond_32

    .line 1006
    .line 1007
    const/16 v42, 0x0

    .line 1008
    .line 1009
    const/16 v43, 0x0

    .line 1010
    .line 1011
    move-object/from16 v36, v12

    .line 1012
    .line 1013
    move/from16 v41, v40

    .line 1014
    .line 1015
    move/from16 v40, v39

    .line 1016
    .line 1017
    move-wide/from16 v38, v37

    .line 1018
    .line 1019
    move-object/from16 v37, v7

    .line 1020
    .line 1021
    invoke-virtual/range {v36 .. v43}, Ln1/j0;->b(Ln1/i0;JIIILn1/h0;)V

    .line 1022
    .line 1023
    .line 1024
    move-object/from16 v2, v36

    .line 1025
    .line 1026
    move-object/from16 v0, v37

    .line 1027
    .line 1028
    const/16 v27, 0x1

    .line 1029
    .line 1030
    add-int/lit8 v12, v16, 0x1

    .line 1031
    .line 1032
    iget v3, v10, Lh2/t;->b:I

    .line 1033
    .line 1034
    if-ne v12, v3, :cond_33

    .line 1035
    .line 1036
    const/4 v13, 0x0

    .line 1037
    invoke-virtual {v2, v0, v13}, Ln1/j0;->a(Ln1/i0;Ln1/h0;)V

    .line 1038
    .line 1039
    .line 1040
    goto :goto_15

    .line 1041
    :cond_32
    move-object v0, v7

    .line 1042
    const/16 v27, 0x1

    .line 1043
    .line 1044
    const/16 v41, 0x0

    .line 1045
    .line 1046
    const/16 v42, 0x0

    .line 1047
    .line 1048
    move-object/from16 v36, v0

    .line 1049
    .line 1050
    invoke-interface/range {v36 .. v42}, Ln1/i0;->sampleMetadata(JIIILn1/h0;)V

    .line 1051
    .line 1052
    .line 1053
    :cond_33
    :goto_15
    iget v0, v5, Lh2/l;->e:I

    .line 1054
    .line 1055
    add-int/lit8 v0, v0, 0x1

    .line 1056
    .line 1057
    iput v0, v5, Lh2/l;->e:I

    .line 1058
    .line 1059
    const/4 v5, -0x1

    .line 1060
    iput v5, v1, Lh2/m;->p:I

    .line 1061
    .line 1062
    const/4 v14, 0x0

    .line 1063
    iput v14, v1, Lh2/m;->q:I

    .line 1064
    .line 1065
    iput v14, v1, Lh2/m;->r:I

    .line 1066
    .line 1067
    iput v14, v1, Lh2/m;->s:I

    .line 1068
    .line 1069
    and-int/lit8 v0, v6, 0x20

    .line 1070
    .line 1071
    if-nez v0, :cond_34

    .line 1072
    .line 1073
    const/4 v4, 0x1

    .line 1074
    goto :goto_16

    .line 1075
    :cond_34
    move v4, v14

    .line 1076
    :goto_16
    iput-boolean v4, v1, Lh2/m;->t:Z

    .line 1077
    .line 1078
    return v14

    .line 1079
    :cond_35
    :goto_17
    iput-wide v14, v2, Ln1/a0;->a:J

    .line 1080
    .line 1081
    const/16 v27, 0x1

    .line 1082
    .line 1083
    return v27

    .line 1084
    :cond_36
    move/from16 v35, v10

    .line 1085
    .line 1086
    iget-wide v3, v1, Lh2/m;->m:J

    .line 1087
    .line 1088
    iget v6, v1, Lh2/m;->n:I

    .line 1089
    .line 1090
    int-to-long v6, v6

    .line 1091
    sub-long/2addr v3, v6

    .line 1092
    invoke-interface {v0}, Ln1/o;->getPosition()J

    .line 1093
    .line 1094
    .line 1095
    move-result-wide v6

    .line 1096
    add-long/2addr v6, v3

    .line 1097
    iget-object v8, v1, Lh2/m;->o:Lh1/w;

    .line 1098
    .line 1099
    if-eqz v8, :cond_3f

    .line 1100
    .line 1101
    iget-object v9, v8, Lh1/w;->a:[B

    .line 1102
    .line 1103
    iget v10, v1, Lh2/m;->n:I

    .line 1104
    .line 1105
    long-to-int v3, v3

    .line 1106
    invoke-interface {v0, v9, v10, v3}, Ln1/o;->readFully([BII)V

    .line 1107
    .line 1108
    .line 1109
    iget v3, v1, Lh2/m;->l:I

    .line 1110
    .line 1111
    const v4, 0x66747970

    .line 1112
    .line 1113
    .line 1114
    if-ne v3, v4, :cond_3e

    .line 1115
    .line 1116
    const/4 v9, 0x1

    .line 1117
    iput-boolean v9, v1, Lh2/m;->u:Z

    .line 1118
    .line 1119
    const/16 v15, 0x8

    .line 1120
    .line 1121
    invoke-virtual {v8, v15}, Lh1/w;->G(I)V

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v8}, Lh1/w;->g()I

    .line 1125
    .line 1126
    .line 1127
    move-result v3

    .line 1128
    const v4, 0x71742020

    .line 1129
    .line 1130
    .line 1131
    const v5, 0x68656963

    .line 1132
    .line 1133
    .line 1134
    if-eq v3, v5, :cond_38

    .line 1135
    .line 1136
    if-eq v3, v4, :cond_37

    .line 1137
    .line 1138
    const/4 v3, 0x0

    .line 1139
    goto :goto_18

    .line 1140
    :cond_37
    const/4 v3, 0x1

    .line 1141
    goto :goto_18

    .line 1142
    :cond_38
    move/from16 v3, v35

    .line 1143
    .line 1144
    :goto_18
    if-eqz v3, :cond_39

    .line 1145
    .line 1146
    goto :goto_1a

    .line 1147
    :cond_39
    const/4 v13, 0x4

    .line 1148
    invoke-virtual {v8, v13}, Lh1/w;->H(I)V

    .line 1149
    .line 1150
    .line 1151
    :cond_3a
    invoke-virtual {v8}, Lh1/w;->a()I

    .line 1152
    .line 1153
    .line 1154
    move-result v3

    .line 1155
    if-lez v3, :cond_3d

    .line 1156
    .line 1157
    invoke-virtual {v8}, Lh1/w;->g()I

    .line 1158
    .line 1159
    .line 1160
    move-result v3

    .line 1161
    if-eq v3, v5, :cond_3c

    .line 1162
    .line 1163
    if-eq v3, v4, :cond_3b

    .line 1164
    .line 1165
    const/4 v3, 0x0

    .line 1166
    goto :goto_19

    .line 1167
    :cond_3b
    const/4 v3, 0x1

    .line 1168
    goto :goto_19

    .line 1169
    :cond_3c
    move/from16 v3, v35

    .line 1170
    .line 1171
    :goto_19
    if-eqz v3, :cond_3a

    .line 1172
    .line 1173
    goto :goto_1a

    .line 1174
    :cond_3d
    const/4 v3, 0x0

    .line 1175
    :goto_1a
    iput v3, v1, Lh2/m;->E:I

    .line 1176
    .line 1177
    goto :goto_1b

    .line 1178
    :cond_3e
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1179
    .line 1180
    .line 1181
    move-result v3

    .line 1182
    if-nez v3, :cond_41

    .line 1183
    .line 1184
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v3

    .line 1188
    check-cast v3, Li1/b;

    .line 1189
    .line 1190
    new-instance v4, Li1/c;

    .line 1191
    .line 1192
    iget v5, v1, Lh2/m;->l:I

    .line 1193
    .line 1194
    invoke-direct {v4, v8, v5}, Li1/c;-><init>(Lh1/w;I)V

    .line 1195
    .line 1196
    .line 1197
    iget-object v3, v3, Li1/b;->d:Ljava/util/ArrayList;

    .line 1198
    .line 1199
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1200
    .line 1201
    .line 1202
    goto :goto_1b

    .line 1203
    :cond_3f
    iget-boolean v5, v1, Lh2/m;->u:Z

    .line 1204
    .line 1205
    if-nez v5, :cond_40

    .line 1206
    .line 1207
    iget v5, v1, Lh2/m;->l:I

    .line 1208
    .line 1209
    const v8, 0x6d646174

    .line 1210
    .line 1211
    .line 1212
    if-ne v5, v8, :cond_40

    .line 1213
    .line 1214
    const/4 v9, 0x1

    .line 1215
    iput v9, v1, Lh2/m;->E:I

    .line 1216
    .line 1217
    :cond_40
    cmp-long v5, v3, v19

    .line 1218
    .line 1219
    if-gez v5, :cond_42

    .line 1220
    .line 1221
    long-to-int v3, v3

    .line 1222
    invoke-interface {v0, v3}, Ln1/o;->h(I)V

    .line 1223
    .line 1224
    .line 1225
    :cond_41
    :goto_1b
    const/4 v3, 0x0

    .line 1226
    goto :goto_1c

    .line 1227
    :cond_42
    invoke-interface {v0}, Ln1/o;->getPosition()J

    .line 1228
    .line 1229
    .line 1230
    move-result-wide v8

    .line 1231
    add-long/2addr v8, v3

    .line 1232
    iput-wide v8, v2, Ln1/a0;->a:J

    .line 1233
    .line 1234
    const/4 v3, 0x1

    .line 1235
    :goto_1c
    invoke-virtual {v1, v6, v7}, Lh2/m;->d(J)V

    .line 1236
    .line 1237
    .line 1238
    iget-boolean v4, v1, Lh2/m;->v:Z

    .line 1239
    .line 1240
    if-eqz v4, :cond_43

    .line 1241
    .line 1242
    const/4 v9, 0x1

    .line 1243
    iput-boolean v9, v1, Lh2/m;->x:Z

    .line 1244
    .line 1245
    iget-wide v3, v1, Lh2/m;->w:J

    .line 1246
    .line 1247
    iput-wide v3, v2, Ln1/a0;->a:J

    .line 1248
    .line 1249
    const/4 v14, 0x0

    .line 1250
    iput-boolean v14, v1, Lh2/m;->v:Z

    .line 1251
    .line 1252
    const/4 v3, 0x1

    .line 1253
    :cond_43
    if-eqz v3, :cond_44

    .line 1254
    .line 1255
    iget v3, v1, Lh2/m;->k:I

    .line 1256
    .line 1257
    move/from16 v4, v35

    .line 1258
    .line 1259
    if-eq v3, v4, :cond_44

    .line 1260
    .line 1261
    const/4 v9, 0x1

    .line 1262
    goto :goto_1d

    .line 1263
    :cond_44
    const/4 v9, 0x0

    .line 1264
    :goto_1d
    if-eqz v9, :cond_0

    .line 1265
    .line 1266
    const/4 v9, 0x1

    .line 1267
    :goto_1e
    return v9

    .line 1268
    :cond_45
    move v9, v4

    .line 1269
    iget v3, v1, Lh2/m;->n:I

    .line 1270
    .line 1271
    iget-object v4, v1, Lh2/m;->f:Lh1/w;

    .line 1272
    .line 1273
    if-nez v3, :cond_49

    .line 1274
    .line 1275
    iget-object v3, v4, Lh1/w;->a:[B

    .line 1276
    .line 1277
    const/4 v14, 0x0

    .line 1278
    const/16 v15, 0x8

    .line 1279
    .line 1280
    invoke-interface {v0, v3, v14, v15, v9}, Ln1/o;->a([BIIZ)Z

    .line 1281
    .line 1282
    .line 1283
    move-result v3

    .line 1284
    if-nez v3, :cond_48

    .line 1285
    .line 1286
    iget v3, v1, Lh2/m;->E:I

    .line 1287
    .line 1288
    const/4 v4, 0x2

    .line 1289
    if-ne v3, v4, :cond_47

    .line 1290
    .line 1291
    and-int/lit8 v3, v6, 0x2

    .line 1292
    .line 1293
    if-eqz v3, :cond_47

    .line 1294
    .line 1295
    iget-object v3, v1, Lh2/m;->z:Ln1/p;

    .line 1296
    .line 1297
    const/4 v4, 0x4

    .line 1298
    invoke-interface {v3, v14, v4}, Ln1/p;->track(II)Ln1/i0;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v3

    .line 1302
    iget-object v4, v1, Lh2/m;->F:Lc2/a;

    .line 1303
    .line 1304
    if-nez v4, :cond_46

    .line 1305
    .line 1306
    const/4 v11, 0x0

    .line 1307
    goto :goto_1f

    .line 1308
    :cond_46
    new-instance v11, Landroidx/media3/common/t0;

    .line 1309
    .line 1310
    const/4 v9, 0x1

    .line 1311
    new-array v5, v9, [Landroidx/media3/common/s0;

    .line 1312
    .line 1313
    aput-object v4, v5, v14

    .line 1314
    .line 1315
    invoke-direct {v11, v5}, Landroidx/media3/common/t0;-><init>([Landroidx/media3/common/s0;)V

    .line 1316
    .line 1317
    .line 1318
    :goto_1f
    new-instance v4, Landroidx/media3/common/v;

    .line 1319
    .line 1320
    invoke-direct {v4}, Landroidx/media3/common/v;-><init>()V

    .line 1321
    .line 1322
    .line 1323
    iput-object v11, v4, Landroidx/media3/common/v;->k:Landroidx/media3/common/t0;

    .line 1324
    .line 1325
    new-instance v5, Landroidx/media3/common/w;

    .line 1326
    .line 1327
    invoke-direct {v5, v4}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 1328
    .line 1329
    .line 1330
    invoke-interface {v3, v5}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 1331
    .line 1332
    .line 1333
    iget-object v3, v1, Lh2/m;->z:Ln1/p;

    .line 1334
    .line 1335
    invoke-interface {v3}, Ln1/p;->endTracks()V

    .line 1336
    .line 1337
    .line 1338
    iget-object v3, v1, Lh2/m;->z:Ln1/p;

    .line 1339
    .line 1340
    new-instance v4, Ln1/s;

    .line 1341
    .line 1342
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    invoke-direct {v4, v5, v6}, Ln1/s;-><init>(J)V

    .line 1348
    .line 1349
    .line 1350
    invoke-interface {v3, v4}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 1351
    .line 1352
    .line 1353
    :cond_47
    const/4 v9, 0x0

    .line 1354
    goto/16 :goto_26

    .line 1355
    .line 1356
    :cond_48
    const/16 v15, 0x8

    .line 1357
    .line 1358
    iput v15, v1, Lh2/m;->n:I

    .line 1359
    .line 1360
    const/4 v14, 0x0

    .line 1361
    invoke-virtual {v4, v14}, Lh1/w;->G(I)V

    .line 1362
    .line 1363
    .line 1364
    invoke-virtual {v4}, Lh1/w;->w()J

    .line 1365
    .line 1366
    .line 1367
    move-result-wide v6

    .line 1368
    iput-wide v6, v1, Lh2/m;->m:J

    .line 1369
    .line 1370
    invoke-virtual {v4}, Lh1/w;->g()I

    .line 1371
    .line 1372
    .line 1373
    move-result v3

    .line 1374
    iput v3, v1, Lh2/m;->l:I

    .line 1375
    .line 1376
    :cond_49
    iget-wide v6, v1, Lh2/m;->m:J

    .line 1377
    .line 1378
    const-wide/16 v9, 0x1

    .line 1379
    .line 1380
    cmp-long v3, v6, v9

    .line 1381
    .line 1382
    if-nez v3, :cond_4a

    .line 1383
    .line 1384
    iget-object v3, v4, Lh1/w;->a:[B

    .line 1385
    .line 1386
    const/16 v15, 0x8

    .line 1387
    .line 1388
    invoke-interface {v0, v3, v15, v15}, Ln1/o;->readFully([BII)V

    .line 1389
    .line 1390
    .line 1391
    iget v3, v1, Lh2/m;->n:I

    .line 1392
    .line 1393
    add-int/2addr v3, v15

    .line 1394
    iput v3, v1, Lh2/m;->n:I

    .line 1395
    .line 1396
    invoke-virtual {v4}, Lh1/w;->z()J

    .line 1397
    .line 1398
    .line 1399
    move-result-wide v6

    .line 1400
    iput-wide v6, v1, Lh2/m;->m:J

    .line 1401
    .line 1402
    goto :goto_20

    .line 1403
    :cond_4a
    const-wide/16 v25, 0x0

    .line 1404
    .line 1405
    cmp-long v3, v6, v25

    .line 1406
    .line 1407
    if-nez v3, :cond_4c

    .line 1408
    .line 1409
    invoke-interface {v0}, Ln1/o;->getLength()J

    .line 1410
    .line 1411
    .line 1412
    move-result-wide v6

    .line 1413
    cmp-long v3, v6, v16

    .line 1414
    .line 1415
    if-nez v3, :cond_4b

    .line 1416
    .line 1417
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v3

    .line 1421
    check-cast v3, Li1/b;

    .line 1422
    .line 1423
    if-eqz v3, :cond_4b

    .line 1424
    .line 1425
    iget-wide v6, v3, Li1/b;->c:J

    .line 1426
    .line 1427
    :cond_4b
    cmp-long v3, v6, v16

    .line 1428
    .line 1429
    if-eqz v3, :cond_4c

    .line 1430
    .line 1431
    invoke-interface {v0}, Ln1/o;->getPosition()J

    .line 1432
    .line 1433
    .line 1434
    move-result-wide v9

    .line 1435
    sub-long/2addr v6, v9

    .line 1436
    iget v3, v1, Lh2/m;->n:I

    .line 1437
    .line 1438
    int-to-long v9, v3

    .line 1439
    add-long/2addr v6, v9

    .line 1440
    iput-wide v6, v1, Lh2/m;->m:J

    .line 1441
    .line 1442
    :cond_4c
    :goto_20
    iget-wide v6, v1, Lh2/m;->m:J

    .line 1443
    .line 1444
    iget v3, v1, Lh2/m;->n:I

    .line 1445
    .line 1446
    int-to-long v9, v3

    .line 1447
    cmp-long v6, v6, v9

    .line 1448
    .line 1449
    if-ltz v6, :cond_57

    .line 1450
    .line 1451
    iget v6, v1, Lh2/m;->l:I

    .line 1452
    .line 1453
    const v7, 0x6d6f6f76

    .line 1454
    .line 1455
    .line 1456
    const v9, 0x68646c72    # 4.3148E24f

    .line 1457
    .line 1458
    .line 1459
    const v10, 0x6d657461

    .line 1460
    .line 1461
    .line 1462
    if-eq v6, v7, :cond_4d

    .line 1463
    .line 1464
    const v7, 0x7472616b

    .line 1465
    .line 1466
    .line 1467
    if-eq v6, v7, :cond_4d

    .line 1468
    .line 1469
    const v7, 0x6d646961

    .line 1470
    .line 1471
    .line 1472
    if-eq v6, v7, :cond_4d

    .line 1473
    .line 1474
    const v7, 0x6d696e66

    .line 1475
    .line 1476
    .line 1477
    if-eq v6, v7, :cond_4d

    .line 1478
    .line 1479
    const v7, 0x7374626c

    .line 1480
    .line 1481
    .line 1482
    if-eq v6, v7, :cond_4d

    .line 1483
    .line 1484
    const v7, 0x65647473

    .line 1485
    .line 1486
    .line 1487
    if-eq v6, v7, :cond_4d

    .line 1488
    .line 1489
    if-eq v6, v10, :cond_4d

    .line 1490
    .line 1491
    const v7, 0x65647664

    .line 1492
    .line 1493
    .line 1494
    if-ne v6, v7, :cond_4e

    .line 1495
    .line 1496
    :cond_4d
    const/4 v3, 0x1

    .line 1497
    goto/16 :goto_24

    .line 1498
    .line 1499
    :cond_4e
    const v5, 0x6d646864

    .line 1500
    .line 1501
    .line 1502
    if-eq v6, v5, :cond_4f

    .line 1503
    .line 1504
    const v5, 0x6d766864

    .line 1505
    .line 1506
    .line 1507
    if-eq v6, v5, :cond_4f

    .line 1508
    .line 1509
    if-eq v6, v9, :cond_4f

    .line 1510
    .line 1511
    const v5, 0x73747364

    .line 1512
    .line 1513
    .line 1514
    if-eq v6, v5, :cond_4f

    .line 1515
    .line 1516
    const v5, 0x73747473

    .line 1517
    .line 1518
    .line 1519
    if-eq v6, v5, :cond_4f

    .line 1520
    .line 1521
    const v5, 0x73747373

    .line 1522
    .line 1523
    .line 1524
    if-eq v6, v5, :cond_4f

    .line 1525
    .line 1526
    const v5, 0x63747473

    .line 1527
    .line 1528
    .line 1529
    if-eq v6, v5, :cond_4f

    .line 1530
    .line 1531
    const v5, 0x656c7374

    .line 1532
    .line 1533
    .line 1534
    if-eq v6, v5, :cond_4f

    .line 1535
    .line 1536
    const v5, 0x73747363

    .line 1537
    .line 1538
    .line 1539
    if-eq v6, v5, :cond_4f

    .line 1540
    .line 1541
    const v5, 0x7374737a

    .line 1542
    .line 1543
    .line 1544
    if-eq v6, v5, :cond_4f

    .line 1545
    .line 1546
    const v5, 0x73747a32

    .line 1547
    .line 1548
    .line 1549
    if-eq v6, v5, :cond_4f

    .line 1550
    .line 1551
    const v5, 0x7374636f

    .line 1552
    .line 1553
    .line 1554
    if-eq v6, v5, :cond_4f

    .line 1555
    .line 1556
    const v5, 0x636f3634

    .line 1557
    .line 1558
    .line 1559
    if-eq v6, v5, :cond_4f

    .line 1560
    .line 1561
    const v5, 0x746b6864

    .line 1562
    .line 1563
    .line 1564
    if-eq v6, v5, :cond_4f

    .line 1565
    .line 1566
    const v5, 0x66747970

    .line 1567
    .line 1568
    .line 1569
    if-eq v6, v5, :cond_4f

    .line 1570
    .line 1571
    const v5, 0x75647461

    .line 1572
    .line 1573
    .line 1574
    if-eq v6, v5, :cond_4f

    .line 1575
    .line 1576
    const v5, 0x6b657973

    .line 1577
    .line 1578
    .line 1579
    if-eq v6, v5, :cond_4f

    .line 1580
    .line 1581
    const v5, 0x696c7374

    .line 1582
    .line 1583
    .line 1584
    if-ne v6, v5, :cond_50

    .line 1585
    .line 1586
    :cond_4f
    const/16 v15, 0x8

    .line 1587
    .line 1588
    goto :goto_21

    .line 1589
    :cond_50
    invoke-interface {v0}, Ln1/o;->getPosition()J

    .line 1590
    .line 1591
    .line 1592
    move-result-wide v3

    .line 1593
    iget v5, v1, Lh2/m;->n:I

    .line 1594
    .line 1595
    int-to-long v5, v5

    .line 1596
    sub-long v31, v3, v5

    .line 1597
    .line 1598
    iget v3, v1, Lh2/m;->l:I

    .line 1599
    .line 1600
    const v4, 0x6d707664

    .line 1601
    .line 1602
    .line 1603
    if-ne v3, v4, :cond_51

    .line 1604
    .line 1605
    new-instance v28, Lc2/a;

    .line 1606
    .line 1607
    add-long v35, v31, v5

    .line 1608
    .line 1609
    iget-wide v3, v1, Lh2/m;->m:J

    .line 1610
    .line 1611
    sub-long v37, v3, v5

    .line 1612
    .line 1613
    const-wide/16 v29, 0x0

    .line 1614
    .line 1615
    const-wide v33, -0x7fffffffffffffffL    # -4.9E-324

    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    invoke-direct/range {v28 .. v38}, Lc2/a;-><init>(JJJJJ)V

    .line 1621
    .line 1622
    .line 1623
    move-object/from16 v3, v28

    .line 1624
    .line 1625
    iput-object v3, v1, Lh2/m;->F:Lc2/a;

    .line 1626
    .line 1627
    :cond_51
    const/4 v13, 0x0

    .line 1628
    iput-object v13, v1, Lh2/m;->o:Lh1/w;

    .line 1629
    .line 1630
    const/4 v9, 0x1

    .line 1631
    iput v9, v1, Lh2/m;->k:I

    .line 1632
    .line 1633
    goto/16 :goto_25

    .line 1634
    .line 1635
    :goto_21
    if-ne v3, v15, :cond_52

    .line 1636
    .line 1637
    const/4 v3, 0x1

    .line 1638
    goto :goto_22

    .line 1639
    :cond_52
    const/4 v3, 0x0

    .line 1640
    :goto_22
    invoke-static {v3}, Lh1/a;->j(Z)V

    .line 1641
    .line 1642
    .line 1643
    iget-wide v5, v1, Lh2/m;->m:J

    .line 1644
    .line 1645
    const-wide/32 v7, 0x7fffffff

    .line 1646
    .line 1647
    .line 1648
    cmp-long v3, v5, v7

    .line 1649
    .line 1650
    if-gtz v3, :cond_53

    .line 1651
    .line 1652
    const/4 v3, 0x1

    .line 1653
    goto :goto_23

    .line 1654
    :cond_53
    const/4 v3, 0x0

    .line 1655
    :goto_23
    invoke-static {v3}, Lh1/a;->j(Z)V

    .line 1656
    .line 1657
    .line 1658
    new-instance v3, Lh1/w;

    .line 1659
    .line 1660
    iget-wide v5, v1, Lh2/m;->m:J

    .line 1661
    .line 1662
    long-to-int v5, v5

    .line 1663
    invoke-direct {v3, v5}, Lh1/w;-><init>(I)V

    .line 1664
    .line 1665
    .line 1666
    iget-object v4, v4, Lh1/w;->a:[B

    .line 1667
    .line 1668
    iget-object v5, v3, Lh1/w;->a:[B

    .line 1669
    .line 1670
    const/4 v14, 0x0

    .line 1671
    const/16 v15, 0x8

    .line 1672
    .line 1673
    invoke-static {v4, v14, v5, v14, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1674
    .line 1675
    .line 1676
    iput-object v3, v1, Lh2/m;->o:Lh1/w;

    .line 1677
    .line 1678
    const/4 v3, 0x1

    .line 1679
    iput v3, v1, Lh2/m;->k:I

    .line 1680
    .line 1681
    goto :goto_25

    .line 1682
    :goto_24
    invoke-interface {v0}, Ln1/o;->getPosition()J

    .line 1683
    .line 1684
    .line 1685
    move-result-wide v6

    .line 1686
    iget-wide v11, v1, Lh2/m;->m:J

    .line 1687
    .line 1688
    add-long/2addr v6, v11

    .line 1689
    iget v4, v1, Lh2/m;->n:I

    .line 1690
    .line 1691
    int-to-long v3, v4

    .line 1692
    sub-long/2addr v6, v3

    .line 1693
    cmp-long v3, v11, v3

    .line 1694
    .line 1695
    if-eqz v3, :cond_55

    .line 1696
    .line 1697
    iget v3, v1, Lh2/m;->l:I

    .line 1698
    .line 1699
    if-ne v3, v10, :cond_55

    .line 1700
    .line 1701
    const/16 v15, 0x8

    .line 1702
    .line 1703
    invoke-virtual {v8, v15}, Lh1/w;->D(I)V

    .line 1704
    .line 1705
    .line 1706
    iget-object v3, v8, Lh1/w;->a:[B

    .line 1707
    .line 1708
    const/4 v14, 0x0

    .line 1709
    invoke-interface {v0, v3, v14, v15}, Ln1/o;->i([BII)V

    .line 1710
    .line 1711
    .line 1712
    sget-object v3, Lh2/d;->a:[B

    .line 1713
    .line 1714
    iget v3, v8, Lh1/w;->b:I

    .line 1715
    .line 1716
    const/4 v13, 0x4

    .line 1717
    invoke-virtual {v8, v13}, Lh1/w;->H(I)V

    .line 1718
    .line 1719
    .line 1720
    invoke-virtual {v8}, Lh1/w;->g()I

    .line 1721
    .line 1722
    .line 1723
    move-result v4

    .line 1724
    if-eq v4, v9, :cond_54

    .line 1725
    .line 1726
    add-int/lit8 v3, v3, 0x4

    .line 1727
    .line 1728
    :cond_54
    invoke-virtual {v8, v3}, Lh1/w;->G(I)V

    .line 1729
    .line 1730
    .line 1731
    iget v3, v8, Lh1/w;->b:I

    .line 1732
    .line 1733
    invoke-interface {v0, v3}, Ln1/o;->h(I)V

    .line 1734
    .line 1735
    .line 1736
    invoke-interface {v0}, Ln1/o;->g()V

    .line 1737
    .line 1738
    .line 1739
    :cond_55
    new-instance v3, Li1/b;

    .line 1740
    .line 1741
    iget v4, v1, Lh2/m;->l:I

    .line 1742
    .line 1743
    invoke-direct {v3, v4, v6, v7}, Li1/b;-><init>(IJ)V

    .line 1744
    .line 1745
    .line 1746
    invoke-virtual {v5, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 1747
    .line 1748
    .line 1749
    iget-wide v3, v1, Lh2/m;->m:J

    .line 1750
    .line 1751
    iget v5, v1, Lh2/m;->n:I

    .line 1752
    .line 1753
    int-to-long v8, v5

    .line 1754
    cmp-long v3, v3, v8

    .line 1755
    .line 1756
    if-nez v3, :cond_56

    .line 1757
    .line 1758
    invoke-virtual {v1, v6, v7}, Lh2/m;->d(J)V

    .line 1759
    .line 1760
    .line 1761
    goto :goto_25

    .line 1762
    :cond_56
    const/4 v14, 0x0

    .line 1763
    iput v14, v1, Lh2/m;->k:I

    .line 1764
    .line 1765
    iput v14, v1, Lh2/m;->n:I

    .line 1766
    .line 1767
    :goto_25
    const/4 v9, 0x1

    .line 1768
    :goto_26
    if-nez v9, :cond_0

    .line 1769
    .line 1770
    const/16 v23, -0x1

    .line 1771
    .line 1772
    :goto_27
    return v23

    .line 1773
    :cond_57
    const-string v0, "Atom size less than header length (unsupported)."

    .line 1774
    .line 1775
    invoke-static {v0}, Landroidx/media3/common/v0;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/v0;

    .line 1776
    .line 1777
    .line 1778
    move-result-object v0

    .line 1779
    throw v0

    .line 1780
    nop

    .line 1781
    :sswitch_data_0
    .sparse-switch
        -0x6604662e -> :sswitch_4
        -0x4f6659e5 -> :sswitch_3
        -0x4a96a712 -> :sswitch_2
        -0x3182f331 -> :sswitch_1
        0x68f2d704 -> :sswitch_0
    .end sparse-switch

    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method

.method public final seek(JJ)V
    .locals 8

    .line 1
    iget-object v0, p0, Lh2/m;->g:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lh2/m;->n:I

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    iput v1, p0, Lh2/m;->p:I

    .line 11
    .line 12
    iput v0, p0, Lh2/m;->q:I

    .line 13
    .line 14
    iput v0, p0, Lh2/m;->r:I

    .line 15
    .line 16
    iput v0, p0, Lh2/m;->s:I

    .line 17
    .line 18
    iget v2, p0, Lh2/m;->b:I

    .line 19
    .line 20
    and-int/lit8 v2, v2, 0x20

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    move v2, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v2, v0

    .line 28
    :goto_0
    iput-boolean v2, p0, Lh2/m;->t:Z

    .line 29
    .line 30
    const-wide/16 v4, 0x0

    .line 31
    .line 32
    cmp-long p1, p1, v4

    .line 33
    .line 34
    if-nez p1, :cond_2

    .line 35
    .line 36
    iget p1, p0, Lh2/m;->k:I

    .line 37
    .line 38
    const/4 p2, 0x3

    .line 39
    if-eq p1, p2, :cond_1

    .line 40
    .line 41
    iput v0, p0, Lh2/m;->k:I

    .line 42
    .line 43
    iput v0, p0, Lh2/m;->n:I

    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    iget-object p1, p0, Lh2/m;->h:Lh2/o;

    .line 47
    .line 48
    iget-object p2, p1, Lh2/o;->a:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    .line 51
    .line 52
    .line 53
    iput v0, p1, Lh2/o;->b:I

    .line 54
    .line 55
    iget-object p1, p0, Lh2/m;->i:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    iget-object p1, p0, Lh2/m;->A:[Lh2/l;

    .line 62
    .line 63
    array-length p2, p1

    .line 64
    move v2, v0

    .line 65
    :goto_1
    if-ge v2, p2, :cond_7

    .line 66
    .line 67
    aget-object v4, p1, v2

    .line 68
    .line 69
    iget-object v5, v4, Lh2/l;->b:Lh2/t;

    .line 70
    .line 71
    iget-object v6, v5, Lh2/t;->f:[J

    .line 72
    .line 73
    invoke-static {v6, p3, p4, v0}, Lh1/i0;->e([JJZ)I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    :goto_2
    if-ltz v6, :cond_4

    .line 78
    .line 79
    iget-object v7, v5, Lh2/t;->g:[I

    .line 80
    .line 81
    aget v7, v7, v6

    .line 82
    .line 83
    and-int/2addr v7, v3

    .line 84
    if-eqz v7, :cond_3

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_3
    add-int/lit8 v6, v6, -0x1

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    move v6, v1

    .line 91
    :goto_3
    if-ne v6, v1, :cond_5

    .line 92
    .line 93
    invoke-virtual {v5, p3, p4}, Lh2/t;->a(J)I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    :cond_5
    iput v6, v4, Lh2/l;->e:I

    .line 98
    .line 99
    iget-object v4, v4, Lh2/l;->d:Ln1/j0;

    .line 100
    .line 101
    if-eqz v4, :cond_6

    .line 102
    .line 103
    iput-boolean v0, v4, Ln1/j0;->b:Z

    .line 104
    .line 105
    iput v0, v4, Ln1/j0;->c:I

    .line 106
    .line 107
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_7
    return-void
.end method

.method public final sniff(Ln1/o;)Z
    .locals 3

    .line 1
    iget v0, p0, Lh2/m;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    move v0, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v2

    .line 12
    :goto_0
    invoke-static {p1, v2, v0}, Lh2/p;->l(Ln1/o;ZZ)Ln1/g0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-static {p1}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    sget-object v0, Lf6/m0;->k:Lf6/k0;

    .line 24
    .line 25
    sget-object v0, Lf6/l1;->n:Lf6/l1;

    .line 26
    .line 27
    :goto_1
    iput-object v0, p0, Lh2/m;->j:Lf6/l1;

    .line 28
    .line 29
    if-nez p1, :cond_2

    .line 30
    .line 31
    return v1

    .line 32
    :cond_2
    return v2
.end method
