.class public Lokhttp3/i0$a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private body:Lokhttp3/j0;

.field private cacheResponse:Lokhttp3/i0;

.field private code:I

.field private exchange:Lokhttp3/internal/connection/c;

.field private handshake:Lokhttp3/x;

.field private headers:Lokhttp3/y$a;

.field private message:Ljava/lang/String;

.field private networkResponse:Lokhttp3/i0;

.field private priorResponse:Lokhttp3/i0;

.field private protocol:Lokhttp3/f0;

.field private receivedResponseAtMillis:J

.field private request:Lokhttp3/g0;

.field private sentRequestAtMillis:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lokhttp3/i0$a;->code:I

    .line 3
    new-instance v0, Lokhttp3/y$a;

    invoke-direct {v0}, Lokhttp3/y$a;-><init>()V

    iput-object v0, p0, Lokhttp3/i0$a;->headers:Lokhttp3/y$a;

    return-void
.end method

.method public constructor <init>(Lokhttp3/i0;)V
    .locals 2

    const-string v0, "response"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lokhttp3/i0$a;->code:I

    .line 6
    invoke-virtual {p1}, Lokhttp3/i0;->request()Lokhttp3/g0;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/i0$a;->request:Lokhttp3/g0;

    .line 7
    invoke-virtual {p1}, Lokhttp3/i0;->protocol()Lokhttp3/f0;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/i0$a;->protocol:Lokhttp3/f0;

    .line 8
    invoke-virtual {p1}, Lokhttp3/i0;->code()I

    move-result v0

    iput v0, p0, Lokhttp3/i0$a;->code:I

    .line 9
    invoke-virtual {p1}, Lokhttp3/i0;->message()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/i0$a;->message:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Lokhttp3/i0;->handshake()Lokhttp3/x;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/i0$a;->handshake:Lokhttp3/x;

    .line 11
    invoke-virtual {p1}, Lokhttp3/i0;->headers()Lokhttp3/y;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/y;->newBuilder()Lokhttp3/y$a;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/i0$a;->headers:Lokhttp3/y$a;

    .line 12
    invoke-virtual {p1}, Lokhttp3/i0;->body()Lokhttp3/j0;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/i0$a;->body:Lokhttp3/j0;

    .line 13
    invoke-virtual {p1}, Lokhttp3/i0;->networkResponse()Lokhttp3/i0;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/i0$a;->networkResponse:Lokhttp3/i0;

    .line 14
    invoke-virtual {p1}, Lokhttp3/i0;->cacheResponse()Lokhttp3/i0;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/i0$a;->cacheResponse:Lokhttp3/i0;

    .line 15
    invoke-virtual {p1}, Lokhttp3/i0;->priorResponse()Lokhttp3/i0;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/i0$a;->priorResponse:Lokhttp3/i0;

    .line 16
    invoke-virtual {p1}, Lokhttp3/i0;->sentRequestAtMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lokhttp3/i0$a;->sentRequestAtMillis:J

    .line 17
    invoke-virtual {p1}, Lokhttp3/i0;->receivedResponseAtMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lokhttp3/i0$a;->receivedResponseAtMillis:J

    .line 18
    invoke-virtual {p1}, Lokhttp3/i0;->exchange()Lokhttp3/internal/connection/c;

    move-result-object p1

    iput-object p1, p0, Lokhttp3/i0$a;->exchange:Lokhttp3/internal/connection/c;

    return-void
.end method

.method private final checkPriorResponse(Lokhttp3/i0;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Lokhttp3/i0;->body()Lokhttp3/j0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    const-string v0, "priorResponse.body != null"

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p1

    .line 18
    :cond_1
    return-void
.end method

.method private final checkSupportResponse(Ljava/lang/String;Lokhttp3/i0;)V
    .locals 1

    .line 1
    if-eqz p2, :cond_4

    .line 2
    .line 3
    invoke-virtual {p2}, Lokhttp3/i0;->body()Lokhttp3/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    invoke-virtual {p2}, Lokhttp3/i0;->networkResponse()Lokhttp3/i0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p2}, Lokhttp3/i0;->cacheResponse()Lokhttp3/i0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p2}, Lokhttp3/i0;->priorResponse()Lokhttp3/i0;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    if-nez p2, :cond_0

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    const-string p2, ".priorResponse != null"

    .line 29
    .line 30
    invoke-static {p1, p2}, La1/a1;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p2

    .line 44
    :cond_1
    const-string p2, ".cacheResponse != null"

    .line 45
    .line 46
    invoke-static {p1, p2}, La1/a1;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p2

    .line 60
    :cond_2
    const-string p2, ".networkResponse != null"

    .line 61
    .line 62
    invoke-static {p1, p2}, La1/a1;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p2

    .line 76
    :cond_3
    const-string p2, ".body != null"

    .line 77
    .line 78
    invoke-static {p1, p2}, La1/a1;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p2

    .line 92
    :cond_4
    return-void
.end method


# virtual methods
.method public addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/i0$a;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lokhttp3/i0$a;->headers:Lokhttp3/y$a;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lokhttp3/y$a;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/y$a;

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public body(Lokhttp3/j0;)Lokhttp3/i0$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/i0$a;->body:Lokhttp3/j0;

    .line 2
    .line 3
    return-object p0
.end method

.method public build()Lokhttp3/i0;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v5, v0, Lokhttp3/i0$a;->code:I

    .line 4
    .line 5
    if-ltz v5, :cond_3

    .line 6
    .line 7
    iget-object v2, v0, Lokhttp3/i0$a;->request:Lokhttp3/g0;

    .line 8
    .line 9
    if-eqz v2, :cond_2

    .line 10
    .line 11
    iget-object v3, v0, Lokhttp3/i0$a;->protocol:Lokhttp3/f0;

    .line 12
    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    iget-object v4, v0, Lokhttp3/i0$a;->message:Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    iget-object v6, v0, Lokhttp3/i0$a;->handshake:Lokhttp3/x;

    .line 20
    .line 21
    iget-object v1, v0, Lokhttp3/i0$a;->headers:Lokhttp3/y$a;

    .line 22
    .line 23
    invoke-virtual {v1}, Lokhttp3/y$a;->build()Lokhttp3/y;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    iget-object v8, v0, Lokhttp3/i0$a;->body:Lokhttp3/j0;

    .line 28
    .line 29
    iget-object v9, v0, Lokhttp3/i0$a;->networkResponse:Lokhttp3/i0;

    .line 30
    .line 31
    iget-object v10, v0, Lokhttp3/i0$a;->cacheResponse:Lokhttp3/i0;

    .line 32
    .line 33
    iget-object v11, v0, Lokhttp3/i0$a;->priorResponse:Lokhttp3/i0;

    .line 34
    .line 35
    iget-wide v12, v0, Lokhttp3/i0$a;->sentRequestAtMillis:J

    .line 36
    .line 37
    iget-wide v14, v0, Lokhttp3/i0$a;->receivedResponseAtMillis:J

    .line 38
    .line 39
    iget-object v1, v0, Lokhttp3/i0$a;->exchange:Lokhttp3/internal/connection/c;

    .line 40
    .line 41
    move-object/from16 v16, v1

    .line 42
    .line 43
    new-instance v1, Lokhttp3/i0;

    .line 44
    .line 45
    invoke-direct/range {v1 .. v16}, Lokhttp3/i0;-><init>(Lokhttp3/g0;Lokhttp3/f0;Ljava/lang/String;ILokhttp3/x;Lokhttp3/y;Lokhttp3/j0;Lokhttp3/i0;Lokhttp3/i0;Lokhttp3/i0;JJLokhttp3/internal/connection/c;)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string v2, "message == null"

    .line 52
    .line 53
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v1

    .line 57
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string v2, "protocol == null"

    .line 60
    .line 61
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v1

    .line 65
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string v2, "request == null"

    .line 68
    .line 69
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v1

    .line 73
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-string v2, "code < 0: "

    .line 76
    .line 77
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget v2, v0, Lokhttp3/i0$a;->code:I

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw v2
.end method

.method public cacheResponse(Lokhttp3/i0;)Lokhttp3/i0$a;
    .locals 1

    .line 1
    const-string v0, "cacheResponse"

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lokhttp3/i0$a;->checkSupportResponse(Ljava/lang/String;Lokhttp3/i0;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/i0$a;->cacheResponse:Lokhttp3/i0;

    .line 7
    .line 8
    return-object p0
.end method

.method public code(I)Lokhttp3/i0$a;
    .locals 0

    .line 1
    iput p1, p0, Lokhttp3/i0$a;->code:I

    .line 2
    .line 3
    return-object p0
.end method

.method public final getBody$okhttp()Lokhttp3/j0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0$a;->body:Lokhttp3/j0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCacheResponse$okhttp()Lokhttp3/i0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0$a;->cacheResponse:Lokhttp3/i0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCode$okhttp()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/i0$a;->code:I

    .line 2
    .line 3
    return v0
.end method

.method public final getExchange$okhttp()Lokhttp3/internal/connection/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0$a;->exchange:Lokhttp3/internal/connection/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getHandshake$okhttp()Lokhttp3/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0$a;->handshake:Lokhttp3/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getHeaders$okhttp()Lokhttp3/y$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0$a;->headers:Lokhttp3/y$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMessage$okhttp()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0$a;->message:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNetworkResponse$okhttp()Lokhttp3/i0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0$a;->networkResponse:Lokhttp3/i0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPriorResponse$okhttp()Lokhttp3/i0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0$a;->priorResponse:Lokhttp3/i0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getProtocol$okhttp()Lokhttp3/f0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0$a;->protocol:Lokhttp3/f0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getReceivedResponseAtMillis$okhttp()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lokhttp3/i0$a;->receivedResponseAtMillis:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getRequest$okhttp()Lokhttp3/g0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0$a;->request:Lokhttp3/g0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSentRequestAtMillis$okhttp()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lokhttp3/i0$a;->sentRequestAtMillis:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public handshake(Lokhttp3/x;)Lokhttp3/i0$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/i0$a;->handshake:Lokhttp3/x;

    .line 2
    .line 3
    return-object p0
.end method

.method public header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/i0$a;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lokhttp3/i0$a;->headers:Lokhttp3/y$a;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lokhttp3/y$a;->set(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/y$a;

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public headers(Lokhttp3/y;)Lokhttp3/i0$a;
    .locals 1

    .line 1
    const-string v0, "headers"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lokhttp3/y;->newBuilder()Lokhttp3/y$a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lokhttp3/i0$a;->headers:Lokhttp3/y$a;

    .line 11
    .line 12
    return-object p0
.end method

.method public final initExchange$okhttp(Lokhttp3/internal/connection/c;)V
    .locals 1

    .line 1
    const-string v0, "deferredTrailers"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/i0$a;->exchange:Lokhttp3/internal/connection/c;

    .line 7
    .line 8
    return-void
.end method

.method public message(Ljava/lang/String;)Lokhttp3/i0$a;
    .locals 1

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/i0$a;->message:Ljava/lang/String;

    .line 7
    .line 8
    return-object p0
.end method

.method public networkResponse(Lokhttp3/i0;)Lokhttp3/i0$a;
    .locals 1

    .line 1
    const-string v0, "networkResponse"

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lokhttp3/i0$a;->checkSupportResponse(Ljava/lang/String;Lokhttp3/i0;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/i0$a;->networkResponse:Lokhttp3/i0;

    .line 7
    .line 8
    return-object p0
.end method

.method public priorResponse(Lokhttp3/i0;)Lokhttp3/i0$a;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lokhttp3/i0$a;->checkPriorResponse(Lokhttp3/i0;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lokhttp3/i0$a;->priorResponse:Lokhttp3/i0;

    .line 5
    .line 6
    return-object p0
.end method

.method public protocol(Lokhttp3/f0;)Lokhttp3/i0$a;
    .locals 1

    .line 1
    const-string v0, "protocol"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/i0$a;->protocol:Lokhttp3/f0;

    .line 7
    .line 8
    return-object p0
.end method

.method public receivedResponseAtMillis(J)Lokhttp3/i0$a;
    .locals 0

    .line 1
    iput-wide p1, p0, Lokhttp3/i0$a;->receivedResponseAtMillis:J

    .line 2
    .line 3
    return-object p0
.end method

.method public removeHeader(Ljava/lang/String;)Lokhttp3/i0$a;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/i0$a;->headers:Lokhttp3/y$a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lokhttp3/y$a;->removeAll(Ljava/lang/String;)Lokhttp3/y$a;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public request(Lokhttp3/g0;)Lokhttp3/i0$a;
    .locals 1

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/i0$a;->request:Lokhttp3/g0;

    .line 7
    .line 8
    return-object p0
.end method

.method public sentRequestAtMillis(J)Lokhttp3/i0$a;
    .locals 0

    .line 1
    iput-wide p1, p0, Lokhttp3/i0$a;->sentRequestAtMillis:J

    .line 2
    .line 3
    return-object p0
.end method

.method public final setBody$okhttp(Lokhttp3/j0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/i0$a;->body:Lokhttp3/j0;

    .line 2
    .line 3
    return-void
.end method

.method public final setCacheResponse$okhttp(Lokhttp3/i0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/i0$a;->cacheResponse:Lokhttp3/i0;

    .line 2
    .line 3
    return-void
.end method

.method public final setCode$okhttp(I)V
    .locals 0

    .line 1
    iput p1, p0, Lokhttp3/i0$a;->code:I

    .line 2
    .line 3
    return-void
.end method

.method public final setExchange$okhttp(Lokhttp3/internal/connection/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/i0$a;->exchange:Lokhttp3/internal/connection/c;

    .line 2
    .line 3
    return-void
.end method

.method public final setHandshake$okhttp(Lokhttp3/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/i0$a;->handshake:Lokhttp3/x;

    .line 2
    .line 3
    return-void
.end method

.method public final setHeaders$okhttp(Lokhttp3/y$a;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/i0$a;->headers:Lokhttp3/y$a;

    .line 7
    .line 8
    return-void
.end method

.method public final setMessage$okhttp(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/i0$a;->message:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setNetworkResponse$okhttp(Lokhttp3/i0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/i0$a;->networkResponse:Lokhttp3/i0;

    .line 2
    .line 3
    return-void
.end method

.method public final setPriorResponse$okhttp(Lokhttp3/i0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/i0$a;->priorResponse:Lokhttp3/i0;

    .line 2
    .line 3
    return-void
.end method

.method public final setProtocol$okhttp(Lokhttp3/f0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/i0$a;->protocol:Lokhttp3/f0;

    .line 2
    .line 3
    return-void
.end method

.method public final setReceivedResponseAtMillis$okhttp(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lokhttp3/i0$a;->receivedResponseAtMillis:J

    .line 2
    .line 3
    return-void
.end method

.method public final setRequest$okhttp(Lokhttp3/g0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/i0$a;->request:Lokhttp3/g0;

    .line 2
    .line 3
    return-void
.end method

.method public final setSentRequestAtMillis$okhttp(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lokhttp3/i0$a;->sentRequestAtMillis:J

    .line 2
    .line 3
    return-void
.end method
