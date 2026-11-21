.class public final Lb5/b;
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
    iput-object p1, p0, Lb5/b;->o:Ljava/lang/String;

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
    invoke-virtual {p0, p1, p2}, Lb5/b;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lb5/b;

    .line 10
    .line 11
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lb5/b;->h(Ljava/lang/Object;)Ljava/lang/Object;

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
    new-instance p1, Lb5/b;

    .line 2
    .line 3
    iget-object v0, p0, Lb5/b;->o:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lb5/b;-><init>(Ljava/lang/String;Lp6/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 2
    .line 3
    iget v1, p0, Lb5/b;->n:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    :try_start_0
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 12
    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1

    .line 23
    :cond_1
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :try_start_1
    iput v2, p0, Lb5/b;->n:I

    .line 27
    .line 28
    sget-object p1, Lb5/h;->a:Lb5/i;

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    sget-object p1, Li7/e0;->a:Lo7/e;

    .line 34
    .line 35
    sget-object p1, Lo7/d;->l:Lo7/d;

    .line 36
    .line 37
    new-instance v1, Lb5/g;

    .line 38
    .line 39
    const/4 v2, 0x2

    .line 40
    invoke-direct {v1, v2, v3}, Lr6/h;-><init>(ILp6/c;)V

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
    iget-object v0, p1, Lb5/i;->k:Ljava/lang/String;

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
    move-object v0, v3

    .line 64
    :goto_2
    if-nez v0, :cond_5

    .line 65
    .line 66
    goto :goto_6

    .line 67
    :cond_5
    new-instance v1, Lokhttp3/g0$a;

    .line 68
    .line 69
    invoke-direct {v1}, Lokhttp3/g0$a;-><init>()V

    .line 70
    .line 71
    .line 72
    iget-object v2, p0, Lb5/b;->o:Ljava/lang/String;

    .line 73
    .line 74
    new-instance v4, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v0, "?page=1"

    .line 86
    .line 87
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v1, v0}, Lokhttp3/g0$a;->url(Ljava/lang/String;)Lokhttp3/g0$a;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iget-object p1, p1, Lb5/i;->l:Ljava/lang/Object;

    .line 99
    .line 100
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_6

    .line 113
    .line 114
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    check-cast v1, Ljava/util/Map$Entry;

    .line 119
    .line 120
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    check-cast v2, Ljava/lang/String;

    .line 125
    .line 126
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    check-cast v1, Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v0, v2, v1}, Lokhttp3/g0$a;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/g0$a;

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_6
    invoke-virtual {v0}, Lokhttp3/g0$a;->build()Lokhttp3/g0;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    sget-object v0, Lb5/m;->a:Lokhttp3/e0;

    .line 141
    .line 142
    invoke-virtual {v0, p1}, Lokhttp3/e0;->newCall(Lokhttp3/g0;)Lokhttp3/g;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-interface {p1}, Lokhttp3/g;->execute()Lokhttp3/i0;

    .line 147
    .line 148
    .line 149
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 150
    :try_start_2
    invoke-virtual {p1}, Lokhttp3/i0;->body()Lokhttp3/j0;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    if-eqz v0, :cond_7

    .line 155
    .line 156
    invoke-virtual {v0}, Lokhttp3/j0;->string()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    goto :goto_4

    .line 161
    :catchall_0
    move-exception v0

    .line 162
    goto :goto_5

    .line 163
    :cond_7
    move-object v0, v3

    .line 164
    :goto_4
    if-nez v0, :cond_8

    .line 165
    .line 166
    const-string v0, ""
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 167
    .line 168
    :cond_8
    :try_start_3
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 169
    .line 170
    .line 171
    return-object v0

    .line 172
    :goto_5
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 173
    :catchall_1
    move-exception v1

    .line 174
    :try_start_5
    invoke-static {p1, v0}, Lt5/a;->b(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 178
    :catchall_2
    :cond_9
    :goto_6
    return-object v3
.end method
