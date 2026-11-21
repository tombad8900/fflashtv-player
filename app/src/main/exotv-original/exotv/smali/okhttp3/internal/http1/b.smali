.class public final Lokhttp3/internal/http1/b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lokhttp3/internal/http/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/http1/b$a;,
        Lokhttp3/internal/http1/b$b;,
        Lokhttp3/internal/http1/b$c;,
        Lokhttp3/internal/http1/b$d;,
        Lokhttp3/internal/http1/b$e;,
        Lokhttp3/internal/http1/b$f;,
        Lokhttp3/internal/http1/b$g;
    }
.end annotation


# static fields
.field public static final Companion:Lokhttp3/internal/http1/b$d;

.field private static final NO_CHUNK_YET:J = -0x1L

.field private static final STATE_CLOSED:I = 0x6

.field private static final STATE_IDLE:I = 0x0

.field private static final STATE_OPEN_REQUEST_BODY:I = 0x1

.field private static final STATE_OPEN_RESPONSE_BODY:I = 0x4

.field private static final STATE_READING_RESPONSE_BODY:I = 0x5

.field private static final STATE_READ_RESPONSE_HEADERS:I = 0x3

.field private static final STATE_WRITING_REQUEST_BODY:I = 0x2


# instance fields
.field private final client:Lokhttp3/e0;

.field private final connection:Lokhttp3/internal/connection/f;

.field private final headersReader:Lokhttp3/internal/http1/a;

.field private final sink:Lv7/k;

.field private final source:Lv7/l;

.field private state:I

.field private trailers:Lokhttp3/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lokhttp3/internal/http1/b$d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lokhttp3/internal/http1/b$d;-><init>(Lz6/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lokhttp3/internal/http1/b;->Companion:Lokhttp3/internal/http1/b$d;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lokhttp3/e0;Lokhttp3/internal/connection/f;Lv7/l;Lv7/k;)V
    .locals 1

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "source"

    .line 7
    .line 8
    invoke-static {v0, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "sink"

    .line 12
    .line 13
    invoke-static {v0, p4}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lokhttp3/internal/http1/b;->client:Lokhttp3/e0;

    .line 20
    .line 21
    iput-object p2, p0, Lokhttp3/internal/http1/b;->connection:Lokhttp3/internal/connection/f;

    .line 22
    .line 23
    iput-object p3, p0, Lokhttp3/internal/http1/b;->source:Lv7/l;

    .line 24
    .line 25
    iput-object p4, p0, Lokhttp3/internal/http1/b;->sink:Lv7/k;

    .line 26
    .line 27
    new-instance p1, Lokhttp3/internal/http1/a;

    .line 28
    .line 29
    invoke-direct {p1, p3}, Lokhttp3/internal/http1/a;-><init>(Lv7/l;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lokhttp3/internal/http1/b;->headersReader:Lokhttp3/internal/http1/a;

    .line 33
    .line 34
    return-void
.end method

.method public static final synthetic access$detachTimeout(Lokhttp3/internal/http1/b;Lv7/s;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lokhttp3/internal/http1/b;->detachTimeout(Lv7/s;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getClient$p(Lokhttp3/internal/http1/b;)Lokhttp3/e0;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http1/b;->client:Lokhttp3/e0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getHeadersReader$p(Lokhttp3/internal/http1/b;)Lokhttp3/internal/http1/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http1/b;->headersReader:Lokhttp3/internal/http1/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getSink$p(Lokhttp3/internal/http1/b;)Lv7/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http1/b;->sink:Lv7/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getSource$p(Lokhttp3/internal/http1/b;)Lv7/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http1/b;->source:Lv7/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getState$p(Lokhttp3/internal/http1/b;)I
    .locals 0

    .line 1
    iget p0, p0, Lokhttp3/internal/http1/b;->state:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getTrailers$p(Lokhttp3/internal/http1/b;)Lokhttp3/y;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http1/b;->trailers:Lokhttp3/y;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$setState$p(Lokhttp3/internal/http1/b;I)V
    .locals 0

    .line 1
    iput p1, p0, Lokhttp3/internal/http1/b;->state:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setTrailers$p(Lokhttp3/internal/http1/b;Lokhttp3/y;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/internal/http1/b;->trailers:Lokhttp3/y;

    .line 2
    .line 3
    return-void
.end method

.method private final detachTimeout(Lv7/s;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lv7/s;->a:Lv7/n0;

    .line 2
    .line 3
    sget-object v1, Lv7/n0;->NONE:Lv7/n0;

    .line 4
    .line 5
    const-string v2, "delegate"

    .line 6
    .line 7
    invoke-static {v2, v1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, p1, Lv7/s;->a:Lv7/n0;

    .line 11
    .line 12
    invoke-virtual {v0}, Lv7/n0;->clearDeadline()Lv7/n0;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lv7/n0;->clearTimeout()Lv7/n0;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private final isChunked(Lokhttp3/g0;)Z
    .locals 1

    .line 3
    const-string v0, "Transfer-Encoding"

    invoke-virtual {p1, v0}, Lokhttp3/g0;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    const-string v0, "chunked"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method private final isChunked(Lokhttp3/i0;)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 1
    const-string v2, "Transfer-Encoding"

    invoke-static {p1, v2, v0, v1, v0}, Lokhttp3/i0;->header$default(Lokhttp3/i0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 2
    const-string v0, "chunked"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method private final newChunkedSink()Lv7/i0;
    .locals 2

    .line 1
    iget v0, p0, Lokhttp3/internal/http1/b;->state:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    iput v0, p0, Lokhttp3/internal/http1/b;->state:I

    .line 8
    .line 9
    new-instance v0, Lokhttp3/internal/http1/b$b;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lokhttp3/internal/http1/b$b;-><init>(Lokhttp3/internal/http1/b;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "state: "

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget v1, p0, Lokhttp3/internal/http1/b;->state:I

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v1
.end method

.method private final newChunkedSource(Lokhttp3/z;)Lv7/k0;
    .locals 2

    .line 1
    iget v0, p0, Lokhttp3/internal/http1/b;->state:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    iput v0, p0, Lokhttp3/internal/http1/b;->state:I

    .line 8
    .line 9
    new-instance v0, Lokhttp3/internal/http1/b$c;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1}, Lokhttp3/internal/http1/b$c;-><init>(Lokhttp3/internal/http1/b;Lokhttp3/z;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v0, "state: "

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget v0, p0, Lokhttp3/internal/http1/b;->state:I

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0
.end method

.method private final newFixedLengthSource(J)Lv7/k0;
    .locals 2

    .line 1
    iget v0, p0, Lokhttp3/internal/http1/b;->state:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    iput v0, p0, Lokhttp3/internal/http1/b;->state:I

    .line 8
    .line 9
    new-instance v0, Lokhttp3/internal/http1/b$e;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2}, Lokhttp3/internal/http1/b$e;-><init>(Lokhttp3/internal/http1/b;J)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string p2, "state: "

    .line 18
    .line 19
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget p2, p0, Lokhttp3/internal/http1/b;->state:I

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p2
.end method

.method private final newKnownLengthSink()Lv7/i0;
    .locals 2

    .line 1
    iget v0, p0, Lokhttp3/internal/http1/b;->state:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    iput v0, p0, Lokhttp3/internal/http1/b;->state:I

    .line 8
    .line 9
    new-instance v0, Lokhttp3/internal/http1/b$f;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lokhttp3/internal/http1/b$f;-><init>(Lokhttp3/internal/http1/b;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "state: "

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget v1, p0, Lokhttp3/internal/http1/b;->state:I

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v1
.end method

.method private final newUnknownLengthSource()Lv7/k0;
    .locals 2

    .line 1
    iget v0, p0, Lokhttp3/internal/http1/b;->state:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    iput v0, p0, Lokhttp3/internal/http1/b;->state:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lokhttp3/internal/http1/b;->getConnection()Lokhttp3/internal/connection/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lokhttp3/internal/connection/f;->noNewExchanges$okhttp()V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lokhttp3/internal/http1/b$g;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Lokhttp3/internal/http1/b$g;-><init>(Lokhttp3/internal/http1/b;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, "state: "

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget v1, p0, Lokhttp3/internal/http1/b;->state:I

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v1
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokhttp3/internal/http1/b;->getConnection()Lokhttp3/internal/connection/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lokhttp3/internal/connection/f;->cancel()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public createRequestBody(Lokhttp3/g0;J)Lv7/i0;
    .locals 2

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lokhttp3/g0;->body()Lokhttp3/h0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Lokhttp3/g0;->body()Lokhttp3/h0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lokhttp3/h0;->isDuplex()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    .line 24
    .line 25
    const-string p2, "Duplex connections are not supported for HTTP/1"

    .line 26
    .line 27
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    :goto_0
    invoke-direct {p0, p1}, Lokhttp3/internal/http1/b;->isChunked(Lokhttp3/g0;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    invoke-direct {p0}, Lokhttp3/internal/http1/b;->newChunkedSink()Lv7/i0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_2
    const-wide/16 v0, -0x1

    .line 43
    .line 44
    cmp-long p1, p2, v0

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    invoke-direct {p0}, Lokhttp3/internal/http1/b;->newKnownLengthSink()Lv7/i0;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string p2, "Cannot stream a request body without chunked encoding or a known content length!"

    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1
.end method

.method public finishRequest()V
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http1/b;->sink:Lv7/k;

    .line 2
    .line 3
    invoke-interface {v0}, Lv7/k;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public flushRequest()V
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http1/b;->sink:Lv7/k;

    .line 2
    .line 3
    invoke-interface {v0}, Lv7/k;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getConnection()Lokhttp3/internal/connection/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http1/b;->connection:Lokhttp3/internal/connection/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isClosed()Z
    .locals 2

    .line 1
    iget v0, p0, Lokhttp3/internal/http1/b;->state:I

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public openResponseBodySource(Lokhttp3/i0;)Lv7/k0;
    .locals 4

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lokhttp3/internal/http/g;->promisesBody(Lokhttp3/i0;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    invoke-direct {p0, v0, v1}, Lokhttp3/internal/http1/b;->newFixedLengthSource(J)Lv7/k0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    invoke-direct {p0, p1}, Lokhttp3/internal/http1/b;->isChunked(Lokhttp3/i0;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Lokhttp3/i0;->request()Lokhttp3/g0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lokhttp3/g0;->url()Lokhttp3/z;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {p0, p1}, Lokhttp3/internal/http1/b;->newChunkedSource(Lokhttp3/z;)Lv7/k0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_1
    invoke-static {p1}, Lq7/c;->headersContentLength(Lokhttp3/i0;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    const-wide/16 v2, -0x1

    .line 43
    .line 44
    cmp-long p1, v0, v2

    .line 45
    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    invoke-direct {p0, v0, v1}, Lokhttp3/internal/http1/b;->newFixedLengthSource(J)Lv7/k0;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :cond_2
    invoke-direct {p0}, Lokhttp3/internal/http1/b;->newUnknownLengthSource()Lv7/k0;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1
.end method

.method public readResponseHeaders(Z)Lokhttp3/i0$a;
    .locals 4

    .line 1
    iget v0, p0, Lokhttp3/internal/http1/b;->state:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x3

    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v0, "state: "

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget v0, p0, Lokhttp3/internal/http1/b;->state:I

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0

    .line 39
    :cond_1
    :goto_0
    :try_start_0
    sget-object v0, Lokhttp3/internal/http/m;->Companion:Lokhttp3/internal/http/m$a;

    .line 40
    .line 41
    iget-object v1, p0, Lokhttp3/internal/http1/b;->headersReader:Lokhttp3/internal/http1/a;

    .line 42
    .line 43
    invoke-virtual {v1}, Lokhttp3/internal/http1/a;->readLine()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Lokhttp3/internal/http/m$a;->parse(Ljava/lang/String;)Lokhttp3/internal/http/m;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    new-instance v1, Lokhttp3/i0$a;

    .line 52
    .line 53
    invoke-direct {v1}, Lokhttp3/i0$a;-><init>()V

    .line 54
    .line 55
    .line 56
    iget-object v3, v0, Lokhttp3/internal/http/m;->protocol:Lokhttp3/f0;

    .line 57
    .line 58
    invoke-virtual {v1, v3}, Lokhttp3/i0$a;->protocol(Lokhttp3/f0;)Lokhttp3/i0$a;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iget v3, v0, Lokhttp3/internal/http/m;->code:I

    .line 63
    .line 64
    invoke-virtual {v1, v3}, Lokhttp3/i0$a;->code(I)Lokhttp3/i0$a;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iget-object v3, v0, Lokhttp3/internal/http/m;->message:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v1, v3}, Lokhttp3/i0$a;->message(Ljava/lang/String;)Lokhttp3/i0$a;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-object v3, p0, Lokhttp3/internal/http1/b;->headersReader:Lokhttp3/internal/http1/a;

    .line 75
    .line 76
    invoke-virtual {v3}, Lokhttp3/internal/http1/a;->readHeaders()Lokhttp3/y;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v1, v3}, Lokhttp3/i0$a;->headers(Lokhttp3/y;)Lokhttp3/i0$a;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const/16 v3, 0x64

    .line 85
    .line 86
    if-eqz p1, :cond_2

    .line 87
    .line 88
    iget p1, v0, Lokhttp3/internal/http/m;->code:I

    .line 89
    .line 90
    if-ne p1, v3, :cond_2

    .line 91
    .line 92
    const/4 p1, 0x0

    .line 93
    return-object p1

    .line 94
    :catch_0
    move-exception p1

    .line 95
    goto :goto_1

    .line 96
    :cond_2
    iget p1, v0, Lokhttp3/internal/http/m;->code:I

    .line 97
    .line 98
    if-ne p1, v3, :cond_3

    .line 99
    .line 100
    iput v2, p0, Lokhttp3/internal/http1/b;->state:I

    .line 101
    .line 102
    return-object v1

    .line 103
    :cond_3
    const/16 v0, 0x66

    .line 104
    .line 105
    if-gt v0, p1, :cond_4

    .line 106
    .line 107
    const/16 v0, 0xc8

    .line 108
    .line 109
    if-ge p1, v0, :cond_4

    .line 110
    .line 111
    iput v2, p0, Lokhttp3/internal/http1/b;->state:I

    .line 112
    .line 113
    return-object v1

    .line 114
    :cond_4
    const/4 p1, 0x4

    .line 115
    iput p1, p0, Lokhttp3/internal/http1/b;->state:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    .line 117
    return-object v1

    .line 118
    :goto_1
    invoke-virtual {p0}, Lokhttp3/internal/http1/b;->getConnection()Lokhttp3/internal/connection/f;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v0}, Lokhttp3/internal/connection/f;->route()Lokhttp3/k0;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Lokhttp3/k0;->address()Lokhttp3/a;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v0}, Lokhttp3/a;->url()Lokhttp3/z;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0}, Lokhttp3/z;->redact()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    new-instance v1, Ljava/io/IOException;

    .line 139
    .line 140
    const-string v2, "unexpected end of stream on "

    .line 141
    .line 142
    invoke-static {v2, v0}, La1/a1;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-direct {v1, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    throw v1
.end method

.method public reportedContentLength(Lokhttp3/i0;)J
    .locals 2

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lokhttp3/internal/http/g;->promisesBody(Lokhttp3/i0;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    return-wide v0

    .line 15
    :cond_0
    invoke-direct {p0, p1}, Lokhttp3/internal/http1/b;->isChunked(Lokhttp3/i0;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const-wide/16 v0, -0x1

    .line 22
    .line 23
    return-wide v0

    .line 24
    :cond_1
    invoke-static {p1}, Lq7/c;->headersContentLength(Lokhttp3/i0;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    return-wide v0
.end method

.method public final skipConnectBody(Lokhttp3/i0;)V
    .locals 4

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lq7/c;->headersContentLength(Lokhttp3/i0;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide/16 v2, -0x1

    .line 11
    .line 12
    cmp-long p1, v0, v2

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-direct {p0, v0, v1}, Lokhttp3/internal/http1/b;->newFixedLengthSource(J)Lv7/k0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const v0, 0x7fffffff

    .line 22
    .line 23
    .line 24
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 25
    .line 26
    invoke-static {p1, v0, v1}, Lq7/c;->skipAll(Lv7/k0;ILjava/util/concurrent/TimeUnit;)Z

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public trailers()Lokhttp3/y;
    .locals 2

    .line 1
    iget v0, p0, Lokhttp3/internal/http1/b;->state:I

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/internal/http1/b;->trailers:Lokhttp3/y;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lq7/c;->EMPTY_HEADERS:Lokhttp3/y;

    .line 11
    .line 12
    :cond_0
    return-object v0

    .line 13
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v1, "too early; can\'t read the trailers yet"

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v0
.end method

.method public final writeRequest(Lokhttp3/y;Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "headers"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "requestLine"

    .line 7
    .line 8
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lokhttp3/internal/http1/b;->state:I

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lokhttp3/internal/http1/b;->sink:Lv7/k;

    .line 16
    .line 17
    invoke-interface {v0, p2}, Lv7/k;->o(Ljava/lang/String;)Lv7/k;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    const-string v0, "\r\n"

    .line 22
    .line 23
    invoke-interface {p2, v0}, Lv7/k;->o(Ljava/lang/String;)Lv7/k;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lokhttp3/y;->size()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    const/4 v1, 0x0

    .line 31
    :goto_0
    if-ge v1, p2, :cond_0

    .line 32
    .line 33
    iget-object v2, p0, Lokhttp3/internal/http1/b;->sink:Lv7/k;

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Lokhttp3/y;->name(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-interface {v2, v3}, Lv7/k;->o(Ljava/lang/String;)Lv7/k;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const-string v3, ": "

    .line 44
    .line 45
    invoke-interface {v2, v3}, Lv7/k;->o(Ljava/lang/String;)Lv7/k;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {p1, v1}, Lokhttp3/y;->value(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-interface {v2, v3}, Lv7/k;->o(Ljava/lang/String;)Lv7/k;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-interface {v2, v0}, Lv7/k;->o(Ljava/lang/String;)Lv7/k;

    .line 58
    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    iget-object p1, p0, Lokhttp3/internal/http1/b;->sink:Lv7/k;

    .line 64
    .line 65
    invoke-interface {p1, v0}, Lv7/k;->o(Ljava/lang/String;)Lv7/k;

    .line 66
    .line 67
    .line 68
    const/4 p1, 0x1

    .line 69
    iput p1, p0, Lokhttp3/internal/http1/b;->state:I

    .line 70
    .line 71
    return-void

    .line 72
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string p2, "state: "

    .line 75
    .line 76
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget p2, p0, Lokhttp3/internal/http1/b;->state:I

    .line 80
    .line 81
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p2
.end method

.method public writeRequestHeaders(Lokhttp3/g0;)V
    .locals 3

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lokhttp3/internal/http/k;->INSTANCE:Lokhttp3/internal/http/k;

    .line 7
    .line 8
    invoke-virtual {p0}, Lokhttp3/internal/http1/b;->getConnection()Lokhttp3/internal/connection/f;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Lokhttp3/internal/connection/f;->route()Lokhttp3/k0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Lokhttp3/k0;->proxy()Ljava/net/Proxy;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v2, "connection.route().proxy.type()"

    .line 25
    .line 26
    invoke-static {v2, v1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1, v1}, Lokhttp3/internal/http/k;->get(Lokhttp3/g0;Ljava/net/Proxy$Type;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1}, Lokhttp3/g0;->headers()Lokhttp3/y;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p0, p1, v0}, Lokhttp3/internal/http1/b;->writeRequest(Lokhttp3/y;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method
