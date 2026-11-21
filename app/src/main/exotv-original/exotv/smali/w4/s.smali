.class public final Lw4/s;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public n:Lx4/m;

.field public o:Ljava/util/Collection;

.field public p:Ljava/util/Iterator;

.field public q:Lw4/k;

.field public r:Lx4/w;

.field public s:Lw4/k;

.field public t:Ljava/util/Collection;

.field public u:I

.field public final synthetic v:Ljava/util/List;

.field public final synthetic w:Lx4/m;


# direct methods
.method public constructor <init>(Ljava/util/List;Lx4/m;Lp6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw4/s;->v:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Lw4/s;->w:Lx4/m;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lr6/h;-><init>(ILp6/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Li7/u;

    .line 2
    .line 3
    check-cast p2, Lp6/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lw4/s;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw4/s;

    .line 10
    .line 11
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw4/s;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final g(Ljava/lang/Object;Lp6/c;)Lp6/c;
    .locals 2

    .line 1
    new-instance p1, Lw4/s;

    .line 2
    .line 3
    iget-object v0, p0, Lw4/s;->v:Ljava/util/List;

    .line 4
    .line 5
    iget-object v1, p0, Lw4/s;->w:Lx4/m;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lw4/s;-><init>(Ljava/util/List;Lx4/m;Lp6/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 2
    .line 3
    iget v1, p0, Lw4/s;->u:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lw4/s;->t:Ljava/util/Collection;

    .line 11
    .line 12
    iget-object v3, p0, Lw4/s;->s:Lw4/k;

    .line 13
    .line 14
    iget-object v4, p0, Lw4/s;->r:Lx4/w;

    .line 15
    .line 16
    iget-object v5, p0, Lw4/s;->q:Lw4/k;

    .line 17
    .line 18
    iget-object v6, p0, Lw4/s;->p:Ljava/util/Iterator;

    .line 19
    .line 20
    iget-object v7, p0, Lw4/s;->o:Ljava/util/Collection;

    .line 21
    .line 22
    iget-object v8, p0, Lw4/s;->n:Lx4/m;

    .line 23
    .line 24
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_4

    .line 28
    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lw4/s;->v:Ljava/util/List;

    .line 41
    .line 42
    iget-object v1, p0, Lw4/s;->w:Lx4/m;

    .line 43
    .line 44
    new-instance v3, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-static {p1}, Lm6/j;->w0(Ljava/lang/Iterable;)I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    move-object v6, p1

    .line 58
    move-object v8, v1

    .line 59
    move-object v1, v3

    .line 60
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_a

    .line 65
    .line 66
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    move-object v3, p1

    .line 71
    check-cast v3, Lw4/k;

    .line 72
    .line 73
    iget-object p1, v3, Lw4/k;->a:Lw4/m;

    .line 74
    .line 75
    iget-object p1, p1, Lw4/m;->c:Ljava/lang/String;

    .line 76
    .line 77
    iget-object v4, v3, Lw4/k;->c:Ly6/a;

    .line 78
    .line 79
    if-eqz v4, :cond_2

    .line 80
    .line 81
    invoke-interface {v4}, Ly6/a;->invoke()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    check-cast v4, Ljava/lang/String;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    const/4 v4, 0x0

    .line 89
    :goto_1
    if-nez v4, :cond_3

    .line 90
    .line 91
    const-string v4, ""

    .line 92
    .line 93
    :cond_3
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    const-string v7, "?"

    .line 98
    .line 99
    const-string v9, "&"

    .line 100
    .line 101
    const/16 v10, 0x3f

    .line 102
    .line 103
    if-nez v5, :cond_4

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_4
    invoke-static {p1, v10}, Lh7/h;->v0(Ljava/lang/CharSequence;C)Z

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-eqz v5, :cond_5

    .line 111
    .line 112
    move-object v5, v9

    .line 113
    goto :goto_2

    .line 114
    :cond_5
    move-object v5, v7

    .line 115
    :goto_2
    new-instance v11, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v11, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    :goto_3
    new-instance v4, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    const-string v5, "https://api.themoviedb.org/3"

    .line 136
    .line 137
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    const-string v4, "url"

    .line 148
    .line 149
    invoke-static {v4, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    invoke-static {p1, v10}, Lh7/h;->v0(Ljava/lang/CharSequence;C)Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-eqz v4, :cond_6

    .line 157
    .line 158
    move-object v7, v9

    .line 159
    :cond_6
    sget-object v4, Lb5/h;->a:Lb5/i;

    .line 160
    .line 161
    if-eqz v4, :cond_7

    .line 162
    .line 163
    iget-object v4, v4, Lb5/i;->r:Ljava/lang/String;

    .line 164
    .line 165
    if-nez v4, :cond_8

    .line 166
    .line 167
    :cond_7
    const-string v4, "4e44d9029b1270a757cddc766a1bcb63"

    .line 168
    .line 169
    :cond_8
    new-instance v5, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string p1, "api_key="

    .line 181
    .line 182
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    sget-object v4, Lx4/w;->a:Lx4/w;

    .line 193
    .line 194
    sget-object v5, Lx4/k;->a:Lx4/k;

    .line 195
    .line 196
    iput-object v8, p0, Lw4/s;->n:Lx4/m;

    .line 197
    .line 198
    iput-object v1, p0, Lw4/s;->o:Ljava/util/Collection;

    .line 199
    .line 200
    iput-object v6, p0, Lw4/s;->p:Ljava/util/Iterator;

    .line 201
    .line 202
    iput-object v3, p0, Lw4/s;->q:Lw4/k;

    .line 203
    .line 204
    iput-object v4, p0, Lw4/s;->r:Lx4/w;

    .line 205
    .line 206
    iput-object v3, p0, Lw4/s;->s:Lw4/k;

    .line 207
    .line 208
    iput-object v1, p0, Lw4/s;->t:Ljava/util/Collection;

    .line 209
    .line 210
    iput v2, p0, Lw4/s;->u:I

    .line 211
    .line 212
    invoke-static {p1, p0}, Lx4/k;->f(Ljava/lang/String;Lr6/h;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    if-ne p1, v0, :cond_9

    .line 217
    .line 218
    return-object v0

    .line 219
    :cond_9
    move-object v7, v1

    .line 220
    move-object v5, v3

    .line 221
    :goto_4
    check-cast p1, Ljava/lang/String;

    .line 222
    .line 223
    new-instance v9, Lorg/json/JSONObject;

    .line 224
    .line 225
    invoke-direct {v9, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    const-string p1, "results"

    .line 229
    .line 230
    invoke-virtual {v9, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    iget-object v5, v5, Lw4/k;->d:Ljava/util/Set;

    .line 235
    .line 236
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-static {p1, v8, v5}, Lx4/w;->b(Lorg/json/JSONArray;Lx4/m;Ljava/util/Set;)Ljava/util/List;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    new-instance v4, Ll6/d;

    .line 244
    .line 245
    invoke-direct {v4, v3, p1}, Ll6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-object v1, v7

    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :cond_a
    check-cast v1, Ljava/util/List;

    .line 255
    .line 256
    return-object v1
.end method
