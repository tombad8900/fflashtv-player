.class public final Landroidx/lifecycle/x;
.super Landroidx/lifecycle/o;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final k:Z

.field public l:Lo/a;

.field public m:Landroidx/lifecycle/n;

.field public final n:Ljava/lang/ref/WeakReference;

.field public o:I

.field public p:Z

.field public q:Z

.field public final r:Ljava/util/ArrayList;

.field public final s:Lk7/a;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/v;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroidx/lifecycle/o;-><init>(I)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Landroidx/lifecycle/x;->k:Z

    .line 7
    .line 8
    new-instance v0, Lo/a;

    .line 9
    .line 10
    invoke-direct {v0}, Lo/a;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Landroidx/lifecycle/x;->l:Lo/a;

    .line 14
    .line 15
    sget-object v0, Landroidx/lifecycle/n;->k:Landroidx/lifecycle/n;

    .line 16
    .line 17
    iput-object v0, p0, Landroidx/lifecycle/x;->m:Landroidx/lifecycle/n;

    .line 18
    .line 19
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Landroidx/lifecycle/x;->r:Ljava/util/ArrayList;

    .line 25
    .line 26
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 27
    .line 28
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Landroidx/lifecycle/x;->n:Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    new-instance p1, Lk7/a;

    .line 34
    .line 35
    invoke-direct {p1, v0}, Lk7/a;-><init>(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Landroidx/lifecycle/x;->s:Lk7/a;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/u;)V
    .locals 9

    .line 1
    const-string v0, "observer"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "addObserver"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/lifecycle/x;->k(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/lifecycle/x;->m:Landroidx/lifecycle/n;

    .line 12
    .line 13
    sget-object v1, Landroidx/lifecycle/n;->j:Landroidx/lifecycle/n;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v1, Landroidx/lifecycle/n;->k:Landroidx/lifecycle/n;

    .line 19
    .line 20
    :goto_0
    new-instance v0, Landroidx/lifecycle/w;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sget-object v2, Landroidx/lifecycle/y;->a:Ljava/util/HashMap;

    .line 26
    .line 27
    instance-of v2, p1, Landroidx/lifecycle/t;

    .line 28
    .line 29
    instance-of v3, p1, Landroidx/lifecycle/d;

    .line 30
    .line 31
    const/4 v4, 0x2

    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v7, 0x1

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    new-instance v2, Landroidx/lifecycle/f;

    .line 40
    .line 41
    move-object v3, p1

    .line 42
    check-cast v3, Landroidx/lifecycle/d;

    .line 43
    .line 44
    move-object v8, p1

    .line 45
    check-cast v8, Landroidx/lifecycle/t;

    .line 46
    .line 47
    invoke-direct {v2, v3, v8}, Landroidx/lifecycle/f;-><init>(Landroidx/lifecycle/d;Landroidx/lifecycle/t;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    if-eqz v3, :cond_2

    .line 52
    .line 53
    new-instance v2, Landroidx/lifecycle/f;

    .line 54
    .line 55
    move-object v3, p1

    .line 56
    check-cast v3, Landroidx/lifecycle/d;

    .line 57
    .line 58
    invoke-direct {v2, v3, v5}, Landroidx/lifecycle/f;-><init>(Landroidx/lifecycle/d;Landroidx/lifecycle/t;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    if-eqz v2, :cond_3

    .line 63
    .line 64
    move-object v2, p1

    .line 65
    check-cast v2, Landroidx/lifecycle/t;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {v2}, Landroidx/lifecycle/y;->b(Ljava/lang/Class;)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-ne v3, v4, :cond_6

    .line 77
    .line 78
    sget-object v3, Landroidx/lifecycle/y;->b:Ljava/util/HashMap;

    .line 79
    .line 80
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-static {v2}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    check-cast v2, Ljava/util/List;

    .line 88
    .line 89
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eq v3, v7, :cond_5

    .line 94
    .line 95
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    new-array v8, v3, [Landroidx/lifecycle/h;

    .line 100
    .line 101
    if-gtz v3, :cond_4

    .line 102
    .line 103
    new-instance v2, La3/b;

    .line 104
    .line 105
    invoke-direct {v2, v4, v8}, La3/b;-><init>(ILjava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 114
    .line 115
    invoke-static {v0, p1}, Landroidx/lifecycle/y;->a(Ljava/lang/reflect/Constructor;Landroidx/lifecycle/u;)V

    .line 116
    .line 117
    .line 118
    throw v5

    .line 119
    :cond_5
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 124
    .line 125
    invoke-static {v0, p1}, Landroidx/lifecycle/y;->a(Ljava/lang/reflect/Constructor;Landroidx/lifecycle/u;)V

    .line 126
    .line 127
    .line 128
    throw v5

    .line 129
    :cond_6
    new-instance v2, Landroidx/lifecycle/f;

    .line 130
    .line 131
    invoke-direct {v2, p1}, Landroidx/lifecycle/f;-><init>(Landroidx/lifecycle/u;)V

    .line 132
    .line 133
    .line 134
    :goto_1
    iput-object v2, v0, Landroidx/lifecycle/w;->b:Landroidx/lifecycle/t;

    .line 135
    .line 136
    iput-object v1, v0, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/n;

    .line 137
    .line 138
    iget-object v1, p0, Landroidx/lifecycle/x;->l:Lo/a;

    .line 139
    .line 140
    invoke-virtual {v1, p1}, Lo/a;->a(Ljava/lang/Object;)Lo/c;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    if-eqz v2, :cond_7

    .line 145
    .line 146
    iget-object v1, v2, Lo/c;->k:Ljava/lang/Object;

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_7
    iget-object v2, v1, Lo/a;->n:Ljava/util/HashMap;

    .line 150
    .line 151
    new-instance v3, Lo/c;

    .line 152
    .line 153
    invoke-direct {v3, p1, v0}, Lo/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    iget v8, v1, Lo/f;->m:I

    .line 157
    .line 158
    add-int/2addr v8, v7

    .line 159
    iput v8, v1, Lo/f;->m:I

    .line 160
    .line 161
    iget-object v8, v1, Lo/f;->k:Lo/c;

    .line 162
    .line 163
    if-nez v8, :cond_8

    .line 164
    .line 165
    iput-object v3, v1, Lo/f;->j:Lo/c;

    .line 166
    .line 167
    iput-object v3, v1, Lo/f;->k:Lo/c;

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_8
    iput-object v3, v8, Lo/c;->l:Lo/c;

    .line 171
    .line 172
    iput-object v8, v3, Lo/c;->m:Lo/c;

    .line 173
    .line 174
    iput-object v3, v1, Lo/f;->k:Lo/c;

    .line 175
    .line 176
    :goto_2
    invoke-virtual {v2, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-object v1, v5

    .line 180
    :goto_3
    check-cast v1, Landroidx/lifecycle/w;

    .line 181
    .line 182
    if-eqz v1, :cond_9

    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_9
    iget-object v1, p0, Landroidx/lifecycle/x;->n:Ljava/lang/ref/WeakReference;

    .line 186
    .line 187
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    check-cast v1, Landroidx/lifecycle/v;

    .line 192
    .line 193
    if-nez v1, :cond_a

    .line 194
    .line 195
    :goto_4
    return-void

    .line 196
    :cond_a
    iget v2, p0, Landroidx/lifecycle/x;->o:I

    .line 197
    .line 198
    if-nez v2, :cond_b

    .line 199
    .line 200
    iget-boolean v2, p0, Landroidx/lifecycle/x;->p:Z

    .line 201
    .line 202
    if-eqz v2, :cond_c

    .line 203
    .line 204
    :cond_b
    move v6, v7

    .line 205
    :cond_c
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->j(Landroidx/lifecycle/u;)Landroidx/lifecycle/n;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    iget v3, p0, Landroidx/lifecycle/x;->o:I

    .line 210
    .line 211
    add-int/2addr v3, v7

    .line 212
    iput v3, p0, Landroidx/lifecycle/x;->o:I

    .line 213
    .line 214
    :goto_5
    iget-object v3, v0, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/n;

    .line 215
    .line 216
    invoke-virtual {v3, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    if-gez v2, :cond_11

    .line 221
    .line 222
    iget-object v2, p0, Landroidx/lifecycle/x;->l:Lo/a;

    .line 223
    .line 224
    iget-object v2, v2, Lo/a;->n:Ljava/util/HashMap;

    .line 225
    .line 226
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    if-eqz v2, :cond_11

    .line 231
    .line 232
    iget-object v2, v0, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/n;

    .line 233
    .line 234
    iget-object v3, p0, Landroidx/lifecycle/x;->r:Ljava/util/ArrayList;

    .line 235
    .line 236
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    sget-object v2, Landroidx/lifecycle/m;->Companion:Landroidx/lifecycle/k;

    .line 240
    .line 241
    iget-object v8, v0, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/n;

    .line 242
    .line 243
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    const-string v2, "state"

    .line 247
    .line 248
    invoke-static {v2, v8}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    if-eq v2, v7, :cond_f

    .line 256
    .line 257
    if-eq v2, v4, :cond_e

    .line 258
    .line 259
    const/4 v8, 0x3

    .line 260
    if-eq v2, v8, :cond_d

    .line 261
    .line 262
    move-object v2, v5

    .line 263
    goto :goto_6

    .line 264
    :cond_d
    sget-object v2, Landroidx/lifecycle/m;->ON_RESUME:Landroidx/lifecycle/m;

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_e
    sget-object v2, Landroidx/lifecycle/m;->ON_START:Landroidx/lifecycle/m;

    .line 268
    .line 269
    goto :goto_6

    .line 270
    :cond_f
    sget-object v2, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 271
    .line 272
    :goto_6
    if-eqz v2, :cond_10

    .line 273
    .line 274
    invoke-virtual {v0, v1, v2}, Landroidx/lifecycle/w;->a(Landroidx/lifecycle/v;Landroidx/lifecycle/m;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    sub-int/2addr v2, v7

    .line 282
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->j(Landroidx/lifecycle/u;)Landroidx/lifecycle/n;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    goto :goto_5

    .line 290
    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 291
    .line 292
    new-instance v1, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    const-string v2, "no event up from "

    .line 295
    .line 296
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    iget-object v0, v0, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/n;

    .line 300
    .line 301
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    throw p1

    .line 312
    :cond_11
    if-nez v6, :cond_12

    .line 313
    .line 314
    invoke-virtual {p0}, Landroidx/lifecycle/x;->o()V

    .line 315
    .line 316
    .line 317
    :cond_12
    iget p1, p0, Landroidx/lifecycle/x;->o:I

    .line 318
    .line 319
    add-int/lit8 p1, p1, -0x1

    .line 320
    .line 321
    iput p1, p0, Landroidx/lifecycle/x;->o:I

    .line 322
    .line 323
    return-void
.end method

.method public final b()Landroidx/lifecycle/n;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->m:Landroidx/lifecycle/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i(Landroidx/lifecycle/u;)V
    .locals 1

    .line 1
    const-string v0, "observer"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "removeObserver"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/lifecycle/x;->k(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/lifecycle/x;->l:Lo/a;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lo/a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final j(Landroidx/lifecycle/u;)Landroidx/lifecycle/n;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->l:Lo/a;

    .line 2
    .line 3
    iget-object v0, v0, Lo/a;->n:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lo/c;

    .line 17
    .line 18
    iget-object p1, p1, Lo/c;->m:Lo/c;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object p1, v2

    .line 22
    :goto_0
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p1, Lo/c;->k:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Landroidx/lifecycle/w;

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object p1, p1, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/n;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move-object p1, v2

    .line 34
    :goto_1
    iget-object v0, p0, Landroidx/lifecycle/x;->r:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/lit8 v1, v1, -0x1

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    move-object v2, v0

    .line 53
    check-cast v2, Landroidx/lifecycle/n;

    .line 54
    .line 55
    :cond_2
    iget-object v0, p0, Landroidx/lifecycle/x;->m:Landroidx/lifecycle/n;

    .line 56
    .line 57
    const-string v1, "state1"

    .line 58
    .line 59
    invoke-static {v1, v0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-gez v1, :cond_3

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    move-object p1, v0

    .line 72
    :goto_2
    if-eqz v2, :cond_4

    .line 73
    .line 74
    invoke-virtual {v2, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-gez v0, :cond_4

    .line 79
    .line 80
    return-object v2

    .line 81
    :cond_4
    return-object p1
.end method

.method public final k(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/lifecycle/x;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Ln/a;->s0()Ln/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, Ln/a;->n:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ln/a;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-ne v0, v1, :cond_0

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const-string v0, "Method "

    .line 32
    .line 33
    const-string v1, " must be called on the main thread"

    .line 34
    .line 35
    invoke-static {v0, p1, v1}, La1/a1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_1
    return-void
.end method

.method public final l(Landroidx/lifecycle/m;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "handleLifecycleEvent"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/lifecycle/x;->k(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/lifecycle/m;->a()Landroidx/lifecycle/n;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->m(Landroidx/lifecycle/n;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final m(Landroidx/lifecycle/n;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/x;->m:Landroidx/lifecycle/n;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    sget-object v1, Landroidx/lifecycle/n;->k:Landroidx/lifecycle/n;

    .line 7
    .line 8
    sget-object v2, Landroidx/lifecycle/n;->j:Landroidx/lifecycle/n;

    .line 9
    .line 10
    if-ne v0, v1, :cond_2

    .line 11
    .line 12
    if-eq p1, v2, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "State must be at least CREATED to move to "

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p1, ", but was "

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Landroidx/lifecycle/x;->m:Landroidx/lifecycle/n;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p1, " in component "

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Landroidx/lifecycle/x;->n:Ljava/lang/ref/WeakReference;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v0

    .line 63
    :cond_2
    :goto_0
    iput-object p1, p0, Landroidx/lifecycle/x;->m:Landroidx/lifecycle/n;

    .line 64
    .line 65
    iget-boolean p1, p0, Landroidx/lifecycle/x;->p:Z

    .line 66
    .line 67
    const/4 v0, 0x1

    .line 68
    if-nez p1, :cond_5

    .line 69
    .line 70
    iget p1, p0, Landroidx/lifecycle/x;->o:I

    .line 71
    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    iput-boolean v0, p0, Landroidx/lifecycle/x;->p:Z

    .line 76
    .line 77
    invoke-virtual {p0}, Landroidx/lifecycle/x;->o()V

    .line 78
    .line 79
    .line 80
    const/4 p1, 0x0

    .line 81
    iput-boolean p1, p0, Landroidx/lifecycle/x;->p:Z

    .line 82
    .line 83
    iget-object p1, p0, Landroidx/lifecycle/x;->m:Landroidx/lifecycle/n;

    .line 84
    .line 85
    if-ne p1, v2, :cond_4

    .line 86
    .line 87
    new-instance p1, Lo/a;

    .line 88
    .line 89
    invoke-direct {p1}, Lo/a;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object p1, p0, Landroidx/lifecycle/x;->l:Lo/a;

    .line 93
    .line 94
    :cond_4
    :goto_1
    return-void

    .line 95
    :cond_5
    :goto_2
    iput-boolean v0, p0, Landroidx/lifecycle/x;->q:Z

    .line 96
    .line 97
    return-void
.end method

.method public final n()V
    .locals 1

    .line 1
    const-string v0, "setCurrentState"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/lifecycle/x;->k(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroidx/lifecycle/n;->l:Landroidx/lifecycle/n;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/lifecycle/x;->m(Landroidx/lifecycle/n;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final o()V
    .locals 12

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/lifecycle/x;->r:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/lifecycle/x;->n:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Landroidx/lifecycle/v;

    .line 12
    .line 13
    if-eqz v2, :cond_12

    .line 14
    .line 15
    :cond_0
    iget-object v3, p0, Landroidx/lifecycle/x;->l:Lo/a;

    .line 16
    .line 17
    iget v4, v3, Lo/f;->m:I

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object v3, v3, Lo/f;->j:Lo/c;

    .line 24
    .line 25
    invoke-static {v3}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v3, v3, Lo/c;->k:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v3, Landroidx/lifecycle/w;

    .line 31
    .line 32
    iget-object v3, v3, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/n;

    .line 33
    .line 34
    iget-object v4, p0, Landroidx/lifecycle/x;->l:Lo/a;

    .line 35
    .line 36
    iget-object v4, v4, Lo/f;->k:Lo/c;

    .line 37
    .line 38
    invoke-static {v4}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v4, v4, Lo/c;->k:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v4, Landroidx/lifecycle/w;

    .line 44
    .line 45
    iget-object v4, v4, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/n;

    .line 46
    .line 47
    if-ne v3, v4, :cond_6

    .line 48
    .line 49
    iget-object v3, p0, Landroidx/lifecycle/x;->m:Landroidx/lifecycle/n;

    .line 50
    .line 51
    if-ne v3, v4, :cond_6

    .line 52
    .line 53
    :goto_0
    iput-boolean v5, p0, Landroidx/lifecycle/x;->q:Z

    .line 54
    .line 55
    iget-object v0, p0, Landroidx/lifecycle/x;->s:Lk7/a;

    .line 56
    .line 57
    iget-object v1, p0, Landroidx/lifecycle/x;->m:Landroidx/lifecycle/n;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    if-nez v1, :cond_2

    .line 63
    .line 64
    sget-object v1, Ll7/a;->a:Lm7/s;

    .line 65
    .line 66
    :cond_2
    monitor-enter v0

    .line 67
    :try_start_0
    sget-object v2, Lk7/a;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 68
    .line 69
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-static {v3, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 77
    if-eqz v3, :cond_3

    .line 78
    .line 79
    monitor-exit v0

    .line 80
    goto :goto_3

    .line 81
    :cond_3
    :try_start_1
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iget v1, v0, Lk7/a;->b:I

    .line 85
    .line 86
    and-int/lit8 v2, v1, 0x1

    .line 87
    .line 88
    if-nez v2, :cond_5

    .line 89
    .line 90
    add-int/lit8 v1, v1, 0x1

    .line 91
    .line 92
    iput v1, v0, Lk7/a;->b:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 93
    .line 94
    monitor-exit v0

    .line 95
    :goto_1
    monitor-enter v0

    .line 96
    :try_start_2
    iget v2, v0, Lk7/a;->b:I

    .line 97
    .line 98
    if-ne v2, v1, :cond_4

    .line 99
    .line 100
    add-int/lit8 v1, v1, 0x1

    .line 101
    .line 102
    iput v1, v0, Lk7/a;->b:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 103
    .line 104
    monitor-exit v0

    .line 105
    goto :goto_3

    .line 106
    :catchall_0
    move-exception v1

    .line 107
    goto :goto_2

    .line 108
    :cond_4
    monitor-exit v0

    .line 109
    move v1, v2

    .line 110
    goto :goto_1

    .line 111
    :goto_2
    monitor-exit v0

    .line 112
    throw v1

    .line 113
    :catchall_1
    move-exception v1

    .line 114
    goto :goto_4

    .line 115
    :cond_5
    add-int/lit8 v1, v1, 0x2

    .line 116
    .line 117
    :try_start_3
    iput v1, v0, Lk7/a;->b:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 118
    .line 119
    monitor-exit v0

    .line 120
    :goto_3
    return-void

    .line 121
    :goto_4
    monitor-exit v0

    .line 122
    throw v1

    .line 123
    :cond_6
    iput-boolean v5, p0, Landroidx/lifecycle/x;->q:Z

    .line 124
    .line 125
    iget-object v3, p0, Landroidx/lifecycle/x;->m:Landroidx/lifecycle/n;

    .line 126
    .line 127
    iget-object v4, p0, Landroidx/lifecycle/x;->l:Lo/a;

    .line 128
    .line 129
    iget-object v4, v4, Lo/f;->j:Lo/c;

    .line 130
    .line 131
    invoke-static {v4}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    iget-object v4, v4, Lo/c;->k:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v4, Landroidx/lifecycle/w;

    .line 137
    .line 138
    iget-object v4, v4, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/n;

    .line 139
    .line 140
    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    const/4 v4, 0x0

    .line 145
    const/4 v5, 0x3

    .line 146
    const/4 v6, 0x2

    .line 147
    const/4 v7, 0x1

    .line 148
    if-gez v3, :cond_c

    .line 149
    .line 150
    iget-object v3, p0, Landroidx/lifecycle/x;->l:Lo/a;

    .line 151
    .line 152
    new-instance v8, Lo/b;

    .line 153
    .line 154
    iget-object v9, v3, Lo/f;->k:Lo/c;

    .line 155
    .line 156
    iget-object v10, v3, Lo/f;->j:Lo/c;

    .line 157
    .line 158
    const/4 v11, 0x1

    .line 159
    invoke-direct {v8, v9, v10, v11}, Lo/b;-><init>(Lo/c;Lo/c;I)V

    .line 160
    .line 161
    .line 162
    iget-object v3, v3, Lo/f;->l:Ljava/util/WeakHashMap;

    .line 163
    .line 164
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 165
    .line 166
    invoke-virtual {v3, v8, v9}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    :cond_7
    invoke-virtual {v8}, Lo/b;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    if-eqz v3, :cond_c

    .line 174
    .line 175
    iget-boolean v3, p0, Landroidx/lifecycle/x;->q:Z

    .line 176
    .line 177
    if-nez v3, :cond_c

    .line 178
    .line 179
    invoke-virtual {v8}, Lo/b;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    check-cast v3, Ljava/util/Map$Entry;

    .line 184
    .line 185
    const-string v9, "next()"

    .line 186
    .line 187
    invoke-static {v9, v3}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v9

    .line 194
    check-cast v9, Landroidx/lifecycle/u;

    .line 195
    .line 196
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    check-cast v3, Landroidx/lifecycle/w;

    .line 201
    .line 202
    :goto_5
    iget-object v10, v3, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/n;

    .line 203
    .line 204
    iget-object v11, p0, Landroidx/lifecycle/x;->m:Landroidx/lifecycle/n;

    .line 205
    .line 206
    invoke-virtual {v10, v11}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 207
    .line 208
    .line 209
    move-result v10

    .line 210
    if-lez v10, :cond_7

    .line 211
    .line 212
    iget-boolean v10, p0, Landroidx/lifecycle/x;->q:Z

    .line 213
    .line 214
    if-nez v10, :cond_7

    .line 215
    .line 216
    iget-object v10, p0, Landroidx/lifecycle/x;->l:Lo/a;

    .line 217
    .line 218
    iget-object v10, v10, Lo/a;->n:Ljava/util/HashMap;

    .line 219
    .line 220
    invoke-virtual {v10, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v10

    .line 224
    if-eqz v10, :cond_7

    .line 225
    .line 226
    sget-object v10, Landroidx/lifecycle/m;->Companion:Landroidx/lifecycle/k;

    .line 227
    .line 228
    iget-object v11, v3, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/n;

    .line 229
    .line 230
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    invoke-static {v0, v11}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 237
    .line 238
    .line 239
    move-result v10

    .line 240
    if-eq v10, v6, :cond_a

    .line 241
    .line 242
    if-eq v10, v5, :cond_9

    .line 243
    .line 244
    const/4 v11, 0x4

    .line 245
    if-eq v10, v11, :cond_8

    .line 246
    .line 247
    move-object v10, v4

    .line 248
    goto :goto_6

    .line 249
    :cond_8
    sget-object v10, Landroidx/lifecycle/m;->ON_PAUSE:Landroidx/lifecycle/m;

    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_9
    sget-object v10, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_a
    sget-object v10, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 256
    .line 257
    :goto_6
    if-eqz v10, :cond_b

    .line 258
    .line 259
    invoke-virtual {v10}, Landroidx/lifecycle/m;->a()Landroidx/lifecycle/n;

    .line 260
    .line 261
    .line 262
    move-result-object v11

    .line 263
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    invoke-virtual {v3, v2, v10}, Landroidx/lifecycle/w;->a(Landroidx/lifecycle/v;Landroidx/lifecycle/m;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 270
    .line 271
    .line 272
    move-result v10

    .line 273
    sub-int/2addr v10, v7

    .line 274
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    goto :goto_5

    .line 278
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 279
    .line 280
    new-instance v1, Ljava/lang/StringBuilder;

    .line 281
    .line 282
    const-string v2, "no event down from "

    .line 283
    .line 284
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    iget-object v2, v3, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/n;

    .line 288
    .line 289
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw v0

    .line 300
    :cond_c
    iget-object v3, p0, Landroidx/lifecycle/x;->l:Lo/a;

    .line 301
    .line 302
    iget-object v3, v3, Lo/f;->k:Lo/c;

    .line 303
    .line 304
    iget-boolean v8, p0, Landroidx/lifecycle/x;->q:Z

    .line 305
    .line 306
    if-nez v8, :cond_0

    .line 307
    .line 308
    if-eqz v3, :cond_0

    .line 309
    .line 310
    iget-object v8, p0, Landroidx/lifecycle/x;->m:Landroidx/lifecycle/n;

    .line 311
    .line 312
    iget-object v3, v3, Lo/c;->k:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v3, Landroidx/lifecycle/w;

    .line 315
    .line 316
    iget-object v3, v3, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/n;

    .line 317
    .line 318
    invoke-virtual {v8, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    if-lez v3, :cond_0

    .line 323
    .line 324
    iget-object v3, p0, Landroidx/lifecycle/x;->l:Lo/a;

    .line 325
    .line 326
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    new-instance v8, Lo/d;

    .line 330
    .line 331
    invoke-direct {v8, v3}, Lo/d;-><init>(Lo/f;)V

    .line 332
    .line 333
    .line 334
    iget-object v3, v3, Lo/f;->l:Ljava/util/WeakHashMap;

    .line 335
    .line 336
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 337
    .line 338
    invoke-virtual {v3, v8, v9}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    :cond_d
    invoke-virtual {v8}, Lo/d;->hasNext()Z

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    if-eqz v3, :cond_0

    .line 346
    .line 347
    iget-boolean v3, p0, Landroidx/lifecycle/x;->q:Z

    .line 348
    .line 349
    if-nez v3, :cond_0

    .line 350
    .line 351
    invoke-virtual {v8}, Lo/d;->next()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    check-cast v3, Ljava/util/Map$Entry;

    .line 356
    .line 357
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v9

    .line 361
    check-cast v9, Landroidx/lifecycle/u;

    .line 362
    .line 363
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    check-cast v3, Landroidx/lifecycle/w;

    .line 368
    .line 369
    :goto_7
    iget-object v10, v3, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/n;

    .line 370
    .line 371
    iget-object v11, p0, Landroidx/lifecycle/x;->m:Landroidx/lifecycle/n;

    .line 372
    .line 373
    invoke-virtual {v10, v11}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 374
    .line 375
    .line 376
    move-result v10

    .line 377
    if-gez v10, :cond_d

    .line 378
    .line 379
    iget-boolean v10, p0, Landroidx/lifecycle/x;->q:Z

    .line 380
    .line 381
    if-nez v10, :cond_d

    .line 382
    .line 383
    iget-object v10, p0, Landroidx/lifecycle/x;->l:Lo/a;

    .line 384
    .line 385
    iget-object v10, v10, Lo/a;->n:Ljava/util/HashMap;

    .line 386
    .line 387
    invoke-virtual {v10, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v10

    .line 391
    if-eqz v10, :cond_d

    .line 392
    .line 393
    iget-object v10, v3, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/n;

    .line 394
    .line 395
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    sget-object v10, Landroidx/lifecycle/m;->Companion:Landroidx/lifecycle/k;

    .line 399
    .line 400
    iget-object v11, v3, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/n;

    .line 401
    .line 402
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    invoke-static {v0, v11}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 409
    .line 410
    .line 411
    move-result v10

    .line 412
    if-eq v10, v7, :cond_10

    .line 413
    .line 414
    if-eq v10, v6, :cond_f

    .line 415
    .line 416
    if-eq v10, v5, :cond_e

    .line 417
    .line 418
    move-object v10, v4

    .line 419
    goto :goto_8

    .line 420
    :cond_e
    sget-object v10, Landroidx/lifecycle/m;->ON_RESUME:Landroidx/lifecycle/m;

    .line 421
    .line 422
    goto :goto_8

    .line 423
    :cond_f
    sget-object v10, Landroidx/lifecycle/m;->ON_START:Landroidx/lifecycle/m;

    .line 424
    .line 425
    goto :goto_8

    .line 426
    :cond_10
    sget-object v10, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 427
    .line 428
    :goto_8
    if-eqz v10, :cond_11

    .line 429
    .line 430
    invoke-virtual {v3, v2, v10}, Landroidx/lifecycle/w;->a(Landroidx/lifecycle/v;Landroidx/lifecycle/m;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 434
    .line 435
    .line 436
    move-result v10

    .line 437
    sub-int/2addr v10, v7

    .line 438
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    goto :goto_7

    .line 442
    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 443
    .line 444
    new-instance v1, Ljava/lang/StringBuilder;

    .line 445
    .line 446
    const-string v2, "no event up from "

    .line 447
    .line 448
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    iget-object v2, v3, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/n;

    .line 452
    .line 453
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v1

    .line 460
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    throw v0

    .line 464
    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 465
    .line 466
    const-string v1, "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."

    .line 467
    .line 468
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    throw v0
.end method
