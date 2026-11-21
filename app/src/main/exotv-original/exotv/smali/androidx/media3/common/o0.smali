.class public final Landroidx/media3/common/o0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final g:Landroidx/media3/common/o0;

.field public static final h:Ljava/lang/String;

.field public static final i:Ljava/lang/String;

.field public static final j:Ljava/lang/String;

.field public static final k:Ljava/lang/String;

.field public static final l:Ljava/lang/String;

.field public static final m:Ljava/lang/String;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Landroidx/media3/common/j0;

.field public final c:Landroidx/media3/common/i0;

.field public final d:Landroidx/media3/common/r0;

.field public final e:Landroidx/media3/common/e0;

.field public final f:Landroidx/media3/common/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Landroidx/media3/common/c0;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media3/common/c0;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lf6/m0;->k:Lf6/k0;

    .line 7
    .line 8
    sget-object v1, Lf6/l1;->n:Lf6/l1;

    .line 9
    .line 10
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 11
    .line 12
    sget-object v1, Lf6/l1;->n:Lf6/l1;

    .line 13
    .line 14
    new-instance v1, Landroidx/media3/common/h0;

    .line 15
    .line 16
    invoke-direct {v1}, Landroidx/media3/common/h0;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v8, Landroidx/media3/common/k0;->d:Landroidx/media3/common/k0;

    .line 20
    .line 21
    new-instance v2, Landroidx/media3/common/o0;

    .line 22
    .line 23
    new-instance v4, Landroidx/media3/common/e0;

    .line 24
    .line 25
    invoke-direct {v4, v0}, Landroidx/media3/common/d0;-><init>(Landroidx/media3/common/c0;)V

    .line 26
    .line 27
    .line 28
    new-instance v6, Landroidx/media3/common/i0;

    .line 29
    .line 30
    invoke-direct {v6, v1}, Landroidx/media3/common/i0;-><init>(Landroidx/media3/common/h0;)V

    .line 31
    .line 32
    .line 33
    sget-object v7, Landroidx/media3/common/r0;->K:Landroidx/media3/common/r0;

    .line 34
    .line 35
    const-string v3, ""

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-direct/range {v2 .. v8}, Landroidx/media3/common/o0;-><init>(Ljava/lang/String;Landroidx/media3/common/e0;Landroidx/media3/common/j0;Landroidx/media3/common/i0;Landroidx/media3/common/r0;Landroidx/media3/common/k0;)V

    .line 39
    .line 40
    .line 41
    sput-object v2, Landroidx/media3/common/o0;->g:Landroidx/media3/common/o0;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    const/16 v1, 0x24

    .line 45
    .line 46
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sput-object v0, Landroidx/media3/common/o0;->h:Ljava/lang/String;

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, Landroidx/media3/common/o0;->i:Ljava/lang/String;

    .line 58
    .line 59
    const/4 v0, 0x2

    .line 60
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sput-object v0, Landroidx/media3/common/o0;->j:Ljava/lang/String;

    .line 65
    .line 66
    const/4 v0, 0x3

    .line 67
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Landroidx/media3/common/o0;->k:Ljava/lang/String;

    .line 72
    .line 73
    const/4 v0, 0x4

    .line 74
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sput-object v0, Landroidx/media3/common/o0;->l:Ljava/lang/String;

    .line 79
    .line 80
    const/4 v0, 0x5

    .line 81
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sput-object v0, Landroidx/media3/common/o0;->m:Ljava/lang/String;

    .line 86
    .line 87
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroidx/media3/common/e0;Landroidx/media3/common/j0;Landroidx/media3/common/i0;Landroidx/media3/common/r0;Landroidx/media3/common/k0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/common/o0;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 7
    .line 8
    iput-object p4, p0, Landroidx/media3/common/o0;->c:Landroidx/media3/common/i0;

    .line 9
    .line 10
    iput-object p5, p0, Landroidx/media3/common/o0;->d:Landroidx/media3/common/r0;

    .line 11
    .line 12
    iput-object p2, p0, Landroidx/media3/common/o0;->e:Landroidx/media3/common/e0;

    .line 13
    .line 14
    iput-object p6, p0, Landroidx/media3/common/o0;->f:Landroidx/media3/common/k0;

    .line 15
    .line 16
    return-void
.end method

.method public static b(Landroid/os/Bundle;)Landroidx/media3/common/o0;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Landroidx/media3/common/o0;->h:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v1, Landroidx/media3/common/o0;->i:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    sget-object v1, Landroidx/media3/common/i0;->f:Landroidx/media3/common/i0;

    .line 23
    .line 24
    :goto_0
    move-object v7, v1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-static {v1}, Landroidx/media3/common/i0;->b(Landroid/os/Bundle;)Landroidx/media3/common/i0;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    goto :goto_0

    .line 31
    :goto_1
    sget-object v1, Landroidx/media3/common/o0;->j:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-wide/16 v2, 0x0

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v8, 0x0

    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    sget-object v1, Landroidx/media3/common/r0;->K:Landroidx/media3/common/r0;

    .line 44
    .line 45
    goto/16 :goto_5

    .line 46
    .line 47
    :cond_1
    new-instance v9, Landroidx/media3/common/q0;

    .line 48
    .line 49
    invoke-direct {v9}, Landroidx/media3/common/q0;-><init>()V

    .line 50
    .line 51
    .line 52
    sget-object v10, Landroidx/media3/common/r0;->L:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v1, v10}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    iput-object v10, v9, Landroidx/media3/common/q0;->a:Ljava/lang/CharSequence;

    .line 59
    .line 60
    sget-object v10, Landroidx/media3/common/r0;->M:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v1, v10}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 63
    .line 64
    .line 65
    move-result-object v10

    .line 66
    iput-object v10, v9, Landroidx/media3/common/q0;->b:Ljava/lang/CharSequence;

    .line 67
    .line 68
    sget-object v10, Landroidx/media3/common/r0;->N:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v1, v10}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    iput-object v10, v9, Landroidx/media3/common/q0;->c:Ljava/lang/CharSequence;

    .line 75
    .line 76
    sget-object v10, Landroidx/media3/common/r0;->O:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v1, v10}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    iput-object v10, v9, Landroidx/media3/common/q0;->d:Ljava/lang/CharSequence;

    .line 83
    .line 84
    sget-object v10, Landroidx/media3/common/r0;->P:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v1, v10}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 87
    .line 88
    .line 89
    move-result-object v10

    .line 90
    iput-object v10, v9, Landroidx/media3/common/q0;->e:Ljava/lang/CharSequence;

    .line 91
    .line 92
    sget-object v10, Landroidx/media3/common/r0;->Q:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v1, v10}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    iput-object v10, v9, Landroidx/media3/common/q0;->f:Ljava/lang/CharSequence;

    .line 99
    .line 100
    sget-object v10, Landroidx/media3/common/r0;->R:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v1, v10}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    iput-object v10, v9, Landroidx/media3/common/q0;->g:Ljava/lang/CharSequence;

    .line 107
    .line 108
    sget-object v10, Landroidx/media3/common/r0;->U:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v1, v10}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    sget-object v11, Landroidx/media3/common/r0;->n0:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {v1, v11}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 117
    .line 118
    .line 119
    move-result v12

    .line 120
    if-eqz v12, :cond_2

    .line 121
    .line 122
    invoke-virtual {v1, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    move-result v11

    .line 126
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v11

    .line 130
    goto :goto_2

    .line 131
    :cond_2
    move-object v11, v8

    .line 132
    :goto_2
    if-nez v10, :cond_3

    .line 133
    .line 134
    move-object v10, v8

    .line 135
    goto :goto_3

    .line 136
    :cond_3
    invoke-virtual {v10}, [B->clone()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v10

    .line 140
    check-cast v10, [B

    .line 141
    .line 142
    :goto_3
    iput-object v10, v9, Landroidx/media3/common/q0;->k:[B

    .line 143
    .line 144
    iput-object v11, v9, Landroidx/media3/common/q0;->l:Ljava/lang/Integer;

    .line 145
    .line 146
    sget-object v10, Landroidx/media3/common/r0;->V:Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {v1, v10}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    check-cast v10, Landroid/net/Uri;

    .line 153
    .line 154
    iput-object v10, v9, Landroidx/media3/common/q0;->m:Landroid/net/Uri;

    .line 155
    .line 156
    sget-object v10, Landroidx/media3/common/r0;->g0:Ljava/lang/String;

    .line 157
    .line 158
    invoke-virtual {v1, v10}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    iput-object v10, v9, Landroidx/media3/common/q0;->y:Ljava/lang/CharSequence;

    .line 163
    .line 164
    sget-object v10, Landroidx/media3/common/r0;->h0:Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v1, v10}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    iput-object v10, v9, Landroidx/media3/common/q0;->z:Ljava/lang/CharSequence;

    .line 171
    .line 172
    sget-object v10, Landroidx/media3/common/r0;->i0:Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {v1, v10}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 175
    .line 176
    .line 177
    move-result-object v10

    .line 178
    iput-object v10, v9, Landroidx/media3/common/q0;->A:Ljava/lang/CharSequence;

    .line 179
    .line 180
    sget-object v10, Landroidx/media3/common/r0;->l0:Ljava/lang/String;

    .line 181
    .line 182
    invoke-virtual {v1, v10}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 183
    .line 184
    .line 185
    move-result-object v10

    .line 186
    iput-object v10, v9, Landroidx/media3/common/q0;->D:Ljava/lang/CharSequence;

    .line 187
    .line 188
    sget-object v10, Landroidx/media3/common/r0;->m0:Ljava/lang/String;

    .line 189
    .line 190
    invoke-virtual {v1, v10}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 191
    .line 192
    .line 193
    move-result-object v10

    .line 194
    iput-object v10, v9, Landroidx/media3/common/q0;->E:Ljava/lang/CharSequence;

    .line 195
    .line 196
    sget-object v10, Landroidx/media3/common/r0;->o0:Ljava/lang/String;

    .line 197
    .line 198
    invoke-virtual {v1, v10}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 199
    .line 200
    .line 201
    move-result-object v10

    .line 202
    iput-object v10, v9, Landroidx/media3/common/q0;->F:Ljava/lang/CharSequence;

    .line 203
    .line 204
    sget-object v10, Landroidx/media3/common/r0;->t0:Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {v1, v10}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 207
    .line 208
    .line 209
    move-result-object v10

    .line 210
    iput-object v10, v9, Landroidx/media3/common/q0;->H:Landroid/os/Bundle;

    .line 211
    .line 212
    sget-object v10, Landroidx/media3/common/r0;->S:Ljava/lang/String;

    .line 213
    .line 214
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 215
    .line 216
    .line 217
    move-result v11

    .line 218
    if-eqz v11, :cond_4

    .line 219
    .line 220
    invoke-virtual {v1, v10}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 221
    .line 222
    .line 223
    move-result-object v10

    .line 224
    if-eqz v10, :cond_4

    .line 225
    .line 226
    invoke-static {v10}, Landroidx/media3/common/h1;->a(Landroid/os/Bundle;)Landroidx/media3/common/h1;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    iput-object v10, v9, Landroidx/media3/common/q0;->i:Landroidx/media3/common/h1;

    .line 231
    .line 232
    :cond_4
    sget-object v10, Landroidx/media3/common/r0;->T:Ljava/lang/String;

    .line 233
    .line 234
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 235
    .line 236
    .line 237
    move-result v11

    .line 238
    if-eqz v11, :cond_5

    .line 239
    .line 240
    invoke-virtual {v1, v10}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 241
    .line 242
    .line 243
    move-result-object v10

    .line 244
    if-eqz v10, :cond_5

    .line 245
    .line 246
    invoke-static {v10}, Landroidx/media3/common/h1;->a(Landroid/os/Bundle;)Landroidx/media3/common/h1;

    .line 247
    .line 248
    .line 249
    move-result-object v10

    .line 250
    iput-object v10, v9, Landroidx/media3/common/q0;->j:Landroidx/media3/common/h1;

    .line 251
    .line 252
    :cond_5
    sget-object v10, Landroidx/media3/common/r0;->r0:Ljava/lang/String;

    .line 253
    .line 254
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 255
    .line 256
    .line 257
    move-result v11

    .line 258
    if-eqz v11, :cond_7

    .line 259
    .line 260
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 261
    .line 262
    .line 263
    move-result-wide v10

    .line 264
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 265
    .line 266
    .line 267
    move-result-object v12

    .line 268
    cmp-long v10, v10, v2

    .line 269
    .line 270
    if-ltz v10, :cond_6

    .line 271
    .line 272
    const/4 v10, 0x1

    .line 273
    goto :goto_4

    .line 274
    :cond_6
    move v10, v5

    .line 275
    :goto_4
    invoke-static {v10}, Lh1/a;->d(Z)V

    .line 276
    .line 277
    .line 278
    iput-object v12, v9, Landroidx/media3/common/q0;->h:Ljava/lang/Long;

    .line 279
    .line 280
    :cond_7
    sget-object v10, Landroidx/media3/common/r0;->W:Ljava/lang/String;

    .line 281
    .line 282
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 283
    .line 284
    .line 285
    move-result v11

    .line 286
    if-eqz v11, :cond_8

    .line 287
    .line 288
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 289
    .line 290
    .line 291
    move-result v10

    .line 292
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 293
    .line 294
    .line 295
    move-result-object v10

    .line 296
    iput-object v10, v9, Landroidx/media3/common/q0;->n:Ljava/lang/Integer;

    .line 297
    .line 298
    :cond_8
    sget-object v10, Landroidx/media3/common/r0;->X:Ljava/lang/String;

    .line 299
    .line 300
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 301
    .line 302
    .line 303
    move-result v11

    .line 304
    if-eqz v11, :cond_9

    .line 305
    .line 306
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 307
    .line 308
    .line 309
    move-result v10

    .line 310
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 311
    .line 312
    .line 313
    move-result-object v10

    .line 314
    iput-object v10, v9, Landroidx/media3/common/q0;->o:Ljava/lang/Integer;

    .line 315
    .line 316
    :cond_9
    sget-object v10, Landroidx/media3/common/r0;->Y:Ljava/lang/String;

    .line 317
    .line 318
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 319
    .line 320
    .line 321
    move-result v11

    .line 322
    if-eqz v11, :cond_a

    .line 323
    .line 324
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 325
    .line 326
    .line 327
    move-result v10

    .line 328
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 329
    .line 330
    .line 331
    move-result-object v10

    .line 332
    iput-object v10, v9, Landroidx/media3/common/q0;->p:Ljava/lang/Integer;

    .line 333
    .line 334
    :cond_a
    sget-object v10, Landroidx/media3/common/r0;->q0:Ljava/lang/String;

    .line 335
    .line 336
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 337
    .line 338
    .line 339
    move-result v11

    .line 340
    if-eqz v11, :cond_b

    .line 341
    .line 342
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 343
    .line 344
    .line 345
    move-result v10

    .line 346
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 347
    .line 348
    .line 349
    move-result-object v10

    .line 350
    iput-object v10, v9, Landroidx/media3/common/q0;->q:Ljava/lang/Boolean;

    .line 351
    .line 352
    :cond_b
    sget-object v10, Landroidx/media3/common/r0;->Z:Ljava/lang/String;

    .line 353
    .line 354
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 355
    .line 356
    .line 357
    move-result v11

    .line 358
    if-eqz v11, :cond_c

    .line 359
    .line 360
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 361
    .line 362
    .line 363
    move-result v10

    .line 364
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 365
    .line 366
    .line 367
    move-result-object v10

    .line 368
    iput-object v10, v9, Landroidx/media3/common/q0;->r:Ljava/lang/Boolean;

    .line 369
    .line 370
    :cond_c
    sget-object v10, Landroidx/media3/common/r0;->a0:Ljava/lang/String;

    .line 371
    .line 372
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 373
    .line 374
    .line 375
    move-result v11

    .line 376
    if-eqz v11, :cond_d

    .line 377
    .line 378
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 379
    .line 380
    .line 381
    move-result v10

    .line 382
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 383
    .line 384
    .line 385
    move-result-object v10

    .line 386
    iput-object v10, v9, Landroidx/media3/common/q0;->s:Ljava/lang/Integer;

    .line 387
    .line 388
    :cond_d
    sget-object v10, Landroidx/media3/common/r0;->b0:Ljava/lang/String;

    .line 389
    .line 390
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 391
    .line 392
    .line 393
    move-result v11

    .line 394
    if-eqz v11, :cond_e

    .line 395
    .line 396
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 397
    .line 398
    .line 399
    move-result v10

    .line 400
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 401
    .line 402
    .line 403
    move-result-object v10

    .line 404
    iput-object v10, v9, Landroidx/media3/common/q0;->t:Ljava/lang/Integer;

    .line 405
    .line 406
    :cond_e
    sget-object v10, Landroidx/media3/common/r0;->c0:Ljava/lang/String;

    .line 407
    .line 408
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 409
    .line 410
    .line 411
    move-result v11

    .line 412
    if-eqz v11, :cond_f

    .line 413
    .line 414
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 415
    .line 416
    .line 417
    move-result v10

    .line 418
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 419
    .line 420
    .line 421
    move-result-object v10

    .line 422
    iput-object v10, v9, Landroidx/media3/common/q0;->u:Ljava/lang/Integer;

    .line 423
    .line 424
    :cond_f
    sget-object v10, Landroidx/media3/common/r0;->d0:Ljava/lang/String;

    .line 425
    .line 426
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 427
    .line 428
    .line 429
    move-result v11

    .line 430
    if-eqz v11, :cond_10

    .line 431
    .line 432
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 433
    .line 434
    .line 435
    move-result v10

    .line 436
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 437
    .line 438
    .line 439
    move-result-object v10

    .line 440
    iput-object v10, v9, Landroidx/media3/common/q0;->v:Ljava/lang/Integer;

    .line 441
    .line 442
    :cond_10
    sget-object v10, Landroidx/media3/common/r0;->e0:Ljava/lang/String;

    .line 443
    .line 444
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 445
    .line 446
    .line 447
    move-result v11

    .line 448
    if-eqz v11, :cond_11

    .line 449
    .line 450
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 451
    .line 452
    .line 453
    move-result v10

    .line 454
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 455
    .line 456
    .line 457
    move-result-object v10

    .line 458
    iput-object v10, v9, Landroidx/media3/common/q0;->w:Ljava/lang/Integer;

    .line 459
    .line 460
    :cond_11
    sget-object v10, Landroidx/media3/common/r0;->f0:Ljava/lang/String;

    .line 461
    .line 462
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 463
    .line 464
    .line 465
    move-result v11

    .line 466
    if-eqz v11, :cond_12

    .line 467
    .line 468
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 469
    .line 470
    .line 471
    move-result v10

    .line 472
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 473
    .line 474
    .line 475
    move-result-object v10

    .line 476
    iput-object v10, v9, Landroidx/media3/common/q0;->x:Ljava/lang/Integer;

    .line 477
    .line 478
    :cond_12
    sget-object v10, Landroidx/media3/common/r0;->j0:Ljava/lang/String;

    .line 479
    .line 480
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 481
    .line 482
    .line 483
    move-result v11

    .line 484
    if-eqz v11, :cond_13

    .line 485
    .line 486
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 487
    .line 488
    .line 489
    move-result v10

    .line 490
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 491
    .line 492
    .line 493
    move-result-object v10

    .line 494
    iput-object v10, v9, Landroidx/media3/common/q0;->B:Ljava/lang/Integer;

    .line 495
    .line 496
    :cond_13
    sget-object v10, Landroidx/media3/common/r0;->k0:Ljava/lang/String;

    .line 497
    .line 498
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 499
    .line 500
    .line 501
    move-result v11

    .line 502
    if-eqz v11, :cond_14

    .line 503
    .line 504
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 505
    .line 506
    .line 507
    move-result v10

    .line 508
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 509
    .line 510
    .line 511
    move-result-object v10

    .line 512
    iput-object v10, v9, Landroidx/media3/common/q0;->C:Ljava/lang/Integer;

    .line 513
    .line 514
    :cond_14
    sget-object v10, Landroidx/media3/common/r0;->p0:Ljava/lang/String;

    .line 515
    .line 516
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 517
    .line 518
    .line 519
    move-result v11

    .line 520
    if-eqz v11, :cond_15

    .line 521
    .line 522
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 523
    .line 524
    .line 525
    move-result v10

    .line 526
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 527
    .line 528
    .line 529
    move-result-object v10

    .line 530
    iput-object v10, v9, Landroidx/media3/common/q0;->G:Ljava/lang/Integer;

    .line 531
    .line 532
    :cond_15
    sget-object v10, Landroidx/media3/common/r0;->s0:Ljava/lang/String;

    .line 533
    .line 534
    invoke-virtual {v1, v10}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 535
    .line 536
    .line 537
    move-result-object v1

    .line 538
    if-eqz v1, :cond_16

    .line 539
    .line 540
    invoke-static {v1}, Lf6/m0;->j(Ljava/util/Collection;)Lf6/m0;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    iput-object v1, v9, Landroidx/media3/common/q0;->I:Lf6/m0;

    .line 545
    .line 546
    :cond_16
    new-instance v1, Landroidx/media3/common/r0;

    .line 547
    .line 548
    invoke-direct {v1, v9}, Landroidx/media3/common/r0;-><init>(Landroidx/media3/common/q0;)V

    .line 549
    .line 550
    .line 551
    :goto_5
    sget-object v9, Landroidx/media3/common/o0;->k:Ljava/lang/String;

    .line 552
    .line 553
    invoke-virtual {v0, v9}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 554
    .line 555
    .line 556
    move-result-object v9

    .line 557
    if-nez v9, :cond_17

    .line 558
    .line 559
    sget-object v2, Landroidx/media3/common/e0;->p:Landroidx/media3/common/e0;

    .line 560
    .line 561
    move-object/from16 v17, v7

    .line 562
    .line 563
    goto/16 :goto_c

    .line 564
    .line 565
    :cond_17
    new-instance v10, Landroidx/media3/common/c0;

    .line 566
    .line 567
    invoke-direct {v10}, Landroidx/media3/common/c0;-><init>()V

    .line 568
    .line 569
    .line 570
    sget-object v11, Landroidx/media3/common/d0;->i:Ljava/lang/String;

    .line 571
    .line 572
    sget-object v12, Landroidx/media3/common/d0;->h:Landroidx/media3/common/d0;

    .line 573
    .line 574
    iget-wide v13, v12, Landroidx/media3/common/d0;->a:J

    .line 575
    .line 576
    move-wide v15, v2

    .line 577
    iget-wide v2, v12, Landroidx/media3/common/d0;->d:J

    .line 578
    .line 579
    move-object/from16 v17, v7

    .line 580
    .line 581
    iget-wide v6, v12, Landroidx/media3/common/d0;->b:J

    .line 582
    .line 583
    invoke-virtual {v9, v11, v13, v14}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 584
    .line 585
    .line 586
    move-result-wide v13

    .line 587
    invoke-static {v13, v14}, Lh1/i0;->S(J)J

    .line 588
    .line 589
    .line 590
    move-result-wide v13

    .line 591
    cmp-long v11, v13, v15

    .line 592
    .line 593
    if-ltz v11, :cond_18

    .line 594
    .line 595
    const/4 v11, 0x1

    .line 596
    goto :goto_6

    .line 597
    :cond_18
    move v11, v5

    .line 598
    :goto_6
    invoke-static {v11}, Lh1/a;->d(Z)V

    .line 599
    .line 600
    .line 601
    iput-wide v13, v10, Landroidx/media3/common/c0;->a:J

    .line 602
    .line 603
    sget-object v11, Landroidx/media3/common/d0;->j:Ljava/lang/String;

    .line 604
    .line 605
    iget-wide v13, v12, Landroidx/media3/common/d0;->c:J

    .line 606
    .line 607
    invoke-virtual {v9, v11, v13, v14}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 608
    .line 609
    .line 610
    move-result-wide v13

    .line 611
    invoke-static {v13, v14}, Lh1/i0;->S(J)J

    .line 612
    .line 613
    .line 614
    move-result-wide v13

    .line 615
    const-wide/high16 v19, -0x8000000000000000L

    .line 616
    .line 617
    cmp-long v11, v13, v19

    .line 618
    .line 619
    if-eqz v11, :cond_1a

    .line 620
    .line 621
    cmp-long v11, v13, v15

    .line 622
    .line 623
    if-ltz v11, :cond_19

    .line 624
    .line 625
    goto :goto_7

    .line 626
    :cond_19
    move v11, v5

    .line 627
    goto :goto_8

    .line 628
    :cond_1a
    :goto_7
    const/4 v11, 0x1

    .line 629
    :goto_8
    invoke-static {v11}, Lh1/a;->d(Z)V

    .line 630
    .line 631
    .line 632
    iput-wide v13, v10, Landroidx/media3/common/c0;->b:J

    .line 633
    .line 634
    sget-object v11, Landroidx/media3/common/d0;->k:Ljava/lang/String;

    .line 635
    .line 636
    iget-boolean v13, v12, Landroidx/media3/common/d0;->e:Z

    .line 637
    .line 638
    invoke-virtual {v9, v11, v13}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 639
    .line 640
    .line 641
    move-result v11

    .line 642
    iput-boolean v11, v10, Landroidx/media3/common/c0;->c:Z

    .line 643
    .line 644
    sget-object v11, Landroidx/media3/common/d0;->l:Ljava/lang/String;

    .line 645
    .line 646
    iget-boolean v13, v12, Landroidx/media3/common/d0;->f:Z

    .line 647
    .line 648
    invoke-virtual {v9, v11, v13}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 649
    .line 650
    .line 651
    move-result v11

    .line 652
    iput-boolean v11, v10, Landroidx/media3/common/c0;->d:Z

    .line 653
    .line 654
    sget-object v11, Landroidx/media3/common/d0;->m:Ljava/lang/String;

    .line 655
    .line 656
    iget-boolean v12, v12, Landroidx/media3/common/d0;->g:Z

    .line 657
    .line 658
    invoke-virtual {v9, v11, v12}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 659
    .line 660
    .line 661
    move-result v11

    .line 662
    iput-boolean v11, v10, Landroidx/media3/common/c0;->e:Z

    .line 663
    .line 664
    sget-object v11, Landroidx/media3/common/d0;->n:Ljava/lang/String;

    .line 665
    .line 666
    invoke-virtual {v9, v11, v6, v7}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 667
    .line 668
    .line 669
    move-result-wide v11

    .line 670
    cmp-long v6, v11, v6

    .line 671
    .line 672
    if-eqz v6, :cond_1c

    .line 673
    .line 674
    cmp-long v6, v11, v15

    .line 675
    .line 676
    if-ltz v6, :cond_1b

    .line 677
    .line 678
    const/4 v6, 0x1

    .line 679
    goto :goto_9

    .line 680
    :cond_1b
    move v6, v5

    .line 681
    :goto_9
    invoke-static {v6}, Lh1/a;->d(Z)V

    .line 682
    .line 683
    .line 684
    iput-wide v11, v10, Landroidx/media3/common/c0;->a:J

    .line 685
    .line 686
    :cond_1c
    sget-object v6, Landroidx/media3/common/d0;->o:Ljava/lang/String;

    .line 687
    .line 688
    invoke-virtual {v9, v6, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 689
    .line 690
    .line 691
    move-result-wide v6

    .line 692
    cmp-long v2, v6, v2

    .line 693
    .line 694
    if-eqz v2, :cond_1f

    .line 695
    .line 696
    cmp-long v2, v6, v19

    .line 697
    .line 698
    if-eqz v2, :cond_1e

    .line 699
    .line 700
    cmp-long v2, v6, v15

    .line 701
    .line 702
    if-ltz v2, :cond_1d

    .line 703
    .line 704
    goto :goto_a

    .line 705
    :cond_1d
    move/from16 v18, v5

    .line 706
    .line 707
    goto :goto_b

    .line 708
    :cond_1e
    :goto_a
    const/16 v18, 0x1

    .line 709
    .line 710
    :goto_b
    invoke-static/range {v18 .. v18}, Lh1/a;->d(Z)V

    .line 711
    .line 712
    .line 713
    iput-wide v6, v10, Landroidx/media3/common/c0;->b:J

    .line 714
    .line 715
    :cond_1f
    new-instance v2, Landroidx/media3/common/e0;

    .line 716
    .line 717
    invoke-direct {v2, v10}, Landroidx/media3/common/d0;-><init>(Landroidx/media3/common/c0;)V

    .line 718
    .line 719
    .line 720
    :goto_c
    sget-object v3, Landroidx/media3/common/o0;->l:Ljava/lang/String;

    .line 721
    .line 722
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 723
    .line 724
    .line 725
    move-result-object v3

    .line 726
    if-nez v3, :cond_20

    .line 727
    .line 728
    sget-object v3, Landroidx/media3/common/k0;->d:Landroidx/media3/common/k0;

    .line 729
    .line 730
    :goto_d
    move-object v9, v3

    .line 731
    goto :goto_e

    .line 732
    :cond_20
    new-instance v6, La4/c;

    .line 733
    .line 734
    const/4 v7, 0x4

    .line 735
    invoke-direct {v6, v7}, La4/c;-><init>(I)V

    .line 736
    .line 737
    .line 738
    sget-object v7, Landroidx/media3/common/k0;->e:Ljava/lang/String;

    .line 739
    .line 740
    invoke-virtual {v3, v7}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 741
    .line 742
    .line 743
    move-result-object v7

    .line 744
    check-cast v7, Landroid/net/Uri;

    .line 745
    .line 746
    iput-object v7, v6, La4/c;->k:Ljava/lang/Object;

    .line 747
    .line 748
    sget-object v7, Landroidx/media3/common/k0;->f:Ljava/lang/String;

    .line 749
    .line 750
    invoke-virtual {v3, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    move-result-object v7

    .line 754
    iput-object v7, v6, La4/c;->l:Ljava/lang/Object;

    .line 755
    .line 756
    sget-object v7, Landroidx/media3/common/k0;->g:Ljava/lang/String;

    .line 757
    .line 758
    invoke-virtual {v3, v7}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 759
    .line 760
    .line 761
    move-result-object v3

    .line 762
    iput-object v3, v6, La4/c;->m:Ljava/lang/Object;

    .line 763
    .line 764
    new-instance v3, Landroidx/media3/common/k0;

    .line 765
    .line 766
    invoke-direct {v3, v6}, Landroidx/media3/common/k0;-><init>(La4/c;)V

    .line 767
    .line 768
    .line 769
    goto :goto_d

    .line 770
    :goto_e
    sget-object v3, Landroidx/media3/common/o0;->m:Ljava/lang/String;

    .line 771
    .line 772
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 773
    .line 774
    .line 775
    move-result-object v0

    .line 776
    if-nez v0, :cond_21

    .line 777
    .line 778
    move-object v6, v8

    .line 779
    goto/16 :goto_1c

    .line 780
    .line 781
    :cond_21
    sget-object v3, Landroidx/media3/common/j0;->l:Ljava/lang/String;

    .line 782
    .line 783
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 784
    .line 785
    .line 786
    move-result-object v3

    .line 787
    if-nez v3, :cond_22

    .line 788
    .line 789
    move-object/from16 v21, v8

    .line 790
    .line 791
    goto/16 :goto_14

    .line 792
    .line 793
    :cond_22
    sget-object v6, Landroidx/media3/common/g0;->i:Ljava/lang/String;

    .line 794
    .line 795
    invoke-virtual {v3, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 796
    .line 797
    .line 798
    move-result-object v6

    .line 799
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 800
    .line 801
    .line 802
    invoke-static {v6}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 803
    .line 804
    .line 805
    move-result-object v6

    .line 806
    sget-object v7, Landroidx/media3/common/g0;->j:Ljava/lang/String;

    .line 807
    .line 808
    invoke-virtual {v3, v7}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 809
    .line 810
    .line 811
    move-result-object v7

    .line 812
    check-cast v7, Landroid/net/Uri;

    .line 813
    .line 814
    sget-object v10, Landroidx/media3/common/g0;->k:Ljava/lang/String;

    .line 815
    .line 816
    sget-object v11, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 817
    .line 818
    invoke-virtual {v3, v10}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 819
    .line 820
    .line 821
    move-result-object v10

    .line 822
    if-eqz v10, :cond_23

    .line 823
    .line 824
    goto :goto_f

    .line 825
    :cond_23
    move-object v10, v11

    .line 826
    :goto_f
    if-ne v10, v11, :cond_24

    .line 827
    .line 828
    sget-object v10, Lf6/q1;->p:Lf6/q1;

    .line 829
    .line 830
    goto :goto_12

    .line 831
    :cond_24
    new-instance v12, Ljava/util/HashMap;

    .line 832
    .line 833
    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 834
    .line 835
    .line 836
    if-ne v10, v11, :cond_25

    .line 837
    .line 838
    goto :goto_11

    .line 839
    :cond_25
    invoke-virtual {v10}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 840
    .line 841
    .line 842
    move-result-object v11

    .line 843
    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 844
    .line 845
    .line 846
    move-result-object v11

    .line 847
    :cond_26
    :goto_10
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 848
    .line 849
    .line 850
    move-result v13

    .line 851
    if-eqz v13, :cond_27

    .line 852
    .line 853
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v13

    .line 857
    check-cast v13, Ljava/lang/String;

    .line 858
    .line 859
    invoke-virtual {v10, v13}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 860
    .line 861
    .line 862
    move-result-object v14

    .line 863
    if-eqz v14, :cond_26

    .line 864
    .line 865
    invoke-virtual {v12, v13, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 866
    .line 867
    .line 868
    goto :goto_10

    .line 869
    :cond_27
    :goto_11
    invoke-static {v12}, Lf6/q0;->a(Ljava/util/Map;)Lf6/q0;

    .line 870
    .line 871
    .line 872
    move-result-object v10

    .line 873
    :goto_12
    sget-object v11, Landroidx/media3/common/g0;->l:Ljava/lang/String;

    .line 874
    .line 875
    invoke-virtual {v3, v11, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 876
    .line 877
    .line 878
    move-result v11

    .line 879
    sget-object v12, Landroidx/media3/common/g0;->m:Ljava/lang/String;

    .line 880
    .line 881
    invoke-virtual {v3, v12, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 882
    .line 883
    .line 884
    move-result v12

    .line 885
    sget-object v13, Landroidx/media3/common/g0;->n:Ljava/lang/String;

    .line 886
    .line 887
    invoke-virtual {v3, v13, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 888
    .line 889
    .line 890
    move-result v13

    .line 891
    sget-object v14, Landroidx/media3/common/g0;->o:Ljava/lang/String;

    .line 892
    .line 893
    new-instance v15, Ljava/util/ArrayList;

    .line 894
    .line 895
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 896
    .line 897
    .line 898
    invoke-virtual {v3, v14}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 899
    .line 900
    .line 901
    move-result-object v14

    .line 902
    if-eqz v14, :cond_28

    .line 903
    .line 904
    move-object v15, v14

    .line 905
    :cond_28
    invoke-static {v15}, Lf6/m0;->j(Ljava/util/Collection;)Lf6/m0;

    .line 906
    .line 907
    .line 908
    move-result-object v14

    .line 909
    sget-object v15, Landroidx/media3/common/g0;->p:Ljava/lang/String;

    .line 910
    .line 911
    invoke-virtual {v3, v15}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 912
    .line 913
    .line 914
    move-result-object v3

    .line 915
    new-instance v15, Landroidx/media3/common/f0;

    .line 916
    .line 917
    invoke-direct {v15}, Landroidx/media3/common/f0;-><init>()V

    .line 918
    .line 919
    .line 920
    iput-object v6, v15, Landroidx/media3/common/f0;->a:Ljava/util/UUID;

    .line 921
    .line 922
    iput-object v7, v15, Landroidx/media3/common/f0;->b:Landroid/net/Uri;

    .line 923
    .line 924
    invoke-static {v10}, Lf6/q0;->a(Ljava/util/Map;)Lf6/q0;

    .line 925
    .line 926
    .line 927
    move-result-object v6

    .line 928
    iput-object v6, v15, Landroidx/media3/common/f0;->c:Lf6/q0;

    .line 929
    .line 930
    iput-boolean v11, v15, Landroidx/media3/common/f0;->d:Z

    .line 931
    .line 932
    iput-boolean v13, v15, Landroidx/media3/common/f0;->f:Z

    .line 933
    .line 934
    iput-boolean v12, v15, Landroidx/media3/common/f0;->e:Z

    .line 935
    .line 936
    invoke-static {v14}, Lf6/m0;->j(Ljava/util/Collection;)Lf6/m0;

    .line 937
    .line 938
    .line 939
    move-result-object v6

    .line 940
    iput-object v6, v15, Landroidx/media3/common/f0;->g:Lf6/m0;

    .line 941
    .line 942
    if-eqz v3, :cond_29

    .line 943
    .line 944
    array-length v6, v3

    .line 945
    invoke-static {v3, v6}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 946
    .line 947
    .line 948
    move-result-object v3

    .line 949
    goto :goto_13

    .line 950
    :cond_29
    move-object v3, v8

    .line 951
    :goto_13
    iput-object v3, v15, Landroidx/media3/common/f0;->h:[B

    .line 952
    .line 953
    new-instance v3, Landroidx/media3/common/g0;

    .line 954
    .line 955
    invoke-direct {v3, v15}, Landroidx/media3/common/g0;-><init>(Landroidx/media3/common/f0;)V

    .line 956
    .line 957
    .line 958
    move-object/from16 v21, v3

    .line 959
    .line 960
    :goto_14
    sget-object v3, Landroidx/media3/common/j0;->m:Ljava/lang/String;

    .line 961
    .line 962
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 963
    .line 964
    .line 965
    move-result-object v3

    .line 966
    if-nez v3, :cond_2a

    .line 967
    .line 968
    :goto_15
    move-object/from16 v22, v8

    .line 969
    .line 970
    goto :goto_16

    .line 971
    :cond_2a
    sget-object v6, Landroidx/media3/common/a0;->b:Ljava/lang/String;

    .line 972
    .line 973
    invoke-virtual {v3, v6}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 974
    .line 975
    .line 976
    move-result-object v3

    .line 977
    check-cast v3, Landroid/net/Uri;

    .line 978
    .line 979
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 980
    .line 981
    .line 982
    new-instance v6, La1/o;

    .line 983
    .line 984
    const/16 v7, 0x9

    .line 985
    .line 986
    invoke-direct {v6, v7, v5}, La1/o;-><init>(IZ)V

    .line 987
    .line 988
    .line 989
    iput-object v3, v6, La1/o;->k:Ljava/lang/Object;

    .line 990
    .line 991
    new-instance v8, Landroidx/media3/common/a0;

    .line 992
    .line 993
    invoke-direct {v8, v6}, Landroidx/media3/common/a0;-><init>(La1/o;)V

    .line 994
    .line 995
    .line 996
    goto :goto_15

    .line 997
    :goto_16
    sget-object v3, Landroidx/media3/common/j0;->n:Ljava/lang/String;

    .line 998
    .line 999
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v3

    .line 1003
    if-nez v3, :cond_2b

    .line 1004
    .line 1005
    sget-object v3, Lf6/m0;->k:Lf6/k0;

    .line 1006
    .line 1007
    sget-object v3, Lf6/l1;->n:Lf6/l1;

    .line 1008
    .line 1009
    :goto_17
    move-object/from16 v23, v3

    .line 1010
    .line 1011
    goto :goto_19

    .line 1012
    :cond_2b
    invoke-static {}, Lf6/m0;->i()Lf6/j0;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v6

    .line 1016
    move v7, v5

    .line 1017
    :goto_18
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1018
    .line 1019
    .line 1020
    move-result v8

    .line 1021
    if-ge v7, v8, :cond_2c

    .line 1022
    .line 1023
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v8

    .line 1027
    check-cast v8, Landroid/os/Bundle;

    .line 1028
    .line 1029
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1030
    .line 1031
    .line 1032
    new-instance v10, Landroidx/media3/common/j1;

    .line 1033
    .line 1034
    sget-object v11, Landroidx/media3/common/j1;->m:Ljava/lang/String;

    .line 1035
    .line 1036
    invoke-virtual {v8, v11, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1037
    .line 1038
    .line 1039
    move-result v11

    .line 1040
    sget-object v12, Landroidx/media3/common/j1;->n:Ljava/lang/String;

    .line 1041
    .line 1042
    invoke-virtual {v8, v12, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1043
    .line 1044
    .line 1045
    move-result v12

    .line 1046
    sget-object v13, Landroidx/media3/common/j1;->o:Ljava/lang/String;

    .line 1047
    .line 1048
    invoke-virtual {v8, v13, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1049
    .line 1050
    .line 1051
    move-result v8

    .line 1052
    invoke-direct {v10, v11, v12, v8}, Landroidx/media3/common/j1;-><init>(III)V

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual {v6, v10}, Lf6/g0;->a(Ljava/lang/Object;)V

    .line 1056
    .line 1057
    .line 1058
    add-int/lit8 v7, v7, 0x1

    .line 1059
    .line 1060
    goto :goto_18

    .line 1061
    :cond_2c
    invoke-virtual {v6}, Lf6/j0;->f()Lf6/l1;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v3

    .line 1065
    goto :goto_17

    .line 1066
    :goto_19
    sget-object v3, Landroidx/media3/common/j0;->p:Ljava/lang/String;

    .line 1067
    .line 1068
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v3

    .line 1072
    if-nez v3, :cond_2d

    .line 1073
    .line 1074
    sget-object v3, Lf6/m0;->k:Lf6/k0;

    .line 1075
    .line 1076
    sget-object v3, Lf6/l1;->n:Lf6/l1;

    .line 1077
    .line 1078
    :goto_1a
    move-object/from16 v25, v3

    .line 1079
    .line 1080
    goto :goto_1b

    .line 1081
    :cond_2d
    new-instance v5, Landroidx/media3/common/n;

    .line 1082
    .line 1083
    const/4 v6, 0x5

    .line 1084
    invoke-direct {v5, v6}, Landroidx/media3/common/n;-><init>(I)V

    .line 1085
    .line 1086
    .line 1087
    invoke-static {v5, v3}, Lh1/a;->q(Le6/d;Ljava/util/List;)Lf6/l1;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v3

    .line 1091
    goto :goto_1a

    .line 1092
    :goto_1b
    sget-object v3, Landroidx/media3/common/j0;->q:Ljava/lang/String;

    .line 1093
    .line 1094
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    invoke-virtual {v0, v3, v5, v6}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 1100
    .line 1101
    .line 1102
    move-result-wide v27

    .line 1103
    new-instance v18, Landroidx/media3/common/j0;

    .line 1104
    .line 1105
    sget-object v3, Landroidx/media3/common/j0;->j:Ljava/lang/String;

    .line 1106
    .line 1107
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v3

    .line 1111
    move-object/from16 v19, v3

    .line 1112
    .line 1113
    check-cast v19, Landroid/net/Uri;

    .line 1114
    .line 1115
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1116
    .line 1117
    .line 1118
    sget-object v3, Landroidx/media3/common/j0;->k:Ljava/lang/String;

    .line 1119
    .line 1120
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v20

    .line 1124
    sget-object v3, Landroidx/media3/common/j0;->o:Ljava/lang/String;

    .line 1125
    .line 1126
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v24

    .line 1130
    const/16 v26, 0x0

    .line 1131
    .line 1132
    invoke-direct/range {v18 .. v28}, Landroidx/media3/common/j0;-><init>(Landroid/net/Uri;Ljava/lang/String;Landroidx/media3/common/g0;Landroidx/media3/common/a0;Ljava/util/List;Ljava/lang/String;Lf6/m0;Ljava/lang/Object;J)V

    .line 1133
    .line 1134
    .line 1135
    move-object/from16 v6, v18

    .line 1136
    .line 1137
    :goto_1c
    new-instance v3, Landroidx/media3/common/o0;

    .line 1138
    .line 1139
    move-object v8, v1

    .line 1140
    move-object v5, v2

    .line 1141
    move-object/from16 v7, v17

    .line 1142
    .line 1143
    invoke-direct/range {v3 .. v9}, Landroidx/media3/common/o0;-><init>(Ljava/lang/String;Landroidx/media3/common/e0;Landroidx/media3/common/j0;Landroidx/media3/common/i0;Landroidx/media3/common/r0;Landroidx/media3/common/k0;)V

    .line 1144
    .line 1145
    .line 1146
    return-object v3
.end method

.method public static c(Landroid/net/Uri;)Landroidx/media3/common/o0;
    .locals 21

    .line 1
    new-instance v0, Landroidx/media3/common/c0;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media3/common/c0;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroidx/media3/common/f0;

    .line 7
    .line 8
    invoke-direct {v1}, Landroidx/media3/common/f0;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 12
    .line 13
    sget-object v9, Lf6/l1;->n:Lf6/l1;

    .line 14
    .line 15
    new-instance v13, Landroidx/media3/common/h0;

    .line 16
    .line 17
    invoke-direct {v13}, Landroidx/media3/common/h0;-><init>()V

    .line 18
    .line 19
    .line 20
    sget-object v20, Landroidx/media3/common/k0;->d:Landroidx/media3/common/k0;

    .line 21
    .line 22
    iget-object v2, v1, Landroidx/media3/common/f0;->b:Landroid/net/Uri;

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    iget-object v2, v1, Landroidx/media3/common/f0;->a:Ljava/util/UUID;

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v2, 0x0

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    :goto_0
    const/4 v2, 0x1

    .line 34
    :goto_1
    invoke-static {v2}, Lh1/a;->j(Z)V

    .line 35
    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    move-object v3, v2

    .line 39
    if-eqz p0, :cond_3

    .line 40
    .line 41
    new-instance v2, Landroidx/media3/common/j0;

    .line 42
    .line 43
    iget-object v4, v1, Landroidx/media3/common/f0;->a:Ljava/util/UUID;

    .line 44
    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    new-instance v3, Landroidx/media3/common/g0;

    .line 48
    .line 49
    invoke-direct {v3, v1}, Landroidx/media3/common/g0;-><init>(Landroidx/media3/common/f0;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    move-object v5, v3

    .line 53
    const/4 v4, 0x0

    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v8, 0x0

    .line 56
    const/4 v10, 0x0

    .line 57
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    move-object/from16 v3, p0

    .line 63
    .line 64
    invoke-direct/range {v2 .. v12}, Landroidx/media3/common/j0;-><init>(Landroid/net/Uri;Ljava/lang/String;Landroidx/media3/common/g0;Landroidx/media3/common/a0;Ljava/util/List;Ljava/lang/String;Lf6/m0;Ljava/lang/Object;J)V

    .line 65
    .line 66
    .line 67
    move-object/from16 v17, v2

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    move-object/from16 v17, v3

    .line 71
    .line 72
    :goto_2
    new-instance v14, Landroidx/media3/common/o0;

    .line 73
    .line 74
    new-instance v1, Landroidx/media3/common/e0;

    .line 75
    .line 76
    invoke-direct {v1, v0}, Landroidx/media3/common/d0;-><init>(Landroidx/media3/common/c0;)V

    .line 77
    .line 78
    .line 79
    new-instance v0, Landroidx/media3/common/i0;

    .line 80
    .line 81
    invoke-direct {v0, v13}, Landroidx/media3/common/i0;-><init>(Landroidx/media3/common/h0;)V

    .line 82
    .line 83
    .line 84
    sget-object v19, Landroidx/media3/common/r0;->K:Landroidx/media3/common/r0;

    .line 85
    .line 86
    const-string v15, ""

    .line 87
    .line 88
    move-object/from16 v18, v0

    .line 89
    .line 90
    move-object/from16 v16, v1

    .line 91
    .line 92
    invoke-direct/range {v14 .. v20}, Landroidx/media3/common/o0;-><init>(Ljava/lang/String;Landroidx/media3/common/e0;Landroidx/media3/common/j0;Landroidx/media3/common/i0;Landroidx/media3/common/r0;Landroidx/media3/common/k0;)V

    .line 93
    .line 94
    .line 95
    return-object v14
.end method


# virtual methods
.method public final a()Landroidx/media3/common/b0;
    .locals 5

    .line 1
    new-instance v0, Landroidx/media3/common/b0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroidx/media3/common/c0;

    .line 7
    .line 8
    invoke-direct {v1}, Landroidx/media3/common/c0;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v1, v0, Landroidx/media3/common/b0;->d:Landroidx/media3/common/c0;

    .line 12
    .line 13
    new-instance v1, Landroidx/media3/common/f0;

    .line 14
    .line 15
    invoke-direct {v1}, Landroidx/media3/common/f0;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, v0, Landroidx/media3/common/b0;->e:Landroidx/media3/common/f0;

    .line 19
    .line 20
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 21
    .line 22
    iput-object v1, v0, Landroidx/media3/common/b0;->f:Ljava/util/List;

    .line 23
    .line 24
    sget-object v1, Lf6/l1;->n:Lf6/l1;

    .line 25
    .line 26
    iput-object v1, v0, Landroidx/media3/common/b0;->h:Lf6/m0;

    .line 27
    .line 28
    new-instance v1, Landroidx/media3/common/h0;

    .line 29
    .line 30
    invoke-direct {v1}, Landroidx/media3/common/h0;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v1, v0, Landroidx/media3/common/b0;->m:Landroidx/media3/common/h0;

    .line 34
    .line 35
    sget-object v1, Landroidx/media3/common/k0;->d:Landroidx/media3/common/k0;

    .line 36
    .line 37
    iput-object v1, v0, Landroidx/media3/common/b0;->n:Landroidx/media3/common/k0;

    .line 38
    .line 39
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    iput-wide v1, v0, Landroidx/media3/common/b0;->k:J

    .line 45
    .line 46
    new-instance v1, Landroidx/media3/common/c0;

    .line 47
    .line 48
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, Landroidx/media3/common/o0;->e:Landroidx/media3/common/e0;

    .line 52
    .line 53
    iget-wide v3, v2, Landroidx/media3/common/d0;->b:J

    .line 54
    .line 55
    iput-wide v3, v1, Landroidx/media3/common/c0;->a:J

    .line 56
    .line 57
    iget-wide v3, v2, Landroidx/media3/common/d0;->d:J

    .line 58
    .line 59
    iput-wide v3, v1, Landroidx/media3/common/c0;->b:J

    .line 60
    .line 61
    iget-boolean v3, v2, Landroidx/media3/common/d0;->e:Z

    .line 62
    .line 63
    iput-boolean v3, v1, Landroidx/media3/common/c0;->c:Z

    .line 64
    .line 65
    iget-boolean v3, v2, Landroidx/media3/common/d0;->f:Z

    .line 66
    .line 67
    iput-boolean v3, v1, Landroidx/media3/common/c0;->d:Z

    .line 68
    .line 69
    iget-boolean v2, v2, Landroidx/media3/common/d0;->g:Z

    .line 70
    .line 71
    iput-boolean v2, v1, Landroidx/media3/common/c0;->e:Z

    .line 72
    .line 73
    iput-object v1, v0, Landroidx/media3/common/b0;->d:Landroidx/media3/common/c0;

    .line 74
    .line 75
    iget-object v1, p0, Landroidx/media3/common/o0;->a:Ljava/lang/String;

    .line 76
    .line 77
    iput-object v1, v0, Landroidx/media3/common/b0;->a:Ljava/lang/String;

    .line 78
    .line 79
    iget-object v1, p0, Landroidx/media3/common/o0;->d:Landroidx/media3/common/r0;

    .line 80
    .line 81
    iput-object v1, v0, Landroidx/media3/common/b0;->l:Landroidx/media3/common/r0;

    .line 82
    .line 83
    iget-object v1, p0, Landroidx/media3/common/o0;->c:Landroidx/media3/common/i0;

    .line 84
    .line 85
    invoke-virtual {v1}, Landroidx/media3/common/i0;->a()Landroidx/media3/common/h0;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iput-object v1, v0, Landroidx/media3/common/b0;->m:Landroidx/media3/common/h0;

    .line 90
    .line 91
    iget-object v1, p0, Landroidx/media3/common/o0;->f:Landroidx/media3/common/k0;

    .line 92
    .line 93
    iput-object v1, v0, Landroidx/media3/common/b0;->n:Landroidx/media3/common/k0;

    .line 94
    .line 95
    iget-object v1, p0, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 96
    .line 97
    if-eqz v1, :cond_1

    .line 98
    .line 99
    iget-object v2, v1, Landroidx/media3/common/j0;->f:Ljava/lang/String;

    .line 100
    .line 101
    iput-object v2, v0, Landroidx/media3/common/b0;->g:Ljava/lang/String;

    .line 102
    .line 103
    iget-object v2, v1, Landroidx/media3/common/j0;->b:Ljava/lang/String;

    .line 104
    .line 105
    iput-object v2, v0, Landroidx/media3/common/b0;->c:Ljava/lang/String;

    .line 106
    .line 107
    iget-object v2, v1, Landroidx/media3/common/j0;->a:Landroid/net/Uri;

    .line 108
    .line 109
    iput-object v2, v0, Landroidx/media3/common/b0;->b:Landroid/net/Uri;

    .line 110
    .line 111
    iget-object v2, v1, Landroidx/media3/common/j0;->e:Ljava/util/List;

    .line 112
    .line 113
    iput-object v2, v0, Landroidx/media3/common/b0;->f:Ljava/util/List;

    .line 114
    .line 115
    iget-object v2, v1, Landroidx/media3/common/j0;->g:Lf6/m0;

    .line 116
    .line 117
    iput-object v2, v0, Landroidx/media3/common/b0;->h:Lf6/m0;

    .line 118
    .line 119
    iget-object v2, v1, Landroidx/media3/common/j0;->h:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v2, v0, Landroidx/media3/common/b0;->j:Ljava/lang/Object;

    .line 122
    .line 123
    iget-object v2, v1, Landroidx/media3/common/j0;->c:Landroidx/media3/common/g0;

    .line 124
    .line 125
    if-eqz v2, :cond_0

    .line 126
    .line 127
    invoke-virtual {v2}, Landroidx/media3/common/g0;->a()Landroidx/media3/common/f0;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    goto :goto_0

    .line 132
    :cond_0
    new-instance v2, Landroidx/media3/common/f0;

    .line 133
    .line 134
    invoke-direct {v2}, Landroidx/media3/common/f0;-><init>()V

    .line 135
    .line 136
    .line 137
    :goto_0
    iput-object v2, v0, Landroidx/media3/common/b0;->e:Landroidx/media3/common/f0;

    .line 138
    .line 139
    iget-object v2, v1, Landroidx/media3/common/j0;->d:Landroidx/media3/common/a0;

    .line 140
    .line 141
    iput-object v2, v0, Landroidx/media3/common/b0;->i:Landroidx/media3/common/a0;

    .line 142
    .line 143
    iget-wide v1, v1, Landroidx/media3/common/j0;->i:J

    .line 144
    .line 145
    iput-wide v1, v0, Landroidx/media3/common/b0;->k:J

    .line 146
    .line 147
    :cond_1
    return-object v0
.end method

.method public final d(Z)Landroid/os/Bundle;
    .locals 13

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    iget-object v2, p0, Landroidx/media3/common/o0;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    sget-object v1, Landroidx/media3/common/o0;->h:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    sget-object v1, Landroidx/media3/common/i0;->f:Landroidx/media3/common/i0;

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/media3/common/o0;->c:Landroidx/media3/common/i0;

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Landroidx/media3/common/i0;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    sget-object v1, Landroidx/media3/common/o0;->i:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v2}, Landroidx/media3/common/i0;->c()Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    sget-object v1, Landroidx/media3/common/r0;->K:Landroidx/media3/common/r0;

    .line 41
    .line 42
    iget-object v2, p0, Landroidx/media3/common/o0;->d:Landroidx/media3/common/r0;

    .line 43
    .line 44
    invoke-virtual {v2, v1}, Landroidx/media3/common/r0;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_25

    .line 49
    .line 50
    iget-object v1, v2, Landroidx/media3/common/r0;->J:Lf6/m0;

    .line 51
    .line 52
    new-instance v3, Landroid/os/Bundle;

    .line 53
    .line 54
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 55
    .line 56
    .line 57
    iget-object v4, v2, Landroidx/media3/common/r0;->a:Ljava/lang/CharSequence;

    .line 58
    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    sget-object v5, Landroidx/media3/common/r0;->L:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    iget-object v4, v2, Landroidx/media3/common/r0;->b:Ljava/lang/CharSequence;

    .line 67
    .line 68
    if-eqz v4, :cond_3

    .line 69
    .line 70
    sget-object v5, Landroidx/media3/common/r0;->M:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    iget-object v4, v2, Landroidx/media3/common/r0;->c:Ljava/lang/CharSequence;

    .line 76
    .line 77
    if-eqz v4, :cond_4

    .line 78
    .line 79
    sget-object v5, Landroidx/media3/common/r0;->N:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    iget-object v4, v2, Landroidx/media3/common/r0;->d:Ljava/lang/CharSequence;

    .line 85
    .line 86
    if-eqz v4, :cond_5

    .line 87
    .line 88
    sget-object v5, Landroidx/media3/common/r0;->O:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 91
    .line 92
    .line 93
    :cond_5
    iget-object v4, v2, Landroidx/media3/common/r0;->e:Ljava/lang/CharSequence;

    .line 94
    .line 95
    if-eqz v4, :cond_6

    .line 96
    .line 97
    sget-object v5, Landroidx/media3/common/r0;->P:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 100
    .line 101
    .line 102
    :cond_6
    iget-object v4, v2, Landroidx/media3/common/r0;->f:Ljava/lang/CharSequence;

    .line 103
    .line 104
    if-eqz v4, :cond_7

    .line 105
    .line 106
    sget-object v5, Landroidx/media3/common/r0;->Q:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 109
    .line 110
    .line 111
    :cond_7
    iget-object v4, v2, Landroidx/media3/common/r0;->g:Ljava/lang/CharSequence;

    .line 112
    .line 113
    if-eqz v4, :cond_8

    .line 114
    .line 115
    sget-object v5, Landroidx/media3/common/r0;->R:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 118
    .line 119
    .line 120
    :cond_8
    iget-object v4, v2, Landroidx/media3/common/r0;->h:Ljava/lang/Long;

    .line 121
    .line 122
    if-eqz v4, :cond_9

    .line 123
    .line 124
    sget-object v5, Landroidx/media3/common/r0;->r0:Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 127
    .line 128
    .line 129
    move-result-wide v6

    .line 130
    invoke-virtual {v3, v5, v6, v7}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 131
    .line 132
    .line 133
    :cond_9
    iget-object v4, v2, Landroidx/media3/common/r0;->k:[B

    .line 134
    .line 135
    if-eqz v4, :cond_a

    .line 136
    .line 137
    sget-object v5, Landroidx/media3/common/r0;->U:Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 140
    .line 141
    .line 142
    :cond_a
    iget-object v4, v2, Landroidx/media3/common/r0;->m:Landroid/net/Uri;

    .line 143
    .line 144
    if-eqz v4, :cond_b

    .line 145
    .line 146
    sget-object v5, Landroidx/media3/common/r0;->V:Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 149
    .line 150
    .line 151
    :cond_b
    iget-object v4, v2, Landroidx/media3/common/r0;->z:Ljava/lang/CharSequence;

    .line 152
    .line 153
    if-eqz v4, :cond_c

    .line 154
    .line 155
    sget-object v5, Landroidx/media3/common/r0;->g0:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 158
    .line 159
    .line 160
    :cond_c
    iget-object v4, v2, Landroidx/media3/common/r0;->A:Ljava/lang/CharSequence;

    .line 161
    .line 162
    if-eqz v4, :cond_d

    .line 163
    .line 164
    sget-object v5, Landroidx/media3/common/r0;->h0:Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 167
    .line 168
    .line 169
    :cond_d
    iget-object v4, v2, Landroidx/media3/common/r0;->B:Ljava/lang/CharSequence;

    .line 170
    .line 171
    if-eqz v4, :cond_e

    .line 172
    .line 173
    sget-object v5, Landroidx/media3/common/r0;->i0:Ljava/lang/String;

    .line 174
    .line 175
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 176
    .line 177
    .line 178
    :cond_e
    iget-object v4, v2, Landroidx/media3/common/r0;->E:Ljava/lang/CharSequence;

    .line 179
    .line 180
    if-eqz v4, :cond_f

    .line 181
    .line 182
    sget-object v5, Landroidx/media3/common/r0;->l0:Ljava/lang/String;

    .line 183
    .line 184
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 185
    .line 186
    .line 187
    :cond_f
    iget-object v4, v2, Landroidx/media3/common/r0;->F:Ljava/lang/CharSequence;

    .line 188
    .line 189
    if-eqz v4, :cond_10

    .line 190
    .line 191
    sget-object v5, Landroidx/media3/common/r0;->m0:Ljava/lang/String;

    .line 192
    .line 193
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 194
    .line 195
    .line 196
    :cond_10
    iget-object v4, v2, Landroidx/media3/common/r0;->G:Ljava/lang/CharSequence;

    .line 197
    .line 198
    if-eqz v4, :cond_11

    .line 199
    .line 200
    sget-object v5, Landroidx/media3/common/r0;->o0:Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 203
    .line 204
    .line 205
    :cond_11
    iget-object v4, v2, Landroidx/media3/common/r0;->i:Landroidx/media3/common/h1;

    .line 206
    .line 207
    if-eqz v4, :cond_12

    .line 208
    .line 209
    sget-object v5, Landroidx/media3/common/r0;->S:Ljava/lang/String;

    .line 210
    .line 211
    invoke-virtual {v4}, Landroidx/media3/common/h1;->b()Landroid/os/Bundle;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 216
    .line 217
    .line 218
    :cond_12
    iget-object v4, v2, Landroidx/media3/common/r0;->j:Landroidx/media3/common/h1;

    .line 219
    .line 220
    if-eqz v4, :cond_13

    .line 221
    .line 222
    sget-object v5, Landroidx/media3/common/r0;->T:Ljava/lang/String;

    .line 223
    .line 224
    invoke-virtual {v4}, Landroidx/media3/common/h1;->b()Landroid/os/Bundle;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 229
    .line 230
    .line 231
    :cond_13
    iget-object v4, v2, Landroidx/media3/common/r0;->n:Ljava/lang/Integer;

    .line 232
    .line 233
    if-eqz v4, :cond_14

    .line 234
    .line 235
    sget-object v5, Landroidx/media3/common/r0;->W:Ljava/lang/String;

    .line 236
    .line 237
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 242
    .line 243
    .line 244
    :cond_14
    iget-object v4, v2, Landroidx/media3/common/r0;->o:Ljava/lang/Integer;

    .line 245
    .line 246
    if-eqz v4, :cond_15

    .line 247
    .line 248
    sget-object v5, Landroidx/media3/common/r0;->X:Ljava/lang/String;

    .line 249
    .line 250
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 255
    .line 256
    .line 257
    :cond_15
    iget-object v4, v2, Landroidx/media3/common/r0;->p:Ljava/lang/Integer;

    .line 258
    .line 259
    if-eqz v4, :cond_16

    .line 260
    .line 261
    sget-object v5, Landroidx/media3/common/r0;->Y:Ljava/lang/String;

    .line 262
    .line 263
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 268
    .line 269
    .line 270
    :cond_16
    iget-object v4, v2, Landroidx/media3/common/r0;->q:Ljava/lang/Boolean;

    .line 271
    .line 272
    if-eqz v4, :cond_17

    .line 273
    .line 274
    sget-object v5, Landroidx/media3/common/r0;->q0:Ljava/lang/String;

    .line 275
    .line 276
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 277
    .line 278
    .line 279
    move-result v4

    .line 280
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 281
    .line 282
    .line 283
    :cond_17
    iget-object v4, v2, Landroidx/media3/common/r0;->r:Ljava/lang/Boolean;

    .line 284
    .line 285
    if-eqz v4, :cond_18

    .line 286
    .line 287
    sget-object v5, Landroidx/media3/common/r0;->Z:Ljava/lang/String;

    .line 288
    .line 289
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 294
    .line 295
    .line 296
    :cond_18
    iget-object v4, v2, Landroidx/media3/common/r0;->t:Ljava/lang/Integer;

    .line 297
    .line 298
    if-eqz v4, :cond_19

    .line 299
    .line 300
    sget-object v5, Landroidx/media3/common/r0;->a0:Ljava/lang/String;

    .line 301
    .line 302
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 307
    .line 308
    .line 309
    :cond_19
    iget-object v4, v2, Landroidx/media3/common/r0;->u:Ljava/lang/Integer;

    .line 310
    .line 311
    if-eqz v4, :cond_1a

    .line 312
    .line 313
    sget-object v5, Landroidx/media3/common/r0;->b0:Ljava/lang/String;

    .line 314
    .line 315
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 320
    .line 321
    .line 322
    :cond_1a
    iget-object v4, v2, Landroidx/media3/common/r0;->v:Ljava/lang/Integer;

    .line 323
    .line 324
    if-eqz v4, :cond_1b

    .line 325
    .line 326
    sget-object v5, Landroidx/media3/common/r0;->c0:Ljava/lang/String;

    .line 327
    .line 328
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 329
    .line 330
    .line 331
    move-result v4

    .line 332
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 333
    .line 334
    .line 335
    :cond_1b
    iget-object v4, v2, Landroidx/media3/common/r0;->w:Ljava/lang/Integer;

    .line 336
    .line 337
    if-eqz v4, :cond_1c

    .line 338
    .line 339
    sget-object v5, Landroidx/media3/common/r0;->d0:Ljava/lang/String;

    .line 340
    .line 341
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 342
    .line 343
    .line 344
    move-result v4

    .line 345
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 346
    .line 347
    .line 348
    :cond_1c
    iget-object v4, v2, Landroidx/media3/common/r0;->x:Ljava/lang/Integer;

    .line 349
    .line 350
    if-eqz v4, :cond_1d

    .line 351
    .line 352
    sget-object v5, Landroidx/media3/common/r0;->e0:Ljava/lang/String;

    .line 353
    .line 354
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 355
    .line 356
    .line 357
    move-result v4

    .line 358
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 359
    .line 360
    .line 361
    :cond_1d
    iget-object v4, v2, Landroidx/media3/common/r0;->y:Ljava/lang/Integer;

    .line 362
    .line 363
    if-eqz v4, :cond_1e

    .line 364
    .line 365
    sget-object v5, Landroidx/media3/common/r0;->f0:Ljava/lang/String;

    .line 366
    .line 367
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 368
    .line 369
    .line 370
    move-result v4

    .line 371
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 372
    .line 373
    .line 374
    :cond_1e
    iget-object v4, v2, Landroidx/media3/common/r0;->C:Ljava/lang/Integer;

    .line 375
    .line 376
    if-eqz v4, :cond_1f

    .line 377
    .line 378
    sget-object v5, Landroidx/media3/common/r0;->j0:Ljava/lang/String;

    .line 379
    .line 380
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 381
    .line 382
    .line 383
    move-result v4

    .line 384
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 385
    .line 386
    .line 387
    :cond_1f
    iget-object v4, v2, Landroidx/media3/common/r0;->D:Ljava/lang/Integer;

    .line 388
    .line 389
    if-eqz v4, :cond_20

    .line 390
    .line 391
    sget-object v5, Landroidx/media3/common/r0;->k0:Ljava/lang/String;

    .line 392
    .line 393
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 394
    .line 395
    .line 396
    move-result v4

    .line 397
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 398
    .line 399
    .line 400
    :cond_20
    iget-object v4, v2, Landroidx/media3/common/r0;->l:Ljava/lang/Integer;

    .line 401
    .line 402
    if-eqz v4, :cond_21

    .line 403
    .line 404
    sget-object v5, Landroidx/media3/common/r0;->n0:Ljava/lang/String;

    .line 405
    .line 406
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 407
    .line 408
    .line 409
    move-result v4

    .line 410
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 411
    .line 412
    .line 413
    :cond_21
    iget-object v4, v2, Landroidx/media3/common/r0;->H:Ljava/lang/Integer;

    .line 414
    .line 415
    if-eqz v4, :cond_22

    .line 416
    .line 417
    sget-object v5, Landroidx/media3/common/r0;->p0:Ljava/lang/String;

    .line 418
    .line 419
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 420
    .line 421
    .line 422
    move-result v4

    .line 423
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 424
    .line 425
    .line 426
    :cond_22
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 427
    .line 428
    .line 429
    move-result v4

    .line 430
    if-nez v4, :cond_23

    .line 431
    .line 432
    sget-object v4, Landroidx/media3/common/r0;->s0:Ljava/lang/String;

    .line 433
    .line 434
    new-instance v5, Ljava/util/ArrayList;

    .line 435
    .line 436
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 440
    .line 441
    .line 442
    :cond_23
    iget-object v1, v2, Landroidx/media3/common/r0;->I:Landroid/os/Bundle;

    .line 443
    .line 444
    if-eqz v1, :cond_24

    .line 445
    .line 446
    sget-object v2, Landroidx/media3/common/r0;->t0:Ljava/lang/String;

    .line 447
    .line 448
    invoke-virtual {v3, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 449
    .line 450
    .line 451
    :cond_24
    sget-object v1, Landroidx/media3/common/o0;->j:Ljava/lang/String;

    .line 452
    .line 453
    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 454
    .line 455
    .line 456
    :cond_25
    sget-object v1, Landroidx/media3/common/d0;->h:Landroidx/media3/common/d0;

    .line 457
    .line 458
    iget-object v2, p0, Landroidx/media3/common/o0;->e:Landroidx/media3/common/e0;

    .line 459
    .line 460
    invoke-virtual {v2, v1}, Landroidx/media3/common/d0;->equals(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v3

    .line 464
    if-nez v3, :cond_2d

    .line 465
    .line 466
    new-instance v3, Landroid/os/Bundle;

    .line 467
    .line 468
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 469
    .line 470
    .line 471
    iget-wide v4, v2, Landroidx/media3/common/d0;->a:J

    .line 472
    .line 473
    iget-wide v6, v1, Landroidx/media3/common/d0;->a:J

    .line 474
    .line 475
    cmp-long v6, v4, v6

    .line 476
    .line 477
    if-eqz v6, :cond_26

    .line 478
    .line 479
    sget-object v6, Landroidx/media3/common/d0;->i:Ljava/lang/String;

    .line 480
    .line 481
    invoke-virtual {v3, v6, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 482
    .line 483
    .line 484
    :cond_26
    iget-wide v4, v2, Landroidx/media3/common/d0;->c:J

    .line 485
    .line 486
    iget-wide v6, v1, Landroidx/media3/common/d0;->c:J

    .line 487
    .line 488
    cmp-long v6, v4, v6

    .line 489
    .line 490
    if-eqz v6, :cond_27

    .line 491
    .line 492
    sget-object v6, Landroidx/media3/common/d0;->j:Ljava/lang/String;

    .line 493
    .line 494
    invoke-virtual {v3, v6, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 495
    .line 496
    .line 497
    :cond_27
    iget-wide v4, v2, Landroidx/media3/common/d0;->b:J

    .line 498
    .line 499
    iget-wide v6, v1, Landroidx/media3/common/d0;->b:J

    .line 500
    .line 501
    cmp-long v6, v4, v6

    .line 502
    .line 503
    if-eqz v6, :cond_28

    .line 504
    .line 505
    sget-object v6, Landroidx/media3/common/d0;->n:Ljava/lang/String;

    .line 506
    .line 507
    invoke-virtual {v3, v6, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 508
    .line 509
    .line 510
    :cond_28
    iget-wide v4, v2, Landroidx/media3/common/d0;->d:J

    .line 511
    .line 512
    iget-wide v6, v1, Landroidx/media3/common/d0;->d:J

    .line 513
    .line 514
    cmp-long v6, v4, v6

    .line 515
    .line 516
    if-eqz v6, :cond_29

    .line 517
    .line 518
    sget-object v6, Landroidx/media3/common/d0;->o:Ljava/lang/String;

    .line 519
    .line 520
    invoke-virtual {v3, v6, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 521
    .line 522
    .line 523
    :cond_29
    iget-boolean v4, v2, Landroidx/media3/common/d0;->e:Z

    .line 524
    .line 525
    iget-boolean v5, v1, Landroidx/media3/common/d0;->e:Z

    .line 526
    .line 527
    if-eq v4, v5, :cond_2a

    .line 528
    .line 529
    sget-object v5, Landroidx/media3/common/d0;->k:Ljava/lang/String;

    .line 530
    .line 531
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 532
    .line 533
    .line 534
    :cond_2a
    iget-boolean v4, v2, Landroidx/media3/common/d0;->f:Z

    .line 535
    .line 536
    iget-boolean v5, v1, Landroidx/media3/common/d0;->f:Z

    .line 537
    .line 538
    if-eq v4, v5, :cond_2b

    .line 539
    .line 540
    sget-object v5, Landroidx/media3/common/d0;->l:Ljava/lang/String;

    .line 541
    .line 542
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 543
    .line 544
    .line 545
    :cond_2b
    iget-boolean v2, v2, Landroidx/media3/common/d0;->g:Z

    .line 546
    .line 547
    iget-boolean v1, v1, Landroidx/media3/common/d0;->g:Z

    .line 548
    .line 549
    if-eq v2, v1, :cond_2c

    .line 550
    .line 551
    sget-object v1, Landroidx/media3/common/d0;->m:Ljava/lang/String;

    .line 552
    .line 553
    invoke-virtual {v3, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 554
    .line 555
    .line 556
    :cond_2c
    sget-object v1, Landroidx/media3/common/o0;->k:Ljava/lang/String;

    .line 557
    .line 558
    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 559
    .line 560
    .line 561
    :cond_2d
    sget-object v1, Landroidx/media3/common/k0;->d:Landroidx/media3/common/k0;

    .line 562
    .line 563
    iget-object v2, p0, Landroidx/media3/common/o0;->f:Landroidx/media3/common/k0;

    .line 564
    .line 565
    invoke-virtual {v2, v1}, Landroidx/media3/common/k0;->equals(Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    move-result v1

    .line 569
    if-nez v1, :cond_31

    .line 570
    .line 571
    new-instance v1, Landroid/os/Bundle;

    .line 572
    .line 573
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 574
    .line 575
    .line 576
    iget-object v3, v2, Landroidx/media3/common/k0;->a:Landroid/net/Uri;

    .line 577
    .line 578
    if-eqz v3, :cond_2e

    .line 579
    .line 580
    sget-object v4, Landroidx/media3/common/k0;->e:Ljava/lang/String;

    .line 581
    .line 582
    invoke-virtual {v1, v4, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 583
    .line 584
    .line 585
    :cond_2e
    iget-object v3, v2, Landroidx/media3/common/k0;->b:Ljava/lang/String;

    .line 586
    .line 587
    if-eqz v3, :cond_2f

    .line 588
    .line 589
    sget-object v4, Landroidx/media3/common/k0;->f:Ljava/lang/String;

    .line 590
    .line 591
    invoke-virtual {v1, v4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    :cond_2f
    iget-object v2, v2, Landroidx/media3/common/k0;->c:Landroid/os/Bundle;

    .line 595
    .line 596
    if-eqz v2, :cond_30

    .line 597
    .line 598
    sget-object v3, Landroidx/media3/common/k0;->g:Ljava/lang/String;

    .line 599
    .line 600
    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 601
    .line 602
    .line 603
    :cond_30
    sget-object v2, Landroidx/media3/common/o0;->l:Ljava/lang/String;

    .line 604
    .line 605
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 606
    .line 607
    .line 608
    :cond_31
    if-eqz p1, :cond_41

    .line 609
    .line 610
    iget-object p1, p0, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 611
    .line 612
    if-eqz p1, :cond_41

    .line 613
    .line 614
    iget-object v1, p1, Landroidx/media3/common/j0;->g:Lf6/m0;

    .line 615
    .line 616
    iget-object v2, p1, Landroidx/media3/common/j0;->e:Ljava/util/List;

    .line 617
    .line 618
    new-instance v3, Landroid/os/Bundle;

    .line 619
    .line 620
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 621
    .line 622
    .line 623
    sget-object v4, Landroidx/media3/common/j0;->j:Ljava/lang/String;

    .line 624
    .line 625
    iget-object v5, p1, Landroidx/media3/common/j0;->a:Landroid/net/Uri;

    .line 626
    .line 627
    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 628
    .line 629
    .line 630
    iget-object v4, p1, Landroidx/media3/common/j0;->b:Ljava/lang/String;

    .line 631
    .line 632
    if-eqz v4, :cond_32

    .line 633
    .line 634
    sget-object v5, Landroidx/media3/common/j0;->k:Ljava/lang/String;

    .line 635
    .line 636
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 637
    .line 638
    .line 639
    :cond_32
    iget-object v4, p1, Landroidx/media3/common/j0;->c:Landroidx/media3/common/g0;

    .line 640
    .line 641
    if-eqz v4, :cond_3b

    .line 642
    .line 643
    sget-object v5, Landroidx/media3/common/j0;->l:Ljava/lang/String;

    .line 644
    .line 645
    iget-object v6, v4, Landroidx/media3/common/g0;->g:Lf6/m0;

    .line 646
    .line 647
    iget-object v7, v4, Landroidx/media3/common/g0;->c:Lf6/q0;

    .line 648
    .line 649
    new-instance v8, Landroid/os/Bundle;

    .line 650
    .line 651
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 652
    .line 653
    .line 654
    sget-object v9, Landroidx/media3/common/g0;->i:Ljava/lang/String;

    .line 655
    .line 656
    iget-object v10, v4, Landroidx/media3/common/g0;->a:Ljava/util/UUID;

    .line 657
    .line 658
    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object v10

    .line 662
    invoke-virtual {v8, v9, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 663
    .line 664
    .line 665
    iget-object v9, v4, Landroidx/media3/common/g0;->b:Landroid/net/Uri;

    .line 666
    .line 667
    if-eqz v9, :cond_33

    .line 668
    .line 669
    sget-object v10, Landroidx/media3/common/g0;->j:Ljava/lang/String;

    .line 670
    .line 671
    invoke-virtual {v8, v10, v9}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 672
    .line 673
    .line 674
    :cond_33
    invoke-virtual {v7}, Lf6/q0;->isEmpty()Z

    .line 675
    .line 676
    .line 677
    move-result v9

    .line 678
    if-nez v9, :cond_35

    .line 679
    .line 680
    sget-object v9, Landroidx/media3/common/g0;->k:Ljava/lang/String;

    .line 681
    .line 682
    new-instance v10, Landroid/os/Bundle;

    .line 683
    .line 684
    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v7}, Lf6/q0;->b()Lf6/w0;

    .line 688
    .line 689
    .line 690
    move-result-object v7

    .line 691
    check-cast v7, Lf6/n1;

    .line 692
    .line 693
    invoke-virtual {v7}, Lf6/n1;->g()Lf6/z1;

    .line 694
    .line 695
    .line 696
    move-result-object v7

    .line 697
    :goto_0
    move-object v11, v7

    .line 698
    check-cast v11, Lf6/a;

    .line 699
    .line 700
    invoke-virtual {v11}, Lf6/a;->hasNext()Z

    .line 701
    .line 702
    .line 703
    move-result v12

    .line 704
    if-eqz v12, :cond_34

    .line 705
    .line 706
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    move-result-object v11

    .line 710
    check-cast v11, Ljava/util/Map$Entry;

    .line 711
    .line 712
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v12

    .line 716
    check-cast v12, Ljava/lang/String;

    .line 717
    .line 718
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v11

    .line 722
    check-cast v11, Ljava/lang/String;

    .line 723
    .line 724
    invoke-virtual {v10, v12, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 725
    .line 726
    .line 727
    goto :goto_0

    .line 728
    :cond_34
    invoke-virtual {v8, v9, v10}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 729
    .line 730
    .line 731
    :cond_35
    iget-boolean v7, v4, Landroidx/media3/common/g0;->d:Z

    .line 732
    .line 733
    if-eqz v7, :cond_36

    .line 734
    .line 735
    sget-object v9, Landroidx/media3/common/g0;->l:Ljava/lang/String;

    .line 736
    .line 737
    invoke-virtual {v8, v9, v7}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 738
    .line 739
    .line 740
    :cond_36
    iget-boolean v7, v4, Landroidx/media3/common/g0;->e:Z

    .line 741
    .line 742
    if-eqz v7, :cond_37

    .line 743
    .line 744
    sget-object v9, Landroidx/media3/common/g0;->m:Ljava/lang/String;

    .line 745
    .line 746
    invoke-virtual {v8, v9, v7}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 747
    .line 748
    .line 749
    :cond_37
    iget-boolean v7, v4, Landroidx/media3/common/g0;->f:Z

    .line 750
    .line 751
    if-eqz v7, :cond_38

    .line 752
    .line 753
    sget-object v9, Landroidx/media3/common/g0;->n:Ljava/lang/String;

    .line 754
    .line 755
    invoke-virtual {v8, v9, v7}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 756
    .line 757
    .line 758
    :cond_38
    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 759
    .line 760
    .line 761
    move-result v7

    .line 762
    if-nez v7, :cond_39

    .line 763
    .line 764
    sget-object v7, Landroidx/media3/common/g0;->o:Ljava/lang/String;

    .line 765
    .line 766
    new-instance v9, Ljava/util/ArrayList;

    .line 767
    .line 768
    invoke-direct {v9, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v8, v7, v9}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 772
    .line 773
    .line 774
    :cond_39
    iget-object v4, v4, Landroidx/media3/common/g0;->h:[B

    .line 775
    .line 776
    if-eqz v4, :cond_3a

    .line 777
    .line 778
    sget-object v6, Landroidx/media3/common/g0;->p:Ljava/lang/String;

    .line 779
    .line 780
    invoke-virtual {v8, v6, v4}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 781
    .line 782
    .line 783
    :cond_3a
    invoke-virtual {v3, v5, v8}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 784
    .line 785
    .line 786
    :cond_3b
    iget-object v4, p1, Landroidx/media3/common/j0;->d:Landroidx/media3/common/a0;

    .line 787
    .line 788
    if-eqz v4, :cond_3c

    .line 789
    .line 790
    sget-object v5, Landroidx/media3/common/j0;->m:Ljava/lang/String;

    .line 791
    .line 792
    new-instance v6, Landroid/os/Bundle;

    .line 793
    .line 794
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 795
    .line 796
    .line 797
    sget-object v7, Landroidx/media3/common/a0;->b:Ljava/lang/String;

    .line 798
    .line 799
    iget-object v4, v4, Landroidx/media3/common/a0;->a:Landroid/net/Uri;

    .line 800
    .line 801
    invoke-virtual {v6, v7, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 802
    .line 803
    .line 804
    invoke-virtual {v3, v5, v6}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 805
    .line 806
    .line 807
    :cond_3c
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 808
    .line 809
    .line 810
    move-result v4

    .line 811
    if-nez v4, :cond_3d

    .line 812
    .line 813
    sget-object v4, Landroidx/media3/common/j0;->n:Ljava/lang/String;

    .line 814
    .line 815
    new-instance v5, Landroidx/media3/common/n;

    .line 816
    .line 817
    const/4 v6, 0x3

    .line 818
    invoke-direct {v5, v6}, Landroidx/media3/common/n;-><init>(I)V

    .line 819
    .line 820
    .line 821
    invoke-static {v2, v5}, Lh1/a;->E(Ljava/util/Collection;Le6/d;)Ljava/util/ArrayList;

    .line 822
    .line 823
    .line 824
    move-result-object v2

    .line 825
    invoke-virtual {v3, v4, v2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 826
    .line 827
    .line 828
    :cond_3d
    iget-object v2, p1, Landroidx/media3/common/j0;->f:Ljava/lang/String;

    .line 829
    .line 830
    if-eqz v2, :cond_3e

    .line 831
    .line 832
    sget-object v4, Landroidx/media3/common/j0;->o:Ljava/lang/String;

    .line 833
    .line 834
    invoke-virtual {v3, v4, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 835
    .line 836
    .line 837
    :cond_3e
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 838
    .line 839
    .line 840
    move-result v2

    .line 841
    if-nez v2, :cond_3f

    .line 842
    .line 843
    sget-object v2, Landroidx/media3/common/j0;->p:Ljava/lang/String;

    .line 844
    .line 845
    new-instance v4, Landroidx/media3/common/n;

    .line 846
    .line 847
    const/4 v5, 0x4

    .line 848
    invoke-direct {v4, v5}, Landroidx/media3/common/n;-><init>(I)V

    .line 849
    .line 850
    .line 851
    invoke-static {v1, v4}, Lh1/a;->E(Ljava/util/Collection;Le6/d;)Ljava/util/ArrayList;

    .line 852
    .line 853
    .line 854
    move-result-object v1

    .line 855
    invoke-virtual {v3, v2, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 856
    .line 857
    .line 858
    :cond_3f
    iget-wide v1, p1, Landroidx/media3/common/j0;->i:J

    .line 859
    .line 860
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    cmp-long p1, v1, v4

    .line 866
    .line 867
    if-eqz p1, :cond_40

    .line 868
    .line 869
    sget-object p1, Landroidx/media3/common/j0;->q:Ljava/lang/String;

    .line 870
    .line 871
    invoke-virtual {v3, p1, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 872
    .line 873
    .line 874
    :cond_40
    sget-object p1, Landroidx/media3/common/o0;->m:Ljava/lang/String;

    .line 875
    .line 876
    invoke-virtual {v0, p1, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 877
    .line 878
    .line 879
    :cond_41
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Landroidx/media3/common/o0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Landroidx/media3/common/o0;

    .line 10
    .line 11
    iget-object v0, p1, Landroidx/media3/common/o0;->a:Ljava/lang/String;

    .line 12
    .line 13
    sget v1, Lh1/i0;->a:I

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/media3/common/o0;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/media3/common/o0;->e:Landroidx/media3/common/e0;

    .line 24
    .line 25
    iget-object v1, p1, Landroidx/media3/common/o0;->e:Landroidx/media3/common/e0;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroidx/media3/common/d0;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 34
    .line 35
    iget-object v1, p1, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 36
    .line 37
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-object v0, p0, Landroidx/media3/common/o0;->c:Landroidx/media3/common/i0;

    .line 44
    .line 45
    iget-object v1, p1, Landroidx/media3/common/o0;->c:Landroidx/media3/common/i0;

    .line 46
    .line 47
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    iget-object v0, p0, Landroidx/media3/common/o0;->d:Landroidx/media3/common/r0;

    .line 54
    .line 55
    iget-object v1, p1, Landroidx/media3/common/o0;->d:Landroidx/media3/common/r0;

    .line 56
    .line 57
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    iget-object v0, p0, Landroidx/media3/common/o0;->f:Landroidx/media3/common/k0;

    .line 64
    .line 65
    iget-object p1, p1, Landroidx/media3/common/o0;->f:Landroidx/media3/common/k0;

    .line 66
    .line 67
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_2

    .line 72
    .line 73
    :goto_0
    const/4 p1, 0x1

    .line 74
    return p1

    .line 75
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 76
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/common/o0;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/media3/common/o0;->b:Landroidx/media3/common/j0;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Landroidx/media3/common/j0;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    add-int/2addr v0, v1

    .line 20
    mul-int/lit8 v0, v0, 0x1f

    .line 21
    .line 22
    iget-object v1, p0, Landroidx/media3/common/o0;->c:Landroidx/media3/common/i0;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroidx/media3/common/i0;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/2addr v1, v0

    .line 29
    mul-int/lit8 v1, v1, 0x1f

    .line 30
    .line 31
    iget-object v0, p0, Landroidx/media3/common/o0;->e:Landroidx/media3/common/e0;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroidx/media3/common/d0;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v0, v1

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/media3/common/o0;->d:Landroidx/media3/common/r0;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroidx/media3/common/r0;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/2addr v1, v0

    .line 47
    mul-int/lit8 v1, v1, 0x1f

    .line 48
    .line 49
    iget-object v0, p0, Landroidx/media3/common/o0;->f:Landroidx/media3/common/k0;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroidx/media3/common/k0;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    add-int/2addr v0, v1

    .line 56
    return v0
.end method
