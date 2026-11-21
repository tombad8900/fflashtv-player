.class public final Lz4/f;
.super Lr6/h;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Lb5/i;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lb5/i;Lp6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz4/f;->n:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lz4/f;->o:Lb5/i;

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
    invoke-virtual {p0, p1, p2}, Lz4/f;->g(Ljava/lang/Object;Lp6/c;)Lp6/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lz4/f;

    .line 10
    .line 11
    sget-object p2, Ll6/j;->a:Ll6/j;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lz4/f;->h(Ljava/lang/Object;)Ljava/lang/Object;

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
    new-instance p1, Lz4/f;

    .line 2
    .line 3
    iget-object v0, p0, Lz4/f;->n:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lz4/f;->o:Lb5/i;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lz4/f;-><init>(Ljava/lang/String;Lb5/i;Lp6/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    const-string v0, "User-Agent"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    sget-object v2, Lq6/a;->j:Lq6/a;

    .line 6
    .line 7
    invoke-static {p1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :try_start_0
    new-instance p1, Lokhttp3/g0$a;

    .line 11
    .line 12
    invoke-direct {p1}, Lokhttp3/g0$a;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Lz4/f;->n:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p1, v2}, Lokhttp3/g0$a;->url(Ljava/lang/String;)Lokhttp3/g0$a;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget-object v2, Lz4/k;->a:Lz4/k;

    .line 22
    .line 23
    iget-object v2, p0, Lz4/f;->o:Lb5/i;

    .line 24
    .line 25
    iget-object v2, v2, Lb5/i;->p:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/String;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-static {v2}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-nez v4, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move-object v2, v3

    .line 44
    :goto_0
    if-nez v2, :cond_2

    .line 45
    .line 46
    :cond_1
    const-string v2, "okhttp/5.4.0"

    .line 47
    .line 48
    :cond_2
    invoke-virtual {p1, v0, v2}, Lokhttp3/g0$a;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/g0$a;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Lokhttp3/g0$a;->build()Lokhttp3/g0;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    sget-object v0, Lb5/m;->a:Lokhttp3/e0;

    .line 57
    .line 58
    invoke-virtual {v0, p1}, Lokhttp3/e0;->newCall(Lokhttp3/g0;)Lokhttp3/g;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {p1}, Lokhttp3/g;->execute()Lokhttp3/i0;

    .line 63
    .line 64
    .line 65
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 66
    :try_start_1
    invoke-virtual {p1}, Lokhttp3/i0;->body()Lokhttp3/j0;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    invoke-virtual {v0}, Lokhttp3/j0;->string()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    goto :goto_1

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    goto :goto_2

    .line 79
    :cond_3
    :goto_1
    if-nez v3, :cond_4

    .line 80
    .line 81
    move-object v3, v1

    .line 82
    :cond_4
    invoke-static {v3}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 91
    .line 92
    .line 93
    return-object v0

    .line 94
    :goto_2
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 95
    :catchall_1
    move-exception v2

    .line 96
    :try_start_4
    invoke-static {p1, v0}, Lt5/a;->b(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 100
    :catchall_2
    return-object v1
.end method
