.class public final Lokhttp3/d$b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lz6/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lokhttp3/d$b;-><init>()V

    return-void
.end method

.method private final varyFields(Lokhttp3/y;)Ljava/util/Set;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/y;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lokhttp3/y;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-ge v3, v0, :cond_3

    .line 9
    .line 10
    const-string v4, "Vary"

    .line 11
    .line 12
    invoke-virtual {p1, v3}, Lokhttp3/y;->name(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    invoke-virtual {p1, v3}, Lokhttp3/y;->value(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    new-instance v1, Ljava/util/TreeSet;

    .line 30
    .line 31
    const-string v5, "CASE_INSENSITIVE_ORDER"

    .line 32
    .line 33
    sget-object v6, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    .line 34
    .line 35
    invoke-static {v5, v6}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v1, v6}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    const/4 v5, 0x1

    .line 42
    new-array v5, v5, [C

    .line 43
    .line 44
    const/16 v6, 0x2c

    .line 45
    .line 46
    aput-char v6, v5, v2

    .line 47
    .line 48
    invoke-static {v4, v5}, Lh7/h;->L0(Ljava/lang/String;[C)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_2

    .line 61
    .line 62
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    check-cast v5, Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v5}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-interface {v1, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    if-nez v1, :cond_4

    .line 84
    .line 85
    sget-object p1, Lm6/r;->j:Lm6/r;

    .line 86
    .line 87
    return-object p1

    .line 88
    :cond_4
    return-object v1
.end method

.method private final varyHeaders(Lokhttp3/y;Lokhttp3/y;)Lokhttp3/y;
    .locals 5

    .line 4
    invoke-direct {p0, p2}, Lokhttp3/d$b;->varyFields(Lokhttp3/y;)Ljava/util/Set;

    move-result-object p2

    .line 5
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lq7/c;->EMPTY_HEADERS:Lokhttp3/y;

    return-object p1

    .line 6
    :cond_0
    new-instance v0, Lokhttp3/y$a;

    invoke-direct {v0}, Lokhttp3/y$a;-><init>()V

    .line 7
    invoke-virtual {p1}, Lokhttp3/y;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 8
    invoke-virtual {p1, v2}, Lokhttp3/y;->name(I)Ljava/lang/String;

    move-result-object v3

    .line 9
    invoke-interface {p2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 10
    invoke-virtual {p1, v2}, Lokhttp3/y;->value(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lokhttp3/y$a;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/y$a;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 11
    :cond_2
    invoke-virtual {v0}, Lokhttp3/y$a;->build()Lokhttp3/y;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final hasVaryAll(Lokhttp3/i0;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lokhttp3/i0;->headers()Lokhttp3/y;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-direct {p0, p1}, Lokhttp3/d$b;->varyFields(Lokhttp3/y;)Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "*"

    .line 15
    .line 16
    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
.end method

.method public final key(Lokhttp3/z;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lv7/m;->m:Lv7/m;

    .line 7
    .line 8
    invoke-virtual {p1}, Lokhttp3/z;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lk2/b;->p(Ljava/lang/String;)Lv7/m;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "MD5"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lv7/m;->c(Ljava/lang/String;)Lv7/m;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Lv7/m;->e()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method public final readInt$okhttp(Lv7/l;)I
    .locals 5

    .line 1
    const-string v0, "expected an int but was \""

    .line 2
    .line 3
    const-string v1, "source"

    .line 4
    .line 5
    invoke-static {v1, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-interface {p1}, Lv7/l;->m()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-interface {p1}, Lv7/l;->v()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    cmp-long v3, v1, v3

    .line 19
    .line 20
    if-ltz v3, :cond_0

    .line 21
    .line 22
    const-wide/32 v3, 0x7fffffff

    .line 23
    .line 24
    .line 25
    cmp-long v3, v1, v3

    .line 26
    .line 27
    if-gtz v3, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-gtz v3, :cond_0

    .line 34
    .line 35
    long-to-int p1, v1

    .line 36
    return p1

    .line 37
    :catch_0
    move-exception p1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance v3, Ljava/io/IOException;

    .line 40
    .line 41
    new-instance v4, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const/16 p1, 0x22

    .line 53
    .line 54
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-direct {v3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    :goto_0
    new-instance v0, Ljava/io/IOException;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v0
.end method

.method public final varyHeaders(Lokhttp3/i0;)Lokhttp3/y;
    .locals 1

    const-string v0, "<this>"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1
    invoke-virtual {p1}, Lokhttp3/i0;->networkResponse()Lokhttp3/i0;

    move-result-object v0

    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lokhttp3/i0;->request()Lokhttp3/g0;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/g0;->headers()Lokhttp3/y;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lokhttp3/i0;->headers()Lokhttp3/y;

    move-result-object p1

    .line 3
    invoke-direct {p0, v0, p1}, Lokhttp3/d$b;->varyHeaders(Lokhttp3/y;Lokhttp3/y;)Lokhttp3/y;

    move-result-object p1

    return-object p1
.end method

.method public final varyMatches(Lokhttp3/i0;Lokhttp3/y;Lokhttp3/g0;)Z
    .locals 3

    .line 1
    const-string v0, "cachedResponse"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "cachedRequest"

    .line 7
    .line 8
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "newRequest"

    .line 12
    .line 13
    invoke-static {v0, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lokhttp3/i0;->headers()Lokhttp3/y;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {p0, p1}, Lokhttp3/d$b;->varyFields(Lokhttp3/y;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/4 v0, 0x1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    return v0

    .line 34
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p2, v1}, Lokhttp3/y;->values(Ljava/lang/String;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {p3, v1}, Lokhttp3/g0;->headers(Ljava/lang/String;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v2, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_1

    .line 63
    .line 64
    const/4 p1, 0x0

    .line 65
    return p1

    .line 66
    :cond_2
    return v0
.end method
