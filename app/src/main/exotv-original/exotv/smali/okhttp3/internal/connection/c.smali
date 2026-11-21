.class public final Lokhttp3/internal/connection/c;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/connection/c$a;,
        Lokhttp3/internal/connection/c$b;
    }
.end annotation


# instance fields
.field private final call:Lokhttp3/internal/connection/e;

.field private final codec:Lokhttp3/internal/http/f;

.field private final connection:Lokhttp3/internal/connection/f;

.field private final eventListener:Lokhttp3/v;

.field private final finder:Lokhttp3/internal/connection/d;

.field private hasFailure:Z

.field private isDuplex:Z


# direct methods
.method public constructor <init>(Lokhttp3/internal/connection/e;Lokhttp3/v;Lokhttp3/internal/connection/d;Lokhttp3/internal/http/f;)V
    .locals 1

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "eventListener"

    .line 7
    .line 8
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "finder"

    .line 12
    .line 13
    invoke-static {v0, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "codec"

    .line 17
    .line 18
    invoke-static {v0, p4}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lokhttp3/internal/connection/c;->call:Lokhttp3/internal/connection/e;

    .line 25
    .line 26
    iput-object p2, p0, Lokhttp3/internal/connection/c;->eventListener:Lokhttp3/v;

    .line 27
    .line 28
    iput-object p3, p0, Lokhttp3/internal/connection/c;->finder:Lokhttp3/internal/connection/d;

    .line 29
    .line 30
    iput-object p4, p0, Lokhttp3/internal/connection/c;->codec:Lokhttp3/internal/http/f;

    .line 31
    .line 32
    invoke-interface {p4}, Lokhttp3/internal/http/f;->getConnection()Lokhttp3/internal/connection/f;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lokhttp3/internal/connection/c;->connection:Lokhttp3/internal/connection/f;

    .line 37
    .line 38
    return-void
.end method

.method private final trackFailure(Ljava/io/IOException;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lokhttp3/internal/connection/c;->hasFailure:Z

    .line 3
    .line 4
    iget-object v0, p0, Lokhttp3/internal/connection/c;->finder:Lokhttp3/internal/connection/d;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lokhttp3/internal/connection/d;->trackFailure(Ljava/io/IOException;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lokhttp3/internal/connection/c;->codec:Lokhttp3/internal/http/f;

    .line 10
    .line 11
    invoke-interface {v0}, Lokhttp3/internal/http/f;->getConnection()Lokhttp3/internal/connection/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lokhttp3/internal/connection/c;->call:Lokhttp3/internal/connection/e;

    .line 16
    .line 17
    invoke-virtual {v0, v1, p1}, Lokhttp3/internal/connection/f;->trackFailure$okhttp(Lokhttp3/internal/connection/e;Ljava/io/IOException;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final bodyComplete(JZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/io/IOException;",
            ">(JZZTE;)TE;"
        }
    .end annotation

    .line 1
    if-eqz p5, :cond_0

    .line 2
    .line 3
    invoke-direct {p0, p5}, Lokhttp3/internal/connection/c;->trackFailure(Ljava/io/IOException;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    if-eqz p4, :cond_2

    .line 7
    .line 8
    if-eqz p5, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lokhttp3/internal/connection/c;->eventListener:Lokhttp3/v;

    .line 11
    .line 12
    iget-object v1, p0, Lokhttp3/internal/connection/c;->call:Lokhttp3/internal/connection/e;

    .line 13
    .line 14
    invoke-virtual {v0, v1, p5}, Lokhttp3/v;->requestFailed(Lokhttp3/g;Ljava/io/IOException;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/connection/c;->eventListener:Lokhttp3/v;

    .line 19
    .line 20
    iget-object v1, p0, Lokhttp3/internal/connection/c;->call:Lokhttp3/internal/connection/e;

    .line 21
    .line 22
    invoke-virtual {v0, v1, p1, p2}, Lokhttp3/v;->requestBodyEnd(Lokhttp3/g;J)V

    .line 23
    .line 24
    .line 25
    :cond_2
    :goto_0
    if-eqz p3, :cond_4

    .line 26
    .line 27
    if-eqz p5, :cond_3

    .line 28
    .line 29
    iget-object p1, p0, Lokhttp3/internal/connection/c;->eventListener:Lokhttp3/v;

    .line 30
    .line 31
    iget-object p2, p0, Lokhttp3/internal/connection/c;->call:Lokhttp3/internal/connection/e;

    .line 32
    .line 33
    invoke-virtual {p1, p2, p5}, Lokhttp3/v;->responseFailed(Lokhttp3/g;Ljava/io/IOException;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_3
    iget-object v0, p0, Lokhttp3/internal/connection/c;->eventListener:Lokhttp3/v;

    .line 38
    .line 39
    iget-object v1, p0, Lokhttp3/internal/connection/c;->call:Lokhttp3/internal/connection/e;

    .line 40
    .line 41
    invoke-virtual {v0, v1, p1, p2}, Lokhttp3/v;->responseBodyEnd(Lokhttp3/g;J)V

    .line 42
    .line 43
    .line 44
    :cond_4
    :goto_1
    iget-object p1, p0, Lokhttp3/internal/connection/c;->call:Lokhttp3/internal/connection/e;

    .line 45
    .line 46
    invoke-virtual {p1, p0, p4, p3, p5}, Lokhttp3/internal/connection/e;->messageDone$okhttp(Lokhttp3/internal/connection/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1
.end method

.method public final cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/c;->codec:Lokhttp3/internal/http/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lokhttp3/internal/http/f;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final createRequestBody(Lokhttp3/g0;Z)Lv7/i0;
    .locals 3

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-boolean p2, p0, Lokhttp3/internal/connection/c;->isDuplex:Z

    .line 7
    .line 8
    invoke-virtual {p1}, Lokhttp3/g0;->body()Lokhttp3/h0;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-static {p2}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Lokhttp3/h0;->contentLength()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iget-object p2, p0, Lokhttp3/internal/connection/c;->eventListener:Lokhttp3/v;

    .line 20
    .line 21
    iget-object v2, p0, Lokhttp3/internal/connection/c;->call:Lokhttp3/internal/connection/e;

    .line 22
    .line 23
    invoke-virtual {p2, v2}, Lokhttp3/v;->requestBodyStart(Lokhttp3/g;)V

    .line 24
    .line 25
    .line 26
    iget-object p2, p0, Lokhttp3/internal/connection/c;->codec:Lokhttp3/internal/http/f;

    .line 27
    .line 28
    invoke-interface {p2, p1, v0, v1}, Lokhttp3/internal/http/f;->createRequestBody(Lokhttp3/g0;J)Lv7/i0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance p2, Lokhttp3/internal/connection/c$a;

    .line 33
    .line 34
    invoke-direct {p2, p0, p1, v0, v1}, Lokhttp3/internal/connection/c$a;-><init>(Lokhttp3/internal/connection/c;Lv7/i0;J)V

    .line 35
    .line 36
    .line 37
    return-object p2
.end method

.method public final detachWithViolence()V
    .locals 3

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/c;->codec:Lokhttp3/internal/http/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lokhttp3/internal/http/f;->cancel()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/internal/connection/c;->call:Lokhttp3/internal/connection/e;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, p0, v1, v1, v2}, Lokhttp3/internal/connection/e;->messageDone$okhttp(Lokhttp3/internal/connection/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final finishRequest()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/connection/c;->codec:Lokhttp3/internal/http/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lokhttp3/internal/http/f;->finishRequest()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception v0

    .line 8
    iget-object v1, p0, Lokhttp3/internal/connection/c;->eventListener:Lokhttp3/v;

    .line 9
    .line 10
    iget-object v2, p0, Lokhttp3/internal/connection/c;->call:Lokhttp3/internal/connection/e;

    .line 11
    .line 12
    invoke-virtual {v1, v2, v0}, Lokhttp3/v;->requestFailed(Lokhttp3/g;Ljava/io/IOException;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, Lokhttp3/internal/connection/c;->trackFailure(Ljava/io/IOException;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public final flushRequest()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/connection/c;->codec:Lokhttp3/internal/http/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lokhttp3/internal/http/f;->flushRequest()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception v0

    .line 8
    iget-object v1, p0, Lokhttp3/internal/connection/c;->eventListener:Lokhttp3/v;

    .line 9
    .line 10
    iget-object v2, p0, Lokhttp3/internal/connection/c;->call:Lokhttp3/internal/connection/e;

    .line 11
    .line 12
    invoke-virtual {v1, v2, v0}, Lokhttp3/v;->requestFailed(Lokhttp3/g;Ljava/io/IOException;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, Lokhttp3/internal/connection/c;->trackFailure(Ljava/io/IOException;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public final getCall$okhttp()Lokhttp3/internal/connection/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/c;->call:Lokhttp3/internal/connection/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getConnection$okhttp()Lokhttp3/internal/connection/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/c;->connection:Lokhttp3/internal/connection/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getEventListener$okhttp()Lokhttp3/v;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/c;->eventListener:Lokhttp3/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFinder$okhttp()Lokhttp3/internal/connection/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/c;->finder:Lokhttp3/internal/connection/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getHasFailure$okhttp()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/connection/c;->hasFailure:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isCoalescedConnection$okhttp()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/c;->finder:Lokhttp3/internal/connection/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokhttp3/internal/connection/d;->getAddress$okhttp()Lokhttp3/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lokhttp3/a;->url()Lokhttp3/z;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lokhttp3/z;->host()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lokhttp3/internal/connection/c;->connection:Lokhttp3/internal/connection/f;

    .line 16
    .line 17
    invoke-virtual {v1}, Lokhttp3/internal/connection/f;->route()Lokhttp3/k0;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Lokhttp3/k0;->address()Lokhttp3/a;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Lokhttp3/a;->url()Lokhttp3/z;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Lokhttp3/z;->host()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v0, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    xor-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    return v0
.end method

.method public final isDuplex$okhttp()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/connection/c;->isDuplex:Z

    .line 2
    .line 3
    return v0
.end method

.method public final newWebSocketStreams()Lokhttp3/internal/ws/d$d;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/c;->call:Lokhttp3/internal/connection/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokhttp3/internal/connection/e;->timeoutEarlyExit()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/internal/connection/c;->codec:Lokhttp3/internal/http/f;

    .line 7
    .line 8
    invoke-interface {v0}, Lokhttp3/internal/http/f;->getConnection()Lokhttp3/internal/connection/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p0}, Lokhttp3/internal/connection/f;->newWebSocketStreams$okhttp(Lokhttp3/internal/connection/c;)Lokhttp3/internal/ws/d$d;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public final noNewExchangesOnConnection()V
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/c;->codec:Lokhttp3/internal/http/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lokhttp3/internal/http/f;->getConnection()Lokhttp3/internal/connection/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lokhttp3/internal/connection/f;->noNewExchanges$okhttp()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final noRequestBody()V
    .locals 4

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/c;->call:Lokhttp3/internal/connection/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    invoke-virtual {v0, p0, v3, v1, v2}, Lokhttp3/internal/connection/e;->messageDone$okhttp(Lokhttp3/internal/connection/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final openResponseBody(Lokhttp3/i0;)Lokhttp3/j0;
    .locals 4

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    const-string v0, "Content-Type"

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {p1, v0, v2, v1, v2}, Lokhttp3/i0;->header$default(Lokhttp3/i0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lokhttp3/internal/connection/c;->codec:Lokhttp3/internal/http/f;

    .line 15
    .line 16
    invoke-interface {v1, p1}, Lokhttp3/internal/http/f;->reportedContentLength(Lokhttp3/i0;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    iget-object v3, p0, Lokhttp3/internal/connection/c;->codec:Lokhttp3/internal/http/f;

    .line 21
    .line 22
    invoke-interface {v3, p1}, Lokhttp3/internal/http/f;->openResponseBodySource(Lokhttp3/i0;)Lv7/k0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v3, Lokhttp3/internal/connection/c$b;

    .line 27
    .line 28
    invoke-direct {v3, p0, p1, v1, v2}, Lokhttp3/internal/connection/c$b;-><init>(Lokhttp3/internal/connection/c;Lv7/k0;J)V

    .line 29
    .line 30
    .line 31
    new-instance p1, Lokhttp3/internal/http/j;

    .line 32
    .line 33
    invoke-static {v3}, Lv7/b;->c(Lv7/k0;)Lv7/e0;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-direct {p1, v0, v1, v2, v3}, Lokhttp3/internal/http/j;-><init>(Ljava/lang/String;JLv7/l;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    return-object p1

    .line 41
    :catch_0
    move-exception p1

    .line 42
    iget-object v0, p0, Lokhttp3/internal/connection/c;->eventListener:Lokhttp3/v;

    .line 43
    .line 44
    iget-object v1, p0, Lokhttp3/internal/connection/c;->call:Lokhttp3/internal/connection/e;

    .line 45
    .line 46
    invoke-virtual {v0, v1, p1}, Lokhttp3/v;->responseFailed(Lokhttp3/g;Ljava/io/IOException;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, p1}, Lokhttp3/internal/connection/c;->trackFailure(Ljava/io/IOException;)V

    .line 50
    .line 51
    .line 52
    throw p1
.end method

.method public final readResponseHeaders(Z)Lokhttp3/i0$a;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/connection/c;->codec:Lokhttp3/internal/http/f;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lokhttp3/internal/http/f;->readResponseHeaders(Z)Lokhttp3/i0$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Lokhttp3/i0$a;->initExchange$okhttp(Lokhttp3/internal/connection/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    return-object p1

    .line 13
    :catch_0
    move-exception p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-object p1

    .line 16
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/connection/c;->eventListener:Lokhttp3/v;

    .line 17
    .line 18
    iget-object v1, p0, Lokhttp3/internal/connection/c;->call:Lokhttp3/internal/connection/e;

    .line 19
    .line 20
    invoke-virtual {v0, v1, p1}, Lokhttp3/v;->responseFailed(Lokhttp3/g;Ljava/io/IOException;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p1}, Lokhttp3/internal/connection/c;->trackFailure(Ljava/io/IOException;)V

    .line 24
    .line 25
    .line 26
    throw p1
.end method

.method public final responseHeadersEnd(Lokhttp3/i0;)V
    .locals 2

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/internal/connection/c;->eventListener:Lokhttp3/v;

    .line 7
    .line 8
    iget-object v1, p0, Lokhttp3/internal/connection/c;->call:Lokhttp3/internal/connection/e;

    .line 9
    .line 10
    invoke-virtual {v0, v1, p1}, Lokhttp3/v;->responseHeadersEnd(Lokhttp3/g;Lokhttp3/i0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final responseHeadersStart()V
    .locals 2

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/c;->eventListener:Lokhttp3/v;

    .line 2
    .line 3
    iget-object v1, p0, Lokhttp3/internal/connection/c;->call:Lokhttp3/internal/connection/e;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lokhttp3/v;->responseHeadersStart(Lokhttp3/g;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final trailers()Lokhttp3/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/c;->codec:Lokhttp3/internal/http/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lokhttp3/internal/http/f;->trailers()Lokhttp3/y;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final webSocketUpgradeFailed()V
    .locals 6

    .line 1
    const/4 v4, 0x1

    .line 2
    const/4 v5, 0x0

    .line 3
    const-wide/16 v1, -0x1

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    move-object v0, p0

    .line 7
    invoke-virtual/range {v0 .. v5}, Lokhttp3/internal/connection/c;->bodyComplete(JZZLjava/io/IOException;)Ljava/io/IOException;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final writeRequestHeaders(Lokhttp3/g0;)V
    .locals 2

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/connection/c;->eventListener:Lokhttp3/v;

    .line 7
    .line 8
    iget-object v1, p0, Lokhttp3/internal/connection/c;->call:Lokhttp3/internal/connection/e;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lokhttp3/v;->requestHeadersStart(Lokhttp3/g;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lokhttp3/internal/connection/c;->codec:Lokhttp3/internal/http/f;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Lokhttp3/internal/http/f;->writeRequestHeaders(Lokhttp3/g0;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lokhttp3/internal/connection/c;->eventListener:Lokhttp3/v;

    .line 19
    .line 20
    iget-object v1, p0, Lokhttp3/internal/connection/c;->call:Lokhttp3/internal/connection/e;

    .line 21
    .line 22
    invoke-virtual {v0, v1, p1}, Lokhttp3/v;->requestHeadersEnd(Lokhttp3/g;Lokhttp3/g0;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception p1

    .line 27
    iget-object v0, p0, Lokhttp3/internal/connection/c;->eventListener:Lokhttp3/v;

    .line 28
    .line 29
    iget-object v1, p0, Lokhttp3/internal/connection/c;->call:Lokhttp3/internal/connection/e;

    .line 30
    .line 31
    invoke-virtual {v0, v1, p1}, Lokhttp3/v;->requestFailed(Lokhttp3/g;Ljava/io/IOException;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, p1}, Lokhttp3/internal/connection/c;->trackFailure(Ljava/io/IOException;)V

    .line 35
    .line 36
    .line 37
    throw p1
.end method
