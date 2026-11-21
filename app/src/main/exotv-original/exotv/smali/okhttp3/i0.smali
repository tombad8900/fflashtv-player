.class public final Lokhttp3/i0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/i0$a;
    }
.end annotation


# instance fields
.field private final body:Lokhttp3/j0;

.field private final cacheResponse:Lokhttp3/i0;

.field private final code:I

.field private final exchange:Lokhttp3/internal/connection/c;

.field private final handshake:Lokhttp3/x;

.field private final headers:Lokhttp3/y;

.field private lazyCacheControl:Lokhttp3/e;

.field private final message:Ljava/lang/String;

.field private final networkResponse:Lokhttp3/i0;

.field private final priorResponse:Lokhttp3/i0;

.field private final protocol:Lokhttp3/f0;

.field private final receivedResponseAtMillis:J

.field private final request:Lokhttp3/g0;

.field private final sentRequestAtMillis:J


# direct methods
.method public constructor <init>(Lokhttp3/g0;Lokhttp3/f0;Ljava/lang/String;ILokhttp3/x;Lokhttp3/y;Lokhttp3/j0;Lokhttp3/i0;Lokhttp3/i0;Lokhttp3/i0;JJLokhttp3/internal/connection/c;)V
    .locals 1

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "protocol"

    .line 7
    .line 8
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "message"

    .line 12
    .line 13
    invoke-static {v0, p3}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "headers"

    .line 17
    .line 18
    invoke-static {v0, p6}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lokhttp3/i0;->request:Lokhttp3/g0;

    .line 25
    .line 26
    iput-object p2, p0, Lokhttp3/i0;->protocol:Lokhttp3/f0;

    .line 27
    .line 28
    iput-object p3, p0, Lokhttp3/i0;->message:Ljava/lang/String;

    .line 29
    .line 30
    iput p4, p0, Lokhttp3/i0;->code:I

    .line 31
    .line 32
    iput-object p5, p0, Lokhttp3/i0;->handshake:Lokhttp3/x;

    .line 33
    .line 34
    iput-object p6, p0, Lokhttp3/i0;->headers:Lokhttp3/y;

    .line 35
    .line 36
    iput-object p7, p0, Lokhttp3/i0;->body:Lokhttp3/j0;

    .line 37
    .line 38
    iput-object p8, p0, Lokhttp3/i0;->networkResponse:Lokhttp3/i0;

    .line 39
    .line 40
    iput-object p9, p0, Lokhttp3/i0;->cacheResponse:Lokhttp3/i0;

    .line 41
    .line 42
    iput-object p10, p0, Lokhttp3/i0;->priorResponse:Lokhttp3/i0;

    .line 43
    .line 44
    iput-wide p11, p0, Lokhttp3/i0;->sentRequestAtMillis:J

    .line 45
    .line 46
    iput-wide p13, p0, Lokhttp3/i0;->receivedResponseAtMillis:J

    .line 47
    .line 48
    move-object/from16 p1, p15

    .line 49
    .line 50
    iput-object p1, p0, Lokhttp3/i0;->exchange:Lokhttp3/internal/connection/c;

    .line 51
    .line 52
    return-void
.end method

.method public static synthetic header$default(Lokhttp3/i0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lokhttp3/i0;->header(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public final -deprecated_body()Lokhttp3/j0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->body:Lokhttp3/j0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_cacheControl()Lokhttp3/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokhttp3/i0;->cacheControl()Lokhttp3/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final -deprecated_cacheResponse()Lokhttp3/i0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->cacheResponse:Lokhttp3/i0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_code()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/i0;->code:I

    .line 2
    .line 3
    return v0
.end method

.method public final -deprecated_handshake()Lokhttp3/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->handshake:Lokhttp3/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_headers()Lokhttp3/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->headers:Lokhttp3/y;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_message()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->message:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_networkResponse()Lokhttp3/i0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->networkResponse:Lokhttp3/i0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_priorResponse()Lokhttp3/i0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->priorResponse:Lokhttp3/i0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_protocol()Lokhttp3/f0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->protocol:Lokhttp3/f0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_receivedResponseAtMillis()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lokhttp3/i0;->receivedResponseAtMillis:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final -deprecated_request()Lokhttp3/g0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->request:Lokhttp3/g0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_sentRequestAtMillis()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lokhttp3/i0;->sentRequestAtMillis:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final body()Lokhttp3/j0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->body:Lokhttp3/j0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final cacheControl()Lokhttp3/e;
    .locals 2

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->lazyCacheControl:Lokhttp3/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lokhttp3/e;->Companion:Lokhttp3/e$b;

    .line 6
    .line 7
    iget-object v1, p0, Lokhttp3/i0;->headers:Lokhttp3/y;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lokhttp3/e$b;->parse(Lokhttp3/y;)Lokhttp3/e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lokhttp3/i0;->lazyCacheControl:Lokhttp3/e;

    .line 14
    .line 15
    :cond_0
    return-object v0
.end method

.method public final cacheResponse()Lokhttp3/i0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->cacheResponse:Lokhttp3/i0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final challenges()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lokhttp3/j;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->headers:Lokhttp3/y;

    .line 2
    .line 3
    iget v1, p0, Lokhttp3/i0;->code:I

    .line 4
    .line 5
    const/16 v2, 0x191

    .line 6
    .line 7
    if-eq v1, v2, :cond_1

    .line 8
    .line 9
    const/16 v2, 0x197

    .line 10
    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    sget-object v0, Lm6/p;->j:Lm6/p;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string v1, "Proxy-Authenticate"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const-string v1, "WWW-Authenticate"

    .line 20
    .line 21
    :goto_0
    invoke-static {v0, v1}, Lokhttp3/internal/http/g;->parseChallenges(Lokhttp3/y;Ljava/lang/String;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->body:Lokhttp3/j0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lokhttp3/j0;->close()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string v1, "response is not eligible for a body and must not be closed"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw v0
.end method

.method public final code()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/i0;->code:I

    .line 2
    .line 3
    return v0
.end method

.method public final exchange()Lokhttp3/internal/connection/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->exchange:Lokhttp3/internal/connection/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final handshake()Lokhttp3/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->handshake:Lokhttp3/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public final header(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "name"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lokhttp3/i0;->header$default(Lokhttp3/i0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final header(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "name"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lokhttp3/i0;->headers:Lokhttp3/y;

    invoke-virtual {v0, p1}, Lokhttp3/y;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    return-object p1
.end method

.method public final headers(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lokhttp3/i0;->headers:Lokhttp3/y;

    invoke-virtual {v0, p1}, Lokhttp3/y;->values(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final headers()Lokhttp3/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->headers:Lokhttp3/y;

    return-object v0
.end method

.method public final isRedirect()Z
    .locals 2

    .line 1
    iget v0, p0, Lokhttp3/i0;->code:I

    .line 2
    .line 3
    const/16 v1, 0x133

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x134

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_0
    :pswitch_0
    const/4 v0, 0x1

    .line 17
    return v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final isSuccessful()Z
    .locals 3

    .line 1
    iget v0, p0, Lokhttp3/i0;->code:I

    .line 2
    .line 3
    const/16 v1, 0xc8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-gt v1, v0, :cond_0

    .line 7
    .line 8
    const/16 v1, 0x12c

    .line 9
    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    return v2
.end method

.method public final message()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->message:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final networkResponse()Lokhttp3/i0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->networkResponse:Lokhttp3/i0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final newBuilder()Lokhttp3/i0$a;
    .locals 1

    .line 1
    new-instance v0, Lokhttp3/i0$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lokhttp3/i0$a;-><init>(Lokhttp3/i0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final peekBody(J)Lokhttp3/j0;
    .locals 6

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->body:Lokhttp3/j0;

    .line 2
    .line 3
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lokhttp3/j0;->source()Lv7/l;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Lv7/l;->peek()Lv7/e0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lv7/j;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1, p2}, Lv7/e0;->request(J)Z

    .line 20
    .line 21
    .line 22
    iget-object v2, v0, Lv7/e0;->k:Lv7/j;

    .line 23
    .line 24
    iget-wide v2, v2, Lv7/j;->k:J

    .line 25
    .line 26
    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    :goto_0
    const-wide/16 v2, 0x0

    .line 31
    .line 32
    cmp-long v2, p1, v2

    .line 33
    .line 34
    if-lez v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0, v1, p1, p2}, Lv7/e0;->read(Lv7/j;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    const-wide/16 v4, -0x1

    .line 41
    .line 42
    cmp-long v4, v2, v4

    .line 43
    .line 44
    if-eqz v4, :cond_0

    .line 45
    .line 46
    sub-long/2addr p1, v2

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_1
    sget-object p1, Lokhttp3/j0;->Companion:Lokhttp3/j0$b;

    .line 55
    .line 56
    iget-object p2, p0, Lokhttp3/i0;->body:Lokhttp3/j0;

    .line 57
    .line 58
    invoke-virtual {p2}, Lokhttp3/j0;->contentType()Lokhttp3/d0;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    iget-wide v2, v1, Lv7/j;->k:J

    .line 63
    .line 64
    invoke-virtual {p1, v1, p2, v2, v3}, Lokhttp3/j0$b;->create(Lv7/l;Lokhttp3/d0;J)Lokhttp3/j0;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1
.end method

.method public final priorResponse()Lokhttp3/i0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->priorResponse:Lokhttp3/i0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final protocol()Lokhttp3/f0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->protocol:Lokhttp3/f0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final receivedResponseAtMillis()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lokhttp3/i0;->receivedResponseAtMillis:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final request()Lokhttp3/g0;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->request:Lokhttp3/g0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final sentRequestAtMillis()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lokhttp3/i0;->sentRequestAtMillis:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Response{protocol="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lokhttp3/i0;->protocol:Lokhttp3/f0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", code="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lokhttp3/i0;->code:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", message="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lokhttp3/i0;->message:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", url="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lokhttp3/i0;->request:Lokhttp3/g0;

    .line 39
    .line 40
    invoke-virtual {v1}, Lokhttp3/g0;->url()Lokhttp3/z;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const/16 v1, 0x7d

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0
.end method

.method public final trailers()Lokhttp3/y;
    .locals 2

    .line 1
    iget-object v0, p0, Lokhttp3/i0;->exchange:Lokhttp3/internal/connection/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lokhttp3/internal/connection/c;->trailers()Lokhttp3/y;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string v1, "trailers not available"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v0
.end method
