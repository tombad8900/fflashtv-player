.class public final Lb5/a;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public n:I

.field public final synthetic o:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lp6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb5/a;->o:Ljava/lang/String;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lr6/h;-><init>(ILp6/c;)V

    .line 5
    .line 6
    .line 7
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
    invoke-virtual {p0, p1, p2}, Lb5/a;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lb5/a;

    .line 10
    .line 11
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lb5/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final g(Ljava/lang/Object;Lp6/c;)Lp6/c;
    .locals 1

    .line 1
    new-instance p1, Lb5/a;

    .line 2
    .line 3
    iget-object v0, p0, Lb5/a;->o:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lb5/a;-><init>(Ljava/lang/String;Lp6/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 2
    .line 3
    iget v1, p0, Lb5/a;->n:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v3, :cond_0

    .line 11
    .line 12
    :try_start_0
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 13
    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :try_start_1
    iput v3, p0, Lb5/a;->n:I

    .line 28
    .line 29
    sget-object p1, Lb5/h;->a:Lb5/i;

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    sget-object p1, Li7/e0;->a:Lo7/e;

    .line 35
    .line 36
    sget-object p1, Lo7/d;->l:Lo7/d;

    .line 37
    .line 38
    new-instance v1, Lb5/g;

    .line 39
    .line 40
    invoke-direct {v1, v2, v4}, Lr6/h;-><init>(ILp6/c;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1, v1, p0}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_0
    if-ne p1, v0, :cond_3

    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_3
    :goto_1
    check-cast p1, Lb5/i;

    .line 51
    .line 52
    iget-object v0, p1, Lb5/i;->i:Ljava/lang/String;

    .line 53
    .line 54
    if-eqz v0, :cond_9

    .line 55
    .line 56
    invoke-static {v0}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_4

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    move-object v0, v4

    .line 64
    :goto_2
    if-nez v0, :cond_5

    .line 65
    .line 66
    goto/16 :goto_6

    .line 67
    .line 68
    :cond_5
    new-instance v1, Lokhttp3/g0$a;

    .line 69
    .line 70
    invoke-direct {v1}, Lokhttp3/g0$a;-><init>()V

    .line 71
    .line 72
    .line 73
    iget-object v3, p0, Lb5/a;->o:Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 76
    .line 77
    .line 78
    move-result-wide v5

    .line 79
    new-instance v7, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v0, "?_="

    .line 91
    .line 92
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v1, v0}, Lokhttp3/g0$a;->url(Ljava/lang/String;)Lokhttp3/g0$a;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget-object p1, p1, Lb5/i;->j:Ljava/lang/Object;

    .line 107
    .line 108
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_6

    .line 121
    .line 122
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Ljava/util/Map$Entry;

    .line 127
    .line 128
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    check-cast v3, Ljava/lang/String;

    .line 133
    .line 134
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {v0, v3, v1}, Lokhttp3/g0$a;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/g0$a;

    .line 141
    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_6
    invoke-virtual {v0}, Lokhttp3/g0$a;->build()Lokhttp3/g0;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    sget-object v0, Lb5/m;->a:Lokhttp3/e0;

    .line 149
    .line 150
    invoke-virtual {v0, p1}, Lokhttp3/e0;->newCall(Lokhttp3/g0;)Lokhttp3/g;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-interface {p1}, Lokhttp3/g;->execute()Lokhttp3/i0;

    .line 155
    .line 156
    .line 157
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 158
    :try_start_2
    new-instance v0, Lb5/j;

    .line 159
    .line 160
    invoke-virtual {p1}, Lokhttp3/i0;->body()Lokhttp3/j0;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    if-eqz v1, :cond_7

    .line 165
    .line 166
    invoke-virtual {v1}, Lokhttp3/j0;->string()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    goto :goto_4

    .line 171
    :catchall_0
    move-exception v0

    .line 172
    goto :goto_5

    .line 173
    :cond_7
    move-object v1, v4

    .line 174
    :goto_4
    if-nez v1, :cond_8

    .line 175
    .line 176
    const-string v1, ""

    .line 177
    .line 178
    :cond_8
    const-string v3, "t"

    .line 179
    .line 180
    invoke-static {p1, v3, v4, v2, v4}, Lokhttp3/i0;->header$default(Lokhttp3/i0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-direct {v0, v1, v2}, Lb5/j;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 185
    .line 186
    .line 187
    :try_start_3
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 188
    .line 189
    .line 190
    return-object v0

    .line 191
    :goto_5
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 192
    :catchall_1
    move-exception v1

    .line 193
    :try_start_5
    invoke-static {p1, v0}, Lt5/a;->b(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 194
    .line 195
    .line 196
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 197
    :catchall_2
    :cond_9
    :goto_6
    return-object v4
.end method
