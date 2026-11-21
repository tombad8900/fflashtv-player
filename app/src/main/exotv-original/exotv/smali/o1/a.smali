.class public final Lo1/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/n;


# static fields
.field public static final q:[I

.field public static final r:[I

.field public static final s:[B

.field public static final t:[B


# instance fields
.field public final a:[B

.field public final b:Ln1/m;

.field public c:Z

.field public d:J

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:J

.field public j:Ln1/p;

.field public k:Ln1/i0;

.field public l:Ln1/i0;

.field public m:Ln1/c0;

.field public n:Z

.field public o:J

.field public p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, Lo1/a;->q:[I

    .line 9
    .line 10
    new-array v0, v0, [I

    .line 11
    .line 12
    fill-array-data v0, :array_1

    .line 13
    .line 14
    .line 15
    sput-object v0, Lo1/a;->r:[I

    .line 16
    .line 17
    sget v0, Lh1/i0;->a:I

    .line 18
    .line 19
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 20
    .line 21
    const-string v1, "#!AMR\n"

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    sput-object v1, Lo1/a;->s:[B

    .line 28
    .line 29
    const-string v1, "#!AMR-WB\n"

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lo1/a;->t:[B

    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :array_0
    .array-data 4
        0xd
        0xe
        0x10
        0x12
        0x14
        0x15
        0x1b
        0x20
        0x6
        0x7
        0x6
        0x6
        0x1
        0x1
        0x1
        0x1
    .end array-data

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    :array_1
    .array-data 4
        0x12
        0x18
        0x21
        0x25
        0x29
        0x2f
        0x33
        0x3b
        0x3d
        0x6
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    new-array v0, v0, [B

    .line 6
    .line 7
    iput-object v0, p0, Lo1/a;->a:[B

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    iput v0, p0, Lo1/a;->g:I

    .line 11
    .line 12
    new-instance v0, Ln1/m;

    .line 13
    .line 14
    invoke-direct {v0}, Ln1/m;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lo1/a;->b:Ln1/m;

    .line 18
    .line 19
    iput-object v0, p0, Lo1/a;->l:Ln1/i0;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(Ln1/o;)I
    .locals 3

    .line 1
    invoke-interface {p1}, Ln1/o;->g()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iget-object v1, p0, Lo1/a;->a:[B

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-interface {p1, v1, v2, v0}, Ln1/o;->i([BII)V

    .line 9
    .line 10
    .line 11
    aget-byte p1, v1, v2

    .line 12
    .line 13
    and-int/lit16 v0, p1, 0x83

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-gtz v0, :cond_5

    .line 17
    .line 18
    shr-int/lit8 p1, p1, 0x3

    .line 19
    .line 20
    const/16 v0, 0xf

    .line 21
    .line 22
    and-int/2addr p1, v0

    .line 23
    if-ltz p1, :cond_3

    .line 24
    .line 25
    if-gt p1, v0, :cond_3

    .line 26
    .line 27
    iget-boolean v0, p0, Lo1/a;->c:Z

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const/16 v2, 0xa

    .line 32
    .line 33
    if-lt p1, v2, :cond_1

    .line 34
    .line 35
    const/16 v2, 0xd

    .line 36
    .line 37
    if-le p1, v2, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    if-nez v0, :cond_3

    .line 41
    .line 42
    const/16 v2, 0xc

    .line 43
    .line 44
    if-lt p1, v2, :cond_1

    .line 45
    .line 46
    const/16 v2, 0xe

    .line 47
    .line 48
    if-le p1, v2, :cond_3

    .line 49
    .line 50
    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    .line 51
    .line 52
    sget-object v0, Lo1/a;->r:[I

    .line 53
    .line 54
    aget p1, v0, p1

    .line 55
    .line 56
    return p1

    .line 57
    :cond_2
    sget-object v0, Lo1/a;->q:[I

    .line 58
    .line 59
    aget p1, v0, p1

    .line 60
    .line 61
    return p1

    .line 62
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v2, "Illegal AMR "

    .line 65
    .line 66
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-boolean v2, p0, Lo1/a;->c:Z

    .line 70
    .line 71
    if-eqz v2, :cond_4

    .line 72
    .line 73
    const-string v2, "WB"

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    const-string v2, "NB"

    .line 77
    .line 78
    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v2, " frame type "

    .line 82
    .line 83
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1, v1}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    throw p1

    .line 98
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v2, "Invalid padding bits for frame header "

    .line 101
    .line 102
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-static {p1, v1}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    throw p1
.end method

.method public final b(Ln1/o;)Z
    .locals 5

    .line 1
    invoke-interface {p1}, Ln1/o;->g()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lo1/a;->s:[B

    .line 5
    .line 6
    array-length v1, v0

    .line 7
    new-array v1, v1, [B

    .line 8
    .line 9
    array-length v2, v0

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-interface {p1, v1, v3, v2}, Ln1/o;->i([BII)V

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iput-boolean v3, p0, Lo1/a;->c:Z

    .line 22
    .line 23
    array-length v0, v0

    .line 24
    invoke-interface {p1, v0}, Ln1/o;->h(I)V

    .line 25
    .line 26
    .line 27
    return v2

    .line 28
    :cond_0
    invoke-interface {p1}, Ln1/o;->g()V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lo1/a;->t:[B

    .line 32
    .line 33
    array-length v1, v0

    .line 34
    new-array v1, v1, [B

    .line 35
    .line 36
    array-length v4, v0

    .line 37
    invoke-interface {p1, v1, v3, v4}, Ln1/o;->i([BII)V

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    iput-boolean v2, p0, Lo1/a;->c:Z

    .line 47
    .line 48
    array-length v0, v0

    .line 49
    invoke-interface {p1, v0}, Ln1/o;->h(I)V

    .line 50
    .line 51
    .line 52
    return v2

    .line 53
    :cond_1
    return v3
.end method

.method public final init(Ln1/p;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lo1/a;->j:Ln1/p;

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
    move-result-object v0

    .line 9
    iput-object v0, p0, Lo1/a;->k:Ln1/i0;

    .line 10
    .line 11
    iput-object v0, p0, Lo1/a;->l:Ln1/i0;

    .line 12
    .line 13
    invoke-interface {p1}, Ln1/p;->endTracks()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final read(Ln1/o;Ln1/a0;)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lo1/a;->k:Ln1/i0;

    .line 4
    .line 5
    invoke-static {v1}, Lh1/a;->k(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget v1, Lh1/i0;->a:I

    .line 9
    .line 10
    invoke-interface/range {p1 .. p1}, Ln1/o;->getPosition()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    const-wide/16 v3, 0x0

    .line 15
    .line 16
    cmp-long v1, v1, v3

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    invoke-virtual/range {p0 .. p1}, Lo1/a;->b(Ln1/o;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string v1, "Could not find AMR header."

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-static {v1, v2}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    throw v1

    .line 35
    :cond_1
    :goto_0
    iget-boolean v1, v0, Lo1/a;->p:Z

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    if-nez v1, :cond_5

    .line 39
    .line 40
    iput-boolean v2, v0, Lo1/a;->p:Z

    .line 41
    .line 42
    iget-boolean v1, v0, Lo1/a;->c:Z

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    const-string v5, "audio/amr-wb"

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    const-string v5, "audio/3gpp"

    .line 50
    .line 51
    :goto_1
    if-eqz v1, :cond_3

    .line 52
    .line 53
    const/16 v6, 0x3e80

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    const/16 v6, 0x1f40

    .line 57
    .line 58
    :goto_2
    if-eqz v1, :cond_4

    .line 59
    .line 60
    sget-object v1, Lo1/a;->r:[I

    .line 61
    .line 62
    const/16 v7, 0x8

    .line 63
    .line 64
    aget v1, v1, v7

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    sget-object v1, Lo1/a;->q:[I

    .line 68
    .line 69
    const/4 v7, 0x7

    .line 70
    aget v1, v1, v7

    .line 71
    .line 72
    :goto_3
    iget-object v7, v0, Lo1/a;->l:Ln1/i0;

    .line 73
    .line 74
    new-instance v8, Landroidx/media3/common/v;

    .line 75
    .line 76
    invoke-direct {v8}, Landroidx/media3/common/v;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-static {v5}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    iput-object v5, v8, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 84
    .line 85
    iput v1, v8, Landroidx/media3/common/v;->n:I

    .line 86
    .line 87
    iput v2, v8, Landroidx/media3/common/v;->B:I

    .line 88
    .line 89
    iput v6, v8, Landroidx/media3/common/v;->C:I

    .line 90
    .line 91
    new-instance v1, Landroidx/media3/common/w;

    .line 92
    .line 93
    invoke-direct {v1, v8}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v7, v1}, Ln1/i0;->format(Landroidx/media3/common/w;)V

    .line 97
    .line 98
    .line 99
    :cond_5
    iget v1, v0, Lo1/a;->f:I

    .line 100
    .line 101
    const/4 v5, 0x0

    .line 102
    const-wide/16 v6, 0x4e20

    .line 103
    .line 104
    const/4 v8, -0x1

    .line 105
    if-nez v1, :cond_b

    .line 106
    .line 107
    :try_start_0
    invoke-virtual/range {p0 .. p1}, Lo1/a;->a(Ln1/o;)I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    iput v1, v0, Lo1/a;->e:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    .line 113
    iput v1, v0, Lo1/a;->f:I

    .line 114
    .line 115
    iget v1, v0, Lo1/a;->g:I

    .line 116
    .line 117
    if-ne v1, v8, :cond_6

    .line 118
    .line 119
    invoke-interface/range {p1 .. p1}, Ln1/o;->getPosition()J

    .line 120
    .line 121
    .line 122
    iget v1, v0, Lo1/a;->e:I

    .line 123
    .line 124
    iput v1, v0, Lo1/a;->g:I

    .line 125
    .line 126
    :cond_6
    iget v1, v0, Lo1/a;->g:I

    .line 127
    .line 128
    iget v9, v0, Lo1/a;->e:I

    .line 129
    .line 130
    if-ne v1, v9, :cond_7

    .line 131
    .line 132
    iget v1, v0, Lo1/a;->h:I

    .line 133
    .line 134
    add-int/2addr v1, v2

    .line 135
    iput v1, v0, Lo1/a;->h:I

    .line 136
    .line 137
    :cond_7
    iget-object v1, v0, Lo1/a;->m:Ln1/c0;

    .line 138
    .line 139
    instance-of v9, v1, Ln1/y;

    .line 140
    .line 141
    if-eqz v9, :cond_b

    .line 142
    .line 143
    check-cast v1, Ln1/y;

    .line 144
    .line 145
    iget-wide v9, v0, Lo1/a;->i:J

    .line 146
    .line 147
    iget-wide v11, v0, Lo1/a;->d:J

    .line 148
    .line 149
    add-long/2addr v9, v11

    .line 150
    add-long/2addr v9, v6

    .line 151
    invoke-interface/range {p1 .. p1}, Ln1/o;->getPosition()J

    .line 152
    .line 153
    .line 154
    move-result-wide v11

    .line 155
    iget v13, v0, Lo1/a;->e:I

    .line 156
    .line 157
    int-to-long v13, v13

    .line 158
    add-long/2addr v11, v13

    .line 159
    iget-object v13, v1, Ln1/y;->b:La4/j;

    .line 160
    .line 161
    iget v14, v13, La4/j;->j:I

    .line 162
    .line 163
    if-nez v14, :cond_8

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_8
    sub-int/2addr v14, v2

    .line 167
    invoke-virtual {v13, v14}, La4/j;->f(I)J

    .line 168
    .line 169
    .line 170
    move-result-wide v13

    .line 171
    sub-long v13, v9, v13

    .line 172
    .line 173
    const-wide/32 v15, 0x186a0

    .line 174
    .line 175
    .line 176
    cmp-long v13, v13, v15

    .line 177
    .line 178
    if-gez v13, :cond_9

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_9
    :goto_4
    iget-object v13, v1, Ln1/y;->a:La4/j;

    .line 182
    .line 183
    iget-object v1, v1, Ln1/y;->b:La4/j;

    .line 184
    .line 185
    iget v14, v1, La4/j;->j:I

    .line 186
    .line 187
    if-nez v14, :cond_a

    .line 188
    .line 189
    cmp-long v14, v9, v3

    .line 190
    .line 191
    if-lez v14, :cond_a

    .line 192
    .line 193
    invoke-virtual {v13, v3, v4}, La4/j;->b(J)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v3, v4}, La4/j;->b(J)V

    .line 197
    .line 198
    .line 199
    :cond_a
    invoke-virtual {v13, v11, v12}, La4/j;->b(J)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1, v9, v10}, La4/j;->b(J)V

    .line 203
    .line 204
    .line 205
    :goto_5
    iget-boolean v1, v0, Lo1/a;->n:Z

    .line 206
    .line 207
    if-eqz v1, :cond_b

    .line 208
    .line 209
    iget-wide v3, v0, Lo1/a;->o:J

    .line 210
    .line 211
    sub-long/2addr v3, v9

    .line 212
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    .line 213
    .line 214
    .line 215
    move-result-wide v3

    .line 216
    cmp-long v1, v3, v6

    .line 217
    .line 218
    if-gez v1, :cond_b

    .line 219
    .line 220
    iput-boolean v5, v0, Lo1/a;->n:Z

    .line 221
    .line 222
    iget-object v1, v0, Lo1/a;->k:Ln1/i0;

    .line 223
    .line 224
    iput-object v1, v0, Lo1/a;->l:Ln1/i0;

    .line 225
    .line 226
    goto :goto_7

    .line 227
    :catch_0
    move-object/from16 v4, p1

    .line 228
    .line 229
    :goto_6
    move v5, v8

    .line 230
    goto :goto_8

    .line 231
    :cond_b
    :goto_7
    iget-object v1, v0, Lo1/a;->l:Ln1/i0;

    .line 232
    .line 233
    iget v3, v0, Lo1/a;->f:I

    .line 234
    .line 235
    move-object/from16 v4, p1

    .line 236
    .line 237
    invoke-interface {v1, v4, v3, v2}, Ln1/i0;->sampleData(Landroidx/media3/common/m;IZ)I

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    if-ne v1, v8, :cond_c

    .line 242
    .line 243
    goto :goto_6

    .line 244
    :cond_c
    iget v2, v0, Lo1/a;->f:I

    .line 245
    .line 246
    sub-int/2addr v2, v1

    .line 247
    iput v2, v0, Lo1/a;->f:I

    .line 248
    .line 249
    if-lez v2, :cond_d

    .line 250
    .line 251
    goto :goto_8

    .line 252
    :cond_d
    iget-object v9, v0, Lo1/a;->l:Ln1/i0;

    .line 253
    .line 254
    iget-wide v1, v0, Lo1/a;->i:J

    .line 255
    .line 256
    iget-wide v10, v0, Lo1/a;->d:J

    .line 257
    .line 258
    add-long/2addr v10, v1

    .line 259
    iget v13, v0, Lo1/a;->e:I

    .line 260
    .line 261
    const/4 v14, 0x0

    .line 262
    const/4 v15, 0x0

    .line 263
    const/4 v12, 0x1

    .line 264
    invoke-interface/range {v9 .. v15}, Ln1/i0;->sampleMetadata(JIIILn1/h0;)V

    .line 265
    .line 266
    .line 267
    iget-wide v1, v0, Lo1/a;->d:J

    .line 268
    .line 269
    add-long/2addr v1, v6

    .line 270
    iput-wide v1, v0, Lo1/a;->d:J

    .line 271
    .line 272
    :goto_8
    invoke-interface {v4}, Ln1/o;->getLength()J

    .line 273
    .line 274
    .line 275
    iget-object v1, v0, Lo1/a;->m:Ln1/c0;

    .line 276
    .line 277
    if-eqz v1, :cond_e

    .line 278
    .line 279
    goto :goto_9

    .line 280
    :cond_e
    new-instance v1, Ln1/s;

    .line 281
    .line 282
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    invoke-direct {v1, v2, v3}, Ln1/s;-><init>(J)V

    .line 288
    .line 289
    .line 290
    iput-object v1, v0, Lo1/a;->m:Ln1/c0;

    .line 291
    .line 292
    iget-object v2, v0, Lo1/a;->j:Ln1/p;

    .line 293
    .line 294
    invoke-interface {v2, v1}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 295
    .line 296
    .line 297
    :goto_9
    if-ne v5, v8, :cond_f

    .line 298
    .line 299
    iget-object v1, v0, Lo1/a;->m:Ln1/c0;

    .line 300
    .line 301
    instance-of v2, v1, Ln1/y;

    .line 302
    .line 303
    if-eqz v2, :cond_f

    .line 304
    .line 305
    iget-wide v2, v0, Lo1/a;->i:J

    .line 306
    .line 307
    iget-wide v6, v0, Lo1/a;->d:J

    .line 308
    .line 309
    add-long/2addr v2, v6

    .line 310
    move-object v4, v1

    .line 311
    check-cast v4, Ln1/y;

    .line 312
    .line 313
    iput-wide v2, v4, Ln1/y;->c:J

    .line 314
    .line 315
    iget-object v2, v0, Lo1/a;->j:Ln1/p;

    .line 316
    .line 317
    invoke-interface {v2, v1}, Ln1/p;->seekMap(Ln1/c0;)V

    .line 318
    .line 319
    .line 320
    :cond_f
    return v5
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method

.method public final seek(JJ)V
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lo1/a;->d:J

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iput v2, p0, Lo1/a;->e:I

    .line 7
    .line 8
    iput v2, p0, Lo1/a;->f:I

    .line 9
    .line 10
    iput-wide p3, p0, Lo1/a;->o:J

    .line 11
    .line 12
    iget-object p3, p0, Lo1/a;->m:Ln1/c0;

    .line 13
    .line 14
    instance-of p4, p3, Ln1/y;

    .line 15
    .line 16
    if-eqz p4, :cond_2

    .line 17
    .line 18
    check-cast p3, Ln1/y;

    .line 19
    .line 20
    iget-object p4, p3, Ln1/y;->b:La4/j;

    .line 21
    .line 22
    iget v0, p4, La4/j;->j:I

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object p3, p3, Ln1/y;->a:La4/j;

    .line 33
    .line 34
    invoke-static {p3, p1, p2}, Lh1/i0;->b(La4/j;J)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {p4, p1}, La4/j;->f(I)J

    .line 39
    .line 40
    .line 41
    move-result-wide p1

    .line 42
    :goto_0
    iput-wide p1, p0, Lo1/a;->i:J

    .line 43
    .line 44
    iget-wide p3, p0, Lo1/a;->o:J

    .line 45
    .line 46
    sub-long/2addr p3, p1

    .line 47
    invoke-static {p3, p4}, Ljava/lang/Math;->abs(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    const-wide/16 p3, 0x4e20

    .line 52
    .line 53
    cmp-long p1, p1, p3

    .line 54
    .line 55
    if-gez p1, :cond_1

    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    const/4 p1, 0x1

    .line 59
    iput-boolean p1, p0, Lo1/a;->n:Z

    .line 60
    .line 61
    iget-object p1, p0, Lo1/a;->b:Ln1/m;

    .line 62
    .line 63
    iput-object p1, p0, Lo1/a;->l:Ln1/i0;

    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    cmp-long p4, p1, v0

    .line 67
    .line 68
    if-eqz p4, :cond_3

    .line 69
    .line 70
    instance-of p4, p3, Lg2/a;

    .line 71
    .line 72
    if-eqz p4, :cond_3

    .line 73
    .line 74
    check-cast p3, Lg2/a;

    .line 75
    .line 76
    iget-wide v2, p3, Lg2/a;->b:J

    .line 77
    .line 78
    iget p3, p3, Lg2/a;->e:I

    .line 79
    .line 80
    sub-long/2addr p1, v2

    .line 81
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 82
    .line 83
    .line 84
    move-result-wide p1

    .line 85
    const-wide/32 v0, 0x7a1200

    .line 86
    .line 87
    .line 88
    mul-long/2addr p1, v0

    .line 89
    int-to-long p3, p3

    .line 90
    div-long/2addr p1, p3

    .line 91
    iput-wide p1, p0, Lo1/a;->i:J

    .line 92
    .line 93
    return-void

    .line 94
    :cond_3
    iput-wide v0, p0, Lo1/a;->i:J

    .line 95
    .line 96
    return-void
.end method

.method public final sniff(Ln1/o;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lo1/a;->b(Ln1/o;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method
