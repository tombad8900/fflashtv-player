.class public final Lokhttp3/d$c;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/d$c$a;
    }
.end annotation


# static fields
.field public static final Companion:Lokhttp3/d$c$a;

.field private static final RECEIVED_MILLIS:Ljava/lang/String;

.field private static final SENT_MILLIS:Ljava/lang/String;


# instance fields
.field private final code:I

.field private final handshake:Lokhttp3/x;

.field private final message:Ljava/lang/String;

.field private final protocol:Lokhttp3/f0;

.field private final receivedResponseMillis:J

.field private final requestMethod:Ljava/lang/String;

.field private final responseHeaders:Lokhttp3/y;

.field private final sentRequestMillis:J

.field private final url:Lokhttp3/z;

.field private final varyHeaders:Lokhttp3/y;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lokhttp3/d$c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lokhttp3/d$c$a;-><init>(Lz6/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lokhttp3/d$c;->Companion:Lokhttp3/d$c$a;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    sget-object v1, Ls7/h;->Companion:Ls7/h$a;

    .line 15
    .line 16
    invoke-virtual {v1}, Ls7/h$a;->get()Ls7/h;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Ls7/h;->getPrefix()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v2, "-Sent-Millis"

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, Lokhttp3/d$c;->SENT_MILLIS:Ljava/lang/String;

    .line 37
    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ls7/h$a;->get()Ls7/h;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Ls7/h;->getPrefix()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, "-Received-Millis"

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Lokhttp3/d$c;->RECEIVED_MILLIS:Ljava/lang/String;

    .line 64
    .line 65
    return-void
.end method

.method public constructor <init>(Lokhttp3/i0;)V
    .locals 2

    const-string v0, "response"

    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    invoke-virtual {p1}, Lokhttp3/i0;->request()Lokhttp3/g0;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/g0;->url()Lokhttp3/z;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/d$c;->url:Lokhttp3/z;

    .line 51
    sget-object v0, Lokhttp3/d;->Companion:Lokhttp3/d$b;

    invoke-virtual {v0, p1}, Lokhttp3/d$b;->varyHeaders(Lokhttp3/i0;)Lokhttp3/y;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/d$c;->varyHeaders:Lokhttp3/y;

    .line 52
    invoke-virtual {p1}, Lokhttp3/i0;->request()Lokhttp3/g0;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/g0;->method()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/d$c;->requestMethod:Ljava/lang/String;

    .line 53
    invoke-virtual {p1}, Lokhttp3/i0;->protocol()Lokhttp3/f0;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/d$c;->protocol:Lokhttp3/f0;

    .line 54
    invoke-virtual {p1}, Lokhttp3/i0;->code()I

    move-result v0

    iput v0, p0, Lokhttp3/d$c;->code:I

    .line 55
    invoke-virtual {p1}, Lokhttp3/i0;->message()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/d$c;->message:Ljava/lang/String;

    .line 56
    invoke-virtual {p1}, Lokhttp3/i0;->headers()Lokhttp3/y;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/d$c;->responseHeaders:Lokhttp3/y;

    .line 57
    invoke-virtual {p1}, Lokhttp3/i0;->handshake()Lokhttp3/x;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/d$c;->handshake:Lokhttp3/x;

    .line 58
    invoke-virtual {p1}, Lokhttp3/i0;->sentRequestAtMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lokhttp3/d$c;->sentRequestMillis:J

    .line 59
    invoke-virtual {p1}, Lokhttp3/i0;->receivedResponseAtMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lokhttp3/d$c;->receivedResponseMillis:J

    return-void
.end method

.method public constructor <init>(Lv7/k0;)V
    .locals 10

    const-string v0, "Cache corruption for "

    const-string v1, "rawSource"

    invoke-static {v1, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    :try_start_0
    invoke-static {p1}, Lv7/b;->c(Lv7/k0;)Lv7/e0;

    move-result-object v1

    const-wide v2, 0x7fffffffffffffffL

    .line 3
    invoke-virtual {v1, v2, v3}, Lv7/e0;->n(J)Ljava/lang/String;

    move-result-object v4

    .line 4
    sget-object v5, Lokhttp3/z;->Companion:Lokhttp3/z$b;

    invoke-virtual {v5, v4}, Lokhttp3/z$b;->parse(Ljava/lang/String;)Lokhttp3/z;

    move-result-object v5

    if-eqz v5, :cond_7

    iput-object v5, p0, Lokhttp3/d$c;->url:Lokhttp3/z;

    .line 5
    invoke-virtual {v1, v2, v3}, Lv7/e0;->n(J)Ljava/lang/String;

    move-result-object v0

    .line 6
    iput-object v0, p0, Lokhttp3/d$c;->requestMethod:Ljava/lang/String;

    .line 7
    new-instance v0, Lokhttp3/y$a;

    invoke-direct {v0}, Lokhttp3/y$a;-><init>()V

    .line 8
    sget-object v4, Lokhttp3/d;->Companion:Lokhttp3/d$b;

    invoke-virtual {v4, v1}, Lokhttp3/d$b;->readInt$okhttp(Lv7/l;)I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v4, :cond_0

    .line 9
    invoke-virtual {v1, v2, v3}, Lv7/e0;->n(J)Ljava/lang/String;

    move-result-object v7

    .line 10
    invoke-virtual {v0, v7}, Lokhttp3/y$a;->addLenient$okhttp(Ljava/lang/String;)Lokhttp3/y$a;

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    .line 11
    :cond_0
    invoke-virtual {v0}, Lokhttp3/y$a;->build()Lokhttp3/y;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/d$c;->varyHeaders:Lokhttp3/y;

    .line 12
    sget-object v0, Lokhttp3/internal/http/m;->Companion:Lokhttp3/internal/http/m$a;

    .line 13
    invoke-virtual {v1, v2, v3}, Lv7/e0;->n(J)Ljava/lang/String;

    move-result-object v4

    .line 14
    invoke-virtual {v0, v4}, Lokhttp3/internal/http/m$a;->parse(Ljava/lang/String;)Lokhttp3/internal/http/m;

    move-result-object v0

    .line 15
    iget-object v4, v0, Lokhttp3/internal/http/m;->protocol:Lokhttp3/f0;

    iput-object v4, p0, Lokhttp3/d$c;->protocol:Lokhttp3/f0;

    .line 16
    iget v4, v0, Lokhttp3/internal/http/m;->code:I

    iput v4, p0, Lokhttp3/d$c;->code:I

    .line 17
    iget-object v0, v0, Lokhttp3/internal/http/m;->message:Ljava/lang/String;

    iput-object v0, p0, Lokhttp3/d$c;->message:Ljava/lang/String;

    .line 18
    new-instance v0, Lokhttp3/y$a;

    invoke-direct {v0}, Lokhttp3/y$a;-><init>()V

    .line 19
    sget-object v4, Lokhttp3/d;->Companion:Lokhttp3/d$b;

    invoke-virtual {v4, v1}, Lokhttp3/d$b;->readInt$okhttp(Lv7/l;)I

    move-result v4

    :goto_1
    if-ge v5, v4, :cond_1

    .line 20
    invoke-virtual {v1, v2, v3}, Lv7/e0;->n(J)Ljava/lang/String;

    move-result-object v6

    .line 21
    invoke-virtual {v0, v6}, Lokhttp3/y$a;->addLenient$okhttp(Ljava/lang/String;)Lokhttp3/y$a;

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 22
    :cond_1
    sget-object v4, Lokhttp3/d$c;->SENT_MILLIS:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lokhttp3/y$a;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 23
    sget-object v6, Lokhttp3/d$c;->RECEIVED_MILLIS:Ljava/lang/String;

    invoke-virtual {v0, v6}, Lokhttp3/y$a;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 24
    invoke-virtual {v0, v4}, Lokhttp3/y$a;->removeAll(Ljava/lang/String;)Lokhttp3/y$a;

    .line 25
    invoke-virtual {v0, v6}, Lokhttp3/y$a;->removeAll(Ljava/lang/String;)Lokhttp3/y$a;

    const-wide/16 v8, 0x0

    if-eqz v5, :cond_2

    .line 26
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    goto :goto_2

    :cond_2
    move-wide v4, v8

    :goto_2
    iput-wide v4, p0, Lokhttp3/d$c;->sentRequestMillis:J

    if-eqz v7, :cond_3

    .line 27
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v8

    :cond_3
    iput-wide v8, p0, Lokhttp3/d$c;->receivedResponseMillis:J

    .line 28
    invoke-virtual {v0}, Lokhttp3/y$a;->build()Lokhttp3/y;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/d$c;->responseHeaders:Lokhttp3/y;

    .line 29
    invoke-direct {p0}, Lokhttp3/d$c;->isHttps()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 30
    invoke-virtual {v1, v2, v3}, Lv7/e0;->n(J)Ljava/lang/String;

    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_5

    .line 32
    invoke-virtual {v1, v2, v3}, Lv7/e0;->n(J)Ljava/lang/String;

    move-result-object v0

    .line 33
    sget-object v4, Lokhttp3/k;->Companion:Lokhttp3/k$b;

    invoke-virtual {v4, v0}, Lokhttp3/k$b;->forJavaName(Ljava/lang/String;)Lokhttp3/k;

    move-result-object v0

    .line 34
    invoke-direct {p0, v1}, Lokhttp3/d$c;->readCertificateList(Lv7/l;)Ljava/util/List;

    move-result-object v4

    .line 35
    invoke-direct {p0, v1}, Lokhttp3/d$c;->readCertificateList(Lv7/l;)Ljava/util/List;

    move-result-object v5

    .line 36
    invoke-virtual {v1}, Lv7/e0;->j()Z

    move-result v6

    if-nez v6, :cond_4

    .line 37
    sget-object v6, Lokhttp3/l0;->Companion:Lokhttp3/l0$a;

    .line 38
    invoke-virtual {v1, v2, v3}, Lv7/e0;->n(J)Ljava/lang/String;

    move-result-object v1

    .line 39
    invoke-virtual {v6, v1}, Lokhttp3/l0$a;->forJavaName(Ljava/lang/String;)Lokhttp3/l0;

    move-result-object v1

    goto :goto_3

    .line 40
    :cond_4
    sget-object v1, Lokhttp3/l0;->SSL_3_0:Lokhttp3/l0;

    .line 41
    :goto_3
    sget-object v2, Lokhttp3/x;->Companion:Lokhttp3/x$a;

    invoke-virtual {v2, v1, v0, v4, v5}, Lokhttp3/x$a;->get(Lokhttp3/l0;Lokhttp3/k;Ljava/util/List;Ljava/util/List;)Lokhttp3/x;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/d$c;->handshake:Lokhttp3/x;

    goto :goto_4

    .line 42
    :cond_5
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "expected \"\" but was \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x22

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    const/4 v0, 0x0

    .line 43
    iput-object v0, p0, Lokhttp3/d$c;->handshake:Lokhttp3/x;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    :goto_4
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    return-void

    .line 45
    :cond_7
    :try_start_1
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 46
    sget-object v0, Ls7/h;->Companion:Ls7/h$a;

    invoke-virtual {v0}, Ls7/h$a;->get()Ls7/h;

    move-result-object v0

    const-string v2, "cache corruption"

    const/4 v3, 0x5

    invoke-virtual {v0, v2, v3, v1}, Ls7/h;->log(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 47
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    :goto_5
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {p1, v0}, Lt5/a;->b(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private final isHttps()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lokhttp3/d$c;->url:Lokhttp3/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokhttp3/z;->scheme()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "https"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method private final readCertificateList(Lv7/l;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv7/l;",
            ")",
            "Ljava/util/List<",
            "Ljava/security/cert/Certificate;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lokhttp3/d;->Companion:Lokhttp3/d$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lokhttp3/d$b;->readInt$okhttp(Lv7/l;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    sget-object p1, Lm6/p;->j:Lm6/p;

    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    :try_start_0
    const-string v1, "X.509"

    .line 14
    .line 15
    invoke-static {v1}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    move v4, v3

    .line 26
    :goto_0
    if-ge v4, v0, :cond_2

    .line 27
    .line 28
    invoke-interface {p1}, Lv7/l;->v()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    new-instance v6, Lv7/j;

    .line 33
    .line 34
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sget-object v7, Lv7/m;->m:Lv7/m;

    .line 38
    .line 39
    invoke-static {v5}, Lk2/b;->m(Ljava/lang/String;)Lv7/m;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    if-eqz v5, :cond_1

    .line 44
    .line 45
    invoke-virtual {v6, v5}, Lv7/j;->J(Lv7/m;)V

    .line 46
    .line 47
    .line 48
    new-instance v5, Lv7/i;

    .line 49
    .line 50
    invoke-direct {v5, v6, v3}, Lv7/i;-><init>(Lv7/l;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v5}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    add-int/lit8 v4, v4, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catch_0
    move-exception p1

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 66
    .line 67
    const-string v0, "Corrupt certificate in cache entry"

    .line 68
    .line 69
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p1
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    :cond_2
    return-object v2

    .line 74
    :goto_1
    new-instance v0, Ljava/io/IOException;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0
.end method

.method private final writeCertList(Lv7/k;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv7/k;",
            "Ljava/util/List<",
            "+",
            "Ljava/security/cert/Certificate;",
            ">;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    invoke-interface {p1, v0, v1}, Lv7/k;->z(J)Lv7/k;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/16 v1, 0xa

    .line 11
    .line 12
    invoke-interface {v0, v1}, Lv7/k;->writeByte(I)Lv7/k;

    .line 13
    .line 14
    .line 15
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/security/cert/Certificate;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/security/cert/Certificate;->getEncoded()[B

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget-object v2, Lv7/m;->m:Lv7/m;

    .line 36
    .line 37
    const-string v2, "bytes"

    .line 38
    .line 39
    invoke-static {v2, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lk2/b;->t([B)Lv7/m;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Lv7/m;->a()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {p1, v0}, Lv7/k;->o(Ljava/lang/String;)Lv7/k;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-interface {v0, v1}, Lv7/k;->writeByte(I)Lv7/k;
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catch_0
    move-exception p1

    .line 59
    goto :goto_1

    .line 60
    :cond_0
    return-void

    .line 61
    :goto_1
    new-instance p2, Ljava/io/IOException;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p2
.end method


# virtual methods
.method public final matches(Lokhttp3/g0;Lokhttp3/i0;)Z
    .locals 2

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "response"

    .line 7
    .line 8
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lokhttp3/d$c;->url:Lokhttp3/z;

    .line 12
    .line 13
    invoke-virtual {p1}, Lokhttp3/g0;->url()Lokhttp3/z;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v0, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lokhttp3/d$c;->requestMethod:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p1}, Lokhttp3/g0;->method()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v0, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    sget-object v0, Lokhttp3/d;->Companion:Lokhttp3/d$b;

    .line 36
    .line 37
    iget-object v1, p0, Lokhttp3/d$c;->varyHeaders:Lokhttp3/y;

    .line 38
    .line 39
    invoke-virtual {v0, p2, v1, p1}, Lokhttp3/d$b;->varyMatches(Lokhttp3/i0;Lokhttp3/y;Lokhttp3/g0;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    return p1

    .line 47
    :cond_0
    const/4 p1, 0x0

    .line 48
    return p1
.end method

.method public final response(Lokhttp3/internal/cache/d$d;)Lokhttp3/i0;
    .locals 5

    .line 1
    const-string v0, "snapshot"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/d$c;->responseHeaders:Lokhttp3/y;

    .line 7
    .line 8
    const-string v1, "Content-Type"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lokhttp3/y;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lokhttp3/d$c;->responseHeaders:Lokhttp3/y;

    .line 15
    .line 16
    const-string v2, "Content-Length"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Lokhttp3/y;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    new-instance v2, Lokhttp3/g0$a;

    .line 23
    .line 24
    invoke-direct {v2}, Lokhttp3/g0$a;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-object v3, p0, Lokhttp3/d$c;->url:Lokhttp3/z;

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Lokhttp3/g0$a;->url(Lokhttp3/z;)Lokhttp3/g0$a;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-object v3, p0, Lokhttp3/d$c;->requestMethod:Ljava/lang/String;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-virtual {v2, v3, v4}, Lokhttp3/g0$a;->method(Ljava/lang/String;Lokhttp3/h0;)Lokhttp3/g0$a;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v3, p0, Lokhttp3/d$c;->varyHeaders:Lokhttp3/y;

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Lokhttp3/g0$a;->headers(Lokhttp3/y;)Lokhttp3/g0$a;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Lokhttp3/g0$a;->build()Lokhttp3/g0;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    new-instance v3, Lokhttp3/i0$a;

    .line 51
    .line 52
    invoke-direct {v3}, Lokhttp3/i0$a;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v2}, Lokhttp3/i0$a;->request(Lokhttp3/g0;)Lokhttp3/i0$a;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    iget-object v3, p0, Lokhttp3/d$c;->protocol:Lokhttp3/f0;

    .line 60
    .line 61
    invoke-virtual {v2, v3}, Lokhttp3/i0$a;->protocol(Lokhttp3/f0;)Lokhttp3/i0$a;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    iget v3, p0, Lokhttp3/d$c;->code:I

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Lokhttp3/i0$a;->code(I)Lokhttp3/i0$a;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    iget-object v3, p0, Lokhttp3/d$c;->message:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v2, v3}, Lokhttp3/i0$a;->message(Ljava/lang/String;)Lokhttp3/i0$a;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    iget-object v3, p0, Lokhttp3/d$c;->responseHeaders:Lokhttp3/y;

    .line 78
    .line 79
    invoke-virtual {v2, v3}, Lokhttp3/i0$a;->headers(Lokhttp3/y;)Lokhttp3/i0$a;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    new-instance v3, Lokhttp3/d$a;

    .line 84
    .line 85
    invoke-direct {v3, p1, v0, v1}, Lokhttp3/d$a;-><init>(Lokhttp3/internal/cache/d$d;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v3}, Lokhttp3/i0$a;->body(Lokhttp3/j0;)Lokhttp3/i0$a;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iget-object v0, p0, Lokhttp3/d$c;->handshake:Lokhttp3/x;

    .line 93
    .line 94
    invoke-virtual {p1, v0}, Lokhttp3/i0$a;->handshake(Lokhttp3/x;)Lokhttp3/i0$a;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iget-wide v0, p0, Lokhttp3/d$c;->sentRequestMillis:J

    .line 99
    .line 100
    invoke-virtual {p1, v0, v1}, Lokhttp3/i0$a;->sentRequestAtMillis(J)Lokhttp3/i0$a;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iget-wide v0, p0, Lokhttp3/d$c;->receivedResponseMillis:J

    .line 105
    .line 106
    invoke-virtual {p1, v0, v1}, Lokhttp3/i0$a;->receivedResponseAtMillis(J)Lokhttp3/i0$a;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p1}, Lokhttp3/i0$a;->build()Lokhttp3/i0;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1
.end method

.method public final writeTo(Lokhttp3/internal/cache/d$b;)V
    .locals 7

    .line 1
    const-string v0, "editor"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p1, v0}, Lokhttp3/internal/cache/d$b;->newSink(I)Lv7/i0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lv7/b;->b(Lv7/i0;)Lv7/d0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :try_start_0
    iget-object v1, p0, Lokhttp3/d$c;->url:Lokhttp3/z;

    .line 16
    .line 17
    invoke-virtual {v1}, Lokhttp3/z;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p1, v1}, Lv7/d0;->o(Ljava/lang/String;)Lv7/k;

    .line 22
    .line 23
    .line 24
    const/16 v1, 0xa

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Lv7/d0;->writeByte(I)Lv7/k;

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lokhttp3/d$c;->requestMethod:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1, v2}, Lv7/d0;->o(Ljava/lang/String;)Lv7/k;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v1}, Lv7/d0;->writeByte(I)Lv7/k;

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Lokhttp3/d$c;->varyHeaders:Lokhttp3/y;

    .line 38
    .line 39
    invoke-virtual {v2}, Lokhttp3/y;->size()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    int-to-long v2, v2

    .line 44
    invoke-virtual {p1, v2, v3}, Lv7/d0;->z(J)Lv7/k;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v1}, Lv7/d0;->writeByte(I)Lv7/k;

    .line 48
    .line 49
    .line 50
    iget-object v2, p0, Lokhttp3/d$c;->varyHeaders:Lokhttp3/y;

    .line 51
    .line 52
    invoke-virtual {v2}, Lokhttp3/y;->size()I

    .line 53
    .line 54
    .line 55
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    move v3, v0

    .line 57
    :goto_0
    const-string v4, ": "

    .line 58
    .line 59
    if-ge v3, v2, :cond_0

    .line 60
    .line 61
    :try_start_1
    iget-object v5, p0, Lokhttp3/d$c;->varyHeaders:Lokhttp3/y;

    .line 62
    .line 63
    invoke-virtual {v5, v3}, Lokhttp3/y;->name(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-virtual {p1, v5}, Lv7/d0;->o(Ljava/lang/String;)Lv7/k;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v4}, Lv7/d0;->o(Ljava/lang/String;)Lv7/k;

    .line 71
    .line 72
    .line 73
    iget-object v4, p0, Lokhttp3/d$c;->varyHeaders:Lokhttp3/y;

    .line 74
    .line 75
    invoke-virtual {v4, v3}, Lokhttp3/y;->value(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {p1, v4}, Lv7/d0;->o(Ljava/lang/String;)Lv7/k;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v1}, Lv7/d0;->writeByte(I)Lv7/k;

    .line 83
    .line 84
    .line 85
    add-int/lit8 v3, v3, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    goto/16 :goto_2

    .line 90
    .line 91
    :cond_0
    new-instance v2, Lokhttp3/internal/http/m;

    .line 92
    .line 93
    iget-object v3, p0, Lokhttp3/d$c;->protocol:Lokhttp3/f0;

    .line 94
    .line 95
    iget v5, p0, Lokhttp3/d$c;->code:I

    .line 96
    .line 97
    iget-object v6, p0, Lokhttp3/d$c;->message:Ljava/lang/String;

    .line 98
    .line 99
    invoke-direct {v2, v3, v5, v6}, Lokhttp3/internal/http/m;-><init>(Lokhttp3/f0;ILjava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Lokhttp3/internal/http/m;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {p1, v2}, Lv7/d0;->o(Ljava/lang/String;)Lv7/k;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, v1}, Lv7/d0;->writeByte(I)Lv7/k;

    .line 110
    .line 111
    .line 112
    iget-object v2, p0, Lokhttp3/d$c;->responseHeaders:Lokhttp3/y;

    .line 113
    .line 114
    invoke-virtual {v2}, Lokhttp3/y;->size()I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    add-int/lit8 v2, v2, 0x2

    .line 119
    .line 120
    int-to-long v2, v2

    .line 121
    invoke-virtual {p1, v2, v3}, Lv7/d0;->z(J)Lv7/k;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v1}, Lv7/d0;->writeByte(I)Lv7/k;

    .line 125
    .line 126
    .line 127
    iget-object v2, p0, Lokhttp3/d$c;->responseHeaders:Lokhttp3/y;

    .line 128
    .line 129
    invoke-virtual {v2}, Lokhttp3/y;->size()I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    :goto_1
    if-ge v0, v2, :cond_1

    .line 134
    .line 135
    iget-object v3, p0, Lokhttp3/d$c;->responseHeaders:Lokhttp3/y;

    .line 136
    .line 137
    invoke-virtual {v3, v0}, Lokhttp3/y;->name(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {p1, v3}, Lv7/d0;->o(Ljava/lang/String;)Lv7/k;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, v4}, Lv7/d0;->o(Ljava/lang/String;)Lv7/k;

    .line 145
    .line 146
    .line 147
    iget-object v3, p0, Lokhttp3/d$c;->responseHeaders:Lokhttp3/y;

    .line 148
    .line 149
    invoke-virtual {v3, v0}, Lokhttp3/y;->value(I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-virtual {p1, v3}, Lv7/d0;->o(Ljava/lang/String;)Lv7/k;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, v1}, Lv7/d0;->writeByte(I)Lv7/k;

    .line 157
    .line 158
    .line 159
    add-int/lit8 v0, v0, 0x1

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_1
    sget-object v0, Lokhttp3/d$c;->SENT_MILLIS:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {p1, v0}, Lv7/d0;->o(Ljava/lang/String;)Lv7/k;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, v4}, Lv7/d0;->o(Ljava/lang/String;)Lv7/k;

    .line 168
    .line 169
    .line 170
    iget-wide v2, p0, Lokhttp3/d$c;->sentRequestMillis:J

    .line 171
    .line 172
    invoke-virtual {p1, v2, v3}, Lv7/d0;->z(J)Lv7/k;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1, v1}, Lv7/d0;->writeByte(I)Lv7/k;

    .line 176
    .line 177
    .line 178
    sget-object v0, Lokhttp3/d$c;->RECEIVED_MILLIS:Ljava/lang/String;

    .line 179
    .line 180
    invoke-virtual {p1, v0}, Lv7/d0;->o(Ljava/lang/String;)Lv7/k;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, v4}, Lv7/d0;->o(Ljava/lang/String;)Lv7/k;

    .line 184
    .line 185
    .line 186
    iget-wide v2, p0, Lokhttp3/d$c;->receivedResponseMillis:J

    .line 187
    .line 188
    invoke-virtual {p1, v2, v3}, Lv7/d0;->z(J)Lv7/k;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1, v1}, Lv7/d0;->writeByte(I)Lv7/k;

    .line 192
    .line 193
    .line 194
    invoke-direct {p0}, Lokhttp3/d$c;->isHttps()Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_2

    .line 199
    .line 200
    invoke-virtual {p1, v1}, Lv7/d0;->writeByte(I)Lv7/k;

    .line 201
    .line 202
    .line 203
    iget-object v0, p0, Lokhttp3/d$c;->handshake:Lokhttp3/x;

    .line 204
    .line 205
    invoke-static {v0}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0}, Lokhttp3/x;->cipherSuite()Lokhttp3/k;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-virtual {v0}, Lokhttp3/k;->javaName()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-virtual {p1, v0}, Lv7/d0;->o(Ljava/lang/String;)Lv7/k;

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1, v1}, Lv7/d0;->writeByte(I)Lv7/k;

    .line 220
    .line 221
    .line 222
    iget-object v0, p0, Lokhttp3/d$c;->handshake:Lokhttp3/x;

    .line 223
    .line 224
    invoke-virtual {v0}, Lokhttp3/x;->peerCertificates()Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-direct {p0, p1, v0}, Lokhttp3/d$c;->writeCertList(Lv7/k;Ljava/util/List;)V

    .line 229
    .line 230
    .line 231
    iget-object v0, p0, Lokhttp3/d$c;->handshake:Lokhttp3/x;

    .line 232
    .line 233
    invoke-virtual {v0}, Lokhttp3/x;->localCertificates()Ljava/util/List;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-direct {p0, p1, v0}, Lokhttp3/d$c;->writeCertList(Lv7/k;Ljava/util/List;)V

    .line 238
    .line 239
    .line 240
    iget-object v0, p0, Lokhttp3/d$c;->handshake:Lokhttp3/x;

    .line 241
    .line 242
    invoke-virtual {v0}, Lokhttp3/x;->tlsVersion()Lokhttp3/l0;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-virtual {v0}, Lokhttp3/l0;->javaName()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-virtual {p1, v0}, Lv7/d0;->o(Ljava/lang/String;)Lv7/k;

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1, v1}, Lv7/d0;->writeByte(I)Lv7/k;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 254
    .line 255
    .line 256
    :cond_2
    invoke-virtual {p1}, Lv7/d0;->close()V

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    :goto_2
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 261
    :catchall_1
    move-exception v1

    .line 262
    invoke-static {p1, v0}, Lt5/a;->b(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 263
    .line 264
    .line 265
    throw v1
.end method
