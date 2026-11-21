.class public final Lokhttp3/internal/connection/e;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lokhttp3/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/connection/e$a;,
        Lokhttp3/internal/connection/e$b;
    }
.end annotation


# instance fields
.field private callStackTrace:Ljava/lang/Object;

.field private volatile canceled:Z

.field private final client:Lokhttp3/e0;

.field private connection:Lokhttp3/internal/connection/f;

.field private final connectionPool:Lokhttp3/internal/connection/h;

.field private volatile connectionToCancel:Lokhttp3/internal/connection/f;

.field private final eventListener:Lokhttp3/v;

.field private volatile exchange:Lokhttp3/internal/connection/c;

.field private exchangeFinder:Lokhttp3/internal/connection/d;

.field private final executed:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private expectMoreExchanges:Z

.field private final forWebSocket:Z

.field private interceptorScopedExchange:Lokhttp3/internal/connection/c;

.field private final originalRequest:Lokhttp3/g0;

.field private requestBodyOpen:Z

.field private responseBodyOpen:Z

.field private final timeout:Lokhttp3/internal/connection/e$c;

.field private timeoutEarlyExit:Z


# direct methods
.method public constructor <init>(Lokhttp3/e0;Lokhttp3/g0;Z)V
    .locals 2

    .line 1
    const-string v0, "client"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "originalRequest"

    .line 7
    .line 8
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 15
    .line 16
    iput-object p2, p0, Lokhttp3/internal/connection/e;->originalRequest:Lokhttp3/g0;

    .line 17
    .line 18
    iput-boolean p3, p0, Lokhttp3/internal/connection/e;->forWebSocket:Z

    .line 19
    .line 20
    invoke-virtual {p1}, Lokhttp3/e0;->connectionPool()Lokhttp3/m;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p2}, Lokhttp3/m;->getDelegate$okhttp()Lokhttp3/internal/connection/h;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    iput-object p2, p0, Lokhttp3/internal/connection/e;->connectionPool:Lokhttp3/internal/connection/h;

    .line 29
    .line 30
    invoke-virtual {p1}, Lokhttp3/e0;->eventListenerFactory()Lokhttp3/w;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    check-cast p2, Landroidx/media3/exoplayer/source/preload/a;

    .line 35
    .line 36
    iget-object p2, p2, Landroidx/media3/exoplayer/source/preload/a;->k:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p2, Lokhttp3/v;

    .line 39
    .line 40
    invoke-static {p2, p0}, Lq7/c;->a(Lokhttp3/v;Lokhttp3/g;)Lokhttp3/v;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iput-object p2, p0, Lokhttp3/internal/connection/e;->eventListener:Lokhttp3/v;

    .line 45
    .line 46
    new-instance p2, Lokhttp3/internal/connection/e$c;

    .line 47
    .line 48
    invoke-direct {p2, p0}, Lokhttp3/internal/connection/e$c;-><init>(Lokhttp3/internal/connection/e;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lokhttp3/e0;->callTimeoutMillis()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    int-to-long v0, p1

    .line 56
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 57
    .line 58
    invoke-virtual {p2, v0, v1, p1}, Lv7/n0;->timeout(JLjava/util/concurrent/TimeUnit;)Lv7/n0;

    .line 59
    .line 60
    .line 61
    iput-object p2, p0, Lokhttp3/internal/connection/e;->timeout:Lokhttp3/internal/connection/e$c;

    .line 62
    .line 63
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 64
    .line 65
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Lokhttp3/internal/connection/e;->executed:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 69
    .line 70
    const/4 p1, 0x1

    .line 71
    iput-boolean p1, p0, Lokhttp3/internal/connection/e;->expectMoreExchanges:Z

    .line 72
    .line 73
    return-void
.end method

.method public static final synthetic access$getTimeout$p(Lokhttp3/internal/connection/e;)Lokhttp3/internal/connection/e$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/connection/e;->timeout:Lokhttp3/internal/connection/e$c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$toLoggableString(Lokhttp3/internal/connection/e;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lokhttp3/internal/connection/e;->toLoggableString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final callDone(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/io/IOException;",
            ">(TE;)TE;"
        }
    .end annotation

    .line 1
    sget-boolean v0, Lq7/c;->assertionsEnabled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 13
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v1, "Thread "

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, " MUST NOT hold lock on "

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    :goto_0
    iget-object v1, p0, Lokhttp3/internal/connection/e;->connection:Lokhttp3/internal/connection/f;

    .line 49
    .line 50
    if-eqz v1, :cond_7

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    invoke-static {v1}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 62
    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v2, "Thread "

    .line 66
    .line 67
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v2, " MUST NOT hold lock on "

    .line 82
    .line 83
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    throw p1

    .line 97
    :cond_3
    :goto_1
    monitor-enter v1

    .line 98
    :try_start_0
    invoke-virtual {p0}, Lokhttp3/internal/connection/e;->releaseConnectionNoEvents$okhttp()Ljava/net/Socket;

    .line 99
    .line 100
    .line 101
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    monitor-exit v1

    .line 103
    iget-object v2, p0, Lokhttp3/internal/connection/e;->connection:Lokhttp3/internal/connection/f;

    .line 104
    .line 105
    if-nez v2, :cond_5

    .line 106
    .line 107
    if-eqz v0, :cond_4

    .line 108
    .line 109
    invoke-static {v0}, Lq7/c;->closeQuietly(Ljava/net/Socket;)V

    .line 110
    .line 111
    .line 112
    :cond_4
    iget-object v0, p0, Lokhttp3/internal/connection/e;->eventListener:Lokhttp3/v;

    .line 113
    .line 114
    invoke-virtual {v0, p0, v1}, Lokhttp3/v;->connectionReleased(Lokhttp3/g;Lokhttp3/l;)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_5
    if-nez v0, :cond_6

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_6
    const-string p1, "Check failed."

    .line 122
    .line 123
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 124
    .line 125
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v0

    .line 129
    :catchall_0
    move-exception p1

    .line 130
    monitor-exit v1

    .line 131
    throw p1

    .line 132
    :cond_7
    :goto_2
    invoke-direct {p0, p1}, Lokhttp3/internal/connection/e;->timeoutExit(Ljava/io/IOException;)Ljava/io/IOException;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    if-eqz p1, :cond_8

    .line 137
    .line 138
    iget-object p1, p0, Lokhttp3/internal/connection/e;->eventListener:Lokhttp3/v;

    .line 139
    .line 140
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, p0, v0}, Lokhttp3/v;->callFailed(Lokhttp3/g;Ljava/io/IOException;)V

    .line 144
    .line 145
    .line 146
    return-object v0

    .line 147
    :cond_8
    iget-object p1, p0, Lokhttp3/internal/connection/e;->eventListener:Lokhttp3/v;

    .line 148
    .line 149
    invoke-virtual {p1, p0}, Lokhttp3/v;->callEnd(Lokhttp3/g;)V

    .line 150
    .line 151
    .line 152
    return-object v0
.end method

.method private final callStart()V
    .locals 2

    .line 1
    sget-object v0, Ls7/h;->Companion:Ls7/h$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls7/h$a;->get()Ls7/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "response.body().close()"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ls7/h;->getStackTraceForCloseable(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lokhttp3/internal/connection/e;->callStackTrace:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v0, p0, Lokhttp3/internal/connection/e;->eventListener:Lokhttp3/v;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lokhttp3/v;->callStart(Lokhttp3/g;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private final createAddress(Lokhttp3/z;)Lokhttp3/a;
    .locals 14

    .line 1
    invoke-virtual {p1}, Lokhttp3/z;->isHttps()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 8
    .line 9
    invoke-virtual {v0}, Lokhttp3/e0;->sslSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 14
    .line 15
    invoke-virtual {v1}, Lokhttp3/e0;->hostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 20
    .line 21
    invoke-virtual {v2}, Lokhttp3/e0;->certificatePinner()Lokhttp3/i;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    move-object v6, v0

    .line 26
    move-object v7, v1

    .line 27
    move-object v8, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    move-object v6, v0

    .line 31
    move-object v7, v6

    .line 32
    move-object v8, v7

    .line 33
    :goto_0
    new-instance v1, Lokhttp3/a;

    .line 34
    .line 35
    invoke-virtual {p1}, Lokhttp3/z;->host()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p1}, Lokhttp3/z;->port()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    iget-object p1, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 44
    .line 45
    invoke-virtual {p1}, Lokhttp3/e0;->dns()Lokhttp3/u;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    iget-object p1, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 50
    .line 51
    invoke-virtual {p1}, Lokhttp3/e0;->socketFactory()Ljavax/net/SocketFactory;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    iget-object p1, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 56
    .line 57
    invoke-virtual {p1}, Lokhttp3/e0;->proxyAuthenticator()Lokhttp3/c;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    iget-object p1, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 62
    .line 63
    invoke-virtual {p1}, Lokhttp3/e0;->proxy()Ljava/net/Proxy;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    iget-object p1, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 68
    .line 69
    invoke-virtual {p1}, Lokhttp3/e0;->protocols()Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v11

    .line 73
    iget-object p1, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 74
    .line 75
    invoke-virtual {p1}, Lokhttp3/e0;->connectionSpecs()Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v12

    .line 79
    iget-object p1, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 80
    .line 81
    invoke-virtual {p1}, Lokhttp3/e0;->proxySelector()Ljava/net/ProxySelector;

    .line 82
    .line 83
    .line 84
    move-result-object v13

    .line 85
    invoke-direct/range {v1 .. v13}, Lokhttp3/a;-><init>(Ljava/lang/String;ILokhttp3/u;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/i;Lokhttp3/c;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    .line 86
    .line 87
    .line 88
    return-object v1
.end method

.method private final timeoutExit(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/io/IOException;",
            ">(TE;)TE;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/connection/e;->timeoutEarlyExit:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/connection/e;->timeout:Lokhttp3/internal/connection/e$c;

    .line 7
    .line 8
    invoke-virtual {v0}, Lv7/f;->exit()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    :goto_0
    return-object p1

    .line 15
    :cond_1
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 16
    .line 17
    const-string v1, "timeout"

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 25
    .line 26
    .line 27
    :cond_2
    return-object v0
.end method

.method private final toLoggableString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lokhttp3/internal/connection/e;->isCanceled()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const-string v1, "canceled "

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v1, ""

    .line 16
    .line 17
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-boolean v1, p0, Lokhttp3/internal/connection/e;->forWebSocket:Z

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    const-string v1, "web socket"

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const-string v1, "call"

    .line 28
    .line 29
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, " to "

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lokhttp3/internal/connection/e;->redactedUrl$okhttp()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0
.end method


# virtual methods
.method public final acquireConnectionNoEvents(Lokhttp3/internal/connection/f;)V
    .locals 3

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-boolean v0, Lq7/c;->assertionsEnabled:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v2, "Thread "

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v2, " MUST hold lock on "

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    throw v0

    .line 53
    :cond_1
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/connection/e;->connection:Lokhttp3/internal/connection/f;

    .line 54
    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    iput-object p1, p0, Lokhttp3/internal/connection/e;->connection:Lokhttp3/internal/connection/f;

    .line 58
    .line 59
    invoke-virtual {p1}, Lokhttp3/internal/connection/f;->getCalls()Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    new-instance v0, Lokhttp3/internal/connection/e$b;

    .line 64
    .line 65
    iget-object v1, p0, Lokhttp3/internal/connection/e;->callStackTrace:Ljava/lang/Object;

    .line 66
    .line 67
    invoke-direct {v0, p0, v1}, Lokhttp3/internal/connection/e$b;-><init>(Lokhttp3/internal/connection/e;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    const-string v0, "Check failed."

    .line 77
    .line 78
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p1
.end method

.method public cancel()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/connection/e;->canceled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lokhttp3/internal/connection/e;->canceled:Z

    .line 8
    .line 9
    iget-object v0, p0, Lokhttp3/internal/connection/e;->exchange:Lokhttp3/internal/connection/c;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Lokhttp3/internal/connection/c;->cancel()V

    .line 14
    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/connection/e;->connectionToCancel:Lokhttp3/internal/connection/f;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {v0}, Lokhttp3/internal/connection/f;->cancel()V

    .line 21
    .line 22
    .line 23
    :cond_2
    iget-object v0, p0, Lokhttp3/internal/connection/e;->eventListener:Lokhttp3/v;

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Lokhttp3/v;->canceled(Lokhttp3/g;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokhttp3/internal/connection/e;->clone()Lokhttp3/internal/connection/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lokhttp3/g;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lokhttp3/internal/connection/e;->clone()Lokhttp3/internal/connection/e;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lokhttp3/internal/connection/e;
    .locals 4

    .line 3
    new-instance v0, Lokhttp3/internal/connection/e;

    iget-object v1, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    iget-object v2, p0, Lokhttp3/internal/connection/e;->originalRequest:Lokhttp3/g0;

    iget-boolean v3, p0, Lokhttp3/internal/connection/e;->forWebSocket:Z

    invoke-direct {v0, v1, v2, v3}, Lokhttp3/internal/connection/e;-><init>(Lokhttp3/e0;Lokhttp3/g0;Z)V

    return-object v0
.end method

.method public enqueue(Lokhttp3/h;)V
    .locals 3

    .line 1
    const-string v0, "responseCallback"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/internal/connection/e;->executed:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-direct {p0}, Lokhttp3/internal/connection/e;->callStart()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 20
    .line 21
    invoke-virtual {v0}, Lokhttp3/e0;->dispatcher()Lokhttp3/s;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Lokhttp3/internal/connection/e$a;

    .line 26
    .line 27
    invoke-direct {v1, p0, p1}, Lokhttp3/internal/connection/e$a;-><init>(Lokhttp3/internal/connection/e;Lokhttp3/h;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lokhttp3/s;->enqueue$okhttp(Lokhttp3/internal/connection/e$a;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v0, "Already Executed"

    .line 37
    .line 38
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1
.end method

.method public final enterNetworkInterceptorExchange(Lokhttp3/g0;Z)V
    .locals 2

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/internal/connection/e;->interceptorScopedExchange:Lokhttp3/internal/connection/c;

    .line 7
    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    monitor-enter p0

    .line 11
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/connection/e;->responseBodyOpen:Z

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    iget-boolean v0, p0, Lokhttp3/internal/connection/e;->requestBodyOpen:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    monitor-exit p0

    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    new-instance p2, Lokhttp3/internal/connection/d;

    .line 23
    .line 24
    iget-object v0, p0, Lokhttp3/internal/connection/e;->connectionPool:Lokhttp3/internal/connection/h;

    .line 25
    .line 26
    invoke-virtual {p1}, Lokhttp3/g0;->url()Lokhttp3/z;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {p0, p1}, Lokhttp3/internal/connection/e;->createAddress(Lokhttp3/z;)Lokhttp3/a;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object v1, p0, Lokhttp3/internal/connection/e;->eventListener:Lokhttp3/v;

    .line 35
    .line 36
    invoke-direct {p2, v0, p1, p0, v1}, Lokhttp3/internal/connection/d;-><init>(Lokhttp3/internal/connection/h;Lokhttp3/a;Lokhttp3/internal/connection/e;Lokhttp3/v;)V

    .line 37
    .line 38
    .line 39
    iput-object p2, p0, Lokhttp3/internal/connection/e;->exchangeFinder:Lokhttp3/internal/connection/d;

    .line 40
    .line 41
    :cond_0
    return-void

    .line 42
    :cond_1
    :try_start_1
    const-string p1, "Check failed."

    .line 43
    .line 44
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p2

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const-string p1, "cannot make a new request because the previous response is still open: please call response.close()"

    .line 53
    .line 54
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    :goto_0
    monitor-exit p0

    .line 61
    throw p1

    .line 62
    :cond_3
    const-string p1, "Check failed."

    .line 63
    .line 64
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p2
.end method

.method public execute()Lokhttp3/i0;
    .locals 3

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/e;->executed:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lokhttp3/internal/connection/e;->timeout:Lokhttp3/internal/connection/e$c;

    .line 12
    .line 13
    invoke-virtual {v0}, Lv7/f;->enter()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lokhttp3/internal/connection/e;->callStart()V

    .line 17
    .line 18
    .line 19
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 20
    .line 21
    invoke-virtual {v0}, Lokhttp3/e0;->dispatcher()Lokhttp3/s;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p0}, Lokhttp3/s;->executed$okhttp(Lokhttp3/internal/connection/e;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lokhttp3/internal/connection/e;->getResponseWithInterceptorChain$okhttp()Lokhttp3/i0;

    .line 29
    .line 30
    .line 31
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    iget-object v1, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 33
    .line 34
    invoke-virtual {v1}, Lokhttp3/e0;->dispatcher()Lokhttp3/s;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1, p0}, Lokhttp3/s;->finished$okhttp(Lokhttp3/internal/connection/e;)V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    iget-object v1, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 44
    .line 45
    invoke-virtual {v1}, Lokhttp3/e0;->dispatcher()Lokhttp3/s;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1, p0}, Lokhttp3/s;->finished$okhttp(Lokhttp3/internal/connection/e;)V

    .line 50
    .line 51
    .line 52
    throw v0

    .line 53
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v1, "Already Executed"

    .line 56
    .line 57
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v0
.end method

.method public final exitNetworkInterceptorExchange$okhttp(Z)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/connection/e;->expectMoreExchanges:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lokhttp3/internal/connection/e;->exchange:Lokhttp3/internal/connection/c;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lokhttp3/internal/connection/c;->detachWithViolence()V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    iput-object p1, p0, Lokhttp3/internal/connection/e;->interceptorScopedExchange:Lokhttp3/internal/connection/c;

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    :try_start_1
    const-string p1, "released"

    .line 21
    .line 22
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    monitor-exit p0

    .line 30
    throw p1
.end method

.method public final getClient()Lokhttp3/e0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getConnection()Lokhttp3/internal/connection/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/e;->connection:Lokhttp3/internal/connection/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getConnectionToCancel()Lokhttp3/internal/connection/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/e;->connectionToCancel:Lokhttp3/internal/connection/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getEventListener$okhttp()Lokhttp3/v;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/e;->eventListener:Lokhttp3/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getForWebSocket()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/connection/e;->forWebSocket:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getInterceptorScopedExchange$okhttp()Lokhttp3/internal/connection/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/e;->interceptorScopedExchange:Lokhttp3/internal/connection/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOriginalRequest()Lokhttp3/g0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/e;->originalRequest:Lokhttp3/g0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getResponseWithInterceptorChain$okhttp()Lokhttp3/i0;
    .locals 9

    .line 1
    new-instance v2, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 7
    .line 8
    invoke-virtual {v0}, Lokhttp3/e0;->interceptors()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v2, v0}, Lm6/n;->x0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lokhttp3/internal/http/l;

    .line 16
    .line 17
    iget-object v1, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 18
    .line 19
    invoke-direct {v0, v1}, Lokhttp3/internal/http/l;-><init>(Lokhttp3/e0;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    new-instance v0, Lokhttp3/internal/http/a;

    .line 26
    .line 27
    iget-object v1, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 28
    .line 29
    invoke-virtual {v1}, Lokhttp3/e0;->cookieJar()Lokhttp3/q;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-direct {v0, v1}, Lokhttp3/internal/http/a;-><init>(Lokhttp3/q;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    new-instance v0, Lokhttp3/internal/cache/a;

    .line 40
    .line 41
    iget-object v1, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 42
    .line 43
    invoke-virtual {v1}, Lokhttp3/e0;->cache()Lokhttp3/d;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-direct {v0, v1}, Lokhttp3/internal/cache/a;-><init>(Lokhttp3/d;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    sget-object v0, Lokhttp3/internal/connection/a;->INSTANCE:Lokhttp3/internal/connection/a;

    .line 54
    .line 55
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    iget-boolean v0, p0, Lokhttp3/internal/connection/e;->forWebSocket:Z

    .line 59
    .line 60
    if-nez v0, :cond_0

    .line 61
    .line 62
    iget-object v0, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 63
    .line 64
    invoke-virtual {v0}, Lokhttp3/e0;->networkInterceptors()Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v2, v0}, Lm6/n;->x0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 69
    .line 70
    .line 71
    :cond_0
    new-instance v0, Lokhttp3/internal/http/b;

    .line 72
    .line 73
    iget-boolean v1, p0, Lokhttp3/internal/connection/e;->forWebSocket:Z

    .line 74
    .line 75
    invoke-direct {v0, v1}, Lokhttp3/internal/http/b;-><init>(Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    new-instance v0, Lokhttp3/internal/http/i;

    .line 82
    .line 83
    iget-object v5, p0, Lokhttp3/internal/connection/e;->originalRequest:Lokhttp3/g0;

    .line 84
    .line 85
    iget-object v1, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 86
    .line 87
    invoke-virtual {v1}, Lokhttp3/e0;->connectTimeoutMillis()I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    iget-object v1, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 92
    .line 93
    invoke-virtual {v1}, Lokhttp3/e0;->readTimeoutMillis()I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    iget-object v1, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 98
    .line 99
    invoke-virtual {v1}, Lokhttp3/e0;->writeTimeoutMillis()I

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    const/4 v3, 0x0

    .line 104
    const/4 v4, 0x0

    .line 105
    move-object v1, p0

    .line 106
    invoke-direct/range {v0 .. v8}, Lokhttp3/internal/http/i;-><init>(Lokhttp3/internal/connection/e;Ljava/util/List;ILokhttp3/internal/connection/c;Lokhttp3/g0;III)V

    .line 107
    .line 108
    .line 109
    const/4 v2, 0x0

    .line 110
    const/4 v3, 0x0

    .line 111
    :try_start_0
    iget-object v4, v1, Lokhttp3/internal/connection/e;->originalRequest:Lokhttp3/g0;

    .line 112
    .line 113
    invoke-virtual {v0, v4}, Lokhttp3/internal/http/i;->proceed(Lokhttp3/g0;)Lokhttp3/i0;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {p0}, Lokhttp3/internal/connection/e;->isCanceled()Z

    .line 118
    .line 119
    .line 120
    move-result v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    if-nez v4, :cond_1

    .line 122
    .line 123
    invoke-virtual {p0, v2}, Lokhttp3/internal/connection/e;->noMoreExchanges$okhttp(Ljava/io/IOException;)Ljava/io/IOException;

    .line 124
    .line 125
    .line 126
    return-object v0

    .line 127
    :cond_1
    :try_start_1
    invoke-static {v0}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 128
    .line 129
    .line 130
    new-instance v0, Ljava/io/IOException;

    .line 131
    .line 132
    const-string v4, "Canceled"

    .line 133
    .line 134
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 138
    :catchall_0
    move-exception v0

    .line 139
    goto :goto_0

    .line 140
    :catch_0
    move-exception v0

    .line 141
    const/4 v3, 0x1

    .line 142
    :try_start_2
    invoke-virtual {p0, v0}, Lokhttp3/internal/connection/e;->noMoreExchanges$okhttp(Ljava/io/IOException;)Ljava/io/IOException;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    const-string v4, "null cannot be cast to non-null type kotlin.Throwable"

    .line 147
    .line 148
    invoke-static {v4, v0}, Lz6/h;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 152
    :goto_0
    if-nez v3, :cond_2

    .line 153
    .line 154
    invoke-virtual {p0, v2}, Lokhttp3/internal/connection/e;->noMoreExchanges$okhttp(Ljava/io/IOException;)Ljava/io/IOException;

    .line 155
    .line 156
    .line 157
    :cond_2
    throw v0
.end method

.method public final initExchange$okhttp(Lokhttp3/internal/http/i;)Lokhttp3/internal/connection/c;
    .locals 3

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/connection/e;->expectMoreExchanges:Z

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    iget-boolean v0, p0, Lokhttp3/internal/connection/e;->responseBodyOpen:Z

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    iget-boolean v0, p0, Lokhttp3/internal/connection/e;->requestBodyOpen:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    monitor-exit p0

    .line 20
    iget-object v0, p0, Lokhttp3/internal/connection/e;->exchangeFinder:Lokhttp3/internal/connection/d;

    .line 21
    .line 22
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lokhttp3/internal/connection/e;->client:Lokhttp3/e0;

    .line 26
    .line 27
    invoke-virtual {v0, v1, p1}, Lokhttp3/internal/connection/d;->find(Lokhttp3/e0;Lokhttp3/internal/http/i;)Lokhttp3/internal/http/f;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance v1, Lokhttp3/internal/connection/c;

    .line 32
    .line 33
    iget-object v2, p0, Lokhttp3/internal/connection/e;->eventListener:Lokhttp3/v;

    .line 34
    .line 35
    invoke-direct {v1, p0, v2, v0, p1}, Lokhttp3/internal/connection/c;-><init>(Lokhttp3/internal/connection/e;Lokhttp3/v;Lokhttp3/internal/connection/d;Lokhttp3/internal/http/f;)V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Lokhttp3/internal/connection/e;->interceptorScopedExchange:Lokhttp3/internal/connection/c;

    .line 39
    .line 40
    iput-object v1, p0, Lokhttp3/internal/connection/e;->exchange:Lokhttp3/internal/connection/c;

    .line 41
    .line 42
    monitor-enter p0

    .line 43
    const/4 p1, 0x1

    .line 44
    :try_start_1
    iput-boolean p1, p0, Lokhttp3/internal/connection/e;->requestBodyOpen:Z

    .line 45
    .line 46
    iput-boolean p1, p0, Lokhttp3/internal/connection/e;->responseBodyOpen:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    .line 48
    monitor-exit p0

    .line 49
    iget-boolean p1, p0, Lokhttp3/internal/connection/e;->canceled:Z

    .line 50
    .line 51
    if-nez p1, :cond_0

    .line 52
    .line 53
    return-object v1

    .line 54
    :cond_0
    new-instance p1, Ljava/io/IOException;

    .line 55
    .line 56
    const-string v0, "Canceled"

    .line 57
    .line 58
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    monitor-exit p0

    .line 64
    throw p1

    .line 65
    :cond_1
    :try_start_2
    const-string p1, "Check failed."

    .line 66
    .line 67
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 68
    .line 69
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0

    .line 73
    :catchall_1
    move-exception p1

    .line 74
    goto :goto_0

    .line 75
    :cond_2
    const-string p1, "Check failed."

    .line 76
    .line 77
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v0

    .line 83
    :cond_3
    const-string p1, "released"

    .line 84
    .line 85
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 86
    .line 87
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 91
    :goto_0
    monitor-exit p0

    .line 92
    throw p1
.end method

.method public isCanceled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/connection/e;->canceled:Z

    .line 2
    .line 3
    return v0
.end method

.method public isExecuted()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/e;->executed:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final messageDone$okhttp(Lokhttp3/internal/connection/c;ZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/io/IOException;",
            ">(",
            "Lokhttp3/internal/connection/c;",
            "ZZTE;)TE;"
        }
    .end annotation

    .line 1
    const-string v0, "exchange"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/internal/connection/e;->exchange:Lokhttp3/internal/connection/c;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    goto :goto_4

    .line 15
    :cond_0
    monitor-enter p0

    .line 16
    const/4 p1, 0x0

    .line 17
    if-eqz p2, :cond_1

    .line 18
    .line 19
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/connection/e;->requestBodyOpen:Z

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_2

    .line 26
    :cond_1
    :goto_0
    if-eqz p3, :cond_7

    .line 27
    .line 28
    iget-boolean v0, p0, Lokhttp3/internal/connection/e;->responseBodyOpen:Z

    .line 29
    .line 30
    if-eqz v0, :cond_7

    .line 31
    .line 32
    :cond_2
    if-eqz p2, :cond_3

    .line 33
    .line 34
    iput-boolean p1, p0, Lokhttp3/internal/connection/e;->requestBodyOpen:Z

    .line 35
    .line 36
    :cond_3
    if-eqz p3, :cond_4

    .line 37
    .line 38
    iput-boolean p1, p0, Lokhttp3/internal/connection/e;->responseBodyOpen:Z

    .line 39
    .line 40
    :cond_4
    iget-boolean p2, p0, Lokhttp3/internal/connection/e;->requestBodyOpen:Z

    .line 41
    .line 42
    const/4 p3, 0x1

    .line 43
    if-nez p2, :cond_5

    .line 44
    .line 45
    iget-boolean v0, p0, Lokhttp3/internal/connection/e;->responseBodyOpen:Z

    .line 46
    .line 47
    if-nez v0, :cond_5

    .line 48
    .line 49
    move v0, p3

    .line 50
    goto :goto_1

    .line 51
    :cond_5
    move v0, p1

    .line 52
    :goto_1
    if-nez p2, :cond_6

    .line 53
    .line 54
    iget-boolean p2, p0, Lokhttp3/internal/connection/e;->responseBodyOpen:Z

    .line 55
    .line 56
    if-nez p2, :cond_6

    .line 57
    .line 58
    iget-boolean p2, p0, Lokhttp3/internal/connection/e;->expectMoreExchanges:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    if-nez p2, :cond_6

    .line 61
    .line 62
    move p1, p3

    .line 63
    :cond_6
    move p2, p1

    .line 64
    move p1, v0

    .line 65
    goto :goto_3

    .line 66
    :goto_2
    monitor-exit p0

    .line 67
    throw p1

    .line 68
    :cond_7
    move p2, p1

    .line 69
    :goto_3
    monitor-exit p0

    .line 70
    if-eqz p1, :cond_8

    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    iput-object p1, p0, Lokhttp3/internal/connection/e;->exchange:Lokhttp3/internal/connection/c;

    .line 74
    .line 75
    iget-object p1, p0, Lokhttp3/internal/connection/e;->connection:Lokhttp3/internal/connection/f;

    .line 76
    .line 77
    if-eqz p1, :cond_8

    .line 78
    .line 79
    invoke-virtual {p1}, Lokhttp3/internal/connection/f;->incrementSuccessCount$okhttp()V

    .line 80
    .line 81
    .line 82
    :cond_8
    if-eqz p2, :cond_9

    .line 83
    .line 84
    invoke-direct {p0, p4}, Lokhttp3/internal/connection/e;->callDone(Ljava/io/IOException;)Ljava/io/IOException;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1

    .line 89
    :cond_9
    :goto_4
    return-object p4
.end method

.method public final noMoreExchanges$okhttp(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/connection/e;->expectMoreExchanges:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-boolean v1, p0, Lokhttp3/internal/connection/e;->expectMoreExchanges:Z

    .line 8
    .line 9
    iget-boolean v0, p0, Lokhttp3/internal/connection/e;->requestBodyOpen:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, Lokhttp3/internal/connection/e;->responseBodyOpen:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    monitor-exit p0

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-direct {p0, p1}, Lokhttp3/internal/connection/e;->callDone(Ljava/io/IOException;)Ljava/io/IOException;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :cond_1
    return-object p1

    .line 29
    :goto_1
    monitor-exit p0

    .line 30
    throw p1
.end method

.method public final redactedUrl$okhttp()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/e;->originalRequest:Lokhttp3/g0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokhttp3/g0;->url()Lokhttp3/z;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lokhttp3/z;->redact()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final releaseConnectionNoEvents$okhttp()Ljava/net/Socket;
    .locals 6

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/e;->connection:Lokhttp3/internal/connection/f;

    .line 2
    .line 3
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-boolean v1, Lq7/c;->assertionsEnabled:Z

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    .line 18
    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v3, "Thread "

    .line 22
    .line 23
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v3, " MUST hold lock on "

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    throw v1

    .line 53
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lokhttp3/internal/connection/f;->getCalls()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    const/4 v3, 0x0

    .line 62
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    const/4 v5, -0x1

    .line 67
    if-eqz v4, :cond_3

    .line 68
    .line 69
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, Ljava/lang/ref/Reference;

    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-static {v4, p0}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-eqz v4, :cond_2

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    move v3, v5

    .line 90
    :goto_2
    if-eq v3, v5, :cond_5

    .line 91
    .line 92
    invoke-interface {v1, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    const/4 v2, 0x0

    .line 96
    iput-object v2, p0, Lokhttp3/internal/connection/e;->connection:Lokhttp3/internal/connection/f;

    .line 97
    .line 98
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_4

    .line 103
    .line 104
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 105
    .line 106
    .line 107
    move-result-wide v3

    .line 108
    invoke-virtual {v0, v3, v4}, Lokhttp3/internal/connection/f;->setIdleAtNs$okhttp(J)V

    .line 109
    .line 110
    .line 111
    iget-object v1, p0, Lokhttp3/internal/connection/e;->connectionPool:Lokhttp3/internal/connection/h;

    .line 112
    .line 113
    invoke-virtual {v1, v0}, Lokhttp3/internal/connection/h;->connectionBecameIdle(Lokhttp3/internal/connection/f;)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_4

    .line 118
    .line 119
    invoke-virtual {v0}, Lokhttp3/internal/connection/f;->socket()Ljava/net/Socket;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    return-object v0

    .line 124
    :cond_4
    return-object v2

    .line 125
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 126
    .line 127
    const-string v1, "Check failed."

    .line 128
    .line 129
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v0
.end method

.method public request()Lokhttp3/g0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/e;->originalRequest:Lokhttp3/g0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final retryAfterFailure()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/e;->exchangeFinder:Lokhttp3/internal/connection/d;

    .line 2
    .line 3
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lokhttp3/internal/connection/d;->retryAfterFailure()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method

.method public final setConnectionToCancel(Lokhttp3/internal/connection/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/internal/connection/e;->connectionToCancel:Lokhttp3/internal/connection/f;

    .line 2
    .line 3
    return-void
.end method

.method public timeout()Lv7/f;
    .locals 1

    .line 2
    iget-object v0, p0, Lokhttp3/internal/connection/e;->timeout:Lokhttp3/internal/connection/e$c;

    return-object v0
.end method

.method public bridge synthetic timeout()Lv7/n0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokhttp3/internal/connection/e;->timeout()Lv7/f;

    move-result-object v0

    return-object v0
.end method

.method public final timeoutEarlyExit()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/connection/e;->timeoutEarlyExit:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lokhttp3/internal/connection/e;->timeoutEarlyExit:Z

    .line 7
    .line 8
    iget-object v0, p0, Lokhttp3/internal/connection/e;->timeout:Lokhttp3/internal/connection/e$c;

    .line 9
    .line 10
    invoke-virtual {v0}, Lv7/f;->exit()Z

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v1, "Check failed."

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0
.end method
