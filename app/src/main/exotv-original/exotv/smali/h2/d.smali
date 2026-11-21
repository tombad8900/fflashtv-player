.class public abstract Lh2/d;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Lh1/i0;->a:I

    .line 2
    .line 3
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    const-string v1, "OpusHead"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lh2/d;->a:[B

    .line 12
    .line 13
    return-void
.end method

.method public static a(Lh1/w;I)Lh2/b;
    .locals 10

    .line 1
    add-int/lit8 p1, p1, 0xc

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lh1/w;->G(I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0, p1}, Lh1/w;->H(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lh2/d;->b(Lh1/w;)I

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-virtual {p0, v0}, Lh1/w;->H(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lh1/w;->u()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    and-int/lit16 v2, v1, 0x80

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lh1/w;->H(I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    and-int/lit8 v2, v1, 0x40

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Lh1/w;->u()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p0, v2}, Lh1/w;->H(I)V

    .line 37
    .line 38
    .line 39
    :cond_1
    and-int/lit8 v1, v1, 0x20

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lh1/w;->H(I)V

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p0, p1}, Lh1/w;->H(I)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, Lh2/d;->b(Lh1/w;)I

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lh1/w;->u()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {v0}, Landroidx/media3/common/u0;->f(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v0, "audio/mpeg"

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_6

    .line 67
    .line 68
    const-string v0, "audio/vnd.dts"

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_6

    .line 75
    .line 76
    const-string v0, "audio/vnd.dts.hd"

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    const/4 v0, 0x4

    .line 86
    invoke-virtual {p0, v0}, Lh1/w;->H(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lh1/w;->w()J

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    invoke-virtual {p0}, Lh1/w;->w()J

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    invoke-virtual {p0, p1}, Lh1/w;->H(I)V

    .line 98
    .line 99
    .line 100
    invoke-static {p0}, Lh2/d;->b(Lh1/w;)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    move-wide v4, v3

    .line 105
    new-array v3, p1, [B

    .line 106
    .line 107
    const/4 v6, 0x0

    .line 108
    invoke-virtual {p0, v3, v6, p1}, Lh1/w;->e([BII)V

    .line 109
    .line 110
    .line 111
    move-wide p0, v0

    .line 112
    new-instance v1, Lh2/b;

    .line 113
    .line 114
    const-wide/16 v6, 0x0

    .line 115
    .line 116
    cmp-long v0, v4, v6

    .line 117
    .line 118
    const-wide/16 v8, -0x1

    .line 119
    .line 120
    if-lez v0, :cond_4

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_4
    move-wide v4, v8

    .line 124
    :goto_0
    cmp-long v0, p0, v6

    .line 125
    .line 126
    if-lez v0, :cond_5

    .line 127
    .line 128
    move-wide v6, p0

    .line 129
    goto :goto_1

    .line 130
    :cond_5
    move-wide v6, v8

    .line 131
    :goto_1
    invoke-direct/range {v1 .. v7}, Lh2/b;-><init>(Ljava/lang/String;[BJJ)V

    .line 132
    .line 133
    .line 134
    return-object v1

    .line 135
    :cond_6
    :goto_2
    new-instance v1, Lh2/b;

    .line 136
    .line 137
    const-wide/16 v4, -0x1

    .line 138
    .line 139
    const-wide/16 v6, -0x1

    .line 140
    .line 141
    const/4 v3, 0x0

    .line 142
    invoke-direct/range {v1 .. v7}, Lh2/b;-><init>(Ljava/lang/String;[BJJ)V

    .line 143
    .line 144
    .line 145
    return-object v1
.end method

.method public static b(Lh1/w;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lh1/w;->u()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit8 v1, v0, 0x7f

    .line 6
    .line 7
    :goto_0
    const/16 v2, 0x80

    .line 8
    .line 9
    and-int/2addr v0, v2

    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lh1/w;->u()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    shl-int/lit8 v1, v1, 0x7

    .line 17
    .line 18
    and-int/lit8 v2, v0, 0x7f

    .line 19
    .line 20
    or-int/2addr v1, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return v1
.end method

.method public static c(I)I
    .locals 0

    .line 1
    shr-int/lit8 p0, p0, 0x18

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0xff

    .line 4
    .line 5
    return p0
.end method

.method public static d(Lh1/w;)Li1/f;
    .locals 11

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lh1/w;->G(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lh1/w;->g()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Lh2/d;->c(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lh1/w;->w()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    invoke-virtual {p0}, Lh1/w;->w()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    :goto_0
    move-wide v5, v0

    .line 25
    move-wide v7, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {p0}, Lh1/w;->o()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-virtual {p0}, Lh1/w;->o()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    goto :goto_0

    .line 36
    :goto_1
    invoke-virtual {p0}, Lh1/w;->w()J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    new-instance v4, Li1/f;

    .line 41
    .line 42
    invoke-direct/range {v4 .. v10}, Li1/f;-><init>(JJJ)V

    .line 43
    .line 44
    .line 45
    return-object v4
.end method

.method public static e(Lh1/w;II)Landroid/util/Pair;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lh1/w;->b:I

    .line 4
    .line 5
    :goto_0
    sub-int v2, v1, p1

    .line 6
    .line 7
    move/from16 v4, p2

    .line 8
    .line 9
    if-ge v2, v4, :cond_10

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lh1/w;->G(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lh1/w;->g()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x1

    .line 20
    if-lez v2, :cond_0

    .line 21
    .line 22
    move v7, v6

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move v7, v5

    .line 25
    :goto_1
    const-string v8, "childAtomSize must be positive"

    .line 26
    .line 27
    invoke-static {v8, v7}, Ln1/b;->d(Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lh1/w;->g()I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    const v8, 0x73696e66

    .line 35
    .line 36
    .line 37
    if-ne v7, v8, :cond_f

    .line 38
    .line 39
    add-int/lit8 v7, v1, 0x8

    .line 40
    .line 41
    const/4 v8, -0x1

    .line 42
    move v12, v5

    .line 43
    move v9, v8

    .line 44
    const/4 v10, 0x0

    .line 45
    const/4 v11, 0x0

    .line 46
    :goto_2
    sub-int v13, v7, v1

    .line 47
    .line 48
    const/4 v14, 0x4

    .line 49
    if-ge v13, v2, :cond_4

    .line 50
    .line 51
    invoke-virtual {v0, v7}, Lh1/w;->G(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lh1/w;->g()I

    .line 55
    .line 56
    .line 57
    move-result v13

    .line 58
    invoke-virtual {v0}, Lh1/w;->g()I

    .line 59
    .line 60
    .line 61
    move-result v15

    .line 62
    const/16 v16, 0x0

    .line 63
    .line 64
    const v3, 0x66726d61

    .line 65
    .line 66
    .line 67
    if-ne v15, v3, :cond_1

    .line 68
    .line 69
    invoke-virtual {v0}, Lh1/w;->g()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    goto :goto_3

    .line 78
    :cond_1
    const v3, 0x7363686d

    .line 79
    .line 80
    .line 81
    if-ne v15, v3, :cond_2

    .line 82
    .line 83
    invoke-virtual {v0, v14}, Lh1/w;->H(I)V

    .line 84
    .line 85
    .line 86
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 87
    .line 88
    invoke-virtual {v0, v14, v3}, Lh1/w;->s(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    goto :goto_3

    .line 93
    :cond_2
    const v3, 0x73636869

    .line 94
    .line 95
    .line 96
    if-ne v15, v3, :cond_3

    .line 97
    .line 98
    move v9, v7

    .line 99
    move v12, v13

    .line 100
    :cond_3
    :goto_3
    add-int/2addr v7, v13

    .line 101
    goto :goto_2

    .line 102
    :cond_4
    const/16 v16, 0x0

    .line 103
    .line 104
    const-string v3, "cenc"

    .line 105
    .line 106
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-nez v3, :cond_6

    .line 111
    .line 112
    const-string v3, "cbc1"

    .line 113
    .line 114
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-nez v3, :cond_6

    .line 119
    .line 120
    const-string v3, "cens"

    .line 121
    .line 122
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-nez v3, :cond_6

    .line 127
    .line 128
    const-string v3, "cbcs"

    .line 129
    .line 130
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-eqz v3, :cond_5

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_5
    move-object/from16 v3, v16

    .line 138
    .line 139
    goto/16 :goto_b

    .line 140
    .line 141
    :cond_6
    :goto_4
    if-eqz v10, :cond_7

    .line 142
    .line 143
    move v3, v6

    .line 144
    goto :goto_5

    .line 145
    :cond_7
    move v3, v5

    .line 146
    :goto_5
    const-string v7, "frma atom is mandatory"

    .line 147
    .line 148
    invoke-static {v7, v3}, Ln1/b;->d(Ljava/lang/String;Z)V

    .line 149
    .line 150
    .line 151
    if-eq v9, v8, :cond_8

    .line 152
    .line 153
    move v3, v6

    .line 154
    goto :goto_6

    .line 155
    :cond_8
    move v3, v5

    .line 156
    :goto_6
    const-string v7, "schi atom is mandatory"

    .line 157
    .line 158
    invoke-static {v7, v3}, Ln1/b;->d(Ljava/lang/String;Z)V

    .line 159
    .line 160
    .line 161
    add-int/lit8 v3, v9, 0x8

    .line 162
    .line 163
    :goto_7
    sub-int v7, v3, v9

    .line 164
    .line 165
    if-ge v7, v12, :cond_d

    .line 166
    .line 167
    invoke-virtual {v0, v3}, Lh1/w;->G(I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Lh1/w;->g()I

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    invoke-virtual {v0}, Lh1/w;->g()I

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    const v13, 0x74656e63

    .line 179
    .line 180
    .line 181
    if-ne v8, v13, :cond_c

    .line 182
    .line 183
    invoke-virtual {v0}, Lh1/w;->g()I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    invoke-static {v3}, Lh2/d;->c(I)I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    invoke-virtual {v0, v6}, Lh1/w;->H(I)V

    .line 192
    .line 193
    .line 194
    if-nez v3, :cond_9

    .line 195
    .line 196
    invoke-virtual {v0, v6}, Lh1/w;->H(I)V

    .line 197
    .line 198
    .line 199
    move v14, v5

    .line 200
    move v15, v14

    .line 201
    goto :goto_8

    .line 202
    :cond_9
    invoke-virtual {v0}, Lh1/w;->u()I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    and-int/lit16 v7, v3, 0xf0

    .line 207
    .line 208
    shr-int/2addr v7, v14

    .line 209
    and-int/lit8 v3, v3, 0xf

    .line 210
    .line 211
    move v15, v3

    .line 212
    move v14, v7

    .line 213
    :goto_8
    invoke-virtual {v0}, Lh1/w;->u()I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    if-ne v3, v6, :cond_a

    .line 218
    .line 219
    move-object v3, v10

    .line 220
    move v10, v6

    .line 221
    goto :goto_9

    .line 222
    :cond_a
    move-object v3, v10

    .line 223
    move v10, v5

    .line 224
    :goto_9
    invoke-virtual {v0}, Lh1/w;->u()I

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    const/16 v7, 0x10

    .line 229
    .line 230
    new-array v13, v7, [B

    .line 231
    .line 232
    invoke-virtual {v0, v13, v5, v7}, Lh1/w;->e([BII)V

    .line 233
    .line 234
    .line 235
    if-eqz v10, :cond_b

    .line 236
    .line 237
    if-nez v12, :cond_b

    .line 238
    .line 239
    invoke-virtual {v0}, Lh1/w;->u()I

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    new-array v8, v7, [B

    .line 244
    .line 245
    invoke-virtual {v0, v8, v5, v7}, Lh1/w;->e([BII)V

    .line 246
    .line 247
    .line 248
    move-object/from16 v16, v8

    .line 249
    .line 250
    :cond_b
    new-instance v9, Lh2/r;

    .line 251
    .line 252
    move-object v8, v3

    .line 253
    invoke-direct/range {v9 .. v16}, Lh2/r;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 254
    .line 255
    .line 256
    move-object v3, v9

    .line 257
    goto :goto_a

    .line 258
    :cond_c
    move-object v8, v10

    .line 259
    add-int/2addr v3, v7

    .line 260
    goto :goto_7

    .line 261
    :cond_d
    move-object v8, v10

    .line 262
    move-object/from16 v3, v16

    .line 263
    .line 264
    :goto_a
    if-eqz v3, :cond_e

    .line 265
    .line 266
    move v5, v6

    .line 267
    :cond_e
    const-string v6, "tenc atom is mandatory"

    .line 268
    .line 269
    invoke-static {v6, v5}, Ln1/b;->d(Ljava/lang/String;Z)V

    .line 270
    .line 271
    .line 272
    sget v5, Lh1/i0;->a:I

    .line 273
    .line 274
    invoke-static {v8, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    :goto_b
    if-eqz v3, :cond_f

    .line 279
    .line 280
    return-object v3

    .line 281
    :cond_f
    add-int/2addr v1, v2

    .line 282
    goto/16 :goto_0

    .line 283
    .line 284
    :cond_10
    const/16 v16, 0x0

    .line 285
    .line 286
    return-object v16
.end method

.method public static f(Lh1/w;IILjava/lang/String;Landroidx/media3/common/s;Z)Lb6/s;
    .locals 53

    move-object/from16 v0, p0

    move-object/from16 v9, p3

    move-object/from16 v6, p4

    .line 1
    sget-object v10, Ln1/b;->d:[I

    const/16 v11, 0xc

    invoke-virtual {v0, v11}, Lh1/w;->G(I)V

    .line 2
    invoke-virtual {v0}, Lh1/w;->g()I

    move-result v12

    .line 3
    new-instance v7, Lb6/s;

    invoke-direct {v7, v12}, Lb6/s;-><init>(I)V

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v12, :cond_9b

    .line 4
    iget v2, v0, Lh1/w;->b:I

    .line 5
    invoke-virtual {v0}, Lh1/w;->g()I

    move-result v3

    if-lez v3, :cond_0

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    .line 6
    :goto_1
    const-string v5, "childAtomSize must be positive"

    invoke-static {v5, v4}, Ln1/b;->d(Ljava/lang/String;Z)V

    .line 7
    invoke-virtual {v0}, Lh1/w;->g()I

    move-result v4

    const v14, 0x61766331

    if-eq v4, v14, :cond_9a

    const v14, 0x61766333

    if-eq v4, v14, :cond_9a

    const v14, 0x656e6376

    if-eq v4, v14, :cond_9a

    const v14, 0x6d317620

    if-eq v4, v14, :cond_9a

    const v14, 0x6d703476

    if-eq v4, v14, :cond_9a

    const v14, 0x68766331

    if-eq v4, v14, :cond_9a

    const v14, 0x68657631

    if-eq v4, v14, :cond_9a

    const v14, 0x73323633

    if-eq v4, v14, :cond_9a

    const v14, 0x48323633

    if-eq v4, v14, :cond_9a

    const v14, 0x68323633

    if-eq v4, v14, :cond_9a

    const v14, 0x76703038

    if-eq v4, v14, :cond_9a

    const v14, 0x76703039

    if-eq v4, v14, :cond_9a

    const v14, 0x61763031

    if-eq v4, v14, :cond_9a

    const v14, 0x64766176

    if-eq v4, v14, :cond_9a

    const v14, 0x64766131

    if-eq v4, v14, :cond_9a

    const v14, 0x64766865

    if-eq v4, v14, :cond_9a

    const v14, 0x64766831

    if-ne v4, v14, :cond_1

    move/from16 v5, p2

    move v1, v4

    move-object/from16 v21, v10

    move/from16 v22, v12

    const/4 v13, 0x0

    :goto_2
    move/from16 v4, p1

    goto/16 :goto_65

    :cond_1
    const v14, 0x6d703461

    const-wide/16 v16, 0x0

    const v11, 0x65632d33

    const v1, 0x61632d33

    const v13, 0x656e6361

    const v15, 0x616c6163

    if-eq v4, v14, :cond_c

    if-eq v4, v13, :cond_c

    if-eq v4, v1, :cond_c

    if-eq v4, v11, :cond_c

    const v14, 0x61632d34

    if-eq v4, v14, :cond_c

    const v14, 0x6d6c7061

    if-eq v4, v14, :cond_c

    const v14, 0x64747363

    if-eq v4, v14, :cond_c

    const v14, 0x64747365

    if-eq v4, v14, :cond_c

    const v14, 0x64747368

    if-eq v4, v14, :cond_c

    const v14, 0x6474736c

    if-eq v4, v14, :cond_c

    const v14, 0x64747378

    if-eq v4, v14, :cond_c

    const v14, 0x73616d72

    if-eq v4, v14, :cond_c

    const v14, 0x73617762

    if-eq v4, v14, :cond_c

    const v14, 0x6c70636d

    if-eq v4, v14, :cond_c

    const v14, 0x736f7774

    if-eq v4, v14, :cond_c

    const v14, 0x74776f73

    if-eq v4, v14, :cond_c

    const v14, 0x2e6d7032

    if-eq v4, v14, :cond_c

    const v14, 0x2e6d7033

    if-eq v4, v14, :cond_c

    const v14, 0x6d686131

    if-eq v4, v14, :cond_c

    const v14, 0x6d686d31

    if-eq v4, v14, :cond_c

    if-eq v4, v15, :cond_c

    const v14, 0x616c6177

    if-eq v4, v14, :cond_c

    const v14, 0x756c6177

    if-eq v4, v14, :cond_c

    const v14, 0x4f707573

    if-eq v4, v14, :cond_c

    const v14, 0x664c6143

    if-eq v4, v14, :cond_c

    const v14, 0x69616d66

    if-ne v4, v14, :cond_2

    goto/16 :goto_8

    :cond_2
    const v1, 0x63363038

    const v5, 0x73747070

    const v11, 0x77767474

    const v13, 0x74783367

    const v14, 0x54544d4c

    if-eq v4, v14, :cond_6

    if-eq v4, v13, :cond_6

    if-eq v4, v11, :cond_6

    if-eq v4, v5, :cond_6

    if-ne v4, v1, :cond_3

    goto :goto_4

    :cond_3
    const v1, 0x6d657474

    if-ne v4, v1, :cond_5

    add-int/lit8 v5, v2, 0x10

    .line 8
    invoke-virtual {v0, v5}, Lh1/w;->G(I)V

    if-ne v4, v1, :cond_4

    .line 9
    invoke-virtual {v0}, Lh1/w;->p()Ljava/lang/String;

    .line 10
    invoke-virtual {v0}, Lh1/w;->p()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 11
    new-instance v4, Landroidx/media3/common/v;

    invoke-direct {v4}, Landroidx/media3/common/v;-><init>()V

    .line 12
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 13
    invoke-static {v1}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v4, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 14
    new-instance v1, Landroidx/media3/common/w;

    invoke-direct {v1, v4}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 15
    iput-object v1, v7, Lb6/s;->d:Ljava/lang/Object;

    :cond_4
    :goto_3
    move v15, v2

    move/from16 v25, v3

    move/from16 v20, v8

    move-object/from16 v21, v10

    move/from16 v22, v12

    const/4 v13, 0x0

    goto/16 :goto_66

    :cond_5
    const v1, 0x63616d6d

    if-ne v4, v1, :cond_4

    .line 16
    new-instance v1, Landroidx/media3/common/v;

    invoke-direct {v1}, Landroidx/media3/common/v;-><init>()V

    .line 17
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 18
    const-string v4, "application/x-camera-motion"

    .line 19
    invoke-static {v4}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 20
    new-instance v4, Landroidx/media3/common/w;

    invoke-direct {v4, v1}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 21
    iput-object v4, v7, Lb6/s;->d:Ljava/lang/Object;

    goto :goto_3

    :cond_6
    :goto_4
    add-int/lit8 v15, v2, 0x10

    .line 22
    invoke-virtual {v0, v15}, Lh1/w;->G(I)V

    .line 23
    const-string v15, "application/ttml+xml"

    const-wide v20, 0x7fffffffffffffffL

    if-ne v4, v14, :cond_7

    :goto_5
    move-wide/from16 v4, v20

    :goto_6
    const/4 v1, 0x0

    goto :goto_7

    :cond_7
    if-ne v4, v13, :cond_8

    add-int/lit8 v1, v3, -0x10

    .line 24
    new-array v4, v1, [B

    const/4 v5, 0x0

    .line 25
    invoke-virtual {v0, v4, v5, v1}, Lh1/w;->e([BII)V

    .line 26
    invoke-static {v4}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    move-result-object v15

    .line 27
    const-string v1, "application/x-quicktime-tx3g"

    move-object v4, v15

    move-object v15, v1

    move-object v1, v4

    move-wide/from16 v4, v20

    goto :goto_7

    :cond_8
    if-ne v4, v11, :cond_9

    .line 28
    const-string v15, "application/x-mp4-vtt"

    goto :goto_5

    :cond_9
    if-ne v4, v5, :cond_a

    move-wide/from16 v4, v16

    goto :goto_6

    :cond_a
    if-ne v4, v1, :cond_b

    const/4 v1, 0x1

    .line 29
    iput v1, v7, Lb6/s;->b:I

    const-string v15, "application/x-mp4-cea-608"

    goto :goto_5

    .line 30
    :goto_7
    new-instance v11, Landroidx/media3/common/v;

    invoke-direct {v11}, Landroidx/media3/common/v;-><init>()V

    .line 31
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v13

    iput-object v13, v11, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 32
    invoke-static {v15}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    iput-object v13, v11, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 33
    iput-object v9, v11, Landroidx/media3/common/v;->d:Ljava/lang/String;

    .line 34
    iput-wide v4, v11, Landroidx/media3/common/v;->r:J

    .line 35
    iput-object v1, v11, Landroidx/media3/common/v;->p:Ljava/util/List;

    .line 36
    new-instance v1, Landroidx/media3/common/w;

    invoke-direct {v1, v11}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 37
    iput-object v1, v7, Lb6/s;->d:Ljava/lang/Object;

    goto/16 :goto_3

    .line 38
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_c
    :goto_8
    add-int/lit8 v14, v2, 0x10

    .line 39
    invoke-virtual {v0, v14}, Lh1/w;->G(I)V

    const/4 v14, 0x6

    const/16 v15, 0x8

    if-eqz p5, :cond_d

    .line 40
    invoke-virtual {v0}, Lh1/w;->A()I

    move-result v38

    .line 41
    invoke-virtual {v0, v14}, Lh1/w;->H(I)V

    move/from16 v11, v38

    goto :goto_9

    .line 42
    :cond_d
    invoke-virtual {v0, v15}, Lh1/w;->H(I)V

    const/4 v11, 0x0

    :goto_9
    const/16 v1, 0x10

    const/16 v40, 0x15

    const/high16 v42, 0x10000000

    const/4 v14, 0x4

    const/4 v13, 0x2

    if-eqz v11, :cond_e

    const/4 v15, 0x1

    if-ne v11, v15, :cond_f

    :cond_e
    move v15, v2

    move/from16 v47, v14

    goto/16 :goto_10

    :cond_f
    if-ne v11, v13, :cond_1a

    .line 43
    invoke-virtual {v0, v1}, Lh1/w;->H(I)V

    .line 44
    invoke-virtual {v0}, Lh1/w;->o()J

    move-result-wide v45

    invoke-static/range {v45 .. v46}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v45

    move v15, v2

    .line 45
    invoke-static/range {v45 .. v46}, Ljava/lang/Math;->round(D)J

    move-result-wide v1

    long-to-int v1, v1

    .line 46
    invoke-virtual {v0}, Lh1/w;->y()I

    move-result v2

    .line 47
    invoke-virtual {v0, v14}, Lh1/w;->H(I)V

    .line 48
    invoke-virtual {v0}, Lh1/w;->y()I

    move-result v11

    .line 49
    invoke-virtual {v0}, Lh1/w;->y()I

    move-result v45

    and-int/lit8 v46, v45, 0x1

    if-eqz v46, :cond_10

    const/16 v46, 0x1

    goto :goto_a

    :cond_10
    const/16 v46, 0x0

    :goto_a
    and-int/lit8 v45, v45, 0x2

    if-eqz v45, :cond_11

    const/16 v45, 0x1

    :goto_b
    move/from16 v47, v14

    goto :goto_c

    :cond_11
    const/16 v45, 0x0

    goto :goto_b

    :goto_c
    const/16 v14, 0x20

    if-nez v46, :cond_18

    const/16 v13, 0x8

    if-ne v11, v13, :cond_12

    const/4 v11, 0x3

    goto :goto_e

    :cond_12
    const/16 v13, 0x10

    if-ne v11, v13, :cond_14

    if-eqz v45, :cond_13

    move/from16 v11, v42

    goto :goto_d

    :cond_13
    const/4 v11, 0x2

    :goto_d
    const/16 v13, 0x8

    goto :goto_e

    :cond_14
    const/16 v13, 0x18

    if-ne v11, v13, :cond_16

    if-eqz v45, :cond_15

    const/high16 v11, 0x50000000

    goto :goto_d

    :cond_15
    move/from16 v11, v40

    goto :goto_d

    :cond_16
    if-ne v11, v14, :cond_19

    if-eqz v45, :cond_17

    const/high16 v11, 0x60000000

    goto :goto_d

    :cond_17
    const/16 v11, 0x16

    goto :goto_d

    :cond_18
    if-ne v11, v14, :cond_19

    move/from16 v11, v47

    goto :goto_d

    :cond_19
    const/4 v11, -0x1

    goto :goto_d

    .line 50
    :goto_e
    invoke-virtual {v0, v13}, Lh1/w;->H(I)V

    move v13, v2

    move v2, v1

    move v1, v13

    const/4 v13, 0x0

    :goto_f
    const v14, 0x69616d66

    goto :goto_11

    :cond_1a
    move/from16 v23, v2

    move/from16 v25, v3

    move/from16 v20, v8

    move-object/from16 v21, v10

    move/from16 v22, v12

    const/4 v13, 0x0

    goto/16 :goto_64

    .line 51
    :goto_10
    invoke-virtual {v0}, Lh1/w;->A()I

    move-result v1

    const/4 v2, 0x6

    .line 52
    invoke-virtual {v0, v2}, Lh1/w;->H(I)V

    .line 53
    invoke-virtual {v0}, Lh1/w;->v()I

    move-result v2

    .line 54
    iget v13, v0, Lh1/w;->b:I

    add-int/lit8 v13, v13, -0x4

    .line 55
    invoke-virtual {v0, v13}, Lh1/w;->G(I)V

    .line 56
    invoke-virtual {v0}, Lh1/w;->g()I

    move-result v13

    const/4 v14, 0x1

    if-ne v11, v14, :cond_1b

    const/16 v11, 0x10

    .line 57
    invoke-virtual {v0, v11}, Lh1/w;->H(I)V

    :cond_1b
    const/4 v11, -0x1

    goto :goto_f

    :goto_11
    if-ne v4, v14, :cond_1c

    const/4 v1, -0x1

    const/4 v2, -0x1

    .line 58
    :cond_1c
    iget v14, v0, Lh1/w;->b:I

    move/from16 v45, v1

    const v1, 0x656e6361

    if-ne v4, v1, :cond_1f

    .line 59
    invoke-static {v0, v15, v3}, Lh2/d;->e(Lh1/w;II)Landroid/util/Pair;

    move-result-object v1

    if-eqz v1, :cond_1e

    .line 60
    iget-object v4, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-nez v6, :cond_1d

    move/from16 v41, v2

    const/16 v48, 0x0

    goto :goto_12

    :cond_1d
    move/from16 v41, v2

    .line 61
    iget-object v2, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Lh2/r;

    iget-object v2, v2, Lh2/r;->b:Ljava/lang/String;

    invoke-virtual {v6, v2}, Landroidx/media3/common/s;->a(Ljava/lang/String;)Landroidx/media3/common/s;

    move-result-object v2

    move-object/from16 v48, v2

    .line 62
    :goto_12
    iget-object v2, v7, Lb6/s;->c:Ljava/lang/Cloneable;

    check-cast v2, [Lh2/r;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Lh2/r;

    aput-object v1, v2, v8

    move-object/from16 v2, v48

    goto :goto_13

    :cond_1e
    move/from16 v41, v2

    move-object v2, v6

    .line 63
    :goto_13
    invoke-virtual {v0, v14}, Lh1/w;->G(I)V

    goto :goto_14

    :cond_1f
    move/from16 v41, v2

    move-object v2, v6

    .line 64
    :goto_14
    const-string v1, "audio/mhm1"

    const-string v48, "audio/ac4"

    const-string v49, "audio/eac3"

    const-string v50, "audio/ac3"

    const v6, 0x61632d33

    if-ne v4, v6, :cond_20

    move-object/from16 v4, v50

    goto/16 :goto_18

    :cond_20
    const v6, 0x65632d33

    if-ne v4, v6, :cond_21

    move-object/from16 v4, v49

    goto/16 :goto_18

    :cond_21
    const v6, 0x61632d34

    if-ne v4, v6, :cond_22

    move-object/from16 v4, v48

    goto/16 :goto_18

    :cond_22
    const v6, 0x64747363

    if-ne v4, v6, :cond_23

    .line 65
    const-string v4, "audio/vnd.dts"

    goto/16 :goto_18

    :cond_23
    const v6, 0x64747368

    if-eq v4, v6, :cond_38

    const v6, 0x6474736c

    if-ne v4, v6, :cond_24

    goto/16 :goto_17

    :cond_24
    const v6, 0x64747365

    if-ne v4, v6, :cond_25

    .line 66
    const-string v4, "audio/vnd.dts.hd;profile=lbr"

    goto/16 :goto_18

    :cond_25
    const v6, 0x64747378

    if-ne v4, v6, :cond_26

    .line 67
    const-string v4, "audio/vnd.dts.uhd;profile=p2"

    goto/16 :goto_18

    :cond_26
    const v6, 0x73616d72

    if-ne v4, v6, :cond_27

    .line 68
    const-string v4, "audio/3gpp"

    goto/16 :goto_18

    :cond_27
    const v6, 0x73617762

    if-ne v4, v6, :cond_28

    .line 69
    const-string v4, "audio/amr-wb"

    goto/16 :goto_18

    .line 70
    :cond_28
    const-string v6, "audio/raw"

    move-object/from16 v32, v6

    const v6, 0x736f7774

    if-ne v4, v6, :cond_29

    :goto_15
    move-object/from16 v4, v32

    const/4 v11, 0x2

    goto/16 :goto_18

    :cond_29
    const v6, 0x74776f73

    if-ne v4, v6, :cond_2a

    move-object/from16 v4, v32

    move/from16 v11, v42

    goto/16 :goto_18

    :cond_2a
    const v6, 0x6c70636d

    if-ne v4, v6, :cond_2c

    const/4 v6, -0x1

    if-ne v11, v6, :cond_2b

    goto :goto_15

    :cond_2b
    move-object/from16 v4, v32

    goto/16 :goto_18

    :cond_2c
    const v6, 0x2e6d7032

    if-eq v4, v6, :cond_37

    const v6, 0x2e6d7033

    if-ne v4, v6, :cond_2d

    goto :goto_16

    :cond_2d
    const v6, 0x6d686131

    if-ne v4, v6, :cond_2e

    .line 71
    const-string v4, "audio/mha1"

    goto :goto_18

    :cond_2e
    const v6, 0x6d686d31

    if-ne v4, v6, :cond_2f

    move-object v4, v1

    goto :goto_18

    :cond_2f
    const v6, 0x616c6163

    if-ne v4, v6, :cond_30

    .line 72
    const-string v4, "audio/alac"

    goto :goto_18

    :cond_30
    const v6, 0x616c6177

    if-ne v4, v6, :cond_31

    .line 73
    const-string v4, "audio/g711-alaw"

    goto :goto_18

    :cond_31
    const v6, 0x756c6177

    if-ne v4, v6, :cond_32

    .line 74
    const-string v4, "audio/g711-mlaw"

    goto :goto_18

    :cond_32
    const v6, 0x4f707573

    if-ne v4, v6, :cond_33

    .line 75
    const-string v4, "audio/opus"

    goto :goto_18

    :cond_33
    const v6, 0x664c6143

    if-ne v4, v6, :cond_34

    .line 76
    const-string v4, "audio/flac"

    goto :goto_18

    :cond_34
    const v6, 0x6d6c7061

    if-ne v4, v6, :cond_35

    .line 77
    const-string v4, "audio/true-hd"

    goto :goto_18

    :cond_35
    const v6, 0x69616d66

    if-ne v4, v6, :cond_36

    .line 78
    const-string v4, "audio/iamf"

    goto :goto_18

    :cond_36
    const/4 v4, 0x0

    goto :goto_18

    .line 79
    :cond_37
    :goto_16
    const-string v4, "audio/mpeg"

    goto :goto_18

    .line 80
    :cond_38
    :goto_17
    const-string v4, "audio/vnd.dts.hd"

    :goto_18
    move/from16 v20, v8

    move-object/from16 v21, v10

    move/from16 v22, v12

    move v8, v14

    move/from16 v23, v15

    move/from16 v6, v41

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v24, 0x0

    move-object v14, v4

    move/from16 v4, v45

    :goto_19
    sub-int v15, v8, v23

    if-ge v15, v3, :cond_97

    .line 81
    invoke-virtual {v0, v8}, Lh1/w;->G(I)V

    .line 82
    invoke-virtual {v0}, Lh1/w;->g()I

    move-result v15

    move/from16 v25, v3

    if-lez v15, :cond_39

    const/4 v3, 0x1

    goto :goto_1a

    :cond_39
    const/4 v3, 0x0

    .line 83
    :goto_1a
    invoke-static {v5, v3}, Ln1/b;->d(Ljava/lang/String;Z)V

    .line 84
    invoke-virtual {v0}, Lh1/w;->g()I

    move-result v3

    move/from16 v26, v11

    const v11, 0x6d686143

    if-ne v3, v11, :cond_3d

    add-int/lit8 v3, v8, 0x8

    .line 85
    invoke-virtual {v0, v3}, Lh1/w;->G(I)V

    const/4 v3, 0x1

    .line 86
    invoke-virtual {v0, v3}, Lh1/w;->H(I)V

    .line 87
    invoke-virtual {v0}, Lh1/w;->u()I

    move-result v10

    .line 88
    invoke-virtual {v0, v3}, Lh1/w;->H(I)V

    .line 89
    invoke-static {v14, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3a

    .line 90
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v10, "mhm1.%02X"

    invoke-static {v10, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    :goto_1b
    move-object v10, v3

    goto :goto_1c

    .line 91
    :cond_3a
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v10, "mha1.%02X"

    invoke-static {v10, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_1b

    .line 92
    :goto_1c
    invoke-virtual {v0}, Lh1/w;->A()I

    move-result v3

    .line 93
    new-array v11, v3, [B

    move-object/from16 v27, v1

    const/4 v1, 0x0

    .line 94
    invoke-virtual {v0, v11, v1, v3}, Lh1/w;->e([BII)V

    if-nez v12, :cond_3b

    .line 95
    invoke-static {v11}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    move-result-object v3

    move-object v12, v3

    goto :goto_1d

    .line 96
    :cond_3b
    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    invoke-static {v11, v3}, Lf6/m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Lf6/l1;

    move-result-object v1

    move-object v12, v1

    :cond_3c
    :goto_1d
    move/from16 v45, v6

    move/from16 v18, v13

    move-object/from16 v30, v14

    const/4 v1, 0x1

    const/4 v13, 0x0

    const/16 v43, 0x3

    const/16 v44, 0x8

    const/16 v46, 0x2

    move-object v6, v5

    move v14, v8

    move v8, v15

    goto/16 :goto_63

    :cond_3d
    move-object/from16 v27, v1

    const v1, 0x6d686150

    if-ne v3, v1, :cond_3f

    add-int/lit8 v1, v8, 0x8

    .line 97
    invoke-virtual {v0, v1}, Lh1/w;->G(I)V

    .line 98
    invoke-virtual {v0}, Lh1/w;->u()I

    move-result v1

    if-lez v1, :cond_3c

    .line 99
    new-array v3, v1, [B

    const/4 v11, 0x0

    .line 100
    invoke-virtual {v0, v3, v11, v1}, Lh1/w;->e([BII)V

    if-nez v12, :cond_3e

    .line 101
    invoke-static {v3}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    move-result-object v12

    goto :goto_1d

    .line 102
    :cond_3e
    invoke-interface {v12, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    invoke-static {v1, v3}, Lf6/m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Lf6/l1;

    move-result-object v12

    goto :goto_1d

    :cond_3f
    const v11, 0x65736473

    if-eq v3, v11, :cond_8a

    if-eqz p5, :cond_40

    const v11, 0x77617665

    if-ne v3, v11, :cond_40

    move-object/from16 v34, v5

    move v5, v6

    move/from16 v41, v8

    move-object/from16 v33, v10

    move-object/from16 v31, v12

    move-object/from16 v30, v14

    move/from16 v37, v15

    move/from16 v11, v47

    const v1, 0x65736473

    const/16 v10, 0xc

    const/16 v15, 0x10

    const/16 v43, 0x3

    const/16 v44, 0x8

    const/16 v46, 0x2

    goto/16 :goto_53

    :cond_40
    const v11, 0x64616333

    if-ne v3, v11, :cond_42

    add-int/lit8 v3, v8, 0x8

    .line 103
    invoke-virtual {v0, v3}, Lh1/w;->G(I)V

    .line 104
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    .line 105
    new-instance v11, Lh1/v;

    const/4 v1, 0x0

    invoke-direct {v11, v1}, Lh1/v;-><init>(I)V

    .line 106
    invoke-virtual {v11, v0}, Lh1/v;->q(Lh1/w;)V

    const/4 v1, 0x2

    .line 107
    invoke-virtual {v11, v1}, Lh1/v;->k(I)I

    move-result v29

    .line 108
    aget v1, v21, v29

    move-object/from16 v30, v14

    const/16 v14, 0x8

    .line 109
    invoke-virtual {v11, v14}, Lh1/v;->v(I)V

    .line 110
    sget-object v14, Ln1/b;->f:[I

    move-object/from16 v29, v14

    const/4 v14, 0x3

    invoke-virtual {v11, v14}, Lh1/v;->k(I)I

    move-result v31

    aget v14, v29, v31

    move/from16 v29, v14

    const/4 v14, 0x1

    .line 111
    invoke-virtual {v11, v14}, Lh1/v;->k(I)I

    move-result v31

    if-eqz v31, :cond_41

    add-int/lit8 v14, v29, 0x1

    :goto_1e
    move-object/from16 v31, v12

    const/4 v12, 0x5

    goto :goto_1f

    :cond_41
    move/from16 v14, v29

    goto :goto_1e

    .line 112
    :goto_1f
    invoke-virtual {v11, v12}, Lh1/v;->k(I)I

    move-result v12

    .line 113
    sget-object v28, Ln1/b;->g:[I

    aget v12, v28, v12

    mul-int/lit16 v12, v12, 0x3e8

    .line 114
    invoke-virtual {v11}, Lh1/v;->d()V

    .line 115
    invoke-virtual {v11}, Lh1/v;->h()I

    move-result v11

    invoke-virtual {v0, v11}, Lh1/w;->G(I)V

    .line 116
    new-instance v11, Landroidx/media3/common/v;

    invoke-direct {v11}, Landroidx/media3/common/v;-><init>()V

    .line 117
    iput-object v3, v11, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 118
    invoke-static/range {v50 .. v50}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v11, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 119
    iput v14, v11, Landroidx/media3/common/v;->B:I

    .line 120
    iput v1, v11, Landroidx/media3/common/v;->C:I

    .line 121
    iput-object v2, v11, Landroidx/media3/common/v;->q:Landroidx/media3/common/s;

    .line 122
    iput-object v9, v11, Landroidx/media3/common/v;->d:Ljava/lang/String;

    .line 123
    iput v12, v11, Landroidx/media3/common/v;->h:I

    .line 124
    iput v12, v11, Landroidx/media3/common/v;->i:I

    .line 125
    new-instance v1, Landroidx/media3/common/w;

    invoke-direct {v1, v11}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 126
    iput-object v1, v7, Lb6/s;->d:Ljava/lang/Object;

    move-object/from16 v34, v5

    move v5, v6

    move/from16 v41, v8

    move-object/from16 v33, v10

    move/from16 v37, v15

    move/from16 v11, v47

    const/16 v10, 0xc

    :goto_20
    const/16 v15, 0x10

    const/16 v43, 0x3

    const/16 v44, 0x8

    :goto_21
    const/16 v46, 0x2

    goto/16 :goto_52

    :cond_42
    move-object/from16 v31, v12

    move-object/from16 v30, v14

    const v1, 0x64656333

    const/16 v11, 0xa

    const/16 v12, 0xd

    if-ne v3, v1, :cond_47

    add-int/lit8 v1, v8, 0x8

    .line 127
    invoke-virtual {v0, v1}, Lh1/w;->G(I)V

    .line 128
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 129
    new-instance v3, Lh1/v;

    const/4 v14, 0x0

    invoke-direct {v3, v14}, Lh1/v;-><init>(I)V

    .line 130
    invoke-virtual {v3, v0}, Lh1/v;->q(Lh1/w;)V

    .line 131
    invoke-virtual {v3, v12}, Lh1/v;->k(I)I

    move-result v12

    mul-int/lit16 v12, v12, 0x3e8

    const/4 v14, 0x3

    .line 132
    invoke-virtual {v3, v14}, Lh1/v;->v(I)V

    const/4 v14, 0x2

    .line 133
    invoke-virtual {v3, v14}, Lh1/v;->k(I)I

    move-result v28

    .line 134
    aget v14, v21, v28

    .line 135
    invoke-virtual {v3, v11}, Lh1/v;->v(I)V

    .line 136
    sget-object v11, Ln1/b;->f:[I

    move-object/from16 v28, v11

    const/4 v11, 0x3

    invoke-virtual {v3, v11}, Lh1/v;->k(I)I

    move-result v29

    aget v28, v28, v29

    const/4 v11, 0x1

    .line 137
    invoke-virtual {v3, v11}, Lh1/v;->k(I)I

    move-result v18

    if-eqz v18, :cond_43

    add-int/lit8 v28, v28, 0x1

    :cond_43
    const/4 v11, 0x3

    .line 138
    invoke-virtual {v3, v11}, Lh1/v;->v(I)V

    move/from16 v11, v47

    .line 139
    invoke-virtual {v3, v11}, Lh1/v;->k(I)I

    move-result v29

    const/4 v11, 0x1

    .line 140
    invoke-virtual {v3, v11}, Lh1/v;->v(I)V

    move-object/from16 v33, v10

    if-lez v29, :cond_45

    const/4 v10, 0x6

    .line 141
    invoke-virtual {v3, v10}, Lh1/v;->v(I)V

    .line 142
    invoke-virtual {v3, v11}, Lh1/v;->k(I)I

    move-result v10

    if-eqz v10, :cond_44

    add-int/lit8 v28, v28, 0x2

    .line 143
    :cond_44
    invoke-virtual {v3, v11}, Lh1/v;->v(I)V

    :cond_45
    move/from16 v10, v28

    .line 144
    invoke-virtual {v3}, Lh1/v;->c()I

    move-result v11

    move-object/from16 v34, v5

    const/4 v5, 0x7

    if-le v11, v5, :cond_46

    .line 145
    invoke-virtual {v3, v5}, Lh1/v;->v(I)V

    const/4 v11, 0x1

    .line 146
    invoke-virtual {v3, v11}, Lh1/v;->k(I)I

    move-result v5

    if-eqz v5, :cond_46

    .line 147
    const-string v5, "audio/eac3-joc"

    goto :goto_22

    :cond_46
    move-object/from16 v5, v49

    .line 148
    :goto_22
    invoke-virtual {v3}, Lh1/v;->d()V

    .line 149
    invoke-virtual {v3}, Lh1/v;->h()I

    move-result v3

    invoke-virtual {v0, v3}, Lh1/w;->G(I)V

    .line 150
    new-instance v3, Landroidx/media3/common/v;

    invoke-direct {v3}, Landroidx/media3/common/v;-><init>()V

    .line 151
    iput-object v1, v3, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 152
    invoke-static {v5}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v3, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 153
    iput v10, v3, Landroidx/media3/common/v;->B:I

    .line 154
    iput v14, v3, Landroidx/media3/common/v;->C:I

    .line 155
    iput-object v2, v3, Landroidx/media3/common/v;->q:Landroidx/media3/common/s;

    .line 156
    iput-object v9, v3, Landroidx/media3/common/v;->d:Ljava/lang/String;

    .line 157
    iput v12, v3, Landroidx/media3/common/v;->i:I

    .line 158
    new-instance v1, Landroidx/media3/common/w;

    invoke-direct {v1, v3}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 159
    iput-object v1, v7, Lb6/s;->d:Ljava/lang/Object;

    move v5, v6

    move/from16 v41, v8

    move/from16 v37, v15

    const/16 v10, 0xc

    const/4 v11, 0x4

    goto/16 :goto_20

    :cond_47
    move-object/from16 v34, v5

    move-object/from16 v33, v10

    const v1, 0x64616334

    const/16 v5, 0x9

    if-ne v3, v1, :cond_7e

    add-int/lit8 v1, v8, 0x8

    .line 160
    invoke-virtual {v0, v1}, Lh1/w;->G(I)V

    .line 161
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 162
    new-instance v3, Lh1/v;

    const/4 v14, 0x0

    invoke-direct {v3, v14}, Lh1/v;-><init>(I)V

    .line 163
    invoke-virtual {v3, v0}, Lh1/v;->q(Lh1/w;)V

    .line 164
    invoke-virtual {v3}, Lh1/v;->c()I

    move-result v10

    const/4 v14, 0x3

    .line 165
    invoke-virtual {v3, v14}, Lh1/v;->k(I)I

    move-result v12

    const/4 v14, 0x1

    if-gt v12, v14, :cond_7d

    const/4 v11, 0x7

    .line 166
    invoke-virtual {v3, v11}, Lh1/v;->k(I)I

    move-result v14

    .line 167
    invoke-virtual {v3}, Lh1/v;->j()Z

    move-result v11

    if-eqz v11, :cond_48

    const v11, 0xbb80

    :goto_23
    move/from16 v36, v10

    const/4 v10, 0x4

    goto :goto_24

    :cond_48
    const v11, 0xac44

    goto :goto_23

    .line 168
    :goto_24
    invoke-virtual {v3, v10}, Lh1/v;->v(I)V

    .line 169
    invoke-virtual {v3, v5}, Lh1/v;->k(I)I

    move-result v5

    const/4 v10, 0x1

    if-le v14, v10, :cond_4a

    if-eqz v12, :cond_49

    .line 170
    invoke-virtual {v3}, Lh1/v;->j()Z

    move-result v10

    if-eqz v10, :cond_4a

    const/16 v10, 0x10

    .line 171
    invoke-virtual {v3, v10}, Lh1/v;->v(I)V

    .line 172
    invoke-virtual {v3}, Lh1/v;->j()Z

    move-result v10

    if-eqz v10, :cond_4a

    const/16 v10, 0x80

    .line 173
    invoke-virtual {v3, v10}, Lh1/v;->v(I)V

    goto :goto_25

    .line 174
    :cond_49
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid AC-4 DSI version: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/media3/common/v0;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/v0;

    move-result-object v0

    throw v0

    :cond_4a
    :goto_25
    const/16 v10, 0x42

    const/4 v14, 0x1

    if-ne v12, v14, :cond_4c

    .line 175
    invoke-virtual {v3}, Lh1/v;->c()I

    move-result v14

    if-lt v14, v10, :cond_4b

    .line 176
    invoke-virtual {v3, v10}, Lh1/v;->v(I)V

    .line 177
    invoke-virtual {v3}, Lh1/v;->d()V

    goto :goto_26

    .line 178
    :cond_4b
    const-string v0, "Invalid AC-4 DSI bitrate."

    invoke-static {v0}, Landroidx/media3/common/v0;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/v0;

    move-result-object v0

    throw v0

    .line 179
    :cond_4c
    :goto_26
    new-instance v14, Ln1/c;

    .line 180
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    const/4 v10, 0x1

    .line 181
    iput-boolean v10, v14, Ln1/c;->a:Z

    const/4 v10, -0x1

    .line 182
    iput v10, v14, Ln1/c;->b:I

    .line 183
    iput v10, v14, Ln1/c;->c:I

    const/4 v10, 0x1

    .line 184
    iput-boolean v10, v14, Ln1/c;->d:Z

    const/4 v10, 0x2

    .line 185
    iput v10, v14, Ln1/c;->e:I

    const/4 v10, 0x0

    .line 186
    iput v10, v14, Ln1/c;->f:I

    move/from16 v37, v15

    const/4 v10, 0x0

    :goto_27
    if-ge v10, v5, :cond_72

    if-nez v12, :cond_4d

    .line 187
    invoke-virtual {v3}, Lh1/v;->j()Z

    move-result v5

    const/4 v15, 0x5

    .line 188
    invoke-virtual {v3, v15}, Lh1/v;->k(I)I

    move-result v29

    .line 189
    invoke-virtual {v3, v15}, Lh1/v;->k(I)I

    move-result v39

    move/from16 v41, v8

    move/from16 v15, v39

    const/4 v8, 0x0

    const/16 v42, 0x0

    move/from16 v39, v5

    move/from16 v5, v29

    const/16 v29, 0x0

    :goto_28
    move/from16 v45, v6

    goto :goto_2c

    :cond_4d
    move/from16 v39, v5

    const/16 v15, 0x8

    .line 190
    invoke-virtual {v3, v15}, Lh1/v;->k(I)I

    move-result v5

    move/from16 v41, v8

    .line 191
    invoke-virtual {v3, v15}, Lh1/v;->k(I)I

    move-result v8

    const/16 v15, 0xff

    if-ne v8, v15, :cond_4e

    const/16 v15, 0x10

    .line 192
    invoke-virtual {v3, v15}, Lh1/v;->k(I)I

    move-result v42

    add-int v42, v42, v8

    :goto_29
    const/4 v8, 0x2

    goto :goto_2a

    :cond_4e
    move/from16 v42, v8

    goto :goto_29

    :goto_2a
    if-le v5, v8, :cond_4f

    mul-int/lit8 v5, v42, 0x8

    .line 193
    invoke-virtual {v3, v5}, Lh1/v;->v(I)V

    add-int/lit8 v10, v10, 0x1

    move/from16 v5, v39

    move/from16 v8, v41

    goto :goto_27

    .line 194
    :cond_4f
    invoke-virtual {v3}, Lh1/v;->c()I

    move-result v8

    sub-int v8, v36, v8

    const/16 v44, 0x8

    div-int/lit8 v8, v8, 0x8

    move/from16 v39, v5

    const/4 v15, 0x5

    .line 195
    invoke-virtual {v3, v15}, Lh1/v;->k(I)I

    move-result v5

    const/16 v15, 0x1f

    if-ne v5, v15, :cond_50

    const/4 v15, 0x1

    goto :goto_2b

    :cond_50
    const/4 v15, 0x0

    :goto_2b
    move/from16 v29, v8

    move/from16 v8, v42

    move/from16 v42, v15

    move/from16 v15, v39

    const/16 v39, 0x0

    goto :goto_28

    :goto_2c
    if-nez v39, :cond_51

    if-nez v42, :cond_51

    const/4 v6, 0x6

    if-ne v5, v6, :cond_51

    move/from16 v51, v4

    move/from16 v35, v15

    const/4 v4, 0x1

    goto/16 :goto_40

    :cond_51
    move/from16 v51, v4

    const/4 v6, 0x3

    .line 196
    invoke-virtual {v3, v6}, Lh1/v;->k(I)I

    move-result v4

    iput v4, v14, Ln1/c;->f:I

    .line 197
    invoke-virtual {v3}, Lh1/v;->j()Z

    move-result v4

    if-eqz v4, :cond_52

    const/4 v4, 0x5

    .line 198
    invoke-virtual {v3, v4}, Lh1/v;->v(I)V

    :cond_52
    const/4 v4, 0x2

    .line 199
    invoke-virtual {v3, v4}, Lh1/v;->v(I)V

    const/4 v6, 0x1

    if-ne v12, v6, :cond_53

    if-eq v15, v6, :cond_54

    if-ne v15, v4, :cond_53

    goto :goto_2e

    :cond_53
    :goto_2d
    const/4 v4, 0x5

    goto :goto_2f

    .line 200
    :cond_54
    :goto_2e
    invoke-virtual {v3, v4}, Lh1/v;->v(I)V

    goto :goto_2d

    .line 201
    :goto_2f
    invoke-virtual {v3, v4}, Lh1/v;->v(I)V

    const/16 v4, 0xa

    .line 202
    invoke-virtual {v3, v4}, Lh1/v;->v(I)V

    if-ne v12, v6, :cond_5b

    if-lez v15, :cond_55

    .line 203
    invoke-virtual {v3}, Lh1/v;->j()Z

    move-result v4

    iput-boolean v4, v14, Ln1/c;->a:Z

    .line 204
    :cond_55
    iget-boolean v4, v14, Ln1/c;->a:Z

    if-eqz v4, :cond_5a

    if-eq v15, v6, :cond_56

    const/4 v4, 0x2

    if-ne v15, v4, :cond_57

    :cond_56
    const/4 v4, 0x5

    goto :goto_31

    :cond_57
    :goto_30
    const/16 v6, 0x18

    goto :goto_32

    .line 205
    :goto_31
    invoke-virtual {v3, v4}, Lh1/v;->k(I)I

    move-result v6

    if-ltz v6, :cond_58

    const/16 v4, 0xf

    if-gt v6, v4, :cond_58

    .line 206
    iput v6, v14, Ln1/c;->b:I

    :cond_58
    const/16 v4, 0xb

    if-lt v6, v4, :cond_59

    const/16 v4, 0xe

    if-gt v6, v4, :cond_59

    .line 207
    invoke-virtual {v3}, Lh1/v;->j()Z

    move-result v4

    iput-boolean v4, v14, Ln1/c;->d:Z

    const/4 v4, 0x2

    .line 208
    invoke-virtual {v3, v4}, Lh1/v;->k(I)I

    move-result v6

    iput v6, v14, Ln1/c;->e:I

    goto :goto_30

    :cond_59
    const/4 v4, 0x2

    goto :goto_30

    .line 209
    :goto_32
    invoke-virtual {v3, v6}, Lh1/v;->v(I)V

    :goto_33
    const/4 v6, 0x1

    goto :goto_34

    :cond_5a
    const/4 v4, 0x2

    goto :goto_33

    :goto_34
    if-eq v15, v6, :cond_5c

    if-ne v15, v4, :cond_5b

    goto :goto_35

    :cond_5b
    move/from16 v35, v15

    goto :goto_37

    .line 210
    :cond_5c
    :goto_35
    invoke-virtual {v3}, Lh1/v;->j()Z

    move-result v6

    if-eqz v6, :cond_5d

    .line 211
    invoke-virtual {v3}, Lh1/v;->j()Z

    move-result v6

    if-eqz v6, :cond_5d

    .line 212
    invoke-virtual {v3, v4}, Lh1/v;->v(I)V

    .line 213
    :cond_5d
    invoke-virtual {v3}, Lh1/v;->j()Z

    move-result v4

    if-eqz v4, :cond_5b

    .line 214
    invoke-virtual {v3}, Lh1/v;->u()V

    const/16 v4, 0x8

    .line 215
    invoke-virtual {v3, v4}, Lh1/v;->k(I)I

    move-result v6

    move/from16 v35, v15

    const/4 v15, 0x0

    :goto_36
    if-ge v15, v6, :cond_5e

    .line 216
    invoke-virtual {v3, v4}, Lh1/v;->v(I)V

    add-int/lit8 v15, v15, 0x1

    const/16 v4, 0x8

    goto :goto_36

    :cond_5e
    :goto_37
    if-nez v39, :cond_66

    if-eqz v42, :cond_5f

    goto/16 :goto_3e

    .line 217
    :cond_5f
    invoke-virtual {v3}, Lh1/v;->u()V

    if-eqz v5, :cond_64

    const/4 v6, 0x1

    if-eq v5, v6, :cond_64

    const/4 v4, 0x2

    if-eq v5, v4, :cond_64

    const/4 v6, 0x3

    if-eq v5, v6, :cond_62

    const/4 v4, 0x4

    if-eq v5, v4, :cond_62

    const/4 v4, 0x5

    if-eq v5, v4, :cond_60

    const/4 v5, 0x7

    .line 218
    invoke-virtual {v3, v5}, Lh1/v;->k(I)I

    move-result v4

    const/4 v5, 0x0

    :goto_38
    if-ge v5, v4, :cond_68

    const/16 v15, 0x8

    .line 219
    invoke-virtual {v3, v15}, Lh1/v;->v(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_38

    :cond_60
    if-nez v35, :cond_61

    .line 220
    invoke-static {v3, v14}, Ln1/b;->o(Lh1/v;Ln1/c;)V

    goto :goto_3f

    :cond_61
    const/4 v6, 0x3

    .line 221
    invoke-virtual {v3, v6}, Lh1/v;->k(I)I

    move-result v4

    const/4 v5, 0x0

    :goto_39
    const/16 v46, 0x2

    add-int/lit8 v6, v4, 0x2

    if-ge v5, v6, :cond_68

    .line 222
    invoke-static {v3, v14}, Ln1/b;->p(Lh1/v;Ln1/c;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_39

    :cond_62
    if-nez v35, :cond_63

    const/4 v4, 0x0

    const/4 v6, 0x3

    :goto_3a
    if-ge v4, v6, :cond_68

    .line 223
    invoke-static {v3, v14}, Ln1/b;->o(Lh1/v;Ln1/c;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_3a

    :cond_63
    const/4 v4, 0x0

    :goto_3b
    const/4 v6, 0x3

    if-ge v4, v6, :cond_68

    .line 224
    invoke-static {v3, v14}, Ln1/b;->p(Lh1/v;Ln1/c;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_3b

    :cond_64
    if-nez v35, :cond_65

    const/4 v4, 0x0

    const/4 v5, 0x2

    :goto_3c
    if-ge v4, v5, :cond_68

    .line 225
    invoke-static {v3, v14}, Ln1/b;->o(Lh1/v;Ln1/c;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_3c

    :cond_65
    const/4 v4, 0x0

    :goto_3d
    const/4 v5, 0x2

    if-ge v4, v5, :cond_68

    .line 226
    invoke-static {v3, v14}, Ln1/b;->p(Lh1/v;Ln1/c;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_3d

    :cond_66
    :goto_3e
    if-nez v35, :cond_67

    .line 227
    invoke-static {v3, v14}, Ln1/b;->o(Lh1/v;Ln1/c;)V

    goto :goto_3f

    .line 228
    :cond_67
    invoke-static {v3, v14}, Ln1/b;->p(Lh1/v;Ln1/c;)V

    .line 229
    :cond_68
    :goto_3f
    invoke-virtual {v3}, Lh1/v;->u()V

    .line 230
    invoke-virtual {v3}, Lh1/v;->j()Z

    move-result v4

    :goto_40
    const/4 v5, 0x7

    if-eqz v4, :cond_69

    .line 231
    invoke-virtual {v3, v5}, Lh1/v;->k(I)I

    move-result v4

    const/4 v6, 0x0

    :goto_41
    if-ge v6, v4, :cond_69

    const/16 v15, 0xf

    .line 232
    invoke-virtual {v3, v15}, Lh1/v;->v(I)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_41

    :cond_69
    if-lez v35, :cond_6e

    .line 233
    invoke-virtual {v3}, Lh1/v;->j()Z

    move-result v4

    if-eqz v4, :cond_6c

    .line 234
    invoke-virtual {v3}, Lh1/v;->c()I

    move-result v4

    const/16 v6, 0x42

    if-ge v4, v6, :cond_6a

    const/4 v4, 0x0

    goto :goto_42

    .line 235
    :cond_6a
    invoke-virtual {v3, v6}, Lh1/v;->v(I)V

    const/4 v4, 0x1

    :goto_42
    if-eqz v4, :cond_6b

    goto :goto_43

    .line 236
    :cond_6b
    const-string v0, "Can\'t parse bitrate DSI."

    invoke-static {v0}, Landroidx/media3/common/v0;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/v0;

    move-result-object v0

    throw v0

    .line 237
    :cond_6c
    :goto_43
    invoke-virtual {v3}, Lh1/v;->j()Z

    move-result v4

    if-eqz v4, :cond_6e

    .line 238
    invoke-virtual {v3}, Lh1/v;->d()V

    const/16 v15, 0x10

    .line 239
    invoke-virtual {v3, v15}, Lh1/v;->k(I)I

    move-result v4

    .line 240
    invoke-virtual {v3, v4}, Lh1/v;->w(I)V

    const/4 v4, 0x5

    .line 241
    invoke-virtual {v3, v4}, Lh1/v;->k(I)I

    move-result v6

    const/4 v4, 0x0

    :goto_44
    if-ge v4, v6, :cond_6d

    const/4 v5, 0x3

    .line 242
    invoke-virtual {v3, v5}, Lh1/v;->v(I)V

    const/16 v5, 0x8

    .line 243
    invoke-virtual {v3, v5}, Lh1/v;->v(I)V

    add-int/lit8 v4, v4, 0x1

    const/4 v5, 0x7

    goto :goto_44

    :cond_6d
    const/16 v5, 0x8

    goto :goto_45

    :cond_6e
    const/16 v5, 0x8

    const/16 v15, 0x10

    .line 244
    :goto_45
    invoke-virtual {v3}, Lh1/v;->d()V

    const/4 v6, 0x1

    if-ne v12, v6, :cond_70

    .line 245
    invoke-virtual {v3}, Lh1/v;->c()I

    move-result v4

    sub-int v4, v36, v4

    div-int/2addr v4, v5

    sub-int v4, v4, v29

    if-lt v8, v4, :cond_6f

    sub-int/2addr v8, v4

    .line 246
    invoke-virtual {v3, v8}, Lh1/v;->w(I)V

    goto :goto_46

    .line 247
    :cond_6f
    const-string v0, "pres_bytes is smaller than presentation bytes read."

    invoke-static {v0}, Landroidx/media3/common/v0;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/v0;

    move-result-object v0

    throw v0

    .line 248
    :cond_70
    :goto_46
    iget-boolean v3, v14, Ln1/c;->a:Z

    if-eqz v3, :cond_73

    iget v3, v14, Ln1/c;->b:I

    const/4 v6, -0x1

    if-eq v3, v6, :cond_71

    goto :goto_47

    .line 249
    :cond_71
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Can\'t determine channel mode of presentation "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/media3/common/v0;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/v0;

    move-result-object v0

    throw v0

    :cond_72
    move/from16 v51, v4

    move/from16 v45, v6

    move/from16 v41, v8

    const/16 v5, 0x8

    const/16 v15, 0x10

    .line 250
    :cond_73
    :goto_47
    iget-boolean v3, v14, Ln1/c;->a:Z

    if-eqz v3, :cond_79

    .line 251
    iget v3, v14, Ln1/c;->b:I

    iget-boolean v4, v14, Ln1/c;->d:Z

    iget v6, v14, Ln1/c;->e:I

    packed-switch v3, :pswitch_data_0

    const/16 v8, 0xb

    const/16 v28, -0x1

    goto :goto_48

    :pswitch_0
    const/16 v8, 0xb

    const/16 v28, 0x18

    goto :goto_48

    :pswitch_1
    const/16 v8, 0xb

    const/16 v28, 0xe

    goto :goto_48

    :pswitch_2
    const/16 v8, 0xb

    const/16 v28, 0xd

    goto :goto_48

    :pswitch_3
    const/16 v8, 0xb

    const/16 v28, 0xc

    goto :goto_48

    :pswitch_4
    const/16 v8, 0xb

    const/16 v28, 0xb

    goto :goto_48

    :pswitch_5
    move/from16 v28, v5

    const/16 v8, 0xb

    goto :goto_48

    :pswitch_6
    const/16 v8, 0xb

    const/16 v28, 0x7

    goto :goto_48

    :pswitch_7
    const/16 v8, 0xb

    const/16 v28, 0x6

    goto :goto_48

    :pswitch_8
    const/16 v8, 0xb

    const/16 v28, 0x5

    goto :goto_48

    :pswitch_9
    const/16 v8, 0xb

    const/16 v28, 0x3

    goto :goto_48

    :pswitch_a
    const/16 v8, 0xb

    const/16 v28, 0x2

    goto :goto_48

    :pswitch_b
    const/16 v8, 0xb

    const/16 v28, 0x1

    :goto_48
    const/16 v10, 0xc

    if-eq v3, v8, :cond_75

    if-eq v3, v10, :cond_75

    const/16 v8, 0xd

    if-eq v3, v8, :cond_75

    const/16 v8, 0xe

    if-ne v3, v8, :cond_74

    goto :goto_49

    :cond_74
    const/4 v3, 0x1

    goto :goto_4a

    :cond_75
    :goto_49
    if-nez v4, :cond_76

    add-int/lit8 v28, v28, -0x2

    :cond_76
    if-eqz v6, :cond_78

    const/4 v3, 0x1

    if-eq v6, v3, :cond_77

    goto :goto_4a

    :cond_77
    add-int/lit8 v28, v28, -0x2

    goto :goto_4a

    :cond_78
    const/4 v3, 0x1

    add-int/lit8 v28, v28, -0x4

    :goto_4a
    move/from16 v4, v28

    goto :goto_4b

    :cond_79
    const/4 v3, 0x1

    const/16 v10, 0xc

    .line 252
    iget v4, v14, Ln1/c;->c:I

    add-int/2addr v4, v3

    .line 253
    iget v3, v14, Ln1/c;->f:I

    const/4 v6, 0x4

    if-ne v3, v6, :cond_7b

    const/16 v3, 0x11

    if-ne v4, v3, :cond_7a

    move/from16 v28, v40

    goto :goto_4a

    :cond_7a
    move/from16 v28, v4

    goto :goto_4a

    :cond_7b
    :goto_4b
    if-lez v4, :cond_7c

    .line 254
    new-instance v3, Landroidx/media3/common/v;

    invoke-direct {v3}, Landroidx/media3/common/v;-><init>()V

    .line 255
    iput-object v1, v3, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 256
    invoke-static/range {v48 .. v48}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v3, Landroidx/media3/common/v;->m:Ljava/lang/String;

    .line 257
    iput v4, v3, Landroidx/media3/common/v;->B:I

    .line 258
    iput v11, v3, Landroidx/media3/common/v;->C:I

    .line 259
    iput-object v2, v3, Landroidx/media3/common/v;->q:Landroidx/media3/common/s;

    .line 260
    iput-object v9, v3, Landroidx/media3/common/v;->d:Ljava/lang/String;

    .line 261
    new-instance v1, Landroidx/media3/common/w;

    invoke-direct {v1, v3}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 262
    iput-object v1, v7, Lb6/s;->d:Ljava/lang/Object;

    move/from16 v44, v5

    move/from16 v5, v45

    move/from16 v4, v51

    const/4 v11, 0x4

    const/16 v43, 0x3

    goto/16 :goto_21

    .line 263
    :cond_7c
    const-string v0, "Can\'t determine channel count of presentation."

    invoke-static {v0}, Landroidx/media3/common/v0;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/v0;

    move-result-object v0

    throw v0

    .line 264
    :cond_7d
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported AC-4 DSI version: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/media3/common/v0;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/v0;

    move-result-object v0

    throw v0

    :cond_7e
    move/from16 v51, v4

    move/from16 v45, v6

    move/from16 v41, v8

    move/from16 v37, v15

    const/16 v10, 0xc

    const/16 v15, 0x10

    const/16 v44, 0x8

    const v1, 0x646d6c70

    if-ne v3, v1, :cond_80

    if-lez v13, :cond_7f

    move/from16 v18, v13

    move/from16 v45, v18

    move-object/from16 v12, v31

    move-object/from16 v10, v33

    move-object/from16 v6, v34

    move/from16 v8, v37

    move/from16 v14, v41

    const/4 v1, 0x1

    const/4 v4, 0x2

    :goto_4c
    const/4 v13, 0x0

    const/16 v43, 0x3

    const/16 v46, 0x2

    goto/16 :goto_63

    .line 265
    :cond_7f
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid sample rate for Dolby TrueHD MLP stream: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    move-result-object v0

    throw v0

    :cond_80
    const v1, 0x64647473

    if-eq v3, v1, :cond_81

    const v1, 0x75647473

    if-ne v3, v1, :cond_82

    :cond_81
    const/4 v11, 0x4

    const/16 v43, 0x3

    const/16 v46, 0x2

    goto/16 :goto_51

    :cond_82
    const v1, 0x644f7073

    if-ne v3, v1, :cond_83

    add-int/lit8 v1, v37, -0x8

    .line 266
    sget-object v3, Lh2/d;->a:[B

    array-length v4, v3

    add-int/2addr v4, v1

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v4

    add-int/lit8 v8, v41, 0x8

    .line 267
    invoke-virtual {v0, v8}, Lh1/w;->G(I)V

    .line 268
    array-length v3, v3

    invoke-virtual {v0, v4, v3, v1}, Lh1/w;->e([BII)V

    .line 269
    invoke-static {v4}, Ln1/b;->b([B)Ljava/util/ArrayList;

    move-result-object v12

    move/from16 v18, v13

    move-object/from16 v10, v33

    move-object/from16 v6, v34

    move/from16 v8, v37

    move/from16 v14, v41

    move/from16 v4, v51

    const/4 v1, 0x1

    goto :goto_4c

    :cond_83
    const v1, 0x64664c61

    if-ne v3, v1, :cond_84

    add-int/lit8 v1, v37, -0xc

    add-int/lit8 v3, v37, -0x8

    .line 270
    new-array v3, v3, [B

    const/16 v4, 0x66

    const/16 v19, 0x0

    .line 271
    aput-byte v4, v3, v19

    const/16 v4, 0x4c

    const/16 v18, 0x1

    .line 272
    aput-byte v4, v3, v18

    const/16 v4, 0x61

    const/16 v46, 0x2

    .line 273
    aput-byte v4, v3, v46

    const/16 v4, 0x43

    const/16 v43, 0x3

    .line 274
    aput-byte v4, v3, v43

    add-int/lit8 v8, v41, 0xc

    .line 275
    invoke-virtual {v0, v8}, Lh1/w;->G(I)V

    const/4 v11, 0x4

    .line 276
    invoke-virtual {v0, v3, v11, v1}, Lh1/w;->e([BII)V

    .line 277
    invoke-static {v3}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    move-result-object v12

    :goto_4d
    move/from16 v18, v13

    move-object/from16 v10, v33

    move-object/from16 v6, v34

    move/from16 v8, v37

    move/from16 v14, v41

    move/from16 v4, v51

    :goto_4e
    const/4 v1, 0x1

    const/4 v13, 0x0

    goto/16 :goto_63

    :cond_84
    const v6, 0x616c6163

    const/4 v11, 0x4

    const/16 v43, 0x3

    const/16 v46, 0x2

    if-ne v3, v6, :cond_85

    add-int/lit8 v1, v37, -0xc

    .line 278
    new-array v3, v1, [B

    add-int/lit8 v8, v41, 0xc

    .line 279
    invoke-virtual {v0, v8}, Lh1/w;->G(I)V

    const/4 v14, 0x0

    .line 280
    invoke-virtual {v0, v3, v14, v1}, Lh1/w;->e([BII)V

    .line 281
    sget-object v1, Lh1/c;->a:[B

    .line 282
    new-instance v1, Lh1/w;

    invoke-direct {v1, v3}, Lh1/w;-><init>([B)V

    .line 283
    invoke-virtual {v1, v5}, Lh1/w;->G(I)V

    .line 284
    invoke-virtual {v1}, Lh1/w;->u()I

    move-result v4

    const/16 v5, 0x14

    .line 285
    invoke-virtual {v1, v5}, Lh1/w;->G(I)V

    .line 286
    invoke-virtual {v1}, Lh1/w;->y()I

    move-result v1

    .line 287
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v1

    .line 288
    iget-object v4, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 289
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 290
    invoke-static {v3}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    move-result-object v12

    move/from16 v45, v4

    move/from16 v18, v13

    move-object/from16 v10, v33

    move-object/from16 v6, v34

    move/from16 v8, v37

    move/from16 v14, v41

    const/4 v13, 0x0

    move v4, v1

    const/4 v1, 0x1

    goto/16 :goto_63

    :cond_85
    const v1, 0x69616362

    if-ne v3, v1, :cond_89

    add-int/lit8 v8, v41, 0x9

    .line 291
    invoke-virtual {v0, v8}, Lh1/w;->G(I)V

    move-wide/from16 v3, v16

    const/4 v1, 0x0

    :goto_4f
    if-ge v1, v5, :cond_88

    .line 292
    iget v8, v0, Lh1/w;->b:I

    iget v12, v0, Lh1/w;->c:I

    if-eq v8, v12, :cond_87

    .line 293
    invoke-virtual {v0}, Lh1/w;->u()I

    move-result v8

    int-to-long v5, v8

    const-wide/16 v28, 0x7f

    and-long v28, v5, v28

    mul-int/lit8 v8, v1, 0x7

    shl-long v28, v28, v8

    or-long v3, v3, v28

    const-wide/16 v28, 0x80

    and-long v5, v5, v28

    cmp-long v5, v5, v16

    if-nez v5, :cond_86

    goto :goto_50

    :cond_86
    add-int/lit8 v1, v1, 0x1

    const/16 v5, 0x9

    const v6, 0x616c6163

    goto :goto_4f

    .line 294
    :cond_87
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Attempting to read a byte over the limit."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 295
    :cond_88
    :goto_50
    invoke-static {v3, v4}, Lcom/bumptech/glide/d;->m(J)I

    move-result v1

    .line 296
    new-array v3, v1, [B

    const/4 v14, 0x0

    .line 297
    invoke-virtual {v0, v3, v14, v1}, Lh1/w;->e([BII)V

    .line 298
    invoke-static {v3}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    move-result-object v12

    goto/16 :goto_4d

    :cond_89
    move/from16 v5, v45

    move/from16 v4, v51

    goto :goto_52

    .line 299
    :goto_51
    new-instance v1, Landroidx/media3/common/v;

    invoke-direct {v1}, Landroidx/media3/common/v;-><init>()V

    .line 300
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 301
    invoke-static/range {v30 .. v30}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Landroidx/media3/common/v;->m:Ljava/lang/String;

    move/from16 v4, v51

    .line 302
    iput v4, v1, Landroidx/media3/common/v;->B:I

    move/from16 v5, v45

    .line 303
    iput v5, v1, Landroidx/media3/common/v;->C:I

    .line 304
    iput-object v2, v1, Landroidx/media3/common/v;->q:Landroidx/media3/common/s;

    .line 305
    iput-object v9, v1, Landroidx/media3/common/v;->d:Ljava/lang/String;

    .line 306
    new-instance v3, Landroidx/media3/common/w;

    invoke-direct {v3, v1}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 307
    iput-object v3, v7, Lb6/s;->d:Ljava/lang/Object;

    :goto_52
    move/from16 v45, v5

    move/from16 v18, v13

    move-object/from16 v12, v31

    move-object/from16 v10, v33

    move-object/from16 v6, v34

    move/from16 v8, v37

    move/from16 v14, v41

    goto/16 :goto_4e

    :cond_8a
    move-object/from16 v34, v5

    move v5, v6

    move/from16 v41, v8

    move-object/from16 v33, v10

    move-object/from16 v31, v12

    move-object/from16 v30, v14

    move/from16 v37, v15

    move/from16 v11, v47

    const/16 v10, 0xc

    const/16 v15, 0x10

    const/16 v43, 0x3

    const/16 v44, 0x8

    const/16 v46, 0x2

    const v1, 0x65736473

    :goto_53
    if-ne v3, v1, :cond_8b

    move-object/from16 v6, v34

    move/from16 v8, v37

    move/from16 v1, v41

    move v14, v1

    :goto_54
    const/4 v10, -0x1

    goto :goto_5a

    .line 308
    :cond_8b
    iget v1, v0, Lh1/w;->b:I

    move/from16 v14, v41

    if-lt v1, v14, :cond_8c

    const/4 v3, 0x1

    :goto_55
    const/4 v6, 0x0

    goto :goto_56

    :cond_8c
    const/4 v3, 0x0

    goto :goto_55

    .line 309
    :goto_56
    invoke-static {v6, v3}, Ln1/b;->d(Ljava/lang/String;Z)V

    :goto_57
    sub-int v3, v1, v14

    move/from16 v8, v37

    if-ge v3, v8, :cond_8f

    .line 310
    invoke-virtual {v0, v1}, Lh1/w;->G(I)V

    .line 311
    invoke-virtual {v0}, Lh1/w;->g()I

    move-result v3

    if-lez v3, :cond_8d

    const/4 v12, 0x1

    :goto_58
    move-object/from16 v6, v34

    goto :goto_59

    :cond_8d
    const/4 v12, 0x0

    goto :goto_58

    .line 312
    :goto_59
    invoke-static {v6, v12}, Ln1/b;->d(Ljava/lang/String;Z)V

    .line 313
    invoke-virtual {v0}, Lh1/w;->g()I

    move-result v12

    const v10, 0x65736473

    if-ne v12, v10, :cond_8e

    goto :goto_54

    :cond_8e
    add-int/2addr v1, v3

    move-object/from16 v34, v6

    move/from16 v37, v8

    const/4 v6, 0x0

    const/16 v10, 0xc

    goto :goto_57

    :cond_8f
    move-object/from16 v6, v34

    const/4 v1, -0x1

    goto :goto_54

    :goto_5a
    if-eq v1, v10, :cond_96

    .line 314
    invoke-static {v0, v1}, Lh2/d;->a(Lh1/w;I)Lh2/b;

    move-result-object v1

    .line 315
    iget-object v3, v1, Lh2/b;->l:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    .line 316
    iget-object v12, v1, Lh2/b;->m:Ljava/lang/Object;

    check-cast v12, [B

    if-eqz v12, :cond_95

    .line 317
    const-string v10, "audio/vorbis"

    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_93

    .line 318
    new-instance v10, Lh1/w;

    invoke-direct {v10, v12}, Lh1/w;-><init>([B)V

    const/4 v11, 0x1

    .line 319
    invoke-virtual {v10, v11}, Lh1/w;->H(I)V

    const/4 v15, 0x0

    .line 320
    :goto_5b
    invoke-virtual {v10}, Lh1/w;->a()I

    move-result v18

    if-lez v18, :cond_90

    .line 321
    iget-object v11, v10, Lh1/w;->a:[B

    iget v0, v10, Lh1/w;->b:I

    aget-byte v0, v11, v0

    const/16 v11, 0xff

    and-int/2addr v0, v11

    if-ne v0, v11, :cond_90

    add-int/lit16 v15, v15, 0xff

    const/4 v11, 0x1

    .line 322
    invoke-virtual {v10, v11}, Lh1/w;->H(I)V

    move-object/from16 v0, p0

    goto :goto_5b

    .line 323
    :cond_90
    invoke-virtual {v10}, Lh1/w;->u()I

    move-result v0

    add-int/2addr v0, v15

    const/4 v11, 0x0

    .line 324
    :goto_5c
    invoke-virtual {v10}, Lh1/w;->a()I

    move-result v15

    if-lez v15, :cond_92

    .line 325
    iget-object v15, v10, Lh1/w;->a:[B

    move-object/from16 v24, v1

    iget v1, v10, Lh1/w;->b:I

    aget-byte v1, v15, v1

    const/16 v15, 0xff

    and-int/2addr v1, v15

    if-ne v1, v15, :cond_91

    add-int/lit16 v11, v11, 0xff

    const/4 v1, 0x1

    .line 326
    invoke-virtual {v10, v1}, Lh1/w;->H(I)V

    move-object/from16 v1, v24

    goto :goto_5c

    :cond_91
    :goto_5d
    const/4 v1, 0x1

    goto :goto_5e

    :cond_92
    move-object/from16 v24, v1

    goto :goto_5d

    .line 327
    :goto_5e
    invoke-virtual {v10}, Lh1/w;->u()I

    move-result v15

    add-int/2addr v15, v11

    .line 328
    new-array v11, v0, [B

    .line 329
    iget v10, v10, Lh1/w;->b:I

    move/from16 v18, v13

    const/4 v13, 0x0

    .line 330
    invoke-static {v12, v10, v11, v13, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v10, v0

    add-int/2addr v10, v15

    .line 331
    array-length v0, v12

    sub-int/2addr v0, v10

    .line 332
    new-array v15, v0, [B

    .line 333
    invoke-static {v12, v10, v15, v13, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 334
    invoke-static {v11, v15}, Lf6/m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Lf6/l1;

    move-result-object v12

    move-object/from16 v15, v24

    :goto_5f
    move-object/from16 v10, v33

    goto :goto_62

    :cond_93
    move-object/from16 v24, v1

    move/from16 v18, v13

    const/4 v1, 0x1

    const/4 v13, 0x0

    .line 335
    const-string v0, "audio/mp4a-latm"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_94

    .line 336
    new-instance v0, Lh1/v;

    .line 337
    array-length v4, v12

    invoke-direct {v0, v12, v4}, Lh1/v;-><init>([BI)V

    .line 338
    invoke-static {v0, v13}, Ln1/b;->n(Lh1/v;Z)Ln1/a;

    move-result-object v0

    .line 339
    iget v4, v0, Ln1/a;->b:I

    .line 340
    iget v5, v0, Ln1/a;->c:I

    .line 341
    iget-object v10, v0, Ln1/a;->a:Ljava/lang/String;

    move/from16 v52, v5

    move v5, v4

    move/from16 v4, v52

    goto :goto_60

    :cond_94
    move-object/from16 v10, v33

    .line 342
    :goto_60
    invoke-static {v12}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    move-result-object v12

    move-object/from16 v15, v24

    goto :goto_62

    :cond_95
    move-object/from16 v24, v1

    move/from16 v18, v13

    const/4 v1, 0x1

    const/4 v13, 0x0

    move-object/from16 v15, v24

    :goto_61
    move-object/from16 v12, v31

    goto :goto_5f

    :cond_96
    move/from16 v18, v13

    const/4 v1, 0x1

    const/4 v13, 0x0

    move-object/from16 v15, v24

    move-object/from16 v3, v30

    goto :goto_61

    :goto_62
    move-object/from16 v30, v3

    move/from16 v45, v5

    move-object/from16 v24, v15

    :goto_63
    add-int/2addr v8, v14

    move-object/from16 v0, p0

    move-object v5, v6

    move/from16 v13, v18

    move/from16 v3, v25

    move/from16 v11, v26

    move-object/from16 v1, v27

    move-object/from16 v14, v30

    move/from16 v6, v45

    const/16 v47, 0x4

    goto/16 :goto_19

    :cond_97
    move/from16 v25, v3

    move v5, v6

    move-object/from16 v33, v10

    move/from16 v26, v11

    move-object/from16 v31, v12

    move-object/from16 v30, v14

    const/4 v13, 0x0

    .line 343
    iget-object v0, v7, Lb6/s;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/media3/common/w;

    if-nez v0, :cond_99

    if-eqz v30, :cond_99

    .line 344
    new-instance v0, Landroidx/media3/common/v;

    invoke-direct {v0}, Landroidx/media3/common/v;-><init>()V

    .line 345
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 346
    invoke-static/range {v30 .. v30}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Landroidx/media3/common/v;->m:Ljava/lang/String;

    move-object/from16 v10, v33

    .line 347
    iput-object v10, v0, Landroidx/media3/common/v;->j:Ljava/lang/String;

    .line 348
    iput v4, v0, Landroidx/media3/common/v;->B:I

    .line 349
    iput v5, v0, Landroidx/media3/common/v;->C:I

    move/from16 v11, v26

    .line 350
    iput v11, v0, Landroidx/media3/common/v;->D:I

    move-object/from16 v12, v31

    .line 351
    iput-object v12, v0, Landroidx/media3/common/v;->p:Ljava/util/List;

    .line 352
    iput-object v2, v0, Landroidx/media3/common/v;->q:Landroidx/media3/common/s;

    .line 353
    iput-object v9, v0, Landroidx/media3/common/v;->d:Ljava/lang/String;

    if-eqz v24, :cond_98

    move-object/from16 v1, v24

    .line 354
    iget-wide v2, v1, Lh2/b;->j:J

    .line 355
    invoke-static {v2, v3}, Lcom/bumptech/glide/d;->g0(J)I

    move-result v2

    .line 356
    iput v2, v0, Landroidx/media3/common/v;->h:I

    .line 357
    iget-wide v1, v1, Lh2/b;->k:J

    .line 358
    invoke-static {v1, v2}, Lcom/bumptech/glide/d;->g0(J)I

    move-result v1

    .line 359
    iput v1, v0, Landroidx/media3/common/v;->i:I

    .line 360
    :cond_98
    new-instance v1, Landroidx/media3/common/w;

    invoke-direct {v1, v0}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 361
    iput-object v1, v7, Lb6/s;->d:Ljava/lang/Object;

    :cond_99
    :goto_64
    move-object/from16 v0, p0

    move/from16 v15, v23

    goto :goto_66

    :cond_9a
    move-object/from16 v21, v10

    move/from16 v22, v12

    const/4 v13, 0x0

    move-object/from16 v0, p0

    move/from16 v5, p2

    move-object/from16 v6, p4

    move v1, v4

    goto/16 :goto_2

    .line 362
    :goto_65
    invoke-static/range {v0 .. v8}, Lh2/d;->h(Lh1/w;IIIIILandroidx/media3/common/s;Lb6/s;I)V

    move v15, v2

    move/from16 v25, v3

    move/from16 v20, v8

    :goto_66
    add-int v2, v15, v25

    .line 363
    invoke-virtual {v0, v2}, Lh1/w;->G(I)V

    add-int/lit8 v8, v20, 0x1

    move-object/from16 v6, p4

    move-object/from16 v10, v21

    move/from16 v12, v22

    const/16 v11, 0xc

    goto/16 :goto_0

    :cond_9b
    return-object v7

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static g(Li1/b;Ln1/v;JLandroidx/media3/common/s;ZZLe6/d;)Ljava/util/ArrayList;
    .locals 73

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v2, v0, Li1/b;->e:Ljava/util/ArrayList;

    .line 4
    .line 5
    new-instance v3, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v6

    .line 15
    if-ge v5, v6, :cond_58

    .line 16
    .line 17
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    check-cast v6, Li1/b;

    .line 22
    .line 23
    iget v7, v6, Li1/d;->b:I

    .line 24
    .line 25
    const v8, 0x7472616b

    .line 26
    .line 27
    .line 28
    if-eq v7, v8, :cond_0

    .line 29
    .line 30
    move-object/from16 v43, v2

    .line 31
    .line 32
    move-object v0, v3

    .line 33
    move/from16 v44, v5

    .line 34
    .line 35
    :goto_1
    const/16 v33, 0x0

    .line 36
    .line 37
    goto/16 :goto_4b

    .line 38
    .line 39
    :cond_0
    const v7, 0x6d766864

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v7}, Li1/b;->h(I)Li1/c;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    const v8, 0x6d646961

    .line 50
    .line 51
    .line 52
    invoke-virtual {v6, v8}, Li1/b;->g(I)Li1/b;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    const v10, 0x68646c72    # 4.3148E24f

    .line 60
    .line 61
    .line 62
    invoke-virtual {v9, v10}, Li1/b;->h(I)Li1/c;

    .line 63
    .line 64
    .line 65
    move-result-object v10

    .line 66
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v10, v10, Li1/c;->c:Lh1/w;

    .line 70
    .line 71
    const/16 v11, 0x10

    .line 72
    .line 73
    invoke-virtual {v10, v11}, Lh1/w;->G(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v10}, Lh1/w;->g()I

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    const v12, 0x736f756e

    .line 81
    .line 82
    .line 83
    const/4 v13, -0x1

    .line 84
    if-ne v10, v12, :cond_1

    .line 85
    .line 86
    const/4 v10, 0x1

    .line 87
    goto :goto_3

    .line 88
    :cond_1
    const v12, 0x76696465

    .line 89
    .line 90
    .line 91
    if-ne v10, v12, :cond_2

    .line 92
    .line 93
    const/4 v10, 0x2

    .line 94
    goto :goto_3

    .line 95
    :cond_2
    const v12, 0x74657874

    .line 96
    .line 97
    .line 98
    if-eq v10, v12, :cond_5

    .line 99
    .line 100
    const v12, 0x7362746c

    .line 101
    .line 102
    .line 103
    if-eq v10, v12, :cond_5

    .line 104
    .line 105
    const v12, 0x73756274

    .line 106
    .line 107
    .line 108
    if-eq v10, v12, :cond_5

    .line 109
    .line 110
    const v12, 0x636c6370

    .line 111
    .line 112
    .line 113
    if-ne v10, v12, :cond_3

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_3
    const v12, 0x6d657461

    .line 117
    .line 118
    .line 119
    if-ne v10, v12, :cond_4

    .line 120
    .line 121
    const/4 v10, 0x5

    .line 122
    goto :goto_3

    .line 123
    :cond_4
    move v10, v13

    .line 124
    goto :goto_3

    .line 125
    :cond_5
    :goto_2
    const/4 v10, 0x3

    .line 126
    :goto_3
    const-string v12, ""

    .line 127
    .line 128
    const/4 v14, 0x4

    .line 129
    const-wide/16 v37, 0x0

    .line 130
    .line 131
    if-ne v10, v13, :cond_6

    .line 132
    .line 133
    move-object/from16 v43, v2

    .line 134
    .line 135
    move/from16 v44, v5

    .line 136
    .line 137
    const/4 v0, 0x0

    .line 138
    move-object/from16 v2, p7

    .line 139
    .line 140
    goto/16 :goto_1a

    .line 141
    .line 142
    :cond_6
    const v15, 0x746b6864

    .line 143
    .line 144
    .line 145
    invoke-virtual {v6, v15}, Li1/b;->h(I)Li1/c;

    .line 146
    .line 147
    .line 148
    move-result-object v15

    .line 149
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    iget-object v15, v15, Li1/c;->c:Lh1/w;

    .line 153
    .line 154
    const/16 v4, 0x8

    .line 155
    .line 156
    invoke-virtual {v15, v4}, Lh1/w;->G(I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v15}, Lh1/w;->g()I

    .line 160
    .line 161
    .line 162
    move-result v16

    .line 163
    invoke-static/range {v16 .. v16}, Lh2/d;->c(I)I

    .line 164
    .line 165
    .line 166
    move-result v16

    .line 167
    if-nez v16, :cond_7

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_7
    move v4, v11

    .line 171
    :goto_4
    invoke-virtual {v15, v4}, Lh1/w;->H(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v15}, Lh1/w;->g()I

    .line 175
    .line 176
    .line 177
    move-result v19

    .line 178
    invoke-virtual {v15, v14}, Lh1/w;->H(I)V

    .line 179
    .line 180
    .line 181
    iget v4, v15, Lh1/w;->b:I

    .line 182
    .line 183
    if-nez v16, :cond_8

    .line 184
    .line 185
    move v8, v14

    .line 186
    goto :goto_5

    .line 187
    :cond_8
    const/16 v8, 0x8

    .line 188
    .line 189
    :goto_5
    const/4 v14, 0x0

    .line 190
    :goto_6
    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    if-ge v14, v8, :cond_c

    .line 196
    .line 197
    iget-object v11, v15, Lh1/w;->a:[B

    .line 198
    .line 199
    add-int v22, v4, v14

    .line 200
    .line 201
    aget-byte v11, v11, v22

    .line 202
    .line 203
    if-eq v11, v13, :cond_b

    .line 204
    .line 205
    if-nez v16, :cond_9

    .line 206
    .line 207
    invoke-virtual {v15}, Lh1/w;->w()J

    .line 208
    .line 209
    .line 210
    move-result-wide v22

    .line 211
    goto :goto_7

    .line 212
    :cond_9
    invoke-virtual {v15}, Lh1/w;->z()J

    .line 213
    .line 214
    .line 215
    move-result-wide v22

    .line 216
    :goto_7
    cmp-long v4, v22, v37

    .line 217
    .line 218
    if-nez v4, :cond_a

    .line 219
    .line 220
    :goto_8
    move-wide/from16 v22, v20

    .line 221
    .line 222
    :cond_a
    const/16 v4, 0x10

    .line 223
    .line 224
    goto :goto_9

    .line 225
    :cond_b
    add-int/lit8 v14, v14, 0x1

    .line 226
    .line 227
    const/16 v11, 0x10

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_c
    invoke-virtual {v15, v8}, Lh1/w;->H(I)V

    .line 231
    .line 232
    .line 233
    goto :goto_8

    .line 234
    :goto_9
    invoke-virtual {v15, v4}, Lh1/w;->H(I)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v15}, Lh1/w;->g()I

    .line 238
    .line 239
    .line 240
    move-result v8

    .line 241
    invoke-virtual {v15}, Lh1/w;->g()I

    .line 242
    .line 243
    .line 244
    move-result v11

    .line 245
    const/4 v14, 0x4

    .line 246
    invoke-virtual {v15, v14}, Lh1/w;->H(I)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v15}, Lh1/w;->g()I

    .line 250
    .line 251
    .line 252
    move-result v14

    .line 253
    invoke-virtual {v15}, Lh1/w;->g()I

    .line 254
    .line 255
    .line 256
    move-result v15

    .line 257
    const/high16 v4, -0x10000

    .line 258
    .line 259
    const/high16 v13, 0x10000

    .line 260
    .line 261
    if-nez v8, :cond_d

    .line 262
    .line 263
    if-ne v11, v13, :cond_d

    .line 264
    .line 265
    if-ne v14, v4, :cond_d

    .line 266
    .line 267
    if-nez v15, :cond_d

    .line 268
    .line 269
    const/16 v4, 0x5a

    .line 270
    .line 271
    :goto_a
    move-wide/from16 v13, v20

    .line 272
    .line 273
    move/from16 v20, v4

    .line 274
    .line 275
    goto :goto_b

    .line 276
    :cond_d
    if-nez v8, :cond_e

    .line 277
    .line 278
    if-ne v11, v4, :cond_e

    .line 279
    .line 280
    if-ne v14, v13, :cond_e

    .line 281
    .line 282
    if-nez v15, :cond_e

    .line 283
    .line 284
    const/16 v4, 0x10e

    .line 285
    .line 286
    goto :goto_a

    .line 287
    :cond_e
    if-ne v8, v4, :cond_f

    .line 288
    .line 289
    if-nez v11, :cond_f

    .line 290
    .line 291
    if-nez v14, :cond_f

    .line 292
    .line 293
    if-ne v15, v4, :cond_f

    .line 294
    .line 295
    const/16 v4, 0xb4

    .line 296
    .line 297
    goto :goto_a

    .line 298
    :cond_f
    move-wide/from16 v13, v20

    .line 299
    .line 300
    const/16 v20, 0x0

    .line 301
    .line 302
    :goto_b
    cmp-long v4, p2, v13

    .line 303
    .line 304
    if-nez v4, :cond_10

    .line 305
    .line 306
    move-wide/from16 v24, v22

    .line 307
    .line 308
    goto :goto_c

    .line 309
    :cond_10
    move-wide/from16 v24, p2

    .line 310
    .line 311
    :goto_c
    iget-object v4, v7, Li1/c;->c:Lh1/w;

    .line 312
    .line 313
    invoke-static {v4}, Lh2/d;->d(Lh1/w;)Li1/f;

    .line 314
    .line 315
    .line 316
    move-result-object v4

    .line 317
    iget-wide v7, v4, Li1/f;->l:J

    .line 318
    .line 319
    cmp-long v4, v24, v13

    .line 320
    .line 321
    if-nez v4, :cond_11

    .line 322
    .line 323
    move-wide/from16 v28, v7

    .line 324
    .line 325
    move-wide v7, v13

    .line 326
    :goto_d
    const v4, 0x6d696e66

    .line 327
    .line 328
    .line 329
    goto :goto_e

    .line 330
    :cond_11
    sget v4, Lh1/i0;->a:I

    .line 331
    .line 332
    sget-object v30, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 333
    .line 334
    const-wide/32 v26, 0xf4240

    .line 335
    .line 336
    .line 337
    move-wide/from16 v28, v7

    .line 338
    .line 339
    invoke-static/range {v24 .. v30}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 340
    .line 341
    .line 342
    move-result-wide v7

    .line 343
    goto :goto_d

    .line 344
    :goto_e
    invoke-virtual {v9, v4}, Li1/b;->g(I)Li1/b;

    .line 345
    .line 346
    .line 347
    move-result-object v11

    .line 348
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    const v4, 0x7374626c

    .line 352
    .line 353
    .line 354
    invoke-virtual {v11, v4}, Li1/b;->g(I)Li1/b;

    .line 355
    .line 356
    .line 357
    move-result-object v11

    .line 358
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    const v4, 0x6d646864

    .line 362
    .line 363
    .line 364
    invoke-virtual {v9, v4}, Li1/b;->h(I)Li1/c;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    iget-object v4, v4, Li1/c;->c:Lh1/w;

    .line 372
    .line 373
    const/16 v9, 0x8

    .line 374
    .line 375
    invoke-virtual {v4, v9}, Lh1/w;->G(I)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v4}, Lh1/w;->g()I

    .line 379
    .line 380
    .line 381
    move-result v9

    .line 382
    invoke-static {v9}, Lh2/d;->c(I)I

    .line 383
    .line 384
    .line 385
    move-result v9

    .line 386
    if-nez v9, :cond_12

    .line 387
    .line 388
    const/16 v15, 0x8

    .line 389
    .line 390
    goto :goto_f

    .line 391
    :cond_12
    const/16 v15, 0x10

    .line 392
    .line 393
    :goto_f
    invoke-virtual {v4, v15}, Lh1/w;->H(I)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v4}, Lh1/w;->w()J

    .line 397
    .line 398
    .line 399
    move-result-wide v25

    .line 400
    iget v15, v4, Lh1/w;->b:I

    .line 401
    .line 402
    if-nez v9, :cond_13

    .line 403
    .line 404
    const/4 v13, 0x4

    .line 405
    goto :goto_10

    .line 406
    :cond_13
    const/16 v13, 0x8

    .line 407
    .line 408
    :goto_10
    const/4 v14, 0x0

    .line 409
    :goto_11
    if-ge v14, v13, :cond_17

    .line 410
    .line 411
    iget-object v0, v4, Lh1/w;->a:[B

    .line 412
    .line 413
    add-int v16, v15, v14

    .line 414
    .line 415
    aget-byte v0, v0, v16

    .line 416
    .line 417
    move-object/from16 v43, v2

    .line 418
    .line 419
    const/4 v2, -0x1

    .line 420
    if-eq v0, v2, :cond_16

    .line 421
    .line 422
    if-nez v9, :cond_14

    .line 423
    .line 424
    invoke-virtual {v4}, Lh1/w;->w()J

    .line 425
    .line 426
    .line 427
    move-result-wide v13

    .line 428
    goto :goto_12

    .line 429
    :cond_14
    invoke-virtual {v4}, Lh1/w;->z()J

    .line 430
    .line 431
    .line 432
    move-result-wide v13

    .line 433
    :goto_12
    cmp-long v0, v13, v37

    .line 434
    .line 435
    if-nez v0, :cond_15

    .line 436
    .line 437
    :goto_13
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    goto :goto_14

    .line 443
    :cond_15
    sget v0, Lh1/i0;->a:I

    .line 444
    .line 445
    sget-object v27, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 446
    .line 447
    const-wide/32 v23, 0xf4240

    .line 448
    .line 449
    .line 450
    move-wide/from16 v21, v13

    .line 451
    .line 452
    invoke-static/range {v21 .. v27}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 453
    .line 454
    .line 455
    move-result-wide v13

    .line 456
    goto :goto_14

    .line 457
    :cond_16
    add-int/lit8 v14, v14, 0x1

    .line 458
    .line 459
    move-object/from16 v0, p0

    .line 460
    .line 461
    move-object/from16 v2, v43

    .line 462
    .line 463
    goto :goto_11

    .line 464
    :cond_17
    move-object/from16 v43, v2

    .line 465
    .line 466
    invoke-virtual {v4, v13}, Lh1/w;->H(I)V

    .line 467
    .line 468
    .line 469
    goto :goto_13

    .line 470
    :goto_14
    invoke-virtual {v4}, Lh1/w;->A()I

    .line 471
    .line 472
    .line 473
    move-result v0

    .line 474
    new-instance v2, Ljava/lang/StringBuilder;

    .line 475
    .line 476
    invoke-direct {v2, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    shr-int/lit8 v4, v0, 0xa

    .line 480
    .line 481
    and-int/lit8 v4, v4, 0x1f

    .line 482
    .line 483
    add-int/lit8 v4, v4, 0x60

    .line 484
    .line 485
    int-to-char v4, v4

    .line 486
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    shr-int/lit8 v4, v0, 0x5

    .line 490
    .line 491
    and-int/lit8 v4, v4, 0x1f

    .line 492
    .line 493
    add-int/lit8 v4, v4, 0x60

    .line 494
    .line 495
    int-to-char v4, v4

    .line 496
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    and-int/lit8 v0, v0, 0x1f

    .line 500
    .line 501
    add-int/lit8 v0, v0, 0x60

    .line 502
    .line 503
    int-to-char v0, v0

    .line 504
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v21

    .line 511
    const v0, 0x73747364

    .line 512
    .line 513
    .line 514
    invoke-virtual {v11, v0}, Li1/b;->h(I)Li1/c;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    if-eqz v0, :cond_57

    .line 519
    .line 520
    iget-object v0, v0, Li1/c;->c:Lh1/w;

    .line 521
    .line 522
    move-object/from16 v22, p4

    .line 523
    .line 524
    move/from16 v23, p6

    .line 525
    .line 526
    move-object/from16 v18, v0

    .line 527
    .line 528
    invoke-static/range {v18 .. v23}, Lh2/d;->f(Lh1/w;IILjava/lang/String;Landroidx/media3/common/s;Z)Lb6/s;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    if-nez p5, :cond_1d

    .line 533
    .line 534
    const v2, 0x65647473

    .line 535
    .line 536
    .line 537
    invoke-virtual {v6, v2}, Li1/b;->g(I)Li1/b;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    if-eqz v2, :cond_1d

    .line 542
    .line 543
    const v4, 0x656c7374

    .line 544
    .line 545
    .line 546
    invoke-virtual {v2, v4}, Li1/b;->h(I)Li1/c;

    .line 547
    .line 548
    .line 549
    move-result-object v2

    .line 550
    if-nez v2, :cond_18

    .line 551
    .line 552
    move/from16 v44, v5

    .line 553
    .line 554
    const/4 v2, 0x0

    .line 555
    goto :goto_18

    .line 556
    :cond_18
    iget-object v2, v2, Li1/c;->c:Lh1/w;

    .line 557
    .line 558
    const/16 v9, 0x8

    .line 559
    .line 560
    invoke-virtual {v2, v9}, Lh1/w;->G(I)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v2}, Lh1/w;->g()I

    .line 564
    .line 565
    .line 566
    move-result v4

    .line 567
    invoke-static {v4}, Lh2/d;->c(I)I

    .line 568
    .line 569
    .line 570
    move-result v4

    .line 571
    invoke-virtual {v2}, Lh1/w;->y()I

    .line 572
    .line 573
    .line 574
    move-result v9

    .line 575
    new-array v11, v9, [J

    .line 576
    .line 577
    new-array v15, v9, [J

    .line 578
    .line 579
    move/from16 v44, v5

    .line 580
    .line 581
    const/4 v5, 0x0

    .line 582
    :goto_15
    if-ge v5, v9, :cond_1c

    .line 583
    .line 584
    move/from16 v16, v5

    .line 585
    .line 586
    const/4 v5, 0x1

    .line 587
    if-ne v4, v5, :cond_19

    .line 588
    .line 589
    invoke-virtual {v2}, Lh1/w;->z()J

    .line 590
    .line 591
    .line 592
    move-result-wide v17

    .line 593
    goto :goto_16

    .line 594
    :cond_19
    invoke-virtual {v2}, Lh1/w;->w()J

    .line 595
    .line 596
    .line 597
    move-result-wide v17

    .line 598
    :goto_16
    aput-wide v17, v11, v16

    .line 599
    .line 600
    if-ne v4, v5, :cond_1a

    .line 601
    .line 602
    invoke-virtual {v2}, Lh1/w;->o()J

    .line 603
    .line 604
    .line 605
    move-result-wide v17

    .line 606
    move-wide/from16 v71, v17

    .line 607
    .line 608
    move/from16 v17, v4

    .line 609
    .line 610
    move-wide/from16 v4, v71

    .line 611
    .line 612
    goto :goto_17

    .line 613
    :cond_1a
    invoke-virtual {v2}, Lh1/w;->g()I

    .line 614
    .line 615
    .line 616
    move-result v5

    .line 617
    move/from16 v17, v4

    .line 618
    .line 619
    int-to-long v4, v5

    .line 620
    :goto_17
    aput-wide v4, v15, v16

    .line 621
    .line 622
    invoke-virtual {v2}, Lh1/w;->r()S

    .line 623
    .line 624
    .line 625
    move-result v4

    .line 626
    const/4 v5, 0x1

    .line 627
    if-ne v4, v5, :cond_1b

    .line 628
    .line 629
    const/4 v4, 0x2

    .line 630
    invoke-virtual {v2, v4}, Lh1/w;->H(I)V

    .line 631
    .line 632
    .line 633
    add-int/lit8 v5, v16, 0x1

    .line 634
    .line 635
    move/from16 v4, v17

    .line 636
    .line 637
    goto :goto_15

    .line 638
    :cond_1b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 639
    .line 640
    const-string v1, "Unsupported media rate."

    .line 641
    .line 642
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 643
    .line 644
    .line 645
    throw v0

    .line 646
    :cond_1c
    invoke-static {v11, v15}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 647
    .line 648
    .line 649
    move-result-object v2

    .line 650
    :goto_18
    if-eqz v2, :cond_1e

    .line 651
    .line 652
    iget-object v4, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 653
    .line 654
    check-cast v4, [J

    .line 655
    .line 656
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 657
    .line 658
    check-cast v2, [J

    .line 659
    .line 660
    move-object/from16 v32, v2

    .line 661
    .line 662
    move-object/from16 v31, v4

    .line 663
    .line 664
    goto :goto_19

    .line 665
    :cond_1d
    move/from16 v44, v5

    .line 666
    .line 667
    :cond_1e
    const/16 v31, 0x0

    .line 668
    .line 669
    const/16 v32, 0x0

    .line 670
    .line 671
    :goto_19
    iget-object v2, v0, Lb6/s;->d:Ljava/lang/Object;

    .line 672
    .line 673
    move-object/from16 v27, v2

    .line 674
    .line 675
    check-cast v27, Landroidx/media3/common/w;

    .line 676
    .line 677
    if-nez v27, :cond_1f

    .line 678
    .line 679
    move-object/from16 v2, p7

    .line 680
    .line 681
    const/4 v0, 0x0

    .line 682
    goto :goto_1a

    .line 683
    :cond_1f
    new-instance v16, Lh2/q;

    .line 684
    .line 685
    iget v2, v0, Lb6/s;->b:I

    .line 686
    .line 687
    iget-object v4, v0, Lb6/s;->c:Ljava/lang/Cloneable;

    .line 688
    .line 689
    check-cast v4, [Lh2/r;

    .line 690
    .line 691
    iget v0, v0, Lb6/s;->a:I

    .line 692
    .line 693
    move/from16 v30, v0

    .line 694
    .line 695
    move-wide/from16 v23, v7

    .line 696
    .line 697
    move/from16 v18, v10

    .line 698
    .line 699
    move/from16 v17, v19

    .line 700
    .line 701
    move-wide/from16 v19, v25

    .line 702
    .line 703
    move-wide/from16 v21, v28

    .line 704
    .line 705
    move/from16 v28, v2

    .line 706
    .line 707
    move-object/from16 v29, v4

    .line 708
    .line 709
    move-wide/from16 v25, v13

    .line 710
    .line 711
    invoke-direct/range {v16 .. v32}, Lh2/q;-><init>(IIJJJJLandroidx/media3/common/w;I[Lh2/r;I[J[J)V

    .line 712
    .line 713
    .line 714
    move-object/from16 v2, p7

    .line 715
    .line 716
    move-object/from16 v0, v16

    .line 717
    .line 718
    :goto_1a
    invoke-interface {v2, v0}, Le6/d;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    move-object v14, v0

    .line 723
    check-cast v14, Lh2/q;

    .line 724
    .line 725
    if-nez v14, :cond_20

    .line 726
    .line 727
    move-object v0, v3

    .line 728
    goto/16 :goto_1

    .line 729
    .line 730
    :cond_20
    iget-object v0, v14, Lh2/q;->g:Landroidx/media3/common/w;

    .line 731
    .line 732
    const v4, 0x6d646961

    .line 733
    .line 734
    .line 735
    invoke-virtual {v6, v4}, Li1/b;->g(I)Li1/b;

    .line 736
    .line 737
    .line 738
    move-result-object v4

    .line 739
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 740
    .line 741
    .line 742
    const v5, 0x6d696e66

    .line 743
    .line 744
    .line 745
    invoke-virtual {v4, v5}, Li1/b;->g(I)Li1/b;

    .line 746
    .line 747
    .line 748
    move-result-object v4

    .line 749
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 750
    .line 751
    .line 752
    const v5, 0x7374626c

    .line 753
    .line 754
    .line 755
    invoke-virtual {v4, v5}, Li1/b;->g(I)Li1/b;

    .line 756
    .line 757
    .line 758
    move-result-object v4

    .line 759
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 760
    .line 761
    .line 762
    const v5, 0x7374737a

    .line 763
    .line 764
    .line 765
    invoke-virtual {v4, v5}, Li1/b;->h(I)Li1/c;

    .line 766
    .line 767
    .line 768
    move-result-object v5

    .line 769
    if-eqz v5, :cond_21

    .line 770
    .line 771
    new-instance v6, Lf5/b;

    .line 772
    .line 773
    invoke-direct {v6, v5, v0}, Lf5/b;-><init>(Li1/c;Landroidx/media3/common/w;)V

    .line 774
    .line 775
    .line 776
    goto :goto_1b

    .line 777
    :cond_21
    const v5, 0x73747a32

    .line 778
    .line 779
    .line 780
    invoke-virtual {v4, v5}, Li1/b;->h(I)Li1/c;

    .line 781
    .line 782
    .line 783
    move-result-object v5

    .line 784
    if-eqz v5, :cond_56

    .line 785
    .line 786
    new-instance v6, Lcom/google/android/material/datepicker/p;

    .line 787
    .line 788
    invoke-direct {v6, v5}, Lcom/google/android/material/datepicker/p;-><init>(Li1/c;)V

    .line 789
    .line 790
    .line 791
    :goto_1b
    invoke-interface {v6}, Lh2/c;->b()I

    .line 792
    .line 793
    .line 794
    move-result v5

    .line 795
    if-nez v5, :cond_22

    .line 796
    .line 797
    new-instance v13, Lh2/t;

    .line 798
    .line 799
    const/4 v0, 0x0

    .line 800
    new-array v15, v0, [J

    .line 801
    .line 802
    new-array v4, v0, [I

    .line 803
    .line 804
    new-array v5, v0, [J

    .line 805
    .line 806
    new-array v6, v0, [I

    .line 807
    .line 808
    const-wide/16 v20, 0x0

    .line 809
    .line 810
    const/16 v17, 0x0

    .line 811
    .line 812
    move-object/from16 v16, v4

    .line 813
    .line 814
    move-object/from16 v18, v5

    .line 815
    .line 816
    move-object/from16 v19, v6

    .line 817
    .line 818
    invoke-direct/range {v13 .. v21}, Lh2/t;-><init>(Lh2/q;[J[II[J[IJ)V

    .line 819
    .line 820
    .line 821
    move-object v0, v3

    .line 822
    :goto_1c
    const/16 v33, 0x0

    .line 823
    .line 824
    goto/16 :goto_4a

    .line 825
    .line 826
    :cond_22
    iget v7, v14, Lh2/q;->b:I

    .line 827
    .line 828
    const/4 v8, 0x2

    .line 829
    if-ne v7, v8, :cond_23

    .line 830
    .line 831
    iget-wide v7, v14, Lh2/q;->f:J

    .line 832
    .line 833
    cmp-long v9, v7, v37

    .line 834
    .line 835
    if-lez v9, :cond_23

    .line 836
    .line 837
    int-to-float v9, v5

    .line 838
    long-to-float v7, v7

    .line 839
    const v8, 0x49742400    # 1000000.0f

    .line 840
    .line 841
    .line 842
    div-float/2addr v7, v8

    .line 843
    div-float/2addr v9, v7

    .line 844
    invoke-virtual {v0}, Landroidx/media3/common/w;->a()Landroidx/media3/common/v;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    iput v9, v0, Landroidx/media3/common/v;->v:F

    .line 849
    .line 850
    new-instance v7, Landroidx/media3/common/w;

    .line 851
    .line 852
    invoke-direct {v7, v0}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 853
    .line 854
    .line 855
    new-instance v15, Lh2/q;

    .line 856
    .line 857
    iget v0, v14, Lh2/q;->a:I

    .line 858
    .line 859
    iget v8, v14, Lh2/q;->b:I

    .line 860
    .line 861
    iget-wide v9, v14, Lh2/q;->c:J

    .line 862
    .line 863
    move-object v11, v6

    .line 864
    move-object/from16 v26, v7

    .line 865
    .line 866
    iget-wide v6, v14, Lh2/q;->d:J

    .line 867
    .line 868
    move-wide/from16 v20, v6

    .line 869
    .line 870
    iget-wide v6, v14, Lh2/q;->e:J

    .line 871
    .line 872
    move-wide/from16 v22, v6

    .line 873
    .line 874
    iget-wide v6, v14, Lh2/q;->f:J

    .line 875
    .line 876
    iget v13, v14, Lh2/q;->h:I

    .line 877
    .line 878
    move/from16 v16, v0

    .line 879
    .line 880
    iget-object v0, v14, Lh2/q;->l:[Lh2/r;

    .line 881
    .line 882
    move-object/from16 v28, v0

    .line 883
    .line 884
    iget v0, v14, Lh2/q;->k:I

    .line 885
    .line 886
    move/from16 v29, v0

    .line 887
    .line 888
    iget-object v0, v14, Lh2/q;->i:[J

    .line 889
    .line 890
    iget-object v14, v14, Lh2/q;->j:[J

    .line 891
    .line 892
    move-object/from16 v30, v0

    .line 893
    .line 894
    move-wide/from16 v24, v6

    .line 895
    .line 896
    move/from16 v17, v8

    .line 897
    .line 898
    move-wide/from16 v18, v9

    .line 899
    .line 900
    move/from16 v27, v13

    .line 901
    .line 902
    move-object/from16 v31, v14

    .line 903
    .line 904
    invoke-direct/range {v15 .. v31}, Lh2/q;-><init>(IIJJJJLandroidx/media3/common/w;I[Lh2/r;I[J[J)V

    .line 905
    .line 906
    .line 907
    move-object v14, v15

    .line 908
    goto :goto_1d

    .line 909
    :cond_23
    move-object v11, v6

    .line 910
    :goto_1d
    iget-wide v6, v14, Lh2/q;->c:J

    .line 911
    .line 912
    iget v0, v14, Lh2/q;->b:I

    .line 913
    .line 914
    iget-object v8, v14, Lh2/q;->j:[J

    .line 915
    .line 916
    iget-object v9, v14, Lh2/q;->g:Landroidx/media3/common/w;

    .line 917
    .line 918
    iget-object v10, v14, Lh2/q;->i:[J

    .line 919
    .line 920
    const v13, 0x7374636f

    .line 921
    .line 922
    .line 923
    invoke-virtual {v4, v13}, Li1/b;->h(I)Li1/c;

    .line 924
    .line 925
    .line 926
    move-result-object v13

    .line 927
    if-nez v13, :cond_24

    .line 928
    .line 929
    const v13, 0x636f3634

    .line 930
    .line 931
    .line 932
    invoke-virtual {v4, v13}, Li1/b;->h(I)Li1/c;

    .line 933
    .line 934
    .line 935
    move-result-object v13

    .line 936
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 937
    .line 938
    .line 939
    const/4 v15, 0x1

    .line 940
    goto :goto_1e

    .line 941
    :cond_24
    const/4 v15, 0x0

    .line 942
    :goto_1e
    iget-object v13, v13, Li1/c;->c:Lh1/w;

    .line 943
    .line 944
    const v2, 0x73747363

    .line 945
    .line 946
    .line 947
    invoke-virtual {v4, v2}, Li1/b;->h(I)Li1/c;

    .line 948
    .line 949
    .line 950
    move-result-object v2

    .line 951
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 952
    .line 953
    .line 954
    iget-object v2, v2, Li1/c;->c:Lh1/w;

    .line 955
    .line 956
    move-object/from16 v16, v8

    .line 957
    .line 958
    const v8, 0x73747473

    .line 959
    .line 960
    .line 961
    invoke-virtual {v4, v8}, Li1/b;->h(I)Li1/c;

    .line 962
    .line 963
    .line 964
    move-result-object v8

    .line 965
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 966
    .line 967
    .line 968
    iget-object v8, v8, Li1/c;->c:Lh1/w;

    .line 969
    .line 970
    move-object/from16 v17, v11

    .line 971
    .line 972
    const v11, 0x73747373

    .line 973
    .line 974
    .line 975
    invoke-virtual {v4, v11}, Li1/b;->h(I)Li1/c;

    .line 976
    .line 977
    .line 978
    move-result-object v11

    .line 979
    if-eqz v11, :cond_25

    .line 980
    .line 981
    iget-object v11, v11, Li1/c;->c:Lh1/w;

    .line 982
    .line 983
    :goto_1f
    move-object/from16 v18, v12

    .line 984
    .line 985
    goto :goto_20

    .line 986
    :cond_25
    const/4 v11, 0x0

    .line 987
    goto :goto_1f

    .line 988
    :goto_20
    const v12, 0x63747473

    .line 989
    .line 990
    .line 991
    invoke-virtual {v4, v12}, Li1/b;->h(I)Li1/c;

    .line 992
    .line 993
    .line 994
    move-result-object v4

    .line 995
    if-eqz v4, :cond_26

    .line 996
    .line 997
    iget-object v4, v4, Li1/c;->c:Lh1/w;

    .line 998
    .line 999
    goto :goto_21

    .line 1000
    :cond_26
    const/4 v4, 0x0

    .line 1001
    :goto_21
    new-instance v12, Lh2/a;

    .line 1002
    .line 1003
    invoke-direct {v12, v2, v13, v15}, Lh2/a;-><init>(Lh1/w;Lh1/w;Z)V

    .line 1004
    .line 1005
    .line 1006
    const/16 v2, 0xc

    .line 1007
    .line 1008
    invoke-virtual {v8, v2}, Lh1/w;->G(I)V

    .line 1009
    .line 1010
    .line 1011
    invoke-virtual {v8}, Lh1/w;->y()I

    .line 1012
    .line 1013
    .line 1014
    move-result v13

    .line 1015
    const/16 v39, 0x1

    .line 1016
    .line 1017
    add-int/lit8 v13, v13, -0x1

    .line 1018
    .line 1019
    invoke-virtual {v8}, Lh1/w;->y()I

    .line 1020
    .line 1021
    .line 1022
    move-result v15

    .line 1023
    move-object/from16 v19, v8

    .line 1024
    .line 1025
    invoke-virtual/range {v19 .. v19}, Lh1/w;->y()I

    .line 1026
    .line 1027
    .line 1028
    move-result v8

    .line 1029
    if-eqz v4, :cond_27

    .line 1030
    .line 1031
    invoke-virtual {v4, v2}, Lh1/w;->G(I)V

    .line 1032
    .line 1033
    .line 1034
    invoke-virtual {v4}, Lh1/w;->y()I

    .line 1035
    .line 1036
    .line 1037
    move-result v20

    .line 1038
    goto :goto_22

    .line 1039
    :cond_27
    const/16 v20, 0x0

    .line 1040
    .line 1041
    :goto_22
    if-eqz v11, :cond_29

    .line 1042
    .line 1043
    invoke-virtual {v11, v2}, Lh1/w;->G(I)V

    .line 1044
    .line 1045
    .line 1046
    invoke-virtual {v11}, Lh1/w;->y()I

    .line 1047
    .line 1048
    .line 1049
    move-result v2

    .line 1050
    if-lez v2, :cond_28

    .line 1051
    .line 1052
    invoke-virtual {v11}, Lh1/w;->y()I

    .line 1053
    .line 1054
    .line 1055
    move-result v21

    .line 1056
    const/16 v39, 0x1

    .line 1057
    .line 1058
    add-int/lit8 v21, v21, -0x1

    .line 1059
    .line 1060
    move/from16 v22, v21

    .line 1061
    .line 1062
    move/from16 v21, v2

    .line 1063
    .line 1064
    goto :goto_24

    .line 1065
    :cond_28
    move/from16 v21, v2

    .line 1066
    .line 1067
    const/4 v11, 0x0

    .line 1068
    :goto_23
    const/16 v22, -0x1

    .line 1069
    .line 1070
    goto :goto_24

    .line 1071
    :cond_29
    const/16 v21, 0x0

    .line 1072
    .line 1073
    goto :goto_23

    .line 1074
    :goto_24
    invoke-interface/range {v17 .. v17}, Lh2/c;->a()I

    .line 1075
    .line 1076
    .line 1077
    move-result v2

    .line 1078
    move-object/from16 v23, v4

    .line 1079
    .line 1080
    iget-object v4, v9, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 1081
    .line 1082
    move-object/from16 v24, v11

    .line 1083
    .line 1084
    iget v11, v9, Landroidx/media3/common/w;->D:I

    .line 1085
    .line 1086
    move-object/from16 v25, v9

    .line 1087
    .line 1088
    const/4 v9, -0x1

    .line 1089
    if-eq v2, v9, :cond_2a

    .line 1090
    .line 1091
    const-string v9, "audio/raw"

    .line 1092
    .line 1093
    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1094
    .line 1095
    .line 1096
    move-result v9

    .line 1097
    if-nez v9, :cond_2b

    .line 1098
    .line 1099
    const-string v9, "audio/g711-mlaw"

    .line 1100
    .line 1101
    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1102
    .line 1103
    .line 1104
    move-result v9

    .line 1105
    if-nez v9, :cond_2b

    .line 1106
    .line 1107
    const-string v9, "audio/g711-alaw"

    .line 1108
    .line 1109
    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1110
    .line 1111
    .line 1112
    move-result v4

    .line 1113
    if-eqz v4, :cond_2a

    .line 1114
    .line 1115
    goto :goto_25

    .line 1116
    :cond_2a
    move-object/from16 v26, v3

    .line 1117
    .line 1118
    goto/16 :goto_2a

    .line 1119
    .line 1120
    :cond_2b
    :goto_25
    if-nez v13, :cond_2a

    .line 1121
    .line 1122
    if-nez v20, :cond_2a

    .line 1123
    .line 1124
    if-nez v21, :cond_2a

    .line 1125
    .line 1126
    iget v4, v12, Lh2/a;->a:I

    .line 1127
    .line 1128
    new-array v9, v4, [J

    .line 1129
    .line 1130
    new-array v13, v4, [I

    .line 1131
    .line 1132
    :goto_26
    invoke-virtual {v12}, Lh2/a;->a()Z

    .line 1133
    .line 1134
    .line 1135
    move-result v15

    .line 1136
    if-eqz v15, :cond_2c

    .line 1137
    .line 1138
    iget v15, v12, Lh2/a;->b:I

    .line 1139
    .line 1140
    move/from16 v27, v2

    .line 1141
    .line 1142
    move-object/from16 v26, v3

    .line 1143
    .line 1144
    iget-wide v2, v12, Lh2/a;->d:J

    .line 1145
    .line 1146
    aput-wide v2, v9, v15

    .line 1147
    .line 1148
    iget v2, v12, Lh2/a;->c:I

    .line 1149
    .line 1150
    aput v2, v13, v15

    .line 1151
    .line 1152
    move-object/from16 v3, v26

    .line 1153
    .line 1154
    move/from16 v2, v27

    .line 1155
    .line 1156
    goto :goto_26

    .line 1157
    :cond_2c
    move/from16 v27, v2

    .line 1158
    .line 1159
    move-object/from16 v26, v3

    .line 1160
    .line 1161
    int-to-long v2, v8

    .line 1162
    const/16 v8, 0x2000

    .line 1163
    .line 1164
    div-int v8, v8, v27

    .line 1165
    .line 1166
    const/4 v12, 0x0

    .line 1167
    const/4 v15, 0x0

    .line 1168
    :goto_27
    if-ge v12, v4, :cond_2d

    .line 1169
    .line 1170
    move-wide/from16 v17, v2

    .line 1171
    .line 1172
    aget v2, v13, v12

    .line 1173
    .line 1174
    invoke-static {v2, v8}, Lh1/i0;->f(II)I

    .line 1175
    .line 1176
    .line 1177
    move-result v2

    .line 1178
    add-int/2addr v15, v2

    .line 1179
    add-int/lit8 v12, v12, 0x1

    .line 1180
    .line 1181
    move-wide/from16 v2, v17

    .line 1182
    .line 1183
    goto :goto_27

    .line 1184
    :cond_2d
    move-wide/from16 v17, v2

    .line 1185
    .line 1186
    new-array v2, v15, [J

    .line 1187
    .line 1188
    new-array v3, v15, [I

    .line 1189
    .line 1190
    new-array v12, v15, [J

    .line 1191
    .line 1192
    new-array v15, v15, [I

    .line 1193
    .line 1194
    move-object/from16 v19, v2

    .line 1195
    .line 1196
    move-object/from16 v20, v3

    .line 1197
    .line 1198
    const/4 v2, 0x0

    .line 1199
    const/4 v3, 0x0

    .line 1200
    const/16 v21, 0x0

    .line 1201
    .line 1202
    const/16 v22, 0x0

    .line 1203
    .line 1204
    :goto_28
    if-ge v2, v4, :cond_2f

    .line 1205
    .line 1206
    aget v23, v13, v2

    .line 1207
    .line 1208
    aget-wide v28, v9, v2

    .line 1209
    .line 1210
    move/from16 v71, v22

    .line 1211
    .line 1212
    move/from16 v22, v2

    .line 1213
    .line 1214
    move/from16 v2, v21

    .line 1215
    .line 1216
    move/from16 v21, v71

    .line 1217
    .line 1218
    move/from16 v71, v23

    .line 1219
    .line 1220
    move/from16 v23, v4

    .line 1221
    .line 1222
    move/from16 v4, v71

    .line 1223
    .line 1224
    :goto_29
    if-lez v4, :cond_2e

    .line 1225
    .line 1226
    invoke-static {v8, v4}, Ljava/lang/Math;->min(II)I

    .line 1227
    .line 1228
    .line 1229
    move-result v24

    .line 1230
    aput-wide v28, v19, v21

    .line 1231
    .line 1232
    move/from16 v30, v4

    .line 1233
    .line 1234
    mul-int v4, v27, v24

    .line 1235
    .line 1236
    aput v4, v20, v21

    .line 1237
    .line 1238
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    .line 1239
    .line 1240
    .line 1241
    move-result v2

    .line 1242
    move/from16 v31, v8

    .line 1243
    .line 1244
    move-object v4, v9

    .line 1245
    int-to-long v8, v3

    .line 1246
    mul-long v8, v8, v17

    .line 1247
    .line 1248
    aput-wide v8, v12, v21

    .line 1249
    .line 1250
    const/16 v39, 0x1

    .line 1251
    .line 1252
    aput v39, v15, v21

    .line 1253
    .line 1254
    aget v8, v20, v21

    .line 1255
    .line 1256
    int-to-long v8, v8

    .line 1257
    add-long v28, v28, v8

    .line 1258
    .line 1259
    add-int v3, v3, v24

    .line 1260
    .line 1261
    sub-int v8, v30, v24

    .line 1262
    .line 1263
    add-int/lit8 v21, v21, 0x1

    .line 1264
    .line 1265
    move-object v9, v4

    .line 1266
    move v4, v8

    .line 1267
    move/from16 v8, v31

    .line 1268
    .line 1269
    goto :goto_29

    .line 1270
    :cond_2e
    move/from16 v31, v8

    .line 1271
    .line 1272
    move-object v4, v9

    .line 1273
    add-int/lit8 v8, v22, 0x1

    .line 1274
    .line 1275
    move/from16 v22, v21

    .line 1276
    .line 1277
    move/from16 v4, v23

    .line 1278
    .line 1279
    move/from16 v21, v2

    .line 1280
    .line 1281
    move v2, v8

    .line 1282
    move/from16 v8, v31

    .line 1283
    .line 1284
    goto :goto_28

    .line 1285
    :cond_2f
    int-to-long v2, v3

    .line 1286
    mul-long v2, v2, v17

    .line 1287
    .line 1288
    move/from16 v22, v0

    .line 1289
    .line 1290
    move-wide/from16 v45, v2

    .line 1291
    .line 1292
    move-wide/from16 v29, v6

    .line 1293
    .line 1294
    move-object/from16 v27, v10

    .line 1295
    .line 1296
    move-object/from16 v18, v19

    .line 1297
    .line 1298
    move-object/from16 v19, v20

    .line 1299
    .line 1300
    move/from16 v20, v21

    .line 1301
    .line 1302
    move/from16 v21, v11

    .line 1303
    .line 1304
    goto/16 :goto_37

    .line 1305
    .line 1306
    :goto_2a
    new-array v2, v5, [J

    .line 1307
    .line 1308
    new-array v3, v5, [I

    .line 1309
    .line 1310
    new-array v4, v5, [J

    .line 1311
    .line 1312
    new-array v9, v5, [I

    .line 1313
    .line 1314
    move/from16 v1, v21

    .line 1315
    .line 1316
    move/from16 v21, v11

    .line 1317
    .line 1318
    move v11, v1

    .line 1319
    move-wide/from16 v29, v6

    .line 1320
    .line 1321
    move-object/from16 v27, v10

    .line 1322
    .line 1323
    move v1, v15

    .line 1324
    move-wide/from16 v31, v37

    .line 1325
    .line 1326
    move-wide/from16 v40, v31

    .line 1327
    .line 1328
    const/4 v7, 0x0

    .line 1329
    const/4 v10, 0x0

    .line 1330
    const/16 v28, 0x0

    .line 1331
    .line 1332
    const/16 v34, 0x0

    .line 1333
    .line 1334
    move v15, v13

    .line 1335
    move v13, v8

    .line 1336
    move/from16 v8, v22

    .line 1337
    .line 1338
    move/from16 v22, v0

    .line 1339
    .line 1340
    const/4 v0, 0x0

    .line 1341
    :goto_2b
    const-string v6, "BoxParsers"

    .line 1342
    .line 1343
    if-ge v0, v5, :cond_38

    .line 1344
    .line 1345
    const/16 v36, 0x1

    .line 1346
    .line 1347
    :goto_2c
    if-nez v28, :cond_30

    .line 1348
    .line 1349
    invoke-virtual {v12}, Lh2/a;->a()Z

    .line 1350
    .line 1351
    .line 1352
    move-result v36

    .line 1353
    if-eqz v36, :cond_30

    .line 1354
    .line 1355
    move-object/from16 v42, v14

    .line 1356
    .line 1357
    move/from16 v45, v15

    .line 1358
    .line 1359
    iget-wide v14, v12, Lh2/a;->d:J

    .line 1360
    .line 1361
    move/from16 v46, v5

    .line 1362
    .line 1363
    iget v5, v12, Lh2/a;->c:I

    .line 1364
    .line 1365
    move/from16 v28, v5

    .line 1366
    .line 1367
    move-wide/from16 v40, v14

    .line 1368
    .line 1369
    move-object/from16 v14, v42

    .line 1370
    .line 1371
    move/from16 v15, v45

    .line 1372
    .line 1373
    move/from16 v5, v46

    .line 1374
    .line 1375
    goto :goto_2c

    .line 1376
    :cond_30
    move/from16 v46, v5

    .line 1377
    .line 1378
    move-object/from16 v42, v14

    .line 1379
    .line 1380
    move/from16 v45, v15

    .line 1381
    .line 1382
    if-nez v36, :cond_31

    .line 1383
    .line 1384
    const-string v5, "Unexpected end of chunk data"

    .line 1385
    .line 1386
    invoke-static {v6, v5}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 1387
    .line 1388
    .line 1389
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 1390
    .line 1391
    .line 1392
    move-result-object v2

    .line 1393
    invoke-static {v3, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 1394
    .line 1395
    .line 1396
    move-result-object v3

    .line 1397
    invoke-static {v4, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 1398
    .line 1399
    .line 1400
    move-result-object v4

    .line 1401
    invoke-static {v9, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 1402
    .line 1403
    .line 1404
    move-result-object v5

    .line 1405
    move-object v15, v5

    .line 1406
    move v5, v0

    .line 1407
    :goto_2d
    move-object v12, v4

    .line 1408
    move/from16 v0, v28

    .line 1409
    .line 1410
    goto/16 :goto_31

    .line 1411
    .line 1412
    :cond_31
    if-eqz v23, :cond_33

    .line 1413
    .line 1414
    move/from16 v6, v34

    .line 1415
    .line 1416
    :goto_2e
    if-nez v6, :cond_32

    .line 1417
    .line 1418
    if-lez v20, :cond_32

    .line 1419
    .line 1420
    invoke-virtual/range {v23 .. v23}, Lh1/w;->y()I

    .line 1421
    .line 1422
    .line 1423
    move-result v6

    .line 1424
    invoke-virtual/range {v23 .. v23}, Lh1/w;->g()I

    .line 1425
    .line 1426
    .line 1427
    move-result v10

    .line 1428
    add-int/lit8 v20, v20, -0x1

    .line 1429
    .line 1430
    goto :goto_2e

    .line 1431
    :cond_32
    add-int/lit8 v6, v6, -0x1

    .line 1432
    .line 1433
    move/from16 v34, v6

    .line 1434
    .line 1435
    :cond_33
    aput-wide v40, v2, v0

    .line 1436
    .line 1437
    invoke-interface/range {v17 .. v17}, Lh2/c;->c()I

    .line 1438
    .line 1439
    .line 1440
    move-result v5

    .line 1441
    aput v5, v3, v0

    .line 1442
    .line 1443
    if-le v5, v7, :cond_34

    .line 1444
    .line 1445
    move v7, v5

    .line 1446
    :cond_34
    int-to-long v5, v10

    .line 1447
    add-long v5, v31, v5

    .line 1448
    .line 1449
    aput-wide v5, v4, v0

    .line 1450
    .line 1451
    if-nez v24, :cond_35

    .line 1452
    .line 1453
    const/4 v5, 0x1

    .line 1454
    goto :goto_2f

    .line 1455
    :cond_35
    const/4 v5, 0x0

    .line 1456
    :goto_2f
    aput v5, v9, v0

    .line 1457
    .line 1458
    if-ne v0, v8, :cond_36

    .line 1459
    .line 1460
    const/16 v39, 0x1

    .line 1461
    .line 1462
    aput v39, v9, v0

    .line 1463
    .line 1464
    add-int/lit8 v11, v11, -0x1

    .line 1465
    .line 1466
    if-lez v11, :cond_36

    .line 1467
    .line 1468
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1469
    .line 1470
    .line 1471
    invoke-virtual/range {v24 .. v24}, Lh1/w;->y()I

    .line 1472
    .line 1473
    .line 1474
    move-result v5

    .line 1475
    add-int/lit8 v5, v5, -0x1

    .line 1476
    .line 1477
    move v8, v5

    .line 1478
    :cond_36
    int-to-long v5, v13

    .line 1479
    add-long v31, v31, v5

    .line 1480
    .line 1481
    add-int/lit8 v1, v1, -0x1

    .line 1482
    .line 1483
    if-nez v1, :cond_37

    .line 1484
    .line 1485
    if-lez v45, :cond_37

    .line 1486
    .line 1487
    invoke-virtual/range {v19 .. v19}, Lh1/w;->y()I

    .line 1488
    .line 1489
    .line 1490
    move-result v1

    .line 1491
    invoke-virtual/range {v19 .. v19}, Lh1/w;->g()I

    .line 1492
    .line 1493
    .line 1494
    move-result v5

    .line 1495
    add-int/lit8 v15, v45, -0x1

    .line 1496
    .line 1497
    move v13, v5

    .line 1498
    goto :goto_30

    .line 1499
    :cond_37
    move/from16 v15, v45

    .line 1500
    .line 1501
    :goto_30
    aget v5, v3, v0

    .line 1502
    .line 1503
    int-to-long v5, v5

    .line 1504
    add-long v40, v40, v5

    .line 1505
    .line 1506
    add-int/lit8 v28, v28, -0x1

    .line 1507
    .line 1508
    add-int/lit8 v0, v0, 0x1

    .line 1509
    .line 1510
    move-object/from16 v14, v42

    .line 1511
    .line 1512
    move/from16 v5, v46

    .line 1513
    .line 1514
    goto/16 :goto_2b

    .line 1515
    .line 1516
    :cond_38
    move/from16 v46, v5

    .line 1517
    .line 1518
    move-object/from16 v42, v14

    .line 1519
    .line 1520
    move/from16 v45, v15

    .line 1521
    .line 1522
    move-object v15, v9

    .line 1523
    goto :goto_2d

    .line 1524
    :goto_31
    int-to-long v8, v10

    .line 1525
    add-long v8, v31, v8

    .line 1526
    .line 1527
    if-eqz v23, :cond_3a

    .line 1528
    .line 1529
    :goto_32
    if-lez v20, :cond_3a

    .line 1530
    .line 1531
    invoke-virtual/range {v23 .. v23}, Lh1/w;->y()I

    .line 1532
    .line 1533
    .line 1534
    move-result v4

    .line 1535
    if-eqz v4, :cond_39

    .line 1536
    .line 1537
    const/4 v4, 0x0

    .line 1538
    goto :goto_33

    .line 1539
    :cond_39
    invoke-virtual/range {v23 .. v23}, Lh1/w;->g()I

    .line 1540
    .line 1541
    .line 1542
    add-int/lit8 v20, v20, -0x1

    .line 1543
    .line 1544
    goto :goto_32

    .line 1545
    :cond_3a
    const/4 v4, 0x1

    .line 1546
    :goto_33
    if-nez v11, :cond_3c

    .line 1547
    .line 1548
    if-nez v1, :cond_3c

    .line 1549
    .line 1550
    if-nez v0, :cond_3c

    .line 1551
    .line 1552
    if-nez v45, :cond_3c

    .line 1553
    .line 1554
    if-nez v34, :cond_3c

    .line 1555
    .line 1556
    if-nez v4, :cond_3b

    .line 1557
    .line 1558
    goto :goto_34

    .line 1559
    :cond_3b
    move-object/from16 v14, v42

    .line 1560
    .line 1561
    goto :goto_36

    .line 1562
    :cond_3c
    :goto_34
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1563
    .line 1564
    const-string v13, "Inconsistent stbl box for track "

    .line 1565
    .line 1566
    invoke-direct {v10, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1567
    .line 1568
    .line 1569
    move-object/from16 v14, v42

    .line 1570
    .line 1571
    iget v13, v14, Lh2/q;->a:I

    .line 1572
    .line 1573
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1574
    .line 1575
    .line 1576
    const-string v13, ": remainingSynchronizationSamples "

    .line 1577
    .line 1578
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1579
    .line 1580
    .line 1581
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1582
    .line 1583
    .line 1584
    const-string v11, ", remainingSamplesAtTimestampDelta "

    .line 1585
    .line 1586
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1587
    .line 1588
    .line 1589
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1590
    .line 1591
    .line 1592
    const-string v1, ", remainingSamplesInChunk "

    .line 1593
    .line 1594
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1595
    .line 1596
    .line 1597
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1598
    .line 1599
    .line 1600
    const-string v0, ", remainingTimestampDeltaChanges "

    .line 1601
    .line 1602
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1603
    .line 1604
    .line 1605
    move/from16 v13, v45

    .line 1606
    .line 1607
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1608
    .line 1609
    .line 1610
    const-string v0, ", remainingSamplesAtTimestampOffset "

    .line 1611
    .line 1612
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1613
    .line 1614
    .line 1615
    move/from16 v0, v34

    .line 1616
    .line 1617
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1618
    .line 1619
    .line 1620
    if-nez v4, :cond_3d

    .line 1621
    .line 1622
    const-string v0, ", ctts invalid"

    .line 1623
    .line 1624
    goto :goto_35

    .line 1625
    :cond_3d
    move-object/from16 v0, v18

    .line 1626
    .line 1627
    :goto_35
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1628
    .line 1629
    .line 1630
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v0

    .line 1634
    invoke-static {v6, v0}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 1635
    .line 1636
    .line 1637
    :goto_36
    move-object/from16 v18, v2

    .line 1638
    .line 1639
    move-object/from16 v19, v3

    .line 1640
    .line 1641
    move/from16 v20, v7

    .line 1642
    .line 1643
    move-wide/from16 v45, v8

    .line 1644
    .line 1645
    :goto_37
    iget-wide v0, v14, Lh2/q;->c:J

    .line 1646
    .line 1647
    sget-object v53, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1648
    .line 1649
    const-wide/32 v47, 0xf4240

    .line 1650
    .line 1651
    .line 1652
    move-wide/from16 v49, v0

    .line 1653
    .line 1654
    move-object/from16 v51, v53

    .line 1655
    .line 1656
    invoke-static/range {v45 .. v51}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 1657
    .line 1658
    .line 1659
    move-result-wide v23

    .line 1660
    if-nez v27, :cond_3e

    .line 1661
    .line 1662
    move-wide/from16 v0, v29

    .line 1663
    .line 1664
    invoke-static {v12, v0, v1}, Lh1/i0;->Z([JJ)V

    .line 1665
    .line 1666
    .line 1667
    new-instance v16, Lh2/t;

    .line 1668
    .line 1669
    move-object/from16 v21, v12

    .line 1670
    .line 1671
    move-object/from16 v17, v14

    .line 1672
    .line 1673
    move-object/from16 v22, v15

    .line 1674
    .line 1675
    invoke-direct/range {v16 .. v24}, Lh2/t;-><init>(Lh2/q;[J[II[J[IJ)V

    .line 1676
    .line 1677
    .line 1678
    :goto_38
    move-object/from16 v13, v16

    .line 1679
    .line 1680
    move-object/from16 v0, v26

    .line 1681
    .line 1682
    goto/16 :goto_1c

    .line 1683
    .line 1684
    :cond_3e
    move/from16 v3, v22

    .line 1685
    .line 1686
    move-object/from16 v2, v27

    .line 1687
    .line 1688
    move-wide/from16 v0, v29

    .line 1689
    .line 1690
    move-object/from16 v22, v15

    .line 1691
    .line 1692
    array-length v4, v2

    .line 1693
    const/4 v6, 0x1

    .line 1694
    if-ne v4, v6, :cond_40

    .line 1695
    .line 1696
    if-ne v3, v6, :cond_40

    .line 1697
    .line 1698
    array-length v4, v12

    .line 1699
    const/4 v8, 0x2

    .line 1700
    if-lt v4, v8, :cond_40

    .line 1701
    .line 1702
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1703
    .line 1704
    .line 1705
    const/4 v4, 0x0

    .line 1706
    aget-wide v7, v16, v4

    .line 1707
    .line 1708
    aget-wide v47, v2, v4

    .line 1709
    .line 1710
    iget-wide v9, v14, Lh2/q;->c:J

    .line 1711
    .line 1712
    move/from16 v39, v6

    .line 1713
    .line 1714
    move-wide/from16 v23, v7

    .line 1715
    .line 1716
    iget-wide v6, v14, Lh2/q;->d:J

    .line 1717
    .line 1718
    move-wide/from16 v51, v6

    .line 1719
    .line 1720
    move-wide/from16 v49, v9

    .line 1721
    .line 1722
    invoke-static/range {v47 .. v53}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 1723
    .line 1724
    .line 1725
    move-result-wide v6

    .line 1726
    add-long v7, v23, v6

    .line 1727
    .line 1728
    array-length v6, v12

    .line 1729
    add-int/lit8 v6, v6, -0x1

    .line 1730
    .line 1731
    const/4 v9, 0x4

    .line 1732
    invoke-static {v9, v4, v6}, Lh1/i0;->j(III)I

    .line 1733
    .line 1734
    .line 1735
    move-result v10

    .line 1736
    array-length v11, v12

    .line 1737
    sub-int/2addr v11, v9

    .line 1738
    invoke-static {v11, v4, v6}, Lh1/i0;->j(III)I

    .line 1739
    .line 1740
    .line 1741
    move-result v6

    .line 1742
    aget-wide v27, v12, v4

    .line 1743
    .line 1744
    cmp-long v4, v27, v23

    .line 1745
    .line 1746
    if-gtz v4, :cond_3f

    .line 1747
    .line 1748
    aget-wide v9, v12, v10

    .line 1749
    .line 1750
    cmp-long v4, v23, v9

    .line 1751
    .line 1752
    if-gez v4, :cond_3f

    .line 1753
    .line 1754
    aget-wide v9, v12, v6

    .line 1755
    .line 1756
    cmp-long v4, v9, v7

    .line 1757
    .line 1758
    if-gez v4, :cond_3f

    .line 1759
    .line 1760
    cmp-long v4, v7, v45

    .line 1761
    .line 1762
    if-gtz v4, :cond_3f

    .line 1763
    .line 1764
    const/4 v4, 0x1

    .line 1765
    goto :goto_39

    .line 1766
    :cond_3f
    const/4 v4, 0x0

    .line 1767
    :goto_39
    if-eqz v4, :cond_40

    .line 1768
    .line 1769
    sub-long v6, v45, v7

    .line 1770
    .line 1771
    sub-long v47, v23, v27

    .line 1772
    .line 1773
    move/from16 v4, v21

    .line 1774
    .line 1775
    int-to-long v8, v4

    .line 1776
    iget-wide v10, v14, Lh2/q;->c:J

    .line 1777
    .line 1778
    move-wide/from16 v49, v8

    .line 1779
    .line 1780
    move-wide/from16 v51, v10

    .line 1781
    .line 1782
    invoke-static/range {v47 .. v53}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 1783
    .line 1784
    .line 1785
    move-result-wide v8

    .line 1786
    iget-wide v10, v14, Lh2/q;->c:J

    .line 1787
    .line 1788
    move-wide/from16 v47, v6

    .line 1789
    .line 1790
    move-wide/from16 v51, v10

    .line 1791
    .line 1792
    invoke-static/range {v47 .. v53}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 1793
    .line 1794
    .line 1795
    move-result-wide v6

    .line 1796
    cmp-long v4, v8, v37

    .line 1797
    .line 1798
    if-nez v4, :cond_41

    .line 1799
    .line 1800
    cmp-long v4, v6, v37

    .line 1801
    .line 1802
    if-eqz v4, :cond_40

    .line 1803
    .line 1804
    goto :goto_3a

    .line 1805
    :cond_40
    move-object/from16 v4, p1

    .line 1806
    .line 1807
    goto :goto_3b

    .line 1808
    :cond_41
    :goto_3a
    const-wide/32 v10, 0x7fffffff

    .line 1809
    .line 1810
    .line 1811
    cmp-long v4, v8, v10

    .line 1812
    .line 1813
    if-gtz v4, :cond_40

    .line 1814
    .line 1815
    cmp-long v4, v6, v10

    .line 1816
    .line 1817
    if-gtz v4, :cond_40

    .line 1818
    .line 1819
    long-to-int v3, v8

    .line 1820
    move-object/from16 v4, p1

    .line 1821
    .line 1822
    iput v3, v4, Ln1/v;->a:I

    .line 1823
    .line 1824
    long-to-int v3, v6

    .line 1825
    iput v3, v4, Ln1/v;->b:I

    .line 1826
    .line 1827
    invoke-static {v12, v0, v1}, Lh1/i0;->Z([JJ)V

    .line 1828
    .line 1829
    .line 1830
    const/16 v33, 0x0

    .line 1831
    .line 1832
    aget-wide v47, v2, v33

    .line 1833
    .line 1834
    const-wide/32 v49, 0xf4240

    .line 1835
    .line 1836
    .line 1837
    iget-wide v0, v14, Lh2/q;->d:J

    .line 1838
    .line 1839
    move-wide/from16 v51, v0

    .line 1840
    .line 1841
    invoke-static/range {v47 .. v53}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 1842
    .line 1843
    .line 1844
    move-result-wide v23

    .line 1845
    new-instance v16, Lh2/t;

    .line 1846
    .line 1847
    move-object/from16 v21, v12

    .line 1848
    .line 1849
    move-object/from16 v17, v14

    .line 1850
    .line 1851
    invoke-direct/range {v16 .. v24}, Lh2/t;-><init>(Lh2/q;[J[II[J[IJ)V

    .line 1852
    .line 1853
    .line 1854
    goto/16 :goto_38

    .line 1855
    .line 1856
    :goto_3b
    array-length v0, v2

    .line 1857
    const/4 v6, 0x1

    .line 1858
    const/16 v33, 0x0

    .line 1859
    .line 1860
    if-ne v0, v6, :cond_44

    .line 1861
    .line 1862
    aget-wide v0, v2, v33

    .line 1863
    .line 1864
    cmp-long v0, v0, v37

    .line 1865
    .line 1866
    if-nez v0, :cond_43

    .line 1867
    .line 1868
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1869
    .line 1870
    .line 1871
    aget-wide v0, v16, v33

    .line 1872
    .line 1873
    move/from16 v2, v33

    .line 1874
    .line 1875
    :goto_3c
    array-length v3, v12

    .line 1876
    if-ge v2, v3, :cond_42

    .line 1877
    .line 1878
    aget-wide v5, v12, v2

    .line 1879
    .line 1880
    sub-long v34, v5, v0

    .line 1881
    .line 1882
    iget-wide v5, v14, Lh2/q;->c:J

    .line 1883
    .line 1884
    sget-object v40, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1885
    .line 1886
    const-wide/32 v36, 0xf4240

    .line 1887
    .line 1888
    .line 1889
    move-wide/from16 v38, v5

    .line 1890
    .line 1891
    invoke-static/range {v34 .. v40}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 1892
    .line 1893
    .line 1894
    move-result-wide v5

    .line 1895
    aput-wide v5, v12, v2

    .line 1896
    .line 1897
    add-int/lit8 v2, v2, 0x1

    .line 1898
    .line 1899
    goto :goto_3c

    .line 1900
    :cond_42
    sub-long v5, v45, v0

    .line 1901
    .line 1902
    iget-wide v9, v14, Lh2/q;->c:J

    .line 1903
    .line 1904
    sget-object v11, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1905
    .line 1906
    const-wide/32 v7, 0xf4240

    .line 1907
    .line 1908
    .line 1909
    invoke-static/range {v5 .. v11}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 1910
    .line 1911
    .line 1912
    move-result-wide v23

    .line 1913
    new-instance v16, Lh2/t;

    .line 1914
    .line 1915
    move-object/from16 v21, v12

    .line 1916
    .line 1917
    move-object/from16 v17, v14

    .line 1918
    .line 1919
    invoke-direct/range {v16 .. v24}, Lh2/t;-><init>(Lh2/q;[J[II[J[IJ)V

    .line 1920
    .line 1921
    .line 1922
    move-object/from16 v13, v16

    .line 1923
    .line 1924
    move-object/from16 v0, v26

    .line 1925
    .line 1926
    goto/16 :goto_4a

    .line 1927
    .line 1928
    :cond_43
    const/4 v6, 0x1

    .line 1929
    :cond_44
    move-object/from16 v0, v18

    .line 1930
    .line 1931
    move-object/from16 v1, v19

    .line 1932
    .line 1933
    move-object/from16 v15, v22

    .line 1934
    .line 1935
    if-ne v3, v6, :cond_45

    .line 1936
    .line 1937
    const/4 v6, 0x1

    .line 1938
    goto :goto_3d

    .line 1939
    :cond_45
    move/from16 v6, v33

    .line 1940
    .line 1941
    :goto_3d
    array-length v7, v2

    .line 1942
    new-array v7, v7, [I

    .line 1943
    .line 1944
    array-length v8, v2

    .line 1945
    new-array v8, v8, [I

    .line 1946
    .line 1947
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1948
    .line 1949
    .line 1950
    move/from16 v9, v33

    .line 1951
    .line 1952
    move v10, v9

    .line 1953
    move v11, v10

    .line 1954
    move v13, v11

    .line 1955
    :goto_3e
    array-length v4, v2

    .line 1956
    if-ge v9, v4, :cond_4a

    .line 1957
    .line 1958
    move-object v4, v7

    .line 1959
    move-object/from16 v17, v8

    .line 1960
    .line 1961
    aget-wide v7, v16, v9

    .line 1962
    .line 1963
    const-wide/16 v18, -0x1

    .line 1964
    .line 1965
    cmp-long v18, v7, v18

    .line 1966
    .line 1967
    if-eqz v18, :cond_49

    .line 1968
    .line 1969
    aget-wide v45, v2, v9

    .line 1970
    .line 1971
    move/from16 v18, v9

    .line 1972
    .line 1973
    move/from16 v19, v10

    .line 1974
    .line 1975
    iget-wide v9, v14, Lh2/q;->c:J

    .line 1976
    .line 1977
    move-wide/from16 v47, v9

    .line 1978
    .line 1979
    iget-wide v9, v14, Lh2/q;->d:J

    .line 1980
    .line 1981
    sget-object v51, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1982
    .line 1983
    move-wide/from16 v49, v9

    .line 1984
    .line 1985
    invoke-static/range {v45 .. v51}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 1986
    .line 1987
    .line 1988
    move-result-wide v9

    .line 1989
    move-object/from16 v21, v4

    .line 1990
    .line 1991
    const/4 v4, 0x1

    .line 1992
    invoke-static {v12, v7, v8, v4}, Lh1/i0;->e([JJZ)I

    .line 1993
    .line 1994
    .line 1995
    move-result v22

    .line 1996
    aput v22, v21, v18

    .line 1997
    .line 1998
    :goto_3f
    aget v22, v21, v18

    .line 1999
    .line 2000
    if-ltz v22, :cond_46

    .line 2001
    .line 2002
    aget v23, v15, v22

    .line 2003
    .line 2004
    and-int/lit8 v23, v23, 0x1

    .line 2005
    .line 2006
    if-nez v23, :cond_46

    .line 2007
    .line 2008
    add-int/lit8 v22, v22, -0x1

    .line 2009
    .line 2010
    aput v22, v21, v18

    .line 2011
    .line 2012
    const/4 v4, 0x1

    .line 2013
    goto :goto_3f

    .line 2014
    :cond_46
    add-long/2addr v7, v9

    .line 2015
    invoke-static {v12, v7, v8, v6}, Lh1/i0;->a([JJZ)I

    .line 2016
    .line 2017
    .line 2018
    move-result v4

    .line 2019
    aput v4, v17, v18

    .line 2020
    .line 2021
    const/4 v4, 0x2

    .line 2022
    if-ne v3, v4, :cond_47

    .line 2023
    .line 2024
    :goto_40
    aget v9, v17, v18

    .line 2025
    .line 2026
    array-length v10, v12

    .line 2027
    const/16 v39, 0x1

    .line 2028
    .line 2029
    add-int/lit8 v10, v10, -0x1

    .line 2030
    .line 2031
    if-ge v9, v10, :cond_47

    .line 2032
    .line 2033
    add-int/lit8 v9, v9, 0x1

    .line 2034
    .line 2035
    aget-wide v22, v12, v9

    .line 2036
    .line 2037
    cmp-long v10, v22, v7

    .line 2038
    .line 2039
    if-gtz v10, :cond_47

    .line 2040
    .line 2041
    aput v9, v17, v18

    .line 2042
    .line 2043
    goto :goto_40

    .line 2044
    :cond_47
    aget v7, v17, v18

    .line 2045
    .line 2046
    aget v8, v21, v18

    .line 2047
    .line 2048
    sub-int v9, v7, v8

    .line 2049
    .line 2050
    add-int/2addr v9, v11

    .line 2051
    if-eq v13, v8, :cond_48

    .line 2052
    .line 2053
    const/4 v8, 0x1

    .line 2054
    goto :goto_41

    .line 2055
    :cond_48
    move/from16 v8, v33

    .line 2056
    .line 2057
    :goto_41
    or-int v8, v19, v8

    .line 2058
    .line 2059
    move v13, v7

    .line 2060
    move v10, v8

    .line 2061
    move v11, v9

    .line 2062
    goto :goto_42

    .line 2063
    :cond_49
    move-object/from16 v21, v4

    .line 2064
    .line 2065
    move/from16 v18, v9

    .line 2066
    .line 2067
    move/from16 v19, v10

    .line 2068
    .line 2069
    const/4 v4, 0x2

    .line 2070
    :goto_42
    add-int/lit8 v9, v18, 0x1

    .line 2071
    .line 2072
    move-object/from16 v8, v17

    .line 2073
    .line 2074
    move-object/from16 v7, v21

    .line 2075
    .line 2076
    goto :goto_3e

    .line 2077
    :cond_4a
    move-object/from16 v21, v7

    .line 2078
    .line 2079
    move-object/from16 v17, v8

    .line 2080
    .line 2081
    move/from16 v19, v10

    .line 2082
    .line 2083
    if-eq v11, v5, :cond_4b

    .line 2084
    .line 2085
    const/4 v5, 0x1

    .line 2086
    goto :goto_43

    .line 2087
    :cond_4b
    move/from16 v5, v33

    .line 2088
    .line 2089
    :goto_43
    or-int v3, v19, v5

    .line 2090
    .line 2091
    if-eqz v3, :cond_4c

    .line 2092
    .line 2093
    new-array v4, v11, [J

    .line 2094
    .line 2095
    goto :goto_44

    .line 2096
    :cond_4c
    move-object v4, v0

    .line 2097
    :goto_44
    if-eqz v3, :cond_4d

    .line 2098
    .line 2099
    new-array v5, v11, [I

    .line 2100
    .line 2101
    goto :goto_45

    .line 2102
    :cond_4d
    move-object v5, v1

    .line 2103
    :goto_45
    if-eqz v3, :cond_4e

    .line 2104
    .line 2105
    move/from16 v20, v33

    .line 2106
    .line 2107
    :cond_4e
    if-eqz v3, :cond_4f

    .line 2108
    .line 2109
    new-array v6, v11, [I

    .line 2110
    .line 2111
    goto :goto_46

    .line 2112
    :cond_4f
    move-object v6, v15

    .line 2113
    :goto_46
    new-array v7, v11, [J

    .line 2114
    .line 2115
    move/from16 v49, v20

    .line 2116
    .line 2117
    move/from16 v8, v33

    .line 2118
    .line 2119
    move v9, v8

    .line 2120
    move v10, v9

    .line 2121
    move-wide/from16 v50, v37

    .line 2122
    .line 2123
    :goto_47
    array-length v11, v2

    .line 2124
    if-ge v8, v11, :cond_54

    .line 2125
    .line 2126
    aget-wide v18, v16, v8

    .line 2127
    .line 2128
    aget v11, v21, v8

    .line 2129
    .line 2130
    aget v13, v17, v8

    .line 2131
    .line 2132
    move-object/from16 v27, v2

    .line 2133
    .line 2134
    if-eqz v3, :cond_50

    .line 2135
    .line 2136
    sub-int v2, v13, v11

    .line 2137
    .line 2138
    invoke-static {v0, v11, v4, v10, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2139
    .line 2140
    .line 2141
    invoke-static {v1, v11, v5, v10, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2142
    .line 2143
    .line 2144
    invoke-static {v15, v11, v6, v10, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2145
    .line 2146
    .line 2147
    :cond_50
    move/from16 v2, v49

    .line 2148
    .line 2149
    :goto_48
    if-ge v11, v13, :cond_53

    .line 2150
    .line 2151
    move-object/from16 v20, v0

    .line 2152
    .line 2153
    move-object/from16 v22, v1

    .line 2154
    .line 2155
    iget-wide v0, v14, Lh2/q;->d:J

    .line 2156
    .line 2157
    sget-object v56, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 2158
    .line 2159
    const-wide/32 v52, 0xf4240

    .line 2160
    .line 2161
    .line 2162
    move-wide/from16 v54, v0

    .line 2163
    .line 2164
    invoke-static/range {v50 .. v56}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 2165
    .line 2166
    .line 2167
    move-result-wide v0

    .line 2168
    aget-wide v23, v12, v11

    .line 2169
    .line 2170
    sub-long v52, v23, v18

    .line 2171
    .line 2172
    const-wide/32 v54, 0xf4240

    .line 2173
    .line 2174
    .line 2175
    move-wide/from16 v23, v0

    .line 2176
    .line 2177
    iget-wide v0, v14, Lh2/q;->c:J

    .line 2178
    .line 2179
    move-object/from16 v58, v56

    .line 2180
    .line 2181
    move-wide/from16 v56, v0

    .line 2182
    .line 2183
    invoke-static/range {v52 .. v58}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 2184
    .line 2185
    .line 2186
    move-result-wide v0

    .line 2187
    cmp-long v28, v0, v37

    .line 2188
    .line 2189
    if-gez v28, :cond_51

    .line 2190
    .line 2191
    const/4 v9, 0x1

    .line 2192
    :cond_51
    add-long v0, v23, v0

    .line 2193
    .line 2194
    aput-wide v0, v7, v10

    .line 2195
    .line 2196
    if-eqz v3, :cond_52

    .line 2197
    .line 2198
    aget v0, v5, v10

    .line 2199
    .line 2200
    if-le v0, v2, :cond_52

    .line 2201
    .line 2202
    aget v2, v22, v11

    .line 2203
    .line 2204
    :cond_52
    add-int/lit8 v10, v10, 0x1

    .line 2205
    .line 2206
    add-int/lit8 v11, v11, 0x1

    .line 2207
    .line 2208
    move-object/from16 v0, v20

    .line 2209
    .line 2210
    move-object/from16 v1, v22

    .line 2211
    .line 2212
    goto :goto_48

    .line 2213
    :cond_53
    move-object/from16 v20, v0

    .line 2214
    .line 2215
    move-object/from16 v22, v1

    .line 2216
    .line 2217
    aget-wide v0, v27, v8

    .line 2218
    .line 2219
    add-long v50, v50, v0

    .line 2220
    .line 2221
    add-int/lit8 v8, v8, 0x1

    .line 2222
    .line 2223
    move/from16 v49, v2

    .line 2224
    .line 2225
    move-object/from16 v0, v20

    .line 2226
    .line 2227
    move-object/from16 v1, v22

    .line 2228
    .line 2229
    move-object/from16 v2, v27

    .line 2230
    .line 2231
    goto :goto_47

    .line 2232
    :cond_54
    iget-wide v0, v14, Lh2/q;->d:J

    .line 2233
    .line 2234
    sget-object v56, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 2235
    .line 2236
    const-wide/32 v52, 0xf4240

    .line 2237
    .line 2238
    .line 2239
    move-wide/from16 v54, v0

    .line 2240
    .line 2241
    invoke-static/range {v50 .. v56}, Lh1/i0;->a0(JJJLjava/math/RoundingMode;)J

    .line 2242
    .line 2243
    .line 2244
    move-result-wide v52

    .line 2245
    if-eqz v9, :cond_55

    .line 2246
    .line 2247
    invoke-virtual/range {v25 .. v25}, Landroidx/media3/common/w;->a()Landroidx/media3/common/v;

    .line 2248
    .line 2249
    .line 2250
    move-result-object v0

    .line 2251
    const/4 v1, 0x1

    .line 2252
    iput-boolean v1, v0, Landroidx/media3/common/v;->s:Z

    .line 2253
    .line 2254
    new-instance v1, Landroidx/media3/common/w;

    .line 2255
    .line 2256
    invoke-direct {v1, v0}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    .line 2257
    .line 2258
    .line 2259
    new-instance v54, Lh2/q;

    .line 2260
    .line 2261
    iget v0, v14, Lh2/q;->a:I

    .line 2262
    .line 2263
    iget v2, v14, Lh2/q;->b:I

    .line 2264
    .line 2265
    iget-wide v8, v14, Lh2/q;->c:J

    .line 2266
    .line 2267
    iget-wide v10, v14, Lh2/q;->d:J

    .line 2268
    .line 2269
    iget-wide v12, v14, Lh2/q;->e:J

    .line 2270
    .line 2271
    move/from16 v55, v0

    .line 2272
    .line 2273
    move-object/from16 v65, v1

    .line 2274
    .line 2275
    iget-wide v0, v14, Lh2/q;->f:J

    .line 2276
    .line 2277
    iget v3, v14, Lh2/q;->h:I

    .line 2278
    .line 2279
    iget-object v15, v14, Lh2/q;->l:[Lh2/r;

    .line 2280
    .line 2281
    move-wide/from16 v63, v0

    .line 2282
    .line 2283
    iget v0, v14, Lh2/q;->k:I

    .line 2284
    .line 2285
    iget-object v1, v14, Lh2/q;->i:[J

    .line 2286
    .line 2287
    iget-object v14, v14, Lh2/q;->j:[J

    .line 2288
    .line 2289
    move/from16 v68, v0

    .line 2290
    .line 2291
    move-object/from16 v69, v1

    .line 2292
    .line 2293
    move/from16 v56, v2

    .line 2294
    .line 2295
    move/from16 v66, v3

    .line 2296
    .line 2297
    move-wide/from16 v57, v8

    .line 2298
    .line 2299
    move-wide/from16 v59, v10

    .line 2300
    .line 2301
    move-wide/from16 v61, v12

    .line 2302
    .line 2303
    move-object/from16 v70, v14

    .line 2304
    .line 2305
    move-object/from16 v67, v15

    .line 2306
    .line 2307
    invoke-direct/range {v54 .. v70}, Lh2/q;-><init>(IIJJJJLandroidx/media3/common/w;I[Lh2/r;I[J[J)V

    .line 2308
    .line 2309
    .line 2310
    move-object/from16 v46, v54

    .line 2311
    .line 2312
    goto :goto_49

    .line 2313
    :cond_55
    move-object/from16 v46, v14

    .line 2314
    .line 2315
    :goto_49
    new-instance v45, Lh2/t;

    .line 2316
    .line 2317
    move-object/from16 v47, v4

    .line 2318
    .line 2319
    move-object/from16 v48, v5

    .line 2320
    .line 2321
    move-object/from16 v51, v6

    .line 2322
    .line 2323
    move-object/from16 v50, v7

    .line 2324
    .line 2325
    invoke-direct/range {v45 .. v53}, Lh2/t;-><init>(Lh2/q;[J[II[J[IJ)V

    .line 2326
    .line 2327
    .line 2328
    move-object/from16 v0, v26

    .line 2329
    .line 2330
    move-object/from16 v13, v45

    .line 2331
    .line 2332
    :goto_4a
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2333
    .line 2334
    .line 2335
    :goto_4b
    add-int/lit8 v5, v44, 0x1

    .line 2336
    .line 2337
    move-object v3, v0

    .line 2338
    move-object/from16 v2, v43

    .line 2339
    .line 2340
    move-object/from16 v0, p0

    .line 2341
    .line 2342
    goto/16 :goto_0

    .line 2343
    .line 2344
    :cond_56
    const-string v0, "Track has no sample table size information"

    .line 2345
    .line 2346
    const/4 v1, 0x0

    .line 2347
    invoke-static {v0, v1}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 2348
    .line 2349
    .line 2350
    move-result-object v0

    .line 2351
    throw v0

    .line 2352
    :cond_57
    const/4 v1, 0x0

    .line 2353
    const-string v0, "Malformed sample table (stbl) missing sample description (stsd)"

    .line 2354
    .line 2355
    invoke-static {v0, v1}, Landroidx/media3/common/v0;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/v0;

    .line 2356
    .line 2357
    .line 2358
    move-result-object v0

    .line 2359
    throw v0

    .line 2360
    :cond_58
    move-object v0, v3

    .line 2361
    return-object v0
.end method

.method public static h(Lh1/w;IIIIILandroidx/media3/common/s;Lb6/s;I)V
    .locals 49

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    add-int/lit8 v5, v1, 0x10

    .line 1
    invoke-virtual {v0, v5}, Lh1/w;->G(I)V

    const/16 v5, 0x10

    .line 2
    invoke-virtual {v0, v5}, Lh1/w;->H(I)V

    .line 3
    invoke-virtual {v0}, Lh1/w;->A()I

    move-result v5

    .line 4
    invoke-virtual {v0}, Lh1/w;->A()I

    move-result v6

    const/16 v7, 0x32

    .line 5
    invoke-virtual {v0, v7}, Lh1/w;->H(I)V

    .line 6
    iget v7, v0, Lh1/w;->b:I

    const v8, 0x656e6376

    move/from16 v10, p1

    if-ne v10, v8, :cond_2

    .line 7
    invoke-static {v0, v1, v2}, Lh2/d;->e(Lh1/w;II)Landroid/util/Pair;

    move-result-object v8

    if-eqz v8, :cond_1

    .line 8
    iget-object v10, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-nez v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    .line 9
    :cond_0
    iget-object v11, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v11, Lh2/r;

    iget-object v11, v11, Lh2/r;->b:Ljava/lang/String;

    invoke-virtual {v3, v11}, Landroidx/media3/common/s;->a(Ljava/lang/String;)Landroidx/media3/common/s;

    move-result-object v3

    .line 10
    :goto_0
    iget-object v11, v4, Lb6/s;->c:Ljava/lang/Cloneable;

    check-cast v11, [Lh2/r;

    iget-object v8, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v8, Lh2/r;

    aput-object v8, v11, p8

    .line 11
    :cond_1
    invoke-virtual {v0, v7}, Lh1/w;->G(I)V

    :cond_2
    const v8, 0x6d317620

    .line 12
    const-string v11, "video/3gpp"

    if-ne v10, v8, :cond_3

    .line 13
    const-string v8, "video/mpeg"

    goto :goto_1

    :cond_3
    const v8, 0x48323633

    if-ne v10, v8, :cond_4

    move-object v8, v11

    goto :goto_1

    :cond_4
    const/4 v8, 0x0

    :goto_1
    const/high16 v14, 0x3f800000    # 1.0f

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, -0x1

    const/16 v19, -0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v27, -0x1

    const/16 v28, -0x1

    const/16 v29, -0x1

    const/16 v30, 0x8

    const/16 v31, 0x8

    const/16 v32, 0x0

    const/16 v33, 0x0

    :goto_2
    sub-int v12, v7, v1

    if-ge v12, v2, :cond_5

    .line 14
    invoke-virtual {v0, v7}, Lh1/w;->G(I)V

    .line 15
    iget v12, v0, Lh1/w;->b:I

    .line 16
    invoke-virtual {v0}, Lh1/w;->g()I

    move-result v13

    if-nez v13, :cond_6

    .line 17
    iget v9, v0, Lh1/w;->b:I

    sub-int/2addr v9, v1

    if-ne v9, v2, :cond_6

    :cond_5
    move-object/from16 v38, v3

    move-object/from16 v33, v15

    move/from16 v37, v18

    move/from16 v7, v27

    move/from16 v26, v28

    move/from16 v11, v29

    move/from16 v24, v30

    move/from16 v25, v31

    const/4 v2, 0x0

    move-object/from16 v30, v8

    goto/16 :goto_45

    :cond_6
    if-lez v13, :cond_7

    const/4 v9, 0x1

    goto :goto_3

    :cond_7
    const/4 v9, 0x0

    .line 18
    :goto_3
    const-string v1, "childAtomSize must be positive"

    invoke-static {v1, v9}, Ln1/b;->d(Ljava/lang/String;Z)V

    .line 19
    invoke-virtual {v0}, Lh1/w;->g()I

    move-result v9

    const v2, 0x61766343

    if-ne v9, v2, :cond_a

    if-nez v8, :cond_8

    const/4 v1, 0x1

    :goto_4
    const/4 v2, 0x0

    goto :goto_5

    :cond_8
    const/4 v1, 0x0

    goto :goto_4

    .line 20
    :goto_5
    invoke-static {v2, v1}, Ln1/b;->d(Ljava/lang/String;Z)V

    add-int/lit8 v12, v12, 0x8

    .line 21
    invoke-virtual {v0, v12}, Lh1/w;->G(I)V

    .line 22
    invoke-static {v0}, Ln1/d;->a(Lh1/w;)Ln1/d;

    move-result-object v1

    .line 23
    iget-object v15, v1, Ln1/d;->a:Ljava/util/ArrayList;

    .line 24
    iget v2, v1, Ln1/d;->b:I

    iput v2, v4, Lb6/s;->a:I

    if-nez v21, :cond_9

    .line 25
    iget v14, v1, Ln1/d;->k:F

    .line 26
    :cond_9
    iget-object v2, v1, Ln1/d;->l:Ljava/lang/String;

    .line 27
    iget v8, v1, Ln1/d;->j:I

    .line 28
    iget v9, v1, Ln1/d;->g:I

    .line 29
    iget v12, v1, Ln1/d;->h:I

    move-object/from16 v16, v2

    .line 30
    iget v2, v1, Ln1/d;->i:I

    move/from16 v19, v2

    .line 31
    iget v2, v1, Ln1/d;->e:I

    .line 32
    iget v1, v1, Ln1/d;->f:I

    .line 33
    const-string v23, "video/avc"

    move/from16 v25, v1

    move/from16 v30, v2

    move-object/from16 v38, v3

    move/from16 v27, v7

    move v7, v9

    move/from16 v31, v10

    move-object/from16 v28, v11

    move/from16 v26, v12

    move/from16 v29, v19

    const/4 v2, 0x0

    const/4 v12, -0x1

    move/from16 v19, v8

    move-object/from16 v8, v23

    goto/16 :goto_44

    :cond_a
    const v2, 0x68766343

    move/from16 v24, v7

    const-string v7, "video/hevc"

    if-ne v9, v2, :cond_e

    if-nez v8, :cond_b

    const/4 v1, 0x1

    :goto_6
    const/4 v2, 0x0

    goto :goto_7

    :cond_b
    const/4 v1, 0x0

    goto :goto_6

    .line 34
    :goto_7
    invoke-static {v2, v1}, Ln1/b;->d(Ljava/lang/String;Z)V

    add-int/lit8 v12, v12, 0x8

    .line 35
    invoke-virtual {v0, v12}, Lh1/w;->G(I)V

    const/4 v1, 0x0

    .line 36
    invoke-static {v0, v1, v2}, Ln1/w;->a(Lh1/w;ZLa1/h;)Ln1/w;

    move-result-object v8

    .line 37
    iget-object v15, v8, Ln1/w;->a:Ljava/util/List;

    .line 38
    iget v1, v8, Ln1/w;->b:I

    iput v1, v4, Lb6/s;->a:I

    if-nez v21, :cond_c

    .line 39
    iget v14, v8, Ln1/w;->i:F

    .line 40
    :cond_c
    iget v1, v8, Ln1/w;->j:I

    .line 41
    iget-object v2, v8, Ln1/w;->k:Ljava/lang/String;

    .line 42
    iget v9, v8, Ln1/w;->h:I

    const/4 v12, -0x1

    if-eq v9, v12, :cond_d

    move/from16 v18, v9

    .line 43
    :cond_d
    iget v9, v8, Ln1/w;->e:I

    .line 44
    iget v12, v8, Ln1/w;->f:I

    move/from16 v16, v1

    .line 45
    iget v1, v8, Ln1/w;->g:I

    move/from16 v19, v1

    .line 46
    iget v1, v8, Ln1/w;->c:I

    move/from16 v23, v1

    .line 47
    iget v1, v8, Ln1/w;->d:I

    .line 48
    iget-object v8, v8, Ln1/w;->l:La1/h;

    move/from16 v25, v1

    move-object/from16 v38, v3

    move-object/from16 v33, v8

    move/from16 v31, v10

    move-object/from16 v28, v11

    move/from16 v26, v12

    move/from16 v29, v19

    move/from16 v30, v23

    move/from16 v27, v24

    const/4 v12, -0x1

    move-object v8, v7

    move v7, v9

    move/from16 v19, v16

    move-object/from16 v16, v2

    const/4 v2, 0x0

    goto/16 :goto_44

    :cond_e
    const v2, 0x6c687643

    move-object/from16 v25, v11

    const/4 v11, 0x2

    if-ne v9, v2, :cond_1a

    .line 49
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "lhvC must follow hvcC atom"

    .line 50
    invoke-static {v2, v1}, Ln1/b;->d(Ljava/lang/String;Z)V

    move-object/from16 v2, v33

    if-eqz v2, :cond_f

    .line 51
    iget-object v1, v2, La1/h;->j:Ljava/lang/Object;

    check-cast v1, Lf6/m0;

    .line 52
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-lt v1, v11, :cond_f

    const/4 v1, 0x1

    goto :goto_8

    :cond_f
    const/4 v1, 0x0

    :goto_8
    const-string v7, "must have at least two layers"

    .line 53
    invoke-static {v7, v1}, Ln1/b;->d(Ljava/lang/String;Z)V

    add-int/lit8 v12, v12, 0x8

    .line 54
    invoke-virtual {v0, v12}, Lh1/w;->G(I)V

    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    .line 56
    invoke-static {v0, v1, v2}, Ln1/w;->a(Lh1/w;ZLa1/h;)Ln1/w;

    move-result-object v7

    .line 57
    iget v1, v4, Lb6/s;->a:I

    iget v8, v7, Ln1/w;->b:I

    if-ne v1, v8, :cond_10

    const/4 v1, 0x1

    goto :goto_9

    :cond_10
    const/4 v1, 0x0

    :goto_9
    const-string v8, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms"

    invoke-static {v8, v1}, Ln1/b;->d(Ljava/lang/String;Z)V

    .line 58
    iget v1, v7, Ln1/w;->e:I

    const/4 v12, -0x1

    move/from16 v8, v27

    if-eq v1, v12, :cond_12

    if-ne v8, v1, :cond_11

    const/4 v1, 0x1

    goto :goto_a

    :cond_11
    const/4 v1, 0x0

    .line 59
    :goto_a
    const-string v9, "colorSpace must be the same for both views"

    invoke-static {v9, v1}, Ln1/b;->d(Ljava/lang/String;Z)V

    .line 60
    :cond_12
    iget v1, v7, Ln1/w;->f:I

    move/from16 v9, v28

    if-eq v1, v12, :cond_14

    if-ne v9, v1, :cond_13

    const/4 v1, 0x1

    goto :goto_b

    :cond_13
    const/4 v1, 0x0

    .line 61
    :goto_b
    const-string v11, "colorRange must be the same for both views"

    invoke-static {v11, v1}, Ln1/b;->d(Ljava/lang/String;Z)V

    .line 62
    :cond_14
    iget v1, v7, Ln1/w;->g:I

    move/from16 v11, v29

    if-eq v1, v12, :cond_16

    if-ne v11, v1, :cond_15

    const/4 v1, 0x1

    goto :goto_c

    :cond_15
    const/4 v1, 0x0

    .line 63
    :goto_c
    const-string v12, "colorTransfer must be the same for both views"

    invoke-static {v12, v1}, Ln1/b;->d(Ljava/lang/String;Z)V

    .line 64
    :cond_16
    iget v1, v7, Ln1/w;->c:I

    move/from16 v12, v30

    if-ne v12, v1, :cond_17

    const/4 v1, 0x1

    :goto_d
    move/from16 v16, v8

    goto :goto_e

    :cond_17
    const/4 v1, 0x0

    goto :goto_d

    :goto_e
    const-string v8, "bitdepthLuma must be the same for both views"

    invoke-static {v8, v1}, Ln1/b;->d(Ljava/lang/String;Z)V

    .line 65
    iget v1, v7, Ln1/w;->d:I

    move/from16 v8, v31

    if-ne v8, v1, :cond_18

    const/4 v1, 0x1

    :goto_f
    move/from16 v26, v8

    goto :goto_10

    :cond_18
    const/4 v1, 0x0

    goto :goto_f

    :goto_10
    const-string v8, "bitdepthChroma must be the same for both views"

    invoke-static {v8, v1}, Ln1/b;->d(Ljava/lang/String;Z)V

    if-eqz v15, :cond_19

    .line 66
    invoke-static {}, Lf6/m0;->i()Lf6/j0;

    move-result-object v1

    .line 67
    invoke-virtual {v1, v15}, Lf6/g0;->c(Ljava/lang/Iterable;)V

    .line 68
    iget-object v8, v7, Ln1/w;->a:Ljava/util/List;

    .line 69
    invoke-virtual {v1, v8}, Lf6/g0;->c(Ljava/lang/Iterable;)V

    .line 70
    invoke-virtual {v1}, Lf6/j0;->f()Lf6/l1;

    move-result-object v15

    goto :goto_11

    .line 71
    :cond_19
    const-string v1, "initializationData must be already set from hvcC atom"

    const/4 v8, 0x0

    invoke-static {v1, v8}, Ln1/b;->d(Ljava/lang/String;Z)V

    .line 72
    :goto_11
    iget-object v1, v7, Ln1/w;->k:Ljava/lang/String;

    .line 73
    const-string v7, "video/mv-hevc"

    move-object/from16 v33, v2

    move-object/from16 v38, v3

    move-object v8, v7

    move/from16 v31, v10

    move/from16 v29, v11

    move/from16 v30, v12

    move/from16 v7, v16

    move/from16 v27, v24

    move-object/from16 v28, v25

    move/from16 v25, v26

    const/4 v2, 0x0

    const/4 v12, -0x1

    move-object/from16 v16, v1

    move/from16 v26, v9

    goto/16 :goto_44

    :cond_1a
    move/from16 v7, v27

    move/from16 v26, v28

    move/from16 v34, v29

    move-object/from16 v2, v33

    move/from16 v27, v24

    move-object/from16 v28, v25

    move/from16 v24, v30

    move/from16 v25, v31

    const/16 v33, 0x5

    const v11, 0x76657875

    if-ne v9, v11, :cond_2a

    add-int/lit8 v9, v12, 0x8

    .line 74
    invoke-virtual {v0, v9}, Lh1/w;->G(I)V

    .line 75
    iget v9, v0, Lh1/w;->b:I

    move-object/from16 v30, v8

    const/4 v11, 0x0

    :goto_12
    sub-int v8, v9, v12

    if-ge v8, v13, :cond_23

    .line 76
    invoke-virtual {v0, v9}, Lh1/w;->G(I)V

    .line 77
    invoke-virtual {v0}, Lh1/w;->g()I

    move-result v8

    move/from16 v36, v9

    if-lez v8, :cond_1b

    const/4 v9, 0x1

    goto :goto_13

    :cond_1b
    const/4 v9, 0x0

    .line 78
    :goto_13
    invoke-static {v1, v9}, Ln1/b;->d(Ljava/lang/String;Z)V

    .line 79
    invoke-virtual {v0}, Lh1/w;->g()I

    move-result v9

    const v4, 0x65796573

    if-ne v9, v4, :cond_22

    add-int/lit8 v9, v36, 0x8

    .line 80
    invoke-virtual {v0, v9}, Lh1/w;->G(I)V

    .line 81
    iget v4, v0, Lh1/w;->b:I

    :goto_14
    sub-int v9, v4, v36

    if-ge v9, v8, :cond_21

    .line 82
    invoke-virtual {v0, v4}, Lh1/w;->G(I)V

    .line 83
    invoke-virtual {v0}, Lh1/w;->g()I

    move-result v9

    if-lez v9, :cond_1c

    const/4 v11, 0x1

    goto :goto_15

    :cond_1c
    const/4 v11, 0x0

    .line 84
    :goto_15
    invoke-static {v1, v11}, Ln1/b;->d(Ljava/lang/String;Z)V

    .line 85
    invoke-virtual {v0}, Lh1/w;->g()I

    move-result v11

    move-object/from16 v37, v1

    const v1, 0x73747269

    if-ne v11, v1, :cond_20

    const/4 v1, 0x4

    .line 86
    invoke-virtual {v0, v1}, Lh1/w;->H(I)V

    .line 87
    invoke-virtual {v0}, Lh1/w;->u()I

    move-result v1

    .line 88
    new-instance v4, La1/o;

    new-instance v9, La4/k;

    and-int/lit8 v11, v1, 0x1

    move/from16 v38, v1

    const/4 v1, 0x1

    if-ne v11, v1, :cond_1d

    const/4 v1, 0x1

    goto :goto_16

    :cond_1d
    const/4 v1, 0x0

    :goto_16
    and-int/lit8 v11, v38, 0x2

    move/from16 v39, v8

    const/4 v8, 0x2

    if-ne v11, v8, :cond_1e

    const/4 v8, 0x1

    goto :goto_17

    :cond_1e
    const/4 v8, 0x0

    :goto_17
    and-int/lit8 v11, v38, 0x8

    move-object/from16 v38, v3

    const/16 v3, 0x8

    if-ne v11, v3, :cond_1f

    const/4 v3, 0x1

    goto :goto_18

    :cond_1f
    const/4 v3, 0x0

    .line 89
    :goto_18
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 90
    iput-boolean v1, v9, La4/k;->a:Z

    .line 91
    iput-boolean v8, v9, La4/k;->b:Z

    .line 92
    iput-boolean v3, v9, La4/k;->c:Z

    const/16 v1, 0x18

    .line 93
    invoke-direct {v4, v1, v9}, La1/o;-><init>(ILjava/lang/Object;)V

    goto :goto_19

    :cond_20
    move-object/from16 v38, v3

    move/from16 v39, v8

    add-int/2addr v4, v9

    move-object/from16 v1, v37

    goto :goto_14

    :cond_21
    move-object/from16 v37, v1

    move-object/from16 v38, v3

    move/from16 v39, v8

    const/4 v4, 0x0

    :goto_19
    move-object v11, v4

    goto :goto_1a

    :cond_22
    move-object/from16 v37, v1

    move-object/from16 v38, v3

    move/from16 v39, v8

    :goto_1a
    add-int v9, v36, v39

    move-object/from16 v4, p7

    move-object/from16 v1, v37

    move-object/from16 v3, v38

    goto/16 :goto_12

    :cond_23
    move-object/from16 v38, v3

    if-nez v11, :cond_24

    const/4 v1, 0x0

    goto :goto_1b

    .line 94
    :cond_24
    new-instance v1, La1/o;

    const/16 v3, 0x19

    invoke-direct {v1, v3, v11}, La1/o;-><init>(ILjava/lang/Object;)V

    :goto_1b
    if-eqz v1, :cond_26

    .line 95
    iget-object v1, v1, La1/o;->k:Ljava/lang/Object;

    check-cast v1, La1/o;

    iget-object v1, v1, La1/o;->k:Ljava/lang/Object;

    check-cast v1, La4/k;

    if-eqz v2, :cond_27

    .line 96
    iget-object v3, v2, La1/h;->j:Ljava/lang/Object;

    check-cast v3, Lf6/m0;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    const/4 v8, 0x2

    if-lt v3, v8, :cond_27

    .line 97
    iget-boolean v3, v1, La4/k;->a:Z

    if-eqz v3, :cond_25

    .line 98
    iget-boolean v3, v1, La4/k;->b:Z

    if-eqz v3, :cond_25

    const/4 v3, 0x1

    goto :goto_1c

    :cond_25
    const/4 v3, 0x0

    .line 99
    :goto_1c
    const-string v4, "both eye views must be marked as available"

    .line 100
    invoke-static {v4, v3}, Ln1/b;->d(Ljava/lang/String;Z)V

    .line 101
    iget-boolean v1, v1, La4/k;->c:Z

    const/16 v23, 0x1

    xor-int/lit8 v1, v1, 0x1

    .line 102
    const-string v3, "for MV-HEVC, eye_views_reversed must be set to false"

    .line 103
    invoke-static {v3, v1}, Ln1/b;->d(Ljava/lang/String;Z)V

    :cond_26
    move/from16 v3, v18

    goto :goto_1d

    :cond_27
    move/from16 v3, v18

    const/4 v12, -0x1

    if-ne v3, v12, :cond_29

    .line 104
    iget-boolean v1, v1, La4/k;->c:Z

    if-eqz v1, :cond_28

    move/from16 v18, v33

    goto :goto_1e

    :cond_28
    const/16 v18, 0x4

    goto :goto_1e

    :cond_29
    :goto_1d
    move/from16 v18, v3

    :goto_1e
    move-object/from16 v33, v2

    :goto_1f
    move/from16 v31, v10

    move-object/from16 v8, v30

    move/from16 v29, v34

    const/4 v2, 0x0

    const/4 v12, -0x1

    move/from16 v30, v24

    goto/16 :goto_44

    :cond_2a
    move-object/from16 v38, v3

    move-object/from16 v30, v8

    move/from16 v3, v18

    const v1, 0x64766343

    if-eq v9, v1, :cond_2b

    const v1, 0x64767643

    if-ne v9, v1, :cond_2c

    :cond_2b
    move-object/from16 v18, v2

    move/from16 v37, v3

    move/from16 v31, v10

    move-object/from16 v33, v15

    move/from16 v11, v34

    const/4 v2, 0x0

    const/4 v12, -0x1

    goto/16 :goto_42

    :cond_2c
    const v1, 0x76706343

    const/16 v18, 0xa

    const/16 v4, 0xc

    const/16 v36, 0x7

    if-ne v9, v1, :cond_32

    if-nez v30, :cond_2d

    const/4 v1, 0x1

    :goto_20
    const/4 v7, 0x0

    goto :goto_21

    :cond_2d
    const/4 v1, 0x0

    goto :goto_20

    .line 105
    :goto_21
    invoke-static {v7, v1}, Ln1/b;->d(Ljava/lang/String;Z)V

    const v1, 0x76703038

    .line 106
    const-string v7, "video/x-vnd.on2.vp9"

    if-ne v10, v1, :cond_2e

    const-string v1, "video/x-vnd.on2.vp8"

    goto :goto_22

    :cond_2e
    move-object v1, v7

    :goto_22
    add-int/lit8 v12, v12, 0xc

    .line 107
    invoke-virtual {v0, v12}, Lh1/w;->G(I)V

    .line 108
    invoke-virtual {v0}, Lh1/w;->u()I

    move-result v9

    int-to-byte v9, v9

    .line 109
    invoke-virtual {v0}, Lh1/w;->u()I

    move-result v12

    int-to-byte v12, v12

    .line 110
    invoke-virtual {v0}, Lh1/w;->u()I

    move-result v24

    const/16 v37, 0x6

    shr-int/lit8 v8, v24, 0x4

    shr-int/lit8 v25, v24, 0x1

    const/16 v39, 0x3

    and-int/lit8 v11, v25, 0x7

    int-to-byte v11, v11

    .line 111
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2f

    int-to-byte v7, v8

    .line 112
    sget-object v15, Lh1/c;->a:[B

    .line 113
    new-array v4, v4, [B

    const/4 v15, 0x0

    const/16 v23, 0x1

    aput-byte v23, v4, v15

    aput-byte v23, v4, v23

    const/16 v29, 0x2

    aput-byte v9, v4, v29

    aput-byte v29, v4, v39

    const/16 v35, 0x4

    aput-byte v23, v4, v35

    aput-byte v12, v4, v33

    aput-byte v39, v4, v37

    aput-byte v23, v4, v36

    const/16 v9, 0x8

    aput-byte v7, v4, v9

    const/16 v7, 0x9

    aput-byte v35, v4, v7

    aput-byte v23, v4, v18

    const/16 v7, 0xb

    aput-byte v11, v4, v7

    invoke-static {v4}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    move-result-object v15

    :cond_2f
    and-int/lit8 v4, v24, 0x1

    if-eqz v4, :cond_30

    const/4 v4, 0x1

    goto :goto_23

    :cond_30
    const/4 v4, 0x0

    .line 114
    :goto_23
    invoke-virtual {v0}, Lh1/w;->u()I

    move-result v7

    .line 115
    invoke-virtual {v0}, Lh1/w;->u()I

    move-result v9

    .line 116
    invoke-static {v7}, Landroidx/media3/common/l;->f(I)I

    move-result v7

    if-eqz v4, :cond_31

    const/16 v23, 0x1

    goto :goto_24

    :cond_31
    const/16 v23, 0x2

    .line 117
    :goto_24
    invoke-static {v9}, Landroidx/media3/common/l;->g(I)I

    move-result v29

    move-object/from16 v33, v2

    move/from16 v18, v3

    move/from16 v25, v8

    move/from16 v30, v25

    move/from16 v31, v10

    move/from16 v26, v23

    const/4 v2, 0x0

    const/4 v12, -0x1

    move-object v8, v1

    goto/16 :goto_44

    :cond_32
    const/16 v37, 0x6

    const/16 v39, 0x3

    const v1, 0x61763143

    .line 118
    const-string v8, "BoxParsers"

    if-ne v9, v1, :cond_4c

    add-int/lit8 v1, v13, -0x8

    .line 119
    new-array v7, v1, [B

    const/4 v11, 0x0

    .line 120
    invoke-virtual {v0, v7, v11, v1}, Lh1/w;->e([BII)V

    .line 121
    invoke-static {v7}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    move-result-object v15

    add-int/lit8 v12, v12, 0x8

    .line 122
    invoke-virtual {v0, v12}, Lh1/w;->G(I)V

    .line 123
    new-instance v1, Lh1/v;

    .line 124
    iget-object v7, v0, Lh1/w;->a:[B

    .line 125
    array-length v9, v7

    invoke-direct {v1, v7, v9}, Lh1/v;-><init>([BI)V

    .line 126
    iget v7, v0, Lh1/w;->b:I

    const/16 v9, 0x8

    mul-int/2addr v7, v9

    .line 127
    invoke-virtual {v1, v7}, Lh1/v;->s(I)V

    const/4 v7, 0x1

    .line 128
    invoke-virtual {v1, v7}, Lh1/v;->w(I)V

    move/from16 v7, v39

    .line 129
    invoke-virtual {v1, v7}, Lh1/v;->k(I)I

    move-result v9

    move/from16 v7, v37

    .line 130
    invoke-virtual {v1, v7}, Lh1/v;->v(I)V

    .line 131
    invoke-virtual {v1}, Lh1/v;->j()Z

    move-result v7

    .line 132
    invoke-virtual {v1}, Lh1/v;->j()Z

    move-result v12

    const/16 v41, -0x1

    const/4 v11, 0x2

    if-ne v9, v11, :cond_35

    if-eqz v7, :cond_35

    if-eqz v12, :cond_33

    move v7, v4

    goto :goto_25

    :cond_33
    move/from16 v7, v18

    :goto_25
    if-eqz v12, :cond_34

    move/from16 v18, v4

    :cond_34
    move/from16 v44, v7

    :goto_26
    move/from16 v45, v18

    goto :goto_29

    :cond_35
    if-gt v9, v11, :cond_38

    if-eqz v7, :cond_36

    move/from16 v9, v18

    goto :goto_27

    :cond_36
    const/16 v9, 0x8

    :goto_27
    if-eqz v7, :cond_37

    goto :goto_28

    :cond_37
    const/16 v18, 0x8

    :goto_28
    move/from16 v44, v9

    goto :goto_26

    :cond_38
    move/from16 v44, v41

    move/from16 v45, v44

    :goto_29
    const/16 v7, 0xd

    .line 133
    invoke-virtual {v1, v7}, Lh1/v;->v(I)V

    .line 134
    invoke-virtual {v1}, Lh1/v;->u()V

    const/4 v9, 0x4

    .line 135
    invoke-virtual {v1, v9}, Lh1/v;->k(I)I

    move-result v11

    const/16 v46, 0x0

    const/4 v9, 0x1

    if-eq v11, v9, :cond_39

    .line 136
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Unsupported obu_type: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v1}, Lh1/a;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    new-instance v40, Landroidx/media3/common/l;

    move/from16 v42, v41

    move/from16 v43, v41

    .line 138
    invoke-direct/range {v40 .. v46}, Landroidx/media3/common/l;-><init>(IIIII[B)V

    :goto_2a
    move-object/from16 v1, v40

    const/16 v11, 0x8

    goto/16 :goto_31

    .line 139
    :cond_39
    invoke-virtual {v1}, Lh1/v;->j()Z

    move-result v9

    if-eqz v9, :cond_3a

    .line 140
    const-string v1, "Unsupported obu_extension_flag"

    invoke-static {v8, v1}, Lh1/a;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    new-instance v40, Landroidx/media3/common/l;

    move/from16 v42, v41

    move/from16 v43, v41

    .line 142
    invoke-direct/range {v40 .. v46}, Landroidx/media3/common/l;-><init>(IIIII[B)V

    goto :goto_2a

    .line 143
    :cond_3a
    invoke-virtual {v1}, Lh1/v;->j()Z

    move-result v9

    .line 144
    invoke-virtual {v1}, Lh1/v;->u()V

    if-eqz v9, :cond_3b

    const/16 v9, 0x8

    .line 145
    invoke-virtual {v1, v9}, Lh1/v;->k(I)I

    move-result v11

    const/16 v9, 0x7f

    if-le v11, v9, :cond_3b

    .line 146
    const-string v1, "Excessive obu_size"

    invoke-static {v8, v1}, Lh1/a;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    new-instance v40, Landroidx/media3/common/l;

    move/from16 v42, v41

    move/from16 v43, v41

    .line 148
    invoke-direct/range {v40 .. v46}, Landroidx/media3/common/l;-><init>(IIIII[B)V

    goto :goto_2a

    :cond_3b
    const/4 v9, 0x3

    .line 149
    invoke-virtual {v1, v9}, Lh1/v;->k(I)I

    move-result v11

    .line 150
    invoke-virtual {v1}, Lh1/v;->u()V

    .line 151
    invoke-virtual {v1}, Lh1/v;->j()Z

    move-result v9

    if-eqz v9, :cond_3c

    .line 152
    const-string v1, "Unsupported reduced_still_picture_header"

    invoke-static {v8, v1}, Lh1/a;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    new-instance v40, Landroidx/media3/common/l;

    move/from16 v42, v41

    move/from16 v43, v41

    .line 154
    invoke-direct/range {v40 .. v46}, Landroidx/media3/common/l;-><init>(IIIII[B)V

    goto :goto_2a

    .line 155
    :cond_3c
    invoke-virtual {v1}, Lh1/v;->j()Z

    move-result v9

    if-eqz v9, :cond_3d

    .line 156
    const-string v1, "Unsupported timing_info_present_flag"

    invoke-static {v8, v1}, Lh1/a;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    new-instance v40, Landroidx/media3/common/l;

    move/from16 v42, v41

    move/from16 v43, v41

    .line 158
    invoke-direct/range {v40 .. v46}, Landroidx/media3/common/l;-><init>(IIIII[B)V

    goto :goto_2a

    .line 159
    :cond_3d
    invoke-virtual {v1}, Lh1/v;->j()Z

    move-result v9

    if-eqz v9, :cond_3e

    .line 160
    const-string v1, "Unsupported initial_display_delay_present_flag"

    invoke-static {v8, v1}, Lh1/a;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    new-instance v40, Landroidx/media3/common/l;

    move/from16 v42, v41

    move/from16 v43, v41

    .line 162
    invoke-direct/range {v40 .. v46}, Landroidx/media3/common/l;-><init>(IIIII[B)V

    goto/16 :goto_2a

    :cond_3e
    move/from16 v8, v33

    .line 163
    invoke-virtual {v1, v8}, Lh1/v;->k(I)I

    move-result v9

    const/4 v12, 0x0

    :goto_2b
    if-gt v12, v9, :cond_40

    .line 164
    invoke-virtual {v1, v4}, Lh1/v;->v(I)V

    .line 165
    invoke-virtual {v1, v8}, Lh1/v;->k(I)I

    move-result v4

    move/from16 v8, v36

    if-le v4, v8, :cond_3f

    .line 166
    invoke-virtual {v1}, Lh1/v;->u()V

    :cond_3f
    add-int/lit8 v12, v12, 0x1

    const/16 v4, 0xc

    const/4 v8, 0x5

    const/16 v36, 0x7

    goto :goto_2b

    :cond_40
    const/4 v4, 0x4

    .line 167
    invoke-virtual {v1, v4}, Lh1/v;->k(I)I

    move-result v8

    .line 168
    invoke-virtual {v1, v4}, Lh1/v;->k(I)I

    move-result v4

    const/16 v23, 0x1

    add-int/lit8 v8, v8, 0x1

    .line 169
    invoke-virtual {v1, v8}, Lh1/v;->v(I)V

    add-int/lit8 v4, v4, 0x1

    .line 170
    invoke-virtual {v1, v4}, Lh1/v;->v(I)V

    .line 171
    invoke-virtual {v1}, Lh1/v;->j()Z

    move-result v4

    const/4 v8, 0x7

    if-eqz v4, :cond_41

    .line 172
    invoke-virtual {v1, v8}, Lh1/v;->v(I)V

    .line 173
    :cond_41
    invoke-virtual {v1, v8}, Lh1/v;->v(I)V

    .line 174
    invoke-virtual {v1}, Lh1/v;->j()Z

    move-result v4

    if-eqz v4, :cond_42

    const/4 v8, 0x2

    .line 175
    invoke-virtual {v1, v8}, Lh1/v;->v(I)V

    .line 176
    :cond_42
    invoke-virtual {v1}, Lh1/v;->j()Z

    move-result v8

    if-eqz v8, :cond_43

    const/4 v8, 0x2

    const/4 v9, 0x1

    goto :goto_2c

    :cond_43
    const/4 v9, 0x1

    .line 177
    invoke-virtual {v1, v9}, Lh1/v;->k(I)I

    move-result v8

    :goto_2c
    if-lez v8, :cond_44

    .line 178
    invoke-virtual {v1}, Lh1/v;->j()Z

    move-result v8

    if-nez v8, :cond_44

    .line 179
    invoke-virtual {v1, v9}, Lh1/v;->v(I)V

    :cond_44
    const/4 v9, 0x3

    if-eqz v4, :cond_45

    .line 180
    invoke-virtual {v1, v9}, Lh1/v;->v(I)V

    .line 181
    :cond_45
    invoke-virtual {v1, v9}, Lh1/v;->v(I)V

    .line 182
    invoke-virtual {v1}, Lh1/v;->j()Z

    move-result v4

    const/4 v8, 0x2

    if-ne v11, v8, :cond_46

    if-eqz v4, :cond_46

    .line 183
    invoke-virtual {v1}, Lh1/v;->u()V

    :cond_46
    const/4 v9, 0x1

    if-eq v11, v9, :cond_47

    .line 184
    invoke-virtual {v1}, Lh1/v;->j()Z

    move-result v4

    if-eqz v4, :cond_47

    const/4 v4, 0x1

    goto :goto_2d

    :cond_47
    const/4 v4, 0x0

    .line 185
    :goto_2d
    invoke-virtual {v1}, Lh1/v;->j()Z

    move-result v8

    const/16 v11, 0x8

    if-eqz v8, :cond_4b

    .line 186
    invoke-virtual {v1, v11}, Lh1/v;->k(I)I

    move-result v8

    .line 187
    invoke-virtual {v1, v11}, Lh1/v;->k(I)I

    move-result v9

    .line 188
    invoke-virtual {v1, v11}, Lh1/v;->k(I)I

    move-result v12

    if-nez v4, :cond_48

    const/4 v4, 0x1

    if-ne v8, v4, :cond_49

    if-ne v9, v7, :cond_49

    if-nez v12, :cond_49

    move v1, v4

    goto :goto_2e

    :cond_48
    const/4 v4, 0x1

    .line 189
    :cond_49
    invoke-virtual {v1, v4}, Lh1/v;->k(I)I

    move-result v23

    move/from16 v1, v23

    .line 190
    :goto_2e
    invoke-static {v8}, Landroidx/media3/common/l;->f(I)I

    move-result v41

    if-ne v1, v4, :cond_4a

    const/16 v23, 0x1

    goto :goto_2f

    :cond_4a
    const/16 v23, 0x2

    .line 191
    :goto_2f
    invoke-static {v9}, Landroidx/media3/common/l;->g(I)I

    move-result v1

    move/from16 v43, v41

    move/from16 v47, v45

    move/from16 v45, v1

    move/from16 v41, v23

    goto :goto_30

    :cond_4b
    move/from16 v43, v41

    move/from16 v47, v45

    move/from16 v45, v43

    .line 192
    :goto_30
    new-instance v42, Landroidx/media3/common/l;

    move-object/from16 v48, v46

    move/from16 v46, v44

    move/from16 v44, v41

    .line 193
    invoke-direct/range {v42 .. v48}, Landroidx/media3/common/l;-><init>(IIIII[B)V

    move-object/from16 v1, v42

    .line 194
    :goto_31
    const-string v4, "video/av01"

    iget v7, v1, Landroidx/media3/common/l;->e:I

    iget v8, v1, Landroidx/media3/common/l;->f:I

    iget v9, v1, Landroidx/media3/common/l;->a:I

    iget v12, v1, Landroidx/media3/common/l;->b:I

    iget v1, v1, Landroidx/media3/common/l;->c:I

    move/from16 v29, v1

    move-object/from16 v33, v2

    move/from16 v18, v3

    move/from16 v30, v7

    move/from16 v25, v8

    move v7, v9

    move/from16 v31, v10

    move/from16 v26, v12

    const/4 v2, 0x0

    const/4 v12, -0x1

    move-object v8, v4

    goto/16 :goto_44

    :cond_4c
    const/16 v11, 0x8

    const v1, 0x636c6c69

    if-ne v9, v1, :cond_4e

    if-nez v20, :cond_4d

    const/16 v31, 0x19

    .line 195
    invoke-static/range {v31 .. v31}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v20

    :cond_4d
    move-object/from16 v1, v20

    const/16 v4, 0x15

    .line 196
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 197
    invoke-virtual {v0}, Lh1/w;->r()S

    move-result v4

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 198
    invoke-virtual {v0}, Lh1/w;->r()S

    move-result v4

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-object/from16 v20, v1

    move-object/from16 v33, v2

    move/from16 v18, v3

    goto/16 :goto_1f

    :cond_4e
    const v1, 0x6d646376

    if-ne v9, v1, :cond_50

    if-nez v20, :cond_4f

    const/16 v31, 0x19

    .line 199
    invoke-static/range {v31 .. v31}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v20

    :cond_4f
    move-object/from16 v1, v20

    .line 200
    invoke-virtual {v0}, Lh1/w;->r()S

    move-result v4

    .line 201
    invoke-virtual {v0}, Lh1/w;->r()S

    move-result v8

    .line 202
    invoke-virtual {v0}, Lh1/w;->r()S

    move-result v9

    .line 203
    invoke-virtual {v0}, Lh1/w;->r()S

    move-result v12

    .line 204
    invoke-virtual {v0}, Lh1/w;->r()S

    move-result v11

    move-object/from16 v18, v2

    .line 205
    invoke-virtual {v0}, Lh1/w;->r()S

    move-result v2

    move/from16 v31, v10

    .line 206
    invoke-virtual {v0}, Lh1/w;->r()S

    move-result v10

    move-object/from16 v33, v15

    .line 207
    invoke-virtual {v0}, Lh1/w;->r()S

    move-result v15

    .line 208
    invoke-virtual {v0}, Lh1/w;->w()J

    move-result-wide v35

    .line 209
    invoke-virtual {v0}, Lh1/w;->w()J

    move-result-wide v39

    move/from16 v37, v3

    const/4 v3, 0x1

    .line 210
    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 211
    invoke-virtual {v1, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 212
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 213
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 214
    invoke-virtual {v1, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 215
    invoke-virtual {v1, v9}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 216
    invoke-virtual {v1, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 217
    invoke-virtual {v1, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 218
    invoke-virtual {v1, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    const-wide/16 v2, 0x2710

    .line 219
    div-long v8, v35, v2

    long-to-int v4, v8

    int-to-short v4, v4

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 220
    div-long v2, v39, v2

    long-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-object/from16 v20, v1

    move-object/from16 v8, v30

    move-object/from16 v15, v33

    move/from16 v29, v34

    const/4 v2, 0x0

    :goto_32
    const/4 v12, -0x1

    :goto_33
    move-object/from16 v33, v18

    move/from16 v30, v24

    :goto_34
    move/from16 v18, v37

    goto/16 :goto_44

    :cond_50
    move-object/from16 v18, v2

    move/from16 v37, v3

    move/from16 v31, v10

    move-object/from16 v33, v15

    const v1, 0x64323633

    if-ne v9, v1, :cond_52

    if-nez v30, :cond_51

    const/4 v9, 0x1

    :goto_35
    const/4 v2, 0x0

    goto :goto_36

    :cond_51
    const/4 v9, 0x0

    goto :goto_35

    .line 221
    :goto_36
    invoke-static {v2, v9}, Ln1/b;->d(Ljava/lang/String;Z)V

    move/from16 v30, v24

    move-object/from16 v8, v28

    move-object/from16 v15, v33

    move/from16 v29, v34

    const/4 v12, -0x1

    :goto_37
    move-object/from16 v33, v18

    goto :goto_34

    :cond_52
    const/4 v2, 0x0

    const v1, 0x65736473

    if-ne v9, v1, :cond_55

    if-nez v30, :cond_53

    const/4 v9, 0x1

    goto :goto_38

    :cond_53
    const/4 v9, 0x0

    .line 222
    :goto_38
    invoke-static {v2, v9}, Ln1/b;->d(Ljava/lang/String;Z)V

    .line 223
    invoke-static {v0, v12}, Lh2/d;->a(Lh1/w;I)Lh2/b;

    move-result-object v1

    .line 224
    iget-object v3, v1, Lh2/b;->l:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    .line 225
    iget-object v4, v1, Lh2/b;->m:Ljava/lang/Object;

    check-cast v4, [B

    if-eqz v4, :cond_54

    .line 226
    invoke-static {v4}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    move-result-object v15

    goto :goto_39

    :cond_54
    move-object/from16 v15, v33

    :goto_39
    move-object/from16 v32, v1

    move-object v8, v3

    move-object/from16 v33, v18

    move/from16 v30, v24

    move/from16 v29, v34

    move/from16 v18, v37

    const/4 v12, -0x1

    goto/16 :goto_44

    :cond_55
    const v1, 0x70617370

    if-ne v9, v1, :cond_56

    add-int/lit8 v12, v12, 0x8

    .line 227
    invoke-virtual {v0, v12}, Lh1/w;->G(I)V

    .line 228
    invoke-virtual {v0}, Lh1/w;->y()I

    move-result v1

    .line 229
    invoke-virtual {v0}, Lh1/w;->y()I

    move-result v3

    int-to-float v1, v1

    int-to-float v3, v3

    div-float/2addr v1, v3

    move v14, v1

    move-object/from16 v8, v30

    move-object/from16 v15, v33

    move/from16 v29, v34

    const/4 v12, -0x1

    const/16 v21, 0x1

    goto :goto_33

    :cond_56
    const v1, 0x73763364

    if-ne v9, v1, :cond_59

    add-int/lit8 v1, v12, 0x8

    :goto_3a
    sub-int v3, v1, v12

    if-ge v3, v13, :cond_58

    .line 230
    invoke-virtual {v0, v1}, Lh1/w;->G(I)V

    .line 231
    invoke-virtual {v0}, Lh1/w;->g()I

    move-result v3

    .line 232
    invoke-virtual {v0}, Lh1/w;->g()I

    move-result v4

    const v8, 0x70726f6a

    if-ne v4, v8, :cond_57

    .line 233
    iget-object v4, v0, Lh1/w;->a:[B

    add-int/2addr v3, v1

    .line 234
    invoke-static {v4, v1, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    move-object/from16 v17, v1

    goto :goto_3b

    :cond_57
    add-int/2addr v1, v3

    goto :goto_3a

    :cond_58
    move-object/from16 v17, v2

    :goto_3b
    move-object/from16 v8, v30

    move-object/from16 v15, v33

    move/from16 v29, v34

    goto/16 :goto_32

    :cond_59
    const v1, 0x73743364

    if-ne v9, v1, :cond_5f

    .line 235
    invoke-virtual {v0}, Lh1/w;->u()I

    move-result v1

    const/4 v9, 0x3

    .line 236
    invoke-virtual {v0, v9}, Lh1/w;->H(I)V

    if-nez v1, :cond_5d

    .line 237
    invoke-virtual {v0}, Lh1/w;->u()I

    move-result v1

    if-eqz v1, :cond_5c

    const/4 v3, 0x1

    if-eq v1, v3, :cond_5b

    const/4 v8, 0x2

    if-eq v1, v8, :cond_5a

    if-eq v1, v9, :cond_5e

    goto :goto_3c

    :cond_5a
    const/4 v9, 0x2

    goto :goto_3d

    :cond_5b
    move v9, v3

    goto :goto_3d

    :cond_5c
    const/4 v9, 0x0

    goto :goto_3d

    :cond_5d
    :goto_3c
    move/from16 v9, v37

    :cond_5e
    :goto_3d
    move-object/from16 v8, v30

    move-object/from16 v15, v33

    move/from16 v29, v34

    const/4 v12, -0x1

    move-object/from16 v33, v18

    move/from16 v30, v24

    move/from16 v18, v9

    goto/16 :goto_44

    :cond_5f
    const/4 v3, 0x1

    const v1, 0x636f6c72

    if-ne v9, v1, :cond_64

    const/4 v12, -0x1

    move/from16 v11, v34

    if-ne v7, v12, :cond_65

    if-ne v11, v12, :cond_65

    .line 238
    invoke-virtual {v0}, Lh1/w;->g()I

    move-result v1

    const v4, 0x6e636c78

    if-eq v1, v4, :cond_61

    const v4, 0x6e636c63

    if-ne v1, v4, :cond_60

    goto :goto_3e

    .line 239
    :cond_60
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unsupported color type: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Li1/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v1}, Lh1/a;->F(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_41

    .line 240
    :cond_61
    :goto_3e
    invoke-virtual {v0}, Lh1/w;->A()I

    move-result v1

    .line 241
    invoke-virtual {v0}, Lh1/w;->A()I

    move-result v4

    const/4 v8, 0x2

    .line 242
    invoke-virtual {v0, v8}, Lh1/w;->H(I)V

    const/16 v7, 0x13

    if-ne v13, v7, :cond_62

    .line 243
    invoke-virtual {v0}, Lh1/w;->u()I

    move-result v7

    and-int/lit16 v7, v7, 0x80

    if-eqz v7, :cond_62

    move v7, v3

    goto :goto_3f

    :cond_62
    const/4 v7, 0x0

    .line 244
    :goto_3f
    invoke-static {v1}, Landroidx/media3/common/l;->f(I)I

    move-result v1

    if-eqz v7, :cond_63

    move v8, v3

    .line 245
    :cond_63
    invoke-static {v4}, Landroidx/media3/common/l;->g(I)I

    move-result v29

    move v7, v1

    move/from16 v26, v8

    :goto_40
    move-object/from16 v8, v30

    move-object/from16 v15, v33

    goto/16 :goto_33

    :cond_64
    move/from16 v11, v34

    const/4 v12, -0x1

    :cond_65
    :goto_41
    move/from16 v29, v11

    goto :goto_40

    .line 246
    :goto_42
    invoke-static {v0}, Lm7/s;->a(Lh1/w;)Lm7/s;

    move-result-object v1

    if-eqz v1, :cond_66

    .line 247
    iget-object v1, v1, Lm7/s;->k:Ljava/lang/String;

    .line 248
    const-string v8, "video/dolby-vision"

    move-object/from16 v16, v1

    goto :goto_43

    :cond_66
    move-object/from16 v8, v30

    :goto_43
    move/from16 v29, v11

    move/from16 v30, v24

    move-object/from16 v15, v33

    goto/16 :goto_37

    :goto_44
    add-int v1, v27, v13

    move/from16 v2, p3

    move-object/from16 v4, p7

    move/from16 v27, v7

    move-object/from16 v11, v28

    move/from16 v10, v31

    move-object/from16 v3, v38

    move v7, v1

    move/from16 v31, v25

    move/from16 v28, v26

    move/from16 v1, p2

    goto/16 :goto_2

    :goto_45
    if-nez v30, :cond_67

    return-void

    .line 249
    :cond_67
    new-instance v0, Landroidx/media3/common/v;

    invoke-direct {v0}, Landroidx/media3/common/v;-><init>()V

    .line 250
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Landroidx/media3/common/v;->a:Ljava/lang/String;

    .line 251
    invoke-static/range {v30 .. v30}, Landroidx/media3/common/u0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Landroidx/media3/common/v;->m:Ljava/lang/String;

    move-object/from16 v9, v16

    .line 252
    iput-object v9, v0, Landroidx/media3/common/v;->j:Ljava/lang/String;

    .line 253
    iput v5, v0, Landroidx/media3/common/v;->t:I

    .line 254
    iput v6, v0, Landroidx/media3/common/v;->u:I

    .line 255
    iput v14, v0, Landroidx/media3/common/v;->x:F

    move/from16 v1, p5

    .line 256
    iput v1, v0, Landroidx/media3/common/v;->w:I

    move-object/from16 v9, v17

    .line 257
    iput-object v9, v0, Landroidx/media3/common/v;->y:[B

    move/from16 v3, v37

    .line 258
    iput v3, v0, Landroidx/media3/common/v;->z:I

    move-object/from16 v9, v33

    .line 259
    iput-object v9, v0, Landroidx/media3/common/v;->p:Ljava/util/List;

    move/from16 v12, v19

    .line 260
    iput v12, v0, Landroidx/media3/common/v;->o:I

    move-object/from16 v3, v38

    .line 261
    iput-object v3, v0, Landroidx/media3/common/v;->q:Landroidx/media3/common/s;

    if-eqz v20, :cond_68

    .line 262
    invoke-virtual/range {v20 .. v20}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v9

    goto :goto_46

    :cond_68
    move-object v9, v2

    .line 263
    :goto_46
    new-instance v20, Landroidx/media3/common/l;

    move/from16 v21, v7

    move/from16 v23, v11

    move/from16 v22, v26

    move-object/from16 v26, v9

    .line 264
    invoke-direct/range {v20 .. v26}, Landroidx/media3/common/l;-><init>(IIIII[B)V

    move-object/from16 v1, v20

    .line 265
    iput-object v1, v0, Landroidx/media3/common/v;->A:Landroidx/media3/common/l;

    move-object/from16 v9, v32

    if-eqz v9, :cond_69

    .line 266
    iget-wide v1, v9, Lh2/b;->j:J

    .line 267
    invoke-static {v1, v2}, Lcom/bumptech/glide/d;->g0(J)I

    move-result v1

    .line 268
    iput v1, v0, Landroidx/media3/common/v;->h:I

    .line 269
    iget-wide v1, v9, Lh2/b;->k:J

    .line 270
    invoke-static {v1, v2}, Lcom/bumptech/glide/d;->g0(J)I

    move-result v1

    .line 271
    iput v1, v0, Landroidx/media3/common/v;->i:I

    .line 272
    :cond_69
    new-instance v1, Landroidx/media3/common/w;

    invoke-direct {v1, v0}, Landroidx/media3/common/w;-><init>(Landroidx/media3/common/v;)V

    move-object/from16 v4, p7

    .line 273
    iput-object v1, v4, Lb6/s;->d:Ljava/lang/Object;

    return-void
.end method
