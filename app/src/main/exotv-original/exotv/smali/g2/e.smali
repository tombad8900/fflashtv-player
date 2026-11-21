.class public final Lg2/e;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/n;


# instance fields
.field public final a:J

.field public final b:Lh1/w;

.field public final c:Ln1/z;

.field public final d:Ln1/v;

.field public final e:Ln1/x;

.field public final f:Ln1/m;

.field public g:Ln1/p;

.field public h:Ln1/i0;

.field public i:Ln1/i0;

.field public j:I

.field public k:Landroidx/media3/common/t0;

.field public l:J

.field public m:J

.field public n:J

.field public o:J

.field public p:I

.field public q:Lg2/g;

.field public r:Z

.field public s:Z

.field public t:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 1
    invoke-direct {p0, v0, v1}, Lg2/e;-><init>(J)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lg2/e;->a:J

    .line 4
    new-instance p1, Lh1/w;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Lh1/w;-><init>(I)V

    iput-object p1, p0, Lg2/e;->b:Lh1/w;

    .line 5
    new-instance p1, Ln1/z;

    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lg2/e;->c:Ln1/z;

    .line 8
    new-instance p1, Ln1/v;

    invoke-direct {p1}, Ln1/v;-><init>()V

    iput-object p1, p0, Lg2/e;->d:Ln1/v;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    iput-wide p1, p0, Lg2/e;->l:J

    .line 10
    new-instance p1, Ln1/x;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ln1/x;-><init>(I)V

    iput-object p1, p0, Lg2/e;->e:Ln1/x;

    .line 11
    new-instance p1, Ln1/m;

    invoke-direct {p1}, Ln1/m;-><init>()V

    iput-object p1, p0, Lg2/e;->f:Ln1/m;

    .line 12
    iput-object p1, p0, Lg2/e;->i:Ln1/i0;

    const-wide/16 p1, -0x1

    .line 13
    iput-wide p1, p0, Lg2/e;->o:J

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 9

    .line 1
    iget-object v0, p0, Lg2/e;->q:Lg2/g;

    .line 2
    .line 3
    instance-of v1, v0, Lg2/a;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lg2/a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lg2/a;->isSeekable()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-wide v0, p0, Lg2/e;->o:J

    .line 16
    .line 17
    const-wide/16 v2, -0x1

    .line 18
    .line 19
    cmp-long v2, v0, v2

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-object v2, p0, Lg2/e;->q:Lg2/g;

    .line 24
    .line 25
    invoke-interface {v2}, Lg2/g;->a()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    cmp-long v0, v0, v2

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget-object v0, p0, Lg2/e;->q:Lg2/g;

    .line 34
    .line 35
    check-cast v0, Lg2/a;

    .line 36
    .line 37
    iget-wide v2, p0, Lg2/e;->o:J

    .line 38
    .line 39
    new-instance v1, Lg2/a;

    .line 40
    .line 41
    iget-wide v4, v0, Lg2/a;->h:J

    .line 42
    .line 43
    iget v6, v0, Lg2/a;->i:I

    .line 44
    .line 45
    iget v7, v0, Lg2/a;->j:I

    .line 46
    .line 47
    iget-boolean v8, v0, Lg2/a;->k:Z

    .line 48
    .line 49
    invoke-direct/range {v1 .. v8}, Lg2/a;-><init>(JJIIZ)V

    .line 50
    .line 51
    .line 52
    iput-object v1, p0, Lg2/e;->q:Lg2/g;

    .line 53
    .line 54
    iget-object v0, p0, Lg2/e;->g:Ln1/p;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lg2/e;->q:Lg2/g;

    .line 60
    .line 61
    invoke-interface {v0, v1}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    return-void
.end method

.method public final b(Ln1/o;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lg2/e;->q:Lg2/g;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lg2/g;->a()J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    const-wide/16 v4, -0x1

    .line 11
    .line 12
    cmp-long v0, v2, v4

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ln1/o;->c()J

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    const-wide/16 v6, 0x4

    .line 21
    .line 22
    sub-long/2addr v2, v6

    .line 23
    cmp-long v0, v4, v2

    .line 24
    .line 25
    if-lez v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    :try_start_0
    iget-object v0, p0, Lg2/e;->b:Lh1/w;

    .line 29
    .line 30
    iget-object v0, v0, Lh1/w;->a:[B

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x4

    .line 34
    invoke-interface {p1, v0, v2, v3, v1}, Ln1/o;->b([BIIZ)Z

    .line 35
    .line 36
    .line 37
    move-result p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    xor-int/2addr p1, v1

    .line 39
    return p1

    .line 40
    :catch_0
    :goto_0
    return v1
.end method

.method public final c(Ln1/o;Z)Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const v2, 0x8000

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/high16 v2, 0x20000

    .line 12
    .line 13
    :goto_0
    invoke-interface {v1}, Ln1/o;->g()V

    .line 14
    .line 15
    .line 16
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    const-wide/16 v5, 0x0

    .line 21
    .line 22
    cmp-long v3, v3, v5

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    if-nez v3, :cond_5

    .line 26
    .line 27
    iget-object v3, v0, Lg2/e;->e:Ln1/x;

    .line 28
    .line 29
    iget-object v3, v3, Ln1/x;->j:Lh1/w;

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    move v7, v4

    .line 33
    move-object v6, v5

    .line 34
    :goto_1
    :try_start_0
    iget-object v8, v3, Lh1/w;->a:[B

    .line 35
    .line 36
    const/16 v9, 0xa

    .line 37
    .line 38
    invoke-interface {v1, v8, v4, v9}, Ln1/o;->i([BII)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v4}, Lh1/w;->G(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Lh1/w;->x()I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    const v10, 0x494433

    .line 49
    .line 50
    .line 51
    if-eq v8, v10, :cond_1

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_1
    const/4 v8, 0x3

    .line 55
    invoke-virtual {v3, v8}, Lh1/w;->H(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, Lh1/w;->t()I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    add-int/lit8 v10, v8, 0xa

    .line 63
    .line 64
    if-nez v6, :cond_2

    .line 65
    .line 66
    new-array v6, v10, [B

    .line 67
    .line 68
    iget-object v11, v3, Lh1/w;->a:[B

    .line 69
    .line 70
    invoke-static {v11, v4, v6, v4, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v1, v6, v9, v8}, Ln1/o;->i([BII)V

    .line 74
    .line 75
    .line 76
    new-instance v8, Lb2/i;

    .line 77
    .line 78
    invoke-direct {v8, v5}, Lb2/i;-><init>(Lb2/g;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v8, v6, v10}, Lb2/i;->v([BI)Landroidx/media3/common/t0;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    goto :goto_2

    .line 86
    :cond_2
    invoke-interface {v1, v8}, Ln1/o;->d(I)V

    .line 87
    .line 88
    .line 89
    :goto_2
    add-int/2addr v7, v10

    .line 90
    goto :goto_1

    .line 91
    :catch_0
    :goto_3
    invoke-interface {v1}, Ln1/o;->g()V

    .line 92
    .line 93
    .line 94
    invoke-interface {v1, v7}, Ln1/o;->d(I)V

    .line 95
    .line 96
    .line 97
    iput-object v6, v0, Lg2/e;->k:Landroidx/media3/common/t0;

    .line 98
    .line 99
    if-eqz v6, :cond_3

    .line 100
    .line 101
    iget-object v3, v0, Lg2/e;->d:Ln1/v;

    .line 102
    .line 103
    invoke-virtual {v3, v6}, Ln1/v;->b(Landroidx/media3/common/t0;)V

    .line 104
    .line 105
    .line 106
    :cond_3
    invoke-interface {v1}, Ln1/o;->c()J

    .line 107
    .line 108
    .line 109
    move-result-wide v5

    .line 110
    long-to-int v3, v5

    .line 111
    if-nez p2, :cond_4

    .line 112
    .line 113
    invoke-interface {v1, v3}, Ln1/o;->h(I)V

    .line 114
    .line 115
    .line 116
    :cond_4
    move v5, v4

    .line 117
    :goto_4
    move v6, v5

    .line 118
    move v7, v6

    .line 119
    goto :goto_5

    .line 120
    :cond_5
    move v3, v4

    .line 121
    move v5, v3

    .line 122
    goto :goto_4

    .line 123
    :goto_5
    invoke-virtual/range {p0 .. p1}, Lg2/e;->b(Ln1/o;)Z

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    const/4 v9, 0x1

    .line 128
    if-eqz v8, :cond_7

    .line 129
    .line 130
    if-lez v6, :cond_6

    .line 131
    .line 132
    goto :goto_7

    .line 133
    :cond_6
    invoke-virtual {v0}, Lg2/e;->a()V

    .line 134
    .line 135
    .line 136
    new-instance v1, Ljava/io/EOFException;

    .line 137
    .line 138
    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    .line 139
    .line 140
    .line 141
    throw v1

    .line 142
    :cond_7
    iget-object v8, v0, Lg2/e;->b:Lh1/w;

    .line 143
    .line 144
    invoke-virtual {v8, v4}, Lh1/w;->G(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v8}, Lh1/w;->g()I

    .line 148
    .line 149
    .line 150
    move-result v8

    .line 151
    if-eqz v5, :cond_8

    .line 152
    .line 153
    int-to-long v10, v5

    .line 154
    const v12, -0x1f400

    .line 155
    .line 156
    .line 157
    and-int/2addr v12, v8

    .line 158
    int-to-long v12, v12

    .line 159
    const-wide/32 v14, -0x1f400

    .line 160
    .line 161
    .line 162
    and-long/2addr v10, v14

    .line 163
    cmp-long v10, v12, v10

    .line 164
    .line 165
    if-nez v10, :cond_9

    .line 166
    .line 167
    :cond_8
    invoke-static {v8}, Ln1/b;->i(I)I

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    const/4 v11, -0x1

    .line 172
    if-ne v10, v11, :cond_d

    .line 173
    .line 174
    :cond_9
    add-int/lit8 v5, v7, 0x1

    .line 175
    .line 176
    if-ne v7, v2, :cond_b

    .line 177
    .line 178
    if-eqz p2, :cond_a

    .line 179
    .line 180
    return v4

    .line 181
    :cond_a
    invoke-virtual {v0}, Lg2/e;->a()V

    .line 182
    .line 183
    .line 184
    new-instance v1, Ljava/io/EOFException;

    .line 185
    .line 186
    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    .line 187
    .line 188
    .line 189
    throw v1

    .line 190
    :cond_b
    if-eqz p2, :cond_c

    .line 191
    .line 192
    invoke-interface {v1}, Ln1/o;->g()V

    .line 193
    .line 194
    .line 195
    add-int v6, v3, v5

    .line 196
    .line 197
    invoke-interface {v1, v6}, Ln1/o;->d(I)V

    .line 198
    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_c
    invoke-interface {v1, v9}, Ln1/o;->h(I)V

    .line 202
    .line 203
    .line 204
    :goto_6
    move v6, v4

    .line 205
    move v7, v5

    .line 206
    move v5, v6

    .line 207
    goto :goto_5

    .line 208
    :cond_d
    add-int/lit8 v6, v6, 0x1

    .line 209
    .line 210
    if-ne v6, v9, :cond_e

    .line 211
    .line 212
    iget-object v5, v0, Lg2/e;->c:Ln1/z;

    .line 213
    .line 214
    invoke-virtual {v5, v8}, Ln1/z;->a(I)Z

    .line 215
    .line 216
    .line 217
    move v5, v8

    .line 218
    goto :goto_9

    .line 219
    :cond_e
    const/4 v8, 0x4

    .line 220
    if-ne v6, v8, :cond_10

    .line 221
    .line 222
    :goto_7
    if-eqz p2, :cond_f

    .line 223
    .line 224
    add-int/2addr v3, v7

    .line 225
    invoke-interface {v1, v3}, Ln1/o;->h(I)V

    .line 226
    .line 227
    .line 228
    goto :goto_8

    .line 229
    :cond_f
    invoke-interface {v1}, Ln1/o;->g()V

    .line 230
    .line 231
    .line 232
    :goto_8
    iput v5, v0, Lg2/e;->j:I

    .line 233
    .line 234
    return v9

    .line 235
    :cond_10
    :goto_9
    add-int/lit8 v10, v10, -0x4

    .line 236
    .line 237
    invoke-interface {v1, v10}, Ln1/o;->d(I)V

    .line 238
    .line 239
    .line 240
    goto :goto_5
.end method

.method public final init(Ln1/p;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lg2/e;->g:Ln1/p;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-interface {p1, v0, v1}, Ln1/p;->track(II)Ln1/i0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lg2/e;->h:Ln1/i0;

    .line 10
    .line 11
    iput-object p1, p0, Lg2/e;->i:Ln1/i0;

    .line 12
    .line 13
    iget-object p1, p0, Lg2/e;->g:Ln1/p;

    .line 14
    .line 15
    invoke-interface {p1}, Ln1/p;->endTracks()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final read(Ln1/o;Ln1/a0;)I
    .locals 54

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lg2/e;->h:Ln1/i0;

    .line 6
    .line 7
    invoke-static {v2}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sget v2, Lh1/i0;->a:I

    .line 11
    .line 12
    iget v2, v0, Lg2/e;->j:I

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    iget-object v8, v0, Lg2/e;->c:Ln1/z;

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    :try_start_0
    invoke-virtual {v0, v1, v7}, Lg2/e;->c(Ln1/o;Z)Z
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    const/16 p2, 0x0

    .line 24
    .line 25
    const/4 v7, -0x1

    .line 26
    const/4 v12, -0x1

    .line 27
    const-wide/32 v16, 0xf4240

    .line 28
    .line 29
    .line 30
    goto/16 :goto_29

    .line 31
    .line 32
    :cond_0
    :goto_0
    iget-object v2, v0, Lg2/e;->q:Lg2/g;

    .line 33
    .line 34
    iget-object v9, v0, Lg2/e;->b:Lh1/w;

    .line 35
    .line 36
    const/4 v10, 0x1

    .line 37
    if-nez v2, :cond_31

    .line 38
    .line 39
    new-instance v2, Lh1/w;

    .line 40
    .line 41
    iget v15, v8, Ln1/z;->b:I

    .line 42
    .line 43
    invoke-direct {v2, v15}, Lh1/w;-><init>(I)V

    .line 44
    .line 45
    .line 46
    iget-object v15, v2, Lh1/w;->a:[B

    .line 47
    .line 48
    const-wide/32 v16, 0xf4240

    .line 49
    .line 50
    .line 51
    iget v3, v8, Ln1/z;->b:I

    .line 52
    .line 53
    invoke-interface {v1, v15, v7, v3}, Ln1/o;->i([BII)V

    .line 54
    .line 55
    .line 56
    iget v3, v8, Ln1/z;->a:I

    .line 57
    .line 58
    and-int/2addr v3, v10

    .line 59
    const/16 v4, 0x24

    .line 60
    .line 61
    const/16 v15, 0x15

    .line 62
    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    iget v3, v8, Ln1/z;->d:I

    .line 66
    .line 67
    if-eq v3, v10, :cond_1

    .line 68
    .line 69
    move v3, v4

    .line 70
    :goto_1
    const/16 p2, 0x0

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_1
    :goto_2
    move v3, v15

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    iget v3, v8, Ln1/z;->d:I

    .line 76
    .line 77
    if-eq v3, v10, :cond_3

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    const/16 v3, 0xd

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :goto_3
    iget v5, v2, Lh1/w;->c:I

    .line 84
    .line 85
    const-wide/16 v18, 0x0

    .line 86
    .line 87
    add-int/lit8 v13, v3, 0x4

    .line 88
    .line 89
    const v14, 0x496e666f

    .line 90
    .line 91
    .line 92
    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    const v11, 0x56425249

    .line 98
    .line 99
    .line 100
    const v12, 0x58696e67

    .line 101
    .line 102
    .line 103
    if-lt v5, v13, :cond_4

    .line 104
    .line 105
    invoke-virtual {v2, v3}, Lh1/w;->G(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Lh1/w;->g()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eq v3, v12, :cond_6

    .line 113
    .line 114
    if-ne v3, v14, :cond_4

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_4
    iget v3, v2, Lh1/w;->c:I

    .line 118
    .line 119
    const/16 v5, 0x28

    .line 120
    .line 121
    if-lt v3, v5, :cond_5

    .line 122
    .line 123
    invoke-virtual {v2, v4}, Lh1/w;->G(I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Lh1/w;->g()I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-ne v3, v11, :cond_5

    .line 131
    .line 132
    move v3, v11

    .line 133
    goto :goto_4

    .line 134
    :cond_5
    move v3, v7

    .line 135
    :cond_6
    :goto_4
    iget-object v4, v0, Lg2/e;->d:Ln1/v;

    .line 136
    .line 137
    const-wide/16 v22, -0x1

    .line 138
    .line 139
    if-eq v3, v14, :cond_11

    .line 140
    .line 141
    if-eq v3, v11, :cond_7

    .line 142
    .line 143
    if-eq v3, v12, :cond_11

    .line 144
    .line 145
    invoke-interface {v1}, Ln1/o;->g()V

    .line 146
    .line 147
    .line 148
    move-object/from16 v35, p2

    .line 149
    .line 150
    :goto_5
    move-object v15, v4

    .line 151
    goto/16 :goto_1b

    .line 152
    .line 153
    :cond_7
    invoke-interface {v1}, Ln1/o;->getLength()J

    .line 154
    .line 155
    .line 156
    move-result-wide v11

    .line 157
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 158
    .line 159
    .line 160
    move-result-wide v13

    .line 161
    const/4 v3, 0x6

    .line 162
    invoke-virtual {v2, v3}, Lh1/w;->H(I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2}, Lh1/w;->g()I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    iget v15, v8, Ln1/z;->b:I

    .line 170
    .line 171
    int-to-long v6, v15

    .line 172
    add-long/2addr v6, v13

    .line 173
    move-wide/from16 v26, v6

    .line 174
    .line 175
    int-to-long v5, v3

    .line 176
    add-long v6, v26, v5

    .line 177
    .line 178
    invoke-virtual {v2}, Lh1/w;->g()I

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-gtz v3, :cond_8

    .line 183
    .line 184
    :goto_6
    move-object/from16 v35, p2

    .line 185
    .line 186
    goto/16 :goto_b

    .line 187
    .line 188
    :cond_8
    iget v5, v8, Ln1/z;->c:I

    .line 189
    .line 190
    move-wide/from16 v33, v11

    .line 191
    .line 192
    int-to-long v10, v3

    .line 193
    const/16 v3, 0x7d00

    .line 194
    .line 195
    if-lt v5, v3, :cond_9

    .line 196
    .line 197
    const/16 v3, 0x480

    .line 198
    .line 199
    :goto_7
    move-wide/from16 v26, v10

    .line 200
    .line 201
    goto :goto_8

    .line 202
    :cond_9
    const/16 v3, 0x240

    .line 203
    .line 204
    goto :goto_7

    .line 205
    :goto_8
    int-to-long v10, v3

    .line 206
    mul-long v28, v10, v16

    .line 207
    .line 208
    int-to-long v10, v5

    .line 209
    sget-object v32, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 210
    .line 211
    move-wide/from16 v30, v10

    .line 212
    .line 213
    invoke-static/range {v26 .. v32}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 214
    .line 215
    .line 216
    move-result-wide v38

    .line 217
    invoke-virtual {v2}, Lh1/w;->A()I

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    invoke-virtual {v2}, Lh1/w;->A()I

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    invoke-virtual {v2}, Lh1/w;->A()I

    .line 226
    .line 227
    .line 228
    move-result v10

    .line 229
    const/4 v11, 0x2

    .line 230
    invoke-virtual {v2, v11}, Lh1/w;->H(I)V

    .line 231
    .line 232
    .line 233
    iget v12, v8, Ln1/z;->b:I

    .line 234
    .line 235
    int-to-long v11, v12

    .line 236
    add-long/2addr v13, v11

    .line 237
    new-array v11, v3, [J

    .line 238
    .line 239
    new-array v12, v3, [J

    .line 240
    .line 241
    const/4 v15, 0x0

    .line 242
    :goto_9
    if-ge v15, v3, :cond_e

    .line 243
    .line 244
    move-object/from16 v36, v11

    .line 245
    .line 246
    move-object/from16 v37, v12

    .line 247
    .line 248
    int-to-long v11, v15

    .line 249
    mul-long v11, v11, v38

    .line 250
    .line 251
    move-wide/from16 v27, v11

    .line 252
    .line 253
    int-to-long v11, v3

    .line 254
    div-long v11, v27, v11

    .line 255
    .line 256
    aput-wide v11, v36, v15

    .line 257
    .line 258
    aput-wide v13, v37, v15

    .line 259
    .line 260
    const/4 v11, 0x1

    .line 261
    if-eq v10, v11, :cond_d

    .line 262
    .line 263
    const/4 v11, 0x2

    .line 264
    if-eq v10, v11, :cond_c

    .line 265
    .line 266
    const/4 v12, 0x3

    .line 267
    if-eq v10, v12, :cond_b

    .line 268
    .line 269
    const/4 v12, 0x4

    .line 270
    if-eq v10, v12, :cond_a

    .line 271
    .line 272
    goto :goto_6

    .line 273
    :cond_a
    invoke-virtual {v2}, Lh1/w;->y()I

    .line 274
    .line 275
    .line 276
    move-result v12

    .line 277
    goto :goto_a

    .line 278
    :cond_b
    invoke-virtual {v2}, Lh1/w;->x()I

    .line 279
    .line 280
    .line 281
    move-result v12

    .line 282
    goto :goto_a

    .line 283
    :cond_c
    invoke-virtual {v2}, Lh1/w;->A()I

    .line 284
    .line 285
    .line 286
    move-result v12

    .line 287
    goto :goto_a

    .line 288
    :cond_d
    const/4 v11, 0x2

    .line 289
    invoke-virtual {v2}, Lh1/w;->u()I

    .line 290
    .line 291
    .line 292
    move-result v12

    .line 293
    :goto_a
    int-to-long v11, v12

    .line 294
    move/from16 v27, v10

    .line 295
    .line 296
    move-wide/from16 v28, v11

    .line 297
    .line 298
    int-to-long v10, v5

    .line 299
    mul-long v11, v28, v10

    .line 300
    .line 301
    add-long/2addr v13, v11

    .line 302
    add-int/lit8 v15, v15, 0x1

    .line 303
    .line 304
    move/from16 v10, v27

    .line 305
    .line 306
    move-object/from16 v11, v36

    .line 307
    .line 308
    move-object/from16 v12, v37

    .line 309
    .line 310
    goto :goto_9

    .line 311
    :cond_e
    move-object/from16 v36, v11

    .line 312
    .line 313
    move-object/from16 v37, v12

    .line 314
    .line 315
    cmp-long v2, v33, v22

    .line 316
    .line 317
    const-string v3, ", "

    .line 318
    .line 319
    const-string v5, "VbriSeeker"

    .line 320
    .line 321
    if-eqz v2, :cond_f

    .line 322
    .line 323
    cmp-long v2, v33, v6

    .line 324
    .line 325
    if-eqz v2, :cond_f

    .line 326
    .line 327
    new-instance v2, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    const-string v10, "VBRI data size mismatch: "

    .line 330
    .line 331
    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    move-wide/from16 v10, v33

    .line 335
    .line 336
    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    invoke-static {v5, v2}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    :cond_f
    cmp-long v2, v6, v13

    .line 353
    .line 354
    if-eqz v2, :cond_10

    .line 355
    .line 356
    new-instance v2, Ljava/lang/StringBuilder;

    .line 357
    .line 358
    const-string v10, "VBRI bytes and ToC mismatch (using max): "

    .line 359
    .line 360
    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v2, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    const-string v3, "\nSeeking will be inaccurate."

    .line 373
    .line 374
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    invoke-static {v5, v2}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    invoke-static {v6, v7, v13, v14}, Ljava/lang/Math;->max(JJ)J

    .line 385
    .line 386
    .line 387
    move-result-wide v6

    .line 388
    :cond_10
    move-wide/from16 v40, v6

    .line 389
    .line 390
    new-instance v35, Lg2/h;

    .line 391
    .line 392
    iget v2, v8, Ln1/z;->e:I

    .line 393
    .line 394
    move/from16 v42, v2

    .line 395
    .line 396
    invoke-direct/range {v35 .. v42}, Lg2/h;-><init>([J[JJJI)V

    .line 397
    .line 398
    .line 399
    :goto_b
    iget v2, v8, Ln1/z;->b:I

    .line 400
    .line 401
    invoke-interface {v1, v2}, Ln1/o;->h(I)V

    .line 402
    .line 403
    .line 404
    goto/16 :goto_5

    .line 405
    .line 406
    :cond_11
    invoke-virtual {v2}, Lh1/w;->g()I

    .line 407
    .line 408
    .line 409
    move-result v5

    .line 410
    and-int/lit8 v6, v5, 0x1

    .line 411
    .line 412
    if-eqz v6, :cond_12

    .line 413
    .line 414
    invoke-virtual {v2}, Lh1/w;->y()I

    .line 415
    .line 416
    .line 417
    move-result v6

    .line 418
    goto :goto_c

    .line 419
    :cond_12
    const/4 v6, -0x1

    .line 420
    :goto_c
    and-int/lit8 v7, v5, 0x2

    .line 421
    .line 422
    if-eqz v7, :cond_13

    .line 423
    .line 424
    invoke-virtual {v2}, Lh1/w;->w()J

    .line 425
    .line 426
    .line 427
    move-result-wide v10

    .line 428
    move-wide/from16 v40, v10

    .line 429
    .line 430
    goto :goto_d

    .line 431
    :cond_13
    move-wide/from16 v40, v22

    .line 432
    .line 433
    :goto_d
    and-int/lit8 v7, v5, 0x4

    .line 434
    .line 435
    const/4 v10, 0x4

    .line 436
    if-ne v7, v10, :cond_15

    .line 437
    .line 438
    const/16 v7, 0x64

    .line 439
    .line 440
    new-array v10, v7, [J

    .line 441
    .line 442
    const/4 v11, 0x0

    .line 443
    :goto_e
    if-ge v11, v7, :cond_14

    .line 444
    .line 445
    invoke-virtual {v2}, Lh1/w;->u()I

    .line 446
    .line 447
    .line 448
    move-result v13

    .line 449
    int-to-long v13, v13

    .line 450
    aput-wide v13, v10, v11

    .line 451
    .line 452
    add-int/lit8 v11, v11, 0x1

    .line 453
    .line 454
    goto :goto_e

    .line 455
    :cond_14
    move-object/from16 v42, v10

    .line 456
    .line 457
    goto :goto_f

    .line 458
    :cond_15
    move-object/from16 v42, p2

    .line 459
    .line 460
    :goto_f
    and-int/lit8 v5, v5, 0x8

    .line 461
    .line 462
    if-eqz v5, :cond_16

    .line 463
    .line 464
    const/4 v10, 0x4

    .line 465
    invoke-virtual {v2, v10}, Lh1/w;->H(I)V

    .line 466
    .line 467
    .line 468
    :cond_16
    invoke-virtual {v2}, Lh1/w;->a()I

    .line 469
    .line 470
    .line 471
    move-result v5

    .line 472
    const/16 v7, 0x18

    .line 473
    .line 474
    if-lt v5, v7, :cond_17

    .line 475
    .line 476
    invoke-virtual {v2, v15}, Lh1/w;->H(I)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v2}, Lh1/w;->x()I

    .line 480
    .line 481
    .line 482
    move-result v2

    .line 483
    const v5, 0xfff000

    .line 484
    .line 485
    .line 486
    and-int/2addr v5, v2

    .line 487
    shr-int/lit8 v5, v5, 0xc

    .line 488
    .line 489
    and-int/lit16 v2, v2, 0xfff

    .line 490
    .line 491
    goto :goto_10

    .line 492
    :cond_17
    const/4 v2, -0x1

    .line 493
    const/4 v5, -0x1

    .line 494
    :goto_10
    int-to-long v6, v6

    .line 495
    iget v10, v8, Ln1/z;->b:I

    .line 496
    .line 497
    iget v11, v8, Ln1/z;->c:I

    .line 498
    .line 499
    iget v13, v8, Ln1/z;->e:I

    .line 500
    .line 501
    iget v14, v8, Ln1/z;->f:I

    .line 502
    .line 503
    iget v15, v4, Ln1/v;->a:I

    .line 504
    .line 505
    const/4 v12, -0x1

    .line 506
    if-eq v15, v12, :cond_18

    .line 507
    .line 508
    iget v15, v4, Ln1/v;->b:I

    .line 509
    .line 510
    if-eq v15, v12, :cond_18

    .line 511
    .line 512
    goto :goto_11

    .line 513
    :cond_18
    if-eq v5, v12, :cond_19

    .line 514
    .line 515
    if-eq v2, v12, :cond_19

    .line 516
    .line 517
    iput v5, v4, Ln1/v;->a:I

    .line 518
    .line 519
    iput v2, v4, Ln1/v;->b:I

    .line 520
    .line 521
    :cond_19
    :goto_11
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 522
    .line 523
    .line 524
    move-result-wide v44

    .line 525
    invoke-interface {v1}, Ln1/o;->getLength()J

    .line 526
    .line 527
    .line 528
    move-result-wide v27

    .line 529
    cmp-long v2, v27, v22

    .line 530
    .line 531
    if-eqz v2, :cond_1b

    .line 532
    .line 533
    cmp-long v2, v40, v22

    .line 534
    .line 535
    if-eqz v2, :cond_1b

    .line 536
    .line 537
    invoke-interface {v1}, Ln1/o;->getLength()J

    .line 538
    .line 539
    .line 540
    move-result-wide v27

    .line 541
    move/from16 v39, v13

    .line 542
    .line 543
    add-long v12, v44, v40

    .line 544
    .line 545
    cmp-long v2, v27, v12

    .line 546
    .line 547
    if-eqz v2, :cond_1a

    .line 548
    .line 549
    new-instance v2, Ljava/lang/StringBuilder;

    .line 550
    .line 551
    const-string v5, "Data size mismatch between stream ("

    .line 552
    .line 553
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    move-object v15, v4

    .line 557
    invoke-interface {v1}, Ln1/o;->getLength()J

    .line 558
    .line 559
    .line 560
    move-result-wide v4

    .line 561
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 562
    .line 563
    .line 564
    const-string v4, ") and Xing frame ("

    .line 565
    .line 566
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 570
    .line 571
    .line 572
    const-string v4, "), using Xing value."

    .line 573
    .line 574
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v2

    .line 581
    const-string v4, "Mp3Extractor"

    .line 582
    .line 583
    invoke-static {v4, v2}, Lh1/a;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 584
    .line 585
    .line 586
    goto :goto_12

    .line 587
    :cond_1a
    move-object v15, v4

    .line 588
    goto :goto_12

    .line 589
    :cond_1b
    move-object v15, v4

    .line 590
    move/from16 v39, v13

    .line 591
    .line 592
    :goto_12
    iget v2, v8, Ln1/z;->b:I

    .line 593
    .line 594
    invoke-interface {v1, v2}, Ln1/o;->h(I)V

    .line 595
    .line 596
    .line 597
    const-wide/16 v4, 0x1

    .line 598
    .line 599
    const v2, 0x58696e67

    .line 600
    .line 601
    .line 602
    if-ne v3, v2, :cond_22

    .line 603
    .line 604
    cmp-long v2, v6, v22

    .line 605
    .line 606
    if-eqz v2, :cond_1d

    .line 607
    .line 608
    cmp-long v2, v6, v18

    .line 609
    .line 610
    if-nez v2, :cond_1c

    .line 611
    .line 612
    goto :goto_13

    .line 613
    :cond_1c
    int-to-long v2, v14

    .line 614
    mul-long/2addr v6, v2

    .line 615
    sub-long/2addr v6, v4

    .line 616
    invoke-static {v11, v6, v7}, Lh1/i0;->Y(IJ)J

    .line 617
    .line 618
    .line 619
    move-result-wide v2

    .line 620
    move-wide/from16 v47, v2

    .line 621
    .line 622
    goto :goto_14

    .line 623
    :cond_1d
    :goto_13
    move-wide/from16 v47, v20

    .line 624
    .line 625
    :goto_14
    cmp-long v2, v47, v20

    .line 626
    .line 627
    if-nez v2, :cond_1f

    .line 628
    .line 629
    :cond_1e
    :goto_15
    move-object/from16 v35, p2

    .line 630
    .line 631
    goto/16 :goto_1b

    .line 632
    .line 633
    :cond_1f
    cmp-long v2, v40, v22

    .line 634
    .line 635
    if-eqz v2, :cond_20

    .line 636
    .line 637
    if-nez v42, :cond_21

    .line 638
    .line 639
    :cond_20
    move/from16 v46, v10

    .line 640
    .line 641
    goto :goto_16

    .line 642
    :cond_21
    new-instance v33, Lg2/i;

    .line 643
    .line 644
    move/from16 v36, v10

    .line 645
    .line 646
    move-wide/from16 v34, v44

    .line 647
    .line 648
    move-wide/from16 v37, v47

    .line 649
    .line 650
    invoke-direct/range {v33 .. v42}, Lg2/i;-><init>(JIJIJ[J)V

    .line 651
    .line 652
    .line 653
    move-object/from16 v35, v33

    .line 654
    .line 655
    goto/16 :goto_1b

    .line 656
    .line 657
    :goto_16
    new-instance v43, Lg2/i;

    .line 658
    .line 659
    const-wide/16 v50, -0x1

    .line 660
    .line 661
    const/16 v52, 0x0

    .line 662
    .line 663
    move/from16 v49, v39

    .line 664
    .line 665
    invoke-direct/range {v43 .. v52}, Lg2/i;-><init>(JIJIJ[J)V

    .line 666
    .line 667
    .line 668
    move-object/from16 v35, v43

    .line 669
    .line 670
    goto :goto_1b

    .line 671
    :cond_22
    move v2, v10

    .line 672
    invoke-interface {v1}, Ln1/o;->getLength()J

    .line 673
    .line 674
    .line 675
    move-result-wide v12

    .line 676
    cmp-long v3, v6, v22

    .line 677
    .line 678
    if-eqz v3, :cond_24

    .line 679
    .line 680
    cmp-long v3, v6, v18

    .line 681
    .line 682
    if-nez v3, :cond_23

    .line 683
    .line 684
    goto :goto_17

    .line 685
    :cond_23
    move-wide/from16 v26, v4

    .line 686
    .line 687
    int-to-long v4, v14

    .line 688
    mul-long/2addr v4, v6

    .line 689
    sub-long v4, v4, v26

    .line 690
    .line 691
    invoke-static {v11, v4, v5}, Lh1/i0;->Y(IJ)J

    .line 692
    .line 693
    .line 694
    move-result-wide v3

    .line 695
    move-wide/from16 v30, v3

    .line 696
    .line 697
    goto :goto_18

    .line 698
    :cond_24
    :goto_17
    move-wide/from16 v30, v20

    .line 699
    .line 700
    :goto_18
    cmp-long v3, v30, v20

    .line 701
    .line 702
    if-nez v3, :cond_25

    .line 703
    .line 704
    goto :goto_15

    .line 705
    :cond_25
    cmp-long v3, v40, v22

    .line 706
    .line 707
    if-eqz v3, :cond_26

    .line 708
    .line 709
    add-long v12, v44, v40

    .line 710
    .line 711
    int-to-long v3, v2

    .line 712
    sub-long v40, v40, v3

    .line 713
    .line 714
    :goto_19
    move-wide/from16 v47, v12

    .line 715
    .line 716
    move-wide/from16 v26, v40

    .line 717
    .line 718
    goto :goto_1a

    .line 719
    :cond_26
    cmp-long v3, v12, v22

    .line 720
    .line 721
    if-eqz v3, :cond_1e

    .line 722
    .line 723
    sub-long v3, v12, v44

    .line 724
    .line 725
    int-to-long v10, v2

    .line 726
    sub-long v40, v3, v10

    .line 727
    .line 728
    goto :goto_19

    .line 729
    :goto_1a
    sget-object v32, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 730
    .line 731
    const-wide/32 v28, 0x7a1200

    .line 732
    .line 733
    .line 734
    invoke-static/range {v26 .. v32}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 735
    .line 736
    .line 737
    move-result-wide v3

    .line 738
    move-wide/from16 v10, v26

    .line 739
    .line 740
    move-object/from16 v5, v32

    .line 741
    .line 742
    invoke-static {v3, v4}, Lcom/bumptech/glide/d;->m(J)I

    .line 743
    .line 744
    .line 745
    move-result v51

    .line 746
    invoke-static {v10, v11, v6, v7, v5}, Lcom/bumptech/glide/c;->E(JJLjava/math/RoundingMode;)J

    .line 747
    .line 748
    .line 749
    move-result-wide v3

    .line 750
    invoke-static {v3, v4}, Lcom/bumptech/glide/d;->m(J)I

    .line 751
    .line 752
    .line 753
    move-result v52

    .line 754
    new-instance v46, Lg2/a;

    .line 755
    .line 756
    int-to-long v2, v2

    .line 757
    add-long v49, v44, v2

    .line 758
    .line 759
    const/16 v53, 0x0

    .line 760
    .line 761
    invoke-direct/range {v46 .. v53}, Lg2/a;-><init>(JJIIZ)V

    .line 762
    .line 763
    .line 764
    move-object/from16 v35, v46

    .line 765
    .line 766
    :goto_1b
    iget-object v2, v0, Lg2/e;->k:Landroidx/media3/common/t0;

    .line 767
    .line 768
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 769
    .line 770
    .line 771
    move-result-wide v3

    .line 772
    if-eqz v2, :cond_2b

    .line 773
    .line 774
    iget-object v5, v2, Landroidx/media3/common/t0;->j:[Landroidx/media3/common/s0;

    .line 775
    .line 776
    array-length v6, v5

    .line 777
    const/4 v7, 0x0

    .line 778
    :goto_1c
    if-ge v7, v6, :cond_2b

    .line 779
    .line 780
    aget-object v10, v5, v7

    .line 781
    .line 782
    instance-of v11, v10, Lb2/m;

    .line 783
    .line 784
    if-eqz v11, :cond_2a

    .line 785
    .line 786
    check-cast v10, Lb2/m;

    .line 787
    .line 788
    iget-object v5, v10, Lb2/m;->n:[I

    .line 789
    .line 790
    if-eqz v2, :cond_28

    .line 791
    .line 792
    iget-object v2, v2, Landroidx/media3/common/t0;->j:[Landroidx/media3/common/s0;

    .line 793
    .line 794
    array-length v6, v2

    .line 795
    const/4 v7, 0x0

    .line 796
    :goto_1d
    if-ge v7, v6, :cond_28

    .line 797
    .line 798
    aget-object v11, v2, v7

    .line 799
    .line 800
    instance-of v12, v11, Lb2/o;

    .line 801
    .line 802
    if-eqz v12, :cond_27

    .line 803
    .line 804
    check-cast v11, Lb2/o;

    .line 805
    .line 806
    iget-object v12, v11, Lb2/j;->j:Ljava/lang/String;

    .line 807
    .line 808
    const-string v13, "TLEN"

    .line 809
    .line 810
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 811
    .line 812
    .line 813
    move-result v12

    .line 814
    if-eqz v12, :cond_27

    .line 815
    .line 816
    iget-object v2, v11, Lb2/o;->l:Lf6/m0;

    .line 817
    .line 818
    const/4 v6, 0x0

    .line 819
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-result-object v2

    .line 823
    check-cast v2, Ljava/lang/String;

    .line 824
    .line 825
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 826
    .line 827
    .line 828
    move-result-wide v6

    .line 829
    invoke-static {v6, v7}, Lh1/i0;->S(J)J

    .line 830
    .line 831
    .line 832
    move-result-wide v6

    .line 833
    goto :goto_1e

    .line 834
    :cond_27
    add-int/lit8 v7, v7, 0x1

    .line 835
    .line 836
    goto :goto_1d

    .line 837
    :cond_28
    move-wide/from16 v6, v20

    .line 838
    .line 839
    :goto_1e
    array-length v2, v5

    .line 840
    add-int/lit8 v11, v2, 0x1

    .line 841
    .line 842
    new-array v12, v11, [J

    .line 843
    .line 844
    new-array v11, v11, [J

    .line 845
    .line 846
    const/16 v24, 0x0

    .line 847
    .line 848
    aput-wide v3, v12, v24

    .line 849
    .line 850
    aput-wide v18, v11, v24

    .line 851
    .line 852
    move-wide/from16 v22, v18

    .line 853
    .line 854
    const/4 v13, 0x1

    .line 855
    :goto_1f
    if-gt v13, v2, :cond_29

    .line 856
    .line 857
    iget v14, v10, Lb2/m;->l:I

    .line 858
    .line 859
    add-int/lit8 v26, v13, -0x1

    .line 860
    .line 861
    aget v27, v5, v26

    .line 862
    .line 863
    add-int v14, v14, v27

    .line 864
    .line 865
    move/from16 v27, v2

    .line 866
    .line 867
    move-wide/from16 v28, v3

    .line 868
    .line 869
    int-to-long v2, v14

    .line 870
    add-long v3, v28, v2

    .line 871
    .line 872
    iget v2, v10, Lb2/m;->m:I

    .line 873
    .line 874
    iget-object v14, v10, Lb2/m;->o:[I

    .line 875
    .line 876
    aget v14, v14, v26

    .line 877
    .line 878
    add-int/2addr v2, v14

    .line 879
    move-wide/from16 v28, v3

    .line 880
    .line 881
    int-to-long v2, v2

    .line 882
    add-long v22, v22, v2

    .line 883
    .line 884
    aput-wide v28, v12, v13

    .line 885
    .line 886
    aput-wide v22, v11, v13

    .line 887
    .line 888
    add-int/lit8 v13, v13, 0x1

    .line 889
    .line 890
    move/from16 v2, v27

    .line 891
    .line 892
    move-wide/from16 v3, v28

    .line 893
    .line 894
    goto :goto_1f

    .line 895
    :cond_29
    new-instance v2, Lg2/c;

    .line 896
    .line 897
    invoke-direct {v2, v6, v7, v12, v11}, Lg2/c;-><init>(J[J[J)V

    .line 898
    .line 899
    .line 900
    goto :goto_20

    .line 901
    :cond_2a
    add-int/lit8 v7, v7, 0x1

    .line 902
    .line 903
    goto :goto_1c

    .line 904
    :cond_2b
    move-object/from16 v2, p2

    .line 905
    .line 906
    :goto_20
    iget-boolean v3, v0, Lg2/e;->r:Z

    .line 907
    .line 908
    if-eqz v3, :cond_2c

    .line 909
    .line 910
    new-instance v2, Lg2/f;

    .line 911
    .line 912
    move-wide/from16 v3, v20

    .line 913
    .line 914
    invoke-direct {v2, v3, v4}, Ln1/s;-><init>(J)V

    .line 915
    .line 916
    .line 917
    goto :goto_22

    .line 918
    :cond_2c
    if-eqz v2, :cond_2d

    .line 919
    .line 920
    move-object/from16 v35, v2

    .line 921
    .line 922
    goto :goto_21

    .line 923
    :cond_2d
    if-eqz v35, :cond_2e

    .line 924
    .line 925
    goto :goto_21

    .line 926
    :cond_2e
    move-object/from16 v35, p2

    .line 927
    .line 928
    :goto_21
    if-eqz v35, :cond_2f

    .line 929
    .line 930
    invoke-interface/range {v35 .. v35}, Ln1/c0;->isSeekable()Z

    .line 931
    .line 932
    .line 933
    move-object/from16 v2, v35

    .line 934
    .line 935
    goto :goto_22

    .line 936
    :cond_2f
    iget-object v2, v9, Lh1/w;->a:[B

    .line 937
    .line 938
    const/4 v6, 0x0

    .line 939
    const/4 v10, 0x4

    .line 940
    invoke-interface {v1, v2, v6, v10}, Ln1/o;->i([BII)V

    .line 941
    .line 942
    .line 943
    invoke-virtual {v9, v6}, Lh1/w;->G(I)V

    .line 944
    .line 945
    .line 946
    invoke-virtual {v9}, Lh1/w;->g()I

    .line 947
    .line 948
    .line 949
    move-result v2

    .line 950
    invoke-virtual {v8, v2}, Ln1/z;->a(I)Z

    .line 951
    .line 952
    .line 953
    new-instance v25, Lg2/a;

    .line 954
    .line 955
    invoke-interface {v1}, Ln1/o;->getLength()J

    .line 956
    .line 957
    .line 958
    move-result-wide v26

    .line 959
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 960
    .line 961
    .line 962
    move-result-wide v28

    .line 963
    iget v2, v8, Ln1/z;->e:I

    .line 964
    .line 965
    iget v3, v8, Ln1/z;->b:I

    .line 966
    .line 967
    const/16 v32, 0x0

    .line 968
    .line 969
    move/from16 v30, v2

    .line 970
    .line 971
    move/from16 v31, v3

    .line 972
    .line 973
    invoke-direct/range {v25 .. v32}, Lg2/a;-><init>(JJIIZ)V

    .line 974
    .line 975
    .line 976
    move-object/from16 v2, v25

    .line 977
    .line 978
    :goto_22
    iput-object v2, v0, Lg2/e;->q:Lg2/g;

    .line 979
    .line 980
    iget-object v3, v0, Lg2/e;->g:Ln1/p;

    .line 981
    .line 982
    invoke-interface {v3, v2}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 983
    .line 984
    .line 985
    new-instance v2, Landroidx/media3/common/v;

    .line 986
    .line 987
    invoke-direct {v2}, Landroidx/media3/common/v;-><init>()V

    .line 988
    .line 989
    .line 990
    iget-object v3, v8, Ln1/z;->g:Ljava/io/Serializable;

    .line 991
    .line 992
    check-cast v3, Ljava/lang/String;

    .line 993
    .line 994
    invoke-static {v3}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 995
    .line 996
    .line 997
    move-result-object v3

    .line 998
    iput-object v3, v2, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 999
    .line 1000
    const/16 v3, 0x1000

    .line 1001
    .line 1002
    iput v3, v2, Landroidx/media3/common/v;->n:I

    .line 1003
    .line 1004
    iget v3, v8, Ln1/z;->d:I

    .line 1005
    .line 1006
    iput v3, v2, Landroidx/media3/common/v;->B:I

    .line 1007
    .line 1008
    iget v3, v8, Ln1/z;->c:I

    .line 1009
    .line 1010
    iput v3, v2, Landroidx/media3/common/v;->C:I

    .line 1011
    .line 1012
    iget v3, v15, Ln1/v;->a:I

    .line 1013
    .line 1014
    iput v3, v2, Landroidx/media3/common/v;->E:I

    .line 1015
    .line 1016
    iget v3, v15, Ln1/v;->b:I

    .line 1017
    .line 1018
    iput v3, v2, Landroidx/media3/common/v;->F:I

    .line 1019
    .line 1020
    iget-object v3, v0, Lg2/e;->k:Landroidx/media3/common/t0;

    .line 1021
    .line 1022
    iput-object v3, v2, Landroidx/media3/common/v;->k:Landroidx/media3/common/t0;

    .line 1023
    .line 1024
    iget-object v3, v0, Lg2/e;->q:Lg2/g;

    .line 1025
    .line 1026
    invoke-interface {v3}, Lg2/g;->b()I

    .line 1027
    .line 1028
    .line 1029
    move-result v3

    .line 1030
    const v4, -0x7fffffff

    .line 1031
    .line 1032
    .line 1033
    if-eq v3, v4, :cond_30

    .line 1034
    .line 1035
    iget-object v3, v0, Lg2/e;->q:Lg2/g;

    .line 1036
    .line 1037
    invoke-interface {v3}, Lg2/g;->b()I

    .line 1038
    .line 1039
    .line 1040
    move-result v3

    .line 1041
    iput v3, v2, Landroidx/media3/common/v;->h:I

    .line 1042
    .line 1043
    :cond_30
    iget-object v3, v0, Lg2/e;->i:Ln1/i0;

    .line 1044
    .line 1045
    new-instance v4, Landroidx/media3/common/w;

    .line 1046
    .line 1047
    invoke-direct {v4, v2}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 1048
    .line 1049
    .line 1050
    invoke-interface {v3, v4}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 1051
    .line 1052
    .line 1053
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 1054
    .line 1055
    .line 1056
    move-result-wide v2

    .line 1057
    iput-wide v2, v0, Lg2/e;->n:J

    .line 1058
    .line 1059
    goto :goto_23

    .line 1060
    :cond_31
    const/16 p2, 0x0

    .line 1061
    .line 1062
    const-wide/32 v16, 0xf4240

    .line 1063
    .line 1064
    .line 1065
    const-wide/16 v18, 0x0

    .line 1066
    .line 1067
    iget-wide v2, v0, Lg2/e;->n:J

    .line 1068
    .line 1069
    cmp-long v2, v2, v18

    .line 1070
    .line 1071
    if-eqz v2, :cond_32

    .line 1072
    .line 1073
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 1074
    .line 1075
    .line 1076
    move-result-wide v2

    .line 1077
    iget-wide v4, v0, Lg2/e;->n:J

    .line 1078
    .line 1079
    cmp-long v6, v2, v4

    .line 1080
    .line 1081
    if-gez v6, :cond_32

    .line 1082
    .line 1083
    sub-long/2addr v4, v2

    .line 1084
    long-to-int v2, v4

    .line 1085
    invoke-interface {v1, v2}, Ln1/o;->h(I)V

    .line 1086
    .line 1087
    .line 1088
    :cond_32
    :goto_23
    iget v2, v0, Lg2/e;->p:I

    .line 1089
    .line 1090
    if-nez v2, :cond_37

    .line 1091
    .line 1092
    invoke-interface {v1}, Ln1/o;->g()V

    .line 1093
    .line 1094
    .line 1095
    invoke-virtual/range {p0 .. p1}, Lg2/e;->b(Ln1/o;)Z

    .line 1096
    .line 1097
    .line 1098
    move-result v2

    .line 1099
    if-eqz v2, :cond_33

    .line 1100
    .line 1101
    goto/16 :goto_28

    .line 1102
    .line 1103
    :cond_33
    const/4 v6, 0x0

    .line 1104
    invoke-virtual {v9, v6}, Lh1/w;->G(I)V

    .line 1105
    .line 1106
    .line 1107
    invoke-virtual {v9}, Lh1/w;->g()I

    .line 1108
    .line 1109
    .line 1110
    move-result v2

    .line 1111
    iget v3, v0, Lg2/e;->j:I

    .line 1112
    .line 1113
    int-to-long v3, v3

    .line 1114
    const v5, -0x1f400

    .line 1115
    .line 1116
    .line 1117
    and-int/2addr v5, v2

    .line 1118
    int-to-long v5, v5

    .line 1119
    const-wide/32 v9, -0x1f400

    .line 1120
    .line 1121
    .line 1122
    and-long/2addr v3, v9

    .line 1123
    cmp-long v3, v5, v3

    .line 1124
    .line 1125
    if-nez v3, :cond_34

    .line 1126
    .line 1127
    invoke-static {v2}, Ln1/b;->i(I)I

    .line 1128
    .line 1129
    .line 1130
    move-result v3

    .line 1131
    const/4 v12, -0x1

    .line 1132
    if-ne v3, v12, :cond_35

    .line 1133
    .line 1134
    :cond_34
    const/4 v11, 0x1

    .line 1135
    goto :goto_24

    .line 1136
    :cond_35
    invoke-virtual {v8, v2}, Ln1/z;->a(I)Z

    .line 1137
    .line 1138
    .line 1139
    iget-wide v2, v0, Lg2/e;->l:J

    .line 1140
    .line 1141
    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    cmp-long v2, v2, v20

    .line 1147
    .line 1148
    if-nez v2, :cond_36

    .line 1149
    .line 1150
    iget-object v2, v0, Lg2/e;->q:Lg2/g;

    .line 1151
    .line 1152
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 1153
    .line 1154
    .line 1155
    move-result-wide v3

    .line 1156
    invoke-interface {v2, v3, v4}, Lg2/g;->getTimeUs(J)J

    .line 1157
    .line 1158
    .line 1159
    move-result-wide v2

    .line 1160
    iput-wide v2, v0, Lg2/e;->l:J

    .line 1161
    .line 1162
    iget-wide v2, v0, Lg2/e;->a:J

    .line 1163
    .line 1164
    cmp-long v4, v2, v20

    .line 1165
    .line 1166
    if-eqz v4, :cond_36

    .line 1167
    .line 1168
    iget-object v4, v0, Lg2/e;->q:Lg2/g;

    .line 1169
    .line 1170
    move-wide/from16 v5, v18

    .line 1171
    .line 1172
    invoke-interface {v4, v5, v6}, Lg2/g;->getTimeUs(J)J

    .line 1173
    .line 1174
    .line 1175
    move-result-wide v4

    .line 1176
    iget-wide v6, v0, Lg2/e;->l:J

    .line 1177
    .line 1178
    sub-long/2addr v2, v4

    .line 1179
    add-long/2addr v2, v6

    .line 1180
    iput-wide v2, v0, Lg2/e;->l:J

    .line 1181
    .line 1182
    :cond_36
    iget v2, v8, Ln1/z;->b:I

    .line 1183
    .line 1184
    iput v2, v0, Lg2/e;->p:I

    .line 1185
    .line 1186
    invoke-interface {v1}, Ln1/o;->getPosition()J

    .line 1187
    .line 1188
    .line 1189
    move-result-wide v2

    .line 1190
    iget v4, v8, Ln1/z;->b:I

    .line 1191
    .line 1192
    int-to-long v4, v4

    .line 1193
    add-long/2addr v2, v4

    .line 1194
    iput-wide v2, v0, Lg2/e;->o:J

    .line 1195
    .line 1196
    iget-object v2, v0, Lg2/e;->q:Lg2/g;

    .line 1197
    .line 1198
    instance-of v2, v2, Lg2/b;

    .line 1199
    .line 1200
    if-nez v2, :cond_38

    .line 1201
    .line 1202
    :cond_37
    const/4 v11, 0x1

    .line 1203
    goto :goto_27

    .line 1204
    :cond_38
    iget-wide v1, v0, Lg2/e;->m:J

    .line 1205
    .line 1206
    iget v3, v8, Ln1/z;->f:I

    .line 1207
    .line 1208
    int-to-long v3, v3

    .line 1209
    add-long/2addr v1, v3

    .line 1210
    mul-long v1, v1, v16

    .line 1211
    .line 1212
    iget v3, v8, Ln1/z;->c:I

    .line 1213
    .line 1214
    int-to-long v3, v3

    .line 1215
    div-long/2addr v1, v3

    .line 1216
    throw p2

    .line 1217
    :goto_24
    invoke-interface {v1, v11}, Ln1/o;->h(I)V

    .line 1218
    .line 1219
    .line 1220
    const/4 v6, 0x0

    .line 1221
    iput v6, v0, Lg2/e;->j:I

    .line 1222
    .line 1223
    :goto_25
    const/4 v7, 0x0

    .line 1224
    :goto_26
    const/4 v12, -0x1

    .line 1225
    goto :goto_29

    .line 1226
    :goto_27
    iget-object v2, v0, Lg2/e;->i:Ln1/i0;

    .line 1227
    .line 1228
    iget v3, v0, Lg2/e;->p:I

    .line 1229
    .line 1230
    invoke-interface {v2, v1, v3, v11}, Ln1/i0;->sampleData(Landroidx/media3/common/m;IZ)I

    .line 1231
    .line 1232
    .line 1233
    move-result v1

    .line 1234
    const/4 v12, -0x1

    .line 1235
    if-ne v1, v12, :cond_39

    .line 1236
    .line 1237
    :goto_28
    const/4 v7, -0x1

    .line 1238
    goto :goto_26

    .line 1239
    :cond_39
    iget v2, v0, Lg2/e;->p:I

    .line 1240
    .line 1241
    sub-int/2addr v2, v1

    .line 1242
    iput v2, v0, Lg2/e;->p:I

    .line 1243
    .line 1244
    if-lez v2, :cond_3a

    .line 1245
    .line 1246
    goto :goto_25

    .line 1247
    :cond_3a
    iget-object v9, v0, Lg2/e;->i:Ln1/i0;

    .line 1248
    .line 1249
    iget-wide v1, v0, Lg2/e;->m:J

    .line 1250
    .line 1251
    iget-wide v3, v0, Lg2/e;->l:J

    .line 1252
    .line 1253
    mul-long v1, v1, v16

    .line 1254
    .line 1255
    iget v5, v8, Ln1/z;->c:I

    .line 1256
    .line 1257
    int-to-long v5, v5

    .line 1258
    div-long/2addr v1, v5

    .line 1259
    add-long v10, v1, v3

    .line 1260
    .line 1261
    iget v13, v8, Ln1/z;->b:I

    .line 1262
    .line 1263
    const/4 v14, 0x0

    .line 1264
    const/4 v15, 0x0

    .line 1265
    const/4 v12, 0x1

    .line 1266
    invoke-interface/range {v9 .. v15}, Ln1/i0;->sampleMetadata(JIIILn1/h0;)V

    .line 1267
    .line 1268
    .line 1269
    iget-wide v1, v0, Lg2/e;->m:J

    .line 1270
    .line 1271
    iget v3, v8, Ln1/z;->f:I

    .line 1272
    .line 1273
    int-to-long v3, v3

    .line 1274
    add-long/2addr v1, v3

    .line 1275
    iput-wide v1, v0, Lg2/e;->m:J

    .line 1276
    .line 1277
    const/4 v6, 0x0

    .line 1278
    iput v6, v0, Lg2/e;->p:I

    .line 1279
    .line 1280
    move v7, v6

    .line 1281
    goto :goto_26

    .line 1282
    :goto_29
    if-ne v7, v12, :cond_3c

    .line 1283
    .line 1284
    iget-object v1, v0, Lg2/e;->q:Lg2/g;

    .line 1285
    .line 1286
    instance-of v2, v1, Lg2/b;

    .line 1287
    .line 1288
    if-eqz v2, :cond_3c

    .line 1289
    .line 1290
    iget-wide v2, v0, Lg2/e;->m:J

    .line 1291
    .line 1292
    iget-wide v4, v0, Lg2/e;->l:J

    .line 1293
    .line 1294
    mul-long v2, v2, v16

    .line 1295
    .line 1296
    iget v6, v8, Ln1/z;->c:I

    .line 1297
    .line 1298
    int-to-long v8, v6

    .line 1299
    div-long/2addr v2, v8

    .line 1300
    add-long/2addr v2, v4

    .line 1301
    invoke-interface {v1}, Ln1/c0;->getDurationUs()J

    .line 1302
    .line 1303
    .line 1304
    move-result-wide v4

    .line 1305
    cmp-long v1, v4, v2

    .line 1306
    .line 1307
    if-nez v1, :cond_3b

    .line 1308
    .line 1309
    goto :goto_2a

    .line 1310
    :cond_3b
    iget-object v1, v0, Lg2/e;->q:Lg2/g;

    .line 1311
    .line 1312
    check-cast v1, Lg2/b;

    .line 1313
    .line 1314
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1315
    .line 1316
    .line 1317
    throw p2

    .line 1318
    :cond_3c
    :goto_2a
    return v7
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method

.method public final seek(JJ)V
    .locals 2

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lg2/e;->j:I

    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, Lg2/e;->l:J

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    iput-wide v0, p0, Lg2/e;->m:J

    .line 14
    .line 15
    iput p1, p0, Lg2/e;->p:I

    .line 16
    .line 17
    iput-wide p3, p0, Lg2/e;->t:J

    .line 18
    .line 19
    iget-object p1, p0, Lg2/e;->q:Lg2/g;

    .line 20
    .line 21
    instance-of p1, p1, Lg2/b;

    .line 22
    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    throw p1
.end method

.method public final sniff(Ln1/o;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lg2/e;->c(Ln1/o;Z)Z

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    return p1
.end method
