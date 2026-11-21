.class public final Lz4/i;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Lb5/i;

.field public final synthetic p:Landroid/content/Context;

.field public final synthetic q:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lb5/i;Landroid/content/Context;Ljava/lang/String;Lp6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz4/i;->n:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lz4/i;->o:Lb5/i;

    .line 4
    .line 5
    iput-object p3, p0, Lz4/i;->p:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p4, p0, Lz4/i;->q:Ljava/lang/String;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lr6/h;-><init>(ILp6/c;)V

    .line 11
    .line 12
    .line 13
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
    invoke-virtual {p0, p1, p2}, Lz4/i;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lz4/i;

    .line 10
    .line 11
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lz4/i;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final g(Ljava/lang/Object;Lp6/c;)Lp6/c;
    .locals 6

    .line 1
    new-instance v0, Lz4/i;

    .line 2
    .line 3
    iget-object v3, p0, Lz4/i;->p:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v4, p0, Lz4/i;->q:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, Lz4/i;->n:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Lz4/i;->o:Lb5/i;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lz4/i;-><init>(Ljava/lang/String;Lb5/i;Landroid/content/Context;Ljava/lang/String;Lp6/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lz4/i;->n:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "http"

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {p1, v0, v1}, Lh7/p;->t0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v2, p0, Lz4/i;->o:Lb5/i;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    sget-object v0, Lz4/k;->a:Lz4/k;

    .line 22
    .line 23
    iget-object v0, v2, Lb5/i;->o:Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-static {v0}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-nez v4, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v0, v3

    .line 35
    :goto_0
    if-nez v0, :cond_3

    .line 36
    .line 37
    :cond_2
    const-string v0, "https://nonz.vevi-cobty-14-b.club/genral/api/v3"

    .line 38
    .line 39
    :cond_3
    const/4 v4, 0x1

    .line 40
    new-array v4, v4, [C

    .line 41
    .line 42
    const/16 v5, 0x2f

    .line 43
    .line 44
    aput-char v5, v4, v1

    .line 45
    .line 46
    invoke-static {p1, v4}, Lh7/h;->V0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance v1, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v0, "/"

    .line 59
    .line 60
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    :goto_1
    :try_start_0
    new-instance v0, Lokhttp3/g0$a;

    .line 71
    .line 72
    invoke-direct {v0}, Lokhttp3/g0$a;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, p1}, Lokhttp3/g0$a;->url(Ljava/lang/String;)Lokhttp3/g0$a;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iget-object v0, p0, Lz4/i;->p:Landroid/content/Context;

    .line 80
    .line 81
    iget-object v1, p0, Lz4/i;->q:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v2, v0, v1}, Lz4/k;->a(Lb5/i;Landroid/content/Context;Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_4

    .line 100
    .line 101
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, Ljava/util/Map$Entry;

    .line 106
    .line 107
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    check-cast v2, Ljava/lang/String;

    .line 112
    .line 113
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {p1, v2, v1}, Lokhttp3/g0$a;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/g0$a;

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    invoke-virtual {p1}, Lokhttp3/g0$a;->build()Lokhttp3/g0;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    sget-object v0, Lb5/m;->a:Lokhttp3/e0;

    .line 128
    .line 129
    invoke-virtual {v0, p1}, Lokhttp3/e0;->newCall(Lokhttp3/g0;)Lokhttp3/g;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-interface {p1}, Lokhttp3/g;->execute()Lokhttp3/i0;

    .line 134
    .line 135
    .line 136
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 137
    :try_start_1
    invoke-virtual {p1}, Lokhttp3/i0;->body()Lokhttp3/j0;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-eqz v0, :cond_5

    .line 142
    .line 143
    invoke-virtual {v0}, Lokhttp3/j0;->string()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    goto :goto_3

    .line 148
    :catchall_0
    move-exception v0

    .line 149
    goto :goto_5

    .line 150
    :cond_5
    move-object v0, v3

    .line 151
    :goto_3
    if-nez v0, :cond_6

    .line 152
    .line 153
    const-string v0, ""
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 154
    .line 155
    :cond_6
    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 156
    .line 157
    .line 158
    :try_start_3
    new-instance p1, Lorg/json/JSONTokener;

    .line 159
    .line 160
    invoke-direct {p1, v0}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 167
    goto :goto_4

    .line 168
    :catchall_1
    move-object p1, v0

    .line 169
    :goto_4
    :try_start_4
    invoke-static {p1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    instance-of v1, p1, Lorg/json/JSONObject;

    .line 173
    .line 174
    if-eqz v1, :cond_7

    .line 175
    .line 176
    move-object v1, p1

    .line 177
    check-cast v1, Lorg/json/JSONObject;

    .line 178
    .line 179
    const-string v2, "data"

    .line 180
    .line 181
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    instance-of v2, v1, Ljava/lang/String;

    .line 186
    .line 187
    if-eqz v2, :cond_7

    .line 188
    .line 189
    sget-object v2, Lz4/k;->a:Lz4/k;

    .line 190
    .line 191
    check-cast v1, Ljava/lang/String;

    .line 192
    .line 193
    invoke-static {v1}, Lz4/k;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 198
    .line 199
    .line 200
    move-result v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 201
    if-lez v2, :cond_7

    .line 202
    .line 203
    :try_start_5
    new-instance p1, Lorg/json/JSONTokener;

    .line 204
    .line 205
    invoke-direct {p1, v1}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 212
    :catchall_2
    return-object v0

    .line 213
    :cond_7
    move-object v3, p1

    .line 214
    goto :goto_6

    .line 215
    :goto_5
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 216
    :catchall_3
    move-exception v1

    .line 217
    :try_start_7
    invoke-static {p1, v0}, Lt5/a;->b(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 218
    .line 219
    .line 220
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 221
    :catchall_4
    :goto_6
    return-object v3
.end method
