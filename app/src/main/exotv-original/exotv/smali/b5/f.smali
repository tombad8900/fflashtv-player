.class public final Lb5/f;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final a:Lb5/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lb5/f;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lb5/f;->a:Lb5/f;

    .line 7
    .line 8
    return-void
.end method

.method public static final a(Ljava/lang/String;Lr6/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lb5/f;->a:Lb5/f;

    .line 2
    .line 3
    instance-of v1, p1, Lb5/e;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Lb5/e;

    .line 9
    .line 10
    iget v2, v1, Lb5/e;->p:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lb5/e;->p:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lb5/e;

    .line 23
    .line 24
    invoke-direct {v1, p1}, Lr6/c;-><init>(Lp6/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v1, Lb5/e;->o:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lq6/a;->j:Lq6/a;

    .line 30
    .line 31
    iget v3, v1, Lb5/e;->p:I

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x1

    .line 35
    const/4 v6, 0x0

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    if-ne v3, v5, :cond_1

    .line 39
    .line 40
    iget-object p0, v1, Lb5/e;->n:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v0, v1, Lb5/e;->m:Lb5/f;

    .line 43
    .line 44
    :try_start_0
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_2
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :try_start_1
    iput-object v0, v1, Lb5/e;->m:Lb5/f;

    .line 60
    .line 61
    iput-object p0, v1, Lb5/e;->n:Ljava/lang/String;

    .line 62
    .line 63
    iput v5, v1, Lb5/e;->p:I

    .line 64
    .line 65
    sget-object p1, Lb5/h;->a:Lb5/i;

    .line 66
    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    sget-object p1, Li7/e0;->a:Lo7/e;

    .line 71
    .line 72
    sget-object p1, Lo7/d;->l:Lo7/d;

    .line 73
    .line 74
    new-instance v3, Lb5/g;

    .line 75
    .line 76
    invoke-direct {v3, v4, v6}, Lr6/h;-><init>(ILp6/c;)V

    .line 77
    .line 78
    .line 79
    invoke-static {p1, v3, v1}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    :goto_1
    if-ne p1, v2, :cond_4

    .line 84
    .line 85
    return-object v2

    .line 86
    :cond_4
    :goto_2
    check-cast p1, Lb5/i;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-static {p1}, Lb5/f;->b(Lb5/i;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_5

    .line 100
    .line 101
    goto/16 :goto_7

    .line 102
    .line 103
    :cond_5
    const/16 v1, 0x3f

    .line 104
    .line 105
    invoke-static {p0, v1}, Lh7/h;->v0(Ljava/lang/CharSequence;C)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_6

    .line 110
    .line 111
    const/16 v1, 0x26

    .line 112
    .line 113
    :cond_6
    new-instance v2, Lokhttp3/g0$a;

    .line 114
    .line 115
    invoke-direct {v2}, Lokhttp3/g0$a;-><init>()V

    .line 116
    .line 117
    .line 118
    int-to-char v1, v1

    .line 119
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 120
    .line 121
    .line 122
    move-result-wide v7

    .line 123
    new-instance v3, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string p0, "_="

    .line 138
    .line 139
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-virtual {v2, p0}, Lokhttp3/g0$a;->url(Ljava/lang/String;)Lokhttp3/g0$a;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    iget-object v0, p1, Lb5/i;->n:Ljava/lang/Object;

    .line 154
    .line 155
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-nez v0, :cond_7

    .line 160
    .line 161
    iget-object p1, p1, Lb5/i;->n:Ljava/lang/Object;

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_7
    iget-object p1, p1, Lb5/i;->j:Ljava/lang/Object;

    .line 165
    .line 166
    :goto_3
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-eqz v0, :cond_8

    .line 179
    .line 180
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    check-cast v0, Ljava/util/Map$Entry;

    .line 185
    .line 186
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    check-cast v1, Ljava/lang/String;

    .line 191
    .line 192
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, Ljava/lang/String;

    .line 197
    .line 198
    invoke-virtual {p0, v1, v0}, Lokhttp3/g0$a;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/g0$a;

    .line 199
    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_8
    invoke-virtual {p0}, Lokhttp3/g0$a;->build()Lokhttp3/g0;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    sget-object p1, Lb5/m;->a:Lokhttp3/e0;

    .line 207
    .line 208
    invoke-virtual {p1, p0}, Lokhttp3/e0;->newCall(Lokhttp3/g0;)Lokhttp3/g;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    invoke-interface {p0}, Lokhttp3/g;->execute()Lokhttp3/i0;

    .line 213
    .line 214
    .line 215
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 216
    :try_start_2
    new-instance p1, Lb5/j;

    .line 217
    .line 218
    invoke-virtual {p0}, Lokhttp3/i0;->body()Lokhttp3/j0;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    if-eqz v0, :cond_9

    .line 223
    .line 224
    invoke-virtual {v0}, Lokhttp3/j0;->string()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    goto :goto_5

    .line 229
    :catchall_0
    move-exception p1

    .line 230
    goto :goto_6

    .line 231
    :cond_9
    move-object v0, v6

    .line 232
    :goto_5
    if-nez v0, :cond_a

    .line 233
    .line 234
    const-string v0, ""

    .line 235
    .line 236
    :cond_a
    const-string v1, "t"

    .line 237
    .line 238
    invoke-static {p0, v1, v6, v4, v6}, Lokhttp3/i0;->header$default(Lokhttp3/i0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-direct {p1, v0, v1}, Lb5/j;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 243
    .line 244
    .line 245
    :try_start_3
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 246
    .line 247
    .line 248
    return-object p1

    .line 249
    :goto_6
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 250
    :catchall_1
    move-exception v0

    .line 251
    :try_start_5
    invoke-static {p0, p1}, Lt5/a;->b(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 252
    .line 253
    .line 254
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 255
    :catchall_2
    :goto_7
    return-object v6
.end method

.method public static b(Lb5/i;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "cfg"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb5/i;->m:Ljava/lang/String;

    .line 7
    .line 8
    const-string v1, ""

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-static {v0}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    if-nez v0, :cond_4

    .line 22
    .line 23
    :cond_1
    iget-object p0, p0, Lb5/i;->i:Ljava/lang/String;

    .line 24
    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    invoke-static {p0}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    move-object v2, p0

    .line 34
    :cond_2
    if-nez v2, :cond_3

    .line 35
    .line 36
    move-object v0, v1

    .line 37
    goto :goto_1

    .line 38
    :cond_3
    move-object v0, v2

    .line 39
    :cond_4
    :goto_1
    invoke-static {v0}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const/4 v0, 0x1

    .line 48
    new-array v0, v0, [C

    .line 49
    .line 50
    const/16 v2, 0x2f

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    aput-char v2, v0, v3

    .line 54
    .line 55
    invoke-static {p0, v0}, Lh7/h;->T0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_5

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_5
    const-string v0, "/api"

    .line 67
    .line 68
    const/4 v1, 0x6

    .line 69
    invoke-static {p0, v0, v3, v3, v1}, Lh7/h;->B0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-lez v0, :cond_6

    .line 74
    .line 75
    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    const-string v0, "substring(...)"

    .line 80
    .line 81
    invoke-static {v0, p0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_6
    return-object p0
.end method
