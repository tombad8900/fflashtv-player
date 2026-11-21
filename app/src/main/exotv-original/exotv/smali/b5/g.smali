.class public final Lb5/g;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public n:I


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
    invoke-virtual {p0, p1, p2}, Lb5/g;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lb5/g;

    .line 10
    .line 11
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lb5/g;->h(Ljava/lang/Object;)Ljava/lang/Object;

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
    new-instance p1, Lb5/g;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-direct {p1, v0, p2}, Lr6/h;-><init>(ILp6/c;)V

    .line 5
    .line 6
    .line 7
    return-object p1
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lq6/a;->j:Lq6/a;

    .line 2
    .line 3
    iget v1, p0, Lb5/g;->n:I

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
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

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
    sget-object p1, Lb5/l;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 27
    .line 28
    iput v2, p0, Lb5/g;->n:I

    .line 29
    .line 30
    sget-object p1, Lb5/l;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Ljava/lang/String;

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    sget-object p1, Li7/e0;->a:Lo7/e;

    .line 42
    .line 43
    sget-object p1, Lo7/d;->l:Lo7/d;

    .line 44
    .line 45
    new-instance v1, Lb5/k;

    .line 46
    .line 47
    const/4 v2, 0x2

    .line 48
    invoke-direct {v1, v2, v3}, Lb5/k;-><init>(ILp6/c;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1, v1, p0}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :goto_0
    if-ne p1, v0, :cond_3

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 59
    .line 60
    const-string v0, "/exel/appConfig.php"

    .line 61
    .line 62
    invoke-static {p1, v0}, La1/a1;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance v0, Lokhttp3/g0$a;

    .line 67
    .line 68
    invoke-direct {v0}, Lokhttp3/g0$a;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p1}, Lokhttp3/g0$a;->url(Ljava/lang/String;)Lokhttp3/g0$a;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    const-string v0, "User-Agent"

    .line 76
    .line 77
    const-string v1, "okhttp/4.12.0"

    .line 78
    .line 79
    invoke-virtual {p1, v0, v1}, Lokhttp3/g0$a;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/g0$a;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1}, Lokhttp3/g0$a;->build()Lokhttp3/g0;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    sget-object v0, Lb5/m;->a:Lokhttp3/e0;

    .line 88
    .line 89
    invoke-virtual {v0, p1}, Lokhttp3/e0;->newCall(Lokhttp3/g0;)Lokhttp3/g;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-interface {p1}, Lokhttp3/g;->execute()Lokhttp3/i0;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    :try_start_0
    invoke-virtual {p1}, Lokhttp3/i0;->body()Lokhttp3/j0;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-eqz v0, :cond_4

    .line 102
    .line 103
    invoke-virtual {v0}, Lokhttp3/j0;->string()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    goto :goto_2

    .line 108
    :catchall_0
    move-exception v0

    .line 109
    goto :goto_3

    .line 110
    :cond_4
    :goto_2
    if-nez v3, :cond_5

    .line 111
    .line 112
    const-string v3, ""

    .line 113
    .line 114
    :cond_5
    new-instance v0, Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v3}, Lt2/i0;->a(Ljava/lang/String;)[B

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-static {v1}, Lt2/i0;->I([B)[B

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    sget-object v2, Lh7/a;->a:Ljava/nio/charset/Charset;

    .line 125
    .line 126
    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 127
    .line 128
    .line 129
    new-instance v1, Lorg/json/JSONObject;

    .line 130
    .line 131
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v1}, Lb5/h;->a(Lorg/json/JSONObject;)Lb5/i;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    sput-object v0, Lb5/h;->a:Lb5/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    .line 140
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    .line 141
    .line 142
    .line 143
    return-object v0

    .line 144
    :goto_3
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 145
    :catchall_1
    move-exception v1

    .line 146
    invoke-static {p1, v0}, Lt5/a;->b(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    throw v1
.end method
