.class public final Le4/y;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Le4/s;
.implements Lm4/a;
.implements Lw2/h0;


# instance fields
.field public final synthetic j:I

.field public final k:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Le4/y;->j:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    iput-object p1, p0, Le4/y;->k:Landroid/content/res/Resources;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/res/Resources;I)V
    .locals 0

    .line 1
    iput p2, p0, Le4/y;->j:I

    iput-object p1, p0, Le4/y;->k:Landroid/content/res/Resources;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/media3/common/w;)Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p1, Landroidx/media3/common/w;->d:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p1, Landroidx/media3/common/w;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const-string v3, ""

    .line 10
    .line 11
    if-nez v2, :cond_2

    .line 12
    .line 13
    const-string v2, "und"

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-static {v0}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget v2, Lh1/i0;->a:I

    .line 27
    .line 28
    const/16 v4, 0x18

    .line 29
    .line 30
    if-lt v2, v4, :cond_1

    .line 31
    .line 32
    sget-object v2, Ljava/util/Locale$Category;->DISPLAY:Ljava/util/Locale$Category;

    .line 33
    .line 34
    invoke-static {v2}, Ljava/util/Locale;->getDefault(Ljava/util/Locale$Category;)Ljava/util/Locale;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    :goto_0
    invoke-virtual {v0, v2}, Ljava/util/Locale;->getDisplayName(Ljava/util/Locale;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_3

    .line 52
    .line 53
    :cond_2
    :goto_1
    move-object v0, v3

    .line 54
    goto :goto_2

    .line 55
    :cond_3
    const/4 v4, 0x1

    .line 56
    const/4 v5, 0x0

    .line 57
    :try_start_0
    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->offsetByCodePoints(II)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    new-instance v6, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual {v5, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    :catch_0
    :goto_2
    invoke-virtual {p0, p1}, Le4/y;->b(Landroidx/media3/common/w;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    filled-new-array {v0, p1}, [Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p0, p1}, Le4/y;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_5

    .line 105
    .line 106
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_4

    .line 111
    .line 112
    move-object v1, v3

    .line 113
    :cond_4
    move-object p1, v1

    .line 114
    :cond_5
    return-object p1
.end method

.method public b(Landroidx/media3/common/w;)Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p1, Landroidx/media3/common/w;->f:I

    .line 2
    .line 3
    iget p1, p1, Landroidx/media3/common/w;->f:I

    .line 4
    .line 5
    and-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    iget-object v1, p0, Le4/y;->k:Landroid/content/res/Resources;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const v0, 0x7f110071

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v0, ""

    .line 20
    .line 21
    :goto_0
    and-int/lit8 v2, p1, 0x4

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    const v2, 0x7f110074

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p0, v0}, Le4/y;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :cond_1
    and-int/lit8 v2, p1, 0x8

    .line 41
    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    const v2, 0x7f110073

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p0, v0}, Le4/y;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :cond_2
    and-int/lit16 p1, p1, 0x440

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    const p1, 0x7f110072

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    filled-new-array {v0, p1}, [Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p0, p1}, Le4/y;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :cond_3
    return-object v0
.end method

.method public c(Landroidx/media3/common/w;)Ljava/lang/String;
    .locals 12

    .line 1
    iget-object v0, p1, Landroidx/media3/common/w;->n:Ljava/lang/String;

    .line 2
    .line 3
    iget v1, p1, Landroidx/media3/common/w;->j:I

    .line 4
    .line 5
    iget v2, p1, Landroidx/media3/common/w;->C:I

    .line 6
    .line 7
    iget v3, p1, Landroidx/media3/common/w;->v:I

    .line 8
    .line 9
    iget v4, p1, Landroidx/media3/common/w;->u:I

    .line 10
    .line 11
    iget-object v5, p1, Landroidx/media3/common/w;->k:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v0}, Landroidx/media3/common/u0;->i(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v6, 0x1

    .line 18
    const/4 v7, 0x2

    .line 19
    const/4 v8, -0x1

    .line 20
    if-eq v0, v8, :cond_0

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    invoke-static {v5}, Landroidx/media3/common/u0;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    :cond_1
    :goto_0
    move v0, v7

    .line 30
    goto :goto_2

    .line 31
    :cond_2
    invoke-static {v5}, Landroidx/media3/common/u0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    :cond_3
    :goto_1
    move v0, v6

    .line 38
    goto :goto_2

    .line 39
    :cond_4
    if-ne v4, v8, :cond_1

    .line 40
    .line 41
    if-eq v3, v8, :cond_5

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_5
    if-ne v2, v8, :cond_3

    .line 45
    .line 46
    iget v0, p1, Landroidx/media3/common/w;->D:I

    .line 47
    .line 48
    if-eq v0, v8, :cond_6

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_6
    move v0, v8

    .line 52
    :goto_2
    const v5, 0x49742400    # 1000000.0f

    .line 53
    .line 54
    .line 55
    const v9, 0x7f11006e

    .line 56
    .line 57
    .line 58
    const-string v10, ""

    .line 59
    .line 60
    iget-object v11, p0, Le4/y;->k:Landroid/content/res/Resources;

    .line 61
    .line 62
    if-ne v0, v7, :cond_a

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Le4/y;->b(Landroidx/media3/common/w;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-eq v4, v8, :cond_8

    .line 69
    .line 70
    if-ne v3, v8, :cond_7

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_7
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    const v3, 0x7f110070

    .line 86
    .line 87
    .line 88
    invoke-virtual {v11, v3, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    goto :goto_4

    .line 93
    :cond_8
    :goto_3
    move-object v2, v10

    .line 94
    :goto_4
    if-ne v1, v8, :cond_9

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_9
    int-to-float v1, v1

    .line 98
    div-float/2addr v1, v5

    .line 99
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v11, v9, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    :goto_5
    filled-new-array {v0, v2, v10}, [Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {p0, v0}, Le4/y;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    goto :goto_9

    .line 120
    :cond_a
    if-ne v0, v6, :cond_12

    .line 121
    .line 122
    invoke-virtual {p0, p1}, Le4/y;->a(Landroidx/media3/common/w;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    if-eq v2, v8, :cond_10

    .line 127
    .line 128
    if-ge v2, v6, :cond_b

    .line 129
    .line 130
    goto :goto_6

    .line 131
    :cond_b
    if-eq v2, v6, :cond_f

    .line 132
    .line 133
    if-eq v2, v7, :cond_e

    .line 134
    .line 135
    const/4 v3, 0x6

    .line 136
    if-eq v2, v3, :cond_d

    .line 137
    .line 138
    const/4 v3, 0x7

    .line 139
    if-eq v2, v3, :cond_d

    .line 140
    .line 141
    const/16 v3, 0x8

    .line 142
    .line 143
    if-eq v2, v3, :cond_c

    .line 144
    .line 145
    const v2, 0x7f110079

    .line 146
    .line 147
    .line 148
    invoke-virtual {v11, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    goto :goto_7

    .line 153
    :cond_c
    const v2, 0x7f11007b

    .line 154
    .line 155
    .line 156
    invoke-virtual {v11, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    goto :goto_7

    .line 161
    :cond_d
    const v2, 0x7f11007a

    .line 162
    .line 163
    .line 164
    invoke-virtual {v11, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    goto :goto_7

    .line 169
    :cond_e
    const v2, 0x7f110078

    .line 170
    .line 171
    .line 172
    invoke-virtual {v11, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    goto :goto_7

    .line 177
    :cond_f
    const v2, 0x7f11006f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v11, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    goto :goto_7

    .line 185
    :cond_10
    :goto_6
    move-object v2, v10

    .line 186
    :goto_7
    if-ne v1, v8, :cond_11

    .line 187
    .line 188
    goto :goto_8

    .line 189
    :cond_11
    int-to-float v1, v1

    .line 190
    div-float/2addr v1, v5

    .line 191
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-virtual {v11, v9, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v10

    .line 203
    :goto_8
    filled-new-array {v0, v2, v10}, [Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {p0, v0}, Le4/y;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    goto :goto_9

    .line 212
    :cond_12
    invoke-virtual {p0, p1}, Le4/y;->a(Landroidx/media3/common/w;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    :goto_9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    if-eqz v1, :cond_13

    .line 221
    .line 222
    return-object v0

    .line 223
    :cond_13
    iget-object p1, p1, Landroidx/media3/common/w;->d:Ljava/lang/String;

    .line 224
    .line 225
    if-eqz p1, :cond_15

    .line 226
    .line 227
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-eqz v0, :cond_14

    .line 236
    .line 237
    goto :goto_a

    .line 238
    :cond_14
    const v0, 0x7f11007d

    .line 239
    .line 240
    .line 241
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    invoke-virtual {v11, v0, p1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    return-object p1

    .line 250
    :cond_15
    :goto_a
    const p1, 0x7f11007c

    .line 251
    .line 252
    .line 253
    invoke-virtual {v11, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    return-object p1
.end method

.method public d(La4/f0;Ly3/h;)La4/f0;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    new-instance p2, Lh4/c;

    .line 6
    .line 7
    iget-object v0, p0, Le4/y;->k:Landroid/content/res/Resources;

    .line 8
    .line 9
    invoke-direct {p2, v0, p1}, Lh4/c;-><init>(Landroid/content/res/Resources;La4/f0;)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method

.method public varargs e([Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    array-length v0, p1

    .line 2
    const-string v1, ""

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v0, :cond_2

    .line 6
    .line 7
    aget-object v3, p1, v2

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-lez v4, :cond_1

    .line 14
    .line 15
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    move-object v1, v3

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    const v4, 0x7f11006d

    .line 24
    .line 25
    .line 26
    filled-new-array {v1, v3}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v3, p0, Le4/y;->k:Landroid/content/res/Resources;

    .line 31
    .line 32
    invoke-virtual {v3, v4, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    return-object v1
.end method

.method public g(Le4/x;)Le4/r;
    .locals 3

    .line 1
    iget v0, p0, Le4/y;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Le4/b;

    .line 7
    .line 8
    iget-object v0, p0, Le4/y;->k:Landroid/content/res/Resources;

    .line 9
    .line 10
    sget-object v1, Le4/b0;->b:Le4/b0;

    .line 11
    .line 12
    invoke-direct {p1, v0, v1}, Le4/b;-><init>(Landroid/content/res/Resources;Le4/r;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    new-instance v0, Le4/b;

    .line 17
    .line 18
    const-class v1, Landroid/net/Uri;

    .line 19
    .line 20
    const-class v2, Ljava/io/InputStream;

    .line 21
    .line 22
    invoke-virtual {p1, v1, v2}, Le4/x;->a(Ljava/lang/Class;Ljava/lang/Class;)Le4/r;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object v1, p0, Le4/y;->k:Landroid/content/res/Resources;

    .line 27
    .line 28
    invoke-direct {v0, v1, p1}, Le4/b;-><init>(Landroid/content/res/Resources;Le4/r;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_1
    new-instance v0, Le4/b;

    .line 33
    .line 34
    const-class v1, Landroid/net/Uri;

    .line 35
    .line 36
    const-class v2, Landroid/content/res/AssetFileDescriptor;

    .line 37
    .line 38
    invoke-virtual {p1, v1, v2}, Le4/x;->a(Ljava/lang/Class;Ljava/lang/Class;)Le4/r;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object v1, p0, Le4/y;->k:Landroid/content/res/Resources;

    .line 43
    .line 44
    invoke-direct {v0, v1, p1}, Le4/b;-><init>(Landroid/content/res/Resources;Le4/r;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
